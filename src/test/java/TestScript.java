import com.google.gson.Gson;
import org.junit.Test;
import pl.edu.pw.elka.wjanaszek.asist.domain.Script;
import pl.edu.pw.elka.wjanaszek.asist.parser.ParserImpl;

import static org.junit.Assert.assertEquals;

public class TestScript {
    private static final String sourceCode =
            "c = a * 3 + 2 - 5 : b\n" +
                    "a = list.test.property\n" +
                    "import mail\n" +
                    "a = 5 * 5 + 2\n" +
                    "print->(ddd, \"afasf\", afafs, 5)\n" +
                    "notify blablabla every 5 seconds \"ioioio\" with os_notification\n" +
                    "list all | grep \"test\"\n" +
                    "if ((a : 2) == 5) then \n" +
                    "    a = 10\n" +
                    "    print->(a)\n" +
                    "else\n" +
                    "    a = 50\n" +
                    "endif";
    private static final String parsedObject = "{\"statementList\":[{\"identifier\":\"c\",\"arithmeticOperation\":{\"multiplyExpressionList\":[{\"atomExpressionList\":[{\"identifier\":\"a\"},{\"value\":3}],\"operatorList\":[\"MULTIPLY\"]},{\"atomExpressionList\":[{\"value\":2}],\"operatorList\":[]},{\"atomExpressionList\":[{\"value\":5},{\"identifier\":\"b\"}],\"operatorList\":[\"DIVIDE\"]}],\"operatorList\":[\"ADD\",\"REMOVE\"]},\"type\":\"VARIABLE_OR_ASSIGNMENT\"},{\"identifier\":\"a\",\"objectProperties\":{\"propertiesList\":[\"list\",\"test\",\"property\"]},\"type\":\"VARIABLE_OR_ASSIGNMENT\"},{\"packageName\":\"mail\",\"type\":\"IMPORT_STATEMENT\"},{\"identifier\":\"a\",\"arithmeticOperation\":{\"multiplyExpressionList\":[{\"atomExpressionList\":[{\"value\":5},{\"value\":5}],\"operatorList\":[\"MULTIPLY\"]},{\"atomExpressionList\":[{\"value\":2}],\"operatorList\":[]}],\"operatorList\":[\"ADD\"]},\"type\":\"VARIABLE_OR_ASSIGNMENT\"},{\"identifier\":\"print\",\"params\":[\"ddd,\\\"afasf\\\",afafs,5\",\"\\\"afasf\\\",afafs,5\"],\"type\":\"FUNCTION_CALL\"},{\"identifier\":\"blablabla\",\"firedWhen\":{\"timeBased\":{\"type\":\"EVERY\",\"value\":5,\"pluralTimeType\":\"SECONDS\"},\"timePrecisely\":{},\"onEvent\":{}},\"message\":\"\\\"ioioio\\\"\",\"actionType\":\"os_notification\",\"type\":\"NOTIFICATION_STATEMENT\"},{\"param\":\"\\\"test\\\"\",\"type\":\"SEARCH_FUNCTION\"},{\"conditionExpression\":{\"simpleExpressionList\":[{\"termList\":[{\"factorList\":[{\"arithmeticOperation\":{\"multiplyExpressionList\":[{\"atomExpressionList\":[{\"identifier\":\"a\"},{\"value\":2}],\"operatorList\":[\"DIVIDE\"]}],\"operatorList\":[]}}]}]},{\"termList\":[{\"factorList\":[{\"integer\":5}]}]}],\"relativeOperatorList\":[\"EQUAL\"]},\"iFInstructionList\":[{\"variableOrAssignment\":{\"identifier\":\"a\",\"integerValue\":10,\"type\":\"VARIABLE_OR_ASSIGNMENT\"}},{\"functionCall\":{\"identifier\":\"print\",\"params\":[\"a\"],\"type\":\"FUNCTION_CALL\"}}],\"elseInstructionList\":[{\"variableOrAssignment\":{\"identifier\":\"a\",\"integerValue\":50,\"type\":\"VARIABLE_OR_ASSIGNMENT\"}}],\"type\":\"IF_STATEMENT\"}]}";

    @Test
    public void testParsedScript() {
        final Script result = new ParserImpl().parse(sourceCode);
        Gson gson = new Gson();
        final String json = gson.toJson(result);
        assertEquals(json, parsedObject);
    }
}

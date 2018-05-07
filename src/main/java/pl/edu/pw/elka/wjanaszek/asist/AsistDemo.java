package pl.edu.pw.elka.wjanaszek.asist;

import com.google.gson.Gson;
import pl.edu.pw.elka.wjanaszek.asist.domain.Script;
import pl.edu.pw.elka.wjanaszek.asist.parser.ParserImpl;

public class AsistDemo {
    private static final String sourceCode =
            "c = a * 3 + 2 - 5 : b\n" +
            "a = list.test.property\n" + "import mail\n" +
            "a = 5 * 5 + 2\n" +
            "print->(ddd, \"afasf\", afafs, 5)\n" +
            "notify blablabla every 5 seconds \"ioioio\" with os_notification\n" +
            "list all | grep \"test\"\n";

    public static void main(String[] args) {
        final Script result = new ParserImpl().parse(sourceCode);
        Gson gson = new Gson();
        final String json = gson.toJson(result);
        System.out.printf("code below: %n '%s' %n has been parsed to object: %n '%s'%n", sourceCode, json);
    }
}

package pl.edu.pw.elka.wjanaszek.asist.domain.variable;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import pl.edu.pw.elka.wjanaszek.asist.domain.Statement;
import pl.edu.pw.elka.wjanaszek.asist.domain.StatementType;
import pl.edu.pw.elka.wjanaszek.asist.domain.function.FunctionCall;
import pl.edu.pw.elka.wjanaszek.asist.domain.search.SearchFunction;

@Getter
@Setter
@Slf4j
@ToString
@EqualsAndHashCode
public class VariableOrAssignment extends Statement {
    private String identifier;
    private String variableValue;
    private String stringValue;
    private Integer integerValue;
    private Boolean booleanValue;
    private SearchFunction searchFunction;
    private ObjectProperties objectProperties;
    private FunctionCall functionCall;
    private ArithmeticOperation arithmeticOperation;

    public VariableOrAssignment(String identifier,
                                String variableValue,
                                String stringValue,
                                Integer integerValue,
                                Boolean booleanValue,
                                SearchFunction searchFunction,
                                ObjectProperties objectProperties,
                                FunctionCall functionCall,
                                ArithmeticOperation arithmeticOperation) {
        super(StatementType.VARIABLE_OR_ASSIGNMENT);
        this.identifier = identifier;
        this.variableValue = variableValue;
        this.stringValue = stringValue;
        this.integerValue = integerValue;
        this.booleanValue = booleanValue;
        this.searchFunction = searchFunction;
        this.objectProperties = objectProperties;
        this.functionCall = functionCall;
        this.arithmeticOperation = arithmeticOperation;
    }

    public VariableOrAssignment() {
        super(StatementType.VARIABLE_OR_ASSIGNMENT);
    }

    public VariableOrAssignment(String identifier) {
        super(StatementType.VARIABLE_OR_ASSIGNMENT);
        this.identifier = identifier;
    }
}

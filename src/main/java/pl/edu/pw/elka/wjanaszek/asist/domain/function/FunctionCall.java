package pl.edu.pw.elka.wjanaszek.asist.domain.function;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import pl.edu.pw.elka.wjanaszek.asist.domain.Statement;
import pl.edu.pw.elka.wjanaszek.asist.domain.StatementType;

import java.util.List;

@Getter
@Setter
@Slf4j
@ToString
@EqualsAndHashCode
public class FunctionCall extends Statement {
    private String identifier;
    private List<String> params;

    public FunctionCall(String identifier, List<String> params) {
        super(StatementType.FUNCTION_CALL);
        this.identifier = identifier;
        this.params = params;
    }
}

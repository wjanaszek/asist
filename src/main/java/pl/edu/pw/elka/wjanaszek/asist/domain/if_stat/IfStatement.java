package pl.edu.pw.elka.wjanaszek.asist.domain.if_stat;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import pl.edu.pw.elka.wjanaszek.asist.domain.Statement;
import pl.edu.pw.elka.wjanaszek.asist.domain.StatementType;

import java.util.List;

@Getter
@Setter
@Slf4j
@ToString
@EqualsAndHashCode
public class IfStatement extends Statement {
    private ConditionExpression conditionExpression;
    private List<Instruction> ifInstructionList;
    private List<Instruction> elseInstructionList;

    public IfStatement() {
        super(StatementType.IF_STATEMENT);
    }

    public IfStatement(ConditionExpression conditionExpression, List<Instruction> ifInstructionList, List<Instruction> elseInstructionList) {
        super(StatementType.IF_STATEMENT);
        this.conditionExpression = conditionExpression;
        this.ifInstructionList = ifInstructionList;
        this.elseInstructionList = elseInstructionList;
    }
}

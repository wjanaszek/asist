package pl.edu.pw.elka.wjanaszek.asist.domain.import_stat;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import pl.edu.pw.elka.wjanaszek.asist.domain.Statement;
import pl.edu.pw.elka.wjanaszek.asist.domain.StatementType;

@Getter
@Setter
@Slf4j
@ToString
@EqualsAndHashCode
public class ImportStatement extends Statement {
    private String packageName;

    public ImportStatement(String packageName) {
        super(StatementType.IMPORT_STATEMENT);
        this.packageName = packageName;
    }
}

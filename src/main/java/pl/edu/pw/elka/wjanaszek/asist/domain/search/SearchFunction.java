package pl.edu.pw.elka.wjanaszek.asist.domain.search;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import pl.edu.pw.elka.wjanaszek.asist.domain.Statement;
import pl.edu.pw.elka.wjanaszek.asist.domain.StatementType;

@Getter
@Setter
@Slf4j
@ToString
@EqualsAndHashCode
public class SearchFunction extends Statement {
    private String param;

    public SearchFunction(String param) {
        super(StatementType.SEARCH_FUNCTION);
        this.param = param;
    }
}

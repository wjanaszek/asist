package pl.edu.pw.elka.wjanaszek.asist.parser;

import pl.edu.pw.elka.wjanaszek.asist.domain.Script;

public interface Parser {
    Script parse(String code);
}

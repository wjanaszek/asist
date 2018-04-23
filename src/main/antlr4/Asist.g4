grammar Asist;

/*
 * Parser Rules
 */
script: statement+;
statement: importStatement | notificationStatement | variableOrAssignment | functionCall;

importStatement: IMPORT IDENTIFIER;

notificationStatement: NOTIFY IDENTIFIER;

variableOrAssignment: variable | variableAssignment;

variable: IDENTIFIER;

variableAssignment: IDENTIFIER '=' expression;

functionCall: FUNCTION;

expression: FUNCTION;

/*
 * Lexer Rules
 */
IMPORT: I M P O R T;
NOTIFY: N O T I F Y;
FUNCTION: F U N C T I O N;
IDENTIFIER: LETTER (LETTER | DIGIT | '_')*;
ID: LETTER (LETTER | DIGIT | SPECIAL_CHARACTER)*;
STRING: '"' (LETTER | .)*? '"' | '\'' (LETTER | .)*? '\'';
INTEGER_NUMBER: NON_ZERO_DIGIT DIGIT*;
BOOLEAN: 'true' | 'false';
SEARCH_FUNCTION: 'list all' ('| grep' PARAM)?;
PARAM: ID;

WHITESPACE: [ \t] -> skip;
LINE_COMMENT : '//' .*? NEW_LINE -> skip ;
COMMENT: '/*' .*? '*/' -> skip ;
NEW_LINE:   ('\r' | '\r'? '\n') -> skip;

fragment SPECIAL_CHARACTER: '<' | '>' | '=' | ':' | ';' | '{' | '}' | '[' | ']' | '(' | ')' | '+' | '-' | '*' | '\\'
    | ',' | '.' | '!' | '%' | '^' | '$' | '@';
fragment DIGIT: '0' | NON_ZERO_DIGIT;
fragment NON_ZERO_DIGIT: '1'..'9';
fragment LETTER: [a-zA-Z];
fragment A: ('a'|'A');
fragment B: ('b'|'B');
fragment C: ('c'|'C');
fragment D: ('d'|'D');
fragment E: ('e'|'E');
fragment F: ('f'|'F');
fragment G: ('g'|'G');
fragment H: ('h'|'H');
fragment I: ('i'|'I');
fragment J: ('j'|'J');
fragment K: ('k'|'K');
fragment L: ('l'|'L');
fragment M: ('m'|'M');
fragment N: ('n'|'N');
fragment O: ('o'|'O');
fragment P: ('p'|'P');
fragment Q: ('q'|'Q');
fragment R: ('r'|'R');
fragment S: ('s'|'S');
fragment T: ('t'|'T');
fragment U: ('u'|'U');
fragment V: ('v'|'V');
fragment W: ('w'|'W');
fragment X: ('x'|'X');
fragment Y: ('y'|'Y');
fragment Z: ('z'|'Z');

//grammar NeoJ;
//
//program: statement+ ;
//
//statement
//    :   ifStatement
//    |   whileStatement
//    |   forStatement
//    |   variableAssigment
//    |   expr
//    |   functionDefinition
//    ;
//
//ifStatement: IF '(' expr ')' block (ELSE (IF '(' expr ')')? block)* ;
//
//whileStatement: WHILE '(' expr ')' block ;
//
//forStatement: FOR '(' ID '<-' ID ')' block ;
//
//variableAssigment: ID op=('=' | '+=' | '*=' | '/=') expr ;
//
//functionDefinition: DEF ID '(' params* ')' (':' UNIT)? block;
//
//params: ID (',' ID)* ;
//
//block: '{' statement+ '}' ;
//
//expr
//    :   ID '(' exprList? ')'
//    |   ID '[' expr ']'
//    |   <assoc=right>expr '^' expr
//    |   '-' expr
//    |   '!' expr
//    |   expr op=('*' | '/') expr
//    |   expr op=('+' | '-') expr
//    |   expr op=('>' | '<' | '<=' | '>=') expr
//    |   expr op=('!=' | '==') expr
//    |   expr op=('and' | 'or') expr
//    |   ID
//    |   literal
//    |   '(' expr ')'
//    ;
//
//exprList: expr (',' expr)* ;
//
//literal
//    : number
//    | matrix
//    | STRING
//    | BOOLEAN_VALUE
//    ;
//
//matrix: '[' matrixRow ( ';' NEW_LINE? matrixRow)* ']';
//matrixRow: number (',' number)* ;
//number:     INT
//      |     FLOAT
//      ;
//
//DEF: D E F ;
//UNIT: U N I T ;
//IF: I F ;
//WHILE: W H I L E ;
//FOR: F O R ;
//ELSE: E L S E ;
//
//FLOAT
//    : INT '.' DIGIT*
//    | '-'? '.' DIGIT+
//    ;
//
//INT: '0' | '-'? NON_ZERO_DIGIT | '-'? NON_ZERO_DIGIT DIGIT+
//   ;
//
//ID: VALID_ID_LETTER (VALID_ID_LETTER | DIGIT | '_')* ;
//
//BOOLEAN_VALUE: 'true' | 'false' ;
//
//STRING
//    :   '"' (ESCAPED_CHAR | .)*? '"'
//    |   '\'' (ESCAPED_CHAR | .)*? '\''
//    ;
//
//WHITESPACE: [ \t] -> skip;
//
//LINE_COMMENT : '//' .*? NEW_LINE -> skip ;
//COMMENT: '/*' .*? '*/' -> skip ;
//NEW_LINE:   ('\r' | '\r'? '\n') -> skip;
//
//fragment VALID_ID_LETTER
//    :   ALPHA_CHAR
//    |   POLISH_SPECIAL_CHAR
//    ;
//
//fragment ESCAPED_CHAR
//    :   '\\"' | '\\\\' | '\\\''
//    ;
//
//fragment ALPHA_CHAR
//    :   [a-zA-Z]
//    ;
//
//fragment POLISH_SPECIAL_CHAR
//    :   '\u0104'..'\u0107'
//    |	'\u0118'
//    |   '\u0141'..'\u0144'
//    |   '\u00D3'..'\u00D4'
//    |   '\u015A'..'\u015B'
//    |   '\u0179'..'\u017C'
//    ;
//
//fragment DIGIT
//    : '0'
//    | NON_ZERO_DIGIT
//    ;
//
//fragment NON_ZERO_DIGIT
//    : '1'..'9'
//    ;
//
//
//fragment A:('a'|'A');
//fragment B:('b'|'B');
//fragment C:('c'|'C');
//fragment D:('d'|'D');
//fragment E:('e'|'E');
//fragment F:('f'|'F');
//fragment G:('g'|'G');
//fragment H:('h'|'H');
//fragment I:('i'|'I');
//fragment J:('j'|'J');
//fragment K:('k'|'K');
//fragment L:('l'|'L');
//fragment M:('m'|'M');
//fragment N:('n'|'N');
//fragment O:('o'|'O');
//fragment P:('p'|'P');
//fragment Q:('q'|'Q');
//fragment R:('r'|'R');
//fragment S:('s'|'S');
//fragment T:('t'|'T');
//fragment U:('u'|'U');
//fragment V:('v'|'V');
//fragment W:('w'|'W');
//fragment X:('x'|'X');
//fragment Y:('y'|'Y');
//fragment Z:('z'|'Z');
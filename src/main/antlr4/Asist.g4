grammar Asist;

/*
 * Parser Rules
 */
script: statement+;
statement: importStatement | notificationStatement | variableOrAssignment | functionCall | ifStatement | searchFunction;

// IMPORT
importStatement: IMPORT IDENTIFIER;

// NOTIFICATION
notificationStatement: NOTIFY IDENTIFIER firedWhen STRING 'with' actionType;
firedWhen: timeBased | timePrecisely | onEvent;
// time based
timeBased: ('every' | 'in') (singleTime | pluralTime);
singleTime: 'second' | 'minute' | 'hour';
pluralTime: INTEGER_NUMBER ('seconds' | 'minutes' | 'hours');
actionType: 'os_notification' | IDENTIFIER;
// time precisely
timePrecisely: 'on' TIME DATE?;
// on event
onEvent: 'when' IDENTIFIER+;

// VARIABLE OR ASSIGNMENT
variableOrAssignment: variable | variableAssignment;
variable: IDENTIFIER;
variableAssignment: IDENTIFIER '=' expression;
expression: assignVariable | STRING | INTEGER_NUMBER | booleanExpression | searchFunction | objectProperties
            | arithmeticOperation | functionCall;
assignVariable: IDENTIFIER;
booleanExpression: 'true' | 'false';
searchFunction: SEARCH_FUNCTION ('| grep' STRING)?;
objectProperties: OBJECT_PROPERTIES;
arithmeticOperation: additionExpression;
/* Addition and subtraction have the lowest precedence. */
additionExpression: multiplyExpression ('+' multiplyExpression | '-' multiplyExpression)*;
/* Multiplication and division have a higher precedence. */
multiplyExpression: atomExpression ('*' atomExpression | ':' atomExpression)*;
atomExpression: INTEGER_NUMBER | IDENTIFIER;

// FUNCTION CALL
functionCall: IDENTIFIER '->' '(' params? ')';
params: 'all' | IDENTIFIER+ | INTEGER_NUMBER+ | STRING+;

// IF/ELSE STATEMENT
ifStatement: 'if (' conditionExpression ') then' instructions ('else' instructions)? 'endif';
conditionExpression: simpleExpression (RELATIVE_OPERATOR simpleExpression)*;
instructions: (searchFunction | variableOrAssignment | ifStatement | notificationStatement | functionCall)+;
simpleExpression: term ('or' term)*;
term: factor ('and' factor)*;
factor: variable | '(' arithmeticOperation ')' | 'not' factor | INTEGER_NUMBER | objectProperties;

/*
 * Lexer Rules
 */
IMPORT: I M P O R T;
NOTIFY: N O T I F Y;
IDENTIFIER: LETTER (LETTER | DIGIT | '_')*;
SEARCH_FUNCTION: 'list all';
STRING: '"' (LETTER | .)*? '"' | '\'' (LETTER | .)*? '\'';
INTEGER_NUMBER: NON_ZERO_DIGIT DIGIT*;
HOUR: DIGIT DIGIT;
MINUTE: DIGIT DIGIT;
DAY: DIGIT DIGIT;
MONTH: DIGIT DIGIT;
YEAR: DIGIT DIGIT DIGIT DIGIT;
BOOLEAN: 'true' | 'false';
OBJECT_PROPERTIES: IDENTIFIER '.' IDENTIFIER ('.' IDENTIFIER)*;
TIME: HOUR '/' MINUTE;
DATE: DAY '/' MONTH '/' YEAR;

RELATIVE_OPERATOR: '==' | '<' | '>' | '<=' | '!=' | '>=';
WHITESPACE: [ \t] -> skip;
LINE_COMMENT : '//' .*? NEW_LINE -> skip;
COMMENT: '/*' .*? '*/' -> skip;
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
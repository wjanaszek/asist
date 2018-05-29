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
timeBased: (every | in) (singleTime | pluralTime);
singleTime: second | minute | hour;
pluralTime: INTEGER_NUMBER (seconds | minutes | hours);
actionType: 'os_notification' | IDENTIFIER;
// time precisely
timePrecisely: 'on' TIME DATE?;
// on event
onEvent: 'when' IDENTIFIER+;
every: 'every';
in: 'in';
second: 'second';
seconds: 'seconds';
minute: 'minute';
minutes: 'minutes';
hour: 'hour';
hours: 'hours';

// VARIABLE OR ASSIGNMENT
variableOrAssignment: variable | variableAssignment;
variable: IDENTIFIER;
variableAssignment: IDENTIFIER '=' expression;
expression: STRING | INTEGER_NUMBER | assignVariable | booleanExpression | searchFunction | objectProperties
            | arithmeticOperation | functionCall;
assignVariable: IDENTIFIER;
booleanExpression: TRUE | FALSE;

searchFunction: SEARCH_FUNCTION ('| grep' STRING)?;
objectProperties: OBJECT_PROPERTIES;
arithmeticOperation: additionExpression;
/* Addition and subtraction have the lowest precedence. */
additionExpression: multiplyExpression (ADDITION_OPERATOR multiplyExpression)*;
/* Multiplication and division have a higher precedence. */
multiplyExpression: atomExpression (MULTIPLICATION_OPERATOR atomExpression)*;
atomExpression: INTEGER_NUMBER | IDENTIFIER;

// FUNCTION CALL
functionCall: IDENTIFIER '->' '(' params? ')';
params: ALL | (IDENTIFIER | INTEGER_NUMBER | STRING)*;

// IF/ELSE STATEMENT
ifStatement: 'if (' conditionExpression ') then' ifInstructions ('else' elseInstructions)? 'endif';
ifInstructions: instruction+;
elseInstructions: instruction+;
instruction: searchFunction | variableOrAssignment | ifStatement | notificationStatement | functionCall;
conditionExpression: term ('or' term)*;
term: factor ('and' factor)*;
factor: relativeFactor | notVariable | variable | '(' arithmeticOperation ')' | INTEGER_NUMBER | objectProperties;
relativeFactor: relativeArithmeticArithmetic | relativeVariableVariable | relativeIntegerInteger | relativeArithmeticInteger | relativeArithmeticVariable
    | relativeVariableArithmetic | relativeVariableInteger | relativeIntegerVariable | relativeIntegerArithmetic;
relativeArithmeticArithmetic: '(' arithmeticOperation ')' RELATIVE_OPERATOR '(' arithmeticOperation ')';
relativeVariableVariable: variable RELATIVE_OPERATOR variable;
relativeIntegerInteger: INTEGER_NUMBER RELATIVE_OPERATOR INTEGER_NUMBER;
relativeArithmeticInteger: '(' arithmeticOperation ')' RELATIVE_OPERATOR INTEGER_NUMBER;
relativeArithmeticVariable: '(' arithmeticOperation ')' RELATIVE_OPERATOR variable;
relativeVariableArithmetic: variable RELATIVE_OPERATOR '(' arithmeticOperation ')';
relativeVariableInteger: variable RELATIVE_OPERATOR INTEGER_NUMBER;
relativeIntegerVariable: INTEGER_NUMBER RELATIVE_OPERATOR variable;
relativeIntegerArithmetic: INTEGER_NUMBER RELATIVE_OPERATOR '(' arithmeticOperation ')';
notVariable: 'not' variable;

/*
 * Lexer Rules
 */
TRUE: T R U E;
FALSE: F A L S E;
ALL: A L L;
IMPORT: I M P O R T;
NOTIFY: N O T I F Y;
IDENTIFIER: LETTER (LETTER | DIGIT | '_')*;
SEARCH_FUNCTION: 'list all';
STRING: '"' (LETTER | .)*? '"' | '\'' (LETTER | .)*? '\'';
INTEGER_NUMBER: NON_ZERO_DIGIT DIGIT* | DIGIT;
HOUR: DIGIT DIGIT;
MINUTE: DIGIT DIGIT;
DAY: DIGIT DIGIT;
MONTH: DIGIT DIGIT;
YEAR: DIGIT DIGIT DIGIT DIGIT;
BOOLEAN: 'true' | 'false';
OBJECT_PROPERTIES: IDENTIFIER '.' IDENTIFIER ('.' IDENTIFIER)*;
TIME: HOUR '/' MINUTE;
DATE: DAY '/' MONTH '/' YEAR;

ADDITION_OPERATOR: '+' | '-';
MULTIPLICATION_OPERATOR: '*' | ':';

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
lexer grammar MinCamlLexer;

@header {
package org.komamitsu.mincaml;
}

fragment DIGIT: [0-9];
fragment LOWER: [a-z];
fragment UPPER: [A-Z];

SPACE: (' '|'\t'|'\n'|'\r') -> skip;
LPAREN: '(';
RPAREN: ')';
BOOL: ('true'|'false');
NOT: 'not';
INT: DIGIT+;
FLOAT: DIGIT+ ('.' DIGIT*)? ([eE] [+-]? DIGIT+)?;
MINUS: '-';
PLUS: '+';
MINUS_DOT: '-.';
PLUS_DOT: '+.';
AST_DOT: '*.';
SLASH_DOT: '/.';
EQUAL: '=';
LESS_GREATER: '<>';
LESS_EQUAL: '<=';
GREATER_EQUAL: '>=';
LESS: '<';
GREATER: '>';
IF: 'if';
THEN: 'then';
ELSE: 'else';
LET: 'let';
IN: 'in';
REC: 'rec';
COMMA: ',';
IDENT_UNIT: '_';
ARRAY_CREATE: ('Array.create'|'Array.make');
DOT: '.';
LESS_MINUS: '<-';
SEMICOLON: ';';
IDENT: LOWER (DIGIT|LOWER|UPPER|'_')*;
COMMENT: '(*' .*? '*)' -> skip;

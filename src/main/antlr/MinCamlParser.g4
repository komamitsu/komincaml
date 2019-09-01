parser grammar MinCamlParser;

@header {
package org.komamitsu.mincaml;
}

options { tokenVocab=MinCamlLexer; }

simpleExp /* caml2html: parser_simple */
    : LPAREN exp RPAREN                 # Block
    | LPAREN RPAREN                     # Unit
    | BOOL                              # Bool
    | INT                               # Int
    | FLOAT                             # Float
    | IDENT                             # Ident
    | simpleExp DOT LPAREN exp RPAREN   # ArrayGet
    ;

exp
    : simpleExp                         # SimpleExpression
    | NOT exp                           # Not
    | MINUS exp                         # Neg
    | exp PLUS exp                      # Add
    | exp MINUS exp                     # Sub
    | exp EQUAL exp                     # Eq
    | exp LESS_GREATER exp              # LessGreater
    | exp LESS exp                      # Less
    | exp GREATER exp                   # Greater
    | exp LESS_EQUAL exp                # LessEq
    | exp GREATER_EQUAL exp             # GreaterEq
    | IF exp THEN exp ELSE exp          # If
    | MINUS_DOT exp                     # FNeg
    | exp PLUS_DOT exp                  # FAdd
    | exp MINUS_DOT exp                 # FSub
    | exp AST_DOT exp                   # FMul
    | exp SLASH_DOT exp                 # FDiv
    | varname simpleExp+                # App
    | exp COMMA exp                     # Elems
    | exp SEMICOLON exp                 # SeqExpression
    | ARRAY_CREATE simpleExp simpleExp  # ArrayCreate
    | LET IDENT EQUAL exp IN exp        # Let
    | LET REC varname IDENT+ EQUAL exp IN exp                 # LetRec
    | simpleExp DOT LPAREN exp RPAREN LESS_MINUS exp          # ArrayPut
    | LET LPAREN IDENT (COMMA IDENT)+ RPAREN EQUAL exp IN exp # LetTuple
    ;

varname
    : IDENT
    ;
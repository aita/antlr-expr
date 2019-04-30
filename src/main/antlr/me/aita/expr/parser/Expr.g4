grammar Expr;

@header {
package me.aita.expr.parser;
}

prog: expr;
expr: term (('+'|'-') term)*;
term: factor (('*'|'/') factor)*;
factor: INT
    | '(' expr ')'
    ;
INT     : [0-9]+ ;
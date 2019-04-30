package me.aita.expr

import me.aita.expr.parser.ExprLexer
import me.aita.expr.parser.ExprParser
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream

fun main(args: Array<String>) {
    val input = ANTLRInputStream("3+2*4")
    val lexer = ExprLexer(input)
    val stream = CommonTokenStream(lexer)
    val parser = ExprParser(stream)

    val expr = parser.expr()
    println(expr.toStringTree());
}
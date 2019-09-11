package org.komamitsu.mincaml

import org.graalvm.polyglot.Context
import org.graalvm.polyglot.Source
import java.io.ByteArrayInputStream
import java.io.InputStreamReader

fun main() {
    val MIN_CAML = "mincaml"

    val s = "let rec f x y = x + y in f 4 2"

    val source = Source.newBuilder(
        MIN_CAML,
        InputStreamReader(ByteArrayInputStream(s.toByteArray())), "test"
    ).build()

    val context = Context.newBuilder(MIN_CAML)
        .`in`(System.`in`)
        .out(System.out)
        .build()
    val result = context.eval(source)
    println(result)
}

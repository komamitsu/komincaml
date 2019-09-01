package org.komamitsu.mincaml

import java.util.concurrent.atomic.AtomicReference

sealed class Type {
    abstract val signature: String

    sealed class Primitive(private val signatureStr: String) : Type() {
        override val signature: String
            get() = signatureStr

        object Bool : Primitive("b")
        object Float : Primitive("d")
        object Int : Primitive("i")
        object Unit : Primitive("u")
    }

    data class Array(val type: Type) : Type() {
        override val signature: String
            get() = "a"
    }

    data class Tuple(val types: List<Type>) : Type() {
        override val signature: String
            get() = "t"
    }

    data class Var(val typeContainer: AtomicReference<Type>) : Type() {
        constructor(): this(AtomicReference())

        var type: Type?
            get() = typeContainer.get()
            set(value) = typeContainer.set(value)

        override val signature: String
            get() = throw IllegalStateException("This method shouldn't be called")
    }

    data class Fun(val args: List<Type>, val result: Type) : Type() {
        override val signature: String
            get() = "f"
    }
}

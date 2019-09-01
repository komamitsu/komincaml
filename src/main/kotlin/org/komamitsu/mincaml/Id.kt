package org.komamitsu.mincaml

import java.util.concurrent.atomic.AtomicLong

class Id(val name: String) {
    companion object {
        private val counter = AtomicLong()

        fun gentmp(type: Type): Id {
            return Id("T${type.signature}${counter.getAndIncrement()}")
        }
    }

    override fun toString(): String {
        return "Id(name='$name')"
    }
}

class IdWithType(val id: Id, val type: Type) {
    override fun toString(): String {
        return "IdWithType(id=$id, type=$type)"
    }
}

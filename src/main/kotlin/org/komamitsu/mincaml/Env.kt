package org.komamitsu.mincaml

class Env : HashMap<Id, Type>() {
    internal fun addList(xs: List<IdWithType>): Env {
        for (x in xs) {
            put(x.id, x.type)
        }
        return this
    }

    internal fun updateValue(f: (Type) -> Type) {
        for (entry in entries) {
            put(entry.key, f(entry.value))
        }
    }
}

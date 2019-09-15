package org.komamitsu.mincaml.truffle

import java.util.ArrayList

import com.oracle.truffle.api.RootCallTarget
import com.oracle.truffle.api.interop.TruffleObject

class KMCFunctionRegistry(private val language: KMCLanguage) {
    private val functionsObject = FunctionsObject()

    /**
     * Returns the sorted list of all functions, for printing purposes only.
     */
    val functions: List<KMCFunction>
        get() {
            val result = ArrayList(functionsObject.functions.values)
            result.sortWith(Comparator { f1, f2 -> f1.toString().compareTo(f2.toString()) })
            return result
        }

    /**
     * Returns the canonical [KMCFunction] object for the given name. If it does not exist yet,
     * it is created.
     */
    fun lookup(name: String, createIfNotPresent: Boolean): KMCFunction? {
        var result = functionsObject.functions[name]
        if (result == null && createIfNotPresent) {
            result = KMCFunction(language, name)
            functionsObject.functions[name] = result
        }
        return result
    }

    /**
     * Associates the [KMCFunction] with the given name with the given implementation root
     * node. If the function did not exist before, it defines the function. If the function existed
     * before, it redefines the function and the old implementation is discarded.
     */
    fun register(name: String, callTarget: RootCallTarget): KMCFunction {
        val function = lookup(name, true)
        function!!.callTarget = callTarget
        return function
    }

    fun register(newFunctions: Map<String, RootCallTarget>) {
        for ((key, value) in newFunctions) {
            register(key, value)
        }
    }

    fun getFunction(name: String): KMCFunction? {
        return functionsObject.functions[name]
    }

    fun getFunctionsObject(): TruffleObject {
        return functionsObject
    }
}

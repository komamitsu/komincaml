package org.komamitsu.mincaml.truffle

import com.oracle.truffle.api.CompilerDirectives
import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.InvalidArrayIndexException
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.library.ExportLibrary
import com.oracle.truffle.api.library.ExportMessage

@ExportLibrary(InteropLibrary::class)
internal class FunctionsObject : TruffleObject {

    val functions = mutableMapOf<String, KMCFunction>()

    @ExportMessage
    fun hasMembers(): Boolean {
        return true
    }

    @ExportMessage
    @TruffleBoundary
    fun readMember(member: String): KMCFunction? {
        return functions[member]
    }

    @ExportMessage
    @TruffleBoundary
    fun isMemberReadable(member: String): Boolean {
        return functions.containsKey(member)
    }

    @ExportMessage
    @TruffleBoundary
    fun getMembers(includeInternal: Boolean): Any {
        return FunctionNamesObject(functions.keys.toTypedArray())
    }

    @ExportLibrary(InteropLibrary::class)
    internal class FunctionNamesObject(private val names: Array<Any>) : TruffleObject {

        val arraySize: Long
            @ExportMessage
            get() = names.size.toLong()

        @ExportMessage
        fun hasArrayElements(): Boolean {
            return true
        }

        @ExportMessage
        fun isArrayElementReadable(index: Long): Boolean {
            return index >= 0 && index < names.size
        }

        @ExportMessage
        @Throws(InvalidArrayIndexException::class)
        fun readArrayElement(index: Long): Any {
            if (!isArrayElementReadable(index)) {
                CompilerDirectives.transferToInterpreter()
                throw InvalidArrayIndexException.create(index)
            }
            return names[index.toInt()]
        }
    }

    companion object {

        fun isInstance(obj: TruffleObject): Boolean {
            return obj is FunctionsObject
        }
    }
}

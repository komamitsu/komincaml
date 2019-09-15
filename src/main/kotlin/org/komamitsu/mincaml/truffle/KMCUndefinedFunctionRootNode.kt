package org.komamitsu.mincaml.truffle

import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.frame.VirtualFrame

class KMCUndefinedFunctionRootNode(language: KMCLanguage, name: String) : KMCRootNode(language, FrameDescriptor(), KMCNodeInteger(0)) {
    override fun execute(frame: VirtualFrame): Any {
        throw IllegalStateException("Undefiled function: $name")
    }
}

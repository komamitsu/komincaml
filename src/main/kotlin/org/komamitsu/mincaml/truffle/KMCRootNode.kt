package org.komamitsu.mincaml.truffle

import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.NodeInfo
import com.oracle.truffle.api.nodes.RootNode

@NodeInfo(language = "MinCaml", description = "The root of all MinCaml execution trees")
class KMCRootNode(
    language: KMCLanguage,
    frameDescriptor: FrameDescriptor,
    @field:Child private var bodyNode: KMCNode
) : RootNode(language, frameDescriptor) {

    override fun execute(frame: VirtualFrame): Any {
        assert(lookupContextReference(KMCLanguage::class.java).get() != null)
        return bodyNode.executeGeneric(frame)
    }
}
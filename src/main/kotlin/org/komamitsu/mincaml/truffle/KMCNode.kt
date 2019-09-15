package org.komamitsu.mincaml.truffle

import com.oracle.truffle.api.dsl.*
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.nodes.Node
import com.oracle.truffle.api.nodes.NodeInfo

@TypeSystemReference(KMCTypes::class)
@NodeInfo(language = "MinCaml", description = "The abstract base node for all MinCaml statements")
abstract class KMCNode : Node() {
    abstract fun executeGeneric(frame: VirtualFrame): Any

    open fun executeLong(frame: VirtualFrame): Long {
        return KMCTypesGen.expectLong(executeGeneric(frame))
    }
}

class KMCNodeInteger(val value: Long) : KMCNode() {
    override fun executeLong(frame: VirtualFrame): Long {
        return value
    }

    override fun executeGeneric(frame: VirtualFrame): Any {
        return value
    }
}

@NodeChildren(NodeChild("left"), NodeChild("right"))
abstract class KMCBinaryNode : KMCNode()

@GenerateNodeFactory
@NodeInfo(shortName = "+")
abstract class KMCAddNode : KMCBinaryNode() {
    @Specialization
    fun add(left: Long, right: Long): Long {
        return Math.addExact(left, right)
    }
}



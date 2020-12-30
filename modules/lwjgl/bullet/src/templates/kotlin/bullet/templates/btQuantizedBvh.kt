/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btQuantizedBvh = "BTQuantizedBvh".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "QuantizedBvhNode_new",
        "",

        void()
    )

    int(
        "QuantizedBvhNode_getEscapeIndex",
        "",

        opaque_p("obj", "")
    )

    int(
        "QuantizedBvhNode_getEscapeIndexOrTriangleIndex",
        "",

        opaque_p("obj", "")
    )

    int(
        "QuantizedBvhNode_getPartId",
        "",

        opaque_p("obj", "")
    )

    unsigned_short[3](
        "QuantizedBvhNode_getQuantizedAabbMax",
        "",

        opaque_p("obj", "")
    )

    unsigned_short[3](
        "QuantizedBvhNode_getQuantizedAabbMin",
        "",

        opaque_p("obj", "")
    )

    int(
        "QuantizedBvhNode_getTriangleIndex",
        "",

        opaque_p("obj", "")
    )

    bool(
        "QuantizedBvhNode_isLeafNode",
        "",

        opaque_p("obj", "")
    )

    void(
        "QuantizedBvhNode_setEscapeIndexOrTriangleIndex",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "QuantizedBvhNode_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "OptimizedBvhNode_new",
        "",

        void()
    )

    void(
        "OptimizedBvhNode_getAabbMaxOrg",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "OptimizedBvhNode_getAabbMinOrg",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    int(
        "OptimizedBvhNode_getEscapeIndex",
        "",

        opaque_p("obj", "")
    )

    int(
        "OptimizedBvhNode_getSubPart",
        "",

        opaque_p("obj", "")
    )

    int(
        "OptimizedBvhNode_getTriangleIndex",
        "",

        opaque_p("obj", "")
    )

    void(
        "OptimizedBvhNode_setAabbMaxOrg",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "OptimizedBvhNode_setAabbMinOrg",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "OptimizedBvhNode_setEscapeIndex",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "OptimizedBvhNode_setSubPart",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "OptimizedBvhNode_setTriangleIndex",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "OptimizedBvhNode_delete",
        "",

        opaque_p("obj", "")
    )

    void(
        "NodeOverlapCallback_processNode",
        "",

        opaque_p("obj", ""),
        int("subPart", ""),
        int("triangleIndex", "")
    )

    void(
        "NodeOverlapCallback_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "QuantizedBvh_new",
        "",

        void()
    )

    void(
        "QuantizedBvh_buildInternal",
        "",

        opaque_p("obj", "")
    )

    unsigned_int(
        "QuantizedBvh_calculateSerializeBufferSize",
        "",

        opaque_p("obj", "")
    )

    int(
        "QuantizedBvh_calculateSerializeBufferSizeNew",
        "",

        opaque_p("obj", "")
    )

    void(
        "QuantizedBvh_deSerializeDouble",
        "",

        opaque_p("obj", ""),
        opaque_p("quantizedBvhDoubleData", "")
    )

    void(
        "QuantizedBvh_deSerializeFloat",
        "",

        opaque_p("obj", ""),
        opaque_p("quantizedBvhFloatData", "")
    )

    opaque_p(
        "QuantizedBvh_deSerializeInPlace",
        "",

        opaque_p("i_alignedDataBuffer", ""),
        unsigned_int("i_dataBufferSize", ""),
        bool("i_swapEndian", "")
    )

    unsigned_int(
        "QuantizedBvh_getAlignmentSerializationPadding",
        "",

        void()
    )

    opaque_p(
        "QuantizedBvh_getLeafNodeArray",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "QuantizedBvh_getQuantizedNodeArray",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "QuantizedBvh_getSubtreeInfoArray",
        "",

        opaque_p("obj", "")
    )

    bool(
        "QuantizedBvh_isQuantized",
        "",

        opaque_p("obj", "")
    )

    void(
        "QuantizedBvh_quantize",
        "",

        opaque_p("obj", ""),
        Check(3)..unsigned_short.p("out", ""),
        btVector3.const.p("point", ""),
        int("isMax", "")
    )

    void(
        "QuantizedBvh_quantizeWithClamp",
        "",

        opaque_p("obj", ""),
        Check(3)..unsigned_short.p("out", ""),
        btVector3.const.p("point2", ""),
        int("isMax", "")
    )

    void(
        "QuantizedBvh_reportAabbOverlappingNodex",
        "",

        opaque_p("obj", ""),
        opaque_p("nodeCallback", ""),
        btVector3.const.p("aabbMin", ""),
        btVector3.const.p("aabbMax", "")
    )

    void(
        "QuantizedBvh_reportBoxCastOverlappingNodex",
        "",

        opaque_p("obj", ""),
        opaque_p("nodeCallback", ""),
        btVector3.const.p("raySource", ""),
        btVector3.const.p("rayTarget", ""),
        btVector3.const.p("aabbMin", ""),
        btVector3.const.p("aabbMax", "")
    )

    void(
        "QuantizedBvh_reportRayOverlappingNodex",
        "",

        opaque_p("obj", ""),
        opaque_p("nodeCallback", ""),
        btVector3.const.p("raySource", ""),
        btVector3.const.p("rayTarget", "")
    )

    bool(
        "QuantizedBvh_serialize",
        "",

        opaque_p("obj", ""),
        opaque_p("o_alignedDataBuffer", ""),
        unsigned_int("i_dataBufferSize", ""),
        bool("i_swapEndian", "")
    )

    charUTF8.const.p(
        "QuantizedBvh_serialize2",
        "",

        opaque_p("obj", ""),
        opaque_p("dataBuffer", ""),
        opaque_p("serializer", "")
    )

    void(
        "QuantizedBvh_setQuantizationValues",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("bvhAabbMin", ""),
        btVector3.const.p("bvhAabbMax", ""),
        btScalar("quantizationMargin", "")
    )

    void(
        "QuantizedBvh_setTraversalMode",
        "",

        opaque_p("obj", ""),
        int("traversalMode", "")
    )

    void(
        "QuantizedBvh_unQuantize",
        "",

        opaque_p("obj", ""),
        Check(3)..unsigned_short.const.p("vecIn", ""),
        btVector3.p("value", "")
    )

    void(
        "QuantizedBvh_delete",
        "",

        opaque_p("obj", "")
    )

}
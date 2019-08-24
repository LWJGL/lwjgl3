/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btGImpactQuantizedBvh = "BTGImpactQuantizedBvh".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "BT_QUANTIZED_BVH_NODE_new",
        "",

        void()
    )

    int(
        "BT_QUANTIZED_BVH_NODE_getDataIndex",
        "",

        opaque_p("obj", "")
    )

    int(
        "BT_QUANTIZED_BVH_NODE_getEscapeIndex",
        "",

        opaque_p("obj", "")
    )

    int(
        "BT_QUANTIZED_BVH_NODE_getEscapeIndexOrDataIndex",
        "",

        opaque_p("obj", "")
    )

    unsigned_short[3](
        "BT_QUANTIZED_BVH_NODE_getQuantizedAabbMax",
        "",

        opaque_p("obj", "")
    )

    unsigned_short[3](
        "BT_QUANTIZED_BVH_NODE_getQuantizedAabbMin",
        "",

        opaque_p("obj", "")
    )

    bool(
        "BT_QUANTIZED_BVH_NODE_isLeafNode",
        "",

        opaque_p("obj", "")
    )

    void(
        "BT_QUANTIZED_BVH_NODE_setDataIndex",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    void(
        "BT_QUANTIZED_BVH_NODE_setEscapeIndex",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    void(
        "BT_QUANTIZED_BVH_NODE_setEscapeIndexOrDataIndex",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    bool(
        "BT_QUANTIZED_BVH_NODE_testQuantizedBoxOverlapp",
        "",

        opaque_p("obj", ""),
        Check(3)..unsigned_short.p("quantizedMin", ""),
        Check(3)..unsigned_short.p("quantizedMax", "")
    )

    void(
        "BT_QUANTIZED_BVH_NODE_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "GIM_QUANTIZED_BVH_NODE_ARRAY_new",
        "",

        void()
    )

    void(
        "GIM_QUANTIZED_BVH_NODE_ARRAY_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "QuantizedBvhTree_new",
        "",

        void()
    )

    void(
        "QuantizedBvhTree_build_tree",
        "",

        opaque_p("obj", ""),
        opaque_p("primitive_boxes", "")
    )

    void(
        "QuantizedBvhTree_clearNodes",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "QuantizedBvhTree_get_node_pointer",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    int(
        "QuantizedBvhTree_getEscapeNodeIndex",
        "",

        opaque_p("obj", ""),
        int("nodeindex", "")
    )

    int(
        "QuantizedBvhTree_getLeftNode",
        "",

        opaque_p("obj", ""),
        int("nodeindex", "")
    )

    void(
        "QuantizedBvhTree_getNodeBound",
        "",

        opaque_p("obj", ""),
        int("nodeindex", ""),
        opaque_p("bound", "")
    )

    int(
        "QuantizedBvhTree_getNodeCount",
        "",

        opaque_p("obj", "")
    )

    int(
        "QuantizedBvhTree_getNodeData",
        "",

        opaque_p("obj", ""),
        int("nodeindex", "")
    )

    int(
        "QuantizedBvhTree_getRightNode",
        "",

        opaque_p("obj", ""),
        int("nodeindex", "")
    )

    bool(
        "QuantizedBvhTree_isLeafNode",
        "",

        opaque_p("obj", ""),
        int("nodeindex", "")
    )

    void(
        "QuantizedBvhTree_quantizePoint",
        "",

        opaque_p("obj", ""),
        Check(3)..unsigned_short.p("quantizedpoint", ""),
        btVector3.const.p("point", "")
    )

    void(
        "QuantizedBvhTree_setNodeBound",
        "",

        opaque_p("obj", ""),
        int("nodeindex", ""),
        opaque_p("bound", "")
    )

    bool(
        "QuantizedBvhTree_testQuantizedBoxOverlapp",
        "",

        opaque_p("obj", ""),
        int("node_index", ""),
        Check(3)..unsigned_short.p("quantizedMin", ""),
        Check(3)..unsigned_short.p("quantizedMax", "")
    )

    void(
        "QuantizedBvhTree_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "GImpactQuantizedBvh_new",
        "",

        void()
    )

    opaque_p(
        "GImpactQuantizedBvh_new2",
        "",

        opaque_p("primitive_manager", "")
    )

    bool(
        "GImpactQuantizedBvh_boxQuery",
        "",

        opaque_p("obj", ""),
        opaque_p("box", ""),
        opaque_p("collided_results", "")
    )

    bool(
        "GImpactQuantizedBvh_boxQueryTrans",
        "",

        opaque_p("obj", ""),
        opaque_p("box", ""),
        btTransform.const.p("transform", ""),
        opaque_p("collided_results", "")
    )

    void(
        "GImpactQuantizedBvh_buildSet",
        "",

        opaque_p("obj", "")
    )

    void(
        "GImpactQuantizedBvh_find_collision",
        "",

        opaque_p("boxset1", ""),
        btTransform.const.p("trans1", ""),
        opaque_p("boxset2", ""),
        btTransform.const.p("trans2", ""),
        opaque_p("collision_pairs", "")
    )

    opaque_p(
        "GImpactQuantizedBvh_get_node_pointer",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    int(
        "GImpactQuantizedBvh_getEscapeNodeIndex",
        "",

        opaque_p("obj", ""),
        int("nodeindex", "")
    )

    opaque_p(
        "GImpactQuantizedBvh_getGlobalBox",
        "",

        opaque_p("obj", "")
    )

    int(
        "GImpactQuantizedBvh_getLeftNode",
        "",

        opaque_p("obj", ""),
        int("nodeindex", "")
    )

    void(
        "GImpactQuantizedBvh_getNodeBound",
        "",

        opaque_p("obj", ""),
        int("nodeindex", ""),
        opaque_p("bound", "")
    )

    int(
        "GImpactQuantizedBvh_getNodeCount",
        "",

        opaque_p("obj", "")
    )

    int(
        "GImpactQuantizedBvh_getNodeData",
        "",

        opaque_p("obj", ""),
        int("nodeindex", "")
    )

    void(
        "GImpactQuantizedBvh_getNodeTriangle",
        "",

        opaque_p("obj", ""),
        int("nodeindex", ""),
        opaque_p("triangle", "")
    )

    opaque_p(
        "GImpactQuantizedBvh_getPrimitiveManager",
        "",

        opaque_p("obj", "")
    )

    int(
        "GImpactQuantizedBvh_getRightNode",
        "",

        opaque_p("obj", ""),
        int("nodeindex", "")
    )

    bool(
        "GImpactQuantizedBvh_hasHierarchy",
        "",

        opaque_p("obj", "")
    )

    bool(
        "GImpactQuantizedBvh_isLeafNode",
        "",

        opaque_p("obj", ""),
        int("nodeindex", "")
    )

    bool(
        "GImpactQuantizedBvh_isTrimesh",
        "",

        opaque_p("obj", "")
    )

    bool(
        "GImpactQuantizedBvh_rayQuery",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("ray_dir", ""),
        btVector3.const.p("ray_origin", ""),
        opaque_p("collided_results", "")
    )

    void(
        "GImpactQuantizedBvh_setNodeBound",
        "",

        opaque_p("obj", ""),
        int("nodeindex", ""),
        opaque_p("bound", "")
    )

    void(
        "GImpactQuantizedBvh_setPrimitiveManager",
        "",

        opaque_p("obj", ""),
        opaque_p("primitive_manager", "")
    )

    void(
        "GImpactQuantizedBvh_update",
        "",

        opaque_p("obj", "")
    )

    void(
        "GImpactQuantizedBvh_delete",
        "",

        opaque_p("obj", "")
    )

}
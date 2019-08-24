/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btGImpactBvh = "BTGImpactBvh".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "GIM_PAIR_new",
        "",

        void()
    )

    opaque_p(
        "GIM_PAIR_new2",
        "",

        opaque_p("p", "")
    )

    opaque_p(
        "GIM_PAIR_new3",
        "",

        int("index1", ""),
        int("index2", "")
    )

    int(
        "GIM_PAIR_getIndex1",
        "",

        opaque_p("obj", "")
    )

    int(
        "GIM_PAIR_getIndex2",
        "",

        opaque_p("obj", "")
    )

    void(
        "GIM_PAIR_setIndex1",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "GIM_PAIR_setIndex2",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "GIM_PAIR_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "PairSet_new",
        "",

        void()
    )

    void(
        "PairSet_push_pair",
        "",

        opaque_p("obj", ""),
        int("index1", ""),
        int("index2", "")
    )

    void(
        "PairSet_push_pair_inv",
        "",

        opaque_p("obj", ""),
        int("index1", ""),
        int("index2", "")
    )

    void(
        "PairSet_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "GIM_BVH_DATA_new",
        "",

        void()
    )

    opaque_p(
        "GIM_BVH_DATA_getBound",
        "",

        opaque_p("obj", "")
    )

    int(
        "GIM_BVH_DATA_getData",
        "",

        opaque_p("obj", "")
    )

    void(
        "GIM_BVH_DATA_setBound",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "GIM_BVH_DATA_setData",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "GIM_BVH_DATA_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "GIM_BVH_TREE_NODE_new",
        "",

        void()
    )

    opaque_p(
        "GIM_BVH_TREE_NODE_getBound",
        "",

        opaque_p("obj", "")
    )

    int(
        "GIM_BVH_TREE_NODE_getDataIndex",
        "",

        opaque_p("obj", "")
    )

    int(
        "GIM_BVH_TREE_NODE_getEscapeIndex",
        "",

        opaque_p("obj", "")
    )

    bool(
        "GIM_BVH_TREE_NODE_isLeafNode",
        "",

        opaque_p("obj", "")
    )

    void(
        "GIM_BVH_TREE_NODE_setBound",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "GIM_BVH_TREE_NODE_setDataIndex",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    void(
        "GIM_BVH_TREE_NODE_setEscapeIndex",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    void(
        "GIM_BVH_TREE_NODE_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "GIM_BVH_DATA_ARRAY_new",
        "",

        void()
    )

    void(
        "GIM_BVH_DATA_ARRAY_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "GIM_BVH_TREE_NODE_ARRAY_new",
        "",

        void()
    )

    void(
        "GIM_BVH_TREE_NODE_ARRAY_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "BvhTree_new",
        "",

        void()
    )

    void(
        "BvhTree_build_tree",
        "",

        opaque_p("obj", ""),
        opaque_p("primitive_boxes", "")
    )

    void(
        "BvhTree_clearNodes",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "BvhTree_get_node_pointer",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "BvhTree_get_node_pointer2",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    int(
        "BvhTree_getEscapeNodeIndex",
        "",

        opaque_p("obj", ""),
        int("nodeindex", "")
    )

    int(
        "BvhTree_getLeftNode",
        "",

        opaque_p("obj", ""),
        int("nodeindex", "")
    )

    void(
        "BvhTree_getNodeBound",
        "",

        opaque_p("obj", ""),
        int("nodeindex", ""),
        opaque_p("bound", "")
    )

    int(
        "BvhTree_getNodeCount",
        "",

        opaque_p("obj", "")
    )

    int(
        "BvhTree_getNodeData",
        "",

        opaque_p("obj", ""),
        int("nodeindex", "")
    )

    int(
        "BvhTree_getRightNode",
        "",

        opaque_p("obj", ""),
        int("nodeindex", "")
    )

    bool(
        "BvhTree_isLeafNode",
        "",

        opaque_p("obj", ""),
        int("nodeindex", "")
    )

    void(
        "BvhTree_setNodeBound",
        "",

        opaque_p("obj", ""),
        int("nodeindex", ""),
        opaque_p("bound", "")
    )

    void(
        "BvhTree_delete",
        "",

        opaque_p("obj", "")
    )

    void(
        "PrimitiveManagerBase_get_primitive_box",
        "",

        opaque_p("obj", ""),
        int("prim_index", ""),
        opaque_p("primbox", "")
    )

    int(
        "PrimitiveManagerBase_get_primitive_count",
        "",

        opaque_p("obj", "")
    )

    void(
        "PrimitiveManagerBase_get_primitive_triangle",
        "",

        opaque_p("obj", ""),
        int("prim_index", ""),
        opaque_p("triangle", "")
    )

    bool(
        "PrimitiveManagerBase_is_trimesh",
        "",

        opaque_p("obj", "")
    )

    void(
        "PrimitiveManagerBase_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "GImpactBvh_new",
        "",

        void()
    )

    opaque_p(
        "GImpactBvh_new2",
        "",

        opaque_p("primitive_manager", "")
    )

    bool(
        "GImpactBvh_boxQuery",
        "",

        opaque_p("obj", ""),
        opaque_p("box", ""),
        opaque_p("collided_results", "")
    )

    bool(
        "GImpactBvh_boxQueryTrans",
        "",

        opaque_p("obj", ""),
        opaque_p("box", ""),
        btTransform.const.p("transform", ""),
        opaque_p("collided_results", "")
    )

    void(
        "GImpactBvh_buildSet",
        "",

        opaque_p("obj", "")
    )

    void(
        "GImpactBvh_find_collision",
        "",

        opaque_p("boxset1", ""),
        btTransform.const.p("trans1", ""),
        opaque_p("boxset2", ""),
        btTransform.const.p("trans2", ""),
        opaque_p("collision_pairs", "")
    )

    opaque_p(
        "GImpactBvh_get_node_pointer",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    int(
        "GImpactBvh_getEscapeNodeIndex",
        "",

        opaque_p("obj", ""),
        int("nodeindex", "")
    )

    opaque_p(
        "GImpactBvh_getGlobalBox",
        "",

        opaque_p("obj", "")
    )

    int(
        "GImpactBvh_getLeftNode",
        "",

        opaque_p("obj", ""),
        int("nodeindex", "")
    )

    void(
        "GImpactBvh_getNodeBound",
        "",

        opaque_p("obj", ""),
        int("nodeindex", ""),
        opaque_p("bound", "")
    )

    int(
        "GImpactBvh_getNodeCount",
        "",

        opaque_p("obj", "")
    )

    int(
        "GImpactBvh_getNodeData",
        "",

        opaque_p("obj", ""),
        int("nodeindex", "")
    )

    void(
        "GImpactBvh_getNodeTriangle",
        "",

        opaque_p("obj", ""),
        int("nodeindex", ""),
        opaque_p("triangle", "")
    )

    opaque_p(
        "GImpactBvh_getPrimitiveManager",
        "",

        opaque_p("obj", "")
    )

    int(
        "GImpactBvh_getRightNode",
        "",

        opaque_p("obj", ""),
        int("nodeindex", "")
    )

    bool(
        "GImpactBvh_hasHierarchy",
        "",

        opaque_p("obj", "")
    )

    bool(
        "GImpactBvh_isLeafNode",
        "",

        opaque_p("obj", ""),
        int("nodeindex", "")
    )

    bool(
        "GImpactBvh_isTrimesh",
        "",

        opaque_p("obj", "")
    )

    bool(
        "GImpactBvh_rayQuery",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("ray_dir", ""),
        btVector3.const.p("ray_origin", ""),
        opaque_p("collided_results", "")
    )

    void(
        "GImpactBvh_setNodeBound",
        "",

        opaque_p("obj", ""),
        int("nodeindex", ""),
        opaque_p("bound", "")
    )

    void(
        "GImpactBvh_setPrimitiveManager",
        "",

        opaque_p("obj", ""),
        opaque_p("primitive_manager", "")
    )

    void(
        "GImpactBvh_update",
        "",

        opaque_p("obj", "")
    )

    void(
        "GImpactBvh_delete",
        "",

        opaque_p("obj", "")
    )

}
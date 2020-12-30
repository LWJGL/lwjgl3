/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class BTGImpactBvh {

    protected BTGImpactBvh() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GIM_PAIR_new                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_PAIR_new"),
            GIM_PAIR_new2                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_PAIR_new2"),
            GIM_PAIR_new3                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_PAIR_new3"),
            GIM_PAIR_getIndex1                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_PAIR_getIndex1"),
            GIM_PAIR_getIndex2                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_PAIR_getIndex2"),
            GIM_PAIR_setIndex1                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_PAIR_setIndex1"),
            GIM_PAIR_setIndex2                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_PAIR_setIndex2"),
            GIM_PAIR_delete                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_PAIR_delete"),
            PairSet_new                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btPairSet_new"),
            PairSet_push_pair                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btPairSet_push_pair"),
            PairSet_push_pair_inv                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btPairSet_push_pair_inv"),
            PairSet_delete                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btPairSet_delete"),
            GIM_BVH_DATA_new                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_BVH_DATA_new"),
            GIM_BVH_DATA_getBound                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_BVH_DATA_getBound"),
            GIM_BVH_DATA_getData                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_BVH_DATA_getData"),
            GIM_BVH_DATA_setBound                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_BVH_DATA_setBound"),
            GIM_BVH_DATA_setData                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_BVH_DATA_setData"),
            GIM_BVH_DATA_delete                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_BVH_DATA_delete"),
            GIM_BVH_TREE_NODE_new                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_BVH_TREE_NODE_new"),
            GIM_BVH_TREE_NODE_getBound                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_BVH_TREE_NODE_getBound"),
            GIM_BVH_TREE_NODE_getDataIndex              = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_BVH_TREE_NODE_getDataIndex"),
            GIM_BVH_TREE_NODE_getEscapeIndex            = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_BVH_TREE_NODE_getEscapeIndex"),
            GIM_BVH_TREE_NODE_isLeafNode                = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_BVH_TREE_NODE_isLeafNode"),
            GIM_BVH_TREE_NODE_setBound                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_BVH_TREE_NODE_setBound"),
            GIM_BVH_TREE_NODE_setDataIndex              = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_BVH_TREE_NODE_setDataIndex"),
            GIM_BVH_TREE_NODE_setEscapeIndex            = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_BVH_TREE_NODE_setEscapeIndex"),
            GIM_BVH_TREE_NODE_delete                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_BVH_TREE_NODE_delete"),
            GIM_BVH_DATA_ARRAY_new                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_BVH_DATA_ARRAY_new"),
            GIM_BVH_DATA_ARRAY_delete                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_BVH_DATA_ARRAY_delete"),
            GIM_BVH_TREE_NODE_ARRAY_new                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_BVH_TREE_NODE_ARRAY_new"),
            GIM_BVH_TREE_NODE_ARRAY_delete              = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_BVH_TREE_NODE_ARRAY_delete"),
            BvhTree_new                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTree_new"),
            BvhTree_build_tree                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTree_build_tree"),
            BvhTree_clearNodes                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTree_clearNodes"),
            BvhTree_get_node_pointer                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTree_get_node_pointer"),
            BvhTree_get_node_pointer2                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTree_get_node_pointer2"),
            BvhTree_getEscapeNodeIndex                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTree_getEscapeNodeIndex"),
            BvhTree_getLeftNode                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTree_getLeftNode"),
            BvhTree_getNodeBound                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTree_getNodeBound"),
            BvhTree_getNodeCount                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTree_getNodeCount"),
            BvhTree_getNodeData                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTree_getNodeData"),
            BvhTree_getRightNode                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTree_getRightNode"),
            BvhTree_isLeafNode                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTree_isLeafNode"),
            BvhTree_setNodeBound                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTree_setNodeBound"),
            BvhTree_delete                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btBvhTree_delete"),
            PrimitiveManagerBase_get_primitive_box      = apiGetFunctionAddress(LibBullet.getLibrary(), "btPrimitiveManagerBase_get_primitive_box"),
            PrimitiveManagerBase_get_primitive_count    = apiGetFunctionAddress(LibBullet.getLibrary(), "btPrimitiveManagerBase_get_primitive_count"),
            PrimitiveManagerBase_get_primitive_triangle = apiGetFunctionAddress(LibBullet.getLibrary(), "btPrimitiveManagerBase_get_primitive_triangle"),
            PrimitiveManagerBase_is_trimesh             = apiGetFunctionAddress(LibBullet.getLibrary(), "btPrimitiveManagerBase_is_trimesh"),
            PrimitiveManagerBase_delete                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btPrimitiveManagerBase_delete"),
            GImpactBvh_new                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_new"),
            GImpactBvh_new2                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_new2"),
            GImpactBvh_boxQuery                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_boxQuery"),
            GImpactBvh_boxQueryTrans                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_boxQueryTrans"),
            GImpactBvh_buildSet                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_buildSet"),
            GImpactBvh_find_collision                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_find_collision"),
            GImpactBvh_get_node_pointer                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_get_node_pointer"),
            GImpactBvh_getEscapeNodeIndex               = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_getEscapeNodeIndex"),
            GImpactBvh_getGlobalBox                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_getGlobalBox"),
            GImpactBvh_getLeftNode                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_getLeftNode"),
            GImpactBvh_getNodeBound                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_getNodeBound"),
            GImpactBvh_getNodeCount                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_getNodeCount"),
            GImpactBvh_getNodeData                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_getNodeData"),
            GImpactBvh_getNodeTriangle                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_getNodeTriangle"),
            GImpactBvh_getPrimitiveManager              = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_getPrimitiveManager"),
            GImpactBvh_getRightNode                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_getRightNode"),
            GImpactBvh_hasHierarchy                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_hasHierarchy"),
            GImpactBvh_isLeafNode                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_isLeafNode"),
            GImpactBvh_isTrimesh                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_isTrimesh"),
            GImpactBvh_rayQuery                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_rayQuery"),
            GImpactBvh_setNodeBound                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_setNodeBound"),
            GImpactBvh_setPrimitiveManager              = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_setPrimitiveManager"),
            GImpactBvh_update                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_update"),
            GImpactBvh_delete                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactBvh_delete");

    }

    // --- [ btGIM_PAIR_new ] ---

    @NativeType("void *")
    public static long btGIM_PAIR_new() {
        long __functionAddress = Functions.GIM_PAIR_new;
        return invokeP(__functionAddress);
    }

    // --- [ btGIM_PAIR_new2 ] ---

    @NativeType("void *")
    public static long btGIM_PAIR_new2(@NativeType("void *") long p) {
        long __functionAddress = Functions.GIM_PAIR_new2;
        if (CHECKS) {
            check(p);
        }
        return invokePP(p, __functionAddress);
    }

    // --- [ btGIM_PAIR_new3 ] ---

    @NativeType("void *")
    public static long btGIM_PAIR_new3(int index1, int index2) {
        long __functionAddress = Functions.GIM_PAIR_new3;
        return invokeP(index1, index2, __functionAddress);
    }

    // --- [ btGIM_PAIR_getIndex1 ] ---

    public static int btGIM_PAIR_getIndex1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GIM_PAIR_getIndex1;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGIM_PAIR_getIndex2 ] ---

    public static int btGIM_PAIR_getIndex2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GIM_PAIR_getIndex2;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGIM_PAIR_setIndex1 ] ---

    public static void btGIM_PAIR_setIndex1(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.GIM_PAIR_setIndex1;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGIM_PAIR_setIndex2 ] ---

    public static void btGIM_PAIR_setIndex2(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.GIM_PAIR_setIndex2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGIM_PAIR_delete ] ---

    public static void btGIM_PAIR_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GIM_PAIR_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btPairSet_new ] ---

    @NativeType("void *")
    public static long btPairSet_new() {
        long __functionAddress = Functions.PairSet_new;
        return invokeP(__functionAddress);
    }

    // --- [ btPairSet_push_pair ] ---

    public static void btPairSet_push_pair(@NativeType("void *") long obj, int index1, int index2) {
        long __functionAddress = Functions.PairSet_push_pair;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index1, index2, __functionAddress);
    }

    // --- [ btPairSet_push_pair_inv ] ---

    public static void btPairSet_push_pair_inv(@NativeType("void *") long obj, int index1, int index2) {
        long __functionAddress = Functions.PairSet_push_pair_inv;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index1, index2, __functionAddress);
    }

    // --- [ btPairSet_delete ] ---

    public static void btPairSet_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PairSet_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGIM_BVH_DATA_new ] ---

    @NativeType("void *")
    public static long btGIM_BVH_DATA_new() {
        long __functionAddress = Functions.GIM_BVH_DATA_new;
        return invokeP(__functionAddress);
    }

    // --- [ btGIM_BVH_DATA_getBound ] ---

    @NativeType("void *")
    public static long btGIM_BVH_DATA_getBound(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GIM_BVH_DATA_getBound;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btGIM_BVH_DATA_getData ] ---

    public static int btGIM_BVH_DATA_getData(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GIM_BVH_DATA_getData;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGIM_BVH_DATA_setBound ] ---

    public static void btGIM_BVH_DATA_setBound(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.GIM_BVH_DATA_setBound;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btGIM_BVH_DATA_setData ] ---

    public static void btGIM_BVH_DATA_setData(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.GIM_BVH_DATA_setData;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGIM_BVH_DATA_delete ] ---

    public static void btGIM_BVH_DATA_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GIM_BVH_DATA_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGIM_BVH_TREE_NODE_new ] ---

    @NativeType("void *")
    public static long btGIM_BVH_TREE_NODE_new() {
        long __functionAddress = Functions.GIM_BVH_TREE_NODE_new;
        return invokeP(__functionAddress);
    }

    // --- [ btGIM_BVH_TREE_NODE_getBound ] ---

    @NativeType("void *")
    public static long btGIM_BVH_TREE_NODE_getBound(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GIM_BVH_TREE_NODE_getBound;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btGIM_BVH_TREE_NODE_getDataIndex ] ---

    public static int btGIM_BVH_TREE_NODE_getDataIndex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GIM_BVH_TREE_NODE_getDataIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGIM_BVH_TREE_NODE_getEscapeIndex ] ---

    public static int btGIM_BVH_TREE_NODE_getEscapeIndex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GIM_BVH_TREE_NODE_getEscapeIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGIM_BVH_TREE_NODE_isLeafNode ] ---

    @NativeType("bool")
    public static boolean btGIM_BVH_TREE_NODE_isLeafNode(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GIM_BVH_TREE_NODE_isLeafNode;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btGIM_BVH_TREE_NODE_setBound ] ---

    public static void btGIM_BVH_TREE_NODE_setBound(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.GIM_BVH_TREE_NODE_setBound;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btGIM_BVH_TREE_NODE_setDataIndex ] ---

    public static void btGIM_BVH_TREE_NODE_setDataIndex(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.GIM_BVH_TREE_NODE_setDataIndex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, __functionAddress);
    }

    // --- [ btGIM_BVH_TREE_NODE_setEscapeIndex ] ---

    public static void btGIM_BVH_TREE_NODE_setEscapeIndex(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.GIM_BVH_TREE_NODE_setEscapeIndex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, __functionAddress);
    }

    // --- [ btGIM_BVH_TREE_NODE_delete ] ---

    public static void btGIM_BVH_TREE_NODE_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GIM_BVH_TREE_NODE_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGIM_BVH_DATA_ARRAY_new ] ---

    @NativeType("void *")
    public static long btGIM_BVH_DATA_ARRAY_new() {
        long __functionAddress = Functions.GIM_BVH_DATA_ARRAY_new;
        return invokeP(__functionAddress);
    }

    // --- [ btGIM_BVH_DATA_ARRAY_delete ] ---

    public static void btGIM_BVH_DATA_ARRAY_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GIM_BVH_DATA_ARRAY_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGIM_BVH_TREE_NODE_ARRAY_new ] ---

    @NativeType("void *")
    public static long btGIM_BVH_TREE_NODE_ARRAY_new() {
        long __functionAddress = Functions.GIM_BVH_TREE_NODE_ARRAY_new;
        return invokeP(__functionAddress);
    }

    // --- [ btGIM_BVH_TREE_NODE_ARRAY_delete ] ---

    public static void btGIM_BVH_TREE_NODE_ARRAY_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GIM_BVH_TREE_NODE_ARRAY_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btBvhTree_new ] ---

    @NativeType("void *")
    public static long btBvhTree_new() {
        long __functionAddress = Functions.BvhTree_new;
        return invokeP(__functionAddress);
    }

    // --- [ btBvhTree_build_tree ] ---

    public static void btBvhTree_build_tree(@NativeType("void *") long obj, @NativeType("void *") long primitive_boxes) {
        long __functionAddress = Functions.BvhTree_build_tree;
        if (CHECKS) {
            check(obj);
            check(primitive_boxes);
        }
        invokePPV(obj, primitive_boxes, __functionAddress);
    }

    // --- [ btBvhTree_clearNodes ] ---

    public static void btBvhTree_clearNodes(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BvhTree_clearNodes;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btBvhTree_get_node_pointer ] ---

    @NativeType("void *")
    public static long btBvhTree_get_node_pointer(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BvhTree_get_node_pointer;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btBvhTree_get_node_pointer2 ] ---

    @NativeType("void *")
    public static long btBvhTree_get_node_pointer2(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.BvhTree_get_node_pointer2;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btBvhTree_getEscapeNodeIndex ] ---

    public static int btBvhTree_getEscapeNodeIndex(@NativeType("void *") long obj, int nodeindex) {
        long __functionAddress = Functions.BvhTree_getEscapeNodeIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, nodeindex, __functionAddress);
    }

    // --- [ btBvhTree_getLeftNode ] ---

    public static int btBvhTree_getLeftNode(@NativeType("void *") long obj, int nodeindex) {
        long __functionAddress = Functions.BvhTree_getLeftNode;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, nodeindex, __functionAddress);
    }

    // --- [ btBvhTree_getNodeBound ] ---

    public static void btBvhTree_getNodeBound(@NativeType("void *") long obj, int nodeindex, @NativeType("void *") long bound) {
        long __functionAddress = Functions.BvhTree_getNodeBound;
        if (CHECKS) {
            check(obj);
            check(bound);
        }
        invokePPV(obj, nodeindex, bound, __functionAddress);
    }

    // --- [ btBvhTree_getNodeCount ] ---

    public static int btBvhTree_getNodeCount(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BvhTree_getNodeCount;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btBvhTree_getNodeData ] ---

    public static int btBvhTree_getNodeData(@NativeType("void *") long obj, int nodeindex) {
        long __functionAddress = Functions.BvhTree_getNodeData;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, nodeindex, __functionAddress);
    }

    // --- [ btBvhTree_getRightNode ] ---

    public static int btBvhTree_getRightNode(@NativeType("void *") long obj, int nodeindex) {
        long __functionAddress = Functions.BvhTree_getRightNode;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, nodeindex, __functionAddress);
    }

    // --- [ btBvhTree_isLeafNode ] ---

    @NativeType("bool")
    public static boolean btBvhTree_isLeafNode(@NativeType("void *") long obj, int nodeindex) {
        long __functionAddress = Functions.BvhTree_isLeafNode;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, nodeindex, __functionAddress);
    }

    // --- [ btBvhTree_setNodeBound ] ---

    public static void btBvhTree_setNodeBound(@NativeType("void *") long obj, int nodeindex, @NativeType("void *") long bound) {
        long __functionAddress = Functions.BvhTree_setNodeBound;
        if (CHECKS) {
            check(obj);
            check(bound);
        }
        invokePPV(obj, nodeindex, bound, __functionAddress);
    }

    // --- [ btBvhTree_delete ] ---

    public static void btBvhTree_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BvhTree_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btPrimitiveManagerBase_get_primitive_box ] ---

    public static void btPrimitiveManagerBase_get_primitive_box(@NativeType("void *") long obj, int prim_index, @NativeType("void *") long primbox) {
        long __functionAddress = Functions.PrimitiveManagerBase_get_primitive_box;
        if (CHECKS) {
            check(obj);
            check(primbox);
        }
        invokePPV(obj, prim_index, primbox, __functionAddress);
    }

    // --- [ btPrimitiveManagerBase_get_primitive_count ] ---

    public static int btPrimitiveManagerBase_get_primitive_count(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PrimitiveManagerBase_get_primitive_count;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btPrimitiveManagerBase_get_primitive_triangle ] ---

    public static void btPrimitiveManagerBase_get_primitive_triangle(@NativeType("void *") long obj, int prim_index, @NativeType("void *") long triangle) {
        long __functionAddress = Functions.PrimitiveManagerBase_get_primitive_triangle;
        if (CHECKS) {
            check(obj);
            check(triangle);
        }
        invokePPV(obj, prim_index, triangle, __functionAddress);
    }

    // --- [ btPrimitiveManagerBase_is_trimesh ] ---

    @NativeType("bool")
    public static boolean btPrimitiveManagerBase_is_trimesh(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PrimitiveManagerBase_is_trimesh;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btPrimitiveManagerBase_delete ] ---

    public static void btPrimitiveManagerBase_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PrimitiveManagerBase_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGImpactBvh_new ] ---

    @NativeType("void *")
    public static long btGImpactBvh_new() {
        long __functionAddress = Functions.GImpactBvh_new;
        return invokeP(__functionAddress);
    }

    // --- [ btGImpactBvh_new2 ] ---

    @NativeType("void *")
    public static long btGImpactBvh_new2(@NativeType("void *") long primitive_manager) {
        long __functionAddress = Functions.GImpactBvh_new2;
        if (CHECKS) {
            check(primitive_manager);
        }
        return invokePP(primitive_manager, __functionAddress);
    }

    // --- [ btGImpactBvh_boxQuery ] ---

    @NativeType("bool")
    public static boolean btGImpactBvh_boxQuery(@NativeType("void *") long obj, @NativeType("void *") long box, @NativeType("void *") long collided_results) {
        long __functionAddress = Functions.GImpactBvh_boxQuery;
        if (CHECKS) {
            check(obj);
            check(box);
            check(collided_results);
        }
        return invokePPPZ(obj, box, collided_results, __functionAddress);
    }

    // --- [ btGImpactBvh_boxQueryTrans ] ---

    public static boolean nbtGImpactBvh_boxQueryTrans(long obj, long box, long transform, long collided_results) {
        long __functionAddress = Functions.GImpactBvh_boxQueryTrans;
        if (CHECKS) {
            check(obj);
            check(box);
            check(collided_results);
        }
        return invokePPPPZ(obj, box, transform, collided_results, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btGImpactBvh_boxQueryTrans(@NativeType("void *") long obj, @NativeType("void *") long box, @NativeType("btTransform const *") BTTransform transform, @NativeType("void *") long collided_results) {
        return nbtGImpactBvh_boxQueryTrans(obj, box, transform.address(), collided_results);
    }

    // --- [ btGImpactBvh_buildSet ] ---

    public static void btGImpactBvh_buildSet(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactBvh_buildSet;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGImpactBvh_find_collision ] ---

    public static void nbtGImpactBvh_find_collision(long boxset1, long trans1, long boxset2, long trans2, long collision_pairs) {
        long __functionAddress = Functions.GImpactBvh_find_collision;
        if (CHECKS) {
            check(boxset1);
            check(boxset2);
            check(collision_pairs);
        }
        invokePPPPPV(boxset1, trans1, boxset2, trans2, collision_pairs, __functionAddress);
    }

    public static void btGImpactBvh_find_collision(@NativeType("void *") long boxset1, @NativeType("btTransform const *") BTTransform trans1, @NativeType("void *") long boxset2, @NativeType("btTransform const *") BTTransform trans2, @NativeType("void *") long collision_pairs) {
        nbtGImpactBvh_find_collision(boxset1, trans1.address(), boxset2, trans2.address(), collision_pairs);
    }

    // --- [ btGImpactBvh_get_node_pointer ] ---

    @NativeType("void *")
    public static long btGImpactBvh_get_node_pointer(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.GImpactBvh_get_node_pointer;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btGImpactBvh_getEscapeNodeIndex ] ---

    public static int btGImpactBvh_getEscapeNodeIndex(@NativeType("void *") long obj, int nodeindex) {
        long __functionAddress = Functions.GImpactBvh_getEscapeNodeIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, nodeindex, __functionAddress);
    }

    // --- [ btGImpactBvh_getGlobalBox ] ---

    @NativeType("void *")
    public static long btGImpactBvh_getGlobalBox(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactBvh_getGlobalBox;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btGImpactBvh_getLeftNode ] ---

    public static int btGImpactBvh_getLeftNode(@NativeType("void *") long obj, int nodeindex) {
        long __functionAddress = Functions.GImpactBvh_getLeftNode;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, nodeindex, __functionAddress);
    }

    // --- [ btGImpactBvh_getNodeBound ] ---

    public static void btGImpactBvh_getNodeBound(@NativeType("void *") long obj, int nodeindex, @NativeType("void *") long bound) {
        long __functionAddress = Functions.GImpactBvh_getNodeBound;
        if (CHECKS) {
            check(obj);
            check(bound);
        }
        invokePPV(obj, nodeindex, bound, __functionAddress);
    }

    // --- [ btGImpactBvh_getNodeCount ] ---

    public static int btGImpactBvh_getNodeCount(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactBvh_getNodeCount;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGImpactBvh_getNodeData ] ---

    public static int btGImpactBvh_getNodeData(@NativeType("void *") long obj, int nodeindex) {
        long __functionAddress = Functions.GImpactBvh_getNodeData;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, nodeindex, __functionAddress);
    }

    // --- [ btGImpactBvh_getNodeTriangle ] ---

    public static void btGImpactBvh_getNodeTriangle(@NativeType("void *") long obj, int nodeindex, @NativeType("void *") long triangle) {
        long __functionAddress = Functions.GImpactBvh_getNodeTriangle;
        if (CHECKS) {
            check(obj);
            check(triangle);
        }
        invokePPV(obj, nodeindex, triangle, __functionAddress);
    }

    // --- [ btGImpactBvh_getPrimitiveManager ] ---

    @NativeType("void *")
    public static long btGImpactBvh_getPrimitiveManager(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactBvh_getPrimitiveManager;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btGImpactBvh_getRightNode ] ---

    public static int btGImpactBvh_getRightNode(@NativeType("void *") long obj, int nodeindex) {
        long __functionAddress = Functions.GImpactBvh_getRightNode;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, nodeindex, __functionAddress);
    }

    // --- [ btGImpactBvh_hasHierarchy ] ---

    @NativeType("bool")
    public static boolean btGImpactBvh_hasHierarchy(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactBvh_hasHierarchy;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btGImpactBvh_isLeafNode ] ---

    @NativeType("bool")
    public static boolean btGImpactBvh_isLeafNode(@NativeType("void *") long obj, int nodeindex) {
        long __functionAddress = Functions.GImpactBvh_isLeafNode;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, nodeindex, __functionAddress);
    }

    // --- [ btGImpactBvh_isTrimesh ] ---

    @NativeType("bool")
    public static boolean btGImpactBvh_isTrimesh(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactBvh_isTrimesh;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btGImpactBvh_rayQuery ] ---

    public static boolean nbtGImpactBvh_rayQuery(long obj, long ray_dir, long ray_origin, long collided_results) {
        long __functionAddress = Functions.GImpactBvh_rayQuery;
        if (CHECKS) {
            check(obj);
            check(collided_results);
        }
        return invokePPPPZ(obj, ray_dir, ray_origin, collided_results, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btGImpactBvh_rayQuery(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 ray_dir, @NativeType("btVector3 const *") BTVector3 ray_origin, @NativeType("void *") long collided_results) {
        return nbtGImpactBvh_rayQuery(obj, ray_dir.address(), ray_origin.address(), collided_results);
    }

    // --- [ btGImpactBvh_setNodeBound ] ---

    public static void btGImpactBvh_setNodeBound(@NativeType("void *") long obj, int nodeindex, @NativeType("void *") long bound) {
        long __functionAddress = Functions.GImpactBvh_setNodeBound;
        if (CHECKS) {
            check(obj);
            check(bound);
        }
        invokePPV(obj, nodeindex, bound, __functionAddress);
    }

    // --- [ btGImpactBvh_setPrimitiveManager ] ---

    public static void btGImpactBvh_setPrimitiveManager(@NativeType("void *") long obj, @NativeType("void *") long primitive_manager) {
        long __functionAddress = Functions.GImpactBvh_setPrimitiveManager;
        if (CHECKS) {
            check(obj);
            check(primitive_manager);
        }
        invokePPV(obj, primitive_manager, __functionAddress);
    }

    // --- [ btGImpactBvh_update ] ---

    public static void btGImpactBvh_update(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactBvh_update;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGImpactBvh_delete ] ---

    public static void btGImpactBvh_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactBvh_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}
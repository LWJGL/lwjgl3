/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BTGImpactQuantizedBvh {

    protected BTGImpactQuantizedBvh() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            BT_QUANTIZED_BVH_NODE_new                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_QUANTIZED_BVH_NODE_new"),
            BT_QUANTIZED_BVH_NODE_getDataIndex              = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_QUANTIZED_BVH_NODE_getDataIndex"),
            BT_QUANTIZED_BVH_NODE_getEscapeIndex            = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_QUANTIZED_BVH_NODE_getEscapeIndex"),
            BT_QUANTIZED_BVH_NODE_getEscapeIndexOrDataIndex = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_QUANTIZED_BVH_NODE_getEscapeIndexOrDataIndex"),
            BT_QUANTIZED_BVH_NODE_getQuantizedAabbMax       = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_QUANTIZED_BVH_NODE_getQuantizedAabbMax"),
            BT_QUANTIZED_BVH_NODE_getQuantizedAabbMin       = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_QUANTIZED_BVH_NODE_getQuantizedAabbMin"),
            BT_QUANTIZED_BVH_NODE_isLeafNode                = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_QUANTIZED_BVH_NODE_isLeafNode"),
            BT_QUANTIZED_BVH_NODE_setDataIndex              = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_QUANTIZED_BVH_NODE_setDataIndex"),
            BT_QUANTIZED_BVH_NODE_setEscapeIndex            = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_QUANTIZED_BVH_NODE_setEscapeIndex"),
            BT_QUANTIZED_BVH_NODE_setEscapeIndexOrDataIndex = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_QUANTIZED_BVH_NODE_setEscapeIndexOrDataIndex"),
            BT_QUANTIZED_BVH_NODE_testQuantizedBoxOverlapp  = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_QUANTIZED_BVH_NODE_testQuantizedBoxOverlapp"),
            BT_QUANTIZED_BVH_NODE_delete                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_QUANTIZED_BVH_NODE_delete"),
            GIM_QUANTIZED_BVH_NODE_ARRAY_new                = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_QUANTIZED_BVH_NODE_ARRAY_new"),
            GIM_QUANTIZED_BVH_NODE_ARRAY_delete             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_QUANTIZED_BVH_NODE_ARRAY_delete"),
            QuantizedBvhTree_new                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhTree_new"),
            QuantizedBvhTree_build_tree                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhTree_build_tree"),
            QuantizedBvhTree_clearNodes                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhTree_clearNodes"),
            QuantizedBvhTree_get_node_pointer               = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhTree_get_node_pointer"),
            QuantizedBvhTree_getEscapeNodeIndex             = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhTree_getEscapeNodeIndex"),
            QuantizedBvhTree_getLeftNode                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhTree_getLeftNode"),
            QuantizedBvhTree_getNodeBound                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhTree_getNodeBound"),
            QuantizedBvhTree_getNodeCount                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhTree_getNodeCount"),
            QuantizedBvhTree_getNodeData                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhTree_getNodeData"),
            QuantizedBvhTree_getRightNode                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhTree_getRightNode"),
            QuantizedBvhTree_isLeafNode                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhTree_isLeafNode"),
            QuantizedBvhTree_quantizePoint                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhTree_quantizePoint"),
            QuantizedBvhTree_setNodeBound                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhTree_setNodeBound"),
            QuantizedBvhTree_testQuantizedBoxOverlapp       = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhTree_testQuantizedBoxOverlapp"),
            QuantizedBvhTree_delete                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhTree_delete"),
            GImpactQuantizedBvh_new                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_new"),
            GImpactQuantizedBvh_new2                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_new2"),
            GImpactQuantizedBvh_boxQuery                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_boxQuery"),
            GImpactQuantizedBvh_boxQueryTrans               = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_boxQueryTrans"),
            GImpactQuantizedBvh_buildSet                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_buildSet"),
            GImpactQuantizedBvh_find_collision              = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_find_collision"),
            GImpactQuantizedBvh_get_node_pointer            = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_get_node_pointer"),
            GImpactQuantizedBvh_getEscapeNodeIndex          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_getEscapeNodeIndex"),
            GImpactQuantizedBvh_getGlobalBox                = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_getGlobalBox"),
            GImpactQuantizedBvh_getLeftNode                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_getLeftNode"),
            GImpactQuantizedBvh_getNodeBound                = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_getNodeBound"),
            GImpactQuantizedBvh_getNodeCount                = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_getNodeCount"),
            GImpactQuantizedBvh_getNodeData                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_getNodeData"),
            GImpactQuantizedBvh_getNodeTriangle             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_getNodeTriangle"),
            GImpactQuantizedBvh_getPrimitiveManager         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_getPrimitiveManager"),
            GImpactQuantizedBvh_getRightNode                = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_getRightNode"),
            GImpactQuantizedBvh_hasHierarchy                = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_hasHierarchy"),
            GImpactQuantizedBvh_isLeafNode                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_isLeafNode"),
            GImpactQuantizedBvh_isTrimesh                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_isTrimesh"),
            GImpactQuantizedBvh_rayQuery                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_rayQuery"),
            GImpactQuantizedBvh_setNodeBound                = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_setNodeBound"),
            GImpactQuantizedBvh_setPrimitiveManager         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_setPrimitiveManager"),
            GImpactQuantizedBvh_update                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_update"),
            GImpactQuantizedBvh_delete                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactQuantizedBvh_delete");

    }

    // --- [ btBT_QUANTIZED_BVH_NODE_new ] ---

    @NativeType("void *")
    public static long btBT_QUANTIZED_BVH_NODE_new() {
        long __functionAddress = Functions.BT_QUANTIZED_BVH_NODE_new;
        return invokeP(__functionAddress);
    }

    // --- [ btBT_QUANTIZED_BVH_NODE_getDataIndex ] ---

    public static int btBT_QUANTIZED_BVH_NODE_getDataIndex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BT_QUANTIZED_BVH_NODE_getDataIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btBT_QUANTIZED_BVH_NODE_getEscapeIndex ] ---

    public static int btBT_QUANTIZED_BVH_NODE_getEscapeIndex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BT_QUANTIZED_BVH_NODE_getEscapeIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btBT_QUANTIZED_BVH_NODE_getEscapeIndexOrDataIndex ] ---

    public static int btBT_QUANTIZED_BVH_NODE_getEscapeIndexOrDataIndex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BT_QUANTIZED_BVH_NODE_getEscapeIndexOrDataIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btBT_QUANTIZED_BVH_NODE_getQuantizedAabbMax ] ---

    @NativeType("unsigned short[3]")
    public static ShortBuffer btBT_QUANTIZED_BVH_NODE_getQuantizedAabbMax(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BT_QUANTIZED_BVH_NODE_getQuantizedAabbMax;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memShortBuffer(__result, 3);
    }

    // --- [ btBT_QUANTIZED_BVH_NODE_getQuantizedAabbMin ] ---

    @NativeType("unsigned short[3]")
    public static ShortBuffer btBT_QUANTIZED_BVH_NODE_getQuantizedAabbMin(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BT_QUANTIZED_BVH_NODE_getQuantizedAabbMin;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memShortBuffer(__result, 3);
    }

    // --- [ btBT_QUANTIZED_BVH_NODE_isLeafNode ] ---

    @NativeType("bool")
    public static boolean btBT_QUANTIZED_BVH_NODE_isLeafNode(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BT_QUANTIZED_BVH_NODE_isLeafNode;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btBT_QUANTIZED_BVH_NODE_setDataIndex ] ---

    public static void btBT_QUANTIZED_BVH_NODE_setDataIndex(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.BT_QUANTIZED_BVH_NODE_setDataIndex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, __functionAddress);
    }

    // --- [ btBT_QUANTIZED_BVH_NODE_setEscapeIndex ] ---

    public static void btBT_QUANTIZED_BVH_NODE_setEscapeIndex(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.BT_QUANTIZED_BVH_NODE_setEscapeIndex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, __functionAddress);
    }

    // --- [ btBT_QUANTIZED_BVH_NODE_setEscapeIndexOrDataIndex ] ---

    public static void btBT_QUANTIZED_BVH_NODE_setEscapeIndexOrDataIndex(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.BT_QUANTIZED_BVH_NODE_setEscapeIndexOrDataIndex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btBT_QUANTIZED_BVH_NODE_testQuantizedBoxOverlapp ] ---

    public static boolean nbtBT_QUANTIZED_BVH_NODE_testQuantizedBoxOverlapp(long obj, long quantizedMin, long quantizedMax) {
        long __functionAddress = Functions.BT_QUANTIZED_BVH_NODE_testQuantizedBoxOverlapp;
        if (CHECKS) {
            check(obj);
        }
        return invokePPPZ(obj, quantizedMin, quantizedMax, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btBT_QUANTIZED_BVH_NODE_testQuantizedBoxOverlapp(@NativeType("void *") long obj, @NativeType("unsigned short *") ShortBuffer quantizedMin, @NativeType("unsigned short *") ShortBuffer quantizedMax) {
        if (CHECKS) {
            check(quantizedMin, 3);
            check(quantizedMax, 3);
        }
        return nbtBT_QUANTIZED_BVH_NODE_testQuantizedBoxOverlapp(obj, memAddress(quantizedMin), memAddress(quantizedMax));
    }

    // --- [ btBT_QUANTIZED_BVH_NODE_delete ] ---

    public static void btBT_QUANTIZED_BVH_NODE_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BT_QUANTIZED_BVH_NODE_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGIM_QUANTIZED_BVH_NODE_ARRAY_new ] ---

    @NativeType("void *")
    public static long btGIM_QUANTIZED_BVH_NODE_ARRAY_new() {
        long __functionAddress = Functions.GIM_QUANTIZED_BVH_NODE_ARRAY_new;
        return invokeP(__functionAddress);
    }

    // --- [ btGIM_QUANTIZED_BVH_NODE_ARRAY_delete ] ---

    public static void btGIM_QUANTIZED_BVH_NODE_ARRAY_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GIM_QUANTIZED_BVH_NODE_ARRAY_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btQuantizedBvhTree_new ] ---

    @NativeType("void *")
    public static long btQuantizedBvhTree_new() {
        long __functionAddress = Functions.QuantizedBvhTree_new;
        return invokeP(__functionAddress);
    }

    // --- [ btQuantizedBvhTree_build_tree ] ---

    public static void btQuantizedBvhTree_build_tree(@NativeType("void *") long obj, @NativeType("void *") long primitive_boxes) {
        long __functionAddress = Functions.QuantizedBvhTree_build_tree;
        if (CHECKS) {
            check(obj);
            check(primitive_boxes);
        }
        invokePPV(obj, primitive_boxes, __functionAddress);
    }

    // --- [ btQuantizedBvhTree_clearNodes ] ---

    public static void btQuantizedBvhTree_clearNodes(@NativeType("void *") long obj) {
        long __functionAddress = Functions.QuantizedBvhTree_clearNodes;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btQuantizedBvhTree_get_node_pointer ] ---

    @NativeType("void *")
    public static long btQuantizedBvhTree_get_node_pointer(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.QuantizedBvhTree_get_node_pointer;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btQuantizedBvhTree_getEscapeNodeIndex ] ---

    public static int btQuantizedBvhTree_getEscapeNodeIndex(@NativeType("void *") long obj, int nodeindex) {
        long __functionAddress = Functions.QuantizedBvhTree_getEscapeNodeIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, nodeindex, __functionAddress);
    }

    // --- [ btQuantizedBvhTree_getLeftNode ] ---

    public static int btQuantizedBvhTree_getLeftNode(@NativeType("void *") long obj, int nodeindex) {
        long __functionAddress = Functions.QuantizedBvhTree_getLeftNode;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, nodeindex, __functionAddress);
    }

    // --- [ btQuantizedBvhTree_getNodeBound ] ---

    public static void btQuantizedBvhTree_getNodeBound(@NativeType("void *") long obj, int nodeindex, @NativeType("void *") long bound) {
        long __functionAddress = Functions.QuantizedBvhTree_getNodeBound;
        if (CHECKS) {
            check(obj);
            check(bound);
        }
        invokePPV(obj, nodeindex, bound, __functionAddress);
    }

    // --- [ btQuantizedBvhTree_getNodeCount ] ---

    public static int btQuantizedBvhTree_getNodeCount(@NativeType("void *") long obj) {
        long __functionAddress = Functions.QuantizedBvhTree_getNodeCount;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btQuantizedBvhTree_getNodeData ] ---

    public static int btQuantizedBvhTree_getNodeData(@NativeType("void *") long obj, int nodeindex) {
        long __functionAddress = Functions.QuantizedBvhTree_getNodeData;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, nodeindex, __functionAddress);
    }

    // --- [ btQuantizedBvhTree_getRightNode ] ---

    public static int btQuantizedBvhTree_getRightNode(@NativeType("void *") long obj, int nodeindex) {
        long __functionAddress = Functions.QuantizedBvhTree_getRightNode;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, nodeindex, __functionAddress);
    }

    // --- [ btQuantizedBvhTree_isLeafNode ] ---

    @NativeType("bool")
    public static boolean btQuantizedBvhTree_isLeafNode(@NativeType("void *") long obj, int nodeindex) {
        long __functionAddress = Functions.QuantizedBvhTree_isLeafNode;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, nodeindex, __functionAddress);
    }

    // --- [ btQuantizedBvhTree_quantizePoint ] ---

    public static void nbtQuantizedBvhTree_quantizePoint(long obj, long quantizedpoint, long point) {
        long __functionAddress = Functions.QuantizedBvhTree_quantizePoint;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, quantizedpoint, point, __functionAddress);
    }

    public static void btQuantizedBvhTree_quantizePoint(@NativeType("void *") long obj, @NativeType("unsigned short *") ShortBuffer quantizedpoint, @NativeType("btVector3 const *") BTVector3 point) {
        if (CHECKS) {
            check(quantizedpoint, 3);
        }
        nbtQuantizedBvhTree_quantizePoint(obj, memAddress(quantizedpoint), point.address());
    }

    // --- [ btQuantizedBvhTree_setNodeBound ] ---

    public static void btQuantizedBvhTree_setNodeBound(@NativeType("void *") long obj, int nodeindex, @NativeType("void *") long bound) {
        long __functionAddress = Functions.QuantizedBvhTree_setNodeBound;
        if (CHECKS) {
            check(obj);
            check(bound);
        }
        invokePPV(obj, nodeindex, bound, __functionAddress);
    }

    // --- [ btQuantizedBvhTree_testQuantizedBoxOverlapp ] ---

    public static boolean nbtQuantizedBvhTree_testQuantizedBoxOverlapp(long obj, int node_index, long quantizedMin, long quantizedMax) {
        long __functionAddress = Functions.QuantizedBvhTree_testQuantizedBoxOverlapp;
        if (CHECKS) {
            check(obj);
        }
        return invokePPPZ(obj, node_index, quantizedMin, quantizedMax, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btQuantizedBvhTree_testQuantizedBoxOverlapp(@NativeType("void *") long obj, int node_index, @NativeType("unsigned short *") ShortBuffer quantizedMin, @NativeType("unsigned short *") ShortBuffer quantizedMax) {
        if (CHECKS) {
            check(quantizedMin, 3);
            check(quantizedMax, 3);
        }
        return nbtQuantizedBvhTree_testQuantizedBoxOverlapp(obj, node_index, memAddress(quantizedMin), memAddress(quantizedMax));
    }

    // --- [ btQuantizedBvhTree_delete ] ---

    public static void btQuantizedBvhTree_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.QuantizedBvhTree_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGImpactQuantizedBvh_new ] ---

    @NativeType("void *")
    public static long btGImpactQuantizedBvh_new() {
        long __functionAddress = Functions.GImpactQuantizedBvh_new;
        return invokeP(__functionAddress);
    }

    // --- [ btGImpactQuantizedBvh_new2 ] ---

    @NativeType("void *")
    public static long btGImpactQuantizedBvh_new2(@NativeType("void *") long primitive_manager) {
        long __functionAddress = Functions.GImpactQuantizedBvh_new2;
        if (CHECKS) {
            check(primitive_manager);
        }
        return invokePP(primitive_manager, __functionAddress);
    }

    // --- [ btGImpactQuantizedBvh_boxQuery ] ---

    @NativeType("bool")
    public static boolean btGImpactQuantizedBvh_boxQuery(@NativeType("void *") long obj, @NativeType("void *") long box, @NativeType("void *") long collided_results) {
        long __functionAddress = Functions.GImpactQuantizedBvh_boxQuery;
        if (CHECKS) {
            check(obj);
            check(box);
            check(collided_results);
        }
        return invokePPPZ(obj, box, collided_results, __functionAddress);
    }

    // --- [ btGImpactQuantizedBvh_boxQueryTrans ] ---

    public static boolean nbtGImpactQuantizedBvh_boxQueryTrans(long obj, long box, long transform, long collided_results) {
        long __functionAddress = Functions.GImpactQuantizedBvh_boxQueryTrans;
        if (CHECKS) {
            check(obj);
            check(box);
            check(collided_results);
        }
        return invokePPPPZ(obj, box, transform, collided_results, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btGImpactQuantizedBvh_boxQueryTrans(@NativeType("void *") long obj, @NativeType("void *") long box, @NativeType("btTransform const *") BTTransform transform, @NativeType("void *") long collided_results) {
        return nbtGImpactQuantizedBvh_boxQueryTrans(obj, box, transform.address(), collided_results);
    }

    // --- [ btGImpactQuantizedBvh_buildSet ] ---

    public static void btGImpactQuantizedBvh_buildSet(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactQuantizedBvh_buildSet;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGImpactQuantizedBvh_find_collision ] ---

    public static void nbtGImpactQuantizedBvh_find_collision(long boxset1, long trans1, long boxset2, long trans2, long collision_pairs) {
        long __functionAddress = Functions.GImpactQuantizedBvh_find_collision;
        if (CHECKS) {
            check(boxset1);
            check(boxset2);
            check(collision_pairs);
        }
        invokePPPPPV(boxset1, trans1, boxset2, trans2, collision_pairs, __functionAddress);
    }

    public static void btGImpactQuantizedBvh_find_collision(@NativeType("void *") long boxset1, @NativeType("btTransform const *") BTTransform trans1, @NativeType("void *") long boxset2, @NativeType("btTransform const *") BTTransform trans2, @NativeType("void *") long collision_pairs) {
        nbtGImpactQuantizedBvh_find_collision(boxset1, trans1.address(), boxset2, trans2.address(), collision_pairs);
    }

    // --- [ btGImpactQuantizedBvh_get_node_pointer ] ---

    @NativeType("void *")
    public static long btGImpactQuantizedBvh_get_node_pointer(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.GImpactQuantizedBvh_get_node_pointer;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btGImpactQuantizedBvh_getEscapeNodeIndex ] ---

    public static int btGImpactQuantizedBvh_getEscapeNodeIndex(@NativeType("void *") long obj, int nodeindex) {
        long __functionAddress = Functions.GImpactQuantizedBvh_getEscapeNodeIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, nodeindex, __functionAddress);
    }

    // --- [ btGImpactQuantizedBvh_getGlobalBox ] ---

    @NativeType("void *")
    public static long btGImpactQuantizedBvh_getGlobalBox(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactQuantizedBvh_getGlobalBox;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btGImpactQuantizedBvh_getLeftNode ] ---

    public static int btGImpactQuantizedBvh_getLeftNode(@NativeType("void *") long obj, int nodeindex) {
        long __functionAddress = Functions.GImpactQuantizedBvh_getLeftNode;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, nodeindex, __functionAddress);
    }

    // --- [ btGImpactQuantizedBvh_getNodeBound ] ---

    public static void btGImpactQuantizedBvh_getNodeBound(@NativeType("void *") long obj, int nodeindex, @NativeType("void *") long bound) {
        long __functionAddress = Functions.GImpactQuantizedBvh_getNodeBound;
        if (CHECKS) {
            check(obj);
            check(bound);
        }
        invokePPV(obj, nodeindex, bound, __functionAddress);
    }

    // --- [ btGImpactQuantizedBvh_getNodeCount ] ---

    public static int btGImpactQuantizedBvh_getNodeCount(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactQuantizedBvh_getNodeCount;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGImpactQuantizedBvh_getNodeData ] ---

    public static int btGImpactQuantizedBvh_getNodeData(@NativeType("void *") long obj, int nodeindex) {
        long __functionAddress = Functions.GImpactQuantizedBvh_getNodeData;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, nodeindex, __functionAddress);
    }

    // --- [ btGImpactQuantizedBvh_getNodeTriangle ] ---

    public static void btGImpactQuantizedBvh_getNodeTriangle(@NativeType("void *") long obj, int nodeindex, @NativeType("void *") long triangle) {
        long __functionAddress = Functions.GImpactQuantizedBvh_getNodeTriangle;
        if (CHECKS) {
            check(obj);
            check(triangle);
        }
        invokePPV(obj, nodeindex, triangle, __functionAddress);
    }

    // --- [ btGImpactQuantizedBvh_getPrimitiveManager ] ---

    @NativeType("void *")
    public static long btGImpactQuantizedBvh_getPrimitiveManager(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactQuantizedBvh_getPrimitiveManager;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btGImpactQuantizedBvh_getRightNode ] ---

    public static int btGImpactQuantizedBvh_getRightNode(@NativeType("void *") long obj, int nodeindex) {
        long __functionAddress = Functions.GImpactQuantizedBvh_getRightNode;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, nodeindex, __functionAddress);
    }

    // --- [ btGImpactQuantizedBvh_hasHierarchy ] ---

    @NativeType("bool")
    public static boolean btGImpactQuantizedBvh_hasHierarchy(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactQuantizedBvh_hasHierarchy;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btGImpactQuantizedBvh_isLeafNode ] ---

    @NativeType("bool")
    public static boolean btGImpactQuantizedBvh_isLeafNode(@NativeType("void *") long obj, int nodeindex) {
        long __functionAddress = Functions.GImpactQuantizedBvh_isLeafNode;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, nodeindex, __functionAddress);
    }

    // --- [ btGImpactQuantizedBvh_isTrimesh ] ---

    @NativeType("bool")
    public static boolean btGImpactQuantizedBvh_isTrimesh(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactQuantizedBvh_isTrimesh;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btGImpactQuantizedBvh_rayQuery ] ---

    public static boolean nbtGImpactQuantizedBvh_rayQuery(long obj, long ray_dir, long ray_origin, long collided_results) {
        long __functionAddress = Functions.GImpactQuantizedBvh_rayQuery;
        if (CHECKS) {
            check(obj);
            check(collided_results);
        }
        return invokePPPPZ(obj, ray_dir, ray_origin, collided_results, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btGImpactQuantizedBvh_rayQuery(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 ray_dir, @NativeType("btVector3 const *") BTVector3 ray_origin, @NativeType("void *") long collided_results) {
        return nbtGImpactQuantizedBvh_rayQuery(obj, ray_dir.address(), ray_origin.address(), collided_results);
    }

    // --- [ btGImpactQuantizedBvh_setNodeBound ] ---

    public static void btGImpactQuantizedBvh_setNodeBound(@NativeType("void *") long obj, int nodeindex, @NativeType("void *") long bound) {
        long __functionAddress = Functions.GImpactQuantizedBvh_setNodeBound;
        if (CHECKS) {
            check(obj);
            check(bound);
        }
        invokePPV(obj, nodeindex, bound, __functionAddress);
    }

    // --- [ btGImpactQuantizedBvh_setPrimitiveManager ] ---

    public static void btGImpactQuantizedBvh_setPrimitiveManager(@NativeType("void *") long obj, @NativeType("void *") long primitive_manager) {
        long __functionAddress = Functions.GImpactQuantizedBvh_setPrimitiveManager;
        if (CHECKS) {
            check(obj);
            check(primitive_manager);
        }
        invokePPV(obj, primitive_manager, __functionAddress);
    }

    // --- [ btGImpactQuantizedBvh_update ] ---

    public static void btGImpactQuantizedBvh_update(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactQuantizedBvh_update;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGImpactQuantizedBvh_delete ] ---

    public static void btGImpactQuantizedBvh_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactQuantizedBvh_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}
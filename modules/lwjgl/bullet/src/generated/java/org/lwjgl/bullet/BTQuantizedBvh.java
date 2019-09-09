/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BTQuantizedBvh {

    protected BTQuantizedBvh() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            QuantizedBvhNode_new                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhNode_new"),
            QuantizedBvhNode_getEscapeIndex                = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhNode_getEscapeIndex"),
            QuantizedBvhNode_getEscapeIndexOrTriangleIndex = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhNode_getEscapeIndexOrTriangleIndex"),
            QuantizedBvhNode_getPartId                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhNode_getPartId"),
            QuantizedBvhNode_getQuantizedAabbMax           = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhNode_getQuantizedAabbMax"),
            QuantizedBvhNode_getQuantizedAabbMin           = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhNode_getQuantizedAabbMin"),
            QuantizedBvhNode_getTriangleIndex              = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhNode_getTriangleIndex"),
            QuantizedBvhNode_isLeafNode                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhNode_isLeafNode"),
            QuantizedBvhNode_setEscapeIndexOrTriangleIndex = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhNode_setEscapeIndexOrTriangleIndex"),
            QuantizedBvhNode_delete                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvhNode_delete"),
            OptimizedBvhNode_new                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btOptimizedBvhNode_new"),
            OptimizedBvhNode_getAabbMaxOrg                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btOptimizedBvhNode_getAabbMaxOrg"),
            OptimizedBvhNode_getAabbMinOrg                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btOptimizedBvhNode_getAabbMinOrg"),
            OptimizedBvhNode_getEscapeIndex                = apiGetFunctionAddress(LibBullet.getLibrary(), "btOptimizedBvhNode_getEscapeIndex"),
            OptimizedBvhNode_getSubPart                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btOptimizedBvhNode_getSubPart"),
            OptimizedBvhNode_getTriangleIndex              = apiGetFunctionAddress(LibBullet.getLibrary(), "btOptimizedBvhNode_getTriangleIndex"),
            OptimizedBvhNode_setAabbMaxOrg                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btOptimizedBvhNode_setAabbMaxOrg"),
            OptimizedBvhNode_setAabbMinOrg                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btOptimizedBvhNode_setAabbMinOrg"),
            OptimizedBvhNode_setEscapeIndex                = apiGetFunctionAddress(LibBullet.getLibrary(), "btOptimizedBvhNode_setEscapeIndex"),
            OptimizedBvhNode_setSubPart                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btOptimizedBvhNode_setSubPart"),
            OptimizedBvhNode_setTriangleIndex              = apiGetFunctionAddress(LibBullet.getLibrary(), "btOptimizedBvhNode_setTriangleIndex"),
            OptimizedBvhNode_delete                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btOptimizedBvhNode_delete"),
            NodeOverlapCallback_processNode                = apiGetFunctionAddress(LibBullet.getLibrary(), "btNodeOverlapCallback_processNode"),
            NodeOverlapCallback_delete                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btNodeOverlapCallback_delete"),
            QuantizedBvh_new                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_new"),
            QuantizedBvh_buildInternal                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_buildInternal"),
            QuantizedBvh_calculateSerializeBufferSize      = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_calculateSerializeBufferSize"),
            QuantizedBvh_calculateSerializeBufferSizeNew   = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_calculateSerializeBufferSizeNew"),
            QuantizedBvh_deSerializeDouble                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_deSerializeDouble"),
            QuantizedBvh_deSerializeFloat                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_deSerializeFloat"),
            QuantizedBvh_deSerializeInPlace                = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_deSerializeInPlace"),
            QuantizedBvh_getAlignmentSerializationPadding  = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_getAlignmentSerializationPadding"),
            QuantizedBvh_getLeafNodeArray                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_getLeafNodeArray"),
            QuantizedBvh_getQuantizedNodeArray             = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_getQuantizedNodeArray"),
            QuantizedBvh_getSubtreeInfoArray               = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_getSubtreeInfoArray"),
            QuantizedBvh_isQuantized                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_isQuantized"),
            QuantizedBvh_quantize                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_quantize"),
            QuantizedBvh_quantizeWithClamp                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_quantizeWithClamp"),
            QuantizedBvh_reportAabbOverlappingNodex        = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_reportAabbOverlappingNodex"),
            QuantizedBvh_reportBoxCastOverlappingNodex     = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_reportBoxCastOverlappingNodex"),
            QuantizedBvh_reportRayOverlappingNodex         = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_reportRayOverlappingNodex"),
            QuantizedBvh_serialize                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_serialize"),
            QuantizedBvh_serialize2                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_serialize2"),
            QuantizedBvh_setQuantizationValues             = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_setQuantizationValues"),
            QuantizedBvh_setTraversalMode                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_setTraversalMode"),
            QuantizedBvh_unQuantize                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_unQuantize"),
            QuantizedBvh_delete                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btQuantizedBvh_delete");

    }

    // --- [ btQuantizedBvhNode_new ] ---

    @NativeType("void *")
    public static long btQuantizedBvhNode_new() {
        long __functionAddress = Functions.QuantizedBvhNode_new;
        return invokeP(__functionAddress);
    }

    // --- [ btQuantizedBvhNode_getEscapeIndex ] ---

    public static int btQuantizedBvhNode_getEscapeIndex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.QuantizedBvhNode_getEscapeIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btQuantizedBvhNode_getEscapeIndexOrTriangleIndex ] ---

    public static int btQuantizedBvhNode_getEscapeIndexOrTriangleIndex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.QuantizedBvhNode_getEscapeIndexOrTriangleIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btQuantizedBvhNode_getPartId ] ---

    public static int btQuantizedBvhNode_getPartId(@NativeType("void *") long obj) {
        long __functionAddress = Functions.QuantizedBvhNode_getPartId;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btQuantizedBvhNode_getQuantizedAabbMax ] ---

    @NativeType("unsigned short[3]")
    public static ShortBuffer btQuantizedBvhNode_getQuantizedAabbMax(@NativeType("void *") long obj) {
        long __functionAddress = Functions.QuantizedBvhNode_getQuantizedAabbMax;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memShortBuffer(__result, 3);
    }

    // --- [ btQuantizedBvhNode_getQuantizedAabbMin ] ---

    @NativeType("unsigned short[3]")
    public static ShortBuffer btQuantizedBvhNode_getQuantizedAabbMin(@NativeType("void *") long obj) {
        long __functionAddress = Functions.QuantizedBvhNode_getQuantizedAabbMin;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memShortBuffer(__result, 3);
    }

    // --- [ btQuantizedBvhNode_getTriangleIndex ] ---

    public static int btQuantizedBvhNode_getTriangleIndex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.QuantizedBvhNode_getTriangleIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btQuantizedBvhNode_isLeafNode ] ---

    @NativeType("bool")
    public static boolean btQuantizedBvhNode_isLeafNode(@NativeType("void *") long obj) {
        long __functionAddress = Functions.QuantizedBvhNode_isLeafNode;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btQuantizedBvhNode_setEscapeIndexOrTriangleIndex ] ---

    public static void btQuantizedBvhNode_setEscapeIndexOrTriangleIndex(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.QuantizedBvhNode_setEscapeIndexOrTriangleIndex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btQuantizedBvhNode_delete ] ---

    public static void btQuantizedBvhNode_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.QuantizedBvhNode_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btOptimizedBvhNode_new ] ---

    @NativeType("void *")
    public static long btOptimizedBvhNode_new() {
        long __functionAddress = Functions.OptimizedBvhNode_new;
        return invokeP(__functionAddress);
    }

    // --- [ btOptimizedBvhNode_getAabbMaxOrg ] ---

    public static void nbtOptimizedBvhNode_getAabbMaxOrg(long obj, long value) {
        long __functionAddress = Functions.OptimizedBvhNode_getAabbMaxOrg;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btOptimizedBvhNode_getAabbMaxOrg(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtOptimizedBvhNode_getAabbMaxOrg(obj, value.address());
    }

    // --- [ btOptimizedBvhNode_getAabbMinOrg ] ---

    public static void nbtOptimizedBvhNode_getAabbMinOrg(long obj, long value) {
        long __functionAddress = Functions.OptimizedBvhNode_getAabbMinOrg;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btOptimizedBvhNode_getAabbMinOrg(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtOptimizedBvhNode_getAabbMinOrg(obj, value.address());
    }

    // --- [ btOptimizedBvhNode_getEscapeIndex ] ---

    public static int btOptimizedBvhNode_getEscapeIndex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.OptimizedBvhNode_getEscapeIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btOptimizedBvhNode_getSubPart ] ---

    public static int btOptimizedBvhNode_getSubPart(@NativeType("void *") long obj) {
        long __functionAddress = Functions.OptimizedBvhNode_getSubPart;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btOptimizedBvhNode_getTriangleIndex ] ---

    public static int btOptimizedBvhNode_getTriangleIndex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.OptimizedBvhNode_getTriangleIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btOptimizedBvhNode_setAabbMaxOrg ] ---

    public static void nbtOptimizedBvhNode_setAabbMaxOrg(long obj, long value) {
        long __functionAddress = Functions.OptimizedBvhNode_setAabbMaxOrg;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btOptimizedBvhNode_setAabbMaxOrg(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtOptimizedBvhNode_setAabbMaxOrg(obj, value.address());
    }

    // --- [ btOptimizedBvhNode_setAabbMinOrg ] ---

    public static void nbtOptimizedBvhNode_setAabbMinOrg(long obj, long value) {
        long __functionAddress = Functions.OptimizedBvhNode_setAabbMinOrg;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btOptimizedBvhNode_setAabbMinOrg(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtOptimizedBvhNode_setAabbMinOrg(obj, value.address());
    }

    // --- [ btOptimizedBvhNode_setEscapeIndex ] ---

    public static void btOptimizedBvhNode_setEscapeIndex(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.OptimizedBvhNode_setEscapeIndex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btOptimizedBvhNode_setSubPart ] ---

    public static void btOptimizedBvhNode_setSubPart(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.OptimizedBvhNode_setSubPart;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btOptimizedBvhNode_setTriangleIndex ] ---

    public static void btOptimizedBvhNode_setTriangleIndex(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.OptimizedBvhNode_setTriangleIndex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btOptimizedBvhNode_delete ] ---

    public static void btOptimizedBvhNode_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.OptimizedBvhNode_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btNodeOverlapCallback_processNode ] ---

    public static void btNodeOverlapCallback_processNode(@NativeType("void *") long obj, int subPart, int triangleIndex) {
        long __functionAddress = Functions.NodeOverlapCallback_processNode;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, subPart, triangleIndex, __functionAddress);
    }

    // --- [ btNodeOverlapCallback_delete ] ---

    public static void btNodeOverlapCallback_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.NodeOverlapCallback_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btQuantizedBvh_new ] ---

    @NativeType("void *")
    public static long btQuantizedBvh_new() {
        long __functionAddress = Functions.QuantizedBvh_new;
        return invokeP(__functionAddress);
    }

    // --- [ btQuantizedBvh_buildInternal ] ---

    public static void btQuantizedBvh_buildInternal(@NativeType("void *") long obj) {
        long __functionAddress = Functions.QuantizedBvh_buildInternal;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btQuantizedBvh_calculateSerializeBufferSize ] ---

    @NativeType("unsigned int")
    public static int btQuantizedBvh_calculateSerializeBufferSize(@NativeType("void *") long obj) {
        long __functionAddress = Functions.QuantizedBvh_calculateSerializeBufferSize;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btQuantizedBvh_calculateSerializeBufferSizeNew ] ---

    public static int btQuantizedBvh_calculateSerializeBufferSizeNew(@NativeType("void *") long obj) {
        long __functionAddress = Functions.QuantizedBvh_calculateSerializeBufferSizeNew;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btQuantizedBvh_deSerializeDouble ] ---

    public static void btQuantizedBvh_deSerializeDouble(@NativeType("void *") long obj, @NativeType("void *") long quantizedBvhDoubleData) {
        long __functionAddress = Functions.QuantizedBvh_deSerializeDouble;
        if (CHECKS) {
            check(obj);
            check(quantizedBvhDoubleData);
        }
        invokePPV(obj, quantizedBvhDoubleData, __functionAddress);
    }

    // --- [ btQuantizedBvh_deSerializeFloat ] ---

    public static void btQuantizedBvh_deSerializeFloat(@NativeType("void *") long obj, @NativeType("void *") long quantizedBvhFloatData) {
        long __functionAddress = Functions.QuantizedBvh_deSerializeFloat;
        if (CHECKS) {
            check(obj);
            check(quantizedBvhFloatData);
        }
        invokePPV(obj, quantizedBvhFloatData, __functionAddress);
    }

    // --- [ btQuantizedBvh_deSerializeInPlace ] ---

    @NativeType("void *")
    public static long btQuantizedBvh_deSerializeInPlace(@NativeType("void *") long i_alignedDataBuffer, @NativeType("unsigned int") int i_dataBufferSize, @NativeType("bool") boolean i_swapEndian) {
        long __functionAddress = Functions.QuantizedBvh_deSerializeInPlace;
        if (CHECKS) {
            check(i_alignedDataBuffer);
        }
        return invokePP(i_alignedDataBuffer, i_dataBufferSize, i_swapEndian, __functionAddress);
    }

    // --- [ btQuantizedBvh_getAlignmentSerializationPadding ] ---

    @NativeType("unsigned int")
    public static int btQuantizedBvh_getAlignmentSerializationPadding() {
        long __functionAddress = Functions.QuantizedBvh_getAlignmentSerializationPadding;
        return invokeI(__functionAddress);
    }

    // --- [ btQuantizedBvh_getLeafNodeArray ] ---

    @NativeType("void *")
    public static long btQuantizedBvh_getLeafNodeArray(@NativeType("void *") long obj) {
        long __functionAddress = Functions.QuantizedBvh_getLeafNodeArray;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btQuantizedBvh_getQuantizedNodeArray ] ---

    @NativeType("void *")
    public static long btQuantizedBvh_getQuantizedNodeArray(@NativeType("void *") long obj) {
        long __functionAddress = Functions.QuantizedBvh_getQuantizedNodeArray;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btQuantizedBvh_getSubtreeInfoArray ] ---

    @NativeType("void *")
    public static long btQuantizedBvh_getSubtreeInfoArray(@NativeType("void *") long obj) {
        long __functionAddress = Functions.QuantizedBvh_getSubtreeInfoArray;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btQuantizedBvh_isQuantized ] ---

    @NativeType("bool")
    public static boolean btQuantizedBvh_isQuantized(@NativeType("void *") long obj) {
        long __functionAddress = Functions.QuantizedBvh_isQuantized;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btQuantizedBvh_quantize ] ---

    public static void nbtQuantizedBvh_quantize(long obj, long out, long point, int isMax) {
        long __functionAddress = Functions.QuantizedBvh_quantize;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, out, point, isMax, __functionAddress);
    }

    public static void btQuantizedBvh_quantize(@NativeType("void *") long obj, @NativeType("unsigned short *") ShortBuffer out, @NativeType("btVector3 const *") BTVector3 point, int isMax) {
        if (CHECKS) {
            check(out, 3);
        }
        nbtQuantizedBvh_quantize(obj, memAddress(out), point.address(), isMax);
    }

    // --- [ btQuantizedBvh_quantizeWithClamp ] ---

    public static void nbtQuantizedBvh_quantizeWithClamp(long obj, long out, long point2, int isMax) {
        long __functionAddress = Functions.QuantizedBvh_quantizeWithClamp;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, out, point2, isMax, __functionAddress);
    }

    public static void btQuantizedBvh_quantizeWithClamp(@NativeType("void *") long obj, @NativeType("unsigned short *") ShortBuffer out, @NativeType("btVector3 const *") BTVector3 point2, int isMax) {
        if (CHECKS) {
            check(out, 3);
        }
        nbtQuantizedBvh_quantizeWithClamp(obj, memAddress(out), point2.address(), isMax);
    }

    // --- [ btQuantizedBvh_reportAabbOverlappingNodex ] ---

    public static void nbtQuantizedBvh_reportAabbOverlappingNodex(long obj, long nodeCallback, long aabbMin, long aabbMax) {
        long __functionAddress = Functions.QuantizedBvh_reportAabbOverlappingNodex;
        if (CHECKS) {
            check(obj);
            check(nodeCallback);
        }
        invokePPPPV(obj, nodeCallback, aabbMin, aabbMax, __functionAddress);
    }

    public static void btQuantizedBvh_reportAabbOverlappingNodex(@NativeType("void *") long obj, @NativeType("void *") long nodeCallback, @NativeType("btVector3 const *") BTVector3 aabbMin, @NativeType("btVector3 const *") BTVector3 aabbMax) {
        nbtQuantizedBvh_reportAabbOverlappingNodex(obj, nodeCallback, aabbMin.address(), aabbMax.address());
    }

    // --- [ btQuantizedBvh_reportBoxCastOverlappingNodex ] ---

    public static void nbtQuantizedBvh_reportBoxCastOverlappingNodex(long obj, long nodeCallback, long raySource, long rayTarget, long aabbMin, long aabbMax) {
        long __functionAddress = Functions.QuantizedBvh_reportBoxCastOverlappingNodex;
        if (CHECKS) {
            check(obj);
            check(nodeCallback);
        }
        invokePPPPPPV(obj, nodeCallback, raySource, rayTarget, aabbMin, aabbMax, __functionAddress);
    }

    public static void btQuantizedBvh_reportBoxCastOverlappingNodex(@NativeType("void *") long obj, @NativeType("void *") long nodeCallback, @NativeType("btVector3 const *") BTVector3 raySource, @NativeType("btVector3 const *") BTVector3 rayTarget, @NativeType("btVector3 const *") BTVector3 aabbMin, @NativeType("btVector3 const *") BTVector3 aabbMax) {
        nbtQuantizedBvh_reportBoxCastOverlappingNodex(obj, nodeCallback, raySource.address(), rayTarget.address(), aabbMin.address(), aabbMax.address());
    }

    // --- [ btQuantizedBvh_reportRayOverlappingNodex ] ---

    public static void nbtQuantizedBvh_reportRayOverlappingNodex(long obj, long nodeCallback, long raySource, long rayTarget) {
        long __functionAddress = Functions.QuantizedBvh_reportRayOverlappingNodex;
        if (CHECKS) {
            check(obj);
            check(nodeCallback);
        }
        invokePPPPV(obj, nodeCallback, raySource, rayTarget, __functionAddress);
    }

    public static void btQuantizedBvh_reportRayOverlappingNodex(@NativeType("void *") long obj, @NativeType("void *") long nodeCallback, @NativeType("btVector3 const *") BTVector3 raySource, @NativeType("btVector3 const *") BTVector3 rayTarget) {
        nbtQuantizedBvh_reportRayOverlappingNodex(obj, nodeCallback, raySource.address(), rayTarget.address());
    }

    // --- [ btQuantizedBvh_serialize ] ---

    @NativeType("bool")
    public static boolean btQuantizedBvh_serialize(@NativeType("void *") long obj, @NativeType("void *") long o_alignedDataBuffer, @NativeType("unsigned int") int i_dataBufferSize, @NativeType("bool") boolean i_swapEndian) {
        long __functionAddress = Functions.QuantizedBvh_serialize;
        if (CHECKS) {
            check(obj);
            check(o_alignedDataBuffer);
        }
        return invokePPZ(obj, o_alignedDataBuffer, i_dataBufferSize, i_swapEndian, __functionAddress);
    }

    // --- [ btQuantizedBvh_serialize2 ] ---

    public static long nbtQuantizedBvh_serialize2(long obj, long dataBuffer, long serializer) {
        long __functionAddress = Functions.QuantizedBvh_serialize2;
        if (CHECKS) {
            check(obj);
            check(dataBuffer);
            check(serializer);
        }
        return invokePPPP(obj, dataBuffer, serializer, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String btQuantizedBvh_serialize2(@NativeType("void *") long obj, @NativeType("void *") long dataBuffer, @NativeType("void *") long serializer) {
        long __result = nbtQuantizedBvh_serialize2(obj, dataBuffer, serializer);
        return memUTF8Safe(__result);
    }

    // --- [ btQuantizedBvh_setQuantizationValues ] ---

    public static void nbtQuantizedBvh_setQuantizationValues(long obj, long bvhAabbMin, long bvhAabbMax, float quantizationMargin) {
        long __functionAddress = Functions.QuantizedBvh_setQuantizationValues;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, bvhAabbMin, bvhAabbMax, quantizationMargin, __functionAddress);
    }

    public static void btQuantizedBvh_setQuantizationValues(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 bvhAabbMin, @NativeType("btVector3 const *") BTVector3 bvhAabbMax, @NativeType("btScalar") float quantizationMargin) {
        nbtQuantizedBvh_setQuantizationValues(obj, bvhAabbMin.address(), bvhAabbMax.address(), quantizationMargin);
    }

    // --- [ btQuantizedBvh_setTraversalMode ] ---

    public static void btQuantizedBvh_setTraversalMode(@NativeType("void *") long obj, int traversalMode) {
        long __functionAddress = Functions.QuantizedBvh_setTraversalMode;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, traversalMode, __functionAddress);
    }

    // --- [ btQuantizedBvh_unQuantize ] ---

    public static void nbtQuantizedBvh_unQuantize(long obj, long vecIn, long value) {
        long __functionAddress = Functions.QuantizedBvh_unQuantize;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, vecIn, value, __functionAddress);
    }

    public static void btQuantizedBvh_unQuantize(@NativeType("void *") long obj, @NativeType("unsigned short const *") ShortBuffer vecIn, @NativeType("btVector3 *") BTVector3 value) {
        if (CHECKS) {
            check(vecIn, 3);
        }
        nbtQuantizedBvh_unQuantize(obj, memAddress(vecIn), value.address());
    }

    // --- [ btQuantizedBvh_delete ] ---

    public static void btQuantizedBvh_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.QuantizedBvh_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}
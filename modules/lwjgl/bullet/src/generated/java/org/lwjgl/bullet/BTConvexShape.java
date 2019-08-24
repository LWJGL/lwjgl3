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

public class BTConvexShape {

    protected BTConvexShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ConvexShape_batchedUnitVectorGetSupportingVertexWithoutMargin = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexShape_batchedUnitVectorGetSupportingVertexWithoutMargin"),
            ConvexShape_getAabbNonVirtual                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexShape_getAabbNonVirtual"),
            ConvexShape_getAabbSlow                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexShape_getAabbSlow"),
            ConvexShape_getMarginNonVirtual                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexShape_getMarginNonVirtual"),
            ConvexShape_getNumPreferredPenetrationDirections              = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexShape_getNumPreferredPenetrationDirections"),
            ConvexShape_getPreferredPenetrationDirection                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexShape_getPreferredPenetrationDirection"),
            ConvexShape_localGetSupportingVertex                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexShape_localGetSupportingVertex"),
            ConvexShape_localGetSupportingVertexWithoutMargin             = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexShape_localGetSupportingVertexWithoutMargin"),
            ConvexShape_localGetSupportVertexNonVirtual                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexShape_localGetSupportVertexNonVirtual"),
            ConvexShape_localGetSupportVertexWithoutMarginNonVirtual      = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexShape_localGetSupportVertexWithoutMarginNonVirtual"),
            ConvexShape_project                                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexShape_project");

    }

    // --- [ btConvexShape_batchedUnitVectorGetSupportingVertexWithoutMargin ] ---

    public static void nbtConvexShape_batchedUnitVectorGetSupportingVertexWithoutMargin(long obj, long vectors, long supportVerticesOut, int numVectors) {
        long __functionAddress = Functions.ConvexShape_batchedUnitVectorGetSupportingVertexWithoutMargin;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, vectors, supportVerticesOut, numVectors, __functionAddress);
    }

    public static void btConvexShape_batchedUnitVectorGetSupportingVertexWithoutMargin(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 vectors, @NativeType("btVector3 *") ΒΤVector3 supportVerticesOut, int numVectors) {
        nbtConvexShape_batchedUnitVectorGetSupportingVertexWithoutMargin(obj, vectors.address(), supportVerticesOut.address(), numVectors);
    }

    // --- [ btConvexShape_getAabbNonVirtual ] ---

    public static void nbtConvexShape_getAabbNonVirtual(long obj, long t, long aabbMin, long aabbMax) {
        long __functionAddress = Functions.ConvexShape_getAabbNonVirtual;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPV(obj, t, aabbMin, aabbMax, __functionAddress);
    }

    public static void btConvexShape_getAabbNonVirtual(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform t, @NativeType("btVector3 *") ΒΤVector3 aabbMin, @NativeType("btVector3 *") ΒΤVector3 aabbMax) {
        nbtConvexShape_getAabbNonVirtual(obj, t.address(), aabbMin.address(), aabbMax.address());
    }

    // --- [ btConvexShape_getAabbSlow ] ---

    public static void nbtConvexShape_getAabbSlow(long obj, long t, long aabbMin, long aabbMax) {
        long __functionAddress = Functions.ConvexShape_getAabbSlow;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPV(obj, t, aabbMin, aabbMax, __functionAddress);
    }

    public static void btConvexShape_getAabbSlow(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform t, @NativeType("btVector3 *") ΒΤVector3 aabbMin, @NativeType("btVector3 *") ΒΤVector3 aabbMax) {
        nbtConvexShape_getAabbSlow(obj, t.address(), aabbMin.address(), aabbMax.address());
    }

    // --- [ btConvexShape_getMarginNonVirtual ] ---

    @NativeType("btScalar")
    public static float btConvexShape_getMarginNonVirtual(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexShape_getMarginNonVirtual;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btConvexShape_getNumPreferredPenetrationDirections ] ---

    public static int btConvexShape_getNumPreferredPenetrationDirections(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexShape_getNumPreferredPenetrationDirections;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btConvexShape_getPreferredPenetrationDirection ] ---

    public static void nbtConvexShape_getPreferredPenetrationDirection(long obj, int index, long penetrationVector) {
        long __functionAddress = Functions.ConvexShape_getPreferredPenetrationDirection;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, index, penetrationVector, __functionAddress);
    }

    public static void btConvexShape_getPreferredPenetrationDirection(@NativeType("void *") long obj, int index, @NativeType("btVector3 *") ΒΤVector3 penetrationVector) {
        nbtConvexShape_getPreferredPenetrationDirection(obj, index, penetrationVector.address());
    }

    // --- [ btConvexShape_localGetSupportingVertex ] ---

    public static void nbtConvexShape_localGetSupportingVertex(long obj, long vec, long value) {
        long __functionAddress = Functions.ConvexShape_localGetSupportingVertex;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, vec, value, __functionAddress);
    }

    public static void btConvexShape_localGetSupportingVertex(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 vec, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtConvexShape_localGetSupportingVertex(obj, vec.address(), value.address());
    }

    // --- [ btConvexShape_localGetSupportingVertexWithoutMargin ] ---

    public static void nbtConvexShape_localGetSupportingVertexWithoutMargin(long obj, long vec, long value) {
        long __functionAddress = Functions.ConvexShape_localGetSupportingVertexWithoutMargin;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, vec, value, __functionAddress);
    }

    public static void btConvexShape_localGetSupportingVertexWithoutMargin(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 vec, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtConvexShape_localGetSupportingVertexWithoutMargin(obj, vec.address(), value.address());
    }

    // --- [ btConvexShape_localGetSupportVertexNonVirtual ] ---

    public static void nbtConvexShape_localGetSupportVertexNonVirtual(long obj, long vec, long value) {
        long __functionAddress = Functions.ConvexShape_localGetSupportVertexNonVirtual;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, vec, value, __functionAddress);
    }

    public static void btConvexShape_localGetSupportVertexNonVirtual(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 vec, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtConvexShape_localGetSupportVertexNonVirtual(obj, vec.address(), value.address());
    }

    // --- [ btConvexShape_localGetSupportVertexWithoutMarginNonVirtual ] ---

    public static void nbtConvexShape_localGetSupportVertexWithoutMarginNonVirtual(long obj, long vec, long value) {
        long __functionAddress = Functions.ConvexShape_localGetSupportVertexWithoutMarginNonVirtual;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, vec, value, __functionAddress);
    }

    public static void btConvexShape_localGetSupportVertexWithoutMarginNonVirtual(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 vec, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtConvexShape_localGetSupportVertexWithoutMarginNonVirtual(obj, vec.address(), value.address());
    }

    // --- [ btConvexShape_project ] ---

    public static void nbtConvexShape_project(long obj, long trans, long dir, long minProj, long maxProj, long witnesPtMin, long witnesPtMax) {
        long __functionAddress = Functions.ConvexShape_project;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPPPPV(obj, trans, dir, minProj, maxProj, witnesPtMin, witnesPtMax, __functionAddress);
    }

    public static void btConvexShape_project(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform trans, @NativeType("btVector3 const *") ΒΤVector3 dir, @NativeType("btScalar *") FloatBuffer minProj, @NativeType("btScalar *") FloatBuffer maxProj, @NativeType("btVector3 *") ΒΤVector3 witnesPtMin, @NativeType("btVector3 *") ΒΤVector3 witnesPtMax) {
        if (CHECKS) {
            check(minProj, 1);
            check(maxProj, 1);
        }
        nbtConvexShape_project(obj, trans.address(), dir.address(), memAddress(minProj), memAddress(maxProj), witnesPtMin.address(), witnesPtMax.address());
    }

}
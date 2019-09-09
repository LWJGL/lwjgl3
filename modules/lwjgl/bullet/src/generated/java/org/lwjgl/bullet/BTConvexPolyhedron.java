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

public class BTConvexPolyhedron {

    protected BTConvexPolyhedron() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            Face_new                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btFace_new"),
            Face_getIndices                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btFace_getIndices"),
            Face_getPlane                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btFace_getPlane"),
            Face_delete                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btFace_delete"),
            ConvexPolyhedron_new             = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPolyhedron_new"),
            ConvexPolyhedron_getExtents      = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPolyhedron_getExtents"),
            ConvexPolyhedron_getFaces        = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPolyhedron_getFaces"),
            ConvexPolyhedron_getLocalCenter  = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPolyhedron_getLocalCenter"),
            ConvexPolyhedron_getMC           = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPolyhedron_getMC"),
            ConvexPolyhedron_getME           = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPolyhedron_getME"),
            ConvexPolyhedron_getRadius       = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPolyhedron_getRadius"),
            ConvexPolyhedron_initialize      = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPolyhedron_initialize"),
            ConvexPolyhedron_initialize2     = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPolyhedron_initialize2"),
            ConvexPolyhedron_project         = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPolyhedron_project"),
            ConvexPolyhedron_setExtents      = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPolyhedron_setExtents"),
            ConvexPolyhedron_setLocalCenter  = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPolyhedron_setLocalCenter"),
            ConvexPolyhedron_setMC           = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPolyhedron_setMC"),
            ConvexPolyhedron_setME           = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPolyhedron_setME"),
            ConvexPolyhedron_setRadius       = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPolyhedron_setRadius"),
            ConvexPolyhedron_testContainment = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPolyhedron_testContainment"),
            ConvexPolyhedron_delete          = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexPolyhedron_delete");

    }

    // --- [ btFace_new ] ---

    @NativeType("void *")
    public static long btFace_new() {
        long __functionAddress = Functions.Face_new;
        return invokeP(__functionAddress);
    }

    // --- [ btFace_getIndices ] ---

    @NativeType("void *")
    public static long btFace_getIndices(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Face_getIndices;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btFace_getPlane ] ---

    @NativeType("btScalar[4]")
    public static FloatBuffer btFace_getPlane(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Face_getPlane;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memFloatBuffer(__result, 4);
    }

    // --- [ btFace_delete ] ---

    public static void btFace_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Face_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btConvexPolyhedron_new ] ---

    @NativeType("void *")
    public static long btConvexPolyhedron_new() {
        long __functionAddress = Functions.ConvexPolyhedron_new;
        return invokeP(__functionAddress);
    }

    // --- [ btConvexPolyhedron_getExtents ] ---

    public static void nbtConvexPolyhedron_getExtents(long obj, long value) {
        long __functionAddress = Functions.ConvexPolyhedron_getExtents;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConvexPolyhedron_getExtents(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtConvexPolyhedron_getExtents(obj, value.address());
    }

    // --- [ btConvexPolyhedron_getFaces ] ---

    @NativeType("void *")
    public static long btConvexPolyhedron_getFaces(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexPolyhedron_getFaces;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btConvexPolyhedron_getLocalCenter ] ---

    public static void nbtConvexPolyhedron_getLocalCenter(long obj, long value) {
        long __functionAddress = Functions.ConvexPolyhedron_getLocalCenter;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConvexPolyhedron_getLocalCenter(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtConvexPolyhedron_getLocalCenter(obj, value.address());
    }

    // --- [ btConvexPolyhedron_getMC ] ---

    public static void nbtConvexPolyhedron_getMC(long obj, long value) {
        long __functionAddress = Functions.ConvexPolyhedron_getMC;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConvexPolyhedron_getMC(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtConvexPolyhedron_getMC(obj, value.address());
    }

    // --- [ btConvexPolyhedron_getME ] ---

    public static void nbtConvexPolyhedron_getME(long obj, long value) {
        long __functionAddress = Functions.ConvexPolyhedron_getME;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConvexPolyhedron_getME(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtConvexPolyhedron_getME(obj, value.address());
    }

    // --- [ btConvexPolyhedron_getRadius ] ---

    @NativeType("btScalar")
    public static float btConvexPolyhedron_getRadius(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexPolyhedron_getRadius;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btConvexPolyhedron_initialize ] ---

    public static void btConvexPolyhedron_initialize(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexPolyhedron_initialize;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btConvexPolyhedron_initialize2 ] ---

    public static void btConvexPolyhedron_initialize2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexPolyhedron_initialize2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btConvexPolyhedron_project ] ---

    public static void nbtConvexPolyhedron_project(long obj, long trans, long dir, long minProj, long maxProj, long witnesPtMin, long witnesPtMax) {
        long __functionAddress = Functions.ConvexPolyhedron_project;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPPPPV(obj, trans, dir, minProj, maxProj, witnesPtMin, witnesPtMax, __functionAddress);
    }

    public static void btConvexPolyhedron_project(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform trans, @NativeType("btVector3 const *") BTVector3 dir, @NativeType("btScalar *") FloatBuffer minProj, @NativeType("btScalar *") FloatBuffer maxProj, @NativeType("btVector3 *") BTVector3 witnesPtMin, @NativeType("btVector3 *") BTVector3 witnesPtMax) {
        if (CHECKS) {
            check(minProj, 1);
            check(maxProj, 1);
        }
        nbtConvexPolyhedron_project(obj, trans.address(), dir.address(), memAddress(minProj), memAddress(maxProj), witnesPtMin.address(), witnesPtMax.address());
    }

    // --- [ btConvexPolyhedron_setExtents ] ---

    public static void nbtConvexPolyhedron_setExtents(long obj, long value) {
        long __functionAddress = Functions.ConvexPolyhedron_setExtents;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConvexPolyhedron_setExtents(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtConvexPolyhedron_setExtents(obj, value.address());
    }

    // --- [ btConvexPolyhedron_setLocalCenter ] ---

    public static void nbtConvexPolyhedron_setLocalCenter(long obj, long value) {
        long __functionAddress = Functions.ConvexPolyhedron_setLocalCenter;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConvexPolyhedron_setLocalCenter(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtConvexPolyhedron_setLocalCenter(obj, value.address());
    }

    // --- [ btConvexPolyhedron_setMC ] ---

    public static void nbtConvexPolyhedron_setMC(long obj, long value) {
        long __functionAddress = Functions.ConvexPolyhedron_setMC;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConvexPolyhedron_setMC(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtConvexPolyhedron_setMC(obj, value.address());
    }

    // --- [ btConvexPolyhedron_setME ] ---

    public static void nbtConvexPolyhedron_setME(long obj, long value) {
        long __functionAddress = Functions.ConvexPolyhedron_setME;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btConvexPolyhedron_setME(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtConvexPolyhedron_setME(obj, value.address());
    }

    // --- [ btConvexPolyhedron_setRadius ] ---

    public static void btConvexPolyhedron_setRadius(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ConvexPolyhedron_setRadius;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btConvexPolyhedron_testContainment ] ---

    @NativeType("bool")
    public static boolean btConvexPolyhedron_testContainment(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexPolyhedron_testContainment;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btConvexPolyhedron_delete ] ---

    public static void btConvexPolyhedron_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexPolyhedron_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}
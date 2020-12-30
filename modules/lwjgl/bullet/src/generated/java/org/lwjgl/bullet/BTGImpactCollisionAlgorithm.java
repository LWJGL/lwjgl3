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

public class BTGImpactCollisionAlgorithm {

    protected BTGImpactCollisionAlgorithm() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GImpactCollisionAlgorithm_CreateFunc_new           = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCollisionAlgorithm_CreateFunc_new"),
            GImpactCollisionAlgorithm_new                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCollisionAlgorithm_new"),
            GImpactCollisionAlgorithm_getFace0                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCollisionAlgorithm_getFace0"),
            GImpactCollisionAlgorithm_getFace1                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCollisionAlgorithm_getFace1"),
            GImpactCollisionAlgorithm_getPart0                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCollisionAlgorithm_getPart0"),
            GImpactCollisionAlgorithm_getPart1                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCollisionAlgorithm_getPart1"),
            GImpactCollisionAlgorithm_gimpact_vs_compoundshape = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCollisionAlgorithm_gimpact_vs_compoundshape"),
            GImpactCollisionAlgorithm_gimpact_vs_concave       = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCollisionAlgorithm_gimpact_vs_concave"),
            GImpactCollisionAlgorithm_gimpact_vs_gimpact       = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCollisionAlgorithm_gimpact_vs_gimpact"),
            GImpactCollisionAlgorithm_gimpact_vs_shape         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCollisionAlgorithm_gimpact_vs_shape"),
            GImpactCollisionAlgorithm_internalGetResultOut     = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCollisionAlgorithm_internalGetResultOut"),
            GImpactCollisionAlgorithm_registerAlgorithm        = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCollisionAlgorithm_registerAlgorithm"),
            GImpactCollisionAlgorithm_setFace0                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCollisionAlgorithm_setFace0"),
            GImpactCollisionAlgorithm_setFace1                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCollisionAlgorithm_setFace1"),
            GImpactCollisionAlgorithm_setPart0                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCollisionAlgorithm_setPart0"),
            GImpactCollisionAlgorithm_setPart1                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCollisionAlgorithm_setPart1");

    }

    // --- [ btGImpactCollisionAlgorithm_CreateFunc_new ] ---

    @NativeType("void *")
    public static long btGImpactCollisionAlgorithm_CreateFunc_new() {
        long __functionAddress = Functions.GImpactCollisionAlgorithm_CreateFunc_new;
        return invokeP(__functionAddress);
    }

    // --- [ btGImpactCollisionAlgorithm_new ] ---

    @NativeType("void *")
    public static long btGImpactCollisionAlgorithm_new(@NativeType("void *") long ci, @NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap) {
        long __functionAddress = Functions.GImpactCollisionAlgorithm_new;
        if (CHECKS) {
            check(ci);
            check(body0Wrap);
            check(body1Wrap);
        }
        return invokePPPP(ci, body0Wrap, body1Wrap, __functionAddress);
    }

    // --- [ btGImpactCollisionAlgorithm_getFace0 ] ---

    public static int btGImpactCollisionAlgorithm_getFace0(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactCollisionAlgorithm_getFace0;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGImpactCollisionAlgorithm_getFace1 ] ---

    public static int btGImpactCollisionAlgorithm_getFace1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactCollisionAlgorithm_getFace1;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGImpactCollisionAlgorithm_getPart0 ] ---

    public static int btGImpactCollisionAlgorithm_getPart0(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactCollisionAlgorithm_getPart0;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGImpactCollisionAlgorithm_getPart1 ] ---

    public static int btGImpactCollisionAlgorithm_getPart1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactCollisionAlgorithm_getPart1;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGImpactCollisionAlgorithm_gimpact_vs_compoundshape ] ---

    public static void btGImpactCollisionAlgorithm_gimpact_vs_compoundshape(@NativeType("void *") long obj, @NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap, @NativeType("void *") long shape0, @NativeType("void *") long shape1, @NativeType("bool") boolean swapped) {
        long __functionAddress = Functions.GImpactCollisionAlgorithm_gimpact_vs_compoundshape;
        if (CHECKS) {
            check(obj);
            check(body0Wrap);
            check(body1Wrap);
            check(shape0);
            check(shape1);
        }
        invokePPPPPV(obj, body0Wrap, body1Wrap, shape0, shape1, swapped, __functionAddress);
    }

    // --- [ btGImpactCollisionAlgorithm_gimpact_vs_concave ] ---

    public static void btGImpactCollisionAlgorithm_gimpact_vs_concave(@NativeType("void *") long obj, @NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap, @NativeType("void *") long shape0, @NativeType("void *") long shape1, @NativeType("bool") boolean swapped) {
        long __functionAddress = Functions.GImpactCollisionAlgorithm_gimpact_vs_concave;
        if (CHECKS) {
            check(obj);
            check(body0Wrap);
            check(body1Wrap);
            check(shape0);
            check(shape1);
        }
        invokePPPPPV(obj, body0Wrap, body1Wrap, shape0, shape1, swapped, __functionAddress);
    }

    // --- [ btGImpactCollisionAlgorithm_gimpact_vs_gimpact ] ---

    public static void btGImpactCollisionAlgorithm_gimpact_vs_gimpact(@NativeType("void *") long obj, @NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap, @NativeType("void *") long shape0, @NativeType("void *") long shape1) {
        long __functionAddress = Functions.GImpactCollisionAlgorithm_gimpact_vs_gimpact;
        if (CHECKS) {
            check(obj);
            check(body0Wrap);
            check(body1Wrap);
            check(shape0);
            check(shape1);
        }
        invokePPPPPV(obj, body0Wrap, body1Wrap, shape0, shape1, __functionAddress);
    }

    // --- [ btGImpactCollisionAlgorithm_gimpact_vs_shape ] ---

    public static void btGImpactCollisionAlgorithm_gimpact_vs_shape(@NativeType("void *") long obj, @NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap, @NativeType("void *") long shape0, @NativeType("void *") long shape1, @NativeType("bool") boolean swapped) {
        long __functionAddress = Functions.GImpactCollisionAlgorithm_gimpact_vs_shape;
        if (CHECKS) {
            check(obj);
            check(body0Wrap);
            check(body1Wrap);
            check(shape0);
            check(shape1);
        }
        invokePPPPPV(obj, body0Wrap, body1Wrap, shape0, shape1, swapped, __functionAddress);
    }

    // --- [ btGImpactCollisionAlgorithm_internalGetResultOut ] ---

    @NativeType("void *")
    public static long btGImpactCollisionAlgorithm_internalGetResultOut(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactCollisionAlgorithm_internalGetResultOut;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btGImpactCollisionAlgorithm_registerAlgorithm ] ---

    public static void btGImpactCollisionAlgorithm_registerAlgorithm(@NativeType("void *") long dispatcher) {
        long __functionAddress = Functions.GImpactCollisionAlgorithm_registerAlgorithm;
        if (CHECKS) {
            check(dispatcher);
        }
        invokePV(dispatcher, __functionAddress);
    }

    // --- [ btGImpactCollisionAlgorithm_setFace0 ] ---

    public static void btGImpactCollisionAlgorithm_setFace0(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.GImpactCollisionAlgorithm_setFace0;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGImpactCollisionAlgorithm_setFace1 ] ---

    public static void btGImpactCollisionAlgorithm_setFace1(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.GImpactCollisionAlgorithm_setFace1;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGImpactCollisionAlgorithm_setPart0 ] ---

    public static void btGImpactCollisionAlgorithm_setPart0(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.GImpactCollisionAlgorithm_setPart0;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGImpactCollisionAlgorithm_setPart1 ] ---

    public static void btGImpactCollisionAlgorithm_setPart1(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.GImpactCollisionAlgorithm_setPart1;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

}
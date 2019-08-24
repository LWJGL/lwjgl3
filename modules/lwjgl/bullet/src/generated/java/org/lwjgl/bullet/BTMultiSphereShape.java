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

public class BTMultiSphereShape {

    protected BTMultiSphereShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MultiSphereShape_new               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiSphereShape_new"),
            MultiSphereShape_new2              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiSphereShape_new2"),
            MultiSphereShape_getSphereCount    = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiSphereShape_getSphereCount"),
            MultiSphereShape_getSpherePosition = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiSphereShape_getSpherePosition"),
            MultiSphereShape_getSphereRadius   = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiSphereShape_getSphereRadius");

    }

    // --- [ btMultiSphereShape_new ] ---

    public static long nbtMultiSphereShape_new(long positions, long radi, int numSpheres) {
        long __functionAddress = Functions.MultiSphereShape_new;
        return invokePPP(positions, radi, numSpheres, __functionAddress);
    }

    @NativeType("void *")
    public static long btMultiSphereShape_new(@NativeType("btScalar const *") FloatBuffer positions, @NativeType("btScalar const *") FloatBuffer radi) {
        return nbtMultiSphereShape_new(memAddress(positions), memAddress(radi), positions.remaining() / 3);
    }

    // --- [ btMultiSphereShape_new2 ] ---

    public static long nbtMultiSphereShape_new2(long positions, long radi, int numSpheres) {
        long __functionAddress = Functions.MultiSphereShape_new2;
        return invokePPP(positions, radi, numSpheres, __functionAddress);
    }

    @NativeType("void *")
    public static long btMultiSphereShape_new2(@NativeType("btVector3 const *") ΒΤVector3.Buffer positions, @NativeType("btScalar const *") FloatBuffer radi) {
        if (CHECKS) {
            check(radi, positions.remaining());
        }
        return nbtMultiSphereShape_new2(positions.address(), memAddress(radi), positions.remaining());
    }

    // --- [ btMultiSphereShape_getSphereCount ] ---

    public static int btMultiSphereShape_getSphereCount(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiSphereShape_getSphereCount;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiSphereShape_getSpherePosition ] ---

    public static void nbtMultiSphereShape_getSpherePosition(long obj, int index, long value) {
        long __functionAddress = Functions.MultiSphereShape_getSpherePosition;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, index, value, __functionAddress);
    }

    public static void btMultiSphereShape_getSpherePosition(@NativeType("void *") long obj, int index, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiSphereShape_getSpherePosition(obj, index, value.address());
    }

    // --- [ btMultiSphereShape_getSphereRadius ] ---

    @NativeType("btScalar")
    public static float btMultiSphereShape_getSphereRadius(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.MultiSphereShape_getSphereRadius;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, index, __functionAddress);
    }

}
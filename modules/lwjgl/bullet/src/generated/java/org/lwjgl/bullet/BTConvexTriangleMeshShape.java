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

public class BTConvexTriangleMeshShape {

    protected BTConvexTriangleMeshShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ConvexTriangleMeshShape_new                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexTriangleMeshShape_new"),
            ConvexTriangleMeshShape_calculatePrincipalAxisTransform = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexTriangleMeshShape_calculatePrincipalAxisTransform"),
            ConvexTriangleMeshShape_getMeshInterface                = apiGetFunctionAddress(LibBullet.getLibrary(), "btConvexTriangleMeshShape_getMeshInterface");

    }

    // --- [ btConvexTriangleMeshShape_new ] ---

    @NativeType("void *")
    public static long btConvexTriangleMeshShape_new(@NativeType("void *") long meshInterface, @NativeType("bool") boolean calcAabb) {
        long __functionAddress = Functions.ConvexTriangleMeshShape_new;
        if (CHECKS) {
            check(meshInterface);
        }
        return invokePP(meshInterface, calcAabb, __functionAddress);
    }

    // --- [ btConvexTriangleMeshShape_calculatePrincipalAxisTransform ] ---

    public static void nbtConvexTriangleMeshShape_calculatePrincipalAxisTransform(long obj, long principal, long inertia, long volume) {
        long __functionAddress = Functions.ConvexTriangleMeshShape_calculatePrincipalAxisTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPV(obj, principal, inertia, volume, __functionAddress);
    }

    public static void btConvexTriangleMeshShape_calculatePrincipalAxisTransform(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform principal, @NativeType("btVector3 *") BTVector3 inertia, @NativeType("btScalar *") FloatBuffer volume) {
        if (CHECKS) {
            check(volume, 1);
        }
        nbtConvexTriangleMeshShape_calculatePrincipalAxisTransform(obj, principal.address(), inertia.address(), memAddress(volume));
    }

    // --- [ btConvexTriangleMeshShape_getMeshInterface ] ---

    @NativeType("void *")
    public static long btConvexTriangleMeshShape_getMeshInterface(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ConvexTriangleMeshShape_getMeshInterface;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

}
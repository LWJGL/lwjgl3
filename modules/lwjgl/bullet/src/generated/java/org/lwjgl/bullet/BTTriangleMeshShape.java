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

public class BTTriangleMeshShape {

    protected BTTriangleMeshShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            TriangleMeshShape_getLocalAabbMax                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleMeshShape_getLocalAabbMax"),
            TriangleMeshShape_getLocalAabbMin                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleMeshShape_getLocalAabbMin"),
            TriangleMeshShape_getMeshInterface                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleMeshShape_getMeshInterface"),
            TriangleMeshShape_localGetSupportingVertex              = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleMeshShape_localGetSupportingVertex"),
            TriangleMeshShape_localGetSupportingVertexWithoutMargin = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleMeshShape_localGetSupportingVertexWithoutMargin"),
            TriangleMeshShape_recalcLocalAabb                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleMeshShape_recalcLocalAabb");

    }

    // --- [ btTriangleMeshShape_getLocalAabbMax ] ---

    public static void nbtTriangleMeshShape_getLocalAabbMax(long obj, long value) {
        long __functionAddress = Functions.TriangleMeshShape_getLocalAabbMax;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTriangleMeshShape_getLocalAabbMax(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTriangleMeshShape_getLocalAabbMax(obj, value.address());
    }

    // --- [ btTriangleMeshShape_getLocalAabbMin ] ---

    public static void nbtTriangleMeshShape_getLocalAabbMin(long obj, long value) {
        long __functionAddress = Functions.TriangleMeshShape_getLocalAabbMin;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btTriangleMeshShape_getLocalAabbMin(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTriangleMeshShape_getLocalAabbMin(obj, value.address());
    }

    // --- [ btTriangleMeshShape_getMeshInterface ] ---

    @NativeType("void *")
    public static long btTriangleMeshShape_getMeshInterface(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleMeshShape_getMeshInterface;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btTriangleMeshShape_localGetSupportingVertex ] ---

    public static void nbtTriangleMeshShape_localGetSupportingVertex(long obj, long vec, long value) {
        long __functionAddress = Functions.TriangleMeshShape_localGetSupportingVertex;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, vec, value, __functionAddress);
    }

    public static void btTriangleMeshShape_localGetSupportingVertex(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 vec, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTriangleMeshShape_localGetSupportingVertex(obj, vec.address(), value.address());
    }

    // --- [ btTriangleMeshShape_localGetSupportingVertexWithoutMargin ] ---

    public static void nbtTriangleMeshShape_localGetSupportingVertexWithoutMargin(long obj, long vec, long value) {
        long __functionAddress = Functions.TriangleMeshShape_localGetSupportingVertexWithoutMargin;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, vec, value, __functionAddress);
    }

    public static void btTriangleMeshShape_localGetSupportingVertexWithoutMargin(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 vec, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtTriangleMeshShape_localGetSupportingVertexWithoutMargin(obj, vec.address(), value.address());
    }

    // --- [ btTriangleMeshShape_recalcLocalAabb ] ---

    public static void btTriangleMeshShape_recalcLocalAabb(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleMeshShape_recalcLocalAabb;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}
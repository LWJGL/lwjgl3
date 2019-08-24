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

public class BTSphereBoxCollisionAlgorithm {

    protected BTSphereBoxCollisionAlgorithm() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SphereBoxCollisionAlgorithm_CreateFunc_new       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSphereBoxCollisionAlgorithm_CreateFunc_new"),
            SphereBoxCollisionAlgorithm_new                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSphereBoxCollisionAlgorithm_new"),
            SphereBoxCollisionAlgorithm_getSphereDistance    = apiGetFunctionAddress(LibBullet.getLibrary(), "btSphereBoxCollisionAlgorithm_getSphereDistance"),
            SphereBoxCollisionAlgorithm_getSpherePenetration = apiGetFunctionAddress(LibBullet.getLibrary(), "btSphereBoxCollisionAlgorithm_getSpherePenetration");

    }

    // --- [ btSphereBoxCollisionAlgorithm_CreateFunc_new ] ---

    @NativeType("void *")
    public static long btSphereBoxCollisionAlgorithm_CreateFunc_new() {
        long __functionAddress = Functions.SphereBoxCollisionAlgorithm_CreateFunc_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSphereBoxCollisionAlgorithm_new ] ---

    @NativeType("void *")
    public static long btSphereBoxCollisionAlgorithm_new(@NativeType("void *") long mf, @NativeType("void *") long ci, @NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap, @NativeType("bool") boolean isSwapped) {
        long __functionAddress = Functions.SphereBoxCollisionAlgorithm_new;
        if (CHECKS) {
            check(mf);
            check(ci);
            check(body0Wrap);
            check(body1Wrap);
        }
        return invokePPPPP(mf, ci, body0Wrap, body1Wrap, isSwapped, __functionAddress);
    }

    // --- [ btSphereBoxCollisionAlgorithm_getSphereDistance ] ---

    public static boolean nbtSphereBoxCollisionAlgorithm_getSphereDistance(long obj, long boxObjWrap, long v3PointOnBox, long normal, long penetrationDepth, long v3SphereCenter, float fRadius, float maxContactDistance) {
        long __functionAddress = Functions.SphereBoxCollisionAlgorithm_getSphereDistance;
        if (CHECKS) {
            check(obj);
            check(boxObjWrap);
        }
        return invokePPPPPPZ(obj, boxObjWrap, v3PointOnBox, normal, penetrationDepth, v3SphereCenter, fRadius, maxContactDistance, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btSphereBoxCollisionAlgorithm_getSphereDistance(@NativeType("void *") long obj, @NativeType("void *") long boxObjWrap, @NativeType("btVector3 *") ΒΤVector3 v3PointOnBox, @NativeType("btVector3 *") ΒΤVector3 normal, @NativeType("btScalar *") FloatBuffer penetrationDepth, @NativeType("btVector3 const *") ΒΤVector3 v3SphereCenter, @NativeType("btScalar") float fRadius, @NativeType("btScalar") float maxContactDistance) {
        if (CHECKS) {
            check(penetrationDepth, 1);
        }
        return nbtSphereBoxCollisionAlgorithm_getSphereDistance(obj, boxObjWrap, v3PointOnBox.address(), normal.address(), memAddress(penetrationDepth), v3SphereCenter.address(), fRadius, maxContactDistance);
    }

    // --- [ btSphereBoxCollisionAlgorithm_getSpherePenetration ] ---

    public static float nbtSphereBoxCollisionAlgorithm_getSpherePenetration(long obj, long boxHalfExtent, long sphereRelPos, long closestPoint, long normal) {
        long __functionAddress = Functions.SphereBoxCollisionAlgorithm_getSpherePenetration;
        if (CHECKS) {
            check(obj);
        }
        return invokePPPPPF(obj, boxHalfExtent, sphereRelPos, closestPoint, normal, __functionAddress);
    }

    @NativeType("btScalar")
    public static float btSphereBoxCollisionAlgorithm_getSpherePenetration(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 boxHalfExtent, @NativeType("btVector3 const *") ΒΤVector3 sphereRelPos, @NativeType("btVector3 *") ΒΤVector3 closestPoint, @NativeType("btVector3 *") ΒΤVector3 normal) {
        return nbtSphereBoxCollisionAlgorithm_getSpherePenetration(obj, boxHalfExtent.address(), sphereRelPos.address(), closestPoint.address(), normal.address());
    }

}
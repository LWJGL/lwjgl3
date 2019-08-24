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

public class BTIDebugDraw {

    protected BTIDebugDraw() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            IDebugDrawWrapper_new         = apiGetFunctionAddress(LibBullet.getLibrary(), "btIDebugDrawWrapper_new"),
            IDebugDrawWrapper_getGCHandle = apiGetFunctionAddress(LibBullet.getLibrary(), "btIDebugDrawWrapper_getGCHandle"),
            IDebugDraw_delete             = apiGetFunctionAddress(LibBullet.getLibrary(), "btIDebugDraw_delete");

    }

    // --- [ btIDebugDrawWrapper_new ] ---

    @NativeType("void *")
    public static long btIDebugDrawWrapper_new(@NativeType("void *") long debugDrawGCHandle, @NativeType("void *") long drawAabbCallback, @NativeType("void *") long drawArcCallback, @NativeType("void *") long drawBoxCallback, @NativeType("void *") long drawCapsuleCallback, @NativeType("void *") long drawConeCallback, @NativeType("void *") long drawContactPointCallback, @NativeType("void *") long drawCylinderCallback, @NativeType("void *") long drawLineCallback, @NativeType("void *") long drawPlaneCallback, @NativeType("void *") long drawSphereCallback, @NativeType("void *") long drawSpherePatchCallback, @NativeType("void *") long drawTransformCallback, @NativeType("void *") long drawTriangleCallback, @NativeType("void *") long getDebugModeCallback, @NativeType("void *") long cb) {
        long __functionAddress = Functions.IDebugDrawWrapper_new;
        if (CHECKS) {
            check(debugDrawGCHandle);
            check(drawAabbCallback);
            check(drawArcCallback);
            check(drawBoxCallback);
            check(drawCapsuleCallback);
            check(drawConeCallback);
            check(drawContactPointCallback);
            check(drawCylinderCallback);
            check(drawLineCallback);
            check(drawPlaneCallback);
            check(drawSphereCallback);
            check(drawSpherePatchCallback);
            check(drawTransformCallback);
            check(drawTriangleCallback);
            check(getDebugModeCallback);
            check(cb);
        }
        return invokePPPPPPPPPPPPPPPPP(debugDrawGCHandle, drawAabbCallback, drawArcCallback, drawBoxCallback, drawCapsuleCallback, drawConeCallback, drawContactPointCallback, drawCylinderCallback, drawLineCallback, drawPlaneCallback, drawSphereCallback, drawSpherePatchCallback, drawTransformCallback, drawTriangleCallback, getDebugModeCallback, cb, __functionAddress);
    }

    // --- [ btIDebugDrawWrapper_getGCHandle ] ---

    @NativeType("void *")
    public static long btIDebugDrawWrapper_getGCHandle(@NativeType("void *") long obj) {
        long __functionAddress = Functions.IDebugDrawWrapper_getGCHandle;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btIDebugDraw_delete ] ---

    public static void btIDebugDraw_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.IDebugDraw_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}
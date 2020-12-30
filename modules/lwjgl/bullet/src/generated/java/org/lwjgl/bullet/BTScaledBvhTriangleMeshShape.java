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

public class BTScaledBvhTriangleMeshShape {

    protected BTScaledBvhTriangleMeshShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ScaledBvhTriangleMeshShape_new           = apiGetFunctionAddress(LibBullet.getLibrary(), "btScaledBvhTriangleMeshShape_new"),
            ScaledBvhTriangleMeshShape_getChildShape = apiGetFunctionAddress(LibBullet.getLibrary(), "btScaledBvhTriangleMeshShape_getChildShape");

    }

    // --- [ btScaledBvhTriangleMeshShape_new ] ---

    public static long nbtScaledBvhTriangleMeshShape_new(long childShape, long localScaling) {
        long __functionAddress = Functions.ScaledBvhTriangleMeshShape_new;
        if (CHECKS) {
            check(childShape);
        }
        return invokePPP(childShape, localScaling, __functionAddress);
    }

    @NativeType("void *")
    public static long btScaledBvhTriangleMeshShape_new(@NativeType("void *") long childShape, @NativeType("btVector3 const *") BTVector3 localScaling) {
        return nbtScaledBvhTriangleMeshShape_new(childShape, localScaling.address());
    }

    // --- [ btScaledBvhTriangleMeshShape_getChildShape ] ---

    @NativeType("void *")
    public static long btScaledBvhTriangleMeshShape_getChildShape(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ScaledBvhTriangleMeshShape_getChildShape;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

}
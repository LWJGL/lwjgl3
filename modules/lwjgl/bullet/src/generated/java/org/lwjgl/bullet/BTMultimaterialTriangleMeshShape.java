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

public class BTMultimaterialTriangleMeshShape {

    protected BTMultimaterialTriangleMeshShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MultimaterialTriangleMeshShape_new                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultimaterialTriangleMeshShape_new"),
            MultimaterialTriangleMeshShape_new2                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultimaterialTriangleMeshShape_new2"),
            MultimaterialTriangleMeshShape_getMaterialProperties = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultimaterialTriangleMeshShape_getMaterialProperties");

    }

    // --- [ btMultimaterialTriangleMeshShape_new ] ---

    @NativeType("void *")
    public static long btMultimaterialTriangleMeshShape_new(@NativeType("void *") long meshInterface, @NativeType("bool") boolean useQuantizedAabbCompression, @NativeType("bool") boolean buildBvh) {
        long __functionAddress = Functions.MultimaterialTriangleMeshShape_new;
        if (CHECKS) {
            check(meshInterface);
        }
        return invokePP(meshInterface, useQuantizedAabbCompression, buildBvh, __functionAddress);
    }

    // --- [ btMultimaterialTriangleMeshShape_new2 ] ---

    public static long nbtMultimaterialTriangleMeshShape_new2(long meshInterface, boolean useQuantizedAabbCompression, long bvhAabbMin, long bvhAabbMax, boolean buildBvh) {
        long __functionAddress = Functions.MultimaterialTriangleMeshShape_new2;
        if (CHECKS) {
            check(meshInterface);
        }
        return invokePPPP(meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, buildBvh, __functionAddress);
    }

    @NativeType("void *")
    public static long btMultimaterialTriangleMeshShape_new2(@NativeType("void *") long meshInterface, @NativeType("bool") boolean useQuantizedAabbCompression, @NativeType("btVector3 const *") BTVector3 bvhAabbMin, @NativeType("btVector3 const *") BTVector3 bvhAabbMax, @NativeType("bool") boolean buildBvh) {
        return nbtMultimaterialTriangleMeshShape_new2(meshInterface, useQuantizedAabbCompression, bvhAabbMin.address(), bvhAabbMax.address(), buildBvh);
    }

    // --- [ btMultimaterialTriangleMeshShape_getMaterialProperties ] ---

    @NativeType("void *")
    public static long btMultimaterialTriangleMeshShape_getMaterialProperties(@NativeType("void *") long obj, int partID, int triIndex) {
        long __functionAddress = Functions.MultimaterialTriangleMeshShape_getMaterialProperties;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, partID, triIndex, __functionAddress);
    }

}
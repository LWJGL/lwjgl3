/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class BTShapeHull {

    protected BTShapeHull() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ShapeHull_new              = apiGetFunctionAddress(LibBullet.getLibrary(), "btShapeHull_new"),
            ShapeHull_buildHull        = apiGetFunctionAddress(LibBullet.getLibrary(), "btShapeHull_buildHull"),
            ShapeHull_getIndexPointer  = apiGetFunctionAddress(LibBullet.getLibrary(), "btShapeHull_getIndexPointer"),
            ShapeHull_getVertexPointer = apiGetFunctionAddress(LibBullet.getLibrary(), "btShapeHull_getVertexPointer"),
            ShapeHull_numIndices       = apiGetFunctionAddress(LibBullet.getLibrary(), "btShapeHull_numIndices"),
            ShapeHull_numTriangles     = apiGetFunctionAddress(LibBullet.getLibrary(), "btShapeHull_numTriangles"),
            ShapeHull_numVertices      = apiGetFunctionAddress(LibBullet.getLibrary(), "btShapeHull_numVertices"),
            ShapeHull_delete           = apiGetFunctionAddress(LibBullet.getLibrary(), "btShapeHull_delete");

    }

    // --- [ btShapeHull_new ] ---

    @NativeType("void *")
    public static long btShapeHull_new(@NativeType("void *") long shape) {
        long __functionAddress = Functions.ShapeHull_new;
        if (CHECKS) {
            check(shape);
        }
        return invokePP(shape, __functionAddress);
    }

    // --- [ btShapeHull_buildHull ] ---

    @NativeType("bool")
    public static boolean btShapeHull_buildHull(@NativeType("void *") long obj, @NativeType("btScalar") float margin, int highRes) {
        long __functionAddress = Functions.ShapeHull_buildHull;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, margin, highRes, __functionAddress);
    }

    // --- [ btShapeHull_getIndexPointer ] ---

    @NativeType("void const *")
    public static long btShapeHull_getIndexPointer(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ShapeHull_getIndexPointer;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btShapeHull_getVertexPointer ] ---

    public static long nbtShapeHull_getVertexPointer(long obj) {
        long __functionAddress = Functions.ShapeHull_getVertexPointer;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("btVector3 const *")
    public static ΒΤVector3 btShapeHull_getVertexPointer(@NativeType("void *") long obj) {
        long __result = nbtShapeHull_getVertexPointer(obj);
        return ΒΤVector3.createSafe(__result);
    }

    // --- [ btShapeHull_numIndices ] ---

    public static int btShapeHull_numIndices(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ShapeHull_numIndices;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btShapeHull_numTriangles ] ---

    public static int btShapeHull_numTriangles(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ShapeHull_numTriangles;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btShapeHull_numVertices ] ---

    public static int btShapeHull_numVertices(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ShapeHull_numVertices;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btShapeHull_delete ] ---

    public static void btShapeHull_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ShapeHull_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}
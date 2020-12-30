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

public class BTTriangleMesh {

    protected BTTriangleMesh() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            TriangleMesh_new                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleMesh_new"),
            TriangleMesh_addIndex                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleMesh_addIndex"),
            TriangleMesh_addTriangle              = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleMesh_addTriangle"),
            TriangleMesh_addTriangleIndices       = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleMesh_addTriangleIndices"),
            TriangleMesh_findOrAddVertex          = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleMesh_findOrAddVertex"),
            TriangleMesh_getNumTriangles          = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleMesh_getNumTriangles"),
            TriangleMesh_getUse32bitIndices       = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleMesh_getUse32bitIndices"),
            TriangleMesh_getUse4componentVertices = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleMesh_getUse4componentVertices"),
            TriangleMesh_getWeldingThreshold      = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleMesh_getWeldingThreshold"),
            TriangleMesh_setWeldingThreshold      = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleMesh_setWeldingThreshold");

    }

    // --- [ btTriangleMesh_new ] ---

    @NativeType("void *")
    public static long btTriangleMesh_new(@NativeType("bool") boolean use32bitIndices, @NativeType("bool") boolean use4componentVertices) {
        long __functionAddress = Functions.TriangleMesh_new;
        return invokeP(use32bitIndices, use4componentVertices, __functionAddress);
    }

    // --- [ btTriangleMesh_addIndex ] ---

    public static void btTriangleMesh_addIndex(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.TriangleMesh_addIndex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, __functionAddress);
    }

    // --- [ btTriangleMesh_addTriangle ] ---

    public static void nbtTriangleMesh_addTriangle(long obj, long vertex0, long vertex1, long vertex2, boolean removeDuplicateVertices) {
        long __functionAddress = Functions.TriangleMesh_addTriangle;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPV(obj, vertex0, vertex1, vertex2, removeDuplicateVertices, __functionAddress);
    }

    public static void btTriangleMesh_addTriangle(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 vertex0, @NativeType("btVector3 const *") BTVector3 vertex1, @NativeType("btVector3 const *") BTVector3 vertex2, @NativeType("bool") boolean removeDuplicateVertices) {
        nbtTriangleMesh_addTriangle(obj, vertex0.address(), vertex1.address(), vertex2.address(), removeDuplicateVertices);
    }

    // --- [ btTriangleMesh_addTriangleIndices ] ---

    public static void btTriangleMesh_addTriangleIndices(@NativeType("void *") long obj, int index1, int index2, int index3) {
        long __functionAddress = Functions.TriangleMesh_addTriangleIndices;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index1, index2, index3, __functionAddress);
    }

    // --- [ btTriangleMesh_findOrAddVertex ] ---

    public static int nbtTriangleMesh_findOrAddVertex(long obj, long vertex, boolean removeDuplicateVertices) {
        long __functionAddress = Functions.TriangleMesh_findOrAddVertex;
        if (CHECKS) {
            check(obj);
        }
        return invokePPI(obj, vertex, removeDuplicateVertices, __functionAddress);
    }

    public static int btTriangleMesh_findOrAddVertex(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 vertex, @NativeType("bool") boolean removeDuplicateVertices) {
        return nbtTriangleMesh_findOrAddVertex(obj, vertex.address(), removeDuplicateVertices);
    }

    // --- [ btTriangleMesh_getNumTriangles ] ---

    public static int btTriangleMesh_getNumTriangles(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleMesh_getNumTriangles;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btTriangleMesh_getUse32bitIndices ] ---

    @NativeType("bool")
    public static boolean btTriangleMesh_getUse32bitIndices(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleMesh_getUse32bitIndices;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btTriangleMesh_getUse4componentVertices ] ---

    @NativeType("bool")
    public static boolean btTriangleMesh_getUse4componentVertices(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleMesh_getUse4componentVertices;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btTriangleMesh_getWeldingThreshold ] ---

    @NativeType("btScalar")
    public static float btTriangleMesh_getWeldingThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleMesh_getWeldingThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btTriangleMesh_setWeldingThreshold ] ---

    public static void btTriangleMesh_setWeldingThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.TriangleMesh_setWeldingThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

}
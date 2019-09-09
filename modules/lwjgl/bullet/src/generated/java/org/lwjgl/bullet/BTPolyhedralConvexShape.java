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

public class BTPolyhedralConvexShape {

    protected BTPolyhedralConvexShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            PolyhedralConvexShape_getConvexPolyhedron          = apiGetFunctionAddress(LibBullet.getLibrary(), "btPolyhedralConvexShape_getConvexPolyhedron"),
            PolyhedralConvexShape_getEdge                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btPolyhedralConvexShape_getEdge"),
            PolyhedralConvexShape_getNumEdges                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btPolyhedralConvexShape_getNumEdges"),
            PolyhedralConvexShape_getNumPlanes                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btPolyhedralConvexShape_getNumPlanes"),
            PolyhedralConvexShape_getNumVertices               = apiGetFunctionAddress(LibBullet.getLibrary(), "btPolyhedralConvexShape_getNumVertices"),
            PolyhedralConvexShape_getPlane                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btPolyhedralConvexShape_getPlane"),
            PolyhedralConvexShape_getVertex                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btPolyhedralConvexShape_getVertex"),
            PolyhedralConvexShape_initializePolyhedralFeatures = apiGetFunctionAddress(LibBullet.getLibrary(), "btPolyhedralConvexShape_initializePolyhedralFeatures"),
            PolyhedralConvexShape_isInside                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btPolyhedralConvexShape_isInside"),
            PolyhedralConvexShape_setPolyhedralFeatures        = apiGetFunctionAddress(LibBullet.getLibrary(), "btPolyhedralConvexShape_setPolyhedralFeatures"),
            PolyhedralConvexAabbCachingShape_getNonvirtualAabb = apiGetFunctionAddress(LibBullet.getLibrary(), "btPolyhedralConvexAabbCachingShape_getNonvirtualAabb"),
            PolyhedralConvexAabbCachingShape_recalcLocalAabb   = apiGetFunctionAddress(LibBullet.getLibrary(), "btPolyhedralConvexAabbCachingShape_recalcLocalAabb");

    }

    // --- [ btPolyhedralConvexShape_getConvexPolyhedron ] ---

    @NativeType("void *")
    public static long btPolyhedralConvexShape_getConvexPolyhedron(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PolyhedralConvexShape_getConvexPolyhedron;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btPolyhedralConvexShape_getEdge ] ---

    public static void nbtPolyhedralConvexShape_getEdge(long obj, int i, long pa, long pb) {
        long __functionAddress = Functions.PolyhedralConvexShape_getEdge;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, i, pa, pb, __functionAddress);
    }

    public static void btPolyhedralConvexShape_getEdge(@NativeType("void *") long obj, int i, @NativeType("btVector3 *") BTVector3 pa, @NativeType("btVector3 *") BTVector3 pb) {
        nbtPolyhedralConvexShape_getEdge(obj, i, pa.address(), pb.address());
    }

    // --- [ btPolyhedralConvexShape_getNumEdges ] ---

    public static int btPolyhedralConvexShape_getNumEdges(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PolyhedralConvexShape_getNumEdges;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btPolyhedralConvexShape_getNumPlanes ] ---

    public static int btPolyhedralConvexShape_getNumPlanes(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PolyhedralConvexShape_getNumPlanes;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btPolyhedralConvexShape_getNumVertices ] ---

    public static int btPolyhedralConvexShape_getNumVertices(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PolyhedralConvexShape_getNumVertices;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btPolyhedralConvexShape_getPlane ] ---

    public static void nbtPolyhedralConvexShape_getPlane(long obj, long planeNormal, long planeSupport, int i) {
        long __functionAddress = Functions.PolyhedralConvexShape_getPlane;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, planeNormal, planeSupport, i, __functionAddress);
    }

    public static void btPolyhedralConvexShape_getPlane(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 planeNormal, @NativeType("btVector3 *") BTVector3 planeSupport, int i) {
        nbtPolyhedralConvexShape_getPlane(obj, planeNormal.address(), planeSupport.address(), i);
    }

    // --- [ btPolyhedralConvexShape_getVertex ] ---

    public static void nbtPolyhedralConvexShape_getVertex(long obj, int i, long vtx) {
        long __functionAddress = Functions.PolyhedralConvexShape_getVertex;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, i, vtx, __functionAddress);
    }

    public static void btPolyhedralConvexShape_getVertex(@NativeType("void *") long obj, int i, @NativeType("btVector3 *") BTVector3 vtx) {
        nbtPolyhedralConvexShape_getVertex(obj, i, vtx.address());
    }

    // --- [ btPolyhedralConvexShape_initializePolyhedralFeatures ] ---

    @NativeType("bool")
    public static boolean btPolyhedralConvexShape_initializePolyhedralFeatures(@NativeType("void *") long obj, int shiftVerticesByMargin) {
        long __functionAddress = Functions.PolyhedralConvexShape_initializePolyhedralFeatures;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, shiftVerticesByMargin, __functionAddress);
    }

    // --- [ btPolyhedralConvexShape_isInside ] ---

    public static boolean nbtPolyhedralConvexShape_isInside(long obj, long pt, float tolerance) {
        long __functionAddress = Functions.PolyhedralConvexShape_isInside;
        if (CHECKS) {
            check(obj);
        }
        return invokePPZ(obj, pt, tolerance, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btPolyhedralConvexShape_isInside(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 pt, @NativeType("btScalar") float tolerance) {
        return nbtPolyhedralConvexShape_isInside(obj, pt.address(), tolerance);
    }

    // --- [ btPolyhedralConvexShape_setPolyhedralFeatures ] ---

    public static void btPolyhedralConvexShape_setPolyhedralFeatures(@NativeType("void *") long obj, @NativeType("void *") long polyhedron) {
        long __functionAddress = Functions.PolyhedralConvexShape_setPolyhedralFeatures;
        if (CHECKS) {
            check(obj);
            check(polyhedron);
        }
        invokePPV(obj, polyhedron, __functionAddress);
    }

    // --- [ btPolyhedralConvexAabbCachingShape_getNonvirtualAabb ] ---

    public static void nbtPolyhedralConvexAabbCachingShape_getNonvirtualAabb(long obj, long trans, long aabbMin, long aabbMax, float margin) {
        long __functionAddress = Functions.PolyhedralConvexAabbCachingShape_getNonvirtualAabb;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPV(obj, trans, aabbMin, aabbMax, margin, __functionAddress);
    }

    public static void btPolyhedralConvexAabbCachingShape_getNonvirtualAabb(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform trans, @NativeType("btVector3 *") BTVector3 aabbMin, @NativeType("btVector3 *") BTVector3 aabbMax, @NativeType("btScalar") float margin) {
        nbtPolyhedralConvexAabbCachingShape_getNonvirtualAabb(obj, trans.address(), aabbMin.address(), aabbMax.address(), margin);
    }

    // --- [ btPolyhedralConvexAabbCachingShape_recalcLocalAabb ] ---

    public static void btPolyhedralConvexAabbCachingShape_recalcLocalAabb(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PolyhedralConvexAabbCachingShape_recalcLocalAabb;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}
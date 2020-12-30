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

public class BTGImpactShape {

    protected BTGImpactShape() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            TetrahedronShapeEx_new                                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btTetrahedronShapeEx_new"),
            TetrahedronShapeEx_setVertices                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btTetrahedronShapeEx_setVertices"),
            GImpactShapeInterface_childrenHasTransform                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactShapeInterface_childrenHasTransform"),
            GImpactShapeInterface_getBoxSet                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactShapeInterface_getBoxSet"),
            GImpactShapeInterface_getBulletTetrahedron                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactShapeInterface_getBulletTetrahedron"),
            GImpactShapeInterface_getBulletTriangle                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactShapeInterface_getBulletTriangle"),
            GImpactShapeInterface_getChildAabb                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactShapeInterface_getChildAabb"),
            GImpactShapeInterface_getChildShape                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactShapeInterface_getChildShape"),
            GImpactShapeInterface_getChildTransform                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactShapeInterface_getChildTransform"),
            GImpactShapeInterface_getGImpactShapeType                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactShapeInterface_getGImpactShapeType"),
            GImpactShapeInterface_getLocalBox                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactShapeInterface_getLocalBox"),
            GImpactShapeInterface_getNumChildShapes                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactShapeInterface_getNumChildShapes"),
            GImpactShapeInterface_getPrimitiveManager                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactShapeInterface_getPrimitiveManager"),
            GImpactShapeInterface_getPrimitiveTriangle                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactShapeInterface_getPrimitiveTriangle"),
            GImpactShapeInterface_hasBoxSet                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactShapeInterface_hasBoxSet"),
            GImpactShapeInterface_lockChildShapes                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactShapeInterface_lockChildShapes"),
            GImpactShapeInterface_needsRetrieveTetrahedrons                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactShapeInterface_needsRetrieveTetrahedrons"),
            GImpactShapeInterface_needsRetrieveTriangles                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactShapeInterface_needsRetrieveTriangles"),
            GImpactShapeInterface_postUpdate                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactShapeInterface_postUpdate"),
            GImpactShapeInterface_processAllTrianglesRay                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactShapeInterface_processAllTrianglesRay"),
            GImpactShapeInterface_rayTest                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactShapeInterface_rayTest"),
            GImpactShapeInterface_setChildTransform                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactShapeInterface_setChildTransform"),
            GImpactShapeInterface_unlockChildShapes                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactShapeInterface_unlockChildShapes"),
            GImpactShapeInterface_updateBound                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactShapeInterface_updateBound"),
            GImpactCompoundShape_CompoundPrimitiveManager_new                = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCompoundShape_CompoundPrimitiveManager_new"),
            GImpactCompoundShape_CompoundPrimitiveManager_new2               = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCompoundShape_CompoundPrimitiveManager_new2"),
            GImpactCompoundShape_CompoundPrimitiveManager_new3               = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCompoundShape_CompoundPrimitiveManager_new3"),
            GImpactCompoundShape_CompoundPrimitiveManager_getCompoundShape   = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCompoundShape_CompoundPrimitiveManager_getCompoundShape"),
            GImpactCompoundShape_CompoundPrimitiveManager_setCompoundShape   = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCompoundShape_CompoundPrimitiveManager_setCompoundShape"),
            GImpactCompoundShape_new                                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCompoundShape_new"),
            GImpactCompoundShape_addChildShape                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCompoundShape_addChildShape"),
            GImpactCompoundShape_addChildShape2                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCompoundShape_addChildShape2"),
            GImpactCompoundShape_getCompoundPrimitiveManager                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactCompoundShape_getCompoundPrimitiveManager"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_new                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_new"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_new2                = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_new2"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_new3                = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_new3"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_get_bullet_triangle = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_get_bullet_triangle"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_get_indices         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_get_indices"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_get_vertex          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_get_vertex"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_get_vertex_count    = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_get_vertex_count"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_getIndexbase        = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_getIndexbase"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_getIndexstride      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_getIndexstride"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_getIndicestype      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_getIndicestype"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_getLock_count       = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_getLock_count"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_getMargin           = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_getMargin"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_getMeshInterface    = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_getMeshInterface"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_getNumfaces         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_getNumfaces"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_getNumverts         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_getNumverts"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_getPart             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_getPart"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_getScale            = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_getScale"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_getStride           = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_getStride"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_getType             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_getType"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_getVertexbase       = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_getVertexbase"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_lock                = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_lock"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_setIndexbase        = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_setIndexbase"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_setIndexstride      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_setIndexstride"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_setIndicestype      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_setIndicestype"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_setLock_count       = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_setLock_count"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_setMargin           = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_setMargin"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_setMeshInterface    = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_setMeshInterface"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_setNumfaces         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_setNumfaces"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_setNumverts         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_setNumverts"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_setPart             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_setPart"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_setScale            = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_setScale"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_setStride           = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_setStride"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_setType             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_setType"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_setVertexbase       = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_setVertexbase"),
            GImpactMeshShapePart_TrimeshPrimitiveManager_unlock              = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_TrimeshPrimitiveManager_unlock"),
            GImpactMeshShapePart_new                                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_new"),
            GImpactMeshShapePart_new2                                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_new2"),
            GImpactMeshShapePart_getPart                                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_getPart"),
            GImpactMeshShapePart_getTrimeshPrimitiveManager                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_getTrimeshPrimitiveManager"),
            GImpactMeshShapePart_getVertex                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_getVertex"),
            GImpactMeshShapePart_getVertexCount                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShapePart_getVertexCount"),
            GImpactMeshShape_new                                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShape_new"),
            GImpactMeshShape_getMeshInterface                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShape_getMeshInterface"),
            GImpactMeshShape_getMeshPart                                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShape_getMeshPart"),
            GImpactMeshShape_getMeshPartCount                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btGImpactMeshShape_getMeshPartCount");

    }

    // --- [ btTetrahedronShapeEx_new ] ---

    @NativeType("void *")
    public static long btTetrahedronShapeEx_new() {
        long __functionAddress = Functions.TetrahedronShapeEx_new;
        return invokeP(__functionAddress);
    }

    // --- [ btTetrahedronShapeEx_setVertices ] ---

    public static void nbtTetrahedronShapeEx_setVertices(long obj, long v0, long v1, long v2, long v3) {
        long __functionAddress = Functions.TetrahedronShapeEx_setVertices;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPPV(obj, v0, v1, v2, v3, __functionAddress);
    }

    public static void btTetrahedronShapeEx_setVertices(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 v0, @NativeType("btVector3 const *") BTVector3 v1, @NativeType("btVector3 const *") BTVector3 v2, @NativeType("btVector3 const *") BTVector3 v3) {
        nbtTetrahedronShapeEx_setVertices(obj, v0.address(), v1.address(), v2.address(), v3.address());
    }

    // --- [ btGImpactShapeInterface_childrenHasTransform ] ---

    @NativeType("bool")
    public static boolean btGImpactShapeInterface_childrenHasTransform(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactShapeInterface_childrenHasTransform;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btGImpactShapeInterface_getBoxSet ] ---

    @NativeType("void *")
    public static long btGImpactShapeInterface_getBoxSet(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactShapeInterface_getBoxSet;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btGImpactShapeInterface_getBulletTetrahedron ] ---

    public static void btGImpactShapeInterface_getBulletTetrahedron(@NativeType("void *") long obj, int prim_index, @NativeType("void *") long tetrahedron) {
        long __functionAddress = Functions.GImpactShapeInterface_getBulletTetrahedron;
        if (CHECKS) {
            check(obj);
            check(tetrahedron);
        }
        invokePPV(obj, prim_index, tetrahedron, __functionAddress);
    }

    // --- [ btGImpactShapeInterface_getBulletTriangle ] ---

    public static void btGImpactShapeInterface_getBulletTriangle(@NativeType("void *") long obj, int prim_index, @NativeType("void *") long triangle) {
        long __functionAddress = Functions.GImpactShapeInterface_getBulletTriangle;
        if (CHECKS) {
            check(obj);
            check(triangle);
        }
        invokePPV(obj, prim_index, triangle, __functionAddress);
    }

    // --- [ btGImpactShapeInterface_getChildAabb ] ---

    public static void nbtGImpactShapeInterface_getChildAabb(long obj, int child_index, long t, long aabbMin, long aabbMax) {
        long __functionAddress = Functions.GImpactShapeInterface_getChildAabb;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPV(obj, child_index, t, aabbMin, aabbMax, __functionAddress);
    }

    public static void btGImpactShapeInterface_getChildAabb(@NativeType("void *") long obj, int child_index, @NativeType("btTransform const *") BTTransform t, @NativeType("btVector3 *") BTVector3 aabbMin, @NativeType("btVector3 *") BTVector3 aabbMax) {
        nbtGImpactShapeInterface_getChildAabb(obj, child_index, t.address(), aabbMin.address(), aabbMax.address());
    }

    // --- [ btGImpactShapeInterface_getChildShape ] ---

    @NativeType("void *")
    public static long btGImpactShapeInterface_getChildShape(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.GImpactShapeInterface_getChildShape;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btGImpactShapeInterface_getChildTransform ] ---

    public static void nbtGImpactShapeInterface_getChildTransform(long obj, int index, long value) {
        long __functionAddress = Functions.GImpactShapeInterface_getChildTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, index, value, __functionAddress);
    }

    public static void btGImpactShapeInterface_getChildTransform(@NativeType("void *") long obj, int index, @NativeType("btTransform *") BTTransform value) {
        nbtGImpactShapeInterface_getChildTransform(obj, index, value.address());
    }

    // --- [ btGImpactShapeInterface_getGImpactShapeType ] ---

    public static int btGImpactShapeInterface_getGImpactShapeType(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactShapeInterface_getGImpactShapeType;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGImpactShapeInterface_getLocalBox ] ---

    @NativeType("void *")
    public static long btGImpactShapeInterface_getLocalBox(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactShapeInterface_getLocalBox;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btGImpactShapeInterface_getNumChildShapes ] ---

    public static int btGImpactShapeInterface_getNumChildShapes(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactShapeInterface_getNumChildShapes;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGImpactShapeInterface_getPrimitiveManager ] ---

    @NativeType("void *")
    public static long btGImpactShapeInterface_getPrimitiveManager(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactShapeInterface_getPrimitiveManager;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btGImpactShapeInterface_getPrimitiveTriangle ] ---

    public static void btGImpactShapeInterface_getPrimitiveTriangle(@NativeType("void *") long obj, int index, @NativeType("void *") long triangle) {
        long __functionAddress = Functions.GImpactShapeInterface_getPrimitiveTriangle;
        if (CHECKS) {
            check(obj);
            check(triangle);
        }
        invokePPV(obj, index, triangle, __functionAddress);
    }

    // --- [ btGImpactShapeInterface_hasBoxSet ] ---

    @NativeType("bool")
    public static boolean btGImpactShapeInterface_hasBoxSet(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactShapeInterface_hasBoxSet;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btGImpactShapeInterface_lockChildShapes ] ---

    public static void btGImpactShapeInterface_lockChildShapes(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactShapeInterface_lockChildShapes;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGImpactShapeInterface_needsRetrieveTetrahedrons ] ---

    @NativeType("bool")
    public static boolean btGImpactShapeInterface_needsRetrieveTetrahedrons(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactShapeInterface_needsRetrieveTetrahedrons;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btGImpactShapeInterface_needsRetrieveTriangles ] ---

    @NativeType("bool")
    public static boolean btGImpactShapeInterface_needsRetrieveTriangles(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactShapeInterface_needsRetrieveTriangles;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btGImpactShapeInterface_postUpdate ] ---

    public static void btGImpactShapeInterface_postUpdate(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactShapeInterface_postUpdate;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGImpactShapeInterface_processAllTrianglesRay ] ---

    public static void nbtGImpactShapeInterface_processAllTrianglesRay(long obj, long __unnamed0, long __unnamed1, long __unnamed2) {
        long __functionAddress = Functions.GImpactShapeInterface_processAllTrianglesRay;
        if (CHECKS) {
            check(obj);
            check(__unnamed0);
        }
        invokePPPPV(obj, __unnamed0, __unnamed1, __unnamed2, __functionAddress);
    }

    public static void btGImpactShapeInterface_processAllTrianglesRay(@NativeType("void *") long obj, @NativeType("void *") long __unnamed0, @NativeType("btVector3 const *") BTVector3 __unnamed1, @NativeType("btVector3 const *") BTVector3 __unnamed2) {
        nbtGImpactShapeInterface_processAllTrianglesRay(obj, __unnamed0, __unnamed1.address(), __unnamed2.address());
    }

    // --- [ btGImpactShapeInterface_rayTest ] ---

    public static void nbtGImpactShapeInterface_rayTest(long obj, long rayFrom, long rayTo, long resultCallback) {
        long __functionAddress = Functions.GImpactShapeInterface_rayTest;
        if (CHECKS) {
            check(obj);
            check(resultCallback);
        }
        invokePPPPV(obj, rayFrom, rayTo, resultCallback, __functionAddress);
    }

    public static void btGImpactShapeInterface_rayTest(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 rayFrom, @NativeType("btVector3 const *") BTVector3 rayTo, @NativeType("void *") long resultCallback) {
        nbtGImpactShapeInterface_rayTest(obj, rayFrom.address(), rayTo.address(), resultCallback);
    }

    // --- [ btGImpactShapeInterface_setChildTransform ] ---

    public static void nbtGImpactShapeInterface_setChildTransform(long obj, int index, long transform) {
        long __functionAddress = Functions.GImpactShapeInterface_setChildTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, index, transform, __functionAddress);
    }

    public static void btGImpactShapeInterface_setChildTransform(@NativeType("void *") long obj, int index, @NativeType("btTransform const *") BTTransform transform) {
        nbtGImpactShapeInterface_setChildTransform(obj, index, transform.address());
    }

    // --- [ btGImpactShapeInterface_unlockChildShapes ] ---

    public static void btGImpactShapeInterface_unlockChildShapes(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactShapeInterface_unlockChildShapes;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGImpactShapeInterface_updateBound ] ---

    public static void btGImpactShapeInterface_updateBound(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactShapeInterface_updateBound;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGImpactCompoundShape_CompoundPrimitiveManager_new ] ---

    @NativeType("void *")
    public static long btGImpactCompoundShape_CompoundPrimitiveManager_new(@NativeType("void *") long compound) {
        long __functionAddress = Functions.GImpactCompoundShape_CompoundPrimitiveManager_new;
        if (CHECKS) {
            check(compound);
        }
        return invokePP(compound, __functionAddress);
    }

    // --- [ btGImpactCompoundShape_CompoundPrimitiveManager_new2 ] ---

    @NativeType("void *")
    public static long btGImpactCompoundShape_CompoundPrimitiveManager_new2(@NativeType("void *") long compoundShape) {
        long __functionAddress = Functions.GImpactCompoundShape_CompoundPrimitiveManager_new2;
        if (CHECKS) {
            check(compoundShape);
        }
        return invokePP(compoundShape, __functionAddress);
    }

    // --- [ btGImpactCompoundShape_CompoundPrimitiveManager_new3 ] ---

    @NativeType("void *")
    public static long btGImpactCompoundShape_CompoundPrimitiveManager_new3() {
        long __functionAddress = Functions.GImpactCompoundShape_CompoundPrimitiveManager_new3;
        return invokeP(__functionAddress);
    }

    // --- [ btGImpactCompoundShape_CompoundPrimitiveManager_getCompoundShape ] ---

    @NativeType("void *")
    public static long btGImpactCompoundShape_CompoundPrimitiveManager_getCompoundShape(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactCompoundShape_CompoundPrimitiveManager_getCompoundShape;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btGImpactCompoundShape_CompoundPrimitiveManager_setCompoundShape ] ---

    public static void btGImpactCompoundShape_CompoundPrimitiveManager_setCompoundShape(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.GImpactCompoundShape_CompoundPrimitiveManager_setCompoundShape;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btGImpactCompoundShape_new ] ---

    @NativeType("void *")
    public static long btGImpactCompoundShape_new(@NativeType("bool") boolean children_has_transform) {
        long __functionAddress = Functions.GImpactCompoundShape_new;
        return invokeP(children_has_transform, __functionAddress);
    }

    // --- [ btGImpactCompoundShape_addChildShape ] ---

    public static void nbtGImpactCompoundShape_addChildShape(long obj, long localTransform, long shape) {
        long __functionAddress = Functions.GImpactCompoundShape_addChildShape;
        if (CHECKS) {
            check(obj);
            check(shape);
        }
        invokePPPV(obj, localTransform, shape, __functionAddress);
    }

    public static void btGImpactCompoundShape_addChildShape(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform localTransform, @NativeType("void *") long shape) {
        nbtGImpactCompoundShape_addChildShape(obj, localTransform.address(), shape);
    }

    // --- [ btGImpactCompoundShape_addChildShape2 ] ---

    public static void btGImpactCompoundShape_addChildShape2(@NativeType("void *") long obj, @NativeType("void *") long shape) {
        long __functionAddress = Functions.GImpactCompoundShape_addChildShape2;
        if (CHECKS) {
            check(obj);
            check(shape);
        }
        invokePPV(obj, shape, __functionAddress);
    }

    // --- [ btGImpactCompoundShape_getCompoundPrimitiveManager ] ---

    @NativeType("void *")
    public static long btGImpactCompoundShape_getCompoundPrimitiveManager(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactCompoundShape_getCompoundPrimitiveManager;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_new ] ---

    @NativeType("void *")
    public static long btGImpactMeshShapePart_TrimeshPrimitiveManager_new(@NativeType("void *") long meshInterface, int part) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_new;
        if (CHECKS) {
            check(meshInterface);
        }
        return invokePP(meshInterface, part, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_new2 ] ---

    @NativeType("void *")
    public static long btGImpactMeshShapePart_TrimeshPrimitiveManager_new2(@NativeType("void *") long manager) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_new2;
        if (CHECKS) {
            check(manager);
        }
        return invokePP(manager, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_new3 ] ---

    @NativeType("void *")
    public static long btGImpactMeshShapePart_TrimeshPrimitiveManager_new3() {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_new3;
        return invokeP(__functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_get_bullet_triangle ] ---

    public static void btGImpactMeshShapePart_TrimeshPrimitiveManager_get_bullet_triangle(@NativeType("void *") long obj, int prim_index, @NativeType("void *") long triangle) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_get_bullet_triangle;
        if (CHECKS) {
            check(obj);
            check(triangle);
        }
        invokePPV(obj, prim_index, triangle, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_get_indices ] ---

    public static void nbtGImpactMeshShapePart_TrimeshPrimitiveManager_get_indices(long obj, int face_index, long i0, long i1, long i2) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_get_indices;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPV(obj, face_index, i0, i1, i2, __functionAddress);
    }

    public static void btGImpactMeshShapePart_TrimeshPrimitiveManager_get_indices(@NativeType("void *") long obj, int face_index, @NativeType("unsigned int *") IntBuffer i0, @NativeType("unsigned int *") IntBuffer i1, @NativeType("unsigned int *") IntBuffer i2) {
        if (CHECKS) {
            check(i0, 1);
            check(i1, 1);
            check(i2, 1);
        }
        nbtGImpactMeshShapePart_TrimeshPrimitiveManager_get_indices(obj, face_index, memAddress(i0), memAddress(i1), memAddress(i2));
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_get_vertex ] ---

    public static void nbtGImpactMeshShapePart_TrimeshPrimitiveManager_get_vertex(long obj, int vertex_index, long vertex) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_get_vertex;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, vertex_index, vertex, __functionAddress);
    }

    public static void btGImpactMeshShapePart_TrimeshPrimitiveManager_get_vertex(@NativeType("void *") long obj, @NativeType("unsigned int") int vertex_index, @NativeType("btVector3 *") BTVector3 vertex) {
        nbtGImpactMeshShapePart_TrimeshPrimitiveManager_get_vertex(obj, vertex_index, vertex.address());
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_get_vertex_count ] ---

    public static int btGImpactMeshShapePart_TrimeshPrimitiveManager_get_vertex_count(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_get_vertex_count;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_getIndexbase ] ---

    @NativeType("void *")
    public static long btGImpactMeshShapePart_TrimeshPrimitiveManager_getIndexbase(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_getIndexbase;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_getIndexstride ] ---

    public static int btGImpactMeshShapePart_TrimeshPrimitiveManager_getIndexstride(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_getIndexstride;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_getIndicestype ] ---

    public static int btGImpactMeshShapePart_TrimeshPrimitiveManager_getIndicestype(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_getIndicestype;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_getLock_count ] ---

    public static int btGImpactMeshShapePart_TrimeshPrimitiveManager_getLock_count(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_getLock_count;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_getMargin ] ---

    @NativeType("btScalar")
    public static float btGImpactMeshShapePart_TrimeshPrimitiveManager_getMargin(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_getMargin;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_getMeshInterface ] ---

    @NativeType("void *")
    public static long btGImpactMeshShapePart_TrimeshPrimitiveManager_getMeshInterface(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_getMeshInterface;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_getNumfaces ] ---

    public static int btGImpactMeshShapePart_TrimeshPrimitiveManager_getNumfaces(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_getNumfaces;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_getNumverts ] ---

    public static int btGImpactMeshShapePart_TrimeshPrimitiveManager_getNumverts(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_getNumverts;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_getPart ] ---

    public static int btGImpactMeshShapePart_TrimeshPrimitiveManager_getPart(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_getPart;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_getScale ] ---

    public static void nbtGImpactMeshShapePart_TrimeshPrimitiveManager_getScale(long obj, long value) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_getScale;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btGImpactMeshShapePart_TrimeshPrimitiveManager_getScale(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtGImpactMeshShapePart_TrimeshPrimitiveManager_getScale(obj, value.address());
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_getStride ] ---

    public static int btGImpactMeshShapePart_TrimeshPrimitiveManager_getStride(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_getStride;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_getType ] ---

    public static int btGImpactMeshShapePart_TrimeshPrimitiveManager_getType(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_getType;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_getVertexbase ] ---

    @NativeType("void *")
    public static long btGImpactMeshShapePart_TrimeshPrimitiveManager_getVertexbase(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_getVertexbase;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_lock ] ---

    public static void btGImpactMeshShapePart_TrimeshPrimitiveManager_lock(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_lock;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_setIndexbase ] ---

    public static void nbtGImpactMeshShapePart_TrimeshPrimitiveManager_setIndexbase(long obj, long value) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_setIndexbase;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btGImpactMeshShapePart_TrimeshPrimitiveManager_setIndexbase(@NativeType("void *") long obj, @NativeType("unsigned char const *") ByteBuffer value) {
        nbtGImpactMeshShapePart_TrimeshPrimitiveManager_setIndexbase(obj, memAddress(value));
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_setIndexstride ] ---

    public static void btGImpactMeshShapePart_TrimeshPrimitiveManager_setIndexstride(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_setIndexstride;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_setIndicestype ] ---

    public static void btGImpactMeshShapePart_TrimeshPrimitiveManager_setIndicestype(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_setIndicestype;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_setLock_count ] ---

    public static void btGImpactMeshShapePart_TrimeshPrimitiveManager_setLock_count(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_setLock_count;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_setMargin ] ---

    public static void btGImpactMeshShapePart_TrimeshPrimitiveManager_setMargin(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_setMargin;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_setMeshInterface ] ---

    public static void btGImpactMeshShapePart_TrimeshPrimitiveManager_setMeshInterface(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_setMeshInterface;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_setNumfaces ] ---

    public static void btGImpactMeshShapePart_TrimeshPrimitiveManager_setNumfaces(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_setNumfaces;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_setNumverts ] ---

    public static void btGImpactMeshShapePart_TrimeshPrimitiveManager_setNumverts(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_setNumverts;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_setPart ] ---

    public static void btGImpactMeshShapePart_TrimeshPrimitiveManager_setPart(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_setPart;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_setScale ] ---

    public static void nbtGImpactMeshShapePart_TrimeshPrimitiveManager_setScale(long obj, long value) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_setScale;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btGImpactMeshShapePart_TrimeshPrimitiveManager_setScale(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtGImpactMeshShapePart_TrimeshPrimitiveManager_setScale(obj, value.address());
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_setStride ] ---

    public static void btGImpactMeshShapePart_TrimeshPrimitiveManager_setStride(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_setStride;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_setType ] ---

    public static void btGImpactMeshShapePart_TrimeshPrimitiveManager_setType(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_setType;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_setVertexbase ] ---

    public static void nbtGImpactMeshShapePart_TrimeshPrimitiveManager_setVertexbase(long obj, long value) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_setVertexbase;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btGImpactMeshShapePart_TrimeshPrimitiveManager_setVertexbase(@NativeType("void *") long obj, @NativeType("unsigned char const *") ByteBuffer value) {
        nbtGImpactMeshShapePart_TrimeshPrimitiveManager_setVertexbase(obj, memAddress(value));
    }

    // --- [ btGImpactMeshShapePart_TrimeshPrimitiveManager_unlock ] ---

    public static void btGImpactMeshShapePart_TrimeshPrimitiveManager_unlock(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactMeshShapePart_TrimeshPrimitiveManager_unlock;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_new ] ---

    @NativeType("void *")
    public static long btGImpactMeshShapePart_new() {
        long __functionAddress = Functions.GImpactMeshShapePart_new;
        return invokeP(__functionAddress);
    }

    // --- [ btGImpactMeshShapePart_new2 ] ---

    @NativeType("void *")
    public static long btGImpactMeshShapePart_new2(@NativeType("void *") long meshInterface, int part) {
        long __functionAddress = Functions.GImpactMeshShapePart_new2;
        if (CHECKS) {
            check(meshInterface);
        }
        return invokePP(meshInterface, part, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_getPart ] ---

    public static int btGImpactMeshShapePart_getPart(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactMeshShapePart_getPart;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_getTrimeshPrimitiveManager ] ---

    @NativeType("void *")
    public static long btGImpactMeshShapePart_getTrimeshPrimitiveManager(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactMeshShapePart_getTrimeshPrimitiveManager;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btGImpactMeshShapePart_getVertex ] ---

    public static void nbtGImpactMeshShapePart_getVertex(long obj, int vertex_index, long vertex) {
        long __functionAddress = Functions.GImpactMeshShapePart_getVertex;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, vertex_index, vertex, __functionAddress);
    }

    public static void btGImpactMeshShapePart_getVertex(@NativeType("void *") long obj, int vertex_index, @NativeType("btVector3 *") BTVector3 vertex) {
        nbtGImpactMeshShapePart_getVertex(obj, vertex_index, vertex.address());
    }

    // --- [ btGImpactMeshShapePart_getVertexCount ] ---

    public static int btGImpactMeshShapePart_getVertexCount(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactMeshShapePart_getVertexCount;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGImpactMeshShape_new ] ---

    @NativeType("void *")
    public static long btGImpactMeshShape_new(@NativeType("void *") long meshInterface) {
        long __functionAddress = Functions.GImpactMeshShape_new;
        if (CHECKS) {
            check(meshInterface);
        }
        return invokePP(meshInterface, __functionAddress);
    }

    // --- [ btGImpactMeshShape_getMeshInterface ] ---

    @NativeType("void *")
    public static long btGImpactMeshShape_getMeshInterface(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactMeshShape_getMeshInterface;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btGImpactMeshShape_getMeshPart ] ---

    @NativeType("void *")
    public static long btGImpactMeshShape_getMeshPart(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.GImpactMeshShape_getMeshPart;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btGImpactMeshShape_getMeshPartCount ] ---

    public static int btGImpactMeshShape_getMeshPartCount(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GImpactMeshShape_getMeshPartCount;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

}
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

public class BTTriangleShapeEx {

    protected BTTriangleShapeEx() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GIM_TRIANGLE_CONTACT_new                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_TRIANGLE_CONTACT_new"),
            GIM_TRIANGLE_CONTACT_new2                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_TRIANGLE_CONTACT_new2"),
            GIM_TRIANGLE_CONTACT_copy_from                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_TRIANGLE_CONTACT_copy_from"),
            GIM_TRIANGLE_CONTACT_getPenetration_depth             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_TRIANGLE_CONTACT_getPenetration_depth"),
            GIM_TRIANGLE_CONTACT_getPoint_count                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_TRIANGLE_CONTACT_getPoint_count"),
            GIM_TRIANGLE_CONTACT_getPoints                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_TRIANGLE_CONTACT_getPoints"),
            GIM_TRIANGLE_CONTACT_getSeparating_normal             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_TRIANGLE_CONTACT_getSeparating_normal"),
            GIM_TRIANGLE_CONTACT_merge_points                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_TRIANGLE_CONTACT_merge_points"),
            GIM_TRIANGLE_CONTACT_setPenetration_depth             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_TRIANGLE_CONTACT_setPenetration_depth"),
            GIM_TRIANGLE_CONTACT_setPoint_count                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_TRIANGLE_CONTACT_setPoint_count"),
            GIM_TRIANGLE_CONTACT_setSeparating_normal             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_TRIANGLE_CONTACT_setSeparating_normal"),
            GIM_TRIANGLE_CONTACT_delete                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btGIM_TRIANGLE_CONTACT_delete"),
            PrimitiveTriangle_new                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btPrimitiveTriangle_new"),
            PrimitiveTriangle_applyTransform                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btPrimitiveTriangle_applyTransform"),
            PrimitiveTriangle_buildTriPlane                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btPrimitiveTriangle_buildTriPlane"),
            PrimitiveTriangle_clip_triangle                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btPrimitiveTriangle_clip_triangle"),
            PrimitiveTriangle_find_triangle_collision_clip_method = apiGetFunctionAddress(LibBullet.getLibrary(), "btPrimitiveTriangle_find_triangle_collision_clip_method"),
            PrimitiveTriangle_get_edge_plane                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btPrimitiveTriangle_get_edge_plane"),
            PrimitiveTriangle_getDummy                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btPrimitiveTriangle_getDummy"),
            PrimitiveTriangle_getMargin                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btPrimitiveTriangle_getMargin"),
            PrimitiveTriangle_getPlane                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btPrimitiveTriangle_getPlane"),
            PrimitiveTriangle_getVertices                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btPrimitiveTriangle_getVertices"),
            PrimitiveTriangle_overlap_test_conservative           = apiGetFunctionAddress(LibBullet.getLibrary(), "btPrimitiveTriangle_overlap_test_conservative"),
            PrimitiveTriangle_setDummy                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btPrimitiveTriangle_setDummy"),
            PrimitiveTriangle_setMargin                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btPrimitiveTriangle_setMargin"),
            PrimitiveTriangle_setPlane                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btPrimitiveTriangle_setPlane"),
            PrimitiveTriangle_delete                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btPrimitiveTriangle_delete"),
            TriangleShapeEx_new                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleShapeEx_new"),
            TriangleShapeEx_new2                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleShapeEx_new2"),
            TriangleShapeEx_new3                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleShapeEx_new3"),
            TriangleShapeEx_applyTransform                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleShapeEx_applyTransform"),
            TriangleShapeEx_buildTriPlane                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleShapeEx_buildTriPlane"),
            TriangleShapeEx_overlap_test_conservative             = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleShapeEx_overlap_test_conservative");

    }

    // --- [ btGIM_TRIANGLE_CONTACT_new ] ---

    @NativeType("void *")
    public static long btGIM_TRIANGLE_CONTACT_new() {
        long __functionAddress = Functions.GIM_TRIANGLE_CONTACT_new;
        return invokeP(__functionAddress);
    }

    // --- [ btGIM_TRIANGLE_CONTACT_new2 ] ---

    @NativeType("void *")
    public static long btGIM_TRIANGLE_CONTACT_new2(@NativeType("void *") long other) {
        long __functionAddress = Functions.GIM_TRIANGLE_CONTACT_new2;
        if (CHECKS) {
            check(other);
        }
        return invokePP(other, __functionAddress);
    }

    // --- [ btGIM_TRIANGLE_CONTACT_copy_from ] ---

    public static void btGIM_TRIANGLE_CONTACT_copy_from(@NativeType("void *") long obj, @NativeType("void *") long other) {
        long __functionAddress = Functions.GIM_TRIANGLE_CONTACT_copy_from;
        if (CHECKS) {
            check(obj);
            check(other);
        }
        invokePPV(obj, other, __functionAddress);
    }

    // --- [ btGIM_TRIANGLE_CONTACT_getPenetration_depth ] ---

    @NativeType("btScalar")
    public static float btGIM_TRIANGLE_CONTACT_getPenetration_depth(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GIM_TRIANGLE_CONTACT_getPenetration_depth;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btGIM_TRIANGLE_CONTACT_getPoint_count ] ---

    public static int btGIM_TRIANGLE_CONTACT_getPoint_count(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GIM_TRIANGLE_CONTACT_getPoint_count;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGIM_TRIANGLE_CONTACT_getPoints ] ---

    public static long nbtGIM_TRIANGLE_CONTACT_getPoints(long obj) {
        long __functionAddress = Functions.GIM_TRIANGLE_CONTACT_getPoints;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("btVector3 *")
    public static ΒΤVector3 btGIM_TRIANGLE_CONTACT_getPoints(@NativeType("void *") long obj) {
        long __result = nbtGIM_TRIANGLE_CONTACT_getPoints(obj);
        return ΒΤVector3.createSafe(__result);
    }

    // --- [ btGIM_TRIANGLE_CONTACT_getSeparating_normal ] ---

    public static void nbtGIM_TRIANGLE_CONTACT_getSeparating_normal(long obj, long value) {
        long __functionAddress = Functions.GIM_TRIANGLE_CONTACT_getSeparating_normal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btGIM_TRIANGLE_CONTACT_getSeparating_normal(@NativeType("void *") long obj, @NativeType("btVector4 *") ΒΤVector3 value) {
        nbtGIM_TRIANGLE_CONTACT_getSeparating_normal(obj, value.address());
    }

    // --- [ btGIM_TRIANGLE_CONTACT_merge_points ] ---

    public static void nbtGIM_TRIANGLE_CONTACT_merge_points(long obj, long plane, float margin, long points, int point_count) {
        long __functionAddress = Functions.GIM_TRIANGLE_CONTACT_merge_points;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, plane, margin, points, point_count, __functionAddress);
    }

    public static void btGIM_TRIANGLE_CONTACT_merge_points(@NativeType("void *") long obj, @NativeType("btVector4 const *") ΒΤVector3 plane, @NativeType("btScalar") float margin, @NativeType("btVector3 const *") ΒΤVector3 points, int point_count) {
        nbtGIM_TRIANGLE_CONTACT_merge_points(obj, plane.address(), margin, points.address(), point_count);
    }

    // --- [ btGIM_TRIANGLE_CONTACT_setPenetration_depth ] ---

    public static void btGIM_TRIANGLE_CONTACT_setPenetration_depth(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.GIM_TRIANGLE_CONTACT_setPenetration_depth;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGIM_TRIANGLE_CONTACT_setPoint_count ] ---

    public static void btGIM_TRIANGLE_CONTACT_setPoint_count(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.GIM_TRIANGLE_CONTACT_setPoint_count;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGIM_TRIANGLE_CONTACT_setSeparating_normal ] ---

    public static void nbtGIM_TRIANGLE_CONTACT_setSeparating_normal(long obj, long value) {
        long __functionAddress = Functions.GIM_TRIANGLE_CONTACT_setSeparating_normal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btGIM_TRIANGLE_CONTACT_setSeparating_normal(@NativeType("void *") long obj, @NativeType("btVector4 const *") ΒΤVector3 value) {
        nbtGIM_TRIANGLE_CONTACT_setSeparating_normal(obj, value.address());
    }

    // --- [ btGIM_TRIANGLE_CONTACT_delete ] ---

    public static void btGIM_TRIANGLE_CONTACT_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GIM_TRIANGLE_CONTACT_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btPrimitiveTriangle_new ] ---

    @NativeType("void *")
    public static long btPrimitiveTriangle_new() {
        long __functionAddress = Functions.PrimitiveTriangle_new;
        return invokeP(__functionAddress);
    }

    // --- [ btPrimitiveTriangle_applyTransform ] ---

    public static void nbtPrimitiveTriangle_applyTransform(long obj, long t) {
        long __functionAddress = Functions.PrimitiveTriangle_applyTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, t, __functionAddress);
    }

    public static void btPrimitiveTriangle_applyTransform(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform t) {
        nbtPrimitiveTriangle_applyTransform(obj, t.address());
    }

    // --- [ btPrimitiveTriangle_buildTriPlane ] ---

    public static void btPrimitiveTriangle_buildTriPlane(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PrimitiveTriangle_buildTriPlane;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btPrimitiveTriangle_clip_triangle ] ---

    public static int nbtPrimitiveTriangle_clip_triangle(long obj, long other, long clipped_points) {
        long __functionAddress = Functions.PrimitiveTriangle_clip_triangle;
        if (CHECKS) {
            check(obj);
            check(other);
        }
        return invokePPPI(obj, other, clipped_points, __functionAddress);
    }

    public static int btPrimitiveTriangle_clip_triangle(@NativeType("void *") long obj, @NativeType("void *") long other, @NativeType("btVector3 *") ΒΤVector3 clipped_points) {
        return nbtPrimitiveTriangle_clip_triangle(obj, other, clipped_points.address());
    }

    // --- [ btPrimitiveTriangle_find_triangle_collision_clip_method ] ---

    @NativeType("bool")
    public static boolean btPrimitiveTriangle_find_triangle_collision_clip_method(@NativeType("void *") long obj, @NativeType("void *") long other, @NativeType("void *") long contacts) {
        long __functionAddress = Functions.PrimitiveTriangle_find_triangle_collision_clip_method;
        if (CHECKS) {
            check(obj);
            check(other);
            check(contacts);
        }
        return invokePPPZ(obj, other, contacts, __functionAddress);
    }

    // --- [ btPrimitiveTriangle_get_edge_plane ] ---

    public static void nbtPrimitiveTriangle_get_edge_plane(long obj, int edge_index, long plane) {
        long __functionAddress = Functions.PrimitiveTriangle_get_edge_plane;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, edge_index, plane, __functionAddress);
    }

    public static void btPrimitiveTriangle_get_edge_plane(@NativeType("void *") long obj, int edge_index, @NativeType("btVector4 *") ΒΤVector3 plane) {
        nbtPrimitiveTriangle_get_edge_plane(obj, edge_index, plane.address());
    }

    // --- [ btPrimitiveTriangle_getDummy ] ---

    @NativeType("btScalar")
    public static float btPrimitiveTriangle_getDummy(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PrimitiveTriangle_getDummy;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btPrimitiveTriangle_getMargin ] ---

    @NativeType("btScalar")
    public static float btPrimitiveTriangle_getMargin(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PrimitiveTriangle_getMargin;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btPrimitiveTriangle_getPlane ] ---

    public static void nbtPrimitiveTriangle_getPlane(long obj, long value) {
        long __functionAddress = Functions.PrimitiveTriangle_getPlane;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btPrimitiveTriangle_getPlane(@NativeType("void *") long obj, @NativeType("btVector4 *") ΒΤVector3 value) {
        nbtPrimitiveTriangle_getPlane(obj, value.address());
    }

    // --- [ btPrimitiveTriangle_getVertices ] ---

    public static long nbtPrimitiveTriangle_getVertices(long obj) {
        long __functionAddress = Functions.PrimitiveTriangle_getVertices;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("btVector3 *")
    public static ΒΤVector3 btPrimitiveTriangle_getVertices(@NativeType("void *") long obj) {
        long __result = nbtPrimitiveTriangle_getVertices(obj);
        return ΒΤVector3.createSafe(__result);
    }

    // --- [ btPrimitiveTriangle_overlap_test_conservative ] ---

    @NativeType("bool")
    public static boolean btPrimitiveTriangle_overlap_test_conservative(@NativeType("void *") long obj, @NativeType("void *") long other) {
        long __functionAddress = Functions.PrimitiveTriangle_overlap_test_conservative;
        if (CHECKS) {
            check(obj);
            check(other);
        }
        return invokePPZ(obj, other, __functionAddress);
    }

    // --- [ btPrimitiveTriangle_setDummy ] ---

    public static void btPrimitiveTriangle_setDummy(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.PrimitiveTriangle_setDummy;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btPrimitiveTriangle_setMargin ] ---

    public static void btPrimitiveTriangle_setMargin(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.PrimitiveTriangle_setMargin;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btPrimitiveTriangle_setPlane ] ---

    public static void nbtPrimitiveTriangle_setPlane(long obj, long value) {
        long __functionAddress = Functions.PrimitiveTriangle_setPlane;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btPrimitiveTriangle_setPlane(@NativeType("void *") long obj, @NativeType("btVector4 const *") ΒΤVector3 value) {
        nbtPrimitiveTriangle_setPlane(obj, value.address());
    }

    // --- [ btPrimitiveTriangle_delete ] ---

    public static void btPrimitiveTriangle_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PrimitiveTriangle_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btTriangleShapeEx_new ] ---

    @NativeType("void *")
    public static long btTriangleShapeEx_new() {
        long __functionAddress = Functions.TriangleShapeEx_new;
        return invokeP(__functionAddress);
    }

    // --- [ btTriangleShapeEx_new2 ] ---

    public static long nbtTriangleShapeEx_new2(long p0, long p1, long p2) {
        long __functionAddress = Functions.TriangleShapeEx_new2;
        return invokePPPP(p0, p1, p2, __functionAddress);
    }

    @NativeType("void *")
    public static long btTriangleShapeEx_new2(@NativeType("btVector3 const *") ΒΤVector3 p0, @NativeType("btVector3 const *") ΒΤVector3 p1, @NativeType("btVector3 const *") ΒΤVector3 p2) {
        return nbtTriangleShapeEx_new2(p0.address(), p1.address(), p2.address());
    }

    // --- [ btTriangleShapeEx_new3 ] ---

    @NativeType("void *")
    public static long btTriangleShapeEx_new3(@NativeType("void *") long other) {
        long __functionAddress = Functions.TriangleShapeEx_new3;
        if (CHECKS) {
            check(other);
        }
        return invokePP(other, __functionAddress);
    }

    // --- [ btTriangleShapeEx_applyTransform ] ---

    public static void nbtTriangleShapeEx_applyTransform(long obj, long t) {
        long __functionAddress = Functions.TriangleShapeEx_applyTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, t, __functionAddress);
    }

    public static void btTriangleShapeEx_applyTransform(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform t) {
        nbtTriangleShapeEx_applyTransform(obj, t.address());
    }

    // --- [ btTriangleShapeEx_buildTriPlane ] ---

    public static void nbtTriangleShapeEx_buildTriPlane(long obj, long plane) {
        long __functionAddress = Functions.TriangleShapeEx_buildTriPlane;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, plane, __functionAddress);
    }

    public static void btTriangleShapeEx_buildTriPlane(@NativeType("void *") long obj, @NativeType("btVector4 *") ΒΤVector3 plane) {
        nbtTriangleShapeEx_buildTriPlane(obj, plane.address());
    }

    // --- [ btTriangleShapeEx_overlap_test_conservative ] ---

    @NativeType("bool")
    public static boolean btTriangleShapeEx_overlap_test_conservative(@NativeType("void *") long obj, @NativeType("void *") long other) {
        long __functionAddress = Functions.TriangleShapeEx_overlap_test_conservative;
        if (CHECKS) {
            check(obj);
            check(other);
        }
        return invokePPZ(obj, other, __functionAddress);
    }

}
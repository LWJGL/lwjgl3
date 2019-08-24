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

public class BTBoxCollision {

    protected BTBoxCollision() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            BT_BOX_BOX_TRANSFORM_CACHE_new                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_BOX_BOX_TRANSFORM_CACHE_new"),
            BT_BOX_BOX_TRANSFORM_CACHE_calc_absolute_matrix  = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_BOX_BOX_TRANSFORM_CACHE_calc_absolute_matrix"),
            BT_BOX_BOX_TRANSFORM_CACHE_calc_from_full_invert = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_BOX_BOX_TRANSFORM_CACHE_calc_from_full_invert"),
            BT_BOX_BOX_TRANSFORM_CACHE_calc_from_homogenic   = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_BOX_BOX_TRANSFORM_CACHE_calc_from_homogenic"),
            BT_BOX_BOX_TRANSFORM_CACHE_getAR                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_BOX_BOX_TRANSFORM_CACHE_getAR"),
            BT_BOX_BOX_TRANSFORM_CACHE_getR1to0              = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_BOX_BOX_TRANSFORM_CACHE_getR1to0"),
            BT_BOX_BOX_TRANSFORM_CACHE_getT1to0              = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_BOX_BOX_TRANSFORM_CACHE_getT1to0"),
            BT_BOX_BOX_TRANSFORM_CACHE_setAR                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_BOX_BOX_TRANSFORM_CACHE_setAR"),
            BT_BOX_BOX_TRANSFORM_CACHE_setR1to0              = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_BOX_BOX_TRANSFORM_CACHE_setR1to0"),
            BT_BOX_BOX_TRANSFORM_CACHE_setT1to0              = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_BOX_BOX_TRANSFORM_CACHE_setT1to0"),
            BT_BOX_BOX_TRANSFORM_CACHE_transform             = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_BOX_BOX_TRANSFORM_CACHE_transform"),
            BT_BOX_BOX_TRANSFORM_CACHE_delete                = apiGetFunctionAddress(LibBullet.getLibrary(), "btBT_BOX_BOX_TRANSFORM_CACHE_delete"),
            AABB_new                                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_new"),
            AABB_new2                                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_new2"),
            AABB_new3                                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_new3"),
            AABB_new4                                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_new4"),
            AABB_new5                                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_new5"),
            AABB_appy_transform                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_appy_transform"),
            AABB_appy_transform_trans_cache                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_appy_transform_trans_cache"),
            AABB_collide_plane                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_collide_plane"),
            AABB_collide_ray                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_collide_ray"),
            AABB_collide_triangle_exact                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_collide_triangle_exact"),
            AABB_copy_with_margin                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_copy_with_margin"),
            AABB_find_intersection                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_find_intersection"),
            AABB_get_center_extend                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_get_center_extend"),
            AABB_getMax                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_getMax"),
            AABB_getMin                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_getMin"),
            AABB_has_collision                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_has_collision"),
            AABB_increment_margin                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_increment_margin"),
            AABB_invalidate                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_invalidate"),
            AABB_merge                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_merge"),
            AABB_overlapping_trans_cache                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_overlapping_trans_cache"),
            AABB_overlapping_trans_conservative              = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_overlapping_trans_conservative"),
            AABB_overlapping_trans_conservative2             = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_overlapping_trans_conservative2"),
            AABB_plane_classify                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_plane_classify"),
            AABB_projection_interval                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_projection_interval"),
            AABB_setMax                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_setMax"),
            AABB_setMin                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_setMin"),
            AABB_delete                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btAABB_delete");

    }

    // --- [ btBT_BOX_BOX_TRANSFORM_CACHE_new ] ---

    @NativeType("void *")
    public static long btBT_BOX_BOX_TRANSFORM_CACHE_new() {
        long __functionAddress = Functions.BT_BOX_BOX_TRANSFORM_CACHE_new;
        return invokeP(__functionAddress);
    }

    // --- [ btBT_BOX_BOX_TRANSFORM_CACHE_calc_absolute_matrix ] ---

    public static void btBT_BOX_BOX_TRANSFORM_CACHE_calc_absolute_matrix(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BT_BOX_BOX_TRANSFORM_CACHE_calc_absolute_matrix;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btBT_BOX_BOX_TRANSFORM_CACHE_calc_from_full_invert ] ---

    public static void nbtBT_BOX_BOX_TRANSFORM_CACHE_calc_from_full_invert(long obj, long trans0, long trans1) {
        long __functionAddress = Functions.BT_BOX_BOX_TRANSFORM_CACHE_calc_from_full_invert;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, trans0, trans1, __functionAddress);
    }

    public static void btBT_BOX_BOX_TRANSFORM_CACHE_calc_from_full_invert(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform trans0, @NativeType("btTransform const *") BTTransform trans1) {
        nbtBT_BOX_BOX_TRANSFORM_CACHE_calc_from_full_invert(obj, trans0.address(), trans1.address());
    }

    // --- [ btBT_BOX_BOX_TRANSFORM_CACHE_calc_from_homogenic ] ---

    public static void nbtBT_BOX_BOX_TRANSFORM_CACHE_calc_from_homogenic(long obj, long trans0, long trans1) {
        long __functionAddress = Functions.BT_BOX_BOX_TRANSFORM_CACHE_calc_from_homogenic;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, trans0, trans1, __functionAddress);
    }

    public static void btBT_BOX_BOX_TRANSFORM_CACHE_calc_from_homogenic(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform trans0, @NativeType("btTransform const *") BTTransform trans1) {
        nbtBT_BOX_BOX_TRANSFORM_CACHE_calc_from_homogenic(obj, trans0.address(), trans1.address());
    }

    // --- [ btBT_BOX_BOX_TRANSFORM_CACHE_getAR ] ---

    public static void nbtBT_BOX_BOX_TRANSFORM_CACHE_getAR(long obj, long value) {
        long __functionAddress = Functions.BT_BOX_BOX_TRANSFORM_CACHE_getAR;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btBT_BOX_BOX_TRANSFORM_CACHE_getAR(@NativeType("void *") long obj, @NativeType("btMatrix3x3 *") BTMatrix3x3 value) {
        nbtBT_BOX_BOX_TRANSFORM_CACHE_getAR(obj, value.address());
    }

    // --- [ btBT_BOX_BOX_TRANSFORM_CACHE_getR1to0 ] ---

    public static void nbtBT_BOX_BOX_TRANSFORM_CACHE_getR1to0(long obj, long value) {
        long __functionAddress = Functions.BT_BOX_BOX_TRANSFORM_CACHE_getR1to0;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btBT_BOX_BOX_TRANSFORM_CACHE_getR1to0(@NativeType("void *") long obj, @NativeType("btMatrix3x3 *") BTMatrix3x3 value) {
        nbtBT_BOX_BOX_TRANSFORM_CACHE_getR1to0(obj, value.address());
    }

    // --- [ btBT_BOX_BOX_TRANSFORM_CACHE_getT1to0 ] ---

    public static void nbtBT_BOX_BOX_TRANSFORM_CACHE_getT1to0(long obj, long value) {
        long __functionAddress = Functions.BT_BOX_BOX_TRANSFORM_CACHE_getT1to0;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btBT_BOX_BOX_TRANSFORM_CACHE_getT1to0(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtBT_BOX_BOX_TRANSFORM_CACHE_getT1to0(obj, value.address());
    }

    // --- [ btBT_BOX_BOX_TRANSFORM_CACHE_setAR ] ---

    public static void nbtBT_BOX_BOX_TRANSFORM_CACHE_setAR(long obj, long value) {
        long __functionAddress = Functions.BT_BOX_BOX_TRANSFORM_CACHE_setAR;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btBT_BOX_BOX_TRANSFORM_CACHE_setAR(@NativeType("void *") long obj, @NativeType("btMatrix3x3 const *") BTMatrix3x3 value) {
        nbtBT_BOX_BOX_TRANSFORM_CACHE_setAR(obj, value.address());
    }

    // --- [ btBT_BOX_BOX_TRANSFORM_CACHE_setR1to0 ] ---

    public static void nbtBT_BOX_BOX_TRANSFORM_CACHE_setR1to0(long obj, long value) {
        long __functionAddress = Functions.BT_BOX_BOX_TRANSFORM_CACHE_setR1to0;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btBT_BOX_BOX_TRANSFORM_CACHE_setR1to0(@NativeType("void *") long obj, @NativeType("btMatrix3x3 const *") BTMatrix3x3 value) {
        nbtBT_BOX_BOX_TRANSFORM_CACHE_setR1to0(obj, value.address());
    }

    // --- [ btBT_BOX_BOX_TRANSFORM_CACHE_setT1to0 ] ---

    public static void nbtBT_BOX_BOX_TRANSFORM_CACHE_setT1to0(long obj, long value) {
        long __functionAddress = Functions.BT_BOX_BOX_TRANSFORM_CACHE_setT1to0;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btBT_BOX_BOX_TRANSFORM_CACHE_setT1to0(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtBT_BOX_BOX_TRANSFORM_CACHE_setT1to0(obj, value.address());
    }

    // --- [ btBT_BOX_BOX_TRANSFORM_CACHE_transform ] ---

    public static void nbtBT_BOX_BOX_TRANSFORM_CACHE_transform(long obj, long point, long value) {
        long __functionAddress = Functions.BT_BOX_BOX_TRANSFORM_CACHE_transform;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, point, value, __functionAddress);
    }

    public static void btBT_BOX_BOX_TRANSFORM_CACHE_transform(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 point, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtBT_BOX_BOX_TRANSFORM_CACHE_transform(obj, point.address(), value.address());
    }

    // --- [ btBT_BOX_BOX_TRANSFORM_CACHE_delete ] ---

    public static void btBT_BOX_BOX_TRANSFORM_CACHE_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BT_BOX_BOX_TRANSFORM_CACHE_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btAABB_new ] ---

    @NativeType("void *")
    public static long btAABB_new() {
        long __functionAddress = Functions.AABB_new;
        return invokeP(__functionAddress);
    }

    // --- [ btAABB_new2 ] ---

    public static long nbtAABB_new2(long V1, long V2, long V3) {
        long __functionAddress = Functions.AABB_new2;
        return invokePPPP(V1, V2, V3, __functionAddress);
    }

    @NativeType("void *")
    public static long btAABB_new2(@NativeType("btVector3 const *") ΒΤVector3 V1, @NativeType("btVector3 const *") ΒΤVector3 V2, @NativeType("btVector3 const *") ΒΤVector3 V3) {
        return nbtAABB_new2(V1.address(), V2.address(), V3.address());
    }

    // --- [ btAABB_new3 ] ---

    public static long nbtAABB_new3(long V1, long V2, long V3, float margin) {
        long __functionAddress = Functions.AABB_new3;
        return invokePPPP(V1, V2, V3, margin, __functionAddress);
    }

    @NativeType("void *")
    public static long btAABB_new3(@NativeType("btVector3 const *") ΒΤVector3 V1, @NativeType("btVector3 const *") ΒΤVector3 V2, @NativeType("btVector3 const *") ΒΤVector3 V3, @NativeType("btScalar") float margin) {
        return nbtAABB_new3(V1.address(), V2.address(), V3.address(), margin);
    }

    // --- [ btAABB_new4 ] ---

    @NativeType("void *")
    public static long btAABB_new4(@NativeType("void *") long other) {
        long __functionAddress = Functions.AABB_new4;
        if (CHECKS) {
            check(other);
        }
        return invokePP(other, __functionAddress);
    }

    // --- [ btAABB_new5 ] ---

    @NativeType("void *")
    public static long btAABB_new5(@NativeType("void *") long other, @NativeType("btScalar") float margin) {
        long __functionAddress = Functions.AABB_new5;
        if (CHECKS) {
            check(other);
        }
        return invokePP(other, margin, __functionAddress);
    }

    // --- [ btAABB_appy_transform ] ---

    public static void nbtAABB_appy_transform(long obj, long trans) {
        long __functionAddress = Functions.AABB_appy_transform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, trans, __functionAddress);
    }

    public static void btAABB_appy_transform(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform trans) {
        nbtAABB_appy_transform(obj, trans.address());
    }

    // --- [ btAABB_appy_transform_trans_cache ] ---

    public static void btAABB_appy_transform_trans_cache(@NativeType("void *") long obj, @NativeType("void *") long trans) {
        long __functionAddress = Functions.AABB_appy_transform_trans_cache;
        if (CHECKS) {
            check(obj);
            check(trans);
        }
        invokePPV(obj, trans, __functionAddress);
    }

    // --- [ btAABB_collide_plane ] ---

    public static boolean nbtAABB_collide_plane(long obj, long plane) {
        long __functionAddress = Functions.AABB_collide_plane;
        if (CHECKS) {
            check(obj);
        }
        return invokePPZ(obj, plane, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btAABB_collide_plane(@NativeType("void *") long obj, @NativeType("btVector4 const *") ΒΤVector3 plane) {
        return nbtAABB_collide_plane(obj, plane.address());
    }

    // --- [ btAABB_collide_ray ] ---

    public static boolean nbtAABB_collide_ray(long obj, long vorigin, long vdir) {
        long __functionAddress = Functions.AABB_collide_ray;
        if (CHECKS) {
            check(obj);
        }
        return invokePPPZ(obj, vorigin, vdir, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btAABB_collide_ray(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 vorigin, @NativeType("btVector3 const *") ΒΤVector3 vdir) {
        return nbtAABB_collide_ray(obj, vorigin.address(), vdir.address());
    }

    // --- [ btAABB_collide_triangle_exact ] ---

    public static boolean nbtAABB_collide_triangle_exact(long obj, long p1, long p2, long p3, long triangle_plane) {
        long __functionAddress = Functions.AABB_collide_triangle_exact;
        if (CHECKS) {
            check(obj);
        }
        return invokePPPPPZ(obj, p1, p2, p3, triangle_plane, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btAABB_collide_triangle_exact(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 p1, @NativeType("btVector3 const *") ΒΤVector3 p2, @NativeType("btVector3 const *") ΒΤVector3 p3, @NativeType("btVector4 const *") ΒΤVector3 triangle_plane) {
        return nbtAABB_collide_triangle_exact(obj, p1.address(), p2.address(), p3.address(), triangle_plane.address());
    }

    // --- [ btAABB_copy_with_margin ] ---

    public static void btAABB_copy_with_margin(@NativeType("void *") long obj, @NativeType("void *") long other, @NativeType("btScalar") float margin) {
        long __functionAddress = Functions.AABB_copy_with_margin;
        if (CHECKS) {
            check(obj);
            check(other);
        }
        invokePPV(obj, other, margin, __functionAddress);
    }

    // --- [ btAABB_find_intersection ] ---

    public static void btAABB_find_intersection(@NativeType("void *") long obj, @NativeType("void *") long other, @NativeType("void *") long intersection) {
        long __functionAddress = Functions.AABB_find_intersection;
        if (CHECKS) {
            check(obj);
            check(other);
            check(intersection);
        }
        invokePPPV(obj, other, intersection, __functionAddress);
    }

    // --- [ btAABB_get_center_extend ] ---

    public static void nbtAABB_get_center_extend(long obj, long center, long extend) {
        long __functionAddress = Functions.AABB_get_center_extend;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, center, extend, __functionAddress);
    }

    public static void btAABB_get_center_extend(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 center, @NativeType("btVector3 *") ΒΤVector3 extend) {
        nbtAABB_get_center_extend(obj, center.address(), extend.address());
    }

    // --- [ btAABB_getMax ] ---

    public static void nbtAABB_getMax(long obj, long value) {
        long __functionAddress = Functions.AABB_getMax;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btAABB_getMax(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtAABB_getMax(obj, value.address());
    }

    // --- [ btAABB_getMin ] ---

    public static void nbtAABB_getMin(long obj, long value) {
        long __functionAddress = Functions.AABB_getMin;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btAABB_getMin(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtAABB_getMin(obj, value.address());
    }

    // --- [ btAABB_has_collision ] ---

    @NativeType("bool")
    public static boolean btAABB_has_collision(@NativeType("void *") long obj, @NativeType("void *") long other) {
        long __functionAddress = Functions.AABB_has_collision;
        if (CHECKS) {
            check(obj);
            check(other);
        }
        return invokePPZ(obj, other, __functionAddress);
    }

    // --- [ btAABB_increment_margin ] ---

    public static void btAABB_increment_margin(@NativeType("void *") long obj, @NativeType("btScalar") float margin) {
        long __functionAddress = Functions.AABB_increment_margin;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, margin, __functionAddress);
    }

    // --- [ btAABB_invalidate ] ---

    public static void btAABB_invalidate(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AABB_invalidate;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btAABB_merge ] ---

    public static void btAABB_merge(@NativeType("void *") long obj, @NativeType("void *") long box) {
        long __functionAddress = Functions.AABB_merge;
        if (CHECKS) {
            check(obj);
            check(box);
        }
        invokePPV(obj, box, __functionAddress);
    }

    // --- [ btAABB_overlapping_trans_cache ] ---

    @NativeType("bool")
    public static boolean btAABB_overlapping_trans_cache(@NativeType("void *") long obj, @NativeType("void *") long box, @NativeType("void *") long transcache, @NativeType("bool") boolean fulltest) {
        long __functionAddress = Functions.AABB_overlapping_trans_cache;
        if (CHECKS) {
            check(obj);
            check(box);
            check(transcache);
        }
        return invokePPPZ(obj, box, transcache, fulltest, __functionAddress);
    }

    // --- [ btAABB_overlapping_trans_conservative ] ---

    public static boolean nbtAABB_overlapping_trans_conservative(long obj, long box, long trans1_to_0) {
        long __functionAddress = Functions.AABB_overlapping_trans_conservative;
        if (CHECKS) {
            check(obj);
            check(box);
        }
        return invokePPPZ(obj, box, trans1_to_0, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btAABB_overlapping_trans_conservative(@NativeType("void *") long obj, @NativeType("void *") long box, @NativeType("btTransform *") BTTransform trans1_to_0) {
        return nbtAABB_overlapping_trans_conservative(obj, box, trans1_to_0.address());
    }

    // --- [ btAABB_overlapping_trans_conservative2 ] ---

    @NativeType("bool")
    public static boolean btAABB_overlapping_trans_conservative2(@NativeType("void *") long obj, @NativeType("void *") long box, @NativeType("void *") long trans1_to_0) {
        long __functionAddress = Functions.AABB_overlapping_trans_conservative2;
        if (CHECKS) {
            check(obj);
            check(box);
            check(trans1_to_0);
        }
        return invokePPPZ(obj, box, trans1_to_0, __functionAddress);
    }

    // --- [ btAABB_plane_classify ] ---

    public static int nbtAABB_plane_classify(long obj, long plane) {
        long __functionAddress = Functions.AABB_plane_classify;
        if (CHECKS) {
            check(obj);
        }
        return invokePPI(obj, plane, __functionAddress);
    }

    public static int btAABB_plane_classify(@NativeType("void *") long obj, @NativeType("btVector4 const *") ΒΤVector3 plane) {
        return nbtAABB_plane_classify(obj, plane.address());
    }

    // --- [ btAABB_projection_interval ] ---

    public static void nbtAABB_projection_interval(long obj, long direction, long vmin, long vmax) {
        long __functionAddress = Functions.AABB_projection_interval;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPV(obj, direction, vmin, vmax, __functionAddress);
    }

    public static void btAABB_projection_interval(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 direction, @NativeType("btScalar *") FloatBuffer vmin, @NativeType("btScalar *") FloatBuffer vmax) {
        if (CHECKS) {
            check(vmin, 1);
            check(vmax, 1);
        }
        nbtAABB_projection_interval(obj, direction.address(), memAddress(vmin), memAddress(vmax));
    }

    // --- [ btAABB_setMax ] ---

    public static void nbtAABB_setMax(long obj, long value) {
        long __functionAddress = Functions.AABB_setMax;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btAABB_setMax(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtAABB_setMax(obj, value.address());
    }

    // --- [ btAABB_setMin ] ---

    public static void nbtAABB_setMin(long obj, long value) {
        long __functionAddress = Functions.AABB_setMin;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btAABB_setMin(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtAABB_setMin(obj, value.address());
    }

    // --- [ btAABB_delete ] ---

    public static void btAABB_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.AABB_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}
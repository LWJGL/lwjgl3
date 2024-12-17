/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.msdfgen;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class MSDFGen {

    static { LibMsdfGen.initialize(); }

    public static final int MSDF_FALSE = 0;

    public static final int MSDF_TRUE = 1;

    public static final int
        MSDF_SUCCESS           = 0,
        MSDF_ERR_FAILED        = 1,
        MSDF_ERR_INVALID_ARG   = 2,
        MSDF_ERR_INVALID_TYPE  = 3,
        MSDF_ERR_INVALID_SIZE  = 4,
        MSDF_ERR_INVALID_INDEX = 5;

    public static final int
        MSDF_BITMAP_TYPE_SDF   = 0,
        MSDF_BITMAP_TYPE_PSDF  = 1,
        MSDF_BITMAP_TYPE_MSDF  = 2,
        MSDF_BITMAP_TYPE_MTSDF = 3;

    public static final int
        MSDF_SEGMENT_TYPE_LINEAR    = 0,
        MSDF_SEGMENT_TYPE_QUADRATIC = 1,
        MSDF_SEGMENT_TYPE_CUBIC     = 2;

    public static final int
        MSDF_EDGE_COLOR_BLACK   = 0,
        MSDF_EDGE_COLOR_RED     = 1,
        MSDF_EDGE_COLOR_GREEN   = 2,
        MSDF_EDGE_COLOR_YELLOW  = 3,
        MSDF_EDGE_COLOR_BLUE    = 4,
        MSDF_EDGE_COLOR_MAGENTA = 5,
        MSDF_EDGE_COLOR_CYAN    = 6,
        MSDF_EDGE_COLOR_WHITE   = 7;

    public static final int
        MSDF_ERROR_CORRECTION_MODE_DISABLED       = 0,
        MSDF_ERROR_CORRECTION_MODE_INDISCRIMINATE = 1,
        MSDF_ERROR_CORRECTION_MODE_EDGE_PRIORITY  = 2,
        MSDF_ERROR_CORRECTION_MODE_EDGE_ONLY      = 3;

    public static final int
        MSDF_DISTANCE_CHECK_MODE_NONE    = 0,
        MSDF_DISTANCE_CHECK_MODE_AT_EDGE = 1,
        MSDF_DISTANCE_CHECK_MODE_ALWAYS  = 2;

    protected MSDFGen() {
        throw new UnsupportedOperationException();
    }

    // --- [ msdf_bitmap_alloc ] ---

    /** {@code int msdf_bitmap_alloc(int type, int width, int height, struct msdf_bitmap * bitmap)} */
    public static native int nmsdf_bitmap_alloc(int type, int width, int height, long bitmap);

    /** {@code int msdf_bitmap_alloc(int type, int width, int height, struct msdf_bitmap * bitmap)} */
    public static int msdf_bitmap_alloc(int type, int width, int height, @NativeType("struct msdf_bitmap *") MSDFGenBitmap bitmap) {
        return nmsdf_bitmap_alloc(type, width, height, bitmap.address());
    }

    // --- [ msdf_bitmap_get_channel_count ] ---

    /** {@code int msdf_bitmap_get_channel_count(struct msdf_bitmap const * bitmap, int * channel_count)} */
    public static native int nmsdf_bitmap_get_channel_count(long bitmap, long channel_count);

    /** {@code int msdf_bitmap_get_channel_count(struct msdf_bitmap const * bitmap, int * channel_count)} */
    public static int msdf_bitmap_get_channel_count(@NativeType("struct msdf_bitmap const *") MSDFGenBitmap bitmap, @NativeType("int *") IntBuffer channel_count) {
        if (CHECKS) {
            check(channel_count, 1);
            MSDFGenBitmap.validate(bitmap.address());
        }
        return nmsdf_bitmap_get_channel_count(bitmap.address(), memAddress(channel_count));
    }

    // --- [ msdf_bitmap_get_pixels ] ---

    /** {@code int msdf_bitmap_get_pixels(struct msdf_bitmap const * bitmap, void ** pixels)} */
    public static native int nmsdf_bitmap_get_pixels(long bitmap, long pixels);

    /** {@code int msdf_bitmap_get_pixels(struct msdf_bitmap const * bitmap, void ** pixels)} */
    public static int msdf_bitmap_get_pixels(@NativeType("struct msdf_bitmap const *") MSDFGenBitmap bitmap, @NativeType("void **") PointerBuffer pixels) {
        if (CHECKS) {
            check(pixels, 1);
            MSDFGenBitmap.validate(bitmap.address());
        }
        return nmsdf_bitmap_get_pixels(bitmap.address(), memAddress(pixels));
    }

    // --- [ msdf_bitmap_get_byte_size ] ---

    /** {@code int msdf_bitmap_get_byte_size(struct msdf_bitmap const * bitmap, size_t * size)} */
    public static native int nmsdf_bitmap_get_byte_size(long bitmap, long size);

    /** {@code int msdf_bitmap_get_byte_size(struct msdf_bitmap const * bitmap, size_t * size)} */
    public static int msdf_bitmap_get_byte_size(@NativeType("struct msdf_bitmap const *") MSDFGenBitmap bitmap, @NativeType("size_t *") PointerBuffer size) {
        if (CHECKS) {
            check(size, 1);
            MSDFGenBitmap.validate(bitmap.address());
        }
        return nmsdf_bitmap_get_byte_size(bitmap.address(), memAddress(size));
    }

    // --- [ msdf_bitmap_free ] ---

    /** {@code void msdf_bitmap_free(struct msdf_bitmap * bitmap)} */
    public static native void nmsdf_bitmap_free(long bitmap);

    /** {@code void msdf_bitmap_free(struct msdf_bitmap * bitmap)} */
    public static void msdf_bitmap_free(@NativeType("struct msdf_bitmap *") MSDFGenBitmap bitmap) {
        nmsdf_bitmap_free(bitmap.address());
    }

    // --- [ msdf_shape_alloc ] ---

    /** {@code int msdf_shape_alloc(msdf_shape_handle * shape)} */
    public static native int nmsdf_shape_alloc(long shape);

    /** {@code int msdf_shape_alloc(msdf_shape_handle * shape)} */
    public static int msdf_shape_alloc(@NativeType("msdf_shape_handle *") PointerBuffer shape) {
        if (CHECKS) {
            check(shape, 1);
        }
        return nmsdf_shape_alloc(memAddress(shape));
    }

    // --- [ msdf_shape_get_bounds ] ---

    /** {@code int msdf_shape_get_bounds(msdf_shape_const_handle shape, struct msdf_bounds * bounds)} */
    public static native int nmsdf_shape_get_bounds(long shape, long bounds);

    /** {@code int msdf_shape_get_bounds(msdf_shape_const_handle shape, struct msdf_bounds * bounds)} */
    public static int msdf_shape_get_bounds(@NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_bounds *") MSDFGenBounds bounds) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_shape_get_bounds(shape, bounds.address());
    }

    // --- [ msdf_shape_add_contour ] ---

    /** {@code int msdf_shape_add_contour(msdf_shape_handle shape, msdf_contour_const_handle * contour)} */
    public static native int nmsdf_shape_add_contour(long shape, long contour);

    /** {@code int msdf_shape_add_contour(msdf_shape_handle shape, msdf_contour_const_handle * contour)} */
    public static int msdf_shape_add_contour(@NativeType("msdf_shape_handle") long shape, @NativeType("msdf_contour_const_handle *") PointerBuffer contour) {
        if (CHECKS) {
            check(shape);
            check(contour, 1);
        }
        return nmsdf_shape_add_contour(shape, memAddress(contour));
    }

    // --- [ msdf_shape_remove_contour ] ---

    /** {@code int msdf_shape_remove_contour(msdf_shape_handle shape, msdf_contour_const_handle contour)} */
    public static native int nmsdf_shape_remove_contour(long shape, long contour);

    /** {@code int msdf_shape_remove_contour(msdf_shape_handle shape, msdf_contour_const_handle contour)} */
    public static int msdf_shape_remove_contour(@NativeType("msdf_shape_handle") long shape, @NativeType("msdf_contour_const_handle") long contour) {
        if (CHECKS) {
            check(shape);
            check(contour);
        }
        return nmsdf_shape_remove_contour(shape, contour);
    }

    // --- [ msdf_shape_get_contour_count ] ---

    /** {@code int msdf_shape_get_contour_count(msdf_shape_const_handle shape, size_t * size)} */
    public static native int nmsdf_shape_get_contour_count(long shape, long size);

    /** {@code int msdf_shape_get_contour_count(msdf_shape_const_handle shape, size_t * size)} */
    public static int msdf_shape_get_contour_count(@NativeType("msdf_shape_const_handle") long shape, @NativeType("size_t *") PointerBuffer size) {
        if (CHECKS) {
            check(shape);
            check(size, 1);
        }
        return nmsdf_shape_get_contour_count(shape, memAddress(size));
    }

    // --- [ msdf_shape_get_contour ] ---

    /** {@code int msdf_shape_get_contour(msdf_shape_const_handle shape, size_t index, msdf_contour_const_handle * contour)} */
    public static native int nmsdf_shape_get_contour(long shape, long index, long contour);

    /** {@code int msdf_shape_get_contour(msdf_shape_const_handle shape, size_t index, msdf_contour_const_handle * contour)} */
    public static int msdf_shape_get_contour(@NativeType("msdf_shape_const_handle") long shape, @NativeType("size_t") long index, @NativeType("msdf_contour_const_handle *") PointerBuffer contour) {
        if (CHECKS) {
            check(shape);
            check(contour, 1);
        }
        return nmsdf_shape_get_contour(shape, index, memAddress(contour));
    }

    // --- [ msdf_shape_get_edge_count ] ---

    /** {@code int msdf_shape_get_edge_count(msdf_shape_const_handle shape, size_t * count)} */
    public static native int nmsdf_shape_get_edge_count(long shape, long count);

    /** {@code int msdf_shape_get_edge_count(msdf_shape_const_handle shape, size_t * count)} */
    public static int msdf_shape_get_edge_count(@NativeType("msdf_shape_const_handle") long shape, @NativeType("size_t *") PointerBuffer count) {
        if (CHECKS) {
            check(shape);
            check(count, 1);
        }
        return nmsdf_shape_get_edge_count(shape, memAddress(count));
    }

    // --- [ msdf_shape_has_inverse_y_axis ] ---

    /** {@code int msdf_shape_has_inverse_y_axis(msdf_shape_const_handle shape, int * inverse_y_axis)} */
    public static native int nmsdf_shape_has_inverse_y_axis(long shape, long inverse_y_axis);

    /** {@code int msdf_shape_has_inverse_y_axis(msdf_shape_const_handle shape, int * inverse_y_axis)} */
    public static int msdf_shape_has_inverse_y_axis(@NativeType("msdf_shape_const_handle") long shape, @NativeType("int *") IntBuffer inverse_y_axis) {
        if (CHECKS) {
            check(shape);
            check(inverse_y_axis, 1);
        }
        return nmsdf_shape_has_inverse_y_axis(shape, memAddress(inverse_y_axis));
    }

    // --- [ msdf_shape_normalize ] ---

    /** {@code int msdf_shape_normalize(msdf_shape_handle shape)} */
    public static native int nmsdf_shape_normalize(long shape);

    /** {@code int msdf_shape_normalize(msdf_shape_handle shape)} */
    public static int msdf_shape_normalize(@NativeType("msdf_shape_handle") long shape) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_shape_normalize(shape);
    }

    // --- [ msdf_shape_validate ] ---

    /** {@code int msdf_shape_validate(msdf_shape_handle shape, int * result)} */
    public static native int nmsdf_shape_validate(long shape, long result);

    /** {@code int msdf_shape_validate(msdf_shape_handle shape, int * result)} */
    public static int msdf_shape_validate(@NativeType("msdf_shape_handle") long shape, @NativeType("int *") IntBuffer result) {
        if (CHECKS) {
            check(shape);
            check(result, 1);
        }
        return nmsdf_shape_validate(shape, memAddress(result));
    }

    // --- [ msdf_shape_bound ] ---

    /** {@code int msdf_shape_bound(msdf_shape_const_handle shape, struct msdf_bounds * bounds)} */
    public static native int nmsdf_shape_bound(long shape, long bounds);

    /** {@code int msdf_shape_bound(msdf_shape_const_handle shape, struct msdf_bounds * bounds)} */
    public static int msdf_shape_bound(@NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_bounds *") MSDFGenBounds bounds) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_shape_bound(shape, bounds.address());
    }

    // --- [ msdf_shape_bound_miters ] ---

    /** {@code int msdf_shape_bound_miters(msdf_shape_const_handle shape, struct msdf_bounds * bounds, double border, double miter_limit, int polarity)} */
    public static native int nmsdf_shape_bound_miters(long shape, long bounds, double border, double miter_limit, int polarity);

    /** {@code int msdf_shape_bound_miters(msdf_shape_const_handle shape, struct msdf_bounds * bounds, double border, double miter_limit, int polarity)} */
    public static int msdf_shape_bound_miters(@NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_bounds *") MSDFGenBounds bounds, double border, double miter_limit, int polarity) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_shape_bound_miters(shape, bounds.address(), border, miter_limit, polarity);
    }

    // --- [ msdf_shape_orient_contours ] ---

    /** {@code int msdf_shape_orient_contours(msdf_shape_handle shape)} */
    public static native int nmsdf_shape_orient_contours(long shape);

    /** {@code int msdf_shape_orient_contours(msdf_shape_handle shape)} */
    public static int msdf_shape_orient_contours(@NativeType("msdf_shape_handle") long shape) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_shape_orient_contours(shape);
    }

    // --- [ msdf_shape_edge_colors_simple ] ---

    /** {@code int msdf_shape_edge_colors_simple(msdf_shape_handle shape, double angle_threshold)} */
    public static native int nmsdf_shape_edge_colors_simple(long shape, double angle_threshold);

    /** {@code int msdf_shape_edge_colors_simple(msdf_shape_handle shape, double angle_threshold)} */
    public static int msdf_shape_edge_colors_simple(@NativeType("msdf_shape_handle") long shape, double angle_threshold) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_shape_edge_colors_simple(shape, angle_threshold);
    }

    // --- [ msdf_shape_edge_colors_ink_trap ] ---

    /** {@code int msdf_shape_edge_colors_ink_trap(msdf_shape_handle shape, double angle_threshold)} */
    public static native int nmsdf_shape_edge_colors_ink_trap(long shape, double angle_threshold);

    /** {@code int msdf_shape_edge_colors_ink_trap(msdf_shape_handle shape, double angle_threshold)} */
    public static int msdf_shape_edge_colors_ink_trap(@NativeType("msdf_shape_handle") long shape, double angle_threshold) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_shape_edge_colors_ink_trap(shape, angle_threshold);
    }

    // --- [ msdf_shape_edge_colors_by_distance ] ---

    /** {@code int msdf_shape_edge_colors_by_distance(msdf_shape_handle shape, double angle_threshold)} */
    public static native int nmsdf_shape_edge_colors_by_distance(long shape, double angle_threshold);

    /** {@code int msdf_shape_edge_colors_by_distance(msdf_shape_handle shape, double angle_threshold)} */
    public static int msdf_shape_edge_colors_by_distance(@NativeType("msdf_shape_handle") long shape, double angle_threshold) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_shape_edge_colors_by_distance(shape, angle_threshold);
    }

    // --- [ msdf_shape_one_shot_distance ] ---

    /** {@code int msdf_shape_one_shot_distance(msdf_shape_const_handle shape, struct msdf_vector2 const * origin, double * distance)} */
    public static native int nmsdf_shape_one_shot_distance(long shape, long origin, long distance);

    /** {@code int msdf_shape_one_shot_distance(msdf_shape_const_handle shape, struct msdf_vector2 const * origin, double * distance)} */
    public static int msdf_shape_one_shot_distance(@NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_vector2 const *") MSDFGenVector2 origin, @NativeType("double *") DoubleBuffer distance) {
        if (CHECKS) {
            check(shape);
            check(distance, 1);
        }
        return nmsdf_shape_one_shot_distance(shape, origin.address(), memAddress(distance));
    }

    // --- [ msdf_shape_free ] ---

    /** {@code void msdf_shape_free(msdf_shape_handle shape)} */
    public static native void nmsdf_shape_free(long shape);

    /** {@code void msdf_shape_free(msdf_shape_handle shape)} */
    public static void msdf_shape_free(@NativeType("msdf_shape_handle") long shape) {
        if (CHECKS) {
            check(shape);
        }
        nmsdf_shape_free(shape);
    }

    // --- [ msdf_contour_alloc ] ---

    /** {@code int msdf_contour_alloc(msdf_contour_handle * contour)} */
    public static native int nmsdf_contour_alloc(long contour);

    /** {@code int msdf_contour_alloc(msdf_contour_handle * contour)} */
    public static int msdf_contour_alloc(@NativeType("msdf_contour_handle *") PointerBuffer contour) {
        if (CHECKS) {
            check(contour, 1);
        }
        return nmsdf_contour_alloc(memAddress(contour));
    }

    // --- [ msdf_contour_add_edge ] ---

    /** {@code int msdf_contour_add_edge(msdf_contour_handle contour, msdf_segment_handle segment)} */
    public static native int nmsdf_contour_add_edge(long contour, long segment);

    /** {@code int msdf_contour_add_edge(msdf_contour_handle contour, msdf_segment_handle segment)} */
    public static int msdf_contour_add_edge(@NativeType("msdf_contour_handle") long contour, @NativeType("msdf_segment_handle") long segment) {
        if (CHECKS) {
            check(contour);
            check(segment);
        }
        return nmsdf_contour_add_edge(contour, segment);
    }

    // --- [ msdf_contour_remove_edge ] ---

    /** {@code int msdf_contour_remove_edge(msdf_contour_handle contour, msdf_segment_handle segment)} */
    public static native int nmsdf_contour_remove_edge(long contour, long segment);

    /** {@code int msdf_contour_remove_edge(msdf_contour_handle contour, msdf_segment_handle segment)} */
    public static int msdf_contour_remove_edge(@NativeType("msdf_contour_handle") long contour, @NativeType("msdf_segment_handle") long segment) {
        if (CHECKS) {
            check(contour);
            check(segment);
        }
        return nmsdf_contour_remove_edge(contour, segment);
    }

    // --- [ msdf_contour_get_edge_count ] ---

    /** {@code int msdf_contour_get_edge_count(msdf_contour_const_handle contour, size_t * count)} */
    public static native int nmsdf_contour_get_edge_count(long contour, long count);

    /** {@code int msdf_contour_get_edge_count(msdf_contour_const_handle contour, size_t * count)} */
    public static int msdf_contour_get_edge_count(@NativeType("msdf_contour_const_handle") long contour, @NativeType("size_t *") PointerBuffer count) {
        if (CHECKS) {
            check(contour);
            check(count, 1);
        }
        return nmsdf_contour_get_edge_count(contour, memAddress(count));
    }

    // --- [ msdf_contour_get_edge ] ---

    /** {@code int msdf_contour_get_edge(msdf_contour_const_handle contour, size_t index, msdf_segment_const_handle * segment)} */
    public static native int nmsdf_contour_get_edge(long contour, long index, long segment);

    /** {@code int msdf_contour_get_edge(msdf_contour_const_handle contour, size_t index, msdf_segment_const_handle * segment)} */
    public static int msdf_contour_get_edge(@NativeType("msdf_contour_const_handle") long contour, @NativeType("size_t") long index, @NativeType("msdf_segment_const_handle *") PointerBuffer segment) {
        if (CHECKS) {
            check(contour);
            check(segment, 1);
        }
        return nmsdf_contour_get_edge(contour, index, memAddress(segment));
    }

    // --- [ msdf_contour_bound ] ---

    /** {@code int msdf_contour_bound(msdf_contour_const_handle contour, struct msdf_bounds * bounds)} */
    public static native int nmsdf_contour_bound(long contour, long bounds);

    /** {@code int msdf_contour_bound(msdf_contour_const_handle contour, struct msdf_bounds * bounds)} */
    public static int msdf_contour_bound(@NativeType("msdf_contour_const_handle") long contour, @NativeType("struct msdf_bounds *") MSDFGenBounds bounds) {
        if (CHECKS) {
            check(contour);
        }
        return nmsdf_contour_bound(contour, bounds.address());
    }

    // --- [ msdf_contour_bound_miters ] ---

    /** {@code int msdf_contour_bound_miters(msdf_contour_const_handle contour, struct msdf_bounds * bounds, double border, double miter_limit, int polarity)} */
    public static native int nmsdf_contour_bound_miters(long contour, long bounds, double border, double miter_limit, int polarity);

    /** {@code int msdf_contour_bound_miters(msdf_contour_const_handle contour, struct msdf_bounds * bounds, double border, double miter_limit, int polarity)} */
    public static int msdf_contour_bound_miters(@NativeType("msdf_contour_const_handle") long contour, @NativeType("struct msdf_bounds *") MSDFGenBounds bounds, double border, double miter_limit, int polarity) {
        if (CHECKS) {
            check(contour);
        }
        return nmsdf_contour_bound_miters(contour, bounds.address(), border, miter_limit, polarity);
    }

    // --- [ msdf_contour_get_winding ] ---

    /** {@code int msdf_contour_get_winding(msdf_contour_const_handle contour, int * winding)} */
    public static native int nmsdf_contour_get_winding(long contour, long winding);

    /** {@code int msdf_contour_get_winding(msdf_contour_const_handle contour, int * winding)} */
    public static int msdf_contour_get_winding(@NativeType("msdf_contour_const_handle") long contour, @NativeType("int *") IntBuffer winding) {
        if (CHECKS) {
            check(contour);
            check(winding, 1);
        }
        return nmsdf_contour_get_winding(contour, memAddress(winding));
    }

    // --- [ msdf_contour_reverse ] ---

    /** {@code int msdf_contour_reverse(msdf_contour_handle contour)} */
    public static native int nmsdf_contour_reverse(long contour);

    /** {@code int msdf_contour_reverse(msdf_contour_handle contour)} */
    public static int msdf_contour_reverse(@NativeType("msdf_contour_handle") long contour) {
        if (CHECKS) {
            check(contour);
        }
        return nmsdf_contour_reverse(contour);
    }

    // --- [ msdf_contour_free ] ---

    /** {@code void msdf_contour_free(msdf_contour_handle contour)} */
    public static native void nmsdf_contour_free(long contour);

    /** {@code void msdf_contour_free(msdf_contour_handle contour)} */
    public static void msdf_contour_free(@NativeType("msdf_contour_handle") long contour) {
        if (CHECKS) {
            check(contour);
        }
        nmsdf_contour_free(contour);
    }

    // --- [ msdf_segment_alloc ] ---

    /** {@code int msdf_segment_alloc(int type, msdf_segment_handle * segment)} */
    public static native int nmsdf_segment_alloc(int type, long segment);

    /** {@code int msdf_segment_alloc(int type, msdf_segment_handle * segment)} */
    public static int msdf_segment_alloc(int type, @NativeType("msdf_segment_handle *") PointerBuffer segment) {
        if (CHECKS) {
            check(segment, 1);
        }
        return nmsdf_segment_alloc(type, memAddress(segment));
    }

    // --- [ msdf_segment_get_type ] ---

    /** {@code int msdf_segment_get_type(msdf_segment_const_handle segment, int * type)} */
    public static native int nmsdf_segment_get_type(long segment, long type);

    /** {@code int msdf_segment_get_type(msdf_segment_const_handle segment, int * type)} */
    public static int msdf_segment_get_type(@NativeType("msdf_segment_const_handle") long segment, @NativeType("int *") IntBuffer type) {
        if (CHECKS) {
            check(segment);
            check(type, 1);
        }
        return nmsdf_segment_get_type(segment, memAddress(type));
    }

    // --- [ msdf_segment_get_point_count ] ---

    /** {@code int msdf_segment_get_point_count(msdf_segment_const_handle segment, size_t * count)} */
    public static native int nmsdf_segment_get_point_count(long segment, long count);

    /** {@code int msdf_segment_get_point_count(msdf_segment_const_handle segment, size_t * count)} */
    public static int msdf_segment_get_point_count(@NativeType("msdf_segment_const_handle") long segment, @NativeType("size_t *") PointerBuffer count) {
        if (CHECKS) {
            check(segment);
            check(count, 1);
        }
        return nmsdf_segment_get_point_count(segment, memAddress(count));
    }

    // --- [ msdf_segment_get_point ] ---

    /** {@code int msdf_segment_get_point(msdf_segment_const_handle segment, size_t index, struct msdf_vector2 * point)} */
    public static native int nmsdf_segment_get_point(long segment, long index, long point);

    /** {@code int msdf_segment_get_point(msdf_segment_const_handle segment, size_t index, struct msdf_vector2 * point)} */
    public static int msdf_segment_get_point(@NativeType("msdf_segment_const_handle") long segment, @NativeType("size_t") long index, @NativeType("struct msdf_vector2 *") MSDFGenVector2 point) {
        if (CHECKS) {
            check(segment);
        }
        return nmsdf_segment_get_point(segment, index, point.address());
    }

    // --- [ msdf_segment_set_point ] ---

    /** {@code int msdf_segment_set_point(msdf_segment_handle segment, size_t index, struct msdf_vector2 const * point)} */
    public static native int nmsdf_segment_set_point(long segment, long index, long point);

    /** {@code int msdf_segment_set_point(msdf_segment_handle segment, size_t index, struct msdf_vector2 const * point)} */
    public static int msdf_segment_set_point(@NativeType("msdf_segment_handle") long segment, @NativeType("size_t") long index, @NativeType("struct msdf_vector2 const *") MSDFGenVector2 point) {
        if (CHECKS) {
            check(segment);
        }
        return nmsdf_segment_set_point(segment, index, point.address());
    }

    // --- [ msdf_segment_get_color ] ---

    /** {@code int msdf_segment_get_color(msdf_segment_const_handle segment, int * color)} */
    public static native int nmsdf_segment_get_color(long segment, long color);

    /** {@code int msdf_segment_get_color(msdf_segment_const_handle segment, int * color)} */
    public static int msdf_segment_get_color(@NativeType("msdf_segment_const_handle") long segment, @NativeType("int *") IntBuffer color) {
        if (CHECKS) {
            check(segment);
            check(color, 1);
        }
        return nmsdf_segment_get_color(segment, memAddress(color));
    }

    // --- [ msdf_segment_set_color ] ---

    /** {@code int msdf_segment_set_color(msdf_segment_handle segment, int color)} */
    public static native int nmsdf_segment_set_color(long segment, int color);

    /** {@code int msdf_segment_set_color(msdf_segment_handle segment, int color)} */
    public static int msdf_segment_set_color(@NativeType("msdf_segment_handle") long segment, int color) {
        if (CHECKS) {
            check(segment);
        }
        return nmsdf_segment_set_color(segment, color);
    }

    // --- [ msdf_segment_get_direction ] ---

    /** {@code int msdf_segment_get_direction(msdf_segment_const_handle segment, double param, struct msdf_vector2 * direction)} */
    public static native int nmsdf_segment_get_direction(long segment, double param, long direction);

    /** {@code int msdf_segment_get_direction(msdf_segment_const_handle segment, double param, struct msdf_vector2 * direction)} */
    public static int msdf_segment_get_direction(@NativeType("msdf_segment_const_handle") long segment, double param, @NativeType("struct msdf_vector2 *") MSDFGenVector2 direction) {
        if (CHECKS) {
            check(segment);
        }
        return nmsdf_segment_get_direction(segment, param, direction.address());
    }

    // --- [ msdf_segment_get_direction_change ] ---

    /** {@code int msdf_segment_get_direction_change(msdf_segment_const_handle segment, double param, struct msdf_vector2 * direction_change)} */
    public static native int nmsdf_segment_get_direction_change(long segment, double param, long direction_change);

    /** {@code int msdf_segment_get_direction_change(msdf_segment_const_handle segment, double param, struct msdf_vector2 * direction_change)} */
    public static int msdf_segment_get_direction_change(@NativeType("msdf_segment_const_handle") long segment, double param, @NativeType("struct msdf_vector2 *") MSDFGenVector2 direction_change) {
        if (CHECKS) {
            check(segment);
        }
        return nmsdf_segment_get_direction_change(segment, param, direction_change.address());
    }

    // --- [ msdf_segment_point ] ---

    /** {@code int msdf_segment_point(msdf_segment_const_handle segment, double param, struct msdf_vector2 * point)} */
    public static native int nmsdf_segment_point(long segment, double param, long point);

    /** {@code int msdf_segment_point(msdf_segment_const_handle segment, double param, struct msdf_vector2 * point)} */
    public static int msdf_segment_point(@NativeType("msdf_segment_const_handle") long segment, double param, @NativeType("struct msdf_vector2 *") MSDFGenVector2 point) {
        if (CHECKS) {
            check(segment);
        }
        return nmsdf_segment_point(segment, param, point.address());
    }

    // --- [ msdf_segment_bound ] ---

    /** {@code int msdf_segment_bound(msdf_segment_const_handle segment, struct msdf_bounds * bounds)} */
    public static native int nmsdf_segment_bound(long segment, long bounds);

    /** {@code int msdf_segment_bound(msdf_segment_const_handle segment, struct msdf_bounds * bounds)} */
    public static int msdf_segment_bound(@NativeType("msdf_segment_const_handle") long segment, @NativeType("struct msdf_bounds *") MSDFGenBounds bounds) {
        if (CHECKS) {
            check(segment);
        }
        return nmsdf_segment_bound(segment, bounds.address());
    }

    // --- [ msdf_segment_move_start_point ] ---

    /** {@code int msdf_segment_move_start_point(msdf_segment_handle segment, struct msdf_vector2 const * point)} */
    public static native int nmsdf_segment_move_start_point(long segment, long point);

    /** {@code int msdf_segment_move_start_point(msdf_segment_handle segment, struct msdf_vector2 const * point)} */
    public static int msdf_segment_move_start_point(@NativeType("msdf_segment_handle") long segment, @NativeType("struct msdf_vector2 const *") MSDFGenVector2 point) {
        if (CHECKS) {
            check(segment);
        }
        return nmsdf_segment_move_start_point(segment, point.address());
    }

    // --- [ msdf_segment_move_end_point ] ---

    /** {@code int msdf_segment_move_end_point(msdf_segment_handle segment, struct msdf_vector2 const * point)} */
    public static native int nmsdf_segment_move_end_point(long segment, long point);

    /** {@code int msdf_segment_move_end_point(msdf_segment_handle segment, struct msdf_vector2 const * point)} */
    public static int msdf_segment_move_end_point(@NativeType("msdf_segment_handle") long segment, @NativeType("struct msdf_vector2 const *") MSDFGenVector2 point) {
        if (CHECKS) {
            check(segment);
        }
        return nmsdf_segment_move_end_point(segment, point.address());
    }

    // --- [ msdf_segment_free ] ---

    /** {@code void msdf_segment_free(msdf_segment_handle segment)} */
    public static native void nmsdf_segment_free(long segment);

    /** {@code void msdf_segment_free(msdf_segment_handle segment)} */
    public static void msdf_segment_free(@NativeType("msdf_segment_handle") long segment) {
        if (CHECKS) {
            check(segment);
        }
        nmsdf_segment_free(segment);
    }

    // --- [ msdf_generate_sdf ] ---

    /** {@code int msdf_generate_sdf(struct msdf_bitmap * output, msdf_shape_const_handle shape, struct msdf_transform const * transform)} */
    public static native int nmsdf_generate_sdf(long output, long shape, long transform);

    /** {@code int msdf_generate_sdf(struct msdf_bitmap * output, msdf_shape_const_handle shape, struct msdf_transform const * transform)} */
    public static int msdf_generate_sdf(@NativeType("struct msdf_bitmap *") MSDFGenBitmap output, @NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_transform const *") MSDFGenTransform transform) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_generate_sdf(output.address(), shape, transform.address());
    }

    // --- [ msdf_generate_psdf ] ---

    /** {@code int msdf_generate_psdf(struct msdf_bitmap * output, msdf_shape_const_handle shape, struct msdf_transform const * transform)} */
    public static native int nmsdf_generate_psdf(long output, long shape, long transform);

    /** {@code int msdf_generate_psdf(struct msdf_bitmap * output, msdf_shape_const_handle shape, struct msdf_transform const * transform)} */
    public static int msdf_generate_psdf(@NativeType("struct msdf_bitmap *") MSDFGenBitmap output, @NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_transform const *") MSDFGenTransform transform) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_generate_psdf(output.address(), shape, transform.address());
    }

    // --- [ msdf_generate_msdf ] ---

    /** {@code int msdf_generate_msdf(struct msdf_bitmap * output, msdf_shape_const_handle shape, struct msdf_transform const * transform)} */
    public static native int nmsdf_generate_msdf(long output, long shape, long transform);

    /** {@code int msdf_generate_msdf(struct msdf_bitmap * output, msdf_shape_const_handle shape, struct msdf_transform const * transform)} */
    public static int msdf_generate_msdf(@NativeType("struct msdf_bitmap *") MSDFGenBitmap output, @NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_transform const *") MSDFGenTransform transform) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_generate_msdf(output.address(), shape, transform.address());
    }

    // --- [ msdf_generate_mtsdf ] ---

    /** {@code int msdf_generate_mtsdf(struct msdf_bitmap * output, msdf_shape_const_handle shape, struct msdf_transform const * transform)} */
    public static native int nmsdf_generate_mtsdf(long output, long shape, long transform);

    /** {@code int msdf_generate_mtsdf(struct msdf_bitmap * output, msdf_shape_const_handle shape, struct msdf_transform const * transform)} */
    public static int msdf_generate_mtsdf(@NativeType("struct msdf_bitmap *") MSDFGenBitmap output, @NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_transform const *") MSDFGenTransform transform) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_generate_mtsdf(output.address(), shape, transform.address());
    }

    // --- [ msdf_generate_sdf_with_config ] ---

    /** {@code int msdf_generate_sdf_with_config(struct msdf_bitmap * output, msdf_shape_const_handle shape, struct msdf_transform const * transform, struct msdf_config const * config)} */
    public static native int nmsdf_generate_sdf_with_config(long output, long shape, long transform, long config);

    /** {@code int msdf_generate_sdf_with_config(struct msdf_bitmap * output, msdf_shape_const_handle shape, struct msdf_transform const * transform, struct msdf_config const * config)} */
    public static int msdf_generate_sdf_with_config(@NativeType("struct msdf_bitmap *") MSDFGenBitmap output, @NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_transform const *") MSDFGenTransform transform, @NativeType("struct msdf_config const *") MSDFGenConfig config) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_generate_sdf_with_config(output.address(), shape, transform.address(), config.address());
    }

    // --- [ msdf_generate_psdf_with_config ] ---

    /** {@code int msdf_generate_psdf_with_config(struct msdf_bitmap * output, msdf_shape_const_handle shape, struct msdf_transform const * transform, struct msdf_config const * config)} */
    public static native int nmsdf_generate_psdf_with_config(long output, long shape, long transform, long config);

    /** {@code int msdf_generate_psdf_with_config(struct msdf_bitmap * output, msdf_shape_const_handle shape, struct msdf_transform const * transform, struct msdf_config const * config)} */
    public static int msdf_generate_psdf_with_config(@NativeType("struct msdf_bitmap *") MSDFGenBitmap output, @NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_transform const *") MSDFGenTransform transform, @NativeType("struct msdf_config const *") MSDFGenConfig config) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_generate_psdf_with_config(output.address(), shape, transform.address(), config.address());
    }

    // --- [ msdf_generate_msdf_with_config ] ---

    /** {@code int msdf_generate_msdf_with_config(struct msdf_bitmap * output, msdf_shape_const_handle shape, struct msdf_transform const * transform, struct msdf_multichannel_config const * config)} */
    public static native int nmsdf_generate_msdf_with_config(long output, long shape, long transform, long config);

    /** {@code int msdf_generate_msdf_with_config(struct msdf_bitmap * output, msdf_shape_const_handle shape, struct msdf_transform const * transform, struct msdf_multichannel_config const * config)} */
    public static int msdf_generate_msdf_with_config(@NativeType("struct msdf_bitmap *") MSDFGenBitmap output, @NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_transform const *") MSDFGenTransform transform, @NativeType("struct msdf_multichannel_config const *") MSDFGenMultichannelConfig config) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_generate_msdf_with_config(output.address(), shape, transform.address(), config.address());
    }

    // --- [ msdf_generate_mtsdf_with_config ] ---

    /** {@code int msdf_generate_mtsdf_with_config(struct msdf_bitmap * output, msdf_shape_const_handle shape, struct msdf_transform const * transform, struct msdf_multichannel_config const * config)} */
    public static native int nmsdf_generate_mtsdf_with_config(long output, long shape, long transform, long config);

    /** {@code int msdf_generate_mtsdf_with_config(struct msdf_bitmap * output, msdf_shape_const_handle shape, struct msdf_transform const * transform, struct msdf_multichannel_config const * config)} */
    public static int msdf_generate_mtsdf_with_config(@NativeType("struct msdf_bitmap *") MSDFGenBitmap output, @NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_transform const *") MSDFGenTransform transform, @NativeType("struct msdf_multichannel_config const *") MSDFGenMultichannelConfig config) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_generate_mtsdf_with_config(output.address(), shape, transform.address(), config.address());
    }

}
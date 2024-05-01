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

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #MSDF_SUCCESS SUCCESS}</li>
     * <li>{@link #MSDF_ERR_FAILED ERR_FAILED}</li>
     * <li>{@link #MSDF_ERR_INVALID_ARG ERR_INVALID_ARG}</li>
     * <li>{@link #MSDF_ERR_INVALID_TYPE ERR_INVALID_TYPE}</li>
     * <li>{@link #MSDF_ERR_INVALID_SIZE ERR_INVALID_SIZE}</li>
     * <li>{@link #MSDF_ERR_INVALID_INDEX ERR_INVALID_INDEX}</li>
     * </ul>
     */
    public static final int
        MSDF_SUCCESS           = 0,
        MSDF_ERR_FAILED        = 1,
        MSDF_ERR_INVALID_ARG   = 2,
        MSDF_ERR_INVALID_TYPE  = 3,
        MSDF_ERR_INVALID_SIZE  = 4,
        MSDF_ERR_INVALID_INDEX = 5;

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #MSDF_BITMAP_TYPE_SDF BITMAP_TYPE_SDF}</li>
     * <li>{@link #MSDF_BITMAP_TYPE_PSDF BITMAP_TYPE_PSDF}</li>
     * <li>{@link #MSDF_BITMAP_TYPE_MSDF BITMAP_TYPE_MSDF}</li>
     * <li>{@link #MSDF_BITMAP_TYPE_MTSDF BITMAP_TYPE_MTSDF}</li>
     * </ul>
     */
    public static final int
        MSDF_BITMAP_TYPE_SDF   = 0,
        MSDF_BITMAP_TYPE_PSDF  = 1,
        MSDF_BITMAP_TYPE_MSDF  = 2,
        MSDF_BITMAP_TYPE_MTSDF = 3;

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #MSDF_SEGMENT_TYPE_LINEAR SEGMENT_TYPE_LINEAR}</li>
     * <li>{@link #MSDF_SEGMENT_TYPE_QUADRATIC SEGMENT_TYPE_QUADRATIC}</li>
     * <li>{@link #MSDF_SEGMENT_TYPE_CUBIC SEGMENT_TYPE_CUBIC}</li>
     * </ul>
     */
    public static final int
        MSDF_SEGMENT_TYPE_LINEAR    = 0,
        MSDF_SEGMENT_TYPE_QUADRATIC = 1,
        MSDF_SEGMENT_TYPE_CUBIC     = 2;

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #MSDF_EDGE_COLOR_BLACK EDGE_COLOR_BLACK}</li>
     * <li>{@link #MSDF_EDGE_COLOR_RED EDGE_COLOR_RED}</li>
     * <li>{@link #MSDF_EDGE_COLOR_GREEN EDGE_COLOR_GREEN}</li>
     * <li>{@link #MSDF_EDGE_COLOR_YELLOW EDGE_COLOR_YELLOW}</li>
     * <li>{@link #MSDF_EDGE_COLOR_BLUE EDGE_COLOR_BLUE}</li>
     * <li>{@link #MSDF_EDGE_COLOR_MAGENTA EDGE_COLOR_MAGENTA}</li>
     * <li>{@link #MSDF_EDGE_COLOR_CYAN EDGE_COLOR_CYAN}</li>
     * <li>{@link #MSDF_EDGE_COLOR_WHITE EDGE_COLOR_WHITE}</li>
     * </ul>
     */
    public static final int
        MSDF_EDGE_COLOR_BLACK   = 0,
        MSDF_EDGE_COLOR_RED     = 1,
        MSDF_EDGE_COLOR_GREEN   = 2,
        MSDF_EDGE_COLOR_YELLOW  = 3,
        MSDF_EDGE_COLOR_BLUE    = 4,
        MSDF_EDGE_COLOR_MAGENTA = 5,
        MSDF_EDGE_COLOR_CYAN    = 6,
        MSDF_EDGE_COLOR_WHITE   = 7;

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #MSDF_ERROR_CORRECTION_MODE_DISABLED ERROR_CORRECTION_MODE_DISABLED}</li>
     * <li>{@link #MSDF_ERROR_CORRECTION_MODE_INDISCRIMINATE ERROR_CORRECTION_MODE_INDISCRIMINATE}</li>
     * <li>{@link #MSDF_ERROR_CORRECTION_MODE_EDGE_PRIORITY ERROR_CORRECTION_MODE_EDGE_PRIORITY}</li>
     * <li>{@link #MSDF_ERROR_CORRECTION_MODE_EDGE_ONLY ERROR_CORRECTION_MODE_EDGE_ONLY}</li>
     * </ul>
     */
    public static final int
        MSDF_ERROR_CORRECTION_MODE_DISABLED       = 0,
        MSDF_ERROR_CORRECTION_MODE_INDISCRIMINATE = 1,
        MSDF_ERROR_CORRECTION_MODE_EDGE_PRIORITY  = 2,
        MSDF_ERROR_CORRECTION_MODE_EDGE_ONLY      = 3;

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #MSDF_DISTANCE_CHECK_MODE_NONE DISTANCE_CHECK_MODE_NONE}</li>
     * <li>{@link #MSDF_DISTANCE_CHECK_MODE_AT_EDGE DISTANCE_CHECK_MODE_AT_EDGE}</li>
     * <li>{@link #MSDF_DISTANCE_CHECK_MODE_ALWAYS DISTANCE_CHECK_MODE_ALWAYS}</li>
     * </ul>
     */
    public static final int
        MSDF_DISTANCE_CHECK_MODE_NONE    = 0,
        MSDF_DISTANCE_CHECK_MODE_AT_EDGE = 1,
        MSDF_DISTANCE_CHECK_MODE_ALWAYS  = 2;

    protected MSDFGen() {
        throw new UnsupportedOperationException();
    }

    // --- [ msdf_bitmap_alloc ] ---

    /** Unsafe version of: {@link #msdf_bitmap_alloc bitmap_alloc} */
    public static native int nmsdf_bitmap_alloc(int type, int width, int height, long bitmap);

    /**
     * Allocates a new MSDF bitmap object to render a shape into using the internal allocator.
     *
     * @param type   the type of bitmap to allocate. One of:<br><table><tr><td>{@link #MSDF_BITMAP_TYPE_SDF BITMAP_TYPE_SDF}</td><td>{@link #MSDF_BITMAP_TYPE_PSDF BITMAP_TYPE_PSDF}</td><td>{@link #MSDF_BITMAP_TYPE_MSDF BITMAP_TYPE_MSDF}</td><td>{@link #MSDF_BITMAP_TYPE_MTSDF BITMAP_TYPE_MTSDF}</td></tr></table>
     * @param width  the width of the bitmap in pixels
     * @param height the height of the bitmap in pixels
     * @param bitmap a pointer to an {@code msdf_bitmap_t} structure to allocate a new bitmap into
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_bitmap_alloc(int type, int width, int height, @NativeType("struct msdf_bitmap *") MSDFGenBitmap bitmap) {
        return nmsdf_bitmap_alloc(type, width, height, bitmap.address());
    }

    // --- [ msdf_bitmap_get_channel_count ] ---

    /** Unsafe version of: {@link #msdf_bitmap_get_channel_count bitmap_get_channel_count} */
    public static native int nmsdf_bitmap_get_channel_count(long bitmap, long channel_count);

    /**
     * Retrieves the number of color channels used by the given bitmap.
     *
     * @param bitmap        a pointer to an {@code msdf_bitmap_t} structure to retrieve the channel count from
     * @param channel_count a pointer to a variable which is populated with the number of color channels used by the given bitmap
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_bitmap_get_channel_count(@NativeType("struct msdf_bitmap const *") MSDFGenBitmap bitmap, @NativeType("int *") IntBuffer channel_count) {
        if (CHECKS) {
            check(channel_count, 1);
            MSDFGenBitmap.validate(bitmap.address());
        }
        return nmsdf_bitmap_get_channel_count(bitmap.address(), memAddress(channel_count));
    }

    // --- [ msdf_bitmap_get_pixels ] ---

    /** Unsafe version of: {@link #msdf_bitmap_get_pixels bitmap_get_pixels} */
    public static native int nmsdf_bitmap_get_pixels(long bitmap, long pixels);

    /**
     * Retrieves the address of the raw pixel data of the given bitmap.
     *
     * @param bitmap a pointer to an {@code msdf_bitmap_t} structure to retrieve the raw pixel data from
     * @param pixels a pointer to an address which is populated with the raw pixel data of the given bitmap
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_bitmap_get_pixels(@NativeType("struct msdf_bitmap const *") MSDFGenBitmap bitmap, @NativeType("void **") PointerBuffer pixels) {
        if (CHECKS) {
            check(pixels, 1);
            MSDFGenBitmap.validate(bitmap.address());
        }
        return nmsdf_bitmap_get_pixels(bitmap.address(), memAddress(pixels));
    }

    // --- [ msdf_bitmap_get_byte_size ] ---

    /** Unsafe version of: {@link #msdf_bitmap_get_byte_size bitmap_get_byte_size} */
    public static native int nmsdf_bitmap_get_byte_size(long bitmap, long size);

    /**
     * Retrieves the size of the pixel data of the given bitmap in bytes.
     *
     * @param bitmap a pointer to an {@code msdf_bitmap_t} structure to retrieve the size of the raw pixel data from
     * @param size   a pointer to a variable which is populated with the byte size of the raw pixel data of the given bitmap
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_bitmap_get_byte_size(@NativeType("struct msdf_bitmap const *") MSDFGenBitmap bitmap, @NativeType("size_t *") PointerBuffer size) {
        if (CHECKS) {
            check(size, 1);
            MSDFGenBitmap.validate(bitmap.address());
        }
        return nmsdf_bitmap_get_byte_size(bitmap.address(), memAddress(size));
    }

    // --- [ msdf_bitmap_free ] ---

    /** Unsafe version of: {@link #msdf_bitmap_free bitmap_free} */
    public static native void nmsdf_bitmap_free(long bitmap);

    /**
     * Calls the destructor of the given bitmap and frees its memory using the internal allocator.
     *
     * @param bitmap a pointer to an {@code msdf_bitmap_t} structure to be freed.
     */
    public static void msdf_bitmap_free(@NativeType("struct msdf_bitmap *") MSDFGenBitmap bitmap) {
        nmsdf_bitmap_free(bitmap.address());
    }

    // --- [ msdf_shape_alloc ] ---

    /** Unsafe version of: {@link #msdf_shape_alloc shape_alloc} */
    public static native int nmsdf_shape_alloc(long shape);

    /**
     * Allocates a new MSDF shape object using the internal allocator.
     *
     * @param shape a pointer to an address which is populated with the address of the newly allocated shape.
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_shape_alloc(@NativeType("msdf_shape_handle *") PointerBuffer shape) {
        if (CHECKS) {
            check(shape, 1);
        }
        return nmsdf_shape_alloc(memAddress(shape));
    }

    // --- [ msdf_shape_get_bounds ] ---

    /** Unsafe version of: {@link #msdf_shape_get_bounds shape_get_bounds} */
    public static native int nmsdf_shape_get_bounds(long shape, long bounds);

    /**
     * Retrieves the bounds of the given shape.
     *
     * @param shape  a pointer to a shape object to retrieve the bounds from
     * @param bounds a pointer to a variable which is populated with the bounds of the given shape
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_shape_get_bounds(@NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_bounds *") MSDFGenBounds bounds) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_shape_get_bounds(shape, bounds.address());
    }

    // --- [ msdf_shape_add_contour ] ---

    /** Unsafe version of: {@link #msdf_shape_add_contour shape_add_contour} */
    public static native int nmsdf_shape_add_contour(long shape, long contour);

    /**
     * Adds a new contour to the given shape.
     *
     * @param shape   a pointer to a shape object to add a new contour to
     * @param contour a pointer to a contour handle to be populated with a new contour that was added to the shape
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_shape_add_contour(@NativeType("msdf_shape_handle") long shape, @NativeType("msdf_contour_const_handle *") PointerBuffer contour) {
        if (CHECKS) {
            check(shape);
            check(contour, 1);
        }
        return nmsdf_shape_add_contour(shape, memAddress(contour));
    }

    // --- [ msdf_shape_remove_contour ] ---

    /** Unsafe version of: {@link #msdf_shape_remove_contour shape_remove_contour} */
    public static native int nmsdf_shape_remove_contour(long shape, long contour);

    /**
     * Removes the given contour from the given shape if present.
     *
     * @param shape   a pointer to a shape object to remove the given contour from
     * @param contour a pointer to the contour to remove from the shape
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_shape_remove_contour(@NativeType("msdf_shape_handle") long shape, @NativeType("msdf_contour_const_handle") long contour) {
        if (CHECKS) {
            check(shape);
            check(contour);
        }
        return nmsdf_shape_remove_contour(shape, contour);
    }

    // --- [ msdf_shape_get_contour_count ] ---

    /** Unsafe version of: {@link #msdf_shape_get_contour_count shape_get_contour_count} */
    public static native int nmsdf_shape_get_contour_count(long shape, long size);

    /**
     * Retrieves the number of contours allocated within the given shape object.
     *
     * @param shape a pointer to a shape object from which to retrieve the contour count
     * @param size  a pointer to a variable which is populated with the number of contours of the given shape
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_shape_get_contour_count(@NativeType("msdf_shape_const_handle") long shape, @NativeType("size_t *") PointerBuffer size) {
        if (CHECKS) {
            check(shape);
            check(size, 1);
        }
        return nmsdf_shape_get_contour_count(shape, memAddress(size));
    }

    // --- [ msdf_shape_get_contour ] ---

    /** Unsafe version of: {@link #msdf_shape_get_contour shape_get_contour} */
    public static native int nmsdf_shape_get_contour(long shape, long index, long contour);

    /**
     * Retrieves a contour at a given index from the given shape.
     *
     * @param shape   a pointer to a shape object from which to retrieve a contour
     * @param index   the index of the contour to retrieve
     * @param contour a pointer to an address which is populated with the address of the contour at the given index if present
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_shape_get_contour(@NativeType("msdf_shape_const_handle") long shape, @NativeType("size_t") long index, @NativeType("msdf_contour_const_handle *") PointerBuffer contour) {
        if (CHECKS) {
            check(shape);
            check(contour, 1);
        }
        return nmsdf_shape_get_contour(shape, index, memAddress(contour));
    }

    // --- [ msdf_shape_get_edge_count ] ---

    /** Unsafe version of: {@link #msdf_shape_get_edge_count shape_get_edge_count} */
    public static native int nmsdf_shape_get_edge_count(long shape, long count);

    /**
     * Retrieves the number of edges of the given shape.
     *
     * @param shape a pointer to a shape from which to retrieve the edge count
     * @param count a pointer to a variable which is populated with the number of edges defined by the given shape
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_shape_get_edge_count(@NativeType("msdf_shape_const_handle") long shape, @NativeType("size_t *") PointerBuffer count) {
        if (CHECKS) {
            check(shape);
            check(count, 1);
        }
        return nmsdf_shape_get_edge_count(shape, memAddress(count));
    }

    // --- [ msdf_shape_has_inverse_y_axis ] ---

    /** Unsafe version of: {@link #msdf_shape_has_inverse_y_axis shape_has_inverse_y_axis} */
    public static native int nmsdf_shape_has_inverse_y_axis(long shape, long inverse_y_axis);

    /**
     * Retrieves the inverse-y-axis flag of the given shape.
     *
     * @param shape          a pointer to a shape from which to fetch the inverse-y-axis flag
     * @param inverse_y_axis a pointer to a variable which is populated with {@link #MSDF_TRUE TRUE} when the y-axis of the given shape is inverted. Otherwise the variable will be set to {@link #MSDF_FALSE FALSE}.
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_shape_has_inverse_y_axis(@NativeType("msdf_shape_const_handle") long shape, @NativeType("int *") IntBuffer inverse_y_axis) {
        if (CHECKS) {
            check(shape);
            check(inverse_y_axis, 1);
        }
        return nmsdf_shape_has_inverse_y_axis(shape, memAddress(inverse_y_axis));
    }

    // --- [ msdf_shape_normalize ] ---

    /** Unsafe version of: {@link #msdf_shape_normalize shape_normalize} */
    public static native int nmsdf_shape_normalize(long shape);

    /**
     * Normalizes the given shape.
     *
     * @param shape a pointer to a shape to normalize
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_shape_normalize(@NativeType("msdf_shape_handle") long shape) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_shape_normalize(shape);
    }

    // --- [ msdf_shape_validate ] ---

    /** Unsafe version of: {@link #msdf_shape_validate shape_validate} */
    public static native int nmsdf_shape_validate(long shape, long result);

    /**
     * Validates the given shape.
     *
     * @param shape  a pointer to a shape to validate
     * @param result a pointer to a variable which is populated with {@link #MSDF_TRUE TRUE} when the validation was successful. Otherwise the variable will be set to {@link #MSDF_FALSE FALSE}.
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_shape_validate(@NativeType("msdf_shape_handle") long shape, @NativeType("int *") IntBuffer result) {
        if (CHECKS) {
            check(shape);
            check(result, 1);
        }
        return nmsdf_shape_validate(shape, memAddress(result));
    }

    // --- [ msdf_shape_bound ] ---

    /** Unsafe version of: {@link #msdf_shape_bound shape_bound} */
    public static native int nmsdf_shape_bound(long shape, long bounds);

    /**
     * Adjusts the given bounding box to fit the given shape.
     *
     * @param shape  a pointer to a shape to fit into the given bounding box
     * @param bounds a pointer to a bounding box which should at least fit the given shape
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_shape_bound(@NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_bounds *") MSDFGenBounds bounds) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_shape_bound(shape, bounds.address());
    }

    // --- [ msdf_shape_bound_miters ] ---

    /** Unsafe version of: {@link #msdf_shape_bound_miters shape_bound_miters} */
    public static native int nmsdf_shape_bound_miters(long shape, long bounds, double border, double miter_limit, int polarity);

    /**
     * Adjusts the given bounding box to fit the given shape including a mitered border.
     *
     * @param shape       a pointer to a shape to fit into the given bounding box
     * @param bounds      a pointer to a bounding box which should at least fit the given shape including the specified border
     * @param border      the size of the border
     * @param miter_limit the miter limit value
     * @param polarity    the miter polarity
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_shape_bound_miters(@NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_bounds *") MSDFGenBounds bounds, double border, double miter_limit, int polarity) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_shape_bound_miters(shape, bounds.address(), border, miter_limit, polarity);
    }

    // --- [ msdf_shape_orient_contours ] ---

    /** Unsafe version of: {@link #msdf_shape_orient_contours shape_orient_contours} */
    public static native int nmsdf_shape_orient_contours(long shape);

    /**
     * Orients all contours associated with the given shape before rendering.
     *
     * @param shape a pointer to a shape whose contours to orient
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_shape_orient_contours(@NativeType("msdf_shape_handle") long shape) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_shape_orient_contours(shape);
    }

    // --- [ msdf_shape_edge_colors_simple ] ---

    /** Unsafe version of: {@link #msdf_shape_edge_colors_simple shape_edge_colors_simple} */
    public static native int nmsdf_shape_edge_colors_simple(long shape, double angle_threshold);

    /**
     * Colors the edges of the given shape using the default MSDF colors specified by the {@code MSDF_COLOR_} prefixed constants.
     *
     * @param shape           a pointer to a shape whose edges to color with the default MSDF colors
     * @param angle_threshold the threshold angle in degrees
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_shape_edge_colors_simple(@NativeType("msdf_shape_handle") long shape, double angle_threshold) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_shape_edge_colors_simple(shape, angle_threshold);
    }

    // --- [ msdf_shape_edge_colors_ink_trap ] ---

    /** Unsafe version of: {@link #msdf_shape_edge_colors_ink_trap shape_edge_colors_ink_trap} */
    public static native int nmsdf_shape_edge_colors_ink_trap(long shape, double angle_threshold);

    /**
     * Colors the edges of the given shape using the default MSDF colors specified by the {@code MSDF_COLOR_} prefixed constants using the ink trap algorithm.
     *
     * @param shape           a pointer to a shape whose edges to color with the default MSDF colors
     * @param angle_threshold the threshold angle in degrees
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_shape_edge_colors_ink_trap(@NativeType("msdf_shape_handle") long shape, double angle_threshold) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_shape_edge_colors_ink_trap(shape, angle_threshold);
    }

    // --- [ msdf_shape_edge_colors_by_distance ] ---

    /** Unsafe version of: {@link #msdf_shape_edge_colors_by_distance shape_edge_colors_by_distance} */
    public static native int nmsdf_shape_edge_colors_by_distance(long shape, double angle_threshold);

    /**
     * Colors the edges of the given shape using the default MSDF colors specified by the {@code MSDF_COLOR_} prefixed constants using the distance.
     *
     * @param shape           a pointer to a shape whose edges to color with the default MSDF colors
     * @param angle_threshold the threshold angle in degrees
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_shape_edge_colors_by_distance(@NativeType("msdf_shape_handle") long shape, double angle_threshold) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_shape_edge_colors_by_distance(shape, angle_threshold);
    }

    // --- [ msdf_shape_one_shot_distance ] ---

    /** Unsafe version of: {@link #msdf_shape_one_shot_distance shape_one_shot_distance} */
    public static native int nmsdf_shape_one_shot_distance(long shape, long origin, long distance);

    /**
     * Finds the distance between shape and origin.
     *
     * @param shape    a pointer to the shape to find the distance to
     * @param origin   the point to find the distance relative to the given shape to
     * @param distance a pointer to a variable to be populated with the calculated distance to the given shape
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_shape_one_shot_distance(@NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_vector2 const *") MSDFGenVector2 origin, @NativeType("double *") DoubleBuffer distance) {
        if (CHECKS) {
            check(shape);
            check(distance, 1);
        }
        return nmsdf_shape_one_shot_distance(shape, origin.address(), memAddress(distance));
    }

    // --- [ msdf_shape_free ] ---

    /** Unsafe version of: {@link #msdf_shape_free shape_free} */
    public static native void nmsdf_shape_free(long shape);

    /**
     * Calls the destructor of the given bitmap and frees its memory using the internal allocator.
     *
     * @param shape a pointer to a shape object to be freed
     */
    public static void msdf_shape_free(@NativeType("msdf_shape_handle") long shape) {
        if (CHECKS) {
            check(shape);
        }
        nmsdf_shape_free(shape);
    }

    // --- [ msdf_contour_alloc ] ---

    /** Unsafe version of: {@link #msdf_contour_alloc contour_alloc} */
    public static native int nmsdf_contour_alloc(long contour);

    /**
     * Allocates a new contour object using the internal allocator.
     *
     * @param contour a pointer to an address which is populated with the address of the newly allocated contour object
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_contour_alloc(@NativeType("msdf_contour_handle *") PointerBuffer contour) {
        if (CHECKS) {
            check(contour, 1);
        }
        return nmsdf_contour_alloc(memAddress(contour));
    }

    // --- [ msdf_contour_add_edge ] ---

    /** Unsafe version of: {@link #msdf_contour_add_edge contour_add_edge} */
    public static native int nmsdf_contour_add_edge(long contour, long segment);

    /**
     * Adds a new edge to the given contour and returns its associated segment handle.
     *
     * @param contour a pointer to the contour to add a new edge (segment) to
     * @param segment a pointer to the segment to add as an edge
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_contour_add_edge(@NativeType("msdf_contour_handle") long contour, @NativeType("msdf_segment_handle") long segment) {
        if (CHECKS) {
            check(contour);
            check(segment);
        }
        return nmsdf_contour_add_edge(contour, segment);
    }

    // --- [ msdf_contour_remove_edge ] ---

    /** Unsafe version of: {@link #msdf_contour_remove_edge contour_remove_edge} */
    public static native int nmsdf_contour_remove_edge(long contour, long segment);

    /**
     * Removes the given edge from the given contour if present.
     *
     * @param contour a pointer to the contour to remove the given edge (segment) from
     * @param segment a pointer to the segment to remove from the given contour
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_contour_remove_edge(@NativeType("msdf_contour_handle") long contour, @NativeType("msdf_segment_handle") long segment) {
        if (CHECKS) {
            check(contour);
            check(segment);
        }
        return nmsdf_contour_remove_edge(contour, segment);
    }

    // --- [ msdf_contour_get_edge_count ] ---

    /** Unsafe version of: {@link #msdf_contour_get_edge_count contour_get_edge_count} */
    public static native int nmsdf_contour_get_edge_count(long contour, long count);

    /**
     * Retrieves the edge count of the given contour.
     *
     * @param contour a pointer to the contour to retrieve the edge count from
     * @param count   a pointer to a variable which is populated with the edge count of the given contour
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_contour_get_edge_count(@NativeType("msdf_contour_const_handle") long contour, @NativeType("size_t *") PointerBuffer count) {
        if (CHECKS) {
            check(contour);
            check(count, 1);
        }
        return nmsdf_contour_get_edge_count(contour, memAddress(count));
    }

    // --- [ msdf_contour_get_edge ] ---

    /** Unsafe version of: {@link #msdf_contour_get_edge contour_get_edge} */
    public static native int nmsdf_contour_get_edge(long contour, long index, long segment);

    /**
     * Retrieves an edge (segment) from the given contour at the given index.
     *
     * @param contour a pointer to the contour from which to retrieve the given edge segment
     * @param index   the index from which to retrieve the edge segment
     * @param segment a pointer to an address which is populated with the address of the edge segment at the given index if present
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_contour_get_edge(@NativeType("msdf_contour_const_handle") long contour, @NativeType("size_t") long index, @NativeType("msdf_segment_const_handle *") PointerBuffer segment) {
        if (CHECKS) {
            check(contour);
            check(segment, 1);
        }
        return nmsdf_contour_get_edge(contour, index, memAddress(segment));
    }

    // --- [ msdf_contour_bound ] ---

    /** Unsafe version of: {@link #msdf_contour_bound contour_bound} */
    public static native int nmsdf_contour_bound(long contour, long bounds);

    /**
     * Adjusts the given bounding box to fit at least the given contour.
     *
     * @param contour a pointer to the contour which should at least fit into the given bounding box
     * @param bounds  a pointer to the bounding box to fit the given contour into
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_contour_bound(@NativeType("msdf_contour_const_handle") long contour, @NativeType("struct msdf_bounds *") MSDFGenBounds bounds) {
        if (CHECKS) {
            check(contour);
        }
        return nmsdf_contour_bound(contour, bounds.address());
    }

    // --- [ msdf_contour_bound_miters ] ---

    /** Unsafe version of: {@link #msdf_contour_bound_miters contour_bound_miters} */
    public static native int nmsdf_contour_bound_miters(long contour, long bounds, double border, double miter_limit, int polarity);

    /**
     * Adjust the given bounding box to fit at least the given contour including a specified border.
     *
     * @param contour     a pointer to the contour which should at least fit into the given bounding box
     * @param bounds      a pointer to the bounding box to fit the given contour including the specified border
     * @param border      the size of the border
     * @param miter_limit the miter limit value
     * @param polarity    the miter polarity
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_contour_bound_miters(@NativeType("msdf_contour_const_handle") long contour, @NativeType("struct msdf_bounds *") MSDFGenBounds bounds, double border, double miter_limit, int polarity) {
        if (CHECKS) {
            check(contour);
        }
        return nmsdf_contour_bound_miters(contour, bounds.address(), border, miter_limit, polarity);
    }

    // --- [ msdf_contour_get_winding ] ---

    /** Unsafe version of: {@link #msdf_contour_get_winding contour_get_winding} */
    public static native int nmsdf_contour_get_winding(long contour, long winding);

    /**
     * Retrieves the winding direction of the given contour.
     *
     * @param contour a pointer to the contour of which to retrieve the winding direction
     * @param winding a pointer to a variables which is populated with the winding direction of the given contour
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_contour_get_winding(@NativeType("msdf_contour_const_handle") long contour, @NativeType("int *") IntBuffer winding) {
        if (CHECKS) {
            check(contour);
            check(winding, 1);
        }
        return nmsdf_contour_get_winding(contour, memAddress(winding));
    }

    // --- [ msdf_contour_reverse ] ---

    /** Unsafe version of: {@link #msdf_contour_reverse contour_reverse} */
    public static native int nmsdf_contour_reverse(long contour);

    /**
     * Reverses the order of edges in the given contour.
     *
     * @param contour a pointer to the contour which to reverse the edge order for
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_contour_reverse(@NativeType("msdf_contour_handle") long contour) {
        if (CHECKS) {
            check(contour);
        }
        return nmsdf_contour_reverse(contour);
    }

    // --- [ msdf_contour_free ] ---

    /** Unsafe version of: {@link #msdf_contour_free contour_free} */
    public static native void nmsdf_contour_free(long contour);

    /**
     * Calls the destructor of the given bitmap and frees its memory using the internal allocator.
     *
     * @param contour a pointer to the contour to free
     */
    public static void msdf_contour_free(@NativeType("msdf_contour_handle") long contour) {
        if (CHECKS) {
            check(contour);
        }
        nmsdf_contour_free(contour);
    }

    // --- [ msdf_segment_alloc ] ---

    /** Unsafe version of: {@link #msdf_segment_alloc segment_alloc} */
    public static native int nmsdf_segment_alloc(int type, long segment);

    /**
     * Allocates a new segment of the given type and populates the given address with the address of the newly allocated segment.
     *
     * @param type    the type of segment to allocate. One of:<br><table><tr><td>{@link #MSDF_SEGMENT_TYPE_LINEAR SEGMENT_TYPE_LINEAR}</td><td>{@link #MSDF_SEGMENT_TYPE_QUADRATIC SEGMENT_TYPE_QUADRATIC}</td><td>{@link #MSDF_SEGMENT_TYPE_CUBIC SEGMENT_TYPE_CUBIC}</td></tr></table>
     * @param segment a pointer to an address which is populated with the address of the newly allocated segment
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_segment_alloc(int type, @NativeType("msdf_segment_handle *") PointerBuffer segment) {
        if (CHECKS) {
            check(segment, 1);
        }
        return nmsdf_segment_alloc(type, memAddress(segment));
    }

    // --- [ msdf_segment_get_type ] ---

    /** Unsafe version of: {@link #msdf_segment_get_type segment_get_type} */
    public static native int nmsdf_segment_get_type(long segment, long type);

    /**
     * Retrieves the type of the given segment.
     *
     * @param segment a pointer to the segment of which to retrieve the type
     * @param type    a pointer to a variable which is populated with the type of the given segment
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_segment_get_type(@NativeType("msdf_segment_const_handle") long segment, @NativeType("int *") IntBuffer type) {
        if (CHECKS) {
            check(segment);
            check(type, 1);
        }
        return nmsdf_segment_get_type(segment, memAddress(type));
    }

    // --- [ msdf_segment_get_point_count ] ---

    /** Unsafe version of: {@link #msdf_segment_get_point_count segment_get_point_count} */
    public static native int nmsdf_segment_get_point_count(long segment, long count);

    /**
     * Retrieves the point count of the given segment.
     *
     * @param segment a pointer to the segment of which to retrieve the number of points
     * @param count   a pointer to a variable which is populated with the number of points of the given segment
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_segment_get_point_count(@NativeType("msdf_segment_const_handle") long segment, @NativeType("size_t *") PointerBuffer count) {
        if (CHECKS) {
            check(segment);
            check(count, 1);
        }
        return nmsdf_segment_get_point_count(segment, memAddress(count));
    }

    // --- [ msdf_segment_get_point ] ---

    /** Unsafe version of: {@link #msdf_segment_get_point segment_get_point} */
    public static native int nmsdf_segment_get_point(long segment, long index, long point);

    /**
     * Retrieves a point at the given index from the given segment.
     *
     * @param segment a pointer to the segment from which to retrieve a point
     * @param index   the index of the point to retrieve
     * @param point   a pointer to a point which is populated with the coordinates of the point at the given index if present
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_segment_get_point(@NativeType("msdf_segment_const_handle") long segment, @NativeType("size_t") long index, @NativeType("struct msdf_vector2 *") MSDFGenVector2 point) {
        if (CHECKS) {
            check(segment);
        }
        return nmsdf_segment_get_point(segment, index, point.address());
    }

    // --- [ msdf_segment_set_point ] ---

    /** Unsafe version of: {@link #msdf_segment_set_point segment_set_point} */
    public static native int nmsdf_segment_set_point(long segment, long index, long point);

    /**
     * Sets the coordinates of a point at the given index in the given segment.
     *
     * @param segment a pointer to the segment of which to set the point
     * @param index   the index of the point to set
     * @param point   a pointer to a point which is copied to the given index within the segment
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_segment_set_point(@NativeType("msdf_segment_handle") long segment, @NativeType("size_t") long index, @NativeType("struct msdf_vector2 const *") MSDFGenVector2 point) {
        if (CHECKS) {
            check(segment);
        }
        return nmsdf_segment_set_point(segment, index, point.address());
    }

    // --- [ msdf_segment_get_color ] ---

    /** Unsafe version of: {@link #msdf_segment_get_color segment_get_color} */
    public static native int nmsdf_segment_get_color(long segment, long color);

    /**
     * Retrieves the color of the given segment.
     *
     * @param segment a pointer to the segment of which to retrieve the color
     * @param color   a pointer to a variable which is populated with the color of the given segment. Will be one of the constants prefixed with {@code MSDF_COLOR_}.
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_segment_get_color(@NativeType("msdf_segment_const_handle") long segment, @NativeType("int *") IntBuffer color) {
        if (CHECKS) {
            check(segment);
            check(color, 1);
        }
        return nmsdf_segment_get_color(segment, memAddress(color));
    }

    // --- [ msdf_segment_set_color ] ---

    /** Unsafe version of: {@link #msdf_segment_set_color segment_set_color} */
    public static native int nmsdf_segment_set_color(long segment, int color);

    /**
     * Sets the color of the given segment.
     *
     * @param segment a pointer to the segment of which to set the color
     * @param color   the color to set. One of:<br><table><tr><td>{@link #MSDF_EDGE_COLOR_BLACK EDGE_COLOR_BLACK}</td><td>{@link #MSDF_EDGE_COLOR_RED EDGE_COLOR_RED}</td><td>{@link #MSDF_EDGE_COLOR_GREEN EDGE_COLOR_GREEN}</td><td>{@link #MSDF_EDGE_COLOR_YELLOW EDGE_COLOR_YELLOW}</td><td>{@link #MSDF_EDGE_COLOR_BLUE EDGE_COLOR_BLUE}</td></tr><tr><td>{@link #MSDF_EDGE_COLOR_MAGENTA EDGE_COLOR_MAGENTA}</td><td>{@link #MSDF_EDGE_COLOR_CYAN EDGE_COLOR_CYAN}</td><td>{@link #MSDF_EDGE_COLOR_WHITE EDGE_COLOR_WHITE}</td></tr></table>
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_segment_set_color(@NativeType("msdf_segment_handle") long segment, int color) {
        if (CHECKS) {
            check(segment);
        }
        return nmsdf_segment_set_color(segment, color);
    }

    // --- [ msdf_segment_get_direction ] ---

    /** Unsafe version of: {@link #msdf_segment_get_direction segment_get_direction} */
    public static native int nmsdf_segment_get_direction(long segment, double param, long direction);

    /**
     * Retrieves the direction of the given segment at the given point.
     *
     * @param segment   a pointer to the segment of which to retrieve the direction
     * @param param     the point at which to retrieve the segment direction
     * @param direction a pointer to a variable which is populated with the direction of the given segment at the given point
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_segment_get_direction(@NativeType("msdf_segment_const_handle") long segment, double param, @NativeType("struct msdf_vector2 *") MSDFGenVector2 direction) {
        if (CHECKS) {
            check(segment);
        }
        return nmsdf_segment_get_direction(segment, param, direction.address());
    }

    // --- [ msdf_segment_get_direction_change ] ---

    /** Unsafe version of: {@link #msdf_segment_get_direction_change segment_get_direction_change} */
    public static native int nmsdf_segment_get_direction_change(long segment, double param, long direction_change);

    /**
     * Retrieves the direction change of the given segment at the given point.
     *
     * @param segment          a pointer to the segment of which to retrieve the direction change
     * @param param            the point at which to retrieve the segment direction change
     * @param direction_change a pointer to a variable which is populated with the direction change of the given segment at the given point
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_segment_get_direction_change(@NativeType("msdf_segment_const_handle") long segment, double param, @NativeType("struct msdf_vector2 *") MSDFGenVector2 direction_change) {
        if (CHECKS) {
            check(segment);
        }
        return nmsdf_segment_get_direction_change(segment, param, direction_change.address());
    }

    // --- [ msdf_segment_point ] ---

    /** Unsafe version of: {@link #msdf_segment_point segment_point} */
    public static native int nmsdf_segment_point(long segment, double param, long point);

    /**
     * Retrieves the point on the given edge segment specified by the given parameter.
     *
     * @param segment a pointer to the segment of which to retrieve the edge point
     * @param param   the point at which to sample
     * @param point   a pointer to a variable which is populated with the edge point at the given location from the given segment
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_segment_point(@NativeType("msdf_segment_const_handle") long segment, double param, @NativeType("struct msdf_vector2 *") MSDFGenVector2 point) {
        if (CHECKS) {
            check(segment);
        }
        return nmsdf_segment_point(segment, param, point.address());
    }

    // --- [ msdf_segment_bound ] ---

    /** Unsafe version of: {@link #msdf_segment_bound segment_bound} */
    public static native int nmsdf_segment_bound(long segment, long bounds);

    /**
     * Adjusts the given bounding box to fit at least the given segment.
     *
     * @param segment a pointer to the segment which should at least fit in the given bounding box
     * @param bounds  a pointer to the bounding box which should at least fit the given segment
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_segment_bound(@NativeType("msdf_segment_const_handle") long segment, @NativeType("struct msdf_bounds *") MSDFGenBounds bounds) {
        if (CHECKS) {
            check(segment);
        }
        return nmsdf_segment_bound(segment, bounds.address());
    }

    // --- [ msdf_segment_move_start_point ] ---

    /** Unsafe version of: {@link #msdf_segment_move_start_point segment_move_start_point} */
    public static native int nmsdf_segment_move_start_point(long segment, long point);

    /**
     * Moves the start point of the given segment.
     *
     * @param segment a pointer to the segment of which to adjust the start point
     * @param point   a pointer to the new start point of the given segment
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_segment_move_start_point(@NativeType("msdf_segment_handle") long segment, @NativeType("struct msdf_vector2 const *") MSDFGenVector2 point) {
        if (CHECKS) {
            check(segment);
        }
        return nmsdf_segment_move_start_point(segment, point.address());
    }

    // --- [ msdf_segment_move_end_point ] ---

    /** Unsafe version of: {@link #msdf_segment_move_end_point segment_move_end_point} */
    public static native int nmsdf_segment_move_end_point(long segment, long point);

    /**
     * Moves the end point of the given segment.
     *
     * @param segment a pointer to the segment of which to adjust the end point
     * @param point   a pointer to the new end point of the given segment
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_segment_move_end_point(@NativeType("msdf_segment_handle") long segment, @NativeType("struct msdf_vector2 const *") MSDFGenVector2 point) {
        if (CHECKS) {
            check(segment);
        }
        return nmsdf_segment_move_end_point(segment, point.address());
    }

    // --- [ msdf_segment_free ] ---

    /** Unsafe version of: {@link #msdf_segment_free segment_free} */
    public static native void nmsdf_segment_free(long segment);

    /**
     * Calls the destructor of the given segment and frees its memory using the internal allocator.
     *
     * @param segment a pointer to the segment to free
     */
    public static void msdf_segment_free(@NativeType("msdf_segment_handle") long segment) {
        if (CHECKS) {
            check(segment);
        }
        nmsdf_segment_free(segment);
    }

    // --- [ msdf_generate_sdf ] ---

    /** Unsafe version of: {@link #msdf_generate_sdf generate_sdf} */
    public static native int nmsdf_generate_sdf(long output, long shape, long transform);

    /**
     * @param output    a pointer to a bitmap that was allocated with {@link #msdf_bitmap_alloc bitmap_alloc} to which the given shape is rendered. The bitmap must be of type {@link #MSDF_BITMAP_TYPE_SDF BITMAP_TYPE_SDF}.
     * @param shape     a pointer to the shape to render to the given bitmap
     * @param transform the transform which is applied to the given shape during rendering
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_generate_sdf(@NativeType("struct msdf_bitmap *") MSDFGenBitmap output, @NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_transform const *") MSDFGenTransform transform) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_generate_sdf(output.address(), shape, transform.address());
    }

    // --- [ msdf_generate_psdf ] ---

    /** Unsafe version of: {@link #msdf_generate_psdf generate_psdf} */
    public static native int nmsdf_generate_psdf(long output, long shape, long transform);

    /**
     * @param output    a pointer to a bitmap that was allocated with {@link #msdf_bitmap_alloc bitmap_alloc} to which the given shape is rendered. The bitmap must be of type {@link #MSDF_BITMAP_TYPE_PSDF BITMAP_TYPE_PSDF}.
     * @param shape     a pointer to the shape to render to the given bitmap
     * @param transform the transform which is applied to the given shape during rendering
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_generate_psdf(@NativeType("struct msdf_bitmap *") MSDFGenBitmap output, @NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_transform const *") MSDFGenTransform transform) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_generate_psdf(output.address(), shape, transform.address());
    }

    // --- [ msdf_generate_msdf ] ---

    /** Unsafe version of: {@link #msdf_generate_msdf generate_msdf} */
    public static native int nmsdf_generate_msdf(long output, long shape, long transform);

    /**
     * @param output    a pointer to a bitmap that was allocated with {@link #msdf_bitmap_alloc bitmap_alloc} to which the given shape is rendered. The bitmap must be of type {@link #MSDF_BITMAP_TYPE_MSDF BITMAP_TYPE_MSDF}.
     * @param shape     a pointer to the shape to render to the given bitmap
     * @param transform the transform which is applied to the given shape during rendering
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_generate_msdf(@NativeType("struct msdf_bitmap *") MSDFGenBitmap output, @NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_transform const *") MSDFGenTransform transform) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_generate_msdf(output.address(), shape, transform.address());
    }

    // --- [ msdf_generate_mtsdf ] ---

    /** Unsafe version of: {@link #msdf_generate_mtsdf generate_mtsdf} */
    public static native int nmsdf_generate_mtsdf(long output, long shape, long transform);

    /**
     * @param output    a pointer to a bitmap that was allocated with {@link #msdf_bitmap_alloc bitmap_alloc} to which the given shape is rendered. The bitmap must be of type {@link #MSDF_BITMAP_TYPE_MTSDF BITMAP_TYPE_MTSDF}.
     * @param shape     a pointer to the shape to render to the given bitmap
     * @param transform the transform which is applied to the given shape during rendering
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_generate_mtsdf(@NativeType("struct msdf_bitmap *") MSDFGenBitmap output, @NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_transform const *") MSDFGenTransform transform) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_generate_mtsdf(output.address(), shape, transform.address());
    }

    // --- [ msdf_generate_sdf_with_config ] ---

    /** Unsafe version of: {@link #msdf_generate_sdf_with_config generate_sdf_with_config} */
    public static native int nmsdf_generate_sdf_with_config(long output, long shape, long transform, long config);

    /**
     * @param output    a pointer to a bitmap that was allocated with {@link #msdf_bitmap_alloc bitmap_alloc} to which the given shape is rendered. The bitmap must be of type {@link #MSDF_BITMAP_TYPE_SDF BITMAP_TYPE_SDF}.
     * @param shape     a pointer to the shape to render to the given bitmap
     * @param transform the transform which is applied to the given shape during rendering
     * @param config    a pointer to the config which is applied to the sprite generator before rendering
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_generate_sdf_with_config(@NativeType("struct msdf_bitmap *") MSDFGenBitmap output, @NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_transform const *") MSDFGenTransform transform, @NativeType("struct msdf_config const *") MSDFGenConfig config) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_generate_sdf_with_config(output.address(), shape, transform.address(), config.address());
    }

    // --- [ msdf_generate_psdf_with_config ] ---

    /** Unsafe version of: {@link #msdf_generate_psdf_with_config generate_psdf_with_config} */
    public static native int nmsdf_generate_psdf_with_config(long output, long shape, long transform, long config);

    /**
     * @param output    a pointer to a bitmap that was allocated with {@link #msdf_bitmap_alloc bitmap_alloc} to which the given shape is rendered. The bitmap must be of type {@link #MSDF_BITMAP_TYPE_PSDF BITMAP_TYPE_PSDF}.
     * @param shape     a pointer to the shape to render to the given bitmap
     * @param transform the transform which is applied to the given shape during rendering
     * @param config    a pointer to the config which is applied to the sprite generator before rendering
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_generate_psdf_with_config(@NativeType("struct msdf_bitmap *") MSDFGenBitmap output, @NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_transform const *") MSDFGenTransform transform, @NativeType("struct msdf_config const *") MSDFGenConfig config) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_generate_psdf_with_config(output.address(), shape, transform.address(), config.address());
    }

    // --- [ msdf_generate_msdf_with_config ] ---

    /** Unsafe version of: {@link #msdf_generate_msdf_with_config generate_msdf_with_config} */
    public static native int nmsdf_generate_msdf_with_config(long output, long shape, long transform, long config);

    /**
     * @param output    a pointer to a bitmap that was allocated with {@link #msdf_bitmap_alloc bitmap_alloc} to which the given shape is rendered. The bitmap must be of type {@link #MSDF_BITMAP_TYPE_MSDF BITMAP_TYPE_MSDF}.
     * @param shape     a pointer to the shape to render to the given bitmap
     * @param transform the transform which is applied to the given shape during rendering
     * @param config    a pointer to the config which is applied to the sprite generator before rendering
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_generate_msdf_with_config(@NativeType("struct msdf_bitmap *") MSDFGenBitmap output, @NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_transform const *") MSDFGenTransform transform, @NativeType("struct msdf_multichannel_config const *") MSDFGenMultichannelConfig config) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_generate_msdf_with_config(output.address(), shape, transform.address(), config.address());
    }

    // --- [ msdf_generate_mtsdf_with_config ] ---

    /** Unsafe version of: {@link #msdf_generate_mtsdf_with_config generate_mtsdf_with_config} */
    public static native int nmsdf_generate_mtsdf_with_config(long output, long shape, long transform, long config);

    /**
     * @param output    a pointer to a bitmap that was allocated with {@link #msdf_bitmap_alloc bitmap_alloc} to which the given shape is rendered. The bitmap must be of type {@link #MSDF_BITMAP_TYPE_MTSDF BITMAP_TYPE_MTSDF}.
     * @param shape     A pointer to the shape to render to the given bitmap.
     * @param transform the transform which is applied to the given shape during rendering
     * @param config    a pointer to the config which is applied to the sprite generator before rendering
     *
     * @return {@link #MSDF_SUCCESS SUCCESS} on success, otherwise one of the constants prefixed with {@code MSDF_ERR_}.
     */
    public static int msdf_generate_mtsdf_with_config(@NativeType("struct msdf_bitmap *") MSDFGenBitmap output, @NativeType("msdf_shape_const_handle") long shape, @NativeType("struct msdf_transform const *") MSDFGenTransform transform, @NativeType("struct msdf_multichannel_config const *") MSDFGenMultichannelConfig config) {
        if (CHECKS) {
            check(shape);
        }
        return nmsdf_generate_mtsdf_with_config(output.address(), shape, transform.address(), config.address());
    }

}
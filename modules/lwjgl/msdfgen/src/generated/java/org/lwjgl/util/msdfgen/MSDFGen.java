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

import static org.lwjgl.system.Checks.*;

public class MSDFGen {

    static { LibMsdfGen.initialize(); }

    protected MSDFGen() {
        throw new UnsupportedOperationException();
    }

    // --- [ msdf_allocator_set ] ---

    /** Unsafe version of: {@link #msdf_allocator_set allocator_set} */
    public static native void nmsdf_allocator_set(long allocator);

    /**
     * Sets the allocation callbacks to use for allocating API objects.
     *
     * @param allocator The address of an msdf_allocator_t structure to copy the callback pointers from.
     */
    public static void msdf_allocator_set(@NativeType("struct msdf_allocator const *") MSDFGenAllocator.Buffer allocator) {
        if (CHECKS) {
            MSDFGenAllocator.validate(allocator.address());
        }
        nmsdf_allocator_set(allocator.address());
    }

    // --- [ msdf_bitmap_alloc ] ---

    /** Unsafe version of: {@link #msdf_bitmap_alloc bitmap_alloc} */
    public static native int nmsdf_bitmap_alloc(int type, int width, int height, long bitmap);

    /**
     * Allocates a new MSDF bitmap object to render a shape into using the internal allocator.
     *
     * @param type   The type of bitmap to allocate. Can be one of MSDF_BITMAP_TYPE_SDF, MSDF_BITMAP_TYPE_PSDF, MSDF_BITMAP_TYPE_MSDF or MSDF_BITMAP_TYPE_MTSDF.
     * @param width  The width of the bitmap in pixels.
     * @param height The height of the bitmap in pixels.
     * @param bitmap A pointer to an msdf_bitmap_t structure to allocate a new bitmap into.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_bitmap_alloc(int type, int width, int height, @NativeType("struct msdf_bitmap *") MSDFGenBitmap.Buffer bitmap) {
        return nmsdf_bitmap_alloc(type, width, height, bitmap.address());
    }

    // --- [ msdf_bitmap_get_channel_count ] ---

    /** Unsafe version of: {@link #msdf_bitmap_get_channel_count bitmap_get_channel_count} */
    public static native int nmsdf_bitmap_get_channel_count(long bitmap, long channel_count);

    /**
     * Retrieves the number of color channels used by the given bitmap.
     *
     * @param bitmap        A pointer to an msdf_bitmap_t structure to retrieve the channel count from.
     * @param channel_count A pointer to a variable which is populated with the number of color channels used by the given bitmap.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_bitmap_get_channel_count(@NativeType("struct msdf_bitmap const *") MSDFGenBitmap.Buffer bitmap, @NativeType("int *") IntBuffer channel_count) {
        if (CHECKS) {
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
     * @param bitmap A pointer to an msdf_bitmap_t structure to retrieve the raw pixel data from.
     * @param pixels A pointer to an address which is populated with the raw pixel data of the given bitmap.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_bitmap_get_pixels(@NativeType("struct msdf_bitmap const *") MSDFGenBitmap.Buffer bitmap, @NativeType("void **") PointerBuffer pixels) {
        if (CHECKS) {
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
     * @param bitmap A pointer to an msdf_bitmap_t structure to retrieve the size of the raw pixel data from.
     * @param size   A pointer to a variable which is populated with the byte size of the raw pixel data of the given bitmap.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_bitmap_get_byte_size(@NativeType("struct msdf_bitmap const *") MSDFGenBitmap.Buffer bitmap, @NativeType("size_t *") PointerBuffer size) {
        if (CHECKS) {
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
     * @param bitmap A pointer to an msdf_bitmap_t structure to be freed.
     */
    public static void msdf_bitmap_free(@NativeType("struct msdf_bitmap *") MSDFGenBitmap.Buffer bitmap) {
        nmsdf_bitmap_free(bitmap.address());
    }

    // --- [ msdf_shape_alloc ] ---

    /** Unsafe version of: {@link #msdf_shape_alloc shape_alloc} */
    public static native int nmsdf_shape_alloc(long shape);

    /**
     * Allocates a new MSDF shape object using the internal allocator.
     *
     * @param shape A pointer to an address which is populated with the address of the newly allocated shape.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_shape_alloc(@NativeType("msdf_shape_handle *") PointerBuffer shape) {
        return nmsdf_shape_alloc(memAddress(shape));
    }

    // --- [ msdf_shape_get_bounds ] ---

    /** Unsafe version of: {@link #msdf_shape_get_bounds shape_get_bounds} */
    public static native int nmsdf_shape_get_bounds(long shape, long bounds);

    /**
     * Retrieves the bounds of the given shape.
     *
     * @param shape  A pointer to a shape object to retrieve the bounds from.
     * @param bounds A pointer to a variable which is populated with the bounds of the given shape.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_shape_get_bounds(@NativeType("msdf_shape_const_handle") ByteBuffer shape, @NativeType("struct msdf_bounds *") MSDFGenBounds.Buffer bounds) {
        return nmsdf_shape_get_bounds(memAddress(shape), bounds.address());
    }

    // --- [ msdf_shape_add_contour ] ---

    /** Unsafe version of: {@link #msdf_shape_add_contour shape_add_contour} */
    public static native int nmsdf_shape_add_contour(long shape, long contour);

    /**
     * Adds a new contour to the given shape.
     *
     * @param shape   A pointer to a shape object to add a new contour to.
     * @param contour A pointer to an address which is populated with the address of the newly created contour.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_shape_add_contour(@NativeType("msdf_shape_handle") ByteBuffer shape, @NativeType("msdf_contour_handle *") PointerBuffer contour) {
        return nmsdf_shape_add_contour(memAddress(shape), memAddress(contour));
    }

    // --- [ msdf_shape_get_contour_count ] ---

    /** Unsafe version of: {@link #msdf_shape_get_contour_count shape_get_contour_count} */
    public static native int nmsdf_shape_get_contour_count(long shape, long size);

    /**
     * Retrieves the number of contours allocated within the given shape object.
     *
     * @param shape A pointer to a shape object from which to retrieve the contour count.
     * @param size  A pointer to a variable which is populated with the number of contours of the given shape.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_shape_get_contour_count(@NativeType("msdf_shape_const_handle") ByteBuffer shape, @NativeType("size_t *") PointerBuffer size) {
        return nmsdf_shape_get_contour_count(memAddress(shape), memAddress(size));
    }

    // --- [ msdf_shape_get_contour ] ---

    /** Unsafe version of: {@link #msdf_shape_get_contour shape_get_contour} */
    public static native int nmsdf_shape_get_contour(long shape, long index, long contour);

    /**
     * Retrieves a contour at a given index from the given shape.
     *
     * @param shape   A pointer to a shape object from which to retrieve a contour.
     * @param index   The index of the contour to retrieve.
     * @param contour A pointer to an address which is populated with the address of the contour at the given index if present.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_shape_get_contour(@NativeType("msdf_shape_const_handle") ByteBuffer shape, @NativeType("size_t") long index, @NativeType("msdf_contour_const_handle *") PointerBuffer contour) {
        return nmsdf_shape_get_contour(memAddress(shape), index, memAddress(contour));
    }

    // --- [ msdf_shape_get_edge_count ] ---

    /** Unsafe version of: {@link #msdf_shape_get_edge_count shape_get_edge_count} */
    public static native int nmsdf_shape_get_edge_count(long shape, long count);

    /**
     * Retrieves the number of edges of the given shape.
     *
     * @param shape A pointer to a shape from which to retrieve the edge count.
     * @param count A pointer to a variable which is populated with the number of edges defined by the given shape.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_shape_get_edge_count(@NativeType("msdf_shape_const_handle") ByteBuffer shape, @NativeType("size_t *") PointerBuffer count) {
        return nmsdf_shape_get_edge_count(memAddress(shape), memAddress(count));
    }

    // --- [ msdf_shape_has_inverse_y_axis ] ---

    /** Unsafe version of: {@link #msdf_shape_has_inverse_y_axis shape_has_inverse_y_axis} */
    public static native int nmsdf_shape_has_inverse_y_axis(long shape, long inverse_y_axis);

    /**
     * Retrieves the inverse-y-axis flag of the given shape.
     *
     * @param shape          A pointer to a shape from which to fetch the inverse-y-axis flag.
     * @param inverse_y_axis A pointer to a variable which is populated with MSDF_TRUE when the y-axis of the given shape is inverted. Otherwise the variable will be set to MSDF_FALSE.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_shape_has_inverse_y_axis(@NativeType("msdf_shape_const_handle") ByteBuffer shape, @NativeType("int *") IntBuffer inverse_y_axis) {
        return nmsdf_shape_has_inverse_y_axis(memAddress(shape), memAddress(inverse_y_axis));
    }

    // --- [ msdf_shape_normalize ] ---

    /** Unsafe version of: {@link #msdf_shape_normalize shape_normalize} */
    public static native int nmsdf_shape_normalize(long shape);

    /**
     * Normalizes the given shape.
     *
     * @param shape A pointer to a shape to normalize.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_shape_normalize(@NativeType("msdf_shape_handle") ByteBuffer shape) {
        return nmsdf_shape_normalize(memAddress(shape));
    }

    // --- [ msdf_shape_validate ] ---

    /** Unsafe version of: {@link #msdf_shape_validate shape_validate} */
    public static native int nmsdf_shape_validate(long shape, long result);

    /**
     * Validates the given shape.
     *
     * @param shape  A pointer to a shape to validate.
     * @param result A pointer to a variable which is populated with MSDF_TRUE when the validation was successful. Otherwise the variable will be set to MSDF_FALSE.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_shape_validate(@NativeType("msdf_shape_handle") ByteBuffer shape, @NativeType("int *") IntBuffer result) {
        return nmsdf_shape_validate(memAddress(shape), memAddress(result));
    }

    // --- [ msdf_shape_bound ] ---

    /** Unsafe version of: {@link #msdf_shape_bound shape_bound} */
    public static native int nmsdf_shape_bound(long shape, long bounds);

    /**
     * Adjusts the given bounding box to fit the given shape.
     *
     * @param shape  A pointer to a shape to fit into the given bounding box.
     * @param bounds A pointer to a bounding box which should at least fit the given shape.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_shape_bound(@NativeType("msdf_shape_const_handle") ByteBuffer shape, @NativeType("struct msdf_bounds *") MSDFGenBounds.Buffer bounds) {
        return nmsdf_shape_bound(memAddress(shape), bounds.address());
    }

    // --- [ msdf_shape_bound_miters ] ---

    /** Unsafe version of: {@link #msdf_shape_bound_miters shape_bound_miters} */
    public static native int nmsdf_shape_bound_miters(long shape, long bounds, double border, double miter_limit, int polarity);

    /**
     * Adjusts the given bounding box to fit the given shape including a mitered border.
     *
     * @param shape       A pointer to a shape to fit into the given bounding box.
     * @param bounds      A pointer to a bounding box which should at least fit the given shape including the specified border.
     * @param border      The size of the border.
     * @param miter_limit The miter limit value.
     * @param polarity    The miter polarity.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_shape_bound_miters(@NativeType("msdf_shape_const_handle") ByteBuffer shape, @NativeType("struct msdf_bounds *") MSDFGenBounds.Buffer bounds, double border, double miter_limit, int polarity) {
        return nmsdf_shape_bound_miters(memAddress(shape), bounds.address(), border, miter_limit, polarity);
    }

    // --- [ msdf_shape_free ] ---

    /** Unsafe version of: {@link #msdf_shape_free shape_free} */
    public static native void nmsdf_shape_free(long shape);

    /**
     * Calls the destructor of the given bitmap and frees its memory using the internal allocator.
     *
     * @param shape A pointer to a shape object to be freed.
     */
    public static void msdf_shape_free(@NativeType("msdf_shape_handle") ByteBuffer shape) {
        nmsdf_shape_free(memAddress(shape));
    }

    // --- [ msdf_contour_alloc ] ---

    /** Unsafe version of: {@link #msdf_contour_alloc contour_alloc} */
    public static native int nmsdf_contour_alloc(long contour);

    /**
     * Allocates a new contour object using the internal allocator.
     *
     * @param contour A pointer to an address which is populated with the address of the newly allocated contour object.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_contour_alloc(@NativeType("msdf_contour_handle *") PointerBuffer contour) {
        return nmsdf_contour_alloc(memAddress(contour));
    }

    // --- [ msdf_contour_add_edge ] ---

    /** Unsafe version of: {@link #msdf_contour_add_edge contour_add_edge} */
    public static native int nmsdf_contour_add_edge(long contour, long segment);

    /**
     * Adds a new edge to the given contour and returns its associated segment handle.
     *
     * @param contour A pointer to the contour to add a new edge (segment) to.
     * @param segment A pointer to an address which is populated with the address of the newly added edge segment.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_contour_add_edge(@NativeType("msdf_contour_handle") ByteBuffer contour, @NativeType("msdf_segment_handle *") PointerBuffer segment) {
        return nmsdf_contour_add_edge(memAddress(contour), memAddress(segment));
    }

    // --- [ msdf_contour_get_edge_count ] ---

    /** Unsafe version of: {@link #msdf_contour_get_edge_count contour_get_edge_count} */
    public static native int nmsdf_contour_get_edge_count(long contour, long count);

    /**
     * Retrieves the edge count of the given contour.
     *
     * @param contour A pointer to the contour to retrieve the edge count from.
     * @param count   A pointer to a variable which is populated with the edge count of the given contour.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_contour_get_edge_count(@NativeType("msdf_contour_const_handle") ByteBuffer contour, @NativeType("size_t *") PointerBuffer count) {
        return nmsdf_contour_get_edge_count(memAddress(contour), memAddress(count));
    }

    // --- [ msdf_contour_get_edge ] ---

    /** Unsafe version of: {@link #msdf_contour_get_edge contour_get_edge} */
    public static native int nmsdf_contour_get_edge(long contour, long index, long segment);

    /**
     * Retrieves an edge (segment) from the given contour at the given index.
     *
     * @param contour A pointer to the contour from which to retrieve the given edge segment.
     * @param index   The index from which to retrieve the edge segment.
     * @param segment A pointer to an address which is populated with the address of the edge segment at the given index if present.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_contour_get_edge(@NativeType("msdf_contour_const_handle") ByteBuffer contour, @NativeType("size_t") long index, @NativeType("msdf_segment_const_handle *") PointerBuffer segment) {
        return nmsdf_contour_get_edge(memAddress(contour), index, memAddress(segment));
    }

    // --- [ msdf_contour_bound ] ---

    /** Unsafe version of: {@link #msdf_contour_bound contour_bound} */
    public static native int nmsdf_contour_bound(long contour, long bounds);

    /**
     * Adjusts the given bounding box to fit at least the given contour.
     *
     * @param contour A pointer to the contour which should at least fit into the given bounding box.
     * @param bounds  A pointer to the bounding box to fit the given contour into.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_contour_bound(@NativeType("msdf_contour_const_handle") ByteBuffer contour, @NativeType("struct msdf_bounds *") MSDFGenBounds.Buffer bounds) {
        return nmsdf_contour_bound(memAddress(contour), bounds.address());
    }

    // --- [ msdf_contour_bound_miters ] ---

    /** Unsafe version of: {@link #msdf_contour_bound_miters contour_bound_miters} */
    public static native int nmsdf_contour_bound_miters(long contour, long bounds, double border, double miter_limit, int polarity);

    /**
     * Adjust the given bounding box to fit at least the given contour including a specified border.
     *
     * @param contour     A pointer to the contour which should at least fit into the given bounding box.
     * @param bounds      A pointer to the bounding box to fit the given contour including the specified border.
     * @param border      The size of the border.
     * @param miter_limit The miter limit value.
     * @param polarity    The miter polarity.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_contour_bound_miters(@NativeType("msdf_contour_const_handle") ByteBuffer contour, @NativeType("struct msdf_bounds *") MSDFGenBounds.Buffer bounds, double border, double miter_limit, int polarity) {
        return nmsdf_contour_bound_miters(memAddress(contour), bounds.address(), border, miter_limit, polarity);
    }

    // --- [ msdf_contour_get_winding ] ---

    /** Unsafe version of: {@link #msdf_contour_get_winding contour_get_winding} */
    public static native int nmsdf_contour_get_winding(long contour, long winding);

    /**
     * Retrieves the winding direction of the given contour.
     *
     * @param contour A pointer to the contour of which to retrieve the winding direction.
     * @param winding A pointer to a variables which is populated with the winding direction of the given contour.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_contour_get_winding(@NativeType("msdf_contour_const_handle") ByteBuffer contour, @NativeType("int *") IntBuffer winding) {
        return nmsdf_contour_get_winding(memAddress(contour), memAddress(winding));
    }

    // --- [ msdf_contour_reverse ] ---

    /** Unsafe version of: {@link #msdf_contour_reverse contour_reverse} */
    public static native int nmsdf_contour_reverse(long contour);

    /**
     * Reverses the order of edges in the given contour.
     *
     * @param contour A pointer to the contour which to reverse the edge order for.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_contour_reverse(@NativeType("msdf_contour_handle") ByteBuffer contour) {
        return nmsdf_contour_reverse(memAddress(contour));
    }

    // --- [ msdf_contour_free ] ---

    /** Unsafe version of: {@link #msdf_contour_free contour_free} */
    public static native void nmsdf_contour_free(long contour);

    /**
     * Calls the destructor of the given bitmap and frees its memory using the internal allocator.
     *
     * @param contour A pointer to the contour to free.
     */
    public static void msdf_contour_free(@NativeType("msdf_contour_handle") ByteBuffer contour) {
        nmsdf_contour_free(memAddress(contour));
    }

    // --- [ msdf_segment_alloc ] ---

    /** Unsafe version of: {@link #msdf_segment_alloc segment_alloc} */
    public static native int nmsdf_segment_alloc(int type, long segment);

    /**
     * Allocates a new segment of the given type and populates the given address with the address of the newly allocated segment.
     *
     * @param type    The type of segment to allocate. Can be one of MSDF_SEGMENT_TYPE_LINEAR, MSDF_SEGMENT_TYPE_QUADRATIC or MSDF_SEGMENT_TYPE_CUBIC.
     * @param segment A pointer to an address which is populated with the address of the newly allocated segment.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_segment_alloc(int type, @NativeType("msdf_segment_handle *") PointerBuffer segment) {
        return nmsdf_segment_alloc(type, memAddress(segment));
    }

    // --- [ msdf_segment_get_type ] ---

    /** Unsafe version of: {@link #msdf_segment_get_type segment_get_type} */
    public static native int nmsdf_segment_get_type(long segment, long type);

    /**
     * Retrieves the type of the given segment.
     *
     * @param segment A pointer to the segment of which to retrieve the type.
     * @param type    A pointer to a variable which is populated with the type of the given segment.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_segment_get_type(@NativeType("msdf_segment_const_handle") ByteBuffer segment, @NativeType("int *") IntBuffer type) {
        return nmsdf_segment_get_type(memAddress(segment), memAddress(type));
    }

    // --- [ msdf_segment_get_point_count ] ---

    /** Unsafe version of: {@link #msdf_segment_get_point_count segment_get_point_count} */
    public static native int nmsdf_segment_get_point_count(long segment, long count);

    /**
     * Retrieves the point count of the given segment.
     *
     * @param segment A pointer to the segment of which to retrieve the number of points.
     * @param count   A pointer to a variable which is populated with the number of points of the given segment.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_segment_get_point_count(@NativeType("msdf_segment_const_handle") ByteBuffer segment, @NativeType("size_t *") PointerBuffer count) {
        return nmsdf_segment_get_point_count(memAddress(segment), memAddress(count));
    }

    // --- [ msdf_segment_get_point ] ---

    /** Unsafe version of: {@link #msdf_segment_get_point segment_get_point} */
    public static native int nmsdf_segment_get_point(long segment, long index, long point);

    /**
     * Retrieves a point at the given index from the given segment.
     *
     * @param segment A pointer to the segment from which to retrieve a point.
     * @param index   The index of the point to retrieve.
     * @param point   A pointer to a point which is populated with the coordinates of the point at the given index if present.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_segment_get_point(@NativeType("msdf_segment_const_handle") ByteBuffer segment, @NativeType("size_t") long index, @NativeType("struct msdf_vector2 *") MSDFGenVector2.Buffer point) {
        return nmsdf_segment_get_point(memAddress(segment), index, point.address());
    }

    // --- [ msdf_segment_set_point ] ---

    /** Unsafe version of: {@link #msdf_segment_set_point segment_set_point} */
    public static native int nmsdf_segment_set_point(long segment, long index, long point);

    /**
     * Sets the coordinates of a point at the given index in the given segment.
     *
     * @param segment A pointer to the segment of which to set the point.
     * @param index   The index of the point to set.
     * @param point   A pointer to a point which is copied to the given index within the segment.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_segment_set_point(@NativeType("msdf_segment_handle") ByteBuffer segment, @NativeType("size_t") long index, @NativeType("struct msdf_vector2 const *") MSDFGenVector2.Buffer point) {
        return nmsdf_segment_set_point(memAddress(segment), index, point.address());
    }

    // --- [ msdf_segment_get_color ] ---

    /** Unsafe version of: {@link #msdf_segment_get_color segment_get_color} */
    public static native int nmsdf_segment_get_color(long segment, long color);

    /**
     * Retrieves the color of the given segment.
     *
     * @param segment A pointer to the segment of which to retrieve the color.
     * @param color   A pointer to a variable which is populated with the color of the given segment. Will be one of the constants prefixed with MSDF_COLOR_.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_segment_get_color(@NativeType("msdf_segment_const_handle") ByteBuffer segment, @NativeType("int *") IntBuffer color) {
        return nmsdf_segment_get_color(memAddress(segment), memAddress(color));
    }

    // --- [ msdf_segment_set_color ] ---

    /** Unsafe version of: {@link #msdf_segment_set_color segment_set_color} */
    public static native int nmsdf_segment_set_color(long segment, int color);

    /**
     * Sets the color of the given segment.
     *
     * @param segment A pointer to the segment of which to set the color.
     * @param color   The color to set. Can be any MSDF_COLOR_ value.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_segment_set_color(@NativeType("msdf_segment_handle") ByteBuffer segment, int color) {
        return nmsdf_segment_set_color(memAddress(segment), color);
    }

    // --- [ msdf_segment_get_direction ] ---

    /** Unsafe version of: {@link #msdf_segment_get_direction segment_get_direction} */
    public static native int nmsdf_segment_get_direction(long segment, double param, long direction);

    /**
     * Retrieves the direction of the given segment at the given point.
     *
     * @param segment   A pointer to the segment of which to retrieve the direction.
     * @param param     The point at which to retrieve the segment direction.
     * @param direction A pointer to a variable which is populated with the direction of the given segment at the given point.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_segment_get_direction(@NativeType("msdf_segment_const_handle") ByteBuffer segment, double param, @NativeType("struct msdf_vector2 *") MSDFGenVector2.Buffer direction) {
        return nmsdf_segment_get_direction(memAddress(segment), param, direction.address());
    }

    // --- [ msdf_segment_get_direction_change ] ---

    /** Unsafe version of: {@link #msdf_segment_get_direction_change segment_get_direction_change} */
    public static native int nmsdf_segment_get_direction_change(long segment, double param, long direction_change);

    /**
     * Retrieves the direction change of the given segment at the given point.
     *
     * @param segment          A pointer to the segment of which to retrieve the direction change.
     * @param param            The point at which to retrieve the segment direction change.
     * @param direction_change A pointer to a variable which is populated with the direction change of the given segment at the given point.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_segment_get_direction_change(@NativeType("msdf_segment_const_handle") ByteBuffer segment, double param, @NativeType("struct msdf_vector2 *") MSDFGenVector2.Buffer direction_change) {
        return nmsdf_segment_get_direction_change(memAddress(segment), param, direction_change.address());
    }

    // --- [ msdf_segment_point ] ---

    /** Unsafe version of: {@link #msdf_segment_point segment_point} */
    public static native int nmsdf_segment_point(long segment, double param, long point);

    /**
     * Retrieves the point on the given edge segment specified by the given parameter.
     *
     * @param segment A pointer to the segment of which to retrieve the edge point.
     * @param param   The point at which to sample.
     * @param point   A pointer to a variable which is populated with the edge point at the given location from the given segment.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_segment_point(@NativeType("msdf_segment_const_handle") ByteBuffer segment, double param, @NativeType("struct msdf_vector2 *") MSDFGenVector2.Buffer point) {
        return nmsdf_segment_point(memAddress(segment), param, point.address());
    }

    // --- [ msdf_segment_bound ] ---

    /** Unsafe version of: {@link #msdf_segment_bound segment_bound} */
    public static native int nmsdf_segment_bound(long segment, long bounds);

    /**
     * Adjusts the given bounding box to fit at least the given segment.
     *
     * @param segment A pointer to the segment which should at least fit in the given bounding box.
     * @param bounds  A pointer to the bounding box which should at least fit the given segment.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_segment_bound(@NativeType("msdf_segment_const_handle") ByteBuffer segment, @NativeType("struct msdf_bounds *") MSDFGenBounds.Buffer bounds) {
        return nmsdf_segment_bound(memAddress(segment), bounds.address());
    }

    // --- [ msdf_segment_move_start_point ] ---

    /** Unsafe version of: {@link #msdf_segment_move_start_point segment_move_start_point} */
    public static native int nmsdf_segment_move_start_point(long segment, long point);

    /**
     * Moves the start point of the given segment.
     *
     * @param segment A pointer to the segment of which to adjust the start point.
     * @param point   A pointer to the new start point of the given segment.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_segment_move_start_point(@NativeType("msdf_segment_handle") ByteBuffer segment, @NativeType("struct msdf_vector2 const *") MSDFGenVector2.Buffer point) {
        return nmsdf_segment_move_start_point(memAddress(segment), point.address());
    }

    // --- [ msdf_segment_move_end_point ] ---

    /** Unsafe version of: {@link #msdf_segment_move_end_point segment_move_end_point} */
    public static native int nmsdf_segment_move_end_point(long segment, long point);

    /**
     * Moves the end point of the given segment.
     *
     * @param segment A pointer to the segment of which to adjust the end point.
     * @param point   A pointer to the new end point of the given segment.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_segment_move_end_point(@NativeType("msdf_segment_handle") ByteBuffer segment, @NativeType("struct msdf_vector2 const *") MSDFGenVector2.Buffer point) {
        return nmsdf_segment_move_end_point(memAddress(segment), point.address());
    }

    // --- [ msdf_segment_free ] ---

    /** Unsafe version of: {@link #msdf_segment_free segment_free} */
    public static native void nmsdf_segment_free(long segment);

    /**
     * Calls the destructor of the given segment and frees its memory using the internal allocator.
     *
     * @param segment A pointer to the segment to free.
     */
    public static void msdf_segment_free(@NativeType("msdf_segment_handle") ByteBuffer segment) {
        nmsdf_segment_free(memAddress(segment));
    }

    // --- [ msdf_generate_sdf ] ---

    /** Unsafe version of: {@link #msdf_generate_sdf generate_sdf} */
    public static native int nmsdf_generate_sdf(long output, long shape, long transform);

    /**
     * @param output    A pointer to a bitmap that was allocated with msdf_bitmap_alloc to which the given shape is rendered. The bitmap must be of type MSDF_BITMAP_TYPE_SDF.
     * @param shape     A pointer to the shape to render to the given bitmap.
     * @param transform The transform which is applied to the given shape during rendering.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_generate_sdf(@NativeType("struct msdf_bitmap *") MSDFGenBitmap.Buffer output, @NativeType("msdf_shape_const_handle") ByteBuffer shape, @NativeType("struct msdf_transform const *") MSDFGenTransform.Buffer transform) {
        return nmsdf_generate_sdf(output.address(), memAddress(shape), transform.address());
    }

    // --- [ msdf_generate_psdf ] ---

    /** Unsafe version of: {@link #msdf_generate_psdf generate_psdf} */
    public static native int nmsdf_generate_psdf(long output, long shape, long transform);

    /**
     * @param output    A pointer to a bitmap that was allocated with msdf_bitmap_alloc to which the given shape is rendered. The bitmap must be of type MSDF_BITMAP_TYPE_PSDF.
     * @param shape     A pointer to the shape to render to the given bitmap.
     * @param transform The transform which is applied to the given shape during rendering.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_generate_psdf(@NativeType("struct msdf_bitmap *") MSDFGenBitmap.Buffer output, @NativeType("msdf_shape_const_handle") ByteBuffer shape, @NativeType("struct msdf_transform const *") MSDFGenTransform.Buffer transform) {
        return nmsdf_generate_psdf(output.address(), memAddress(shape), transform.address());
    }

    // --- [ msdf_generate_msdf ] ---

    /** Unsafe version of: {@link #msdf_generate_msdf generate_msdf} */
    public static native int nmsdf_generate_msdf(long output, long shape, long transform);

    /**
     * @param output    A pointer to a bitmap that was allocated with msdf_bitmap_alloc to which the given shape is rendered. The bitmap must be of type MSDF_BITMAP_TYPE_MSDF.
     * @param shape     A pointer to the shape to render to the given bitmap.
     * @param transform The transform which is applied to the given shape during rendering.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_generate_msdf(@NativeType("struct msdf_bitmap *") MSDFGenBitmap.Buffer output, @NativeType("msdf_shape_const_handle") ByteBuffer shape, @NativeType("struct msdf_transform const *") MSDFGenTransform.Buffer transform) {
        return nmsdf_generate_msdf(output.address(), memAddress(shape), transform.address());
    }

    // --- [ msdf_generate_mtsdf ] ---

    /** Unsafe version of: {@link #msdf_generate_mtsdf generate_mtsdf} */
    public static native int nmsdf_generate_mtsdf(long output, long shape, long transform);

    /**
     * @param output    A pointer to a bitmap that was allocated with msdf_bitmap_alloc to which the given shape is rendered. The bitmap must be of type MSDF_BITMAP_TYPE_MTSDF.
     * @param shape     A pointer to the shape to render to the given bitmap.
     * @param transform The transform which is applied to the given shape during rendering.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_generate_mtsdf(@NativeType("struct msdf_bitmap *") MSDFGenBitmap.Buffer output, @NativeType("msdf_shape_const_handle") ByteBuffer shape, @NativeType("struct msdf_transform const *") MSDFGenTransform.Buffer transform) {
        return nmsdf_generate_mtsdf(output.address(), memAddress(shape), transform.address());
    }

    // --- [ msdf_generate_sdf_with_config ] ---

    /** Unsafe version of: {@link #msdf_generate_sdf_with_config generate_sdf_with_config} */
    public static native int nmsdf_generate_sdf_with_config(long output, long shape, long transform, long config);

    /**
     * @param output    A pointer to a bitmap that was allocated with msdf_bitmap_alloc to which the given shape is rendered. The bitmap must be of type MSDF_BITMAP_TYPE_SDF.
     * @param shape     A pointer to the shape to render to the given bitmap.
     * @param transform The transform which is applied to the given shape during rendering.
     * @param config    A pointer to the config which is applied to the sprite generator before rendering.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_generate_sdf_with_config(@NativeType("struct msdf_bitmap *") MSDFGenBitmap.Buffer output, @NativeType("msdf_shape_const_handle") ByteBuffer shape, @NativeType("struct msdf_transform const *") MSDFGenTransform.Buffer transform, @NativeType("struct msdf_config const *") MSDFGenConfig.Buffer config) {
        return nmsdf_generate_sdf_with_config(output.address(), memAddress(shape), transform.address(), config.address());
    }

    // --- [ msdf_generate_psdf_with_config ] ---

    /** Unsafe version of: {@link #msdf_generate_psdf_with_config generate_psdf_with_config} */
    public static native int nmsdf_generate_psdf_with_config(long output, long shape, long transform, long config);

    /**
     * @param output    A pointer to a bitmap that was allocated with msdf_bitmap_alloc to which the given shape is rendered. The bitmap must be of type MSDF_BITMAP_TYPE_PSDF.
     * @param shape     A pointer to the shape to render to the given bitmap.
     * @param transform The transform which is applied to the given shape during rendering.
     * @param config    A pointer to the config which is applied to the sprite generator before rendering.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_generate_psdf_with_config(@NativeType("struct msdf_bitmap *") MSDFGenBitmap.Buffer output, @NativeType("msdf_shape_const_handle") ByteBuffer shape, @NativeType("struct msdf_transform const *") MSDFGenTransform.Buffer transform, @NativeType("struct msdf_config const *") MSDFGenConfig.Buffer config) {
        return nmsdf_generate_psdf_with_config(output.address(), memAddress(shape), transform.address(), config.address());
    }

    // --- [ msdf_generate_msdf_with_config ] ---

    /** Unsafe version of: {@link #msdf_generate_msdf_with_config generate_msdf_with_config} */
    public static native int nmsdf_generate_msdf_with_config(long output, long shape, long transform, long config);

    /**
     * @param output    A pointer to a bitmap that was allocated with msdf_bitmap_alloc to which the given shape is rendered. The bitmap must be of type MSDF_BITMAP_TYPE_MSDF.
     * @param shape     A pointer to the shape to render to the given bitmap.
     * @param transform The transform which is applied to the given shape during rendering.
     * @param config    A pointer to the config which is applied to the sprite generator before rendering.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_generate_msdf_with_config(@NativeType("struct msdf_bitmap *") MSDFGenBitmap.Buffer output, @NativeType("msdf_shape_const_handle") ByteBuffer shape, @NativeType("struct msdf_transform const *") MSDFGenTransform.Buffer transform, @NativeType("struct msdf_multichannel_config const *") MSDFGenMultichannelConfig.Buffer config) {
        return nmsdf_generate_msdf_with_config(output.address(), memAddress(shape), transform.address(), config.address());
    }

    // --- [ msdf_generate_mtsdf_with_config ] ---

    /** Unsafe version of: {@link #msdf_generate_mtsdf_with_config generate_mtsdf_with_config} */
    public static native int nmsdf_generate_mtsdf_with_config(long output, long shape, long transform, long config);

    /**
     * @param output    A pointer to a bitmap that was allocated with msdf_bitmap_alloc to which the given shape is rendered. The bitmap must be of type MSDF_BITMAP_TYPE_MTSDF.
     * @param shape     A pointer to the shape to render to the given bitmap.
     * @param transform The transform which is applied to the given shape during rendering.
     * @param config    A pointer to the config which is applied to the sprite generator before rendering.
     *
     * @return MSDF_SUCCESS on success, otherwise one of the constants prefixed with MSDF_ERR_.
     */
    public static int msdf_generate_mtsdf_with_config(@NativeType("struct msdf_bitmap *") MSDFGenBitmap.Buffer output, @NativeType("msdf_shape_const_handle") ByteBuffer shape, @NativeType("struct msdf_transform const *") MSDFGenTransform.Buffer transform, @NativeType("struct msdf_multichannel_config const *") MSDFGenMultichannelConfig.Buffer config) {
        return nmsdf_generate_mtsdf_with_config(output.address(), memAddress(shape), transform.address(), config.address());
    }

}
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

    public static native void nmsdf_allocator_set(long allocator);

    public static void msdf_allocator_set(@NativeType("struct msdf_allocator const *") MSDFGenAllocator.Buffer allocator) {
        if (CHECKS) {
            MSDFGenAllocator.validate(allocator.address());
        }
        nmsdf_allocator_set(allocator.address());
    }

    // --- [ msdf_bitmap_alloc ] ---

    public static native int nmsdf_bitmap_alloc(int type, int width, int height, long bitmap);

    public static int msdf_bitmap_alloc(int type, int width, int height, @NativeType("struct msdf_bitmap **") PointerBuffer bitmap) {
        return nmsdf_bitmap_alloc(type, width, height, memAddress(bitmap));
    }

    // --- [ msdf_bitmap_get_channel_count ] ---

    public static native int nmsdf_bitmap_get_channel_count(long bitmap, long channel_count);

    public static int msdf_bitmap_get_channel_count(@NativeType("struct msdf_bitmap const *") MSDFGenBitmap.Buffer bitmap, @NativeType("int *") IntBuffer channel_count) {
        if (CHECKS) {
            MSDFGenBitmap.validate(bitmap.address());
        }
        return nmsdf_bitmap_get_channel_count(bitmap.address(), memAddress(channel_count));
    }

    // --- [ msdf_bitmap_get_pixels ] ---

    public static native int nmsdf_bitmap_get_pixels(long bitmap, long pixels);

    public static int msdf_bitmap_get_pixels(@NativeType("struct msdf_bitmap const *") MSDFGenBitmap.Buffer bitmap, @NativeType("void **") PointerBuffer pixels) {
        if (CHECKS) {
            MSDFGenBitmap.validate(bitmap.address());
        }
        return nmsdf_bitmap_get_pixels(bitmap.address(), memAddress(pixels));
    }

    // --- [ msdf_bitmap_get_size ] ---

    public static native int nmsdf_bitmap_get_size(long bitmap, long size);

    public static int msdf_bitmap_get_size(@NativeType("struct msdf_bitmap const *") MSDFGenBitmap.Buffer bitmap, @NativeType("size_t *") PointerBuffer size) {
        if (CHECKS) {
            MSDFGenBitmap.validate(bitmap.address());
        }
        return nmsdf_bitmap_get_size(bitmap.address(), memAddress(size));
    }

    // --- [ msdf_bitmap_free ] ---

    public static native void nmsdf_bitmap_free(long bitmap);

    public static void msdf_bitmap_free(@NativeType("struct msdf_bitmap *") MSDFGenBitmap.Buffer bitmap) {
        nmsdf_bitmap_free(bitmap.address());
    }

    // --- [ msdf_shape_alloc ] ---

    public static native int nmsdf_shape_alloc(long shape);

    public static int msdf_shape_alloc(@NativeType("msdf_shape_handle *") PointerBuffer shape) {
        return nmsdf_shape_alloc(memAddress(shape));
    }

    // --- [ msdf_shape_get_bounds ] ---

    public static native int nmsdf_shape_get_bounds(long shape, long bounds);

    public static int msdf_shape_get_bounds(@NativeType("msdf_shape_handle") ByteBuffer shape, @NativeType("struct msdf_bounds *") MSDFGenBounds.Buffer bounds) {
        return nmsdf_shape_get_bounds(memAddress(shape), bounds.address());
    }

    // --- [ msdf_shape_add_contour ] ---

    public static native int nmsdf_shape_add_contour(long shape, long contour);

    public static int msdf_shape_add_contour(@NativeType("msdf_shape_handle") ByteBuffer shape, @NativeType("msdf_contour_handle *") PointerBuffer contour) {
        return nmsdf_shape_add_contour(memAddress(shape), memAddress(contour));
    }

    // --- [ msdf_shape_get_contour_count ] ---

    public static native int nmsdf_shape_get_contour_count(long shape, long size);

    public static int msdf_shape_get_contour_count(@NativeType("msdf_shape_handle") ByteBuffer shape, @NativeType("size_t *") PointerBuffer size) {
        return nmsdf_shape_get_contour_count(memAddress(shape), memAddress(size));
    }

    // --- [ msdf_shape_get_contour ] ---

    public static native int nmsdf_shape_get_contour(long shape, long index, long contour);

    public static int msdf_shape_get_contour(@NativeType("msdf_shape_handle") ByteBuffer shape, @NativeType("size_t") long index, @NativeType("msdf_contour_handle *") PointerBuffer contour) {
        return nmsdf_shape_get_contour(memAddress(shape), index, memAddress(contour));
    }

    // --- [ msdf_shape_get_edge_count ] ---

    public static native int nmsdf_shape_get_edge_count(long shape, long count);

    public static int msdf_shape_get_edge_count(@NativeType("msdf_shape_handle") ByteBuffer shape, @NativeType("size_t *") PointerBuffer count) {
        return nmsdf_shape_get_edge_count(memAddress(shape), memAddress(count));
    }

    // --- [ msdf_shape_has_inverse_y_axis ] ---

    public static native int nmsdf_shape_has_inverse_y_axis(long shape, long inverse_y_axis);

    public static int msdf_shape_has_inverse_y_axis(@NativeType("msdf_shape_handle") ByteBuffer shape, @NativeType("int *") IntBuffer inverse_y_axis) {
        return nmsdf_shape_has_inverse_y_axis(memAddress(shape), memAddress(inverse_y_axis));
    }

    // --- [ msdf_shape_normalize ] ---

    public static native int nmsdf_shape_normalize(long shape);

    public static int msdf_shape_normalize(@NativeType("msdf_shape_handle") ByteBuffer shape) {
        return nmsdf_shape_normalize(memAddress(shape));
    }

    // --- [ msdf_shape_validate ] ---

    public static native int nmsdf_shape_validate(long shape, long result);

    public static int msdf_shape_validate(@NativeType("msdf_shape_handle") ByteBuffer shape, @NativeType("int *") IntBuffer result) {
        return nmsdf_shape_validate(memAddress(shape), memAddress(result));
    }

    // --- [ msdf_shape_bound ] ---

    public static native int nmsdf_shape_bound(long shape, long bounds);

    public static int msdf_shape_bound(@NativeType("msdf_shape_handle") ByteBuffer shape, @NativeType("struct msdf_bounds *") MSDFGenBounds.Buffer bounds) {
        return nmsdf_shape_bound(memAddress(shape), bounds.address());
    }

    // --- [ msdf_shape_bound_miters ] ---

    public static native int nmsdf_shape_bound_miters(long shape, long bounds, double border, double miter_limit, int polarity);

    public static int msdf_shape_bound_miters(@NativeType("msdf_shape_handle") ByteBuffer shape, @NativeType("struct msdf_bounds *") MSDFGenBounds.Buffer bounds, double border, double miter_limit, int polarity) {
        return nmsdf_shape_bound_miters(memAddress(shape), bounds.address(), border, miter_limit, polarity);
    }

    // --- [ msdf_shape_free ] ---

    public static native void nmsdf_shape_free(long shape);

    public static void msdf_shape_free(@NativeType("msdf_shape_handle") ByteBuffer shape) {
        nmsdf_shape_free(memAddress(shape));
    }

    // --- [ msdf_contour_alloc ] ---

    public static native int nmsdf_contour_alloc(long contour);

    public static int msdf_contour_alloc(@NativeType("msdf_contour_handle *") PointerBuffer contour) {
        return nmsdf_contour_alloc(memAddress(contour));
    }

    // --- [ msdf_contour_add_edge ] ---

    public static native int nmsdf_contour_add_edge(long contour, long edge);

    public static int msdf_contour_add_edge(@NativeType("msdf_contour_handle") ByteBuffer contour, @NativeType("msdf_edge_holder_handle *") PointerBuffer edge) {
        return nmsdf_contour_add_edge(memAddress(contour), memAddress(edge));
    }

    // --- [ msdf_contour_get_edge_count ] ---

    public static native int nmsdf_contour_get_edge_count(long contour, long count);

    public static int msdf_contour_get_edge_count(@NativeType("msdf_contour_handle") ByteBuffer contour, @NativeType("size_t *") PointerBuffer count) {
        return nmsdf_contour_get_edge_count(memAddress(contour), memAddress(count));
    }

    // --- [ msdf_contour_get_edge ] ---

    public static native int nmsdf_contour_get_edge(long contour, long index, long edge);

    public static int msdf_contour_get_edge(@NativeType("msdf_contour_handle") ByteBuffer contour, @NativeType("size_t") long index, @NativeType("msdf_edge_holder_handle *") PointerBuffer edge) {
        return nmsdf_contour_get_edge(memAddress(contour), index, memAddress(edge));
    }

    // --- [ msdf_contour_bound ] ---

    public static native int nmsdf_contour_bound(long contour, long bounds);

    public static int msdf_contour_bound(@NativeType("msdf_contour_handle") ByteBuffer contour, @NativeType("struct msdf_bounds *") MSDFGenBounds.Buffer bounds) {
        return nmsdf_contour_bound(memAddress(contour), bounds.address());
    }

    // --- [ msdf_contour_bound_miters ] ---

    public static native int nmsdf_contour_bound_miters(long contour, long bounds, double border, double miter_limit, int polarity);

    public static int msdf_contour_bound_miters(@NativeType("msdf_contour_handle") ByteBuffer contour, @NativeType("struct msdf_bounds *") MSDFGenBounds.Buffer bounds, double border, double miter_limit, int polarity) {
        return nmsdf_contour_bound_miters(memAddress(contour), bounds.address(), border, miter_limit, polarity);
    }

    // --- [ msdf_contour_get_winding ] ---

    public static native int nmsdf_contour_get_winding(long contour, long winding);

    public static int msdf_contour_get_winding(@NativeType("msdf_contour_handle") ByteBuffer contour, @NativeType("int *") IntBuffer winding) {
        return nmsdf_contour_get_winding(memAddress(contour), memAddress(winding));
    }

    // --- [ msdf_contour_reverse ] ---

    public static native int nmsdf_contour_reverse(long contour);

    public static int msdf_contour_reverse(@NativeType("msdf_contour_handle") ByteBuffer contour) {
        return nmsdf_contour_reverse(memAddress(contour));
    }

    // --- [ msdf_contour_free ] ---

    public static native void nmsdf_contour_free(long contour);

    public static void msdf_contour_free(@NativeType("msdf_contour_handle") ByteBuffer contour) {
        nmsdf_contour_free(memAddress(contour));
    }

}
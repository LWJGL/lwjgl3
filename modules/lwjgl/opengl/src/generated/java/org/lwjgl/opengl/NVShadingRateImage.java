/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NVShadingRateImage {

    static { GL.initialize(); }

    public static final int GL_SHADING_RATE_IMAGE_NV = 0x9563;

    public static final int
        GL_SHADING_RATE_NO_INVOCATIONS_NV              = 0x9564,
        GL_SHADING_RATE_1_INVOCATION_PER_PIXEL_NV      = 0x9565,
        GL_SHADING_RATE_1_INVOCATION_PER_1X2_PIXELS_NV = 0x9566,
        GL_SHADING_RATE_1_INVOCATION_PER_2X1_PIXELS_NV = 0x9567,
        GL_SHADING_RATE_1_INVOCATION_PER_2X2_PIXELS_NV = 0x9568,
        GL_SHADING_RATE_1_INVOCATION_PER_2X4_PIXELS_NV = 0x9569,
        GL_SHADING_RATE_1_INVOCATION_PER_4X2_PIXELS_NV = 0x956A,
        GL_SHADING_RATE_1_INVOCATION_PER_4X4_PIXELS_NV = 0x956B,
        GL_SHADING_RATE_2_INVOCATIONS_PER_PIXEL_NV     = 0x956C,
        GL_SHADING_RATE_4_INVOCATIONS_PER_PIXEL_NV     = 0x956D,
        GL_SHADING_RATE_8_INVOCATIONS_PER_PIXEL_NV     = 0x956E,
        GL_SHADING_RATE_16_INVOCATIONS_PER_PIXEL_NV    = 0x956F;

    public static final int
        GL_SHADING_RATE_IMAGE_BINDING_NV      = 0x955B,
        GL_SHADING_RATE_IMAGE_TEXEL_WIDTH_NV  = 0x955C,
        GL_SHADING_RATE_IMAGE_TEXEL_HEIGHT_NV = 0x955D,
        GL_SHADING_RATE_IMAGE_PALETTE_SIZE_NV = 0x955E,
        GL_MAX_COARSE_FRAGMENT_SAMPLES_NV     = 0x955F;

    public static final int
        GL_SHADING_RATE_SAMPLE_ORDER_DEFAULT_NV      = 0x95AE,
        GL_SHADING_RATE_SAMPLE_ORDER_PIXEL_MAJOR_NV  = 0x95AF,
        GL_SHADING_RATE_SAMPLE_ORDER_SAMPLE_MAJOR_NV = 0x95B0;

    protected NVShadingRateImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindShadingRateImageNV ] ---

    /** {@code void glBindShadingRateImageNV(GLuint texture)} */
    public static native void glBindShadingRateImageNV(@NativeType("GLuint") int texture);

    // --- [ glShadingRateImagePaletteNV ] ---

    /** {@code void glShadingRateImagePaletteNV(GLuint viewport, GLuint first, GLsizei count, GLenum const * rates)} */
    public static native void nglShadingRateImagePaletteNV(int viewport, int first, int count, long rates);

    /** {@code void glShadingRateImagePaletteNV(GLuint viewport, GLuint first, GLsizei count, GLenum const * rates)} */
    public static void glShadingRateImagePaletteNV(@NativeType("GLuint") int viewport, @NativeType("GLuint") int first, @NativeType("GLenum const *") IntBuffer rates) {
        nglShadingRateImagePaletteNV(viewport, first, rates.remaining(), memAddress(rates));
    }

    // --- [ glGetShadingRateImagePaletteNV ] ---

    /** {@code void glGetShadingRateImagePaletteNV(GLuint viewport, GLuint entry, GLenum * rate)} */
    public static native void nglGetShadingRateImagePaletteNV(int viewport, int entry, long rate);

    /** {@code void glGetShadingRateImagePaletteNV(GLuint viewport, GLuint entry, GLenum * rate)} */
    public static void glGetShadingRateImagePaletteNV(@NativeType("GLuint") int viewport, @NativeType("GLuint") int entry, @NativeType("GLenum *") IntBuffer rate) {
        if (CHECKS) {
            check(rate, 1);
        }
        nglGetShadingRateImagePaletteNV(viewport, entry, memAddress(rate));
    }

    // --- [ glShadingRateImageBarrierNV ] ---

    /** {@code void glShadingRateImageBarrierNV(GLboolean synchronize)} */
    public static native void glShadingRateImageBarrierNV(@NativeType("GLboolean") boolean synchronize);

    // --- [ glShadingRateSampleOrderNV ] ---

    /** {@code void glShadingRateSampleOrderNV(GLenum order)} */
    public static native void glShadingRateSampleOrderNV(@NativeType("GLenum") int order);

    // --- [ glShadingRateSampleOrderCustomNV ] ---

    /** {@code void glShadingRateSampleOrderCustomNV(GLenum rate, GLuint samples, GLint const * locations)} */
    public static native void nglShadingRateSampleOrderCustomNV(int rate, int samples, long locations);

    /** {@code void glShadingRateSampleOrderCustomNV(GLenum rate, GLuint samples, GLint const * locations)} */
    public static void glShadingRateSampleOrderCustomNV(@NativeType("GLenum") int rate, @NativeType("GLuint") int samples, @NativeType("GLint const *") IntBuffer locations) {
        nglShadingRateSampleOrderCustomNV(rate, samples, memAddress(locations));
    }

    // --- [ glGetShadingRateSampleLocationivNV ] ---

    /** {@code void glGetShadingRateSampleLocationivNV(GLenum rate, GLuint samples, GLuint index, GLint * location)} */
    public static native void nglGetShadingRateSampleLocationivNV(int rate, int samples, int index, long location);

    /** {@code void glGetShadingRateSampleLocationivNV(GLenum rate, GLuint samples, GLuint index, GLint * location)} */
    public static void glGetShadingRateSampleLocationivNV(@NativeType("GLenum") int rate, @NativeType("GLuint") int samples, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer location) {
        if (CHECKS) {
            check(location, 3);
        }
        nglGetShadingRateSampleLocationivNV(rate, samples, index, memAddress(location));
    }

    /** {@code void glShadingRateImagePaletteNV(GLuint viewport, GLuint first, GLsizei count, GLenum const * rates)} */
    public static void glShadingRateImagePaletteNV(@NativeType("GLuint") int viewport, @NativeType("GLuint") int first, @NativeType("GLenum const *") int[] rates) {
        long __functionAddress = GL.getICD().glShadingRateImagePaletteNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(viewport, first, rates.length, rates, __functionAddress);
    }

    /** {@code void glGetShadingRateImagePaletteNV(GLuint viewport, GLuint entry, GLenum * rate)} */
    public static void glGetShadingRateImagePaletteNV(@NativeType("GLuint") int viewport, @NativeType("GLuint") int entry, @NativeType("GLenum *") int[] rate) {
        long __functionAddress = GL.getICD().glGetShadingRateImagePaletteNV;
        if (CHECKS) {
            check(__functionAddress);
            check(rate, 1);
        }
        callPV(viewport, entry, rate, __functionAddress);
    }

    /** {@code void glShadingRateSampleOrderCustomNV(GLenum rate, GLuint samples, GLint const * locations)} */
    public static void glShadingRateSampleOrderCustomNV(@NativeType("GLenum") int rate, @NativeType("GLuint") int samples, @NativeType("GLint const *") int[] locations) {
        long __functionAddress = GL.getICD().glShadingRateSampleOrderCustomNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(rate, samples, locations, __functionAddress);
    }

    /** {@code void glGetShadingRateSampleLocationivNV(GLenum rate, GLuint samples, GLuint index, GLint * location)} */
    public static void glGetShadingRateSampleLocationivNV(@NativeType("GLenum") int rate, @NativeType("GLuint") int samples, @NativeType("GLuint") int index, @NativeType("GLint *") int[] location) {
        long __functionAddress = GL.getICD().glGetShadingRateSampleLocationivNV;
        if (CHECKS) {
            check(__functionAddress);
            check(location, 3);
        }
        callPV(rate, samples, index, location, __functionAddress);
    }

}
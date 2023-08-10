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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_shading_rate_image.txt">NV_shading_rate_image</a> extension.
 * 
 * <p>By default, OpenGL runs a fragment shader once for each pixel covered by a primitive being rasterized. When using multisampling, the outputs of that
 * fragment shader are broadcast to each covered sample of the fragment's pixel. When using multisampling, applications can also request that the fragment
 * shader be run once per color sample (when using the {@code "sample"} qualifier on one or more active fragment shader inputs), or run a fixed number of
 * times per pixel using {@link GL40#GL_SAMPLE_SHADING SAMPLE_SHADING} enable and the {@link GL40C#glMinSampleShading MinSampleShading} frequency value. In all of these approaches, the number of fragment shader
 * invocations per pixel is fixed, based on API state.</p>
 * 
 * <p>This extension allows applications to bind and enable a shading rate image that can be used to vary the number of fragment shader invocations across
 * the framebuffer. This can be useful for applications like eye tracking for virtual reality, where the portion of the framebuffer that the user is
 * looking at directly can be processed at high frequency, while distant corners of the image can be processed at lower frequency. The shading rate image
 * is an immutable-format two-dimensional or two-dimensional array texture that uses a format of {@link GL30#GL_R8UI R8UI}. Each texel represents a fixed-size rectangle in
 * the framebuffer, covering 16x16 pixels in the initial implementation of this extension. When rasterizing a primitive covering one of these rectangles,
 * the OpenGL implementation reads the texel in the bound shading rate image and looks up the fetched value in a palette of shading rates. The shading
 * rate used can vary from (finest) 16 fragment shader invocations per pixel to (coarsest) one fragment shader invocation for each 4x4 block of pixels.</p>
 * 
 * <p>When this extension is advertised by an OpenGL implementation, the implementation must also support the GLSL extension
 * {@code "GL_NV_shading_rate_image"} (documented separately), which provides new built-in variables that allow fragment shaders to determine the
 * effective shading rate used for each fragment. Additionally, the GLSL extension also provides new layout qualifiers allowing the interlock
 * functionality provided by <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_fragment_shader_interlock.txt">ARB_fragment_shader_interlock</a> to guarantee mutual exclusion across an entire fragment when the shading rate specifies
 * multiple pixels per fragment shader invocation.</p>
 * 
 * <p>Note that this extension requires the use of a framebuffer object; the shading rate image and related state are ignored when rendering to the default
 * framebuffer.</p>
 * 
 * <p>Requires {@link GL45 OpenGL 4.5} and {@link NVFramebufferMixedSamples NV_framebuffer_mixed_samples}.</p>
 */
public class NVShadingRateImage {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code cap} parameter of {@link CGL#CGLEnable Enable}, {@link CGL#CGLDisable Disable}, and {@link CGL#CGLIsEnabled IsEnabled}, by the {@code target} parameter of {@link GL30C#glEnablei Enablei}, {@link GL30C#glDisablei Disablei},
     * {@link GL30C#glIsEnabledi IsEnabledi}, {@link EXTDrawBuffers2#glEnableIndexedEXT EnableIndexedEXT}, {@link EXTDrawBuffers2#glDisableIndexedEXT DisableIndexedEXT}, and {@link EXTDrawBuffers2#glIsEnabledIndexedEXT IsEnabledIndexedEXT}, and by the {@code pname} parameter of {@link GL11C#glGetBooleanv GetBooleanv},
     * {@link GL11C#glGetIntegerv GetIntegerv}, {@link GL32C#glGetInteger64v GetInteger64v}, {@link GL11C#glGetFloatv GetFloatv}, {@link GL11C#glGetDoublev GetDoublev}, {@link EXTDirectStateAccess#glGetDoubleIndexedvEXT GetDoubleIndexedvEXT}, {@link GL30C#glGetBooleani_v GetBooleani_v}, {@link GL30C#glGetIntegeri_v GetIntegeri_v}, {@link GL32C#glGetInteger64i_v GetInteger64i_v},
     * {@link GL41C#glGetFloati_v GetFloati_v}, {@link GL41C#glGetDoublei_v GetDoublei_v}, {@link EXTDrawBuffers2#glGetBooleanIndexedvEXT GetBooleanIndexedvEXT}, {@link EXTDrawBuffers2#glGetIntegerIndexedvEXT GetIntegerIndexedvEXT}, and {@link EXTDirectStateAccess#glGetFloatIndexedvEXT GetFloatIndexedvEXT}.
     */
    public static final int GL_SHADING_RATE_IMAGE_NV = 0x9563;

    /**
     * Accepted in the {@code rates} parameter of {@link #glShadingRateImagePaletteNV ShadingRateImagePaletteNV} and the {@code rate} parameter of {@link #glShadingRateSampleOrderCustomNV ShadingRateSampleOrderCustomNV} and
     * {@link #glGetShadingRateSampleLocationivNV GetShadingRateSampleLocationivNV}; returned in the {@code rate} parameter of {@link #glGetShadingRateImagePaletteNV GetShadingRateImagePaletteNV}.
     */
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

    /** Accepted by the {@code pname} parameter of {@link GL11C#glGetBooleanv GetBooleanv}, {@link GL11C#glGetDoublev GetDoublev}, {@link GL11C#glGetIntegerv GetIntegerv}, and {@link GL11C#glGetFloatv GetFloatv}. */
    public static final int
        GL_SHADING_RATE_IMAGE_BINDING_NV      = 0x955B,
        GL_SHADING_RATE_IMAGE_TEXEL_WIDTH_NV  = 0x955C,
        GL_SHADING_RATE_IMAGE_TEXEL_HEIGHT_NV = 0x955D,
        GL_SHADING_RATE_IMAGE_PALETTE_SIZE_NV = 0x955E,
        GL_MAX_COARSE_FRAGMENT_SAMPLES_NV     = 0x955F;

    /** Accepted by the {@code order} parameter of {@link #glShadingRateSampleOrderNV ShadingRateSampleOrderNV}. */
    public static final int
        GL_SHADING_RATE_SAMPLE_ORDER_DEFAULT_NV      = 0x95AE,
        GL_SHADING_RATE_SAMPLE_ORDER_PIXEL_MAJOR_NV  = 0x95AF,
        GL_SHADING_RATE_SAMPLE_ORDER_SAMPLE_MAJOR_NV = 0x95B0;

    protected NVShadingRateImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindShadingRateImageNV ] ---

    public static native void glBindShadingRateImageNV(@NativeType("GLuint") int texture);

    // --- [ glShadingRateImagePaletteNV ] ---

    public static native void nglShadingRateImagePaletteNV(int viewport, int first, int count, long rates);

    public static void glShadingRateImagePaletteNV(@NativeType("GLuint") int viewport, @NativeType("GLuint") int first, @NativeType("GLenum const *") IntBuffer rates) {
        nglShadingRateImagePaletteNV(viewport, first, rates.remaining(), memAddress(rates));
    }

    // --- [ glGetShadingRateImagePaletteNV ] ---

    public static native void nglGetShadingRateImagePaletteNV(int viewport, int entry, long rate);

    public static void glGetShadingRateImagePaletteNV(@NativeType("GLuint") int viewport, @NativeType("GLuint") int entry, @NativeType("GLenum *") IntBuffer rate) {
        if (CHECKS) {
            check(rate, 1);
        }
        nglGetShadingRateImagePaletteNV(viewport, entry, memAddress(rate));
    }

    // --- [ glShadingRateImageBarrierNV ] ---

    public static native void glShadingRateImageBarrierNV(@NativeType("GLboolean") boolean synchronize);

    // --- [ glShadingRateSampleOrderNV ] ---

    public static native void glShadingRateSampleOrderNV(@NativeType("GLenum") int order);

    // --- [ glShadingRateSampleOrderCustomNV ] ---

    public static native void nglShadingRateSampleOrderCustomNV(int rate, int samples, long locations);

    public static void glShadingRateSampleOrderCustomNV(@NativeType("GLenum") int rate, @NativeType("GLuint") int samples, @NativeType("GLint const *") IntBuffer locations) {
        nglShadingRateSampleOrderCustomNV(rate, samples, memAddress(locations));
    }

    // --- [ glGetShadingRateSampleLocationivNV ] ---

    public static native void nglGetShadingRateSampleLocationivNV(int rate, int samples, int index, long location);

    public static void glGetShadingRateSampleLocationivNV(@NativeType("GLenum") int rate, @NativeType("GLuint") int samples, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer location) {
        if (CHECKS) {
            check(location, 3);
        }
        nglGetShadingRateSampleLocationivNV(rate, samples, index, memAddress(location));
    }

    /** Array version of: {@link #glShadingRateImagePaletteNV ShadingRateImagePaletteNV} */
    public static void glShadingRateImagePaletteNV(@NativeType("GLuint") int viewport, @NativeType("GLuint") int first, @NativeType("GLenum const *") int[] rates) {
        long __functionAddress = GL.getICD().glShadingRateImagePaletteNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(viewport, first, rates.length, rates, __functionAddress);
    }

    /** Array version of: {@link #glGetShadingRateImagePaletteNV GetShadingRateImagePaletteNV} */
    public static void glGetShadingRateImagePaletteNV(@NativeType("GLuint") int viewport, @NativeType("GLuint") int entry, @NativeType("GLenum *") int[] rate) {
        long __functionAddress = GL.getICD().glGetShadingRateImagePaletteNV;
        if (CHECKS) {
            check(__functionAddress);
            check(rate, 1);
        }
        callPV(viewport, entry, rate, __functionAddress);
    }

    /** Array version of: {@link #glShadingRateSampleOrderCustomNV ShadingRateSampleOrderCustomNV} */
    public static void glShadingRateSampleOrderCustomNV(@NativeType("GLenum") int rate, @NativeType("GLuint") int samples, @NativeType("GLint const *") int[] locations) {
        long __functionAddress = GL.getICD().glShadingRateSampleOrderCustomNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(rate, samples, locations, __functionAddress);
    }

    /** Array version of: {@link #glGetShadingRateSampleLocationivNV GetShadingRateSampleLocationivNV} */
    public static void glGetShadingRateSampleLocationivNV(@NativeType("GLenum") int rate, @NativeType("GLuint") int samples, @NativeType("GLuint") int index, @NativeType("GLint *") int[] location) {
        long __functionAddress = GL.getICD().glGetShadingRateSampleLocationivNV;
        if (CHECKS) {
            check(__functionAddress);
            check(location, 3);
        }
        callPV(rate, samples, index, location, __functionAddress);
    }

}
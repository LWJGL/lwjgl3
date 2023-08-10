/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_raster_multisample.txt">EXT_raster_multisample</a> extension.
 * 
 * <p>This extension allows rendering to a non-multisample color buffer while rasterizing with more than one sample. The result of rasterization (coverage)
 * is available in the gl_SampleMaskIn[] fragment shader input, multisample rasterization is enabled for all primitives, and several per- fragment
 * operations operate at the raster sample rate.</p>
 * 
 * <p>When using the functionality provided by this extension, depth, stencil, and depth bounds tests must be disabled, and a multisample draw framebuffer
 * must not be used.</p>
 * 
 * <p>A fragment's "coverage", or "effective raster samples" is considered to have "N bits" (as opposed to "one bit" corresponding to the single color
 * sample) through the fragment shader, in the sample mask output, through the multisample fragment operations and occlusion query, until the coverage is
 * finally "reduced" to a single bit in a new "Coverage Reduction" stage that occurs before blending.</p>
 * 
 * <p>Requires {@link GLES30 GLES 3.0}.</p>
 */
public class EXTRasterMultisample {

    static { GLES.initialize(); }

    /** Accepted by the {@code cap} parameter of Enable, Disable, IsEnabled. */
    public static final int GL_RASTER_MULTISAMPLE_EXT = 0x9327;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
    public static final int
        GL_RASTER_SAMPLES_EXT                    = 0x9328,
        GL_MAX_RASTER_SAMPLES_EXT                = 0x9329,
        GL_RASTER_FIXED_SAMPLE_LOCATIONS_EXT     = 0x932A,
        GL_MULTISAMPLE_RASTERIZATION_ALLOWED_EXT = 0x932B,
        GL_EFFECTIVE_RASTER_SAMPLES_EXT          = 0x932C;

    protected EXTRasterMultisample() {
        throw new UnsupportedOperationException();
    }

    // --- [ glRasterSamplesEXT ] ---

    public static native void glRasterSamplesEXT(@NativeType("GLuint") int samples, @NativeType("GLboolean") boolean fixedsamplelocations);

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_conservative_raster.txt">NV_conservative_raster</a> extension.
 * 
 * <p>This extension adds a "conservative" rasterization mode where any pixel that is partially covered, even if no sample location is covered, is treated as
 * fully covered and a corresponding fragment will be shaded.</p>
 * 
 * <p>A new control is also added to modify window coordinate snapping precision.</p>
 * 
 * <p>These controls can be used to implement "binning" to a low-resolution render target, for example to determine which tiles of a sparse texture need to
 * be populated. An app can construct a framebuffer where there is one pixel per tile in the sparse texture, and adjust the number of subpixel bits such
 * that snapping occurs to the same effective grid as when rendering to the sparse texture. Then triangles should cover (at least) the same pixels in the
 * low-res framebuffer as they do tiles in the sparse texture.</p>
 */
public class NVConservativeRaster {

    static { GL.initialize(); }

    /** Accepted by the {@code cap} parameter of Enable, Disable, IsEnabled. */
    public static final int GL_CONSERVATIVE_RASTERIZATION_NV = 0x9346;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
    public static final int
        GL_SUBPIXEL_PRECISION_BIAS_X_BITS_NV   = 0x9347,
        GL_SUBPIXEL_PRECISION_BIAS_Y_BITS_NV   = 0x9348,
        GL_MAX_SUBPIXEL_PRECISION_BIAS_BITS_NV = 0x9349;

    protected NVConservativeRaster() {
        throw new UnsupportedOperationException();
    }

    // --- [ glSubpixelPrecisionBiasNV ] ---

    /**
     * Sets the {@link #GL_SUBPIXEL_PRECISION_BIAS_X_BITS_NV SUBPIXEL_PRECISION_BIAS_X_BITS_NV} and {@link #GL_SUBPIXEL_PRECISION_BIAS_Y_BITS_NV SUBPIXEL_PRECISION_BIAS_Y_BITS_NV} values.
     * 
     * <p>The vertex's window x and y coordinates may be optionally converted to fixed-point values with {@code N} fractional bits. If
     * {@link #GL_CONSERVATIVE_RASTERIZATION_NV CONSERVATIVE_RASTERIZATION_NV} is disabled, then {@code N} is the implementation-dependent value of {@link GL11#GL_SUBPIXEL_BITS SUBPIXEL_BITS}. If
     * {@link #GL_CONSERVATIVE_RASTERIZATION_NV CONSERVATIVE_RASTERIZATION_NV} is enabled, {@code N} is computed as the sum of the value of {@link GL11#GL_SUBPIXEL_BITS SUBPIXEL_BITS} and programmable values of
     * {@link #GL_SUBPIXEL_PRECISION_BIAS_X_BITS_NV SUBPIXEL_PRECISION_BIAS_X_BITS_NV} and {@link #GL_SUBPIXEL_PRECISION_BIAS_Y_BITS_NV SUBPIXEL_PRECISION_BIAS_Y_BITS_NV}.</p>
     * 
     * <p>When these values are non-zero, the invariance requirement may not apply because the subpixel precision may not be the same at all window coordinates.</p>
     *
     * @param xbits the {@link #GL_SUBPIXEL_PRECISION_BIAS_X_BITS_NV SUBPIXEL_PRECISION_BIAS_X_BITS_NV} value. The initial value is zero.
     * @param ybits the {@link #GL_SUBPIXEL_PRECISION_BIAS_Y_BITS_NV SUBPIXEL_PRECISION_BIAS_Y_BITS_NV} value. The initial value is zero.
     */
    public static native void glSubpixelPrecisionBiasNV(@NativeType("GLuint") int xbits, @NativeType("GLuint") int ybits);

}
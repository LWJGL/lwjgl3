/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_depth_buffer_float.txt">NV_depth_buffer_float</a> extension.
 * 
 * <p>This extension provides new texture internal formats whose depth components are stored as 32-bit floating-point values, rather than the normalized
 * unsigned integers used in existing depth formats. Floating-point depth textures support all the functionality supported for fixed-point depth textures,
 * including shadow mapping and rendering support via EXT_framebuffer_object. Floating-point depth textures can store values outside the range [0,1].</p>
 * 
 * <p>By default, OpenGL entry points taking depth values implicitly clamp the values to the range [0,1]. This extension provides new DepthClear, DepthRange,
 * and DepthBoundsEXT entry points that allow applications to specify depth values that are not clamped.</p>
 * 
 * <p>Additionally, this extension provides new packed depth/stencil pixel formats (see EXT_packed_depth_stencil) that have 64-bit pixels consisting of a
 * 32-bit floating-point depth value, 8 bits of stencil, and 24 unused bites. A packed depth/stencil texture internal format is also provided.</p>
 * 
 * <p>This extension does not provide support for WGL or GLX pixel formats with floating-point depth buffers. The existing (but not commonly used)
 * WGL_EXT_depth_float extension could be used for this purpose.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}, {@link ARBColorBufferFloat ARB_color_buffer_float}, {@link EXTPackedDepthStencil EXT_packed_depth_stencil} and {@link EXTFramebufferObject EXT_framebuffer_object}.</p>
 */
public class NVDepthBufferFloat {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorageEXT, and
     * returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameterivEXT.
     */
    public static final int
        GL_DEPTH_COMPONENT32F_NV = 0x8DAB,
        GL_DEPTH32F_STENCIL8_NV  = 0x8DAC;

    /**
     * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
     * GetTexImage.
     */
    public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV_NV = 0x8DAD;

    /** Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_DEPTH_BUFFER_FLOAT_MODE_NV = 0x8DAF;

    protected NVDepthBufferFloat() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDepthRangedNV ] ---

    public static native void glDepthRangedNV(@NativeType("GLdouble") double zNear, @NativeType("GLdouble") double zFar);

    // --- [ glClearDepthdNV ] ---

    public static native void glClearDepthdNV(@NativeType("GLdouble") double depth);

    // --- [ glDepthBoundsdNV ] ---

    public static native void glDepthBoundsdNV(@NativeType("GLdouble") double zmin, @NativeType("GLdouble") double zmax);

}
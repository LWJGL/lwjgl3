/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARM/ARM_shader_core_properties.txt">ARM_shader_core_properties</a> extension.
 * 
 * <p>Applications may wish to know and/or control certain GPU shader core properties to select the optimal logic. This extension allows application to query
 * and set the number of active GPU shader cores, and query other shader core properties for the optimal logic and performance profiling, including:</p>
 * 
 * <ul>
 * <li>The maximum number of physical shader cores available on the device;</li>
 * <li>The number of active shader cores specified on the device;</li>
 * <li>A bitfield indicating the presence of shader cores on the device;</li>
 * <li>The maximum warp count per shader core available on the device;</li>
 * <li>The maximum number of pixels output per clock per shader core;</li>
 * <li>The maximum number of texels per clock per shader core;</li>
 * <li>The maximum number of single-precision fused multiply-add operations per clock per shader core;</li>
 * </ul>
 * 
 * <p>Requires {@link GLES32 GLES 3.2}.</p>
 */
public class ARMShaderCoreProperties {

    static { GLES.initialize(); }

    /** New attributes accepted by the {@code pname} argument of {@link GLES20#glGetIntegerv GetIntegerv}, {@link GLES30#glGetInteger64v GetInteger64v}. */
    public static final int
        GL_SHADER_CORE_COUNT_ARM          = 0x96F0,
        GL_SHADER_CORE_ACTIVE_COUNT_ARM   = 0x96F1,
        GL_SHADER_CORE_PRESENT_MASK_ARM   = 0x96F2,
        GL_SHADER_CORE_MAX_WARP_COUNT_ARM = 0x96F3,
        GL_SHADER_CORE_PIXEL_RATE_ARM     = 0x96F4,
        GL_SHADER_CORE_TEXEL_RATE_ARM     = 0x96F5,
        GL_SHADER_CORE_FMA_RATE_ARM       = 0x96F6;

    protected ARMShaderCoreProperties() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMaxActiveShaderCoresARM ] ---

    public static native void glMaxActiveShaderCoresARM(@NativeType("GLuint") int count);

}
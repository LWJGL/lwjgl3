/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class ARMShaderCoreProperties {

    static { GLES.initialize(); }

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

    /** {@code void glMaxActiveShaderCoresARM(GLuint count)} */
    public static native void glMaxActiveShaderCoresARM(@NativeType("GLuint") int count);

}
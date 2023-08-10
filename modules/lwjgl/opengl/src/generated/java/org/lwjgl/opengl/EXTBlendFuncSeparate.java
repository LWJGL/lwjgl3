/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_blend_func_separate.txt">EXT_blend_func_separate</a> extension.
 * 
 * <p>Blending capability is extended by defining a function that allows independent setting of the RGB and alpha blend factors for blend operations that
 * require source and destination blend factors. It is not always desired that the blending used for RGB is also applied to alpha.</p>
 * 
 * <p>Promoted to core in {@link GL14 OpenGL 1.4}.</p>
 */
public class EXTBlendFuncSeparate {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_BLEND_DST_RGB_EXT   = 0x80C8,
        GL_BLEND_SRC_RGB_EXT   = 0x80C9,
        GL_BLEND_DST_ALPHA_EXT = 0x80CA,
        GL_BLEND_SRC_ALPHA_EXT = 0x80CB;

    protected EXTBlendFuncSeparate() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlendFuncSeparateEXT ] ---

    public static native void glBlendFuncSeparateEXT(@NativeType("GLenum") int sfactorRGB, @NativeType("GLenum") int dfactorRGB, @NativeType("GLenum") int sfactorAlpha, @NativeType("GLenum") int dfactorAlpha);

}
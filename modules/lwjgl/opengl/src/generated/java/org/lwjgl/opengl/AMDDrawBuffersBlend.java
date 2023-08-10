/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_draw_buffers_blend.txt">AMD_draw_buffers_blend</a> extension.
 * 
 * <p>This extension builds upon the ARB_draw_buffers and EXT_draw_buffers2 extensions. In ARB_draw_buffers (part of OpenGL 2.0), separate values could be
 * written to each color buffer. This was further enhanced by EXT_draw_buffers2 by adding in the ability to enable blending and to set color write masks
 * independently per color output.</p>
 * 
 * <p>This extension provides the ability to set individual blend equations and blend functions for each color output.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0} and {@link EXTDrawBuffers2 EXT_draw_buffers2}.</p>
 */
public class AMDDrawBuffersBlend {

    static { GL.initialize(); }

    protected AMDDrawBuffersBlend() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlendFuncIndexedAMD ] ---

    public static native void glBlendFuncIndexedAMD(@NativeType("GLuint") int buf, @NativeType("GLenum") int src, @NativeType("GLenum") int dst);

    // --- [ glBlendFuncSeparateIndexedAMD ] ---

    public static native void glBlendFuncSeparateIndexedAMD(@NativeType("GLuint") int buf, @NativeType("GLenum") int srcRGB, @NativeType("GLenum") int dstRGB, @NativeType("GLenum") int srcAlpha, @NativeType("GLenum") int dstAlpha);

    // --- [ glBlendEquationIndexedAMD ] ---

    public static native void glBlendEquationIndexedAMD(@NativeType("GLuint") int buf, @NativeType("GLenum") int mode);

    // --- [ glBlendEquationSeparateIndexedAMD ] ---

    public static native void glBlendEquationSeparateIndexedAMD(@NativeType("GLuint") int buf, @NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha);

}
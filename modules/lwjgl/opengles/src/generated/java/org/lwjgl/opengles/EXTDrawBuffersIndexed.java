/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_draw_buffers_indexed.txt">EXT_draw_buffers_indexed</a> extension.
 * 
 * <p>This extension builds upon the EXT_draw_buffers extension. In EXT_draw_buffers (part of OpenGL ES 3.0), separate values could be written to each color
 * buffer, but the blend enable, blend functions, blend equations and color write masks are global and apply to all color outputs.</p>
 * 
 * <p>This extension provides the ability to independently</p>
 * 
 * <ul>
 * <li>enable or disable blending</li>
 * <li>set the blend equations</li>
 * <li>set the blend functions, and</li>
 * <li>set the color write masks per color output.</li>
 * </ul>
 * 
 * <p>This extension introduces indexed versions of the enable, blend equation, blend function, and color mask commands, as well as associated indexed
 * queries in order to control and query these states independently on a per-color output basis.</p>
 * 
 * <p>Requres {@link GLES30 GLES 3.0} or {@link EXTDrawBuffers EXT_draw_buffers}.</p>
 */
public class EXTDrawBuffersIndexed {

    static { GLES.initialize(); }

    protected EXTDrawBuffersIndexed() {
        throw new UnsupportedOperationException();
    }

    // --- [ glEnableiEXT ] ---

    public static native void glEnableiEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glDisableiEXT ] ---

    public static native void glDisableiEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glBlendEquationiEXT ] ---

    public static native void glBlendEquationiEXT(@NativeType("GLuint") int buf, @NativeType("GLenum") int mode);

    // --- [ glBlendEquationSeparateiEXT ] ---

    public static native void glBlendEquationSeparateiEXT(@NativeType("GLuint") int buf, @NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha);

    // --- [ glBlendFunciEXT ] ---

    public static native void glBlendFunciEXT(@NativeType("GLuint") int buf, @NativeType("GLenum") int src, @NativeType("GLenum") int dst);

    // --- [ glBlendFuncSeparateiEXT ] ---

    public static native void glBlendFuncSeparateiEXT(@NativeType("GLuint") int buf, @NativeType("GLenum") int srcRGB, @NativeType("GLenum") int dstRGB, @NativeType("GLenum") int srcAlpha, @NativeType("GLenum") int dstAlpha);

    // --- [ glColorMaskiEXT ] ---

    public static native void glColorMaskiEXT(@NativeType("GLuint") int index, @NativeType("GLboolean") boolean r, @NativeType("GLboolean") boolean g, @NativeType("GLboolean") boolean b, @NativeType("GLboolean") boolean a);

    // --- [ glIsEnablediEXT ] ---

    @NativeType("GLboolean")
    public static native boolean glIsEnablediEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

}
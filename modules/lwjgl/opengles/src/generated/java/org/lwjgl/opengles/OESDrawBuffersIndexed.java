/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_draw_buffers_indexed.txt">OES_draw_buffers_indexed</a> extension.
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
 */
public class OESDrawBuffersIndexed {

    static { GLES.initialize(); }

    protected OESDrawBuffersIndexed() {
        throw new UnsupportedOperationException();
    }

    // --- [ glEnableiOES ] ---

    public static native void glEnableiOES(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glDisableiOES ] ---

    public static native void glDisableiOES(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glBlendEquationiOES ] ---

    public static native void glBlendEquationiOES(@NativeType("GLuint") int buf, @NativeType("GLenum") int mode);

    // --- [ glBlendEquationSeparateiOES ] ---

    public static native void glBlendEquationSeparateiOES(@NativeType("GLuint") int buf, @NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha);

    // --- [ glBlendFunciOES ] ---

    public static native void glBlendFunciOES(@NativeType("GLuint") int buf, @NativeType("GLenum") int src, @NativeType("GLenum") int dst);

    // --- [ glBlendFuncSeparateiOES ] ---

    public static native void glBlendFuncSeparateiOES(@NativeType("GLuint") int buf, @NativeType("GLenum") int srcRGB, @NativeType("GLenum") int dstRGB, @NativeType("GLenum") int srcAlpha, @NativeType("GLenum") int dstAlpha);

    // --- [ glColorMaskiOES ] ---

    public static native void glColorMaskiOES(@NativeType("GLuint") int index, @NativeType("GLboolean") boolean r, @NativeType("GLboolean") boolean g, @NativeType("GLboolean") boolean b, @NativeType("GLboolean") boolean a);

    // --- [ glIsEnablediOES ] ---

    @NativeType("GLboolean")
    public static native boolean glIsEnablediOES(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

}
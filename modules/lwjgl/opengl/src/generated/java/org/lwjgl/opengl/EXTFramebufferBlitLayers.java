/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_framebuffer_blit_layers.txt">EXT_framebuffer_blit_layers</a> extension.
 * 
 * <p>This extensions defines the behaviour for copying data from one layered framebuffer to another layered framebuffer.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0} or {@link EXTFramebufferBlit EXT_framebuffer_blit}.</p>
 */
public class EXTFramebufferBlitLayers {

    static { GL.initialize(); }

    protected EXTFramebufferBlitLayers() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlitFramebufferLayersEXT ] ---

    public static native void glBlitFramebufferLayersEXT(@NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter);

    // --- [ glBlitFramebufferLayerEXT ] ---

    public static native void glBlitFramebufferLayerEXT(@NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int srcLayer, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLint") int dstLayer, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter);

}
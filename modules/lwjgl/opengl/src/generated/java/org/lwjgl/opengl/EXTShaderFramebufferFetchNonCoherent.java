/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_shader_framebuffer_fetch_non_coherent.txt">EXT_shader_framebuffer_fetch_non_coherent</a> extension.
 * 
 * <p>See {@link EXTShaderFramebufferFetch EXT_shader_framebuffer_fetch}.</p>
 */
public class EXTShaderFramebufferFetchNonCoherent {

    static { GL.initialize(); }

    protected EXTShaderFramebufferFetchNonCoherent() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferFetchBarrierEXT ] ---

    /**
     * Specifies a boundary between passes when reading existing framebuffer data from fragment shaders via the {@code gl_LastFragData} built-in variable.
     * Previous framebuffer object writes regardless of the mechanism (including clears, blits and primitive rendering) are guaranteed to be visible to
     * subsequent fragment shader invocations that read from the framebuffer once {@code FramebufferFetchBarrierEXT} is executed.
     * 
     * <p>If {@code EXT_shader_framebuffer_fetch} is also supported: Because the implementation guarantees coherency of framebuffer reads and writes for color
     * outputs not explicitly marked with the noncoherent layout qualifier, calling the {@code FramebufferFetchBarrierEXT} command is not required unless the
     * application wishes to manage memory ordering of framebuffer reads and writes explicitly, which may provide better performance on some implementations
     * in cases where rendering can be split into multiple passes with non-self-overlapping geometry.</p>
     */
    public static native void glFramebufferFetchBarrierEXT();

}
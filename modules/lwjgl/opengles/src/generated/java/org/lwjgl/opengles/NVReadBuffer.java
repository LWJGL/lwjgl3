/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_read_buffer.txt">NV_read_buffer</a> extension.
 * 
 * <p>Unextended OpenGL ES 2.0 only supports using ReadPixels to read from the default color buffer of the currently-bound framebuffer. However, it is useful
 * for debugging to be able to read from non-default color buffers. Particularly, when the NV_draw_buffers extension is supported, each framebuffer may
 * contain multiple color buffers. This extension provides a mechanism to select which color buffer to read from.</p>
 * 
 * <p>The NV_read_buffer extension adds the command ReadBufferNV, which is used to select which color buffer of the currently-bound framebuffer to use as the
 * source for subsequent calls to ReadPixels, CopyTexImage2D, and CopyTexSubImage2D. If the system-provided framebuffer is bound, then ReadBufferNV
 * accepts value BACK. If a user-created FBO is bound, then ReadBufferNV accepts COLOR_ATTACHMENT0. Additionally, if the NV_draw_buffers extension is
 * supported, ReadBufferNV accepts COLOR_ATTACHMENTn_NV (n is 0 to 15).</p>
 */
public class NVReadBuffer {

    static { GLES.initialize(); }

    /** Accepted by the {@code pname} parameter of GetIntegerv. */
    public static final int GL_READ_BUFFER_NV = 0xC02;

    protected NVReadBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ glReadBufferNV ] ---

    public static native void glReadBufferNV(@NativeType("GLenum") int mode);

}
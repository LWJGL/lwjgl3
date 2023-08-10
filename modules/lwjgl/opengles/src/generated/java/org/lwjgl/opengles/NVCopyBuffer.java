/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_copy_buffer.txt">NV_copy_buffer</a> extension.
 * 
 * <p>This extension provides a mechanism to do an accelerated copy from one buffer object to another. This may be useful to load buffer objects in a
 * "loading thread" while minimizing cost and synchronization effort in the "rendering thread."</p>
 */
public class NVCopyBuffer {

    static { GLES.initialize(); }

    /**
     * Accepted by the target parameters of BindBuffer, BufferData, BufferSubData, MapBufferOES, UnmapBufferOES, GetBufferPointervOES, GetBufferParameteriv and
     * CopyBufferSubDataNV.
     */
    public static final int
        GL_COPY_READ_BUFFER_NV  = 0x8F36,
        GL_COPY_WRITE_BUFFER_NV = 0x8F37;

    protected NVCopyBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCopyBufferSubDataNV ] ---

    public static native void glCopyBufferSubDataNV(@NativeType("GLenum") int readTarget, @NativeType("GLenum") int writeTarget, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size);

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_external_objects_fd.txt">EXT_semaphore_fd</a> extension.
 * 
 * <p>Building upon the OpenGL memory object and semaphore framework defined in <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_external_objects.txt">EXT_external_objects</a> this extension enables an OpenGL
 * application to import a memory object or semaphore from POSIX file descriptor external handles.</p>
 * 
 * <p>Requires {@link EXTSemaphore EXT_semaphore} and {@link ARBTextureStorage ARB_texture_storage} or a version of OpenGL that incorporates it.</p>
 */
public class EXTSemaphoreFD {

    static { GL.initialize(); }

    /** Accepted by the {@code handleType} parameter of {@link #glImportSemaphoreFdEXT ImportSemaphoreFdEXT}. */
    public static final int GL_HANDLE_TYPE_OPAQUE_FD_EXT = 0x9586;

    protected EXTSemaphoreFD() {
        throw new UnsupportedOperationException();
    }

    // --- [ glImportSemaphoreFdEXT ] ---

    public static native void glImportSemaphoreFdEXT(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int handleType, @NativeType("GLint") int fd);

}
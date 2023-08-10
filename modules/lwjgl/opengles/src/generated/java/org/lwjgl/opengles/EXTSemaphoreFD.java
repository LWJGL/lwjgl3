/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_external_objects_fd.txt">EXT_semaphore_fd</a> extension.
 * 
 * <p>Building upon the OpenGL memory object and semaphore framework defined in <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_external_objects.txt">EXT_external_objects</a> this extension enables an OpenGL
 * application to import a memory object or semaphore from POSIX file descriptor external handles.</p>
 * 
 * <p>Requires {@link EXTSemaphore EXT_semaphore} and {@link GLES30 GLES30}.</p>
 */
public class EXTSemaphoreFD {

    static { GLES.initialize(); }

    /** Accepted by the {@code handleType} parameter of ImportMemoryFdEXT() or ImportSemaphoreFdEXT(). */
    public static final int GL_HANDLE_TYPE_OPAQUE_FD_EXT = 0x9586;

    protected EXTSemaphoreFD() {
        throw new UnsupportedOperationException();
    }

    // --- [ glImportSemaphoreFdEXT ] ---

    public static native void glImportSemaphoreFdEXT(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int handleType, @NativeType("GLint") int fd);

}
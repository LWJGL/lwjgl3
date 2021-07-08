/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_external_objects_fd.txt">EXT_memory_object_fd</a> extension.
 * 
 * <p>Building upon the OpenGL memory object and semaphore framework defined in <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_external_objects.txt">EXT_external_objects</a> this extension enables an OpenGL
 * application to import a memory object or semaphore from POSIX file descriptor external handles.</p>
 * 
 * <p>Requires {@link EXTMemoryObject EXT_memory_object} and {@link GLES30 GLES30}.</p>
 */
public class EXTMemoryObjectFD {

    static { GLES.initialize(); }

    /** Accepted by the {@code handleType} parameter of ImportMemoryFdEXT() or ImportSemaphoreFdEXT(). */
    public static final int GL_HANDLE_TYPE_OPAQUE_FD_EXT = 0x9586;

    protected EXTMemoryObjectFD() {
        throw new UnsupportedOperationException();
    }

    // --- [ glImportMemoryFdEXT ] ---

    public static native void glImportMemoryFdEXT(@NativeType("GLuint") int memory, @NativeType("GLuint64") long size, @NativeType("GLenum") int handleType, @NativeType("GLint") int fd);

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class EXTSemaphoreFD {

    static { GLES.initialize(); }

    public static final int GL_HANDLE_TYPE_OPAQUE_FD_EXT = 0x9586;

    protected EXTSemaphoreFD() {
        throw new UnsupportedOperationException();
    }

    // --- [ glImportSemaphoreFdEXT ] ---

    /** {@code void glImportSemaphoreFdEXT(GLuint semaphore, GLenum handleType, GLint fd)} */
    public static native void glImportSemaphoreFdEXT(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int handleType, @NativeType("GLint") int fd);

}
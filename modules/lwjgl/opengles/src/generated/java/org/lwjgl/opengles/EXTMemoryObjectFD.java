/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class EXTMemoryObjectFD {

    static { GLES.initialize(); }

    public static final int GL_HANDLE_TYPE_OPAQUE_FD_EXT = 0x9586;

    protected EXTMemoryObjectFD() {
        throw new UnsupportedOperationException();
    }

    // --- [ glImportMemoryFdEXT ] ---

    /** {@code void glImportMemoryFdEXT(GLuint memory, GLuint64 size, GLenum handleType, GLint fd)} */
    public static native void glImportMemoryFdEXT(@NativeType("GLuint") int memory, @NativeType("GLuint64") long size, @NativeType("GLenum") int handleType, @NativeType("GLint") int fd);

}
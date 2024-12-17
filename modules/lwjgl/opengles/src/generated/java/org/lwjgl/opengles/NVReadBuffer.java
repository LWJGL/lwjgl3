/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class NVReadBuffer {

    static { GLES.initialize(); }

    public static final int GL_READ_BUFFER_NV = 0xC02;

    protected NVReadBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ glReadBufferNV ] ---

    /** {@code void glReadBufferNV(GLenum mode)} */
    public static native void glReadBufferNV(@NativeType("GLenum") int mode);

}
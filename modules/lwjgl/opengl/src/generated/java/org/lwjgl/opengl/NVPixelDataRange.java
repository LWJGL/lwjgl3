/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public class NVPixelDataRange {

    static { GL.initialize(); }

    public static final int
        GL_WRITE_PIXEL_DATA_RANGE_NV = 0x8878,
        GL_READ_PIXEL_DATA_RANGE_NV  = 0x8879;

    public static final int
        GL_WRITE_PIXEL_DATA_RANGE_LENGTH_NV = 0x887A,
        GL_READ_PIXEL_DATA_RANGE_LENGTH_NV  = 0x887B;

    public static final int
        GL_WRITE_PIXEL_DATA_RANGE_POINTER_NV = 0x887C,
        GL_READ_PIXEL_DATA_RANGE_POINTER_NV  = 0x887D;

    protected NVPixelDataRange() {
        throw new UnsupportedOperationException();
    }

    // --- [ glPixelDataRangeNV ] ---

    /** {@code void glPixelDataRangeNV(GLenum target, GLsizei length, void const * pointer)} */
    public static native void nglPixelDataRangeNV(int target, int length, long pointer);

    /** {@code void glPixelDataRangeNV(GLenum target, GLsizei length, void const * pointer)} */
    public static void glPixelDataRangeNV(@NativeType("GLenum") int target, @NativeType("void const *") ByteBuffer pointer) {
        nglPixelDataRangeNV(target, pointer.remaining(), memAddress(pointer));
    }

    // --- [ glFlushPixelDataRangeNV ] ---

    /** {@code void glFlushPixelDataRangeNV(GLenum target)} */
    public static native void glFlushPixelDataRangeNV(@NativeType("GLenum") int target);

}
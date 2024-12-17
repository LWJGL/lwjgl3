/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTTextureStorageCompression {

    static { GLES.initialize(); }

    public static final int GL_SURFACE_COMPRESSION_EXT = 0x96C0;

    public static final int GL_NUM_SURFACE_COMPRESSION_FIXED_RATES_EXT = 0x8F6E;

    public static final int
        GL_SURFACE_COMPRESSION_FIXED_RATE_NONE_EXT    = 0x96C1,
        GL_SURFACE_COMPRESSION_FIXED_RATE_DEFAULT_EXT = 0x96C2,
        GL_SURFACE_COMPRESSION_FIXED_RATE_1BPC_EXT    = 0x96C4,
        GL_SURFACE_COMPRESSION_FIXED_RATE_2BPC_EXT    = 0x96C5,
        GL_SURFACE_COMPRESSION_FIXED_RATE_3BPC_EXT    = 0x96C6,
        GL_SURFACE_COMPRESSION_FIXED_RATE_4BPC_EXT    = 0x96C7,
        GL_SURFACE_COMPRESSION_FIXED_RATE_5BPC_EXT    = 0x96C8,
        GL_SURFACE_COMPRESSION_FIXED_RATE_6BPC_EXT    = 0x96C9,
        GL_SURFACE_COMPRESSION_FIXED_RATE_7BPC_EXT    = 0x96CA,
        GL_SURFACE_COMPRESSION_FIXED_RATE_8BPC_EXT    = 0x96CB,
        GL_SURFACE_COMPRESSION_FIXED_RATE_9BPC_EXT    = 0x96CC,
        GL_SURFACE_COMPRESSION_FIXED_RATE_10BPC_EXT   = 0x96CD,
        GL_SURFACE_COMPRESSION_FIXED_RATE_11BPC_EXT   = 0x96CE,
        GL_SURFACE_COMPRESSION_FIXED_RATE_12BPC_EXT   = 0x96CF;

    protected EXTTextureStorageCompression() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexStorageAttribs2DEXT ] ---

    /** {@code void glTexStorageAttribs2DEXT(GLenum target, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height, GLint const * attrib_list)} */
    public static native void nglTexStorageAttribs2DEXT(int target, int levels, int internalformat, int width, int height, long attrib_list);

    /** {@code void glTexStorageAttribs2DEXT(GLenum target, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height, GLint const * attrib_list)} */
    public static void glTexStorageAttribs2DEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint const *") @Nullable IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list);
        }
        nglTexStorageAttribs2DEXT(target, levels, internalformat, width, height, memAddressSafe(attrib_list));
    }

    // --- [ glTexStorageAttribs3DEXT ] ---

    /** {@code void glTexStorageAttribs3DEXT(GLenum target, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint const * attrib_list)} */
    public static native void nglTexStorageAttribs3DEXT(int target, int levels, int internalformat, int width, int height, int depth, long attrib_list);

    /** {@code void glTexStorageAttribs3DEXT(GLenum target, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint const * attrib_list)} */
    public static void glTexStorageAttribs3DEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint const *") @Nullable IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list);
        }
        nglTexStorageAttribs3DEXT(target, levels, internalformat, width, height, depth, memAddressSafe(attrib_list));
    }

    /** {@code void glTexStorageAttribs2DEXT(GLenum target, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height, GLint const * attrib_list)} */
    public static void glTexStorageAttribs2DEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint const *") int @Nullable [] attrib_list) {
        long __functionAddress = GLES.getICD().glTexStorageAttribs2DEXT;
        if (CHECKS) {
            check(__functionAddress);
            checkNTSafe(attrib_list);
        }
        callPV(target, levels, internalformat, width, height, attrib_list, __functionAddress);
    }

    /** {@code void glTexStorageAttribs3DEXT(GLenum target, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint const * attrib_list)} */
    public static void glTexStorageAttribs3DEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint const *") int @Nullable [] attrib_list) {
        long __functionAddress = GLES.getICD().glTexStorageAttribs3DEXT;
        if (CHECKS) {
            check(__functionAddress);
            checkNTSafe(attrib_list);
        }
        callPV(target, levels, internalformat, width, height, depth, attrib_list, __functionAddress);
    }

}
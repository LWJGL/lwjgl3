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

public class EXTEGLImageStorage {

    static { GLES.initialize(); }

    protected EXTEGLImageStorage() {
        throw new UnsupportedOperationException();
    }

    // --- [ glEGLImageTargetTexStorageEXT ] ---

    /** {@code void glEGLImageTargetTexStorageEXT(GLenum target, GLeglImageOES image, int const * attrib_list)} */
    public static native void nglEGLImageTargetTexStorageEXT(int target, long image, long attrib_list);

    /** {@code void glEGLImageTargetTexStorageEXT(GLenum target, GLeglImageOES image, int const * attrib_list)} */
    public static void glEGLImageTargetTexStorageEXT(@NativeType("GLenum") int target, @NativeType("GLeglImageOES") long image, @NativeType("int const *") @Nullable IntBuffer attrib_list) {
        if (CHECKS) {
            check(image);
            checkNTSafe(attrib_list);
        }
        nglEGLImageTargetTexStorageEXT(target, image, memAddressSafe(attrib_list));
    }

    // --- [ glEGLImageTargetTextureStorageEXT ] ---

    /** {@code void glEGLImageTargetTextureStorageEXT(GLuint texture, GLeglImageOES image, int const * attrib_list)} */
    public static native void nglEGLImageTargetTextureStorageEXT(int texture, long image, long attrib_list);

    /** {@code void glEGLImageTargetTextureStorageEXT(GLuint texture, GLeglImageOES image, int const * attrib_list)} */
    public static void glEGLImageTargetTextureStorageEXT(@NativeType("GLuint") int texture, @NativeType("GLeglImageOES") long image, @NativeType("int const *") @Nullable IntBuffer attrib_list) {
        if (CHECKS) {
            check(image);
            checkNTSafe(attrib_list);
        }
        nglEGLImageTargetTextureStorageEXT(texture, image, memAddressSafe(attrib_list));
    }

    /** {@code void glEGLImageTargetTexStorageEXT(GLenum target, GLeglImageOES image, int const * attrib_list)} */
    public static void glEGLImageTargetTexStorageEXT(@NativeType("GLenum") int target, @NativeType("GLeglImageOES") long image, @NativeType("int const *") int @Nullable [] attrib_list) {
        long __functionAddress = GLES.getICD().glEGLImageTargetTexStorageEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(image);
            checkNTSafe(attrib_list);
        }
        callPPV(target, image, attrib_list, __functionAddress);
    }

    /** {@code void glEGLImageTargetTextureStorageEXT(GLuint texture, GLeglImageOES image, int const * attrib_list)} */
    public static void glEGLImageTargetTextureStorageEXT(@NativeType("GLuint") int texture, @NativeType("GLeglImageOES") long image, @NativeType("int const *") int @Nullable [] attrib_list) {
        long __functionAddress = GLES.getICD().glEGLImageTargetTextureStorageEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(image);
            checkNTSafe(attrib_list);
        }
        callPPV(texture, image, attrib_list, __functionAddress);
    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_EGL_image_storage.txt">EXT_EGL_image_storage</a> extension.
 * 
 * <p>The OpenGL ES extension {@code OES_EGL_image} provides a mechanism for creating GL textures sharing storage with {@code EGLImage} objects (in other
 * words, creating GL texture {@code EGLImage} targets). The extension was written against the OpenGL ES 2.0 specification, which does not have the
 * concept of immutable textures. As a result, it specifies that respecification of a texture by calling {@code TexImage*} on a texture that is an
 * {@code EGLImage} target causes it to be implicitly orphaned. In most cases, this is not the desired behavior, but rather a result of an application
 * error.</p>
 * 
 * <p>This extension provides a mechanism for creating texture objects that are both {@code EGLImage} targets and immutable. Since immutable textures cannot
 * be respecified, they also cannot accidentally be orphaned, and attempts to do so generate errors instead of resulting in well-defined, but often
 * undesirable and surprising behavior. It provides a strong guarantee that texture data that is intended to be shared will remain shared.</p>
 * 
 * <p>Requires {@link GL42 OpenGL 4.2} or {@link ARBTextureStorage ARB_texture_storage}. Requires EGL 1.4 and either the {@code EGL_KHR_image} or {@code EGL_KHR_image_base} extensions.</p>
 */
public class EXTEGLImageStorage {

    static { GL.initialize(); }

    protected EXTEGLImageStorage() {
        throw new UnsupportedOperationException();
    }

    // --- [ glEGLImageTargetTexStorageEXT ] ---

    public static native void nglEGLImageTargetTexStorageEXT(int target, long image, long attrib_list);

    public static void glEGLImageTargetTexStorageEXT(@NativeType("GLenum") int target, @NativeType("GLeglImageOES") long image, @Nullable @NativeType("int const *") IntBuffer attrib_list) {
        if (CHECKS) {
            check(image);
            checkNTSafe(attrib_list);
        }
        nglEGLImageTargetTexStorageEXT(target, image, memAddressSafe(attrib_list));
    }

    // --- [ glEGLImageTargetTextureStorageEXT ] ---

    public static native void nglEGLImageTargetTextureStorageEXT(int texture, long image, long attrib_list);

    public static void glEGLImageTargetTextureStorageEXT(@NativeType("GLuint") int texture, @NativeType("GLeglImageOES") long image, @Nullable @NativeType("int const *") IntBuffer attrib_list) {
        if (CHECKS) {
            check(image);
            checkNTSafe(attrib_list);
        }
        nglEGLImageTargetTextureStorageEXT(texture, image, memAddressSafe(attrib_list));
    }

    /** Array version of: {@link #glEGLImageTargetTexStorageEXT EGLImageTargetTexStorageEXT} */
    public static void glEGLImageTargetTexStorageEXT(@NativeType("GLenum") int target, @NativeType("GLeglImageOES") long image, @Nullable @NativeType("int const *") int[] attrib_list) {
        long __functionAddress = GL.getICD().glEGLImageTargetTexStorageEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(image);
            checkNTSafe(attrib_list);
        }
        callPPV(target, image, attrib_list, __functionAddress);
    }

    /** Array version of: {@link #glEGLImageTargetTextureStorageEXT EGLImageTargetTextureStorageEXT} */
    public static void glEGLImageTargetTextureStorageEXT(@NativeType("GLuint") int texture, @NativeType("GLeglImageOES") long image, @Nullable @NativeType("int const *") int[] attrib_list) {
        long __functionAddress = GL.getICD().glEGLImageTargetTextureStorageEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(image);
            checkNTSafe(attrib_list);
        }
        callPPV(texture, image, attrib_list, __functionAddress);
    }

}
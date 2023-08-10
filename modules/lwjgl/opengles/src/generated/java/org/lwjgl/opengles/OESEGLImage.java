/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_EGL_image.txt">OES_EGL_image</a> extension.
 * 
 * <p>This extension provides a mechanism for creating texture and renderbuffer objects sharing storage with specified EGLImage objects (such objects are
 * referred to as "EGLImage targets").</p>
 * 
 * <p>The companion EGL_KHR_image_base and EGL_KHR_image extensions provide the definition and rationale for EGLImage objects.</p>
 * 
 * <p>Other EGL extensions, such as EGL_KHR_gl_texture_2D_image, EGL_KHR_gl_texture_cubemap_image, EGL_KHR_gl_texture_3D_image,
 * EGL_KHR_gl_renderbuffer_image, and EGL_KHR_vg_parent_image, define the related functionality of creating EGLImage objects from "EGLImage sources" such
 * as OpenGL ES texture or renderbuffers or OpenVG VGImage objects.</p>
 */
public class OESEGLImage {

    static { GLES.initialize(); }

    protected OESEGLImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ glEGLImageTargetTexture2DOES ] ---

    public static native void nglEGLImageTargetTexture2DOES(int target, long image);

    public static void glEGLImageTargetTexture2DOES(@NativeType("GLenum") int target, @NativeType("GLeglImageOES") long image) {
        if (CHECKS) {
            check(image);
        }
        nglEGLImageTargetTexture2DOES(target, image);
    }

    // --- [ glEGLImageTargetRenderbufferStorageOES ] ---

    public static native void nglEGLImageTargetRenderbufferStorageOES(int target, long image);

    public static void glEGLImageTargetRenderbufferStorageOES(@NativeType("GLenum") int target, @NativeType("GLeglImageOES") long image) {
        if (CHECKS) {
            check(image);
        }
        nglEGLImageTargetRenderbufferStorageOES(target, image);
    }

}
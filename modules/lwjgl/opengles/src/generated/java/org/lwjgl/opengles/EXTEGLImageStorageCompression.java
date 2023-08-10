/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_EGL_image_storage_compression.txt">EXT_EGL_image_storage_compression</a> extension.
 * 
 * <p>Applications may wish to take advantage of framebuffer compression. Some platforms may support framebuffer compression at fixed bitrates. Such
 * compression algorithms generally produce results that are visually lossless, but the results are typically not bit-exact when compared to a
 * non-compressed result.</p>
 * 
 * <p>This extension enables applications to specify a texture by taking all properties from a fixed-rate compressed {@code EGLImage}.</p>
 * 
 * <p>Requires {@link GLES30 GLES 3.0} and {@link EXTEGLImageStorage EXT_EGL_image_storage}.</p>
 */
public final class EXTEGLImageStorageCompression {

    /** New attributes accepted by the {@code attrib_list} argument of {@link EXTEGLImageStorage#glEGLImageTargetTexStorageEXT EGLImageTargetTexStorageEXT}. */
    public static final int GL_SURFACE_COMPRESSION_EXT = 0x96C0;

    /** Accepted as attribute values for {@link #GL_SURFACE_COMPRESSION_EXT SURFACE_COMPRESSION_EXT} by {@link EXTEGLImageStorage#glEGLImageTargetTexStorageEXT EGLImageTargetTexStorageEXT}. */
    public static final int
        GL_SURFACE_COMPRESSION_FIXED_RATE_NONE_EXT    = 0x96C1,
        GL_SURFACE_COMPRESSION_FIXED_RATE_DEFAULT_EXT = 0x96C2;

    private EXTEGLImageStorageCompression() {}

}
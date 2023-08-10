/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_image_implicit_sync_control.txt">EXT_image_implicit_sync_control</a> extension.
 * 
 * <p>This extension allows a client to selectively use implicit or explicit synchronization mechanisms when addressing externally-imported
 * {@code EGLImages}. A new token is added to {@code EGLImage} creation which allows the client to select whether a platform's implicit synchronization
 * will be in use for a buffer imported into {@code EGLImage}.</p>
 * 
 * <p>Heterogeneous systems (supporting multiple APIs, mixed legacy/updated clients, etc) already supporting implicit synchronization, may not be able to
 * change to explict synchronization in a single switch. This extension allows synchronization to be controlled on a per-buffer basis, so explicit
 * synchronization can be enabled for a complete pipeline which supports it, or implicit synchronization used otherwise.</p>
 * 
 * <p>Requires {@link EGL12 EGL 1.2}, {@link KHRImageBase KHR_image_base} and {@link EXTImageDMABufImport EXT_image_dma_buf_import}.</p>
 */
public final class EXTImageImplicitSyncControl {

    /** Accepted as an attribute in the {@code attrib_list} parameter of {@link KHRImageBase#eglCreateImageKHR CreateImageKHR}. */
    public static final int EGL_IMPORT_SYNC_TYPE_EXT = 0x3470;

    /** Accepted as the value for the {@link #EGL_IMPORT_SYNC_TYPE_EXT IMPORT_SYNC_TYPE_EXT} attribute. */
    public static final int
        EGL_IMPORT_IMPLICIT_SYNC_EXT = 0x3471,
        EGL_IMPORT_EXPLICIT_SYNC_EXT = 0x3472;

    private EXTImageImplicitSyncControl() {}

}
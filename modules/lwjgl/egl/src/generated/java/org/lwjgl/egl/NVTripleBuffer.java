/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NV/EGL_NV_triple_buffer.txt">NV_triple_buffer</a> extension.
 * 
 * <p>Allows applications to request additional back buffers, in order to produce greater and less variable frame rates.</p>
 */
public final class NVTripleBuffer {

    /** Accepted as a value for {@link EGL12#EGL_RENDER_BUFFER RENDER_BUFFER} in the {@code attrib_list} parameter of {@link EGL10#eglCreateWindowSurface CreateWindowSurface}. */
    public static final int EGL_TRIPLE_BUFFER_NV = 0x3230;

    private NVTripleBuffer() {}

}
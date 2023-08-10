/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/KHR/EGL_KHR_create_context_no_error.txt">KHR_create_context_no_error</a> extension.
 * 
 * <p>This extension allows the creation of an OpenGL or OpenGL ES context that doesn't generate errors if the context supports a no error mode. The
 * implications of this feature are discussed in the {@link org.lwjgl.opengl.KHRNoError GL_KHR_no_error} extension.</p>
 * 
 * <p>Requires {@link EGL14 EGL 1.4}.</p>
 */
public final class KHRCreateContextNoError {

    public static final int EGL_CONTEXT_OPENGL_NO_ERROR_KHR = 0x31B3;

    private KHRCreateContextNoError() {}

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_protected_content.txt">EXT_protected_content</a> extension.
 * 
 * <p>This extension introduces the concept of protected contexts and protected resources, specifically surfaces and {@code EGLImages}. Applications can
 * choose at creation time whether a context, surface or {@code EGLImage} is protected or not.</p>
 * 
 * <p>A protected context is required to allow the GPU to operate on protected resources, including protected surfaces and protected {@code EGLImages}.</p>
 * 
 * <p>An explanation of undefined behavior in this extension: Several places in this extension mention undefined behavior can result, which can include
 * program termination. The reason for this is because one way to handle protected content is by using a protected virtual to physical memory translation
 * layer. With this sort of solution a system may generate read or write faults when a non-protected source tries to access a protected buffer. Depending
 * on the system these faults might be ignored or they might cause process termination. This undefined behavior should not include actually allowing a
 * transfer of data from a protected surface to a non-protected surface.</p>
 * 
 * <p>Requires {@link EGL14 EGL 1.4}.</p>
 */
public final class EXTProtectedContent {

    /**
     * Accepted as an attribute name in the {@code attrib_list} parameter of {@link EGL10#eglCreateContext CreateContext}, {@link EGL10#eglCreateWindowSurface CreateWindowSurface}, and {@link KHRImageBase#eglCreateImageKHR CreateImageKHR}; and as an
     * parameter of {@link EGL10#eglQuerySurface QuerySurface} and {@link EGL10#eglQueryContext QueryContext}.
     */
    public static final int EGL_PROTECTED_CONTENT_EXT = 0x32C0;

    private EXTProtectedContent() {}

}
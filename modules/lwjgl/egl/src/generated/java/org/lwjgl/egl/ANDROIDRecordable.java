/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/ANDROID/EGL_ANDROID_recordable.txt">ANDROID_recordable</a> extension.
 * 
 * <p>Android supports a number of different ANativeWindow implementations that can be used to create an EGLSurface. One implementation, which records the
 * rendered image as a video each time eglSwapBuffers gets called, may have some device-specific restrictions. Because of this, some EGLConfigs may be
 * incompatible with these ANativeWindows. This extension introduces a new boolean EGLConfig attribute that indicates whether the EGLConfig supports
 * rendering to an ANativeWindow that records images to a video.</p>
 */
public final class ANDROIDRecordable {

    public static final int EGL_RECORDABLE_ANDROID = 0x3142;

    private ANDROIDRecordable() {}

}
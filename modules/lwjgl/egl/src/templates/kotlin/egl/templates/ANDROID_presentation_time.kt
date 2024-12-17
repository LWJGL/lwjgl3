/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val ANDROID_presentation_time = "ANDROIDPresentationTime".nativeClassEGL("ANDROID_presentation_time", postfix = ANDROID) {
    EGLBoolean(
        "PresentationTimeANDROID",

        EGLDisplay("dpy"),
        EGLSurface("surface"),
        EGLnsecsANDROID("time")
    )
}
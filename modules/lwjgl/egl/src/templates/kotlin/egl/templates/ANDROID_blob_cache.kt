/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val ANDROID_blob_cache = "ANDROIDBlobCache".nativeClassEGL("ANDROID_blob_cache", postfix = ANDROID) {
    void(
        "SetBlobCacheFuncsANDROID",

        EGLDisplay("dpy"),
        EGLSetBlobFuncANDROID("set"),
        EGLGetBlobFuncANDROID("get")
    )
}
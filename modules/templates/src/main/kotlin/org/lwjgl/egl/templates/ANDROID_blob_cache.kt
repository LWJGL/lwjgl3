/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val ANDROID_blob_cache = "ANDROIDBlobCache".nativeClassEGL("ANDROID_blob_cache", postfix = ANDROID) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Shader compilation and optimization has been a troublesome aspect of OpenGL programming for a long time. It can consume seconds of CPU cycles during
        application start-up. Additionally, state-based re-compiles done internally by the drivers add an unpredictable element to application performance
        tuning, often leading to occasional pauses in otherwise smooth animations.

        This extension provides a mechanism through which client API implementations may cache shader binaries after they are compiled. It may then retrieve
        those cached shaders during subsequent executions of the same program. The management of the cache is handled by the application (or middleware),
        allowing it to be tuned to a particular platform or environment.

        While the focus of this extension is on providing a persistent cache for shader binaries, it may also be useful for caching other data. This is
        perfectly acceptable, but the guarantees provided (or lack thereof) were designed around the shader use case.

        Note that although this extension is written as if the application implements the caching functionality, on the Android OS it is implemented as part of
        the Android EGL module. This extension is not exposed to applications on Android, but will be used automatically in every application that uses EGL if
        it is supported by the underlying device-specific EGL implementation.
        """

    void(
        "SetBlobCacheFuncsANDROID",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLSetBlobFuncANDROID.IN("set", ""),
        EGLGetBlobFuncANDROID.IN("get", "")
    )
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.android.templates

import org.lwjgl.generator.*
import org.lwjgl.system.android.*

val NativeWindow = "ANativeWindow".nativeClass(ANDROID_PACKAGE, prefixMethod = "ANativeWindow_", binding = simpleBinding("android")) {
    nativeImport("<android/native_window_jni.h>")
    javaImport("android.view.Surface")

    documentation = "Native bindings to <android/native_window_jni.h>."

    EnumConstant(
        "",

        "WINDOW_FORMAT_RGBA_8888".."1",
        "WINDOW_FORMAT_RGBX_8888".."2",
        "WINDOW_FORMAT_RGB_565".."4"
    )

    ANativeWindow_p(
        "fromSurface",
        "",

        JNI_ENV,
        Surface.IN("surface", "")
    )

    void(
        "acquire",
        "Acquire a reference on the given {@code ANativeWindow_p} object. This prevents the object from being deleted until the reference is removed.",

        ANativeWindow_p.IN("window", "")
    )

    void(
        "release",
        "Remove a reference that was previously acquired with #acquire().",

        ANativeWindow_p.IN("window", "")
    )

    int32_t(
        "getWidth",
        "Return the current width in pixels of the window surface. Returns a negative value on error.",

        ANativeWindow_p.IN("window", "")
    )

    int32_t(
        "getHeight",
        "Return the current height in pixels of the window surface. Returns a negative value on error.",

        ANativeWindow_p.IN("window", "")
    )

    int32_t(
        "getFormat",
        "Return the current pixel format of the window surface. Returns a negative value on error.",

        ANativeWindow_p.IN("window", "")
    )

    int32_t(
        "setBuffersGeometry",
        """
        Change the format and size of the window buffers.

        The width and height control the number of pixels in the buffers, not the dimensions of the window on screen. If these are different than the window's
        physical size, then it buffer will be scaled to match that size when compositing it to the screen.

        For all of these parameters, if 0 is supplied then the window's base value will come back in force.

        {@code width} and {@code height} must be either both zero or both non-zero.
        """,

        ANativeWindow_p.IN("window", ""),
        int32_t.IN("width", ""),
        int32_t.IN("height", ""),
        int32_t.IN("format", "")
    )

    int32_t(
        "lock",
        """
        Lock the window's next drawing surface for writing.

        {@code inOutDirtyBounds} is used as an in/out parameter, upon entering the function, it contains the dirty region, that is, the region the caller
        intends to redraw. When the function returns, {@code inOutDirtyBounds} is updated with the actual area the caller needs to redraw -- this region is
        often extended by #lock().
        """,

        ANativeWindow_p.IN("window", ""),
        ANativeWindow_Buffer_p.OUT("outBuffer", ""),
        ARect_p.INOUT("inOutDirtyBounds", "")
    )

    int32_t(
        "unlockAndPost",
        "Unlock the window's drawing surface after previously locking it, posting the new buffer to the display.",

        ANativeWindow_p.IN("window", "")
    )
}
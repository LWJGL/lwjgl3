/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package jawt

import org.lwjgl.generator.*
import core.jni.*
import core.linux.*
import core.windows.*

val JAWT_Rectangle = struct(Module.JAWT, "JAWTRectangle", nativeName = "JAWT_Rectangle") {
    jint("x")
    jint("y")
    jint("width")
    jint("height")
}

val JAWT_DrawingSurface = struct(Module.JAWT, "JAWTDrawingSurface", nativeName = "JAWT_DrawingSurface", mutable = false) {
    "JNIEnv".opaque.p("env")
    jobject_p("target")
    opaque_p("Lock")
    opaque_p("GetDrawingSurfaceInfo")
    opaque_p("FreeDrawingSurfaceInfo")
    opaque_p("Unlock")
}

val JAWT_DrawingSurfaceInfo = struct(Module.JAWT, "JAWTDrawingSurfaceInfo", nativeName = "JAWT_DrawingSurfaceInfo", mutable = false) {
    opaque_p("platformInfo")
    JAWT_DrawingSurface.p("ds")
    JAWT_Rectangle("bounds")
    AutoSize("clip")..jint("clipSize")
    JAWT_Rectangle.p("clip")
}

val JAWT = struct(Module.JAWT, "JAWT", skipBuffer = true, mutable = false) {
    jint("version").mutable()
    nullable..opaque_p("GetDrawingSurface")
    nullable..opaque_p("FreeDrawingSurface")
    nullable..opaque_p("Lock")
    nullable..opaque_p("Unlock")
    nullable..opaque_p("GetComponent")
    nullable..opaque_p("CreateEmbeddedFrame")
    nullable..opaque_p("SetBounds")
    nullable..opaque_p("SynthesizeWindowActivation")
}

val Component = java.awt.Component::class.jobject
val Frame = java.awt.Frame::class.jobject

fun config() {
    struct(Module.JAWT, "JAWTX11DrawingSurfaceInfo", nativeName = "JAWT_X11DrawingSurfaceInfo", mutable = false) {
        Drawable("drawable")
        Display.p("display")
        VisualID("visualID")
        Colormap("colormapID")
        int("depth")
    }

    struct(Module.JAWT, "JAWTWin32DrawingSurfaceInfo", nativeName = "JAWT_Win32DrawingSurfaceInfo", mutable = false) {
        javaImport("org.lwjgl.system.windows.User32")

        union {
            HWND("hwnd")
            HBITMAP("hbitmap")
            void.p("pbits")
        }
        HDC("hdc")
        HPALETTE("hpalette")
    }
}
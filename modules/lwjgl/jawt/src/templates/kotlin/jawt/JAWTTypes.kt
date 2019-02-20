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
    documentation = "Structure for a native rectangle."

    jint("x", "the rectangle X axis coordinate")
    jint("y", "the rectangle Y axis coordinate")
    jint("width", "the rectangle width")
    jint("height", "the rectangle height")
}

val JAWT_DrawingSurface = struct(Module.JAWT, "JAWTDrawingSurface", nativeName = "JAWT_DrawingSurface", mutable = false) {
    documentation =
        """
        Structure for containing the underlying drawing information of a component.

        All operations on a JAWT_DrawingSurface MUST be performed from the same thread as the call to {@code GetDrawingSurface}.
        """

    "JNIEnv".opaque.p(
        "env",
        """
        Cached reference to the Java environment of the calling thread.

        If Lock(), Unlock(), GetDrawingSurfaceInfo() or FreeDrawingSurfaceInfo() are called from a different thread, this data member should be set before
        calling those functions.
        """
    )
    jobject_p("target", "Cached reference to the target object.")
    opaque_p("Lock", "")
    opaque_p("GetDrawingSurfaceInfo", "")
    opaque_p("FreeDrawingSurfaceInfo", "")
    opaque_p("Unlock", "")
}

val JAWT_DrawingSurfaceInfo = struct(Module.JAWT, "JAWTDrawingSurfaceInfo", nativeName = "JAWT_DrawingSurfaceInfo", mutable = false) {
    opaque_p(
        "platformInfo",
        """
        Pointer to the platform-specific information. This can be safely cast to a {@code JAWT_Win32DrawingSurfaceInfo} on Windows or a
        {@code JAWT_X11DrawingSurfaceInfo} on Solaris. On Mac OS X this is a pointer to a {@code NSObject} that conforms to the {@code JAWT_SurfaceLayers}
        protocol.
        """
    )
    JAWT_DrawingSurface.p("ds", "Cached pointer to the underlying drawing surface.")
    JAWT_Rectangle("bounds", "Bounding rectangle of the drawing surface.")
    AutoSize("clip")..jint("clipSize", "Number of rectangles in the clip.")
    JAWT_Rectangle.p("clip", "Clip rectangle array.")
}

val JAWT = struct(Module.JAWT, "JAWT", skipBuffer = true, mutable = false) {
    documentation = "Structure for containing native AWT functions."

    jint("version", "Version of this structure. This must always be set before calling JAWT_GetAWT()").mutable()
    nullable..opaque_p("GetDrawingSurface", "")
    nullable..opaque_p("FreeDrawingSurface", "")
    nullable..opaque_p("Lock", "")
    nullable..opaque_p("Unlock", "")
    nullable..opaque_p("GetComponent", "")
    nullable..opaque_p("CreateEmbeddedFrame", "")
    nullable..opaque_p("SetBounds", "")
    nullable..opaque_p("SynthesizeWindowActivation", "")
}

val Component = java.awt.Component::class.jobject
val Frame = java.awt.Frame::class.jobject

fun config() {
    struct(Module.JAWT, "JAWTX11DrawingSurfaceInfo", nativeName = "JAWT_X11DrawingSurfaceInfo", mutable = false) {
        documentation = "X11-specific declarations for AWT native interface."

        Drawable("drawable", "the drawable")
        Display.p("display", "the connection to the X server")
        VisualID("visualID", "the VisualID")
        Colormap("colormapID", "the colormap")
        int("depth", "the depth")
    }

    struct(Module.JAWT, "JAWTWin32DrawingSurfaceInfo", nativeName = "JAWT_Win32DrawingSurfaceInfo", mutable = false) {
        javaImport("org.lwjgl.system.windows.User32")

        documentation = "Win32-specific declarations for AWT native interface."

        union {
            HWND("hwnd", "the native window handle")
            HBITMAP("hbitmap", "the DDB handle")
            void.p("pbits", "the DIB handle")
        }
        HDC(
            "hdc",
            "the device context handle. This HDC should always be used instead of the HDC returned from {@code BeginPaint()} or any calls to User32#GetDC()."
        )
        HPALETTE("hpalette", "the palette handle")
    }
}
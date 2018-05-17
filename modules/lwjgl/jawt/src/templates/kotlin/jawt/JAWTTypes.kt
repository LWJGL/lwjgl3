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

    jint.member("x", "the rectangle X axis coordinate")
    jint.member("y", "the rectangle Y axis coordinate")
    jint.member("width", "the rectangle width")
    jint.member("height", "the rectangle height")
}

val JAWT_DrawingSurface = struct(Module.JAWT, "JAWTDrawingSurface", nativeName = "JAWT_DrawingSurface", mutable = false) {
    documentation =
        """
        Structure for containing the underlying drawing information of a component.

        All operations on a JAWT_DrawingSurface MUST be performed from the same thread as the call to {@code GetDrawingSurface}.
        """

    "JNIEnv".opaque.p.member(
        "env",
        """
        Cached reference to the Java environment of the calling thread.

        If Lock(), Unlock(), GetDrawingSurfaceInfo() or FreeDrawingSurfaceInfo() are called from a different thread, this data member should be set before
        calling those functions.
        """
    )
    jobject_p.member("target", "Cached reference to the target object.")
    opaque_p.member("Lock", "")
    opaque_p.member("GetDrawingSurfaceInfo", "")
    opaque_p.member("FreeDrawingSurfaceInfo", "")
    opaque_p.member("Unlock", "")
}

val JAWT_DrawingSurfaceInfo = struct(Module.JAWT, "JAWTDrawingSurfaceInfo", nativeName = "JAWT_DrawingSurfaceInfo", mutable = false) {
    opaque_p.member(
        "platformInfo",
        """
        Pointer to the platform-specific information. This can be safely cast to a {@code JAWT_Win32DrawingSurfaceInfo} on Windows or a
        {@code JAWT_X11DrawingSurfaceInfo} on Solaris. On Mac OS X this is a pointer to a {@code NSObject} that conforms to the {@code JAWT_SurfaceLayers}
        protocol.
        """
    )
    JAWT_DrawingSurface.p.member("ds", "Cached pointer to the underlying drawing surface.")
    JAWT_Rectangle.member("bounds", "Bounding rectangle of the drawing surface.")
    AutoSize("clip")..jint.member("clipSize", "Number of rectangles in the clip.")
    JAWT_Rectangle.p.buffer("clip", "Clip rectangle array.")
}

val JAWT = struct(Module.JAWT, "JAWT", skipBuffer = true) {
    documentation = "Structure for containing native AWT functions."

    jint.member("version", "Version of this structure. This must always be set before calling JAWT_GetAWT()")
    nullable..opaque_p.member("GetDrawingSurface", "")
    nullable..opaque_p.member("FreeDrawingSurface", "")
    nullable..opaque_p.member("Lock", "")
    nullable..opaque_p.member("Unlock", "")
    nullable..opaque_p.member("GetComponent", "")
    nullable..opaque_p.member("CreateEmbeddedFrame", "")
    nullable..opaque_p.member("SetBounds", "")
    nullable..opaque_p.member("SynthesizeWindowActivation", "")
}

val Component = java.awt.Component::class.jobject
val Frame = java.awt.Frame::class.jobject

fun config() {
    packageInfo(
        Module.JAWT,
        "Contains bindings to the AWT native interface (jawt.h)."
    )

    struct(Module.JAWT, "JAWTX11DrawingSurfaceInfo", nativeName = "JAWT_X11DrawingSurfaceInfo", mutable = false) {
        documentation = "X11-specific declarations for AWT native interface."

        Drawable.member("drawable", "the drawable")
        Display.p.member("display", "the connection to the X server")
        VisualID.member("visualID", "the VisualID")
        Colormap.member("colormapID", "the colormap")
        int.member("depth", "the depth")
    }

    struct(Module.JAWT, "JAWTWin32DrawingSurfaceInfo", nativeName = "JAWT_Win32DrawingSurfaceInfo", mutable = false) {
        javaImport("org.lwjgl.system.windows.User32")

        documentation = "Win32-specific declarations for AWT native interface."

        union {
            HWND.member("hwnd", "the native window handle")
            HBITMAP.member("hbitmap", "the DDB handle")
            void.p.member("pbits", "the DIB handle")
        }
        HDC.member(
            "hdc",
            "the device context handle. This HDC should always be used instead of the HDC returned from {@code BeginPaint()} or any calls to User32#GetDC()."
        )
        HPALETTE.member("hpalette", "the palette handle")
    }
}
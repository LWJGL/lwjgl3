/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.linux.*

val GLX = "GLX".nativeClass(OPENGL_PACKAGE, prefix = "GLX", prefixMethod = "glX", binding = GLBinding.delegate("GL.getFunctionProvider()")) {
    javaImport(
        "org.lwjgl.system.linux.*"
    )

    documentation = "Native bindings to GLX."

    IntConstant(
        "Errors.",

        "GLXBadContext".."0",
        "GLXBadContextState".."1",
        "GLXBadDrawable".."2",
        "GLXBadPixmap".."3",
        "GLXBadContextTag".."4",
        "GLXBadCurrentWindow".."5",
        "GLXBadRenderRequest".."6",
        "GLXBadLargeRequest".."7",
        "GLXUnsupportedPrivateRequest".."8",
        "GLXBadFBConfig".."9",
        "GLXBadPbuffer".."10",
        "GLXBadCurrentDrawable".."11",
        "GLXBadWindow".."12"
    ).noPrefix()

    IntConstant(
        "Names for attributes to #GetConfig().",

        "USE_GL".."1",
        "BUFFER_SIZE".."2",
        "LEVEL".."3",
        "RGBA".."4",
        "DOUBLEBUFFER".."5",
        "STEREO".."6",
        "AUX_BUFFERS".."7",
        "RED_SIZE".."8",
        "GREEN_SIZE".."9",
        "BLUE_SIZE".."10",
        "ALPHA_SIZE".."11",
        "DEPTH_SIZE".."12",
        "STENCIL_SIZE".."13",
        "ACCUM_RED_SIZE".."14",
        "ACCUM_GREEN_SIZE".."15",
        "ACCUM_BLUE_SIZE".."16",
        "ACCUM_ALPHA_SIZE".."17"
    )

    IntConstant(
        "Error return values from #GetConfig(). Success is indicated by a value of 0.",

        "BAD_SCREEN".."1",
        "BAD_ATTRIBUTE".."2",
        "NO_EXTENSION".."3",
        "BAD_VISUAL".."4",
        "BAD_CONTEXT".."5",
        "BAD_VALUE".."6",
        "BAD_ENUM".."7"
    )

    // --------------------------------------------------------

    Bool(
        "QueryExtension",
        "Ascertains if the GLX extension is defined for an X server.",

        DISPLAY,
        Check(1)..int_p.OUT("error_base", "returns the value of the first error code"),
        Check(1)..int_p.OUT("event_base", "returns the value of the first event code")
    )

    Bool(
        "QueryVersion",
        "Queries the GLX version supported.",

        DISPLAY,
        Check(1)..int_p.OUT("major", "returns the major version"),
        Check(1)..int_p.OUT("minor", "returns the minor version")
    )

    int(
        "GetConfig",
        "Returns a description of an OpenGL attribute exported by a Visual.",

        DISPLAY,
        XVisualInfo_p.IN("visual", "a pointer to an ##XVisualInfo structure"),
        int.IN("attribute", "the attribute to query"),
        Check(1)..int_p.OUT("value", "returns the attribute value")
    )

    XVisualInfo_p(
        "ChooseVisual",
        "Finds a visual that matches the client’s specified attributes.",

        DISPLAY,
        int.IN("screen", "the screen number"),
        nullable..NullTerminated..int_p.IN("attrib_list", "a list of attributes terminated with {@code None}"),

        returnDoc =
        """
        a pointer to an {@code XVisualInfo} structure describing the visual that best matches the specified attributes. If no matching visual exists, #NULL is
        returned.
        """
    )

    GLXContext(
        "CreateContext",
        "Creates an OpenGL context.",

        DISPLAY,
        XVisualInfo_p.IN("visual", "a pointer to an ##XVisualInfo structure"),
        nullable..GLXContext.IN("share_list", "the GLXContext to share objects with"),
        Bool.IN("direct", "whether direct rendering is requested")
    )

    Bool(
        "MakeCurrent",
        "Makes a context current in the current thread",

        DISPLAY,
        nullable..GLXDrawable.IN("draw", "the draw GLXdrawable"),
        nullable..GLXContext.IN("ctx", "the GLXContext to make current")
    )

    void(
        "CopyContext",
        "Copies OpenGL rendering state from one context to another.",

        DISPLAY,
        GLXContext.IN("source", "the source GLXContext"),
        GLXContext.IN("dest", "the destination GLXContext"),
        unsigned_long.IN(
            "mask",
            "indicates which groups of state variables are to be copied; it contains the bitwise OR of the symbolic names for the attribute groups"
        )
    )

    Bool(
        "IsDirect",
        "Determines if an OpenGL rendering context is direct.",

        DISPLAY,
        GLXContext.IN("ctx", "the GLXContext to query")
    )

    void(
        "DestroyContext",
        """
        Destroys an OpenGL context.

        If {@code ctx} is still current to any thread, {@code ctx} is not destroyed until it is no longer current. In any event, the associated XID will be
        destroyed and {@code ctx} cannot subsequently be made current to any thread.
        """,

        DISPLAY,
        GLXContext.IN("ctx", "the GLXContext to destroy")
    )

    GLXContext(
        "GetCurrentContext",
        "Returns the GLXContext that is current in the current thread."
    )

    GLXDrawable(
        "GetCurrentDrawable",
        "Returns the XID of the current drawable used for rendering."
    )

    void(
        "WaitGL",
        """
        Prevents X requests from executing until any outstanding OpenGL rendering is done.

        OpenGL calls made prior to {@code glXWaitGL} are guaranteed to be executed before X rendering calls made after {@code glXWaitGL}. While the same result
        can be achieved using #Finish(), {@code glXWaitGL} does not require a round trip to the server, and is therefore more efficient in cases
        where the client and server are on separate machines.
        """
    )

    void(
        "WaitX",
        """
        Prevents the OpenGL command sequence from executing until any outstanding X requests are completed.

        X rendering calls made prior to {@code glXWaitX} are guaranteed to be executed before OpenGL rendering calls made after {@code glXWaitX}. While the same
        result can be achieved using {@code XSync()}, {@code glXWaitX} does not require a round trip to the server, and may therefore be more efficient.
        """
    )

    void(
        "SwapBuffers",
        """
        For drawables that are double buffered, makes the contexts of the back buffer potentially visible (i.e., become the contents of the front buffer).

        The contents of the back buffer then become undefined. This operation is a no-op if draw was created with a non-double-buffered GLXFBConfig, or if draw
        is a GLXPixmap.
        """,

        DISPLAY,
        GLXDrawable.IN("draw", "a double buffered GLXDrawable")
    )

    void(
        "UseXFont",
        "Provides a shortcut for using X fonts.",

        Font.IN("font", "the font to use"),
        int.IN("first", "the first glyph in the font to use"),
        int.IN("count", "the number of display lists to define"),
        int.IN("list_base", "the base list number")
    )

    GLXPixmap(
        "CreateGLXPixmap",
        "Creates a GLXPixmap from a Pixmap.",

        DISPLAY,
        XVisualInfo_p.IN("visual", "a pointer to a ##XVisualInfo structure"),
        Pixmap.IN("pixmap", "the Pixmap")
    )

    void(
        "DestroyGLXPixmap",
        "Destroys a GLXPixmap.",

        DISPLAY,
        GLXPixmap.IN("pixmap", "the GLXPixmap to destroy.")
    )
}
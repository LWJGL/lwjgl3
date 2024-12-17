/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX = "GLX".nativeClass(Module.OPENGL, prefix = "GLX", prefixMethod = "glX", binding = GLBinding.delegate("GL.getFunctionProvider()")) {
    javaImport(
        "org.lwjgl.system.linux.*"
    )

    IntConstant(
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

        DISPLAY,
        Check(1)..int.p("error_base"),
        Check(1)..int.p("event_base")
    )

    Bool(
        "QueryVersion",

        DISPLAY,
        Check(1)..int.p("major"),
        Check(1)..int.p("minor")
    )

    int(
        "GetConfig",

        DISPLAY,
        Input..XVisualInfo.p("visual"),
        int("attribute"),
        Check(1)..int.p("value")
    )

    XVisualInfo.p(
        "ChooseVisual",

        DISPLAY,
        int("screen"),
        nullable..NullTerminated..int.p("attrib_list")
    )

    GLXContext(
        "CreateContext",

        DISPLAY,
        Input..XVisualInfo.p("visual"),
        nullable..GLXContext("share_list"),
        Bool("direct")
    )

    Bool(
        "MakeCurrent",

        DISPLAY,
        nullable..GLXDrawable("draw"),
        nullable..GLXContext("ctx")
    )

    void(
        "CopyContext",

        DISPLAY,
        GLXContext("source"),
        GLXContext("dest"),
        unsigned_long("mask")
    )

    Bool(
        "IsDirect",

        DISPLAY,
        GLXContext("ctx")
    )

    void(
        "DestroyContext",

        DISPLAY,
        GLXContext("ctx")
    )

    GLXContext(
        "GetCurrentContext",
        void()
    )

    GLXDrawable(
        "GetCurrentDrawable",
        void()
    )

    void(
        "WaitGL",
        void()
    )

    void(
        "WaitX",
        void()
    )

    void(
        "SwapBuffers",

        DISPLAY,
        GLXDrawable("draw")
    )

    void(
        "UseXFont",

        Font("font"),
        int("first"),
        int("count"),
        int("list_base")
    )

    GLXPixmap(
        "CreateGLXPixmap",

        DISPLAY,
        Input..XVisualInfo.p("visual"),
        Pixmap("pixmap")
    )

    void(
        "DestroyGLXPixmap",

        DISPLAY,
        GLXPixmap("pixmap")
    )
}
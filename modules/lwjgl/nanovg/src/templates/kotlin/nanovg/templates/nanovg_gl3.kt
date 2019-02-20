/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg.templates

import org.lwjgl.generator.*
import nanovg.*

val nanovg_gl3 = "NanoVGGL3".dependsOn(Module.OPENGL)?.nativeClass(Module.NANOVG, prefix = "NVG") {
    includeNanoVGAPI("""#define NANOVG_GL3_IMPLEMENTATION
#include "nanovg.h"
#include "nanovg_gl.h"
#include "nanovg_gl_utils.h"""")

    documentation = "Implementation of the NanoVG API using OpenGL 3.0."

    val CreateFlags = EnumConstant(
        "Create flags.",

        "ANTIALIAS".enum("Flag indicating if geometry based anti-aliasing is used (may not be needed when using MSAA).", "1<<0"),
        "STENCIL_STROKES".enum(
            """
            Flag indicating if strokes should be drawn using stencil buffer. The rendering will be a little slower, but path overlaps (i.e. self-intersecting
            or sharp turns) will be drawn just once.
            """,
            "1<<1"
        ),
        "DEBUG".enum("Flag indicating that additional debug checks are done.", "1<<2")
    ).javaDocLinks

    EnumConstant(
        "These are additional flags on top of NVGimageFlags.",

        "IMAGE_NODELETE".enum("Do not delete GL texture handle.", "1<<16")
    )

    val ctx = NVGcontext.p("ctx", "the NanoVG context")

    NativeName("nvglCreateImageFromHandleGL3")..int(
        "lCreateImageFromHandle",
        "Creates a NanoVG image from an OpenGL texture.",

        ctx,
        GLuint("textureId", "the OpenGL texture id"),
        int("w", "the image width"),
        int("h", "the image height"),
        int("flags", "the image flags"),

        returnDoc = "a handle to the image"
    )

    NativeName("nvglImageHandleGL3")..GLuint(
        "lImageHandle",
        "Returns the OpenGL texture id associated with a NanoVG image.",

        ctx,
        int("image", "the image handle")
    )

    NativeName("nvgCreateGL3")..NVGcontext.p(
        "Create",
        """
        Creates a NanoVG context with an OpenGL 3.0 rendering back-end.

        An OpenGL 3.0+ context must be current in the current thread when this function is called and the returned NanoVG context may only be used in the
        thread in which that OpenGL context is current.
        """,

        JNI_ENV,
        int("flags", "the context flags", CreateFlags)
    )

    NativeName("nvgDeleteGL3")..void(
        "Delete",
        "Deletes a NanoVG context created with #Create().",

        ctx
    )

    NativeName("nvgluCreateFramebufferGL3")..NVGLUframebuffer.p(
        "luCreateFramebuffer",
        "Creates a framebuffer object to render to.",

        ctx,
        int("w", "the framebuffer width"),
        int("h", "the framebuffer height"),
        int("imageFlags", "the image flags")
    )

    NativeName("nvgluBindFramebufferGL3")..void(
        "luBindFramebuffer",
        "Binds the framebuffer object associated with the specified ##NVGLUFramebuffer.",

        ctx,
        Input..nullable..NVGLUframebuffer.p("fb", "the framebuffer to bind")
    )

    NativeName("nvgluDeleteFramebufferGL3")..void(
        "luDeleteFramebuffer",
        "Deletes an ##NVGLUFramebuffer.",

        ctx,
        Input..NVGLUframebuffer.p("fb", "the framebuffer to delete")
    )
}
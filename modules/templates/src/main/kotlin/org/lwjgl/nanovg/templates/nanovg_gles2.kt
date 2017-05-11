/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.nanovg.templates

import org.lwjgl.generator.*
import org.lwjgl.nanovg.*
import org.lwjgl.opengl.*

val nanovg_gles2 = "NanoVGGLES2".dependsOn(Binding.OPENGLES)?.nativeClass(packageName = NANOVG_PACKAGE, prefix = "NVG", library = NANOVG_LIBRARY) {
    nativeDirective(
        """#ifdef LWJGL_WINDOWS
    __pragma(warning(disable : 4710 4711))
#endif""", beforeIncludes = true)

    includeNanoVGAPI("""#define NANOVG_GLES2_IMPLEMENTATION
#include "nanovg.h"
#include "nanovg_gl.h"
#include "nanovg_gl_utils.h"""")

    documentation = "Implementation of the NanoVG API using OpenGL ES 2.0."

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

    val ctx = NVGcontext_p.IN("ctx", "the NanoVG context")

    NativeName("nvglCreateImageFromHandleGLES2")..int(
        "lCreateImageFromHandle",
        "Creates a NanoVG image from an OpenGL texture.",

        ctx,
        GLuint.IN("textureId", "the OpenGL texture id"),
        int.IN("w", "the image width"),
        int.IN("h", "the image height"),
        int.IN("flags", "the image flags"),

        returnDoc = "a handle to the image"
    )

    NativeName("nvglImageHandleGLES2")..GLuint(
        "lImageHandle",
        "Returns the OpenGL texture id associated with a NanoVG image.",

        ctx,
        int.IN("image", "the image handle")
    )

    NativeName("nvgCreateGLES2")..NVGcontext_p(
        "Create",
        """
        Creates a NanoVG context with an OpenGL ES 2.0 rendering back-end.

        An OpenGL ES 2.0+ context must be current in the current thread when this function is called and the returned NanoVG context may only be used in
        the thread in which that OpenGL context is current.
        """,

        JNI_ENV,
        int.IN("flags", "the context flags", CreateFlags)
    )

    NativeName("nvgDeleteGLES2")..void(
        "Delete",
        "Deletes a NanoVG context created with #Create().",

        ctx
    )

    NativeName("nvgluCreateFramebufferGLES2")..NVGLUframebuffer_p(
        "luCreateFramebuffer",
        "Creates a framebuffer object to render to.",

        ctx,
        int.IN("w", "the framebuffer width"),
        int.IN("h", "the framebuffer height"),
        int.IN("imageFlags", "the image flags")
    )

    NativeName("nvgluBindFramebufferGLES2")..void(
        "luBindFramebuffer",
        "Binds the framebuffer object associated with the specified ##NVGLUFramebuffer.",

        ctx,
        nullable..NVGLUframebuffer_p.IN("fb", "the framebuffer to bind")
    )

    NativeName("nvgluDeleteFramebufferGLES2")..void(
        "luDeleteFramebuffer",
        "Deletes an ##NVGLUFramebuffer.",

        ctx,
        NVGLUframebuffer_p.IN("fb", "the framebuffer to delete")
    )
}
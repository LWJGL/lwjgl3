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

    EnumConstant(
        "ANTIALIAS".enum("1<<0"),
        "STENCIL_STROKES".enum("1<<1"),
        "DEBUG".enum("1<<2")
    )

    EnumConstant(
        "IMAGE_NODELETE".enum("1<<16")
    )

    val ctx = NVGcontext.p("ctx")

    NativeName("nvglCreateImageFromHandleGL3")..int(
        "lCreateImageFromHandle",

        ctx,
        GLuint("textureId"),
        int("w"),
        int("h"),
        int("flags")
    )

    NativeName("nvglImageHandleGL3")..GLuint(
        "lImageHandle",

        ctx,
        int("image")
    )

    NativeName("nvgCreateGL3")..NVGcontext.p(
        "Create",

        JNI_ENV,
        int("flags")
    )

    NativeName("nvgDeleteGL3")..void(
        "Delete",

        ctx
    )

    NativeName("nvgluCreateFramebufferGL3")..NVGLUframebuffer.p(
        "luCreateFramebuffer",

        ctx,
        int("w"),
        int("h"),
        int("imageFlags")
    )

    NativeName("nvgluBindFramebufferGL3")..void(
        "luBindFramebuffer",

        ctx,
        Input..nullable..NVGLUframebuffer.p("fb")
    )

    NativeName("nvgluDeleteFramebufferGL3")..void(
        "luDeleteFramebuffer",

        ctx,
        Input..NVGLUframebuffer.p("fb")
    )
}
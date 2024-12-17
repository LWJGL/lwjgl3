/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg.templates

import org.lwjgl.generator.*
import nanovg.*

val nanovg_gles3 = "NanoVGGLES3".dependsOn(Module.OPENGLES)?.nativeClass(Module.NANOVG, prefix = "NVG") {
    includeNanoVGAPI("""#define NANOVG_GLES3_IMPLEMENTATION
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

    NativeName("nvglCreateImageFromHandleGLES3")..int(
        "lCreateImageFromHandle",

        ctx,
        GLuint("textureId"),
        int("w"),
        int("h"),
        int("flags")
    )

    NativeName("nvglImageHandleGLES3")..GLuint(
        "lImageHandle",

        ctx,
        int("image")
    )

    NativeName("nvgCreateGLES3")..NVGcontext.p(
        "Create",

        JNI_ENV,
        int("flags")
    )

    NativeName("nvgDeleteGLES3")..void(
        "Delete",

        ctx
    )

    NativeName("nvgluCreateFramebufferGLES3")..NVGLUframebuffer.p(
        "luCreateFramebuffer",

        ctx,
        int("w"),
        int("h"),
        int("imageFlags")
    )

    NativeName("nvgluBindFramebufferGLES3")..void(
        "luBindFramebuffer",

        ctx,
        Input..nullable..NVGLUframebuffer.p("fb")
    )

    NativeName("nvgluDeleteFramebufferGLES3")..void(
        "luDeleteFramebuffer",

        ctx,
        Input..NVGLUframebuffer.p("fb")
    )
}
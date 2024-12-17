/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg.templates

import org.lwjgl.generator.*
import nanovg.*

val nanovg_gl2 = "NanoVGGL2".dependsOn(Module.OPENGL)?.nativeClass(Module.NANOVG, prefix = "NVG") {
    includeNanoVGAPI("""#define NANOVG_GL2_IMPLEMENTATION
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

    NativeName("nvglCreateImageFromHandleGL2")..int(
        "lCreateImageFromHandle",

        ctx,
        GLuint("textureId"),
        int("w"),
        int("h"),
        int("flags")
    )

    NativeName("nvglImageHandleGL2")..GLuint(
        "lImageHandle",

        ctx,
        int("image")
    )

    NativeName("nvgCreateGL2")..NVGcontext.p(
        "Create",

        JNI_ENV,
        int("flags")
    )

    NativeName("nvgDeleteGL2")..void(
        "Delete",

        ctx
    )

    NativeName("nvgluCreateFramebufferGL2")..NVGLUframebuffer.p(
        "luCreateFramebuffer",

        ctx,
        int("w"),
        int("h"),
        int("imageFlags")
    )

    NativeName("nvgluBindFramebufferGL2")..void(
        "luBindFramebuffer",

        ctx,
        Input..nullable..NVGLUframebuffer.p("fb")
    )

    NativeName("nvgluDeleteFramebufferGL2")..void(
        "luDeleteFramebuffer",

        ctx,
        Input..NVGLUframebuffer.p("fb")
    )
}
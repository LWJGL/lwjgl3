/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nanovg

import org.lwjgl.generator.*

fun GeneratorTargetNative.includeNanoVGAPI(directives: String) = nativeDirective(
    """#include "lwjgl_malloc.h"
#define NVG_MALLOC(sz)     org_lwjgl_malloc(sz)
#define NVG_REALLOC(p,sz)  org_lwjgl_realloc(p,sz)
#define NVG_FREE(p)        org_lwjgl_free(p)
DISABLE_WARNINGS()
$directives
ENABLE_WARNINGS()""")

val NVGcontext = "NVGcontext".opaque

val NVGcolor = struct(Module.NANOVG, "NVGColor", nativeName = "NVGcolor") {
    union {
        float("rgba")[4]
        struct {
            float("r")
            float("g")
            float("b")
            float("a")
        }
    }
}

val NVGpaint = struct(Module.NANOVG, "NVGPaint", nativeName = "NVGpaint") {
    float("xform")[6]
    float("extent")[2]
    float("radius")
    float("feather")
    NVGcolor("innerColor")
    NVGcolor("outerColor")
    int("image")
}

val charptr = "char".opaque // address, not data

val NVGglyphPosition = struct(Module.NANOVG, "NVGGlyphPosition", nativeName = "NVGglyphPosition", mutable = false) {
    charptr.p("str")
    float("x")
    float("minx")
    float("maxx")
}

val NVGtextRow = struct(Module.NANOVG, "NVGTextRow", nativeName = "NVGtextRow", mutable = false) {
    charptr.p("start")
    charptr.p("end")
    charptr.p("next")
    float("width")
    float("minx")
    float("maxx")
}

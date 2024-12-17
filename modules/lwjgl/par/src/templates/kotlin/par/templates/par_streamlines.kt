/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package par.templates

import org.lwjgl.generator.*
import par.*

val par_streamlines = "ParStreamlines".nativeClass(Module.PAR, prefix = "parsl_", prefixConstant = "PARSL_") {
    nativeDirective(
        """#include "lwjgl_malloc.h"
#define PAR_MALLOC(T, N) ((T*) org_lwjgl_malloc(N * sizeof(T)))
#define PAR_CALLOC(T, N) ((T*) org_lwjgl_calloc(N, sizeof(T)))
#define PAR_REALLOC(T, BUF, N) ((T*) org_lwjgl_realloc(BUF, sizeof(T) * N))
#define PAR_FREE(BUF) org_lwjgl_free(BUF)
DISABLE_WARNINGS()
#define PAR_STREAMLINES_IMPLEMENTATION
#include "par_streamlines.h"
ENABLE_WARNINGS()""")

    EnumConstant(
        "PAR_U_MODE_NORMALIZED_DISTANCE".enum,
        "PAR_U_MODE_DISTANCE".enum,
        "PAR_U_MODE_SEGMENT_INDEX".enum,
        "PAR_U_MODE_SEGMENT_FRACTION".enum
    ).noPrefix()

    IntConstant(
        "FLAG_WIREFRAME".."1 << 0",
        "FLAG_ANNOTATIONS".."1 << 1",
        "FLAG_SPINE_LENGTHS".."1 << 2",
        "FLAG_RANDOM_OFFSETS".."1 << 3",
        "FLAG_CURVE_GUIPARSL_FLAG_DES".."1 << 4"
    )

    parsl_context.p(
        "create_context",

        parsl_config("config")
    )

    void(
        "destroy_context",

        parsl_context.p("ctx")
    )

    parsl_mesh.p(
        "mesh_from_lines",

        parsl_context.p("ctx"),
        parsl_spine_list("spines")
    )

    parsl_mesh.p(
        "mesh_from_streamlines",

        parsl_context.p("context"),
        parsl_advection_callback("advect"),
        uint32_t("first_tick"),
        uint32_t("num_ticks"),
        opaque_p("userdata")
    )

    parsl_mesh.p(
        "mesh_from_curves_cubic",

        parsl_context.p("context"),
        parsl_spine_list("spines")
    )

    parsl_mesh.p(
        "mesh_from_curves_quadratic",

        parsl_context.p("context"),
        parsl_spine_list("spines")
    )
}
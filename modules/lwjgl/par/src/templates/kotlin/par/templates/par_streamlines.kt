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

    documentation =
        """
        Bindings to ${url("https://github.com/prideout/par/blob/master/par_streamlines.h", "par_streamlines.h")}, a single-file, zero-dependency, C99 library
        that can triangulate wide lines and curves.
        """

    EnumConstant(
        "Configures how the library assigns UV coordinates.",

        "PAR_U_MODE_NORMALIZED_DISTANCE".enum("This is the default."),
        "PAR_U_MODE_DISTANCE".enum("Non-normalized distance along the curve."),
        "PAR_U_MODE_SEGMENT_INDEX".enum("Starts at zero for each curve, counts up."),
        "PAR_U_MODE_SEGMENT_FRACTION".enum("0.0, 1.0 / COUNT, 2.0 / COUNT, etc...")
    ).noPrefix()

    IntConstant("Enables 4 indices per triangle", "FLAG_WIREFRAME".."1 << 0")
    IntConstant("Populates {@code mesh.annotations}", "FLAG_ANNOTATIONS".."1 << 1")
    IntConstant("Populates {@code mesh.lengths}", "FLAG_SPINE_LENGTHS".."1 << 2")
    IntConstant("Populates {@code mesh.random_offsets}", "FLAG_RANDOM_OFFSETS".."1 << 3")
    IntConstant("Draws control points", "FLAG_CURVE_GUIPARSL_FLAG_DES".."1 << 4")

    parsl_context.p(
        "create_context",
        "",

        parsl_config("config", "")
    )

    void(
        "destroy_context",
        "",

        parsl_context.p("ctx", "")
    )

    parsl_mesh.p(
        "mesh_from_lines",
        "Low-level function that generates two triangles for each line segment.",

        parsl_context.p("ctx", ""),
        parsl_spine_list("spines", "")
    )

    parsl_mesh.p(
        "mesh_from_streamlines",
        "High-level function that can be used to visualize a vector field.",

        parsl_context.p("context", ""),
        parsl_advection_callback("advect", ""),
        uint32_t("first_tick", ""),
        uint32_t("num_ticks", ""),
        opaque_p("userdata", "")
    )

    parsl_mesh.p(
        "mesh_from_curves_cubic",
        """
        High-level function that tessellates a series of curves into triangles, where each spine is a series of chained cubic Bézier curves.

        The first curve of each spine is defined by an endpoint, followed by two control points, followed by an endpoint. Every subsequent curve in the spine
        is defined by a single control point followed by an endpoint. Only one control point is required because the first control point is computed via
        reflection over the endpoint.

        The number of vertices in each spine should be {@code 4+(n-1)*2} where {@code n} is the number of piecewise curves.

        Each spine is equivalent to an SVG path that looks like {@code M C S S S}.
        """,

        parsl_context.p("context", ""),
        parsl_spine_list("spines", "")
    )

    parsl_mesh.p(
        "mesh_from_curves_quadratic",
        """
        High-level function that tessellates a series of curves into triangles, where each spine is a series of chained quadratic Bézier curves.

        The first curve of each spine is defined by an endpoint, followed by one control point, followed by an endpoint. Every subsequent curve in the spine is
        defined by a single control point followed by an endpoint.

        The number of vertices in each spine should be {@code 3+(n-1)*2} where {@code n} is the number of piecewise curves.

        Each spine is equivalent to an SVG path that looks like {@code M Q M Q M Q}.
        """,

        parsl_context.p("context", ""),
        parsl_spine_list("spines", "")
    )
}
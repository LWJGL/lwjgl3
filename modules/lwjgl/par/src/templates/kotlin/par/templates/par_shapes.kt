/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package par.templates

import org.lwjgl.generator.*
import par.*

val par_shapes = "ParShapes".nativeClass(Module.PAR, prefix = "par_shapes_") {
    nativeDirective(
        """#include "lwjgl_malloc.h"
#define PAR_MALLOC(T, N) ((T*) org_lwjgl_malloc(N * sizeof(T)))
#define PAR_CALLOC(T, N) ((T*) org_lwjgl_calloc(N, sizeof(T)))
#define PAR_REALLOC(T, BUF, N) ((T*) org_lwjgl_realloc(BUF, sizeof(T) * N))
#define PAR_FREE(BUF) org_lwjgl_free(BUF)
DISABLE_WARNINGS()
#define PAR_SHAPES_IMPLEMENTATION
#define PAR_SHAPES_T uint32_t
#include "par_shapes.h"
ENABLE_WARNINGS()""")

    void(
        "free_mesh",

        Input..par_shapes_mesh.p("mesh")
    )

    val shapes_create_ss = par_shapes_mesh.p(
        "create_cylinder",

        int("slices"),
        int("stacks")
    )

    par_shapes_mesh.p(
        "create_cone",

        int("slices"),
        int("stacks")
    )

    par_shapes_mesh.p(
        "create_parametric_disk",

        int("slices"),
        int("stacks")
    )

    par_shapes_mesh.p(
        "create_torus",

        shapes_create_ss["slices"],
        shapes_create_ss["stacks"],
        float("radius")
    )

    par_shapes_mesh.p(
        "create_parametric_sphere",

        shapes_create_ss["slices"],
        shapes_create_ss["stacks"]
    )

    par_shapes_mesh.p(
        "create_subdivided_sphere",

        int("nsubdivisions")
    )

    par_shapes_mesh.p(
        "create_klein_bottle",

        shapes_create_ss["slices"],
        shapes_create_ss["stacks"]
    )

    par_shapes_mesh.p(
        "create_trefoil_knot",

        shapes_create_ss["slices"],
        shapes_create_ss["stacks"],
        float("radius")
    )

    par_shapes_mesh.p(
        "create_hemisphere",

        shapes_create_ss["slices"],
        shapes_create_ss["stacks"]
    )

    par_shapes_mesh.p(
        "create_plane",

        shapes_create_ss["slices"],
        shapes_create_ss["stacks"]
    )

    /*
    // Create a parametric surface from a callback function that consumes a 2D
// point in [0,1] and produces a 3D point.
typedef void (*par_shapes_fn)(float const*, float*, void*);
par_shapes_mesh* par_shapes_create_parametric(par_shapes_fn, int slices,
    int stacks, void* userdata);
     */

    par_shapes_mesh.p(
        "create_icosahedron",
        void()
    )

    par_shapes_mesh.p(
        "create_dodecahedron",
        void()
    )

    par_shapes_mesh.p(
        "create_octahedron",
        void()
    )

    par_shapes_mesh.p(
        "create_tetrahedron",
        void()
    )

    par_shapes_mesh.p(
        "create_cube",
        void()
    )

    par_shapes_mesh.p(
        "create_disk",

        float("radius"),
        shapes_create_ss["slices"],
        Check(3)..float.const.p("center"),
        Check(3)..float.const.p("normal")
    )

    par_shapes_mesh.p(
        "create_empty",
        void()
    )

    par_shapes_mesh.p(
        "create_rock",

        int("seed"),
        int("nsubdivisions")
    )

    par_shapes_mesh.p(
        "create_lsystem",

        charASCII.const.p("program"),
        shapes_create_ss["slices"],
        int("maxdepth"),
        nullable..par_shapes_rand_fn("rand_fn"),
        nullable..opaque_p("context")
    )

    void(
        "export",

        par_shapes_mesh.const.p("mesh"),
        charASCII.const.p("objfile")
    )

    void(
        "compute_aabb",

        par_shapes_mesh.const.p("mesh"),
        Check(6)..float.p("aabb")
    )

    par_shapes_mesh.p(
        "clone",

        par_shapes_mesh.const.p("mesh"),
        Input..nullable..par_shapes_mesh.p("target")
    )

    void(
        "merge",

        Input..par_shapes_mesh.p("dst"),
        par_shapes_mesh.const.p("src")
    )

    void(
        "translate",

        Input..par_shapes_mesh.p("mesh"),
        float("x"),
        float("y"),
        float("z")
    )

    void(
        "rotate",

        Input..par_shapes_mesh.p("mesh"),
        float("radians"),
        Check(3)..float.const.p("axis")
    )

    void(
        "scale",

        Input..par_shapes_mesh.p("mesh"),
        float("x"),
        float("y"),
        float("z")
    )

    void(
        "merge_and_free",

        Input..par_shapes_mesh.p("dst"),
        Input..par_shapes_mesh.p("src")
    )

    void(
        "invert",

        Input..par_shapes_mesh.p("mesh"),
        int("startface"),
        int("nfaces")
    )

    void(
        "remove_degenerate",

        Input..par_shapes_mesh.p("mesh"),
        float("minarea")
    )

    void(
        "unweld",

        Input..par_shapes_mesh.p("mesh"),
        bool("create_indices")
    )

    par_shapes_mesh.p(
        "weld",

        par_shapes_mesh.const.p("mesh"),
        float("epsilon"),
        Check("mesh.npoints()")..nullable..PAR_SHAPES_T.p("mapping")
    )

    void(
        "compute_normals",

        Input..par_shapes_mesh.p("mesh")
    )

    void(
        "set_epsilon_welded_normals",

        float("epsilon")
    )

    void(
        "set_epsilon_degenerate_sphere",

        float("epsilon")
    )

    void(
        "_compute_welded_normals",

        Input..par_shapes_mesh.p("m")
    )

    void(
        "_connect",

        Input..par_shapes_mesh.p("scene"),
        Input..par_shapes_mesh.p("cylinder"),
        int("slices")
    )
}
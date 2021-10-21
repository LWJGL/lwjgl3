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

    documentation =
        """
        Bindings to ${url("https://prideout.net/shapes", "par_shapes.h")}, a simple C library for creation and manipulation of triangle meshes.

        The par_shapes API is divided into three sections:
        ${ul(
            "Generators - Create parametric surfaces, platonic solids, etc.",
            "Queries - Ask a mesh for its axis-aligned bounding box, etc.",
            "Transforms - Rotate a mesh, merge it with another, add normals, etc."
        )}

        For our purposes, a "mesh" is a list of points and a list of triangles; the former is a flattened list of three-tuples (32-bit floats) and the latter
        is also a flattened list of three-tuples (16-bit {@code uints}). Triangles are always oriented such that their front face winds counter-clockwise.

        Depending on which generator function is used, meshes may or may not contain normals and texture coordinates (one per vertex).
        """

    void(
        "free_mesh",
        "Frees the specified ##ParShapesMesh structure.",

        Input..par_shapes_mesh.p("mesh", "the mesh to free")
    )

    val shapes_create_ss = par_shapes_mesh.p(
        "create_cylinder",
        """
        Creates a cylinder that sits on the Z=0 plane using the given tessellation levels across the UV domain.  Think of "slices" like a number of pizza
        slices, and "stacks" like a number of stacked rings.  Height and radius are both 1.0, but they can easily be changed with #scale().
        """,

        int("slices", "the number of slices"),
        int("stacks", "the number of stacks")
    )

    par_shapes_mesh.p(
        "create_cone",
        """
        Creates a cone similar to #create_cylinder() but the radius diminishes to zero as Z increases.  Again, height and radius are 1.0, but can be changed
        with #scale().
        """,

        int("slices", "the number of slices"),
        int("stacks", "the number of stacks")
    )

    par_shapes_mesh.p(
        "create_parametric_disk",
        "Creates a disk of radius {@code 1.0} with texture coordinates and normals by squashing a cone flat on the {@code Z=0} plane.",

        int("slices", "the number of slices"),
        int("stacks", "the number of stacks")
    )

    par_shapes_mesh.p(
        "create_torus",
        "Creates a donut that sits on the Z=0 plane with the specified inner radius. The outer radius can be controlled with #scale().",

        shapes_create_ss["slices"],
        shapes_create_ss["stacks"],
        float("radius", "the torus radius")
    )

    par_shapes_mesh.p(
        "create_parametric_sphere",
        "Creates a sphere with texture coordinates and small triangles near the poles.",

        shapes_create_ss["slices"],
        shapes_create_ss["stacks"]
    )

    par_shapes_mesh.p(
        "create_subdivided_sphere",
        """
        Approximates a sphere with a subdivided icosahedron, which produces a nice distribution of triangles, but no texture coordinates. Each subdivision
        level scales the number of triangles by four, so use a very low number.
        """,

        int("nsubdivisions", "the number of subdivisions")
    )

    par_shapes_mesh.p(
        "create_klein_bottle",
        "Creates a klein bottle mesh.",

        shapes_create_ss["slices"],
        shapes_create_ss["stacks"]
    )

    par_shapes_mesh.p(
        "create_trefoil_knot",
        "Creates a trefoil knot mesh.",

        shapes_create_ss["slices"],
        shapes_create_ss["stacks"],
        float("radius", "")
    )

    par_shapes_mesh.p(
        "create_hemisphere",
        "Creates a hemisphere mesh.",

        shapes_create_ss["slices"],
        shapes_create_ss["stacks"]
    )

    par_shapes_mesh.p(
        "create_plane",
        "Creates a plane mesh.",

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
        "Generates points for a 20-sided polyhedron that fits in the unit sphere. Texture coordinates and normals are not generated.",
        void()
    )

    par_shapes_mesh.p(
        "create_dodecahedron",
        "Generates points for a 12-sided polyhedron that fits in the unit sphere. Texture coordinates and normals are not generated.",
        void()
    )

    par_shapes_mesh.p(
        "create_octahedron",
        "Generates points for an 8-sided polyhedron that fits in the unit sphere. Texture coordinates and normals are not generated.",
        void()
    )

    par_shapes_mesh.p(
        "create_tetrahedron",
        "Generates points for a 4-sided polyhedron that fits in the unit sphere. Texture coordinates and normals are not generated.",
        void()
    )

    par_shapes_mesh.p(
        "create_cube",
        "Generates points for a cube that fits in the unit sphere. Texture coordinates and normals are not generated.",
        void()
    )

    par_shapes_mesh.p(
        "create_disk",
        "Generates an orientable disk shape in 3-space.  Does not include normals or texture coordinates.",

        float("radius", "the disk radius"),
        shapes_create_ss["slices"],
        Check(3)..float.const.p("center", "the disk center"),
        Check(3)..float.const.p("normal", "the disk normal")
    )

    par_shapes_mesh.p(
        "create_empty",
        "Creates an empty shape. Useful for building scenes with #merge_and_free().",
        void()
    )

    par_shapes_mesh.p(
        "create_rock",
        """
        Generates a rock shape that sits on the Y=0 plane, and sinks into it a bit. This includes smooth normals but no texture coordinates. Each subdivision
        level scales the number of triangles by four, so use a very low number.
        """,

        int("seed", "a seed value"),
        int("nsubdivisions", "the number of subdivisions")
    )

    par_shapes_mesh.p(
        "create_lsystem",
        """
        Creates trees or vegetation by executing a recursive turtle graphics program.

        The program is a list of command-argument pairs. See the
        ${url("https://github.com/LWJGL/lwjgl3/blob/master/modules/lwjgl/par/src/test/java/org/lwjgl/util/par/ParTest.java\\#L263", "unit test")} for an
        example. Texture coordinates and normals are not generated.
        """,

        charASCII.const.p("program", "the list of command-argument pairs"),
        shapes_create_ss["slices"],
        int("maxdepth", "the maximum depth"),
        nullable..par_shapes_rand_fn(
            "rand_fn",
            "is expected to return a value between 0 and 1, or can be #NULL (in which case {@code (float) rand() / RAND_MAX} will be used)"
        ),
        nullable..opaque_p("context", "passed unmodified to {@code rand_fn}")
    )

    void(
        "export",
        "Dumps out a text file conforming to the venerable OBJ format.",

        par_shapes_mesh.const.p("mesh", "the mesh to export"),
        charASCII.const.p("objfile", "the OBJ file path")
    )

    void(
        "compute_aabb",
        "Takes a pointer to 6 floats and sets them to min xyz, max xyz.",

        par_shapes_mesh.const.p("mesh", "the mesh to query"),
        Check(6)..float.p("aabb", "a pointer to an array of 6 floats in which the AABB will be written")
    )

    par_shapes_mesh.p(
        "clone",
        "Makes a deep copy of a mesh. To make a brand new copy, pass #NULL to {@code target}. To avoid memory churn, pass an existing mesh to {@code target}.",

        par_shapes_mesh.const.p("mesh", "the mesh to copy"),
        Input..nullable..par_shapes_mesh.p("target", "the target mesh")
    )

    void(
        "merge",
        "Merges two shapes.",

        Input..par_shapes_mesh.p("dst", "the destination mesh"),
        par_shapes_mesh.const.p("src", "the source mesh")
    )

    void(
        "translate",
        "Translates the specified mesh.",

        Input..par_shapes_mesh.p("mesh", "the mesh to translate"),
        float("x", "the X axis translation amount"),
        float("y", "the Y axis translation amount"),
        float("z", "the Z axis translation amount")
    )

    void(
        "rotate",
        "Rotates the specified mesh.",

        Input..par_shapes_mesh.p("mesh", "the mesh to rotate"),
        float("radians", "the rotation angle, in radians"),
        Check(3)..float.const.p("axis", "the rotation axis")
    )

    void(
        "scale",
        "Scales the specified mesh.",

        Input..par_shapes_mesh.p("mesh", "the mesh to scale"),
        float("x", "the X axis scale factor"),
        float("y", "the Y axis scale factor"),
        float("z", "the Z axis scale factor")
    )

    void(
        "merge_and_free",
        "Merges two shapes and frees the source shape.",

        Input..par_shapes_mesh.p("dst", "the destination mesh"),
        Input..par_shapes_mesh.p("src", "the source mesh")
    )

    void(
        "invert",
        "Reverses the winding of a run of faces. Useful when drawing the inside of a Cornell Box. Pass 0 for {@code nfaces} to reverse every face in the mesh.",

        Input..par_shapes_mesh.p("mesh", "the mesh to reverse"),
        int("startface", "the index of the first face to reverse"),
        int("nfaces", "the number of faces to reverse")
    )

    void(
        "remove_degenerate",
        "Removes all triangles whose area is less than {@code minarea}.",

        Input..par_shapes_mesh.p("mesh", "the mesh to cleanup"),
        float("minarea", "triangles with an area below this value will be removed")
    )

    void(
        "unweld",
        """
        Dereferences the entire index buffer and replaces the point list.

        This creates an inefficient structure, but is useful for drawing facets. If {@code create_indices} is true, a trivial "0 1 2 3..." index buffer is
        generated.
        """,

        Input..par_shapes_mesh.p("mesh", "the mesh to unweld"),
        bool("create_indices", "if an index buffer should be generated")
    )

    par_shapes_mesh.p(
        "weld",
        "Merges colocated verts, builds a new index buffer, and returns the optimized mesh.",

        par_shapes_mesh.const.p("mesh", "the mesh to weld"),
        float("epsilon", "the maximum distance to consider when welding vertices"),
        Check("mesh.npoints()")..nullable..PAR_SHAPES_T.p(
            "mapping",
            "null, or a pointer to {@code npoints} 32-bit integers, which gets filled with the mapping from old vertex indices to new indices"
        )
    )

    void(
        "compute_normals",
        "Computes smooth normals by averaging adjacent facet normals.",

        Input..par_shapes_mesh.p("mesh", "the mesh")
    )

    void(
        "set_epsilon_welded_normals",
        "",

        float("epsilon", "")
    )

    void(
        "set_epsilon_degenerate_sphere",
        "",

        float("epsilon", "")
    )

    void(
        "_compute_welded_normals",
        "",

        Input..par_shapes_mesh.p("m", "")
    )

    void(
        "_connect",
        "",

        Input..par_shapes_mesh.p("scene", ""),
        Input..par_shapes_mesh.p("cylinder", ""),
        int("slices", "")
    )
}
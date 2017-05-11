/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.par.templates

import org.lwjgl.generator.*
import org.lwjgl.util.par.*

val par_shapes = "ParShapes".nativeClass(packageName = PAR_PACKAGE, prefix = "par_shapes_", library = "LibPar.initialize();") {
    nativeDirective(
        """#ifdef LWJGL_WINDOWS
    #define _CRT_SECURE_NO_WARNINGS
    __pragma(warning(disable : 4710))
#endif""",
        beforeIncludes = true
    )

    nativeDirective(
        """#include "lwjgl_malloc.h"
#define PAR_MALLOC(T, N) ((T*) org_lwjgl_malloc(N * sizeof(T)))
#define PAR_CALLOC(T, N) ((T*) org_lwjgl_calloc(N, sizeof(T)))
#define PAR_REALLOC(T, BUF, N) ((T*) org_lwjgl_realloc(BUF, sizeof(T) * N))
#define PAR_FREE(BUF) org_lwjgl_free(BUF)
DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
    __pragma(warning(disable : 4711 4738))
#elif LWJGL_LINUX
    #pragma GCC diagnostic ignored "-Wunused-parameter"
#endif
#define PAR_SHAPES_IMPLEMENTATION
#include "par_shapes.h"
ENABLE_WARNINGS()""")

    documentation =
        """
        Bindings to ${url("https://github.com/prideout/par/blob/master/par_shapes.h", "par_shapes.h")}, a single-file, zero-dependency, C99 library that can
        generate simple shapes and perform basic operations on them. These operations include:
        ${ul(
            "Applying affine transformations",
            "Computing surface normals",
            "Welding colocated vertices"
        )}

        The library provides a set of functions that populate fields of the ##ParShapesMesh structure.

        The {@code normals} and {@code tcoords} fields might be null, but every other field is guaranteed to have valid values. This mesh representation is
        very limited: indices must be unsigned 16-bit integers, points must be three-tuples, and there is no support for face-varying data.

        When you’re done extracting the data you need from the mesh, be sure to free it:
        ${codeBlock("""
par_shapes_mesh* m = par_shapes_create_subdivided_sphere(1);
// ...
par_shapes_free_mesh(m);""")}
        """

    void(
        "free_mesh",
        "Frees the specified ##ParShapesMesh structure.",

        par_shapes_mesh_p.IN("mesh", "the mesh to free")
    )

    val shapes_create_ss = par_shapes_mesh_p(
        "create_cylinder",
        """
        Creates a cylinder that sits on the Z=0 plane using the given tessellation levels across the UV domain.  Think of "slices" like a number of pizza
        slices, and "stacks" like a number of stacked rings.  Height and radius are both 1.0, but they can easily be changed with #scale().
        """,

        int.IN("slices", "the number of slices"),
        int.IN("stacks", "the number of stacks")
    )

    par_shapes_mesh_p(
        "create_torus",
        "Creates a donut that sits on the Z=0 plane with the specified inner radius. The outer radius can be controlled with #scale().",

        shapes_create_ss["slices"],
        shapes_create_ss["stacks"],
        float.IN("radius", "the torus radius")
    )

    par_shapes_mesh_p(
        "create_parametric_sphere",
        "Creates a sphere with texture coordinates and small triangles near the poles.",

        shapes_create_ss["slices"],
        shapes_create_ss["stacks"]
    )

    par_shapes_mesh_p(
        "create_subdivided_sphere",
        """
        Approximates a sphere with a subdivided icosahedron, which produces a nice distribution of triangles, but no texture coordinates. Each subdivision
        level scales the number of triangles by four, so use a very low number.
        """,

        int.IN("nsubdivisions", "the number of subdivisions")
    )

    par_shapes_mesh_p(
        "create_klein_bottle",
        "Creates a klein bottle mesh.",

        shapes_create_ss["slices"],
        shapes_create_ss["stacks"]
    )

    par_shapes_mesh_p(
        "create_trefoil_knot",
        "Creates a trefoil knot mesh.",

        shapes_create_ss["slices"],
        shapes_create_ss["stacks"],
        float.IN("radius", "")
    )

    par_shapes_mesh_p(
        "create_hemisphere",
        "Creates a hemisphere mesh.",

        shapes_create_ss["slices"],
        shapes_create_ss["stacks"]
    )

    par_shapes_mesh_p(
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

    par_shapes_mesh_p(
        "create_icosahedron",
        "Generates points for a 20-sided polyhedron that fits in the unit sphere. Texture coordinates and normals are not generated."
    )

    par_shapes_mesh_p(
        "create_dodecahedron",
        "Generates points for a 12-sided polyhedron that fits in the unit sphere. Texture coordinates and normals are not generated."
    )

    par_shapes_mesh_p(
        "create_octahedron",
        "Generates points for an 8-sided polyhedron that fits in the unit sphere. Texture coordinates and normals are not generated."
    )

    par_shapes_mesh_p(
        "create_tetrahedron",
        "Generates points for a 4-sided polyhedron that fits in the unit sphere. Texture coordinates and normals are not generated."
    )

    par_shapes_mesh_p(
        "create_cube",
        "Generates points for a cube that fits in the unit sphere. Texture coordinates and normals are not generated."
    )

    par_shapes_mesh_p(
        "create_disk",
        "Generates an orientable disk shape in 3-space.  Does not include normals or texture coordinates.",

        float.IN("radius", "the disk radius"),
        shapes_create_ss["slices"],
        Check(3)..const..float_p.IN("center", "the disk center"),
        Check(3)..const..float_p.IN("normal", "the disk normal")
    )

    par_shapes_mesh_p(
        "create_empty",
        "Creates an empty shape. Useful for building scenes with #merge_and_free()."
    )

    par_shapes_mesh_p(
        "create_rock",
        """
        Generates a rock shape that sits on the Y=0 plane, and sinks into it a bit. This includes smooth normals but no texture coordinates. Each subdivision
        level scales the number of triangles by four, so use a very low number.
        """,

        int.IN("seed", "a seed value"),
        int.IN("nsubdivisions", "the number of subdivisions")
    )

    par_shapes_mesh_p(
        "create_lsystem",
        """
        Creates trees or vegetation by executing a recursive turtle graphics program. The program is a list of command-argument pairs. See the
        ${url("https://github.com/LWJGL/lwjgl3/blob/master/modules/core/src/test/java/org/lwjgl/util/par/ParTest.java\\#L263", "unit test")} for an example.
        Texture coordinates and normals are not generated.
        """,

        const..charASCII_p.IN("program", "the list of command-argument pairs"),
        shapes_create_ss["slices"],
        int.IN("maxdepth", "the maximum depth")
    )

    void(
        "export",
        "Dumps out a text file conforming to the venerable OBJ format.",

        const..par_shapes_mesh_p.IN("mesh", "the mesh to export"),
        const..charASCII_p.IN("objfile", "the OBJ file path")
    )

    void(
        "compute_aabb",
        "Takes a pointer to 6 floats and sets them to min xyz, max xyz.",

        const..par_shapes_mesh_p.IN("mesh", "the mesh to query"),
        Check(6)..float_p.OUT("aabb", "a pointer to an array of 6 floats in which the AABB will be written")
    )

    par_shapes_mesh_p(
        "clone",
        "Makes a deep copy of a mesh. To make a brand new copy, pass #NULL to {@code target}. To avoid memory churn, pass an existing mesh to {@code target}.",

        const..par_shapes_mesh_p.IN("mesh", "the mesh to copy"),
        nullable..par_shapes_mesh_p.INOUT("target", "the target mesh")
    )

    void(
        "merge",
        "Merges two shapes.",

        par_shapes_mesh_p.INOUT("dst", "the destination mesh"),
        const..par_shapes_mesh_p.IN("src", "the source mesh")
    )

    void(
        "translate",
        "Translates the specified mesh.",

        par_shapes_mesh_p.INOUT("mesh", "the mesh to translate"),
        float.IN("x", "the X axis translation amount"),
        float.IN("y", "the Y axis translation amount"),
        float.IN("z", "the Z axis translation amount")
    )

    void(
        "rotate",
        "Rotates the specified mesh.",

        par_shapes_mesh_p.INOUT("mesh", "the mesh to rotate"),
        float.IN("radians", "the rotation angle, in radians"),
        Check(3)..const..float_p.IN("axis", "the rotation axis")
    )

    void(
        "scale",
        "Scales the specified mesh.",

        par_shapes_mesh_p.INOUT("mesh", "the mesh to scale"),
        float.IN("x", "the X axis scale factor"),
        float.IN("y", "the Y axis scale factor"),
        float.IN("z", "the Z axis scale factor")
    )

    void(
        "merge_and_free",
        "Merges two shapes and frees the source shape.",

        par_shapes_mesh_p.INOUT("dst", "the destination mesh"),
        par_shapes_mesh_p.IN("src", "the source mesh")
    )

    void(
        "invert",
        "Reverses the winding of a run of faces. Useful when drawing the inside of a Cornell Box. Pass 0 for {@code nfaces} to reverse every face in the mesh.",

        par_shapes_mesh_p.INOUT("mesh", "the mesh to reverse"),
        int.IN("startface", "the index of the first face to reverse"),
        int.IN("nfaces", "the number of faces to reverse")
    )

    void(
        "remove_degenerate",
        "Removes all triangles whose area is less than {@code minarea}.",

        par_shapes_mesh_p.INOUT("mesh", "the mesh to cleanup"),
        float.IN("minarea", "triangles with an area below this value will be removed")
    )

    void(
        "unweld",
        """
        Dereferences the entire index buffer and replaces the point list.

        This creates an inefficient structure, but is useful for drawing facets. If {@code create_indices} is true, a trivial "0 1 2 3..." index buffer is
        generated.
        """,

        par_shapes_mesh_p.INOUT("mesh", "the mesh to unweld"),
        bool.IN("create_indices", "if an index buffer should be generated")
    )

    par_shapes_mesh_p(
        "weld",
        "Merges colocated verts, builds a new index buffer, and returns the optimized mesh.",

        const..par_shapes_mesh_p.IN("mesh", "the mesh to weld"),
        float.IN("epsilon", "the maximum distance to consider when welding vertices"),
        Check("mesh.npoints()")..nullable..PAR_SHAPES_T_p.OUT(
            "mapping",
            "null, or a pointer to {@code npoints} 16-bit integers, which gets filled with the mapping from old vertex indices to new indices"
        )
    )

    void(
        "compute_normals",
        "Computes smooth normals by averaging adjacent facet normals.",

        par_shapes_mesh_p.INOUT("mesh", "the mesh")
    )
}
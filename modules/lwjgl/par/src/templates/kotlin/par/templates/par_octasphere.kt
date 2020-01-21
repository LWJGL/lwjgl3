/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package par.templates

import org.lwjgl.generator.*
import par.*

val par_octasphere = "ParOctasphere".nativeClass(Module.PAR, prefix = "par_octasphere_") {
    nativeDirective(
        """#define PAR_OCTASPHERE_IMPLEMENTATION
DISABLE_WARNINGS()
#include "par_octasphere.h"
ENABLE_WARNINGS()""")

    documentation =
        """
        Bindings to ${url("https://prideout.net/blog/octasphere", "par_octasphere.h")}, a tiny malloc-free library that generates triangle meshes for spheres,
        rounded boxes, and capsules.

        Usage example:
        ${codeBlock("""
// Specify a 100x100x20 rounded box.
const par_octasphere_config cfg = {
  .corner_radius = 5,
  .width = 100,
  .height = 100,
  .depth = 20,
  .num_subdivisions = 3,
};

// Allocate memory for the mesh and opt-out of normals.
uint32_t num_indices;
uint32_t num_vertices;
par_octasphere_get_counts(&cfg, &num_indices, &num_vertices);
par_octasphere_mesh mesh = {
  .positions = malloc(sizeof(float) * 3 * num_vertices),
  .normals = NULL,
  .texcoords = malloc(sizeof(float) * 2 * num_vertices),
  .indices = malloc(sizeof(uint16_t) * num_indices),
};

// Generate vertex coordinates, UV's, and triangle indices.
par_octasphere_populate(&cfg, &mesh);""")}

        To generate a sphere: set width, height, and depth to 0 in your configuration. To generate a capsule shape: set only two of these dimensions to 0.
        """

    IntConstant("", "PAR_OCTASPHERE_MAX_SUBDIVISIONS".."5")

    EnumConstant(
        "{@code par_octasphere_uv_mode}",

        "UV_LATLONG".enum
    )

    EnumConstant(
        "{@code par_octasphere_normals_mode}",

        "NORMALS_SMOOTH".enum
    )

    void(
        "get_counts",
        "Computes the maximum possible number of indices and vertices for the given octasphere config.",

        par_octasphere_config.const.p("config", ""),
        Check(1)..uint32_t.p("num_indices", ""),
        Check(1)..uint32_t.p("num_vertices", "")
    )

    void(
        "populate",
        "Populates a pre-allocated mesh structure with indices and vertices.",

        par_octasphere_config.const.p("config", ""),
        par_octasphere_mesh.p("mesh", "")
    )
}
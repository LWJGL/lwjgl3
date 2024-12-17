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

    IntConstant("PAR_OCTASPHERE_MAX_SUBDIVISIONS".."5")

    EnumConstant(
        "UV_LATLONG".enum
    )

    EnumConstant(
        "NORMALS_SMOOTH".enum
    )

    void(
        "get_counts",

        par_octasphere_config.const.p("config"),
        Check(1)..uint32_t.p("num_indices"),
        Check(1)..uint32_t.p("num_vertices")
    )

    void(
        "populate",

        par_octasphere_config.const.p("config"),
        par_octasphere_mesh.p("mesh")
    )
}
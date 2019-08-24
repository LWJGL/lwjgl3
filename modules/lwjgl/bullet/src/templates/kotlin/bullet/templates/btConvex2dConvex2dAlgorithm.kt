/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btConvex2dConvex2dAlgorithm = "BTConvex2dConvex2dAlgorithm".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "Convex2dConvex2dAlgorithm_CreateFunc_new",
        "",

        opaque_p("simplexSolver", ""),
        opaque_p("pdSolver", "")
    )

    int(
        "Convex2dConvex2dAlgorithm_CreateFunc_getMinimumPointsPerturbationThreshold",
        "",

        opaque_p("obj", "")
    )

    int(
        "Convex2dConvex2dAlgorithm_CreateFunc_getNumPerturbationIterations",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "Convex2dConvex2dAlgorithm_CreateFunc_getPdSolver",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "Convex2dConvex2dAlgorithm_CreateFunc_getSimplexSolver",
        "",

        opaque_p("obj", "")
    )

    void(
        "Convex2dConvex2dAlgorithm_CreateFunc_setMinimumPointsPerturbationThreshold",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "Convex2dConvex2dAlgorithm_CreateFunc_setNumPerturbationIterations",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "Convex2dConvex2dAlgorithm_CreateFunc_setPdSolver",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "Convex2dConvex2dAlgorithm_CreateFunc_setSimplexSolver",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    opaque_p(
        "Convex2dConvex2dAlgorithm_new",
        "",

        opaque_p("mf", ""),
        opaque_p("ci", ""),
        opaque_p("body0Wrap", ""),
        opaque_p("body1Wrap", ""),
        opaque_p("simplexSolver", ""),
        opaque_p("pdSolver", ""),
        int("numPerturbationIterations", ""),
        int("minimumPointsPerturbationThreshold", "")
    )

    opaque_p(
        "Convex2dConvex2dAlgorithm_getManifold",
        "",

        opaque_p("obj", "")
    )

    void(
        "Convex2dConvex2dAlgorithm_setLowLevelOfDetail",
        "",

        opaque_p("obj", ""),
        bool("useLowLevel", "")
    )

}
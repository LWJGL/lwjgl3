/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btConvexConvexAlgorithm = "BTConvexConvexAlgorithm".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "ConvexConvexAlgorithm_CreateFunc_new",
        "",

        opaque_p("pdSolver", "")
    )

    int(
        "ConvexConvexAlgorithm_CreateFunc_getMinimumPointsPerturbationThreshold",
        "",

        opaque_p("obj", "")
    )

    int(
        "ConvexConvexAlgorithm_CreateFunc_getNumPerturbationIterations",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "ConvexConvexAlgorithm_CreateFunc_getPdSolver",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConvexConvexAlgorithm_CreateFunc_setMinimumPointsPerturbationThreshold",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "ConvexConvexAlgorithm_CreateFunc_setNumPerturbationIterations",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "ConvexConvexAlgorithm_CreateFunc_setPdSolver",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    opaque_p(
        "ConvexConvexAlgorithm_new",
        "",

        opaque_p("mf", ""),
        opaque_p("ci", ""),
        opaque_p("body0Wrap", ""),
        opaque_p("body1Wrap", ""),
        opaque_p("pdSolver", ""),
        int("numPerturbationIterations", ""),
        int("minimumPointsPerturbationThreshold", "")
    )

    opaque_p(
        "ConvexConvexAlgorithm_getManifold",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConvexConvexAlgorithm_setLowLevelOfDetail",
        "",

        opaque_p("obj", ""),
        bool("useLowLevel", "")
    )

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btGImpactCollisionAlgorithm = "BTGImpactCollisionAlgorithm".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "GImpactCollisionAlgorithm_CreateFunc_new",
        "",

        void()
    )

    opaque_p(
        "GImpactCollisionAlgorithm_new",
        "",

        opaque_p("ci", ""),
        opaque_p("body0Wrap", ""),
        opaque_p("body1Wrap", "")
    )

    int(
        "GImpactCollisionAlgorithm_getFace0",
        "",

        opaque_p("obj", "")
    )

    int(
        "GImpactCollisionAlgorithm_getFace1",
        "",

        opaque_p("obj", "")
    )

    int(
        "GImpactCollisionAlgorithm_getPart0",
        "",

        opaque_p("obj", "")
    )

    int(
        "GImpactCollisionAlgorithm_getPart1",
        "",

        opaque_p("obj", "")
    )

    void(
        "GImpactCollisionAlgorithm_gimpact_vs_compoundshape",
        "",

        opaque_p("obj", ""),
        opaque_p("body0Wrap", ""),
        opaque_p("body1Wrap", ""),
        opaque_p("shape0", ""),
        opaque_p("shape1", ""),
        bool("swapped", "")
    )

    void(
        "GImpactCollisionAlgorithm_gimpact_vs_concave",
        "",

        opaque_p("obj", ""),
        opaque_p("body0Wrap", ""),
        opaque_p("body1Wrap", ""),
        opaque_p("shape0", ""),
        opaque_p("shape1", ""),
        bool("swapped", "")
    )

    void(
        "GImpactCollisionAlgorithm_gimpact_vs_gimpact",
        "",

        opaque_p("obj", ""),
        opaque_p("body0Wrap", ""),
        opaque_p("body1Wrap", ""),
        opaque_p("shape0", ""),
        opaque_p("shape1", "")
    )

    void(
        "GImpactCollisionAlgorithm_gimpact_vs_shape",
        "",

        opaque_p("obj", ""),
        opaque_p("body0Wrap", ""),
        opaque_p("body1Wrap", ""),
        opaque_p("shape0", ""),
        opaque_p("shape1", ""),
        bool("swapped", "")
    )

    opaque_p(
        "GImpactCollisionAlgorithm_internalGetResultOut",
        "",

        opaque_p("obj", "")
    )

    void(
        "GImpactCollisionAlgorithm_registerAlgorithm",
        "",

        opaque_p("dispatcher", "")
    )

    void(
        "GImpactCollisionAlgorithm_setFace0",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "GImpactCollisionAlgorithm_setFace1",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "GImpactCollisionAlgorithm_setPart0",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "GImpactCollisionAlgorithm_setPart1",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

}
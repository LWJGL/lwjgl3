/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btConvexPlaneCollisionAlgorithm = "BTConvexPlaneCollisionAlgorithm".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "ConvexPlaneCollisionAlgorithm_CreateFunc_new",
        "",

        void()
    )

    int(
        "ConvexPlaneCollisionAlgorithm_CreateFunc_getMinimumPointsPerturbationThreshold",
        "",

        opaque_p("obj", "")
    )

    int(
        "ConvexPlaneCollisionAlgorithm_CreateFunc_getNumPerturbationIterations",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConvexPlaneCollisionAlgorithm_CreateFunc_setMinimumPointsPerturbationThreshold",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "ConvexPlaneCollisionAlgorithm_CreateFunc_setNumPerturbationIterations",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    opaque_p(
        "ConvexPlaneCollisionAlgorithm_new",
        "",

        opaque_p("mf", ""),
        opaque_p("ci", ""),
        opaque_p("body0Wrap", ""),
        opaque_p("body1Wrap", ""),
        bool("isSwapped", ""),
        int("numPerturbationIterations", ""),
        int("minimumPointsPerturbationThreshold", "")
    )

    void(
        "ConvexPlaneCollisionAlgorithm_collideSingleContact",
        "",

        opaque_p("obj", ""),
        btQuaternion.const.p("perturbeRot", ""),
        opaque_p("body0Wrap", ""),
        opaque_p("body1Wrap", ""),
        opaque_p("dispatchInfo", ""),
        opaque_p("resultOut", "")
    )

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btConvexConcaveCollisionAlgorithm = "BTConvexConcaveCollisionAlgorithm".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "ConvexTriangleCallback_new",
        "",

        opaque_p("dispatcher", ""),
        opaque_p("body0Wrap", ""),
        opaque_p("body1Wrap", ""),
        bool("isSwapped", "")
    )

    void(
        "ConvexTriangleCallback_clearCache",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConvexTriangleCallback_clearWrapperData",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConvexTriangleCallback_getAabbMax",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "ConvexTriangleCallback_getAabbMin",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p(
        "ConvexTriangleCallback_getManifoldPtr",
        "",

        opaque_p("obj", "")
    )

    int(
        "ConvexTriangleCallback_getTriangleCount",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConvexTriangleCallback_setManifoldPtr",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "ConvexTriangleCallback_setTimeStepAndCounters",
        "",

        opaque_p("obj", ""),
        btScalar("collisionMarginTriangle", ""),
        opaque_p("dispatchInfo", ""),
        opaque_p("convexBodyWrap", ""),
        opaque_p("triBodyWrap", ""),
        opaque_p("resultOut", "")
    )

    void(
        "ConvexTriangleCallback_setTriangleCount",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    opaque_p(
        "ConvexConcaveCollisionAlgorithm_CreateFunc_new",
        "",

        void()
    )

    opaque_p(
        "ConvexConcaveCollisionAlgorithm_SwappedCreateFunc_new",
        "",

        void()
    )

    opaque_p(
        "ConvexConcaveCollisionAlgorithm_new",
        "",

        opaque_p("ci", ""),
        opaque_p("body0Wrap", ""),
        opaque_p("body1Wrap", ""),
        bool("isSwapped", "")
    )

    void(
        "ConvexConcaveCollisionAlgorithm_clearCache",
        "",

        opaque_p("obj", "")
    )

}
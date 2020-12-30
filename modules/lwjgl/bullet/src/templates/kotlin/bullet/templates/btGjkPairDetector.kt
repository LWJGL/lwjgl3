/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btGjkPairDetector = "BTGjkPairDetector".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "GjkPairDetector_new",
        "",

        opaque_p("objectA", ""),
        opaque_p("objectB", ""),
        opaque_p("simplexSolver", ""),
        opaque_p("penetrationDepthSolver", "")
    )

    opaque_p(
        "GjkPairDetector_new2",
        "",

        opaque_p("objectA", ""),
        opaque_p("objectB", ""),
        int("shapeTypeA", ""),
        int("shapeTypeB", ""),
        btScalar("marginA", ""),
        btScalar("marginB", ""),
        opaque_p("simplexSolver", ""),
        opaque_p("penetrationDepthSolver", "")
    )

    void(
        "GjkPairDetector_getCachedSeparatingAxis",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "GjkPairDetector_getCachedSeparatingDistance",
        "",

        opaque_p("obj", "")
    )

    int(
        "GjkPairDetector_getCatchDegeneracies",
        "",

        opaque_p("obj", "")
    )

    void(
        "GjkPairDetector_getClosestPointsNonVirtual",
        "",

        opaque_p("obj", ""),
        opaque_p("input", ""),
        opaque_p("output", ""),
        opaque_p("debugDraw", "")
    )

    int(
        "GjkPairDetector_getCurIter",
        "",

        opaque_p("obj", "")
    )

    int(
        "GjkPairDetector_getDegenerateSimplex",
        "",

        opaque_p("obj", "")
    )

    int(
        "GjkPairDetector_getFixContactNormalDirection",
        "",

        opaque_p("obj", "")
    )

    int(
        "GjkPairDetector_getLastUsedMethod",
        "",

        opaque_p("obj", "")
    )

    void(
        "GjkPairDetector_setCachedSeparatingAxis",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("seperatingAxis", "")
    )

    void(
        "GjkPairDetector_setCatchDegeneracies",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "GjkPairDetector_setCurIter",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "GjkPairDetector_setDegenerateSimplex",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "GjkPairDetector_setFixContactNormalDirection",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "GjkPairDetector_setIgnoreMargin",
        "",

        opaque_p("obj", ""),
        bool("ignoreMargin", "")
    )

    void(
        "GjkPairDetector_setLastUsedMethod",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "GjkPairDetector_setMinkowskiA",
        "",

        opaque_p("obj", ""),
        opaque_p("minkA", "")
    )

    void(
        "GjkPairDetector_setMinkowskiB",
        "",

        opaque_p("obj", ""),
        opaque_p("minkB", "")
    )

    void(
        "GjkPairDetector_setPenetrationDepthSolver",
        "",

        opaque_p("obj", ""),
        opaque_p("penetrationDepthSolver", "")
    )

}
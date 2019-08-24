/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btGhostObject = "BTGhostObject".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "GhostObject_new",
        "",

        void()
    )

    void(
        "GhostObject_addOverlappingObjectInternal",
        "",

        opaque_p("obj", ""),
        opaque_p("otherProxy", ""),
        opaque_p("thisProxy", "")
    )

    void(
        "GhostObject_convexSweepTest",
        "",

        opaque_p("obj", ""),
        opaque_p("castShape", ""),
        btTransform.const.p("convexFromWorld", ""),
        btTransform.const.p("convexToWorld", ""),
        opaque_p("resultCallback", ""),
        btScalar("allowedCcdPenetration", "")
    )

    int(
        "GhostObject_getNumOverlappingObjects",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "GhostObject_getOverlappingObject",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    opaque_p(
        "GhostObject_getOverlappingPairs",
        "",

        opaque_p("obj", "")
    )

    void(
        "GhostObject_rayTest",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("rayFromWorld", ""),
        btVector3.const.p("rayToWorld", ""),
        opaque_p("resultCallback", "")
    )

    void(
        "GhostObject_removeOverlappingObjectInternal",
        "",

        opaque_p("obj", ""),
        opaque_p("otherProxy", ""),
        opaque_p("dispatcher", ""),
        opaque_p("thisProxy", "")
    )

    opaque_p(
        "GhostObject_upcast",
        "",

        opaque_p("colObj", "")
    )

    opaque_p(
        "PairCachingGhostObject_new",
        "",

        void()
    )

    opaque_p(
        "PairCachingGhostObject_getOverlappingPairCache",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "GhostPairCallback_new",
        "",

        void()
    )

}
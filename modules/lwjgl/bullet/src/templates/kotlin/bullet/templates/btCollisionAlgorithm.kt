/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btCollisionAlgorithm = "BTCollisionAlgorithm".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "CollisionAlgorithmConstructionInfo_new",
        "",

        void()
    )

    opaque_p(
        "CollisionAlgorithmConstructionInfo_new2",
        "",

        opaque_p("dispatcher", ""),
        int("temp", "")
    )

    opaque_p(
        "CollisionAlgorithmConstructionInfo_getDispatcher1",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CollisionAlgorithmConstructionInfo_getManifold",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionAlgorithmConstructionInfo_setDispatcher1",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "CollisionAlgorithmConstructionInfo_setManifold",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "CollisionAlgorithmConstructionInfo_delete",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "CollisionAlgorithm_calculateTimeOfImpact",
        "",

        opaque_p("obj", ""),
        opaque_p("body0", ""),
        opaque_p("body1", ""),
        opaque_p("dispatchInfo", ""),
        opaque_p("resultOut", "")
    )

    void(
        "CollisionAlgorithm_getAllContactManifolds",
        "",

        opaque_p("obj", ""),
        opaque_p("manifoldArray", "")
    )

    void(
        "CollisionAlgorithm_processCollision",
        "",

        opaque_p("obj", ""),
        opaque_p("body0Wrap", ""),
        opaque_p("body1Wrap", ""),
        opaque_p("dispatchInfo", ""),
        opaque_p("resultOut", "")
    )

    void(
        "CollisionAlgorithm_delete",
        "",

        opaque_p("obj", "")
    )

}
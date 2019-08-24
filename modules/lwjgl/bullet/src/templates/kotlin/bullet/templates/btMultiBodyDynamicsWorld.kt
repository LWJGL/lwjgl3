/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btMultiBodyDynamicsWorld = "BTMultiBodyDynamicsWorld".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "MultiBodyDynamicsWorld_new",
        "",

        opaque_p("dispatcher", ""),
        opaque_p("pairCache", ""),
        opaque_p("constraintSolver", ""),
        opaque_p("collisionConfiguration", "")
    )

    void(
        "MultiBodyDynamicsWorld_addMultiBody",
        "",

        opaque_p("obj", ""),
        opaque_p("body", ""),
        int("group", ""),
        int("mask", "")
    )

    void(
        "MultiBodyDynamicsWorld_addMultiBodyConstraint",
        "",

        opaque_p("obj", ""),
        opaque_p("constraint", "")
    )

    void(
        "MultiBodyDynamicsWorld_clearMultiBodyConstraintForces",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultiBodyDynamicsWorld_clearMultiBodyForces",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultiBodyDynamicsWorld_debugDrawMultiBodyConstraint",
        "",

        opaque_p("obj", ""),
        opaque_p("constraint", "")
    )

    void(
        "MultiBodyDynamicsWorld_forwardKinematics",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "MultiBodyDynamicsWorld_getMultiBody",
        "",

        opaque_p("obj", ""),
        int("mbIndex", "")
    )

    opaque_p(
        "MultiBodyDynamicsWorld_getMultiBodyConstraint",
        "",

        opaque_p("obj", ""),
        int("constraintIndex", "")
    )

    int(
        "MultiBodyDynamicsWorld_getNumMultibodies",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultiBodyDynamicsWorld_getNumMultiBodyConstraints",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultiBodyDynamicsWorld_integrateTransforms",
        "",

        opaque_p("obj", ""),
        btScalar("timeStep", "")
    )

    void(
        "MultiBodyDynamicsWorld_removeMultiBody",
        "",

        opaque_p("obj", ""),
        opaque_p("body", "")
    )

    void(
        "MultiBodyDynamicsWorld_removeMultiBodyConstraint",
        "",

        opaque_p("obj", ""),
        opaque_p("constraint", "")
    )

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btDynamicsWorld = "BTDynamicsWorld".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    void(
        "DynamicsWorld_addAction",
        "",

        opaque_p("obj", ""),
        opaque_p("action", "")
    )

    void(
        "DynamicsWorld_addConstraint",
        "",

        opaque_p("obj", ""),
        opaque_p("constraint", ""),
        bool("disableCollisionsBetweenLinkedBodies", "")
    )

    void(
        "DynamicsWorld_addRigidBody",
        "",

        opaque_p("obj", ""),
        opaque_p("body", "")
    )

    void(
        "DynamicsWorld_addRigidBody2",
        "",

        opaque_p("obj", ""),
        opaque_p("body", ""),
        int("group", ""),
        int("mask", "")
    )

    void(
        "DynamicsWorld_clearForces",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "DynamicsWorld_getConstraint",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    opaque_p(
        "DynamicsWorld_getConstraintSolver",
        "",

        opaque_p("obj", "")
    )

    void(
        "DynamicsWorld_getGravity",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    int(
        "DynamicsWorld_getNumConstraints",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "DynamicsWorld_getSolverInfo",
        "",

        opaque_p("obj", "")
    )

    int(
        "DynamicsWorld_getWorldType",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "DynamicsWorld_getWorldUserInfo",
        "",

        opaque_p("obj", "")
    )

    void(
        "DynamicsWorld_removeAction",
        "",

        opaque_p("obj", ""),
        opaque_p("action", "")
    )

    void(
        "DynamicsWorld_removeConstraint",
        "",

        opaque_p("obj", ""),
        opaque_p("constraint", "")
    )

    void(
        "DynamicsWorld_removeRigidBody",
        "",

        opaque_p("obj", ""),
        opaque_p("body", "")
    )

    void(
        "DynamicsWorld_setConstraintSolver",
        "",

        opaque_p("obj", ""),
        opaque_p("solver", "")
    )

    void(
        "DynamicsWorld_setGravity",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("gravity", "")
    )

    void(
        "DynamicsWorld_setInternalTickCallback",
        "",

        opaque_p("obj", ""),
        opaque_p("cb", ""),
        opaque_p("worldUserInfo", ""),
        bool("isPreTick", "")
    )

    void(
        "DynamicsWorld_setWorldUserInfo",
        "",

        opaque_p("obj", ""),
        opaque_p("worldUserInfo", "")
    )

    int(
        "DynamicsWorld_stepSimulation",
        "",

        opaque_p("obj", ""),
        btScalar("timeStep", ""),
        int("maxSubSteps", ""),
        btScalar("fixedTimeStep", "")
    )

    void(
        "DynamicsWorld_synchronizeMotionStates",
        "",

        opaque_p("obj", "")
    )

}
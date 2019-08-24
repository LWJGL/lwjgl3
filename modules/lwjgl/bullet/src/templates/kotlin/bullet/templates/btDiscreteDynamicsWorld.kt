/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btDiscreteDynamicsWorld = "BTDiscreteDynamicsWorld".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "DiscreteDynamicsWorld_new",
        "",

        opaque_p("dispatcher", ""),
        opaque_p("pairCache", ""),
        opaque_p("constraintSolver", ""),
        opaque_p("collisionConfiguration", "")
    )

    void(
        "DiscreteDynamicsWorld_applyGravity",
        "",

        opaque_p("obj", "")
    )

    void(
        "DiscreteDynamicsWorld_debugDrawConstraint",
        "",

        opaque_p("obj", ""),
        opaque_p("constraint", "")
    )

    bool(
        "DiscreteDynamicsWorld_getApplySpeculativeContactRestitution",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "DiscreteDynamicsWorld_getCollisionWorld",
        "",

        opaque_p("obj", "")
    )

    bool(
        "DiscreteDynamicsWorld_getLatencyMotionStateInterpolation",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "DiscreteDynamicsWorld_getSimulationIslandManager",
        "",

        opaque_p("obj", "")
    )

    bool(
        "DiscreteDynamicsWorld_getSynchronizeAllMotionStates",
        "",

        opaque_p("obj", "")
    )

    void(
        "DiscreteDynamicsWorld_setApplySpeculativeContactRestitution",
        "",

        opaque_p("obj", ""),
        bool("enable", "")
    )

    void(
        "DiscreteDynamicsWorld_setLatencyMotionStateInterpolation",
        "",

        opaque_p("obj", ""),
        bool("latencyInterpolation", "")
    )

    void(
        "DiscreteDynamicsWorld_setNumTasks",
        "",

        opaque_p("obj", ""),
        int("numTasks", "")
    )

    void(
        "DiscreteDynamicsWorld_setSynchronizeAllMotionStates",
        "",

        opaque_p("obj", ""),
        bool("synchronizeAll", "")
    )

    void(
        "DiscreteDynamicsWorld_synchronizeSingleMotionState",
        "",

        opaque_p("obj", ""),
        opaque_p("body", "")
    )

    void(
        "DiscreteDynamicsWorld_updateVehicles",
        "",

        opaque_p("obj", ""),
        btScalar("timeStep", "")
    )

}
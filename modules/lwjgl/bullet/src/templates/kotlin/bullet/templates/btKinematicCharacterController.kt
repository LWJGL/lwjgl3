/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btKinematicCharacterController = "BTKinematicCharacterController".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "KinematicCharacterController_new",
        "",

        opaque_p("ghostObject", ""),
        opaque_p("convexShape", ""),
        btScalar("stepHeight", "")
    )

    opaque_p(
        "KinematicCharacterController_new2",
        "",

        opaque_p("ghostObject", ""),
        opaque_p("convexShape", ""),
        btScalar("stepHeight", ""),
        btVector3.const.p("up", "")
    )

    void(
        "KinematicCharacterController_applyImpulse",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("v", "")
    )

    btScalar(
        "KinematicCharacterController_getAngularDamping",
        "",

        opaque_p("obj", "")
    )

    void(
        "KinematicCharacterController_getAngularVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "KinematicCharacterController_getFallSpeed",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "KinematicCharacterController_getGhostObject",
        "",

        opaque_p("obj", "")
    )

    void(
        "KinematicCharacterController_getGravity",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "KinematicCharacterController_getJumpSpeed",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "KinematicCharacterController_getLinearDamping",
        "",

        opaque_p("obj", "")
    )

    void(
        "KinematicCharacterController_getLinearVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "KinematicCharacterController_getMaxPenetrationDepth",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "KinematicCharacterController_getMaxSlope",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "KinematicCharacterController_getStepHeight",
        "",

        opaque_p("obj", "")
    )

    void(
        "KinematicCharacterController_getUp",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "KinematicCharacterController_setAngularDamping",
        "",

        opaque_p("obj", ""),
        btScalar("d", "")
    )

    void(
        "KinematicCharacterController_setAngularVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("velocity", "")
    )

    void(
        "KinematicCharacterController_setFallSpeed",
        "",

        opaque_p("obj", ""),
        btScalar("fallSpeed", "")
    )

    void(
        "KinematicCharacterController_setGravity",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("gravity", "")
    )

    void(
        "KinematicCharacterController_setJumpSpeed",
        "",

        opaque_p("obj", ""),
        btScalar("jumpSpeed", "")
    )

    void(
        "KinematicCharacterController_setLinearDamping",
        "",

        opaque_p("obj", ""),
        btScalar("d", "")
    )

    void(
        "KinematicCharacterController_setLinearVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("velocity", "")
    )

    void(
        "KinematicCharacterController_setMaxJumpHeight",
        "",

        opaque_p("obj", ""),
        btScalar("maxJumpHeight", "")
    )

    void(
        "KinematicCharacterController_setMaxPenetrationDepth",
        "",

        opaque_p("obj", ""),
        btScalar("d", "")
    )

    void(
        "KinematicCharacterController_setMaxSlope",
        "",

        opaque_p("obj", ""),
        btScalar("slopeRadians", "")
    )

    void(
        "KinematicCharacterController_setStepHeight",
        "",

        opaque_p("obj", ""),
        btScalar("h", "")
    )

    void(
        "KinematicCharacterController_setUp",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("up", "")
    )

    void(
        "KinematicCharacterController_setUseGhostSweepTest",
        "",

        opaque_p("obj", ""),
        bool("useGhostObjectSweepTest", "")
    )

}
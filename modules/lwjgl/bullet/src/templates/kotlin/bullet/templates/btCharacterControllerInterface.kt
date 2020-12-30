/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btCharacterControllerInterface = "BTCharacterControllerInterface".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    bool(
        "CharacterControllerInterface_canJump",
        "",

        opaque_p("obj", "")
    )

    void(
        "CharacterControllerInterface_jump",
        "",

        opaque_p("obj", "")
    )

    void(
        "CharacterControllerInterface_jump2",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("dir", "")
    )

    bool(
        "CharacterControllerInterface_onGround",
        "",

        opaque_p("obj", "")
    )

    void(
        "CharacterControllerInterface_playerStep",
        "",

        opaque_p("obj", ""),
        opaque_p("collisionWorld", ""),
        btScalar("dt", "")
    )

    void(
        "CharacterControllerInterface_preStep",
        "",

        opaque_p("obj", ""),
        opaque_p("collisionWorld", "")
    )

    void(
        "CharacterControllerInterface_reset",
        "",

        opaque_p("obj", ""),
        opaque_p("collisionWorld", "")
    )

    void(
        "CharacterControllerInterface_setUpInterpolate",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "CharacterControllerInterface_setWalkDirection",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("walkDirection", "")
    )

    void(
        "CharacterControllerInterface_setVelocityForTimeInterval",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("velocity", ""),
        btScalar("timeInterval", "")
    )

    void(
        "CharacterControllerInterface_warp",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("origin", "")
    )

}
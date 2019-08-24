/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btMotionState = "BTMotionState".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "MotionStateWrapper_new",
        "",

        opaque_p("getWorldTransformCallback", ""),
        opaque_p("setWorldTransformCallback", "")
    )

    void(
        "MotionState_getWorldTransform",
        "",

        opaque_p("obj", ""),
        btTransform.p("worldTrans", "")
    )

    void(
        "MotionState_setWorldTransform",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("worldTrans", "")
    )

    void(
        "MotionState_delete",
        "",

        opaque_p("obj", "")
    )

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btDefaultMotionState = "BTDefaultMotionState".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "DefaultMotionState_new",
        "",

        void()
    )

    opaque_p(
        "DefaultMotionState_new2",
        "",

        btTransform.const.p("startTrans", "")
    )

    opaque_p(
        "DefaultMotionState_new3",
        "",

        btTransform.const.p("startTrans", ""),
        btTransform.const.p("centerOfMassOffset", "")
    )

    void(
        "DefaultMotionState_getCenterOfMassOffset",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "DefaultMotionState_getGraphicsWorldTrans",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "DefaultMotionState_getStartWorldTrans",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    opaque_p(
        "DefaultMotionState_getUserPointer",
        "",

        opaque_p("obj", "")
    )

    void(
        "DefaultMotionState_setCenterOfMassOffset",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("value", "")
    )

    void(
        "DefaultMotionState_setGraphicsWorldTrans",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("value", "")
    )

    void(
        "DefaultMotionState_setStartWorldTrans",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("value", "")
    )

    void(
        "DefaultMotionState_setUserPointer",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

}
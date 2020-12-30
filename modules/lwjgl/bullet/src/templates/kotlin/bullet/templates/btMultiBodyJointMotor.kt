/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btMultiBodyJointMotor = "BTMultiBodyJointMotor".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "MultiBodyJointMotor_new",
        "",

        opaque_p("body", ""),
        int("link", ""),
        btScalar("desiredVelocity", ""),
        btScalar("maxMotorImpulse", "")
    )

    opaque_p(
        "MultiBodyJointMotor_new2",
        "",

        opaque_p("body", ""),
        int("link", ""),
        int("linkDoF", ""),
        btScalar("desiredVelocity", ""),
        btScalar("maxMotorImpulse", "")
    )

    void(
        "MultiBodyJointMotor_setPositionTarget",
        "",

        opaque_p("obj", ""),
        btScalar("posTarget", "")
    )

    void(
        "MultiBodyJointMotor_setPositionTarget2",
        "",

        opaque_p("obj", ""),
        btScalar("posTarget", ""),
        btScalar("kp", "")
    )

    void(
        "MultiBodyJointMotor_setVelocityTarget",
        "",

        opaque_p("obj", ""),
        btScalar("velTarget", "")
    )

    void(
        "MultiBodyJointMotor_setVelocityTarget2",
        "",

        opaque_p("obj", ""),
        btScalar("velTarget", ""),
        btScalar("kd", "")
    )

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btTransformUtil = "BTTransformUtil".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    void(
        "TransformUtil_calculateDiffAxisAngle",
        "",

        btTransform.const.p("transform0", ""),
        btTransform.const.p("transform1", ""),
        btVector3.p("axis", ""),
        Check(1)..btScalar.p("angle", "")
    )

    void(
        "TransformUtil_calculateDiffAxisAngleQuaternion",
        "",

        btQuaternion.const.p("orn0", ""),
        btQuaternion.const.p("orn1a", ""),
        btVector3.p("axis", ""),
        Check(1)..btScalar.p("angle", "")
    )

    void(
        "TransformUtil_calculateVelocity",
        "",

        btTransform.const.p("transform0", ""),
        btTransform.const.p("transform1", ""),
        btScalar("timeStep", ""),
        btVector3.p("linVel", ""),
        btVector3.p("angVel", "")
    )

    void(
        "TransformUtil_calculateVelocityQuaternion",
        "",

        btVector3.const.p("pos0", ""),
        btVector3.const.p("pos1", ""),
        btQuaternion.const.p("orn0", ""),
        btQuaternion.const.p("orn1", ""),
        btScalar("timeStep", ""),
        btVector3.p("linVel", ""),
        btVector3.p("angVel", "")
    )

    void(
        "TransformUtil_integrateTransform",
        "",

        btTransform.const.p("curTrans", ""),
        btVector3.const.p("linvel", ""),
        btVector3.const.p("angvel", ""),
        btScalar("timeStep", ""),
        btTransform.p("predictedTransform", "")
    )

    opaque_p(
        "ConvexSeparatingDistanceUtil_new",
        "",

        btScalar("boundingRadiusA", ""),
        btScalar("boundingRadiusB", "")
    )

    btScalar(
        "ConvexSeparatingDistanceUtil_getConservativeSeparatingDistance",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConvexSeparatingDistanceUtil_initSeparatingDistance",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("separatingVector", ""),
        btScalar("separatingDistance", ""),
        btTransform.const.p("transA", ""),
        btTransform.const.p("transB", "")
    )

    void(
        "ConvexSeparatingDistanceUtil_updateSeparatingDistance",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("transA", ""),
        btTransform.const.p("transB", "")
    )

    void(
        "ConvexSeparatingDistanceUtil_delete",
        "",

        opaque_p("obj", "")
    )

}
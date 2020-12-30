/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btCollisionShape = "BTCollisionShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    void(
        "CollisionShape_calculateLocalInertia",
        "",

        opaque_p("obj", ""),
        btScalar("mass", ""),
        btVector3.p("inertia", "")
    )

    int(
        "CollisionShape_calculateSerializeBufferSize",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionShape_calculateTemporalAabb",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("curTrans", ""),
        btVector3.const.p("linvel", ""),
        btVector3.const.p("angvel", ""),
        btScalar("timeStep", ""),
        btVector3.p("temporalAabbMin", ""),
        btVector3.p("temporalAabbMax", "")
    )

    void(
        "CollisionShape_getAabb",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("t", ""),
        btVector3.p("aabbMin", ""),
        btVector3.p("aabbMax", "")
    )

    btScalar(
        "CollisionShape_getAngularMotionDisc",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionShape_getAnisotropicRollingFrictionDirection",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "CollisionShape_getBoundingSphere",
        "",

        opaque_p("obj", ""),
        btVector3.p("center", ""),
        Check(1)..btScalar.p("radius", "")
    )

    btScalar(
        "CollisionShape_getContactBreakingThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("defaultContactThresholdFactor", "")
    )

    void(
        "CollisionShape_getLocalScaling",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "CollisionShape_getMargin",
        "",

        opaque_p("obj", "")
    )

    charUTF8.const.p(
        "CollisionShape_getName",
        "",

        opaque_p("obj", "")
    )

    int(
        "CollisionShape_getShapeType",
        "",

        opaque_p("obj", "")
    )

    int(
        "CollisionShape_getUserIndex",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CollisionShape_getUserPointer",
        "",

        opaque_p("obj", "")
    )

    bool(
        "CollisionShape_isCompound",
        "",

        opaque_p("obj", "")
    )

    bool(
        "CollisionShape_isConcave",
        "",

        opaque_p("obj", "")
    )

    bool(
        "CollisionShape_isConvex",
        "",

        opaque_p("obj", "")
    )

    bool(
        "CollisionShape_isConvex2d",
        "",

        opaque_p("obj", "")
    )

    bool(
        "CollisionShape_isInfinite",
        "",

        opaque_p("obj", "")
    )

    bool(
        "CollisionShape_isNonMoving",
        "",

        opaque_p("obj", "")
    )

    bool(
        "CollisionShape_isPolyhedral",
        "",

        opaque_p("obj", "")
    )

    bool(
        "CollisionShape_isSoftBody",
        "",

        opaque_p("obj", "")
    )

    charUTF8.const.p(
        "CollisionShape_serialize",
        "",

        opaque_p("obj", ""),
        opaque_p("dataBuffer", ""),
        opaque_p("serializer", "")
    )

    void(
        "CollisionShape_serializeSingleShape",
        "",

        opaque_p("obj", ""),
        opaque_p("serializer", "")
    )

    void(
        "CollisionShape_setLocalScaling",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("scaling", "")
    )

    void(
        "CollisionShape_setMargin",
        "",

        opaque_p("obj", ""),
        btScalar("margin", "")
    )

    void(
        "CollisionShape_setUserIndex",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    void(
        "CollisionShape_setUserPointer",
        "",

        opaque_p("obj", ""),
        opaque_p("userPtr", "")
    )

    void(
        "CollisionShape_delete",
        "",

        opaque_p("obj", "")
    )

}
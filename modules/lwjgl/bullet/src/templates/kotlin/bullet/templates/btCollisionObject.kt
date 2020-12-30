/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btCollisionObject = "BTCollisionObject".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "CollisionObject_new",
        "",

        void()
    )

    void(
        "CollisionObject_activate",
        "",

        opaque_p("obj", ""),
        bool("forceActivation", "")
    )

    int(
        "CollisionObject_calculateSerializeBufferSize",
        "",

        opaque_p("obj", "")
    )

    bool(
        "CollisionObject_checkCollideWith",
        "",

        opaque_p("obj", ""),
        opaque_p("co", "")
    )

    bool(
        "CollisionObject_checkCollideWithOverride",
        "",

        opaque_p("obj", ""),
        opaque_p("co", "")
    )

    void(
        "CollisionObject_forceActivationState",
        "",

        opaque_p("obj", ""),
        int("newState", "")
    )

    int(
        "CollisionObject_getActivationState",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionObject_getAnisotropicFriction",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p(
        "CollisionObject_getBroadphaseHandle",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "CollisionObject_getCcdMotionThreshold",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "CollisionObject_getCcdSquareMotionThreshold",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "CollisionObject_getCcdSweptSphereRadius",
        "",

        opaque_p("obj", "")
    )

    int(
        "CollisionObject_getCollisionFlags",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CollisionObject_getCollisionShape",
        "",

        opaque_p("obj", "")
    )

    int(
        "CollisionObject_getCompanionId",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "CollisionObject_getContactDamping",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "CollisionObject_getContactProcessingThreshold",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "CollisionObject_getContactStiffness",
        "",

        opaque_p("obj", "")
    )

    bool(
        "CollisionObject_getCustomDebugColor",
        "",

        opaque_p("obj", ""),
        btVector3.p("colorRGB", "")
    )

    btScalar(
        "CollisionObject_getDeactivationTime",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "CollisionObject_getFriction",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "CollisionObject_getHitFraction",
        "",

        opaque_p("obj", "")
    )

    int(
        "CollisionObject_getInternalType",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionObject_getInterpolationAngularVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "CollisionObject_getInterpolationLinearVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "CollisionObject_getInterpolationWorldTransform",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    int(
        "CollisionObject_getIslandTag",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "CollisionObject_getRestitution",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "CollisionObject_getRollingFriction",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "CollisionObject_getSpinningFriction",
        "",

        opaque_p("obj", "")
    )

    int(
        "CollisionObject_getWorldArrayIndex",
        "",

        opaque_p("obj", "")
    )

    int(
        "CollisionObject_getUserIndex",
        "",

        opaque_p("obj", "")
    )

    int(
        "CollisionObject_getUserIndex2",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CollisionObject_getUserPointer",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionObject_getWorldTransform",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    bool(
        "CollisionObject_hasAnisotropicFriction",
        "",

        opaque_p("obj", ""),
        int("frictionMode", "")
    )

    bool(
        "CollisionObject_hasContactResponse",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CollisionObject_internalGetExtensionPointer",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionObject_internalSetExtensionPointer",
        "",

        opaque_p("obj", ""),
        opaque_p("pointer", "")
    )

    bool(
        "CollisionObject_isActive",
        "",

        opaque_p("obj", "")
    )

    bool(
        "CollisionObject_isKinematicObject",
        "",

        opaque_p("obj", "")
    )

    bool(
        "CollisionObject_isStaticObject",
        "",

        opaque_p("obj", "")
    )

    bool(
        "CollisionObject_isStaticOrKinematicObject",
        "",

        opaque_p("obj", "")
    )

    bool(
        "CollisionObject_mergesSimulationIslands",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionObject_removeCustomDebugColor",
        "",

        opaque_p("obj", "")
    )

    charUTF8.const.p(
        "CollisionObject_serialize",
        "",

        opaque_p("obj", ""),
        opaque_p("dataBuffer", ""),
        opaque_p("serializer", "")
    )

    void(
        "CollisionObject_serializeSingleObject",
        "",

        opaque_p("obj", ""),
        opaque_p("serializer", "")
    )

    void(
        "CollisionObject_setActivationState",
        "",

        opaque_p("obj", ""),
        int("newState", "")
    )

    void(
        "CollisionObject_setAnisotropicFriction",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("anisotropicFriction", ""),
        int("frictionMode", "")
    )

    void(
        "CollisionObject_setBroadphaseHandle",
        "",

        opaque_p("obj", ""),
        opaque_p("handle", "")
    )

    void(
        "CollisionObject_setCcdMotionThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("ccdMotionThreshold", "")
    )

    void(
        "CollisionObject_setCcdSweptSphereRadius",
        "",

        opaque_p("obj", ""),
        btScalar("radius", "")
    )

    void(
        "CollisionObject_setCollisionFlags",
        "",

        opaque_p("obj", ""),
        int("flags", "")
    )

    void(
        "CollisionObject_setCollisionShape",
        "",

        opaque_p("obj", ""),
        opaque_p("collisionShape", "")
    )

    void(
        "CollisionObject_setCompanionId",
        "",

        opaque_p("obj", ""),
        int("id", "")
    )

    void(
        "CollisionObject_setContactProcessingThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("contactProcessingThreshold", "")
    )

    void(
        "CollisionObject_setContactStiffnessAndDamping",
        "",

        opaque_p("obj", ""),
        btScalar("stiffness", ""),
        btScalar("damping", "")
    )

    void(
        "CollisionObject_setCustomDebugColor",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("colorRGB", "")
    )

    void(
        "CollisionObject_setDeactivationTime",
        "",

        opaque_p("obj", ""),
        btScalar("time", "")
    )

    void(
        "CollisionObject_setFriction",
        "",

        opaque_p("obj", ""),
        btScalar("frict", "")
    )

    void(
        "CollisionObject_setHitFraction",
        "",

        opaque_p("obj", ""),
        btScalar("hitFraction", "")
    )

    void(
        "CollisionObject_setIgnoreCollisionCheck",
        "",

        opaque_p("obj", ""),
        opaque_p("co", ""),
        bool("ignoreCollisionCheck", "")
    )

    void(
        "CollisionObject_setInterpolationAngularVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("angvel", "")
    )

    void(
        "CollisionObject_setInterpolationLinearVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("linvel", "")
    )

    void(
        "CollisionObject_setInterpolationWorldTransform",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("trans", "")
    )

    void(
        "CollisionObject_setIslandTag",
        "",

        opaque_p("obj", ""),
        int("tag", "")
    )

    void(
        "CollisionObject_setRestitution",
        "",

        opaque_p("obj", ""),
        btScalar("rest", "")
    )

    void(
        "CollisionObject_setRollingFriction",
        "",

        opaque_p("obj", ""),
        btScalar("frict", "")
    )

    void(
        "CollisionObject_setSpinningFriction",
        "",

        opaque_p("obj", ""),
        btScalar("frict", "")
    )

    void(
        "CollisionObject_setWorldArrayIndex",
        "",

        opaque_p("obj", ""),
        int("ix", "")
    )

    void(
        "CollisionObject_setUserIndex",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    void(
        "CollisionObject_setUserIndex2",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    void(
        "CollisionObject_setUserPointer",
        "",

        opaque_p("obj", ""),
        opaque_p("userPointer", "")
    )

    void(
        "CollisionObject_setWorldTransform",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("worldTrans", "")
    )

    void(
        "CollisionObject_delete",
        "",

        opaque_p("obj", "")
    )

}
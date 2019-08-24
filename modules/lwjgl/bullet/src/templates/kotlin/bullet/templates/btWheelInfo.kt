/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btWheelInfo = "BTWheelInfo".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "WheelInfoConstructionInfo_new",
        "",

        void()
    )

    bool(
        "WheelInfoConstructionInfo_getBIsFrontWheel",
        "",

        opaque_p("obj", "")
    )

    void(
        "WheelInfoConstructionInfo_getChassisConnectionCS",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "WheelInfoConstructionInfo_getFrictionSlip",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfoConstructionInfo_getMaxSuspensionForce",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfoConstructionInfo_getMaxSuspensionTravelCm",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfoConstructionInfo_getSuspensionRestLength",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfoConstructionInfo_getSuspensionStiffness",
        "",

        opaque_p("obj", "")
    )

    void(
        "WheelInfoConstructionInfo_getWheelAxleCS",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "WheelInfoConstructionInfo_getWheelDirectionCS",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "WheelInfoConstructionInfo_getWheelRadius",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfoConstructionInfo_getWheelsDampingCompression",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfoConstructionInfo_getWheelsDampingRelaxation",
        "",

        opaque_p("obj", "")
    )

    void(
        "WheelInfoConstructionInfo_setBIsFrontWheel",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "WheelInfoConstructionInfo_setChassisConnectionCS",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "WheelInfoConstructionInfo_setFrictionSlip",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfoConstructionInfo_setMaxSuspensionForce",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfoConstructionInfo_setMaxSuspensionTravelCm",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfoConstructionInfo_setSuspensionRestLength",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfoConstructionInfo_setSuspensionStiffness",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfoConstructionInfo_setWheelAxleCS",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "WheelInfoConstructionInfo_setWheelDirectionCS",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "WheelInfoConstructionInfo_setWheelRadius",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfoConstructionInfo_setWheelsDampingCompression",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfoConstructionInfo_setWheelsDampingRelaxation",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfoConstructionInfo_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "WheelInfo_RaycastInfo_new",
        "",

        void()
    )

    void(
        "WheelInfo_RaycastInfo_getContactNormalWS",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "WheelInfo_RaycastInfo_getContactPointWS",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p(
        "WheelInfo_RaycastInfo_getGroundObject",
        "",

        opaque_p("obj", "")
    )

    void(
        "WheelInfo_RaycastInfo_getHardPointWS",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    bool(
        "WheelInfo_RaycastInfo_getIsInContact",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfo_RaycastInfo_getSuspensionLength",
        "",

        opaque_p("obj", "")
    )

    void(
        "WheelInfo_RaycastInfo_getWheelAxleWS",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "WheelInfo_RaycastInfo_getWheelDirectionWS",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "WheelInfo_RaycastInfo_setContactNormalWS",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "WheelInfo_RaycastInfo_setContactPointWS",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "WheelInfo_RaycastInfo_setGroundObject",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "WheelInfo_RaycastInfo_setHardPointWS",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "WheelInfo_RaycastInfo_setIsInContact",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "WheelInfo_RaycastInfo_setSuspensionLength",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfo_RaycastInfo_setWheelAxleWS",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "WheelInfo_RaycastInfo_setWheelDirectionWS",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "WheelInfo_RaycastInfo_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "WheelInfo_new",
        "",

        opaque_p("ci", "")
    )

    bool(
        "WheelInfo_getBIsFrontWheel",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfo_getBrake",
        "",

        opaque_p("obj", "")
    )

    void(
        "WheelInfo_getChassisConnectionPointCS",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p(
        "WheelInfo_getClientInfo",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfo_getClippedInvContactDotSuspension",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfo_getDeltaRotation",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfo_getEngineForce",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfo_getFrictionSlip",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfo_getMaxSuspensionForce",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfo_getMaxSuspensionTravelCm",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "WheelInfo_getRaycastInfo",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfo_getRollInfluence",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfo_getRotation",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfo_getSkidInfo",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfo_getSteering",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfo_getSuspensionRelativeVelocity",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfo_getSuspensionRestLength",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfo_getSuspensionRestLength1",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfo_getSuspensionStiffness",
        "",

        opaque_p("obj", "")
    )

    void(
        "WheelInfo_getWheelAxleCS",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "WheelInfo_getWheelDirectionCS",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "WheelInfo_getWheelsDampingCompression",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfo_getWheelsDampingRelaxation",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfo_getWheelsRadius",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "WheelInfo_getWheelsSuspensionForce",
        "",

        opaque_p("obj", "")
    )

    void(
        "WheelInfo_getWorldTransform",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "WheelInfo_setBIsFrontWheel",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "WheelInfo_setBrake",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfo_setChassisConnectionPointCS",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "WheelInfo_setClientInfo",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "WheelInfo_setClippedInvContactDotSuspension",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfo_setDeltaRotation",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfo_setEngineForce",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfo_setFrictionSlip",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfo_setMaxSuspensionForce",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfo_setMaxSuspensionTravelCm",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfo_setRollInfluence",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfo_setRotation",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfo_setSkidInfo",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfo_setSteering",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfo_setSuspensionRelativeVelocity",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfo_setSuspensionRestLength1",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfo_setSuspensionStiffness",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfo_setWheelAxleCS",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "WheelInfo_setWheelDirectionCS",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "WheelInfo_setWheelsDampingCompression",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfo_setWheelsDampingRelaxation",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfo_setWheelsRadius",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfo_setWheelsSuspensionForce",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "WheelInfo_setWorldTransform",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("value", "")
    )

    void(
        "WheelInfo_updateWheel",
        "",

        opaque_p("obj", ""),
        opaque_p("chassis", ""),
        opaque_p("raycastInfo", "")
    )

    void(
        "WheelInfo_delete",
        "",

        opaque_p("obj", "")
    )

}
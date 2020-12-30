/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btRaycastVehicle = "BTRaycastVehicle".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "RaycastVehicle_btVehicleTuning_new",
        "",

        void()
    )

    btScalar(
        "RaycastVehicle_btVehicleTuning_getFrictionSlip",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RaycastVehicle_btVehicleTuning_getMaxSuspensionForce",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RaycastVehicle_btVehicleTuning_getMaxSuspensionTravelCm",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RaycastVehicle_btVehicleTuning_getSuspensionCompression",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RaycastVehicle_btVehicleTuning_getSuspensionDamping",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RaycastVehicle_btVehicleTuning_getSuspensionStiffness",
        "",

        opaque_p("obj", "")
    )

    void(
        "RaycastVehicle_btVehicleTuning_setFrictionSlip",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RaycastVehicle_btVehicleTuning_setMaxSuspensionForce",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RaycastVehicle_btVehicleTuning_setMaxSuspensionTravelCm",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RaycastVehicle_btVehicleTuning_setSuspensionCompression",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RaycastVehicle_btVehicleTuning_setSuspensionDamping",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RaycastVehicle_btVehicleTuning_setSuspensionStiffness",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RaycastVehicle_btVehicleTuning_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "RaycastVehicle_new",
        "",

        opaque_p("tuning", ""),
        opaque_p("chassis", ""),
        opaque_p("raycaster", "")
    )

    opaque_p(
        "RaycastVehicle_addWheel",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("connectionPointCS0", ""),
        btVector3.const.p("wheelDirectionCS0", ""),
        btVector3.const.p("wheelAxleCS", ""),
        btScalar("suspensionRestLength", ""),
        btScalar("wheelRadius", ""),
        opaque_p("tuning", ""),
        bool("isFrontWheel", "")
    )

    void(
        "RaycastVehicle_applyEngineForce",
        "",

        opaque_p("obj", ""),
        btScalar("force", ""),
        int("wheel", "")
    )

    void(
        "RaycastVehicle_getChassisWorldTransform",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    btScalar(
        "RaycastVehicle_getCurrentSpeedKmHour",
        "",

        opaque_p("obj", "")
    )

    int(
        "RaycastVehicle_getForwardAxis",
        "",

        opaque_p("obj", "")
    )

    void(
        "RaycastVehicle_getForwardVector",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    int(
        "RaycastVehicle_getNumWheels",
        "",

        opaque_p("obj", "")
    )

    int(
        "RaycastVehicle_getRightAxis",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "RaycastVehicle_getRigidBody",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RaycastVehicle_getSteeringValue",
        "",

        opaque_p("obj", ""),
        int("wheel", "")
    )

    int(
        "RaycastVehicle_getUpAxis",
        "",

        opaque_p("obj", "")
    )

    int(
        "RaycastVehicle_getUserConstraintId",
        "",

        opaque_p("obj", "")
    )

    int(
        "RaycastVehicle_getUserConstraintType",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "RaycastVehicle_getWheelInfo",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    opaque_p(
        "RaycastVehicle_getWheelInfo2",
        "",

        opaque_p("obj", "")
    )

    void(
        "RaycastVehicle_getWheelTransformWS",
        "",

        opaque_p("obj", ""),
        int("wheelIndex", ""),
        btTransform.p("value", "")
    )

    btScalar(
        "RaycastVehicle_rayCast",
        "",

        opaque_p("obj", ""),
        opaque_p("wheel", "")
    )

    void(
        "RaycastVehicle_resetSuspension",
        "",

        opaque_p("obj", "")
    )

    void(
        "RaycastVehicle_setBrake",
        "",

        opaque_p("obj", ""),
        btScalar("brake", ""),
        int("wheelIndex", "")
    )

    void(
        "RaycastVehicle_setCoordinateSystem",
        "",

        opaque_p("obj", ""),
        int("rightIndex", ""),
        int("upIndex", ""),
        int("forwardIndex", "")
    )

    void(
        "RaycastVehicle_setPitchControl",
        "",

        opaque_p("obj", ""),
        btScalar("pitch", "")
    )

    void(
        "RaycastVehicle_setSteeringValue",
        "",

        opaque_p("obj", ""),
        btScalar("steering", ""),
        int("wheel", "")
    )

    void(
        "RaycastVehicle_setUserConstraintId",
        "",

        opaque_p("obj", ""),
        int("uid", "")
    )

    void(
        "RaycastVehicle_setUserConstraintType",
        "",

        opaque_p("obj", ""),
        int("userConstraintType", "")
    )

    void(
        "RaycastVehicle_updateFriction",
        "",

        opaque_p("obj", ""),
        btScalar("timeStep", "")
    )

    void(
        "RaycastVehicle_updateSuspension",
        "",

        opaque_p("obj", ""),
        btScalar("deltaTime", "")
    )

    void(
        "RaycastVehicle_updateVehicle",
        "",

        opaque_p("obj", ""),
        btScalar("step", "")
    )

    void(
        "RaycastVehicle_updateWheelTransform",
        "",

        opaque_p("obj", ""),
        int("wheelIndex", "")
    )

    void(
        "RaycastVehicle_updateWheelTransform2",
        "",

        opaque_p("obj", ""),
        int("wheelIndex", ""),
        bool("interpolatedTransform", "")
    )

    void(
        "RaycastVehicle_updateWheelTransformsWS",
        "",

        opaque_p("obj", ""),
        opaque_p("wheel", "")
    )

    void(
        "RaycastVehicle_updateWheelTransformsWS2",
        "",

        opaque_p("obj", ""),
        opaque_p("wheel", ""),
        bool("interpolatedTransform", "")
    )

    opaque_p(
        "DefaultVehicleRaycaster_new",
        "",

        opaque_p("world", "")
    )

}
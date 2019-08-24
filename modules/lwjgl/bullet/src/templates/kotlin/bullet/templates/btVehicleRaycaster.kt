/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btVehicleRaycaster = "BTVehicleRaycaster".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "VehicleRaycaster_btVehicleRaycasterResult_new",
        "",

        void()
    )

    btScalar(
        "VehicleRaycaster_btVehicleRaycasterResult_getDistFraction",
        "",

        opaque_p("obj", "")
    )

    void(
        "VehicleRaycaster_btVehicleRaycasterResult_getHitNormalInWorld",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "VehicleRaycaster_btVehicleRaycasterResult_getHitPointInWorld",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "VehicleRaycaster_btVehicleRaycasterResult_setDistFraction",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "VehicleRaycaster_btVehicleRaycasterResult_setHitNormalInWorld",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "VehicleRaycaster_btVehicleRaycasterResult_setHitPointInWorld",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "VehicleRaycaster_btVehicleRaycasterResult_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "VehicleRaycaster_castRay",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("from", ""),
        btVector3.const.p("to", ""),
        opaque_p("result", "")
    )

    void(
        "VehicleRaycaster_delete",
        "",

        opaque_p("obj", "")
    )

}
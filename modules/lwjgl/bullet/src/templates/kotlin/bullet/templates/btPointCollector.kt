/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btPointCollector = "BTPointCollector".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "PointCollector_new",
        "",

        void()
    )

    btScalar(
        "PointCollector_getDistance",
        "",

        opaque_p("obj", "")
    )

    bool(
        "PointCollector_getHasResult",
        "",

        opaque_p("obj", "")
    )

    void(
        "PointCollector_getNormalOnBInWorld",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "PointCollector_getPointInWorld",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "PointCollector_setDistance",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "PointCollector_setHasResult",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "PointCollector_setNormalOnBInWorld",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "PointCollector_setPointInWorld",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

}
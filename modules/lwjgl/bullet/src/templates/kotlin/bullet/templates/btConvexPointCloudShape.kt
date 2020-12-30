/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btConvexPointCloudShape = "BTConvexPointCloudShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "ConvexPointCloudShape_new",
        "",

        void()
    )

    opaque_p(
        "ConvexPointCloudShape_new2",
        "",

        btVector3.p("points", ""),
        int("numPoints", ""),
        btVector3.const.p("localScaling", ""),
        bool("computeAabb", "")
    )

    int(
        "ConvexPointCloudShape_getNumPoints",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConvexPointCloudShape_getScaledPoint",
        "",

        opaque_p("obj", ""),
        int("index", ""),
        btVector3.p("value", "")
    )

    btVector3.p(
        "ConvexPointCloudShape_getUnscaledPoints",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConvexPointCloudShape_setPoints",
        "",

        opaque_p("obj", ""),
        btVector3.p("points", ""),
        int("numPoints", ""),
        bool("computeAabb", "")
    )

    void(
        "ConvexPointCloudShape_setPoints2",
        "",

        opaque_p("obj", ""),
        btVector3.p("points", ""),
        int("numPoints", ""),
        bool("computeAabb", ""),
        btVector3.const.p("localScaling", "")
    )

}
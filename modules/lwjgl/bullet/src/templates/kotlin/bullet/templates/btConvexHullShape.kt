/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btConvexHullShape = "BTConvexHullShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "ConvexHullShape_new",
        "",

        void()
    )

    opaque_p(
        "ConvexHullShape_new2",
        "",

        Unsafe..btScalar.const.p("points", "")
    )

    opaque_p(
        "ConvexHullShape_new3",
        "",

        btScalar.const.p("points", ""),
        AutoSize(4, "points")..int("numPoints", "")
    )

    opaque_p(
        "ConvexHullShape_new4",
        "",

        Unsafe..btScalar.const.p("points", ""),
        int("numPoints", ""),
        int("stride", "")
    )

    void(
        "ConvexHullShape_addPoint",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("point", ""),
        bool("recalculateLocalAabb", "")
    )

    int(
        "ConvexHullShape_getNumPoints",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConvexHullShape_getScaledPoint",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btVector3.p("value", "")
    )

    btVector3.p(
        "ConvexHullShape_getUnscaledPoints",
        "",

        opaque_p("obj", "")
    )

    void(
        "ConvexHullShape_optimizeConvexHull",
        "",

        opaque_p("obj", "")
    )

}
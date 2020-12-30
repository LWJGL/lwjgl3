/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btMultiBodyPoint2Point = "BTMultiBodyPoint2Point".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "MultiBodyPoint2Point_new",
        "",

        opaque_p("body", ""),
        int("link", ""),
        opaque_p("bodyB", ""),
        btVector3.const.p("pivotInA", ""),
        btVector3.const.p("pivotInB", "")
    )

    opaque_p(
        "MultiBodyPoint2Point_new2",
        "",

        opaque_p("bodyA", ""),
        int("linkA", ""),
        opaque_p("bodyB", ""),
        int("linkB", ""),
        btVector3.const.p("pivotInA", ""),
        btVector3.const.p("pivotInB", "")
    )

    void(
        "MultiBodyPoint2Point_getPivotInB",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "MultiBodyPoint2Point_setPivotInB",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("pivotInB", "")
    )

}
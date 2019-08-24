/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btMultiBodyFixedConstraint = "BTMultiBodyFixedConstraint".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "MultiBodyFixedConstraint_new",
        "",

        opaque_p("body", ""),
        int("link", ""),
        opaque_p("bodyB", ""),
        btVector3.const.p("pivotInA", ""),
        btVector3.const.p("pivotInB", ""),
        btMatrix3x3.const.p("frameInA", ""),
        btMatrix3x3.const.p("frameInB", "")
    )

    opaque_p(
        "MultiBodyFixedConstraint_new2",
        "",

        opaque_p("bodyA", ""),
        int("linkA", ""),
        opaque_p("bodyB", ""),
        int("linkB", ""),
        btVector3.const.p("pivotInA", ""),
        btVector3.const.p("pivotInB", ""),
        btMatrix3x3.const.p("frameInA", ""),
        btMatrix3x3.const.p("frameInB", "")
    )

    void(
        "MultiBodyFixedConstraint_getFrameInA",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.p("value", "")
    )

    void(
        "MultiBodyFixedConstraint_getFrameInB",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.p("value", "")
    )

    void(
        "MultiBodyFixedConstraint_getPivotInA",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "MultiBodyFixedConstraint_getPivotInB",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "MultiBodyFixedConstraint_setFrameInA",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.const.p("frameInA", "")
    )

    void(
        "MultiBodyFixedConstraint_setFrameInB",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.const.p("frameInB", "")
    )

    void(
        "MultiBodyFixedConstraint_setPivotInA",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("pivotInA", "")
    )

    void(
        "MultiBodyFixedConstraint_setPivotInB",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("pivotInB", "")
    )

}
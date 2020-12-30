/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btMultiBodySliderConstraint = "BTMultiBodySliderConstraint".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "MultiBodySliderConstraint_new",
        "",

        opaque_p("body", ""),
        int("link", ""),
        opaque_p("bodyB", ""),
        btVector3.const.p("pivotInA", ""),
        btVector3.const.p("pivotInB", ""),
        btMatrix3x3.const.p("frameInA", ""),
        btMatrix3x3.const.p("frameInB", ""),
        btVector3.const.p("jointAxis", "")
    )

    opaque_p(
        "MultiBodySliderConstraint_new2",
        "",

        opaque_p("bodyA", ""),
        int("linkA", ""),
        opaque_p("bodyB", ""),
        int("linkB", ""),
        btVector3.const.p("pivotInA", ""),
        btVector3.const.p("pivotInB", ""),
        btMatrix3x3.const.p("frameInA", ""),
        btMatrix3x3.const.p("frameInB", ""),
        btVector3.const.p("jointAxis", "")
    )

    void(
        "MultiBodySliderConstraint_getFrameInA",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.p("value", "")
    )

    void(
        "MultiBodySliderConstraint_getFrameInB",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.p("value", "")
    )

    void(
        "MultiBodySliderConstraint_getJointAxis",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "MultiBodySliderConstraint_getPivotInA",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "MultiBodySliderConstraint_getPivotInB",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "MultiBodySliderConstraint_setFrameInA",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.const.p("frameInA", "")
    )

    void(
        "MultiBodySliderConstraint_setFrameInB",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.const.p("frameInB", "")
    )

    void(
        "MultiBodySliderConstraint_setJointAxis",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("jointAxis", "")
    )

    void(
        "MultiBodySliderConstraint_setPivotInA",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("pivotInA", "")
    )

    void(
        "MultiBodySliderConstraint_setPivotInB",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("pivotInB", "")
    )

}
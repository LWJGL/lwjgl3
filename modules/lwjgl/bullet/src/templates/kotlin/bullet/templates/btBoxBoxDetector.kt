/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btBoxBoxDetector = "BTBoxBoxDetector".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "BoxBoxDetector_new",
        "",

        opaque_p("box1", ""),
        opaque_p("box2", "")
    )

    opaque_p(
        "BoxBoxDetector_getBox1",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "BoxBoxDetector_getBox2",
        "",

        opaque_p("obj", "")
    )

    void(
        "BoxBoxDetector_setBox1",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "BoxBoxDetector_setBox2",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

}
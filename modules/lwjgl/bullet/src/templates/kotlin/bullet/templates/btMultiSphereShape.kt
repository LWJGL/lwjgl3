/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btMultiSphereShape = "BTMultiSphereShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "MultiSphereShape_new",
        "",

        btScalar.const.p("positions", ""),
        Unsafe..btScalar.const.p("radi", ""),
        AutoSize(3, "positions")..int("numSpheres", "")
    )

    opaque_p(
        "MultiSphereShape_new2",
        "",

        btVector3.const.p("positions", ""),
        btScalar.const.p("radi", ""),
        AutoSize("positions", "radi")..int("numSpheres", "")
    )

    int(
        "MultiSphereShape_getSphereCount",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultiSphereShape_getSpherePosition",
        "",

        opaque_p("obj", ""),
        int("index", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "MultiSphereShape_getSphereRadius",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btStaticPlaneShape = "BTStaticPlaneShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "StaticPlaneShape_new",
        "",

        btVector3.const.p("planeNormal", ""),
        btScalar("planeConstant", "")
    )

    btScalar(
        "StaticPlaneShape_getPlaneConstant",
        "",

        opaque_p("obj", "")
    )

    void(
        "StaticPlaneShape_getPlaneNormal",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

}
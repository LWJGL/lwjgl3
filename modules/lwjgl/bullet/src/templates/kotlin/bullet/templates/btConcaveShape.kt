/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btConcaveShape = "BTConcaveShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    void(
        "ConcaveShape_processAllTriangles",
        "",

        opaque_p("obj", ""),
        opaque_p("callback", ""),
        btVector3.const.p("aabbMin", ""),
        btVector3.const.p("aabbMax", "")
    )

}
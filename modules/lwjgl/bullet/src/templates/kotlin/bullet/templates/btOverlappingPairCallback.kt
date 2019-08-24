/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btOverlappingPairCallback = "BTOverlappingPairCallback".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "OverlappingPairCallback_addOverlappingPair",
        "",

        opaque_p("obj", ""),
        opaque_p("proxy0", ""),
        opaque_p("proxy1", "")
    )

    opaque_p(
        "OverlappingPairCallback_removeOverlappingPair",
        "",

        opaque_p("obj", ""),
        opaque_p("proxy0", ""),
        opaque_p("proxy1", ""),
        opaque_p("dispatcher", "")
    )

    void(
        "OverlappingPairCallback_removeOverlappingPairsContainingProxy",
        "",

        opaque_p("obj", ""),
        opaque_p("proxy0", ""),
        opaque_p("dispatcher", "")
    )

    void(
        "OverlappingPairCallback_delete",
        "",

        opaque_p("obj", "")
    )

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btMultiBodyLinkCollider = "BTMultiBodyLinkCollider".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "MultiBodyLinkCollider_new",
        "",

        opaque_p("multiBody", ""),
        int("link", "")
    )

    int(
        "MultiBodyLinkCollider_getLink",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "MultiBodyLinkCollider_getMultiBody",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultiBodyLinkCollider_setLink",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MultiBodyLinkCollider_setMultiBody",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    opaque_p(
        "MultiBodyLinkCollider_upcast",
        "",

        opaque_p("colObj", "")
    )

}
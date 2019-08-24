/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btTriangleCallback = "BTTriangleCallback".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "TriangleCallbackWrapper_new",
        "",

        opaque_p("processTriangleCallback", "")
    )

    void(
        "TriangleCallback_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "InternalTriangleIndexCallbackWrapper_new",
        "",

        opaque_p("internalProcessTriangleIndexCallback", "")
    )

    void(
        "InternalTriangleIndexCallback_delete",
        "",

        opaque_p("obj", "")
    )

}
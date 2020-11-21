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

        p_btTriangleCallback_processTriangle("processTriangleCallback", "")
    )

    void(
        "TriangleCallback_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "InternalTriangleIndexCallbackWrapper_new",
        "",

        p_btInternalTriangleIndexCallback_internalProcessTriangleIndex("internalProcessTriangleIndexCallback", "")
    )

    void(
        "InternalTriangleIndexCallback_delete",
        "",

        opaque_p("obj", "")
    )

}
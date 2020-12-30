/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val IDebugDraw = "BTIDebugDraw".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "IDebugDrawWrapper_new",
        "",

        opaque_p("debugDrawGCHandle", ""),
        opaque_p("drawAabbCallback", ""),
        opaque_p("drawArcCallback", ""),
        opaque_p("drawBoxCallback", ""),
        opaque_p("drawCapsuleCallback", ""),
        opaque_p("drawConeCallback", ""),
        opaque_p("drawContactPointCallback", ""),
        opaque_p("drawCylinderCallback", ""),
        opaque_p("drawLineCallback", ""),
        opaque_p("drawPlaneCallback", ""),
        opaque_p("drawSphereCallback", ""),
        opaque_p("drawSpherePatchCallback", ""),
        opaque_p("drawTransformCallback", ""),
        opaque_p("drawTriangleCallback", ""),
        opaque_p("getDebugModeCallback", ""),
        opaque_p("cb", "")
    )

    opaque_p(
        "IDebugDrawWrapper_getGCHandle",
        "",

        opaque_p("obj", "")
    )

    void(
        "IDebugDraw_delete",
        "",

        opaque_p("obj", "")
    )

}
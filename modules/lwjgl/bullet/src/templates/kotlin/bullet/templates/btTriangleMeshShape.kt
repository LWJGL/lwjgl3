/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btTriangleMeshShape = "BTTriangleMeshShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    void(
        "TriangleMeshShape_getLocalAabbMax",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "TriangleMeshShape_getLocalAabbMin",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p(
        "TriangleMeshShape_getMeshInterface",
        "",

        opaque_p("obj", "")
    )

    void(
        "TriangleMeshShape_localGetSupportingVertex",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("vec", ""),
        btVector3.p("value", "")
    )

    void(
        "TriangleMeshShape_localGetSupportingVertexWithoutMargin",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("vec", ""),
        btVector3.p("value", "")
    )

    void(
        "TriangleMeshShape_recalcLocalAabb",
        "",

        opaque_p("obj", "")
    )

}
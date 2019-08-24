/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btMultimaterialTriangleMeshShape = "BTMultimaterialTriangleMeshShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "MultimaterialTriangleMeshShape_new",
        "",

        opaque_p("meshInterface", ""),
        bool("useQuantizedAabbCompression", ""),
        bool("buildBvh", "")
    )

    opaque_p(
        "MultimaterialTriangleMeshShape_new2",
        "",

        opaque_p("meshInterface", ""),
        bool("useQuantizedAabbCompression", ""),
        btVector3.const.p("bvhAabbMin", ""),
        btVector3.const.p("bvhAabbMax", ""),
        bool("buildBvh", "")
    )

    opaque_p(
        "MultimaterialTriangleMeshShape_getMaterialProperties",
        "",

        opaque_p("obj", ""),
        int("partID", ""),
        int("triIndex", "")
    )

}
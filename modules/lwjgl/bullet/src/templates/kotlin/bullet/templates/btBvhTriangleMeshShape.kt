/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btBvhTriangleMeshShape = "BTBvhTriangleMeshShape".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "BvhTriangleMeshShape_new",
        "",

        opaque_p("meshInterface", ""),
        bool("useQuantizedAabbCompression", ""),
        bool("buildBvh", "")
    )

    opaque_p(
        "BvhTriangleMeshShape_new2",
        "",

        opaque_p("meshInterface", ""),
        bool("useQuantizedAabbCompression", ""),
        btVector3.const.p("bvhAabbMin", ""),
        btVector3.const.p("bvhAabbMax", ""),
        bool("buildBvh", "")
    )

    void(
        "BvhTriangleMeshShape_buildOptimizedBvh",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "BvhTriangleMeshShape_getOptimizedBvh",
        "",

        opaque_p("obj", "")
    )

    bool(
        "BvhTriangleMeshShape_getOwnsBvh",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "BvhTriangleMeshShape_getTriangleInfoMap",
        "",

        opaque_p("obj", "")
    )

    void(
        "BvhTriangleMeshShape_partialRefitTree",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("aabbMin", ""),
        btVector3.const.p("aabbMax", "")
    )

    void(
        "BvhTriangleMeshShape_performConvexcast",
        "",

        opaque_p("obj", ""),
        "btTriangleCallback".opaque.p("callback", ""),
        btVector3.const.p("boxSource", ""),
        btVector3.const.p("boxTarget", ""),
        btVector3.const.p("boxMin", ""),
        btVector3.const.p("boxMax", "")
    )

    void(
        "BvhTriangleMeshShape_performRaycast",
        "",

        opaque_p("obj", ""),
        "btTriangleCallback".opaque.p("callback", ""),
        btVector3.const.p("raySource", ""),
        btVector3.const.p("rayTarget", "")
    )

    void(
        "BvhTriangleMeshShape_refitTree",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("aabbMin", ""),
        btVector3.const.p("aabbMax", "")
    )

    void(
        "BvhTriangleMeshShape_serializeSingleBvh",
        "",

        opaque_p("obj", ""),
        opaque_p("serializer", "")
    )

    void(
        "BvhTriangleMeshShape_serializeSingleTriangleInfoMap",
        "",

        opaque_p("obj", ""),
        opaque_p("serializer", "")
    )

    void(
        "BvhTriangleMeshShape_setOptimizedBvh",
        "",

        opaque_p("obj", ""),
        opaque_p("bvh", "")
    )

    void(
        "BvhTriangleMeshShape_setOptimizedBvh2",
        "",

        opaque_p("obj", ""),
        opaque_p("bvh", ""),
        btVector3.const.p("localScaling", "")
    )

    void(
        "BvhTriangleMeshShape_setTriangleInfoMap",
        "",

        opaque_p("obj", ""),
        opaque_p("triangleInfoMap", "")
    )

    bool(
        "BvhTriangleMeshShape_usesQuantizedAabbCompression",
        "",

        opaque_p("obj", "")
    )

}
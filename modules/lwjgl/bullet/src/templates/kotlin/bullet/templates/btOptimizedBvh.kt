/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btOptimizedBvh = "BTOptimizedBvh".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "OptimizedBvh_new",
        "",

        void()
    )

    void(
        "OptimizedBvh_build",
        "",

        opaque_p("obj", ""),
        opaque_p("triangles", ""),
        bool("useQuantizedAabbCompression", ""),
        btVector3.const.p("bvhAabbMin", ""),
        btVector3.const.p("bvhAabbMax", "")
    )

    opaque_p(
        "OptimizedBvh_deSerializeInPlace",
        "",

        opaque_p("i_alignedDataBuffer", ""),
        unsigned_int("i_dataBufferSize", ""),
        bool("i_swapEndian", "")
    )

    void(
        "OptimizedBvh_refit",
        "",

        opaque_p("obj", ""),
        opaque_p("triangles", ""),
        btVector3.const.p("aabbMin", ""),
        btVector3.const.p("aabbMax", "")
    )

    void(
        "OptimizedBvh_refitPartial",
        "",

        opaque_p("obj", ""),
        opaque_p("triangles", ""),
        btVector3.const.p("aabbMin", ""),
        btVector3.const.p("aabbMax", "")
    )

    bool(
        "OptimizedBvh_serializeInPlace",
        "",

        opaque_p("obj", ""),
        opaque_p("o_alignedDataBuffer", ""),
        unsigned_int("i_dataBufferSize", ""),
        bool("i_swapEndian", "")
    )

    void(
        "OptimizedBvh_updateBvhNodes",
        "",

        opaque_p("obj", ""),
        opaque_p("meshInterface", ""),
        int("firstNode", ""),
        int("endNode", ""),
        int("index", "")
    )

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btAxisSweep3 = "BTAxisSweep3".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "AxisSweep3_new",
        "",

        btVector3.const.p("worldAabbMin", ""),
        btVector3.const.p("worldAabbMax", ""),
        unsigned_short("maxHandles", ""),
        opaque_p("pairCache", ""),
        bool("disableRaycastAccelerator", "")
    )

    unsigned_short(
        "AxisSweep3_addHandle",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("aabbMin", ""),
        btVector3.const.p("aabbMax", ""),
        opaque_p("pOwner", ""),
        int("collisionFilterGroup", ""),
        int("collisionFilterMask", ""),
        opaque_p("dispatcher", "")
    )

    opaque_p(
        "AxisSweep3_getHandle",
        "",

        opaque_p("obj", ""),
        unsigned_short("index", "")
    )

    unsigned_short(
        "AxisSweep3_getNumHandles",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "AxisSweep3_getOverlappingPairUserCallback",
        "",

        opaque_p("obj", "")
    )

    void(
        "AxisSweep3_quantize",
        "",

        opaque_p("obj", ""),
        Unsafe..unsigned_short.p("out", ""),
        btVector3.const.p("point", ""),
        int("isMax", "")
    )

    void(
        "AxisSweep3_removeHandle",
        "",

        opaque_p("obj", ""),
        unsigned_short("handle", ""),
        opaque_p("dispatcher", "")
    )

    void(
        "AxisSweep3_setOverlappingPairUserCallback",
        "",

        opaque_p("obj", ""),
        opaque_p("pairCallback", "")
    )

    bool(
        "AxisSweep3_testAabbOverlap",
        "",

        opaque_p("obj", ""),
        opaque_p("proxy0", ""),
        opaque_p("proxy1", "")
    )

    void(
        "AxisSweep3_unQuantize",
        "",

        opaque_p("obj", ""),
        opaque_p("proxy", ""),
        btVector3.p("aabbMin", ""),
        btVector3.p("aabbMax", "")
    )

    void(
        "AxisSweep3_updateHandle",
        "",

        opaque_p("obj", ""),
        unsigned_short("handle", ""),
        btVector3.const.p("aabbMin", ""),
        btVector3.const.p("aabbMax", ""),
        opaque_p("dispatcher", "")
    )

    opaque_p(
        "32BitAxisSweep3_new",
        "",

        btVector3.const.p("worldAabbMin", ""),
        btVector3.const.p("worldAabbMax", ""),
        unsigned_int("maxHandles", ""),
        opaque_p("pairCache", ""),
        bool("disableRaycastAccelerator", "")
    )

    unsigned_int(
        "32BitAxisSweep3_addHandle",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("aabbMin", ""),
        btVector3.const.p("aabbMax", ""),
        opaque_p("pOwner", ""),
        int("collisionFilterGroup", ""),
        int("collisionFilterMask", ""),
        opaque_p("dispatchery", "")
    )

    opaque_p(
        "32BitAxisSweep3_getHandle",
        "",

        opaque_p("obj", ""),
        unsigned_int("index", "")
    )

    unsigned_int(
        "32BitAxisSweep3_getNumHandles",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "32BitAxisSweep3_getOverlappingPairUserCallback",
        "",

        opaque_p("obj", "")
    )

    void(
        "32BitAxisSweep3_quantize",
        "",

        opaque_p("obj", ""),
        Unsafe..unsigned_int.p("out", ""),
        btVector3.const.p("point", ""),
        int("isMax", "")
    )

    void(
        "32BitAxisSweep3_removeHandle",
        "",

        opaque_p("obj", ""),
        unsigned_int("handle", ""),
        opaque_p("dispatcher", "")
    )

    void(
        "32BitAxisSweep3_setOverlappingPairUserCallback",
        "",

        opaque_p("obj", ""),
        opaque_p("pairCallback", "")
    )

    bool(
        "32BitAxisSweep3_testAabbOverlap",
        "",

        opaque_p("obj", ""),
        opaque_p("proxy0", ""),
        opaque_p("proxy1", "")
    )

    void(
        "32BitAxisSweep3_unQuantize",
        "",

        opaque_p("obj", ""),
        opaque_p("proxy", ""),
        btVector3.p("aabbMin", ""),
        btVector3.p("aabbMax", "")
    )

    void(
        "32BitAxisSweep3_updateHandle",
        "",

        opaque_p("obj", ""),
        unsigned_int("handle", ""),
        btVector3.const.p("aabbMin", ""),
        btVector3.const.p("aabbMax", ""),
        opaque_p("dispatcher", "")
    )

}
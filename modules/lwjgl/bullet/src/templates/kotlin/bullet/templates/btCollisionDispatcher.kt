/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btCollisionDispatcher = "BTCollisionDispatcher".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "CollisionDispatcher_new",
        "",

        opaque_p("collisionConfiguration", "")
    )

    void(
        "CollisionDispatcher_defaultNearCallback",
        "",

        opaque_p("collisionPair", ""),
        opaque_p("dispatcher", ""),
        opaque_p("dispatchInfo", "")
    )

    opaque_p(
        "CollisionDispatcher_getCollisionConfiguration",
        "",

        opaque_p("obj", "")
    )

    int(
        "CollisionDispatcher_getDispatcherFlags",
        "",

        opaque_p("obj", "")
    )

    btNearCallback(
        "CollisionDispatcher_getNearCallback",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionDispatcher_registerCollisionCreateFunc",
        "",

        opaque_p("obj", ""),
        int("proxyType0", ""),
        int("proxyType1", ""),
        opaque_p("createFunc", "")
    )

    void(
        "CollisionDispatcher_registerClosestPointsCreateFunc",
        "",

        opaque_p("obj", ""),
        int("proxyType0", ""),
        int("proxyType1", ""),
        opaque_p("createFunc", "")
    )

    void(
        "CollisionDispatcher_setCollisionConfiguration",
        "",

        opaque_p("obj", ""),
        opaque_p("config", "")
    )

    void(
        "CollisionDispatcher_setDispatcherFlags",
        "",

        opaque_p("obj", ""),
        int("flags", "")
    )

    void(
        "CollisionDispatcher_setNearCallback",
        "",

        opaque_p("obj", ""),
        btNearCallback("nearCallback", "")
    )

}
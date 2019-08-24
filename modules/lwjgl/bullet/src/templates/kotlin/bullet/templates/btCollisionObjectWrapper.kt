/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btCollisionObjectWrapper = "BTCollisionObjectWrapper".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "CollisionObjectWrapper_getCollisionObject",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CollisionObjectWrapper_getCollisionShape",
        "",

        opaque_p("obj", "")
    )

    int(
        "CollisionObjectWrapper_getIndex",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CollisionObjectWrapper_getParent",
        "",

        opaque_p("obj", "")
    )

    int(
        "CollisionObjectWrapper_getPartId",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionObjectWrapper_getWorldTransform",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "CollisionObjectWrapper_setCollisionObject",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "CollisionObjectWrapper_setIndex",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "CollisionObjectWrapper_setParent",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "CollisionObjectWrapper_setPartId",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "CollisionObjectWrapper_setShape",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

}
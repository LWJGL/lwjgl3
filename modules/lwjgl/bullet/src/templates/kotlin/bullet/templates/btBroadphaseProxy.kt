/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btBroadphaseProxy = "BTBroadphaseProxy".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    void(
        "BroadphaseProxy_getAabbMax",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "BroadphaseProxy_getAabbMin",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p(
        "BroadphaseProxy_getClientObject",
        "",

        opaque_p("obj", "")
    )

    int(
        "BroadphaseProxy_getCollisionFilterGroup",
        "",

        opaque_p("obj", "")
    )

    int(
        "BroadphaseProxy_getCollisionFilterMask",
        "",

        opaque_p("obj", "")
    )

    int(
        "BroadphaseProxy_getUid",
        "",

        opaque_p("obj", "")
    )

    int(
        "BroadphaseProxy_getUniqueId",
        "",

        opaque_p("obj", "")
    )

    bool(
        "BroadphaseProxy_isCompound",
        "",

        int("proxyType", "")
    )

    bool(
        "BroadphaseProxy_isConcave",
        "",

        int("proxyType", "")
    )

    bool(
        "BroadphaseProxy_isConvex",
        "",

        int("proxyType", "")
    )

    bool(
        "BroadphaseProxy_isConvex2d",
        "",

        int("proxyType", "")
    )

    bool(
        "BroadphaseProxy_isInfinite",
        "",

        int("proxyType", "")
    )

    bool(
        "BroadphaseProxy_isNonMoving",
        "",

        int("proxyType", "")
    )

    bool(
        "BroadphaseProxy_isPolyhedral",
        "",

        int("proxyType", "")
    )

    bool(
        "BroadphaseProxy_isSoftBody",
        "",

        int("proxyType", "")
    )

    void(
        "BroadphaseProxy_setAabbMax",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "BroadphaseProxy_setAabbMin",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "BroadphaseProxy_setClientObject",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "BroadphaseProxy_setCollisionFilterGroup",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "BroadphaseProxy_setCollisionFilterMask",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "BroadphaseProxy_setUniqueId",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "BroadphaseProxy_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "BroadphasePair_new",
        "",

        void()
    )

    opaque_p(
        "BroadphasePair_new2",
        "",

        opaque_p("other", "")
    )

    opaque_p(
        "BroadphasePair_new3",
        "",

        opaque_p("proxy0", ""),
        opaque_p("proxy1", "")
    )

    opaque_p(
        "BroadphasePair_getAlgorithm",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "BroadphasePair_getPProxy0",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "BroadphasePair_getPProxy1",
        "",

        opaque_p("obj", "")
    )

    void(
        "BroadphasePair_setAlgorithm",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "BroadphasePair_setPProxy0",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "BroadphasePair_setPProxy1",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "BroadphasePair_delete",
        "",

        opaque_p("obj", "")
    )

}
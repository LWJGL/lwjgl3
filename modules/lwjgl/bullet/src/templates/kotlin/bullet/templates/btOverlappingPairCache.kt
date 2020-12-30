/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btOverlappingPairCache = "BTOverlappingPairCache".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    bool(
        "OverlapCallback_processOverlap",
        "",

        opaque_p("obj", ""),
        opaque_p("pair", "")
    )

    void(
        "OverlapCallback_delete",
        "",

        opaque_p("obj", "")
    )

    bool(
        "OverlapFilterCallback_needBroadphaseCollision",
        "",

        opaque_p("obj", ""),
        opaque_p("proxy0", ""),
        opaque_p("proxy1", "")
    )

    void(
        "OverlapFilterCallback_delete",
        "",

        opaque_p("obj", "")
    )

    void(
        "OverlappingPairCache_cleanOverlappingPair",
        "",

        opaque_p("obj", ""),
        opaque_p("pair", ""),
        opaque_p("dispatcher", "")
    )

    void(
        "OverlappingPairCache_cleanProxyFromPairs",
        "",

        opaque_p("obj", ""),
        opaque_p("proxy", ""),
        opaque_p("dispatcher", "")
    )

    opaque_p(
        "OverlappingPairCache_findPair",
        "",

        opaque_p("obj", ""),
        opaque_p("proxy0", ""),
        opaque_p("proxy1", "")
    )

    int(
        "OverlappingPairCache_getNumOverlappingPairs",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "OverlappingPairCache_getOverlappingPairArray",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "OverlappingPairCache_getOverlappingPairArrayPtr",
        "",

        opaque_p("obj", "")
    )

    bool(
        "OverlappingPairCache_hasDeferredRemoval",
        "",

        opaque_p("obj", "")
    )

    void(
        "OverlappingPairCache_processAllOverlappingPairs",
        "",

        opaque_p("obj", ""),
        opaque_p("__unnamed0", ""),
        opaque_p("dispatcher", "")
    )

    void(
        "OverlappingPairCache_processAllOverlappingPairs2",
        "",

        opaque_p("obj", ""),
        opaque_p("callback", ""),
        opaque_p("dispatcher", ""),
        opaque_p("dispatchInfo", "")
    )

    void(
        "OverlappingPairCache_setInternalGhostPairCallback",
        "",

        opaque_p("obj", ""),
        opaque_p("ghostPairCallback", "")
    )

    void(
        "OverlappingPairCache_setOverlapFilterCallback",
        "",

        opaque_p("obj", ""),
        opaque_p("callback", "")
    )

    void(
        "OverlappingPairCache_sortOverlappingPairs",
        "",

        opaque_p("obj", ""),
        opaque_p("dispatcher", "")
    )

    opaque_p(
        "OverlapFilterCallbackWrapper_new",
        "",

        p_btOverlapFilterCallback_needBroadphaseCollision("needBroadphaseCollision", "")
    )

    opaque_p(
        "HashedOverlappingPairCache_new",
        "",

        void()
    )

    int(
        "HashedOverlappingPairCache_GetCount",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "HashedOverlappingPairCache_getOverlapFilterCallback",
        "",

        opaque_p("obj", "")
    )

    bool(
        "HashedOverlappingPairCache_needsBroadphaseCollision",
        "",

        opaque_p("obj", ""),
        opaque_p("proxy0", ""),
        opaque_p("proxy1", "")
    )

    opaque_p(
        "SortedOverlappingPairCache_new",
        "",

        void()
    )

    opaque_p(
        "SortedOverlappingPairCache_getOverlapFilterCallback",
        "",

        opaque_p("obj", "")
    )

    bool(
        "SortedOverlappingPairCache_needsBroadphaseCollision",
        "",

        opaque_p("obj", ""),
        opaque_p("proxy0", ""),
        opaque_p("proxy1", "")
    )

    opaque_p(
        "NullPairCache_new",
        "",

        void()
    )

}
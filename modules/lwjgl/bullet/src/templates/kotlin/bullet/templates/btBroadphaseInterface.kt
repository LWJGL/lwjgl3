/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btBroadphaseInterface = "BTBroadphaseInterface".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "BroadphaseAabbCallbackWrapper_new",
        "",

        p_btBroadphaseAabbCallback_process("processCallback", "")
    )

    bool(
        "BroadphaseAabbCallback_process",
        "",

        opaque_p("obj", ""),
        opaque_p("proxy", "")
    )

    void(
        "BroadphaseAabbCallback_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "BroadphaseRayCallbackWrapper_new",
        "",

        p_btBroadphaseAabbCallback_process("processCallback", "")
    )

    btScalar(
        "BroadphaseRayCallback_getLambda_max",
        "",

        opaque_p("obj", "")
    )

    void(
        "BroadphaseRayCallback_getRayDirectionInverse",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    unsigned_int[3]( 
        "BroadphaseRayCallback_getSigns",
        "",

        opaque_p("obj", "")
    )

    void(
        "BroadphaseRayCallback_setLambda_max",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "BroadphaseRayCallback_setRayDirectionInverse",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "BroadphaseInterface_aabbTest",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("aabbMin", ""),
        btVector3.const.p("aabbMax", ""),
        opaque_p("callback", "")
    )

    void(
        "BroadphaseInterface_calculateOverlappingPairs",
        "",

        opaque_p("obj", ""),
        opaque_p("dispatcher", "")
    )

    opaque_p(
        "BroadphaseInterface_createProxy",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("aabbMin", ""),
        btVector3.const.p("aabbMax", ""),
        int("shapeType", ""),
        opaque_p("userPtr", ""),
        int("collisionFilterGroup", ""),
        int("collisionFilterMask", ""),
        opaque_p("dispatcher", "")
    )

    void(
        "BroadphaseInterface_destroyProxy",
        "",

        opaque_p("obj", ""),
        opaque_p("proxy", ""),
        opaque_p("dispatcher", "")
    )

    void(
        "BroadphaseInterface_getAabb",
        "",

        opaque_p("obj", ""),
        opaque_p("proxy", ""),
        btVector3.p("aabbMin", ""),
        btVector3.p("aabbMax", "")
    )

    void(
        "BroadphaseInterface_getBroadphaseAabb",
        "",

        opaque_p("obj", ""),
        btVector3.p("aabbMin", ""),
        btVector3.p("aabbMax", "")
    )

    opaque_p(
        "BroadphaseInterface_getOverlappingPairCache",
        "",

        opaque_p("obj", "")
    )

    void(
        "BroadphaseInterface_printStats",
        "",

        opaque_p("obj", "")
    )

    void(
        "BroadphaseInterface_rayTest",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("rayFrom", ""),
        btVector3.const.p("rayTo", ""),
        opaque_p("rayCallback", "")
    )

    void(
        "BroadphaseInterface_rayTest2",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("rayFrom", ""),
        btVector3.const.p("rayTo", ""),
        opaque_p("rayCallback", ""),
        btVector3.const.p("aabbMin", "")
    )

    void(
        "BroadphaseInterface_rayTest3",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("rayFrom", ""),
        btVector3.const.p("rayTo", ""),
        opaque_p("rayCallback", ""),
        btVector3.const.p("aabbMin", ""),
        btVector3.const.p("aabbMax", "")
    )

    void(
        "BroadphaseInterface_resetPool",
        "",

        opaque_p("obj", ""),
        opaque_p("dispatcher", "")
    )

    void(
        "BroadphaseInterface_setAabb",
        "",

        opaque_p("obj", ""),
        opaque_p("proxy", ""),
        btVector3.const.p("aabbMin", ""),
        btVector3.const.p("aabbMax", ""),
        opaque_p("dispatcher", "")
    )

    void(
        "BroadphaseInterface_delete",
        "",

        opaque_p("obj", "")
    )

}
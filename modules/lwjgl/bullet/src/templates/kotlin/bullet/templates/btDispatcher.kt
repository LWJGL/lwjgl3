/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btDispatcher = "BTDispatcher".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    btScalar(
        "DispatcherInfo_getAllowedCcdPenetration",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "DispatcherInfo_getConvexConservativeDistanceThreshold",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "DispatcherInfo_getDebugDraw",
        "",

        opaque_p("obj", "")
    )

    bool(
        "DispatcherInfo_getDeterministicOverlappingPairs",
        "",

        opaque_p("obj", "")
    )

    int(
        "DispatcherInfo_getDispatchFunc",
        "",

        opaque_p("obj", "")
    )

    bool(
        "DispatcherInfo_getEnableSatConvex",
        "",

        opaque_p("obj", "")
    )

    bool(
        "DispatcherInfo_getEnableSPU",
        "",

        opaque_p("obj", "")
    )

    int(
        "DispatcherInfo_getStepCount",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "DispatcherInfo_getTimeOfImpact",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "DispatcherInfo_getTimeStep",
        "",

        opaque_p("obj", "")
    )

    bool(
        "DispatcherInfo_getUseContinuous",
        "",

        opaque_p("obj", "")
    )

    bool(
        "DispatcherInfo_getUseConvexConservativeDistanceUtil",
        "",

        opaque_p("obj", "")
    )

    bool(
        "DispatcherInfo_getUseEpa",
        "",

        opaque_p("obj", "")
    )

    void(
        "DispatcherInfo_setAllowedCcdPenetration",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "DispatcherInfo_setConvexConservativeDistanceThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "DispatcherInfo_setDebugDraw",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "DispatcherInfo_setDeterministicOverlappingPairs",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "DispatcherInfo_setDispatchFunc",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "DispatcherInfo_setEnableSatConvex",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "DispatcherInfo_setEnableSPU",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "DispatcherInfo_setStepCount",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "DispatcherInfo_setTimeOfImpact",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "DispatcherInfo_setTimeStep",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "DispatcherInfo_setUseContinuous",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "DispatcherInfo_setUseConvexConservativeDistanceUtil",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "DispatcherInfo_setUseEpa",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    opaque_p(
        "Dispatcher_allocateCollisionAlgorithm",
        "",

        opaque_p("obj", ""),
        int("size", "")
    )

    void(
        "Dispatcher_clearManifold",
        "",

        opaque_p("obj", ""),
        opaque_p("manifold", "")
    )

    void(
        "Dispatcher_dispatchAllCollisionPairs",
        "",

        opaque_p("obj", ""),
        opaque_p("pairCache", ""),
        opaque_p("dispatchInfo", ""),
        opaque_p("dispatcher", "")
    )

    opaque_p(
        "Dispatcher_findAlgorithm",
        "",

        opaque_p("obj", ""),
        opaque_p("body0Wrap", ""),
        opaque_p("body1Wrap", ""),
        opaque_p("sharedManifold", ""),
        int("queryType", "")
    )

    void(
        "Dispatcher_freeCollisionAlgorithm",
        "",

        opaque_p("obj", ""),
        opaque_p("ptr", "")
    )

    //opaque_p.p(
    opaque_p(
        "Dispatcher_getInternalManifoldPointer",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "Dispatcher_getInternalManifoldPool",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "Dispatcher_getManifoldByIndexInternal",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    opaque_p(
        "Dispatcher_getNewManifold",
        "",

        opaque_p("obj", ""),
        opaque_p("b0", ""),
        opaque_p("b1", "")
    )

    int(
        "Dispatcher_getNumManifolds",
        "",

        opaque_p("obj", "")
    )

    bool(
        "Dispatcher_needsCollision",
        "",

        opaque_p("obj", ""),
        opaque_p("body0", ""),
        opaque_p("body1", "")
    )

    bool(
        "Dispatcher_needsResponse",
        "",

        opaque_p("obj", ""),
        opaque_p("body0", ""),
        opaque_p("body1", "")
    )

    void(
        "Dispatcher_releaseManifold",
        "",

        opaque_p("obj", ""),
        opaque_p("manifold", "")
    )

    void(
        "Dispatcher_delete",
        "",

        opaque_p("obj", "")
    )

}
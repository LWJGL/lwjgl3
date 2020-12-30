/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val CollisionWorld = "BTCollisionWorld".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "CollisionWorld_AllHitsRayResultCallback_new",
        "",

        btVector3.const.p("rayFromWorld", ""),
        btVector3.const.p("rayToWorld", "")
    )

    opaque_p(
        "CollisionWorld_AllHitsRayResultCallback_getCollisionObjects",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CollisionWorld_AllHitsRayResultCallback_getHitFractions",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionWorld_AllHitsRayResultCallback_getRayFromWorld",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "CollisionWorld_AllHitsRayResultCallback_getRayToWorld",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "CollisionWorld_AllHitsRayResultCallback_setRayFromWorld",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "CollisionWorld_AllHitsRayResultCallback_setRayToWorld",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    opaque_p(
        "CollisionWorld_ClosestConvexResultCallback_new",
        "",

        btVector3.const.p("convexFromWorld", ""),
        btVector3.const.p("convexToWorld", "")
    )

    void(
        "CollisionWorld_ClosestConvexResultCallback_getConvexFromWorld",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "CollisionWorld_ClosestConvexResultCallback_getConvexToWorld",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p(
        "CollisionWorld_ClosestConvexResultCallback_getHitCollisionObject",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionWorld_ClosestConvexResultCallback_getHitNormalWorld",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "CollisionWorld_ClosestConvexResultCallback_getHitPointWorld",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "CollisionWorld_ClosestConvexResultCallback_setConvexFromWorld",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "CollisionWorld_ClosestConvexResultCallback_setConvexToWorld",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "CollisionWorld_ClosestConvexResultCallback_setHitCollisionObject",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "CollisionWorld_ClosestConvexResultCallback_setHitNormalWorld",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "CollisionWorld_ClosestConvexResultCallback_setHitPointWorld",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    opaque_p(
        "CollisionWorld_ClosestRayResultCallback_new",
        "",

        btVector3.const.p("rayFromWorld", ""),
        btVector3.const.p("rayToWorld", "")
    )

    void(
        "CollisionWorld_ClosestRayResultCallback_getHitNormalWorld",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "CollisionWorld_ClosestRayResultCallback_getHitPointWorld",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "CollisionWorld_ClosestRayResultCallback_getRayFromWorld",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "CollisionWorld_ClosestRayResultCallback_getRayToWorld",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "CollisionWorld_ClosestRayResultCallback_setHitNormalWorld",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "CollisionWorld_ClosestRayResultCallback_setHitPointWorld",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "CollisionWorld_ClosestRayResultCallback_setRayFromWorld",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "CollisionWorld_ClosestRayResultCallback_setRayToWorld",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    opaque_p(
        "CollisionWorld_ContactResultCallbackWrapper_new",
        "",

        p_btCollisionWorld_ContactResultCallback_addSingleResult("addSingleResultCallback", ""),
        p_btCollisionWorld_ContactResultCallback_needsCollision("needsCollisionCallback", "")
    )

    bool(
        "CollisionWorld_ContactResultCallbackWrapper_needsCollision",
        "",

        opaque_p("obj", ""),
        opaque_p("proxy0", "")
    )

    btScalar(
        "CollisionWorld_ContactResultCallback_addSingleResult",
        "",

        opaque_p("obj", ""),
        opaque_p("cp", ""),
        opaque_p("colObj0Wrap", ""),
        int("partId0", ""),
        int("index0", ""),
        opaque_p("colObj1Wrap", ""),
        int("partId1", ""),
        int("index1", "")
    )

    btScalar(
        "CollisionWorld_ContactResultCallback_getClosestDistanceThreshold",
        "",

        opaque_p("obj", "")
    )

    int(
        "CollisionWorld_ContactResultCallback_getCollisionFilterGroup",
        "",

        opaque_p("obj", "")
    )

    int(
        "CollisionWorld_ContactResultCallback_getCollisionFilterMask",
        "",

        opaque_p("obj", "")
    )

    bool(
        "CollisionWorld_ContactResultCallback_needsCollision",
        "",

        opaque_p("obj", ""),
        opaque_p("proxy0", "")
    )

    void(
        "CollisionWorld_ContactResultCallback_setClosestDistanceThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "CollisionWorld_ContactResultCallback_setCollisionFilterGroup",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "CollisionWorld_ContactResultCallback_setCollisionFilterMask",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "CollisionWorld_ContactResultCallback_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CollisionWorld_ConvexResultCallbackWrapper_new",
        "",

        p_btCollisionWorld_ConvexResultCallback_addSingleResult("addSingleResultCallback", ""),
        p_btCollisionWorld_ConvexResultCallback_needsCollision("needsCollisionCallback", "")
    )

    bool(
        "CollisionWorld_ConvexResultCallbackWrapper_needsCollision",
        "",

        opaque_p("obj", ""),
        opaque_p("proxy0", "")
    )

    btScalar(
        "CollisionWorld_ConvexResultCallback_addSingleResult",
        "",

        opaque_p("obj", ""),
        opaque_p("convexResult", ""),
        bool("normalInWorldSpace", "")
    )

    btScalar(
        "CollisionWorld_ConvexResultCallback_getClosestHitFraction",
        "",

        opaque_p("obj", "")
    )

    int(
        "CollisionWorld_ConvexResultCallback_getCollisionFilterGroup",
        "",

        opaque_p("obj", "")
    )

    int(
        "CollisionWorld_ConvexResultCallback_getCollisionFilterMask",
        "",

        opaque_p("obj", "")
    )

    bool(
        "CollisionWorld_ConvexResultCallback_hasHit",
        "",

        opaque_p("obj", "")
    )

    bool(
        "CollisionWorld_ConvexResultCallback_needsCollision",
        "",

        opaque_p("obj", ""),
        opaque_p("proxy0", "")
    )

    void(
        "CollisionWorld_ConvexResultCallback_setClosestHitFraction",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "CollisionWorld_ConvexResultCallback_setCollisionFilterGroup",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "CollisionWorld_ConvexResultCallback_setCollisionFilterMask",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "CollisionWorld_ConvexResultCallback_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CollisionWorld_LocalConvexResult_new",
        "",

        opaque_p("hitCollisionObject", ""),
        opaque_p("localShapeInfo", ""),
        btVector3.const.p("hitNormalLocal", ""),
        btVector3.const.p("hitPointLocal", ""),
        btScalar("hitFraction", "")
    )

    opaque_p(
        "CollisionWorld_LocalConvexResult_getHitCollisionObject",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "CollisionWorld_LocalConvexResult_getHitFraction",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionWorld_LocalConvexResult_getHitNormalLocal",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "CollisionWorld_LocalConvexResult_getHitPointLocal",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p(
        "CollisionWorld_LocalConvexResult_getLocalShapeInfo",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionWorld_LocalConvexResult_setHitCollisionObject",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "CollisionWorld_LocalConvexResult_setHitFraction",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "CollisionWorld_LocalConvexResult_setHitNormalLocal",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "CollisionWorld_LocalConvexResult_setHitPointLocal",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "CollisionWorld_LocalConvexResult_setLocalShapeInfo",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "CollisionWorld_LocalConvexResult_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CollisionWorld_LocalRayResult_new",
        "",

        opaque_p("collisionObject", ""),
        opaque_p("localShapeInfo", ""),
        btVector3.const.p("hitNormalLocal", ""),
        btScalar("hitFraction", "")
    )

    opaque_p(
        "CollisionWorld_LocalRayResult_getCollisionObject",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "CollisionWorld_LocalRayResult_getHitFraction",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionWorld_LocalRayResult_getHitNormalLocal",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p(
        "CollisionWorld_LocalRayResult_getLocalShapeInfo",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionWorld_LocalRayResult_setCollisionObject",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "CollisionWorld_LocalRayResult_setHitFraction",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "CollisionWorld_LocalRayResult_setHitNormalLocal",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "CollisionWorld_LocalRayResult_setLocalShapeInfo",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "CollisionWorld_LocalRayResult_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CollisionWorld_LocalShapeInfo_new",
        "",

        void()
    )

    int(
        "CollisionWorld_LocalShapeInfo_getShapePart",
        "",

        opaque_p("obj", "")
    )

    int(
        "CollisionWorld_LocalShapeInfo_getTriangleIndex",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionWorld_LocalShapeInfo_setShapePart",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "CollisionWorld_LocalShapeInfo_setTriangleIndex",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "CollisionWorld_LocalShapeInfo_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CollisionWorld_RayResultCallbackWrapper_new",
        "",

        p_btCollisionWorld_RayResultCallback_addSingleResult("addSingleResultCallback", ""),
        p_btCollisionWorld_RayResultCallback_needsCollision("needsCollisionCallback", "")
    )

    bool(
        "CollisionWorld_RayResultCallbackWrapper_needsCollision",
        "",

        opaque_p("obj", ""),
        opaque_p("proxy0", "")
    )

    btScalar(
        "CollisionWorld_RayResultCallback_addSingleResult",
        "",

        opaque_p("obj", ""),
        opaque_p("rayResult", ""),
        bool("normalInWorldSpace", "")
    )

    btScalar(
        "CollisionWorld_RayResultCallback_getClosestHitFraction",
        "",

        opaque_p("obj", "")
    )

    int(
        "CollisionWorld_RayResultCallback_getCollisionFilterGroup",
        "",

        opaque_p("obj", "")
    )

    int(
        "CollisionWorld_RayResultCallback_getCollisionFilterMask",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CollisionWorld_RayResultCallback_getCollisionObject",
        "",

        opaque_p("obj", "")
    )

    unsigned_int(
        "CollisionWorld_RayResultCallback_getFlags",
        "",

        opaque_p("obj", "")
    )

    bool(
        "CollisionWorld_RayResultCallback_hasHit",
        "",

        opaque_p("obj", "")
    )

    bool(
        "CollisionWorld_RayResultCallback_needsCollision",
        "",

        opaque_p("obj", ""),
        opaque_p("proxy0", "")
    )

    void(
        "CollisionWorld_RayResultCallback_setClosestHitFraction",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "CollisionWorld_RayResultCallback_setCollisionFilterGroup",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "CollisionWorld_RayResultCallback_setCollisionFilterMask",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "CollisionWorld_RayResultCallback_setCollisionObject",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "CollisionWorld_RayResultCallback_setFlags",
        "",

        opaque_p("obj", ""),
        unsigned_int("value", "")
    )

    void(
        "CollisionWorld_RayResultCallback_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CollisionWorld_new",
        "",

        opaque_p("dispatcher", ""),
        opaque_p("broadphasePairCache", ""),
        opaque_p("collisionConfiguration", "")
    )

    void(
        "CollisionWorld_addCollisionObject",
        "",

        opaque_p("obj", ""),
        opaque_p("collisionObject", "")
    )

    void(
        "CollisionWorld_addCollisionObject2",
        "",

        opaque_p("obj", ""),
        opaque_p("collisionObject", ""),
        int("collisionFilterGroup", "")
    )

    void(
        "CollisionWorld_addCollisionObject3",
        "",

        opaque_p("obj", ""),
        opaque_p("collisionObject", ""),
        int("collisionFilterGroup", ""),
        int("collisionFilterMask", "")
    )

    void(
        "CollisionWorld_computeOverlappingPairs",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionWorld_contactPairTest",
        "",

        opaque_p("obj", ""),
        opaque_p("colObjA", ""),
        opaque_p("colObjB", ""),
        opaque_p("resultCallback", "")
    )

    void(
        "CollisionWorld_contactTest",
        "",

        opaque_p("obj", ""),
        opaque_p("colObj", ""),
        opaque_p("resultCallback", "")
    )

    void(
        "CollisionWorld_convexSweepTest",
        "",

        opaque_p("obj", ""),
        opaque_p("castShape", ""),
        btTransform.const.p("from", ""),
        btTransform.const.p("to", ""),
        opaque_p("resultCallback", ""),
        btScalar("allowedCcdPenetration", "")
    )

    void(
        "CollisionWorld_debugDrawObject",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("worldTransform", ""),
        opaque_p("shape", ""),
        btVector3.const.p("color", "")
    )

    void(
        "CollisionWorld_debugDrawWorld",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CollisionWorld_getBroadphase",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CollisionWorld_getCollisionObjectArray",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CollisionWorld_getDebugDrawer",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CollisionWorld_getDispatcher",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CollisionWorld_getDispatchInfo",
        "",

        opaque_p("obj", "")
    )

    bool(
        "CollisionWorld_getForceUpdateAllAabbs",
        "",

        opaque_p("obj", "")
    )

    int(
        "CollisionWorld_getNumCollisionObjects",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "CollisionWorld_getPairCache",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionWorld_objectQuerySingle",
        "",

        opaque_p("castShape", ""),
        btTransform.const.p("rayFromTrans", ""),
        btTransform.const.p("rayToTrans", ""),
        opaque_p("collisionObject", ""),
        opaque_p("collisionShape", ""),
        btTransform.const.p("colObjWorldTransform", ""),
        opaque_p("resultCallback", ""),
        btScalar("allowedPenetration", "")
    )

    void(
        "CollisionWorld_objectQuerySingleInternal",
        "",

        opaque_p("castShape", ""),
        btTransform.const.p("convexFromTrans", ""),
        btTransform.const.p("convexToTrans", ""),
        opaque_p("colObjWrap", ""),
        opaque_p("resultCallback", ""),
        btScalar("allowedPenetration", "")
    )

    void(
        "CollisionWorld_performDiscreteCollisionDetection",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionWorld_rayTest",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("rayFromWorld", ""),
        btVector3.const.p("rayToWorld", ""),
        opaque_p("resultCallback", "")
    )

    void(
        "CollisionWorld_rayTestSingle",
        "",

        btTransform.const.p("rayFromTrans", ""),
        btTransform.const.p("rayToTrans", ""),
        opaque_p("collisionObject", ""),
        opaque_p("collisionShape", ""),
        btTransform.const.p("colObjWorldTransform", ""),
        opaque_p("resultCallback", "")
    )

    void(
        "CollisionWorld_rayTestSingleInternal",
        "",

        btTransform.const.p("rayFromTrans", ""),
        btTransform.const.p("rayToTrans", ""),
        opaque_p("collisionObjectWrap", ""),
        opaque_p("resultCallback", "")
    )

    void(
        "CollisionWorld_removeCollisionObject",
        "",

        opaque_p("obj", ""),
        opaque_p("collisionObject", "")
    )

    void(
        "CollisionWorld_serialize",
        "",

        opaque_p("obj", ""),
        opaque_p("serializer", "")
    )

    void(
        "CollisionWorld_setBroadphase",
        "",

        opaque_p("obj", ""),
        opaque_p("pairCache", "")
    )

    void(
        "CollisionWorld_setDebugDrawer",
        "",

        opaque_p("obj", ""),
        opaque_p("debugDrawer", "")
    )

    void(
        "CollisionWorld_setForceUpdateAllAabbs",
        "",

        opaque_p("obj", ""),
        bool("forceUpdateAllAabbs", "")
    )

    void(
        "CollisionWorld_updateAabbs",
        "",

        opaque_p("obj", "")
    )

    void(
        "CollisionWorld_updateSingleAabb",
        "",

        opaque_p("obj", ""),
        opaque_p("colObj", "")
    )

    void(
        "CollisionWorld_delete",
        "",

        opaque_p("obj", "")
    )

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class BTCollisionWorld {

    protected BTCollisionWorld() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CollisionWorld_AllHitsRayResultCallback_new                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_AllHitsRayResultCallback_new"),
            CollisionWorld_AllHitsRayResultCallback_getCollisionObjects      = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_AllHitsRayResultCallback_getCollisionObjects"),
            CollisionWorld_AllHitsRayResultCallback_getHitFractions          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_AllHitsRayResultCallback_getHitFractions"),
            CollisionWorld_AllHitsRayResultCallback_getRayFromWorld          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_AllHitsRayResultCallback_getRayFromWorld"),
            CollisionWorld_AllHitsRayResultCallback_getRayToWorld            = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_AllHitsRayResultCallback_getRayToWorld"),
            CollisionWorld_AllHitsRayResultCallback_setRayFromWorld          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_AllHitsRayResultCallback_setRayFromWorld"),
            CollisionWorld_AllHitsRayResultCallback_setRayToWorld            = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_AllHitsRayResultCallback_setRayToWorld"),
            CollisionWorld_ClosestConvexResultCallback_new                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ClosestConvexResultCallback_new"),
            CollisionWorld_ClosestConvexResultCallback_getConvexFromWorld    = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ClosestConvexResultCallback_getConvexFromWorld"),
            CollisionWorld_ClosestConvexResultCallback_getConvexToWorld      = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ClosestConvexResultCallback_getConvexToWorld"),
            CollisionWorld_ClosestConvexResultCallback_getHitCollisionObject = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ClosestConvexResultCallback_getHitCollisionObject"),
            CollisionWorld_ClosestConvexResultCallback_getHitNormalWorld     = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ClosestConvexResultCallback_getHitNormalWorld"),
            CollisionWorld_ClosestConvexResultCallback_getHitPointWorld      = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ClosestConvexResultCallback_getHitPointWorld"),
            CollisionWorld_ClosestConvexResultCallback_setConvexFromWorld    = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ClosestConvexResultCallback_setConvexFromWorld"),
            CollisionWorld_ClosestConvexResultCallback_setConvexToWorld      = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ClosestConvexResultCallback_setConvexToWorld"),
            CollisionWorld_ClosestConvexResultCallback_setHitCollisionObject = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ClosestConvexResultCallback_setHitCollisionObject"),
            CollisionWorld_ClosestConvexResultCallback_setHitNormalWorld     = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ClosestConvexResultCallback_setHitNormalWorld"),
            CollisionWorld_ClosestConvexResultCallback_setHitPointWorld      = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ClosestConvexResultCallback_setHitPointWorld"),
            CollisionWorld_ClosestRayResultCallback_new                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ClosestRayResultCallback_new"),
            CollisionWorld_ClosestRayResultCallback_getHitNormalWorld        = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ClosestRayResultCallback_getHitNormalWorld"),
            CollisionWorld_ClosestRayResultCallback_getHitPointWorld         = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ClosestRayResultCallback_getHitPointWorld"),
            CollisionWorld_ClosestRayResultCallback_getRayFromWorld          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ClosestRayResultCallback_getRayFromWorld"),
            CollisionWorld_ClosestRayResultCallback_getRayToWorld            = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ClosestRayResultCallback_getRayToWorld"),
            CollisionWorld_ClosestRayResultCallback_setHitNormalWorld        = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ClosestRayResultCallback_setHitNormalWorld"),
            CollisionWorld_ClosestRayResultCallback_setHitPointWorld         = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ClosestRayResultCallback_setHitPointWorld"),
            CollisionWorld_ClosestRayResultCallback_setRayFromWorld          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ClosestRayResultCallback_setRayFromWorld"),
            CollisionWorld_ClosestRayResultCallback_setRayToWorld            = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ClosestRayResultCallback_setRayToWorld"),
            CollisionWorld_ContactResultCallbackWrapper_new                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ContactResultCallbackWrapper_new"),
            CollisionWorld_ContactResultCallbackWrapper_needsCollision       = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ContactResultCallbackWrapper_needsCollision"),
            CollisionWorld_ContactResultCallback_addSingleResult             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ContactResultCallback_addSingleResult"),
            CollisionWorld_ContactResultCallback_getClosestDistanceThreshold = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ContactResultCallback_getClosestDistanceThreshold"),
            CollisionWorld_ContactResultCallback_getCollisionFilterGroup     = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ContactResultCallback_getCollisionFilterGroup"),
            CollisionWorld_ContactResultCallback_getCollisionFilterMask      = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ContactResultCallback_getCollisionFilterMask"),
            CollisionWorld_ContactResultCallback_needsCollision              = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ContactResultCallback_needsCollision"),
            CollisionWorld_ContactResultCallback_setClosestDistanceThreshold = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ContactResultCallback_setClosestDistanceThreshold"),
            CollisionWorld_ContactResultCallback_setCollisionFilterGroup     = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ContactResultCallback_setCollisionFilterGroup"),
            CollisionWorld_ContactResultCallback_setCollisionFilterMask      = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ContactResultCallback_setCollisionFilterMask"),
            CollisionWorld_ContactResultCallback_delete                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ContactResultCallback_delete"),
            CollisionWorld_ConvexResultCallbackWrapper_new                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ConvexResultCallbackWrapper_new"),
            CollisionWorld_ConvexResultCallbackWrapper_needsCollision        = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ConvexResultCallbackWrapper_needsCollision"),
            CollisionWorld_ConvexResultCallback_addSingleResult              = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ConvexResultCallback_addSingleResult"),
            CollisionWorld_ConvexResultCallback_getClosestHitFraction        = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ConvexResultCallback_getClosestHitFraction"),
            CollisionWorld_ConvexResultCallback_getCollisionFilterGroup      = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ConvexResultCallback_getCollisionFilterGroup"),
            CollisionWorld_ConvexResultCallback_getCollisionFilterMask       = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ConvexResultCallback_getCollisionFilterMask"),
            CollisionWorld_ConvexResultCallback_hasHit                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ConvexResultCallback_hasHit"),
            CollisionWorld_ConvexResultCallback_needsCollision               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ConvexResultCallback_needsCollision"),
            CollisionWorld_ConvexResultCallback_setClosestHitFraction        = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ConvexResultCallback_setClosestHitFraction"),
            CollisionWorld_ConvexResultCallback_setCollisionFilterGroup      = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ConvexResultCallback_setCollisionFilterGroup"),
            CollisionWorld_ConvexResultCallback_setCollisionFilterMask       = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ConvexResultCallback_setCollisionFilterMask"),
            CollisionWorld_ConvexResultCallback_delete                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_ConvexResultCallback_delete"),
            CollisionWorld_LocalConvexResult_new                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalConvexResult_new"),
            CollisionWorld_LocalConvexResult_getHitCollisionObject           = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalConvexResult_getHitCollisionObject"),
            CollisionWorld_LocalConvexResult_getHitFraction                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalConvexResult_getHitFraction"),
            CollisionWorld_LocalConvexResult_getHitNormalLocal               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalConvexResult_getHitNormalLocal"),
            CollisionWorld_LocalConvexResult_getHitPointLocal                = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalConvexResult_getHitPointLocal"),
            CollisionWorld_LocalConvexResult_getLocalShapeInfo               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalConvexResult_getLocalShapeInfo"),
            CollisionWorld_LocalConvexResult_setHitCollisionObject           = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalConvexResult_setHitCollisionObject"),
            CollisionWorld_LocalConvexResult_setHitFraction                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalConvexResult_setHitFraction"),
            CollisionWorld_LocalConvexResult_setHitNormalLocal               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalConvexResult_setHitNormalLocal"),
            CollisionWorld_LocalConvexResult_setHitPointLocal                = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalConvexResult_setHitPointLocal"),
            CollisionWorld_LocalConvexResult_setLocalShapeInfo               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalConvexResult_setLocalShapeInfo"),
            CollisionWorld_LocalConvexResult_delete                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalConvexResult_delete"),
            CollisionWorld_LocalRayResult_new                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalRayResult_new"),
            CollisionWorld_LocalRayResult_getCollisionObject                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalRayResult_getCollisionObject"),
            CollisionWorld_LocalRayResult_getHitFraction                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalRayResult_getHitFraction"),
            CollisionWorld_LocalRayResult_getHitNormalLocal                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalRayResult_getHitNormalLocal"),
            CollisionWorld_LocalRayResult_getLocalShapeInfo                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalRayResult_getLocalShapeInfo"),
            CollisionWorld_LocalRayResult_setCollisionObject                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalRayResult_setCollisionObject"),
            CollisionWorld_LocalRayResult_setHitFraction                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalRayResult_setHitFraction"),
            CollisionWorld_LocalRayResult_setHitNormalLocal                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalRayResult_setHitNormalLocal"),
            CollisionWorld_LocalRayResult_setLocalShapeInfo                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalRayResult_setLocalShapeInfo"),
            CollisionWorld_LocalRayResult_delete                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalRayResult_delete"),
            CollisionWorld_LocalShapeInfo_new                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalShapeInfo_new"),
            CollisionWorld_LocalShapeInfo_getShapePart                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalShapeInfo_getShapePart"),
            CollisionWorld_LocalShapeInfo_getTriangleIndex                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalShapeInfo_getTriangleIndex"),
            CollisionWorld_LocalShapeInfo_setShapePart                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalShapeInfo_setShapePart"),
            CollisionWorld_LocalShapeInfo_setTriangleIndex                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalShapeInfo_setTriangleIndex"),
            CollisionWorld_LocalShapeInfo_delete                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_LocalShapeInfo_delete"),
            CollisionWorld_RayResultCallbackWrapper_new                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_RayResultCallbackWrapper_new"),
            CollisionWorld_RayResultCallbackWrapper_needsCollision           = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_RayResultCallbackWrapper_needsCollision"),
            CollisionWorld_RayResultCallback_addSingleResult                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_RayResultCallback_addSingleResult"),
            CollisionWorld_RayResultCallback_getClosestHitFraction           = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_RayResultCallback_getClosestHitFraction"),
            CollisionWorld_RayResultCallback_getCollisionFilterGroup         = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_RayResultCallback_getCollisionFilterGroup"),
            CollisionWorld_RayResultCallback_getCollisionFilterMask          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_RayResultCallback_getCollisionFilterMask"),
            CollisionWorld_RayResultCallback_getCollisionObject              = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_RayResultCallback_getCollisionObject"),
            CollisionWorld_RayResultCallback_getFlags                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_RayResultCallback_getFlags"),
            CollisionWorld_RayResultCallback_hasHit                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_RayResultCallback_hasHit"),
            CollisionWorld_RayResultCallback_needsCollision                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_RayResultCallback_needsCollision"),
            CollisionWorld_RayResultCallback_setClosestHitFraction           = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_RayResultCallback_setClosestHitFraction"),
            CollisionWorld_RayResultCallback_setCollisionFilterGroup         = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_RayResultCallback_setCollisionFilterGroup"),
            CollisionWorld_RayResultCallback_setCollisionFilterMask          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_RayResultCallback_setCollisionFilterMask"),
            CollisionWorld_RayResultCallback_setCollisionObject              = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_RayResultCallback_setCollisionObject"),
            CollisionWorld_RayResultCallback_setFlags                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_RayResultCallback_setFlags"),
            CollisionWorld_RayResultCallback_delete                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_RayResultCallback_delete"),
            CollisionWorld_new                                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_new"),
            CollisionWorld_addCollisionObject                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_addCollisionObject"),
            CollisionWorld_addCollisionObject2                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_addCollisionObject2"),
            CollisionWorld_addCollisionObject3                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_addCollisionObject3"),
            CollisionWorld_computeOverlappingPairs                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_computeOverlappingPairs"),
            CollisionWorld_contactPairTest                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_contactPairTest"),
            CollisionWorld_contactTest                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_contactTest"),
            CollisionWorld_convexSweepTest                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_convexSweepTest"),
            CollisionWorld_debugDrawObject                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_debugDrawObject"),
            CollisionWorld_debugDrawWorld                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_debugDrawWorld"),
            CollisionWorld_getBroadphase                                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_getBroadphase"),
            CollisionWorld_getCollisionObjectArray                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_getCollisionObjectArray"),
            CollisionWorld_getDebugDrawer                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_getDebugDrawer"),
            CollisionWorld_getDispatcher                                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_getDispatcher"),
            CollisionWorld_getDispatchInfo                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_getDispatchInfo"),
            CollisionWorld_getForceUpdateAllAabbs                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_getForceUpdateAllAabbs"),
            CollisionWorld_getNumCollisionObjects                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_getNumCollisionObjects"),
            CollisionWorld_getPairCache                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_getPairCache"),
            CollisionWorld_objectQuerySingle                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_objectQuerySingle"),
            CollisionWorld_objectQuerySingleInternal                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_objectQuerySingleInternal"),
            CollisionWorld_performDiscreteCollisionDetection                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_performDiscreteCollisionDetection"),
            CollisionWorld_rayTest                                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_rayTest"),
            CollisionWorld_rayTestSingle                                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_rayTestSingle"),
            CollisionWorld_rayTestSingleInternal                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_rayTestSingleInternal"),
            CollisionWorld_removeCollisionObject                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_removeCollisionObject"),
            CollisionWorld_serialize                                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_serialize"),
            CollisionWorld_setBroadphase                                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_setBroadphase"),
            CollisionWorld_setDebugDrawer                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_setDebugDrawer"),
            CollisionWorld_setForceUpdateAllAabbs                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_setForceUpdateAllAabbs"),
            CollisionWorld_updateAabbs                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_updateAabbs"),
            CollisionWorld_updateSingleAabb                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_updateSingleAabb"),
            CollisionWorld_delete                                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btCollisionWorld_delete");

    }

    // --- [ btCollisionWorld_AllHitsRayResultCallback_new ] ---

    public static long nbtCollisionWorld_AllHitsRayResultCallback_new(long rayFromWorld, long rayToWorld) {
        long __functionAddress = Functions.CollisionWorld_AllHitsRayResultCallback_new;
        return invokePPP(rayFromWorld, rayToWorld, __functionAddress);
    }

    @NativeType("void *")
    public static long btCollisionWorld_AllHitsRayResultCallback_new(@NativeType("btVector3 const *") BTVector3 rayFromWorld, @NativeType("btVector3 const *") BTVector3 rayToWorld) {
        return nbtCollisionWorld_AllHitsRayResultCallback_new(rayFromWorld.address(), rayToWorld.address());
    }

    // --- [ btCollisionWorld_AllHitsRayResultCallback_getCollisionObjects ] ---

    @NativeType("void *")
    public static long btCollisionWorld_AllHitsRayResultCallback_getCollisionObjects(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_AllHitsRayResultCallback_getCollisionObjects;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_AllHitsRayResultCallback_getHitFractions ] ---

    @NativeType("void *")
    public static long btCollisionWorld_AllHitsRayResultCallback_getHitFractions(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_AllHitsRayResultCallback_getHitFractions;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_AllHitsRayResultCallback_getRayFromWorld ] ---

    public static void nbtCollisionWorld_AllHitsRayResultCallback_getRayFromWorld(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_AllHitsRayResultCallback_getRayFromWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_AllHitsRayResultCallback_getRayFromWorld(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtCollisionWorld_AllHitsRayResultCallback_getRayFromWorld(obj, value.address());
    }

    // --- [ btCollisionWorld_AllHitsRayResultCallback_getRayToWorld ] ---

    public static void nbtCollisionWorld_AllHitsRayResultCallback_getRayToWorld(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_AllHitsRayResultCallback_getRayToWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_AllHitsRayResultCallback_getRayToWorld(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtCollisionWorld_AllHitsRayResultCallback_getRayToWorld(obj, value.address());
    }

    // --- [ btCollisionWorld_AllHitsRayResultCallback_setRayFromWorld ] ---

    public static void nbtCollisionWorld_AllHitsRayResultCallback_setRayFromWorld(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_AllHitsRayResultCallback_setRayFromWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_AllHitsRayResultCallback_setRayFromWorld(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtCollisionWorld_AllHitsRayResultCallback_setRayFromWorld(obj, value.address());
    }

    // --- [ btCollisionWorld_AllHitsRayResultCallback_setRayToWorld ] ---

    public static void nbtCollisionWorld_AllHitsRayResultCallback_setRayToWorld(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_AllHitsRayResultCallback_setRayToWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_AllHitsRayResultCallback_setRayToWorld(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtCollisionWorld_AllHitsRayResultCallback_setRayToWorld(obj, value.address());
    }

    // --- [ btCollisionWorld_ClosestConvexResultCallback_new ] ---

    public static long nbtCollisionWorld_ClosestConvexResultCallback_new(long convexFromWorld, long convexToWorld) {
        long __functionAddress = Functions.CollisionWorld_ClosestConvexResultCallback_new;
        return invokePPP(convexFromWorld, convexToWorld, __functionAddress);
    }

    @NativeType("void *")
    public static long btCollisionWorld_ClosestConvexResultCallback_new(@NativeType("btVector3 const *") BTVector3 convexFromWorld, @NativeType("btVector3 const *") BTVector3 convexToWorld) {
        return nbtCollisionWorld_ClosestConvexResultCallback_new(convexFromWorld.address(), convexToWorld.address());
    }

    // --- [ btCollisionWorld_ClosestConvexResultCallback_getConvexFromWorld ] ---

    public static void nbtCollisionWorld_ClosestConvexResultCallback_getConvexFromWorld(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_ClosestConvexResultCallback_getConvexFromWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_ClosestConvexResultCallback_getConvexFromWorld(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtCollisionWorld_ClosestConvexResultCallback_getConvexFromWorld(obj, value.address());
    }

    // --- [ btCollisionWorld_ClosestConvexResultCallback_getConvexToWorld ] ---

    public static void nbtCollisionWorld_ClosestConvexResultCallback_getConvexToWorld(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_ClosestConvexResultCallback_getConvexToWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_ClosestConvexResultCallback_getConvexToWorld(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtCollisionWorld_ClosestConvexResultCallback_getConvexToWorld(obj, value.address());
    }

    // --- [ btCollisionWorld_ClosestConvexResultCallback_getHitCollisionObject ] ---

    @NativeType("void *")
    public static long btCollisionWorld_ClosestConvexResultCallback_getHitCollisionObject(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_ClosestConvexResultCallback_getHitCollisionObject;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_ClosestConvexResultCallback_getHitNormalWorld ] ---

    public static void nbtCollisionWorld_ClosestConvexResultCallback_getHitNormalWorld(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_ClosestConvexResultCallback_getHitNormalWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_ClosestConvexResultCallback_getHitNormalWorld(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtCollisionWorld_ClosestConvexResultCallback_getHitNormalWorld(obj, value.address());
    }

    // --- [ btCollisionWorld_ClosestConvexResultCallback_getHitPointWorld ] ---

    public static void nbtCollisionWorld_ClosestConvexResultCallback_getHitPointWorld(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_ClosestConvexResultCallback_getHitPointWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_ClosestConvexResultCallback_getHitPointWorld(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtCollisionWorld_ClosestConvexResultCallback_getHitPointWorld(obj, value.address());
    }

    // --- [ btCollisionWorld_ClosestConvexResultCallback_setConvexFromWorld ] ---

    public static void nbtCollisionWorld_ClosestConvexResultCallback_setConvexFromWorld(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_ClosestConvexResultCallback_setConvexFromWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_ClosestConvexResultCallback_setConvexFromWorld(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtCollisionWorld_ClosestConvexResultCallback_setConvexFromWorld(obj, value.address());
    }

    // --- [ btCollisionWorld_ClosestConvexResultCallback_setConvexToWorld ] ---

    public static void nbtCollisionWorld_ClosestConvexResultCallback_setConvexToWorld(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_ClosestConvexResultCallback_setConvexToWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_ClosestConvexResultCallback_setConvexToWorld(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtCollisionWorld_ClosestConvexResultCallback_setConvexToWorld(obj, value.address());
    }

    // --- [ btCollisionWorld_ClosestConvexResultCallback_setHitCollisionObject ] ---

    public static void btCollisionWorld_ClosestConvexResultCallback_setHitCollisionObject(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.CollisionWorld_ClosestConvexResultCallback_setHitCollisionObject;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btCollisionWorld_ClosestConvexResultCallback_setHitNormalWorld ] ---

    public static void nbtCollisionWorld_ClosestConvexResultCallback_setHitNormalWorld(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_ClosestConvexResultCallback_setHitNormalWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_ClosestConvexResultCallback_setHitNormalWorld(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtCollisionWorld_ClosestConvexResultCallback_setHitNormalWorld(obj, value.address());
    }

    // --- [ btCollisionWorld_ClosestConvexResultCallback_setHitPointWorld ] ---

    public static void nbtCollisionWorld_ClosestConvexResultCallback_setHitPointWorld(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_ClosestConvexResultCallback_setHitPointWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_ClosestConvexResultCallback_setHitPointWorld(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtCollisionWorld_ClosestConvexResultCallback_setHitPointWorld(obj, value.address());
    }

    // --- [ btCollisionWorld_ClosestRayResultCallback_new ] ---

    public static long nbtCollisionWorld_ClosestRayResultCallback_new(long rayFromWorld, long rayToWorld) {
        long __functionAddress = Functions.CollisionWorld_ClosestRayResultCallback_new;
        return invokePPP(rayFromWorld, rayToWorld, __functionAddress);
    }

    @NativeType("void *")
    public static long btCollisionWorld_ClosestRayResultCallback_new(@NativeType("btVector3 const *") BTVector3 rayFromWorld, @NativeType("btVector3 const *") BTVector3 rayToWorld) {
        return nbtCollisionWorld_ClosestRayResultCallback_new(rayFromWorld.address(), rayToWorld.address());
    }

    // --- [ btCollisionWorld_ClosestRayResultCallback_getHitNormalWorld ] ---

    public static void nbtCollisionWorld_ClosestRayResultCallback_getHitNormalWorld(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_ClosestRayResultCallback_getHitNormalWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_ClosestRayResultCallback_getHitNormalWorld(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtCollisionWorld_ClosestRayResultCallback_getHitNormalWorld(obj, value.address());
    }

    // --- [ btCollisionWorld_ClosestRayResultCallback_getHitPointWorld ] ---

    public static void nbtCollisionWorld_ClosestRayResultCallback_getHitPointWorld(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_ClosestRayResultCallback_getHitPointWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_ClosestRayResultCallback_getHitPointWorld(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtCollisionWorld_ClosestRayResultCallback_getHitPointWorld(obj, value.address());
    }

    // --- [ btCollisionWorld_ClosestRayResultCallback_getRayFromWorld ] ---

    public static void nbtCollisionWorld_ClosestRayResultCallback_getRayFromWorld(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_ClosestRayResultCallback_getRayFromWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_ClosestRayResultCallback_getRayFromWorld(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtCollisionWorld_ClosestRayResultCallback_getRayFromWorld(obj, value.address());
    }

    // --- [ btCollisionWorld_ClosestRayResultCallback_getRayToWorld ] ---

    public static void nbtCollisionWorld_ClosestRayResultCallback_getRayToWorld(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_ClosestRayResultCallback_getRayToWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_ClosestRayResultCallback_getRayToWorld(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtCollisionWorld_ClosestRayResultCallback_getRayToWorld(obj, value.address());
    }

    // --- [ btCollisionWorld_ClosestRayResultCallback_setHitNormalWorld ] ---

    public static void nbtCollisionWorld_ClosestRayResultCallback_setHitNormalWorld(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_ClosestRayResultCallback_setHitNormalWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_ClosestRayResultCallback_setHitNormalWorld(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtCollisionWorld_ClosestRayResultCallback_setHitNormalWorld(obj, value.address());
    }

    // --- [ btCollisionWorld_ClosestRayResultCallback_setHitPointWorld ] ---

    public static void nbtCollisionWorld_ClosestRayResultCallback_setHitPointWorld(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_ClosestRayResultCallback_setHitPointWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_ClosestRayResultCallback_setHitPointWorld(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtCollisionWorld_ClosestRayResultCallback_setHitPointWorld(obj, value.address());
    }

    // --- [ btCollisionWorld_ClosestRayResultCallback_setRayFromWorld ] ---

    public static void nbtCollisionWorld_ClosestRayResultCallback_setRayFromWorld(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_ClosestRayResultCallback_setRayFromWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_ClosestRayResultCallback_setRayFromWorld(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtCollisionWorld_ClosestRayResultCallback_setRayFromWorld(obj, value.address());
    }

    // --- [ btCollisionWorld_ClosestRayResultCallback_setRayToWorld ] ---

    public static void nbtCollisionWorld_ClosestRayResultCallback_setRayToWorld(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_ClosestRayResultCallback_setRayToWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_ClosestRayResultCallback_setRayToWorld(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtCollisionWorld_ClosestRayResultCallback_setRayToWorld(obj, value.address());
    }

    // --- [ btCollisionWorld_ContactResultCallbackWrapper_new ] ---

    public static long nbtCollisionWorld_ContactResultCallbackWrapper_new(long addSingleResultCallback, long needsCollisionCallback) {
        long __functionAddress = Functions.CollisionWorld_ContactResultCallbackWrapper_new;
        return invokePPP(addSingleResultCallback, needsCollisionCallback, __functionAddress);
    }

    @NativeType("void *")
    public static long btCollisionWorld_ContactResultCallbackWrapper_new(@NativeType("p_btCollisionWorld_ContactResultCallback_addSingleResult") BTCollisionWorldContactResultCallbackAddSingleResultI addSingleResultCallback, @NativeType("p_btCollisionWorld_ContactResultCallback_needsCollision") BTCollisionWorldContactResultCallbackNeedsCollisionI needsCollisionCallback) {
        return nbtCollisionWorld_ContactResultCallbackWrapper_new(addSingleResultCallback.address(), needsCollisionCallback.address());
    }

    // --- [ btCollisionWorld_ContactResultCallbackWrapper_needsCollision ] ---

    @NativeType("bool")
    public static boolean btCollisionWorld_ContactResultCallbackWrapper_needsCollision(@NativeType("void *") long obj, @NativeType("void *") long proxy0) {
        long __functionAddress = Functions.CollisionWorld_ContactResultCallbackWrapper_needsCollision;
        if (CHECKS) {
            check(obj);
            check(proxy0);
        }
        return invokePPZ(obj, proxy0, __functionAddress);
    }

    // --- [ btCollisionWorld_ContactResultCallback_addSingleResult ] ---

    @NativeType("btScalar")
    public static float btCollisionWorld_ContactResultCallback_addSingleResult(@NativeType("void *") long obj, @NativeType("void *") long cp, @NativeType("void *") long colObj0Wrap, int partId0, int index0, @NativeType("void *") long colObj1Wrap, int partId1, int index1) {
        long __functionAddress = Functions.CollisionWorld_ContactResultCallback_addSingleResult;
        if (CHECKS) {
            check(obj);
            check(cp);
            check(colObj0Wrap);
            check(colObj1Wrap);
        }
        return invokePPPPF(obj, cp, colObj0Wrap, partId0, index0, colObj1Wrap, partId1, index1, __functionAddress);
    }

    // --- [ btCollisionWorld_ContactResultCallback_getClosestDistanceThreshold ] ---

    @NativeType("btScalar")
    public static float btCollisionWorld_ContactResultCallback_getClosestDistanceThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_ContactResultCallback_getClosestDistanceThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_ContactResultCallback_getCollisionFilterGroup ] ---

    public static int btCollisionWorld_ContactResultCallback_getCollisionFilterGroup(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_ContactResultCallback_getCollisionFilterGroup;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_ContactResultCallback_getCollisionFilterMask ] ---

    public static int btCollisionWorld_ContactResultCallback_getCollisionFilterMask(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_ContactResultCallback_getCollisionFilterMask;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_ContactResultCallback_needsCollision ] ---

    @NativeType("bool")
    public static boolean btCollisionWorld_ContactResultCallback_needsCollision(@NativeType("void *") long obj, @NativeType("void *") long proxy0) {
        long __functionAddress = Functions.CollisionWorld_ContactResultCallback_needsCollision;
        if (CHECKS) {
            check(obj);
            check(proxy0);
        }
        return invokePPZ(obj, proxy0, __functionAddress);
    }

    // --- [ btCollisionWorld_ContactResultCallback_setClosestDistanceThreshold ] ---

    public static void btCollisionWorld_ContactResultCallback_setClosestDistanceThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.CollisionWorld_ContactResultCallback_setClosestDistanceThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btCollisionWorld_ContactResultCallback_setCollisionFilterGroup ] ---

    public static void btCollisionWorld_ContactResultCallback_setCollisionFilterGroup(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.CollisionWorld_ContactResultCallback_setCollisionFilterGroup;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btCollisionWorld_ContactResultCallback_setCollisionFilterMask ] ---

    public static void btCollisionWorld_ContactResultCallback_setCollisionFilterMask(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.CollisionWorld_ContactResultCallback_setCollisionFilterMask;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btCollisionWorld_ContactResultCallback_delete ] ---

    public static void btCollisionWorld_ContactResultCallback_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_ContactResultCallback_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_ConvexResultCallbackWrapper_new ] ---

    public static long nbtCollisionWorld_ConvexResultCallbackWrapper_new(long addSingleResultCallback, long needsCollisionCallback) {
        long __functionAddress = Functions.CollisionWorld_ConvexResultCallbackWrapper_new;
        return invokePPP(addSingleResultCallback, needsCollisionCallback, __functionAddress);
    }

    @NativeType("void *")
    public static long btCollisionWorld_ConvexResultCallbackWrapper_new(@NativeType("p_btCollisionWorld_ConvexResultCallback_addSingleResult") BTCollisionWorldConvexResultCallbackAddSingleResultI addSingleResultCallback, @NativeType("p_btCollisionWorld_ConvexResultCallback_needsCollision") BTCollisionWorldConvexResultCallbackNeedsCollisionI needsCollisionCallback) {
        return nbtCollisionWorld_ConvexResultCallbackWrapper_new(addSingleResultCallback.address(), needsCollisionCallback.address());
    }

    // --- [ btCollisionWorld_ConvexResultCallbackWrapper_needsCollision ] ---

    @NativeType("bool")
    public static boolean btCollisionWorld_ConvexResultCallbackWrapper_needsCollision(@NativeType("void *") long obj, @NativeType("void *") long proxy0) {
        long __functionAddress = Functions.CollisionWorld_ConvexResultCallbackWrapper_needsCollision;
        if (CHECKS) {
            check(obj);
            check(proxy0);
        }
        return invokePPZ(obj, proxy0, __functionAddress);
    }

    // --- [ btCollisionWorld_ConvexResultCallback_addSingleResult ] ---

    @NativeType("btScalar")
    public static float btCollisionWorld_ConvexResultCallback_addSingleResult(@NativeType("void *") long obj, @NativeType("void *") long convexResult, @NativeType("bool") boolean normalInWorldSpace) {
        long __functionAddress = Functions.CollisionWorld_ConvexResultCallback_addSingleResult;
        if (CHECKS) {
            check(obj);
            check(convexResult);
        }
        return invokePPF(obj, convexResult, normalInWorldSpace, __functionAddress);
    }

    // --- [ btCollisionWorld_ConvexResultCallback_getClosestHitFraction ] ---

    @NativeType("btScalar")
    public static float btCollisionWorld_ConvexResultCallback_getClosestHitFraction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_ConvexResultCallback_getClosestHitFraction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_ConvexResultCallback_getCollisionFilterGroup ] ---

    public static int btCollisionWorld_ConvexResultCallback_getCollisionFilterGroup(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_ConvexResultCallback_getCollisionFilterGroup;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_ConvexResultCallback_getCollisionFilterMask ] ---

    public static int btCollisionWorld_ConvexResultCallback_getCollisionFilterMask(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_ConvexResultCallback_getCollisionFilterMask;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_ConvexResultCallback_hasHit ] ---

    @NativeType("bool")
    public static boolean btCollisionWorld_ConvexResultCallback_hasHit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_ConvexResultCallback_hasHit;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_ConvexResultCallback_needsCollision ] ---

    @NativeType("bool")
    public static boolean btCollisionWorld_ConvexResultCallback_needsCollision(@NativeType("void *") long obj, @NativeType("void *") long proxy0) {
        long __functionAddress = Functions.CollisionWorld_ConvexResultCallback_needsCollision;
        if (CHECKS) {
            check(obj);
            check(proxy0);
        }
        return invokePPZ(obj, proxy0, __functionAddress);
    }

    // --- [ btCollisionWorld_ConvexResultCallback_setClosestHitFraction ] ---

    public static void btCollisionWorld_ConvexResultCallback_setClosestHitFraction(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.CollisionWorld_ConvexResultCallback_setClosestHitFraction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btCollisionWorld_ConvexResultCallback_setCollisionFilterGroup ] ---

    public static void btCollisionWorld_ConvexResultCallback_setCollisionFilterGroup(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.CollisionWorld_ConvexResultCallback_setCollisionFilterGroup;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btCollisionWorld_ConvexResultCallback_setCollisionFilterMask ] ---

    public static void btCollisionWorld_ConvexResultCallback_setCollisionFilterMask(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.CollisionWorld_ConvexResultCallback_setCollisionFilterMask;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btCollisionWorld_ConvexResultCallback_delete ] ---

    public static void btCollisionWorld_ConvexResultCallback_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_ConvexResultCallback_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_LocalConvexResult_new ] ---

    public static long nbtCollisionWorld_LocalConvexResult_new(long hitCollisionObject, long localShapeInfo, long hitNormalLocal, long hitPointLocal, float hitFraction) {
        long __functionAddress = Functions.CollisionWorld_LocalConvexResult_new;
        if (CHECKS) {
            check(hitCollisionObject);
            check(localShapeInfo);
        }
        return invokePPPPP(hitCollisionObject, localShapeInfo, hitNormalLocal, hitPointLocal, hitFraction, __functionAddress);
    }

    @NativeType("void *")
    public static long btCollisionWorld_LocalConvexResult_new(@NativeType("void *") long hitCollisionObject, @NativeType("void *") long localShapeInfo, @NativeType("btVector3 const *") BTVector3 hitNormalLocal, @NativeType("btVector3 const *") BTVector3 hitPointLocal, @NativeType("btScalar") float hitFraction) {
        return nbtCollisionWorld_LocalConvexResult_new(hitCollisionObject, localShapeInfo, hitNormalLocal.address(), hitPointLocal.address(), hitFraction);
    }

    // --- [ btCollisionWorld_LocalConvexResult_getHitCollisionObject ] ---

    @NativeType("void *")
    public static long btCollisionWorld_LocalConvexResult_getHitCollisionObject(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_LocalConvexResult_getHitCollisionObject;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_LocalConvexResult_getHitFraction ] ---

    @NativeType("btScalar")
    public static float btCollisionWorld_LocalConvexResult_getHitFraction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_LocalConvexResult_getHitFraction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_LocalConvexResult_getHitNormalLocal ] ---

    public static void nbtCollisionWorld_LocalConvexResult_getHitNormalLocal(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_LocalConvexResult_getHitNormalLocal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_LocalConvexResult_getHitNormalLocal(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtCollisionWorld_LocalConvexResult_getHitNormalLocal(obj, value.address());
    }

    // --- [ btCollisionWorld_LocalConvexResult_getHitPointLocal ] ---

    public static void nbtCollisionWorld_LocalConvexResult_getHitPointLocal(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_LocalConvexResult_getHitPointLocal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_LocalConvexResult_getHitPointLocal(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtCollisionWorld_LocalConvexResult_getHitPointLocal(obj, value.address());
    }

    // --- [ btCollisionWorld_LocalConvexResult_getLocalShapeInfo ] ---

    @NativeType("void *")
    public static long btCollisionWorld_LocalConvexResult_getLocalShapeInfo(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_LocalConvexResult_getLocalShapeInfo;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_LocalConvexResult_setHitCollisionObject ] ---

    public static void btCollisionWorld_LocalConvexResult_setHitCollisionObject(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.CollisionWorld_LocalConvexResult_setHitCollisionObject;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btCollisionWorld_LocalConvexResult_setHitFraction ] ---

    public static void btCollisionWorld_LocalConvexResult_setHitFraction(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.CollisionWorld_LocalConvexResult_setHitFraction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btCollisionWorld_LocalConvexResult_setHitNormalLocal ] ---

    public static void nbtCollisionWorld_LocalConvexResult_setHitNormalLocal(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_LocalConvexResult_setHitNormalLocal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_LocalConvexResult_setHitNormalLocal(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtCollisionWorld_LocalConvexResult_setHitNormalLocal(obj, value.address());
    }

    // --- [ btCollisionWorld_LocalConvexResult_setHitPointLocal ] ---

    public static void nbtCollisionWorld_LocalConvexResult_setHitPointLocal(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_LocalConvexResult_setHitPointLocal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_LocalConvexResult_setHitPointLocal(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtCollisionWorld_LocalConvexResult_setHitPointLocal(obj, value.address());
    }

    // --- [ btCollisionWorld_LocalConvexResult_setLocalShapeInfo ] ---

    public static void btCollisionWorld_LocalConvexResult_setLocalShapeInfo(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.CollisionWorld_LocalConvexResult_setLocalShapeInfo;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btCollisionWorld_LocalConvexResult_delete ] ---

    public static void btCollisionWorld_LocalConvexResult_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_LocalConvexResult_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_LocalRayResult_new ] ---

    public static long nbtCollisionWorld_LocalRayResult_new(long collisionObject, long localShapeInfo, long hitNormalLocal, float hitFraction) {
        long __functionAddress = Functions.CollisionWorld_LocalRayResult_new;
        if (CHECKS) {
            check(collisionObject);
            check(localShapeInfo);
        }
        return invokePPPP(collisionObject, localShapeInfo, hitNormalLocal, hitFraction, __functionAddress);
    }

    @NativeType("void *")
    public static long btCollisionWorld_LocalRayResult_new(@NativeType("void *") long collisionObject, @NativeType("void *") long localShapeInfo, @NativeType("btVector3 const *") BTVector3 hitNormalLocal, @NativeType("btScalar") float hitFraction) {
        return nbtCollisionWorld_LocalRayResult_new(collisionObject, localShapeInfo, hitNormalLocal.address(), hitFraction);
    }

    // --- [ btCollisionWorld_LocalRayResult_getCollisionObject ] ---

    @NativeType("void *")
    public static long btCollisionWorld_LocalRayResult_getCollisionObject(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_LocalRayResult_getCollisionObject;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_LocalRayResult_getHitFraction ] ---

    @NativeType("btScalar")
    public static float btCollisionWorld_LocalRayResult_getHitFraction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_LocalRayResult_getHitFraction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_LocalRayResult_getHitNormalLocal ] ---

    public static void nbtCollisionWorld_LocalRayResult_getHitNormalLocal(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_LocalRayResult_getHitNormalLocal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_LocalRayResult_getHitNormalLocal(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtCollisionWorld_LocalRayResult_getHitNormalLocal(obj, value.address());
    }

    // --- [ btCollisionWorld_LocalRayResult_getLocalShapeInfo ] ---

    @NativeType("void *")
    public static long btCollisionWorld_LocalRayResult_getLocalShapeInfo(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_LocalRayResult_getLocalShapeInfo;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_LocalRayResult_setCollisionObject ] ---

    public static void btCollisionWorld_LocalRayResult_setCollisionObject(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.CollisionWorld_LocalRayResult_setCollisionObject;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btCollisionWorld_LocalRayResult_setHitFraction ] ---

    public static void btCollisionWorld_LocalRayResult_setHitFraction(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.CollisionWorld_LocalRayResult_setHitFraction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btCollisionWorld_LocalRayResult_setHitNormalLocal ] ---

    public static void nbtCollisionWorld_LocalRayResult_setHitNormalLocal(long obj, long value) {
        long __functionAddress = Functions.CollisionWorld_LocalRayResult_setHitNormalLocal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btCollisionWorld_LocalRayResult_setHitNormalLocal(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtCollisionWorld_LocalRayResult_setHitNormalLocal(obj, value.address());
    }

    // --- [ btCollisionWorld_LocalRayResult_setLocalShapeInfo ] ---

    public static void btCollisionWorld_LocalRayResult_setLocalShapeInfo(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.CollisionWorld_LocalRayResult_setLocalShapeInfo;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btCollisionWorld_LocalRayResult_delete ] ---

    public static void btCollisionWorld_LocalRayResult_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_LocalRayResult_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_LocalShapeInfo_new ] ---

    @NativeType("void *")
    public static long btCollisionWorld_LocalShapeInfo_new() {
        long __functionAddress = Functions.CollisionWorld_LocalShapeInfo_new;
        return invokeP(__functionAddress);
    }

    // --- [ btCollisionWorld_LocalShapeInfo_getShapePart ] ---

    public static int btCollisionWorld_LocalShapeInfo_getShapePart(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_LocalShapeInfo_getShapePart;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_LocalShapeInfo_getTriangleIndex ] ---

    public static int btCollisionWorld_LocalShapeInfo_getTriangleIndex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_LocalShapeInfo_getTriangleIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_LocalShapeInfo_setShapePart ] ---

    public static void btCollisionWorld_LocalShapeInfo_setShapePart(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.CollisionWorld_LocalShapeInfo_setShapePart;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btCollisionWorld_LocalShapeInfo_setTriangleIndex ] ---

    public static void btCollisionWorld_LocalShapeInfo_setTriangleIndex(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.CollisionWorld_LocalShapeInfo_setTriangleIndex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btCollisionWorld_LocalShapeInfo_delete ] ---

    public static void btCollisionWorld_LocalShapeInfo_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_LocalShapeInfo_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_RayResultCallbackWrapper_new ] ---

    public static long nbtCollisionWorld_RayResultCallbackWrapper_new(long addSingleResultCallback, long needsCollisionCallback) {
        long __functionAddress = Functions.CollisionWorld_RayResultCallbackWrapper_new;
        return invokePPP(addSingleResultCallback, needsCollisionCallback, __functionAddress);
    }

    @NativeType("void *")
    public static long btCollisionWorld_RayResultCallbackWrapper_new(@NativeType("p_btCollisionWorld_RayResultCallback_addSingleResult") BTCollisionWorldRayResultCallbackAddSingleResultI addSingleResultCallback, @NativeType("p_btCollisionWorld_RayResultCallback_needsCollision") BTCollisionWorldRayResultCallbackNeedsCollisionI needsCollisionCallback) {
        return nbtCollisionWorld_RayResultCallbackWrapper_new(addSingleResultCallback.address(), needsCollisionCallback.address());
    }

    // --- [ btCollisionWorld_RayResultCallbackWrapper_needsCollision ] ---

    @NativeType("bool")
    public static boolean btCollisionWorld_RayResultCallbackWrapper_needsCollision(@NativeType("void *") long obj, @NativeType("void *") long proxy0) {
        long __functionAddress = Functions.CollisionWorld_RayResultCallbackWrapper_needsCollision;
        if (CHECKS) {
            check(obj);
            check(proxy0);
        }
        return invokePPZ(obj, proxy0, __functionAddress);
    }

    // --- [ btCollisionWorld_RayResultCallback_addSingleResult ] ---

    @NativeType("btScalar")
    public static float btCollisionWorld_RayResultCallback_addSingleResult(@NativeType("void *") long obj, @NativeType("void *") long rayResult, @NativeType("bool") boolean normalInWorldSpace) {
        long __functionAddress = Functions.CollisionWorld_RayResultCallback_addSingleResult;
        if (CHECKS) {
            check(obj);
            check(rayResult);
        }
        return invokePPF(obj, rayResult, normalInWorldSpace, __functionAddress);
    }

    // --- [ btCollisionWorld_RayResultCallback_getClosestHitFraction ] ---

    @NativeType("btScalar")
    public static float btCollisionWorld_RayResultCallback_getClosestHitFraction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_RayResultCallback_getClosestHitFraction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_RayResultCallback_getCollisionFilterGroup ] ---

    public static int btCollisionWorld_RayResultCallback_getCollisionFilterGroup(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_RayResultCallback_getCollisionFilterGroup;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_RayResultCallback_getCollisionFilterMask ] ---

    public static int btCollisionWorld_RayResultCallback_getCollisionFilterMask(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_RayResultCallback_getCollisionFilterMask;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_RayResultCallback_getCollisionObject ] ---

    @NativeType("void *")
    public static long btCollisionWorld_RayResultCallback_getCollisionObject(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_RayResultCallback_getCollisionObject;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_RayResultCallback_getFlags ] ---

    @NativeType("unsigned int")
    public static int btCollisionWorld_RayResultCallback_getFlags(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_RayResultCallback_getFlags;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_RayResultCallback_hasHit ] ---

    @NativeType("bool")
    public static boolean btCollisionWorld_RayResultCallback_hasHit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_RayResultCallback_hasHit;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_RayResultCallback_needsCollision ] ---

    @NativeType("bool")
    public static boolean btCollisionWorld_RayResultCallback_needsCollision(@NativeType("void *") long obj, @NativeType("void *") long proxy0) {
        long __functionAddress = Functions.CollisionWorld_RayResultCallback_needsCollision;
        if (CHECKS) {
            check(obj);
            check(proxy0);
        }
        return invokePPZ(obj, proxy0, __functionAddress);
    }

    // --- [ btCollisionWorld_RayResultCallback_setClosestHitFraction ] ---

    public static void btCollisionWorld_RayResultCallback_setClosestHitFraction(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.CollisionWorld_RayResultCallback_setClosestHitFraction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btCollisionWorld_RayResultCallback_setCollisionFilterGroup ] ---

    public static void btCollisionWorld_RayResultCallback_setCollisionFilterGroup(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.CollisionWorld_RayResultCallback_setCollisionFilterGroup;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btCollisionWorld_RayResultCallback_setCollisionFilterMask ] ---

    public static void btCollisionWorld_RayResultCallback_setCollisionFilterMask(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.CollisionWorld_RayResultCallback_setCollisionFilterMask;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btCollisionWorld_RayResultCallback_setCollisionObject ] ---

    public static void btCollisionWorld_RayResultCallback_setCollisionObject(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.CollisionWorld_RayResultCallback_setCollisionObject;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btCollisionWorld_RayResultCallback_setFlags ] ---

    public static void btCollisionWorld_RayResultCallback_setFlags(@NativeType("void *") long obj, @NativeType("unsigned int") int value) {
        long __functionAddress = Functions.CollisionWorld_RayResultCallback_setFlags;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btCollisionWorld_RayResultCallback_delete ] ---

    public static void btCollisionWorld_RayResultCallback_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_RayResultCallback_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_new ] ---

    @NativeType("void *")
    public static long btCollisionWorld_new(@NativeType("void *") long dispatcher, @NativeType("void *") long broadphasePairCache, @NativeType("void *") long collisionConfiguration) {
        long __functionAddress = Functions.CollisionWorld_new;
        if (CHECKS) {
            check(dispatcher);
            check(broadphasePairCache);
            check(collisionConfiguration);
        }
        return invokePPPP(dispatcher, broadphasePairCache, collisionConfiguration, __functionAddress);
    }

    // --- [ btCollisionWorld_addCollisionObject ] ---

    public static void btCollisionWorld_addCollisionObject(@NativeType("void *") long obj, @NativeType("void *") long collisionObject) {
        long __functionAddress = Functions.CollisionWorld_addCollisionObject;
        if (CHECKS) {
            check(obj);
            check(collisionObject);
        }
        invokePPV(obj, collisionObject, __functionAddress);
    }

    // --- [ btCollisionWorld_addCollisionObject2 ] ---

    public static void btCollisionWorld_addCollisionObject2(@NativeType("void *") long obj, @NativeType("void *") long collisionObject, int collisionFilterGroup) {
        long __functionAddress = Functions.CollisionWorld_addCollisionObject2;
        if (CHECKS) {
            check(obj);
            check(collisionObject);
        }
        invokePPV(obj, collisionObject, collisionFilterGroup, __functionAddress);
    }

    // --- [ btCollisionWorld_addCollisionObject3 ] ---

    public static void btCollisionWorld_addCollisionObject3(@NativeType("void *") long obj, @NativeType("void *") long collisionObject, int collisionFilterGroup, int collisionFilterMask) {
        long __functionAddress = Functions.CollisionWorld_addCollisionObject3;
        if (CHECKS) {
            check(obj);
            check(collisionObject);
        }
        invokePPV(obj, collisionObject, collisionFilterGroup, collisionFilterMask, __functionAddress);
    }

    // --- [ btCollisionWorld_computeOverlappingPairs ] ---

    public static void btCollisionWorld_computeOverlappingPairs(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_computeOverlappingPairs;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_contactPairTest ] ---

    public static void btCollisionWorld_contactPairTest(@NativeType("void *") long obj, @NativeType("void *") long colObjA, @NativeType("void *") long colObjB, @NativeType("void *") long resultCallback) {
        long __functionAddress = Functions.CollisionWorld_contactPairTest;
        if (CHECKS) {
            check(obj);
            check(colObjA);
            check(colObjB);
            check(resultCallback);
        }
        invokePPPPV(obj, colObjA, colObjB, resultCallback, __functionAddress);
    }

    // --- [ btCollisionWorld_contactTest ] ---

    public static void btCollisionWorld_contactTest(@NativeType("void *") long obj, @NativeType("void *") long colObj, @NativeType("void *") long resultCallback) {
        long __functionAddress = Functions.CollisionWorld_contactTest;
        if (CHECKS) {
            check(obj);
            check(colObj);
            check(resultCallback);
        }
        invokePPPV(obj, colObj, resultCallback, __functionAddress);
    }

    // --- [ btCollisionWorld_convexSweepTest ] ---

    public static void nbtCollisionWorld_convexSweepTest(long obj, long castShape, long from, long to, long resultCallback, float allowedCcdPenetration) {
        long __functionAddress = Functions.CollisionWorld_convexSweepTest;
        if (CHECKS) {
            check(obj);
            check(castShape);
            check(resultCallback);
        }
        invokePPPPPV(obj, castShape, from, to, resultCallback, allowedCcdPenetration, __functionAddress);
    }

    public static void btCollisionWorld_convexSweepTest(@NativeType("void *") long obj, @NativeType("void *") long castShape, @NativeType("btTransform const *") BTTransform from, @NativeType("btTransform const *") BTTransform to, @NativeType("void *") long resultCallback, @NativeType("btScalar") float allowedCcdPenetration) {
        nbtCollisionWorld_convexSweepTest(obj, castShape, from.address(), to.address(), resultCallback, allowedCcdPenetration);
    }

    // --- [ btCollisionWorld_debugDrawObject ] ---

    public static void nbtCollisionWorld_debugDrawObject(long obj, long worldTransform, long shape, long color) {
        long __functionAddress = Functions.CollisionWorld_debugDrawObject;
        if (CHECKS) {
            check(obj);
            check(shape);
        }
        invokePPPPV(obj, worldTransform, shape, color, __functionAddress);
    }

    public static void btCollisionWorld_debugDrawObject(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform worldTransform, @NativeType("void *") long shape, @NativeType("btVector3 const *") BTVector3 color) {
        nbtCollisionWorld_debugDrawObject(obj, worldTransform.address(), shape, color.address());
    }

    // --- [ btCollisionWorld_debugDrawWorld ] ---

    public static void btCollisionWorld_debugDrawWorld(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_debugDrawWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_getBroadphase ] ---

    @NativeType("void *")
    public static long btCollisionWorld_getBroadphase(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_getBroadphase;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_getCollisionObjectArray ] ---

    @NativeType("void *")
    public static long btCollisionWorld_getCollisionObjectArray(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_getCollisionObjectArray;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_getDebugDrawer ] ---

    @NativeType("void *")
    public static long btCollisionWorld_getDebugDrawer(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_getDebugDrawer;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_getDispatcher ] ---

    @NativeType("void *")
    public static long btCollisionWorld_getDispatcher(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_getDispatcher;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_getDispatchInfo ] ---

    @NativeType("void *")
    public static long btCollisionWorld_getDispatchInfo(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_getDispatchInfo;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_getForceUpdateAllAabbs ] ---

    @NativeType("bool")
    public static boolean btCollisionWorld_getForceUpdateAllAabbs(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_getForceUpdateAllAabbs;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_getNumCollisionObjects ] ---

    public static int btCollisionWorld_getNumCollisionObjects(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_getNumCollisionObjects;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_getPairCache ] ---

    @NativeType("void *")
    public static long btCollisionWorld_getPairCache(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_getPairCache;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_objectQuerySingle ] ---

    public static void nbtCollisionWorld_objectQuerySingle(long castShape, long rayFromTrans, long rayToTrans, long collisionObject, long collisionShape, long colObjWorldTransform, long resultCallback, float allowedPenetration) {
        long __functionAddress = Functions.CollisionWorld_objectQuerySingle;
        if (CHECKS) {
            check(castShape);
            check(collisionObject);
            check(collisionShape);
            check(resultCallback);
        }
        invokePPPPPPPV(castShape, rayFromTrans, rayToTrans, collisionObject, collisionShape, colObjWorldTransform, resultCallback, allowedPenetration, __functionAddress);
    }

    public static void btCollisionWorld_objectQuerySingle(@NativeType("void *") long castShape, @NativeType("btTransform const *") BTTransform rayFromTrans, @NativeType("btTransform const *") BTTransform rayToTrans, @NativeType("void *") long collisionObject, @NativeType("void *") long collisionShape, @NativeType("btTransform const *") BTTransform colObjWorldTransform, @NativeType("void *") long resultCallback, @NativeType("btScalar") float allowedPenetration) {
        nbtCollisionWorld_objectQuerySingle(castShape, rayFromTrans.address(), rayToTrans.address(), collisionObject, collisionShape, colObjWorldTransform.address(), resultCallback, allowedPenetration);
    }

    // --- [ btCollisionWorld_objectQuerySingleInternal ] ---

    public static void nbtCollisionWorld_objectQuerySingleInternal(long castShape, long convexFromTrans, long convexToTrans, long colObjWrap, long resultCallback, float allowedPenetration) {
        long __functionAddress = Functions.CollisionWorld_objectQuerySingleInternal;
        if (CHECKS) {
            check(castShape);
            check(colObjWrap);
            check(resultCallback);
        }
        invokePPPPPV(castShape, convexFromTrans, convexToTrans, colObjWrap, resultCallback, allowedPenetration, __functionAddress);
    }

    public static void btCollisionWorld_objectQuerySingleInternal(@NativeType("void *") long castShape, @NativeType("btTransform const *") BTTransform convexFromTrans, @NativeType("btTransform const *") BTTransform convexToTrans, @NativeType("void *") long colObjWrap, @NativeType("void *") long resultCallback, @NativeType("btScalar") float allowedPenetration) {
        nbtCollisionWorld_objectQuerySingleInternal(castShape, convexFromTrans.address(), convexToTrans.address(), colObjWrap, resultCallback, allowedPenetration);
    }

    // --- [ btCollisionWorld_performDiscreteCollisionDetection ] ---

    public static void btCollisionWorld_performDiscreteCollisionDetection(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_performDiscreteCollisionDetection;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_rayTest ] ---

    public static void nbtCollisionWorld_rayTest(long obj, long rayFromWorld, long rayToWorld, long resultCallback) {
        long __functionAddress = Functions.CollisionWorld_rayTest;
        if (CHECKS) {
            check(obj);
            check(resultCallback);
        }
        invokePPPPV(obj, rayFromWorld, rayToWorld, resultCallback, __functionAddress);
    }

    public static void btCollisionWorld_rayTest(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 rayFromWorld, @NativeType("btVector3 const *") BTVector3 rayToWorld, @NativeType("void *") long resultCallback) {
        nbtCollisionWorld_rayTest(obj, rayFromWorld.address(), rayToWorld.address(), resultCallback);
    }

    // --- [ btCollisionWorld_rayTestSingle ] ---

    public static void nbtCollisionWorld_rayTestSingle(long rayFromTrans, long rayToTrans, long collisionObject, long collisionShape, long colObjWorldTransform, long resultCallback) {
        long __functionAddress = Functions.CollisionWorld_rayTestSingle;
        if (CHECKS) {
            check(collisionObject);
            check(collisionShape);
            check(resultCallback);
        }
        invokePPPPPPV(rayFromTrans, rayToTrans, collisionObject, collisionShape, colObjWorldTransform, resultCallback, __functionAddress);
    }

    public static void btCollisionWorld_rayTestSingle(@NativeType("btTransform const *") BTTransform rayFromTrans, @NativeType("btTransform const *") BTTransform rayToTrans, @NativeType("void *") long collisionObject, @NativeType("void *") long collisionShape, @NativeType("btTransform const *") BTTransform colObjWorldTransform, @NativeType("void *") long resultCallback) {
        nbtCollisionWorld_rayTestSingle(rayFromTrans.address(), rayToTrans.address(), collisionObject, collisionShape, colObjWorldTransform.address(), resultCallback);
    }

    // --- [ btCollisionWorld_rayTestSingleInternal ] ---

    public static void nbtCollisionWorld_rayTestSingleInternal(long rayFromTrans, long rayToTrans, long collisionObjectWrap, long resultCallback) {
        long __functionAddress = Functions.CollisionWorld_rayTestSingleInternal;
        if (CHECKS) {
            check(collisionObjectWrap);
            check(resultCallback);
        }
        invokePPPPV(rayFromTrans, rayToTrans, collisionObjectWrap, resultCallback, __functionAddress);
    }

    public static void btCollisionWorld_rayTestSingleInternal(@NativeType("btTransform const *") BTTransform rayFromTrans, @NativeType("btTransform const *") BTTransform rayToTrans, @NativeType("void *") long collisionObjectWrap, @NativeType("void *") long resultCallback) {
        nbtCollisionWorld_rayTestSingleInternal(rayFromTrans.address(), rayToTrans.address(), collisionObjectWrap, resultCallback);
    }

    // --- [ btCollisionWorld_removeCollisionObject ] ---

    public static void btCollisionWorld_removeCollisionObject(@NativeType("void *") long obj, @NativeType("void *") long collisionObject) {
        long __functionAddress = Functions.CollisionWorld_removeCollisionObject;
        if (CHECKS) {
            check(obj);
            check(collisionObject);
        }
        invokePPV(obj, collisionObject, __functionAddress);
    }

    // --- [ btCollisionWorld_serialize ] ---

    public static void btCollisionWorld_serialize(@NativeType("void *") long obj, @NativeType("void *") long serializer) {
        long __functionAddress = Functions.CollisionWorld_serialize;
        if (CHECKS) {
            check(obj);
            check(serializer);
        }
        invokePPV(obj, serializer, __functionAddress);
    }

    // --- [ btCollisionWorld_setBroadphase ] ---

    public static void btCollisionWorld_setBroadphase(@NativeType("void *") long obj, @NativeType("void *") long pairCache) {
        long __functionAddress = Functions.CollisionWorld_setBroadphase;
        if (CHECKS) {
            check(obj);
            check(pairCache);
        }
        invokePPV(obj, pairCache, __functionAddress);
    }

    // --- [ btCollisionWorld_setDebugDrawer ] ---

    public static void btCollisionWorld_setDebugDrawer(@NativeType("void *") long obj, @NativeType("void *") long debugDrawer) {
        long __functionAddress = Functions.CollisionWorld_setDebugDrawer;
        if (CHECKS) {
            check(obj);
            check(debugDrawer);
        }
        invokePPV(obj, debugDrawer, __functionAddress);
    }

    // --- [ btCollisionWorld_setForceUpdateAllAabbs ] ---

    public static void btCollisionWorld_setForceUpdateAllAabbs(@NativeType("void *") long obj, @NativeType("bool") boolean forceUpdateAllAabbs) {
        long __functionAddress = Functions.CollisionWorld_setForceUpdateAllAabbs;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, forceUpdateAllAabbs, __functionAddress);
    }

    // --- [ btCollisionWorld_updateAabbs ] ---

    public static void btCollisionWorld_updateAabbs(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_updateAabbs;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btCollisionWorld_updateSingleAabb ] ---

    public static void btCollisionWorld_updateSingleAabb(@NativeType("void *") long obj, @NativeType("void *") long colObj) {
        long __functionAddress = Functions.CollisionWorld_updateSingleAabb;
        if (CHECKS) {
            check(obj);
            check(colObj);
        }
        invokePPV(obj, colObj, __functionAddress);
    }

    // --- [ btCollisionWorld_delete ] ---

    public static void btCollisionWorld_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CollisionWorld_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}
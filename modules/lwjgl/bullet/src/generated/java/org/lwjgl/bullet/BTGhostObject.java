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

public class BTGhostObject {

    protected BTGhostObject() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GhostObject_new                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btGhostObject_new"),
            GhostObject_addOverlappingObjectInternal       = apiGetFunctionAddress(LibBullet.getLibrary(), "btGhostObject_addOverlappingObjectInternal"),
            GhostObject_convexSweepTest                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btGhostObject_convexSweepTest"),
            GhostObject_getNumOverlappingObjects           = apiGetFunctionAddress(LibBullet.getLibrary(), "btGhostObject_getNumOverlappingObjects"),
            GhostObject_getOverlappingObject               = apiGetFunctionAddress(LibBullet.getLibrary(), "btGhostObject_getOverlappingObject"),
            GhostObject_getOverlappingPairs                = apiGetFunctionAddress(LibBullet.getLibrary(), "btGhostObject_getOverlappingPairs"),
            GhostObject_rayTest                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btGhostObject_rayTest"),
            GhostObject_removeOverlappingObjectInternal    = apiGetFunctionAddress(LibBullet.getLibrary(), "btGhostObject_removeOverlappingObjectInternal"),
            GhostObject_upcast                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btGhostObject_upcast"),
            PairCachingGhostObject_new                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btPairCachingGhostObject_new"),
            PairCachingGhostObject_getOverlappingPairCache = apiGetFunctionAddress(LibBullet.getLibrary(), "btPairCachingGhostObject_getOverlappingPairCache"),
            GhostPairCallback_new                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGhostPairCallback_new");

    }

    // --- [ btGhostObject_new ] ---

    @NativeType("void *")
    public static long btGhostObject_new() {
        long __functionAddress = Functions.GhostObject_new;
        return invokeP(__functionAddress);
    }

    // --- [ btGhostObject_addOverlappingObjectInternal ] ---

    public static void btGhostObject_addOverlappingObjectInternal(@NativeType("void *") long obj, @NativeType("void *") long otherProxy, @NativeType("void *") long thisProxy) {
        long __functionAddress = Functions.GhostObject_addOverlappingObjectInternal;
        if (CHECKS) {
            check(obj);
            check(otherProxy);
            check(thisProxy);
        }
        invokePPPV(obj, otherProxy, thisProxy, __functionAddress);
    }

    // --- [ btGhostObject_convexSweepTest ] ---

    public static void nbtGhostObject_convexSweepTest(long obj, long castShape, long convexFromWorld, long convexToWorld, long resultCallback, float allowedCcdPenetration) {
        long __functionAddress = Functions.GhostObject_convexSweepTest;
        if (CHECKS) {
            check(obj);
            check(castShape);
            check(resultCallback);
        }
        invokePPPPPV(obj, castShape, convexFromWorld, convexToWorld, resultCallback, allowedCcdPenetration, __functionAddress);
    }

    public static void btGhostObject_convexSweepTest(@NativeType("void *") long obj, @NativeType("void *") long castShape, @NativeType("btTransform const *") BTTransform convexFromWorld, @NativeType("btTransform const *") BTTransform convexToWorld, @NativeType("void *") long resultCallback, @NativeType("btScalar") float allowedCcdPenetration) {
        nbtGhostObject_convexSweepTest(obj, castShape, convexFromWorld.address(), convexToWorld.address(), resultCallback, allowedCcdPenetration);
    }

    // --- [ btGhostObject_getNumOverlappingObjects ] ---

    public static int btGhostObject_getNumOverlappingObjects(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GhostObject_getNumOverlappingObjects;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGhostObject_getOverlappingObject ] ---

    @NativeType("void *")
    public static long btGhostObject_getOverlappingObject(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.GhostObject_getOverlappingObject;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btGhostObject_getOverlappingPairs ] ---

    @NativeType("void *")
    public static long btGhostObject_getOverlappingPairs(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GhostObject_getOverlappingPairs;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btGhostObject_rayTest ] ---

    public static void nbtGhostObject_rayTest(long obj, long rayFromWorld, long rayToWorld, long resultCallback) {
        long __functionAddress = Functions.GhostObject_rayTest;
        if (CHECKS) {
            check(obj);
            check(resultCallback);
        }
        invokePPPPV(obj, rayFromWorld, rayToWorld, resultCallback, __functionAddress);
    }

    public static void btGhostObject_rayTest(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 rayFromWorld, @NativeType("btVector3 const *") ΒΤVector3 rayToWorld, @NativeType("void *") long resultCallback) {
        nbtGhostObject_rayTest(obj, rayFromWorld.address(), rayToWorld.address(), resultCallback);
    }

    // --- [ btGhostObject_removeOverlappingObjectInternal ] ---

    public static void btGhostObject_removeOverlappingObjectInternal(@NativeType("void *") long obj, @NativeType("void *") long otherProxy, @NativeType("void *") long dispatcher, @NativeType("void *") long thisProxy) {
        long __functionAddress = Functions.GhostObject_removeOverlappingObjectInternal;
        if (CHECKS) {
            check(obj);
            check(otherProxy);
            check(dispatcher);
            check(thisProxy);
        }
        invokePPPPV(obj, otherProxy, dispatcher, thisProxy, __functionAddress);
    }

    // --- [ btGhostObject_upcast ] ---

    @NativeType("void *")
    public static long btGhostObject_upcast(@NativeType("void *") long colObj) {
        long __functionAddress = Functions.GhostObject_upcast;
        if (CHECKS) {
            check(colObj);
        }
        return invokePP(colObj, __functionAddress);
    }

    // --- [ btPairCachingGhostObject_new ] ---

    @NativeType("void *")
    public static long btPairCachingGhostObject_new() {
        long __functionAddress = Functions.PairCachingGhostObject_new;
        return invokeP(__functionAddress);
    }

    // --- [ btPairCachingGhostObject_getOverlappingPairCache ] ---

    @NativeType("void *")
    public static long btPairCachingGhostObject_getOverlappingPairCache(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PairCachingGhostObject_getOverlappingPairCache;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btGhostPairCallback_new ] ---

    @NativeType("void *")
    public static long btGhostPairCallback_new() {
        long __functionAddress = Functions.GhostPairCallback_new;
        return invokeP(__functionAddress);
    }

}
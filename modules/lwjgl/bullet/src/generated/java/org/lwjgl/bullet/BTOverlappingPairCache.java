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

public class BTOverlappingPairCache {

    protected BTOverlappingPairCache() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            OverlapCallback_processOverlap                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btOverlapCallback_processOverlap"),
            OverlapCallback_delete                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btOverlapCallback_delete"),
            OverlapFilterCallback_needBroadphaseCollision       = apiGetFunctionAddress(LibBullet.getLibrary(), "btOverlapFilterCallback_needBroadphaseCollision"),
            OverlapFilterCallback_delete                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btOverlapFilterCallback_delete"),
            OverlappingPairCache_cleanOverlappingPair           = apiGetFunctionAddress(LibBullet.getLibrary(), "btOverlappingPairCache_cleanOverlappingPair"),
            OverlappingPairCache_cleanProxyFromPairs            = apiGetFunctionAddress(LibBullet.getLibrary(), "btOverlappingPairCache_cleanProxyFromPairs"),
            OverlappingPairCache_findPair                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btOverlappingPairCache_findPair"),
            OverlappingPairCache_getNumOverlappingPairs         = apiGetFunctionAddress(LibBullet.getLibrary(), "btOverlappingPairCache_getNumOverlappingPairs"),
            OverlappingPairCache_getOverlappingPairArray        = apiGetFunctionAddress(LibBullet.getLibrary(), "btOverlappingPairCache_getOverlappingPairArray"),
            OverlappingPairCache_getOverlappingPairArrayPtr     = apiGetFunctionAddress(LibBullet.getLibrary(), "btOverlappingPairCache_getOverlappingPairArrayPtr"),
            OverlappingPairCache_hasDeferredRemoval             = apiGetFunctionAddress(LibBullet.getLibrary(), "btOverlappingPairCache_hasDeferredRemoval"),
            OverlappingPairCache_processAllOverlappingPairs     = apiGetFunctionAddress(LibBullet.getLibrary(), "btOverlappingPairCache_processAllOverlappingPairs"),
            OverlappingPairCache_processAllOverlappingPairs2    = apiGetFunctionAddress(LibBullet.getLibrary(), "btOverlappingPairCache_processAllOverlappingPairs2"),
            OverlappingPairCache_setInternalGhostPairCallback   = apiGetFunctionAddress(LibBullet.getLibrary(), "btOverlappingPairCache_setInternalGhostPairCallback"),
            OverlappingPairCache_setOverlapFilterCallback       = apiGetFunctionAddress(LibBullet.getLibrary(), "btOverlappingPairCache_setOverlapFilterCallback"),
            OverlappingPairCache_sortOverlappingPairs           = apiGetFunctionAddress(LibBullet.getLibrary(), "btOverlappingPairCache_sortOverlappingPairs"),
            OverlapFilterCallbackWrapper_new                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btOverlapFilterCallbackWrapper_new"),
            HashedOverlappingPairCache_new                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btHashedOverlappingPairCache_new"),
            HashedOverlappingPairCache_GetCount                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btHashedOverlappingPairCache_GetCount"),
            HashedOverlappingPairCache_getOverlapFilterCallback = apiGetFunctionAddress(LibBullet.getLibrary(), "btHashedOverlappingPairCache_getOverlapFilterCallback"),
            HashedOverlappingPairCache_needsBroadphaseCollision = apiGetFunctionAddress(LibBullet.getLibrary(), "btHashedOverlappingPairCache_needsBroadphaseCollision"),
            SortedOverlappingPairCache_new                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSortedOverlappingPairCache_new"),
            SortedOverlappingPairCache_getOverlapFilterCallback = apiGetFunctionAddress(LibBullet.getLibrary(), "btSortedOverlappingPairCache_getOverlapFilterCallback"),
            SortedOverlappingPairCache_needsBroadphaseCollision = apiGetFunctionAddress(LibBullet.getLibrary(), "btSortedOverlappingPairCache_needsBroadphaseCollision"),
            NullPairCache_new                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btNullPairCache_new");

    }

    // --- [ btOverlapCallback_processOverlap ] ---

    @NativeType("bool")
    public static boolean btOverlapCallback_processOverlap(@NativeType("void *") long obj, @NativeType("void *") long pair) {
        long __functionAddress = Functions.OverlapCallback_processOverlap;
        if (CHECKS) {
            check(obj);
            check(pair);
        }
        return invokePPZ(obj, pair, __functionAddress);
    }

    // --- [ btOverlapCallback_delete ] ---

    public static void btOverlapCallback_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.OverlapCallback_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btOverlapFilterCallback_needBroadphaseCollision ] ---

    @NativeType("bool")
    public static boolean btOverlapFilterCallback_needBroadphaseCollision(@NativeType("void *") long obj, @NativeType("void *") long proxy0, @NativeType("void *") long proxy1) {
        long __functionAddress = Functions.OverlapFilterCallback_needBroadphaseCollision;
        if (CHECKS) {
            check(obj);
            check(proxy0);
            check(proxy1);
        }
        return invokePPPZ(obj, proxy0, proxy1, __functionAddress);
    }

    // --- [ btOverlapFilterCallback_delete ] ---

    public static void btOverlapFilterCallback_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.OverlapFilterCallback_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btOverlappingPairCache_cleanOverlappingPair ] ---

    public static void btOverlappingPairCache_cleanOverlappingPair(@NativeType("void *") long obj, @NativeType("void *") long pair, @NativeType("void *") long dispatcher) {
        long __functionAddress = Functions.OverlappingPairCache_cleanOverlappingPair;
        if (CHECKS) {
            check(obj);
            check(pair);
            check(dispatcher);
        }
        invokePPPV(obj, pair, dispatcher, __functionAddress);
    }

    // --- [ btOverlappingPairCache_cleanProxyFromPairs ] ---

    public static void btOverlappingPairCache_cleanProxyFromPairs(@NativeType("void *") long obj, @NativeType("void *") long proxy, @NativeType("void *") long dispatcher) {
        long __functionAddress = Functions.OverlappingPairCache_cleanProxyFromPairs;
        if (CHECKS) {
            check(obj);
            check(proxy);
            check(dispatcher);
        }
        invokePPPV(obj, proxy, dispatcher, __functionAddress);
    }

    // --- [ btOverlappingPairCache_findPair ] ---

    @NativeType("void *")
    public static long btOverlappingPairCache_findPair(@NativeType("void *") long obj, @NativeType("void *") long proxy0, @NativeType("void *") long proxy1) {
        long __functionAddress = Functions.OverlappingPairCache_findPair;
        if (CHECKS) {
            check(obj);
            check(proxy0);
            check(proxy1);
        }
        return invokePPPP(obj, proxy0, proxy1, __functionAddress);
    }

    // --- [ btOverlappingPairCache_getNumOverlappingPairs ] ---

    public static int btOverlappingPairCache_getNumOverlappingPairs(@NativeType("void *") long obj) {
        long __functionAddress = Functions.OverlappingPairCache_getNumOverlappingPairs;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btOverlappingPairCache_getOverlappingPairArray ] ---

    @NativeType("void *")
    public static long btOverlappingPairCache_getOverlappingPairArray(@NativeType("void *") long obj) {
        long __functionAddress = Functions.OverlappingPairCache_getOverlappingPairArray;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btOverlappingPairCache_getOverlappingPairArrayPtr ] ---

    @NativeType("void *")
    public static long btOverlappingPairCache_getOverlappingPairArrayPtr(@NativeType("void *") long obj) {
        long __functionAddress = Functions.OverlappingPairCache_getOverlappingPairArrayPtr;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btOverlappingPairCache_hasDeferredRemoval ] ---

    @NativeType("bool")
    public static boolean btOverlappingPairCache_hasDeferredRemoval(@NativeType("void *") long obj) {
        long __functionAddress = Functions.OverlappingPairCache_hasDeferredRemoval;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btOverlappingPairCache_processAllOverlappingPairs ] ---

    public static void btOverlappingPairCache_processAllOverlappingPairs(@NativeType("void *") long obj, @NativeType("void *") long __unnamed0, @NativeType("void *") long dispatcher) {
        long __functionAddress = Functions.OverlappingPairCache_processAllOverlappingPairs;
        if (CHECKS) {
            check(obj);
            check(__unnamed0);
            check(dispatcher);
        }
        invokePPPV(obj, __unnamed0, dispatcher, __functionAddress);
    }

    // --- [ btOverlappingPairCache_processAllOverlappingPairs2 ] ---

    public static void btOverlappingPairCache_processAllOverlappingPairs2(@NativeType("void *") long obj, @NativeType("void *") long callback, @NativeType("void *") long dispatcher, @NativeType("void *") long dispatchInfo) {
        long __functionAddress = Functions.OverlappingPairCache_processAllOverlappingPairs2;
        if (CHECKS) {
            check(obj);
            check(callback);
            check(dispatcher);
            check(dispatchInfo);
        }
        invokePPPPV(obj, callback, dispatcher, dispatchInfo, __functionAddress);
    }

    // --- [ btOverlappingPairCache_setInternalGhostPairCallback ] ---

    public static void btOverlappingPairCache_setInternalGhostPairCallback(@NativeType("void *") long obj, @NativeType("void *") long ghostPairCallback) {
        long __functionAddress = Functions.OverlappingPairCache_setInternalGhostPairCallback;
        if (CHECKS) {
            check(obj);
            check(ghostPairCallback);
        }
        invokePPV(obj, ghostPairCallback, __functionAddress);
    }

    // --- [ btOverlappingPairCache_setOverlapFilterCallback ] ---

    public static void btOverlappingPairCache_setOverlapFilterCallback(@NativeType("void *") long obj, @NativeType("void *") long callback) {
        long __functionAddress = Functions.OverlappingPairCache_setOverlapFilterCallback;
        if (CHECKS) {
            check(obj);
            check(callback);
        }
        invokePPV(obj, callback, __functionAddress);
    }

    // --- [ btOverlappingPairCache_sortOverlappingPairs ] ---

    public static void btOverlappingPairCache_sortOverlappingPairs(@NativeType("void *") long obj, @NativeType("void *") long dispatcher) {
        long __functionAddress = Functions.OverlappingPairCache_sortOverlappingPairs;
        if (CHECKS) {
            check(obj);
            check(dispatcher);
        }
        invokePPV(obj, dispatcher, __functionAddress);
    }

    // --- [ btOverlapFilterCallbackWrapper_new ] ---

    public static long nbtOverlapFilterCallbackWrapper_new(long needBroadphaseCollision) {
        long __functionAddress = Functions.OverlapFilterCallbackWrapper_new;
        return invokePP(needBroadphaseCollision, __functionAddress);
    }

    @NativeType("void *")
    public static long btOverlapFilterCallbackWrapper_new(@NativeType("p_btOverlapFilterCallback_needBroadphaseCollision") BTOverlapFilterCallbackNeedBroadphaseCollisionI needBroadphaseCollision) {
        return nbtOverlapFilterCallbackWrapper_new(needBroadphaseCollision.address());
    }

    // --- [ btHashedOverlappingPairCache_new ] ---

    @NativeType("void *")
    public static long btHashedOverlappingPairCache_new() {
        long __functionAddress = Functions.HashedOverlappingPairCache_new;
        return invokeP(__functionAddress);
    }

    // --- [ btHashedOverlappingPairCache_GetCount ] ---

    public static int btHashedOverlappingPairCache_GetCount(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HashedOverlappingPairCache_GetCount;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btHashedOverlappingPairCache_getOverlapFilterCallback ] ---

    @NativeType("void *")
    public static long btHashedOverlappingPairCache_getOverlapFilterCallback(@NativeType("void *") long obj) {
        long __functionAddress = Functions.HashedOverlappingPairCache_getOverlapFilterCallback;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btHashedOverlappingPairCache_needsBroadphaseCollision ] ---

    @NativeType("bool")
    public static boolean btHashedOverlappingPairCache_needsBroadphaseCollision(@NativeType("void *") long obj, @NativeType("void *") long proxy0, @NativeType("void *") long proxy1) {
        long __functionAddress = Functions.HashedOverlappingPairCache_needsBroadphaseCollision;
        if (CHECKS) {
            check(obj);
            check(proxy0);
            check(proxy1);
        }
        return invokePPPZ(obj, proxy0, proxy1, __functionAddress);
    }

    // --- [ btSortedOverlappingPairCache_new ] ---

    @NativeType("void *")
    public static long btSortedOverlappingPairCache_new() {
        long __functionAddress = Functions.SortedOverlappingPairCache_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSortedOverlappingPairCache_getOverlapFilterCallback ] ---

    @NativeType("void *")
    public static long btSortedOverlappingPairCache_getOverlapFilterCallback(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SortedOverlappingPairCache_getOverlapFilterCallback;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSortedOverlappingPairCache_needsBroadphaseCollision ] ---

    @NativeType("bool")
    public static boolean btSortedOverlappingPairCache_needsBroadphaseCollision(@NativeType("void *") long obj, @NativeType("void *") long proxy0, @NativeType("void *") long proxy1) {
        long __functionAddress = Functions.SortedOverlappingPairCache_needsBroadphaseCollision;
        if (CHECKS) {
            check(obj);
            check(proxy0);
            check(proxy1);
        }
        return invokePPPZ(obj, proxy0, proxy1, __functionAddress);
    }

    // --- [ btNullPairCache_new ] ---

    @NativeType("void *")
    public static long btNullPairCache_new() {
        long __functionAddress = Functions.NullPairCache_new;
        return invokeP(__functionAddress);
    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BTBroadphaseInterface {

    protected BTBroadphaseInterface() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            BroadphaseAabbCallbackWrapper_new             = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseAabbCallbackWrapper_new"),
            BroadphaseAabbCallback_process                = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseAabbCallback_process"),
            BroadphaseAabbCallback_delete                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseAabbCallback_delete"),
            BroadphaseRayCallbackWrapper_new              = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseRayCallbackWrapper_new"),
            BroadphaseRayCallback_getLambda_max           = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseRayCallback_getLambda_max"),
            BroadphaseRayCallback_getRayDirectionInverse  = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseRayCallback_getRayDirectionInverse"),
            BroadphaseRayCallback_getSigns                = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseRayCallback_getSigns"),
            BroadphaseRayCallback_setLambda_max           = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseRayCallback_setLambda_max"),
            BroadphaseRayCallback_setRayDirectionInverse  = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseRayCallback_setRayDirectionInverse"),
            BroadphaseInterface_aabbTest                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseInterface_aabbTest"),
            BroadphaseInterface_calculateOverlappingPairs = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseInterface_calculateOverlappingPairs"),
            BroadphaseInterface_createProxy               = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseInterface_createProxy"),
            BroadphaseInterface_destroyProxy              = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseInterface_destroyProxy"),
            BroadphaseInterface_getAabb                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseInterface_getAabb"),
            BroadphaseInterface_getBroadphaseAabb         = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseInterface_getBroadphaseAabb"),
            BroadphaseInterface_getOverlappingPairCache   = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseInterface_getOverlappingPairCache"),
            BroadphaseInterface_printStats                = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseInterface_printStats"),
            BroadphaseInterface_rayTest                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseInterface_rayTest"),
            BroadphaseInterface_rayTest2                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseInterface_rayTest2"),
            BroadphaseInterface_rayTest3                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseInterface_rayTest3"),
            BroadphaseInterface_resetPool                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseInterface_resetPool"),
            BroadphaseInterface_setAabb                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseInterface_setAabb"),
            BroadphaseInterface_delete                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btBroadphaseInterface_delete");

    }

    // --- [ btBroadphaseAabbCallbackWrapper_new ] ---

    @NativeType("void *")
    public static long btBroadphaseAabbCallbackWrapper_new(@NativeType("void *") long processCallback) {
        long __functionAddress = Functions.BroadphaseAabbCallbackWrapper_new;
        if (CHECKS) {
            check(processCallback);
        }
        return invokePP(processCallback, __functionAddress);
    }

    // --- [ btBroadphaseAabbCallback_process ] ---

    @NativeType("bool")
    public static boolean btBroadphaseAabbCallback_process(@NativeType("void *") long obj, @NativeType("void *") long proxy) {
        long __functionAddress = Functions.BroadphaseAabbCallback_process;
        if (CHECKS) {
            check(obj);
            check(proxy);
        }
        return invokePPZ(obj, proxy, __functionAddress);
    }

    // --- [ btBroadphaseAabbCallback_delete ] ---

    public static void btBroadphaseAabbCallback_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BroadphaseAabbCallback_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btBroadphaseRayCallbackWrapper_new ] ---

    @NativeType("void *")
    public static long btBroadphaseRayCallbackWrapper_new(@NativeType("void *") long processCallback) {
        long __functionAddress = Functions.BroadphaseRayCallbackWrapper_new;
        if (CHECKS) {
            check(processCallback);
        }
        return invokePP(processCallback, __functionAddress);
    }

    // --- [ btBroadphaseRayCallback_getLambda_max ] ---

    @NativeType("btScalar")
    public static float btBroadphaseRayCallback_getLambda_max(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BroadphaseRayCallback_getLambda_max;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btBroadphaseRayCallback_getRayDirectionInverse ] ---

    public static void nbtBroadphaseRayCallback_getRayDirectionInverse(long obj, long value) {
        long __functionAddress = Functions.BroadphaseRayCallback_getRayDirectionInverse;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btBroadphaseRayCallback_getRayDirectionInverse(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtBroadphaseRayCallback_getRayDirectionInverse(obj, value.address());
    }

    // --- [ btBroadphaseRayCallback_getSigns ] ---

    @NativeType("unsigned int[3]")
    public static IntBuffer btBroadphaseRayCallback_getSigns(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BroadphaseRayCallback_getSigns;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memIntBuffer(__result, 3);
    }

    // --- [ btBroadphaseRayCallback_setLambda_max ] ---

    public static void btBroadphaseRayCallback_setLambda_max(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.BroadphaseRayCallback_setLambda_max;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btBroadphaseRayCallback_setRayDirectionInverse ] ---

    public static void nbtBroadphaseRayCallback_setRayDirectionInverse(long obj, long value) {
        long __functionAddress = Functions.BroadphaseRayCallback_setRayDirectionInverse;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btBroadphaseRayCallback_setRayDirectionInverse(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtBroadphaseRayCallback_setRayDirectionInverse(obj, value.address());
    }

    // --- [ btBroadphaseInterface_aabbTest ] ---

    public static void nbtBroadphaseInterface_aabbTest(long obj, long aabbMin, long aabbMax, long callback) {
        long __functionAddress = Functions.BroadphaseInterface_aabbTest;
        if (CHECKS) {
            check(obj);
            check(callback);
        }
        invokePPPPV(obj, aabbMin, aabbMax, callback, __functionAddress);
    }

    public static void btBroadphaseInterface_aabbTest(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 aabbMin, @NativeType("btVector3 const *") BTVector3 aabbMax, @NativeType("void *") long callback) {
        nbtBroadphaseInterface_aabbTest(obj, aabbMin.address(), aabbMax.address(), callback);
    }

    // --- [ btBroadphaseInterface_calculateOverlappingPairs ] ---

    public static void btBroadphaseInterface_calculateOverlappingPairs(@NativeType("void *") long obj, @NativeType("void *") long dispatcher) {
        long __functionAddress = Functions.BroadphaseInterface_calculateOverlappingPairs;
        if (CHECKS) {
            check(obj);
            check(dispatcher);
        }
        invokePPV(obj, dispatcher, __functionAddress);
    }

    // --- [ btBroadphaseInterface_createProxy ] ---

    public static long nbtBroadphaseInterface_createProxy(long obj, long aabbMin, long aabbMax, int shapeType, long userPtr, int collisionFilterGroup, int collisionFilterMask, long dispatcher) {
        long __functionAddress = Functions.BroadphaseInterface_createProxy;
        if (CHECKS) {
            check(obj);
            check(userPtr);
            check(dispatcher);
        }
        return invokePPPPPP(obj, aabbMin, aabbMax, shapeType, userPtr, collisionFilterGroup, collisionFilterMask, dispatcher, __functionAddress);
    }

    @NativeType("void *")
    public static long btBroadphaseInterface_createProxy(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 aabbMin, @NativeType("btVector3 const *") BTVector3 aabbMax, int shapeType, @NativeType("void *") long userPtr, int collisionFilterGroup, int collisionFilterMask, @NativeType("void *") long dispatcher) {
        return nbtBroadphaseInterface_createProxy(obj, aabbMin.address(), aabbMax.address(), shapeType, userPtr, collisionFilterGroup, collisionFilterMask, dispatcher);
    }

    // --- [ btBroadphaseInterface_destroyProxy ] ---

    public static void btBroadphaseInterface_destroyProxy(@NativeType("void *") long obj, @NativeType("void *") long proxy, @NativeType("void *") long dispatcher) {
        long __functionAddress = Functions.BroadphaseInterface_destroyProxy;
        if (CHECKS) {
            check(obj);
            check(proxy);
            check(dispatcher);
        }
        invokePPPV(obj, proxy, dispatcher, __functionAddress);
    }

    // --- [ btBroadphaseInterface_getAabb ] ---

    public static void nbtBroadphaseInterface_getAabb(long obj, long proxy, long aabbMin, long aabbMax) {
        long __functionAddress = Functions.BroadphaseInterface_getAabb;
        if (CHECKS) {
            check(obj);
            check(proxy);
        }
        invokePPPPV(obj, proxy, aabbMin, aabbMax, __functionAddress);
    }

    public static void btBroadphaseInterface_getAabb(@NativeType("void *") long obj, @NativeType("void *") long proxy, @NativeType("btVector3 *") BTVector3 aabbMin, @NativeType("btVector3 *") BTVector3 aabbMax) {
        nbtBroadphaseInterface_getAabb(obj, proxy, aabbMin.address(), aabbMax.address());
    }

    // --- [ btBroadphaseInterface_getBroadphaseAabb ] ---

    public static void nbtBroadphaseInterface_getBroadphaseAabb(long obj, long aabbMin, long aabbMax) {
        long __functionAddress = Functions.BroadphaseInterface_getBroadphaseAabb;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, aabbMin, aabbMax, __functionAddress);
    }

    public static void btBroadphaseInterface_getBroadphaseAabb(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 aabbMin, @NativeType("btVector3 *") BTVector3 aabbMax) {
        nbtBroadphaseInterface_getBroadphaseAabb(obj, aabbMin.address(), aabbMax.address());
    }

    // --- [ btBroadphaseInterface_getOverlappingPairCache ] ---

    @NativeType("void *")
    public static long btBroadphaseInterface_getOverlappingPairCache(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BroadphaseInterface_getOverlappingPairCache;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btBroadphaseInterface_printStats ] ---

    public static void btBroadphaseInterface_printStats(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BroadphaseInterface_printStats;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btBroadphaseInterface_rayTest ] ---

    public static void nbtBroadphaseInterface_rayTest(long obj, long rayFrom, long rayTo, long rayCallback) {
        long __functionAddress = Functions.BroadphaseInterface_rayTest;
        if (CHECKS) {
            check(obj);
            check(rayCallback);
        }
        invokePPPPV(obj, rayFrom, rayTo, rayCallback, __functionAddress);
    }

    public static void btBroadphaseInterface_rayTest(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 rayFrom, @NativeType("btVector3 const *") BTVector3 rayTo, @NativeType("void *") long rayCallback) {
        nbtBroadphaseInterface_rayTest(obj, rayFrom.address(), rayTo.address(), rayCallback);
    }

    // --- [ btBroadphaseInterface_rayTest2 ] ---

    public static void nbtBroadphaseInterface_rayTest2(long obj, long rayFrom, long rayTo, long rayCallback, long aabbMin) {
        long __functionAddress = Functions.BroadphaseInterface_rayTest2;
        if (CHECKS) {
            check(obj);
            check(rayCallback);
        }
        invokePPPPPV(obj, rayFrom, rayTo, rayCallback, aabbMin, __functionAddress);
    }

    public static void btBroadphaseInterface_rayTest2(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 rayFrom, @NativeType("btVector3 const *") BTVector3 rayTo, @NativeType("void *") long rayCallback, @NativeType("btVector3 const *") BTVector3 aabbMin) {
        nbtBroadphaseInterface_rayTest2(obj, rayFrom.address(), rayTo.address(), rayCallback, aabbMin.address());
    }

    // --- [ btBroadphaseInterface_rayTest3 ] ---

    public static void nbtBroadphaseInterface_rayTest3(long obj, long rayFrom, long rayTo, long rayCallback, long aabbMin, long aabbMax) {
        long __functionAddress = Functions.BroadphaseInterface_rayTest3;
        if (CHECKS) {
            check(obj);
            check(rayCallback);
        }
        invokePPPPPPV(obj, rayFrom, rayTo, rayCallback, aabbMin, aabbMax, __functionAddress);
    }

    public static void btBroadphaseInterface_rayTest3(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 rayFrom, @NativeType("btVector3 const *") BTVector3 rayTo, @NativeType("void *") long rayCallback, @NativeType("btVector3 const *") BTVector3 aabbMin, @NativeType("btVector3 const *") BTVector3 aabbMax) {
        nbtBroadphaseInterface_rayTest3(obj, rayFrom.address(), rayTo.address(), rayCallback, aabbMin.address(), aabbMax.address());
    }

    // --- [ btBroadphaseInterface_resetPool ] ---

    public static void btBroadphaseInterface_resetPool(@NativeType("void *") long obj, @NativeType("void *") long dispatcher) {
        long __functionAddress = Functions.BroadphaseInterface_resetPool;
        if (CHECKS) {
            check(obj);
            check(dispatcher);
        }
        invokePPV(obj, dispatcher, __functionAddress);
    }

    // --- [ btBroadphaseInterface_setAabb ] ---

    public static void nbtBroadphaseInterface_setAabb(long obj, long proxy, long aabbMin, long aabbMax, long dispatcher) {
        long __functionAddress = Functions.BroadphaseInterface_setAabb;
        if (CHECKS) {
            check(obj);
            check(proxy);
            check(dispatcher);
        }
        invokePPPPPV(obj, proxy, aabbMin, aabbMax, dispatcher, __functionAddress);
    }

    public static void btBroadphaseInterface_setAabb(@NativeType("void *") long obj, @NativeType("void *") long proxy, @NativeType("btVector3 const *") BTVector3 aabbMin, @NativeType("btVector3 const *") BTVector3 aabbMax, @NativeType("void *") long dispatcher) {
        nbtBroadphaseInterface_setAabb(obj, proxy, aabbMin.address(), aabbMax.address(), dispatcher);
    }

    // --- [ btBroadphaseInterface_delete ] ---

    public static void btBroadphaseInterface_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.BroadphaseInterface_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}
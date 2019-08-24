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

public class BTDispatcher {

    protected BTDispatcher() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            DispatcherInfo_getAllowedCcdPenetration               = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_getAllowedCcdPenetration"),
            DispatcherInfo_getConvexConservativeDistanceThreshold = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_getConvexConservativeDistanceThreshold"),
            DispatcherInfo_getDebugDraw                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_getDebugDraw"),
            DispatcherInfo_getDeterministicOverlappingPairs       = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_getDeterministicOverlappingPairs"),
            DispatcherInfo_getDispatchFunc                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_getDispatchFunc"),
            DispatcherInfo_getEnableSatConvex                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_getEnableSatConvex"),
            DispatcherInfo_getEnableSPU                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_getEnableSPU"),
            DispatcherInfo_getStepCount                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_getStepCount"),
            DispatcherInfo_getTimeOfImpact                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_getTimeOfImpact"),
            DispatcherInfo_getTimeStep                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_getTimeStep"),
            DispatcherInfo_getUseContinuous                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_getUseContinuous"),
            DispatcherInfo_getUseConvexConservativeDistanceUtil   = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_getUseConvexConservativeDistanceUtil"),
            DispatcherInfo_getUseEpa                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_getUseEpa"),
            DispatcherInfo_setAllowedCcdPenetration               = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_setAllowedCcdPenetration"),
            DispatcherInfo_setConvexConservativeDistanceThreshold = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_setConvexConservativeDistanceThreshold"),
            DispatcherInfo_setDebugDraw                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_setDebugDraw"),
            DispatcherInfo_setDeterministicOverlappingPairs       = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_setDeterministicOverlappingPairs"),
            DispatcherInfo_setDispatchFunc                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_setDispatchFunc"),
            DispatcherInfo_setEnableSatConvex                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_setEnableSatConvex"),
            DispatcherInfo_setEnableSPU                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_setEnableSPU"),
            DispatcherInfo_setStepCount                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_setStepCount"),
            DispatcherInfo_setTimeOfImpact                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_setTimeOfImpact"),
            DispatcherInfo_setTimeStep                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_setTimeStep"),
            DispatcherInfo_setUseContinuous                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_setUseContinuous"),
            DispatcherInfo_setUseConvexConservativeDistanceUtil   = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_setUseConvexConservativeDistanceUtil"),
            DispatcherInfo_setUseEpa                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcherInfo_setUseEpa"),
            Dispatcher_allocateCollisionAlgorithm                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcher_allocateCollisionAlgorithm"),
            Dispatcher_clearManifold                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcher_clearManifold"),
            Dispatcher_dispatchAllCollisionPairs                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcher_dispatchAllCollisionPairs"),
            Dispatcher_findAlgorithm                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcher_findAlgorithm"),
            Dispatcher_freeCollisionAlgorithm                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcher_freeCollisionAlgorithm"),
            Dispatcher_getInternalManifoldPointer                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcher_getInternalManifoldPointer"),
            Dispatcher_getInternalManifoldPool                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcher_getInternalManifoldPool"),
            Dispatcher_getManifoldByIndexInternal                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcher_getManifoldByIndexInternal"),
            Dispatcher_getNewManifold                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcher_getNewManifold"),
            Dispatcher_getNumManifolds                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcher_getNumManifolds"),
            Dispatcher_needsCollision                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcher_needsCollision"),
            Dispatcher_needsResponse                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcher_needsResponse"),
            Dispatcher_releaseManifold                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcher_releaseManifold"),
            Dispatcher_delete                                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btDispatcher_delete");

    }

    // --- [ btDispatcherInfo_getAllowedCcdPenetration ] ---

    @NativeType("btScalar")
    public static float btDispatcherInfo_getAllowedCcdPenetration(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DispatcherInfo_getAllowedCcdPenetration;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btDispatcherInfo_getConvexConservativeDistanceThreshold ] ---

    @NativeType("btScalar")
    public static float btDispatcherInfo_getConvexConservativeDistanceThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DispatcherInfo_getConvexConservativeDistanceThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btDispatcherInfo_getDebugDraw ] ---

    @NativeType("void *")
    public static long btDispatcherInfo_getDebugDraw(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DispatcherInfo_getDebugDraw;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDispatcherInfo_getDeterministicOverlappingPairs ] ---

    @NativeType("bool")
    public static boolean btDispatcherInfo_getDeterministicOverlappingPairs(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DispatcherInfo_getDeterministicOverlappingPairs;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btDispatcherInfo_getDispatchFunc ] ---

    public static int btDispatcherInfo_getDispatchFunc(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DispatcherInfo_getDispatchFunc;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDispatcherInfo_getEnableSatConvex ] ---

    @NativeType("bool")
    public static boolean btDispatcherInfo_getEnableSatConvex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DispatcherInfo_getEnableSatConvex;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btDispatcherInfo_getEnableSPU ] ---

    @NativeType("bool")
    public static boolean btDispatcherInfo_getEnableSPU(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DispatcherInfo_getEnableSPU;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btDispatcherInfo_getStepCount ] ---

    public static int btDispatcherInfo_getStepCount(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DispatcherInfo_getStepCount;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDispatcherInfo_getTimeOfImpact ] ---

    @NativeType("btScalar")
    public static float btDispatcherInfo_getTimeOfImpact(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DispatcherInfo_getTimeOfImpact;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btDispatcherInfo_getTimeStep ] ---

    @NativeType("btScalar")
    public static float btDispatcherInfo_getTimeStep(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DispatcherInfo_getTimeStep;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btDispatcherInfo_getUseContinuous ] ---

    @NativeType("bool")
    public static boolean btDispatcherInfo_getUseContinuous(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DispatcherInfo_getUseContinuous;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btDispatcherInfo_getUseConvexConservativeDistanceUtil ] ---

    @NativeType("bool")
    public static boolean btDispatcherInfo_getUseConvexConservativeDistanceUtil(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DispatcherInfo_getUseConvexConservativeDistanceUtil;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btDispatcherInfo_getUseEpa ] ---

    @NativeType("bool")
    public static boolean btDispatcherInfo_getUseEpa(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DispatcherInfo_getUseEpa;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btDispatcherInfo_setAllowedCcdPenetration ] ---

    public static void btDispatcherInfo_setAllowedCcdPenetration(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.DispatcherInfo_setAllowedCcdPenetration;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDispatcherInfo_setConvexConservativeDistanceThreshold ] ---

    public static void btDispatcherInfo_setConvexConservativeDistanceThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.DispatcherInfo_setConvexConservativeDistanceThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDispatcherInfo_setDebugDraw ] ---

    public static void btDispatcherInfo_setDebugDraw(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.DispatcherInfo_setDebugDraw;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btDispatcherInfo_setDeterministicOverlappingPairs ] ---

    public static void btDispatcherInfo_setDeterministicOverlappingPairs(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.DispatcherInfo_setDeterministicOverlappingPairs;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDispatcherInfo_setDispatchFunc ] ---

    public static void btDispatcherInfo_setDispatchFunc(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.DispatcherInfo_setDispatchFunc;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDispatcherInfo_setEnableSatConvex ] ---

    public static void btDispatcherInfo_setEnableSatConvex(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.DispatcherInfo_setEnableSatConvex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDispatcherInfo_setEnableSPU ] ---

    public static void btDispatcherInfo_setEnableSPU(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.DispatcherInfo_setEnableSPU;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDispatcherInfo_setStepCount ] ---

    public static void btDispatcherInfo_setStepCount(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.DispatcherInfo_setStepCount;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDispatcherInfo_setTimeOfImpact ] ---

    public static void btDispatcherInfo_setTimeOfImpact(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.DispatcherInfo_setTimeOfImpact;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDispatcherInfo_setTimeStep ] ---

    public static void btDispatcherInfo_setTimeStep(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.DispatcherInfo_setTimeStep;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDispatcherInfo_setUseContinuous ] ---

    public static void btDispatcherInfo_setUseContinuous(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.DispatcherInfo_setUseContinuous;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDispatcherInfo_setUseConvexConservativeDistanceUtil ] ---

    public static void btDispatcherInfo_setUseConvexConservativeDistanceUtil(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.DispatcherInfo_setUseConvexConservativeDistanceUtil;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDispatcherInfo_setUseEpa ] ---

    public static void btDispatcherInfo_setUseEpa(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.DispatcherInfo_setUseEpa;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDispatcher_allocateCollisionAlgorithm ] ---

    @NativeType("void *")
    public static long btDispatcher_allocateCollisionAlgorithm(@NativeType("void *") long obj, int size) {
        long __functionAddress = Functions.Dispatcher_allocateCollisionAlgorithm;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, size, __functionAddress);
    }

    // --- [ btDispatcher_clearManifold ] ---

    public static void btDispatcher_clearManifold(@NativeType("void *") long obj, @NativeType("void *") long manifold) {
        long __functionAddress = Functions.Dispatcher_clearManifold;
        if (CHECKS) {
            check(obj);
            check(manifold);
        }
        invokePPV(obj, manifold, __functionAddress);
    }

    // --- [ btDispatcher_dispatchAllCollisionPairs ] ---

    public static void btDispatcher_dispatchAllCollisionPairs(@NativeType("void *") long obj, @NativeType("void *") long pairCache, @NativeType("void *") long dispatchInfo, @NativeType("void *") long dispatcher) {
        long __functionAddress = Functions.Dispatcher_dispatchAllCollisionPairs;
        if (CHECKS) {
            check(obj);
            check(pairCache);
            check(dispatchInfo);
            check(dispatcher);
        }
        invokePPPPV(obj, pairCache, dispatchInfo, dispatcher, __functionAddress);
    }

    // --- [ btDispatcher_findAlgorithm ] ---

    @NativeType("void *")
    public static long btDispatcher_findAlgorithm(@NativeType("void *") long obj, @NativeType("void *") long body0Wrap, @NativeType("void *") long body1Wrap, @NativeType("void *") long sharedManifold, int queryType) {
        long __functionAddress = Functions.Dispatcher_findAlgorithm;
        if (CHECKS) {
            check(obj);
            check(body0Wrap);
            check(body1Wrap);
            check(sharedManifold);
        }
        return invokePPPPP(obj, body0Wrap, body1Wrap, sharedManifold, queryType, __functionAddress);
    }

    // --- [ btDispatcher_freeCollisionAlgorithm ] ---

    public static void btDispatcher_freeCollisionAlgorithm(@NativeType("void *") long obj, @NativeType("void *") long ptr) {
        long __functionAddress = Functions.Dispatcher_freeCollisionAlgorithm;
        if (CHECKS) {
            check(obj);
            check(ptr);
        }
        invokePPV(obj, ptr, __functionAddress);
    }

    // --- [ btDispatcher_getInternalManifoldPointer ] ---

    @NativeType("void *")
    public static long btDispatcher_getInternalManifoldPointer(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dispatcher_getInternalManifoldPointer;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDispatcher_getInternalManifoldPool ] ---

    @NativeType("void *")
    public static long btDispatcher_getInternalManifoldPool(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dispatcher_getInternalManifoldPool;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDispatcher_getManifoldByIndexInternal ] ---

    @NativeType("void *")
    public static long btDispatcher_getManifoldByIndexInternal(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.Dispatcher_getManifoldByIndexInternal;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btDispatcher_getNewManifold ] ---

    @NativeType("void *")
    public static long btDispatcher_getNewManifold(@NativeType("void *") long obj, @NativeType("void *") long b0, @NativeType("void *") long b1) {
        long __functionAddress = Functions.Dispatcher_getNewManifold;
        if (CHECKS) {
            check(obj);
            check(b0);
            check(b1);
        }
        return invokePPPP(obj, b0, b1, __functionAddress);
    }

    // --- [ btDispatcher_getNumManifolds ] ---

    public static int btDispatcher_getNumManifolds(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dispatcher_getNumManifolds;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDispatcher_needsCollision ] ---

    @NativeType("bool")
    public static boolean btDispatcher_needsCollision(@NativeType("void *") long obj, @NativeType("void *") long body0, @NativeType("void *") long body1) {
        long __functionAddress = Functions.Dispatcher_needsCollision;
        if (CHECKS) {
            check(obj);
            check(body0);
            check(body1);
        }
        return invokePPPZ(obj, body0, body1, __functionAddress);
    }

    // --- [ btDispatcher_needsResponse ] ---

    @NativeType("bool")
    public static boolean btDispatcher_needsResponse(@NativeType("void *") long obj, @NativeType("void *") long body0, @NativeType("void *") long body1) {
        long __functionAddress = Functions.Dispatcher_needsResponse;
        if (CHECKS) {
            check(obj);
            check(body0);
            check(body1);
        }
        return invokePPPZ(obj, body0, body1, __functionAddress);
    }

    // --- [ btDispatcher_releaseManifold ] ---

    public static void btDispatcher_releaseManifold(@NativeType("void *") long obj, @NativeType("void *") long manifold) {
        long __functionAddress = Functions.Dispatcher_releaseManifold;
        if (CHECKS) {
            check(obj);
            check(manifold);
        }
        invokePPV(obj, manifold, __functionAddress);
    }

    // --- [ btDispatcher_delete ] ---

    public static void btDispatcher_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.Dispatcher_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}
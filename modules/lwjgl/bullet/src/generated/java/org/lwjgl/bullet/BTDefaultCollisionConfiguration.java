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

public class BTDefaultCollisionConfiguration {

    protected BTDefaultCollisionConfiguration() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            DefaultCollisionConstructionInfo_new                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultCollisionConstructionInfo_new"),
            DefaultCollisionConstructionInfo_getCollisionAlgorithmPool                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultCollisionConstructionInfo_getCollisionAlgorithmPool"),
            DefaultCollisionConstructionInfo_getCustomCollisionAlgorithmMaxElementSize = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultCollisionConstructionInfo_getCustomCollisionAlgorithmMaxElementSize"),
            DefaultCollisionConstructionInfo_getDefaultMaxCollisionAlgorithmPoolSize   = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultCollisionConstructionInfo_getDefaultMaxCollisionAlgorithmPoolSize"),
            DefaultCollisionConstructionInfo_getDefaultMaxPersistentManifoldPoolSize   = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultCollisionConstructionInfo_getDefaultMaxPersistentManifoldPoolSize"),
            DefaultCollisionConstructionInfo_getPersistentManifoldPool                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultCollisionConstructionInfo_getPersistentManifoldPool"),
            DefaultCollisionConstructionInfo_getUseEpaPenetrationAlgorithm             = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultCollisionConstructionInfo_getUseEpaPenetrationAlgorithm"),
            DefaultCollisionConstructionInfo_setCollisionAlgorithmPool                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultCollisionConstructionInfo_setCollisionAlgorithmPool"),
            DefaultCollisionConstructionInfo_setCustomCollisionAlgorithmMaxElementSize = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultCollisionConstructionInfo_setCustomCollisionAlgorithmMaxElementSize"),
            DefaultCollisionConstructionInfo_setDefaultMaxCollisionAlgorithmPoolSize   = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultCollisionConstructionInfo_setDefaultMaxCollisionAlgorithmPoolSize"),
            DefaultCollisionConstructionInfo_setDefaultMaxPersistentManifoldPoolSize   = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultCollisionConstructionInfo_setDefaultMaxPersistentManifoldPoolSize"),
            DefaultCollisionConstructionInfo_setPersistentManifoldPool                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultCollisionConstructionInfo_setPersistentManifoldPool"),
            DefaultCollisionConstructionInfo_setUseEpaPenetrationAlgorithm             = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultCollisionConstructionInfo_setUseEpaPenetrationAlgorithm"),
            DefaultCollisionConstructionInfo_delete                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultCollisionConstructionInfo_delete"),
            DefaultCollisionConfiguration_new                                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultCollisionConfiguration_new"),
            DefaultCollisionConfiguration_new2                                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultCollisionConfiguration_new2"),
            DefaultCollisionConfiguration_getClosestPointsAlgorithmCreateFunc          = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultCollisionConfiguration_getClosestPointsAlgorithmCreateFunc"),
            DefaultCollisionConfiguration_setConvexConvexMultipointIterations          = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultCollisionConfiguration_setConvexConvexMultipointIterations"),
            DefaultCollisionConfiguration_setPlaneConvexMultipointIterations           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDefaultCollisionConfiguration_setPlaneConvexMultipointIterations");

    }

    // --- [ btDefaultCollisionConstructionInfo_new ] ---

    @NativeType("void *")
    public static long btDefaultCollisionConstructionInfo_new() {
        long __functionAddress = Functions.DefaultCollisionConstructionInfo_new;
        return invokeP(__functionAddress);
    }

    // --- [ btDefaultCollisionConstructionInfo_getCollisionAlgorithmPool ] ---

    @NativeType("void *")
    public static long btDefaultCollisionConstructionInfo_getCollisionAlgorithmPool(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DefaultCollisionConstructionInfo_getCollisionAlgorithmPool;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDefaultCollisionConstructionInfo_getCustomCollisionAlgorithmMaxElementSize ] ---

    public static int btDefaultCollisionConstructionInfo_getCustomCollisionAlgorithmMaxElementSize(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DefaultCollisionConstructionInfo_getCustomCollisionAlgorithmMaxElementSize;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDefaultCollisionConstructionInfo_getDefaultMaxCollisionAlgorithmPoolSize ] ---

    public static int btDefaultCollisionConstructionInfo_getDefaultMaxCollisionAlgorithmPoolSize(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DefaultCollisionConstructionInfo_getDefaultMaxCollisionAlgorithmPoolSize;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDefaultCollisionConstructionInfo_getDefaultMaxPersistentManifoldPoolSize ] ---

    public static int btDefaultCollisionConstructionInfo_getDefaultMaxPersistentManifoldPoolSize(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DefaultCollisionConstructionInfo_getDefaultMaxPersistentManifoldPoolSize;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDefaultCollisionConstructionInfo_getPersistentManifoldPool ] ---

    @NativeType("void *")
    public static long btDefaultCollisionConstructionInfo_getPersistentManifoldPool(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DefaultCollisionConstructionInfo_getPersistentManifoldPool;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDefaultCollisionConstructionInfo_getUseEpaPenetrationAlgorithm ] ---

    public static int btDefaultCollisionConstructionInfo_getUseEpaPenetrationAlgorithm(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DefaultCollisionConstructionInfo_getUseEpaPenetrationAlgorithm;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDefaultCollisionConstructionInfo_setCollisionAlgorithmPool ] ---

    public static void btDefaultCollisionConstructionInfo_setCollisionAlgorithmPool(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.DefaultCollisionConstructionInfo_setCollisionAlgorithmPool;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btDefaultCollisionConstructionInfo_setCustomCollisionAlgorithmMaxElementSize ] ---

    public static void btDefaultCollisionConstructionInfo_setCustomCollisionAlgorithmMaxElementSize(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.DefaultCollisionConstructionInfo_setCustomCollisionAlgorithmMaxElementSize;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDefaultCollisionConstructionInfo_setDefaultMaxCollisionAlgorithmPoolSize ] ---

    public static void btDefaultCollisionConstructionInfo_setDefaultMaxCollisionAlgorithmPoolSize(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.DefaultCollisionConstructionInfo_setDefaultMaxCollisionAlgorithmPoolSize;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDefaultCollisionConstructionInfo_setDefaultMaxPersistentManifoldPoolSize ] ---

    public static void btDefaultCollisionConstructionInfo_setDefaultMaxPersistentManifoldPoolSize(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.DefaultCollisionConstructionInfo_setDefaultMaxPersistentManifoldPoolSize;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDefaultCollisionConstructionInfo_setPersistentManifoldPool ] ---

    public static void btDefaultCollisionConstructionInfo_setPersistentManifoldPool(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.DefaultCollisionConstructionInfo_setPersistentManifoldPool;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btDefaultCollisionConstructionInfo_setUseEpaPenetrationAlgorithm ] ---

    public static void btDefaultCollisionConstructionInfo_setUseEpaPenetrationAlgorithm(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.DefaultCollisionConstructionInfo_setUseEpaPenetrationAlgorithm;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDefaultCollisionConstructionInfo_delete ] ---

    public static void btDefaultCollisionConstructionInfo_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DefaultCollisionConstructionInfo_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btDefaultCollisionConfiguration_new ] ---

    @NativeType("void *")
    public static long btDefaultCollisionConfiguration_new() {
        long __functionAddress = Functions.DefaultCollisionConfiguration_new;
        return invokeP(__functionAddress);
    }

    // --- [ btDefaultCollisionConfiguration_new2 ] ---

    @NativeType("void *")
    public static long btDefaultCollisionConfiguration_new2(@NativeType("void *") long constructionInfo) {
        long __functionAddress = Functions.DefaultCollisionConfiguration_new2;
        if (CHECKS) {
            check(constructionInfo);
        }
        return invokePP(constructionInfo, __functionAddress);
    }

    // --- [ btDefaultCollisionConfiguration_getClosestPointsAlgorithmCreateFunc ] ---

    @NativeType("void *")
    public static long btDefaultCollisionConfiguration_getClosestPointsAlgorithmCreateFunc(@NativeType("void *") long obj, int proxyType0, int proxyType1) {
        long __functionAddress = Functions.DefaultCollisionConfiguration_getClosestPointsAlgorithmCreateFunc;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, proxyType0, proxyType1, __functionAddress);
    }

    // --- [ btDefaultCollisionConfiguration_setConvexConvexMultipointIterations ] ---

    public static void btDefaultCollisionConfiguration_setConvexConvexMultipointIterations(@NativeType("void *") long obj, int numPerturbationIterations, int minimumPointsPerturbationThreshold) {
        long __functionAddress = Functions.DefaultCollisionConfiguration_setConvexConvexMultipointIterations;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, numPerturbationIterations, minimumPointsPerturbationThreshold, __functionAddress);
    }

    // --- [ btDefaultCollisionConfiguration_setPlaneConvexMultipointIterations ] ---

    public static void btDefaultCollisionConfiguration_setPlaneConvexMultipointIterations(@NativeType("void *") long obj, int numPerturbationIterations, int minimumPointsPerturbationThreshold) {
        long __functionAddress = Functions.DefaultCollisionConfiguration_setPlaneConvexMultipointIterations;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, numPerturbationIterations, minimumPointsPerturbationThreshold, __functionAddress);
    }

}
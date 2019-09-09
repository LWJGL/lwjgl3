/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BTDbvtBroadphase {

    protected BTDbvtBroadphase() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            DbvtProxy_getLeaf                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtProxy_getLeaf"),
            DbvtProxy_getLinks                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtProxy_getLinks"),
            DbvtProxy_getStage                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtProxy_getStage"),
            DbvtProxy_setLeaf                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtProxy_setLeaf"),
            DbvtProxy_setStage                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtProxy_setStage"),
            DbvtBroadphase_new                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_new"),
            DbvtBroadphase_benchmark              = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_benchmark"),
            DbvtBroadphase_collide                = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_collide"),
            DbvtBroadphase_getCid                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_getCid"),
            DbvtBroadphase_getCupdates            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_getCupdates"),
            DbvtBroadphase_getDeferedcollide      = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_getDeferedcollide"),
            DbvtBroadphase_getDupdates            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_getDupdates"),
            DbvtBroadphase_getFixedleft           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_getFixedleft"),
            DbvtBroadphase_getFupdates            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_getFupdates"),
            DbvtBroadphase_getGid                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_getGid"),
            DbvtBroadphase_getNeedcleanup         = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_getNeedcleanup"),
            DbvtBroadphase_getNewpairs            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_getNewpairs"),
            DbvtBroadphase_getPaircache           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_getPaircache"),
            DbvtBroadphase_getPid                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_getPid"),
            DbvtBroadphase_getPrediction          = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_getPrediction"),
            DbvtBroadphase_getReleasepaircache    = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_getReleasepaircache"),
            DbvtBroadphase_getSets                = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_getSets"),
            DbvtBroadphase_getStageCurrent        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_getStageCurrent"),
            DbvtBroadphase_getStageRoots          = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_getStageRoots"),
            DbvtBroadphase_getUpdates_call        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_getUpdates_call"),
            DbvtBroadphase_getUpdates_done        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_getUpdates_done"),
            DbvtBroadphase_getUpdates_ratio       = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_getUpdates_ratio"),
            DbvtBroadphase_getVelocityPrediction  = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_getVelocityPrediction"),
            DbvtBroadphase_optimize               = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_optimize"),
            DbvtBroadphase_performDeferredRemoval = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_performDeferredRemoval"),
            DbvtBroadphase_setAabbForceUpdate     = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_setAabbForceUpdate"),
            DbvtBroadphase_setCid                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_setCid"),
            DbvtBroadphase_setCupdates            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_setCupdates"),
            DbvtBroadphase_setDeferedcollide      = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_setDeferedcollide"),
            DbvtBroadphase_setDupdates            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_setDupdates"),
            DbvtBroadphase_setFixedleft           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_setFixedleft"),
            DbvtBroadphase_setFupdates            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_setFupdates"),
            DbvtBroadphase_setGid                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_setGid"),
            DbvtBroadphase_setNeedcleanup         = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_setNeedcleanup"),
            DbvtBroadphase_setNewpairs            = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_setNewpairs"),
            DbvtBroadphase_setPaircache           = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_setPaircache"),
            DbvtBroadphase_setPid                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_setPid"),
            DbvtBroadphase_setPrediction          = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_setPrediction"),
            DbvtBroadphase_setReleasepaircache    = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_setReleasepaircache"),
            DbvtBroadphase_setStageCurrent        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_setStageCurrent"),
            DbvtBroadphase_setUpdates_call        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_setUpdates_call"),
            DbvtBroadphase_setUpdates_done        = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_setUpdates_done"),
            DbvtBroadphase_setUpdates_ratio       = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_setUpdates_ratio"),
            DbvtBroadphase_setVelocityPrediction  = apiGetFunctionAddress(LibBullet.getLibrary(), "btDbvtBroadphase_setVelocityPrediction");

    }

    // --- [ btDbvtProxy_getLeaf ] ---

    @NativeType("void *")
    public static long btDbvtProxy_getLeaf(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtProxy_getLeaf;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDbvtProxy_getLinks ] ---

    @NativeType("void *[2]")
    public static PointerBuffer btDbvtProxy_getLinks(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtProxy_getLinks;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memPointerBuffer(__result, 2);
    }

    // --- [ btDbvtProxy_getStage ] ---

    public static int btDbvtProxy_getStage(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtProxy_getStage;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDbvtProxy_setLeaf ] ---

    public static void btDbvtProxy_setLeaf(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.DbvtProxy_setLeaf;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btDbvtProxy_setStage ] ---

    public static void btDbvtProxy_setStage(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.DbvtProxy_setStage;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvtBroadphase_new ] ---

    @NativeType("void *")
    public static long btDbvtBroadphase_new(@NativeType("void *") long paircache) {
        long __functionAddress = Functions.DbvtBroadphase_new;
        return invokePP(paircache, __functionAddress);
    }

    // --- [ btDbvtBroadphase_benchmark ] ---

    public static void btDbvtBroadphase_benchmark(@NativeType("void *") long __unnamed0) {
        long __functionAddress = Functions.DbvtBroadphase_benchmark;
        if (CHECKS) {
            check(__unnamed0);
        }
        invokePV(__unnamed0, __functionAddress);
    }

    // --- [ btDbvtBroadphase_collide ] ---

    public static void btDbvtBroadphase_collide(@NativeType("void *") long obj, @NativeType("void *") long dispatcher) {
        long __functionAddress = Functions.DbvtBroadphase_collide;
        if (CHECKS) {
            check(obj);
            check(dispatcher);
        }
        invokePPV(obj, dispatcher, __functionAddress);
    }

    // --- [ btDbvtBroadphase_getCid ] ---

    public static int btDbvtBroadphase_getCid(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtBroadphase_getCid;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDbvtBroadphase_getCupdates ] ---

    public static int btDbvtBroadphase_getCupdates(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtBroadphase_getCupdates;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDbvtBroadphase_getDeferedcollide ] ---

    @NativeType("bool")
    public static boolean btDbvtBroadphase_getDeferedcollide(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtBroadphase_getDeferedcollide;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btDbvtBroadphase_getDupdates ] ---

    public static int btDbvtBroadphase_getDupdates(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtBroadphase_getDupdates;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDbvtBroadphase_getFixedleft ] ---

    public static int btDbvtBroadphase_getFixedleft(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtBroadphase_getFixedleft;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDbvtBroadphase_getFupdates ] ---

    public static int btDbvtBroadphase_getFupdates(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtBroadphase_getFupdates;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDbvtBroadphase_getGid ] ---

    public static int btDbvtBroadphase_getGid(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtBroadphase_getGid;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDbvtBroadphase_getNeedcleanup ] ---

    @NativeType("bool")
    public static boolean btDbvtBroadphase_getNeedcleanup(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtBroadphase_getNeedcleanup;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btDbvtBroadphase_getNewpairs ] ---

    public static int btDbvtBroadphase_getNewpairs(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtBroadphase_getNewpairs;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDbvtBroadphase_getPaircache ] ---

    @NativeType("void *")
    public static long btDbvtBroadphase_getPaircache(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtBroadphase_getPaircache;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDbvtBroadphase_getPid ] ---

    public static int btDbvtBroadphase_getPid(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtBroadphase_getPid;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDbvtBroadphase_getPrediction ] ---

    @NativeType("btScalar")
    public static float btDbvtBroadphase_getPrediction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtBroadphase_getPrediction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btDbvtBroadphase_getReleasepaircache ] ---

    @NativeType("bool")
    public static boolean btDbvtBroadphase_getReleasepaircache(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtBroadphase_getReleasepaircache;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btDbvtBroadphase_getSets ] ---

    @NativeType("void *")
    public static long btDbvtBroadphase_getSets(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtBroadphase_getSets;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btDbvtBroadphase_getStageCurrent ] ---

    public static int btDbvtBroadphase_getStageCurrent(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtBroadphase_getStageCurrent;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDbvtBroadphase_getStageRoots ] ---

    @NativeType("void *[3]")
    public static PointerBuffer btDbvtBroadphase_getStageRoots(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtBroadphase_getStageRoots;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memPointerBuffer(__result, 3);
    }

    // --- [ btDbvtBroadphase_getUpdates_call ] ---

    @NativeType("unsigned int")
    public static int btDbvtBroadphase_getUpdates_call(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtBroadphase_getUpdates_call;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDbvtBroadphase_getUpdates_done ] ---

    @NativeType("unsigned int")
    public static int btDbvtBroadphase_getUpdates_done(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtBroadphase_getUpdates_done;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btDbvtBroadphase_getUpdates_ratio ] ---

    @NativeType("btScalar")
    public static float btDbvtBroadphase_getUpdates_ratio(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtBroadphase_getUpdates_ratio;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btDbvtBroadphase_getVelocityPrediction ] ---

    @NativeType("btScalar")
    public static float btDbvtBroadphase_getVelocityPrediction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtBroadphase_getVelocityPrediction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btDbvtBroadphase_optimize ] ---

    public static void btDbvtBroadphase_optimize(@NativeType("void *") long obj) {
        long __functionAddress = Functions.DbvtBroadphase_optimize;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btDbvtBroadphase_performDeferredRemoval ] ---

    public static void btDbvtBroadphase_performDeferredRemoval(@NativeType("void *") long obj, @NativeType("void *") long dispatcher) {
        long __functionAddress = Functions.DbvtBroadphase_performDeferredRemoval;
        if (CHECKS) {
            check(obj);
            check(dispatcher);
        }
        invokePPV(obj, dispatcher, __functionAddress);
    }

    // --- [ btDbvtBroadphase_setAabbForceUpdate ] ---

    public static void nbtDbvtBroadphase_setAabbForceUpdate(long obj, long absproxy, long aabbMin, long aabbMax, long __unnamed3) {
        long __functionAddress = Functions.DbvtBroadphase_setAabbForceUpdate;
        if (CHECKS) {
            check(obj);
            check(absproxy);
            check(__unnamed3);
        }
        invokePPPPPV(obj, absproxy, aabbMin, aabbMax, __unnamed3, __functionAddress);
    }

    public static void btDbvtBroadphase_setAabbForceUpdate(@NativeType("void *") long obj, @NativeType("void *") long absproxy, @NativeType("btVector3 const *") BTVector3 aabbMin, @NativeType("btVector3 const *") BTVector3 aabbMax, @NativeType("void *") long __unnamed3) {
        nbtDbvtBroadphase_setAabbForceUpdate(obj, absproxy, aabbMin.address(), aabbMax.address(), __unnamed3);
    }

    // --- [ btDbvtBroadphase_setCid ] ---

    public static void btDbvtBroadphase_setCid(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.DbvtBroadphase_setCid;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvtBroadphase_setCupdates ] ---

    public static void btDbvtBroadphase_setCupdates(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.DbvtBroadphase_setCupdates;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvtBroadphase_setDeferedcollide ] ---

    public static void btDbvtBroadphase_setDeferedcollide(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.DbvtBroadphase_setDeferedcollide;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvtBroadphase_setDupdates ] ---

    public static void btDbvtBroadphase_setDupdates(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.DbvtBroadphase_setDupdates;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvtBroadphase_setFixedleft ] ---

    public static void btDbvtBroadphase_setFixedleft(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.DbvtBroadphase_setFixedleft;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvtBroadphase_setFupdates ] ---

    public static void btDbvtBroadphase_setFupdates(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.DbvtBroadphase_setFupdates;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvtBroadphase_setGid ] ---

    public static void btDbvtBroadphase_setGid(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.DbvtBroadphase_setGid;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvtBroadphase_setNeedcleanup ] ---

    public static void btDbvtBroadphase_setNeedcleanup(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.DbvtBroadphase_setNeedcleanup;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvtBroadphase_setNewpairs ] ---

    public static void btDbvtBroadphase_setNewpairs(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.DbvtBroadphase_setNewpairs;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvtBroadphase_setPaircache ] ---

    public static void btDbvtBroadphase_setPaircache(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.DbvtBroadphase_setPaircache;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btDbvtBroadphase_setPid ] ---

    public static void btDbvtBroadphase_setPid(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.DbvtBroadphase_setPid;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvtBroadphase_setPrediction ] ---

    public static void btDbvtBroadphase_setPrediction(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.DbvtBroadphase_setPrediction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvtBroadphase_setReleasepaircache ] ---

    public static void btDbvtBroadphase_setReleasepaircache(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.DbvtBroadphase_setReleasepaircache;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvtBroadphase_setStageCurrent ] ---

    public static void btDbvtBroadphase_setStageCurrent(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.DbvtBroadphase_setStageCurrent;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvtBroadphase_setUpdates_call ] ---

    public static void btDbvtBroadphase_setUpdates_call(@NativeType("void *") long obj, @NativeType("unsigned int") int value) {
        long __functionAddress = Functions.DbvtBroadphase_setUpdates_call;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvtBroadphase_setUpdates_done ] ---

    public static void btDbvtBroadphase_setUpdates_done(@NativeType("void *") long obj, @NativeType("unsigned int") int value) {
        long __functionAddress = Functions.DbvtBroadphase_setUpdates_done;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvtBroadphase_setUpdates_ratio ] ---

    public static void btDbvtBroadphase_setUpdates_ratio(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.DbvtBroadphase_setUpdates_ratio;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btDbvtBroadphase_setVelocityPrediction ] ---

    public static void btDbvtBroadphase_setVelocityPrediction(@NativeType("void *") long obj, @NativeType("btScalar") float prediction) {
        long __functionAddress = Functions.DbvtBroadphase_setVelocityPrediction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, prediction, __functionAddress);
    }

}
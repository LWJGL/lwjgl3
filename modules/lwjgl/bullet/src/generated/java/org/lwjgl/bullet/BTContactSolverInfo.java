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

public class BTContactSolverInfo {

    protected BTContactSolverInfo() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ContactSolverInfoData_new                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_new"),
            ContactSolverInfoData_getDamping                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getDamping"),
            ContactSolverInfoData_getErp                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getErp"),
            ContactSolverInfoData_getErp2                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getErp2"),
            ContactSolverInfoData_getFriction                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getFriction"),
            ContactSolverInfoData_getFrictionCfm                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getFrictionCfm"),
            ContactSolverInfoData_getFrictionErp                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getFrictionErp"),
            ContactSolverInfoData_getGlobalCfm                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getGlobalCfm"),
            ContactSolverInfoData_getLeastSquaresResidualThreshold      = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getLeastSquaresResidualThreshold"),
            ContactSolverInfoData_getLinearSlop                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getLinearSlop"),
            ContactSolverInfoData_getMaxErrorReduction                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getMaxErrorReduction"),
            ContactSolverInfoData_getMaxGyroscopicForce                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getMaxGyroscopicForce"),
            ContactSolverInfoData_getMinimumSolverBatchSize             = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getMinimumSolverBatchSize"),
            ContactSolverInfoData_getNumIterations                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getNumIterations"),
            ContactSolverInfoData_getRestingContactRestitutionThreshold = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getRestingContactRestitutionThreshold"),
            ContactSolverInfoData_getRestitution                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getRestitution"),
            ContactSolverInfoData_getRestitutionVelocityThreshold       = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getRestitutionVelocityThreshold"),
            ContactSolverInfoData_getSingleAxisRollingFrictionThreshold = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getSingleAxisRollingFrictionThreshold"),
            ContactSolverInfoData_getSolverMode                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getSolverMode"),
            ContactSolverInfoData_getSor                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getSor"),
            ContactSolverInfoData_getSplitImpulse                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getSplitImpulse"),
            ContactSolverInfoData_getSplitImpulsePenetrationThreshold   = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getSplitImpulsePenetrationThreshold"),
            ContactSolverInfoData_getSplitImpulseTurnErp                = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getSplitImpulseTurnErp"),
            ContactSolverInfoData_getTau                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getTau"),
            ContactSolverInfoData_getTimeStep                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getTimeStep"),
            ContactSolverInfoData_getWarmstartingFactor                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_getWarmstartingFactor"),
            ContactSolverInfoData_setDamping                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setDamping"),
            ContactSolverInfoData_setErp                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setErp"),
            ContactSolverInfoData_setErp2                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setErp2"),
            ContactSolverInfoData_setFriction                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setFriction"),
            ContactSolverInfoData_setFrictionCfm                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setFrictionCfm"),
            ContactSolverInfoData_setFrictionErp                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setFrictionErp"),
            ContactSolverInfoData_setGlobalCfm                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setGlobalCfm"),
            ContactSolverInfoData_setLeastSquaresResidualThreshold      = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setLeastSquaresResidualThreshold"),
            ContactSolverInfoData_setLinearSlop                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setLinearSlop"),
            ContactSolverInfoData_setMaxErrorReduction                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setMaxErrorReduction"),
            ContactSolverInfoData_setMaxGyroscopicForce                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setMaxGyroscopicForce"),
            ContactSolverInfoData_setMinimumSolverBatchSize             = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setMinimumSolverBatchSize"),
            ContactSolverInfoData_setNumIterations                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setNumIterations"),
            ContactSolverInfoData_setRestingContactRestitutionThreshold = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setRestingContactRestitutionThreshold"),
            ContactSolverInfoData_setRestitution                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setRestitution"),
            ContactSolverInfoData_setRestitutionVelocityThreshold       = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setRestitutionVelocityThreshold"),
            ContactSolverInfoData_setSingleAxisRollingFrictionThreshold = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setSingleAxisRollingFrictionThreshold"),
            ContactSolverInfoData_setSolverMode                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setSolverMode"),
            ContactSolverInfoData_setSor                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setSor"),
            ContactSolverInfoData_setSplitImpulse                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setSplitImpulse"),
            ContactSolverInfoData_setSplitImpulsePenetrationThreshold   = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setSplitImpulsePenetrationThreshold"),
            ContactSolverInfoData_setSplitImpulseTurnErp                = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setSplitImpulseTurnErp"),
            ContactSolverInfoData_setTau                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setTau"),
            ContactSolverInfoData_setTimeStep                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setTimeStep"),
            ContactSolverInfoData_setWarmstartingFactor                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_setWarmstartingFactor"),
            ContactSolverInfoData_delete                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfoData_delete"),
            ContactSolverInfo_new                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btContactSolverInfo_new");

    }

    // --- [ btContactSolverInfoData_new ] ---

    @NativeType("void *")
    public static long btContactSolverInfoData_new() {
        long __functionAddress = Functions.ContactSolverInfoData_new;
        return invokeP(__functionAddress);
    }

    // --- [ btContactSolverInfoData_getDamping ] ---

    @NativeType("btScalar")
    public static float btContactSolverInfoData_getDamping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getDamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getErp ] ---

    @NativeType("btScalar")
    public static float btContactSolverInfoData_getErp(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getErp;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getErp2 ] ---

    @NativeType("btScalar")
    public static float btContactSolverInfoData_getErp2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getErp2;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getFriction ] ---

    @NativeType("btScalar")
    public static float btContactSolverInfoData_getFriction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getFriction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getFrictionCfm ] ---

    @NativeType("btScalar")
    public static float btContactSolverInfoData_getFrictionCfm(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getFrictionCfm;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getFrictionErp ] ---

    @NativeType("btScalar")
    public static float btContactSolverInfoData_getFrictionErp(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getFrictionErp;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getGlobalCfm ] ---

    @NativeType("btScalar")
    public static float btContactSolverInfoData_getGlobalCfm(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getGlobalCfm;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getLeastSquaresResidualThreshold ] ---

    @NativeType("btScalar")
    public static float btContactSolverInfoData_getLeastSquaresResidualThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getLeastSquaresResidualThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getLinearSlop ] ---

    @NativeType("btScalar")
    public static float btContactSolverInfoData_getLinearSlop(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getLinearSlop;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getMaxErrorReduction ] ---

    @NativeType("btScalar")
    public static float btContactSolverInfoData_getMaxErrorReduction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getMaxErrorReduction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getMaxGyroscopicForce ] ---

    @NativeType("btScalar")
    public static float btContactSolverInfoData_getMaxGyroscopicForce(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getMaxGyroscopicForce;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getMinimumSolverBatchSize ] ---

    public static int btContactSolverInfoData_getMinimumSolverBatchSize(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getMinimumSolverBatchSize;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getNumIterations ] ---

    public static int btContactSolverInfoData_getNumIterations(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getNumIterations;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getRestingContactRestitutionThreshold ] ---

    public static int btContactSolverInfoData_getRestingContactRestitutionThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getRestingContactRestitutionThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getRestitution ] ---

    @NativeType("btScalar")
    public static float btContactSolverInfoData_getRestitution(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getRestitution;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getRestitutionVelocityThreshold ] ---

    @NativeType("btScalar")
    public static float btContactSolverInfoData_getRestitutionVelocityThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getRestitutionVelocityThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getSingleAxisRollingFrictionThreshold ] ---

    @NativeType("btScalar")
    public static float btContactSolverInfoData_getSingleAxisRollingFrictionThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getSingleAxisRollingFrictionThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getSolverMode ] ---

    public static int btContactSolverInfoData_getSolverMode(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getSolverMode;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getSor ] ---

    @NativeType("btScalar")
    public static float btContactSolverInfoData_getSor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getSor;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getSplitImpulse ] ---

    public static int btContactSolverInfoData_getSplitImpulse(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getSplitImpulse;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getSplitImpulsePenetrationThreshold ] ---

    @NativeType("btScalar")
    public static float btContactSolverInfoData_getSplitImpulsePenetrationThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getSplitImpulsePenetrationThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getSplitImpulseTurnErp ] ---

    @NativeType("btScalar")
    public static float btContactSolverInfoData_getSplitImpulseTurnErp(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getSplitImpulseTurnErp;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getTau ] ---

    @NativeType("btScalar")
    public static float btContactSolverInfoData_getTau(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getTau;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getTimeStep ] ---

    @NativeType("btScalar")
    public static float btContactSolverInfoData_getTimeStep(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getTimeStep;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_getWarmstartingFactor ] ---

    @NativeType("btScalar")
    public static float btContactSolverInfoData_getWarmstartingFactor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_getWarmstartingFactor;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setDamping ] ---

    public static void btContactSolverInfoData_setDamping(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ContactSolverInfoData_setDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setErp ] ---

    public static void btContactSolverInfoData_setErp(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ContactSolverInfoData_setErp;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setErp2 ] ---

    public static void btContactSolverInfoData_setErp2(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ContactSolverInfoData_setErp2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setFriction ] ---

    public static void btContactSolverInfoData_setFriction(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ContactSolverInfoData_setFriction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setFrictionCfm ] ---

    public static void btContactSolverInfoData_setFrictionCfm(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ContactSolverInfoData_setFrictionCfm;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setFrictionErp ] ---

    public static void btContactSolverInfoData_setFrictionErp(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ContactSolverInfoData_setFrictionErp;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setGlobalCfm ] ---

    public static void btContactSolverInfoData_setGlobalCfm(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ContactSolverInfoData_setGlobalCfm;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setLeastSquaresResidualThreshold ] ---

    public static void btContactSolverInfoData_setLeastSquaresResidualThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ContactSolverInfoData_setLeastSquaresResidualThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setLinearSlop ] ---

    public static void btContactSolverInfoData_setLinearSlop(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ContactSolverInfoData_setLinearSlop;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setMaxErrorReduction ] ---

    public static void btContactSolverInfoData_setMaxErrorReduction(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ContactSolverInfoData_setMaxErrorReduction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setMaxGyroscopicForce ] ---

    public static void btContactSolverInfoData_setMaxGyroscopicForce(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ContactSolverInfoData_setMaxGyroscopicForce;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setMinimumSolverBatchSize ] ---

    public static void btContactSolverInfoData_setMinimumSolverBatchSize(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.ContactSolverInfoData_setMinimumSolverBatchSize;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setNumIterations ] ---

    public static void btContactSolverInfoData_setNumIterations(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.ContactSolverInfoData_setNumIterations;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setRestingContactRestitutionThreshold ] ---

    public static void btContactSolverInfoData_setRestingContactRestitutionThreshold(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.ContactSolverInfoData_setRestingContactRestitutionThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setRestitution ] ---

    public static void btContactSolverInfoData_setRestitution(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ContactSolverInfoData_setRestitution;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setRestitutionVelocityThreshold ] ---

    public static void btContactSolverInfoData_setRestitutionVelocityThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ContactSolverInfoData_setRestitutionVelocityThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setSingleAxisRollingFrictionThreshold ] ---

    public static void btContactSolverInfoData_setSingleAxisRollingFrictionThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ContactSolverInfoData_setSingleAxisRollingFrictionThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setSolverMode ] ---

    public static void btContactSolverInfoData_setSolverMode(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.ContactSolverInfoData_setSolverMode;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setSor ] ---

    public static void btContactSolverInfoData_setSor(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ContactSolverInfoData_setSor;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setSplitImpulse ] ---

    public static void btContactSolverInfoData_setSplitImpulse(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.ContactSolverInfoData_setSplitImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setSplitImpulsePenetrationThreshold ] ---

    public static void btContactSolverInfoData_setSplitImpulsePenetrationThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ContactSolverInfoData_setSplitImpulsePenetrationThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setSplitImpulseTurnErp ] ---

    public static void btContactSolverInfoData_setSplitImpulseTurnErp(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ContactSolverInfoData_setSplitImpulseTurnErp;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setTau ] ---

    public static void btContactSolverInfoData_setTau(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ContactSolverInfoData_setTau;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setTimeStep ] ---

    public static void btContactSolverInfoData_setTimeStep(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ContactSolverInfoData_setTimeStep;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_setWarmstartingFactor ] ---

    public static void btContactSolverInfoData_setWarmstartingFactor(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ContactSolverInfoData_setWarmstartingFactor;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btContactSolverInfoData_delete ] ---

    public static void btContactSolverInfoData_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ContactSolverInfoData_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btContactSolverInfo_new ] ---

    @NativeType("void *")
    public static long btContactSolverInfo_new() {
        long __functionAddress = Functions.ContactSolverInfo_new;
        return invokeP(__functionAddress);
    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BTMultiBody {

    protected BTMultiBody() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MultiBody_new                                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_new"),
            MultiBody_addBaseConstraintForce                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_addBaseConstraintForce"),
            MultiBody_addBaseConstraintTorque                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_addBaseConstraintTorque"),
            MultiBody_addBaseForce                                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_addBaseForce"),
            MultiBody_addBaseTorque                                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_addBaseTorque"),
            MultiBody_addJointTorque                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_addJointTorque"),
            MultiBody_addJointTorqueMultiDof                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_addJointTorqueMultiDof"),
            MultiBody_addJointTorqueMultiDof2                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_addJointTorqueMultiDof2"),
            MultiBody_addLinkConstraintForce                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_addLinkConstraintForce"),
            MultiBody_addLinkConstraintTorque                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_addLinkConstraintTorque"),
            MultiBody_addLinkForce                                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_addLinkForce"),
            MultiBody_addLinkTorque                                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_addLinkTorque"),
            MultiBody_applyDeltaVeeMultiDof                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_applyDeltaVeeMultiDof"),
            MultiBody_applyDeltaVeeMultiDof2                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_applyDeltaVeeMultiDof2"),
            MultiBody_calcAccelerationDeltasMultiDof                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_calcAccelerationDeltasMultiDof"),
            MultiBody_calculateSerializeBufferSize                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_calculateSerializeBufferSize"),
            MultiBody_checkMotionAndSleepIfRequired                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_checkMotionAndSleepIfRequired"),
            MultiBody_clearConstraintForces                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_clearConstraintForces"),
            MultiBody_clearForcesAndTorques                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_clearForcesAndTorques"),
            MultiBody_clearVelocities                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_clearVelocities"),
            MultiBody_computeAccelerationsArticulatedBodyAlgorithmMultiDof = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_computeAccelerationsArticulatedBodyAlgorithmMultiDof"),
            MultiBody_fillConstraintJacobianMultiDof                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_fillConstraintJacobianMultiDof"),
            MultiBody_fillContactJacobianMultiDof                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_fillContactJacobianMultiDof"),
            MultiBody_finalizeMultiDof                                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_finalizeMultiDof"),
            MultiBody_forwardKinematics                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_forwardKinematics"),
            MultiBody_getAngularDamping                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getAngularDamping"),
            MultiBody_getAngularMomentum                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getAngularMomentum"),
            MultiBody_getBaseCollider                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getBaseCollider"),
            MultiBody_getBaseForce                                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getBaseForce"),
            MultiBody_getBaseInertia                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getBaseInertia"),
            MultiBody_getBaseMass                                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getBaseMass"),
            MultiBody_getBaseName                                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getBaseName"),
            MultiBody_getBaseOmega                                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getBaseOmega"),
            MultiBody_getBasePos                                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getBasePos"),
            MultiBody_getBaseTorque                                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getBaseTorque"),
            MultiBody_getBaseVel                                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getBaseVel"),
            MultiBody_getBaseWorldTransform                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getBaseWorldTransform"),
            MultiBody_getCanSleep                                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getCanSleep"),
            MultiBody_getCompanionId                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getCompanionId"),
            MultiBody_getJointPos                                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getJointPos"),
            MultiBody_getJointPosMultiDof                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getJointPosMultiDof"),
            MultiBody_getJointTorque                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getJointTorque"),
            MultiBody_getJointTorqueMultiDof                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getJointTorqueMultiDof"),
            MultiBody_getJointVel                                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getJointVel"),
            MultiBody_getJointVelMultiDof                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getJointVelMultiDof"),
            MultiBody_getKineticEnergy                                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getKineticEnergy"),
            MultiBody_getLinearDamping                                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getLinearDamping"),
            MultiBody_getLink                                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getLink"),
            MultiBody_getLinkForce                                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getLinkForce"),
            MultiBody_getLinkInertia                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getLinkInertia"),
            MultiBody_getLinkMass                                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getLinkMass"),
            MultiBody_getLinkTorque                                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getLinkTorque"),
            MultiBody_getMaxAppliedImpulse                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getMaxAppliedImpulse"),
            MultiBody_getMaxCoordinateVelocity                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getMaxCoordinateVelocity"),
            MultiBody_getNumDofs                                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getNumDofs"),
            MultiBody_getNumLinks                                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getNumLinks"),
            MultiBody_getNumPosVars                                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getNumPosVars"),
            MultiBody_getParent                                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getParent"),
            MultiBody_getParentToLocalRot                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getParentToLocalRot"),
            MultiBody_getRVector                                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getRVector"),
            MultiBody_getUseGyroTerm                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getUseGyroTerm"),
            MultiBody_getUserIndex                                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getUserIndex"),
            MultiBody_getUserIndex2                                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getUserIndex2"),
            MultiBody_getUserPointer                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getUserPointer"),
            MultiBody_getVelocityVector                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getVelocityVector"),
            MultiBody_getWorldToBaseRot                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_getWorldToBaseRot"),
            MultiBody_goToSleep                                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_goToSleep"),
            MultiBody_hasFixedBase                                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_hasFixedBase"),
            MultiBody_hasSelfCollision                                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_hasSelfCollision"),
            MultiBody_internalNeedsJointFeedback                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_internalNeedsJointFeedback"),
            MultiBody_isAwake                                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_isAwake"),
            MultiBody_isPosUpdated                                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_isPosUpdated"),
            MultiBody_isUsingGlobalVelocities                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_isUsingGlobalVelocities"),
            MultiBody_isUsingRK4Integration                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_isUsingRK4Integration"),
            MultiBody_localDirToWorld                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_localDirToWorld"),
            MultiBody_localFrameToWorld                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_localFrameToWorld"),
            MultiBody_localPosToWorld                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_localPosToWorld"),
            MultiBody_processDeltaVeeMultiDof2                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_processDeltaVeeMultiDof2"),
            MultiBody_serialize                                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_serialize"),
            MultiBody_setAngularDamping                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setAngularDamping"),
            MultiBody_setBaseCollider                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setBaseCollider"),
            MultiBody_setBaseInertia                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setBaseInertia"),
            MultiBody_setBaseMass                                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setBaseMass"),
            MultiBody_setBaseName                                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setBaseName"),
            MultiBody_setBaseOmega                                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setBaseOmega"),
            MultiBody_setBasePos                                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setBasePos"),
            MultiBody_setBaseVel                                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setBaseVel"),
            MultiBody_setBaseWorldTransform                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setBaseWorldTransform"),
            MultiBody_setCanSleep                                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setCanSleep"),
            MultiBody_setCompanionId                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setCompanionId"),
            MultiBody_setFixedBase                                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setFixedBase"),
            MultiBody_setHasSelfCollision                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setHasSelfCollision"),
            MultiBody_setJointPos                                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setJointPos"),
            MultiBody_setJointPosMultiDof                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setJointPosMultiDof"),
            MultiBody_setJointVel                                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setJointVel"),
            MultiBody_setJointVelMultiDof                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setJointVelMultiDof"),
            MultiBody_setLinearDamping                                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setLinearDamping"),
            MultiBody_setMaxAppliedImpulse                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setMaxAppliedImpulse"),
            MultiBody_setMaxCoordinateVelocity                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setMaxCoordinateVelocity"),
            MultiBody_setNumLinks                                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setNumLinks"),
            MultiBody_setPosUpdated                                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setPosUpdated"),
            MultiBody_setupFixed                                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setupFixed"),
            MultiBody_setupPlanar                                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setupPlanar"),
            MultiBody_setupPrismatic                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setupPrismatic"),
            MultiBody_setupRevolute                                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setupRevolute"),
            MultiBody_setupSpherical                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setupSpherical"),
            MultiBody_setUseGyroTerm                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setUseGyroTerm"),
            MultiBody_setUserIndex                                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setUserIndex"),
            MultiBody_setUserIndex2                                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setUserIndex2"),
            MultiBody_setUserPointer                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setUserPointer"),
            MultiBody_setWorldToBaseRot                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_setWorldToBaseRot"),
            MultiBody_stepPositionsMultiDof                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_stepPositionsMultiDof"),
            MultiBody_updateCollisionObjectWorldTransforms                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_updateCollisionObjectWorldTransforms"),
            MultiBody_useGlobalVelocities                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_useGlobalVelocities"),
            MultiBody_useRK4Integration                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_useRK4Integration"),
            MultiBody_wakeUp                                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_wakeUp"),
            MultiBody_worldDirToLocal                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_worldDirToLocal"),
            MultiBody_worldPosToLocal                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_worldPosToLocal"),
            MultiBody_delete                                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBody_delete");

    }

    // --- [ btMultiBody_new ] ---

    public static long nbtMultiBody_new(int n_links, float mass, long inertia, boolean fixedBase, boolean canSleep) {
        long __functionAddress = Functions.MultiBody_new;
        return invokePP(n_links, mass, inertia, fixedBase, canSleep, __functionAddress);
    }

    @NativeType("void *")
    public static long btMultiBody_new(int n_links, @NativeType("btScalar") float mass, @NativeType("btVector3 const *") ΒΤVector3 inertia, @NativeType("bool") boolean fixedBase, @NativeType("bool") boolean canSleep) {
        return nbtMultiBody_new(n_links, mass, inertia.address(), fixedBase, canSleep);
    }

    // --- [ btMultiBody_addBaseConstraintForce ] ---

    public static void nbtMultiBody_addBaseConstraintForce(long obj, long f) {
        long __functionAddress = Functions.MultiBody_addBaseConstraintForce;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, f, __functionAddress);
    }

    public static void btMultiBody_addBaseConstraintForce(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 f) {
        nbtMultiBody_addBaseConstraintForce(obj, f.address());
    }

    // --- [ btMultiBody_addBaseConstraintTorque ] ---

    public static void nbtMultiBody_addBaseConstraintTorque(long obj, long t) {
        long __functionAddress = Functions.MultiBody_addBaseConstraintTorque;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, t, __functionAddress);
    }

    public static void btMultiBody_addBaseConstraintTorque(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 t) {
        nbtMultiBody_addBaseConstraintTorque(obj, t.address());
    }

    // --- [ btMultiBody_addBaseForce ] ---

    public static void nbtMultiBody_addBaseForce(long obj, long f) {
        long __functionAddress = Functions.MultiBody_addBaseForce;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, f, __functionAddress);
    }

    public static void btMultiBody_addBaseForce(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 f) {
        nbtMultiBody_addBaseForce(obj, f.address());
    }

    // --- [ btMultiBody_addBaseTorque ] ---

    public static void nbtMultiBody_addBaseTorque(long obj, long t) {
        long __functionAddress = Functions.MultiBody_addBaseTorque;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, t, __functionAddress);
    }

    public static void btMultiBody_addBaseTorque(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 t) {
        nbtMultiBody_addBaseTorque(obj, t.address());
    }

    // --- [ btMultiBody_addJointTorque ] ---

    public static void btMultiBody_addJointTorque(@NativeType("void *") long obj, int i, @NativeType("btScalar") float Q) {
        long __functionAddress = Functions.MultiBody_addJointTorque;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, i, Q, __functionAddress);
    }

    // --- [ btMultiBody_addJointTorqueMultiDof ] ---

    public static void nbtMultiBody_addJointTorqueMultiDof(long obj, int i, long Q) {
        long __functionAddress = Functions.MultiBody_addJointTorqueMultiDof;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, i, Q, __functionAddress);
    }

    public static void btMultiBody_addJointTorqueMultiDof(@NativeType("void *") long obj, int i, @NativeType("btScalar const *") FloatBuffer Q) {
        nbtMultiBody_addJointTorqueMultiDof(obj, i, memAddress(Q));
    }

    // --- [ btMultiBody_addJointTorqueMultiDof2 ] ---

    public static void btMultiBody_addJointTorqueMultiDof2(@NativeType("void *") long obj, int i, int dof, @NativeType("btScalar") float Q) {
        long __functionAddress = Functions.MultiBody_addJointTorqueMultiDof2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, i, dof, Q, __functionAddress);
    }

    // --- [ btMultiBody_addLinkConstraintForce ] ---

    public static void nbtMultiBody_addLinkConstraintForce(long obj, int i, long f) {
        long __functionAddress = Functions.MultiBody_addLinkConstraintForce;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, i, f, __functionAddress);
    }

    public static void btMultiBody_addLinkConstraintForce(@NativeType("void *") long obj, int i, @NativeType("btVector3 const *") ΒΤVector3 f) {
        nbtMultiBody_addLinkConstraintForce(obj, i, f.address());
    }

    // --- [ btMultiBody_addLinkConstraintTorque ] ---

    public static void nbtMultiBody_addLinkConstraintTorque(long obj, int i, long t) {
        long __functionAddress = Functions.MultiBody_addLinkConstraintTorque;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, i, t, __functionAddress);
    }

    public static void btMultiBody_addLinkConstraintTorque(@NativeType("void *") long obj, int i, @NativeType("btVector3 const *") ΒΤVector3 t) {
        nbtMultiBody_addLinkConstraintTorque(obj, i, t.address());
    }

    // --- [ btMultiBody_addLinkForce ] ---

    public static void nbtMultiBody_addLinkForce(long obj, int i, long f) {
        long __functionAddress = Functions.MultiBody_addLinkForce;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, i, f, __functionAddress);
    }

    public static void btMultiBody_addLinkForce(@NativeType("void *") long obj, int i, @NativeType("btVector3 const *") ΒΤVector3 f) {
        nbtMultiBody_addLinkForce(obj, i, f.address());
    }

    // --- [ btMultiBody_addLinkTorque ] ---

    public static void nbtMultiBody_addLinkTorque(long obj, int i, long t) {
        long __functionAddress = Functions.MultiBody_addLinkTorque;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, i, t, __functionAddress);
    }

    public static void btMultiBody_addLinkTorque(@NativeType("void *") long obj, int i, @NativeType("btVector3 const *") ΒΤVector3 t) {
        nbtMultiBody_addLinkTorque(obj, i, t.address());
    }

    // --- [ btMultiBody_applyDeltaVeeMultiDof ] ---

    public static void nbtMultiBody_applyDeltaVeeMultiDof(long obj, long delta_vee, float multiplier) {
        long __functionAddress = Functions.MultiBody_applyDeltaVeeMultiDof;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, delta_vee, multiplier, __functionAddress);
    }

    public static void btMultiBody_applyDeltaVeeMultiDof(@NativeType("void *") long obj, @NativeType("btScalar const *") FloatBuffer delta_vee, @NativeType("btScalar") float multiplier) {
        nbtMultiBody_applyDeltaVeeMultiDof(obj, memAddress(delta_vee), multiplier);
    }

    // --- [ btMultiBody_applyDeltaVeeMultiDof2 ] ---

    public static void nbtMultiBody_applyDeltaVeeMultiDof2(long obj, long delta_vee, float multiplier) {
        long __functionAddress = Functions.MultiBody_applyDeltaVeeMultiDof2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, delta_vee, multiplier, __functionAddress);
    }

    public static void btMultiBody_applyDeltaVeeMultiDof2(@NativeType("void *") long obj, @NativeType("btScalar const *") FloatBuffer delta_vee, @NativeType("btScalar") float multiplier) {
        nbtMultiBody_applyDeltaVeeMultiDof2(obj, memAddress(delta_vee), multiplier);
    }

    // --- [ btMultiBody_calcAccelerationDeltasMultiDof ] ---

    public static void nbtMultiBody_calcAccelerationDeltasMultiDof(long obj, long force, long output, long scratch_r, long scratch_v) {
        long __functionAddress = Functions.MultiBody_calcAccelerationDeltasMultiDof;
        if (CHECKS) {
            check(obj);
            check(scratch_r);
            check(scratch_v);
        }
        invokePPPPPV(obj, force, output, scratch_r, scratch_v, __functionAddress);
    }

    public static void btMultiBody_calcAccelerationDeltasMultiDof(@NativeType("void *") long obj, @NativeType("btScalar const *") FloatBuffer force, @NativeType("btScalar *") FloatBuffer output, @NativeType("void *") long scratch_r, @NativeType("void *") long scratch_v) {
        nbtMultiBody_calcAccelerationDeltasMultiDof(obj, memAddress(force), memAddress(output), scratch_r, scratch_v);
    }

    // --- [ btMultiBody_calculateSerializeBufferSize ] ---

    public static int btMultiBody_calculateSerializeBufferSize(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_calculateSerializeBufferSize;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBody_checkMotionAndSleepIfRequired ] ---

    public static void btMultiBody_checkMotionAndSleepIfRequired(@NativeType("void *") long obj, @NativeType("btScalar") float timestep) {
        long __functionAddress = Functions.MultiBody_checkMotionAndSleepIfRequired;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, timestep, __functionAddress);
    }

    // --- [ btMultiBody_clearConstraintForces ] ---

    public static void btMultiBody_clearConstraintForces(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_clearConstraintForces;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btMultiBody_clearForcesAndTorques ] ---

    public static void btMultiBody_clearForcesAndTorques(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_clearForcesAndTorques;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btMultiBody_clearVelocities ] ---

    public static void btMultiBody_clearVelocities(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_clearVelocities;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btMultiBody_computeAccelerationsArticulatedBodyAlgorithmMultiDof ] ---

    public static void btMultiBody_computeAccelerationsArticulatedBodyAlgorithmMultiDof(@NativeType("void *") long obj, @NativeType("btScalar") float dt, @NativeType("void *") long scratch_r, @NativeType("void *") long scratch_v, @NativeType("void *") long scratch_m, @NativeType("bool") boolean isConstraintPass, @NativeType("bool") boolean jointFeedbackInWorldSpace, @NativeType("bool") boolean jointFeedbackInJointFrame) {
        long __functionAddress = Functions.MultiBody_computeAccelerationsArticulatedBodyAlgorithmMultiDof;
        if (CHECKS) {
            check(obj);
            check(scratch_r);
            check(scratch_v);
            check(scratch_m);
        }
        invokePPPPV(obj, dt, scratch_r, scratch_v, scratch_m, isConstraintPass, jointFeedbackInWorldSpace, jointFeedbackInJointFrame, __functionAddress);
    }

    // --- [ btMultiBody_fillConstraintJacobianMultiDof ] ---

    public static void nbtMultiBody_fillConstraintJacobianMultiDof(long obj, int link, long contact_point, long normal_ang, long normal_lin, long jac, long scratch_r, long scratch_v, long scratch_m) {
        long __functionAddress = Functions.MultiBody_fillConstraintJacobianMultiDof;
        if (CHECKS) {
            check(obj);
            check(scratch_r);
            check(scratch_v);
            check(scratch_m);
        }
        invokePPPPPPPPV(obj, link, contact_point, normal_ang, normal_lin, jac, scratch_r, scratch_v, scratch_m, __functionAddress);
    }

    public static void btMultiBody_fillConstraintJacobianMultiDof(@NativeType("void *") long obj, int link, @NativeType("btVector3 const *") ΒΤVector3 contact_point, @NativeType("btVector3 const *") ΒΤVector3 normal_ang, @NativeType("btVector3 const *") ΒΤVector3 normal_lin, @NativeType("btScalar *") FloatBuffer jac, @NativeType("void *") long scratch_r, @NativeType("void *") long scratch_v, @NativeType("void *") long scratch_m) {
        nbtMultiBody_fillConstraintJacobianMultiDof(obj, link, contact_point.address(), normal_ang.address(), normal_lin.address(), memAddress(jac), scratch_r, scratch_v, scratch_m);
    }

    // --- [ btMultiBody_fillContactJacobianMultiDof ] ---

    public static void nbtMultiBody_fillContactJacobianMultiDof(long obj, int link, long contact_point, long normal, long jac, long scratch_r, long scratch_v, long scratch_m) {
        long __functionAddress = Functions.MultiBody_fillContactJacobianMultiDof;
        if (CHECKS) {
            check(obj);
            check(scratch_r);
            check(scratch_v);
            check(scratch_m);
        }
        invokePPPPPPPV(obj, link, contact_point, normal, jac, scratch_r, scratch_v, scratch_m, __functionAddress);
    }

    public static void btMultiBody_fillContactJacobianMultiDof(@NativeType("void *") long obj, int link, @NativeType("btVector3 const *") ΒΤVector3 contact_point, @NativeType("btVector3 const *") ΒΤVector3 normal, @NativeType("btScalar *") FloatBuffer jac, @NativeType("void *") long scratch_r, @NativeType("void *") long scratch_v, @NativeType("void *") long scratch_m) {
        nbtMultiBody_fillContactJacobianMultiDof(obj, link, contact_point.address(), normal.address(), memAddress(jac), scratch_r, scratch_v, scratch_m);
    }

    // --- [ btMultiBody_finalizeMultiDof ] ---

    public static void btMultiBody_finalizeMultiDof(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_finalizeMultiDof;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btMultiBody_forwardKinematics ] ---

    public static void btMultiBody_forwardKinematics(@NativeType("void *") long obj, @NativeType("void *") long scratch_q, @NativeType("void *") long scratch_m) {
        long __functionAddress = Functions.MultiBody_forwardKinematics;
        if (CHECKS) {
            check(obj);
            check(scratch_q);
            check(scratch_m);
        }
        invokePPPV(obj, scratch_q, scratch_m, __functionAddress);
    }

    // --- [ btMultiBody_getAngularDamping ] ---

    @NativeType("btScalar")
    public static float btMultiBody_getAngularDamping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_getAngularDamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btMultiBody_getAngularMomentum ] ---

    public static void nbtMultiBody_getAngularMomentum(long obj, long value) {
        long __functionAddress = Functions.MultiBody_getAngularMomentum;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBody_getAngularMomentum(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBody_getAngularMomentum(obj, value.address());
    }

    // --- [ btMultiBody_getBaseCollider ] ---

    @NativeType("void *")
    public static long btMultiBody_getBaseCollider(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_getBaseCollider;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btMultiBody_getBaseForce ] ---

    public static void nbtMultiBody_getBaseForce(long obj, long value) {
        long __functionAddress = Functions.MultiBody_getBaseForce;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBody_getBaseForce(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBody_getBaseForce(obj, value.address());
    }

    // --- [ btMultiBody_getBaseInertia ] ---

    public static void nbtMultiBody_getBaseInertia(long obj, long value) {
        long __functionAddress = Functions.MultiBody_getBaseInertia;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBody_getBaseInertia(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBody_getBaseInertia(obj, value.address());
    }

    // --- [ btMultiBody_getBaseMass ] ---

    @NativeType("btScalar")
    public static float btMultiBody_getBaseMass(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_getBaseMass;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btMultiBody_getBaseName ] ---

    public static long nbtMultiBody_getBaseName(long obj) {
        long __functionAddress = Functions.MultiBody_getBaseName;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String btMultiBody_getBaseName(@NativeType("void *") long obj) {
        long __result = nbtMultiBody_getBaseName(obj);
        return memUTF8Safe(__result);
    }

    // --- [ btMultiBody_getBaseOmega ] ---

    public static void nbtMultiBody_getBaseOmega(long obj, long value) {
        long __functionAddress = Functions.MultiBody_getBaseOmega;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBody_getBaseOmega(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBody_getBaseOmega(obj, value.address());
    }

    // --- [ btMultiBody_getBasePos ] ---

    public static void nbtMultiBody_getBasePos(long obj, long value) {
        long __functionAddress = Functions.MultiBody_getBasePos;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBody_getBasePos(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBody_getBasePos(obj, value.address());
    }

    // --- [ btMultiBody_getBaseTorque ] ---

    public static void nbtMultiBody_getBaseTorque(long obj, long value) {
        long __functionAddress = Functions.MultiBody_getBaseTorque;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBody_getBaseTorque(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBody_getBaseTorque(obj, value.address());
    }

    // --- [ btMultiBody_getBaseVel ] ---

    public static void nbtMultiBody_getBaseVel(long obj, long value) {
        long __functionAddress = Functions.MultiBody_getBaseVel;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBody_getBaseVel(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBody_getBaseVel(obj, value.address());
    }

    // --- [ btMultiBody_getBaseWorldTransform ] ---

    public static void nbtMultiBody_getBaseWorldTransform(long obj, long value) {
        long __functionAddress = Functions.MultiBody_getBaseWorldTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBody_getBaseWorldTransform(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtMultiBody_getBaseWorldTransform(obj, value.address());
    }

    // --- [ btMultiBody_getCanSleep ] ---

    @NativeType("bool")
    public static boolean btMultiBody_getCanSleep(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_getCanSleep;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btMultiBody_getCompanionId ] ---

    public static int btMultiBody_getCompanionId(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_getCompanionId;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBody_getJointPos ] ---

    @NativeType("btScalar")
    public static float btMultiBody_getJointPos(@NativeType("void *") long obj, int i) {
        long __functionAddress = Functions.MultiBody_getJointPos;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, i, __functionAddress);
    }

    // --- [ btMultiBody_getJointPosMultiDof ] ---

    @NativeType("btScalar[7]")
    public static FloatBuffer btMultiBody_getJointPosMultiDof(@NativeType("void *") long obj, int i) {
        long __functionAddress = Functions.MultiBody_getJointPosMultiDof;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, i, __functionAddress);
        return memFloatBuffer(__result, 7);
    }

    // --- [ btMultiBody_getJointTorque ] ---

    @NativeType("btScalar")
    public static float btMultiBody_getJointTorque(@NativeType("void *") long obj, int i) {
        long __functionAddress = Functions.MultiBody_getJointTorque;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, i, __functionAddress);
    }

    // --- [ btMultiBody_getJointTorqueMultiDof ] ---

    @NativeType("btScalar[6]")
    public static FloatBuffer btMultiBody_getJointTorqueMultiDof(@NativeType("void *") long obj, int i) {
        long __functionAddress = Functions.MultiBody_getJointTorqueMultiDof;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, i, __functionAddress);
        return memFloatBuffer(__result, 6);
    }

    // --- [ btMultiBody_getJointVel ] ---

    @NativeType("btScalar")
    public static float btMultiBody_getJointVel(@NativeType("void *") long obj, int i) {
        long __functionAddress = Functions.MultiBody_getJointVel;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, i, __functionAddress);
    }

    // --- [ btMultiBody_getJointVelMultiDof ] ---

    @NativeType("void *")
    public static long btMultiBody_getJointVelMultiDof(@NativeType("void *") long obj, int i) {
        long __functionAddress = Functions.MultiBody_getJointVelMultiDof;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, i, __functionAddress);
    }

    // --- [ btMultiBody_getKineticEnergy ] ---

    @NativeType("btScalar")
    public static float btMultiBody_getKineticEnergy(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_getKineticEnergy;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btMultiBody_getLinearDamping ] ---

    @NativeType("btScalar")
    public static float btMultiBody_getLinearDamping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_getLinearDamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btMultiBody_getLink ] ---

    @NativeType("void *")
    public static long btMultiBody_getLink(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.MultiBody_getLink;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btMultiBody_getLinkForce ] ---

    public static void nbtMultiBody_getLinkForce(long obj, int i, long value) {
        long __functionAddress = Functions.MultiBody_getLinkForce;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, i, value, __functionAddress);
    }

    public static void btMultiBody_getLinkForce(@NativeType("void *") long obj, int i, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBody_getLinkForce(obj, i, value.address());
    }

    // --- [ btMultiBody_getLinkInertia ] ---

    public static void nbtMultiBody_getLinkInertia(long obj, int i, long value) {
        long __functionAddress = Functions.MultiBody_getLinkInertia;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, i, value, __functionAddress);
    }

    public static void btMultiBody_getLinkInertia(@NativeType("void *") long obj, int i, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBody_getLinkInertia(obj, i, value.address());
    }

    // --- [ btMultiBody_getLinkMass ] ---

    @NativeType("btScalar")
    public static float btMultiBody_getLinkMass(@NativeType("void *") long obj, int i) {
        long __functionAddress = Functions.MultiBody_getLinkMass;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, i, __functionAddress);
    }

    // --- [ btMultiBody_getLinkTorque ] ---

    public static void nbtMultiBody_getLinkTorque(long obj, int i, long value) {
        long __functionAddress = Functions.MultiBody_getLinkTorque;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, i, value, __functionAddress);
    }

    public static void btMultiBody_getLinkTorque(@NativeType("void *") long obj, int i, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBody_getLinkTorque(obj, i, value.address());
    }

    // --- [ btMultiBody_getMaxAppliedImpulse ] ---

    @NativeType("btScalar")
    public static float btMultiBody_getMaxAppliedImpulse(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_getMaxAppliedImpulse;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btMultiBody_getMaxCoordinateVelocity ] ---

    @NativeType("btScalar")
    public static float btMultiBody_getMaxCoordinateVelocity(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_getMaxCoordinateVelocity;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btMultiBody_getNumDofs ] ---

    public static int btMultiBody_getNumDofs(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_getNumDofs;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBody_getNumLinks ] ---

    public static int btMultiBody_getNumLinks(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_getNumLinks;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBody_getNumPosVars ] ---

    public static int btMultiBody_getNumPosVars(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_getNumPosVars;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBody_getParent ] ---

    public static int btMultiBody_getParent(@NativeType("void *") long obj, int link_num) {
        long __functionAddress = Functions.MultiBody_getParent;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, link_num, __functionAddress);
    }

    // --- [ btMultiBody_getParentToLocalRot ] ---

    public static void nbtMultiBody_getParentToLocalRot(long obj, int i, long value) {
        long __functionAddress = Functions.MultiBody_getParentToLocalRot;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, i, value, __functionAddress);
    }

    public static void btMultiBody_getParentToLocalRot(@NativeType("void *") long obj, int i, @NativeType("btQuaternion *") ΒΤVector3 value) {
        nbtMultiBody_getParentToLocalRot(obj, i, value.address());
    }

    // --- [ btMultiBody_getRVector ] ---

    public static void nbtMultiBody_getRVector(long obj, int i, long value) {
        long __functionAddress = Functions.MultiBody_getRVector;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, i, value, __functionAddress);
    }

    public static void btMultiBody_getRVector(@NativeType("void *") long obj, int i, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBody_getRVector(obj, i, value.address());
    }

    // --- [ btMultiBody_getUseGyroTerm ] ---

    @NativeType("bool")
    public static boolean btMultiBody_getUseGyroTerm(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_getUseGyroTerm;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btMultiBody_getUserIndex ] ---

    public static int btMultiBody_getUserIndex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_getUserIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBody_getUserIndex2 ] ---

    public static int btMultiBody_getUserIndex2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_getUserIndex2;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBody_getUserPointer ] ---

    @NativeType("void *")
    public static long btMultiBody_getUserPointer(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_getUserPointer;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btMultiBody_getVelocityVector ] ---

    @NativeType("void const *")
    public static long btMultiBody_getVelocityVector(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_getVelocityVector;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btMultiBody_getWorldToBaseRot ] ---

    public static void nbtMultiBody_getWorldToBaseRot(long obj, long value) {
        long __functionAddress = Functions.MultiBody_getWorldToBaseRot;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultiBody_getWorldToBaseRot(@NativeType("void *") long obj, @NativeType("btQuaternion *") ΒΤVector3 value) {
        nbtMultiBody_getWorldToBaseRot(obj, value.address());
    }

    // --- [ btMultiBody_goToSleep ] ---

    public static void btMultiBody_goToSleep(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_goToSleep;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btMultiBody_hasFixedBase ] ---

    @NativeType("bool")
    public static boolean btMultiBody_hasFixedBase(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_hasFixedBase;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btMultiBody_hasSelfCollision ] ---

    @NativeType("bool")
    public static boolean btMultiBody_hasSelfCollision(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_hasSelfCollision;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btMultiBody_internalNeedsJointFeedback ] ---

    @NativeType("bool")
    public static boolean btMultiBody_internalNeedsJointFeedback(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_internalNeedsJointFeedback;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btMultiBody_isAwake ] ---

    @NativeType("bool")
    public static boolean btMultiBody_isAwake(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_isAwake;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btMultiBody_isPosUpdated ] ---

    @NativeType("bool")
    public static boolean btMultiBody_isPosUpdated(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_isPosUpdated;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btMultiBody_isUsingGlobalVelocities ] ---

    @NativeType("bool")
    public static boolean btMultiBody_isUsingGlobalVelocities(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_isUsingGlobalVelocities;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btMultiBody_isUsingRK4Integration ] ---

    @NativeType("bool")
    public static boolean btMultiBody_isUsingRK4Integration(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_isUsingRK4Integration;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btMultiBody_localDirToWorld ] ---

    public static void nbtMultiBody_localDirToWorld(long obj, int i, long vec, long value) {
        long __functionAddress = Functions.MultiBody_localDirToWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, i, vec, value, __functionAddress);
    }

    public static void btMultiBody_localDirToWorld(@NativeType("void *") long obj, int i, @NativeType("btVector3 const *") ΒΤVector3 vec, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBody_localDirToWorld(obj, i, vec.address(), value.address());
    }

    // --- [ btMultiBody_localFrameToWorld ] ---

    public static void nbtMultiBody_localFrameToWorld(long obj, int i, long mat, long value) {
        long __functionAddress = Functions.MultiBody_localFrameToWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, i, mat, value, __functionAddress);
    }

    public static void btMultiBody_localFrameToWorld(@NativeType("void *") long obj, int i, @NativeType("btMatrix3x3 const *") BTMatrix3x3 mat, @NativeType("btMatrix3x3 *") BTMatrix3x3 value) {
        nbtMultiBody_localFrameToWorld(obj, i, mat.address(), value.address());
    }

    // --- [ btMultiBody_localPosToWorld ] ---

    public static void nbtMultiBody_localPosToWorld(long obj, int i, long vec, long value) {
        long __functionAddress = Functions.MultiBody_localPosToWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, i, vec, value, __functionAddress);
    }

    public static void btMultiBody_localPosToWorld(@NativeType("void *") long obj, int i, @NativeType("btVector3 const *") ΒΤVector3 vec, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBody_localPosToWorld(obj, i, vec.address(), value.address());
    }

    // --- [ btMultiBody_processDeltaVeeMultiDof2 ] ---

    public static void btMultiBody_processDeltaVeeMultiDof2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_processDeltaVeeMultiDof2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btMultiBody_serialize ] ---

    public static long nbtMultiBody_serialize(long obj, long dataBuffer, long serializer) {
        long __functionAddress = Functions.MultiBody_serialize;
        if (CHECKS) {
            check(obj);
            check(dataBuffer);
            check(serializer);
        }
        return invokePPPP(obj, dataBuffer, serializer, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String btMultiBody_serialize(@NativeType("void *") long obj, @NativeType("void *") long dataBuffer, @NativeType("void *") long serializer) {
        long __result = nbtMultiBody_serialize(obj, dataBuffer, serializer);
        return memUTF8Safe(__result);
    }

    // --- [ btMultiBody_setAngularDamping ] ---

    public static void btMultiBody_setAngularDamping(@NativeType("void *") long obj, @NativeType("btScalar") float damp) {
        long __functionAddress = Functions.MultiBody_setAngularDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, damp, __functionAddress);
    }

    // --- [ btMultiBody_setBaseCollider ] ---

    public static void btMultiBody_setBaseCollider(@NativeType("void *") long obj, @NativeType("void *") long collider) {
        long __functionAddress = Functions.MultiBody_setBaseCollider;
        if (CHECKS) {
            check(obj);
            check(collider);
        }
        invokePPV(obj, collider, __functionAddress);
    }

    // --- [ btMultiBody_setBaseInertia ] ---

    public static void nbtMultiBody_setBaseInertia(long obj, long inertia) {
        long __functionAddress = Functions.MultiBody_setBaseInertia;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, inertia, __functionAddress);
    }

    public static void btMultiBody_setBaseInertia(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 inertia) {
        nbtMultiBody_setBaseInertia(obj, inertia.address());
    }

    // --- [ btMultiBody_setBaseMass ] ---

    public static void btMultiBody_setBaseMass(@NativeType("void *") long obj, @NativeType("btScalar") float mass) {
        long __functionAddress = Functions.MultiBody_setBaseMass;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, mass, __functionAddress);
    }

    // --- [ btMultiBody_setBaseName ] ---

    public static void nbtMultiBody_setBaseName(long obj, long name) {
        long __functionAddress = Functions.MultiBody_setBaseName;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, name, __functionAddress);
    }

    public static void btMultiBody_setBaseName(@NativeType("void *") long obj, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nbtMultiBody_setBaseName(obj, memAddress(name));
    }

    public static void btMultiBody_setBaseName(@NativeType("void *") long obj, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nbtMultiBody_setBaseName(obj, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ btMultiBody_setBaseOmega ] ---

    public static void nbtMultiBody_setBaseOmega(long obj, long omega) {
        long __functionAddress = Functions.MultiBody_setBaseOmega;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, omega, __functionAddress);
    }

    public static void btMultiBody_setBaseOmega(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 omega) {
        nbtMultiBody_setBaseOmega(obj, omega.address());
    }

    // --- [ btMultiBody_setBasePos ] ---

    public static void nbtMultiBody_setBasePos(long obj, long pos) {
        long __functionAddress = Functions.MultiBody_setBasePos;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, pos, __functionAddress);
    }

    public static void btMultiBody_setBasePos(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 pos) {
        nbtMultiBody_setBasePos(obj, pos.address());
    }

    // --- [ btMultiBody_setBaseVel ] ---

    public static void nbtMultiBody_setBaseVel(long obj, long vel) {
        long __functionAddress = Functions.MultiBody_setBaseVel;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, vel, __functionAddress);
    }

    public static void btMultiBody_setBaseVel(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 vel) {
        nbtMultiBody_setBaseVel(obj, vel.address());
    }

    // --- [ btMultiBody_setBaseWorldTransform ] ---

    public static void nbtMultiBody_setBaseWorldTransform(long obj, long tr) {
        long __functionAddress = Functions.MultiBody_setBaseWorldTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, tr, __functionAddress);
    }

    public static void btMultiBody_setBaseWorldTransform(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform tr) {
        nbtMultiBody_setBaseWorldTransform(obj, tr.address());
    }

    // --- [ btMultiBody_setCanSleep ] ---

    public static void btMultiBody_setCanSleep(@NativeType("void *") long obj, @NativeType("bool") boolean canSleep) {
        long __functionAddress = Functions.MultiBody_setCanSleep;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, canSleep, __functionAddress);
    }

    // --- [ btMultiBody_setCompanionId ] ---

    public static void btMultiBody_setCompanionId(@NativeType("void *") long obj, int id) {
        long __functionAddress = Functions.MultiBody_setCompanionId;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, id, __functionAddress);
    }

    // --- [ btMultiBody_setFixedBase ] ---

    public static void btMultiBody_setFixedBase(@NativeType("void *") long obj, @NativeType("bool") boolean fixedBase) {
        long __functionAddress = Functions.MultiBody_setFixedBase;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, fixedBase, __functionAddress);
    }

    // --- [ btMultiBody_setHasSelfCollision ] ---

    public static void btMultiBody_setHasSelfCollision(@NativeType("void *") long obj, @NativeType("bool") boolean hasSelfCollision) {
        long __functionAddress = Functions.MultiBody_setHasSelfCollision;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, hasSelfCollision, __functionAddress);
    }

    // --- [ btMultiBody_setJointPos ] ---

    public static void btMultiBody_setJointPos(@NativeType("void *") long obj, int i, @NativeType("btScalar") float q) {
        long __functionAddress = Functions.MultiBody_setJointPos;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, i, q, __functionAddress);
    }

    // --- [ btMultiBody_setJointPosMultiDof ] ---

    public static void nbtMultiBody_setJointPosMultiDof(long obj, int i, long q) {
        long __functionAddress = Functions.MultiBody_setJointPosMultiDof;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, i, q, __functionAddress);
    }

    public static void btMultiBody_setJointPosMultiDof(@NativeType("void *") long obj, int i, @NativeType("btScalar *") FloatBuffer q) {
        nbtMultiBody_setJointPosMultiDof(obj, i, memAddress(q));
    }

    // --- [ btMultiBody_setJointVel ] ---

    public static void btMultiBody_setJointVel(@NativeType("void *") long obj, int i, @NativeType("btScalar") float qdot) {
        long __functionAddress = Functions.MultiBody_setJointVel;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, i, qdot, __functionAddress);
    }

    // --- [ btMultiBody_setJointVelMultiDof ] ---

    public static void nbtMultiBody_setJointVelMultiDof(long obj, int i, long qdot) {
        long __functionAddress = Functions.MultiBody_setJointVelMultiDof;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, i, qdot, __functionAddress);
    }

    public static void btMultiBody_setJointVelMultiDof(@NativeType("void *") long obj, int i, @NativeType("btScalar *") FloatBuffer qdot) {
        nbtMultiBody_setJointVelMultiDof(obj, i, memAddress(qdot));
    }

    // --- [ btMultiBody_setLinearDamping ] ---

    public static void btMultiBody_setLinearDamping(@NativeType("void *") long obj, @NativeType("btScalar") float damp) {
        long __functionAddress = Functions.MultiBody_setLinearDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, damp, __functionAddress);
    }

    // --- [ btMultiBody_setMaxAppliedImpulse ] ---

    public static void btMultiBody_setMaxAppliedImpulse(@NativeType("void *") long obj, @NativeType("btScalar") float maxImp) {
        long __functionAddress = Functions.MultiBody_setMaxAppliedImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, maxImp, __functionAddress);
    }

    // --- [ btMultiBody_setMaxCoordinateVelocity ] ---

    public static void btMultiBody_setMaxCoordinateVelocity(@NativeType("void *") long obj, @NativeType("btScalar") float maxVel) {
        long __functionAddress = Functions.MultiBody_setMaxCoordinateVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, maxVel, __functionAddress);
    }

    // --- [ btMultiBody_setNumLinks ] ---

    public static void btMultiBody_setNumLinks(@NativeType("void *") long obj, int numLinks) {
        long __functionAddress = Functions.MultiBody_setNumLinks;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, numLinks, __functionAddress);
    }

    // --- [ btMultiBody_setPosUpdated ] ---

    public static void btMultiBody_setPosUpdated(@NativeType("void *") long obj, @NativeType("bool") boolean updated) {
        long __functionAddress = Functions.MultiBody_setPosUpdated;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, updated, __functionAddress);
    }

    // --- [ btMultiBody_setupFixed ] ---

    public static void nbtMultiBody_setupFixed(long obj, int linkIndex, float mass, long inertia, int parent, long rotParentToThis, long parentComToThisPivotOffset, long thisPivotToThisComOffset, boolean deprecatedDisableParentCollision) {
        long __functionAddress = Functions.MultiBody_setupFixed;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPPV(obj, linkIndex, mass, inertia, parent, rotParentToThis, parentComToThisPivotOffset, thisPivotToThisComOffset, deprecatedDisableParentCollision, __functionAddress);
    }

    public static void btMultiBody_setupFixed(@NativeType("void *") long obj, int linkIndex, @NativeType("btScalar") float mass, @NativeType("btVector3 const *") ΒΤVector3 inertia, int parent, @NativeType("btQuaternion const *") ΒΤVector3 rotParentToThis, @NativeType("btVector3 const *") ΒΤVector3 parentComToThisPivotOffset, @NativeType("btVector3 const *") ΒΤVector3 thisPivotToThisComOffset, @NativeType("bool") boolean deprecatedDisableParentCollision) {
        nbtMultiBody_setupFixed(obj, linkIndex, mass, inertia.address(), parent, rotParentToThis.address(), parentComToThisPivotOffset.address(), thisPivotToThisComOffset.address(), deprecatedDisableParentCollision);
    }

    // --- [ btMultiBody_setupPlanar ] ---

    public static void nbtMultiBody_setupPlanar(long obj, int i, float mass, long inertia, int parent, long rotParentToThis, long rotationAxis, long parentComToThisComOffset, boolean disableParentCollision) {
        long __functionAddress = Functions.MultiBody_setupPlanar;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPPV(obj, i, mass, inertia, parent, rotParentToThis, rotationAxis, parentComToThisComOffset, disableParentCollision, __functionAddress);
    }

    public static void btMultiBody_setupPlanar(@NativeType("void *") long obj, int i, @NativeType("btScalar") float mass, @NativeType("btVector3 const *") ΒΤVector3 inertia, int parent, @NativeType("btQuaternion const *") ΒΤVector3 rotParentToThis, @NativeType("btVector3 const *") ΒΤVector3 rotationAxis, @NativeType("btVector3 const *") ΒΤVector3 parentComToThisComOffset, @NativeType("bool") boolean disableParentCollision) {
        nbtMultiBody_setupPlanar(obj, i, mass, inertia.address(), parent, rotParentToThis.address(), rotationAxis.address(), parentComToThisComOffset.address(), disableParentCollision);
    }

    // --- [ btMultiBody_setupPrismatic ] ---

    public static void nbtMultiBody_setupPrismatic(long obj, int i, float mass, long inertia, int parent, long rotParentToThis, long jointAxis, long parentComToThisPivotOffset, long thisPivotToThisComOffset, boolean disableParentCollision) {
        long __functionAddress = Functions.MultiBody_setupPrismatic;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPPPV(obj, i, mass, inertia, parent, rotParentToThis, jointAxis, parentComToThisPivotOffset, thisPivotToThisComOffset, disableParentCollision, __functionAddress);
    }

    public static void btMultiBody_setupPrismatic(@NativeType("void *") long obj, int i, @NativeType("btScalar") float mass, @NativeType("btVector3 const *") ΒΤVector3 inertia, int parent, @NativeType("btQuaternion const *") ΒΤVector3 rotParentToThis, @NativeType("btVector3 const *") ΒΤVector3 jointAxis, @NativeType("btVector3 const *") ΒΤVector3 parentComToThisPivotOffset, @NativeType("btVector3 const *") ΒΤVector3 thisPivotToThisComOffset, @NativeType("bool") boolean disableParentCollision) {
        nbtMultiBody_setupPrismatic(obj, i, mass, inertia.address(), parent, rotParentToThis.address(), jointAxis.address(), parentComToThisPivotOffset.address(), thisPivotToThisComOffset.address(), disableParentCollision);
    }

    // --- [ btMultiBody_setupRevolute ] ---

    public static void nbtMultiBody_setupRevolute(long obj, int linkIndex, float mass, long inertia, int parentIndex, long rotParentToThis, long jointAxis, long parentComToThisPivotOffset, long thisPivotToThisComOffset, boolean disableParentCollision) {
        long __functionAddress = Functions.MultiBody_setupRevolute;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPPPV(obj, linkIndex, mass, inertia, parentIndex, rotParentToThis, jointAxis, parentComToThisPivotOffset, thisPivotToThisComOffset, disableParentCollision, __functionAddress);
    }

    public static void btMultiBody_setupRevolute(@NativeType("void *") long obj, int linkIndex, @NativeType("btScalar") float mass, @NativeType("btVector3 const *") ΒΤVector3 inertia, int parentIndex, @NativeType("btQuaternion const *") ΒΤVector3 rotParentToThis, @NativeType("btVector3 const *") ΒΤVector3 jointAxis, @NativeType("btVector3 const *") ΒΤVector3 parentComToThisPivotOffset, @NativeType("btVector3 const *") ΒΤVector3 thisPivotToThisComOffset, @NativeType("bool") boolean disableParentCollision) {
        nbtMultiBody_setupRevolute(obj, linkIndex, mass, inertia.address(), parentIndex, rotParentToThis.address(), jointAxis.address(), parentComToThisPivotOffset.address(), thisPivotToThisComOffset.address(), disableParentCollision);
    }

    // --- [ btMultiBody_setupSpherical ] ---

    public static void nbtMultiBody_setupSpherical(long obj, int linkIndex, float mass, long inertia, int parent, long rotParentToThis, long parentComToThisPivotOffset, long thisPivotToThisComOffset, boolean disableParentCollision) {
        long __functionAddress = Functions.MultiBody_setupSpherical;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPPV(obj, linkIndex, mass, inertia, parent, rotParentToThis, parentComToThisPivotOffset, thisPivotToThisComOffset, disableParentCollision, __functionAddress);
    }

    public static void btMultiBody_setupSpherical(@NativeType("void *") long obj, int linkIndex, @NativeType("btScalar") float mass, @NativeType("btVector3 const *") ΒΤVector3 inertia, int parent, @NativeType("btQuaternion const *") ΒΤVector3 rotParentToThis, @NativeType("btVector3 const *") ΒΤVector3 parentComToThisPivotOffset, @NativeType("btVector3 const *") ΒΤVector3 thisPivotToThisComOffset, @NativeType("bool") boolean disableParentCollision) {
        nbtMultiBody_setupSpherical(obj, linkIndex, mass, inertia.address(), parent, rotParentToThis.address(), parentComToThisPivotOffset.address(), thisPivotToThisComOffset.address(), disableParentCollision);
    }

    // --- [ btMultiBody_setUseGyroTerm ] ---

    public static void btMultiBody_setUseGyroTerm(@NativeType("void *") long obj, @NativeType("bool") boolean useGyro) {
        long __functionAddress = Functions.MultiBody_setUseGyroTerm;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, useGyro, __functionAddress);
    }

    // --- [ btMultiBody_setUserIndex ] ---

    public static void btMultiBody_setUserIndex(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.MultiBody_setUserIndex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, __functionAddress);
    }

    // --- [ btMultiBody_setUserIndex2 ] ---

    public static void btMultiBody_setUserIndex2(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.MultiBody_setUserIndex2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, __functionAddress);
    }

    // --- [ btMultiBody_setUserPointer ] ---

    public static void btMultiBody_setUserPointer(@NativeType("void *") long obj, @NativeType("void *") long userPointer) {
        long __functionAddress = Functions.MultiBody_setUserPointer;
        if (CHECKS) {
            check(obj);
            check(userPointer);
        }
        invokePPV(obj, userPointer, __functionAddress);
    }

    // --- [ btMultiBody_setWorldToBaseRot ] ---

    public static void nbtMultiBody_setWorldToBaseRot(long obj, long rot) {
        long __functionAddress = Functions.MultiBody_setWorldToBaseRot;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, rot, __functionAddress);
    }

    public static void btMultiBody_setWorldToBaseRot(@NativeType("void *") long obj, @NativeType("btQuaternion const *") ΒΤVector3 rot) {
        nbtMultiBody_setWorldToBaseRot(obj, rot.address());
    }

    // --- [ btMultiBody_stepPositionsMultiDof ] ---

    public static void nbtMultiBody_stepPositionsMultiDof(long obj, float dt, long pq, long pqd) {
        long __functionAddress = Functions.MultiBody_stepPositionsMultiDof;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, dt, pq, pqd, __functionAddress);
    }

    public static void btMultiBody_stepPositionsMultiDof(@NativeType("void *") long obj, @NativeType("btScalar") float dt, @NativeType("btScalar *") FloatBuffer pq, @NativeType("btScalar *") FloatBuffer pqd) {
        nbtMultiBody_stepPositionsMultiDof(obj, dt, memAddress(pq), memAddress(pqd));
    }

    // --- [ btMultiBody_updateCollisionObjectWorldTransforms ] ---

    public static void btMultiBody_updateCollisionObjectWorldTransforms(@NativeType("void *") long obj, @NativeType("void *") long scratch_q, @NativeType("void *") long scratch_m) {
        long __functionAddress = Functions.MultiBody_updateCollisionObjectWorldTransforms;
        if (CHECKS) {
            check(obj);
            check(scratch_q);
            check(scratch_m);
        }
        invokePPPV(obj, scratch_q, scratch_m, __functionAddress);
    }

    // --- [ btMultiBody_useGlobalVelocities ] ---

    public static void btMultiBody_useGlobalVelocities(@NativeType("void *") long obj, @NativeType("bool") boolean use) {
        long __functionAddress = Functions.MultiBody_useGlobalVelocities;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, use, __functionAddress);
    }

    // --- [ btMultiBody_useRK4Integration ] ---

    public static void btMultiBody_useRK4Integration(@NativeType("void *") long obj, @NativeType("bool") boolean use) {
        long __functionAddress = Functions.MultiBody_useRK4Integration;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, use, __functionAddress);
    }

    // --- [ btMultiBody_wakeUp ] ---

    public static void btMultiBody_wakeUp(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_wakeUp;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btMultiBody_worldDirToLocal ] ---

    public static void nbtMultiBody_worldDirToLocal(long obj, int i, long vec, long value) {
        long __functionAddress = Functions.MultiBody_worldDirToLocal;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, i, vec, value, __functionAddress);
    }

    public static void btMultiBody_worldDirToLocal(@NativeType("void *") long obj, int i, @NativeType("btVector3 const *") ΒΤVector3 vec, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBody_worldDirToLocal(obj, i, vec.address(), value.address());
    }

    // --- [ btMultiBody_worldPosToLocal ] ---

    public static void nbtMultiBody_worldPosToLocal(long obj, int i, long vec, long value) {
        long __functionAddress = Functions.MultiBody_worldPosToLocal;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, i, vec, value, __functionAddress);
    }

    public static void btMultiBody_worldPosToLocal(@NativeType("void *") long obj, int i, @NativeType("btVector3 const *") ΒΤVector3 vec, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtMultiBody_worldPosToLocal(obj, i, vec.address(), value.address());
    }

    // --- [ btMultiBody_delete ] ---

    public static void btMultiBody_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBody_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}
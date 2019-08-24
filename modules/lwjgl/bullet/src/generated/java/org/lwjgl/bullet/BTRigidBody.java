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

public class BTRigidBody {

    protected BTRigidBody() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            RigidBody_btRigidBodyConstructionInfo_new                                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_new"),
            RigidBody_btRigidBodyConstructionInfo_new2                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_new2"),
            RigidBody_btRigidBodyConstructionInfo_getAdditionalAngularDampingFactor       = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_getAdditionalAngularDampingFactor"),
            RigidBody_btRigidBodyConstructionInfo_getAdditionalAngularDampingThresholdSqr = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_getAdditionalAngularDampingThresholdSqr"),
            RigidBody_btRigidBodyConstructionInfo_getAdditionalDamping                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_getAdditionalDamping"),
            RigidBody_btRigidBodyConstructionInfo_getAdditionalDampingFactor              = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_getAdditionalDampingFactor"),
            RigidBody_btRigidBodyConstructionInfo_getAdditionalLinearDampingThresholdSqr  = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_getAdditionalLinearDampingThresholdSqr"),
            RigidBody_btRigidBodyConstructionInfo_getAngularDamping                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_getAngularDamping"),
            RigidBody_btRigidBodyConstructionInfo_getAngularSleepingThreshold             = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_getAngularSleepingThreshold"),
            RigidBody_btRigidBodyConstructionInfo_getCollisionShape                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_getCollisionShape"),
            RigidBody_btRigidBodyConstructionInfo_getFriction                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_getFriction"),
            RigidBody_btRigidBodyConstructionInfo_getLinearDamping                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_getLinearDamping"),
            RigidBody_btRigidBodyConstructionInfo_getLinearSleepingThreshold              = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_getLinearSleepingThreshold"),
            RigidBody_btRigidBodyConstructionInfo_getLocalInertia                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_getLocalInertia"),
            RigidBody_btRigidBodyConstructionInfo_getMass                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_getMass"),
            RigidBody_btRigidBodyConstructionInfo_getMotionState                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_getMotionState"),
            RigidBody_btRigidBodyConstructionInfo_getRestitution                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_getRestitution"),
            RigidBody_btRigidBodyConstructionInfo_getRollingFriction                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_getRollingFriction"),
            RigidBody_btRigidBodyConstructionInfo_getStartWorldTransform                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_getStartWorldTransform"),
            RigidBody_btRigidBodyConstructionInfo_setAdditionalAngularDampingFactor       = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_setAdditionalAngularDampingFactor"),
            RigidBody_btRigidBodyConstructionInfo_setAdditionalAngularDampingThresholdSqr = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_setAdditionalAngularDampingThresholdSqr"),
            RigidBody_btRigidBodyConstructionInfo_setAdditionalDamping                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_setAdditionalDamping"),
            RigidBody_btRigidBodyConstructionInfo_setAdditionalDampingFactor              = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_setAdditionalDampingFactor"),
            RigidBody_btRigidBodyConstructionInfo_setAdditionalLinearDampingThresholdSqr  = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_setAdditionalLinearDampingThresholdSqr"),
            RigidBody_btRigidBodyConstructionInfo_setAngularDamping                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_setAngularDamping"),
            RigidBody_btRigidBodyConstructionInfo_setAngularSleepingThreshold             = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_setAngularSleepingThreshold"),
            RigidBody_btRigidBodyConstructionInfo_setCollisionShape                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_setCollisionShape"),
            RigidBody_btRigidBodyConstructionInfo_setFriction                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_setFriction"),
            RigidBody_btRigidBodyConstructionInfo_setLinearDamping                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_setLinearDamping"),
            RigidBody_btRigidBodyConstructionInfo_setLinearSleepingThreshold              = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_setLinearSleepingThreshold"),
            RigidBody_btRigidBodyConstructionInfo_setLocalInertia                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_setLocalInertia"),
            RigidBody_btRigidBodyConstructionInfo_setMass                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_setMass"),
            RigidBody_btRigidBodyConstructionInfo_setMotionState                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_setMotionState"),
            RigidBody_btRigidBodyConstructionInfo_setRestitution                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_setRestitution"),
            RigidBody_btRigidBodyConstructionInfo_setRollingFriction                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_setRollingFriction"),
            RigidBody_btRigidBodyConstructionInfo_setStartWorldTransform                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_setStartWorldTransform"),
            RigidBody_btRigidBodyConstructionInfo_delete                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_btRigidBodyConstructionInfo_delete"),
            RigidBody_new                                                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_new"),
            RigidBody_addConstraintRef                                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_addConstraintRef"),
            RigidBody_applyCentralForce                                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_applyCentralForce"),
            RigidBody_applyCentralImpulse                                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_applyCentralImpulse"),
            RigidBody_applyDamping                                                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_applyDamping"),
            RigidBody_applyForce                                                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_applyForce"),
            RigidBody_applyGravity                                                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_applyGravity"),
            RigidBody_applyImpulse                                                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_applyImpulse"),
            RigidBody_applyTorque                                                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_applyTorque"),
            RigidBody_applyTorqueImpulse                                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_applyTorqueImpulse"),
            RigidBody_clearForces                                                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_clearForces"),
            RigidBody_computeAngularImpulseDenominator                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_computeAngularImpulseDenominator"),
            RigidBody_computeGyroscopicForceExplicit                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_computeGyroscopicForceExplicit"),
            RigidBody_computeGyroscopicImpulseImplicit_Body                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_computeGyroscopicImpulseImplicit_Body"),
            RigidBody_computeGyroscopicImpulseImplicit_World                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_computeGyroscopicImpulseImplicit_World"),
            RigidBody_computeImpulseDenominator                                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_computeImpulseDenominator"),
            RigidBody_getAabb                                                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getAabb"),
            RigidBody_getAngularDamping                                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getAngularDamping"),
            RigidBody_getAngularFactor                                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getAngularFactor"),
            RigidBody_getAngularSleepingThreshold                                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getAngularSleepingThreshold"),
            RigidBody_getAngularVelocity                                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getAngularVelocity"),
            RigidBody_getBroadphaseProxy                                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getBroadphaseProxy"),
            RigidBody_getCenterOfMassPosition                                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getCenterOfMassPosition"),
            RigidBody_getCenterOfMassTransform                                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getCenterOfMassTransform"),
            RigidBody_getConstraintRef                                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getConstraintRef"),
            RigidBody_getContactSolverType                                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getContactSolverType"),
            RigidBody_getFlags                                                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getFlags"),
            RigidBody_getFrictionSolverType                                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getFrictionSolverType"),
            RigidBody_getGravity                                                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getGravity"),
            RigidBody_getInvInertiaDiagLocal                                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getInvInertiaDiagLocal"),
            RigidBody_getInvInertiaTensorWorld                                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getInvInertiaTensorWorld"),
            RigidBody_getInvMass                                                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getInvMass"),
            RigidBody_getLinearDamping                                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getLinearDamping"),
            RigidBody_getLinearFactor                                                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getLinearFactor"),
            RigidBody_getLinearSleepingThreshold                                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getLinearSleepingThreshold"),
            RigidBody_getLinearVelocity                                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getLinearVelocity"),
            RigidBody_getLocalInertia                                                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getLocalInertia"),
            RigidBody_getMotionState                                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getMotionState"),
            RigidBody_getNumConstraintRefs                                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getNumConstraintRefs"),
            RigidBody_getOrientation                                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getOrientation"),
            RigidBody_getTotalForce                                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getTotalForce"),
            RigidBody_getTotalTorque                                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getTotalTorque"),
            RigidBody_getVelocityInLocalPoint                                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_getVelocityInLocalPoint"),
            RigidBody_integrateVelocities                                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_integrateVelocities"),
            RigidBody_isInWorld                                                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_isInWorld"),
            RigidBody_predictIntegratedTransform                                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_predictIntegratedTransform"),
            RigidBody_proceedToTransform                                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_proceedToTransform"),
            RigidBody_removeConstraintRef                                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_removeConstraintRef"),
            RigidBody_saveKinematicState                                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_saveKinematicState"),
            RigidBody_setAngularFactor                                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_setAngularFactor"),
            RigidBody_setAngularFactor2                                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_setAngularFactor2"),
            RigidBody_setAngularVelocity                                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_setAngularVelocity"),
            RigidBody_setCenterOfMassTransform                                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_setCenterOfMassTransform"),
            RigidBody_setContactSolverType                                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_setContactSolverType"),
            RigidBody_setDamping                                                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_setDamping"),
            RigidBody_setFlags                                                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_setFlags"),
            RigidBody_setFrictionSolverType                                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_setFrictionSolverType"),
            RigidBody_setGravity                                                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_setGravity"),
            RigidBody_setInvInertiaDiagLocal                                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_setInvInertiaDiagLocal"),
            RigidBody_setLinearFactor                                                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_setLinearFactor"),
            RigidBody_setLinearVelocity                                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_setLinearVelocity"),
            RigidBody_setMassProps                                                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_setMassProps"),
            RigidBody_setMotionState                                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_setMotionState"),
            RigidBody_setNewBroadphaseProxy                                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_setNewBroadphaseProxy"),
            RigidBody_setSleepingThresholds                                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_setSleepingThresholds"),
            RigidBody_translate                                                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_translate"),
            RigidBody_upcast                                                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_upcast"),
            RigidBody_updateDeactivation                                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_updateDeactivation"),
            RigidBody_updateInertiaTensor                                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_updateInertiaTensor"),
            RigidBody_wantsSleeping                                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btRigidBody_wantsSleeping");

    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_new ] ---

    @NativeType("void *")
    public static long btRigidBody_btRigidBodyConstructionInfo_new(@NativeType("btScalar") float mass, @NativeType("void *") long motionState, @NativeType("void *") long collisionShape) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_new;
        if (CHECKS) {
            check(motionState);
            check(collisionShape);
        }
        return invokePPP(mass, motionState, collisionShape, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_new2 ] ---

    public static long nbtRigidBody_btRigidBodyConstructionInfo_new2(float mass, long motionState, long collisionShape, long localInertia) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_new2;
        if (CHECKS) {
            check(motionState);
            check(collisionShape);
        }
        return invokePPPP(mass, motionState, collisionShape, localInertia, __functionAddress);
    }

    @NativeType("void *")
    public static long btRigidBody_btRigidBodyConstructionInfo_new2(@NativeType("btScalar") float mass, @NativeType("void *") long motionState, @NativeType("void *") long collisionShape, @NativeType("btVector3 const *") ΒΤVector3 localInertia) {
        return nbtRigidBody_btRigidBodyConstructionInfo_new2(mass, motionState, collisionShape, localInertia.address());
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_getAdditionalAngularDampingFactor ] ---

    @NativeType("btScalar")
    public static float btRigidBody_btRigidBodyConstructionInfo_getAdditionalAngularDampingFactor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_getAdditionalAngularDampingFactor;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_getAdditionalAngularDampingThresholdSqr ] ---

    @NativeType("btScalar")
    public static float btRigidBody_btRigidBodyConstructionInfo_getAdditionalAngularDampingThresholdSqr(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_getAdditionalAngularDampingThresholdSqr;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_getAdditionalDamping ] ---

    @NativeType("bool")
    public static boolean btRigidBody_btRigidBodyConstructionInfo_getAdditionalDamping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_getAdditionalDamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_getAdditionalDampingFactor ] ---

    @NativeType("btScalar")
    public static float btRigidBody_btRigidBodyConstructionInfo_getAdditionalDampingFactor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_getAdditionalDampingFactor;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_getAdditionalLinearDampingThresholdSqr ] ---

    @NativeType("btScalar")
    public static float btRigidBody_btRigidBodyConstructionInfo_getAdditionalLinearDampingThresholdSqr(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_getAdditionalLinearDampingThresholdSqr;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_getAngularDamping ] ---

    @NativeType("btScalar")
    public static float btRigidBody_btRigidBodyConstructionInfo_getAngularDamping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_getAngularDamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_getAngularSleepingThreshold ] ---

    @NativeType("btScalar")
    public static float btRigidBody_btRigidBodyConstructionInfo_getAngularSleepingThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_getAngularSleepingThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_getCollisionShape ] ---

    @NativeType("void *")
    public static long btRigidBody_btRigidBodyConstructionInfo_getCollisionShape(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_getCollisionShape;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_getFriction ] ---

    @NativeType("btScalar")
    public static float btRigidBody_btRigidBodyConstructionInfo_getFriction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_getFriction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_getLinearDamping ] ---

    @NativeType("btScalar")
    public static float btRigidBody_btRigidBodyConstructionInfo_getLinearDamping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_getLinearDamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_getLinearSleepingThreshold ] ---

    @NativeType("btScalar")
    public static float btRigidBody_btRigidBodyConstructionInfo_getLinearSleepingThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_getLinearSleepingThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_getLocalInertia ] ---

    public static void nbtRigidBody_btRigidBodyConstructionInfo_getLocalInertia(long obj, long value) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_getLocalInertia;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btRigidBody_btRigidBodyConstructionInfo_getLocalInertia(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtRigidBody_btRigidBodyConstructionInfo_getLocalInertia(obj, value.address());
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_getMass ] ---

    @NativeType("btScalar")
    public static float btRigidBody_btRigidBodyConstructionInfo_getMass(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_getMass;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_getMotionState ] ---

    @NativeType("void *")
    public static long btRigidBody_btRigidBodyConstructionInfo_getMotionState(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_getMotionState;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_getRestitution ] ---

    @NativeType("btScalar")
    public static float btRigidBody_btRigidBodyConstructionInfo_getRestitution(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_getRestitution;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_getRollingFriction ] ---

    @NativeType("btScalar")
    public static float btRigidBody_btRigidBodyConstructionInfo_getRollingFriction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_getRollingFriction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_getStartWorldTransform ] ---

    public static void nbtRigidBody_btRigidBodyConstructionInfo_getStartWorldTransform(long obj, long value) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_getStartWorldTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btRigidBody_btRigidBodyConstructionInfo_getStartWorldTransform(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtRigidBody_btRigidBodyConstructionInfo_getStartWorldTransform(obj, value.address());
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_setAdditionalAngularDampingFactor ] ---

    public static void btRigidBody_btRigidBodyConstructionInfo_setAdditionalAngularDampingFactor(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_setAdditionalAngularDampingFactor;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_setAdditionalAngularDampingThresholdSqr ] ---

    public static void btRigidBody_btRigidBodyConstructionInfo_setAdditionalAngularDampingThresholdSqr(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_setAdditionalAngularDampingThresholdSqr;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_setAdditionalDamping ] ---

    public static void btRigidBody_btRigidBodyConstructionInfo_setAdditionalDamping(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_setAdditionalDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_setAdditionalDampingFactor ] ---

    public static void btRigidBody_btRigidBodyConstructionInfo_setAdditionalDampingFactor(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_setAdditionalDampingFactor;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_setAdditionalLinearDampingThresholdSqr ] ---

    public static void btRigidBody_btRigidBodyConstructionInfo_setAdditionalLinearDampingThresholdSqr(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_setAdditionalLinearDampingThresholdSqr;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_setAngularDamping ] ---

    public static void btRigidBody_btRigidBodyConstructionInfo_setAngularDamping(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_setAngularDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_setAngularSleepingThreshold ] ---

    public static void btRigidBody_btRigidBodyConstructionInfo_setAngularSleepingThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_setAngularSleepingThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_setCollisionShape ] ---

    public static void btRigidBody_btRigidBodyConstructionInfo_setCollisionShape(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_setCollisionShape;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_setFriction ] ---

    public static void btRigidBody_btRigidBodyConstructionInfo_setFriction(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_setFriction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_setLinearDamping ] ---

    public static void btRigidBody_btRigidBodyConstructionInfo_setLinearDamping(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_setLinearDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_setLinearSleepingThreshold ] ---

    public static void btRigidBody_btRigidBodyConstructionInfo_setLinearSleepingThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_setLinearSleepingThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_setLocalInertia ] ---

    public static void nbtRigidBody_btRigidBodyConstructionInfo_setLocalInertia(long obj, long value) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_setLocalInertia;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btRigidBody_btRigidBodyConstructionInfo_setLocalInertia(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtRigidBody_btRigidBodyConstructionInfo_setLocalInertia(obj, value.address());
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_setMass ] ---

    public static void btRigidBody_btRigidBodyConstructionInfo_setMass(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_setMass;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_setMotionState ] ---

    public static void btRigidBody_btRigidBodyConstructionInfo_setMotionState(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_setMotionState;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_setRestitution ] ---

    public static void btRigidBody_btRigidBodyConstructionInfo_setRestitution(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_setRestitution;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_setRollingFriction ] ---

    public static void btRigidBody_btRigidBodyConstructionInfo_setRollingFriction(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_setRollingFriction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_setStartWorldTransform ] ---

    public static void nbtRigidBody_btRigidBodyConstructionInfo_setStartWorldTransform(long obj, long value) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_setStartWorldTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btRigidBody_btRigidBodyConstructionInfo_setStartWorldTransform(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform value) {
        nbtRigidBody_btRigidBodyConstructionInfo_setStartWorldTransform(obj, value.address());
    }

    // --- [ btRigidBody_btRigidBodyConstructionInfo_delete ] ---

    public static void btRigidBody_btRigidBodyConstructionInfo_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_btRigidBodyConstructionInfo_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btRigidBody_new ] ---

    @NativeType("void *")
    public static long btRigidBody_new(@NativeType("void *") long constructionInfo) {
        long __functionAddress = Functions.RigidBody_new;
        if (CHECKS) {
            check(constructionInfo);
        }
        return invokePP(constructionInfo, __functionAddress);
    }

    // --- [ btRigidBody_addConstraintRef ] ---

    public static void btRigidBody_addConstraintRef(@NativeType("void *") long obj, @NativeType("void *") long c) {
        long __functionAddress = Functions.RigidBody_addConstraintRef;
        if (CHECKS) {
            check(obj);
            check(c);
        }
        invokePPV(obj, c, __functionAddress);
    }

    // --- [ btRigidBody_applyCentralForce ] ---

    public static void nbtRigidBody_applyCentralForce(long obj, long force) {
        long __functionAddress = Functions.RigidBody_applyCentralForce;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, force, __functionAddress);
    }

    public static void btRigidBody_applyCentralForce(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 force) {
        nbtRigidBody_applyCentralForce(obj, force.address());
    }

    // --- [ btRigidBody_applyCentralImpulse ] ---

    public static void nbtRigidBody_applyCentralImpulse(long obj, long impulse) {
        long __functionAddress = Functions.RigidBody_applyCentralImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, impulse, __functionAddress);
    }

    public static void btRigidBody_applyCentralImpulse(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 impulse) {
        nbtRigidBody_applyCentralImpulse(obj, impulse.address());
    }

    // --- [ btRigidBody_applyDamping ] ---

    public static void btRigidBody_applyDamping(@NativeType("void *") long obj, @NativeType("btScalar") float timeStep) {
        long __functionAddress = Functions.RigidBody_applyDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, timeStep, __functionAddress);
    }

    // --- [ btRigidBody_applyForce ] ---

    public static void nbtRigidBody_applyForce(long obj, long force, long rel_pos) {
        long __functionAddress = Functions.RigidBody_applyForce;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, force, rel_pos, __functionAddress);
    }

    public static void btRigidBody_applyForce(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 force, @NativeType("btVector3 const *") ΒΤVector3 rel_pos) {
        nbtRigidBody_applyForce(obj, force.address(), rel_pos.address());
    }

    // --- [ btRigidBody_applyGravity ] ---

    public static void btRigidBody_applyGravity(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_applyGravity;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btRigidBody_applyImpulse ] ---

    public static void nbtRigidBody_applyImpulse(long obj, long impulse, long rel_pos) {
        long __functionAddress = Functions.RigidBody_applyImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, impulse, rel_pos, __functionAddress);
    }

    public static void btRigidBody_applyImpulse(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 impulse, @NativeType("btVector3 const *") ΒΤVector3 rel_pos) {
        nbtRigidBody_applyImpulse(obj, impulse.address(), rel_pos.address());
    }

    // --- [ btRigidBody_applyTorque ] ---

    public static void nbtRigidBody_applyTorque(long obj, long torque) {
        long __functionAddress = Functions.RigidBody_applyTorque;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, torque, __functionAddress);
    }

    public static void btRigidBody_applyTorque(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 torque) {
        nbtRigidBody_applyTorque(obj, torque.address());
    }

    // --- [ btRigidBody_applyTorqueImpulse ] ---

    public static void nbtRigidBody_applyTorqueImpulse(long obj, long torque) {
        long __functionAddress = Functions.RigidBody_applyTorqueImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, torque, __functionAddress);
    }

    public static void btRigidBody_applyTorqueImpulse(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 torque) {
        nbtRigidBody_applyTorqueImpulse(obj, torque.address());
    }

    // --- [ btRigidBody_clearForces ] ---

    public static void btRigidBody_clearForces(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_clearForces;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btRigidBody_computeAngularImpulseDenominator ] ---

    public static float nbtRigidBody_computeAngularImpulseDenominator(long obj, long axis) {
        long __functionAddress = Functions.RigidBody_computeAngularImpulseDenominator;
        if (CHECKS) {
            check(obj);
        }
        return invokePPF(obj, axis, __functionAddress);
    }

    @NativeType("btScalar")
    public static float btRigidBody_computeAngularImpulseDenominator(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 axis) {
        return nbtRigidBody_computeAngularImpulseDenominator(obj, axis.address());
    }

    // --- [ btRigidBody_computeGyroscopicForceExplicit ] ---

    public static void nbtRigidBody_computeGyroscopicForceExplicit(long obj, float maxGyroscopicForce, long value) {
        long __functionAddress = Functions.RigidBody_computeGyroscopicForceExplicit;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, maxGyroscopicForce, value, __functionAddress);
    }

    public static void btRigidBody_computeGyroscopicForceExplicit(@NativeType("void *") long obj, @NativeType("btScalar") float maxGyroscopicForce, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtRigidBody_computeGyroscopicForceExplicit(obj, maxGyroscopicForce, value.address());
    }

    // --- [ btRigidBody_computeGyroscopicImpulseImplicit_Body ] ---

    public static void nbtRigidBody_computeGyroscopicImpulseImplicit_Body(long obj, float step, long value) {
        long __functionAddress = Functions.RigidBody_computeGyroscopicImpulseImplicit_Body;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, step, value, __functionAddress);
    }

    public static void btRigidBody_computeGyroscopicImpulseImplicit_Body(@NativeType("void *") long obj, @NativeType("btScalar") float step, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtRigidBody_computeGyroscopicImpulseImplicit_Body(obj, step, value.address());
    }

    // --- [ btRigidBody_computeGyroscopicImpulseImplicit_World ] ---

    public static void nbtRigidBody_computeGyroscopicImpulseImplicit_World(long obj, float dt, long value) {
        long __functionAddress = Functions.RigidBody_computeGyroscopicImpulseImplicit_World;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, dt, value, __functionAddress);
    }

    public static void btRigidBody_computeGyroscopicImpulseImplicit_World(@NativeType("void *") long obj, @NativeType("btScalar") float dt, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtRigidBody_computeGyroscopicImpulseImplicit_World(obj, dt, value.address());
    }

    // --- [ btRigidBody_computeImpulseDenominator ] ---

    public static float nbtRigidBody_computeImpulseDenominator(long obj, long pos, long normal) {
        long __functionAddress = Functions.RigidBody_computeImpulseDenominator;
        if (CHECKS) {
            check(obj);
        }
        return invokePPPF(obj, pos, normal, __functionAddress);
    }

    @NativeType("btScalar")
    public static float btRigidBody_computeImpulseDenominator(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 pos, @NativeType("btVector3 const *") ΒΤVector3 normal) {
        return nbtRigidBody_computeImpulseDenominator(obj, pos.address(), normal.address());
    }

    // --- [ btRigidBody_getAabb ] ---

    public static void nbtRigidBody_getAabb(long obj, long aabbMin, long aabbMax) {
        long __functionAddress = Functions.RigidBody_getAabb;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, aabbMin, aabbMax, __functionAddress);
    }

    public static void btRigidBody_getAabb(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 aabbMin, @NativeType("btVector3 *") ΒΤVector3 aabbMax) {
        nbtRigidBody_getAabb(obj, aabbMin.address(), aabbMax.address());
    }

    // --- [ btRigidBody_getAngularDamping ] ---

    @NativeType("btScalar")
    public static float btRigidBody_getAngularDamping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_getAngularDamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRigidBody_getAngularFactor ] ---

    public static void nbtRigidBody_getAngularFactor(long obj, long value) {
        long __functionAddress = Functions.RigidBody_getAngularFactor;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btRigidBody_getAngularFactor(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtRigidBody_getAngularFactor(obj, value.address());
    }

    // --- [ btRigidBody_getAngularSleepingThreshold ] ---

    @NativeType("btScalar")
    public static float btRigidBody_getAngularSleepingThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_getAngularSleepingThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRigidBody_getAngularVelocity ] ---

    public static void nbtRigidBody_getAngularVelocity(long obj, long value) {
        long __functionAddress = Functions.RigidBody_getAngularVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btRigidBody_getAngularVelocity(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtRigidBody_getAngularVelocity(obj, value.address());
    }

    // --- [ btRigidBody_getBroadphaseProxy ] ---

    @NativeType("void *")
    public static long btRigidBody_getBroadphaseProxy(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_getBroadphaseProxy;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btRigidBody_getCenterOfMassPosition ] ---

    public static void nbtRigidBody_getCenterOfMassPosition(long obj, long value) {
        long __functionAddress = Functions.RigidBody_getCenterOfMassPosition;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btRigidBody_getCenterOfMassPosition(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtRigidBody_getCenterOfMassPosition(obj, value.address());
    }

    // --- [ btRigidBody_getCenterOfMassTransform ] ---

    public static void nbtRigidBody_getCenterOfMassTransform(long obj, long value) {
        long __functionAddress = Functions.RigidBody_getCenterOfMassTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btRigidBody_getCenterOfMassTransform(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtRigidBody_getCenterOfMassTransform(obj, value.address());
    }

    // --- [ btRigidBody_getConstraintRef ] ---

    @NativeType("void *")
    public static long btRigidBody_getConstraintRef(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.RigidBody_getConstraintRef;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btRigidBody_getContactSolverType ] ---

    public static int btRigidBody_getContactSolverType(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_getContactSolverType;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btRigidBody_getFlags ] ---

    public static int btRigidBody_getFlags(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_getFlags;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btRigidBody_getFrictionSolverType ] ---

    public static int btRigidBody_getFrictionSolverType(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_getFrictionSolverType;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btRigidBody_getGravity ] ---

    public static void nbtRigidBody_getGravity(long obj, long value) {
        long __functionAddress = Functions.RigidBody_getGravity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btRigidBody_getGravity(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtRigidBody_getGravity(obj, value.address());
    }

    // --- [ btRigidBody_getInvInertiaDiagLocal ] ---

    public static void nbtRigidBody_getInvInertiaDiagLocal(long obj, long value) {
        long __functionAddress = Functions.RigidBody_getInvInertiaDiagLocal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btRigidBody_getInvInertiaDiagLocal(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtRigidBody_getInvInertiaDiagLocal(obj, value.address());
    }

    // --- [ btRigidBody_getInvInertiaTensorWorld ] ---

    public static void nbtRigidBody_getInvInertiaTensorWorld(long obj, long value) {
        long __functionAddress = Functions.RigidBody_getInvInertiaTensorWorld;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btRigidBody_getInvInertiaTensorWorld(@NativeType("void *") long obj, @NativeType("btMatrix3x3 *") BTMatrix3x3 value) {
        nbtRigidBody_getInvInertiaTensorWorld(obj, value.address());
    }

    // --- [ btRigidBody_getInvMass ] ---

    @NativeType("btScalar")
    public static float btRigidBody_getInvMass(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_getInvMass;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRigidBody_getLinearDamping ] ---

    @NativeType("btScalar")
    public static float btRigidBody_getLinearDamping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_getLinearDamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRigidBody_getLinearFactor ] ---

    public static void nbtRigidBody_getLinearFactor(long obj, long value) {
        long __functionAddress = Functions.RigidBody_getLinearFactor;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btRigidBody_getLinearFactor(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtRigidBody_getLinearFactor(obj, value.address());
    }

    // --- [ btRigidBody_getLinearSleepingThreshold ] ---

    @NativeType("btScalar")
    public static float btRigidBody_getLinearSleepingThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_getLinearSleepingThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btRigidBody_getLinearVelocity ] ---

    public static void nbtRigidBody_getLinearVelocity(long obj, long value) {
        long __functionAddress = Functions.RigidBody_getLinearVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btRigidBody_getLinearVelocity(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtRigidBody_getLinearVelocity(obj, value.address());
    }

    // --- [ btRigidBody_getLocalInertia ] ---

    public static void nbtRigidBody_getLocalInertia(long obj, long value) {
        long __functionAddress = Functions.RigidBody_getLocalInertia;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btRigidBody_getLocalInertia(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtRigidBody_getLocalInertia(obj, value.address());
    }

    // --- [ btRigidBody_getMotionState ] ---

    @NativeType("void *")
    public static long btRigidBody_getMotionState(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_getMotionState;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btRigidBody_getNumConstraintRefs ] ---

    public static int btRigidBody_getNumConstraintRefs(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_getNumConstraintRefs;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btRigidBody_getOrientation ] ---

    public static void nbtRigidBody_getOrientation(long obj, long value) {
        long __functionAddress = Functions.RigidBody_getOrientation;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btRigidBody_getOrientation(@NativeType("void *") long obj, @NativeType("btQuaternion *") ΒΤVector3 value) {
        nbtRigidBody_getOrientation(obj, value.address());
    }

    // --- [ btRigidBody_getTotalForce ] ---

    public static void nbtRigidBody_getTotalForce(long obj, long value) {
        long __functionAddress = Functions.RigidBody_getTotalForce;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btRigidBody_getTotalForce(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtRigidBody_getTotalForce(obj, value.address());
    }

    // --- [ btRigidBody_getTotalTorque ] ---

    public static void nbtRigidBody_getTotalTorque(long obj, long value) {
        long __functionAddress = Functions.RigidBody_getTotalTorque;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btRigidBody_getTotalTorque(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtRigidBody_getTotalTorque(obj, value.address());
    }

    // --- [ btRigidBody_getVelocityInLocalPoint ] ---

    public static void nbtRigidBody_getVelocityInLocalPoint(long obj, long rel_pos, long value) {
        long __functionAddress = Functions.RigidBody_getVelocityInLocalPoint;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, rel_pos, value, __functionAddress);
    }

    public static void btRigidBody_getVelocityInLocalPoint(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 rel_pos, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtRigidBody_getVelocityInLocalPoint(obj, rel_pos.address(), value.address());
    }

    // --- [ btRigidBody_integrateVelocities ] ---

    public static void btRigidBody_integrateVelocities(@NativeType("void *") long obj, @NativeType("btScalar") float step) {
        long __functionAddress = Functions.RigidBody_integrateVelocities;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, step, __functionAddress);
    }

    // --- [ btRigidBody_isInWorld ] ---

    @NativeType("bool")
    public static boolean btRigidBody_isInWorld(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_isInWorld;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btRigidBody_predictIntegratedTransform ] ---

    public static void nbtRigidBody_predictIntegratedTransform(long obj, float step, long predictedTransform) {
        long __functionAddress = Functions.RigidBody_predictIntegratedTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, step, predictedTransform, __functionAddress);
    }

    public static void btRigidBody_predictIntegratedTransform(@NativeType("void *") long obj, @NativeType("btScalar") float step, @NativeType("btTransform *") BTTransform predictedTransform) {
        nbtRigidBody_predictIntegratedTransform(obj, step, predictedTransform.address());
    }

    // --- [ btRigidBody_proceedToTransform ] ---

    public static void nbtRigidBody_proceedToTransform(long obj, long newTrans) {
        long __functionAddress = Functions.RigidBody_proceedToTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, newTrans, __functionAddress);
    }

    public static void btRigidBody_proceedToTransform(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform newTrans) {
        nbtRigidBody_proceedToTransform(obj, newTrans.address());
    }

    // --- [ btRigidBody_removeConstraintRef ] ---

    public static void btRigidBody_removeConstraintRef(@NativeType("void *") long obj, @NativeType("void *") long c) {
        long __functionAddress = Functions.RigidBody_removeConstraintRef;
        if (CHECKS) {
            check(obj);
            check(c);
        }
        invokePPV(obj, c, __functionAddress);
    }

    // --- [ btRigidBody_saveKinematicState ] ---

    public static void btRigidBody_saveKinematicState(@NativeType("void *") long obj, @NativeType("btScalar") float step) {
        long __functionAddress = Functions.RigidBody_saveKinematicState;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, step, __functionAddress);
    }

    // --- [ btRigidBody_setAngularFactor ] ---

    public static void nbtRigidBody_setAngularFactor(long obj, long angFac) {
        long __functionAddress = Functions.RigidBody_setAngularFactor;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, angFac, __functionAddress);
    }

    public static void btRigidBody_setAngularFactor(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 angFac) {
        nbtRigidBody_setAngularFactor(obj, angFac.address());
    }

    // --- [ btRigidBody_setAngularFactor2 ] ---

    public static void btRigidBody_setAngularFactor2(@NativeType("void *") long obj, @NativeType("btScalar") float angFac) {
        long __functionAddress = Functions.RigidBody_setAngularFactor2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, angFac, __functionAddress);
    }

    // --- [ btRigidBody_setAngularVelocity ] ---

    public static void nbtRigidBody_setAngularVelocity(long obj, long ang_vel) {
        long __functionAddress = Functions.RigidBody_setAngularVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, ang_vel, __functionAddress);
    }

    public static void btRigidBody_setAngularVelocity(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 ang_vel) {
        nbtRigidBody_setAngularVelocity(obj, ang_vel.address());
    }

    // --- [ btRigidBody_setCenterOfMassTransform ] ---

    public static void nbtRigidBody_setCenterOfMassTransform(long obj, long xform) {
        long __functionAddress = Functions.RigidBody_setCenterOfMassTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, xform, __functionAddress);
    }

    public static void btRigidBody_setCenterOfMassTransform(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform xform) {
        nbtRigidBody_setCenterOfMassTransform(obj, xform.address());
    }

    // --- [ btRigidBody_setContactSolverType ] ---

    public static void btRigidBody_setContactSolverType(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.RigidBody_setContactSolverType;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRigidBody_setDamping ] ---

    public static void btRigidBody_setDamping(@NativeType("void *") long obj, @NativeType("btScalar") float lin_damping, @NativeType("btScalar") float ang_damping) {
        long __functionAddress = Functions.RigidBody_setDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, lin_damping, ang_damping, __functionAddress);
    }

    // --- [ btRigidBody_setFlags ] ---

    public static void btRigidBody_setFlags(@NativeType("void *") long obj, int flags) {
        long __functionAddress = Functions.RigidBody_setFlags;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, flags, __functionAddress);
    }

    // --- [ btRigidBody_setFrictionSolverType ] ---

    public static void btRigidBody_setFrictionSolverType(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.RigidBody_setFrictionSolverType;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btRigidBody_setGravity ] ---

    public static void nbtRigidBody_setGravity(long obj, long acceleration) {
        long __functionAddress = Functions.RigidBody_setGravity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, acceleration, __functionAddress);
    }

    public static void btRigidBody_setGravity(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 acceleration) {
        nbtRigidBody_setGravity(obj, acceleration.address());
    }

    // --- [ btRigidBody_setInvInertiaDiagLocal ] ---

    public static void nbtRigidBody_setInvInertiaDiagLocal(long obj, long diagInvInertia) {
        long __functionAddress = Functions.RigidBody_setInvInertiaDiagLocal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, diagInvInertia, __functionAddress);
    }

    public static void btRigidBody_setInvInertiaDiagLocal(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 diagInvInertia) {
        nbtRigidBody_setInvInertiaDiagLocal(obj, diagInvInertia.address());
    }

    // --- [ btRigidBody_setLinearFactor ] ---

    public static void nbtRigidBody_setLinearFactor(long obj, long linearFactor) {
        long __functionAddress = Functions.RigidBody_setLinearFactor;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, linearFactor, __functionAddress);
    }

    public static void btRigidBody_setLinearFactor(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 linearFactor) {
        nbtRigidBody_setLinearFactor(obj, linearFactor.address());
    }

    // --- [ btRigidBody_setLinearVelocity ] ---

    public static void nbtRigidBody_setLinearVelocity(long obj, long lin_vel) {
        long __functionAddress = Functions.RigidBody_setLinearVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, lin_vel, __functionAddress);
    }

    public static void btRigidBody_setLinearVelocity(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 lin_vel) {
        nbtRigidBody_setLinearVelocity(obj, lin_vel.address());
    }

    // --- [ btRigidBody_setMassProps ] ---

    public static void nbtRigidBody_setMassProps(long obj, float mass, long inertia) {
        long __functionAddress = Functions.RigidBody_setMassProps;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, mass, inertia, __functionAddress);
    }

    public static void btRigidBody_setMassProps(@NativeType("void *") long obj, @NativeType("btScalar") float mass, @NativeType("btVector3 const *") ΒΤVector3 inertia) {
        nbtRigidBody_setMassProps(obj, mass, inertia.address());
    }

    // --- [ btRigidBody_setMotionState ] ---

    public static void btRigidBody_setMotionState(@NativeType("void *") long obj, @NativeType("void *") long motionState) {
        long __functionAddress = Functions.RigidBody_setMotionState;
        if (CHECKS) {
            check(obj);
            check(motionState);
        }
        invokePPV(obj, motionState, __functionAddress);
    }

    // --- [ btRigidBody_setNewBroadphaseProxy ] ---

    public static void btRigidBody_setNewBroadphaseProxy(@NativeType("void *") long obj, @NativeType("void *") long broadphaseProxy) {
        long __functionAddress = Functions.RigidBody_setNewBroadphaseProxy;
        if (CHECKS) {
            check(obj);
            check(broadphaseProxy);
        }
        invokePPV(obj, broadphaseProxy, __functionAddress);
    }

    // --- [ btRigidBody_setSleepingThresholds ] ---

    public static void btRigidBody_setSleepingThresholds(@NativeType("void *") long obj, @NativeType("btScalar") float linear, @NativeType("btScalar") float angular) {
        long __functionAddress = Functions.RigidBody_setSleepingThresholds;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, linear, angular, __functionAddress);
    }

    // --- [ btRigidBody_translate ] ---

    public static void nbtRigidBody_translate(long obj, long v) {
        long __functionAddress = Functions.RigidBody_translate;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, v, __functionAddress);
    }

    public static void btRigidBody_translate(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 v) {
        nbtRigidBody_translate(obj, v.address());
    }

    // --- [ btRigidBody_upcast ] ---

    @NativeType("void *")
    public static long btRigidBody_upcast(@NativeType("void *") long colObj) {
        long __functionAddress = Functions.RigidBody_upcast;
        if (CHECKS) {
            check(colObj);
        }
        return invokePP(colObj, __functionAddress);
    }

    // --- [ btRigidBody_updateDeactivation ] ---

    public static void btRigidBody_updateDeactivation(@NativeType("void *") long obj, @NativeType("btScalar") float timeStep) {
        long __functionAddress = Functions.RigidBody_updateDeactivation;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, timeStep, __functionAddress);
    }

    // --- [ btRigidBody_updateInertiaTensor ] ---

    public static void btRigidBody_updateInertiaTensor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_updateInertiaTensor;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btRigidBody_wantsSleeping ] ---

    @NativeType("bool")
    public static boolean btRigidBody_wantsSleeping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.RigidBody_wantsSleeping;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

}
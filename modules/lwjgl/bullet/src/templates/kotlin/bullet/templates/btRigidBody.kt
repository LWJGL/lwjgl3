/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btRigidBody = "BTRigidBody".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "RigidBody_btRigidBodyConstructionInfo_new",
        "",

        btScalar("mass", ""),
        opaque_p("motionState", ""),
        opaque_p("collisionShape", "")
    )

    opaque_p(
        "RigidBody_btRigidBodyConstructionInfo_new2",
        "",

        btScalar("mass", ""),
        opaque_p("motionState", ""),
        opaque_p("collisionShape", ""),
        btVector3.const.p("localInertia", "")
    )

    btScalar(
        "RigidBody_btRigidBodyConstructionInfo_getAdditionalAngularDampingFactor",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RigidBody_btRigidBodyConstructionInfo_getAdditionalAngularDampingThresholdSqr",
        "",

        opaque_p("obj", "")
    )

    bool(
        "RigidBody_btRigidBodyConstructionInfo_getAdditionalDamping",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RigidBody_btRigidBodyConstructionInfo_getAdditionalDampingFactor",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RigidBody_btRigidBodyConstructionInfo_getAdditionalLinearDampingThresholdSqr",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RigidBody_btRigidBodyConstructionInfo_getAngularDamping",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RigidBody_btRigidBodyConstructionInfo_getAngularSleepingThreshold",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "RigidBody_btRigidBodyConstructionInfo_getCollisionShape",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RigidBody_btRigidBodyConstructionInfo_getFriction",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RigidBody_btRigidBodyConstructionInfo_getLinearDamping",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RigidBody_btRigidBodyConstructionInfo_getLinearSleepingThreshold",
        "",

        opaque_p("obj", "")
    )

    void(
        "RigidBody_btRigidBodyConstructionInfo_getLocalInertia",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "RigidBody_btRigidBodyConstructionInfo_getMass",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "RigidBody_btRigidBodyConstructionInfo_getMotionState",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RigidBody_btRigidBodyConstructionInfo_getRestitution",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RigidBody_btRigidBodyConstructionInfo_getRollingFriction",
        "",

        opaque_p("obj", "")
    )

    void(
        "RigidBody_btRigidBodyConstructionInfo_getStartWorldTransform",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "RigidBody_btRigidBodyConstructionInfo_setAdditionalAngularDampingFactor",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RigidBody_btRigidBodyConstructionInfo_setAdditionalAngularDampingThresholdSqr",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RigidBody_btRigidBodyConstructionInfo_setAdditionalDamping",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "RigidBody_btRigidBodyConstructionInfo_setAdditionalDampingFactor",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RigidBody_btRigidBodyConstructionInfo_setAdditionalLinearDampingThresholdSqr",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RigidBody_btRigidBodyConstructionInfo_setAngularDamping",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RigidBody_btRigidBodyConstructionInfo_setAngularSleepingThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RigidBody_btRigidBodyConstructionInfo_setCollisionShape",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "RigidBody_btRigidBodyConstructionInfo_setFriction",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RigidBody_btRigidBodyConstructionInfo_setLinearDamping",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RigidBody_btRigidBodyConstructionInfo_setLinearSleepingThreshold",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RigidBody_btRigidBodyConstructionInfo_setLocalInertia",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "RigidBody_btRigidBodyConstructionInfo_setMass",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RigidBody_btRigidBodyConstructionInfo_setMotionState",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "RigidBody_btRigidBodyConstructionInfo_setRestitution",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RigidBody_btRigidBodyConstructionInfo_setRollingFriction",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "RigidBody_btRigidBodyConstructionInfo_setStartWorldTransform",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("value", "")
    )

    void(
        "RigidBody_btRigidBodyConstructionInfo_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "RigidBody_new",
        "",

        opaque_p("constructionInfo", "")
    )

    void(
        "RigidBody_addConstraintRef",
        "",

        opaque_p("obj", ""),
        opaque_p("c", "")
    )

    void(
        "RigidBody_applyCentralForce",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("force", "")
    )

    void(
        "RigidBody_applyCentralImpulse",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("impulse", "")
    )

    void(
        "RigidBody_applyDamping",
        "",

        opaque_p("obj", ""),
        btScalar("timeStep", "")
    )

    void(
        "RigidBody_applyForce",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("force", ""),
        btVector3.const.p("rel_pos", "")
    )

    void(
        "RigidBody_applyGravity",
        "",

        opaque_p("obj", "")
    )

    void(
        "RigidBody_applyImpulse",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("impulse", ""),
        btVector3.const.p("rel_pos", "")
    )

    void(
        "RigidBody_applyTorque",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("torque", "")
    )

    void(
        "RigidBody_applyTorqueImpulse",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("torque", "")
    )

    void(
        "RigidBody_clearForces",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RigidBody_computeAngularImpulseDenominator",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("axis", "")
    )

    void(
        "RigidBody_computeGyroscopicForceExplicit",
        "",

        opaque_p("obj", ""),
        btScalar("maxGyroscopicForce", ""),
        btVector3.p("value", "")
    )

    void(
        "RigidBody_computeGyroscopicImpulseImplicit_Body",
        "",

        opaque_p("obj", ""),
        btScalar("step", ""),
        btVector3.p("value", "")
    )

    void(
        "RigidBody_computeGyroscopicImpulseImplicit_World",
        "",

        opaque_p("obj", ""),
        btScalar("dt", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "RigidBody_computeImpulseDenominator",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("pos", ""),
        btVector3.const.p("normal", "")
    )

    void(
        "RigidBody_getAabb",
        "",

        opaque_p("obj", ""),
        btVector3.p("aabbMin", ""),
        btVector3.p("aabbMax", "")
    )

    btScalar(
        "RigidBody_getAngularDamping",
        "",

        opaque_p("obj", "")
    )

    void(
        "RigidBody_getAngularFactor",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "RigidBody_getAngularSleepingThreshold",
        "",

        opaque_p("obj", "")
    )

    void(
        "RigidBody_getAngularVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p(
        "RigidBody_getBroadphaseProxy",
        "",

        opaque_p("obj", "")
    )

    void(
        "RigidBody_getCenterOfMassPosition",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "RigidBody_getCenterOfMassTransform",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    opaque_p(
        "RigidBody_getConstraintRef",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    int(
        "RigidBody_getContactSolverType",
        "",

        opaque_p("obj", "")
    )

    int(
        "RigidBody_getFlags",
        "",

        opaque_p("obj", "")
    )

    int(
        "RigidBody_getFrictionSolverType",
        "",

        opaque_p("obj", "")
    )

    void(
        "RigidBody_getGravity",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "RigidBody_getInvInertiaDiagLocal",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "RigidBody_getInvInertiaTensorWorld",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.p("value", "")
    )

    btScalar(
        "RigidBody_getInvMass",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "RigidBody_getLinearDamping",
        "",

        opaque_p("obj", "")
    )

    void(
        "RigidBody_getLinearFactor",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "RigidBody_getLinearSleepingThreshold",
        "",

        opaque_p("obj", "")
    )

    void(
        "RigidBody_getLinearVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "RigidBody_getLocalInertia",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p(
        "RigidBody_getMotionState",
        "",

        opaque_p("obj", "")
    )

    int(
        "RigidBody_getNumConstraintRefs",
        "",

        opaque_p("obj", "")
    )

    void(
        "RigidBody_getOrientation",
        "",

        opaque_p("obj", ""),
        btQuaternion.p("value", "")
    )

    void(
        "RigidBody_getTotalForce",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "RigidBody_getTotalTorque",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "RigidBody_getVelocityInLocalPoint",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("rel_pos", ""),
        btVector3.p("value", "")
    )

    void(
        "RigidBody_integrateVelocities",
        "",

        opaque_p("obj", ""),
        btScalar("step", "")
    )

    bool(
        "RigidBody_isInWorld",
        "",

        opaque_p("obj", "")
    )

    void(
        "RigidBody_predictIntegratedTransform",
        "",

        opaque_p("obj", ""),
        btScalar("step", ""),
        btTransform.p("predictedTransform", "")
    )

    void(
        "RigidBody_proceedToTransform",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("newTrans", "")
    )

    void(
        "RigidBody_removeConstraintRef",
        "",

        opaque_p("obj", ""),
        opaque_p("c", "")
    )

    void(
        "RigidBody_saveKinematicState",
        "",

        opaque_p("obj", ""),
        btScalar("step", "")
    )

    void(
        "RigidBody_setAngularFactor",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("angFac", "")
    )

    void(
        "RigidBody_setAngularFactor2",
        "",

        opaque_p("obj", ""),
        btScalar("angFac", "")
    )

    void(
        "RigidBody_setAngularVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("ang_vel", "")
    )

    void(
        "RigidBody_setCenterOfMassTransform",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("xform", "")
    )

    void(
        "RigidBody_setContactSolverType",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "RigidBody_setDamping",
        "",

        opaque_p("obj", ""),
        btScalar("lin_damping", ""),
        btScalar("ang_damping", "")
    )

    void(
        "RigidBody_setFlags",
        "",

        opaque_p("obj", ""),
        int("flags", "")
    )

    void(
        "RigidBody_setFrictionSolverType",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "RigidBody_setGravity",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("acceleration", "")
    )

    void(
        "RigidBody_setInvInertiaDiagLocal",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("diagInvInertia", "")
    )

    void(
        "RigidBody_setLinearFactor",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("linearFactor", "")
    )

    void(
        "RigidBody_setLinearVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("lin_vel", "")
    )

    void(
        "RigidBody_setMassProps",
        "",

        opaque_p("obj", ""),
        btScalar("mass", ""),
        btVector3.const.p("inertia", "")
    )

    void(
        "RigidBody_setMotionState",
        "",

        opaque_p("obj", ""),
        opaque_p("motionState", "")
    )

    void(
        "RigidBody_setNewBroadphaseProxy",
        "",

        opaque_p("obj", ""),
        opaque_p("broadphaseProxy", "")
    )

    void(
        "RigidBody_setSleepingThresholds",
        "",

        opaque_p("obj", ""),
        btScalar("linear", ""),
        btScalar("angular", "")
    )

    void(
        "RigidBody_translate",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("v", "")
    )

    opaque_p(
        "RigidBody_upcast",
        "",

        opaque_p("colObj", "")
    )

    void(
        "RigidBody_updateDeactivation",
        "",

        opaque_p("obj", ""),
        btScalar("timeStep", "")
    )

    void(
        "RigidBody_updateInertiaTensor",
        "",

        opaque_p("obj", "")
    )

    bool(
        "RigidBody_wantsSleeping",
        "",

        opaque_p("obj", "")
    )

}
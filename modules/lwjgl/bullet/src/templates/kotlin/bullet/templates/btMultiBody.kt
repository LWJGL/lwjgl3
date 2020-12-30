/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btMultiBody = "BTMultiBody".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "MultiBody_new",
        "",

        int("n_links", ""),
        btScalar("mass", ""),
        btVector3.const.p("inertia", ""),
        bool("fixedBase", ""),
        bool("canSleep", "")
    )

    void(
        "MultiBody_addBaseConstraintForce",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("f", "")
    )

    void(
        "MultiBody_addBaseConstraintTorque",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("t", "")
    )

    void(
        "MultiBody_addBaseForce",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("f", "")
    )

    void(
        "MultiBody_addBaseTorque",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("t", "")
    )

    void(
        "MultiBody_addJointTorque",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btScalar("Q", "")
    )

    void(
        "MultiBody_addJointTorqueMultiDof",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        Unsafe..btScalar.const.p("Q", "")
    )

    void(
        "MultiBody_addJointTorqueMultiDof2",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        int("dof", ""),
        btScalar("Q", "")
    )

    void(
        "MultiBody_addLinkConstraintForce",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btVector3.const.p("f", "")
    )

    void(
        "MultiBody_addLinkConstraintTorque",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btVector3.const.p("t", "")
    )

    void(
        "MultiBody_addLinkForce",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btVector3.const.p("f", "")
    )

    void(
        "MultiBody_addLinkTorque",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btVector3.const.p("t", "")
    )

    void(
        "MultiBody_applyDeltaVeeMultiDof",
        "",

        opaque_p("obj", ""),
        Unsafe..btScalar.const.p("delta_vee", ""),
        btScalar("multiplier", "")
    )

    void(
        "MultiBody_applyDeltaVeeMultiDof2",
        "",

        opaque_p("obj", ""),
        Unsafe..btScalar.const.p("delta_vee", ""),
        btScalar("multiplier", "")
    )

    void(
        "MultiBody_calcAccelerationDeltasMultiDof",
        "",

        opaque_p("obj", ""),
        Unsafe..btScalar.const.p("force", ""),
        Unsafe..btScalar.p("output", ""),
        opaque_p("scratch_r", ""),
        opaque_p("scratch_v", "")
    )

    int(
        "MultiBody_calculateSerializeBufferSize",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultiBody_checkMotionAndSleepIfRequired",
        "",

        opaque_p("obj", ""),
        btScalar("timestep", "")
    )

    void(
        "MultiBody_clearConstraintForces",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultiBody_clearForcesAndTorques",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultiBody_clearVelocities",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultiBody_computeAccelerationsArticulatedBodyAlgorithmMultiDof",
        "",

        opaque_p("obj", ""),
        btScalar("dt", ""),
        opaque_p("scratch_r", ""),
        opaque_p("scratch_v", ""),
        opaque_p("scratch_m", ""), 
		bool("isConstraintPass", ""), 
		bool("jointFeedbackInWorldSpace", ""),
		bool("jointFeedbackInJointFrame", "")
    )

    void(
        "MultiBody_fillConstraintJacobianMultiDof",
        "",

        opaque_p("obj", ""),
        int("link", ""),
        btVector3.const.p("contact_point", ""),
        btVector3.const.p("normal_ang", ""),
        btVector3.const.p("normal_lin", ""),
        Unsafe..btScalar.p("jac", ""),
        opaque_p("scratch_r", ""),
        opaque_p("scratch_v", ""),
        opaque_p("scratch_m", "")
    )

    void(
        "MultiBody_fillContactJacobianMultiDof",
        "",

        opaque_p("obj", ""),
        int("link", ""),
        btVector3.const.p("contact_point", ""),
        btVector3.const.p("normal", ""),
        Unsafe..btScalar.p("jac", ""),
        opaque_p("scratch_r", ""),
        opaque_p("scratch_v", ""),
        opaque_p("scratch_m", "")
    )

    void(
        "MultiBody_finalizeMultiDof",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultiBody_forwardKinematics",
        "",

        opaque_p("obj", ""),
        opaque_p("scratch_q", ""),
        opaque_p("scratch_m", "")
    )

    btScalar(
        "MultiBody_getAngularDamping",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultiBody_getAngularMomentum",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p(
        "MultiBody_getBaseCollider",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultiBody_getBaseForce",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "MultiBody_getBaseInertia",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "MultiBody_getBaseMass",
        "",

        opaque_p("obj", "")
    )

    charUTF8.const.p(
        "MultiBody_getBaseName",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultiBody_getBaseOmega",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "MultiBody_getBasePos",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "MultiBody_getBaseTorque",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "MultiBody_getBaseVel",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "MultiBody_getBaseWorldTransform",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    bool(
        "MultiBody_getCanSleep",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultiBody_getCompanionId",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "MultiBody_getJointPos",
        "",

        opaque_p("obj", ""),
        int("i", "")
    )

    btScalar[7](
        "MultiBody_getJointPosMultiDof",
        "",

        opaque_p("obj", ""),
        int("i", "")
    )

    btScalar(
        "MultiBody_getJointTorque",
        "",

        opaque_p("obj", ""),
        int("i", "")
    )

    btScalar[6](
        "MultiBody_getJointTorqueMultiDof",
        "",

        opaque_p("obj", ""),
        int("i", "")
    )

    btScalar(
        "MultiBody_getJointVel",
        "",

        opaque_p("obj", ""),
        int("i", "")
    )

    //btScalar.p(
    opaque_p(
        "MultiBody_getJointVelMultiDof",
        "",

        opaque_p("obj", ""),
        int("i", "")
    )

    btScalar(
        "MultiBody_getKineticEnergy",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "MultiBody_getLinearDamping",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "MultiBody_getLink",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    void(
        "MultiBody_getLinkForce",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btVector3.p("value", "")
    )

    void(
        "MultiBody_getLinkInertia",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "MultiBody_getLinkMass",
        "",

        opaque_p("obj", ""),
        int("i", "")
    )

    void(
        "MultiBody_getLinkTorque",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "MultiBody_getMaxAppliedImpulse",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "MultiBody_getMaxCoordinateVelocity",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultiBody_getNumDofs",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultiBody_getNumLinks",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultiBody_getNumPosVars",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultiBody_getParent",
        "",

        opaque_p("obj", ""),
        int("link_num", "")
    )

    void(
        "MultiBody_getParentToLocalRot",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btQuaternion.p("value", "")
    )

    void(
        "MultiBody_getRVector",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btVector3.p("value", "")
    )

    bool(
        "MultiBody_getUseGyroTerm",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultiBody_getUserIndex",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultiBody_getUserIndex2",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "MultiBody_getUserPointer",
        "",

        opaque_p("obj", "")
    )

    //btScalar.const.p(
    opaque_const_p(
        "MultiBody_getVelocityVector",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultiBody_getWorldToBaseRot",
        "",

        opaque_p("obj", ""),
        btQuaternion.p("value", "")
    )

    void(
        "MultiBody_goToSleep",
        "",

        opaque_p("obj", "")
    )

    bool(
        "MultiBody_hasFixedBase",
        "",

        opaque_p("obj", "")
    )

    bool(
        "MultiBody_hasSelfCollision",
        "",

        opaque_p("obj", "")
    )

    bool(
        "MultiBody_internalNeedsJointFeedback",
        "",

        opaque_p("obj", "")
    )

    bool(
        "MultiBody_isAwake",
        "",

        opaque_p("obj", "")
    )

    bool(
        "MultiBody_isPosUpdated",
        "",

        opaque_p("obj", "")
    )

    bool(
        "MultiBody_isUsingGlobalVelocities",
        "",

        opaque_p("obj", "")
    )

    bool(
        "MultiBody_isUsingRK4Integration",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultiBody_localDirToWorld",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btVector3.const.p("vec", ""),
        btVector3.p("value", "")
    )

    void(
        "MultiBody_localFrameToWorld",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btMatrix3x3.const.p("mat", ""),
        btMatrix3x3.p("value", "")
    )

    void(
        "MultiBody_localPosToWorld",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btVector3.const.p("vec", ""),
        btVector3.p("value", "")
    )

    void(
        "MultiBody_processDeltaVeeMultiDof2",
        "",

        opaque_p("obj", "")
    )

    charUTF8.const.p(
        "MultiBody_serialize",
        "",

        opaque_p("obj", ""),
        opaque_p("dataBuffer", ""),
        opaque_p("serializer", "")
    )

    void(
        "MultiBody_setAngularDamping",
        "",

        opaque_p("obj", ""),
        btScalar("damp", "")
    )

    void(
        "MultiBody_setBaseCollider",
        "",

        opaque_p("obj", ""),
        opaque_p("collider", "")
    )

    void(
        "MultiBody_setBaseInertia",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("inertia", "")
    )

    void(
        "MultiBody_setBaseMass",
        "",

        opaque_p("obj", ""),
        btScalar("mass", "")
    )

    void(
        "MultiBody_setBaseName",
        "",

        opaque_p("obj", ""),
        charUTF8.const.p("name", "")
    )

    void(
        "MultiBody_setBaseOmega",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("omega", "")
    )

    void(
        "MultiBody_setBasePos",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("pos", "")
    )

    void(
        "MultiBody_setBaseVel",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("vel", "")
    )

    void(
        "MultiBody_setBaseWorldTransform",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("tr", "")
    )

    void(
        "MultiBody_setCanSleep",
        "",

        opaque_p("obj", ""),
        bool("canSleep", "")
    )

    void(
        "MultiBody_setCompanionId",
        "",

        opaque_p("obj", ""),
        int("id", "")
    )

    void(
        "MultiBody_setFixedBase",
        "",

        opaque_p("obj", ""),
        bool("fixedBase", "")
    )

    void(
        "MultiBody_setHasSelfCollision",
        "",

        opaque_p("obj", ""),
        bool("hasSelfCollision", "")
    )

    void(
        "MultiBody_setJointPos",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btScalar("q", "")
    )

    void(
        "MultiBody_setJointPosMultiDof",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        Unsafe..btScalar.p("q", "")
    )

    void(
        "MultiBody_setJointVel",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btScalar("qdot", "")
    )

    void(
        "MultiBody_setJointVelMultiDof",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        Unsafe..btScalar.p("qdot", "")
    )

    void(
        "MultiBody_setLinearDamping",
        "",

        opaque_p("obj", ""),
        btScalar("damp", "")
    )

    void(
        "MultiBody_setMaxAppliedImpulse",
        "",

        opaque_p("obj", ""),
        btScalar("maxImp", "")
    )

    void(
        "MultiBody_setMaxCoordinateVelocity",
        "",

        opaque_p("obj", ""),
        btScalar("maxVel", "")
    )

    void(
        "MultiBody_setNumLinks",
        "",

        opaque_p("obj", ""),
        int("numLinks", "")
    )

    void(
        "MultiBody_setPosUpdated",
        "",

        opaque_p("obj", ""),
        bool("updated", "")
    )

    void(
        "MultiBody_setupFixed",
        "",

        opaque_p("obj", ""),
        int("linkIndex", ""),
        btScalar("mass", ""),
        btVector3.const.p("inertia", ""),
        int("parent", ""),
        btQuaternion.const.p("rotParentToThis", ""),
        btVector3.const.p("parentComToThisPivotOffset", ""),
        btVector3.const.p("thisPivotToThisComOffset", ""),
        bool("deprecatedDisableParentCollision", "")
    )

    void(
        "MultiBody_setupPlanar",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btScalar("mass", ""),
        btVector3.const.p("inertia", ""),
        int("parent", ""),
        btQuaternion.const.p("rotParentToThis", ""),
        btVector3.const.p("rotationAxis", ""),
        btVector3.const.p("parentComToThisComOffset", ""),
        bool("disableParentCollision", "")
    )

    void(
        "MultiBody_setupPrismatic",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btScalar("mass", ""),
        btVector3.const.p("inertia", ""),
        int("parent", ""),
        btQuaternion.const.p("rotParentToThis", ""),
        btVector3.const.p("jointAxis", ""),
        btVector3.const.p("parentComToThisPivotOffset", ""),
        btVector3.const.p("thisPivotToThisComOffset", ""),
        bool("disableParentCollision", "")
    )

    void(
        "MultiBody_setupRevolute",
        "",

        opaque_p("obj", ""),
        int("linkIndex", ""),
        btScalar("mass", ""),
        btVector3.const.p("inertia", ""),
        int("parentIndex", ""),
        btQuaternion.const.p("rotParentToThis", ""),
        btVector3.const.p("jointAxis", ""),
        btVector3.const.p("parentComToThisPivotOffset", ""),
        btVector3.const.p("thisPivotToThisComOffset", ""),
        bool("disableParentCollision", "")
    )

    void(
        "MultiBody_setupSpherical",
        "",

        opaque_p("obj", ""),
        int("linkIndex", ""),
        btScalar("mass", ""),
        btVector3.const.p("inertia", ""),
        int("parent", ""),
        btQuaternion.const.p("rotParentToThis", ""),
        btVector3.const.p("parentComToThisPivotOffset", ""),
        btVector3.const.p("thisPivotToThisComOffset", ""),
        bool("disableParentCollision", "")
    )

    void(
        "MultiBody_setUseGyroTerm",
        "",

        opaque_p("obj", ""),
        bool("useGyro", "")
    )

    void(
        "MultiBody_setUserIndex",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    void(
        "MultiBody_setUserIndex2",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    void(
        "MultiBody_setUserPointer",
        "",

        opaque_p("obj", ""),
        opaque_p("userPointer", "")
    )

    void(
        "MultiBody_setWorldToBaseRot",
        "",

        opaque_p("obj", ""),
        btQuaternion.const.p("rot", "")
    )

    void(
        "MultiBody_stepPositionsMultiDof",
        "",

        opaque_p("obj", ""),
        btScalar("dt", ""),
        Unsafe..btScalar.p("pq", ""),
        Unsafe..btScalar.p("pqd", "")
    )

    void(
        "MultiBody_updateCollisionObjectWorldTransforms",
        "",

        opaque_p("obj", ""),
        opaque_p("scratch_q", ""),
        opaque_p("scratch_m", "")
    )

    void(
        "MultiBody_useGlobalVelocities",
        "",

        opaque_p("obj", ""),
        bool("use", "")
    )

    void(
        "MultiBody_useRK4Integration",
        "",

        opaque_p("obj", ""),
        bool("use", "")
    )

    void(
        "MultiBody_wakeUp",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultiBody_worldDirToLocal",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btVector3.const.p("vec", ""),
        btVector3.p("value", "")
    )

    void(
        "MultiBody_worldPosToLocal",
        "",

        opaque_p("obj", ""),
        int("i", ""),
        btVector3.const.p("vec", ""),
        btVector3.p("value", "")
    )

    void(
        "MultiBody_delete",
        "",

        opaque_p("obj", "")
    )

}
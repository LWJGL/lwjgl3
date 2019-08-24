/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btMultiBodyLink = "BTMultiBodyLink".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "MultibodyLink_getAbsFrameLocVelocity",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "MultibodyLink_getAbsFrameTotVelocity",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultibodyLink_getAppliedConstraintForce",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "MultibodyLink_getAppliedConstraintTorque",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "MultibodyLink_getAppliedForce",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "MultibodyLink_getAppliedTorque",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p(
        "MultibodyLink_getAxes",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultibodyLink_getAxisBottom",
        "",

        opaque_p("obj", ""),
        int("dof", ""),
        btVector3.p("value", "")
    )

    void(
        "MultibodyLink_getAxisTop",
        "",

        opaque_p("obj", ""),
        int("dof", ""),
        btVector3.p("value", "")
    )

    void(
        "MultibodyLink_getCachedRotParentToThis",
        "",

        opaque_p("obj", ""),
        btQuaternion.p("value", "")
    )

    void(
        "MultibodyLink_getCachedRVector",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "MultibodyLink_getCachedWorldTransform",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    int(
        "MultibodyLink_getCfgOffset",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "MultibodyLink_getCollider",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultibodyLink_getDofCount",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultibodyLink_getDofOffset",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultibodyLink_getDVector",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "MultibodyLink_getEVector",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    int(
        "MultibodyLink_getFlags",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultibodyLink_getInertiaLocal",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "MultibodyLink_getJointDamping",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "MultibodyLink_getJointFeedback",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "MultibodyLink_getJointFriction",
        "",

        opaque_p("obj", "")
    )

    charUTF8.const.p(
        "MultibodyLink_getJointName",
        "",

        opaque_p("obj", "")
    )

    btScalar[7](
        "MultibodyLink_getJointPos",
        "",

        opaque_p("obj", "")
    )

    btScalar[6](
        "MultibodyLink_getJointTorque",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultibodyLink_getJointType",
        "",

        opaque_p("obj", "")
    )

    charUTF8.const.p(
        "MultibodyLink_getLinkName",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "MultibodyLink_getMass",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultibodyLink_getParent",
        "",

        opaque_p("obj", "")
    )

    int(
        "MultibodyLink_getPosVarCount",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultibodyLink_getZeroRotParentToThis",
        "",

        opaque_p("obj", ""),
        btQuaternion.p("value", "")
    )

    opaque_p(
        "MultibodyLink_getUserPtr",
        "",

        opaque_p("obj", "")
    )

    void(
        "MultibodyLink_setAppliedConstraintForce",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "MultibodyLink_setAppliedConstraintTorque",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "MultibodyLink_setAppliedForce",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "MultibodyLink_setAppliedTorque",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "MultibodyLink_setAxisBottom",
        "",

        opaque_p("obj", ""),
        int("dof", ""),
        btScalar("x", ""),
        btScalar("y", ""),
        btScalar("z", "")
    )

    void(
        "MultibodyLink_setAxisBottom2",
        "",

        opaque_p("obj", ""),
        int("dof", ""),
        btVector3.const.p("axis", "")
    )

    void(
        "MultibodyLink_setAxisTop",
        "",

        opaque_p("obj", ""),
        int("dof", ""),
        btScalar("x", ""),
        btScalar("y", ""),
        btScalar("z", "")
    )

    void(
        "MultibodyLink_setAxisTop2",
        "",

        opaque_p("obj", ""),
        int("dof", ""),
        btVector3.const.p("axis", "")
    )

    void(
        "MultibodyLink_setCachedRotParentToThis",
        "",

        opaque_p("obj", ""),
        btQuaternion.const.p("value", "")
    )

    void(
        "MultibodyLink_setCachedRVector",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "MultibodyLink_setCachedWorldTransform",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("value", "")
    )

    void(
        "MultibodyLink_setCfgOffset",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MultibodyLink_setCollider",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "MultibodyLink_setDofCount",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MultibodyLink_setDofOffset",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MultibodyLink_setDVector",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "MultibodyLink_setEVector",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "MultibodyLink_setFlags",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MultibodyLink_setInertiaLocal",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "MultibodyLink_setJointDamping",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "MultibodyLink_setJointFeedback",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "MultibodyLink_setJointFriction",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "MultibodyLink_setJointName",
        "",

        opaque_p("obj", ""),
        charUTF8.const.p("value", "")
    )

    void(
        "MultibodyLink_setJointType",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MultibodyLink_setLinkName",
        "",

        opaque_p("obj", ""),
        charUTF8.const.p("value", "")
    )

    void(
        "MultibodyLink_setMass",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "MultibodyLink_setParent",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MultibodyLink_setPosVarCount",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "MultibodyLink_setZeroRotParentToThis",
        "",

        opaque_p("obj", ""),
        btQuaternion.const.p("value", "")
    )

    void(
        "MultibodyLink_setUserPtr",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "MultibodyLink_updateCacheMultiDof",
        "",

        opaque_p("obj", ""),
        Unsafe..btScalar.p("pq", "")
    )

}
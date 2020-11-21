/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package bullet.templates

import bullet.*
import org.lwjgl.generator.*

val btSoftBody = "BTSoftBody".nativeClass(Module.BULLET, prefixMethod = "bt", binding = BULLET_BINDING_DELEGATE) {
    opaque_p(
        "SoftBodyWorldInfo_new",
        "",

        void()
    )

    btScalar(
        "SoftBodyWorldInfo_getAir_density",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBodyWorldInfo_getBroadphase",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBodyWorldInfo_getDispatcher",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBodyWorldInfo_getGravity",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "SoftBodyWorldInfo_getMaxDisplacement",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBodyWorldInfo_getSparsesdf",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBodyWorldInfo_getWater_density",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBodyWorldInfo_getWater_normal",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "SoftBodyWorldInfo_getWater_offset",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBodyWorldInfo_setAir_density",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBodyWorldInfo_setBroadphase",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "SoftBodyWorldInfo_setDispatcher",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "SoftBodyWorldInfo_setGravity",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBodyWorldInfo_setMaxDisplacement",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBodyWorldInfo_setWater_density",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBodyWorldInfo_setWater_normal",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBodyWorldInfo_setWater_offset",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBodyWorldInfo_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_AJoint_IControlWrapper_new",
        "",

        p_btSoftBody_AJoint_IControl_Prepare("PrepareCallback", ""),
        p_btSoftBody_AJoint_IControl_Speed("SpeedCallback", "")
    )

    opaque_p(
        "SoftBody_AJoint_IControlWrapper_getWrapperData",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_AJoint_IControlWrapper_setWrapperData",
        "",

        opaque_p("obj", ""),
        opaque_p("data", "")
    )

    opaque_p(
        "SoftBody_AJoint_IControl_new",
        "",

        void()
    )

    opaque_p(
        "SoftBody_AJoint_IControl_Default",
        "",

        void()
    )

    void(
        "SoftBody_AJoint_IControl_Prepare",
        "",

        opaque_p("obj", ""),
        opaque_p("__unnamed0", "")
    )

    btScalar(
        "SoftBody_AJoint_IControl_Speed",
        "",

        opaque_p("obj", ""),
        opaque_p("__unnamed0", ""),
        btScalar("current", "")
    )

    void(
        "SoftBody_AJoint_IControl_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_AJoint_Specs_new",
        "",

        void()
    )

    void(
        "SoftBody_AJoint_Specs_getAxis",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p(
        "SoftBody_AJoint_Specs_getIcontrol",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_AJoint_Specs_setAxis",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_AJoint_Specs_setIcontrol",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    btVector3.p(
        "SoftBody_AJoint_getAxis",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_AJoint_getIcontrol",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_AJoint_setIcontrol",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    opaque_p(
        "SoftBody_Anchor_getBody",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Anchor_getC0",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.p("value", "")
    )

    void(
        "SoftBody_Anchor_getC1",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "SoftBody_Anchor_getC2",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Anchor_getInfluence",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Anchor_getLocal",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p(
        "SoftBody_Anchor_getNode",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Anchor_setBody",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "SoftBody_Anchor_setC0",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.const.p("value", "")
    )

    void(
        "SoftBody_Anchor_setC1",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_Anchor_setC2",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Anchor_setInfluence",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Anchor_setLocal",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_Anchor_setNode",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    opaque_p(
        "SoftBody_Body_new",
        "",

        void()
    )

    opaque_p(
        "SoftBody_Body_new2",
        "",

        opaque_p("colObj", "")
    )

    opaque_p(
        "SoftBody_Body_new3",
        "",

        opaque_p("p", "")
    )

    void(
        "SoftBody_Body_activate",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Body_angularVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("rpos", ""),
        btVector3.p("value", "")
    )

    void(
        "SoftBody_Body_angularVelocity2",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "SoftBody_Body_applyAImpulse",
        "",

        opaque_p("obj", ""),
        opaque_p("impulse", "")
    )

    void(
        "SoftBody_Body_applyDAImpulse",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("impulse", "")
    )

    void(
        "SoftBody_Body_applyDCImpulse",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("impulse", "")
    )

    void(
        "SoftBody_Body_applyDImpulse",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("impulse", ""),
        btVector3.const.p("rpos", "")
    )

    void(
        "SoftBody_Body_applyImpulse",
        "",

        opaque_p("obj", ""),
        opaque_p("impulse", ""),
        btVector3.const.p("rpos", "")
    )

    void(
        "SoftBody_Body_applyVAImpulse",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("impulse", "")
    )

    void(
        "SoftBody_Body_applyVImpulse",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("impulse", ""),
        btVector3.const.p("rpos", "")
    )

    opaque_p(
        "SoftBody_Body_getCollisionObject",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_Body_getRigid",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_Body_getSoft",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Body_invMass",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Body_invWorldInertia",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.p("value", "")
    )

    void(
        "SoftBody_Body_linearVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "SoftBody_Body_setCollisionObject",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "SoftBody_Body_setRigid",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "SoftBody_Body_setSoft",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "SoftBody_Body_velocity",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("rpos", ""),
        btVector3.p("value", "")
    )

    void(
        "SoftBody_Body_xform",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    void(
        "SoftBody_Body_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_Body_array_at",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    btScalar(
        "SoftBody_CJoint_getFriction",
        "",

        opaque_p("obj", "")
    )

    int(
        "SoftBody_CJoint_getLife",
        "",

        opaque_p("obj", "")
    )

    int(
        "SoftBody_CJoint_getMaxlife",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_CJoint_getNormal",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btVector3.p(
        "SoftBody_CJoint_getRpos",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_CJoint_setFriction",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_CJoint_setLife",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "SoftBody_CJoint_setMaxlife",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "SoftBody_CJoint_setNormal",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    btScalar(
        "SoftBody_Cluster_getAdamping",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Cluster_getAv",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    int(
        "SoftBody_Cluster_getClusterIndex",
        "",

        opaque_p("obj", "")
    )

    bool(
        "SoftBody_Cluster_getCollide",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Cluster_getCom",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    bool(
        "SoftBody_Cluster_getContainsAnchor",
        "",

        opaque_p("obj", "")
    )

    btVector3[2](
        "SoftBody_Cluster_getDimpulses",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Cluster_getFramexform",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    btScalar(
        "SoftBody_Cluster_getIdmass",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Cluster_getImass",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Cluster_getInvwi",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.p("value", "")
    )

    btScalar(
        "SoftBody_Cluster_getLdamping",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_Cluster_getLeaf",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Cluster_getLocii",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.p("value", "")
    )

    void(
        "SoftBody_Cluster_getLv",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p(
        "SoftBody_Cluster_getMasses",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Cluster_getMatching",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Cluster_getMaxSelfCollisionImpulse",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Cluster_getNdamping",
        "",

        opaque_p("obj", "")
    )

    int(
        "SoftBody_Cluster_getNdimpulses",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_Cluster_getNodes",
        "",

        opaque_p("obj", "")
    )

    int(
        "SoftBody_Cluster_getNvimpulses",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Cluster_getSelfCollisionImpulseFactor",
        "",

        opaque_p("obj", "")
    )

    btVector3[2](
        "SoftBody_Cluster_getVimpulses",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Cluster_setAdamping",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Cluster_setAv",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_Cluster_setClusterIndex",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "SoftBody_Cluster_setCollide",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "SoftBody_Cluster_setCom",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_Cluster_setContainsAnchor",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "SoftBody_Cluster_setFramexform",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("value", "")
    )

    void(
        "SoftBody_Cluster_setIdmass",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Cluster_setImass",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Cluster_setInvwi",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.const.p("value", "")
    )

    void(
        "SoftBody_Cluster_setLdamping",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Cluster_setLeaf",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "SoftBody_Cluster_setLocii",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.const.p("value", "")
    )

    void(
        "SoftBody_Cluster_setLv",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_Cluster_setMatching",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Cluster_setMaxSelfCollisionImpulse",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Cluster_setNdamping",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Cluster_setNdimpulses",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "SoftBody_Cluster_setNvimpulses",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "SoftBody_Cluster_setSelfCollisionImpulseFactor",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    int(
        "SoftBody_Config_getAeromodel",
        "",

        opaque_p("obj", "")
    )

    int(
        "SoftBody_Config_getCiterations",
        "",

        opaque_p("obj", "")
    )

    int(
        "SoftBody_Config_getCollisions",
        "",

        opaque_p("obj", "")
    )

    int(
        "SoftBody_Config_getDiterations",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_Config_getDsequence",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Config_getKAHR",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Config_getKCHR",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Config_getKDF",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Config_getKDG",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Config_getKDP",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Config_getKKHR",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Config_getKLF",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Config_getKMT",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Config_getKPR",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Config_getKSHR",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Config_getKSK_SPLT_CL",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Config_getKSKHR_CL",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Config_getKSR_SPLT_CL",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Config_getKSRHR_CL",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Config_getKSS_SPLT_CL",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Config_getKSSHR_CL",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Config_getKVC",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Config_getKVCF",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Config_getMaxvolume",
        "",

        opaque_p("obj", "")
    )

    int(
        "SoftBody_Config_getPiterations",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_Config_getPsequence",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Config_getTimescale",
        "",

        opaque_p("obj", "")
    )

    int(
        "SoftBody_Config_getViterations",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_Config_getVsequence",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Config_setAeromodel",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "SoftBody_Config_setCiterations",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "SoftBody_Config_setCollisions",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "SoftBody_Config_setDiterations",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "SoftBody_Config_setKAHR",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Config_setKCHR",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Config_setKDF",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Config_setKDG",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Config_setKDP",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Config_setKKHR",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Config_setKLF",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Config_setKMT",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Config_setKPR",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Config_setKSHR",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Config_setKSK_SPLT_CL",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Config_setKSKHR_CL",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Config_setKSR_SPLT_CL",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Config_setKSRHR_CL",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Config_setKSS_SPLT_CL",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Config_setKSSHR_CL",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Config_setKVC",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Config_setKVCF",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Config_setMaxvolume",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Config_setPiterations",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "SoftBody_Config_setTimescale",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Config_setViterations",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    opaque_p(
        "SoftBody_Element_getTag",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Element_setTag",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "SoftBody_Element_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_Face_getLeaf",
        "",

        opaque_p("obj", "")
    )

    opaque_p[3](
        "SoftBody_Face_getN",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Face_getNormal",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "SoftBody_Face_getRa",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Face_setLeaf",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "SoftBody_Face_setNormal",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_Face_setRa",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    opaque_p(
        "SoftBody_Feature_getMaterial",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Feature_setMaterial",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    opaque_p(
        "SoftBody_ImplicitFnWrapper_new",
        "",

        p_btSoftBody_ImplicitFn_Eval("EvalCallback", "")
    )

    btScalar(
        "SoftBody_ImplicitFn_Eval",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("x", "")
    )

    void(
        "SoftBody_ImplicitFn_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_Impulse_new",
        "",

        void()
    )

    int(
        "SoftBody_Impulse_getAsDrift",
        "",

        opaque_p("obj", "")
    )

    int(
        "SoftBody_Impulse_getAsVelocity",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Impulse_getDrift",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "SoftBody_Impulse_getVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p(
        "SoftBody_Impulse_operator_n",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_Impulse_operator_m",
        "",

        opaque_p("obj", ""),
        btScalar("x", "")
    )

    void(
        "SoftBody_Impulse_setAsDrift",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "SoftBody_Impulse_setAsVelocity",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "SoftBody_Impulse_setDrift",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_Impulse_setVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_Impulse_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_Joint_Specs_new",
        "",

        void()
    )

    btScalar(
        "SoftBody_Joint_Specs_getCfm",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Joint_Specs_getErp",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Joint_Specs_getSplit",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Joint_Specs_setCfm",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Joint_Specs_setErp",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Joint_Specs_setSplit",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Joint_Specs_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_Joint_getBodies",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Joint_getCfm",
        "",

        opaque_p("obj", "")
    )

    bool(
        "SoftBody_Joint_getDelete",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Joint_getDrift",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "SoftBody_Joint_getErp",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Joint_getMassmatrix",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.p("value", "")
    )

    btVector3.p(
        "SoftBody_Joint_getRefs",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Joint_getSdrift",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "SoftBody_Joint_getSplit",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Joint_Prepare",
        "",

        opaque_p("obj", ""),
        btScalar("dt", ""),
        int("iterations", "")
    )

    void(
        "SoftBody_Joint_setCfm",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Joint_setDelete",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "SoftBody_Joint_setDrift",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_Joint_setErp",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Joint_setMassmatrix",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.const.p("value", "")
    )

    void(
        "SoftBody_Joint_setSdrift",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_Joint_setSplit",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Joint_Solve",
        "",

        opaque_p("obj", ""),
        btScalar("dt", ""),
        btScalar("sor", "")
    )

    void(
        "SoftBody_Joint_Terminate",
        "",

        opaque_p("obj", ""),
        btScalar("dt", "")
    )

    void(
        "SoftBody_Joint_Type",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Joint_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_Link_new",
        "",

        void()
    )

    opaque_p(
        "SoftBody_Link_new2",
        "",

        opaque_p("obj", "")
    )

    int(
        "SoftBody_Link_getBbending",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Link_getC0",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Link_getC1",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Link_getC2",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Link_getC3",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    opaque_p[2](
        "SoftBody_Link_getN",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Link_getRl",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Link_setBbending",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "SoftBody_Link_setC0",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Link_setC1",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Link_setC2",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Link_setC3",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_Link_setRl",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Link_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_LJoint_Specs_new",
        "",

        void()
    )

    void(
        "SoftBody_LJoint_Specs_getPosition",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "SoftBody_LJoint_Specs_setPosition",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    btVector3.p(
        "SoftBody_LJoint_getRpos",
        "",

        opaque_p("obj", "")
    )

    int(
        "SoftBody_Material_getFlags",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Material_getKAST",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Material_getKLST",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Material_getKVST",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Material_setFlags",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "SoftBody_Material_setKAST",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Material_setKLST",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Material_setKVST",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    btScalar(
        "SoftBody_Node_getArea",
        "",

        opaque_p("obj", "")
    )

    int(
        "SoftBody_Node_getBattach",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Node_getF",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "SoftBody_Node_getIm",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_Node_getLeaf",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Node_getN",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "SoftBody_Node_getQ",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "SoftBody_Node_getV",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "SoftBody_Node_getX",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "SoftBody_Node_setArea",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Node_setBattach",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "SoftBody_Node_setF",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_Node_setIm",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Node_setLeaf",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "SoftBody_Node_setN",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_Node_setQ",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_Node_setV",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_Node_setX",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    btScalar[4](
        "SoftBody_Note_getCoords",
        "",

        opaque_p("obj", "")
    )

    opaque_p[4](
        "SoftBody_Note_getNodes",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Note_getOffset",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    int(
        "SoftBody_Note_getRank",
        "",

        opaque_p("obj", "")
    )

    charUTF8.const.p(
        "SoftBody_Note_getText",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Note_setOffset",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_Note_setRank",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "SoftBody_Note_setText",
        "",

        opaque_p("obj", ""),
        charUTF8.const.p("value", "")
    )

    void(
        "SoftBody_Pose_getAqq",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.p("value", "")
    )

    bool(
        "SoftBody_Pose_getBframe",
        "",

        opaque_p("obj", "")
    )

    bool(
        "SoftBody_Pose_getBvolume",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Pose_getCom",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "SoftBody_Pose_getRot",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.p("value", "")
    )

    void(
        "SoftBody_Pose_getScl",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.p("value", "")
    )

    opaque_p(
        "SoftBody_Pose_getWgh",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Pose_getVolume",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Pose_setAqq",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.const.p("value", "")
    )

    void(
        "SoftBody_Pose_setBframe",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "SoftBody_Pose_setBvolume",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )

    void(
        "SoftBody_Pose_setCom",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_Pose_setRot",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.const.p("value", "")
    )

    void(
        "SoftBody_Pose_setScl",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.const.p("value", "")
    )

    void(
        "SoftBody_Pose_setVolume",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    opaque_p(
        "SoftBody_RayFromToCaster_new",
        "",

        btVector3.const.p("rayFrom", ""),
        btVector3.const.p("rayTo", ""),
        btScalar("mxt", "")
    )

    opaque_p(
        "SoftBody_RayFromToCaster_getFace",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_RayFromToCaster_getMint",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_RayFromToCaster_getRayFrom",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "SoftBody_RayFromToCaster_getRayNormalizedDirection",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "SoftBody_RayFromToCaster_getRayTo",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    int(
        "SoftBody_RayFromToCaster_getTests",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_RayFromToCaster_rayFromToTriangle",
        "",

        btVector3.const.p("rayFrom", ""),
        btVector3.const.p("rayTo", ""),
        btVector3.const.p("rayNormalizedDirection", ""),
        btVector3.const.p("a", ""),
        btVector3.const.p("b", ""),
        btVector3.const.p("c", "")
    )

    btScalar(
        "SoftBody_RayFromToCaster_rayFromToTriangle2",
        "",

        btVector3.const.p("rayFrom", ""),
        btVector3.const.p("rayTo", ""),
        btVector3.const.p("rayNormalizedDirection", ""),
        btVector3.const.p("a", ""),
        btVector3.const.p("b", ""),
        btVector3.const.p("c", ""),
        btScalar("maxt", "")
    )

    void(
        "SoftBody_RayFromToCaster_setFace",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "SoftBody_RayFromToCaster_setMint",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_RayFromToCaster_setRayFrom",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_RayFromToCaster_setRayNormalizedDirection",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_RayFromToCaster_setRayTo",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_RayFromToCaster_setTests",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    opaque_p(
        "SoftBody_RContact_new",
        "",

        void()
    )

    void(
        "SoftBody_RContact_getC0",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.p("value", "")
    )

    void(
        "SoftBody_RContact_getC1",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "SoftBody_RContact_getC2",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_RContact_getC3",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_RContact_getC4",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_RContact_getCti",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_RContact_getNode",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_RContact_setC0",
        "",

        opaque_p("obj", ""),
        btMatrix3x3.const.p("value", "")
    )

    void(
        "SoftBody_RContact_setC1",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_RContact_setC2",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_RContact_setC3",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_RContact_setC4",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_RContact_setNode",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "SoftBody_RContact_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_SContact_new",
        "",

        void()
    )

    btScalar[2](
        "SoftBody_SContact_getCfm",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_SContact_getFace",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_SContact_getFriction",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_SContact_getMargin",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_SContact_getNode",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_SContact_getNormal",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "SoftBody_SContact_getWeights",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    void(
        "SoftBody_SContact_setFace",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "SoftBody_SContact_setFriction",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_SContact_setMargin",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_SContact_setNode",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "SoftBody_SContact_setNormal",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_SContact_setWeights",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_SContact_delete",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_sCti_new",
        "",

        void()
    )

    opaque_p(
        "SoftBody_sCti_getColObj",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_sCti_getNormal",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    btScalar(
        "SoftBody_sCti_getOffset",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_sCti_setColObj",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "SoftBody_sCti_setNormal",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("value", "")
    )

    void(
        "SoftBody_sCti_setOffset",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_sCti_delete",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_SolverState_getIsdt",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_SolverState_getRadmrg",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_SolverState_getSdt",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_SolverState_getUpdmrg",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_SolverState_getVelmrg",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_SolverState_setIsdt",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_SolverState_setRadmrg",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_SolverState_setSdt",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_SolverState_setUpdmrg",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_SolverState_setVelmrg",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    opaque_p(
        "SoftBody_sRayCast_new",
        "",

        void()
    )

    opaque_p(
        "SoftBody_sRayCast_getBody",
        "",

        opaque_p("obj", "")
    )

    int(
        "SoftBody_sRayCast_getFeature",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_sRayCast_getFraction",
        "",

        opaque_p("obj", "")
    )

    int(
        "SoftBody_sRayCast_getIndex",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_sRayCast_setBody",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "SoftBody_sRayCast_setFeature",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "SoftBody_sRayCast_setFraction",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_sRayCast_setIndex",
        "",

        opaque_p("obj", ""),
        int("value", "")
    )

    void(
        "SoftBody_sRayCast_delete",
        "",

        opaque_p("obj", "")
    )

    btVector3[4](
        "SoftBody_Tetra_getC0",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Tetra_getC1",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Tetra_getC2",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_Tetra_getLeaf",
        "",

        opaque_p("obj", "")
    )

    opaque_p[4](
        "SoftBody_Tetra_getN",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_Tetra_getRv",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_Tetra_setC1",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Tetra_setC2",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_Tetra_setLeaf",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "SoftBody_Tetra_setRv",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    opaque_p(
        "SoftBody_new",
        "",

        opaque_p("worldInfo", ""),
        AutoSize(3, "x")..int("node_count", ""),
        btScalar.const.p("x", ""),
        Unsafe..btScalar.const.p("m", "")
    )

    opaque_p(
        "SoftBody_new2",
        "",

        opaque_p("worldInfo", "")
    )

    void(
        "SoftBody_addAeroForceToFace",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("windVelocity", ""),
        int("faceIndex", "")
    )

    void(
        "SoftBody_addAeroForceToNode",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("windVelocity", ""),
        int("nodeIndex", "")
    )

    void(
        "SoftBody_addForce",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("force", "")
    )

    void(
        "SoftBody_addForce2",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("force", ""),
        int("node", "")
    )

    void(
        "SoftBody_addVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("velocity", "")
    )

    void(
        "SoftBody_addVelocity2",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("velocity", ""),
        int("node", "")
    )

    void(
        "SoftBody_appendAnchor",
        "",

        opaque_p("obj", ""),
        int("node", ""),
        opaque_p("body", ""),
        btVector3.const.p("localPivot", ""),
        bool("disableCollisionBetweenLinkedBodies", ""),
        btScalar("influence", "")
    )

    void(
        "SoftBody_appendAnchor2",
        "",

        opaque_p("obj", ""),
        int("node", ""),
        opaque_p("body", ""),
        bool("disableCollisionBetweenLinkedBodies", ""),
        btScalar("influence", "")
    )

    void(
        "SoftBody_appendAngularJoint",
        "",

        opaque_p("obj", ""),
        opaque_p("specs", "")
    )

    void(
        "SoftBody_appendAngularJoint2",
        "",

        opaque_p("obj", ""),
        opaque_p("specs", ""),
        opaque_p("body", "")
    )

    void(
        "SoftBody_appendAngularJoint3",
        "",

        opaque_p("obj", ""),
        opaque_p("specs", ""),
        opaque_p("body", "")
    )

    void(
        "SoftBody_appendAngularJoint4",
        "",

        opaque_p("obj", ""),
        opaque_p("specs", ""),
        opaque_p("body0", ""),
        opaque_p("body1", "")
    )

    void(
        "SoftBody_appendFace",
        "",

        opaque_p("obj", ""),
        int("model", ""),
        opaque_p("mat", "")
    )

    void(
        "SoftBody_appendFace2",
        "",

        opaque_p("obj", ""),
        int("node0", ""),
        int("node1", ""),
        int("node2", ""),
        opaque_p("mat", "")
    )

    void(
        "SoftBody_appendLinearJoint",
        "",

        opaque_p("obj", ""),
        opaque_p("specs", ""),
        opaque_p("body", "")
    )

    void(
        "SoftBody_appendLinearJoint2",
        "",

        opaque_p("obj", ""),
        opaque_p("specs", "")
    )

    void(
        "SoftBody_appendLinearJoint3",
        "",

        opaque_p("obj", ""),
        opaque_p("specs", ""),
        opaque_p("body", "")
    )

    void(
        "SoftBody_appendLinearJoint4",
        "",

        opaque_p("obj", ""),
        opaque_p("specs", ""),
        opaque_p("body0", ""),
        opaque_p("body1", "")
    )

    void(
        "SoftBody_appendLink",
        "",

        opaque_p("obj", ""),
        int("node0", ""),
        int("node1", ""),
        opaque_p("mat", ""),
        bool("bcheckexist", "")
    )

    void(
        "SoftBody_appendLink2",
        "",

        opaque_p("obj", ""),
        int("model", ""),
        opaque_p("mat", "")
    )

    void(
        "SoftBody_appendLink3",
        "",

        opaque_p("obj", ""),
        opaque_p("node0", ""),
        opaque_p("node1", ""),
        opaque_p("mat", ""),
        bool("bcheckexist", "")
    )

    opaque_p(
        "SoftBody_appendMaterial",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_appendNode",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("x", ""),
        btScalar("m", "")
    )

    void(
        "SoftBody_appendNote",
        "",

        opaque_p("obj", ""),
        charUTF8.const.p("text", ""),
        btVector3.const.p("o", ""),
        opaque_p("feature", "")
    )

    void(
        "SoftBody_appendNote2",
        "",

        opaque_p("obj", ""),
        charUTF8.const.p("text", ""),
        btVector3.const.p("o", ""),
        opaque_p("feature", "")
    )

    void(
        "SoftBody_appendNote3",
        "",

        opaque_p("obj", ""),
        charUTF8.const.p("text", ""),
        btVector3.const.p("o", ""),
        opaque_p("feature", "")
    )

    void(
        "SoftBody_appendNote4",
        "",

        opaque_p("obj", ""),
        charUTF8.const.p("text", ""),
        btVector3.const.p("o", "")
    )

    void(
        "SoftBody_appendNote5",
        "",

        opaque_p("obj", ""),
        charUTF8.const.p("text", ""),
        btVector3.const.p("o", ""),
        btVector4.const.p("c", ""),
        opaque_p("n0", ""),
        opaque_p("n1", ""),
        opaque_p("n2", ""),
        opaque_p("n3", "")
    )

    void(
        "SoftBody_appendTetra",
        "",

        opaque_p("obj", ""),
        int("model", ""),
        opaque_p("mat", "")
    )

    void(
        "SoftBody_appendTetra2",
        "",

        opaque_p("obj", ""),
        int("node0", ""),
        int("node1", ""),
        int("node2", ""),
        int("node3", ""),
        opaque_p("mat", "")
    )

    void(
        "SoftBody_applyClusters",
        "",

        opaque_p("obj", ""),
        bool("drift", "")
    )

    void(
        "SoftBody_applyForces",
        "",

        opaque_p("obj", "")
    )

    bool(
        "SoftBody_checkContact",
        "",

        opaque_p("obj", ""),
        opaque_p("colObjWrap", ""),
        btVector3.const.p("x", ""),
        btScalar("margin", ""),
        opaque_p("cti", "")
    )

    bool(
        "SoftBody_checkFace",
        "",

        opaque_p("obj", ""),
        int("node0", ""),
        int("node1", ""),
        int("node2", "")
    )

    bool(
        "SoftBody_checkLink",
        "",

        opaque_p("obj", ""),
        opaque_p("node0", ""),
        opaque_p("node1", "")
    )

    bool(
        "SoftBody_checkLink2",
        "",

        opaque_p("obj", ""),
        int("node0", ""),
        int("node1", "")
    )

    void(
        "SoftBody_cleanupClusters",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_clusterAImpulse",
        "",

        opaque_p("cluster", ""),
        opaque_p("impulse", "")
    )

    void(
        "SoftBody_clusterCom",
        "",

        opaque_p("obj", ""),
        int("cluster", ""),
        btVector3.p("value", "")
    )

    void(
        "SoftBody_clusterCom2",
        "",

        opaque_p("cluster", ""),
        btVector3.p("value", "")
    )

    int(
        "SoftBody_clusterCount",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_clusterDAImpulse",
        "",

        opaque_p("cluster", ""),
        btVector3.const.p("impulse", "")
    )

    void(
        "SoftBody_clusterDCImpulse",
        "",

        opaque_p("cluster", ""),
        btVector3.const.p("impulse", "")
    )

    void(
        "SoftBody_clusterDImpulse",
        "",

        opaque_p("cluster", ""),
        btVector3.const.p("rpos", ""),
        btVector3.const.p("impulse", "")
    )

    void(
        "SoftBody_clusterImpulse",
        "",

        opaque_p("cluster", ""),
        btVector3.const.p("rpos", ""),
        opaque_p("impulse", "")
    )

    void(
        "SoftBody_clusterVAImpulse",
        "",

        opaque_p("cluster", ""),
        btVector3.const.p("impulse", "")
    )

    void(
        "SoftBody_clusterVelocity",
        "",

        opaque_p("cluster", ""),
        btVector3.const.p("rpos", ""),
        btVector3.p("value", "")
    )

    void(
        "SoftBody_clusterVImpulse",
        "",

        opaque_p("cluster", ""),
        btVector3.const.p("rpos", ""),
        btVector3.const.p("impulse", "")
    )

    bool(
        "SoftBody_cutLink",
        "",

        opaque_p("obj", ""),
        opaque_p("node0", ""),
        opaque_p("node1", ""),
        btScalar("position", "")
    )

    bool(
        "SoftBody_cutLink2",
        "",

        opaque_p("obj", ""),
        int("node0", ""),
        int("node1", ""),
        btScalar("position", "")
    )

    void(
        "SoftBody_dampClusters",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_defaultCollisionHandler",
        "",

        opaque_p("obj", ""),
        opaque_p("pcoWrap", "")
    )

    void(
        "SoftBody_defaultCollisionHandler2",
        "",

        opaque_p("obj", ""),
        opaque_p("psb", "")
    )

    void(
        "SoftBody_evaluateCom",
        "",

        opaque_p("obj", ""),
        btVector3.p("value", "")
    )

    int(
        "SoftBody_generateBendingConstraints",
        "",

        opaque_p("obj", ""),
        int("distance", ""),
        opaque_p("mat", "")
    )

    int(
        "SoftBody_generateClusters",
        "",

        opaque_p("obj", ""),
        int("k", "")
    )

    int(
        "SoftBody_generateClusters2",
        "",

        opaque_p("obj", ""),
        int("k", ""),
        int("maxiterations", "")
    )

    void(
        "SoftBody_getAabb",
        "",

        opaque_p("obj", ""),
        btVector3.p("aabbMin", ""),
        btVector3.p("aabbMax", "")
    )

    opaque_p(
        "SoftBody_getAnchors",
        "",

        opaque_p("obj", "")
    )

    btVector3.p(
        "SoftBody_getBounds",
        "",

        opaque_p("obj", "")
    )

    bool(
        "SoftBody_getBUpdateRtCst",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_getCdbvt",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_getCfg",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_getClusterConnectivity",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_getClusters",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_getCollisionDisabledObjects",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_getFaces",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_getFdbvt",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_getInitialWorldTransform",
        "",

        opaque_p("obj", ""),
        btTransform.p("value", "")
    )

    opaque_p(
        "SoftBody_getJoints",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_getLinks",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_getMass",
        "",

        opaque_p("obj", ""),
        int("node", "")
    )

    opaque_p(
        "SoftBody_getMaterials",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_getNdbvt",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_getNodes",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_getNotes",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_getPose",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_getRcontacts",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_getRestLengthScale",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_getScontacts",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_getSoftBodySolver",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_getSst",
        """
        EXPORT btSoftBody_psolver_t btSoftBody_getSolver(btSoftBody_ePSolver solver); EXPORT btSoftBody_vsolver_t btSoftBody_getSolver2(btSoftBody_eVSolver
        solver);
        """,

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_getTag",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_getTetras",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_getTimeacc",
        "",

        opaque_p("obj", "")
    )

    btScalar(
        "SoftBody_getTotalMass",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_getUserIndexMapping",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_getWindVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.p("velocity", "")
    )

    btScalar(
        "SoftBody_getVolume",
        "",

        opaque_p("obj", "")
    )

    opaque_p(
        "SoftBody_getWorldInfo",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_indicesToPointers",
        "",

        opaque_p("obj", ""),
        Unsafe..int.const.p("map", "")
    )

    void(
        "SoftBody_initDefaults",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_initializeClusters",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_initializeFaceTree",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_integrateMotion",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_pointersToIndices",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_predictMotion",
        "",

        opaque_p("obj", ""),
        btScalar("dt", "")
    )

    void(
        "SoftBody_prepareClusters",
        "",

        opaque_p("obj", ""),
        int("iterations", "")
    )

    void(
        "SoftBody_PSolve_Anchors",
        "",

        opaque_p("psb", ""),
        btScalar("kst", ""),
        btScalar("ti", "")
    )

    void(
        "SoftBody_PSolve_Links",
        "",

        opaque_p("psb", ""),
        btScalar("kst", ""),
        btScalar("ti", "")
    )

    void(
        "SoftBody_PSolve_RContacts",
        "",

        opaque_p("psb", ""),
        btScalar("kst", ""),
        btScalar("ti", "")
    )

    void(
        "SoftBody_PSolve_SContacts",
        "",

        opaque_p("psb", ""),
        btScalar("__unnamed1", ""),
        btScalar("ti", "")
    )

    void(
        "SoftBody_randomizeConstraints",
        "",

        opaque_p("obj", "")
    )

    bool(
        "SoftBody_rayTest",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("rayFrom", ""),
        btVector3.const.p("rayTo", ""),
        opaque_p("results", "")
    )

    int(
        "SoftBody_rayTest2",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("rayFrom", ""),
        btVector3.const.p("rayTo", ""),
        Check(1)..btScalar.p("mint", ""),
        Check(1)..int.p("feature", ""),
        Check(1)..int.p("index", ""),
        bool("bcountonly", "")
    )

    void(
        "SoftBody_refine",
        "",

        opaque_p("obj", ""),
        opaque_p("ifn", ""),
        btScalar("accurary", ""),
        bool("cut", "")
    )

    void(
        "SoftBody_releaseCluster",
        "",

        opaque_p("obj", ""),
        int("index", "")
    )

    void(
        "SoftBody_releaseClusters",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_resetLinkRestLengths",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_rotate",
        "",

        opaque_p("obj", ""),
        btQuaternion.const.p("rot", "")
    )

    void(
        "SoftBody_scale",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("scl", "")
    )

    void(
        "SoftBody_setBUpdateRtCst",
        "",

        opaque_p("obj", ""),
        bool("value", "")
    )
/*
    void(
        "SoftBody_setInitialWorldTransform",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("value", "")
    )
*/
    void(
        "SoftBody_setMass",
        "",

        opaque_p("obj", ""),
        int("node", ""),
        btScalar("mass", "")
    )

    void(
        "SoftBody_setPose",
        "",

        opaque_p("obj", ""),
        bool("bvolume", ""),
        bool("bframe", "")
    )

    void(
        "SoftBody_setRestLengthScale",
        "",

        opaque_p("obj", ""),
        btScalar("restLength", "")
    )

    void(
        "SoftBody_setSoftBodySolver",
        "",

        opaque_p("obj", ""),
        opaque_p("softBodySolver", "")
    )

    void(
        "SoftBody_setSolver",
        "",

        opaque_p("obj", ""),
        int("preset", "")
    )

    void(
        "SoftBody_setTag",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "SoftBody_setTimeacc",
        "",

        opaque_p("obj", ""),
        btScalar("value", "")
    )

    void(
        "SoftBody_setTotalDensity",
        "",

        opaque_p("obj", ""),
        btScalar("density", "")
    )

    void(
        "SoftBody_setTotalMass",
        "",

        opaque_p("obj", ""),
        btScalar("mass", ""),
        bool("fromfaces", "")
    )

    void(
        "SoftBody_setVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("velocity", "")
    )

    void(
        "SoftBody_setWindVelocity",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("velocity", "")
    )

    void(
        "SoftBody_setVolumeDensity",
        "",

        opaque_p("obj", ""),
        btScalar("density", "")
    )

    void(
        "SoftBody_setVolumeMass",
        "",

        opaque_p("obj", ""),
        btScalar("mass", "")
    )

    void(
        "SoftBody_setWorldInfo",
        "",

        opaque_p("obj", ""),
        opaque_p("value", "")
    )

    void(
        "SoftBody_solveClusters",
        "",

        opaque_p("bodies", "")
    )

    void(
        "SoftBody_solveClusters2",
        "",

        opaque_p("obj", ""),
        btScalar("sor", "")
    )

    void(
        "SoftBody_solveCommonConstraints",
        "",

        opaque_p.p("bodies", ""),
        AutoSize("bodies")..int("count", ""),
        int("iterations", "")
    )

    void(
        "SoftBody_solveConstraints",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_staticSolve",
        "",

        opaque_p("obj", ""),
        int("iterations", "")
    )

    void(
        "SoftBody_transform",
        "",

        opaque_p("obj", ""),
        btTransform.const.p("trs", "")
    )

    void(
        "SoftBody_translate",
        "",

        opaque_p("obj", ""),
        btVector3.const.p("trs", "")
    )

    opaque_p(
        "SoftBody_upcast",
        "",

        opaque_p("colObj", "")
    )

    void(
        "SoftBody_updateArea",
        "",

        opaque_p("obj", ""),
        bool("averageArea", "")
    )

    void(
        "SoftBody_updateBounds",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_updateClusters",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_updateConstants",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_updateLinkConstants",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_updateNormals",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_updatePose",
        "",

        opaque_p("obj", "")
    )

    void(
        "SoftBody_VSolve_Links",
        "",

        opaque_p("psb", ""),
        btScalar("kst", "")
    )

    int(
        "SoftBody_getFaceVertexData",
        "",

        opaque_p("obj", ""),
        Unsafe..btScalar.p("vertices", "")
    )

    int(
        "SoftBody_getFaceVertexNormalData",
        "",

        opaque_p("obj", ""),
        Unsafe..btScalar.p("vertices", "")
    )

    int(
        "SoftBody_getFaceVertexNormalData2",
        "",

        opaque_p("obj", ""),
        Unsafe..btScalar.p("vertices", ""),
        Unsafe..btScalar.p("normals", "")
    )

    int(
        "SoftBody_getLinkVertexData",
        "",

        opaque_p("obj", ""),
        Unsafe..btScalar.p("vertices", "")
    )

    int(
        "SoftBody_getLinkVertexNormalData",
        "",

        opaque_p("obj", ""),
        Unsafe..btScalar.p("vertices", "")
    )

    int(
        "SoftBody_getTetraVertexData",
        "",

        opaque_p("obj", ""),
        Unsafe..btScalar.p("vertices", "")
    )

    int(
        "SoftBody_getTetraVertexNormalData",
        "",

        opaque_p("obj", ""),
        Unsafe..btScalar.p("vertices", "")
    )

    int(
        "SoftBody_getTetraVertexNormalData2",
        "",

        opaque_p("obj", ""),
        Unsafe..btScalar.p("vertices", ""),
        Unsafe..btScalar.p("normals", "")
    )

}
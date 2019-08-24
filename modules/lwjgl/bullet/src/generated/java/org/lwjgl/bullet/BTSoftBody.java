/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BTSoftBody {

    protected BTSoftBody() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SoftBodyWorldInfo_new                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyWorldInfo_new"),
            SoftBodyWorldInfo_getAir_density                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyWorldInfo_getAir_density"),
            SoftBodyWorldInfo_getBroadphase                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyWorldInfo_getBroadphase"),
            SoftBodyWorldInfo_getDispatcher                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyWorldInfo_getDispatcher"),
            SoftBodyWorldInfo_getGravity                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyWorldInfo_getGravity"),
            SoftBodyWorldInfo_getMaxDisplacement               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyWorldInfo_getMaxDisplacement"),
            SoftBodyWorldInfo_getSparsesdf                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyWorldInfo_getSparsesdf"),
            SoftBodyWorldInfo_getWater_density                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyWorldInfo_getWater_density"),
            SoftBodyWorldInfo_getWater_normal                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyWorldInfo_getWater_normal"),
            SoftBodyWorldInfo_getWater_offset                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyWorldInfo_getWater_offset"),
            SoftBodyWorldInfo_setAir_density                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyWorldInfo_setAir_density"),
            SoftBodyWorldInfo_setBroadphase                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyWorldInfo_setBroadphase"),
            SoftBodyWorldInfo_setDispatcher                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyWorldInfo_setDispatcher"),
            SoftBodyWorldInfo_setGravity                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyWorldInfo_setGravity"),
            SoftBodyWorldInfo_setMaxDisplacement               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyWorldInfo_setMaxDisplacement"),
            SoftBodyWorldInfo_setWater_density                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyWorldInfo_setWater_density"),
            SoftBodyWorldInfo_setWater_normal                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyWorldInfo_setWater_normal"),
            SoftBodyWorldInfo_setWater_offset                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyWorldInfo_setWater_offset"),
            SoftBodyWorldInfo_delete                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBodyWorldInfo_delete"),
            SoftBody_AJoint_IControlWrapper_new                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_AJoint_IControlWrapper_new"),
            SoftBody_AJoint_IControlWrapper_getWrapperData     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_AJoint_IControlWrapper_getWrapperData"),
            SoftBody_AJoint_IControlWrapper_setWrapperData     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_AJoint_IControlWrapper_setWrapperData"),
            SoftBody_AJoint_IControl_new                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_AJoint_IControl_new"),
            SoftBody_AJoint_IControl_Default                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_AJoint_IControl_Default"),
            SoftBody_AJoint_IControl_Prepare                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_AJoint_IControl_Prepare"),
            SoftBody_AJoint_IControl_Speed                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_AJoint_IControl_Speed"),
            SoftBody_AJoint_IControl_delete                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_AJoint_IControl_delete"),
            SoftBody_AJoint_Specs_new                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_AJoint_Specs_new"),
            SoftBody_AJoint_Specs_getAxis                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_AJoint_Specs_getAxis"),
            SoftBody_AJoint_Specs_getIcontrol                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_AJoint_Specs_getIcontrol"),
            SoftBody_AJoint_Specs_setAxis                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_AJoint_Specs_setAxis"),
            SoftBody_AJoint_Specs_setIcontrol                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_AJoint_Specs_setIcontrol"),
            SoftBody_AJoint_getAxis                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_AJoint_getAxis"),
            SoftBody_AJoint_getIcontrol                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_AJoint_getIcontrol"),
            SoftBody_AJoint_setIcontrol                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_AJoint_setIcontrol"),
            SoftBody_Anchor_getBody                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Anchor_getBody"),
            SoftBody_Anchor_getC0                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Anchor_getC0"),
            SoftBody_Anchor_getC1                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Anchor_getC1"),
            SoftBody_Anchor_getC2                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Anchor_getC2"),
            SoftBody_Anchor_getInfluence                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Anchor_getInfluence"),
            SoftBody_Anchor_getLocal                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Anchor_getLocal"),
            SoftBody_Anchor_getNode                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Anchor_getNode"),
            SoftBody_Anchor_setBody                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Anchor_setBody"),
            SoftBody_Anchor_setC0                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Anchor_setC0"),
            SoftBody_Anchor_setC1                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Anchor_setC1"),
            SoftBody_Anchor_setC2                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Anchor_setC2"),
            SoftBody_Anchor_setInfluence                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Anchor_setInfluence"),
            SoftBody_Anchor_setLocal                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Anchor_setLocal"),
            SoftBody_Anchor_setNode                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Anchor_setNode"),
            SoftBody_Body_new                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_new"),
            SoftBody_Body_new2                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_new2"),
            SoftBody_Body_new3                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_new3"),
            SoftBody_Body_activate                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_activate"),
            SoftBody_Body_angularVelocity                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_angularVelocity"),
            SoftBody_Body_angularVelocity2                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_angularVelocity2"),
            SoftBody_Body_applyAImpulse                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_applyAImpulse"),
            SoftBody_Body_applyDAImpulse                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_applyDAImpulse"),
            SoftBody_Body_applyDCImpulse                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_applyDCImpulse"),
            SoftBody_Body_applyDImpulse                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_applyDImpulse"),
            SoftBody_Body_applyImpulse                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_applyImpulse"),
            SoftBody_Body_applyVAImpulse                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_applyVAImpulse"),
            SoftBody_Body_applyVImpulse                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_applyVImpulse"),
            SoftBody_Body_getCollisionObject                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_getCollisionObject"),
            SoftBody_Body_getRigid                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_getRigid"),
            SoftBody_Body_getSoft                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_getSoft"),
            SoftBody_Body_invMass                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_invMass"),
            SoftBody_Body_invWorldInertia                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_invWorldInertia"),
            SoftBody_Body_linearVelocity                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_linearVelocity"),
            SoftBody_Body_setCollisionObject                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_setCollisionObject"),
            SoftBody_Body_setRigid                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_setRigid"),
            SoftBody_Body_setSoft                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_setSoft"),
            SoftBody_Body_velocity                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_velocity"),
            SoftBody_Body_xform                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_xform"),
            SoftBody_Body_delete                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_delete"),
            SoftBody_Body_array_at                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Body_array_at"),
            SoftBody_CJoint_getFriction                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_CJoint_getFriction"),
            SoftBody_CJoint_getLife                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_CJoint_getLife"),
            SoftBody_CJoint_getMaxlife                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_CJoint_getMaxlife"),
            SoftBody_CJoint_getNormal                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_CJoint_getNormal"),
            SoftBody_CJoint_getRpos                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_CJoint_getRpos"),
            SoftBody_CJoint_setFriction                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_CJoint_setFriction"),
            SoftBody_CJoint_setLife                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_CJoint_setLife"),
            SoftBody_CJoint_setMaxlife                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_CJoint_setMaxlife"),
            SoftBody_CJoint_setNormal                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_CJoint_setNormal"),
            SoftBody_Cluster_getAdamping                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getAdamping"),
            SoftBody_Cluster_getAv                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getAv"),
            SoftBody_Cluster_getClusterIndex                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getClusterIndex"),
            SoftBody_Cluster_getCollide                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getCollide"),
            SoftBody_Cluster_getCom                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getCom"),
            SoftBody_Cluster_getContainsAnchor                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getContainsAnchor"),
            SoftBody_Cluster_getDimpulses                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getDimpulses"),
            SoftBody_Cluster_getFramexform                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getFramexform"),
            SoftBody_Cluster_getIdmass                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getIdmass"),
            SoftBody_Cluster_getImass                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getImass"),
            SoftBody_Cluster_getInvwi                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getInvwi"),
            SoftBody_Cluster_getLdamping                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getLdamping"),
            SoftBody_Cluster_getLeaf                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getLeaf"),
            SoftBody_Cluster_getLocii                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getLocii"),
            SoftBody_Cluster_getLv                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getLv"),
            SoftBody_Cluster_getMasses                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getMasses"),
            SoftBody_Cluster_getMatching                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getMatching"),
            SoftBody_Cluster_getMaxSelfCollisionImpulse        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getMaxSelfCollisionImpulse"),
            SoftBody_Cluster_getNdamping                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getNdamping"),
            SoftBody_Cluster_getNdimpulses                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getNdimpulses"),
            SoftBody_Cluster_getNodes                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getNodes"),
            SoftBody_Cluster_getNvimpulses                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getNvimpulses"),
            SoftBody_Cluster_getSelfCollisionImpulseFactor     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getSelfCollisionImpulseFactor"),
            SoftBody_Cluster_getVimpulses                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_getVimpulses"),
            SoftBody_Cluster_setAdamping                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_setAdamping"),
            SoftBody_Cluster_setAv                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_setAv"),
            SoftBody_Cluster_setClusterIndex                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_setClusterIndex"),
            SoftBody_Cluster_setCollide                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_setCollide"),
            SoftBody_Cluster_setCom                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_setCom"),
            SoftBody_Cluster_setContainsAnchor                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_setContainsAnchor"),
            SoftBody_Cluster_setFramexform                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_setFramexform"),
            SoftBody_Cluster_setIdmass                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_setIdmass"),
            SoftBody_Cluster_setImass                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_setImass"),
            SoftBody_Cluster_setInvwi                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_setInvwi"),
            SoftBody_Cluster_setLdamping                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_setLdamping"),
            SoftBody_Cluster_setLeaf                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_setLeaf"),
            SoftBody_Cluster_setLocii                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_setLocii"),
            SoftBody_Cluster_setLv                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_setLv"),
            SoftBody_Cluster_setMatching                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_setMatching"),
            SoftBody_Cluster_setMaxSelfCollisionImpulse        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_setMaxSelfCollisionImpulse"),
            SoftBody_Cluster_setNdamping                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_setNdamping"),
            SoftBody_Cluster_setNdimpulses                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_setNdimpulses"),
            SoftBody_Cluster_setNvimpulses                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_setNvimpulses"),
            SoftBody_Cluster_setSelfCollisionImpulseFactor     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Cluster_setSelfCollisionImpulseFactor"),
            SoftBody_Config_getAeromodel                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getAeromodel"),
            SoftBody_Config_getCiterations                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getCiterations"),
            SoftBody_Config_getCollisions                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getCollisions"),
            SoftBody_Config_getDiterations                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getDiterations"),
            SoftBody_Config_getDsequence                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getDsequence"),
            SoftBody_Config_getKAHR                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getKAHR"),
            SoftBody_Config_getKCHR                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getKCHR"),
            SoftBody_Config_getKDF                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getKDF"),
            SoftBody_Config_getKDG                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getKDG"),
            SoftBody_Config_getKDP                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getKDP"),
            SoftBody_Config_getKKHR                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getKKHR"),
            SoftBody_Config_getKLF                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getKLF"),
            SoftBody_Config_getKMT                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getKMT"),
            SoftBody_Config_getKPR                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getKPR"),
            SoftBody_Config_getKSHR                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getKSHR"),
            SoftBody_Config_getKSK_SPLT_CL                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getKSK_SPLT_CL"),
            SoftBody_Config_getKSKHR_CL                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getKSKHR_CL"),
            SoftBody_Config_getKSR_SPLT_CL                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getKSR_SPLT_CL"),
            SoftBody_Config_getKSRHR_CL                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getKSRHR_CL"),
            SoftBody_Config_getKSS_SPLT_CL                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getKSS_SPLT_CL"),
            SoftBody_Config_getKSSHR_CL                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getKSSHR_CL"),
            SoftBody_Config_getKVC                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getKVC"),
            SoftBody_Config_getKVCF                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getKVCF"),
            SoftBody_Config_getMaxvolume                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getMaxvolume"),
            SoftBody_Config_getPiterations                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getPiterations"),
            SoftBody_Config_getPsequence                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getPsequence"),
            SoftBody_Config_getTimescale                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getTimescale"),
            SoftBody_Config_getViterations                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getViterations"),
            SoftBody_Config_getVsequence                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_getVsequence"),
            SoftBody_Config_setAeromodel                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setAeromodel"),
            SoftBody_Config_setCiterations                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setCiterations"),
            SoftBody_Config_setCollisions                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setCollisions"),
            SoftBody_Config_setDiterations                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setDiterations"),
            SoftBody_Config_setKAHR                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setKAHR"),
            SoftBody_Config_setKCHR                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setKCHR"),
            SoftBody_Config_setKDF                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setKDF"),
            SoftBody_Config_setKDG                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setKDG"),
            SoftBody_Config_setKDP                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setKDP"),
            SoftBody_Config_setKKHR                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setKKHR"),
            SoftBody_Config_setKLF                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setKLF"),
            SoftBody_Config_setKMT                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setKMT"),
            SoftBody_Config_setKPR                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setKPR"),
            SoftBody_Config_setKSHR                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setKSHR"),
            SoftBody_Config_setKSK_SPLT_CL                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setKSK_SPLT_CL"),
            SoftBody_Config_setKSKHR_CL                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setKSKHR_CL"),
            SoftBody_Config_setKSR_SPLT_CL                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setKSR_SPLT_CL"),
            SoftBody_Config_setKSRHR_CL                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setKSRHR_CL"),
            SoftBody_Config_setKSS_SPLT_CL                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setKSS_SPLT_CL"),
            SoftBody_Config_setKSSHR_CL                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setKSSHR_CL"),
            SoftBody_Config_setKVC                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setKVC"),
            SoftBody_Config_setKVCF                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setKVCF"),
            SoftBody_Config_setMaxvolume                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setMaxvolume"),
            SoftBody_Config_setPiterations                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setPiterations"),
            SoftBody_Config_setTimescale                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setTimescale"),
            SoftBody_Config_setViterations                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Config_setViterations"),
            SoftBody_Element_getTag                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Element_getTag"),
            SoftBody_Element_setTag                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Element_setTag"),
            SoftBody_Element_delete                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Element_delete"),
            SoftBody_Face_getLeaf                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Face_getLeaf"),
            SoftBody_Face_getN                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Face_getN"),
            SoftBody_Face_getNormal                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Face_getNormal"),
            SoftBody_Face_getRa                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Face_getRa"),
            SoftBody_Face_setLeaf                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Face_setLeaf"),
            SoftBody_Face_setNormal                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Face_setNormal"),
            SoftBody_Face_setRa                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Face_setRa"),
            SoftBody_Feature_getMaterial                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Feature_getMaterial"),
            SoftBody_Feature_setMaterial                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Feature_setMaterial"),
            SoftBody_ImplicitFnWrapper_new                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_ImplicitFnWrapper_new"),
            SoftBody_ImplicitFn_Eval                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_ImplicitFn_Eval"),
            SoftBody_ImplicitFn_delete                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_ImplicitFn_delete"),
            SoftBody_Impulse_new                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Impulse_new"),
            SoftBody_Impulse_getAsDrift                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Impulse_getAsDrift"),
            SoftBody_Impulse_getAsVelocity                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Impulse_getAsVelocity"),
            SoftBody_Impulse_getDrift                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Impulse_getDrift"),
            SoftBody_Impulse_getVelocity                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Impulse_getVelocity"),
            SoftBody_Impulse_operator_n                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Impulse_operator_n"),
            SoftBody_Impulse_operator_m                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Impulse_operator_m"),
            SoftBody_Impulse_setAsDrift                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Impulse_setAsDrift"),
            SoftBody_Impulse_setAsVelocity                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Impulse_setAsVelocity"),
            SoftBody_Impulse_setDrift                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Impulse_setDrift"),
            SoftBody_Impulse_setVelocity                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Impulse_setVelocity"),
            SoftBody_Impulse_delete                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Impulse_delete"),
            SoftBody_Joint_Specs_new                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_Specs_new"),
            SoftBody_Joint_Specs_getCfm                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_Specs_getCfm"),
            SoftBody_Joint_Specs_getErp                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_Specs_getErp"),
            SoftBody_Joint_Specs_getSplit                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_Specs_getSplit"),
            SoftBody_Joint_Specs_setCfm                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_Specs_setCfm"),
            SoftBody_Joint_Specs_setErp                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_Specs_setErp"),
            SoftBody_Joint_Specs_setSplit                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_Specs_setSplit"),
            SoftBody_Joint_Specs_delete                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_Specs_delete"),
            SoftBody_Joint_getBodies                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_getBodies"),
            SoftBody_Joint_getCfm                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_getCfm"),
            SoftBody_Joint_getDelete                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_getDelete"),
            SoftBody_Joint_getDrift                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_getDrift"),
            SoftBody_Joint_getErp                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_getErp"),
            SoftBody_Joint_getMassmatrix                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_getMassmatrix"),
            SoftBody_Joint_getRefs                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_getRefs"),
            SoftBody_Joint_getSdrift                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_getSdrift"),
            SoftBody_Joint_getSplit                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_getSplit"),
            SoftBody_Joint_Prepare                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_Prepare"),
            SoftBody_Joint_setCfm                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_setCfm"),
            SoftBody_Joint_setDelete                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_setDelete"),
            SoftBody_Joint_setDrift                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_setDrift"),
            SoftBody_Joint_setErp                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_setErp"),
            SoftBody_Joint_setMassmatrix                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_setMassmatrix"),
            SoftBody_Joint_setSdrift                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_setSdrift"),
            SoftBody_Joint_setSplit                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_setSplit"),
            SoftBody_Joint_Solve                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_Solve"),
            SoftBody_Joint_Terminate                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_Terminate"),
            SoftBody_Joint_Type                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_Type"),
            SoftBody_Joint_delete                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Joint_delete"),
            SoftBody_Link_new                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Link_new"),
            SoftBody_Link_new2                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Link_new2"),
            SoftBody_Link_getBbending                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Link_getBbending"),
            SoftBody_Link_getC0                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Link_getC0"),
            SoftBody_Link_getC1                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Link_getC1"),
            SoftBody_Link_getC2                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Link_getC2"),
            SoftBody_Link_getC3                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Link_getC3"),
            SoftBody_Link_getN                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Link_getN"),
            SoftBody_Link_getRl                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Link_getRl"),
            SoftBody_Link_setBbending                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Link_setBbending"),
            SoftBody_Link_setC0                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Link_setC0"),
            SoftBody_Link_setC1                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Link_setC1"),
            SoftBody_Link_setC2                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Link_setC2"),
            SoftBody_Link_setC3                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Link_setC3"),
            SoftBody_Link_setRl                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Link_setRl"),
            SoftBody_Link_delete                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Link_delete"),
            SoftBody_LJoint_Specs_new                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_LJoint_Specs_new"),
            SoftBody_LJoint_Specs_getPosition                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_LJoint_Specs_getPosition"),
            SoftBody_LJoint_Specs_setPosition                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_LJoint_Specs_setPosition"),
            SoftBody_LJoint_getRpos                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_LJoint_getRpos"),
            SoftBody_Material_getFlags                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Material_getFlags"),
            SoftBody_Material_getKAST                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Material_getKAST"),
            SoftBody_Material_getKLST                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Material_getKLST"),
            SoftBody_Material_getKVST                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Material_getKVST"),
            SoftBody_Material_setFlags                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Material_setFlags"),
            SoftBody_Material_setKAST                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Material_setKAST"),
            SoftBody_Material_setKLST                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Material_setKLST"),
            SoftBody_Material_setKVST                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Material_setKVST"),
            SoftBody_Node_getArea                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Node_getArea"),
            SoftBody_Node_getBattach                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Node_getBattach"),
            SoftBody_Node_getF                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Node_getF"),
            SoftBody_Node_getIm                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Node_getIm"),
            SoftBody_Node_getLeaf                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Node_getLeaf"),
            SoftBody_Node_getN                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Node_getN"),
            SoftBody_Node_getQ                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Node_getQ"),
            SoftBody_Node_getV                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Node_getV"),
            SoftBody_Node_getX                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Node_getX"),
            SoftBody_Node_setArea                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Node_setArea"),
            SoftBody_Node_setBattach                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Node_setBattach"),
            SoftBody_Node_setF                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Node_setF"),
            SoftBody_Node_setIm                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Node_setIm"),
            SoftBody_Node_setLeaf                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Node_setLeaf"),
            SoftBody_Node_setN                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Node_setN"),
            SoftBody_Node_setQ                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Node_setQ"),
            SoftBody_Node_setV                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Node_setV"),
            SoftBody_Node_setX                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Node_setX"),
            SoftBody_Note_getCoords                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Note_getCoords"),
            SoftBody_Note_getNodes                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Note_getNodes"),
            SoftBody_Note_getOffset                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Note_getOffset"),
            SoftBody_Note_getRank                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Note_getRank"),
            SoftBody_Note_getText                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Note_getText"),
            SoftBody_Note_setOffset                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Note_setOffset"),
            SoftBody_Note_setRank                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Note_setRank"),
            SoftBody_Note_setText                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Note_setText"),
            SoftBody_Pose_getAqq                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Pose_getAqq"),
            SoftBody_Pose_getBframe                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Pose_getBframe"),
            SoftBody_Pose_getBvolume                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Pose_getBvolume"),
            SoftBody_Pose_getCom                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Pose_getCom"),
            SoftBody_Pose_getRot                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Pose_getRot"),
            SoftBody_Pose_getScl                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Pose_getScl"),
            SoftBody_Pose_getWgh                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Pose_getWgh"),
            SoftBody_Pose_getVolume                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Pose_getVolume"),
            SoftBody_Pose_setAqq                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Pose_setAqq"),
            SoftBody_Pose_setBframe                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Pose_setBframe"),
            SoftBody_Pose_setBvolume                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Pose_setBvolume"),
            SoftBody_Pose_setCom                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Pose_setCom"),
            SoftBody_Pose_setRot                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Pose_setRot"),
            SoftBody_Pose_setScl                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Pose_setScl"),
            SoftBody_Pose_setVolume                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Pose_setVolume"),
            SoftBody_RayFromToCaster_new                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RayFromToCaster_new"),
            SoftBody_RayFromToCaster_getFace                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RayFromToCaster_getFace"),
            SoftBody_RayFromToCaster_getMint                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RayFromToCaster_getMint"),
            SoftBody_RayFromToCaster_getRayFrom                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RayFromToCaster_getRayFrom"),
            SoftBody_RayFromToCaster_getRayNormalizedDirection = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RayFromToCaster_getRayNormalizedDirection"),
            SoftBody_RayFromToCaster_getRayTo                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RayFromToCaster_getRayTo"),
            SoftBody_RayFromToCaster_getTests                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RayFromToCaster_getTests"),
            SoftBody_RayFromToCaster_rayFromToTriangle         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RayFromToCaster_rayFromToTriangle"),
            SoftBody_RayFromToCaster_rayFromToTriangle2        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RayFromToCaster_rayFromToTriangle2"),
            SoftBody_RayFromToCaster_setFace                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RayFromToCaster_setFace"),
            SoftBody_RayFromToCaster_setMint                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RayFromToCaster_setMint"),
            SoftBody_RayFromToCaster_setRayFrom                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RayFromToCaster_setRayFrom"),
            SoftBody_RayFromToCaster_setRayNormalizedDirection = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RayFromToCaster_setRayNormalizedDirection"),
            SoftBody_RayFromToCaster_setRayTo                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RayFromToCaster_setRayTo"),
            SoftBody_RayFromToCaster_setTests                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RayFromToCaster_setTests"),
            SoftBody_RContact_new                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RContact_new"),
            SoftBody_RContact_getC0                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RContact_getC0"),
            SoftBody_RContact_getC1                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RContact_getC1"),
            SoftBody_RContact_getC2                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RContact_getC2"),
            SoftBody_RContact_getC3                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RContact_getC3"),
            SoftBody_RContact_getC4                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RContact_getC4"),
            SoftBody_RContact_getCti                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RContact_getCti"),
            SoftBody_RContact_getNode                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RContact_getNode"),
            SoftBody_RContact_setC0                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RContact_setC0"),
            SoftBody_RContact_setC1                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RContact_setC1"),
            SoftBody_RContact_setC2                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RContact_setC2"),
            SoftBody_RContact_setC3                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RContact_setC3"),
            SoftBody_RContact_setC4                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RContact_setC4"),
            SoftBody_RContact_setNode                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RContact_setNode"),
            SoftBody_RContact_delete                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_RContact_delete"),
            SoftBody_SContact_new                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SContact_new"),
            SoftBody_SContact_getCfm                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SContact_getCfm"),
            SoftBody_SContact_getFace                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SContact_getFace"),
            SoftBody_SContact_getFriction                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SContact_getFriction"),
            SoftBody_SContact_getMargin                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SContact_getMargin"),
            SoftBody_SContact_getNode                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SContact_getNode"),
            SoftBody_SContact_getNormal                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SContact_getNormal"),
            SoftBody_SContact_getWeights                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SContact_getWeights"),
            SoftBody_SContact_setFace                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SContact_setFace"),
            SoftBody_SContact_setFriction                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SContact_setFriction"),
            SoftBody_SContact_setMargin                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SContact_setMargin"),
            SoftBody_SContact_setNode                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SContact_setNode"),
            SoftBody_SContact_setNormal                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SContact_setNormal"),
            SoftBody_SContact_setWeights                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SContact_setWeights"),
            SoftBody_SContact_delete                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SContact_delete"),
            SoftBody_sCti_new                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_sCti_new"),
            SoftBody_sCti_getColObj                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_sCti_getColObj"),
            SoftBody_sCti_getNormal                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_sCti_getNormal"),
            SoftBody_sCti_getOffset                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_sCti_getOffset"),
            SoftBody_sCti_setColObj                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_sCti_setColObj"),
            SoftBody_sCti_setNormal                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_sCti_setNormal"),
            SoftBody_sCti_setOffset                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_sCti_setOffset"),
            SoftBody_sCti_delete                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_sCti_delete"),
            SoftBody_SolverState_getIsdt                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SolverState_getIsdt"),
            SoftBody_SolverState_getRadmrg                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SolverState_getRadmrg"),
            SoftBody_SolverState_getSdt                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SolverState_getSdt"),
            SoftBody_SolverState_getUpdmrg                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SolverState_getUpdmrg"),
            SoftBody_SolverState_getVelmrg                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SolverState_getVelmrg"),
            SoftBody_SolverState_setIsdt                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SolverState_setIsdt"),
            SoftBody_SolverState_setRadmrg                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SolverState_setRadmrg"),
            SoftBody_SolverState_setSdt                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SolverState_setSdt"),
            SoftBody_SolverState_setUpdmrg                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SolverState_setUpdmrg"),
            SoftBody_SolverState_setVelmrg                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_SolverState_setVelmrg"),
            SoftBody_sRayCast_new                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_sRayCast_new"),
            SoftBody_sRayCast_getBody                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_sRayCast_getBody"),
            SoftBody_sRayCast_getFeature                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_sRayCast_getFeature"),
            SoftBody_sRayCast_getFraction                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_sRayCast_getFraction"),
            SoftBody_sRayCast_getIndex                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_sRayCast_getIndex"),
            SoftBody_sRayCast_setBody                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_sRayCast_setBody"),
            SoftBody_sRayCast_setFeature                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_sRayCast_setFeature"),
            SoftBody_sRayCast_setFraction                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_sRayCast_setFraction"),
            SoftBody_sRayCast_setIndex                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_sRayCast_setIndex"),
            SoftBody_sRayCast_delete                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_sRayCast_delete"),
            SoftBody_Tetra_getC0                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Tetra_getC0"),
            SoftBody_Tetra_getC1                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Tetra_getC1"),
            SoftBody_Tetra_getC2                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Tetra_getC2"),
            SoftBody_Tetra_getLeaf                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Tetra_getLeaf"),
            SoftBody_Tetra_getN                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Tetra_getN"),
            SoftBody_Tetra_getRv                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Tetra_getRv"),
            SoftBody_Tetra_setC1                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Tetra_setC1"),
            SoftBody_Tetra_setC2                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Tetra_setC2"),
            SoftBody_Tetra_setLeaf                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Tetra_setLeaf"),
            SoftBody_Tetra_setRv                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_Tetra_setRv"),
            SoftBody_new                                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_new"),
            SoftBody_new2                                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_new2"),
            SoftBody_addAeroForceToFace                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_addAeroForceToFace"),
            SoftBody_addAeroForceToNode                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_addAeroForceToNode"),
            SoftBody_addForce                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_addForce"),
            SoftBody_addForce2                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_addForce2"),
            SoftBody_addVelocity                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_addVelocity"),
            SoftBody_addVelocity2                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_addVelocity2"),
            SoftBody_appendAnchor                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendAnchor"),
            SoftBody_appendAnchor2                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendAnchor2"),
            SoftBody_appendAngularJoint                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendAngularJoint"),
            SoftBody_appendAngularJoint2                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendAngularJoint2"),
            SoftBody_appendAngularJoint3                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendAngularJoint3"),
            SoftBody_appendAngularJoint4                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendAngularJoint4"),
            SoftBody_appendFace                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendFace"),
            SoftBody_appendFace2                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendFace2"),
            SoftBody_appendLinearJoint                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendLinearJoint"),
            SoftBody_appendLinearJoint2                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendLinearJoint2"),
            SoftBody_appendLinearJoint3                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendLinearJoint3"),
            SoftBody_appendLinearJoint4                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendLinearJoint4"),
            SoftBody_appendLink                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendLink"),
            SoftBody_appendLink2                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendLink2"),
            SoftBody_appendLink3                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendLink3"),
            SoftBody_appendMaterial                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendMaterial"),
            SoftBody_appendNode                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendNode"),
            SoftBody_appendNote                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendNote"),
            SoftBody_appendNote2                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendNote2"),
            SoftBody_appendNote3                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendNote3"),
            SoftBody_appendNote4                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendNote4"),
            SoftBody_appendNote5                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendNote5"),
            SoftBody_appendTetra                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendTetra"),
            SoftBody_appendTetra2                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_appendTetra2"),
            SoftBody_applyClusters                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_applyClusters"),
            SoftBody_applyForces                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_applyForces"),
            SoftBody_checkContact                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_checkContact"),
            SoftBody_checkFace                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_checkFace"),
            SoftBody_checkLink                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_checkLink"),
            SoftBody_checkLink2                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_checkLink2"),
            SoftBody_cleanupClusters                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_cleanupClusters"),
            SoftBody_clusterAImpulse                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_clusterAImpulse"),
            SoftBody_clusterCom                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_clusterCom"),
            SoftBody_clusterCom2                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_clusterCom2"),
            SoftBody_clusterCount                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_clusterCount"),
            SoftBody_clusterDAImpulse                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_clusterDAImpulse"),
            SoftBody_clusterDCImpulse                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_clusterDCImpulse"),
            SoftBody_clusterDImpulse                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_clusterDImpulse"),
            SoftBody_clusterImpulse                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_clusterImpulse"),
            SoftBody_clusterVAImpulse                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_clusterVAImpulse"),
            SoftBody_clusterVelocity                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_clusterVelocity"),
            SoftBody_clusterVImpulse                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_clusterVImpulse"),
            SoftBody_cutLink                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_cutLink"),
            SoftBody_cutLink2                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_cutLink2"),
            SoftBody_dampClusters                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_dampClusters"),
            SoftBody_defaultCollisionHandler                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_defaultCollisionHandler"),
            SoftBody_defaultCollisionHandler2                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_defaultCollisionHandler2"),
            SoftBody_evaluateCom                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_evaluateCom"),
            SoftBody_generateBendingConstraints                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_generateBendingConstraints"),
            SoftBody_generateClusters                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_generateClusters"),
            SoftBody_generateClusters2                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_generateClusters2"),
            SoftBody_getAabb                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getAabb"),
            SoftBody_getAnchors                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getAnchors"),
            SoftBody_getBounds                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getBounds"),
            SoftBody_getBUpdateRtCst                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getBUpdateRtCst"),
            SoftBody_getCdbvt                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getCdbvt"),
            SoftBody_getCfg                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getCfg"),
            SoftBody_getClusterConnectivity                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getClusterConnectivity"),
            SoftBody_getClusters                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getClusters"),
            SoftBody_getCollisionDisabledObjects               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getCollisionDisabledObjects"),
            SoftBody_getFaces                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getFaces"),
            SoftBody_getFdbvt                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getFdbvt"),
            SoftBody_getInitialWorldTransform                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getInitialWorldTransform"),
            SoftBody_getJoints                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getJoints"),
            SoftBody_getLinks                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getLinks"),
            SoftBody_getMass                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getMass"),
            SoftBody_getMaterials                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getMaterials"),
            SoftBody_getNdbvt                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getNdbvt"),
            SoftBody_getNodes                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getNodes"),
            SoftBody_getNotes                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getNotes"),
            SoftBody_getPose                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getPose"),
            SoftBody_getRcontacts                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getRcontacts"),
            SoftBody_getRestLengthScale                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getRestLengthScale"),
            SoftBody_getScontacts                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getScontacts"),
            SoftBody_getSoftBodySolver                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getSoftBodySolver"),
            SoftBody_getSst                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getSst"),
            SoftBody_getTag                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getTag"),
            SoftBody_getTetras                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getTetras"),
            SoftBody_getTimeacc                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getTimeacc"),
            SoftBody_getTotalMass                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getTotalMass"),
            SoftBody_getUserIndexMapping                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getUserIndexMapping"),
            SoftBody_getWindVelocity                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getWindVelocity"),
            SoftBody_getVolume                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getVolume"),
            SoftBody_getWorldInfo                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getWorldInfo"),
            SoftBody_indicesToPointers                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_indicesToPointers"),
            SoftBody_initDefaults                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_initDefaults"),
            SoftBody_initializeClusters                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_initializeClusters"),
            SoftBody_initializeFaceTree                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_initializeFaceTree"),
            SoftBody_integrateMotion                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_integrateMotion"),
            SoftBody_pointersToIndices                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_pointersToIndices"),
            SoftBody_predictMotion                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_predictMotion"),
            SoftBody_prepareClusters                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_prepareClusters"),
            SoftBody_PSolve_Anchors                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_PSolve_Anchors"),
            SoftBody_PSolve_Links                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_PSolve_Links"),
            SoftBody_PSolve_RContacts                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_PSolve_RContacts"),
            SoftBody_PSolve_SContacts                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_PSolve_SContacts"),
            SoftBody_randomizeConstraints                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_randomizeConstraints"),
            SoftBody_rayTest                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_rayTest"),
            SoftBody_rayTest2                                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_rayTest2"),
            SoftBody_refine                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_refine"),
            SoftBody_releaseCluster                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_releaseCluster"),
            SoftBody_releaseClusters                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_releaseClusters"),
            SoftBody_resetLinkRestLengths                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_resetLinkRestLengths"),
            SoftBody_rotate                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_rotate"),
            SoftBody_scale                                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_scale"),
            SoftBody_setBUpdateRtCst                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_setBUpdateRtCst"),
            SoftBody_setMass                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_setMass"),
            SoftBody_setPose                                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_setPose"),
            SoftBody_setRestLengthScale                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_setRestLengthScale"),
            SoftBody_setSoftBodySolver                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_setSoftBodySolver"),
            SoftBody_setSolver                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_setSolver"),
            SoftBody_setTag                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_setTag"),
            SoftBody_setTimeacc                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_setTimeacc"),
            SoftBody_setTotalDensity                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_setTotalDensity"),
            SoftBody_setTotalMass                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_setTotalMass"),
            SoftBody_setVelocity                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_setVelocity"),
            SoftBody_setWindVelocity                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_setWindVelocity"),
            SoftBody_setVolumeDensity                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_setVolumeDensity"),
            SoftBody_setVolumeMass                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_setVolumeMass"),
            SoftBody_setWorldInfo                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_setWorldInfo"),
            SoftBody_solveClusters                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_solveClusters"),
            SoftBody_solveClusters2                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_solveClusters2"),
            SoftBody_solveCommonConstraints                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_solveCommonConstraints"),
            SoftBody_solveConstraints                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_solveConstraints"),
            SoftBody_staticSolve                               = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_staticSolve"),
            SoftBody_transform                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_transform"),
            SoftBody_translate                                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_translate"),
            SoftBody_upcast                                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_upcast"),
            SoftBody_updateArea                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_updateArea"),
            SoftBody_updateBounds                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_updateBounds"),
            SoftBody_updateClusters                            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_updateClusters"),
            SoftBody_updateConstants                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_updateConstants"),
            SoftBody_updateLinkConstants                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_updateLinkConstants"),
            SoftBody_updateNormals                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_updateNormals"),
            SoftBody_updatePose                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_updatePose"),
            SoftBody_VSolve_Links                              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_VSolve_Links"),
            SoftBody_getFaceVertexData                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getFaceVertexData"),
            SoftBody_getFaceVertexNormalData                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getFaceVertexNormalData"),
            SoftBody_getFaceVertexNormalData2                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getFaceVertexNormalData2"),
            SoftBody_getLinkVertexData                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getLinkVertexData"),
            SoftBody_getLinkVertexNormalData                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getLinkVertexNormalData"),
            SoftBody_getTetraVertexData                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getTetraVertexData"),
            SoftBody_getTetraVertexNormalData                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getTetraVertexNormalData"),
            SoftBody_getTetraVertexNormalData2                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftBody_getTetraVertexNormalData2");

    }

    // --- [ btSoftBodyWorldInfo_new ] ---

    @NativeType("void *")
    public static long btSoftBodyWorldInfo_new() {
        long __functionAddress = Functions.SoftBodyWorldInfo_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSoftBodyWorldInfo_getAir_density ] ---

    @NativeType("btScalar")
    public static float btSoftBodyWorldInfo_getAir_density(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBodyWorldInfo_getAir_density;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBodyWorldInfo_getBroadphase ] ---

    @NativeType("void *")
    public static long btSoftBodyWorldInfo_getBroadphase(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBodyWorldInfo_getBroadphase;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBodyWorldInfo_getDispatcher ] ---

    @NativeType("void *")
    public static long btSoftBodyWorldInfo_getDispatcher(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBodyWorldInfo_getDispatcher;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBodyWorldInfo_getGravity ] ---

    public static void nbtSoftBodyWorldInfo_getGravity(long obj, long value) {
        long __functionAddress = Functions.SoftBodyWorldInfo_getGravity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBodyWorldInfo_getGravity(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBodyWorldInfo_getGravity(obj, value.address());
    }

    // --- [ btSoftBodyWorldInfo_getMaxDisplacement ] ---

    @NativeType("btScalar")
    public static float btSoftBodyWorldInfo_getMaxDisplacement(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBodyWorldInfo_getMaxDisplacement;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBodyWorldInfo_getSparsesdf ] ---

    @NativeType("void *")
    public static long btSoftBodyWorldInfo_getSparsesdf(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBodyWorldInfo_getSparsesdf;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBodyWorldInfo_getWater_density ] ---

    @NativeType("btScalar")
    public static float btSoftBodyWorldInfo_getWater_density(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBodyWorldInfo_getWater_density;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBodyWorldInfo_getWater_normal ] ---

    public static void nbtSoftBodyWorldInfo_getWater_normal(long obj, long value) {
        long __functionAddress = Functions.SoftBodyWorldInfo_getWater_normal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBodyWorldInfo_getWater_normal(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBodyWorldInfo_getWater_normal(obj, value.address());
    }

    // --- [ btSoftBodyWorldInfo_getWater_offset ] ---

    @NativeType("btScalar")
    public static float btSoftBodyWorldInfo_getWater_offset(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBodyWorldInfo_getWater_offset;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBodyWorldInfo_setAir_density ] ---

    public static void btSoftBodyWorldInfo_setAir_density(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBodyWorldInfo_setAir_density;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBodyWorldInfo_setBroadphase ] ---

    public static void btSoftBodyWorldInfo_setBroadphase(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBodyWorldInfo_setBroadphase;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBodyWorldInfo_setDispatcher ] ---

    public static void btSoftBodyWorldInfo_setDispatcher(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBodyWorldInfo_setDispatcher;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBodyWorldInfo_setGravity ] ---

    public static void nbtSoftBodyWorldInfo_setGravity(long obj, long value) {
        long __functionAddress = Functions.SoftBodyWorldInfo_setGravity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBodyWorldInfo_setGravity(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBodyWorldInfo_setGravity(obj, value.address());
    }

    // --- [ btSoftBodyWorldInfo_setMaxDisplacement ] ---

    public static void btSoftBodyWorldInfo_setMaxDisplacement(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBodyWorldInfo_setMaxDisplacement;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBodyWorldInfo_setWater_density ] ---

    public static void btSoftBodyWorldInfo_setWater_density(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBodyWorldInfo_setWater_density;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBodyWorldInfo_setWater_normal ] ---

    public static void nbtSoftBodyWorldInfo_setWater_normal(long obj, long value) {
        long __functionAddress = Functions.SoftBodyWorldInfo_setWater_normal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBodyWorldInfo_setWater_normal(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBodyWorldInfo_setWater_normal(obj, value.address());
    }

    // --- [ btSoftBodyWorldInfo_setWater_offset ] ---

    public static void btSoftBodyWorldInfo_setWater_offset(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBodyWorldInfo_setWater_offset;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBodyWorldInfo_delete ] ---

    public static void btSoftBodyWorldInfo_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBodyWorldInfo_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_AJoint_IControlWrapper_new ] ---

    @NativeType("void *")
    public static long btSoftBody_AJoint_IControlWrapper_new(@NativeType("void *") long PrepareCallback, @NativeType("void *") long SpeedCallback) {
        long __functionAddress = Functions.SoftBody_AJoint_IControlWrapper_new;
        if (CHECKS) {
            check(PrepareCallback);
            check(SpeedCallback);
        }
        return invokePPP(PrepareCallback, SpeedCallback, __functionAddress);
    }

    // --- [ btSoftBody_AJoint_IControlWrapper_getWrapperData ] ---

    @NativeType("void *")
    public static long btSoftBody_AJoint_IControlWrapper_getWrapperData(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_AJoint_IControlWrapper_getWrapperData;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_AJoint_IControlWrapper_setWrapperData ] ---

    public static void btSoftBody_AJoint_IControlWrapper_setWrapperData(@NativeType("void *") long obj, @NativeType("void *") long data) {
        long __functionAddress = Functions.SoftBody_AJoint_IControlWrapper_setWrapperData;
        if (CHECKS) {
            check(obj);
            check(data);
        }
        invokePPV(obj, data, __functionAddress);
    }

    // --- [ btSoftBody_AJoint_IControl_new ] ---

    @NativeType("void *")
    public static long btSoftBody_AJoint_IControl_new() {
        long __functionAddress = Functions.SoftBody_AJoint_IControl_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSoftBody_AJoint_IControl_Default ] ---

    @NativeType("void *")
    public static long btSoftBody_AJoint_IControl_Default() {
        long __functionAddress = Functions.SoftBody_AJoint_IControl_Default;
        return invokeP(__functionAddress);
    }

    // --- [ btSoftBody_AJoint_IControl_Prepare ] ---

    public static void btSoftBody_AJoint_IControl_Prepare(@NativeType("void *") long obj, @NativeType("void *") long __unnamed0) {
        long __functionAddress = Functions.SoftBody_AJoint_IControl_Prepare;
        if (CHECKS) {
            check(obj);
            check(__unnamed0);
        }
        invokePPV(obj, __unnamed0, __functionAddress);
    }

    // --- [ btSoftBody_AJoint_IControl_Speed ] ---

    @NativeType("btScalar")
    public static float btSoftBody_AJoint_IControl_Speed(@NativeType("void *") long obj, @NativeType("void *") long __unnamed0, @NativeType("btScalar") float current) {
        long __functionAddress = Functions.SoftBody_AJoint_IControl_Speed;
        if (CHECKS) {
            check(obj);
            check(__unnamed0);
        }
        return invokePPF(obj, __unnamed0, current, __functionAddress);
    }

    // --- [ btSoftBody_AJoint_IControl_delete ] ---

    public static void btSoftBody_AJoint_IControl_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_AJoint_IControl_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_AJoint_Specs_new ] ---

    @NativeType("void *")
    public static long btSoftBody_AJoint_Specs_new() {
        long __functionAddress = Functions.SoftBody_AJoint_Specs_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSoftBody_AJoint_Specs_getAxis ] ---

    public static void nbtSoftBody_AJoint_Specs_getAxis(long obj, long value) {
        long __functionAddress = Functions.SoftBody_AJoint_Specs_getAxis;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_AJoint_Specs_getAxis(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_AJoint_Specs_getAxis(obj, value.address());
    }

    // --- [ btSoftBody_AJoint_Specs_getIcontrol ] ---

    @NativeType("void *")
    public static long btSoftBody_AJoint_Specs_getIcontrol(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_AJoint_Specs_getIcontrol;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_AJoint_Specs_setAxis ] ---

    public static void nbtSoftBody_AJoint_Specs_setAxis(long obj, long value) {
        long __functionAddress = Functions.SoftBody_AJoint_Specs_setAxis;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_AJoint_Specs_setAxis(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_AJoint_Specs_setAxis(obj, value.address());
    }

    // --- [ btSoftBody_AJoint_Specs_setIcontrol ] ---

    public static void btSoftBody_AJoint_Specs_setIcontrol(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBody_AJoint_Specs_setIcontrol;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_AJoint_getAxis ] ---

    public static long nbtSoftBody_AJoint_getAxis(long obj) {
        long __functionAddress = Functions.SoftBody_AJoint_getAxis;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("btVector3 *")
    public static ΒΤVector3 btSoftBody_AJoint_getAxis(@NativeType("void *") long obj) {
        long __result = nbtSoftBody_AJoint_getAxis(obj);
        return ΒΤVector3.createSafe(__result);
    }

    // --- [ btSoftBody_AJoint_getIcontrol ] ---

    @NativeType("void *")
    public static long btSoftBody_AJoint_getIcontrol(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_AJoint_getIcontrol;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_AJoint_setIcontrol ] ---

    public static void btSoftBody_AJoint_setIcontrol(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBody_AJoint_setIcontrol;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Anchor_getBody ] ---

    @NativeType("void *")
    public static long btSoftBody_Anchor_getBody(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Anchor_getBody;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_Anchor_getC0 ] ---

    public static void nbtSoftBody_Anchor_getC0(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Anchor_getC0;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Anchor_getC0(@NativeType("void *") long obj, @NativeType("btMatrix3x3 *") BTMatrix3x3 value) {
        nbtSoftBody_Anchor_getC0(obj, value.address());
    }

    // --- [ btSoftBody_Anchor_getC1 ] ---

    public static void nbtSoftBody_Anchor_getC1(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Anchor_getC1;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Anchor_getC1(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_Anchor_getC1(obj, value.address());
    }

    // --- [ btSoftBody_Anchor_getC2 ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Anchor_getC2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Anchor_getC2;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Anchor_getInfluence ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Anchor_getInfluence(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Anchor_getInfluence;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Anchor_getLocal ] ---

    public static void nbtSoftBody_Anchor_getLocal(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Anchor_getLocal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Anchor_getLocal(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_Anchor_getLocal(obj, value.address());
    }

    // --- [ btSoftBody_Anchor_getNode ] ---

    @NativeType("void *")
    public static long btSoftBody_Anchor_getNode(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Anchor_getNode;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_Anchor_setBody ] ---

    public static void btSoftBody_Anchor_setBody(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBody_Anchor_setBody;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Anchor_setC0 ] ---

    public static void nbtSoftBody_Anchor_setC0(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Anchor_setC0;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Anchor_setC0(@NativeType("void *") long obj, @NativeType("btMatrix3x3 const *") BTMatrix3x3 value) {
        nbtSoftBody_Anchor_setC0(obj, value.address());
    }

    // --- [ btSoftBody_Anchor_setC1 ] ---

    public static void nbtSoftBody_Anchor_setC1(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Anchor_setC1;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Anchor_setC1(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_Anchor_setC1(obj, value.address());
    }

    // --- [ btSoftBody_Anchor_setC2 ] ---

    public static void btSoftBody_Anchor_setC2(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Anchor_setC2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Anchor_setInfluence ] ---

    public static void btSoftBody_Anchor_setInfluence(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Anchor_setInfluence;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Anchor_setLocal ] ---

    public static void nbtSoftBody_Anchor_setLocal(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Anchor_setLocal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Anchor_setLocal(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_Anchor_setLocal(obj, value.address());
    }

    // --- [ btSoftBody_Anchor_setNode ] ---

    public static void btSoftBody_Anchor_setNode(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBody_Anchor_setNode;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Body_new ] ---

    @NativeType("void *")
    public static long btSoftBody_Body_new() {
        long __functionAddress = Functions.SoftBody_Body_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSoftBody_Body_new2 ] ---

    @NativeType("void *")
    public static long btSoftBody_Body_new2(@NativeType("void *") long colObj) {
        long __functionAddress = Functions.SoftBody_Body_new2;
        if (CHECKS) {
            check(colObj);
        }
        return invokePP(colObj, __functionAddress);
    }

    // --- [ btSoftBody_Body_new3 ] ---

    @NativeType("void *")
    public static long btSoftBody_Body_new3(@NativeType("void *") long p) {
        long __functionAddress = Functions.SoftBody_Body_new3;
        if (CHECKS) {
            check(p);
        }
        return invokePP(p, __functionAddress);
    }

    // --- [ btSoftBody_Body_activate ] ---

    public static void btSoftBody_Body_activate(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Body_activate;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_Body_angularVelocity ] ---

    public static void nbtSoftBody_Body_angularVelocity(long obj, long rpos, long value) {
        long __functionAddress = Functions.SoftBody_Body_angularVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, rpos, value, __functionAddress);
    }

    public static void btSoftBody_Body_angularVelocity(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 rpos, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_Body_angularVelocity(obj, rpos.address(), value.address());
    }

    // --- [ btSoftBody_Body_angularVelocity2 ] ---

    public static void nbtSoftBody_Body_angularVelocity2(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Body_angularVelocity2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Body_angularVelocity2(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_Body_angularVelocity2(obj, value.address());
    }

    // --- [ btSoftBody_Body_applyAImpulse ] ---

    public static void btSoftBody_Body_applyAImpulse(@NativeType("void *") long obj, @NativeType("void *") long impulse) {
        long __functionAddress = Functions.SoftBody_Body_applyAImpulse;
        if (CHECKS) {
            check(obj);
            check(impulse);
        }
        invokePPV(obj, impulse, __functionAddress);
    }

    // --- [ btSoftBody_Body_applyDAImpulse ] ---

    public static void nbtSoftBody_Body_applyDAImpulse(long obj, long impulse) {
        long __functionAddress = Functions.SoftBody_Body_applyDAImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, impulse, __functionAddress);
    }

    public static void btSoftBody_Body_applyDAImpulse(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 impulse) {
        nbtSoftBody_Body_applyDAImpulse(obj, impulse.address());
    }

    // --- [ btSoftBody_Body_applyDCImpulse ] ---

    public static void nbtSoftBody_Body_applyDCImpulse(long obj, long impulse) {
        long __functionAddress = Functions.SoftBody_Body_applyDCImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, impulse, __functionAddress);
    }

    public static void btSoftBody_Body_applyDCImpulse(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 impulse) {
        nbtSoftBody_Body_applyDCImpulse(obj, impulse.address());
    }

    // --- [ btSoftBody_Body_applyDImpulse ] ---

    public static void nbtSoftBody_Body_applyDImpulse(long obj, long impulse, long rpos) {
        long __functionAddress = Functions.SoftBody_Body_applyDImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, impulse, rpos, __functionAddress);
    }

    public static void btSoftBody_Body_applyDImpulse(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 impulse, @NativeType("btVector3 const *") ΒΤVector3 rpos) {
        nbtSoftBody_Body_applyDImpulse(obj, impulse.address(), rpos.address());
    }

    // --- [ btSoftBody_Body_applyImpulse ] ---

    public static void nbtSoftBody_Body_applyImpulse(long obj, long impulse, long rpos) {
        long __functionAddress = Functions.SoftBody_Body_applyImpulse;
        if (CHECKS) {
            check(obj);
            check(impulse);
        }
        invokePPPV(obj, impulse, rpos, __functionAddress);
    }

    public static void btSoftBody_Body_applyImpulse(@NativeType("void *") long obj, @NativeType("void *") long impulse, @NativeType("btVector3 const *") ΒΤVector3 rpos) {
        nbtSoftBody_Body_applyImpulse(obj, impulse, rpos.address());
    }

    // --- [ btSoftBody_Body_applyVAImpulse ] ---

    public static void nbtSoftBody_Body_applyVAImpulse(long obj, long impulse) {
        long __functionAddress = Functions.SoftBody_Body_applyVAImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, impulse, __functionAddress);
    }

    public static void btSoftBody_Body_applyVAImpulse(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 impulse) {
        nbtSoftBody_Body_applyVAImpulse(obj, impulse.address());
    }

    // --- [ btSoftBody_Body_applyVImpulse ] ---

    public static void nbtSoftBody_Body_applyVImpulse(long obj, long impulse, long rpos) {
        long __functionAddress = Functions.SoftBody_Body_applyVImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, impulse, rpos, __functionAddress);
    }

    public static void btSoftBody_Body_applyVImpulse(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 impulse, @NativeType("btVector3 const *") ΒΤVector3 rpos) {
        nbtSoftBody_Body_applyVImpulse(obj, impulse.address(), rpos.address());
    }

    // --- [ btSoftBody_Body_getCollisionObject ] ---

    @NativeType("void *")
    public static long btSoftBody_Body_getCollisionObject(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Body_getCollisionObject;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_Body_getRigid ] ---

    @NativeType("void *")
    public static long btSoftBody_Body_getRigid(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Body_getRigid;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_Body_getSoft ] ---

    @NativeType("void *")
    public static long btSoftBody_Body_getSoft(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Body_getSoft;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_Body_invMass ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Body_invMass(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Body_invMass;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Body_invWorldInertia ] ---

    public static void nbtSoftBody_Body_invWorldInertia(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Body_invWorldInertia;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Body_invWorldInertia(@NativeType("void *") long obj, @NativeType("btMatrix3x3 *") BTMatrix3x3 value) {
        nbtSoftBody_Body_invWorldInertia(obj, value.address());
    }

    // --- [ btSoftBody_Body_linearVelocity ] ---

    public static void nbtSoftBody_Body_linearVelocity(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Body_linearVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Body_linearVelocity(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_Body_linearVelocity(obj, value.address());
    }

    // --- [ btSoftBody_Body_setCollisionObject ] ---

    public static void btSoftBody_Body_setCollisionObject(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBody_Body_setCollisionObject;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Body_setRigid ] ---

    public static void btSoftBody_Body_setRigid(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBody_Body_setRigid;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Body_setSoft ] ---

    public static void btSoftBody_Body_setSoft(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBody_Body_setSoft;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Body_velocity ] ---

    public static void nbtSoftBody_Body_velocity(long obj, long rpos, long value) {
        long __functionAddress = Functions.SoftBody_Body_velocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, rpos, value, __functionAddress);
    }

    public static void btSoftBody_Body_velocity(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 rpos, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_Body_velocity(obj, rpos.address(), value.address());
    }

    // --- [ btSoftBody_Body_xform ] ---

    public static void nbtSoftBody_Body_xform(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Body_xform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Body_xform(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtSoftBody_Body_xform(obj, value.address());
    }

    // --- [ btSoftBody_Body_delete ] ---

    public static void btSoftBody_Body_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Body_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_Body_array_at ] ---

    @NativeType("void *")
    public static long btSoftBody_Body_array_at(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.SoftBody_Body_array_at;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btSoftBody_CJoint_getFriction ] ---

    @NativeType("btScalar")
    public static float btSoftBody_CJoint_getFriction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_CJoint_getFriction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_CJoint_getLife ] ---

    public static int btSoftBody_CJoint_getLife(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_CJoint_getLife;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBody_CJoint_getMaxlife ] ---

    public static int btSoftBody_CJoint_getMaxlife(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_CJoint_getMaxlife;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBody_CJoint_getNormal ] ---

    public static void nbtSoftBody_CJoint_getNormal(long obj, long value) {
        long __functionAddress = Functions.SoftBody_CJoint_getNormal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_CJoint_getNormal(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_CJoint_getNormal(obj, value.address());
    }

    // --- [ btSoftBody_CJoint_getRpos ] ---

    public static long nbtSoftBody_CJoint_getRpos(long obj) {
        long __functionAddress = Functions.SoftBody_CJoint_getRpos;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("btVector3 *")
    public static ΒΤVector3 btSoftBody_CJoint_getRpos(@NativeType("void *") long obj) {
        long __result = nbtSoftBody_CJoint_getRpos(obj);
        return ΒΤVector3.createSafe(__result);
    }

    // --- [ btSoftBody_CJoint_setFriction ] ---

    public static void btSoftBody_CJoint_setFriction(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_CJoint_setFriction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_CJoint_setLife ] ---

    public static void btSoftBody_CJoint_setLife(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.SoftBody_CJoint_setLife;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_CJoint_setMaxlife ] ---

    public static void btSoftBody_CJoint_setMaxlife(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.SoftBody_CJoint_setMaxlife;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_CJoint_setNormal ] ---

    public static void nbtSoftBody_CJoint_setNormal(long obj, long value) {
        long __functionAddress = Functions.SoftBody_CJoint_setNormal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_CJoint_setNormal(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_CJoint_setNormal(obj, value.address());
    }

    // --- [ btSoftBody_Cluster_getAdamping ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Cluster_getAdamping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Cluster_getAdamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_getAv ] ---

    public static void nbtSoftBody_Cluster_getAv(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Cluster_getAv;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Cluster_getAv(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_Cluster_getAv(obj, value.address());
    }

    // --- [ btSoftBody_Cluster_getClusterIndex ] ---

    public static int btSoftBody_Cluster_getClusterIndex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Cluster_getClusterIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_getCollide ] ---

    @NativeType("bool")
    public static boolean btSoftBody_Cluster_getCollide(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Cluster_getCollide;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_getCom ] ---

    public static void nbtSoftBody_Cluster_getCom(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Cluster_getCom;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Cluster_getCom(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_Cluster_getCom(obj, value.address());
    }

    // --- [ btSoftBody_Cluster_getContainsAnchor ] ---

    @NativeType("bool")
    public static boolean btSoftBody_Cluster_getContainsAnchor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Cluster_getContainsAnchor;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_getDimpulses ] ---

    @NativeType("btVector3[2]")
    public static PointerBuffer btSoftBody_Cluster_getDimpulses(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Cluster_getDimpulses;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memPointerBuffer(__result, 2);
    }

    // --- [ btSoftBody_Cluster_getFramexform ] ---

    public static void nbtSoftBody_Cluster_getFramexform(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Cluster_getFramexform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Cluster_getFramexform(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtSoftBody_Cluster_getFramexform(obj, value.address());
    }

    // --- [ btSoftBody_Cluster_getIdmass ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Cluster_getIdmass(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Cluster_getIdmass;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_getImass ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Cluster_getImass(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Cluster_getImass;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_getInvwi ] ---

    public static void nbtSoftBody_Cluster_getInvwi(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Cluster_getInvwi;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Cluster_getInvwi(@NativeType("void *") long obj, @NativeType("btMatrix3x3 *") BTMatrix3x3 value) {
        nbtSoftBody_Cluster_getInvwi(obj, value.address());
    }

    // --- [ btSoftBody_Cluster_getLdamping ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Cluster_getLdamping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Cluster_getLdamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_getLeaf ] ---

    @NativeType("void *")
    public static long btSoftBody_Cluster_getLeaf(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Cluster_getLeaf;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_getLocii ] ---

    public static void nbtSoftBody_Cluster_getLocii(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Cluster_getLocii;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Cluster_getLocii(@NativeType("void *") long obj, @NativeType("btMatrix3x3 *") BTMatrix3x3 value) {
        nbtSoftBody_Cluster_getLocii(obj, value.address());
    }

    // --- [ btSoftBody_Cluster_getLv ] ---

    public static void nbtSoftBody_Cluster_getLv(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Cluster_getLv;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Cluster_getLv(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_Cluster_getLv(obj, value.address());
    }

    // --- [ btSoftBody_Cluster_getMasses ] ---

    @NativeType("void *")
    public static long btSoftBody_Cluster_getMasses(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Cluster_getMasses;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_getMatching ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Cluster_getMatching(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Cluster_getMatching;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_getMaxSelfCollisionImpulse ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Cluster_getMaxSelfCollisionImpulse(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Cluster_getMaxSelfCollisionImpulse;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_getNdamping ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Cluster_getNdamping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Cluster_getNdamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_getNdimpulses ] ---

    public static int btSoftBody_Cluster_getNdimpulses(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Cluster_getNdimpulses;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_getNodes ] ---

    @NativeType("void *")
    public static long btSoftBody_Cluster_getNodes(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Cluster_getNodes;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_getNvimpulses ] ---

    public static int btSoftBody_Cluster_getNvimpulses(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Cluster_getNvimpulses;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_getSelfCollisionImpulseFactor ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Cluster_getSelfCollisionImpulseFactor(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Cluster_getSelfCollisionImpulseFactor;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_getVimpulses ] ---

    @NativeType("btVector3[2]")
    public static PointerBuffer btSoftBody_Cluster_getVimpulses(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Cluster_getVimpulses;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memPointerBuffer(__result, 2);
    }

    // --- [ btSoftBody_Cluster_setAdamping ] ---

    public static void btSoftBody_Cluster_setAdamping(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Cluster_setAdamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_setAv ] ---

    public static void nbtSoftBody_Cluster_setAv(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Cluster_setAv;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Cluster_setAv(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_Cluster_setAv(obj, value.address());
    }

    // --- [ btSoftBody_Cluster_setClusterIndex ] ---

    public static void btSoftBody_Cluster_setClusterIndex(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.SoftBody_Cluster_setClusterIndex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_setCollide ] ---

    public static void btSoftBody_Cluster_setCollide(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.SoftBody_Cluster_setCollide;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_setCom ] ---

    public static void nbtSoftBody_Cluster_setCom(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Cluster_setCom;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Cluster_setCom(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_Cluster_setCom(obj, value.address());
    }

    // --- [ btSoftBody_Cluster_setContainsAnchor ] ---

    public static void btSoftBody_Cluster_setContainsAnchor(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.SoftBody_Cluster_setContainsAnchor;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_setFramexform ] ---

    public static void nbtSoftBody_Cluster_setFramexform(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Cluster_setFramexform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Cluster_setFramexform(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform value) {
        nbtSoftBody_Cluster_setFramexform(obj, value.address());
    }

    // --- [ btSoftBody_Cluster_setIdmass ] ---

    public static void btSoftBody_Cluster_setIdmass(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Cluster_setIdmass;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_setImass ] ---

    public static void btSoftBody_Cluster_setImass(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Cluster_setImass;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_setInvwi ] ---

    public static void nbtSoftBody_Cluster_setInvwi(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Cluster_setInvwi;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Cluster_setInvwi(@NativeType("void *") long obj, @NativeType("btMatrix3x3 const *") BTMatrix3x3 value) {
        nbtSoftBody_Cluster_setInvwi(obj, value.address());
    }

    // --- [ btSoftBody_Cluster_setLdamping ] ---

    public static void btSoftBody_Cluster_setLdamping(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Cluster_setLdamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_setLeaf ] ---

    public static void btSoftBody_Cluster_setLeaf(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBody_Cluster_setLeaf;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_setLocii ] ---

    public static void nbtSoftBody_Cluster_setLocii(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Cluster_setLocii;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Cluster_setLocii(@NativeType("void *") long obj, @NativeType("btMatrix3x3 const *") BTMatrix3x3 value) {
        nbtSoftBody_Cluster_setLocii(obj, value.address());
    }

    // --- [ btSoftBody_Cluster_setLv ] ---

    public static void nbtSoftBody_Cluster_setLv(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Cluster_setLv;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Cluster_setLv(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_Cluster_setLv(obj, value.address());
    }

    // --- [ btSoftBody_Cluster_setMatching ] ---

    public static void btSoftBody_Cluster_setMatching(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Cluster_setMatching;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_setMaxSelfCollisionImpulse ] ---

    public static void btSoftBody_Cluster_setMaxSelfCollisionImpulse(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Cluster_setMaxSelfCollisionImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_setNdamping ] ---

    public static void btSoftBody_Cluster_setNdamping(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Cluster_setNdamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_setNdimpulses ] ---

    public static void btSoftBody_Cluster_setNdimpulses(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.SoftBody_Cluster_setNdimpulses;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_setNvimpulses ] ---

    public static void btSoftBody_Cluster_setNvimpulses(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.SoftBody_Cluster_setNvimpulses;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Cluster_setSelfCollisionImpulseFactor ] ---

    public static void btSoftBody_Cluster_setSelfCollisionImpulseFactor(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Cluster_setSelfCollisionImpulseFactor;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_getAeromodel ] ---

    public static int btSoftBody_Config_getAeromodel(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getAeromodel;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getCiterations ] ---

    public static int btSoftBody_Config_getCiterations(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getCiterations;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getCollisions ] ---

    public static int btSoftBody_Config_getCollisions(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getCollisions;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getDiterations ] ---

    public static int btSoftBody_Config_getDiterations(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getDiterations;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getDsequence ] ---

    @NativeType("void *")
    public static long btSoftBody_Config_getDsequence(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getDsequence;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getKAHR ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Config_getKAHR(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getKAHR;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getKCHR ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Config_getKCHR(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getKCHR;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getKDF ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Config_getKDF(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getKDF;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getKDG ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Config_getKDG(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getKDG;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getKDP ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Config_getKDP(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getKDP;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getKKHR ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Config_getKKHR(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getKKHR;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getKLF ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Config_getKLF(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getKLF;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getKMT ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Config_getKMT(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getKMT;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getKPR ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Config_getKPR(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getKPR;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getKSHR ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Config_getKSHR(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getKSHR;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getKSK_SPLT_CL ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Config_getKSK_SPLT_CL(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getKSK_SPLT_CL;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getKSKHR_CL ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Config_getKSKHR_CL(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getKSKHR_CL;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getKSR_SPLT_CL ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Config_getKSR_SPLT_CL(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getKSR_SPLT_CL;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getKSRHR_CL ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Config_getKSRHR_CL(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getKSRHR_CL;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getKSS_SPLT_CL ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Config_getKSS_SPLT_CL(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getKSS_SPLT_CL;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getKSSHR_CL ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Config_getKSSHR_CL(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getKSSHR_CL;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getKVC ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Config_getKVC(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getKVC;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getKVCF ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Config_getKVCF(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getKVCF;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getMaxvolume ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Config_getMaxvolume(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getMaxvolume;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getPiterations ] ---

    public static int btSoftBody_Config_getPiterations(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getPiterations;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getPsequence ] ---

    @NativeType("void *")
    public static long btSoftBody_Config_getPsequence(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getPsequence;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getTimescale ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Config_getTimescale(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getTimescale;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getViterations ] ---

    public static int btSoftBody_Config_getViterations(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getViterations;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_getVsequence ] ---

    @NativeType("void *")
    public static long btSoftBody_Config_getVsequence(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Config_getVsequence;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_Config_setAeromodel ] ---

    public static void btSoftBody_Config_setAeromodel(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.SoftBody_Config_setAeromodel;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setCiterations ] ---

    public static void btSoftBody_Config_setCiterations(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.SoftBody_Config_setCiterations;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setCollisions ] ---

    public static void btSoftBody_Config_setCollisions(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.SoftBody_Config_setCollisions;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setDiterations ] ---

    public static void btSoftBody_Config_setDiterations(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.SoftBody_Config_setDiterations;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setKAHR ] ---

    public static void btSoftBody_Config_setKAHR(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Config_setKAHR;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setKCHR ] ---

    public static void btSoftBody_Config_setKCHR(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Config_setKCHR;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setKDF ] ---

    public static void btSoftBody_Config_setKDF(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Config_setKDF;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setKDG ] ---

    public static void btSoftBody_Config_setKDG(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Config_setKDG;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setKDP ] ---

    public static void btSoftBody_Config_setKDP(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Config_setKDP;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setKKHR ] ---

    public static void btSoftBody_Config_setKKHR(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Config_setKKHR;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setKLF ] ---

    public static void btSoftBody_Config_setKLF(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Config_setKLF;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setKMT ] ---

    public static void btSoftBody_Config_setKMT(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Config_setKMT;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setKPR ] ---

    public static void btSoftBody_Config_setKPR(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Config_setKPR;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setKSHR ] ---

    public static void btSoftBody_Config_setKSHR(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Config_setKSHR;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setKSK_SPLT_CL ] ---

    public static void btSoftBody_Config_setKSK_SPLT_CL(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Config_setKSK_SPLT_CL;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setKSKHR_CL ] ---

    public static void btSoftBody_Config_setKSKHR_CL(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Config_setKSKHR_CL;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setKSR_SPLT_CL ] ---

    public static void btSoftBody_Config_setKSR_SPLT_CL(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Config_setKSR_SPLT_CL;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setKSRHR_CL ] ---

    public static void btSoftBody_Config_setKSRHR_CL(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Config_setKSRHR_CL;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setKSS_SPLT_CL ] ---

    public static void btSoftBody_Config_setKSS_SPLT_CL(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Config_setKSS_SPLT_CL;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setKSSHR_CL ] ---

    public static void btSoftBody_Config_setKSSHR_CL(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Config_setKSSHR_CL;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setKVC ] ---

    public static void btSoftBody_Config_setKVC(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Config_setKVC;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setKVCF ] ---

    public static void btSoftBody_Config_setKVCF(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Config_setKVCF;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setMaxvolume ] ---

    public static void btSoftBody_Config_setMaxvolume(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Config_setMaxvolume;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setPiterations ] ---

    public static void btSoftBody_Config_setPiterations(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.SoftBody_Config_setPiterations;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setTimescale ] ---

    public static void btSoftBody_Config_setTimescale(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Config_setTimescale;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Config_setViterations ] ---

    public static void btSoftBody_Config_setViterations(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.SoftBody_Config_setViterations;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Element_getTag ] ---

    @NativeType("void *")
    public static long btSoftBody_Element_getTag(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Element_getTag;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_Element_setTag ] ---

    public static void btSoftBody_Element_setTag(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBody_Element_setTag;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Element_delete ] ---

    public static void btSoftBody_Element_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Element_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_Face_getLeaf ] ---

    @NativeType("void *")
    public static long btSoftBody_Face_getLeaf(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Face_getLeaf;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_Face_getN ] ---

    @NativeType("void *[3]")
    public static PointerBuffer btSoftBody_Face_getN(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Face_getN;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memPointerBuffer(__result, 3);
    }

    // --- [ btSoftBody_Face_getNormal ] ---

    public static void nbtSoftBody_Face_getNormal(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Face_getNormal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Face_getNormal(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_Face_getNormal(obj, value.address());
    }

    // --- [ btSoftBody_Face_getRa ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Face_getRa(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Face_getRa;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Face_setLeaf ] ---

    public static void btSoftBody_Face_setLeaf(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBody_Face_setLeaf;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Face_setNormal ] ---

    public static void nbtSoftBody_Face_setNormal(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Face_setNormal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Face_setNormal(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_Face_setNormal(obj, value.address());
    }

    // --- [ btSoftBody_Face_setRa ] ---

    public static void btSoftBody_Face_setRa(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Face_setRa;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Feature_getMaterial ] ---

    @NativeType("void *")
    public static long btSoftBody_Feature_getMaterial(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Feature_getMaterial;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_Feature_setMaterial ] ---

    public static void btSoftBody_Feature_setMaterial(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBody_Feature_setMaterial;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_ImplicitFnWrapper_new ] ---

    @NativeType("void *")
    public static long btSoftBody_ImplicitFnWrapper_new(@NativeType("void *") long EvalCallback) {
        long __functionAddress = Functions.SoftBody_ImplicitFnWrapper_new;
        if (CHECKS) {
            check(EvalCallback);
        }
        return invokePP(EvalCallback, __functionAddress);
    }

    // --- [ btSoftBody_ImplicitFn_Eval ] ---

    public static float nbtSoftBody_ImplicitFn_Eval(long obj, long x) {
        long __functionAddress = Functions.SoftBody_ImplicitFn_Eval;
        if (CHECKS) {
            check(obj);
        }
        return invokePPF(obj, x, __functionAddress);
    }

    @NativeType("btScalar")
    public static float btSoftBody_ImplicitFn_Eval(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 x) {
        return nbtSoftBody_ImplicitFn_Eval(obj, x.address());
    }

    // --- [ btSoftBody_ImplicitFn_delete ] ---

    public static void btSoftBody_ImplicitFn_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_ImplicitFn_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_Impulse_new ] ---

    @NativeType("void *")
    public static long btSoftBody_Impulse_new() {
        long __functionAddress = Functions.SoftBody_Impulse_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSoftBody_Impulse_getAsDrift ] ---

    public static int btSoftBody_Impulse_getAsDrift(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Impulse_getAsDrift;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBody_Impulse_getAsVelocity ] ---

    public static int btSoftBody_Impulse_getAsVelocity(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Impulse_getAsVelocity;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBody_Impulse_getDrift ] ---

    public static void nbtSoftBody_Impulse_getDrift(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Impulse_getDrift;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Impulse_getDrift(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_Impulse_getDrift(obj, value.address());
    }

    // --- [ btSoftBody_Impulse_getVelocity ] ---

    public static void nbtSoftBody_Impulse_getVelocity(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Impulse_getVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Impulse_getVelocity(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_Impulse_getVelocity(obj, value.address());
    }

    // --- [ btSoftBody_Impulse_operator_n ] ---

    @NativeType("void *")
    public static long btSoftBody_Impulse_operator_n(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Impulse_operator_n;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_Impulse_operator_m ] ---

    @NativeType("void *")
    public static long btSoftBody_Impulse_operator_m(@NativeType("void *") long obj, @NativeType("btScalar") float x) {
        long __functionAddress = Functions.SoftBody_Impulse_operator_m;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, x, __functionAddress);
    }

    // --- [ btSoftBody_Impulse_setAsDrift ] ---

    public static void btSoftBody_Impulse_setAsDrift(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.SoftBody_Impulse_setAsDrift;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Impulse_setAsVelocity ] ---

    public static void btSoftBody_Impulse_setAsVelocity(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.SoftBody_Impulse_setAsVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Impulse_setDrift ] ---

    public static void nbtSoftBody_Impulse_setDrift(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Impulse_setDrift;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Impulse_setDrift(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_Impulse_setDrift(obj, value.address());
    }

    // --- [ btSoftBody_Impulse_setVelocity ] ---

    public static void nbtSoftBody_Impulse_setVelocity(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Impulse_setVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Impulse_setVelocity(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_Impulse_setVelocity(obj, value.address());
    }

    // --- [ btSoftBody_Impulse_delete ] ---

    public static void btSoftBody_Impulse_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Impulse_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_Joint_Specs_new ] ---

    @NativeType("void *")
    public static long btSoftBody_Joint_Specs_new() {
        long __functionAddress = Functions.SoftBody_Joint_Specs_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSoftBody_Joint_Specs_getCfm ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Joint_Specs_getCfm(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Joint_Specs_getCfm;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Joint_Specs_getErp ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Joint_Specs_getErp(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Joint_Specs_getErp;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Joint_Specs_getSplit ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Joint_Specs_getSplit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Joint_Specs_getSplit;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Joint_Specs_setCfm ] ---

    public static void btSoftBody_Joint_Specs_setCfm(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Joint_Specs_setCfm;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Joint_Specs_setErp ] ---

    public static void btSoftBody_Joint_Specs_setErp(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Joint_Specs_setErp;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Joint_Specs_setSplit ] ---

    public static void btSoftBody_Joint_Specs_setSplit(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Joint_Specs_setSplit;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Joint_Specs_delete ] ---

    public static void btSoftBody_Joint_Specs_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Joint_Specs_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_Joint_getBodies ] ---

    @NativeType("void *")
    public static long btSoftBody_Joint_getBodies(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Joint_getBodies;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_Joint_getCfm ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Joint_getCfm(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Joint_getCfm;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Joint_getDelete ] ---

    @NativeType("bool")
    public static boolean btSoftBody_Joint_getDelete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Joint_getDelete;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btSoftBody_Joint_getDrift ] ---

    public static void nbtSoftBody_Joint_getDrift(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Joint_getDrift;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Joint_getDrift(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_Joint_getDrift(obj, value.address());
    }

    // --- [ btSoftBody_Joint_getErp ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Joint_getErp(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Joint_getErp;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Joint_getMassmatrix ] ---

    public static void nbtSoftBody_Joint_getMassmatrix(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Joint_getMassmatrix;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Joint_getMassmatrix(@NativeType("void *") long obj, @NativeType("btMatrix3x3 *") BTMatrix3x3 value) {
        nbtSoftBody_Joint_getMassmatrix(obj, value.address());
    }

    // --- [ btSoftBody_Joint_getRefs ] ---

    public static long nbtSoftBody_Joint_getRefs(long obj) {
        long __functionAddress = Functions.SoftBody_Joint_getRefs;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("btVector3 *")
    public static ΒΤVector3 btSoftBody_Joint_getRefs(@NativeType("void *") long obj) {
        long __result = nbtSoftBody_Joint_getRefs(obj);
        return ΒΤVector3.createSafe(__result);
    }

    // --- [ btSoftBody_Joint_getSdrift ] ---

    public static void nbtSoftBody_Joint_getSdrift(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Joint_getSdrift;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Joint_getSdrift(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_Joint_getSdrift(obj, value.address());
    }

    // --- [ btSoftBody_Joint_getSplit ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Joint_getSplit(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Joint_getSplit;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Joint_Prepare ] ---

    public static void btSoftBody_Joint_Prepare(@NativeType("void *") long obj, @NativeType("btScalar") float dt, int iterations) {
        long __functionAddress = Functions.SoftBody_Joint_Prepare;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, dt, iterations, __functionAddress);
    }

    // --- [ btSoftBody_Joint_setCfm ] ---

    public static void btSoftBody_Joint_setCfm(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Joint_setCfm;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Joint_setDelete ] ---

    public static void btSoftBody_Joint_setDelete(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.SoftBody_Joint_setDelete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Joint_setDrift ] ---

    public static void nbtSoftBody_Joint_setDrift(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Joint_setDrift;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Joint_setDrift(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_Joint_setDrift(obj, value.address());
    }

    // --- [ btSoftBody_Joint_setErp ] ---

    public static void btSoftBody_Joint_setErp(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Joint_setErp;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Joint_setMassmatrix ] ---

    public static void nbtSoftBody_Joint_setMassmatrix(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Joint_setMassmatrix;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Joint_setMassmatrix(@NativeType("void *") long obj, @NativeType("btMatrix3x3 const *") BTMatrix3x3 value) {
        nbtSoftBody_Joint_setMassmatrix(obj, value.address());
    }

    // --- [ btSoftBody_Joint_setSdrift ] ---

    public static void nbtSoftBody_Joint_setSdrift(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Joint_setSdrift;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Joint_setSdrift(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_Joint_setSdrift(obj, value.address());
    }

    // --- [ btSoftBody_Joint_setSplit ] ---

    public static void btSoftBody_Joint_setSplit(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Joint_setSplit;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Joint_Solve ] ---

    public static void btSoftBody_Joint_Solve(@NativeType("void *") long obj, @NativeType("btScalar") float dt, @NativeType("btScalar") float sor) {
        long __functionAddress = Functions.SoftBody_Joint_Solve;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, dt, sor, __functionAddress);
    }

    // --- [ btSoftBody_Joint_Terminate ] ---

    public static void btSoftBody_Joint_Terminate(@NativeType("void *") long obj, @NativeType("btScalar") float dt) {
        long __functionAddress = Functions.SoftBody_Joint_Terminate;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, dt, __functionAddress);
    }

    // --- [ btSoftBody_Joint_Type ] ---

    public static void btSoftBody_Joint_Type(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Joint_Type;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_Joint_delete ] ---

    public static void btSoftBody_Joint_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Joint_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_Link_new ] ---

    @NativeType("void *")
    public static long btSoftBody_Link_new() {
        long __functionAddress = Functions.SoftBody_Link_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSoftBody_Link_new2 ] ---

    @NativeType("void *")
    public static long btSoftBody_Link_new2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Link_new2;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_Link_getBbending ] ---

    public static int btSoftBody_Link_getBbending(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Link_getBbending;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBody_Link_getC0 ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Link_getC0(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Link_getC0;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Link_getC1 ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Link_getC1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Link_getC1;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Link_getC2 ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Link_getC2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Link_getC2;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Link_getC3 ] ---

    public static void nbtSoftBody_Link_getC3(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Link_getC3;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Link_getC3(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_Link_getC3(obj, value.address());
    }

    // --- [ btSoftBody_Link_getN ] ---

    @NativeType("void *[2]")
    public static PointerBuffer btSoftBody_Link_getN(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Link_getN;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memPointerBuffer(__result, 2);
    }

    // --- [ btSoftBody_Link_getRl ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Link_getRl(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Link_getRl;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Link_setBbending ] ---

    public static void btSoftBody_Link_setBbending(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.SoftBody_Link_setBbending;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Link_setC0 ] ---

    public static void btSoftBody_Link_setC0(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Link_setC0;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Link_setC1 ] ---

    public static void btSoftBody_Link_setC1(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Link_setC1;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Link_setC2 ] ---

    public static void btSoftBody_Link_setC2(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Link_setC2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Link_setC3 ] ---

    public static void nbtSoftBody_Link_setC3(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Link_setC3;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Link_setC3(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_Link_setC3(obj, value.address());
    }

    // --- [ btSoftBody_Link_setRl ] ---

    public static void btSoftBody_Link_setRl(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Link_setRl;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Link_delete ] ---

    public static void btSoftBody_Link_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Link_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_LJoint_Specs_new ] ---

    @NativeType("void *")
    public static long btSoftBody_LJoint_Specs_new() {
        long __functionAddress = Functions.SoftBody_LJoint_Specs_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSoftBody_LJoint_Specs_getPosition ] ---

    public static void nbtSoftBody_LJoint_Specs_getPosition(long obj, long value) {
        long __functionAddress = Functions.SoftBody_LJoint_Specs_getPosition;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_LJoint_Specs_getPosition(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_LJoint_Specs_getPosition(obj, value.address());
    }

    // --- [ btSoftBody_LJoint_Specs_setPosition ] ---

    public static void nbtSoftBody_LJoint_Specs_setPosition(long obj, long value) {
        long __functionAddress = Functions.SoftBody_LJoint_Specs_setPosition;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_LJoint_Specs_setPosition(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_LJoint_Specs_setPosition(obj, value.address());
    }

    // --- [ btSoftBody_LJoint_getRpos ] ---

    public static long nbtSoftBody_LJoint_getRpos(long obj) {
        long __functionAddress = Functions.SoftBody_LJoint_getRpos;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("btVector3 *")
    public static ΒΤVector3 btSoftBody_LJoint_getRpos(@NativeType("void *") long obj) {
        long __result = nbtSoftBody_LJoint_getRpos(obj);
        return ΒΤVector3.createSafe(__result);
    }

    // --- [ btSoftBody_Material_getFlags ] ---

    public static int btSoftBody_Material_getFlags(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Material_getFlags;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBody_Material_getKAST ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Material_getKAST(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Material_getKAST;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Material_getKLST ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Material_getKLST(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Material_getKLST;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Material_getKVST ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Material_getKVST(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Material_getKVST;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Material_setFlags ] ---

    public static void btSoftBody_Material_setFlags(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.SoftBody_Material_setFlags;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Material_setKAST ] ---

    public static void btSoftBody_Material_setKAST(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Material_setKAST;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Material_setKLST ] ---

    public static void btSoftBody_Material_setKLST(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Material_setKLST;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Material_setKVST ] ---

    public static void btSoftBody_Material_setKVST(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Material_setKVST;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Node_getArea ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Node_getArea(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Node_getArea;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Node_getBattach ] ---

    public static int btSoftBody_Node_getBattach(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Node_getBattach;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBody_Node_getF ] ---

    public static void nbtSoftBody_Node_getF(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Node_getF;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Node_getF(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_Node_getF(obj, value.address());
    }

    // --- [ btSoftBody_Node_getIm ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Node_getIm(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Node_getIm;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Node_getLeaf ] ---

    @NativeType("void *")
    public static long btSoftBody_Node_getLeaf(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Node_getLeaf;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_Node_getN ] ---

    public static void nbtSoftBody_Node_getN(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Node_getN;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Node_getN(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_Node_getN(obj, value.address());
    }

    // --- [ btSoftBody_Node_getQ ] ---

    public static void nbtSoftBody_Node_getQ(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Node_getQ;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Node_getQ(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_Node_getQ(obj, value.address());
    }

    // --- [ btSoftBody_Node_getV ] ---

    public static void nbtSoftBody_Node_getV(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Node_getV;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Node_getV(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_Node_getV(obj, value.address());
    }

    // --- [ btSoftBody_Node_getX ] ---

    public static void nbtSoftBody_Node_getX(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Node_getX;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Node_getX(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_Node_getX(obj, value.address());
    }

    // --- [ btSoftBody_Node_setArea ] ---

    public static void btSoftBody_Node_setArea(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Node_setArea;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Node_setBattach ] ---

    public static void btSoftBody_Node_setBattach(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.SoftBody_Node_setBattach;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Node_setF ] ---

    public static void nbtSoftBody_Node_setF(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Node_setF;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Node_setF(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_Node_setF(obj, value.address());
    }

    // --- [ btSoftBody_Node_setIm ] ---

    public static void btSoftBody_Node_setIm(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Node_setIm;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Node_setLeaf ] ---

    public static void btSoftBody_Node_setLeaf(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBody_Node_setLeaf;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Node_setN ] ---

    public static void nbtSoftBody_Node_setN(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Node_setN;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Node_setN(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_Node_setN(obj, value.address());
    }

    // --- [ btSoftBody_Node_setQ ] ---

    public static void nbtSoftBody_Node_setQ(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Node_setQ;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Node_setQ(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_Node_setQ(obj, value.address());
    }

    // --- [ btSoftBody_Node_setV ] ---

    public static void nbtSoftBody_Node_setV(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Node_setV;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Node_setV(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_Node_setV(obj, value.address());
    }

    // --- [ btSoftBody_Node_setX ] ---

    public static void nbtSoftBody_Node_setX(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Node_setX;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Node_setX(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_Node_setX(obj, value.address());
    }

    // --- [ btSoftBody_Note_getCoords ] ---

    @NativeType("btScalar[4]")
    public static FloatBuffer btSoftBody_Note_getCoords(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Note_getCoords;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memFloatBuffer(__result, 4);
    }

    // --- [ btSoftBody_Note_getNodes ] ---

    @NativeType("void *[4]")
    public static PointerBuffer btSoftBody_Note_getNodes(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Note_getNodes;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memPointerBuffer(__result, 4);
    }

    // --- [ btSoftBody_Note_getOffset ] ---

    public static void nbtSoftBody_Note_getOffset(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Note_getOffset;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Note_getOffset(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_Note_getOffset(obj, value.address());
    }

    // --- [ btSoftBody_Note_getRank ] ---

    public static int btSoftBody_Note_getRank(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Note_getRank;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBody_Note_getText ] ---

    public static long nbtSoftBody_Note_getText(long obj) {
        long __functionAddress = Functions.SoftBody_Note_getText;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String btSoftBody_Note_getText(@NativeType("void *") long obj) {
        long __result = nbtSoftBody_Note_getText(obj);
        return memUTF8Safe(__result);
    }

    // --- [ btSoftBody_Note_setOffset ] ---

    public static void nbtSoftBody_Note_setOffset(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Note_setOffset;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Note_setOffset(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_Note_setOffset(obj, value.address());
    }

    // --- [ btSoftBody_Note_setRank ] ---

    public static void btSoftBody_Note_setRank(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.SoftBody_Note_setRank;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Note_setText ] ---

    public static void nbtSoftBody_Note_setText(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Note_setText;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Note_setText(@NativeType("void *") long obj, @NativeType("char const *") ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
        }
        nbtSoftBody_Note_setText(obj, memAddress(value));
    }

    public static void btSoftBody_Note_setText(@NativeType("void *") long obj, @NativeType("char const *") CharSequence value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(value, true);
            long valueEncoded = stack.getPointerAddress();
            nbtSoftBody_Note_setText(obj, valueEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ btSoftBody_Pose_getAqq ] ---

    public static void nbtSoftBody_Pose_getAqq(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Pose_getAqq;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Pose_getAqq(@NativeType("void *") long obj, @NativeType("btMatrix3x3 *") BTMatrix3x3 value) {
        nbtSoftBody_Pose_getAqq(obj, value.address());
    }

    // --- [ btSoftBody_Pose_getBframe ] ---

    @NativeType("bool")
    public static boolean btSoftBody_Pose_getBframe(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Pose_getBframe;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btSoftBody_Pose_getBvolume ] ---

    @NativeType("bool")
    public static boolean btSoftBody_Pose_getBvolume(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Pose_getBvolume;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btSoftBody_Pose_getCom ] ---

    public static void nbtSoftBody_Pose_getCom(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Pose_getCom;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Pose_getCom(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_Pose_getCom(obj, value.address());
    }

    // --- [ btSoftBody_Pose_getRot ] ---

    public static void nbtSoftBody_Pose_getRot(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Pose_getRot;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Pose_getRot(@NativeType("void *") long obj, @NativeType("btMatrix3x3 *") BTMatrix3x3 value) {
        nbtSoftBody_Pose_getRot(obj, value.address());
    }

    // --- [ btSoftBody_Pose_getScl ] ---

    public static void nbtSoftBody_Pose_getScl(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Pose_getScl;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Pose_getScl(@NativeType("void *") long obj, @NativeType("btMatrix3x3 *") BTMatrix3x3 value) {
        nbtSoftBody_Pose_getScl(obj, value.address());
    }

    // --- [ btSoftBody_Pose_getWgh ] ---

    @NativeType("void *")
    public static long btSoftBody_Pose_getWgh(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Pose_getWgh;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_Pose_getVolume ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Pose_getVolume(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Pose_getVolume;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Pose_setAqq ] ---

    public static void nbtSoftBody_Pose_setAqq(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Pose_setAqq;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Pose_setAqq(@NativeType("void *") long obj, @NativeType("btMatrix3x3 const *") BTMatrix3x3 value) {
        nbtSoftBody_Pose_setAqq(obj, value.address());
    }

    // --- [ btSoftBody_Pose_setBframe ] ---

    public static void btSoftBody_Pose_setBframe(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.SoftBody_Pose_setBframe;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Pose_setBvolume ] ---

    public static void btSoftBody_Pose_setBvolume(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.SoftBody_Pose_setBvolume;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Pose_setCom ] ---

    public static void nbtSoftBody_Pose_setCom(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Pose_setCom;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Pose_setCom(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_Pose_setCom(obj, value.address());
    }

    // --- [ btSoftBody_Pose_setRot ] ---

    public static void nbtSoftBody_Pose_setRot(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Pose_setRot;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Pose_setRot(@NativeType("void *") long obj, @NativeType("btMatrix3x3 const *") BTMatrix3x3 value) {
        nbtSoftBody_Pose_setRot(obj, value.address());
    }

    // --- [ btSoftBody_Pose_setScl ] ---

    public static void nbtSoftBody_Pose_setScl(long obj, long value) {
        long __functionAddress = Functions.SoftBody_Pose_setScl;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_Pose_setScl(@NativeType("void *") long obj, @NativeType("btMatrix3x3 const *") BTMatrix3x3 value) {
        nbtSoftBody_Pose_setScl(obj, value.address());
    }

    // --- [ btSoftBody_Pose_setVolume ] ---

    public static void btSoftBody_Pose_setVolume(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Pose_setVolume;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_RayFromToCaster_new ] ---

    public static long nbtSoftBody_RayFromToCaster_new(long rayFrom, long rayTo, float mxt) {
        long __functionAddress = Functions.SoftBody_RayFromToCaster_new;
        return invokePPP(rayFrom, rayTo, mxt, __functionAddress);
    }

    @NativeType("void *")
    public static long btSoftBody_RayFromToCaster_new(@NativeType("btVector3 const *") ΒΤVector3 rayFrom, @NativeType("btVector3 const *") ΒΤVector3 rayTo, @NativeType("btScalar") float mxt) {
        return nbtSoftBody_RayFromToCaster_new(rayFrom.address(), rayTo.address(), mxt);
    }

    // --- [ btSoftBody_RayFromToCaster_getFace ] ---

    @NativeType("void *")
    public static long btSoftBody_RayFromToCaster_getFace(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_RayFromToCaster_getFace;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_RayFromToCaster_getMint ] ---

    @NativeType("btScalar")
    public static float btSoftBody_RayFromToCaster_getMint(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_RayFromToCaster_getMint;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_RayFromToCaster_getRayFrom ] ---

    public static void nbtSoftBody_RayFromToCaster_getRayFrom(long obj, long value) {
        long __functionAddress = Functions.SoftBody_RayFromToCaster_getRayFrom;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_RayFromToCaster_getRayFrom(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_RayFromToCaster_getRayFrom(obj, value.address());
    }

    // --- [ btSoftBody_RayFromToCaster_getRayNormalizedDirection ] ---

    public static void nbtSoftBody_RayFromToCaster_getRayNormalizedDirection(long obj, long value) {
        long __functionAddress = Functions.SoftBody_RayFromToCaster_getRayNormalizedDirection;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_RayFromToCaster_getRayNormalizedDirection(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_RayFromToCaster_getRayNormalizedDirection(obj, value.address());
    }

    // --- [ btSoftBody_RayFromToCaster_getRayTo ] ---

    public static void nbtSoftBody_RayFromToCaster_getRayTo(long obj, long value) {
        long __functionAddress = Functions.SoftBody_RayFromToCaster_getRayTo;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_RayFromToCaster_getRayTo(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_RayFromToCaster_getRayTo(obj, value.address());
    }

    // --- [ btSoftBody_RayFromToCaster_getTests ] ---

    public static int btSoftBody_RayFromToCaster_getTests(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_RayFromToCaster_getTests;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBody_RayFromToCaster_rayFromToTriangle ] ---

    public static float nbtSoftBody_RayFromToCaster_rayFromToTriangle(long rayFrom, long rayTo, long rayNormalizedDirection, long a, long b, long c) {
        long __functionAddress = Functions.SoftBody_RayFromToCaster_rayFromToTriangle;
        return invokePPPPPPF(rayFrom, rayTo, rayNormalizedDirection, a, b, c, __functionAddress);
    }

    @NativeType("btScalar")
    public static float btSoftBody_RayFromToCaster_rayFromToTriangle(@NativeType("btVector3 const *") ΒΤVector3 rayFrom, @NativeType("btVector3 const *") ΒΤVector3 rayTo, @NativeType("btVector3 const *") ΒΤVector3 rayNormalizedDirection, @NativeType("btVector3 const *") ΒΤVector3 a, @NativeType("btVector3 const *") ΒΤVector3 b, @NativeType("btVector3 const *") ΒΤVector3 c) {
        return nbtSoftBody_RayFromToCaster_rayFromToTriangle(rayFrom.address(), rayTo.address(), rayNormalizedDirection.address(), a.address(), b.address(), c.address());
    }

    // --- [ btSoftBody_RayFromToCaster_rayFromToTriangle2 ] ---

    public static float nbtSoftBody_RayFromToCaster_rayFromToTriangle2(long rayFrom, long rayTo, long rayNormalizedDirection, long a, long b, long c, float maxt) {
        long __functionAddress = Functions.SoftBody_RayFromToCaster_rayFromToTriangle2;
        return invokePPPPPPF(rayFrom, rayTo, rayNormalizedDirection, a, b, c, maxt, __functionAddress);
    }

    @NativeType("btScalar")
    public static float btSoftBody_RayFromToCaster_rayFromToTriangle2(@NativeType("btVector3 const *") ΒΤVector3 rayFrom, @NativeType("btVector3 const *") ΒΤVector3 rayTo, @NativeType("btVector3 const *") ΒΤVector3 rayNormalizedDirection, @NativeType("btVector3 const *") ΒΤVector3 a, @NativeType("btVector3 const *") ΒΤVector3 b, @NativeType("btVector3 const *") ΒΤVector3 c, @NativeType("btScalar") float maxt) {
        return nbtSoftBody_RayFromToCaster_rayFromToTriangle2(rayFrom.address(), rayTo.address(), rayNormalizedDirection.address(), a.address(), b.address(), c.address(), maxt);
    }

    // --- [ btSoftBody_RayFromToCaster_setFace ] ---

    public static void btSoftBody_RayFromToCaster_setFace(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBody_RayFromToCaster_setFace;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_RayFromToCaster_setMint ] ---

    public static void btSoftBody_RayFromToCaster_setMint(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_RayFromToCaster_setMint;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_RayFromToCaster_setRayFrom ] ---

    public static void nbtSoftBody_RayFromToCaster_setRayFrom(long obj, long value) {
        long __functionAddress = Functions.SoftBody_RayFromToCaster_setRayFrom;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_RayFromToCaster_setRayFrom(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_RayFromToCaster_setRayFrom(obj, value.address());
    }

    // --- [ btSoftBody_RayFromToCaster_setRayNormalizedDirection ] ---

    public static void nbtSoftBody_RayFromToCaster_setRayNormalizedDirection(long obj, long value) {
        long __functionAddress = Functions.SoftBody_RayFromToCaster_setRayNormalizedDirection;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_RayFromToCaster_setRayNormalizedDirection(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_RayFromToCaster_setRayNormalizedDirection(obj, value.address());
    }

    // --- [ btSoftBody_RayFromToCaster_setRayTo ] ---

    public static void nbtSoftBody_RayFromToCaster_setRayTo(long obj, long value) {
        long __functionAddress = Functions.SoftBody_RayFromToCaster_setRayTo;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_RayFromToCaster_setRayTo(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_RayFromToCaster_setRayTo(obj, value.address());
    }

    // --- [ btSoftBody_RayFromToCaster_setTests ] ---

    public static void btSoftBody_RayFromToCaster_setTests(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.SoftBody_RayFromToCaster_setTests;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_RContact_new ] ---

    @NativeType("void *")
    public static long btSoftBody_RContact_new() {
        long __functionAddress = Functions.SoftBody_RContact_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSoftBody_RContact_getC0 ] ---

    public static void nbtSoftBody_RContact_getC0(long obj, long value) {
        long __functionAddress = Functions.SoftBody_RContact_getC0;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_RContact_getC0(@NativeType("void *") long obj, @NativeType("btMatrix3x3 *") BTMatrix3x3 value) {
        nbtSoftBody_RContact_getC0(obj, value.address());
    }

    // --- [ btSoftBody_RContact_getC1 ] ---

    public static void nbtSoftBody_RContact_getC1(long obj, long value) {
        long __functionAddress = Functions.SoftBody_RContact_getC1;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_RContact_getC1(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_RContact_getC1(obj, value.address());
    }

    // --- [ btSoftBody_RContact_getC2 ] ---

    @NativeType("btScalar")
    public static float btSoftBody_RContact_getC2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_RContact_getC2;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_RContact_getC3 ] ---

    @NativeType("btScalar")
    public static float btSoftBody_RContact_getC3(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_RContact_getC3;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_RContact_getC4 ] ---

    @NativeType("btScalar")
    public static float btSoftBody_RContact_getC4(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_RContact_getC4;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_RContact_getCti ] ---

    @NativeType("void *")
    public static long btSoftBody_RContact_getCti(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_RContact_getCti;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_RContact_getNode ] ---

    @NativeType("void *")
    public static long btSoftBody_RContact_getNode(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_RContact_getNode;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_RContact_setC0 ] ---

    public static void nbtSoftBody_RContact_setC0(long obj, long value) {
        long __functionAddress = Functions.SoftBody_RContact_setC0;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_RContact_setC0(@NativeType("void *") long obj, @NativeType("btMatrix3x3 const *") BTMatrix3x3 value) {
        nbtSoftBody_RContact_setC0(obj, value.address());
    }

    // --- [ btSoftBody_RContact_setC1 ] ---

    public static void nbtSoftBody_RContact_setC1(long obj, long value) {
        long __functionAddress = Functions.SoftBody_RContact_setC1;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_RContact_setC1(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_RContact_setC1(obj, value.address());
    }

    // --- [ btSoftBody_RContact_setC2 ] ---

    public static void btSoftBody_RContact_setC2(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_RContact_setC2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_RContact_setC3 ] ---

    public static void btSoftBody_RContact_setC3(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_RContact_setC3;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_RContact_setC4 ] ---

    public static void btSoftBody_RContact_setC4(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_RContact_setC4;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_RContact_setNode ] ---

    public static void btSoftBody_RContact_setNode(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBody_RContact_setNode;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_RContact_delete ] ---

    public static void btSoftBody_RContact_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_RContact_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_SContact_new ] ---

    @NativeType("void *")
    public static long btSoftBody_SContact_new() {
        long __functionAddress = Functions.SoftBody_SContact_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSoftBody_SContact_getCfm ] ---

    @NativeType("btScalar[2]")
    public static FloatBuffer btSoftBody_SContact_getCfm(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_SContact_getCfm;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memFloatBuffer(__result, 2);
    }

    // --- [ btSoftBody_SContact_getFace ] ---

    @NativeType("void *")
    public static long btSoftBody_SContact_getFace(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_SContact_getFace;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_SContact_getFriction ] ---

    @NativeType("btScalar")
    public static float btSoftBody_SContact_getFriction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_SContact_getFriction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_SContact_getMargin ] ---

    @NativeType("btScalar")
    public static float btSoftBody_SContact_getMargin(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_SContact_getMargin;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_SContact_getNode ] ---

    @NativeType("void *")
    public static long btSoftBody_SContact_getNode(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_SContact_getNode;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_SContact_getNormal ] ---

    public static void nbtSoftBody_SContact_getNormal(long obj, long value) {
        long __functionAddress = Functions.SoftBody_SContact_getNormal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_SContact_getNormal(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_SContact_getNormal(obj, value.address());
    }

    // --- [ btSoftBody_SContact_getWeights ] ---

    public static void nbtSoftBody_SContact_getWeights(long obj, long value) {
        long __functionAddress = Functions.SoftBody_SContact_getWeights;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_SContact_getWeights(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_SContact_getWeights(obj, value.address());
    }

    // --- [ btSoftBody_SContact_setFace ] ---

    public static void btSoftBody_SContact_setFace(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBody_SContact_setFace;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_SContact_setFriction ] ---

    public static void btSoftBody_SContact_setFriction(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_SContact_setFriction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_SContact_setMargin ] ---

    public static void btSoftBody_SContact_setMargin(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_SContact_setMargin;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_SContact_setNode ] ---

    public static void btSoftBody_SContact_setNode(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBody_SContact_setNode;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_SContact_setNormal ] ---

    public static void nbtSoftBody_SContact_setNormal(long obj, long value) {
        long __functionAddress = Functions.SoftBody_SContact_setNormal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_SContact_setNormal(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_SContact_setNormal(obj, value.address());
    }

    // --- [ btSoftBody_SContact_setWeights ] ---

    public static void nbtSoftBody_SContact_setWeights(long obj, long value) {
        long __functionAddress = Functions.SoftBody_SContact_setWeights;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_SContact_setWeights(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_SContact_setWeights(obj, value.address());
    }

    // --- [ btSoftBody_SContact_delete ] ---

    public static void btSoftBody_SContact_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_SContact_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_sCti_new ] ---

    @NativeType("void *")
    public static long btSoftBody_sCti_new() {
        long __functionAddress = Functions.SoftBody_sCti_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSoftBody_sCti_getColObj ] ---

    @NativeType("void *")
    public static long btSoftBody_sCti_getColObj(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_sCti_getColObj;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_sCti_getNormal ] ---

    public static void nbtSoftBody_sCti_getNormal(long obj, long value) {
        long __functionAddress = Functions.SoftBody_sCti_getNormal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_sCti_getNormal(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_sCti_getNormal(obj, value.address());
    }

    // --- [ btSoftBody_sCti_getOffset ] ---

    @NativeType("btScalar")
    public static float btSoftBody_sCti_getOffset(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_sCti_getOffset;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_sCti_setColObj ] ---

    public static void btSoftBody_sCti_setColObj(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBody_sCti_setColObj;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_sCti_setNormal ] ---

    public static void nbtSoftBody_sCti_setNormal(long obj, long value) {
        long __functionAddress = Functions.SoftBody_sCti_setNormal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_sCti_setNormal(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSoftBody_sCti_setNormal(obj, value.address());
    }

    // --- [ btSoftBody_sCti_setOffset ] ---

    public static void btSoftBody_sCti_setOffset(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_sCti_setOffset;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_sCti_delete ] ---

    public static void btSoftBody_sCti_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_sCti_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_SolverState_getIsdt ] ---

    @NativeType("btScalar")
    public static float btSoftBody_SolverState_getIsdt(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_SolverState_getIsdt;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_SolverState_getRadmrg ] ---

    @NativeType("btScalar")
    public static float btSoftBody_SolverState_getRadmrg(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_SolverState_getRadmrg;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_SolverState_getSdt ] ---

    @NativeType("btScalar")
    public static float btSoftBody_SolverState_getSdt(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_SolverState_getSdt;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_SolverState_getUpdmrg ] ---

    @NativeType("btScalar")
    public static float btSoftBody_SolverState_getUpdmrg(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_SolverState_getUpdmrg;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_SolverState_getVelmrg ] ---

    @NativeType("btScalar")
    public static float btSoftBody_SolverState_getVelmrg(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_SolverState_getVelmrg;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_SolverState_setIsdt ] ---

    public static void btSoftBody_SolverState_setIsdt(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_SolverState_setIsdt;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_SolverState_setRadmrg ] ---

    public static void btSoftBody_SolverState_setRadmrg(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_SolverState_setRadmrg;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_SolverState_setSdt ] ---

    public static void btSoftBody_SolverState_setSdt(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_SolverState_setSdt;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_SolverState_setUpdmrg ] ---

    public static void btSoftBody_SolverState_setUpdmrg(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_SolverState_setUpdmrg;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_SolverState_setVelmrg ] ---

    public static void btSoftBody_SolverState_setVelmrg(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_SolverState_setVelmrg;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_sRayCast_new ] ---

    @NativeType("void *")
    public static long btSoftBody_sRayCast_new() {
        long __functionAddress = Functions.SoftBody_sRayCast_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSoftBody_sRayCast_getBody ] ---

    @NativeType("void *")
    public static long btSoftBody_sRayCast_getBody(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_sRayCast_getBody;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_sRayCast_getFeature ] ---

    public static int btSoftBody_sRayCast_getFeature(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_sRayCast_getFeature;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBody_sRayCast_getFraction ] ---

    @NativeType("btScalar")
    public static float btSoftBody_sRayCast_getFraction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_sRayCast_getFraction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_sRayCast_getIndex ] ---

    public static int btSoftBody_sRayCast_getIndex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_sRayCast_getIndex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBody_sRayCast_setBody ] ---

    public static void btSoftBody_sRayCast_setBody(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBody_sRayCast_setBody;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_sRayCast_setFeature ] ---

    public static void btSoftBody_sRayCast_setFeature(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.SoftBody_sRayCast_setFeature;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_sRayCast_setFraction ] ---

    public static void btSoftBody_sRayCast_setFraction(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_sRayCast_setFraction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_sRayCast_setIndex ] ---

    public static void btSoftBody_sRayCast_setIndex(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.SoftBody_sRayCast_setIndex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_sRayCast_delete ] ---

    public static void btSoftBody_sRayCast_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_sRayCast_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_Tetra_getC0 ] ---

    @NativeType("btVector3[4]")
    public static PointerBuffer btSoftBody_Tetra_getC0(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Tetra_getC0;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memPointerBuffer(__result, 4);
    }

    // --- [ btSoftBody_Tetra_getC1 ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Tetra_getC1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Tetra_getC1;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Tetra_getC2 ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Tetra_getC2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Tetra_getC2;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Tetra_getLeaf ] ---

    @NativeType("void *")
    public static long btSoftBody_Tetra_getLeaf(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Tetra_getLeaf;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_Tetra_getN ] ---

    @NativeType("void *[4]")
    public static PointerBuffer btSoftBody_Tetra_getN(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Tetra_getN;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memPointerBuffer(__result, 4);
    }

    // --- [ btSoftBody_Tetra_getRv ] ---

    @NativeType("btScalar")
    public static float btSoftBody_Tetra_getRv(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_Tetra_getRv;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_Tetra_setC1 ] ---

    public static void btSoftBody_Tetra_setC1(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Tetra_setC1;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Tetra_setC2 ] ---

    public static void btSoftBody_Tetra_setC2(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Tetra_setC2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Tetra_setLeaf ] ---

    public static void btSoftBody_Tetra_setLeaf(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBody_Tetra_setLeaf;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_Tetra_setRv ] ---

    public static void btSoftBody_Tetra_setRv(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_Tetra_setRv;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_new ] ---

    public static long nbtSoftBody_new(long worldInfo, int node_count, long x, long m) {
        long __functionAddress = Functions.SoftBody_new;
        if (CHECKS) {
            check(worldInfo);
        }
        return invokePPPP(worldInfo, node_count, x, m, __functionAddress);
    }

    @NativeType("void *")
    public static long btSoftBody_new(@NativeType("void *") long worldInfo, @NativeType("btScalar const *") FloatBuffer x, @NativeType("btScalar const *") FloatBuffer m) {
        return nbtSoftBody_new(worldInfo, x.remaining() / 3, memAddress(x), memAddress(m));
    }

    // --- [ btSoftBody_new2 ] ---

    @NativeType("void *")
    public static long btSoftBody_new2(@NativeType("void *") long worldInfo) {
        long __functionAddress = Functions.SoftBody_new2;
        if (CHECKS) {
            check(worldInfo);
        }
        return invokePP(worldInfo, __functionAddress);
    }

    // --- [ btSoftBody_addAeroForceToFace ] ---

    public static void nbtSoftBody_addAeroForceToFace(long obj, long windVelocity, int faceIndex) {
        long __functionAddress = Functions.SoftBody_addAeroForceToFace;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, windVelocity, faceIndex, __functionAddress);
    }

    public static void btSoftBody_addAeroForceToFace(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 windVelocity, int faceIndex) {
        nbtSoftBody_addAeroForceToFace(obj, windVelocity.address(), faceIndex);
    }

    // --- [ btSoftBody_addAeroForceToNode ] ---

    public static void nbtSoftBody_addAeroForceToNode(long obj, long windVelocity, int nodeIndex) {
        long __functionAddress = Functions.SoftBody_addAeroForceToNode;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, windVelocity, nodeIndex, __functionAddress);
    }

    public static void btSoftBody_addAeroForceToNode(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 windVelocity, int nodeIndex) {
        nbtSoftBody_addAeroForceToNode(obj, windVelocity.address(), nodeIndex);
    }

    // --- [ btSoftBody_addForce ] ---

    public static void nbtSoftBody_addForce(long obj, long force) {
        long __functionAddress = Functions.SoftBody_addForce;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, force, __functionAddress);
    }

    public static void btSoftBody_addForce(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 force) {
        nbtSoftBody_addForce(obj, force.address());
    }

    // --- [ btSoftBody_addForce2 ] ---

    public static void nbtSoftBody_addForce2(long obj, long force, int node) {
        long __functionAddress = Functions.SoftBody_addForce2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, force, node, __functionAddress);
    }

    public static void btSoftBody_addForce2(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 force, int node) {
        nbtSoftBody_addForce2(obj, force.address(), node);
    }

    // --- [ btSoftBody_addVelocity ] ---

    public static void nbtSoftBody_addVelocity(long obj, long velocity) {
        long __functionAddress = Functions.SoftBody_addVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, velocity, __functionAddress);
    }

    public static void btSoftBody_addVelocity(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 velocity) {
        nbtSoftBody_addVelocity(obj, velocity.address());
    }

    // --- [ btSoftBody_addVelocity2 ] ---

    public static void nbtSoftBody_addVelocity2(long obj, long velocity, int node) {
        long __functionAddress = Functions.SoftBody_addVelocity2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, velocity, node, __functionAddress);
    }

    public static void btSoftBody_addVelocity2(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 velocity, int node) {
        nbtSoftBody_addVelocity2(obj, velocity.address(), node);
    }

    // --- [ btSoftBody_appendAnchor ] ---

    public static void nbtSoftBody_appendAnchor(long obj, int node, long body, long localPivot, boolean disableCollisionBetweenLinkedBodies, float influence) {
        long __functionAddress = Functions.SoftBody_appendAnchor;
        if (CHECKS) {
            check(obj);
            check(body);
        }
        invokePPPV(obj, node, body, localPivot, disableCollisionBetweenLinkedBodies, influence, __functionAddress);
    }

    public static void btSoftBody_appendAnchor(@NativeType("void *") long obj, int node, @NativeType("void *") long body, @NativeType("btVector3 const *") ΒΤVector3 localPivot, @NativeType("bool") boolean disableCollisionBetweenLinkedBodies, @NativeType("btScalar") float influence) {
        nbtSoftBody_appendAnchor(obj, node, body, localPivot.address(), disableCollisionBetweenLinkedBodies, influence);
    }

    // --- [ btSoftBody_appendAnchor2 ] ---

    public static void btSoftBody_appendAnchor2(@NativeType("void *") long obj, int node, @NativeType("void *") long body, @NativeType("bool") boolean disableCollisionBetweenLinkedBodies, @NativeType("btScalar") float influence) {
        long __functionAddress = Functions.SoftBody_appendAnchor2;
        if (CHECKS) {
            check(obj);
            check(body);
        }
        invokePPV(obj, node, body, disableCollisionBetweenLinkedBodies, influence, __functionAddress);
    }

    // --- [ btSoftBody_appendAngularJoint ] ---

    public static void btSoftBody_appendAngularJoint(@NativeType("void *") long obj, @NativeType("void *") long specs) {
        long __functionAddress = Functions.SoftBody_appendAngularJoint;
        if (CHECKS) {
            check(obj);
            check(specs);
        }
        invokePPV(obj, specs, __functionAddress);
    }

    // --- [ btSoftBody_appendAngularJoint2 ] ---

    public static void btSoftBody_appendAngularJoint2(@NativeType("void *") long obj, @NativeType("void *") long specs, @NativeType("void *") long body) {
        long __functionAddress = Functions.SoftBody_appendAngularJoint2;
        if (CHECKS) {
            check(obj);
            check(specs);
            check(body);
        }
        invokePPPV(obj, specs, body, __functionAddress);
    }

    // --- [ btSoftBody_appendAngularJoint3 ] ---

    public static void btSoftBody_appendAngularJoint3(@NativeType("void *") long obj, @NativeType("void *") long specs, @NativeType("void *") long body) {
        long __functionAddress = Functions.SoftBody_appendAngularJoint3;
        if (CHECKS) {
            check(obj);
            check(specs);
            check(body);
        }
        invokePPPV(obj, specs, body, __functionAddress);
    }

    // --- [ btSoftBody_appendAngularJoint4 ] ---

    public static void btSoftBody_appendAngularJoint4(@NativeType("void *") long obj, @NativeType("void *") long specs, @NativeType("void *") long body0, @NativeType("void *") long body1) {
        long __functionAddress = Functions.SoftBody_appendAngularJoint4;
        if (CHECKS) {
            check(obj);
            check(specs);
            check(body0);
            check(body1);
        }
        invokePPPPV(obj, specs, body0, body1, __functionAddress);
    }

    // --- [ btSoftBody_appendFace ] ---

    public static void btSoftBody_appendFace(@NativeType("void *") long obj, int model, @NativeType("void *") long mat) {
        long __functionAddress = Functions.SoftBody_appendFace;
        if (CHECKS) {
            check(obj);
            check(mat);
        }
        invokePPV(obj, model, mat, __functionAddress);
    }

    // --- [ btSoftBody_appendFace2 ] ---

    public static void btSoftBody_appendFace2(@NativeType("void *") long obj, int node0, int node1, int node2, @NativeType("void *") long mat) {
        long __functionAddress = Functions.SoftBody_appendFace2;
        if (CHECKS) {
            check(obj);
            check(mat);
        }
        invokePPV(obj, node0, node1, node2, mat, __functionAddress);
    }

    // --- [ btSoftBody_appendLinearJoint ] ---

    public static void btSoftBody_appendLinearJoint(@NativeType("void *") long obj, @NativeType("void *") long specs, @NativeType("void *") long body) {
        long __functionAddress = Functions.SoftBody_appendLinearJoint;
        if (CHECKS) {
            check(obj);
            check(specs);
            check(body);
        }
        invokePPPV(obj, specs, body, __functionAddress);
    }

    // --- [ btSoftBody_appendLinearJoint2 ] ---

    public static void btSoftBody_appendLinearJoint2(@NativeType("void *") long obj, @NativeType("void *") long specs) {
        long __functionAddress = Functions.SoftBody_appendLinearJoint2;
        if (CHECKS) {
            check(obj);
            check(specs);
        }
        invokePPV(obj, specs, __functionAddress);
    }

    // --- [ btSoftBody_appendLinearJoint3 ] ---

    public static void btSoftBody_appendLinearJoint3(@NativeType("void *") long obj, @NativeType("void *") long specs, @NativeType("void *") long body) {
        long __functionAddress = Functions.SoftBody_appendLinearJoint3;
        if (CHECKS) {
            check(obj);
            check(specs);
            check(body);
        }
        invokePPPV(obj, specs, body, __functionAddress);
    }

    // --- [ btSoftBody_appendLinearJoint4 ] ---

    public static void btSoftBody_appendLinearJoint4(@NativeType("void *") long obj, @NativeType("void *") long specs, @NativeType("void *") long body0, @NativeType("void *") long body1) {
        long __functionAddress = Functions.SoftBody_appendLinearJoint4;
        if (CHECKS) {
            check(obj);
            check(specs);
            check(body0);
            check(body1);
        }
        invokePPPPV(obj, specs, body0, body1, __functionAddress);
    }

    // --- [ btSoftBody_appendLink ] ---

    public static void btSoftBody_appendLink(@NativeType("void *") long obj, int node0, int node1, @NativeType("void *") long mat, @NativeType("bool") boolean bcheckexist) {
        long __functionAddress = Functions.SoftBody_appendLink;
        if (CHECKS) {
            check(obj);
            check(mat);
        }
        invokePPV(obj, node0, node1, mat, bcheckexist, __functionAddress);
    }

    // --- [ btSoftBody_appendLink2 ] ---

    public static void btSoftBody_appendLink2(@NativeType("void *") long obj, int model, @NativeType("void *") long mat) {
        long __functionAddress = Functions.SoftBody_appendLink2;
        if (CHECKS) {
            check(obj);
            check(mat);
        }
        invokePPV(obj, model, mat, __functionAddress);
    }

    // --- [ btSoftBody_appendLink3 ] ---

    public static void btSoftBody_appendLink3(@NativeType("void *") long obj, @NativeType("void *") long node0, @NativeType("void *") long node1, @NativeType("void *") long mat, @NativeType("bool") boolean bcheckexist) {
        long __functionAddress = Functions.SoftBody_appendLink3;
        if (CHECKS) {
            check(obj);
            check(node0);
            check(node1);
            check(mat);
        }
        invokePPPPV(obj, node0, node1, mat, bcheckexist, __functionAddress);
    }

    // --- [ btSoftBody_appendMaterial ] ---

    @NativeType("void *")
    public static long btSoftBody_appendMaterial(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_appendMaterial;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_appendNode ] ---

    public static void nbtSoftBody_appendNode(long obj, long x, float m) {
        long __functionAddress = Functions.SoftBody_appendNode;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, x, m, __functionAddress);
    }

    public static void btSoftBody_appendNode(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 x, @NativeType("btScalar") float m) {
        nbtSoftBody_appendNode(obj, x.address(), m);
    }

    // --- [ btSoftBody_appendNote ] ---

    public static void nbtSoftBody_appendNote(long obj, long text, long o, long feature) {
        long __functionAddress = Functions.SoftBody_appendNote;
        if (CHECKS) {
            check(obj);
            check(feature);
        }
        invokePPPPV(obj, text, o, feature, __functionAddress);
    }

    public static void btSoftBody_appendNote(@NativeType("void *") long obj, @NativeType("char const *") ByteBuffer text, @NativeType("btVector3 const *") ΒΤVector3 o, @NativeType("void *") long feature) {
        if (CHECKS) {
            checkNT1(text);
        }
        nbtSoftBody_appendNote(obj, memAddress(text), o.address(), feature);
    }

    public static void btSoftBody_appendNote(@NativeType("void *") long obj, @NativeType("char const *") CharSequence text, @NativeType("btVector3 const *") ΒΤVector3 o, @NativeType("void *") long feature) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            nbtSoftBody_appendNote(obj, textEncoded, o.address(), feature);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ btSoftBody_appendNote2 ] ---

    public static void nbtSoftBody_appendNote2(long obj, long text, long o, long feature) {
        long __functionAddress = Functions.SoftBody_appendNote2;
        if (CHECKS) {
            check(obj);
            check(feature);
        }
        invokePPPPV(obj, text, o, feature, __functionAddress);
    }

    public static void btSoftBody_appendNote2(@NativeType("void *") long obj, @NativeType("char const *") ByteBuffer text, @NativeType("btVector3 const *") ΒΤVector3 o, @NativeType("void *") long feature) {
        if (CHECKS) {
            checkNT1(text);
        }
        nbtSoftBody_appendNote2(obj, memAddress(text), o.address(), feature);
    }

    public static void btSoftBody_appendNote2(@NativeType("void *") long obj, @NativeType("char const *") CharSequence text, @NativeType("btVector3 const *") ΒΤVector3 o, @NativeType("void *") long feature) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            nbtSoftBody_appendNote2(obj, textEncoded, o.address(), feature);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ btSoftBody_appendNote3 ] ---

    public static void nbtSoftBody_appendNote3(long obj, long text, long o, long feature) {
        long __functionAddress = Functions.SoftBody_appendNote3;
        if (CHECKS) {
            check(obj);
            check(feature);
        }
        invokePPPPV(obj, text, o, feature, __functionAddress);
    }

    public static void btSoftBody_appendNote3(@NativeType("void *") long obj, @NativeType("char const *") ByteBuffer text, @NativeType("btVector3 const *") ΒΤVector3 o, @NativeType("void *") long feature) {
        if (CHECKS) {
            checkNT1(text);
        }
        nbtSoftBody_appendNote3(obj, memAddress(text), o.address(), feature);
    }

    public static void btSoftBody_appendNote3(@NativeType("void *") long obj, @NativeType("char const *") CharSequence text, @NativeType("btVector3 const *") ΒΤVector3 o, @NativeType("void *") long feature) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            nbtSoftBody_appendNote3(obj, textEncoded, o.address(), feature);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ btSoftBody_appendNote4 ] ---

    public static void nbtSoftBody_appendNote4(long obj, long text, long o) {
        long __functionAddress = Functions.SoftBody_appendNote4;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, text, o, __functionAddress);
    }

    public static void btSoftBody_appendNote4(@NativeType("void *") long obj, @NativeType("char const *") ByteBuffer text, @NativeType("btVector3 const *") ΒΤVector3 o) {
        if (CHECKS) {
            checkNT1(text);
        }
        nbtSoftBody_appendNote4(obj, memAddress(text), o.address());
    }

    public static void btSoftBody_appendNote4(@NativeType("void *") long obj, @NativeType("char const *") CharSequence text, @NativeType("btVector3 const *") ΒΤVector3 o) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            nbtSoftBody_appendNote4(obj, textEncoded, o.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ btSoftBody_appendNote5 ] ---

    public static void nbtSoftBody_appendNote5(long obj, long text, long o, long c, long n0, long n1, long n2, long n3) {
        long __functionAddress = Functions.SoftBody_appendNote5;
        if (CHECKS) {
            check(obj);
            check(n0);
            check(n1);
            check(n2);
            check(n3);
        }
        invokePPPPPPPPV(obj, text, o, c, n0, n1, n2, n3, __functionAddress);
    }

    public static void btSoftBody_appendNote5(@NativeType("void *") long obj, @NativeType("char const *") ByteBuffer text, @NativeType("btVector3 const *") ΒΤVector3 o, @NativeType("btVector4 const *") ΒΤVector3 c, @NativeType("void *") long n0, @NativeType("void *") long n1, @NativeType("void *") long n2, @NativeType("void *") long n3) {
        if (CHECKS) {
            checkNT1(text);
        }
        nbtSoftBody_appendNote5(obj, memAddress(text), o.address(), c.address(), n0, n1, n2, n3);
    }

    public static void btSoftBody_appendNote5(@NativeType("void *") long obj, @NativeType("char const *") CharSequence text, @NativeType("btVector3 const *") ΒΤVector3 o, @NativeType("btVector4 const *") ΒΤVector3 c, @NativeType("void *") long n0, @NativeType("void *") long n1, @NativeType("void *") long n2, @NativeType("void *") long n3) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            nbtSoftBody_appendNote5(obj, textEncoded, o.address(), c.address(), n0, n1, n2, n3);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ btSoftBody_appendTetra ] ---

    public static void btSoftBody_appendTetra(@NativeType("void *") long obj, int model, @NativeType("void *") long mat) {
        long __functionAddress = Functions.SoftBody_appendTetra;
        if (CHECKS) {
            check(obj);
            check(mat);
        }
        invokePPV(obj, model, mat, __functionAddress);
    }

    // --- [ btSoftBody_appendTetra2 ] ---

    public static void btSoftBody_appendTetra2(@NativeType("void *") long obj, int node0, int node1, int node2, int node3, @NativeType("void *") long mat) {
        long __functionAddress = Functions.SoftBody_appendTetra2;
        if (CHECKS) {
            check(obj);
            check(mat);
        }
        invokePPV(obj, node0, node1, node2, node3, mat, __functionAddress);
    }

    // --- [ btSoftBody_applyClusters ] ---

    public static void btSoftBody_applyClusters(@NativeType("void *") long obj, @NativeType("bool") boolean drift) {
        long __functionAddress = Functions.SoftBody_applyClusters;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, drift, __functionAddress);
    }

    // --- [ btSoftBody_applyForces ] ---

    public static void btSoftBody_applyForces(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_applyForces;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_checkContact ] ---

    public static boolean nbtSoftBody_checkContact(long obj, long colObjWrap, long x, float margin, long cti) {
        long __functionAddress = Functions.SoftBody_checkContact;
        if (CHECKS) {
            check(obj);
            check(colObjWrap);
            check(cti);
        }
        return invokePPPPZ(obj, colObjWrap, x, margin, cti, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btSoftBody_checkContact(@NativeType("void *") long obj, @NativeType("void *") long colObjWrap, @NativeType("btVector3 const *") ΒΤVector3 x, @NativeType("btScalar") float margin, @NativeType("void *") long cti) {
        return nbtSoftBody_checkContact(obj, colObjWrap, x.address(), margin, cti);
    }

    // --- [ btSoftBody_checkFace ] ---

    @NativeType("bool")
    public static boolean btSoftBody_checkFace(@NativeType("void *") long obj, int node0, int node1, int node2) {
        long __functionAddress = Functions.SoftBody_checkFace;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, node0, node1, node2, __functionAddress);
    }

    // --- [ btSoftBody_checkLink ] ---

    @NativeType("bool")
    public static boolean btSoftBody_checkLink(@NativeType("void *") long obj, @NativeType("void *") long node0, @NativeType("void *") long node1) {
        long __functionAddress = Functions.SoftBody_checkLink;
        if (CHECKS) {
            check(obj);
            check(node0);
            check(node1);
        }
        return invokePPPZ(obj, node0, node1, __functionAddress);
    }

    // --- [ btSoftBody_checkLink2 ] ---

    @NativeType("bool")
    public static boolean btSoftBody_checkLink2(@NativeType("void *") long obj, int node0, int node1) {
        long __functionAddress = Functions.SoftBody_checkLink2;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, node0, node1, __functionAddress);
    }

    // --- [ btSoftBody_cleanupClusters ] ---

    public static void btSoftBody_cleanupClusters(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_cleanupClusters;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_clusterAImpulse ] ---

    public static void btSoftBody_clusterAImpulse(@NativeType("void *") long cluster, @NativeType("void *") long impulse) {
        long __functionAddress = Functions.SoftBody_clusterAImpulse;
        if (CHECKS) {
            check(cluster);
            check(impulse);
        }
        invokePPV(cluster, impulse, __functionAddress);
    }

    // --- [ btSoftBody_clusterCom ] ---

    public static void nbtSoftBody_clusterCom(long obj, int cluster, long value) {
        long __functionAddress = Functions.SoftBody_clusterCom;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, cluster, value, __functionAddress);
    }

    public static void btSoftBody_clusterCom(@NativeType("void *") long obj, int cluster, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_clusterCom(obj, cluster, value.address());
    }

    // --- [ btSoftBody_clusterCom2 ] ---

    public static void nbtSoftBody_clusterCom2(long cluster, long value) {
        long __functionAddress = Functions.SoftBody_clusterCom2;
        if (CHECKS) {
            check(cluster);
        }
        invokePPV(cluster, value, __functionAddress);
    }

    public static void btSoftBody_clusterCom2(@NativeType("void *") long cluster, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_clusterCom2(cluster, value.address());
    }

    // --- [ btSoftBody_clusterCount ] ---

    public static int btSoftBody_clusterCount(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_clusterCount;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftBody_clusterDAImpulse ] ---

    public static void nbtSoftBody_clusterDAImpulse(long cluster, long impulse) {
        long __functionAddress = Functions.SoftBody_clusterDAImpulse;
        if (CHECKS) {
            check(cluster);
        }
        invokePPV(cluster, impulse, __functionAddress);
    }

    public static void btSoftBody_clusterDAImpulse(@NativeType("void *") long cluster, @NativeType("btVector3 const *") ΒΤVector3 impulse) {
        nbtSoftBody_clusterDAImpulse(cluster, impulse.address());
    }

    // --- [ btSoftBody_clusterDCImpulse ] ---

    public static void nbtSoftBody_clusterDCImpulse(long cluster, long impulse) {
        long __functionAddress = Functions.SoftBody_clusterDCImpulse;
        if (CHECKS) {
            check(cluster);
        }
        invokePPV(cluster, impulse, __functionAddress);
    }

    public static void btSoftBody_clusterDCImpulse(@NativeType("void *") long cluster, @NativeType("btVector3 const *") ΒΤVector3 impulse) {
        nbtSoftBody_clusterDCImpulse(cluster, impulse.address());
    }

    // --- [ btSoftBody_clusterDImpulse ] ---

    public static void nbtSoftBody_clusterDImpulse(long cluster, long rpos, long impulse) {
        long __functionAddress = Functions.SoftBody_clusterDImpulse;
        if (CHECKS) {
            check(cluster);
        }
        invokePPPV(cluster, rpos, impulse, __functionAddress);
    }

    public static void btSoftBody_clusterDImpulse(@NativeType("void *") long cluster, @NativeType("btVector3 const *") ΒΤVector3 rpos, @NativeType("btVector3 const *") ΒΤVector3 impulse) {
        nbtSoftBody_clusterDImpulse(cluster, rpos.address(), impulse.address());
    }

    // --- [ btSoftBody_clusterImpulse ] ---

    public static void nbtSoftBody_clusterImpulse(long cluster, long rpos, long impulse) {
        long __functionAddress = Functions.SoftBody_clusterImpulse;
        if (CHECKS) {
            check(cluster);
            check(impulse);
        }
        invokePPPV(cluster, rpos, impulse, __functionAddress);
    }

    public static void btSoftBody_clusterImpulse(@NativeType("void *") long cluster, @NativeType("btVector3 const *") ΒΤVector3 rpos, @NativeType("void *") long impulse) {
        nbtSoftBody_clusterImpulse(cluster, rpos.address(), impulse);
    }

    // --- [ btSoftBody_clusterVAImpulse ] ---

    public static void nbtSoftBody_clusterVAImpulse(long cluster, long impulse) {
        long __functionAddress = Functions.SoftBody_clusterVAImpulse;
        if (CHECKS) {
            check(cluster);
        }
        invokePPV(cluster, impulse, __functionAddress);
    }

    public static void btSoftBody_clusterVAImpulse(@NativeType("void *") long cluster, @NativeType("btVector3 const *") ΒΤVector3 impulse) {
        nbtSoftBody_clusterVAImpulse(cluster, impulse.address());
    }

    // --- [ btSoftBody_clusterVelocity ] ---

    public static void nbtSoftBody_clusterVelocity(long cluster, long rpos, long value) {
        long __functionAddress = Functions.SoftBody_clusterVelocity;
        if (CHECKS) {
            check(cluster);
        }
        invokePPPV(cluster, rpos, value, __functionAddress);
    }

    public static void btSoftBody_clusterVelocity(@NativeType("void *") long cluster, @NativeType("btVector3 const *") ΒΤVector3 rpos, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_clusterVelocity(cluster, rpos.address(), value.address());
    }

    // --- [ btSoftBody_clusterVImpulse ] ---

    public static void nbtSoftBody_clusterVImpulse(long cluster, long rpos, long impulse) {
        long __functionAddress = Functions.SoftBody_clusterVImpulse;
        if (CHECKS) {
            check(cluster);
        }
        invokePPPV(cluster, rpos, impulse, __functionAddress);
    }

    public static void btSoftBody_clusterVImpulse(@NativeType("void *") long cluster, @NativeType("btVector3 const *") ΒΤVector3 rpos, @NativeType("btVector3 const *") ΒΤVector3 impulse) {
        nbtSoftBody_clusterVImpulse(cluster, rpos.address(), impulse.address());
    }

    // --- [ btSoftBody_cutLink ] ---

    @NativeType("bool")
    public static boolean btSoftBody_cutLink(@NativeType("void *") long obj, @NativeType("void *") long node0, @NativeType("void *") long node1, @NativeType("btScalar") float position) {
        long __functionAddress = Functions.SoftBody_cutLink;
        if (CHECKS) {
            check(obj);
            check(node0);
            check(node1);
        }
        return invokePPPZ(obj, node0, node1, position, __functionAddress);
    }

    // --- [ btSoftBody_cutLink2 ] ---

    @NativeType("bool")
    public static boolean btSoftBody_cutLink2(@NativeType("void *") long obj, int node0, int node1, @NativeType("btScalar") float position) {
        long __functionAddress = Functions.SoftBody_cutLink2;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, node0, node1, position, __functionAddress);
    }

    // --- [ btSoftBody_dampClusters ] ---

    public static void btSoftBody_dampClusters(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_dampClusters;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_defaultCollisionHandler ] ---

    public static void btSoftBody_defaultCollisionHandler(@NativeType("void *") long obj, @NativeType("void *") long pcoWrap) {
        long __functionAddress = Functions.SoftBody_defaultCollisionHandler;
        if (CHECKS) {
            check(obj);
            check(pcoWrap);
        }
        invokePPV(obj, pcoWrap, __functionAddress);
    }

    // --- [ btSoftBody_defaultCollisionHandler2 ] ---

    public static void btSoftBody_defaultCollisionHandler2(@NativeType("void *") long obj, @NativeType("void *") long psb) {
        long __functionAddress = Functions.SoftBody_defaultCollisionHandler2;
        if (CHECKS) {
            check(obj);
            check(psb);
        }
        invokePPV(obj, psb, __functionAddress);
    }

    // --- [ btSoftBody_evaluateCom ] ---

    public static void nbtSoftBody_evaluateCom(long obj, long value) {
        long __functionAddress = Functions.SoftBody_evaluateCom;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_evaluateCom(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSoftBody_evaluateCom(obj, value.address());
    }

    // --- [ btSoftBody_generateBendingConstraints ] ---

    public static int btSoftBody_generateBendingConstraints(@NativeType("void *") long obj, int distance, @NativeType("void *") long mat) {
        long __functionAddress = Functions.SoftBody_generateBendingConstraints;
        if (CHECKS) {
            check(obj);
            check(mat);
        }
        return invokePPI(obj, distance, mat, __functionAddress);
    }

    // --- [ btSoftBody_generateClusters ] ---

    public static int btSoftBody_generateClusters(@NativeType("void *") long obj, int k) {
        long __functionAddress = Functions.SoftBody_generateClusters;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, k, __functionAddress);
    }

    // --- [ btSoftBody_generateClusters2 ] ---

    public static int btSoftBody_generateClusters2(@NativeType("void *") long obj, int k, int maxiterations) {
        long __functionAddress = Functions.SoftBody_generateClusters2;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, k, maxiterations, __functionAddress);
    }

    // --- [ btSoftBody_getAabb ] ---

    public static void nbtSoftBody_getAabb(long obj, long aabbMin, long aabbMax) {
        long __functionAddress = Functions.SoftBody_getAabb;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, aabbMin, aabbMax, __functionAddress);
    }

    public static void btSoftBody_getAabb(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 aabbMin, @NativeType("btVector3 *") ΒΤVector3 aabbMax) {
        nbtSoftBody_getAabb(obj, aabbMin.address(), aabbMax.address());
    }

    // --- [ btSoftBody_getAnchors ] ---

    @NativeType("void *")
    public static long btSoftBody_getAnchors(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getAnchors;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_getBounds ] ---

    public static long nbtSoftBody_getBounds(long obj) {
        long __functionAddress = Functions.SoftBody_getBounds;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("btVector3 *")
    public static ΒΤVector3 btSoftBody_getBounds(@NativeType("void *") long obj) {
        long __result = nbtSoftBody_getBounds(obj);
        return ΒΤVector3.createSafe(__result);
    }

    // --- [ btSoftBody_getBUpdateRtCst ] ---

    @NativeType("bool")
    public static boolean btSoftBody_getBUpdateRtCst(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getBUpdateRtCst;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btSoftBody_getCdbvt ] ---

    @NativeType("void *")
    public static long btSoftBody_getCdbvt(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getCdbvt;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_getCfg ] ---

    @NativeType("void *")
    public static long btSoftBody_getCfg(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getCfg;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_getClusterConnectivity ] ---

    @NativeType("void *")
    public static long btSoftBody_getClusterConnectivity(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getClusterConnectivity;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_getClusters ] ---

    @NativeType("void *")
    public static long btSoftBody_getClusters(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getClusters;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_getCollisionDisabledObjects ] ---

    @NativeType("void *")
    public static long btSoftBody_getCollisionDisabledObjects(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getCollisionDisabledObjects;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_getFaces ] ---

    @NativeType("void *")
    public static long btSoftBody_getFaces(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getFaces;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_getFdbvt ] ---

    @NativeType("void *")
    public static long btSoftBody_getFdbvt(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getFdbvt;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_getInitialWorldTransform ] ---

    public static void nbtSoftBody_getInitialWorldTransform(long obj, long value) {
        long __functionAddress = Functions.SoftBody_getInitialWorldTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSoftBody_getInitialWorldTransform(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtSoftBody_getInitialWorldTransform(obj, value.address());
    }

    // --- [ btSoftBody_getJoints ] ---

    @NativeType("void *")
    public static long btSoftBody_getJoints(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getJoints;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_getLinks ] ---

    @NativeType("void *")
    public static long btSoftBody_getLinks(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getLinks;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_getMass ] ---

    @NativeType("btScalar")
    public static float btSoftBody_getMass(@NativeType("void *") long obj, int node) {
        long __functionAddress = Functions.SoftBody_getMass;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, node, __functionAddress);
    }

    // --- [ btSoftBody_getMaterials ] ---

    @NativeType("void *")
    public static long btSoftBody_getMaterials(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getMaterials;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_getNdbvt ] ---

    @NativeType("void *")
    public static long btSoftBody_getNdbvt(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getNdbvt;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_getNodes ] ---

    @NativeType("void *")
    public static long btSoftBody_getNodes(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getNodes;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_getNotes ] ---

    @NativeType("void *")
    public static long btSoftBody_getNotes(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getNotes;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_getPose ] ---

    @NativeType("void *")
    public static long btSoftBody_getPose(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getPose;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_getRcontacts ] ---

    @NativeType("void *")
    public static long btSoftBody_getRcontacts(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getRcontacts;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_getRestLengthScale ] ---

    @NativeType("btScalar")
    public static float btSoftBody_getRestLengthScale(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getRestLengthScale;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_getScontacts ] ---

    @NativeType("void *")
    public static long btSoftBody_getScontacts(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getScontacts;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_getSoftBodySolver ] ---

    @NativeType("void *")
    public static long btSoftBody_getSoftBodySolver(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getSoftBodySolver;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_getSst ] ---

    /**
     * EXPORT btSoftBody_psolver_t btSoftBody_getSolver(btSoftBody_ePSolver solver); EXPORT btSoftBody_vsolver_t btSoftBody_getSolver2(btSoftBody_eVSolver
     * solver);
     */
    @NativeType("void *")
    public static long btSoftBody_getSst(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getSst;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_getTag ] ---

    @NativeType("void *")
    public static long btSoftBody_getTag(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getTag;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_getTetras ] ---

    @NativeType("void *")
    public static long btSoftBody_getTetras(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getTetras;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_getTimeacc ] ---

    @NativeType("btScalar")
    public static float btSoftBody_getTimeacc(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getTimeacc;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_getTotalMass ] ---

    @NativeType("btScalar")
    public static float btSoftBody_getTotalMass(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getTotalMass;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_getUserIndexMapping ] ---

    @NativeType("void *")
    public static long btSoftBody_getUserIndexMapping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getUserIndexMapping;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_getWindVelocity ] ---

    public static void nbtSoftBody_getWindVelocity(long obj, long velocity) {
        long __functionAddress = Functions.SoftBody_getWindVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, velocity, __functionAddress);
    }

    public static void btSoftBody_getWindVelocity(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 velocity) {
        nbtSoftBody_getWindVelocity(obj, velocity.address());
    }

    // --- [ btSoftBody_getVolume ] ---

    @NativeType("btScalar")
    public static float btSoftBody_getVolume(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getVolume;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btSoftBody_getWorldInfo ] ---

    @NativeType("void *")
    public static long btSoftBody_getWorldInfo(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_getWorldInfo;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftBody_indicesToPointers ] ---

    public static void nbtSoftBody_indicesToPointers(long obj, long map) {
        long __functionAddress = Functions.SoftBody_indicesToPointers;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, map, __functionAddress);
    }

    public static void btSoftBody_indicesToPointers(@NativeType("void *") long obj, @NativeType("int const *") IntBuffer map) {
        nbtSoftBody_indicesToPointers(obj, memAddress(map));
    }

    // --- [ btSoftBody_initDefaults ] ---

    public static void btSoftBody_initDefaults(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_initDefaults;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_initializeClusters ] ---

    public static void btSoftBody_initializeClusters(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_initializeClusters;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_initializeFaceTree ] ---

    public static void btSoftBody_initializeFaceTree(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_initializeFaceTree;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_integrateMotion ] ---

    public static void btSoftBody_integrateMotion(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_integrateMotion;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_pointersToIndices ] ---

    public static void btSoftBody_pointersToIndices(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_pointersToIndices;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_predictMotion ] ---

    public static void btSoftBody_predictMotion(@NativeType("void *") long obj, @NativeType("btScalar") float dt) {
        long __functionAddress = Functions.SoftBody_predictMotion;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, dt, __functionAddress);
    }

    // --- [ btSoftBody_prepareClusters ] ---

    public static void btSoftBody_prepareClusters(@NativeType("void *") long obj, int iterations) {
        long __functionAddress = Functions.SoftBody_prepareClusters;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, iterations, __functionAddress);
    }

    // --- [ btSoftBody_PSolve_Anchors ] ---

    public static void btSoftBody_PSolve_Anchors(@NativeType("void *") long psb, @NativeType("btScalar") float kst, @NativeType("btScalar") float ti) {
        long __functionAddress = Functions.SoftBody_PSolve_Anchors;
        if (CHECKS) {
            check(psb);
        }
        invokePV(psb, kst, ti, __functionAddress);
    }

    // --- [ btSoftBody_PSolve_Links ] ---

    public static void btSoftBody_PSolve_Links(@NativeType("void *") long psb, @NativeType("btScalar") float kst, @NativeType("btScalar") float ti) {
        long __functionAddress = Functions.SoftBody_PSolve_Links;
        if (CHECKS) {
            check(psb);
        }
        invokePV(psb, kst, ti, __functionAddress);
    }

    // --- [ btSoftBody_PSolve_RContacts ] ---

    public static void btSoftBody_PSolve_RContacts(@NativeType("void *") long psb, @NativeType("btScalar") float kst, @NativeType("btScalar") float ti) {
        long __functionAddress = Functions.SoftBody_PSolve_RContacts;
        if (CHECKS) {
            check(psb);
        }
        invokePV(psb, kst, ti, __functionAddress);
    }

    // --- [ btSoftBody_PSolve_SContacts ] ---

    public static void btSoftBody_PSolve_SContacts(@NativeType("void *") long psb, @NativeType("btScalar") float __unnamed1, @NativeType("btScalar") float ti) {
        long __functionAddress = Functions.SoftBody_PSolve_SContacts;
        if (CHECKS) {
            check(psb);
        }
        invokePV(psb, __unnamed1, ti, __functionAddress);
    }

    // --- [ btSoftBody_randomizeConstraints ] ---

    public static void btSoftBody_randomizeConstraints(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_randomizeConstraints;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_rayTest ] ---

    public static boolean nbtSoftBody_rayTest(long obj, long rayFrom, long rayTo, long results) {
        long __functionAddress = Functions.SoftBody_rayTest;
        if (CHECKS) {
            check(obj);
            check(results);
        }
        return invokePPPPZ(obj, rayFrom, rayTo, results, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btSoftBody_rayTest(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 rayFrom, @NativeType("btVector3 const *") ΒΤVector3 rayTo, @NativeType("void *") long results) {
        return nbtSoftBody_rayTest(obj, rayFrom.address(), rayTo.address(), results);
    }

    // --- [ btSoftBody_rayTest2 ] ---

    public static int nbtSoftBody_rayTest2(long obj, long rayFrom, long rayTo, long mint, long feature, long index, boolean bcountonly) {
        long __functionAddress = Functions.SoftBody_rayTest2;
        if (CHECKS) {
            check(obj);
        }
        return invokePPPPPPI(obj, rayFrom, rayTo, mint, feature, index, bcountonly, __functionAddress);
    }

    public static int btSoftBody_rayTest2(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 rayFrom, @NativeType("btVector3 const *") ΒΤVector3 rayTo, @NativeType("btScalar *") FloatBuffer mint, @NativeType("int *") IntBuffer feature, @NativeType("int *") IntBuffer index, @NativeType("bool") boolean bcountonly) {
        if (CHECKS) {
            check(mint, 1);
            check(feature, 1);
            check(index, 1);
        }
        return nbtSoftBody_rayTest2(obj, rayFrom.address(), rayTo.address(), memAddress(mint), memAddress(feature), memAddress(index), bcountonly);
    }

    // --- [ btSoftBody_refine ] ---

    public static void btSoftBody_refine(@NativeType("void *") long obj, @NativeType("void *") long ifn, @NativeType("btScalar") float accurary, @NativeType("bool") boolean cut) {
        long __functionAddress = Functions.SoftBody_refine;
        if (CHECKS) {
            check(obj);
            check(ifn);
        }
        invokePPV(obj, ifn, accurary, cut, __functionAddress);
    }

    // --- [ btSoftBody_releaseCluster ] ---

    public static void btSoftBody_releaseCluster(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.SoftBody_releaseCluster;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, __functionAddress);
    }

    // --- [ btSoftBody_releaseClusters ] ---

    public static void btSoftBody_releaseClusters(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_releaseClusters;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_resetLinkRestLengths ] ---

    public static void btSoftBody_resetLinkRestLengths(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_resetLinkRestLengths;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_rotate ] ---

    public static void nbtSoftBody_rotate(long obj, long rot) {
        long __functionAddress = Functions.SoftBody_rotate;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, rot, __functionAddress);
    }

    public static void btSoftBody_rotate(@NativeType("void *") long obj, @NativeType("btQuaternion const *") ΒΤVector3 rot) {
        nbtSoftBody_rotate(obj, rot.address());
    }

    // --- [ btSoftBody_scale ] ---

    public static void nbtSoftBody_scale(long obj, long scl) {
        long __functionAddress = Functions.SoftBody_scale;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, scl, __functionAddress);
    }

    public static void btSoftBody_scale(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 scl) {
        nbtSoftBody_scale(obj, scl.address());
    }

    // --- [ btSoftBody_setBUpdateRtCst ] ---

    public static void btSoftBody_setBUpdateRtCst(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.SoftBody_setBUpdateRtCst;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_setMass ] ---

    public static void btSoftBody_setMass(@NativeType("void *") long obj, int node, @NativeType("btScalar") float mass) {
        long __functionAddress = Functions.SoftBody_setMass;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, node, mass, __functionAddress);
    }

    // --- [ btSoftBody_setPose ] ---

    public static void btSoftBody_setPose(@NativeType("void *") long obj, @NativeType("bool") boolean bvolume, @NativeType("bool") boolean bframe) {
        long __functionAddress = Functions.SoftBody_setPose;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, bvolume, bframe, __functionAddress);
    }

    // --- [ btSoftBody_setRestLengthScale ] ---

    public static void btSoftBody_setRestLengthScale(@NativeType("void *") long obj, @NativeType("btScalar") float restLength) {
        long __functionAddress = Functions.SoftBody_setRestLengthScale;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, restLength, __functionAddress);
    }

    // --- [ btSoftBody_setSoftBodySolver ] ---

    public static void btSoftBody_setSoftBodySolver(@NativeType("void *") long obj, @NativeType("void *") long softBodySolver) {
        long __functionAddress = Functions.SoftBody_setSoftBodySolver;
        if (CHECKS) {
            check(obj);
            check(softBodySolver);
        }
        invokePPV(obj, softBodySolver, __functionAddress);
    }

    // --- [ btSoftBody_setSolver ] ---

    public static void btSoftBody_setSolver(@NativeType("void *") long obj, int preset) {
        long __functionAddress = Functions.SoftBody_setSolver;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, preset, __functionAddress);
    }

    // --- [ btSoftBody_setTag ] ---

    public static void btSoftBody_setTag(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBody_setTag;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_setTimeacc ] ---

    public static void btSoftBody_setTimeacc(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.SoftBody_setTimeacc;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_setTotalDensity ] ---

    public static void btSoftBody_setTotalDensity(@NativeType("void *") long obj, @NativeType("btScalar") float density) {
        long __functionAddress = Functions.SoftBody_setTotalDensity;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, density, __functionAddress);
    }

    // --- [ btSoftBody_setTotalMass ] ---

    public static void btSoftBody_setTotalMass(@NativeType("void *") long obj, @NativeType("btScalar") float mass, @NativeType("bool") boolean fromfaces) {
        long __functionAddress = Functions.SoftBody_setTotalMass;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, mass, fromfaces, __functionAddress);
    }

    // --- [ btSoftBody_setVelocity ] ---

    public static void nbtSoftBody_setVelocity(long obj, long velocity) {
        long __functionAddress = Functions.SoftBody_setVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, velocity, __functionAddress);
    }

    public static void btSoftBody_setVelocity(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 velocity) {
        nbtSoftBody_setVelocity(obj, velocity.address());
    }

    // --- [ btSoftBody_setWindVelocity ] ---

    public static void nbtSoftBody_setWindVelocity(long obj, long velocity) {
        long __functionAddress = Functions.SoftBody_setWindVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, velocity, __functionAddress);
    }

    public static void btSoftBody_setWindVelocity(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 velocity) {
        nbtSoftBody_setWindVelocity(obj, velocity.address());
    }

    // --- [ btSoftBody_setVolumeDensity ] ---

    public static void btSoftBody_setVolumeDensity(@NativeType("void *") long obj, @NativeType("btScalar") float density) {
        long __functionAddress = Functions.SoftBody_setVolumeDensity;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, density, __functionAddress);
    }

    // --- [ btSoftBody_setVolumeMass ] ---

    public static void btSoftBody_setVolumeMass(@NativeType("void *") long obj, @NativeType("btScalar") float mass) {
        long __functionAddress = Functions.SoftBody_setVolumeMass;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, mass, __functionAddress);
    }

    // --- [ btSoftBody_setWorldInfo ] ---

    public static void btSoftBody_setWorldInfo(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SoftBody_setWorldInfo;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSoftBody_solveClusters ] ---

    public static void btSoftBody_solveClusters(@NativeType("void *") long bodies) {
        long __functionAddress = Functions.SoftBody_solveClusters;
        if (CHECKS) {
            check(bodies);
        }
        invokePV(bodies, __functionAddress);
    }

    // --- [ btSoftBody_solveClusters2 ] ---

    public static void btSoftBody_solveClusters2(@NativeType("void *") long obj, @NativeType("btScalar") float sor) {
        long __functionAddress = Functions.SoftBody_solveClusters2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, sor, __functionAddress);
    }

    // --- [ btSoftBody_solveCommonConstraints ] ---

    public static void nbtSoftBody_solveCommonConstraints(long bodies, int count, int iterations) {
        long __functionAddress = Functions.SoftBody_solveCommonConstraints;
        invokePV(bodies, count, iterations, __functionAddress);
    }

    public static void btSoftBody_solveCommonConstraints(@NativeType("void **") PointerBuffer bodies, int iterations) {
        nbtSoftBody_solveCommonConstraints(memAddress(bodies), bodies.remaining(), iterations);
    }

    // --- [ btSoftBody_solveConstraints ] ---

    public static void btSoftBody_solveConstraints(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_solveConstraints;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_staticSolve ] ---

    public static void btSoftBody_staticSolve(@NativeType("void *") long obj, int iterations) {
        long __functionAddress = Functions.SoftBody_staticSolve;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, iterations, __functionAddress);
    }

    // --- [ btSoftBody_transform ] ---

    public static void nbtSoftBody_transform(long obj, long trs) {
        long __functionAddress = Functions.SoftBody_transform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, trs, __functionAddress);
    }

    public static void btSoftBody_transform(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform trs) {
        nbtSoftBody_transform(obj, trs.address());
    }

    // --- [ btSoftBody_translate ] ---

    public static void nbtSoftBody_translate(long obj, long trs) {
        long __functionAddress = Functions.SoftBody_translate;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, trs, __functionAddress);
    }

    public static void btSoftBody_translate(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 trs) {
        nbtSoftBody_translate(obj, trs.address());
    }

    // --- [ btSoftBody_upcast ] ---

    @NativeType("void *")
    public static long btSoftBody_upcast(@NativeType("void *") long colObj) {
        long __functionAddress = Functions.SoftBody_upcast;
        if (CHECKS) {
            check(colObj);
        }
        return invokePP(colObj, __functionAddress);
    }

    // --- [ btSoftBody_updateArea ] ---

    public static void btSoftBody_updateArea(@NativeType("void *") long obj, @NativeType("bool") boolean averageArea) {
        long __functionAddress = Functions.SoftBody_updateArea;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, averageArea, __functionAddress);
    }

    // --- [ btSoftBody_updateBounds ] ---

    public static void btSoftBody_updateBounds(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_updateBounds;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_updateClusters ] ---

    public static void btSoftBody_updateClusters(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_updateClusters;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_updateConstants ] ---

    public static void btSoftBody_updateConstants(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_updateConstants;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_updateLinkConstants ] ---

    public static void btSoftBody_updateLinkConstants(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_updateLinkConstants;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_updateNormals ] ---

    public static void btSoftBody_updateNormals(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_updateNormals;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_updatePose ] ---

    public static void btSoftBody_updatePose(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftBody_updatePose;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSoftBody_VSolve_Links ] ---

    public static void btSoftBody_VSolve_Links(@NativeType("void *") long psb, @NativeType("btScalar") float kst) {
        long __functionAddress = Functions.SoftBody_VSolve_Links;
        if (CHECKS) {
            check(psb);
        }
        invokePV(psb, kst, __functionAddress);
    }

    // --- [ btSoftBody_getFaceVertexData ] ---

    public static int nbtSoftBody_getFaceVertexData(long obj, long vertices) {
        long __functionAddress = Functions.SoftBody_getFaceVertexData;
        if (CHECKS) {
            check(obj);
        }
        return invokePPI(obj, vertices, __functionAddress);
    }

    public static int btSoftBody_getFaceVertexData(@NativeType("void *") long obj, @NativeType("btScalar *") FloatBuffer vertices) {
        return nbtSoftBody_getFaceVertexData(obj, memAddress(vertices));
    }

    // --- [ btSoftBody_getFaceVertexNormalData ] ---

    public static int nbtSoftBody_getFaceVertexNormalData(long obj, long vertices) {
        long __functionAddress = Functions.SoftBody_getFaceVertexNormalData;
        if (CHECKS) {
            check(obj);
        }
        return invokePPI(obj, vertices, __functionAddress);
    }

    public static int btSoftBody_getFaceVertexNormalData(@NativeType("void *") long obj, @NativeType("btScalar *") FloatBuffer vertices) {
        return nbtSoftBody_getFaceVertexNormalData(obj, memAddress(vertices));
    }

    // --- [ btSoftBody_getFaceVertexNormalData2 ] ---

    public static int nbtSoftBody_getFaceVertexNormalData2(long obj, long vertices, long normals) {
        long __functionAddress = Functions.SoftBody_getFaceVertexNormalData2;
        if (CHECKS) {
            check(obj);
        }
        return invokePPPI(obj, vertices, normals, __functionAddress);
    }

    public static int btSoftBody_getFaceVertexNormalData2(@NativeType("void *") long obj, @NativeType("btScalar *") FloatBuffer vertices, @NativeType("btScalar *") FloatBuffer normals) {
        return nbtSoftBody_getFaceVertexNormalData2(obj, memAddress(vertices), memAddress(normals));
    }

    // --- [ btSoftBody_getLinkVertexData ] ---

    public static int nbtSoftBody_getLinkVertexData(long obj, long vertices) {
        long __functionAddress = Functions.SoftBody_getLinkVertexData;
        if (CHECKS) {
            check(obj);
        }
        return invokePPI(obj, vertices, __functionAddress);
    }

    public static int btSoftBody_getLinkVertexData(@NativeType("void *") long obj, @NativeType("btScalar *") FloatBuffer vertices) {
        return nbtSoftBody_getLinkVertexData(obj, memAddress(vertices));
    }

    // --- [ btSoftBody_getLinkVertexNormalData ] ---

    public static int nbtSoftBody_getLinkVertexNormalData(long obj, long vertices) {
        long __functionAddress = Functions.SoftBody_getLinkVertexNormalData;
        if (CHECKS) {
            check(obj);
        }
        return invokePPI(obj, vertices, __functionAddress);
    }

    public static int btSoftBody_getLinkVertexNormalData(@NativeType("void *") long obj, @NativeType("btScalar *") FloatBuffer vertices) {
        return nbtSoftBody_getLinkVertexNormalData(obj, memAddress(vertices));
    }

    // --- [ btSoftBody_getTetraVertexData ] ---

    public static int nbtSoftBody_getTetraVertexData(long obj, long vertices) {
        long __functionAddress = Functions.SoftBody_getTetraVertexData;
        if (CHECKS) {
            check(obj);
        }
        return invokePPI(obj, vertices, __functionAddress);
    }

    public static int btSoftBody_getTetraVertexData(@NativeType("void *") long obj, @NativeType("btScalar *") FloatBuffer vertices) {
        return nbtSoftBody_getTetraVertexData(obj, memAddress(vertices));
    }

    // --- [ btSoftBody_getTetraVertexNormalData ] ---

    public static int nbtSoftBody_getTetraVertexNormalData(long obj, long vertices) {
        long __functionAddress = Functions.SoftBody_getTetraVertexNormalData;
        if (CHECKS) {
            check(obj);
        }
        return invokePPI(obj, vertices, __functionAddress);
    }

    public static int btSoftBody_getTetraVertexNormalData(@NativeType("void *") long obj, @NativeType("btScalar *") FloatBuffer vertices) {
        return nbtSoftBody_getTetraVertexNormalData(obj, memAddress(vertices));
    }

    // --- [ btSoftBody_getTetraVertexNormalData2 ] ---

    public static int nbtSoftBody_getTetraVertexNormalData2(long obj, long vertices, long normals) {
        long __functionAddress = Functions.SoftBody_getTetraVertexNormalData2;
        if (CHECKS) {
            check(obj);
        }
        return invokePPPI(obj, vertices, normals, __functionAddress);
    }

    public static int btSoftBody_getTetraVertexNormalData2(@NativeType("void *") long obj, @NativeType("btScalar *") FloatBuffer vertices, @NativeType("btScalar *") FloatBuffer normals) {
        return nbtSoftBody_getTetraVertexNormalData2(obj, memAddress(vertices), memAddress(normals));
    }

}
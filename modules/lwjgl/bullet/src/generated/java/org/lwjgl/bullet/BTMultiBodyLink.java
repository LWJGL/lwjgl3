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

public class BTMultiBodyLink {

    protected BTMultiBodyLink() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MultibodyLink_getAbsFrameLocVelocity     = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getAbsFrameLocVelocity"),
            MultibodyLink_getAbsFrameTotVelocity     = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getAbsFrameTotVelocity"),
            MultibodyLink_getAppliedConstraintForce  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getAppliedConstraintForce"),
            MultibodyLink_getAppliedConstraintTorque = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getAppliedConstraintTorque"),
            MultibodyLink_getAppliedForce            = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getAppliedForce"),
            MultibodyLink_getAppliedTorque           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getAppliedTorque"),
            MultibodyLink_getAxes                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getAxes"),
            MultibodyLink_getAxisBottom              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getAxisBottom"),
            MultibodyLink_getAxisTop                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getAxisTop"),
            MultibodyLink_getCachedRotParentToThis   = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getCachedRotParentToThis"),
            MultibodyLink_getCachedRVector           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getCachedRVector"),
            MultibodyLink_getCachedWorldTransform    = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getCachedWorldTransform"),
            MultibodyLink_getCfgOffset               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getCfgOffset"),
            MultibodyLink_getCollider                = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getCollider"),
            MultibodyLink_getDofCount                = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getDofCount"),
            MultibodyLink_getDofOffset               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getDofOffset"),
            MultibodyLink_getDVector                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getDVector"),
            MultibodyLink_getEVector                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getEVector"),
            MultibodyLink_getFlags                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getFlags"),
            MultibodyLink_getInertiaLocal            = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getInertiaLocal"),
            MultibodyLink_getJointDamping            = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getJointDamping"),
            MultibodyLink_getJointFeedback           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getJointFeedback"),
            MultibodyLink_getJointFriction           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getJointFriction"),
            MultibodyLink_getJointName               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getJointName"),
            MultibodyLink_getJointPos                = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getJointPos"),
            MultibodyLink_getJointTorque             = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getJointTorque"),
            MultibodyLink_getJointType               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getJointType"),
            MultibodyLink_getLinkName                = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getLinkName"),
            MultibodyLink_getMass                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getMass"),
            MultibodyLink_getParent                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getParent"),
            MultibodyLink_getPosVarCount             = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getPosVarCount"),
            MultibodyLink_getZeroRotParentToThis     = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getZeroRotParentToThis"),
            MultibodyLink_getUserPtr                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_getUserPtr"),
            MultibodyLink_setAppliedConstraintForce  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setAppliedConstraintForce"),
            MultibodyLink_setAppliedConstraintTorque = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setAppliedConstraintTorque"),
            MultibodyLink_setAppliedForce            = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setAppliedForce"),
            MultibodyLink_setAppliedTorque           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setAppliedTorque"),
            MultibodyLink_setAxisBottom              = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setAxisBottom"),
            MultibodyLink_setAxisBottom2             = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setAxisBottom2"),
            MultibodyLink_setAxisTop                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setAxisTop"),
            MultibodyLink_setAxisTop2                = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setAxisTop2"),
            MultibodyLink_setCachedRotParentToThis   = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setCachedRotParentToThis"),
            MultibodyLink_setCachedRVector           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setCachedRVector"),
            MultibodyLink_setCachedWorldTransform    = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setCachedWorldTransform"),
            MultibodyLink_setCfgOffset               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setCfgOffset"),
            MultibodyLink_setCollider                = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setCollider"),
            MultibodyLink_setDofCount                = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setDofCount"),
            MultibodyLink_setDofOffset               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setDofOffset"),
            MultibodyLink_setDVector                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setDVector"),
            MultibodyLink_setEVector                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setEVector"),
            MultibodyLink_setFlags                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setFlags"),
            MultibodyLink_setInertiaLocal            = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setInertiaLocal"),
            MultibodyLink_setJointDamping            = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setJointDamping"),
            MultibodyLink_setJointFeedback           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setJointFeedback"),
            MultibodyLink_setJointFriction           = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setJointFriction"),
            MultibodyLink_setJointName               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setJointName"),
            MultibodyLink_setJointType               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setJointType"),
            MultibodyLink_setLinkName                = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setLinkName"),
            MultibodyLink_setMass                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setMass"),
            MultibodyLink_setParent                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setParent"),
            MultibodyLink_setPosVarCount             = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setPosVarCount"),
            MultibodyLink_setZeroRotParentToThis     = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setZeroRotParentToThis"),
            MultibodyLink_setUserPtr                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_setUserPtr"),
            MultibodyLink_updateCacheMultiDof        = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultibodyLink_updateCacheMultiDof");

    }

    // --- [ btMultibodyLink_getAbsFrameLocVelocity ] ---

    @NativeType("void *")
    public static long btMultibodyLink_getAbsFrameLocVelocity(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultibodyLink_getAbsFrameLocVelocity;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btMultibodyLink_getAbsFrameTotVelocity ] ---

    @NativeType("void *")
    public static long btMultibodyLink_getAbsFrameTotVelocity(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultibodyLink_getAbsFrameTotVelocity;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btMultibodyLink_getAppliedConstraintForce ] ---

    public static void nbtMultibodyLink_getAppliedConstraintForce(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_getAppliedConstraintForce;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_getAppliedConstraintForce(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtMultibodyLink_getAppliedConstraintForce(obj, value.address());
    }

    // --- [ btMultibodyLink_getAppliedConstraintTorque ] ---

    public static void nbtMultibodyLink_getAppliedConstraintTorque(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_getAppliedConstraintTorque;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_getAppliedConstraintTorque(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtMultibodyLink_getAppliedConstraintTorque(obj, value.address());
    }

    // --- [ btMultibodyLink_getAppliedForce ] ---

    public static void nbtMultibodyLink_getAppliedForce(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_getAppliedForce;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_getAppliedForce(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtMultibodyLink_getAppliedForce(obj, value.address());
    }

    // --- [ btMultibodyLink_getAppliedTorque ] ---

    public static void nbtMultibodyLink_getAppliedTorque(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_getAppliedTorque;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_getAppliedTorque(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtMultibodyLink_getAppliedTorque(obj, value.address());
    }

    // --- [ btMultibodyLink_getAxes ] ---

    @NativeType("void *")
    public static long btMultibodyLink_getAxes(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultibodyLink_getAxes;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btMultibodyLink_getAxisBottom ] ---

    public static void nbtMultibodyLink_getAxisBottom(long obj, int dof, long value) {
        long __functionAddress = Functions.MultibodyLink_getAxisBottom;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, dof, value, __functionAddress);
    }

    public static void btMultibodyLink_getAxisBottom(@NativeType("void *") long obj, int dof, @NativeType("btVector3 *") BTVector3 value) {
        nbtMultibodyLink_getAxisBottom(obj, dof, value.address());
    }

    // --- [ btMultibodyLink_getAxisTop ] ---

    public static void nbtMultibodyLink_getAxisTop(long obj, int dof, long value) {
        long __functionAddress = Functions.MultibodyLink_getAxisTop;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, dof, value, __functionAddress);
    }

    public static void btMultibodyLink_getAxisTop(@NativeType("void *") long obj, int dof, @NativeType("btVector3 *") BTVector3 value) {
        nbtMultibodyLink_getAxisTop(obj, dof, value.address());
    }

    // --- [ btMultibodyLink_getCachedRotParentToThis ] ---

    public static void nbtMultibodyLink_getCachedRotParentToThis(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_getCachedRotParentToThis;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_getCachedRotParentToThis(@NativeType("void *") long obj, @NativeType("btQuaternion *") BTVector3 value) {
        nbtMultibodyLink_getCachedRotParentToThis(obj, value.address());
    }

    // --- [ btMultibodyLink_getCachedRVector ] ---

    public static void nbtMultibodyLink_getCachedRVector(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_getCachedRVector;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_getCachedRVector(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtMultibodyLink_getCachedRVector(obj, value.address());
    }

    // --- [ btMultibodyLink_getCachedWorldTransform ] ---

    public static void nbtMultibodyLink_getCachedWorldTransform(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_getCachedWorldTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_getCachedWorldTransform(@NativeType("void *") long obj, @NativeType("btTransform *") BTTransform value) {
        nbtMultibodyLink_getCachedWorldTransform(obj, value.address());
    }

    // --- [ btMultibodyLink_getCfgOffset ] ---

    public static int btMultibodyLink_getCfgOffset(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultibodyLink_getCfgOffset;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultibodyLink_getCollider ] ---

    @NativeType("void *")
    public static long btMultibodyLink_getCollider(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultibodyLink_getCollider;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btMultibodyLink_getDofCount ] ---

    public static int btMultibodyLink_getDofCount(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultibodyLink_getDofCount;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultibodyLink_getDofOffset ] ---

    public static int btMultibodyLink_getDofOffset(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultibodyLink_getDofOffset;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultibodyLink_getDVector ] ---

    public static void nbtMultibodyLink_getDVector(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_getDVector;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_getDVector(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtMultibodyLink_getDVector(obj, value.address());
    }

    // --- [ btMultibodyLink_getEVector ] ---

    public static void nbtMultibodyLink_getEVector(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_getEVector;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_getEVector(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtMultibodyLink_getEVector(obj, value.address());
    }

    // --- [ btMultibodyLink_getFlags ] ---

    public static int btMultibodyLink_getFlags(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultibodyLink_getFlags;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultibodyLink_getInertiaLocal ] ---

    public static void nbtMultibodyLink_getInertiaLocal(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_getInertiaLocal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_getInertiaLocal(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtMultibodyLink_getInertiaLocal(obj, value.address());
    }

    // --- [ btMultibodyLink_getJointDamping ] ---

    @NativeType("btScalar")
    public static float btMultibodyLink_getJointDamping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultibodyLink_getJointDamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btMultibodyLink_getJointFeedback ] ---

    @NativeType("void *")
    public static long btMultibodyLink_getJointFeedback(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultibodyLink_getJointFeedback;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btMultibodyLink_getJointFriction ] ---

    @NativeType("btScalar")
    public static float btMultibodyLink_getJointFriction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultibodyLink_getJointFriction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btMultibodyLink_getJointName ] ---

    public static long nbtMultibodyLink_getJointName(long obj) {
        long __functionAddress = Functions.MultibodyLink_getJointName;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String btMultibodyLink_getJointName(@NativeType("void *") long obj) {
        long __result = nbtMultibodyLink_getJointName(obj);
        return memUTF8Safe(__result);
    }

    // --- [ btMultibodyLink_getJointPos ] ---

    @NativeType("btScalar[7]")
    public static FloatBuffer btMultibodyLink_getJointPos(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultibodyLink_getJointPos;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memFloatBuffer(__result, 7);
    }

    // --- [ btMultibodyLink_getJointTorque ] ---

    @NativeType("btScalar[6]")
    public static FloatBuffer btMultibodyLink_getJointTorque(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultibodyLink_getJointTorque;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memFloatBuffer(__result, 6);
    }

    // --- [ btMultibodyLink_getJointType ] ---

    public static int btMultibodyLink_getJointType(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultibodyLink_getJointType;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultibodyLink_getLinkName ] ---

    public static long nbtMultibodyLink_getLinkName(long obj) {
        long __functionAddress = Functions.MultibodyLink_getLinkName;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String btMultibodyLink_getLinkName(@NativeType("void *") long obj) {
        long __result = nbtMultibodyLink_getLinkName(obj);
        return memUTF8Safe(__result);
    }

    // --- [ btMultibodyLink_getMass ] ---

    @NativeType("btScalar")
    public static float btMultibodyLink_getMass(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultibodyLink_getMass;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btMultibodyLink_getParent ] ---

    public static int btMultibodyLink_getParent(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultibodyLink_getParent;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultibodyLink_getPosVarCount ] ---

    public static int btMultibodyLink_getPosVarCount(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultibodyLink_getPosVarCount;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultibodyLink_getZeroRotParentToThis ] ---

    public static void nbtMultibodyLink_getZeroRotParentToThis(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_getZeroRotParentToThis;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_getZeroRotParentToThis(@NativeType("void *") long obj, @NativeType("btQuaternion *") BTVector3 value) {
        nbtMultibodyLink_getZeroRotParentToThis(obj, value.address());
    }

    // --- [ btMultibodyLink_getUserPtr ] ---

    @NativeType("void *")
    public static long btMultibodyLink_getUserPtr(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultibodyLink_getUserPtr;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btMultibodyLink_setAppliedConstraintForce ] ---

    public static void nbtMultibodyLink_setAppliedConstraintForce(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_setAppliedConstraintForce;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_setAppliedConstraintForce(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtMultibodyLink_setAppliedConstraintForce(obj, value.address());
    }

    // --- [ btMultibodyLink_setAppliedConstraintTorque ] ---

    public static void nbtMultibodyLink_setAppliedConstraintTorque(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_setAppliedConstraintTorque;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_setAppliedConstraintTorque(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtMultibodyLink_setAppliedConstraintTorque(obj, value.address());
    }

    // --- [ btMultibodyLink_setAppliedForce ] ---

    public static void nbtMultibodyLink_setAppliedForce(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_setAppliedForce;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_setAppliedForce(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtMultibodyLink_setAppliedForce(obj, value.address());
    }

    // --- [ btMultibodyLink_setAppliedTorque ] ---

    public static void nbtMultibodyLink_setAppliedTorque(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_setAppliedTorque;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_setAppliedTorque(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtMultibodyLink_setAppliedTorque(obj, value.address());
    }

    // --- [ btMultibodyLink_setAxisBottom ] ---

    public static void btMultibodyLink_setAxisBottom(@NativeType("void *") long obj, int dof, @NativeType("btScalar") float x, @NativeType("btScalar") float y, @NativeType("btScalar") float z) {
        long __functionAddress = Functions.MultibodyLink_setAxisBottom;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, dof, x, y, z, __functionAddress);
    }

    // --- [ btMultibodyLink_setAxisBottom2 ] ---

    public static void nbtMultibodyLink_setAxisBottom2(long obj, int dof, long axis) {
        long __functionAddress = Functions.MultibodyLink_setAxisBottom2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, dof, axis, __functionAddress);
    }

    public static void btMultibodyLink_setAxisBottom2(@NativeType("void *") long obj, int dof, @NativeType("btVector3 const *") BTVector3 axis) {
        nbtMultibodyLink_setAxisBottom2(obj, dof, axis.address());
    }

    // --- [ btMultibodyLink_setAxisTop ] ---

    public static void btMultibodyLink_setAxisTop(@NativeType("void *") long obj, int dof, @NativeType("btScalar") float x, @NativeType("btScalar") float y, @NativeType("btScalar") float z) {
        long __functionAddress = Functions.MultibodyLink_setAxisTop;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, dof, x, y, z, __functionAddress);
    }

    // --- [ btMultibodyLink_setAxisTop2 ] ---

    public static void nbtMultibodyLink_setAxisTop2(long obj, int dof, long axis) {
        long __functionAddress = Functions.MultibodyLink_setAxisTop2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, dof, axis, __functionAddress);
    }

    public static void btMultibodyLink_setAxisTop2(@NativeType("void *") long obj, int dof, @NativeType("btVector3 const *") BTVector3 axis) {
        nbtMultibodyLink_setAxisTop2(obj, dof, axis.address());
    }

    // --- [ btMultibodyLink_setCachedRotParentToThis ] ---

    public static void nbtMultibodyLink_setCachedRotParentToThis(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_setCachedRotParentToThis;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_setCachedRotParentToThis(@NativeType("void *") long obj, @NativeType("btQuaternion const *") BTVector3 value) {
        nbtMultibodyLink_setCachedRotParentToThis(obj, value.address());
    }

    // --- [ btMultibodyLink_setCachedRVector ] ---

    public static void nbtMultibodyLink_setCachedRVector(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_setCachedRVector;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_setCachedRVector(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtMultibodyLink_setCachedRVector(obj, value.address());
    }

    // --- [ btMultibodyLink_setCachedWorldTransform ] ---

    public static void nbtMultibodyLink_setCachedWorldTransform(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_setCachedWorldTransform;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_setCachedWorldTransform(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform value) {
        nbtMultibodyLink_setCachedWorldTransform(obj, value.address());
    }

    // --- [ btMultibodyLink_setCfgOffset ] ---

    public static void btMultibodyLink_setCfgOffset(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MultibodyLink_setCfgOffset;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultibodyLink_setCollider ] ---

    public static void btMultibodyLink_setCollider(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.MultibodyLink_setCollider;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btMultibodyLink_setDofCount ] ---

    public static void btMultibodyLink_setDofCount(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MultibodyLink_setDofCount;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultibodyLink_setDofOffset ] ---

    public static void btMultibodyLink_setDofOffset(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MultibodyLink_setDofOffset;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultibodyLink_setDVector ] ---

    public static void nbtMultibodyLink_setDVector(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_setDVector;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_setDVector(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtMultibodyLink_setDVector(obj, value.address());
    }

    // --- [ btMultibodyLink_setEVector ] ---

    public static void nbtMultibodyLink_setEVector(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_setEVector;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_setEVector(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtMultibodyLink_setEVector(obj, value.address());
    }

    // --- [ btMultibodyLink_setFlags ] ---

    public static void btMultibodyLink_setFlags(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MultibodyLink_setFlags;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultibodyLink_setInertiaLocal ] ---

    public static void nbtMultibodyLink_setInertiaLocal(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_setInertiaLocal;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_setInertiaLocal(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtMultibodyLink_setInertiaLocal(obj, value.address());
    }

    // --- [ btMultibodyLink_setJointDamping ] ---

    public static void btMultibodyLink_setJointDamping(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.MultibodyLink_setJointDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultibodyLink_setJointFeedback ] ---

    public static void btMultibodyLink_setJointFeedback(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.MultibodyLink_setJointFeedback;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btMultibodyLink_setJointFriction ] ---

    public static void btMultibodyLink_setJointFriction(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.MultibodyLink_setJointFriction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultibodyLink_setJointName ] ---

    public static void nbtMultibodyLink_setJointName(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_setJointName;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_setJointName(@NativeType("void *") long obj, @NativeType("char const *") ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
        }
        nbtMultibodyLink_setJointName(obj, memAddress(value));
    }

    public static void btMultibodyLink_setJointName(@NativeType("void *") long obj, @NativeType("char const *") CharSequence value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(value, true);
            long valueEncoded = stack.getPointerAddress();
            nbtMultibodyLink_setJointName(obj, valueEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ btMultibodyLink_setJointType ] ---

    public static void btMultibodyLink_setJointType(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MultibodyLink_setJointType;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultibodyLink_setLinkName ] ---

    public static void nbtMultibodyLink_setLinkName(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_setLinkName;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_setLinkName(@NativeType("void *") long obj, @NativeType("char const *") ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
        }
        nbtMultibodyLink_setLinkName(obj, memAddress(value));
    }

    public static void btMultibodyLink_setLinkName(@NativeType("void *") long obj, @NativeType("char const *") CharSequence value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(value, true);
            long valueEncoded = stack.getPointerAddress();
            nbtMultibodyLink_setLinkName(obj, valueEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ btMultibodyLink_setMass ] ---

    public static void btMultibodyLink_setMass(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.MultibodyLink_setMass;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultibodyLink_setParent ] ---

    public static void btMultibodyLink_setParent(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MultibodyLink_setParent;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultibodyLink_setPosVarCount ] ---

    public static void btMultibodyLink_setPosVarCount(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MultibodyLink_setPosVarCount;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultibodyLink_setZeroRotParentToThis ] ---

    public static void nbtMultibodyLink_setZeroRotParentToThis(long obj, long value) {
        long __functionAddress = Functions.MultibodyLink_setZeroRotParentToThis;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btMultibodyLink_setZeroRotParentToThis(@NativeType("void *") long obj, @NativeType("btQuaternion const *") BTVector3 value) {
        nbtMultibodyLink_setZeroRotParentToThis(obj, value.address());
    }

    // --- [ btMultibodyLink_setUserPtr ] ---

    public static void btMultibodyLink_setUserPtr(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.MultibodyLink_setUserPtr;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btMultibodyLink_updateCacheMultiDof ] ---

    public static void nbtMultibodyLink_updateCacheMultiDof(long obj, long pq) {
        long __functionAddress = Functions.MultibodyLink_updateCacheMultiDof;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, pq, __functionAddress);
    }

    public static void btMultibodyLink_updateCacheMultiDof(@NativeType("void *") long obj, @NativeType("btScalar *") FloatBuffer pq) {
        nbtMultibodyLink_updateCacheMultiDof(obj, memAddress(pq));
    }

}
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

public class BTKinematicCharacterController {

    protected BTKinematicCharacterController() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            KinematicCharacterController_new                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_new"),
            KinematicCharacterController_new2                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_new2"),
            KinematicCharacterController_applyImpulse           = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_applyImpulse"),
            KinematicCharacterController_getAngularDamping      = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_getAngularDamping"),
            KinematicCharacterController_getAngularVelocity     = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_getAngularVelocity"),
            KinematicCharacterController_getFallSpeed           = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_getFallSpeed"),
            KinematicCharacterController_getGhostObject         = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_getGhostObject"),
            KinematicCharacterController_getGravity             = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_getGravity"),
            KinematicCharacterController_getJumpSpeed           = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_getJumpSpeed"),
            KinematicCharacterController_getLinearDamping       = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_getLinearDamping"),
            KinematicCharacterController_getLinearVelocity      = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_getLinearVelocity"),
            KinematicCharacterController_getMaxPenetrationDepth = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_getMaxPenetrationDepth"),
            KinematicCharacterController_getMaxSlope            = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_getMaxSlope"),
            KinematicCharacterController_getStepHeight          = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_getStepHeight"),
            KinematicCharacterController_getUp                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_getUp"),
            KinematicCharacterController_setAngularDamping      = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_setAngularDamping"),
            KinematicCharacterController_setAngularVelocity     = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_setAngularVelocity"),
            KinematicCharacterController_setFallSpeed           = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_setFallSpeed"),
            KinematicCharacterController_setGravity             = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_setGravity"),
            KinematicCharacterController_setJumpSpeed           = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_setJumpSpeed"),
            KinematicCharacterController_setLinearDamping       = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_setLinearDamping"),
            KinematicCharacterController_setLinearVelocity      = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_setLinearVelocity"),
            KinematicCharacterController_setMaxJumpHeight       = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_setMaxJumpHeight"),
            KinematicCharacterController_setMaxPenetrationDepth = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_setMaxPenetrationDepth"),
            KinematicCharacterController_setMaxSlope            = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_setMaxSlope"),
            KinematicCharacterController_setStepHeight          = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_setStepHeight"),
            KinematicCharacterController_setUp                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_setUp"),
            KinematicCharacterController_setUseGhostSweepTest   = apiGetFunctionAddress(LibBullet.getLibrary(), "btKinematicCharacterController_setUseGhostSweepTest");

    }

    // --- [ btKinematicCharacterController_new ] ---

    @NativeType("void *")
    public static long btKinematicCharacterController_new(@NativeType("void *") long ghostObject, @NativeType("void *") long convexShape, @NativeType("btScalar") float stepHeight) {
        long __functionAddress = Functions.KinematicCharacterController_new;
        if (CHECKS) {
            check(ghostObject);
            check(convexShape);
        }
        return invokePPP(ghostObject, convexShape, stepHeight, __functionAddress);
    }

    // --- [ btKinematicCharacterController_new2 ] ---

    public static long nbtKinematicCharacterController_new2(long ghostObject, long convexShape, float stepHeight, long up) {
        long __functionAddress = Functions.KinematicCharacterController_new2;
        if (CHECKS) {
            check(ghostObject);
            check(convexShape);
        }
        return invokePPPP(ghostObject, convexShape, stepHeight, up, __functionAddress);
    }

    @NativeType("void *")
    public static long btKinematicCharacterController_new2(@NativeType("void *") long ghostObject, @NativeType("void *") long convexShape, @NativeType("btScalar") float stepHeight, @NativeType("btVector3 const *") ΒΤVector3 up) {
        return nbtKinematicCharacterController_new2(ghostObject, convexShape, stepHeight, up.address());
    }

    // --- [ btKinematicCharacterController_applyImpulse ] ---

    public static void nbtKinematicCharacterController_applyImpulse(long obj, long v) {
        long __functionAddress = Functions.KinematicCharacterController_applyImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, v, __functionAddress);
    }

    public static void btKinematicCharacterController_applyImpulse(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 v) {
        nbtKinematicCharacterController_applyImpulse(obj, v.address());
    }

    // --- [ btKinematicCharacterController_getAngularDamping ] ---

    @NativeType("btScalar")
    public static float btKinematicCharacterController_getAngularDamping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.KinematicCharacterController_getAngularDamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btKinematicCharacterController_getAngularVelocity ] ---

    public static void nbtKinematicCharacterController_getAngularVelocity(long obj, long value) {
        long __functionAddress = Functions.KinematicCharacterController_getAngularVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btKinematicCharacterController_getAngularVelocity(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtKinematicCharacterController_getAngularVelocity(obj, value.address());
    }

    // --- [ btKinematicCharacterController_getFallSpeed ] ---

    @NativeType("btScalar")
    public static float btKinematicCharacterController_getFallSpeed(@NativeType("void *") long obj) {
        long __functionAddress = Functions.KinematicCharacterController_getFallSpeed;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btKinematicCharacterController_getGhostObject ] ---

    @NativeType("void *")
    public static long btKinematicCharacterController_getGhostObject(@NativeType("void *") long obj) {
        long __functionAddress = Functions.KinematicCharacterController_getGhostObject;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btKinematicCharacterController_getGravity ] ---

    public static void nbtKinematicCharacterController_getGravity(long obj, long value) {
        long __functionAddress = Functions.KinematicCharacterController_getGravity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btKinematicCharacterController_getGravity(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtKinematicCharacterController_getGravity(obj, value.address());
    }

    // --- [ btKinematicCharacterController_getJumpSpeed ] ---

    @NativeType("btScalar")
    public static float btKinematicCharacterController_getJumpSpeed(@NativeType("void *") long obj) {
        long __functionAddress = Functions.KinematicCharacterController_getJumpSpeed;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btKinematicCharacterController_getLinearDamping ] ---

    @NativeType("btScalar")
    public static float btKinematicCharacterController_getLinearDamping(@NativeType("void *") long obj) {
        long __functionAddress = Functions.KinematicCharacterController_getLinearDamping;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btKinematicCharacterController_getLinearVelocity ] ---

    public static void nbtKinematicCharacterController_getLinearVelocity(long obj, long value) {
        long __functionAddress = Functions.KinematicCharacterController_getLinearVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btKinematicCharacterController_getLinearVelocity(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtKinematicCharacterController_getLinearVelocity(obj, value.address());
    }

    // --- [ btKinematicCharacterController_getMaxPenetrationDepth ] ---

    @NativeType("btScalar")
    public static float btKinematicCharacterController_getMaxPenetrationDepth(@NativeType("void *") long obj) {
        long __functionAddress = Functions.KinematicCharacterController_getMaxPenetrationDepth;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btKinematicCharacterController_getMaxSlope ] ---

    @NativeType("btScalar")
    public static float btKinematicCharacterController_getMaxSlope(@NativeType("void *") long obj) {
        long __functionAddress = Functions.KinematicCharacterController_getMaxSlope;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btKinematicCharacterController_getStepHeight ] ---

    @NativeType("btScalar")
    public static float btKinematicCharacterController_getStepHeight(@NativeType("void *") long obj) {
        long __functionAddress = Functions.KinematicCharacterController_getStepHeight;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btKinematicCharacterController_getUp ] ---

    public static void nbtKinematicCharacterController_getUp(long obj, long value) {
        long __functionAddress = Functions.KinematicCharacterController_getUp;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btKinematicCharacterController_getUp(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtKinematicCharacterController_getUp(obj, value.address());
    }

    // --- [ btKinematicCharacterController_setAngularDamping ] ---

    public static void btKinematicCharacterController_setAngularDamping(@NativeType("void *") long obj, @NativeType("btScalar") float d) {
        long __functionAddress = Functions.KinematicCharacterController_setAngularDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, d, __functionAddress);
    }

    // --- [ btKinematicCharacterController_setAngularVelocity ] ---

    public static void nbtKinematicCharacterController_setAngularVelocity(long obj, long velocity) {
        long __functionAddress = Functions.KinematicCharacterController_setAngularVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, velocity, __functionAddress);
    }

    public static void btKinematicCharacterController_setAngularVelocity(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 velocity) {
        nbtKinematicCharacterController_setAngularVelocity(obj, velocity.address());
    }

    // --- [ btKinematicCharacterController_setFallSpeed ] ---

    public static void btKinematicCharacterController_setFallSpeed(@NativeType("void *") long obj, @NativeType("btScalar") float fallSpeed) {
        long __functionAddress = Functions.KinematicCharacterController_setFallSpeed;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, fallSpeed, __functionAddress);
    }

    // --- [ btKinematicCharacterController_setGravity ] ---

    public static void nbtKinematicCharacterController_setGravity(long obj, long gravity) {
        long __functionAddress = Functions.KinematicCharacterController_setGravity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, gravity, __functionAddress);
    }

    public static void btKinematicCharacterController_setGravity(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 gravity) {
        nbtKinematicCharacterController_setGravity(obj, gravity.address());
    }

    // --- [ btKinematicCharacterController_setJumpSpeed ] ---

    public static void btKinematicCharacterController_setJumpSpeed(@NativeType("void *") long obj, @NativeType("btScalar") float jumpSpeed) {
        long __functionAddress = Functions.KinematicCharacterController_setJumpSpeed;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, jumpSpeed, __functionAddress);
    }

    // --- [ btKinematicCharacterController_setLinearDamping ] ---

    public static void btKinematicCharacterController_setLinearDamping(@NativeType("void *") long obj, @NativeType("btScalar") float d) {
        long __functionAddress = Functions.KinematicCharacterController_setLinearDamping;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, d, __functionAddress);
    }

    // --- [ btKinematicCharacterController_setLinearVelocity ] ---

    public static void nbtKinematicCharacterController_setLinearVelocity(long obj, long velocity) {
        long __functionAddress = Functions.KinematicCharacterController_setLinearVelocity;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, velocity, __functionAddress);
    }

    public static void btKinematicCharacterController_setLinearVelocity(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 velocity) {
        nbtKinematicCharacterController_setLinearVelocity(obj, velocity.address());
    }

    // --- [ btKinematicCharacterController_setMaxJumpHeight ] ---

    public static void btKinematicCharacterController_setMaxJumpHeight(@NativeType("void *") long obj, @NativeType("btScalar") float maxJumpHeight) {
        long __functionAddress = Functions.KinematicCharacterController_setMaxJumpHeight;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, maxJumpHeight, __functionAddress);
    }

    // --- [ btKinematicCharacterController_setMaxPenetrationDepth ] ---

    public static void btKinematicCharacterController_setMaxPenetrationDepth(@NativeType("void *") long obj, @NativeType("btScalar") float d) {
        long __functionAddress = Functions.KinematicCharacterController_setMaxPenetrationDepth;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, d, __functionAddress);
    }

    // --- [ btKinematicCharacterController_setMaxSlope ] ---

    public static void btKinematicCharacterController_setMaxSlope(@NativeType("void *") long obj, @NativeType("btScalar") float slopeRadians) {
        long __functionAddress = Functions.KinematicCharacterController_setMaxSlope;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, slopeRadians, __functionAddress);
    }

    // --- [ btKinematicCharacterController_setStepHeight ] ---

    public static void btKinematicCharacterController_setStepHeight(@NativeType("void *") long obj, @NativeType("btScalar") float h) {
        long __functionAddress = Functions.KinematicCharacterController_setStepHeight;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, h, __functionAddress);
    }

    // --- [ btKinematicCharacterController_setUp ] ---

    public static void nbtKinematicCharacterController_setUp(long obj, long up) {
        long __functionAddress = Functions.KinematicCharacterController_setUp;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, up, __functionAddress);
    }

    public static void btKinematicCharacterController_setUp(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 up) {
        nbtKinematicCharacterController_setUp(obj, up.address());
    }

    // --- [ btKinematicCharacterController_setUseGhostSweepTest ] ---

    public static void btKinematicCharacterController_setUseGhostSweepTest(@NativeType("void *") long obj, @NativeType("bool") boolean useGhostObjectSweepTest) {
        long __functionAddress = Functions.KinematicCharacterController_setUseGhostSweepTest;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, useGhostObjectSweepTest, __functionAddress);
    }

}
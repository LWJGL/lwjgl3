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

public class BTCharacterControllerInterface {

    protected BTCharacterControllerInterface() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CharacterControllerInterface_canJump                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btCharacterControllerInterface_canJump"),
            CharacterControllerInterface_jump                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btCharacterControllerInterface_jump"),
            CharacterControllerInterface_jump2                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btCharacterControllerInterface_jump2"),
            CharacterControllerInterface_onGround                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btCharacterControllerInterface_onGround"),
            CharacterControllerInterface_playerStep                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btCharacterControllerInterface_playerStep"),
            CharacterControllerInterface_preStep                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btCharacterControllerInterface_preStep"),
            CharacterControllerInterface_reset                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btCharacterControllerInterface_reset"),
            CharacterControllerInterface_setUpInterpolate           = apiGetFunctionAddress(LibBullet.getLibrary(), "btCharacterControllerInterface_setUpInterpolate"),
            CharacterControllerInterface_setWalkDirection           = apiGetFunctionAddress(LibBullet.getLibrary(), "btCharacterControllerInterface_setWalkDirection"),
            CharacterControllerInterface_setVelocityForTimeInterval = apiGetFunctionAddress(LibBullet.getLibrary(), "btCharacterControllerInterface_setVelocityForTimeInterval"),
            CharacterControllerInterface_warp                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btCharacterControllerInterface_warp");

    }

    // --- [ btCharacterControllerInterface_canJump ] ---

    @NativeType("bool")
    public static boolean btCharacterControllerInterface_canJump(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CharacterControllerInterface_canJump;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btCharacterControllerInterface_jump ] ---

    public static void btCharacterControllerInterface_jump(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CharacterControllerInterface_jump;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btCharacterControllerInterface_jump2 ] ---

    public static void nbtCharacterControllerInterface_jump2(long obj, long dir) {
        long __functionAddress = Functions.CharacterControllerInterface_jump2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, dir, __functionAddress);
    }

    public static void btCharacterControllerInterface_jump2(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 dir) {
        nbtCharacterControllerInterface_jump2(obj, dir.address());
    }

    // --- [ btCharacterControllerInterface_onGround ] ---

    @NativeType("bool")
    public static boolean btCharacterControllerInterface_onGround(@NativeType("void *") long obj) {
        long __functionAddress = Functions.CharacterControllerInterface_onGround;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btCharacterControllerInterface_playerStep ] ---

    public static void btCharacterControllerInterface_playerStep(@NativeType("void *") long obj, @NativeType("void *") long collisionWorld, @NativeType("btScalar") float dt) {
        long __functionAddress = Functions.CharacterControllerInterface_playerStep;
        if (CHECKS) {
            check(obj);
            check(collisionWorld);
        }
        invokePPV(obj, collisionWorld, dt, __functionAddress);
    }

    // --- [ btCharacterControllerInterface_preStep ] ---

    public static void btCharacterControllerInterface_preStep(@NativeType("void *") long obj, @NativeType("void *") long collisionWorld) {
        long __functionAddress = Functions.CharacterControllerInterface_preStep;
        if (CHECKS) {
            check(obj);
            check(collisionWorld);
        }
        invokePPV(obj, collisionWorld, __functionAddress);
    }

    // --- [ btCharacterControllerInterface_reset ] ---

    public static void btCharacterControllerInterface_reset(@NativeType("void *") long obj, @NativeType("void *") long collisionWorld) {
        long __functionAddress = Functions.CharacterControllerInterface_reset;
        if (CHECKS) {
            check(obj);
            check(collisionWorld);
        }
        invokePPV(obj, collisionWorld, __functionAddress);
    }

    // --- [ btCharacterControllerInterface_setUpInterpolate ] ---

    public static void btCharacterControllerInterface_setUpInterpolate(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.CharacterControllerInterface_setUpInterpolate;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btCharacterControllerInterface_setWalkDirection ] ---

    public static void nbtCharacterControllerInterface_setWalkDirection(long obj, long walkDirection) {
        long __functionAddress = Functions.CharacterControllerInterface_setWalkDirection;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, walkDirection, __functionAddress);
    }

    public static void btCharacterControllerInterface_setWalkDirection(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 walkDirection) {
        nbtCharacterControllerInterface_setWalkDirection(obj, walkDirection.address());
    }

    // --- [ btCharacterControllerInterface_setVelocityForTimeInterval ] ---

    public static void nbtCharacterControllerInterface_setVelocityForTimeInterval(long obj, long velocity, float timeInterval) {
        long __functionAddress = Functions.CharacterControllerInterface_setVelocityForTimeInterval;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, velocity, timeInterval, __functionAddress);
    }

    public static void btCharacterControllerInterface_setVelocityForTimeInterval(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 velocity, @NativeType("btScalar") float timeInterval) {
        nbtCharacterControllerInterface_setVelocityForTimeInterval(obj, velocity.address(), timeInterval);
    }

    // --- [ btCharacterControllerInterface_warp ] ---

    public static void nbtCharacterControllerInterface_warp(long obj, long origin) {
        long __functionAddress = Functions.CharacterControllerInterface_warp;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, origin, __functionAddress);
    }

    public static void btCharacterControllerInterface_warp(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 origin) {
        nbtCharacterControllerInterface_warp(obj, origin.address());
    }

}
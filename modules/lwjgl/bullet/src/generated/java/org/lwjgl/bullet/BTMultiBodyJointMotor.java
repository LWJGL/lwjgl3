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

public class BTMultiBodyJointMotor {

    protected BTMultiBodyJointMotor() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MultiBodyJointMotor_new                = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyJointMotor_new"),
            MultiBodyJointMotor_new2               = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyJointMotor_new2"),
            MultiBodyJointMotor_setPositionTarget  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyJointMotor_setPositionTarget"),
            MultiBodyJointMotor_setPositionTarget2 = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyJointMotor_setPositionTarget2"),
            MultiBodyJointMotor_setVelocityTarget  = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyJointMotor_setVelocityTarget"),
            MultiBodyJointMotor_setVelocityTarget2 = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyJointMotor_setVelocityTarget2");

    }

    // --- [ btMultiBodyJointMotor_new ] ---

    @NativeType("void *")
    public static long btMultiBodyJointMotor_new(@NativeType("void *") long body, int link, @NativeType("btScalar") float desiredVelocity, @NativeType("btScalar") float maxMotorImpulse) {
        long __functionAddress = Functions.MultiBodyJointMotor_new;
        if (CHECKS) {
            check(body);
        }
        return invokePP(body, link, desiredVelocity, maxMotorImpulse, __functionAddress);
    }

    // --- [ btMultiBodyJointMotor_new2 ] ---

    @NativeType("void *")
    public static long btMultiBodyJointMotor_new2(@NativeType("void *") long body, int link, int linkDoF, @NativeType("btScalar") float desiredVelocity, @NativeType("btScalar") float maxMotorImpulse) {
        long __functionAddress = Functions.MultiBodyJointMotor_new2;
        if (CHECKS) {
            check(body);
        }
        return invokePP(body, link, linkDoF, desiredVelocity, maxMotorImpulse, __functionAddress);
    }

    // --- [ btMultiBodyJointMotor_setPositionTarget ] ---

    public static void btMultiBodyJointMotor_setPositionTarget(@NativeType("void *") long obj, @NativeType("btScalar") float posTarget) {
        long __functionAddress = Functions.MultiBodyJointMotor_setPositionTarget;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, posTarget, __functionAddress);
    }

    // --- [ btMultiBodyJointMotor_setPositionTarget2 ] ---

    public static void btMultiBodyJointMotor_setPositionTarget2(@NativeType("void *") long obj, @NativeType("btScalar") float posTarget, @NativeType("btScalar") float kp) {
        long __functionAddress = Functions.MultiBodyJointMotor_setPositionTarget2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, posTarget, kp, __functionAddress);
    }

    // --- [ btMultiBodyJointMotor_setVelocityTarget ] ---

    public static void btMultiBodyJointMotor_setVelocityTarget(@NativeType("void *") long obj, @NativeType("btScalar") float velTarget) {
        long __functionAddress = Functions.MultiBodyJointMotor_setVelocityTarget;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, velTarget, __functionAddress);
    }

    // --- [ btMultiBodyJointMotor_setVelocityTarget2 ] ---

    public static void btMultiBodyJointMotor_setVelocityTarget2(@NativeType("void *") long obj, @NativeType("btScalar") float velTarget, @NativeType("btScalar") float kd) {
        long __functionAddress = Functions.MultiBodyJointMotor_setVelocityTarget2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, velTarget, kd, __functionAddress);
    }

}
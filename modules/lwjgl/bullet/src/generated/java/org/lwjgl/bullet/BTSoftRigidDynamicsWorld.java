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

public class BTSoftRigidDynamicsWorld {

    protected BTSoftRigidDynamicsWorld() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            SoftRigidDynamicsWorld_new              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftRigidDynamicsWorld_new"),
            SoftRigidDynamicsWorld_addSoftBody      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftRigidDynamicsWorld_addSoftBody"),
            SoftRigidDynamicsWorld_addSoftBody2     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftRigidDynamicsWorld_addSoftBody2"),
            SoftRigidDynamicsWorld_addSoftBody3     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftRigidDynamicsWorld_addSoftBody3"),
            SoftRigidDynamicsWorld_getDrawFlags     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftRigidDynamicsWorld_getDrawFlags"),
            SoftRigidDynamicsWorld_getSoftBodyArray = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftRigidDynamicsWorld_getSoftBodyArray"),
            SoftRigidDynamicsWorld_getWorldInfo     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftRigidDynamicsWorld_getWorldInfo"),
            SoftRigidDynamicsWorld_removeSoftBody   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftRigidDynamicsWorld_removeSoftBody"),
            SoftRigidDynamicsWorld_setDrawFlags     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSoftRigidDynamicsWorld_setDrawFlags");

    }

    // --- [ btSoftRigidDynamicsWorld_new ] ---

    @NativeType("void *")
    public static long btSoftRigidDynamicsWorld_new(@NativeType("void *") long dispatcher, @NativeType("void *") long pairCache, @NativeType("void *") long constraintSolver, @NativeType("void *") long collisionConfiguration, @NativeType("void *") long softBodySolver) {
        long __functionAddress = Functions.SoftRigidDynamicsWorld_new;
        if (CHECKS) {
            check(dispatcher);
            check(pairCache);
            check(constraintSolver);
            check(collisionConfiguration);
            check(softBodySolver);
        }
        return invokePPPPPP(dispatcher, pairCache, constraintSolver, collisionConfiguration, softBodySolver, __functionAddress);
    }

    // --- [ btSoftRigidDynamicsWorld_addSoftBody ] ---

    public static void btSoftRigidDynamicsWorld_addSoftBody(@NativeType("void *") long obj, @NativeType("void *") long body) {
        long __functionAddress = Functions.SoftRigidDynamicsWorld_addSoftBody;
        if (CHECKS) {
            check(obj);
            check(body);
        }
        invokePPV(obj, body, __functionAddress);
    }

    // --- [ btSoftRigidDynamicsWorld_addSoftBody2 ] ---

    public static void btSoftRigidDynamicsWorld_addSoftBody2(@NativeType("void *") long obj, @NativeType("void *") long body, int collisionFilterGroup) {
        long __functionAddress = Functions.SoftRigidDynamicsWorld_addSoftBody2;
        if (CHECKS) {
            check(obj);
            check(body);
        }
        invokePPV(obj, body, collisionFilterGroup, __functionAddress);
    }

    // --- [ btSoftRigidDynamicsWorld_addSoftBody3 ] ---

    public static void btSoftRigidDynamicsWorld_addSoftBody3(@NativeType("void *") long obj, @NativeType("void *") long body, int collisionFilterGroup, int collisionFilterMask) {
        long __functionAddress = Functions.SoftRigidDynamicsWorld_addSoftBody3;
        if (CHECKS) {
            check(obj);
            check(body);
        }
        invokePPV(obj, body, collisionFilterGroup, collisionFilterMask, __functionAddress);
    }

    // --- [ btSoftRigidDynamicsWorld_getDrawFlags ] ---

    public static int btSoftRigidDynamicsWorld_getDrawFlags(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftRigidDynamicsWorld_getDrawFlags;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btSoftRigidDynamicsWorld_getSoftBodyArray ] ---

    @NativeType("void *")
    public static long btSoftRigidDynamicsWorld_getSoftBodyArray(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftRigidDynamicsWorld_getSoftBodyArray;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftRigidDynamicsWorld_getWorldInfo ] ---

    @NativeType("void *")
    public static long btSoftRigidDynamicsWorld_getWorldInfo(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SoftRigidDynamicsWorld_getWorldInfo;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSoftRigidDynamicsWorld_removeSoftBody ] ---

    public static void btSoftRigidDynamicsWorld_removeSoftBody(@NativeType("void *") long obj, @NativeType("void *") long body) {
        long __functionAddress = Functions.SoftRigidDynamicsWorld_removeSoftBody;
        if (CHECKS) {
            check(obj);
            check(body);
        }
        invokePPV(obj, body, __functionAddress);
    }

    // --- [ btSoftRigidDynamicsWorld_setDrawFlags ] ---

    public static void btSoftRigidDynamicsWorld_setDrawFlags(@NativeType("void *") long obj, int f) {
        long __functionAddress = Functions.SoftRigidDynamicsWorld_setDrawFlags;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, f, __functionAddress);
    }

}
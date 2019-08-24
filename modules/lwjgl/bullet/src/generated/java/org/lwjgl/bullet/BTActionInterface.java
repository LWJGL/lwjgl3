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

public class BTActionInterface {

    protected BTActionInterface() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            ActionInterfaceWrapper_new   = apiGetFunctionAddress(LibBullet.getLibrary(), "btActionInterfaceWrapper_new"),
            ActionInterface_debugDraw    = apiGetFunctionAddress(LibBullet.getLibrary(), "btActionInterface_debugDraw"),
            ActionInterface_updateAction = apiGetFunctionAddress(LibBullet.getLibrary(), "btActionInterface_updateAction"),
            ActionInterface_delete       = apiGetFunctionAddress(LibBullet.getLibrary(), "btActionInterface_delete");

    }

    // --- [ btActionInterfaceWrapper_new ] ---

    public static long nbtActionInterfaceWrapper_new(long debugDrawCallback, long updateActionCallback) {
        long __functionAddress = Functions.ActionInterfaceWrapper_new;
        return invokePPP(debugDrawCallback, updateActionCallback, __functionAddress);
    }

    @NativeType("btActionInterfaceWrapper *")
    public static long btActionInterfaceWrapper_new(@NativeType("p_btActionInterface_debugDraw") BTActionInterfaceDebugDrawI debugDrawCallback, @NativeType("p_btActionInterface_updateAction") BTActionInterfaceUpdateActionI updateActionCallback) {
        return nbtActionInterfaceWrapper_new(debugDrawCallback.address(), updateActionCallback.address());
    }

    // --- [ btActionInterface_debugDraw ] ---

    public static void btActionInterface_debugDraw(@NativeType("btActionInterface *") long obj, @NativeType("btIDebugDraw *") long debugDrawer) {
        long __functionAddress = Functions.ActionInterface_debugDraw;
        if (CHECKS) {
            check(obj);
            check(debugDrawer);
        }
        invokePPV(obj, debugDrawer, __functionAddress);
    }

    // --- [ btActionInterface_updateAction ] ---

    public static void btActionInterface_updateAction(@NativeType("btActionInterface *") long obj, @NativeType("btCollisionWorld *") long collisionWorld, @NativeType("btScalar") float deltaTimeStep) {
        long __functionAddress = Functions.ActionInterface_updateAction;
        if (CHECKS) {
            check(obj);
            check(collisionWorld);
        }
        invokePPV(obj, collisionWorld, deltaTimeStep, __functionAddress);
    }

    // --- [ btActionInterface_delete ] ---

    public static void btActionInterface_delete(@NativeType("btActionInterface *") long obj) {
        long __functionAddress = Functions.ActionInterface_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}
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

public class BTTriangleCallback {

    protected BTTriangleCallback() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            TriangleCallbackWrapper_new              = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleCallbackWrapper_new"),
            TriangleCallback_delete                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleCallback_delete"),
            InternalTriangleIndexCallbackWrapper_new = apiGetFunctionAddress(LibBullet.getLibrary(), "btInternalTriangleIndexCallbackWrapper_new"),
            InternalTriangleIndexCallback_delete     = apiGetFunctionAddress(LibBullet.getLibrary(), "btInternalTriangleIndexCallback_delete");

    }

    // --- [ btTriangleCallbackWrapper_new ] ---

    public static long nbtTriangleCallbackWrapper_new(long processTriangleCallback) {
        long __functionAddress = Functions.TriangleCallbackWrapper_new;
        return invokePP(processTriangleCallback, __functionAddress);
    }

    @NativeType("void *")
    public static long btTriangleCallbackWrapper_new(@NativeType("p_btTriangleCallback_processTriangle") BTTriangleCallbackProcessTriangleI processTriangleCallback) {
        return nbtTriangleCallbackWrapper_new(processTriangleCallback.address());
    }

    // --- [ btTriangleCallback_delete ] ---

    public static void btTriangleCallback_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleCallback_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btInternalTriangleIndexCallbackWrapper_new ] ---

    public static long nbtInternalTriangleIndexCallbackWrapper_new(long internalProcessTriangleIndexCallback) {
        long __functionAddress = Functions.InternalTriangleIndexCallbackWrapper_new;
        return invokePP(internalProcessTriangleIndexCallback, __functionAddress);
    }

    @NativeType("void *")
    public static long btInternalTriangleIndexCallbackWrapper_new(@NativeType("p_btInternalTriangleIndexCallback_internalProcessTriangleIndex") BTInternalTriangleIndexCallbackInternalProcessTriangleIndexI internalProcessTriangleIndexCallback) {
        return nbtInternalTriangleIndexCallbackWrapper_new(internalProcessTriangleIndexCallback.address());
    }

    // --- [ btInternalTriangleIndexCallback_delete ] ---

    public static void btInternalTriangleIndexCallback_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.InternalTriangleIndexCallback_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}
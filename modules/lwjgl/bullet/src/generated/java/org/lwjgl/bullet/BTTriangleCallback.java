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

    @NativeType("void *")
    public static long btTriangleCallbackWrapper_new(@NativeType("void *") long processTriangleCallback) {
        long __functionAddress = Functions.TriangleCallbackWrapper_new;
        if (CHECKS) {
            check(processTriangleCallback);
        }
        return invokePP(processTriangleCallback, __functionAddress);
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

    @NativeType("void *")
    public static long btInternalTriangleIndexCallbackWrapper_new(@NativeType("void *") long internalProcessTriangleIndexCallback) {
        long __functionAddress = Functions.InternalTriangleIndexCallbackWrapper_new;
        if (CHECKS) {
            check(internalProcessTriangleIndexCallback);
        }
        return invokePP(internalProcessTriangleIndexCallback, __functionAddress);
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
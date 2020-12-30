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

public class BTOverlappingPairCallback {

    protected BTOverlappingPairCallback() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            OverlappingPairCallback_addOverlappingPair                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btOverlappingPairCallback_addOverlappingPair"),
            OverlappingPairCallback_removeOverlappingPair                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btOverlappingPairCallback_removeOverlappingPair"),
            OverlappingPairCallback_removeOverlappingPairsContainingProxy = apiGetFunctionAddress(LibBullet.getLibrary(), "btOverlappingPairCallback_removeOverlappingPairsContainingProxy"),
            OverlappingPairCallback_delete                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btOverlappingPairCallback_delete");

    }

    // --- [ btOverlappingPairCallback_addOverlappingPair ] ---

    @NativeType("void *")
    public static long btOverlappingPairCallback_addOverlappingPair(@NativeType("void *") long obj, @NativeType("void *") long proxy0, @NativeType("void *") long proxy1) {
        long __functionAddress = Functions.OverlappingPairCallback_addOverlappingPair;
        if (CHECKS) {
            check(obj);
            check(proxy0);
            check(proxy1);
        }
        return invokePPPP(obj, proxy0, proxy1, __functionAddress);
    }

    // --- [ btOverlappingPairCallback_removeOverlappingPair ] ---

    @NativeType("void *")
    public static long btOverlappingPairCallback_removeOverlappingPair(@NativeType("void *") long obj, @NativeType("void *") long proxy0, @NativeType("void *") long proxy1, @NativeType("void *") long dispatcher) {
        long __functionAddress = Functions.OverlappingPairCallback_removeOverlappingPair;
        if (CHECKS) {
            check(obj);
            check(proxy0);
            check(proxy1);
            check(dispatcher);
        }
        return invokePPPPP(obj, proxy0, proxy1, dispatcher, __functionAddress);
    }

    // --- [ btOverlappingPairCallback_removeOverlappingPairsContainingProxy ] ---

    public static void btOverlappingPairCallback_removeOverlappingPairsContainingProxy(@NativeType("void *") long obj, @NativeType("void *") long proxy0, @NativeType("void *") long dispatcher) {
        long __functionAddress = Functions.OverlappingPairCallback_removeOverlappingPairsContainingProxy;
        if (CHECKS) {
            check(obj);
            check(proxy0);
            check(dispatcher);
        }
        invokePPPV(obj, proxy0, dispatcher, __functionAddress);
    }

    // --- [ btOverlappingPairCallback_delete ] ---

    public static void btOverlappingPairCallback_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.OverlappingPairCallback_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}
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

public class BTMultiBodyLinkCollider {

    protected BTMultiBodyLinkCollider() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MultiBodyLinkCollider_new          = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyLinkCollider_new"),
            MultiBodyLinkCollider_getLink      = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyLinkCollider_getLink"),
            MultiBodyLinkCollider_getMultiBody = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyLinkCollider_getMultiBody"),
            MultiBodyLinkCollider_setLink      = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyLinkCollider_setLink"),
            MultiBodyLinkCollider_setMultiBody = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyLinkCollider_setMultiBody"),
            MultiBodyLinkCollider_upcast       = apiGetFunctionAddress(LibBullet.getLibrary(), "btMultiBodyLinkCollider_upcast");

    }

    // --- [ btMultiBodyLinkCollider_new ] ---

    @NativeType("void *")
    public static long btMultiBodyLinkCollider_new(@NativeType("void *") long multiBody, int link) {
        long __functionAddress = Functions.MultiBodyLinkCollider_new;
        if (CHECKS) {
            check(multiBody);
        }
        return invokePP(multiBody, link, __functionAddress);
    }

    // --- [ btMultiBodyLinkCollider_getLink ] ---

    public static int btMultiBodyLinkCollider_getLink(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodyLinkCollider_getLink;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btMultiBodyLinkCollider_getMultiBody ] ---

    @NativeType("void *")
    public static long btMultiBodyLinkCollider_getMultiBody(@NativeType("void *") long obj) {
        long __functionAddress = Functions.MultiBodyLinkCollider_getMultiBody;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btMultiBodyLinkCollider_setLink ] ---

    public static void btMultiBodyLinkCollider_setLink(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.MultiBodyLinkCollider_setLink;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodyLinkCollider_setMultiBody ] ---

    public static void btMultiBodyLinkCollider_setMultiBody(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.MultiBodyLinkCollider_setMultiBody;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btMultiBodyLinkCollider_upcast ] ---

    @NativeType("void *")
    public static long btMultiBodyLinkCollider_upcast(@NativeType("void *") long colObj) {
        long __functionAddress = Functions.MultiBodyLinkCollider_upcast;
        if (CHECKS) {
            check(colObj);
        }
        return invokePP(colObj, __functionAddress);
    }

}
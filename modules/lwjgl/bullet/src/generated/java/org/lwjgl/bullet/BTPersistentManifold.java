/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class BTPersistentManifold {

    protected BTPersistentManifold() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            btPersistentManifold_new                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_new"),
            btPersistentManifold_new2                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_new2"),
            btPersistentManifold_addManifoldPoint              = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_addManifoldPoint"),
            btPersistentManifold_clearManifold                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_clearManifold"),
            btPersistentManifold_clearUserCache                = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_clearUserCache"),
            btPersistentManifold_getBody0                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_getBody0"),
            btPersistentManifold_getBody1                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_getBody1"),
            btPersistentManifold_getCacheEntry                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_getCacheEntry"),
            btPersistentManifold_getCompanionIdA               = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_getCompanionIdA"),
            btPersistentManifold_getCompanionIdB               = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_getCompanionIdB"),
            btPersistentManifold_getContactBreakingThreshold   = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_getContactBreakingThreshold"),
            btPersistentManifold_getContactPoint               = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_getContactPoint"),
            btPersistentManifold_getContactProcessingThreshold = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_getContactProcessingThreshold"),
            btPersistentManifold_getIndex1a                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_getIndex1a"),
            btPersistentManifold_getNumContacts                = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_getNumContacts"),
            btPersistentManifold_refreshContactPoints          = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_refreshContactPoints"),
            btPersistentManifold_removeContactPoint            = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_removeContactPoint"),
            btPersistentManifold_replaceContactPoint           = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_replaceContactPoint"),
            btPersistentManifold_setBodies                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_setBodies"),
            btPersistentManifold_setCompanionIdA               = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_setCompanionIdA"),
            btPersistentManifold_setCompanionIdB               = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_setCompanionIdB"),
            btPersistentManifold_setContactBreakingThreshold   = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_setContactBreakingThreshold"),
            btPersistentManifold_setContactProcessingThreshold = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_setContactProcessingThreshold"),
            btPersistentManifold_setIndex1a                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_setIndex1a"),
            btPersistentManifold_setNumContacts                = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_setNumContacts"),
            btPersistentManifold_validContactDistance          = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_validContactDistance"),
            btPersistentManifold_delete                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_delete"),
            getGContactDestroyedCallback                       = apiGetFunctionAddress(LibBullet.getLibrary(), "getGContactDestroyedCallback"),
            getGContactProcessedCallback                       = apiGetFunctionAddress(LibBullet.getLibrary(), "getGContactProcessedCallback"),
            setGContactDestroyedCallback                       = apiGetFunctionAddress(LibBullet.getLibrary(), "setGContactDestroyedCallback"),
            setGContactProcessedCallback                       = apiGetFunctionAddress(LibBullet.getLibrary(), "setGContactProcessedCallback");

    }

    // --- [ btPersistentManifold_new ] ---

    @NativeType("void *")
    public static long btPersistentManifold_new() {
        long __functionAddress = Functions.btPersistentManifold_new;
        return invokeP(__functionAddress);
    }

    // --- [ btPersistentManifold_new2 ] ---

    @NativeType("void *")
    public static long btPersistentManifold_new2(@NativeType("void *") long body0, @NativeType("void *") long body1, int __unnamed2, @NativeType("btScalar") float contactBreakingThreshold, @NativeType("btScalar") float contactProcessingThreshold) {
        long __functionAddress = Functions.btPersistentManifold_new2;
        if (CHECKS) {
            check(body0);
            check(body1);
        }
        return invokePPP(body0, body1, __unnamed2, contactBreakingThreshold, contactProcessingThreshold, __functionAddress);
    }

    // --- [ btPersistentManifold_addManifoldPoint ] ---

    public static int btPersistentManifold_addManifoldPoint(@NativeType("void *") long obj, @NativeType("void *") long newPoint, @NativeType("bool") boolean isPredictive) {
        long __functionAddress = Functions.btPersistentManifold_addManifoldPoint;
        if (CHECKS) {
            check(obj);
            check(newPoint);
        }
        return invokePPI(obj, newPoint, isPredictive, __functionAddress);
    }

    // --- [ btPersistentManifold_clearManifold ] ---

    public static void btPersistentManifold_clearManifold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btPersistentManifold_clearManifold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btPersistentManifold_clearUserCache ] ---

    public static void btPersistentManifold_clearUserCache(@NativeType("void *") long obj, @NativeType("void *") long pt) {
        long __functionAddress = Functions.btPersistentManifold_clearUserCache;
        if (CHECKS) {
            check(obj);
            check(pt);
        }
        invokePPV(obj, pt, __functionAddress);
    }

    // --- [ btPersistentManifold_getBody0 ] ---

    @NativeType("void *")
    public static long btPersistentManifold_getBody0(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btPersistentManifold_getBody0;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btPersistentManifold_getBody1 ] ---

    @NativeType("void *")
    public static long btPersistentManifold_getBody1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btPersistentManifold_getBody1;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btPersistentManifold_getCacheEntry ] ---

    public static int btPersistentManifold_getCacheEntry(@NativeType("void *") long obj, @NativeType("void *") long newPoint) {
        long __functionAddress = Functions.btPersistentManifold_getCacheEntry;
        if (CHECKS) {
            check(obj);
            check(newPoint);
        }
        return invokePPI(obj, newPoint, __functionAddress);
    }

    // --- [ btPersistentManifold_getCompanionIdA ] ---

    public static int btPersistentManifold_getCompanionIdA(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btPersistentManifold_getCompanionIdA;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btPersistentManifold_getCompanionIdB ] ---

    public static int btPersistentManifold_getCompanionIdB(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btPersistentManifold_getCompanionIdB;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btPersistentManifold_getContactBreakingThreshold ] ---

    @NativeType("btScalar")
    public static float btPersistentManifold_getContactBreakingThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btPersistentManifold_getContactBreakingThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btPersistentManifold_getContactPoint ] ---

    @NativeType("void *")
    public static long btPersistentManifold_getContactPoint(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.btPersistentManifold_getContactPoint;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btPersistentManifold_getContactProcessingThreshold ] ---

    @NativeType("btScalar")
    public static float btPersistentManifold_getContactProcessingThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btPersistentManifold_getContactProcessingThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btPersistentManifold_getIndex1a ] ---

    public static int btPersistentManifold_getIndex1a(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btPersistentManifold_getIndex1a;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btPersistentManifold_getNumContacts ] ---

    public static int btPersistentManifold_getNumContacts(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btPersistentManifold_getNumContacts;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btPersistentManifold_refreshContactPoints ] ---

    public static void nbtPersistentManifold_refreshContactPoints(long obj, long trA, long trB) {
        long __functionAddress = Functions.btPersistentManifold_refreshContactPoints;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, trA, trB, __functionAddress);
    }

    public static void btPersistentManifold_refreshContactPoints(@NativeType("void *") long obj, @NativeType("btTransform const *") BTTransform trA, @NativeType("btTransform const *") BTTransform trB) {
        nbtPersistentManifold_refreshContactPoints(obj, trA.address(), trB.address());
    }

    // --- [ btPersistentManifold_removeContactPoint ] ---

    public static void btPersistentManifold_removeContactPoint(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.btPersistentManifold_removeContactPoint;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, __functionAddress);
    }

    // --- [ btPersistentManifold_replaceContactPoint ] ---

    public static void btPersistentManifold_replaceContactPoint(@NativeType("void *") long obj, @NativeType("void *") long newPoint, int insertIndex) {
        long __functionAddress = Functions.btPersistentManifold_replaceContactPoint;
        if (CHECKS) {
            check(obj);
            check(newPoint);
        }
        invokePPV(obj, newPoint, insertIndex, __functionAddress);
    }

    // --- [ btPersistentManifold_setBodies ] ---

    public static void btPersistentManifold_setBodies(@NativeType("void *") long obj, @NativeType("void *") long body0, @NativeType("void *") long body1) {
        long __functionAddress = Functions.btPersistentManifold_setBodies;
        if (CHECKS) {
            check(obj);
            check(body0);
            check(body1);
        }
        invokePPPV(obj, body0, body1, __functionAddress);
    }

    // --- [ btPersistentManifold_setCompanionIdA ] ---

    public static void btPersistentManifold_setCompanionIdA(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.btPersistentManifold_setCompanionIdA;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btPersistentManifold_setCompanionIdB ] ---

    public static void btPersistentManifold_setCompanionIdB(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.btPersistentManifold_setCompanionIdB;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btPersistentManifold_setContactBreakingThreshold ] ---

    public static void btPersistentManifold_setContactBreakingThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float contactBreakingThreshold) {
        long __functionAddress = Functions.btPersistentManifold_setContactBreakingThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, contactBreakingThreshold, __functionAddress);
    }

    // --- [ btPersistentManifold_setContactProcessingThreshold ] ---

    public static void btPersistentManifold_setContactProcessingThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float contactProcessingThreshold) {
        long __functionAddress = Functions.btPersistentManifold_setContactProcessingThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, contactProcessingThreshold, __functionAddress);
    }

    // --- [ btPersistentManifold_setIndex1a ] ---

    public static void btPersistentManifold_setIndex1a(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.btPersistentManifold_setIndex1a;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btPersistentManifold_setNumContacts ] ---

    public static void btPersistentManifold_setNumContacts(@NativeType("void *") long obj, int cachedPoints) {
        long __functionAddress = Functions.btPersistentManifold_setNumContacts;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, cachedPoints, __functionAddress);
    }

    // --- [ btPersistentManifold_validContactDistance ] ---

    @NativeType("bool")
    public static boolean btPersistentManifold_validContactDistance(@NativeType("void *") long obj, @NativeType("void *") long pt) {
        long __functionAddress = Functions.btPersistentManifold_validContactDistance;
        if (CHECKS) {
            check(obj);
            check(pt);
        }
        return invokePPZ(obj, pt, __functionAddress);
    }

    // --- [ btPersistentManifold_delete ] ---

    public static void btPersistentManifold_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btPersistentManifold_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ getGContactDestroyedCallback ] ---

    public static long ngetGContactDestroyedCallback() {
        long __functionAddress = Functions.getGContactDestroyedCallback;
        return invokeP(__functionAddress);
    }

    @Nullable
    @NativeType("ContactDestroyedCallback")
    public static BTContactDestroyedCallback getGContactDestroyedCallback() {
        return BTContactDestroyedCallback.createSafe(ngetGContactDestroyedCallback());
    }

    // --- [ getGContactProcessedCallback ] ---

    public static long ngetGContactProcessedCallback() {
        long __functionAddress = Functions.getGContactProcessedCallback;
        return invokeP(__functionAddress);
    }

    @Nullable
    @NativeType("ContactProcessedCallback")
    public static BTContactProcessedCallback getGContactProcessedCallback() {
        return BTContactProcessedCallback.createSafe(ngetGContactProcessedCallback());
    }

    // --- [ setGContactDestroyedCallback ] ---

    public static void nsetGContactDestroyedCallback(long callback) {
        long __functionAddress = Functions.setGContactDestroyedCallback;
        invokePV(callback, __functionAddress);
    }

    public static void setGContactDestroyedCallback(@NativeType("ContactDestroyedCallback") BTContactDestroyedCallbackI callback) {
        nsetGContactDestroyedCallback(callback.address());
    }

    // --- [ setGContactProcessedCallback ] ---

    public static void nsetGContactProcessedCallback(long callback) {
        long __functionAddress = Functions.setGContactProcessedCallback;
        invokePV(callback, __functionAddress);
    }

    public static void setGContactProcessedCallback(@NativeType("ContactProcessedCallback") BTContactProcessedCallbackI callback) {
        nsetGContactProcessedCallback(callback.address());
    }

}
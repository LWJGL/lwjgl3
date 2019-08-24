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

public class BTPersistentManifold {

    protected BTPersistentManifold() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            PersistentManifold_new                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_new"),
            PersistentManifold_new2                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_new2"),
            PersistentManifold_addManifoldPoint              = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_addManifoldPoint"),
            PersistentManifold_clearManifold                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_clearManifold"),
            PersistentManifold_clearUserCache                = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_clearUserCache"),
            PersistentManifold_getBody0                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_getBody0"),
            PersistentManifold_getBody1                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_getBody1"),
            PersistentManifold_getCacheEntry                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_getCacheEntry"),
            PersistentManifold_getCompanionIdA               = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_getCompanionIdA"),
            PersistentManifold_getCompanionIdB               = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_getCompanionIdB"),
            PersistentManifold_getContactBreakingThreshold   = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_getContactBreakingThreshold"),
            PersistentManifold_getContactPoint               = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_getContactPoint"),
            PersistentManifold_getContactProcessingThreshold = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_getContactProcessingThreshold"),
            PersistentManifold_getIndex1a                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_getIndex1a"),
            PersistentManifold_getNumContacts                = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_getNumContacts"),
            PersistentManifold_refreshContactPoints          = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_refreshContactPoints"),
            PersistentManifold_removeContactPoint            = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_removeContactPoint"),
            PersistentManifold_replaceContactPoint           = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_replaceContactPoint"),
            PersistentManifold_setBodies                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_setBodies"),
            PersistentManifold_setCompanionIdA               = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_setCompanionIdA"),
            PersistentManifold_setCompanionIdB               = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_setCompanionIdB"),
            PersistentManifold_setContactBreakingThreshold   = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_setContactBreakingThreshold"),
            PersistentManifold_setContactProcessingThreshold = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_setContactProcessingThreshold"),
            PersistentManifold_setIndex1a                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_setIndex1a"),
            PersistentManifold_setNumContacts                = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_setNumContacts"),
            PersistentManifold_validContactDistance          = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_validContactDistance"),
            PersistentManifold_delete                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btPersistentManifold_delete"),
            getGContactDestroyedCallback                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btgetGContactDestroyedCallback"),
            getGContactProcessedCallback                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btgetGContactProcessedCallback"),
            setGContactDestroyedCallback                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btsetGContactDestroyedCallback"),
            setGContactProcessedCallback                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btsetGContactProcessedCallback");

    }

    // --- [ btPersistentManifold_new ] ---

    @NativeType("void *")
    public static long btPersistentManifold_new() {
        long __functionAddress = Functions.PersistentManifold_new;
        return invokeP(__functionAddress);
    }

    // --- [ btPersistentManifold_new2 ] ---

    @NativeType("void *")
    public static long btPersistentManifold_new2(@NativeType("void *") long body0, @NativeType("void *") long body1, int __unnamed2, @NativeType("btScalar") float contactBreakingThreshold, @NativeType("btScalar") float contactProcessingThreshold) {
        long __functionAddress = Functions.PersistentManifold_new2;
        if (CHECKS) {
            check(body0);
            check(body1);
        }
        return invokePPP(body0, body1, __unnamed2, contactBreakingThreshold, contactProcessingThreshold, __functionAddress);
    }

    // --- [ btPersistentManifold_addManifoldPoint ] ---

    public static int btPersistentManifold_addManifoldPoint(@NativeType("void *") long obj, @NativeType("void *") long newPoint, @NativeType("bool") boolean isPredictive) {
        long __functionAddress = Functions.PersistentManifold_addManifoldPoint;
        if (CHECKS) {
            check(obj);
            check(newPoint);
        }
        return invokePPI(obj, newPoint, isPredictive, __functionAddress);
    }

    // --- [ btPersistentManifold_clearManifold ] ---

    public static void btPersistentManifold_clearManifold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PersistentManifold_clearManifold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btPersistentManifold_clearUserCache ] ---

    public static void btPersistentManifold_clearUserCache(@NativeType("void *") long obj, @NativeType("void *") long pt) {
        long __functionAddress = Functions.PersistentManifold_clearUserCache;
        if (CHECKS) {
            check(obj);
            check(pt);
        }
        invokePPV(obj, pt, __functionAddress);
    }

    // --- [ btPersistentManifold_getBody0 ] ---

    @NativeType("void *")
    public static long btPersistentManifold_getBody0(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PersistentManifold_getBody0;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btPersistentManifold_getBody1 ] ---

    @NativeType("void *")
    public static long btPersistentManifold_getBody1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PersistentManifold_getBody1;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btPersistentManifold_getCacheEntry ] ---

    public static int btPersistentManifold_getCacheEntry(@NativeType("void *") long obj, @NativeType("void *") long newPoint) {
        long __functionAddress = Functions.PersistentManifold_getCacheEntry;
        if (CHECKS) {
            check(obj);
            check(newPoint);
        }
        return invokePPI(obj, newPoint, __functionAddress);
    }

    // --- [ btPersistentManifold_getCompanionIdA ] ---

    public static int btPersistentManifold_getCompanionIdA(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PersistentManifold_getCompanionIdA;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btPersistentManifold_getCompanionIdB ] ---

    public static int btPersistentManifold_getCompanionIdB(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PersistentManifold_getCompanionIdB;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btPersistentManifold_getContactBreakingThreshold ] ---

    @NativeType("btScalar")
    public static float btPersistentManifold_getContactBreakingThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PersistentManifold_getContactBreakingThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btPersistentManifold_getContactPoint ] ---

    @NativeType("void *")
    public static long btPersistentManifold_getContactPoint(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.PersistentManifold_getContactPoint;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, index, __functionAddress);
    }

    // --- [ btPersistentManifold_getContactProcessingThreshold ] ---

    @NativeType("btScalar")
    public static float btPersistentManifold_getContactProcessingThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PersistentManifold_getContactProcessingThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btPersistentManifold_getIndex1a ] ---

    public static int btPersistentManifold_getIndex1a(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PersistentManifold_getIndex1a;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btPersistentManifold_getNumContacts ] ---

    public static int btPersistentManifold_getNumContacts(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PersistentManifold_getNumContacts;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btPersistentManifold_refreshContactPoints ] ---

    public static void nbtPersistentManifold_refreshContactPoints(long obj, long trA, long trB) {
        long __functionAddress = Functions.PersistentManifold_refreshContactPoints;
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
        long __functionAddress = Functions.PersistentManifold_removeContactPoint;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, __functionAddress);
    }

    // --- [ btPersistentManifold_replaceContactPoint ] ---

    public static void btPersistentManifold_replaceContactPoint(@NativeType("void *") long obj, @NativeType("void *") long newPoint, int insertIndex) {
        long __functionAddress = Functions.PersistentManifold_replaceContactPoint;
        if (CHECKS) {
            check(obj);
            check(newPoint);
        }
        invokePPV(obj, newPoint, insertIndex, __functionAddress);
    }

    // --- [ btPersistentManifold_setBodies ] ---

    public static void btPersistentManifold_setBodies(@NativeType("void *") long obj, @NativeType("void *") long body0, @NativeType("void *") long body1) {
        long __functionAddress = Functions.PersistentManifold_setBodies;
        if (CHECKS) {
            check(obj);
            check(body0);
            check(body1);
        }
        invokePPPV(obj, body0, body1, __functionAddress);
    }

    // --- [ btPersistentManifold_setCompanionIdA ] ---

    public static void btPersistentManifold_setCompanionIdA(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.PersistentManifold_setCompanionIdA;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btPersistentManifold_setCompanionIdB ] ---

    public static void btPersistentManifold_setCompanionIdB(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.PersistentManifold_setCompanionIdB;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btPersistentManifold_setContactBreakingThreshold ] ---

    public static void btPersistentManifold_setContactBreakingThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float contactBreakingThreshold) {
        long __functionAddress = Functions.PersistentManifold_setContactBreakingThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, contactBreakingThreshold, __functionAddress);
    }

    // --- [ btPersistentManifold_setContactProcessingThreshold ] ---

    public static void btPersistentManifold_setContactProcessingThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float contactProcessingThreshold) {
        long __functionAddress = Functions.PersistentManifold_setContactProcessingThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, contactProcessingThreshold, __functionAddress);
    }

    // --- [ btPersistentManifold_setIndex1a ] ---

    public static void btPersistentManifold_setIndex1a(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.PersistentManifold_setIndex1a;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btPersistentManifold_setNumContacts ] ---

    public static void btPersistentManifold_setNumContacts(@NativeType("void *") long obj, int cachedPoints) {
        long __functionAddress = Functions.PersistentManifold_setNumContacts;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, cachedPoints, __functionAddress);
    }

    // --- [ btPersistentManifold_validContactDistance ] ---

    @NativeType("bool")
    public static boolean btPersistentManifold_validContactDistance(@NativeType("void *") long obj, @NativeType("void *") long pt) {
        long __functionAddress = Functions.PersistentManifold_validContactDistance;
        if (CHECKS) {
            check(obj);
            check(pt);
        }
        return invokePPZ(obj, pt, __functionAddress);
    }

    // --- [ btPersistentManifold_delete ] ---

    public static void btPersistentManifold_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.PersistentManifold_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btgetGContactDestroyedCallback ] ---

    @NativeType("void *")
    public static long btgetGContactDestroyedCallback() {
        long __functionAddress = Functions.getGContactDestroyedCallback;
        return invokeP(__functionAddress);
    }

    // --- [ btgetGContactProcessedCallback ] ---

    @NativeType("void *")
    public static long btgetGContactProcessedCallback() {
        long __functionAddress = Functions.getGContactProcessedCallback;
        return invokeP(__functionAddress);
    }

    // --- [ btsetGContactDestroyedCallback ] ---

    public static void btsetGContactDestroyedCallback(@NativeType("void *") long callback) {
        long __functionAddress = Functions.setGContactDestroyedCallback;
        if (CHECKS) {
            check(callback);
        }
        invokePV(callback, __functionAddress);
    }

    // --- [ btsetGContactProcessedCallback ] ---

    public static void btsetGContactProcessedCallback(@NativeType("void *") long callback) {
        long __functionAddress = Functions.setGContactProcessedCallback;
        if (CHECKS) {
            check(callback);
        }
        invokePV(callback, __functionAddress);
    }

}
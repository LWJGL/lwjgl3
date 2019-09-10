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

public class BTManifoldPoint {

    protected BTManifoldPoint() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            btManifoldPoint_new                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_new"),
            btManifoldPoint_new2                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_new2"),
            btManifoldPoint_getAppliedImpulse            = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getAppliedImpulse"),
            btManifoldPoint_getAppliedImpulseLateral1    = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getAppliedImpulseLateral1"),
            btManifoldPoint_getAppliedImpulseLateral2    = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getAppliedImpulseLateral2"),
            btManifoldPoint_getCombinedContactDamping1   = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getCombinedContactDamping1"),
            btManifoldPoint_getCombinedContactStiffness1 = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getCombinedContactStiffness1"),
            btManifoldPoint_getCombinedFriction          = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getCombinedFriction"),
            btManifoldPoint_getCombinedRestitution       = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getCombinedRestitution"),
            btManifoldPoint_getCombinedRollingFriction   = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getCombinedRollingFriction"),
            btManifoldPoint_getContactCFM                = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getContactCFM"),
            btManifoldPoint_getContactERP                = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getContactERP"),
            btManifoldPoint_getContactMotion1            = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getContactMotion1"),
            btManifoldPoint_getContactMotion2            = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getContactMotion2"),
            btManifoldPoint_getContactPointFlags         = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getContactPointFlags"),
            btManifoldPoint_getDistance                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getDistance"),
            btManifoldPoint_getDistance1                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getDistance1"),
            btManifoldPoint_getFrictionCFM               = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getFrictionCFM"),
            btManifoldPoint_getIndex0                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getIndex0"),
            btManifoldPoint_getIndex1                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getIndex1"),
            btManifoldPoint_getLateralFrictionDir1       = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getLateralFrictionDir1"),
            btManifoldPoint_getLateralFrictionDir2       = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getLateralFrictionDir2"),
            btManifoldPoint_getLifeTime                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getLifeTime"),
            btManifoldPoint_getLocalPointA               = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getLocalPointA"),
            btManifoldPoint_getLocalPointB               = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getLocalPointB"),
            btManifoldPoint_getNormalWorldOnB            = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getNormalWorldOnB"),
            btManifoldPoint_getPartId0                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getPartId0"),
            btManifoldPoint_getPartId1                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getPartId1"),
            btManifoldPoint_getPositionWorldOnA          = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getPositionWorldOnA"),
            btManifoldPoint_getPositionWorldOnB          = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getPositionWorldOnB"),
            btManifoldPoint_getUserPersistentData        = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getUserPersistentData"),
            btManifoldPoint_setAppliedImpulse            = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setAppliedImpulse"),
            btManifoldPoint_setAppliedImpulseLateral1    = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setAppliedImpulseLateral1"),
            btManifoldPoint_setAppliedImpulseLateral2    = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setAppliedImpulseLateral2"),
            btManifoldPoint_setCombinedContactDamping1   = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setCombinedContactDamping1"),
            btManifoldPoint_setCombinedContactStiffness1 = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setCombinedContactStiffness1"),
            btManifoldPoint_setCombinedFriction          = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setCombinedFriction"),
            btManifoldPoint_setCombinedRestitution       = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setCombinedRestitution"),
            btManifoldPoint_setCombinedRollingFriction   = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setCombinedRollingFriction"),
            btManifoldPoint_setContactCFM                = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setContactCFM"),
            btManifoldPoint_setContactERP                = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setContactERP"),
            btManifoldPoint_setContactMotion1            = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setContactMotion1"),
            btManifoldPoint_setContactMotion2            = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setContactMotion2"),
            btManifoldPoint_setContactPointFlags         = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setContactPointFlags"),
            btManifoldPoint_setDistance                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setDistance"),
            btManifoldPoint_setDistance1                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setDistance1"),
            btManifoldPoint_setFrictionCFM               = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setFrictionCFM"),
            btManifoldPoint_setIndex0                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setIndex0"),
            btManifoldPoint_setIndex1                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setIndex1"),
            btManifoldPoint_setLateralFrictionDir1       = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setLateralFrictionDir1"),
            btManifoldPoint_setLateralFrictionDir2       = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setLateralFrictionDir2"),
            btManifoldPoint_setLifeTime                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setLifeTime"),
            btManifoldPoint_setLocalPointA               = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setLocalPointA"),
            btManifoldPoint_setLocalPointB               = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setLocalPointB"),
            btManifoldPoint_setNormalWorldOnB            = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setNormalWorldOnB"),
            btManifoldPoint_setPartId0                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setPartId0"),
            btManifoldPoint_setPartId1                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setPartId1"),
            btManifoldPoint_setPositionWorldOnA          = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setPositionWorldOnA"),
            btManifoldPoint_setPositionWorldOnB          = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setPositionWorldOnB"),
            btManifoldPoint_setUserPersistentData        = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setUserPersistentData"),
            btManifoldPoint_delete                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_delete"),
            getGContactAddedCallback                     = apiGetFunctionAddress(LibBullet.getLibrary(), "getGContactAddedCallback"),
            setGContactAddedCallback                     = apiGetFunctionAddress(LibBullet.getLibrary(), "setGContactAddedCallback");

    }

    // --- [ btManifoldPoint_new ] ---

    @NativeType("void *")
    public static long btManifoldPoint_new() {
        long __functionAddress = Functions.btManifoldPoint_new;
        return invokeP(__functionAddress);
    }

    // --- [ btManifoldPoint_new2 ] ---

    public static long nbtManifoldPoint_new2(long pointA, long pointB, long normal, float distance) {
        long __functionAddress = Functions.btManifoldPoint_new2;
        return invokePPPP(pointA, pointB, normal, distance, __functionAddress);
    }

    @NativeType("void *")
    public static long btManifoldPoint_new2(@NativeType("btVector3 const *") BTVector3 pointA, @NativeType("btVector3 const *") BTVector3 pointB, @NativeType("btVector3 const *") BTVector3 normal, @NativeType("btScalar") float distance) {
        return nbtManifoldPoint_new2(pointA.address(), pointB.address(), normal.address(), distance);
    }

    // --- [ btManifoldPoint_getAppliedImpulse ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getAppliedImpulse(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_getAppliedImpulse;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getAppliedImpulseLateral1 ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getAppliedImpulseLateral1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_getAppliedImpulseLateral1;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getAppliedImpulseLateral2 ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getAppliedImpulseLateral2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_getAppliedImpulseLateral2;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getCombinedContactDamping1 ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getCombinedContactDamping1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_getCombinedContactDamping1;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getCombinedContactStiffness1 ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getCombinedContactStiffness1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_getCombinedContactStiffness1;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getCombinedFriction ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getCombinedFriction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_getCombinedFriction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getCombinedRestitution ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getCombinedRestitution(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_getCombinedRestitution;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getCombinedRollingFriction ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getCombinedRollingFriction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_getCombinedRollingFriction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getContactCFM ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getContactCFM(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_getContactCFM;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getContactERP ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getContactERP(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_getContactERP;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getContactMotion1 ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getContactMotion1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_getContactMotion1;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getContactMotion2 ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getContactMotion2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_getContactMotion2;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getContactPointFlags ] ---

    public static int btManifoldPoint_getContactPointFlags(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_getContactPointFlags;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getDistance ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getDistance(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_getDistance;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getDistance1 ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getDistance1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_getDistance1;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getFrictionCFM ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getFrictionCFM(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_getFrictionCFM;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getIndex0 ] ---

    public static int btManifoldPoint_getIndex0(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_getIndex0;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getIndex1 ] ---

    public static int btManifoldPoint_getIndex1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_getIndex1;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getLateralFrictionDir1 ] ---

    public static void nbtManifoldPoint_getLateralFrictionDir1(long obj, long value) {
        long __functionAddress = Functions.btManifoldPoint_getLateralFrictionDir1;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_getLateralFrictionDir1(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtManifoldPoint_getLateralFrictionDir1(obj, value.address());
    }

    // --- [ btManifoldPoint_getLateralFrictionDir2 ] ---

    public static void nbtManifoldPoint_getLateralFrictionDir2(long obj, long value) {
        long __functionAddress = Functions.btManifoldPoint_getLateralFrictionDir2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_getLateralFrictionDir2(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtManifoldPoint_getLateralFrictionDir2(obj, value.address());
    }

    // --- [ btManifoldPoint_getLifeTime ] ---

    public static int btManifoldPoint_getLifeTime(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_getLifeTime;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getLocalPointA ] ---

    public static void nbtManifoldPoint_getLocalPointA(long obj, long value) {
        long __functionAddress = Functions.btManifoldPoint_getLocalPointA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_getLocalPointA(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtManifoldPoint_getLocalPointA(obj, value.address());
    }

    // --- [ btManifoldPoint_getLocalPointB ] ---

    public static void nbtManifoldPoint_getLocalPointB(long obj, long value) {
        long __functionAddress = Functions.btManifoldPoint_getLocalPointB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_getLocalPointB(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtManifoldPoint_getLocalPointB(obj, value.address());
    }

    // --- [ btManifoldPoint_getNormalWorldOnB ] ---

    public static void nbtManifoldPoint_getNormalWorldOnB(long obj, long value) {
        long __functionAddress = Functions.btManifoldPoint_getNormalWorldOnB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_getNormalWorldOnB(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtManifoldPoint_getNormalWorldOnB(obj, value.address());
    }

    // --- [ btManifoldPoint_getPartId0 ] ---

    public static int btManifoldPoint_getPartId0(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_getPartId0;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getPartId1 ] ---

    public static int btManifoldPoint_getPartId1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_getPartId1;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getPositionWorldOnA ] ---

    public static void nbtManifoldPoint_getPositionWorldOnA(long obj, long value) {
        long __functionAddress = Functions.btManifoldPoint_getPositionWorldOnA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_getPositionWorldOnA(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtManifoldPoint_getPositionWorldOnA(obj, value.address());
    }

    // --- [ btManifoldPoint_getPositionWorldOnB ] ---

    public static void nbtManifoldPoint_getPositionWorldOnB(long obj, long value) {
        long __functionAddress = Functions.btManifoldPoint_getPositionWorldOnB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_getPositionWorldOnB(@NativeType("void *") long obj, @NativeType("btVector3 *") BTVector3 value) {
        nbtManifoldPoint_getPositionWorldOnB(obj, value.address());
    }

    // --- [ btManifoldPoint_getUserPersistentData ] ---

    @NativeType("void *")
    public static long btManifoldPoint_getUserPersistentData(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_getUserPersistentData;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_setAppliedImpulse ] ---

    public static void btManifoldPoint_setAppliedImpulse(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.btManifoldPoint_setAppliedImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setAppliedImpulseLateral1 ] ---

    public static void btManifoldPoint_setAppliedImpulseLateral1(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.btManifoldPoint_setAppliedImpulseLateral1;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setAppliedImpulseLateral2 ] ---

    public static void btManifoldPoint_setAppliedImpulseLateral2(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.btManifoldPoint_setAppliedImpulseLateral2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setCombinedContactDamping1 ] ---

    public static void btManifoldPoint_setCombinedContactDamping1(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.btManifoldPoint_setCombinedContactDamping1;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setCombinedContactStiffness1 ] ---

    public static void btManifoldPoint_setCombinedContactStiffness1(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.btManifoldPoint_setCombinedContactStiffness1;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setCombinedFriction ] ---

    public static void btManifoldPoint_setCombinedFriction(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.btManifoldPoint_setCombinedFriction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setCombinedRestitution ] ---

    public static void btManifoldPoint_setCombinedRestitution(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.btManifoldPoint_setCombinedRestitution;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setCombinedRollingFriction ] ---

    public static void btManifoldPoint_setCombinedRollingFriction(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.btManifoldPoint_setCombinedRollingFriction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setContactCFM ] ---

    public static void btManifoldPoint_setContactCFM(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.btManifoldPoint_setContactCFM;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setContactERP ] ---

    public static void btManifoldPoint_setContactERP(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.btManifoldPoint_setContactERP;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setContactMotion1 ] ---

    public static void btManifoldPoint_setContactMotion1(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.btManifoldPoint_setContactMotion1;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setContactMotion2 ] ---

    public static void btManifoldPoint_setContactMotion2(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.btManifoldPoint_setContactMotion2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setContactPointFlags ] ---

    public static void btManifoldPoint_setContactPointFlags(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.btManifoldPoint_setContactPointFlags;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setDistance ] ---

    public static void btManifoldPoint_setDistance(@NativeType("void *") long obj, @NativeType("btScalar") float dist) {
        long __functionAddress = Functions.btManifoldPoint_setDistance;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, dist, __functionAddress);
    }

    // --- [ btManifoldPoint_setDistance1 ] ---

    public static void btManifoldPoint_setDistance1(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.btManifoldPoint_setDistance1;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setFrictionCFM ] ---

    public static void btManifoldPoint_setFrictionCFM(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.btManifoldPoint_setFrictionCFM;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setIndex0 ] ---

    public static void btManifoldPoint_setIndex0(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.btManifoldPoint_setIndex0;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setIndex1 ] ---

    public static void btManifoldPoint_setIndex1(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.btManifoldPoint_setIndex1;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setLateralFrictionDir1 ] ---

    public static void nbtManifoldPoint_setLateralFrictionDir1(long obj, long value) {
        long __functionAddress = Functions.btManifoldPoint_setLateralFrictionDir1;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_setLateralFrictionDir1(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtManifoldPoint_setLateralFrictionDir1(obj, value.address());
    }

    // --- [ btManifoldPoint_setLateralFrictionDir2 ] ---

    public static void nbtManifoldPoint_setLateralFrictionDir2(long obj, long value) {
        long __functionAddress = Functions.btManifoldPoint_setLateralFrictionDir2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_setLateralFrictionDir2(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtManifoldPoint_setLateralFrictionDir2(obj, value.address());
    }

    // --- [ btManifoldPoint_setLifeTime ] ---

    public static void btManifoldPoint_setLifeTime(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.btManifoldPoint_setLifeTime;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setLocalPointA ] ---

    public static void nbtManifoldPoint_setLocalPointA(long obj, long value) {
        long __functionAddress = Functions.btManifoldPoint_setLocalPointA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_setLocalPointA(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtManifoldPoint_setLocalPointA(obj, value.address());
    }

    // --- [ btManifoldPoint_setLocalPointB ] ---

    public static void nbtManifoldPoint_setLocalPointB(long obj, long value) {
        long __functionAddress = Functions.btManifoldPoint_setLocalPointB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_setLocalPointB(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtManifoldPoint_setLocalPointB(obj, value.address());
    }

    // --- [ btManifoldPoint_setNormalWorldOnB ] ---

    public static void nbtManifoldPoint_setNormalWorldOnB(long obj, long value) {
        long __functionAddress = Functions.btManifoldPoint_setNormalWorldOnB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_setNormalWorldOnB(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtManifoldPoint_setNormalWorldOnB(obj, value.address());
    }

    // --- [ btManifoldPoint_setPartId0 ] ---

    public static void btManifoldPoint_setPartId0(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.btManifoldPoint_setPartId0;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setPartId1 ] ---

    public static void btManifoldPoint_setPartId1(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.btManifoldPoint_setPartId1;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setPositionWorldOnA ] ---

    public static void nbtManifoldPoint_setPositionWorldOnA(long obj, long value) {
        long __functionAddress = Functions.btManifoldPoint_setPositionWorldOnA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_setPositionWorldOnA(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtManifoldPoint_setPositionWorldOnA(obj, value.address());
    }

    // --- [ btManifoldPoint_setPositionWorldOnB ] ---

    public static void nbtManifoldPoint_setPositionWorldOnB(long obj, long value) {
        long __functionAddress = Functions.btManifoldPoint_setPositionWorldOnB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_setPositionWorldOnB(@NativeType("void *") long obj, @NativeType("btVector3 const *") BTVector3 value) {
        nbtManifoldPoint_setPositionWorldOnB(obj, value.address());
    }

    // --- [ btManifoldPoint_setUserPersistentData ] ---

    public static void btManifoldPoint_setUserPersistentData(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.btManifoldPoint_setUserPersistentData;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_delete ] ---

    public static void btManifoldPoint_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.btManifoldPoint_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ getGContactAddedCallback ] ---

    @NativeType("void *")
    public static long getGContactAddedCallback() {
        long __functionAddress = Functions.getGContactAddedCallback;
        return invokeP(__functionAddress);
    }

    // --- [ setGContactAddedCallback ] ---

    public static void setGContactAddedCallback(@NativeType("void *") long value) {
        long __functionAddress = Functions.setGContactAddedCallback;
        if (CHECKS) {
            check(value);
        }
        invokePV(value, __functionAddress);
    }

}
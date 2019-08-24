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
            ManifoldPoint_new                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_new"),
            ManifoldPoint_new2                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_new2"),
            ManifoldPoint_getAppliedImpulse            = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getAppliedImpulse"),
            ManifoldPoint_getAppliedImpulseLateral1    = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getAppliedImpulseLateral1"),
            ManifoldPoint_getAppliedImpulseLateral2    = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getAppliedImpulseLateral2"),
            ManifoldPoint_getCombinedContactDamping1   = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getCombinedContactDamping1"),
            ManifoldPoint_getCombinedContactStiffness1 = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getCombinedContactStiffness1"),
            ManifoldPoint_getCombinedFriction          = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getCombinedFriction"),
            ManifoldPoint_getCombinedRestitution       = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getCombinedRestitution"),
            ManifoldPoint_getCombinedRollingFriction   = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getCombinedRollingFriction"),
            ManifoldPoint_getContactCFM                = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getContactCFM"),
            ManifoldPoint_getContactERP                = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getContactERP"),
            ManifoldPoint_getContactMotion1            = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getContactMotion1"),
            ManifoldPoint_getContactMotion2            = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getContactMotion2"),
            ManifoldPoint_getContactPointFlags         = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getContactPointFlags"),
            ManifoldPoint_getDistance                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getDistance"),
            ManifoldPoint_getDistance1                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getDistance1"),
            ManifoldPoint_getFrictionCFM               = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getFrictionCFM"),
            ManifoldPoint_getIndex0                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getIndex0"),
            ManifoldPoint_getIndex1                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getIndex1"),
            ManifoldPoint_getLateralFrictionDir1       = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getLateralFrictionDir1"),
            ManifoldPoint_getLateralFrictionDir2       = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getLateralFrictionDir2"),
            ManifoldPoint_getLifeTime                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getLifeTime"),
            ManifoldPoint_getLocalPointA               = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getLocalPointA"),
            ManifoldPoint_getLocalPointB               = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getLocalPointB"),
            ManifoldPoint_getNormalWorldOnB            = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getNormalWorldOnB"),
            ManifoldPoint_getPartId0                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getPartId0"),
            ManifoldPoint_getPartId1                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getPartId1"),
            ManifoldPoint_getPositionWorldOnA          = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getPositionWorldOnA"),
            ManifoldPoint_getPositionWorldOnB          = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getPositionWorldOnB"),
            ManifoldPoint_getUserPersistentData        = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_getUserPersistentData"),
            ManifoldPoint_setAppliedImpulse            = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setAppliedImpulse"),
            ManifoldPoint_setAppliedImpulseLateral1    = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setAppliedImpulseLateral1"),
            ManifoldPoint_setAppliedImpulseLateral2    = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setAppliedImpulseLateral2"),
            ManifoldPoint_setCombinedContactDamping1   = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setCombinedContactDamping1"),
            ManifoldPoint_setCombinedContactStiffness1 = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setCombinedContactStiffness1"),
            ManifoldPoint_setCombinedFriction          = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setCombinedFriction"),
            ManifoldPoint_setCombinedRestitution       = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setCombinedRestitution"),
            ManifoldPoint_setCombinedRollingFriction   = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setCombinedRollingFriction"),
            ManifoldPoint_setContactCFM                = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setContactCFM"),
            ManifoldPoint_setContactERP                = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setContactERP"),
            ManifoldPoint_setContactMotion1            = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setContactMotion1"),
            ManifoldPoint_setContactMotion2            = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setContactMotion2"),
            ManifoldPoint_setContactPointFlags         = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setContactPointFlags"),
            ManifoldPoint_setDistance                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setDistance"),
            ManifoldPoint_setDistance1                 = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setDistance1"),
            ManifoldPoint_setFrictionCFM               = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setFrictionCFM"),
            ManifoldPoint_setIndex0                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setIndex0"),
            ManifoldPoint_setIndex1                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setIndex1"),
            ManifoldPoint_setLateralFrictionDir1       = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setLateralFrictionDir1"),
            ManifoldPoint_setLateralFrictionDir2       = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setLateralFrictionDir2"),
            ManifoldPoint_setLifeTime                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setLifeTime"),
            ManifoldPoint_setLocalPointA               = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setLocalPointA"),
            ManifoldPoint_setLocalPointB               = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setLocalPointB"),
            ManifoldPoint_setNormalWorldOnB            = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setNormalWorldOnB"),
            ManifoldPoint_setPartId0                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setPartId0"),
            ManifoldPoint_setPartId1                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setPartId1"),
            ManifoldPoint_setPositionWorldOnA          = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setPositionWorldOnA"),
            ManifoldPoint_setPositionWorldOnB          = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setPositionWorldOnB"),
            ManifoldPoint_setUserPersistentData        = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_setUserPersistentData"),
            ManifoldPoint_delete                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btManifoldPoint_delete"),
            getGContactAddedCallback                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btgetGContactAddedCallback"),
            setGContactAddedCallback                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btsetGContactAddedCallback");

    }

    // --- [ btManifoldPoint_new ] ---

    @NativeType("void *")
    public static long btManifoldPoint_new() {
        long __functionAddress = Functions.ManifoldPoint_new;
        return invokeP(__functionAddress);
    }

    // --- [ btManifoldPoint_new2 ] ---

    public static long nbtManifoldPoint_new2(long pointA, long pointB, long normal, float distance) {
        long __functionAddress = Functions.ManifoldPoint_new2;
        return invokePPPP(pointA, pointB, normal, distance, __functionAddress);
    }

    @NativeType("void *")
    public static long btManifoldPoint_new2(@NativeType("btVector3 const *") ΒΤVector3 pointA, @NativeType("btVector3 const *") ΒΤVector3 pointB, @NativeType("btVector3 const *") ΒΤVector3 normal, @NativeType("btScalar") float distance) {
        return nbtManifoldPoint_new2(pointA.address(), pointB.address(), normal.address(), distance);
    }

    // --- [ btManifoldPoint_getAppliedImpulse ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getAppliedImpulse(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_getAppliedImpulse;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getAppliedImpulseLateral1 ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getAppliedImpulseLateral1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_getAppliedImpulseLateral1;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getAppliedImpulseLateral2 ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getAppliedImpulseLateral2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_getAppliedImpulseLateral2;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getCombinedContactDamping1 ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getCombinedContactDamping1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_getCombinedContactDamping1;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getCombinedContactStiffness1 ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getCombinedContactStiffness1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_getCombinedContactStiffness1;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getCombinedFriction ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getCombinedFriction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_getCombinedFriction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getCombinedRestitution ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getCombinedRestitution(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_getCombinedRestitution;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getCombinedRollingFriction ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getCombinedRollingFriction(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_getCombinedRollingFriction;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getContactCFM ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getContactCFM(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_getContactCFM;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getContactERP ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getContactERP(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_getContactERP;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getContactMotion1 ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getContactMotion1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_getContactMotion1;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getContactMotion2 ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getContactMotion2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_getContactMotion2;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getContactPointFlags ] ---

    public static int btManifoldPoint_getContactPointFlags(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_getContactPointFlags;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getDistance ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getDistance(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_getDistance;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getDistance1 ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getDistance1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_getDistance1;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getFrictionCFM ] ---

    @NativeType("btScalar")
    public static float btManifoldPoint_getFrictionCFM(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_getFrictionCFM;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getIndex0 ] ---

    public static int btManifoldPoint_getIndex0(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_getIndex0;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getIndex1 ] ---

    public static int btManifoldPoint_getIndex1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_getIndex1;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getLateralFrictionDir1 ] ---

    public static void nbtManifoldPoint_getLateralFrictionDir1(long obj, long value) {
        long __functionAddress = Functions.ManifoldPoint_getLateralFrictionDir1;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_getLateralFrictionDir1(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtManifoldPoint_getLateralFrictionDir1(obj, value.address());
    }

    // --- [ btManifoldPoint_getLateralFrictionDir2 ] ---

    public static void nbtManifoldPoint_getLateralFrictionDir2(long obj, long value) {
        long __functionAddress = Functions.ManifoldPoint_getLateralFrictionDir2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_getLateralFrictionDir2(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtManifoldPoint_getLateralFrictionDir2(obj, value.address());
    }

    // --- [ btManifoldPoint_getLifeTime ] ---

    public static int btManifoldPoint_getLifeTime(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_getLifeTime;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getLocalPointA ] ---

    public static void nbtManifoldPoint_getLocalPointA(long obj, long value) {
        long __functionAddress = Functions.ManifoldPoint_getLocalPointA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_getLocalPointA(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtManifoldPoint_getLocalPointA(obj, value.address());
    }

    // --- [ btManifoldPoint_getLocalPointB ] ---

    public static void nbtManifoldPoint_getLocalPointB(long obj, long value) {
        long __functionAddress = Functions.ManifoldPoint_getLocalPointB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_getLocalPointB(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtManifoldPoint_getLocalPointB(obj, value.address());
    }

    // --- [ btManifoldPoint_getNormalWorldOnB ] ---

    public static void nbtManifoldPoint_getNormalWorldOnB(long obj, long value) {
        long __functionAddress = Functions.ManifoldPoint_getNormalWorldOnB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_getNormalWorldOnB(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtManifoldPoint_getNormalWorldOnB(obj, value.address());
    }

    // --- [ btManifoldPoint_getPartId0 ] ---

    public static int btManifoldPoint_getPartId0(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_getPartId0;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getPartId1 ] ---

    public static int btManifoldPoint_getPartId1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_getPartId1;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_getPositionWorldOnA ] ---

    public static void nbtManifoldPoint_getPositionWorldOnA(long obj, long value) {
        long __functionAddress = Functions.ManifoldPoint_getPositionWorldOnA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_getPositionWorldOnA(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtManifoldPoint_getPositionWorldOnA(obj, value.address());
    }

    // --- [ btManifoldPoint_getPositionWorldOnB ] ---

    public static void nbtManifoldPoint_getPositionWorldOnB(long obj, long value) {
        long __functionAddress = Functions.ManifoldPoint_getPositionWorldOnB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_getPositionWorldOnB(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtManifoldPoint_getPositionWorldOnB(obj, value.address());
    }

    // --- [ btManifoldPoint_getUserPersistentData ] ---

    @NativeType("void *")
    public static long btManifoldPoint_getUserPersistentData(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_getUserPersistentData;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btManifoldPoint_setAppliedImpulse ] ---

    public static void btManifoldPoint_setAppliedImpulse(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ManifoldPoint_setAppliedImpulse;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setAppliedImpulseLateral1 ] ---

    public static void btManifoldPoint_setAppliedImpulseLateral1(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ManifoldPoint_setAppliedImpulseLateral1;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setAppliedImpulseLateral2 ] ---

    public static void btManifoldPoint_setAppliedImpulseLateral2(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ManifoldPoint_setAppliedImpulseLateral2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setCombinedContactDamping1 ] ---

    public static void btManifoldPoint_setCombinedContactDamping1(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ManifoldPoint_setCombinedContactDamping1;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setCombinedContactStiffness1 ] ---

    public static void btManifoldPoint_setCombinedContactStiffness1(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ManifoldPoint_setCombinedContactStiffness1;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setCombinedFriction ] ---

    public static void btManifoldPoint_setCombinedFriction(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ManifoldPoint_setCombinedFriction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setCombinedRestitution ] ---

    public static void btManifoldPoint_setCombinedRestitution(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ManifoldPoint_setCombinedRestitution;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setCombinedRollingFriction ] ---

    public static void btManifoldPoint_setCombinedRollingFriction(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ManifoldPoint_setCombinedRollingFriction;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setContactCFM ] ---

    public static void btManifoldPoint_setContactCFM(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ManifoldPoint_setContactCFM;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setContactERP ] ---

    public static void btManifoldPoint_setContactERP(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ManifoldPoint_setContactERP;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setContactMotion1 ] ---

    public static void btManifoldPoint_setContactMotion1(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ManifoldPoint_setContactMotion1;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setContactMotion2 ] ---

    public static void btManifoldPoint_setContactMotion2(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ManifoldPoint_setContactMotion2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setContactPointFlags ] ---

    public static void btManifoldPoint_setContactPointFlags(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.ManifoldPoint_setContactPointFlags;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setDistance ] ---

    public static void btManifoldPoint_setDistance(@NativeType("void *") long obj, @NativeType("btScalar") float dist) {
        long __functionAddress = Functions.ManifoldPoint_setDistance;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, dist, __functionAddress);
    }

    // --- [ btManifoldPoint_setDistance1 ] ---

    public static void btManifoldPoint_setDistance1(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ManifoldPoint_setDistance1;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setFrictionCFM ] ---

    public static void btManifoldPoint_setFrictionCFM(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.ManifoldPoint_setFrictionCFM;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setIndex0 ] ---

    public static void btManifoldPoint_setIndex0(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.ManifoldPoint_setIndex0;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setIndex1 ] ---

    public static void btManifoldPoint_setIndex1(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.ManifoldPoint_setIndex1;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setLateralFrictionDir1 ] ---

    public static void nbtManifoldPoint_setLateralFrictionDir1(long obj, long value) {
        long __functionAddress = Functions.ManifoldPoint_setLateralFrictionDir1;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_setLateralFrictionDir1(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtManifoldPoint_setLateralFrictionDir1(obj, value.address());
    }

    // --- [ btManifoldPoint_setLateralFrictionDir2 ] ---

    public static void nbtManifoldPoint_setLateralFrictionDir2(long obj, long value) {
        long __functionAddress = Functions.ManifoldPoint_setLateralFrictionDir2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_setLateralFrictionDir2(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtManifoldPoint_setLateralFrictionDir2(obj, value.address());
    }

    // --- [ btManifoldPoint_setLifeTime ] ---

    public static void btManifoldPoint_setLifeTime(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.ManifoldPoint_setLifeTime;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setLocalPointA ] ---

    public static void nbtManifoldPoint_setLocalPointA(long obj, long value) {
        long __functionAddress = Functions.ManifoldPoint_setLocalPointA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_setLocalPointA(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtManifoldPoint_setLocalPointA(obj, value.address());
    }

    // --- [ btManifoldPoint_setLocalPointB ] ---

    public static void nbtManifoldPoint_setLocalPointB(long obj, long value) {
        long __functionAddress = Functions.ManifoldPoint_setLocalPointB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_setLocalPointB(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtManifoldPoint_setLocalPointB(obj, value.address());
    }

    // --- [ btManifoldPoint_setNormalWorldOnB ] ---

    public static void nbtManifoldPoint_setNormalWorldOnB(long obj, long value) {
        long __functionAddress = Functions.ManifoldPoint_setNormalWorldOnB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_setNormalWorldOnB(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtManifoldPoint_setNormalWorldOnB(obj, value.address());
    }

    // --- [ btManifoldPoint_setPartId0 ] ---

    public static void btManifoldPoint_setPartId0(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.ManifoldPoint_setPartId0;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setPartId1 ] ---

    public static void btManifoldPoint_setPartId1(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.ManifoldPoint_setPartId1;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_setPositionWorldOnA ] ---

    public static void nbtManifoldPoint_setPositionWorldOnA(long obj, long value) {
        long __functionAddress = Functions.ManifoldPoint_setPositionWorldOnA;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_setPositionWorldOnA(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtManifoldPoint_setPositionWorldOnA(obj, value.address());
    }

    // --- [ btManifoldPoint_setPositionWorldOnB ] ---

    public static void nbtManifoldPoint_setPositionWorldOnB(long obj, long value) {
        long __functionAddress = Functions.ManifoldPoint_setPositionWorldOnB;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btManifoldPoint_setPositionWorldOnB(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtManifoldPoint_setPositionWorldOnB(obj, value.address());
    }

    // --- [ btManifoldPoint_setUserPersistentData ] ---

    public static void btManifoldPoint_setUserPersistentData(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.ManifoldPoint_setUserPersistentData;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btManifoldPoint_delete ] ---

    public static void btManifoldPoint_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.ManifoldPoint_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btgetGContactAddedCallback ] ---

    @NativeType("void *")
    public static long btgetGContactAddedCallback() {
        long __functionAddress = Functions.getGContactAddedCallback;
        return invokeP(__functionAddress);
    }

    // --- [ btsetGContactAddedCallback ] ---

    public static void btsetGContactAddedCallback(@NativeType("void *") long value) {
        long __functionAddress = Functions.setGContactAddedCallback;
        if (CHECKS) {
            check(value);
        }
        invokePV(value, __functionAddress);
    }

}
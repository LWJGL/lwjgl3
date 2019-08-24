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

public class BTGjkPairDetector {

    protected BTGjkPairDetector() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GjkPairDetector_new                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btGjkPairDetector_new"),
            GjkPairDetector_new2                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGjkPairDetector_new2"),
            GjkPairDetector_getCachedSeparatingAxis      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGjkPairDetector_getCachedSeparatingAxis"),
            GjkPairDetector_getCachedSeparatingDistance  = apiGetFunctionAddress(LibBullet.getLibrary(), "btGjkPairDetector_getCachedSeparatingDistance"),
            GjkPairDetector_getCatchDegeneracies         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGjkPairDetector_getCatchDegeneracies"),
            GjkPairDetector_getClosestPointsNonVirtual   = apiGetFunctionAddress(LibBullet.getLibrary(), "btGjkPairDetector_getClosestPointsNonVirtual"),
            GjkPairDetector_getCurIter                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btGjkPairDetector_getCurIter"),
            GjkPairDetector_getDegenerateSimplex         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGjkPairDetector_getDegenerateSimplex"),
            GjkPairDetector_getFixContactNormalDirection = apiGetFunctionAddress(LibBullet.getLibrary(), "btGjkPairDetector_getFixContactNormalDirection"),
            GjkPairDetector_getLastUsedMethod            = apiGetFunctionAddress(LibBullet.getLibrary(), "btGjkPairDetector_getLastUsedMethod"),
            GjkPairDetector_setCachedSeparatingAxis      = apiGetFunctionAddress(LibBullet.getLibrary(), "btGjkPairDetector_setCachedSeparatingAxis"),
            GjkPairDetector_setCatchDegeneracies         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGjkPairDetector_setCatchDegeneracies"),
            GjkPairDetector_setCurIter                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btGjkPairDetector_setCurIter"),
            GjkPairDetector_setDegenerateSimplex         = apiGetFunctionAddress(LibBullet.getLibrary(), "btGjkPairDetector_setDegenerateSimplex"),
            GjkPairDetector_setFixContactNormalDirection = apiGetFunctionAddress(LibBullet.getLibrary(), "btGjkPairDetector_setFixContactNormalDirection"),
            GjkPairDetector_setIgnoreMargin              = apiGetFunctionAddress(LibBullet.getLibrary(), "btGjkPairDetector_setIgnoreMargin"),
            GjkPairDetector_setLastUsedMethod            = apiGetFunctionAddress(LibBullet.getLibrary(), "btGjkPairDetector_setLastUsedMethod"),
            GjkPairDetector_setMinkowskiA                = apiGetFunctionAddress(LibBullet.getLibrary(), "btGjkPairDetector_setMinkowskiA"),
            GjkPairDetector_setMinkowskiB                = apiGetFunctionAddress(LibBullet.getLibrary(), "btGjkPairDetector_setMinkowskiB"),
            GjkPairDetector_setPenetrationDepthSolver    = apiGetFunctionAddress(LibBullet.getLibrary(), "btGjkPairDetector_setPenetrationDepthSolver");

    }

    // --- [ btGjkPairDetector_new ] ---

    @NativeType("void *")
    public static long btGjkPairDetector_new(@NativeType("void *") long objectA, @NativeType("void *") long objectB, @NativeType("void *") long simplexSolver, @NativeType("void *") long penetrationDepthSolver) {
        long __functionAddress = Functions.GjkPairDetector_new;
        if (CHECKS) {
            check(objectA);
            check(objectB);
            check(simplexSolver);
            check(penetrationDepthSolver);
        }
        return invokePPPPP(objectA, objectB, simplexSolver, penetrationDepthSolver, __functionAddress);
    }

    // --- [ btGjkPairDetector_new2 ] ---

    @NativeType("void *")
    public static long btGjkPairDetector_new2(@NativeType("void *") long objectA, @NativeType("void *") long objectB, int shapeTypeA, int shapeTypeB, @NativeType("btScalar") float marginA, @NativeType("btScalar") float marginB, @NativeType("void *") long simplexSolver, @NativeType("void *") long penetrationDepthSolver) {
        long __functionAddress = Functions.GjkPairDetector_new2;
        if (CHECKS) {
            check(objectA);
            check(objectB);
            check(simplexSolver);
            check(penetrationDepthSolver);
        }
        return invokePPPPP(objectA, objectB, shapeTypeA, shapeTypeB, marginA, marginB, simplexSolver, penetrationDepthSolver, __functionAddress);
    }

    // --- [ btGjkPairDetector_getCachedSeparatingAxis ] ---

    public static void nbtGjkPairDetector_getCachedSeparatingAxis(long obj, long value) {
        long __functionAddress = Functions.GjkPairDetector_getCachedSeparatingAxis;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btGjkPairDetector_getCachedSeparatingAxis(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtGjkPairDetector_getCachedSeparatingAxis(obj, value.address());
    }

    // --- [ btGjkPairDetector_getCachedSeparatingDistance ] ---

    @NativeType("btScalar")
    public static float btGjkPairDetector_getCachedSeparatingDistance(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GjkPairDetector_getCachedSeparatingDistance;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btGjkPairDetector_getCatchDegeneracies ] ---

    public static int btGjkPairDetector_getCatchDegeneracies(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GjkPairDetector_getCatchDegeneracies;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGjkPairDetector_getClosestPointsNonVirtual ] ---

    public static void btGjkPairDetector_getClosestPointsNonVirtual(@NativeType("void *") long obj, @NativeType("void *") long input, @NativeType("void *") long output, @NativeType("void *") long debugDraw) {
        long __functionAddress = Functions.GjkPairDetector_getClosestPointsNonVirtual;
        if (CHECKS) {
            check(obj);
            check(input);
            check(output);
            check(debugDraw);
        }
        invokePPPPV(obj, input, output, debugDraw, __functionAddress);
    }

    // --- [ btGjkPairDetector_getCurIter ] ---

    public static int btGjkPairDetector_getCurIter(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GjkPairDetector_getCurIter;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGjkPairDetector_getDegenerateSimplex ] ---

    public static int btGjkPairDetector_getDegenerateSimplex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GjkPairDetector_getDegenerateSimplex;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGjkPairDetector_getFixContactNormalDirection ] ---

    public static int btGjkPairDetector_getFixContactNormalDirection(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GjkPairDetector_getFixContactNormalDirection;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGjkPairDetector_getLastUsedMethod ] ---

    public static int btGjkPairDetector_getLastUsedMethod(@NativeType("void *") long obj) {
        long __functionAddress = Functions.GjkPairDetector_getLastUsedMethod;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btGjkPairDetector_setCachedSeparatingAxis ] ---

    public static void nbtGjkPairDetector_setCachedSeparatingAxis(long obj, long seperatingAxis) {
        long __functionAddress = Functions.GjkPairDetector_setCachedSeparatingAxis;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, seperatingAxis, __functionAddress);
    }

    public static void btGjkPairDetector_setCachedSeparatingAxis(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 seperatingAxis) {
        nbtGjkPairDetector_setCachedSeparatingAxis(obj, seperatingAxis.address());
    }

    // --- [ btGjkPairDetector_setCatchDegeneracies ] ---

    public static void btGjkPairDetector_setCatchDegeneracies(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.GjkPairDetector_setCatchDegeneracies;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGjkPairDetector_setCurIter ] ---

    public static void btGjkPairDetector_setCurIter(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.GjkPairDetector_setCurIter;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGjkPairDetector_setDegenerateSimplex ] ---

    public static void btGjkPairDetector_setDegenerateSimplex(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.GjkPairDetector_setDegenerateSimplex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGjkPairDetector_setFixContactNormalDirection ] ---

    public static void btGjkPairDetector_setFixContactNormalDirection(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.GjkPairDetector_setFixContactNormalDirection;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGjkPairDetector_setIgnoreMargin ] ---

    public static void btGjkPairDetector_setIgnoreMargin(@NativeType("void *") long obj, @NativeType("bool") boolean ignoreMargin) {
        long __functionAddress = Functions.GjkPairDetector_setIgnoreMargin;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, ignoreMargin, __functionAddress);
    }

    // --- [ btGjkPairDetector_setLastUsedMethod ] ---

    public static void btGjkPairDetector_setLastUsedMethod(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.GjkPairDetector_setLastUsedMethod;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btGjkPairDetector_setMinkowskiA ] ---

    public static void btGjkPairDetector_setMinkowskiA(@NativeType("void *") long obj, @NativeType("void *") long minkA) {
        long __functionAddress = Functions.GjkPairDetector_setMinkowskiA;
        if (CHECKS) {
            check(obj);
            check(minkA);
        }
        invokePPV(obj, minkA, __functionAddress);
    }

    // --- [ btGjkPairDetector_setMinkowskiB ] ---

    public static void btGjkPairDetector_setMinkowskiB(@NativeType("void *") long obj, @NativeType("void *") long minkB) {
        long __functionAddress = Functions.GjkPairDetector_setMinkowskiB;
        if (CHECKS) {
            check(obj);
            check(minkB);
        }
        invokePPV(obj, minkB, __functionAddress);
    }

    // --- [ btGjkPairDetector_setPenetrationDepthSolver ] ---

    public static void btGjkPairDetector_setPenetrationDepthSolver(@NativeType("void *") long obj, @NativeType("void *") long penetrationDepthSolver) {
        long __functionAddress = Functions.GjkPairDetector_setPenetrationDepthSolver;
        if (CHECKS) {
            check(obj);
            check(penetrationDepthSolver);
        }
        invokePPV(obj, penetrationDepthSolver, __functionAddress);
    }

}
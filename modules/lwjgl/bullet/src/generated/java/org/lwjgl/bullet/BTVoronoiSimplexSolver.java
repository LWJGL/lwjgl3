/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BTVoronoiSimplexSolver {

    protected BTVoronoiSimplexSolver() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            UsageBitfield_getUnused1                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btUsageBitfield_getUnused1"),
            UsageBitfield_getUnused2                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btUsageBitfield_getUnused2"),
            UsageBitfield_getUnused3                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btUsageBitfield_getUnused3"),
            UsageBitfield_getUnused4                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btUsageBitfield_getUnused4"),
            UsageBitfield_getUsedVertexA                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btUsageBitfield_getUsedVertexA"),
            UsageBitfield_getUsedVertexB                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btUsageBitfield_getUsedVertexB"),
            UsageBitfield_getUsedVertexC                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btUsageBitfield_getUsedVertexC"),
            UsageBitfield_getUsedVertexD                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btUsageBitfield_getUsedVertexD"),
            UsageBitfield_reset                                = apiGetFunctionAddress(LibBullet.getLibrary(), "btUsageBitfield_reset"),
            UsageBitfield_setUnused1                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btUsageBitfield_setUnused1"),
            UsageBitfield_setUnused2                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btUsageBitfield_setUnused2"),
            UsageBitfield_setUnused3                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btUsageBitfield_setUnused3"),
            UsageBitfield_setUnused4                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btUsageBitfield_setUnused4"),
            UsageBitfield_setUsedVertexA                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btUsageBitfield_setUsedVertexA"),
            UsageBitfield_setUsedVertexB                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btUsageBitfield_setUsedVertexB"),
            UsageBitfield_setUsedVertexC                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btUsageBitfield_setUsedVertexC"),
            UsageBitfield_setUsedVertexD                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btUsageBitfield_setUsedVertexD"),
            SubSimplexClosestResult_new                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btSubSimplexClosestResult_new"),
            SubSimplexClosestResult_getBarycentricCoords       = apiGetFunctionAddress(LibBullet.getLibrary(), "btSubSimplexClosestResult_getBarycentricCoords"),
            SubSimplexClosestResult_getClosestPointOnSimplex   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSubSimplexClosestResult_getClosestPointOnSimplex"),
            SubSimplexClosestResult_getDegenerate              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSubSimplexClosestResult_getDegenerate"),
            SubSimplexClosestResult_getUsedVertices            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSubSimplexClosestResult_getUsedVertices"),
            SubSimplexClosestResult_isValid                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btSubSimplexClosestResult_isValid"),
            SubSimplexClosestResult_reset                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btSubSimplexClosestResult_reset"),
            SubSimplexClosestResult_setBarycentricCoordinates  = apiGetFunctionAddress(LibBullet.getLibrary(), "btSubSimplexClosestResult_setBarycentricCoordinates"),
            SubSimplexClosestResult_setBarycentricCoordinates2 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSubSimplexClosestResult_setBarycentricCoordinates2"),
            SubSimplexClosestResult_setBarycentricCoordinates3 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSubSimplexClosestResult_setBarycentricCoordinates3"),
            SubSimplexClosestResult_setBarycentricCoordinates4 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSubSimplexClosestResult_setBarycentricCoordinates4"),
            SubSimplexClosestResult_setBarycentricCoordinates5 = apiGetFunctionAddress(LibBullet.getLibrary(), "btSubSimplexClosestResult_setBarycentricCoordinates5"),
            SubSimplexClosestResult_setClosestPointOnSimplex   = apiGetFunctionAddress(LibBullet.getLibrary(), "btSubSimplexClosestResult_setClosestPointOnSimplex"),
            SubSimplexClosestResult_setDegenerate              = apiGetFunctionAddress(LibBullet.getLibrary(), "btSubSimplexClosestResult_setDegenerate"),
            SubSimplexClosestResult_setUsedVertices            = apiGetFunctionAddress(LibBullet.getLibrary(), "btSubSimplexClosestResult_setUsedVertices"),
            SubSimplexClosestResult_delete                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btSubSimplexClosestResult_delete"),
            VoronoiSimplexSolver_new                           = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_new"),
            VoronoiSimplexSolver_addVertex                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_addVertex"),
            VoronoiSimplexSolver_backup_closest                = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_backup_closest"),
            VoronoiSimplexSolver_closest                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_closest"),
            VoronoiSimplexSolver_closestPtPointTetrahedron     = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_closestPtPointTetrahedron"),
            VoronoiSimplexSolver_closestPtPointTriangle        = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_closestPtPointTriangle"),
            VoronoiSimplexSolver_compute_points                = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_compute_points"),
            VoronoiSimplexSolver_emptySimplex                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_emptySimplex"),
            VoronoiSimplexSolver_fullSimplex                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_fullSimplex"),
            VoronoiSimplexSolver_getCachedBC                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_getCachedBC"),
            VoronoiSimplexSolver_getCachedP1                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_getCachedP1"),
            VoronoiSimplexSolver_getCachedP2                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_getCachedP2"),
            VoronoiSimplexSolver_getCachedV                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_getCachedV"),
            VoronoiSimplexSolver_getCachedValidClosest         = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_getCachedValidClosest"),
            VoronoiSimplexSolver_getEqualVertexThreshold       = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_getEqualVertexThreshold"),
            VoronoiSimplexSolver_getLastW                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_getLastW"),
            VoronoiSimplexSolver_getNeedsUpdate                = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_getNeedsUpdate"),
            VoronoiSimplexSolver_getNumVertices                = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_getNumVertices"),
            VoronoiSimplexSolver_getSimplex                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_getSimplex"),
            VoronoiSimplexSolver_getSimplexPointsP             = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_getSimplexPointsP"),
            VoronoiSimplexSolver_getSimplexPointsQ             = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_getSimplexPointsQ"),
            VoronoiSimplexSolver_getSimplexVectorW             = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_getSimplexVectorW"),
            VoronoiSimplexSolver_inSimplex                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_inSimplex"),
            VoronoiSimplexSolver_maxVertex                     = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_maxVertex"),
            VoronoiSimplexSolver_numVertices                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_numVertices"),
            VoronoiSimplexSolver_pointOutsideOfPlane           = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_pointOutsideOfPlane"),
            VoronoiSimplexSolver_reduceVertices                = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_reduceVertices"),
            VoronoiSimplexSolver_removeVertex                  = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_removeVertex"),
            VoronoiSimplexSolver_reset                         = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_reset"),
            VoronoiSimplexSolver_setCachedBC                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_setCachedBC"),
            VoronoiSimplexSolver_setCachedP1                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_setCachedP1"),
            VoronoiSimplexSolver_setCachedP2                   = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_setCachedP2"),
            VoronoiSimplexSolver_setCachedV                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_setCachedV"),
            VoronoiSimplexSolver_setCachedValidClosest         = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_setCachedValidClosest"),
            VoronoiSimplexSolver_setEqualVertexThreshold       = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_setEqualVertexThreshold"),
            VoronoiSimplexSolver_setLastW                      = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_setLastW"),
            VoronoiSimplexSolver_setNeedsUpdate                = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_setNeedsUpdate"),
            VoronoiSimplexSolver_setNumVertices                = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_setNumVertices"),
            VoronoiSimplexSolver_updateClosestVectorAndPoints  = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_updateClosestVectorAndPoints"),
            VoronoiSimplexSolver_delete                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btVoronoiSimplexSolver_delete");

    }

    // --- [ btUsageBitfield_getUnused1 ] ---

    @NativeType("bool")
    public static boolean btUsageBitfield_getUnused1(@NativeType("void *") long obj) {
        long __functionAddress = Functions.UsageBitfield_getUnused1;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btUsageBitfield_getUnused2 ] ---

    @NativeType("bool")
    public static boolean btUsageBitfield_getUnused2(@NativeType("void *") long obj) {
        long __functionAddress = Functions.UsageBitfield_getUnused2;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btUsageBitfield_getUnused3 ] ---

    @NativeType("bool")
    public static boolean btUsageBitfield_getUnused3(@NativeType("void *") long obj) {
        long __functionAddress = Functions.UsageBitfield_getUnused3;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btUsageBitfield_getUnused4 ] ---

    @NativeType("bool")
    public static boolean btUsageBitfield_getUnused4(@NativeType("void *") long obj) {
        long __functionAddress = Functions.UsageBitfield_getUnused4;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btUsageBitfield_getUsedVertexA ] ---

    @NativeType("bool")
    public static boolean btUsageBitfield_getUsedVertexA(@NativeType("void *") long obj) {
        long __functionAddress = Functions.UsageBitfield_getUsedVertexA;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btUsageBitfield_getUsedVertexB ] ---

    @NativeType("bool")
    public static boolean btUsageBitfield_getUsedVertexB(@NativeType("void *") long obj) {
        long __functionAddress = Functions.UsageBitfield_getUsedVertexB;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btUsageBitfield_getUsedVertexC ] ---

    @NativeType("bool")
    public static boolean btUsageBitfield_getUsedVertexC(@NativeType("void *") long obj) {
        long __functionAddress = Functions.UsageBitfield_getUsedVertexC;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btUsageBitfield_getUsedVertexD ] ---

    @NativeType("bool")
    public static boolean btUsageBitfield_getUsedVertexD(@NativeType("void *") long obj) {
        long __functionAddress = Functions.UsageBitfield_getUsedVertexD;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btUsageBitfield_reset ] ---

    public static void btUsageBitfield_reset(@NativeType("void *") long obj) {
        long __functionAddress = Functions.UsageBitfield_reset;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btUsageBitfield_setUnused1 ] ---

    public static void btUsageBitfield_setUnused1(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.UsageBitfield_setUnused1;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btUsageBitfield_setUnused2 ] ---

    public static void btUsageBitfield_setUnused2(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.UsageBitfield_setUnused2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btUsageBitfield_setUnused3 ] ---

    public static void btUsageBitfield_setUnused3(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.UsageBitfield_setUnused3;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btUsageBitfield_setUnused4 ] ---

    public static void btUsageBitfield_setUnused4(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.UsageBitfield_setUnused4;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btUsageBitfield_setUsedVertexA ] ---

    public static void btUsageBitfield_setUsedVertexA(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.UsageBitfield_setUsedVertexA;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btUsageBitfield_setUsedVertexB ] ---

    public static void btUsageBitfield_setUsedVertexB(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.UsageBitfield_setUsedVertexB;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btUsageBitfield_setUsedVertexC ] ---

    public static void btUsageBitfield_setUsedVertexC(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.UsageBitfield_setUsedVertexC;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btUsageBitfield_setUsedVertexD ] ---

    public static void btUsageBitfield_setUsedVertexD(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.UsageBitfield_setUsedVertexD;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSubSimplexClosestResult_new ] ---

    @NativeType("void *")
    public static long btSubSimplexClosestResult_new() {
        long __functionAddress = Functions.SubSimplexClosestResult_new;
        return invokeP(__functionAddress);
    }

    // --- [ btSubSimplexClosestResult_getBarycentricCoords ] ---

    @NativeType("btScalar[4]")
    public static FloatBuffer btSubSimplexClosestResult_getBarycentricCoords(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SubSimplexClosestResult_getBarycentricCoords;
        if (CHECKS) {
            check(obj);
        }
        long __result = invokePP(obj, __functionAddress);
        return memFloatBuffer(__result, 4);
    }

    // --- [ btSubSimplexClosestResult_getClosestPointOnSimplex ] ---

    public static void nbtSubSimplexClosestResult_getClosestPointOnSimplex(long obj, long value) {
        long __functionAddress = Functions.SubSimplexClosestResult_getClosestPointOnSimplex;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSubSimplexClosestResult_getClosestPointOnSimplex(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtSubSimplexClosestResult_getClosestPointOnSimplex(obj, value.address());
    }

    // --- [ btSubSimplexClosestResult_getDegenerate ] ---

    @NativeType("bool")
    public static boolean btSubSimplexClosestResult_getDegenerate(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SubSimplexClosestResult_getDegenerate;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btSubSimplexClosestResult_getUsedVertices ] ---

    @NativeType("void *")
    public static long btSubSimplexClosestResult_getUsedVertices(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SubSimplexClosestResult_getUsedVertices;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btSubSimplexClosestResult_isValid ] ---

    @NativeType("bool")
    public static boolean btSubSimplexClosestResult_isValid(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SubSimplexClosestResult_isValid;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btSubSimplexClosestResult_reset ] ---

    public static void btSubSimplexClosestResult_reset(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SubSimplexClosestResult_reset;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSubSimplexClosestResult_setBarycentricCoordinates ] ---

    public static void btSubSimplexClosestResult_setBarycentricCoordinates(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SubSimplexClosestResult_setBarycentricCoordinates;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btSubSimplexClosestResult_setBarycentricCoordinates2 ] ---

    public static void btSubSimplexClosestResult_setBarycentricCoordinates2(@NativeType("void *") long obj, @NativeType("btScalar") float a) {
        long __functionAddress = Functions.SubSimplexClosestResult_setBarycentricCoordinates2;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, a, __functionAddress);
    }

    // --- [ btSubSimplexClosestResult_setBarycentricCoordinates3 ] ---

    public static void btSubSimplexClosestResult_setBarycentricCoordinates3(@NativeType("void *") long obj, @NativeType("btScalar") float a, @NativeType("btScalar") float b) {
        long __functionAddress = Functions.SubSimplexClosestResult_setBarycentricCoordinates3;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, a, b, __functionAddress);
    }

    // --- [ btSubSimplexClosestResult_setBarycentricCoordinates4 ] ---

    public static void btSubSimplexClosestResult_setBarycentricCoordinates4(@NativeType("void *") long obj, @NativeType("btScalar") float a, @NativeType("btScalar") float b, @NativeType("btScalar") float c) {
        long __functionAddress = Functions.SubSimplexClosestResult_setBarycentricCoordinates4;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, a, b, c, __functionAddress);
    }

    // --- [ btSubSimplexClosestResult_setBarycentricCoordinates5 ] ---

    public static void btSubSimplexClosestResult_setBarycentricCoordinates5(@NativeType("void *") long obj, @NativeType("btScalar") float a, @NativeType("btScalar") float b, @NativeType("btScalar") float c, @NativeType("btScalar") float d) {
        long __functionAddress = Functions.SubSimplexClosestResult_setBarycentricCoordinates5;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, a, b, c, d, __functionAddress);
    }

    // --- [ btSubSimplexClosestResult_setClosestPointOnSimplex ] ---

    public static void nbtSubSimplexClosestResult_setClosestPointOnSimplex(long obj, long value) {
        long __functionAddress = Functions.SubSimplexClosestResult_setClosestPointOnSimplex;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btSubSimplexClosestResult_setClosestPointOnSimplex(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtSubSimplexClosestResult_setClosestPointOnSimplex(obj, value.address());
    }

    // --- [ btSubSimplexClosestResult_setDegenerate ] ---

    public static void btSubSimplexClosestResult_setDegenerate(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.SubSimplexClosestResult_setDegenerate;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btSubSimplexClosestResult_setUsedVertices ] ---

    public static void btSubSimplexClosestResult_setUsedVertices(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.SubSimplexClosestResult_setUsedVertices;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btSubSimplexClosestResult_delete ] ---

    public static void btSubSimplexClosestResult_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.SubSimplexClosestResult_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btVoronoiSimplexSolver_new ] ---

    @NativeType("void *")
    public static long btVoronoiSimplexSolver_new() {
        long __functionAddress = Functions.VoronoiSimplexSolver_new;
        return invokeP(__functionAddress);
    }

    // --- [ btVoronoiSimplexSolver_addVertex ] ---

    public static void nbtVoronoiSimplexSolver_addVertex(long obj, long w, long p, long q) {
        long __functionAddress = Functions.VoronoiSimplexSolver_addVertex;
        if (CHECKS) {
            check(obj);
        }
        invokePPPPV(obj, w, p, q, __functionAddress);
    }

    public static void btVoronoiSimplexSolver_addVertex(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 w, @NativeType("btVector3 const *") ΒΤVector3 p, @NativeType("btVector3 const *") ΒΤVector3 q) {
        nbtVoronoiSimplexSolver_addVertex(obj, w.address(), p.address(), q.address());
    }

    // --- [ btVoronoiSimplexSolver_backup_closest ] ---

    public static void nbtVoronoiSimplexSolver_backup_closest(long obj, long v) {
        long __functionAddress = Functions.VoronoiSimplexSolver_backup_closest;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, v, __functionAddress);
    }

    public static void btVoronoiSimplexSolver_backup_closest(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 v) {
        nbtVoronoiSimplexSolver_backup_closest(obj, v.address());
    }

    // --- [ btVoronoiSimplexSolver_closest ] ---

    public static boolean nbtVoronoiSimplexSolver_closest(long obj, long v) {
        long __functionAddress = Functions.VoronoiSimplexSolver_closest;
        if (CHECKS) {
            check(obj);
        }
        return invokePPZ(obj, v, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btVoronoiSimplexSolver_closest(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 v) {
        return nbtVoronoiSimplexSolver_closest(obj, v.address());
    }

    // --- [ btVoronoiSimplexSolver_closestPtPointTetrahedron ] ---

    public static boolean nbtVoronoiSimplexSolver_closestPtPointTetrahedron(long obj, long p, long a, long b, long c, long d, long finalResult) {
        long __functionAddress = Functions.VoronoiSimplexSolver_closestPtPointTetrahedron;
        if (CHECKS) {
            check(obj);
            check(finalResult);
        }
        return invokePPPPPPPZ(obj, p, a, b, c, d, finalResult, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btVoronoiSimplexSolver_closestPtPointTetrahedron(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 p, @NativeType("btVector3 const *") ΒΤVector3 a, @NativeType("btVector3 const *") ΒΤVector3 b, @NativeType("btVector3 const *") ΒΤVector3 c, @NativeType("btVector3 const *") ΒΤVector3 d, @NativeType("void *") long finalResult) {
        return nbtVoronoiSimplexSolver_closestPtPointTetrahedron(obj, p.address(), a.address(), b.address(), c.address(), d.address(), finalResult);
    }

    // --- [ btVoronoiSimplexSolver_closestPtPointTriangle ] ---

    public static boolean nbtVoronoiSimplexSolver_closestPtPointTriangle(long obj, long p, long a, long b, long c, long result) {
        long __functionAddress = Functions.VoronoiSimplexSolver_closestPtPointTriangle;
        if (CHECKS) {
            check(obj);
            check(result);
        }
        return invokePPPPPPZ(obj, p, a, b, c, result, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btVoronoiSimplexSolver_closestPtPointTriangle(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 p, @NativeType("btVector3 const *") ΒΤVector3 a, @NativeType("btVector3 const *") ΒΤVector3 b, @NativeType("btVector3 const *") ΒΤVector3 c, @NativeType("void *") long result) {
        return nbtVoronoiSimplexSolver_closestPtPointTriangle(obj, p.address(), a.address(), b.address(), c.address(), result);
    }

    // --- [ btVoronoiSimplexSolver_compute_points ] ---

    public static void nbtVoronoiSimplexSolver_compute_points(long obj, long p1, long p2) {
        long __functionAddress = Functions.VoronoiSimplexSolver_compute_points;
        if (CHECKS) {
            check(obj);
        }
        invokePPPV(obj, p1, p2, __functionAddress);
    }

    public static void btVoronoiSimplexSolver_compute_points(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 p1, @NativeType("btVector3 *") ΒΤVector3 p2) {
        nbtVoronoiSimplexSolver_compute_points(obj, p1.address(), p2.address());
    }

    // --- [ btVoronoiSimplexSolver_emptySimplex ] ---

    @NativeType("bool")
    public static boolean btVoronoiSimplexSolver_emptySimplex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.VoronoiSimplexSolver_emptySimplex;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btVoronoiSimplexSolver_fullSimplex ] ---

    @NativeType("bool")
    public static boolean btVoronoiSimplexSolver_fullSimplex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.VoronoiSimplexSolver_fullSimplex;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btVoronoiSimplexSolver_getCachedBC ] ---

    @NativeType("void *")
    public static long btVoronoiSimplexSolver_getCachedBC(@NativeType("void *") long obj) {
        long __functionAddress = Functions.VoronoiSimplexSolver_getCachedBC;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ btVoronoiSimplexSolver_getCachedP1 ] ---

    public static void nbtVoronoiSimplexSolver_getCachedP1(long obj, long value) {
        long __functionAddress = Functions.VoronoiSimplexSolver_getCachedP1;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btVoronoiSimplexSolver_getCachedP1(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtVoronoiSimplexSolver_getCachedP1(obj, value.address());
    }

    // --- [ btVoronoiSimplexSolver_getCachedP2 ] ---

    public static void nbtVoronoiSimplexSolver_getCachedP2(long obj, long value) {
        long __functionAddress = Functions.VoronoiSimplexSolver_getCachedP2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btVoronoiSimplexSolver_getCachedP2(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtVoronoiSimplexSolver_getCachedP2(obj, value.address());
    }

    // --- [ btVoronoiSimplexSolver_getCachedV ] ---

    public static void nbtVoronoiSimplexSolver_getCachedV(long obj, long value) {
        long __functionAddress = Functions.VoronoiSimplexSolver_getCachedV;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btVoronoiSimplexSolver_getCachedV(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtVoronoiSimplexSolver_getCachedV(obj, value.address());
    }

    // --- [ btVoronoiSimplexSolver_getCachedValidClosest ] ---

    @NativeType("bool")
    public static boolean btVoronoiSimplexSolver_getCachedValidClosest(@NativeType("void *") long obj) {
        long __functionAddress = Functions.VoronoiSimplexSolver_getCachedValidClosest;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btVoronoiSimplexSolver_getEqualVertexThreshold ] ---

    @NativeType("btScalar")
    public static float btVoronoiSimplexSolver_getEqualVertexThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.VoronoiSimplexSolver_getEqualVertexThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btVoronoiSimplexSolver_getLastW ] ---

    public static void nbtVoronoiSimplexSolver_getLastW(long obj, long value) {
        long __functionAddress = Functions.VoronoiSimplexSolver_getLastW;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btVoronoiSimplexSolver_getLastW(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 value) {
        nbtVoronoiSimplexSolver_getLastW(obj, value.address());
    }

    // --- [ btVoronoiSimplexSolver_getNeedsUpdate ] ---

    @NativeType("bool")
    public static boolean btVoronoiSimplexSolver_getNeedsUpdate(@NativeType("void *") long obj) {
        long __functionAddress = Functions.VoronoiSimplexSolver_getNeedsUpdate;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btVoronoiSimplexSolver_getNumVertices ] ---

    public static int btVoronoiSimplexSolver_getNumVertices(@NativeType("void *") long obj) {
        long __functionAddress = Functions.VoronoiSimplexSolver_getNumVertices;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btVoronoiSimplexSolver_getSimplex ] ---

    public static int nbtVoronoiSimplexSolver_getSimplex(long obj, long pBuf, long qBuf, long yBuf) {
        long __functionAddress = Functions.VoronoiSimplexSolver_getSimplex;
        if (CHECKS) {
            check(obj);
        }
        return invokePPPPI(obj, pBuf, qBuf, yBuf, __functionAddress);
    }

    public static int btVoronoiSimplexSolver_getSimplex(@NativeType("void *") long obj, @NativeType("btVector3 *") ΒΤVector3 pBuf, @NativeType("btVector3 *") ΒΤVector3 qBuf, @NativeType("btVector3 *") ΒΤVector3 yBuf) {
        return nbtVoronoiSimplexSolver_getSimplex(obj, pBuf.address(), qBuf.address(), yBuf.address());
    }

    // --- [ btVoronoiSimplexSolver_getSimplexPointsP ] ---

    public static long nbtVoronoiSimplexSolver_getSimplexPointsP(long obj) {
        long __functionAddress = Functions.VoronoiSimplexSolver_getSimplexPointsP;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("btVector3 *")
    public static ΒΤVector3 btVoronoiSimplexSolver_getSimplexPointsP(@NativeType("void *") long obj) {
        long __result = nbtVoronoiSimplexSolver_getSimplexPointsP(obj);
        return ΒΤVector3.createSafe(__result);
    }

    // --- [ btVoronoiSimplexSolver_getSimplexPointsQ ] ---

    public static long nbtVoronoiSimplexSolver_getSimplexPointsQ(long obj) {
        long __functionAddress = Functions.VoronoiSimplexSolver_getSimplexPointsQ;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("btVector3 *")
    public static ΒΤVector3 btVoronoiSimplexSolver_getSimplexPointsQ(@NativeType("void *") long obj) {
        long __result = nbtVoronoiSimplexSolver_getSimplexPointsQ(obj);
        return ΒΤVector3.createSafe(__result);
    }

    // --- [ btVoronoiSimplexSolver_getSimplexVectorW ] ---

    public static long nbtVoronoiSimplexSolver_getSimplexVectorW(long obj) {
        long __functionAddress = Functions.VoronoiSimplexSolver_getSimplexVectorW;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("btVector3 *")
    public static ΒΤVector3 btVoronoiSimplexSolver_getSimplexVectorW(@NativeType("void *") long obj) {
        long __result = nbtVoronoiSimplexSolver_getSimplexVectorW(obj);
        return ΒΤVector3.createSafe(__result);
    }

    // --- [ btVoronoiSimplexSolver_inSimplex ] ---

    public static boolean nbtVoronoiSimplexSolver_inSimplex(long obj, long w) {
        long __functionAddress = Functions.VoronoiSimplexSolver_inSimplex;
        if (CHECKS) {
            check(obj);
        }
        return invokePPZ(obj, w, __functionAddress);
    }

    @NativeType("bool")
    public static boolean btVoronoiSimplexSolver_inSimplex(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 w) {
        return nbtVoronoiSimplexSolver_inSimplex(obj, w.address());
    }

    // --- [ btVoronoiSimplexSolver_maxVertex ] ---

    @NativeType("btScalar")
    public static float btVoronoiSimplexSolver_maxVertex(@NativeType("void *") long obj) {
        long __functionAddress = Functions.VoronoiSimplexSolver_maxVertex;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btVoronoiSimplexSolver_numVertices ] ---

    public static int btVoronoiSimplexSolver_numVertices(@NativeType("void *") long obj) {
        long __functionAddress = Functions.VoronoiSimplexSolver_numVertices;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btVoronoiSimplexSolver_pointOutsideOfPlane ] ---

    public static int nbtVoronoiSimplexSolver_pointOutsideOfPlane(long obj, long p, long a, long b, long c, long d) {
        long __functionAddress = Functions.VoronoiSimplexSolver_pointOutsideOfPlane;
        if (CHECKS) {
            check(obj);
        }
        return invokePPPPPPI(obj, p, a, b, c, d, __functionAddress);
    }

    public static int btVoronoiSimplexSolver_pointOutsideOfPlane(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 p, @NativeType("btVector3 const *") ΒΤVector3 a, @NativeType("btVector3 const *") ΒΤVector3 b, @NativeType("btVector3 const *") ΒΤVector3 c, @NativeType("btVector3 const *") ΒΤVector3 d) {
        return nbtVoronoiSimplexSolver_pointOutsideOfPlane(obj, p.address(), a.address(), b.address(), c.address(), d.address());
    }

    // --- [ btVoronoiSimplexSolver_reduceVertices ] ---

    public static void btVoronoiSimplexSolver_reduceVertices(@NativeType("void *") long obj, @NativeType("void *") long usedVerts) {
        long __functionAddress = Functions.VoronoiSimplexSolver_reduceVertices;
        if (CHECKS) {
            check(obj);
            check(usedVerts);
        }
        invokePPV(obj, usedVerts, __functionAddress);
    }

    // --- [ btVoronoiSimplexSolver_removeVertex ] ---

    public static void btVoronoiSimplexSolver_removeVertex(@NativeType("void *") long obj, int index) {
        long __functionAddress = Functions.VoronoiSimplexSolver_removeVertex;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, index, __functionAddress);
    }

    // --- [ btVoronoiSimplexSolver_reset ] ---

    public static void btVoronoiSimplexSolver_reset(@NativeType("void *") long obj) {
        long __functionAddress = Functions.VoronoiSimplexSolver_reset;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btVoronoiSimplexSolver_setCachedBC ] ---

    public static void btVoronoiSimplexSolver_setCachedBC(@NativeType("void *") long obj, @NativeType("void *") long value) {
        long __functionAddress = Functions.VoronoiSimplexSolver_setCachedBC;
        if (CHECKS) {
            check(obj);
            check(value);
        }
        invokePPV(obj, value, __functionAddress);
    }

    // --- [ btVoronoiSimplexSolver_setCachedP1 ] ---

    public static void nbtVoronoiSimplexSolver_setCachedP1(long obj, long value) {
        long __functionAddress = Functions.VoronoiSimplexSolver_setCachedP1;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btVoronoiSimplexSolver_setCachedP1(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtVoronoiSimplexSolver_setCachedP1(obj, value.address());
    }

    // --- [ btVoronoiSimplexSolver_setCachedP2 ] ---

    public static void nbtVoronoiSimplexSolver_setCachedP2(long obj, long value) {
        long __functionAddress = Functions.VoronoiSimplexSolver_setCachedP2;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btVoronoiSimplexSolver_setCachedP2(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtVoronoiSimplexSolver_setCachedP2(obj, value.address());
    }

    // --- [ btVoronoiSimplexSolver_setCachedV ] ---

    public static void nbtVoronoiSimplexSolver_setCachedV(long obj, long value) {
        long __functionAddress = Functions.VoronoiSimplexSolver_setCachedV;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btVoronoiSimplexSolver_setCachedV(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtVoronoiSimplexSolver_setCachedV(obj, value.address());
    }

    // --- [ btVoronoiSimplexSolver_setCachedValidClosest ] ---

    public static void btVoronoiSimplexSolver_setCachedValidClosest(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.VoronoiSimplexSolver_setCachedValidClosest;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btVoronoiSimplexSolver_setEqualVertexThreshold ] ---

    public static void btVoronoiSimplexSolver_setEqualVertexThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float threshold) {
        long __functionAddress = Functions.VoronoiSimplexSolver_setEqualVertexThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, threshold, __functionAddress);
    }

    // --- [ btVoronoiSimplexSolver_setLastW ] ---

    public static void nbtVoronoiSimplexSolver_setLastW(long obj, long value) {
        long __functionAddress = Functions.VoronoiSimplexSolver_setLastW;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, value, __functionAddress);
    }

    public static void btVoronoiSimplexSolver_setLastW(@NativeType("void *") long obj, @NativeType("btVector3 const *") ΒΤVector3 value) {
        nbtVoronoiSimplexSolver_setLastW(obj, value.address());
    }

    // --- [ btVoronoiSimplexSolver_setNeedsUpdate ] ---

    public static void btVoronoiSimplexSolver_setNeedsUpdate(@NativeType("void *") long obj, @NativeType("bool") boolean value) {
        long __functionAddress = Functions.VoronoiSimplexSolver_setNeedsUpdate;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btVoronoiSimplexSolver_setNumVertices ] ---

    public static void btVoronoiSimplexSolver_setNumVertices(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.VoronoiSimplexSolver_setNumVertices;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btVoronoiSimplexSolver_updateClosestVectorAndPoints ] ---

    @NativeType("bool")
    public static boolean btVoronoiSimplexSolver_updateClosestVectorAndPoints(@NativeType("void *") long obj) {
        long __functionAddress = Functions.VoronoiSimplexSolver_updateClosestVectorAndPoints;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ btVoronoiSimplexSolver_delete ] ---

    public static void btVoronoiSimplexSolver_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.VoronoiSimplexSolver_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}
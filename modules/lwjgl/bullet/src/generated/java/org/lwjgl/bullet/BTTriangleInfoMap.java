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
import static org.lwjgl.system.MemoryUtil.*;

public class BTTriangleInfoMap {

    protected BTTriangleInfoMap() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            TriangleInfo_new                             = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfo_new"),
            TriangleInfo_getEdgeV0V1Angle                = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfo_getEdgeV0V1Angle"),
            TriangleInfo_getEdgeV1V2Angle                = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfo_getEdgeV1V2Angle"),
            TriangleInfo_getEdgeV2V0Angle                = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfo_getEdgeV2V0Angle"),
            TriangleInfo_getFlags                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfo_getFlags"),
            TriangleInfo_setEdgeV0V1Angle                = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfo_setEdgeV0V1Angle"),
            TriangleInfo_setEdgeV1V2Angle                = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfo_setEdgeV1V2Angle"),
            TriangleInfo_setEdgeV2V0Angle                = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfo_setEdgeV2V0Angle"),
            TriangleInfo_setFlags                        = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfo_setFlags"),
            TriangleInfo_delete                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfo_delete"),
            TriangleInfoMap_new                          = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfoMap_new"),
            TriangleInfoMap_calculateSerializeBufferSize = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfoMap_calculateSerializeBufferSize"),
            TriangleInfoMap_getConvexEpsilon             = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfoMap_getConvexEpsilon"),
            TriangleInfoMap_getEdgeDistanceThreshold     = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfoMap_getEdgeDistanceThreshold"),
            TriangleInfoMap_getEqualVertexThreshold      = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfoMap_getEqualVertexThreshold"),
            TriangleInfoMap_getMaxEdgeAngleThreshold     = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfoMap_getMaxEdgeAngleThreshold"),
            TriangleInfoMap_getPlanarEpsilon             = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfoMap_getPlanarEpsilon"),
            TriangleInfoMap_getZeroAreaThreshold         = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfoMap_getZeroAreaThreshold"),
            TriangleInfoMap_serialize                    = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfoMap_serialize"),
            TriangleInfoMap_setConvexEpsilon             = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfoMap_setConvexEpsilon"),
            TriangleInfoMap_setEdgeDistanceThreshold     = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfoMap_setEdgeDistanceThreshold"),
            TriangleInfoMap_setEqualVertexThreshold      = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfoMap_setEqualVertexThreshold"),
            TriangleInfoMap_setMaxEdgeAngleThreshold     = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfoMap_setMaxEdgeAngleThreshold"),
            TriangleInfoMap_setPlanarEpsilon             = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfoMap_setPlanarEpsilon"),
            TriangleInfoMap_setZeroAreaThreshold         = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfoMap_setZeroAreaThreshold"),
            TriangleInfoMap_delete                       = apiGetFunctionAddress(LibBullet.getLibrary(), "btTriangleInfoMap_delete");

    }

    // --- [ btTriangleInfo_new ] ---

    @NativeType("void *")
    public static long btTriangleInfo_new() {
        long __functionAddress = Functions.TriangleInfo_new;
        return invokeP(__functionAddress);
    }

    // --- [ btTriangleInfo_getEdgeV0V1Angle ] ---

    @NativeType("btScalar")
    public static float btTriangleInfo_getEdgeV0V1Angle(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleInfo_getEdgeV0V1Angle;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btTriangleInfo_getEdgeV1V2Angle ] ---

    @NativeType("btScalar")
    public static float btTriangleInfo_getEdgeV1V2Angle(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleInfo_getEdgeV1V2Angle;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btTriangleInfo_getEdgeV2V0Angle ] ---

    @NativeType("btScalar")
    public static float btTriangleInfo_getEdgeV2V0Angle(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleInfo_getEdgeV2V0Angle;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btTriangleInfo_getFlags ] ---

    public static int btTriangleInfo_getFlags(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleInfo_getFlags;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btTriangleInfo_setEdgeV0V1Angle ] ---

    public static void btTriangleInfo_setEdgeV0V1Angle(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.TriangleInfo_setEdgeV0V1Angle;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btTriangleInfo_setEdgeV1V2Angle ] ---

    public static void btTriangleInfo_setEdgeV1V2Angle(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.TriangleInfo_setEdgeV1V2Angle;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btTriangleInfo_setEdgeV2V0Angle ] ---

    public static void btTriangleInfo_setEdgeV2V0Angle(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.TriangleInfo_setEdgeV2V0Angle;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btTriangleInfo_setFlags ] ---

    public static void btTriangleInfo_setFlags(@NativeType("void *") long obj, int value) {
        long __functionAddress = Functions.TriangleInfo_setFlags;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btTriangleInfo_delete ] ---

    public static void btTriangleInfo_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleInfo_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ btTriangleInfoMap_new ] ---

    @NativeType("void *")
    public static long btTriangleInfoMap_new() {
        long __functionAddress = Functions.TriangleInfoMap_new;
        return invokeP(__functionAddress);
    }

    // --- [ btTriangleInfoMap_calculateSerializeBufferSize ] ---

    public static int btTriangleInfoMap_calculateSerializeBufferSize(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleInfoMap_calculateSerializeBufferSize;
        if (CHECKS) {
            check(obj);
        }
        return invokePI(obj, __functionAddress);
    }

    // --- [ btTriangleInfoMap_getConvexEpsilon ] ---

    /** EXPORT void btTriangleInfoMap_deSerialize(btTriangleInfoMap* obj, btTriangleInfoMapData* data); */
    @NativeType("btScalar")
    public static float btTriangleInfoMap_getConvexEpsilon(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleInfoMap_getConvexEpsilon;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btTriangleInfoMap_getEdgeDistanceThreshold ] ---

    @NativeType("btScalar")
    public static float btTriangleInfoMap_getEdgeDistanceThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleInfoMap_getEdgeDistanceThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btTriangleInfoMap_getEqualVertexThreshold ] ---

    @NativeType("btScalar")
    public static float btTriangleInfoMap_getEqualVertexThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleInfoMap_getEqualVertexThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btTriangleInfoMap_getMaxEdgeAngleThreshold ] ---

    @NativeType("btScalar")
    public static float btTriangleInfoMap_getMaxEdgeAngleThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleInfoMap_getMaxEdgeAngleThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btTriangleInfoMap_getPlanarEpsilon ] ---

    @NativeType("btScalar")
    public static float btTriangleInfoMap_getPlanarEpsilon(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleInfoMap_getPlanarEpsilon;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btTriangleInfoMap_getZeroAreaThreshold ] ---

    @NativeType("btScalar")
    public static float btTriangleInfoMap_getZeroAreaThreshold(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleInfoMap_getZeroAreaThreshold;
        if (CHECKS) {
            check(obj);
        }
        return invokePF(obj, __functionAddress);
    }

    // --- [ btTriangleInfoMap_serialize ] ---

    public static long nbtTriangleInfoMap_serialize(long obj, long dataBuffer, long serializer) {
        long __functionAddress = Functions.TriangleInfoMap_serialize;
        if (CHECKS) {
            check(obj);
            check(dataBuffer);
            check(serializer);
        }
        return invokePPPP(obj, dataBuffer, serializer, __functionAddress);
    }

    @Nullable
    @NativeType("char const *")
    public static String btTriangleInfoMap_serialize(@NativeType("void *") long obj, @NativeType("void *") long dataBuffer, @NativeType("void *") long serializer) {
        long __result = nbtTriangleInfoMap_serialize(obj, dataBuffer, serializer);
        return memUTF8Safe(__result);
    }

    // --- [ btTriangleInfoMap_setConvexEpsilon ] ---

    public static void btTriangleInfoMap_setConvexEpsilon(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.TriangleInfoMap_setConvexEpsilon;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btTriangleInfoMap_setEdgeDistanceThreshold ] ---

    public static void btTriangleInfoMap_setEdgeDistanceThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.TriangleInfoMap_setEdgeDistanceThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btTriangleInfoMap_setEqualVertexThreshold ] ---

    public static void btTriangleInfoMap_setEqualVertexThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.TriangleInfoMap_setEqualVertexThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btTriangleInfoMap_setMaxEdgeAngleThreshold ] ---

    public static void btTriangleInfoMap_setMaxEdgeAngleThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.TriangleInfoMap_setMaxEdgeAngleThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btTriangleInfoMap_setPlanarEpsilon ] ---

    public static void btTriangleInfoMap_setPlanarEpsilon(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.TriangleInfoMap_setPlanarEpsilon;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btTriangleInfoMap_setZeroAreaThreshold ] ---

    public static void btTriangleInfoMap_setZeroAreaThreshold(@NativeType("void *") long obj, @NativeType("btScalar") float value) {
        long __functionAddress = Functions.TriangleInfoMap_setZeroAreaThreshold;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, value, __functionAddress);
    }

    // --- [ btTriangleInfoMap_delete ] ---

    public static void btTriangleInfoMap_delete(@NativeType("void *") long obj) {
        long __functionAddress = Functions.TriangleInfoMap_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}
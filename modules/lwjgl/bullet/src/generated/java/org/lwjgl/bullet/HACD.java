/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class HACD {

    protected HACD() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LibBullet.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            HACD_new                        = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_new"),
            HACD_Compute                    = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_Compute"),
            HACD_Compute2                   = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_Compute2"),
            HACD_Compute3                   = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_Compute3"),
            HACD_DenormalizeData            = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_DenormalizeData"),
            HACD_GetAddExtraDistPoints      = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_GetAddExtraDistPoints"),
            HACD_GetAddFacesPoints          = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_GetAddFacesPoints"),
            HACD_GetAddNeighboursDistPoints = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_GetAddNeighboursDistPoints"),
            HACD_GetCallBack                = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_GetCallBack"),
            HACD_GetCH                      = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_GetCH"),
            HACD_GetCompacityWeight         = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_GetCompacityWeight"),
            HACD_GetConcavity               = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_GetConcavity"),
            HACD_GetConnectDist             = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_GetConnectDist"),
            HACD_GetNClusters               = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_GetNClusters"),
            HACD_GetNPoints                 = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_GetNPoints"),
            HACD_GetNPointsCH               = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_GetNPointsCH"),
            HACD_GetNTriangles              = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_GetNTriangles"),
            HACD_GetNTrianglesCH            = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_GetNTrianglesCH"),
            HACD_GetNVerticesPerCH          = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_GetNVerticesPerCH"),
            HACD_GetPartition               = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_GetPartition"),
            HACD_GetPoints                  = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_GetPoints"),
            HACD_GetScaleFactor             = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_GetScaleFactor"),
            HACD_GetTriangles               = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_GetTriangles"),
            HACD_GetVolumeWeight            = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_GetVolumeWeight"),
            HACD_NormalizeData              = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_NormalizeData"),
            HACD_Save                       = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_Save"),
            HACD_Save2                      = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_Save2"),
            HACD_SetAddExtraDistPoints      = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_SetAddExtraDistPoints"),
            HACD_SetAddFacesPoints          = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_SetAddFacesPoints"),
            HACD_SetAddNeighboursDistPoints = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_SetAddNeighboursDistPoints"),
            HACD_SetCallBack                = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_SetCallBack"),
            HACD_SetCompacityWeight         = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_SetCompacityWeight"),
            HACD_SetConcavity               = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_SetConcavity"),
            HACD_SetConnectDist             = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_SetConnectDist"),
            HACD_SetNClusters               = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_SetNClusters"),
            HACD_SetNPoints                 = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_SetNPoints"),
            HACD_SetNTriangles              = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_SetNTriangles"),
            HACD_SetNVerticesPerCH          = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_SetNVerticesPerCH"),
            HACD_SetPoints                  = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_SetPoints"),
            HACD_SetScaleFactor             = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_SetScaleFactor"),
            HACD_SetTriangles               = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_SetTriangles"),
            HACD_SetVolumeWeight            = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_SetVolumeWeight"),
            HACD_delete                     = apiGetFunctionAddress(LibBullet.getLibrary(), "HACD_HACD_delete");

    }

    // --- [ HACD_HACD_new ] ---

    @NativeType("HACD_HACD *")
    public static long HACD_HACD_new() {
        long __functionAddress = Functions.HACD_new;
        return invokeP(__functionAddress);
    }

    // --- [ HACD_HACD_Compute ] ---

    @NativeType("bool")
    public static boolean HACD_HACD_Compute(@NativeType("HACD_HACD *") long obj) {
        long __functionAddress = Functions.HACD_Compute;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ HACD_HACD_Compute2 ] ---

    @NativeType("bool")
    public static boolean HACD_HACD_Compute2(@NativeType("HACD_HACD *") long obj, @NativeType("bool") boolean fullCH) {
        long __functionAddress = Functions.HACD_Compute2;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, fullCH, __functionAddress);
    }

    // --- [ HACD_HACD_Compute3 ] ---

    @NativeType("bool")
    public static boolean HACD_HACD_Compute3(@NativeType("HACD_HACD *") long obj, @NativeType("bool") boolean fullCH, @NativeType("bool") boolean exportDistPoints) {
        long __functionAddress = Functions.HACD_Compute3;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, fullCH, exportDistPoints, __functionAddress);
    }

    // --- [ HACD_HACD_DenormalizeData ] ---

    public static void HACD_HACD_DenormalizeData(@NativeType("HACD_HACD *") long obj) {
        long __functionAddress = Functions.HACD_DenormalizeData;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ HACD_HACD_GetAddExtraDistPoints ] ---

    @NativeType("bool")
    public static boolean HACD_HACD_GetAddExtraDistPoints(@NativeType("HACD_HACD *") long obj) {
        long __functionAddress = Functions.HACD_GetAddExtraDistPoints;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ HACD_HACD_GetAddFacesPoints ] ---

    @NativeType("bool")
    public static boolean HACD_HACD_GetAddFacesPoints(@NativeType("HACD_HACD *") long obj) {
        long __functionAddress = Functions.HACD_GetAddFacesPoints;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ HACD_HACD_GetAddNeighboursDistPoints ] ---

    @NativeType("bool")
    public static boolean HACD_HACD_GetAddNeighboursDistPoints(@NativeType("HACD_HACD *") long obj) {
        long __functionAddress = Functions.HACD_GetAddNeighboursDistPoints;
        if (CHECKS) {
            check(obj);
        }
        return invokePZ(obj, __functionAddress);
    }

    // --- [ HACD_HACD_GetCallBack ] ---

    public static long nHACD_HACD_GetCallBack(long obj) {
        long __functionAddress = Functions.HACD_GetCallBack;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("HACD_CallBackFunction const")
    public static HACDCallBackFunction HACD_HACD_GetCallBack(@NativeType("HACD_HACD *") long obj) {
        return HACDCallBackFunction.createSafe(nHACD_HACD_GetCallBack(obj));
    }

    // --- [ HACD_HACD_GetCH ] ---

    public static boolean nHACD_HACD_GetCH(long obj, int numCH, long points, long triangles) {
        long __functionAddress = Functions.HACD_GetCH;
        if (CHECKS) {
            check(obj);
        }
        return invokePPPZ(obj, numCH, points, triangles, __functionAddress);
    }

    @NativeType("bool")
    public static boolean HACD_HACD_GetCH(@NativeType("HACD_HACD *") long obj, int numCH, @NativeType("HACD_Vec3_Real *") HACDVec3Real.Buffer points, @NativeType("HACD_Vec3_long *") HACDVec3Long.Buffer triangles) {
        return nHACD_HACD_GetCH(obj, numCH, points.address(), triangles.address());
    }

    // --- [ HACD_HACD_GetCompacityWeight ] ---

    public static double HACD_HACD_GetCompacityWeight(@NativeType("HACD_HACD *") long obj) {
        long __functionAddress = Functions.HACD_GetCompacityWeight;
        if (CHECKS) {
            check(obj);
        }
        return invokePD(obj, __functionAddress);
    }

    // --- [ HACD_HACD_GetConcavity ] ---

    public static double HACD_HACD_GetConcavity(@NativeType("HACD_HACD *") long obj) {
        long __functionAddress = Functions.HACD_GetConcavity;
        if (CHECKS) {
            check(obj);
        }
        return invokePD(obj, __functionAddress);
    }

    // --- [ HACD_HACD_GetConnectDist ] ---

    public static double HACD_HACD_GetConnectDist(@NativeType("HACD_HACD *") long obj) {
        long __functionAddress = Functions.HACD_GetConnectDist;
        if (CHECKS) {
            check(obj);
        }
        return invokePD(obj, __functionAddress);
    }

    // --- [ HACD_HACD_GetNClusters ] ---

    @NativeType("size_t")
    public static long HACD_HACD_GetNClusters(@NativeType("HACD_HACD *") long obj) {
        long __functionAddress = Functions.HACD_GetNClusters;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ HACD_HACD_GetNPoints ] ---

    @NativeType("size_t")
    public static long HACD_HACD_GetNPoints(@NativeType("HACD_HACD *") long obj) {
        long __functionAddress = Functions.HACD_GetNPoints;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ HACD_HACD_GetNPointsCH ] ---

    @NativeType("size_t")
    public static long HACD_HACD_GetNPointsCH(@NativeType("HACD_HACD *") long obj, int numCH) {
        long __functionAddress = Functions.HACD_GetNPointsCH;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, numCH, __functionAddress);
    }

    // --- [ HACD_HACD_GetNTriangles ] ---

    @NativeType("size_t")
    public static long HACD_HACD_GetNTriangles(@NativeType("HACD_HACD *") long obj) {
        long __functionAddress = Functions.HACD_GetNTriangles;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ HACD_HACD_GetNTrianglesCH ] ---

    @NativeType("size_t")
    public static long HACD_HACD_GetNTrianglesCH(@NativeType("HACD_HACD *") long obj, int numCH) {
        long __functionAddress = Functions.HACD_GetNTrianglesCH;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, numCH, __functionAddress);
    }

    // --- [ HACD_HACD_GetNVerticesPerCH ] ---

    @NativeType("size_t")
    public static long HACD_HACD_GetNVerticesPerCH(@NativeType("HACD_HACD *") long obj) {
        long __functionAddress = Functions.HACD_GetNVerticesPerCH;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    // --- [ HACD_HACD_GetPartition ] ---

    public static long nHACD_HACD_GetPartition(long obj) {
        long __functionAddress = Functions.HACD_GetPartition;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("long const *")
    public static CLongBuffer HACD_HACD_GetPartition(@NativeType("HACD_HACD *") long obj) {
        long __result = nHACD_HACD_GetPartition(obj);
        return memCLongBufferSafe(__result, (int)HACD_HACD_GetNTriangles(obj));
    }

    @Nullable
    @NativeType("long const *")
    public static CLongBuffer HACD_HACD_GetPartition(@NativeType("HACD_HACD *") long obj, long length) {
        long __result = nHACD_HACD_GetPartition(obj);
        return memCLongBufferSafe(__result, (int)length);
    }

    // --- [ HACD_HACD_GetPoints ] ---

    public static long nHACD_HACD_GetPoints(long obj) {
        long __functionAddress = Functions.HACD_GetPoints;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("HACD_Vec3_Real *")
    public static HACDVec3Real HACD_HACD_GetPoints(@NativeType("HACD_HACD *") long obj) {
        long __result = nHACD_HACD_GetPoints(obj);
        return HACDVec3Real.createSafe(__result);
    }

    // --- [ HACD_HACD_GetScaleFactor ] ---

    public static double HACD_HACD_GetScaleFactor(@NativeType("HACD_HACD *") long obj) {
        long __functionAddress = Functions.HACD_GetScaleFactor;
        if (CHECKS) {
            check(obj);
        }
        return invokePD(obj, __functionAddress);
    }

    // --- [ HACD_HACD_GetTriangles ] ---

    public static long nHACD_HACD_GetTriangles(long obj) {
        long __functionAddress = Functions.HACD_GetTriangles;
        if (CHECKS) {
            check(obj);
        }
        return invokePP(obj, __functionAddress);
    }

    @Nullable
    @NativeType("HACD_Vec3_long const *")
    public static HACDVec3Long HACD_HACD_GetTriangles(@NativeType("HACD_HACD *") long obj) {
        long __result = nHACD_HACD_GetTriangles(obj);
        return HACDVec3Long.createSafe(__result);
    }

    // --- [ HACD_HACD_GetVolumeWeight ] ---

    public static double HACD_HACD_GetVolumeWeight(@NativeType("HACD_HACD *") long obj) {
        long __functionAddress = Functions.HACD_GetVolumeWeight;
        if (CHECKS) {
            check(obj);
        }
        return invokePD(obj, __functionAddress);
    }

    // --- [ HACD_HACD_NormalizeData ] ---

    public static void HACD_HACD_NormalizeData(@NativeType("HACD_HACD *") long obj) {
        long __functionAddress = Functions.HACD_NormalizeData;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

    // --- [ HACD_HACD_Save ] ---

    public static boolean nHACD_HACD_Save(long obj, long fileName, boolean uniColor) {
        long __functionAddress = Functions.HACD_Save;
        if (CHECKS) {
            check(obj);
        }
        return invokePPZ(obj, fileName, uniColor, __functionAddress);
    }

    @NativeType("bool")
    public static boolean HACD_HACD_Save(@NativeType("HACD_HACD *") long obj, @NativeType("char const *") ByteBuffer fileName, @NativeType("bool") boolean uniColor) {
        if (CHECKS) {
            checkNT1(fileName);
        }
        return nHACD_HACD_Save(obj, memAddress(fileName), uniColor);
    }

    @NativeType("bool")
    public static boolean HACD_HACD_Save(@NativeType("HACD_HACD *") long obj, @NativeType("char const *") CharSequence fileName, @NativeType("bool") boolean uniColor) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fileName, true);
            long fileNameEncoded = stack.getPointerAddress();
            return nHACD_HACD_Save(obj, fileNameEncoded, uniColor);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ HACD_HACD_Save2 ] ---

    public static boolean nHACD_HACD_Save2(long obj, long fileName, boolean uniColor, long numCluster) {
        long __functionAddress = Functions.HACD_Save2;
        if (CHECKS) {
            check(obj);
        }
        return invokePPNZ(obj, fileName, uniColor, numCluster, __functionAddress);
    }

    @NativeType("bool")
    public static boolean HACD_HACD_Save2(@NativeType("HACD_HACD *") long obj, @NativeType("char const *") ByteBuffer fileName, @NativeType("bool") boolean uniColor, long numCluster) {
        if (CHECKS) {
            checkNT1(fileName);
        }
        return nHACD_HACD_Save2(obj, memAddress(fileName), uniColor, numCluster);
    }

    @NativeType("bool")
    public static boolean HACD_HACD_Save2(@NativeType("HACD_HACD *") long obj, @NativeType("char const *") CharSequence fileName, @NativeType("bool") boolean uniColor, long numCluster) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(fileName, true);
            long fileNameEncoded = stack.getPointerAddress();
            return nHACD_HACD_Save2(obj, fileNameEncoded, uniColor, numCluster);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ HACD_HACD_SetAddExtraDistPoints ] ---

    public static void HACD_HACD_SetAddExtraDistPoints(@NativeType("HACD_HACD *") long obj, @NativeType("bool") boolean addExtraDistPoints) {
        long __functionAddress = Functions.HACD_SetAddExtraDistPoints;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, addExtraDistPoints, __functionAddress);
    }

    // --- [ HACD_HACD_SetAddFacesPoints ] ---

    public static void HACD_HACD_SetAddFacesPoints(@NativeType("HACD_HACD *") long obj, @NativeType("bool") boolean addFacesPoints) {
        long __functionAddress = Functions.HACD_SetAddFacesPoints;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, addFacesPoints, __functionAddress);
    }

    // --- [ HACD_HACD_SetAddNeighboursDistPoints ] ---

    public static void HACD_HACD_SetAddNeighboursDistPoints(@NativeType("HACD_HACD *") long obj, @NativeType("bool") boolean addNeighboursDistPoints) {
        long __functionAddress = Functions.HACD_SetAddNeighboursDistPoints;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, addNeighboursDistPoints, __functionAddress);
    }

    // --- [ HACD_HACD_SetCallBack ] ---

    public static void nHACD_HACD_SetCallBack(long obj, long callBack) {
        long __functionAddress = Functions.HACD_SetCallBack;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, callBack, __functionAddress);
    }

    public static void HACD_HACD_SetCallBack(@NativeType("HACD_HACD *") long obj, @NativeType("HACD_CallBackFunction") HACDCallBackFunctionI callBack) {
        nHACD_HACD_SetCallBack(obj, callBack.address());
    }

    // --- [ HACD_HACD_SetCompacityWeight ] ---

    public static void HACD_HACD_SetCompacityWeight(@NativeType("HACD_HACD *") long obj, double alpha) {
        long __functionAddress = Functions.HACD_SetCompacityWeight;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, alpha, __functionAddress);
    }

    // --- [ HACD_HACD_SetConcavity ] ---

    public static void HACD_HACD_SetConcavity(@NativeType("HACD_HACD *") long obj, double concavity) {
        long __functionAddress = Functions.HACD_SetConcavity;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, concavity, __functionAddress);
    }

    // --- [ HACD_HACD_SetConnectDist ] ---

    public static void HACD_HACD_SetConnectDist(@NativeType("HACD_HACD *") long obj, double ccConnectDist) {
        long __functionAddress = Functions.HACD_SetConnectDist;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, ccConnectDist, __functionAddress);
    }

    // --- [ HACD_HACD_SetNClusters ] ---

    public static void HACD_HACD_SetNClusters(@NativeType("HACD_HACD *") long obj, int nClusters) {
        long __functionAddress = Functions.HACD_SetNClusters;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, nClusters, __functionAddress);
    }

    // --- [ HACD_HACD_SetNPoints ] ---

    public static void HACD_HACD_SetNPoints(@NativeType("HACD_HACD *") long obj, int nPoints) {
        long __functionAddress = Functions.HACD_SetNPoints;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, nPoints, __functionAddress);
    }

    // --- [ HACD_HACD_SetNTriangles ] ---

    public static void HACD_HACD_SetNTriangles(@NativeType("HACD_HACD *") long obj, int nTriangles) {
        long __functionAddress = Functions.HACD_SetNTriangles;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, nTriangles, __functionAddress);
    }

    // --- [ HACD_HACD_SetNVerticesPerCH ] ---

    public static void HACD_HACD_SetNVerticesPerCH(@NativeType("HACD_HACD *") long obj, int nVerticesPerCH) {
        long __functionAddress = Functions.HACD_SetNVerticesPerCH;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, nVerticesPerCH, __functionAddress);
    }

    // --- [ HACD_HACD_SetPoints ] ---

    public static void nHACD_HACD_SetPoints(long obj, long points) {
        long __functionAddress = Functions.HACD_SetPoints;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, points, __functionAddress);
    }

    public static void HACD_HACD_SetPoints(@NativeType("HACD_HACD *") long obj, @NativeType("HACD_Vec3_Real *") HACDVec3Real.Buffer points) {
        nHACD_HACD_SetPoints(obj, points.address());
    }

    // --- [ HACD_HACD_SetScaleFactor ] ---

    public static void HACD_HACD_SetScaleFactor(@NativeType("HACD_HACD *") long obj, double scale) {
        long __functionAddress = Functions.HACD_SetScaleFactor;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, scale, __functionAddress);
    }

    // --- [ HACD_HACD_SetTriangles ] ---

    public static void nHACD_HACD_SetTriangles(long obj, long triangles) {
        long __functionAddress = Functions.HACD_SetTriangles;
        if (CHECKS) {
            check(obj);
        }
        invokePPV(obj, triangles, __functionAddress);
    }

    public static void HACD_HACD_SetTriangles(@NativeType("HACD_HACD *") long obj, @NativeType("HACD_Vec3_long *") HACDVec3Long.Buffer triangles) {
        nHACD_HACD_SetTriangles(obj, triangles.address());
    }

    // --- [ HACD_HACD_SetVolumeWeight ] ---

    public static void HACD_HACD_SetVolumeWeight(@NativeType("HACD_HACD *") long obj, double beta) {
        long __functionAddress = Functions.HACD_SetVolumeWeight;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, beta, __functionAddress);
    }

    // --- [ HACD_HACD_delete ] ---

    public static void HACD_HACD_delete(@NativeType("HACD_HACD *") long obj) {
        long __functionAddress = Functions.HACD_delete;
        if (CHECKS) {
            check(obj);
        }
        invokePV(obj, __functionAddress);
    }

}
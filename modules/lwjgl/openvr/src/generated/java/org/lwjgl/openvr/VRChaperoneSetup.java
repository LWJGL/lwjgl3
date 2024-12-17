/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class VRChaperoneSetup {

    protected VRChaperoneSetup() {
        throw new UnsupportedOperationException();
    }

    // --- [ VRChaperoneSetup_CommitWorkingCopy ] ---

    /** {@code bool VRChaperoneSetup_CommitWorkingCopy(EChaperoneConfigFile configFile)} */
    @NativeType("bool")
    public static boolean VRChaperoneSetup_CommitWorkingCopy(@NativeType("EChaperoneConfigFile") int configFile) {
        long __functionAddress = OpenVR.VRChaperoneSetup.CommitWorkingCopy;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(configFile, __functionAddress);
    }

    // --- [ VRChaperoneSetup_RevertWorkingCopy ] ---

    /** {@code void VRChaperoneSetup_RevertWorkingCopy(void)} */
    public static void VRChaperoneSetup_RevertWorkingCopy() {
        long __functionAddress = OpenVR.VRChaperoneSetup.RevertWorkingCopy;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRChaperoneSetup_GetWorkingPlayAreaSize ] ---

    /** {@code bool VRChaperoneSetup_GetWorkingPlayAreaSize(float * pSizeX, float * pSizeZ)} */
    public static boolean nVRChaperoneSetup_GetWorkingPlayAreaSize(long pSizeX, long pSizeZ) {
        long __functionAddress = OpenVR.VRChaperoneSetup.GetWorkingPlayAreaSize;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(pSizeX, pSizeZ, __functionAddress);
    }

    /** {@code bool VRChaperoneSetup_GetWorkingPlayAreaSize(float * pSizeX, float * pSizeZ)} */
    @NativeType("bool")
    public static boolean VRChaperoneSetup_GetWorkingPlayAreaSize(@NativeType("float *") FloatBuffer pSizeX, @NativeType("float *") FloatBuffer pSizeZ) {
        if (CHECKS) {
            check(pSizeX, 1);
            check(pSizeZ, 1);
        }
        return nVRChaperoneSetup_GetWorkingPlayAreaSize(memAddress(pSizeX), memAddress(pSizeZ));
    }

    // --- [ VRChaperoneSetup_GetWorkingPlayAreaRect ] ---

    /** {@code bool VRChaperoneSetup_GetWorkingPlayAreaRect(HmdQuad_t * rect)} */
    public static boolean nVRChaperoneSetup_GetWorkingPlayAreaRect(long rect) {
        long __functionAddress = OpenVR.VRChaperoneSetup.GetWorkingPlayAreaRect;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(rect, __functionAddress);
    }

    /** {@code bool VRChaperoneSetup_GetWorkingPlayAreaRect(HmdQuad_t * rect)} */
    @NativeType("bool")
    public static boolean VRChaperoneSetup_GetWorkingPlayAreaRect(@NativeType("HmdQuad_t *") HmdQuad rect) {
        return nVRChaperoneSetup_GetWorkingPlayAreaRect(rect.address());
    }

    // --- [ VRChaperoneSetup_GetWorkingCollisionBoundsInfo ] ---

    /** {@code bool VRChaperoneSetup_GetWorkingCollisionBoundsInfo(HmdQuad_t * pQuadsBuffer, uint32_t * punQuadsCount)} */
    public static boolean nVRChaperoneSetup_GetWorkingCollisionBoundsInfo(long pQuadsBuffer, long punQuadsCount) {
        long __functionAddress = OpenVR.VRChaperoneSetup.GetWorkingCollisionBoundsInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(pQuadsBuffer, punQuadsCount, __functionAddress);
    }

    /** {@code bool VRChaperoneSetup_GetWorkingCollisionBoundsInfo(HmdQuad_t * pQuadsBuffer, uint32_t * punQuadsCount)} */
    @NativeType("bool")
    public static boolean VRChaperoneSetup_GetWorkingCollisionBoundsInfo(@NativeType("HmdQuad_t *") HmdQuad.@Nullable Buffer pQuadsBuffer, @NativeType("uint32_t *") IntBuffer punQuadsCount) {
        if (CHECKS) {
            check(punQuadsCount, 1);
            checkSafe(pQuadsBuffer, punQuadsCount.get(punQuadsCount.position()));
        }
        return nVRChaperoneSetup_GetWorkingCollisionBoundsInfo(memAddressSafe(pQuadsBuffer), memAddress(punQuadsCount));
    }

    // --- [ VRChaperoneSetup_GetLiveCollisionBoundsInfo ] ---

    /** {@code bool VRChaperoneSetup_GetLiveCollisionBoundsInfo(HmdQuad_t * pQuadsBuffer, uint32_t * punQuadsCount)} */
    public static boolean nVRChaperoneSetup_GetLiveCollisionBoundsInfo(long pQuadsBuffer, long punQuadsCount) {
        long __functionAddress = OpenVR.VRChaperoneSetup.GetLiveCollisionBoundsInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(pQuadsBuffer, punQuadsCount, __functionAddress);
    }

    /** {@code bool VRChaperoneSetup_GetLiveCollisionBoundsInfo(HmdQuad_t * pQuadsBuffer, uint32_t * punQuadsCount)} */
    @NativeType("bool")
    public static boolean VRChaperoneSetup_GetLiveCollisionBoundsInfo(@NativeType("HmdQuad_t *") HmdQuad.@Nullable Buffer pQuadsBuffer, @NativeType("uint32_t *") IntBuffer punQuadsCount) {
        if (CHECKS) {
            check(punQuadsCount, 1);
            checkSafe(pQuadsBuffer, punQuadsCount.get(punQuadsCount.position()));
        }
        return nVRChaperoneSetup_GetLiveCollisionBoundsInfo(memAddressSafe(pQuadsBuffer), memAddress(punQuadsCount));
    }

    // --- [ VRChaperoneSetup_GetWorkingSeatedZeroPoseToRawTrackingPose ] ---

    /** {@code bool VRChaperoneSetup_GetWorkingSeatedZeroPoseToRawTrackingPose(HmdMatrix34_t * pmatSeatedZeroPoseToRawTrackingPose)} */
    public static boolean nVRChaperoneSetup_GetWorkingSeatedZeroPoseToRawTrackingPose(long pmatSeatedZeroPoseToRawTrackingPose) {
        long __functionAddress = OpenVR.VRChaperoneSetup.GetWorkingSeatedZeroPoseToRawTrackingPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(pmatSeatedZeroPoseToRawTrackingPose, __functionAddress);
    }

    /** {@code bool VRChaperoneSetup_GetWorkingSeatedZeroPoseToRawTrackingPose(HmdMatrix34_t * pmatSeatedZeroPoseToRawTrackingPose)} */
    @NativeType("bool")
    public static boolean VRChaperoneSetup_GetWorkingSeatedZeroPoseToRawTrackingPose(@NativeType("HmdMatrix34_t *") HmdMatrix34 pmatSeatedZeroPoseToRawTrackingPose) {
        return nVRChaperoneSetup_GetWorkingSeatedZeroPoseToRawTrackingPose(pmatSeatedZeroPoseToRawTrackingPose.address());
    }

    // --- [ VRChaperoneSetup_GetWorkingStandingZeroPoseToRawTrackingPose ] ---

    /** {@code bool VRChaperoneSetup_GetWorkingStandingZeroPoseToRawTrackingPose(HmdMatrix34_t * pmatStandingZeroPoseToRawTrackingPose)} */
    public static boolean nVRChaperoneSetup_GetWorkingStandingZeroPoseToRawTrackingPose(long pmatStandingZeroPoseToRawTrackingPose) {
        long __functionAddress = OpenVR.VRChaperoneSetup.GetWorkingStandingZeroPoseToRawTrackingPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(pmatStandingZeroPoseToRawTrackingPose, __functionAddress);
    }

    /** {@code bool VRChaperoneSetup_GetWorkingStandingZeroPoseToRawTrackingPose(HmdMatrix34_t * pmatStandingZeroPoseToRawTrackingPose)} */
    @NativeType("bool")
    public static boolean VRChaperoneSetup_GetWorkingStandingZeroPoseToRawTrackingPose(@NativeType("HmdMatrix34_t *") HmdMatrix34 pmatStandingZeroPoseToRawTrackingPose) {
        return nVRChaperoneSetup_GetWorkingStandingZeroPoseToRawTrackingPose(pmatStandingZeroPoseToRawTrackingPose.address());
    }

    // --- [ VRChaperoneSetup_SetWorkingPlayAreaSize ] ---

    /** {@code void VRChaperoneSetup_SetWorkingPlayAreaSize(float sizeX, float sizeZ)} */
    public static void VRChaperoneSetup_SetWorkingPlayAreaSize(float sizeX, float sizeZ) {
        long __functionAddress = OpenVR.VRChaperoneSetup.SetWorkingPlayAreaSize;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(sizeX, sizeZ, __functionAddress);
    }

    // --- [ VRChaperoneSetup_SetWorkingCollisionBoundsInfo ] ---

    /** {@code void VRChaperoneSetup_SetWorkingCollisionBoundsInfo(HmdQuad_t * pQuadsBuffer, uint32_t unQuadsCount)} */
    public static void nVRChaperoneSetup_SetWorkingCollisionBoundsInfo(long pQuadsBuffer, int unQuadsCount) {
        long __functionAddress = OpenVR.VRChaperoneSetup.SetWorkingCollisionBoundsInfo;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pQuadsBuffer, unQuadsCount, __functionAddress);
    }

    /** {@code void VRChaperoneSetup_SetWorkingCollisionBoundsInfo(HmdQuad_t * pQuadsBuffer, uint32_t unQuadsCount)} */
    public static void VRChaperoneSetup_SetWorkingCollisionBoundsInfo(@NativeType("HmdQuad_t *") HmdQuad.Buffer pQuadsBuffer) {
        nVRChaperoneSetup_SetWorkingCollisionBoundsInfo(pQuadsBuffer.address(), pQuadsBuffer.remaining());
    }

    // --- [ VRChaperoneSetup_SetWorkingPerimeter ] ---

    /** {@code void VRChaperoneSetup_SetWorkingPerimeter(HmdVector2_t * pPointBuffer, uint32_t unPointCount)} */
    public static void nVRChaperoneSetup_SetWorkingPerimeter(long pPointBuffer, int unPointCount) {
        long __functionAddress = OpenVR.VRChaperoneSetup.SetWorkingPerimeter;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pPointBuffer, unPointCount, __functionAddress);
    }

    /** {@code void VRChaperoneSetup_SetWorkingPerimeter(HmdVector2_t * pPointBuffer, uint32_t unPointCount)} */
    public static void VRChaperoneSetup_SetWorkingPerimeter(@NativeType("HmdVector2_t *") HmdVector2.Buffer pPointBuffer) {
        nVRChaperoneSetup_SetWorkingPerimeter(pPointBuffer.address(), pPointBuffer.remaining());
    }

    // --- [ VRChaperoneSetup_SetWorkingSeatedZeroPoseToRawTrackingPose ] ---

    /** {@code void VRChaperoneSetup_SetWorkingSeatedZeroPoseToRawTrackingPose(HmdMatrix34_t const * pMatSeatedZeroPoseToRawTrackingPose)} */
    public static void nVRChaperoneSetup_SetWorkingSeatedZeroPoseToRawTrackingPose(long pMatSeatedZeroPoseToRawTrackingPose) {
        long __functionAddress = OpenVR.VRChaperoneSetup.SetWorkingSeatedZeroPoseToRawTrackingPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pMatSeatedZeroPoseToRawTrackingPose, __functionAddress);
    }

    /** {@code void VRChaperoneSetup_SetWorkingSeatedZeroPoseToRawTrackingPose(HmdMatrix34_t const * pMatSeatedZeroPoseToRawTrackingPose)} */
    public static void VRChaperoneSetup_SetWorkingSeatedZeroPoseToRawTrackingPose(@NativeType("HmdMatrix34_t const *") HmdMatrix34 pMatSeatedZeroPoseToRawTrackingPose) {
        nVRChaperoneSetup_SetWorkingSeatedZeroPoseToRawTrackingPose(pMatSeatedZeroPoseToRawTrackingPose.address());
    }

    // --- [ VRChaperoneSetup_SetWorkingStandingZeroPoseToRawTrackingPose ] ---

    /** {@code void VRChaperoneSetup_SetWorkingStandingZeroPoseToRawTrackingPose(HmdMatrix34_t const * pMatStandingZeroPoseToRawTrackingPose)} */
    public static void nVRChaperoneSetup_SetWorkingStandingZeroPoseToRawTrackingPose(long pMatStandingZeroPoseToRawTrackingPose) {
        long __functionAddress = OpenVR.VRChaperoneSetup.SetWorkingStandingZeroPoseToRawTrackingPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pMatStandingZeroPoseToRawTrackingPose, __functionAddress);
    }

    /** {@code void VRChaperoneSetup_SetWorkingStandingZeroPoseToRawTrackingPose(HmdMatrix34_t const * pMatStandingZeroPoseToRawTrackingPose)} */
    public static void VRChaperoneSetup_SetWorkingStandingZeroPoseToRawTrackingPose(@NativeType("HmdMatrix34_t const *") HmdMatrix34 pMatStandingZeroPoseToRawTrackingPose) {
        nVRChaperoneSetup_SetWorkingStandingZeroPoseToRawTrackingPose(pMatStandingZeroPoseToRawTrackingPose.address());
    }

    // --- [ VRChaperoneSetup_ReloadFromDisk ] ---

    /** {@code void VRChaperoneSetup_ReloadFromDisk(EChaperoneConfigFile configFile)} */
    public static void VRChaperoneSetup_ReloadFromDisk(@NativeType("EChaperoneConfigFile") int configFile) {
        long __functionAddress = OpenVR.VRChaperoneSetup.ReloadFromDisk;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(configFile, __functionAddress);
    }

    // --- [ VRChaperoneSetup_GetLiveSeatedZeroPoseToRawTrackingPose ] ---

    /** {@code bool VRChaperoneSetup_GetLiveSeatedZeroPoseToRawTrackingPose(HmdMatrix34_t * pmatSeatedZeroPoseToRawTrackingPose)} */
    public static boolean nVRChaperoneSetup_GetLiveSeatedZeroPoseToRawTrackingPose(long pmatSeatedZeroPoseToRawTrackingPose) {
        long __functionAddress = OpenVR.VRChaperoneSetup.GetLiveSeatedZeroPoseToRawTrackingPose;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(pmatSeatedZeroPoseToRawTrackingPose, __functionAddress);
    }

    /** {@code bool VRChaperoneSetup_GetLiveSeatedZeroPoseToRawTrackingPose(HmdMatrix34_t * pmatSeatedZeroPoseToRawTrackingPose)} */
    @NativeType("bool")
    public static boolean VRChaperoneSetup_GetLiveSeatedZeroPoseToRawTrackingPose(@NativeType("HmdMatrix34_t *") HmdMatrix34 pmatSeatedZeroPoseToRawTrackingPose) {
        return nVRChaperoneSetup_GetLiveSeatedZeroPoseToRawTrackingPose(pmatSeatedZeroPoseToRawTrackingPose.address());
    }

    // --- [ VRChaperoneSetup_ExportLiveToBuffer ] ---

    /** {@code bool VRChaperoneSetup_ExportLiveToBuffer(char * pBuffer, uint32_t * pnBufferLength)} */
    public static boolean nVRChaperoneSetup_ExportLiveToBuffer(long pBuffer, long pnBufferLength) {
        long __functionAddress = OpenVR.VRChaperoneSetup.ExportLiveToBuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPZ(pBuffer, pnBufferLength, __functionAddress);
    }

    /** {@code bool VRChaperoneSetup_ExportLiveToBuffer(char * pBuffer, uint32_t * pnBufferLength)} */
    @NativeType("bool")
    public static boolean VRChaperoneSetup_ExportLiveToBuffer(@NativeType("char *") @Nullable ByteBuffer pBuffer, @NativeType("uint32_t *") IntBuffer pnBufferLength) {
        if (CHECKS) {
            check(pnBufferLength, 1);
            checkSafe(pBuffer, pnBufferLength.get(pnBufferLength.position()));
        }
        return nVRChaperoneSetup_ExportLiveToBuffer(memAddressSafe(pBuffer), memAddress(pnBufferLength));
    }

    // --- [ VRChaperoneSetup_ImportFromBufferToWorking ] ---

    /** {@code bool VRChaperoneSetup_ImportFromBufferToWorking(char const * pBuffer, uint32_t nImportFlags)} */
    public static boolean nVRChaperoneSetup_ImportFromBufferToWorking(long pBuffer, int nImportFlags) {
        long __functionAddress = OpenVR.VRChaperoneSetup.ImportFromBufferToWorking;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPZ(pBuffer, nImportFlags, __functionAddress);
    }

    /** {@code bool VRChaperoneSetup_ImportFromBufferToWorking(char const * pBuffer, uint32_t nImportFlags)} */
    @NativeType("bool")
    public static boolean VRChaperoneSetup_ImportFromBufferToWorking(@NativeType("char const *") ByteBuffer pBuffer, @NativeType("uint32_t") int nImportFlags) {
        return nVRChaperoneSetup_ImportFromBufferToWorking(memAddress(pBuffer), nImportFlags);
    }

    // --- [ VRChaperoneSetup_ShowWorkingSetPreview ] ---

    /** {@code void VRChaperoneSetup_ShowWorkingSetPreview(void)} */
    public static void VRChaperoneSetup_ShowWorkingSetPreview() {
        long __functionAddress = OpenVR.VRChaperoneSetup.ShowWorkingSetPreview;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRChaperoneSetup_HideWorkingSetPreview ] ---

    /** {@code void VRChaperoneSetup_HideWorkingSetPreview(void)} */
    public static void VRChaperoneSetup_HideWorkingSetPreview() {
        long __functionAddress = OpenVR.VRChaperoneSetup.HideWorkingSetPreview;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VRChaperoneSetup_RoomSetupStarting ] ---

    /** {@code void VRChaperoneSetup_RoomSetupStarting(void)} */
    public static void VRChaperoneSetup_RoomSetupStarting() {
        long __functionAddress = OpenVR.VRChaperoneSetup.RoomSetupStarting;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class VROverlay {

    static { OpenVR.initialize(); }

    protected VROverlay() {
        throw new UnsupportedOperationException();
    }

    // --- [ VROverlay_FindOverlay ] ---

    /** {@code EVROverlayError VROverlay_FindOverlay(char const * pchOverlayKey, VROverlayHandle_t * pOverlayHandle)} */
    public static int nVROverlay_FindOverlay(long pchOverlayKey, long pOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.FindOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pchOverlayKey, pOverlayHandle, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_FindOverlay(char const * pchOverlayKey, VROverlayHandle_t * pOverlayHandle)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_FindOverlay(@NativeType("char const *") ByteBuffer pchOverlayKey, @NativeType("VROverlayHandle_t *") LongBuffer pOverlayHandle) {
        if (CHECKS) {
            checkNT1(pchOverlayKey);
            check(pOverlayHandle, 1);
        }
        return nVROverlay_FindOverlay(memAddress(pchOverlayKey), memAddress(pOverlayHandle));
    }

    /** {@code EVROverlayError VROverlay_FindOverlay(char const * pchOverlayKey, VROverlayHandle_t * pOverlayHandle)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_FindOverlay(@NativeType("char const *") CharSequence pchOverlayKey, @NativeType("VROverlayHandle_t *") LongBuffer pOverlayHandle) {
        if (CHECKS) {
            check(pOverlayHandle, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchOverlayKey, true);
            long pchOverlayKeyEncoded = stack.getPointerAddress();
            return nVROverlay_FindOverlay(pchOverlayKeyEncoded, memAddress(pOverlayHandle));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_CreateOverlay ] ---

    /** {@code EVROverlayError VROverlay_CreateOverlay(char const * pchOverlayKey, char const * pchOverlayName, VROverlayHandle_t * pOverlayHandle)} */
    public static int nVROverlay_CreateOverlay(long pchOverlayKey, long pchOverlayName, long pOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.CreateOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(pchOverlayKey, pchOverlayName, pOverlayHandle, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_CreateOverlay(char const * pchOverlayKey, char const * pchOverlayName, VROverlayHandle_t * pOverlayHandle)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_CreateOverlay(@NativeType("char const *") ByteBuffer pchOverlayKey, @NativeType("char const *") ByteBuffer pchOverlayName, @NativeType("VROverlayHandle_t *") LongBuffer pOverlayHandle) {
        if (CHECKS) {
            checkNT1(pchOverlayKey);
            checkNT1(pchOverlayName);
            check(pOverlayHandle, 1);
        }
        return nVROverlay_CreateOverlay(memAddress(pchOverlayKey), memAddress(pchOverlayName), memAddress(pOverlayHandle));
    }

    /** {@code EVROverlayError VROverlay_CreateOverlay(char const * pchOverlayKey, char const * pchOverlayName, VROverlayHandle_t * pOverlayHandle)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_CreateOverlay(@NativeType("char const *") CharSequence pchOverlayKey, @NativeType("char const *") CharSequence pchOverlayName, @NativeType("VROverlayHandle_t *") LongBuffer pOverlayHandle) {
        if (CHECKS) {
            check(pOverlayHandle, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchOverlayKey, true);
            long pchOverlayKeyEncoded = stack.getPointerAddress();
            stack.nASCII(pchOverlayName, true);
            long pchOverlayNameEncoded = stack.getPointerAddress();
            return nVROverlay_CreateOverlay(pchOverlayKeyEncoded, pchOverlayNameEncoded, memAddress(pOverlayHandle));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_DestroyOverlay ] ---

    /** {@code EVROverlayError VROverlay_DestroyOverlay(VROverlayHandle_t ulOverlayHandle)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_DestroyOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.DestroyOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayKey ] ---

    /** {@code uint32_t VROverlay_GetOverlayKey(VROverlayHandle_t ulOverlayHandle, char * pchValue, uint32_t unBufferSize, EVROverlayError * pError)} */
    public static int nVROverlay_GetOverlayKey(long ulOverlayHandle, long pchValue, int unBufferSize, long pError) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayKey;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(ulOverlayHandle, pchValue, unBufferSize, pError, __functionAddress);
    }

    /** {@code uint32_t VROverlay_GetOverlayKey(VROverlayHandle_t ulOverlayHandle, char * pchValue, uint32_t unBufferSize, EVROverlayError * pError)} */
    @NativeType("uint32_t")
    public static int VROverlay_GetOverlayKey(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("char *") @Nullable ByteBuffer pchValue, @NativeType("EVROverlayError *") IntBuffer pError) {
        if (CHECKS) {
            check(pError, 1);
        }
        return nVROverlay_GetOverlayKey(ulOverlayHandle, memAddressSafe(pchValue), remainingSafe(pchValue), memAddress(pError));
    }

    /** {@code uint32_t VROverlay_GetOverlayKey(VROverlayHandle_t ulOverlayHandle, char * pchValue, uint32_t unBufferSize, EVROverlayError * pError)} */
    @NativeType("uint32_t")
    public static String VROverlay_GetOverlayKey(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t") int unBufferSize, @NativeType("EVROverlayError *") IntBuffer pError) {
        if (CHECKS) {
            check(pError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchValue = stack.malloc(unBufferSize);
            int __result = nVROverlay_GetOverlayKey(ulOverlayHandle, memAddress(pchValue), unBufferSize, memAddress(pError));
            return memASCII(pchValue, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_GetOverlayName ] ---

    /** {@code uint32_t VROverlay_GetOverlayName(VROverlayHandle_t ulOverlayHandle, char * pchValue, uint32_t unBufferSize, EVROverlayError * pError)} */
    public static int nVROverlay_GetOverlayName(long ulOverlayHandle, long pchValue, int unBufferSize, long pError) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(ulOverlayHandle, pchValue, unBufferSize, pError, __functionAddress);
    }

    /** {@code uint32_t VROverlay_GetOverlayName(VROverlayHandle_t ulOverlayHandle, char * pchValue, uint32_t unBufferSize, EVROverlayError * pError)} */
    @NativeType("uint32_t")
    public static int VROverlay_GetOverlayName(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("char *") @Nullable ByteBuffer pchValue, @NativeType("EVROverlayError *") IntBuffer pError) {
        if (CHECKS) {
            check(pError, 1);
        }
        return nVROverlay_GetOverlayName(ulOverlayHandle, memAddressSafe(pchValue), remainingSafe(pchValue), memAddress(pError));
    }

    /** {@code uint32_t VROverlay_GetOverlayName(VROverlayHandle_t ulOverlayHandle, char * pchValue, uint32_t unBufferSize, EVROverlayError * pError)} */
    @NativeType("uint32_t")
    public static String VROverlay_GetOverlayName(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t") int unBufferSize, @NativeType("EVROverlayError *") IntBuffer pError) {
        if (CHECKS) {
            check(pError, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchValue = stack.malloc(unBufferSize);
            int __result = nVROverlay_GetOverlayName(ulOverlayHandle, memAddress(pchValue), unBufferSize, memAddress(pError));
            return memASCII(pchValue, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_SetOverlayName ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayName(VROverlayHandle_t ulOverlayHandle, char const * pchName)} */
    public static int nVROverlay_SetOverlayName(long ulOverlayHandle, long pchName) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pchName, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_SetOverlayName(VROverlayHandle_t ulOverlayHandle, char const * pchName)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayName(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("char const *") ByteBuffer pchName) {
        if (CHECKS) {
            checkNT1(pchName);
        }
        return nVROverlay_SetOverlayName(ulOverlayHandle, memAddress(pchName));
    }

    /** {@code EVROverlayError VROverlay_SetOverlayName(VROverlayHandle_t ulOverlayHandle, char const * pchName)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayName(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("char const *") CharSequence pchName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchName, true);
            long pchNameEncoded = stack.getPointerAddress();
            return nVROverlay_SetOverlayName(ulOverlayHandle, pchNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_GetOverlayImageData ] ---

    /** {@code EVROverlayError VROverlay_GetOverlayImageData(VROverlayHandle_t ulOverlayHandle, void * pvBuffer, uint32_t unBufferSize, uint32_t * punWidth, uint32_t * punHeight)} */
    public static int nVROverlay_GetOverlayImageData(long ulOverlayHandle, long pvBuffer, int unBufferSize, long punWidth, long punHeight) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayImageData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPPI(ulOverlayHandle, pvBuffer, unBufferSize, punWidth, punHeight, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetOverlayImageData(VROverlayHandle_t ulOverlayHandle, void * pvBuffer, uint32_t unBufferSize, uint32_t * punWidth, uint32_t * punHeight)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayImageData(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("void *") ByteBuffer pvBuffer, @NativeType("uint32_t *") IntBuffer punWidth, @NativeType("uint32_t *") IntBuffer punHeight) {
        if (CHECKS) {
            check(punWidth, 1);
            check(punHeight, 1);
        }
        return nVROverlay_GetOverlayImageData(ulOverlayHandle, memAddress(pvBuffer), pvBuffer.remaining(), memAddress(punWidth), memAddress(punHeight));
    }

    // --- [ VROverlay_GetOverlayErrorNameFromEnum ] ---

    /** {@code char const * VROverlay_GetOverlayErrorNameFromEnum(EVROverlayError error)} */
    public static long nVROverlay_GetOverlayErrorNameFromEnum(int error) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayErrorNameFromEnum;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(error, __functionAddress);
    }

    /** {@code char const * VROverlay_GetOverlayErrorNameFromEnum(EVROverlayError error)} */
    @NativeType("char const *")
    public static @Nullable String VROverlay_GetOverlayErrorNameFromEnum(@NativeType("EVROverlayError") int error) {
        long __result = nVROverlay_GetOverlayErrorNameFromEnum(error);
        return memASCIISafe(__result);
    }

    // --- [ VROverlay_SetOverlayRenderingPid ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayRenderingPid(VROverlayHandle_t ulOverlayHandle, uint32_t unPID)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayRenderingPid(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t") int unPID) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayRenderingPid;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, unPID, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayRenderingPid ] ---

    /** {@code uint32_t VROverlay_GetOverlayRenderingPid(VROverlayHandle_t ulOverlayHandle)} */
    @NativeType("uint32_t")
    public static int VROverlay_GetOverlayRenderingPid(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayRenderingPid;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, __functionAddress);
    }

    // --- [ VROverlay_SetOverlayFlag ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayFlag(VROverlayHandle_t ulOverlayHandle, VROverlayFlags eOverlayFlag, bool bEnabled)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayFlag(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayFlags") int eOverlayFlag, @NativeType("bool") boolean bEnabled) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayFlag;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, eOverlayFlag, bEnabled, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayFlag ] ---

    /** {@code EVROverlayError VROverlay_GetOverlayFlag(VROverlayHandle_t ulOverlayHandle, VROverlayFlags eOverlayFlag, bool * pbEnabled)} */
    public static int nVROverlay_GetOverlayFlag(long ulOverlayHandle, int eOverlayFlag, long pbEnabled) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayFlag;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, eOverlayFlag, pbEnabled, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetOverlayFlag(VROverlayHandle_t ulOverlayHandle, VROverlayFlags eOverlayFlag, bool * pbEnabled)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayFlag(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayFlags") int eOverlayFlag, @NativeType("bool *") ByteBuffer pbEnabled) {
        if (CHECKS) {
            check(pbEnabled, 1);
        }
        return nVROverlay_GetOverlayFlag(ulOverlayHandle, eOverlayFlag, memAddress(pbEnabled));
    }

    // --- [ VROverlay_GetOverlayFlags ] ---

    /** {@code EVROverlayError VROverlay_GetOverlayFlags(VROverlayHandle_t ulOverlayHandle, uint32_t * pFlags)} */
    public static int nVROverlay_GetOverlayFlags(long ulOverlayHandle, long pFlags) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayFlags;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pFlags, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetOverlayFlags(VROverlayHandle_t ulOverlayHandle, uint32_t * pFlags)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayFlags(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t *") IntBuffer pFlags) {
        if (CHECKS) {
            check(pFlags, 1);
        }
        return nVROverlay_GetOverlayFlags(ulOverlayHandle, memAddress(pFlags));
    }

    // --- [ VROverlay_SetOverlayColor ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayColor(VROverlayHandle_t ulOverlayHandle, float fRed, float fGreen, float fBlue)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayColor(@NativeType("VROverlayHandle_t") long ulOverlayHandle, float fRed, float fGreen, float fBlue) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayColor;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, fRed, fGreen, fBlue, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayColor ] ---

    /** {@code EVROverlayError VROverlay_GetOverlayColor(VROverlayHandle_t ulOverlayHandle, float * pfRed, float * pfGreen, float * pfBlue)} */
    public static int nVROverlay_GetOverlayColor(long ulOverlayHandle, long pfRed, long pfGreen, long pfBlue) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayColor;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPPI(ulOverlayHandle, pfRed, pfGreen, pfBlue, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetOverlayColor(VROverlayHandle_t ulOverlayHandle, float * pfRed, float * pfGreen, float * pfBlue)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayColor(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("float *") FloatBuffer pfRed, @NativeType("float *") FloatBuffer pfGreen, @NativeType("float *") FloatBuffer pfBlue) {
        if (CHECKS) {
            check(pfRed, 1);
            check(pfGreen, 1);
            check(pfBlue, 1);
        }
        return nVROverlay_GetOverlayColor(ulOverlayHandle, memAddress(pfRed), memAddress(pfGreen), memAddress(pfBlue));
    }

    // --- [ VROverlay_SetOverlayAlpha ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayAlpha(VROverlayHandle_t ulOverlayHandle, float fAlpha)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayAlpha(@NativeType("VROverlayHandle_t") long ulOverlayHandle, float fAlpha) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayAlpha;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, fAlpha, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayAlpha ] ---

    /** {@code EVROverlayError VROverlay_GetOverlayAlpha(VROverlayHandle_t ulOverlayHandle, float * pfAlpha)} */
    public static int nVROverlay_GetOverlayAlpha(long ulOverlayHandle, long pfAlpha) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayAlpha;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pfAlpha, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetOverlayAlpha(VROverlayHandle_t ulOverlayHandle, float * pfAlpha)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayAlpha(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("float *") FloatBuffer pfAlpha) {
        if (CHECKS) {
            check(pfAlpha, 1);
        }
        return nVROverlay_GetOverlayAlpha(ulOverlayHandle, memAddress(pfAlpha));
    }

    // --- [ VROverlay_SetOverlayTexelAspect ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayTexelAspect(VROverlayHandle_t ulOverlayHandle, float fTexelAspect)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTexelAspect(@NativeType("VROverlayHandle_t") long ulOverlayHandle, float fTexelAspect) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTexelAspect;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, fTexelAspect, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayTexelAspect ] ---

    /** {@code EVROverlayError VROverlay_GetOverlayTexelAspect(VROverlayHandle_t ulOverlayHandle, float * pfTexelAspect)} */
    public static int nVROverlay_GetOverlayTexelAspect(long ulOverlayHandle, long pfTexelAspect) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTexelAspect;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pfTexelAspect, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetOverlayTexelAspect(VROverlayHandle_t ulOverlayHandle, float * pfTexelAspect)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTexelAspect(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("float *") FloatBuffer pfTexelAspect) {
        if (CHECKS) {
            check(pfTexelAspect, 1);
        }
        return nVROverlay_GetOverlayTexelAspect(ulOverlayHandle, memAddress(pfTexelAspect));
    }

    // --- [ VROverlay_SetOverlaySortOrder ] ---

    /** {@code EVROverlayError VROverlay_SetOverlaySortOrder(VROverlayHandle_t ulOverlayHandle, uint32_t unSortOrder)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlaySortOrder(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t") int unSortOrder) {
        long __functionAddress = OpenVR.VROverlay.SetOverlaySortOrder;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, unSortOrder, __functionAddress);
    }

    // --- [ VROverlay_GetOverlaySortOrder ] ---

    /** {@code EVROverlayError VROverlay_GetOverlaySortOrder(VROverlayHandle_t ulOverlayHandle, uint32_t * punSortOrder)} */
    public static int nVROverlay_GetOverlaySortOrder(long ulOverlayHandle, long punSortOrder) {
        long __functionAddress = OpenVR.VROverlay.GetOverlaySortOrder;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, punSortOrder, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetOverlaySortOrder(VROverlayHandle_t ulOverlayHandle, uint32_t * punSortOrder)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlaySortOrder(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t *") IntBuffer punSortOrder) {
        if (CHECKS) {
            check(punSortOrder, 1);
        }
        return nVROverlay_GetOverlaySortOrder(ulOverlayHandle, memAddress(punSortOrder));
    }

    // --- [ VROverlay_SetOverlayWidthInMeters ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayWidthInMeters(VROverlayHandle_t ulOverlayHandle, float fWidthInMeters)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayWidthInMeters(@NativeType("VROverlayHandle_t") long ulOverlayHandle, float fWidthInMeters) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayWidthInMeters;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, fWidthInMeters, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayWidthInMeters ] ---

    /** {@code EVROverlayError VROverlay_GetOverlayWidthInMeters(VROverlayHandle_t ulOverlayHandle, float * pfWidthInMeters)} */
    public static int nVROverlay_GetOverlayWidthInMeters(long ulOverlayHandle, long pfWidthInMeters) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayWidthInMeters;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pfWidthInMeters, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetOverlayWidthInMeters(VROverlayHandle_t ulOverlayHandle, float * pfWidthInMeters)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayWidthInMeters(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("float *") FloatBuffer pfWidthInMeters) {
        if (CHECKS) {
            check(pfWidthInMeters, 1);
        }
        return nVROverlay_GetOverlayWidthInMeters(ulOverlayHandle, memAddress(pfWidthInMeters));
    }

    // --- [ VROverlay_SetOverlayCurvature ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayCurvature(VROverlayHandle_t ulOverlayHandle, float fCurvature)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayCurvature(@NativeType("VROverlayHandle_t") long ulOverlayHandle, float fCurvature) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayCurvature;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, fCurvature, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayCurvature ] ---

    /** {@code EVROverlayError VROverlay_GetOverlayCurvature(VROverlayHandle_t ulOverlayHandle, float * pfCurvature)} */
    public static int nVROverlay_GetOverlayCurvature(long ulOverlayHandle, long pfCurvature) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayCurvature;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pfCurvature, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetOverlayCurvature(VROverlayHandle_t ulOverlayHandle, float * pfCurvature)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayCurvature(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("float *") FloatBuffer pfCurvature) {
        if (CHECKS) {
            check(pfCurvature, 1);
        }
        return nVROverlay_GetOverlayCurvature(ulOverlayHandle, memAddress(pfCurvature));
    }

    // --- [ VROverlay_SetOverlayPreCurvePitch ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayPreCurvePitch(VROverlayHandle_t ulOverlayHandle, float fRadians)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayPreCurvePitch(@NativeType("VROverlayHandle_t") long ulOverlayHandle, float fRadians) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayPreCurvePitch;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, fRadians, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayPreCurvePitch ] ---

    /** {@code EVROverlayError VROverlay_GetOverlayPreCurvePitch(VROverlayHandle_t ulOverlayHandle, float * pfRadians)} */
    public static int nVROverlay_GetOverlayPreCurvePitch(long ulOverlayHandle, long pfRadians) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayPreCurvePitch;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pfRadians, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetOverlayPreCurvePitch(VROverlayHandle_t ulOverlayHandle, float * pfRadians)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayPreCurvePitch(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("float *") FloatBuffer pfRadians) {
        if (CHECKS) {
            check(pfRadians, 1);
        }
        return nVROverlay_GetOverlayPreCurvePitch(ulOverlayHandle, memAddress(pfRadians));
    }

    // --- [ VROverlay_SetOverlayTextureColorSpace ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayTextureColorSpace(VROverlayHandle_t ulOverlayHandle, EColorSpace eTextureColorSpace)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTextureColorSpace(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("EColorSpace") int eTextureColorSpace) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTextureColorSpace;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, eTextureColorSpace, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayTextureColorSpace ] ---

    /** {@code EVROverlayError VROverlay_GetOverlayTextureColorSpace(VROverlayHandle_t ulOverlayHandle, EColorSpace * peTextureColorSpace)} */
    public static int nVROverlay_GetOverlayTextureColorSpace(long ulOverlayHandle, long peTextureColorSpace) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTextureColorSpace;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, peTextureColorSpace, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetOverlayTextureColorSpace(VROverlayHandle_t ulOverlayHandle, EColorSpace * peTextureColorSpace)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTextureColorSpace(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("EColorSpace *") IntBuffer peTextureColorSpace) {
        if (CHECKS) {
            check(peTextureColorSpace, 1);
        }
        return nVROverlay_GetOverlayTextureColorSpace(ulOverlayHandle, memAddress(peTextureColorSpace));
    }

    // --- [ VROverlay_SetOverlayTextureBounds ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayTextureBounds(VROverlayHandle_t ulOverlayHandle, VRTextureBounds_t const * pOverlayTextureBounds)} */
    public static int nVROverlay_SetOverlayTextureBounds(long ulOverlayHandle, long pOverlayTextureBounds) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTextureBounds;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pOverlayTextureBounds, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_SetOverlayTextureBounds(VROverlayHandle_t ulOverlayHandle, VRTextureBounds_t const * pOverlayTextureBounds)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTextureBounds(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VRTextureBounds_t const *") VRTextureBounds pOverlayTextureBounds) {
        return nVROverlay_SetOverlayTextureBounds(ulOverlayHandle, pOverlayTextureBounds.address());
    }

    // --- [ VROverlay_GetOverlayTextureBounds ] ---

    /** {@code EVROverlayError VROverlay_GetOverlayTextureBounds(VROverlayHandle_t ulOverlayHandle, VRTextureBounds_t * pOverlayTextureBounds)} */
    public static int nVROverlay_GetOverlayTextureBounds(long ulOverlayHandle, long pOverlayTextureBounds) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTextureBounds;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pOverlayTextureBounds, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetOverlayTextureBounds(VROverlayHandle_t ulOverlayHandle, VRTextureBounds_t * pOverlayTextureBounds)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTextureBounds(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VRTextureBounds_t *") VRTextureBounds pOverlayTextureBounds) {
        return nVROverlay_GetOverlayTextureBounds(ulOverlayHandle, pOverlayTextureBounds.address());
    }

    // --- [ VROverlay_GetOverlayTransformType ] ---

    /** {@code EVROverlayError VROverlay_GetOverlayTransformType(VROverlayHandle_t ulOverlayHandle, VROverlayTransformType * peTransformType)} */
    public static int nVROverlay_GetOverlayTransformType(long ulOverlayHandle, long peTransformType) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTransformType;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, peTransformType, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetOverlayTransformType(VROverlayHandle_t ulOverlayHandle, VROverlayTransformType * peTransformType)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTransformType(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayTransformType *") IntBuffer peTransformType) {
        if (CHECKS) {
            check(peTransformType, 1);
        }
        return nVROverlay_GetOverlayTransformType(ulOverlayHandle, memAddress(peTransformType));
    }

    // --- [ VROverlay_SetOverlayTransformAbsolute ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayTransformAbsolute(VROverlayHandle_t ulOverlayHandle, ETrackingUniverseOrigin eTrackingOrigin, HmdMatrix34_t const * pmatTrackingOriginToOverlayTransform)} */
    public static int nVROverlay_SetOverlayTransformAbsolute(long ulOverlayHandle, int eTrackingOrigin, long pmatTrackingOriginToOverlayTransform) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTransformAbsolute;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, eTrackingOrigin, pmatTrackingOriginToOverlayTransform, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_SetOverlayTransformAbsolute(VROverlayHandle_t ulOverlayHandle, ETrackingUniverseOrigin eTrackingOrigin, HmdMatrix34_t const * pmatTrackingOriginToOverlayTransform)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTransformAbsolute(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("ETrackingUniverseOrigin") int eTrackingOrigin, @NativeType("HmdMatrix34_t const *") HmdMatrix34 pmatTrackingOriginToOverlayTransform) {
        return nVROverlay_SetOverlayTransformAbsolute(ulOverlayHandle, eTrackingOrigin, pmatTrackingOriginToOverlayTransform.address());
    }

    // --- [ VROverlay_GetOverlayTransformAbsolute ] ---

    /** {@code EVROverlayError VROverlay_GetOverlayTransformAbsolute(VROverlayHandle_t ulOverlayHandle, ETrackingUniverseOrigin * peTrackingOrigin, HmdMatrix34_t * pmatTrackingOriginToOverlayTransform)} */
    public static int nVROverlay_GetOverlayTransformAbsolute(long ulOverlayHandle, long peTrackingOrigin, long pmatTrackingOriginToOverlayTransform) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTransformAbsolute;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(ulOverlayHandle, peTrackingOrigin, pmatTrackingOriginToOverlayTransform, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetOverlayTransformAbsolute(VROverlayHandle_t ulOverlayHandle, ETrackingUniverseOrigin * peTrackingOrigin, HmdMatrix34_t * pmatTrackingOriginToOverlayTransform)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTransformAbsolute(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("ETrackingUniverseOrigin *") IntBuffer peTrackingOrigin, @NativeType("HmdMatrix34_t *") HmdMatrix34 pmatTrackingOriginToOverlayTransform) {
        if (CHECKS) {
            check(peTrackingOrigin, 1);
        }
        return nVROverlay_GetOverlayTransformAbsolute(ulOverlayHandle, memAddress(peTrackingOrigin), pmatTrackingOriginToOverlayTransform.address());
    }

    // --- [ VROverlay_SetOverlayTransformTrackedDeviceRelative ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayTransformTrackedDeviceRelative(VROverlayHandle_t ulOverlayHandle, TrackedDeviceIndex_t unTrackedDevice, HmdMatrix34_t const * pmatTrackedDeviceToOverlayTransform)} */
    public static int nVROverlay_SetOverlayTransformTrackedDeviceRelative(long ulOverlayHandle, int unTrackedDevice, long pmatTrackedDeviceToOverlayTransform) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTransformTrackedDeviceRelative;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, unTrackedDevice, pmatTrackedDeviceToOverlayTransform, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_SetOverlayTransformTrackedDeviceRelative(VROverlayHandle_t ulOverlayHandle, TrackedDeviceIndex_t unTrackedDevice, HmdMatrix34_t const * pmatTrackedDeviceToOverlayTransform)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTransformTrackedDeviceRelative(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("TrackedDeviceIndex_t") int unTrackedDevice, @NativeType("HmdMatrix34_t const *") HmdMatrix34 pmatTrackedDeviceToOverlayTransform) {
        return nVROverlay_SetOverlayTransformTrackedDeviceRelative(ulOverlayHandle, unTrackedDevice, pmatTrackedDeviceToOverlayTransform.address());
    }

    // --- [ VROverlay_GetOverlayTransformTrackedDeviceRelative ] ---

    /** {@code EVROverlayError VROverlay_GetOverlayTransformTrackedDeviceRelative(VROverlayHandle_t ulOverlayHandle, TrackedDeviceIndex_t * punTrackedDevice, HmdMatrix34_t * pmatTrackedDeviceToOverlayTransform)} */
    public static int nVROverlay_GetOverlayTransformTrackedDeviceRelative(long ulOverlayHandle, long punTrackedDevice, long pmatTrackedDeviceToOverlayTransform) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTransformTrackedDeviceRelative;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(ulOverlayHandle, punTrackedDevice, pmatTrackedDeviceToOverlayTransform, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetOverlayTransformTrackedDeviceRelative(VROverlayHandle_t ulOverlayHandle, TrackedDeviceIndex_t * punTrackedDevice, HmdMatrix34_t * pmatTrackedDeviceToOverlayTransform)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTransformTrackedDeviceRelative(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("TrackedDeviceIndex_t *") IntBuffer punTrackedDevice, @NativeType("HmdMatrix34_t *") HmdMatrix34 pmatTrackedDeviceToOverlayTransform) {
        if (CHECKS) {
            check(punTrackedDevice, 1);
        }
        return nVROverlay_GetOverlayTransformTrackedDeviceRelative(ulOverlayHandle, memAddress(punTrackedDevice), pmatTrackedDeviceToOverlayTransform.address());
    }

    // --- [ VROverlay_SetOverlayTransformTrackedDeviceComponent ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayTransformTrackedDeviceComponent(VROverlayHandle_t ulOverlayHandle, TrackedDeviceIndex_t unDeviceIndex, char const * pchComponentName)} */
    public static int nVROverlay_SetOverlayTransformTrackedDeviceComponent(long ulOverlayHandle, int unDeviceIndex, long pchComponentName) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTransformTrackedDeviceComponent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, unDeviceIndex, pchComponentName, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_SetOverlayTransformTrackedDeviceComponent(VROverlayHandle_t ulOverlayHandle, TrackedDeviceIndex_t unDeviceIndex, char const * pchComponentName)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTransformTrackedDeviceComponent(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("char const *") ByteBuffer pchComponentName) {
        if (CHECKS) {
            checkNT1(pchComponentName);
        }
        return nVROverlay_SetOverlayTransformTrackedDeviceComponent(ulOverlayHandle, unDeviceIndex, memAddress(pchComponentName));
    }

    /** {@code EVROverlayError VROverlay_SetOverlayTransformTrackedDeviceComponent(VROverlayHandle_t ulOverlayHandle, TrackedDeviceIndex_t unDeviceIndex, char const * pchComponentName)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTransformTrackedDeviceComponent(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("char const *") CharSequence pchComponentName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchComponentName, true);
            long pchComponentNameEncoded = stack.getPointerAddress();
            return nVROverlay_SetOverlayTransformTrackedDeviceComponent(ulOverlayHandle, unDeviceIndex, pchComponentNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_GetOverlayTransformTrackedDeviceComponent ] ---

    /** {@code EVROverlayError VROverlay_GetOverlayTransformTrackedDeviceComponent(VROverlayHandle_t ulOverlayHandle, TrackedDeviceIndex_t * punDeviceIndex, char * pchComponentName, uint32_t unComponentNameSize)} */
    public static int nVROverlay_GetOverlayTransformTrackedDeviceComponent(long ulOverlayHandle, long punDeviceIndex, long pchComponentName, int unComponentNameSize) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTransformTrackedDeviceComponent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(ulOverlayHandle, punDeviceIndex, pchComponentName, unComponentNameSize, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetOverlayTransformTrackedDeviceComponent(VROverlayHandle_t ulOverlayHandle, TrackedDeviceIndex_t * punDeviceIndex, char * pchComponentName, uint32_t unComponentNameSize)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTransformTrackedDeviceComponent(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("TrackedDeviceIndex_t *") IntBuffer punDeviceIndex, @NativeType("char *") ByteBuffer pchComponentName) {
        if (CHECKS) {
            check(punDeviceIndex, 1);
        }
        return nVROverlay_GetOverlayTransformTrackedDeviceComponent(ulOverlayHandle, memAddress(punDeviceIndex), memAddress(pchComponentName), pchComponentName.remaining());
    }

    // --- [ VROverlay_SetOverlayTransformCursor ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayTransformCursor(VROverlayHandle_t ulCursorOverlayHandle, HmdVector2_t const * pvHotspot)} */
    public static int nVROverlay_SetOverlayTransformCursor(long ulCursorOverlayHandle, long pvHotspot) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTransformCursor;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulCursorOverlayHandle, pvHotspot, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_SetOverlayTransformCursor(VROverlayHandle_t ulCursorOverlayHandle, HmdVector2_t const * pvHotspot)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTransformCursor(@NativeType("VROverlayHandle_t") long ulCursorOverlayHandle, @NativeType("HmdVector2_t const *") HmdVector2 pvHotspot) {
        return nVROverlay_SetOverlayTransformCursor(ulCursorOverlayHandle, pvHotspot.address());
    }

    // --- [ VROverlay_GetOverlayTransformCursor ] ---

    /** {@code EVROverlayError VROverlay_GetOverlayTransformCursor(VROverlayHandle_t ulOverlayHandle, HmdVector2_t * pvHotspot)} */
    public static int nVROverlay_GetOverlayTransformCursor(long ulOverlayHandle, long pvHotspot) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTransformCursor;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pvHotspot, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetOverlayTransformCursor(VROverlayHandle_t ulOverlayHandle, HmdVector2_t * pvHotspot)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTransformCursor(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("HmdVector2_t *") HmdVector2 pvHotspot) {
        return nVROverlay_GetOverlayTransformCursor(ulOverlayHandle, pvHotspot.address());
    }

    // --- [ VROverlay_SetOverlayTransformProjection ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayTransformProjection(VROverlayHandle_t ulOverlayHandle, ETrackingUniverseOrigin eTrackingOrigin, HmdMatrix34_t * pmatTrackingOriginToOverlayTransform, VROverlayProjection_t * pProjection, EVREye eEye)} */
    public static int nVROverlay_SetOverlayTransformProjection(long ulOverlayHandle, int eTrackingOrigin, long pmatTrackingOriginToOverlayTransform, long pProjection, int eEye) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTransformProjection;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(ulOverlayHandle, eTrackingOrigin, pmatTrackingOriginToOverlayTransform, pProjection, eEye, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_SetOverlayTransformProjection(VROverlayHandle_t ulOverlayHandle, ETrackingUniverseOrigin eTrackingOrigin, HmdMatrix34_t * pmatTrackingOriginToOverlayTransform, VROverlayProjection_t * pProjection, EVREye eEye)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTransformProjection(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("ETrackingUniverseOrigin") int eTrackingOrigin, @NativeType("HmdMatrix34_t *") HmdMatrix34 pmatTrackingOriginToOverlayTransform, @NativeType("VROverlayProjection_t *") VROverlayProjection pProjection, @NativeType("EVREye") int eEye) {
        return nVROverlay_SetOverlayTransformProjection(ulOverlayHandle, eTrackingOrigin, pmatTrackingOriginToOverlayTransform.address(), pProjection.address(), eEye);
    }

    // --- [ VROverlay_ShowOverlay ] ---

    /** {@code EVROverlayError VROverlay_ShowOverlay(VROverlayHandle_t ulOverlayHandle)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_ShowOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.ShowOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, __functionAddress);
    }

    // --- [ VROverlay_HideOverlay ] ---

    /** {@code EVROverlayError VROverlay_HideOverlay(VROverlayHandle_t ulOverlayHandle)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_HideOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.HideOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, __functionAddress);
    }

    // --- [ VROverlay_IsOverlayVisible ] ---

    /** {@code bool VROverlay_IsOverlayVisible(VROverlayHandle_t ulOverlayHandle)} */
    @NativeType("bool")
    public static boolean VROverlay_IsOverlayVisible(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.IsOverlayVisible;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJZ(ulOverlayHandle, __functionAddress);
    }

    // --- [ VROverlay_GetTransformForOverlayCoordinates ] ---

    /** {@code EVROverlayError VROverlay_GetTransformForOverlayCoordinates(VROverlayHandle_t ulOverlayHandle, ETrackingUniverseOrigin eTrackingOrigin, HmdVector2_t coordinatesInOverlay, HmdMatrix34_t * pmatTransform)} */
    public static native int nVROverlay_GetTransformForOverlayCoordinates(long ulOverlayHandle, int eTrackingOrigin, long coordinatesInOverlay, long pmatTransform, long __functionAddress);

    /** {@code EVROverlayError VROverlay_GetTransformForOverlayCoordinates(VROverlayHandle_t ulOverlayHandle, ETrackingUniverseOrigin eTrackingOrigin, HmdVector2_t coordinatesInOverlay, HmdMatrix34_t * pmatTransform)} */
    public static int nVROverlay_GetTransformForOverlayCoordinates(long ulOverlayHandle, int eTrackingOrigin, long coordinatesInOverlay, long pmatTransform) {
        long __functionAddress = OpenVR.VROverlay.GetTransformForOverlayCoordinates;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nVROverlay_GetTransformForOverlayCoordinates(ulOverlayHandle, eTrackingOrigin, coordinatesInOverlay, pmatTransform, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetTransformForOverlayCoordinates(VROverlayHandle_t ulOverlayHandle, ETrackingUniverseOrigin eTrackingOrigin, HmdVector2_t coordinatesInOverlay, HmdMatrix34_t * pmatTransform)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetTransformForOverlayCoordinates(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("ETrackingUniverseOrigin") int eTrackingOrigin, @NativeType("HmdVector2_t") HmdVector2 coordinatesInOverlay, @NativeType("HmdMatrix34_t *") HmdMatrix34 pmatTransform) {
        return nVROverlay_GetTransformForOverlayCoordinates(ulOverlayHandle, eTrackingOrigin, coordinatesInOverlay.address(), pmatTransform.address());
    }

    // --- [ VROverlay_WaitFrameSync ] ---

    /** {@code EVROverlayError VROverlay_WaitFrameSync(uint32_t nTimeoutMs)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_WaitFrameSync(@NativeType("uint32_t") int nTimeoutMs) {
        long __functionAddress = OpenVR.VROverlay.WaitFrameSync;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(nTimeoutMs, __functionAddress);
    }

    // --- [ VROverlay_PollNextOverlayEvent ] ---

    /** {@code bool VROverlay_PollNextOverlayEvent(VROverlayHandle_t ulOverlayHandle, VREvent_t * pEvent, uint32_t uncbVREvent)} */
    public static boolean nVROverlay_PollNextOverlayEvent(long ulOverlayHandle, long pEvent, int uncbVREvent) {
        long __functionAddress = OpenVR.VROverlay.PollNextOverlayEvent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPZ(ulOverlayHandle, pEvent, uncbVREvent, __functionAddress);
    }

    /** {@code bool VROverlay_PollNextOverlayEvent(VROverlayHandle_t ulOverlayHandle, VREvent_t * pEvent, uint32_t uncbVREvent)} */
    @NativeType("bool")
    public static boolean VROverlay_PollNextOverlayEvent(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VREvent_t *") VREvent pEvent, @NativeType("uint32_t") int uncbVREvent) {
        return nVROverlay_PollNextOverlayEvent(ulOverlayHandle, pEvent.address(), uncbVREvent);
    }

    /** {@code bool VROverlay_PollNextOverlayEvent(VROverlayHandle_t ulOverlayHandle, VREvent_t * pEvent, uint32_t uncbVREvent)} */
    @NativeType("bool")
    public static boolean VROverlay_PollNextOverlayEvent(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VREvent_t *") VREvent pEvent) {
        return nVROverlay_PollNextOverlayEvent(ulOverlayHandle, pEvent.address(), VREvent.SIZEOF);
    }

    // --- [ VROverlay_GetOverlayInputMethod ] ---

    /** {@code EVROverlayError VROverlay_GetOverlayInputMethod(VROverlayHandle_t ulOverlayHandle, VROverlayInputMethod * peInputMethod)} */
    public static int nVROverlay_GetOverlayInputMethod(long ulOverlayHandle, long peInputMethod) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayInputMethod;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, peInputMethod, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetOverlayInputMethod(VROverlayHandle_t ulOverlayHandle, VROverlayInputMethod * peInputMethod)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayInputMethod(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayInputMethod *") IntBuffer peInputMethod) {
        if (CHECKS) {
            check(peInputMethod, 1);
        }
        return nVROverlay_GetOverlayInputMethod(ulOverlayHandle, memAddress(peInputMethod));
    }

    // --- [ VROverlay_SetOverlayInputMethod ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayInputMethod(VROverlayHandle_t ulOverlayHandle, VROverlayInputMethod eInputMethod)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayInputMethod(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayInputMethod") int eInputMethod) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayInputMethod;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, eInputMethod, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayMouseScale ] ---

    /** {@code EVROverlayError VROverlay_GetOverlayMouseScale(VROverlayHandle_t ulOverlayHandle, HmdVector2_t * pvecMouseScale)} */
    public static int nVROverlay_GetOverlayMouseScale(long ulOverlayHandle, long pvecMouseScale) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayMouseScale;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pvecMouseScale, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetOverlayMouseScale(VROverlayHandle_t ulOverlayHandle, HmdVector2_t * pvecMouseScale)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayMouseScale(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("HmdVector2_t *") HmdVector2 pvecMouseScale) {
        return nVROverlay_GetOverlayMouseScale(ulOverlayHandle, pvecMouseScale.address());
    }

    // --- [ VROverlay_SetOverlayMouseScale ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayMouseScale(VROverlayHandle_t ulOverlayHandle, HmdVector2_t const * pvecMouseScale)} */
    public static int nVROverlay_SetOverlayMouseScale(long ulOverlayHandle, long pvecMouseScale) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayMouseScale;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pvecMouseScale, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_SetOverlayMouseScale(VROverlayHandle_t ulOverlayHandle, HmdVector2_t const * pvecMouseScale)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayMouseScale(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("HmdVector2_t const *") HmdVector2 pvecMouseScale) {
        return nVROverlay_SetOverlayMouseScale(ulOverlayHandle, pvecMouseScale.address());
    }

    // --- [ VROverlay_ComputeOverlayIntersection ] ---

    /** {@code bool VROverlay_ComputeOverlayIntersection(VROverlayHandle_t ulOverlayHandle, VROverlayIntersectionParams_t const * pParams, VROverlayIntersectionResults_t * pResults)} */
    public static boolean nVROverlay_ComputeOverlayIntersection(long ulOverlayHandle, long pParams, long pResults) {
        long __functionAddress = OpenVR.VROverlay.ComputeOverlayIntersection;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPZ(ulOverlayHandle, pParams, pResults, __functionAddress);
    }

    /** {@code bool VROverlay_ComputeOverlayIntersection(VROverlayHandle_t ulOverlayHandle, VROverlayIntersectionParams_t const * pParams, VROverlayIntersectionResults_t * pResults)} */
    @NativeType("bool")
    public static boolean VROverlay_ComputeOverlayIntersection(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayIntersectionParams_t const *") VROverlayIntersectionParams pParams, @NativeType("VROverlayIntersectionResults_t *") VROverlayIntersectionResults pResults) {
        return nVROverlay_ComputeOverlayIntersection(ulOverlayHandle, pParams.address(), pResults.address());
    }

    // --- [ VROverlay_IsHoverTargetOverlay ] ---

    /** {@code bool VROverlay_IsHoverTargetOverlay(VROverlayHandle_t ulOverlayHandle)} */
    @NativeType("bool")
    public static boolean VROverlay_IsHoverTargetOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.IsHoverTargetOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJZ(ulOverlayHandle, __functionAddress);
    }

    // --- [ VROverlay_SetOverlayIntersectionMask ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayIntersectionMask(VROverlayHandle_t ulOverlayHandle, VROverlayIntersectionMaskPrimitive_t * pMaskPrimitives, uint32_t unNumMaskPrimitives, uint32_t unPrimitiveSize)} */
    public static int nVROverlay_SetOverlayIntersectionMask(long ulOverlayHandle, long pMaskPrimitives, int unNumMaskPrimitives, int unPrimitiveSize) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayIntersectionMask;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pMaskPrimitives, unNumMaskPrimitives, unPrimitiveSize, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_SetOverlayIntersectionMask(VROverlayHandle_t ulOverlayHandle, VROverlayIntersectionMaskPrimitive_t * pMaskPrimitives, uint32_t unNumMaskPrimitives, uint32_t unPrimitiveSize)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayIntersectionMask(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayIntersectionMaskPrimitive_t *") VROverlayIntersectionMaskPrimitive.Buffer pMaskPrimitives) {
        return nVROverlay_SetOverlayIntersectionMask(ulOverlayHandle, pMaskPrimitives.address(), pMaskPrimitives.remaining(), VROverlayIntersectionMaskPrimitive.SIZEOF);
    }

    // --- [ VROverlay_TriggerLaserMouseHapticVibration ] ---

    /** {@code EVROverlayError VROverlay_TriggerLaserMouseHapticVibration(VROverlayHandle_t ulOverlayHandle, float fDurationSeconds, float fFrequency, float fAmplitude)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_TriggerLaserMouseHapticVibration(@NativeType("VROverlayHandle_t") long ulOverlayHandle, float fDurationSeconds, float fFrequency, float fAmplitude) {
        long __functionAddress = OpenVR.VROverlay.TriggerLaserMouseHapticVibration;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, fDurationSeconds, fFrequency, fAmplitude, __functionAddress);
    }

    // --- [ VROverlay_SetOverlayCursor ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayCursor(VROverlayHandle_t ulOverlayHandle, VROverlayHandle_t ulCursorHandle)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayCursor(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayHandle_t") long ulCursorHandle) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayCursor;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJJI(ulOverlayHandle, ulCursorHandle, __functionAddress);
    }

    // --- [ VROverlay_SetOverlayCursorPositionOverride ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayCursorPositionOverride(VROverlayHandle_t ulOverlayHandle, HmdVector2_t const * pvCursor)} */
    public static int nVROverlay_SetOverlayCursorPositionOverride(long ulOverlayHandle, long pvCursor) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayCursorPositionOverride;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pvCursor, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_SetOverlayCursorPositionOverride(VROverlayHandle_t ulOverlayHandle, HmdVector2_t const * pvCursor)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayCursorPositionOverride(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("HmdVector2_t const *") HmdVector2 pvCursor) {
        return nVROverlay_SetOverlayCursorPositionOverride(ulOverlayHandle, pvCursor.address());
    }

    // --- [ VROverlay_ClearOverlayCursorPositionOverride ] ---

    /** {@code EVROverlayError VROverlay_ClearOverlayCursorPositionOverride(VROverlayHandle_t ulOverlayHandle)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_ClearOverlayCursorPositionOverride(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.ClearOverlayCursorPositionOverride;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, __functionAddress);
    }

    // --- [ VROverlay_SetOverlayTexture ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayTexture(VROverlayHandle_t ulOverlayHandle, Texture_t const * pTexture)} */
    public static int nVROverlay_SetOverlayTexture(long ulOverlayHandle, long pTexture) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTexture;
        if (CHECKS) {
            check(__functionAddress);
            Texture.validate(pTexture);
        }
        return callJPI(ulOverlayHandle, pTexture, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_SetOverlayTexture(VROverlayHandle_t ulOverlayHandle, Texture_t const * pTexture)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTexture(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("Texture_t const *") Texture pTexture) {
        return nVROverlay_SetOverlayTexture(ulOverlayHandle, pTexture.address());
    }

    // --- [ VROverlay_ClearOverlayTexture ] ---

    /** {@code EVROverlayError VROverlay_ClearOverlayTexture(VROverlayHandle_t ulOverlayHandle)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_ClearOverlayTexture(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.ClearOverlayTexture;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, __functionAddress);
    }

    // --- [ VROverlay_SetOverlayRaw ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayRaw(VROverlayHandle_t ulOverlayHandle, void * pvBuffer, uint32_t unWidth, uint32_t unHeight, uint32_t unBytesPerPixel)} */
    public static int nVROverlay_SetOverlayRaw(long ulOverlayHandle, long pvBuffer, int unWidth, int unHeight, int unBytesPerPixel) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayRaw;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pvBuffer, unWidth, unHeight, unBytesPerPixel, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_SetOverlayRaw(VROverlayHandle_t ulOverlayHandle, void * pvBuffer, uint32_t unWidth, uint32_t unHeight, uint32_t unBytesPerPixel)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayRaw(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("void *") ByteBuffer pvBuffer, @NativeType("uint32_t") int unWidth, @NativeType("uint32_t") int unHeight, @NativeType("uint32_t") int unBytesPerPixel) {
        return nVROverlay_SetOverlayRaw(ulOverlayHandle, memAddress(pvBuffer), unWidth, unHeight, unBytesPerPixel);
    }

    // --- [ VROverlay_SetOverlayFromFile ] ---

    /** {@code EVROverlayError VROverlay_SetOverlayFromFile(VROverlayHandle_t ulOverlayHandle, char const * pchFilePath)} */
    public static int nVROverlay_SetOverlayFromFile(long ulOverlayHandle, long pchFilePath) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayFromFile;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pchFilePath, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_SetOverlayFromFile(VROverlayHandle_t ulOverlayHandle, char const * pchFilePath)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayFromFile(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("char const *") ByteBuffer pchFilePath) {
        if (CHECKS) {
            checkNT1(pchFilePath);
        }
        return nVROverlay_SetOverlayFromFile(ulOverlayHandle, memAddress(pchFilePath));
    }

    /** {@code EVROverlayError VROverlay_SetOverlayFromFile(VROverlayHandle_t ulOverlayHandle, char const * pchFilePath)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayFromFile(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("char const *") CharSequence pchFilePath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchFilePath, true);
            long pchFilePathEncoded = stack.getPointerAddress();
            return nVROverlay_SetOverlayFromFile(ulOverlayHandle, pchFilePathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_GetOverlayTexture ] ---

    /** {@code EVROverlayError VROverlay_GetOverlayTexture(VROverlayHandle_t ulOverlayHandle, void ** pNativeTextureHandle, void * pNativeTextureRef, uint32_t * pWidth, uint32_t * pHeight, uint32_t * pNativeFormat, ETextureType * pAPIType, EColorSpace * pColorSpace, VRTextureBounds_t * pTextureBounds)} */
    public static int nVROverlay_GetOverlayTexture(long ulOverlayHandle, long pNativeTextureHandle, long pNativeTextureRef, long pWidth, long pHeight, long pNativeFormat, long pAPIType, long pColorSpace, long pTextureBounds) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTexture;
        if (CHECKS) {
            check(__functionAddress);
            check(pNativeTextureRef);
        }
        return callJPPPPPPPPI(ulOverlayHandle, pNativeTextureHandle, pNativeTextureRef, pWidth, pHeight, pNativeFormat, pAPIType, pColorSpace, pTextureBounds, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetOverlayTexture(VROverlayHandle_t ulOverlayHandle, void ** pNativeTextureHandle, void * pNativeTextureRef, uint32_t * pWidth, uint32_t * pHeight, uint32_t * pNativeFormat, ETextureType * pAPIType, EColorSpace * pColorSpace, VRTextureBounds_t * pTextureBounds)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTexture(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("void **") PointerBuffer pNativeTextureHandle, @NativeType("void *") long pNativeTextureRef, @NativeType("uint32_t *") IntBuffer pWidth, @NativeType("uint32_t *") IntBuffer pHeight, @NativeType("uint32_t *") IntBuffer pNativeFormat, @NativeType("ETextureType *") IntBuffer pAPIType, @NativeType("EColorSpace *") IntBuffer pColorSpace, @NativeType("VRTextureBounds_t *") VRTextureBounds pTextureBounds) {
        if (CHECKS) {
            check(pNativeTextureHandle, 1);
            check(pWidth, 1);
            check(pHeight, 1);
            check(pNativeFormat, 1);
            check(pAPIType, 1);
            check(pColorSpace, 1);
        }
        return nVROverlay_GetOverlayTexture(ulOverlayHandle, memAddress(pNativeTextureHandle), pNativeTextureRef, memAddress(pWidth), memAddress(pHeight), memAddress(pNativeFormat), memAddress(pAPIType), memAddress(pColorSpace), pTextureBounds.address());
    }

    // --- [ VROverlay_ReleaseNativeOverlayHandle ] ---

    /** {@code EVROverlayError VROverlay_ReleaseNativeOverlayHandle(VROverlayHandle_t ulOverlayHandle, void * pNativeTextureHandle)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_ReleaseNativeOverlayHandle(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("void *") long pNativeTextureHandle) {
        long __functionAddress = OpenVR.VROverlay.ReleaseNativeOverlayHandle;
        if (CHECKS) {
            check(__functionAddress);
            check(pNativeTextureHandle);
        }
        return callJPI(ulOverlayHandle, pNativeTextureHandle, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayTextureSize ] ---

    /** {@code EVROverlayError VROverlay_GetOverlayTextureSize(VROverlayHandle_t ulOverlayHandle, uint32_t * pWidth, uint32_t * pHeight)} */
    public static int nVROverlay_GetOverlayTextureSize(long ulOverlayHandle, long pWidth, long pHeight) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTextureSize;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(ulOverlayHandle, pWidth, pHeight, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetOverlayTextureSize(VROverlayHandle_t ulOverlayHandle, uint32_t * pWidth, uint32_t * pHeight)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTextureSize(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t *") IntBuffer pWidth, @NativeType("uint32_t *") IntBuffer pHeight) {
        if (CHECKS) {
            check(pWidth, 1);
            check(pHeight, 1);
        }
        return nVROverlay_GetOverlayTextureSize(ulOverlayHandle, memAddress(pWidth), memAddress(pHeight));
    }

    // --- [ VROverlay_CreateDashboardOverlay ] ---

    /** {@code EVROverlayError VROverlay_CreateDashboardOverlay(char const * pchOverlayKey, char const * pchOverlayFriendlyName, VROverlayHandle_t * pMainHandle, VROverlayHandle_t * pThumbnailHandle)} */
    public static int nVROverlay_CreateDashboardOverlay(long pchOverlayKey, long pchOverlayFriendlyName, long pMainHandle, long pThumbnailHandle) {
        long __functionAddress = OpenVR.VROverlay.CreateDashboardOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(pchOverlayKey, pchOverlayFriendlyName, pMainHandle, pThumbnailHandle, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_CreateDashboardOverlay(char const * pchOverlayKey, char const * pchOverlayFriendlyName, VROverlayHandle_t * pMainHandle, VROverlayHandle_t * pThumbnailHandle)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_CreateDashboardOverlay(@NativeType("char const *") ByteBuffer pchOverlayKey, @NativeType("char const *") ByteBuffer pchOverlayFriendlyName, @NativeType("VROverlayHandle_t *") LongBuffer pMainHandle, @NativeType("VROverlayHandle_t *") LongBuffer pThumbnailHandle) {
        if (CHECKS) {
            checkNT1(pchOverlayKey);
            checkNT1(pchOverlayFriendlyName);
            check(pMainHandle, 1);
            check(pThumbnailHandle, 1);
        }
        return nVROverlay_CreateDashboardOverlay(memAddress(pchOverlayKey), memAddress(pchOverlayFriendlyName), memAddress(pMainHandle), memAddress(pThumbnailHandle));
    }

    /** {@code EVROverlayError VROverlay_CreateDashboardOverlay(char const * pchOverlayKey, char const * pchOverlayFriendlyName, VROverlayHandle_t * pMainHandle, VROverlayHandle_t * pThumbnailHandle)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_CreateDashboardOverlay(@NativeType("char const *") CharSequence pchOverlayKey, @NativeType("char const *") CharSequence pchOverlayFriendlyName, @NativeType("VROverlayHandle_t *") LongBuffer pMainHandle, @NativeType("VROverlayHandle_t *") LongBuffer pThumbnailHandle) {
        if (CHECKS) {
            check(pMainHandle, 1);
            check(pThumbnailHandle, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchOverlayKey, true);
            long pchOverlayKeyEncoded = stack.getPointerAddress();
            stack.nASCII(pchOverlayFriendlyName, true);
            long pchOverlayFriendlyNameEncoded = stack.getPointerAddress();
            return nVROverlay_CreateDashboardOverlay(pchOverlayKeyEncoded, pchOverlayFriendlyNameEncoded, memAddress(pMainHandle), memAddress(pThumbnailHandle));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_IsDashboardVisible ] ---

    /** {@code bool VROverlay_IsDashboardVisible(void)} */
    @NativeType("bool")
    public static boolean VROverlay_IsDashboardVisible() {
        long __functionAddress = OpenVR.VROverlay.IsDashboardVisible;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VROverlay_IsActiveDashboardOverlay ] ---

    /** {@code bool VROverlay_IsActiveDashboardOverlay(VROverlayHandle_t ulOverlayHandle)} */
    @NativeType("bool")
    public static boolean VROverlay_IsActiveDashboardOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.IsActiveDashboardOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJZ(ulOverlayHandle, __functionAddress);
    }

    // --- [ VROverlay_SetDashboardOverlaySceneProcess ] ---

    /** {@code EVROverlayError VROverlay_SetDashboardOverlaySceneProcess(VROverlayHandle_t ulOverlayHandle, uint32_t unProcessId)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetDashboardOverlaySceneProcess(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t") int unProcessId) {
        long __functionAddress = OpenVR.VROverlay.SetDashboardOverlaySceneProcess;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, unProcessId, __functionAddress);
    }

    // --- [ VROverlay_GetDashboardOverlaySceneProcess ] ---

    /** {@code EVROverlayError VROverlay_GetDashboardOverlaySceneProcess(VROverlayHandle_t ulOverlayHandle, uint32_t * punProcessId)} */
    public static int nVROverlay_GetDashboardOverlaySceneProcess(long ulOverlayHandle, long punProcessId) {
        long __functionAddress = OpenVR.VROverlay.GetDashboardOverlaySceneProcess;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, punProcessId, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_GetDashboardOverlaySceneProcess(VROverlayHandle_t ulOverlayHandle, uint32_t * punProcessId)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetDashboardOverlaySceneProcess(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t *") IntBuffer punProcessId) {
        if (CHECKS) {
            check(punProcessId, 1);
        }
        return nVROverlay_GetDashboardOverlaySceneProcess(ulOverlayHandle, memAddress(punProcessId));
    }

    // --- [ VROverlay_ShowDashboard ] ---

    /** {@code void VROverlay_ShowDashboard(char const * pchOverlayToShow)} */
    public static void nVROverlay_ShowDashboard(long pchOverlayToShow) {
        long __functionAddress = OpenVR.VROverlay.ShowDashboard;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pchOverlayToShow, __functionAddress);
    }

    /** {@code void VROverlay_ShowDashboard(char const * pchOverlayToShow)} */
    public static void VROverlay_ShowDashboard(@NativeType("char const *") ByteBuffer pchOverlayToShow) {
        if (CHECKS) {
            checkNT1(pchOverlayToShow);
        }
        nVROverlay_ShowDashboard(memAddress(pchOverlayToShow));
    }

    /** {@code void VROverlay_ShowDashboard(char const * pchOverlayToShow)} */
    public static void VROverlay_ShowDashboard(@NativeType("char const *") CharSequence pchOverlayToShow) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchOverlayToShow, true);
            long pchOverlayToShowEncoded = stack.getPointerAddress();
            nVROverlay_ShowDashboard(pchOverlayToShowEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_GetPrimaryDashboardDevice ] ---

    /** {@code TrackedDeviceIndex_t VROverlay_GetPrimaryDashboardDevice(void)} */
    @NativeType("TrackedDeviceIndex_t")
    public static int VROverlay_GetPrimaryDashboardDevice() {
        long __functionAddress = OpenVR.VROverlay.GetPrimaryDashboardDevice;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VROverlay_ShowKeyboard ] ---

    /** {@code EVROverlayError VROverlay_ShowKeyboard(EGamepadTextInputMode eInputMode, EGamepadTextInputLineMode eLineInputMode, uint32_t unFlags, char const * pchDescription, uint32_t unCharMax, char const * pchExistingText, bool bUseMinimalMode, uint64_t uUserValue)} */
    public static int nVROverlay_ShowKeyboard(int eInputMode, int eLineInputMode, int unFlags, long pchDescription, int unCharMax, long pchExistingText, boolean bUseMinimalMode, long uUserValue) {
        long __functionAddress = OpenVR.VROverlay.ShowKeyboard;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJI(eInputMode, eLineInputMode, unFlags, pchDescription, unCharMax, pchExistingText, bUseMinimalMode, uUserValue, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_ShowKeyboard(EGamepadTextInputMode eInputMode, EGamepadTextInputLineMode eLineInputMode, uint32_t unFlags, char const * pchDescription, uint32_t unCharMax, char const * pchExistingText, bool bUseMinimalMode, uint64_t uUserValue)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_ShowKeyboard(@NativeType("EGamepadTextInputMode") int eInputMode, @NativeType("EGamepadTextInputLineMode") int eLineInputMode, @NativeType("uint32_t") int unFlags, @NativeType("char const *") ByteBuffer pchDescription, @NativeType("uint32_t") int unCharMax, @NativeType("char const *") ByteBuffer pchExistingText, @NativeType("bool") boolean bUseMinimalMode, @NativeType("uint64_t") long uUserValue) {
        if (CHECKS) {
            checkNT1(pchDescription);
            checkNT1(pchExistingText);
        }
        return nVROverlay_ShowKeyboard(eInputMode, eLineInputMode, unFlags, memAddress(pchDescription), unCharMax, memAddress(pchExistingText), bUseMinimalMode, uUserValue);
    }

    /** {@code EVROverlayError VROverlay_ShowKeyboard(EGamepadTextInputMode eInputMode, EGamepadTextInputLineMode eLineInputMode, uint32_t unFlags, char const * pchDescription, uint32_t unCharMax, char const * pchExistingText, bool bUseMinimalMode, uint64_t uUserValue)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_ShowKeyboard(@NativeType("EGamepadTextInputMode") int eInputMode, @NativeType("EGamepadTextInputLineMode") int eLineInputMode, @NativeType("uint32_t") int unFlags, @NativeType("char const *") CharSequence pchDescription, @NativeType("uint32_t") int unCharMax, @NativeType("char const *") CharSequence pchExistingText, @NativeType("bool") boolean bUseMinimalMode, @NativeType("uint64_t") long uUserValue) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchDescription, true);
            long pchDescriptionEncoded = stack.getPointerAddress();
            stack.nASCII(pchExistingText, true);
            long pchExistingTextEncoded = stack.getPointerAddress();
            return nVROverlay_ShowKeyboard(eInputMode, eLineInputMode, unFlags, pchDescriptionEncoded, unCharMax, pchExistingTextEncoded, bUseMinimalMode, uUserValue);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_ShowKeyboardForOverlay ] ---

    /** {@code EVROverlayError VROverlay_ShowKeyboardForOverlay(VROverlayHandle_t ulOverlayHandle, EGamepadTextInputMode eInputMode, EGamepadTextInputLineMode eLineInputMode, uint32_t unFlags, char const * pchDescription, uint32_t unCharMax, char const * pchExistingText, bool bUseMinimalMode, uint64_t uUserValue)} */
    public static int nVROverlay_ShowKeyboardForOverlay(long ulOverlayHandle, int eInputMode, int eLineInputMode, int unFlags, long pchDescription, int unCharMax, long pchExistingText, boolean bUseMinimalMode, long uUserValue) {
        long __functionAddress = OpenVR.VROverlay.ShowKeyboardForOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPJI(ulOverlayHandle, eInputMode, eLineInputMode, unFlags, pchDescription, unCharMax, pchExistingText, bUseMinimalMode, uUserValue, __functionAddress);
    }

    /** {@code EVROverlayError VROverlay_ShowKeyboardForOverlay(VROverlayHandle_t ulOverlayHandle, EGamepadTextInputMode eInputMode, EGamepadTextInputLineMode eLineInputMode, uint32_t unFlags, char const * pchDescription, uint32_t unCharMax, char const * pchExistingText, bool bUseMinimalMode, uint64_t uUserValue)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_ShowKeyboardForOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("EGamepadTextInputMode") int eInputMode, @NativeType("EGamepadTextInputLineMode") int eLineInputMode, @NativeType("uint32_t") int unFlags, @NativeType("char const *") ByteBuffer pchDescription, @NativeType("uint32_t") int unCharMax, @NativeType("char const *") ByteBuffer pchExistingText, @NativeType("bool") boolean bUseMinimalMode, @NativeType("uint64_t") long uUserValue) {
        if (CHECKS) {
            checkNT1(pchDescription);
            checkNT1(pchExistingText);
        }
        return nVROverlay_ShowKeyboardForOverlay(ulOverlayHandle, eInputMode, eLineInputMode, unFlags, memAddress(pchDescription), unCharMax, memAddress(pchExistingText), bUseMinimalMode, uUserValue);
    }

    /** {@code EVROverlayError VROverlay_ShowKeyboardForOverlay(VROverlayHandle_t ulOverlayHandle, EGamepadTextInputMode eInputMode, EGamepadTextInputLineMode eLineInputMode, uint32_t unFlags, char const * pchDescription, uint32_t unCharMax, char const * pchExistingText, bool bUseMinimalMode, uint64_t uUserValue)} */
    @NativeType("EVROverlayError")
    public static int VROverlay_ShowKeyboardForOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("EGamepadTextInputMode") int eInputMode, @NativeType("EGamepadTextInputLineMode") int eLineInputMode, @NativeType("uint32_t") int unFlags, @NativeType("char const *") CharSequence pchDescription, @NativeType("uint32_t") int unCharMax, @NativeType("char const *") CharSequence pchExistingText, @NativeType("bool") boolean bUseMinimalMode, @NativeType("uint64_t") long uUserValue) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchDescription, true);
            long pchDescriptionEncoded = stack.getPointerAddress();
            stack.nASCII(pchExistingText, true);
            long pchExistingTextEncoded = stack.getPointerAddress();
            return nVROverlay_ShowKeyboardForOverlay(ulOverlayHandle, eInputMode, eLineInputMode, unFlags, pchDescriptionEncoded, unCharMax, pchExistingTextEncoded, bUseMinimalMode, uUserValue);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_GetKeyboardText ] ---

    /** {@code uint32_t VROverlay_GetKeyboardText(char * pchText, uint32_t cchText)} */
    public static int nVROverlay_GetKeyboardText(long pchText, int cchText) {
        long __functionAddress = OpenVR.VROverlay.GetKeyboardText;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchText, cchText, __functionAddress);
    }

    /** {@code uint32_t VROverlay_GetKeyboardText(char * pchText, uint32_t cchText)} */
    @NativeType("uint32_t")
    public static int VROverlay_GetKeyboardText(@NativeType("char *") @Nullable ByteBuffer pchText) {
        return nVROverlay_GetKeyboardText(memAddressSafe(pchText), remainingSafe(pchText));
    }

    /** {@code uint32_t VROverlay_GetKeyboardText(char * pchText, uint32_t cchText)} */
    @NativeType("uint32_t")
    public static String VROverlay_GetKeyboardText(@NativeType("uint32_t") int cchText) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer pchText = stack.malloc(cchText);
            int __result = nVROverlay_GetKeyboardText(memAddress(pchText), cchText);
            return memASCII(pchText, __result - 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_HideKeyboard ] ---

    /** {@code void VROverlay_HideKeyboard(void)} */
    public static void VROverlay_HideKeyboard() {
        long __functionAddress = OpenVR.VROverlay.HideKeyboard;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VROverlay_SetKeyboardTransformAbsolute ] ---

    /** {@code void VROverlay_SetKeyboardTransformAbsolute(ETrackingUniverseOrigin eTrackingOrigin, HmdMatrix34_t const * pmatTrackingOriginToKeyboardTransform)} */
    public static void nVROverlay_SetKeyboardTransformAbsolute(int eTrackingOrigin, long pmatTrackingOriginToKeyboardTransform) {
        long __functionAddress = OpenVR.VROverlay.SetKeyboardTransformAbsolute;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(eTrackingOrigin, pmatTrackingOriginToKeyboardTransform, __functionAddress);
    }

    /** {@code void VROverlay_SetKeyboardTransformAbsolute(ETrackingUniverseOrigin eTrackingOrigin, HmdMatrix34_t const * pmatTrackingOriginToKeyboardTransform)} */
    public static void VROverlay_SetKeyboardTransformAbsolute(@NativeType("ETrackingUniverseOrigin") int eTrackingOrigin, @NativeType("HmdMatrix34_t const *") HmdMatrix34 pmatTrackingOriginToKeyboardTransform) {
        nVROverlay_SetKeyboardTransformAbsolute(eTrackingOrigin, pmatTrackingOriginToKeyboardTransform.address());
    }

    // --- [ VROverlay_SetKeyboardPositionForOverlay ] ---

    /** {@code void VROverlay_SetKeyboardPositionForOverlay(VROverlayHandle_t ulOverlayHandle, HmdRect2_t avoidRect)} */
    public static native void nVROverlay_SetKeyboardPositionForOverlay(long ulOverlayHandle, long avoidRect, long __functionAddress);

    /** {@code void VROverlay_SetKeyboardPositionForOverlay(VROverlayHandle_t ulOverlayHandle, HmdRect2_t avoidRect)} */
    public static void nVROverlay_SetKeyboardPositionForOverlay(long ulOverlayHandle, long avoidRect) {
        long __functionAddress = OpenVR.VROverlay.SetKeyboardPositionForOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        nVROverlay_SetKeyboardPositionForOverlay(ulOverlayHandle, avoidRect, __functionAddress);
    }

    /** {@code void VROverlay_SetKeyboardPositionForOverlay(VROverlayHandle_t ulOverlayHandle, HmdRect2_t avoidRect)} */
    public static void VROverlay_SetKeyboardPositionForOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("HmdRect2_t") HmdRect2 avoidRect) {
        nVROverlay_SetKeyboardPositionForOverlay(ulOverlayHandle, avoidRect.address());
    }

    // --- [ VROverlay_ShowMessageOverlay ] ---

    /** {@code VRMessageOverlayResponse VROverlay_ShowMessageOverlay(char const * pchText, char const * pchCaption, char const * pchButton0Text, char const * pchButton1Text, char const * pchButton2Text, char const * pchButton3Text)} */
    public static int nVROverlay_ShowMessageOverlay(long pchText, long pchCaption, long pchButton0Text, long pchButton1Text, long pchButton2Text, long pchButton3Text) {
        long __functionAddress = OpenVR.VROverlay.ShowMessageOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPPI(pchText, pchCaption, pchButton0Text, pchButton1Text, pchButton2Text, pchButton3Text, __functionAddress);
    }

    /** {@code VRMessageOverlayResponse VROverlay_ShowMessageOverlay(char const * pchText, char const * pchCaption, char const * pchButton0Text, char const * pchButton1Text, char const * pchButton2Text, char const * pchButton3Text)} */
    @NativeType("VRMessageOverlayResponse")
    public static int VROverlay_ShowMessageOverlay(@NativeType("char const *") ByteBuffer pchText, @NativeType("char const *") ByteBuffer pchCaption, @NativeType("char const *") ByteBuffer pchButton0Text, @NativeType("char const *") @Nullable ByteBuffer pchButton1Text, @NativeType("char const *") @Nullable ByteBuffer pchButton2Text, @NativeType("char const *") @Nullable ByteBuffer pchButton3Text) {
        if (CHECKS) {
            checkNT1(pchText);
            checkNT1(pchCaption);
            checkNT1(pchButton0Text);
            checkNT1Safe(pchButton1Text);
            checkNT1Safe(pchButton2Text);
            checkNT1Safe(pchButton3Text);
        }
        return nVROverlay_ShowMessageOverlay(memAddress(pchText), memAddress(pchCaption), memAddress(pchButton0Text), memAddressSafe(pchButton1Text), memAddressSafe(pchButton2Text), memAddressSafe(pchButton3Text));
    }

    /** {@code VRMessageOverlayResponse VROverlay_ShowMessageOverlay(char const * pchText, char const * pchCaption, char const * pchButton0Text, char const * pchButton1Text, char const * pchButton2Text, char const * pchButton3Text)} */
    @NativeType("VRMessageOverlayResponse")
    public static int VROverlay_ShowMessageOverlay(@NativeType("char const *") CharSequence pchText, @NativeType("char const *") CharSequence pchCaption, @NativeType("char const *") CharSequence pchButton0Text, @NativeType("char const *") @Nullable CharSequence pchButton1Text, @NativeType("char const *") @Nullable CharSequence pchButton2Text, @NativeType("char const *") @Nullable CharSequence pchButton3Text) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(pchText, true);
            long pchTextEncoded = stack.getPointerAddress();
            stack.nASCII(pchCaption, true);
            long pchCaptionEncoded = stack.getPointerAddress();
            stack.nASCII(pchButton0Text, true);
            long pchButton0TextEncoded = stack.getPointerAddress();
            stack.nASCIISafe(pchButton1Text, true);
            long pchButton1TextEncoded = pchButton1Text == null ? NULL : stack.getPointerAddress();
            stack.nASCIISafe(pchButton2Text, true);
            long pchButton2TextEncoded = pchButton2Text == null ? NULL : stack.getPointerAddress();
            stack.nASCIISafe(pchButton3Text, true);
            long pchButton3TextEncoded = pchButton3Text == null ? NULL : stack.getPointerAddress();
            return nVROverlay_ShowMessageOverlay(pchTextEncoded, pchCaptionEncoded, pchButton0TextEncoded, pchButton1TextEncoded, pchButton2TextEncoded, pchButton3TextEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ VROverlay_CloseMessageOverlay ] ---

    /** {@code void VROverlay_CloseMessageOverlay(void)} */
    public static void VROverlay_CloseMessageOverlay() {
        long __functionAddress = OpenVR.VROverlay.CloseMessageOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

}
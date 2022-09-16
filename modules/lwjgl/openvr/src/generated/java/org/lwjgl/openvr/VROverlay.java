/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Overlay management methods. */
public class VROverlay {

    static { OpenVR.initialize(); }

    protected VROverlay() {
        throw new UnsupportedOperationException();
    }

    // --- [ VROverlay_FindOverlay ] ---

    /** Unsafe version of: {@link #VROverlay_FindOverlay FindOverlay} */
    public static int nVROverlay_FindOverlay(long pchOverlayKey, long pOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.FindOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(pchOverlayKey, pOverlayHandle, __functionAddress);
    }

    /** Finds an existing overlay with the specified key. */
    @NativeType("EVROverlayError")
    public static int VROverlay_FindOverlay(@NativeType("char const *") ByteBuffer pchOverlayKey, @NativeType("VROverlayHandle_t *") LongBuffer pOverlayHandle) {
        if (CHECKS) {
            checkNT1(pchOverlayKey);
            check(pOverlayHandle, 1);
        }
        return nVROverlay_FindOverlay(memAddress(pchOverlayKey), memAddress(pOverlayHandle));
    }

    /** Finds an existing overlay with the specified key. */
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

    /** Unsafe version of: {@link #VROverlay_CreateOverlay CreateOverlay} */
    public static int nVROverlay_CreateOverlay(long pchOverlayKey, long pchOverlayName, long pOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.CreateOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(pchOverlayKey, pchOverlayName, pOverlayHandle, __functionAddress);
    }

    /** Creates a new named overlay. All overlays start hidden and with default settings. */
    @NativeType("EVROverlayError")
    public static int VROverlay_CreateOverlay(@NativeType("char const *") ByteBuffer pchOverlayKey, @NativeType("char const *") ByteBuffer pchOverlayName, @NativeType("VROverlayHandle_t *") LongBuffer pOverlayHandle) {
        if (CHECKS) {
            checkNT1(pchOverlayKey);
            checkNT1(pchOverlayName);
            check(pOverlayHandle, 1);
        }
        return nVROverlay_CreateOverlay(memAddress(pchOverlayKey), memAddress(pchOverlayName), memAddress(pOverlayHandle));
    }

    /** Creates a new named overlay. All overlays start hidden and with default settings. */
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

    /** Destroys the specified overlay. When an application calls {@link VR#VR_ShutdownInternal ShutdownInternal} all overlays created by that app are automatically destroyed. */
    @NativeType("EVROverlayError")
    public static int VROverlay_DestroyOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.DestroyOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayKey ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayKey GetOverlayKey} */
    public static int nVROverlay_GetOverlayKey(long ulOverlayHandle, long pchValue, int unBufferSize, long pError) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayKey;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(ulOverlayHandle, pchValue, unBufferSize, pError, __functionAddress);
    }

    /**
     * Fills the provided buffer with the string key of the overlay. Returns the size of buffer required to store the key, including the terminating null
     * character. {@link VR#k_unVROverlayMaxKeyLength} will be enough bytes to fit the string.
     */
    @NativeType("uint32_t")
    public static int VROverlay_GetOverlayKey(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @Nullable @NativeType("char *") ByteBuffer pchValue, @NativeType("EVROverlayError *") IntBuffer pError) {
        if (CHECKS) {
            check(pError, 1);
        }
        return nVROverlay_GetOverlayKey(ulOverlayHandle, memAddressSafe(pchValue), remainingSafe(pchValue), memAddress(pError));
    }

    /**
     * Fills the provided buffer with the string key of the overlay. Returns the size of buffer required to store the key, including the terminating null
     * character. {@link VR#k_unVROverlayMaxKeyLength} will be enough bytes to fit the string.
     */
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

    /** Unsafe version of: {@link #VROverlay_GetOverlayName GetOverlayName} */
    public static int nVROverlay_GetOverlayName(long ulOverlayHandle, long pchValue, int unBufferSize, long pError) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(ulOverlayHandle, pchValue, unBufferSize, pError, __functionAddress);
    }

    /**
     * Fills the provided buffer with the friendly name of the overlay. Returns the size of buffer required to store the key, including the terminating null
     * character. {@link VR#k_unVROverlayMaxNameLength} will be enough bytes to fit the string.
     */
    @NativeType("uint32_t")
    public static int VROverlay_GetOverlayName(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @Nullable @NativeType("char *") ByteBuffer pchValue, @NativeType("EVROverlayError *") IntBuffer pError) {
        if (CHECKS) {
            check(pError, 1);
        }
        return nVROverlay_GetOverlayName(ulOverlayHandle, memAddressSafe(pchValue), remainingSafe(pchValue), memAddress(pError));
    }

    /**
     * Fills the provided buffer with the friendly name of the overlay. Returns the size of buffer required to store the key, including the terminating null
     * character. {@link VR#k_unVROverlayMaxNameLength} will be enough bytes to fit the string.
     */
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

    /** Unsafe version of: {@link #VROverlay_SetOverlayName SetOverlayName} */
    public static int nVROverlay_SetOverlayName(long ulOverlayHandle, long pchName) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pchName, __functionAddress);
    }

    /** Sets the name to use for this overlay. */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayName(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("char const *") ByteBuffer pchName) {
        if (CHECKS) {
            checkNT1(pchName);
        }
        return nVROverlay_SetOverlayName(ulOverlayHandle, memAddress(pchName));
    }

    /** Sets the name to use for this overlay. */
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

    /** Unsafe version of: {@link #VROverlay_GetOverlayImageData GetOverlayImageData} */
    public static int nVROverlay_GetOverlayImageData(long ulOverlayHandle, long pvBuffer, int unBufferSize, long punWidth, long punHeight) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayImageData;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPPI(ulOverlayHandle, pvBuffer, unBufferSize, punWidth, punHeight, __functionAddress);
    }

    /**
     * Gets the raw image data from an overlay. Overlay image data is always returned as RGBA data, 4 bytes per pixel. If the buffer is not large enough,
     * width and height will be set and {@link VR#EVROverlayError_VROverlayError_ArrayTooSmall} is returned.
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayImageData(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("void *") ByteBuffer pvBuffer, @NativeType("uint32_t *") IntBuffer punWidth, @NativeType("uint32_t *") IntBuffer punHeight) {
        if (CHECKS) {
            check(punWidth, 1);
            check(punHeight, 1);
        }
        return nVROverlay_GetOverlayImageData(ulOverlayHandle, memAddress(pvBuffer), pvBuffer.remaining(), memAddress(punWidth), memAddress(punHeight));
    }

    // --- [ VROverlay_GetOverlayErrorNameFromEnum ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayErrorNameFromEnum GetOverlayErrorNameFromEnum} */
    public static long nVROverlay_GetOverlayErrorNameFromEnum(int error) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayErrorNameFromEnum;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(error, __functionAddress);
    }

    /**
     * Returns a string that corresponds with the specified overlay error. The string will be the name of the error enum value for all valid error codes.
     *
     * @param error one of:<br><table><tr><td>{@link VR#EVROverlayError_VROverlayError_None}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_UnknownOverlay}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_InvalidHandle}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_PermissionDenied}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_OverlayLimitExceeded}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_WrongVisibilityType}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_KeyTooLong}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_NameTooLong}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_KeyInUse}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_WrongTransformType}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_InvalidTrackedDevice}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_InvalidParameter}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_ThumbnailCantBeDestroyed}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_ArrayTooSmall}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_RequestFailed}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_InvalidTexture}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_UnableToLoadFile}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_KeyboardAlreadyInUse}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_NoNeighbor}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_TooManyMaskPrimitives}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_BadMaskPrimitive}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_TextureAlreadyLocked}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_TextureLockCapacityReached}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_TextureNotLocked}</td></tr><tr><td>{@link VR#EVROverlayError_VROverlayError_TimedOut}</td></tr></table>
     */
    @Nullable
    @NativeType("char const *")
    public static String VROverlay_GetOverlayErrorNameFromEnum(@NativeType("EVROverlayError") int error) {
        long __result = nVROverlay_GetOverlayErrorNameFromEnum(error);
        return memASCIISafe(__result);
    }

    // --- [ VROverlay_SetOverlayRenderingPid ] ---

    /**
     * Sets the pid that is allowed to render to this overlay (the creator pid is always allow to render), by default this is the pid of the process that made
     * the overlay.
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayRenderingPid(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t") int unPID) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayRenderingPid;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, unPID, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayRenderingPid ] ---

    /** Gets the pid that is allowed to render to this overlay. */
    @NativeType("uint32_t")
    public static int VROverlay_GetOverlayRenderingPid(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayRenderingPid;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, __functionAddress);
    }

    // --- [ VROverlay_SetOverlayFlag ] ---

    /**
     * Specify flag setting for a given overlay.
     *
     * @param eOverlayFlag one of:<br><table><tr><td>{@link VR#VROverlayFlags_NoDashboardTab}</td><td>{@link VR#VROverlayFlags_SendVRDiscreteScrollEvents}</td></tr><tr><td>{@link VR#VROverlayFlags_SendVRTouchpadEvents}</td><td>{@link VR#VROverlayFlags_ShowTouchPadScrollWheel}</td></tr><tr><td>{@link VR#VROverlayFlags_TransferOwnershipToInternalProcess}</td><td>{@link VR#VROverlayFlags_SideBySide_Parallel}</td></tr><tr><td>{@link VR#VROverlayFlags_SideBySide_Crossed}</td><td>{@link VR#VROverlayFlags_Panorama}</td></tr><tr><td>{@link VR#VROverlayFlags_StereoPanorama}</td><td>{@link VR#VROverlayFlags_SortWithNonSceneOverlays}</td></tr><tr><td>{@link VR#VROverlayFlags_VisibleInDashboard}</td><td>{@link VR#VROverlayFlags_MakeOverlaysInteractiveIfVisible}</td></tr><tr><td>{@link VR#VROverlayFlags_SendVRSmoothScrollEvents}</td><td>{@link VR#VROverlayFlags_ProtectedContent}</td></tr><tr><td>{@link VR#VROverlayFlags_HideLaserIntersection}</td><td>{@link VR#VROverlayFlags_WantsModalBehavior}</td></tr><tr><td>{@link VR#VROverlayFlags_IsPremultiplied}</td><td>{@link VR#VROverlayFlags_IgnoreTextureAlpha}</td></tr></table>
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayFlag(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayFlags") int eOverlayFlag, @NativeType("bool") boolean bEnabled) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayFlag;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, eOverlayFlag, bEnabled, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayFlag ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayFlag GetOverlayFlag} */
    public static int nVROverlay_GetOverlayFlag(long ulOverlayHandle, int eOverlayFlag, long pbEnabled) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayFlag;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, eOverlayFlag, pbEnabled, __functionAddress);
    }

    /**
     * Gets flag setting for a given overlay.
     *
     * @param eOverlayFlag one of:<br><table><tr><td>{@link VR#VROverlayFlags_NoDashboardTab}</td><td>{@link VR#VROverlayFlags_SendVRDiscreteScrollEvents}</td></tr><tr><td>{@link VR#VROverlayFlags_SendVRTouchpadEvents}</td><td>{@link VR#VROverlayFlags_ShowTouchPadScrollWheel}</td></tr><tr><td>{@link VR#VROverlayFlags_TransferOwnershipToInternalProcess}</td><td>{@link VR#VROverlayFlags_SideBySide_Parallel}</td></tr><tr><td>{@link VR#VROverlayFlags_SideBySide_Crossed}</td><td>{@link VR#VROverlayFlags_Panorama}</td></tr><tr><td>{@link VR#VROverlayFlags_StereoPanorama}</td><td>{@link VR#VROverlayFlags_SortWithNonSceneOverlays}</td></tr><tr><td>{@link VR#VROverlayFlags_VisibleInDashboard}</td><td>{@link VR#VROverlayFlags_MakeOverlaysInteractiveIfVisible}</td></tr><tr><td>{@link VR#VROverlayFlags_SendVRSmoothScrollEvents}</td><td>{@link VR#VROverlayFlags_ProtectedContent}</td></tr><tr><td>{@link VR#VROverlayFlags_HideLaserIntersection}</td><td>{@link VR#VROverlayFlags_WantsModalBehavior}</td></tr><tr><td>{@link VR#VROverlayFlags_IsPremultiplied}</td><td>{@link VR#VROverlayFlags_IgnoreTextureAlpha}</td></tr></table>
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayFlag(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayFlags") int eOverlayFlag, @NativeType("bool *") ByteBuffer pbEnabled) {
        if (CHECKS) {
            check(pbEnabled, 1);
        }
        return nVROverlay_GetOverlayFlag(ulOverlayHandle, eOverlayFlag, memAddress(pbEnabled));
    }

    // --- [ VROverlay_GetOverlayFlags ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayFlags GetOverlayFlags} */
    public static int nVROverlay_GetOverlayFlags(long ulOverlayHandle, long pFlags) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayFlags;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pFlags, __functionAddress);
    }

    /** Gets all the flags for a given overlay. */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayFlags(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t *") IntBuffer pFlags) {
        if (CHECKS) {
            check(pFlags, 1);
        }
        return nVROverlay_GetOverlayFlags(ulOverlayHandle, memAddress(pFlags));
    }

    // --- [ VROverlay_SetOverlayColor ] ---

    /** Sets the color tint of the overlay quad. Use 0.0 to 1.0 per channel. */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayColor(@NativeType("VROverlayHandle_t") long ulOverlayHandle, float fRed, float fGreen, float fBlue) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayColor;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, fRed, fGreen, fBlue, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayColor ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayColor GetOverlayColor} */
    public static int nVROverlay_GetOverlayColor(long ulOverlayHandle, long pfRed, long pfGreen, long pfBlue) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayColor;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPPI(ulOverlayHandle, pfRed, pfGreen, pfBlue, __functionAddress);
    }

    /** Gets the color tint of the overlay quad. */
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

    /** Sets the alpha of the overlay quad. Use 1.0 for 100 percent opacity to 0.0 for 0 percent opacity. */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayAlpha(@NativeType("VROverlayHandle_t") long ulOverlayHandle, float fAlpha) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayAlpha;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, fAlpha, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayAlpha ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayAlpha GetOverlayAlpha} */
    public static int nVROverlay_GetOverlayAlpha(long ulOverlayHandle, long pfAlpha) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayAlpha;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pfAlpha, __functionAddress);
    }

    /** Gets the alpha of the overlay quad. By default overlays are rendering at 100 percent alpha (1.0). */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayAlpha(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("float *") FloatBuffer pfAlpha) {
        if (CHECKS) {
            check(pfAlpha, 1);
        }
        return nVROverlay_GetOverlayAlpha(ulOverlayHandle, memAddress(pfAlpha));
    }

    // --- [ VROverlay_SetOverlayTexelAspect ] ---

    /**
     * Sets the aspect ratio of the texels in the overlay. 1.0 means the texels are square. 2.0 means the texels are twice as wide as they are tall.
     * 
     * <p>Defaults to 1.0.</p>
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTexelAspect(@NativeType("VROverlayHandle_t") long ulOverlayHandle, float fTexelAspect) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTexelAspect;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, fTexelAspect, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayTexelAspect ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayTexelAspect GetOverlayTexelAspect} */
    public static int nVROverlay_GetOverlayTexelAspect(long ulOverlayHandle, long pfTexelAspect) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTexelAspect;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pfTexelAspect, __functionAddress);
    }

    /** Gets the aspect ratio of the texels in the overlay. Defaults to 1.0. */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTexelAspect(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("float *") FloatBuffer pfTexelAspect) {
        if (CHECKS) {
            check(pfTexelAspect, 1);
        }
        return nVROverlay_GetOverlayTexelAspect(ulOverlayHandle, memAddress(pfTexelAspect));
    }

    // --- [ VROverlay_SetOverlaySortOrder ] ---

    /**
     * Sets the rendering sort order for the overlay. Overlays are rendered this order:
     * 
     * <ul>
     * <li>Overlays owned by the scene application</li>
     * <li>Overlays owned by some other application</li>
     * </ul>
     * 
     * <p>Within a category overlays are rendered lowest sort order to highest sort order. Overlays with the same sort order are rendered back to front base on
     * distance from the HMD.</p>
     * 
     * <p>Sort order defaults to 0.</p>
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlaySortOrder(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t") int unSortOrder) {
        long __functionAddress = OpenVR.VROverlay.SetOverlaySortOrder;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, unSortOrder, __functionAddress);
    }

    // --- [ VROverlay_GetOverlaySortOrder ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlaySortOrder GetOverlaySortOrder} */
    public static int nVROverlay_GetOverlaySortOrder(long ulOverlayHandle, long punSortOrder) {
        long __functionAddress = OpenVR.VROverlay.GetOverlaySortOrder;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, punSortOrder, __functionAddress);
    }

    /** Gets the sort order of the overlay. See {@link #VROverlay_SetOverlaySortOrder SetOverlaySortOrder} for how this works. */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlaySortOrder(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t *") IntBuffer punSortOrder) {
        if (CHECKS) {
            check(punSortOrder, 1);
        }
        return nVROverlay_GetOverlaySortOrder(ulOverlayHandle, memAddress(punSortOrder));
    }

    // --- [ VROverlay_SetOverlayWidthInMeters ] ---

    /** Sets the width of the overlay quad in meters. By default overlays are rendered on a quad that is 1 meter across. */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayWidthInMeters(@NativeType("VROverlayHandle_t") long ulOverlayHandle, float fWidthInMeters) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayWidthInMeters;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, fWidthInMeters, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayWidthInMeters ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayWidthInMeters GetOverlayWidthInMeters} */
    public static int nVROverlay_GetOverlayWidthInMeters(long ulOverlayHandle, long pfWidthInMeters) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayWidthInMeters;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pfWidthInMeters, __functionAddress);
    }

    /** Returns the width of the overlay quad in meters. By default overlays are rendered on a quad that is 1 meter across. */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayWidthInMeters(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("float *") FloatBuffer pfWidthInMeters) {
        if (CHECKS) {
            check(pfWidthInMeters, 1);
        }
        return nVROverlay_GetOverlayWidthInMeters(ulOverlayHandle, memAddress(pfWidthInMeters));
    }

    // --- [ VROverlay_SetOverlayCurvature ] ---

    /**
     * Use to draw overlay as a curved surface.
     * 
     * <p>Curvature is a percentage from {@code (0..1]} where 1 is a fully closed cylinder. For a specific radius, curvature can be computed as:
     * {@code overlay.width / (2 PI r)}.</p>
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayCurvature(@NativeType("VROverlayHandle_t") long ulOverlayHandle, float fCurvature) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayCurvature;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, fCurvature, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayCurvature ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayCurvature GetOverlayCurvature} */
    public static int nVROverlay_GetOverlayCurvature(long ulOverlayHandle, long pfCurvature) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayCurvature;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pfCurvature, __functionAddress);
    }

    /** Returns the curvature of the overlay as a percentage from {@code (0..1]} where 1 is a fully closed cylinder. */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayCurvature(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("float *") FloatBuffer pfCurvature) {
        if (CHECKS) {
            check(pfCurvature, 1);
        }
        return nVROverlay_GetOverlayCurvature(ulOverlayHandle, memAddress(pfCurvature));
    }

    // --- [ VROverlay_SetOverlayPreCurvePitch ] ---

    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayPreCurvePitch(@NativeType("VROverlayHandle_t") long ulOverlayHandle, float fRadians) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayPreCurvePitch;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, fRadians, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayPreCurvePitch ] ---

    public static int nVROverlay_GetOverlayPreCurvePitch(long ulOverlayHandle, long pfRadians) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayPreCurvePitch;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pfRadians, __functionAddress);
    }

    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayPreCurvePitch(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("float *") FloatBuffer pfRadians) {
        if (CHECKS) {
            check(pfRadians, 1);
        }
        return nVROverlay_GetOverlayPreCurvePitch(ulOverlayHandle, memAddress(pfRadians));
    }

    // --- [ VROverlay_SetOverlayTextureColorSpace ] ---

    /**
     * Sets the colorspace the overlay texture's data is in. Defaults to 'auto'. If the texture needs to be resolved, you should call {@link #VROverlay_SetOverlayTexture SetOverlayTexture}
     * with the appropriate colorspace instead.
     *
     * @param eTextureColorSpace one of:<br><table><tr><td>{@link VR#EColorSpace_ColorSpace_Auto}</td><td>{@link VR#EColorSpace_ColorSpace_Gamma}</td></tr><tr><td>{@link VR#EColorSpace_ColorSpace_Linear}</td></tr></table>
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTextureColorSpace(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("EColorSpace") int eTextureColorSpace) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTextureColorSpace;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, eTextureColorSpace, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayTextureColorSpace ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayTextureColorSpace GetOverlayTextureColorSpace} */
    public static int nVROverlay_GetOverlayTextureColorSpace(long ulOverlayHandle, long peTextureColorSpace) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTextureColorSpace;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, peTextureColorSpace, __functionAddress);
    }

    /** Gets the overlay's current colorspace setting. */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTextureColorSpace(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("EColorSpace *") IntBuffer peTextureColorSpace) {
        if (CHECKS) {
            check(peTextureColorSpace, 1);
        }
        return nVROverlay_GetOverlayTextureColorSpace(ulOverlayHandle, memAddress(peTextureColorSpace));
    }

    // --- [ VROverlay_SetOverlayTextureBounds ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayTextureBounds SetOverlayTextureBounds} */
    public static int nVROverlay_SetOverlayTextureBounds(long ulOverlayHandle, long pOverlayTextureBounds) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTextureBounds;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pOverlayTextureBounds, __functionAddress);
    }

    /** Sets the part of the texture to use for the overlay. UV Min is the upper left corner and UV Max is the lower right corner. */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTextureBounds(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VRTextureBounds_t const *") VRTextureBounds pOverlayTextureBounds) {
        return nVROverlay_SetOverlayTextureBounds(ulOverlayHandle, pOverlayTextureBounds.address());
    }

    // --- [ VROverlay_GetOverlayTextureBounds ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayTextureBounds GetOverlayTextureBounds} */
    public static int nVROverlay_GetOverlayTextureBounds(long ulOverlayHandle, long pOverlayTextureBounds) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTextureBounds;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pOverlayTextureBounds, __functionAddress);
    }

    /** Gets the part of the texture to use for the overlay. UV Min is the upper left corner and UV Max is the lower right corner. */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTextureBounds(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VRTextureBounds_t *") VRTextureBounds pOverlayTextureBounds) {
        return nVROverlay_GetOverlayTextureBounds(ulOverlayHandle, pOverlayTextureBounds.address());
    }

    // --- [ VROverlay_GetOverlayTransformType ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayTransformType GetOverlayTransformType} */
    public static int nVROverlay_GetOverlayTransformType(long ulOverlayHandle, long peTransformType) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTransformType;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, peTransformType, __functionAddress);
    }

    /** Returns the transform type of this overlay. */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTransformType(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayTransformType *") IntBuffer peTransformType) {
        if (CHECKS) {
            check(peTransformType, 1);
        }
        return nVROverlay_GetOverlayTransformType(ulOverlayHandle, memAddress(peTransformType));
    }

    // --- [ VROverlay_SetOverlayTransformAbsolute ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayTransformAbsolute SetOverlayTransformAbsolute} */
    public static int nVROverlay_SetOverlayTransformAbsolute(long ulOverlayHandle, int eTrackingOrigin, long pmatTrackingOriginToOverlayTransform) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTransformAbsolute;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, eTrackingOrigin, pmatTrackingOriginToOverlayTransform, __functionAddress);
    }

    /**
     * Sets the transform to absolute tracking origin.
     *
     * @param eTrackingOrigin one of:<br><table><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseSeated}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseStanding}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated}</td></tr></table>
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTransformAbsolute(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("ETrackingUniverseOrigin") int eTrackingOrigin, @NativeType("HmdMatrix34_t const *") HmdMatrix34 pmatTrackingOriginToOverlayTransform) {
        return nVROverlay_SetOverlayTransformAbsolute(ulOverlayHandle, eTrackingOrigin, pmatTrackingOriginToOverlayTransform.address());
    }

    // --- [ VROverlay_GetOverlayTransformAbsolute ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayTransformAbsolute GetOverlayTransformAbsolute} */
    public static int nVROverlay_GetOverlayTransformAbsolute(long ulOverlayHandle, long peTrackingOrigin, long pmatTrackingOriginToOverlayTransform) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTransformAbsolute;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(ulOverlayHandle, peTrackingOrigin, pmatTrackingOriginToOverlayTransform, __functionAddress);
    }

    /** Gets the transform if it is absolute. Returns an error if the transform is some other type. */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTransformAbsolute(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("ETrackingUniverseOrigin *") IntBuffer peTrackingOrigin, @NativeType("HmdMatrix34_t *") HmdMatrix34 pmatTrackingOriginToOverlayTransform) {
        if (CHECKS) {
            check(peTrackingOrigin, 1);
        }
        return nVROverlay_GetOverlayTransformAbsolute(ulOverlayHandle, memAddress(peTrackingOrigin), pmatTrackingOriginToOverlayTransform.address());
    }

    // --- [ VROverlay_SetOverlayTransformTrackedDeviceRelative ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayTransformTrackedDeviceRelative SetOverlayTransformTrackedDeviceRelative} */
    public static int nVROverlay_SetOverlayTransformTrackedDeviceRelative(long ulOverlayHandle, int unTrackedDevice, long pmatTrackedDeviceToOverlayTransform) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTransformTrackedDeviceRelative;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, unTrackedDevice, pmatTrackedDeviceToOverlayTransform, __functionAddress);
    }

    /** Sets the transform to relative to the transform of the specified tracked device. */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTransformTrackedDeviceRelative(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("TrackedDeviceIndex_t") int unTrackedDevice, @NativeType("HmdMatrix34_t const *") HmdMatrix34 pmatTrackedDeviceToOverlayTransform) {
        return nVROverlay_SetOverlayTransformTrackedDeviceRelative(ulOverlayHandle, unTrackedDevice, pmatTrackedDeviceToOverlayTransform.address());
    }

    // --- [ VROverlay_GetOverlayTransformTrackedDeviceRelative ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayTransformTrackedDeviceRelative GetOverlayTransformTrackedDeviceRelative} */
    public static int nVROverlay_GetOverlayTransformTrackedDeviceRelative(long ulOverlayHandle, long punTrackedDevice, long pmatTrackedDeviceToOverlayTransform) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTransformTrackedDeviceRelative;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(ulOverlayHandle, punTrackedDevice, pmatTrackedDeviceToOverlayTransform, __functionAddress);
    }

    /** Gets the transform if it is relative to a tracked device. Returns an error if the transform is some other type. */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTransformTrackedDeviceRelative(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("TrackedDeviceIndex_t *") IntBuffer punTrackedDevice, @NativeType("HmdMatrix34_t *") HmdMatrix34 pmatTrackedDeviceToOverlayTransform) {
        if (CHECKS) {
            check(punTrackedDevice, 1);
        }
        return nVROverlay_GetOverlayTransformTrackedDeviceRelative(ulOverlayHandle, memAddress(punTrackedDevice), pmatTrackedDeviceToOverlayTransform.address());
    }

    // --- [ VROverlay_SetOverlayTransformTrackedDeviceComponent ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayTransformTrackedDeviceComponent SetOverlayTransformTrackedDeviceComponent} */
    public static int nVROverlay_SetOverlayTransformTrackedDeviceComponent(long ulOverlayHandle, int unDeviceIndex, long pchComponentName) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTransformTrackedDeviceComponent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, unDeviceIndex, pchComponentName, __functionAddress);
    }

    /**
     * Sets the transform to draw the overlay on a rendermodel component mesh instead of a quad. This will only draw when the system is drawing the device.
     * Overlays with this transform type cannot receive mouse events.
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTransformTrackedDeviceComponent(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("TrackedDeviceIndex_t") int unDeviceIndex, @NativeType("char const *") ByteBuffer pchComponentName) {
        if (CHECKS) {
            checkNT1(pchComponentName);
        }
        return nVROverlay_SetOverlayTransformTrackedDeviceComponent(ulOverlayHandle, unDeviceIndex, memAddress(pchComponentName));
    }

    /**
     * Sets the transform to draw the overlay on a rendermodel component mesh instead of a quad. This will only draw when the system is drawing the device.
     * Overlays with this transform type cannot receive mouse events.
     */
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

    /** Unsafe version of: {@link #VROverlay_GetOverlayTransformTrackedDeviceComponent GetOverlayTransformTrackedDeviceComponent} */
    public static int nVROverlay_GetOverlayTransformTrackedDeviceComponent(long ulOverlayHandle, long punDeviceIndex, long pchComponentName, int unComponentNameSize) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTransformTrackedDeviceComponent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(ulOverlayHandle, punDeviceIndex, pchComponentName, unComponentNameSize, __functionAddress);
    }

    /** Gets the transform information when the overlay is rendering on a component. */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTransformTrackedDeviceComponent(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("TrackedDeviceIndex_t *") IntBuffer punDeviceIndex, @NativeType("char *") ByteBuffer pchComponentName) {
        if (CHECKS) {
            check(punDeviceIndex, 1);
        }
        return nVROverlay_GetOverlayTransformTrackedDeviceComponent(ulOverlayHandle, memAddress(punDeviceIndex), memAddress(pchComponentName), pchComponentName.remaining());
    }

    // --- [ VROverlay_GetOverlayTransformOverlayRelative ] ---

    public static int nVROverlay_GetOverlayTransformOverlayRelative(long ulOverlayHandle, long ulOverlayHandleParent, long pmatParentOverlayToOverlayTransform) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTransformOverlayRelative;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(ulOverlayHandle, ulOverlayHandleParent, pmatParentOverlayToOverlayTransform, __functionAddress);
    }

    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTransformOverlayRelative(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayHandle_t *") LongBuffer ulOverlayHandleParent, @NativeType("HmdMatrix34_t *") HmdMatrix34 pmatParentOverlayToOverlayTransform) {
        if (CHECKS) {
            check(ulOverlayHandleParent, 1);
        }
        return nVROverlay_GetOverlayTransformOverlayRelative(ulOverlayHandle, memAddress(ulOverlayHandleParent), pmatParentOverlayToOverlayTransform.address());
    }

    // --- [ VROverlay_SetOverlayTransformOverlayRelative ] ---

    public static int nVROverlay_SetOverlayTransformOverlayRelative(long ulOverlayHandle, long ulOverlayHandleParent, long pmatParentOverlayToOverlayTransform) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTransformOverlayRelative;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJJPI(ulOverlayHandle, ulOverlayHandleParent, pmatParentOverlayToOverlayTransform, __functionAddress);
    }

    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTransformOverlayRelative(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayHandle_t") long ulOverlayHandleParent, @NativeType("HmdMatrix34_t *") HmdMatrix34 pmatParentOverlayToOverlayTransform) {
        return nVROverlay_SetOverlayTransformOverlayRelative(ulOverlayHandle, ulOverlayHandleParent, pmatParentOverlayToOverlayTransform.address());
    }

    // --- [ VROverlay_SetOverlayTransformCursor ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayTransformCursor SetOverlayTransformCursor} */
    public static int nVROverlay_SetOverlayTransformCursor(long ulCursorOverlayHandle, long pvHotspot) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTransformCursor;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulCursorOverlayHandle, pvHotspot, __functionAddress);
    }

    /**
     * Sets the hotspot for the specified overlay when that overlay is used as a cursor.
     * 
     * <p>These are in texture space with 0,0 in the upper left corner of the texture and 1,1 in the lower right corner of the texture.</p>
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTransformCursor(@NativeType("VROverlayHandle_t") long ulCursorOverlayHandle, @NativeType("HmdVector2_t const *") HmdVector2 pvHotspot) {
        return nVROverlay_SetOverlayTransformCursor(ulCursorOverlayHandle, pvHotspot.address());
    }

    // --- [ VROverlay_GetOverlayTransformCursor ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayTransformCursor GetOverlayTransformCursor} */
    public static int nVROverlay_GetOverlayTransformCursor(long ulOverlayHandle, long pvHotspot) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTransformCursor;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pvHotspot, __functionAddress);
    }

    /** Gets cursor hotspot/transform for the specified overlay. */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTransformCursor(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("HmdVector2_t *") HmdVector2 pvHotspot) {
        return nVROverlay_GetOverlayTransformCursor(ulOverlayHandle, pvHotspot.address());
    }

    // --- [ VROverlay_SetOverlayTransformProjection ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayTransformProjection SetOverlayTransformProjection} */
    public static int nVROverlay_SetOverlayTransformProjection(long ulOverlayHandle, int eTrackingOrigin, long pmatTrackingOriginToOverlayTransform, long pProjection, int eEye) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTransformProjection;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(ulOverlayHandle, eTrackingOrigin, pmatTrackingOriginToOverlayTransform, pProjection, eEye, __functionAddress);
    }

    /** Sets the overlay as a projection overlay. */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTransformProjection(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("ETrackingUniverseOrigin") int eTrackingOrigin, @NativeType("HmdMatrix34_t *") HmdMatrix34 pmatTrackingOriginToOverlayTransform, @NativeType("VROverlayProjection_t *") VROverlayProjection pProjection, @NativeType("EVREye") int eEye) {
        return nVROverlay_SetOverlayTransformProjection(ulOverlayHandle, eTrackingOrigin, pmatTrackingOriginToOverlayTransform.address(), pProjection.address(), eEye);
    }

    // --- [ VROverlay_ShowOverlay ] ---

    /** Shows the VR overlay. For dashboard overlays, only the Dashboard Manager is allowed to call this. */
    @NativeType("EVROverlayError")
    public static int VROverlay_ShowOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.ShowOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, __functionAddress);
    }

    // --- [ VROverlay_HideOverlay ] ---

    /** Hides the VR overlay. For dashboard overlays, only the Dashboard Manager is allowed to call this. */
    @NativeType("EVROverlayError")
    public static int VROverlay_HideOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.HideOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, __functionAddress);
    }

    // --- [ VROverlay_IsOverlayVisible ] ---

    /** Returns true if the overlay is visible. */
    @NativeType("bool")
    public static boolean VROverlay_IsOverlayVisible(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.IsOverlayVisible;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJZ(ulOverlayHandle, __functionAddress);
    }

    // --- [ VROverlay_GetTransformForOverlayCoordinates ] ---

    /** Unsafe version of: {@link #VROverlay_GetTransformForOverlayCoordinates GetTransformForOverlayCoordinates} */
    public static native int nVROverlay_GetTransformForOverlayCoordinates(long ulOverlayHandle, int eTrackingOrigin, long coordinatesInOverlay, long pmatTransform, long __functionAddress);

    /** Unsafe version of: {@link #VROverlay_GetTransformForOverlayCoordinates GetTransformForOverlayCoordinates} */
    public static int nVROverlay_GetTransformForOverlayCoordinates(long ulOverlayHandle, int eTrackingOrigin, long coordinatesInOverlay, long pmatTransform) {
        long __functionAddress = OpenVR.VROverlay.GetTransformForOverlayCoordinates;
        if (CHECKS) {
            check(__functionAddress);
        }
        return nVROverlay_GetTransformForOverlayCoordinates(ulOverlayHandle, eTrackingOrigin, coordinatesInOverlay, pmatTransform, __functionAddress);
    }

    /**
     * Get the transform in 3d space associated with a specific 2d point in the overlay's coordinate space (where 0,0 is the lower left). -Z points out of the
     * overlay.
     *
     * @param eTrackingOrigin one of:<br><table><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseSeated}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseStanding}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated}</td></tr></table>
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetTransformForOverlayCoordinates(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("ETrackingUniverseOrigin") int eTrackingOrigin, @NativeType("HmdVector2_t") HmdVector2 coordinatesInOverlay, @NativeType("HmdMatrix34_t *") HmdMatrix34 pmatTransform) {
        return nVROverlay_GetTransformForOverlayCoordinates(ulOverlayHandle, eTrackingOrigin, coordinatesInOverlay.address(), pmatTransform.address());
    }

    // --- [ VROverlay_WaitFrameSync ] ---

    @NativeType("EVROverlayError")
    public static int VROverlay_WaitFrameSync(@NativeType("uint32_t") int nTimeoutMs) {
        long __functionAddress = OpenVR.VROverlay.WaitFrameSync;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(nTimeoutMs, __functionAddress);
    }

    // --- [ VROverlay_PollNextOverlayEvent ] ---

    /** Unsafe version of: {@link #VROverlay_PollNextOverlayEvent PollNextOverlayEvent} */
    public static boolean nVROverlay_PollNextOverlayEvent(long ulOverlayHandle, long pEvent, int uncbVREvent) {
        long __functionAddress = OpenVR.VROverlay.PollNextOverlayEvent;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPZ(ulOverlayHandle, pEvent, uncbVREvent, __functionAddress);
    }

    /**
     * Returns true and fills the event with the next event on the overlay's event queue, if there is one.
     * 
     * <p>If there are no events this method returns false. {@code uncbVREvent} should be the size in bytes of the {@link VREvent} struct.</p>
     */
    @NativeType("bool")
    public static boolean VROverlay_PollNextOverlayEvent(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VREvent_t *") VREvent pEvent, @NativeType("uint32_t") int uncbVREvent) {
        return nVROverlay_PollNextOverlayEvent(ulOverlayHandle, pEvent.address(), uncbVREvent);
    }

    /**
     * Returns true and fills the event with the next event on the overlay's event queue, if there is one.
     * 
     * <p>If there are no events this method returns false. {@code uncbVREvent} should be the size in bytes of the {@link VREvent} struct.</p>
     */
    @NativeType("bool")
    public static boolean VROverlay_PollNextOverlayEvent(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VREvent_t *") VREvent pEvent) {
        return nVROverlay_PollNextOverlayEvent(ulOverlayHandle, pEvent.address(), VREvent.SIZEOF);
    }

    // --- [ VROverlay_GetOverlayInputMethod ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayInputMethod GetOverlayInputMethod} */
    public static int nVROverlay_GetOverlayInputMethod(long ulOverlayHandle, long peInputMethod) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayInputMethod;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, peInputMethod, __functionAddress);
    }

    /** Returns the current input settings for the specified overlay. */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayInputMethod(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayInputMethod *") IntBuffer peInputMethod) {
        if (CHECKS) {
            check(peInputMethod, 1);
        }
        return nVROverlay_GetOverlayInputMethod(ulOverlayHandle, memAddress(peInputMethod));
    }

    // --- [ VROverlay_SetOverlayInputMethod ] ---

    /**
     * Sets the input settings for the specified overlay.
     *
     * @param eInputMethod one of:<br><table><tr><td>{@link VR#VROverlayInputMethod_None}</td><td>{@link VR#VROverlayInputMethod_Mouse}</td></tr></table>
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayInputMethod(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayInputMethod") int eInputMethod) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayInputMethod;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, eInputMethod, __functionAddress);
    }

    // --- [ VROverlay_GetOverlayMouseScale ] ---

    /** Unsafe version of: {@link #VROverlay_GetOverlayMouseScale GetOverlayMouseScale} */
    public static int nVROverlay_GetOverlayMouseScale(long ulOverlayHandle, long pvecMouseScale) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayMouseScale;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pvecMouseScale, __functionAddress);
    }

    /**
     * Gets the mouse scaling factor that is used for mouse events. The actual texture may be a different size, but this is typically the size of the
     * underlying UI in pixels.
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayMouseScale(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("HmdVector2_t *") HmdVector2 pvecMouseScale) {
        return nVROverlay_GetOverlayMouseScale(ulOverlayHandle, pvecMouseScale.address());
    }

    // --- [ VROverlay_SetOverlayMouseScale ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayMouseScale SetOverlayMouseScale} */
    public static int nVROverlay_SetOverlayMouseScale(long ulOverlayHandle, long pvecMouseScale) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayMouseScale;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pvecMouseScale, __functionAddress);
    }

    /**
     * Sets the mouse scaling factor that is used for mouse events. The actual texture may be a different size, but this is typically the size of the
     * underlying UI in pixels (not in world space).
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayMouseScale(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("HmdVector2_t const *") HmdVector2 pvecMouseScale) {
        return nVROverlay_SetOverlayMouseScale(ulOverlayHandle, pvecMouseScale.address());
    }

    // --- [ VROverlay_ComputeOverlayIntersection ] ---

    /** Unsafe version of: {@link #VROverlay_ComputeOverlayIntersection ComputeOverlayIntersection} */
    public static boolean nVROverlay_ComputeOverlayIntersection(long ulOverlayHandle, long pParams, long pResults) {
        long __functionAddress = OpenVR.VROverlay.ComputeOverlayIntersection;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPZ(ulOverlayHandle, pParams, pResults, __functionAddress);
    }

    /**
     * Computes the overlay-space pixel coordinates of where the ray intersects the overlay with the specified settings. Returns false if there is no
     * intersection.
     */
    @NativeType("bool")
    public static boolean VROverlay_ComputeOverlayIntersection(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayIntersectionParams_t const *") VROverlayIntersectionParams pParams, @NativeType("VROverlayIntersectionResults_t *") VROverlayIntersectionResults pResults) {
        return nVROverlay_ComputeOverlayIntersection(ulOverlayHandle, pParams.address(), pResults.address());
    }

    // --- [ VROverlay_IsHoverTargetOverlay ] ---

    /**
     * Returns true if the specified overlay is the hover target. An overlay is the hover target when it is the last overlay "moused over" by the virtual
     * mouse pointer.
     */
    @NativeType("bool")
    public static boolean VROverlay_IsHoverTargetOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.IsHoverTargetOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJZ(ulOverlayHandle, __functionAddress);
    }

    // --- [ VROverlay_SetOverlayIntersectionMask ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayIntersectionMask SetOverlayIntersectionMask} */
    public static int nVROverlay_SetOverlayIntersectionMask(long ulOverlayHandle, long pMaskPrimitives, int unNumMaskPrimitives, int unPrimitiveSize) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayIntersectionMask;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pMaskPrimitives, unNumMaskPrimitives, unPrimitiveSize, __functionAddress);
    }

    /** Sets a list of primitives to be used for controller ray intersection typically the size of the underlying UI in pixels (not in world space). */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayIntersectionMask(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayIntersectionMaskPrimitive_t *") VROverlayIntersectionMaskPrimitive.Buffer pMaskPrimitives) {
        return nVROverlay_SetOverlayIntersectionMask(ulOverlayHandle, pMaskPrimitives.address(), pMaskPrimitives.remaining(), VROverlayIntersectionMaskPrimitive.SIZEOF);
    }

    // --- [ VROverlay_TriggerLaserMouseHapticVibration ] ---

    /** Triggers a haptic event on the laser mouse controller for the specified overlay. */
    @NativeType("EVROverlayError")
    public static int VROverlay_TriggerLaserMouseHapticVibration(@NativeType("VROverlayHandle_t") long ulOverlayHandle, float fDurationSeconds, float fFrequency, float fAmplitude) {
        long __functionAddress = OpenVR.VROverlay.TriggerLaserMouseHapticVibration;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, fDurationSeconds, fFrequency, fAmplitude, __functionAddress);
    }

    // --- [ VROverlay_SetOverlayCursor ] ---

    /** Sets the cursor to use for the specified overlay. This will be drawn instead of the generic blob when the laser mouse is pointed at the specified overlay. */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayCursor(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("VROverlayHandle_t") long ulCursorHandle) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayCursor;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJJI(ulOverlayHandle, ulCursorHandle, __functionAddress);
    }

    // --- [ VROverlay_SetOverlayCursorPositionOverride ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayCursorPositionOverride SetOverlayCursorPositionOverride} */
    public static int nVROverlay_SetOverlayCursorPositionOverride(long ulOverlayHandle, long pvCursor) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayCursorPositionOverride;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pvCursor, __functionAddress);
    }

    /**
     * Sets the override cursor position to use for this overlay in overlay mouse coordinates.
     * 
     * <p>This position will be used to draw the cursor instead of whatever the laser mouse cursor position is.</p>
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayCursorPositionOverride(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("HmdVector2_t const *") HmdVector2 pvCursor) {
        return nVROverlay_SetOverlayCursorPositionOverride(ulOverlayHandle, pvCursor.address());
    }

    // --- [ VROverlay_ClearOverlayCursorPositionOverride ] ---

    /** Clears the override cursor position for this overlay. */
    @NativeType("EVROverlayError")
    public static int VROverlay_ClearOverlayCursorPositionOverride(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.ClearOverlayCursorPositionOverride;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, __functionAddress);
    }

    // --- [ VROverlay_SetOverlayTexture ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayTexture SetOverlayTexture} */
    public static int nVROverlay_SetOverlayTexture(long ulOverlayHandle, long pTexture) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayTexture;
        if (CHECKS) {
            check(__functionAddress);
            Texture.validate(pTexture);
        }
        return callJPI(ulOverlayHandle, pTexture, __functionAddress);
    }

    /** Texture to draw for the overlay. This function can only be called by the overlay's creator or renderer process (see {@link #VROverlay_SetOverlayRenderingPid SetOverlayRenderingPid}). */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayTexture(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("Texture_t const *") Texture pTexture) {
        return nVROverlay_SetOverlayTexture(ulOverlayHandle, pTexture.address());
    }

    // --- [ VROverlay_ClearOverlayTexture ] ---

    /** Use this to tell the overlay system to release the texture set for this overlay. */
    @NativeType("EVROverlayError")
    public static int VROverlay_ClearOverlayTexture(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.ClearOverlayTexture;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, __functionAddress);
    }

    // --- [ VROverlay_SetOverlayRaw ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayRaw SetOverlayRaw} */
    public static int nVROverlay_SetOverlayRaw(long ulOverlayHandle, long pvBuffer, int unWidth, int unHeight, int unBytesPerPixel) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayRaw;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pvBuffer, unWidth, unHeight, unBytesPerPixel, __functionAddress);
    }

    /**
     * Separate interface for providing the data as a stream of bytes, but there is an upper bound on data that can be sent. This function can only be called
     * by the overlay's renderer process.
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayRaw(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("void *") ByteBuffer pvBuffer, @NativeType("uint32_t") int unWidth, @NativeType("uint32_t") int unHeight, @NativeType("uint32_t") int unBytesPerPixel) {
        return nVROverlay_SetOverlayRaw(ulOverlayHandle, memAddress(pvBuffer), unWidth, unHeight, unBytesPerPixel);
    }

    // --- [ VROverlay_SetOverlayFromFile ] ---

    /** Unsafe version of: {@link #VROverlay_SetOverlayFromFile SetOverlayFromFile} */
    public static int nVROverlay_SetOverlayFromFile(long ulOverlayHandle, long pchFilePath) {
        long __functionAddress = OpenVR.VROverlay.SetOverlayFromFile;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, pchFilePath, __functionAddress);
    }

    /**
     * Separate interface for providing the image through a filename: can be png or jpg, and should not be bigger than 1920x1080. This function can only be
     * called by the overlay's renderer process
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetOverlayFromFile(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("char const *") ByteBuffer pchFilePath) {
        if (CHECKS) {
            checkNT1(pchFilePath);
        }
        return nVROverlay_SetOverlayFromFile(ulOverlayHandle, memAddress(pchFilePath));
    }

    /**
     * Separate interface for providing the image through a filename: can be png or jpg, and should not be bigger than 1920x1080. This function can only be
     * called by the overlay's renderer process
     */
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

    /** Unsafe version of: {@link #VROverlay_GetOverlayTexture GetOverlayTexture} */
    public static int nVROverlay_GetOverlayTexture(long ulOverlayHandle, long pNativeTextureHandle, long pNativeTextureRef, long pWidth, long pHeight, long pNativeFormat, long pAPIType, long pColorSpace, long pTextureBounds) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTexture;
        if (CHECKS) {
            check(__functionAddress);
            check(pNativeTextureRef);
        }
        return callJPPPPPPPPI(ulOverlayHandle, pNativeTextureHandle, pNativeTextureRef, pWidth, pHeight, pNativeFormat, pAPIType, pColorSpace, pTextureBounds, __functionAddress);
    }

    /**
     * Get the native texture handle/device for an overlay you have created.
     * 
     * <p>On windows this handle will be a ID3D11ShaderResourceView with a ID3D11Texture2D bound.</p>
     * 
     * <p>The texture will always be sized to match the backing texture you supplied in SetOverlayTexture above.</p>
     * 
     * <p>You MUST call {@link #VROverlay_ReleaseNativeOverlayHandle ReleaseNativeOverlayHandle} with {@code pNativeTextureHandle} once you are done with this texture.</p>
     * 
     * <p>{@code pNativeTextureHandle} is an OUTPUT, it will be a pointer to a {@code ID3D11ShaderResourceView *}.
     * {@code pNativeTextureRef} is an INPUT and should be a {@code ID3D11Resource *}. The device used by {@code pNativeTextureRef} will be used to bind
     * {@code pNativeTextureHandle}.</p>
     */
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

    /**
     * Release the {@code pNativeTextureHandle} provided from the {@link #VROverlay_GetOverlayTexture GetOverlayTexture} call, this allows the system to free the underlying GPU resources for
     * this object, so only do it once you stop rendering this texture.
     */
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

    /** Unsafe version of: {@link #VROverlay_GetOverlayTextureSize GetOverlayTextureSize} */
    public static int nVROverlay_GetOverlayTextureSize(long ulOverlayHandle, long pWidth, long pHeight) {
        long __functionAddress = OpenVR.VROverlay.GetOverlayTextureSize;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPI(ulOverlayHandle, pWidth, pHeight, __functionAddress);
    }

    /** Get the size of the overlay texture. */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetOverlayTextureSize(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t *") IntBuffer pWidth, @NativeType("uint32_t *") IntBuffer pHeight) {
        if (CHECKS) {
            check(pWidth, 1);
            check(pHeight, 1);
        }
        return nVROverlay_GetOverlayTextureSize(ulOverlayHandle, memAddress(pWidth), memAddress(pHeight));
    }

    // --- [ VROverlay_CreateDashboardOverlay ] ---

    /** Unsafe version of: {@link #VROverlay_CreateDashboardOverlay CreateDashboardOverlay} */
    public static int nVROverlay_CreateDashboardOverlay(long pchOverlayKey, long pchOverlayFriendlyName, long pMainHandle, long pThumbnailHandle) {
        long __functionAddress = OpenVR.VROverlay.CreateDashboardOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(pchOverlayKey, pchOverlayFriendlyName, pMainHandle, pThumbnailHandle, __functionAddress);
    }

    /** Creates a dashboard overlay and returns its handle. */
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

    /** Creates a dashboard overlay and returns its handle. */
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

    /** Returns true if the dashboard is visible. */
    @NativeType("bool")
    public static boolean VROverlay_IsDashboardVisible() {
        long __functionAddress = OpenVR.VROverlay.IsDashboardVisible;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callZ(__functionAddress);
    }

    // --- [ VROverlay_IsActiveDashboardOverlay ] ---

    /** Returns true if the dashboard is visible and the specified overlay is the active system Overlay. */
    @NativeType("bool")
    public static boolean VROverlay_IsActiveDashboardOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle) {
        long __functionAddress = OpenVR.VROverlay.IsActiveDashboardOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJZ(ulOverlayHandle, __functionAddress);
    }

    // --- [ VROverlay_SetDashboardOverlaySceneProcess ] ---

    /** Sets the dashboard overlay to only appear when the specified process ID has scene focus. */
    @NativeType("EVROverlayError")
    public static int VROverlay_SetDashboardOverlaySceneProcess(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t") int unProcessId) {
        long __functionAddress = OpenVR.VROverlay.SetDashboardOverlaySceneProcess;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJI(ulOverlayHandle, unProcessId, __functionAddress);
    }

    // --- [ VROverlay_GetDashboardOverlaySceneProcess ] ---

    /** Unsafe version of: {@link #VROverlay_GetDashboardOverlaySceneProcess GetDashboardOverlaySceneProcess} */
    public static int nVROverlay_GetDashboardOverlaySceneProcess(long ulOverlayHandle, long punProcessId) {
        long __functionAddress = OpenVR.VROverlay.GetDashboardOverlaySceneProcess;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPI(ulOverlayHandle, punProcessId, __functionAddress);
    }

    /** Gets the process ID that this dashboard overlay requires to have scene focus. */
    @NativeType("EVROverlayError")
    public static int VROverlay_GetDashboardOverlaySceneProcess(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("uint32_t *") IntBuffer punProcessId) {
        if (CHECKS) {
            check(punProcessId, 1);
        }
        return nVROverlay_GetDashboardOverlaySceneProcess(ulOverlayHandle, memAddress(punProcessId));
    }

    // --- [ VROverlay_ShowDashboard ] ---

    /** Unsafe version of: {@link #VROverlay_ShowDashboard ShowDashboard} */
    public static void nVROverlay_ShowDashboard(long pchOverlayToShow) {
        long __functionAddress = OpenVR.VROverlay.ShowDashboard;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pchOverlayToShow, __functionAddress);
    }

    /** Shows the dashboard. */
    public static void VROverlay_ShowDashboard(@NativeType("char const *") ByteBuffer pchOverlayToShow) {
        if (CHECKS) {
            checkNT1(pchOverlayToShow);
        }
        nVROverlay_ShowDashboard(memAddress(pchOverlayToShow));
    }

    /** Shows the dashboard. */
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

    /** Returns the tracked device that has the laser pointer in the dashboard. */
    @NativeType("TrackedDeviceIndex_t")
    public static int VROverlay_GetPrimaryDashboardDevice() {
        long __functionAddress = OpenVR.VROverlay.GetPrimaryDashboardDevice;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(__functionAddress);
    }

    // --- [ VROverlay_ShowKeyboard ] ---

    /** Unsafe version of: {@link #VROverlay_ShowKeyboard ShowKeyboard} */
    public static int nVROverlay_ShowKeyboard(int eInputMode, int eLineInputMode, int unFlags, long pchDescription, int unCharMax, long pchExistingText, boolean bUseMinimalMode, long uUserValue) {
        long __functionAddress = OpenVR.VROverlay.ShowKeyboard;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPJI(eInputMode, eLineInputMode, unFlags, pchDescription, unCharMax, pchExistingText, bUseMinimalMode, uUserValue, __functionAddress);
    }

    /**
     * Show the virtual keyboard to accept input.
     * 
     * <p>In most cases, you should pass {@link VR#EKeyboardFlags_KeyboardFlag_Modal} to enable modal overlay behavior on the keyboard itself. See {@code EKeyboardFlags} for more.</p>
     *
     * @param eInputMode     one of:<br><table><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModeNormal}</td></tr><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModePassword}</td></tr><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModeSubmit}</td></tr></table>
     * @param eLineInputMode one of:<br><table><tr><td>{@link VR#EGamepadTextInputLineMode_k_EGamepadTextInputLineModeSingleLine}</td></tr><tr><td>{@link VR#EGamepadTextInputLineMode_k_EGamepadTextInputLineModeMultipleLines}</td></tr></table>
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_ShowKeyboard(@NativeType("EGamepadTextInputMode") int eInputMode, @NativeType("EGamepadTextInputLineMode") int eLineInputMode, @NativeType("uint32_t") int unFlags, @NativeType("char const *") ByteBuffer pchDescription, @NativeType("uint32_t") int unCharMax, @NativeType("char const *") ByteBuffer pchExistingText, @NativeType("bool") boolean bUseMinimalMode, @NativeType("uint64_t") long uUserValue) {
        if (CHECKS) {
            checkNT1(pchDescription);
            checkNT1(pchExistingText);
        }
        return nVROverlay_ShowKeyboard(eInputMode, eLineInputMode, unFlags, memAddress(pchDescription), unCharMax, memAddress(pchExistingText), bUseMinimalMode, uUserValue);
    }

    /**
     * Show the virtual keyboard to accept input.
     * 
     * <p>In most cases, you should pass {@link VR#EKeyboardFlags_KeyboardFlag_Modal} to enable modal overlay behavior on the keyboard itself. See {@code EKeyboardFlags} for more.</p>
     *
     * @param eInputMode     one of:<br><table><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModeNormal}</td></tr><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModePassword}</td></tr><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModeSubmit}</td></tr></table>
     * @param eLineInputMode one of:<br><table><tr><td>{@link VR#EGamepadTextInputLineMode_k_EGamepadTextInputLineModeSingleLine}</td></tr><tr><td>{@link VR#EGamepadTextInputLineMode_k_EGamepadTextInputLineModeMultipleLines}</td></tr></table>
     */
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

    /** Unsafe version of: {@link #VROverlay_ShowKeyboardForOverlay ShowKeyboardForOverlay} */
    public static int nVROverlay_ShowKeyboardForOverlay(long ulOverlayHandle, int eInputMode, int eLineInputMode, int unFlags, long pchDescription, int unCharMax, long pchExistingText, boolean bUseMinimalMode, long uUserValue) {
        long __functionAddress = OpenVR.VROverlay.ShowKeyboardForOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callJPPJI(ulOverlayHandle, eInputMode, eLineInputMode, unFlags, pchDescription, unCharMax, pchExistingText, bUseMinimalMode, uUserValue, __functionAddress);
    }

    /**
     * Show the virtual keyboard to accept input for an overlay.
     * 
     * <p>In most cases, you should pass {@link VR#EKeyboardFlags_KeyboardFlag_Modal} to enable modal overlay behavior on the keyboard itself. See {@code EKeyboardFlags} for more.</p>
     *
     * @param eInputMode     one of:<br><table><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModeNormal}</td></tr><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModePassword}</td></tr><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModeSubmit}</td></tr></table>
     * @param eLineInputMode one of:<br><table><tr><td>{@link VR#EGamepadTextInputLineMode_k_EGamepadTextInputLineModeSingleLine}</td></tr><tr><td>{@link VR#EGamepadTextInputLineMode_k_EGamepadTextInputLineModeMultipleLines}</td></tr></table>
     */
    @NativeType("EVROverlayError")
    public static int VROverlay_ShowKeyboardForOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("EGamepadTextInputMode") int eInputMode, @NativeType("EGamepadTextInputLineMode") int eLineInputMode, @NativeType("uint32_t") int unFlags, @NativeType("char const *") ByteBuffer pchDescription, @NativeType("uint32_t") int unCharMax, @NativeType("char const *") ByteBuffer pchExistingText, @NativeType("bool") boolean bUseMinimalMode, @NativeType("uint64_t") long uUserValue) {
        if (CHECKS) {
            checkNT1(pchDescription);
            checkNT1(pchExistingText);
        }
        return nVROverlay_ShowKeyboardForOverlay(ulOverlayHandle, eInputMode, eLineInputMode, unFlags, memAddress(pchDescription), unCharMax, memAddress(pchExistingText), bUseMinimalMode, uUserValue);
    }

    /**
     * Show the virtual keyboard to accept input for an overlay.
     * 
     * <p>In most cases, you should pass {@link VR#EKeyboardFlags_KeyboardFlag_Modal} to enable modal overlay behavior on the keyboard itself. See {@code EKeyboardFlags} for more.</p>
     *
     * @param eInputMode     one of:<br><table><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModeNormal}</td></tr><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModePassword}</td></tr><tr><td>{@link VR#EGamepadTextInputMode_k_EGamepadTextInputModeSubmit}</td></tr></table>
     * @param eLineInputMode one of:<br><table><tr><td>{@link VR#EGamepadTextInputLineMode_k_EGamepadTextInputLineModeSingleLine}</td></tr><tr><td>{@link VR#EGamepadTextInputLineMode_k_EGamepadTextInputLineModeMultipleLines}</td></tr></table>
     */
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

    /** Unsafe version of: {@link #VROverlay_GetKeyboardText GetKeyboardText} */
    public static int nVROverlay_GetKeyboardText(long pchText, int cchText) {
        long __functionAddress = OpenVR.VROverlay.GetKeyboardText;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(pchText, cchText, __functionAddress);
    }

    /** Get the text that was entered into the text input. */
    @NativeType("uint32_t")
    public static int VROverlay_GetKeyboardText(@Nullable @NativeType("char *") ByteBuffer pchText) {
        return nVROverlay_GetKeyboardText(memAddressSafe(pchText), remainingSafe(pchText));
    }

    /** Get the text that was entered into the text input. */
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

    /** Hide the virtual keyboard. */
    public static void VROverlay_HideKeyboard() {
        long __functionAddress = OpenVR.VROverlay.HideKeyboard;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

    // --- [ VROverlay_SetKeyboardTransformAbsolute ] ---

    /** Unsafe version of: {@link #VROverlay_SetKeyboardTransformAbsolute SetKeyboardTransformAbsolute} */
    public static void nVROverlay_SetKeyboardTransformAbsolute(int eTrackingOrigin, long pmatTrackingOriginToKeyboardTransform) {
        long __functionAddress = OpenVR.VROverlay.SetKeyboardTransformAbsolute;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(eTrackingOrigin, pmatTrackingOriginToKeyboardTransform, __functionAddress);
    }

    /**
     * Set the position of the keyboard in world space.
     *
     * @param eTrackingOrigin one of:<br><table><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseSeated}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseStanding}</td></tr><tr><td>{@link VR#ETrackingUniverseOrigin_TrackingUniverseRawAndUncalibrated}</td></tr></table>
     */
    public static void VROverlay_SetKeyboardTransformAbsolute(@NativeType("ETrackingUniverseOrigin") int eTrackingOrigin, @NativeType("HmdMatrix34_t const *") HmdMatrix34 pmatTrackingOriginToKeyboardTransform) {
        nVROverlay_SetKeyboardTransformAbsolute(eTrackingOrigin, pmatTrackingOriginToKeyboardTransform.address());
    }

    // --- [ VROverlay_SetKeyboardPositionForOverlay ] ---

    /** Unsafe version of: {@link #VROverlay_SetKeyboardPositionForOverlay SetKeyboardPositionForOverlay} */
    public static native void nVROverlay_SetKeyboardPositionForOverlay(long ulOverlayHandle, long avoidRect, long __functionAddress);

    /** Unsafe version of: {@link #VROverlay_SetKeyboardPositionForOverlay SetKeyboardPositionForOverlay} */
    public static void nVROverlay_SetKeyboardPositionForOverlay(long ulOverlayHandle, long avoidRect) {
        long __functionAddress = OpenVR.VROverlay.SetKeyboardPositionForOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        nVROverlay_SetKeyboardPositionForOverlay(ulOverlayHandle, avoidRect, __functionAddress);
    }

    /** Set the position of the keyboard in overlay space by telling it to avoid a rectangle in the overlay. Rectangle coords have (0,0) in the bottom left. */
    public static void VROverlay_SetKeyboardPositionForOverlay(@NativeType("VROverlayHandle_t") long ulOverlayHandle, @NativeType("HmdRect2_t") HmdRect2 avoidRect) {
        nVROverlay_SetKeyboardPositionForOverlay(ulOverlayHandle, avoidRect.address());
    }

    // --- [ VROverlay_ShowMessageOverlay ] ---

    /** Unsafe version of: {@link #VROverlay_ShowMessageOverlay ShowMessageOverlay} */
    public static int nVROverlay_ShowMessageOverlay(long pchText, long pchCaption, long pchButton0Text, long pchButton1Text, long pchButton2Text, long pchButton3Text) {
        long __functionAddress = OpenVR.VROverlay.ShowMessageOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPPI(pchText, pchCaption, pchButton0Text, pchButton1Text, pchButton2Text, pchButton3Text, __functionAddress);
    }

    /** Show the message overlay. This will block and return you a result. */
    @NativeType("VRMessageOverlayResponse")
    public static int VROverlay_ShowMessageOverlay(@NativeType("char const *") ByteBuffer pchText, @NativeType("char const *") ByteBuffer pchCaption, @NativeType("char const *") ByteBuffer pchButton0Text, @Nullable @NativeType("char const *") ByteBuffer pchButton1Text, @Nullable @NativeType("char const *") ByteBuffer pchButton2Text, @Nullable @NativeType("char const *") ByteBuffer pchButton3Text) {
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

    /** Show the message overlay. This will block and return you a result. */
    @NativeType("VRMessageOverlayResponse")
    public static int VROverlay_ShowMessageOverlay(@NativeType("char const *") CharSequence pchText, @NativeType("char const *") CharSequence pchCaption, @NativeType("char const *") CharSequence pchButton0Text, @Nullable @NativeType("char const *") CharSequence pchButton1Text, @Nullable @NativeType("char const *") CharSequence pchButton2Text, @Nullable @NativeType("char const *") CharSequence pchButton3Text) {
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

    /** If the calling process owns the overlay and it's open, this will close it. */
    public static void VROverlay_CloseMessageOverlay() {
        long __functionAddress = OpenVR.VROverlay.CloseMessageOverlay;
        if (CHECKS) {
            check(__functionAddress);
        }
        callV(__functionAddress);
    }

}
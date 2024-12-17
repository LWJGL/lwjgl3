/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.lwjgl.system.*;

public class OVRErrorCode {

    static { LibOVR.initialize(); }

    public static final int
        ovrSuccess                   = 0,
        ovrSuccess_NotVisible        = 1000,
        ovrSuccess_BoundaryInvalid   = 1001,
        ovrSuccess_DeviceUnavailable = 1001;

    public static final int
        ovrError_MemoryAllocationFailure           = -1000,
        ovrError_InvalidSession                    = -1002,
        ovrError_Timeout                           = -1003,
        ovrError_NotInitialized                    = -1004,
        ovrError_InvalidParameter                  = -1005,
        ovrError_ServiceError                      = -1006,
        ovrError_NoHmd                             = -1007,
        ovrError_Unsupported                       = -1009,
        ovrError_DeviceUnavailable                 = -1010,
        ovrError_InvalidHeadsetOrientation         = -1011,
        ovrError_ClientSkippedDestroy              = -1012,
        ovrError_ClientSkippedShutdown             = -1013,
        ovrError_ServiceDeadlockDetected           = -1014,
        ovrError_InvalidOperation                  = -1015,
        ovrError_InsufficientArraySize             = -1016,
        ovrError_NoExternalCameraInfo              = -1017,
        ovrError_LostTracking                      = -1018,
        ovrError_ExternalCameraInitializedFailed   = -1019,
        ovrError_ExternalCameraCaptureFailed       = -1020,
        ovrError_ExternalCameraNameListsBufferSize = -1021,
        ovrError_ExternalCameraNameListsMistmatch  = -1022,
        ovrError_ExternalCameraNotCalibrated       = -1023,
        ovrError_ExternalCameraNameWrongSize       = -1024,
        ovrError_AccessDenied                      = -1025,
        ovrError_AudioDeviceNotFound               = -2001,
        ovrError_AudioComError                     = -2002,
        ovrError_AudioInputDeviceNotFound          = -2003,
        ovrError_AudioOutputDeviceNotFound         = -2004,
        ovrError_Initialize                        = -3000,
        ovrError_LibLoad                           = -3001,
        ovrError_LibVersion                        = -3002,
        ovrError_ServiceConnection                 = -3003,
        ovrError_ServiceVersion                    = -3004,
        ovrError_IncompatibleOS                    = -3005,
        ovrError_DisplayInit                       = -3006,
        ovrError_ServerStart                       = -3007,
        ovrError_Reinitialization                  = -3008,
        ovrError_MismatchedAdapters                = -3009,
        ovrError_LeakingResources                  = -3010,
        ovrError_ClientVersion                     = -3011,
        ovrError_OutOfDateOS                       = -3012,
        ovrError_OutOfDateGfxDriver                = -3013,
        ovrError_IncompatibleGPU                   = -3014,
        ovrError_NoValidVRDisplaySystem            = -3015,
        ovrError_Obsolete                          = -3016,
        ovrError_DisabledOrDefaultAdapter          = -3017,
        ovrError_HybridGraphicsNotSupported        = -3018,
        ovrError_DisplayManagerInit                = -3019,
        ovrError_TrackerDriverInit                 = -3020,
        ovrError_LibSignCheck                      = -3021,
        ovrError_LibPath                           = -3022,
        ovrError_LibSymbols                        = -3023,
        ovrError_RemoteSession                     = -3024,
        ovrError_InitializeVulkan                  = -3025,
        ovrError_BlacklistedGfxDriver              = -3026,
        ovrError_Incomplete                        = -5000,
        ovrError_Abandoned                         = -5001,
        ovrError_DisplayLost                       = -6000,
        ovrError_TextureSwapChainFull              = -6001,
        ovrError_TextureSwapChainInvalid           = -6002,
        ovrError_GraphicsDeviceReset               = -6003,
        ovrError_DisplayRemoved                    = -6004,
        ovrError_ContentProtectionNotAvailable     = -6005,
        ovrError_ApplicationInvisible              = -6006,
        ovrError_Disallowed                        = -6007,
        ovrError_DisplayPluggedIncorrectly         = -6008,
        ovrError_DisplayLimitReached               = -6009,
        ovrError_RuntimeException                  = -7000,
        ovrError_NoCalibration                     = -9000,
        ovrError_OldVersion                        = -9001,
        ovrError_MisformattedBlock                 = -9002;

    protected OVRErrorCode() {
        throw new UnsupportedOperationException();
    }

    // --- [ OVR_SUCCESS ] ---

    /** {@code bool OVR_SUCCESS(ovrResult result)} */
    @NativeType("bool")
    public static boolean OVR_SUCCESS(@NativeType("ovrResult") int result) {
        return result >= 0;
    }

    // --- [ OVR_UNQUALIFIED_SUCCESS ] ---

    /** {@code bool OVR_UNQUALIFIED_SUCCESS(ovrResult result)} */
    @NativeType("bool")
    public static boolean OVR_UNQUALIFIED_SUCCESS(@NativeType("ovrResult") int result) {
        return result == ovrSuccess;
    }

    // --- [ OVR_FAILURE ] ---

    /** {@code bool OVR_FAILURE(ovrResult result)} */
    @NativeType("bool")
    public static boolean OVR_FAILURE(@NativeType("ovrResult") int result) {
        return !OVR_SUCCESS(result);
    }

}
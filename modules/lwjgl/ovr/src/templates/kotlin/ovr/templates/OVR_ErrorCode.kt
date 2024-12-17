/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package ovr.templates

import org.lwjgl.generator.*
import ovr.*

val OVR_ErrorCode = "OVRErrorCode".nativeClass(Module.OVR, prefixMethod = "OVR_", prefixConstant = "ovr") {
    EnumConstant(
        "Success".enum("0"),
        "Success_NotVisible".enum("1000"),
        "Success_BoundaryInvalid".enum("1001"),
        "Success_DeviceUnavailable".enum("1001")
    )

    EnumConstant(
        /* General errors */
        "Error_MemoryAllocationFailure".enum("-1000"),
        "Error_InvalidSession".enum("-1002"),
        "Error_Timeout".enum("-1003"),
        "Error_NotInitialized".enum("-1004"),
        "Error_InvalidParameter".enum("-1005"),
        "Error_ServiceError".enum("-1006"),
        "Error_NoHmd".enum("-1007"),
        "Error_Unsupported".enum("-1009"),
        "Error_DeviceUnavailable".enum("-1010"),
        "Error_InvalidHeadsetOrientation".enum("-1011"),
        "Error_ClientSkippedDestroy".enum("-1012"),
        "Error_ClientSkippedShutdown".enum("-1013"),
        "Error_ServiceDeadlockDetected".enum("-1014"),
        "Error_InvalidOperation".enum("-1015"),
        "Error_InsufficientArraySize".enum("-1016"),
        "Error_NoExternalCameraInfo".enum("-1017"),
        "Error_LostTracking".enum("-1018"),
        "Error_ExternalCameraInitializedFailed".enum("-1019"),
        "Error_ExternalCameraCaptureFailed".enum("-1020"),
        "Error_ExternalCameraNameListsBufferSize".enum("-1021"),
        "Error_ExternalCameraNameListsMistmatch".enum("-1022"),
        "Error_ExternalCameraNotCalibrated".enum("-1023"),
        "Error_ExternalCameraNameWrongSize".enum("-1024"),
        "Error_AccessDenied".enum("-1025"),

        /* Audio error range, reserved for Audio errors. */
        "Error_AudioDeviceNotFound".enum("-2001"),
        "Error_AudioComError".enum("-2002"),
        "Error_AudioInputDeviceNotFound".enum("-2003"),
        "Error_AudioOutputDeviceNotFound".enum("-2004"),

        /* Initialization errors. */
        "Error_Initialize".enum("-3000"),
        "Error_LibLoad".enum("-3001"),
        "Error_LibVersion".enum("-3002"),
        "Error_ServiceConnection".enum("-3003"),
        "Error_ServiceVersion".enum("-3004"),
        "Error_IncompatibleOS".enum("-3005"),
        "Error_DisplayInit".enum("-3006"),
        "Error_ServerStart".enum("-3007"),
        "Error_Reinitialization".enum("-3008"),
        "Error_MismatchedAdapters".enum("-3009"),
        "Error_LeakingResources".enum("-3010"),
        "Error_ClientVersion".enum("-3011"),
        "Error_OutOfDateOS".enum("-3012"),
        "Error_OutOfDateGfxDriver".enum("-3013"),
        "Error_IncompatibleGPU".enum("-3014"),
        "Error_NoValidVRDisplaySystem".enum("-3015"),
        "Error_Obsolete".enum("-3016"),
        "Error_DisabledOrDefaultAdapter".enum("-3017"),
        "Error_HybridGraphicsNotSupported".enum("-3018"),
        "Error_DisplayManagerInit".enum("-3019"),
        "Error_TrackerDriverInit".enum("-3020"),
        "Error_LibSignCheck".enum("-3021"),
        "Error_LibPath".enum("-3022"),
        "Error_LibSymbols".enum("-3023"),
        "Error_RemoteSession".enum("-3024"),
        "Error_InitializeVulkan".enum("-3025"),
        "Error_BlacklistedGfxDriver".enum("-3026"),

        /* Synchronization errors */
        "Error_Incomplete".enum("-5000"),
        "Error_Abandoned".enum("-5001"),

        /* Rendering errors */
        "Error_DisplayLost".enum("-6000"),
        "Error_TextureSwapChainFull".enum("-6001"),
        "Error_TextureSwapChainInvalid".enum("-6002"),
        "Error_GraphicsDeviceReset".enum("-6003"),
        "Error_DisplayRemoved".enum("-6004"),
        "Error_ContentProtectionNotAvailable".enum("-6005"),
        "Error_ApplicationInvisible".enum("-6006"),
        "Error_Disallowed".enum("-6007"),
        "Error_DisplayPluggedIncorrectly".enum("-6008"),
        "Error_DisplayLimitReached".enum("-6009"),

        /* Fatal errors */
        "Error_RuntimeException".enum("-7000"),

        /* Calibration errors */
        "Error_NoCalibration".enum("-9000"),
        "Error_OldVersion".enum("-9001"),
        "Error_MisformattedBlock".enum("-9002")
    )

    val SUCCESS = macro(expression = "result >= 0")..bool(
        "SUCCESS",

        ovrResult("result")
    )

    macro(expression = "result == ovrSuccess")..bool(
        "UNQUALIFIED_SUCCESS",

        SUCCESS["result"]
    )

    macro(expression = "!OVR_SUCCESS(result)")..bool(
        "FAILURE",

        SUCCESS["result"]
    )
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.ovr.templates

import org.lwjgl.generator.*
import org.lwjgl.ovr.*

val OVR_ErrorCode = "OVRErrorCode".nativeClass(OVR_PACKAGE, prefixMethod = "OVR_", prefixConstant = "ovr", library = OVR_LIBRARY) {
    nativeImport("OVR_ErrorCode.h")

    documentation = "LibOVR error code declarations."

    EnumConstant(
        "Success codes ({@code ovrSuccessType}). Success is a value greater or equal to 0, while all error types are negative values.",

        "Success".enum("This is a general success result.", "0"),
        "Success_NotVisible".enum(
            """
            Returned from a call to #SubmitFrame(). The call succeeded, but what the app rendered will not be visible on the HMD. Ideally the app should
            continue calling #SubmitFrame(), but not do any rendering. When the result becomes #Success, rendering should continue as usual.
            """,
            "1000"
        ),
        "Success_BoundaryInvalid".enum("Boundary is invalid due to sensor change or was not setup.", "1001"),
        "Success_DeviceUnavailable".enum("Device is not available for the requested operation.", "1001")
    )

    EnumConstant(
        "Error codes ({@code ovrErrorType})",

        /* General errors */
        "Error_MemoryAllocationFailure".enum("Failure to allocate memory.", "-1000"),
        "Error_InvalidSession".enum("Invalid ovrSession parameter provided.", "-1002"),
        "Error_Timeout".enum("The operation timed out.", "-1003"),
        "Error_NotInitialized".enum("The system or component has not been initialized.", "-1004"),
        "Error_InvalidParameter".enum("Invalid parameter provided. See error info or log for details.", "-1005"),
        "Error_ServiceError".enum("Generic service error. See error info or log for details.", "-1006"),
        "Error_NoHmd".enum("The given HMD doesn't exist.", "-1007"),
        "Error_Unsupported".enum("Function call is not supported on this hardware/software", "-1009"),
        "Error_DeviceUnavailable".enum("Specified device type isn't available.", "-1010"),
        "Error_InvalidHeadsetOrientation".enum("The headset was in an invalid orientation for the requested operation (e.g. vertically oriented during OVR#ovr_RecenterTrackingOrigin()).", "-1011"),
        "Error_ClientSkippedDestroy".enum("The client failed to call OVR#ovr_Destroy() on an active session before calling OVR#ovr_Shutdown(). Or the client crashed.", "-1012"),
        "Error_ClientSkippedShutdown".enum("The client failed to call OVR#ovr_Shutdown() or the client crashed.", "-1013"),
        "Error_ServiceDeadlockDetected".enum("The service watchdog discovered a deadlock.", "-1014"),
        "Error_InvalidOperation".enum("Function call is invalid for object's current state.", "-1015"),
        "Error_InsufficientArraySize".enum("Increase size of output array", "-1016"),
        "Error_NoExternalCameraInfo".enum("There is not any external camera information stored by ovrServer.", "-1017"),

        /* Audio error range, reserved for Audio errors. */
        "Error_AudioDeviceNotFound".enum("Failure to find the specified audio device.", "-2001"),
        "Error_AudioComError".enum("Generic COM error.", "-2002"),

        /* Initialization errors. */
        "Error_Initialize".enum("Generic initialization error.", "-3000"),
        "Error_LibLoad".enum("Couldn't load LibOVRRT.", "-3001"),
        "Error_LibVersion".enum("LibOVRRT version incompatibility.", "-3002"),
        "Error_ServiceConnection".enum("Couldn't connect to the OVR Service.", "-3003"),
        "Error_ServiceVersion".enum("OVR Service version incompatibility.", "-3004"),
        "Error_IncompatibleOS".enum("The operating system version is incompatible.", "-3005"),
        "Error_DisplayInit".enum("Unable to initialize the HMD display.", "-3006"),
        "Error_ServerStart".enum("Unable to start the server. Is it already running?", "-3007"),
        "Error_Reinitialization".enum("Attempting to re-initialize with a different version.", "-3008"),
        "Error_MismatchedAdapters".enum("Chosen rendering adapters between client and service do not match", "-3009"),
        "Error_LeakingResources".enum("Calling application has leaked resources", "-3010"),
        "Error_ClientVersion".enum("Client version too old to connect to service", "-3011"),
        "Error_OutOfDateOS".enum("The operating system is out of date.", "-3012"),
        "Error_OutOfDateGfxDriver".enum("The graphics driver is out of date.", "-3013"),
        "Error_IncompatibleGPU".enum("The graphics hardware is not supported", "-3014"),
        "Error_NoValidVRDisplaySystem".enum("No valid VR display system found.", "-3015"),
        "Error_Obsolete".enum("Feature or API is obsolete and no longer supported.", "-3016"),
        "Error_DisabledOrDefaultAdapter".enum("No supported VR display system found, but disabled or driverless adapter found.", "-3017"),
        "Error_HybridGraphicsNotSupported".enum("The system is using hybrid graphics (Optimus, etc...), which is not support.", "-3018"),
        "Error_DisplayManagerInit".enum("Initialization of the DisplayManager failed.", "-3019"),
        "Error_TrackerDriverInit".enum("Failed to get the interface for an attached tracker", "-3020"),
        "Error_LibSignCheck".enum("LibOVRRT signature check failure.", "-3021"),
        "Error_LibPath".enum("LibOVRRT path failure.", "-3022"),
        "Error_LibSymbols".enum("LibOVRRT symbol resolution failure.", "-3023"),
        "Error_RemoteSession".enum("Failed to connect to the service because remote connections to the service are not allowed.", "-3024"),
        "Error_InitializeVulkan".enum("Vulkan initialization error.", "-3025"),

        /* Synchronization errors */
        "Error_Incomplete".enum("Requested async work not yet complete.", "-5000"),
        "Error_Abandoned".enum("Requested async work was abandoned and result is incomplete.", "-5001"),

        /* Rendering errors */
        "Error_DisplayLost".enum("In the event of a system-wide graphics reset or cable unplug this is returned to the app.", "-6000"),
        "Error_TextureSwapChainFull".enum("#CommitTextureSwapChain() was called too many times on a texture swapchain without calling submit to use the chain.", "-6001"),
        "Error_TextureSwapChainInvalid".enum("The {@code ovrTextureSwapChain} is in an incomplete or inconsistent state. Ensure #CommitTextureSwapChain() was called at least once first.", "-6002"),
        "Error_GraphicsDeviceReset".enum("Graphics device has been reset (TDR, etc...)", "-6003"),
        "Error_DisplayRemoved".enum("HMD removed from the display adapter", "-6004"),
        "Error_ContentProtectionNotAvailable".enum("Content protection is not available for the display", "-6005"),
        "Error_ApplicationInvisible".enum("Application declared itself as an invisible type and is not allowed to submit frames.", "-6006"),
        "Error_Disallowed".enum("The given request is disallowed under the current conditions.", "-6007"),
        "Error_DisplayPluggedIncorrectly".enum("Display portion of HMD is plugged into an incompatible port (ex: IGP)", "-6008"),

        /* Fatal errors */
        "Error_RuntimeException".enum("A runtime exception occurred. The application is required to shutdown LibOVR and re-initialize it before this error state will be cleared.", "-7000"),

        /* Calibration errors */
        "Error_NoCalibration".enum("Result of a missing calibration block.", "-9000"),
        "Error_OldVersion".enum("Result of an old calibration block.", "-9001"),
        "Error_MisformattedBlock".enum("Result of a bad calibration block due to lengths.", "-9002")
    )

    val SUCCESS = macro()..bool(
        "SUCCESS",
        """
        Indicates if an {@code ovrResult} indicates success.

        Some functions return additional successful values other than #Success and require usage of this macro to indicate success.
        """,

        ovrResult.IN("result", "the {@code ovrResult} to check")
    )

    macro()..bool(
        "UNQUALIFIED_SUCCESS",
        """
        Indicates if an {@code ovrResult} indicates an unqualified success.

        This is useful for indicating that the code intentionally wants to check for {@code result == ovrSuccess} as opposed to #SUCCESS(), which checks for
        {@code result >= ovrSuccess}.
        """,

        SUCCESS["result"]
    )

    macro()..bool(
        "FAILURE",
        "Indicates if an {@code ovrResult} indicates failure.",

        SUCCESS["result"]
    )
}
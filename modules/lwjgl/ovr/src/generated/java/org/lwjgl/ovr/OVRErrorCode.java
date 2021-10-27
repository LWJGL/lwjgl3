/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.lwjgl.system.*;

/** LibOVR error code declarations. */
public class OVRErrorCode {

    static { LibOVR.initialize(); }

    /**
     * Success codes ({@code ovrSuccessType}). Success is a value greater or equal to 0, while all error types are negative values.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrSuccess Success} - This is a general success result.</li>
     * <li>{@link #ovrSuccess_NotVisible Success_NotVisible} - 
     * Returned from a call to {@link OVR#ovr_SubmitFrame SubmitFrame}. The call succeeded, but what the app rendered will not be visible on the HMD. Ideally the app should
     * continue calling {@link OVR#ovr_SubmitFrame SubmitFrame}, but not do any rendering. When the result becomes {@link #ovrSuccess Success}, rendering should continue as usual.
     * </li>
     * <li>{@link #ovrSuccess_BoundaryInvalid Success_BoundaryInvalid} - Boundary is invalid due to sensor change or was not setup.</li>
     * <li>{@link #ovrSuccess_DeviceUnavailable Success_DeviceUnavailable} - Device is not available for the requested operation.</li>
     * </ul>
     */
    public static final int
        ovrSuccess                   = 0,
        ovrSuccess_NotVisible        = 1000,
        ovrSuccess_BoundaryInvalid   = 1001,
        ovrSuccess_DeviceUnavailable = 1001;

    /**
     * Error codes ({@code ovrErrorType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #ovrError_MemoryAllocationFailure Error_MemoryAllocationFailure} - Failure to allocate memory.</li>
     * <li>{@link #ovrError_InvalidSession Error_InvalidSession} - Invalid ovrSession parameter provided.</li>
     * <li>{@link #ovrError_Timeout Error_Timeout} - The operation timed out.</li>
     * <li>{@link #ovrError_NotInitialized Error_NotInitialized} - The system or component has not been initialized.</li>
     * <li>{@link #ovrError_InvalidParameter Error_InvalidParameter} - Invalid parameter provided. See error info or log for details.</li>
     * <li>{@link #ovrError_ServiceError Error_ServiceError} - Generic service error. See error info or log for details.</li>
     * <li>{@link #ovrError_NoHmd Error_NoHmd} - The given HMD doesn't exist.</li>
     * <li>{@link #ovrError_Unsupported Error_Unsupported} - Function call is not supported on this hardware/software</li>
     * <li>{@link #ovrError_DeviceUnavailable Error_DeviceUnavailable} - Specified device type isn't available.</li>
     * <li>{@link #ovrError_InvalidHeadsetOrientation Error_InvalidHeadsetOrientation} - The headset was in an invalid orientation for the requested operation (e.g. vertically oriented during {@link OVR#ovr_RecenterTrackingOrigin}).</li>
     * <li>{@link #ovrError_ClientSkippedDestroy Error_ClientSkippedDestroy} - The client failed to call {@link OVR#ovr_Destroy} on an active session before calling {@link OVR#ovr_Shutdown}. Or the client crashed.</li>
     * <li>{@link #ovrError_ClientSkippedShutdown Error_ClientSkippedShutdown} - The client failed to call {@link OVR#ovr_Shutdown} or the client crashed.</li>
     * <li>{@link #ovrError_ServiceDeadlockDetected Error_ServiceDeadlockDetected} - The service watchdog discovered a deadlock.</li>
     * <li>{@link #ovrError_InvalidOperation Error_InvalidOperation} - Function call is invalid for object's current state.</li>
     * <li>{@link #ovrError_InsufficientArraySize Error_InsufficientArraySize} - Increase size of output array</li>
     * <li>{@link #ovrError_NoExternalCameraInfo Error_NoExternalCameraInfo} - There is not any external camera information stored by ovrServer.</li>
     * <li>{@link #ovrError_LostTracking Error_LostTracking} - Tracking is lost when {@link OVR#ovr_GetDevicePoses GetDevicePoses} is called.</li>
     * <li>{@link #ovrError_ExternalCameraInitializedFailed Error_ExternalCameraInitializedFailed} - There was a problem initializing the external camera for capture</li>
     * <li>{@link #ovrError_ExternalCameraCaptureFailed Error_ExternalCameraCaptureFailed} - There was a problem capturing external camera frames</li>
     * <li>{@link #ovrError_ExternalCameraNameListsBufferSize Error_ExternalCameraNameListsBufferSize} - The external camera friendly name list and the external camera name list are not the fixed size({@link OVR#OVR_MAX_EXTERNAL_CAMERA_COUNT}).</li>
     * <li>{@link #ovrError_ExternalCameraNameListsMistmatch Error_ExternalCameraNameListsMistmatch} - The external camera friendly name list is not the same size as the external camera name list.</li>
     * <li>{@link #ovrError_ExternalCameraNotCalibrated Error_ExternalCameraNotCalibrated} - The external camera property has not been sent to OVRServer when the user tries to open the camera.</li>
     * <li>{@link #ovrError_ExternalCameraNameWrongSize Error_ExternalCameraNameWrongSize} - The external camera name is larger than {@link OVR#OVR_EXTERNAL_CAMERA_NAME_SIZE}-1</li>
     * <li>{@link #ovrError_AccessDenied Error_AccessDenied} - The caller doesn't have permissions for the requested action.</li>
     * <li>{@link #ovrError_AudioDeviceNotFound Error_AudioDeviceNotFound} - Failure to find neither audio input or output device.</li>
     * <li>{@link #ovrError_AudioComError Error_AudioComError} - Generic COM error.</li>
     * <li>{@link #ovrError_AudioInputDeviceNotFound Error_AudioInputDeviceNotFound} - Failure to find the specified audio input device.</li>
     * <li>{@link #ovrError_AudioOutputDeviceNotFound Error_AudioOutputDeviceNotFound} - Failure to find the specified audio output device.</li>
     * <li>{@link #ovrError_Initialize Error_Initialize} - Generic initialization error.</li>
     * <li>{@link #ovrError_LibLoad Error_LibLoad} - Couldn't load LibOVRRT.</li>
     * <li>{@link #ovrError_LibVersion Error_LibVersion} - LibOVRRT version incompatibility.</li>
     * <li>{@link #ovrError_ServiceConnection Error_ServiceConnection} - Couldn't connect to the OVR Service.</li>
     * <li>{@link #ovrError_ServiceVersion Error_ServiceVersion} - OVR Service version incompatibility.</li>
     * <li>{@link #ovrError_IncompatibleOS Error_IncompatibleOS} - The operating system version is incompatible.</li>
     * <li>{@link #ovrError_DisplayInit Error_DisplayInit} - Unable to initialize the HMD display.</li>
     * <li>{@link #ovrError_ServerStart Error_ServerStart} - Unable to start the server. Is it already running?</li>
     * <li>{@link #ovrError_Reinitialization Error_Reinitialization} - Attempting to re-initialize with a different version.</li>
     * <li>{@link #ovrError_MismatchedAdapters Error_MismatchedAdapters} - Chosen rendering adapters between client and service do not match</li>
     * <li>{@link #ovrError_LeakingResources Error_LeakingResources} - Calling application has leaked resources</li>
     * <li>{@link #ovrError_ClientVersion Error_ClientVersion} - Client version too old to connect to service</li>
     * <li>{@link #ovrError_OutOfDateOS Error_OutOfDateOS} - The operating system is out of date.</li>
     * <li>{@link #ovrError_OutOfDateGfxDriver Error_OutOfDateGfxDriver} - The graphics driver is out of date.</li>
     * <li>{@link #ovrError_IncompatibleGPU Error_IncompatibleGPU} - The graphics hardware is not supported</li>
     * <li>{@link #ovrError_NoValidVRDisplaySystem Error_NoValidVRDisplaySystem} - No valid VR display system found.</li>
     * <li>{@link #ovrError_Obsolete Error_Obsolete} - Feature or API is obsolete and no longer supported.</li>
     * <li>{@link #ovrError_DisabledOrDefaultAdapter Error_DisabledOrDefaultAdapter} - No supported VR display system found, but disabled or driverless adapter found.</li>
     * <li>{@link #ovrError_HybridGraphicsNotSupported Error_HybridGraphicsNotSupported} - The system is using hybrid graphics (Optimus, etc...), which is not support.</li>
     * <li>{@link #ovrError_DisplayManagerInit Error_DisplayManagerInit} - Initialization of the DisplayManager failed.</li>
     * <li>{@link #ovrError_TrackerDriverInit Error_TrackerDriverInit} - Failed to get the interface for an attached tracker</li>
     * <li>{@link #ovrError_LibSignCheck Error_LibSignCheck} - LibOVRRT signature check failure.</li>
     * <li>{@link #ovrError_LibPath Error_LibPath} - LibOVRRT path failure.</li>
     * <li>{@link #ovrError_LibSymbols Error_LibSymbols} - LibOVRRT symbol resolution failure.</li>
     * <li>{@link #ovrError_RemoteSession Error_RemoteSession} - Failed to connect to the service because remote connections to the service are not allowed.</li>
     * <li>{@link #ovrError_InitializeVulkan Error_InitializeVulkan} - Vulkan initialization error.</li>
     * <li>{@link #ovrError_BlacklistedGfxDriver Error_BlacklistedGfxDriver} - The graphics driver is black-listed.</li>
     * <li>{@link #ovrError_Incomplete Error_Incomplete} - Requested async work not yet complete.</li>
     * <li>{@link #ovrError_Abandoned Error_Abandoned} - Requested async work was abandoned and result is incomplete.</li>
     * <li>{@link #ovrError_DisplayLost Error_DisplayLost} - In the event of a system-wide graphics reset or cable unplug this is returned to the app.</li>
     * <li>{@link #ovrError_TextureSwapChainFull Error_TextureSwapChainFull} - {@link OVR#ovr_CommitTextureSwapChain CommitTextureSwapChain} was called too many times on a texture swapchain without calling submit to use the chain.</li>
     * <li>{@link #ovrError_TextureSwapChainInvalid Error_TextureSwapChainInvalid} - The {@code ovrTextureSwapChain} is in an incomplete or inconsistent state. Ensure {@link OVR#ovr_CommitTextureSwapChain CommitTextureSwapChain} was called at least once first.</li>
     * <li>{@link #ovrError_GraphicsDeviceReset Error_GraphicsDeviceReset} - Graphics device has been reset (TDR, etc...)</li>
     * <li>{@link #ovrError_DisplayRemoved Error_DisplayRemoved} - HMD removed from the display adapter</li>
     * <li>{@link #ovrError_ContentProtectionNotAvailable Error_ContentProtectionNotAvailable} - Content protection is not available for the display</li>
     * <li>{@link #ovrError_ApplicationInvisible Error_ApplicationInvisible} - Application declared itself as an invisible type and is not allowed to submit frames.</li>
     * <li>{@link #ovrError_Disallowed Error_Disallowed} - The given request is disallowed under the current conditions.</li>
     * <li>{@link #ovrError_DisplayPluggedIncorrectly Error_DisplayPluggedIncorrectly} - Display portion of HMD is plugged into an incompatible port (ex: IGP)</li>
     * <li>{@link #ovrError_DisplayLimitReached Error_DisplayLimitReached} - Returned in the event a virtual display system reaches a display limit</li>
     * <li>{@link #ovrError_RuntimeException Error_RuntimeException} - A runtime exception occurred. The application is required to shutdown LibOVR and re-initialize it before this error state will be cleared.</li>
     * <li>{@link #ovrError_NoCalibration Error_NoCalibration} - Result of a missing calibration block.</li>
     * <li>{@link #ovrError_OldVersion Error_OldVersion} - Result of an old calibration block.</li>
     * <li>{@link #ovrError_MisformattedBlock Error_MisformattedBlock} - Result of a bad calibration block due to lengths.</li>
     * </ul>
     */
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

    /**
     * Indicates if an {@code ovrResult} indicates success.
     * 
     * <p>Some functions return additional successful values other than {@link #ovrSuccess Success} and require usage of this macro to indicate success.</p>
     *
     * @param result the {@code ovrResult} to check
     */
    @NativeType("bool")
    public static boolean OVR_SUCCESS(@NativeType("ovrResult") int result) {
        return result >= 0;
    }

    // --- [ OVR_UNQUALIFIED_SUCCESS ] ---

    /**
     * Indicates if an {@code ovrResult} indicates an unqualified success.
     * 
     * <p>This is useful for indicating that the code intentionally wants to check for {@code result == ovrSuccess} as opposed to {@link #OVR_SUCCESS SUCCESS}, which checks for
     * {@code result >= ovrSuccess}.</p>
     *
     * @param result the {@code ovrResult} to check
     */
    @NativeType("bool")
    public static boolean OVR_UNQUALIFIED_SUCCESS(@NativeType("ovrResult") int result) {
        return result == ovrSuccess;
    }

    // --- [ OVR_FAILURE ] ---

    /**
     * Indicates if an {@code ovrResult} indicates failure.
     *
     * @param result the {@code ovrResult} to check
     */
    @NativeType("bool")
    public static boolean OVR_FAILURE(@NativeType("ovrResult") int result) {
        return !OVR_SUCCESS(result);
    }

}
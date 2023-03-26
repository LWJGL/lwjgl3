/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_haptic_pcm">XR_FB_haptic_pcm</a> extension.
 * 
 * <p>This extension enables applications to trigger haptic effects using Pulse Code Modulation (PCM) buffers.</p>
 */
public class FBHapticPcm {

    /** The extension specification version. */
    public static final int XR_FB_haptic_pcm_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_HAPTIC_PCM_EXTENSION_NAME = "XR_FB_haptic_pcm";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_HAPTIC_PCM_VIBRATION_FB TYPE_HAPTIC_PCM_VIBRATION_FB}</li>
     * <li>{@link #XR_TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB}</li>
     * <li>{@link #XR_TYPE_DEVICE_PCM_SAMPLE_RATE_GET_INFO_FB TYPE_DEVICE_PCM_SAMPLE_RATE_GET_INFO_FB}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_HAPTIC_PCM_VIBRATION_FB            = 1000209001,
        XR_TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB    = 1000209002,
        XR_TYPE_DEVICE_PCM_SAMPLE_RATE_GET_INFO_FB = 1000209002;

    /** API Constants */
    public static final int XR_MAX_HAPTIC_PCM_BUFFER_SIZE_FB = 0xFA0;

    protected FBHapticPcm() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetDeviceSampleRateFB ] ---

    /** Unsafe version of: {@link #xrGetDeviceSampleRateFB GetDeviceSampleRateFB} */
    public static int nxrGetDeviceSampleRateFB(XrSession session, long hapticActionInfo, long deviceSampleRate) {
        long __functionAddress = session.getCapabilities().xrGetDeviceSampleRateFB;
        if (CHECKS) {
            check(__functionAddress);
            XrHapticActionInfo.validate(hapticActionInfo);
        }
        return callPPPI(session.address(), hapticActionInfo, deviceSampleRate, __functionAddress);
    }

    /**
     * Get device sample rate.
     * 
     * <h5>C Specification</h5>
     * 
     * <pre><code>
     * XrResult xrGetDeviceSampleRateFB(
     *     XrSession                                   session,
     *     const XrHapticActionInfo*                   hapticActionInfo,
     *     XrDevicePcmSampleRateGetInfoFB*             deviceSampleRate);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The runtime <b>must</b> use the {@code hapticActionInfo} to get the sample rate of the currently bound device on which haptics is triggered and populate the {@code deviceSampleRate} structure. The device is determined by the {@code action} and {@code subaction} of {@link XrHapticActionInfo}. If the {@code hapticActionInfo} is bound to more than one device, then runtime <b>should</b> assume that the all these bound devices have the same {@code deviceSampleRate} and the runtime <b>should</b> return the sampleRate for any of those bound devices. If the device is invalid, the runtime <b>must</b> populate the {@code sampleRate} of {@link XrDevicePcmSampleRateStateFB} as 0. A device can be invalid if the runtime does not find any device (which can play haptics) connected to the headset, or if the device does not support PCM haptic effect.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBHapticPcm XR_FB_haptic_pcm} extension <b>must</b> be enabled prior to calling {@link #xrGetDeviceSampleRateFB GetDeviceSampleRateFB}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code hapticActionInfo} <b>must</b> be a pointer to a valid {@link XrHapticActionInfo} structure</li>
     * <li>{@code deviceSampleRate} <b>must</b> be a pointer to an {@link XrDevicePcmSampleRateGetInfoFB} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_PATH_INVALID ERROR_PATH_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_ACTION_TYPE_MISMATCH ERROR_ACTION_TYPE_MISMATCH}</li>
     * <li>{@link XR10#XR_ERROR_ACTIONSET_NOT_ATTACHED ERROR_ACTIONSET_NOT_ATTACHED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrDevicePcmSampleRateGetInfoFB}, {@link XrDevicePcmSampleRateStateFB}, {@link XrHapticActionInfo}</p>
     *
     * @param session          the specified {@code XrSession}.
     * @param hapticActionInfo the {@link XrHapticActionInfo} used to provide action and subaction paths
     * @param deviceSampleRate a pointer to {@link XrDevicePcmSampleRateStateFB} which is populated by the runtime.
     */
    @NativeType("XrResult")
    public static int xrGetDeviceSampleRateFB(XrSession session, @NativeType("XrHapticActionInfo const *") XrHapticActionInfo hapticActionInfo, @NativeType("XrDevicePcmSampleRateGetInfoFB *") XrDevicePcmSampleRateGetInfoFB deviceSampleRate) {
        return nxrGetDeviceSampleRateFB(session, hapticActionInfo.address(), deviceSampleRate.address());
    }

}
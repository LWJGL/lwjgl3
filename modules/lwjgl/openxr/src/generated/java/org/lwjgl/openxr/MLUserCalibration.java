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
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_ML_user_calibration">XR_ML_user_calibration</a> extension.
 * 
 * <p>This extension <b>can</b> be used to determine how well the device is calibrated for the current user of the device. The extension provides two events for this purpose:</p>
 * 
 * <ul>
 * <li>Headset Fit: Provides the quality of the fit of the headset on the user.</li>
 * <li>Eye Calibration: Provides the quality of the user’s eye calibration.</li>
 * </ul>
 */
public class MLUserCalibration {

    /** The extension specification version. */
    public static final int XR_ML_user_calibration_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_ML_USER_CALIBRATION_EXTENSION_NAME = "XR_ML_user_calibration";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_EVENT_DATA_HEADSET_FIT_CHANGED_ML TYPE_EVENT_DATA_HEADSET_FIT_CHANGED_ML}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_EYE_CALIBRATION_CHANGED_ML TYPE_EVENT_DATA_EYE_CALIBRATION_CHANGED_ML}</li>
     * <li>{@link #XR_TYPE_USER_CALIBRATION_ENABLE_EVENTS_INFO_ML TYPE_USER_CALIBRATION_ENABLE_EVENTS_INFO_ML}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_EVENT_DATA_HEADSET_FIT_CHANGED_ML      = 1000472000,
        XR_TYPE_EVENT_DATA_EYE_CALIBRATION_CHANGED_ML  = 1000472001,
        XR_TYPE_USER_CALIBRATION_ENABLE_EVENTS_INFO_ML = 1000472002;

    /**
     * XrHeadsetFitStatusML - Headset fit status
     * 
     * <h5>Description</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Enum</th><th>Description</th></tr></thead>
     * <tbody>
     * <tr><td>{@link #XR_HEADSET_FIT_STATUS_UNKNOWN_ML HEADSET_FIT_STATUS_UNKNOWN_ML}</td><td>Headset fit status not available for unknown reason.</td></tr>
     * <tr><td>{@link #XR_HEADSET_FIT_STATUS_NOT_WORN_ML HEADSET_FIT_STATUS_NOT_WORN_ML}</td><td>Headset not worn.</td></tr>
     * <tr><td>{@link #XR_HEADSET_FIT_STATUS_GOOD_FIT_ML HEADSET_FIT_STATUS_GOOD_FIT_ML}</td><td>Good fit.</td></tr>
     * <tr><td>{@link #XR_HEADSET_FIT_STATUS_BAD_FIT_ML HEADSET_FIT_STATUS_BAD_FIT_ML}</td><td>Bad fit.</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrEventDataHeadsetFitChangedML}</p>
     */
    public static final int
        XR_HEADSET_FIT_STATUS_UNKNOWN_ML  = 0,
        XR_HEADSET_FIT_STATUS_NOT_WORN_ML = 1,
        XR_HEADSET_FIT_STATUS_GOOD_FIT_ML = 2,
        XR_HEADSET_FIT_STATUS_BAD_FIT_ML  = 3;

    /**
     * XrEyeCalibrationStatusML - Headset fit status
     * 
     * <h5>Description</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Enum</th><th>Description</th></tr></thead>
     * <tbody>
     * <tr><td>{@link #XR_EYE_CALIBRATION_STATUS_UNKNOWN_ML EYE_CALIBRATION_STATUS_UNKNOWN_ML}</td><td>Eye calibration status not available for unknown reason.</td></tr>
     * <tr><td>{@link #XR_EYE_CALIBRATION_STATUS_NONE_ML EYE_CALIBRATION_STATUS_NONE_ML}</td><td>User has not performed the eye calibration step. Use system provided app to perform eye calibration.</td></tr>
     * <tr><td>{@link #XR_EYE_CALIBRATION_STATUS_COARSE_ML EYE_CALIBRATION_STATUS_COARSE_ML}</td><td>Eye calibration is of lower accuracy.</td></tr>
     * <tr><td>{@link #XR_EYE_CALIBRATION_STATUS_FINE_ML EYE_CALIBRATION_STATUS_FINE_ML}</td><td>Eye calibration is of higher accuracy.</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrEventDataEyeCalibrationChangedML}</p>
     */
    public static final int
        XR_EYE_CALIBRATION_STATUS_UNKNOWN_ML = 0,
        XR_EYE_CALIBRATION_STATUS_NONE_ML    = 1,
        XR_EYE_CALIBRATION_STATUS_COARSE_ML  = 2,
        XR_EYE_CALIBRATION_STATUS_FINE_ML    = 3;

    protected MLUserCalibration() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnableUserCalibrationEventsML ] ---

    /** Unsafe version of: {@link #xrEnableUserCalibrationEventsML EnableUserCalibrationEventsML} */
    public static int nxrEnableUserCalibrationEventsML(XrInstance instance, long enableInfo) {
        long __functionAddress = instance.getCapabilities().xrEnableUserCalibrationEventsML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(instance.address(), enableInfo, __functionAddress);
    }

    /**
     * Enable/disable user calibration events.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrEnableUserCalibrationEventsML EnableUserCalibrationEventsML} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrEnableUserCalibrationEventsML(
     *     XrInstance                                  instance,
     *     const XrUserCalibrationEnableEventsInfoML*  enableInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link MLUserCalibration XR_ML_user_calibration} extension <b>must</b> be enabled prior to calling {@link #xrEnableUserCalibrationEventsML EnableUserCalibrationEventsML}</li>
     * <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
     * <li>{@code enableInfo} <b>must</b> be a pointer to a valid {@link XrUserCalibrationEnableEventsInfoML} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrUserCalibrationEnableEventsInfoML}</p>
     *
     * @param instance   a handle to an {@code XrInstance} previously created with {@link XR10#xrCreateInstance CreateInstance}.
     * @param enableInfo the {@link XrUserCalibrationEnableEventsInfoML} that enables or disables user calibration events.
     */
    @NativeType("XrResult")
    public static int xrEnableUserCalibrationEventsML(XrInstance instance, @NativeType("XrUserCalibrationEnableEventsInfoML const *") XrUserCalibrationEnableEventsInfoML enableInfo) {
        return nxrEnableUserCalibrationEventsML(instance, enableInfo.address());
    }

}
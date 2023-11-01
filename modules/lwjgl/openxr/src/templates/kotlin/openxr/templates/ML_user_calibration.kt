/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ML_user_calibration = "MLUserCalibration".nativeClassXR("ML_user_calibration", type = "instance", postfix = "ML") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_ML_user_calibration">XR_ML_user_calibration</a> extension.

        This extension <b>can</b> be used to determine how well the device is calibrated for the current user of the device. The extension provides two events for this purpose:

        <ul>
            <li>Headset Fit: Provides the quality of the fit of the headset on the user.</li>
            <li>Eye Calibration: Provides the quality of the user’s eye calibration.</li>
        </ul>
        """

    IntConstant(
        "The extension specification version.",

        "ML_user_calibration_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "ML_USER_CALIBRATION_EXTENSION_NAME".."XR_ML_user_calibration"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_EVENT_DATA_HEADSET_FIT_CHANGED_ML".."1000472000",
        "TYPE_EVENT_DATA_EYE_CALIBRATION_CHANGED_ML".."1000472001",
        "TYPE_USER_CALIBRATION_ENABLE_EVENTS_INFO_ML".."1000472002"
    )

    EnumConstant(
        """
        XrHeadsetFitStatusML - Headset fit status

        <h5>Description</h5>
        <table class="lwjgl">
            <thead><tr><th>Enum</th><th>Description</th></tr></thead>
            <tbody>
                <tr><td>#HEADSET_FIT_STATUS_UNKNOWN_ML</td><td>Headset fit status not available for unknown reason.</td></tr>
                <tr><td>#HEADSET_FIT_STATUS_NOT_WORN_ML</td><td>Headset not worn.</td></tr>
                <tr><td>#HEADSET_FIT_STATUS_GOOD_FIT_ML</td><td>Good fit.</td></tr>
                <tr><td>#HEADSET_FIT_STATUS_BAD_FIT_ML</td><td>Bad fit.</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        ##XrEventDataHeadsetFitChangedML
        """,

        "HEADSET_FIT_STATUS_UNKNOWN_ML".."0",
        "HEADSET_FIT_STATUS_NOT_WORN_ML".."1",
        "HEADSET_FIT_STATUS_GOOD_FIT_ML".."2",
        "HEADSET_FIT_STATUS_BAD_FIT_ML".."3"
    )

    EnumConstant(
        """
        XrEyeCalibrationStatusML - Headset fit status

        <h5>Description</h5>
        <table class="lwjgl">
            <thead><tr><th>Enum</th><th>Description</th></tr></thead>
            <tbody>
                <tr><td>#EYE_CALIBRATION_STATUS_UNKNOWN_ML</td><td>Eye calibration status not available for unknown reason.</td></tr>
                <tr><td>#EYE_CALIBRATION_STATUS_NONE_ML</td><td>User has not performed the eye calibration step. Use system provided app to perform eye calibration.</td></tr>
                <tr><td>#EYE_CALIBRATION_STATUS_COARSE_ML</td><td>Eye calibration is of lower accuracy.</td></tr>
                <tr><td>#EYE_CALIBRATION_STATUS_FINE_ML</td><td>Eye calibration is of higher accuracy.</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        ##XrEventDataEyeCalibrationChangedML
        """,

        "EYE_CALIBRATION_STATUS_UNKNOWN_ML".."0",
        "EYE_CALIBRATION_STATUS_NONE_ML".."1",
        "EYE_CALIBRATION_STATUS_COARSE_ML".."2",
        "EYE_CALIBRATION_STATUS_FINE_ML".."3"
    )

    XrResult(
        "EnableUserCalibrationEventsML",
        """
        Enable/disable user calibration events.

        <h5>C Specification</h5>
        The #EnableUserCalibrationEventsML() function is defined as:

        <pre><code>
￿XrResult xrEnableUserCalibrationEventsML(
￿    XrInstance                                  instance,
￿    const XrUserCalibrationEnableEventsInfoML*  enableInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link MLUserCalibration XR_ML_user_calibration} extension <b>must</b> be enabled prior to calling #EnableUserCalibrationEventsML()</li>
            <li>{@code instance} <b>must</b> be a valid {@code XrInstance} handle</li>
            <li>{@code enableInfo} <b>must</b> be a pointer to a valid ##XrUserCalibrationEnableEventsInfoML structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrUserCalibrationEnableEventsInfoML
        """,

        XrInstance("instance", "a handle to an {@code XrInstance} previously created with #CreateInstance()."),
        XrUserCalibrationEnableEventsInfoML.const.p("enableInfo", "the ##XrUserCalibrationEnableEventsInfoML that enables or disables user calibration events.")
    )
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val OCULUS_external_camera = "OCULUSExternalCamera".nativeClassXR("OCULUS_external_camera", type = "instance", postfix = "OCULUS") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html\#XR_OCULUS_external_camera">XR_OCULUS_external_camera</a> extension.

        This extension enables the querying of external camera information for a session. This extension is intended to enable mixed reality capture support for applications.

        This extension does not provide a mechanism for supplying external camera information to the runtime. If external camera information is not supplied to the runtime before using this extension, no camera information will be returned.

        This API supports returning camera intrinsics and extrinsics:

        <ul>
            <li>Camera intrinsics are the attributes of the camera: resolution, field of view, etc.</li>
            <li>Camera extrinsics are everything external to the camera: relative pose, attached to, etc.</li>
            <li>We do not expect the camera intrinsics to change frequently. We expect the camera extrinsics to change frequently.</li>
        </ul>
        """

    IntConstant(
        "The extension specification version.",

        "OCULUS_external_camera_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "OCULUS_EXTERNAL_CAMERA_EXTENSION_NAME".."XR_OCULUS_external_camera"
    )

    EnumConstant(
        "Extends {@code XrStructureType}.",

        "TYPE_EXTERNAL_CAMERA_OCULUS".."1000226000"
    )

    EnumConstant(
        "XR_MAX_EXTERNAL_CAMERA_NAME_SIZE_OCULUS",

        "MAX_EXTERNAL_CAMERA_NAME_SIZE_OCULUS".."32"
    )

    EnumConstant(
        """
        XrExternalCameraAttachedToDeviceOCULUS - XrExternalCameraAttachedToDeviceOCULUS

        <h5>Description</h5>
        <table class="lwjgl">
            <thead><tr><th>Enum</th><th>Description</th></tr></thead>
            <tbody>
                <tr><td>#EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_NONE_OCULUS</td><td>External camera is at a fixed point in LOCAL space</td></tr>
                <tr><td>#EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_HMD_OCULUS</td><td>External camera is attached to the HMD</td></tr>
                <tr><td>#EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_LTOUCH_OCULUS</td><td>External camera is attached to a left Touch controller</td></tr>
                <tr><td>#EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_RTOUCH_OCULUS</td><td>External camera is attached to a right Touch controller</td></tr>
            </tbody>
        </table>

        <h5>See Also</h5>
        ##XrExternalCameraExtrinsicsOCULUS
        """,

        "EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_NONE_OCULUS".."0",
        "EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_HMD_OCULUS".."1",
        "EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_LTOUCH_OCULUS".."2",
        "EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_RTOUCH_OCULUS".."3"
    )

    EnumConstant(
        """
        XrExternalCameraStatusFlagBitsOCULUS - XrExternalCameraStatusFlagBitsOCULUS

        <h5>Flag Descriptions</h5>
        <ul>
            <li>#EXTERNAL_CAMERA_STATUS_CONNECTED_BIT_OCULUS — External camera is connected</li>
            <li>#EXTERNAL_CAMERA_STATUS_CALIBRATING_BIT_OCULUS — External camera is undergoing calibration</li>
            <li>#EXTERNAL_CAMERA_STATUS_CALIBRATION_FAILED_BIT_OCULUS — External camera has tried and failed calibration</li>
            <li>#EXTERNAL_CAMERA_STATUS_CALIBRATED_BIT_OCULUS — External camera has tried and passed calibration</li>
            <li>#EXTERNAL_CAMERA_STATUS_CAPTURING_BIT_OCULUS — External camera is capturing</li>
        </ul>
        """,

        "EXTERNAL_CAMERA_STATUS_CONNECTED_BIT_OCULUS".enum(0x00000001),
        "EXTERNAL_CAMERA_STATUS_CALIBRATING_BIT_OCULUS".enum(0x00000002),
        "EXTERNAL_CAMERA_STATUS_CALIBRATION_FAILED_BIT_OCULUS".enum(0x00000004),
        "EXTERNAL_CAMERA_STATUS_CALIBRATED_BIT_OCULUS".enum(0x00000008),
        "EXTERNAL_CAMERA_STATUS_CAPTURING_BIT_OCULUS".enum(0x00000010)
    )

    XrResult(
        "EnumerateExternalCamerasOCULUS",
        """
        Enumerates all the external cameras that are supported by the runtime.

        <h5>C Specification</h5>
        The #EnumerateExternalCamerasOCULUS() function enumerates all the external cameras that are supported by the runtime, it is defined as:

        <pre><code>
￿XrResult xrEnumerateExternalCamerasOCULUS(
￿    XrSession                                   session,
￿    uint32_t                                    cameraCapacityInput,
￿    uint32_t*                                   cameraCountOutput,
￿    XrExternalCameraOCULUS*                     cameras);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>The {@link OCULUSExternalCamera XR_OCULUS_external_camera} extension <b>must</b> be enabled prior to calling #EnumerateExternalCamerasOCULUS()</li>
            <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
            <li>{@code cameraCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If {@code cameraCapacityInput} is not 0, {@code cameras} <b>must</b> be a pointer to an array of {@code cameraCapacityInput} ##XrExternalCameraOCULUS structures</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SESSION_LOSS_PENDING</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_FUNCTION_UNSUPPORTED</li>
                <li>#ERROR_VALIDATION_FAILURE</li>
                <li>#ERROR_RUNTIME_FAILURE</li>
                <li>#ERROR_HANDLE_INVALID</li>
                <li>#ERROR_INSTANCE_LOST</li>
                <li>#ERROR_SESSION_LOST</li>
                <li>#ERROR_OUT_OF_MEMORY</li>
                <li>#ERROR_SIZE_INSUFFICIENT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##XrExternalCameraOCULUS
        """,

        XrSession("session", "the {@code XrSession} to query the external cameras in"),
        AutoSize("cameras")..uint32_t("cameraCapacityInput", "the capacity of the {@code cameras} array, or 0 to indicate a request to retrieve the required capacity."),
        Check(1)..uint32_t.p("cameraCountOutput", "filled in by the runtime with the count of {@code cameras} written or the required capacity in the case that {@code cameraCapacityInput} is insufficient."),
        nullable..XrExternalCameraOCULUS.p("cameras", "an array of ##XrExternalCameraOCULUS filled in by the runtime which contains all the available external cameras, but <b>can</b> be {@code NULL} if {@code cameraCapacityInput} is 0.")
    )
}
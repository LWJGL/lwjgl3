/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_OCULUS_external_camera">XR_OCULUS_external_camera</a> extension.
 * 
 * <p>This extension enables the querying of external camera information for a session. This extension is intended to enable mixed reality capture support for applications.</p>
 * 
 * <p>This extension does not provide a mechanism for supplying external camera information to the runtime. If external camera information is not supplied to the runtime before using this extension, no camera information will be returned.</p>
 * 
 * <p>This API supports returning camera intrinsics and extrinsics:</p>
 * 
 * <ul>
 * <li>Camera intrinsics are the attributes of the camera: resolution, field of view, etc.</li>
 * <li>Camera extrinsics are everything external to the camera: relative pose, attached to, etc.</li>
 * <li>We do not expect the camera intrinsics to change frequently. We expect the camera extrinsics to change frequently.</li>
 * </ul>
 */
public class OCULUSExternalCamera {

    /** The extension specification version. */
    public static final int XR_OCULUS_external_camera_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_OCULUS_EXTERNAL_CAMERA_EXTENSION_NAME = "XR_OCULUS_external_camera";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_EXTERNAL_CAMERA_OCULUS = 1000226000;

    /** XR_MAX_EXTERNAL_CAMERA_NAME_SIZE_OCULUS */
    public static final int XR_MAX_EXTERNAL_CAMERA_NAME_SIZE_OCULUS = 32;

    /**
     * XrExternalCameraAttachedToDeviceOCULUS - XrExternalCameraAttachedToDeviceOCULUS
     * 
     * <h5>Description</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Enum</th><th>Description</th></tr></thead>
     * <tbody>
     * <tr><td>{@link #XR_EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_NONE_OCULUS EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_NONE_OCULUS}</td><td>External camera is at a fixed point in LOCAL space</td></tr>
     * <tr><td>{@link #XR_EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_HMD_OCULUS EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_HMD_OCULUS}</td><td>External camera is attached to the HMD</td></tr>
     * <tr><td>{@link #XR_EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_LTOUCH_OCULUS EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_LTOUCH_OCULUS}</td><td>External camera is attached to a left Touch controller</td></tr>
     * <tr><td>{@link #XR_EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_RTOUCH_OCULUS EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_RTOUCH_OCULUS}</td><td>External camera is attached to a right Touch controller</td></tr>
     * </tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrExternalCameraExtrinsicsOCULUS}</p>
     */
    public static final int
        XR_EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_NONE_OCULUS   = 0,
        XR_EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_HMD_OCULUS    = 1,
        XR_EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_LTOUCH_OCULUS = 2,
        XR_EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_RTOUCH_OCULUS = 3;

    /**
     * XrExternalCameraStatusFlagBitsOCULUS - XrExternalCameraStatusFlagBitsOCULUS
     * 
     * <h5>Flag Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_EXTERNAL_CAMERA_STATUS_CONNECTED_BIT_OCULUS EXTERNAL_CAMERA_STATUS_CONNECTED_BIT_OCULUS} — External camera is connected</li>
     * <li>{@link #XR_EXTERNAL_CAMERA_STATUS_CALIBRATING_BIT_OCULUS EXTERNAL_CAMERA_STATUS_CALIBRATING_BIT_OCULUS} — External camera is undergoing calibration</li>
     * <li>{@link #XR_EXTERNAL_CAMERA_STATUS_CALIBRATION_FAILED_BIT_OCULUS EXTERNAL_CAMERA_STATUS_CALIBRATION_FAILED_BIT_OCULUS} — External camera has tried and failed calibration</li>
     * <li>{@link #XR_EXTERNAL_CAMERA_STATUS_CALIBRATED_BIT_OCULUS EXTERNAL_CAMERA_STATUS_CALIBRATED_BIT_OCULUS} — External camera has tried and passed calibration</li>
     * <li>{@link #XR_EXTERNAL_CAMERA_STATUS_CAPTURING_BIT_OCULUS EXTERNAL_CAMERA_STATUS_CAPTURING_BIT_OCULUS} — External camera is capturing</li>
     * </ul>
     */
    public static final int
        XR_EXTERNAL_CAMERA_STATUS_CONNECTED_BIT_OCULUS          = 0x1,
        XR_EXTERNAL_CAMERA_STATUS_CALIBRATING_BIT_OCULUS        = 0x2,
        XR_EXTERNAL_CAMERA_STATUS_CALIBRATION_FAILED_BIT_OCULUS = 0x4,
        XR_EXTERNAL_CAMERA_STATUS_CALIBRATED_BIT_OCULUS         = 0x8,
        XR_EXTERNAL_CAMERA_STATUS_CAPTURING_BIT_OCULUS          = 0x10;

    protected OCULUSExternalCamera() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateExternalCamerasOCULUS ] ---

    /**
     * Unsafe version of: {@link #xrEnumerateExternalCamerasOCULUS EnumerateExternalCamerasOCULUS}
     *
     * @param cameraCapacityInput the capacity of the {@code cameras} array, or 0 to indicate a request to retrieve the required capacity.
     */
    public static int nxrEnumerateExternalCamerasOCULUS(XrSession session, int cameraCapacityInput, long cameraCountOutput, long cameras) {
        long __functionAddress = session.getCapabilities().xrEnumerateExternalCamerasOCULUS;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), cameraCapacityInput, cameraCountOutput, cameras, __functionAddress);
    }

    /**
     * Enumerates all the external cameras that are supported by the runtime.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrEnumerateExternalCamerasOCULUS EnumerateExternalCamerasOCULUS} function enumerates all the external cameras that are supported by the runtime, it is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrEnumerateExternalCamerasOCULUS(
     *     XrSession                                   session,
     *     uint32_t                                    cameraCapacityInput,
     *     uint32_t*                                   cameraCountOutput,
     *     XrExternalCameraOCULUS*                     cameras);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link OCULUSExternalCamera XR_OCULUS_external_camera} extension <b>must</b> be enabled prior to calling {@link #xrEnumerateExternalCamerasOCULUS EnumerateExternalCamerasOCULUS}</li>
     * <li>{@code session} <b>must</b> be a valid {@code XrSession} handle</li>
     * <li>{@code cameraCountOutput} <b>must</b> be a pointer to a {@code uint32_t} value</li>
     * <li>If {@code cameraCapacityInput} is not 0, {@code cameras} <b>must</b> be a pointer to an array of {@code cameraCapacityInput} {@link XrExternalCameraOCULUS} structures</li>
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
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_OUT_OF_MEMORY ERROR_OUT_OF_MEMORY}</li>
     * <li>{@link XR10#XR_ERROR_SIZE_INSUFFICIENT ERROR_SIZE_INSUFFICIENT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrExternalCameraOCULUS}</p>
     *
     * @param session           the {@code XrSession} to query the external cameras in
     * @param cameraCountOutput filled in by the runtime with the count of {@code cameras} written or the required capacity in the case that {@code cameraCapacityInput} is insufficient.
     * @param cameras           an array of {@link XrExternalCameraOCULUS} filled in by the runtime which contains all the available external cameras, but <b>can</b> be {@code NULL} if {@code cameraCapacityInput} is 0.
     */
    @NativeType("XrResult")
    public static int xrEnumerateExternalCamerasOCULUS(XrSession session, @NativeType("uint32_t *") IntBuffer cameraCountOutput, @Nullable @NativeType("XrExternalCameraOCULUS *") XrExternalCameraOCULUS.Buffer cameras) {
        if (CHECKS) {
            check(cameraCountOutput, 1);
        }
        return nxrEnumerateExternalCamerasOCULUS(session, remainingSafe(cameras), memAddress(cameraCountOutput), memAddressSafe(cameras));
    }

}
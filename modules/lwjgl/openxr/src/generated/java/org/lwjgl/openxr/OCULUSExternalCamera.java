/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class OCULUSExternalCamera {

    public static final int XR_OCULUS_external_camera_SPEC_VERSION = 1;

    public static final String XR_OCULUS_EXTERNAL_CAMERA_EXTENSION_NAME = "XR_OCULUS_external_camera";

    public static final int XR_TYPE_EXTERNAL_CAMERA_OCULUS = 1000226000;

    public static final int XR_MAX_EXTERNAL_CAMERA_NAME_SIZE_OCULUS = 32;

    public static final int
        XR_EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_NONE_OCULUS   = 0,
        XR_EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_HMD_OCULUS    = 1,
        XR_EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_LTOUCH_OCULUS = 2,
        XR_EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_RTOUCH_OCULUS = 3;

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

    /** {@code XrResult xrEnumerateExternalCamerasOCULUS(XrSession session, uint32_t cameraCapacityInput, uint32_t * cameraCountOutput, XrExternalCameraOCULUS * cameras)} */
    public static int nxrEnumerateExternalCamerasOCULUS(XrSession session, int cameraCapacityInput, long cameraCountOutput, long cameras) {
        long __functionAddress = session.getCapabilities().xrEnumerateExternalCamerasOCULUS;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), cameraCapacityInput, cameraCountOutput, cameras, __functionAddress);
    }

    /** {@code XrResult xrEnumerateExternalCamerasOCULUS(XrSession session, uint32_t cameraCapacityInput, uint32_t * cameraCountOutput, XrExternalCameraOCULUS * cameras)} */
    @NativeType("XrResult")
    public static int xrEnumerateExternalCamerasOCULUS(XrSession session, @NativeType("uint32_t *") IntBuffer cameraCountOutput, @NativeType("XrExternalCameraOCULUS *") XrExternalCameraOCULUS.@Nullable Buffer cameras) {
        if (CHECKS) {
            check(cameraCountOutput, 1);
        }
        return nxrEnumerateExternalCamerasOCULUS(session, remainingSafe(cameras), memAddress(cameraCountOutput), memAddressSafe(cameras));
    }

}
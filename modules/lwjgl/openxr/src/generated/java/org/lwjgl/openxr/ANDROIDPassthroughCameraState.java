/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ANDROIDPassthroughCameraState {

    public static final int XR_ANDROID_passthrough_camera_state_SPEC_VERSION = 1;

    public static final String XR_ANDROID_PASSTHROUGH_CAMERA_STATE_EXTENSION_NAME = "XR_ANDROID_passthrough_camera_state";

    public static final int
        XR_TYPE_PASSTHROUGH_CAMERA_STATE_GET_INFO_ANDROID          = 1000460000,
        XR_TYPE_SYSTEM_PASSTHROUGH_CAMERA_STATE_PROPERTIES_ANDROID = 1000460001;

    public static final int
        XR_PASSTHROUGH_CAMERA_STATE_DISABLED_ANDROID     = 0,
        XR_PASSTHROUGH_CAMERA_STATE_INITIALIZING_ANDROID = 1,
        XR_PASSTHROUGH_CAMERA_STATE_READY_ANDROID        = 2,
        XR_PASSTHROUGH_CAMERA_STATE_ERROR_ANDROID        = 3;

    protected ANDROIDPassthroughCameraState() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetPassthroughCameraStateANDROID ] ---

    /** {@code XrResult xrGetPassthroughCameraStateANDROID(XrSession session, XrPassthroughCameraStateGetInfoANDROID const * getInfo, XrPassthroughCameraStateANDROID * cameraStateOutput)} */
    public static int nxrGetPassthroughCameraStateANDROID(XrSession session, long getInfo, long cameraStateOutput) {
        long __functionAddress = session.getCapabilities().xrGetPassthroughCameraStateANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), getInfo, cameraStateOutput, __functionAddress);
    }

    /** {@code XrResult xrGetPassthroughCameraStateANDROID(XrSession session, XrPassthroughCameraStateGetInfoANDROID const * getInfo, XrPassthroughCameraStateANDROID * cameraStateOutput)} */
    @NativeType("XrResult")
    public static int xrGetPassthroughCameraStateANDROID(XrSession session, @NativeType("XrPassthroughCameraStateGetInfoANDROID const *") XrPassthroughCameraStateGetInfoANDROID getInfo, @NativeType("XrPassthroughCameraStateANDROID *") IntBuffer cameraStateOutput) {
        if (CHECKS) {
            check(cameraStateOutput, 1);
        }
        return nxrGetPassthroughCameraStateANDROID(session, getInfo.address(), memAddress(cameraStateOutput));
    }

}
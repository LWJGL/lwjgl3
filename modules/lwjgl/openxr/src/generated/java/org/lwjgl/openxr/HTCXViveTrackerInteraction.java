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

public class HTCXViveTrackerInteraction {

    public static final int XR_HTCX_vive_tracker_interaction_SPEC_VERSION = 3;

    public static final String XR_HTCX_VIVE_TRACKER_INTERACTION_EXTENSION_NAME = "XR_HTCX_vive_tracker_interaction";

    public static final int
        XR_TYPE_VIVE_TRACKER_PATHS_HTCX                = 1000103000,
        XR_TYPE_EVENT_DATA_VIVE_TRACKER_CONNECTED_HTCX = 1000103001;

    protected HTCXViveTrackerInteraction() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateViveTrackerPathsHTCX ] ---

    /** {@code XrResult xrEnumerateViveTrackerPathsHTCX(XrInstance instance, uint32_t pathCapacityInput, uint32_t * pathCountOutput, XrViveTrackerPathsHTCX * paths)} */
    public static int nxrEnumerateViveTrackerPathsHTCX(XrInstance instance, int pathCapacityInput, long pathCountOutput, long paths) {
        long __functionAddress = instance.getCapabilities().xrEnumerateViveTrackerPathsHTCX;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(instance.address(), pathCapacityInput, pathCountOutput, paths, __functionAddress);
    }

    /** {@code XrResult xrEnumerateViveTrackerPathsHTCX(XrInstance instance, uint32_t pathCapacityInput, uint32_t * pathCountOutput, XrViveTrackerPathsHTCX * paths)} */
    @NativeType("XrResult")
    public static int xrEnumerateViveTrackerPathsHTCX(XrInstance instance, @NativeType("uint32_t *") IntBuffer pathCountOutput, @NativeType("XrViveTrackerPathsHTCX *") XrViveTrackerPathsHTCX.@Nullable Buffer paths) {
        if (CHECKS) {
            check(pathCountOutput, 1);
        }
        return nxrEnumerateViveTrackerPathsHTCX(instance, remainingSafe(paths), memAddress(pathCountOutput), memAddressSafe(paths));
    }

}
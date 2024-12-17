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

public class MLSpatialAnchors {

    public static final int XR_ML_spatial_anchors_SPEC_VERSION = 1;

    public static final String XR_ML_SPATIAL_ANCHORS_EXTENSION_NAME = "XR_ML_spatial_anchors";

    public static final int
        XR_TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_POSE_ML = 1000140000,
        XR_TYPE_CREATE_SPATIAL_ANCHORS_COMPLETION_ML     = 1000140001,
        XR_TYPE_SPATIAL_ANCHOR_STATE_ML                  = 1000140002;

    public static final int
        XR_ERROR_SPATIAL_ANCHORS_PERMISSION_DENIED_ML   = -1000140000,
        XR_ERROR_SPATIAL_ANCHORS_NOT_LOCALIZED_ML       = -1000140001,
        XR_ERROR_SPATIAL_ANCHORS_OUT_OF_MAP_BOUNDS_ML   = -1000140002,
        XR_ERROR_SPATIAL_ANCHORS_SPACE_NOT_LOCATABLE_ML = -1000140003;

    public static final int
        XR_SPATIAL_ANCHOR_CONFIDENCE_LOW_ML    = 0,
        XR_SPATIAL_ANCHOR_CONFIDENCE_MEDIUM_ML = 1,
        XR_SPATIAL_ANCHOR_CONFIDENCE_HIGH_ML   = 2;

    protected MLSpatialAnchors() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpatialAnchorsAsyncML ] ---

    /** {@code XrResult xrCreateSpatialAnchorsAsyncML(XrSession session, XrSpatialAnchorsCreateInfoBaseHeaderML const * createInfo, XrFutureEXT * future)} */
    public static int nxrCreateSpatialAnchorsAsyncML(XrSession session, long createInfo, long future) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorsAsyncML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, future, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialAnchorsAsyncML(XrSession session, XrSpatialAnchorsCreateInfoBaseHeaderML const * createInfo, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorsAsyncML(XrSession session, @NativeType("XrSpatialAnchorsCreateInfoBaseHeaderML const *") XrSpatialAnchorsCreateInfoBaseHeaderML createInfo, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrCreateSpatialAnchorsAsyncML(session, createInfo.address(), memAddress(future));
    }

    // --- [ xrCreateSpatialAnchorsCompleteML ] ---

    /** {@code XrResult xrCreateSpatialAnchorsCompleteML(XrSession session, XrFutureEXT future, XrCreateSpatialAnchorsCompletionML * completion)} */
    public static int nxrCreateSpatialAnchorsCompleteML(XrSession session, long future, long completion) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorsCompleteML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialAnchorsCompleteML(XrSession session, XrFutureEXT future, XrCreateSpatialAnchorsCompletionML * completion)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorsCompleteML(XrSession session, @NativeType("XrFutureEXT") long future, @NativeType("XrCreateSpatialAnchorsCompletionML *") XrCreateSpatialAnchorsCompletionML completion) {
        return nxrCreateSpatialAnchorsCompleteML(session, future, completion.address());
    }

    // --- [ xrGetSpatialAnchorStateML ] ---

    /** {@code XrResult xrGetSpatialAnchorStateML(XrSpace anchor, XrSpatialAnchorStateML * state)} */
    public static int nxrGetSpatialAnchorStateML(XrSpace anchor, long state) {
        long __functionAddress = anchor.getCapabilities().xrGetSpatialAnchorStateML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(anchor.address(), state, __functionAddress);
    }

    /** {@code XrResult xrGetSpatialAnchorStateML(XrSpace anchor, XrSpatialAnchorStateML * state)} */
    @NativeType("XrResult")
    public static int xrGetSpatialAnchorStateML(XrSpace anchor, @NativeType("XrSpatialAnchorStateML *") XrSpatialAnchorStateML state) {
        return nxrGetSpatialAnchorStateML(anchor, state.address());
    }

}
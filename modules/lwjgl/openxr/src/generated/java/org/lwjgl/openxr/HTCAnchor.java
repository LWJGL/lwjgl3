/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class HTCAnchor {

    public static final int XR_HTC_anchor_SPEC_VERSION = 1;

    public static final String XR_HTC_ANCHOR_EXTENSION_NAME = "XR_HTC_anchor";

    public static final int XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_HTC = 256;

    public static final int
        XR_TYPE_SYSTEM_ANCHOR_PROPERTIES_HTC   = 1000319000,
        XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_HTC = 1000319001;

    public static final int XR_ERROR_NOT_AN_ANCHOR_HTC = -1000319000;

    protected HTCAnchor() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpatialAnchorHTC ] ---

    /** {@code XrResult xrCreateSpatialAnchorHTC(XrSession session, XrSpatialAnchorCreateInfoHTC const * createInfo, XrSpace * anchor)} */
    public static int nxrCreateSpatialAnchorHTC(XrSession session, long createInfo, long anchor) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorHTC;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorCreateInfoHTC.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, anchor, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialAnchorHTC(XrSession session, XrSpatialAnchorCreateInfoHTC const * createInfo, XrSpace * anchor)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorHTC(XrSession session, @NativeType("XrSpatialAnchorCreateInfoHTC const *") XrSpatialAnchorCreateInfoHTC createInfo, @NativeType("XrSpace *") PointerBuffer anchor) {
        if (CHECKS) {
            check(anchor, 1);
        }
        return nxrCreateSpatialAnchorHTC(session, createInfo.address(), memAddress(anchor));
    }

    // --- [ xrGetSpatialAnchorNameHTC ] ---

    /** {@code XrResult xrGetSpatialAnchorNameHTC(XrSpace anchor, XrSpatialAnchorNameHTC * name)} */
    public static int nxrGetSpatialAnchorNameHTC(XrSpace anchor, long name) {
        long __functionAddress = anchor.getCapabilities().xrGetSpatialAnchorNameHTC;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(anchor.address(), name, __functionAddress);
    }

    /** {@code XrResult xrGetSpatialAnchorNameHTC(XrSpace anchor, XrSpatialAnchorNameHTC * name)} */
    @NativeType("XrResult")
    public static int xrGetSpatialAnchorNameHTC(XrSpace anchor, @NativeType("XrSpatialAnchorNameHTC *") XrSpatialAnchorNameHTC name) {
        return nxrGetSpatialAnchorNameHTC(anchor, name.address());
    }

}
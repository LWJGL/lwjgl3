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

public class MSFTSpatialAnchor {

    public static final int XR_MSFT_spatial_anchor_SPEC_VERSION = 2;

    public static final String XR_MSFT_SPATIAL_ANCHOR_EXTENSION_NAME = "XR_MSFT_spatial_anchor";

    public static final int
        XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_MSFT       = 1000039000,
        XR_TYPE_SPATIAL_ANCHOR_SPACE_CREATE_INFO_MSFT = 1000039001;

    public static final int XR_OBJECT_TYPE_SPATIAL_ANCHOR_MSFT = 1000039000;

    public static final int XR_ERROR_CREATE_SPATIAL_ANCHOR_FAILED_MSFT = -1000039001;

    protected MSFTSpatialAnchor() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpatialAnchorMSFT ] ---

    /** {@code XrResult xrCreateSpatialAnchorMSFT(XrSession session, XrSpatialAnchorCreateInfoMSFT const * createInfo, XrSpatialAnchorMSFT * anchor)} */
    public static int nxrCreateSpatialAnchorMSFT(XrSession session, long createInfo, long anchor) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorMSFT;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorCreateInfoMSFT.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, anchor, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialAnchorMSFT(XrSession session, XrSpatialAnchorCreateInfoMSFT const * createInfo, XrSpatialAnchorMSFT * anchor)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorMSFT(XrSession session, @NativeType("XrSpatialAnchorCreateInfoMSFT const *") XrSpatialAnchorCreateInfoMSFT createInfo, @NativeType("XrSpatialAnchorMSFT *") PointerBuffer anchor) {
        if (CHECKS) {
            check(anchor, 1);
        }
        return nxrCreateSpatialAnchorMSFT(session, createInfo.address(), memAddress(anchor));
    }

    // --- [ xrCreateSpatialAnchorSpaceMSFT ] ---

    /** {@code XrResult xrCreateSpatialAnchorSpaceMSFT(XrSession session, XrSpatialAnchorSpaceCreateInfoMSFT const * createInfo, XrSpace * space)} */
    public static int nxrCreateSpatialAnchorSpaceMSFT(XrSession session, long createInfo, long space) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorSpaceMSFT;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorSpaceCreateInfoMSFT.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, space, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialAnchorSpaceMSFT(XrSession session, XrSpatialAnchorSpaceCreateInfoMSFT const * createInfo, XrSpace * space)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorSpaceMSFT(XrSession session, @NativeType("XrSpatialAnchorSpaceCreateInfoMSFT const *") XrSpatialAnchorSpaceCreateInfoMSFT createInfo, @NativeType("XrSpace *") PointerBuffer space) {
        if (CHECKS) {
            check(space, 1);
        }
        return nxrCreateSpatialAnchorSpaceMSFT(session, createInfo.address(), memAddress(space));
    }

    // --- [ xrDestroySpatialAnchorMSFT ] ---

    /** {@code XrResult xrDestroySpatialAnchorMSFT(XrSpatialAnchorMSFT anchor)} */
    @NativeType("XrResult")
    public static int xrDestroySpatialAnchorMSFT(XrSpatialAnchorMSFT anchor) {
        long __functionAddress = anchor.getCapabilities().xrDestroySpatialAnchorMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(anchor.address(), __functionAddress);
    }

}
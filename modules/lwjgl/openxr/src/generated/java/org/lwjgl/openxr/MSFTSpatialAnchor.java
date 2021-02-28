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

/** The MSFT_spatial_anchor extension. */
public class MSFTSpatialAnchor {

    /** The extension specification version. */
    public static final int XR_MSFT_spatial_anchor_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_MSFT_SPATIAL_ANCHOR_EXTENSION_NAME = "XR_MSFT_spatial_anchor";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_MSFT TYPE_SPATIAL_ANCHOR_CREATE_INFO_MSFT}</li>
     * <li>{@link #XR_TYPE_SPATIAL_ANCHOR_SPACE_CREATE_INFO_MSFT TYPE_SPATIAL_ANCHOR_SPACE_CREATE_INFO_MSFT}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_MSFT       = 1000039000,
        XR_TYPE_SPATIAL_ANCHOR_SPACE_CREATE_INFO_MSFT = 1000039001;

    /** Extends {@code XrObjectType}. */
    public static final int XR_OBJECT_TYPE_SPATIAL_ANCHOR_MSFT = 1000039000;

    /** Extends {@code XrResult}. */
    public static final int XR_ERROR_CREATE_SPATIAL_ANCHOR_FAILED_MSFT = -1000039001;

    protected MSFTSpatialAnchor() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpatialAnchorMSFT ] ---

    public static int nxrCreateSpatialAnchorMSFT(XrSession session, long createInfo, long anchor) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorMSFT;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorCreateInfoMSFT.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, anchor, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorMSFT(XrSession session, @NativeType("XrSpatialAnchorCreateInfoMSFT const *") XrSpatialAnchorCreateInfoMSFT createInfo, @NativeType("XrSpatialAnchorMSFT *") PointerBuffer anchor) {
        if (CHECKS) {
            check(anchor, 1);
        }
        return nxrCreateSpatialAnchorMSFT(session, createInfo.address(), memAddress(anchor));
    }

    // --- [ xrCreateSpatialAnchorSpaceMSFT ] ---

    public static int nxrCreateSpatialAnchorSpaceMSFT(XrSession session, long createInfo, long space) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorSpaceMSFT;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorSpaceCreateInfoMSFT.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, space, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorSpaceMSFT(XrSession session, @NativeType("XrSpatialAnchorSpaceCreateInfoMSFT const *") XrSpatialAnchorSpaceCreateInfoMSFT createInfo, @NativeType("XrSpace *") PointerBuffer space) {
        if (CHECKS) {
            check(space, 1);
        }
        return nxrCreateSpatialAnchorSpaceMSFT(session, createInfo.address(), memAddress(space));
    }

    // --- [ xrDestroySpatialAnchorMSFT ] ---

    @NativeType("XrResult")
    public static int xrDestroySpatialAnchorMSFT(XrSpatialAnchorMSFT anchor) {
        long __functionAddress = anchor.getCapabilities().xrDestroySpatialAnchorMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(anchor.address(), __functionAddress);
    }

}
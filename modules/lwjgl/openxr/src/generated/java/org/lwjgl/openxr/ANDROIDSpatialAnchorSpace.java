/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ANDROIDSpatialAnchorSpace {

    public static final int XR_ANDROID_spatial_anchor_space_SPEC_VERSION = 1;

    public static final String XR_ANDROID_SPATIAL_ANCHOR_SPACE_EXTENSION_NAME = "XR_ANDROID_spatial_anchor_space";

    public static final int XR_ERROR_SPATIAL_ANCHOR_ENTITY_ID_INVALID_ANDROID = -1000795001;

    public static final int XR_TYPE_SPATIAL_ANCHOR_SPACE_FROM_ID_CREATE_INFO_ANDROID = 1000795000;

    protected ANDROIDSpatialAnchorSpace() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpatialAnchorSpaceANDROID ] ---

    /** {@code XrResult xrCreateSpatialAnchorSpaceANDROID(XrSession session, XrSpatialContextEXT spatialContext, XrSpatialAnchorCreateInfoEXT const * createInfo, XrSpatialEntityIdEXT * anchorEntityId, XrSpace * anchorSpace)} */
    public static int nxrCreateSpatialAnchorSpaceANDROID(XrSession session, XrSpatialContextEXT spatialContext, long createInfo, long anchorEntityId, long anchorSpace) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorSpaceANDROID;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorCreateInfoEXT.validate(createInfo);
        }
        return callPPPPPI(session.address(), spatialContext.address(), createInfo, anchorEntityId, anchorSpace, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialAnchorSpaceANDROID(XrSession session, XrSpatialContextEXT spatialContext, XrSpatialAnchorCreateInfoEXT const * createInfo, XrSpatialEntityIdEXT * anchorEntityId, XrSpace * anchorSpace)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorSpaceANDROID(XrSession session, XrSpatialContextEXT spatialContext, @NativeType("XrSpatialAnchorCreateInfoEXT const *") XrSpatialAnchorCreateInfoEXT createInfo, @NativeType("XrSpatialEntityIdEXT *") LongBuffer anchorEntityId, @NativeType("XrSpace *") PointerBuffer anchorSpace) {
        if (CHECKS) {
            check(anchorEntityId, 1);
            check(anchorSpace, 1);
        }
        return nxrCreateSpatialAnchorSpaceANDROID(session, spatialContext, createInfo.address(), memAddress(anchorEntityId), memAddress(anchorSpace));
    }

    // --- [ xrCreateSpatialAnchorSpaceFromIdANDROID ] ---

    /** {@code XrResult xrCreateSpatialAnchorSpaceFromIdANDROID(XrSession session, XrSpatialContextEXT spatialContext, XrSpatialAnchorSpaceFromIdCreateInfoANDROID const * createInfo, XrSpace * anchorSpace)} */
    public static int nxrCreateSpatialAnchorSpaceFromIdANDROID(XrSession session, XrSpatialContextEXT spatialContext, long createInfo, long anchorSpace) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorSpaceFromIdANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(session.address(), spatialContext.address(), createInfo, anchorSpace, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialAnchorSpaceFromIdANDROID(XrSession session, XrSpatialContextEXT spatialContext, XrSpatialAnchorSpaceFromIdCreateInfoANDROID const * createInfo, XrSpace * anchorSpace)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorSpaceFromIdANDROID(XrSession session, XrSpatialContextEXT spatialContext, @NativeType("XrSpatialAnchorSpaceFromIdCreateInfoANDROID const *") XrSpatialAnchorSpaceFromIdCreateInfoANDROID createInfo, @NativeType("XrSpace *") PointerBuffer anchorSpace) {
        if (CHECKS) {
            check(anchorSpace, 1);
        }
        return nxrCreateSpatialAnchorSpaceFromIdANDROID(session, spatialContext, createInfo.address(), memAddress(anchorSpace));
    }

}
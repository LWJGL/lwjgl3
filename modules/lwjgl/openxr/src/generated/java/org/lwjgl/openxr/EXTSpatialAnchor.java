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

public class EXTSpatialAnchor {

    public static final int XR_EXT_spatial_anchor_SPEC_VERSION = 1;

    public static final String XR_EXT_SPATIAL_ANCHOR_EXTENSION_NAME = "XR_EXT_spatial_anchor";

    public static final int XR_SPATIAL_CAPABILITY_ANCHOR_EXT = 1000762000;

    public static final int XR_SPATIAL_COMPONENT_TYPE_ANCHOR_EXT = 1000762000;

    public static final int
        XR_TYPE_SPATIAL_CAPABILITY_CONFIGURATION_ANCHOR_EXT = 1000762000,
        XR_TYPE_SPATIAL_COMPONENT_ANCHOR_LIST_EXT           = 1000762001,
        XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_EXT              = 1000762002;

    protected EXTSpatialAnchor() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpatialAnchorEXT ] ---

    /** {@code XrResult xrCreateSpatialAnchorEXT(XrSpatialContextEXT spatialContext, XrSpatialAnchorCreateInfoEXT const * createInfo, XrSpatialEntityIdEXT * anchorEntityId, XrSpatialEntityEXT * anchorEntity)} */
    public static int nxrCreateSpatialAnchorEXT(XrSpatialContextEXT spatialContext, long createInfo, long anchorEntityId, long anchorEntity) {
        long __functionAddress = spatialContext.getCapabilities().xrCreateSpatialAnchorEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorCreateInfoEXT.validate(createInfo);
        }
        return callPPPPI(spatialContext.address(), createInfo, anchorEntityId, anchorEntity, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialAnchorEXT(XrSpatialContextEXT spatialContext, XrSpatialAnchorCreateInfoEXT const * createInfo, XrSpatialEntityIdEXT * anchorEntityId, XrSpatialEntityEXT * anchorEntity)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorEXT(XrSpatialContextEXT spatialContext, @NativeType("XrSpatialAnchorCreateInfoEXT const *") XrSpatialAnchorCreateInfoEXT createInfo, @NativeType("XrSpatialEntityIdEXT *") LongBuffer anchorEntityId, @NativeType("XrSpatialEntityEXT *") PointerBuffer anchorEntity) {
        if (CHECKS) {
            check(anchorEntityId, 1);
            check(anchorEntity, 1);
        }
        return nxrCreateSpatialAnchorEXT(spatialContext, createInfo.address(), memAddress(anchorEntityId), memAddress(anchorEntity));
    }

}
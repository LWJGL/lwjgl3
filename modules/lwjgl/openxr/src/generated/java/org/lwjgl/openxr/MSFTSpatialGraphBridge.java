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

/** The MSFT_spatial_graph_bridge extension. */
public class MSFTSpatialGraphBridge {

    /** The extension specification version. */
    public static final int XR_MSFT_spatial_graph_bridge_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_MSFT_SPATIAL_GRAPH_BRIDGE_EXTENSION_NAME = "XR_MSFT_spatial_graph_bridge";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT = 1000049000;

    /**
     * XrSpatialGraphNodeTypeMSFT
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_SPATIAL_GRAPH_NODE_TYPE_STATIC_MSFT SPATIAL_GRAPH_NODE_TYPE_STATIC_MSFT}</li>
     * <li>{@link #XR_SPATIAL_GRAPH_NODE_TYPE_DYNAMIC_MSFT SPATIAL_GRAPH_NODE_TYPE_DYNAMIC_MSFT}</li>
     * </ul>
     */
    public static final int
        XR_SPATIAL_GRAPH_NODE_TYPE_STATIC_MSFT  = 1,
        XR_SPATIAL_GRAPH_NODE_TYPE_DYNAMIC_MSFT = 2;

    protected MSFTSpatialGraphBridge() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpatialGraphNodeSpaceMSFT ] ---

    public static int nxrCreateSpatialGraphNodeSpaceMSFT(XrSession session, long createInfo, long space) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialGraphNodeSpaceMSFT;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialGraphNodeSpaceCreateInfoMSFT.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, space, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrCreateSpatialGraphNodeSpaceMSFT(XrSession session, @NativeType("XrSpatialGraphNodeSpaceCreateInfoMSFT const *") XrSpatialGraphNodeSpaceCreateInfoMSFT createInfo, @NativeType("XrSpace *") PointerBuffer space) {
        if (CHECKS) {
            check(space, 1);
        }
        return nxrCreateSpatialGraphNodeSpaceMSFT(session, createInfo.address(), memAddress(space));
    }

}
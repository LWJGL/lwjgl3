/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class MSFTSpatialGraphBridge {

    public static final int XR_MSFT_spatial_graph_bridge_SPEC_VERSION = 2;

    public static final String XR_MSFT_SPATIAL_GRAPH_BRIDGE_EXTENSION_NAME = "XR_MSFT_spatial_graph_bridge";

    public static final int XR_GUID_SIZE_MSFT = 16;

    public static final int XR_OBJECT_TYPE_SPATIAL_GRAPH_NODE_BINDING_MSFT = 1000049000;

    public static final int
        XR_TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT           = 1000049000,
        XR_TYPE_SPATIAL_GRAPH_STATIC_NODE_BINDING_CREATE_INFO_MSFT  = 1000049001,
        XR_TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_GET_INFO_MSFT = 1000049002,
        XR_TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_MSFT          = 1000049003;

    public static final int
        XR_SPATIAL_GRAPH_NODE_TYPE_STATIC_MSFT  = 1,
        XR_SPATIAL_GRAPH_NODE_TYPE_DYNAMIC_MSFT = 2;

    protected MSFTSpatialGraphBridge() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpatialGraphNodeSpaceMSFT ] ---

    /** {@code XrResult xrCreateSpatialGraphNodeSpaceMSFT(XrSession session, XrSpatialGraphNodeSpaceCreateInfoMSFT const * createInfo, XrSpace * space)} */
    public static int nxrCreateSpatialGraphNodeSpaceMSFT(XrSession session, long createInfo, long space) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialGraphNodeSpaceMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, space, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialGraphNodeSpaceMSFT(XrSession session, XrSpatialGraphNodeSpaceCreateInfoMSFT const * createInfo, XrSpace * space)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialGraphNodeSpaceMSFT(XrSession session, @NativeType("XrSpatialGraphNodeSpaceCreateInfoMSFT const *") XrSpatialGraphNodeSpaceCreateInfoMSFT createInfo, @NativeType("XrSpace *") PointerBuffer space) {
        if (CHECKS) {
            check(space, 1);
        }
        return nxrCreateSpatialGraphNodeSpaceMSFT(session, createInfo.address(), memAddress(space));
    }

    // --- [ xrTryCreateSpatialGraphStaticNodeBindingMSFT ] ---

    /** {@code XrResult xrTryCreateSpatialGraphStaticNodeBindingMSFT(XrSession session, XrSpatialGraphStaticNodeBindingCreateInfoMSFT const * createInfo, XrSpatialGraphNodeBindingMSFT * nodeBinding)} */
    public static int nxrTryCreateSpatialGraphStaticNodeBindingMSFT(XrSession session, long createInfo, long nodeBinding) {
        long __functionAddress = session.getCapabilities().xrTryCreateSpatialGraphStaticNodeBindingMSFT;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialGraphStaticNodeBindingCreateInfoMSFT.validate(createInfo);
        }
        return callPPPI(session.address(), createInfo, nodeBinding, __functionAddress);
    }

    /** {@code XrResult xrTryCreateSpatialGraphStaticNodeBindingMSFT(XrSession session, XrSpatialGraphStaticNodeBindingCreateInfoMSFT const * createInfo, XrSpatialGraphNodeBindingMSFT * nodeBinding)} */
    @NativeType("XrResult")
    public static int xrTryCreateSpatialGraphStaticNodeBindingMSFT(XrSession session, @NativeType("XrSpatialGraphStaticNodeBindingCreateInfoMSFT const *") XrSpatialGraphStaticNodeBindingCreateInfoMSFT createInfo, @NativeType("XrSpatialGraphNodeBindingMSFT *") PointerBuffer nodeBinding) {
        if (CHECKS) {
            check(nodeBinding, 1);
        }
        return nxrTryCreateSpatialGraphStaticNodeBindingMSFT(session, createInfo.address(), memAddress(nodeBinding));
    }

    // --- [ xrDestroySpatialGraphNodeBindingMSFT ] ---

    /** {@code XrResult xrDestroySpatialGraphNodeBindingMSFT(XrSpatialGraphNodeBindingMSFT nodeBinding)} */
    @NativeType("XrResult")
    public static int xrDestroySpatialGraphNodeBindingMSFT(XrSpatialGraphNodeBindingMSFT nodeBinding) {
        long __functionAddress = nodeBinding.getCapabilities().xrDestroySpatialGraphNodeBindingMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(nodeBinding.address(), __functionAddress);
    }

    // --- [ xrGetSpatialGraphNodeBindingPropertiesMSFT ] ---

    /** {@code XrResult xrGetSpatialGraphNodeBindingPropertiesMSFT(XrSpatialGraphNodeBindingMSFT nodeBinding, XrSpatialGraphNodeBindingPropertiesGetInfoMSFT const * getInfo, XrSpatialGraphNodeBindingPropertiesMSFT * properties)} */
    public static int nxrGetSpatialGraphNodeBindingPropertiesMSFT(XrSpatialGraphNodeBindingMSFT nodeBinding, long getInfo, long properties) {
        long __functionAddress = nodeBinding.getCapabilities().xrGetSpatialGraphNodeBindingPropertiesMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(nodeBinding.address(), getInfo, properties, __functionAddress);
    }

    /** {@code XrResult xrGetSpatialGraphNodeBindingPropertiesMSFT(XrSpatialGraphNodeBindingMSFT nodeBinding, XrSpatialGraphNodeBindingPropertiesGetInfoMSFT const * getInfo, XrSpatialGraphNodeBindingPropertiesMSFT * properties)} */
    @NativeType("XrResult")
    public static int xrGetSpatialGraphNodeBindingPropertiesMSFT(XrSpatialGraphNodeBindingMSFT nodeBinding, @NativeType("XrSpatialGraphNodeBindingPropertiesGetInfoMSFT const *") @Nullable XrSpatialGraphNodeBindingPropertiesGetInfoMSFT getInfo, @NativeType("XrSpatialGraphNodeBindingPropertiesMSFT *") XrSpatialGraphNodeBindingPropertiesMSFT properties) {
        return nxrGetSpatialGraphNodeBindingPropertiesMSFT(nodeBinding, memAddressSafe(getInfo), properties.address());
    }

}
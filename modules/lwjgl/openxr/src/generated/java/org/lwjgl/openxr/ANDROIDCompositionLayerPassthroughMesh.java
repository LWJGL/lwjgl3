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

public class ANDROIDCompositionLayerPassthroughMesh {

    public static final int XR_ANDROID_composition_layer_passthrough_mesh_SPEC_VERSION = 1;

    public static final String XR_ANDROID_COMPOSITION_LAYER_PASSTHROUGH_MESH_EXTENSION_NAME = "XR_ANDROID_composition_layer_passthrough_mesh";

    public static final int
        XR_TYPE_PASSTHROUGH_LAYER_CREATE_INFO_ANDROID       = 1000462000,
        XR_TYPE_PASSTHROUGH_LAYER_MESH_ANDROID              = 1000462001,
        XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_ANDROID       = 1000462002,
        XR_TYPE_SYSTEM_PASSTHROUGH_LAYER_PROPERTIES_ANDROID = 1000462003;

    public static final int XR_ERROR_MESH_DATA_LIMIT_EXCEEDED_ANDROID = -1000462000;

    public static final int XR_OBJECT_TYPE_PASSTHROUGH_LAYER_ANDROID = 1000462000;

    public static final int
        XR_WINDING_ORDER_UNKNOWN_ANDROID = 0,
        XR_WINDING_ORDER_CW_ANDROID      = 1,
        XR_WINDING_ORDER_CCW_ANDROID     = 2;

    protected ANDROIDCompositionLayerPassthroughMesh() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreatePassthroughLayerANDROID ] ---

    /** {@code XrResult xrCreatePassthroughLayerANDROID(XrSession session, XrPassthroughLayerCreateInfoANDROID const * createInfo, XrPassthroughLayerANDROID * layer)} */
    public static int nxrCreatePassthroughLayerANDROID(XrSession session, long createInfo, long layer) {
        long __functionAddress = session.getCapabilities().xrCreatePassthroughLayerANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, layer, __functionAddress);
    }

    /** {@code XrResult xrCreatePassthroughLayerANDROID(XrSession session, XrPassthroughLayerCreateInfoANDROID const * createInfo, XrPassthroughLayerANDROID * layer)} */
    @NativeType("XrResult")
    public static int xrCreatePassthroughLayerANDROID(XrSession session, @NativeType("XrPassthroughLayerCreateInfoANDROID const *") XrPassthroughLayerCreateInfoANDROID createInfo, @NativeType("XrPassthroughLayerANDROID *") PointerBuffer layer) {
        if (CHECKS) {
            check(layer, 1);
        }
        return nxrCreatePassthroughLayerANDROID(session, createInfo.address(), memAddress(layer));
    }

    // --- [ xrDestroyPassthroughLayerANDROID ] ---

    /** {@code XrResult xrDestroyPassthroughLayerANDROID(XrPassthroughLayerANDROID layer)} */
    @NativeType("XrResult")
    public static int xrDestroyPassthroughLayerANDROID(XrPassthroughLayerANDROID layer) {
        long __functionAddress = layer.getCapabilities().xrDestroyPassthroughLayerANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(layer.address(), __functionAddress);
    }

    // --- [ xrSetPassthroughLayerMeshANDROID ] ---

    /** {@code XrResult xrSetPassthroughLayerMeshANDROID(XrPassthroughLayerANDROID layer, XrPassthroughLayerMeshANDROID const * mesh)} */
    public static int nxrSetPassthroughLayerMeshANDROID(XrPassthroughLayerANDROID layer, long mesh) {
        long __functionAddress = layer.getCapabilities().xrSetPassthroughLayerMeshANDROID;
        if (CHECKS) {
            check(__functionAddress);
            XrPassthroughLayerMeshANDROID.validate(mesh);
        }
        return callPPI(layer.address(), mesh, __functionAddress);
    }

    /** {@code XrResult xrSetPassthroughLayerMeshANDROID(XrPassthroughLayerANDROID layer, XrPassthroughLayerMeshANDROID const * mesh)} */
    @NativeType("XrResult")
    public static int xrSetPassthroughLayerMeshANDROID(XrPassthroughLayerANDROID layer, @NativeType("XrPassthroughLayerMeshANDROID const *") XrPassthroughLayerMeshANDROID mesh) {
        return nxrSetPassthroughLayerMeshANDROID(layer, mesh.address());
    }

}
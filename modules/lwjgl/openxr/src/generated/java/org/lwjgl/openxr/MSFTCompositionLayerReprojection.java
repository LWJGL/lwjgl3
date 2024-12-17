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

public class MSFTCompositionLayerReprojection {

    public static final int XR_MSFT_composition_layer_reprojection_SPEC_VERSION = 1;

    public static final String XR_MSFT_COMPOSITION_LAYER_REPROJECTION_EXTENSION_NAME = "XR_MSFT_composition_layer_reprojection";

    public static final int
        XR_TYPE_COMPOSITION_LAYER_REPROJECTION_INFO_MSFT           = 1000066000,
        XR_TYPE_COMPOSITION_LAYER_REPROJECTION_PLANE_OVERRIDE_MSFT = 1000066001;

    public static final int XR_ERROR_REPROJECTION_MODE_UNSUPPORTED_MSFT = -1000066000;

    public static final int
        XR_REPROJECTION_MODE_DEPTH_MSFT             = 1,
        XR_REPROJECTION_MODE_PLANAR_FROM_DEPTH_MSFT = 2,
        XR_REPROJECTION_MODE_PLANAR_MANUAL_MSFT     = 3,
        XR_REPROJECTION_MODE_ORIENTATION_ONLY_MSFT  = 4;

    protected MSFTCompositionLayerReprojection() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateReprojectionModesMSFT ] ---

    /** {@code XrResult xrEnumerateReprojectionModesMSFT(XrInstance instance, XrSystemId systemId, XrViewConfigurationType viewConfigurationType, uint32_t modeCapacityInput, uint32_t * modeCountOutput, XrReprojectionModeMSFT * modes)} */
    public static int nxrEnumerateReprojectionModesMSFT(XrInstance instance, long systemId, int viewConfigurationType, int modeCapacityInput, long modeCountOutput, long modes) {
        long __functionAddress = instance.getCapabilities().xrEnumerateReprojectionModesMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(instance.address(), systemId, viewConfigurationType, modeCapacityInput, modeCountOutput, modes, __functionAddress);
    }

    /** {@code XrResult xrEnumerateReprojectionModesMSFT(XrInstance instance, XrSystemId systemId, XrViewConfigurationType viewConfigurationType, uint32_t modeCapacityInput, uint32_t * modeCountOutput, XrReprojectionModeMSFT * modes)} */
    @NativeType("XrResult")
    public static int xrEnumerateReprojectionModesMSFT(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("XrViewConfigurationType") int viewConfigurationType, @NativeType("uint32_t *") IntBuffer modeCountOutput, @NativeType("XrReprojectionModeMSFT *") @Nullable IntBuffer modes) {
        if (CHECKS) {
            check(modeCountOutput, 1);
        }
        return nxrEnumerateReprojectionModesMSFT(instance, systemId, viewConfigurationType, remainingSafe(modes), memAddress(modeCountOutput), memAddressSafe(modes));
    }

}
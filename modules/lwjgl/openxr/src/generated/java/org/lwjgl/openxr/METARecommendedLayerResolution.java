/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class METARecommendedLayerResolution {

    public static final int XR_META_recommended_layer_resolution_SPEC_VERSION = 1;

    public static final String XR_META_RECOMMENDED_LAYER_RESOLUTION_EXTENSION_NAME = "XR_META_recommended_layer_resolution";

    public static final int
        XR_TYPE_RECOMMENDED_LAYER_RESOLUTION_META          = 1000254000,
        XR_TYPE_RECOMMENDED_LAYER_RESOLUTION_GET_INFO_META = 1000254001;

    protected METARecommendedLayerResolution() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetRecommendedLayerResolutionMETA ] ---

    /** {@code XrResult xrGetRecommendedLayerResolutionMETA(XrSession session, XrRecommendedLayerResolutionGetInfoMETA const * info, XrRecommendedLayerResolutionMETA * resolution)} */
    public static int nxrGetRecommendedLayerResolutionMETA(XrSession session, long info, long resolution) {
        long __functionAddress = session.getCapabilities().xrGetRecommendedLayerResolutionMETA;
        if (CHECKS) {
            check(__functionAddress);
            XrRecommendedLayerResolutionGetInfoMETA.validate(info);
        }
        return callPPPI(session.address(), info, resolution, __functionAddress);
    }

    /** {@code XrResult xrGetRecommendedLayerResolutionMETA(XrSession session, XrRecommendedLayerResolutionGetInfoMETA const * info, XrRecommendedLayerResolutionMETA * resolution)} */
    @NativeType("XrResult")
    public static int xrGetRecommendedLayerResolutionMETA(XrSession session, @NativeType("XrRecommendedLayerResolutionGetInfoMETA const *") XrRecommendedLayerResolutionGetInfoMETA info, @NativeType("XrRecommendedLayerResolutionMETA *") XrRecommendedLayerResolutionMETA resolution) {
        return nxrGetRecommendedLayerResolutionMETA(session, info.address(), resolution.address());
    }

}
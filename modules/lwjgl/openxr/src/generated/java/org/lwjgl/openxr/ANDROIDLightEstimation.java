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

public class ANDROIDLightEstimation {

    public static final int XR_ANDROID_light_estimation_SPEC_VERSION = 1;

    public static final String XR_ANDROID_LIGHT_ESTIMATION_EXTENSION_NAME = "XR_ANDROID_light_estimation";

    public static final int
        XR_TYPE_LIGHT_ESTIMATOR_CREATE_INFO_ANDROID        = 1000700000,
        XR_TYPE_LIGHT_ESTIMATE_GET_INFO_ANDROID            = 1000700001,
        XR_TYPE_LIGHT_ESTIMATE_ANDROID                     = 1000700002,
        XR_TYPE_DIRECTIONAL_LIGHT_ANDROID                  = 1000700003,
        XR_TYPE_SPHERICAL_HARMONICS_ANDROID                = 1000700004,
        XR_TYPE_AMBIENT_LIGHT_ANDROID                      = 1000700005,
        XR_TYPE_SYSTEM_LIGHT_ESTIMATION_PROPERTIES_ANDROID = 1000700006;

    public static final int XR_OBJECT_TYPE_LIGHT_ESTIMATOR_ANDROID = 1000700000;

    public static final int
        XR_LIGHT_ESTIMATE_STATE_VALID_ANDROID   = 0,
        XR_LIGHT_ESTIMATE_STATE_INVALID_ANDROID = 1;

    public static final int
        XR_SPHERICAL_HARMONICS_KIND_TOTAL_ANDROID   = 0,
        XR_SPHERICAL_HARMONICS_KIND_AMBIENT_ANDROID = 1;

    protected ANDROIDLightEstimation() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateLightEstimatorANDROID ] ---

    /** {@code XrResult xrCreateLightEstimatorANDROID(XrSession session, XrLightEstimatorCreateInfoANDROID * createInfo, XrLightEstimatorANDROID * outHandle)} */
    public static int nxrCreateLightEstimatorANDROID(XrSession session, long createInfo, long outHandle) {
        long __functionAddress = session.getCapabilities().xrCreateLightEstimatorANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, outHandle, __functionAddress);
    }

    /** {@code XrResult xrCreateLightEstimatorANDROID(XrSession session, XrLightEstimatorCreateInfoANDROID * createInfo, XrLightEstimatorANDROID * outHandle)} */
    @NativeType("XrResult")
    public static int xrCreateLightEstimatorANDROID(XrSession session, @NativeType("XrLightEstimatorCreateInfoANDROID *") XrLightEstimatorCreateInfoANDROID createInfo, @NativeType("XrLightEstimatorANDROID *") PointerBuffer outHandle) {
        if (CHECKS) {
            check(outHandle, 1);
        }
        return nxrCreateLightEstimatorANDROID(session, createInfo.address(), memAddress(outHandle));
    }

    // --- [ xrDestroyLightEstimatorANDROID ] ---

    /** {@code XrResult xrDestroyLightEstimatorANDROID(XrLightEstimatorANDROID estimator)} */
    @NativeType("XrResult")
    public static int xrDestroyLightEstimatorANDROID(XrLightEstimatorANDROID estimator) {
        long __functionAddress = estimator.getCapabilities().xrDestroyLightEstimatorANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(estimator.address(), __functionAddress);
    }

    // --- [ xrGetLightEstimateANDROID ] ---

    /** {@code XrResult xrGetLightEstimateANDROID(XrLightEstimatorANDROID estimator, XrLightEstimateGetInfoANDROID const * input, XrLightEstimateANDROID * output)} */
    public static int nxrGetLightEstimateANDROID(XrLightEstimatorANDROID estimator, long input, long output) {
        long __functionAddress = estimator.getCapabilities().xrGetLightEstimateANDROID;
        if (CHECKS) {
            check(__functionAddress);
            XrLightEstimateGetInfoANDROID.validate(input);
        }
        return callPPPI(estimator.address(), input, output, __functionAddress);
    }

    /** {@code XrResult xrGetLightEstimateANDROID(XrLightEstimatorANDROID estimator, XrLightEstimateGetInfoANDROID const * input, XrLightEstimateANDROID * output)} */
    @NativeType("XrResult")
    public static int xrGetLightEstimateANDROID(XrLightEstimatorANDROID estimator, @NativeType("XrLightEstimateGetInfoANDROID const *") XrLightEstimateGetInfoANDROID input, @NativeType("XrLightEstimateANDROID *") XrLightEstimateANDROID output) {
        return nxrGetLightEstimateANDROID(estimator, input.address(), output.address());
    }

}
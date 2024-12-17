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

public class FBDisplayRefreshRate {

    public static final int XR_FB_display_refresh_rate_SPEC_VERSION = 1;

    public static final String XR_FB_DISPLAY_REFRESH_RATE_EXTENSION_NAME = "XR_FB_display_refresh_rate";

    public static final int XR_TYPE_EVENT_DATA_DISPLAY_REFRESH_RATE_CHANGED_FB = 1000101000;

    public static final int XR_ERROR_DISPLAY_REFRESH_RATE_UNSUPPORTED_FB = -1000101000;

    protected FBDisplayRefreshRate() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateDisplayRefreshRatesFB ] ---

    /** {@code XrResult xrEnumerateDisplayRefreshRatesFB(XrSession session, uint32_t displayRefreshRateCapacityInput, uint32_t * displayRefreshRateCountOutput, float * displayRefreshRates)} */
    public static int nxrEnumerateDisplayRefreshRatesFB(XrSession session, int displayRefreshRateCapacityInput, long displayRefreshRateCountOutput, long displayRefreshRates) {
        long __functionAddress = session.getCapabilities().xrEnumerateDisplayRefreshRatesFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), displayRefreshRateCapacityInput, displayRefreshRateCountOutput, displayRefreshRates, __functionAddress);
    }

    /** {@code XrResult xrEnumerateDisplayRefreshRatesFB(XrSession session, uint32_t displayRefreshRateCapacityInput, uint32_t * displayRefreshRateCountOutput, float * displayRefreshRates)} */
    @NativeType("XrResult")
    public static int xrEnumerateDisplayRefreshRatesFB(XrSession session, @NativeType("uint32_t *") IntBuffer displayRefreshRateCountOutput, @NativeType("float *") @Nullable FloatBuffer displayRefreshRates) {
        if (CHECKS) {
            check(displayRefreshRateCountOutput, 1);
        }
        return nxrEnumerateDisplayRefreshRatesFB(session, remainingSafe(displayRefreshRates), memAddress(displayRefreshRateCountOutput), memAddressSafe(displayRefreshRates));
    }

    // --- [ xrGetDisplayRefreshRateFB ] ---

    /** {@code XrResult xrGetDisplayRefreshRateFB(XrSession session, float * displayRefreshRate)} */
    public static int nxrGetDisplayRefreshRateFB(XrSession session, long displayRefreshRate) {
        long __functionAddress = session.getCapabilities().xrGetDisplayRefreshRateFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), displayRefreshRate, __functionAddress);
    }

    /** {@code XrResult xrGetDisplayRefreshRateFB(XrSession session, float * displayRefreshRate)} */
    @NativeType("XrResult")
    public static int xrGetDisplayRefreshRateFB(XrSession session, @NativeType("float *") FloatBuffer displayRefreshRate) {
        if (CHECKS) {
            check(displayRefreshRate, 1);
        }
        return nxrGetDisplayRefreshRateFB(session, memAddress(displayRefreshRate));
    }

    // --- [ xrRequestDisplayRefreshRateFB ] ---

    /** {@code XrResult xrRequestDisplayRefreshRateFB(XrSession session, float displayRefreshRate)} */
    @NativeType("XrResult")
    public static int xrRequestDisplayRefreshRateFB(XrSession session, float displayRefreshRate) {
        long __functionAddress = session.getCapabilities().xrRequestDisplayRefreshRateFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), displayRefreshRate, __functionAddress);
    }

}
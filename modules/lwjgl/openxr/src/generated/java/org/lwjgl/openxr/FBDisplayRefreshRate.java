/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The FB_display_refresh_rate extension. */
public class FBDisplayRefreshRate {

    /** The extension specification version. */
    public static final int XR_FB_display_refresh_rate_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_DISPLAY_REFRESH_RATE_EXTENSION_NAME = "XR_FB_display_refresh_rate";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_EVENT_DATA_DISPLAY_REFRESH_RATE_CHANGED_FB = 1000101000;

    /** Extends {@code XrResult}. */
    public static final int XR_ERROR_DISPLAY_REFRESH_RATE_UNSUPPORTED_FB = -1000101000;

    protected FBDisplayRefreshRate() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateDisplayRefreshRatesFB ] ---

    public static int nxrEnumerateDisplayRefreshRatesFB(XrSession session, int displayRefreshRateCapacityInput, long displayRefreshRateCountOutput, long displayRefreshRates) {
        long __functionAddress = session.getCapabilities().xrEnumerateDisplayRefreshRatesFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), displayRefreshRateCapacityInput, displayRefreshRateCountOutput, displayRefreshRates, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrEnumerateDisplayRefreshRatesFB(XrSession session, @NativeType("uint32_t *") IntBuffer displayRefreshRateCountOutput, @Nullable @NativeType("float *") FloatBuffer displayRefreshRates) {
        if (CHECKS) {
            check(displayRefreshRateCountOutput, 1);
        }
        return nxrEnumerateDisplayRefreshRatesFB(session, remainingSafe(displayRefreshRates), memAddress(displayRefreshRateCountOutput), memAddressSafe(displayRefreshRates));
    }

    // --- [ xrGetDisplayRefreshRateFB ] ---

    public static int nxrGetDisplayRefreshRateFB(XrSession session, long displayRefreshRate) {
        long __functionAddress = session.getCapabilities().xrGetDisplayRefreshRateFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), displayRefreshRate, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetDisplayRefreshRateFB(XrSession session, @NativeType("float *") FloatBuffer displayRefreshRate) {
        if (CHECKS) {
            check(displayRefreshRate, 1);
        }
        return nxrGetDisplayRefreshRateFB(session, memAddress(displayRefreshRate));
    }

    // --- [ xrRequestDisplayRefreshRateFB ] ---

    @NativeType("XrResult")
    public static int xrRequestDisplayRefreshRateFB(XrSession session, float displayRefreshRate) {
        long __functionAddress = session.getCapabilities().xrRequestDisplayRefreshRateFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), displayRefreshRate, __functionAddress);
    }

    /** Array version of: {@link #xrEnumerateDisplayRefreshRatesFB EnumerateDisplayRefreshRatesFB} */
    @NativeType("XrResult")
    public static int xrEnumerateDisplayRefreshRatesFB(XrSession session, @NativeType("uint32_t *") int[] displayRefreshRateCountOutput, @Nullable @NativeType("float *") float[] displayRefreshRates) {
        long __functionAddress = session.getCapabilities().xrEnumerateDisplayRefreshRatesFB;
        if (CHECKS) {
            check(__functionAddress);
            check(displayRefreshRateCountOutput, 1);
        }
        return callPPPI(session.address(), lengthSafe(displayRefreshRates), displayRefreshRateCountOutput, displayRefreshRates, __functionAddress);
    }

    /** Array version of: {@link #xrGetDisplayRefreshRateFB GetDisplayRefreshRateFB} */
    @NativeType("XrResult")
    public static int xrGetDisplayRefreshRateFB(XrSession session, @NativeType("float *") float[] displayRefreshRate) {
        long __functionAddress = session.getCapabilities().xrGetDisplayRefreshRateFB;
        if (CHECKS) {
            check(__functionAddress);
            check(displayRefreshRate, 1);
        }
        return callPPI(session.address(), displayRefreshRate, __functionAddress);
    }

}
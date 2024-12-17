/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class METAPassthroughPreferences {

    public static final int XR_META_passthrough_preferences_SPEC_VERSION = 1;

    public static final String XR_META_PASSTHROUGH_PREFERENCES_EXTENSION_NAME = "XR_META_passthrough_preferences";

    public static final int XR_TYPE_PASSTHROUGH_PREFERENCES_META = 1000217000;

    public static final int XR_PASSTHROUGH_PREFERENCE_DEFAULT_TO_ACTIVE_BIT_META = 0x1;

    protected METAPassthroughPreferences() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetPassthroughPreferencesMETA ] ---

    /** {@code XrResult xrGetPassthroughPreferencesMETA(XrSession session, XrPassthroughPreferencesMETA * preferences)} */
    public static int nxrGetPassthroughPreferencesMETA(XrSession session, long preferences) {
        long __functionAddress = session.getCapabilities().xrGetPassthroughPreferencesMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), preferences, __functionAddress);
    }

    /** {@code XrResult xrGetPassthroughPreferencesMETA(XrSession session, XrPassthroughPreferencesMETA * preferences)} */
    @NativeType("XrResult")
    public static int xrGetPassthroughPreferencesMETA(XrSession session, @NativeType("XrPassthroughPreferencesMETA *") XrPassthroughPreferencesMETA preferences) {
        return nxrGetPassthroughPreferencesMETA(session, preferences.address());
    }

}
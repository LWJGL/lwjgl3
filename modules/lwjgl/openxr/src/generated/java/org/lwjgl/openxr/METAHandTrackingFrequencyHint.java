/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class METAHandTrackingFrequencyHint {

    public static final int XR_META_hand_tracking_frequency_hint_SPEC_VERSION = 1;

    public static final String XR_META_HAND_TRACKING_FREQUENCY_HINT_EXTENSION_NAME = "XR_META_hand_tracking_frequency_hint";

    public static final int
        XR_HAND_TRACKING_FREQUENCY_HINT_DEFAULT_META = 1,
        XR_HAND_TRACKING_FREQUENCY_HINT_HIGH_META    = 2;

    protected METAHandTrackingFrequencyHint() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSetHandTrackingFrequencyHintMETA ] ---

    /** {@code XrResult xrSetHandTrackingFrequencyHintMETA(XrSession session, XrHandTrackingFrequencyHintMETA frequencyHint)} */
    @NativeType("XrResult")
    public static int xrSetHandTrackingFrequencyHintMETA(XrSession session, @NativeType("XrHandTrackingFrequencyHintMETA") int frequencyHint) {
        long __functionAddress = session.getCapabilities().xrSetHandTrackingFrequencyHintMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), frequencyHint, __functionAddress);
    }

}
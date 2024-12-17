/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class FBPassthroughKeyboardHands {

    public static final int XR_FB_passthrough_keyboard_hands_SPEC_VERSION = 2;

    public static final String XR_FB_PASSTHROUGH_KEYBOARD_HANDS_EXTENSION_NAME = "XR_FB_passthrough_keyboard_hands";

    public static final int
        XR_PASSTHROUGH_LAYER_PURPOSE_TRACKED_KEYBOARD_HANDS_FB        = 1000203001,
        XR_PASSTHROUGH_LAYER_PURPOSE_TRACKED_KEYBOARD_MASKED_HANDS_FB = 1000203002;

    public static final int XR_TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB = 1000203002;

    protected FBPassthroughKeyboardHands() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrPassthroughLayerSetKeyboardHandsIntensityFB ] ---

    /** {@code XrResult xrPassthroughLayerSetKeyboardHandsIntensityFB(XrPassthroughLayerFB layer, XrPassthroughKeyboardHandsIntensityFB const * intensity)} */
    public static int nxrPassthroughLayerSetKeyboardHandsIntensityFB(XrPassthroughLayerFB layer, long intensity) {
        long __functionAddress = layer.getCapabilities().xrPassthroughLayerSetKeyboardHandsIntensityFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(layer.address(), intensity, __functionAddress);
    }

    /** {@code XrResult xrPassthroughLayerSetKeyboardHandsIntensityFB(XrPassthroughLayerFB layer, XrPassthroughKeyboardHandsIntensityFB const * intensity)} */
    @NativeType("XrResult")
    public static int xrPassthroughLayerSetKeyboardHandsIntensityFB(XrPassthroughLayerFB layer, @NativeType("XrPassthroughKeyboardHandsIntensityFB const *") XrPassthroughKeyboardHandsIntensityFB intensity) {
        return nxrPassthroughLayerSetKeyboardHandsIntensityFB(layer, intensity.address());
    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** The FB_passthrough_keyboard_hands extension. */
public class FBPassthroughKeyboardHands {

    /** The extension specification version. */
    public static final int XR_FB_passthrough_keyboard_hands_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_PASSTHROUGH_KEYBOARD_HANDS_EXTENSION_NAME = "XR_FB_passthrough_keyboard_hands";

    /** Extends {@code XrPassthroughLayerPurposeFB}. */
    public static final int XR_PASSTHROUGH_LAYER_PURPOSE_TRACKED_KEYBOARD_HANDS_FB = 1000203001;

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB = 1000203002;

    protected FBPassthroughKeyboardHands() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrPassthroughLayerSetKeyboardHandsIntensityFB ] ---

    /** Unsafe version of: {@link #xrPassthroughLayerSetKeyboardHandsIntensityFB PassthroughLayerSetKeyboardHandsIntensityFB} */
    public static int nxrPassthroughLayerSetKeyboardHandsIntensityFB(XrPassthroughLayerFB layer, long intensity) {
        long __functionAddress = layer.getCapabilities().xrPassthroughLayerSetKeyboardHandsIntensityFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(layer.address(), intensity, __functionAddress);
    }

    /**
     * Renders hands over the keyboard (keyboard hands) with a specific intensity of hands passthrough layer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The {@link #xrPassthroughLayerSetKeyboardHandsIntensityFB PassthroughLayerSetKeyboardHandsIntensityFB} function is defined as:</p>
     * 
     * <pre><code>
     * XrResult xrPassthroughLayerSetKeyboardHandsIntensityFB(
     *     XrPassthroughLayerFB                        layer,
     *     const XrPassthroughKeyboardHandsIntensityFB* intensity);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Sets an {@link XrPassthroughKeyboardHandsIntensityFB} intensity on an {@code XrPassthroughLayerFB} layer.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>The {@link FBPassthroughKeyboardHands XR_FB_passthrough_keyboard_hands} extension <b>must</b> be enabled prior to calling {@link #xrPassthroughLayerSetKeyboardHandsIntensityFB PassthroughLayerSetKeyboardHandsIntensityFB}</li>
     * <li>{@code layer} <b>must</b> be a valid {@code XrPassthroughLayerFB} handle</li>
     * <li>{@code intensity} <b>must</b> be a pointer to a valid {@link XrPassthroughKeyboardHandsIntensityFB} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_SUCCESS SUCCESS}</li>
     * <li>{@link XR10#XR_SESSION_LOSS_PENDING SESSION_LOSS_PENDING}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link XR10#XR_ERROR_FUNCTION_UNSUPPORTED ERROR_FUNCTION_UNSUPPORTED}</li>
     * <li>{@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}</li>
     * <li>{@link XR10#XR_ERROR_HANDLE_INVALID ERROR_HANDLE_INVALID}</li>
     * <li>{@link XR10#XR_ERROR_INSTANCE_LOST ERROR_INSTANCE_LOST}</li>
     * <li>{@link XR10#XR_ERROR_SESSION_LOST ERROR_SESSION_LOST}</li>
     * <li>{@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link XrPassthroughKeyboardHandsIntensityFB}</p>
     *
     * @param layer     the {@code XrPassthroughLayerFB} to apply the intensity.
     * @param intensity the {@link XrPassthroughKeyboardHandsIntensityFB} to be set.
     */
    @NativeType("XrResult")
    public static int xrPassthroughLayerSetKeyboardHandsIntensityFB(XrPassthroughLayerFB layer, @NativeType("XrPassthroughKeyboardHandsIntensityFB const *") XrPassthroughKeyboardHandsIntensityFB intensity) {
        return nxrPassthroughLayerSetKeyboardHandsIntensityFB(layer, intensity.address());
    }

}
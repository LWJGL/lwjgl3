/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_VALVE_analog_threshold">XR_VALVE_analog_threshold</a> extension.
 * 
 * <p>This extension allows the application to control the threshold and haptic feedback applied to an analog to digital conversion. See {@link XrInteractionProfileAnalogThresholdVALVE} for more information.</p>
 * 
 * <p>Applications <b>should</b> also enable the {@link KHRBindingModification XR_KHR_binding_modification} extension to be able to define multiple thresholds.</p>
 */
public final class VALVEAnalogThreshold {

    /** The extension specification version. */
    public static final int XR_VALVE_analog_threshold_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_VALVE_ANALOG_THRESHOLD_EXTENSION_NAME = "XR_VALVE_analog_threshold";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_INTERACTION_PROFILE_ANALOG_THRESHOLD_VALVE = 1000079000;

    private VALVEAnalogThreshold() {}

}
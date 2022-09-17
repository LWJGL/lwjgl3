/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_EXT_eye_gaze_interaction">XR_EXT_eye_gaze_interaction</a> extension.
 * 
 * <p>This extension provides an {@code XrPath} for getting eye gaze input from an eye tracker to enable eye gaze interactions.</p>
 * 
 * <p>The intended use for this extension is to provide:</p>
 * 
 * <ul>
 * <li>system properties to inform if eye gaze interaction is supported by the current device.</li>
 * <li>an {@code XrPath} for real time eye tracking that exposes an accurate and precise eye gaze pose to be used to enable eye gaze interactions.</li>
 * <li>a structure {@link XrEyeGazeSampleTimeEXT} that allows for an application to retrieve more information regarding the eye tracking samples.</li>
 * </ul>
 * 
 * <p>With these building blocks, an application can discover if the XR runtime has access to an eye tracker, bind the eye gaze pose to the action system, determine if the eye tracker is actively tracking the users eye gaze, and use the eye gaze pose as an input signal to build eye gaze interactions.</p>
 */
public final class EXTEyeGazeInteraction {

    /** The extension specification version. */
    public static final int XR_EXT_eye_gaze_interaction_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_EXT_EYE_GAZE_INTERACTION_EXTENSION_NAME = "XR_EXT_eye_gaze_interaction";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_SYSTEM_EYE_GAZE_INTERACTION_PROPERTIES_EXT TYPE_SYSTEM_EYE_GAZE_INTERACTION_PROPERTIES_EXT}</li>
     * <li>{@link #XR_TYPE_EYE_GAZE_SAMPLE_TIME_EXT TYPE_EYE_GAZE_SAMPLE_TIME_EXT}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_SYSTEM_EYE_GAZE_INTERACTION_PROPERTIES_EXT = 1000030000,
        XR_TYPE_EYE_GAZE_SAMPLE_TIME_EXT                   = 1000030001;

    private EXTEyeGazeInteraction() {}

}
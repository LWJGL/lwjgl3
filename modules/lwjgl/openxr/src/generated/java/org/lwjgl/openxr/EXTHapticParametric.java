/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTHapticParametric {

    public static final int XR_EXT_haptic_parametric_SPEC_VERSION = 1;

    public static final String XR_EXT_HAPTIC_PARAMETRIC_EXTENSION_NAME = "XR_EXT_haptic_parametric";

    public static final int
        XR_TYPE_HAPTIC_PARAMETRIC_VIBRATION_EXT         = 1000775000,
        XR_TYPE_HAPTIC_PARAMETRIC_PROPERTIES_EXT        = 1000775001,
        XR_TYPE_SYSTEM_HAPTIC_PARAMETRIC_PROPERTIES_EXT = 1000775002;

    public static final int
        XR_HAPTIC_PARAMETRIC_STREAM_FRAME_TYPE_NONE_EXT               = 0,
        XR_HAPTIC_PARAMETRIC_STREAM_FRAME_TYPE_FIRST_FRAME_EXT        = 1,
        XR_HAPTIC_PARAMETRIC_STREAM_FRAME_TYPE_INTERMEDIATE_FRAME_EXT = 2,
        XR_HAPTIC_PARAMETRIC_STREAM_FRAME_TYPE_LAST_FRAME_EXT         = 3;

    protected EXTHapticParametric() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrHapticParametricGetPropertiesEXT ] ---

    /** {@code XrResult xrHapticParametricGetPropertiesEXT(XrSession session, XrHapticActionInfo const * hapticActionInfo, XrHapticParametricPropertiesEXT * parametricProperties)} */
    public static int nxrHapticParametricGetPropertiesEXT(XrSession session, long hapticActionInfo, long parametricProperties) {
        long __functionAddress = session.getCapabilities().xrHapticParametricGetPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
            XrHapticActionInfo.validate(hapticActionInfo);
        }
        return callPPPI(session.address(), hapticActionInfo, parametricProperties, __functionAddress);
    }

    /** {@code XrResult xrHapticParametricGetPropertiesEXT(XrSession session, XrHapticActionInfo const * hapticActionInfo, XrHapticParametricPropertiesEXT * parametricProperties)} */
    @NativeType("XrResult")
    public static int xrHapticParametricGetPropertiesEXT(XrSession session, @NativeType("XrHapticActionInfo const *") XrHapticActionInfo hapticActionInfo, @NativeType("XrHapticParametricPropertiesEXT *") XrHapticParametricPropertiesEXT parametricProperties) {
        return nxrHapticParametricGetPropertiesEXT(session, hapticActionInfo.address(), parametricProperties.address());
    }

}
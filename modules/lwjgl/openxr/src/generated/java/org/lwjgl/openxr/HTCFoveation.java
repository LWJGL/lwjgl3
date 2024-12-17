/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class HTCFoveation {

    public static final int XR_HTC_foveation_SPEC_VERSION = 1;

    public static final String XR_HTC_FOVEATION_EXTENSION_NAME = "XR_HTC_foveation";

    public static final int
        XR_TYPE_FOVEATION_APPLY_INFO_HTC        = 1000318000,
        XR_TYPE_FOVEATION_DYNAMIC_MODE_INFO_HTC = 1000318001,
        XR_TYPE_FOVEATION_CUSTOM_MODE_INFO_HTC  = 1000318002;

    public static final int
        XR_FOVEATION_MODE_DISABLE_HTC = 0,
        XR_FOVEATION_MODE_FIXED_HTC   = 1,
        XR_FOVEATION_MODE_DYNAMIC_HTC = 2,
        XR_FOVEATION_MODE_CUSTOM_HTC  = 3;

    public static final int
        XR_FOVEATION_LEVEL_NONE_HTC   = 0,
        XR_FOVEATION_LEVEL_LOW_HTC    = 1,
        XR_FOVEATION_LEVEL_MEDIUM_HTC = 2,
        XR_FOVEATION_LEVEL_HIGH_HTC   = 3;

    public static final int
        XR_FOVEATION_DYNAMIC_LEVEL_ENABLED_BIT_HTC               = 0x1,
        XR_FOVEATION_DYNAMIC_CLEAR_FOV_ENABLED_BIT_HTC           = 0x2,
        XR_FOVEATION_DYNAMIC_FOCAL_CENTER_OFFSET_ENABLED_BIT_HTC = 0x4;

    protected HTCFoveation() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrApplyFoveationHTC ] ---

    /** {@code XrResult xrApplyFoveationHTC(XrSession session, XrFoveationApplyInfoHTC const * applyInfo)} */
    public static int nxrApplyFoveationHTC(XrSession session, long applyInfo) {
        long __functionAddress = session.getCapabilities().xrApplyFoveationHTC;
        if (CHECKS) {
            check(__functionAddress);
            XrFoveationApplyInfoHTC.validate(applyInfo);
        }
        return callPPI(session.address(), applyInfo, __functionAddress);
    }

    /** {@code XrResult xrApplyFoveationHTC(XrSession session, XrFoveationApplyInfoHTC const * applyInfo)} */
    @NativeType("XrResult")
    public static int xrApplyFoveationHTC(XrSession session, @NativeType("XrFoveationApplyInfoHTC const *") XrFoveationApplyInfoHTC applyInfo) {
        return nxrApplyFoveationHTC(session, applyInfo.address());
    }

}
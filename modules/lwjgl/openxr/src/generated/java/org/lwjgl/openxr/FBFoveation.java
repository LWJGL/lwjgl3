/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class FBFoveation {

    public static final int XR_FB_foveation_SPEC_VERSION = 1;

    public static final String XR_FB_FOVEATION_EXTENSION_NAME = "XR_FB_foveation";

    public static final int XR_OBJECT_TYPE_FOVEATION_PROFILE_FB = 1000114000;

    public static final int
        XR_TYPE_FOVEATION_PROFILE_CREATE_INFO_FB   = 1000114000,
        XR_TYPE_SWAPCHAIN_CREATE_INFO_FOVEATION_FB = 1000114001,
        XR_TYPE_SWAPCHAIN_STATE_FOVEATION_FB       = 1000114002;

    public static final int
        XR_SWAPCHAIN_CREATE_FOVEATION_SCALED_BIN_BIT_FB           = 0x1,
        XR_SWAPCHAIN_CREATE_FOVEATION_FRAGMENT_DENSITY_MAP_BIT_FB = 0x2;

    protected FBFoveation() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateFoveationProfileFB ] ---

    /** {@code XrResult xrCreateFoveationProfileFB(XrSession session, XrFoveationProfileCreateInfoFB const * createInfo, XrFoveationProfileFB * profile)} */
    public static int nxrCreateFoveationProfileFB(XrSession session, long createInfo, long profile) {
        long __functionAddress = session.getCapabilities().xrCreateFoveationProfileFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, profile, __functionAddress);
    }

    /** {@code XrResult xrCreateFoveationProfileFB(XrSession session, XrFoveationProfileCreateInfoFB const * createInfo, XrFoveationProfileFB * profile)} */
    @NativeType("XrResult")
    public static int xrCreateFoveationProfileFB(XrSession session, @NativeType("XrFoveationProfileCreateInfoFB const *") XrFoveationProfileCreateInfoFB createInfo, @NativeType("XrFoveationProfileFB *") PointerBuffer profile) {
        if (CHECKS) {
            check(profile, 1);
        }
        return nxrCreateFoveationProfileFB(session, createInfo.address(), memAddress(profile));
    }

    // --- [ xrDestroyFoveationProfileFB ] ---

    /** {@code XrResult xrDestroyFoveationProfileFB(XrFoveationProfileFB profile)} */
    @NativeType("XrResult")
    public static int xrDestroyFoveationProfileFB(XrFoveationProfileFB profile) {
        long __functionAddress = profile.getCapabilities().xrDestroyFoveationProfileFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(profile.address(), __functionAddress);
    }

}
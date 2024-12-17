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

public class HTCPassthrough {

    public static final int XR_HTC_passthrough_SPEC_VERSION = 1;

    public static final String XR_HTC_PASSTHROUGH_EXTENSION_NAME = "XR_HTC_passthrough";

    public static final int XR_OBJECT_TYPE_PASSTHROUGH_HTC = 1000317000;

    public static final int
        XR_TYPE_PASSTHROUGH_CREATE_INFO_HTC         = 1000317001,
        XR_TYPE_PASSTHROUGH_COLOR_HTC               = 1000317002,
        XR_TYPE_PASSTHROUGH_MESH_TRANSFORM_INFO_HTC = 1000317003,
        XR_TYPE_COMPOSITION_LAYER_PASSTHROUGH_HTC   = 1000317004;

    public static final int
        XR_PASSTHROUGH_FORM_PLANAR_HTC    = 0,
        XR_PASSTHROUGH_FORM_PROJECTED_HTC = 1;

    protected HTCPassthrough() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreatePassthroughHTC ] ---

    /** {@code XrResult xrCreatePassthroughHTC(XrSession session, XrPassthroughCreateInfoHTC const * createInfo, XrPassthroughHTC * passthrough)} */
    public static int nxrCreatePassthroughHTC(XrSession session, long createInfo, long passthrough) {
        long __functionAddress = session.getCapabilities().xrCreatePassthroughHTC;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, passthrough, __functionAddress);
    }

    /** {@code XrResult xrCreatePassthroughHTC(XrSession session, XrPassthroughCreateInfoHTC const * createInfo, XrPassthroughHTC * passthrough)} */
    @NativeType("XrResult")
    public static int xrCreatePassthroughHTC(XrSession session, @NativeType("XrPassthroughCreateInfoHTC const *") XrPassthroughCreateInfoHTC createInfo, @NativeType("XrPassthroughHTC *") PointerBuffer passthrough) {
        if (CHECKS) {
            check(passthrough, 1);
        }
        return nxrCreatePassthroughHTC(session, createInfo.address(), memAddress(passthrough));
    }

    // --- [ xrDestroyPassthroughHTC ] ---

    /** {@code XrResult xrDestroyPassthroughHTC(XrPassthroughHTC passthrough)} */
    @NativeType("XrResult")
    public static int xrDestroyPassthroughHTC(XrPassthroughHTC passthrough) {
        long __functionAddress = passthrough.getCapabilities().xrDestroyPassthroughHTC;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(passthrough.address(), __functionAddress);
    }

}
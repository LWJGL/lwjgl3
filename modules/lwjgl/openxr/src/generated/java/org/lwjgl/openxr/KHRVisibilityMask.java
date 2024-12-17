/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRVisibilityMask {

    public static final int XR_KHR_visibility_mask_SPEC_VERSION = 2;

    public static final String XR_KHR_VISIBILITY_MASK_EXTENSION_NAME = "XR_KHR_visibility_mask";

    public static final int
        XR_TYPE_VISIBILITY_MASK_KHR                    = 1000031000,
        XR_TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR = 1000031001;

    public static final int
        XR_VISIBILITY_MASK_TYPE_HIDDEN_TRIANGLE_MESH_KHR  = 1,
        XR_VISIBILITY_MASK_TYPE_VISIBLE_TRIANGLE_MESH_KHR = 2,
        XR_VISIBILITY_MASK_TYPE_LINE_LOOP_KHR             = 3;

    protected KHRVisibilityMask() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetVisibilityMaskKHR ] ---

    /** {@code XrResult xrGetVisibilityMaskKHR(XrSession session, XrViewConfigurationType viewConfigurationType, uint32_t viewIndex, XrVisibilityMaskTypeKHR visibilityMaskType, XrVisibilityMaskKHR * visibilityMask)} */
    public static int nxrGetVisibilityMaskKHR(XrSession session, int viewConfigurationType, int viewIndex, int visibilityMaskType, long visibilityMask) {
        long __functionAddress = session.getCapabilities().xrGetVisibilityMaskKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), viewConfigurationType, viewIndex, visibilityMaskType, visibilityMask, __functionAddress);
    }

    /** {@code XrResult xrGetVisibilityMaskKHR(XrSession session, XrViewConfigurationType viewConfigurationType, uint32_t viewIndex, XrVisibilityMaskTypeKHR visibilityMaskType, XrVisibilityMaskKHR * visibilityMask)} */
    @NativeType("XrResult")
    public static int xrGetVisibilityMaskKHR(XrSession session, @NativeType("XrViewConfigurationType") int viewConfigurationType, @NativeType("uint32_t") int viewIndex, @NativeType("XrVisibilityMaskTypeKHR") int visibilityMaskType, @NativeType("XrVisibilityMaskKHR *") XrVisibilityMaskKHR visibilityMask) {
        return nxrGetVisibilityMaskKHR(session, viewConfigurationType, viewIndex, visibilityMaskType, visibilityMask.address());
    }

}
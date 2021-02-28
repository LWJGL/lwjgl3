/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** The KHR_visibility_mask extension. */
public class KHRVisibilityMask {

    /** The extension specification version. */
    public static final int XR_KHR_visibility_mask_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_KHR_VISIBILITY_MASK_EXTENSION_NAME = "XR_KHR_visibility_mask";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_VISIBILITY_MASK_KHR TYPE_VISIBILITY_MASK_KHR}</li>
     * <li>{@link #XR_TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_VISIBILITY_MASK_KHR                    = 1000031000,
        XR_TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR = 1000031001;

    /**
     * XrVisibilityMaskTypeKHR
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_VISIBILITY_MASK_TYPE_HIDDEN_TRIANGLE_MESH_KHR VISIBILITY_MASK_TYPE_HIDDEN_TRIANGLE_MESH_KHR}</li>
     * <li>{@link #XR_VISIBILITY_MASK_TYPE_VISIBLE_TRIANGLE_MESH_KHR VISIBILITY_MASK_TYPE_VISIBLE_TRIANGLE_MESH_KHR}</li>
     * <li>{@link #XR_VISIBILITY_MASK_TYPE_LINE_LOOP_KHR VISIBILITY_MASK_TYPE_LINE_LOOP_KHR}</li>
     * </ul>
     */
    public static final int
        XR_VISIBILITY_MASK_TYPE_HIDDEN_TRIANGLE_MESH_KHR  = 1,
        XR_VISIBILITY_MASK_TYPE_VISIBLE_TRIANGLE_MESH_KHR = 2,
        XR_VISIBILITY_MASK_TYPE_LINE_LOOP_KHR             = 3;

    protected KHRVisibilityMask() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrGetVisibilityMaskKHR ] ---

    public static int nxrGetVisibilityMaskKHR(XrSession session, int viewConfigurationType, int viewIndex, int visibilityMaskType, long visibilityMask) {
        long __functionAddress = session.getCapabilities().xrGetVisibilityMaskKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), viewConfigurationType, viewIndex, visibilityMaskType, visibilityMask, __functionAddress);
    }

    @NativeType("XrResult")
    public static int xrGetVisibilityMaskKHR(XrSession session, @NativeType("XrViewConfigurationType") int viewConfigurationType, @NativeType("uint32_t") int viewIndex, @NativeType("XrVisibilityMaskTypeKHR") int visibilityMaskType, @NativeType("XrVisibilityMaskKHR *") XrVisibilityMaskKHR visibilityMask) {
        return nxrGetVisibilityMaskKHR(session, viewConfigurationType, viewIndex, visibilityMaskType, visibilityMask.address());
    }

}
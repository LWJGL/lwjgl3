/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class METABoundaryVisibility {

    public static final int XR_META_boundary_visibility_SPEC_VERSION = 1;

    public static final String XR_META_BOUNDARY_VISIBILITY_EXTENSION_NAME = "XR_META_boundary_visibility";

    public static final int XR_BOUNDARY_VISIBILITY_SUPPRESSION_NOT_ALLOWED_META = 1000528000;

    public static final int
        XR_TYPE_SYSTEM_BOUNDARY_VISIBILITY_PROPERTIES_META  = 1000528000,
        XR_TYPE_EVENT_DATA_BOUNDARY_VISIBILITY_CHANGED_META = 1000528001;

    public static final int
        XR_BOUNDARY_VISIBILITY_NOT_SUPPRESSED_META = 1,
        XR_BOUNDARY_VISIBILITY_SUPPRESSED_META     = 2;

    protected METABoundaryVisibility() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrRequestBoundaryVisibilityMETA ] ---

    /** {@code XrResult xrRequestBoundaryVisibilityMETA(XrSession session, XrBoundaryVisibilityMETA boundaryVisibility)} */
    @NativeType("XrResult")
    public static int xrRequestBoundaryVisibilityMETA(XrSession session, @NativeType("XrBoundaryVisibilityMETA") int boundaryVisibility) {
        long __functionAddress = session.getCapabilities().xrRequestBoundaryVisibilityMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), boundaryVisibility, __functionAddress);
    }

}
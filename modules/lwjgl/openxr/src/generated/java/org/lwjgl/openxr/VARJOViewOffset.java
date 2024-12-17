/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class VARJOViewOffset {

    public static final int XR_VARJO_view_offset_SPEC_VERSION = 1;

    public static final String XR_VARJO_VIEW_OFFSET_EXTENSION_NAME = "XR_VARJO_view_offset";

    protected VARJOViewOffset() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSetViewOffsetVARJO ] ---

    /** {@code XrResult xrSetViewOffsetVARJO(XrSession session, float offset)} */
    @NativeType("XrResult")
    public static int xrSetViewOffsetVARJO(XrSession session, float offset) {
        long __functionAddress = session.getCapabilities().xrSetViewOffsetVARJO;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), offset, __functionAddress);
    }

}
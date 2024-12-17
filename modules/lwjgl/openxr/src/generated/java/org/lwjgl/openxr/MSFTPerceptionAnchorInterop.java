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

public class MSFTPerceptionAnchorInterop {

    public static final int XR_MSFT_perception_anchor_interop_SPEC_VERSION = 1;

    public static final String XR_MSFT_PERCEPTION_ANCHOR_INTEROP_EXTENSION_NAME = "XR_MSFT_perception_anchor_interop";

    protected MSFTPerceptionAnchorInterop() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpatialAnchorFromPerceptionAnchorMSFT ] ---

    /** {@code XrResult xrCreateSpatialAnchorFromPerceptionAnchorMSFT(XrSession session, IUnknown * perceptionAnchor, XrSpatialAnchorMSFT * anchor)} */
    public static int nxrCreateSpatialAnchorFromPerceptionAnchorMSFT(XrSession session, long perceptionAnchor, long anchor) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorFromPerceptionAnchorMSFT;
        if (CHECKS) {
            check(__functionAddress);
            check(perceptionAnchor);
        }
        return callPPPI(session.address(), perceptionAnchor, anchor, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialAnchorFromPerceptionAnchorMSFT(XrSession session, IUnknown * perceptionAnchor, XrSpatialAnchorMSFT * anchor)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorFromPerceptionAnchorMSFT(XrSession session, @NativeType("IUnknown *") long perceptionAnchor, @NativeType("XrSpatialAnchorMSFT *") PointerBuffer anchor) {
        if (CHECKS) {
            check(anchor, 1);
        }
        return nxrCreateSpatialAnchorFromPerceptionAnchorMSFT(session, perceptionAnchor, memAddress(anchor));
    }

    // --- [ xrTryGetPerceptionAnchorFromSpatialAnchorMSFT ] ---

    /** {@code XrResult xrTryGetPerceptionAnchorFromSpatialAnchorMSFT(XrSession session, XrSpatialAnchorMSFT anchor, IUnknown ** perceptionAnchor)} */
    public static int nxrTryGetPerceptionAnchorFromSpatialAnchorMSFT(XrSession session, XrSpatialAnchorMSFT anchor, long perceptionAnchor) {
        long __functionAddress = session.getCapabilities().xrTryGetPerceptionAnchorFromSpatialAnchorMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), anchor.address(), perceptionAnchor, __functionAddress);
    }

    /** {@code XrResult xrTryGetPerceptionAnchorFromSpatialAnchorMSFT(XrSession session, XrSpatialAnchorMSFT anchor, IUnknown ** perceptionAnchor)} */
    @NativeType("XrResult")
    public static int xrTryGetPerceptionAnchorFromSpatialAnchorMSFT(XrSession session, XrSpatialAnchorMSFT anchor, @NativeType("IUnknown **") PointerBuffer perceptionAnchor) {
        if (CHECKS) {
            check(perceptionAnchor, 1);
        }
        return nxrTryGetPerceptionAnchorFromSpatialAnchorMSFT(session, anchor, memAddress(perceptionAnchor));
    }

}
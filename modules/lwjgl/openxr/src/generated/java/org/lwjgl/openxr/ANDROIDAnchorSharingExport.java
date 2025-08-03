/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class ANDROIDAnchorSharingExport {

    public static final int XR_ANDROID_anchor_sharing_export_SPEC_VERSION = 1;

    public static final String XR_ANDROID_ANCHOR_SHARING_EXPORT_EXTENSION_NAME = "XR_ANDROID_anchor_sharing_export";

    public static final int
        XR_TYPE_ANCHOR_SHARING_INFO_ANDROID                     = 1000701000,
        XR_TYPE_ANCHOR_SHARING_TOKEN_ANDROID                    = 1000701001,
        XR_TYPE_SYSTEM_ANCHOR_SHARING_EXPORT_PROPERTIES_ANDROID = 1000701002;

    public static final int XR_ERROR_ANCHOR_NOT_OWNED_BY_CALLER_ANDROID = -1000701000;

    protected ANDROIDAnchorSharingExport() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrShareAnchorANDROID ] ---

    /** {@code XrResult xrShareAnchorANDROID(XrSession session, XrAnchorSharingInfoANDROID const * sharingInfo, XrAnchorSharingTokenANDROID * anchorToken)} */
    public static int nxrShareAnchorANDROID(XrSession session, long sharingInfo, long anchorToken) {
        long __functionAddress = session.getCapabilities().xrShareAnchorANDROID;
        if (CHECKS) {
            check(__functionAddress);
            XrAnchorSharingInfoANDROID.validate(sharingInfo);
        }
        return callPPPI(session.address(), sharingInfo, anchorToken, __functionAddress);
    }

    /** {@code XrResult xrShareAnchorANDROID(XrSession session, XrAnchorSharingInfoANDROID const * sharingInfo, XrAnchorSharingTokenANDROID * anchorToken)} */
    @NativeType("XrResult")
    public static int xrShareAnchorANDROID(XrSession session, @NativeType("XrAnchorSharingInfoANDROID const *") XrAnchorSharingInfoANDROID sharingInfo, @NativeType("XrAnchorSharingTokenANDROID *") XrAnchorSharingTokenANDROID anchorToken) {
        return nxrShareAnchorANDROID(session, sharingInfo.address(), anchorToken.address());
    }

    // --- [ xrUnshareAnchorANDROID ] ---

    /** {@code XrResult xrUnshareAnchorANDROID(XrSession session, XrSpace anchor)} */
    @NativeType("XrResult")
    public static int xrUnshareAnchorANDROID(XrSession session, XrSpace anchor) {
        long __functionAddress = session.getCapabilities().xrUnshareAnchorANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), anchor.address(), __functionAddress);
    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class FBSpatialEntitySharing {

    public static final int XR_FB_spatial_entity_sharing_SPEC_VERSION = 1;

    public static final String XR_FB_SPATIAL_ENTITY_SHARING_EXTENSION_NAME = "XR_FB_spatial_entity_sharing";

    public static final int
        XR_TYPE_SPACE_SHARE_INFO_FB                = 1000169001,
        XR_TYPE_EVENT_DATA_SPACE_SHARE_COMPLETE_FB = 1000169002;

    public static final int
        XR_ERROR_SPACE_MAPPING_INSUFFICIENT_FB   = -1000169000,
        XR_ERROR_SPACE_LOCALIZATION_FAILED_FB    = -1000169001,
        XR_ERROR_SPACE_NETWORK_TIMEOUT_FB        = -1000169002,
        XR_ERROR_SPACE_NETWORK_REQUEST_FAILED_FB = -1000169003,
        XR_ERROR_SPACE_CLOUD_STORAGE_DISABLED_FB = -1000169004;

    protected FBSpatialEntitySharing() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrShareSpacesFB ] ---

    /** {@code XrResult xrShareSpacesFB(XrSession session, XrSpaceShareInfoFB const * info, XrAsyncRequestIdFB * requestId)} */
    public static int nxrShareSpacesFB(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrShareSpacesFB;
        if (CHECKS) {
            check(__functionAddress);
            XrSpaceShareInfoFB.validate(info);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /** {@code XrResult xrShareSpacesFB(XrSession session, XrSpaceShareInfoFB const * info, XrAsyncRequestIdFB * requestId)} */
    @NativeType("XrResult")
    public static int xrShareSpacesFB(XrSession session, @NativeType("XrSpaceShareInfoFB const *") XrSpaceShareInfoFB info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrShareSpacesFB(session, info.address(), memAddress(requestId));
    }

}
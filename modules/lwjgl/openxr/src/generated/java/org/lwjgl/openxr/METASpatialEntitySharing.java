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

public class METASpatialEntitySharing {

    public static final int XR_META_spatial_entity_sharing_SPEC_VERSION = 1;

    public static final String XR_META_SPATIAL_ENTITY_SHARING_EXTENSION_NAME = "XR_META_spatial_entity_sharing";

    public static final int XR_MAX_SPACES_PER_SHARE_REQUEST_META = 32;

    public static final int
        XR_TYPE_SYSTEM_SPATIAL_ENTITY_SHARING_PROPERTIES_META = 1000290000,
        XR_TYPE_SHARE_SPACES_INFO_META                        = 1000290001,
        XR_TYPE_EVENT_DATA_SHARE_SPACES_COMPLETE_META         = 1000290002;

    protected METASpatialEntitySharing() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrShareSpacesMETA ] ---

    /** {@code XrResult xrShareSpacesMETA(XrSession session, XrShareSpacesInfoMETA const * info, XrAsyncRequestIdFB * requestId)} */
    public static int nxrShareSpacesMETA(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrShareSpacesMETA;
        if (CHECKS) {
            check(__functionAddress);
            XrShareSpacesInfoMETA.validate(info);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /** {@code XrResult xrShareSpacesMETA(XrSession session, XrShareSpacesInfoMETA const * info, XrAsyncRequestIdFB * requestId)} */
    @NativeType("XrResult")
    public static int xrShareSpacesMETA(XrSession session, @NativeType("XrShareSpacesInfoMETA const *") XrShareSpacesInfoMETA info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrShareSpacesMETA(session, info.address(), memAddress(requestId));
    }

}
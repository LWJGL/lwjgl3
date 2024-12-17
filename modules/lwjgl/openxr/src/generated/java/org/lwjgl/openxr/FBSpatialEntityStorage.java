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

public class FBSpatialEntityStorage {

    public static final int XR_FB_spatial_entity_storage_SPEC_VERSION = 1;

    public static final String XR_FB_SPATIAL_ENTITY_STORAGE_EXTENSION_NAME = "XR_FB_spatial_entity_storage";

    public static final int
        XR_TYPE_SPACE_SAVE_INFO_FB                 = 1000158000,
        XR_TYPE_SPACE_ERASE_INFO_FB                = 1000158001,
        XR_TYPE_EVENT_DATA_SPACE_SAVE_COMPLETE_FB  = 1000158106,
        XR_TYPE_EVENT_DATA_SPACE_ERASE_COMPLETE_FB = 1000158107;

    public static final int
        XR_SPACE_PERSISTENCE_MODE_INVALID_FB    = 0,
        XR_SPACE_PERSISTENCE_MODE_INDEFINITE_FB = 1;

    protected FBSpatialEntityStorage() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSaveSpaceFB ] ---

    /** {@code XrResult xrSaveSpaceFB(XrSession session, XrSpaceSaveInfoFB const * info, XrAsyncRequestIdFB * requestId)} */
    public static int nxrSaveSpaceFB(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrSaveSpaceFB;
        if (CHECKS) {
            check(__functionAddress);
            XrSpaceSaveInfoFB.validate(info);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /** {@code XrResult xrSaveSpaceFB(XrSession session, XrSpaceSaveInfoFB const * info, XrAsyncRequestIdFB * requestId)} */
    @NativeType("XrResult")
    public static int xrSaveSpaceFB(XrSession session, @NativeType("XrSpaceSaveInfoFB const *") XrSpaceSaveInfoFB info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrSaveSpaceFB(session, info.address(), memAddress(requestId));
    }

    // --- [ xrEraseSpaceFB ] ---

    /** {@code XrResult xrEraseSpaceFB(XrSession session, XrSpaceEraseInfoFB const * info, XrAsyncRequestIdFB * requestId)} */
    public static int nxrEraseSpaceFB(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrEraseSpaceFB;
        if (CHECKS) {
            check(__functionAddress);
            XrSpaceEraseInfoFB.validate(info);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /** {@code XrResult xrEraseSpaceFB(XrSession session, XrSpaceEraseInfoFB const * info, XrAsyncRequestIdFB * requestId)} */
    @NativeType("XrResult")
    public static int xrEraseSpaceFB(XrSession session, @NativeType("XrSpaceEraseInfoFB const *") XrSpaceEraseInfoFB info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrEraseSpaceFB(session, info.address(), memAddress(requestId));
    }

}
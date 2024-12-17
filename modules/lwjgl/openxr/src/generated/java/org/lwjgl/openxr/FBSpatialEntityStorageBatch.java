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

public class FBSpatialEntityStorageBatch {

    public static final int XR_FB_spatial_entity_storage_batch_SPEC_VERSION = 1;

    public static final String XR_FB_SPATIAL_ENTITY_STORAGE_BATCH_EXTENSION_NAME = "XR_FB_spatial_entity_storage_batch";

    public static final int
        XR_TYPE_SPACE_LIST_SAVE_INFO_FB                = 1000238000,
        XR_TYPE_EVENT_DATA_SPACE_LIST_SAVE_COMPLETE_FB = 1000238001;

    protected FBSpatialEntityStorageBatch() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSaveSpaceListFB ] ---

    /** {@code XrResult xrSaveSpaceListFB(XrSession session, XrSpaceListSaveInfoFB const * info, XrAsyncRequestIdFB * requestId)} */
    public static int nxrSaveSpaceListFB(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrSaveSpaceListFB;
        if (CHECKS) {
            check(__functionAddress);
            XrSpaceListSaveInfoFB.validate(info);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /** {@code XrResult xrSaveSpaceListFB(XrSession session, XrSpaceListSaveInfoFB const * info, XrAsyncRequestIdFB * requestId)} */
    @NativeType("XrResult")
    public static int xrSaveSpaceListFB(XrSession session, @NativeType("XrSpaceListSaveInfoFB const *") XrSpaceListSaveInfoFB info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrSaveSpaceListFB(session, info.address(), memAddress(requestId));
    }

}
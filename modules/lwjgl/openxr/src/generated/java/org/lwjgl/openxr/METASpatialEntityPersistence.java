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

public class METASpatialEntityPersistence {

    public static final int XR_META_spatial_entity_persistence_SPEC_VERSION = 1;

    public static final String XR_META_SPATIAL_ENTITY_PERSISTENCE_EXTENSION_NAME = "XR_META_spatial_entity_persistence";

    public static final int
        XR_ERROR_SPACE_INSUFFICIENT_RESOURCES_META  = -1000259000,
        XR_ERROR_SPACE_STORAGE_AT_CAPACITY_META     = -1000259001,
        XR_ERROR_SPACE_INSUFFICIENT_VIEW_META       = -1000259002,
        XR_ERROR_SPACE_PERMISSION_INSUFFICIENT_META = -1000259003,
        XR_ERROR_SPACE_RATE_LIMITED_META            = -1000259004,
        XR_ERROR_SPACE_TOO_DARK_META                = -1000259005,
        XR_ERROR_SPACE_TOO_BRIGHT_META              = -1000259006;

    public static final int
        XR_TYPE_SYSTEM_SPACE_PERSISTENCE_PROPERTIES_META = 1000259000,
        XR_TYPE_SPACES_SAVE_INFO_META                    = 1000259001,
        XR_TYPE_EVENT_DATA_SPACES_SAVE_RESULT_META       = 1000259002,
        XR_TYPE_SPACES_ERASE_INFO_META                   = 1000259003,
        XR_TYPE_EVENT_DATA_SPACES_ERASE_RESULT_META      = 1000259004;

    protected METASpatialEntityPersistence() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSaveSpacesMETA ] ---

    /** {@code XrResult xrSaveSpacesMETA(XrSession session, XrSpacesSaveInfoMETA const * info, XrAsyncRequestIdFB * requestId)} */
    public static int nxrSaveSpacesMETA(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrSaveSpacesMETA;
        if (CHECKS) {
            check(__functionAddress);
            XrSpacesSaveInfoMETA.validate(info);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /** {@code XrResult xrSaveSpacesMETA(XrSession session, XrSpacesSaveInfoMETA const * info, XrAsyncRequestIdFB * requestId)} */
    @NativeType("XrResult")
    public static int xrSaveSpacesMETA(XrSession session, @NativeType("XrSpacesSaveInfoMETA const *") XrSpacesSaveInfoMETA info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrSaveSpacesMETA(session, info.address(), memAddress(requestId));
    }

    // --- [ xrEraseSpacesMETA ] ---

    /** {@code XrResult xrEraseSpacesMETA(XrSession session, XrSpacesEraseInfoMETA const * info, XrAsyncRequestIdFB * requestId)} */
    public static int nxrEraseSpacesMETA(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrEraseSpacesMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /** {@code XrResult xrEraseSpacesMETA(XrSession session, XrSpacesEraseInfoMETA const * info, XrAsyncRequestIdFB * requestId)} */
    @NativeType("XrResult")
    public static int xrEraseSpacesMETA(XrSession session, @NativeType("XrSpacesEraseInfoMETA const *") XrSpacesEraseInfoMETA info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrEraseSpacesMETA(session, info.address(), memAddress(requestId));
    }

}
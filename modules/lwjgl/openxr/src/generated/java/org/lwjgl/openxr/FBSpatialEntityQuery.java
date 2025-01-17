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

public class FBSpatialEntityQuery {

    public static final int XR_FB_spatial_entity_query_SPEC_VERSION = 1;

    public static final String XR_FB_SPATIAL_ENTITY_QUERY_EXTENSION_NAME = "XR_FB_spatial_entity_query";

    public static final int
        XR_TYPE_SPACE_QUERY_INFO_FB                         = 1000156001,
        XR_TYPE_SPACE_QUERY_RESULTS_FB                      = 1000156002,
        XR_TYPE_SPACE_STORAGE_LOCATION_FILTER_INFO_FB       = 1000156003,
        XR_TYPE_SPACE_COMPONENT_FILTER_INFO_FB              = 1000156052,
        XR_TYPE_SPACE_UUID_FILTER_INFO_FB                   = 1000156054,
        XR_TYPE_EVENT_DATA_SPACE_QUERY_RESULTS_AVAILABLE_FB = 1000156103,
        XR_TYPE_EVENT_DATA_SPACE_QUERY_COMPLETE_FB          = 1000156104;

    public static final int XR_SPACE_QUERY_ACTION_LOAD_FB = 0;

    public static final int
        XR_SPACE_STORAGE_LOCATION_INVALID_FB = 0,
        XR_SPACE_STORAGE_LOCATION_LOCAL_FB   = 1,
        XR_SPACE_STORAGE_LOCATION_CLOUD_FB   = 2;

    protected FBSpatialEntityQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrQuerySpacesFB ] ---

    /** {@code XrResult xrQuerySpacesFB(XrSession session, XrSpaceQueryInfoBaseHeaderFB const * info, XrAsyncRequestIdFB * requestId)} */
    public static int nxrQuerySpacesFB(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrQuerySpacesFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /** {@code XrResult xrQuerySpacesFB(XrSession session, XrSpaceQueryInfoBaseHeaderFB const * info, XrAsyncRequestIdFB * requestId)} */
    @NativeType("XrResult")
    public static int xrQuerySpacesFB(XrSession session, @NativeType("XrSpaceQueryInfoBaseHeaderFB const *") XrSpaceQueryInfoBaseHeaderFB info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrQuerySpacesFB(session, info.address(), memAddress(requestId));
    }

    // --- [ xrRetrieveSpaceQueryResultsFB ] ---

    /** {@code XrResult xrRetrieveSpaceQueryResultsFB(XrSession session, XrAsyncRequestIdFB requestId, XrSpaceQueryResultsFB * results)} */
    public static int nxrRetrieveSpaceQueryResultsFB(XrSession session, long requestId, long results) {
        long __functionAddress = session.getCapabilities().xrRetrieveSpaceQueryResultsFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), requestId, results, __functionAddress);
    }

    /** {@code XrResult xrRetrieveSpaceQueryResultsFB(XrSession session, XrAsyncRequestIdFB requestId, XrSpaceQueryResultsFB * results)} */
    @NativeType("XrResult")
    public static int xrRetrieveSpaceQueryResultsFB(XrSession session, @NativeType("XrAsyncRequestIdFB") long requestId, @NativeType("XrSpaceQueryResultsFB *") XrSpaceQueryResultsFB results) {
        return nxrRetrieveSpaceQueryResultsFB(session, requestId, results.address());
    }

}
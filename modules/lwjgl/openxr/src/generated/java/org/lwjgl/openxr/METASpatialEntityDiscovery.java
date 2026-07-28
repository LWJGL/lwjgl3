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

public class METASpatialEntityDiscovery {

    public static final int XR_META_spatial_entity_discovery_SPEC_VERSION = 1;

    public static final String XR_META_SPATIAL_ENTITY_DISCOVERY_EXTENSION_NAME = "XR_META_spatial_entity_discovery";

    public static final int
        XR_TYPE_SYSTEM_SPACE_DISCOVERY_PROPERTIES_META            = 1000247000,
        XR_TYPE_SPACE_DISCOVERY_INFO_META                         = 1000247001,
        XR_TYPE_SPACE_FILTER_UUID_META                            = 1000247003,
        XR_TYPE_SPACE_FILTER_COMPONENT_META                       = 1000247004,
        XR_TYPE_SPACE_DISCOVERY_RESULT_META                       = 1000247005,
        XR_TYPE_SPACE_DISCOVERY_RESULTS_META                      = 1000247006,
        XR_TYPE_EVENT_DATA_SPACE_DISCOVERY_RESULTS_AVAILABLE_META = 1000247007,
        XR_TYPE_EVENT_DATA_SPACE_DISCOVERY_COMPLETE_META          = 1000247008;

    protected METASpatialEntityDiscovery() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrDiscoverSpacesMETA ] ---

    /** {@code XrResult xrDiscoverSpacesMETA(XrSession session, XrSpaceDiscoveryInfoMETA const * info, XrAsyncRequestIdFB * requestId)} */
    public static int nxrDiscoverSpacesMETA(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrDiscoverSpacesMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /** {@code XrResult xrDiscoverSpacesMETA(XrSession session, XrSpaceDiscoveryInfoMETA const * info, XrAsyncRequestIdFB * requestId)} */
    @NativeType("XrResult")
    public static int xrDiscoverSpacesMETA(XrSession session, @NativeType("XrSpaceDiscoveryInfoMETA const *") XrSpaceDiscoveryInfoMETA info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrDiscoverSpacesMETA(session, info.address(), memAddress(requestId));
    }

    // --- [ xrRetrieveSpaceDiscoveryResultsMETA ] ---

    /** {@code XrResult xrRetrieveSpaceDiscoveryResultsMETA(XrSession session, XrAsyncRequestIdFB requestId, XrSpaceDiscoveryResultsMETA * results)} */
    public static int nxrRetrieveSpaceDiscoveryResultsMETA(XrSession session, long requestId, long results) {
        long __functionAddress = session.getCapabilities().xrRetrieveSpaceDiscoveryResultsMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), requestId, results, __functionAddress);
    }

    /** {@code XrResult xrRetrieveSpaceDiscoveryResultsMETA(XrSession session, XrAsyncRequestIdFB requestId, XrSpaceDiscoveryResultsMETA * results)} */
    @NativeType("XrResult")
    public static int xrRetrieveSpaceDiscoveryResultsMETA(XrSession session, @NativeType("XrAsyncRequestIdFB") long requestId, @NativeType("XrSpaceDiscoveryResultsMETA *") XrSpaceDiscoveryResultsMETA results) {
        return nxrRetrieveSpaceDiscoveryResultsMETA(session, requestId, results.address());
    }

}
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

public class METAColocationDiscovery {

    public static final int XR_META_colocation_discovery_SPEC_VERSION = 1;

    public static final String XR_META_COLOCATION_DISCOVERY_EXTENSION_NAME = "XR_META_colocation_discovery";

    public static final int XR_MAX_COLOCATION_DISCOVERY_BUFFER_SIZE_META = 1024;

    public static final int
        XR_COLOCATION_DISCOVERY_ALREADY_ADVERTISING_META       = 1000571003,
        XR_COLOCATION_DISCOVERY_ALREADY_DISCOVERING_META       = 1000571004,
        XR_ERROR_COLOCATION_DISCOVERY_NETWORK_FAILED_META      = -1000571001,
        XR_ERROR_COLOCATION_DISCOVERY_NO_DISCOVERY_METHOD_META = -1000571002;

    public static final int
        XR_TYPE_COLOCATION_DISCOVERY_START_INFO_META                    = 1000571010,
        XR_TYPE_COLOCATION_DISCOVERY_STOP_INFO_META                     = 1000571011,
        XR_TYPE_COLOCATION_ADVERTISEMENT_START_INFO_META                = 1000571012,
        XR_TYPE_COLOCATION_ADVERTISEMENT_STOP_INFO_META                 = 1000571013,
        XR_TYPE_EVENT_DATA_START_COLOCATION_ADVERTISEMENT_COMPLETE_META = 1000571020,
        XR_TYPE_EVENT_DATA_STOP_COLOCATION_ADVERTISEMENT_COMPLETE_META  = 1000571021,
        XR_TYPE_EVENT_DATA_COLOCATION_ADVERTISEMENT_COMPLETE_META       = 1000571022,
        XR_TYPE_EVENT_DATA_START_COLOCATION_DISCOVERY_COMPLETE_META     = 1000571023,
        XR_TYPE_EVENT_DATA_COLOCATION_DISCOVERY_RESULT_META             = 1000571024,
        XR_TYPE_EVENT_DATA_COLOCATION_DISCOVERY_COMPLETE_META           = 1000571025,
        XR_TYPE_EVENT_DATA_STOP_COLOCATION_DISCOVERY_COMPLETE_META      = 1000571026,
        XR_TYPE_SYSTEM_COLOCATION_DISCOVERY_PROPERTIES_META             = 1000571030;

    protected METAColocationDiscovery() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrStartColocationDiscoveryMETA ] ---

    /** {@code XrResult xrStartColocationDiscoveryMETA(XrSession session, XrColocationDiscoveryStartInfoMETA const * info, XrAsyncRequestIdFB * discoveryRequestId)} */
    public static int nxrStartColocationDiscoveryMETA(XrSession session, long info, long discoveryRequestId) {
        long __functionAddress = session.getCapabilities().xrStartColocationDiscoveryMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), info, discoveryRequestId, __functionAddress);
    }

    /** {@code XrResult xrStartColocationDiscoveryMETA(XrSession session, XrColocationDiscoveryStartInfoMETA const * info, XrAsyncRequestIdFB * discoveryRequestId)} */
    @NativeType("XrResult")
    public static int xrStartColocationDiscoveryMETA(XrSession session, @NativeType("XrColocationDiscoveryStartInfoMETA const *") XrColocationDiscoveryStartInfoMETA info, @NativeType("XrAsyncRequestIdFB *") LongBuffer discoveryRequestId) {
        if (CHECKS) {
            check(discoveryRequestId, 1);
        }
        return nxrStartColocationDiscoveryMETA(session, info.address(), memAddress(discoveryRequestId));
    }

    // --- [ xrStopColocationDiscoveryMETA ] ---

    /** {@code XrResult xrStopColocationDiscoveryMETA(XrSession session, XrColocationDiscoveryStopInfoMETA const * info, XrAsyncRequestIdFB * requestId)} */
    public static int nxrStopColocationDiscoveryMETA(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrStopColocationDiscoveryMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /** {@code XrResult xrStopColocationDiscoveryMETA(XrSession session, XrColocationDiscoveryStopInfoMETA const * info, XrAsyncRequestIdFB * requestId)} */
    @NativeType("XrResult")
    public static int xrStopColocationDiscoveryMETA(XrSession session, @NativeType("XrColocationDiscoveryStopInfoMETA const *") XrColocationDiscoveryStopInfoMETA info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrStopColocationDiscoveryMETA(session, info.address(), memAddress(requestId));
    }

    // --- [ xrStartColocationAdvertisementMETA ] ---

    /** {@code XrResult xrStartColocationAdvertisementMETA(XrSession session, XrColocationAdvertisementStartInfoMETA const * info, XrAsyncRequestIdFB * advertisementRequestId)} */
    public static int nxrStartColocationAdvertisementMETA(XrSession session, long info, long advertisementRequestId) {
        long __functionAddress = session.getCapabilities().xrStartColocationAdvertisementMETA;
        if (CHECKS) {
            check(__functionAddress);
            XrColocationAdvertisementStartInfoMETA.validate(info);
        }
        return callPPPI(session.address(), info, advertisementRequestId, __functionAddress);
    }

    /** {@code XrResult xrStartColocationAdvertisementMETA(XrSession session, XrColocationAdvertisementStartInfoMETA const * info, XrAsyncRequestIdFB * advertisementRequestId)} */
    @NativeType("XrResult")
    public static int xrStartColocationAdvertisementMETA(XrSession session, @NativeType("XrColocationAdvertisementStartInfoMETA const *") XrColocationAdvertisementStartInfoMETA info, @NativeType("XrAsyncRequestIdFB *") LongBuffer advertisementRequestId) {
        if (CHECKS) {
            check(advertisementRequestId, 1);
        }
        return nxrStartColocationAdvertisementMETA(session, info.address(), memAddress(advertisementRequestId));
    }

    // --- [ xrStopColocationAdvertisementMETA ] ---

    /** {@code XrResult xrStopColocationAdvertisementMETA(XrSession session, XrColocationAdvertisementStopInfoMETA const * info, XrAsyncRequestIdFB * requestId)} */
    public static int nxrStopColocationAdvertisementMETA(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrStopColocationAdvertisementMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /** {@code XrResult xrStopColocationAdvertisementMETA(XrSession session, XrColocationAdvertisementStopInfoMETA const * info, XrAsyncRequestIdFB * requestId)} */
    @NativeType("XrResult")
    public static int xrStopColocationAdvertisementMETA(XrSession session, @NativeType("XrColocationAdvertisementStopInfoMETA const *") XrColocationAdvertisementStopInfoMETA info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrStopColocationAdvertisementMETA(session, info.address(), memAddress(requestId));
    }

}
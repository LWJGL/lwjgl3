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

public class BDSpatialAnchorSharing {

    public static final int XR_BD_spatial_anchor_sharing_SPEC_VERSION = 1;

    public static final String XR_BD_SPATIAL_ANCHOR_SHARING_EXTENSION_NAME = "XR_BD_spatial_anchor_sharing";

    public static final int
        XR_ERROR_SPATIAL_ANCHOR_SHARING_NETWORK_TIMEOUT_BD        = -1000391000,
        XR_ERROR_SPATIAL_ANCHOR_SHARING_AUTHENTICATION_FAILURE_BD = -1000391001,
        XR_ERROR_SPATIAL_ANCHOR_SHARING_NETWORK_FAILURE_BD        = -1000391002,
        XR_ERROR_SPATIAL_ANCHOR_SHARING_LOCALIZATION_FAIL_BD      = -1000391003,
        XR_ERROR_SPATIAL_ANCHOR_SHARING_MAP_INSUFFICIENT_BD       = -1000391004;

    public static final int
        XR_TYPE_SYSTEM_SPATIAL_ANCHOR_SHARING_PROPERTIES_BD = 1000391000,
        XR_TYPE_SPATIAL_ANCHOR_SHARE_INFO_BD                = 1000391001,
        XR_TYPE_SHARED_SPATIAL_ANCHOR_DOWNLOAD_INFO_BD      = 1000391002;

    protected BDSpatialAnchorSharing() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrShareSpatialAnchorAsyncBD ] ---

    /** {@code XrResult xrShareSpatialAnchorAsyncBD(XrSenseDataProviderBD provider, XrSpatialAnchorShareInfoBD const * info, XrFutureEXT * future)} */
    public static int nxrShareSpatialAnchorAsyncBD(XrSenseDataProviderBD provider, long info, long future) {
        long __functionAddress = provider.getCapabilities().xrShareSpatialAnchorAsyncBD;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorShareInfoBD.validate(info);
        }
        return callPPPI(provider.address(), info, future, __functionAddress);
    }

    /** {@code XrResult xrShareSpatialAnchorAsyncBD(XrSenseDataProviderBD provider, XrSpatialAnchorShareInfoBD const * info, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrShareSpatialAnchorAsyncBD(XrSenseDataProviderBD provider, @NativeType("XrSpatialAnchorShareInfoBD const *") XrSpatialAnchorShareInfoBD info, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrShareSpatialAnchorAsyncBD(provider, info.address(), memAddress(future));
    }

    // --- [ xrShareSpatialAnchorCompleteBD ] ---

    /** {@code XrResult xrShareSpatialAnchorCompleteBD(XrSenseDataProviderBD provider, XrFutureEXT future, XrFutureCompletionEXT * completion)} */
    public static int nxrShareSpatialAnchorCompleteBD(XrSenseDataProviderBD provider, long future, long completion) {
        long __functionAddress = provider.getCapabilities().xrShareSpatialAnchorCompleteBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(provider.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrShareSpatialAnchorCompleteBD(XrSenseDataProviderBD provider, XrFutureEXT future, XrFutureCompletionEXT * completion)} */
    @NativeType("XrResult")
    public static int xrShareSpatialAnchorCompleteBD(XrSenseDataProviderBD provider, @NativeType("XrFutureEXT") long future, @NativeType("XrFutureCompletionEXT *") XrFutureCompletionEXT completion) {
        return nxrShareSpatialAnchorCompleteBD(provider, future, completion.address());
    }

    // --- [ xrDownloadSharedSpatialAnchorAsyncBD ] ---

    /** {@code XrResult xrDownloadSharedSpatialAnchorAsyncBD(XrSenseDataProviderBD provider, XrSharedSpatialAnchorDownloadInfoBD const * info, XrFutureEXT * future)} */
    public static int nxrDownloadSharedSpatialAnchorAsyncBD(XrSenseDataProviderBD provider, long info, long future) {
        long __functionAddress = provider.getCapabilities().xrDownloadSharedSpatialAnchorAsyncBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(provider.address(), info, future, __functionAddress);
    }

    /** {@code XrResult xrDownloadSharedSpatialAnchorAsyncBD(XrSenseDataProviderBD provider, XrSharedSpatialAnchorDownloadInfoBD const * info, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrDownloadSharedSpatialAnchorAsyncBD(XrSenseDataProviderBD provider, @NativeType("XrSharedSpatialAnchorDownloadInfoBD const *") XrSharedSpatialAnchorDownloadInfoBD info, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrDownloadSharedSpatialAnchorAsyncBD(provider, info.address(), memAddress(future));
    }

    // --- [ xrDownloadSharedSpatialAnchorCompleteBD ] ---

    /** {@code XrResult xrDownloadSharedSpatialAnchorCompleteBD(XrSenseDataProviderBD provider, XrFutureEXT future, XrFutureCompletionEXT * completion)} */
    public static int nxrDownloadSharedSpatialAnchorCompleteBD(XrSenseDataProviderBD provider, long future, long completion) {
        long __functionAddress = provider.getCapabilities().xrDownloadSharedSpatialAnchorCompleteBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(provider.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrDownloadSharedSpatialAnchorCompleteBD(XrSenseDataProviderBD provider, XrFutureEXT future, XrFutureCompletionEXT * completion)} */
    @NativeType("XrResult")
    public static int xrDownloadSharedSpatialAnchorCompleteBD(XrSenseDataProviderBD provider, @NativeType("XrFutureEXT") long future, @NativeType("XrFutureCompletionEXT *") XrFutureCompletionEXT completion) {
        return nxrDownloadSharedSpatialAnchorCompleteBD(provider, future, completion.address());
    }

}
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

public class BDSpatialAnchor {

    public static final int XR_BD_spatial_anchor_SPEC_VERSION = 2;

    public static final String XR_BD_SPATIAL_ANCHOR_EXTENSION_NAME = "XR_BD_spatial_anchor";

    public static final int XR_ERROR_SPATIAL_ANCHOR_NOT_FOUND_BD = -1000390000;

    public static final int
        XR_TYPE_SYSTEM_SPATIAL_ANCHOR_PROPERTIES_BD = 1000390000,
        XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_BD       = 1000390001,
        XR_TYPE_SPATIAL_ANCHOR_CREATE_COMPLETION_BD = 1000390002,
        XR_TYPE_SPATIAL_ANCHOR_PERSIST_INFO_BD      = 1000390003,
        XR_TYPE_SPATIAL_ANCHOR_UNPERSIST_INFO_BD    = 1000390004;

    public static final int XR_SENSE_DATA_PROVIDER_TYPE_ANCHOR_BD = 1000390000;

    public static final int XR_PERSISTENCE_LOCATION_LOCAL_BD = 0;

    protected BDSpatialAnchor() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpatialAnchorAsyncBD ] ---

    /** {@code XrResult xrCreateSpatialAnchorAsyncBD(XrSenseDataProviderBD provider, XrSpatialAnchorCreateInfoBD const * info, XrFutureEXT * future)} */
    public static int nxrCreateSpatialAnchorAsyncBD(XrSenseDataProviderBD provider, long info, long future) {
        long __functionAddress = provider.getCapabilities().xrCreateSpatialAnchorAsyncBD;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorCreateInfoBD.validate(info);
        }
        return callPPPI(provider.address(), info, future, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialAnchorAsyncBD(XrSenseDataProviderBD provider, XrSpatialAnchorCreateInfoBD const * info, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorAsyncBD(XrSenseDataProviderBD provider, @NativeType("XrSpatialAnchorCreateInfoBD const *") XrSpatialAnchorCreateInfoBD info, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrCreateSpatialAnchorAsyncBD(provider, info.address(), memAddress(future));
    }

    // --- [ xrCreateSpatialAnchorCompleteBD ] ---

    /** {@code XrResult xrCreateSpatialAnchorCompleteBD(XrSenseDataProviderBD provider, XrFutureEXT future, XrSpatialAnchorCreateCompletionBD * completion)} */
    public static int nxrCreateSpatialAnchorCompleteBD(XrSenseDataProviderBD provider, long future, long completion) {
        long __functionAddress = provider.getCapabilities().xrCreateSpatialAnchorCompleteBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(provider.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialAnchorCompleteBD(XrSenseDataProviderBD provider, XrFutureEXT future, XrSpatialAnchorCreateCompletionBD * completion)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorCompleteBD(XrSenseDataProviderBD provider, @NativeType("XrFutureEXT") long future, @NativeType("XrSpatialAnchorCreateCompletionBD *") XrSpatialAnchorCreateCompletionBD completion) {
        return nxrCreateSpatialAnchorCompleteBD(provider, future, completion.address());
    }

    // --- [ xrPersistSpatialAnchorAsyncBD ] ---

    /** {@code XrResult xrPersistSpatialAnchorAsyncBD(XrSenseDataProviderBD provider, XrSpatialAnchorPersistInfoBD const * info, XrFutureEXT * future)} */
    public static int nxrPersistSpatialAnchorAsyncBD(XrSenseDataProviderBD provider, long info, long future) {
        long __functionAddress = provider.getCapabilities().xrPersistSpatialAnchorAsyncBD;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorPersistInfoBD.validate(info);
        }
        return callPPPI(provider.address(), info, future, __functionAddress);
    }

    /** {@code XrResult xrPersistSpatialAnchorAsyncBD(XrSenseDataProviderBD provider, XrSpatialAnchorPersistInfoBD const * info, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrPersistSpatialAnchorAsyncBD(XrSenseDataProviderBD provider, @NativeType("XrSpatialAnchorPersistInfoBD const *") XrSpatialAnchorPersistInfoBD info, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrPersistSpatialAnchorAsyncBD(provider, info.address(), memAddress(future));
    }

    // --- [ xrPersistSpatialAnchorCompleteBD ] ---

    /** {@code XrResult xrPersistSpatialAnchorCompleteBD(XrSenseDataProviderBD provider, XrFutureEXT future, XrFutureCompletionEXT * completion)} */
    public static int nxrPersistSpatialAnchorCompleteBD(XrSenseDataProviderBD provider, long future, long completion) {
        long __functionAddress = provider.getCapabilities().xrPersistSpatialAnchorCompleteBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(provider.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrPersistSpatialAnchorCompleteBD(XrSenseDataProviderBD provider, XrFutureEXT future, XrFutureCompletionEXT * completion)} */
    @NativeType("XrResult")
    public static int xrPersistSpatialAnchorCompleteBD(XrSenseDataProviderBD provider, @NativeType("XrFutureEXT") long future, @NativeType("XrFutureCompletionEXT *") XrFutureCompletionEXT completion) {
        return nxrPersistSpatialAnchorCompleteBD(provider, future, completion.address());
    }

    // --- [ xrUnpersistSpatialAnchorAsyncBD ] ---

    /** {@code XrResult xrUnpersistSpatialAnchorAsyncBD(XrSenseDataProviderBD provider, XrSpatialAnchorUnpersistInfoBD const * info, XrFutureEXT * future)} */
    public static int nxrUnpersistSpatialAnchorAsyncBD(XrSenseDataProviderBD provider, long info, long future) {
        long __functionAddress = provider.getCapabilities().xrUnpersistSpatialAnchorAsyncBD;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorUnpersistInfoBD.validate(info);
        }
        return callPPPI(provider.address(), info, future, __functionAddress);
    }

    /** {@code XrResult xrUnpersistSpatialAnchorAsyncBD(XrSenseDataProviderBD provider, XrSpatialAnchorUnpersistInfoBD const * info, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrUnpersistSpatialAnchorAsyncBD(XrSenseDataProviderBD provider, @NativeType("XrSpatialAnchorUnpersistInfoBD const *") XrSpatialAnchorUnpersistInfoBD info, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrUnpersistSpatialAnchorAsyncBD(provider, info.address(), memAddress(future));
    }

    // --- [ xrUnpersistSpatialAnchorCompleteBD ] ---

    /** {@code XrResult xrUnpersistSpatialAnchorCompleteBD(XrSenseDataProviderBD provider, XrFutureEXT future, XrFutureCompletionEXT * completion)} */
    public static int nxrUnpersistSpatialAnchorCompleteBD(XrSenseDataProviderBD provider, long future, long completion) {
        long __functionAddress = provider.getCapabilities().xrUnpersistSpatialAnchorCompleteBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(provider.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrUnpersistSpatialAnchorCompleteBD(XrSenseDataProviderBD provider, XrFutureEXT future, XrFutureCompletionEXT * completion)} */
    @NativeType("XrResult")
    public static int xrUnpersistSpatialAnchorCompleteBD(XrSenseDataProviderBD provider, @NativeType("XrFutureEXT") long future, @NativeType("XrFutureCompletionEXT *") XrFutureCompletionEXT completion) {
        return nxrUnpersistSpatialAnchorCompleteBD(provider, future, completion.address());
    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class MLSpatialAnchorsStorage {

    public static final int XR_ML_spatial_anchors_storage_SPEC_VERSION = 1;

    public static final String XR_ML_SPATIAL_ANCHORS_STORAGE_EXTENSION_NAME = "XR_ML_spatial_anchors_storage";

    public static final int XR_OBJECT_TYPE_SPATIAL_ANCHORS_STORAGE_ML = 1000141000;

    public static final int XR_ERROR_SPATIAL_ANCHORS_ANCHOR_NOT_FOUND_ML = -1000141000;

    public static final int
        XR_TYPE_SPATIAL_ANCHORS_CREATE_STORAGE_INFO_ML                  = 1000141000,
        XR_TYPE_SPATIAL_ANCHORS_QUERY_INFO_RADIUS_ML                    = 1000141001,
        XR_TYPE_SPATIAL_ANCHORS_QUERY_COMPLETION_ML                     = 1000141002,
        XR_TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_UUIDS_ML               = 1000141003,
        XR_TYPE_SPATIAL_ANCHORS_PUBLISH_INFO_ML                         = 1000141004,
        XR_TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_ML                   = 1000141005,
        XR_TYPE_SPATIAL_ANCHORS_DELETE_INFO_ML                          = 1000141006,
        XR_TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_ML                    = 1000141007,
        XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_INFO_ML               = 1000141008,
        XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_ML         = 1000141009,
        XR_TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_DETAILS_ML           = 1000141010,
        XR_TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_DETAILS_ML            = 1000141011,
        XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_DETAILS_ML = 1000141012;

    protected MLSpatialAnchorsStorage() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpatialAnchorsStorageML ] ---

    /** {@code XrResult xrCreateSpatialAnchorsStorageML(XrSession session, XrSpatialAnchorsCreateStorageInfoML const * createInfo, XrSpatialAnchorsStorageML * storage)} */
    public static int nxrCreateSpatialAnchorsStorageML(XrSession session, long createInfo, long storage) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorsStorageML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, storage, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialAnchorsStorageML(XrSession session, XrSpatialAnchorsCreateStorageInfoML const * createInfo, XrSpatialAnchorsStorageML * storage)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorsStorageML(XrSession session, @NativeType("XrSpatialAnchorsCreateStorageInfoML const *") XrSpatialAnchorsCreateStorageInfoML createInfo, @NativeType("XrSpatialAnchorsStorageML *") PointerBuffer storage) {
        if (CHECKS) {
            check(storage, 1);
        }
        return nxrCreateSpatialAnchorsStorageML(session, createInfo.address(), memAddress(storage));
    }

    // --- [ xrDestroySpatialAnchorsStorageML ] ---

    /** {@code XrResult xrDestroySpatialAnchorsStorageML(XrSpatialAnchorsStorageML storage)} */
    @NativeType("XrResult")
    public static int xrDestroySpatialAnchorsStorageML(XrSpatialAnchorsStorageML storage) {
        long __functionAddress = storage.getCapabilities().xrDestroySpatialAnchorsStorageML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(storage.address(), __functionAddress);
    }

    // --- [ xrQuerySpatialAnchorsAsyncML ] ---

    /** {@code XrResult xrQuerySpatialAnchorsAsyncML(XrSpatialAnchorsStorageML storage, XrSpatialAnchorsQueryInfoBaseHeaderML const * queryInfo, XrFutureEXT * future)} */
    public static int nxrQuerySpatialAnchorsAsyncML(XrSpatialAnchorsStorageML storage, long queryInfo, long future) {
        long __functionAddress = storage.getCapabilities().xrQuerySpatialAnchorsAsyncML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(storage.address(), queryInfo, future, __functionAddress);
    }

    /** {@code XrResult xrQuerySpatialAnchorsAsyncML(XrSpatialAnchorsStorageML storage, XrSpatialAnchorsQueryInfoBaseHeaderML const * queryInfo, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrQuerySpatialAnchorsAsyncML(XrSpatialAnchorsStorageML storage, @NativeType("XrSpatialAnchorsQueryInfoBaseHeaderML const *") XrSpatialAnchorsQueryInfoBaseHeaderML queryInfo, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrQuerySpatialAnchorsAsyncML(storage, queryInfo.address(), memAddress(future));
    }

    // --- [ xrQuerySpatialAnchorsCompleteML ] ---

    /** {@code XrResult xrQuerySpatialAnchorsCompleteML(XrSpatialAnchorsStorageML storage, XrFutureEXT future, XrSpatialAnchorsQueryCompletionML * completion)} */
    public static int nxrQuerySpatialAnchorsCompleteML(XrSpatialAnchorsStorageML storage, long future, long completion) {
        long __functionAddress = storage.getCapabilities().xrQuerySpatialAnchorsCompleteML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(storage.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrQuerySpatialAnchorsCompleteML(XrSpatialAnchorsStorageML storage, XrFutureEXT future, XrSpatialAnchorsQueryCompletionML * completion)} */
    @NativeType("XrResult")
    public static int xrQuerySpatialAnchorsCompleteML(XrSpatialAnchorsStorageML storage, @NativeType("XrFutureEXT") long future, @NativeType("XrSpatialAnchorsQueryCompletionML *") XrSpatialAnchorsQueryCompletionML completion) {
        return nxrQuerySpatialAnchorsCompleteML(storage, future, completion.address());
    }

    // --- [ xrPublishSpatialAnchorsAsyncML ] ---

    /** {@code XrResult xrPublishSpatialAnchorsAsyncML(XrSpatialAnchorsStorageML storage, XrSpatialAnchorsPublishInfoML const * publishInfo, XrFutureEXT * future)} */
    public static int nxrPublishSpatialAnchorsAsyncML(XrSpatialAnchorsStorageML storage, long publishInfo, long future) {
        long __functionAddress = storage.getCapabilities().xrPublishSpatialAnchorsAsyncML;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorsPublishInfoML.validate(publishInfo);
        }
        return callPPPI(storage.address(), publishInfo, future, __functionAddress);
    }

    /** {@code XrResult xrPublishSpatialAnchorsAsyncML(XrSpatialAnchorsStorageML storage, XrSpatialAnchorsPublishInfoML const * publishInfo, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrPublishSpatialAnchorsAsyncML(XrSpatialAnchorsStorageML storage, @NativeType("XrSpatialAnchorsPublishInfoML const *") XrSpatialAnchorsPublishInfoML publishInfo, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrPublishSpatialAnchorsAsyncML(storage, publishInfo.address(), memAddress(future));
    }

    // --- [ xrPublishSpatialAnchorsCompleteML ] ---

    /** {@code XrResult xrPublishSpatialAnchorsCompleteML(XrSpatialAnchorsStorageML storage, XrFutureEXT future, XrSpatialAnchorsPublishCompletionML * completion)} */
    public static int nxrPublishSpatialAnchorsCompleteML(XrSpatialAnchorsStorageML storage, long future, long completion) {
        long __functionAddress = storage.getCapabilities().xrPublishSpatialAnchorsCompleteML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(storage.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrPublishSpatialAnchorsCompleteML(XrSpatialAnchorsStorageML storage, XrFutureEXT future, XrSpatialAnchorsPublishCompletionML * completion)} */
    @NativeType("XrResult")
    public static int xrPublishSpatialAnchorsCompleteML(XrSpatialAnchorsStorageML storage, @NativeType("XrFutureEXT") long future, @NativeType("XrSpatialAnchorsPublishCompletionML *") XrSpatialAnchorsPublishCompletionML completion) {
        return nxrPublishSpatialAnchorsCompleteML(storage, future, completion.address());
    }

    // --- [ xrDeleteSpatialAnchorsAsyncML ] ---

    /** {@code XrResult xrDeleteSpatialAnchorsAsyncML(XrSpatialAnchorsStorageML storage, XrSpatialAnchorsDeleteInfoML const * deleteInfo, XrFutureEXT * future)} */
    public static int nxrDeleteSpatialAnchorsAsyncML(XrSpatialAnchorsStorageML storage, long deleteInfo, long future) {
        long __functionAddress = storage.getCapabilities().xrDeleteSpatialAnchorsAsyncML;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorsDeleteInfoML.validate(deleteInfo);
        }
        return callPPPI(storage.address(), deleteInfo, future, __functionAddress);
    }

    /** {@code XrResult xrDeleteSpatialAnchorsAsyncML(XrSpatialAnchorsStorageML storage, XrSpatialAnchorsDeleteInfoML const * deleteInfo, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrDeleteSpatialAnchorsAsyncML(XrSpatialAnchorsStorageML storage, @NativeType("XrSpatialAnchorsDeleteInfoML const *") XrSpatialAnchorsDeleteInfoML deleteInfo, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrDeleteSpatialAnchorsAsyncML(storage, deleteInfo.address(), memAddress(future));
    }

    // --- [ xrDeleteSpatialAnchorsCompleteML ] ---

    /** {@code XrResult xrDeleteSpatialAnchorsCompleteML(XrSpatialAnchorsStorageML storage, XrFutureEXT future, XrSpatialAnchorsDeleteCompletionML * completion)} */
    public static int nxrDeleteSpatialAnchorsCompleteML(XrSpatialAnchorsStorageML storage, long future, long completion) {
        long __functionAddress = storage.getCapabilities().xrDeleteSpatialAnchorsCompleteML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(storage.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrDeleteSpatialAnchorsCompleteML(XrSpatialAnchorsStorageML storage, XrFutureEXT future, XrSpatialAnchorsDeleteCompletionML * completion)} */
    @NativeType("XrResult")
    public static int xrDeleteSpatialAnchorsCompleteML(XrSpatialAnchorsStorageML storage, @NativeType("XrFutureEXT") long future, @NativeType("XrSpatialAnchorsDeleteCompletionML *") XrSpatialAnchorsDeleteCompletionML completion) {
        return nxrDeleteSpatialAnchorsCompleteML(storage, future, completion.address());
    }

    // --- [ xrUpdateSpatialAnchorsExpirationAsyncML ] ---

    /** {@code XrResult xrUpdateSpatialAnchorsExpirationAsyncML(XrSpatialAnchorsStorageML storage, XrSpatialAnchorsUpdateExpirationInfoML const * updateInfo, XrFutureEXT * future)} */
    public static int nxrUpdateSpatialAnchorsExpirationAsyncML(XrSpatialAnchorsStorageML storage, long updateInfo, long future) {
        long __functionAddress = storage.getCapabilities().xrUpdateSpatialAnchorsExpirationAsyncML;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorsUpdateExpirationInfoML.validate(updateInfo);
        }
        return callPPPI(storage.address(), updateInfo, future, __functionAddress);
    }

    /** {@code XrResult xrUpdateSpatialAnchorsExpirationAsyncML(XrSpatialAnchorsStorageML storage, XrSpatialAnchorsUpdateExpirationInfoML const * updateInfo, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrUpdateSpatialAnchorsExpirationAsyncML(XrSpatialAnchorsStorageML storage, @NativeType("XrSpatialAnchorsUpdateExpirationInfoML const *") XrSpatialAnchorsUpdateExpirationInfoML updateInfo, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrUpdateSpatialAnchorsExpirationAsyncML(storage, updateInfo.address(), memAddress(future));
    }

    // --- [ xrUpdateSpatialAnchorsExpirationCompleteML ] ---

    /** {@code XrResult xrUpdateSpatialAnchorsExpirationCompleteML(XrSpatialAnchorsStorageML storage, XrFutureEXT future, XrSpatialAnchorsUpdateExpirationCompletionML * completion)} */
    public static int nxrUpdateSpatialAnchorsExpirationCompleteML(XrSpatialAnchorsStorageML storage, long future, long completion) {
        long __functionAddress = storage.getCapabilities().xrUpdateSpatialAnchorsExpirationCompleteML;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(storage.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrUpdateSpatialAnchorsExpirationCompleteML(XrSpatialAnchorsStorageML storage, XrFutureEXT future, XrSpatialAnchorsUpdateExpirationCompletionML * completion)} */
    @NativeType("XrResult")
    public static int xrUpdateSpatialAnchorsExpirationCompleteML(XrSpatialAnchorsStorageML storage, @NativeType("XrFutureEXT") long future, @NativeType("XrSpatialAnchorsUpdateExpirationCompletionML *") XrSpatialAnchorsUpdateExpirationCompletionML completion) {
        return nxrUpdateSpatialAnchorsExpirationCompleteML(storage, future, completion.address());
    }

}
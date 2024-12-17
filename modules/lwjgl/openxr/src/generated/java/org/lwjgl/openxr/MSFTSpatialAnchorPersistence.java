/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class MSFTSpatialAnchorPersistence {

    public static final int XR_MSFT_spatial_anchor_persistence_SPEC_VERSION = 2;

    public static final String XR_MSFT_SPATIAL_ANCHOR_PERSISTENCE_EXTENSION_NAME = "XR_MSFT_spatial_anchor_persistence";

    public static final int XR_OBJECT_TYPE_SPATIAL_ANCHOR_STORE_CONNECTION_MSFT = 1000142000;

    public static final int
        XR_TYPE_SPATIAL_ANCHOR_PERSISTENCE_INFO_MSFT                  = 1000142000,
        XR_TYPE_SPATIAL_ANCHOR_FROM_PERSISTED_ANCHOR_CREATE_INFO_MSFT = 1000142001;

    public static final int
        XR_ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT = -1000142001,
        XR_ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT   = -1000142002;

    public static final int XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_MSFT = 256;

    protected MSFTSpatialAnchorPersistence() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateSpatialAnchorStoreConnectionMSFT ] ---

    /** {@code XrResult xrCreateSpatialAnchorStoreConnectionMSFT(XrSession session, XrSpatialAnchorStoreConnectionMSFT * spatialAnchorStore)} */
    public static int nxrCreateSpatialAnchorStoreConnectionMSFT(XrSession session, long spatialAnchorStore) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorStoreConnectionMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(session.address(), spatialAnchorStore, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialAnchorStoreConnectionMSFT(XrSession session, XrSpatialAnchorStoreConnectionMSFT * spatialAnchorStore)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorStoreConnectionMSFT(XrSession session, @NativeType("XrSpatialAnchorStoreConnectionMSFT *") PointerBuffer spatialAnchorStore) {
        if (CHECKS) {
            check(spatialAnchorStore, 1);
        }
        return nxrCreateSpatialAnchorStoreConnectionMSFT(session, memAddress(spatialAnchorStore));
    }

    // --- [ xrDestroySpatialAnchorStoreConnectionMSFT ] ---

    /** {@code XrResult xrDestroySpatialAnchorStoreConnectionMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore)} */
    @NativeType("XrResult")
    public static int xrDestroySpatialAnchorStoreConnectionMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore) {
        long __functionAddress = spatialAnchorStore.getCapabilities().xrDestroySpatialAnchorStoreConnectionMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(spatialAnchorStore.address(), __functionAddress);
    }

    // --- [ xrPersistSpatialAnchorMSFT ] ---

    /** {@code XrResult xrPersistSpatialAnchorMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore, XrSpatialAnchorPersistenceInfoMSFT const * spatialAnchorPersistenceInfo)} */
    public static int nxrPersistSpatialAnchorMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore, long spatialAnchorPersistenceInfo) {
        long __functionAddress = spatialAnchorStore.getCapabilities().xrPersistSpatialAnchorMSFT;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorPersistenceInfoMSFT.validate(spatialAnchorPersistenceInfo);
        }
        return callPPI(spatialAnchorStore.address(), spatialAnchorPersistenceInfo, __functionAddress);
    }

    /** {@code XrResult xrPersistSpatialAnchorMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore, XrSpatialAnchorPersistenceInfoMSFT const * spatialAnchorPersistenceInfo)} */
    @NativeType("XrResult")
    public static int xrPersistSpatialAnchorMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore, @NativeType("XrSpatialAnchorPersistenceInfoMSFT const *") XrSpatialAnchorPersistenceInfoMSFT spatialAnchorPersistenceInfo) {
        return nxrPersistSpatialAnchorMSFT(spatialAnchorStore, spatialAnchorPersistenceInfo.address());
    }

    // --- [ xrEnumeratePersistedSpatialAnchorNamesMSFT ] ---

    /** {@code XrResult xrEnumeratePersistedSpatialAnchorNamesMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore, uint32_t spatialAnchorNameCapacityInput, uint32_t * spatialAnchorNameCountOutput, XrSpatialAnchorPersistenceNameMSFT * spatialAnchorNames)} */
    public static int nxrEnumeratePersistedSpatialAnchorNamesMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore, int spatialAnchorNameCapacityInput, long spatialAnchorNameCountOutput, long spatialAnchorNames) {
        long __functionAddress = spatialAnchorStore.getCapabilities().xrEnumeratePersistedSpatialAnchorNamesMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(spatialAnchorStore.address(), spatialAnchorNameCapacityInput, spatialAnchorNameCountOutput, spatialAnchorNames, __functionAddress);
    }

    /** {@code XrResult xrEnumeratePersistedSpatialAnchorNamesMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore, uint32_t spatialAnchorNameCapacityInput, uint32_t * spatialAnchorNameCountOutput, XrSpatialAnchorPersistenceNameMSFT * spatialAnchorNames)} */
    @NativeType("XrResult")
    public static int xrEnumeratePersistedSpatialAnchorNamesMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore, @NativeType("uint32_t *") IntBuffer spatialAnchorNameCountOutput, @NativeType("XrSpatialAnchorPersistenceNameMSFT *") XrSpatialAnchorPersistenceNameMSFT.@Nullable Buffer spatialAnchorNames) {
        if (CHECKS) {
            check(spatialAnchorNameCountOutput, 1);
        }
        return nxrEnumeratePersistedSpatialAnchorNamesMSFT(spatialAnchorStore, remainingSafe(spatialAnchorNames), memAddress(spatialAnchorNameCountOutput), memAddressSafe(spatialAnchorNames));
    }

    // --- [ xrCreateSpatialAnchorFromPersistedNameMSFT ] ---

    /** {@code XrResult xrCreateSpatialAnchorFromPersistedNameMSFT(XrSession session, XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT const * spatialAnchorCreateInfo, XrSpatialAnchorMSFT * spatialAnchor)} */
    public static int nxrCreateSpatialAnchorFromPersistedNameMSFT(XrSession session, long spatialAnchorCreateInfo, long spatialAnchor) {
        long __functionAddress = session.getCapabilities().xrCreateSpatialAnchorFromPersistedNameMSFT;
        if (CHECKS) {
            check(__functionAddress);
            XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.validate(spatialAnchorCreateInfo);
        }
        return callPPPI(session.address(), spatialAnchorCreateInfo, spatialAnchor, __functionAddress);
    }

    /** {@code XrResult xrCreateSpatialAnchorFromPersistedNameMSFT(XrSession session, XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT const * spatialAnchorCreateInfo, XrSpatialAnchorMSFT * spatialAnchor)} */
    @NativeType("XrResult")
    public static int xrCreateSpatialAnchorFromPersistedNameMSFT(XrSession session, @NativeType("XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT const *") XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT spatialAnchorCreateInfo, @NativeType("XrSpatialAnchorMSFT *") PointerBuffer spatialAnchor) {
        if (CHECKS) {
            check(spatialAnchor, 1);
        }
        return nxrCreateSpatialAnchorFromPersistedNameMSFT(session, spatialAnchorCreateInfo.address(), memAddress(spatialAnchor));
    }

    // --- [ xrUnpersistSpatialAnchorMSFT ] ---

    /** {@code XrResult xrUnpersistSpatialAnchorMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore, XrSpatialAnchorPersistenceNameMSFT const * spatialAnchorPersistenceName)} */
    public static int nxrUnpersistSpatialAnchorMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore, long spatialAnchorPersistenceName) {
        long __functionAddress = spatialAnchorStore.getCapabilities().xrUnpersistSpatialAnchorMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(spatialAnchorStore.address(), spatialAnchorPersistenceName, __functionAddress);
    }

    /** {@code XrResult xrUnpersistSpatialAnchorMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore, XrSpatialAnchorPersistenceNameMSFT const * spatialAnchorPersistenceName)} */
    @NativeType("XrResult")
    public static int xrUnpersistSpatialAnchorMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore, @NativeType("XrSpatialAnchorPersistenceNameMSFT const *") XrSpatialAnchorPersistenceNameMSFT spatialAnchorPersistenceName) {
        return nxrUnpersistSpatialAnchorMSFT(spatialAnchorStore, spatialAnchorPersistenceName.address());
    }

    // --- [ xrClearSpatialAnchorStoreMSFT ] ---

    /** {@code XrResult xrClearSpatialAnchorStoreMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore)} */
    @NativeType("XrResult")
    public static int xrClearSpatialAnchorStoreMSFT(XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore) {
        long __functionAddress = spatialAnchorStore.getCapabilities().xrClearSpatialAnchorStoreMSFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(spatialAnchorStore.address(), __functionAddress);
    }

}
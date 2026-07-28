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

public class ANDROIDDeviceAnchorPersistence {

    public static final int XR_ANDROID_device_anchor_persistence_SPEC_VERSION = 1;

    public static final String XR_ANDROID_DEVICE_ANCHOR_PERSISTENCE_EXTENSION_NAME = "XR_ANDROID_device_anchor_persistence";

    public static final int
        XR_TYPE_PERSISTED_ANCHOR_SPACE_CREATE_INFO_ANDROID          = 1000457001,
        XR_TYPE_PERSISTED_ANCHOR_SPACE_INFO_ANDROID                 = 1000457002,
        XR_TYPE_DEVICE_ANCHOR_PERSISTENCE_CREATE_INFO_ANDROID       = 1000457003,
        XR_TYPE_SYSTEM_DEVICE_ANCHOR_PERSISTENCE_PROPERTIES_ANDROID = 1000457004;

    public static final int
        XR_ERROR_ANCHOR_ID_NOT_FOUND_ANDROID      = -1000457000,
        XR_ERROR_ANCHOR_ALREADY_PERSISTED_ANDROID = -1000457001,
        XR_ERROR_ANCHOR_NOT_TRACKING_ANDROID      = -1000457002,
        XR_ERROR_PERSISTED_DATA_NOT_READY_ANDROID = -1000457003;

    public static final int XR_OBJECT_TYPE_DEVICE_ANCHOR_PERSISTENCE_ANDROID = 1000457000;

    public static final int
        XR_ANCHOR_PERSIST_STATE_PERSIST_NOT_REQUESTED_ANDROID = 0,
        XR_ANCHOR_PERSIST_STATE_PERSIST_PENDING_ANDROID       = 1,
        XR_ANCHOR_PERSIST_STATE_PERSISTED_ANDROID             = 2;

    protected ANDROIDDeviceAnchorPersistence() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateSupportedPersistenceAnchorTypesANDROID ] ---

    /** {@code XrResult xrEnumerateSupportedPersistenceAnchorTypesANDROID(XrInstance instance, XrSystemId systemId, uint32_t trackableTypeCapacityInput, uint32_t * trackableTypeCountOutput, XrTrackableTypeANDROID * trackableTypes)} */
    public static int nxrEnumerateSupportedPersistenceAnchorTypesANDROID(XrInstance instance, long systemId, int trackableTypeCapacityInput, long trackableTypeCountOutput, long trackableTypes) {
        long __functionAddress = instance.getCapabilities().xrEnumerateSupportedPersistenceAnchorTypesANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(instance.address(), systemId, trackableTypeCapacityInput, trackableTypeCountOutput, trackableTypes, __functionAddress);
    }

    /** {@code XrResult xrEnumerateSupportedPersistenceAnchorTypesANDROID(XrInstance instance, XrSystemId systemId, uint32_t trackableTypeCapacityInput, uint32_t * trackableTypeCountOutput, XrTrackableTypeANDROID * trackableTypes)} */
    @NativeType("XrResult")
    public static int xrEnumerateSupportedPersistenceAnchorTypesANDROID(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("uint32_t *") IntBuffer trackableTypeCountOutput, @NativeType("XrTrackableTypeANDROID *") @Nullable IntBuffer trackableTypes) {
        if (CHECKS) {
            check(trackableTypeCountOutput, 1);
        }
        return nxrEnumerateSupportedPersistenceAnchorTypesANDROID(instance, systemId, remainingSafe(trackableTypes), memAddress(trackableTypeCountOutput), memAddressSafe(trackableTypes));
    }

    // --- [ xrCreateDeviceAnchorPersistenceANDROID ] ---

    /** {@code XrResult xrCreateDeviceAnchorPersistenceANDROID(XrSession session, XrDeviceAnchorPersistenceCreateInfoANDROID const * createInfo, XrDeviceAnchorPersistenceANDROID * outHandle)} */
    public static int nxrCreateDeviceAnchorPersistenceANDROID(XrSession session, long createInfo, long outHandle) {
        long __functionAddress = session.getCapabilities().xrCreateDeviceAnchorPersistenceANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), createInfo, outHandle, __functionAddress);
    }

    /** {@code XrResult xrCreateDeviceAnchorPersistenceANDROID(XrSession session, XrDeviceAnchorPersistenceCreateInfoANDROID const * createInfo, XrDeviceAnchorPersistenceANDROID * outHandle)} */
    @NativeType("XrResult")
    public static int xrCreateDeviceAnchorPersistenceANDROID(XrSession session, @NativeType("XrDeviceAnchorPersistenceCreateInfoANDROID const *") XrDeviceAnchorPersistenceCreateInfoANDROID createInfo, @NativeType("XrDeviceAnchorPersistenceANDROID *") PointerBuffer outHandle) {
        if (CHECKS) {
            check(outHandle, 1);
        }
        return nxrCreateDeviceAnchorPersistenceANDROID(session, createInfo.address(), memAddress(outHandle));
    }

    // --- [ xrDestroyDeviceAnchorPersistenceANDROID ] ---

    /** {@code XrResult xrDestroyDeviceAnchorPersistenceANDROID(XrDeviceAnchorPersistenceANDROID handle)} */
    @NativeType("XrResult")
    public static int xrDestroyDeviceAnchorPersistenceANDROID(XrDeviceAnchorPersistenceANDROID handle) {
        long __functionAddress = handle.getCapabilities().xrDestroyDeviceAnchorPersistenceANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(handle.address(), __functionAddress);
    }

    // --- [ xrPersistAnchorANDROID ] ---

    /** {@code XrResult xrPersistAnchorANDROID(XrDeviceAnchorPersistenceANDROID handle, XrPersistedAnchorSpaceInfoANDROID const * persistedInfo, XrUuidEXT * anchorIdOutput)} */
    public static int nxrPersistAnchorANDROID(XrDeviceAnchorPersistenceANDROID handle, long persistedInfo, long anchorIdOutput) {
        long __functionAddress = handle.getCapabilities().xrPersistAnchorANDROID;
        if (CHECKS) {
            check(__functionAddress);
            XrPersistedAnchorSpaceInfoANDROID.validate(persistedInfo);
        }
        return callPPPI(handle.address(), persistedInfo, anchorIdOutput, __functionAddress);
    }

    /** {@code XrResult xrPersistAnchorANDROID(XrDeviceAnchorPersistenceANDROID handle, XrPersistedAnchorSpaceInfoANDROID const * persistedInfo, XrUuidEXT * anchorIdOutput)} */
    @NativeType("XrResult")
    public static int xrPersistAnchorANDROID(XrDeviceAnchorPersistenceANDROID handle, @NativeType("XrPersistedAnchorSpaceInfoANDROID const *") XrPersistedAnchorSpaceInfoANDROID persistedInfo, @NativeType("XrUuidEXT *") XrUuidEXT anchorIdOutput) {
        return nxrPersistAnchorANDROID(handle, persistedInfo.address(), anchorIdOutput.address());
    }

    // --- [ xrGetAnchorPersistStateANDROID ] ---

    /** {@code XrResult xrGetAnchorPersistStateANDROID(XrDeviceAnchorPersistenceANDROID handle, XrUuidEXT const * anchorId, XrAnchorPersistStateANDROID * persistState)} */
    public static int nxrGetAnchorPersistStateANDROID(XrDeviceAnchorPersistenceANDROID handle, long anchorId, long persistState) {
        long __functionAddress = handle.getCapabilities().xrGetAnchorPersistStateANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(handle.address(), anchorId, persistState, __functionAddress);
    }

    /** {@code XrResult xrGetAnchorPersistStateANDROID(XrDeviceAnchorPersistenceANDROID handle, XrUuidEXT const * anchorId, XrAnchorPersistStateANDROID * persistState)} */
    @NativeType("XrResult")
    public static int xrGetAnchorPersistStateANDROID(XrDeviceAnchorPersistenceANDROID handle, @NativeType("XrUuidEXT const *") XrUuidEXT anchorId, @NativeType("XrAnchorPersistStateANDROID *") IntBuffer persistState) {
        if (CHECKS) {
            check(persistState, 1);
        }
        return nxrGetAnchorPersistStateANDROID(handle, anchorId.address(), memAddress(persistState));
    }

    // --- [ xrCreatePersistedAnchorSpaceANDROID ] ---

    /** {@code XrResult xrCreatePersistedAnchorSpaceANDROID(XrDeviceAnchorPersistenceANDROID handle, XrPersistedAnchorSpaceCreateInfoANDROID const * createInfo, XrSpace * anchorOutput)} */
    public static int nxrCreatePersistedAnchorSpaceANDROID(XrDeviceAnchorPersistenceANDROID handle, long createInfo, long anchorOutput) {
        long __functionAddress = handle.getCapabilities().xrCreatePersistedAnchorSpaceANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(handle.address(), createInfo, anchorOutput, __functionAddress);
    }

    /** {@code XrResult xrCreatePersistedAnchorSpaceANDROID(XrDeviceAnchorPersistenceANDROID handle, XrPersistedAnchorSpaceCreateInfoANDROID const * createInfo, XrSpace * anchorOutput)} */
    @NativeType("XrResult")
    public static int xrCreatePersistedAnchorSpaceANDROID(XrDeviceAnchorPersistenceANDROID handle, @NativeType("XrPersistedAnchorSpaceCreateInfoANDROID const *") XrPersistedAnchorSpaceCreateInfoANDROID createInfo, @NativeType("XrSpace *") PointerBuffer anchorOutput) {
        if (CHECKS) {
            check(anchorOutput, 1);
        }
        return nxrCreatePersistedAnchorSpaceANDROID(handle, createInfo.address(), memAddress(anchorOutput));
    }

    // --- [ xrEnumeratePersistedAnchorsANDROID ] ---

    /** {@code XrResult xrEnumeratePersistedAnchorsANDROID(XrDeviceAnchorPersistenceANDROID handle, uint32_t anchorIdCapacityInput, uint32_t * anchorIdCountOutput, XrUuidEXT * anchorIds)} */
    public static int nxrEnumeratePersistedAnchorsANDROID(XrDeviceAnchorPersistenceANDROID handle, int anchorIdCapacityInput, long anchorIdCountOutput, long anchorIds) {
        long __functionAddress = handle.getCapabilities().xrEnumeratePersistedAnchorsANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(handle.address(), anchorIdCapacityInput, anchorIdCountOutput, anchorIds, __functionAddress);
    }

    /** {@code XrResult xrEnumeratePersistedAnchorsANDROID(XrDeviceAnchorPersistenceANDROID handle, uint32_t anchorIdCapacityInput, uint32_t * anchorIdCountOutput, XrUuidEXT * anchorIds)} */
    @NativeType("XrResult")
    public static int xrEnumeratePersistedAnchorsANDROID(XrDeviceAnchorPersistenceANDROID handle, @NativeType("uint32_t *") IntBuffer anchorIdCountOutput, @NativeType("XrUuidEXT *") XrUuidEXT.@Nullable Buffer anchorIds) {
        if (CHECKS) {
            check(anchorIdCountOutput, 1);
        }
        return nxrEnumeratePersistedAnchorsANDROID(handle, remainingSafe(anchorIds), memAddress(anchorIdCountOutput), memAddressSafe(anchorIds));
    }

    // --- [ xrUnpersistAnchorANDROID ] ---

    /** {@code XrResult xrUnpersistAnchorANDROID(XrDeviceAnchorPersistenceANDROID handle, XrUuidEXT const * anchorId)} */
    public static int nxrUnpersistAnchorANDROID(XrDeviceAnchorPersistenceANDROID handle, long anchorId) {
        long __functionAddress = handle.getCapabilities().xrUnpersistAnchorANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(handle.address(), anchorId, __functionAddress);
    }

    /** {@code XrResult xrUnpersistAnchorANDROID(XrDeviceAnchorPersistenceANDROID handle, XrUuidEXT const * anchorId)} */
    @NativeType("XrResult")
    public static int xrUnpersistAnchorANDROID(XrDeviceAnchorPersistenceANDROID handle, @NativeType("XrUuidEXT const *") XrUuidEXT anchorId) {
        return nxrUnpersistAnchorANDROID(handle, anchorId.address());
    }

}
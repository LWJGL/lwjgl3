/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ANDROIDRaycast {

    public static final int XR_ANDROID_raycast_SPEC_VERSION = 1;

    public static final String XR_ANDROID_RAYCAST_EXTENSION_NAME = "XR_ANDROID_raycast";

    public static final int
        XR_TYPE_RAYCAST_INFO_ANDROID        = 1000463000,
        XR_TYPE_RAYCAST_HIT_RESULTS_ANDROID = 1000463001;

    public static final int XR_TRACKABLE_TYPE_DEPTH_ANDROID = 1000463000;

    protected ANDROIDRaycast() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrEnumerateRaycastSupportedTrackableTypesANDROID ] ---

    /** {@code XrResult xrEnumerateRaycastSupportedTrackableTypesANDROID(XrInstance instance, XrSystemId systemId, uint32_t trackableTypeCapacityInput, uint32_t * trackableTypeCountOutput, XrTrackableTypeANDROID * trackableTypes)} */
    public static int nxrEnumerateRaycastSupportedTrackableTypesANDROID(XrInstance instance, long systemId, int trackableTypeCapacityInput, long trackableTypeCountOutput, long trackableTypes) {
        long __functionAddress = instance.getCapabilities().xrEnumerateRaycastSupportedTrackableTypesANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(instance.address(), systemId, trackableTypeCapacityInput, trackableTypeCountOutput, trackableTypes, __functionAddress);
    }

    /** {@code XrResult xrEnumerateRaycastSupportedTrackableTypesANDROID(XrInstance instance, XrSystemId systemId, uint32_t trackableTypeCapacityInput, uint32_t * trackableTypeCountOutput, XrTrackableTypeANDROID * trackableTypes)} */
    @NativeType("XrResult")
    public static int xrEnumerateRaycastSupportedTrackableTypesANDROID(XrInstance instance, @NativeType("XrSystemId") long systemId, @NativeType("uint32_t *") IntBuffer trackableTypeCountOutput, @NativeType("XrTrackableTypeANDROID *") @Nullable IntBuffer trackableTypes) {
        if (CHECKS) {
            check(trackableTypeCountOutput, 1);
        }
        return nxrEnumerateRaycastSupportedTrackableTypesANDROID(instance, systemId, remainingSafe(trackableTypes), memAddress(trackableTypeCountOutput), memAddressSafe(trackableTypes));
    }

    // --- [ xrRaycastANDROID ] ---

    /** {@code XrResult xrRaycastANDROID(XrSession session, XrRaycastInfoANDROID const * rayInfo, XrRaycastHitResultsANDROID * results)} */
    public static int nxrRaycastANDROID(XrSession session, long rayInfo, long results) {
        long __functionAddress = session.getCapabilities().xrRaycastANDROID;
        if (CHECKS) {
            check(__functionAddress);
            XrRaycastInfoANDROID.validate(rayInfo);
        }
        return callPPPI(session.address(), rayInfo, results, __functionAddress);
    }

    /** {@code XrResult xrRaycastANDROID(XrSession session, XrRaycastInfoANDROID const * rayInfo, XrRaycastHitResultsANDROID * results)} */
    @NativeType("XrResult")
    public static int xrRaycastANDROID(XrSession session, @NativeType("XrRaycastInfoANDROID const *") XrRaycastInfoANDROID rayInfo, @NativeType("XrRaycastHitResultsANDROID *") XrRaycastHitResultsANDROID results) {
        return nxrRaycastANDROID(session, rayInfo.address(), results.address());
    }

}
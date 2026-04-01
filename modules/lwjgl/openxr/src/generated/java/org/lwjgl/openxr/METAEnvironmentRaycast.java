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

public class METAEnvironmentRaycast {

    public static final int XR_META_environment_raycast_SPEC_VERSION = 1;

    public static final String XR_META_ENVIRONMENT_RAYCAST_EXTENSION_NAME = "XR_META_environment_raycast";

    public static final int XR_OBJECT_TYPE_ENVIRONMENT_RAYCASTER_META = 1000592000;

    public static final int
        XR_TYPE_SYSTEM_ENVIRONMENT_RAYCAST_PROPERTIES_META   = 1000592000,
        XR_TYPE_ENVIRONMENT_RAYCASTER_CREATE_INFO_META       = 1000592001,
        XR_TYPE_ENVIRONMENT_RAYCASTER_CREATE_COMPLETION_META = 1000592002,
        XR_TYPE_ENVIRONMENT_RAYCAST_HIT_GET_INFO_META        = 1000592003,
        XR_TYPE_ENVIRONMENT_RAYCAST_HIT_META                 = 1000592004,
        XR_TYPE_ENVIRONMENT_RAYCAST_FILTER_DISTANCE_META     = 1000592005;

    public static final int
        XR_ENVIRONMENT_RAYCAST_HIT_STATUS_HIT_META                      = 1,
        XR_ENVIRONMENT_RAYCAST_HIT_STATUS_NO_HIT_META                   = 2,
        XR_ENVIRONMENT_RAYCAST_HIT_STATUS_HIT_POINT_OCCLUDED_META       = 3,
        XR_ENVIRONMENT_RAYCAST_HIT_STATUS_HIT_POINT_OUTSIDE_OF_FOV_META = 4,
        XR_ENVIRONMENT_RAYCAST_HIT_STATUS_RAY_OCCLUDED_META             = 5,
        XR_ENVIRONMENT_RAYCAST_HIT_STATUS_HIT_INVALID_ORIENTATION_META  = 6;

    protected METAEnvironmentRaycast() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCreateEnvironmentRaycasterAsyncMETA ] ---

    /** {@code XrResult xrCreateEnvironmentRaycasterAsyncMETA(XrSession session, XrEnvironmentRaycasterCreateInfoMETA const * info, XrFutureEXT * future)} */
    public static int nxrCreateEnvironmentRaycasterAsyncMETA(XrSession session, long info, long future) {
        long __functionAddress = session.getCapabilities().xrCreateEnvironmentRaycasterAsyncMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), info, future, __functionAddress);
    }

    /** {@code XrResult xrCreateEnvironmentRaycasterAsyncMETA(XrSession session, XrEnvironmentRaycasterCreateInfoMETA const * info, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrCreateEnvironmentRaycasterAsyncMETA(XrSession session, @NativeType("XrEnvironmentRaycasterCreateInfoMETA const *") @Nullable XrEnvironmentRaycasterCreateInfoMETA info, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrCreateEnvironmentRaycasterAsyncMETA(session, memAddressSafe(info), memAddress(future));
    }

    // --- [ xrCreateEnvironmentRaycasterCompleteMETA ] ---

    /** {@code XrResult xrCreateEnvironmentRaycasterCompleteMETA(XrSession session, XrFutureEXT future, XrEnvironmentRaycasterCreateCompletionMETA * completion)} */
    public static int nxrCreateEnvironmentRaycasterCompleteMETA(XrSession session, long future, long completion) {
        long __functionAddress = session.getCapabilities().xrCreateEnvironmentRaycasterCompleteMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrCreateEnvironmentRaycasterCompleteMETA(XrSession session, XrFutureEXT future, XrEnvironmentRaycasterCreateCompletionMETA * completion)} */
    @NativeType("XrResult")
    public static int xrCreateEnvironmentRaycasterCompleteMETA(XrSession session, @NativeType("XrFutureEXT") long future, @NativeType("XrEnvironmentRaycasterCreateCompletionMETA *") XrEnvironmentRaycasterCreateCompletionMETA completion) {
        return nxrCreateEnvironmentRaycasterCompleteMETA(session, future, completion.address());
    }

    // --- [ xrDestroyEnvironmentRaycasterMETA ] ---

    /** {@code XrResult xrDestroyEnvironmentRaycasterMETA(XrEnvironmentRaycasterMETA environmentRaycaster)} */
    @NativeType("XrResult")
    public static int xrDestroyEnvironmentRaycasterMETA(XrEnvironmentRaycasterMETA environmentRaycaster) {
        long __functionAddress = environmentRaycaster.getCapabilities().xrDestroyEnvironmentRaycasterMETA;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(environmentRaycaster.address(), __functionAddress);
    }

    // --- [ xrPerformEnvironmentRaycastMETA ] ---

    /** {@code XrResult xrPerformEnvironmentRaycastMETA(XrEnvironmentRaycasterMETA environmentRaycaster, XrEnvironmentRaycastHitGetInfoMETA const * info, XrEnvironmentRaycastHitMETA * hitPoint)} */
    public static int nxrPerformEnvironmentRaycastMETA(XrEnvironmentRaycasterMETA environmentRaycaster, long info, long hitPoint) {
        long __functionAddress = environmentRaycaster.getCapabilities().xrPerformEnvironmentRaycastMETA;
        if (CHECKS) {
            check(__functionAddress);
            XrEnvironmentRaycastHitGetInfoMETA.validate(info);
        }
        return callPPPI(environmentRaycaster.address(), info, hitPoint, __functionAddress);
    }

    /** {@code XrResult xrPerformEnvironmentRaycastMETA(XrEnvironmentRaycasterMETA environmentRaycaster, XrEnvironmentRaycastHitGetInfoMETA const * info, XrEnvironmentRaycastHitMETA * hitPoint)} */
    @NativeType("XrResult")
    public static int xrPerformEnvironmentRaycastMETA(XrEnvironmentRaycasterMETA environmentRaycaster, @NativeType("XrEnvironmentRaycastHitGetInfoMETA const *") XrEnvironmentRaycastHitGetInfoMETA info, @NativeType("XrEnvironmentRaycastHitMETA *") XrEnvironmentRaycastHitMETA hitPoint) {
        return nxrPerformEnvironmentRaycastMETA(environmentRaycaster, info.address(), hitPoint.address());
    }

}
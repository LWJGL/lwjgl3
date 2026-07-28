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

public class ANDROIDGoogleCloudAuth {

    public static final int XR_ANDROID_google_cloud_auth_SPEC_VERSION = 1;

    public static final String XR_ANDROID_GOOGLE_CLOUD_AUTH_EXTENSION_NAME = "XR_ANDROID_google_cloud_auth";

    public static final int
        XR_ERROR_KEYLESS_AUTH_NOT_SETUP_ANDROID = -1000787000,
        XR_ERROR_KEYLESS_AUTH_FAILED_ANDROID    = -1000787001;

    public static final int
        XR_TYPE_GOOGLE_CLOUD_AUTH_INFO_API_KEY_ANDROID = 1000787000,
        XR_TYPE_GOOGLE_CLOUD_AUTH_INFO_TOKEN_ANDROID   = 1000787001,
        XR_TYPE_GOOGLE_CLOUD_AUTH_INFO_KEYLESS_ANDROID = 1000787002,
        XR_TYPE_GOOGLE_CLOUD_AUTH_ERROR_RESULT_ANDROID = 1000787003;

    public static final int
        XR_GOOGLE_CLOUD_AUTH_ERROR_NONE_ANDROID           = 0,
        XR_GOOGLE_CLOUD_AUTH_ERROR_QUOTA_EXCEEDED_ANDROID = -1,
        XR_GOOGLE_CLOUD_AUTH_ERROR_UNREACHABLE_ANDROID    = -2,
        XR_GOOGLE_CLOUD_AUTH_ERROR_ANDROID                = -3;

    protected ANDROIDGoogleCloudAuth() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSetGoogleCloudAuthAsyncANDROID ] ---

    /** {@code XrResult xrSetGoogleCloudAuthAsyncANDROID(XrSession session, XrGoogleCloudAuthInfoBaseHeaderANDROID const * authInfo, XrFutureEXT * future)} */
    public static int nxrSetGoogleCloudAuthAsyncANDROID(XrSession session, long authInfo, long future) {
        long __functionAddress = session.getCapabilities().xrSetGoogleCloudAuthAsyncANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), authInfo, future, __functionAddress);
    }

    /** {@code XrResult xrSetGoogleCloudAuthAsyncANDROID(XrSession session, XrGoogleCloudAuthInfoBaseHeaderANDROID const * authInfo, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrSetGoogleCloudAuthAsyncANDROID(XrSession session, @NativeType("XrGoogleCloudAuthInfoBaseHeaderANDROID const *") XrGoogleCloudAuthInfoBaseHeaderANDROID authInfo, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrSetGoogleCloudAuthAsyncANDROID(session, authInfo.address(), memAddress(future));
    }

    // --- [ xrSetGoogleCloudAuthCompleteANDROID ] ---

    /** {@code XrResult xrSetGoogleCloudAuthCompleteANDROID(XrSession session, XrFutureEXT future, XrFutureCompletionEXT * completion)} */
    public static int nxrSetGoogleCloudAuthCompleteANDROID(XrSession session, long future, long completion) {
        long __functionAddress = session.getCapabilities().xrSetGoogleCloudAuthCompleteANDROID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(session.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrSetGoogleCloudAuthCompleteANDROID(XrSession session, XrFutureEXT future, XrFutureCompletionEXT * completion)} */
    @NativeType("XrResult")
    public static int xrSetGoogleCloudAuthCompleteANDROID(XrSession session, @NativeType("XrFutureEXT") long future, @NativeType("XrFutureCompletionEXT *") XrFutureCompletionEXT completion) {
        return nxrSetGoogleCloudAuthCompleteANDROID(session, future, completion.address());
    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class EXTFuture {

    public static final int XR_EXT_future_SPEC_VERSION = 1;

    public static final String XR_EXT_FUTURE_EXTENSION_NAME = "XR_EXT_future";

    public static final int XR_NULL_FUTURE_EXT = 0;

    public static final int
        XR_ERROR_FUTURE_PENDING_EXT = -1000469001,
        XR_ERROR_FUTURE_INVALID_EXT = -1000469002;

    public static final int
        XR_TYPE_FUTURE_CANCEL_INFO_EXT = 1000469000,
        XR_TYPE_FUTURE_POLL_INFO_EXT   = 1000469001,
        XR_TYPE_FUTURE_COMPLETION_EXT  = 1000469002,
        XR_TYPE_FUTURE_POLL_RESULT_EXT = 1000469003;

    public static final int
        XR_FUTURE_STATE_PENDING_EXT = 1,
        XR_FUTURE_STATE_READY_EXT   = 2;

    protected EXTFuture() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrPollFutureEXT ] ---

    /** {@code XrResult xrPollFutureEXT(XrInstance instance, XrFuturePollInfoEXT const * pollInfo, XrFuturePollResultEXT * pollResult)} */
    public static int nxrPollFutureEXT(XrInstance instance, long pollInfo, long pollResult) {
        long __functionAddress = instance.getCapabilities().xrPollFutureEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(instance.address(), pollInfo, pollResult, __functionAddress);
    }

    /** {@code XrResult xrPollFutureEXT(XrInstance instance, XrFuturePollInfoEXT const * pollInfo, XrFuturePollResultEXT * pollResult)} */
    @NativeType("XrResult")
    public static int xrPollFutureEXT(XrInstance instance, @NativeType("XrFuturePollInfoEXT const *") XrFuturePollInfoEXT pollInfo, @NativeType("XrFuturePollResultEXT *") XrFuturePollResultEXT pollResult) {
        return nxrPollFutureEXT(instance, pollInfo.address(), pollResult.address());
    }

    // --- [ xrCancelFutureEXT ] ---

    /** {@code XrResult xrCancelFutureEXT(XrInstance instance, XrFutureCancelInfoEXT const * cancelInfo)} */
    public static int nxrCancelFutureEXT(XrInstance instance, long cancelInfo) {
        long __functionAddress = instance.getCapabilities().xrCancelFutureEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(instance.address(), cancelInfo, __functionAddress);
    }

    /** {@code XrResult xrCancelFutureEXT(XrInstance instance, XrFutureCancelInfoEXT const * cancelInfo)} */
    @NativeType("XrResult")
    public static int xrCancelFutureEXT(XrInstance instance, @NativeType("XrFutureCancelInfoEXT const *") XrFutureCancelInfoEXT cancelInfo) {
        return nxrCancelFutureEXT(instance, cancelInfo.address());
    }

}
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

public class FBSceneCapture {

    public static final int XR_FB_scene_capture_SPEC_VERSION = 1;

    public static final String XR_FB_SCENE_CAPTURE_EXTENSION_NAME = "XR_FB_scene_capture";

    public static final int
        XR_TYPE_EVENT_DATA_SCENE_CAPTURE_COMPLETE_FB = 1000198001,
        XR_TYPE_SCENE_CAPTURE_REQUEST_INFO_FB        = 1000198050;

    protected FBSceneCapture() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrRequestSceneCaptureFB ] ---

    /** {@code XrResult xrRequestSceneCaptureFB(XrSession session, XrSceneCaptureRequestInfoFB const * info, XrAsyncRequestIdFB * requestId)} */
    public static int nxrRequestSceneCaptureFB(XrSession session, long info, long requestId) {
        long __functionAddress = session.getCapabilities().xrRequestSceneCaptureFB;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(session.address(), info, requestId, __functionAddress);
    }

    /** {@code XrResult xrRequestSceneCaptureFB(XrSession session, XrSceneCaptureRequestInfoFB const * info, XrAsyncRequestIdFB * requestId)} */
    @NativeType("XrResult")
    public static int xrRequestSceneCaptureFB(XrSession session, @NativeType("XrSceneCaptureRequestInfoFB const *") XrSceneCaptureRequestInfoFB info, @NativeType("XrAsyncRequestIdFB *") LongBuffer requestId) {
        if (CHECKS) {
            check(requestId, 1);
        }
        return nxrRequestSceneCaptureFB(session, info.address(), memAddress(requestId));
    }

}
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

public class BDSpatialScene {

    public static final int XR_BD_spatial_scene_SPEC_VERSION = 1;

    public static final String XR_BD_SPATIAL_SCENE_EXTENSION_NAME = "XR_BD_spatial_scene";

    public static final int
        XR_TYPE_SYSTEM_SPATIAL_SCENE_PROPERTIES_BD = 1000392000,
        XR_TYPE_SCENE_CAPTURE_INFO_BD              = 1000392001;

    public static final int XR_SENSE_DATA_PROVIDER_TYPE_SCENE_BD = 1000392000;

    public static final int XR_ERROR_SCENE_CAPTURE_FAILURE_BD = -1000392000;

    protected BDSpatialScene() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrCaptureSceneAsyncBD ] ---

    /** {@code XrResult xrCaptureSceneAsyncBD(XrSenseDataProviderBD provider, XrSceneCaptureInfoBD const * info, XrFutureEXT * future)} */
    public static int nxrCaptureSceneAsyncBD(XrSenseDataProviderBD provider, long info, long future) {
        long __functionAddress = provider.getCapabilities().xrCaptureSceneAsyncBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(provider.address(), info, future, __functionAddress);
    }

    /** {@code XrResult xrCaptureSceneAsyncBD(XrSenseDataProviderBD provider, XrSceneCaptureInfoBD const * info, XrFutureEXT * future)} */
    @NativeType("XrResult")
    public static int xrCaptureSceneAsyncBD(XrSenseDataProviderBD provider, @NativeType("XrSceneCaptureInfoBD const *") XrSceneCaptureInfoBD info, @NativeType("XrFutureEXT *") LongBuffer future) {
        if (CHECKS) {
            check(future, 1);
        }
        return nxrCaptureSceneAsyncBD(provider, info.address(), memAddress(future));
    }

    // --- [ xrCaptureSceneCompleteBD ] ---

    /** {@code XrResult xrCaptureSceneCompleteBD(XrSenseDataProviderBD provider, XrFutureEXT future, XrFutureCompletionEXT * completion)} */
    public static int nxrCaptureSceneCompleteBD(XrSenseDataProviderBD provider, long future, long completion) {
        long __functionAddress = provider.getCapabilities().xrCaptureSceneCompleteBD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(provider.address(), future, completion, __functionAddress);
    }

    /** {@code XrResult xrCaptureSceneCompleteBD(XrSenseDataProviderBD provider, XrFutureEXT future, XrFutureCompletionEXT * completion)} */
    @NativeType("XrResult")
    public static int xrCaptureSceneCompleteBD(XrSenseDataProviderBD provider, @NativeType("XrFutureEXT") long future, @NativeType("XrFutureCompletionEXT *") XrFutureCompletionEXT completion) {
        return nxrCaptureSceneCompleteBD(provider, future, completion.address());
    }

}
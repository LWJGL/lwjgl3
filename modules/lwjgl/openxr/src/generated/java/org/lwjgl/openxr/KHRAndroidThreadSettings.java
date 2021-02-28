/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/** The KHR_android_thread_settings extension. */
public class KHRAndroidThreadSettings {

    /** The extension specification version. */
    public static final int XR_KHR_android_thread_settings_SPEC_VERSION = 5;

    /** The extension name. */
    public static final String XR_KHR_ANDROID_THREAD_SETTINGS_EXTENSION_NAME = "XR_KHR_android_thread_settings";

    /**
     * Extends {@code XrResult}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_ERROR_ANDROID_THREAD_SETTINGS_ID_INVALID_KHR ERROR_ANDROID_THREAD_SETTINGS_ID_INVALID_KHR}</li>
     * <li>{@link #XR_ERROR_ANDROID_THREAD_SETTINGS_FAILURE_KHR ERROR_ANDROID_THREAD_SETTINGS_FAILURE_KHR}</li>
     * </ul>
     */
    public static final int
        XR_ERROR_ANDROID_THREAD_SETTINGS_ID_INVALID_KHR = -1000003000,
        XR_ERROR_ANDROID_THREAD_SETTINGS_FAILURE_KHR    = -1000003001;

    /**
     * XrAndroidThreadTypeKHR
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_ANDROID_THREAD_TYPE_APPLICATION_MAIN_KHR ANDROID_THREAD_TYPE_APPLICATION_MAIN_KHR}</li>
     * <li>{@link #XR_ANDROID_THREAD_TYPE_APPLICATION_WORKER_KHR ANDROID_THREAD_TYPE_APPLICATION_WORKER_KHR}</li>
     * <li>{@link #XR_ANDROID_THREAD_TYPE_RENDERER_MAIN_KHR ANDROID_THREAD_TYPE_RENDERER_MAIN_KHR}</li>
     * <li>{@link #XR_ANDROID_THREAD_TYPE_RENDERER_WORKER_KHR ANDROID_THREAD_TYPE_RENDERER_WORKER_KHR}</li>
     * </ul>
     */
    public static final int
        XR_ANDROID_THREAD_TYPE_APPLICATION_MAIN_KHR   = 1,
        XR_ANDROID_THREAD_TYPE_APPLICATION_WORKER_KHR = 2,
        XR_ANDROID_THREAD_TYPE_RENDERER_MAIN_KHR      = 3,
        XR_ANDROID_THREAD_TYPE_RENDERER_WORKER_KHR    = 4;

    protected KHRAndroidThreadSettings() {
        throw new UnsupportedOperationException();
    }

    // --- [ xrSetAndroidApplicationThreadKHR ] ---

    @NativeType("XrResult")
    public static int xrSetAndroidApplicationThreadKHR(XrSession session, @NativeType("XrAndroidThreadTypeKHR") int threadType, @NativeType("uint32_t") int threadId) {
        long __functionAddress = session.getCapabilities().xrSetAndroidApplicationThreadKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(session.address(), threadType, threadId, __functionAddress);
    }

}
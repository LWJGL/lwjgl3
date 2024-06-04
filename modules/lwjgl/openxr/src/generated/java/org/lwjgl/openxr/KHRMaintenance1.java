/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html#XR_KHR_maintenance1">XR_KHR_maintenance1</a> extension.
 * 
 * <p>{@link KHRMaintenance1 XR_KHR_maintenance1} adds a collection of minor features that were intentionally left out or overlooked from the original OpenXR 1.0 release. All are promoted to the OpenXR 1.1 release.</p>
 */
public final class KHRMaintenance1 {

    /** The extension specification version. */
    public static final int XR_KHR_maintenance1_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_KHR_MAINTENANCE1_EXTENSION_NAME = "XR_KHR_maintenance1";

    /**
     * Extends {@code XrResult}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_ERROR_EXTENSION_DEPENDENCY_NOT_ENABLED_KHR ERROR_EXTENSION_DEPENDENCY_NOT_ENABLED_KHR}</li>
     * <li>{@link #XR_ERROR_PERMISSION_INSUFFICIENT_KHR ERROR_PERMISSION_INSUFFICIENT_KHR}</li>
     * </ul>
     */
    public static final int
        XR_ERROR_EXTENSION_DEPENDENCY_NOT_ENABLED_KHR = -1000710001,
        XR_ERROR_PERMISSION_INSUFFICIENT_KHR          = -1000710000;

    private KHRMaintenance1() {}

}
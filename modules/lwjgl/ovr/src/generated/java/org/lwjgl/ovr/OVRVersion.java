/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

/** LibOVR version identification. */
public final class OVRVersion {

    /** Master version numbers. */
    public static final int
        OVR_PRODUCT_VERSION = 1,
        OVR_MAJOR_VERSION   = 1,
        OVR_MINOR_VERSION   = 64,
        OVR_PATCH_VERSION   = 0;

    /** The {@code ((product * 100) + major)} version of the service that the DLL is compatible with. */
    public static final int OVR_DLL_COMPATIBLE_VERSION = 101;

    /**
     * This is the minor version representing the minimum version an application can query with this SDK. Calls to {@link OVR#ovr_Initialize Initialize} will fail if the application
     * requests a version that is less than this.
     */
    public static final int OVR_MIN_REQUESTABLE_MINOR_VERSION = 17;

    public static final int OVR_OVR_FEATURE_VERSION = 0;

    /** "Major.Minor.Patch" */
    public static final String OVR_VERSION_STRING = Integer.toString(OVR_MAJOR_VERSION) + '.' + OVR_MINOR_VERSION + '.' + OVR_PATCH_VERSION;

    private OVRVersion() {}

}
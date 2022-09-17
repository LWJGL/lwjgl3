/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_EPIC_view_configuration_fov">XR_EPIC_view_configuration_fov</a> extension.
 * 
 * <p>This extension allows the application to retrieve the recommended and maximum field-of-view using {@link XR10#xrEnumerateViewConfigurationViews EnumerateViewConfigurationViews}. These field-of-view parameters can be used during initialization of the application before creating a session.</p>
 * 
 * <p>The field-of-view given here <b>should</b> not be used for rendering, see {@link XR10#xrLocateViews LocateViews} to retrieve the field-of-view for rendering.</p>
 * 
 * <p>For views with {@code fovMutable} set to {@code XR_TRUE} the maximum field-of-view <b>should</b> specify the upper limit that runtime can support. If the view has {@code fovMutable} set to {@code XR_FALSE} the runtime <b>must</b> set {@code maxMutableFov} to be the same as {@code recommendedFov}.</p>
 */
public final class EPICViewConfigurationFov {

    /** The extension specification version. */
    public static final int XR_EPIC_view_configuration_fov_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_EPIC_VIEW_CONFIGURATION_FOV_EXTENSION_NAME = "XR_EPIC_view_configuration_fov";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_VIEW_CONFIGURATION_VIEW_FOV_EPIC = 1000059000;

    private EPICViewConfigurationFov() {}

}
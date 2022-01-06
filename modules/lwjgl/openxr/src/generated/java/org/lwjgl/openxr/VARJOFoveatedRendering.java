/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/** The VARJO_foveated_rendering extension. */
public final class VARJOFoveatedRendering {

    /** The extension specification version. */
    public static final int XR_VARJO_foveated_rendering_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_VARJO_FOVEATED_RENDERING_EXTENSION_NAME = "XR_VARJO_foveated_rendering";

    /**
     * Extends {@code XrStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #XR_TYPE_VIEW_LOCATE_FOVEATED_RENDERING_VARJO TYPE_VIEW_LOCATE_FOVEATED_RENDERING_VARJO}</li>
     * <li>{@link #XR_TYPE_FOVEATED_VIEW_CONFIGURATION_VIEW_VARJO TYPE_FOVEATED_VIEW_CONFIGURATION_VIEW_VARJO}</li>
     * <li>{@link #XR_TYPE_SYSTEM_FOVEATED_RENDERING_PROPERTIES_VARJO TYPE_SYSTEM_FOVEATED_RENDERING_PROPERTIES_VARJO}</li>
     * </ul>
     */
    public static final int
        XR_TYPE_VIEW_LOCATE_FOVEATED_RENDERING_VARJO       = 1000121000,
        XR_TYPE_FOVEATED_VIEW_CONFIGURATION_VIEW_VARJO     = 1000121001,
        XR_TYPE_SYSTEM_FOVEATED_RENDERING_PROPERTIES_VARJO = 1000121002;

    /** Extends {@code XrReferenceSpaceType}. */
    public static final int XR_REFERENCE_SPACE_TYPE_COMBINED_EYE_VARJO = 1000121000;

    private VARJOFoveatedRendering() {}

}
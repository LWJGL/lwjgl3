/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_VARJO_foveated_rendering">XR_VARJO_foveated_rendering</a> extension.
 * 
 * <p>Varjo headsets provide extremely high pixel density displays in the center area of the display, blended with a high density display covering the rest of the field of view. If the application has to provide a single image per eye, that would cover the entire field of view, at the highest density it would be extremely resource intensive, and in fact impossible for the most powerful desktop GPUs to render in real time. So instead Varjo introduced the {@link VARJOQuadViews XR_VARJO_quad_views} extension enabling the application to provide two separate images for the two screen areas, resulting in a significant reduction in processing, for pixels that could not even been seen.</p>
 * 
 * <p>This extension goes a step further by enabling the application to only generate the density that can be seen by the user, which is another big reduction compared to the density that can be displayed, using dedicated eye tracking.</p>
 * 
 * <p>This extension requires {@link VARJOQuadViews XR_VARJO_quad_views} extension to be enabled.</p>
 * 
 * <p>An application using this extension to enable foveated rendering will take the following steps to prepare:</p>
 * 
 * <ul>
 * <li>Enable {@link VARJOQuadViews XR_VARJO_quad_views} and {@link VARJOFoveatedRendering XR_VARJO_foveated_rendering} extensions.</li>
 * <li>Query system properties in order to determine if system supports foveated rendering.</li>
 * <li>Query texture sizes for foveated rendering.</li>
 * </ul>
 * 
 * <p>In the render loop, for each frame, an application using this extension <b>should</b></p>
 * 
 * <ul>
 * <li>Check if rendering gaze is available using {@link XR10#xrLocateSpace LocateSpace}.</li>
 * <li>Enable foveated rendering when {@link XR10#xrLocateViews LocateViews} is called.</li>
 * </ul>
 */
public final class VARJOFoveatedRendering {

    /** The extension specification version. */
    public static final int XR_VARJO_foveated_rendering_SPEC_VERSION = 3;

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
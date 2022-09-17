/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_KHR_composition_layer_cylinder">XR_KHR_composition_layer_cylinder</a> extension.
 * 
 * <p>This extension adds an additional layer type where the XR runtime <b>must</b> map a texture stemming from a swapchain onto the inside of a cylinder section. It can be imagined much the same way a curved television display looks to a viewer. This is not a projection type of layer but rather an object-in-world type of layer, similar to {@link XrCompositionLayerQuad}. Only the interior of the cylinder surface <b>must</b> be visible; the exterior of the cylinder is not visible and <b>must</b> not be drawn by the runtime.</p>
 * 
 * <p>The cylinder characteristics are specified by the following parameters:</p>
 * 
 * <pre><code>
 *      XrPosef           pose;
 *      float             radius;
 *      float             centralAngle;
 *      float             aspectRatio;</code></pre>
 * 
 * <p>These can be understood via the following diagram, which is a top-down view of a horizontally oriented cylinder. The aspect ratio drives how tall the cylinder will appear based on the other parameters. Typically the aspectRatio would be set to be the aspect ratio of the texture being used, so that it looks the same within the cylinder as it does in 2D.</p>
 * 
 * <ul>
 * <li><em>r</em> — Radius</li>
 * <li><em>a</em> — Central angle in <code>(0, 2π)</code></li>
 * <li><em>p</em> — Origin of pose transform</li>
 * <li><em>U</em>/<em>V</em> — UV coordinates</li>
 * </ul>
 */
public final class KHRCompositionLayerCylinder {

    /** The extension specification version. */
    public static final int XR_KHR_composition_layer_cylinder_SPEC_VERSION = 4;

    /** The extension name. */
    public static final String XR_KHR_COMPOSITION_LAYER_CYLINDER_EXTENSION_NAME = "XR_KHR_composition_layer_cylinder";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_COMPOSITION_LAYER_CYLINDER_KHR = 1000017000;

    private KHRCompositionLayerCylinder() {}

}
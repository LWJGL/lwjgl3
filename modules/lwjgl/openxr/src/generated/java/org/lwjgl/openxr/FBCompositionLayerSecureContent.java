/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_composition_layer_secure_content">XR_FB_composition_layer_secure_content</a> extension.
 * 
 * <p>This extension does not define a new composition layer type, but rather it provides support for the application to specify an existing composition layer type has secure content and whether it must be completely excluded from external outputs, like video or screen capture, or if proxy content must be rendered in its place.</p>
 * 
 * <p>In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into {@link XR10#xrCreateInstance CreateInstance} via the {@link XrInstanceCreateInfo}{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#extensions">extensions</a> section.</p>
 */
public final class FBCompositionLayerSecureContent {

    /** The extension specification version. */
    public static final int XR_FB_composition_layer_secure_content_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_COMPOSITION_LAYER_SECURE_CONTENT_EXTENSION_NAME = "XR_FB_composition_layer_secure_content";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_COMPOSITION_LAYER_SECURE_CONTENT_FB = 1000072000;

    /**
     * XrCompositionLayerSecureContentFlagBitsFB - XrCompositionLayerSecureContentFlagBitsFB
     * 
     * <h5>Flag Descriptions</h5>
     * 
     * <ul>
     * <li>{@link #XR_COMPOSITION_LAYER_SECURE_CONTENT_EXCLUDE_LAYER_BIT_FB COMPOSITION_LAYER_SECURE_CONTENT_EXCLUDE_LAYER_BIT_FB} — Indicates the layer will only be visible inside the HMD, and not visible to external sources</li>
     * <li>{@link #XR_COMPOSITION_LAYER_SECURE_CONTENT_REPLACE_LAYER_BIT_FB COMPOSITION_LAYER_SECURE_CONTENT_REPLACE_LAYER_BIT_FB} — Indicates the layer will be displayed inside the HMD, but replaced by proxy content when written to external sources</li>
     * </ul>
     */
    public static final int
        XR_COMPOSITION_LAYER_SECURE_CONTENT_EXCLUDE_LAYER_BIT_FB = 0x1,
        XR_COMPOSITION_LAYER_SECURE_CONTENT_REPLACE_LAYER_BIT_FB = 0x2;

    private FBCompositionLayerSecureContent() {}

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_composition_layer_image_layout">XR_FB_composition_layer_image_layout</a> extension.
 * 
 * <p>This extension does not define a new composition layer type, but rather it defines parameters that change the interpretation of the image layout, where the default image layout is dictated by the Graphics API.</p>
 * 
 * <p>In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into {@link XR10#xrCreateInstance CreateInstance} via the {@link XrInstanceCreateInfo}{@code ::enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#extensions">extensions</a> section.</p>
 */
public final class FBCompositionLayerImageLayout {

    /** The extension specification version. */
    public static final int XR_FB_composition_layer_image_layout_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_COMPOSITION_LAYER_IMAGE_LAYOUT_EXTENSION_NAME = "XR_FB_composition_layer_image_layout";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_COMPOSITION_LAYER_IMAGE_LAYOUT_FB = 1000040000;

    /** XrCompositionLayerImageLayoutFlagBitsFB - XrCompositionLayerImageLayoutFlagBitsFB */
    public static final int XR_COMPOSITION_LAYER_IMAGE_LAYOUT_VERTICAL_FLIP_BIT_FB = 0x1;

    private FBCompositionLayerImageLayout() {}

}
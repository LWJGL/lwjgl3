/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_FB_foveation_vulkan">XR_FB_foveation_vulkan</a> extension.
 * 
 * <p>The Vulkan graphics API requires an image to be applied to the swapchain to apply a foveation pattern.</p>
 * 
 * <p>This extension allows:</p>
 * 
 * <ul>
 * <li>An application to obtain foveation textures or constructs needed for foveated rendering in Vulkan.</li>
 * </ul>
 * 
 * <p>In order to enable the functionality of this extension, you <b>must</b> pass the name of the extension into {@link XR10#xrCreateInstance CreateInstance} via the {@link XrInstanceCreateInfo} {@code enabledExtensionNames} parameter as indicated in the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#extensions">extensions</a> section.</p>
 */
public final class FBFoveationVulkan {

    /** The extension specification version. */
    public static final int XR_FB_foveation_vulkan_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String XR_FB_FOVEATION_VULKAN_EXTENSION_NAME = "XR_FB_foveation_vulkan";

    /** Extends {@code XrStructureType}. */
    public static final int XR_TYPE_SWAPCHAIN_IMAGE_FOVEATION_VULKAN_FB = 1000160000;

    private FBFoveationVulkan() {}

}
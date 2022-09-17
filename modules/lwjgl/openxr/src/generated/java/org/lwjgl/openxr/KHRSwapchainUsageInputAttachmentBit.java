/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_KHR_swapchain_usage_input_attachment_bit">XR_KHR_swapchain_usage_input_attachment_bit</a> extension.
 * 
 * <p>This extension enables an application to specify that swapchain images should be created in a way so that they can be used as input attachments. At the time of writing this bit only affects Vulkan swapchains.</p>
 */
public final class KHRSwapchainUsageInputAttachmentBit {

    /** The extension specification version. */
    public static final int XR_KHR_swapchain_usage_input_attachment_bit_SPEC_VERSION = 3;

    /** The extension name. */
    public static final String XR_KHR_SWAPCHAIN_USAGE_INPUT_ATTACHMENT_BIT_EXTENSION_NAME = "XR_KHR_swapchain_usage_input_attachment_bit";

    /** Extends {@code XrSwapchainUsageFlagBits}. */
    public static final int XR_SWAPCHAIN_USAGE_INPUT_ATTACHMENT_BIT_KHR = 0x80;

    private KHRSwapchainUsageInputAttachmentBit() {}

}
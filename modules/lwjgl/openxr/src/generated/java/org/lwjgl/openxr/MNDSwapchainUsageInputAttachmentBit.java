/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

/**
 * The <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#XR_MND_swapchain_usage_input_attachment_bit">XR_MND_swapchain_usage_input_attachment_bit</a> extension.
 * 
 * <p>This extension enables an application to specify that swapchain images should be created in a way so that they can be used as input attachments. At the time of writing this bit only affects Vulkan swapchains.</p>
 */
public final class MNDSwapchainUsageInputAttachmentBit {

    /** The extension specification version. */
    public static final int XR_MND_swapchain_usage_input_attachment_bit_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String XR_MND_SWAPCHAIN_USAGE_INPUT_ATTACHMENT_BIT_EXTENSION_NAME = "XR_MND_swapchain_usage_input_attachment_bit";

    /** Extends {@code XrSwapchainUsageFlagBits}. */
    public static final int XR_SWAPCHAIN_USAGE_INPUT_ATTACHMENT_BIT_MND = 0x80;

    private MNDSwapchainUsageInputAttachmentBit() {}

}
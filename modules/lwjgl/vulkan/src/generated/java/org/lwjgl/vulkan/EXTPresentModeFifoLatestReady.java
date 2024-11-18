/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This device extension adds a new present mode, {@link #VK_PRESENT_MODE_FIFO_LATEST_READY_EXT PRESENT_MODE_FIFO_LATEST_READY_EXT}.
 * 
 * <p>This tear-free present mode behaves much like {@link KHRSurface#VK_PRESENT_MODE_FIFO_KHR PRESENT_MODE_FIFO_KHR}, except that each vertical blanking period dequeues consecutive present requests until the latest ready is found to update the current image.</p>
 * 
 * <p>While this seems similar in concept to {@link KHRSurface#VK_PRESENT_MODE_MAILBOX_KHR PRESENT_MODE_MAILBOX_KHR}, the fundamental difference is that the processing of the present requests is done during vblank. From the application perspective, this means for example, that in a flip-based model, a single vblank <b>may</b> cause multiple swapchain images to be released at once, while {@link KHRSurface#VK_PRESENT_MODE_MAILBOX_KHR PRESENT_MODE_MAILBOX_KHR} <b>may</b> continuously be releasing images as new requests become ready.</p>
 * 
 * <p>This additional present mode is useful when using a time-based present API.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_present_mode_fifo_latest_ready}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>362</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRSwapchain VK_KHR_swapchain}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Lionel Duc <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_present_mode_fifo_latest_ready]%20@nvlduc%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_present_mode_fifo_latest_ready%20extension*">nvlduc</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_present_mode_fifo_latest_ready.adoc">VK_EXT_present_mode_fifo_latest_ready</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2024-05-28</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>James Jones, NVIDIA</li>
 * <li>Lionel Duc, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTPresentModeFifoLatestReady {

    /** The extension specification version. */
    public static final int VK_EXT_PRESENT_MODE_FIFO_LATEST_READY_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_PRESENT_MODE_FIFO_LATEST_READY_EXTENSION_NAME = "VK_EXT_present_mode_fifo_latest_ready";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_MODE_FIFO_LATEST_READY_FEATURES_EXT = 1000361000;

    /** Extends {@code VkPresentModeKHR}. */
    public static final int VK_PRESENT_MODE_FIFO_LATEST_READY_EXT = 1000361000;

    private EXTPresentModeFifoLatestReady() {}

}
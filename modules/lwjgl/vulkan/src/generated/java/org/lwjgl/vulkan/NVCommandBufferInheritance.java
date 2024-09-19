/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows applications to take advantage of the graphics and compute state that remains valid in the queue between executions of submitted command buffers. This works across both primary and secondary command buffers.
 * 
 * <p>The state inherited includes the previously bound pipeline state, previously bound shader objects, previously bound vertex and index buffers, previously bound descriptor sets and push constants, and all previously set dynamic state.</p>
 * 
 * <p>This extension relaxes the requirement that all that state needs to be bound and set after begin command buffer and before the next draw or dispatch.</p>
 * 
 * <p>By not having to set state that has been inherited applications can save both CPU and GPU cycles by not having to set state redundantly, and also have improved flexibility when reusing secondary command buffers.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_command_buffer_inheritance}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>560</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Lujin Wang <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_command_buffer_inheritance]%20@lujinwangnv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_command_buffer_inheritance%20extension*">lujinwangnv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2024-02-15</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Daniel Story, Nintendo</li>
 * </ul></dd>
 * </dl>
 */
public final class NVCommandBufferInheritance {

    /** The extension specification version. */
    public static final int VK_NV_COMMAND_BUFFER_INHERITANCE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_COMMAND_BUFFER_INHERITANCE_EXTENSION_NAME = "VK_NV_command_buffer_inheritance";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMMAND_BUFFER_INHERITANCE_FEATURES_NV = 1000559000;

    private NVCommandBufferInheritance() {}

}
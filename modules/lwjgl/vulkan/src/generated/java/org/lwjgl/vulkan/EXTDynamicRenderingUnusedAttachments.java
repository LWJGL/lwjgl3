/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension lifts some restrictions in the {@link KHRDynamicRendering VK_KHR_dynamic_rendering} extension to allow render pass instances and bound pipelines within those render pass instances to have an unused attachment specified in one but not the other. It also allows pipelines to use different formats in a render pass as long the attachment is NULL.
 * 
 * <h5>VK_EXT_dynamic_rendering_unused_attachments</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_dynamic_rendering_unused_attachments}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>500</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}      or      <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.1">Version 1.1</a> and      {@link KHRDynamicRendering VK_KHR_dynamic_rendering}      or      <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.3">Version 1.3</a></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Piers Daniell <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_dynamic_rendering_unused_attachments]%20@pdaniell-nv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_dynamic_rendering_unused_attachments%20extension*">pdaniell-nv</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_dynamic_rendering_unused_attachments.adoc">VK_EXT_dynamic_rendering_unused_attachments</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-05-22</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Daniel Story, Nintendo</li>
 * <li>Hans-Kristian Arntzen, Valve</li>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * <li>James Fitzpatrick, Imagination Technologies</li>
 * <li>Pan Gao, Huawei Technologies</li>
 * <li>Ricardo Garcia, Igalia</li>
 * <li>Stu Smith, AMD</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTDynamicRenderingUnusedAttachments {

    /** The extension specification version. */
    public static final int VK_EXT_DYNAMIC_RENDERING_UNUSED_ATTACHMENTS_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_DYNAMIC_RENDERING_UNUSED_ATTACHMENTS_EXTENSION_NAME = "VK_EXT_dynamic_rendering_unused_attachments";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_UNUSED_ATTACHMENTS_FEATURES_EXT = 1000499000;

    private EXTDynamicRenderingUnusedAttachments() {}

}
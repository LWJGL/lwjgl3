/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * {@link KHRMaintenance7 VK_KHR_maintenance7} adds a collection of minor features, none of which would warrant an entire extension of their own.
 * 
 * <p>The proposed new features are as follows:</p>
 * 
 * <ul>
 * <li>Add a property query to determine if a framebuffer writes to depth or stencil aspect does not trigger a write access in the sibling aspect. For example, this allows sampling stencil aspect as a texture while rendering to the sibling depth attachment and vice-versa given appropriate image layouts.</li>
 * <li>Add a way to query information regarding the underlying devices in environments where the Vulkan implementation is provided through layered implementations. For example, running on Mesa/Venus, driver ID is returned as {@link VK12#VK_DRIVER_ID_MESA_VENUS DRIVER_ID_MESA_VENUS}, but it can be necessary to know what the real driver under the hood is. The new {@link VkPhysicalDeviceLayeredApiPropertiesKHR} structure can be used to gather information regarding layers underneath the top-level physical device.</li>
 * <li>Promote {@link EXTNestedCommandBuffer#VK_RENDERING_CONTENTS_INLINE_BIT_EXT RENDERING_CONTENTS_INLINE_BIT_EXT} and {@link EXTNestedCommandBuffer#VK_SUBPASS_CONTENTS_INLINE_AND_SECONDARY_COMMAND_BUFFERS_EXT SUBPASS_CONTENTS_INLINE_AND_SECONDARY_COMMAND_BUFFERS_EXT} to KHR</li>
 * <li>Add a limit to report the maximum total count of dynamic uniform buffers and dynamic storage buffers that can be included in a pipeline layout.</li>
 * <li>Require that for an unsigned integer query, the 32-bit result value <b>must</b> be equal to the 32 least significant bits of the equivalent 64-bit result value.</li>
 * <li>Add query for robust access support when using fragment shading rate attachments</li>
 * </ul>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_maintenance7}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>563</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#versions-1.1">Version 1.1</a></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Mike Blumenkrantz <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_maintenance7]%20@zmike%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_maintenance7%20extension*">zmike</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_maintenance7.adoc">VK_KHR_maintenance7</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2024-01-30</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Mike Blumenkrantz, Valve</li>
 * <li>Hans-Kristian Arntzen, Valve</li>
 * <li>Pan Gao, Huawei</li>
 * <li>Tobias Hector, AMD</li>
 * <li>Jon Leech, Khronos</li>
 * <li>Daniel Story, Nintendo</li>
 * <li>Shahbaz Youssefi, Google</li>
 * <li>Yiwei Zhang, Google</li>
 * <li>Matthew Netsch, Qualcomm</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRMaintenance7 {

    /** The extension specification version. */
    public static final int VK_KHR_MAINTENANCE_7_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_MAINTENANCE_7_EXTENSION_NAME = "VK_KHR_maintenance7";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_FEATURES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_VULKAN_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_VULKAN_PROPERTIES_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_FEATURES_KHR        = 1000562000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR      = 1000562001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR   = 1000562002,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR        = 1000562003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_VULKAN_PROPERTIES_KHR = 1000562004;

    /** Extends {@code VkSubpassContents}. */
    public static final int VK_SUBPASS_CONTENTS_INLINE_AND_SECONDARY_COMMAND_BUFFERS_KHR = 1000451000;

    /** Extends {@code VkRenderingFlagBits}. */
    public static final int VK_RENDERING_CONTENTS_INLINE_BIT_KHR = 0x10;

    /**
     * VkPhysicalDeviceLayeredApiKHR - API implemented by the layered implementation
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_PHYSICAL_DEVICE_LAYERED_API_VULKAN_KHR PHYSICAL_DEVICE_LAYERED_API_VULKAN_KHR} - the device implements the Vulkan API.</li>
     * <li>{@link #VK_PHYSICAL_DEVICE_LAYERED_API_D3D12_KHR PHYSICAL_DEVICE_LAYERED_API_D3D12_KHR} - the device implements the D3D12 API.</li>
     * <li>{@link #VK_PHYSICAL_DEVICE_LAYERED_API_METAL_KHR PHYSICAL_DEVICE_LAYERED_API_METAL_KHR} - the device implements the Metal API.</li>
     * <li>{@link #VK_PHYSICAL_DEVICE_LAYERED_API_OPENGL_KHR PHYSICAL_DEVICE_LAYERED_API_OPENGL_KHR} - the device implements the OpenGL API.</li>
     * <li>{@link #VK_PHYSICAL_DEVICE_LAYERED_API_OPENGLES_KHR PHYSICAL_DEVICE_LAYERED_API_OPENGLES_KHR} - the device implements the OpenGL ES API.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDeviceLayeredApiPropertiesKHR}</p>
     */
    public static final int
        VK_PHYSICAL_DEVICE_LAYERED_API_VULKAN_KHR   = 0,
        VK_PHYSICAL_DEVICE_LAYERED_API_D3D12_KHR    = 1,
        VK_PHYSICAL_DEVICE_LAYERED_API_METAL_KHR    = 2,
        VK_PHYSICAL_DEVICE_LAYERED_API_OPENGL_KHR   = 3,
        VK_PHYSICAL_DEVICE_LAYERED_API_OPENGLES_KHR = 4;

    private KHRMaintenance7() {}

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * The {@code VK_KHR_shader_float_controls} extension enables efficient use of floating-point computations through the ability to query and override the implementation’s default behavior for rounding modes, denormals, signed zero, and infinity.
 * 
 * <h5>Promotion to Vulkan 1.2</h5>
 * 
 * <p>All functionality in this extension is included in core Vulkan 1.2, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <h5>VK_KHR_shader_float_controls</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_shader_float_controls}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>198</dd>
 * <dt><b>Revision</b></dt>
 * <dd>4</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.2-promotions">Vulkan 1.2</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Alexander Galazin <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_shader_float_controls]%20@alegal-arm%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_shader_float_controls%20extension%3E%3E">alegal-arm</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-09-11</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Promoted to Vulkan 1.2 Core</li>
 * <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_float_controls.html">{@code SPV_KHR_float_controls}</a></li>
 * </ul></dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Alexander Galazin, Arm</li>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Graeme Leese, Broadcom</li>
 * <li>Daniel Rakos, AMD</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRShaderFloatControls {

    /** The extension specification version. */
    public static final int VK_KHR_SHADER_FLOAT_CONTROLS_SPEC_VERSION = 4;

    /** The extension name. */
    public static final String VK_KHR_SHADER_FLOAT_CONTROLS_EXTENSION_NAME = "VK_KHR_shader_float_controls";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT_CONTROLS_PROPERTIES_KHR = 1000197000;

    /**
     * Extends {@code VkShaderFloatControlsIndependence}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY_KHR SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY_KHR}</li>
     * <li>{@link #VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL_KHR SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL_KHR}</li>
     * <li>{@link #VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE_KHR SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE_KHR}</li>
     * </ul>
     */
    public static final int
        VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY_KHR = 0,
        VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL_KHR         = 1,
        VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE_KHR        = 2;

    private KHRShaderFloatControls() {}

}
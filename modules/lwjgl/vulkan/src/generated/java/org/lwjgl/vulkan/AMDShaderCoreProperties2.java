/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension exposes additional shader core properties for a target physical device through the {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} extension.
 * 
 * <h5>Examples</h5>
 * 
 * <p>None.</p>
 * 
 * <h5>VK_AMD_shader_core_properties2</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_AMD_shader_core_properties2}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>228</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link AMDShaderCoreProperties VK_AMD_shader_core_properties}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Matthaeus G. Chajdas <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_AMD_shader_core_properties2]%20@anteru%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_AMD_shader_core_properties2%20extension%3E%3E">anteru</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-07-26</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Matthaeus G. Chajdas, AMD</li>
 * <li>Tobias Hector, AMD</li>
 * </ul></dd>
 * </dl>
 */
public final class AMDShaderCoreProperties2 {

    /** The extension specification version. */
    public static final int VK_AMD_SHADER_CORE_PROPERTIES_2_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_AMD_SHADER_CORE_PROPERTIES_2_EXTENSION_NAME = "VK_AMD_shader_core_properties2";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_2_AMD = 1000227000;

    private AMDShaderCoreProperties2() {}

}
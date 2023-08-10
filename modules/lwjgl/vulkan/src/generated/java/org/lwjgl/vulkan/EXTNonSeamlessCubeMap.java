/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension provides functionality to disable <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-cubemapedge">cube map edge handling</a> on a per sampler level which matches the behavior of other graphics APIs.
 * 
 * <p>This extension may be useful for building translation layers for those APIs or for porting applications that rely on this cube map behavior.</p>
 * 
 * <h5>VK_EXT_non_seamless_cube_map</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_non_seamless_cube_map}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>423</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>
 * <dt><b>Special Uses</b></dt>
 * <dd><ul>
 * <li><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#extendingvulkan-compatibility-specialuse">D3D support</a></li>
 * <li><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#extendingvulkan-compatibility-specialuse">OpenGL / ES support</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Georg Lehmann <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_non_seamless_cube_map]%20@DadSchoorse%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_non_seamless_cube_map%20extension*">DadSchoorse</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_non_seamless_cube_map.adoc">VK_EXT_non_seamless_cube_map</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-09-04</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Georg Lehmann</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTNonSeamlessCubeMap {

    /** The extension specification version. */
    public static final int VK_EXT_NON_SEAMLESS_CUBE_MAP_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_NON_SEAMLESS_CUBE_MAP_EXTENSION_NAME = "VK_EXT_non_seamless_cube_map";

    /** Extends {@code VkSamplerCreateFlagBits}. */
    public static final int VK_SAMPLER_CREATE_NON_SEAMLESS_CUBE_MAP_BIT_EXT = 0x4;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_NON_SEAMLESS_CUBE_MAP_FEATURES_EXT = 1000422000;

    private EXTNonSeamlessCubeMap() {}

}
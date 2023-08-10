/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension provides the ability to determine device-specific performance properties of Arm GPUs.
 * 
 * <p>It exposes properties for the number of texel, pixel, and fused multiply-add operations per clock per shader core. This can be used in combination with the {@link ARMShaderCoreBuiltins VK_ARM_shader_core_builtins} extension that provides the ability to query the number of shader cores on the physical device.</p>
 * 
 * <h5>VK_ARM_shader_core_properties</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_ARM_shader_core_properties}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>416</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.1">Version 1.1</a></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jan-Harald Fredriksen <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_ARM_shader_core_properties]%20@janharaldfredriksen-arm%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_ARM_shader_core_properties%20extension*">janharaldfredriksen-arm</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-02-07</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jan-Harald Fredriksen, Arm Ltd.</li>
 * </ul></dd>
 * </dl>
 */
public final class ARMShaderCoreProperties {

    /** The extension specification version. */
    public static final int VK_ARM_SHADER_CORE_PROPERTIES_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_ARM_SHADER_CORE_PROPERTIES_EXTENSION_NAME = "VK_ARM_shader_core_properties";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_ARM = 1000415000;

    private ARMShaderCoreProperties() {}

}
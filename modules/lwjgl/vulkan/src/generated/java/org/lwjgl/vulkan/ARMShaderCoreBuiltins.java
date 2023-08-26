/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension provides the ability to determine device-specific properties on Arm GPUs. It exposes properties for the number of shader cores, the maximum number of warps that can run on a shader core, and shader builtins to enable invocations to identify which core and warp a shader invocation is executing on.
 * 
 * <p>This extension enables support for the SPIR-V {@code CoreBuiltinsARM} capability.</p>
 * 
 * <p>These properties and built-ins can be used for debugging or performance optimisation purposes. A typical optimisation example would be to use {@code CoreIDARM} to select a per-shader-core instance of a data structure in algorithms that use atomics so as to reduce contention.</p>
 * 
 * <h5>VK_ARM_shader_core_builtins</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_ARM_shader_core_builtins}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>498</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Kevin Petit <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_ARM_shader_core_builtins]%20@kpet%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_ARM_shader_core_builtins%20extension*">kpet</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-10-05</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/ARM/SPV_ARM_core_builtins.html">{@code SPV_ARM_core_builtins}</a>.</li>
 * <li>This extension provides API support for <a href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/arm/GLSL_ARM_shader_core_builtins.txt">{@code GL_ARM_shader_core_builtins}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Kevin Petit, Arm Ltd.</li>
 * <li>Jan-Harald Fredriksen, Arm Ltd.</li>
 * </ul></dd>
 * </dl>
 */
public final class ARMShaderCoreBuiltins {

    /** The extension specification version. */
    public static final int VK_ARM_SHADER_CORE_BUILTINS_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_ARM_SHADER_CORE_BUILTINS_EXTENSION_NAME = "VK_ARM_shader_core_builtins";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_FEATURES_ARM}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_FEATURES_ARM   = 1000497000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM = 1000497001;

    private ARMShaderCoreBuiltins() {}

}
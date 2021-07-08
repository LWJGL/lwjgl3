/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds Vulkan support for the <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_terminate_invocation.html">{@code SPV_KHR_terminate_invocation}</a> SPIR-V extension. That SPIR-V extension provides a new instruction, {@code OpTerminateInvocation}, which causes a shader invocation to immediately terminate and sets the coverage of shaded samples to 0; only previously executed instructions will have observable effects. The {@code OpTerminateInvocation} instruction, along with the {@code OpDemoteToHelperInvocation} instruction from the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VK_EXT_shader_demote_to_helper_invocation">VK_EXT_shader_demote_to_helper_invocation</a> extension, together replace the {@code OpKill} instruction, which could behave like either of these instructions. {@code OpTerminateInvocation} provides the behavior required by the GLSL {@code discard} statement, and should be used when available by GLSL compilers and applications that need the GLSL {@code discard} behavior.
 * 
 * <h5>VK_KHR_shader_terminate_invocation</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_shader_terminate_invocation}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>216</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jesse Hall <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_shader_terminate_invocation:%20&amp;body=@critsec%20">critsec</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2020-08-11</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires the <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_terminate_invocation.html">{@code SPV_KHR_terminate_invocation}</a> SPIR-V extension.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Alan Baker, Google</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Jesse Hall, Google</li>
 * <li>Ralph Potter, Samsung</li>
 * <li>Tom Olson, Arm</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRShaderTerminateInvocation {

    /** The extension specification version. */
    public static final int VK_KHR_SHADER_TERMINATE_INVOCATION_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_SHADER_TERMINATE_INVOCATION_EXTENSION_NAME = "VK_KHR_shader_terminate_invocation";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TERMINATE_INVOCATION_FEATURES_KHR = 1000215000;

    private KHRShaderTerminateInvocation() {}

}
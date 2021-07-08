/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a global memory barrier.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-memory">memory dependency</a> affecting all device memory.</p>
 * 
 * <p>The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> described by this structure include only operations and memory accesses specified by {@code srcStageMask} and {@code srcAccessMask}.</p>
 * 
 * <p>The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> described by this structure include only operations and memory accesses specified by {@code dstStageMask} and {@code dstAccessMask}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSynchronization2#VK_STRUCTURE_TYPE_MEMORY_BARRIER_2_KHR STRUCTURE_TYPE_MEMORY_BARRIER_2_KHR}</li>
 * <li>{@code srcStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2KHR} values</li>
 * <li>{@code srcAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits2KHR} values</li>
 * <li>{@code dstStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2KHR} values</li>
 * <li>{@code dstAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits2KHR} values</li>
 * </ul>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-geometryShader">geometry shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-tessellationShader">tessellation shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR} or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-conditionalRendering">conditional rendering</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-fragmentDensityMap">fragment density map</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-transformFeedback">transform feedback</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-meshShader">mesh shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV PIPELINE_STAGE_2_MESH_SHADER_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-taskShader">task shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV PIPELINE_STAGE_2_TASK_SHADER_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-shadingRateImage">shading rate image</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_INDEX_READ_BIT_KHR ACCESS_2_INDEX_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_UNIFORM_READ_BIT_KHR ACCESS_2_UNIFORM_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_SHADER_STORAGE_READ_BIT_KHR ACCESS_2_SHADER_STORAGE_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_SHADER_READ_BIT_KHR ACCESS_2_SHADER_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_SHADER_WRITE_BIT_KHR ACCESS_2_SHADER_WRITE_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR} {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR} {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_TRANSFER_READ_BIT_KHR ACCESS_2_TRANSFER_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_COPY_BIT_KHR PIPELINE_STAGE_2_COPY_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_BLIT_BIT_KHR PIPELINE_STAGE_2_BLIT_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_RESOLVE_BIT_KHR PIPELINE_STAGE_2_RESOLVE_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_TRANSFER_WRITE_BIT_KHR ACCESS_2_TRANSFER_WRITE_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_COPY_BIT_KHR PIPELINE_STAGE_2_COPY_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_BLIT_BIT_KHR PIPELINE_STAGE_2_BLIT_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_RESOLVE_BIT_KHR PIPELINE_STAGE_2_RESOLVE_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_CLEAR_BIT_KHR PIPELINE_STAGE_2_CLEAR_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_HOST_READ_BIT_KHR ACCESS_2_HOST_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_HOST_BIT_KHR PIPELINE_STAGE_2_HOST_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_HOST_WRITE_BIT_KHR ACCESS_2_HOST_WRITE_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_HOST_BIT_KHR PIPELINE_STAGE_2_HOST_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV} or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV} or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR} {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR} or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * </ul>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-geometryShader">geometry shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-tessellationShader">tessellation shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR} or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-conditionalRendering">conditional rendering</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-fragmentDensityMap">fragment density map</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-transformFeedback">transform feedback</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-meshShader">mesh shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV PIPELINE_STAGE_2_MESH_SHADER_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-taskShader">task shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV PIPELINE_STAGE_2_TASK_SHADER_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-shadingRateImage">shading rate image</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_INDEX_READ_BIT_KHR ACCESS_2_INDEX_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_UNIFORM_READ_BIT_KHR ACCESS_2_UNIFORM_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_SHADER_STORAGE_READ_BIT_KHR ACCESS_2_SHADER_STORAGE_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_SHADER_READ_BIT_KHR ACCESS_2_SHADER_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_SHADER_WRITE_BIT_KHR ACCESS_2_SHADER_WRITE_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR} {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR} {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_TRANSFER_READ_BIT_KHR ACCESS_2_TRANSFER_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_COPY_BIT_KHR PIPELINE_STAGE_2_COPY_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_BLIT_BIT_KHR PIPELINE_STAGE_2_BLIT_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_RESOLVE_BIT_KHR PIPELINE_STAGE_2_RESOLVE_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_TRANSFER_WRITE_BIT_KHR ACCESS_2_TRANSFER_WRITE_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_COPY_BIT_KHR PIPELINE_STAGE_2_COPY_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_BLIT_BIT_KHR PIPELINE_STAGE_2_BLIT_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_RESOLVE_BIT_KHR PIPELINE_STAGE_2_RESOLVE_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_CLEAR_BIT_KHR PIPELINE_STAGE_2_CLEAR_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_HOST_READ_BIT_KHR ACCESS_2_HOST_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_HOST_BIT_KHR PIPELINE_STAGE_2_HOST_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_HOST_WRITE_BIT_KHR ACCESS_2_HOST_WRITE_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_HOST_BIT_KHR PIPELINE_STAGE_2_HOST_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV} or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV} or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR} {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR}, or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * <li>If pname:{accessMaskName} includes {@link KHRSynchronization2#VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR}, pname:{stageMaskName} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR} or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDependencyInfoKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMemoryBarrier2KHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineStageFlags2KHR {@link #srcStageMask};
 *     VkAccessFlags2KHR {@link #srcAccessMask};
 *     VkPipelineStageFlags2KHR {@link #dstStageMask};
 *     VkAccessFlags2KHR dstAccessMask;
 * }</code></pre>
 */
public class VkMemoryBarrier2KHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCSTAGEMASK,
        SRCACCESSMASK,
        DSTSTAGEMASK,
        DSTACCESSMASK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSTAGEMASK = layout.offsetof(2);
        SRCACCESSMASK = layout.offsetof(3);
        DSTSTAGEMASK = layout.offsetof(4);
        DSTACCESSMASK = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkMemoryBarrier2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryBarrier2KHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkPipelineStageFlags2KHR} mask of pipeline stages to be included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-scopes">first synchronization scope</a>. */
    @NativeType("VkPipelineStageFlags2KHR")
    public int srcStageMask() { return nsrcStageMask(address()); }
    /** a {@code VkAccessFlags2KHR} mask of pipeline <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">first access scope</a>. */
    @NativeType("VkAccessFlags2KHR")
    public int srcAccessMask() { return nsrcAccessMask(address()); }
    /**
     * a {@code VkPipelineStageFlags2KHR} mask of pipeline stages to be included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-scopes">second synchronization scope</a>.
     * 
     * <p>a {@code VkAccessFlags2KHR} mask of pipeline <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">second access scope</a>.</p>
     */
    @NativeType("VkPipelineStageFlags2KHR")
    public int dstStageMask() { return ndstStageMask(address()); }
    /** @return the value of the {@code dstAccessMask} field. */
    @NativeType("VkAccessFlags2KHR")
    public int dstAccessMask() { return ndstAccessMask(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMemoryBarrier2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMemoryBarrier2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #srcStageMask} field. */
    public VkMemoryBarrier2KHR srcStageMask(@NativeType("VkPipelineStageFlags2KHR") int value) { nsrcStageMask(address(), value); return this; }
    /** Sets the specified value to the {@link #srcAccessMask} field. */
    public VkMemoryBarrier2KHR srcAccessMask(@NativeType("VkAccessFlags2KHR") int value) { nsrcAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@link #dstStageMask} field. */
    public VkMemoryBarrier2KHR dstStageMask(@NativeType("VkPipelineStageFlags2KHR") int value) { ndstStageMask(address(), value); return this; }
    /** Sets the specified value to the {@code dstAccessMask} field. */
    public VkMemoryBarrier2KHR dstAccessMask(@NativeType("VkAccessFlags2KHR") int value) { ndstAccessMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryBarrier2KHR set(
        int sType,
        long pNext,
        int srcStageMask,
        int srcAccessMask,
        int dstStageMask,
        int dstAccessMask
    ) {
        sType(sType);
        pNext(pNext);
        srcStageMask(srcStageMask);
        srcAccessMask(srcAccessMask);
        dstStageMask(dstStageMask);
        dstAccessMask(dstAccessMask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryBarrier2KHR set(VkMemoryBarrier2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryBarrier2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryBarrier2KHR malloc() {
        return wrap(VkMemoryBarrier2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkMemoryBarrier2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryBarrier2KHR calloc() {
        return wrap(VkMemoryBarrier2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkMemoryBarrier2KHR} instance allocated with {@link BufferUtils}. */
    public static VkMemoryBarrier2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkMemoryBarrier2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryBarrier2KHR} instance for the specified memory address. */
    public static VkMemoryBarrier2KHR create(long address) {
        return wrap(VkMemoryBarrier2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryBarrier2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkMemoryBarrier2KHR.class, address);
    }

    /**
     * Returns a new {@link VkMemoryBarrier2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryBarrier2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryBarrier2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryBarrier2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryBarrier2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryBarrier2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkMemoryBarrier2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryBarrier2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryBarrier2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryBarrier2KHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkMemoryBarrier2KHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkMemoryBarrier2KHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkMemoryBarrier2KHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkMemoryBarrier2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryBarrier2KHR mallocStack(MemoryStack stack) {
        return wrap(VkMemoryBarrier2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkMemoryBarrier2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryBarrier2KHR callocStack(MemoryStack stack) {
        return wrap(VkMemoryBarrier2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryBarrier2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryBarrier2KHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMemoryBarrier2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryBarrier2KHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkMemoryBarrier2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryBarrier2KHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryBarrier2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryBarrier2KHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMemoryBarrier2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryBarrier2KHR.PNEXT); }
    /** Unsafe version of {@link #srcStageMask}. */
    public static int nsrcStageMask(long struct) { return UNSAFE.getInt(null, struct + VkMemoryBarrier2KHR.SRCSTAGEMASK); }
    /** Unsafe version of {@link #srcAccessMask}. */
    public static int nsrcAccessMask(long struct) { return UNSAFE.getInt(null, struct + VkMemoryBarrier2KHR.SRCACCESSMASK); }
    /** Unsafe version of {@link #dstStageMask}. */
    public static int ndstStageMask(long struct) { return UNSAFE.getInt(null, struct + VkMemoryBarrier2KHR.DSTSTAGEMASK); }
    /** Unsafe version of {@link #dstAccessMask}. */
    public static int ndstAccessMask(long struct) { return UNSAFE.getInt(null, struct + VkMemoryBarrier2KHR.DSTACCESSMASK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryBarrier2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryBarrier2KHR.PNEXT, value); }
    /** Unsafe version of {@link #srcStageMask(int) srcStageMask}. */
    public static void nsrcStageMask(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryBarrier2KHR.SRCSTAGEMASK, value); }
    /** Unsafe version of {@link #srcAccessMask(int) srcAccessMask}. */
    public static void nsrcAccessMask(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryBarrier2KHR.SRCACCESSMASK, value); }
    /** Unsafe version of {@link #dstStageMask(int) dstStageMask}. */
    public static void ndstStageMask(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryBarrier2KHR.DSTSTAGEMASK, value); }
    /** Unsafe version of {@link #dstAccessMask(int) dstAccessMask}. */
    public static void ndstAccessMask(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryBarrier2KHR.DSTACCESSMASK, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryBarrier2KHR} structs. */
    public static class Buffer extends StructBuffer<VkMemoryBarrier2KHR, Buffer> implements NativeResource {

        private static final VkMemoryBarrier2KHR ELEMENT_FACTORY = VkMemoryBarrier2KHR.create(-1L);

        /**
         * Creates a new {@code VkMemoryBarrier2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryBarrier2KHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkMemoryBarrier2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMemoryBarrier2KHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryBarrier2KHR.nsType(address()); }
        /** @return the value of the {@link VkMemoryBarrier2KHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryBarrier2KHR.npNext(address()); }
        /** @return the value of the {@link VkMemoryBarrier2KHR#srcStageMask} field. */
        @NativeType("VkPipelineStageFlags2KHR")
        public int srcStageMask() { return VkMemoryBarrier2KHR.nsrcStageMask(address()); }
        /** @return the value of the {@link VkMemoryBarrier2KHR#srcAccessMask} field. */
        @NativeType("VkAccessFlags2KHR")
        public int srcAccessMask() { return VkMemoryBarrier2KHR.nsrcAccessMask(address()); }
        /** @return the value of the {@link VkMemoryBarrier2KHR#dstStageMask} field. */
        @NativeType("VkPipelineStageFlags2KHR")
        public int dstStageMask() { return VkMemoryBarrier2KHR.ndstStageMask(address()); }
        /** @return the value of the {@code dstAccessMask} field. */
        @NativeType("VkAccessFlags2KHR")
        public int dstAccessMask() { return VkMemoryBarrier2KHR.ndstAccessMask(address()); }

        /** Sets the specified value to the {@link VkMemoryBarrier2KHR#sType} field. */
        public VkMemoryBarrier2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryBarrier2KHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryBarrier2KHR#pNext} field. */
        public VkMemoryBarrier2KHR.Buffer pNext(@NativeType("void const *") long value) { VkMemoryBarrier2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryBarrier2KHR#srcStageMask} field. */
        public VkMemoryBarrier2KHR.Buffer srcStageMask(@NativeType("VkPipelineStageFlags2KHR") int value) { VkMemoryBarrier2KHR.nsrcStageMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryBarrier2KHR#srcAccessMask} field. */
        public VkMemoryBarrier2KHR.Buffer srcAccessMask(@NativeType("VkAccessFlags2KHR") int value) { VkMemoryBarrier2KHR.nsrcAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryBarrier2KHR#dstStageMask} field. */
        public VkMemoryBarrier2KHR.Buffer dstStageMask(@NativeType("VkPipelineStageFlags2KHR") int value) { VkMemoryBarrier2KHR.ndstStageMask(address(), value); return this; }
        /** Sets the specified value to the {@code dstAccessMask} field. */
        public VkMemoryBarrier2KHR.Buffer dstAccessMask(@NativeType("VkAccessFlags2KHR") int value) { VkMemoryBarrier2KHR.ndstAccessMask(address(), value); return this; }

    }

}
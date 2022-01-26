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
 * Structure specifying a buffer memory barrier.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-memory">memory dependency</a> limited to a range of a buffer, and <b>can</b> define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family transfer operation</a> for that range.</p>
 * 
 * <p>The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> described by this structure include only operations and memory accesses specified by {@code srcStageMask} and {@code srcAccessMask}.</p>
 * 
 * <p>The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> described by this structure include only operations and memory accesses specified by {@code dstStageMask} and {@code dstAccessMask}.</p>
 * 
 * <p>Both <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scopes</a> are limited to only memory accesses to {@code buffer} in the range defined by {@code offset} and {@code size}.</p>
 * 
 * <p>If {@code buffer} was created with {@link VK10#VK_SHARING_MODE_EXCLUSIVE SHARING_MODE_EXCLUSIVE}, and {@code srcQueueFamilyIndex} is not equal to {@code dstQueueFamilyIndex}, this memory barrier defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family transfer operation</a>. When executed on a queue in the family identified by {@code srcQueueFamilyIndex}, this barrier defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers-release">queue family release operation</a> for the specified buffer range, and the second synchronization and access scopes do not synchronize operations on that queue. When executed on a queue in the family identified by {@code dstQueueFamilyIndex}, this barrier defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers-acquire">queue family acquire operation</a> for the specified buffer range, and the first synchronization and access scopes do not synchronize operations on that queue.</p>
 * 
 * <p>A <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family transfer operation</a> is also defined if the values are not equal, and either is one of the special queue family values reserved for external memory ownership transfers, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">Queue Family Ownership Transfer</a>. A <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers-release">queue family release operation</a> is defined when {@code dstQueueFamilyIndex} is one of those values, and a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers-acquire">queue family acquire operation</a> is defined when {@code srcQueueFamilyIndex} is one of those values.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-geometryShader">geometry shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link VK13#VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link VK13#VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT} or {@link VK13#VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-conditionalRendering">conditional rendering</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-fragmentDensityMap">fragment density map</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-transformFeedback">transform feedback</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-meshShader">mesh shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV PIPELINE_STAGE_2_MESH_SHADER_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-taskShader">task shaders</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV PIPELINE_STAGE_2_TASK_SHADER_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-shadingRateImage">shading rate image</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-subpassShading">subpass shading</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link HUAWEISubpassShading#VK_PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-invocationMask">invocation mask image</a> feature is not enabled, {@code srcStageMask} <b>must</b> not contain {@link HUAWEIInvocationMask#VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI}</li>
 * <li>If {@code srcAccessMask} includes {@link VK13#VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT ACCESS_2_INDIRECT_COMMAND_READ_BIT}, {@code srcStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT PIPELINE_STAGE_2_DRAW_INDIRECT_BIT}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code srcAccessMask} includes {@link VK13#VK_ACCESS_2_INDEX_READ_BIT ACCESS_2_INDEX_READ_BIT}, {@code srcStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT PIPELINE_STAGE_2_INDEX_INPUT_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT PIPELINE_STAGE_2_VERTEX_INPUT_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code srcAccessMask} includes {@link VK13#VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT}, {@code srcStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT PIPELINE_STAGE_2_VERTEX_INPUT_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code srcAccessMask} includes {@link VK13#VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT ACCESS_2_INPUT_ATTACHMENT_READ_BIT}, {@code srcStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT}, {@link HUAWEISubpassShading#VK_PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code srcAccessMask} includes {@link VK13#VK_ACCESS_2_UNIFORM_READ_BIT ACCESS_2_UNIFORM_READ_BIT}, {@code srcStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If {@code srcAccessMask} includes {@link VK13#VK_ACCESS_2_SHADER_SAMPLED_READ_BIT ACCESS_2_SHADER_SAMPLED_READ_BIT}, {@code srcStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If {@code srcAccessMask} includes {@link VK13#VK_ACCESS_2_SHADER_STORAGE_READ_BIT ACCESS_2_SHADER_STORAGE_READ_BIT}, {@code srcStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If {@code srcAccessMask} includes {@link VK13#VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT ACCESS_2_SHADER_STORAGE_WRITE_BIT}, {@code srcStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If {@code srcAccessMask} includes {@link VK13#VK_ACCESS_2_SHADER_READ_BIT ACCESS_2_SHADER_READ_BIT}, {@code srcStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If {@code srcAccessMask} includes {@link VK13#VK_ACCESS_2_SHADER_WRITE_BIT ACCESS_2_SHADER_WRITE_BIT}, {@code srcStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If {@code srcAccessMask} includes {@link VK13#VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT ACCESS_2_COLOR_ATTACHMENT_READ_BIT}, {@code srcStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT} {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code srcAccessMask} includes {@link VK13#VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT}, {@code srcStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT} {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code srcAccessMask} includes {@link VK13#VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT}, {@code srcStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code srcAccessMask} includes {@link VK13#VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT}, {@code srcStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code srcAccessMask} includes {@link VK13#VK_ACCESS_2_TRANSFER_READ_BIT ACCESS_2_TRANSFER_READ_BIT}, {@code srcStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_COPY_BIT PIPELINE_STAGE_2_COPY_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_BLIT_BIT PIPELINE_STAGE_2_BLIT_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_RESOLVE_BIT PIPELINE_STAGE_2_RESOLVE_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT PIPELINE_STAGE_2_ALL_TRANSFER_BIT}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code srcAccessMask} includes {@link VK13#VK_ACCESS_2_TRANSFER_WRITE_BIT ACCESS_2_TRANSFER_WRITE_BIT}, {@code srcStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_COPY_BIT PIPELINE_STAGE_2_COPY_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_BLIT_BIT PIPELINE_STAGE_2_BLIT_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_RESOLVE_BIT PIPELINE_STAGE_2_RESOLVE_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_CLEAR_BIT PIPELINE_STAGE_2_CLEAR_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT PIPELINE_STAGE_2_ALL_TRANSFER_BIT}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code srcAccessMask} includes {@link VK13#VK_ACCESS_2_HOST_READ_BIT ACCESS_2_HOST_READ_BIT}, {@code srcStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_HOST_BIT PIPELINE_STAGE_2_HOST_BIT}</li>
 * <li>If {@code srcAccessMask} includes {@link VK13#VK_ACCESS_2_HOST_WRITE_BIT ACCESS_2_HOST_WRITE_BIT}, {@code srcStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_HOST_BIT PIPELINE_STAGE_2_HOST_BIT}</li>
 * <li>If {@code srcAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT}, {@code srcStageMask} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code srcAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT}, {@code srcStageMask} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code srcAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT}, {@code srcStageMask} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code srcAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT}, {@code srcStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT PIPELINE_STAGE_2_DRAW_INDIRECT_BIT}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code srcAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT}, {@code srcStageMask} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code srcAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV}, {@code srcStageMask} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code srcAccessMask} includes {@link HUAWEIInvocationMask#VK_ACCESS_2_INVOCATION_MASK_READ_BIT_HUAWEI ACCESS_2_INVOCATION_MASK_READ_BIT_HUAWEI}, {@code srcStageMask} <b>must</b> include {@link HUAWEIInvocationMask#VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI}</li>
 * <li>If {@code srcAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV}, {@code srcStageMask} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV} or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code srcAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV}, {@code srcStageMask} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV} or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code srcAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT}, {@code srcStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT} {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code srcAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR}, {@code srcStageMask} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If {@code srcAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR}, {@code srcStageMask} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR} or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-rayQuery">{@code rayQuery}</a> is not enabled and {@code srcAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR}, {@code srcStageMask} <b>must</b> not include any of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages except {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR}</li>
 * <li>If {@code srcAccessMask} includes {@link KHRVideoDecodeQueue#VK_ACCESS_2_VIDEO_DECODE_READ_BIT_KHR ACCESS_2_VIDEO_DECODE_READ_BIT_KHR}, {@code srcStageMask} <b>must</b> include {@link KHRVideoDecodeQueue#VK_PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR}</li>
 * <li>If {@code srcAccessMask} includes {@link KHRVideoDecodeQueue#VK_ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR}, {@code srcStageMask} <b>must</b> include {@link KHRVideoDecodeQueue#VK_PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR}</li>
 * <li>If {@code srcAccessMask} includes {@link KHRVideoEncodeQueue#VK_ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR}, {@code srcStageMask} <b>must</b> include {@link KHRVideoEncodeQueue#VK_PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR}</li>
 * <li>If {@code srcAccessMask} includes {@link KHRVideoEncodeQueue#VK_ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR}, {@code srcStageMask} <b>must</b> include {@link KHRVideoEncodeQueue#VK_PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR}</li>
 * </ul>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-geometryShader">geometry shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link VK13#VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link VK13#VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT} or {@link VK13#VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-conditionalRendering">conditional rendering</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-fragmentDensityMap">fragment density map</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-transformFeedback">transform feedback</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-meshShader">mesh shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV PIPELINE_STAGE_2_MESH_SHADER_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-taskShader">task shaders</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV PIPELINE_STAGE_2_TASK_SHADER_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-shadingRateImage">shading rate image</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-subpassShading">subpass shading</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link HUAWEISubpassShading#VK_PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-invocationMask">invocation mask image</a> feature is not enabled, {@code dstStageMask} <b>must</b> not contain {@link HUAWEIInvocationMask#VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI}</li>
 * <li>If {@code dstAccessMask} includes {@link VK13#VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT ACCESS_2_INDIRECT_COMMAND_READ_BIT}, {@code dstStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT PIPELINE_STAGE_2_DRAW_INDIRECT_BIT}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code dstAccessMask} includes {@link VK13#VK_ACCESS_2_INDEX_READ_BIT ACCESS_2_INDEX_READ_BIT}, {@code dstStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT PIPELINE_STAGE_2_INDEX_INPUT_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT PIPELINE_STAGE_2_VERTEX_INPUT_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code dstAccessMask} includes {@link VK13#VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT}, {@code dstStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT PIPELINE_STAGE_2_VERTEX_INPUT_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code dstAccessMask} includes {@link VK13#VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT ACCESS_2_INPUT_ATTACHMENT_READ_BIT}, {@code dstStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT}, {@link HUAWEISubpassShading#VK_PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code dstAccessMask} includes {@link VK13#VK_ACCESS_2_UNIFORM_READ_BIT ACCESS_2_UNIFORM_READ_BIT}, {@code dstStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If {@code dstAccessMask} includes {@link VK13#VK_ACCESS_2_SHADER_SAMPLED_READ_BIT ACCESS_2_SHADER_SAMPLED_READ_BIT}, {@code dstStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If {@code dstAccessMask} includes {@link VK13#VK_ACCESS_2_SHADER_STORAGE_READ_BIT ACCESS_2_SHADER_STORAGE_READ_BIT}, {@code dstStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If {@code dstAccessMask} includes {@link VK13#VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT ACCESS_2_SHADER_STORAGE_WRITE_BIT}, {@code dstStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If {@code dstAccessMask} includes {@link VK13#VK_ACCESS_2_SHADER_READ_BIT ACCESS_2_SHADER_READ_BIT}, {@code dstStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If {@code dstAccessMask} includes {@link VK13#VK_ACCESS_2_SHADER_WRITE_BIT ACCESS_2_SHADER_WRITE_BIT}, {@code dstStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If {@code dstAccessMask} includes {@link VK13#VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT ACCESS_2_COLOR_ATTACHMENT_READ_BIT}, {@code dstStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT} {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code dstAccessMask} includes {@link VK13#VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT}, {@code dstStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT} {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code dstAccessMask} includes {@link VK13#VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT}, {@code dstStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code dstAccessMask} includes {@link VK13#VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT}, {@code dstStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code dstAccessMask} includes {@link VK13#VK_ACCESS_2_TRANSFER_READ_BIT ACCESS_2_TRANSFER_READ_BIT}, {@code dstStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_COPY_BIT PIPELINE_STAGE_2_COPY_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_BLIT_BIT PIPELINE_STAGE_2_BLIT_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_RESOLVE_BIT PIPELINE_STAGE_2_RESOLVE_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT PIPELINE_STAGE_2_ALL_TRANSFER_BIT}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code dstAccessMask} includes {@link VK13#VK_ACCESS_2_TRANSFER_WRITE_BIT ACCESS_2_TRANSFER_WRITE_BIT}, {@code dstStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_COPY_BIT PIPELINE_STAGE_2_COPY_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_BLIT_BIT PIPELINE_STAGE_2_BLIT_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_RESOLVE_BIT PIPELINE_STAGE_2_RESOLVE_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_CLEAR_BIT PIPELINE_STAGE_2_CLEAR_BIT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT PIPELINE_STAGE_2_ALL_TRANSFER_BIT}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code dstAccessMask} includes {@link VK13#VK_ACCESS_2_HOST_READ_BIT ACCESS_2_HOST_READ_BIT}, {@code dstStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_HOST_BIT PIPELINE_STAGE_2_HOST_BIT}</li>
 * <li>If {@code dstAccessMask} includes {@link VK13#VK_ACCESS_2_HOST_WRITE_BIT ACCESS_2_HOST_WRITE_BIT}, {@code dstStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_HOST_BIT PIPELINE_STAGE_2_HOST_BIT}</li>
 * <li>If {@code dstAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT}, {@code dstStageMask} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code dstAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT}, {@code dstStageMask} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code dstAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT}, {@code dstStageMask} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code dstAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT}, {@code dstStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT PIPELINE_STAGE_2_DRAW_INDIRECT_BIT}, {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code dstAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT}, {@code dstStageMask} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code dstAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV}, {@code dstStageMask} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code dstAccessMask} includes {@link HUAWEIInvocationMask#VK_ACCESS_2_INVOCATION_MASK_READ_BIT_HUAWEI ACCESS_2_INVOCATION_MASK_READ_BIT_HUAWEI}, {@code dstStageMask} <b>must</b> include {@link HUAWEIInvocationMask#VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI}</li>
 * <li>If {@code dstAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV}, {@code dstStageMask} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV} or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code dstAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV}, {@code dstStageMask} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV} or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code dstAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT}, {@code dstStageMask} <b>must</b> include {@link VK13#VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT} {@link VK13#VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT PIPELINE_STAGE_2_ALL_GRAPHICS_BIT}, or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If {@code dstAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR}, {@code dstStageMask} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR}, {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}, or one of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages</li>
 * <li>If {@code dstAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR}, {@code dstStageMask} <b>must</b> include {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR} or {@link VK13#VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT PIPELINE_STAGE_2_ALL_COMMANDS_BIT}</li>
 * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-rayQuery">{@code rayQuery}</a> is not enabled and {@code dstAccessMask} includes {@link KHRSynchronization2#VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR}, {@code dstStageMask} <b>must</b> not include any of the {@code VK_PIPELINE_STAGE_*_SHADER_BIT} stages except {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR}</li>
 * <li>If {@code dstAccessMask} includes {@link KHRVideoDecodeQueue#VK_ACCESS_2_VIDEO_DECODE_READ_BIT_KHR ACCESS_2_VIDEO_DECODE_READ_BIT_KHR}, {@code dstStageMask} <b>must</b> include {@link KHRVideoDecodeQueue#VK_PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR}</li>
 * <li>If {@code dstAccessMask} includes {@link KHRVideoDecodeQueue#VK_ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR}, {@code dstStageMask} <b>must</b> include {@link KHRVideoDecodeQueue#VK_PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR}</li>
 * <li>If {@code dstAccessMask} includes {@link KHRVideoEncodeQueue#VK_ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR}, {@code dstStageMask} <b>must</b> include {@link KHRVideoEncodeQueue#VK_PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR}</li>
 * <li>If {@code dstAccessMask} includes {@link KHRVideoEncodeQueue#VK_ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR}, {@code dstStageMask} <b>must</b> include {@link KHRVideoEncodeQueue#VK_PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR}</li>
 * </ul>
 * 
 * <ul>
 * <li>{@code offset} <b>must</b> be less than the size of {@code buffer}</li>
 * <li>If {@code size} is not equal to {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, {@code size} <b>must</b> be greater than 0</li>
 * <li>If {@code size} is not equal to {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, {@code size} <b>must</b> be less than or equal to than the size of {@code buffer} minus {@code offset}</li>
 * <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>If {@code srcQueueFamilyIndex} is not equal to {@code dstQueueFamilyIndex}, at least one <b>must</b> not be a special queue family reserved for external memory ownership transfers, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">Queue Family Ownership Transfer</a></li>
 * <li>If {@code buffer} was created with a sharing mode of {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} are not equal, and one of {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} is one of the special queue family values reserved for external memory transfers, the other <b>must</b> be {@link VK10#VK_QUEUE_FAMILY_IGNORED QUEUE_FAMILY_IGNORED}</li>
 * <li>If {@code buffer} was created with a sharing mode of {@link VK10#VK_SHARING_MODE_EXCLUSIVE SHARING_MODE_EXCLUSIVE}, and {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} are not equal, {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} <b>must</b> both be valid queue families, or one of the special queue family values reserved for external memory transfers, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">Queue Family Ownership Transfer</a></li>
 * <li>If either {@code srcStageMask} or {@code dstStageMask} includes {@link VK13#VK_PIPELINE_STAGE_2_HOST_BIT PIPELINE_STAGE_2_HOST_BIT}, {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} <b>must</b> be equal</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2 STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code srcStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2} values</li>
 * <li>{@code srcAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits2} values</li>
 * <li>{@code dstStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2} values</li>
 * <li>{@code dstAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits2} values</li>
 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDependencyInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBufferMemoryBarrier2 {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineStageFlags2 {@link #srcStageMask};
 *     VkAccessFlags2 {@link #srcAccessMask};
 *     VkPipelineStageFlags2 {@link #dstStageMask};
 *     VkAccessFlags2 {@link #dstAccessMask};
 *     uint32_t {@link #srcQueueFamilyIndex};
 *     uint32_t {@link #dstQueueFamilyIndex};
 *     VkBuffer {@link #buffer};
 *     VkDeviceSize {@link #offset};
 *     VkDeviceSize {@link #size};
 * }</code></pre>
 */
public class VkBufferMemoryBarrier2 extends Struct implements NativeResource {

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
        DSTACCESSMASK,
        SRCQUEUEFAMILYINDEX,
        DSTQUEUEFAMILYINDEX,
        BUFFER,
        OFFSET,
        SIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSTAGEMASK = layout.offsetof(2);
        SRCACCESSMASK = layout.offsetof(3);
        DSTSTAGEMASK = layout.offsetof(4);
        DSTACCESSMASK = layout.offsetof(5);
        SRCQUEUEFAMILYINDEX = layout.offsetof(6);
        DSTQUEUEFAMILYINDEX = layout.offsetof(7);
        BUFFER = layout.offsetof(8);
        OFFSET = layout.offsetof(9);
        SIZE = layout.offsetof(10);
    }

    /**
     * Creates a {@code VkBufferMemoryBarrier2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferMemoryBarrier2(ByteBuffer container) {
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
    /** a {@code VkPipelineStageFlags2} mask of pipeline stages to be included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">first synchronization scope</a>. */
    @NativeType("VkPipelineStageFlags2")
    public long srcStageMask() { return nsrcStageMask(address()); }
    /** a {@code VkAccessFlags2} mask of access flags to be included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">first access scope</a>. */
    @NativeType("VkAccessFlags2")
    public long srcAccessMask() { return nsrcAccessMask(address()); }
    /** a {@code VkPipelineStageFlags2} mask of pipeline stages to be included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">second synchronization scope</a>. */
    @NativeType("VkPipelineStageFlags2")
    public long dstStageMask() { return ndstStageMask(address()); }
    /** a {@code VkAccessFlags2} mask of access flags to be included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">second access scope</a>. */
    @NativeType("VkAccessFlags2")
    public long dstAccessMask() { return ndstAccessMask(address()); }
    /** the source queue family for a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a>. */
    @NativeType("uint32_t")
    public int srcQueueFamilyIndex() { return nsrcQueueFamilyIndex(address()); }
    /** the destination queue family for a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a>. */
    @NativeType("uint32_t")
    public int dstQueueFamilyIndex() { return ndstQueueFamilyIndex(address()); }
    /** a handle to the buffer whose backing memory is affected by the barrier. */
    @NativeType("VkBuffer")
    public long buffer() { return nbuffer(address()); }
    /** an offset in bytes into the backing memory for {@code buffer}; this is relative to the base offset as bound to the buffer (see {@link VK10#vkBindBufferMemory BindBufferMemory}). */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }
    /** a size in bytes of the affected area of backing memory for {@code buffer}, or {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE} to use the range from {@code offset} to the end of the buffer. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkBufferMemoryBarrier2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2 STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2} value to the {@link #sType} field. */
    public VkBufferMemoryBarrier2 sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkBufferMemoryBarrier2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #srcStageMask} field. */
    public VkBufferMemoryBarrier2 srcStageMask(@NativeType("VkPipelineStageFlags2") long value) { nsrcStageMask(address(), value); return this; }
    /** Sets the specified value to the {@link #srcAccessMask} field. */
    public VkBufferMemoryBarrier2 srcAccessMask(@NativeType("VkAccessFlags2") long value) { nsrcAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@link #dstStageMask} field. */
    public VkBufferMemoryBarrier2 dstStageMask(@NativeType("VkPipelineStageFlags2") long value) { ndstStageMask(address(), value); return this; }
    /** Sets the specified value to the {@link #dstAccessMask} field. */
    public VkBufferMemoryBarrier2 dstAccessMask(@NativeType("VkAccessFlags2") long value) { ndstAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@link #srcQueueFamilyIndex} field. */
    public VkBufferMemoryBarrier2 srcQueueFamilyIndex(@NativeType("uint32_t") int value) { nsrcQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@link #dstQueueFamilyIndex} field. */
    public VkBufferMemoryBarrier2 dstQueueFamilyIndex(@NativeType("uint32_t") int value) { ndstQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@link #buffer} field. */
    public VkBufferMemoryBarrier2 buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #offset} field. */
    public VkBufferMemoryBarrier2 offset(@NativeType("VkDeviceSize") long value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@link #size} field. */
    public VkBufferMemoryBarrier2 size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBufferMemoryBarrier2 set(
        int sType,
        long pNext,
        long srcStageMask,
        long srcAccessMask,
        long dstStageMask,
        long dstAccessMask,
        int srcQueueFamilyIndex,
        int dstQueueFamilyIndex,
        long buffer,
        long offset,
        long size
    ) {
        sType(sType);
        pNext(pNext);
        srcStageMask(srcStageMask);
        srcAccessMask(srcAccessMask);
        dstStageMask(dstStageMask);
        dstAccessMask(dstAccessMask);
        srcQueueFamilyIndex(srcQueueFamilyIndex);
        dstQueueFamilyIndex(dstQueueFamilyIndex);
        buffer(buffer);
        offset(offset);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBufferMemoryBarrier2 set(VkBufferMemoryBarrier2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferMemoryBarrier2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferMemoryBarrier2 malloc() {
        return wrap(VkBufferMemoryBarrier2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBufferMemoryBarrier2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferMemoryBarrier2 calloc() {
        return wrap(VkBufferMemoryBarrier2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBufferMemoryBarrier2} instance allocated with {@link BufferUtils}. */
    public static VkBufferMemoryBarrier2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBufferMemoryBarrier2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBufferMemoryBarrier2} instance for the specified memory address. */
    public static VkBufferMemoryBarrier2 create(long address) {
        return wrap(VkBufferMemoryBarrier2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferMemoryBarrier2 createSafe(long address) {
        return address == NULL ? null : wrap(VkBufferMemoryBarrier2.class, address);
    }

    /**
     * Returns a new {@link VkBufferMemoryBarrier2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryBarrier2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBufferMemoryBarrier2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryBarrier2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferMemoryBarrier2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryBarrier2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBufferMemoryBarrier2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryBarrier2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferMemoryBarrier2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkBufferMemoryBarrier2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferMemoryBarrier2 malloc(MemoryStack stack) {
        return wrap(VkBufferMemoryBarrier2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBufferMemoryBarrier2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferMemoryBarrier2 calloc(MemoryStack stack) {
        return wrap(VkBufferMemoryBarrier2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBufferMemoryBarrier2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryBarrier2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferMemoryBarrier2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryBarrier2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBufferMemoryBarrier2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBufferMemoryBarrier2.PNEXT); }
    /** Unsafe version of {@link #srcStageMask}. */
    public static long nsrcStageMask(long struct) { return UNSAFE.getLong(null, struct + VkBufferMemoryBarrier2.SRCSTAGEMASK); }
    /** Unsafe version of {@link #srcAccessMask}. */
    public static long nsrcAccessMask(long struct) { return UNSAFE.getLong(null, struct + VkBufferMemoryBarrier2.SRCACCESSMASK); }
    /** Unsafe version of {@link #dstStageMask}. */
    public static long ndstStageMask(long struct) { return UNSAFE.getLong(null, struct + VkBufferMemoryBarrier2.DSTSTAGEMASK); }
    /** Unsafe version of {@link #dstAccessMask}. */
    public static long ndstAccessMask(long struct) { return UNSAFE.getLong(null, struct + VkBufferMemoryBarrier2.DSTACCESSMASK); }
    /** Unsafe version of {@link #srcQueueFamilyIndex}. */
    public static int nsrcQueueFamilyIndex(long struct) { return UNSAFE.getInt(null, struct + VkBufferMemoryBarrier2.SRCQUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #dstQueueFamilyIndex}. */
    public static int ndstQueueFamilyIndex(long struct) { return UNSAFE.getInt(null, struct + VkBufferMemoryBarrier2.DSTQUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return UNSAFE.getLong(null, struct + VkBufferMemoryBarrier2.BUFFER); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return UNSAFE.getLong(null, struct + VkBufferMemoryBarrier2.OFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return UNSAFE.getLong(null, struct + VkBufferMemoryBarrier2.SIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBufferMemoryBarrier2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBufferMemoryBarrier2.PNEXT, value); }
    /** Unsafe version of {@link #srcStageMask(long) srcStageMask}. */
    public static void nsrcStageMask(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferMemoryBarrier2.SRCSTAGEMASK, value); }
    /** Unsafe version of {@link #srcAccessMask(long) srcAccessMask}. */
    public static void nsrcAccessMask(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferMemoryBarrier2.SRCACCESSMASK, value); }
    /** Unsafe version of {@link #dstStageMask(long) dstStageMask}. */
    public static void ndstStageMask(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferMemoryBarrier2.DSTSTAGEMASK, value); }
    /** Unsafe version of {@link #dstAccessMask(long) dstAccessMask}. */
    public static void ndstAccessMask(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferMemoryBarrier2.DSTACCESSMASK, value); }
    /** Unsafe version of {@link #srcQueueFamilyIndex(int) srcQueueFamilyIndex}. */
    public static void nsrcQueueFamilyIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkBufferMemoryBarrier2.SRCQUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #dstQueueFamilyIndex(int) dstQueueFamilyIndex}. */
    public static void ndstQueueFamilyIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkBufferMemoryBarrier2.DSTQUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferMemoryBarrier2.BUFFER, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferMemoryBarrier2.OFFSET, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferMemoryBarrier2.SIZE, value); }

    // -----------------------------------

    /** An array of {@link VkBufferMemoryBarrier2} structs. */
    public static class Buffer extends StructBuffer<VkBufferMemoryBarrier2, Buffer> implements NativeResource {

        private static final VkBufferMemoryBarrier2 ELEMENT_FACTORY = VkBufferMemoryBarrier2.create(-1L);

        /**
         * Creates a new {@code VkBufferMemoryBarrier2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferMemoryBarrier2#SIZEOF}, and its mark will be undefined.
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
        protected VkBufferMemoryBarrier2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkBufferMemoryBarrier2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBufferMemoryBarrier2.nsType(address()); }
        /** @return the value of the {@link VkBufferMemoryBarrier2#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBufferMemoryBarrier2.npNext(address()); }
        /** @return the value of the {@link VkBufferMemoryBarrier2#srcStageMask} field. */
        @NativeType("VkPipelineStageFlags2")
        public long srcStageMask() { return VkBufferMemoryBarrier2.nsrcStageMask(address()); }
        /** @return the value of the {@link VkBufferMemoryBarrier2#srcAccessMask} field. */
        @NativeType("VkAccessFlags2")
        public long srcAccessMask() { return VkBufferMemoryBarrier2.nsrcAccessMask(address()); }
        /** @return the value of the {@link VkBufferMemoryBarrier2#dstStageMask} field. */
        @NativeType("VkPipelineStageFlags2")
        public long dstStageMask() { return VkBufferMemoryBarrier2.ndstStageMask(address()); }
        /** @return the value of the {@link VkBufferMemoryBarrier2#dstAccessMask} field. */
        @NativeType("VkAccessFlags2")
        public long dstAccessMask() { return VkBufferMemoryBarrier2.ndstAccessMask(address()); }
        /** @return the value of the {@link VkBufferMemoryBarrier2#srcQueueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int srcQueueFamilyIndex() { return VkBufferMemoryBarrier2.nsrcQueueFamilyIndex(address()); }
        /** @return the value of the {@link VkBufferMemoryBarrier2#dstQueueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int dstQueueFamilyIndex() { return VkBufferMemoryBarrier2.ndstQueueFamilyIndex(address()); }
        /** @return the value of the {@link VkBufferMemoryBarrier2#buffer} field. */
        @NativeType("VkBuffer")
        public long buffer() { return VkBufferMemoryBarrier2.nbuffer(address()); }
        /** @return the value of the {@link VkBufferMemoryBarrier2#offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VkBufferMemoryBarrier2.noffset(address()); }
        /** @return the value of the {@link VkBufferMemoryBarrier2#size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkBufferMemoryBarrier2.nsize(address()); }

        /** Sets the specified value to the {@link VkBufferMemoryBarrier2#sType} field. */
        public VkBufferMemoryBarrier2.Buffer sType(@NativeType("VkStructureType") int value) { VkBufferMemoryBarrier2.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2 STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2} value to the {@link VkBufferMemoryBarrier2#sType} field. */
        public VkBufferMemoryBarrier2.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2); }
        /** Sets the specified value to the {@link VkBufferMemoryBarrier2#pNext} field. */
        public VkBufferMemoryBarrier2.Buffer pNext(@NativeType("void const *") long value) { VkBufferMemoryBarrier2.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferMemoryBarrier2#srcStageMask} field. */
        public VkBufferMemoryBarrier2.Buffer srcStageMask(@NativeType("VkPipelineStageFlags2") long value) { VkBufferMemoryBarrier2.nsrcStageMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferMemoryBarrier2#srcAccessMask} field. */
        public VkBufferMemoryBarrier2.Buffer srcAccessMask(@NativeType("VkAccessFlags2") long value) { VkBufferMemoryBarrier2.nsrcAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferMemoryBarrier2#dstStageMask} field. */
        public VkBufferMemoryBarrier2.Buffer dstStageMask(@NativeType("VkPipelineStageFlags2") long value) { VkBufferMemoryBarrier2.ndstStageMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferMemoryBarrier2#dstAccessMask} field. */
        public VkBufferMemoryBarrier2.Buffer dstAccessMask(@NativeType("VkAccessFlags2") long value) { VkBufferMemoryBarrier2.ndstAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferMemoryBarrier2#srcQueueFamilyIndex} field. */
        public VkBufferMemoryBarrier2.Buffer srcQueueFamilyIndex(@NativeType("uint32_t") int value) { VkBufferMemoryBarrier2.nsrcQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferMemoryBarrier2#dstQueueFamilyIndex} field. */
        public VkBufferMemoryBarrier2.Buffer dstQueueFamilyIndex(@NativeType("uint32_t") int value) { VkBufferMemoryBarrier2.ndstQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferMemoryBarrier2#buffer} field. */
        public VkBufferMemoryBarrier2.Buffer buffer(@NativeType("VkBuffer") long value) { VkBufferMemoryBarrier2.nbuffer(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferMemoryBarrier2#offset} field. */
        public VkBufferMemoryBarrier2.Buffer offset(@NativeType("VkDeviceSize") long value) { VkBufferMemoryBarrier2.noffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferMemoryBarrier2#size} field. */
        public VkBufferMemoryBarrier2.Buffer size(@NativeType("VkDeviceSize") long value) { VkBufferMemoryBarrier2.nsize(address(), value); return this; }

    }

}
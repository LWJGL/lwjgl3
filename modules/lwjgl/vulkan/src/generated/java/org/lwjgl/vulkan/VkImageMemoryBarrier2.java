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
 * Structure specifying an image memory barrier.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-memory">memory dependency</a> limited to an image subresource range, and <b>can</b> define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family transfer operation</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a> for that subresource range.</p>
 * 
 * <p>The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> described by this structure include only operations and memory accesses specified by {@code srcStageMask} and {@code srcAccessMask}.</p>
 * 
 * <p>The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> described by this structure include only operations and memory accesses specified by {@code dstStageMask} and {@code dstAccessMask}.</p>
 * 
 * <p>Both <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scopes</a> are limited to only memory accesses to {@code image} in the subresource range defined by {@code subresourceRange}.</p>
 * 
 * <p>If {@code image} was created with {@link VK10#VK_SHARING_MODE_EXCLUSIVE SHARING_MODE_EXCLUSIVE}, and {@code srcQueueFamilyIndex} is not equal to {@code dstQueueFamilyIndex}, this memory barrier defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family transfer operation</a>. When executed on a queue in the family identified by {@code srcQueueFamilyIndex}, this barrier defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers-release">queue family release operation</a> for the specified image subresource range, and the second synchronization and access scopes do not synchronize operations on that queue. When executed on a queue in the family identified by {@code dstQueueFamilyIndex}, this barrier defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers-acquire">queue family acquire operation</a> for the specified image subresource range, and the first synchronization and access scopes do not synchronize operations on that queue.</p>
 * 
 * <p>A <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family transfer operation</a> is also defined if the values are not equal, and either is one of the special queue family values reserved for external memory ownership transfers, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">Queue Family Ownership Transfer</a>. A <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers-release">queue family release operation</a> is defined when {@code dstQueueFamilyIndex} is one of those values, and a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers-acquire">queue family acquire operation</a> is defined when {@code srcQueueFamilyIndex} is one of those values.</p>
 * 
 * <p>If {@code oldLayout} is not equal to {@code newLayout}, then the memory barrier defines an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a> for the specified image subresource range. If this memory barrier defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family transfer operation</a>, the layout transition is only executed once between the queues.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>When the old and new layout are equal, the layout values are ignored - data is preserved no matter what values are specified, or what layout the image is currently in.</p>
 * </div>
 * 
 * <p>If {@code image} has a multi-planar format and the image is <em>disjoint</em>, then including {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT} in the {@code aspectMask} member of {@code subresourceRange} is equivalent to including {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT}, {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT}, and (for three-plane formats only) {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT}.</p>
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
 * <li>{@code subresourceRange.baseMipLevel} <b>must</b> be less than the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code subresourceRange.levelCount} is not {@link VK10#VK_REMAINING_MIP_LEVELS REMAINING_MIP_LEVELS}, <code>subresourceRange.baseMipLevel + subresourceRange.levelCount</code> <b>must</b> be less than or equal to the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>{@code subresourceRange.baseArrayLayer} <b>must</b> be less than the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code subresourceRange.layerCount} is not {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, <code>subresourceRange.baseArrayLayer + subresourceRange.layerCount</code> <b>must</b> be less than or equal to the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code image} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT} or {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, {@code oldLayout} <b>must</b> be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} or the current layout of the image subresources affected by the barrier</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, {@code newLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} or {@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL} then {@code image} <b>must</b> have been created with at least one of {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, or {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} set</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL} then {@code image} <b>must</b> have been created with at least one of {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, or {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} set</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK13#VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_ATTACHMENT_OPTIMAL}, {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT} or {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link VK13#VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL IMAGE_LAYOUT_READ_ONLY_OPTIMAL}, {@code image} <b>must</b> have been created with at least one of {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, or {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, and {@code oldLayout} or {@code newLayout} is {@link KHRFragmentShadingRate#VK_IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR} then {@code image} <b>must</b> have been created with {@link KHRFragmentShadingRate#VK_IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR} set</li>
 * <li>If {@code image} has a single-plane color format or is not <em>disjoint</em>, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> be {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</li>
 * <li>If {@code image} has a multi-planar format and the image is <em>disjoint</em>, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> include either at least one of {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT}, {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT}, and {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT}; or <b>must</b> include {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</li>
 * <li>If {@code image} has a multi-planar format with only two planes, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> not include {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT}</li>
 * <li>If {@code image} has a depth/stencil format with both depth and stencil and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-separateDepthStencilLayouts">separateDepthStencilLayouts</a> feature is enabled, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> include either or both {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} and {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
 * <li>If {@code image} has a depth/stencil format with both depth and stencil and the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-separateDepthStencilLayouts">separateDepthStencilLayouts</a> feature is not enabled, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> include both {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} and {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
 * <li>If {@code srcQueueFamilyIndex} is not equal to {@code dstQueueFamilyIndex}, at least one <b>must</b> not be a special queue family reserved for external memory ownership transfers, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">Queue Family Ownership Transfer</a></li>
 * <li>If {@code image} was created with a sharing mode of {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} are not equal, and one of {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} is one of the special queue family values reserved for external memory transfers, the other <b>must</b> be {@link VK10#VK_QUEUE_FAMILY_IGNORED QUEUE_FAMILY_IGNORED}</li>
 * <li>If {@code image} was created with a sharing mode of {@link VK10#VK_SHARING_MODE_EXCLUSIVE SHARING_MODE_EXCLUSIVE}, and {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} are not equal, {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} <b>must</b> both be valid queue families, or one of the special queue family values reserved for external memory transfers, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">Queue Family Ownership Transfer</a></li>
 * <li>If either {@code srcStageMask} or {@code dstStageMask} includes {@link VK13#VK_PIPELINE_STAGE_2_HOST_BIT PIPELINE_STAGE_2_HOST_BIT}, {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} <b>must</b> be equal</li>
 * <li>If {@code srcStageMask} includes {@link VK13#VK_PIPELINE_STAGE_2_HOST_BIT PIPELINE_STAGE_2_HOST_BIT}, and {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a> or {@code oldLayout} and {@code newLayout} define an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>, {@code oldLayout} <b>must</b> be one of {@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}, {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}, or {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2 STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkSampleLocationsInfoEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code srcStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2} values</li>
 * <li>{@code srcAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits2} values</li>
 * <li>{@code dstStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2} values</li>
 * <li>{@code dstAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits2} values</li>
 * <li>{@code oldLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code newLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code subresourceRange} <b>must</b> be a valid {@link VkImageSubresourceRange} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDependencyInfo}, {@link VkImageSubresourceRange}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageMemoryBarrier2 {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineStageFlags2 {@link #srcStageMask};
 *     VkAccessFlags2 {@link #srcAccessMask};
 *     VkPipelineStageFlags2 {@link #dstStageMask};
 *     VkAccessFlags2 {@link #dstAccessMask};
 *     VkImageLayout {@link #oldLayout};
 *     VkImageLayout {@link #newLayout};
 *     uint32_t {@link #srcQueueFamilyIndex};
 *     uint32_t {@link #dstQueueFamilyIndex};
 *     VkImage {@link #image};
 *     {@link VkImageSubresourceRange VkImageSubresourceRange} {@link #subresourceRange};
 * }</code></pre>
 */
public class VkImageMemoryBarrier2 extends Struct implements NativeResource {

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
        OLDLAYOUT,
        NEWLAYOUT,
        SRCQUEUEFAMILYINDEX,
        DSTQUEUEFAMILYINDEX,
        IMAGE,
        SUBRESOURCERANGE;

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
            __member(4),
            __member(4),
            __member(8),
            __member(VkImageSubresourceRange.SIZEOF, VkImageSubresourceRange.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSTAGEMASK = layout.offsetof(2);
        SRCACCESSMASK = layout.offsetof(3);
        DSTSTAGEMASK = layout.offsetof(4);
        DSTACCESSMASK = layout.offsetof(5);
        OLDLAYOUT = layout.offsetof(6);
        NEWLAYOUT = layout.offsetof(7);
        SRCQUEUEFAMILYINDEX = layout.offsetof(8);
        DSTQUEUEFAMILYINDEX = layout.offsetof(9);
        IMAGE = layout.offsetof(10);
        SUBRESOURCERANGE = layout.offsetof(11);
    }

    /**
     * Creates a {@code VkImageMemoryBarrier2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageMemoryBarrier2(ByteBuffer container) {
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
    /** the old layout in an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>. */
    @NativeType("VkImageLayout")
    public int oldLayout() { return noldLayout(address()); }
    /** the new layout in an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>. */
    @NativeType("VkImageLayout")
    public int newLayout() { return nnewLayout(address()); }
    /** the source queue family for a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a>. */
    @NativeType("uint32_t")
    public int srcQueueFamilyIndex() { return nsrcQueueFamilyIndex(address()); }
    /** the destination queue family for a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a>. */
    @NativeType("uint32_t")
    public int dstQueueFamilyIndex() { return ndstQueueFamilyIndex(address()); }
    /** a handle to the image affected by this barrier. */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }
    /** describes the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-views">image subresource range</a> within {@code image} that is affected by this barrier. */
    public VkImageSubresourceRange subresourceRange() { return nsubresourceRange(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageMemoryBarrier2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2 STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2} value to the {@link #sType} field. */
    public VkImageMemoryBarrier2 sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageMemoryBarrier2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkSampleLocationsInfoEXT} value to the {@code pNext} chain. */
    public VkImageMemoryBarrier2 pNext(VkSampleLocationsInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #srcStageMask} field. */
    public VkImageMemoryBarrier2 srcStageMask(@NativeType("VkPipelineStageFlags2") long value) { nsrcStageMask(address(), value); return this; }
    /** Sets the specified value to the {@link #srcAccessMask} field. */
    public VkImageMemoryBarrier2 srcAccessMask(@NativeType("VkAccessFlags2") long value) { nsrcAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@link #dstStageMask} field. */
    public VkImageMemoryBarrier2 dstStageMask(@NativeType("VkPipelineStageFlags2") long value) { ndstStageMask(address(), value); return this; }
    /** Sets the specified value to the {@link #dstAccessMask} field. */
    public VkImageMemoryBarrier2 dstAccessMask(@NativeType("VkAccessFlags2") long value) { ndstAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@link #oldLayout} field. */
    public VkImageMemoryBarrier2 oldLayout(@NativeType("VkImageLayout") int value) { noldLayout(address(), value); return this; }
    /** Sets the specified value to the {@link #newLayout} field. */
    public VkImageMemoryBarrier2 newLayout(@NativeType("VkImageLayout") int value) { nnewLayout(address(), value); return this; }
    /** Sets the specified value to the {@link #srcQueueFamilyIndex} field. */
    public VkImageMemoryBarrier2 srcQueueFamilyIndex(@NativeType("uint32_t") int value) { nsrcQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@link #dstQueueFamilyIndex} field. */
    public VkImageMemoryBarrier2 dstQueueFamilyIndex(@NativeType("uint32_t") int value) { ndstQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@link #image} field. */
    public VkImageMemoryBarrier2 image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceRange} to the {@link #subresourceRange} field. */
    public VkImageMemoryBarrier2 subresourceRange(VkImageSubresourceRange value) { nsubresourceRange(address(), value); return this; }
    /** Passes the {@link #subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageMemoryBarrier2 subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageMemoryBarrier2 set(
        int sType,
        long pNext,
        long srcStageMask,
        long srcAccessMask,
        long dstStageMask,
        long dstAccessMask,
        int oldLayout,
        int newLayout,
        int srcQueueFamilyIndex,
        int dstQueueFamilyIndex,
        long image,
        VkImageSubresourceRange subresourceRange
    ) {
        sType(sType);
        pNext(pNext);
        srcStageMask(srcStageMask);
        srcAccessMask(srcAccessMask);
        dstStageMask(dstStageMask);
        dstAccessMask(dstAccessMask);
        oldLayout(oldLayout);
        newLayout(newLayout);
        srcQueueFamilyIndex(srcQueueFamilyIndex);
        dstQueueFamilyIndex(dstQueueFamilyIndex);
        image(image);
        subresourceRange(subresourceRange);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageMemoryBarrier2 set(VkImageMemoryBarrier2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageMemoryBarrier2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageMemoryBarrier2 malloc() {
        return wrap(VkImageMemoryBarrier2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageMemoryBarrier2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageMemoryBarrier2 calloc() {
        return wrap(VkImageMemoryBarrier2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageMemoryBarrier2} instance allocated with {@link BufferUtils}. */
    public static VkImageMemoryBarrier2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageMemoryBarrier2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageMemoryBarrier2} instance for the specified memory address. */
    public static VkImageMemoryBarrier2 create(long address) {
        return wrap(VkImageMemoryBarrier2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageMemoryBarrier2 createSafe(long address) {
        return address == NULL ? null : wrap(VkImageMemoryBarrier2.class, address);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageMemoryBarrier2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageMemoryBarrier2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkImageMemoryBarrier2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageMemoryBarrier2 malloc(MemoryStack stack) {
        return wrap(VkImageMemoryBarrier2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageMemoryBarrier2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageMemoryBarrier2 calloc(MemoryStack stack) {
        return wrap(VkImageMemoryBarrier2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageMemoryBarrier2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageMemoryBarrier2.PNEXT); }
    /** Unsafe version of {@link #srcStageMask}. */
    public static long nsrcStageMask(long struct) { return UNSAFE.getLong(null, struct + VkImageMemoryBarrier2.SRCSTAGEMASK); }
    /** Unsafe version of {@link #srcAccessMask}. */
    public static long nsrcAccessMask(long struct) { return UNSAFE.getLong(null, struct + VkImageMemoryBarrier2.SRCACCESSMASK); }
    /** Unsafe version of {@link #dstStageMask}. */
    public static long ndstStageMask(long struct) { return UNSAFE.getLong(null, struct + VkImageMemoryBarrier2.DSTSTAGEMASK); }
    /** Unsafe version of {@link #dstAccessMask}. */
    public static long ndstAccessMask(long struct) { return UNSAFE.getLong(null, struct + VkImageMemoryBarrier2.DSTACCESSMASK); }
    /** Unsafe version of {@link #oldLayout}. */
    public static int noldLayout(long struct) { return UNSAFE.getInt(null, struct + VkImageMemoryBarrier2.OLDLAYOUT); }
    /** Unsafe version of {@link #newLayout}. */
    public static int nnewLayout(long struct) { return UNSAFE.getInt(null, struct + VkImageMemoryBarrier2.NEWLAYOUT); }
    /** Unsafe version of {@link #srcQueueFamilyIndex}. */
    public static int nsrcQueueFamilyIndex(long struct) { return UNSAFE.getInt(null, struct + VkImageMemoryBarrier2.SRCQUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #dstQueueFamilyIndex}. */
    public static int ndstQueueFamilyIndex(long struct) { return UNSAFE.getInt(null, struct + VkImageMemoryBarrier2.DSTQUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return UNSAFE.getLong(null, struct + VkImageMemoryBarrier2.IMAGE); }
    /** Unsafe version of {@link #subresourceRange}. */
    public static VkImageSubresourceRange nsubresourceRange(long struct) { return VkImageSubresourceRange.create(struct + VkImageMemoryBarrier2.SUBRESOURCERANGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageMemoryBarrier2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageMemoryBarrier2.PNEXT, value); }
    /** Unsafe version of {@link #srcStageMask(long) srcStageMask}. */
    public static void nsrcStageMask(long struct, long value) { UNSAFE.putLong(null, struct + VkImageMemoryBarrier2.SRCSTAGEMASK, value); }
    /** Unsafe version of {@link #srcAccessMask(long) srcAccessMask}. */
    public static void nsrcAccessMask(long struct, long value) { UNSAFE.putLong(null, struct + VkImageMemoryBarrier2.SRCACCESSMASK, value); }
    /** Unsafe version of {@link #dstStageMask(long) dstStageMask}. */
    public static void ndstStageMask(long struct, long value) { UNSAFE.putLong(null, struct + VkImageMemoryBarrier2.DSTSTAGEMASK, value); }
    /** Unsafe version of {@link #dstAccessMask(long) dstAccessMask}. */
    public static void ndstAccessMask(long struct, long value) { UNSAFE.putLong(null, struct + VkImageMemoryBarrier2.DSTACCESSMASK, value); }
    /** Unsafe version of {@link #oldLayout(int) oldLayout}. */
    public static void noldLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkImageMemoryBarrier2.OLDLAYOUT, value); }
    /** Unsafe version of {@link #newLayout(int) newLayout}. */
    public static void nnewLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkImageMemoryBarrier2.NEWLAYOUT, value); }
    /** Unsafe version of {@link #srcQueueFamilyIndex(int) srcQueueFamilyIndex}. */
    public static void nsrcQueueFamilyIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkImageMemoryBarrier2.SRCQUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #dstQueueFamilyIndex(int) dstQueueFamilyIndex}. */
    public static void ndstQueueFamilyIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkImageMemoryBarrier2.DSTQUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { UNSAFE.putLong(null, struct + VkImageMemoryBarrier2.IMAGE, value); }
    /** Unsafe version of {@link #subresourceRange(VkImageSubresourceRange) subresourceRange}. */
    public static void nsubresourceRange(long struct, VkImageSubresourceRange value) { memCopy(value.address(), struct + VkImageMemoryBarrier2.SUBRESOURCERANGE, VkImageSubresourceRange.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkImageMemoryBarrier2} structs. */
    public static class Buffer extends StructBuffer<VkImageMemoryBarrier2, Buffer> implements NativeResource {

        private static final VkImageMemoryBarrier2 ELEMENT_FACTORY = VkImageMemoryBarrier2.create(-1L);

        /**
         * Creates a new {@code VkImageMemoryBarrier2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageMemoryBarrier2#SIZEOF}, and its mark will be undefined.
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
        protected VkImageMemoryBarrier2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageMemoryBarrier2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageMemoryBarrier2.nsType(address()); }
        /** @return the value of the {@link VkImageMemoryBarrier2#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageMemoryBarrier2.npNext(address()); }
        /** @return the value of the {@link VkImageMemoryBarrier2#srcStageMask} field. */
        @NativeType("VkPipelineStageFlags2")
        public long srcStageMask() { return VkImageMemoryBarrier2.nsrcStageMask(address()); }
        /** @return the value of the {@link VkImageMemoryBarrier2#srcAccessMask} field. */
        @NativeType("VkAccessFlags2")
        public long srcAccessMask() { return VkImageMemoryBarrier2.nsrcAccessMask(address()); }
        /** @return the value of the {@link VkImageMemoryBarrier2#dstStageMask} field. */
        @NativeType("VkPipelineStageFlags2")
        public long dstStageMask() { return VkImageMemoryBarrier2.ndstStageMask(address()); }
        /** @return the value of the {@link VkImageMemoryBarrier2#dstAccessMask} field. */
        @NativeType("VkAccessFlags2")
        public long dstAccessMask() { return VkImageMemoryBarrier2.ndstAccessMask(address()); }
        /** @return the value of the {@link VkImageMemoryBarrier2#oldLayout} field. */
        @NativeType("VkImageLayout")
        public int oldLayout() { return VkImageMemoryBarrier2.noldLayout(address()); }
        /** @return the value of the {@link VkImageMemoryBarrier2#newLayout} field. */
        @NativeType("VkImageLayout")
        public int newLayout() { return VkImageMemoryBarrier2.nnewLayout(address()); }
        /** @return the value of the {@link VkImageMemoryBarrier2#srcQueueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int srcQueueFamilyIndex() { return VkImageMemoryBarrier2.nsrcQueueFamilyIndex(address()); }
        /** @return the value of the {@link VkImageMemoryBarrier2#dstQueueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int dstQueueFamilyIndex() { return VkImageMemoryBarrier2.ndstQueueFamilyIndex(address()); }
        /** @return the value of the {@link VkImageMemoryBarrier2#image} field. */
        @NativeType("VkImage")
        public long image() { return VkImageMemoryBarrier2.nimage(address()); }
        /** @return a {@link VkImageSubresourceRange} view of the {@link VkImageMemoryBarrier2#subresourceRange} field. */
        public VkImageSubresourceRange subresourceRange() { return VkImageMemoryBarrier2.nsubresourceRange(address()); }

        /** Sets the specified value to the {@link VkImageMemoryBarrier2#sType} field. */
        public VkImageMemoryBarrier2.Buffer sType(@NativeType("VkStructureType") int value) { VkImageMemoryBarrier2.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2 STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2} value to the {@link VkImageMemoryBarrier2#sType} field. */
        public VkImageMemoryBarrier2.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2); }
        /** Sets the specified value to the {@link VkImageMemoryBarrier2#pNext} field. */
        public VkImageMemoryBarrier2.Buffer pNext(@NativeType("void const *") long value) { VkImageMemoryBarrier2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkSampleLocationsInfoEXT} value to the {@code pNext} chain. */
        public VkImageMemoryBarrier2.Buffer pNext(VkSampleLocationsInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkImageMemoryBarrier2#srcStageMask} field. */
        public VkImageMemoryBarrier2.Buffer srcStageMask(@NativeType("VkPipelineStageFlags2") long value) { VkImageMemoryBarrier2.nsrcStageMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageMemoryBarrier2#srcAccessMask} field. */
        public VkImageMemoryBarrier2.Buffer srcAccessMask(@NativeType("VkAccessFlags2") long value) { VkImageMemoryBarrier2.nsrcAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageMemoryBarrier2#dstStageMask} field. */
        public VkImageMemoryBarrier2.Buffer dstStageMask(@NativeType("VkPipelineStageFlags2") long value) { VkImageMemoryBarrier2.ndstStageMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageMemoryBarrier2#dstAccessMask} field. */
        public VkImageMemoryBarrier2.Buffer dstAccessMask(@NativeType("VkAccessFlags2") long value) { VkImageMemoryBarrier2.ndstAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageMemoryBarrier2#oldLayout} field. */
        public VkImageMemoryBarrier2.Buffer oldLayout(@NativeType("VkImageLayout") int value) { VkImageMemoryBarrier2.noldLayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageMemoryBarrier2#newLayout} field. */
        public VkImageMemoryBarrier2.Buffer newLayout(@NativeType("VkImageLayout") int value) { VkImageMemoryBarrier2.nnewLayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageMemoryBarrier2#srcQueueFamilyIndex} field. */
        public VkImageMemoryBarrier2.Buffer srcQueueFamilyIndex(@NativeType("uint32_t") int value) { VkImageMemoryBarrier2.nsrcQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageMemoryBarrier2#dstQueueFamilyIndex} field. */
        public VkImageMemoryBarrier2.Buffer dstQueueFamilyIndex(@NativeType("uint32_t") int value) { VkImageMemoryBarrier2.ndstQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageMemoryBarrier2#image} field. */
        public VkImageMemoryBarrier2.Buffer image(@NativeType("VkImage") long value) { VkImageMemoryBarrier2.nimage(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceRange} to the {@link VkImageMemoryBarrier2#subresourceRange} field. */
        public VkImageMemoryBarrier2.Buffer subresourceRange(VkImageSubresourceRange value) { VkImageMemoryBarrier2.nsubresourceRange(address(), value); return this; }
        /** Passes the {@link VkImageMemoryBarrier2#subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageMemoryBarrier2.Buffer subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    }

}
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
 * <p>This structure defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-memory">memory dependency</a> affecting all device memory.</p>
 * 
 * <p>The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> described by this structure include only operations and memory accesses specified by {@code srcStageMask} and {@code srcAccessMask}.</p>
 * 
 * <p>The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> described by this structure include only operations and memory accesses specified by {@code dstStageMask} and {@code dstAccessMask}.</p>
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
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_MEMORY_BARRIER_2 STRUCTURE_TYPE_MEMORY_BARRIER_2}</li>
 * <li>{@code srcStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2} values</li>
 * <li>{@code srcAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits2} values</li>
 * <li>{@code dstStageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2} values</li>
 * <li>{@code dstAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits2} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDependencyInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMemoryBarrier2 {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineStageFlags2 {@link #srcStageMask};
 *     VkAccessFlags2 {@link #srcAccessMask};
 *     VkPipelineStageFlags2 {@link #dstStageMask};
 *     VkAccessFlags2 {@link #dstAccessMask};
 * }</code></pre>
 */
public class VkMemoryBarrier2 extends Struct implements NativeResource {

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
            __member(8),
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
    }

    /**
     * Creates a {@code VkMemoryBarrier2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryBarrier2(ByteBuffer container) {
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

    /** Sets the specified value to the {@link #sType} field. */
    public VkMemoryBarrier2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_MEMORY_BARRIER_2 STRUCTURE_TYPE_MEMORY_BARRIER_2} value to the {@link #sType} field. */
    public VkMemoryBarrier2 sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_MEMORY_BARRIER_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMemoryBarrier2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #srcStageMask} field. */
    public VkMemoryBarrier2 srcStageMask(@NativeType("VkPipelineStageFlags2") long value) { nsrcStageMask(address(), value); return this; }
    /** Sets the specified value to the {@link #srcAccessMask} field. */
    public VkMemoryBarrier2 srcAccessMask(@NativeType("VkAccessFlags2") long value) { nsrcAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@link #dstStageMask} field. */
    public VkMemoryBarrier2 dstStageMask(@NativeType("VkPipelineStageFlags2") long value) { ndstStageMask(address(), value); return this; }
    /** Sets the specified value to the {@link #dstAccessMask} field. */
    public VkMemoryBarrier2 dstAccessMask(@NativeType("VkAccessFlags2") long value) { ndstAccessMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryBarrier2 set(
        int sType,
        long pNext,
        long srcStageMask,
        long srcAccessMask,
        long dstStageMask,
        long dstAccessMask
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
    public VkMemoryBarrier2 set(VkMemoryBarrier2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryBarrier2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryBarrier2 malloc() {
        return wrap(VkMemoryBarrier2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkMemoryBarrier2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryBarrier2 calloc() {
        return wrap(VkMemoryBarrier2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkMemoryBarrier2} instance allocated with {@link BufferUtils}. */
    public static VkMemoryBarrier2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkMemoryBarrier2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryBarrier2} instance for the specified memory address. */
    public static VkMemoryBarrier2 create(long address) {
        return wrap(VkMemoryBarrier2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryBarrier2 createSafe(long address) {
        return address == NULL ? null : wrap(VkMemoryBarrier2.class, address);
    }

    /**
     * Returns a new {@link VkMemoryBarrier2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryBarrier2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryBarrier2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryBarrier2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryBarrier2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryBarrier2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkMemoryBarrier2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryBarrier2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryBarrier2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkMemoryBarrier2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryBarrier2 malloc(MemoryStack stack) {
        return wrap(VkMemoryBarrier2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkMemoryBarrier2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryBarrier2 calloc(MemoryStack stack) {
        return wrap(VkMemoryBarrier2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryBarrier2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryBarrier2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryBarrier2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryBarrier2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMemoryBarrier2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryBarrier2.PNEXT); }
    /** Unsafe version of {@link #srcStageMask}. */
    public static long nsrcStageMask(long struct) { return UNSAFE.getLong(null, struct + VkMemoryBarrier2.SRCSTAGEMASK); }
    /** Unsafe version of {@link #srcAccessMask}. */
    public static long nsrcAccessMask(long struct) { return UNSAFE.getLong(null, struct + VkMemoryBarrier2.SRCACCESSMASK); }
    /** Unsafe version of {@link #dstStageMask}. */
    public static long ndstStageMask(long struct) { return UNSAFE.getLong(null, struct + VkMemoryBarrier2.DSTSTAGEMASK); }
    /** Unsafe version of {@link #dstAccessMask}. */
    public static long ndstAccessMask(long struct) { return UNSAFE.getLong(null, struct + VkMemoryBarrier2.DSTACCESSMASK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryBarrier2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryBarrier2.PNEXT, value); }
    /** Unsafe version of {@link #srcStageMask(long) srcStageMask}. */
    public static void nsrcStageMask(long struct, long value) { UNSAFE.putLong(null, struct + VkMemoryBarrier2.SRCSTAGEMASK, value); }
    /** Unsafe version of {@link #srcAccessMask(long) srcAccessMask}. */
    public static void nsrcAccessMask(long struct, long value) { UNSAFE.putLong(null, struct + VkMemoryBarrier2.SRCACCESSMASK, value); }
    /** Unsafe version of {@link #dstStageMask(long) dstStageMask}. */
    public static void ndstStageMask(long struct, long value) { UNSAFE.putLong(null, struct + VkMemoryBarrier2.DSTSTAGEMASK, value); }
    /** Unsafe version of {@link #dstAccessMask(long) dstAccessMask}. */
    public static void ndstAccessMask(long struct, long value) { UNSAFE.putLong(null, struct + VkMemoryBarrier2.DSTACCESSMASK, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryBarrier2} structs. */
    public static class Buffer extends StructBuffer<VkMemoryBarrier2, Buffer> implements NativeResource {

        private static final VkMemoryBarrier2 ELEMENT_FACTORY = VkMemoryBarrier2.create(-1L);

        /**
         * Creates a new {@code VkMemoryBarrier2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryBarrier2#SIZEOF}, and its mark will be undefined.
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
        protected VkMemoryBarrier2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMemoryBarrier2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryBarrier2.nsType(address()); }
        /** @return the value of the {@link VkMemoryBarrier2#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryBarrier2.npNext(address()); }
        /** @return the value of the {@link VkMemoryBarrier2#srcStageMask} field. */
        @NativeType("VkPipelineStageFlags2")
        public long srcStageMask() { return VkMemoryBarrier2.nsrcStageMask(address()); }
        /** @return the value of the {@link VkMemoryBarrier2#srcAccessMask} field. */
        @NativeType("VkAccessFlags2")
        public long srcAccessMask() { return VkMemoryBarrier2.nsrcAccessMask(address()); }
        /** @return the value of the {@link VkMemoryBarrier2#dstStageMask} field. */
        @NativeType("VkPipelineStageFlags2")
        public long dstStageMask() { return VkMemoryBarrier2.ndstStageMask(address()); }
        /** @return the value of the {@link VkMemoryBarrier2#dstAccessMask} field. */
        @NativeType("VkAccessFlags2")
        public long dstAccessMask() { return VkMemoryBarrier2.ndstAccessMask(address()); }

        /** Sets the specified value to the {@link VkMemoryBarrier2#sType} field. */
        public VkMemoryBarrier2.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryBarrier2.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_MEMORY_BARRIER_2 STRUCTURE_TYPE_MEMORY_BARRIER_2} value to the {@link VkMemoryBarrier2#sType} field. */
        public VkMemoryBarrier2.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_MEMORY_BARRIER_2); }
        /** Sets the specified value to the {@link VkMemoryBarrier2#pNext} field. */
        public VkMemoryBarrier2.Buffer pNext(@NativeType("void const *") long value) { VkMemoryBarrier2.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryBarrier2#srcStageMask} field. */
        public VkMemoryBarrier2.Buffer srcStageMask(@NativeType("VkPipelineStageFlags2") long value) { VkMemoryBarrier2.nsrcStageMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryBarrier2#srcAccessMask} field. */
        public VkMemoryBarrier2.Buffer srcAccessMask(@NativeType("VkAccessFlags2") long value) { VkMemoryBarrier2.nsrcAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryBarrier2#dstStageMask} field. */
        public VkMemoryBarrier2.Buffer dstStageMask(@NativeType("VkPipelineStageFlags2") long value) { VkMemoryBarrier2.ndstStageMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryBarrier2#dstAccessMask} field. */
        public VkMemoryBarrier2.Buffer dstAccessMask(@NativeType("VkAccessFlags2") long value) { VkMemoryBarrier2.ndstAccessMask(address(), value); return this; }

    }

}
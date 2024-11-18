/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension modifies the original core synchronization APIs to simplify the interface and improve usability of these APIs. It also adds new pipeline stage and access flag types that extend into the 64-bit range, as we have run out within the 32-bit range. The new flags are identical to the old values within the 32-bit range, with new stages and bits beyond that.
 * 
 * <p>Pipeline stages and access flags are now specified together in memory barrier structures, making the connection between the two more obvious. Additionally, scoping the pipeline stages into the barrier structs allows the use of the {@code MEMORY_READ} and {@code MEMORY_WRITE} flags without sacrificing precision. The per-stage access flags should be used to disambiguate specific accesses in a given stage or set of stages - for instance, between uniform reads and sampling operations.</p>
 * 
 * <p>Layout transitions have been simplified as well; rather than requiring a different set of layouts for depth/stencil/color attachments, there are generic {@link #VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR} and {@link #VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR} layouts which are contextually applied based on the image format. For example, for a depth format image, {@link #VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR} is equivalent to {@link KHRSeparateDepthStencilLayouts#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL_KHR IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL_KHR}. {@link #VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR} also functionally replaces {@link VK10#VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL}.</p>
 * 
 * <p>Events are now more efficient, because they include memory dependency information when you set them on the device. Previously, this information was only known when waiting on an event, so the dependencies could not be satisfied until the wait occurred. That sometimes meant stalling the pipeline when the wait occurred. The new API provides enough information for implementations to satisfy these dependencies in parallel with other tasks.</p>
 * 
 * <p>Queue submission has been changed to wrap command buffers and semaphores in extensible structures, which incorporate changes from Vulkan 1.1, {@link KHRDeviceGroup VK_KHR_device_group}, and {@link KHRTimelineSemaphore VK_KHR_timeline_semaphore}. This also adds a pipeline stage to the semaphore signal operation, mirroring the existing pipeline stage specification for wait operations.</p>
 * 
 * <p>Other miscellaneous changes include:</p>
 * 
 * <ul>
 * <li>Events can now be specified as interacting only with the device, allowing more efficient access to the underlying object.</li>
 * <li>Image memory barriers that do not perform an image layout transition can be specified by setting {@code oldLayout} equal to {@code newLayout}.
 * 
 * <ul>
 * <li>E.g. the old and new layout can both be set to {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}, without discarding data in the image.</li>
 * </ul>
 * </li>
 * <li>Queue family ownership transfer parameters are simplified in some cases.</li>
 * <li>Extensions with commands or functions with a {@code VkPipelineStageFlags} or {@code VkPipelineStageFlagBits} parameter have had those APIs replaced with equivalents using {@code VkPipelineStageFlags2KHR}.</li>
 * <li>The new event and barrier interfaces are now more extensible for future changes.</li>
 * <li>Relevant pipeline stage masks can now be specified as empty with the new {@link #VK_PIPELINE_STAGE_NONE_KHR PIPELINE_STAGE_NONE_KHR} and {@link #VK_PIPELINE_STAGE_2_NONE_KHR PIPELINE_STAGE_2_NONE_KHR} values.</li>
 * <li>{@link VkMemoryBarrier2KHR} can be chained to {@link VkSubpassDependency2}, overriding the original 32-bit stage and access masks.</li>
 * </ul>
 * 
 * <h5>Promotion to Vulkan 1.3</h5>
 * 
 * <p>Vulkan APIs in this extension are included in core Vulkan 1.3, with the KHR suffix omitted. External interactions defined by this extension, such as SPIR-V token names, retain their original names. The original Vulkan API names are still available as aliases of the core functionality.</p>
 * 
 * <h5>Examples</h5>
 * 
 * <p>See <a href="https://github.com/KhronosGroup/Vulkan-Docs/wiki/Synchronization-Examples">https://github.com/KhronosGroup/Vulkan-Docs/wiki/Synchronization-Examples</a></p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_synchronization2}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>315</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.1">Version 1.1</a></dd>
 * <dt><b>API Interactions</b></dt>
 * <dd><ul>
 * <li>Interacts with VK_EXT_blend_operation_advanced</li>
 * <li>Interacts with VK_EXT_conditional_rendering</li>
 * <li>Interacts with VK_EXT_device_generated_commands</li>
 * <li>Interacts with VK_EXT_fragment_density_map</li>
 * <li>Interacts with VK_EXT_mesh_shader</li>
 * <li>Interacts with VK_EXT_transform_feedback</li>
 * <li>Interacts with VK_KHR_acceleration_structure</li>
 * <li>Interacts with VK_KHR_fragment_shading_rate</li>
 * <li>Interacts with VK_KHR_ray_tracing_pipeline</li>
 * <li>Interacts with VK_NV_device_generated_commands</li>
 * <li>Interacts with VK_NV_mesh_shader</li>
 * <li>Interacts with VK_NV_ray_tracing</li>
 * <li>Interacts with VK_NV_shading_rate_image</li>
 * </ul></dd>
 * <dt><b>Deprecation State</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.3-promotions">Vulkan 1.3</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Tobias Hector <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_synchronization2]%20@tobski%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_synchronization2%20extension*">tobski</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2020-12-03</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Interacts with {@link KHRCreateRenderpass2 VK_KHR_create_renderpass2}</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Tobias Hector</li>
 * </ul></dd>
 * </dl>
 */
public class KHRSynchronization2 {

    /** The extension specification version. */
    public static final int VK_KHR_SYNCHRONIZATION_2_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_SYNCHRONIZATION_2_EXTENSION_NAME = "VK_KHR_synchronization2";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_MEMORY_BARRIER_2_KHR STRUCTURE_TYPE_MEMORY_BARRIER_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2_KHR STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2_KHR STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEPENDENCY_INFO_KHR STRUCTURE_TYPE_DEPENDENCY_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SUBMIT_INFO_2_KHR STRUCTURE_TYPE_SUBMIT_INFO_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO_KHR STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO_KHR STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_MEMORY_BARRIER_2_KHR                           = 1000314000,
        VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2_KHR                    = 1000314001,
        VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2_KHR                     = 1000314002,
        VK_STRUCTURE_TYPE_DEPENDENCY_INFO_KHR                            = 1000314003,
        VK_STRUCTURE_TYPE_SUBMIT_INFO_2_KHR                              = 1000314004,
        VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO_KHR                      = 1000314005,
        VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO_KHR                 = 1000314006,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES_KHR = 1000314007;

    /** Extends {@code VkEventCreateFlagBits}. */
    public static final int VK_EVENT_CREATE_DEVICE_ONLY_BIT_KHR = 0x1;

    /**
     * Extends {@code VkImageLayout}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR}</li>
     * <li>{@link #VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR}</li>
     * </ul>
     */
    public static final int
        VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR  = 1000314000,
        VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR = 1000314001;

    /** Extends {@code VkPipelineStageFlagBits}. */
    public static final int VK_PIPELINE_STAGE_NONE_KHR = 0;

    /** Extends {@code VkAccessFlagBits}. */
    public static final int VK_ACCESS_NONE_KHR = 0;

    /**
     * Extends {@code VkPipelineStageFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_STAGE_2_NONE_KHR PIPELINE_STAGE_2_NONE_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT_KHR PIPELINE_STAGE_2_TOP_OF_PIPE_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT_KHR PIPELINE_STAGE_2_COMPUTE_SHADER_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TRANSFER_BIT_KHR PIPELINE_STAGE_2_TRANSFER_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT_KHR PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_HOST_BIT_KHR PIPELINE_STAGE_2_HOST_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_COPY_BIT_KHR PIPELINE_STAGE_2_COPY_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_RESOLVE_BIT_KHR PIPELINE_STAGE_2_RESOLVE_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_BLIT_BIT_KHR PIPELINE_STAGE_2_BLIT_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_CLEAR_BIT_KHR PIPELINE_STAGE_2_CLEAR_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT_KHR PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT_KHR}</li>
     * </ul>
     */
    public static final long
        VK_PIPELINE_STAGE_2_NONE_KHR                               = 0L,
        VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT_KHR                    = 0x1L,
        VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR                  = 0x2L,
        VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR                   = 0x4L,
        VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR                  = 0x8L,
        VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR    = 0x10L,
        VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR = 0x20L,
        VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR                = 0x40L,
        VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR                = 0x80L,
        VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR           = 0x100L,
        VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR            = 0x200L,
        VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR        = 0x400L,
        VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT_KHR                 = 0x800L,
        VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR                   = 0x1000L,
        VK_PIPELINE_STAGE_2_TRANSFER_BIT_KHR                       = 0x1000L,
        VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT_KHR                 = 0x2000L,
        VK_PIPELINE_STAGE_2_HOST_BIT_KHR                           = 0x4000L,
        VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR                   = 0x8000L,
        VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR                   = 0x10000L,
        VK_PIPELINE_STAGE_2_COPY_BIT_KHR                           = 0x100000000L,
        VK_PIPELINE_STAGE_2_RESOLVE_BIT_KHR                        = 0x200000000L,
        VK_PIPELINE_STAGE_2_BLIT_BIT_KHR                           = 0x400000000L,
        VK_PIPELINE_STAGE_2_CLEAR_BIT_KHR                          = 0x800000000L,
        VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR                    = 0x1000000000L,
        VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR         = 0x2000000000L,
        VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT_KHR      = 0x4000000000L;

    /**
     * Extends {@code VkAccessFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_2_NONE_KHR ACCESS_2_NONE_KHR}</li>
     * <li>{@link #VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_INDEX_READ_BIT_KHR ACCESS_2_INDEX_READ_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_UNIFORM_READ_BIT_KHR ACCESS_2_UNIFORM_READ_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_SHADER_READ_BIT_KHR ACCESS_2_SHADER_READ_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_SHADER_WRITE_BIT_KHR ACCESS_2_SHADER_WRITE_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_TRANSFER_READ_BIT_KHR ACCESS_2_TRANSFER_READ_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_TRANSFER_WRITE_BIT_KHR ACCESS_2_TRANSFER_WRITE_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_HOST_READ_BIT_KHR ACCESS_2_HOST_READ_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_HOST_WRITE_BIT_KHR ACCESS_2_HOST_WRITE_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_MEMORY_READ_BIT_KHR ACCESS_2_MEMORY_READ_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_MEMORY_WRITE_BIT_KHR ACCESS_2_MEMORY_WRITE_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_SHADER_STORAGE_READ_BIT_KHR ACCESS_2_SHADER_STORAGE_READ_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR}</li>
     * </ul>
     */
    public static final long
        VK_ACCESS_2_NONE_KHR                               = 0L,
        VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR          = 0x1L,
        VK_ACCESS_2_INDEX_READ_BIT_KHR                     = 0x2L,
        VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR          = 0x4L,
        VK_ACCESS_2_UNIFORM_READ_BIT_KHR                   = 0x8L,
        VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR          = 0x10L,
        VK_ACCESS_2_SHADER_READ_BIT_KHR                    = 0x20L,
        VK_ACCESS_2_SHADER_WRITE_BIT_KHR                   = 0x40L,
        VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR          = 0x80L,
        VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR         = 0x100L,
        VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR  = 0x200L,
        VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR = 0x400L,
        VK_ACCESS_2_TRANSFER_READ_BIT_KHR                  = 0x800L,
        VK_ACCESS_2_TRANSFER_WRITE_BIT_KHR                 = 0x1000L,
        VK_ACCESS_2_HOST_READ_BIT_KHR                      = 0x2000L,
        VK_ACCESS_2_HOST_WRITE_BIT_KHR                     = 0x4000L,
        VK_ACCESS_2_MEMORY_READ_BIT_KHR                    = 0x8000L,
        VK_ACCESS_2_MEMORY_WRITE_BIT_KHR                   = 0x10000L,
        VK_ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR            = 0x100000000L,
        VK_ACCESS_2_SHADER_STORAGE_READ_BIT_KHR            = 0x200000000L,
        VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR           = 0x400000000L;

    /** Extends {@code VkSubmitFlagBits}. */
    public static final int VK_SUBMIT_PROTECTED_BIT_KHR = 0x1;

    /** Extends {@code VkPipelineStageFlagBits2}. */
    public static final long VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT = 0x1000000L;

    /**
     * Extends {@code VkAccessFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT}</li>
     * <li>{@link #VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT}</li>
     * <li>{@link #VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT}</li>
     * </ul>
     */
    public static final long
        VK_ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT         = 0x2000000L,
        VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT  = 0x4000000L,
        VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT = 0x8000000L;

    /** Extends {@code VkPipelineStageFlagBits2}. */
    public static final long VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT = 0x40000L;

    /** Extends {@code VkAccessFlagBits2}. */
    public static final long VK_ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT = 0x100000L;

    /** Extends {@code VkPipelineStageFlagBits2}. */
    public static final long VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV = 0x20000L;

    /**
     * Extends {@code VkAccessFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV}</li>
     * <li>{@link #VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV}</li>
     * </ul>
     */
    public static final long
        VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV  = 0x20000L,
        VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV = 0x40000L;

    /** Extends {@code VkPipelineStageFlagBits2}. */
    public static final long VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_EXT = 0x20000L;

    /**
     * Extends {@code VkAccessFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_EXT ACCESS_2_COMMAND_PREPROCESS_READ_BIT_EXT}</li>
     * <li>{@link #VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_EXT ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_EXT}</li>
     * </ul>
     */
    public static final long
        VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_EXT  = 0x20000L,
        VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_EXT = 0x40000L;

    /** Extends {@code VkPipelineStageFlagBits2}. */
    public static final long VK_PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x400000L;

    /** Extends {@code VkAccessFlagBits2}. */
    public static final long VK_ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR = 0x800000L;

    /** Extends {@code VkPipelineStageFlagBits2}. */
    public static final long VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV = 0x400000L;

    /** Extends {@code VkAccessFlagBits2}. */
    public static final long VK_ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV = 0x800000L;

    /** Extends {@code VkPipelineStageFlagBits2}. */
    public static final long VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR = 0x2000000L;

    /**
     * Extends {@code VkAccessFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR}</li>
     * </ul>
     */
    public static final long
        VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR  = 0x200000L,
        VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR = 0x400000L;

    /** Extends {@code VkPipelineStageFlagBits2}. */
    public static final long VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR = 0x200000L;

    /**
     * Extends {@code VkPipelineStageFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_NV PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_NV}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_NV PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_NV}</li>
     * </ul>
     */
    public static final long
        VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_NV           = 0x200000L,
        VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_NV = 0x2000000L;

    /**
     * Extends {@code VkAccessFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_NV ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_NV}</li>
     * <li>{@link #VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_NV ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_NV}</li>
     * </ul>
     */
    public static final long
        VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_NV  = 0x200000L,
        VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_NV = 0x400000L;

    /** Extends {@code VkPipelineStageFlagBits2}. */
    public static final long VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT = 0x800000L;

    /** Extends {@code VkAccessFlagBits2}. */
    public static final long VK_ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT = 0x1000000L;

    /** Extends {@code VkAccessFlagBits2}. */
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT = 0x80000L;

    /**
     * Extends {@code VkPipelineStageFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV PIPELINE_STAGE_2_TASK_SHADER_BIT_NV}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV PIPELINE_STAGE_2_MESH_SHADER_BIT_NV}</li>
     * </ul>
     */
    public static final long
        VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV = 0x80000L,
        VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV = 0x100000L;

    /**
     * Extends {@code VkPipelineStageFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_EXT PIPELINE_STAGE_2_TASK_SHADER_BIT_EXT}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_EXT PIPELINE_STAGE_2_MESH_SHADER_BIT_EXT}</li>
     * </ul>
     */
    public static final long
        VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_EXT = 0x80000L,
        VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_EXT = 0x100000L;

    protected KHRSynchronization2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetEvent2KHR ] ---

    /** Unsafe version of: {@link #vkCmdSetEvent2KHR CmdSetEvent2KHR} */
    public static void nvkCmdSetEvent2KHR(VkCommandBuffer commandBuffer, long event, long pDependencyInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetEvent2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkDependencyInfo.validate(pDependencyInfo);
        }
        callPJPV(commandBuffer.address(), event, pDependencyInfo, __functionAddress);
    }

    /**
     * See {@link VK13#vkCmdSetEvent2 CmdSetEvent2}.
     *
     * @param commandBuffer   the command buffer into which the command is recorded.
     * @param event           the event that will be signaled.
     * @param pDependencyInfo a pointer to a {@link VkDependencyInfo} structure defining the first scopes of this operation.
     */
    public static void vkCmdSetEvent2KHR(VkCommandBuffer commandBuffer, @NativeType("VkEvent") long event, @NativeType("VkDependencyInfo const *") VkDependencyInfo pDependencyInfo) {
        nvkCmdSetEvent2KHR(commandBuffer, event, pDependencyInfo.address());
    }

    // --- [ vkCmdResetEvent2KHR ] ---

    /**
     * See {@link VK13#vkCmdResetEvent2 CmdResetEvent2}.
     *
     * @param commandBuffer the command buffer into which the command is recorded.
     * @param event         the event that will be unsignaled.
     * @param stageMask     a {@code VkPipelineStageFlags2} mask of pipeline stages used to determine the first <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a>.
     */
    public static void vkCmdResetEvent2KHR(VkCommandBuffer commandBuffer, @NativeType("VkEvent") long event, @NativeType("VkPipelineStageFlags2") long stageMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdResetEvent2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(commandBuffer.address(), event, stageMask, __functionAddress);
    }

    // --- [ vkCmdWaitEvents2KHR ] ---

    /**
     * Unsafe version of: {@link #vkCmdWaitEvents2KHR CmdWaitEvents2KHR}
     *
     * @param eventCount the length of the {@code pEvents} array.
     */
    public static void nvkCmdWaitEvents2KHR(VkCommandBuffer commandBuffer, int eventCount, long pEvents, long pDependencyInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWaitEvents2KHR;
        if (CHECKS) {
            check(__functionAddress);
            Struct.validate(pDependencyInfos, eventCount, VkDependencyInfo.SIZEOF, VkDependencyInfo::validate);
        }
        callPPPV(commandBuffer.address(), eventCount, pEvents, pDependencyInfos, __functionAddress);
    }

    /**
     * See {@link VK13#vkCmdWaitEvents2 CmdWaitEvents2}.
     *
     * @param commandBuffer    the command buffer into which the command is recorded.
     * @param pEvents          a pointer to an array of {@code eventCount} events to wait on.
     * @param pDependencyInfos a pointer to an array of {@code eventCount} {@link VkDependencyInfo} structures, defining the second <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a>.
     */
    public static void vkCmdWaitEvents2KHR(VkCommandBuffer commandBuffer, @NativeType("VkEvent const *") LongBuffer pEvents, @NativeType("VkDependencyInfo const *") VkDependencyInfo.Buffer pDependencyInfos) {
        if (CHECKS) {
            check(pDependencyInfos, pEvents.remaining());
        }
        nvkCmdWaitEvents2KHR(commandBuffer, pEvents.remaining(), memAddress(pEvents), pDependencyInfos.address());
    }

    // --- [ vkCmdPipelineBarrier2KHR ] ---

    /** Unsafe version of: {@link #vkCmdPipelineBarrier2KHR CmdPipelineBarrier2KHR} */
    public static void nvkCmdPipelineBarrier2KHR(VkCommandBuffer commandBuffer, long pDependencyInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdPipelineBarrier2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkDependencyInfo.validate(pDependencyInfo);
        }
        callPPV(commandBuffer.address(), pDependencyInfo, __functionAddress);
    }

    /**
     * See {@link VK13#vkCmdPipelineBarrier2 CmdPipelineBarrier2}.
     *
     * @param commandBuffer   the command buffer into which the command is recorded.
     * @param pDependencyInfo a pointer to a {@link VkDependencyInfo} structure defining the scopes of this operation.
     */
    public static void vkCmdPipelineBarrier2KHR(VkCommandBuffer commandBuffer, @NativeType("VkDependencyInfo const *") VkDependencyInfo pDependencyInfo) {
        nvkCmdPipelineBarrier2KHR(commandBuffer, pDependencyInfo.address());
    }

    // --- [ vkCmdWriteTimestamp2KHR ] ---

    /**
     * See {@link VK13#vkCmdWriteTimestamp2 CmdWriteTimestamp2}.
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param stage         specifies a stage of the pipeline.
     * @param queryPool     the query pool that will manage the timestamp.
     * @param query         the query within the query pool that will contain the timestamp.
     */
    public static void vkCmdWriteTimestamp2KHR(VkCommandBuffer commandBuffer, @NativeType("VkPipelineStageFlags2") long stage, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int query) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteTimestamp2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(commandBuffer.address(), stage, queryPool, query, __functionAddress);
    }

    // --- [ vkQueueSubmit2KHR ] ---

    /**
     * Unsafe version of: {@link #vkQueueSubmit2KHR QueueSubmit2KHR}
     *
     * @param submitCount the number of elements in the {@code pSubmits} array.
     */
    public static int nvkQueueSubmit2KHR(VkQueue queue, int submitCount, long pSubmits, long fence) {
        long __functionAddress = queue.getCapabilities().vkQueueSubmit2KHR;
        if (CHECKS) {
            check(__functionAddress);
            if (pSubmits != NULL) { Struct.validate(pSubmits, submitCount, VkSubmitInfo2.SIZEOF, VkSubmitInfo2::validate); }
        }
        return callPPJI(queue.address(), submitCount, pSubmits, fence, __functionAddress);
    }

    /**
     * See {@link VK13#vkQueueSubmit2 QueueSubmit2}.
     *
     * @param queue    the queue that the command buffers will be submitted to.
     * @param pSubmits a pointer to an array of {@link VkSubmitInfo2} structures, each specifying a command buffer submission batch.
     * @param fence    an <b>optional</b> handle to a fence to be signaled once all submitted command buffers have completed execution. If {@code fence} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it defines a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-fences-signaling">fence signal operation</a>.
     */
    @NativeType("VkResult")
    public static int vkQueueSubmit2KHR(VkQueue queue, @NativeType("VkSubmitInfo2 const *") VkSubmitInfo2.@Nullable Buffer pSubmits, @NativeType("VkFence") long fence) {
        return nvkQueueSubmit2KHR(queue, remainingSafe(pSubmits), memAddressSafe(pSubmits), fence);
    }

    /** Array version of: {@link #vkCmdWaitEvents2KHR CmdWaitEvents2KHR} */
    public static void vkCmdWaitEvents2KHR(VkCommandBuffer commandBuffer, @NativeType("VkEvent const *") long[] pEvents, @NativeType("VkDependencyInfo const *") VkDependencyInfo.Buffer pDependencyInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWaitEvents2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pDependencyInfos, pEvents.length);
            Struct.validate(pDependencyInfos.address(), pEvents.length, VkDependencyInfo.SIZEOF, VkDependencyInfo::validate);
        }
        callPPPV(commandBuffer.address(), pEvents.length, pEvents, pDependencyInfos.address(), __functionAddress);
    }

}
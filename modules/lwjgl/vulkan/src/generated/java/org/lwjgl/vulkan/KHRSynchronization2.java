/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

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
 * <li>Where two synchronization commands need to be matched up (queue transfer operations, events), the dependency information specified in each place must now match completely for consistency.</li>
 * <li>Extensions with commands or functions with a {@code VkPipelineStageFlags} or {@code VkPipelineStageFlagBits} parameter have had those APIs replaced with equivalents using {@code VkPipelineStageFlags2KHR}.</li>
 * <li>The new event and barrier interfaces are now more extensible for future changes.</li>
 * <li>Relevant pipeline stage masks can now be specified as empty with the new {@link #VK_PIPELINE_STAGE_NONE_KHR PIPELINE_STAGE_NONE_KHR} and {@link #VK_PIPELINE_STAGE_2_NONE_KHR PIPELINE_STAGE_2_NONE_KHR} values.</li>
 * <li>{@link VkMemoryBarrier2KHR} can be chained to {@link VkSubpassDependency2}, overriding the original 32-bit stage and access masks.</li>
 * </ul>
 * 
 * <h5>Examples</h5>
 * 
 * <p>See <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/wiki/Synchronization-Examples">https://github.com/KhronosGroup/Vulkan-Docs/wiki/Synchronization-Examples</a></p>
 * 
 * <h5>VK_KHR_synchronization2</h5>
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
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Tobias Hector <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_synchronization2] @tobski%0A&lt;&lt;Here describe the issue or question you have about the VK_KHR_synchronization2 extension&gt;&gt;">tobski</a></li>
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

    /** Extends {@code VkPipelineStageFlagBits2KHR}. */
    public static final int VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT = 0x1000000;

    /**
     * Extends {@code VkAccessFlagBits2KHR}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT}</li>
     * <li>{@link #VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT}</li>
     * <li>{@link #VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT}</li>
     * </ul>
     */
    public static final int
        VK_ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT         = 0x2000000,
        VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT  = 0x4000000,
        VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT = 0x8000000;

    /** Extends {@code VkPipelineStageFlagBits2KHR}. */
    public static final int VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT = 0x40000;

    /** Extends {@code VkAccessFlagBits2KHR}. */
    public static final int VK_ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT = 0x100000;

    /** Extends {@code VkPipelineStageFlagBits2KHR}. */
    public static final int VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV = 0x20000;

    /**
     * Extends {@code VkAccessFlagBits2KHR}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV}</li>
     * <li>{@link #VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV}</li>
     * </ul>
     */
    public static final int
        VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV  = 0x20000,
        VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV = 0x40000;

    /** Extends {@code VkPipelineStageFlagBits2KHR}. */
    public static final int VK_PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x400000;

    /** Extends {@code VkAccessFlagBits2KHR}. */
    public static final int VK_ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR = 0x800000;

    /** Extends {@code VkPipelineStageFlagBits2KHR}. */
    public static final int VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV = 0x400000;

    /** Extends {@code VkAccessFlagBits2KHR}. */
    public static final int VK_ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV = 0x800000;

    /** Extends {@code VkPipelineStageFlagBits2KHR}. */
    public static final int VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR = 0x2000000;

    /**
     * Extends {@code VkAccessFlagBits2KHR}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR}</li>
     * <li>{@link #VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR  = 0x200000,
        VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR = 0x400000;

    /** Extends {@code VkPipelineStageFlagBits2KHR}. */
    public static final int VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR = 0x200000;

    /**
     * Extends {@code VkPipelineStageFlagBits2KHR}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_NV PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_NV}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_NV PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_NV}</li>
     * </ul>
     */
    public static final int
        VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_NV           = 0x200000,
        VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_NV = 0x2000000;

    /**
     * Extends {@code VkAccessFlagBits2KHR}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_NV ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_NV}</li>
     * <li>{@link #VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_NV ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_NV}</li>
     * </ul>
     */
    public static final int
        VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_NV  = 0x200000,
        VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_NV = 0x400000;

    /** Extends {@code VkPipelineStageFlagBits2KHR}. */
    public static final int VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT = 0x800000;

    /** Extends {@code VkAccessFlagBits2KHR}. */
    public static final int VK_ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT = 0x1000000;

    /** Extends {@code VkAccessFlagBits2KHR}. */
    public static final int VK_ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT = 0x80000;

    /**
     * Extends {@code VkPipelineStageFlagBits2KHR}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV PIPELINE_STAGE_2_TASK_SHADER_BIT_NV}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV PIPELINE_STAGE_2_MESH_SHADER_BIT_NV}</li>
     * </ul>
     */
    public static final int
        VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV = 0x80000,
        VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV = 0x100000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2_NV STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2_NV = 1000314008,
        VK_STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV                    = 1000314009;

    /**
     * VkPipelineStageFlagBits2KHR - Pipeline stage flags for VkPipelineStageFlags2KHR
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_STAGE_2_NONE_KHR PIPELINE_STAGE_2_NONE_KHR} specifies no stages of execution.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR} specifies the stage of the pipeline where indirect command parameters are consumed. This stage also includes reading commands written by {@link NVDeviceGeneratedCommands#vkCmdPreprocessGeneratedCommandsNV CmdPreprocessGeneratedCommandsNV}.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV PIPELINE_STAGE_2_TASK_SHADER_BIT_NV} specifies the task shader stage.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV PIPELINE_STAGE_2_MESH_SHADER_BIT_NV} specifies the mesh shader stage.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR} specifies the stage of the pipeline where index buffers are consumed.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR} specifies the stage of the pipeline where vertex buffers are consumed.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR} is equivalent to the logical OR of:
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR}</li>
     * </ul>
     * </li>
     * <li>{@link #VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR} specifies the vertex shader stage.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR} specifies the tessellation control shader stage.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR} specifies the tessellation evaluation shader stage.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR} specifies the geometry shader stage.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT_KHR PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT_KHR} is equivalent to specifying all supported <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader stages</a>:
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV PIPELINE_STAGE_2_TASK_SHADER_BIT_NV}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV PIPELINE_STAGE_2_MESH_SHADER_BIT_NV}</li>
     * </ul>
     * </li>
     * <li>{@link #VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR} specifies the fragment shader stage.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR} specifies the stage of the pipeline where early fragment tests (depth and stencil tests before fragment shading) are performed. This stage also includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass-load-store-ops">subpass load operations</a> for framebuffer attachments with a depth/stencil format.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR} specifies the stage of the pipeline where late fragment tests (depth and stencil tests after fragment shading) are performed. This stage also includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass-load-store-ops">subpass store operations</a> for framebuffer attachments with a depth/stencil format.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR} specifies the stage of the pipeline after blending where the final color values are output from the pipeline. This stage also includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass-load-store-ops">subpass load and store operations</a> and multisample resolve operations for framebuffer attachments with a color or depth/stencil format.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT_KHR PIPELINE_STAGE_2_COMPUTE_SHADER_BIT_KHR} specifies the compute shader stage.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_HOST_BIT_KHR PIPELINE_STAGE_2_HOST_BIT_KHR} specifies a pseudo-stage indicating execution on the host of reads/writes of device memory. This stage is not invoked by any commands recorded in a command buffer.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_COPY_BIT_KHR PIPELINE_STAGE_2_COPY_BIT_KHR} specifies the execution of all <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#copies">copy commands</a>, including {@link VK10#vkCmdCopyQueryPoolResults CmdCopyQueryPoolResults}.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_BLIT_BIT_KHR PIPELINE_STAGE_2_BLIT_BIT_KHR} specifies the execution of {@link VK10#vkCmdBlitImage CmdBlitImage}.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_RESOLVE_BIT_KHR PIPELINE_STAGE_2_RESOLVE_BIT_KHR} specifies the execution of {@link VK10#vkCmdResolveImage CmdResolveImage}.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_CLEAR_BIT_KHR PIPELINE_STAGE_2_CLEAR_BIT_KHR} specifies the execution of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#clears">clear commands</a>, with the exception of {@link VK10#vkCmdClearAttachments CmdClearAttachments}.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR} is equivalent to specifying all of:
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_STAGE_2_COPY_BIT_KHR PIPELINE_STAGE_2_COPY_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_BLIT_BIT_KHR PIPELINE_STAGE_2_BLIT_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_RESOLVE_BIT_KHR PIPELINE_STAGE_2_RESOLVE_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_CLEAR_BIT_KHR PIPELINE_STAGE_2_CLEAR_BIT_KHR}</li>
     * </ul>
     * </li>
     * <li>{@link #VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR} specifies the execution of the ray tracing shader stages.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR} specifies the execution of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#acceleration-structure">acceleration structure commands</a>.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR} specifies the execution of all graphics pipeline stages, and is equivalent to the logical OR of:
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV PIPELINE_STAGE_2_TASK_SHADER_BIT_NV}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV PIPELINE_STAGE_2_MESH_SHADER_BIT_NV}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV}</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT}</li>
     * <li>{@link HUAWEIInvocationMask#VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI}</li>
     * </ul>
     * </li>
     * <li>{@link #VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR} specifies all operations performed by all commands supported on the queue it is used with.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT} specifies the stage of the pipeline where the predicate of conditional rendering is consumed.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT} specifies the stage of the pipeline where vertex attribute output values are written to the transform feedback buffers.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV} specifies the stage of the pipeline where device-side generation of commands via {@link NVDeviceGeneratedCommands#vkCmdPreprocessGeneratedCommandsNV CmdPreprocessGeneratedCommandsNV} is handled.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR} specifies the stage of the pipeline where the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#primsrast-fragment-shading-rate-attachment">fragment shading rate attachment</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#primsrast-shading-rate-attachment">shading rate image</a> is read to determine the fragment shading rate for portions of a rasterized primitive.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT} specifies the stage of the pipeline where the fragment density map is read to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#fragmentdensitymapops">generate the fragment areas</a>.</li>
     * <li>{@link HUAWEIInvocationMask#VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI} specifies the stage of the pipeline where the invocation mask image is read by the implementation to optimize the ray dispatch.</li>
     * <li>{@link KHRVideoDecodeQueue#VK_PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR} specifies the stage of the pipeline where <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#video-decode-operations">video decode operation</a> are performed.</li>
     * <li>{@link KHRVideoEncodeQueue#VK_PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR} specifies the stage of the pipeline where <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#video-encode-operations">video encode operation</a> are performed.</li>
     * <li>{@link HUAWEISubpassShading#VK_PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI} specifies the subpass shading shader stage.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT_KHR PIPELINE_STAGE_2_TOP_OF_PIPE_BIT_KHR} is equivalent to {@link #VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR} with {@code VkAccessFlags2KHR} set to 0 when specified in the second synchronization scope, but equivalent to {@link #VK_PIPELINE_STAGE_2_NONE_KHR PIPELINE_STAGE_2_NONE_KHR} in the first scope.</li>
     * <li>{@link #VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT_KHR PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT_KHR} is equivalent to {@link #VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR} with {@code VkAccessFlags2KHR} set to 0 when specified in the first synchronization scope, but equivalent to {@link #VK_PIPELINE_STAGE_2_NONE_KHR PIPELINE_STAGE_2_NONE_KHR} in the second scope.</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The {@code TOP} and {@code BOTTOM} pipeline stages are deprecated, and applications should prefer {@link #VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR} and {@link #VK_PIPELINE_STAGE_2_NONE_KHR PIPELINE_STAGE_2_NONE_KHR}.</p>
     * </div>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The {@code VkPipelineStageFlags2KHR} bitmask goes beyond the 31 individual bit flags allowable within a C99 enum, which is how {@code VkPipelineStageFlagBits} is defined. The first 31 values are common to both, and are interchangeable.</p>
     * </div>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_STAGE_2_TRANSFER_BIT_KHR PIPELINE_STAGE_2_TRANSFER_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_PIPELINE_STAGE_2_NONE_KHR                               = 0,
        VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT_KHR                    = 0x1,
        VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR                  = 0x2,
        VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR                   = 0x4,
        VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR                  = 0x8,
        VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR    = 0x10,
        VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR = 0x20,
        VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR                = 0x40,
        VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR                = 0x80,
        VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR           = 0x100,
        VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR            = 0x200,
        VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR        = 0x400,
        VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT_KHR                 = 0x800,
        VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR                   = 0x1000,
        VK_PIPELINE_STAGE_2_TRANSFER_BIT_KHR                       = 0x1000,
        VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT_KHR                 = 0x2000,
        VK_PIPELINE_STAGE_2_HOST_BIT_KHR                           = 0x4000,
        VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR                   = 0x8000,
        VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR                   = 0x10000,
        VK_PIPELINE_STAGE_2_COPY_BIT_KHR                           = 0x1,
        VK_PIPELINE_STAGE_2_RESOLVE_BIT_KHR                        = 0x2,
        VK_PIPELINE_STAGE_2_BLIT_BIT_KHR                           = 0x4,
        VK_PIPELINE_STAGE_2_CLEAR_BIT_KHR                          = 0x8,
        VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR                    = 0x10,
        VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR         = 0x20,
        VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT_KHR      = 0x40;

    /**
     * VkAccessFlagBits2KHR - Access flags for VkAccessFlags2KHR
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_2_NONE_KHR ACCESS_2_NONE_KHR} specifies no accesses.</li>
     * <li>{@link #VK_ACCESS_2_MEMORY_READ_BIT_KHR ACCESS_2_MEMORY_READ_BIT_KHR} specifies all read accesses. It is always valid in any access mask, and is treated as equivalent to setting all {@code READ} access flags that are valid where it is used.</li>
     * <li>{@link #VK_ACCESS_2_MEMORY_WRITE_BIT_KHR ACCESS_2_MEMORY_WRITE_BIT_KHR} specifies all write accesses. It is always valid in any access mask, and is treated as equivalent to setting all {@code WRITE} access flags that are valid where it is used.</li>
     * <li>{@link #VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR} specifies read access to command data read from indirect buffers as part of an indirect build, trace, drawing or dispatch command. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_INDEX_READ_BIT_KHR ACCESS_2_INDEX_READ_BIT_KHR} specifies read access to an index buffer as part of an indexed drawing command, bound by {@link VK10#vkCmdBindIndexBuffer CmdBindIndexBuffer}. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR} specifies read access to a vertex buffer as part of a drawing command, bound by {@link VK10#vkCmdBindVertexBuffers CmdBindVertexBuffers}. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_UNIFORM_READ_BIT_KHR ACCESS_2_UNIFORM_READ_BIT_KHR} specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-uniformbuffer">uniform buffer</a> in any shader pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR} specifies read access to an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass">input attachment</a> within a render pass during subpass shading or fragment shading. Such access occurs in the {@link HUAWEISubpassShading#VK_PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI} or {@link #VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR} specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-uniformtexelbuffer">uniform texel buffer</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-sampledimage">sampled image</a> in any shader pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_SHADER_STORAGE_READ_BIT_KHR ACCESS_2_SHADER_STORAGE_READ_BIT_KHR} specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-storagebuffer">storage buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-physical-storage-buffer">physical storage buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-storagetexelbuffer">storage texel buffer</a>, or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-storageimage">storage image</a> in any shader pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_SHADER_READ_BIT_KHR ACCESS_2_SHADER_READ_BIT_KHR} specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#shader-binding-table">shader binding table</a> in any shader pipeline. In addition, it is equivalent to the logical OR of:
     * 
     * <ul>
     * <li>VK_ACCESS_2_UNIFORM_READ_BIT_KHR</li>
     * <li>VK_ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR</li>
     * <li>VK_ACCESS_2_SHADER_STORAGE_READ_BIT_KHR</li>
     * </ul>
     * </li>
     * <li>{@link #VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR} specifies write access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-storagebuffer">storage buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-physical-storage-buffer">physical storage buffer</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-storagetexelbuffer">storage texel buffer</a>, or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#descriptorsets-storageimage">storage image</a> in any shader pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_SHADER_WRITE_BIT_KHR ACCESS_2_SHADER_WRITE_BIT_KHR} is equivalent to {@link #VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR}.</li>
     * <li>{@link #VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR} specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass">color attachment</a>, such as via <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#framebuffer-blending">blending</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#framebuffer-logicop">logic operations</a>, or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass-load-store-ops">subpass load operations</a>. It does not include <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#framebuffer-blend-advanced">advanced blend operations</a>. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR} specifies write access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass">color, resolve, or depth/stencil resolve attachment</a> during a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass">render pass</a> or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass-load-store-ops">subpass load and store operations</a>. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR} specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass">depth/stencil attachment</a>, via <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#fragops-ds-state">depth or stencil operations</a> or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass-load-store-ops">subpass load operations</a>. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR} or {@link #VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR} pipeline stages.</li>
     * <li>{@link #VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR} specifies write access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass">depth/stencil attachment</a>, via <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#fragops-ds-state">depth or stencil operations</a> or via certain <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass-load-store-ops">subpass load and store operations</a>. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR} or {@link #VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR} pipeline stages.</li>
     * <li>{@link #VK_ACCESS_2_TRANSFER_READ_BIT_KHR ACCESS_2_TRANSFER_READ_BIT_KHR} specifies read access to an image or buffer in a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#copies">copy</a> operation. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_COPY_BIT_KHR PIPELINE_STAGE_2_COPY_BIT_KHR}, {@link #VK_PIPELINE_STAGE_2_BLIT_BIT_KHR PIPELINE_STAGE_2_BLIT_BIT_KHR}, or {@link #VK_PIPELINE_STAGE_2_RESOLVE_BIT_KHR PIPELINE_STAGE_2_RESOLVE_BIT_KHR} pipeline stages.</li>
     * <li>{@link #VK_ACCESS_2_TRANSFER_WRITE_BIT_KHR ACCESS_2_TRANSFER_WRITE_BIT_KHR} specifies write access to an image or buffer in a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#clears">clear</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#copies">copy</a> operation. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_COPY_BIT_KHR PIPELINE_STAGE_2_COPY_BIT_KHR}, {@link #VK_PIPELINE_STAGE_2_BLIT_BIT_KHR PIPELINE_STAGE_2_BLIT_BIT_KHR}, {@link #VK_PIPELINE_STAGE_2_CLEAR_BIT_KHR PIPELINE_STAGE_2_CLEAR_BIT_KHR}, or {@link #VK_PIPELINE_STAGE_2_RESOLVE_BIT_KHR PIPELINE_STAGE_2_RESOLVE_BIT_KHR} pipeline stages.</li>
     * <li>{@link #VK_ACCESS_2_HOST_READ_BIT_KHR ACCESS_2_HOST_READ_BIT_KHR} specifies read access by a host operation. Accesses of this type are not performed through a resource, but directly on memory. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_HOST_BIT_KHR PIPELINE_STAGE_2_HOST_BIT_KHR} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_HOST_WRITE_BIT_KHR ACCESS_2_HOST_WRITE_BIT_KHR} specifies write access by a host operation. Accesses of this type are not performed through a resource, but directly on memory. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_HOST_BIT_KHR PIPELINE_STAGE_2_HOST_BIT_KHR} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT} specifies read access to a predicate as part of conditional rendering. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT} specifies write access to a transform feedback buffer made when transform feedback is active. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT} specifies read access to a transform feedback counter buffer which is read when {@link EXTTransformFeedback#vkCmdBeginTransformFeedbackEXT CmdBeginTransformFeedbackEXT} executes. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT} specifies write access to a transform feedback counter buffer which is written when {@link EXTTransformFeedback#vkCmdEndTransformFeedbackEXT CmdEndTransformFeedbackEXT} executes. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV} specifies reads from buffer inputs to {@link NVDeviceGeneratedCommands#vkCmdPreprocessGeneratedCommandsNV CmdPreprocessGeneratedCommandsNV}. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV} specifies writes to the target command buffer preprocess outputs. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT} specifies read access to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass">color attachments</a>, including <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#framebuffer-blend-advanced">advanced blend operations</a>. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR} pipeline stage.</li>
     * <li>{@link HUAWEIInvocationMask#VK_ACCESS_2_INVOCATION_MASK_READ_BIT_HUAWEI ACCESS_2_INVOCATION_MASK_READ_BIT_HUAWEI} specifies read access to a invocation mask image in the {@link HUAWEIInvocationMask#VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR} specifies read access to an acceleration structure as part of a trace, build, or copy command, or to an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#acceleration-structure-scratch">acceleration structure scratch buffer</a> as part of a build command. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR} pipeline stage or {@link #VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR} specifies write access to an acceleration structure or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#acceleration-structure-scratch">acceleration structure scratch buffer</a> as part of a build or copy command. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT} specifies read access to a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#renderpass-fragmentdensitymapattachment">fragment density map attachment</a> during dynamic <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#fragmentdensitymapops">fragment density map operations</a>. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR} specifies read access to a fragment shading rate attachment during rasterization. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR} pipeline stage.</li>
     * <li>{@link #VK_ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV} specifies read access to a shading rate image during rasterization. Such access occurs in the {@link #VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV} pipeline stage. It is equivalent to {@link #VK_ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR}.</li>
     * <li>{@link KHRVideoDecodeQueue#VK_ACCESS_2_VIDEO_DECODE_READ_BIT_KHR ACCESS_2_VIDEO_DECODE_READ_BIT_KHR} specifies read access to an image or buffer resource as part of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#video-decode-operations">video decode operation</a>. Such access occurs in the {@link KHRVideoDecodeQueue#VK_PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR} pipeline stage.</li>
     * <li>{@link KHRVideoDecodeQueue#VK_ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR} specifies write access to an image or buffer resource as part of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#video-decode-operations">video decode operation</a>. Such access occurs in the {@link KHRVideoDecodeQueue#VK_PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR} pipeline stage.</li>
     * <li>{@link KHRVideoEncodeQueue#VK_ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR} specifies read access to an image or buffer resource as part of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#video-encode-operations">video encode operation</a>. Such access occurs in the {@link KHRVideoEncodeQueue#VK_PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR} pipeline stage.</li>
     * <li>{@link KHRVideoEncodeQueue#VK_ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR} specifies write access to an image or buffer resource as part of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#video-encode-operations">video encode operation</a>. Such access occurs in the {@link KHRVideoEncodeQueue#VK_PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR} pipeline stage.</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>In situations where an application wishes to select all access types for a given set of pipeline stages, {@link #VK_ACCESS_2_MEMORY_READ_BIT_KHR ACCESS_2_MEMORY_READ_BIT_KHR} or {@link #VK_ACCESS_2_MEMORY_WRITE_BIT_KHR ACCESS_2_MEMORY_WRITE_BIT_KHR} can be used. This is particularly useful when specifying stages that only have a single access type.</p>
     * </div>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The {@code VkAccessFlags2KHR} bitmask goes beyond the 31 individual bit flags allowable within a C99 enum, which is how {@code VkAccessFlagBits} is defined. The first 31 values are common to both, and are interchangeable.</p>
     * </div>
     */
    public static final int
        VK_ACCESS_2_NONE_KHR                               = 0,
        VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR          = 0x1,
        VK_ACCESS_2_INDEX_READ_BIT_KHR                     = 0x2,
        VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR          = 0x4,
        VK_ACCESS_2_UNIFORM_READ_BIT_KHR                   = 0x8,
        VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR          = 0x10,
        VK_ACCESS_2_SHADER_READ_BIT_KHR                    = 0x20,
        VK_ACCESS_2_SHADER_WRITE_BIT_KHR                   = 0x40,
        VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR          = 0x80,
        VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR         = 0x100,
        VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR  = 0x200,
        VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR = 0x400,
        VK_ACCESS_2_TRANSFER_READ_BIT_KHR                  = 0x800,
        VK_ACCESS_2_TRANSFER_WRITE_BIT_KHR                 = 0x1000,
        VK_ACCESS_2_HOST_READ_BIT_KHR                      = 0x2000,
        VK_ACCESS_2_HOST_WRITE_BIT_KHR                     = 0x4000,
        VK_ACCESS_2_MEMORY_READ_BIT_KHR                    = 0x8000,
        VK_ACCESS_2_MEMORY_WRITE_BIT_KHR                   = 0x10000,
        VK_ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR            = 0x1,
        VK_ACCESS_2_SHADER_STORAGE_READ_BIT_KHR            = 0x2,
        VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR           = 0x4;

    /**
     * VkSubmitFlagBitsKHR - Bitmask specifying behavior of a submission
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_SUBMIT_PROTECTED_BIT_KHR SUBMIT_PROTECTED_BIT_KHR} specifies that this batch is a protected submission.</li>
     * </ul>
     */
    public static final int VK_SUBMIT_PROTECTED_BIT_KHR = 0x1;

    protected KHRSynchronization2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetEvent2KHR ] ---

    /** Unsafe version of: {@link #vkCmdSetEvent2KHR CmdSetEvent2KHR} */
    public static void nvkCmdSetEvent2KHR(VkCommandBuffer commandBuffer, long event, long pDependencyInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetEvent2KHR;
        if (CHECKS) {
            check(__functionAddress);
            VkDependencyInfoKHR.validate(pDependencyInfo);
        }
        callPJPV(commandBuffer.address(), event, pDependencyInfo, __functionAddress);
    }

    /**
     * Set an event object to signaled state.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To signal an event from a device, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetEvent2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     VkEvent                                     event,
     *     const VkDependencyInfoKHR*                  pDependencyInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When {@link #vkCmdSetEvent2KHR CmdSetEvent2KHR} is submitted to a queue, it defines the first half of memory dependencies defined by {@code pDependencyInfo}, as well as an event signal operation which sets the event to the signaled state. A memory dependency is defined between the event signal operation and commands that occur earlier in submission order.</p>
     * 
     * <p>The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> are defined by the union of all the memory dependencies defined by {@code pDependencyInfo}, and are applied to all operations that occur earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-submission-order">submission order</a>. <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-queue-transfers">Queue family ownership transfers</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transitions</a> defined by {@code pDependencyInfo} are also included in the first scopes.</p>
     * 
     * <p>The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> includes only the event signal operation, and any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfers</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transitions</a> defined by {@code pDependencyInfo}.</p>
     * 
     * <p>The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> includes only <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfers</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transitions</a>.</p>
     * 
     * <p>Future {@link #vkCmdWaitEvents2KHR CmdWaitEvents2KHR} commands rely on all values of each element in {@code pDependencyInfo} matching exactly with those used to signal the corresponding event. {@link VK10#vkCmdWaitEvents CmdWaitEvents} <b>must</b> not be used to wait on the result of a signal operation defined by {@code vkCmdSetEvent2KHR}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The extra information provided by {@link #vkCmdSetEvent2KHR CmdSetEvent2KHR} compared to {@link VK10#vkCmdSetEvent CmdSetEvent} allows implementations to more efficiently schedule the operations required to satisfy the requested dependencies. With {@link VK10#vkCmdSetEvent CmdSetEvent}, the full dependency information is not known until {@link VK10#vkCmdWaitEvents CmdWaitEvents} is recorded, forcing implementations to insert the required operations at that point and not before.</p>
     * </div>
     * 
     * <p>If {@code event} is already in the signaled state when {@link #vkCmdSetEvent2KHR CmdSetEvent2KHR} is executed on the device, then {@link #vkCmdSetEvent2KHR CmdSetEvent2KHR} has no effect, no event signal operation occurs, and no dependency is generated.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
     * <li>The {@code dependencyFlags} member of {@code pDependencyInfo} <b>must</b> be 0</li>
     * <li>The current device mask of {@code commandBuffer} <b>must</b> include exactly one physical device</li>
     * <li>The {@code srcStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfo} <b>must</b> only include pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
     * <li>The {@code dstStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfo} <b>must</b> only include pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
     * <li>{@code pDependencyInfo} <b>must</b> be a valid pointer to a valid {@link VkDependencyInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>Both of {@code commandBuffer}, and {@code event} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDependencyInfoKHR}</p>
     *
     * @param commandBuffer   the command buffer into which the command is recorded.
     * @param event           the event that will be signaled.
     * @param pDependencyInfo a pointer to a {@link VkDependencyInfoKHR} structure defining the first scopes of this operation.
     */
    public static void vkCmdSetEvent2KHR(VkCommandBuffer commandBuffer, @NativeType("VkEvent") long event, @NativeType("VkDependencyInfoKHR const *") VkDependencyInfoKHR pDependencyInfo) {
        nvkCmdSetEvent2KHR(commandBuffer, event, pDependencyInfo.address());
    }

    // --- [ vkCmdResetEvent2KHR ] ---

    /**
     * Reset an event object to non-signaled state.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To unsignal the event from a device, call:</p>
     * 
     * <pre><code>
     * void vkCmdResetEvent2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     VkEvent                                     event,
     *     VkPipelineStageFlags2KHR                    stageMask);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When {@link #vkCmdResetEvent2KHR CmdResetEvent2KHR} is submitted to a queue, it defines an execution dependency on commands that were submitted before it, and defines an event unsignal operation which resets the event to the unsignaled state.</p>
     * 
     * <p>The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> includes all commands that occur earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-submission-order">submission order</a>. The synchronization scope is limited to operations by {@code stageMask} or stages that are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-pipeline-stages-order">logically earlier</a> than {@code stageMask}.</p>
     * 
     * <p>The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> includes only the event unsignal operation.</p>
     * 
     * <p>If {@code event} is already in the unsignaled state when {@link #vkCmdResetEvent2KHR CmdResetEvent2KHR} is executed on the device, then this command has no effect, no event unsignal operation occurs, and no execution dependency is generated.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-geometryShader">geometry shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR} or {@link #VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-conditionalRendering">conditional rendering</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-fragmentDensityMap">fragment density map</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-transformFeedback">transform feedback</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-meshShader">mesh shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV PIPELINE_STAGE_2_MESH_SHADER_BIT_NV}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-taskShader">task shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV PIPELINE_STAGE_2_TASK_SHADER_BIT_NV}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-shadingRateImage">shading rate image</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-subpassShading">subpass shading</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link HUAWEISubpassShading#VK_PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-invocationMask">invocation mask image</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link HUAWEIInvocationMask#VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI}</li>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
     * <li>{@code stageMask} <b>must</b> not include {@link #VK_PIPELINE_STAGE_2_HOST_BIT_KHR PIPELINE_STAGE_2_HOST_BIT_KHR}</li>
     * <li>There <b>must</b> be an execution dependency between {@code vkCmdResetEvent2KHR} and the execution of any {@link VK10#vkCmdWaitEvents CmdWaitEvents} that includes {@code event} in its {@code pEvents} parameter</li>
     * <li>There <b>must</b> be an execution dependency between {@code vkCmdResetEvent2KHR} and the execution of any {@link #vkCmdWaitEvents2KHR CmdWaitEvents2KHR} that includes {@code event} in its {@code pEvents} parameter</li>
     * <li>{@code commandBuffer}’s current device mask <b>must</b> include exactly one physical device</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code event} <b>must</b> be a valid {@code VkEvent} handle</li>
     * <li>{@code stageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2KHR} values</li>
     * <li>{@code stageMask} <b>must</b> not be 0</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>Both of {@code commandBuffer}, and {@code event} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Graphics Compute</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command is recorded.
     * @param event         the event that will be unsignaled.
     * @param stageMask     a {@code VkPipelineStageFlags2KHR} mask of pipeline stages used to determine the first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a>.
     */
    public static void vkCmdResetEvent2KHR(VkCommandBuffer commandBuffer, @NativeType("VkEvent") long event, @NativeType("VkPipelineStageFlags2KHR") int stageMask) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdResetEvent2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(commandBuffer.address(), event, stageMask, __functionAddress);
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
            VkDependencyInfoKHR.validate(pDependencyInfos, eventCount);
        }
        callPPPV(commandBuffer.address(), eventCount, pEvents, pDependencyInfos, __functionAddress);
    }

    /**
     * Wait for one or more events.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To wait for one or more events to enter the signaled state on a device, call:</p>
     * 
     * <pre><code>
     * void vkCmdWaitEvents2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    eventCount,
     *     const VkEvent*                              pEvents,
     *     const VkDependencyInfoKHR*                  pDependencyInfos);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When {@code vkCmdWaitEvents2KHR} is submitted to a queue, it inserts memory dependencies according to the elements of {@code pDependencyInfos} and each corresponding element of {@code pEvents}. {@code vkCmdWaitEvents2KHR} <b>must</b> not be used to wait on event signal operations occurring on other queues, or signal operations execyted by {@link VK10#vkCmdSetEvent CmdSetEvent}.</p>
     * 
     * <p>The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> of each memory dependency defined by any element <code>i</code> of {@code pDependencyInfos} are applied to operations that occurred earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-submission-order">submission order</a> than the last event signal operation on element <code>i</code> of {@code pEvents}.</p>
     * 
     * <p>Signal operations for an event at index <code>i</code> are only included if:</p>
     * 
     * <ul>
     * <li>The event was signaled by a {@link #vkCmdSetEvent2KHR CmdSetEvent2KHR} command that occurred earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-submission-order">submission order</a> with a {@code dependencyInfo} parameter exactly equal to the element of {@code pDependencyInfos} at index <code>i</code> ; or</li>
     * <li>The event was created without {@link #VK_EVENT_CREATE_DEVICE_ONLY_BIT_KHR EVENT_CREATE_DEVICE_ONLY_BIT_KHR}, and the first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> defined by the element of {@code pDependencyInfos} at index <code>i</code> only includes host operations ({@link #VK_PIPELINE_STAGE_2_HOST_BIT_KHR PIPELINE_STAGE_2_HOST_BIT_KHR}).</li>
     * </ul>
     * 
     * <p>The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> of each memory dependency defined by any element <code>i</code> of {@code pDependencyInfos} are applied to operations that occurred later in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-submission-order">submission order</a> than {@code vkCmdWaitEvents2KHR}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>{@link #vkCmdWaitEvents2KHR CmdWaitEvents2KHR} is used with {@link #vkCmdSetEvent2KHR CmdSetEvent2KHR} to define a memory dependency between two sets of action commands, roughly in the same way as pipeline barriers, but split into two commands such that work between the two <b>may</b> execute unhindered.</p>
     * </div>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Applications should be careful to avoid race conditions when using events. There is no direct ordering guarantee between {@code vkCmdSetEvent2KHR} and {@link #vkCmdResetEvent2KHR CmdResetEvent2KHR}, {@link VK10#vkCmdResetEvent CmdResetEvent}, or {@link VK10#vkCmdSetEvent CmdSetEvent}. Another execution dependency (e.g. a pipeline barrier or semaphore with {@link #VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR}) is needed to prevent such a race condition.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
     * <li>Members of {@code pEvents} <b>must</b> not have been signaled by {@link VK10#vkCmdSetEvent CmdSetEvent}</li>
     * <li>For any element <code>i</code> of {@code pEvents}, if that event is signaled by {@link #vkCmdSetEvent2KHR CmdSetEvent2KHR}, that command’s {@code dependencyInfo} parameter <b>must</b> be exactly equal to the <code>i</code>th element of {@code pDependencyInfos}</li>
     * <li>For any element <code>i</code> of {@code pEvents}, if that event is signaled by {@link VK10#vkSetEvent SetEvent}, barriers in the <code>i</code>th element of {@code pDependencyInfos} <b>must</b> include only host operations in their first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a></li>
     * <li>For any element <code>i</code> of {@code pEvents}, if barriers in the <code>i</code>th element of {@code pDependencyInfos} include only host operations, the <code>i</code>th element of {@code pEvents} <b>must</b> be signaled before {@link #vkCmdWaitEvents2KHR CmdWaitEvents2KHR} is executed</li>
     * <li>For any element <code>i</code> of {@code pEvents}, if barriers in the <code>i</code>th element of {@code pDependencyInfos} do not include host operations, the <code>i</code>th element of {@code pEvents} <b>must</b> be signaled by a corresponding {@link #vkCmdSetEvent2KHR CmdSetEvent2KHR} that occurred earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-submission-order">submission order</a></li>
     * <li>The {@code srcStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfos} <b>must</b> either include only pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from, or include only {@link #VK_PIPELINE_STAGE_2_HOST_BIT_KHR PIPELINE_STAGE_2_HOST_BIT_KHR}</li>
     * <li>The {@code dstStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfos} <b>must</b> only include pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
     * <li>The {@code dependencyFlags} member of any element of {@code pDependencyInfo} <b>must</b> be 0</li>
     * <li>If {@code pEvents} includes one or more events that will be signaled by {@link VK10#vkSetEvent SetEvent} after {@code commandBuffer} has been submitted to a queue, then {@code vkCmdWaitEvents2KHR} <b>must</b> not be called inside a render pass instance</li>
     * <li>{@code commandBuffer}’s current device mask <b>must</b> include exactly one physical device</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pEvents} <b>must</b> be a valid pointer to an array of {@code eventCount} valid {@code VkEvent} handles</li>
     * <li>{@code pDependencyInfos} <b>must</b> be a valid pointer to an array of {@code eventCount} valid {@link VkDependencyInfoKHR} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
     * <li>{@code eventCount} <b>must</b> be greater than 0</li>
     * <li>Both of {@code commandBuffer}, and the elements of {@code pEvents} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDependencyInfoKHR}</p>
     *
     * @param commandBuffer    the command buffer into which the command is recorded.
     * @param pEvents          a pointer to an array of {@code eventCount} events to wait on.
     * @param pDependencyInfos a pointer to an array of {@code eventCount} {@link VkDependencyInfoKHR} structures, defining the second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a>.
     */
    public static void vkCmdWaitEvents2KHR(VkCommandBuffer commandBuffer, @NativeType("VkEvent const *") LongBuffer pEvents, @NativeType("VkDependencyInfoKHR const *") VkDependencyInfoKHR.Buffer pDependencyInfos) {
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
            VkDependencyInfoKHR.validate(pDependencyInfo);
        }
        callPPV(commandBuffer.address(), pDependencyInfo, __functionAddress);
    }

    /**
     * Insert a memory dependency.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To record a pipeline barrier, call:</p>
     * 
     * <pre><code>
     * void vkCmdPipelineBarrier2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkDependencyInfoKHR*                  pDependencyInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When {@link #vkCmdPipelineBarrier2KHR CmdPipelineBarrier2KHR} is submitted to a queue, it defines memory dependencies between commands that were submitted before it, and those submitted after it.</p>
     * 
     * <p>The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> of each memory dependency defined by any element <code>i</code> of {@code pDependencyInfos} are applied to operations that occurred earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-submission-order">submission order</a>.</p>
     * 
     * <p>The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> of each memory dependency defined by any element <code>i</code> of {@code pDependencyInfos} are applied to operations that occurred later in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-submission-order">submission order</a>.</p>
     * 
     * <p>If {@code vkCmdPipelineBarrier2KHR} is recorded within a render pass instance, the synchronization scopes are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-pipeline-barriers-subpass-self-dependencies">limited to operations within the same subpass</a>.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code vkCmdPipelineBarrier2KHR} is called within a render pass instance, the render pass <b>must</b> have been created with at least one {@link VkSubpassDependency} instance in {@link VkRenderPassCreateInfo}{@code ::pDependencies} that expresses a dependency from the current subpass to itself, with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scopes</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scopes</a> that are all supersets of the scopes defined in this command</li>
     * <li>If {@code vkCmdPipelineBarrier2KHR} is called within a render pass instance, it <b>must</b> not include any buffer memory barriers</li>
     * <li>If {@code vkCmdPipelineBarrier2KHR} is called within a render pass instance, the {@code image} member of any image memory barrier included in this command <b>must</b> be an attachment used in the current subpass both as an input attachment, and as either a color or depth/stencil attachment</li>
     * <li>If {@code vkCmdPipelineBarrier2KHR} is called within a render pass instance, the {@code oldLayout} and {@code newLayout} members of any image memory barrier included in this command <b>must</b> be equal</li>
     * <li>If {@code vkCmdPipelineBarrier2KHR} is called within a render pass instance, the {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} members of any image memory barrier included in this command <b>must</b> be equal</li>
     * <li>If {@code vkCmdPipelineBarrier2KHR} is called outside of a render pass instance, {@link VK11#VK_DEPENDENCY_VIEW_LOCAL_BIT DEPENDENCY_VIEW_LOCAL_BIT} <b>must</b> not be included in the dependency flags</li>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
     * <li>The {@code srcStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfo} <b>must</b> only include pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
     * <li>The {@code dstStageMask} member of any element of the {@code pMemoryBarriers}, {@code pBufferMemoryBarriers}, or {@code pImageMemoryBarriers} members of {@code pDependencyInfo} <b>must</b> only include pipeline stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pDependencyInfo} <b>must</b> be a valid pointer to a valid {@link VkDependencyInfoKHR} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Transfer Graphics Compute</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDependencyInfoKHR}</p>
     *
     * @param commandBuffer   the command buffer into which the command is recorded.
     * @param pDependencyInfo a pointer to a {@link VkDependencyInfoKHR} structure defining the scopes of this operation.
     */
    public static void vkCmdPipelineBarrier2KHR(VkCommandBuffer commandBuffer, @NativeType("VkDependencyInfoKHR const *") VkDependencyInfoKHR pDependencyInfo) {
        nvkCmdPipelineBarrier2KHR(commandBuffer, pDependencyInfo.address());
    }

    // --- [ vkCmdWriteTimestamp2KHR ] ---

    /**
     * Write a device timestamp into a query object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To request a timestamp, call:</p>
     * 
     * <pre><code>
     * void vkCmdWriteTimestamp2KHR(
     *     VkCommandBuffer                             commandBuffer,
     *     VkPipelineStageFlags2KHR                    stage,
     *     VkQueryPool                                 queryPool,
     *     uint32_t                                    query);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When {@code vkCmdWriteTimestamp2KHR} is submitted to a queue, it defines an execution dependency on commands that were submitted before it, and writes a timestamp to a query pool.</p>
     * 
     * <p>The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> includes all commands that occur earlier in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-submission-order">submission order</a>. The synchronization scope is limited to operations on the pipeline stage specified by {@code stage}.</p>
     * 
     * <p>The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> includes only the timestamp write operation.</p>
     * 
     * <p>When the timestamp value is written, the availability status of the query is set to available.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>If an implementation is unable to detect completion and latch the timer at any specific stage of the pipeline, it <b>may</b> instead do so at any logically later stage.</p>
     * </div>
     * 
     * <p>Comparisons between timestamps are not meaningful if the timestamps are written by commands submitted to different queues.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>An example of such a comparison is subtracting an older timestamp from a newer one to determine the execution time of a sequence of commands.</p>
     * </div>
     * 
     * <p>If {@code vkCmdWriteTimestamp2KHR} is called while executing a render pass instance that has multiview enabled, the timestamp uses <code>N</code> consecutive query indices in the query pool (starting at {@code query}) where <code>N</code> is the number of bits set in the view mask of the subpass the command is executed in. The resulting query values are determined by an implementation-dependent choice of one of the following behaviors:</p>
     * 
     * <ul>
     * <li>The first query is a timestamp value and (if more than one bit is set in the view mask) zero is written to the remaining queries. If two timestamps are written in the same subpass, the sum of the execution time of all views between those commands is the difference between the first query written by each command.</li>
     * <li>All <code>N</code> queries are timestamp values. If two timestamps are written in the same subpass, the sum of the execution time of all views between those commands is the sum of the difference between corresponding queries written by each command. The difference between corresponding queries <b>may</b> be the execution time of a single view.</li>
     * </ul>
     * 
     * <p>In either case, the application <b>can</b> sum the differences between all <code>N</code> queries to determine the total execution time.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-geometryShader">geometry shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR} or {@link #VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-conditionalRendering">conditional rendering</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-fragmentDensityMap">fragment density map</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-transformFeedback">transform feedback</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-meshShader">mesh shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV PIPELINE_STAGE_2_MESH_SHADER_BIT_NV}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-taskShader">task shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV PIPELINE_STAGE_2_TASK_SHADER_BIT_NV}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-shadingRateImage">shading rate image</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-subpassShading">subpass shading</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link HUAWEISubpassShading#VK_PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-invocationMask">invocation mask image</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link HUAWEIInvocationMask#VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI}</li>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
     * <li>{@code stage} <b>must</b> only include a single pipeline stage</li>
     * <li>{@code stage} <b>must</b> only include stages valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
     * <li>{@code queryPool} <b>must</b> have been created with a {@code queryType} of {@link VK10#VK_QUERY_TYPE_TIMESTAMP QUERY_TYPE_TIMESTAMP}</li>
     * <li>The query identified by {@code queryPool} and {@code query} <b>must</b> be <em>unavailable</em></li>
     * <li>The command pool’s queue family <b>must</b> support a non-zero {@code timestampValidBits}</li>
     * <li>{@code query} <b>must</b> be less than the number of queries in {@code queryPool}</li>
     * <li>All queries used by the command <b>must</b> be unavailable</li>
     * <li>If {@code vkCmdWriteTimestamp2KHR} is called within a render pass instance, the sum of {@code query} and the number of bits set in the current subpass’s view mask <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code stage} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2KHR} values</li>
     * <li>{@code stage} <b>must</b> not be 0</li>
     * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
     * <li>Both of {@code commandBuffer}, and {@code queryPool} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Transfer Graphics Compute</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param stage         specifies a stage of the pipeline.
     * @param queryPool     the query pool that will manage the timestamp.
     * @param query         the query within the query pool that will contain the timestamp.
     */
    public static void vkCmdWriteTimestamp2KHR(VkCommandBuffer commandBuffer, @NativeType("VkPipelineStageFlags2KHR") int stage, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int query) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteTimestamp2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(commandBuffer.address(), stage, queryPool, query, __functionAddress);
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
            if (pSubmits != NULL) { VkSubmitInfo2KHR.validate(pSubmits, submitCount); }
        }
        return callPPJI(queue.address(), submitCount, pSubmits, fence, __functionAddress);
    }

    /**
     * Submits command buffers to a queue.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To submit command buffers to a queue, call:</p>
     * 
     * <pre><code>
     * VkResult vkQueueSubmit2KHR(
     *     VkQueue                                     queue,
     *     uint32_t                                    submitCount,
     *     const VkSubmitInfo2KHR*                     pSubmits,
     *     VkFence                                     fence);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkQueueSubmit2KHR} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-submission">queue submission command</a>, with each batch defined by an element of {@code pSubmits} as an instance of the {@link VkSubmitInfo2KHR} structure.</p>
     * 
     * <p>Semaphore operations submitted with {@link #vkQueueSubmit2KHR QueueSubmit2KHR} have additional ordering constraints compared to other submission commands, with dependencies involving previous and subsequent queue operations. Information about these additional constraints can be found in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-semaphores">semaphore</a> section of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization">the synchronization chapter</a>.</p>
     * 
     * <p>If any command buffer submitted to this queue is in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">executable state</a>, it is moved to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">pending state</a>. Once execution of all submissions of a command buffer complete, it moves from the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">pending state</a>, back to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">executable state</a>. If a command buffer was recorded with the {@link VK10#VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT} flag, it instead moves back to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">invalid state</a>.</p>
     * 
     * <p>If {@code vkQueueSubmit2KHR} fails, it <b>may</b> return {@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY} or {@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}. If it does, the implementation <b>must</b> ensure that the state and contents of any resources or synchronization primitives referenced by the submitted command buffers and any semaphores referenced by {@code pSubmits} is unaffected by the call or its failure. If {@code vkQueueSubmit2KHR} fails in such a way that the implementation is unable to make that guarantee, the implementation <b>must</b> return {@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#devsandqueues-lost-device">Lost Device</a>.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code fence} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be unsignaled</li>
     * <li>If {@code fence} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> not be associated with any other queue command that has not yet completed execution on that queue</li>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
     * <li>If a command recorded into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} referenced an {@code VkEvent}, that event <b>must</b> not be referenced by a command that has been submitted to another queue and is still in the <em>pending state</em></li>
     * <li>The {@code semaphore} member of any binary semaphore element of the {@code pSignalSemaphoreInfos} member of any element of {@code pSubmits} <b>must</b> be unsignaled when the semaphore signal operation it defines is executed on the device</li>
     * <li>The {@code stageMask} member of any element of the {@code pSignalSemaphoreInfos} member of any element of {@code pSubmits} <b>must</b> only include pipeline stages that are supported by the queue family which {@code queue} belongs to</li>
     * <li>The {@code stageMask} member of any element of the {@code pWaitSemaphoreInfos} member of any element of {@code pSubmits} <b>must</b> only include pipeline stages that are supported by the queue family which {@code queue} belongs to</li>
     * <li>When a semaphore wait operation for a binary semaphore is executed, as defined by the {@code semaphore} member of any element of the {@code pWaitSemaphoreInfos} member of any element of {@code pSubmits}, there <b>must</b> be no other queues waiting on the same semaphore</li>
     * <li>The {@code semaphore} member of any element of the {@code pWaitSemaphoreInfos} member of any element of {@code pSubmits} <b>must</b> be semaphores that are signaled, or have <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-semaphores-signaling">semaphore signal operations</a> previously submitted for execution</li>
     * <li>Any {@code semaphore} member of any element of the {@code pWaitSemaphoreInfos} member of any element of {@code pSubmits} that was created with a {@code VkSemaphoreTypeKHR} of {@link KHRTimelineSemaphore#VK_SEMAPHORE_TYPE_BINARY_KHR SEMAPHORE_TYPE_BINARY_KHR} <b>must</b> reference a semaphore signal operation that has been submitted for execution and any semaphore signal operations on which it depends (if any) <b>must</b> have also been submitted for execution</li>
     * <li>The {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">pending or executable state</a></li>
     * <li>If a command recorded into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} was not recorded with the {@link VK10#VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT}, it <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">pending state</a></li>
     * <li>Any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-secondary">secondary command buffers recorded</a> into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">pending or executable state</a></li>
     * <li>If any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-secondary">secondary command buffers recorded</a> into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} was not recorded with the {@link VK10#VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT}, it <b>must</b> not be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">pending state</a></li>
     * <li>The {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} <b>must</b> have been allocated from a {@code VkCommandPool} that was created for the same queue family {@code queue} belongs to</li>
     * <li>If a command recorded into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} includes a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-queue-transfers-acquire">Queue Family Transfer Acquire Operation</a>, there <b>must</b> exist a previously submitted <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-queue-transfers-release">Queue Family Transfer Release Operation</a> on a queue in the queue family identified by the acquire operation, with parameters matching the acquire operation as defined in the definition of such <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-queue-transfers-acquire">acquire operations</a>, and which happens before the acquire operation</li>
     * <li>If a command recorded into the {@code commandBuffer} member of any element of the {@code pCommandBufferInfos} member of any element of {@code pSubmits} was a {@link VK10#vkCmdBeginQuery CmdBeginQuery} whose {@code queryPool} was created with a {@code queryType} of {@link KHRPerformanceQuery#VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR QUERY_TYPE_PERFORMANCE_QUERY_KHR}, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#profiling-lock">profiling lock</a> <b>must</b> have been held continuously on the {@code VkDevice} that {@code queue} was retrieved from, throughout recording of those command buffers</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
     * <li>If {@code submitCount} is not 0, {@code pSubmits} <b>must</b> be a valid pointer to an array of {@code submitCount} valid {@link VkSubmitInfo2KHR} structures</li>
     * <li>If {@code fence} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
     * <li>Both of {@code fence}, and {@code queue} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code queue} <b>must</b> be externally synchronized</li>
     * <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>-</td><td>-</td><td>Any</td></tr></tbody>
     * </table>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSubmitInfo2KHR}</p>
     *
     * @param queue    the queue that the command buffers will be submitted to.
     * @param pSubmits a pointer to an array of {@link VkSubmitInfo2KHR} structures, each specifying a command buffer submission batch.
     * @param fence    an <b>optional</b> handle to a fence to be signaled once all submitted command buffers have completed execution. If {@code fence} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#synchronization-fences-signaling">fence signal operation</a>.
     */
    @NativeType("VkResult")
    public static int vkQueueSubmit2KHR(VkQueue queue, @Nullable @NativeType("VkSubmitInfo2KHR const *") VkSubmitInfo2KHR.Buffer pSubmits, @NativeType("VkFence") long fence) {
        return nvkQueueSubmit2KHR(queue, remainingSafe(pSubmits), memAddressSafe(pSubmits), fence);
    }

    // --- [ vkCmdWriteBufferMarker2AMD ] ---

    /**
     * Execute a pipelined write of a marker value into a buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To write a 32-bit marker value into a buffer as a pipelined operation, call:</p>
     * 
     * <pre><code>
     * void vkCmdWriteBufferMarker2AMD(
     *     VkCommandBuffer                             commandBuffer,
     *     VkPipelineStageFlags2KHR                    stage,
     *     VkBuffer                                    dstBuffer,
     *     VkDeviceSize                                dstOffset,
     *     uint32_t                                    marker);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The command will write the 32-bit marker value into the buffer only after all preceding commands have finished executing up to at least the specified pipeline stage. This includes the completion of other preceding {@code vkCmdWriteBufferMarker2AMD} commands so long as their specified pipeline stages occur either at the same time or earlier than this command’s specified {@code stage}.</p>
     * 
     * <p>While consecutive buffer marker writes with the same {@code stage} parameter implicitly complete in submission order, memory and execution dependencies between buffer marker writes and other operations <b>must</b> still be explicitly ordered using synchronization commands. The access scope for buffer marker writes falls under the {@link VK10#VK_ACCESS_TRANSFER_WRITE_BIT ACCESS_TRANSFER_WRITE_BIT}, and the pipeline stages for identifying the synchronization scope <b>must</b> include both {@code stage} and {@link VK10#VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Similar to {@code vkCmdWriteTimestamp2KHR}, if an implementation is unable to write a marker at any specific pipeline stage, it <b>may</b> instead do so at any logically later stage.</p>
     * </div>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Implementations <b>may</b> only support a limited number of pipelined marker write operations in flight at a given time. Thus an excessive number of marker write operations <b>may</b> degrade command execution performance.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-geometryShader">geometry shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR} or {@link #VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-conditionalRendering">conditional rendering</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-fragmentDensityMap">fragment density map</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-transformFeedback">transform feedback</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-meshShader">mesh shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV PIPELINE_STAGE_2_MESH_SHADER_BIT_NV}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-taskShader">task shaders</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV PIPELINE_STAGE_2_TASK_SHADER_BIT_NV}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-shadingRateImage">shading rate image</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link #VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-subpassShading">subpass shading</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link HUAWEISubpassShading#VK_PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-invocationMask">invocation mask image</a> feature is not enabled, {@code stage} <b>must</b> not contain {@link HUAWEIInvocationMask#VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI}</li>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature <b>must</b> be enabled</li>
     * <li>{@code stage} <b>must</b> include only a single pipeline stage</li>
     * <li>{@code stage} <b>must</b> include only stages that are valid for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
     * <li>{@code dstOffset} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus 4</li>
     * <li>{@code dstBuffer} <b>must</b> have been created with the {@link VK10#VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} usage flag</li>
     * <li>If {@code dstBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>{@code dstOffset} <b>must</b> be a multiple of 4</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code stage} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2KHR} values</li>
     * <li>{@code stage} <b>must</b> not be 0</li>
     * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support transfer, graphics, or compute operations</li>
     * <li>Both of {@code commandBuffer}, and {@code dstBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Transfer Graphics Compute</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param stage         specifies the pipeline stage whose completion triggers the marker write.
     * @param dstBuffer     the buffer where the marker will be written.
     * @param dstOffset     the byte offset into the buffer where the marker will be written.
     * @param marker        the 32-bit value of the marker.
     */
    public static void vkCmdWriteBufferMarker2AMD(VkCommandBuffer commandBuffer, @NativeType("VkPipelineStageFlags2KHR") int stage, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("uint32_t") int marker) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteBufferMarker2AMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(commandBuffer.address(), stage, dstBuffer, dstOffset, marker, __functionAddress);
    }

    // --- [ vkGetQueueCheckpointData2NV ] ---

    /**
     * Unsafe version of: {@link #vkGetQueueCheckpointData2NV GetQueueCheckpointData2NV}
     *
     * @param pCheckpointDataCount a pointer to an integer related to the number of checkpoint markers available or queried, as described below.
     */
    public static void nvkGetQueueCheckpointData2NV(VkQueue queue, long pCheckpointDataCount, long pCheckpointData) {
        long __functionAddress = queue.getCapabilities().vkGetQueueCheckpointData2NV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(queue.address(), pCheckpointDataCount, pCheckpointData, __functionAddress);
    }

    /**
     * retrieve diagnostic checkpoint data.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>If the device encounters an error during execution, the implementation will return a {@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST} error to the application at some point during host execution. When this happens, the application <b>can</b> call {@link #vkGetQueueCheckpointData2NV GetQueueCheckpointData2NV} to retrieve information on the most recent diagnostic checkpoints that were executed by the device.</p>
     * 
     * <pre><code>
     * void vkGetQueueCheckpointData2NV(
     *     VkQueue                                     queue,
     *     uint32_t*                                   pCheckpointDataCount,
     *     VkCheckpointData2NV*                        pCheckpointData);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pCheckpointData} is {@code NULL}, then the number of checkpoint markers available is returned in {@code pCheckpointDataCount}. Otherwise, {@code pCheckpointDataCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pCheckpointData} array, and on return the variable is overwritten with the number of structures actually written to {@code pCheckpointData}.</p>
     * 
     * <p>If {@code pCheckpointDataCount} is less than the number of checkpoint markers available, at most {@code pCheckpointDataCount} structures will be written.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The device that {@code queue} belongs to <b>must</b> be in the lost state</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
     * <li>{@code pCheckpointDataCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pCheckpointDataCount} is not 0, and {@code pCheckpointData} is not {@code NULL}, {@code pCheckpointData} <b>must</b> be a valid pointer to an array of {@code pCheckpointDataCount} {@link VkCheckpointData2NV} structures</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCheckpointData2NV}</p>
     *
     * @param queue                the {@code VkQueue} object the caller would like to retrieve checkpoint data for
     * @param pCheckpointDataCount a pointer to an integer related to the number of checkpoint markers available or queried, as described below.
     * @param pCheckpointData      either {@code NULL} or a pointer to an array of {@link VkCheckpointData2NV} structures.
     */
    public static void vkGetQueueCheckpointData2NV(VkQueue queue, @NativeType("uint32_t *") IntBuffer pCheckpointDataCount, @Nullable @NativeType("VkCheckpointData2NV *") VkCheckpointData2NV.Buffer pCheckpointData) {
        if (CHECKS) {
            check(pCheckpointDataCount, 1);
            checkSafe(pCheckpointData, pCheckpointDataCount.get(pCheckpointDataCount.position()));
        }
        nvkGetQueueCheckpointData2NV(queue, memAddress(pCheckpointDataCount), memAddressSafe(pCheckpointData));
    }

    /** Array version of: {@link #vkCmdWaitEvents2KHR CmdWaitEvents2KHR} */
    public static void vkCmdWaitEvents2KHR(VkCommandBuffer commandBuffer, @NativeType("VkEvent const *") long[] pEvents, @NativeType("VkDependencyInfoKHR const *") VkDependencyInfoKHR.Buffer pDependencyInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWaitEvents2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pDependencyInfos, pEvents.length);
            VkDependencyInfoKHR.validate(pDependencyInfos.address(), pEvents.length);
        }
        callPPPV(commandBuffer.address(), pEvents.length, pEvents, pDependencyInfos.address(), __functionAddress);
    }

    /** Array version of: {@link #vkGetQueueCheckpointData2NV GetQueueCheckpointData2NV} */
    public static void vkGetQueueCheckpointData2NV(VkQueue queue, @NativeType("uint32_t *") int[] pCheckpointDataCount, @Nullable @NativeType("VkCheckpointData2NV *") VkCheckpointData2NV.Buffer pCheckpointData) {
        long __functionAddress = queue.getCapabilities().vkGetQueueCheckpointData2NV;
        if (CHECKS) {
            check(__functionAddress);
            check(pCheckpointDataCount, 1);
            checkSafe(pCheckpointData, pCheckpointDataCount[0]);
        }
        callPPPV(queue.address(), pCheckpointDataCount, memAddressSafe(pCheckpointData), __functionAddress);
    }

}
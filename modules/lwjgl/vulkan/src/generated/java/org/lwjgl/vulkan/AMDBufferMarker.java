/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * This extension adds a new operation to execute pipelined writes of small marker values into a {@code VkBuffer} object.
 * 
 * <p>The primary purpose of these markers is to facilitate the development of debugging tools for tracking which pipelined command contributed to device loss.</p>
 * 
 * <h5>Examples</h5>
 * 
 * <p>None.</p>
 * 
 * <h5>VK_AMD_buffer_marker</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_AMD_buffer_marker}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>180</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Special Use</b></dt>
 * <dd><ul>
 * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#extendingvulkan-compatibility-specialuse">Developer tools</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Daniel Rakos <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_AMD_buffer_marker]%20@drakos-amd%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_AMD_buffer_marker%20extension%3E%3E">drakos-amd</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-01-26</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Matthaeus G. Chajdas, AMD</li>
 * <li>Jaakko Konttinen, AMD</li>
 * <li>Daniel Rakos, AMD</li>
 * </ul></dd>
 * </dl>
 */
public class AMDBufferMarker {

    /** The extension specification version. */
    public static final int VK_AMD_BUFFER_MARKER_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_AMD_BUFFER_MARKER_EXTENSION_NAME = "VK_AMD_buffer_marker";

    protected AMDBufferMarker() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdWriteBufferMarkerAMD ] ---

    /**
     * Execute a pipelined write of a marker value into a buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To write a 32-bit marker value into a buffer as a pipelined operation, call:</p>
     * 
     * <pre><code>
     * void vkCmdWriteBufferMarkerAMD(
     *     VkCommandBuffer                             commandBuffer,
     *     VkPipelineStageFlagBits                     pipelineStage,
     *     VkBuffer                                    dstBuffer,
     *     VkDeviceSize                                dstOffset,
     *     uint32_t                                    marker);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The command will write the 32-bit marker value into the buffer only after all preceding commands have finished executing up to at least the specified pipeline stage. This includes the completion of other preceding {@code vkCmdWriteBufferMarkerAMD} commands so long as their specified pipeline stages occur either at the same time or earlier than this command’s specified {@code pipelineStage}.</p>
     * 
     * <p>While consecutive buffer marker writes with the same {@code pipelineStage} parameter are implicitly complete in submission order, memory and execution dependencies between buffer marker writes and other operations must still be explicitly ordered using synchronization commands. The access scope for buffer marker writes falls under the {@link VK10#VK_ACCESS_TRANSFER_WRITE_BIT ACCESS_TRANSFER_WRITE_BIT}, and the pipeline stages for identifying the synchronization scope <b>must</b> include both {@code pipelineStage} and {@link VK10#VK_PIPELINE_STAGE_TRANSFER_BIT PIPELINE_STAGE_TRANSFER_BIT}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Similar to {@code vkCmdWriteTimestamp}, if an implementation is unable to write a marker at any specific pipeline stage, it <b>may</b> instead do so at any logically later stage.</p>
     * </div>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Implementations <b>may</b> only support a limited number of pipelined marker write operations in flight at a given time, thus excessive number of marker write operations <b>may</b> degrade command execution performance.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code pipelineStage} <b>must</b> be a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages-supported">valid stage</a> for the queue family that was used to create the command pool that {@code commandBuffer} was allocated from</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-geometryShader">geometry shaders</a> feature is not enabled, {@code pipelineStage} <b>must</b> not be {@link VK10#VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code pipelineStage} <b>must</b> not be {@link VK10#VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT} or {@link VK10#VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-conditionalRendering">conditional rendering</a> feature is not enabled, {@code pipelineStage} <b>must</b> not be {@link EXTConditionalRendering#VK_PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-fragmentDensityMap">fragment density map</a> feature is not enabled, {@code pipelineStage} <b>must</b> not be {@link EXTFragmentDensityMap#VK_PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-transformFeedback">transform feedback</a> feature is not enabled, {@code pipelineStage} <b>must</b> not be {@link EXTTransformFeedback#VK_PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-meshShader">mesh shaders</a> feature is not enabled, {@code pipelineStage} <b>must</b> not be {@link NVMeshShader#VK_PIPELINE_STAGE_MESH_SHADER_BIT_NV PIPELINE_STAGE_MESH_SHADER_BIT_NV} or {@link NVMeshShader#VK_PIPELINE_STAGE_TASK_SHADER_BIT_NV PIPELINE_STAGE_TASK_SHADER_BIT_NV}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-shadingRateImage">shading rate image</a> feature is not enabled, {@code pipelineStage} <b>must</b> not be {@link NVShadingRateImage#VK_PIPELINE_STAGE_SHADING_RATE_IMAGE_BIT_NV PIPELINE_STAGE_SHADING_RATE_IMAGE_BIT_NV}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2}</a> feature is not enabled, {@code pipelineStage} <b>must</b> not be {@link VK13#VK_PIPELINE_STAGE_NONE PIPELINE_STAGE_NONE}</li>
     * <li>{@code dstOffset} <b>must</b> be less than or equal to the size of {@code dstBuffer} minus 4</li>
     * <li>{@code dstBuffer} <b>must</b> have been created with {@link VK10#VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} usage flag</li>
     * <li>If {@code dstBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>{@code dstOffset} <b>must</b> be a multiple of 4</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>If {@code pipelineStage} is not 0, {@code pipelineStage} <b>must</b> be a valid {@code VkPipelineStageFlagBits} value</li>
     * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Transfer Graphics Compute</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param pipelineStage a {@code VkPipelineStageFlagBits} value specifying the pipeline stage whose completion triggers the marker write.
     * @param dstBuffer     the buffer where the marker will be written to.
     * @param dstOffset     the byte offset into the buffer where the marker will be written to.
     * @param marker        the 32-bit value of the marker.
     */
    public static void vkCmdWriteBufferMarkerAMD(VkCommandBuffer commandBuffer, @NativeType("VkPipelineStageFlagBits") int pipelineStage, @NativeType("VkBuffer") long dstBuffer, @NativeType("VkDeviceSize") long dstOffset, @NativeType("uint32_t") int marker) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteBufferMarkerAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(commandBuffer.address(), pipelineStage, dstBuffer, dstOffset, marker, __functionAddress);
    }

}
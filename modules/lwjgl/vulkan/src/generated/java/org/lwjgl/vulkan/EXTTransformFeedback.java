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
 * This extension adds transform feedback to the Vulkan API by exposing the SPIR-V {@code TransformFeedback} and {@code GeometryStreams} capabilities to capture vertex, tessellation or geometry shader outputs to one or more buffers. It adds API functionality to bind transform feedback buffers to capture the primitives emitted by the graphics pipeline from SPIR-V outputs decorated for transform feedback. The transform feedback capture can be paused and resumed by way of storing and retrieving a byte counter. The captured data can be drawn again where the vertex count is derived from the byte counter without CPU intervention. If the implementation is capable, a vertex stream other than zero can be rasterized.
 * 
 * <p>All these features are designed to match the full capabilities of OpenGL core transform feedback functionality and beyond. Many of the features are optional to allow base OpenGL ES GPUs to also implement this extension.</p>
 * 
 * <p>The primary purpose of the functionality exposed by this extension is to support translation layers from other 3D APIs. This functionality is not considered forward looking, and is not expected to be promoted to a KHR extension or to core Vulkan. Unless this is needed for translation, it is recommended that developers use alternative techniques of using the GPU to process and capture vertex data.</p>
 * 
 * <h5>VK_EXT_transform_feedback</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_transform_feedback}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>29</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Special Uses</b></dt>
 * <dd><ul>
 * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#extendingvulkan-compatibility-specialuse">OpenGL / ES support</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#extendingvulkan-compatibility-specialuse">D3D support</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#extendingvulkan-compatibility-specialuse">Developer tools</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_transform_feedback]%20@pdaniell-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_transform_feedback%20extension%3E%3E">pdaniell-nv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-10-09</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Baldur Karlsson, Valve</li>
 * <li>Boris Zanin, Mobica</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Donald Scorgie, Imagination</li>
 * <li>Henri Verbeet, CodeWeavers</li>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Jesse Barker, Unity</li>
 * <li>Jesse Hall, Google</li>
 * <li>Pierre-Loup Griffais, Valve</li>
 * <li>Philip Rebohle, DXVK</li>
 * <li>Ruihao Zhang, Qualcomm</li>
 * <li>Samuel Pitoiset, Valve</li>
 * <li>Slawomir Grajewski, Intel</li>
 * <li>Stu Smith, Imagination Technologies</li>
 * </ul></dd>
 * </dl>
 */
public class EXTTransformFeedback {

    /** The extension specification version. */
    public static final int VK_EXT_TRANSFORM_FEEDBACK_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_TRANSFORM_FEEDBACK_EXTENSION_NAME = "VK_EXT_transform_feedback";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT     = 1000028000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT   = 1000028001,
        VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_STREAM_CREATE_INFO_EXT = 1000028002;

    /** Extends {@code VkQueryType}. */
    public static final int VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT = 1000028004;

    /**
     * Extends {@code VkBufferUsageFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT}</li>
     * <li>{@link #VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT}</li>
     * </ul>
     */
    public static final int
        VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT         = 0x800,
        VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT = 0x1000;

    /**
     * Extends {@code VkAccessFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_TRANSFORM_FEEDBACK_WRITE_BIT_EXT ACCESS_TRANSFORM_FEEDBACK_WRITE_BIT_EXT}</li>
     * <li>{@link #VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT}</li>
     * <li>{@link #VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT}</li>
     * </ul>
     */
    public static final int
        VK_ACCESS_TRANSFORM_FEEDBACK_WRITE_BIT_EXT         = 0x2000000,
        VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT  = 0x4000000,
        VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT = 0x8000000;

    /** Extends {@code VkPipelineStageFlagBits}. */
    public static final int VK_PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT = 0x1000000;

    protected EXTTransformFeedback() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdBindTransformFeedbackBuffersEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdBindTransformFeedbackBuffersEXT CmdBindTransformFeedbackBuffersEXT}
     *
     * @param bindingCount the number of transform feedback bindings whose state is updated by the command.
     */
    public static void nvkCmdBindTransformFeedbackBuffersEXT(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, long pBuffers, long pOffsets, long pSizes) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindTransformFeedbackBuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPPV(commandBuffer.address(), firstBinding, bindingCount, pBuffers, pOffsets, pSizes, __functionAddress);
    }

    /**
     * Bind transform feedback buffers to a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To bind transform feedback buffers to a command buffer for use in subsequent drawing commands, call:</p>
     * 
     * <pre><code>
     * void vkCmdBindTransformFeedbackBuffersEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstBinding,
     *     uint32_t                                    bindingCount,
     *     const VkBuffer*                             pBuffers,
     *     const VkDeviceSize*                         pOffsets,
     *     const VkDeviceSize*                         pSizes);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The values taken from elements <code>i</code> of {@code pBuffers}, {@code pOffsets} and {@code pSizes} replace the current state for the transform feedback binding <code>firstBinding + i</code>, for <code>i</code> in <code>[0, bindingCount)</code>. The transform feedback binding is updated to start at the offset indicated by {@code pOffsets}[i] from the start of the buffer {@code pBuffers}[i].</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@link VkPhysicalDeviceTransformFeedbackFeaturesEXT}{@code ::transformFeedback} <b>must</b> be enabled</li>
     * <li>{@code firstBinding} <b>must</b> be less than {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::maxTransformFeedbackBuffers}</li>
     * <li>The sum of {@code firstBinding} and {@code bindingCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::maxTransformFeedbackBuffers}</li>
     * <li>All elements of {@code pOffsets} <b>must</b> be less than the size of the corresponding element in {@code pBuffers}</li>
     * <li>All elements of {@code pOffsets} <b>must</b> be a multiple of 4</li>
     * <li>All elements of {@code pBuffers} <b>must</b> have been created with the {@link #VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT} flag</li>
     * <li>If the optional {@code pSize} array is specified, each element of {@code pSizes} <b>must</b> either be {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, or be less than or equal to {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::maxTransformFeedbackBufferSize}</li>
     * <li>All elements of {@code pSizes} <b>must</b> be either {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, or less than or equal to the size of the corresponding buffer in {@code pBuffers}</li>
     * <li>All elements of {@code pOffsets} plus {@code pSizes}, where the {@code pSizes}, element is not {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, <b>must</b> be less than or equal to the size of the corresponding buffer in {@code pBuffers}</li>
     * <li>Each element of {@code pBuffers} that is non-sparse <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>Transform feedback <b>must</b> not be active when the {@code vkCmdBindTransformFeedbackBuffersEXT} command is recorded</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pBuffers} <b>must</b> be a valid pointer to an array of {@code bindingCount} valid {@code VkBuffer} handles</li>
     * <li>{@code pOffsets} <b>must</b> be a valid pointer to an array of {@code bindingCount} {@code VkDeviceSize} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>{@code bindingCount} <b>must</b> be greater than 0</li>
     * <li>Both of {@code commandBuffer}, and the elements of {@code pBuffers} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command is recorded.
     * @param firstBinding  the index of the first transform feedback binding whose state is updated by the command.
     * @param pBuffers      a pointer to an array of buffer handles.
     * @param pOffsets      a pointer to an array of buffer offsets.
     * @param pSizes        {@code NULL} or a pointer to an array of {@code VkDeviceSize} buffer sizes, specifying the maximum number of bytes to capture to the corresponding transform feedback buffer. If {@code pSizes} is {@code NULL}, or the value of the {@code pSizes} array element is {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, then the maximum number of bytes captured will be the size of the corresponding buffer minus the buffer offset.
     */
    public static void vkCmdBindTransformFeedbackBuffersEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") LongBuffer pBuffers, @NativeType("VkDeviceSize const *") LongBuffer pOffsets, @Nullable @NativeType("VkDeviceSize const *") LongBuffer pSizes) {
        if (CHECKS) {
            check(pOffsets, pBuffers.remaining());
            checkSafe(pSizes, pBuffers.remaining());
        }
        nvkCmdBindTransformFeedbackBuffersEXT(commandBuffer, firstBinding, pBuffers.remaining(), memAddress(pBuffers), memAddress(pOffsets), memAddressSafe(pSizes));
    }

    // --- [ vkCmdBeginTransformFeedbackEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdBeginTransformFeedbackEXT CmdBeginTransformFeedbackEXT}
     *
     * @param counterBufferCount the size of the {@code pCounterBuffers} and {@code pCounterBufferOffsets} arrays.
     */
    public static void nvkCmdBeginTransformFeedbackEXT(VkCommandBuffer commandBuffer, int firstCounterBuffer, int counterBufferCount, long pCounterBuffers, long pCounterBufferOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginTransformFeedbackEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), firstCounterBuffer, counterBufferCount, pCounterBuffers, pCounterBufferOffsets, __functionAddress);
    }

    /**
     * Make transform feedback active in the command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Transform feedback for specific transform feedback buffers is made active by calling:</p>
     * 
     * <pre><code>
     * void vkCmdBeginTransformFeedbackEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstCounterBuffer,
     *     uint32_t                                    counterBufferCount,
     *     const VkBuffer*                             pCounterBuffers,
     *     const VkDeviceSize*                         pCounterBufferOffsets);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The active transform feedback buffers will capture primitives emitted from the corresponding {@code XfbBuffer} in the bound graphics pipeline. Any {@code XfbBuffer} emitted that does not output to an active transform feedback buffer will not be captured.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@link VkPhysicalDeviceTransformFeedbackFeaturesEXT}{@code ::transformFeedback} <b>must</b> be enabled</li>
     * <li>Transform feedback <b>must</b> not be active</li>
     * <li>{@code firstCounterBuffer} <b>must</b> be less than {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::maxTransformFeedbackBuffers}</li>
     * <li>The sum of {@code firstCounterBuffer} and {@code counterBufferCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::maxTransformFeedbackBuffers}</li>
     * <li>If {@code counterBufferCount} is not 0, and {@code pCounterBuffers} is not {@code NULL}, {@code pCounterBuffers} <b>must</b> be a valid pointer to an array of {@code counterBufferCount} {@code VkBuffer} handles that are either valid or {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>For each buffer handle in the array, if it is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} it <b>must</b> reference a buffer large enough to hold 4 bytes at the corresponding offset from the {@code pCounterBufferOffsets} array</li>
     * <li>If {@code pCounterBuffer} is {@code NULL}, then {@code pCounterBufferOffsets} <b>must</b> also be {@code NULL}</li>
     * <li>For each buffer handle in the {@code pCounterBuffers} array that is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} it <b>must</b> have been created with a {@code usage} value containing {@link #VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT}</li>
     * <li>A valid graphics pipeline <b>must</b> be bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
     * <li>The last <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader stage</a> of the bound graphics pipeline <b>must</b> have been declared with the {@code Xfb} execution mode</li>
     * <li>Transform feedback <b>must</b> not be made active in a render pass instance with multiview enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>If {@code counterBufferCount} is not 0, and {@code pCounterBufferOffsets} is not {@code NULL}, {@code pCounterBufferOffsets} <b>must</b> be a valid pointer to an array of {@code counterBufferCount} {@code VkDeviceSize} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
     * <li>Both of {@code commandBuffer}, and the elements of {@code pCounterBuffers} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer         the command buffer into which the command is recorded.
     * @param firstCounterBuffer    the index of the first transform feedback buffer corresponding to {@code pCounterBuffers}[0] and {@code pCounterBufferOffsets}[0].
     * @param pCounterBuffers       {@code NULL} or a pointer to an array of {@code VkBuffer} handles to counter buffers. Each buffer contains a 4 byte integer value representing the byte offset from the start of the corresponding transform feedback buffer from where to start capturing vertex data. If the byte offset stored to the counter buffer location was done using {@link #vkCmdEndTransformFeedbackEXT CmdEndTransformFeedbackEXT} it can be used to resume transform feedback from the previous location. If {@code pCounterBuffers} is {@code NULL}, then transform feedback will start capturing vertex data to byte offset zero in all bound transform feedback buffers. For each element of {@code pCounterBuffers} that is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, transform feedback will start capturing vertex data to byte zero in the corresponding bound transform feedback buffer.
     * @param pCounterBufferOffsets {@code NULL} or a pointer to an array of {@code VkDeviceSize} values specifying offsets within each of the {@code pCounterBuffers} where the counter values were previously written. The location in each counter buffer at these offsets <b>must</b> be large enough to contain 4 bytes of data. This data is the number of bytes captured by the previous transform feedback to this buffer. If {@code pCounterBufferOffsets} is {@code NULL}, then it is assumed the offsets are zero.
     */
    public static void vkCmdBeginTransformFeedbackEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstCounterBuffer, @Nullable @NativeType("VkBuffer const *") LongBuffer pCounterBuffers, @Nullable @NativeType("VkDeviceSize const *") LongBuffer pCounterBufferOffsets) {
        if (CHECKS) {
            checkSafe(pCounterBufferOffsets, remainingSafe(pCounterBuffers));
        }
        nvkCmdBeginTransformFeedbackEXT(commandBuffer, firstCounterBuffer, remainingSafe(pCounterBuffers), memAddressSafe(pCounterBuffers), memAddressSafe(pCounterBufferOffsets));
    }

    // --- [ vkCmdEndTransformFeedbackEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdEndTransformFeedbackEXT CmdEndTransformFeedbackEXT}
     *
     * @param counterBufferCount the size of the {@code pCounterBuffers} and {@code pCounterBufferOffsets} arrays.
     */
    public static void nvkCmdEndTransformFeedbackEXT(VkCommandBuffer commandBuffer, int firstCounterBuffer, int counterBufferCount, long pCounterBuffers, long pCounterBufferOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndTransformFeedbackEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), firstCounterBuffer, counterBufferCount, pCounterBuffers, pCounterBufferOffsets, __functionAddress);
    }

    /**
     * Make transform feedback inactive in the command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Transform feedback for specific transform feedback buffers is made inactive by calling:</p>
     * 
     * <pre><code>
     * void vkCmdEndTransformFeedbackEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstCounterBuffer,
     *     uint32_t                                    counterBufferCount,
     *     const VkBuffer*                             pCounterBuffers,
     *     const VkDeviceSize*                         pCounterBufferOffsets);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@link VkPhysicalDeviceTransformFeedbackFeaturesEXT}{@code ::transformFeedback} <b>must</b> be enabled</li>
     * <li>Transform feedback <b>must</b> be active</li>
     * <li>{@code firstCounterBuffer} <b>must</b> be less than {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::maxTransformFeedbackBuffers}</li>
     * <li>The sum of {@code firstCounterBuffer} and {@code counterBufferCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::maxTransformFeedbackBuffers}</li>
     * <li>If {@code counterBufferCount} is not 0, and {@code pCounterBuffers} is not {@code NULL}, {@code pCounterBuffers} <b>must</b> be a valid pointer to an array of {@code counterBufferCount} {@code VkBuffer} handles that are either valid or {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>For each buffer handle in the array, if it is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} it <b>must</b> reference a buffer large enough to hold 4 bytes at the corresponding offset from the {@code pCounterBufferOffsets} array</li>
     * <li>If {@code pCounterBuffer} is {@code NULL}, then {@code pCounterBufferOffsets} <b>must</b> also be {@code NULL}</li>
     * <li>For each buffer handle in the {@code pCounterBuffers} array that is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} it <b>must</b> have been created with a {@code usage} value containing {@link #VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>If {@code counterBufferCount} is not 0, and {@code pCounterBufferOffsets} is not {@code NULL}, {@code pCounterBufferOffsets} <b>must</b> be a valid pointer to an array of {@code counterBufferCount} {@code VkDeviceSize} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
     * <li>Both of {@code commandBuffer}, and the elements of {@code pCounterBuffers} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer         the command buffer into which the command is recorded.
     * @param firstCounterBuffer    the index of the first transform feedback buffer corresponding to {@code pCounterBuffers}[0] and {@code pCounterBufferOffsets}[0].
     * @param pCounterBuffers       {@code NULL} or a pointer to an array of {@code VkBuffer} handles to counter buffers. The counter buffers are used to record the current byte positions of each transform feedback buffer where the next vertex output data would be captured. This <b>can</b> be used by a subsequent {@link #vkCmdBeginTransformFeedbackEXT CmdBeginTransformFeedbackEXT} call to resume transform feedback capture from this position. It can also be used by {@link #vkCmdDrawIndirectByteCountEXT CmdDrawIndirectByteCountEXT} to determine the vertex count of the draw call.
     * @param pCounterBufferOffsets {@code NULL} or a pointer to an array of {@code VkDeviceSize} values specifying offsets within each of the {@code pCounterBuffers} where the counter values can be written. The location in each counter buffer at these offsets <b>must</b> be large enough to contain 4 bytes of data. The data stored at this location is the byte offset from the start of the transform feedback buffer binding where the next vertex data would be written. If {@code pCounterBufferOffsets} is {@code NULL}, then it is assumed the offsets are zero.
     */
    public static void vkCmdEndTransformFeedbackEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstCounterBuffer, @Nullable @NativeType("VkBuffer const *") LongBuffer pCounterBuffers, @Nullable @NativeType("VkDeviceSize const *") LongBuffer pCounterBufferOffsets) {
        if (CHECKS) {
            checkSafe(pCounterBufferOffsets, remainingSafe(pCounterBuffers));
        }
        nvkCmdEndTransformFeedbackEXT(commandBuffer, firstCounterBuffer, remainingSafe(pCounterBuffers), memAddressSafe(pCounterBuffers), memAddressSafe(pCounterBufferOffsets));
    }

    // --- [ vkCmdBeginQueryIndexedEXT ] ---

    /**
     * Begin an indexed query.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To begin an indexed query, call:</p>
     * 
     * <pre><code>
     * void vkCmdBeginQueryIndexedEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkQueryPool                                 queryPool,
     *     uint32_t                                    query,
     *     VkQueryControlFlags                         flags,
     *     uint32_t                                    index);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@code vkCmdBeginQueryIndexedEXT} command operates the same as the {@link VK10#vkCmdBeginQuery CmdBeginQuery} command, except that it also accepts a query type specific {@code index} parameter.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>All queries used by the command <b>must</b> be unavailable</li>
     * <li>The {@code queryType} used to create {@code queryPool} <b>must</b> not be {@link VK10#VK_QUERY_TYPE_TIMESTAMP QUERY_TYPE_TIMESTAMP}</li>
     * <li>The {@code queryType} used to create {@code queryPool} <b>must</b> not be {@link KHRAccelerationStructure#VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR} or {@link KHRAccelerationStructure#VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR}</li>
     * <li>The {@code queryType} used to create {@code queryPool} <b>must</b> not be {@link NVRayTracing#VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-occlusionQueryPrecise">precise occlusion queries</a> feature is not enabled, or the {@code queryType} used to create {@code queryPool} was not {@link VK10#VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION}, {@code flags} <b>must</b> not contain {@link VK10#VK_QUERY_CONTROL_PRECISE_BIT QUERY_CONTROL_PRECISE_BIT}</li>
     * <li>{@code query} <b>must</b> be less than the number of queries in {@code queryPool}</li>
     * <li>If the {@code queryType} used to create {@code queryPool} was {@link VK10#VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION}, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>If the {@code queryType} used to create {@code queryPool} was {@link VK10#VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS} and any of the {@code pipelineStatistics} indicate graphics operations, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>If the {@code queryType} used to create {@code queryPool} was {@link VK10#VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS} and any of the {@code pipelineStatistics} indicate compute operations, the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
     * <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
     * <li>If called within a render pass instance, the sum of {@code query} and the number of bits set in the current subpass’s view mask <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
     * <li>If the {@code queryType} used to create {@code queryPool} was {@link KHRVideoEncodeQueue#VK_QUERY_TYPE_VIDEO_ENCODE_BITSTREAM_BUFFER_RANGE_KHR QUERY_TYPE_VIDEO_ENCODE_BITSTREAM_BUFFER_RANGE_KHR} the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#video-encode-operations">video encode operations</a></li>
     * <li>If the {@code queryPool} was created with the same {@code queryType} as that of another <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#queries-operation-active">active</a> query within {@code commandBuffer}, then {@code index} <b>must</b> not match the index used for the active query</li>
     * <li>If the {@code queryType} used to create {@code queryPool} was {@link #VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT} the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>If the {@code queryType} used to create {@code queryPool} was {@link #VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT} the {@code index} parameter <b>must</b> be less than {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::maxTransformFeedbackStreams}</li>
     * <li>If the {@code queryType} used to create {@code queryPool} was not {@link #VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT} the {@code index} <b>must</b> be zero</li>
     * <li>If the {@code queryType} used to create {@code queryPool} was {@link #VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT} then {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::transformFeedbackQueries} <b>must</b> be supported</li>
     * </ul>
     * 
     * <ul>
     * <li>If {@code queryPool} was created with a {@code queryType} of {@link KHRPerformanceQuery#VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR QUERY_TYPE_PERFORMANCE_QUERY_KHR}, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#profiling-lock">profiling lock</a> <b>must</b> have been held before {@link VK10#vkBeginCommandBuffer BeginCommandBuffer} was called on {@code commandBuffer}</li>
     * <li>If {@code queryPool} was created with a {@code queryType} of {@link KHRPerformanceQuery#VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR QUERY_TYPE_PERFORMANCE_QUERY_KHR} and one of the counters used to create {@code queryPool} was {@link KHRPerformanceQuery#VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_BUFFER_KHR PERFORMANCE_COUNTER_SCOPE_COMMAND_BUFFER_KHR}, the query begin <b>must</b> be the first recorded command in {@code commandBuffer}</li>
     * <li>If {@code queryPool} was created with a {@code queryType} of {@link KHRPerformanceQuery#VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR QUERY_TYPE_PERFORMANCE_QUERY_KHR} and one of the counters used to create {@code queryPool} was {@link KHRPerformanceQuery#VK_PERFORMANCE_COUNTER_SCOPE_RENDER_PASS_KHR PERFORMANCE_COUNTER_SCOPE_RENDER_PASS_KHR}, the begin command <b>must</b> not be recorded within a render pass instance</li>
     * <li>If {@code queryPool} was created with a {@code queryType} of {@link KHRPerformanceQuery#VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR QUERY_TYPE_PERFORMANCE_QUERY_KHR} and another query pool with a {@code queryType} {@link KHRPerformanceQuery#VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR QUERY_TYPE_PERFORMANCE_QUERY_KHR} has been used within {@code commandBuffer}, its parent primary command buffer or secondary command buffer recorded within the same parent primary command buffer as {@code commandBuffer}, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-performanceCounterMultipleQueryPools">{@code performanceCounterMultipleQueryPools}</a> feature <b>must</b> be enabled</li>
     * <li>If {@code queryPool} was created with a {@code queryType} of {@link KHRPerformanceQuery#VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR QUERY_TYPE_PERFORMANCE_QUERY_KHR}, this command <b>must</b> not be recorded in a command buffer that, either directly or through secondary command buffers, also contains a {@code vkCmdResetQueryPool} command affecting the same query</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
     * <li>{@code flags} <b>must</b> be a valid combination of {@code VkQueryControlFlagBits} values</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which this command will be recorded.
     * @param queryPool     the query pool that will manage the results of the query.
     * @param query         the query index within the query pool that will contain the results.
     * @param flags         a bitmask of {@code VkQueryControlFlagBits} specifying constraints on the types of queries that <b>can</b> be performed.
     * @param index         the query type specific index. When the query type is {@link #VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT} the index represents the vertex stream.
     */
    public static void vkCmdBeginQueryIndexedEXT(VkCommandBuffer commandBuffer, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int query, @NativeType("VkQueryControlFlags") int flags, @NativeType("uint32_t") int index) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginQueryIndexedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(commandBuffer.address(), queryPool, query, flags, index, __functionAddress);
    }

    // --- [ vkCmdEndQueryIndexedEXT ] ---

    /**
     * Ends a query.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To end an indexed query after the set of desired drawing or dispatching commands is recorded, call:</p>
     * 
     * <pre><code>
     * void vkCmdEndQueryIndexedEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkQueryPool                                 queryPool,
     *     uint32_t                                    query,
     *     uint32_t                                    index);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@code vkCmdEndQueryIndexedEXT} command operates the same as the {@link VK10#vkCmdEndQuery CmdEndQuery} command, except that it also accepts a query type specific {@code index} parameter.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>All queries used by the command <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#queries-operation-active">active</a></li>
     * <li>{@code query} <b>must</b> be less than the number of queries in {@code queryPool}</li>
     * <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
     * <li>If {@code vkCmdEndQueryIndexedEXT} is called within a render pass instance, the sum of {@code query} and the number of bits set in the current subpass’s view mask <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
     * <li>If the {@code queryType} used to create {@code queryPool} was {@link #VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT} the {@code index} parameter <b>must</b> be less than {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::maxTransformFeedbackStreams}</li>
     * <li>If the {@code queryType} used to create {@code queryPool} was not {@link #VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT} the {@code index} <b>must</b> be zero</li>
     * <li>If the {@code queryType} used to create {@code queryPool} was {@link #VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT} {@code index} <b>must</b> equal the {@code index} used to begin the query</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
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
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which this command will be recorded.
     * @param queryPool     the query pool that is managing the results of the query.
     * @param query         the query index within the query pool where the result is stored.
     * @param index         the query type specific index.
     */
    public static void vkCmdEndQueryIndexedEXT(VkCommandBuffer commandBuffer, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int query, @NativeType("uint32_t") int index) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndQueryIndexedEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(commandBuffer.address(), queryPool, query, index, __functionAddress);
    }

    // --- [ vkCmdDrawIndirectByteCountEXT ] ---

    /**
     * Draw primitives with indirect parameters where the vertex count is derived from the counter byte value in the counter buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To record a non-indexed draw call, where the vertex count is based on a byte count read from a buffer and the passed in vertex stride parameter, call:</p>
     * 
     * <pre><code>
     * void vkCmdDrawIndirectByteCountEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    instanceCount,
     *     uint32_t                                    firstInstance,
     *     VkBuffer                                    counterBuffer,
     *     VkDeviceSize                                counterBufferOffset,
     *     uint32_t                                    counterOffset,
     *     uint32_t                                    vertexStride);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>When the command is executed, primitives are assembled in the same way as done with {@link VK10#vkCmdDraw CmdDraw} except the {@code vertexCount} is calculated based on the byte count read from {@code counterBuffer} at offset {@code counterBufferOffset}. The assembled primitives execute the bound graphics pipeline.</p>
     * 
     * <p>The effective {@code vertexCount} is calculated as follows:</p>
     * 
     * <pre><code>
     * const uint32_t * counterBufferPtr = (const uint8_t *)counterBuffer.address + counterBufferOffset;
     * vertexCount = floor(max(0, (*counterBufferPtr - counterOffset)) / vertexStride);</code></pre>
     * 
     * <p>The effective {@code firstVertex} is zero.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If a {@code VkSampler} created with {@code magFilter} or {@code minFilter} equal to {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR} and {@code compareEnable} equal to {@link VK10#VK_FALSE FALSE} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
     * <li>If a {@code VkSampler} created with {@code mipmapMode} equal to {@link VK10#VK_SAMPLER_MIPMAP_MODE_LINEAR SAMPLER_MIPMAP_MODE_LINEAR} and {@code compareEnable} equal to {@link VK10#VK_FALSE FALSE} is used to sample a {@code VkImageView} as a result of this command, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
     * <li>If a {@code VkImageView} is sampled with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-depth-compare-operation">depth comparison</a>, the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT}</li>
     * <li>If a {@code VkImageView} is accessed using atomic operations as a result of this command, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT}</li>
     * <li>If a {@code VkImageView} is sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command, then the image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> <b>must</b> contain {@link EXTFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT}</li>
     * <li>Any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering, as specified by {@link VkFilterCubicImageViewImageFormatPropertiesEXT}{@code ::filterCubic} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
     * <li>Any {@code VkImageView} being sampled with {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT} with a reduction mode of either {@link VK12#VK_SAMPLER_REDUCTION_MODE_MIN SAMPLER_REDUCTION_MODE_MIN} or {@link VK12#VK_SAMPLER_REDUCTION_MODE_MAX SAMPLER_REDUCTION_MODE_MAX} as a result of this command <b>must</b> have a {@code VkImageViewType} and format that supports cubic filtering together with minmax filtering, as specified by {@link VkFilterCubicImageViewImageFormatPropertiesEXT}{@code ::filterCubicMinmax} returned by {@code vkGetPhysicalDeviceImageFormatProperties2}</li>
     * <li>Any {@code VkImage} created with a {@link VkImageCreateInfo}{@code ::flags} containing {@link NVCornerSampledImage#VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV IMAGE_CREATE_CORNER_SAMPLED_BIT_NV} sampled as a result of this command <b>must</b> only be sampled using a {@code VkSamplerAddressMode} of {@link VK10#VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE}</li>
     * <li>Any {@code VkImageView} or {@code VkBufferView} being written as a storage image or storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown} then the view’s format feature <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT}</li>
     * <li>Any {@code VkImageView} or {@code VkBufferView} being read as a storage image or storage texel buffer where the image format field of the {@code OpTypeImage} is {@code Unknown} then the view’s format feature <b>must</b> contain {@link VK13#VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT}</li>
     * <li>For each set <em>n</em> that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a descriptor set <b>must</b> have been bound to <em>n</em> at the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for set <em>n</em>, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-maintenance4">{@code maintenance4}</a> feature is not enabled, then for each push constant that is statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command, a push constant value <b>must</b> have been set for the same pipeline bind point, with a {@code VkPipelineLayout} that is compatible for push constants, with the {@code VkPipelineLayout} used to create the current {@code VkPipeline}, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-compatibility">Pipeline Layout Compatibility</a></li>
     * <li>Descriptors in each bound descriptor set, specified via {@code vkCmdBindDescriptorSets}, <b>must</b> be valid if they are statically used by the {@code VkPipeline} bound to the pipeline bind point used by this command</li>
     * <li>A valid pipeline <b>must</b> be bound to the pipeline bind point used by this command</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command requires any dynamic state, that state <b>must</b> have been set or inherited (if the {@link NVInheritedViewportScissor VK_NV_inherited_viewport_scissor} extension is enabled) for {@code commandBuffer}, and done so after any previously bound pipeline with the corresponding state not specified as dynamic</li>
     * <li>There <b>must</b> not have been any calls to dynamic state setting commands for any state not specified as dynamic in the {@code VkPipeline} object bound to the pipeline bind point used by this command, since that pipeline was bound</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used to sample from any {@code VkImage} with a {@code VkImageView} of the type {@link VK10#VK_IMAGE_VIEW_TYPE_3D IMAGE_VIEW_TYPE_3D}, {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE IMAGE_VIEW_TYPE_CUBE}, {@link VK10#VK_IMAGE_VIEW_TYPE_1D_ARRAY IMAGE_VIEW_TYPE_1D_ARRAY}, {@link VK10#VK_IMAGE_VIEW_TYPE_2D_ARRAY IMAGE_VIEW_TYPE_2D_ARRAY} or {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY}, in any shader stage</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions with {@code ImplicitLod}, {@code Dref} or {@code Proj} in their name, in any shader stage</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} object that uses unnormalized coordinates, that sampler <b>must</b> not be used with any of the SPIR-V {@code OpImageSample*} or {@code OpImageSparseSample*} instructions that includes a LOD bias or any offset values, in any shader stage</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a uniform buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">robust buffer access</a> feature is not enabled, and if the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a storage buffer, it <b>must</b> not access values outside of the range of the buffer as specified in the descriptor set bound to the same pipeline bind point</li>
     * <li>If {@code commandBuffer} is an unprotected command buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-protectedNoFault">{@code protectedNoFault}</a> is not supported, any resource accessed by the {@code VkPipeline} object bound to the pipeline bind point used by this command <b>must</b> not be a protected resource</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} or {@code VkImageView} object that enables <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> only be used with {@code OpImageSample*} or {@code OpImageSparseSample*} instructions</li>
     * <li>If the {@code VkPipeline} object bound to the pipeline bind point used by this command accesses a {@code VkSampler} or {@code VkImageView} object that enables <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a>, that object <b>must</b> not use the {@code ConstOffset} and {@code Offset} operands</li>
     * <li>If a {@code VkImageView} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the image view’s format</li>
     * <li>If a {@code VkBufferView} is accessed using {@code OpImageWrite} as a result of this command, then the {@code Type} of the {@code Texel} operand of that instruction <b>must</b> have at least as many components as the buffer view’s format</li>
     * <li>If a {@code VkImageView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
     * <li>If a {@code VkImageView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
     * <li>If a {@code VkBufferView} with a {@code VkFormat} that has a 64-bit component width is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 64</li>
     * <li>If a {@code VkBufferView} with a {@code VkFormat} that has a component width less than 64-bit is accessed as a result of this command, the {@code SampledType} of the {@code OpTypeImage} operand of that instruction <b>must</b> have a {@code Width} of 32</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkImage} objects created with the {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-sparseImageInt64Atomics">{@code sparseImageInt64Atomics}</a> feature is not enabled, {@code VkBuffer} objects created with the {@link VK10#VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT BUFFER_CREATE_SPARSE_RESIDENCY_BIT} flag <b>must</b> not be accessed by atomic instructions through an {@code OpTypeImage} with a {@code SampledType} with a {@code Width} of 64 by this command</li>
     * <li>The current render pass <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-compatibility">compatible</a> with the {@code renderPass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
     * <li>The subpass index of the current render pass <b>must</b> be equal to the {@code subpass} member of the {@link VkGraphicsPipelineCreateInfo} structure specified when creating the {@code VkPipeline} bound to {@link VK10#VK_PIPELINE_BIND_POINT_GRAPHICS PIPELINE_BIND_POINT_GRAPHICS}</li>
     * <li>Every input attachment used by the current subpass <b>must</b> be bound to the pipeline via a descriptor set</li>
     * <li>Memory backing image subresources used as attachments in the current render pass <b>must</b> not be written in any way other than as an attachment by this command</li>
     * <li>If any recorded command in the current subpass will write to an image subresource as an attachment, this command <b>must</b> not read from the memory backing that image subresource in any other way than as an attachment</li>
     * <li>If any recorded command in the current subpass will read from an image subresource used as an attachment in any way other than as an attachment, this command <b>must</b> not write to that image subresource as an attachment</li>
     * <li>If the draw is recorded in a render pass instance with multiview enabled, the maximum instance index <b>must</b> be less than or equal to {@link VkPhysicalDeviceMultiviewProperties}{@code ::maxMultiviewInstanceIndex}</li>
     * <li>If the bound graphics pipeline was created with {@link VkPipelineSampleLocationsStateCreateInfoEXT}{@code ::sampleLocationsEnable} set to {@link VK10#VK_TRUE TRUE} and the current subpass has a depth/stencil attachment, then that attachment <b>must</b> have been created with the {@link EXTSampleLocations#VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT} bit set</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, but not the {@link VK13#VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT DYNAMIC_STATE_SCISSOR_WITH_COUNT} dynamic state enabled, then {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> match the {@link VkPipelineViewportStateCreateInfo}{@code ::scissorCount} of the pipeline</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT DYNAMIC_STATE_SCISSOR_WITH_COUNT} dynamic state enabled, but not the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, then {@link VK13#vkCmdSetScissorWithCount CmdSetScissorWithCount} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code scissorCount} parameter of {@code vkCmdSetScissorWithCount} <b>must</b> match the {@link VkPipelineViewportStateCreateInfo}{@code ::viewportCount} of the pipeline</li>
     * <li>If the bound graphics pipeline state was created with both the {@link VK13#VK_DYNAMIC_STATE_SCISSOR_WITH_COUNT DYNAMIC_STATE_SCISSOR_WITH_COUNT} and {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic states enabled then both {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount} and {@link VK13#vkCmdSetScissorWithCount CmdSetScissorWithCount} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> match the {@code scissorCount} parameter of {@code vkCmdSetScissorWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, but not the {@link NVClipSpaceWScaling#VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV DYNAMIC_STATE_VIEWPORT_W_SCALING_NV} dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportWScalingStateCreateInfoNV}{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} and {@link NVClipSpaceWScaling#VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV DYNAMIC_STATE_VIEWPORT_W_SCALING_NV} dynamic states enabled then the {@code viewportCount} parameter in the last call to {@link NVClipSpaceWScaling#vkCmdSetViewportWScalingNV CmdSetViewportWScalingNV} <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, but not the {@link NVShadingRateImage#VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV} dynamic state enabled, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportShadingRateImageStateCreateInfoNV}{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} and {@link NVShadingRateImage#VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV} dynamic states enabled then the {@code viewportCount} parameter in the last call to {@link NVShadingRateImage#vkCmdSetViewportShadingRatePaletteNV CmdSetViewportShadingRatePaletteNV} <b>must</b> be greater than or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled and a {@link VkPipelineViewportSwizzleStateCreateInfoNV} structure chained from {@code VkPipelineVieportCreateInfo}, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportSwizzleStateCreateInfoNV}{@code ::viewportCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled and a {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV} structure chained from {@code VkPipelineVieportCreateInfo}, then the bound graphics pipeline <b>must</b> have been created with {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV}{@code ::exclusiveScissorCount} greater or equal to the {@code viewportCount} parameter in the last call to {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount}</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE} dynamic state enabled then {@link VK13#vkCmdSetRasterizerDiscardEnable CmdSetRasterizerDiscardEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link VK13#VK_DYNAMIC_STATE_DEPTH_BIAS_ENABLE DYNAMIC_STATE_DEPTH_BIAS_ENABLE} dynamic state enabled then {@link VK13#vkCmdSetDepthBiasEnable CmdSetDepthBiasEnable} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState2#VK_DYNAMIC_STATE_LOGIC_OP_EXT DYNAMIC_STATE_LOGIC_OP_EXT} dynamic state enabled then {@link EXTExtendedDynamicState2#vkCmdSetLogicOpEXT CmdSetLogicOpEXT} <b>must</b> have been called in the current command buffer prior to this drawing command and the {@code logicOp} <b>must</b> be a valid {@code VkLogicOp} value</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-primitiveFragmentShadingRateWithMultipleViewports">{@code primitiveFragmentShadingRateWithMultipleViewports}</a> limit is not supported, the bound graphics pipeline was created with the {@link VK13#VK_DYNAMIC_STATE_VIEWPORT_WITH_COUNT DYNAMIC_STATE_VIEWPORT_WITH_COUNT} dynamic state enabled, and any of the shader stages of the bound graphics pipeline write to the {@code PrimitiveShadingRateKHR} built-in, then {@link VK13#vkCmdSetViewportWithCount CmdSetViewportWithCount} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code viewportCount} parameter of {@code vkCmdSetViewportWithCount} <b>must</b> be 1</li>
     * <li>If rasterization is not disabled in the bound graphics pipeline, then for each color attachment in the subpass, if the corresponding image view’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-view-format-features">format features</a> do not contain {@link VK10#VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT}, then the {@code blendEnable} member of the corresponding element of the {@code pAttachments} member of {@code pColorBlendState} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
     * <li>If rasterization is not disabled in the bound graphics pipeline, and neither the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} nor the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extensions are enabled, then {@link VkPipelineMultisampleStateCreateInfo}{@code ::rasterizationSamples} <b>must</b> be the same as the current subpass color and/or depth/stencil attachments</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pDepthAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pDepthAttachment} is {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the depth attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pStencilAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pStencilAttachment} is {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the stencil attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pDepthAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pDepthAttachment} is {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL}, this command <b>must</b> not write any values to the depth attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pStencilAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pStencilAttachment} is {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the stencil attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pDepthAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pDepthAttachment} is {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the depth attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the {@code imageView} member of {@code pStencilAttachment} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, and the {@code layout} member of {@code pStencilAttachment} is {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}, this command <b>must</b> not write any values to the stencil attachment</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound graphics pipeline <b>must</b> have been created with a {@link VkPipelineRenderingCreateInfo}{@code ::viewMask} equal to {@link VkRenderingInfo}{@code ::viewMask}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound graphics pipeline <b>must</b> have been created with a {@link VkPipelineRenderingCreateInfo}{@code ::colorAttachmentCount} equal to {@link VkRenderingInfo}{@code ::colorAttachmentCount}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingInfo}{@code ::colorAttachmentCount} greater than 0, then each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with a {@code imageView} not equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have been created with a {@code VkFormat} equal to the corresponding element of {@link VkPipelineRenderingCreateInfo}{@code ::pColorAttachmentFormats} used to create the currently bound graphics pipeline</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingInfo}{@code ::pDepthAttachment→pname}:imageView was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@link VkPipelineRenderingCreateInfo}{@code ::depthAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to the {@code VkFormat} used to create {@link VkRenderingInfo}{@code ::pDepthAttachment→pname}:imageView</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingInfo}{@code ::pStencilAttachment→pname}:imageView was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@link VkPipelineRenderingCreateInfo}{@code ::stencilAttachmentFormat} used to create the currently bound graphics pipeline <b>must</b> be equal to the {@code VkFormat} used to create {@link VkRenderingInfo}{@code ::pStencilAttachment→pname}:imageView</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingFragmentShadingRateAttachmentInfoKHR}{@code ::imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the currently bound graphics pipeline <b>must</b> have been created with {@link KHRDynamicRendering#VK_PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR}</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} and {@link VkRenderingFragmentDensityMapAttachmentInfoEXT}{@code ::imageView} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the currently bound graphics pipeline <b>must</b> have been created with {@link KHRDynamicRendering#VK_PIPELINE_CREATE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT PIPELINE_CREATE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT}</li>
     * <li>If the currently bound pipeline was created with a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} with a {@link VkRenderingInfo}{@code ::colorAttachmentCount} parameter greater than 0, then each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with a {@code imageView} not equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have been created with a sample count equal to the corresponding element of the {@code pColorAttachmentSamples} member of {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} used to create the currently bound graphics pipeline</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline was created with a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and {@link VkRenderingInfo}{@code ::pDepthAttachment→pname}:imageView was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of the {@code depthStencilAttachmentSamples} member of {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} used to create the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create {@link VkRenderingInfo}{@code ::pDepthAttachment→pname}:imageView</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline was created with a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and {@link VkRenderingInfo}{@code ::pStencilAttachment→pname}:imageView was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of the {@code depthStencilAttachmentSamples} member of {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} used to create the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create {@link VkRenderingInfo}{@code ::pStencilAttachment→pname}:imageView</li>
     * <li>If the currently bound pipeline was created without a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering} with a {@link VkRenderingInfo}{@code ::colorAttachmentCount} parameter greater than 0, then each element of the {@link VkRenderingInfo}{@code ::pColorAttachments} array with a {@code imageView} not equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> have been created with a sample count equal to the value of {@link VkPipelineMultisampleStateCreateInfo}{@code ::rasterizationSamples} used to create the currently bound graphics pipeline</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline was created without a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and {@link VkRenderingInfo}{@code ::pDepthAttachment→pname}:imageView was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@link VkPipelineMultisampleStateCreateInfo}{@code ::rasterizationSamples} used to create the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create {@link VkRenderingInfo}{@code ::pDepthAttachment→pname}:imageView</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline was created without a {@link VkAttachmentSampleCountInfoAMD} or {@link VkAttachmentSampleCountInfoNV} structure, and {@link VkRenderingInfo}{@code ::pStencilAttachment→pname}:imageView was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the value of {@link VkPipelineMultisampleStateCreateInfo}{@code ::rasterizationSamples} used to create the currently bound graphics pipeline <b>must</b> be equal to the sample count used to create {@link VkRenderingInfo}{@code ::pStencilAttachment→pname}:imageView</li>
     * <li>If the current render pass instance was begun with {@link VK13#vkCmdBeginRendering CmdBeginRendering}, the currently bound pipeline <b>must</b> have been created with a {@link VkGraphicsPipelineCreateInfo}{@code ::renderPass} equal to {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * </ul>
     * 
     * <ul>
     * <li>All vertex input bindings accessed via vertex input variables declared in the vertex shader entry point’s interface <b>must</b> have either valid or {@link VK10#VK_NULL_HANDLE NULL_HANDLE} buffers bound</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-nullDescriptor">nullDescriptor</a> feature is not enabled, all vertex input bindings accessed via vertex input variables declared in the vertex shader entry point’s interface <b>must</b> not be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
     * <li>For a given vertex buffer binding, any attribute data fetched <b>must</b> be entirely contained within the corresponding vertex buffer binding, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fxvertex-input">Vertex Input Description</a></li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState#VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY_EXT DYNAMIC_STATE_PRIMITIVE_TOPOLOGY_EXT} dynamic state enabled then {@link EXTExtendedDynamicState#vkCmdSetPrimitiveTopologyEXT CmdSetPrimitiveTopologyEXT} <b>must</b> have been called in the current command buffer prior to this drawing command, and the {@code primitiveTopology} parameter of {@code vkCmdSetPrimitiveTopologyEXT} <b>must</b> be of the same <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#drawing-primitive-topology-class">topology class</a> as the pipeline {@link VkPipelineInputAssemblyStateCreateInfo}{@code ::topology} state</li>
     * <li>If the bound graphics pipeline was created with both the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} and {@link EXTExtendedDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT} dynamic states enabled, then {@link EXTVertexInputDynamicState#vkCmdSetVertexInputEXT CmdSetVertexInputEXT} <b>must</b> have been called in the current command buffer prior to this draw command</li>
     * <li>If the bound graphics pipeline was created with the {@link EXTExtendedDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE_EXT} dynamic state enabled, but not the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} dynamic state enabled, then {@link EXTExtendedDynamicState#vkCmdBindVertexBuffers2EXT CmdBindVertexBuffers2EXT} <b>must</b> have been called in the current command buffer prior to this draw command, and the {@code pStrides} parameter of {@link EXTExtendedDynamicState#vkCmdBindVertexBuffers2EXT CmdBindVertexBuffers2EXT} <b>must</b> not be {@code NULL}</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTVertexInputDynamicState#VK_DYNAMIC_STATE_VERTEX_INPUT_EXT DYNAMIC_STATE_VERTEX_INPUT_EXT} dynamic state enabled, then {@link EXTVertexInputDynamicState#vkCmdSetVertexInputEXT CmdSetVertexInputEXT} <b>must</b> have been called in the current command buffer prior to this draw command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState2#VK_DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT} dynamic state enabled then {@link EXTExtendedDynamicState2#vkCmdSetPatchControlPointsEXT CmdSetPatchControlPointsEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>If the bound graphics pipeline state was created with the {@link EXTExtendedDynamicState2#VK_DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE_EXT DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE_EXT} dynamic state enabled then {@link EXTExtendedDynamicState2#vkCmdSetPrimitiveRestartEnableEXT CmdSetPrimitiveRestartEnableEXT} <b>must</b> have been called in the current command buffer prior to this drawing command</li>
     * <li>The bound graphics pipeline <b>must</b> not have been created with the {@link VkPipelineShaderStageCreateInfo}{@code ::stage} member of an element of {@link VkGraphicsPipelineCreateInfo}{@code ::pStages} set to {@link NVMeshShader#VK_SHADER_STAGE_TASK_BIT_NV SHADER_STAGE_TASK_BIT_NV} or {@link NVMeshShader#VK_SHADER_STAGE_MESH_BIT_NV SHADER_STAGE_MESH_BIT_NV}</li>
     * <li>{@link VkPhysicalDeviceTransformFeedbackFeaturesEXT}{@code ::transformFeedback} <b>must</b> be enabled</li>
     * <li>The implementation <b>must</b> support {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT}{@code ::transformFeedbackDraw}</li>
     * <li>{@code vertexStride} <b>must</b> be greater than 0 and less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxTransformFeedbackBufferDataStride}</li>
     * <li>If {@code counterBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>{@code counterBuffer} <b>must</b> have been created with the {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set</li>
     * <li>{@code counterBufferOffset} <b>must</b> be a multiple of 4</li>
     * <li>{@code commandBuffer} <b>must</b> not be a protected command buffer</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code counterBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called inside of a render pass instance</li>
     * <li>Both of {@code commandBuffer}, and {@code counterBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Inside</td><td>Graphics</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer       the command buffer into which the command is recorded.
     * @param instanceCount       the number of instances to draw.
     * @param firstInstance       the instance ID of the first instance to draw.
     * @param counterBuffer       the buffer handle from where the byte count is read.
     * @param counterBufferOffset the offset into the buffer used to read the byte count, which is used to calculate the vertex count for this draw call.
     * @param counterOffset       subtracted from the byte count read from the {@code counterBuffer} at the {@code counterBufferOffset}
     * @param vertexStride        the stride in bytes between each element of the vertex data that is used to calculate the vertex count from the counter value. This value is typically the same value that was used in the graphics pipeline state when the transform feedback was captured as the {@code XfbStride}.
     */
    public static void vkCmdDrawIndirectByteCountEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int instanceCount, @NativeType("uint32_t") int firstInstance, @NativeType("VkBuffer") long counterBuffer, @NativeType("VkDeviceSize") long counterBufferOffset, @NativeType("uint32_t") int counterOffset, @NativeType("uint32_t") int vertexStride) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdDrawIndirectByteCountEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJJV(commandBuffer.address(), instanceCount, firstInstance, counterBuffer, counterBufferOffset, counterOffset, vertexStride, __functionAddress);
    }

    /** Array version of: {@link #vkCmdBindTransformFeedbackBuffersEXT CmdBindTransformFeedbackBuffersEXT} */
    public static void vkCmdBindTransformFeedbackBuffersEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstBinding, @NativeType("VkBuffer const *") long[] pBuffers, @NativeType("VkDeviceSize const *") long[] pOffsets, @Nullable @NativeType("VkDeviceSize const *") long[] pSizes) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBindTransformFeedbackBuffersEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pOffsets, pBuffers.length);
            checkSafe(pSizes, pBuffers.length);
        }
        callPPPPV(commandBuffer.address(), firstBinding, pBuffers.length, pBuffers, pOffsets, pSizes, __functionAddress);
    }

    /** Array version of: {@link #vkCmdBeginTransformFeedbackEXT CmdBeginTransformFeedbackEXT} */
    public static void vkCmdBeginTransformFeedbackEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstCounterBuffer, @Nullable @NativeType("VkBuffer const *") long[] pCounterBuffers, @Nullable @NativeType("VkDeviceSize const *") long[] pCounterBufferOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBeginTransformFeedbackEXT;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(pCounterBufferOffsets, lengthSafe(pCounterBuffers));
        }
        callPPPV(commandBuffer.address(), firstCounterBuffer, lengthSafe(pCounterBuffers), pCounterBuffers, pCounterBufferOffsets, __functionAddress);
    }

    /** Array version of: {@link #vkCmdEndTransformFeedbackEXT CmdEndTransformFeedbackEXT} */
    public static void vkCmdEndTransformFeedbackEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstCounterBuffer, @Nullable @NativeType("VkBuffer const *") long[] pCounterBuffers, @Nullable @NativeType("VkDeviceSize const *") long[] pCounterBufferOffsets) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdEndTransformFeedbackEXT;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(pCounterBufferOffsets, lengthSafe(pCounterBuffers));
        }
        callPPPV(commandBuffer.address(), firstCounterBuffer, lengthSafe(pCounterBuffers), pCounterBuffers, pCounterBufferOffsets, __functionAddress);
    }

}
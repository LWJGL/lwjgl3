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
 * This extension allows applications to insert markers in the command stream and associate them with custom data.
 * 
 * <p>If a device lost error occurs, the application <b>may</b> then query the implementation for the last markers to cross specific implementation-defined pipeline stages, in order to narrow down which commands were executing at the time and might have caused the failure.</p>
 * 
 * <h5>VK_NV_device_diagnostic_checkpoints</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_device_diagnostic_checkpoints}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>207</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Nuno Subtil <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_device_diagnostic_checkpoints]%20@nsubtil%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_device_diagnostic_checkpoints%20extension%3E%3E">nsubtil</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-07-16</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Oleg Kuznetsov, NVIDIA</li>
 * <li>Alex Dunn, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Eric Werness, NVIDIA</li>
 * <li>Daniel Koch, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class NVDeviceDiagnosticCheckpoints {

    /** The extension specification version. */
    public static final int VK_NV_DEVICE_DIAGNOSTIC_CHECKPOINTS_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_NV_DEVICE_DIAGNOSTIC_CHECKPOINTS_EXTENSION_NAME = "VK_NV_device_diagnostic_checkpoints";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_CHECKPOINT_DATA_NV STRUCTURE_TYPE_CHECKPOINT_DATA_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_CHECKPOINT_DATA_NV                    = 1000206000,
        VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_NV = 1000206001;

    protected NVDeviceDiagnosticCheckpoints() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetCheckpointNV ] ---

    /**
     * Insert diagnostic checkpoint in command stream.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Device diagnostic checkpoints are inserted into the command stream by calling {@link #vkCmdSetCheckpointNV CmdSetCheckpointNV}.</p>
     * 
     * <pre><code>
     * void vkCmdSetCheckpointNV(
     *     VkCommandBuffer                             commandBuffer,
     *     const void*                                 pCheckpointMarker);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, compute, or transfer operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute Transfer</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer     the command buffer that will receive the marker
     * @param pCheckpointMarker an opaque application-provided value that will be associated with the checkpoint.
     */
    public static void vkCmdSetCheckpointNV(VkCommandBuffer commandBuffer, @NativeType("void const *") long pCheckpointMarker) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetCheckpointNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pCheckpointMarker, __functionAddress);
    }

    // --- [ vkGetQueueCheckpointDataNV ] ---

    /**
     * Unsafe version of: {@link #vkGetQueueCheckpointDataNV GetQueueCheckpointDataNV}
     *
     * @param pCheckpointDataCount a pointer to an integer related to the number of checkpoint markers available or queried, as described below.
     */
    public static void nvkGetQueueCheckpointDataNV(VkQueue queue, long pCheckpointDataCount, long pCheckpointData) {
        long __functionAddress = queue.getCapabilities().vkGetQueueCheckpointDataNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(queue.address(), pCheckpointDataCount, pCheckpointData, __functionAddress);
    }

    /**
     * Retrieve diagnostic checkpoint data.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>If the device encounters an error during execution, the implementation will return a {@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST} error to the application at a certain point during host execution. When this happens, the application <b>can</b> call {@link #vkGetQueueCheckpointDataNV GetQueueCheckpointDataNV} to retrieve information on the most recent diagnostic checkpoints that were executed by the device.</p>
     * 
     * <pre><code>
     * void vkGetQueueCheckpointDataNV(
     *     VkQueue                                     queue,
     *     uint32_t*                                   pCheckpointDataCount,
     *     VkCheckpointDataNV*                         pCheckpointData);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pCheckpointData} is {@code NULL}, then the number of checkpoint markers available is returned in {@code pCheckpointDataCount}.</p>
     * 
     * <p>Otherwise, {@code pCheckpointDataCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pCheckpointData} array, and on return the variable is overwritten with the number of structures actually written to {@code pCheckpointData}.</p>
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
     * <li>If the value referenced by {@code pCheckpointDataCount} is not 0, and {@code pCheckpointData} is not {@code NULL}, {@code pCheckpointData} <b>must</b> be a valid pointer to an array of {@code pCheckpointDataCount} {@link VkCheckpointDataNV} structures</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCheckpointDataNV}</p>
     *
     * @param queue                the {@code VkQueue} object the caller would like to retrieve checkpoint data for
     * @param pCheckpointDataCount a pointer to an integer related to the number of checkpoint markers available or queried, as described below.
     * @param pCheckpointData      either {@code NULL} or a pointer to an array of {@link VkCheckpointDataNV} structures.
     */
    public static void vkGetQueueCheckpointDataNV(VkQueue queue, @NativeType("uint32_t *") IntBuffer pCheckpointDataCount, @Nullable @NativeType("VkCheckpointDataNV *") VkCheckpointDataNV.Buffer pCheckpointData) {
        if (CHECKS) {
            check(pCheckpointDataCount, 1);
            checkSafe(pCheckpointData, pCheckpointDataCount.get(pCheckpointDataCount.position()));
        }
        nvkGetQueueCheckpointDataNV(queue, memAddress(pCheckpointDataCount), memAddressSafe(pCheckpointData));
    }

    /** Array version of: {@link #vkGetQueueCheckpointDataNV GetQueueCheckpointDataNV} */
    public static void vkGetQueueCheckpointDataNV(VkQueue queue, @NativeType("uint32_t *") int[] pCheckpointDataCount, @Nullable @NativeType("VkCheckpointDataNV *") VkCheckpointDataNV.Buffer pCheckpointData) {
        long __functionAddress = queue.getCapabilities().vkGetQueueCheckpointDataNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pCheckpointDataCount, 1);
            checkSafe(pCheckpointData, pCheckpointDataCount[0]);
        }
        callPPPV(queue.address(), pCheckpointDataCount, memAddressSafe(pCheckpointData), __functionAddress);
    }

}
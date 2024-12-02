/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension provides a method to obtain binary data associated with individual pipelines such that applications can manage caching themselves instead of using VkPipelineCache objects.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_pipeline_binary}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>484</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRMaintenance5 VK_KHR_maintenance5}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Stu Smith <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_pipeline_binary]%20@stu-s%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_pipeline_binary%20extension*">stu-s</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_pipeline_binary.adoc">VK_KHR_pipeline_binary</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2024-07-01</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Stu Smith, AMD</li>
 * <li>Tobias Hector, AMD</li>
 * <li>Alan Harrison, AMD</li>
 * <li>Maciej Jesionowski, AMD</li>
 * <li>Younggwan Kim, Arm</li>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * <li>Ting Wei, Arm</li>
 * <li>Chris Glover, Google</li>
 * <li>Shahbaz Youssefi, Google</li>
 * <li>Jakub Kuderski, Google</li>
 * <li>Piotr Byszewski, Mobica</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Ralph Potter, Samsung</li>
 * <li>Matthew Netsch, Qualcomm</li>
 * <li>Hans-Kristian Arntzen, Valve</li>
 * <li>Samuel Pitoiset, Valve</li>
 * <li>Tatsuyuki Ishi, Valve</li>
 * </ul></dd>
 * </dl>
 */
public class KHRPipelineBinary {

    /** The extension specification version. */
    public static final int VK_KHR_PIPELINE_BINARY_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_PIPELINE_BINARY_EXTENSION_NAME = "VK_KHR_pipeline_binary";

    /** VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR */
    public static final int VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR = 32;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_FEATURES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_BINARY_INFO_KHR STRUCTURE_TYPE_PIPELINE_BINARY_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR STRUCTURE_TYPE_RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_BINARY_DATA_INFO_KHR STRUCTURE_TYPE_PIPELINE_BINARY_DATA_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_CREATE_INFO_KHR STRUCTURE_TYPE_PIPELINE_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_PIPELINE_BINARY_INTERNAL_CACHE_CONTROL_KHR STRUCTURE_TYPE_DEVICE_PIPELINE_BINARY_INTERNAL_CACHE_CONTROL_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_BINARY_HANDLES_INFO_KHR STRUCTURE_TYPE_PIPELINE_BINARY_HANDLES_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_FEATURES_KHR      = 1000483000,
        VK_STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR                   = 1000483001,
        VK_STRUCTURE_TYPE_PIPELINE_BINARY_INFO_KHR                          = 1000483002,
        VK_STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR                           = 1000483003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR    = 1000483004,
        VK_STRUCTURE_TYPE_RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR           = 1000483005,
        VK_STRUCTURE_TYPE_PIPELINE_BINARY_DATA_INFO_KHR                     = 1000483006,
        VK_STRUCTURE_TYPE_PIPELINE_CREATE_INFO_KHR                          = 1000483007,
        VK_STRUCTURE_TYPE_DEVICE_PIPELINE_BINARY_INTERNAL_CACHE_CONTROL_KHR = 1000483008,
        VK_STRUCTURE_TYPE_PIPELINE_BINARY_HANDLES_INFO_KHR                  = 1000483009;

    /** Extends {@code VkObjectType}. */
    public static final int VK_OBJECT_TYPE_PIPELINE_BINARY_KHR = 1000483000;

    /**
     * Extends {@code VkResult}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_BINARY_MISSING_KHR PIPELINE_BINARY_MISSING_KHR}</li>
     * <li>{@link #VK_ERROR_NOT_ENOUGH_SPACE_KHR ERROR_NOT_ENOUGH_SPACE_KHR}</li>
     * </ul>
     */
    public static final int
        VK_PIPELINE_BINARY_MISSING_KHR = 1000483000,
        VK_ERROR_NOT_ENOUGH_SPACE_KHR  = -1000483000;

    /** Extends {@code VkPipelineCreateFlagBits2KHR}. */
    public static final long VK_PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR = 0x80000000L;

    protected KHRPipelineBinary() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreatePipelineBinariesKHR ] ---

    /** Unsafe version of: {@link #vkCreatePipelineBinariesKHR CreatePipelineBinariesKHR} */
    public static int nvkCreatePipelineBinariesKHR(VkDevice device, long pCreateInfo, long pAllocator, long pBinaries) {
        long __functionAddress = device.getCapabilities().vkCreatePipelineBinariesKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkPipelineBinaryCreateInfoKHR.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pBinaries, __functionAddress);
    }

    /**
     * Create pipeline binaries from a pipeline or previously retrieved data.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create pipeline binary objects, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreatePipelineBinariesKHR(
     *     VkDevice                                    device,
     *     const VkPipelineBinaryCreateInfoKHR*        pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkPipelineBinaryHandlesInfoKHR*             pBinaries);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The implementation will attempt to create all pipeline binaries. If creation fails for any pipeline binary, then:</p>
     * 
     * <ul>
     * <li>The corresponding entry in the {@code pPipelineBinaries} output array will be filled with {@link VK10#VK_NULL_HANDLE NULL_HANDLE}.</li>
     * <li>The {@code VkResult} returned by {@link #vkCreatePipelineBinariesKHR CreatePipelineBinariesKHR} will contain the error value for the first entry in the output array in {@code pBinaries} containing {@link VK10#VK_NULL_HANDLE NULL_HANDLE}.</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkPipelineBinaryCreateInfoKHR} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pBinaries} <b>must</b> be a valid pointer to a {@link VkPipelineBinaryHandlesInfoKHR} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_INCOMPLETE INCOMPLETE}</li>
     * <li>{@link #VK_PIPELINE_BINARY_MISSING_KHR PIPELINE_BINARY_MISSING_KHR}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkPipelineBinaryCreateInfoKHR}, {@link VkPipelineBinaryHandlesInfoKHR}</p>
     *
     * @param device      the logical device that creates the pipeline binary objects.
     * @param pCreateInfo a pointer to a {@link VkPipelineBinaryCreateInfoKHR} structure that contains the data to create the pipeline binaries from.
     * @param pAllocator  controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pBinaries   a pointer to a {@link VkPipelineBinaryHandlesInfoKHR} structure in which the resulting pipeline binaries are returned.
     */
    @NativeType("VkResult")
    public static int vkCreatePipelineBinariesKHR(VkDevice device, @NativeType("VkPipelineBinaryCreateInfoKHR const *") VkPipelineBinaryCreateInfoKHR pCreateInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator, @NativeType("VkPipelineBinaryHandlesInfoKHR *") VkPipelineBinaryHandlesInfoKHR pBinaries) {
        return nvkCreatePipelineBinariesKHR(device, pCreateInfo.address(), memAddressSafe(pAllocator), pBinaries.address());
    }

    // --- [ vkDestroyPipelineBinaryKHR ] ---

    /** Unsafe version of: {@link #vkDestroyPipelineBinaryKHR DestroyPipelineBinaryKHR} */
    public static void nvkDestroyPipelineBinaryKHR(VkDevice device, long pipelineBinary, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyPipelineBinaryKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), pipelineBinary, pAllocator, __functionAddress);
    }

    /**
     * Destroy a pipeline binary.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy a {@code VkPipelineBinaryKHR}, call:</p>
     * 
     * <pre><code>
     * void vkDestroyPipelineBinaryKHR(
     *     VkDevice                                    device,
     *     VkPipelineBinaryKHR                         pipelineBinary,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@link VkAllocationCallbacks} were provided when {@code pipelineBinary} was created, a compatible set of callbacks <b>must</b> be provided here</li>
     * <li>If no {@link VkAllocationCallbacks} were provided when {@code pipelineBinary} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code pipelineBinary} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code pipelineBinary} <b>must</b> be a valid {@code VkPipelineBinaryKHR} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>If {@code pipelineBinary} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code pipelineBinary} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device         the logical device that created the pipeline binary object.
     * @param pipelineBinary the handle of the pipeline binary object to destroy.
     * @param pAllocator     controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyPipelineBinaryKHR(VkDevice device, @NativeType("VkPipelineBinaryKHR") long pipelineBinary, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        nvkDestroyPipelineBinaryKHR(device, pipelineBinary, memAddressSafe(pAllocator));
    }

    // --- [ vkGetPipelineKeyKHR ] ---

    /** Unsafe version of: {@link #vkGetPipelineKeyKHR GetPipelineKeyKHR} */
    public static int nvkGetPipelineKeyKHR(VkDevice device, long pPipelineCreateInfo, long pPipelineKey) {
        long __functionAddress = device.getCapabilities().vkGetPipelineKeyKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pPipelineCreateInfo, pPipelineKey, __functionAddress);
    }

    /**
     * Generate the pipeline key from pipeline creation info.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To generate the key for a particular pipeline creation info, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPipelineKeyKHR(
     *     VkDevice                                    device,
     *     const VkPipelineCreateInfoKHR*              pPipelineCreateInfo,
     *     VkPipelineBinaryKeyKHR*                     pPipelineKey);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pPipelineCreateInfo} is {@code NULL}, then the implementation <b>must</b> return the global key that applies to all pipelines. If the key obtained in this way changes between saving and restoring data obtained from {@link #vkGetPipelineBinaryDataKHR GetPipelineBinaryDataKHR} in a different {@code VkDevice}, then the application <b>must</b> assume that the restored data is invalid and cannot be passed to {@link #vkCreatePipelineBinariesKHR CreatePipelineBinariesKHR}. Otherwise the application <b>can</b> assume the data is still valid.</p>
     * 
     * <p>If {@code pPipelineCreateInfo} is not {@code NULL}, the key obtained functions as a method to compare two pipeline creation info structures. Implementations <b>may</b> not compare parts of a pipeline creation info which would not contribute to the final binary output. If a shader module identifier is used instead of a shader module, the {@code pPipelineKey} generated <b>must</b> be equal to the key generated when using the shader module from which the identifier was queried. If the content of two {@code pPipelineKey} are equal, pipelines created with the two {@code pPipelineCreateInfo→pname}:pNext create infos <b>must</b> produce the same {@code VkPipelineBinaryKHR} contents.</p>
     * 
     * <p>The pipeline key is distinct from pipeline binary key. Pipeline binary keys <b>can</b> only be obtained after compilation. The pipeline key is intended to optionally allow associating pipeline create info with multiple pipeline binary keys.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The {@code pNext} chain of {@code pPipelineCreateInfo} <b>must</b> not set {@link VkPipelineBinaryInfoKHR}{@code ::binaryCount} to a value greater than 0</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code pPipelineCreateInfo} is not {@code NULL}, {@code pPipelineCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkPipelineCreateInfoKHR} structure</li>
     * <li>{@code pPipelineKey} <b>must</b> be a valid pointer to a {@link VkPipelineBinaryKeyKHR} structure</li>
     * </ul>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPipelineBinaryKeyKHR}, {@link VkPipelineCreateInfoKHR}</p>
     *
     * @param device              the logical device that creates the pipeline object.
     * @param pPipelineCreateInfo {@code NULL} or a pointer to a {@link VkPipelineCreateInfoKHR} structure.
     * @param pPipelineKey        a pointer to a {@link VkPipelineBinaryKeyKHR} structure in which the resulting key is returned.
     */
    @NativeType("VkResult")
    public static int vkGetPipelineKeyKHR(VkDevice device, @NativeType("VkPipelineCreateInfoKHR const *") @Nullable VkPipelineCreateInfoKHR pPipelineCreateInfo, @NativeType("VkPipelineBinaryKeyKHR *") VkPipelineBinaryKeyKHR pPipelineKey) {
        return nvkGetPipelineKeyKHR(device, memAddressSafe(pPipelineCreateInfo), pPipelineKey.address());
    }

    // --- [ vkGetPipelineBinaryDataKHR ] ---

    /**
     * Unsafe version of: {@link #vkGetPipelineBinaryDataKHR GetPipelineBinaryDataKHR}
     *
     * @param pPipelineBinaryDataSize a pointer to a {@code size_t} value related to the amount of data in the pipeline binary, as described below.
     */
    public static int nvkGetPipelineBinaryDataKHR(VkDevice device, long pInfo, long pPipelineBinaryKey, long pPipelineBinaryDataSize, long pPipelineBinaryData) {
        long __functionAddress = device.getCapabilities().vkGetPipelineBinaryDataKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPI(device.address(), pInfo, pPipelineBinaryKey, pPipelineBinaryDataSize, pPipelineBinaryData, __functionAddress);
    }

    /**
     * Get the data store from a pipeline binary.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Data <b>can</b> be retrieved from a pipeline binary object using the command:</p>
     * 
     * <pre><code>
     * VkResult vkGetPipelineBinaryDataKHR(
     *     VkDevice                                    device,
     *     const VkPipelineBinaryDataInfoKHR*          pInfo,
     *     VkPipelineBinaryKeyKHR*                     pPipelineBinaryKey,
     *     size_t*                                     pPipelineBinaryDataSize,
     *     void*                                       pPipelineBinaryData);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pPipelineBinaryData} is {@code NULL}, then the size of the data, in bytes, that is required to store the binary is returned in {@code pPipelineBinaryDataSize}. Otherwise, {@code pPipelineBinaryDataSize} <b>must</b> contain the size of the buffer, in bytes, pointed to by {@code pPipelineBinaryData}, and on return {@code pPipelineBinaryDataSize} is overwritten with the size of the data, in bytes, that is required to store the binary. If {@code pPipelineBinaryDataSize} is less than the size that is required to store the binary, nothing is written to {@code pPipelineBinaryData} and {@link #VK_ERROR_NOT_ENOUGH_SPACE_KHR ERROR_NOT_ENOUGH_SPACE_KHR} will be returned, instead of {@link VK10#VK_SUCCESS SUCCESS}.</p>
     * 
     * <p>If <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-pipelineBinaryCompressedData">pipelineBinaryCompressedData</a> is {@link VK10#VK_FALSE FALSE}, implementations <b>should</b> not return compressed pipeline binary data to the application.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkPipelineBinaryDataInfoKHR} structure</li>
     * <li>{@code pPipelineBinaryKey} <b>must</b> be a valid pointer to a {@link VkPipelineBinaryKeyKHR} structure</li>
     * <li>{@code pPipelineBinaryDataSize} <b>must</b> be a valid pointer to a {@code size_t} value</li>
     * <li>If the value referenced by {@code pPipelineBinaryDataSize} is not 0, and {@code pPipelineBinaryData} is not {@code NULL}, {@code pPipelineBinaryData} <b>must</b> be a valid pointer to an array of {@code pPipelineBinaryDataSize} bytes</li>
     * </ul>
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
     * <li>{@link #VK_ERROR_NOT_ENOUGH_SPACE_KHR ERROR_NOT_ENOUGH_SPACE_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPipelineBinaryDataInfoKHR}, {@link VkPipelineBinaryKeyKHR}</p>
     *
     * @param device                  the logical device that created the pipeline binary.
     * @param pInfo                   a pointer to a {@link VkPipelineBinaryDataInfoKHR} structure which describes the pipeline binary to get data from.
     * @param pPipelineBinaryKey      a pointer to a {@link VkPipelineBinaryKeyKHR} structure where the key for this binary will be written.
     * @param pPipelineBinaryDataSize a pointer to a {@code size_t} value related to the amount of data in the pipeline binary, as described below.
     * @param pPipelineBinaryData     either {@code NULL} or a pointer to a buffer.
     */
    @NativeType("VkResult")
    public static int vkGetPipelineBinaryDataKHR(VkDevice device, @NativeType("VkPipelineBinaryDataInfoKHR const *") VkPipelineBinaryDataInfoKHR pInfo, @NativeType("VkPipelineBinaryKeyKHR *") VkPipelineBinaryKeyKHR pPipelineBinaryKey, @NativeType("size_t *") PointerBuffer pPipelineBinaryDataSize, @NativeType("void *") @Nullable ByteBuffer pPipelineBinaryData) {
        if (CHECKS) {
            check(pPipelineBinaryDataSize, 1);
            checkSafe(pPipelineBinaryData, pPipelineBinaryDataSize.get(pPipelineBinaryDataSize.position()));
        }
        return nvkGetPipelineBinaryDataKHR(device, pInfo.address(), pPipelineBinaryKey.address(), memAddress(pPipelineBinaryDataSize), memAddressSafe(pPipelineBinaryData));
    }

    // --- [ vkReleaseCapturedPipelineDataKHR ] ---

    /** Unsafe version of: {@link #vkReleaseCapturedPipelineDataKHR ReleaseCapturedPipelineDataKHR} */
    public static int nvkReleaseCapturedPipelineDataKHR(VkDevice device, long pInfo, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkReleaseCapturedPipelineDataKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pInfo, pAllocator, __functionAddress);
    }

    /**
     * Release captured pipeline binary data.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To release pipeline resources captured with {@link #VK_PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR}, call:</p>
     * 
     * <pre><code>
     * VkResult vkReleaseCapturedPipelineDataKHR(
     *     VkDevice                                    device,
     *     const VkReleaseCapturedPipelineDataInfoKHR* pInfo,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The implementation <b>may</b> free any resources captured as a result of creating the pipeline with {@link #VK_PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR} and put the pipeline into a state as if {@link #VK_PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR} had not been provided at pipeline creation time.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Any resources captured as a result of creating the pipeline with {@link #VK_PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR} are implicitly freed by {@link VK10#vkDestroyPipeline DestroyPipeline}.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@link VkAllocationCallbacks} were provided when {@code pipeline} was created, a compatible set of callbacks <b>must</b> be provided in {@code pAllocator}</li>
     * <li>If no {@link VkAllocationCallbacks} were provided when {@code pipeline} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkReleaseCapturedPipelineDataInfoKHR} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code pInfo→pipeline} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkReleaseCapturedPipelineDataInfoKHR}</p>
     *
     * @param device     the logical device that created the pipeline object.
     * @param pInfo      a pointer to a {@link VkReleaseCapturedPipelineDataInfoKHR} structure which describes the pipeline to release the data from.
     * @param pAllocator controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    @NativeType("VkResult")
    public static int vkReleaseCapturedPipelineDataKHR(VkDevice device, @NativeType("VkReleaseCapturedPipelineDataInfoKHR const *") VkReleaseCapturedPipelineDataInfoKHR pInfo, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks pAllocator) {
        return nvkReleaseCapturedPipelineDataKHR(device, pInfo.address(), memAddressSafe(pAllocator));
    }

}
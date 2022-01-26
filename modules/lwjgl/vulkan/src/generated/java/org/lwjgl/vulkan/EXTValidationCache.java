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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension provides a mechanism for caching the results of potentially expensive internal validation operations across multiple runs of a Vulkan application. At the core is the {@code VkValidationCacheEXT} object type, which is managed similarly to the existing {@code VkPipelineCache}.
 * 
 * <p>The new struct {@link VkShaderModuleValidationCacheCreateInfoEXT} can be included in the {@code pNext} chain at {@link VK10#vkCreateShaderModule CreateShaderModule} time. It contains a {@code VkValidationCacheEXT} to use when validating the {@code VkShaderModule}.</p>
 * 
 * <h5>VK_EXT_validation_cache</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_validation_cache}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>161</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Cort Stratton <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_validation_cache]%20@cdwfs%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_validation_cache%20extension%3E%3E">cdwfs</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-08-29</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Cort Stratton, Google</li>
 * <li>Chris Forbes, Google</li>
 * </ul></dd>
 * </dl>
 */
public class EXTValidationCache {

    /** The extension specification version. */
    public static final int VK_EXT_VALIDATION_CACHE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_VALIDATION_CACHE_EXTENSION_NAME = "VK_EXT_validation_cache";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT STRUCTURE_TYPE_SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT               = 1000160000,
        VK_STRUCTURE_TYPE_SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT = 1000160001;

    /** Extends {@code VkObjectType}. */
    public static final int VK_OBJECT_TYPE_VALIDATION_CACHE_EXT = 1000160000;

    /**
     * VkValidationCacheHeaderVersionEXT - Encode validation cache version
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT VALIDATION_CACHE_HEADER_VERSION_ONE_EXT} specifies version one of the validation cache.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #vkCreateValidationCacheEXT CreateValidationCacheEXT}, {@link #vkGetValidationCacheDataEXT GetValidationCacheDataEXT}</p>
     */
    public static final int VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT = 1;

    protected EXTValidationCache() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateValidationCacheEXT ] ---

    /** Unsafe version of: {@link #vkCreateValidationCacheEXT CreateValidationCacheEXT} */
    public static int nvkCreateValidationCacheEXT(VkDevice device, long pCreateInfo, long pAllocator, long pValidationCache) {
        long __functionAddress = device.getCapabilities().vkCreateValidationCacheEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkValidationCacheCreateInfoEXT.validate(pCreateInfo);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pValidationCache, __functionAddress);
    }

    /**
     * Creates a new validation cache.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create validation cache objects, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateValidationCacheEXT(
     *     VkDevice                                    device,
     *     const VkValidationCacheCreateInfoEXT*       pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkValidationCacheEXT*                       pValidationCache);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Applications <b>can</b> track and manage the total host memory size of a validation cache object using the {@code pAllocator}. Applications <b>can</b> limit the amount of data retrieved from a validation cache object in {@code vkGetValidationCacheDataEXT}. Implementations <b>should</b> not internally limit the total number of entries added to a validation cache object or the total host memory consumed.</p>
     * </div>
     * 
     * <p>Once created, a validation cache <b>can</b> be passed to the {@code vkCreateShaderModule} command by adding this object to the {@link VkShaderModuleCreateInfo} structure’s {@code pNext} chain. If a {@link VkShaderModuleValidationCacheCreateInfoEXT} object is included in the {@link VkShaderModuleCreateInfo}{@code ::pNext} chain, and its {@code validationCache} field is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the implementation will query it for possible reuse opportunities and update it with new content. The use of the validation cache object in these commands is internally synchronized, and the same validation cache object <b>can</b> be used in multiple threads simultaneously.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Implementations <b>should</b> make every effort to limit any critical sections to the actual accesses to the cache, which is expected to be significantly shorter than the duration of the {@code vkCreateShaderModule} command.</p>
     * </div>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkValidationCacheCreateInfoEXT} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pValidationCache} <b>must</b> be a valid pointer to a {@code VkValidationCacheEXT} handle</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkValidationCacheCreateInfoEXT}</p>
     *
     * @param device           the logical device that creates the validation cache object.
     * @param pCreateInfo      a pointer to a {@link VkValidationCacheCreateInfoEXT} structure containing the initial parameters for the validation cache object.
     * @param pAllocator       controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pValidationCache a pointer to a {@code VkValidationCacheEXT} handle in which the resulting validation cache object is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateValidationCacheEXT(VkDevice device, @NativeType("VkValidationCacheCreateInfoEXT const *") VkValidationCacheCreateInfoEXT pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkValidationCacheEXT *") LongBuffer pValidationCache) {
        if (CHECKS) {
            check(pValidationCache, 1);
        }
        return nvkCreateValidationCacheEXT(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pValidationCache));
    }

    // --- [ vkDestroyValidationCacheEXT ] ---

    /** Unsafe version of: {@link #vkDestroyValidationCacheEXT DestroyValidationCacheEXT} */
    public static void nvkDestroyValidationCacheEXT(VkDevice device, long validationCache, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyValidationCacheEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), validationCache, pAllocator, __functionAddress);
    }

    /**
     * Destroy a validation cache object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy a validation cache, call:</p>
     * 
     * <pre><code>
     * void vkDestroyValidationCacheEXT(
     *     VkDevice                                    device,
     *     VkValidationCacheEXT                        validationCache,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@link VkAllocationCallbacks} were provided when {@code validationCache} was created, a compatible set of callbacks <b>must</b> be provided here</li>
     * <li>If no {@link VkAllocationCallbacks} were provided when {@code validationCache} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code validationCache} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code validationCache} <b>must</b> be a valid {@code VkValidationCacheEXT} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>If {@code validationCache} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code validationCache} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device          the logical device that destroys the validation cache object.
     * @param validationCache the handle of the validation cache to destroy.
     * @param pAllocator      controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyValidationCacheEXT(VkDevice device, @NativeType("VkValidationCacheEXT") long validationCache, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyValidationCacheEXT(device, validationCache, memAddressSafe(pAllocator));
    }

    // --- [ vkMergeValidationCachesEXT ] ---

    /**
     * Unsafe version of: {@link #vkMergeValidationCachesEXT MergeValidationCachesEXT}
     *
     * @param srcCacheCount the length of the {@code pSrcCaches} array.
     */
    public static int nvkMergeValidationCachesEXT(VkDevice device, long dstCache, int srcCacheCount, long pSrcCaches) {
        long __functionAddress = device.getCapabilities().vkMergeValidationCachesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), dstCache, srcCacheCount, pSrcCaches, __functionAddress);
    }

    /**
     * Combine the data stores of validation caches.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Validation cache objects <b>can</b> be merged using the command:</p>
     * 
     * <pre><code>
     * VkResult vkMergeValidationCachesEXT(
     *     VkDevice                                    device,
     *     VkValidationCacheEXT                        dstCache,
     *     uint32_t                                    srcCacheCount,
     *     const VkValidationCacheEXT*                 pSrcCaches);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The details of the merge operation are implementation-dependent, but implementations <b>should</b> merge the contents of the specified validation caches and prune duplicate entries.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code dstCache} <b>must</b> not appear in the list of source caches</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code dstCache} <b>must</b> be a valid {@code VkValidationCacheEXT} handle</li>
     * <li>{@code pSrcCaches} <b>must</b> be a valid pointer to an array of {@code srcCacheCount} valid {@code VkValidationCacheEXT} handles</li>
     * <li>{@code srcCacheCount} <b>must</b> be greater than 0</li>
     * <li>{@code dstCache} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * <li>Each element of {@code pSrcCaches} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code dstCache} <b>must</b> be externally synchronized</li>
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
     * @param device     the logical device that owns the validation cache objects.
     * @param dstCache   the handle of the validation cache to merge results into.
     * @param pSrcCaches a pointer to an array of validation cache handles, which will be merged into {@code dstCache}. The previous contents of {@code dstCache} are included after the merge.
     */
    @NativeType("VkResult")
    public static int vkMergeValidationCachesEXT(VkDevice device, @NativeType("VkValidationCacheEXT") long dstCache, @NativeType("VkValidationCacheEXT const *") LongBuffer pSrcCaches) {
        return nvkMergeValidationCachesEXT(device, dstCache, pSrcCaches.remaining(), memAddress(pSrcCaches));
    }

    // --- [ vkGetValidationCacheDataEXT ] ---

    /**
     * Unsafe version of: {@link #vkGetValidationCacheDataEXT GetValidationCacheDataEXT}
     *
     * @param pDataSize a pointer to a value related to the amount of data in the validation cache, as described below.
     */
    public static int nvkGetValidationCacheDataEXT(VkDevice device, long validationCache, long pDataSize, long pData) {
        long __functionAddress = device.getCapabilities().vkGetValidationCacheDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPI(device.address(), validationCache, pDataSize, pData, __functionAddress);
    }

    /**
     * Get the data store from a validation cache.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Data <b>can</b> be retrieved from a validation cache object using the command:</p>
     * 
     * <pre><code>
     * VkResult vkGetValidationCacheDataEXT(
     *     VkDevice                                    device,
     *     VkValidationCacheEXT                        validationCache,
     *     size_t*                                     pDataSize,
     *     void*                                       pData);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pData} is {@code NULL}, then the maximum size of the data that <b>can</b> be retrieved from the validation cache, in bytes, is returned in {@code pDataSize}. Otherwise, {@code pDataSize} <b>must</b> point to a variable set by the user to the size of the buffer, in bytes, pointed to by {@code pData}, and on return the variable is overwritten with the amount of data actually written to {@code pData}. If {@code pDataSize} is less than the maximum size that <b>can</b> be retrieved by the validation cache, at most {@code pDataSize} bytes will be written to {@code pData}, and {@code vkGetValidationCacheDataEXT} will return {@link VK10#VK_INCOMPLETE INCOMPLETE} instead of {@link VK10#VK_SUCCESS SUCCESS}, to indicate that not all of the validation cache was returned.</p>
     * 
     * <p>Any data written to {@code pData} is valid and <b>can</b> be provided as the {@code pInitialData} member of the {@link VkValidationCacheCreateInfoEXT} structure passed to {@code vkCreateValidationCacheEXT}.</p>
     * 
     * <p>Two calls to {@code vkGetValidationCacheDataEXT} with the same parameters <b>must</b> retrieve the same data unless a command that modifies the contents of the cache is called between them.</p>
     * 
     * <p>Applications <b>can</b> store the data retrieved from the validation cache, and use these data, possibly in a future run of the application, to populate new validation cache objects. The results of validation, however, <b>may</b> depend on the vendor ID, device ID, driver version, and other details of the device. To enable applications to detect when previously retrieved data is incompatible with the device, the initial bytes written to {@code pData} <b>must</b> be a header consisting of the following members:</p>
     * 
     * <h6>Layout for validation cache header version {@link #VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT VALIDATION_CACHE_HEADER_VERSION_ONE_EXT}</h6>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>Offset</th><th>Size</th><th>Meaning</th></tr></thead>
     * <tbody>
     * <tr><td>0</td><td>4</td><td>length in bytes of the entire validation cache header written as a stream of bytes, with the least significant byte first</td></tr>
     * <tr><td>4</td><td>4</td><td>a {@code VkValidationCacheHeaderVersionEXT} value written as a stream of bytes, with the least significant byte first</td></tr>
     * <tr><td>8</td><td>{@link VK10#VK_UUID_SIZE UUID_SIZE}</td><td>a layer commit ID expressed as a UUID, which uniquely identifies the version of the validation layers used to generate these validation results</td></tr>
     * </tbody>
     * </table>
     * 
     * <p>The first four bytes encode the length of the entire validation cache header, in bytes. This value includes all fields in the header including the validation cache version field and the size of the length field.</p>
     * 
     * <p>The next four bytes encode the validation cache version, as described for {@code VkValidationCacheHeaderVersionEXT}. A consumer of the validation cache <b>should</b> use the cache version to interpret the remainder of the cache header.</p>
     * 
     * <p>If {@code pDataSize} is less than what is necessary to store this header, nothing will be written to {@code pData} and zero will be written to {@code pDataSize}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code validationCache} <b>must</b> be a valid {@code VkValidationCacheEXT} handle</li>
     * <li>{@code pDataSize} <b>must</b> be a valid pointer to a {@code size_t} value</li>
     * <li>If the value referenced by {@code pDataSize} is not 0, and {@code pData} is not {@code NULL}, {@code pData} <b>must</b> be a valid pointer to an array of {@code pDataSize} bytes</li>
     * <li>{@code validationCache} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_INCOMPLETE INCOMPLETE}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     *
     * @param device          the logical device that owns the validation cache.
     * @param validationCache the validation cache to retrieve data from.
     * @param pDataSize       a pointer to a value related to the amount of data in the validation cache, as described below.
     * @param pData           either {@code NULL} or a pointer to a buffer.
     */
    @NativeType("VkResult")
    public static int vkGetValidationCacheDataEXT(VkDevice device, @NativeType("VkValidationCacheEXT") long validationCache, @NativeType("size_t *") PointerBuffer pDataSize, @Nullable @NativeType("void *") ByteBuffer pData) {
        if (CHECKS) {
            check(pDataSize, 1);
            checkSafe(pData, pDataSize.get(pDataSize.position()));
        }
        return nvkGetValidationCacheDataEXT(device, validationCache, memAddress(pDataSize), memAddressSafe(pData));
    }

    /** Array version of: {@link #vkCreateValidationCacheEXT CreateValidationCacheEXT} */
    @NativeType("VkResult")
    public static int vkCreateValidationCacheEXT(VkDevice device, @NativeType("VkValidationCacheCreateInfoEXT const *") VkValidationCacheCreateInfoEXT pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkValidationCacheEXT *") long[] pValidationCache) {
        long __functionAddress = device.getCapabilities().vkCreateValidationCacheEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pValidationCache, 1);
            VkValidationCacheCreateInfoEXT.validate(pCreateInfo.address());
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pValidationCache, __functionAddress);
    }

    /** Array version of: {@link #vkMergeValidationCachesEXT MergeValidationCachesEXT} */
    @NativeType("VkResult")
    public static int vkMergeValidationCachesEXT(VkDevice device, @NativeType("VkValidationCacheEXT") long dstCache, @NativeType("VkValidationCacheEXT const *") long[] pSrcCaches) {
        long __functionAddress = device.getCapabilities().vkMergeValidationCachesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), dstCache, pSrcCaches.length, pSrcCaches, __functionAddress);
    }

}
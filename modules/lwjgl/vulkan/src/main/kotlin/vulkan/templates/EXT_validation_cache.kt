/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_validation_cache = "EXTValidationCache".nativeClassVK("EXT_validation_cache", type = "device", postfix = EXT) {
    documentation =
        """
        This extension provides a mechanism for caching the results of potentially expensive internal validation operations across multiple runs of a Vulkan application. At the core is the {@code VkValidationCacheEXT} object type, which is managed similarly to the existing {@code VkPipelineCache}.

        The new struct ##VkShaderModuleValidationCacheCreateInfoEXT can be included in the {@code pNext} chain at #CreateShaderModule() time. It contains a {@code VkValidationCacheEXT} to use when validating the {@code VkShaderModule}.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_validation_cache}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>161</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Cort Stratton @cdwfs</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-08-29</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Cort Stratton, Google</li>
                <li>Chris Forbes, Google</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_VALIDATION_CACHE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_VALIDATION_CACHE_EXTENSION_NAME".."VK_EXT_validation_cache"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT".."1000160000",
        "STRUCTURE_TYPE_SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT".."1000160001"
    )

    EnumConstant(
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_VALIDATION_CACHE_EXT".."1000160000"
    )

    EnumConstant(
        """
        VkValidationCacheHeaderVersionEXT - Encode validation cache version

        <h5>Description</h5>
        <ul>
            <li>#VALIDATION_CACHE_HEADER_VERSION_ONE_EXT specifies version one of the validation cache.</li>
        </ul>

        <h5>See Also</h5>
        UNKNOWN:vkCreateValdiationCacheEXT, #GetValidationCacheDataEXT()
        """,

        "VALIDATION_CACHE_HEADER_VERSION_ONE_EXT".."1"
    )

    VkResult(
        "CreateValidationCacheEXT",
        """
        Creates a new validation cache.

        <h5>C Specification</h5>
        To create validation cache objects, call:

        <code><pre>
￿VkResult vkCreateValidationCacheEXT(
￿    VkDevice                                    device,
￿    const VkValidationCacheCreateInfoEXT*       pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkValidationCacheEXT*                       pValidationCache);</pre></code>

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications <b>can</b> track and manage the total host memory size of a validation cache object using the {@code pAllocator}. Applications <b>can</b> limit the amount of data retrieved from a validation cache object in #GetValidationCacheDataEXT(). Implementations <b>should</b> not internally limit the total number of entries added to a validation cache object or the total host memory consumed.
        </div>

        Once created, a validation cache <b>can</b> be passed to the #CreateShaderModule() command as part of the ##VkShaderModuleCreateInfo {@code pNext} chain. If a ##VkShaderModuleValidationCacheCreateInfoEXT object is part of the ##VkShaderModuleCreateInfo{@code ::pNext} chain, and its {@code validationCache} field is not #NULL_HANDLE, the implementation will query it for possible reuse opportunities and update it with new content. The use of the validation cache object in these commands is internally synchronized, and the same validation cache object <b>can</b> be used in multiple threads simultaneously.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Implementations <b>should</b> make every effort to limit any critical sections to the actual accesses to the cache, which is expected to be significantly shorter than the duration of the #CreateShaderModule() command.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkValidationCacheCreateInfoEXT structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pValidationCache} <b>must</b> be a valid pointer to a {@code VkValidationCacheEXT} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkValidationCacheCreateInfoEXT
        """,

        VkDevice.IN("device", "the logical device that creates the validation cache object."),
        VkValidationCacheCreateInfoEXT.const.p.IN("pCreateInfo", "a pointer to a ##VkValidationCacheCreateInfoEXT structure that contains the initial parameters for the validation cache object."),
        nullable..VkAllocationCallbacks.const.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkValidationCacheEXT.p.OUT("pValidationCache", "a pointer to a {@code VkValidationCacheEXT} handle in which the resulting validation cache object is returned.")
    )

    void(
        "DestroyValidationCacheEXT",
        """
        Destroy a validation cache object.

        <h5>C Specification</h5>
        To destroy a validation cache, call:

        <code><pre>
￿void vkDestroyValidationCacheEXT(
￿    VkDevice                                    device,
￿    VkValidationCacheEXT                        validationCache,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkAllocationCallbacks were provided when {@code validationCache} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code validationCache} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code validationCache} is not #NULL_HANDLE, {@code validationCache} <b>must</b> be a valid {@code VkValidationCacheEXT} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code validationCache} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code validationCache} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the logical device that destroys the validation cache object."),
        VkValidationCacheEXT.IN("validationCache", "the handle of the validation cache to destroy."),
        nullable..VkAllocationCallbacks.const.p.IN("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "MergeValidationCachesEXT",
        """
        Combine the data stores of validation caches.

        <h5>C Specification</h5>
        Validation cache objects <b>can</b> be merged using the command:

        <code><pre>
￿VkResult vkMergeValidationCachesEXT(
￿    VkDevice                                    device,
￿    VkValidationCacheEXT                        dstCache,
￿    uint32_t                                    srcCacheCount,
￿    const VkValidationCacheEXT*                 pSrcCaches);</pre></code>

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The details of the merge operation are implementation dependent, but implementations <b>should</b> merge the contents of the specified validation caches and prune duplicate entries.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code dstCache} <b>must</b> not appear in the list of source caches</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code dstCache} <b>must</b> be a valid {@code VkValidationCacheEXT} handle</li>
            <li>{@code pSrcCaches} <b>must</b> be a valid pointer to an array of {@code srcCacheCount} valid {@code VkValidationCacheEXT} handles</li>
            <li>{@code srcCacheCount} <b>must</b> be greater than 0</li>
            <li>{@code dstCache} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
            <li>Each element of {@code pSrcCaches} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code dstCache} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice.IN("device", "the logical device that owns the validation cache objects."),
        VkValidationCacheEXT.IN("dstCache", "the handle of the validation cache to merge results into."),
        AutoSize("pSrcCaches")..uint32_t.IN("srcCacheCount", "the length of the {@code pSrcCaches} array."),
        VkValidationCacheEXT.const.p.IN("pSrcCaches", "an array of validation cache handles, which will be merged into {@code dstCache}. The previous contents of {@code dstCache} are included after the merge.")
    )

    VkResult(
        "GetValidationCacheDataEXT",
        """
        Get the data store from a validation cache.

        <h5>C Specification</h5>
        Data <b>can</b> be retrieved from a validation cache object using the command:

        <code><pre>
￿VkResult vkGetValidationCacheDataEXT(
￿    VkDevice                                    device,
￿    VkValidationCacheEXT                        validationCache,
￿    size_t*                                     pDataSize,
￿    void*                                       pData);</pre></code>

        <h5>Description</h5>
        If {@code pData} is {@code NULL}, then the maximum size of the data that <b>can</b> be retrieved from the validation cache, in bytes, is returned in {@code pDataSize}. Otherwise, {@code pDataSize} <b>must</b> point to a variable set by the user to the size of the buffer, in bytes, pointed to by {@code pData}, and on return the variable is overwritten with the amount of data actually written to {@code pData}.

        If {@code pDataSize} is less than the maximum size that <b>can</b> be retrieved by the validation cache, at most {@code pDataSize} bytes will be written to {@code pData}, and #GetValidationCacheDataEXT() will return #INCOMPLETE. Any data written to {@code pData} is valid and <b>can</b> be provided as the {@code pInitialData} member of the ##VkValidationCacheCreateInfoEXT structure passed to #CreateValidationCacheEXT().

        Two calls to #GetValidationCacheDataEXT() with the same parameters <b>must</b> retrieve the same data unless a command that modifies the contents of the cache is called between them.

        Applications <b>can</b> store the data retrieved from the validation cache, and use these data, possibly in a future run of the application, to populate new validation cache objects. The results of validation, however, <b>may</b> depend on the vendor ID, device ID, driver version, and other details of the device. To enable applications to detect when previously retrieved data is incompatible with the device, the initial bytes written to {@code pData} <b>must</b> be a header consisting of the following members:

        <h6>Layout for validation cache header version ename:VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT</h6>
        <table class="lwjgl">
            <thead><tr><th>Offset</th><th>Size</th><th>Meaning</th></tr></thead>
            <tbody>
                <tr><td>0</td><td>4</td><td>length in bytes of the entire validation cache header written as a stream of bytes, with the least significant byte first</td></tr>
                <tr><td>4</td><td>4</td><td>a {@code VkValidationCacheHeaderVersionEXT} value written as a stream of bytes, with the least significant byte first</td></tr>
                <tr><td>8</td><td>#UUID_SIZE</td><td>a layer commit ID expressed as a UUID, which uniquely identifies the version of the validation layers used to generate these validation results</td></tr>
            </tbody>
        </table>

        The first four bytes encode the length of the entire validation cache header, in bytes. This value includes all fields in the header including the validation cache version field and the size of the length field.

        The next four bytes encode the validation cache version, as described for {@code VkValidationCacheHeaderVersionEXT}. A consumer of the validation cache <b>should</b> use the cache version to interpret the remainder of the cache header.

        If {@code pDataSize} is less than what is necessary to store this header, nothing will be written to {@code pData} and zero will be written to {@code pDataSize}.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code validationCache} <b>must</b> be a valid {@code VkValidationCacheEXT} handle</li>
            <li>{@code pDataSize} <b>must</b> be a valid pointer to a {@code size_t} value</li>
            <li>If the value referenced by {@code pDataSize} is not 0, and {@code pData} is not {@code NULL}, {@code pData} <b>must</b> be a valid pointer to an array of {@code pDataSize} bytes</li>
            <li>{@code validationCache} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkDevice.IN("device", "the logical device that owns the validation cache."),
        VkValidationCacheEXT.IN("validationCache", "the validation cache to retrieve data from."),
        AutoSize("pData")..Check(1)..size_t.p.INOUT("pDataSize", "a pointer to a value related to the amount of data in the validation cache, as described below."),
        nullable..void.p.OUT("pData", "either {@code NULL} or a pointer to a buffer.")
    )
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_pipeline_binary = "KHRPipelineBinary".nativeClassVK("KHR_pipeline_binary", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension provides a method to obtain binary data associated with individual pipelines such that applications can manage caching themselves instead of using VkPipelineCache objects.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_pipeline_binary}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>484</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRMaintenance5 VK_KHR_maintenance5}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Stu Smith <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_pipeline_binary]%20@stu-s%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_pipeline_binary%20extension*">stu-s</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_pipeline_binary.adoc">VK_KHR_pipeline_binary</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2024-07-01</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Stu Smith, AMD</li>
                <li>Tobias Hector, AMD</li>
                <li>Alan Harrison, AMD</li>
                <li>Maciej Jesionowski, AMD</li>
                <li>Younggwan Kim, Arm</li>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>Ting Wei, Arm</li>
                <li>Chris Glover, Google</li>
                <li>Shahbaz Youssefi, Google</li>
                <li>Jakub Kuderski, Google</li>
                <li>Piotr Byszewski, Mobica</li>
                <li>Piers Daniell, NVIDIA</li>
                <li>Ralph Potter, Samsung</li>
                <li>Matthew Netsch, Qualcomm</li>
                <li>Hans-Kristian Arntzen, Valve</li>
                <li>Samuel Pitoiset, Valve</li>
                <li>Tatsuyuki Ishi, Valve</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_PIPELINE_BINARY_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_PIPELINE_BINARY_EXTENSION_NAME".."VK_KHR_pipeline_binary"
    )

    EnumConstant(
        "VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR",

        "MAX_PIPELINE_BINARY_KEY_SIZE_KHR".."32"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_FEATURES_KHR".."1000483000",
        "STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR".."1000483001",
        "STRUCTURE_TYPE_PIPELINE_BINARY_INFO_KHR".."1000483002",
        "STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR".."1000483003",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR".."1000483004",
        "STRUCTURE_TYPE_RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR".."1000483005",
        "STRUCTURE_TYPE_PIPELINE_BINARY_DATA_INFO_KHR".."1000483006",
        "STRUCTURE_TYPE_PIPELINE_CREATE_INFO_KHR".."1000483007",
        "STRUCTURE_TYPE_DEVICE_PIPELINE_BINARY_INTERNAL_CACHE_CONTROL_KHR".."1000483008",
        "STRUCTURE_TYPE_PIPELINE_BINARY_HANDLES_INFO_KHR".."1000483009"
    )

    EnumConstant(
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_PIPELINE_BINARY_KHR".."1000483000"
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "PIPELINE_BINARY_MISSING_KHR".."1000483000",
        "ERROR_NOT_ENOUGH_SPACE_KHR".."-1000483000"
    )

    EnumConstantLong(
        "Extends {@code VkPipelineCreateFlagBits2KHR}.",

        "PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR".enum(0x80000000L)
    )

    VkResult(
        "CreatePipelineBinariesKHR",
        """
        Create pipeline binaries from a pipeline or previously retrieved data.

        <h5>C Specification</h5>
        To create pipeline binary objects, call:

        <pre><code>
￿VkResult vkCreatePipelineBinariesKHR(
￿    VkDevice                                    device,
￿    const VkPipelineBinaryCreateInfoKHR*        pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkPipelineBinaryHandlesInfoKHR*             pBinaries);</code></pre>

        <h5>Description</h5>
        The implementation will attempt to create all pipeline binaries. If creation fails for any pipeline binary, then:

        <ul>
            <li>The corresponding entry in the {@code pPipelineBinaries} output array will be filled with #NULL_HANDLE.</li>
            <li>The {@code VkResult} returned by #CreatePipelineBinariesKHR() will contain the error value for the first entry in the output array in {@code pBinaries} containing #NULL_HANDLE.</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkPipelineBinaryCreateInfoKHR structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pBinaries} <b>must</b> be a valid pointer to a ##VkPipelineBinaryHandlesInfoKHR structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
                <li>#PIPELINE_BINARY_MISSING_KHR</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_INITIALIZATION_FAILED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkPipelineBinaryCreateInfoKHR, ##VkPipelineBinaryHandlesInfoKHR
        """,

        VkDevice("device", "the logical device that creates the pipeline binary objects."),
        VkPipelineBinaryCreateInfoKHR.const.p("pCreateInfo", "a pointer to a ##VkPipelineBinaryCreateInfoKHR structure that contains the data to create the pipeline binaries from."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        VkPipelineBinaryHandlesInfoKHR.p("pBinaries", "a pointer to a ##VkPipelineBinaryHandlesInfoKHR structure in which the resulting pipeline binaries are returned.")
    )

    void(
        "DestroyPipelineBinaryKHR",
        """
        Destroy a pipeline binary.

        <h5>C Specification</h5>
        To destroy a {@code VkPipelineBinaryKHR}, call:

        <pre><code>
￿void vkDestroyPipelineBinaryKHR(
￿    VkDevice                                    device,
￿    VkPipelineBinaryKHR                         pipelineBinary,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkAllocationCallbacks were provided when {@code pipelineBinary} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code pipelineBinary} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code pipelineBinary} is not #NULL_HANDLE, {@code pipelineBinary} <b>must</b> be a valid {@code VkPipelineBinaryKHR} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code pipelineBinary} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code pipelineBinary} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that created the pipeline binary object."),
        VkPipelineBinaryKHR("pipelineBinary", "the handle of the pipeline binary object to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "GetPipelineKeyKHR",
        """
        Generate the pipeline key from pipeline creation info.

        <h5>C Specification</h5>
        To generate the key for a particular pipeline creation info, call:

        <pre><code>
￿VkResult vkGetPipelineKeyKHR(
￿    VkDevice                                    device,
￿    const VkPipelineCreateInfoKHR*              pPipelineCreateInfo,
￿    VkPipelineBinaryKeyKHR*                     pPipelineKey);</code></pre>

        <h5>Description</h5>
        If {@code pPipelineCreateInfo} is {@code NULL}, then the implementation <b>must</b> return the global key that applies to all pipelines. If the key obtained in this way changes between saving and restoring data obtained from #GetPipelineBinaryDataKHR() in a different {@code VkDevice}, then the application <b>must</b> assume that the restored data is invalid and cannot be passed to #CreatePipelineBinariesKHR(). Otherwise the application <b>can</b> assume the data is still valid.

        If {@code pPipelineCreateInfo} is not {@code NULL}, the key obtained functions as a method to compare two pipeline creation info structures. Implementations <b>may</b> not compare parts of a pipeline creation info which would not contribute to the final binary output. If a shader module identifier is used instead of a shader module, the {@code pPipelineKey} generated <b>must</b> be equal to the key generated when using the shader module from which the identifier was queried. If the content of two {@code pPipelineKey} are equal, pipelines created with the two {@code pPipelineCreateInfo→pname}:pNext create infos <b>must</b> produce the same {@code VkPipelineBinaryKHR} contents.

        The pipeline key is distinct from pipeline binary key. Pipeline binary keys <b>can</b> only be obtained after compilation. The pipeline key is intended to optionally allow associating pipeline create info with multiple pipeline binary keys.

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code pNext} chain of {@code pPipelineCreateInfo} <b>must</b> not set ##VkPipelineBinaryInfoKHR{@code ::binaryCount} to a value greater than 0</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code pPipelineCreateInfo} is not {@code NULL}, {@code pPipelineCreateInfo} <b>must</b> be a valid pointer to a valid ##VkPipelineCreateInfoKHR structure</li>
            <li>{@code pPipelineKey} <b>must</b> be a valid pointer to a ##VkPipelineBinaryKeyKHR structure</li>
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

        <h5>See Also</h5>
        ##VkPipelineBinaryKeyKHR, ##VkPipelineCreateInfoKHR
        """,

        VkDevice("device", "the logical device that creates the pipeline object."),
        nullable..VkPipelineCreateInfoKHR.const.p("pPipelineCreateInfo", "{@code NULL} or a pointer to a ##VkPipelineCreateInfoKHR structure."),
        VkPipelineBinaryKeyKHR.p("pPipelineKey", "a pointer to a ##VkPipelineBinaryKeyKHR structure in which the resulting key is returned.")
    )

    VkResult(
        "GetPipelineBinaryDataKHR",
        """
        Get the data store from a pipeline binary.

        <h5>C Specification</h5>
        Data <b>can</b> be retrieved from a pipeline binary object using the command:

        <pre><code>
￿VkResult vkGetPipelineBinaryDataKHR(
￿    VkDevice                                    device,
￿    const VkPipelineBinaryDataInfoKHR*          pInfo,
￿    VkPipelineBinaryKeyKHR*                     pPipelineBinaryKey,
￿    size_t*                                     pPipelineBinaryDataSize,
￿    void*                                       pPipelineBinaryData);</code></pre>

        <h5>Description</h5>
        If {@code pPipelineBinaryData} is {@code NULL}, then the size of the data, in bytes, that is required to store the binary is returned in {@code pPipelineBinaryDataSize}. Otherwise, {@code pPipelineBinaryDataSize} <b>must</b> contain the size of the buffer, in bytes, pointed to by {@code pPipelineBinaryData}, and on return {@code pPipelineBinaryDataSize} is overwritten with the size of the data, in bytes, that is required to store the binary. If {@code pPipelineBinaryDataSize} is less than the size that is required to store the binary, nothing is written to {@code pPipelineBinaryData} and #ERROR_NOT_ENOUGH_SPACE_KHR will be returned, instead of #SUCCESS.

        If <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-pipelineBinaryCompressedData">pipelineBinaryCompressedData</a> is #FALSE, implementations <b>should</b> not return compressed pipeline binary data to the application.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkPipelineBinaryDataInfoKHR structure</li>
            <li>{@code pPipelineBinaryKey} <b>must</b> be a valid pointer to a ##VkPipelineBinaryKeyKHR structure</li>
            <li>{@code pPipelineBinaryDataSize} <b>must</b> be a valid pointer to a {@code size_t} value</li>
            <li>If the value referenced by {@code pPipelineBinaryDataSize} is not 0, and {@code pPipelineBinaryData} is not {@code NULL}, {@code pPipelineBinaryData} <b>must</b> be a valid pointer to an array of {@code pPipelineBinaryDataSize} bytes</li>
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
                <li>#ERROR_NOT_ENOUGH_SPACE_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkPipelineBinaryDataInfoKHR, ##VkPipelineBinaryKeyKHR
        """,

        VkDevice("device", "the logical device that created the pipeline binary."),
        VkPipelineBinaryDataInfoKHR.const.p("pInfo", "a pointer to a ##VkPipelineBinaryDataInfoKHR structure which describes the pipeline binary to get data from."),
        VkPipelineBinaryKeyKHR.p("pPipelineBinaryKey", "a pointer to a ##VkPipelineBinaryKeyKHR structure where the key for this binary will be written."),
        AutoSize("pPipelineBinaryData")..Check(1)..size_t.p("pPipelineBinaryDataSize", "a pointer to a {@code size_t} value related to the amount of data in the pipeline binary, as described below."),
        nullable..void.p("pPipelineBinaryData", "either {@code NULL} or a pointer to a buffer.")
    )

    VkResult(
        "ReleaseCapturedPipelineDataKHR",
        """
        Release captured pipeline binary data.

        <h5>C Specification</h5>
        To release pipeline resources captured with #PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR, call:

        <pre><code>
￿VkResult vkReleaseCapturedPipelineDataKHR(
￿    VkDevice                                    device,
￿    const VkReleaseCapturedPipelineDataInfoKHR* pInfo,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Description</h5>
        The implementation <b>may</b> free any resources captured as a result of creating the pipeline with #PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR and put the pipeline into a state as if #PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR had not been provided at pipeline creation time.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Any resources captured as a result of creating the pipeline with #PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR are implicitly freed by #DestroyPipeline().
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkAllocationCallbacks were provided when {@code pipeline} was created, a compatible set of callbacks <b>must</b> be provided in {@code pAllocator}</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code pipeline} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkReleaseCapturedPipelineDataInfoKHR structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code pInfo→pipeline} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkReleaseCapturedPipelineDataInfoKHR
        """,

        VkDevice("device", "the logical device that created the pipeline object."),
        VkReleaseCapturedPipelineDataInfoKHR.const.p("pInfo", "a pointer to a ##VkReleaseCapturedPipelineDataInfoKHR structure which describes the pipeline to release the data from."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_opacity_micromap = "EXTOpacityMicromap".nativeClassVK("EXT_opacity_micromap", type = "device", postfix = "EXT") {
    documentation =
        """
        When adding adding transparency to a ray traced scene, an application can choose between further tessellating the geometry or using an any hit shader to allow the ray through specific parts of the geometry. These options have the downside of either significantly increasing memory consumption or adding runtime overhead to run shader code in the middle of traversal, respectively.

        This extension adds the ability to add an <em>opacity micromap</em> to geometry when building an acceleration structure. The opacity micromap compactly encodes opacity information which can be read by the implementation to mark parts of triangles as opaque or transparent. The format is externally visible to allow the application to compress its internal geometry and surface representations into the compressed format ahead of time. The compressed format subdivides each triangle into a set of subtriangles, each of which can be assigned either two or four opacity values. These opacity values can control if a ray hitting that subtriangle is treated as an opaque hit, complete miss, or possible hit, depending on the controls described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#ray-opacity-micromap">Ray Opacity Micromap</a>.

        This extension provides:

        <ul>
            <li>a {@code VkMicromapEXT} structure to store the micromap,</li>
            <li>functions similar to acceleration structure build functions to build the opacity micromap array, and</li>
            <li>a structure to extend ##VkAccelerationStructureGeometryTrianglesDataKHR to attach a micromap to the geometry of the acceleration structure.</li>
        </ul>

        <h5>Reference Code</h5>
        <pre><code>
￿uint32_t BarycentricsToSpaceFillingCurveIndex(float u, float v, uint32_t level)
￿{
￿    u = clamp(u, 0.0f, 1.0f);
￿    v = clamp(v, 0.0f, 1.0f);
￿
￿    uint32_t iu, iv, iw;
￿
￿    // Quantize barycentric coordinates
￿    float fu = u * (1u &lt;&lt; level);
￿    float fv = v * (1u &lt;&lt; level);
￿
￿    iu = (uint32_t)fu;
￿    iv = (uint32_t)fv;
￿
￿    float uf = fu - float(iu);
￿    float vf = fv - float(iv);
￿
￿    if (iu &gt;= (1u &lt;&lt; level)) iu = (1u &lt;&lt; level) - 1u;
￿    if (iv &gt;= (1u &lt;&lt; level)) iv = (1u &lt;&lt; level) - 1u;
￿
￿    uint32_t iuv = iu + iv;
￿
￿    if (iuv &gt;= (1u &lt;&lt; level))
￿        iu -= iuv - (1u &lt;&lt; level) + 1u;
￿
￿    iw = ~(iu + iv);
￿
￿    if (uf + vf &gt;= 1.0f &amp;&amp; iuv &lt; (1u &lt;&lt; level) - 1u) --iw;
￿
￿    uint32_t b0 = ~(iu ^ iw);
￿    b0 &amp;= ((1u &lt;&lt; level) - 1u);
￿    uint32_t t = (iu ^ iv) &amp; b0;
￿
￿    uint32_t f = t;
￿    f ^= f &gt;&gt; 1u;
￿    f ^= f &gt;&gt; 2u;
￿    f ^= f &gt;&gt; 4u;
￿    f ^= f &gt;&gt; 8u;
￿    uint32_t b1 = ((f ^ iu) &amp; ~b0) | t;
￿
￿    // Interleave bits
￿    b0 = (b0 | (b0 &lt;&lt; 8u)) &amp; 0x00ff00ffu;
￿    b0 = (b0 | (b0 &lt;&lt; 4u)) &amp; 0x0f0f0f0fu;
￿    b0 = (b0 | (b0 &lt;&lt; 2u)) &amp; 0x33333333u;
￿    b0 = (b0 | (b0 &lt;&lt; 1u)) &amp; 0x55555555u;
￿    b1 = (b1 | (b1 &lt;&lt; 8u)) &amp; 0x00ff00ffu;
￿    b1 = (b1 | (b1 &lt;&lt; 4u)) &amp; 0x0f0f0f0fu;
￿    b1 = (b1 | (b1 &lt;&lt; 2u)) &amp; 0x33333333u;
￿    b1 = (b1 | (b1 &lt;&lt; 1u)) &amp; 0x55555555u;
￿
￿    return b0 | (b1 &lt;&lt; 1u);
￿}</code></pre>

        <h5>VK_EXT_opacity_micromap</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_opacity_micromap}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>397</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRAccelerationStructure VK_KHR_acceleration_structure} and {@link KHRSynchronization2 VK_KHR_synchronization2}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Christoph Kubisch <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_opacity_micromap]%20@pixeljetstream%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_opacity_micromap%20extension*">pixeljetstream</a></li>
                <li>Eric Werness</li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_opacity_micromap.adoc">VK_EXT_opacity_micromap</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2022-08-24</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/EXT/SPV_EXT_opacity_micromap.html">{@code SPV_EXT_opacity_micromap}</a></li>
                <li>This extension provides API support for <a href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/ext/GLSL_EXT_opacity_micromap.txt">{@code GLSL_EXT_opacity_micromap}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Christoph Kubisch, NVIDIA</li>
                <li>Eric Werness, NVIDIA</li>
                <li>Josh Barczak, Intel</li>
                <li>Stu Smith, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_OPACITY_MICROMAP_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "EXT_OPACITY_MICROMAP_EXTENSION_NAME".."VK_EXT_opacity_micromap"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_MICROMAP_BUILD_INFO_EXT".."1000396000",
        "STRUCTURE_TYPE_MICROMAP_VERSION_INFO_EXT".."1000396001",
        "STRUCTURE_TYPE_COPY_MICROMAP_INFO_EXT".."1000396002",
        "STRUCTURE_TYPE_COPY_MICROMAP_TO_MEMORY_INFO_EXT".."1000396003",
        "STRUCTURE_TYPE_COPY_MEMORY_TO_MICROMAP_INFO_EXT".."1000396004",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT".."1000396005",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT".."1000396006",
        "STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT".."1000396007",
        "STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT".."1000396008",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT".."1000396009"
    )

    EnumConstantLong(
        "Extends {@code VkPipelineStageFlagBits2}.",

        "PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT".enum(0x40000000L)
    )

    EnumConstantLong(
        "Extends {@code VkAccessFlagBits2}.",

        "ACCESS_2_MICROMAP_READ_BIT_EXT".enum(0x100000000000L),
        "ACCESS_2_MICROMAP_WRITE_BIT_EXT".enum(0x200000000000L)
    )

    EnumConstant(
        "Extends {@code VkQueryType}.",

        "QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT".."1000396000",
        "QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT".."1000396001"
    )

    EnumConstant(
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_MICROMAP_EXT".."1000396000"
    )

    EnumConstant(
        "Extends {@code VkBufferUsageFlagBits}.",

        "BUFFER_USAGE_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT".enum(0x00800000),
        "BUFFER_USAGE_MICROMAP_STORAGE_BIT_EXT".enum(0x01000000)
    )

    EnumConstant(
        "Extends {@code VkPipelineCreateFlagBits}.",

        "PIPELINE_CREATE_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT".enum(0x01000000)
    )

    EnumConstant(
        "Extends {@code VkGeometryInstanceFlagBitsKHR}.",

        "GEOMETRY_INSTANCE_FORCE_OPACITY_MICROMAP_2_STATE_EXT".enum(0x00000010),
        "GEOMETRY_INSTANCE_DISABLE_OPACITY_MICROMAPS_EXT".enum(0x00000020)
    )

    EnumConstant(
        "Extends {@code VkBuildAccelerationStructureFlagBitsKHR}.",

        "BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_UPDATE_EXT".enum(0x00000040),
        "BUILD_ACCELERATION_STRUCTURE_ALLOW_DISABLE_OPACITY_MICROMAPS_EXT".enum(0x00000080),
        "BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_DATA_UPDATE_EXT".enum(0x00000100)
    )

    EnumConstant(
        """
        VkMicromapTypeEXT - Type of micromap

        <h5>Description</h5>
        <ul>
            <li>#MICROMAP_TYPE_OPACITY_MICROMAP_EXT is a micromap containing data to control the opacity of a triangle.</li>
            <li>#MICROMAP_TYPE_DISPLACEMENT_MICROMAP_NV is a micromap containing data to control the displacement of subtriangles within a triangle.</li>
        </ul>

        <h5>See Also</h5>
        ##VkMicromapBuildInfoEXT, ##VkMicromapCreateInfoEXT
        """,

        "MICROMAP_TYPE_OPACITY_MICROMAP_EXT".."0"
    )

    EnumConstant(
        """
        VkBuildMicromapFlagBitsEXT - Bitmask specifying additional parameters for micromap builds

        <h5>Description</h5>
        <ul>
            <li>#BUILD_MICROMAP_PREFER_FAST_TRACE_BIT_EXT indicates that the given micromap build <b>should</b> prioritize trace performance over build time.</li>
            <li>#BUILD_MICROMAP_PREFER_FAST_BUILD_BIT_EXT indicates that the given micromap build <b>should</b> prioritize build time over trace performance.</li>
        </ul>
        """,

        "BUILD_MICROMAP_PREFER_FAST_TRACE_BIT_EXT".enum(0x00000001),
        "BUILD_MICROMAP_PREFER_FAST_BUILD_BIT_EXT".enum(0x00000002),
        "BUILD_MICROMAP_ALLOW_COMPACTION_BIT_EXT".enum(0x00000004)
    )

    EnumConstant(
        """
        VkBuildMicromapModeEXT - Enum specifying the type of build operation to perform

        <h5>Description</h5>
        <ul>
            <li>#BUILD_MICROMAP_MODE_BUILD_EXT specifies that the destination micromap will be built using the specified data.</li>
        </ul>

        <h5>See Also</h5>
        ##VkMicromapBuildInfoEXT
        """,

        "BUILD_MICROMAP_MODE_BUILD_EXT".."0"
    )

    EnumConstant(
        """
        VkMicromapCreateFlagBitsEXT - Bitmask specifying additional creation parameters for micromap

        <h5>Description</h5>
        <ul>
            <li>#MICROMAP_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT specifies that the micromap’s address <b>can</b> be saved and reused on a subsequent run.</li>
        </ul>
        """,

        "MICROMAP_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT".enum(0x00000001)
    )

    EnumConstant(
        """
        VkCopyMicromapModeEXT - Micromap copy mode

        <h5>Description</h5>
        <ul>
            <li>#COPY_MICROMAP_MODE_CLONE_EXT creates a direct copy of the micromap specified in {@code src} into the one specified by {@code dst}. The {@code dst} micromap <b>must</b> have been created with the same parameters as {@code src}.</li>
            <li>#COPY_MICROMAP_MODE_SERIALIZE_EXT serializes the micromap to a semi-opaque format which can be reloaded on a compatible implementation.</li>
            <li>#COPY_MICROMAP_MODE_DESERIALIZE_EXT deserializes the semi-opaque serialization format in the buffer to the micromap.</li>
            <li>#COPY_MICROMAP_MODE_COMPACT_EXT creates a more compact version of a micromap {@code src} into {@code dst}. The micromap {@code dst} <b>must</b> have been created with a size at least as large as that returned by #CmdWriteMicromapsPropertiesEXT() after the build of the micromap specified by {@code src}.</li>
        </ul>

        <h5>See Also</h5>
        ##VkCopyMemoryToMicromapInfoEXT, ##VkCopyMicromapInfoEXT, ##VkCopyMicromapToMemoryInfoEXT
        """,

        "COPY_MICROMAP_MODE_CLONE_EXT".."0",
        "COPY_MICROMAP_MODE_SERIALIZE_EXT".."1",
        "COPY_MICROMAP_MODE_DESERIALIZE_EXT".."2",
        "COPY_MICROMAP_MODE_COMPACT_EXT".."3"
    )

    EnumConstant(
        """
        VkOpacityMicromapFormatEXT - Format enum for opacity micromaps

        <h5>Description</h5>
        <ul>
            <li>#OPACITY_MICROMAP_FORMAT_2_STATE_EXT indicates that the given micromap format has one bit per subtriangle encoding either fully opaque or fully transparent.</li>
            <li>#OPACITY_MICROMAP_FORMAT_4_STATE_EXT indicates that the given micromap format has two bits per subtriangle encoding four modes which can be interpreted as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#ray-opacity-micromap">ray traversal</a>.</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        For compactness, these values are stored as 16-bit in some structures.
        </div>
        """,

        "OPACITY_MICROMAP_FORMAT_2_STATE_EXT".."1",
        "OPACITY_MICROMAP_FORMAT_4_STATE_EXT".."2"
    )

    EnumConstant(
        """
        VkOpacityMicromapSpecialIndexEXT - Enum for special indices in the opacity micromap

        <h5>Description</h5>
        <ul>
            <li>#OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_TRANSPARENT_EXT specifies that the entire triangle is fully transparent.</li>
            <li>#OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_OPAQUE_EXT specifies that the entire triangle is fully opaque.</li>
            <li>#OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_TRANSPARENT_EXT specifies that the entire triangle is unknown-transparent.</li>
            <li>#OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_OPAQUE_EXT specifies that the entire triangle is unknown-opaque.</li>
        </ul>
        """,

        "OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_TRANSPARENT_EXT".."-1",
        "OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_OPAQUE_EXT".."-2",
        "OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_TRANSPARENT_EXT".."-3",
        "OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_OPAQUE_EXT".."-4"
    )

    VkResult(
        "CreateMicromapEXT",
        """
        Create a new micromap object.

        <h5>C Specification</h5>
        To create a micromap, call:

        <pre><code>
￿VkResult vkCreateMicromapEXT(
￿    VkDevice                                    device,
￿    const VkMicromapCreateInfoEXT*              pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkMicromapEXT*                              pMicromap);</code></pre>

        <h5>Description</h5>
        Similar to other objects in Vulkan, the micromap creation merely creates an object with a specific “{@code shape}”. The type and quantity of geometry that can be built into a micromap is determined by the parameters of ##VkMicromapCreateInfoEXT.

        The micromap data is stored in the object referred to by ##VkMicromapCreateInfoEXT{@code ::buffer}. Once memory has been bound to that buffer, it <b>must</b> be populated by micromap build or micromap copy commands such as #CmdBuildMicromapsEXT(), #BuildMicromapsEXT(), #CmdCopyMicromapEXT(), and #CopyMicromapEXT().

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The expected usage for a trace capture/replay tool is that it will serialize and later deserialize the micromap data using micromap copy commands. During capture the tool will use #CopyMicromapToMemoryEXT() or #CmdCopyMicromapToMemoryEXT() with a {@code mode} of #COPY_MICROMAP_MODE_SERIALIZE_EXT, and #CopyMemoryToMicromapEXT() or #CmdCopyMemoryToMicromapEXT() with a {@code mode} of #COPY_MICROMAP_MODE_DESERIALIZE_EXT during replay.
        </div>

        The input buffers passed to micromap build commands will be referenced by the implementation for the duration of the command. Micromaps <b>must</b> be fully self-contained. The application <b>can</b> reuse or free any memory which was used by the command as an input or as scratch without affecting the results of a subsequent acceleration structure build using the micromap or traversal of that acceleration structure.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-micromap">{@code micromap}</a> feature <b>must</b> be enabled</li>
            <li>If ##VkMicromapCreateInfoEXT{@code ::deviceAddress} is not zero, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-micromapCaptureReplay">{@code micromapCaptureReplay}</a> feature <b>must</b> be enabled</li>
            <li>If {@code device} was created with multiple physical devices, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-bufferDeviceAddressMultiDevice">{@code bufferDeviceAddressMultiDevice}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkMicromapCreateInfoEXT structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pMicromap} <b>must</b> be a valid pointer to a {@code VkMicromapEXT} handle</li>
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
                <li>#ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkMicromapCreateInfoEXT
        """,

        VkDevice("device", "the logical device that creates the acceleration structure object."),
        VkMicromapCreateInfoEXT.const.p("pCreateInfo", "a pointer to a ##VkMicromapCreateInfoEXT structure containing parameters affecting creation of the micromap."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkMicromapEXT.p("pMicromap", "a pointer to a {@code VkMicromapEXT} handle in which the resulting micromap object is returned.")
    )

    void(
        "DestroyMicromapEXT",
        """
        Destroy a micromap object.

        <h5>C Specification</h5>
        To destroy a micromap, call:

        <pre><code>
￿void vkDestroyMicromapEXT(
￿    VkDevice                                    device,
￿    VkMicromapEXT                               micromap,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>All submitted commands that refer to {@code micromap} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code micromap} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code micromap} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code micromap} is not #NULL_HANDLE, {@code micromap} <b>must</b> be a valid {@code VkMicromapEXT} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code micromap} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code micromap} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device that destroys the micromap."),
        VkMicromapEXT("micromap", "the micromap to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    void(
        "CmdBuildMicromapsEXT",
        """
        Build a micromap.

        <h5>C Specification</h5>
        To build micromaps call:

        <pre><code>
￿void vkCmdBuildMicromapsEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    infoCount,
￿    const VkMicromapBuildInfoEXT*               pInfos);</code></pre>

        <h5>Description</h5>
        The {@code vkCmdBuildMicromapsEXT} command provides the ability to initiate multiple micromaps builds, however there is no ordering or synchronization implied between any of the individual micromap builds.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This means that there <b>cannot</b> be any memory aliasing between any micromap memories or scratch memories being used by any of the builds.
        </div>

        Accesses to the micromap scratch buffers as identified by the ##VkMicromapBuildInfoEXT{@code ::scratchData} buffer device addresses <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies">synchronized</a> with the #PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-pipeline-stages">pipeline stage</a> and an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-access-types">access type</a> of (#ACCESS_2_MICROMAP_READ_BIT_EXT | #ACCESS_2_MICROMAP_WRITE_BIT_EXT). Accesses to ##VkMicromapBuildInfoEXT{@code ::dstMicromap} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies">synchronized</a> with the #PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-pipeline-stages">pipeline stage</a> and an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-access-types">access type</a> of #ACCESS_2_MICROMAP_WRITE_BIT_EXT.

        Accesses to other input buffers as identified by any used values of ##VkMicromapBuildInfoEXT{@code ::data} or ##VkMicromapBuildInfoEXT{@code ::triangleArray} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies">synchronized</a> with the #PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-pipeline-stages">pipeline stage</a> and an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-access-types">access type</a> of #ACCESS_SHADER_READ_BIT.

        <h5>Valid Usage</h5>
        <ul>
            <li>For each {@code pInfos}[i], {@code dstMicromap} <b>must</b> have been created with a value of ##VkMicromapCreateInfoEXT{@code ::size} greater than or equal to the memory size required by the build operation, as returned by #GetMicromapBuildSizesEXT() with <code>pBuildInfo = pInfos[i]</code></li>
            <li>The {@code mode} member of each element of {@code pInfos} <b>must</b> be a valid {@code VkBuildMicromapModeEXT} value</li>
            <li>The {@code dstMicromap} member of any element of {@code pInfos} <b>must</b> be a valid {@code VkMicromapEXT} handle</li>
            <li>For each element of {@code pInfos} its {@code type} member <b>must</b> match the value of ##VkMicromapCreateInfoEXT{@code ::type} when its {@code dstMicromap} was created</li>
            <li>The range of memory backing the {@code dstMicromap} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code dstMicromap} member of any other element of {@code pInfos}, which is accessed by this command</li>
            <li>The range of memory backing the {@code dstMicromap} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code scratchData} member of any element of {@code pInfos} (including the same element), which is accessed by this command</li>
            <li>The range of memory backing the {@code scratchData} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code scratchData} member of any other element of {@code pInfos}, which is accessed by this command</li>
        </ul>

        <ul>
            <li>For each element of {@code pInfos}, the {@code buffer} used to create its {@code dstMicromap} member <b>must</b> be bound to device memory</li>
            <li>If {@code pInfos}[i].{@code mode} is #BUILD_MICROMAP_MODE_BUILD_EXT, all addresses between {@code pInfos}[i].{@code scratchData.deviceAddress} and {@code pInfos}[i].{@code scratchData.deviceAddress} + N - 1 <b>must</b> be in the buffer device address range of the same buffer, where N is given by the {@code buildScratchSize} member of the ##VkMicromapBuildSizesInfoEXT structure returned from a call to #GetMicromapBuildSizesEXT() with an identical ##VkMicromapBuildInfoEXT structure and primitive count</li>
            <li>The buffers from which the buffer device addresses for all of the {@code data} and {@code triangleArray} members of all {@code pInfos}[i] are queried <b>must</b> have been created with the #BUFFER_USAGE_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT usage flag</li>
            <li>For each element of {@code pInfos}[i] the buffer from which the buffer device address {@code pInfos}[i].{@code scratchData.deviceAddress} is queried <b>must</b> have been created with #BUFFER_USAGE_STORAGE_BUFFER_BIT usage flag</li>
            <li>For each element of {@code pInfos}, its {@code scratchData.deviceAddress}, {@code data.deviceAddress}, and {@code triangleArray.deviceAddress} members <b>must</b> be valid device addresses obtained from #GetBufferDeviceAddress()</li>
            <li>For each element of {@code pInfos}, if {@code scratchData.deviceAddress}, {@code data.deviceAddress}, or {@code triangleArray.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>For each element of {@code pInfos}, its {@code scratchData.deviceAddress} member <b>must</b> be a multiple of ##VkPhysicalDeviceAccelerationStructurePropertiesKHR{@code ::minAccelerationStructureScratchOffsetAlignment}</li>
            <li>For each element of {@code pInfos}, its {@code triangleArray.deviceAddress} and {@code data.deviceAddress} members <b>must</b> be a multiple of 256</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pInfos} <b>must</b> be a valid pointer to an array of {@code infoCount} valid ##VkMicromapBuildInfoEXT structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code infoCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Outside</td><td>Compute</td><td>Action</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkMicromapBuildInfoEXT
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        AutoSize("pInfos")..uint32_t("infoCount", "the number of micromaps to build. It specifies the number of the {@code pInfos} structures that <b>must</b> be provided."),
        VkMicromapBuildInfoEXT.const.p("pInfos", "a pointer to an array of {@code infoCount} ##VkMicromapBuildInfoEXT structures defining the data used to build each micromap.")
    )

    VkResult(
        "BuildMicromapsEXT",
        """
        Build a micromap on the host.

        <h5>C Specification</h5>
        To build micromaps on the host, call:

        <pre><code>
￿VkResult vkBuildMicromapsEXT(
￿    VkDevice                                    device,
￿    VkDeferredOperationKHR                      deferredOperation,
￿    uint32_t                                    infoCount,
￿    const VkMicromapBuildInfoEXT*               pInfos);</code></pre>

        <h5>Description</h5>
        This command fulfills the same task as #CmdBuildMicromapsEXT() but is executed by the host.

        The {@code vkBuildMicromapsEXT} command provides the ability to initiate multiple micromaps builds, however there is no ordering or synchronization implied between any of the individual micromap builds.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This means that there <b>cannot</b> be any memory aliasing between any micromap memories or scratch memories being used by any of the builds.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>For each {@code pInfos}[i], {@code dstMicromap} <b>must</b> have been created with a value of ##VkMicromapCreateInfoEXT{@code ::size} greater than or equal to the memory size required by the build operation, as returned by #GetMicromapBuildSizesEXT() with <code>pBuildInfo = pInfos[i]</code></li>
            <li>The {@code mode} member of each element of {@code pInfos} <b>must</b> be a valid {@code VkBuildMicromapModeEXT} value</li>
            <li>The {@code dstMicromap} member of any element of {@code pInfos} <b>must</b> be a valid {@code VkMicromapEXT} handle</li>
            <li>For each element of {@code pInfos} its {@code type} member <b>must</b> match the value of ##VkMicromapCreateInfoEXT{@code ::type} when its {@code dstMicromap} was created</li>
            <li>The range of memory backing the {@code dstMicromap} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code dstMicromap} member of any other element of {@code pInfos}, which is accessed by this command</li>
            <li>The range of memory backing the {@code dstMicromap} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code scratchData} member of any element of {@code pInfos} (including the same element), which is accessed by this command</li>
            <li>The range of memory backing the {@code scratchData} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code scratchData} member of any other element of {@code pInfos}, which is accessed by this command</li>
        </ul>

        <ul>
            <li>For each element of {@code pInfos}, the {@code buffer} used to create its {@code dstMicromap} member <b>must</b> be bound to host-visible device memory</li>
            <li>For each element of {@code pInfos}, all referenced addresses of {@code pInfos}[i].{@code data.hostAddress} <b>must</b> be valid host memory</li>
            <li>For each element of {@code pInfos}, all referenced addresses of {@code pInfos}[i].{@code triangleArray.hostAddress} <b>must</b> be valid host memory</li>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-micromapHostCommands">##VkPhysicalDeviceOpacityMicromapFeaturesEXT{@code ::micromapHostCommands}</a> feature <b>must</b> be enabled</li>
            <li>If {@code pInfos}[i].{@code mode} is #BUILD_MICROMAP_MODE_BUILD_EXT, all addresses between {@code pInfos}[i].{@code scratchData.hostAddress} and {@code pInfos}[i].{@code scratchData.hostAddress} + N - 1 <b>must</b> be valid host memory, where N is given by the {@code buildScratchSize} member of the ##VkMicromapBuildSizesInfoEXT structure returned from a call to #GetMicromapBuildSizesEXT() with an identical ##VkMicromapBuildInfoEXT structure and primitive count</li>
            <li>For each element of {@code pInfos}, the {@code buffer} used to create its {@code dstMicromap} member <b>must</b> be bound to memory that was not allocated with multiple instances</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code deferredOperation} is not #NULL_HANDLE, {@code deferredOperation} <b>must</b> be a valid {@code VkDeferredOperationKHR} handle</li>
            <li>{@code pInfos} <b>must</b> be a valid pointer to an array of {@code infoCount} valid ##VkMicromapBuildInfoEXT structures</li>
            <li>{@code infoCount} <b>must</b> be greater than 0</li>
            <li>If {@code deferredOperation} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#OPERATION_DEFERRED_KHR</li>
                <li>#OPERATION_NOT_DEFERRED_KHR</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkMicromapBuildInfoEXT
        """,

        VkDevice("device", "the {@code VkDevice} for which the micromaps are being built."),
        VkDeferredOperationKHR("deferredOperation", "an optional {@code VkDeferredOperationKHR} to <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#deferred-host-operations-requesting\">request deferral</a> for this command."),
        AutoSize("pInfos")..uint32_t("infoCount", "the number of micromaps to build. It specifies the number of the {@code pInfos} that <b>must</b> be provided."),
        VkMicromapBuildInfoEXT.const.p("pInfos", "a pointer to an array of {@code infoCount} ##VkMicromapBuildInfoEXT structures defining the geometry used to build each micromap.")
    )

    VkResult(
        "CopyMicromapEXT",
        """
        Copy a micromap on the host.

        <h5>C Specification</h5>
        To copy or compact a micromap on the host, call:

        <pre><code>
￿VkResult vkCopyMicromapEXT(
￿    VkDevice                                    device,
￿    VkDeferredOperationKHR                      deferredOperation,
￿    const VkCopyMicromapInfoEXT*                pInfo);</code></pre>

        <h5>Description</h5>
        This command fulfills the same task as #CmdCopyMicromapEXT() but is executed by the host.

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code deferredOperation} is not #NULL_HANDLE, it <b>must</b> be a valid {@code VkDeferredOperationKHR} object</li>
            <li>Any previous deferred operation that was associated with {@code deferredOperation} <b>must</b> be complete</li>
            <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to host-visible device memory</li>
            <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to host-visible device memory</li>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-micromapHostCommands">##VkPhysicalDeviceOpacityMicromapFeaturesEXT{@code ::micromapHostCommands}</a> feature <b>must</b> be enabled</li>
            <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to memory that was not allocated with multiple instances</li>
            <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to memory that was not allocated with multiple instances</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code deferredOperation} is not #NULL_HANDLE, {@code deferredOperation} <b>must</b> be a valid {@code VkDeferredOperationKHR} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkCopyMicromapInfoEXT structure</li>
            <li>If {@code deferredOperation} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#OPERATION_DEFERRED_KHR</li>
                <li>#OPERATION_NOT_DEFERRED_KHR</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkCopyMicromapInfoEXT
        """,

        VkDevice("device", "the device which owns the micromaps."),
        VkDeferredOperationKHR("deferredOperation", "an optional {@code VkDeferredOperationKHR} to <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#deferred-host-operations-requesting\">request deferral</a> for this command."),
        VkCopyMicromapInfoEXT.const.p("pInfo", "a pointer to a ##VkCopyMicromapInfoEXT structure defining the copy operation.")
    )

    VkResult(
        "CopyMicromapToMemoryEXT",
        """
        Serialize a micromap on the host.

        <h5>C Specification</h5>
        To copy a micromap to host accessible memory, call:

        <pre><code>
￿VkResult vkCopyMicromapToMemoryEXT(
￿    VkDevice                                    device,
￿    VkDeferredOperationKHR                      deferredOperation,
￿    const VkCopyMicromapToMemoryInfoEXT*        pInfo);</code></pre>

        <h5>Description</h5>
        This command fulfills the same task as #CmdCopyMicromapToMemoryEXT() but is executed by the host.

        This command produces the same results as #CmdCopyMicromapToMemoryEXT(), but writes its result directly to a host pointer, and is executed on the host rather than the device. The output <b>may</b> not necessarily be bit-for-bit identical, but it can be equally used by either #CmdCopyMemoryToMicromapEXT() or #CopyMemoryToMicromapEXT().

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code deferredOperation} is not #NULL_HANDLE, it <b>must</b> be a valid {@code VkDeferredOperationKHR} object</li>
            <li>Any previous deferred operation that was associated with {@code deferredOperation} <b>must</b> be complete</li>
            <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to host-visible device memory</li>
            <li>{@code pInfo→dst.hostAddress} <b>must</b> be a valid host pointer</li>
            <li>{@code pInfo→dst.hostAddress} <b>must</b> be aligned to 16 bytes</li>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-micromapHostCommands">##VkPhysicalDeviceOpacityMicromapFeaturesEXT{@code ::micromapHostCommands}</a> feature <b>must</b> be enabled</li>
            <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to memory that was not allocated with multiple instances</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code deferredOperation} is not #NULL_HANDLE, {@code deferredOperation} <b>must</b> be a valid {@code VkDeferredOperationKHR} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkCopyMicromapToMemoryInfoEXT structure</li>
            <li>If {@code deferredOperation} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#OPERATION_DEFERRED_KHR</li>
                <li>#OPERATION_NOT_DEFERRED_KHR</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkCopyMicromapToMemoryInfoEXT
        """,

        VkDevice("device", "the device which owns {@code pInfo→src}."),
        VkDeferredOperationKHR("deferredOperation", "an optional {@code VkDeferredOperationKHR} to <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#deferred-host-operations-requesting\">request deferral</a> for this command."),
        VkCopyMicromapToMemoryInfoEXT.const.p("pInfo", "a pointer to a ##VkCopyMicromapToMemoryInfoEXT structure defining the copy operation.")
    )

    VkResult(
        "CopyMemoryToMicromapEXT",
        """
        Deserialize a micromap on the host.

        <h5>C Specification</h5>
        To copy host accessible memory to a micromap, call:

        <pre><code>
￿VkResult vkCopyMemoryToMicromapEXT(
￿    VkDevice                                    device,
￿    VkDeferredOperationKHR                      deferredOperation,
￿    const VkCopyMemoryToMicromapInfoEXT*        pInfo);</code></pre>

        <h5>Description</h5>
        This command fulfills the same task as #CmdCopyMemoryToMicromapEXT() but is executed by the host.

        This command can accept micromaps produced by either #CmdCopyMicromapToMemoryEXT() or #CopyMicromapToMemoryEXT().

        <h5>Valid Usage</h5>
        <ul>
            <li>If {@code deferredOperation} is not #NULL_HANDLE, it <b>must</b> be a valid {@code VkDeferredOperationKHR} object</li>
            <li>Any previous deferred operation that was associated with {@code deferredOperation} <b>must</b> be complete</li>
            <li>{@code pInfo→src.hostAddress} <b>must</b> be a valid host pointer</li>
            <li>{@code pInfo→src.hostAddress} <b>must</b> be aligned to 16 bytes</li>
            <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to host-visible device memory</li>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-micromapHostCommands">##VkPhysicalDeviceOpacityMicromapFeaturesEXT{@code ::micromapHostCommands}</a> feature <b>must</b> be enabled</li>
            <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to memory that was not allocated with multiple instances</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code deferredOperation} is not #NULL_HANDLE, {@code deferredOperation} <b>must</b> be a valid {@code VkDeferredOperationKHR} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkCopyMemoryToMicromapInfoEXT structure</li>
            <li>If {@code deferredOperation} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#OPERATION_DEFERRED_KHR</li>
                <li>#OPERATION_NOT_DEFERRED_KHR</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkCopyMemoryToMicromapInfoEXT
        """,

        VkDevice("device", "the device which owns {@code pInfo→dst}."),
        VkDeferredOperationKHR("deferredOperation", "an optional {@code VkDeferredOperationKHR} to <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#deferred-host-operations-requesting\">request deferral</a> for this command."),
        VkCopyMemoryToMicromapInfoEXT.const.p("pInfo", "a pointer to a ##VkCopyMemoryToMicromapInfoEXT structure defining the copy operation.")
    )

    VkResult(
        "WriteMicromapsPropertiesEXT",
        """
        Query micromap meta-data on the host.

        <h5>C Specification</h5>
        To query micromap size parameters on the host, call:

        <pre><code>
￿VkResult vkWriteMicromapsPropertiesEXT(
￿    VkDevice                                    device,
￿    uint32_t                                    micromapCount,
￿    const VkMicromapEXT*                        pMicromaps,
￿    VkQueryType                                 queryType,
￿    size_t                                      dataSize,
￿    void*                                       pData,
￿    size_t                                      stride);</code></pre>

        <h5>Description</h5>
        This command fulfills the same task as #CmdWriteMicromapsPropertiesEXT() but is executed by the host.

        <h5>Valid Usage</h5>
        <ul>
            <li>All micromaps in {@code pMicromaps} <b>must</b> have been constructed prior to the execution of this command</li>
            <li>All micromaps in {@code pMicromaps} <b>must</b> have been constructed with #BUILD_MICROMAP_ALLOW_COMPACTION_BIT_EXT if {@code queryType} is #QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT</li>
            <li>{@code queryType} <b>must</b> be #QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT or #QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT</li>
            <li>If {@code queryType} is #QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT, then {@code stride} <b>must</b> be a multiple of the size of {@code VkDeviceSize}</li>
            <li>If {@code queryType} is #QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT, then {@code pData} <b>must</b> point to a {@code VkDeviceSize}</li>
            <li>If {@code queryType} is</li>
            <li>{@code dataSize} <b>must</b> be greater than or equal to <code>micromapCount*stride</code></li>
            <li>The {@code buffer} used to create each micromap in {@code pMicromaps} <b>must</b> be bound to host-visible device memory</li>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-micromapHostCommands">##VkPhysicalDeviceOpacityMicromapFeaturesEXT{@code ::micromapHostCommands}</a> feature <b>must</b> be enabled</li>
            <li>The {@code buffer} used to create each micromap in {@code pMicromaps} <b>must</b> be bound to memory that was not allocated with multiple instances</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pMicromaps} <b>must</b> be a valid pointer to an array of {@code micromapCount} valid {@code VkMicromapEXT} handles</li>
            <li>{@code queryType} <b>must</b> be a valid {@code VkQueryType} value</li>
            <li>{@code pData} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
            <li>{@code micromapCount} <b>must</b> be greater than 0</li>
            <li>{@code dataSize} <b>must</b> be greater than 0</li>
            <li>Each element of {@code pMicromaps} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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

        VkDevice("device", "the device which owns the micromaps in {@code pMicromaps}."),
        AutoSize("pMicromaps")..uint32_t("micromapCount", "the count of micromaps for which to query the property."),
        VkMicromapEXT.const.p("pMicromaps", "a pointer to an array of existing previously built micromaps."),
        VkQueryType("queryType", "a {@code VkQueryType} value specifying the property to be queried."),
        AutoSize("pData")..size_t("dataSize", "the size in bytes of the buffer pointed to by {@code pData}."),
        void.p("pData", "a pointer to a user-allocated buffer where the results will be written."),
        size_t("stride", "the stride in bytes between results for individual queries within {@code pData}.")
    )

    void(
        "CmdCopyMicromapEXT",
        """
        Copy a micromap.

        <h5>C Specification</h5>
        To copy a micromap call:

        <pre><code>
￿void vkCmdCopyMicromapEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCopyMicromapInfoEXT*                pInfo);</code></pre>

        <h5>Description</h5>
        This command copies the {@code pInfo→src} micromap to the {@code pInfo→dst} micromap in the manner specified by {@code pInfo→mode}.

        Accesses to {@code pInfo→src} and {@code pInfo→dst} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies">synchronized</a> with the #PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-pipeline-stages">pipeline stage</a> and an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-access-types">access type</a> of #ACCESS_2_MICROMAP_READ_BIT_EXT or #ACCESS_2_MICROMAP_WRITE_BIT_EXT as appropriate.

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to device memory</li>
            <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to device memory</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkCopyMicromapInfoEXT structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Outside</td><td>Compute</td><td>Action</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkCopyMicromapInfoEXT
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCopyMicromapInfoEXT.const.p("pInfo", "a pointer to a ##VkCopyMicromapInfoEXT structure defining the copy operation.")
    )

    void(
        "CmdCopyMicromapToMemoryEXT",
        """
        Copy a micromap to device memory.

        <h5>C Specification</h5>
        To copy a micromap to device memory call:

        <pre><code>
￿void vkCmdCopyMicromapToMemoryEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCopyMicromapToMemoryInfoEXT*        pInfo);</code></pre>

        <h5>Description</h5>
        Accesses to {@code pInfo→src} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies">synchronized</a> with the #PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-pipeline-stages">pipeline stage</a> and an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-access-types">access type</a> of #ACCESS_2_MICROMAP_READ_BIT_EXT. Accesses to the buffer indicated by {@code pInfo→dst.deviceAddress} <b>must</b> be synchronized with the #PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT pipeline stage and an access type of #ACCESS_TRANSFER_WRITE_BIT.

        This command produces the same results as #CopyMicromapToMemoryEXT(), but writes its result to a device address, and is executed on the device rather than the host. The output <b>may</b> not necessarily be bit-for-bit identical, but it can be equally used by either #CmdCopyMemoryToMicromapEXT() or #CopyMemoryToMicromapEXT().

        The defined header structure for the serialized data consists of:

        <ul>
            <li>#UUID_SIZE bytes of data matching ##VkPhysicalDeviceIDProperties{@code ::driverUUID}</li>
            <li>#UUID_SIZE bytes of data identifying the compatibility for comparison using #GetDeviceMicromapCompatibilityEXT() The serialized data is written to the buffer (or read from the buffer) according to the host endianness.</li>
        </ul>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pInfo→dst.deviceAddress} <b>must</b> be a valid device address for a buffer bound to device memory</li>
            <li>{@code pInfo→dst.deviceAddress} <b>must</b> be aligned to 256 bytes</li>
            <li>If the buffer pointed to by {@code pInfo→dst.deviceAddress} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to device memory</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkCopyMicromapToMemoryInfoEXT structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Outside</td><td>Compute</td><td>Action</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkCopyMicromapToMemoryInfoEXT
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCopyMicromapToMemoryInfoEXT.const.p("pInfo", "an a pointer to a ##VkCopyMicromapToMemoryInfoEXT structure defining the copy operation.")
    )

    void(
        "CmdCopyMemoryToMicromapEXT",
        """
        Copy device memory to a micromap.

        <h5>C Specification</h5>
        To copy device memory to a micromap call:

        <pre><code>
￿void vkCmdCopyMemoryToMicromapEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkCopyMemoryToMicromapInfoEXT*        pInfo);</code></pre>

        <h5>Description</h5>
        Accesses to {@code pInfo→dst} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies">synchronized</a> with the #PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-pipeline-stages">pipeline stage</a> and an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-access-types">access type</a> of #ACCESS_2_MICROMAP_READ_BIT_EXT. Accesses to the buffer indicated by {@code pInfo→src.deviceAddress} <b>must</b> be synchronized with the #PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT pipeline stage and an access type of #ACCESS_TRANSFER_READ_BIT.

        This command can accept micromaps produced by either #CmdCopyMicromapToMemoryEXT() or #CopyMicromapToMemoryEXT().

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pInfo→src.deviceAddress} <b>must</b> be a valid device address for a buffer bound to device memory</li>
            <li>{@code pInfo→src.deviceAddress} <b>must</b> be aligned to 256 bytes</li>
            <li>If the buffer pointed to by {@code pInfo→src.deviceAddress} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
            <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to device memory</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pInfo} <b>must</b> be a valid pointer to a valid ##VkCopyMemoryToMicromapInfoEXT structure</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Outside</td><td>Compute</td><td>Action</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkCopyMemoryToMicromapInfoEXT
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkCopyMemoryToMicromapInfoEXT.const.p("pInfo", "a pointer to a ##VkCopyMicromapToMemoryInfoEXT structure defining the copy operation.")
    )

    void(
        "CmdWriteMicromapsPropertiesEXT",
        """
        Write micromap result parameters to query results.

        <h5>C Specification</h5>
        To query micromap size parameters call:

        <pre><code>
￿void vkCmdWriteMicromapsPropertiesEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    micromapCount,
￿    const VkMicromapEXT*                        pMicromaps,
￿    VkQueryType                                 queryType,
￿    VkQueryPool                                 queryPool,
￿    uint32_t                                    firstQuery);</code></pre>

        <h5>Description</h5>
        Accesses to any of the micromaps listed in {@code pMicromaps} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-dependencies">synchronized</a> with the #PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-pipeline-stages">pipeline stage</a> and an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-access-types">access type</a> of #ACCESS_2_MICROMAP_READ_BIT_EXT.

        <ul>
            <li>If {@code queryType} is #QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT, then the value written out is the number of bytes required by a serialized micromap.</li>
            <li>If {@code queryType} is #QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT, then the value written out is the number of bytes required by a compacted micromap.</li>
        </ul>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code queryPool} <b>must</b> have been created with a {@code queryType} matching {@code queryType}</li>
            <li>The queries identified by {@code queryPool} and {@code firstQuery} <b>must</b> be <em>unavailable</em></li>
            <li>The {@code buffer} used to create each micromap in {@code pMicrmaps} <b>must</b> be bound to device memory</li>
            <li>The sum of {@code query} plus {@code micromapCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
        </ul>

        <ul>
            <li>All micromaps in {@code pMicromaps} <b>must</b> have been constructed prior to the execution of this command</li>
            <li>All micromaps in {@code pMicromaps} <b>must</b> have been constructed with #BUILD_MICROMAP_ALLOW_COMPACTION_BIT_EXT if {@code queryType} is #QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT</li>
            <li>{@code queryType} <b>must</b> be #QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT or #QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pMicromaps} <b>must</b> be a valid pointer to an array of {@code micromapCount} valid {@code VkMicromapEXT} handles</li>
            <li>{@code queryType} <b>must</b> be a valid {@code VkQueryType} value</li>
            <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
            <li>This command <b>must</b> only be called outside of a render pass instance</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code micromapCount} <b>must</b> be greater than 0</li>
            <li>Each of {@code commandBuffer}, {@code queryPool}, and the elements of {@code pMicromaps} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Outside</td><td>Compute</td><td>Action</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        AutoSize("pMicromaps")..uint32_t("micromapCount", "the count of micromaps for which to query the property."),
        VkMicromapEXT.const.p("pMicromaps", "a pointer to an array of existing previously built micromaps."),
        VkQueryType("queryType", "a {@code VkQueryType} value specifying the type of queries managed by the pool."),
        VkQueryPool("queryPool", "the query pool that will manage the results of the query."),
        uint32_t("firstQuery", "the first query index within the query pool that will contain the {@code micromapCount} number of results.")
    )

    void(
        "GetDeviceMicromapCompatibilityEXT",
        """
        Check if a serialized micromap is compatible with the current device.

        <h5>C Specification</h5>
        To check if a serialized micromap is compatible with the current device call:

        <pre><code>
￿void vkGetDeviceMicromapCompatibilityEXT(
￿    VkDevice                                    device,
￿    const VkMicromapVersionInfoEXT*             pVersionInfo,
￿    VkAccelerationStructureCompatibilityKHR*    pCompatibility);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-micromap">{@code micromap}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pVersionInfo} <b>must</b> be a valid pointer to a valid ##VkMicromapVersionInfoEXT structure</li>
            <li>{@code pCompatibility} <b>must</b> be a valid pointer to a {@code VkAccelerationStructureCompatibilityKHR} value</li>
        </ul>

        <h5>See Also</h5>
        ##VkMicromapVersionInfoEXT
        """,

        VkDevice("device", "the device to check the version against."),
        VkMicromapVersionInfoEXT.const.p("pVersionInfo", "a pointer to a ##VkMicromapVersionInfoEXT structure specifying version information to check against the device."),
        Check(1)..VkAccelerationStructureCompatibilityKHR.p("pCompatibility", "a pointer to a {@code VkAccelerationStructureCompatibilityKHR} value in which compatibility information is returned.")
    )

    void(
        "GetMicromapBuildSizesEXT",
        """
        Retrieve the required size for a micromap.

        <h5>C Specification</h5>
        To get the build sizes for a micromap, call:

        <pre><code>
￿void vkGetMicromapBuildSizesEXT(
￿    VkDevice                                    device,
￿    VkAccelerationStructureBuildTypeKHR         buildType,
￿    const VkMicromapBuildInfoEXT*               pBuildInfo,
￿    VkMicromapBuildSizesInfoEXT*                pSizeInfo);</code></pre>

        <h5>Description</h5>
        The {@code dstMicromap} and {@code mode} members of {@code pBuildInfo} are ignored. Any ##VkDeviceOrHostAddressKHR members of {@code pBuildInfo} are ignored by this command.

        A micromap created with the {@code micromapSize} returned by this command supports any build with a ##VkMicromapBuildInfoEXT structure subject to the following properties:

        <ul>
            <li>The build command is a host build command, and {@code buildType} is #ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_KHR or #ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR</li>
            <li>The build command is a device build command, and {@code buildType} is #ACCELERATION_STRUCTURE_BUILD_TYPE_DEVICE_KHR or #ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR</li>
            <li>
                For ##VkMicromapBuildInfoEXT:
                <ul>
                    <li>Its {@code type}, and {@code flags} members are equal to {@code pBuildInfo→type} and {@code pBuildInfo→flags}, respectively.</li>
                    <li>The sum of usage information in either {@code pUsageCounts} or {@code ppUsageCounts} is equal to the sum of usage information in either {@code pBuildInfo→pUsageCounts} or {@code pBuildInfo→ppUsageCounts}.</li>
                </ul>
            </li>
        </ul>

        Similarly, the {@code buildScratchSize} value will support any build command specifying the #BUILD_MICROMAP_MODE_BUILD_EXT {@code mode} under the above conditions.

        <h5>Valid Usage</h5>
        <ul>
            <li>##VkMicromapBuildInfoEXT{@code ::dstMicromap} <b>must</b> have been created from {@code device}</li>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-micromap">{@code micromap}</a> feature <b>must</b> be enabled</li>
            <li>If {@code device} was created with multiple physical devices, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-bufferDeviceAddressMultiDevice">{@code bufferDeviceAddressMultiDevice}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code buildType} <b>must</b> be a valid {@code VkAccelerationStructureBuildTypeKHR} value</li>
            <li>{@code pBuildInfo} <b>must</b> be a valid pointer to a valid ##VkMicromapBuildInfoEXT structure</li>
            <li>{@code pSizeInfo} <b>must</b> be a valid pointer to a ##VkMicromapBuildSizesInfoEXT structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkMicromapBuildInfoEXT, ##VkMicromapBuildSizesInfoEXT
        """,

        VkDevice("device", "the logical device that will be used for creating the micromap."),
        VkAccelerationStructureBuildTypeKHR("buildType", "defines whether host or device operations (or both) are being queried for."),
        VkMicromapBuildInfoEXT.const.p("pBuildInfo", "a pointer to a ##VkMicromapBuildInfoEXT structure describing parameters of a build operation."),
        VkMicromapBuildSizesInfoEXT.p("pSizeInfo", "a pointer to a ##VkMicromapBuildSizesInfoEXT structure which returns the size required for a micromap and the sizes required for the scratch buffers, given the build parameters.")
    )
}
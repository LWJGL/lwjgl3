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
 * When adding adding transparency to a ray traced scene, an application can choose between further tessellating the geometry or using an any hit shader to allow the ray through specific parts of the geometry. These options have the downside of either significantly increasing memory consumption or adding runtime overhead to run shader code in the middle of traversal, respectively.
 * 
 * <p>This extension adds the ability to add an <em>opacity micromap</em> to geometry when building an acceleration structure. The opacity micromap compactly encodes opacity information which can be read by the implementation to mark parts of triangles as opaque or transparent. The format is externally visible to allow the application to compress its internal geometry and surface representations into the compressed format ahead of time. The compressed format subdivides each triangle into a set of subtriangles, each of which can be assigned either two or four opacity values. These opacity values can control if a ray hitting that subtriangle is treated as an opaque hit, complete miss, or possible hit, depending on the controls described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#ray-opacity-micromap">Ray Opacity Micromap</a>.</p>
 * 
 * <p>This extension provides:</p>
 * 
 * <ul>
 * <li>a {@code VkMicromapEXT} structure to store the micromap,</li>
 * <li>functions similar to acceleration structure build functions to build the opacity micromap array, and</li>
 * <li>a structure to extend {@link VkAccelerationStructureGeometryTrianglesDataKHR} to attach a micromap to the geometry of the acceleration structure.</li>
 * </ul>
 * 
 * <h5>Reference Code</h5>
 * 
 * <pre><code>
 * uint32_t BarycentricsToSpaceFillingCurveIndex(float u, float v, uint32_t level)
 * {
 *     u = clamp(u, 0.0f, 1.0f);
 *     v = clamp(v, 0.0f, 1.0f);
 * 
 *     uint32_t iu, iv, iw;
 * 
 *     // Quantize barycentric coordinates
 *     float fu = u * (1u &lt;&lt; level);
 *     float fv = v * (1u &lt;&lt; level);
 * 
 *     iu = (uint32_t)fu;
 *     iv = (uint32_t)fv;
 * 
 *     float uf = fu - float(iu);
 *     float vf = fv - float(iv);
 * 
 *     if (iu &gt;= (1u &lt;&lt; level)) iu = (1u &lt;&lt; level) - 1u;
 *     if (iv &gt;= (1u &lt;&lt; level)) iv = (1u &lt;&lt; level) - 1u;
 * 
 *     uint32_t iuv = iu + iv;
 * 
 *     if (iuv &gt;= (1u &lt;&lt; level))
 *         iu -= iuv - (1u &lt;&lt; level) + 1u;
 * 
 *     iw = ~(iu + iv);
 * 
 *     if (uf + vf &gt;= 1.0f &amp;&amp; iuv &lt; (1u &lt;&lt; level) - 1u) --iw;
 * 
 *     uint32_t b0 = ~(iu ^ iw);
 *     b0 &amp;= ((1u &lt;&lt; level) - 1u);
 *     uint32_t t = (iu ^ iv) &amp; b0;
 * 
 *     uint32_t f = t;
 *     f ^= f &gt;&gt; 1u;
 *     f ^= f &gt;&gt; 2u;
 *     f ^= f &gt;&gt; 4u;
 *     f ^= f &gt;&gt; 8u;
 *     uint32_t b1 = ((f ^ iu) &amp; ~b0) | t;
 * 
 *     // Interleave bits
 *     b0 = (b0 | (b0 &lt;&lt; 8u)) &amp; 0x00ff00ffu;
 *     b0 = (b0 | (b0 &lt;&lt; 4u)) &amp; 0x0f0f0f0fu;
 *     b0 = (b0 | (b0 &lt;&lt; 2u)) &amp; 0x33333333u;
 *     b0 = (b0 | (b0 &lt;&lt; 1u)) &amp; 0x55555555u;
 *     b1 = (b1 | (b1 &lt;&lt; 8u)) &amp; 0x00ff00ffu;
 *     b1 = (b1 | (b1 &lt;&lt; 4u)) &amp; 0x0f0f0f0fu;
 *     b1 = (b1 | (b1 &lt;&lt; 2u)) &amp; 0x33333333u;
 *     b1 = (b1 | (b1 &lt;&lt; 1u)) &amp; 0x55555555u;
 * 
 *     return b0 | (b1 &lt;&lt; 1u);
 * }</code></pre>
 * 
 * <h5>VK_EXT_opacity_micromap</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_opacity_micromap}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>397</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRAccelerationStructure VK_KHR_acceleration_structure} and {@link KHRSynchronization2 VK_KHR_synchronization2}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Christoph Kubisch <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_opacity_micromap]%20@pixeljetstream%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_opacity_micromap%20extension*">pixeljetstream</a></li>
 * <li>Eric Werness</li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_opacity_micromap.adoc">VK_EXT_opacity_micromap</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-08-24</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/EXT/SPV_EXT_opacity_micromap.html">{@code SPV_EXT_opacity_micromap}</a></li>
 * <li>This extension provides API support for <a href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/ext/GLSL_EXT_opacity_micromap.txt">{@code GLSL_EXT_opacity_micromap}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Christoph Kubisch, NVIDIA</li>
 * <li>Eric Werness, NVIDIA</li>
 * <li>Josh Barczak, Intel</li>
 * <li>Stu Smith, AMD</li>
 * </ul></dd>
 * </dl>
 */
public class EXTOpacityMicromap {

    /** The extension specification version. */
    public static final int VK_EXT_OPACITY_MICROMAP_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_EXT_OPACITY_MICROMAP_EXTENSION_NAME = "VK_EXT_opacity_micromap";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_MICROMAP_BUILD_INFO_EXT STRUCTURE_TYPE_MICROMAP_BUILD_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MICROMAP_VERSION_INFO_EXT STRUCTURE_TYPE_MICROMAP_VERSION_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COPY_MICROMAP_INFO_EXT STRUCTURE_TYPE_COPY_MICROMAP_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COPY_MICROMAP_TO_MEMORY_INFO_EXT STRUCTURE_TYPE_COPY_MICROMAP_TO_MEMORY_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_COPY_MEMORY_TO_MICROMAP_INFO_EXT STRUCTURE_TYPE_COPY_MEMORY_TO_MICROMAP_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_MICROMAP_BUILD_INFO_EXT                               = 1000396000,
        VK_STRUCTURE_TYPE_MICROMAP_VERSION_INFO_EXT                             = 1000396001,
        VK_STRUCTURE_TYPE_COPY_MICROMAP_INFO_EXT                                = 1000396002,
        VK_STRUCTURE_TYPE_COPY_MICROMAP_TO_MEMORY_INFO_EXT                      = 1000396003,
        VK_STRUCTURE_TYPE_COPY_MEMORY_TO_MICROMAP_INFO_EXT                      = 1000396004,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT         = 1000396005,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT       = 1000396006,
        VK_STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT                              = 1000396007,
        VK_STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT                         = 1000396008,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT = 1000396009;

    /** Extends {@code VkPipelineStageFlagBits2}. */
    public static final long VK_PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT = 0x40000000L;

    /**
     * Extends {@code VkAccessFlagBits2}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_ACCESS_2_MICROMAP_READ_BIT_EXT ACCESS_2_MICROMAP_READ_BIT_EXT}</li>
     * <li>{@link #VK_ACCESS_2_MICROMAP_WRITE_BIT_EXT ACCESS_2_MICROMAP_WRITE_BIT_EXT}</li>
     * </ul>
     */
    public static final long
        VK_ACCESS_2_MICROMAP_READ_BIT_EXT  = 0x100000000000L,
        VK_ACCESS_2_MICROMAP_WRITE_BIT_EXT = 0x200000000000L;

    /**
     * Extends {@code VkQueryType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT}</li>
     * <li>{@link #VK_QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT}</li>
     * </ul>
     */
    public static final int
        VK_QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT = 1000396000,
        VK_QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT     = 1000396001;

    /** Extends {@code VkObjectType}. */
    public static final int VK_OBJECT_TYPE_MICROMAP_EXT = 1000396000;

    /**
     * Extends {@code VkBufferUsageFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUFFER_USAGE_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT BUFFER_USAGE_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT}</li>
     * <li>{@link #VK_BUFFER_USAGE_MICROMAP_STORAGE_BIT_EXT BUFFER_USAGE_MICROMAP_STORAGE_BIT_EXT}</li>
     * </ul>
     */
    public static final int
        VK_BUFFER_USAGE_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT = 0x800000,
        VK_BUFFER_USAGE_MICROMAP_STORAGE_BIT_EXT               = 0x1000000;

    /** Extends {@code VkPipelineCreateFlagBits}. */
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT = 0x1000000;

    /**
     * Extends {@code VkGeometryInstanceFlagBitsKHR}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_GEOMETRY_INSTANCE_FORCE_OPACITY_MICROMAP_2_STATE_EXT GEOMETRY_INSTANCE_FORCE_OPACITY_MICROMAP_2_STATE_EXT}</li>
     * <li>{@link #VK_GEOMETRY_INSTANCE_DISABLE_OPACITY_MICROMAPS_EXT GEOMETRY_INSTANCE_DISABLE_OPACITY_MICROMAPS_EXT}</li>
     * </ul>
     */
    public static final int
        VK_GEOMETRY_INSTANCE_FORCE_OPACITY_MICROMAP_2_STATE_EXT = 0x10,
        VK_GEOMETRY_INSTANCE_DISABLE_OPACITY_MICROMAPS_EXT      = 0x20;

    /**
     * Extends {@code VkBuildAccelerationStructureFlagBitsKHR}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_UPDATE_EXT BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_UPDATE_EXT}</li>
     * <li>{@link #VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_DISABLE_OPACITY_MICROMAPS_EXT BUILD_ACCELERATION_STRUCTURE_ALLOW_DISABLE_OPACITY_MICROMAPS_EXT}</li>
     * <li>{@link #VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_DATA_UPDATE_EXT BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_DATA_UPDATE_EXT}</li>
     * </ul>
     */
    public static final int
        VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_UPDATE_EXT      = 0x40,
        VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_DISABLE_OPACITY_MICROMAPS_EXT    = 0x80,
        VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_OPACITY_MICROMAP_DATA_UPDATE_EXT = 0x100;

    /**
     * VkMicromapTypeEXT - Type of micromap
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_MICROMAP_TYPE_OPACITY_MICROMAP_EXT MICROMAP_TYPE_OPACITY_MICROMAP_EXT} is a micromap containing data to control the opacity of a triangle.</li>
     * <li>{@link NVDisplacementMicromap#VK_MICROMAP_TYPE_DISPLACEMENT_MICROMAP_NV MICROMAP_TYPE_DISPLACEMENT_MICROMAP_NV} is a micromap containing data to control the displacement of subtriangles within a triangle.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkMicromapBuildInfoEXT}, {@link VkMicromapCreateInfoEXT}</p>
     */
    public static final int VK_MICROMAP_TYPE_OPACITY_MICROMAP_EXT = 0;

    /**
     * VkBuildMicromapFlagBitsEXT - Bitmask specifying additional parameters for micromap builds
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUILD_MICROMAP_PREFER_FAST_TRACE_BIT_EXT BUILD_MICROMAP_PREFER_FAST_TRACE_BIT_EXT} indicates that the given micromap build <b>should</b> prioritize trace performance over build time.</li>
     * <li>{@link #VK_BUILD_MICROMAP_PREFER_FAST_BUILD_BIT_EXT BUILD_MICROMAP_PREFER_FAST_BUILD_BIT_EXT} indicates that the given micromap build <b>should</b> prioritize build time over trace performance.</li>
     * </ul>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUILD_MICROMAP_ALLOW_COMPACTION_BIT_EXT BUILD_MICROMAP_ALLOW_COMPACTION_BIT_EXT}</li>
     * </ul>
     */
    public static final int
        VK_BUILD_MICROMAP_PREFER_FAST_TRACE_BIT_EXT = 0x1,
        VK_BUILD_MICROMAP_PREFER_FAST_BUILD_BIT_EXT = 0x2,
        VK_BUILD_MICROMAP_ALLOW_COMPACTION_BIT_EXT  = 0x4;

    /**
     * VkBuildMicromapModeEXT - Enum specifying the type of build operation to perform
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_BUILD_MICROMAP_MODE_BUILD_EXT BUILD_MICROMAP_MODE_BUILD_EXT} specifies that the destination micromap will be built using the specified data.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkMicromapBuildInfoEXT}</p>
     */
    public static final int VK_BUILD_MICROMAP_MODE_BUILD_EXT = 0;

    /**
     * VkMicromapCreateFlagBitsEXT - Bitmask specifying additional creation parameters for micromap
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_MICROMAP_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT MICROMAP_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT} specifies that the micromap’s address <b>can</b> be saved and reused on a subsequent run.</li>
     * </ul>
     */
    public static final int VK_MICROMAP_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT = 0x1;

    /**
     * VkCopyMicromapModeEXT - Micromap copy mode
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_COPY_MICROMAP_MODE_CLONE_EXT COPY_MICROMAP_MODE_CLONE_EXT} creates a direct copy of the micromap specified in {@code src} into the one specified by {@code dst}. The {@code dst} micromap <b>must</b> have been created with the same parameters as {@code src}.</li>
     * <li>{@link #VK_COPY_MICROMAP_MODE_SERIALIZE_EXT COPY_MICROMAP_MODE_SERIALIZE_EXT} serializes the micromap to a semi-opaque format which can be reloaded on a compatible implementation.</li>
     * <li>{@link #VK_COPY_MICROMAP_MODE_DESERIALIZE_EXT COPY_MICROMAP_MODE_DESERIALIZE_EXT} deserializes the semi-opaque serialization format in the buffer to the micromap.</li>
     * <li>{@link #VK_COPY_MICROMAP_MODE_COMPACT_EXT COPY_MICROMAP_MODE_COMPACT_EXT} creates a more compact version of a micromap {@code src} into {@code dst}. The micromap {@code dst} <b>must</b> have been created with a size at least as large as that returned by {@link #vkCmdWriteMicromapsPropertiesEXT CmdWriteMicromapsPropertiesEXT} after the build of the micromap specified by {@code src}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCopyMemoryToMicromapInfoEXT}, {@link VkCopyMicromapInfoEXT}, {@link VkCopyMicromapToMemoryInfoEXT}</p>
     */
    public static final int
        VK_COPY_MICROMAP_MODE_CLONE_EXT       = 0,
        VK_COPY_MICROMAP_MODE_SERIALIZE_EXT   = 1,
        VK_COPY_MICROMAP_MODE_DESERIALIZE_EXT = 2,
        VK_COPY_MICROMAP_MODE_COMPACT_EXT     = 3;

    /**
     * VkOpacityMicromapFormatEXT - Format enum for opacity micromaps
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_OPACITY_MICROMAP_FORMAT_2_STATE_EXT OPACITY_MICROMAP_FORMAT_2_STATE_EXT} indicates that the given micromap format has one bit per subtriangle encoding either fully opaque or fully transparent.</li>
     * <li>{@link #VK_OPACITY_MICROMAP_FORMAT_4_STATE_EXT OPACITY_MICROMAP_FORMAT_4_STATE_EXT} indicates that the given micromap format has two bits per subtriangle encoding four modes which can be interpreted as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#ray-opacity-micromap">ray traversal</a>.</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>For compactness, these values are stored as 16-bit in some structures.</p>
     * </div>
     */
    public static final int
        VK_OPACITY_MICROMAP_FORMAT_2_STATE_EXT = 1,
        VK_OPACITY_MICROMAP_FORMAT_4_STATE_EXT = 2;

    /**
     * VkOpacityMicromapSpecialIndexEXT - Enum for special indices in the opacity micromap
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_TRANSPARENT_EXT OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_TRANSPARENT_EXT} specifies that the entire triangle is fully transparent.</li>
     * <li>{@link #VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_OPAQUE_EXT OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_OPAQUE_EXT} specifies that the entire triangle is fully opaque.</li>
     * <li>{@link #VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_TRANSPARENT_EXT OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_TRANSPARENT_EXT} specifies that the entire triangle is unknown-transparent.</li>
     * <li>{@link #VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_OPAQUE_EXT OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_OPAQUE_EXT} specifies that the entire triangle is unknown-opaque.</li>
     * </ul>
     */
    public static final int
        VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_TRANSPARENT_EXT         = -1,
        VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_OPAQUE_EXT              = -2,
        VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_TRANSPARENT_EXT = -3,
        VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_OPAQUE_EXT      = -4;

    protected EXTOpacityMicromap() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateMicromapEXT ] ---

    /** Unsafe version of: {@link #vkCreateMicromapEXT CreateMicromapEXT} */
    public static int nvkCreateMicromapEXT(VkDevice device, long pCreateInfo, long pAllocator, long pMicromap) {
        long __functionAddress = device.getCapabilities().vkCreateMicromapEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pCreateInfo, pAllocator, pMicromap, __functionAddress);
    }

    /**
     * Create a new micromap object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create a micromap, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateMicromapEXT(
     *     VkDevice                                    device,
     *     const VkMicromapCreateInfoEXT*              pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkMicromapEXT*                              pMicromap);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Similar to other objects in Vulkan, the micromap creation merely creates an object with a specific “{@code shape}”. The type and quantity of geometry that can be built into a micromap is determined by the parameters of {@link VkMicromapCreateInfoEXT}.</p>
     * 
     * <p>The micromap data is stored in the object referred to by {@link VkMicromapCreateInfoEXT}{@code ::buffer}. Once memory has been bound to that buffer, it <b>must</b> be populated by micromap build or micromap copy commands such as {@link #vkCmdBuildMicromapsEXT CmdBuildMicromapsEXT}, {@link #vkBuildMicromapsEXT BuildMicromapsEXT}, {@link #vkCmdCopyMicromapEXT CmdCopyMicromapEXT}, and {@link #vkCopyMicromapEXT CopyMicromapEXT}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The expected usage for a trace capture/replay tool is that it will serialize and later deserialize the micromap data using micromap copy commands. During capture the tool will use {@link #vkCopyMicromapToMemoryEXT CopyMicromapToMemoryEXT} or {@link #vkCmdCopyMicromapToMemoryEXT CmdCopyMicromapToMemoryEXT} with a {@code mode} of {@link #VK_COPY_MICROMAP_MODE_SERIALIZE_EXT COPY_MICROMAP_MODE_SERIALIZE_EXT}, and {@link #vkCopyMemoryToMicromapEXT CopyMemoryToMicromapEXT} or {@link #vkCmdCopyMemoryToMicromapEXT CmdCopyMemoryToMicromapEXT} with a {@code mode} of {@link #VK_COPY_MICROMAP_MODE_DESERIALIZE_EXT COPY_MICROMAP_MODE_DESERIALIZE_EXT} during replay.</p>
     * </div>
     * 
     * <p>The input buffers passed to micromap build commands will be referenced by the implementation for the duration of the command. Micromaps <b>must</b> be fully self-contained. The application <b>can</b> reuse or free any memory which was used by the command as an input or as scratch without affecting the results of a subsequent acceleration structure build using the micromap or traversal of that acceleration structure.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-micromap">{@code micromap}</a> feature <b>must</b> be enabled</li>
     * <li>If {@link VkMicromapCreateInfoEXT}{@code ::deviceAddress} is not zero, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-micromapCaptureReplay">{@code micromapCaptureReplay}</a> feature <b>must</b> be enabled</li>
     * <li>If {@code device} was created with multiple physical devices, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-bufferDeviceAddressMultiDevice">{@code bufferDeviceAddressMultiDevice}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkMicromapCreateInfoEXT} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pMicromap} <b>must</b> be a valid pointer to a {@code VkMicromapEXT} handle</li>
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
     * <li>{@link KHRBufferDeviceAddress#VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkMicromapCreateInfoEXT}</p>
     *
     * @param device      the logical device that creates the acceleration structure object.
     * @param pCreateInfo a pointer to a {@link VkMicromapCreateInfoEXT} structure containing parameters affecting creation of the micromap.
     * @param pAllocator  controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pMicromap   a pointer to a {@code VkMicromapEXT} handle in which the resulting micromap object is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateMicromapEXT(VkDevice device, @NativeType("VkMicromapCreateInfoEXT const *") VkMicromapCreateInfoEXT pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkMicromapEXT *") LongBuffer pMicromap) {
        if (CHECKS) {
            check(pMicromap, 1);
        }
        return nvkCreateMicromapEXT(device, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pMicromap));
    }

    // --- [ vkDestroyMicromapEXT ] ---

    /** Unsafe version of: {@link #vkDestroyMicromapEXT DestroyMicromapEXT} */
    public static void nvkDestroyMicromapEXT(VkDevice device, long micromap, long pAllocator) {
        long __functionAddress = device.getCapabilities().vkDestroyMicromapEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), micromap, pAllocator, __functionAddress);
    }

    /**
     * Destroy a micromap object.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To destroy a micromap, call:</p>
     * 
     * <pre><code>
     * void vkDestroyMicromapEXT(
     *     VkDevice                                    device,
     *     VkMicromapEXT                               micromap,
     *     const VkAllocationCallbacks*                pAllocator);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>All submitted commands that refer to {@code micromap} <b>must</b> have completed execution</li>
     * <li>If {@link VkAllocationCallbacks} were provided when {@code micromap} was created, a compatible set of callbacks <b>must</b> be provided here</li>
     * <li>If no {@link VkAllocationCallbacks} were provided when {@code micromap} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code micromap} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code micromap} <b>must</b> be a valid {@code VkMicromapEXT} handle</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>If {@code micromap} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code micromap} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}</p>
     *
     * @param device     the logical device that destroys the micromap.
     * @param micromap   the micromap to destroy.
     * @param pAllocator controls host memory allocation as described in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     */
    public static void vkDestroyMicromapEXT(VkDevice device, @NativeType("VkMicromapEXT") long micromap, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator) {
        nvkDestroyMicromapEXT(device, micromap, memAddressSafe(pAllocator));
    }

    // --- [ vkCmdBuildMicromapsEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdBuildMicromapsEXT CmdBuildMicromapsEXT}
     *
     * @param infoCount the number of micromaps to build. It specifies the number of the {@code pInfos} structures that <b>must</b> be provided.
     */
    public static void nvkCmdBuildMicromapsEXT(VkCommandBuffer commandBuffer, int infoCount, long pInfos) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdBuildMicromapsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), infoCount, pInfos, __functionAddress);
    }

    /**
     * Build a micromap.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To build micromaps call:</p>
     * 
     * <pre><code>
     * void vkCmdBuildMicromapsEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    infoCount,
     *     const VkMicromapBuildInfoEXT*               pInfos);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@code vkCmdBuildMicromapsEXT} command provides the ability to initiate multiple micromaps builds, however there is no ordering or synchronization implied between any of the individual micromap builds.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>This means that there <b>cannot</b> be any memory aliasing between any micromap memories or scratch memories being used by any of the builds.</p>
     * </div>
     * 
     * <p>Accesses to the micromap scratch buffers as identified by the {@link VkMicromapBuildInfoEXT}{@code ::scratchData} buffer device addresses <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies">synchronized</a> with the {@link #VK_PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT} <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages">pipeline stage</a> and an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-types">access type</a> of ({@link #VK_ACCESS_2_MICROMAP_READ_BIT_EXT ACCESS_2_MICROMAP_READ_BIT_EXT} | {@link #VK_ACCESS_2_MICROMAP_WRITE_BIT_EXT ACCESS_2_MICROMAP_WRITE_BIT_EXT}). Accesses to {@link VkMicromapBuildInfoEXT}{@code ::dstMicromap} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies">synchronized</a> with the {@link #VK_PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT} <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages">pipeline stage</a> and an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-types">access type</a> of {@link #VK_ACCESS_2_MICROMAP_WRITE_BIT_EXT ACCESS_2_MICROMAP_WRITE_BIT_EXT}.</p>
     * 
     * <p>Accesses to other input buffers as identified by any used values of {@link VkMicromapBuildInfoEXT}{@code ::data} or {@link VkMicromapBuildInfoEXT}{@code ::triangleArray} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies">synchronized</a> with the {@link #VK_PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT} <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages">pipeline stage</a> and an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-types">access type</a> of {@link VK10#VK_ACCESS_SHADER_READ_BIT ACCESS_SHADER_READ_BIT}.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>For each {@code pInfos}[i], {@code dstMicromap} <b>must</b> have been created with a value of {@link VkMicromapCreateInfoEXT}{@code ::size} greater than or equal to the memory size required by the build operation, as returned by {@link #vkGetMicromapBuildSizesEXT GetMicromapBuildSizesEXT} with <code>pBuildInfo = pInfos[i]</code></li>
     * <li>The {@code mode} member of each element of {@code pInfos} <b>must</b> be a valid {@code VkBuildMicromapModeEXT} value</li>
     * <li>The {@code dstMicromap} member of any element of {@code pInfos} <b>must</b> be a valid {@code VkMicromapEXT} handle</li>
     * <li>For each element of {@code pInfos} its {@code type} member <b>must</b> match the value of {@link VkMicromapCreateInfoEXT}{@code ::type} when its {@code dstMicromap} was created</li>
     * <li>The range of memory backing the {@code dstMicromap} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code dstMicromap} member of any other element of {@code pInfos}, which is accessed by this command</li>
     * <li>The range of memory backing the {@code dstMicromap} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code scratchData} member of any element of {@code pInfos} (including the same element), which is accessed by this command</li>
     * <li>The range of memory backing the {@code scratchData} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code scratchData} member of any other element of {@code pInfos}, which is accessed by this command</li>
     * </ul>
     * 
     * <ul>
     * <li>For each element of {@code pInfos}, the {@code buffer} used to create its {@code dstMicromap} member <b>must</b> be bound to device memory</li>
     * <li>If {@code pInfos}[i].{@code mode} is {@link #VK_BUILD_MICROMAP_MODE_BUILD_EXT BUILD_MICROMAP_MODE_BUILD_EXT}, all addresses between {@code pInfos}[i].{@code scratchData.deviceAddress} and {@code pInfos}[i].{@code scratchData.deviceAddress} + N - 1 <b>must</b> be in the buffer device address range of the same buffer, where N is given by the {@code buildScratchSize} member of the {@link VkMicromapBuildSizesInfoEXT} structure returned from a call to {@link #vkGetMicromapBuildSizesEXT GetMicromapBuildSizesEXT} with an identical {@link VkMicromapBuildInfoEXT} structure and primitive count</li>
     * <li>The buffers from which the buffer device addresses for all of the {@code data} and {@code triangleArray} members of all {@code pInfos}[i] are queried <b>must</b> have been created with the {@link #VK_BUFFER_USAGE_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT BUFFER_USAGE_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT} usage flag</li>
     * <li>For each element of {@code pInfos}[i] the buffer from which the buffer device address {@code pInfos}[i].{@code scratchData.deviceAddress} is queried <b>must</b> have been created with {@link VK10#VK_BUFFER_USAGE_STORAGE_BUFFER_BIT BUFFER_USAGE_STORAGE_BUFFER_BIT} usage flag</li>
     * <li>For each element of {@code pInfos}, its {@code scratchData.deviceAddress}, {@code data.deviceAddress}, and {@code triangleArray.deviceAddress} members <b>must</b> be valid device addresses obtained from {@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress}</li>
     * <li>For each element of {@code pInfos}, if {@code scratchData.deviceAddress}, {@code data.deviceAddress}, or {@code triangleArray.deviceAddress} is the address of a non-sparse buffer then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>For each element of {@code pInfos}, its {@code scratchData.deviceAddress} member <b>must</b> be a multiple of {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR}{@code ::minAccelerationStructureScratchOffsetAlignment}</li>
     * <li>For each element of {@code pInfos}, its {@code triangleArray.deviceAddress} and {@code data.deviceAddress} members <b>must</b> be a multiple of 256</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pInfos} <b>must</b> be a valid pointer to an array of {@code infoCount} valid {@link VkMicromapBuildInfoEXT} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code infoCount} <b>must</b> be greater than 0</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Outside</td><td>Compute</td><td>Action</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkMicromapBuildInfoEXT}</p>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param pInfos        a pointer to an array of {@code infoCount} {@link VkMicromapBuildInfoEXT} structures defining the data used to build each micromap.
     */
    public static void vkCmdBuildMicromapsEXT(VkCommandBuffer commandBuffer, @NativeType("VkMicromapBuildInfoEXT const *") VkMicromapBuildInfoEXT.Buffer pInfos) {
        nvkCmdBuildMicromapsEXT(commandBuffer, pInfos.remaining(), pInfos.address());
    }

    // --- [ vkBuildMicromapsEXT ] ---

    /**
     * Unsafe version of: {@link #vkBuildMicromapsEXT BuildMicromapsEXT}
     *
     * @param infoCount the number of micromaps to build. It specifies the number of the {@code pInfos} that <b>must</b> be provided.
     */
    public static int nvkBuildMicromapsEXT(VkDevice device, long deferredOperation, int infoCount, long pInfos) {
        long __functionAddress = device.getCapabilities().vkBuildMicromapsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), deferredOperation, infoCount, pInfos, __functionAddress);
    }

    /**
     * Build a micromap on the host.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To build micromaps on the host, call:</p>
     * 
     * <pre><code>
     * VkResult vkBuildMicromapsEXT(
     *     VkDevice                                    device,
     *     VkDeferredOperationKHR                      deferredOperation,
     *     uint32_t                                    infoCount,
     *     const VkMicromapBuildInfoEXT*               pInfos);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command fulfills the same task as {@link #vkCmdBuildMicromapsEXT CmdBuildMicromapsEXT} but is executed by the host.</p>
     * 
     * <p>The {@code vkBuildMicromapsEXT} command provides the ability to initiate multiple micromaps builds, however there is no ordering or synchronization implied between any of the individual micromap builds.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>This means that there <b>cannot</b> be any memory aliasing between any micromap memories or scratch memories being used by any of the builds.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>For each {@code pInfos}[i], {@code dstMicromap} <b>must</b> have been created with a value of {@link VkMicromapCreateInfoEXT}{@code ::size} greater than or equal to the memory size required by the build operation, as returned by {@link #vkGetMicromapBuildSizesEXT GetMicromapBuildSizesEXT} with <code>pBuildInfo = pInfos[i]</code></li>
     * <li>The {@code mode} member of each element of {@code pInfos} <b>must</b> be a valid {@code VkBuildMicromapModeEXT} value</li>
     * <li>The {@code dstMicromap} member of any element of {@code pInfos} <b>must</b> be a valid {@code VkMicromapEXT} handle</li>
     * <li>For each element of {@code pInfos} its {@code type} member <b>must</b> match the value of {@link VkMicromapCreateInfoEXT}{@code ::type} when its {@code dstMicromap} was created</li>
     * <li>The range of memory backing the {@code dstMicromap} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code dstMicromap} member of any other element of {@code pInfos}, which is accessed by this command</li>
     * <li>The range of memory backing the {@code dstMicromap} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code scratchData} member of any element of {@code pInfos} (including the same element), which is accessed by this command</li>
     * <li>The range of memory backing the {@code scratchData} member of any element of {@code pInfos} that is accessed by this command <b>must</b> not overlap the memory backing the {@code scratchData} member of any other element of {@code pInfos}, which is accessed by this command</li>
     * </ul>
     * 
     * <ul>
     * <li>For each element of {@code pInfos}, the {@code buffer} used to create its {@code dstMicromap} member <b>must</b> be bound to host-visible device memory</li>
     * <li>For each element of {@code pInfos}, all referenced addresses of {@code pInfos}[i].{@code data.hostAddress} <b>must</b> be valid host memory</li>
     * <li>For each element of {@code pInfos}, all referenced addresses of {@code pInfos}[i].{@code triangleArray.hostAddress} <b>must</b> be valid host memory</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-micromapHostCommands">{@link VkPhysicalDeviceOpacityMicromapFeaturesEXT}{@code ::micromapHostCommands}</a> feature <b>must</b> be enabled</li>
     * <li>If {@code pInfos}[i].{@code mode} is {@link #VK_BUILD_MICROMAP_MODE_BUILD_EXT BUILD_MICROMAP_MODE_BUILD_EXT}, all addresses between {@code pInfos}[i].{@code scratchData.hostAddress} and {@code pInfos}[i].{@code scratchData.hostAddress} + N - 1 <b>must</b> be valid host memory, where N is given by the {@code buildScratchSize} member of the {@link VkMicromapBuildSizesInfoEXT} structure returned from a call to {@link #vkGetMicromapBuildSizesEXT GetMicromapBuildSizesEXT} with an identical {@link VkMicromapBuildInfoEXT} structure and primitive count</li>
     * <li>For each element of {@code pInfos}, the {@code buffer} used to create its {@code dstMicromap} member <b>must</b> be bound to memory that was not allocated with multiple instances</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code deferredOperation} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code deferredOperation} <b>must</b> be a valid {@code VkDeferredOperationKHR} handle</li>
     * <li>{@code pInfos} <b>must</b> be a valid pointer to an array of {@code infoCount} valid {@link VkMicromapBuildInfoEXT} structures</li>
     * <li>{@code infoCount} <b>must</b> be greater than 0</li>
     * <li>If {@code deferredOperation} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link KHRDeferredHostOperations#VK_OPERATION_DEFERRED_KHR OPERATION_DEFERRED_KHR}</li>
     * <li>{@link KHRDeferredHostOperations#VK_OPERATION_NOT_DEFERRED_KHR OPERATION_NOT_DEFERRED_KHR}</li>
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
     * <p>{@link VkMicromapBuildInfoEXT}</p>
     *
     * @param device            the {@code VkDevice} for which the micromaps are being built.
     * @param deferredOperation an optional {@code VkDeferredOperationKHR} to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#deferred-host-operations-requesting">request deferral</a> for this command.
     * @param pInfos            a pointer to an array of {@code infoCount} {@link VkMicromapBuildInfoEXT} structures defining the geometry used to build each micromap.
     */
    @NativeType("VkResult")
    public static int vkBuildMicromapsEXT(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkMicromapBuildInfoEXT const *") VkMicromapBuildInfoEXT.Buffer pInfos) {
        return nvkBuildMicromapsEXT(device, deferredOperation, pInfos.remaining(), pInfos.address());
    }

    // --- [ vkCopyMicromapEXT ] ---

    /** Unsafe version of: {@link #vkCopyMicromapEXT CopyMicromapEXT} */
    public static int nvkCopyMicromapEXT(VkDevice device, long deferredOperation, long pInfo) {
        long __functionAddress = device.getCapabilities().vkCopyMicromapEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), deferredOperation, pInfo, __functionAddress);
    }

    /**
     * Copy a micromap on the host.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy or compact a micromap on the host, call:</p>
     * 
     * <pre><code>
     * VkResult vkCopyMicromapEXT(
     *     VkDevice                                    device,
     *     VkDeferredOperationKHR                      deferredOperation,
     *     const VkCopyMicromapInfoEXT*                pInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command fulfills the same task as {@link #vkCmdCopyMicromapEXT CmdCopyMicromapEXT} but is executed by the host.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code deferredOperation} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> be a valid {@code VkDeferredOperationKHR} object</li>
     * <li>Any previous deferred operation that was associated with {@code deferredOperation} <b>must</b> be complete</li>
     * <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to host-visible device memory</li>
     * <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to host-visible device memory</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-micromapHostCommands">{@link VkPhysicalDeviceOpacityMicromapFeaturesEXT}{@code ::micromapHostCommands}</a> feature <b>must</b> be enabled</li>
     * <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to memory that was not allocated with multiple instances</li>
     * <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to memory that was not allocated with multiple instances</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code deferredOperation} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code deferredOperation} <b>must</b> be a valid {@code VkDeferredOperationKHR} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyMicromapInfoEXT} structure</li>
     * <li>If {@code deferredOperation} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link KHRDeferredHostOperations#VK_OPERATION_DEFERRED_KHR OPERATION_DEFERRED_KHR}</li>
     * <li>{@link KHRDeferredHostOperations#VK_OPERATION_NOT_DEFERRED_KHR OPERATION_NOT_DEFERRED_KHR}</li>
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
     * <p>{@link VkCopyMicromapInfoEXT}</p>
     *
     * @param device            the device which owns the micromaps.
     * @param deferredOperation an optional {@code VkDeferredOperationKHR} to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#deferred-host-operations-requesting">request deferral</a> for this command.
     * @param pInfo             a pointer to a {@link VkCopyMicromapInfoEXT} structure defining the copy operation.
     */
    @NativeType("VkResult")
    public static int vkCopyMicromapEXT(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkCopyMicromapInfoEXT const *") VkCopyMicromapInfoEXT pInfo) {
        return nvkCopyMicromapEXT(device, deferredOperation, pInfo.address());
    }

    // --- [ vkCopyMicromapToMemoryEXT ] ---

    /** Unsafe version of: {@link #vkCopyMicromapToMemoryEXT CopyMicromapToMemoryEXT} */
    public static int nvkCopyMicromapToMemoryEXT(VkDevice device, long deferredOperation, long pInfo) {
        long __functionAddress = device.getCapabilities().vkCopyMicromapToMemoryEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), deferredOperation, pInfo, __functionAddress);
    }

    /**
     * Serialize a micromap on the host.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy a micromap to host accessible memory, call:</p>
     * 
     * <pre><code>
     * VkResult vkCopyMicromapToMemoryEXT(
     *     VkDevice                                    device,
     *     VkDeferredOperationKHR                      deferredOperation,
     *     const VkCopyMicromapToMemoryInfoEXT*        pInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command fulfills the same task as {@link #vkCmdCopyMicromapToMemoryEXT CmdCopyMicromapToMemoryEXT} but is executed by the host.</p>
     * 
     * <p>This command produces the same results as {@link #vkCmdCopyMicromapToMemoryEXT CmdCopyMicromapToMemoryEXT}, but writes its result directly to a host pointer, and is executed on the host rather than the device. The output <b>may</b> not necessarily be bit-for-bit identical, but it can be equally used by either {@link #vkCmdCopyMemoryToMicromapEXT CmdCopyMemoryToMicromapEXT} or {@link #vkCopyMemoryToMicromapEXT CopyMemoryToMicromapEXT}.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code deferredOperation} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> be a valid {@code VkDeferredOperationKHR} object</li>
     * <li>Any previous deferred operation that was associated with {@code deferredOperation} <b>must</b> be complete</li>
     * <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to host-visible device memory</li>
     * <li>{@code pInfo→dst.hostAddress} <b>must</b> be a valid host pointer</li>
     * <li>{@code pInfo→dst.hostAddress} <b>must</b> be aligned to 16 bytes</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-micromapHostCommands">{@link VkPhysicalDeviceOpacityMicromapFeaturesEXT}{@code ::micromapHostCommands}</a> feature <b>must</b> be enabled</li>
     * <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to memory that was not allocated with multiple instances</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code deferredOperation} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code deferredOperation} <b>must</b> be a valid {@code VkDeferredOperationKHR} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyMicromapToMemoryInfoEXT} structure</li>
     * <li>If {@code deferredOperation} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link KHRDeferredHostOperations#VK_OPERATION_DEFERRED_KHR OPERATION_DEFERRED_KHR}</li>
     * <li>{@link KHRDeferredHostOperations#VK_OPERATION_NOT_DEFERRED_KHR OPERATION_NOT_DEFERRED_KHR}</li>
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
     * <p>{@link VkCopyMicromapToMemoryInfoEXT}</p>
     *
     * @param device            the device which owns {@code pInfo→src}.
     * @param deferredOperation an optional {@code VkDeferredOperationKHR} to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#deferred-host-operations-requesting">request deferral</a> for this command.
     * @param pInfo             a pointer to a {@link VkCopyMicromapToMemoryInfoEXT} structure defining the copy operation.
     */
    @NativeType("VkResult")
    public static int vkCopyMicromapToMemoryEXT(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkCopyMicromapToMemoryInfoEXT const *") VkCopyMicromapToMemoryInfoEXT pInfo) {
        return nvkCopyMicromapToMemoryEXT(device, deferredOperation, pInfo.address());
    }

    // --- [ vkCopyMemoryToMicromapEXT ] ---

    /** Unsafe version of: {@link #vkCopyMemoryToMicromapEXT CopyMemoryToMicromapEXT} */
    public static int nvkCopyMemoryToMicromapEXT(VkDevice device, long deferredOperation, long pInfo) {
        long __functionAddress = device.getCapabilities().vkCopyMemoryToMicromapEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), deferredOperation, pInfo, __functionAddress);
    }

    /**
     * Deserialize a micromap on the host.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy host accessible memory to a micromap, call:</p>
     * 
     * <pre><code>
     * VkResult vkCopyMemoryToMicromapEXT(
     *     VkDevice                                    device,
     *     VkDeferredOperationKHR                      deferredOperation,
     *     const VkCopyMemoryToMicromapInfoEXT*        pInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command fulfills the same task as {@link #vkCmdCopyMemoryToMicromapEXT CmdCopyMemoryToMicromapEXT} but is executed by the host.</p>
     * 
     * <p>This command can accept micromaps produced by either {@link #vkCmdCopyMicromapToMemoryEXT CmdCopyMicromapToMemoryEXT} or {@link #vkCopyMicromapToMemoryEXT CopyMicromapToMemoryEXT}.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If {@code deferredOperation} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> be a valid {@code VkDeferredOperationKHR} object</li>
     * <li>Any previous deferred operation that was associated with {@code deferredOperation} <b>must</b> be complete</li>
     * <li>{@code pInfo→src.hostAddress} <b>must</b> be a valid host pointer</li>
     * <li>{@code pInfo→src.hostAddress} <b>must</b> be aligned to 16 bytes</li>
     * <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to host-visible device memory</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-micromapHostCommands">{@link VkPhysicalDeviceOpacityMicromapFeaturesEXT}{@code ::micromapHostCommands}</a> feature <b>must</b> be enabled</li>
     * <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to memory that was not allocated with multiple instances</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code deferredOperation} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code deferredOperation} <b>must</b> be a valid {@code VkDeferredOperationKHR} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyMemoryToMicromapInfoEXT} structure</li>
     * <li>If {@code deferredOperation} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link KHRDeferredHostOperations#VK_OPERATION_DEFERRED_KHR OPERATION_DEFERRED_KHR}</li>
     * <li>{@link KHRDeferredHostOperations#VK_OPERATION_NOT_DEFERRED_KHR OPERATION_NOT_DEFERRED_KHR}</li>
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
     * <p>{@link VkCopyMemoryToMicromapInfoEXT}</p>
     *
     * @param device            the device which owns {@code pInfo→dst}.
     * @param deferredOperation an optional {@code VkDeferredOperationKHR} to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#deferred-host-operations-requesting">request deferral</a> for this command.
     * @param pInfo             a pointer to a {@link VkCopyMemoryToMicromapInfoEXT} structure defining the copy operation.
     */
    @NativeType("VkResult")
    public static int vkCopyMemoryToMicromapEXT(VkDevice device, @NativeType("VkDeferredOperationKHR") long deferredOperation, @NativeType("VkCopyMemoryToMicromapInfoEXT const *") VkCopyMemoryToMicromapInfoEXT pInfo) {
        return nvkCopyMemoryToMicromapEXT(device, deferredOperation, pInfo.address());
    }

    // --- [ vkWriteMicromapsPropertiesEXT ] ---

    /**
     * Unsafe version of: {@link #vkWriteMicromapsPropertiesEXT WriteMicromapsPropertiesEXT}
     *
     * @param micromapCount the count of micromaps for which to query the property.
     * @param dataSize      the size in bytes of the buffer pointed to by {@code pData}.
     */
    public static int nvkWriteMicromapsPropertiesEXT(VkDevice device, int micromapCount, long pMicromaps, int queryType, long dataSize, long pData, long stride) {
        long __functionAddress = device.getCapabilities().vkWriteMicromapsPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPI(device.address(), micromapCount, pMicromaps, queryType, dataSize, pData, stride, __functionAddress);
    }

    /**
     * Query micromap meta-data on the host.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query micromap size parameters on the host, call:</p>
     * 
     * <pre><code>
     * VkResult vkWriteMicromapsPropertiesEXT(
     *     VkDevice                                    device,
     *     uint32_t                                    micromapCount,
     *     const VkMicromapEXT*                        pMicromaps,
     *     VkQueryType                                 queryType,
     *     size_t                                      dataSize,
     *     void*                                       pData,
     *     size_t                                      stride);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command fulfills the same task as {@link #vkCmdWriteMicromapsPropertiesEXT CmdWriteMicromapsPropertiesEXT} but is executed by the host.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>All micromaps in {@code pMicromaps} <b>must</b> have been constructed prior to the execution of this command</li>
     * <li>All micromaps in {@code pMicromaps} <b>must</b> have been constructed with {@link #VK_BUILD_MICROMAP_ALLOW_COMPACTION_BIT_EXT BUILD_MICROMAP_ALLOW_COMPACTION_BIT_EXT} if {@code queryType} is {@link #VK_QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT}</li>
     * <li>{@code queryType} <b>must</b> be {@link #VK_QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT} or {@link #VK_QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT}</li>
     * <li>If {@code queryType} is {@link #VK_QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT}, then {@code stride} <b>must</b> be a multiple of the size of {@code VkDeviceSize}</li>
     * <li>If {@code queryType} is {@link #VK_QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT}, then {@code pData} <b>must</b> point to a {@code VkDeviceSize}</li>
     * <li>If {@code queryType} is</li>
     * <li>{@code dataSize} <b>must</b> be greater than or equal to <code>micromapCount*stride</code></li>
     * <li>The {@code buffer} used to create each micromap in {@code pMicromaps} <b>must</b> be bound to host-visible device memory</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-micromapHostCommands">{@link VkPhysicalDeviceOpacityMicromapFeaturesEXT}{@code ::micromapHostCommands}</a> feature <b>must</b> be enabled</li>
     * <li>The {@code buffer} used to create each micromap in {@code pMicromaps} <b>must</b> be bound to memory that was not allocated with multiple instances</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pMicromaps} <b>must</b> be a valid pointer to an array of {@code micromapCount} valid {@code VkMicromapEXT} handles</li>
     * <li>{@code queryType} <b>must</b> be a valid {@code VkQueryType} value</li>
     * <li>{@code pData} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
     * <li>{@code micromapCount} <b>must</b> be greater than 0</li>
     * <li>{@code dataSize} <b>must</b> be greater than 0</li>
     * <li>Each element of {@code pMicromaps} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * @param device     the device which owns the micromaps in {@code pMicromaps}.
     * @param pMicromaps a pointer to an array of existing previously built micromaps.
     * @param queryType  a {@code VkQueryType} value specifying the property to be queried.
     * @param pData      a pointer to a user-allocated buffer where the results will be written.
     * @param stride     the stride in bytes between results for individual queries within {@code pData}.
     */
    @NativeType("VkResult")
    public static int vkWriteMicromapsPropertiesEXT(VkDevice device, @NativeType("VkMicromapEXT const *") LongBuffer pMicromaps, @NativeType("VkQueryType") int queryType, @NativeType("void *") ByteBuffer pData, @NativeType("size_t") long stride) {
        return nvkWriteMicromapsPropertiesEXT(device, pMicromaps.remaining(), memAddress(pMicromaps), queryType, pData.remaining(), memAddress(pData), stride);
    }

    // --- [ vkCmdCopyMicromapEXT ] ---

    /** Unsafe version of: {@link #vkCmdCopyMicromapEXT CmdCopyMicromapEXT} */
    public static void nvkCmdCopyMicromapEXT(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyMicromapEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    /**
     * Copy a micromap.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy a micromap call:</p>
     * 
     * <pre><code>
     * void vkCmdCopyMicromapEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkCopyMicromapInfoEXT*                pInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command copies the {@code pInfo→src} micromap to the {@code pInfo→dst} micromap in the manner specified by {@code pInfo→mode}.</p>
     * 
     * <p>Accesses to {@code pInfo→src} and {@code pInfo→dst} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies">synchronized</a> with the {@link #VK_PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT} <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages">pipeline stage</a> and an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-types">access type</a> of {@link #VK_ACCESS_2_MICROMAP_READ_BIT_EXT ACCESS_2_MICROMAP_READ_BIT_EXT} or {@link #VK_ACCESS_2_MICROMAP_WRITE_BIT_EXT ACCESS_2_MICROMAP_WRITE_BIT_EXT} as appropriate.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to device memory</li>
     * <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to device memory</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyMicromapInfoEXT} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Outside</td><td>Compute</td><td>Action</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCopyMicromapInfoEXT}</p>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param pInfo         a pointer to a {@link VkCopyMicromapInfoEXT} structure defining the copy operation.
     */
    public static void vkCmdCopyMicromapEXT(VkCommandBuffer commandBuffer, @NativeType("VkCopyMicromapInfoEXT const *") VkCopyMicromapInfoEXT pInfo) {
        nvkCmdCopyMicromapEXT(commandBuffer, pInfo.address());
    }

    // --- [ vkCmdCopyMicromapToMemoryEXT ] ---

    /** Unsafe version of: {@link #vkCmdCopyMicromapToMemoryEXT CmdCopyMicromapToMemoryEXT} */
    public static void nvkCmdCopyMicromapToMemoryEXT(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyMicromapToMemoryEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    /**
     * Copy a micromap to device memory.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy a micromap to device memory call:</p>
     * 
     * <pre><code>
     * void vkCmdCopyMicromapToMemoryEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkCopyMicromapToMemoryInfoEXT*        pInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Accesses to {@code pInfo→src} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies">synchronized</a> with the {@link #VK_PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT} <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages">pipeline stage</a> and an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-types">access type</a> of {@link #VK_ACCESS_2_MICROMAP_READ_BIT_EXT ACCESS_2_MICROMAP_READ_BIT_EXT}. Accesses to the buffer indicated by {@code pInfo→dst.deviceAddress} <b>must</b> be synchronized with the {@link #VK_PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT} pipeline stage and an access type of {@link VK10#VK_ACCESS_TRANSFER_WRITE_BIT ACCESS_TRANSFER_WRITE_BIT}.</p>
     * 
     * <p>This command produces the same results as {@link #vkCopyMicromapToMemoryEXT CopyMicromapToMemoryEXT}, but writes its result to a device address, and is executed on the device rather than the host. The output <b>may</b> not necessarily be bit-for-bit identical, but it can be equally used by either {@link #vkCmdCopyMemoryToMicromapEXT CmdCopyMemoryToMicromapEXT} or {@link #vkCopyMemoryToMicromapEXT CopyMemoryToMicromapEXT}.</p>
     * 
     * <p>The defined header structure for the serialized data consists of:</p>
     * 
     * <ul>
     * <li>{@link VK10#VK_UUID_SIZE UUID_SIZE} bytes of data matching {@link VkPhysicalDeviceIDProperties}{@code ::driverUUID}</li>
     * <li>{@link VK10#VK_UUID_SIZE UUID_SIZE} bytes of data identifying the compatibility for comparison using {@link #vkGetDeviceMicromapCompatibilityEXT GetDeviceMicromapCompatibilityEXT} The serialized data is written to the buffer (or read from the buffer) according to the host endianness.</li>
     * </ul>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code pInfo→dst.deviceAddress} <b>must</b> be a valid device address for a buffer bound to device memory</li>
     * <li>{@code pInfo→dst.deviceAddress} <b>must</b> be aligned to 256 bytes</li>
     * <li>If the buffer pointed to by {@code pInfo→dst.deviceAddress} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>The {@code buffer} used to create {@code pInfo→src} <b>must</b> be bound to device memory</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyMicromapToMemoryInfoEXT} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Outside</td><td>Compute</td><td>Action</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCopyMicromapToMemoryInfoEXT}</p>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param pInfo         an a pointer to a {@link VkCopyMicromapToMemoryInfoEXT} structure defining the copy operation.
     */
    public static void vkCmdCopyMicromapToMemoryEXT(VkCommandBuffer commandBuffer, @NativeType("VkCopyMicromapToMemoryInfoEXT const *") VkCopyMicromapToMemoryInfoEXT pInfo) {
        nvkCmdCopyMicromapToMemoryEXT(commandBuffer, pInfo.address());
    }

    // --- [ vkCmdCopyMemoryToMicromapEXT ] ---

    /** Unsafe version of: {@link #vkCmdCopyMemoryToMicromapEXT CmdCopyMemoryToMicromapEXT} */
    public static void nvkCmdCopyMemoryToMicromapEXT(VkCommandBuffer commandBuffer, long pInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdCopyMemoryToMicromapEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), pInfo, __functionAddress);
    }

    /**
     * Copy device memory to a micromap.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To copy device memory to a micromap call:</p>
     * 
     * <pre><code>
     * void vkCmdCopyMemoryToMicromapEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkCopyMemoryToMicromapInfoEXT*        pInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Accesses to {@code pInfo→dst} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies">synchronized</a> with the {@link #VK_PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT} <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages">pipeline stage</a> and an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-types">access type</a> of {@link #VK_ACCESS_2_MICROMAP_READ_BIT_EXT ACCESS_2_MICROMAP_READ_BIT_EXT}. Accesses to the buffer indicated by {@code pInfo→src.deviceAddress} <b>must</b> be synchronized with the {@link #VK_PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT} pipeline stage and an access type of {@link VK10#VK_ACCESS_TRANSFER_READ_BIT ACCESS_TRANSFER_READ_BIT}.</p>
     * 
     * <p>This command can accept micromaps produced by either {@link #vkCmdCopyMicromapToMemoryEXT CmdCopyMicromapToMemoryEXT} or {@link #vkCopyMicromapToMemoryEXT CopyMicromapToMemoryEXT}.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code pInfo→src.deviceAddress} <b>must</b> be a valid device address for a buffer bound to device memory</li>
     * <li>{@code pInfo→src.deviceAddress} <b>must</b> be aligned to 256 bytes</li>
     * <li>If the buffer pointed to by {@code pInfo→src.deviceAddress} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
     * <li>The {@code buffer} used to create {@code pInfo→dst} <b>must</b> be bound to device memory</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkCopyMemoryToMicromapInfoEXT} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Outside</td><td>Compute</td><td>Action</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCopyMemoryToMicromapInfoEXT}</p>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param pInfo         a pointer to a {@link VkCopyMicromapToMemoryInfoEXT} structure defining the copy operation.
     */
    public static void vkCmdCopyMemoryToMicromapEXT(VkCommandBuffer commandBuffer, @NativeType("VkCopyMemoryToMicromapInfoEXT const *") VkCopyMemoryToMicromapInfoEXT pInfo) {
        nvkCmdCopyMemoryToMicromapEXT(commandBuffer, pInfo.address());
    }

    // --- [ vkCmdWriteMicromapsPropertiesEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdWriteMicromapsPropertiesEXT CmdWriteMicromapsPropertiesEXT}
     *
     * @param micromapCount the count of micromaps for which to query the property.
     */
    public static void nvkCmdWriteMicromapsPropertiesEXT(VkCommandBuffer commandBuffer, int micromapCount, long pMicromaps, int queryType, long queryPool, int firstQuery) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteMicromapsPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPJV(commandBuffer.address(), micromapCount, pMicromaps, queryType, queryPool, firstQuery, __functionAddress);
    }

    /**
     * Write micromap result parameters to query results.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query micromap size parameters call:</p>
     * 
     * <pre><code>
     * void vkCmdWriteMicromapsPropertiesEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    micromapCount,
     *     const VkMicromapEXT*                        pMicromaps,
     *     VkQueryType                                 queryType,
     *     VkQueryPool                                 queryPool,
     *     uint32_t                                    firstQuery);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Accesses to any of the micromaps listed in {@code pMicromaps} <b>must</b> be <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies">synchronized</a> with the {@link #VK_PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT} <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-pipeline-stages">pipeline stage</a> and an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-types">access type</a> of {@link #VK_ACCESS_2_MICROMAP_READ_BIT_EXT ACCESS_2_MICROMAP_READ_BIT_EXT}.</p>
     * 
     * <ul>
     * <li>If {@code queryType} is {@link #VK_QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT}, then the value written out is the number of bytes required by a serialized micromap.</li>
     * <li>If {@code queryType} is {@link #VK_QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT}, then the value written out is the number of bytes required by a compacted micromap.</li>
     * </ul>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code queryPool} <b>must</b> have been created with a {@code queryType} matching {@code queryType}</li>
     * <li>The queries identified by {@code queryPool} and {@code firstQuery} <b>must</b> be <em>unavailable</em></li>
     * <li>The {@code buffer} used to create each micromap in {@code pMicrmaps} <b>must</b> be bound to device memory</li>
     * <li>The sum of {@code query} plus {@code micromapCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
     * </ul>
     * 
     * <ul>
     * <li>All micromaps in {@code pMicromaps} <b>must</b> have been constructed prior to the execution of this command</li>
     * <li>All micromaps in {@code pMicromaps} <b>must</b> have been constructed with {@link #VK_BUILD_MICROMAP_ALLOW_COMPACTION_BIT_EXT BUILD_MICROMAP_ALLOW_COMPACTION_BIT_EXT} if {@code queryType} is {@link #VK_QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT}</li>
     * <li>{@code queryType} <b>must</b> be {@link #VK_QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT} or {@link #VK_QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pMicromaps} <b>must</b> be a valid pointer to an array of {@code micromapCount} valid {@code VkMicromapEXT} handles</li>
     * <li>{@code queryType} <b>must</b> be a valid {@code VkQueryType} value</li>
     * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support compute operations</li>
     * <li>This command <b>must</b> only be called outside of a render pass instance</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code micromapCount} <b>must</b> be greater than 0</li>
     * <li>Each of {@code commandBuffer}, {@code queryPool}, and the elements of {@code pMicromaps} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
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
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Outside</td><td>Outside</td><td>Compute</td><td>Action</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param pMicromaps    a pointer to an array of existing previously built micromaps.
     * @param queryType     a {@code VkQueryType} value specifying the type of queries managed by the pool.
     * @param queryPool     the query pool that will manage the results of the query.
     * @param firstQuery    the first query index within the query pool that will contain the {@code micromapCount} number of results.
     */
    public static void vkCmdWriteMicromapsPropertiesEXT(VkCommandBuffer commandBuffer, @NativeType("VkMicromapEXT const *") LongBuffer pMicromaps, @NativeType("VkQueryType") int queryType, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery) {
        nvkCmdWriteMicromapsPropertiesEXT(commandBuffer, pMicromaps.remaining(), memAddress(pMicromaps), queryType, queryPool, firstQuery);
    }

    // --- [ vkGetDeviceMicromapCompatibilityEXT ] ---

    /** Unsafe version of: {@link #vkGetDeviceMicromapCompatibilityEXT GetDeviceMicromapCompatibilityEXT} */
    public static void nvkGetDeviceMicromapCompatibilityEXT(VkDevice device, long pVersionInfo, long pCompatibility) {
        long __functionAddress = device.getCapabilities().vkGetDeviceMicromapCompatibilityEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkMicromapVersionInfoEXT.validate(pVersionInfo);
        }
        callPPPV(device.address(), pVersionInfo, pCompatibility, __functionAddress);
    }

    /**
     * Check if a serialized micromap is compatible with the current device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To check if a serialized micromap is compatible with the current device call:</p>
     * 
     * <pre><code>
     * void vkGetDeviceMicromapCompatibilityEXT(
     *     VkDevice                                    device,
     *     const VkMicromapVersionInfoEXT*             pVersionInfo,
     *     VkAccelerationStructureCompatibilityKHR*    pCompatibility);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-micromap">{@code micromap}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pVersionInfo} <b>must</b> be a valid pointer to a valid {@link VkMicromapVersionInfoEXT} structure</li>
     * <li>{@code pCompatibility} <b>must</b> be a valid pointer to a {@code VkAccelerationStructureCompatibilityKHR} value</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkMicromapVersionInfoEXT}</p>
     *
     * @param device         the device to check the version against.
     * @param pVersionInfo   a pointer to a {@link VkMicromapVersionInfoEXT} structure specifying version information to check against the device.
     * @param pCompatibility a pointer to a {@code VkAccelerationStructureCompatibilityKHR} value in which compatibility information is returned.
     */
    public static void vkGetDeviceMicromapCompatibilityEXT(VkDevice device, @NativeType("VkMicromapVersionInfoEXT const *") VkMicromapVersionInfoEXT pVersionInfo, @NativeType("VkAccelerationStructureCompatibilityKHR *") IntBuffer pCompatibility) {
        if (CHECKS) {
            check(pCompatibility, 1);
        }
        nvkGetDeviceMicromapCompatibilityEXT(device, pVersionInfo.address(), memAddress(pCompatibility));
    }

    // --- [ vkGetMicromapBuildSizesEXT ] ---

    /** Unsafe version of: {@link #vkGetMicromapBuildSizesEXT GetMicromapBuildSizesEXT} */
    public static void nvkGetMicromapBuildSizesEXT(VkDevice device, int buildType, long pBuildInfo, long pSizeInfo) {
        long __functionAddress = device.getCapabilities().vkGetMicromapBuildSizesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(device.address(), buildType, pBuildInfo, pSizeInfo, __functionAddress);
    }

    /**
     * Retrieve the required size for a micromap.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To get the build sizes for a micromap, call:</p>
     * 
     * <pre><code>
     * void vkGetMicromapBuildSizesEXT(
     *     VkDevice                                    device,
     *     VkAccelerationStructureBuildTypeKHR         buildType,
     *     const VkMicromapBuildInfoEXT*               pBuildInfo,
     *     VkMicromapBuildSizesInfoEXT*                pSizeInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@code dstMicromap} and {@code mode} members of {@code pBuildInfo} are ignored. Any {@link VkDeviceOrHostAddressKHR} members of {@code pBuildInfo} are ignored by this command.</p>
     * 
     * <p>A micromap created with the {@code micromapSize} returned by this command supports any build with a {@link VkMicromapBuildInfoEXT} structure subject to the following properties:</p>
     * 
     * <ul>
     * <li>The build command is a host build command, and {@code buildType} is {@link KHRAccelerationStructure#VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_KHR ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_KHR} or {@link KHRAccelerationStructure#VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR}</li>
     * <li>The build command is a device build command, and {@code buildType} is {@link KHRAccelerationStructure#VK_ACCELERATION_STRUCTURE_BUILD_TYPE_DEVICE_KHR ACCELERATION_STRUCTURE_BUILD_TYPE_DEVICE_KHR} or {@link KHRAccelerationStructure#VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR}</li>
     * <li>For {@link VkMicromapBuildInfoEXT}:
     * 
     * <ul>
     * <li>Its {@code type}, and {@code flags} members are equal to {@code pBuildInfo→type} and {@code pBuildInfo→flags}, respectively.</li>
     * <li>The sum of usage information in either {@code pUsageCounts} or {@code ppUsageCounts} is equal to the sum of usage information in either {@code pBuildInfo→pUsageCounts} or {@code pBuildInfo→ppUsageCounts}.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <p>Similarly, the {@code buildScratchSize} value will support any build command specifying the {@link #VK_BUILD_MICROMAP_MODE_BUILD_EXT BUILD_MICROMAP_MODE_BUILD_EXT} {@code mode} under the above conditions.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@link VkMicromapBuildInfoEXT}{@code ::dstMicromap} <b>must</b> have been created from {@code device}</li>
     * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-micromap">{@code micromap}</a> feature <b>must</b> be enabled</li>
     * <li>If {@code device} was created with multiple physical devices, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-bufferDeviceAddressMultiDevice">{@code bufferDeviceAddressMultiDevice}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code buildType} <b>must</b> be a valid {@code VkAccelerationStructureBuildTypeKHR} value</li>
     * <li>{@code pBuildInfo} <b>must</b> be a valid pointer to a valid {@link VkMicromapBuildInfoEXT} structure</li>
     * <li>{@code pSizeInfo} <b>must</b> be a valid pointer to a {@link VkMicromapBuildSizesInfoEXT} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkMicromapBuildInfoEXT}, {@link VkMicromapBuildSizesInfoEXT}</p>
     *
     * @param device     the logical device that will be used for creating the micromap.
     * @param buildType  defines whether host or device operations (or both) are being queried for.
     * @param pBuildInfo a pointer to a {@link VkMicromapBuildInfoEXT} structure describing parameters of a build operation.
     * @param pSizeInfo  a pointer to a {@link VkMicromapBuildSizesInfoEXT} structure which returns the size required for a micromap and the sizes required for the scratch buffers, given the build parameters.
     */
    public static void vkGetMicromapBuildSizesEXT(VkDevice device, @NativeType("VkAccelerationStructureBuildTypeKHR") int buildType, @NativeType("VkMicromapBuildInfoEXT const *") VkMicromapBuildInfoEXT pBuildInfo, @NativeType("VkMicromapBuildSizesInfoEXT *") VkMicromapBuildSizesInfoEXT pSizeInfo) {
        nvkGetMicromapBuildSizesEXT(device, buildType, pBuildInfo.address(), pSizeInfo.address());
    }

    /** Array version of: {@link #vkCreateMicromapEXT CreateMicromapEXT} */
    @NativeType("VkResult")
    public static int vkCreateMicromapEXT(VkDevice device, @NativeType("VkMicromapCreateInfoEXT const *") VkMicromapCreateInfoEXT pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkMicromapEXT *") long[] pMicromap) {
        long __functionAddress = device.getCapabilities().vkCreateMicromapEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pMicromap, 1);
        }
        return callPPPPI(device.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pMicromap, __functionAddress);
    }

    /** Array version of: {@link #vkWriteMicromapsPropertiesEXT WriteMicromapsPropertiesEXT} */
    @NativeType("VkResult")
    public static int vkWriteMicromapsPropertiesEXT(VkDevice device, @NativeType("VkMicromapEXT const *") long[] pMicromaps, @NativeType("VkQueryType") int queryType, @NativeType("void *") ByteBuffer pData, @NativeType("size_t") long stride) {
        long __functionAddress = device.getCapabilities().vkWriteMicromapsPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPPI(device.address(), pMicromaps.length, pMicromaps, queryType, (long)pData.remaining(), memAddress(pData), stride, __functionAddress);
    }

    /** Array version of: {@link #vkCmdWriteMicromapsPropertiesEXT CmdWriteMicromapsPropertiesEXT} */
    public static void vkCmdWriteMicromapsPropertiesEXT(VkCommandBuffer commandBuffer, @NativeType("VkMicromapEXT const *") long[] pMicromaps, @NativeType("VkQueryType") int queryType, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdWriteMicromapsPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPJV(commandBuffer.address(), pMicromaps.length, pMicromaps, queryType, queryPool, firstQuery, __functionAddress);
    }

    /** Array version of: {@link #vkGetDeviceMicromapCompatibilityEXT GetDeviceMicromapCompatibilityEXT} */
    public static void vkGetDeviceMicromapCompatibilityEXT(VkDevice device, @NativeType("VkMicromapVersionInfoEXT const *") VkMicromapVersionInfoEXT pVersionInfo, @NativeType("VkAccelerationStructureCompatibilityKHR *") int[] pCompatibility) {
        long __functionAddress = device.getCapabilities().vkGetDeviceMicromapCompatibilityEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pCompatibility, 1);
            VkMicromapVersionInfoEXT.validate(pVersionInfo.address());
        }
        callPPPV(device.address(), pVersionInfo.address(), pCompatibility, __functionAddress);
    }

}
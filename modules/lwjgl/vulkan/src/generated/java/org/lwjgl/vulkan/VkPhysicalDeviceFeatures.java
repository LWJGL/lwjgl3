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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing the fine-grained features that can be supported by an implementation.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDeviceCreateInfo}, {@link VkPhysicalDeviceFeatures2}, {@link VK10#vkGetPhysicalDeviceFeatures GetPhysicalDeviceFeatures}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFeatures {
 *     VkBool32 {@link #robustBufferAccess};
 *     VkBool32 {@link #fullDrawIndexUint32};
 *     VkBool32 {@link #imageCubeArray};
 *     VkBool32 {@link #independentBlend};
 *     VkBool32 {@link #geometryShader};
 *     VkBool32 {@link #tessellationShader};
 *     VkBool32 {@link #sampleRateShading};
 *     VkBool32 {@link #dualSrcBlend};
 *     VkBool32 {@link #logicOp};
 *     VkBool32 {@link #multiDrawIndirect};
 *     VkBool32 {@link #drawIndirectFirstInstance};
 *     VkBool32 {@link #depthClamp};
 *     VkBool32 {@link #depthBiasClamp};
 *     VkBool32 {@link #fillModeNonSolid};
 *     VkBool32 {@link #depthBounds};
 *     VkBool32 {@link #wideLines};
 *     VkBool32 {@link #largePoints};
 *     VkBool32 {@link #alphaToOne};
 *     VkBool32 {@link #multiViewport};
 *     VkBool32 {@link #samplerAnisotropy};
 *     VkBool32 {@link #textureCompressionETC2};
 *     VkBool32 {@link #textureCompressionASTC_LDR};
 *     VkBool32 {@link #textureCompressionBC};
 *     VkBool32 {@link #occlusionQueryPrecise};
 *     VkBool32 {@link #pipelineStatisticsQuery};
 *     VkBool32 {@link #vertexPipelineStoresAndAtomics};
 *     VkBool32 {@link #fragmentStoresAndAtomics};
 *     VkBool32 {@link #shaderTessellationAndGeometryPointSize};
 *     VkBool32 {@link #shaderImageGatherExtended};
 *     VkBool32 {@link #shaderStorageImageExtendedFormats};
 *     VkBool32 {@link #shaderStorageImageMultisample};
 *     VkBool32 {@link #shaderStorageImageReadWithoutFormat};
 *     VkBool32 {@link #shaderStorageImageWriteWithoutFormat};
 *     VkBool32 {@link #shaderUniformBufferArrayDynamicIndexing};
 *     VkBool32 {@link #shaderSampledImageArrayDynamicIndexing};
 *     VkBool32 {@link #shaderStorageBufferArrayDynamicIndexing};
 *     VkBool32 {@link #shaderStorageImageArrayDynamicIndexing};
 *     VkBool32 {@link #shaderClipDistance};
 *     VkBool32 {@link #shaderCullDistance};
 *     VkBool32 {@link #shaderFloat64};
 *     VkBool32 {@link #shaderInt64};
 *     VkBool32 {@link #shaderInt16};
 *     VkBool32 {@link #shaderResourceResidency};
 *     VkBool32 {@link #shaderResourceMinLod};
 *     VkBool32 {@link #sparseBinding};
 *     VkBool32 {@link #sparseResidencyBuffer};
 *     VkBool32 {@link #sparseResidencyImage2D};
 *     VkBool32 {@link #sparseResidencyImage3D};
 *     VkBool32 {@link #sparseResidency2Samples};
 *     VkBool32 {@link #sparseResidency4Samples};
 *     VkBool32 {@link #sparseResidency8Samples};
 *     VkBool32 {@link #sparseResidency16Samples};
 *     VkBool32 {@link #sparseResidencyAliased};
 *     VkBool32 {@link #variableMultisampleRate};
 *     VkBool32 {@link #inheritedQueries};
 * }</code></pre>
 */
public class VkPhysicalDeviceFeatures extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ROBUSTBUFFERACCESS,
        FULLDRAWINDEXUINT32,
        IMAGECUBEARRAY,
        INDEPENDENTBLEND,
        GEOMETRYSHADER,
        TESSELLATIONSHADER,
        SAMPLERATESHADING,
        DUALSRCBLEND,
        LOGICOP,
        MULTIDRAWINDIRECT,
        DRAWINDIRECTFIRSTINSTANCE,
        DEPTHCLAMP,
        DEPTHBIASCLAMP,
        FILLMODENONSOLID,
        DEPTHBOUNDS,
        WIDELINES,
        LARGEPOINTS,
        ALPHATOONE,
        MULTIVIEWPORT,
        SAMPLERANISOTROPY,
        TEXTURECOMPRESSIONETC2,
        TEXTURECOMPRESSIONASTC_LDR,
        TEXTURECOMPRESSIONBC,
        OCCLUSIONQUERYPRECISE,
        PIPELINESTATISTICSQUERY,
        VERTEXPIPELINESTORESANDATOMICS,
        FRAGMENTSTORESANDATOMICS,
        SHADERTESSELLATIONANDGEOMETRYPOINTSIZE,
        SHADERIMAGEGATHEREXTENDED,
        SHADERSTORAGEIMAGEEXTENDEDFORMATS,
        SHADERSTORAGEIMAGEMULTISAMPLE,
        SHADERSTORAGEIMAGEREADWITHOUTFORMAT,
        SHADERSTORAGEIMAGEWRITEWITHOUTFORMAT,
        SHADERUNIFORMBUFFERARRAYDYNAMICINDEXING,
        SHADERSAMPLEDIMAGEARRAYDYNAMICINDEXING,
        SHADERSTORAGEBUFFERARRAYDYNAMICINDEXING,
        SHADERSTORAGEIMAGEARRAYDYNAMICINDEXING,
        SHADERCLIPDISTANCE,
        SHADERCULLDISTANCE,
        SHADERFLOAT64,
        SHADERINT64,
        SHADERINT16,
        SHADERRESOURCERESIDENCY,
        SHADERRESOURCEMINLOD,
        SPARSEBINDING,
        SPARSERESIDENCYBUFFER,
        SPARSERESIDENCYIMAGE2D,
        SPARSERESIDENCYIMAGE3D,
        SPARSERESIDENCY2SAMPLES,
        SPARSERESIDENCY4SAMPLES,
        SPARSERESIDENCY8SAMPLES,
        SPARSERESIDENCY16SAMPLES,
        SPARSERESIDENCYALIASED,
        VARIABLEMULTISAMPLERATE,
        INHERITEDQUERIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ROBUSTBUFFERACCESS = layout.offsetof(0);
        FULLDRAWINDEXUINT32 = layout.offsetof(1);
        IMAGECUBEARRAY = layout.offsetof(2);
        INDEPENDENTBLEND = layout.offsetof(3);
        GEOMETRYSHADER = layout.offsetof(4);
        TESSELLATIONSHADER = layout.offsetof(5);
        SAMPLERATESHADING = layout.offsetof(6);
        DUALSRCBLEND = layout.offsetof(7);
        LOGICOP = layout.offsetof(8);
        MULTIDRAWINDIRECT = layout.offsetof(9);
        DRAWINDIRECTFIRSTINSTANCE = layout.offsetof(10);
        DEPTHCLAMP = layout.offsetof(11);
        DEPTHBIASCLAMP = layout.offsetof(12);
        FILLMODENONSOLID = layout.offsetof(13);
        DEPTHBOUNDS = layout.offsetof(14);
        WIDELINES = layout.offsetof(15);
        LARGEPOINTS = layout.offsetof(16);
        ALPHATOONE = layout.offsetof(17);
        MULTIVIEWPORT = layout.offsetof(18);
        SAMPLERANISOTROPY = layout.offsetof(19);
        TEXTURECOMPRESSIONETC2 = layout.offsetof(20);
        TEXTURECOMPRESSIONASTC_LDR = layout.offsetof(21);
        TEXTURECOMPRESSIONBC = layout.offsetof(22);
        OCCLUSIONQUERYPRECISE = layout.offsetof(23);
        PIPELINESTATISTICSQUERY = layout.offsetof(24);
        VERTEXPIPELINESTORESANDATOMICS = layout.offsetof(25);
        FRAGMENTSTORESANDATOMICS = layout.offsetof(26);
        SHADERTESSELLATIONANDGEOMETRYPOINTSIZE = layout.offsetof(27);
        SHADERIMAGEGATHEREXTENDED = layout.offsetof(28);
        SHADERSTORAGEIMAGEEXTENDEDFORMATS = layout.offsetof(29);
        SHADERSTORAGEIMAGEMULTISAMPLE = layout.offsetof(30);
        SHADERSTORAGEIMAGEREADWITHOUTFORMAT = layout.offsetof(31);
        SHADERSTORAGEIMAGEWRITEWITHOUTFORMAT = layout.offsetof(32);
        SHADERUNIFORMBUFFERARRAYDYNAMICINDEXING = layout.offsetof(33);
        SHADERSAMPLEDIMAGEARRAYDYNAMICINDEXING = layout.offsetof(34);
        SHADERSTORAGEBUFFERARRAYDYNAMICINDEXING = layout.offsetof(35);
        SHADERSTORAGEIMAGEARRAYDYNAMICINDEXING = layout.offsetof(36);
        SHADERCLIPDISTANCE = layout.offsetof(37);
        SHADERCULLDISTANCE = layout.offsetof(38);
        SHADERFLOAT64 = layout.offsetof(39);
        SHADERINT64 = layout.offsetof(40);
        SHADERINT16 = layout.offsetof(41);
        SHADERRESOURCERESIDENCY = layout.offsetof(42);
        SHADERRESOURCEMINLOD = layout.offsetof(43);
        SPARSEBINDING = layout.offsetof(44);
        SPARSERESIDENCYBUFFER = layout.offsetof(45);
        SPARSERESIDENCYIMAGE2D = layout.offsetof(46);
        SPARSERESIDENCYIMAGE3D = layout.offsetof(47);
        SPARSERESIDENCY2SAMPLES = layout.offsetof(48);
        SPARSERESIDENCY4SAMPLES = layout.offsetof(49);
        SPARSERESIDENCY8SAMPLES = layout.offsetof(50);
        SPARSERESIDENCY16SAMPLES = layout.offsetof(51);
        SPARSERESIDENCYALIASED = layout.offsetof(52);
        VARIABLEMULTISAMPLERATE = layout.offsetof(53);
        INHERITEDQUERIES = layout.offsetof(54);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFeatures(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * specifies that accesses to buffers are bounds-checked against the range of the buffer descriptor (as determined by {@link VkDescriptorBufferInfo}{@code ::range}, {@link VkBufferViewCreateInfo}{@code ::range}, or the size of the buffer). Out of bounds accesses <b>must</b> not cause application termination, and the effects of shader loads, stores, and atomics <b>must</b> conform to an implementation-dependent behavior as described below.
     * 
     * <ul>
     * <li>A buffer access is considered to be out of bounds if any of the following are true:
     * 
     * <ul>
     * <li>The pointer was formed by {@code OpImageTexelPointer} and the coordinate is less than zero or greater than or equal to the number of whole elements in the bound range.</li>
     * <li>The pointer was not formed by {@code OpImageTexelPointer} and the object pointed to is not wholly contained within the bound range. This includes accesses performed via <em>variable pointers</em> where the buffer descriptor being accessed cannot be statically determined. Uninitialized pointers and pointers equal to {@code OpConstantNull} are treated as pointing to a zero-sized object, so all accesses through such pointers are considered to be out of bounds. Buffer accesses through buffer device addresses are not bounds-checked. If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-cooperativeMatrixRobustBufferAccess">{@code cooperativeMatrixRobustBufferAccess}</a> feature is not enabled, then accesses using {@code OpCooperativeMatrixLoadNV} and {@code OpCooperativeMatrixStoreNV} <b>may</b> not be bounds-checked.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>If a SPIR-V {@code OpLoad} instruction loads a structure and the tail end of the structure is out of bounds, then all members of the structure are considered out of bounds even if the members at the end are not statically used.</p>
     * </div>
     * </li>
     * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess2">{@code robustBufferAccess2}</a> is not enabled and any buffer access is determined to be out of bounds, then any other access of the same type (load, store, or atomic) to the same buffer that accesses an address less than 16 bytes away from the out of bounds address <b>may</b> also be considered out of bounds.</li>
     * <li>If the access is a load that reads from the same memory locations as a prior store in the same shader invocation, with no other intervening accesses to the same memory locations in that shader invocation, then the result of the load <b>may</b> be the value stored by the store instruction, even if the access is out of bounds. If the load is {@code Volatile}, then an out of bounds load <b>must</b> return the appropriate out of bounds value.</li>
     * </ul>
     * </li>
     * <li>Accesses to descriptors written with a {@link VK10#VK_NULL_HANDLE NULL_HANDLE} resource or view are not considered to be out of bounds. Instead, each type of descriptor access defines a specific behavior for accesses to a null descriptor.</li>
     * <li>Out-of-bounds buffer loads will return any of the following values:
     * 
     * <ul>
     * <li>If the access is to a uniform buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess2">{@code robustBufferAccess2}</a> is enabled, loads of offsets between the end of the descriptor range and the end of the descriptor range rounded up to a multiple of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-robustUniformBufferAccessSizeAlignment">robustUniformBufferAccessSizeAlignment</a> bytes <b>must</b> return either zero values or the contents of the memory at the offset being loaded. Loads of offsets past the descriptor range rounded up to a multiple of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-robustUniformBufferAccessSizeAlignment">robustUniformBufferAccessSizeAlignment</a> bytes <b>must</b> return zero values.</li>
     * <li>If the access is to a storage buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess2">{@code robustBufferAccess2}</a> is enabled, loads of offsets between the end of the descriptor range and the end of the descriptor range rounded up to a multiple of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-robustStorageBufferAccessSizeAlignment">robustStorageBufferAccessSizeAlignment</a> bytes <b>must</b> return either zero values or the contents of the memory at the offset being loaded. Loads of offsets past the descriptor range rounded up to a multiple of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-robustStorageBufferAccessSizeAlignment">robustStorageBufferAccessSizeAlignment</a> bytes <b>must</b> return zero values. Similarly, stores to addresses between the end of the descriptor range and the end of the descriptor range rounded up to a multiple of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-robustStorageBufferAccessSizeAlignment">robustStorageBufferAccessSizeAlignment</a> bytes <b>may</b> be discarded.</li>
     * <li>Non-atomic accesses to storage buffers that are a multiple of 32 bits <b>may</b> be decomposed into 32-bit accesses that are individually bounds-checked.</li>
     * <li>If the access is to an index buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess2">{@code robustBufferAccess2}</a> is enabled, zero values <b>must</b> be returned.</li>
     * <li>If the access is to a uniform texel buffer or storage texel buffer and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess2">{@code robustBufferAccess2}</a> is enabled, zero values <b>must</b> be returned, and then <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#textures-conversion-to-rgba">Conversion to RGBA</a> is applied based on the buffer view’s format.</li>
     * <li>Values from anywhere within the memory range(s) bound to the buffer (possibly including bytes of memory past the end of the buffer, up to the end of the bound range).</li>
     * <li>Zero values, or <code>(0,0,0,x)</code> vectors for vector reads where x is a valid value represented in the type of the vector components and <b>may</b> be any of:
     * 
     * <ul>
     * <li>0, 1, or the maximum representable positive integer value, for signed or unsigned integer components</li>
     * <li>0.0 or 1.0, for floating-point components</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>Out-of-bounds writes <b>may</b> modify values within the memory range(s) bound to the buffer, but <b>must</b> not modify any other memory.
     * 
     * <ul>
     * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess2">{@code robustBufferAccess2}</a> is enabled, out of bounds writes <b>must</b> not modify any memory.</li>
     * </ul>
     * </li>
     * <li>Out-of-bounds atomics <b>may</b> modify values within the memory range(s) bound to the buffer, but <b>must</b> not modify any other memory, and return an undefined value.
     * 
     * <ul>
     * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess2">{@code robustBufferAccess2}</a> is enabled, out of bounds atomics <b>must</b> not modify any memory, and return an undefined value.</li>
     * </ul>
     * </li>
     * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess2">{@code robustBufferAccess2}</a> is disabled, vertex input attributes are considered out of bounds if the offset of the attribute in the bound vertex buffer range plus the size of the attribute is greater than either:
     * 
     * <ul>
     * <li>{@code vertexBufferRangeSize}, if <code>bindingStride == 0</code>; or</li>
     * <li><code>(vertexBufferRangeSize - (vertexBufferRangeSize % bindingStride))</code></li>
     * </ul>
     * 
     * <p>where {@code vertexBufferRangeSize} is the byte size of the memory range bound to the vertex buffer binding and {@code bindingStride} is the byte stride of the corresponding vertex input binding. Further, if any vertex input attribute using a specific vertex input binding is out of bounds, then all vertex input attributes using that vertex input binding for that vertex shader invocation are considered out of bounds.</p>
     * 
     * <ul>
     * <li>If a vertex input attribute is out of bounds, it will be assigned one of the following values:
     * 
     * <ul>
     * <li>Values from anywhere within the memory range(s) bound to the buffer, converted according to the format of the attribute.</li>
     * <li>Zero values, format converted according to the format of the attribute.</li>
     * <li>Zero values, or <code>(0,0,0,x)</code> vectors, as described above.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess2">{@code robustBufferAccess2}</a> is enabled, vertex input attributes are considered out of bounds if the offset of the attribute in the bound vertex buffer range plus the size of the attribute is greater than the byte size of the memory range bound to the vertex buffer binding.
     * 
     * <ul>
     * <li>If a vertex input attribute is out of bounds, the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fxvertex-input-extraction">raw data</a> extracted are zero values, and missing G, B, or A components are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fxvertex-input-extraction">filled with <code>(0,0,1)</code></a>.</li>
     * </ul>
     * </li>
     * <li>If {@code robustBufferAccess} is not enabled, applications <b>must</b> not perform out of bounds accesses.</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean robustBufferAccess() { return nrobustBufferAccess(address()) != 0; }
    /** specifies the full 32-bit range of indices is supported for indexed draw calls when using a {@code VkIndexType} of {@link VK10#VK_INDEX_TYPE_UINT32 INDEX_TYPE_UINT32}. {@code maxDrawIndexedIndexValue} is the maximum index value that <b>may</b> be used (aside from the primitive restart index, which is always 2<sup>32</sup>-1 when the {@code VkIndexType} is {@link VK10#VK_INDEX_TYPE_UINT32 INDEX_TYPE_UINT32}). If this feature is supported, {@code maxDrawIndexedIndexValue} <b>must</b> be 2<sup>32</sup>-1; otherwise it <b>must</b> be no smaller than 2<sup>24</sup>-1. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxDrawIndexedIndexValue">maxDrawIndexedIndexValue</a>. */
    @NativeType("VkBool32")
    public boolean fullDrawIndexUint32() { return nfullDrawIndexUint32(address()) != 0; }
    /** specifies whether image views with a {@code VkImageViewType} of {@link VK10#VK_IMAGE_VIEW_TYPE_CUBE_ARRAY IMAGE_VIEW_TYPE_CUBE_ARRAY} <b>can</b> be created, and that the corresponding {@code SampledCubeArray} and {@code ImageCubeArray} SPIR-V capabilities <b>can</b> be used in shader code. */
    @NativeType("VkBool32")
    public boolean imageCubeArray() { return nimageCubeArray(address()) != 0; }
    /** specifies whether the {@link VkPipelineColorBlendAttachmentState} settings are controlled independently per-attachment. If this feature is not enabled, the {@link VkPipelineColorBlendAttachmentState} settings for all color attachments <b>must</b> be identical. Otherwise, a different {@link VkPipelineColorBlendAttachmentState} <b>can</b> be provided for each bound color attachment. */
    @NativeType("VkBool32")
    public boolean independentBlend() { return nindependentBlend(address()) != 0; }
    /** specifies whether geometry shaders are supported. If this feature is not enabled, the {@link VK10#VK_SHADER_STAGE_GEOMETRY_BIT SHADER_STAGE_GEOMETRY_BIT} and {@link VK10#VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT PIPELINE_STAGE_GEOMETRY_SHADER_BIT} enum values <b>must</b> not be used. This also specifies whether shader modules <b>can</b> declare the {@code Geometry} capability. */
    @NativeType("VkBool32")
    public boolean geometryShader() { return ngeometryShader(address()) != 0; }
    /** specifies whether tessellation control and evaluation shaders are supported. If this feature is not enabled, the {@link VK10#VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT SHADER_STAGE_TESSELLATION_CONTROL_BIT}, {@link VK10#VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT SHADER_STAGE_TESSELLATION_EVALUATION_BIT}, {@link VK10#VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT}, {@link VK10#VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT}, and {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO} enum values <b>must</b> not be used. This also specifies whether shader modules <b>can</b> declare the {@code Tessellation} capability. */
    @NativeType("VkBool32")
    public boolean tessellationShader() { return ntessellationShader(address()) != 0; }
    /** specifies whether <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-sampleshading">Sample Shading</a> and multisample interpolation are supported. If this feature is not enabled, the {@code sampleShadingEnable} member of the {@link VkPipelineMultisampleStateCreateInfo} structure <b>must</b> be set to {@link VK10#VK_FALSE FALSE} and the {@code minSampleShading} member is ignored. This also specifies whether shader modules <b>can</b> declare the {@code SampleRateShading} capability. */
    @NativeType("VkBool32")
    public boolean sampleRateShading() { return nsampleRateShading(address()) != 0; }
    /** specifies whether blend operations which take two sources are supported. If this feature is not enabled, the {@link VK10#VK_BLEND_FACTOR_SRC1_COLOR BLEND_FACTOR_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR BLEND_FACTOR_ONE_MINUS_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_SRC1_ALPHA BLEND_FACTOR_SRC1_ALPHA}, and {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA} enum values <b>must</b> not be used as source or destination blending factors. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#framebuffer-dsb">Dual-Source Blending</a>. */
    @NativeType("VkBool32")
    public boolean dualSrcBlend() { return ndualSrcBlend(address()) != 0; }
    /** specifies whether logic operations are supported. If this feature is not enabled, the {@code logicOpEnable} member of the {@link VkPipelineColorBlendStateCreateInfo} structure <b>must</b> be set to {@link VK10#VK_FALSE FALSE}, and the {@code logicOp} member is ignored. */
    @NativeType("VkBool32")
    public boolean logicOp() { return nlogicOp(address()) != 0; }
    /** specifies whether multiple draw indirect is supported. If this feature is not enabled, the {@code drawCount} parameter to the {@code vkCmdDrawIndirect} and {@code vkCmdDrawIndexedIndirect} commands <b>must</b> be 0 or 1. The {@code maxDrawIndirectCount} member of the {@link VkPhysicalDeviceLimits} structure <b>must</b> also be 1 if this feature is not supported. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxDrawIndirectCount">maxDrawIndirectCount</a>. */
    @NativeType("VkBool32")
    public boolean multiDrawIndirect() { return nmultiDrawIndirect(address()) != 0; }
    /** specifies whether indirect drawing calls support the {@code firstInstance} parameter. If this feature is not enabled, the {@code firstInstance} member of all {@link VkDrawIndirectCommand} and {@link VkDrawIndexedIndirectCommand} structures that are provided to the {@code vkCmdDrawIndirect} and {@code vkCmdDrawIndexedIndirect} commands <b>must</b> be 0. */
    @NativeType("VkBool32")
    public boolean drawIndirectFirstInstance() { return ndrawIndirectFirstInstance(address()) != 0; }
    /** specifies whether depth clamping is supported. If this feature is not enabled, the {@code depthClampEnable} member of the {@link VkPipelineRasterizationStateCreateInfo} structure <b>must</b> be set to {@link VK10#VK_FALSE FALSE}. Otherwise, setting {@code depthClampEnable} to {@link VK10#VK_TRUE TRUE} will enable depth clamping. */
    @NativeType("VkBool32")
    public boolean depthClamp() { return ndepthClamp(address()) != 0; }
    /** specifies whether depth bias clamping is supported. If this feature is not enabled, the {@code depthBiasClamp} member of the {@link VkPipelineRasterizationStateCreateInfo} structure <b>must</b> be set to 0.0 unless the {@link VK10#VK_DYNAMIC_STATE_DEPTH_BIAS DYNAMIC_STATE_DEPTH_BIAS} dynamic state is enabled, and the {@code depthBiasClamp} parameter to {@code vkCmdSetDepthBias} <b>must</b> be set to 0.0. */
    @NativeType("VkBool32")
    public boolean depthBiasClamp() { return ndepthBiasClamp(address()) != 0; }
    /** specifies whether point and wireframe fill modes are supported. If this feature is not enabled, the {@link VK10#VK_POLYGON_MODE_POINT POLYGON_MODE_POINT} and {@link VK10#VK_POLYGON_MODE_LINE POLYGON_MODE_LINE} enum values <b>must</b> not be used. */
    @NativeType("VkBool32")
    public boolean fillModeNonSolid() { return nfillModeNonSolid(address()) != 0; }
    /** specifies whether depth bounds tests are supported. If this feature is not enabled, the {@code depthBoundsTestEnable} member of the {@link VkPipelineDepthStencilStateCreateInfo} structure <b>must</b> be set to {@link VK10#VK_FALSE FALSE}. When {@code depthBoundsTestEnable} is set to {@link VK10#VK_FALSE FALSE}, the {@code minDepthBounds} and {@code maxDepthBounds} members of the {@link VkPipelineDepthStencilStateCreateInfo} structure are ignored. */
    @NativeType("VkBool32")
    public boolean depthBounds() { return ndepthBounds(address()) != 0; }
    /** specifies whether lines with width other than 1.0 are supported. If this feature is not enabled, the {@code lineWidth} member of the {@link VkPipelineRasterizationStateCreateInfo} structure <b>must</b> be set to 1.0 unless the {@link VK10#VK_DYNAMIC_STATE_LINE_WIDTH DYNAMIC_STATE_LINE_WIDTH} dynamic state is enabled, and the {@code lineWidth} parameter to {@code vkCmdSetLineWidth} <b>must</b> be set to 1.0. When this feature is supported, the range and granularity of supported line widths are indicated by the {@code lineWidthRange} and {@code lineWidthGranularity} members of the {@link VkPhysicalDeviceLimits} structure, respectively. */
    @NativeType("VkBool32")
    public boolean wideLines() { return nwideLines(address()) != 0; }
    /** specifies whether points with size greater than 1.0 are supported. If this feature is not enabled, only a point size of 1.0 written by a shader is supported. The range and granularity of supported point sizes are indicated by the {@code pointSizeRange} and {@code pointSizeGranularity} members of the {@link VkPhysicalDeviceLimits} structure, respectively. */
    @NativeType("VkBool32")
    public boolean largePoints() { return nlargePoints(address()) != 0; }
    /** specifies whether the implementation is able to replace the alpha value of the fragment shader color output in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-covg">Multisample Coverage</a> fragment operation. If this feature is not enabled, then the {@code alphaToOneEnable} member of the {@link VkPipelineMultisampleStateCreateInfo} structure <b>must</b> be set to {@link VK10#VK_FALSE FALSE}. Otherwise setting {@code alphaToOneEnable} to {@link VK10#VK_TRUE TRUE} will enable alpha-to-one behavior. */
    @NativeType("VkBool32")
    public boolean alphaToOne() { return nalphaToOne(address()) != 0; }
    /**
     * specifies whether more than one viewport is supported. If this feature is not enabled:
     * 
     * <ul>
     * <li>The {@code viewportCount} and {@code scissorCount} members of the {@link VkPipelineViewportStateCreateInfo} structure <b>must</b> be set to 1.</li>
     * <li>The {@code firstViewport} and {@code viewportCount} parameters to the {@code vkCmdSetViewport} command <b>must</b> be set to 0 and 1, respectively.</li>
     * <li>The {@code firstScissor} and {@code scissorCount} parameters to the {@code vkCmdSetScissor} command <b>must</b> be set to 0 and 1, respectively.</li>
     * <li>The {@code exclusiveScissorCount} member of the {@link VkPipelineViewportExclusiveScissorStateCreateInfoNV} structure <b>must</b> be set to 0 or 1.</li>
     * <li>The {@code firstExclusiveScissor} and {@code exclusiveScissorCount} parameters to the {@code vkCmdSetExclusiveScissorNV} command <b>must</b> be set to 0 and 1, respectively.</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean multiViewport() { return nmultiViewport(address()) != 0; }
    /** specifies whether anisotropic filtering is supported. If this feature is not enabled, the {@code anisotropyEnable} member of the {@link VkSamplerCreateInfo} structure <b>must</b> be {@link VK10#VK_FALSE FALSE}. */
    @NativeType("VkBool32")
    public boolean samplerAnisotropy() { return nsamplerAnisotropy(address()) != 0; }
    /**
     * specifies whether all of the ETC2 and EAC compressed texture formats are supported. If this feature is enabled, then the {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}, {@link VK10#VK_FORMAT_FEATURE_BLIT_SRC_BIT FORMAT_FEATURE_BLIT_SRC_BIT} and {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} features <b>must</b> be supported in {@code optimalTilingFeatures} for the following formats:
     * 
     * <ul>
     * <li>{@link VK10#VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK FORMAT_ETC2_R8G8B8_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK FORMAT_ETC2_R8G8B8_SRGB_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_EAC_R11_UNORM_BLOCK FORMAT_EAC_R11_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_EAC_R11_SNORM_BLOCK FORMAT_EAC_R11_SNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_EAC_R11G11_UNORM_BLOCK FORMAT_EAC_R11G11_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_EAC_R11G11_SNORM_BLOCK FORMAT_EAC_R11G11_SNORM_BLOCK}</li>
     * </ul>
     * 
     * <p>To query for additional properties, or if the feature is not enabled, {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} and {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} <b>can</b> be used to check for supported properties of individual formats as normal.</p>
     */
    @NativeType("VkBool32")
    public boolean textureCompressionETC2() { return ntextureCompressionETC2(address()) != 0; }
    /**
     * specifies whether all of the ASTC LDR compressed texture formats are supported. If this feature is enabled, then the {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}, {@link VK10#VK_FORMAT_FEATURE_BLIT_SRC_BIT FORMAT_FEATURE_BLIT_SRC_BIT} and {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} features <b>must</b> be supported in {@code optimalTilingFeatures} for the following formats:
     * 
     * <ul>
     * <li>{@link VK10#VK_FORMAT_ASTC_4x4_UNORM_BLOCK FORMAT_ASTC_4x4_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_4x4_SRGB_BLOCK FORMAT_ASTC_4x4_SRGB_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_5x4_UNORM_BLOCK FORMAT_ASTC_5x4_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_5x4_SRGB_BLOCK FORMAT_ASTC_5x4_SRGB_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_5x5_UNORM_BLOCK FORMAT_ASTC_5x5_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_5x5_SRGB_BLOCK FORMAT_ASTC_5x5_SRGB_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_6x5_UNORM_BLOCK FORMAT_ASTC_6x5_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_6x5_SRGB_BLOCK FORMAT_ASTC_6x5_SRGB_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_6x6_UNORM_BLOCK FORMAT_ASTC_6x6_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_6x6_SRGB_BLOCK FORMAT_ASTC_6x6_SRGB_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_8x5_UNORM_BLOCK FORMAT_ASTC_8x5_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_8x5_SRGB_BLOCK FORMAT_ASTC_8x5_SRGB_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_8x6_UNORM_BLOCK FORMAT_ASTC_8x6_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_8x6_SRGB_BLOCK FORMAT_ASTC_8x6_SRGB_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_8x8_UNORM_BLOCK FORMAT_ASTC_8x8_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_8x8_SRGB_BLOCK FORMAT_ASTC_8x8_SRGB_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_10x5_UNORM_BLOCK FORMAT_ASTC_10x5_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_10x5_SRGB_BLOCK FORMAT_ASTC_10x5_SRGB_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_10x6_UNORM_BLOCK FORMAT_ASTC_10x6_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_10x6_SRGB_BLOCK FORMAT_ASTC_10x6_SRGB_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_10x8_UNORM_BLOCK FORMAT_ASTC_10x8_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_10x8_SRGB_BLOCK FORMAT_ASTC_10x8_SRGB_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_10x10_UNORM_BLOCK FORMAT_ASTC_10x10_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_10x10_SRGB_BLOCK FORMAT_ASTC_10x10_SRGB_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_12x10_UNORM_BLOCK FORMAT_ASTC_12x10_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_12x10_SRGB_BLOCK FORMAT_ASTC_12x10_SRGB_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_12x12_UNORM_BLOCK FORMAT_ASTC_12x12_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_ASTC_12x12_SRGB_BLOCK FORMAT_ASTC_12x12_SRGB_BLOCK}</li>
     * </ul>
     * 
     * <p>To query for additional properties, or if the feature is not enabled, {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} and {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} <b>can</b> be used to check for supported properties of individual formats as normal.</p>
     */
    @NativeType("VkBool32")
    public boolean textureCompressionASTC_LDR() { return ntextureCompressionASTC_LDR(address()) != 0; }
    /**
     * specifies whether all of the BC compressed texture formats are supported. If this feature is enabled, then the {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}, {@link VK10#VK_FORMAT_FEATURE_BLIT_SRC_BIT FORMAT_FEATURE_BLIT_SRC_BIT} and {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} features <b>must</b> be supported in {@code optimalTilingFeatures} for the following formats:
     * 
     * <ul>
     * <li>{@link VK10#VK_FORMAT_BC1_RGB_UNORM_BLOCK FORMAT_BC1_RGB_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_BC1_RGB_SRGB_BLOCK FORMAT_BC1_RGB_SRGB_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_BC1_RGBA_UNORM_BLOCK FORMAT_BC1_RGBA_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_BC1_RGBA_SRGB_BLOCK FORMAT_BC1_RGBA_SRGB_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_BC2_UNORM_BLOCK FORMAT_BC2_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_BC2_SRGB_BLOCK FORMAT_BC2_SRGB_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_BC3_UNORM_BLOCK FORMAT_BC3_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_BC3_SRGB_BLOCK FORMAT_BC3_SRGB_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_BC4_UNORM_BLOCK FORMAT_BC4_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_BC4_SNORM_BLOCK FORMAT_BC4_SNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_BC5_UNORM_BLOCK FORMAT_BC5_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_BC5_SNORM_BLOCK FORMAT_BC5_SNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_BC6H_UFLOAT_BLOCK FORMAT_BC6H_UFLOAT_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_BC6H_SFLOAT_BLOCK FORMAT_BC6H_SFLOAT_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_BC7_UNORM_BLOCK FORMAT_BC7_UNORM_BLOCK}</li>
     * <li>{@link VK10#VK_FORMAT_BC7_SRGB_BLOCK FORMAT_BC7_SRGB_BLOCK}</li>
     * </ul>
     * 
     * <p>To query for additional properties, or if the feature is not enabled, {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} and {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} <b>can</b> be used to check for supported properties of individual formats as normal.</p>
     */
    @NativeType("VkBool32")
    public boolean textureCompressionBC() { return ntextureCompressionBC(address()) != 0; }
    /** specifies whether occlusion queries returning actual sample counts are supported. Occlusion queries are created in a {@code VkQueryPool} by specifying the {@code queryType} of {@link VK10#VK_QUERY_TYPE_OCCLUSION QUERY_TYPE_OCCLUSION} in the {@link VkQueryPoolCreateInfo} structure which is passed to {@code vkCreateQueryPool}. If this feature is enabled, queries of this type <b>can</b> enable {@link VK10#VK_QUERY_CONTROL_PRECISE_BIT QUERY_CONTROL_PRECISE_BIT} in the {@code flags} parameter to {@code vkCmdBeginQuery}. If this feature is not supported, the implementation supports only boolean occlusion queries. When any samples are passed, boolean queries will return a non-zero result value, otherwise a result value of zero is returned. When this feature is enabled and {@link VK10#VK_QUERY_CONTROL_PRECISE_BIT QUERY_CONTROL_PRECISE_BIT} is set, occlusion queries will report the actual number of samples passed. */
    @NativeType("VkBool32")
    public boolean occlusionQueryPrecise() { return nocclusionQueryPrecise(address()) != 0; }
    /** specifies whether the pipeline statistics queries are supported. If this feature is not enabled, queries of type {@link VK10#VK_QUERY_TYPE_PIPELINE_STATISTICS QUERY_TYPE_PIPELINE_STATISTICS} <b>cannot</b> be created, and none of the {@code VkQueryPipelineStatisticFlagBits} bits <b>can</b> be set in the {@code pipelineStatistics} member of the {@link VkQueryPoolCreateInfo} structure. */
    @NativeType("VkBool32")
    public boolean pipelineStatisticsQuery() { return npipelineStatisticsQuery(address()) != 0; }
    /** specifies whether storage buffers and images support stores and atomic operations in the vertex, tessellation, and geometry shader stages. If this feature is not enabled, all storage image, storage texel buffer, and storage buffer variables used by these stages in shader modules <b>must</b> be decorated with the {@code NonWritable} decoration (or the {@code readonly} memory qualifier in GLSL). */
    @NativeType("VkBool32")
    public boolean vertexPipelineStoresAndAtomics() { return nvertexPipelineStoresAndAtomics(address()) != 0; }
    /** specifies whether storage buffers and images support stores and atomic operations in the fragment shader stage. If this feature is not enabled, all storage image, storage texel buffer, and storage buffer variables used by the fragment stage in shader modules <b>must</b> be decorated with the {@code NonWritable} decoration (or the {@code readonly} memory qualifier in GLSL). */
    @NativeType("VkBool32")
    public boolean fragmentStoresAndAtomics() { return nfragmentStoresAndAtomics(address()) != 0; }
    /** specifies whether the {@code PointSize} built-in decoration is available in the tessellation control, tessellation evaluation, and geometry shader stages. If this feature is not enabled, members decorated with the {@code PointSize} built-in decoration <b>must</b> not be read from or written to and all points written from a tessellation or geometry shader will have a size of 1.0. This also specifies whether shader modules <b>can</b> declare the {@code TessellationPointSize} capability for tessellation control and evaluation shaders, or if the shader modules <b>can</b> declare the {@code GeometryPointSize} capability for geometry shaders. An implementation supporting this feature <b>must</b> also support one or both of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-tessellationShader">{@code tessellationShader}</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-geometryShader">{@code geometryShader}</a> features. */
    @NativeType("VkBool32")
    public boolean shaderTessellationAndGeometryPointSize() { return nshaderTessellationAndGeometryPointSize(address()) != 0; }
    /** specifies whether the extended set of image gather instructions are available in shader code. If this feature is not enabled, the {@code OpImage*Gather} instructions do not support the {@code Offset} and {@code ConstOffsets} operands. This also specifies whether shader modules <b>can</b> declare the {@code ImageGatherExtended} capability. */
    @NativeType("VkBool32")
    public boolean shaderImageGatherExtended() { return nshaderImageGatherExtended(address()) != 0; }
    /**
     * specifies whether all the “storage image extended formats” below are supported; if this feature is supported, then the {@link VK10#VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT FORMAT_FEATURE_STORAGE_IMAGE_BIT} <b>must</b> be supported in {@code optimalTilingFeatures} for the following formats:
     * 
     * <ul>
     * <li>{@link VK10#VK_FORMAT_R16G16_SFLOAT FORMAT_R16G16_SFLOAT}</li>
     * <li>{@link VK10#VK_FORMAT_B10G11R11_UFLOAT_PACK32 FORMAT_B10G11R11_UFLOAT_PACK32}</li>
     * <li>{@link VK10#VK_FORMAT_R16_SFLOAT FORMAT_R16_SFLOAT}</li>
     * <li>{@link VK10#VK_FORMAT_R16G16B16A16_UNORM FORMAT_R16G16B16A16_UNORM}</li>
     * <li>{@link VK10#VK_FORMAT_A2B10G10R10_UNORM_PACK32 FORMAT_A2B10G10R10_UNORM_PACK32}</li>
     * <li>{@link VK10#VK_FORMAT_R16G16_UNORM FORMAT_R16G16_UNORM}</li>
     * <li>{@link VK10#VK_FORMAT_R8G8_UNORM FORMAT_R8G8_UNORM}</li>
     * <li>{@link VK10#VK_FORMAT_R16_UNORM FORMAT_R16_UNORM}</li>
     * <li>{@link VK10#VK_FORMAT_R8_UNORM FORMAT_R8_UNORM}</li>
     * <li>{@link VK10#VK_FORMAT_R16G16B16A16_SNORM FORMAT_R16G16B16A16_SNORM}</li>
     * <li>{@link VK10#VK_FORMAT_R16G16_SNORM FORMAT_R16G16_SNORM}</li>
     * <li>{@link VK10#VK_FORMAT_R8G8_SNORM FORMAT_R8G8_SNORM}</li>
     * <li>{@link VK10#VK_FORMAT_R16_SNORM FORMAT_R16_SNORM}</li>
     * <li>{@link VK10#VK_FORMAT_R8_SNORM FORMAT_R8_SNORM}</li>
     * <li>{@link VK10#VK_FORMAT_R16G16_SINT FORMAT_R16G16_SINT}</li>
     * <li>{@link VK10#VK_FORMAT_R8G8_SINT FORMAT_R8G8_SINT}</li>
     * <li>{@link VK10#VK_FORMAT_R16_SINT FORMAT_R16_SINT}</li>
     * <li>{@link VK10#VK_FORMAT_R8_SINT FORMAT_R8_SINT}</li>
     * <li>{@link VK10#VK_FORMAT_A2B10G10R10_UINT_PACK32 FORMAT_A2B10G10R10_UINT_PACK32}</li>
     * <li>{@link VK10#VK_FORMAT_R16G16_UINT FORMAT_R16G16_UINT}</li>
     * <li>{@link VK10#VK_FORMAT_R8G8_UINT FORMAT_R8G8_UINT}</li>
     * <li>{@link VK10#VK_FORMAT_R16_UINT FORMAT_R16_UINT}</li>
     * <li>{@link VK10#VK_FORMAT_R8_UINT FORMAT_R8_UINT}</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>{@code shaderStorageImageExtendedFormats} feature only adds a guarantee of format support, which is specified for the whole physical device. Therefore enabling or disabling the feature via {@link VK10#vkCreateDevice CreateDevice} has no practical effect.</p>
     * 
     * <p>To query for additional properties, or if the feature is not supported, {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} and {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} <b>can</b> be used to check for supported properties of individual formats, as usual rules allow.</p>
     * 
     * <p>{@link VK10#VK_FORMAT_R32G32_UINT FORMAT_R32G32_UINT}, {@link VK10#VK_FORMAT_R32G32_SINT FORMAT_R32G32_SINT}, and {@link VK10#VK_FORMAT_R32G32_SFLOAT FORMAT_R32G32_SFLOAT} from {@code StorageImageExtendedFormats} SPIR-V capability, are already covered by core Vulkan <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-mandatory-features-32bit">mandatory format support</a>.</p>
     * </div>
     */
    @NativeType("VkBool32")
    public boolean shaderStorageImageExtendedFormats() { return nshaderStorageImageExtendedFormats(address()) != 0; }
    /** specifies whether multisampled storage images are supported. If this feature is not enabled, images that are created with a {@code usage} that includes {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT} <b>must</b> be created with {@code samples} equal to {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}. This also specifies whether shader modules <b>can</b> declare the {@code StorageImageMultisample} and {@code ImageMSArray} capabilities. */
    @NativeType("VkBool32")
    public boolean shaderStorageImageMultisample() { return nshaderStorageImageMultisample(address()) != 0; }
    /** specifies whether storage images require a format qualifier to be specified when reading. {@code shaderStorageImageReadWithoutFormat} applies only to formats listed in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-without-shader-storage-format">storage without format</a> list. */
    @NativeType("VkBool32")
    public boolean shaderStorageImageReadWithoutFormat() { return nshaderStorageImageReadWithoutFormat(address()) != 0; }
    /** specifies whether storage images require a format qualifier to be specified when writing. {@code shaderStorageImageWriteWithoutFormat} applies only to formats listed in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-without-shader-storage-format">storage without format</a> list. */
    @NativeType("VkBool32")
    public boolean shaderStorageImageWriteWithoutFormat() { return nshaderStorageImageWriteWithoutFormat(address()) != 0; }
    /** specifies whether arrays of uniform buffers <b>can</b> be indexed by <em>dynamically uniform</em> integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also specifies whether shader modules <b>can</b> declare the {@code UniformBufferArrayDynamicIndexing} capability. */
    @NativeType("VkBool32")
    public boolean shaderUniformBufferArrayDynamicIndexing() { return nshaderUniformBufferArrayDynamicIndexing(address()) != 0; }
    /** specifies whether arrays of samplers or sampled images <b>can</b> be indexed by dynamically uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, or {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE} <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also specifies whether shader modules <b>can</b> declare the {@code SampledImageArrayDynamicIndexing} capability. */
    @NativeType("VkBool32")
    public boolean shaderSampledImageArrayDynamicIndexing() { return nshaderSampledImageArrayDynamicIndexing(address()) != 0; }
    /** specifies whether arrays of storage buffers <b>can</b> be indexed by dynamically uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also specifies whether shader modules <b>can</b> declare the {@code StorageBufferArrayDynamicIndexing} capability. */
    @NativeType("VkBool32")
    public boolean shaderStorageBufferArrayDynamicIndexing() { return nshaderStorageBufferArrayDynamicIndexing(address()) != 0; }
    /** specifies whether arrays of storage images <b>can</b> be indexed by dynamically uniform integer expressions in shader code. If this feature is not enabled, resources with a descriptor type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE} <b>must</b> be indexed only by constant integral expressions when aggregated into arrays in shader code. This also specifies whether shader modules <b>can</b> declare the {@code StorageImageArrayDynamicIndexing} capability. */
    @NativeType("VkBool32")
    public boolean shaderStorageImageArrayDynamicIndexing() { return nshaderStorageImageArrayDynamicIndexing(address()) != 0; }
    /** specifies whether clip distances are supported in shader code. If this feature is not enabled, any members decorated with the {@code ClipDistance} built-in decoration <b>must</b> not be read from or written to in shader modules. This also specifies whether shader modules <b>can</b> declare the {@code ClipDistance} capability. */
    @NativeType("VkBool32")
    public boolean shaderClipDistance() { return nshaderClipDistance(address()) != 0; }
    /** specifies whether cull distances are supported in shader code. If this feature is not enabled, any members decorated with the {@code CullDistance} built-in decoration <b>must</b> not be read from or written to in shader modules. This also specifies whether shader modules <b>can</b> declare the {@code CullDistance} capability. */
    @NativeType("VkBool32")
    public boolean shaderCullDistance() { return nshaderCullDistance(address()) != 0; }
    /** specifies whether 64-bit floats (doubles) are supported in shader code. If this feature is not enabled, 64-bit floating-point types <b>must</b> not be used in shader code. This also specifies whether shader modules <b>can</b> declare the {@code Float64} capability. Declaring and using 64-bit floats is enabled for all storage classes that SPIR-V allows with the {@code Float64} capability. */
    @NativeType("VkBool32")
    public boolean shaderFloat64() { return nshaderFloat64(address()) != 0; }
    /** specifies whether 64-bit integers (signed and unsigned) are supported in shader code. If this feature is not enabled, 64-bit integer types <b>must</b> not be used in shader code. This also specifies whether shader modules <b>can</b> declare the {@code Int64} capability. Declaring and using 64-bit integers is enabled for all storage classes that SPIR-V allows with the {@code Int64} capability. */
    @NativeType("VkBool32")
    public boolean shaderInt64() { return nshaderInt64(address()) != 0; }
    /** specifies whether 16-bit integers (signed and unsigned) are supported in shader code. If this feature is not enabled, 16-bit integer types <b>must</b> not be used in shader code. This also specifies whether shader modules <b>can</b> declare the {@code Int16} capability. However, this only enables a subset of the storage classes that SPIR-V allows for the {@code Int16} SPIR-V capability: Declaring and using 16-bit integers in the {@code Private}, {@code Workgroup} (for non-Block variables), and {@code Function} storage classes is enabled, while declaring them in the interface storage classes (e.g., {@code UniformConstant}, {@code Uniform}, {@code StorageBuffer}, {@code Input}, {@code Output}, and {@code PushConstant}) is not enabled. */
    @NativeType("VkBool32")
    public boolean shaderInt16() { return nshaderInt16(address()) != 0; }
    /** specifies whether image operations that return resource residency information are supported in shader code. If this feature is not enabled, the {@code OpImageSparse*} instructions <b>must</b> not be used in shader code. This also specifies whether shader modules <b>can</b> declare the {@code SparseResidency} capability. The feature requires at least one of the {@code sparseResidency*} features to be supported. */
    @NativeType("VkBool32")
    public boolean shaderResourceResidency() { return nshaderResourceResidency(address()) != 0; }
    /** specifies whether image operations specifying the minimum resource LOD are supported in shader code. If this feature is not enabled, the {@code MinLod} image operand <b>must</b> not be used in shader code. This also specifies whether shader modules <b>can</b> declare the {@code MinLod} capability. */
    @NativeType("VkBool32")
    public boolean shaderResourceMinLod() { return nshaderResourceMinLod(address()) != 0; }
    /** specifies whether resource memory <b>can</b> be managed at opaque sparse block level instead of at the object level. If this feature is not enabled, resource memory <b>must</b> be bound only on a per-object basis using the {@code vkBindBufferMemory} and {@code vkBindImageMemory} commands. In this case, buffers and images <b>must</b> not be created with {@link VK10#VK_BUFFER_CREATE_SPARSE_BINDING_BIT BUFFER_CREATE_SPARSE_BINDING_BIT} and {@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT} set in the {@code flags} member of the {@link VkBufferCreateInfo} and {@link VkImageCreateInfo} structures, respectively. Otherwise resource memory <b>can</b> be managed as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#sparsememory-sparseresourcefeatures">Sparse Resource Features</a>. */
    @NativeType("VkBool32")
    public boolean sparseBinding() { return nsparseBinding(address()) != 0; }
    /** specifies whether the device <b>can</b> access partially resident buffers. If this feature is not enabled, buffers <b>must</b> not be created with {@link VK10#VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT BUFFER_CREATE_SPARSE_RESIDENCY_BIT} set in the {@code flags} member of the {@link VkBufferCreateInfo} structure. */
    @NativeType("VkBool32")
    public boolean sparseResidencyBuffer() { return nsparseResidencyBuffer(address()) != 0; }
    /** specifies whether the device <b>can</b> access partially resident 2D images with 1 sample per pixel. If this feature is not enabled, images with an {@code imageType} of {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} and {@code samples} set to {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT} <b>must</b> not be created with {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} set in the {@code flags} member of the {@link VkImageCreateInfo} structure. */
    @NativeType("VkBool32")
    public boolean sparseResidencyImage2D() { return nsparseResidencyImage2D(address()) != 0; }
    /** specifies whether the device <b>can</b> access partially resident 3D images. If this feature is not enabled, images with an {@code imageType} of {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D} <b>must</b> not be created with {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} set in the {@code flags} member of the {@link VkImageCreateInfo} structure. */
    @NativeType("VkBool32")
    public boolean sparseResidencyImage3D() { return nsparseResidencyImage3D(address()) != 0; }
    /** specifies whether the physical device <b>can</b> access partially resident 2D images with 2 samples per pixel. If this feature is not enabled, images with an {@code imageType} of {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} and {@code samples} set to {@link VK10#VK_SAMPLE_COUNT_2_BIT SAMPLE_COUNT_2_BIT} <b>must</b> not be created with {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} set in the {@code flags} member of the {@link VkImageCreateInfo} structure. */
    @NativeType("VkBool32")
    public boolean sparseResidency2Samples() { return nsparseResidency2Samples(address()) != 0; }
    /** specifies whether the physical device <b>can</b> access partially resident 2D images with 4 samples per pixel. If this feature is not enabled, images with an {@code imageType} of {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} and {@code samples} set to {@link VK10#VK_SAMPLE_COUNT_4_BIT SAMPLE_COUNT_4_BIT} <b>must</b> not be created with {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} set in the {@code flags} member of the {@link VkImageCreateInfo} structure. */
    @NativeType("VkBool32")
    public boolean sparseResidency4Samples() { return nsparseResidency4Samples(address()) != 0; }
    /** specifies whether the physical device <b>can</b> access partially resident 2D images with 8 samples per pixel. If this feature is not enabled, images with an {@code imageType} of {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} and {@code samples} set to {@link VK10#VK_SAMPLE_COUNT_8_BIT SAMPLE_COUNT_8_BIT} <b>must</b> not be created with {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} set in the {@code flags} member of the {@link VkImageCreateInfo} structure. */
    @NativeType("VkBool32")
    public boolean sparseResidency8Samples() { return nsparseResidency8Samples(address()) != 0; }
    /** specifies whether the physical device <b>can</b> access partially resident 2D images with 16 samples per pixel. If this feature is not enabled, images with an {@code imageType} of {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} and {@code samples} set to {@link VK10#VK_SAMPLE_COUNT_16_BIT SAMPLE_COUNT_16_BIT} <b>must</b> not be created with {@link VK10#VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT IMAGE_CREATE_SPARSE_RESIDENCY_BIT} set in the {@code flags} member of the {@link VkImageCreateInfo} structure. */
    @NativeType("VkBool32")
    public boolean sparseResidency16Samples() { return nsparseResidency16Samples(address()) != 0; }
    /** specifies whether the physical device <b>can</b> correctly access data aliased into multiple locations. If this feature is not enabled, the {@link VK10#VK_BUFFER_CREATE_SPARSE_ALIASED_BIT BUFFER_CREATE_SPARSE_ALIASED_BIT} and {@link VK10#VK_IMAGE_CREATE_SPARSE_ALIASED_BIT IMAGE_CREATE_SPARSE_ALIASED_BIT} enum values <b>must</b> not be used in {@code flags} members of the {@link VkBufferCreateInfo} and {@link VkImageCreateInfo} structures, respectively. */
    @NativeType("VkBool32")
    public boolean sparseResidencyAliased() { return nsparseResidencyAliased(address()) != 0; }
    /** specifies whether all pipelines that will be bound to a command buffer during a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-noattachments">subpass which uses no attachments</a> <b>must</b> have the same value for {@link VkPipelineMultisampleStateCreateInfo}{@code ::rasterizationSamples}. If set to {@link VK10#VK_TRUE TRUE}, the implementation supports variable multisample rates in a subpass which uses no attachments. If set to {@link VK10#VK_FALSE FALSE}, then all pipelines bound in such a subpass <b>must</b> have the same multisample rate. This has no effect in situations where a subpass uses any attachments. */
    @NativeType("VkBool32")
    public boolean variableMultisampleRate() { return nvariableMultisampleRate(address()) != 0; }
    /** specifies whether a secondary command buffer <b>may</b> be executed while a query is active. */
    @NativeType("VkBool32")
    public boolean inheritedQueries() { return ninheritedQueries(address()) != 0; }

    /** Sets the specified value to the {@link #robustBufferAccess} field. */
    public VkPhysicalDeviceFeatures robustBufferAccess(@NativeType("VkBool32") boolean value) { nrobustBufferAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #fullDrawIndexUint32} field. */
    public VkPhysicalDeviceFeatures fullDrawIndexUint32(@NativeType("VkBool32") boolean value) { nfullDrawIndexUint32(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #imageCubeArray} field. */
    public VkPhysicalDeviceFeatures imageCubeArray(@NativeType("VkBool32") boolean value) { nimageCubeArray(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #independentBlend} field. */
    public VkPhysicalDeviceFeatures independentBlend(@NativeType("VkBool32") boolean value) { nindependentBlend(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #geometryShader} field. */
    public VkPhysicalDeviceFeatures geometryShader(@NativeType("VkBool32") boolean value) { ngeometryShader(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #tessellationShader} field. */
    public VkPhysicalDeviceFeatures tessellationShader(@NativeType("VkBool32") boolean value) { ntessellationShader(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #sampleRateShading} field. */
    public VkPhysicalDeviceFeatures sampleRateShading(@NativeType("VkBool32") boolean value) { nsampleRateShading(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #dualSrcBlend} field. */
    public VkPhysicalDeviceFeatures dualSrcBlend(@NativeType("VkBool32") boolean value) { ndualSrcBlend(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #logicOp} field. */
    public VkPhysicalDeviceFeatures logicOp(@NativeType("VkBool32") boolean value) { nlogicOp(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #multiDrawIndirect} field. */
    public VkPhysicalDeviceFeatures multiDrawIndirect(@NativeType("VkBool32") boolean value) { nmultiDrawIndirect(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #drawIndirectFirstInstance} field. */
    public VkPhysicalDeviceFeatures drawIndirectFirstInstance(@NativeType("VkBool32") boolean value) { ndrawIndirectFirstInstance(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #depthClamp} field. */
    public VkPhysicalDeviceFeatures depthClamp(@NativeType("VkBool32") boolean value) { ndepthClamp(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #depthBiasClamp} field. */
    public VkPhysicalDeviceFeatures depthBiasClamp(@NativeType("VkBool32") boolean value) { ndepthBiasClamp(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #fillModeNonSolid} field. */
    public VkPhysicalDeviceFeatures fillModeNonSolid(@NativeType("VkBool32") boolean value) { nfillModeNonSolid(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #depthBounds} field. */
    public VkPhysicalDeviceFeatures depthBounds(@NativeType("VkBool32") boolean value) { ndepthBounds(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #wideLines} field. */
    public VkPhysicalDeviceFeatures wideLines(@NativeType("VkBool32") boolean value) { nwideLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #largePoints} field. */
    public VkPhysicalDeviceFeatures largePoints(@NativeType("VkBool32") boolean value) { nlargePoints(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #alphaToOne} field. */
    public VkPhysicalDeviceFeatures alphaToOne(@NativeType("VkBool32") boolean value) { nalphaToOne(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #multiViewport} field. */
    public VkPhysicalDeviceFeatures multiViewport(@NativeType("VkBool32") boolean value) { nmultiViewport(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #samplerAnisotropy} field. */
    public VkPhysicalDeviceFeatures samplerAnisotropy(@NativeType("VkBool32") boolean value) { nsamplerAnisotropy(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #textureCompressionETC2} field. */
    public VkPhysicalDeviceFeatures textureCompressionETC2(@NativeType("VkBool32") boolean value) { ntextureCompressionETC2(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #textureCompressionASTC_LDR} field. */
    public VkPhysicalDeviceFeatures textureCompressionASTC_LDR(@NativeType("VkBool32") boolean value) { ntextureCompressionASTC_LDR(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #textureCompressionBC} field. */
    public VkPhysicalDeviceFeatures textureCompressionBC(@NativeType("VkBool32") boolean value) { ntextureCompressionBC(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #occlusionQueryPrecise} field. */
    public VkPhysicalDeviceFeatures occlusionQueryPrecise(@NativeType("VkBool32") boolean value) { nocclusionQueryPrecise(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #pipelineStatisticsQuery} field. */
    public VkPhysicalDeviceFeatures pipelineStatisticsQuery(@NativeType("VkBool32") boolean value) { npipelineStatisticsQuery(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #vertexPipelineStoresAndAtomics} field. */
    public VkPhysicalDeviceFeatures vertexPipelineStoresAndAtomics(@NativeType("VkBool32") boolean value) { nvertexPipelineStoresAndAtomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #fragmentStoresAndAtomics} field. */
    public VkPhysicalDeviceFeatures fragmentStoresAndAtomics(@NativeType("VkBool32") boolean value) { nfragmentStoresAndAtomics(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderTessellationAndGeometryPointSize} field. */
    public VkPhysicalDeviceFeatures shaderTessellationAndGeometryPointSize(@NativeType("VkBool32") boolean value) { nshaderTessellationAndGeometryPointSize(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderImageGatherExtended} field. */
    public VkPhysicalDeviceFeatures shaderImageGatherExtended(@NativeType("VkBool32") boolean value) { nshaderImageGatherExtended(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderStorageImageExtendedFormats} field. */
    public VkPhysicalDeviceFeatures shaderStorageImageExtendedFormats(@NativeType("VkBool32") boolean value) { nshaderStorageImageExtendedFormats(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderStorageImageMultisample} field. */
    public VkPhysicalDeviceFeatures shaderStorageImageMultisample(@NativeType("VkBool32") boolean value) { nshaderStorageImageMultisample(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderStorageImageReadWithoutFormat} field. */
    public VkPhysicalDeviceFeatures shaderStorageImageReadWithoutFormat(@NativeType("VkBool32") boolean value) { nshaderStorageImageReadWithoutFormat(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderStorageImageWriteWithoutFormat} field. */
    public VkPhysicalDeviceFeatures shaderStorageImageWriteWithoutFormat(@NativeType("VkBool32") boolean value) { nshaderStorageImageWriteWithoutFormat(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderUniformBufferArrayDynamicIndexing} field. */
    public VkPhysicalDeviceFeatures shaderUniformBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderUniformBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderSampledImageArrayDynamicIndexing} field. */
    public VkPhysicalDeviceFeatures shaderSampledImageArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderSampledImageArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderStorageBufferArrayDynamicIndexing} field. */
    public VkPhysicalDeviceFeatures shaderStorageBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderStorageImageArrayDynamicIndexing} field. */
    public VkPhysicalDeviceFeatures shaderStorageImageArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageImageArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderClipDistance} field. */
    public VkPhysicalDeviceFeatures shaderClipDistance(@NativeType("VkBool32") boolean value) { nshaderClipDistance(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderCullDistance} field. */
    public VkPhysicalDeviceFeatures shaderCullDistance(@NativeType("VkBool32") boolean value) { nshaderCullDistance(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderFloat64} field. */
    public VkPhysicalDeviceFeatures shaderFloat64(@NativeType("VkBool32") boolean value) { nshaderFloat64(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderInt64} field. */
    public VkPhysicalDeviceFeatures shaderInt64(@NativeType("VkBool32") boolean value) { nshaderInt64(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderInt16} field. */
    public VkPhysicalDeviceFeatures shaderInt16(@NativeType("VkBool32") boolean value) { nshaderInt16(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderResourceResidency} field. */
    public VkPhysicalDeviceFeatures shaderResourceResidency(@NativeType("VkBool32") boolean value) { nshaderResourceResidency(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderResourceMinLod} field. */
    public VkPhysicalDeviceFeatures shaderResourceMinLod(@NativeType("VkBool32") boolean value) { nshaderResourceMinLod(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #sparseBinding} field. */
    public VkPhysicalDeviceFeatures sparseBinding(@NativeType("VkBool32") boolean value) { nsparseBinding(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #sparseResidencyBuffer} field. */
    public VkPhysicalDeviceFeatures sparseResidencyBuffer(@NativeType("VkBool32") boolean value) { nsparseResidencyBuffer(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #sparseResidencyImage2D} field. */
    public VkPhysicalDeviceFeatures sparseResidencyImage2D(@NativeType("VkBool32") boolean value) { nsparseResidencyImage2D(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #sparseResidencyImage3D} field. */
    public VkPhysicalDeviceFeatures sparseResidencyImage3D(@NativeType("VkBool32") boolean value) { nsparseResidencyImage3D(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #sparseResidency2Samples} field. */
    public VkPhysicalDeviceFeatures sparseResidency2Samples(@NativeType("VkBool32") boolean value) { nsparseResidency2Samples(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #sparseResidency4Samples} field. */
    public VkPhysicalDeviceFeatures sparseResidency4Samples(@NativeType("VkBool32") boolean value) { nsparseResidency4Samples(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #sparseResidency8Samples} field. */
    public VkPhysicalDeviceFeatures sparseResidency8Samples(@NativeType("VkBool32") boolean value) { nsparseResidency8Samples(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #sparseResidency16Samples} field. */
    public VkPhysicalDeviceFeatures sparseResidency16Samples(@NativeType("VkBool32") boolean value) { nsparseResidency16Samples(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #sparseResidencyAliased} field. */
    public VkPhysicalDeviceFeatures sparseResidencyAliased(@NativeType("VkBool32") boolean value) { nsparseResidencyAliased(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #variableMultisampleRate} field. */
    public VkPhysicalDeviceFeatures variableMultisampleRate(@NativeType("VkBool32") boolean value) { nvariableMultisampleRate(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #inheritedQueries} field. */
    public VkPhysicalDeviceFeatures inheritedQueries(@NativeType("VkBool32") boolean value) { ninheritedQueries(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFeatures set(
        boolean robustBufferAccess,
        boolean fullDrawIndexUint32,
        boolean imageCubeArray,
        boolean independentBlend,
        boolean geometryShader,
        boolean tessellationShader,
        boolean sampleRateShading,
        boolean dualSrcBlend,
        boolean logicOp,
        boolean multiDrawIndirect,
        boolean drawIndirectFirstInstance,
        boolean depthClamp,
        boolean depthBiasClamp,
        boolean fillModeNonSolid,
        boolean depthBounds,
        boolean wideLines,
        boolean largePoints,
        boolean alphaToOne,
        boolean multiViewport,
        boolean samplerAnisotropy,
        boolean textureCompressionETC2,
        boolean textureCompressionASTC_LDR,
        boolean textureCompressionBC,
        boolean occlusionQueryPrecise,
        boolean pipelineStatisticsQuery,
        boolean vertexPipelineStoresAndAtomics,
        boolean fragmentStoresAndAtomics,
        boolean shaderTessellationAndGeometryPointSize,
        boolean shaderImageGatherExtended,
        boolean shaderStorageImageExtendedFormats,
        boolean shaderStorageImageMultisample,
        boolean shaderStorageImageReadWithoutFormat,
        boolean shaderStorageImageWriteWithoutFormat,
        boolean shaderUniformBufferArrayDynamicIndexing,
        boolean shaderSampledImageArrayDynamicIndexing,
        boolean shaderStorageBufferArrayDynamicIndexing,
        boolean shaderStorageImageArrayDynamicIndexing,
        boolean shaderClipDistance,
        boolean shaderCullDistance,
        boolean shaderFloat64,
        boolean shaderInt64,
        boolean shaderInt16,
        boolean shaderResourceResidency,
        boolean shaderResourceMinLod,
        boolean sparseBinding,
        boolean sparseResidencyBuffer,
        boolean sparseResidencyImage2D,
        boolean sparseResidencyImage3D,
        boolean sparseResidency2Samples,
        boolean sparseResidency4Samples,
        boolean sparseResidency8Samples,
        boolean sparseResidency16Samples,
        boolean sparseResidencyAliased,
        boolean variableMultisampleRate,
        boolean inheritedQueries
    ) {
        robustBufferAccess(robustBufferAccess);
        fullDrawIndexUint32(fullDrawIndexUint32);
        imageCubeArray(imageCubeArray);
        independentBlend(independentBlend);
        geometryShader(geometryShader);
        tessellationShader(tessellationShader);
        sampleRateShading(sampleRateShading);
        dualSrcBlend(dualSrcBlend);
        logicOp(logicOp);
        multiDrawIndirect(multiDrawIndirect);
        drawIndirectFirstInstance(drawIndirectFirstInstance);
        depthClamp(depthClamp);
        depthBiasClamp(depthBiasClamp);
        fillModeNonSolid(fillModeNonSolid);
        depthBounds(depthBounds);
        wideLines(wideLines);
        largePoints(largePoints);
        alphaToOne(alphaToOne);
        multiViewport(multiViewport);
        samplerAnisotropy(samplerAnisotropy);
        textureCompressionETC2(textureCompressionETC2);
        textureCompressionASTC_LDR(textureCompressionASTC_LDR);
        textureCompressionBC(textureCompressionBC);
        occlusionQueryPrecise(occlusionQueryPrecise);
        pipelineStatisticsQuery(pipelineStatisticsQuery);
        vertexPipelineStoresAndAtomics(vertexPipelineStoresAndAtomics);
        fragmentStoresAndAtomics(fragmentStoresAndAtomics);
        shaderTessellationAndGeometryPointSize(shaderTessellationAndGeometryPointSize);
        shaderImageGatherExtended(shaderImageGatherExtended);
        shaderStorageImageExtendedFormats(shaderStorageImageExtendedFormats);
        shaderStorageImageMultisample(shaderStorageImageMultisample);
        shaderStorageImageReadWithoutFormat(shaderStorageImageReadWithoutFormat);
        shaderStorageImageWriteWithoutFormat(shaderStorageImageWriteWithoutFormat);
        shaderUniformBufferArrayDynamicIndexing(shaderUniformBufferArrayDynamicIndexing);
        shaderSampledImageArrayDynamicIndexing(shaderSampledImageArrayDynamicIndexing);
        shaderStorageBufferArrayDynamicIndexing(shaderStorageBufferArrayDynamicIndexing);
        shaderStorageImageArrayDynamicIndexing(shaderStorageImageArrayDynamicIndexing);
        shaderClipDistance(shaderClipDistance);
        shaderCullDistance(shaderCullDistance);
        shaderFloat64(shaderFloat64);
        shaderInt64(shaderInt64);
        shaderInt16(shaderInt16);
        shaderResourceResidency(shaderResourceResidency);
        shaderResourceMinLod(shaderResourceMinLod);
        sparseBinding(sparseBinding);
        sparseResidencyBuffer(sparseResidencyBuffer);
        sparseResidencyImage2D(sparseResidencyImage2D);
        sparseResidencyImage3D(sparseResidencyImage3D);
        sparseResidency2Samples(sparseResidency2Samples);
        sparseResidency4Samples(sparseResidency4Samples);
        sparseResidency8Samples(sparseResidency8Samples);
        sparseResidency16Samples(sparseResidency16Samples);
        sparseResidencyAliased(sparseResidencyAliased);
        variableMultisampleRate(variableMultisampleRate);
        inheritedQueries(inheritedQueries);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFeatures set(VkPhysicalDeviceFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFeatures malloc() {
        return wrap(VkPhysicalDeviceFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFeatures calloc() {
        return wrap(VkPhysicalDeviceFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceFeatures create(long address) {
        return wrap(VkPhysicalDeviceFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFeatures.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFeatures malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFeatures calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #robustBufferAccess}. */
    public static int nrobustBufferAccess(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.ROBUSTBUFFERACCESS); }
    /** Unsafe version of {@link #fullDrawIndexUint32}. */
    public static int nfullDrawIndexUint32(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.FULLDRAWINDEXUINT32); }
    /** Unsafe version of {@link #imageCubeArray}. */
    public static int nimageCubeArray(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.IMAGECUBEARRAY); }
    /** Unsafe version of {@link #independentBlend}. */
    public static int nindependentBlend(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.INDEPENDENTBLEND); }
    /** Unsafe version of {@link #geometryShader}. */
    public static int ngeometryShader(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.GEOMETRYSHADER); }
    /** Unsafe version of {@link #tessellationShader}. */
    public static int ntessellationShader(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.TESSELLATIONSHADER); }
    /** Unsafe version of {@link #sampleRateShading}. */
    public static int nsampleRateShading(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SAMPLERATESHADING); }
    /** Unsafe version of {@link #dualSrcBlend}. */
    public static int ndualSrcBlend(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.DUALSRCBLEND); }
    /** Unsafe version of {@link #logicOp}. */
    public static int nlogicOp(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.LOGICOP); }
    /** Unsafe version of {@link #multiDrawIndirect}. */
    public static int nmultiDrawIndirect(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.MULTIDRAWINDIRECT); }
    /** Unsafe version of {@link #drawIndirectFirstInstance}. */
    public static int ndrawIndirectFirstInstance(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.DRAWINDIRECTFIRSTINSTANCE); }
    /** Unsafe version of {@link #depthClamp}. */
    public static int ndepthClamp(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.DEPTHCLAMP); }
    /** Unsafe version of {@link #depthBiasClamp}. */
    public static int ndepthBiasClamp(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.DEPTHBIASCLAMP); }
    /** Unsafe version of {@link #fillModeNonSolid}. */
    public static int nfillModeNonSolid(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.FILLMODENONSOLID); }
    /** Unsafe version of {@link #depthBounds}. */
    public static int ndepthBounds(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.DEPTHBOUNDS); }
    /** Unsafe version of {@link #wideLines}. */
    public static int nwideLines(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.WIDELINES); }
    /** Unsafe version of {@link #largePoints}. */
    public static int nlargePoints(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.LARGEPOINTS); }
    /** Unsafe version of {@link #alphaToOne}. */
    public static int nalphaToOne(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.ALPHATOONE); }
    /** Unsafe version of {@link #multiViewport}. */
    public static int nmultiViewport(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.MULTIVIEWPORT); }
    /** Unsafe version of {@link #samplerAnisotropy}. */
    public static int nsamplerAnisotropy(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SAMPLERANISOTROPY); }
    /** Unsafe version of {@link #textureCompressionETC2}. */
    public static int ntextureCompressionETC2(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONETC2); }
    /** Unsafe version of {@link #textureCompressionASTC_LDR}. */
    public static int ntextureCompressionASTC_LDR(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONASTC_LDR); }
    /** Unsafe version of {@link #textureCompressionBC}. */
    public static int ntextureCompressionBC(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONBC); }
    /** Unsafe version of {@link #occlusionQueryPrecise}. */
    public static int nocclusionQueryPrecise(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.OCCLUSIONQUERYPRECISE); }
    /** Unsafe version of {@link #pipelineStatisticsQuery}. */
    public static int npipelineStatisticsQuery(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.PIPELINESTATISTICSQUERY); }
    /** Unsafe version of {@link #vertexPipelineStoresAndAtomics}. */
    public static int nvertexPipelineStoresAndAtomics(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.VERTEXPIPELINESTORESANDATOMICS); }
    /** Unsafe version of {@link #fragmentStoresAndAtomics}. */
    public static int nfragmentStoresAndAtomics(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.FRAGMENTSTORESANDATOMICS); }
    /** Unsafe version of {@link #shaderTessellationAndGeometryPointSize}. */
    public static int nshaderTessellationAndGeometryPointSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SHADERTESSELLATIONANDGEOMETRYPOINTSIZE); }
    /** Unsafe version of {@link #shaderImageGatherExtended}. */
    public static int nshaderImageGatherExtended(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SHADERIMAGEGATHEREXTENDED); }
    /** Unsafe version of {@link #shaderStorageImageExtendedFormats}. */
    public static int nshaderStorageImageExtendedFormats(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEEXTENDEDFORMATS); }
    /** Unsafe version of {@link #shaderStorageImageMultisample}. */
    public static int nshaderStorageImageMultisample(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEMULTISAMPLE); }
    /** Unsafe version of {@link #shaderStorageImageReadWithoutFormat}. */
    public static int nshaderStorageImageReadWithoutFormat(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEREADWITHOUTFORMAT); }
    /** Unsafe version of {@link #shaderStorageImageWriteWithoutFormat}. */
    public static int nshaderStorageImageWriteWithoutFormat(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEWRITEWITHOUTFORMAT); }
    /** Unsafe version of {@link #shaderUniformBufferArrayDynamicIndexing}. */
    public static int nshaderUniformBufferArrayDynamicIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SHADERUNIFORMBUFFERARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderSampledImageArrayDynamicIndexing}. */
    public static int nshaderSampledImageArrayDynamicIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SHADERSAMPLEDIMAGEARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderStorageBufferArrayDynamicIndexing}. */
    public static int nshaderStorageBufferArrayDynamicIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SHADERSTORAGEBUFFERARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderStorageImageArrayDynamicIndexing}. */
    public static int nshaderStorageImageArrayDynamicIndexing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderClipDistance}. */
    public static int nshaderClipDistance(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SHADERCLIPDISTANCE); }
    /** Unsafe version of {@link #shaderCullDistance}. */
    public static int nshaderCullDistance(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SHADERCULLDISTANCE); }
    /** Unsafe version of {@link #shaderFloat64}. */
    public static int nshaderFloat64(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SHADERFLOAT64); }
    /** Unsafe version of {@link #shaderInt64}. */
    public static int nshaderInt64(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SHADERINT64); }
    /** Unsafe version of {@link #shaderInt16}. */
    public static int nshaderInt16(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SHADERINT16); }
    /** Unsafe version of {@link #shaderResourceResidency}. */
    public static int nshaderResourceResidency(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SHADERRESOURCERESIDENCY); }
    /** Unsafe version of {@link #shaderResourceMinLod}. */
    public static int nshaderResourceMinLod(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SHADERRESOURCEMINLOD); }
    /** Unsafe version of {@link #sparseBinding}. */
    public static int nsparseBinding(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SPARSEBINDING); }
    /** Unsafe version of {@link #sparseResidencyBuffer}. */
    public static int nsparseResidencyBuffer(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYBUFFER); }
    /** Unsafe version of {@link #sparseResidencyImage2D}. */
    public static int nsparseResidencyImage2D(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYIMAGE2D); }
    /** Unsafe version of {@link #sparseResidencyImage3D}. */
    public static int nsparseResidencyImage3D(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYIMAGE3D); }
    /** Unsafe version of {@link #sparseResidency2Samples}. */
    public static int nsparseResidency2Samples(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY2SAMPLES); }
    /** Unsafe version of {@link #sparseResidency4Samples}. */
    public static int nsparseResidency4Samples(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY4SAMPLES); }
    /** Unsafe version of {@link #sparseResidency8Samples}. */
    public static int nsparseResidency8Samples(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY8SAMPLES); }
    /** Unsafe version of {@link #sparseResidency16Samples}. */
    public static int nsparseResidency16Samples(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY16SAMPLES); }
    /** Unsafe version of {@link #sparseResidencyAliased}. */
    public static int nsparseResidencyAliased(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYALIASED); }
    /** Unsafe version of {@link #variableMultisampleRate}. */
    public static int nvariableMultisampleRate(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.VARIABLEMULTISAMPLERATE); }
    /** Unsafe version of {@link #inheritedQueries}. */
    public static int ninheritedQueries(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures.INHERITEDQUERIES); }

    /** Unsafe version of {@link #robustBufferAccess(boolean) robustBufferAccess}. */
    public static void nrobustBufferAccess(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.ROBUSTBUFFERACCESS, value); }
    /** Unsafe version of {@link #fullDrawIndexUint32(boolean) fullDrawIndexUint32}. */
    public static void nfullDrawIndexUint32(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.FULLDRAWINDEXUINT32, value); }
    /** Unsafe version of {@link #imageCubeArray(boolean) imageCubeArray}. */
    public static void nimageCubeArray(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.IMAGECUBEARRAY, value); }
    /** Unsafe version of {@link #independentBlend(boolean) independentBlend}. */
    public static void nindependentBlend(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.INDEPENDENTBLEND, value); }
    /** Unsafe version of {@link #geometryShader(boolean) geometryShader}. */
    public static void ngeometryShader(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.GEOMETRYSHADER, value); }
    /** Unsafe version of {@link #tessellationShader(boolean) tessellationShader}. */
    public static void ntessellationShader(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.TESSELLATIONSHADER, value); }
    /** Unsafe version of {@link #sampleRateShading(boolean) sampleRateShading}. */
    public static void nsampleRateShading(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SAMPLERATESHADING, value); }
    /** Unsafe version of {@link #dualSrcBlend(boolean) dualSrcBlend}. */
    public static void ndualSrcBlend(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.DUALSRCBLEND, value); }
    /** Unsafe version of {@link #logicOp(boolean) logicOp}. */
    public static void nlogicOp(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.LOGICOP, value); }
    /** Unsafe version of {@link #multiDrawIndirect(boolean) multiDrawIndirect}. */
    public static void nmultiDrawIndirect(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.MULTIDRAWINDIRECT, value); }
    /** Unsafe version of {@link #drawIndirectFirstInstance(boolean) drawIndirectFirstInstance}. */
    public static void ndrawIndirectFirstInstance(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.DRAWINDIRECTFIRSTINSTANCE, value); }
    /** Unsafe version of {@link #depthClamp(boolean) depthClamp}. */
    public static void ndepthClamp(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.DEPTHCLAMP, value); }
    /** Unsafe version of {@link #depthBiasClamp(boolean) depthBiasClamp}. */
    public static void ndepthBiasClamp(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.DEPTHBIASCLAMP, value); }
    /** Unsafe version of {@link #fillModeNonSolid(boolean) fillModeNonSolid}. */
    public static void nfillModeNonSolid(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.FILLMODENONSOLID, value); }
    /** Unsafe version of {@link #depthBounds(boolean) depthBounds}. */
    public static void ndepthBounds(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.DEPTHBOUNDS, value); }
    /** Unsafe version of {@link #wideLines(boolean) wideLines}. */
    public static void nwideLines(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.WIDELINES, value); }
    /** Unsafe version of {@link #largePoints(boolean) largePoints}. */
    public static void nlargePoints(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.LARGEPOINTS, value); }
    /** Unsafe version of {@link #alphaToOne(boolean) alphaToOne}. */
    public static void nalphaToOne(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.ALPHATOONE, value); }
    /** Unsafe version of {@link #multiViewport(boolean) multiViewport}. */
    public static void nmultiViewport(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.MULTIVIEWPORT, value); }
    /** Unsafe version of {@link #samplerAnisotropy(boolean) samplerAnisotropy}. */
    public static void nsamplerAnisotropy(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SAMPLERANISOTROPY, value); }
    /** Unsafe version of {@link #textureCompressionETC2(boolean) textureCompressionETC2}. */
    public static void ntextureCompressionETC2(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONETC2, value); }
    /** Unsafe version of {@link #textureCompressionASTC_LDR(boolean) textureCompressionASTC_LDR}. */
    public static void ntextureCompressionASTC_LDR(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONASTC_LDR, value); }
    /** Unsafe version of {@link #textureCompressionBC(boolean) textureCompressionBC}. */
    public static void ntextureCompressionBC(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.TEXTURECOMPRESSIONBC, value); }
    /** Unsafe version of {@link #occlusionQueryPrecise(boolean) occlusionQueryPrecise}. */
    public static void nocclusionQueryPrecise(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.OCCLUSIONQUERYPRECISE, value); }
    /** Unsafe version of {@link #pipelineStatisticsQuery(boolean) pipelineStatisticsQuery}. */
    public static void npipelineStatisticsQuery(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.PIPELINESTATISTICSQUERY, value); }
    /** Unsafe version of {@link #vertexPipelineStoresAndAtomics(boolean) vertexPipelineStoresAndAtomics}. */
    public static void nvertexPipelineStoresAndAtomics(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.VERTEXPIPELINESTORESANDATOMICS, value); }
    /** Unsafe version of {@link #fragmentStoresAndAtomics(boolean) fragmentStoresAndAtomics}. */
    public static void nfragmentStoresAndAtomics(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.FRAGMENTSTORESANDATOMICS, value); }
    /** Unsafe version of {@link #shaderTessellationAndGeometryPointSize(boolean) shaderTessellationAndGeometryPointSize}. */
    public static void nshaderTessellationAndGeometryPointSize(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SHADERTESSELLATIONANDGEOMETRYPOINTSIZE, value); }
    /** Unsafe version of {@link #shaderImageGatherExtended(boolean) shaderImageGatherExtended}. */
    public static void nshaderImageGatherExtended(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SHADERIMAGEGATHEREXTENDED, value); }
    /** Unsafe version of {@link #shaderStorageImageExtendedFormats(boolean) shaderStorageImageExtendedFormats}. */
    public static void nshaderStorageImageExtendedFormats(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEEXTENDEDFORMATS, value); }
    /** Unsafe version of {@link #shaderStorageImageMultisample(boolean) shaderStorageImageMultisample}. */
    public static void nshaderStorageImageMultisample(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEMULTISAMPLE, value); }
    /** Unsafe version of {@link #shaderStorageImageReadWithoutFormat(boolean) shaderStorageImageReadWithoutFormat}. */
    public static void nshaderStorageImageReadWithoutFormat(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEREADWITHOUTFORMAT, value); }
    /** Unsafe version of {@link #shaderStorageImageWriteWithoutFormat(boolean) shaderStorageImageWriteWithoutFormat}. */
    public static void nshaderStorageImageWriteWithoutFormat(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEWRITEWITHOUTFORMAT, value); }
    /** Unsafe version of {@link #shaderUniformBufferArrayDynamicIndexing(boolean) shaderUniformBufferArrayDynamicIndexing}. */
    public static void nshaderUniformBufferArrayDynamicIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SHADERUNIFORMBUFFERARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderSampledImageArrayDynamicIndexing(boolean) shaderSampledImageArrayDynamicIndexing}. */
    public static void nshaderSampledImageArrayDynamicIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SHADERSAMPLEDIMAGEARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageBufferArrayDynamicIndexing(boolean) shaderStorageBufferArrayDynamicIndexing}. */
    public static void nshaderStorageBufferArrayDynamicIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SHADERSTORAGEBUFFERARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageImageArrayDynamicIndexing(boolean) shaderStorageImageArrayDynamicIndexing}. */
    public static void nshaderStorageImageArrayDynamicIndexing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SHADERSTORAGEIMAGEARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderClipDistance(boolean) shaderClipDistance}. */
    public static void nshaderClipDistance(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SHADERCLIPDISTANCE, value); }
    /** Unsafe version of {@link #shaderCullDistance(boolean) shaderCullDistance}. */
    public static void nshaderCullDistance(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SHADERCULLDISTANCE, value); }
    /** Unsafe version of {@link #shaderFloat64(boolean) shaderFloat64}. */
    public static void nshaderFloat64(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SHADERFLOAT64, value); }
    /** Unsafe version of {@link #shaderInt64(boolean) shaderInt64}. */
    public static void nshaderInt64(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SHADERINT64, value); }
    /** Unsafe version of {@link #shaderInt16(boolean) shaderInt16}. */
    public static void nshaderInt16(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SHADERINT16, value); }
    /** Unsafe version of {@link #shaderResourceResidency(boolean) shaderResourceResidency}. */
    public static void nshaderResourceResidency(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SHADERRESOURCERESIDENCY, value); }
    /** Unsafe version of {@link #shaderResourceMinLod(boolean) shaderResourceMinLod}. */
    public static void nshaderResourceMinLod(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SHADERRESOURCEMINLOD, value); }
    /** Unsafe version of {@link #sparseBinding(boolean) sparseBinding}. */
    public static void nsparseBinding(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SPARSEBINDING, value); }
    /** Unsafe version of {@link #sparseResidencyBuffer(boolean) sparseResidencyBuffer}. */
    public static void nsparseResidencyBuffer(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYBUFFER, value); }
    /** Unsafe version of {@link #sparseResidencyImage2D(boolean) sparseResidencyImage2D}. */
    public static void nsparseResidencyImage2D(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYIMAGE2D, value); }
    /** Unsafe version of {@link #sparseResidencyImage3D(boolean) sparseResidencyImage3D}. */
    public static void nsparseResidencyImage3D(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYIMAGE3D, value); }
    /** Unsafe version of {@link #sparseResidency2Samples(boolean) sparseResidency2Samples}. */
    public static void nsparseResidency2Samples(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY2SAMPLES, value); }
    /** Unsafe version of {@link #sparseResidency4Samples(boolean) sparseResidency4Samples}. */
    public static void nsparseResidency4Samples(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY4SAMPLES, value); }
    /** Unsafe version of {@link #sparseResidency8Samples(boolean) sparseResidency8Samples}. */
    public static void nsparseResidency8Samples(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY8SAMPLES, value); }
    /** Unsafe version of {@link #sparseResidency16Samples(boolean) sparseResidency16Samples}. */
    public static void nsparseResidency16Samples(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SPARSERESIDENCY16SAMPLES, value); }
    /** Unsafe version of {@link #sparseResidencyAliased(boolean) sparseResidencyAliased}. */
    public static void nsparseResidencyAliased(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.SPARSERESIDENCYALIASED, value); }
    /** Unsafe version of {@link #variableMultisampleRate(boolean) variableMultisampleRate}. */
    public static void nvariableMultisampleRate(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.VARIABLEMULTISAMPLERATE, value); }
    /** Unsafe version of {@link #inheritedQueries(boolean) inheritedQueries}. */
    public static void ninheritedQueries(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures.INHERITEDQUERIES, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFeatures ELEMENT_FACTORY = VkPhysicalDeviceFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFeatures#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkPhysicalDeviceFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceFeatures#robustBufferAccess} field. */
        @NativeType("VkBool32")
        public boolean robustBufferAccess() { return VkPhysicalDeviceFeatures.nrobustBufferAccess(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#fullDrawIndexUint32} field. */
        @NativeType("VkBool32")
        public boolean fullDrawIndexUint32() { return VkPhysicalDeviceFeatures.nfullDrawIndexUint32(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#imageCubeArray} field. */
        @NativeType("VkBool32")
        public boolean imageCubeArray() { return VkPhysicalDeviceFeatures.nimageCubeArray(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#independentBlend} field. */
        @NativeType("VkBool32")
        public boolean independentBlend() { return VkPhysicalDeviceFeatures.nindependentBlend(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#geometryShader} field. */
        @NativeType("VkBool32")
        public boolean geometryShader() { return VkPhysicalDeviceFeatures.ngeometryShader(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#tessellationShader} field. */
        @NativeType("VkBool32")
        public boolean tessellationShader() { return VkPhysicalDeviceFeatures.ntessellationShader(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#sampleRateShading} field. */
        @NativeType("VkBool32")
        public boolean sampleRateShading() { return VkPhysicalDeviceFeatures.nsampleRateShading(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#dualSrcBlend} field. */
        @NativeType("VkBool32")
        public boolean dualSrcBlend() { return VkPhysicalDeviceFeatures.ndualSrcBlend(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#logicOp} field. */
        @NativeType("VkBool32")
        public boolean logicOp() { return VkPhysicalDeviceFeatures.nlogicOp(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#multiDrawIndirect} field. */
        @NativeType("VkBool32")
        public boolean multiDrawIndirect() { return VkPhysicalDeviceFeatures.nmultiDrawIndirect(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#drawIndirectFirstInstance} field. */
        @NativeType("VkBool32")
        public boolean drawIndirectFirstInstance() { return VkPhysicalDeviceFeatures.ndrawIndirectFirstInstance(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#depthClamp} field. */
        @NativeType("VkBool32")
        public boolean depthClamp() { return VkPhysicalDeviceFeatures.ndepthClamp(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#depthBiasClamp} field. */
        @NativeType("VkBool32")
        public boolean depthBiasClamp() { return VkPhysicalDeviceFeatures.ndepthBiasClamp(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#fillModeNonSolid} field. */
        @NativeType("VkBool32")
        public boolean fillModeNonSolid() { return VkPhysicalDeviceFeatures.nfillModeNonSolid(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#depthBounds} field. */
        @NativeType("VkBool32")
        public boolean depthBounds() { return VkPhysicalDeviceFeatures.ndepthBounds(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#wideLines} field. */
        @NativeType("VkBool32")
        public boolean wideLines() { return VkPhysicalDeviceFeatures.nwideLines(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#largePoints} field. */
        @NativeType("VkBool32")
        public boolean largePoints() { return VkPhysicalDeviceFeatures.nlargePoints(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#alphaToOne} field. */
        @NativeType("VkBool32")
        public boolean alphaToOne() { return VkPhysicalDeviceFeatures.nalphaToOne(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#multiViewport} field. */
        @NativeType("VkBool32")
        public boolean multiViewport() { return VkPhysicalDeviceFeatures.nmultiViewport(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#samplerAnisotropy} field. */
        @NativeType("VkBool32")
        public boolean samplerAnisotropy() { return VkPhysicalDeviceFeatures.nsamplerAnisotropy(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#textureCompressionETC2} field. */
        @NativeType("VkBool32")
        public boolean textureCompressionETC2() { return VkPhysicalDeviceFeatures.ntextureCompressionETC2(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#textureCompressionASTC_LDR} field. */
        @NativeType("VkBool32")
        public boolean textureCompressionASTC_LDR() { return VkPhysicalDeviceFeatures.ntextureCompressionASTC_LDR(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#textureCompressionBC} field. */
        @NativeType("VkBool32")
        public boolean textureCompressionBC() { return VkPhysicalDeviceFeatures.ntextureCompressionBC(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#occlusionQueryPrecise} field. */
        @NativeType("VkBool32")
        public boolean occlusionQueryPrecise() { return VkPhysicalDeviceFeatures.nocclusionQueryPrecise(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#pipelineStatisticsQuery} field. */
        @NativeType("VkBool32")
        public boolean pipelineStatisticsQuery() { return VkPhysicalDeviceFeatures.npipelineStatisticsQuery(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#vertexPipelineStoresAndAtomics} field. */
        @NativeType("VkBool32")
        public boolean vertexPipelineStoresAndAtomics() { return VkPhysicalDeviceFeatures.nvertexPipelineStoresAndAtomics(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#fragmentStoresAndAtomics} field. */
        @NativeType("VkBool32")
        public boolean fragmentStoresAndAtomics() { return VkPhysicalDeviceFeatures.nfragmentStoresAndAtomics(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#shaderTessellationAndGeometryPointSize} field. */
        @NativeType("VkBool32")
        public boolean shaderTessellationAndGeometryPointSize() { return VkPhysicalDeviceFeatures.nshaderTessellationAndGeometryPointSize(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#shaderImageGatherExtended} field. */
        @NativeType("VkBool32")
        public boolean shaderImageGatherExtended() { return VkPhysicalDeviceFeatures.nshaderImageGatherExtended(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#shaderStorageImageExtendedFormats} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageImageExtendedFormats() { return VkPhysicalDeviceFeatures.nshaderStorageImageExtendedFormats(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#shaderStorageImageMultisample} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageImageMultisample() { return VkPhysicalDeviceFeatures.nshaderStorageImageMultisample(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#shaderStorageImageReadWithoutFormat} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageImageReadWithoutFormat() { return VkPhysicalDeviceFeatures.nshaderStorageImageReadWithoutFormat(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#shaderStorageImageWriteWithoutFormat} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageImageWriteWithoutFormat() { return VkPhysicalDeviceFeatures.nshaderStorageImageWriteWithoutFormat(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#shaderUniformBufferArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderUniformBufferArrayDynamicIndexing() { return VkPhysicalDeviceFeatures.nshaderUniformBufferArrayDynamicIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#shaderSampledImageArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderSampledImageArrayDynamicIndexing() { return VkPhysicalDeviceFeatures.nshaderSampledImageArrayDynamicIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#shaderStorageBufferArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageBufferArrayDynamicIndexing() { return VkPhysicalDeviceFeatures.nshaderStorageBufferArrayDynamicIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#shaderStorageImageArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageImageArrayDynamicIndexing() { return VkPhysicalDeviceFeatures.nshaderStorageImageArrayDynamicIndexing(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#shaderClipDistance} field. */
        @NativeType("VkBool32")
        public boolean shaderClipDistance() { return VkPhysicalDeviceFeatures.nshaderClipDistance(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#shaderCullDistance} field. */
        @NativeType("VkBool32")
        public boolean shaderCullDistance() { return VkPhysicalDeviceFeatures.nshaderCullDistance(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#shaderFloat64} field. */
        @NativeType("VkBool32")
        public boolean shaderFloat64() { return VkPhysicalDeviceFeatures.nshaderFloat64(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#shaderInt64} field. */
        @NativeType("VkBool32")
        public boolean shaderInt64() { return VkPhysicalDeviceFeatures.nshaderInt64(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#shaderInt16} field. */
        @NativeType("VkBool32")
        public boolean shaderInt16() { return VkPhysicalDeviceFeatures.nshaderInt16(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#shaderResourceResidency} field. */
        @NativeType("VkBool32")
        public boolean shaderResourceResidency() { return VkPhysicalDeviceFeatures.nshaderResourceResidency(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#shaderResourceMinLod} field. */
        @NativeType("VkBool32")
        public boolean shaderResourceMinLod() { return VkPhysicalDeviceFeatures.nshaderResourceMinLod(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#sparseBinding} field. */
        @NativeType("VkBool32")
        public boolean sparseBinding() { return VkPhysicalDeviceFeatures.nsparseBinding(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#sparseResidencyBuffer} field. */
        @NativeType("VkBool32")
        public boolean sparseResidencyBuffer() { return VkPhysicalDeviceFeatures.nsparseResidencyBuffer(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#sparseResidencyImage2D} field. */
        @NativeType("VkBool32")
        public boolean sparseResidencyImage2D() { return VkPhysicalDeviceFeatures.nsparseResidencyImage2D(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#sparseResidencyImage3D} field. */
        @NativeType("VkBool32")
        public boolean sparseResidencyImage3D() { return VkPhysicalDeviceFeatures.nsparseResidencyImage3D(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#sparseResidency2Samples} field. */
        @NativeType("VkBool32")
        public boolean sparseResidency2Samples() { return VkPhysicalDeviceFeatures.nsparseResidency2Samples(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#sparseResidency4Samples} field. */
        @NativeType("VkBool32")
        public boolean sparseResidency4Samples() { return VkPhysicalDeviceFeatures.nsparseResidency4Samples(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#sparseResidency8Samples} field. */
        @NativeType("VkBool32")
        public boolean sparseResidency8Samples() { return VkPhysicalDeviceFeatures.nsparseResidency8Samples(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#sparseResidency16Samples} field. */
        @NativeType("VkBool32")
        public boolean sparseResidency16Samples() { return VkPhysicalDeviceFeatures.nsparseResidency16Samples(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#sparseResidencyAliased} field. */
        @NativeType("VkBool32")
        public boolean sparseResidencyAliased() { return VkPhysicalDeviceFeatures.nsparseResidencyAliased(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#variableMultisampleRate} field. */
        @NativeType("VkBool32")
        public boolean variableMultisampleRate() { return VkPhysicalDeviceFeatures.nvariableMultisampleRate(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFeatures#inheritedQueries} field. */
        @NativeType("VkBool32")
        public boolean inheritedQueries() { return VkPhysicalDeviceFeatures.ninheritedQueries(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#robustBufferAccess} field. */
        public VkPhysicalDeviceFeatures.Buffer robustBufferAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nrobustBufferAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#fullDrawIndexUint32} field. */
        public VkPhysicalDeviceFeatures.Buffer fullDrawIndexUint32(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nfullDrawIndexUint32(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#imageCubeArray} field. */
        public VkPhysicalDeviceFeatures.Buffer imageCubeArray(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nimageCubeArray(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#independentBlend} field. */
        public VkPhysicalDeviceFeatures.Buffer independentBlend(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nindependentBlend(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#geometryShader} field. */
        public VkPhysicalDeviceFeatures.Buffer geometryShader(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ngeometryShader(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#tessellationShader} field. */
        public VkPhysicalDeviceFeatures.Buffer tessellationShader(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ntessellationShader(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#sampleRateShading} field. */
        public VkPhysicalDeviceFeatures.Buffer sampleRateShading(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsampleRateShading(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#dualSrcBlend} field. */
        public VkPhysicalDeviceFeatures.Buffer dualSrcBlend(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ndualSrcBlend(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#logicOp} field. */
        public VkPhysicalDeviceFeatures.Buffer logicOp(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nlogicOp(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#multiDrawIndirect} field. */
        public VkPhysicalDeviceFeatures.Buffer multiDrawIndirect(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nmultiDrawIndirect(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#drawIndirectFirstInstance} field. */
        public VkPhysicalDeviceFeatures.Buffer drawIndirectFirstInstance(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ndrawIndirectFirstInstance(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#depthClamp} field. */
        public VkPhysicalDeviceFeatures.Buffer depthClamp(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ndepthClamp(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#depthBiasClamp} field. */
        public VkPhysicalDeviceFeatures.Buffer depthBiasClamp(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ndepthBiasClamp(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#fillModeNonSolid} field. */
        public VkPhysicalDeviceFeatures.Buffer fillModeNonSolid(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nfillModeNonSolid(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#depthBounds} field. */
        public VkPhysicalDeviceFeatures.Buffer depthBounds(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ndepthBounds(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#wideLines} field. */
        public VkPhysicalDeviceFeatures.Buffer wideLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nwideLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#largePoints} field. */
        public VkPhysicalDeviceFeatures.Buffer largePoints(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nlargePoints(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#alphaToOne} field. */
        public VkPhysicalDeviceFeatures.Buffer alphaToOne(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nalphaToOne(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#multiViewport} field. */
        public VkPhysicalDeviceFeatures.Buffer multiViewport(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nmultiViewport(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#samplerAnisotropy} field. */
        public VkPhysicalDeviceFeatures.Buffer samplerAnisotropy(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsamplerAnisotropy(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#textureCompressionETC2} field. */
        public VkPhysicalDeviceFeatures.Buffer textureCompressionETC2(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ntextureCompressionETC2(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#textureCompressionASTC_LDR} field. */
        public VkPhysicalDeviceFeatures.Buffer textureCompressionASTC_LDR(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ntextureCompressionASTC_LDR(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#textureCompressionBC} field. */
        public VkPhysicalDeviceFeatures.Buffer textureCompressionBC(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ntextureCompressionBC(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#occlusionQueryPrecise} field. */
        public VkPhysicalDeviceFeatures.Buffer occlusionQueryPrecise(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nocclusionQueryPrecise(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#pipelineStatisticsQuery} field. */
        public VkPhysicalDeviceFeatures.Buffer pipelineStatisticsQuery(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.npipelineStatisticsQuery(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#vertexPipelineStoresAndAtomics} field. */
        public VkPhysicalDeviceFeatures.Buffer vertexPipelineStoresAndAtomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nvertexPipelineStoresAndAtomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#fragmentStoresAndAtomics} field. */
        public VkPhysicalDeviceFeatures.Buffer fragmentStoresAndAtomics(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nfragmentStoresAndAtomics(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#shaderTessellationAndGeometryPointSize} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderTessellationAndGeometryPointSize(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderTessellationAndGeometryPointSize(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#shaderImageGatherExtended} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderImageGatherExtended(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderImageGatherExtended(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#shaderStorageImageExtendedFormats} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderStorageImageExtendedFormats(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderStorageImageExtendedFormats(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#shaderStorageImageMultisample} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderStorageImageMultisample(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderStorageImageMultisample(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#shaderStorageImageReadWithoutFormat} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderStorageImageReadWithoutFormat(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderStorageImageReadWithoutFormat(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#shaderStorageImageWriteWithoutFormat} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderStorageImageWriteWithoutFormat(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderStorageImageWriteWithoutFormat(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#shaderUniformBufferArrayDynamicIndexing} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderUniformBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderUniformBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#shaderSampledImageArrayDynamicIndexing} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderSampledImageArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderSampledImageArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#shaderStorageBufferArrayDynamicIndexing} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderStorageBufferArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderStorageBufferArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#shaderStorageImageArrayDynamicIndexing} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderStorageImageArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderStorageImageArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#shaderClipDistance} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderClipDistance(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderClipDistance(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#shaderCullDistance} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderCullDistance(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderCullDistance(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#shaderFloat64} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderFloat64(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderFloat64(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#shaderInt64} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderInt64(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderInt64(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#shaderInt16} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderInt16(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderInt16(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#shaderResourceResidency} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderResourceResidency(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderResourceResidency(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#shaderResourceMinLod} field. */
        public VkPhysicalDeviceFeatures.Buffer shaderResourceMinLod(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nshaderResourceMinLod(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#sparseBinding} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseBinding(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseBinding(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#sparseResidencyBuffer} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidencyBuffer(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidencyBuffer(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#sparseResidencyImage2D} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidencyImage2D(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidencyImage2D(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#sparseResidencyImage3D} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidencyImage3D(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidencyImage3D(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#sparseResidency2Samples} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidency2Samples(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidency2Samples(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#sparseResidency4Samples} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidency4Samples(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidency4Samples(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#sparseResidency8Samples} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidency8Samples(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidency8Samples(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#sparseResidency16Samples} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidency16Samples(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidency16Samples(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#sparseResidencyAliased} field. */
        public VkPhysicalDeviceFeatures.Buffer sparseResidencyAliased(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nsparseResidencyAliased(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#variableMultisampleRate} field. */
        public VkPhysicalDeviceFeatures.Buffer variableMultisampleRate(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.nvariableMultisampleRate(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFeatures#inheritedQueries} field. */
        public VkPhysicalDeviceFeatures.Buffer inheritedQueries(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFeatures.ninheritedQueries(address(), value ? 1 : 0); return this; }

    }

}
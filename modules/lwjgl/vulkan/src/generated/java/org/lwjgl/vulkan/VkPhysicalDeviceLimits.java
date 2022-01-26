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
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure reporting implementation-dependent physical device limits.
 * 
 * <h5>Description</h5>
 * 
 * <dl>
 * <dt>1</dt>
 * <dd>For all bitmasks of {@code VkSampleCountFlagBits}, the sample count limits defined above represent the minimum supported sample counts for each image type. Individual images <b>may</b> support additional sample counts, which are queried using {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-supported-sample-counts">Supported Sample Counts</a>.</dd>
 * </dl>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPhysicalDeviceProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceLimits {
 *     uint32_t {@link #maxImageDimension1D};
 *     uint32_t {@link #maxImageDimension2D};
 *     uint32_t {@link #maxImageDimension3D};
 *     uint32_t {@link #maxImageDimensionCube};
 *     uint32_t {@link #maxImageArrayLayers};
 *     uint32_t {@link #maxTexelBufferElements};
 *     uint32_t {@link #maxUniformBufferRange};
 *     uint32_t {@link #maxStorageBufferRange};
 *     uint32_t {@link #maxPushConstantsSize};
 *     uint32_t {@link #maxMemoryAllocationCount};
 *     uint32_t {@link #maxSamplerAllocationCount};
 *     VkDeviceSize {@link #bufferImageGranularity};
 *     VkDeviceSize {@link #sparseAddressSpaceSize};
 *     uint32_t {@link #maxBoundDescriptorSets};
 *     uint32_t {@link #maxPerStageDescriptorSamplers};
 *     uint32_t {@link #maxPerStageDescriptorUniformBuffers};
 *     uint32_t {@link #maxPerStageDescriptorStorageBuffers};
 *     uint32_t {@link #maxPerStageDescriptorSampledImages};
 *     uint32_t {@link #maxPerStageDescriptorStorageImages};
 *     uint32_t {@link #maxPerStageDescriptorInputAttachments};
 *     uint32_t {@link #maxPerStageResources};
 *     uint32_t {@link #maxDescriptorSetSamplers};
 *     uint32_t {@link #maxDescriptorSetUniformBuffers};
 *     uint32_t {@link #maxDescriptorSetUniformBuffersDynamic};
 *     uint32_t {@link #maxDescriptorSetStorageBuffers};
 *     uint32_t {@link #maxDescriptorSetStorageBuffersDynamic};
 *     uint32_t {@link #maxDescriptorSetSampledImages};
 *     uint32_t {@link #maxDescriptorSetStorageImages};
 *     uint32_t {@link #maxDescriptorSetInputAttachments};
 *     uint32_t {@link #maxVertexInputAttributes};
 *     uint32_t {@link #maxVertexInputBindings};
 *     uint32_t {@link #maxVertexInputAttributeOffset};
 *     uint32_t {@link #maxVertexInputBindingStride};
 *     uint32_t {@link #maxVertexOutputComponents};
 *     uint32_t {@link #maxTessellationGenerationLevel};
 *     uint32_t {@link #maxTessellationPatchSize};
 *     uint32_t {@link #maxTessellationControlPerVertexInputComponents};
 *     uint32_t {@link #maxTessellationControlPerVertexOutputComponents};
 *     uint32_t {@link #maxTessellationControlPerPatchOutputComponents};
 *     uint32_t {@link #maxTessellationControlTotalOutputComponents};
 *     uint32_t {@link #maxTessellationEvaluationInputComponents};
 *     uint32_t {@link #maxTessellationEvaluationOutputComponents};
 *     uint32_t {@link #maxGeometryShaderInvocations};
 *     uint32_t {@link #maxGeometryInputComponents};
 *     uint32_t {@link #maxGeometryOutputComponents};
 *     uint32_t {@link #maxGeometryOutputVertices};
 *     uint32_t {@link #maxGeometryTotalOutputComponents};
 *     uint32_t {@link #maxFragmentInputComponents};
 *     uint32_t {@link #maxFragmentOutputAttachments};
 *     uint32_t {@link #maxFragmentDualSrcAttachments};
 *     uint32_t {@link #maxFragmentCombinedOutputResources};
 *     uint32_t {@link #maxComputeSharedMemorySize};
 *     uint32_t {@link #maxComputeWorkGroupCount}[3];
 *     uint32_t {@link #maxComputeWorkGroupInvocations};
 *     uint32_t {@link #maxComputeWorkGroupSize}[3];
 *     uint32_t {@link #subPixelPrecisionBits};
 *     uint32_t {@link #subTexelPrecisionBits};
 *     uint32_t {@link #mipmapPrecisionBits};
 *     uint32_t {@link #maxDrawIndexedIndexValue};
 *     uint32_t {@link #maxDrawIndirectCount};
 *     float {@link #maxSamplerLodBias};
 *     float {@link #maxSamplerAnisotropy};
 *     uint32_t {@link #maxViewports};
 *     uint32_t {@link #maxViewportDimensions}[2];
 *     float {@link #viewportBoundsRange}[2];
 *     uint32_t {@link #viewportSubPixelBits};
 *     size_t {@link #minMemoryMapAlignment};
 *     VkDeviceSize {@link #minTexelBufferOffsetAlignment};
 *     VkDeviceSize {@link #minUniformBufferOffsetAlignment};
 *     VkDeviceSize {@link #minStorageBufferOffsetAlignment};
 *     int32_t {@link #minTexelOffset};
 *     uint32_t {@link #maxTexelOffset};
 *     int32_t {@link #minTexelGatherOffset};
 *     uint32_t {@link #maxTexelGatherOffset};
 *     float {@link #minInterpolationOffset};
 *     float {@link #maxInterpolationOffset};
 *     uint32_t {@link #subPixelInterpolationOffsetBits};
 *     uint32_t {@link #maxFramebufferWidth};
 *     uint32_t {@link #maxFramebufferHeight};
 *     uint32_t {@link #maxFramebufferLayers};
 *     VkSampleCountFlags {@link #framebufferColorSampleCounts};
 *     VkSampleCountFlags {@link #framebufferDepthSampleCounts};
 *     VkSampleCountFlags {@link #framebufferStencilSampleCounts};
 *     VkSampleCountFlags {@link #framebufferNoAttachmentsSampleCounts};
 *     uint32_t {@link #maxColorAttachments};
 *     VkSampleCountFlags {@link #sampledImageColorSampleCounts};
 *     VkSampleCountFlags {@link #sampledImageIntegerSampleCounts};
 *     VkSampleCountFlags {@link #sampledImageDepthSampleCounts};
 *     VkSampleCountFlags {@link #sampledImageStencilSampleCounts};
 *     VkSampleCountFlags {@link #storageImageSampleCounts};
 *     uint32_t {@link #maxSampleMaskWords};
 *     VkBool32 {@link #timestampComputeAndGraphics};
 *     float {@link #timestampPeriod};
 *     uint32_t {@link #maxClipDistances};
 *     uint32_t {@link #maxCullDistances};
 *     uint32_t {@link #maxCombinedClipAndCullDistances};
 *     uint32_t {@link #discreteQueuePriorities};
 *     float {@link #pointSizeRange}[2];
 *     float {@link #lineWidthRange}[2];
 *     float {@link #pointSizeGranularity};
 *     float {@link #lineWidthGranularity};
 *     VkBool32 {@link #strictLines};
 *     VkBool32 {@link #standardSampleLocations};
 *     VkDeviceSize {@link #optimalBufferCopyOffsetAlignment};
 *     VkDeviceSize {@link #optimalBufferCopyRowPitchAlignment};
 *     VkDeviceSize {@link #nonCoherentAtomSize};
 * }</code></pre>
 */
public class VkPhysicalDeviceLimits extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAXIMAGEDIMENSION1D,
        MAXIMAGEDIMENSION2D,
        MAXIMAGEDIMENSION3D,
        MAXIMAGEDIMENSIONCUBE,
        MAXIMAGEARRAYLAYERS,
        MAXTEXELBUFFERELEMENTS,
        MAXUNIFORMBUFFERRANGE,
        MAXSTORAGEBUFFERRANGE,
        MAXPUSHCONSTANTSSIZE,
        MAXMEMORYALLOCATIONCOUNT,
        MAXSAMPLERALLOCATIONCOUNT,
        BUFFERIMAGEGRANULARITY,
        SPARSEADDRESSSPACESIZE,
        MAXBOUNDDESCRIPTORSETS,
        MAXPERSTAGEDESCRIPTORSAMPLERS,
        MAXPERSTAGEDESCRIPTORUNIFORMBUFFERS,
        MAXPERSTAGEDESCRIPTORSTORAGEBUFFERS,
        MAXPERSTAGEDESCRIPTORSAMPLEDIMAGES,
        MAXPERSTAGEDESCRIPTORSTORAGEIMAGES,
        MAXPERSTAGEDESCRIPTORINPUTATTACHMENTS,
        MAXPERSTAGERESOURCES,
        MAXDESCRIPTORSETSAMPLERS,
        MAXDESCRIPTORSETUNIFORMBUFFERS,
        MAXDESCRIPTORSETUNIFORMBUFFERSDYNAMIC,
        MAXDESCRIPTORSETSTORAGEBUFFERS,
        MAXDESCRIPTORSETSTORAGEBUFFERSDYNAMIC,
        MAXDESCRIPTORSETSAMPLEDIMAGES,
        MAXDESCRIPTORSETSTORAGEIMAGES,
        MAXDESCRIPTORSETINPUTATTACHMENTS,
        MAXVERTEXINPUTATTRIBUTES,
        MAXVERTEXINPUTBINDINGS,
        MAXVERTEXINPUTATTRIBUTEOFFSET,
        MAXVERTEXINPUTBINDINGSTRIDE,
        MAXVERTEXOUTPUTCOMPONENTS,
        MAXTESSELLATIONGENERATIONLEVEL,
        MAXTESSELLATIONPATCHSIZE,
        MAXTESSELLATIONCONTROLPERVERTEXINPUTCOMPONENTS,
        MAXTESSELLATIONCONTROLPERVERTEXOUTPUTCOMPONENTS,
        MAXTESSELLATIONCONTROLPERPATCHOUTPUTCOMPONENTS,
        MAXTESSELLATIONCONTROLTOTALOUTPUTCOMPONENTS,
        MAXTESSELLATIONEVALUATIONINPUTCOMPONENTS,
        MAXTESSELLATIONEVALUATIONOUTPUTCOMPONENTS,
        MAXGEOMETRYSHADERINVOCATIONS,
        MAXGEOMETRYINPUTCOMPONENTS,
        MAXGEOMETRYOUTPUTCOMPONENTS,
        MAXGEOMETRYOUTPUTVERTICES,
        MAXGEOMETRYTOTALOUTPUTCOMPONENTS,
        MAXFRAGMENTINPUTCOMPONENTS,
        MAXFRAGMENTOUTPUTATTACHMENTS,
        MAXFRAGMENTDUALSRCATTACHMENTS,
        MAXFRAGMENTCOMBINEDOUTPUTRESOURCES,
        MAXCOMPUTESHAREDMEMORYSIZE,
        MAXCOMPUTEWORKGROUPCOUNT,
        MAXCOMPUTEWORKGROUPINVOCATIONS,
        MAXCOMPUTEWORKGROUPSIZE,
        SUBPIXELPRECISIONBITS,
        SUBTEXELPRECISIONBITS,
        MIPMAPPRECISIONBITS,
        MAXDRAWINDEXEDINDEXVALUE,
        MAXDRAWINDIRECTCOUNT,
        MAXSAMPLERLODBIAS,
        MAXSAMPLERANISOTROPY,
        MAXVIEWPORTS,
        MAXVIEWPORTDIMENSIONS,
        VIEWPORTBOUNDSRANGE,
        VIEWPORTSUBPIXELBITS,
        MINMEMORYMAPALIGNMENT,
        MINTEXELBUFFEROFFSETALIGNMENT,
        MINUNIFORMBUFFEROFFSETALIGNMENT,
        MINSTORAGEBUFFEROFFSETALIGNMENT,
        MINTEXELOFFSET,
        MAXTEXELOFFSET,
        MINTEXELGATHEROFFSET,
        MAXTEXELGATHEROFFSET,
        MININTERPOLATIONOFFSET,
        MAXINTERPOLATIONOFFSET,
        SUBPIXELINTERPOLATIONOFFSETBITS,
        MAXFRAMEBUFFERWIDTH,
        MAXFRAMEBUFFERHEIGHT,
        MAXFRAMEBUFFERLAYERS,
        FRAMEBUFFERCOLORSAMPLECOUNTS,
        FRAMEBUFFERDEPTHSAMPLECOUNTS,
        FRAMEBUFFERSTENCILSAMPLECOUNTS,
        FRAMEBUFFERNOATTACHMENTSSAMPLECOUNTS,
        MAXCOLORATTACHMENTS,
        SAMPLEDIMAGECOLORSAMPLECOUNTS,
        SAMPLEDIMAGEINTEGERSAMPLECOUNTS,
        SAMPLEDIMAGEDEPTHSAMPLECOUNTS,
        SAMPLEDIMAGESTENCILSAMPLECOUNTS,
        STORAGEIMAGESAMPLECOUNTS,
        MAXSAMPLEMASKWORDS,
        TIMESTAMPCOMPUTEANDGRAPHICS,
        TIMESTAMPPERIOD,
        MAXCLIPDISTANCES,
        MAXCULLDISTANCES,
        MAXCOMBINEDCLIPANDCULLDISTANCES,
        DISCRETEQUEUEPRIORITIES,
        POINTSIZERANGE,
        LINEWIDTHRANGE,
        POINTSIZEGRANULARITY,
        LINEWIDTHGRANULARITY,
        STRICTLINES,
        STANDARDSAMPLELOCATIONS,
        OPTIMALBUFFERCOPYOFFSETALIGNMENT,
        OPTIMALBUFFERCOPYROWPITCHALIGNMENT,
        NONCOHERENTATOMSIZE;

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
            __member(8),
            __member(8),
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
            __array(4, 3),
            __member(4),
            __array(4, 3),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(4, 2),
            __array(4, 2),
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
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
            __array(4, 2),
            __array(4, 2),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAXIMAGEDIMENSION1D = layout.offsetof(0);
        MAXIMAGEDIMENSION2D = layout.offsetof(1);
        MAXIMAGEDIMENSION3D = layout.offsetof(2);
        MAXIMAGEDIMENSIONCUBE = layout.offsetof(3);
        MAXIMAGEARRAYLAYERS = layout.offsetof(4);
        MAXTEXELBUFFERELEMENTS = layout.offsetof(5);
        MAXUNIFORMBUFFERRANGE = layout.offsetof(6);
        MAXSTORAGEBUFFERRANGE = layout.offsetof(7);
        MAXPUSHCONSTANTSSIZE = layout.offsetof(8);
        MAXMEMORYALLOCATIONCOUNT = layout.offsetof(9);
        MAXSAMPLERALLOCATIONCOUNT = layout.offsetof(10);
        BUFFERIMAGEGRANULARITY = layout.offsetof(11);
        SPARSEADDRESSSPACESIZE = layout.offsetof(12);
        MAXBOUNDDESCRIPTORSETS = layout.offsetof(13);
        MAXPERSTAGEDESCRIPTORSAMPLERS = layout.offsetof(14);
        MAXPERSTAGEDESCRIPTORUNIFORMBUFFERS = layout.offsetof(15);
        MAXPERSTAGEDESCRIPTORSTORAGEBUFFERS = layout.offsetof(16);
        MAXPERSTAGEDESCRIPTORSAMPLEDIMAGES = layout.offsetof(17);
        MAXPERSTAGEDESCRIPTORSTORAGEIMAGES = layout.offsetof(18);
        MAXPERSTAGEDESCRIPTORINPUTATTACHMENTS = layout.offsetof(19);
        MAXPERSTAGERESOURCES = layout.offsetof(20);
        MAXDESCRIPTORSETSAMPLERS = layout.offsetof(21);
        MAXDESCRIPTORSETUNIFORMBUFFERS = layout.offsetof(22);
        MAXDESCRIPTORSETUNIFORMBUFFERSDYNAMIC = layout.offsetof(23);
        MAXDESCRIPTORSETSTORAGEBUFFERS = layout.offsetof(24);
        MAXDESCRIPTORSETSTORAGEBUFFERSDYNAMIC = layout.offsetof(25);
        MAXDESCRIPTORSETSAMPLEDIMAGES = layout.offsetof(26);
        MAXDESCRIPTORSETSTORAGEIMAGES = layout.offsetof(27);
        MAXDESCRIPTORSETINPUTATTACHMENTS = layout.offsetof(28);
        MAXVERTEXINPUTATTRIBUTES = layout.offsetof(29);
        MAXVERTEXINPUTBINDINGS = layout.offsetof(30);
        MAXVERTEXINPUTATTRIBUTEOFFSET = layout.offsetof(31);
        MAXVERTEXINPUTBINDINGSTRIDE = layout.offsetof(32);
        MAXVERTEXOUTPUTCOMPONENTS = layout.offsetof(33);
        MAXTESSELLATIONGENERATIONLEVEL = layout.offsetof(34);
        MAXTESSELLATIONPATCHSIZE = layout.offsetof(35);
        MAXTESSELLATIONCONTROLPERVERTEXINPUTCOMPONENTS = layout.offsetof(36);
        MAXTESSELLATIONCONTROLPERVERTEXOUTPUTCOMPONENTS = layout.offsetof(37);
        MAXTESSELLATIONCONTROLPERPATCHOUTPUTCOMPONENTS = layout.offsetof(38);
        MAXTESSELLATIONCONTROLTOTALOUTPUTCOMPONENTS = layout.offsetof(39);
        MAXTESSELLATIONEVALUATIONINPUTCOMPONENTS = layout.offsetof(40);
        MAXTESSELLATIONEVALUATIONOUTPUTCOMPONENTS = layout.offsetof(41);
        MAXGEOMETRYSHADERINVOCATIONS = layout.offsetof(42);
        MAXGEOMETRYINPUTCOMPONENTS = layout.offsetof(43);
        MAXGEOMETRYOUTPUTCOMPONENTS = layout.offsetof(44);
        MAXGEOMETRYOUTPUTVERTICES = layout.offsetof(45);
        MAXGEOMETRYTOTALOUTPUTCOMPONENTS = layout.offsetof(46);
        MAXFRAGMENTINPUTCOMPONENTS = layout.offsetof(47);
        MAXFRAGMENTOUTPUTATTACHMENTS = layout.offsetof(48);
        MAXFRAGMENTDUALSRCATTACHMENTS = layout.offsetof(49);
        MAXFRAGMENTCOMBINEDOUTPUTRESOURCES = layout.offsetof(50);
        MAXCOMPUTESHAREDMEMORYSIZE = layout.offsetof(51);
        MAXCOMPUTEWORKGROUPCOUNT = layout.offsetof(52);
        MAXCOMPUTEWORKGROUPINVOCATIONS = layout.offsetof(53);
        MAXCOMPUTEWORKGROUPSIZE = layout.offsetof(54);
        SUBPIXELPRECISIONBITS = layout.offsetof(55);
        SUBTEXELPRECISIONBITS = layout.offsetof(56);
        MIPMAPPRECISIONBITS = layout.offsetof(57);
        MAXDRAWINDEXEDINDEXVALUE = layout.offsetof(58);
        MAXDRAWINDIRECTCOUNT = layout.offsetof(59);
        MAXSAMPLERLODBIAS = layout.offsetof(60);
        MAXSAMPLERANISOTROPY = layout.offsetof(61);
        MAXVIEWPORTS = layout.offsetof(62);
        MAXVIEWPORTDIMENSIONS = layout.offsetof(63);
        VIEWPORTBOUNDSRANGE = layout.offsetof(64);
        VIEWPORTSUBPIXELBITS = layout.offsetof(65);
        MINMEMORYMAPALIGNMENT = layout.offsetof(66);
        MINTEXELBUFFEROFFSETALIGNMENT = layout.offsetof(67);
        MINUNIFORMBUFFEROFFSETALIGNMENT = layout.offsetof(68);
        MINSTORAGEBUFFEROFFSETALIGNMENT = layout.offsetof(69);
        MINTEXELOFFSET = layout.offsetof(70);
        MAXTEXELOFFSET = layout.offsetof(71);
        MINTEXELGATHEROFFSET = layout.offsetof(72);
        MAXTEXELGATHEROFFSET = layout.offsetof(73);
        MININTERPOLATIONOFFSET = layout.offsetof(74);
        MAXINTERPOLATIONOFFSET = layout.offsetof(75);
        SUBPIXELINTERPOLATIONOFFSETBITS = layout.offsetof(76);
        MAXFRAMEBUFFERWIDTH = layout.offsetof(77);
        MAXFRAMEBUFFERHEIGHT = layout.offsetof(78);
        MAXFRAMEBUFFERLAYERS = layout.offsetof(79);
        FRAMEBUFFERCOLORSAMPLECOUNTS = layout.offsetof(80);
        FRAMEBUFFERDEPTHSAMPLECOUNTS = layout.offsetof(81);
        FRAMEBUFFERSTENCILSAMPLECOUNTS = layout.offsetof(82);
        FRAMEBUFFERNOATTACHMENTSSAMPLECOUNTS = layout.offsetof(83);
        MAXCOLORATTACHMENTS = layout.offsetof(84);
        SAMPLEDIMAGECOLORSAMPLECOUNTS = layout.offsetof(85);
        SAMPLEDIMAGEINTEGERSAMPLECOUNTS = layout.offsetof(86);
        SAMPLEDIMAGEDEPTHSAMPLECOUNTS = layout.offsetof(87);
        SAMPLEDIMAGESTENCILSAMPLECOUNTS = layout.offsetof(88);
        STORAGEIMAGESAMPLECOUNTS = layout.offsetof(89);
        MAXSAMPLEMASKWORDS = layout.offsetof(90);
        TIMESTAMPCOMPUTEANDGRAPHICS = layout.offsetof(91);
        TIMESTAMPPERIOD = layout.offsetof(92);
        MAXCLIPDISTANCES = layout.offsetof(93);
        MAXCULLDISTANCES = layout.offsetof(94);
        MAXCOMBINEDCLIPANDCULLDISTANCES = layout.offsetof(95);
        DISCRETEQUEUEPRIORITIES = layout.offsetof(96);
        POINTSIZERANGE = layout.offsetof(97);
        LINEWIDTHRANGE = layout.offsetof(98);
        POINTSIZEGRANULARITY = layout.offsetof(99);
        LINEWIDTHGRANULARITY = layout.offsetof(100);
        STRICTLINES = layout.offsetof(101);
        STANDARDSAMPLELOCATIONS = layout.offsetof(102);
        OPTIMALBUFFERCOPYOFFSETALIGNMENT = layout.offsetof(103);
        OPTIMALBUFFERCOPYROWPITCHALIGNMENT = layout.offsetof(104);
        NONCOHERENTATOMSIZE = layout.offsetof(105);
    }

    /**
     * Creates a {@code VkPhysicalDeviceLimits} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceLimits(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the largest dimension ({@code width}) that is guaranteed to be supported for all images created with an {@code imageType} of {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}. Some combinations of image parameters (format, usage, etc.) <b>may</b> allow support for larger dimensions, which <b>can</b> be queried using {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties}. */
    @NativeType("uint32_t")
    public int maxImageDimension1D() { return nmaxImageDimension1D(address()); }
    /** the largest dimension ({@code width} or {@code height}) that is guaranteed to be supported for all images created with an {@code imageType} of {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} and without {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT} set in {@code flags}. Some combinations of image parameters (format, usage, etc.) <b>may</b> allow support for larger dimensions, which <b>can</b> be queried using {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties}. */
    @NativeType("uint32_t")
    public int maxImageDimension2D() { return nmaxImageDimension2D(address()); }
    /** the largest dimension ({@code width}, {@code height}, or {@code depth}) that is guaranteed to be supported for all images created with an {@code imageType} of {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}. Some combinations of image parameters (format, usage, etc.) <b>may</b> allow support for larger dimensions, which <b>can</b> be queried using {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties}. */
    @NativeType("uint32_t")
    public int maxImageDimension3D() { return nmaxImageDimension3D(address()); }
    /** the largest dimension ({@code width} or {@code height}) that is guaranteed to be supported for all images created with an {@code imageType} of {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D} and with {@link VK10#VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT IMAGE_CREATE_CUBE_COMPATIBLE_BIT} set in {@code flags}. Some combinations of image parameters (format, usage, etc.) <b>may</b> allow support for larger dimensions, which <b>can</b> be queried using {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties}. */
    @NativeType("uint32_t")
    public int maxImageDimensionCube() { return nmaxImageDimensionCube(address()); }
    /** the maximum number of layers ({@code arrayLayers}) for an image. */
    @NativeType("uint32_t")
    public int maxImageArrayLayers() { return nmaxImageArrayLayers(address()); }
    /** the maximum number of addressable texels for a buffer view created on a buffer which was created with the {@link VK10#VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT} or {@link VK10#VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT} set in the {@code usage} member of the {@link VkBufferCreateInfo} structure. */
    @NativeType("uint32_t")
    public int maxTexelBufferElements() { return nmaxTexelBufferElements(address()); }
    /** the maximum value that <b>can</b> be specified in the {@code range} member of a {@link VkDescriptorBufferInfo} structure passed to {@link VK10#vkUpdateDescriptorSets UpdateDescriptorSets} for descriptors of type {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC}. */
    @NativeType("uint32_t")
    public int maxUniformBufferRange() { return nmaxUniformBufferRange(address()); }
    /** the maximum value that <b>can</b> be specified in the {@code range} member of a {@link VkDescriptorBufferInfo} structure passed to {@link VK10#vkUpdateDescriptorSets UpdateDescriptorSets} for descriptors of type {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}. */
    @NativeType("uint32_t")
    public int maxStorageBufferRange() { return nmaxStorageBufferRange(address()); }
    /** the maximum size, in bytes, of the pool of push constant memory. For each of the push constant ranges indicated by the {@code pPushConstantRanges} member of the {@link VkPipelineLayoutCreateInfo} structure, <code>(offset + size)</code> <b>must</b> be less than or equal to this limit. */
    @NativeType("uint32_t")
    public int maxPushConstantsSize() { return nmaxPushConstantsSize(address()); }
    /** the maximum number of device memory allocations, as created by {@link VK10#vkAllocateMemory AllocateMemory}, which <b>can</b> simultaneously exist. */
    @NativeType("uint32_t")
    public int maxMemoryAllocationCount() { return nmaxMemoryAllocationCount(address()); }
    /** the maximum number of sampler objects, as created by {@link VK10#vkCreateSampler CreateSampler}, which <b>can</b> simultaneously exist on a device. */
    @NativeType("uint32_t")
    public int maxSamplerAllocationCount() { return nmaxSamplerAllocationCount(address()); }
    /** the granularity, in bytes, at which buffer or linear image resources, and optimal image resources <b>can</b> be bound to adjacent offsets in the same {@code VkDeviceMemory} object without aliasing. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-bufferimagegranularity">Buffer-Image Granularity</a> for more details. */
    @NativeType("VkDeviceSize")
    public long bufferImageGranularity() { return nbufferImageGranularity(address()); }
    /** the total amount of address space available, in bytes, for sparse memory resources. This is an upper bound on the sum of the sizes of all sparse resources, regardless of whether any memory is bound to them. */
    @NativeType("VkDeviceSize")
    public long sparseAddressSpaceSize() { return nsparseAddressSpaceSize(address()); }
    /** the maximum number of descriptor sets that <b>can</b> be simultaneously used by a pipeline. All {@code DescriptorSet} decorations in shader modules <b>must</b> have a value less than {@code maxBoundDescriptorSets}. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-sets">Descriptor Sets</a>. */
    @NativeType("uint32_t")
    public int maxBoundDescriptorSets() { return nmaxBoundDescriptorSets(address()); }
    /** the maximum number of samplers that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER} or {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. A descriptor is accessible to a shader stage when the {@code stageFlags} member of the {@link VkDescriptorSetLayoutBinding} structure has the bit for that shader stage set. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-sampler">Sampler</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-combinedimagesampler">Combined Image Sampler</a>. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorSamplers() { return nmaxPerStageDescriptorSamplers(address()); }
    /** the maximum number of uniform buffers that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. A descriptor is accessible to a shader stage when the {@code stageFlags} member of the {@link VkDescriptorSetLayoutBinding} structure has the bit for that shader stage set. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-uniformbuffer">Uniform Buffer</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-uniformbufferdynamic">Dynamic Uniform Buffer</a>. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUniformBuffers() { return nmaxPerStageDescriptorUniformBuffers(address()); }
    /** the maximum number of storage buffers that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. A descriptor is accessible to a pipeline shader stage when the {@code stageFlags} member of the {@link VkDescriptorSetLayoutBinding} structure has the bit for that shader stage set. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-storagebuffer">Storage Buffer</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-storagebufferdynamic">Dynamic Storage Buffer</a>. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorStorageBuffers() { return nmaxPerStageDescriptorStorageBuffers(address()); }
    /** the maximum number of sampled images that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. A descriptor is accessible to a pipeline shader stage when the {@code stageFlags} member of the {@link VkDescriptorSetLayoutBinding} structure has the bit for that shader stage set. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-combinedimagesampler">Combined Image Sampler</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-sampledimage">Sampled Image</a>, and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-uniformtexelbuffer">Uniform Texel Buffer</a>. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorSampledImages() { return nmaxPerStageDescriptorSampledImages(address()); }
    /** the maximum number of storage images that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. A descriptor is accessible to a pipeline shader stage when the {@code stageFlags} member of the {@link VkDescriptorSetLayoutBinding} structure has the bit for that shader stage set. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-storageimage">Storage Image</a>, and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-storagetexelbuffer">Storage Texel Buffer</a>. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorStorageImages() { return nmaxPerStageDescriptorStorageImages(address()); }
    /** the maximum number of input attachments that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. A descriptor is accessible to a pipeline shader stage when the {@code stageFlags} member of the {@link VkDescriptorSetLayoutBinding} structure has the bit for that shader stage set. These are only supported for the fragment stage. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-inputattachment">Input Attachment</a>. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorInputAttachments() { return nmaxPerStageDescriptorInputAttachments(address()); }
    /** the maximum number of resources that <b>can</b> be accessible to a single shader stage in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER}, {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER}, {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}, or {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. For the fragment shader stage the framebuffer color attachments also count against this limit. */
    @NativeType("uint32_t")
    public int maxPerStageResources() { return nmaxPerStageResources(address()); }
    /** the maximum number of samplers that <b>can</b> be included in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER} or {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-sampler">Sampler</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-combinedimagesampler">Combined Image Sampler</a>. */
    @NativeType("uint32_t")
    public int maxDescriptorSetSamplers() { return nmaxDescriptorSetSamplers(address()); }
    /** the maximum number of uniform buffers that <b>can</b> be included in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-uniformbuffer">Uniform Buffer</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-uniformbufferdynamic">Dynamic Uniform Buffer</a>. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUniformBuffers() { return nmaxDescriptorSetUniformBuffers(address()); }
    /** the maximum number of dynamic uniform buffers that <b>can</b> be included in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-uniformbufferdynamic">Dynamic Uniform Buffer</a>. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUniformBuffersDynamic() { return nmaxDescriptorSetUniformBuffersDynamic(address()); }
    /** the maximum number of storage buffers that <b>can</b> be included in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-storagebuffer">Storage Buffer</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-storagebufferdynamic">Dynamic Storage Buffer</a>. */
    @NativeType("uint32_t")
    public int maxDescriptorSetStorageBuffers() { return nmaxDescriptorSetStorageBuffers(address()); }
    /** the maximum number of dynamic storage buffers that <b>can</b> be included in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-storagebufferdynamic">Dynamic Storage Buffer</a>. */
    @NativeType("uint32_t")
    public int maxDescriptorSetStorageBuffersDynamic() { return nmaxDescriptorSetStorageBuffersDynamic(address()); }
    /** the maximum number of sampled images that <b>can</b> be included in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-combinedimagesampler">Combined Image Sampler</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-sampledimage">Sampled Image</a>, and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-uniformtexelbuffer">Uniform Texel Buffer</a>. */
    @NativeType("uint32_t")
    public int maxDescriptorSetSampledImages() { return nmaxDescriptorSetSampledImages(address()); }
    /** the maximum number of storage images that <b>can</b> be included in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}, or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-storageimage">Storage Image</a>, and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-storagetexelbuffer">Storage Texel Buffer</a>. */
    @NativeType("uint32_t")
    public int maxDescriptorSetStorageImages() { return nmaxDescriptorSetStorageImages(address()); }
    /** the maximum number of input attachments that <b>can</b> be included in a pipeline layout. Descriptors with a type of {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT} count against this limit. Only descriptors in descriptor set layouts created without the {@link VK12#VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT} bit set count against this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#descriptorsets-inputattachment">Input Attachment</a>. */
    @NativeType("uint32_t")
    public int maxDescriptorSetInputAttachments() { return nmaxDescriptorSetInputAttachments(address()); }
    /** the maximum number of vertex input attributes that <b>can</b> be specified for a graphics pipeline. These are described in the array of {@link VkVertexInputAttributeDescription} structures that are provided at graphics pipeline creation time via the {@code pVertexAttributeDescriptions} member of the {@link VkPipelineVertexInputStateCreateInfo} structure. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fxvertex-attrib">Vertex Attributes</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fxvertex-input">Vertex Input Description</a>. */
    @NativeType("uint32_t")
    public int maxVertexInputAttributes() { return nmaxVertexInputAttributes(address()); }
    /** the maximum number of vertex buffers that <b>can</b> be specified for providing vertex attributes to a graphics pipeline. These are described in the array of {@link VkVertexInputBindingDescription} structures that are provided at graphics pipeline creation time via the {@code pVertexBindingDescriptions} member of the {@link VkPipelineVertexInputStateCreateInfo} structure. The {@code binding} member of {@link VkVertexInputBindingDescription} <b>must</b> be less than this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fxvertex-input">Vertex Input Description</a>. */
    @NativeType("uint32_t")
    public int maxVertexInputBindings() { return nmaxVertexInputBindings(address()); }
    /** the maximum vertex input attribute offset that <b>can</b> be added to the vertex input binding stride. The {@code offset} member of the {@link VkVertexInputAttributeDescription} structure <b>must</b> be less than or equal to this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fxvertex-input">Vertex Input Description</a>. */
    @NativeType("uint32_t")
    public int maxVertexInputAttributeOffset() { return nmaxVertexInputAttributeOffset(address()); }
    /** the maximum vertex input binding stride that <b>can</b> be specified in a vertex input binding. The {@code stride} member of the {@link VkVertexInputBindingDescription} structure <b>must</b> be less than or equal to this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fxvertex-input">Vertex Input Description</a>. */
    @NativeType("uint32_t")
    public int maxVertexInputBindingStride() { return nmaxVertexInputBindingStride(address()); }
    /** the maximum number of components of output variables which <b>can</b> be output by a vertex shader. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-vertex">Vertex Shaders</a>. */
    @NativeType("uint32_t")
    public int maxVertexOutputComponents() { return nmaxVertexOutputComponents(address()); }
    /** the maximum tessellation generation level supported by the fixed-function tessellation primitive generator. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#tessellation">Tessellation</a>. */
    @NativeType("uint32_t")
    public int maxTessellationGenerationLevel() { return nmaxTessellationGenerationLevel(address()); }
    /** the maximum patch size, in vertices, of patches that <b>can</b> be processed by the tessellation control shader and tessellation primitive generator. The {@code patchControlPoints} member of the {@link VkPipelineTessellationStateCreateInfo} structure specified at pipeline creation time and the value provided in the {@code OutputVertices} execution mode of shader modules <b>must</b> be less than or equal to this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#tessellation">Tessellation</a>. */
    @NativeType("uint32_t")
    public int maxTessellationPatchSize() { return nmaxTessellationPatchSize(address()); }
    /** the maximum number of components of input variables which <b>can</b> be provided as per-vertex inputs to the tessellation control shader stage. */
    @NativeType("uint32_t")
    public int maxTessellationControlPerVertexInputComponents() { return nmaxTessellationControlPerVertexInputComponents(address()); }
    /** the maximum number of components of per-vertex output variables which <b>can</b> be output from the tessellation control shader stage. */
    @NativeType("uint32_t")
    public int maxTessellationControlPerVertexOutputComponents() { return nmaxTessellationControlPerVertexOutputComponents(address()); }
    /** the maximum number of components of per-patch output variables which <b>can</b> be output from the tessellation control shader stage. */
    @NativeType("uint32_t")
    public int maxTessellationControlPerPatchOutputComponents() { return nmaxTessellationControlPerPatchOutputComponents(address()); }
    /** the maximum total number of components of per-vertex and per-patch output variables which <b>can</b> be output from the tessellation control shader stage. */
    @NativeType("uint32_t")
    public int maxTessellationControlTotalOutputComponents() { return nmaxTessellationControlTotalOutputComponents(address()); }
    /** the maximum number of components of input variables which <b>can</b> be provided as per-vertex inputs to the tessellation evaluation shader stage. */
    @NativeType("uint32_t")
    public int maxTessellationEvaluationInputComponents() { return nmaxTessellationEvaluationInputComponents(address()); }
    /** the maximum number of components of per-vertex output variables which <b>can</b> be output from the tessellation evaluation shader stage. */
    @NativeType("uint32_t")
    public int maxTessellationEvaluationOutputComponents() { return nmaxTessellationEvaluationOutputComponents(address()); }
    /** the maximum invocation count supported for instanced geometry shaders. The value provided in the {@code Invocations} execution mode of shader modules <b>must</b> be less than or equal to this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#geometry">Geometry Shading</a>. */
    @NativeType("uint32_t")
    public int maxGeometryShaderInvocations() { return nmaxGeometryShaderInvocations(address()); }
    /** the maximum number of components of input variables which <b>can</b> be provided as inputs to the geometry shader stage. */
    @NativeType("uint32_t")
    public int maxGeometryInputComponents() { return nmaxGeometryInputComponents(address()); }
    /** the maximum number of components of output variables which <b>can</b> be output from the geometry shader stage. */
    @NativeType("uint32_t")
    public int maxGeometryOutputComponents() { return nmaxGeometryOutputComponents(address()); }
    /** the maximum number of vertices which <b>can</b> be emitted by any geometry shader. */
    @NativeType("uint32_t")
    public int maxGeometryOutputVertices() { return nmaxGeometryOutputVertices(address()); }
    /** the maximum total number of components of output variables, across all emitted vertices, which <b>can</b> be output from the geometry shader stage. */
    @NativeType("uint32_t")
    public int maxGeometryTotalOutputComponents() { return nmaxGeometryTotalOutputComponents(address()); }
    /** the maximum number of components of input variables which <b>can</b> be provided as inputs to the fragment shader stage. */
    @NativeType("uint32_t")
    public int maxFragmentInputComponents() { return nmaxFragmentInputComponents(address()); }
    /** the maximum number of output attachments which <b>can</b> be written to by the fragment shader stage. */
    @NativeType("uint32_t")
    public int maxFragmentOutputAttachments() { return nmaxFragmentOutputAttachments(address()); }
    /** the maximum number of output attachments which <b>can</b> be written to by the fragment shader stage when blending is enabled and one of the dual source blend modes is in use. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#framebuffer-dsb">Dual-Source Blending</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-dualSrcBlend">dualSrcBlend</a>. */
    @NativeType("uint32_t")
    public int maxFragmentDualSrcAttachments() { return nmaxFragmentDualSrcAttachments(address()); }
    /** the total number of storage buffers, storage images, and output {@code Location} decorated color attachments (described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces-fragmentoutput">Fragment Output Interface</a>) which <b>can</b> be used in the fragment shader stage. */
    @NativeType("uint32_t")
    public int maxFragmentCombinedOutputResources() { return nmaxFragmentCombinedOutputResources(address()); }
    /** the maximum total storage size, in bytes, available for variables declared with the {@code Workgroup} storage class in shader modules (or with the {@code shared} storage qualifier in GLSL) in the compute shader stage. When variables declared with the {@code Workgroup} storage class are explicitly laid out (hence they are also decorated with {@code Block}), the amount of storage consumed is the size of the largest Block variable, not counting any padding at the end. The amount of storage consumed by the non-Block variables declared with the {@code Workgroup} storage class is implementation-dependent. However, the amount of storage consumed may not exceed the largest block size that would be obtained if all active non-Block variables declared with {@code Workgroup} storage class were assigned offsets in an arbitrary order by successively taking the smallest valid offset according to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#interfaces-resources-standard-layout">Standard Storage Buffer Layout</a> rules. (This is equivalent to using the GLSL std430 layout rules.) */
    @NativeType("uint32_t")
    public int maxComputeSharedMemorySize() { return nmaxComputeSharedMemorySize(address()); }
    /** the maximum number of local workgroups that <b>can</b> be dispatched by a single dispatching command. These three values represent the maximum number of local workgroups for the X, Y, and Z dimensions, respectively. The workgroup count parameters to the dispatching commands <b>must</b> be less than or equal to the corresponding limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#dispatch">Dispatching Commands</a>. */
    @NativeType("uint32_t[3]")
    public IntBuffer maxComputeWorkGroupCount() { return nmaxComputeWorkGroupCount(address()); }
    /** the maximum number of local workgroups that <b>can</b> be dispatched by a single dispatching command. These three values represent the maximum number of local workgroups for the X, Y, and Z dimensions, respectively. The workgroup count parameters to the dispatching commands <b>must</b> be less than or equal to the corresponding limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#dispatch">Dispatching Commands</a>. */
    @NativeType("uint32_t")
    public int maxComputeWorkGroupCount(int index) { return nmaxComputeWorkGroupCount(address(), index); }
    /** the maximum total number of compute shader invocations in a single local workgroup. The product of the X, Y, and Z sizes, as specified by the {@code LocalSize} or {@code LocalSizeId} execution mode in shader modules or by the object decorated by the {@code WorkgroupSize} decoration, <b>must</b> be less than or equal to this limit. */
    @NativeType("uint32_t")
    public int maxComputeWorkGroupInvocations() { return nmaxComputeWorkGroupInvocations(address()); }
    /** the maximum size of a local compute workgroup, per dimension. These three values represent the maximum local workgroup size in the X, Y, and Z dimensions, respectively. The {@code x}, {@code y}, and {@code z} sizes, as specified by the {@code LocalSize} or {@code LocalSizeId} execution mode or by the object decorated by the {@code WorkgroupSize} decoration in shader modules, <b>must</b> be less than or equal to the corresponding limit. */
    @NativeType("uint32_t[3]")
    public IntBuffer maxComputeWorkGroupSize() { return nmaxComputeWorkGroupSize(address()); }
    /** the maximum size of a local compute workgroup, per dimension. These three values represent the maximum local workgroup size in the X, Y, and Z dimensions, respectively. The {@code x}, {@code y}, and {@code z} sizes, as specified by the {@code LocalSize} or {@code LocalSizeId} execution mode or by the object decorated by the {@code WorkgroupSize} decoration in shader modules, <b>must</b> be less than or equal to the corresponding limit. */
    @NativeType("uint32_t")
    public int maxComputeWorkGroupSize(int index) { return nmaxComputeWorkGroupSize(address(), index); }
    /** the number of bits of subpixel precision in framebuffer coordinates <code>x<sub>f</sub></code> and <code>y<sub>f</sub></code>. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast">Rasterization</a>. */
    @NativeType("uint32_t")
    public int subPixelPrecisionBits() { return nsubPixelPrecisionBits(address()); }
    /** the number of bits of precision in the division along an axis of an image used for minification and magnification filters. <code>2<sup>subTexelPrecisionBits</sup></code> is the actual number of divisions along each axis of the image represented. Sub-texel values calculated during image sampling will snap to these locations when generating the filtered results. */
    @NativeType("uint32_t")
    public int subTexelPrecisionBits() { return nsubTexelPrecisionBits(address()); }
    /** the number of bits of division that the LOD calculation for mipmap fetching get snapped to when determining the contribution from each mip level to the mip filtered results. <code>2<sup>mipmapPrecisionBits</sup></code> is the actual number of divisions. */
    @NativeType("uint32_t")
    public int mipmapPrecisionBits() { return nmipmapPrecisionBits(address()); }
    /** the maximum index value that <b>can</b> be used for indexed draw calls when using 32-bit indices. This excludes the primitive restart index value of 0xFFFFFFFF. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-fullDrawIndexUint32">fullDrawIndexUint32</a>. */
    @NativeType("uint32_t")
    public int maxDrawIndexedIndexValue() { return nmaxDrawIndexedIndexValue(address()); }
    /** the maximum draw count that is supported for indirect drawing calls. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-multiDrawIndirect">multiDrawIndirect</a>. */
    @NativeType("uint32_t")
    public int maxDrawIndirectCount() { return nmaxDrawIndirectCount(address()); }
    /** the maximum absolute sampler LOD bias. The sum of the {@code mipLodBias} member of the {@link VkSamplerCreateInfo} structure and the {@code Bias} operand of image sampling operations in shader modules (or 0 if no {@code Bias} operand is provided to an image sampling operation) are clamped to the range <code>[-maxSamplerLodBias,+maxSamplerLodBias]</code>. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-mipLodBias">samplers-mipLodBias</a>. */
    public float maxSamplerLodBias() { return nmaxSamplerLodBias(address()); }
    /** the maximum degree of sampler anisotropy. The maximum degree of anisotropic filtering used for an image sampling operation is the minimum of the {@code maxAnisotropy} member of the {@link VkSamplerCreateInfo} structure and this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-maxAnisotropy">samplers-maxAnisotropy</a>. */
    public float maxSamplerAnisotropy() { return nmaxSamplerAnisotropy(address()); }
    /** the maximum number of active viewports. The {@code viewportCount} member of the {@link VkPipelineViewportStateCreateInfo} structure that is provided at pipeline creation <b>must</b> be less than or equal to this limit. */
    @NativeType("uint32_t")
    public int maxViewports() { return nmaxViewports(address()); }
    /** are the maximum viewport dimensions in the X (width) and Y (height) dimensions, respectively. The maximum viewport dimensions <b>must</b> be greater than or equal to the largest image which <b>can</b> be created and used as a framebuffer attachment. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vertexpostproc-viewport">Controlling the Viewport</a>. */
    @NativeType("uint32_t[2]")
    public IntBuffer maxViewportDimensions() { return nmaxViewportDimensions(address()); }
    /** are the maximum viewport dimensions in the X (width) and Y (height) dimensions, respectively. The maximum viewport dimensions <b>must</b> be greater than or equal to the largest image which <b>can</b> be created and used as a framebuffer attachment. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vertexpostproc-viewport">Controlling the Viewport</a>. */
    @NativeType("uint32_t")
    public int maxViewportDimensions(int index) { return nmaxViewportDimensions(address(), index); }
    /**
     * the <code>[minimum, maximum]</code> range that the corners of a viewport <b>must</b> be contained in. This range <b>must</b> be at least <code>[-2 × size, 2 × size - 1]</code>, where <code>size = max(maxViewportDimensions[0], maxViewportDimensions[1])</code>. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vertexpostproc-viewport">Controlling the Viewport</a>.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The intent of the {@code viewportBoundsRange} limit is to allow a maximum sized viewport to be arbitrarily shifted relative to the output target as long as at least some portion intersects. This would give a bounds limit of <code>[-size + 1, 2 × size - 1]</code> which would allow all possible non-empty-set intersections of the output target and the viewport. Since these numbers are typically powers of two, picking the signed number range using the smallest possible number of bits ends up with the specified range.</p>
     * </div>
     */
    @NativeType("float[2]")
    public FloatBuffer viewportBoundsRange() { return nviewportBoundsRange(address()); }
    /**
     * the <code>[minimum, maximum]</code> range that the corners of a viewport <b>must</b> be contained in. This range <b>must</b> be at least <code>[-2 × size, 2 × size - 1]</code>, where <code>size = max(maxViewportDimensions[0], maxViewportDimensions[1])</code>. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vertexpostproc-viewport">Controlling the Viewport</a>.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The intent of the {@code viewportBoundsRange} limit is to allow a maximum sized viewport to be arbitrarily shifted relative to the output target as long as at least some portion intersects. This would give a bounds limit of <code>[-size + 1, 2 × size - 1]</code> which would allow all possible non-empty-set intersections of the output target and the viewport. Since these numbers are typically powers of two, picking the signed number range using the smallest possible number of bits ends up with the specified range.</p>
     * </div>
     */
    public float viewportBoundsRange(int index) { return nviewportBoundsRange(address(), index); }
    /** the number of bits of subpixel precision for viewport bounds. The subpixel precision that floating-point viewport bounds are interpreted at is given by this limit. */
    @NativeType("uint32_t")
    public int viewportSubPixelBits() { return nviewportSubPixelBits(address()); }
    /** the minimum <b>required</b> alignment, in bytes, of host visible memory allocations within the host address space. When mapping a memory allocation with {@link VK10#vkMapMemory MapMemory}, subtracting {@code offset} bytes from the returned pointer will always produce an integer multiple of this limit. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-device-hostaccess">Host Access to Device Memory Objects</a>. The value <b>must</b> be a power of two. */
    @NativeType("size_t")
    public long minMemoryMapAlignment() { return nminMemoryMapAlignment(address()); }
    /** the minimum <b>required</b> alignment, in bytes, for the {@code offset} member of the {@link VkBufferViewCreateInfo} structure for texel buffers. The value <b>must</b> be a power of two. If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-texelBufferAlignment">texelBufferAlignment</a> is enabled, this limit is equivalent to the maximum of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-uniformTexelBufferOffsetAlignmentBytes">{@code uniformTexelBufferOffsetAlignmentBytes}</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-storageTexelBufferOffsetAlignmentBytes">{@code storageTexelBufferOffsetAlignmentBytes}</a> members of {@link VkPhysicalDeviceTexelBufferAlignmentProperties}, but smaller alignment is <b>optionally</b> allowed by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-storageTexelBufferOffsetSingleTexelAlignment">{@code storageTexelBufferOffsetSingleTexelAlignment}</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-uniformTexelBufferOffsetSingleTexelAlignment">{@code uniformTexelBufferOffsetSingleTexelAlignment}</a>. If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-texelBufferAlignment">texelBufferAlignment</a> is not enabled, {@link VkBufferViewCreateInfo}{@code ::offset} <b>must</b> be a multiple of this value. */
    @NativeType("VkDeviceSize")
    public long minTexelBufferOffsetAlignment() { return nminTexelBufferOffsetAlignment(address()); }
    /** the minimum <b>required</b> alignment, in bytes, for the {@code offset} member of the {@link VkDescriptorBufferInfo} structure for uniform buffers. When a descriptor of type {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} is updated, the {@code offset} <b>must</b> be an integer multiple of this limit. Similarly, dynamic offsets for uniform buffers <b>must</b> be multiples of this limit. The value <b>must</b> be a power of two. */
    @NativeType("VkDeviceSize")
    public long minUniformBufferOffsetAlignment() { return nminUniformBufferOffsetAlignment(address()); }
    /** the minimum <b>required</b> alignment, in bytes, for the {@code offset} member of the {@link VkDescriptorBufferInfo} structure for storage buffers. When a descriptor of type {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} is updated, the {@code offset} <b>must</b> be an integer multiple of this limit. Similarly, dynamic offsets for storage buffers <b>must</b> be multiples of this limit. The value <b>must</b> be a power of two. */
    @NativeType("VkDeviceSize")
    public long minStorageBufferOffsetAlignment() { return nminStorageBufferOffsetAlignment(address()); }
    /** the minimum offset value for the {@code ConstOffset} image operand of any of the {@code OpImageSample*} or {@code OpImageFetch*} image instructions. */
    @NativeType("int32_t")
    public int minTexelOffset() { return nminTexelOffset(address()); }
    /** the maximum offset value for the {@code ConstOffset} image operand of any of the {@code OpImageSample*} or {@code OpImageFetch*} image instructions. */
    @NativeType("uint32_t")
    public int maxTexelOffset() { return nmaxTexelOffset(address()); }
    /** the minimum offset value for the {@code Offset}, {@code ConstOffset}, or {@code ConstOffsets} image operands of any of the {@code OpImage*Gather} image instructions. */
    @NativeType("int32_t")
    public int minTexelGatherOffset() { return nminTexelGatherOffset(address()); }
    /** the maximum offset value for the {@code Offset}, {@code ConstOffset}, or {@code ConstOffsets} image operands of any of the {@code OpImage*Gather} image instructions. */
    @NativeType("uint32_t")
    public int maxTexelGatherOffset() { return nmaxTexelGatherOffset(address()); }
    /** the base minimum (inclusive) negative offset value for the {@code Offset} operand of the {@code InterpolateAtOffset} extended instruction. */
    public float minInterpolationOffset() { return nminInterpolationOffset(address()); }
    /** the base maximum (inclusive) positive offset value for the {@code Offset} operand of the {@code InterpolateAtOffset} extended instruction. */
    public float maxInterpolationOffset() { return nmaxInterpolationOffset(address()); }
    /** the number of fractional bits that the {@code x} and {@code y} offsets to the {@code InterpolateAtOffset} extended instruction <b>may</b> be rounded to as fixed-point values. */
    @NativeType("uint32_t")
    public int subPixelInterpolationOffsetBits() { return nsubPixelInterpolationOffsetBits(address()); }
    /** the maximum width for a framebuffer. The {@code width} member of the {@link VkFramebufferCreateInfo} structure <b>must</b> be less than or equal to this limit. */
    @NativeType("uint32_t")
    public int maxFramebufferWidth() { return nmaxFramebufferWidth(address()); }
    /** the maximum height for a framebuffer. The {@code height} member of the {@link VkFramebufferCreateInfo} structure <b>must</b> be less than or equal to this limit. */
    @NativeType("uint32_t")
    public int maxFramebufferHeight() { return nmaxFramebufferHeight(address()); }
    /** the maximum layer count for a layered framebuffer. The {@code layers} member of the {@link VkFramebufferCreateInfo} structure <b>must</b> be less than or equal to this limit. */
    @NativeType("uint32_t")
    public int maxFramebufferLayers() { return nmaxFramebufferLayers(address()); }
    /** a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the color sample counts that are supported for all framebuffer color attachments with floating- or fixed-point formats. For color attachments with integer formats, see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-framebufferIntegerColorSampleCounts">{@code framebufferIntegerColorSampleCounts}</a>. */
    @NativeType("VkSampleCountFlags")
    public int framebufferColorSampleCounts() { return nframebufferColorSampleCounts(address()); }
    /** a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the supported depth sample counts for all framebuffer depth/stencil attachments, when the format includes a depth component. */
    @NativeType("VkSampleCountFlags")
    public int framebufferDepthSampleCounts() { return nframebufferDepthSampleCounts(address()); }
    /** a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the supported stencil sample counts for all framebuffer depth/stencil attachments, when the format includes a stencil component. */
    @NativeType("VkSampleCountFlags")
    public int framebufferStencilSampleCounts() { return nframebufferStencilSampleCounts(address()); }
    /** a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the supported sample counts for a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#renderpass-noattachments">subpass which uses no attachments</a>. */
    @NativeType("VkSampleCountFlags")
    public int framebufferNoAttachmentsSampleCounts() { return nframebufferNoAttachmentsSampleCounts(address()); }
    /** the maximum number of color attachments that <b>can</b> be used by a subpass in a render pass. The {@code colorAttachmentCount} member of the {@link VkSubpassDescription} or {@link VkSubpassDescription2} structure <b>must</b> be less than or equal to this limit. */
    @NativeType("uint32_t")
    public int maxColorAttachments() { return nmaxColorAttachments(address()); }
    /** a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the sample counts supported for all 2D images created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, {@code usage} containing {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, and a non-integer color format. */
    @NativeType("VkSampleCountFlags")
    public int sampledImageColorSampleCounts() { return nsampledImageColorSampleCounts(address()); }
    /** a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the sample counts supported for all 2D images created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, {@code usage} containing {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, and an integer color format. */
    @NativeType("VkSampleCountFlags")
    public int sampledImageIntegerSampleCounts() { return nsampledImageIntegerSampleCounts(address()); }
    /** a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the sample counts supported for all 2D images created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, {@code usage} containing {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, and a depth format. */
    @NativeType("VkSampleCountFlags")
    public int sampledImageDepthSampleCounts() { return nsampledImageDepthSampleCounts(address()); }
    /** a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the sample counts supported for all 2D images created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, {@code usage} containing {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT}, and a stencil format. */
    @NativeType("VkSampleCountFlags")
    public int sampledImageStencilSampleCounts() { return nsampledImageStencilSampleCounts(address()); }
    /** a bitmask<sup>1</sup> of {@code VkSampleCountFlagBits} indicating the sample counts supported for all 2D images created with {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, and {@code usage} containing {@link VK10#VK_IMAGE_USAGE_STORAGE_BIT IMAGE_USAGE_STORAGE_BIT}. */
    @NativeType("VkSampleCountFlags")
    public int storageImageSampleCounts() { return nstorageImageSampleCounts(address()); }
    /** the maximum number of array elements of a variable decorated with the {@code SampleMask} built-in decoration. */
    @NativeType("uint32_t")
    public int maxSampleMaskWords() { return nmaxSampleMaskWords(address()); }
    /** specifies support for timestamps on all graphics and compute queues. If this limit is set to {@link VK10#VK_TRUE TRUE}, all queues that advertise the {@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} or {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT} in the {@link VkQueueFamilyProperties}{@code ::queueFlags} support {@link VkQueueFamilyProperties}{@code ::timestampValidBits} of at least 36. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#queries-timestamps">Timestamp Queries</a>. */
    @NativeType("VkBool32")
    public boolean timestampComputeAndGraphics() { return ntimestampComputeAndGraphics(address()) != 0; }
    /** the number of nanoseconds <b>required</b> for a timestamp query to be incremented by 1. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#queries-timestamps">Timestamp Queries</a>. */
    public float timestampPeriod() { return ntimestampPeriod(address()); }
    /** the maximum number of clip distances that <b>can</b> be used in a single shader stage. The size of any array declared with the {@code ClipDistance} built-in decoration in a shader module <b>must</b> be less than or equal to this limit. */
    @NativeType("uint32_t")
    public int maxClipDistances() { return nmaxClipDistances(address()); }
    /** the maximum number of cull distances that <b>can</b> be used in a single shader stage. The size of any array declared with the {@code CullDistance} built-in decoration in a shader module <b>must</b> be less than or equal to this limit. */
    @NativeType("uint32_t")
    public int maxCullDistances() { return nmaxCullDistances(address()); }
    /** the maximum combined number of clip and cull distances that <b>can</b> be used in a single shader stage. The sum of the sizes of any pair of arrays declared with the {@code ClipDistance} and {@code CullDistance} built-in decoration used by a single shader stage in a shader module <b>must</b> be less than or equal to this limit. */
    @NativeType("uint32_t")
    public int maxCombinedClipAndCullDistances() { return nmaxCombinedClipAndCullDistances(address()); }
    /** the number of discrete priorities that <b>can</b> be assigned to a queue based on the value of each member of {@link VkDeviceQueueCreateInfo}{@code ::pQueuePriorities}. This <b>must</b> be at least 2, and levels <b>must</b> be spread evenly over the range, with at least one level at 1.0, and another at 0.0. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-priority">Queue Priority</a>. */
    @NativeType("uint32_t")
    public int discreteQueuePriorities() { return ndiscreteQueuePriorities(address()); }
    /** the range <code>[minimum,maximum]</code> of supported sizes for points. Values written to variables decorated with the {@code PointSize} built-in decoration are clamped to this range. */
    @NativeType("float[2]")
    public FloatBuffer pointSizeRange() { return npointSizeRange(address()); }
    /** the range <code>[minimum,maximum]</code> of supported sizes for points. Values written to variables decorated with the {@code PointSize} built-in decoration are clamped to this range. */
    public float pointSizeRange(int index) { return npointSizeRange(address(), index); }
    /** the range <code>[minimum,maximum]</code> of supported widths for lines. Values specified by the {@code lineWidth} member of the {@link VkPipelineRasterizationStateCreateInfo} or the {@code lineWidth} parameter to {@code vkCmdSetLineWidth} are clamped to this range. */
    @NativeType("float[2]")
    public FloatBuffer lineWidthRange() { return nlineWidthRange(address()); }
    /** the range <code>[minimum,maximum]</code> of supported widths for lines. Values specified by the {@code lineWidth} member of the {@link VkPipelineRasterizationStateCreateInfo} or the {@code lineWidth} parameter to {@code vkCmdSetLineWidth} are clamped to this range. */
    public float lineWidthRange(int index) { return nlineWidthRange(address(), index); }
    /** the granularity of supported point sizes. Not all point sizes in the range defined by {@code pointSizeRange} are supported. This limit specifies the granularity (or increment) between successive supported point sizes. */
    public float pointSizeGranularity() { return npointSizeGranularity(address()); }
    /** the granularity of supported line widths. Not all line widths in the range defined by {@code lineWidthRange} are supported. This limit specifies the granularity (or increment) between successive supported line widths. */
    public float lineWidthGranularity() { return nlineWidthGranularity(address()); }
    /** specifies whether lines are rasterized according to the preferred method of rasterization. If set to {@link VK10#VK_FALSE FALSE}, lines <b>may</b> be rasterized under a relaxed set of rules. If set to {@link VK10#VK_TRUE TRUE}, lines are rasterized as per the strict definition. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-lines-basic">Basic Line Segment Rasterization</a>. */
    @NativeType("VkBool32")
    public boolean strictLines() { return nstrictLines(address()) != 0; }
    /** specifies whether rasterization uses the standard sample locations as documented in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-multisampling">Multisampling</a>. If set to {@link VK10#VK_TRUE TRUE}, the implementation uses the documented sample locations. If set to {@link VK10#VK_FALSE FALSE}, the implementation <b>may</b> use different sample locations. */
    @NativeType("VkBool32")
    public boolean standardSampleLocations() { return nstandardSampleLocations(address()) != 0; }
    /** the optimal buffer offset alignment in bytes for {@link VK13#vkCmdCopyBufferToImage2 CmdCopyBufferToImage2}, {@link VK10#vkCmdCopyBufferToImage CmdCopyBufferToImage}, {@link VK13#vkCmdCopyImageToBuffer2 CmdCopyImageToBuffer2}, and {@link VK10#vkCmdCopyImageToBuffer CmdCopyImageToBuffer}. The per texel alignment requirements are enforced, but applications <b>should</b> use the optimal alignment for optimal performance and power use. The value <b>must</b> be a power of two. */
    @NativeType("VkDeviceSize")
    public long optimalBufferCopyOffsetAlignment() { return noptimalBufferCopyOffsetAlignment(address()); }
    /** the optimal buffer row pitch alignment in bytes for {@link VK13#vkCmdCopyBufferToImage2 CmdCopyBufferToImage2}, {@link VK10#vkCmdCopyBufferToImage CmdCopyBufferToImage}, {@link VK13#vkCmdCopyImageToBuffer2 CmdCopyImageToBuffer2}, and {@link VK10#vkCmdCopyImageToBuffer CmdCopyImageToBuffer}. Row pitch is the number of bytes between texels with the same X coordinate in adjacent rows (Y coordinates differ by one). The per texel alignment requirements are enforced, but applications <b>should</b> use the optimal alignment for optimal performance and power use. The value <b>must</b> be a power of two. */
    @NativeType("VkDeviceSize")
    public long optimalBufferCopyRowPitchAlignment() { return noptimalBufferCopyRowPitchAlignment(address()); }
    /** the size and alignment in bytes that bounds concurrent access to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-device-hostaccess">host-mapped device memory</a>. The value <b>must</b> be a power of two. */
    @NativeType("VkDeviceSize")
    public long nonCoherentAtomSize() { return nnonCoherentAtomSize(address()); }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceLimits} instance for the specified memory address. */
    public static VkPhysicalDeviceLimits create(long address) {
        return wrap(VkPhysicalDeviceLimits.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceLimits createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceLimits.class, address);
    }

    /**
     * Create a {@link VkPhysicalDeviceLimits.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLimits.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceLimits.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #maxImageDimension1D}. */
    public static int nmaxImageDimension1D(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXIMAGEDIMENSION1D); }
    /** Unsafe version of {@link #maxImageDimension2D}. */
    public static int nmaxImageDimension2D(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXIMAGEDIMENSION2D); }
    /** Unsafe version of {@link #maxImageDimension3D}. */
    public static int nmaxImageDimension3D(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXIMAGEDIMENSION3D); }
    /** Unsafe version of {@link #maxImageDimensionCube}. */
    public static int nmaxImageDimensionCube(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXIMAGEDIMENSIONCUBE); }
    /** Unsafe version of {@link #maxImageArrayLayers}. */
    public static int nmaxImageArrayLayers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXIMAGEARRAYLAYERS); }
    /** Unsafe version of {@link #maxTexelBufferElements}. */
    public static int nmaxTexelBufferElements(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXTEXELBUFFERELEMENTS); }
    /** Unsafe version of {@link #maxUniformBufferRange}. */
    public static int nmaxUniformBufferRange(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXUNIFORMBUFFERRANGE); }
    /** Unsafe version of {@link #maxStorageBufferRange}. */
    public static int nmaxStorageBufferRange(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXSTORAGEBUFFERRANGE); }
    /** Unsafe version of {@link #maxPushConstantsSize}. */
    public static int nmaxPushConstantsSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXPUSHCONSTANTSSIZE); }
    /** Unsafe version of {@link #maxMemoryAllocationCount}. */
    public static int nmaxMemoryAllocationCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXMEMORYALLOCATIONCOUNT); }
    /** Unsafe version of {@link #maxSamplerAllocationCount}. */
    public static int nmaxSamplerAllocationCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXSAMPLERALLOCATIONCOUNT); }
    /** Unsafe version of {@link #bufferImageGranularity}. */
    public static long nbufferImageGranularity(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceLimits.BUFFERIMAGEGRANULARITY); }
    /** Unsafe version of {@link #sparseAddressSpaceSize}. */
    public static long nsparseAddressSpaceSize(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceLimits.SPARSEADDRESSSPACESIZE); }
    /** Unsafe version of {@link #maxBoundDescriptorSets}. */
    public static int nmaxBoundDescriptorSets(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXBOUNDDESCRIPTORSETS); }
    /** Unsafe version of {@link #maxPerStageDescriptorSamplers}. */
    public static int nmaxPerStageDescriptorSamplers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORSAMPLERS); }
    /** Unsafe version of {@link #maxPerStageDescriptorUniformBuffers}. */
    public static int nmaxPerStageDescriptorUniformBuffers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORUNIFORMBUFFERS); }
    /** Unsafe version of {@link #maxPerStageDescriptorStorageBuffers}. */
    public static int nmaxPerStageDescriptorStorageBuffers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORSTORAGEBUFFERS); }
    /** Unsafe version of {@link #maxPerStageDescriptorSampledImages}. */
    public static int nmaxPerStageDescriptorSampledImages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORSAMPLEDIMAGES); }
    /** Unsafe version of {@link #maxPerStageDescriptorStorageImages}. */
    public static int nmaxPerStageDescriptorStorageImages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORSTORAGEIMAGES); }
    /** Unsafe version of {@link #maxPerStageDescriptorInputAttachments}. */
    public static int nmaxPerStageDescriptorInputAttachments(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORINPUTATTACHMENTS); }
    /** Unsafe version of {@link #maxPerStageResources}. */
    public static int nmaxPerStageResources(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXPERSTAGERESOURCES); }
    /** Unsafe version of {@link #maxDescriptorSetSamplers}. */
    public static int nmaxDescriptorSetSamplers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETSAMPLERS); }
    /** Unsafe version of {@link #maxDescriptorSetUniformBuffers}. */
    public static int nmaxDescriptorSetUniformBuffers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETUNIFORMBUFFERS); }
    /** Unsafe version of {@link #maxDescriptorSetUniformBuffersDynamic}. */
    public static int nmaxDescriptorSetUniformBuffersDynamic(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETUNIFORMBUFFERSDYNAMIC); }
    /** Unsafe version of {@link #maxDescriptorSetStorageBuffers}. */
    public static int nmaxDescriptorSetStorageBuffers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETSTORAGEBUFFERS); }
    /** Unsafe version of {@link #maxDescriptorSetStorageBuffersDynamic}. */
    public static int nmaxDescriptorSetStorageBuffersDynamic(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETSTORAGEBUFFERSDYNAMIC); }
    /** Unsafe version of {@link #maxDescriptorSetSampledImages}. */
    public static int nmaxDescriptorSetSampledImages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETSAMPLEDIMAGES); }
    /** Unsafe version of {@link #maxDescriptorSetStorageImages}. */
    public static int nmaxDescriptorSetStorageImages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETSTORAGEIMAGES); }
    /** Unsafe version of {@link #maxDescriptorSetInputAttachments}. */
    public static int nmaxDescriptorSetInputAttachments(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETINPUTATTACHMENTS); }
    /** Unsafe version of {@link #maxVertexInputAttributes}. */
    public static int nmaxVertexInputAttributes(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXVERTEXINPUTATTRIBUTES); }
    /** Unsafe version of {@link #maxVertexInputBindings}. */
    public static int nmaxVertexInputBindings(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXVERTEXINPUTBINDINGS); }
    /** Unsafe version of {@link #maxVertexInputAttributeOffset}. */
    public static int nmaxVertexInputAttributeOffset(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXVERTEXINPUTATTRIBUTEOFFSET); }
    /** Unsafe version of {@link #maxVertexInputBindingStride}. */
    public static int nmaxVertexInputBindingStride(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXVERTEXINPUTBINDINGSTRIDE); }
    /** Unsafe version of {@link #maxVertexOutputComponents}. */
    public static int nmaxVertexOutputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXVERTEXOUTPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxTessellationGenerationLevel}. */
    public static int nmaxTessellationGenerationLevel(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXTESSELLATIONGENERATIONLEVEL); }
    /** Unsafe version of {@link #maxTessellationPatchSize}. */
    public static int nmaxTessellationPatchSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXTESSELLATIONPATCHSIZE); }
    /** Unsafe version of {@link #maxTessellationControlPerVertexInputComponents}. */
    public static int nmaxTessellationControlPerVertexInputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXTESSELLATIONCONTROLPERVERTEXINPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxTessellationControlPerVertexOutputComponents}. */
    public static int nmaxTessellationControlPerVertexOutputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXTESSELLATIONCONTROLPERVERTEXOUTPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxTessellationControlPerPatchOutputComponents}. */
    public static int nmaxTessellationControlPerPatchOutputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXTESSELLATIONCONTROLPERPATCHOUTPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxTessellationControlTotalOutputComponents}. */
    public static int nmaxTessellationControlTotalOutputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXTESSELLATIONCONTROLTOTALOUTPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxTessellationEvaluationInputComponents}. */
    public static int nmaxTessellationEvaluationInputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXTESSELLATIONEVALUATIONINPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxTessellationEvaluationOutputComponents}. */
    public static int nmaxTessellationEvaluationOutputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXTESSELLATIONEVALUATIONOUTPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxGeometryShaderInvocations}. */
    public static int nmaxGeometryShaderInvocations(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXGEOMETRYSHADERINVOCATIONS); }
    /** Unsafe version of {@link #maxGeometryInputComponents}. */
    public static int nmaxGeometryInputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXGEOMETRYINPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxGeometryOutputComponents}. */
    public static int nmaxGeometryOutputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXGEOMETRYOUTPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxGeometryOutputVertices}. */
    public static int nmaxGeometryOutputVertices(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXGEOMETRYOUTPUTVERTICES); }
    /** Unsafe version of {@link #maxGeometryTotalOutputComponents}. */
    public static int nmaxGeometryTotalOutputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXGEOMETRYTOTALOUTPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxFragmentInputComponents}. */
    public static int nmaxFragmentInputComponents(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXFRAGMENTINPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxFragmentOutputAttachments}. */
    public static int nmaxFragmentOutputAttachments(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXFRAGMENTOUTPUTATTACHMENTS); }
    /** Unsafe version of {@link #maxFragmentDualSrcAttachments}. */
    public static int nmaxFragmentDualSrcAttachments(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXFRAGMENTDUALSRCATTACHMENTS); }
    /** Unsafe version of {@link #maxFragmentCombinedOutputResources}. */
    public static int nmaxFragmentCombinedOutputResources(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXFRAGMENTCOMBINEDOUTPUTRESOURCES); }
    /** Unsafe version of {@link #maxComputeSharedMemorySize}. */
    public static int nmaxComputeSharedMemorySize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXCOMPUTESHAREDMEMORYSIZE); }
    /** Unsafe version of {@link #maxComputeWorkGroupCount}. */
    public static IntBuffer nmaxComputeWorkGroupCount(long struct) { return memIntBuffer(struct + VkPhysicalDeviceLimits.MAXCOMPUTEWORKGROUPCOUNT, 3); }
    /** Unsafe version of {@link #maxComputeWorkGroupCount(int) maxComputeWorkGroupCount}. */
    public static int nmaxComputeWorkGroupCount(long struct, int index) {
        return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXCOMPUTEWORKGROUPCOUNT + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #maxComputeWorkGroupInvocations}. */
    public static int nmaxComputeWorkGroupInvocations(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXCOMPUTEWORKGROUPINVOCATIONS); }
    /** Unsafe version of {@link #maxComputeWorkGroupSize}. */
    public static IntBuffer nmaxComputeWorkGroupSize(long struct) { return memIntBuffer(struct + VkPhysicalDeviceLimits.MAXCOMPUTEWORKGROUPSIZE, 3); }
    /** Unsafe version of {@link #maxComputeWorkGroupSize(int) maxComputeWorkGroupSize}. */
    public static int nmaxComputeWorkGroupSize(long struct, int index) {
        return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXCOMPUTEWORKGROUPSIZE + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #subPixelPrecisionBits}. */
    public static int nsubPixelPrecisionBits(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.SUBPIXELPRECISIONBITS); }
    /** Unsafe version of {@link #subTexelPrecisionBits}. */
    public static int nsubTexelPrecisionBits(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.SUBTEXELPRECISIONBITS); }
    /** Unsafe version of {@link #mipmapPrecisionBits}. */
    public static int nmipmapPrecisionBits(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MIPMAPPRECISIONBITS); }
    /** Unsafe version of {@link #maxDrawIndexedIndexValue}. */
    public static int nmaxDrawIndexedIndexValue(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXDRAWINDEXEDINDEXVALUE); }
    /** Unsafe version of {@link #maxDrawIndirectCount}. */
    public static int nmaxDrawIndirectCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXDRAWINDIRECTCOUNT); }
    /** Unsafe version of {@link #maxSamplerLodBias}. */
    public static float nmaxSamplerLodBias(long struct) { return UNSAFE.getFloat(null, struct + VkPhysicalDeviceLimits.MAXSAMPLERLODBIAS); }
    /** Unsafe version of {@link #maxSamplerAnisotropy}. */
    public static float nmaxSamplerAnisotropy(long struct) { return UNSAFE.getFloat(null, struct + VkPhysicalDeviceLimits.MAXSAMPLERANISOTROPY); }
    /** Unsafe version of {@link #maxViewports}. */
    public static int nmaxViewports(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXVIEWPORTS); }
    /** Unsafe version of {@link #maxViewportDimensions}. */
    public static IntBuffer nmaxViewportDimensions(long struct) { return memIntBuffer(struct + VkPhysicalDeviceLimits.MAXVIEWPORTDIMENSIONS, 2); }
    /** Unsafe version of {@link #maxViewportDimensions(int) maxViewportDimensions}. */
    public static int nmaxViewportDimensions(long struct, int index) {
        return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXVIEWPORTDIMENSIONS + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #viewportBoundsRange}. */
    public static FloatBuffer nviewportBoundsRange(long struct) { return memFloatBuffer(struct + VkPhysicalDeviceLimits.VIEWPORTBOUNDSRANGE, 2); }
    /** Unsafe version of {@link #viewportBoundsRange(int) viewportBoundsRange}. */
    public static float nviewportBoundsRange(long struct, int index) {
        return UNSAFE.getFloat(null, struct + VkPhysicalDeviceLimits.VIEWPORTBOUNDSRANGE + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #viewportSubPixelBits}. */
    public static int nviewportSubPixelBits(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.VIEWPORTSUBPIXELBITS); }
    /** Unsafe version of {@link #minMemoryMapAlignment}. */
    public static long nminMemoryMapAlignment(long struct) { return memGetAddress(struct + VkPhysicalDeviceLimits.MINMEMORYMAPALIGNMENT); }
    /** Unsafe version of {@link #minTexelBufferOffsetAlignment}. */
    public static long nminTexelBufferOffsetAlignment(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceLimits.MINTEXELBUFFEROFFSETALIGNMENT); }
    /** Unsafe version of {@link #minUniformBufferOffsetAlignment}. */
    public static long nminUniformBufferOffsetAlignment(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceLimits.MINUNIFORMBUFFEROFFSETALIGNMENT); }
    /** Unsafe version of {@link #minStorageBufferOffsetAlignment}. */
    public static long nminStorageBufferOffsetAlignment(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceLimits.MINSTORAGEBUFFEROFFSETALIGNMENT); }
    /** Unsafe version of {@link #minTexelOffset}. */
    public static int nminTexelOffset(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MINTEXELOFFSET); }
    /** Unsafe version of {@link #maxTexelOffset}. */
    public static int nmaxTexelOffset(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXTEXELOFFSET); }
    /** Unsafe version of {@link #minTexelGatherOffset}. */
    public static int nminTexelGatherOffset(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MINTEXELGATHEROFFSET); }
    /** Unsafe version of {@link #maxTexelGatherOffset}. */
    public static int nmaxTexelGatherOffset(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXTEXELGATHEROFFSET); }
    /** Unsafe version of {@link #minInterpolationOffset}. */
    public static float nminInterpolationOffset(long struct) { return UNSAFE.getFloat(null, struct + VkPhysicalDeviceLimits.MININTERPOLATIONOFFSET); }
    /** Unsafe version of {@link #maxInterpolationOffset}. */
    public static float nmaxInterpolationOffset(long struct) { return UNSAFE.getFloat(null, struct + VkPhysicalDeviceLimits.MAXINTERPOLATIONOFFSET); }
    /** Unsafe version of {@link #subPixelInterpolationOffsetBits}. */
    public static int nsubPixelInterpolationOffsetBits(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.SUBPIXELINTERPOLATIONOFFSETBITS); }
    /** Unsafe version of {@link #maxFramebufferWidth}. */
    public static int nmaxFramebufferWidth(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXFRAMEBUFFERWIDTH); }
    /** Unsafe version of {@link #maxFramebufferHeight}. */
    public static int nmaxFramebufferHeight(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXFRAMEBUFFERHEIGHT); }
    /** Unsafe version of {@link #maxFramebufferLayers}. */
    public static int nmaxFramebufferLayers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXFRAMEBUFFERLAYERS); }
    /** Unsafe version of {@link #framebufferColorSampleCounts}. */
    public static int nframebufferColorSampleCounts(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.FRAMEBUFFERCOLORSAMPLECOUNTS); }
    /** Unsafe version of {@link #framebufferDepthSampleCounts}. */
    public static int nframebufferDepthSampleCounts(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.FRAMEBUFFERDEPTHSAMPLECOUNTS); }
    /** Unsafe version of {@link #framebufferStencilSampleCounts}. */
    public static int nframebufferStencilSampleCounts(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.FRAMEBUFFERSTENCILSAMPLECOUNTS); }
    /** Unsafe version of {@link #framebufferNoAttachmentsSampleCounts}. */
    public static int nframebufferNoAttachmentsSampleCounts(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.FRAMEBUFFERNOATTACHMENTSSAMPLECOUNTS); }
    /** Unsafe version of {@link #maxColorAttachments}. */
    public static int nmaxColorAttachments(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXCOLORATTACHMENTS); }
    /** Unsafe version of {@link #sampledImageColorSampleCounts}. */
    public static int nsampledImageColorSampleCounts(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.SAMPLEDIMAGECOLORSAMPLECOUNTS); }
    /** Unsafe version of {@link #sampledImageIntegerSampleCounts}. */
    public static int nsampledImageIntegerSampleCounts(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.SAMPLEDIMAGEINTEGERSAMPLECOUNTS); }
    /** Unsafe version of {@link #sampledImageDepthSampleCounts}. */
    public static int nsampledImageDepthSampleCounts(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.SAMPLEDIMAGEDEPTHSAMPLECOUNTS); }
    /** Unsafe version of {@link #sampledImageStencilSampleCounts}. */
    public static int nsampledImageStencilSampleCounts(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.SAMPLEDIMAGESTENCILSAMPLECOUNTS); }
    /** Unsafe version of {@link #storageImageSampleCounts}. */
    public static int nstorageImageSampleCounts(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.STORAGEIMAGESAMPLECOUNTS); }
    /** Unsafe version of {@link #maxSampleMaskWords}. */
    public static int nmaxSampleMaskWords(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXSAMPLEMASKWORDS); }
    /** Unsafe version of {@link #timestampComputeAndGraphics}. */
    public static int ntimestampComputeAndGraphics(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.TIMESTAMPCOMPUTEANDGRAPHICS); }
    /** Unsafe version of {@link #timestampPeriod}. */
    public static float ntimestampPeriod(long struct) { return UNSAFE.getFloat(null, struct + VkPhysicalDeviceLimits.TIMESTAMPPERIOD); }
    /** Unsafe version of {@link #maxClipDistances}. */
    public static int nmaxClipDistances(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXCLIPDISTANCES); }
    /** Unsafe version of {@link #maxCullDistances}. */
    public static int nmaxCullDistances(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXCULLDISTANCES); }
    /** Unsafe version of {@link #maxCombinedClipAndCullDistances}. */
    public static int nmaxCombinedClipAndCullDistances(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.MAXCOMBINEDCLIPANDCULLDISTANCES); }
    /** Unsafe version of {@link #discreteQueuePriorities}. */
    public static int ndiscreteQueuePriorities(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.DISCRETEQUEUEPRIORITIES); }
    /** Unsafe version of {@link #pointSizeRange}. */
    public static FloatBuffer npointSizeRange(long struct) { return memFloatBuffer(struct + VkPhysicalDeviceLimits.POINTSIZERANGE, 2); }
    /** Unsafe version of {@link #pointSizeRange(int) pointSizeRange}. */
    public static float npointSizeRange(long struct, int index) {
        return UNSAFE.getFloat(null, struct + VkPhysicalDeviceLimits.POINTSIZERANGE + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #lineWidthRange}. */
    public static FloatBuffer nlineWidthRange(long struct) { return memFloatBuffer(struct + VkPhysicalDeviceLimits.LINEWIDTHRANGE, 2); }
    /** Unsafe version of {@link #lineWidthRange(int) lineWidthRange}. */
    public static float nlineWidthRange(long struct, int index) {
        return UNSAFE.getFloat(null, struct + VkPhysicalDeviceLimits.LINEWIDTHRANGE + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #pointSizeGranularity}. */
    public static float npointSizeGranularity(long struct) { return UNSAFE.getFloat(null, struct + VkPhysicalDeviceLimits.POINTSIZEGRANULARITY); }
    /** Unsafe version of {@link #lineWidthGranularity}. */
    public static float nlineWidthGranularity(long struct) { return UNSAFE.getFloat(null, struct + VkPhysicalDeviceLimits.LINEWIDTHGRANULARITY); }
    /** Unsafe version of {@link #strictLines}. */
    public static int nstrictLines(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.STRICTLINES); }
    /** Unsafe version of {@link #standardSampleLocations}. */
    public static int nstandardSampleLocations(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLimits.STANDARDSAMPLELOCATIONS); }
    /** Unsafe version of {@link #optimalBufferCopyOffsetAlignment}. */
    public static long noptimalBufferCopyOffsetAlignment(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceLimits.OPTIMALBUFFERCOPYOFFSETALIGNMENT); }
    /** Unsafe version of {@link #optimalBufferCopyRowPitchAlignment}. */
    public static long noptimalBufferCopyRowPitchAlignment(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceLimits.OPTIMALBUFFERCOPYROWPITCHALIGNMENT); }
    /** Unsafe version of {@link #nonCoherentAtomSize}. */
    public static long nnonCoherentAtomSize(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceLimits.NONCOHERENTATOMSIZE); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceLimits} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceLimits, Buffer> {

        private static final VkPhysicalDeviceLimits ELEMENT_FACTORY = VkPhysicalDeviceLimits.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceLimits.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceLimits#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceLimits getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceLimits#maxImageDimension1D} field. */
        @NativeType("uint32_t")
        public int maxImageDimension1D() { return VkPhysicalDeviceLimits.nmaxImageDimension1D(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxImageDimension2D} field. */
        @NativeType("uint32_t")
        public int maxImageDimension2D() { return VkPhysicalDeviceLimits.nmaxImageDimension2D(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxImageDimension3D} field. */
        @NativeType("uint32_t")
        public int maxImageDimension3D() { return VkPhysicalDeviceLimits.nmaxImageDimension3D(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxImageDimensionCube} field. */
        @NativeType("uint32_t")
        public int maxImageDimensionCube() { return VkPhysicalDeviceLimits.nmaxImageDimensionCube(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxImageArrayLayers} field. */
        @NativeType("uint32_t")
        public int maxImageArrayLayers() { return VkPhysicalDeviceLimits.nmaxImageArrayLayers(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxTexelBufferElements} field. */
        @NativeType("uint32_t")
        public int maxTexelBufferElements() { return VkPhysicalDeviceLimits.nmaxTexelBufferElements(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxUniformBufferRange} field. */
        @NativeType("uint32_t")
        public int maxUniformBufferRange() { return VkPhysicalDeviceLimits.nmaxUniformBufferRange(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxStorageBufferRange} field. */
        @NativeType("uint32_t")
        public int maxStorageBufferRange() { return VkPhysicalDeviceLimits.nmaxStorageBufferRange(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxPushConstantsSize} field. */
        @NativeType("uint32_t")
        public int maxPushConstantsSize() { return VkPhysicalDeviceLimits.nmaxPushConstantsSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxMemoryAllocationCount} field. */
        @NativeType("uint32_t")
        public int maxMemoryAllocationCount() { return VkPhysicalDeviceLimits.nmaxMemoryAllocationCount(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxSamplerAllocationCount} field. */
        @NativeType("uint32_t")
        public int maxSamplerAllocationCount() { return VkPhysicalDeviceLimits.nmaxSamplerAllocationCount(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#bufferImageGranularity} field. */
        @NativeType("VkDeviceSize")
        public long bufferImageGranularity() { return VkPhysicalDeviceLimits.nbufferImageGranularity(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#sparseAddressSpaceSize} field. */
        @NativeType("VkDeviceSize")
        public long sparseAddressSpaceSize() { return VkPhysicalDeviceLimits.nsparseAddressSpaceSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxBoundDescriptorSets} field. */
        @NativeType("uint32_t")
        public int maxBoundDescriptorSets() { return VkPhysicalDeviceLimits.nmaxBoundDescriptorSets(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxPerStageDescriptorSamplers} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorSamplers() { return VkPhysicalDeviceLimits.nmaxPerStageDescriptorSamplers(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxPerStageDescriptorUniformBuffers} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUniformBuffers() { return VkPhysicalDeviceLimits.nmaxPerStageDescriptorUniformBuffers(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxPerStageDescriptorStorageBuffers} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorStorageBuffers() { return VkPhysicalDeviceLimits.nmaxPerStageDescriptorStorageBuffers(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxPerStageDescriptorSampledImages} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorSampledImages() { return VkPhysicalDeviceLimits.nmaxPerStageDescriptorSampledImages(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxPerStageDescriptorStorageImages} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorStorageImages() { return VkPhysicalDeviceLimits.nmaxPerStageDescriptorStorageImages(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxPerStageDescriptorInputAttachments} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorInputAttachments() { return VkPhysicalDeviceLimits.nmaxPerStageDescriptorInputAttachments(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxPerStageResources} field. */
        @NativeType("uint32_t")
        public int maxPerStageResources() { return VkPhysicalDeviceLimits.nmaxPerStageResources(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxDescriptorSetSamplers} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetSamplers() { return VkPhysicalDeviceLimits.nmaxDescriptorSetSamplers(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxDescriptorSetUniformBuffers} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUniformBuffers() { return VkPhysicalDeviceLimits.nmaxDescriptorSetUniformBuffers(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxDescriptorSetUniformBuffersDynamic} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUniformBuffersDynamic() { return VkPhysicalDeviceLimits.nmaxDescriptorSetUniformBuffersDynamic(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxDescriptorSetStorageBuffers} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetStorageBuffers() { return VkPhysicalDeviceLimits.nmaxDescriptorSetStorageBuffers(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxDescriptorSetStorageBuffersDynamic} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetStorageBuffersDynamic() { return VkPhysicalDeviceLimits.nmaxDescriptorSetStorageBuffersDynamic(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxDescriptorSetSampledImages} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetSampledImages() { return VkPhysicalDeviceLimits.nmaxDescriptorSetSampledImages(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxDescriptorSetStorageImages} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetStorageImages() { return VkPhysicalDeviceLimits.nmaxDescriptorSetStorageImages(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxDescriptorSetInputAttachments} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetInputAttachments() { return VkPhysicalDeviceLimits.nmaxDescriptorSetInputAttachments(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxVertexInputAttributes} field. */
        @NativeType("uint32_t")
        public int maxVertexInputAttributes() { return VkPhysicalDeviceLimits.nmaxVertexInputAttributes(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxVertexInputBindings} field. */
        @NativeType("uint32_t")
        public int maxVertexInputBindings() { return VkPhysicalDeviceLimits.nmaxVertexInputBindings(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxVertexInputAttributeOffset} field. */
        @NativeType("uint32_t")
        public int maxVertexInputAttributeOffset() { return VkPhysicalDeviceLimits.nmaxVertexInputAttributeOffset(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxVertexInputBindingStride} field. */
        @NativeType("uint32_t")
        public int maxVertexInputBindingStride() { return VkPhysicalDeviceLimits.nmaxVertexInputBindingStride(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxVertexOutputComponents} field. */
        @NativeType("uint32_t")
        public int maxVertexOutputComponents() { return VkPhysicalDeviceLimits.nmaxVertexOutputComponents(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxTessellationGenerationLevel} field. */
        @NativeType("uint32_t")
        public int maxTessellationGenerationLevel() { return VkPhysicalDeviceLimits.nmaxTessellationGenerationLevel(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxTessellationPatchSize} field. */
        @NativeType("uint32_t")
        public int maxTessellationPatchSize() { return VkPhysicalDeviceLimits.nmaxTessellationPatchSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxTessellationControlPerVertexInputComponents} field. */
        @NativeType("uint32_t")
        public int maxTessellationControlPerVertexInputComponents() { return VkPhysicalDeviceLimits.nmaxTessellationControlPerVertexInputComponents(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxTessellationControlPerVertexOutputComponents} field. */
        @NativeType("uint32_t")
        public int maxTessellationControlPerVertexOutputComponents() { return VkPhysicalDeviceLimits.nmaxTessellationControlPerVertexOutputComponents(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxTessellationControlPerPatchOutputComponents} field. */
        @NativeType("uint32_t")
        public int maxTessellationControlPerPatchOutputComponents() { return VkPhysicalDeviceLimits.nmaxTessellationControlPerPatchOutputComponents(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxTessellationControlTotalOutputComponents} field. */
        @NativeType("uint32_t")
        public int maxTessellationControlTotalOutputComponents() { return VkPhysicalDeviceLimits.nmaxTessellationControlTotalOutputComponents(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxTessellationEvaluationInputComponents} field. */
        @NativeType("uint32_t")
        public int maxTessellationEvaluationInputComponents() { return VkPhysicalDeviceLimits.nmaxTessellationEvaluationInputComponents(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxTessellationEvaluationOutputComponents} field. */
        @NativeType("uint32_t")
        public int maxTessellationEvaluationOutputComponents() { return VkPhysicalDeviceLimits.nmaxTessellationEvaluationOutputComponents(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxGeometryShaderInvocations} field. */
        @NativeType("uint32_t")
        public int maxGeometryShaderInvocations() { return VkPhysicalDeviceLimits.nmaxGeometryShaderInvocations(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxGeometryInputComponents} field. */
        @NativeType("uint32_t")
        public int maxGeometryInputComponents() { return VkPhysicalDeviceLimits.nmaxGeometryInputComponents(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxGeometryOutputComponents} field. */
        @NativeType("uint32_t")
        public int maxGeometryOutputComponents() { return VkPhysicalDeviceLimits.nmaxGeometryOutputComponents(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxGeometryOutputVertices} field. */
        @NativeType("uint32_t")
        public int maxGeometryOutputVertices() { return VkPhysicalDeviceLimits.nmaxGeometryOutputVertices(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxGeometryTotalOutputComponents} field. */
        @NativeType("uint32_t")
        public int maxGeometryTotalOutputComponents() { return VkPhysicalDeviceLimits.nmaxGeometryTotalOutputComponents(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxFragmentInputComponents} field. */
        @NativeType("uint32_t")
        public int maxFragmentInputComponents() { return VkPhysicalDeviceLimits.nmaxFragmentInputComponents(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxFragmentOutputAttachments} field. */
        @NativeType("uint32_t")
        public int maxFragmentOutputAttachments() { return VkPhysicalDeviceLimits.nmaxFragmentOutputAttachments(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxFragmentDualSrcAttachments} field. */
        @NativeType("uint32_t")
        public int maxFragmentDualSrcAttachments() { return VkPhysicalDeviceLimits.nmaxFragmentDualSrcAttachments(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxFragmentCombinedOutputResources} field. */
        @NativeType("uint32_t")
        public int maxFragmentCombinedOutputResources() { return VkPhysicalDeviceLimits.nmaxFragmentCombinedOutputResources(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxComputeSharedMemorySize} field. */
        @NativeType("uint32_t")
        public int maxComputeSharedMemorySize() { return VkPhysicalDeviceLimits.nmaxComputeSharedMemorySize(address()); }
        /** @return a {@link IntBuffer} view of the {@link VkPhysicalDeviceLimits#maxComputeWorkGroupCount} field. */
        @NativeType("uint32_t[3]")
        public IntBuffer maxComputeWorkGroupCount() { return VkPhysicalDeviceLimits.nmaxComputeWorkGroupCount(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceLimits#maxComputeWorkGroupCount} field. */
        @NativeType("uint32_t")
        public int maxComputeWorkGroupCount(int index) { return VkPhysicalDeviceLimits.nmaxComputeWorkGroupCount(address(), index); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxComputeWorkGroupInvocations} field. */
        @NativeType("uint32_t")
        public int maxComputeWorkGroupInvocations() { return VkPhysicalDeviceLimits.nmaxComputeWorkGroupInvocations(address()); }
        /** @return a {@link IntBuffer} view of the {@link VkPhysicalDeviceLimits#maxComputeWorkGroupSize} field. */
        @NativeType("uint32_t[3]")
        public IntBuffer maxComputeWorkGroupSize() { return VkPhysicalDeviceLimits.nmaxComputeWorkGroupSize(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceLimits#maxComputeWorkGroupSize} field. */
        @NativeType("uint32_t")
        public int maxComputeWorkGroupSize(int index) { return VkPhysicalDeviceLimits.nmaxComputeWorkGroupSize(address(), index); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#subPixelPrecisionBits} field. */
        @NativeType("uint32_t")
        public int subPixelPrecisionBits() { return VkPhysicalDeviceLimits.nsubPixelPrecisionBits(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#subTexelPrecisionBits} field. */
        @NativeType("uint32_t")
        public int subTexelPrecisionBits() { return VkPhysicalDeviceLimits.nsubTexelPrecisionBits(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#mipmapPrecisionBits} field. */
        @NativeType("uint32_t")
        public int mipmapPrecisionBits() { return VkPhysicalDeviceLimits.nmipmapPrecisionBits(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxDrawIndexedIndexValue} field. */
        @NativeType("uint32_t")
        public int maxDrawIndexedIndexValue() { return VkPhysicalDeviceLimits.nmaxDrawIndexedIndexValue(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxDrawIndirectCount} field. */
        @NativeType("uint32_t")
        public int maxDrawIndirectCount() { return VkPhysicalDeviceLimits.nmaxDrawIndirectCount(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxSamplerLodBias} field. */
        public float maxSamplerLodBias() { return VkPhysicalDeviceLimits.nmaxSamplerLodBias(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxSamplerAnisotropy} field. */
        public float maxSamplerAnisotropy() { return VkPhysicalDeviceLimits.nmaxSamplerAnisotropy(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxViewports} field. */
        @NativeType("uint32_t")
        public int maxViewports() { return VkPhysicalDeviceLimits.nmaxViewports(address()); }
        /** @return a {@link IntBuffer} view of the {@link VkPhysicalDeviceLimits#maxViewportDimensions} field. */
        @NativeType("uint32_t[2]")
        public IntBuffer maxViewportDimensions() { return VkPhysicalDeviceLimits.nmaxViewportDimensions(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceLimits#maxViewportDimensions} field. */
        @NativeType("uint32_t")
        public int maxViewportDimensions(int index) { return VkPhysicalDeviceLimits.nmaxViewportDimensions(address(), index); }
        /** @return a {@link FloatBuffer} view of the {@link VkPhysicalDeviceLimits#viewportBoundsRange} field. */
        @NativeType("float[2]")
        public FloatBuffer viewportBoundsRange() { return VkPhysicalDeviceLimits.nviewportBoundsRange(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceLimits#viewportBoundsRange} field. */
        public float viewportBoundsRange(int index) { return VkPhysicalDeviceLimits.nviewportBoundsRange(address(), index); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#viewportSubPixelBits} field. */
        @NativeType("uint32_t")
        public int viewportSubPixelBits() { return VkPhysicalDeviceLimits.nviewportSubPixelBits(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#minMemoryMapAlignment} field. */
        @NativeType("size_t")
        public long minMemoryMapAlignment() { return VkPhysicalDeviceLimits.nminMemoryMapAlignment(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#minTexelBufferOffsetAlignment} field. */
        @NativeType("VkDeviceSize")
        public long minTexelBufferOffsetAlignment() { return VkPhysicalDeviceLimits.nminTexelBufferOffsetAlignment(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#minUniformBufferOffsetAlignment} field. */
        @NativeType("VkDeviceSize")
        public long minUniformBufferOffsetAlignment() { return VkPhysicalDeviceLimits.nminUniformBufferOffsetAlignment(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#minStorageBufferOffsetAlignment} field. */
        @NativeType("VkDeviceSize")
        public long minStorageBufferOffsetAlignment() { return VkPhysicalDeviceLimits.nminStorageBufferOffsetAlignment(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#minTexelOffset} field. */
        @NativeType("int32_t")
        public int minTexelOffset() { return VkPhysicalDeviceLimits.nminTexelOffset(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxTexelOffset} field. */
        @NativeType("uint32_t")
        public int maxTexelOffset() { return VkPhysicalDeviceLimits.nmaxTexelOffset(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#minTexelGatherOffset} field. */
        @NativeType("int32_t")
        public int minTexelGatherOffset() { return VkPhysicalDeviceLimits.nminTexelGatherOffset(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxTexelGatherOffset} field. */
        @NativeType("uint32_t")
        public int maxTexelGatherOffset() { return VkPhysicalDeviceLimits.nmaxTexelGatherOffset(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#minInterpolationOffset} field. */
        public float minInterpolationOffset() { return VkPhysicalDeviceLimits.nminInterpolationOffset(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxInterpolationOffset} field. */
        public float maxInterpolationOffset() { return VkPhysicalDeviceLimits.nmaxInterpolationOffset(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#subPixelInterpolationOffsetBits} field. */
        @NativeType("uint32_t")
        public int subPixelInterpolationOffsetBits() { return VkPhysicalDeviceLimits.nsubPixelInterpolationOffsetBits(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxFramebufferWidth} field. */
        @NativeType("uint32_t")
        public int maxFramebufferWidth() { return VkPhysicalDeviceLimits.nmaxFramebufferWidth(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxFramebufferHeight} field. */
        @NativeType("uint32_t")
        public int maxFramebufferHeight() { return VkPhysicalDeviceLimits.nmaxFramebufferHeight(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxFramebufferLayers} field. */
        @NativeType("uint32_t")
        public int maxFramebufferLayers() { return VkPhysicalDeviceLimits.nmaxFramebufferLayers(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#framebufferColorSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int framebufferColorSampleCounts() { return VkPhysicalDeviceLimits.nframebufferColorSampleCounts(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#framebufferDepthSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int framebufferDepthSampleCounts() { return VkPhysicalDeviceLimits.nframebufferDepthSampleCounts(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#framebufferStencilSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int framebufferStencilSampleCounts() { return VkPhysicalDeviceLimits.nframebufferStencilSampleCounts(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#framebufferNoAttachmentsSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int framebufferNoAttachmentsSampleCounts() { return VkPhysicalDeviceLimits.nframebufferNoAttachmentsSampleCounts(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxColorAttachments} field. */
        @NativeType("uint32_t")
        public int maxColorAttachments() { return VkPhysicalDeviceLimits.nmaxColorAttachments(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#sampledImageColorSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int sampledImageColorSampleCounts() { return VkPhysicalDeviceLimits.nsampledImageColorSampleCounts(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#sampledImageIntegerSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int sampledImageIntegerSampleCounts() { return VkPhysicalDeviceLimits.nsampledImageIntegerSampleCounts(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#sampledImageDepthSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int sampledImageDepthSampleCounts() { return VkPhysicalDeviceLimits.nsampledImageDepthSampleCounts(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#sampledImageStencilSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int sampledImageStencilSampleCounts() { return VkPhysicalDeviceLimits.nsampledImageStencilSampleCounts(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#storageImageSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int storageImageSampleCounts() { return VkPhysicalDeviceLimits.nstorageImageSampleCounts(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxSampleMaskWords} field. */
        @NativeType("uint32_t")
        public int maxSampleMaskWords() { return VkPhysicalDeviceLimits.nmaxSampleMaskWords(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#timestampComputeAndGraphics} field. */
        @NativeType("VkBool32")
        public boolean timestampComputeAndGraphics() { return VkPhysicalDeviceLimits.ntimestampComputeAndGraphics(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceLimits#timestampPeriod} field. */
        public float timestampPeriod() { return VkPhysicalDeviceLimits.ntimestampPeriod(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxClipDistances} field. */
        @NativeType("uint32_t")
        public int maxClipDistances() { return VkPhysicalDeviceLimits.nmaxClipDistances(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxCullDistances} field. */
        @NativeType("uint32_t")
        public int maxCullDistances() { return VkPhysicalDeviceLimits.nmaxCullDistances(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#maxCombinedClipAndCullDistances} field. */
        @NativeType("uint32_t")
        public int maxCombinedClipAndCullDistances() { return VkPhysicalDeviceLimits.nmaxCombinedClipAndCullDistances(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#discreteQueuePriorities} field. */
        @NativeType("uint32_t")
        public int discreteQueuePriorities() { return VkPhysicalDeviceLimits.ndiscreteQueuePriorities(address()); }
        /** @return a {@link FloatBuffer} view of the {@link VkPhysicalDeviceLimits#pointSizeRange} field. */
        @NativeType("float[2]")
        public FloatBuffer pointSizeRange() { return VkPhysicalDeviceLimits.npointSizeRange(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceLimits#pointSizeRange} field. */
        public float pointSizeRange(int index) { return VkPhysicalDeviceLimits.npointSizeRange(address(), index); }
        /** @return a {@link FloatBuffer} view of the {@link VkPhysicalDeviceLimits#lineWidthRange} field. */
        @NativeType("float[2]")
        public FloatBuffer lineWidthRange() { return VkPhysicalDeviceLimits.nlineWidthRange(address()); }
        /** @return the value at the specified index of the {@link VkPhysicalDeviceLimits#lineWidthRange} field. */
        public float lineWidthRange(int index) { return VkPhysicalDeviceLimits.nlineWidthRange(address(), index); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#pointSizeGranularity} field. */
        public float pointSizeGranularity() { return VkPhysicalDeviceLimits.npointSizeGranularity(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#lineWidthGranularity} field. */
        public float lineWidthGranularity() { return VkPhysicalDeviceLimits.nlineWidthGranularity(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#strictLines} field. */
        @NativeType("VkBool32")
        public boolean strictLines() { return VkPhysicalDeviceLimits.nstrictLines(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceLimits#standardSampleLocations} field. */
        @NativeType("VkBool32")
        public boolean standardSampleLocations() { return VkPhysicalDeviceLimits.nstandardSampleLocations(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceLimits#optimalBufferCopyOffsetAlignment} field. */
        @NativeType("VkDeviceSize")
        public long optimalBufferCopyOffsetAlignment() { return VkPhysicalDeviceLimits.noptimalBufferCopyOffsetAlignment(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#optimalBufferCopyRowPitchAlignment} field. */
        @NativeType("VkDeviceSize")
        public long optimalBufferCopyRowPitchAlignment() { return VkPhysicalDeviceLimits.noptimalBufferCopyRowPitchAlignment(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLimits#nonCoherentAtomSize} field. */
        @NativeType("VkDeviceSize")
        public long nonCoherentAtomSize() { return VkPhysicalDeviceLimits.nnonCoherentAtomSize(address()); }

    }

}
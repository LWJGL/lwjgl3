/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceLimits {
 *     uint32_t maxImageDimension1D;
 *     uint32_t maxImageDimension2D;
 *     uint32_t maxImageDimension3D;
 *     uint32_t maxImageDimensionCube;
 *     uint32_t maxImageArrayLayers;
 *     uint32_t maxTexelBufferElements;
 *     uint32_t maxUniformBufferRange;
 *     uint32_t maxStorageBufferRange;
 *     uint32_t maxPushConstantsSize;
 *     uint32_t maxMemoryAllocationCount;
 *     uint32_t maxSamplerAllocationCount;
 *     VkDeviceSize bufferImageGranularity;
 *     VkDeviceSize sparseAddressSpaceSize;
 *     uint32_t maxBoundDescriptorSets;
 *     uint32_t maxPerStageDescriptorSamplers;
 *     uint32_t maxPerStageDescriptorUniformBuffers;
 *     uint32_t maxPerStageDescriptorStorageBuffers;
 *     uint32_t maxPerStageDescriptorSampledImages;
 *     uint32_t maxPerStageDescriptorStorageImages;
 *     uint32_t maxPerStageDescriptorInputAttachments;
 *     uint32_t maxPerStageResources;
 *     uint32_t maxDescriptorSetSamplers;
 *     uint32_t maxDescriptorSetUniformBuffers;
 *     uint32_t maxDescriptorSetUniformBuffersDynamic;
 *     uint32_t maxDescriptorSetStorageBuffers;
 *     uint32_t maxDescriptorSetStorageBuffersDynamic;
 *     uint32_t maxDescriptorSetSampledImages;
 *     uint32_t maxDescriptorSetStorageImages;
 *     uint32_t maxDescriptorSetInputAttachments;
 *     uint32_t maxVertexInputAttributes;
 *     uint32_t maxVertexInputBindings;
 *     uint32_t maxVertexInputAttributeOffset;
 *     uint32_t maxVertexInputBindingStride;
 *     uint32_t maxVertexOutputComponents;
 *     uint32_t maxTessellationGenerationLevel;
 *     uint32_t maxTessellationPatchSize;
 *     uint32_t maxTessellationControlPerVertexInputComponents;
 *     uint32_t maxTessellationControlPerVertexOutputComponents;
 *     uint32_t maxTessellationControlPerPatchOutputComponents;
 *     uint32_t maxTessellationControlTotalOutputComponents;
 *     uint32_t maxTessellationEvaluationInputComponents;
 *     uint32_t maxTessellationEvaluationOutputComponents;
 *     uint32_t maxGeometryShaderInvocations;
 *     uint32_t maxGeometryInputComponents;
 *     uint32_t maxGeometryOutputComponents;
 *     uint32_t maxGeometryOutputVertices;
 *     uint32_t maxGeometryTotalOutputComponents;
 *     uint32_t maxFragmentInputComponents;
 *     uint32_t maxFragmentOutputAttachments;
 *     uint32_t maxFragmentDualSrcAttachments;
 *     uint32_t maxFragmentCombinedOutputResources;
 *     uint32_t maxComputeSharedMemorySize;
 *     uint32_t maxComputeWorkGroupCount[3];
 *     uint32_t maxComputeWorkGroupInvocations;
 *     uint32_t maxComputeWorkGroupSize[3];
 *     uint32_t subPixelPrecisionBits;
 *     uint32_t subTexelPrecisionBits;
 *     uint32_t mipmapPrecisionBits;
 *     uint32_t maxDrawIndexedIndexValue;
 *     uint32_t maxDrawIndirectCount;
 *     float maxSamplerLodBias;
 *     float maxSamplerAnisotropy;
 *     uint32_t maxViewports;
 *     uint32_t maxViewportDimensions[2];
 *     float viewportBoundsRange[2];
 *     uint32_t viewportSubPixelBits;
 *     size_t minMemoryMapAlignment;
 *     VkDeviceSize minTexelBufferOffsetAlignment;
 *     VkDeviceSize minUniformBufferOffsetAlignment;
 *     VkDeviceSize minStorageBufferOffsetAlignment;
 *     int32_t minTexelOffset;
 *     uint32_t maxTexelOffset;
 *     int32_t minTexelGatherOffset;
 *     uint32_t maxTexelGatherOffset;
 *     float minInterpolationOffset;
 *     float maxInterpolationOffset;
 *     uint32_t subPixelInterpolationOffsetBits;
 *     uint32_t maxFramebufferWidth;
 *     uint32_t maxFramebufferHeight;
 *     uint32_t maxFramebufferLayers;
 *     VkSampleCountFlags framebufferColorSampleCounts;
 *     VkSampleCountFlags framebufferDepthSampleCounts;
 *     VkSampleCountFlags framebufferStencilSampleCounts;
 *     VkSampleCountFlags framebufferNoAttachmentsSampleCounts;
 *     uint32_t maxColorAttachments;
 *     VkSampleCountFlags sampledImageColorSampleCounts;
 *     VkSampleCountFlags sampledImageIntegerSampleCounts;
 *     VkSampleCountFlags sampledImageDepthSampleCounts;
 *     VkSampleCountFlags sampledImageStencilSampleCounts;
 *     VkSampleCountFlags storageImageSampleCounts;
 *     uint32_t maxSampleMaskWords;
 *     VkBool32 timestampComputeAndGraphics;
 *     float timestampPeriod;
 *     uint32_t maxClipDistances;
 *     uint32_t maxCullDistances;
 *     uint32_t maxCombinedClipAndCullDistances;
 *     uint32_t discreteQueuePriorities;
 *     float pointSizeRange[2];
 *     float lineWidthRange[2];
 *     float pointSizeGranularity;
 *     float lineWidthGranularity;
 *     VkBool32 strictLines;
 *     VkBool32 standardSampleLocations;
 *     VkDeviceSize optimalBufferCopyOffsetAlignment;
 *     VkDeviceSize optimalBufferCopyRowPitchAlignment;
 *     VkDeviceSize nonCoherentAtomSize;
 * }}</pre>
 */
public class VkPhysicalDeviceLimits extends Struct<VkPhysicalDeviceLimits> {

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

    protected VkPhysicalDeviceLimits(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceLimits create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceLimits(address, container);
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

    /** @return the value of the {@code maxImageDimension1D} field. */
    @NativeType("uint32_t")
    public int maxImageDimension1D() { return nmaxImageDimension1D(address()); }
    /** @return the value of the {@code maxImageDimension2D} field. */
    @NativeType("uint32_t")
    public int maxImageDimension2D() { return nmaxImageDimension2D(address()); }
    /** @return the value of the {@code maxImageDimension3D} field. */
    @NativeType("uint32_t")
    public int maxImageDimension3D() { return nmaxImageDimension3D(address()); }
    /** @return the value of the {@code maxImageDimensionCube} field. */
    @NativeType("uint32_t")
    public int maxImageDimensionCube() { return nmaxImageDimensionCube(address()); }
    /** @return the value of the {@code maxImageArrayLayers} field. */
    @NativeType("uint32_t")
    public int maxImageArrayLayers() { return nmaxImageArrayLayers(address()); }
    /** @return the value of the {@code maxTexelBufferElements} field. */
    @NativeType("uint32_t")
    public int maxTexelBufferElements() { return nmaxTexelBufferElements(address()); }
    /** @return the value of the {@code maxUniformBufferRange} field. */
    @NativeType("uint32_t")
    public int maxUniformBufferRange() { return nmaxUniformBufferRange(address()); }
    /** @return the value of the {@code maxStorageBufferRange} field. */
    @NativeType("uint32_t")
    public int maxStorageBufferRange() { return nmaxStorageBufferRange(address()); }
    /** @return the value of the {@code maxPushConstantsSize} field. */
    @NativeType("uint32_t")
    public int maxPushConstantsSize() { return nmaxPushConstantsSize(address()); }
    /** @return the value of the {@code maxMemoryAllocationCount} field. */
    @NativeType("uint32_t")
    public int maxMemoryAllocationCount() { return nmaxMemoryAllocationCount(address()); }
    /** @return the value of the {@code maxSamplerAllocationCount} field. */
    @NativeType("uint32_t")
    public int maxSamplerAllocationCount() { return nmaxSamplerAllocationCount(address()); }
    /** @return the value of the {@code bufferImageGranularity} field. */
    @NativeType("VkDeviceSize")
    public long bufferImageGranularity() { return nbufferImageGranularity(address()); }
    /** @return the value of the {@code sparseAddressSpaceSize} field. */
    @NativeType("VkDeviceSize")
    public long sparseAddressSpaceSize() { return nsparseAddressSpaceSize(address()); }
    /** @return the value of the {@code maxBoundDescriptorSets} field. */
    @NativeType("uint32_t")
    public int maxBoundDescriptorSets() { return nmaxBoundDescriptorSets(address()); }
    /** @return the value of the {@code maxPerStageDescriptorSamplers} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorSamplers() { return nmaxPerStageDescriptorSamplers(address()); }
    /** @return the value of the {@code maxPerStageDescriptorUniformBuffers} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorUniformBuffers() { return nmaxPerStageDescriptorUniformBuffers(address()); }
    /** @return the value of the {@code maxPerStageDescriptorStorageBuffers} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorStorageBuffers() { return nmaxPerStageDescriptorStorageBuffers(address()); }
    /** @return the value of the {@code maxPerStageDescriptorSampledImages} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorSampledImages() { return nmaxPerStageDescriptorSampledImages(address()); }
    /** @return the value of the {@code maxPerStageDescriptorStorageImages} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorStorageImages() { return nmaxPerStageDescriptorStorageImages(address()); }
    /** @return the value of the {@code maxPerStageDescriptorInputAttachments} field. */
    @NativeType("uint32_t")
    public int maxPerStageDescriptorInputAttachments() { return nmaxPerStageDescriptorInputAttachments(address()); }
    /** @return the value of the {@code maxPerStageResources} field. */
    @NativeType("uint32_t")
    public int maxPerStageResources() { return nmaxPerStageResources(address()); }
    /** @return the value of the {@code maxDescriptorSetSamplers} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetSamplers() { return nmaxDescriptorSetSamplers(address()); }
    /** @return the value of the {@code maxDescriptorSetUniformBuffers} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUniformBuffers() { return nmaxDescriptorSetUniformBuffers(address()); }
    /** @return the value of the {@code maxDescriptorSetUniformBuffersDynamic} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetUniformBuffersDynamic() { return nmaxDescriptorSetUniformBuffersDynamic(address()); }
    /** @return the value of the {@code maxDescriptorSetStorageBuffers} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetStorageBuffers() { return nmaxDescriptorSetStorageBuffers(address()); }
    /** @return the value of the {@code maxDescriptorSetStorageBuffersDynamic} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetStorageBuffersDynamic() { return nmaxDescriptorSetStorageBuffersDynamic(address()); }
    /** @return the value of the {@code maxDescriptorSetSampledImages} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetSampledImages() { return nmaxDescriptorSetSampledImages(address()); }
    /** @return the value of the {@code maxDescriptorSetStorageImages} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetStorageImages() { return nmaxDescriptorSetStorageImages(address()); }
    /** @return the value of the {@code maxDescriptorSetInputAttachments} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetInputAttachments() { return nmaxDescriptorSetInputAttachments(address()); }
    /** @return the value of the {@code maxVertexInputAttributes} field. */
    @NativeType("uint32_t")
    public int maxVertexInputAttributes() { return nmaxVertexInputAttributes(address()); }
    /** @return the value of the {@code maxVertexInputBindings} field. */
    @NativeType("uint32_t")
    public int maxVertexInputBindings() { return nmaxVertexInputBindings(address()); }
    /** @return the value of the {@code maxVertexInputAttributeOffset} field. */
    @NativeType("uint32_t")
    public int maxVertexInputAttributeOffset() { return nmaxVertexInputAttributeOffset(address()); }
    /** @return the value of the {@code maxVertexInputBindingStride} field. */
    @NativeType("uint32_t")
    public int maxVertexInputBindingStride() { return nmaxVertexInputBindingStride(address()); }
    /** @return the value of the {@code maxVertexOutputComponents} field. */
    @NativeType("uint32_t")
    public int maxVertexOutputComponents() { return nmaxVertexOutputComponents(address()); }
    /** @return the value of the {@code maxTessellationGenerationLevel} field. */
    @NativeType("uint32_t")
    public int maxTessellationGenerationLevel() { return nmaxTessellationGenerationLevel(address()); }
    /** @return the value of the {@code maxTessellationPatchSize} field. */
    @NativeType("uint32_t")
    public int maxTessellationPatchSize() { return nmaxTessellationPatchSize(address()); }
    /** @return the value of the {@code maxTessellationControlPerVertexInputComponents} field. */
    @NativeType("uint32_t")
    public int maxTessellationControlPerVertexInputComponents() { return nmaxTessellationControlPerVertexInputComponents(address()); }
    /** @return the value of the {@code maxTessellationControlPerVertexOutputComponents} field. */
    @NativeType("uint32_t")
    public int maxTessellationControlPerVertexOutputComponents() { return nmaxTessellationControlPerVertexOutputComponents(address()); }
    /** @return the value of the {@code maxTessellationControlPerPatchOutputComponents} field. */
    @NativeType("uint32_t")
    public int maxTessellationControlPerPatchOutputComponents() { return nmaxTessellationControlPerPatchOutputComponents(address()); }
    /** @return the value of the {@code maxTessellationControlTotalOutputComponents} field. */
    @NativeType("uint32_t")
    public int maxTessellationControlTotalOutputComponents() { return nmaxTessellationControlTotalOutputComponents(address()); }
    /** @return the value of the {@code maxTessellationEvaluationInputComponents} field. */
    @NativeType("uint32_t")
    public int maxTessellationEvaluationInputComponents() { return nmaxTessellationEvaluationInputComponents(address()); }
    /** @return the value of the {@code maxTessellationEvaluationOutputComponents} field. */
    @NativeType("uint32_t")
    public int maxTessellationEvaluationOutputComponents() { return nmaxTessellationEvaluationOutputComponents(address()); }
    /** @return the value of the {@code maxGeometryShaderInvocations} field. */
    @NativeType("uint32_t")
    public int maxGeometryShaderInvocations() { return nmaxGeometryShaderInvocations(address()); }
    /** @return the value of the {@code maxGeometryInputComponents} field. */
    @NativeType("uint32_t")
    public int maxGeometryInputComponents() { return nmaxGeometryInputComponents(address()); }
    /** @return the value of the {@code maxGeometryOutputComponents} field. */
    @NativeType("uint32_t")
    public int maxGeometryOutputComponents() { return nmaxGeometryOutputComponents(address()); }
    /** @return the value of the {@code maxGeometryOutputVertices} field. */
    @NativeType("uint32_t")
    public int maxGeometryOutputVertices() { return nmaxGeometryOutputVertices(address()); }
    /** @return the value of the {@code maxGeometryTotalOutputComponents} field. */
    @NativeType("uint32_t")
    public int maxGeometryTotalOutputComponents() { return nmaxGeometryTotalOutputComponents(address()); }
    /** @return the value of the {@code maxFragmentInputComponents} field. */
    @NativeType("uint32_t")
    public int maxFragmentInputComponents() { return nmaxFragmentInputComponents(address()); }
    /** @return the value of the {@code maxFragmentOutputAttachments} field. */
    @NativeType("uint32_t")
    public int maxFragmentOutputAttachments() { return nmaxFragmentOutputAttachments(address()); }
    /** @return the value of the {@code maxFragmentDualSrcAttachments} field. */
    @NativeType("uint32_t")
    public int maxFragmentDualSrcAttachments() { return nmaxFragmentDualSrcAttachments(address()); }
    /** @return the value of the {@code maxFragmentCombinedOutputResources} field. */
    @NativeType("uint32_t")
    public int maxFragmentCombinedOutputResources() { return nmaxFragmentCombinedOutputResources(address()); }
    /** @return the value of the {@code maxComputeSharedMemorySize} field. */
    @NativeType("uint32_t")
    public int maxComputeSharedMemorySize() { return nmaxComputeSharedMemorySize(address()); }
    /** @return a {@link IntBuffer} view of the {@code maxComputeWorkGroupCount} field. */
    @NativeType("uint32_t[3]")
    public IntBuffer maxComputeWorkGroupCount() { return nmaxComputeWorkGroupCount(address()); }
    /** @return the value at the specified index of the {@code maxComputeWorkGroupCount} field. */
    @NativeType("uint32_t")
    public int maxComputeWorkGroupCount(int index) { return nmaxComputeWorkGroupCount(address(), index); }
    /** @return the value of the {@code maxComputeWorkGroupInvocations} field. */
    @NativeType("uint32_t")
    public int maxComputeWorkGroupInvocations() { return nmaxComputeWorkGroupInvocations(address()); }
    /** @return a {@link IntBuffer} view of the {@code maxComputeWorkGroupSize} field. */
    @NativeType("uint32_t[3]")
    public IntBuffer maxComputeWorkGroupSize() { return nmaxComputeWorkGroupSize(address()); }
    /** @return the value at the specified index of the {@code maxComputeWorkGroupSize} field. */
    @NativeType("uint32_t")
    public int maxComputeWorkGroupSize(int index) { return nmaxComputeWorkGroupSize(address(), index); }
    /** @return the value of the {@code subPixelPrecisionBits} field. */
    @NativeType("uint32_t")
    public int subPixelPrecisionBits() { return nsubPixelPrecisionBits(address()); }
    /** @return the value of the {@code subTexelPrecisionBits} field. */
    @NativeType("uint32_t")
    public int subTexelPrecisionBits() { return nsubTexelPrecisionBits(address()); }
    /** @return the value of the {@code mipmapPrecisionBits} field. */
    @NativeType("uint32_t")
    public int mipmapPrecisionBits() { return nmipmapPrecisionBits(address()); }
    /** @return the value of the {@code maxDrawIndexedIndexValue} field. */
    @NativeType("uint32_t")
    public int maxDrawIndexedIndexValue() { return nmaxDrawIndexedIndexValue(address()); }
    /** @return the value of the {@code maxDrawIndirectCount} field. */
    @NativeType("uint32_t")
    public int maxDrawIndirectCount() { return nmaxDrawIndirectCount(address()); }
    /** @return the value of the {@code maxSamplerLodBias} field. */
    public float maxSamplerLodBias() { return nmaxSamplerLodBias(address()); }
    /** @return the value of the {@code maxSamplerAnisotropy} field. */
    public float maxSamplerAnisotropy() { return nmaxSamplerAnisotropy(address()); }
    /** @return the value of the {@code maxViewports} field. */
    @NativeType("uint32_t")
    public int maxViewports() { return nmaxViewports(address()); }
    /** @return a {@link IntBuffer} view of the {@code maxViewportDimensions} field. */
    @NativeType("uint32_t[2]")
    public IntBuffer maxViewportDimensions() { return nmaxViewportDimensions(address()); }
    /** @return the value at the specified index of the {@code maxViewportDimensions} field. */
    @NativeType("uint32_t")
    public int maxViewportDimensions(int index) { return nmaxViewportDimensions(address(), index); }
    /** @return a {@link FloatBuffer} view of the {@code viewportBoundsRange} field. */
    @NativeType("float[2]")
    public FloatBuffer viewportBoundsRange() { return nviewportBoundsRange(address()); }
    /** @return the value at the specified index of the {@code viewportBoundsRange} field. */
    public float viewportBoundsRange(int index) { return nviewportBoundsRange(address(), index); }
    /** @return the value of the {@code viewportSubPixelBits} field. */
    @NativeType("uint32_t")
    public int viewportSubPixelBits() { return nviewportSubPixelBits(address()); }
    /** @return the value of the {@code minMemoryMapAlignment} field. */
    @NativeType("size_t")
    public long minMemoryMapAlignment() { return nminMemoryMapAlignment(address()); }
    /** @return the value of the {@code minTexelBufferOffsetAlignment} field. */
    @NativeType("VkDeviceSize")
    public long minTexelBufferOffsetAlignment() { return nminTexelBufferOffsetAlignment(address()); }
    /** @return the value of the {@code minUniformBufferOffsetAlignment} field. */
    @NativeType("VkDeviceSize")
    public long minUniformBufferOffsetAlignment() { return nminUniformBufferOffsetAlignment(address()); }
    /** @return the value of the {@code minStorageBufferOffsetAlignment} field. */
    @NativeType("VkDeviceSize")
    public long minStorageBufferOffsetAlignment() { return nminStorageBufferOffsetAlignment(address()); }
    /** @return the value of the {@code minTexelOffset} field. */
    @NativeType("int32_t")
    public int minTexelOffset() { return nminTexelOffset(address()); }
    /** @return the value of the {@code maxTexelOffset} field. */
    @NativeType("uint32_t")
    public int maxTexelOffset() { return nmaxTexelOffset(address()); }
    /** @return the value of the {@code minTexelGatherOffset} field. */
    @NativeType("int32_t")
    public int minTexelGatherOffset() { return nminTexelGatherOffset(address()); }
    /** @return the value of the {@code maxTexelGatherOffset} field. */
    @NativeType("uint32_t")
    public int maxTexelGatherOffset() { return nmaxTexelGatherOffset(address()); }
    /** @return the value of the {@code minInterpolationOffset} field. */
    public float minInterpolationOffset() { return nminInterpolationOffset(address()); }
    /** @return the value of the {@code maxInterpolationOffset} field. */
    public float maxInterpolationOffset() { return nmaxInterpolationOffset(address()); }
    /** @return the value of the {@code subPixelInterpolationOffsetBits} field. */
    @NativeType("uint32_t")
    public int subPixelInterpolationOffsetBits() { return nsubPixelInterpolationOffsetBits(address()); }
    /** @return the value of the {@code maxFramebufferWidth} field. */
    @NativeType("uint32_t")
    public int maxFramebufferWidth() { return nmaxFramebufferWidth(address()); }
    /** @return the value of the {@code maxFramebufferHeight} field. */
    @NativeType("uint32_t")
    public int maxFramebufferHeight() { return nmaxFramebufferHeight(address()); }
    /** @return the value of the {@code maxFramebufferLayers} field. */
    @NativeType("uint32_t")
    public int maxFramebufferLayers() { return nmaxFramebufferLayers(address()); }
    /** @return the value of the {@code framebufferColorSampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int framebufferColorSampleCounts() { return nframebufferColorSampleCounts(address()); }
    /** @return the value of the {@code framebufferDepthSampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int framebufferDepthSampleCounts() { return nframebufferDepthSampleCounts(address()); }
    /** @return the value of the {@code framebufferStencilSampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int framebufferStencilSampleCounts() { return nframebufferStencilSampleCounts(address()); }
    /** @return the value of the {@code framebufferNoAttachmentsSampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int framebufferNoAttachmentsSampleCounts() { return nframebufferNoAttachmentsSampleCounts(address()); }
    /** @return the value of the {@code maxColorAttachments} field. */
    @NativeType("uint32_t")
    public int maxColorAttachments() { return nmaxColorAttachments(address()); }
    /** @return the value of the {@code sampledImageColorSampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int sampledImageColorSampleCounts() { return nsampledImageColorSampleCounts(address()); }
    /** @return the value of the {@code sampledImageIntegerSampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int sampledImageIntegerSampleCounts() { return nsampledImageIntegerSampleCounts(address()); }
    /** @return the value of the {@code sampledImageDepthSampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int sampledImageDepthSampleCounts() { return nsampledImageDepthSampleCounts(address()); }
    /** @return the value of the {@code sampledImageStencilSampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int sampledImageStencilSampleCounts() { return nsampledImageStencilSampleCounts(address()); }
    /** @return the value of the {@code storageImageSampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int storageImageSampleCounts() { return nstorageImageSampleCounts(address()); }
    /** @return the value of the {@code maxSampleMaskWords} field. */
    @NativeType("uint32_t")
    public int maxSampleMaskWords() { return nmaxSampleMaskWords(address()); }
    /** @return the value of the {@code timestampComputeAndGraphics} field. */
    @NativeType("VkBool32")
    public boolean timestampComputeAndGraphics() { return ntimestampComputeAndGraphics(address()) != 0; }
    /** @return the value of the {@code timestampPeriod} field. */
    public float timestampPeriod() { return ntimestampPeriod(address()); }
    /** @return the value of the {@code maxClipDistances} field. */
    @NativeType("uint32_t")
    public int maxClipDistances() { return nmaxClipDistances(address()); }
    /** @return the value of the {@code maxCullDistances} field. */
    @NativeType("uint32_t")
    public int maxCullDistances() { return nmaxCullDistances(address()); }
    /** @return the value of the {@code maxCombinedClipAndCullDistances} field. */
    @NativeType("uint32_t")
    public int maxCombinedClipAndCullDistances() { return nmaxCombinedClipAndCullDistances(address()); }
    /** @return the value of the {@code discreteQueuePriorities} field. */
    @NativeType("uint32_t")
    public int discreteQueuePriorities() { return ndiscreteQueuePriorities(address()); }
    /** @return a {@link FloatBuffer} view of the {@code pointSizeRange} field. */
    @NativeType("float[2]")
    public FloatBuffer pointSizeRange() { return npointSizeRange(address()); }
    /** @return the value at the specified index of the {@code pointSizeRange} field. */
    public float pointSizeRange(int index) { return npointSizeRange(address(), index); }
    /** @return a {@link FloatBuffer} view of the {@code lineWidthRange} field. */
    @NativeType("float[2]")
    public FloatBuffer lineWidthRange() { return nlineWidthRange(address()); }
    /** @return the value at the specified index of the {@code lineWidthRange} field. */
    public float lineWidthRange(int index) { return nlineWidthRange(address(), index); }
    /** @return the value of the {@code pointSizeGranularity} field. */
    public float pointSizeGranularity() { return npointSizeGranularity(address()); }
    /** @return the value of the {@code lineWidthGranularity} field. */
    public float lineWidthGranularity() { return nlineWidthGranularity(address()); }
    /** @return the value of the {@code strictLines} field. */
    @NativeType("VkBool32")
    public boolean strictLines() { return nstrictLines(address()) != 0; }
    /** @return the value of the {@code standardSampleLocations} field. */
    @NativeType("VkBool32")
    public boolean standardSampleLocations() { return nstandardSampleLocations(address()) != 0; }
    /** @return the value of the {@code optimalBufferCopyOffsetAlignment} field. */
    @NativeType("VkDeviceSize")
    public long optimalBufferCopyOffsetAlignment() { return noptimalBufferCopyOffsetAlignment(address()); }
    /** @return the value of the {@code optimalBufferCopyRowPitchAlignment} field. */
    @NativeType("VkDeviceSize")
    public long optimalBufferCopyRowPitchAlignment() { return noptimalBufferCopyRowPitchAlignment(address()); }
    /** @return the value of the {@code nonCoherentAtomSize} field. */
    @NativeType("VkDeviceSize")
    public long nonCoherentAtomSize() { return nnonCoherentAtomSize(address()); }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceLimits} instance for the specified memory address. */
    public static VkPhysicalDeviceLimits create(long address) {
        return new VkPhysicalDeviceLimits(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceLimits createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceLimits(address, null);
    }

    /**
     * Create a {@link VkPhysicalDeviceLimits.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLimits.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceLimits.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #maxImageDimension1D}. */
    public static int nmaxImageDimension1D(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXIMAGEDIMENSION1D); }
    /** Unsafe version of {@link #maxImageDimension2D}. */
    public static int nmaxImageDimension2D(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXIMAGEDIMENSION2D); }
    /** Unsafe version of {@link #maxImageDimension3D}. */
    public static int nmaxImageDimension3D(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXIMAGEDIMENSION3D); }
    /** Unsafe version of {@link #maxImageDimensionCube}. */
    public static int nmaxImageDimensionCube(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXIMAGEDIMENSIONCUBE); }
    /** Unsafe version of {@link #maxImageArrayLayers}. */
    public static int nmaxImageArrayLayers(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXIMAGEARRAYLAYERS); }
    /** Unsafe version of {@link #maxTexelBufferElements}. */
    public static int nmaxTexelBufferElements(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXTEXELBUFFERELEMENTS); }
    /** Unsafe version of {@link #maxUniformBufferRange}. */
    public static int nmaxUniformBufferRange(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXUNIFORMBUFFERRANGE); }
    /** Unsafe version of {@link #maxStorageBufferRange}. */
    public static int nmaxStorageBufferRange(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXSTORAGEBUFFERRANGE); }
    /** Unsafe version of {@link #maxPushConstantsSize}. */
    public static int nmaxPushConstantsSize(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXPUSHCONSTANTSSIZE); }
    /** Unsafe version of {@link #maxMemoryAllocationCount}. */
    public static int nmaxMemoryAllocationCount(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXMEMORYALLOCATIONCOUNT); }
    /** Unsafe version of {@link #maxSamplerAllocationCount}. */
    public static int nmaxSamplerAllocationCount(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXSAMPLERALLOCATIONCOUNT); }
    /** Unsafe version of {@link #bufferImageGranularity}. */
    public static long nbufferImageGranularity(long struct) { return memGetLong(struct + VkPhysicalDeviceLimits.BUFFERIMAGEGRANULARITY); }
    /** Unsafe version of {@link #sparseAddressSpaceSize}. */
    public static long nsparseAddressSpaceSize(long struct) { return memGetLong(struct + VkPhysicalDeviceLimits.SPARSEADDRESSSPACESIZE); }
    /** Unsafe version of {@link #maxBoundDescriptorSets}. */
    public static int nmaxBoundDescriptorSets(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXBOUNDDESCRIPTORSETS); }
    /** Unsafe version of {@link #maxPerStageDescriptorSamplers}. */
    public static int nmaxPerStageDescriptorSamplers(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORSAMPLERS); }
    /** Unsafe version of {@link #maxPerStageDescriptorUniformBuffers}. */
    public static int nmaxPerStageDescriptorUniformBuffers(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORUNIFORMBUFFERS); }
    /** Unsafe version of {@link #maxPerStageDescriptorStorageBuffers}. */
    public static int nmaxPerStageDescriptorStorageBuffers(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORSTORAGEBUFFERS); }
    /** Unsafe version of {@link #maxPerStageDescriptorSampledImages}. */
    public static int nmaxPerStageDescriptorSampledImages(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORSAMPLEDIMAGES); }
    /** Unsafe version of {@link #maxPerStageDescriptorStorageImages}. */
    public static int nmaxPerStageDescriptorStorageImages(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORSTORAGEIMAGES); }
    /** Unsafe version of {@link #maxPerStageDescriptorInputAttachments}. */
    public static int nmaxPerStageDescriptorInputAttachments(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXPERSTAGEDESCRIPTORINPUTATTACHMENTS); }
    /** Unsafe version of {@link #maxPerStageResources}. */
    public static int nmaxPerStageResources(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXPERSTAGERESOURCES); }
    /** Unsafe version of {@link #maxDescriptorSetSamplers}. */
    public static int nmaxDescriptorSetSamplers(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETSAMPLERS); }
    /** Unsafe version of {@link #maxDescriptorSetUniformBuffers}. */
    public static int nmaxDescriptorSetUniformBuffers(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETUNIFORMBUFFERS); }
    /** Unsafe version of {@link #maxDescriptorSetUniformBuffersDynamic}. */
    public static int nmaxDescriptorSetUniformBuffersDynamic(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETUNIFORMBUFFERSDYNAMIC); }
    /** Unsafe version of {@link #maxDescriptorSetStorageBuffers}. */
    public static int nmaxDescriptorSetStorageBuffers(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETSTORAGEBUFFERS); }
    /** Unsafe version of {@link #maxDescriptorSetStorageBuffersDynamic}. */
    public static int nmaxDescriptorSetStorageBuffersDynamic(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETSTORAGEBUFFERSDYNAMIC); }
    /** Unsafe version of {@link #maxDescriptorSetSampledImages}. */
    public static int nmaxDescriptorSetSampledImages(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETSAMPLEDIMAGES); }
    /** Unsafe version of {@link #maxDescriptorSetStorageImages}. */
    public static int nmaxDescriptorSetStorageImages(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETSTORAGEIMAGES); }
    /** Unsafe version of {@link #maxDescriptorSetInputAttachments}. */
    public static int nmaxDescriptorSetInputAttachments(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXDESCRIPTORSETINPUTATTACHMENTS); }
    /** Unsafe version of {@link #maxVertexInputAttributes}. */
    public static int nmaxVertexInputAttributes(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXVERTEXINPUTATTRIBUTES); }
    /** Unsafe version of {@link #maxVertexInputBindings}. */
    public static int nmaxVertexInputBindings(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXVERTEXINPUTBINDINGS); }
    /** Unsafe version of {@link #maxVertexInputAttributeOffset}. */
    public static int nmaxVertexInputAttributeOffset(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXVERTEXINPUTATTRIBUTEOFFSET); }
    /** Unsafe version of {@link #maxVertexInputBindingStride}. */
    public static int nmaxVertexInputBindingStride(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXVERTEXINPUTBINDINGSTRIDE); }
    /** Unsafe version of {@link #maxVertexOutputComponents}. */
    public static int nmaxVertexOutputComponents(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXVERTEXOUTPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxTessellationGenerationLevel}. */
    public static int nmaxTessellationGenerationLevel(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXTESSELLATIONGENERATIONLEVEL); }
    /** Unsafe version of {@link #maxTessellationPatchSize}. */
    public static int nmaxTessellationPatchSize(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXTESSELLATIONPATCHSIZE); }
    /** Unsafe version of {@link #maxTessellationControlPerVertexInputComponents}. */
    public static int nmaxTessellationControlPerVertexInputComponents(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXTESSELLATIONCONTROLPERVERTEXINPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxTessellationControlPerVertexOutputComponents}. */
    public static int nmaxTessellationControlPerVertexOutputComponents(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXTESSELLATIONCONTROLPERVERTEXOUTPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxTessellationControlPerPatchOutputComponents}. */
    public static int nmaxTessellationControlPerPatchOutputComponents(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXTESSELLATIONCONTROLPERPATCHOUTPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxTessellationControlTotalOutputComponents}. */
    public static int nmaxTessellationControlTotalOutputComponents(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXTESSELLATIONCONTROLTOTALOUTPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxTessellationEvaluationInputComponents}. */
    public static int nmaxTessellationEvaluationInputComponents(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXTESSELLATIONEVALUATIONINPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxTessellationEvaluationOutputComponents}. */
    public static int nmaxTessellationEvaluationOutputComponents(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXTESSELLATIONEVALUATIONOUTPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxGeometryShaderInvocations}. */
    public static int nmaxGeometryShaderInvocations(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXGEOMETRYSHADERINVOCATIONS); }
    /** Unsafe version of {@link #maxGeometryInputComponents}. */
    public static int nmaxGeometryInputComponents(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXGEOMETRYINPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxGeometryOutputComponents}. */
    public static int nmaxGeometryOutputComponents(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXGEOMETRYOUTPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxGeometryOutputVertices}. */
    public static int nmaxGeometryOutputVertices(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXGEOMETRYOUTPUTVERTICES); }
    /** Unsafe version of {@link #maxGeometryTotalOutputComponents}. */
    public static int nmaxGeometryTotalOutputComponents(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXGEOMETRYTOTALOUTPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxFragmentInputComponents}. */
    public static int nmaxFragmentInputComponents(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXFRAGMENTINPUTCOMPONENTS); }
    /** Unsafe version of {@link #maxFragmentOutputAttachments}. */
    public static int nmaxFragmentOutputAttachments(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXFRAGMENTOUTPUTATTACHMENTS); }
    /** Unsafe version of {@link #maxFragmentDualSrcAttachments}. */
    public static int nmaxFragmentDualSrcAttachments(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXFRAGMENTDUALSRCATTACHMENTS); }
    /** Unsafe version of {@link #maxFragmentCombinedOutputResources}. */
    public static int nmaxFragmentCombinedOutputResources(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXFRAGMENTCOMBINEDOUTPUTRESOURCES); }
    /** Unsafe version of {@link #maxComputeSharedMemorySize}. */
    public static int nmaxComputeSharedMemorySize(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXCOMPUTESHAREDMEMORYSIZE); }
    /** Unsafe version of {@link #maxComputeWorkGroupCount}. */
    public static IntBuffer nmaxComputeWorkGroupCount(long struct) { return memIntBuffer(struct + VkPhysicalDeviceLimits.MAXCOMPUTEWORKGROUPCOUNT, 3); }
    /** Unsafe version of {@link #maxComputeWorkGroupCount(int) maxComputeWorkGroupCount}. */
    public static int nmaxComputeWorkGroupCount(long struct, int index) {
        return memGetInt(struct + VkPhysicalDeviceLimits.MAXCOMPUTEWORKGROUPCOUNT + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #maxComputeWorkGroupInvocations}. */
    public static int nmaxComputeWorkGroupInvocations(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXCOMPUTEWORKGROUPINVOCATIONS); }
    /** Unsafe version of {@link #maxComputeWorkGroupSize}. */
    public static IntBuffer nmaxComputeWorkGroupSize(long struct) { return memIntBuffer(struct + VkPhysicalDeviceLimits.MAXCOMPUTEWORKGROUPSIZE, 3); }
    /** Unsafe version of {@link #maxComputeWorkGroupSize(int) maxComputeWorkGroupSize}. */
    public static int nmaxComputeWorkGroupSize(long struct, int index) {
        return memGetInt(struct + VkPhysicalDeviceLimits.MAXCOMPUTEWORKGROUPSIZE + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #subPixelPrecisionBits}. */
    public static int nsubPixelPrecisionBits(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.SUBPIXELPRECISIONBITS); }
    /** Unsafe version of {@link #subTexelPrecisionBits}. */
    public static int nsubTexelPrecisionBits(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.SUBTEXELPRECISIONBITS); }
    /** Unsafe version of {@link #mipmapPrecisionBits}. */
    public static int nmipmapPrecisionBits(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MIPMAPPRECISIONBITS); }
    /** Unsafe version of {@link #maxDrawIndexedIndexValue}. */
    public static int nmaxDrawIndexedIndexValue(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXDRAWINDEXEDINDEXVALUE); }
    /** Unsafe version of {@link #maxDrawIndirectCount}. */
    public static int nmaxDrawIndirectCount(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXDRAWINDIRECTCOUNT); }
    /** Unsafe version of {@link #maxSamplerLodBias}. */
    public static float nmaxSamplerLodBias(long struct) { return memGetFloat(struct + VkPhysicalDeviceLimits.MAXSAMPLERLODBIAS); }
    /** Unsafe version of {@link #maxSamplerAnisotropy}. */
    public static float nmaxSamplerAnisotropy(long struct) { return memGetFloat(struct + VkPhysicalDeviceLimits.MAXSAMPLERANISOTROPY); }
    /** Unsafe version of {@link #maxViewports}. */
    public static int nmaxViewports(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXVIEWPORTS); }
    /** Unsafe version of {@link #maxViewportDimensions}. */
    public static IntBuffer nmaxViewportDimensions(long struct) { return memIntBuffer(struct + VkPhysicalDeviceLimits.MAXVIEWPORTDIMENSIONS, 2); }
    /** Unsafe version of {@link #maxViewportDimensions(int) maxViewportDimensions}. */
    public static int nmaxViewportDimensions(long struct, int index) {
        return memGetInt(struct + VkPhysicalDeviceLimits.MAXVIEWPORTDIMENSIONS + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #viewportBoundsRange}. */
    public static FloatBuffer nviewportBoundsRange(long struct) { return memFloatBuffer(struct + VkPhysicalDeviceLimits.VIEWPORTBOUNDSRANGE, 2); }
    /** Unsafe version of {@link #viewportBoundsRange(int) viewportBoundsRange}. */
    public static float nviewportBoundsRange(long struct, int index) {
        return memGetFloat(struct + VkPhysicalDeviceLimits.VIEWPORTBOUNDSRANGE + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #viewportSubPixelBits}. */
    public static int nviewportSubPixelBits(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.VIEWPORTSUBPIXELBITS); }
    /** Unsafe version of {@link #minMemoryMapAlignment}. */
    public static long nminMemoryMapAlignment(long struct) { return memGetAddress(struct + VkPhysicalDeviceLimits.MINMEMORYMAPALIGNMENT); }
    /** Unsafe version of {@link #minTexelBufferOffsetAlignment}. */
    public static long nminTexelBufferOffsetAlignment(long struct) { return memGetLong(struct + VkPhysicalDeviceLimits.MINTEXELBUFFEROFFSETALIGNMENT); }
    /** Unsafe version of {@link #minUniformBufferOffsetAlignment}. */
    public static long nminUniformBufferOffsetAlignment(long struct) { return memGetLong(struct + VkPhysicalDeviceLimits.MINUNIFORMBUFFEROFFSETALIGNMENT); }
    /** Unsafe version of {@link #minStorageBufferOffsetAlignment}. */
    public static long nminStorageBufferOffsetAlignment(long struct) { return memGetLong(struct + VkPhysicalDeviceLimits.MINSTORAGEBUFFEROFFSETALIGNMENT); }
    /** Unsafe version of {@link #minTexelOffset}. */
    public static int nminTexelOffset(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MINTEXELOFFSET); }
    /** Unsafe version of {@link #maxTexelOffset}. */
    public static int nmaxTexelOffset(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXTEXELOFFSET); }
    /** Unsafe version of {@link #minTexelGatherOffset}. */
    public static int nminTexelGatherOffset(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MINTEXELGATHEROFFSET); }
    /** Unsafe version of {@link #maxTexelGatherOffset}. */
    public static int nmaxTexelGatherOffset(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXTEXELGATHEROFFSET); }
    /** Unsafe version of {@link #minInterpolationOffset}. */
    public static float nminInterpolationOffset(long struct) { return memGetFloat(struct + VkPhysicalDeviceLimits.MININTERPOLATIONOFFSET); }
    /** Unsafe version of {@link #maxInterpolationOffset}. */
    public static float nmaxInterpolationOffset(long struct) { return memGetFloat(struct + VkPhysicalDeviceLimits.MAXINTERPOLATIONOFFSET); }
    /** Unsafe version of {@link #subPixelInterpolationOffsetBits}. */
    public static int nsubPixelInterpolationOffsetBits(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.SUBPIXELINTERPOLATIONOFFSETBITS); }
    /** Unsafe version of {@link #maxFramebufferWidth}. */
    public static int nmaxFramebufferWidth(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXFRAMEBUFFERWIDTH); }
    /** Unsafe version of {@link #maxFramebufferHeight}. */
    public static int nmaxFramebufferHeight(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXFRAMEBUFFERHEIGHT); }
    /** Unsafe version of {@link #maxFramebufferLayers}. */
    public static int nmaxFramebufferLayers(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXFRAMEBUFFERLAYERS); }
    /** Unsafe version of {@link #framebufferColorSampleCounts}. */
    public static int nframebufferColorSampleCounts(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.FRAMEBUFFERCOLORSAMPLECOUNTS); }
    /** Unsafe version of {@link #framebufferDepthSampleCounts}. */
    public static int nframebufferDepthSampleCounts(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.FRAMEBUFFERDEPTHSAMPLECOUNTS); }
    /** Unsafe version of {@link #framebufferStencilSampleCounts}. */
    public static int nframebufferStencilSampleCounts(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.FRAMEBUFFERSTENCILSAMPLECOUNTS); }
    /** Unsafe version of {@link #framebufferNoAttachmentsSampleCounts}. */
    public static int nframebufferNoAttachmentsSampleCounts(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.FRAMEBUFFERNOATTACHMENTSSAMPLECOUNTS); }
    /** Unsafe version of {@link #maxColorAttachments}. */
    public static int nmaxColorAttachments(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXCOLORATTACHMENTS); }
    /** Unsafe version of {@link #sampledImageColorSampleCounts}. */
    public static int nsampledImageColorSampleCounts(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.SAMPLEDIMAGECOLORSAMPLECOUNTS); }
    /** Unsafe version of {@link #sampledImageIntegerSampleCounts}. */
    public static int nsampledImageIntegerSampleCounts(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.SAMPLEDIMAGEINTEGERSAMPLECOUNTS); }
    /** Unsafe version of {@link #sampledImageDepthSampleCounts}. */
    public static int nsampledImageDepthSampleCounts(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.SAMPLEDIMAGEDEPTHSAMPLECOUNTS); }
    /** Unsafe version of {@link #sampledImageStencilSampleCounts}. */
    public static int nsampledImageStencilSampleCounts(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.SAMPLEDIMAGESTENCILSAMPLECOUNTS); }
    /** Unsafe version of {@link #storageImageSampleCounts}. */
    public static int nstorageImageSampleCounts(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.STORAGEIMAGESAMPLECOUNTS); }
    /** Unsafe version of {@link #maxSampleMaskWords}. */
    public static int nmaxSampleMaskWords(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXSAMPLEMASKWORDS); }
    /** Unsafe version of {@link #timestampComputeAndGraphics}. */
    public static int ntimestampComputeAndGraphics(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.TIMESTAMPCOMPUTEANDGRAPHICS); }
    /** Unsafe version of {@link #timestampPeriod}. */
    public static float ntimestampPeriod(long struct) { return memGetFloat(struct + VkPhysicalDeviceLimits.TIMESTAMPPERIOD); }
    /** Unsafe version of {@link #maxClipDistances}. */
    public static int nmaxClipDistances(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXCLIPDISTANCES); }
    /** Unsafe version of {@link #maxCullDistances}. */
    public static int nmaxCullDistances(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXCULLDISTANCES); }
    /** Unsafe version of {@link #maxCombinedClipAndCullDistances}. */
    public static int nmaxCombinedClipAndCullDistances(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.MAXCOMBINEDCLIPANDCULLDISTANCES); }
    /** Unsafe version of {@link #discreteQueuePriorities}. */
    public static int ndiscreteQueuePriorities(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.DISCRETEQUEUEPRIORITIES); }
    /** Unsafe version of {@link #pointSizeRange}. */
    public static FloatBuffer npointSizeRange(long struct) { return memFloatBuffer(struct + VkPhysicalDeviceLimits.POINTSIZERANGE, 2); }
    /** Unsafe version of {@link #pointSizeRange(int) pointSizeRange}. */
    public static float npointSizeRange(long struct, int index) {
        return memGetFloat(struct + VkPhysicalDeviceLimits.POINTSIZERANGE + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #lineWidthRange}. */
    public static FloatBuffer nlineWidthRange(long struct) { return memFloatBuffer(struct + VkPhysicalDeviceLimits.LINEWIDTHRANGE, 2); }
    /** Unsafe version of {@link #lineWidthRange(int) lineWidthRange}. */
    public static float nlineWidthRange(long struct, int index) {
        return memGetFloat(struct + VkPhysicalDeviceLimits.LINEWIDTHRANGE + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #pointSizeGranularity}. */
    public static float npointSizeGranularity(long struct) { return memGetFloat(struct + VkPhysicalDeviceLimits.POINTSIZEGRANULARITY); }
    /** Unsafe version of {@link #lineWidthGranularity}. */
    public static float nlineWidthGranularity(long struct) { return memGetFloat(struct + VkPhysicalDeviceLimits.LINEWIDTHGRANULARITY); }
    /** Unsafe version of {@link #strictLines}. */
    public static int nstrictLines(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.STRICTLINES); }
    /** Unsafe version of {@link #standardSampleLocations}. */
    public static int nstandardSampleLocations(long struct) { return memGetInt(struct + VkPhysicalDeviceLimits.STANDARDSAMPLELOCATIONS); }
    /** Unsafe version of {@link #optimalBufferCopyOffsetAlignment}. */
    public static long noptimalBufferCopyOffsetAlignment(long struct) { return memGetLong(struct + VkPhysicalDeviceLimits.OPTIMALBUFFERCOPYOFFSETALIGNMENT); }
    /** Unsafe version of {@link #optimalBufferCopyRowPitchAlignment}. */
    public static long noptimalBufferCopyRowPitchAlignment(long struct) { return memGetLong(struct + VkPhysicalDeviceLimits.OPTIMALBUFFERCOPYROWPITCHALIGNMENT); }
    /** Unsafe version of {@link #nonCoherentAtomSize}. */
    public static long nnonCoherentAtomSize(long struct) { return memGetLong(struct + VkPhysicalDeviceLimits.NONCOHERENTATOMSIZE); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceLimits} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceLimits, Buffer> {

        private static final VkPhysicalDeviceLimits ELEMENT_FACTORY = VkPhysicalDeviceLimits.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceLimits.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceLimits#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPhysicalDeviceLimits getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code maxImageDimension1D} field. */
        @NativeType("uint32_t")
        public int maxImageDimension1D() { return VkPhysicalDeviceLimits.nmaxImageDimension1D(address()); }
        /** @return the value of the {@code maxImageDimension2D} field. */
        @NativeType("uint32_t")
        public int maxImageDimension2D() { return VkPhysicalDeviceLimits.nmaxImageDimension2D(address()); }
        /** @return the value of the {@code maxImageDimension3D} field. */
        @NativeType("uint32_t")
        public int maxImageDimension3D() { return VkPhysicalDeviceLimits.nmaxImageDimension3D(address()); }
        /** @return the value of the {@code maxImageDimensionCube} field. */
        @NativeType("uint32_t")
        public int maxImageDimensionCube() { return VkPhysicalDeviceLimits.nmaxImageDimensionCube(address()); }
        /** @return the value of the {@code maxImageArrayLayers} field. */
        @NativeType("uint32_t")
        public int maxImageArrayLayers() { return VkPhysicalDeviceLimits.nmaxImageArrayLayers(address()); }
        /** @return the value of the {@code maxTexelBufferElements} field. */
        @NativeType("uint32_t")
        public int maxTexelBufferElements() { return VkPhysicalDeviceLimits.nmaxTexelBufferElements(address()); }
        /** @return the value of the {@code maxUniformBufferRange} field. */
        @NativeType("uint32_t")
        public int maxUniformBufferRange() { return VkPhysicalDeviceLimits.nmaxUniformBufferRange(address()); }
        /** @return the value of the {@code maxStorageBufferRange} field. */
        @NativeType("uint32_t")
        public int maxStorageBufferRange() { return VkPhysicalDeviceLimits.nmaxStorageBufferRange(address()); }
        /** @return the value of the {@code maxPushConstantsSize} field. */
        @NativeType("uint32_t")
        public int maxPushConstantsSize() { return VkPhysicalDeviceLimits.nmaxPushConstantsSize(address()); }
        /** @return the value of the {@code maxMemoryAllocationCount} field. */
        @NativeType("uint32_t")
        public int maxMemoryAllocationCount() { return VkPhysicalDeviceLimits.nmaxMemoryAllocationCount(address()); }
        /** @return the value of the {@code maxSamplerAllocationCount} field. */
        @NativeType("uint32_t")
        public int maxSamplerAllocationCount() { return VkPhysicalDeviceLimits.nmaxSamplerAllocationCount(address()); }
        /** @return the value of the {@code bufferImageGranularity} field. */
        @NativeType("VkDeviceSize")
        public long bufferImageGranularity() { return VkPhysicalDeviceLimits.nbufferImageGranularity(address()); }
        /** @return the value of the {@code sparseAddressSpaceSize} field. */
        @NativeType("VkDeviceSize")
        public long sparseAddressSpaceSize() { return VkPhysicalDeviceLimits.nsparseAddressSpaceSize(address()); }
        /** @return the value of the {@code maxBoundDescriptorSets} field. */
        @NativeType("uint32_t")
        public int maxBoundDescriptorSets() { return VkPhysicalDeviceLimits.nmaxBoundDescriptorSets(address()); }
        /** @return the value of the {@code maxPerStageDescriptorSamplers} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorSamplers() { return VkPhysicalDeviceLimits.nmaxPerStageDescriptorSamplers(address()); }
        /** @return the value of the {@code maxPerStageDescriptorUniformBuffers} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorUniformBuffers() { return VkPhysicalDeviceLimits.nmaxPerStageDescriptorUniformBuffers(address()); }
        /** @return the value of the {@code maxPerStageDescriptorStorageBuffers} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorStorageBuffers() { return VkPhysicalDeviceLimits.nmaxPerStageDescriptorStorageBuffers(address()); }
        /** @return the value of the {@code maxPerStageDescriptorSampledImages} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorSampledImages() { return VkPhysicalDeviceLimits.nmaxPerStageDescriptorSampledImages(address()); }
        /** @return the value of the {@code maxPerStageDescriptorStorageImages} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorStorageImages() { return VkPhysicalDeviceLimits.nmaxPerStageDescriptorStorageImages(address()); }
        /** @return the value of the {@code maxPerStageDescriptorInputAttachments} field. */
        @NativeType("uint32_t")
        public int maxPerStageDescriptorInputAttachments() { return VkPhysicalDeviceLimits.nmaxPerStageDescriptorInputAttachments(address()); }
        /** @return the value of the {@code maxPerStageResources} field. */
        @NativeType("uint32_t")
        public int maxPerStageResources() { return VkPhysicalDeviceLimits.nmaxPerStageResources(address()); }
        /** @return the value of the {@code maxDescriptorSetSamplers} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetSamplers() { return VkPhysicalDeviceLimits.nmaxDescriptorSetSamplers(address()); }
        /** @return the value of the {@code maxDescriptorSetUniformBuffers} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUniformBuffers() { return VkPhysicalDeviceLimits.nmaxDescriptorSetUniformBuffers(address()); }
        /** @return the value of the {@code maxDescriptorSetUniformBuffersDynamic} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetUniformBuffersDynamic() { return VkPhysicalDeviceLimits.nmaxDescriptorSetUniformBuffersDynamic(address()); }
        /** @return the value of the {@code maxDescriptorSetStorageBuffers} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetStorageBuffers() { return VkPhysicalDeviceLimits.nmaxDescriptorSetStorageBuffers(address()); }
        /** @return the value of the {@code maxDescriptorSetStorageBuffersDynamic} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetStorageBuffersDynamic() { return VkPhysicalDeviceLimits.nmaxDescriptorSetStorageBuffersDynamic(address()); }
        /** @return the value of the {@code maxDescriptorSetSampledImages} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetSampledImages() { return VkPhysicalDeviceLimits.nmaxDescriptorSetSampledImages(address()); }
        /** @return the value of the {@code maxDescriptorSetStorageImages} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetStorageImages() { return VkPhysicalDeviceLimits.nmaxDescriptorSetStorageImages(address()); }
        /** @return the value of the {@code maxDescriptorSetInputAttachments} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetInputAttachments() { return VkPhysicalDeviceLimits.nmaxDescriptorSetInputAttachments(address()); }
        /** @return the value of the {@code maxVertexInputAttributes} field. */
        @NativeType("uint32_t")
        public int maxVertexInputAttributes() { return VkPhysicalDeviceLimits.nmaxVertexInputAttributes(address()); }
        /** @return the value of the {@code maxVertexInputBindings} field. */
        @NativeType("uint32_t")
        public int maxVertexInputBindings() { return VkPhysicalDeviceLimits.nmaxVertexInputBindings(address()); }
        /** @return the value of the {@code maxVertexInputAttributeOffset} field. */
        @NativeType("uint32_t")
        public int maxVertexInputAttributeOffset() { return VkPhysicalDeviceLimits.nmaxVertexInputAttributeOffset(address()); }
        /** @return the value of the {@code maxVertexInputBindingStride} field. */
        @NativeType("uint32_t")
        public int maxVertexInputBindingStride() { return VkPhysicalDeviceLimits.nmaxVertexInputBindingStride(address()); }
        /** @return the value of the {@code maxVertexOutputComponents} field. */
        @NativeType("uint32_t")
        public int maxVertexOutputComponents() { return VkPhysicalDeviceLimits.nmaxVertexOutputComponents(address()); }
        /** @return the value of the {@code maxTessellationGenerationLevel} field. */
        @NativeType("uint32_t")
        public int maxTessellationGenerationLevel() { return VkPhysicalDeviceLimits.nmaxTessellationGenerationLevel(address()); }
        /** @return the value of the {@code maxTessellationPatchSize} field. */
        @NativeType("uint32_t")
        public int maxTessellationPatchSize() { return VkPhysicalDeviceLimits.nmaxTessellationPatchSize(address()); }
        /** @return the value of the {@code maxTessellationControlPerVertexInputComponents} field. */
        @NativeType("uint32_t")
        public int maxTessellationControlPerVertexInputComponents() { return VkPhysicalDeviceLimits.nmaxTessellationControlPerVertexInputComponents(address()); }
        /** @return the value of the {@code maxTessellationControlPerVertexOutputComponents} field. */
        @NativeType("uint32_t")
        public int maxTessellationControlPerVertexOutputComponents() { return VkPhysicalDeviceLimits.nmaxTessellationControlPerVertexOutputComponents(address()); }
        /** @return the value of the {@code maxTessellationControlPerPatchOutputComponents} field. */
        @NativeType("uint32_t")
        public int maxTessellationControlPerPatchOutputComponents() { return VkPhysicalDeviceLimits.nmaxTessellationControlPerPatchOutputComponents(address()); }
        /** @return the value of the {@code maxTessellationControlTotalOutputComponents} field. */
        @NativeType("uint32_t")
        public int maxTessellationControlTotalOutputComponents() { return VkPhysicalDeviceLimits.nmaxTessellationControlTotalOutputComponents(address()); }
        /** @return the value of the {@code maxTessellationEvaluationInputComponents} field. */
        @NativeType("uint32_t")
        public int maxTessellationEvaluationInputComponents() { return VkPhysicalDeviceLimits.nmaxTessellationEvaluationInputComponents(address()); }
        /** @return the value of the {@code maxTessellationEvaluationOutputComponents} field. */
        @NativeType("uint32_t")
        public int maxTessellationEvaluationOutputComponents() { return VkPhysicalDeviceLimits.nmaxTessellationEvaluationOutputComponents(address()); }
        /** @return the value of the {@code maxGeometryShaderInvocations} field. */
        @NativeType("uint32_t")
        public int maxGeometryShaderInvocations() { return VkPhysicalDeviceLimits.nmaxGeometryShaderInvocations(address()); }
        /** @return the value of the {@code maxGeometryInputComponents} field. */
        @NativeType("uint32_t")
        public int maxGeometryInputComponents() { return VkPhysicalDeviceLimits.nmaxGeometryInputComponents(address()); }
        /** @return the value of the {@code maxGeometryOutputComponents} field. */
        @NativeType("uint32_t")
        public int maxGeometryOutputComponents() { return VkPhysicalDeviceLimits.nmaxGeometryOutputComponents(address()); }
        /** @return the value of the {@code maxGeometryOutputVertices} field. */
        @NativeType("uint32_t")
        public int maxGeometryOutputVertices() { return VkPhysicalDeviceLimits.nmaxGeometryOutputVertices(address()); }
        /** @return the value of the {@code maxGeometryTotalOutputComponents} field. */
        @NativeType("uint32_t")
        public int maxGeometryTotalOutputComponents() { return VkPhysicalDeviceLimits.nmaxGeometryTotalOutputComponents(address()); }
        /** @return the value of the {@code maxFragmentInputComponents} field. */
        @NativeType("uint32_t")
        public int maxFragmentInputComponents() { return VkPhysicalDeviceLimits.nmaxFragmentInputComponents(address()); }
        /** @return the value of the {@code maxFragmentOutputAttachments} field. */
        @NativeType("uint32_t")
        public int maxFragmentOutputAttachments() { return VkPhysicalDeviceLimits.nmaxFragmentOutputAttachments(address()); }
        /** @return the value of the {@code maxFragmentDualSrcAttachments} field. */
        @NativeType("uint32_t")
        public int maxFragmentDualSrcAttachments() { return VkPhysicalDeviceLimits.nmaxFragmentDualSrcAttachments(address()); }
        /** @return the value of the {@code maxFragmentCombinedOutputResources} field. */
        @NativeType("uint32_t")
        public int maxFragmentCombinedOutputResources() { return VkPhysicalDeviceLimits.nmaxFragmentCombinedOutputResources(address()); }
        /** @return the value of the {@code maxComputeSharedMemorySize} field. */
        @NativeType("uint32_t")
        public int maxComputeSharedMemorySize() { return VkPhysicalDeviceLimits.nmaxComputeSharedMemorySize(address()); }
        /** @return a {@link IntBuffer} view of the {@code maxComputeWorkGroupCount} field. */
        @NativeType("uint32_t[3]")
        public IntBuffer maxComputeWorkGroupCount() { return VkPhysicalDeviceLimits.nmaxComputeWorkGroupCount(address()); }
        /** @return the value at the specified index of the {@code maxComputeWorkGroupCount} field. */
        @NativeType("uint32_t")
        public int maxComputeWorkGroupCount(int index) { return VkPhysicalDeviceLimits.nmaxComputeWorkGroupCount(address(), index); }
        /** @return the value of the {@code maxComputeWorkGroupInvocations} field. */
        @NativeType("uint32_t")
        public int maxComputeWorkGroupInvocations() { return VkPhysicalDeviceLimits.nmaxComputeWorkGroupInvocations(address()); }
        /** @return a {@link IntBuffer} view of the {@code maxComputeWorkGroupSize} field. */
        @NativeType("uint32_t[3]")
        public IntBuffer maxComputeWorkGroupSize() { return VkPhysicalDeviceLimits.nmaxComputeWorkGroupSize(address()); }
        /** @return the value at the specified index of the {@code maxComputeWorkGroupSize} field. */
        @NativeType("uint32_t")
        public int maxComputeWorkGroupSize(int index) { return VkPhysicalDeviceLimits.nmaxComputeWorkGroupSize(address(), index); }
        /** @return the value of the {@code subPixelPrecisionBits} field. */
        @NativeType("uint32_t")
        public int subPixelPrecisionBits() { return VkPhysicalDeviceLimits.nsubPixelPrecisionBits(address()); }
        /** @return the value of the {@code subTexelPrecisionBits} field. */
        @NativeType("uint32_t")
        public int subTexelPrecisionBits() { return VkPhysicalDeviceLimits.nsubTexelPrecisionBits(address()); }
        /** @return the value of the {@code mipmapPrecisionBits} field. */
        @NativeType("uint32_t")
        public int mipmapPrecisionBits() { return VkPhysicalDeviceLimits.nmipmapPrecisionBits(address()); }
        /** @return the value of the {@code maxDrawIndexedIndexValue} field. */
        @NativeType("uint32_t")
        public int maxDrawIndexedIndexValue() { return VkPhysicalDeviceLimits.nmaxDrawIndexedIndexValue(address()); }
        /** @return the value of the {@code maxDrawIndirectCount} field. */
        @NativeType("uint32_t")
        public int maxDrawIndirectCount() { return VkPhysicalDeviceLimits.nmaxDrawIndirectCount(address()); }
        /** @return the value of the {@code maxSamplerLodBias} field. */
        public float maxSamplerLodBias() { return VkPhysicalDeviceLimits.nmaxSamplerLodBias(address()); }
        /** @return the value of the {@code maxSamplerAnisotropy} field. */
        public float maxSamplerAnisotropy() { return VkPhysicalDeviceLimits.nmaxSamplerAnisotropy(address()); }
        /** @return the value of the {@code maxViewports} field. */
        @NativeType("uint32_t")
        public int maxViewports() { return VkPhysicalDeviceLimits.nmaxViewports(address()); }
        /** @return a {@link IntBuffer} view of the {@code maxViewportDimensions} field. */
        @NativeType("uint32_t[2]")
        public IntBuffer maxViewportDimensions() { return VkPhysicalDeviceLimits.nmaxViewportDimensions(address()); }
        /** @return the value at the specified index of the {@code maxViewportDimensions} field. */
        @NativeType("uint32_t")
        public int maxViewportDimensions(int index) { return VkPhysicalDeviceLimits.nmaxViewportDimensions(address(), index); }
        /** @return a {@link FloatBuffer} view of the {@code viewportBoundsRange} field. */
        @NativeType("float[2]")
        public FloatBuffer viewportBoundsRange() { return VkPhysicalDeviceLimits.nviewportBoundsRange(address()); }
        /** @return the value at the specified index of the {@code viewportBoundsRange} field. */
        public float viewportBoundsRange(int index) { return VkPhysicalDeviceLimits.nviewportBoundsRange(address(), index); }
        /** @return the value of the {@code viewportSubPixelBits} field. */
        @NativeType("uint32_t")
        public int viewportSubPixelBits() { return VkPhysicalDeviceLimits.nviewportSubPixelBits(address()); }
        /** @return the value of the {@code minMemoryMapAlignment} field. */
        @NativeType("size_t")
        public long minMemoryMapAlignment() { return VkPhysicalDeviceLimits.nminMemoryMapAlignment(address()); }
        /** @return the value of the {@code minTexelBufferOffsetAlignment} field. */
        @NativeType("VkDeviceSize")
        public long minTexelBufferOffsetAlignment() { return VkPhysicalDeviceLimits.nminTexelBufferOffsetAlignment(address()); }
        /** @return the value of the {@code minUniformBufferOffsetAlignment} field. */
        @NativeType("VkDeviceSize")
        public long minUniformBufferOffsetAlignment() { return VkPhysicalDeviceLimits.nminUniformBufferOffsetAlignment(address()); }
        /** @return the value of the {@code minStorageBufferOffsetAlignment} field. */
        @NativeType("VkDeviceSize")
        public long minStorageBufferOffsetAlignment() { return VkPhysicalDeviceLimits.nminStorageBufferOffsetAlignment(address()); }
        /** @return the value of the {@code minTexelOffset} field. */
        @NativeType("int32_t")
        public int minTexelOffset() { return VkPhysicalDeviceLimits.nminTexelOffset(address()); }
        /** @return the value of the {@code maxTexelOffset} field. */
        @NativeType("uint32_t")
        public int maxTexelOffset() { return VkPhysicalDeviceLimits.nmaxTexelOffset(address()); }
        /** @return the value of the {@code minTexelGatherOffset} field. */
        @NativeType("int32_t")
        public int minTexelGatherOffset() { return VkPhysicalDeviceLimits.nminTexelGatherOffset(address()); }
        /** @return the value of the {@code maxTexelGatherOffset} field. */
        @NativeType("uint32_t")
        public int maxTexelGatherOffset() { return VkPhysicalDeviceLimits.nmaxTexelGatherOffset(address()); }
        /** @return the value of the {@code minInterpolationOffset} field. */
        public float minInterpolationOffset() { return VkPhysicalDeviceLimits.nminInterpolationOffset(address()); }
        /** @return the value of the {@code maxInterpolationOffset} field. */
        public float maxInterpolationOffset() { return VkPhysicalDeviceLimits.nmaxInterpolationOffset(address()); }
        /** @return the value of the {@code subPixelInterpolationOffsetBits} field. */
        @NativeType("uint32_t")
        public int subPixelInterpolationOffsetBits() { return VkPhysicalDeviceLimits.nsubPixelInterpolationOffsetBits(address()); }
        /** @return the value of the {@code maxFramebufferWidth} field. */
        @NativeType("uint32_t")
        public int maxFramebufferWidth() { return VkPhysicalDeviceLimits.nmaxFramebufferWidth(address()); }
        /** @return the value of the {@code maxFramebufferHeight} field. */
        @NativeType("uint32_t")
        public int maxFramebufferHeight() { return VkPhysicalDeviceLimits.nmaxFramebufferHeight(address()); }
        /** @return the value of the {@code maxFramebufferLayers} field. */
        @NativeType("uint32_t")
        public int maxFramebufferLayers() { return VkPhysicalDeviceLimits.nmaxFramebufferLayers(address()); }
        /** @return the value of the {@code framebufferColorSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int framebufferColorSampleCounts() { return VkPhysicalDeviceLimits.nframebufferColorSampleCounts(address()); }
        /** @return the value of the {@code framebufferDepthSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int framebufferDepthSampleCounts() { return VkPhysicalDeviceLimits.nframebufferDepthSampleCounts(address()); }
        /** @return the value of the {@code framebufferStencilSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int framebufferStencilSampleCounts() { return VkPhysicalDeviceLimits.nframebufferStencilSampleCounts(address()); }
        /** @return the value of the {@code framebufferNoAttachmentsSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int framebufferNoAttachmentsSampleCounts() { return VkPhysicalDeviceLimits.nframebufferNoAttachmentsSampleCounts(address()); }
        /** @return the value of the {@code maxColorAttachments} field. */
        @NativeType("uint32_t")
        public int maxColorAttachments() { return VkPhysicalDeviceLimits.nmaxColorAttachments(address()); }
        /** @return the value of the {@code sampledImageColorSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int sampledImageColorSampleCounts() { return VkPhysicalDeviceLimits.nsampledImageColorSampleCounts(address()); }
        /** @return the value of the {@code sampledImageIntegerSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int sampledImageIntegerSampleCounts() { return VkPhysicalDeviceLimits.nsampledImageIntegerSampleCounts(address()); }
        /** @return the value of the {@code sampledImageDepthSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int sampledImageDepthSampleCounts() { return VkPhysicalDeviceLimits.nsampledImageDepthSampleCounts(address()); }
        /** @return the value of the {@code sampledImageStencilSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int sampledImageStencilSampleCounts() { return VkPhysicalDeviceLimits.nsampledImageStencilSampleCounts(address()); }
        /** @return the value of the {@code storageImageSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int storageImageSampleCounts() { return VkPhysicalDeviceLimits.nstorageImageSampleCounts(address()); }
        /** @return the value of the {@code maxSampleMaskWords} field. */
        @NativeType("uint32_t")
        public int maxSampleMaskWords() { return VkPhysicalDeviceLimits.nmaxSampleMaskWords(address()); }
        /** @return the value of the {@code timestampComputeAndGraphics} field. */
        @NativeType("VkBool32")
        public boolean timestampComputeAndGraphics() { return VkPhysicalDeviceLimits.ntimestampComputeAndGraphics(address()) != 0; }
        /** @return the value of the {@code timestampPeriod} field. */
        public float timestampPeriod() { return VkPhysicalDeviceLimits.ntimestampPeriod(address()); }
        /** @return the value of the {@code maxClipDistances} field. */
        @NativeType("uint32_t")
        public int maxClipDistances() { return VkPhysicalDeviceLimits.nmaxClipDistances(address()); }
        /** @return the value of the {@code maxCullDistances} field. */
        @NativeType("uint32_t")
        public int maxCullDistances() { return VkPhysicalDeviceLimits.nmaxCullDistances(address()); }
        /** @return the value of the {@code maxCombinedClipAndCullDistances} field. */
        @NativeType("uint32_t")
        public int maxCombinedClipAndCullDistances() { return VkPhysicalDeviceLimits.nmaxCombinedClipAndCullDistances(address()); }
        /** @return the value of the {@code discreteQueuePriorities} field. */
        @NativeType("uint32_t")
        public int discreteQueuePriorities() { return VkPhysicalDeviceLimits.ndiscreteQueuePriorities(address()); }
        /** @return a {@link FloatBuffer} view of the {@code pointSizeRange} field. */
        @NativeType("float[2]")
        public FloatBuffer pointSizeRange() { return VkPhysicalDeviceLimits.npointSizeRange(address()); }
        /** @return the value at the specified index of the {@code pointSizeRange} field. */
        public float pointSizeRange(int index) { return VkPhysicalDeviceLimits.npointSizeRange(address(), index); }
        /** @return a {@link FloatBuffer} view of the {@code lineWidthRange} field. */
        @NativeType("float[2]")
        public FloatBuffer lineWidthRange() { return VkPhysicalDeviceLimits.nlineWidthRange(address()); }
        /** @return the value at the specified index of the {@code lineWidthRange} field. */
        public float lineWidthRange(int index) { return VkPhysicalDeviceLimits.nlineWidthRange(address(), index); }
        /** @return the value of the {@code pointSizeGranularity} field. */
        public float pointSizeGranularity() { return VkPhysicalDeviceLimits.npointSizeGranularity(address()); }
        /** @return the value of the {@code lineWidthGranularity} field. */
        public float lineWidthGranularity() { return VkPhysicalDeviceLimits.nlineWidthGranularity(address()); }
        /** @return the value of the {@code strictLines} field. */
        @NativeType("VkBool32")
        public boolean strictLines() { return VkPhysicalDeviceLimits.nstrictLines(address()) != 0; }
        /** @return the value of the {@code standardSampleLocations} field. */
        @NativeType("VkBool32")
        public boolean standardSampleLocations() { return VkPhysicalDeviceLimits.nstandardSampleLocations(address()) != 0; }
        /** @return the value of the {@code optimalBufferCopyOffsetAlignment} field. */
        @NativeType("VkDeviceSize")
        public long optimalBufferCopyOffsetAlignment() { return VkPhysicalDeviceLimits.noptimalBufferCopyOffsetAlignment(address()); }
        /** @return the value of the {@code optimalBufferCopyRowPitchAlignment} field. */
        @NativeType("VkDeviceSize")
        public long optimalBufferCopyRowPitchAlignment() { return VkPhysicalDeviceLimits.noptimalBufferCopyRowPitchAlignment(address()); }
        /** @return the value of the {@code nonCoherentAtomSize} field. */
        @NativeType("VkDeviceSize")
        public long nonCoherentAtomSize() { return VkPhysicalDeviceLimits.nnonCoherentAtomSize(address()); }

    }

}
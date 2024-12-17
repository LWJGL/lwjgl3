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
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.VK10.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceVulkan14Properties {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t lineSubPixelPrecisionBits;
 *     uint32_t maxVertexAttribDivisor;
 *     VkBool32 supportsNonZeroFirstInstance;
 *     uint32_t maxPushDescriptors;
 *     VkBool32 dynamicRenderingLocalReadDepthStencilAttachments;
 *     VkBool32 dynamicRenderingLocalReadMultisampledAttachments;
 *     VkBool32 earlyFragmentMultisampleCoverageAfterSampleCounting;
 *     VkBool32 earlyFragmentSampleMaskTestBeforeSampleCounting;
 *     VkBool32 depthStencilSwizzleOneSupport;
 *     VkBool32 polygonModePointSize;
 *     VkBool32 nonStrictSinglePixelWideLinesUseParallelogram;
 *     VkBool32 nonStrictWideLinesUseParallelogram;
 *     VkBool32 blockTexelViewCompatibleMultipleLayers;
 *     uint32_t maxCombinedImageSamplerDescriptorCount;
 *     VkBool32 fragmentShadingRateClampCombinerInputs;
 *     VkPipelineRobustnessBufferBehavior defaultRobustnessStorageBuffers;
 *     VkPipelineRobustnessBufferBehavior defaultRobustnessUniformBuffers;
 *     VkPipelineRobustnessBufferBehavior defaultRobustnessVertexInputs;
 *     VkPipelineRobustnessImageBehavior defaultRobustnessImages;
 *     uint32_t copySrcLayoutCount;
 *     VkImageLayout * pCopySrcLayouts;
 *     uint32_t copyDstLayoutCount;
 *     VkImageLayout * pCopyDstLayouts;
 *     uint8_t optimalTilingLayoutUUID[VK_UUID_SIZE];
 *     VkBool32 identicalMemoryTypeRequirements;
 * }}</pre>
 */
public class VkPhysicalDeviceVulkan14Properties extends Struct<VkPhysicalDeviceVulkan14Properties> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        LINESUBPIXELPRECISIONBITS,
        MAXVERTEXATTRIBDIVISOR,
        SUPPORTSNONZEROFIRSTINSTANCE,
        MAXPUSHDESCRIPTORS,
        DYNAMICRENDERINGLOCALREADDEPTHSTENCILATTACHMENTS,
        DYNAMICRENDERINGLOCALREADMULTISAMPLEDATTACHMENTS,
        EARLYFRAGMENTMULTISAMPLECOVERAGEAFTERSAMPLECOUNTING,
        EARLYFRAGMENTSAMPLEMASKTESTBEFORESAMPLECOUNTING,
        DEPTHSTENCILSWIZZLEONESUPPORT,
        POLYGONMODEPOINTSIZE,
        NONSTRICTSINGLEPIXELWIDELINESUSEPARALLELOGRAM,
        NONSTRICTWIDELINESUSEPARALLELOGRAM,
        BLOCKTEXELVIEWCOMPATIBLEMULTIPLELAYERS,
        MAXCOMBINEDIMAGESAMPLERDESCRIPTORCOUNT,
        FRAGMENTSHADINGRATECLAMPCOMBINERINPUTS,
        DEFAULTROBUSTNESSSTORAGEBUFFERS,
        DEFAULTROBUSTNESSUNIFORMBUFFERS,
        DEFAULTROBUSTNESSVERTEXINPUTS,
        DEFAULTROBUSTNESSIMAGES,
        COPYSRCLAYOUTCOUNT,
        PCOPYSRCLAYOUTS,
        COPYDSTLAYOUTCOUNT,
        PCOPYDSTLAYOUTS,
        OPTIMALTILINGLAYOUTUUID,
        IDENTICALMEMORYTYPEREQUIREMENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
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
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __array(1, VK_UUID_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        LINESUBPIXELPRECISIONBITS = layout.offsetof(2);
        MAXVERTEXATTRIBDIVISOR = layout.offsetof(3);
        SUPPORTSNONZEROFIRSTINSTANCE = layout.offsetof(4);
        MAXPUSHDESCRIPTORS = layout.offsetof(5);
        DYNAMICRENDERINGLOCALREADDEPTHSTENCILATTACHMENTS = layout.offsetof(6);
        DYNAMICRENDERINGLOCALREADMULTISAMPLEDATTACHMENTS = layout.offsetof(7);
        EARLYFRAGMENTMULTISAMPLECOVERAGEAFTERSAMPLECOUNTING = layout.offsetof(8);
        EARLYFRAGMENTSAMPLEMASKTESTBEFORESAMPLECOUNTING = layout.offsetof(9);
        DEPTHSTENCILSWIZZLEONESUPPORT = layout.offsetof(10);
        POLYGONMODEPOINTSIZE = layout.offsetof(11);
        NONSTRICTSINGLEPIXELWIDELINESUSEPARALLELOGRAM = layout.offsetof(12);
        NONSTRICTWIDELINESUSEPARALLELOGRAM = layout.offsetof(13);
        BLOCKTEXELVIEWCOMPATIBLEMULTIPLELAYERS = layout.offsetof(14);
        MAXCOMBINEDIMAGESAMPLERDESCRIPTORCOUNT = layout.offsetof(15);
        FRAGMENTSHADINGRATECLAMPCOMBINERINPUTS = layout.offsetof(16);
        DEFAULTROBUSTNESSSTORAGEBUFFERS = layout.offsetof(17);
        DEFAULTROBUSTNESSUNIFORMBUFFERS = layout.offsetof(18);
        DEFAULTROBUSTNESSVERTEXINPUTS = layout.offsetof(19);
        DEFAULTROBUSTNESSIMAGES = layout.offsetof(20);
        COPYSRCLAYOUTCOUNT = layout.offsetof(21);
        PCOPYSRCLAYOUTS = layout.offsetof(22);
        COPYDSTLAYOUTCOUNT = layout.offsetof(23);
        PCOPYDSTLAYOUTS = layout.offsetof(24);
        OPTIMALTILINGLAYOUTUUID = layout.offsetof(25);
        IDENTICALMEMORYTYPEREQUIREMENTS = layout.offsetof(26);
    }

    protected VkPhysicalDeviceVulkan14Properties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceVulkan14Properties create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceVulkan14Properties(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVulkan14Properties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVulkan14Properties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code lineSubPixelPrecisionBits} field. */
    @NativeType("uint32_t")
    public int lineSubPixelPrecisionBits() { return nlineSubPixelPrecisionBits(address()); }
    /** @return the value of the {@code maxVertexAttribDivisor} field. */
    @NativeType("uint32_t")
    public int maxVertexAttribDivisor() { return nmaxVertexAttribDivisor(address()); }
    /** @return the value of the {@code supportsNonZeroFirstInstance} field. */
    @NativeType("VkBool32")
    public boolean supportsNonZeroFirstInstance() { return nsupportsNonZeroFirstInstance(address()) != 0; }
    /** @return the value of the {@code maxPushDescriptors} field. */
    @NativeType("uint32_t")
    public int maxPushDescriptors() { return nmaxPushDescriptors(address()); }
    /** @return the value of the {@code dynamicRenderingLocalReadDepthStencilAttachments} field. */
    @NativeType("VkBool32")
    public boolean dynamicRenderingLocalReadDepthStencilAttachments() { return ndynamicRenderingLocalReadDepthStencilAttachments(address()) != 0; }
    /** @return the value of the {@code dynamicRenderingLocalReadMultisampledAttachments} field. */
    @NativeType("VkBool32")
    public boolean dynamicRenderingLocalReadMultisampledAttachments() { return ndynamicRenderingLocalReadMultisampledAttachments(address()) != 0; }
    /** @return the value of the {@code earlyFragmentMultisampleCoverageAfterSampleCounting} field. */
    @NativeType("VkBool32")
    public boolean earlyFragmentMultisampleCoverageAfterSampleCounting() { return nearlyFragmentMultisampleCoverageAfterSampleCounting(address()) != 0; }
    /** @return the value of the {@code earlyFragmentSampleMaskTestBeforeSampleCounting} field. */
    @NativeType("VkBool32")
    public boolean earlyFragmentSampleMaskTestBeforeSampleCounting() { return nearlyFragmentSampleMaskTestBeforeSampleCounting(address()) != 0; }
    /** @return the value of the {@code depthStencilSwizzleOneSupport} field. */
    @NativeType("VkBool32")
    public boolean depthStencilSwizzleOneSupport() { return ndepthStencilSwizzleOneSupport(address()) != 0; }
    /** @return the value of the {@code polygonModePointSize} field. */
    @NativeType("VkBool32")
    public boolean polygonModePointSize() { return npolygonModePointSize(address()) != 0; }
    /** @return the value of the {@code nonStrictSinglePixelWideLinesUseParallelogram} field. */
    @NativeType("VkBool32")
    public boolean nonStrictSinglePixelWideLinesUseParallelogram() { return nnonStrictSinglePixelWideLinesUseParallelogram(address()) != 0; }
    /** @return the value of the {@code nonStrictWideLinesUseParallelogram} field. */
    @NativeType("VkBool32")
    public boolean nonStrictWideLinesUseParallelogram() { return nnonStrictWideLinesUseParallelogram(address()) != 0; }
    /** @return the value of the {@code blockTexelViewCompatibleMultipleLayers} field. */
    @NativeType("VkBool32")
    public boolean blockTexelViewCompatibleMultipleLayers() { return nblockTexelViewCompatibleMultipleLayers(address()) != 0; }
    /** @return the value of the {@code maxCombinedImageSamplerDescriptorCount} field. */
    @NativeType("uint32_t")
    public int maxCombinedImageSamplerDescriptorCount() { return nmaxCombinedImageSamplerDescriptorCount(address()); }
    /** @return the value of the {@code fragmentShadingRateClampCombinerInputs} field. */
    @NativeType("VkBool32")
    public boolean fragmentShadingRateClampCombinerInputs() { return nfragmentShadingRateClampCombinerInputs(address()) != 0; }
    /** @return the value of the {@code defaultRobustnessStorageBuffers} field. */
    @NativeType("VkPipelineRobustnessBufferBehavior")
    public int defaultRobustnessStorageBuffers() { return ndefaultRobustnessStorageBuffers(address()); }
    /** @return the value of the {@code defaultRobustnessUniformBuffers} field. */
    @NativeType("VkPipelineRobustnessBufferBehavior")
    public int defaultRobustnessUniformBuffers() { return ndefaultRobustnessUniformBuffers(address()); }
    /** @return the value of the {@code defaultRobustnessVertexInputs} field. */
    @NativeType("VkPipelineRobustnessBufferBehavior")
    public int defaultRobustnessVertexInputs() { return ndefaultRobustnessVertexInputs(address()); }
    /** @return the value of the {@code defaultRobustnessImages} field. */
    @NativeType("VkPipelineRobustnessImageBehavior")
    public int defaultRobustnessImages() { return ndefaultRobustnessImages(address()); }
    /** @return the value of the {@code copySrcLayoutCount} field. */
    @NativeType("uint32_t")
    public int copySrcLayoutCount() { return ncopySrcLayoutCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pCopySrcLayouts} field. */
    @NativeType("VkImageLayout *")
    public @Nullable IntBuffer pCopySrcLayouts() { return npCopySrcLayouts(address()); }
    /** @return the value of the {@code copyDstLayoutCount} field. */
    @NativeType("uint32_t")
    public int copyDstLayoutCount() { return ncopyDstLayoutCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pCopyDstLayouts} field. */
    @NativeType("VkImageLayout *")
    public @Nullable IntBuffer pCopyDstLayouts() { return npCopyDstLayouts(address()); }
    /** @return a {@link ByteBuffer} view of the {@code optimalTilingLayoutUUID} field. */
    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer optimalTilingLayoutUUID() { return noptimalTilingLayoutUUID(address()); }
    /** @return the value at the specified index of the {@code optimalTilingLayoutUUID} field. */
    @NativeType("uint8_t")
    public byte optimalTilingLayoutUUID(int index) { return noptimalTilingLayoutUUID(address(), index); }
    /** @return the value of the {@code identicalMemoryTypeRequirements} field. */
    @NativeType("VkBool32")
    public boolean identicalMemoryTypeRequirements() { return nidenticalMemoryTypeRequirements(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceVulkan14Properties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_PROPERTIES} value to the {@code sType} field. */
    public VkPhysicalDeviceVulkan14Properties sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_PROPERTIES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceVulkan14Properties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVulkan14Properties set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVulkan14Properties set(VkPhysicalDeviceVulkan14Properties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVulkan14Properties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan14Properties malloc() {
        return new VkPhysicalDeviceVulkan14Properties(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan14Properties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVulkan14Properties calloc() {
        return new VkPhysicalDeviceVulkan14Properties(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan14Properties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVulkan14Properties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVulkan14Properties(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVulkan14Properties} instance for the specified memory address. */
    public static VkPhysicalDeviceVulkan14Properties create(long address) {
        return new VkPhysicalDeviceVulkan14Properties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceVulkan14Properties createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceVulkan14Properties(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan14Properties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan14Properties.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan14Properties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan14Properties.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan14Properties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan14Properties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceVulkan14Properties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan14Properties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceVulkan14Properties.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan14Properties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan14Properties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan14Properties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVulkan14Properties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVulkan14Properties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan14Properties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan14Properties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan14Properties.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVulkan14Properties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVulkan14Properties.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVulkan14Properties.PNEXT); }
    /** Unsafe version of {@link #lineSubPixelPrecisionBits}. */
    public static int nlineSubPixelPrecisionBits(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.LINESUBPIXELPRECISIONBITS); }
    /** Unsafe version of {@link #maxVertexAttribDivisor}. */
    public static int nmaxVertexAttribDivisor(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.MAXVERTEXATTRIBDIVISOR); }
    /** Unsafe version of {@link #supportsNonZeroFirstInstance}. */
    public static int nsupportsNonZeroFirstInstance(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.SUPPORTSNONZEROFIRSTINSTANCE); }
    /** Unsafe version of {@link #maxPushDescriptors}. */
    public static int nmaxPushDescriptors(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.MAXPUSHDESCRIPTORS); }
    /** Unsafe version of {@link #dynamicRenderingLocalReadDepthStencilAttachments}. */
    public static int ndynamicRenderingLocalReadDepthStencilAttachments(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.DYNAMICRENDERINGLOCALREADDEPTHSTENCILATTACHMENTS); }
    /** Unsafe version of {@link #dynamicRenderingLocalReadMultisampledAttachments}. */
    public static int ndynamicRenderingLocalReadMultisampledAttachments(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.DYNAMICRENDERINGLOCALREADMULTISAMPLEDATTACHMENTS); }
    /** Unsafe version of {@link #earlyFragmentMultisampleCoverageAfterSampleCounting}. */
    public static int nearlyFragmentMultisampleCoverageAfterSampleCounting(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.EARLYFRAGMENTMULTISAMPLECOVERAGEAFTERSAMPLECOUNTING); }
    /** Unsafe version of {@link #earlyFragmentSampleMaskTestBeforeSampleCounting}. */
    public static int nearlyFragmentSampleMaskTestBeforeSampleCounting(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.EARLYFRAGMENTSAMPLEMASKTESTBEFORESAMPLECOUNTING); }
    /** Unsafe version of {@link #depthStencilSwizzleOneSupport}. */
    public static int ndepthStencilSwizzleOneSupport(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.DEPTHSTENCILSWIZZLEONESUPPORT); }
    /** Unsafe version of {@link #polygonModePointSize}. */
    public static int npolygonModePointSize(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.POLYGONMODEPOINTSIZE); }
    /** Unsafe version of {@link #nonStrictSinglePixelWideLinesUseParallelogram}. */
    public static int nnonStrictSinglePixelWideLinesUseParallelogram(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.NONSTRICTSINGLEPIXELWIDELINESUSEPARALLELOGRAM); }
    /** Unsafe version of {@link #nonStrictWideLinesUseParallelogram}. */
    public static int nnonStrictWideLinesUseParallelogram(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.NONSTRICTWIDELINESUSEPARALLELOGRAM); }
    /** Unsafe version of {@link #blockTexelViewCompatibleMultipleLayers}. */
    public static int nblockTexelViewCompatibleMultipleLayers(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.BLOCKTEXELVIEWCOMPATIBLEMULTIPLELAYERS); }
    /** Unsafe version of {@link #maxCombinedImageSamplerDescriptorCount}. */
    public static int nmaxCombinedImageSamplerDescriptorCount(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.MAXCOMBINEDIMAGESAMPLERDESCRIPTORCOUNT); }
    /** Unsafe version of {@link #fragmentShadingRateClampCombinerInputs}. */
    public static int nfragmentShadingRateClampCombinerInputs(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.FRAGMENTSHADINGRATECLAMPCOMBINERINPUTS); }
    /** Unsafe version of {@link #defaultRobustnessStorageBuffers}. */
    public static int ndefaultRobustnessStorageBuffers(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.DEFAULTROBUSTNESSSTORAGEBUFFERS); }
    /** Unsafe version of {@link #defaultRobustnessUniformBuffers}. */
    public static int ndefaultRobustnessUniformBuffers(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.DEFAULTROBUSTNESSUNIFORMBUFFERS); }
    /** Unsafe version of {@link #defaultRobustnessVertexInputs}. */
    public static int ndefaultRobustnessVertexInputs(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.DEFAULTROBUSTNESSVERTEXINPUTS); }
    /** Unsafe version of {@link #defaultRobustnessImages}. */
    public static int ndefaultRobustnessImages(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.DEFAULTROBUSTNESSIMAGES); }
    /** Unsafe version of {@link #copySrcLayoutCount}. */
    public static int ncopySrcLayoutCount(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.COPYSRCLAYOUTCOUNT); }
    /** Unsafe version of {@link #pCopySrcLayouts() pCopySrcLayouts}. */
    public static @Nullable IntBuffer npCopySrcLayouts(long struct) { return memIntBufferSafe(memGetAddress(struct + VkPhysicalDeviceVulkan14Properties.PCOPYSRCLAYOUTS), ncopySrcLayoutCount(struct)); }
    /** Unsafe version of {@link #copyDstLayoutCount}. */
    public static int ncopyDstLayoutCount(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.COPYDSTLAYOUTCOUNT); }
    /** Unsafe version of {@link #pCopyDstLayouts() pCopyDstLayouts}. */
    public static @Nullable IntBuffer npCopyDstLayouts(long struct) { return memIntBufferSafe(memGetAddress(struct + VkPhysicalDeviceVulkan14Properties.PCOPYDSTLAYOUTS), ncopyDstLayoutCount(struct)); }
    /** Unsafe version of {@link #optimalTilingLayoutUUID}. */
    public static ByteBuffer noptimalTilingLayoutUUID(long struct) { return memByteBuffer(struct + VkPhysicalDeviceVulkan14Properties.OPTIMALTILINGLAYOUTUUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #optimalTilingLayoutUUID(int) optimalTilingLayoutUUID}. */
    public static byte noptimalTilingLayoutUUID(long struct, int index) {
        return memGetByte(struct + VkPhysicalDeviceVulkan14Properties.OPTIMALTILINGLAYOUTUUID + check(index, VK_UUID_SIZE) * 1);
    }
    /** Unsafe version of {@link #identicalMemoryTypeRequirements}. */
    public static int nidenticalMemoryTypeRequirements(long struct) { return memGetInt(struct + VkPhysicalDeviceVulkan14Properties.IDENTICALMEMORYTYPEREQUIREMENTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVulkan14Properties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVulkan14Properties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVulkan14Properties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkan14Properties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVulkan14Properties ELEMENT_FACTORY = VkPhysicalDeviceVulkan14Properties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVulkan14Properties.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVulkan14Properties#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceVulkan14Properties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVulkan14Properties.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVulkan14Properties.npNext(address()); }
        /** @return the value of the {@code lineSubPixelPrecisionBits} field. */
        @NativeType("uint32_t")
        public int lineSubPixelPrecisionBits() { return VkPhysicalDeviceVulkan14Properties.nlineSubPixelPrecisionBits(address()); }
        /** @return the value of the {@code maxVertexAttribDivisor} field. */
        @NativeType("uint32_t")
        public int maxVertexAttribDivisor() { return VkPhysicalDeviceVulkan14Properties.nmaxVertexAttribDivisor(address()); }
        /** @return the value of the {@code supportsNonZeroFirstInstance} field. */
        @NativeType("VkBool32")
        public boolean supportsNonZeroFirstInstance() { return VkPhysicalDeviceVulkan14Properties.nsupportsNonZeroFirstInstance(address()) != 0; }
        /** @return the value of the {@code maxPushDescriptors} field. */
        @NativeType("uint32_t")
        public int maxPushDescriptors() { return VkPhysicalDeviceVulkan14Properties.nmaxPushDescriptors(address()); }
        /** @return the value of the {@code dynamicRenderingLocalReadDepthStencilAttachments} field. */
        @NativeType("VkBool32")
        public boolean dynamicRenderingLocalReadDepthStencilAttachments() { return VkPhysicalDeviceVulkan14Properties.ndynamicRenderingLocalReadDepthStencilAttachments(address()) != 0; }
        /** @return the value of the {@code dynamicRenderingLocalReadMultisampledAttachments} field. */
        @NativeType("VkBool32")
        public boolean dynamicRenderingLocalReadMultisampledAttachments() { return VkPhysicalDeviceVulkan14Properties.ndynamicRenderingLocalReadMultisampledAttachments(address()) != 0; }
        /** @return the value of the {@code earlyFragmentMultisampleCoverageAfterSampleCounting} field. */
        @NativeType("VkBool32")
        public boolean earlyFragmentMultisampleCoverageAfterSampleCounting() { return VkPhysicalDeviceVulkan14Properties.nearlyFragmentMultisampleCoverageAfterSampleCounting(address()) != 0; }
        /** @return the value of the {@code earlyFragmentSampleMaskTestBeforeSampleCounting} field. */
        @NativeType("VkBool32")
        public boolean earlyFragmentSampleMaskTestBeforeSampleCounting() { return VkPhysicalDeviceVulkan14Properties.nearlyFragmentSampleMaskTestBeforeSampleCounting(address()) != 0; }
        /** @return the value of the {@code depthStencilSwizzleOneSupport} field. */
        @NativeType("VkBool32")
        public boolean depthStencilSwizzleOneSupport() { return VkPhysicalDeviceVulkan14Properties.ndepthStencilSwizzleOneSupport(address()) != 0; }
        /** @return the value of the {@code polygonModePointSize} field. */
        @NativeType("VkBool32")
        public boolean polygonModePointSize() { return VkPhysicalDeviceVulkan14Properties.npolygonModePointSize(address()) != 0; }
        /** @return the value of the {@code nonStrictSinglePixelWideLinesUseParallelogram} field. */
        @NativeType("VkBool32")
        public boolean nonStrictSinglePixelWideLinesUseParallelogram() { return VkPhysicalDeviceVulkan14Properties.nnonStrictSinglePixelWideLinesUseParallelogram(address()) != 0; }
        /** @return the value of the {@code nonStrictWideLinesUseParallelogram} field. */
        @NativeType("VkBool32")
        public boolean nonStrictWideLinesUseParallelogram() { return VkPhysicalDeviceVulkan14Properties.nnonStrictWideLinesUseParallelogram(address()) != 0; }
        /** @return the value of the {@code blockTexelViewCompatibleMultipleLayers} field. */
        @NativeType("VkBool32")
        public boolean blockTexelViewCompatibleMultipleLayers() { return VkPhysicalDeviceVulkan14Properties.nblockTexelViewCompatibleMultipleLayers(address()) != 0; }
        /** @return the value of the {@code maxCombinedImageSamplerDescriptorCount} field. */
        @NativeType("uint32_t")
        public int maxCombinedImageSamplerDescriptorCount() { return VkPhysicalDeviceVulkan14Properties.nmaxCombinedImageSamplerDescriptorCount(address()); }
        /** @return the value of the {@code fragmentShadingRateClampCombinerInputs} field. */
        @NativeType("VkBool32")
        public boolean fragmentShadingRateClampCombinerInputs() { return VkPhysicalDeviceVulkan14Properties.nfragmentShadingRateClampCombinerInputs(address()) != 0; }
        /** @return the value of the {@code defaultRobustnessStorageBuffers} field. */
        @NativeType("VkPipelineRobustnessBufferBehavior")
        public int defaultRobustnessStorageBuffers() { return VkPhysicalDeviceVulkan14Properties.ndefaultRobustnessStorageBuffers(address()); }
        /** @return the value of the {@code defaultRobustnessUniformBuffers} field. */
        @NativeType("VkPipelineRobustnessBufferBehavior")
        public int defaultRobustnessUniformBuffers() { return VkPhysicalDeviceVulkan14Properties.ndefaultRobustnessUniformBuffers(address()); }
        /** @return the value of the {@code defaultRobustnessVertexInputs} field. */
        @NativeType("VkPipelineRobustnessBufferBehavior")
        public int defaultRobustnessVertexInputs() { return VkPhysicalDeviceVulkan14Properties.ndefaultRobustnessVertexInputs(address()); }
        /** @return the value of the {@code defaultRobustnessImages} field. */
        @NativeType("VkPipelineRobustnessImageBehavior")
        public int defaultRobustnessImages() { return VkPhysicalDeviceVulkan14Properties.ndefaultRobustnessImages(address()); }
        /** @return the value of the {@code copySrcLayoutCount} field. */
        @NativeType("uint32_t")
        public int copySrcLayoutCount() { return VkPhysicalDeviceVulkan14Properties.ncopySrcLayoutCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pCopySrcLayouts} field. */
        @NativeType("VkImageLayout *")
        public @Nullable IntBuffer pCopySrcLayouts() { return VkPhysicalDeviceVulkan14Properties.npCopySrcLayouts(address()); }
        /** @return the value of the {@code copyDstLayoutCount} field. */
        @NativeType("uint32_t")
        public int copyDstLayoutCount() { return VkPhysicalDeviceVulkan14Properties.ncopyDstLayoutCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pCopyDstLayouts} field. */
        @NativeType("VkImageLayout *")
        public @Nullable IntBuffer pCopyDstLayouts() { return VkPhysicalDeviceVulkan14Properties.npCopyDstLayouts(address()); }
        /** @return a {@link ByteBuffer} view of the {@code optimalTilingLayoutUUID} field. */
        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer optimalTilingLayoutUUID() { return VkPhysicalDeviceVulkan14Properties.noptimalTilingLayoutUUID(address()); }
        /** @return the value at the specified index of the {@code optimalTilingLayoutUUID} field. */
        @NativeType("uint8_t")
        public byte optimalTilingLayoutUUID(int index) { return VkPhysicalDeviceVulkan14Properties.noptimalTilingLayoutUUID(address(), index); }
        /** @return the value of the {@code identicalMemoryTypeRequirements} field. */
        @NativeType("VkBool32")
        public boolean identicalMemoryTypeRequirements() { return VkPhysicalDeviceVulkan14Properties.nidenticalMemoryTypeRequirements(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceVulkan14Properties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVulkan14Properties.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_PROPERTIES} value to the {@code sType} field. */
        public VkPhysicalDeviceVulkan14Properties.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_PROPERTIES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceVulkan14Properties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVulkan14Properties.npNext(address(), value); return this; }

    }

}
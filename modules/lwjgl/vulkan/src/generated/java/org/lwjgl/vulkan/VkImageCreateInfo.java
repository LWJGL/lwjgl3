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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct VkImageCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImageCreateFlags flags;
 *     VkImageType imageType;
 *     VkFormat format;
 *     {@link VkExtent3D VkExtent3D} extent;
 *     uint32_t mipLevels;
 *     uint32_t arrayLayers;
 *     VkSampleCountFlagBits samples;
 *     VkImageTiling tiling;
 *     VkImageUsageFlags usage;
 *     VkSharingMode sharingMode;
 *     uint32_t queueFamilyIndexCount;
 *     uint32_t const * pQueueFamilyIndices;
 *     VkImageLayout initialLayout;
 * }</code></pre>
 */
public class VkImageCreateInfo extends Struct<VkImageCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        IMAGETYPE,
        FORMAT,
        EXTENT,
        MIPLEVELS,
        ARRAYLAYERS,
        SAMPLES,
        TILING,
        USAGE,
        SHARINGMODE,
        QUEUEFAMILYINDEXCOUNT,
        PQUEUEFAMILYINDICES,
        INITIALLAYOUT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        IMAGETYPE = layout.offsetof(3);
        FORMAT = layout.offsetof(4);
        EXTENT = layout.offsetof(5);
        MIPLEVELS = layout.offsetof(6);
        ARRAYLAYERS = layout.offsetof(7);
        SAMPLES = layout.offsetof(8);
        TILING = layout.offsetof(9);
        USAGE = layout.offsetof(10);
        SHARINGMODE = layout.offsetof(11);
        QUEUEFAMILYINDEXCOUNT = layout.offsetof(12);
        PQUEUEFAMILYINDICES = layout.offsetof(13);
        INITIALLAYOUT = layout.offsetof(14);
    }

    protected VkImageCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkImageCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkImageCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkImageCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code imageType} field. */
    @NativeType("VkImageType")
    public int imageType() { return nimageType(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** @return a {@link VkExtent3D} view of the {@code extent} field. */
    public VkExtent3D extent() { return nextent(address()); }
    /** @return the value of the {@code mipLevels} field. */
    @NativeType("uint32_t")
    public int mipLevels() { return nmipLevels(address()); }
    /** @return the value of the {@code arrayLayers} field. */
    @NativeType("uint32_t")
    public int arrayLayers() { return narrayLayers(address()); }
    /** @return the value of the {@code samples} field. */
    @NativeType("VkSampleCountFlagBits")
    public int samples() { return nsamples(address()); }
    /** @return the value of the {@code tiling} field. */
    @NativeType("VkImageTiling")
    public int tiling() { return ntiling(address()); }
    /** @return the value of the {@code usage} field. */
    @NativeType("VkImageUsageFlags")
    public int usage() { return nusage(address()); }
    /** @return the value of the {@code sharingMode} field. */
    @NativeType("VkSharingMode")
    public int sharingMode() { return nsharingMode(address()); }
    /** @return the value of the {@code queueFamilyIndexCount} field. */
    @NativeType("uint32_t")
    public int queueFamilyIndexCount() { return nqueueFamilyIndexCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pQueueFamilyIndices} field. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pQueueFamilyIndices() { return npQueueFamilyIndices(address()); }
    /** @return the value of the {@code initialLayout} field. */
    @NativeType("VkImageLayout")
    public int initialLayout() { return ninitialLayout(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO STRUCTURE_TYPE_IMAGE_CREATE_INFO} value to the {@code sType} field. */
    public VkImageCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDedicatedAllocationImageCreateInfoNV} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkDedicatedAllocationImageCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMetalObjectCreateInfoEXT} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkExportMetalObjectCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExternalFormatANDROID} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkExternalFormatANDROID value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExternalMemoryImageCreateInfo} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkExternalMemoryImageCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExternalMemoryImageCreateInfoKHR} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkExternalMemoryImageCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExternalMemoryImageCreateInfoNV} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkExternalMemoryImageCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageAlignmentControlCreateInfoMESA} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkImageAlignmentControlCreateInfoMESA value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageCompressionControlEXT} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkImageCompressionControlEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageDrmFormatModifierExplicitCreateInfoEXT} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkImageDrmFormatModifierExplicitCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageDrmFormatModifierListCreateInfoEXT} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkImageDrmFormatModifierListCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageFormatListCreateInfo} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkImageFormatListCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageFormatListCreateInfoKHR} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkImageFormatListCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageStencilUsageCreateInfo} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkImageStencilUsageCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageStencilUsageCreateInfoEXT} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkImageStencilUsageCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageSwapchainCreateInfoKHR} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkImageSwapchainCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImportMetalIOSurfaceInfoEXT} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkImportMetalIOSurfaceInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImportMetalTextureInfoEXT} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkImportMetalTextureInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkOpticalFlowImageFormatInfoNV} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkOpticalFlowImageFormatInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoProfileListInfoKHR} value to the {@code pNext} chain. */
    public VkImageCreateInfo pNext(VkVideoProfileListInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkImageCreateInfo flags(@NativeType("VkImageCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code imageType} field. */
    public VkImageCreateInfo imageType(@NativeType("VkImageType") int value) { nimageType(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public VkImageCreateInfo format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Copies the specified {@link VkExtent3D} to the {@code extent} field. */
    public VkImageCreateInfo extent(VkExtent3D value) { nextent(address(), value); return this; }
    /** Passes the {@code extent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageCreateInfo extent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(extent()); return this; }
    /** Sets the specified value to the {@code mipLevels} field. */
    public VkImageCreateInfo mipLevels(@NativeType("uint32_t") int value) { nmipLevels(address(), value); return this; }
    /** Sets the specified value to the {@code arrayLayers} field. */
    public VkImageCreateInfo arrayLayers(@NativeType("uint32_t") int value) { narrayLayers(address(), value); return this; }
    /** Sets the specified value to the {@code samples} field. */
    public VkImageCreateInfo samples(@NativeType("VkSampleCountFlagBits") int value) { nsamples(address(), value); return this; }
    /** Sets the specified value to the {@code tiling} field. */
    public VkImageCreateInfo tiling(@NativeType("VkImageTiling") int value) { ntiling(address(), value); return this; }
    /** Sets the specified value to the {@code usage} field. */
    public VkImageCreateInfo usage(@NativeType("VkImageUsageFlags") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@code sharingMode} field. */
    public VkImageCreateInfo sharingMode(@NativeType("VkSharingMode") int value) { nsharingMode(address(), value); return this; }
    /** Sets the specified value to the {@code queueFamilyIndexCount} field. */
    public VkImageCreateInfo queueFamilyIndexCount(@NativeType("uint32_t") int value) { nqueueFamilyIndexCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pQueueFamilyIndices} field. */
    public VkImageCreateInfo pQueueFamilyIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npQueueFamilyIndices(address(), value); return this; }
    /** Sets the specified value to the {@code initialLayout} field. */
    public VkImageCreateInfo initialLayout(@NativeType("VkImageLayout") int value) { ninitialLayout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageCreateInfo set(
        int sType,
        long pNext,
        int flags,
        int imageType,
        int format,
        VkExtent3D extent,
        int mipLevels,
        int arrayLayers,
        int samples,
        int tiling,
        int usage,
        int sharingMode,
        int queueFamilyIndexCount,
        @Nullable IntBuffer pQueueFamilyIndices,
        int initialLayout
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        imageType(imageType);
        format(format);
        extent(extent);
        mipLevels(mipLevels);
        arrayLayers(arrayLayers);
        samples(samples);
        tiling(tiling);
        usage(usage);
        sharingMode(sharingMode);
        queueFamilyIndexCount(queueFamilyIndexCount);
        pQueueFamilyIndices(pQueueFamilyIndices);
        initialLayout(initialLayout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageCreateInfo set(VkImageCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageCreateInfo malloc() {
        return new VkImageCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageCreateInfo calloc() {
        return new VkImageCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkImageCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkImageCreateInfo} instance for the specified memory address. */
    public static VkImageCreateInfo create(long address) {
        return new VkImageCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkImageCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkImageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImageCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageCreateInfo malloc(MemoryStack stack) {
        return new VkImageCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageCreateInfo calloc(MemoryStack stack) {
        return new VkImageCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImageCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkImageCreateInfo.FLAGS); }
    /** Unsafe version of {@link #imageType}. */
    public static int nimageType(long struct) { return memGetInt(struct + VkImageCreateInfo.IMAGETYPE); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + VkImageCreateInfo.FORMAT); }
    /** Unsafe version of {@link #extent}. */
    public static VkExtent3D nextent(long struct) { return VkExtent3D.create(struct + VkImageCreateInfo.EXTENT); }
    /** Unsafe version of {@link #mipLevels}. */
    public static int nmipLevels(long struct) { return memGetInt(struct + VkImageCreateInfo.MIPLEVELS); }
    /** Unsafe version of {@link #arrayLayers}. */
    public static int narrayLayers(long struct) { return memGetInt(struct + VkImageCreateInfo.ARRAYLAYERS); }
    /** Unsafe version of {@link #samples}. */
    public static int nsamples(long struct) { return memGetInt(struct + VkImageCreateInfo.SAMPLES); }
    /** Unsafe version of {@link #tiling}. */
    public static int ntiling(long struct) { return memGetInt(struct + VkImageCreateInfo.TILING); }
    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return memGetInt(struct + VkImageCreateInfo.USAGE); }
    /** Unsafe version of {@link #sharingMode}. */
    public static int nsharingMode(long struct) { return memGetInt(struct + VkImageCreateInfo.SHARINGMODE); }
    /** Unsafe version of {@link #queueFamilyIndexCount}. */
    public static int nqueueFamilyIndexCount(long struct) { return memGetInt(struct + VkImageCreateInfo.QUEUEFAMILYINDEXCOUNT); }
    /** Unsafe version of {@link #pQueueFamilyIndices() pQueueFamilyIndices}. */
    public static @Nullable IntBuffer npQueueFamilyIndices(long struct) { return memIntBufferSafe(memGetAddress(struct + VkImageCreateInfo.PQUEUEFAMILYINDICES), nqueueFamilyIndexCount(struct)); }
    /** Unsafe version of {@link #initialLayout}. */
    public static int ninitialLayout(long struct) { return memGetInt(struct + VkImageCreateInfo.INITIALLAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImageCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkImageCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #imageType(int) imageType}. */
    public static void nimageType(long struct, int value) { memPutInt(struct + VkImageCreateInfo.IMAGETYPE, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + VkImageCreateInfo.FORMAT, value); }
    /** Unsafe version of {@link #extent(VkExtent3D) extent}. */
    public static void nextent(long struct, VkExtent3D value) { memCopy(value.address(), struct + VkImageCreateInfo.EXTENT, VkExtent3D.SIZEOF); }
    /** Unsafe version of {@link #mipLevels(int) mipLevels}. */
    public static void nmipLevels(long struct, int value) { memPutInt(struct + VkImageCreateInfo.MIPLEVELS, value); }
    /** Unsafe version of {@link #arrayLayers(int) arrayLayers}. */
    public static void narrayLayers(long struct, int value) { memPutInt(struct + VkImageCreateInfo.ARRAYLAYERS, value); }
    /** Unsafe version of {@link #samples(int) samples}. */
    public static void nsamples(long struct, int value) { memPutInt(struct + VkImageCreateInfo.SAMPLES, value); }
    /** Unsafe version of {@link #tiling(int) tiling}. */
    public static void ntiling(long struct, int value) { memPutInt(struct + VkImageCreateInfo.TILING, value); }
    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { memPutInt(struct + VkImageCreateInfo.USAGE, value); }
    /** Unsafe version of {@link #sharingMode(int) sharingMode}. */
    public static void nsharingMode(long struct, int value) { memPutInt(struct + VkImageCreateInfo.SHARINGMODE, value); }
    /** Sets the specified value to the {@code queueFamilyIndexCount} field of the specified {@code struct}. */
    public static void nqueueFamilyIndexCount(long struct, int value) { memPutInt(struct + VkImageCreateInfo.QUEUEFAMILYINDEXCOUNT, value); }
    /** Unsafe version of {@link #pQueueFamilyIndices(IntBuffer) pQueueFamilyIndices}. */
    public static void npQueueFamilyIndices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkImageCreateInfo.PQUEUEFAMILYINDICES, memAddressSafe(value)); if (value != null) { nqueueFamilyIndexCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #initialLayout(int) initialLayout}. */
    public static void ninitialLayout(long struct, int value) { memPutInt(struct + VkImageCreateInfo.INITIALLAYOUT, value); }

    // -----------------------------------

    /** An array of {@link VkImageCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkImageCreateInfo, Buffer> implements NativeResource {

        private static final VkImageCreateInfo ELEMENT_FACTORY = VkImageCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkImageCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageCreateInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkImageCreateFlags")
        public int flags() { return VkImageCreateInfo.nflags(address()); }
        /** @return the value of the {@code imageType} field. */
        @NativeType("VkImageType")
        public int imageType() { return VkImageCreateInfo.nimageType(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("VkFormat")
        public int format() { return VkImageCreateInfo.nformat(address()); }
        /** @return a {@link VkExtent3D} view of the {@code extent} field. */
        public VkExtent3D extent() { return VkImageCreateInfo.nextent(address()); }
        /** @return the value of the {@code mipLevels} field. */
        @NativeType("uint32_t")
        public int mipLevels() { return VkImageCreateInfo.nmipLevels(address()); }
        /** @return the value of the {@code arrayLayers} field. */
        @NativeType("uint32_t")
        public int arrayLayers() { return VkImageCreateInfo.narrayLayers(address()); }
        /** @return the value of the {@code samples} field. */
        @NativeType("VkSampleCountFlagBits")
        public int samples() { return VkImageCreateInfo.nsamples(address()); }
        /** @return the value of the {@code tiling} field. */
        @NativeType("VkImageTiling")
        public int tiling() { return VkImageCreateInfo.ntiling(address()); }
        /** @return the value of the {@code usage} field. */
        @NativeType("VkImageUsageFlags")
        public int usage() { return VkImageCreateInfo.nusage(address()); }
        /** @return the value of the {@code sharingMode} field. */
        @NativeType("VkSharingMode")
        public int sharingMode() { return VkImageCreateInfo.nsharingMode(address()); }
        /** @return the value of the {@code queueFamilyIndexCount} field. */
        @NativeType("uint32_t")
        public int queueFamilyIndexCount() { return VkImageCreateInfo.nqueueFamilyIndexCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pQueueFamilyIndices} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pQueueFamilyIndices() { return VkImageCreateInfo.npQueueFamilyIndices(address()); }
        /** @return the value of the {@code initialLayout} field. */
        @NativeType("VkImageLayout")
        public int initialLayout() { return VkImageCreateInfo.ninitialLayout(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkImageCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO STRUCTURE_TYPE_IMAGE_CREATE_INFO} value to the {@code sType} field. */
        public VkImageCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkImageCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDedicatedAllocationImageCreateInfoNV} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkDedicatedAllocationImageCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMetalObjectCreateInfoEXT} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkExportMetalObjectCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExternalFormatANDROID} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkExternalFormatANDROID value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExternalMemoryImageCreateInfo} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkExternalMemoryImageCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExternalMemoryImageCreateInfoKHR} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkExternalMemoryImageCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExternalMemoryImageCreateInfoNV} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkExternalMemoryImageCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageAlignmentControlCreateInfoMESA} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkImageAlignmentControlCreateInfoMESA value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageCompressionControlEXT} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkImageCompressionControlEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageDrmFormatModifierExplicitCreateInfoEXT} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkImageDrmFormatModifierExplicitCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageDrmFormatModifierListCreateInfoEXT} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkImageDrmFormatModifierListCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageFormatListCreateInfo} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkImageFormatListCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageFormatListCreateInfoKHR} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkImageFormatListCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageStencilUsageCreateInfo} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkImageStencilUsageCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageStencilUsageCreateInfoEXT} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkImageStencilUsageCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageSwapchainCreateInfoKHR} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkImageSwapchainCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImportMetalIOSurfaceInfoEXT} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkImportMetalIOSurfaceInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImportMetalTextureInfoEXT} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkImportMetalTextureInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkOpticalFlowImageFormatInfoNV} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkOpticalFlowImageFormatInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoProfileListInfoKHR} value to the {@code pNext} chain. */
        public VkImageCreateInfo.Buffer pNext(VkVideoProfileListInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkImageCreateInfo.Buffer flags(@NativeType("VkImageCreateFlags") int value) { VkImageCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code imageType} field. */
        public VkImageCreateInfo.Buffer imageType(@NativeType("VkImageType") int value) { VkImageCreateInfo.nimageType(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public VkImageCreateInfo.Buffer format(@NativeType("VkFormat") int value) { VkImageCreateInfo.nformat(address(), value); return this; }
        /** Copies the specified {@link VkExtent3D} to the {@code extent} field. */
        public VkImageCreateInfo.Buffer extent(VkExtent3D value) { VkImageCreateInfo.nextent(address(), value); return this; }
        /** Passes the {@code extent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageCreateInfo.Buffer extent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(extent()); return this; }
        /** Sets the specified value to the {@code mipLevels} field. */
        public VkImageCreateInfo.Buffer mipLevels(@NativeType("uint32_t") int value) { VkImageCreateInfo.nmipLevels(address(), value); return this; }
        /** Sets the specified value to the {@code arrayLayers} field. */
        public VkImageCreateInfo.Buffer arrayLayers(@NativeType("uint32_t") int value) { VkImageCreateInfo.narrayLayers(address(), value); return this; }
        /** Sets the specified value to the {@code samples} field. */
        public VkImageCreateInfo.Buffer samples(@NativeType("VkSampleCountFlagBits") int value) { VkImageCreateInfo.nsamples(address(), value); return this; }
        /** Sets the specified value to the {@code tiling} field. */
        public VkImageCreateInfo.Buffer tiling(@NativeType("VkImageTiling") int value) { VkImageCreateInfo.ntiling(address(), value); return this; }
        /** Sets the specified value to the {@code usage} field. */
        public VkImageCreateInfo.Buffer usage(@NativeType("VkImageUsageFlags") int value) { VkImageCreateInfo.nusage(address(), value); return this; }
        /** Sets the specified value to the {@code sharingMode} field. */
        public VkImageCreateInfo.Buffer sharingMode(@NativeType("VkSharingMode") int value) { VkImageCreateInfo.nsharingMode(address(), value); return this; }
        /** Sets the specified value to the {@code queueFamilyIndexCount} field. */
        public VkImageCreateInfo.Buffer queueFamilyIndexCount(@NativeType("uint32_t") int value) { VkImageCreateInfo.nqueueFamilyIndexCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pQueueFamilyIndices} field. */
        public VkImageCreateInfo.Buffer pQueueFamilyIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkImageCreateInfo.npQueueFamilyIndices(address(), value); return this; }
        /** Sets the specified value to the {@code initialLayout} field. */
        public VkImageCreateInfo.Buffer initialLayout(@NativeType("VkImageLayout") int value) { VkImageCreateInfo.ninitialLayout(address(), value); return this; }

    }

}
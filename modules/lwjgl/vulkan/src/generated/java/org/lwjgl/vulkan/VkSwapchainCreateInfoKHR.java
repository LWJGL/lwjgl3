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
 * struct VkSwapchainCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSwapchainCreateFlagsKHR flags;
 *     VkSurfaceKHR surface;
 *     uint32_t minImageCount;
 *     VkFormat imageFormat;
 *     VkColorSpaceKHR imageColorSpace;
 *     {@link VkExtent2D VkExtent2D} imageExtent;
 *     uint32_t imageArrayLayers;
 *     VkImageUsageFlags imageUsage;
 *     VkSharingMode imageSharingMode;
 *     uint32_t queueFamilyIndexCount;
 *     uint32_t const * pQueueFamilyIndices;
 *     VkSurfaceTransformFlagBitsKHR preTransform;
 *     VkCompositeAlphaFlagBitsKHR compositeAlpha;
 *     VkPresentModeKHR presentMode;
 *     VkBool32 clipped;
 *     VkSwapchainKHR oldSwapchain;
 * }</code></pre>
 */
public class VkSwapchainCreateInfoKHR extends Struct<VkSwapchainCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        SURFACE,
        MINIMAGECOUNT,
        IMAGEFORMAT,
        IMAGECOLORSPACE,
        IMAGEEXTENT,
        IMAGEARRAYLAYERS,
        IMAGEUSAGE,
        IMAGESHARINGMODE,
        QUEUEFAMILYINDEXCOUNT,
        PQUEUEFAMILYINDICES,
        PRETRANSFORM,
        COMPOSITEALPHA,
        PRESENTMODE,
        CLIPPED,
        OLDSWAPCHAIN;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SURFACE = layout.offsetof(3);
        MINIMAGECOUNT = layout.offsetof(4);
        IMAGEFORMAT = layout.offsetof(5);
        IMAGECOLORSPACE = layout.offsetof(6);
        IMAGEEXTENT = layout.offsetof(7);
        IMAGEARRAYLAYERS = layout.offsetof(8);
        IMAGEUSAGE = layout.offsetof(9);
        IMAGESHARINGMODE = layout.offsetof(10);
        QUEUEFAMILYINDEXCOUNT = layout.offsetof(11);
        PQUEUEFAMILYINDICES = layout.offsetof(12);
        PRETRANSFORM = layout.offsetof(13);
        COMPOSITEALPHA = layout.offsetof(14);
        PRESENTMODE = layout.offsetof(15);
        CLIPPED = layout.offsetof(16);
        OLDSWAPCHAIN = layout.offsetof(17);
    }

    protected VkSwapchainCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSwapchainCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkSwapchainCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkSwapchainCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSwapchainCreateInfoKHR(ByteBuffer container) {
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
    @NativeType("VkSwapchainCreateFlagsKHR")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code surface} field. */
    @NativeType("VkSurfaceKHR")
    public long surface() { return nsurface(address()); }
    /** @return the value of the {@code minImageCount} field. */
    @NativeType("uint32_t")
    public int minImageCount() { return nminImageCount(address()); }
    /** @return the value of the {@code imageFormat} field. */
    @NativeType("VkFormat")
    public int imageFormat() { return nimageFormat(address()); }
    /** @return the value of the {@code imageColorSpace} field. */
    @NativeType("VkColorSpaceKHR")
    public int imageColorSpace() { return nimageColorSpace(address()); }
    /** @return a {@link VkExtent2D} view of the {@code imageExtent} field. */
    public VkExtent2D imageExtent() { return nimageExtent(address()); }
    /** @return the value of the {@code imageArrayLayers} field. */
    @NativeType("uint32_t")
    public int imageArrayLayers() { return nimageArrayLayers(address()); }
    /** @return the value of the {@code imageUsage} field. */
    @NativeType("VkImageUsageFlags")
    public int imageUsage() { return nimageUsage(address()); }
    /** @return the value of the {@code imageSharingMode} field. */
    @NativeType("VkSharingMode")
    public int imageSharingMode() { return nimageSharingMode(address()); }
    /** @return the value of the {@code queueFamilyIndexCount} field. */
    @NativeType("uint32_t")
    public int queueFamilyIndexCount() { return nqueueFamilyIndexCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pQueueFamilyIndices} field. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pQueueFamilyIndices() { return npQueueFamilyIndices(address()); }
    /** @return the value of the {@code preTransform} field. */
    @NativeType("VkSurfaceTransformFlagBitsKHR")
    public int preTransform() { return npreTransform(address()); }
    /** @return the value of the {@code compositeAlpha} field. */
    @NativeType("VkCompositeAlphaFlagBitsKHR")
    public int compositeAlpha() { return ncompositeAlpha(address()); }
    /** @return the value of the {@code presentMode} field. */
    @NativeType("VkPresentModeKHR")
    public int presentMode() { return npresentMode(address()); }
    /** @return the value of the {@code clipped} field. */
    @NativeType("VkBool32")
    public boolean clipped() { return nclipped(address()) != 0; }
    /** @return the value of the {@code oldSwapchain} field. */
    @NativeType("VkSwapchainKHR")
    public long oldSwapchain() { return noldSwapchain(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSwapchainCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRSwapchain#VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR} value to the {@code sType} field. */
    public VkSwapchainCreateInfoKHR sType$Default() { return sType(KHRSwapchain.VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSwapchainCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDeviceGroupSwapchainCreateInfoKHR} value to the {@code pNext} chain. */
    public VkSwapchainCreateInfoKHR pNext(VkDeviceGroupSwapchainCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageCompressionControlEXT} value to the {@code pNext} chain. */
    public VkSwapchainCreateInfoKHR pNext(VkImageCompressionControlEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageFormatListCreateInfo} value to the {@code pNext} chain. */
    public VkSwapchainCreateInfoKHR pNext(VkImageFormatListCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageFormatListCreateInfoKHR} value to the {@code pNext} chain. */
    public VkSwapchainCreateInfoKHR pNext(VkImageFormatListCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSurfaceFullScreenExclusiveInfoEXT} value to the {@code pNext} chain. */
    public VkSwapchainCreateInfoKHR pNext(VkSurfaceFullScreenExclusiveInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSurfaceFullScreenExclusiveWin32InfoEXT} value to the {@code pNext} chain. */
    public VkSwapchainCreateInfoKHR pNext(VkSurfaceFullScreenExclusiveWin32InfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSwapchainCounterCreateInfoEXT} value to the {@code pNext} chain. */
    public VkSwapchainCreateInfoKHR pNext(VkSwapchainCounterCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSwapchainDisplayNativeHdrCreateInfoAMD} value to the {@code pNext} chain. */
    public VkSwapchainCreateInfoKHR pNext(VkSwapchainDisplayNativeHdrCreateInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSwapchainLatencyCreateInfoNV} value to the {@code pNext} chain. */
    public VkSwapchainCreateInfoKHR pNext(VkSwapchainLatencyCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSwapchainPresentBarrierCreateInfoNV} value to the {@code pNext} chain. */
    public VkSwapchainCreateInfoKHR pNext(VkSwapchainPresentBarrierCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSwapchainPresentModesCreateInfoEXT} value to the {@code pNext} chain. */
    public VkSwapchainCreateInfoKHR pNext(VkSwapchainPresentModesCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSwapchainPresentModesCreateInfoKHR} value to the {@code pNext} chain. */
    public VkSwapchainCreateInfoKHR pNext(VkSwapchainPresentModesCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSwapchainPresentScalingCreateInfoEXT} value to the {@code pNext} chain. */
    public VkSwapchainCreateInfoKHR pNext(VkSwapchainPresentScalingCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSwapchainPresentScalingCreateInfoKHR} value to the {@code pNext} chain. */
    public VkSwapchainCreateInfoKHR pNext(VkSwapchainPresentScalingCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkSwapchainCreateInfoKHR flags(@NativeType("VkSwapchainCreateFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code surface} field. */
    public VkSwapchainCreateInfoKHR surface(@NativeType("VkSurfaceKHR") long value) { nsurface(address(), value); return this; }
    /** Sets the specified value to the {@code minImageCount} field. */
    public VkSwapchainCreateInfoKHR minImageCount(@NativeType("uint32_t") int value) { nminImageCount(address(), value); return this; }
    /** Sets the specified value to the {@code imageFormat} field. */
    public VkSwapchainCreateInfoKHR imageFormat(@NativeType("VkFormat") int value) { nimageFormat(address(), value); return this; }
    /** Sets the specified value to the {@code imageColorSpace} field. */
    public VkSwapchainCreateInfoKHR imageColorSpace(@NativeType("VkColorSpaceKHR") int value) { nimageColorSpace(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@code imageExtent} field. */
    public VkSwapchainCreateInfoKHR imageExtent(VkExtent2D value) { nimageExtent(address(), value); return this; }
    /** Passes the {@code imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkSwapchainCreateInfoKHR imageExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(imageExtent()); return this; }
    /** Sets the specified value to the {@code imageArrayLayers} field. */
    public VkSwapchainCreateInfoKHR imageArrayLayers(@NativeType("uint32_t") int value) { nimageArrayLayers(address(), value); return this; }
    /** Sets the specified value to the {@code imageUsage} field. */
    public VkSwapchainCreateInfoKHR imageUsage(@NativeType("VkImageUsageFlags") int value) { nimageUsage(address(), value); return this; }
    /** Sets the specified value to the {@code imageSharingMode} field. */
    public VkSwapchainCreateInfoKHR imageSharingMode(@NativeType("VkSharingMode") int value) { nimageSharingMode(address(), value); return this; }
    /** Sets the specified value to the {@code queueFamilyIndexCount} field. */
    public VkSwapchainCreateInfoKHR queueFamilyIndexCount(@NativeType("uint32_t") int value) { nqueueFamilyIndexCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pQueueFamilyIndices} field. */
    public VkSwapchainCreateInfoKHR pQueueFamilyIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npQueueFamilyIndices(address(), value); return this; }
    /** Sets the specified value to the {@code preTransform} field. */
    public VkSwapchainCreateInfoKHR preTransform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) { npreTransform(address(), value); return this; }
    /** Sets the specified value to the {@code compositeAlpha} field. */
    public VkSwapchainCreateInfoKHR compositeAlpha(@NativeType("VkCompositeAlphaFlagBitsKHR") int value) { ncompositeAlpha(address(), value); return this; }
    /** Sets the specified value to the {@code presentMode} field. */
    public VkSwapchainCreateInfoKHR presentMode(@NativeType("VkPresentModeKHR") int value) { npresentMode(address(), value); return this; }
    /** Sets the specified value to the {@code clipped} field. */
    public VkSwapchainCreateInfoKHR clipped(@NativeType("VkBool32") boolean value) { nclipped(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code oldSwapchain} field. */
    public VkSwapchainCreateInfoKHR oldSwapchain(@NativeType("VkSwapchainKHR") long value) { noldSwapchain(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSwapchainCreateInfoKHR set(
        int sType,
        long pNext,
        int flags,
        long surface,
        int minImageCount,
        int imageFormat,
        int imageColorSpace,
        VkExtent2D imageExtent,
        int imageArrayLayers,
        int imageUsage,
        int imageSharingMode,
        int queueFamilyIndexCount,
        @Nullable IntBuffer pQueueFamilyIndices,
        int preTransform,
        int compositeAlpha,
        int presentMode,
        boolean clipped,
        long oldSwapchain
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        surface(surface);
        minImageCount(minImageCount);
        imageFormat(imageFormat);
        imageColorSpace(imageColorSpace);
        imageExtent(imageExtent);
        imageArrayLayers(imageArrayLayers);
        imageUsage(imageUsage);
        imageSharingMode(imageSharingMode);
        queueFamilyIndexCount(queueFamilyIndexCount);
        pQueueFamilyIndices(pQueueFamilyIndices);
        preTransform(preTransform);
        compositeAlpha(compositeAlpha);
        presentMode(presentMode);
        clipped(clipped);
        oldSwapchain(oldSwapchain);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSwapchainCreateInfoKHR set(VkSwapchainCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSwapchainCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSwapchainCreateInfoKHR malloc() {
        return new VkSwapchainCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSwapchainCreateInfoKHR calloc() {
        return new VkSwapchainCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkSwapchainCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkSwapchainCreateInfoKHR} instance for the specified memory address. */
    public static VkSwapchainCreateInfoKHR create(long address) {
        return new VkSwapchainCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSwapchainCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkSwapchainCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSwapchainCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSwapchainCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSwapchainCreateInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSwapchainCreateInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSwapchainCreateInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSwapchainCreateInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSwapchainCreateInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSwapchainCreateInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSwapchainCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSwapchainCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSwapchainCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainCreateInfoKHR malloc(MemoryStack stack) {
        return new VkSwapchainCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSwapchainCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainCreateInfoKHR calloc(MemoryStack stack) {
        return new VkSwapchainCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSwapchainCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.FLAGS); }
    /** Unsafe version of {@link #surface}. */
    public static long nsurface(long struct) { return memGetLong(struct + VkSwapchainCreateInfoKHR.SURFACE); }
    /** Unsafe version of {@link #minImageCount}. */
    public static int nminImageCount(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.MINIMAGECOUNT); }
    /** Unsafe version of {@link #imageFormat}. */
    public static int nimageFormat(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.IMAGEFORMAT); }
    /** Unsafe version of {@link #imageColorSpace}. */
    public static int nimageColorSpace(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.IMAGECOLORSPACE); }
    /** Unsafe version of {@link #imageExtent}. */
    public static VkExtent2D nimageExtent(long struct) { return VkExtent2D.create(struct + VkSwapchainCreateInfoKHR.IMAGEEXTENT); }
    /** Unsafe version of {@link #imageArrayLayers}. */
    public static int nimageArrayLayers(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.IMAGEARRAYLAYERS); }
    /** Unsafe version of {@link #imageUsage}. */
    public static int nimageUsage(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.IMAGEUSAGE); }
    /** Unsafe version of {@link #imageSharingMode}. */
    public static int nimageSharingMode(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.IMAGESHARINGMODE); }
    /** Unsafe version of {@link #queueFamilyIndexCount}. */
    public static int nqueueFamilyIndexCount(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.QUEUEFAMILYINDEXCOUNT); }
    /** Unsafe version of {@link #pQueueFamilyIndices() pQueueFamilyIndices}. */
    public static @Nullable IntBuffer npQueueFamilyIndices(long struct) { return memIntBufferSafe(memGetAddress(struct + VkSwapchainCreateInfoKHR.PQUEUEFAMILYINDICES), nqueueFamilyIndexCount(struct)); }
    /** Unsafe version of {@link #preTransform}. */
    public static int npreTransform(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.PRETRANSFORM); }
    /** Unsafe version of {@link #compositeAlpha}. */
    public static int ncompositeAlpha(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.COMPOSITEALPHA); }
    /** Unsafe version of {@link #presentMode}. */
    public static int npresentMode(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.PRESENTMODE); }
    /** Unsafe version of {@link #clipped}. */
    public static int nclipped(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.CLIPPED); }
    /** Unsafe version of {@link #oldSwapchain}. */
    public static long noldSwapchain(long struct) { return memGetLong(struct + VkSwapchainCreateInfoKHR.OLDSWAPCHAIN); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSwapchainCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #surface(long) surface}. */
    public static void nsurface(long struct, long value) { memPutLong(struct + VkSwapchainCreateInfoKHR.SURFACE, value); }
    /** Unsafe version of {@link #minImageCount(int) minImageCount}. */
    public static void nminImageCount(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.MINIMAGECOUNT, value); }
    /** Unsafe version of {@link #imageFormat(int) imageFormat}. */
    public static void nimageFormat(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.IMAGEFORMAT, value); }
    /** Unsafe version of {@link #imageColorSpace(int) imageColorSpace}. */
    public static void nimageColorSpace(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.IMAGECOLORSPACE, value); }
    /** Unsafe version of {@link #imageExtent(VkExtent2D) imageExtent}. */
    public static void nimageExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkSwapchainCreateInfoKHR.IMAGEEXTENT, VkExtent2D.SIZEOF); }
    /** Unsafe version of {@link #imageArrayLayers(int) imageArrayLayers}. */
    public static void nimageArrayLayers(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.IMAGEARRAYLAYERS, value); }
    /** Unsafe version of {@link #imageUsage(int) imageUsage}. */
    public static void nimageUsage(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.IMAGEUSAGE, value); }
    /** Unsafe version of {@link #imageSharingMode(int) imageSharingMode}. */
    public static void nimageSharingMode(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.IMAGESHARINGMODE, value); }
    /** Sets the specified value to the {@code queueFamilyIndexCount} field of the specified {@code struct}. */
    public static void nqueueFamilyIndexCount(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.QUEUEFAMILYINDEXCOUNT, value); }
    /** Unsafe version of {@link #pQueueFamilyIndices(IntBuffer) pQueueFamilyIndices}. */
    public static void npQueueFamilyIndices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkSwapchainCreateInfoKHR.PQUEUEFAMILYINDICES, memAddressSafe(value)); if (value != null) { nqueueFamilyIndexCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #preTransform(int) preTransform}. */
    public static void npreTransform(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.PRETRANSFORM, value); }
    /** Unsafe version of {@link #compositeAlpha(int) compositeAlpha}. */
    public static void ncompositeAlpha(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.COMPOSITEALPHA, value); }
    /** Unsafe version of {@link #presentMode(int) presentMode}. */
    public static void npresentMode(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.PRESENTMODE, value); }
    /** Unsafe version of {@link #clipped(boolean) clipped}. */
    public static void nclipped(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.CLIPPED, value); }
    /** Unsafe version of {@link #oldSwapchain(long) oldSwapchain}. */
    public static void noldSwapchain(long struct, long value) { memPutLong(struct + VkSwapchainCreateInfoKHR.OLDSWAPCHAIN, value); }

    // -----------------------------------

    /** An array of {@link VkSwapchainCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkSwapchainCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkSwapchainCreateInfoKHR ELEMENT_FACTORY = VkSwapchainCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkSwapchainCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSwapchainCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSwapchainCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSwapchainCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSwapchainCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkSwapchainCreateFlagsKHR")
        public int flags() { return VkSwapchainCreateInfoKHR.nflags(address()); }
        /** @return the value of the {@code surface} field. */
        @NativeType("VkSurfaceKHR")
        public long surface() { return VkSwapchainCreateInfoKHR.nsurface(address()); }
        /** @return the value of the {@code minImageCount} field. */
        @NativeType("uint32_t")
        public int minImageCount() { return VkSwapchainCreateInfoKHR.nminImageCount(address()); }
        /** @return the value of the {@code imageFormat} field. */
        @NativeType("VkFormat")
        public int imageFormat() { return VkSwapchainCreateInfoKHR.nimageFormat(address()); }
        /** @return the value of the {@code imageColorSpace} field. */
        @NativeType("VkColorSpaceKHR")
        public int imageColorSpace() { return VkSwapchainCreateInfoKHR.nimageColorSpace(address()); }
        /** @return a {@link VkExtent2D} view of the {@code imageExtent} field. */
        public VkExtent2D imageExtent() { return VkSwapchainCreateInfoKHR.nimageExtent(address()); }
        /** @return the value of the {@code imageArrayLayers} field. */
        @NativeType("uint32_t")
        public int imageArrayLayers() { return VkSwapchainCreateInfoKHR.nimageArrayLayers(address()); }
        /** @return the value of the {@code imageUsage} field. */
        @NativeType("VkImageUsageFlags")
        public int imageUsage() { return VkSwapchainCreateInfoKHR.nimageUsage(address()); }
        /** @return the value of the {@code imageSharingMode} field. */
        @NativeType("VkSharingMode")
        public int imageSharingMode() { return VkSwapchainCreateInfoKHR.nimageSharingMode(address()); }
        /** @return the value of the {@code queueFamilyIndexCount} field. */
        @NativeType("uint32_t")
        public int queueFamilyIndexCount() { return VkSwapchainCreateInfoKHR.nqueueFamilyIndexCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pQueueFamilyIndices} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pQueueFamilyIndices() { return VkSwapchainCreateInfoKHR.npQueueFamilyIndices(address()); }
        /** @return the value of the {@code preTransform} field. */
        @NativeType("VkSurfaceTransformFlagBitsKHR")
        public int preTransform() { return VkSwapchainCreateInfoKHR.npreTransform(address()); }
        /** @return the value of the {@code compositeAlpha} field. */
        @NativeType("VkCompositeAlphaFlagBitsKHR")
        public int compositeAlpha() { return VkSwapchainCreateInfoKHR.ncompositeAlpha(address()); }
        /** @return the value of the {@code presentMode} field. */
        @NativeType("VkPresentModeKHR")
        public int presentMode() { return VkSwapchainCreateInfoKHR.npresentMode(address()); }
        /** @return the value of the {@code clipped} field. */
        @NativeType("VkBool32")
        public boolean clipped() { return VkSwapchainCreateInfoKHR.nclipped(address()) != 0; }
        /** @return the value of the {@code oldSwapchain} field. */
        @NativeType("VkSwapchainKHR")
        public long oldSwapchain() { return VkSwapchainCreateInfoKHR.noldSwapchain(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSwapchainCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSwapchainCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRSwapchain#VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR} value to the {@code sType} field. */
        public VkSwapchainCreateInfoKHR.Buffer sType$Default() { return sType(KHRSwapchain.VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkSwapchainCreateInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDeviceGroupSwapchainCreateInfoKHR} value to the {@code pNext} chain. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(VkDeviceGroupSwapchainCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageCompressionControlEXT} value to the {@code pNext} chain. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(VkImageCompressionControlEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageFormatListCreateInfo} value to the {@code pNext} chain. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(VkImageFormatListCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageFormatListCreateInfoKHR} value to the {@code pNext} chain. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(VkImageFormatListCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSurfaceFullScreenExclusiveInfoEXT} value to the {@code pNext} chain. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(VkSurfaceFullScreenExclusiveInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSurfaceFullScreenExclusiveWin32InfoEXT} value to the {@code pNext} chain. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(VkSurfaceFullScreenExclusiveWin32InfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSwapchainCounterCreateInfoEXT} value to the {@code pNext} chain. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(VkSwapchainCounterCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSwapchainDisplayNativeHdrCreateInfoAMD} value to the {@code pNext} chain. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(VkSwapchainDisplayNativeHdrCreateInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSwapchainLatencyCreateInfoNV} value to the {@code pNext} chain. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(VkSwapchainLatencyCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSwapchainPresentBarrierCreateInfoNV} value to the {@code pNext} chain. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(VkSwapchainPresentBarrierCreateInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSwapchainPresentModesCreateInfoEXT} value to the {@code pNext} chain. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(VkSwapchainPresentModesCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSwapchainPresentModesCreateInfoKHR} value to the {@code pNext} chain. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(VkSwapchainPresentModesCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSwapchainPresentScalingCreateInfoEXT} value to the {@code pNext} chain. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(VkSwapchainPresentScalingCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSwapchainPresentScalingCreateInfoKHR} value to the {@code pNext} chain. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(VkSwapchainPresentScalingCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkSwapchainCreateInfoKHR.Buffer flags(@NativeType("VkSwapchainCreateFlagsKHR") int value) { VkSwapchainCreateInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code surface} field. */
        public VkSwapchainCreateInfoKHR.Buffer surface(@NativeType("VkSurfaceKHR") long value) { VkSwapchainCreateInfoKHR.nsurface(address(), value); return this; }
        /** Sets the specified value to the {@code minImageCount} field. */
        public VkSwapchainCreateInfoKHR.Buffer minImageCount(@NativeType("uint32_t") int value) { VkSwapchainCreateInfoKHR.nminImageCount(address(), value); return this; }
        /** Sets the specified value to the {@code imageFormat} field. */
        public VkSwapchainCreateInfoKHR.Buffer imageFormat(@NativeType("VkFormat") int value) { VkSwapchainCreateInfoKHR.nimageFormat(address(), value); return this; }
        /** Sets the specified value to the {@code imageColorSpace} field. */
        public VkSwapchainCreateInfoKHR.Buffer imageColorSpace(@NativeType("VkColorSpaceKHR") int value) { VkSwapchainCreateInfoKHR.nimageColorSpace(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@code imageExtent} field. */
        public VkSwapchainCreateInfoKHR.Buffer imageExtent(VkExtent2D value) { VkSwapchainCreateInfoKHR.nimageExtent(address(), value); return this; }
        /** Passes the {@code imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkSwapchainCreateInfoKHR.Buffer imageExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(imageExtent()); return this; }
        /** Sets the specified value to the {@code imageArrayLayers} field. */
        public VkSwapchainCreateInfoKHR.Buffer imageArrayLayers(@NativeType("uint32_t") int value) { VkSwapchainCreateInfoKHR.nimageArrayLayers(address(), value); return this; }
        /** Sets the specified value to the {@code imageUsage} field. */
        public VkSwapchainCreateInfoKHR.Buffer imageUsage(@NativeType("VkImageUsageFlags") int value) { VkSwapchainCreateInfoKHR.nimageUsage(address(), value); return this; }
        /** Sets the specified value to the {@code imageSharingMode} field. */
        public VkSwapchainCreateInfoKHR.Buffer imageSharingMode(@NativeType("VkSharingMode") int value) { VkSwapchainCreateInfoKHR.nimageSharingMode(address(), value); return this; }
        /** Sets the specified value to the {@code queueFamilyIndexCount} field. */
        public VkSwapchainCreateInfoKHR.Buffer queueFamilyIndexCount(@NativeType("uint32_t") int value) { VkSwapchainCreateInfoKHR.nqueueFamilyIndexCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pQueueFamilyIndices} field. */
        public VkSwapchainCreateInfoKHR.Buffer pQueueFamilyIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkSwapchainCreateInfoKHR.npQueueFamilyIndices(address(), value); return this; }
        /** Sets the specified value to the {@code preTransform} field. */
        public VkSwapchainCreateInfoKHR.Buffer preTransform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) { VkSwapchainCreateInfoKHR.npreTransform(address(), value); return this; }
        /** Sets the specified value to the {@code compositeAlpha} field. */
        public VkSwapchainCreateInfoKHR.Buffer compositeAlpha(@NativeType("VkCompositeAlphaFlagBitsKHR") int value) { VkSwapchainCreateInfoKHR.ncompositeAlpha(address(), value); return this; }
        /** Sets the specified value to the {@code presentMode} field. */
        public VkSwapchainCreateInfoKHR.Buffer presentMode(@NativeType("VkPresentModeKHR") int value) { VkSwapchainCreateInfoKHR.npresentMode(address(), value); return this; }
        /** Sets the specified value to the {@code clipped} field. */
        public VkSwapchainCreateInfoKHR.Buffer clipped(@NativeType("VkBool32") boolean value) { VkSwapchainCreateInfoKHR.nclipped(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code oldSwapchain} field. */
        public VkSwapchainCreateInfoKHR.Buffer oldSwapchain(@NativeType("VkSwapchainKHR") long value) { VkSwapchainCreateInfoKHR.noldSwapchain(address(), value); return this; }

    }

}
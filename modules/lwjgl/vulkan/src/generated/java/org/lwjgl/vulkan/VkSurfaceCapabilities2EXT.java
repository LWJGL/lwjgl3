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
 * Structure describing capabilities of a surface.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code supportedSurfaceCounters} <b>must</b> not include {@link EXTDisplaySurfaceCounter#VK_SURFACE_COUNTER_VBLANK_BIT_EXT SURFACE_COUNTER_VBLANK_BIT_EXT} unless the surface queried is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#wsi-display-surfaces">display surface</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDisplaySurfaceCounter#VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}, {@link EXTDisplaySurfaceCounter#vkGetPhysicalDeviceSurfaceCapabilities2EXT GetPhysicalDeviceSurfaceCapabilities2EXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSurfaceCapabilities2EXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #minImageCount};
 *     uint32_t {@link #maxImageCount};
 *     {@link VkExtent2D VkExtent2D} {@link #currentExtent};
 *     {@link VkExtent2D VkExtent2D} {@link #minImageExtent};
 *     {@link VkExtent2D VkExtent2D} {@link #maxImageExtent};
 *     uint32_t {@link #maxImageArrayLayers};
 *     VkSurfaceTransformFlagsKHR {@link #supportedTransforms};
 *     VkSurfaceTransformFlagBitsKHR {@link #currentTransform};
 *     VkCompositeAlphaFlagsKHR {@link #supportedCompositeAlpha};
 *     VkImageUsageFlags {@link #supportedUsageFlags};
 *     VkSurfaceCounterFlagsEXT {@link #supportedSurfaceCounters};
 * }</code></pre>
 */
public class VkSurfaceCapabilities2EXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MINIMAGECOUNT,
        MAXIMAGECOUNT,
        CURRENTEXTENT,
        MINIMAGEEXTENT,
        MAXIMAGEEXTENT,
        MAXIMAGEARRAYLAYERS,
        SUPPORTEDTRANSFORMS,
        CURRENTTRANSFORM,
        SUPPORTEDCOMPOSITEALPHA,
        SUPPORTEDUSAGEFLAGS,
        SUPPORTEDSURFACECOUNTERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MINIMAGECOUNT = layout.offsetof(2);
        MAXIMAGECOUNT = layout.offsetof(3);
        CURRENTEXTENT = layout.offsetof(4);
        MINIMAGEEXTENT = layout.offsetof(5);
        MAXIMAGEEXTENT = layout.offsetof(6);
        MAXIMAGEARRAYLAYERS = layout.offsetof(7);
        SUPPORTEDTRANSFORMS = layout.offsetof(8);
        CURRENTTRANSFORM = layout.offsetof(9);
        SUPPORTEDCOMPOSITEALPHA = layout.offsetof(10);
        SUPPORTEDUSAGEFLAGS = layout.offsetof(11);
        SUPPORTEDSURFACECOUNTERS = layout.offsetof(12);
    }

    /**
     * Creates a {@code VkSurfaceCapabilities2EXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSurfaceCapabilities2EXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the minimum number of images the specified device supports for a swapchain created for the surface, and will be at least one. */
    @NativeType("uint32_t")
    public int minImageCount() { return nminImageCount(address()); }
    /** the maximum number of images the specified device supports for a swapchain created for the surface, and will be either 0, or greater than or equal to {@code minImageCount}. A value of 0 means that there is no limit on the number of images, though there <b>may</b> be limits related to the total amount of memory used by presentable images. */
    @NativeType("uint32_t")
    public int maxImageCount() { return nmaxImageCount(address()); }
    /** the current width and height of the surface, or the special value <code>(0xFFFFFFFF, 0xFFFFFFFF)</code> indicating that the surface size will be determined by the extent of a swapchain targeting the surface. */
    public VkExtent2D currentExtent() { return ncurrentExtent(address()); }
    /** contains the smallest valid swapchain extent for the surface on the specified device. The {@code width} and {@code height} of the extent will each be less than or equal to the corresponding {@code width} and {@code height} of {@code currentExtent}, unless {@code currentExtent} has the special value described above. */
    public VkExtent2D minImageExtent() { return nminImageExtent(address()); }
    /** contains the largest valid swapchain extent for the surface on the specified device. The {@code width} and {@code height} of the extent will each be greater than or equal to the corresponding {@code width} and {@code height} of {@code minImageExtent}. The {@code width} and {@code height} of the extent will each be greater than or equal to the corresponding {@code width} and {@code height} of {@code currentExtent}, unless {@code currentExtent} has the special value described above. */
    public VkExtent2D maxImageExtent() { return nmaxImageExtent(address()); }
    /** the maximum number of layers presentable images <b>can</b> have for a swapchain created for this device and surface, and will be at least one. */
    @NativeType("uint32_t")
    public int maxImageArrayLayers() { return nmaxImageArrayLayers(address()); }
    /** a bitmask of {@code VkSurfaceTransformFlagBitsKHR} indicating the presentation transforms supported for the surface on the specified device. At least one bit will be set. */
    @NativeType("VkSurfaceTransformFlagsKHR")
    public int supportedTransforms() { return nsupportedTransforms(address()); }
    /** {@code VkSurfaceTransformFlagBitsKHR} value indicating the surface’s current transform relative to the presentation engine’s natural orientation. */
    @NativeType("VkSurfaceTransformFlagBitsKHR")
    public int currentTransform() { return ncurrentTransform(address()); }
    /** a bitmask of {@code VkCompositeAlphaFlagBitsKHR}, representing the alpha compositing modes supported by the presentation engine for the surface on the specified device, and at least one bit will be set. Opaque composition <b>can</b> be achieved in any alpha compositing mode by either using an image format that has no alpha component, or by ensuring that all pixels in the presentable images have an alpha value of 1.0. */
    @NativeType("VkCompositeAlphaFlagsKHR")
    public int supportedCompositeAlpha() { return nsupportedCompositeAlpha(address()); }
    /** a bitmask of {@code VkImageUsageFlagBits} representing the ways the application <b>can</b> use the presentable images of a swapchain created with {@code VkPresentModeKHR} set to {@link KHRSurface#VK_PRESENT_MODE_IMMEDIATE_KHR PRESENT_MODE_IMMEDIATE_KHR}, {@link KHRSurface#VK_PRESENT_MODE_MAILBOX_KHR PRESENT_MODE_MAILBOX_KHR}, {@link KHRSurface#VK_PRESENT_MODE_FIFO_KHR PRESENT_MODE_FIFO_KHR} or {@link KHRSurface#VK_PRESENT_MODE_FIFO_RELAXED_KHR PRESENT_MODE_FIFO_RELAXED_KHR} for the surface on the specified device. {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT} <b>must</b> be included in the set. Implementations <b>may</b> support additional usages. */
    @NativeType("VkImageUsageFlags")
    public int supportedUsageFlags() { return nsupportedUsageFlags(address()); }
    /** a bitmask of {@code VkSurfaceCounterFlagBitsEXT} indicating the supported surface counter types. */
    @NativeType("VkSurfaceCounterFlagsEXT")
    public int supportedSurfaceCounters() { return nsupportedSurfaceCounters(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSurfaceCapabilities2EXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDisplaySurfaceCounter#VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT} value to the {@link #sType} field. */
    public VkSurfaceCapabilities2EXT sType$Default() { return sType(EXTDisplaySurfaceCounter.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSurfaceCapabilities2EXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSurfaceCapabilities2EXT set(
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
    public VkSurfaceCapabilities2EXT set(VkSurfaceCapabilities2EXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSurfaceCapabilities2EXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSurfaceCapabilities2EXT malloc() {
        return wrap(VkSurfaceCapabilities2EXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSurfaceCapabilities2EXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSurfaceCapabilities2EXT calloc() {
        return wrap(VkSurfaceCapabilities2EXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSurfaceCapabilities2EXT} instance allocated with {@link BufferUtils}. */
    public static VkSurfaceCapabilities2EXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSurfaceCapabilities2EXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSurfaceCapabilities2EXT} instance for the specified memory address. */
    public static VkSurfaceCapabilities2EXT create(long address) {
        return wrap(VkSurfaceCapabilities2EXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSurfaceCapabilities2EXT createSafe(long address) {
        return address == NULL ? null : wrap(VkSurfaceCapabilities2EXT.class, address);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilities2EXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilities2EXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilities2EXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilities2EXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilities2EXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilities2EXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSurfaceCapabilities2EXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilities2EXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSurfaceCapabilities2EXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilities2EXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilities2EXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilities2EXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilities2EXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilities2EXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilities2EXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilities2EXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilities2EXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSurfaceCapabilities2EXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceCapabilities2EXT malloc(MemoryStack stack) {
        return wrap(VkSurfaceCapabilities2EXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSurfaceCapabilities2EXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceCapabilities2EXT calloc(MemoryStack stack) {
        return wrap(VkSurfaceCapabilities2EXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSurfaceCapabilities2EXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilities2EXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilities2EXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilities2EXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilities2EXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSurfaceCapabilities2EXT.PNEXT); }
    /** Unsafe version of {@link #minImageCount}. */
    public static int nminImageCount(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilities2EXT.MINIMAGECOUNT); }
    /** Unsafe version of {@link #maxImageCount}. */
    public static int nmaxImageCount(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilities2EXT.MAXIMAGECOUNT); }
    /** Unsafe version of {@link #currentExtent}. */
    public static VkExtent2D ncurrentExtent(long struct) { return VkExtent2D.create(struct + VkSurfaceCapabilities2EXT.CURRENTEXTENT); }
    /** Unsafe version of {@link #minImageExtent}. */
    public static VkExtent2D nminImageExtent(long struct) { return VkExtent2D.create(struct + VkSurfaceCapabilities2EXT.MINIMAGEEXTENT); }
    /** Unsafe version of {@link #maxImageExtent}. */
    public static VkExtent2D nmaxImageExtent(long struct) { return VkExtent2D.create(struct + VkSurfaceCapabilities2EXT.MAXIMAGEEXTENT); }
    /** Unsafe version of {@link #maxImageArrayLayers}. */
    public static int nmaxImageArrayLayers(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilities2EXT.MAXIMAGEARRAYLAYERS); }
    /** Unsafe version of {@link #supportedTransforms}. */
    public static int nsupportedTransforms(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilities2EXT.SUPPORTEDTRANSFORMS); }
    /** Unsafe version of {@link #currentTransform}. */
    public static int ncurrentTransform(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilities2EXT.CURRENTTRANSFORM); }
    /** Unsafe version of {@link #supportedCompositeAlpha}. */
    public static int nsupportedCompositeAlpha(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilities2EXT.SUPPORTEDCOMPOSITEALPHA); }
    /** Unsafe version of {@link #supportedUsageFlags}. */
    public static int nsupportedUsageFlags(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilities2EXT.SUPPORTEDUSAGEFLAGS); }
    /** Unsafe version of {@link #supportedSurfaceCounters}. */
    public static int nsupportedSurfaceCounters(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilities2EXT.SUPPORTEDSURFACECOUNTERS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSurfaceCapabilities2EXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSurfaceCapabilities2EXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkSurfaceCapabilities2EXT} structs. */
    public static class Buffer extends StructBuffer<VkSurfaceCapabilities2EXT, Buffer> implements NativeResource {

        private static final VkSurfaceCapabilities2EXT ELEMENT_FACTORY = VkSurfaceCapabilities2EXT.create(-1L);

        /**
         * Creates a new {@code VkSurfaceCapabilities2EXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSurfaceCapabilities2EXT#SIZEOF}, and its mark will be undefined.
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
        protected VkSurfaceCapabilities2EXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSurfaceCapabilities2EXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSurfaceCapabilities2EXT.nsType(address()); }
        /** @return the value of the {@link VkSurfaceCapabilities2EXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSurfaceCapabilities2EXT.npNext(address()); }
        /** @return the value of the {@link VkSurfaceCapabilities2EXT#minImageCount} field. */
        @NativeType("uint32_t")
        public int minImageCount() { return VkSurfaceCapabilities2EXT.nminImageCount(address()); }
        /** @return the value of the {@link VkSurfaceCapabilities2EXT#maxImageCount} field. */
        @NativeType("uint32_t")
        public int maxImageCount() { return VkSurfaceCapabilities2EXT.nmaxImageCount(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkSurfaceCapabilities2EXT#currentExtent} field. */
        public VkExtent2D currentExtent() { return VkSurfaceCapabilities2EXT.ncurrentExtent(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkSurfaceCapabilities2EXT#minImageExtent} field. */
        public VkExtent2D minImageExtent() { return VkSurfaceCapabilities2EXT.nminImageExtent(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkSurfaceCapabilities2EXT#maxImageExtent} field. */
        public VkExtent2D maxImageExtent() { return VkSurfaceCapabilities2EXT.nmaxImageExtent(address()); }
        /** @return the value of the {@link VkSurfaceCapabilities2EXT#maxImageArrayLayers} field. */
        @NativeType("uint32_t")
        public int maxImageArrayLayers() { return VkSurfaceCapabilities2EXT.nmaxImageArrayLayers(address()); }
        /** @return the value of the {@link VkSurfaceCapabilities2EXT#supportedTransforms} field. */
        @NativeType("VkSurfaceTransformFlagsKHR")
        public int supportedTransforms() { return VkSurfaceCapabilities2EXT.nsupportedTransforms(address()); }
        /** @return the value of the {@link VkSurfaceCapabilities2EXT#currentTransform} field. */
        @NativeType("VkSurfaceTransformFlagBitsKHR")
        public int currentTransform() { return VkSurfaceCapabilities2EXT.ncurrentTransform(address()); }
        /** @return the value of the {@link VkSurfaceCapabilities2EXT#supportedCompositeAlpha} field. */
        @NativeType("VkCompositeAlphaFlagsKHR")
        public int supportedCompositeAlpha() { return VkSurfaceCapabilities2EXT.nsupportedCompositeAlpha(address()); }
        /** @return the value of the {@link VkSurfaceCapabilities2EXT#supportedUsageFlags} field. */
        @NativeType("VkImageUsageFlags")
        public int supportedUsageFlags() { return VkSurfaceCapabilities2EXT.nsupportedUsageFlags(address()); }
        /** @return the value of the {@link VkSurfaceCapabilities2EXT#supportedSurfaceCounters} field. */
        @NativeType("VkSurfaceCounterFlagsEXT")
        public int supportedSurfaceCounters() { return VkSurfaceCapabilities2EXT.nsupportedSurfaceCounters(address()); }

        /** Sets the specified value to the {@link VkSurfaceCapabilities2EXT#sType} field. */
        public VkSurfaceCapabilities2EXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSurfaceCapabilities2EXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDisplaySurfaceCounter#VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT} value to the {@link VkSurfaceCapabilities2EXT#sType} field. */
        public VkSurfaceCapabilities2EXT.Buffer sType$Default() { return sType(EXTDisplaySurfaceCounter.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT); }
        /** Sets the specified value to the {@link VkSurfaceCapabilities2EXT#pNext} field. */
        public VkSurfaceCapabilities2EXT.Buffer pNext(@NativeType("void *") long value) { VkSurfaceCapabilities2EXT.npNext(address(), value); return this; }

    }

}
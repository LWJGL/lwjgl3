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
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Supported usage flags of a presentable image when using {@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR} or {@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR} presentation mode are provided by {@link VkSharedPresentSurfaceCapabilitiesKHR}{@code ::sharedPresentSupportedUsageFlags}.</p>
 * </div>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Formulas such as <code>min(N, maxImageCount)</code> are not correct, since {@code maxImageCount} <b>may</b> be zero.</p>
 * </div>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}, {@link VkSurfaceCapabilities2KHR}, {@link KHRSurface#vkGetPhysicalDeviceSurfaceCapabilitiesKHR GetPhysicalDeviceSurfaceCapabilitiesKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code minImageCount} &ndash; the minimum number of images the specified device supports for a swapchain created for the surface, and will be at least one.</li>
 * <li>{@code maxImageCount} &ndash; the maximum number of images the specified device supports for a swapchain created for the surface, and will be either 0, or greater than or equal to {@code minImageCount}. A value of 0 means that there is no limit on the number of images, though there <b>may</b> be limits related to the total amount of memory used by presentable images.</li>
 * <li>{@code currentExtent} &ndash; the current width and height of the surface, or the special value <code>(0xFFFFFFFF, 0xFFFFFFFF)</code> indicating that the surface size will be determined by the extent of a swapchain targeting the surface.</li>
 * <li>{@code minImageExtent} &ndash; contains the smallest valid swapchain extent for the surface on the specified device. The {@code width} and {@code height} of the extent will each be less than or equal to the corresponding {@code width} and {@code height} of {@code currentExtent}, unless {@code currentExtent} has the special value described above.</li>
 * <li>{@code maxImageExtent} &ndash; contains the largest valid swapchain extent for the surface on the specified device. The {@code width} and {@code height} of the extent will each be greater than or equal to the corresponding {@code width} and {@code height} of {@code minImageExtent}. The {@code width} and {@code height} of the extent will each be greater than or equal to the corresponding {@code width} and {@code height} of {@code currentExtent}, unless {@code currentExtent} has the special value described above.</li>
 * <li>{@code maxImageArrayLayers} &ndash; the maximum number of layers presentable images <b>can</b> have for a swapchain created for this device and surface, and will be at least one.</li>
 * <li>{@code supportedTransforms} &ndash; a bitmask of {@code VkSurfaceTransformFlagBitsKHR} indicating the presentation transforms supported for the surface on the specified device. At least one bit will be set.</li>
 * <li>{@code currentTransform} &ndash; {@code VkSurfaceTransformFlagBitsKHR} value indicating the surface&#8217;s current transform relative to the presentation engine&#8217;s natural orientation.</li>
 * <li>{@code supportedCompositeAlpha} &ndash; a bitmask of {@code VkCompositeAlphaFlagBitsKHR}, representing the alpha compositing modes supported by the presentation engine for the surface on the specified device, and at least one bit will be set. Opaque composition <b>can</b> be achieved in any alpha compositing mode by either using an image format that has no alpha component, or by ensuring that all pixels in the presentable images have an alpha value of 1.0.</li>
 * <li>{@code supportedUsageFlags} &ndash; a bitmask of {@code VkImageUsageFlagBits} representing the ways the application <b>can</b> use the presentable images of a swapchain created with {@code VkPresentModeKHR} set to {@link KHRSurface#VK_PRESENT_MODE_IMMEDIATE_KHR PRESENT_MODE_IMMEDIATE_KHR}, {@link KHRSurface#VK_PRESENT_MODE_MAILBOX_KHR PRESENT_MODE_MAILBOX_KHR}, {@link KHRSurface#VK_PRESENT_MODE_FIFO_KHR PRESENT_MODE_FIFO_KHR} or {@link KHRSurface#VK_PRESENT_MODE_FIFO_RELAXED_KHR PRESENT_MODE_FIFO_RELAXED_KHR} for the surface on the specified device. {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT} <b>must</b> be included in the set but implementations <b>may</b> support additional usages.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSurfaceCapabilitiesKHR {
 *     uint32_t minImageCount;
 *     uint32_t maxImageCount;
 *     {@link VkExtent2D VkExtent2D} currentExtent;
 *     {@link VkExtent2D VkExtent2D} minImageExtent;
 *     {@link VkExtent2D VkExtent2D} maxImageExtent;
 *     uint32_t maxImageArrayLayers;
 *     VkSurfaceTransformFlagsKHR supportedTransforms;
 *     VkSurfaceTransformFlagBitsKHR currentTransform;
 *     VkCompositeAlphaFlagsKHR supportedCompositeAlpha;
 *     VkImageUsageFlags supportedUsageFlags;
 * }</code></pre>
 */
public class VkSurfaceCapabilitiesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MINIMAGECOUNT,
        MAXIMAGECOUNT,
        CURRENTEXTENT,
        MINIMAGEEXTENT,
        MAXIMAGEEXTENT,
        MAXIMAGEARRAYLAYERS,
        SUPPORTEDTRANSFORMS,
        CURRENTTRANSFORM,
        SUPPORTEDCOMPOSITEALPHA,
        SUPPORTEDUSAGEFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MINIMAGECOUNT = layout.offsetof(0);
        MAXIMAGECOUNT = layout.offsetof(1);
        CURRENTEXTENT = layout.offsetof(2);
        MINIMAGEEXTENT = layout.offsetof(3);
        MAXIMAGEEXTENT = layout.offsetof(4);
        MAXIMAGEARRAYLAYERS = layout.offsetof(5);
        SUPPORTEDTRANSFORMS = layout.offsetof(6);
        CURRENTTRANSFORM = layout.offsetof(7);
        SUPPORTEDCOMPOSITEALPHA = layout.offsetof(8);
        SUPPORTEDUSAGEFLAGS = layout.offsetof(9);
    }

    /**
     * Creates a {@code VkSurfaceCapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSurfaceCapabilitiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code minImageCount} field. */
    @NativeType("uint32_t")
    public int minImageCount() { return nminImageCount(address()); }
    /** Returns the value of the {@code maxImageCount} field. */
    @NativeType("uint32_t")
    public int maxImageCount() { return nmaxImageCount(address()); }
    /** Returns a {@link VkExtent2D} view of the {@code currentExtent} field. */
    public VkExtent2D currentExtent() { return ncurrentExtent(address()); }
    /** Returns a {@link VkExtent2D} view of the {@code minImageExtent} field. */
    public VkExtent2D minImageExtent() { return nminImageExtent(address()); }
    /** Returns a {@link VkExtent2D} view of the {@code maxImageExtent} field. */
    public VkExtent2D maxImageExtent() { return nmaxImageExtent(address()); }
    /** Returns the value of the {@code maxImageArrayLayers} field. */
    @NativeType("uint32_t")
    public int maxImageArrayLayers() { return nmaxImageArrayLayers(address()); }
    /** Returns the value of the {@code supportedTransforms} field. */
    @NativeType("VkSurfaceTransformFlagsKHR")
    public int supportedTransforms() { return nsupportedTransforms(address()); }
    /** Returns the value of the {@code currentTransform} field. */
    @NativeType("VkSurfaceTransformFlagBitsKHR")
    public int currentTransform() { return ncurrentTransform(address()); }
    /** Returns the value of the {@code supportedCompositeAlpha} field. */
    @NativeType("VkCompositeAlphaFlagsKHR")
    public int supportedCompositeAlpha() { return nsupportedCompositeAlpha(address()); }
    /** Returns the value of the {@code supportedUsageFlags} field. */
    @NativeType("VkImageUsageFlags")
    public int supportedUsageFlags() { return nsupportedUsageFlags(address()); }

    // -----------------------------------

    /** Returns a new {@code VkSurfaceCapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSurfaceCapabilitiesKHR malloc() {
        return wrap(VkSurfaceCapabilitiesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSurfaceCapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSurfaceCapabilitiesKHR calloc() {
        return wrap(VkSurfaceCapabilitiesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSurfaceCapabilitiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkSurfaceCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSurfaceCapabilitiesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSurfaceCapabilitiesKHR} instance for the specified memory address. */
    public static VkSurfaceCapabilitiesKHR create(long address) {
        return wrap(VkSurfaceCapabilitiesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSurfaceCapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkSurfaceCapabilitiesKHR.class, address);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSurfaceCapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSurfaceCapabilitiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkSurfaceCapabilitiesKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSurfaceCapabilitiesKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkSurfaceCapabilitiesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSurfaceCapabilitiesKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkSurfaceCapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceCapabilitiesKHR mallocStack(MemoryStack stack) {
        return wrap(VkSurfaceCapabilitiesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSurfaceCapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceCapabilitiesKHR callocStack(MemoryStack stack) {
        return wrap(VkSurfaceCapabilitiesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilitiesKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #minImageCount}. */
    public static int nminImageCount(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilitiesKHR.MINIMAGECOUNT); }
    /** Unsafe version of {@link #maxImageCount}. */
    public static int nmaxImageCount(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilitiesKHR.MAXIMAGECOUNT); }
    /** Unsafe version of {@link #currentExtent}. */
    public static VkExtent2D ncurrentExtent(long struct) { return VkExtent2D.create(struct + VkSurfaceCapabilitiesKHR.CURRENTEXTENT); }
    /** Unsafe version of {@link #minImageExtent}. */
    public static VkExtent2D nminImageExtent(long struct) { return VkExtent2D.create(struct + VkSurfaceCapabilitiesKHR.MINIMAGEEXTENT); }
    /** Unsafe version of {@link #maxImageExtent}. */
    public static VkExtent2D nmaxImageExtent(long struct) { return VkExtent2D.create(struct + VkSurfaceCapabilitiesKHR.MAXIMAGEEXTENT); }
    /** Unsafe version of {@link #maxImageArrayLayers}. */
    public static int nmaxImageArrayLayers(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilitiesKHR.MAXIMAGEARRAYLAYERS); }
    /** Unsafe version of {@link #supportedTransforms}. */
    public static int nsupportedTransforms(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilitiesKHR.SUPPORTEDTRANSFORMS); }
    /** Unsafe version of {@link #currentTransform}. */
    public static int ncurrentTransform(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilitiesKHR.CURRENTTRANSFORM); }
    /** Unsafe version of {@link #supportedCompositeAlpha}. */
    public static int nsupportedCompositeAlpha(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilitiesKHR.SUPPORTEDCOMPOSITEALPHA); }
    /** Unsafe version of {@link #supportedUsageFlags}. */
    public static int nsupportedUsageFlags(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilitiesKHR.SUPPORTEDUSAGEFLAGS); }

    // -----------------------------------

    /** An array of {@link VkSurfaceCapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkSurfaceCapabilitiesKHR, Buffer> implements NativeResource {

        private static final VkSurfaceCapabilitiesKHR ELEMENT_FACTORY = VkSurfaceCapabilitiesKHR.create(-1L);

        /**
         * Creates a new {@code VkSurfaceCapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSurfaceCapabilitiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSurfaceCapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code minImageCount} field. */
        @NativeType("uint32_t")
        public int minImageCount() { return VkSurfaceCapabilitiesKHR.nminImageCount(address()); }
        /** Returns the value of the {@code maxImageCount} field. */
        @NativeType("uint32_t")
        public int maxImageCount() { return VkSurfaceCapabilitiesKHR.nmaxImageCount(address()); }
        /** Returns a {@link VkExtent2D} view of the {@code currentExtent} field. */
        public VkExtent2D currentExtent() { return VkSurfaceCapabilitiesKHR.ncurrentExtent(address()); }
        /** Returns a {@link VkExtent2D} view of the {@code minImageExtent} field. */
        public VkExtent2D minImageExtent() { return VkSurfaceCapabilitiesKHR.nminImageExtent(address()); }
        /** Returns a {@link VkExtent2D} view of the {@code maxImageExtent} field. */
        public VkExtent2D maxImageExtent() { return VkSurfaceCapabilitiesKHR.nmaxImageExtent(address()); }
        /** Returns the value of the {@code maxImageArrayLayers} field. */
        @NativeType("uint32_t")
        public int maxImageArrayLayers() { return VkSurfaceCapabilitiesKHR.nmaxImageArrayLayers(address()); }
        /** Returns the value of the {@code supportedTransforms} field. */
        @NativeType("VkSurfaceTransformFlagsKHR")
        public int supportedTransforms() { return VkSurfaceCapabilitiesKHR.nsupportedTransforms(address()); }
        /** Returns the value of the {@code currentTransform} field. */
        @NativeType("VkSurfaceTransformFlagBitsKHR")
        public int currentTransform() { return VkSurfaceCapabilitiesKHR.ncurrentTransform(address()); }
        /** Returns the value of the {@code supportedCompositeAlpha} field. */
        @NativeType("VkCompositeAlphaFlagsKHR")
        public int supportedCompositeAlpha() { return VkSurfaceCapabilitiesKHR.nsupportedCompositeAlpha(address()); }
        /** Returns the value of the {@code supportedUsageFlags} field. */
        @NativeType("VkImageUsageFlags")
        public int supportedUsageFlags() { return VkSurfaceCapabilitiesKHR.nsupportedUsageFlags(address()); }

    }

}
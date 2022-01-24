/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.*;

/**
 * Profile with properties defining a foveation pattern.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBFoveationVulkan XR_FB_foveation_vulkan} extension <b>must</b> be enabled prior to using {@link XrSwapchainImageFoveationVulkanFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBFoveationVulkan#XR_TYPE_SWAPCHAIN_IMAGE_FOVEATION_VULKAN_FB TYPE_SWAPCHAIN_IMAGE_FOVEATION_VULKAN_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSwapchainImageVulkanKHR}, {@link XR10#xrEnumerateSwapchainImages EnumerateSwapchainImages}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSwapchainImageFoveationVulkanFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     VkImage {@link #image};
 *     uint32_t {@link #width};
 *     uint32_t {@link #height};
 * }</code></pre>
 */
public class XrSwapchainImageFoveationVulkanFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        IMAGE,
        WIDTH,
        HEIGHT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
        WIDTH = layout.offsetof(3);
        HEIGHT = layout.offsetof(4);
    }

    /**
     * Creates a {@code XrSwapchainImageFoveationVulkanFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSwapchainImageFoveationVulkanFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** a valid Vulkan {@code VkImage} to use. */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }
    /** the horizontal width in pixels of the image. */
    @NativeType("uint32_t")
    public int width() { return nwidth(address()); }
    /** the vertical height in pixels of the image. */
    @NativeType("uint32_t")
    public int height() { return nheight(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSwapchainImageFoveationVulkanFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBFoveationVulkan#XR_TYPE_SWAPCHAIN_IMAGE_FOVEATION_VULKAN_FB TYPE_SWAPCHAIN_IMAGE_FOVEATION_VULKAN_FB} value to the {@link #type} field. */
    public XrSwapchainImageFoveationVulkanFB type$Default() { return type(FBFoveationVulkan.XR_TYPE_SWAPCHAIN_IMAGE_FOVEATION_VULKAN_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSwapchainImageFoveationVulkanFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSwapchainImageFoveationVulkanFB set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSwapchainImageFoveationVulkanFB set(XrSwapchainImageFoveationVulkanFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSwapchainImageFoveationVulkanFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSwapchainImageFoveationVulkanFB malloc() {
        return wrap(XrSwapchainImageFoveationVulkanFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSwapchainImageFoveationVulkanFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSwapchainImageFoveationVulkanFB calloc() {
        return wrap(XrSwapchainImageFoveationVulkanFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSwapchainImageFoveationVulkanFB} instance allocated with {@link BufferUtils}. */
    public static XrSwapchainImageFoveationVulkanFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSwapchainImageFoveationVulkanFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSwapchainImageFoveationVulkanFB} instance for the specified memory address. */
    public static XrSwapchainImageFoveationVulkanFB create(long address) {
        return wrap(XrSwapchainImageFoveationVulkanFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSwapchainImageFoveationVulkanFB createSafe(long address) {
        return address == NULL ? null : wrap(XrSwapchainImageFoveationVulkanFB.class, address);
    }

    /**
     * Returns a new {@link XrSwapchainImageFoveationVulkanFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageFoveationVulkanFB.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageFoveationVulkanFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageFoveationVulkanFB.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageFoveationVulkanFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageFoveationVulkanFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSwapchainImageFoveationVulkanFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageFoveationVulkanFB.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSwapchainImageFoveationVulkanFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSwapchainImageFoveationVulkanFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainImageFoveationVulkanFB malloc(MemoryStack stack) {
        return wrap(XrSwapchainImageFoveationVulkanFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSwapchainImageFoveationVulkanFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainImageFoveationVulkanFB calloc(MemoryStack stack) {
        return wrap(XrSwapchainImageFoveationVulkanFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSwapchainImageFoveationVulkanFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageFoveationVulkanFB.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageFoveationVulkanFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageFoveationVulkanFB.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainImageFoveationVulkanFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSwapchainImageFoveationVulkanFB.NEXT); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return UNSAFE.getLong(null, struct + XrSwapchainImageFoveationVulkanFB.IMAGE); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainImageFoveationVulkanFB.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainImageFoveationVulkanFB.HEIGHT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainImageFoveationVulkanFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSwapchainImageFoveationVulkanFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSwapchainImageFoveationVulkanFB} structs. */
    public static class Buffer extends StructBuffer<XrSwapchainImageFoveationVulkanFB, Buffer> implements NativeResource {

        private static final XrSwapchainImageFoveationVulkanFB ELEMENT_FACTORY = XrSwapchainImageFoveationVulkanFB.create(-1L);

        /**
         * Creates a new {@code XrSwapchainImageFoveationVulkanFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSwapchainImageFoveationVulkanFB#SIZEOF}, and its mark will be undefined.
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
        protected XrSwapchainImageFoveationVulkanFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSwapchainImageFoveationVulkanFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSwapchainImageFoveationVulkanFB.ntype(address()); }
        /** @return the value of the {@link XrSwapchainImageFoveationVulkanFB#next} field. */
        @NativeType("void *")
        public long next() { return XrSwapchainImageFoveationVulkanFB.nnext(address()); }
        /** @return the value of the {@link XrSwapchainImageFoveationVulkanFB#image} field. */
        @NativeType("VkImage")
        public long image() { return XrSwapchainImageFoveationVulkanFB.nimage(address()); }
        /** @return the value of the {@link XrSwapchainImageFoveationVulkanFB#width} field. */
        @NativeType("uint32_t")
        public int width() { return XrSwapchainImageFoveationVulkanFB.nwidth(address()); }
        /** @return the value of the {@link XrSwapchainImageFoveationVulkanFB#height} field. */
        @NativeType("uint32_t")
        public int height() { return XrSwapchainImageFoveationVulkanFB.nheight(address()); }

        /** Sets the specified value to the {@link XrSwapchainImageFoveationVulkanFB#type} field. */
        public XrSwapchainImageFoveationVulkanFB.Buffer type(@NativeType("XrStructureType") int value) { XrSwapchainImageFoveationVulkanFB.ntype(address(), value); return this; }
        /** Sets the {@link FBFoveationVulkan#XR_TYPE_SWAPCHAIN_IMAGE_FOVEATION_VULKAN_FB TYPE_SWAPCHAIN_IMAGE_FOVEATION_VULKAN_FB} value to the {@link XrSwapchainImageFoveationVulkanFB#type} field. */
        public XrSwapchainImageFoveationVulkanFB.Buffer type$Default() { return type(FBFoveationVulkan.XR_TYPE_SWAPCHAIN_IMAGE_FOVEATION_VULKAN_FB); }
        /** Sets the specified value to the {@link XrSwapchainImageFoveationVulkanFB#next} field. */
        public XrSwapchainImageFoveationVulkanFB.Buffer next(@NativeType("void *") long value) { XrSwapchainImageFoveationVulkanFB.nnext(address(), value); return this; }

    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.*;

/**
 * Vulkan-specific swapchain image structure.
 * 
 * <h5>Description</h5>
 * 
 * <p>If a given session was created with {@link XrGraphicsBindingVulkanKHR}, the following conditions <b>must</b> apply.</p>
 * 
 * <ul>
 * <li>Calls to {@link XR10#xrEnumerateSwapchainImages EnumerateSwapchainImages} on an {@code XrSwapchain} in that session <b>must</b> return an array of {@link XrSwapchainImageVulkanKHR} structures.</li>
 * <li>Whenever an OpenXR function accepts an {@link XrSwapchainImageBaseHeader} pointer as a parameter in that session, the runtime <b>must</b> also accept a pointer to an {@link XrSwapchainImageVulkanKHR}.</li>
 * </ul>
 * 
 * <p>The OpenXR runtime <b>must</b> interpret the top-left corner of the swapchain image as the coordinate origin unless specified otherwise by extension functionality.</p>
 * 
 * <p>The OpenXR runtime <b>must</b> interpret the swapchain images in a clip space of positive Y pointing down, near Z plane at 0, and far Z plane at 1.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link KHRVulkanEnable XR_KHR_vulkan_enable} extension <b>must</b> be enabled prior to using {@link XrSwapchainImageVulkanKHR}</li>
 * <li>{@code type} <b>must</b> be {@link KHRVulkanEnable#XR_TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrSwapchainImageFoveationVulkanFB}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSwapchainImageBaseHeader}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSwapchainImageVulkanKHR {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     VkImage {@link #image};
 * }</code></pre>
 */
public class XrSwapchainImageVulkanKHR extends Struct<XrSwapchainImageVulkanKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        IMAGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
    }

    protected XrSwapchainImageVulkanKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSwapchainImageVulkanKHR create(long address, @Nullable ByteBuffer container) {
        return new XrSwapchainImageVulkanKHR(address, container);
    }

    /**
     * Creates a {@code XrSwapchainImageVulkanKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSwapchainImageVulkanKHR(ByteBuffer container) {
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

    /** Sets the specified value to the {@link #type} field. */
    public XrSwapchainImageVulkanKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHRVulkanEnable#XR_TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR} value to the {@link #type} field. */
    public XrSwapchainImageVulkanKHR type$Default() { return type(KHRVulkanEnable.XR_TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSwapchainImageVulkanKHR next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrSwapchainImageFoveationVulkanFB} value to the {@code next} chain. */
    public XrSwapchainImageVulkanKHR next(XrSwapchainImageFoveationVulkanFB value) { return this.next(value.next(this.next()).address()); }

    /** Initializes this struct with the specified values. */
    public XrSwapchainImageVulkanKHR set(
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
    public XrSwapchainImageVulkanKHR set(XrSwapchainImageVulkanKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSwapchainImageVulkanKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSwapchainImageVulkanKHR malloc() {
        return new XrSwapchainImageVulkanKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSwapchainImageVulkanKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSwapchainImageVulkanKHR calloc() {
        return new XrSwapchainImageVulkanKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSwapchainImageVulkanKHR} instance allocated with {@link BufferUtils}. */
    public static XrSwapchainImageVulkanKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSwapchainImageVulkanKHR(memAddress(container), container);
    }

    /** Returns a new {@code XrSwapchainImageVulkanKHR} instance for the specified memory address. */
    public static XrSwapchainImageVulkanKHR create(long address) {
        return new XrSwapchainImageVulkanKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSwapchainImageVulkanKHR createSafe(long address) {
        return address == NULL ? null : new XrSwapchainImageVulkanKHR(address, null);
    }

    /** Downcasts the specified {@code XrSwapchainImageBaseHeader} instance to {@code XrSwapchainImageVulkanKHR}. */
    public static XrSwapchainImageVulkanKHR create(XrSwapchainImageBaseHeader value) {
        return new XrSwapchainImageVulkanKHR(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSwapchainImageVulkanKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageVulkanKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageVulkanKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageVulkanKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageVulkanKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageVulkanKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSwapchainImageVulkanKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageVulkanKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSwapchainImageVulkanKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrSwapchainImageBaseHeader.Buffer} instance to {@code XrSwapchainImageVulkanKHR.Buffer}. */
    public static XrSwapchainImageVulkanKHR.Buffer create(XrSwapchainImageBaseHeader.Buffer value) {
        return new XrSwapchainImageVulkanKHR.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSwapchainImageVulkanKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainImageVulkanKHR malloc(MemoryStack stack) {
        return new XrSwapchainImageVulkanKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSwapchainImageVulkanKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainImageVulkanKHR calloc(MemoryStack stack) {
        return new XrSwapchainImageVulkanKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSwapchainImageVulkanKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageVulkanKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainImageVulkanKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainImageVulkanKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSwapchainImageVulkanKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSwapchainImageVulkanKHR.NEXT); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return memGetLong(struct + XrSwapchainImageVulkanKHR.IMAGE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSwapchainImageVulkanKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSwapchainImageVulkanKHR.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSwapchainImageVulkanKHR} structs. */
    public static class Buffer extends StructBuffer<XrSwapchainImageVulkanKHR, Buffer> implements NativeResource {

        private static final XrSwapchainImageVulkanKHR ELEMENT_FACTORY = XrSwapchainImageVulkanKHR.create(-1L);

        /**
         * Creates a new {@code XrSwapchainImageVulkanKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSwapchainImageVulkanKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSwapchainImageVulkanKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSwapchainImageVulkanKHR#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSwapchainImageVulkanKHR.ntype(address()); }
        /** @return the value of the {@link XrSwapchainImageVulkanKHR#next} field. */
        @NativeType("void *")
        public long next() { return XrSwapchainImageVulkanKHR.nnext(address()); }
        /** @return the value of the {@link XrSwapchainImageVulkanKHR#image} field. */
        @NativeType("VkImage")
        public long image() { return XrSwapchainImageVulkanKHR.nimage(address()); }

        /** Sets the specified value to the {@link XrSwapchainImageVulkanKHR#type} field. */
        public XrSwapchainImageVulkanKHR.Buffer type(@NativeType("XrStructureType") int value) { XrSwapchainImageVulkanKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHRVulkanEnable#XR_TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR} value to the {@link XrSwapchainImageVulkanKHR#type} field. */
        public XrSwapchainImageVulkanKHR.Buffer type$Default() { return type(KHRVulkanEnable.XR_TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR); }
        /** Sets the specified value to the {@link XrSwapchainImageVulkanKHR#next} field. */
        public XrSwapchainImageVulkanKHR.Buffer next(@NativeType("void *") long value) { XrSwapchainImageVulkanKHR.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrSwapchainImageFoveationVulkanFB} value to the {@code next} chain. */
        public XrSwapchainImageVulkanKHR.Buffer next(XrSwapchainImageFoveationVulkanFB value) { return this.next(value.next(this.next()).address()); }

    }

}
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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.*;

/**
 * <pre>{@code
 * struct XrVulkanSwapchainFormatListCreateInfoKHR {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t viewFormatCount;
 *     VkFormat const * viewFormats;
 * }}</pre>
 */
public class XrVulkanSwapchainFormatListCreateInfoKHR extends Struct<XrVulkanSwapchainFormatListCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VIEWFORMATCOUNT,
        VIEWFORMATS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VIEWFORMATCOUNT = layout.offsetof(2);
        VIEWFORMATS = layout.offsetof(3);
    }

    protected XrVulkanSwapchainFormatListCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrVulkanSwapchainFormatListCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new XrVulkanSwapchainFormatListCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code XrVulkanSwapchainFormatListCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrVulkanSwapchainFormatListCreateInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code viewFormatCount} field. */
    @NativeType("uint32_t")
    public int viewFormatCount() { return nviewFormatCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code viewFormats} field. */
    @NativeType("VkFormat const *")
    public @Nullable IntBuffer viewFormats() { return nviewFormats(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrVulkanSwapchainFormatListCreateInfoKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHRVulkanSwapchainFormatList#XR_TYPE_VULKAN_SWAPCHAIN_FORMAT_LIST_CREATE_INFO_KHR TYPE_VULKAN_SWAPCHAIN_FORMAT_LIST_CREATE_INFO_KHR} value to the {@code type} field. */
    public XrVulkanSwapchainFormatListCreateInfoKHR type$Default() { return type(KHRVulkanSwapchainFormatList.XR_TYPE_VULKAN_SWAPCHAIN_FORMAT_LIST_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@code next} field. */
    public XrVulkanSwapchainFormatListCreateInfoKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code viewFormats} field. */
    public XrVulkanSwapchainFormatListCreateInfoKHR viewFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { nviewFormats(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrVulkanSwapchainFormatListCreateInfoKHR set(
        int type,
        long next,
        @Nullable IntBuffer viewFormats
    ) {
        type(type);
        next(next);
        viewFormats(viewFormats);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrVulkanSwapchainFormatListCreateInfoKHR set(XrVulkanSwapchainFormatListCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrVulkanSwapchainFormatListCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrVulkanSwapchainFormatListCreateInfoKHR malloc() {
        return new XrVulkanSwapchainFormatListCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrVulkanSwapchainFormatListCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrVulkanSwapchainFormatListCreateInfoKHR calloc() {
        return new XrVulkanSwapchainFormatListCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrVulkanSwapchainFormatListCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static XrVulkanSwapchainFormatListCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrVulkanSwapchainFormatListCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code XrVulkanSwapchainFormatListCreateInfoKHR} instance for the specified memory address. */
    public static XrVulkanSwapchainFormatListCreateInfoKHR create(long address) {
        return new XrVulkanSwapchainFormatListCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrVulkanSwapchainFormatListCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new XrVulkanSwapchainFormatListCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link XrVulkanSwapchainFormatListCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVulkanSwapchainFormatListCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrVulkanSwapchainFormatListCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVulkanSwapchainFormatListCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVulkanSwapchainFormatListCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVulkanSwapchainFormatListCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrVulkanSwapchainFormatListCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrVulkanSwapchainFormatListCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrVulkanSwapchainFormatListCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrVulkanSwapchainFormatListCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVulkanSwapchainFormatListCreateInfoKHR malloc(MemoryStack stack) {
        return new XrVulkanSwapchainFormatListCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrVulkanSwapchainFormatListCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVulkanSwapchainFormatListCreateInfoKHR calloc(MemoryStack stack) {
        return new XrVulkanSwapchainFormatListCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrVulkanSwapchainFormatListCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVulkanSwapchainFormatListCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVulkanSwapchainFormatListCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVulkanSwapchainFormatListCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrVulkanSwapchainFormatListCreateInfoKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrVulkanSwapchainFormatListCreateInfoKHR.NEXT); }
    /** Unsafe version of {@link #viewFormatCount}. */
    public static int nviewFormatCount(long struct) { return memGetInt(struct + XrVulkanSwapchainFormatListCreateInfoKHR.VIEWFORMATCOUNT); }
    /** Unsafe version of {@link #viewFormats() viewFormats}. */
    public static @Nullable IntBuffer nviewFormats(long struct) { return memIntBufferSafe(memGetAddress(struct + XrVulkanSwapchainFormatListCreateInfoKHR.VIEWFORMATS), nviewFormatCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrVulkanSwapchainFormatListCreateInfoKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrVulkanSwapchainFormatListCreateInfoKHR.NEXT, value); }
    /** Sets the specified value to the {@code viewFormatCount} field of the specified {@code struct}. */
    public static void nviewFormatCount(long struct, int value) { memPutInt(struct + XrVulkanSwapchainFormatListCreateInfoKHR.VIEWFORMATCOUNT, value); }
    /** Unsafe version of {@link #viewFormats(IntBuffer) viewFormats}. */
    public static void nviewFormats(long struct, @Nullable IntBuffer value) { memPutAddress(struct + XrVulkanSwapchainFormatListCreateInfoKHR.VIEWFORMATS, memAddressSafe(value)); nviewFormatCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nviewFormatCount(struct) != 0) {
            check(memGetAddress(struct + XrVulkanSwapchainFormatListCreateInfoKHR.VIEWFORMATS));
        }
    }

    // -----------------------------------

    /** An array of {@link XrVulkanSwapchainFormatListCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<XrVulkanSwapchainFormatListCreateInfoKHR, Buffer> implements NativeResource {

        private static final XrVulkanSwapchainFormatListCreateInfoKHR ELEMENT_FACTORY = XrVulkanSwapchainFormatListCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code XrVulkanSwapchainFormatListCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrVulkanSwapchainFormatListCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrVulkanSwapchainFormatListCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrVulkanSwapchainFormatListCreateInfoKHR.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrVulkanSwapchainFormatListCreateInfoKHR.nnext(address()); }
        /** @return the value of the {@code viewFormatCount} field. */
        @NativeType("uint32_t")
        public int viewFormatCount() { return XrVulkanSwapchainFormatListCreateInfoKHR.nviewFormatCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code viewFormats} field. */
        @NativeType("VkFormat const *")
        public @Nullable IntBuffer viewFormats() { return XrVulkanSwapchainFormatListCreateInfoKHR.nviewFormats(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrVulkanSwapchainFormatListCreateInfoKHR.Buffer type(@NativeType("XrStructureType") int value) { XrVulkanSwapchainFormatListCreateInfoKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHRVulkanSwapchainFormatList#XR_TYPE_VULKAN_SWAPCHAIN_FORMAT_LIST_CREATE_INFO_KHR TYPE_VULKAN_SWAPCHAIN_FORMAT_LIST_CREATE_INFO_KHR} value to the {@code type} field. */
        public XrVulkanSwapchainFormatListCreateInfoKHR.Buffer type$Default() { return type(KHRVulkanSwapchainFormatList.XR_TYPE_VULKAN_SWAPCHAIN_FORMAT_LIST_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@code next} field. */
        public XrVulkanSwapchainFormatListCreateInfoKHR.Buffer next(@NativeType("void const *") long value) { XrVulkanSwapchainFormatListCreateInfoKHR.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code viewFormats} field. */
        public XrVulkanSwapchainFormatListCreateInfoKHR.Buffer viewFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { XrVulkanSwapchainFormatListCreateInfoKHR.nviewFormats(address(), value); return this; }

    }

}
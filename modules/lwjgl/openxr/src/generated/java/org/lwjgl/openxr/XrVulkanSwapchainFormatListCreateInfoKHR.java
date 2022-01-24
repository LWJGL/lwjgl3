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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.*;

/**
 * A list of Vulkan view formats.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link KHRVulkanSwapchainFormatList XR_KHR_vulkan_swapchain_format_list} extension <b>must</b> be enabled prior to using {@link XrVulkanSwapchainFormatListCreateInfoKHR}</li>
 * <li>{@code type} <b>must</b> be {@link KHRVulkanSwapchainFormatList#XR_TYPE_VULKAN_SWAPCHAIN_FORMAT_LIST_CREATE_INFO_KHR TYPE_VULKAN_SWAPCHAIN_FORMAT_LIST_CREATE_INFO_KHR}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>If {@code viewFormatCount} is not 0, {@code viewFormats} <b>must</b> be a pointer to an array of {@code viewFormatCount} valid {@code VkFormat} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrCreateSwapchain CreateSwapchain}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrVulkanSwapchainFormatListCreateInfoKHR {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint32_t {@link #viewFormatCount};
 *     VkFormat const * {@link #viewFormats};
 * }</code></pre>
 */
public class XrVulkanSwapchainFormatListCreateInfoKHR extends Struct implements NativeResource {

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

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the number of view formats passed in {@code viewFormats}. */
    @NativeType("uint32_t")
    public int viewFormatCount() { return nviewFormatCount(address()); }
    /** an array of {@code VkFormat}. */
    @Nullable
    @NativeType("VkFormat const *")
    public IntBuffer viewFormats() { return nviewFormats(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrVulkanSwapchainFormatListCreateInfoKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHRVulkanSwapchainFormatList#XR_TYPE_VULKAN_SWAPCHAIN_FORMAT_LIST_CREATE_INFO_KHR TYPE_VULKAN_SWAPCHAIN_FORMAT_LIST_CREATE_INFO_KHR} value to the {@link #type} field. */
    public XrVulkanSwapchainFormatListCreateInfoKHR type$Default() { return type(KHRVulkanSwapchainFormatList.XR_TYPE_VULKAN_SWAPCHAIN_FORMAT_LIST_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@link #next} field. */
    public XrVulkanSwapchainFormatListCreateInfoKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #viewFormats} field. */
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
        return wrap(XrVulkanSwapchainFormatListCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrVulkanSwapchainFormatListCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrVulkanSwapchainFormatListCreateInfoKHR calloc() {
        return wrap(XrVulkanSwapchainFormatListCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrVulkanSwapchainFormatListCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static XrVulkanSwapchainFormatListCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrVulkanSwapchainFormatListCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrVulkanSwapchainFormatListCreateInfoKHR} instance for the specified memory address. */
    public static XrVulkanSwapchainFormatListCreateInfoKHR create(long address) {
        return wrap(XrVulkanSwapchainFormatListCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVulkanSwapchainFormatListCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(XrVulkanSwapchainFormatListCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link XrVulkanSwapchainFormatListCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVulkanSwapchainFormatListCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrVulkanSwapchainFormatListCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVulkanSwapchainFormatListCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVulkanSwapchainFormatListCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVulkanSwapchainFormatListCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrVulkanSwapchainFormatListCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrVulkanSwapchainFormatListCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVulkanSwapchainFormatListCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrVulkanSwapchainFormatListCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVulkanSwapchainFormatListCreateInfoKHR malloc(MemoryStack stack) {
        return wrap(XrVulkanSwapchainFormatListCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrVulkanSwapchainFormatListCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVulkanSwapchainFormatListCreateInfoKHR calloc(MemoryStack stack) {
        return wrap(XrVulkanSwapchainFormatListCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrVulkanSwapchainFormatListCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVulkanSwapchainFormatListCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVulkanSwapchainFormatListCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVulkanSwapchainFormatListCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrVulkanSwapchainFormatListCreateInfoKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrVulkanSwapchainFormatListCreateInfoKHR.NEXT); }
    /** Unsafe version of {@link #viewFormatCount}. */
    public static int nviewFormatCount(long struct) { return UNSAFE.getInt(null, struct + XrVulkanSwapchainFormatListCreateInfoKHR.VIEWFORMATCOUNT); }
    /** Unsafe version of {@link #viewFormats() viewFormats}. */
    @Nullable public static IntBuffer nviewFormats(long struct) { return memIntBufferSafe(memGetAddress(struct + XrVulkanSwapchainFormatListCreateInfoKHR.VIEWFORMATS), nviewFormatCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrVulkanSwapchainFormatListCreateInfoKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrVulkanSwapchainFormatListCreateInfoKHR.NEXT, value); }
    /** Sets the specified value to the {@code viewFormatCount} field of the specified {@code struct}. */
    public static void nviewFormatCount(long struct, int value) { UNSAFE.putInt(null, struct + XrVulkanSwapchainFormatListCreateInfoKHR.VIEWFORMATCOUNT, value); }
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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrVulkanSwapchainFormatListCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected XrVulkanSwapchainFormatListCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrVulkanSwapchainFormatListCreateInfoKHR#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrVulkanSwapchainFormatListCreateInfoKHR.ntype(address()); }
        /** @return the value of the {@link XrVulkanSwapchainFormatListCreateInfoKHR#next} field. */
        @NativeType("void const *")
        public long next() { return XrVulkanSwapchainFormatListCreateInfoKHR.nnext(address()); }
        /** @return the value of the {@link XrVulkanSwapchainFormatListCreateInfoKHR#viewFormatCount} field. */
        @NativeType("uint32_t")
        public int viewFormatCount() { return XrVulkanSwapchainFormatListCreateInfoKHR.nviewFormatCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link XrVulkanSwapchainFormatListCreateInfoKHR#viewFormats} field. */
        @Nullable
        @NativeType("VkFormat const *")
        public IntBuffer viewFormats() { return XrVulkanSwapchainFormatListCreateInfoKHR.nviewFormats(address()); }

        /** Sets the specified value to the {@link XrVulkanSwapchainFormatListCreateInfoKHR#type} field. */
        public XrVulkanSwapchainFormatListCreateInfoKHR.Buffer type(@NativeType("XrStructureType") int value) { XrVulkanSwapchainFormatListCreateInfoKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHRVulkanSwapchainFormatList#XR_TYPE_VULKAN_SWAPCHAIN_FORMAT_LIST_CREATE_INFO_KHR TYPE_VULKAN_SWAPCHAIN_FORMAT_LIST_CREATE_INFO_KHR} value to the {@link XrVulkanSwapchainFormatListCreateInfoKHR#type} field. */
        public XrVulkanSwapchainFormatListCreateInfoKHR.Buffer type$Default() { return type(KHRVulkanSwapchainFormatList.XR_TYPE_VULKAN_SWAPCHAIN_FORMAT_LIST_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@link XrVulkanSwapchainFormatListCreateInfoKHR#next} field. */
        public XrVulkanSwapchainFormatListCreateInfoKHR.Buffer next(@NativeType("void const *") long value) { XrVulkanSwapchainFormatListCreateInfoKHR.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link XrVulkanSwapchainFormatListCreateInfoKHR#viewFormats} field. */
        public XrVulkanSwapchainFormatListCreateInfoKHR.Buffer viewFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { XrVulkanSwapchainFormatListCreateInfoKHR.nviewFormats(address(), value); return this; }

    }

}
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
 * Specify that an image will be bound to swapchain memory.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code swapchain} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the fields of {@link VkImageCreateInfo} <b>must</b> match the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#swapchain-wsi-image-create-info">implied image creation parameters</a> of the swapchain</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSwapchain#VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR}</li>
 * <li>If {@code swapchain} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageSwapchainCreateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSwapchainKHR {@link #swapchain};
 * }</code></pre>
 */
public class VkImageSwapchainCreateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SWAPCHAIN;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAIN = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkImageSwapchainCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageSwapchainCreateInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a handle of a swapchain that the image will be bound to. */
    @NativeType("VkSwapchainKHR")
    public long swapchain() { return nswapchain(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageSwapchainCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageSwapchainCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #swapchain} field. */
    public VkImageSwapchainCreateInfoKHR swapchain(@NativeType("VkSwapchainKHR") long value) { nswapchain(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageSwapchainCreateInfoKHR set(
        int sType,
        long pNext,
        long swapchain
    ) {
        sType(sType);
        pNext(pNext);
        swapchain(swapchain);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageSwapchainCreateInfoKHR set(VkImageSwapchainCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageSwapchainCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageSwapchainCreateInfoKHR malloc() {
        return wrap(VkImageSwapchainCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageSwapchainCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageSwapchainCreateInfoKHR calloc() {
        return wrap(VkImageSwapchainCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageSwapchainCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkImageSwapchainCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageSwapchainCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageSwapchainCreateInfoKHR} instance for the specified memory address. */
    public static VkImageSwapchainCreateInfoKHR create(long address) {
        return wrap(VkImageSwapchainCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageSwapchainCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkImageSwapchainCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkImageSwapchainCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSwapchainCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageSwapchainCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSwapchainCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSwapchainCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSwapchainCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageSwapchainCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageSwapchainCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageSwapchainCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkImageSwapchainCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImageSwapchainCreateInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkImageSwapchainCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImageSwapchainCreateInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkImageSwapchainCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageSwapchainCreateInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkImageSwapchainCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageSwapchainCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageSwapchainCreateInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkImageSwapchainCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageSwapchainCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSwapchainCreateInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageSwapchainCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSwapchainCreateInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageSwapchainCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageSwapchainCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSwapchainCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageSwapchainCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageSwapchainCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageSwapchainCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #swapchain}. */
    public static long nswapchain(long struct) { return UNSAFE.getLong(null, struct + VkImageSwapchainCreateInfoKHR.SWAPCHAIN); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageSwapchainCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageSwapchainCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #swapchain(long) swapchain}. */
    public static void nswapchain(long struct, long value) { UNSAFE.putLong(null, struct + VkImageSwapchainCreateInfoKHR.SWAPCHAIN, value); }

    // -----------------------------------

    /** An array of {@link VkImageSwapchainCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkImageSwapchainCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkImageSwapchainCreateInfoKHR ELEMENT_FACTORY = VkImageSwapchainCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkImageSwapchainCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageSwapchainCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkImageSwapchainCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageSwapchainCreateInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageSwapchainCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkImageSwapchainCreateInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageSwapchainCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkImageSwapchainCreateInfoKHR#swapchain} field. */
        @NativeType("VkSwapchainKHR")
        public long swapchain() { return VkImageSwapchainCreateInfoKHR.nswapchain(address()); }

        /** Sets the specified value to the {@link VkImageSwapchainCreateInfoKHR#sType} field. */
        public VkImageSwapchainCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkImageSwapchainCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageSwapchainCreateInfoKHR#pNext} field. */
        public VkImageSwapchainCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkImageSwapchainCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageSwapchainCreateInfoKHR#swapchain} field. */
        public VkImageSwapchainCreateInfoKHR.Buffer swapchain(@NativeType("VkSwapchainKHR") long value) { VkImageSwapchainCreateInfoKHR.nswapchain(address(), value); return this; }

    }

}
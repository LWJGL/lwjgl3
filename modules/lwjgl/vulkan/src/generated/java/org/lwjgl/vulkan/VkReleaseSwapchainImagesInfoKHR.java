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

/**
 * <pre>{@code
 * struct VkReleaseSwapchainImagesInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSwapchainKHR swapchain;
 *     uint32_t imageIndexCount;
 *     uint32_t const * pImageIndices;
 * }}</pre>
 */
public class VkReleaseSwapchainImagesInfoKHR extends Struct<VkReleaseSwapchainImagesInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SWAPCHAIN,
        IMAGEINDEXCOUNT,
        PIMAGEINDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAIN = layout.offsetof(2);
        IMAGEINDEXCOUNT = layout.offsetof(3);
        PIMAGEINDICES = layout.offsetof(4);
    }

    protected VkReleaseSwapchainImagesInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkReleaseSwapchainImagesInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkReleaseSwapchainImagesInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkReleaseSwapchainImagesInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkReleaseSwapchainImagesInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code swapchain} field. */
    @NativeType("VkSwapchainKHR")
    public long swapchain() { return nswapchain(address()); }
    /** @return the value of the {@code imageIndexCount} field. */
    @NativeType("uint32_t")
    public int imageIndexCount() { return nimageIndexCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pImageIndices} field. */
    @NativeType("uint32_t const *")
    public IntBuffer pImageIndices() { return npImageIndices(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkReleaseSwapchainImagesInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRSwapchainMaintenance1#VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_KHR STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_KHR} value to the {@code sType} field. */
    public VkReleaseSwapchainImagesInfoKHR sType$Default() { return sType(KHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkReleaseSwapchainImagesInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code swapchain} field. */
    public VkReleaseSwapchainImagesInfoKHR swapchain(@NativeType("VkSwapchainKHR") long value) { nswapchain(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pImageIndices} field. */
    public VkReleaseSwapchainImagesInfoKHR pImageIndices(@NativeType("uint32_t const *") IntBuffer value) { npImageIndices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkReleaseSwapchainImagesInfoKHR set(
        int sType,
        long pNext,
        long swapchain,
        IntBuffer pImageIndices
    ) {
        sType(sType);
        pNext(pNext);
        swapchain(swapchain);
        pImageIndices(pImageIndices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkReleaseSwapchainImagesInfoKHR set(VkReleaseSwapchainImagesInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkReleaseSwapchainImagesInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkReleaseSwapchainImagesInfoKHR malloc() {
        return new VkReleaseSwapchainImagesInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkReleaseSwapchainImagesInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkReleaseSwapchainImagesInfoKHR calloc() {
        return new VkReleaseSwapchainImagesInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkReleaseSwapchainImagesInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkReleaseSwapchainImagesInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkReleaseSwapchainImagesInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkReleaseSwapchainImagesInfoKHR} instance for the specified memory address. */
    public static VkReleaseSwapchainImagesInfoKHR create(long address) {
        return new VkReleaseSwapchainImagesInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkReleaseSwapchainImagesInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkReleaseSwapchainImagesInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkReleaseSwapchainImagesInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkReleaseSwapchainImagesInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkReleaseSwapchainImagesInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkReleaseSwapchainImagesInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkReleaseSwapchainImagesInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkReleaseSwapchainImagesInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkReleaseSwapchainImagesInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkReleaseSwapchainImagesInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkReleaseSwapchainImagesInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkReleaseSwapchainImagesInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkReleaseSwapchainImagesInfoKHR malloc(MemoryStack stack) {
        return new VkReleaseSwapchainImagesInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkReleaseSwapchainImagesInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkReleaseSwapchainImagesInfoKHR calloc(MemoryStack stack) {
        return new VkReleaseSwapchainImagesInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkReleaseSwapchainImagesInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkReleaseSwapchainImagesInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkReleaseSwapchainImagesInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkReleaseSwapchainImagesInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkReleaseSwapchainImagesInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkReleaseSwapchainImagesInfoKHR.PNEXT); }
    /** Unsafe version of {@link #swapchain}. */
    public static long nswapchain(long struct) { return memGetLong(struct + VkReleaseSwapchainImagesInfoKHR.SWAPCHAIN); }
    /** Unsafe version of {@link #imageIndexCount}. */
    public static int nimageIndexCount(long struct) { return memGetInt(struct + VkReleaseSwapchainImagesInfoKHR.IMAGEINDEXCOUNT); }
    /** Unsafe version of {@link #pImageIndices() pImageIndices}. */
    public static IntBuffer npImageIndices(long struct) { return memIntBuffer(memGetAddress(struct + VkReleaseSwapchainImagesInfoKHR.PIMAGEINDICES), nimageIndexCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkReleaseSwapchainImagesInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkReleaseSwapchainImagesInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #swapchain(long) swapchain}. */
    public static void nswapchain(long struct, long value) { memPutLong(struct + VkReleaseSwapchainImagesInfoKHR.SWAPCHAIN, value); }
    /** Sets the specified value to the {@code imageIndexCount} field of the specified {@code struct}. */
    public static void nimageIndexCount(long struct, int value) { memPutInt(struct + VkReleaseSwapchainImagesInfoKHR.IMAGEINDEXCOUNT, value); }
    /** Unsafe version of {@link #pImageIndices(IntBuffer) pImageIndices}. */
    public static void npImageIndices(long struct, IntBuffer value) { memPutAddress(struct + VkReleaseSwapchainImagesInfoKHR.PIMAGEINDICES, memAddress(value)); nimageIndexCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkReleaseSwapchainImagesInfoKHR.PIMAGEINDICES));
    }

    // -----------------------------------

    /** An array of {@link VkReleaseSwapchainImagesInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkReleaseSwapchainImagesInfoKHR, Buffer> implements NativeResource {

        private static final VkReleaseSwapchainImagesInfoKHR ELEMENT_FACTORY = VkReleaseSwapchainImagesInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkReleaseSwapchainImagesInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkReleaseSwapchainImagesInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkReleaseSwapchainImagesInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkReleaseSwapchainImagesInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkReleaseSwapchainImagesInfoKHR.npNext(address()); }
        /** @return the value of the {@code swapchain} field. */
        @NativeType("VkSwapchainKHR")
        public long swapchain() { return VkReleaseSwapchainImagesInfoKHR.nswapchain(address()); }
        /** @return the value of the {@code imageIndexCount} field. */
        @NativeType("uint32_t")
        public int imageIndexCount() { return VkReleaseSwapchainImagesInfoKHR.nimageIndexCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pImageIndices} field. */
        @NativeType("uint32_t const *")
        public IntBuffer pImageIndices() { return VkReleaseSwapchainImagesInfoKHR.npImageIndices(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkReleaseSwapchainImagesInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkReleaseSwapchainImagesInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRSwapchainMaintenance1#VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_KHR STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_KHR} value to the {@code sType} field. */
        public VkReleaseSwapchainImagesInfoKHR.Buffer sType$Default() { return sType(KHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkReleaseSwapchainImagesInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkReleaseSwapchainImagesInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code swapchain} field. */
        public VkReleaseSwapchainImagesInfoKHR.Buffer swapchain(@NativeType("VkSwapchainKHR") long value) { VkReleaseSwapchainImagesInfoKHR.nswapchain(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pImageIndices} field. */
        public VkReleaseSwapchainImagesInfoKHR.Buffer pImageIndices(@NativeType("uint32_t const *") IntBuffer value) { VkReleaseSwapchainImagesInfoKHR.npImageIndices(address(), value); return this; }

    }

}
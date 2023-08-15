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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing a list of swapchain image indices to be released.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>Each element of {@code pImageIndices} <b>must</b> be the index of a presentable image acquired from the swapchain specified by {@code swapchain}</li>
 * <li>All uses of presentable images identified by elements of {@code pImageIndices} <b>must</b> have completed execution</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSwapchainMaintenance1#VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_EXT STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
 * <li>{@code pImageIndices} <b>must</b> be a valid pointer to an array of {@code imageIndexCount} {@code uint32_t} values</li>
 * <li>{@code imageIndexCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>Host Synchronization</h5>
 * 
 * <ul>
 * <li>Host access to {@code swapchain} <b>must</b> be externally synchronized</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTSwapchainMaintenance1#vkReleaseSwapchainImagesEXT ReleaseSwapchainImagesEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkReleaseSwapchainImagesInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSwapchainKHR {@link #swapchain};
 *     uint32_t {@link #imageIndexCount};
 *     uint32_t const * {@link #pImageIndices};
 * }</code></pre>
 */
public class VkReleaseSwapchainImagesInfoEXT extends Struct<VkReleaseSwapchainImagesInfoEXT> implements NativeResource {

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

    protected VkReleaseSwapchainImagesInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkReleaseSwapchainImagesInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkReleaseSwapchainImagesInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkReleaseSwapchainImagesInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkReleaseSwapchainImagesInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a swapchain to which images are being released. */
    @NativeType("VkSwapchainKHR")
    public long swapchain() { return nswapchain(address()); }
    /** the number of image indices to be released. */
    @NativeType("uint32_t")
    public int imageIndexCount() { return nimageIndexCount(address()); }
    /** a pointer to an array of indices into the array of {@code swapchain}’s presentable images, with {@code imageIndexCount} entries. */
    @NativeType("uint32_t const *")
    public IntBuffer pImageIndices() { return npImageIndices(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkReleaseSwapchainImagesInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTSwapchainMaintenance1#VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_EXT STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_EXT} value to the {@link #sType} field. */
    public VkReleaseSwapchainImagesInfoEXT sType$Default() { return sType(EXTSwapchainMaintenance1.VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkReleaseSwapchainImagesInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #swapchain} field. */
    public VkReleaseSwapchainImagesInfoEXT swapchain(@NativeType("VkSwapchainKHR") long value) { nswapchain(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pImageIndices} field. */
    public VkReleaseSwapchainImagesInfoEXT pImageIndices(@NativeType("uint32_t const *") IntBuffer value) { npImageIndices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkReleaseSwapchainImagesInfoEXT set(
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
    public VkReleaseSwapchainImagesInfoEXT set(VkReleaseSwapchainImagesInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkReleaseSwapchainImagesInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkReleaseSwapchainImagesInfoEXT malloc() {
        return new VkReleaseSwapchainImagesInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkReleaseSwapchainImagesInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkReleaseSwapchainImagesInfoEXT calloc() {
        return new VkReleaseSwapchainImagesInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkReleaseSwapchainImagesInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkReleaseSwapchainImagesInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkReleaseSwapchainImagesInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkReleaseSwapchainImagesInfoEXT} instance for the specified memory address. */
    public static VkReleaseSwapchainImagesInfoEXT create(long address) {
        return new VkReleaseSwapchainImagesInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkReleaseSwapchainImagesInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkReleaseSwapchainImagesInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkReleaseSwapchainImagesInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkReleaseSwapchainImagesInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkReleaseSwapchainImagesInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkReleaseSwapchainImagesInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkReleaseSwapchainImagesInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkReleaseSwapchainImagesInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkReleaseSwapchainImagesInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkReleaseSwapchainImagesInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkReleaseSwapchainImagesInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkReleaseSwapchainImagesInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkReleaseSwapchainImagesInfoEXT malloc(MemoryStack stack) {
        return new VkReleaseSwapchainImagesInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkReleaseSwapchainImagesInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkReleaseSwapchainImagesInfoEXT calloc(MemoryStack stack) {
        return new VkReleaseSwapchainImagesInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkReleaseSwapchainImagesInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkReleaseSwapchainImagesInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkReleaseSwapchainImagesInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkReleaseSwapchainImagesInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkReleaseSwapchainImagesInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkReleaseSwapchainImagesInfoEXT.PNEXT); }
    /** Unsafe version of {@link #swapchain}. */
    public static long nswapchain(long struct) { return UNSAFE.getLong(null, struct + VkReleaseSwapchainImagesInfoEXT.SWAPCHAIN); }
    /** Unsafe version of {@link #imageIndexCount}. */
    public static int nimageIndexCount(long struct) { return UNSAFE.getInt(null, struct + VkReleaseSwapchainImagesInfoEXT.IMAGEINDEXCOUNT); }
    /** Unsafe version of {@link #pImageIndices() pImageIndices}. */
    public static IntBuffer npImageIndices(long struct) { return memIntBuffer(memGetAddress(struct + VkReleaseSwapchainImagesInfoEXT.PIMAGEINDICES), nimageIndexCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkReleaseSwapchainImagesInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkReleaseSwapchainImagesInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #swapchain(long) swapchain}. */
    public static void nswapchain(long struct, long value) { UNSAFE.putLong(null, struct + VkReleaseSwapchainImagesInfoEXT.SWAPCHAIN, value); }
    /** Sets the specified value to the {@code imageIndexCount} field of the specified {@code struct}. */
    public static void nimageIndexCount(long struct, int value) { UNSAFE.putInt(null, struct + VkReleaseSwapchainImagesInfoEXT.IMAGEINDEXCOUNT, value); }
    /** Unsafe version of {@link #pImageIndices(IntBuffer) pImageIndices}. */
    public static void npImageIndices(long struct, IntBuffer value) { memPutAddress(struct + VkReleaseSwapchainImagesInfoEXT.PIMAGEINDICES, memAddress(value)); nimageIndexCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkReleaseSwapchainImagesInfoEXT.PIMAGEINDICES));
    }

    // -----------------------------------

    /** An array of {@link VkReleaseSwapchainImagesInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkReleaseSwapchainImagesInfoEXT, Buffer> implements NativeResource {

        private static final VkReleaseSwapchainImagesInfoEXT ELEMENT_FACTORY = VkReleaseSwapchainImagesInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkReleaseSwapchainImagesInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkReleaseSwapchainImagesInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkReleaseSwapchainImagesInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkReleaseSwapchainImagesInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkReleaseSwapchainImagesInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkReleaseSwapchainImagesInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkReleaseSwapchainImagesInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkReleaseSwapchainImagesInfoEXT#swapchain} field. */
        @NativeType("VkSwapchainKHR")
        public long swapchain() { return VkReleaseSwapchainImagesInfoEXT.nswapchain(address()); }
        /** @return the value of the {@link VkReleaseSwapchainImagesInfoEXT#imageIndexCount} field. */
        @NativeType("uint32_t")
        public int imageIndexCount() { return VkReleaseSwapchainImagesInfoEXT.nimageIndexCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkReleaseSwapchainImagesInfoEXT#pImageIndices} field. */
        @NativeType("uint32_t const *")
        public IntBuffer pImageIndices() { return VkReleaseSwapchainImagesInfoEXT.npImageIndices(address()); }

        /** Sets the specified value to the {@link VkReleaseSwapchainImagesInfoEXT#sType} field. */
        public VkReleaseSwapchainImagesInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkReleaseSwapchainImagesInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTSwapchainMaintenance1#VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_EXT STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_EXT} value to the {@link VkReleaseSwapchainImagesInfoEXT#sType} field. */
        public VkReleaseSwapchainImagesInfoEXT.Buffer sType$Default() { return sType(EXTSwapchainMaintenance1.VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_EXT); }
        /** Sets the specified value to the {@link VkReleaseSwapchainImagesInfoEXT#pNext} field. */
        public VkReleaseSwapchainImagesInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkReleaseSwapchainImagesInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkReleaseSwapchainImagesInfoEXT#swapchain} field. */
        public VkReleaseSwapchainImagesInfoEXT.Buffer swapchain(@NativeType("VkSwapchainKHR") long value) { VkReleaseSwapchainImagesInfoEXT.nswapchain(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkReleaseSwapchainImagesInfoEXT#pImageIndices} field. */
        public VkReleaseSwapchainImagesInfoEXT.Buffer pImageIndices(@NativeType("uint32_t const *") IntBuffer value) { VkReleaseSwapchainImagesInfoEXT.npImageIndices(address(), value); return this; }

    }

}
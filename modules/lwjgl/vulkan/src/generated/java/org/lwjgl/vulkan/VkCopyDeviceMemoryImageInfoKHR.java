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
 * <pre><code>
 * struct VkCopyDeviceMemoryImageInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImage image;
 *     uint32_t regionCount;
 *     {@link VkDeviceMemoryImageCopyKHR VkDeviceMemoryImageCopyKHR} const * pRegions;
 * }</code></pre>
 */
public class VkCopyDeviceMemoryImageInfoKHR extends Struct<VkCopyDeviceMemoryImageInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGE,
        REGIONCOUNT,
        PREGIONS;

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
        IMAGE = layout.offsetof(2);
        REGIONCOUNT = layout.offsetof(3);
        PREGIONS = layout.offsetof(4);
    }

    protected VkCopyDeviceMemoryImageInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyDeviceMemoryImageInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkCopyDeviceMemoryImageInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkCopyDeviceMemoryImageInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyDeviceMemoryImageInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code image} field. */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }
    /** @return the value of the {@code regionCount} field. */
    @NativeType("uint32_t")
    public int regionCount() { return nregionCount(address()); }
    /** @return a {@link VkDeviceMemoryImageCopyKHR.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
    @NativeType("VkDeviceMemoryImageCopyKHR const *")
    public VkDeviceMemoryImageCopyKHR.Buffer pRegions() { return npRegions(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCopyDeviceMemoryImageInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDeviceAddressCommands#VK_STRUCTURE_TYPE_COPY_DEVICE_MEMORY_IMAGE_INFO_KHR STRUCTURE_TYPE_COPY_DEVICE_MEMORY_IMAGE_INFO_KHR} value to the {@code sType} field. */
    public VkCopyDeviceMemoryImageInfoKHR sType$Default() { return sType(KHRDeviceAddressCommands.VK_STRUCTURE_TYPE_COPY_DEVICE_MEMORY_IMAGE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCopyDeviceMemoryImageInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code image} field. */
    public VkCopyDeviceMemoryImageInfoKHR image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Sets the address of the specified {@link VkDeviceMemoryImageCopyKHR.Buffer} to the {@code pRegions} field. */
    public VkCopyDeviceMemoryImageInfoKHR pRegions(@NativeType("VkDeviceMemoryImageCopyKHR const *") VkDeviceMemoryImageCopyKHR.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyDeviceMemoryImageInfoKHR set(
        int sType,
        long pNext,
        long image,
        VkDeviceMemoryImageCopyKHR.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        image(image);
        pRegions(pRegions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCopyDeviceMemoryImageInfoKHR set(VkCopyDeviceMemoryImageInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyDeviceMemoryImageInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyDeviceMemoryImageInfoKHR malloc() {
        return new VkCopyDeviceMemoryImageInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyDeviceMemoryImageInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyDeviceMemoryImageInfoKHR calloc() {
        return new VkCopyDeviceMemoryImageInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyDeviceMemoryImageInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkCopyDeviceMemoryImageInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyDeviceMemoryImageInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyDeviceMemoryImageInfoKHR} instance for the specified memory address. */
    public static VkCopyDeviceMemoryImageInfoKHR create(long address) {
        return new VkCopyDeviceMemoryImageInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyDeviceMemoryImageInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkCopyDeviceMemoryImageInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkCopyDeviceMemoryImageInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyDeviceMemoryImageInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyDeviceMemoryImageInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyDeviceMemoryImageInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyDeviceMemoryImageInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyDeviceMemoryImageInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyDeviceMemoryImageInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyDeviceMemoryImageInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyDeviceMemoryImageInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyDeviceMemoryImageInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyDeviceMemoryImageInfoKHR malloc(MemoryStack stack) {
        return new VkCopyDeviceMemoryImageInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyDeviceMemoryImageInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyDeviceMemoryImageInfoKHR calloc(MemoryStack stack) {
        return new VkCopyDeviceMemoryImageInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyDeviceMemoryImageInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyDeviceMemoryImageInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyDeviceMemoryImageInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyDeviceMemoryImageInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCopyDeviceMemoryImageInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyDeviceMemoryImageInfoKHR.PNEXT); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return memGetLong(struct + VkCopyDeviceMemoryImageInfoKHR.IMAGE); }
    /** Unsafe version of {@link #regionCount}. */
    public static int nregionCount(long struct) { return memGetInt(struct + VkCopyDeviceMemoryImageInfoKHR.REGIONCOUNT); }
    /** Unsafe version of {@link #pRegions}. */
    public static VkDeviceMemoryImageCopyKHR.Buffer npRegions(long struct) { return VkDeviceMemoryImageCopyKHR.create(memGetAddress(struct + VkCopyDeviceMemoryImageInfoKHR.PREGIONS), nregionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCopyDeviceMemoryImageInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyDeviceMemoryImageInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { memPutLong(struct + VkCopyDeviceMemoryImageInfoKHR.IMAGE, value); }
    /** Sets the specified value to the {@code regionCount} field of the specified {@code struct}. */
    public static void nregionCount(long struct, int value) { memPutInt(struct + VkCopyDeviceMemoryImageInfoKHR.REGIONCOUNT, value); }
    /** Unsafe version of {@link #pRegions(VkDeviceMemoryImageCopyKHR.Buffer) pRegions}. */
    public static void npRegions(long struct, VkDeviceMemoryImageCopyKHR.Buffer value) { memPutAddress(struct + VkCopyDeviceMemoryImageInfoKHR.PREGIONS, value.address()); nregionCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkCopyDeviceMemoryImageInfoKHR.PREGIONS));
    }

    // -----------------------------------

    /** An array of {@link VkCopyDeviceMemoryImageInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkCopyDeviceMemoryImageInfoKHR, Buffer> implements NativeResource {

        private static final VkCopyDeviceMemoryImageInfoKHR ELEMENT_FACTORY = VkCopyDeviceMemoryImageInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkCopyDeviceMemoryImageInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyDeviceMemoryImageInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyDeviceMemoryImageInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyDeviceMemoryImageInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyDeviceMemoryImageInfoKHR.npNext(address()); }
        /** @return the value of the {@code image} field. */
        @NativeType("VkImage")
        public long image() { return VkCopyDeviceMemoryImageInfoKHR.nimage(address()); }
        /** @return the value of the {@code regionCount} field. */
        @NativeType("uint32_t")
        public int regionCount() { return VkCopyDeviceMemoryImageInfoKHR.nregionCount(address()); }
        /** @return a {@link VkDeviceMemoryImageCopyKHR.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
        @NativeType("VkDeviceMemoryImageCopyKHR const *")
        public VkDeviceMemoryImageCopyKHR.Buffer pRegions() { return VkCopyDeviceMemoryImageInfoKHR.npRegions(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCopyDeviceMemoryImageInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyDeviceMemoryImageInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRDeviceAddressCommands#VK_STRUCTURE_TYPE_COPY_DEVICE_MEMORY_IMAGE_INFO_KHR STRUCTURE_TYPE_COPY_DEVICE_MEMORY_IMAGE_INFO_KHR} value to the {@code sType} field. */
        public VkCopyDeviceMemoryImageInfoKHR.Buffer sType$Default() { return sType(KHRDeviceAddressCommands.VK_STRUCTURE_TYPE_COPY_DEVICE_MEMORY_IMAGE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCopyDeviceMemoryImageInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkCopyDeviceMemoryImageInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code image} field. */
        public VkCopyDeviceMemoryImageInfoKHR.Buffer image(@NativeType("VkImage") long value) { VkCopyDeviceMemoryImageInfoKHR.nimage(address(), value); return this; }
        /** Sets the address of the specified {@link VkDeviceMemoryImageCopyKHR.Buffer} to the {@code pRegions} field. */
        public VkCopyDeviceMemoryImageInfoKHR.Buffer pRegions(@NativeType("VkDeviceMemoryImageCopyKHR const *") VkDeviceMemoryImageCopyKHR.Buffer value) { VkCopyDeviceMemoryImageInfoKHR.npRegions(address(), value); return this; }

    }

}
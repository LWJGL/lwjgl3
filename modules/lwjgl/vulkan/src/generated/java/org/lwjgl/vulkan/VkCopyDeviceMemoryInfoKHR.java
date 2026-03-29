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
 * struct VkCopyDeviceMemoryInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t regionCount;
 *     {@link VkDeviceMemoryCopyKHR VkDeviceMemoryCopyKHR} const * pRegions;
 * }</code></pre>
 */
public class VkCopyDeviceMemoryInfoKHR extends Struct<VkCopyDeviceMemoryInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        REGIONCOUNT,
        PREGIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        REGIONCOUNT = layout.offsetof(2);
        PREGIONS = layout.offsetof(3);
    }

    protected VkCopyDeviceMemoryInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyDeviceMemoryInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkCopyDeviceMemoryInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkCopyDeviceMemoryInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyDeviceMemoryInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code regionCount} field. */
    @NativeType("uint32_t")
    public int regionCount() { return nregionCount(address()); }
    /** @return a {@link VkDeviceMemoryCopyKHR.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
    @NativeType("VkDeviceMemoryCopyKHR const *")
    public VkDeviceMemoryCopyKHR.Buffer pRegions() { return npRegions(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCopyDeviceMemoryInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDeviceAddressCommands#VK_STRUCTURE_TYPE_COPY_DEVICE_MEMORY_INFO_KHR STRUCTURE_TYPE_COPY_DEVICE_MEMORY_INFO_KHR} value to the {@code sType} field. */
    public VkCopyDeviceMemoryInfoKHR sType$Default() { return sType(KHRDeviceAddressCommands.VK_STRUCTURE_TYPE_COPY_DEVICE_MEMORY_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCopyDeviceMemoryInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkDeviceMemoryCopyKHR.Buffer} to the {@code pRegions} field. */
    public VkCopyDeviceMemoryInfoKHR pRegions(@NativeType("VkDeviceMemoryCopyKHR const *") VkDeviceMemoryCopyKHR.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyDeviceMemoryInfoKHR set(
        int sType,
        long pNext,
        VkDeviceMemoryCopyKHR.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
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
    public VkCopyDeviceMemoryInfoKHR set(VkCopyDeviceMemoryInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyDeviceMemoryInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyDeviceMemoryInfoKHR malloc() {
        return new VkCopyDeviceMemoryInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyDeviceMemoryInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyDeviceMemoryInfoKHR calloc() {
        return new VkCopyDeviceMemoryInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyDeviceMemoryInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkCopyDeviceMemoryInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyDeviceMemoryInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyDeviceMemoryInfoKHR} instance for the specified memory address. */
    public static VkCopyDeviceMemoryInfoKHR create(long address) {
        return new VkCopyDeviceMemoryInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyDeviceMemoryInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkCopyDeviceMemoryInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkCopyDeviceMemoryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyDeviceMemoryInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyDeviceMemoryInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyDeviceMemoryInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyDeviceMemoryInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyDeviceMemoryInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyDeviceMemoryInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyDeviceMemoryInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyDeviceMemoryInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyDeviceMemoryInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyDeviceMemoryInfoKHR malloc(MemoryStack stack) {
        return new VkCopyDeviceMemoryInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyDeviceMemoryInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyDeviceMemoryInfoKHR calloc(MemoryStack stack) {
        return new VkCopyDeviceMemoryInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyDeviceMemoryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyDeviceMemoryInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyDeviceMemoryInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyDeviceMemoryInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCopyDeviceMemoryInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyDeviceMemoryInfoKHR.PNEXT); }
    /** Unsafe version of {@link #regionCount}. */
    public static int nregionCount(long struct) { return memGetInt(struct + VkCopyDeviceMemoryInfoKHR.REGIONCOUNT); }
    /** Unsafe version of {@link #pRegions}. */
    public static VkDeviceMemoryCopyKHR.Buffer npRegions(long struct) { return VkDeviceMemoryCopyKHR.create(memGetAddress(struct + VkCopyDeviceMemoryInfoKHR.PREGIONS), nregionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCopyDeviceMemoryInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyDeviceMemoryInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code regionCount} field of the specified {@code struct}. */
    public static void nregionCount(long struct, int value) { memPutInt(struct + VkCopyDeviceMemoryInfoKHR.REGIONCOUNT, value); }
    /** Unsafe version of {@link #pRegions(VkDeviceMemoryCopyKHR.Buffer) pRegions}. */
    public static void npRegions(long struct, VkDeviceMemoryCopyKHR.Buffer value) { memPutAddress(struct + VkCopyDeviceMemoryInfoKHR.PREGIONS, value.address()); nregionCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkCopyDeviceMemoryInfoKHR.PREGIONS));
    }

    // -----------------------------------

    /** An array of {@link VkCopyDeviceMemoryInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkCopyDeviceMemoryInfoKHR, Buffer> implements NativeResource {

        private static final VkCopyDeviceMemoryInfoKHR ELEMENT_FACTORY = VkCopyDeviceMemoryInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkCopyDeviceMemoryInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyDeviceMemoryInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyDeviceMemoryInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyDeviceMemoryInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyDeviceMemoryInfoKHR.npNext(address()); }
        /** @return the value of the {@code regionCount} field. */
        @NativeType("uint32_t")
        public int regionCount() { return VkCopyDeviceMemoryInfoKHR.nregionCount(address()); }
        /** @return a {@link VkDeviceMemoryCopyKHR.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
        @NativeType("VkDeviceMemoryCopyKHR const *")
        public VkDeviceMemoryCopyKHR.Buffer pRegions() { return VkCopyDeviceMemoryInfoKHR.npRegions(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCopyDeviceMemoryInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyDeviceMemoryInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRDeviceAddressCommands#VK_STRUCTURE_TYPE_COPY_DEVICE_MEMORY_INFO_KHR STRUCTURE_TYPE_COPY_DEVICE_MEMORY_INFO_KHR} value to the {@code sType} field. */
        public VkCopyDeviceMemoryInfoKHR.Buffer sType$Default() { return sType(KHRDeviceAddressCommands.VK_STRUCTURE_TYPE_COPY_DEVICE_MEMORY_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCopyDeviceMemoryInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkCopyDeviceMemoryInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkDeviceMemoryCopyKHR.Buffer} to the {@code pRegions} field. */
        public VkCopyDeviceMemoryInfoKHR.Buffer pRegions(@NativeType("VkDeviceMemoryCopyKHR const *") VkDeviceMemoryCopyKHR.Buffer value) { VkCopyDeviceMemoryInfoKHR.npRegions(address(), value); return this; }

    }

}
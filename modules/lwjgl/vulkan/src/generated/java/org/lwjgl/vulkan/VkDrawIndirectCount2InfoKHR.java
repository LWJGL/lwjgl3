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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct VkDrawIndirectCount2InfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkStridedDeviceAddressRangeKHR VkStridedDeviceAddressRangeKHR} addressRange;
 *     VkAddressCommandFlagsKHR addressFlags;
 *     {@link VkDeviceAddressRangeKHR VkDeviceAddressRangeKHR} countAddressRange;
 *     VkAddressCommandFlagsKHR countAddressFlags;
 *     uint32_t maxDrawCount;
 * }</code></pre>
 */
public class VkDrawIndirectCount2InfoKHR extends Struct<VkDrawIndirectCount2InfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ADDRESSRANGE,
        ADDRESSFLAGS,
        COUNTADDRESSRANGE,
        COUNTADDRESSFLAGS,
        MAXDRAWCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkStridedDeviceAddressRangeKHR.SIZEOF, VkStridedDeviceAddressRangeKHR.ALIGNOF),
            __member(4),
            __member(VkDeviceAddressRangeKHR.SIZEOF, VkDeviceAddressRangeKHR.ALIGNOF),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ADDRESSRANGE = layout.offsetof(2);
        ADDRESSFLAGS = layout.offsetof(3);
        COUNTADDRESSRANGE = layout.offsetof(4);
        COUNTADDRESSFLAGS = layout.offsetof(5);
        MAXDRAWCOUNT = layout.offsetof(6);
    }

    protected VkDrawIndirectCount2InfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDrawIndirectCount2InfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDrawIndirectCount2InfoKHR(address, container);
    }

    /**
     * Creates a {@code VkDrawIndirectCount2InfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDrawIndirectCount2InfoKHR(ByteBuffer container) {
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
    /** @return a {@link VkStridedDeviceAddressRangeKHR} view of the {@code addressRange} field. */
    public VkStridedDeviceAddressRangeKHR addressRange() { return naddressRange(address()); }
    /** @return the value of the {@code addressFlags} field. */
    @NativeType("VkAddressCommandFlagsKHR")
    public int addressFlags() { return naddressFlags(address()); }
    /** @return a {@link VkDeviceAddressRangeKHR} view of the {@code countAddressRange} field. */
    public VkDeviceAddressRangeKHR countAddressRange() { return ncountAddressRange(address()); }
    /** @return the value of the {@code countAddressFlags} field. */
    @NativeType("VkAddressCommandFlagsKHR")
    public int countAddressFlags() { return ncountAddressFlags(address()); }
    /** @return the value of the {@code maxDrawCount} field. */
    @NativeType("uint32_t")
    public int maxDrawCount() { return nmaxDrawCount(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDrawIndirectCount2InfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDeviceAddressCommands#VK_STRUCTURE_TYPE_DRAW_INDIRECT_COUNT_2_INFO_KHR STRUCTURE_TYPE_DRAW_INDIRECT_COUNT_2_INFO_KHR} value to the {@code sType} field. */
    public VkDrawIndirectCount2InfoKHR sType$Default() { return sType(KHRDeviceAddressCommands.VK_STRUCTURE_TYPE_DRAW_INDIRECT_COUNT_2_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDrawIndirectCount2InfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkStridedDeviceAddressRangeKHR} to the {@code addressRange} field. */
    public VkDrawIndirectCount2InfoKHR addressRange(VkStridedDeviceAddressRangeKHR value) { naddressRange(address(), value); return this; }
    /** Passes the {@code addressRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDrawIndirectCount2InfoKHR addressRange(java.util.function.Consumer<VkStridedDeviceAddressRangeKHR> consumer) { consumer.accept(addressRange()); return this; }
    /** Sets the specified value to the {@code addressFlags} field. */
    public VkDrawIndirectCount2InfoKHR addressFlags(@NativeType("VkAddressCommandFlagsKHR") int value) { naddressFlags(address(), value); return this; }
    /** Copies the specified {@link VkDeviceAddressRangeKHR} to the {@code countAddressRange} field. */
    public VkDrawIndirectCount2InfoKHR countAddressRange(VkDeviceAddressRangeKHR value) { ncountAddressRange(address(), value); return this; }
    /** Passes the {@code countAddressRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDrawIndirectCount2InfoKHR countAddressRange(java.util.function.Consumer<VkDeviceAddressRangeKHR> consumer) { consumer.accept(countAddressRange()); return this; }
    /** Sets the specified value to the {@code countAddressFlags} field. */
    public VkDrawIndirectCount2InfoKHR countAddressFlags(@NativeType("VkAddressCommandFlagsKHR") int value) { ncountAddressFlags(address(), value); return this; }
    /** Sets the specified value to the {@code maxDrawCount} field. */
    public VkDrawIndirectCount2InfoKHR maxDrawCount(@NativeType("uint32_t") int value) { nmaxDrawCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDrawIndirectCount2InfoKHR set(
        int sType,
        long pNext,
        VkStridedDeviceAddressRangeKHR addressRange,
        int addressFlags,
        VkDeviceAddressRangeKHR countAddressRange,
        int countAddressFlags,
        int maxDrawCount
    ) {
        sType(sType);
        pNext(pNext);
        addressRange(addressRange);
        addressFlags(addressFlags);
        countAddressRange(countAddressRange);
        countAddressFlags(countAddressFlags);
        maxDrawCount(maxDrawCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDrawIndirectCount2InfoKHR set(VkDrawIndirectCount2InfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDrawIndirectCount2InfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDrawIndirectCount2InfoKHR malloc() {
        return new VkDrawIndirectCount2InfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDrawIndirectCount2InfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDrawIndirectCount2InfoKHR calloc() {
        return new VkDrawIndirectCount2InfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDrawIndirectCount2InfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDrawIndirectCount2InfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDrawIndirectCount2InfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDrawIndirectCount2InfoKHR} instance for the specified memory address. */
    public static VkDrawIndirectCount2InfoKHR create(long address) {
        return new VkDrawIndirectCount2InfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDrawIndirectCount2InfoKHR createSafe(long address) {
        return address == NULL ? null : new VkDrawIndirectCount2InfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkDrawIndirectCount2InfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCount2InfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDrawIndirectCount2InfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCount2InfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrawIndirectCount2InfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCount2InfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDrawIndirectCount2InfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCount2InfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDrawIndirectCount2InfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDrawIndirectCount2InfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrawIndirectCount2InfoKHR malloc(MemoryStack stack) {
        return new VkDrawIndirectCount2InfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDrawIndirectCount2InfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrawIndirectCount2InfoKHR calloc(MemoryStack stack) {
        return new VkDrawIndirectCount2InfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDrawIndirectCount2InfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCount2InfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrawIndirectCount2InfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCount2InfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDrawIndirectCount2InfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDrawIndirectCount2InfoKHR.PNEXT); }
    /** Unsafe version of {@link #addressRange}. */
    public static VkStridedDeviceAddressRangeKHR naddressRange(long struct) { return VkStridedDeviceAddressRangeKHR.create(struct + VkDrawIndirectCount2InfoKHR.ADDRESSRANGE); }
    /** Unsafe version of {@link #addressFlags}. */
    public static int naddressFlags(long struct) { return memGetInt(struct + VkDrawIndirectCount2InfoKHR.ADDRESSFLAGS); }
    /** Unsafe version of {@link #countAddressRange}. */
    public static VkDeviceAddressRangeKHR ncountAddressRange(long struct) { return VkDeviceAddressRangeKHR.create(struct + VkDrawIndirectCount2InfoKHR.COUNTADDRESSRANGE); }
    /** Unsafe version of {@link #countAddressFlags}. */
    public static int ncountAddressFlags(long struct) { return memGetInt(struct + VkDrawIndirectCount2InfoKHR.COUNTADDRESSFLAGS); }
    /** Unsafe version of {@link #maxDrawCount}. */
    public static int nmaxDrawCount(long struct) { return memGetInt(struct + VkDrawIndirectCount2InfoKHR.MAXDRAWCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDrawIndirectCount2InfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDrawIndirectCount2InfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #addressRange(VkStridedDeviceAddressRangeKHR) addressRange}. */
    public static void naddressRange(long struct, VkStridedDeviceAddressRangeKHR value) { memCopy(value.address(), struct + VkDrawIndirectCount2InfoKHR.ADDRESSRANGE, VkStridedDeviceAddressRangeKHR.SIZEOF); }
    /** Unsafe version of {@link #addressFlags(int) addressFlags}. */
    public static void naddressFlags(long struct, int value) { memPutInt(struct + VkDrawIndirectCount2InfoKHR.ADDRESSFLAGS, value); }
    /** Unsafe version of {@link #countAddressRange(VkDeviceAddressRangeKHR) countAddressRange}. */
    public static void ncountAddressRange(long struct, VkDeviceAddressRangeKHR value) { memCopy(value.address(), struct + VkDrawIndirectCount2InfoKHR.COUNTADDRESSRANGE, VkDeviceAddressRangeKHR.SIZEOF); }
    /** Unsafe version of {@link #countAddressFlags(int) countAddressFlags}. */
    public static void ncountAddressFlags(long struct, int value) { memPutInt(struct + VkDrawIndirectCount2InfoKHR.COUNTADDRESSFLAGS, value); }
    /** Unsafe version of {@link #maxDrawCount(int) maxDrawCount}. */
    public static void nmaxDrawCount(long struct, int value) { memPutInt(struct + VkDrawIndirectCount2InfoKHR.MAXDRAWCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkDrawIndirectCount2InfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkDrawIndirectCount2InfoKHR, Buffer> implements NativeResource {

        private static final VkDrawIndirectCount2InfoKHR ELEMENT_FACTORY = VkDrawIndirectCount2InfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDrawIndirectCount2InfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDrawIndirectCount2InfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDrawIndirectCount2InfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDrawIndirectCount2InfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDrawIndirectCount2InfoKHR.npNext(address()); }
        /** @return a {@link VkStridedDeviceAddressRangeKHR} view of the {@code addressRange} field. */
        public VkStridedDeviceAddressRangeKHR addressRange() { return VkDrawIndirectCount2InfoKHR.naddressRange(address()); }
        /** @return the value of the {@code addressFlags} field. */
        @NativeType("VkAddressCommandFlagsKHR")
        public int addressFlags() { return VkDrawIndirectCount2InfoKHR.naddressFlags(address()); }
        /** @return a {@link VkDeviceAddressRangeKHR} view of the {@code countAddressRange} field. */
        public VkDeviceAddressRangeKHR countAddressRange() { return VkDrawIndirectCount2InfoKHR.ncountAddressRange(address()); }
        /** @return the value of the {@code countAddressFlags} field. */
        @NativeType("VkAddressCommandFlagsKHR")
        public int countAddressFlags() { return VkDrawIndirectCount2InfoKHR.ncountAddressFlags(address()); }
        /** @return the value of the {@code maxDrawCount} field. */
        @NativeType("uint32_t")
        public int maxDrawCount() { return VkDrawIndirectCount2InfoKHR.nmaxDrawCount(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDrawIndirectCount2InfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDrawIndirectCount2InfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRDeviceAddressCommands#VK_STRUCTURE_TYPE_DRAW_INDIRECT_COUNT_2_INFO_KHR STRUCTURE_TYPE_DRAW_INDIRECT_COUNT_2_INFO_KHR} value to the {@code sType} field. */
        public VkDrawIndirectCount2InfoKHR.Buffer sType$Default() { return sType(KHRDeviceAddressCommands.VK_STRUCTURE_TYPE_DRAW_INDIRECT_COUNT_2_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDrawIndirectCount2InfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkDrawIndirectCount2InfoKHR.npNext(address(), value); return this; }
        /** Copies the specified {@link VkStridedDeviceAddressRangeKHR} to the {@code addressRange} field. */
        public VkDrawIndirectCount2InfoKHR.Buffer addressRange(VkStridedDeviceAddressRangeKHR value) { VkDrawIndirectCount2InfoKHR.naddressRange(address(), value); return this; }
        /** Passes the {@code addressRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDrawIndirectCount2InfoKHR.Buffer addressRange(java.util.function.Consumer<VkStridedDeviceAddressRangeKHR> consumer) { consumer.accept(addressRange()); return this; }
        /** Sets the specified value to the {@code addressFlags} field. */
        public VkDrawIndirectCount2InfoKHR.Buffer addressFlags(@NativeType("VkAddressCommandFlagsKHR") int value) { VkDrawIndirectCount2InfoKHR.naddressFlags(address(), value); return this; }
        /** Copies the specified {@link VkDeviceAddressRangeKHR} to the {@code countAddressRange} field. */
        public VkDrawIndirectCount2InfoKHR.Buffer countAddressRange(VkDeviceAddressRangeKHR value) { VkDrawIndirectCount2InfoKHR.ncountAddressRange(address(), value); return this; }
        /** Passes the {@code countAddressRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDrawIndirectCount2InfoKHR.Buffer countAddressRange(java.util.function.Consumer<VkDeviceAddressRangeKHR> consumer) { consumer.accept(countAddressRange()); return this; }
        /** Sets the specified value to the {@code countAddressFlags} field. */
        public VkDrawIndirectCount2InfoKHR.Buffer countAddressFlags(@NativeType("VkAddressCommandFlagsKHR") int value) { VkDrawIndirectCount2InfoKHR.ncountAddressFlags(address(), value); return this; }
        /** Sets the specified value to the {@code maxDrawCount} field. */
        public VkDrawIndirectCount2InfoKHR.Buffer maxDrawCount(@NativeType("uint32_t") int value) { VkDrawIndirectCount2InfoKHR.nmaxDrawCount(address(), value); return this; }

    }

}
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
 * struct VkCopyMemoryIndirectInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkAddressCopyFlagsKHR srcCopyFlags;
 *     VkAddressCopyFlagsKHR dstCopyFlags;
 *     uint32_t copyCount;
 *     {@link VkStridedDeviceAddressRangeKHR VkStridedDeviceAddressRangeKHR} copyAddressRange;
 * }</code></pre>
 */
public class VkCopyMemoryIndirectInfoKHR extends Struct<VkCopyMemoryIndirectInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCCOPYFLAGS,
        DSTCOPYFLAGS,
        COPYCOUNT,
        COPYADDRESSRANGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(VkStridedDeviceAddressRangeKHR.SIZEOF, VkStridedDeviceAddressRangeKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCCOPYFLAGS = layout.offsetof(2);
        DSTCOPYFLAGS = layout.offsetof(3);
        COPYCOUNT = layout.offsetof(4);
        COPYADDRESSRANGE = layout.offsetof(5);
    }

    protected VkCopyMemoryIndirectInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyMemoryIndirectInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkCopyMemoryIndirectInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkCopyMemoryIndirectInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyMemoryIndirectInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code srcCopyFlags} field. */
    @NativeType("VkAddressCopyFlagsKHR")
    public int srcCopyFlags() { return nsrcCopyFlags(address()); }
    /** @return the value of the {@code dstCopyFlags} field. */
    @NativeType("VkAddressCopyFlagsKHR")
    public int dstCopyFlags() { return ndstCopyFlags(address()); }
    /** @return the value of the {@code copyCount} field. */
    @NativeType("uint32_t")
    public int copyCount() { return ncopyCount(address()); }
    /** @return a {@link VkStridedDeviceAddressRangeKHR} view of the {@code copyAddressRange} field. */
    public VkStridedDeviceAddressRangeKHR copyAddressRange() { return ncopyAddressRange(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCopyMemoryIndirectInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRCopyMemoryIndirect#VK_STRUCTURE_TYPE_COPY_MEMORY_INDIRECT_INFO_KHR STRUCTURE_TYPE_COPY_MEMORY_INDIRECT_INFO_KHR} value to the {@code sType} field. */
    public VkCopyMemoryIndirectInfoKHR sType$Default() { return sType(KHRCopyMemoryIndirect.VK_STRUCTURE_TYPE_COPY_MEMORY_INDIRECT_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCopyMemoryIndirectInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code srcCopyFlags} field. */
    public VkCopyMemoryIndirectInfoKHR srcCopyFlags(@NativeType("VkAddressCopyFlagsKHR") int value) { nsrcCopyFlags(address(), value); return this; }
    /** Sets the specified value to the {@code dstCopyFlags} field. */
    public VkCopyMemoryIndirectInfoKHR dstCopyFlags(@NativeType("VkAddressCopyFlagsKHR") int value) { ndstCopyFlags(address(), value); return this; }
    /** Sets the specified value to the {@code copyCount} field. */
    public VkCopyMemoryIndirectInfoKHR copyCount(@NativeType("uint32_t") int value) { ncopyCount(address(), value); return this; }
    /** Copies the specified {@link VkStridedDeviceAddressRangeKHR} to the {@code copyAddressRange} field. */
    public VkCopyMemoryIndirectInfoKHR copyAddressRange(VkStridedDeviceAddressRangeKHR value) { ncopyAddressRange(address(), value); return this; }
    /** Passes the {@code copyAddressRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkCopyMemoryIndirectInfoKHR copyAddressRange(java.util.function.Consumer<VkStridedDeviceAddressRangeKHR> consumer) { consumer.accept(copyAddressRange()); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyMemoryIndirectInfoKHR set(
        int sType,
        long pNext,
        int srcCopyFlags,
        int dstCopyFlags,
        int copyCount,
        VkStridedDeviceAddressRangeKHR copyAddressRange
    ) {
        sType(sType);
        pNext(pNext);
        srcCopyFlags(srcCopyFlags);
        dstCopyFlags(dstCopyFlags);
        copyCount(copyCount);
        copyAddressRange(copyAddressRange);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCopyMemoryIndirectInfoKHR set(VkCopyMemoryIndirectInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyMemoryIndirectInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryIndirectInfoKHR malloc() {
        return new VkCopyMemoryIndirectInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryIndirectInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryIndirectInfoKHR calloc() {
        return new VkCopyMemoryIndirectInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryIndirectInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkCopyMemoryIndirectInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMemoryIndirectInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyMemoryIndirectInfoKHR} instance for the specified memory address. */
    public static VkCopyMemoryIndirectInfoKHR create(long address) {
        return new VkCopyMemoryIndirectInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyMemoryIndirectInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkCopyMemoryIndirectInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkCopyMemoryIndirectInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryIndirectInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryIndirectInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryIndirectInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryIndirectInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryIndirectInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyMemoryIndirectInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryIndirectInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyMemoryIndirectInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyMemoryIndirectInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryIndirectInfoKHR malloc(MemoryStack stack) {
        return new VkCopyMemoryIndirectInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyMemoryIndirectInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryIndirectInfoKHR calloc(MemoryStack stack) {
        return new VkCopyMemoryIndirectInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyMemoryIndirectInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryIndirectInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryIndirectInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryIndirectInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCopyMemoryIndirectInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyMemoryIndirectInfoKHR.PNEXT); }
    /** Unsafe version of {@link #srcCopyFlags}. */
    public static int nsrcCopyFlags(long struct) { return memGetInt(struct + VkCopyMemoryIndirectInfoKHR.SRCCOPYFLAGS); }
    /** Unsafe version of {@link #dstCopyFlags}. */
    public static int ndstCopyFlags(long struct) { return memGetInt(struct + VkCopyMemoryIndirectInfoKHR.DSTCOPYFLAGS); }
    /** Unsafe version of {@link #copyCount}. */
    public static int ncopyCount(long struct) { return memGetInt(struct + VkCopyMemoryIndirectInfoKHR.COPYCOUNT); }
    /** Unsafe version of {@link #copyAddressRange}. */
    public static VkStridedDeviceAddressRangeKHR ncopyAddressRange(long struct) { return VkStridedDeviceAddressRangeKHR.create(struct + VkCopyMemoryIndirectInfoKHR.COPYADDRESSRANGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCopyMemoryIndirectInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyMemoryIndirectInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #srcCopyFlags(int) srcCopyFlags}. */
    public static void nsrcCopyFlags(long struct, int value) { memPutInt(struct + VkCopyMemoryIndirectInfoKHR.SRCCOPYFLAGS, value); }
    /** Unsafe version of {@link #dstCopyFlags(int) dstCopyFlags}. */
    public static void ndstCopyFlags(long struct, int value) { memPutInt(struct + VkCopyMemoryIndirectInfoKHR.DSTCOPYFLAGS, value); }
    /** Unsafe version of {@link #copyCount(int) copyCount}. */
    public static void ncopyCount(long struct, int value) { memPutInt(struct + VkCopyMemoryIndirectInfoKHR.COPYCOUNT, value); }
    /** Unsafe version of {@link #copyAddressRange(VkStridedDeviceAddressRangeKHR) copyAddressRange}. */
    public static void ncopyAddressRange(long struct, VkStridedDeviceAddressRangeKHR value) { memCopy(value.address(), struct + VkCopyMemoryIndirectInfoKHR.COPYADDRESSRANGE, VkStridedDeviceAddressRangeKHR.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkCopyMemoryIndirectInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkCopyMemoryIndirectInfoKHR, Buffer> implements NativeResource {

        private static final VkCopyMemoryIndirectInfoKHR ELEMENT_FACTORY = VkCopyMemoryIndirectInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkCopyMemoryIndirectInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyMemoryIndirectInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyMemoryIndirectInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyMemoryIndirectInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyMemoryIndirectInfoKHR.npNext(address()); }
        /** @return the value of the {@code srcCopyFlags} field. */
        @NativeType("VkAddressCopyFlagsKHR")
        public int srcCopyFlags() { return VkCopyMemoryIndirectInfoKHR.nsrcCopyFlags(address()); }
        /** @return the value of the {@code dstCopyFlags} field. */
        @NativeType("VkAddressCopyFlagsKHR")
        public int dstCopyFlags() { return VkCopyMemoryIndirectInfoKHR.ndstCopyFlags(address()); }
        /** @return the value of the {@code copyCount} field. */
        @NativeType("uint32_t")
        public int copyCount() { return VkCopyMemoryIndirectInfoKHR.ncopyCount(address()); }
        /** @return a {@link VkStridedDeviceAddressRangeKHR} view of the {@code copyAddressRange} field. */
        public VkStridedDeviceAddressRangeKHR copyAddressRange() { return VkCopyMemoryIndirectInfoKHR.ncopyAddressRange(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCopyMemoryIndirectInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyMemoryIndirectInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRCopyMemoryIndirect#VK_STRUCTURE_TYPE_COPY_MEMORY_INDIRECT_INFO_KHR STRUCTURE_TYPE_COPY_MEMORY_INDIRECT_INFO_KHR} value to the {@code sType} field. */
        public VkCopyMemoryIndirectInfoKHR.Buffer sType$Default() { return sType(KHRCopyMemoryIndirect.VK_STRUCTURE_TYPE_COPY_MEMORY_INDIRECT_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCopyMemoryIndirectInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkCopyMemoryIndirectInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code srcCopyFlags} field. */
        public VkCopyMemoryIndirectInfoKHR.Buffer srcCopyFlags(@NativeType("VkAddressCopyFlagsKHR") int value) { VkCopyMemoryIndirectInfoKHR.nsrcCopyFlags(address(), value); return this; }
        /** Sets the specified value to the {@code dstCopyFlags} field. */
        public VkCopyMemoryIndirectInfoKHR.Buffer dstCopyFlags(@NativeType("VkAddressCopyFlagsKHR") int value) { VkCopyMemoryIndirectInfoKHR.ndstCopyFlags(address(), value); return this; }
        /** Sets the specified value to the {@code copyCount} field. */
        public VkCopyMemoryIndirectInfoKHR.Buffer copyCount(@NativeType("uint32_t") int value) { VkCopyMemoryIndirectInfoKHR.ncopyCount(address(), value); return this; }
        /** Copies the specified {@link VkStridedDeviceAddressRangeKHR} to the {@code copyAddressRange} field. */
        public VkCopyMemoryIndirectInfoKHR.Buffer copyAddressRange(VkStridedDeviceAddressRangeKHR value) { VkCopyMemoryIndirectInfoKHR.ncopyAddressRange(address(), value); return this; }
        /** Passes the {@code copyAddressRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkCopyMemoryIndirectInfoKHR.Buffer copyAddressRange(java.util.function.Consumer<VkStridedDeviceAddressRangeKHR> consumer) { consumer.accept(copyAddressRange()); return this; }

    }

}
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
 * struct VkBindIndexBuffer3InfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkDeviceAddressRangeKHR VkDeviceAddressRangeKHR} addressRange;
 *     VkAddressCommandFlagsKHR addressFlags;
 *     VkIndexType indexType;
 * }</code></pre>
 */
public class VkBindIndexBuffer3InfoKHR extends Struct<VkBindIndexBuffer3InfoKHR> implements NativeResource {

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
        INDEXTYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
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
        INDEXTYPE = layout.offsetof(4);
    }

    protected VkBindIndexBuffer3InfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBindIndexBuffer3InfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkBindIndexBuffer3InfoKHR(address, container);
    }

    /**
     * Creates a {@code VkBindIndexBuffer3InfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindIndexBuffer3InfoKHR(ByteBuffer container) {
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
    /** @return a {@link VkDeviceAddressRangeKHR} view of the {@code addressRange} field. */
    public VkDeviceAddressRangeKHR addressRange() { return naddressRange(address()); }
    /** @return the value of the {@code addressFlags} field. */
    @NativeType("VkAddressCommandFlagsKHR")
    public int addressFlags() { return naddressFlags(address()); }
    /** @return the value of the {@code indexType} field. */
    @NativeType("VkIndexType")
    public int indexType() { return nindexType(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindIndexBuffer3InfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDeviceAddressCommands#VK_STRUCTURE_TYPE_BIND_INDEX_BUFFER_3_INFO_KHR STRUCTURE_TYPE_BIND_INDEX_BUFFER_3_INFO_KHR} value to the {@code sType} field. */
    public VkBindIndexBuffer3InfoKHR sType$Default() { return sType(KHRDeviceAddressCommands.VK_STRUCTURE_TYPE_BIND_INDEX_BUFFER_3_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindIndexBuffer3InfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkDeviceAddressRangeKHR} to the {@code addressRange} field. */
    public VkBindIndexBuffer3InfoKHR addressRange(VkDeviceAddressRangeKHR value) { naddressRange(address(), value); return this; }
    /** Passes the {@code addressRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkBindIndexBuffer3InfoKHR addressRange(java.util.function.Consumer<VkDeviceAddressRangeKHR> consumer) { consumer.accept(addressRange()); return this; }
    /** Sets the specified value to the {@code addressFlags} field. */
    public VkBindIndexBuffer3InfoKHR addressFlags(@NativeType("VkAddressCommandFlagsKHR") int value) { naddressFlags(address(), value); return this; }
    /** Sets the specified value to the {@code indexType} field. */
    public VkBindIndexBuffer3InfoKHR indexType(@NativeType("VkIndexType") int value) { nindexType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindIndexBuffer3InfoKHR set(
        int sType,
        long pNext,
        VkDeviceAddressRangeKHR addressRange,
        int addressFlags,
        int indexType
    ) {
        sType(sType);
        pNext(pNext);
        addressRange(addressRange);
        addressFlags(addressFlags);
        indexType(indexType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindIndexBuffer3InfoKHR set(VkBindIndexBuffer3InfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindIndexBuffer3InfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindIndexBuffer3InfoKHR malloc() {
        return new VkBindIndexBuffer3InfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBindIndexBuffer3InfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindIndexBuffer3InfoKHR calloc() {
        return new VkBindIndexBuffer3InfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBindIndexBuffer3InfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkBindIndexBuffer3InfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindIndexBuffer3InfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkBindIndexBuffer3InfoKHR} instance for the specified memory address. */
    public static VkBindIndexBuffer3InfoKHR create(long address) {
        return new VkBindIndexBuffer3InfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBindIndexBuffer3InfoKHR createSafe(long address) {
        return address == NULL ? null : new VkBindIndexBuffer3InfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkBindIndexBuffer3InfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindIndexBuffer3InfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindIndexBuffer3InfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindIndexBuffer3InfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindIndexBuffer3InfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindIndexBuffer3InfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBindIndexBuffer3InfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindIndexBuffer3InfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBindIndexBuffer3InfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBindIndexBuffer3InfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindIndexBuffer3InfoKHR malloc(MemoryStack stack) {
        return new VkBindIndexBuffer3InfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBindIndexBuffer3InfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindIndexBuffer3InfoKHR calloc(MemoryStack stack) {
        return new VkBindIndexBuffer3InfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBindIndexBuffer3InfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindIndexBuffer3InfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindIndexBuffer3InfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindIndexBuffer3InfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBindIndexBuffer3InfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindIndexBuffer3InfoKHR.PNEXT); }
    /** Unsafe version of {@link #addressRange}. */
    public static VkDeviceAddressRangeKHR naddressRange(long struct) { return VkDeviceAddressRangeKHR.create(struct + VkBindIndexBuffer3InfoKHR.ADDRESSRANGE); }
    /** Unsafe version of {@link #addressFlags}. */
    public static int naddressFlags(long struct) { return memGetInt(struct + VkBindIndexBuffer3InfoKHR.ADDRESSFLAGS); }
    /** Unsafe version of {@link #indexType}. */
    public static int nindexType(long struct) { return memGetInt(struct + VkBindIndexBuffer3InfoKHR.INDEXTYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBindIndexBuffer3InfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindIndexBuffer3InfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #addressRange(VkDeviceAddressRangeKHR) addressRange}. */
    public static void naddressRange(long struct, VkDeviceAddressRangeKHR value) { memCopy(value.address(), struct + VkBindIndexBuffer3InfoKHR.ADDRESSRANGE, VkDeviceAddressRangeKHR.SIZEOF); }
    /** Unsafe version of {@link #addressFlags(int) addressFlags}. */
    public static void naddressFlags(long struct, int value) { memPutInt(struct + VkBindIndexBuffer3InfoKHR.ADDRESSFLAGS, value); }
    /** Unsafe version of {@link #indexType(int) indexType}. */
    public static void nindexType(long struct, int value) { memPutInt(struct + VkBindIndexBuffer3InfoKHR.INDEXTYPE, value); }

    // -----------------------------------

    /** An array of {@link VkBindIndexBuffer3InfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkBindIndexBuffer3InfoKHR, Buffer> implements NativeResource {

        private static final VkBindIndexBuffer3InfoKHR ELEMENT_FACTORY = VkBindIndexBuffer3InfoKHR.create(-1L);

        /**
         * Creates a new {@code VkBindIndexBuffer3InfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindIndexBuffer3InfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBindIndexBuffer3InfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindIndexBuffer3InfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindIndexBuffer3InfoKHR.npNext(address()); }
        /** @return a {@link VkDeviceAddressRangeKHR} view of the {@code addressRange} field. */
        public VkDeviceAddressRangeKHR addressRange() { return VkBindIndexBuffer3InfoKHR.naddressRange(address()); }
        /** @return the value of the {@code addressFlags} field. */
        @NativeType("VkAddressCommandFlagsKHR")
        public int addressFlags() { return VkBindIndexBuffer3InfoKHR.naddressFlags(address()); }
        /** @return the value of the {@code indexType} field. */
        @NativeType("VkIndexType")
        public int indexType() { return VkBindIndexBuffer3InfoKHR.nindexType(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindIndexBuffer3InfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBindIndexBuffer3InfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRDeviceAddressCommands#VK_STRUCTURE_TYPE_BIND_INDEX_BUFFER_3_INFO_KHR STRUCTURE_TYPE_BIND_INDEX_BUFFER_3_INFO_KHR} value to the {@code sType} field. */
        public VkBindIndexBuffer3InfoKHR.Buffer sType$Default() { return sType(KHRDeviceAddressCommands.VK_STRUCTURE_TYPE_BIND_INDEX_BUFFER_3_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindIndexBuffer3InfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkBindIndexBuffer3InfoKHR.npNext(address(), value); return this; }
        /** Copies the specified {@link VkDeviceAddressRangeKHR} to the {@code addressRange} field. */
        public VkBindIndexBuffer3InfoKHR.Buffer addressRange(VkDeviceAddressRangeKHR value) { VkBindIndexBuffer3InfoKHR.naddressRange(address(), value); return this; }
        /** Passes the {@code addressRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkBindIndexBuffer3InfoKHR.Buffer addressRange(java.util.function.Consumer<VkDeviceAddressRangeKHR> consumer) { consumer.accept(addressRange()); return this; }
        /** Sets the specified value to the {@code addressFlags} field. */
        public VkBindIndexBuffer3InfoKHR.Buffer addressFlags(@NativeType("VkAddressCommandFlagsKHR") int value) { VkBindIndexBuffer3InfoKHR.naddressFlags(address(), value); return this; }
        /** Sets the specified value to the {@code indexType} field. */
        public VkBindIndexBuffer3InfoKHR.Buffer indexType(@NativeType("VkIndexType") int value) { VkBindIndexBuffer3InfoKHR.nindexType(address(), value); return this; }

    }

}
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
 * struct VkBindHeapInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkDeviceAddressRangeEXT VkDeviceAddressRangeEXT} heapRange;
 *     VkDeviceSize reservedRangeOffset;
 *     VkDeviceSize reservedRangeSize;
 * }</code></pre>
 */
public class VkBindHeapInfoEXT extends Struct<VkBindHeapInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HEAPRANGE,
        RESERVEDRANGEOFFSET,
        RESERVEDRANGESIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkDeviceAddressRangeEXT.SIZEOF, VkDeviceAddressRangeEXT.ALIGNOF),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HEAPRANGE = layout.offsetof(2);
        RESERVEDRANGEOFFSET = layout.offsetof(3);
        RESERVEDRANGESIZE = layout.offsetof(4);
    }

    protected VkBindHeapInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBindHeapInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkBindHeapInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkBindHeapInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindHeapInfoEXT(ByteBuffer container) {
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
    /** @return a {@link VkDeviceAddressRangeEXT} view of the {@code heapRange} field. */
    public VkDeviceAddressRangeEXT heapRange() { return nheapRange(address()); }
    /** @return the value of the {@code reservedRangeOffset} field. */
    @NativeType("VkDeviceSize")
    public long reservedRangeOffset() { return nreservedRangeOffset(address()); }
    /** @return the value of the {@code reservedRangeSize} field. */
    @NativeType("VkDeviceSize")
    public long reservedRangeSize() { return nreservedRangeSize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindHeapInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_BIND_HEAP_INFO_EXT STRUCTURE_TYPE_BIND_HEAP_INFO_EXT} value to the {@code sType} field. */
    public VkBindHeapInfoEXT sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_BIND_HEAP_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindHeapInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkDeviceAddressRangeEXT} to the {@code heapRange} field. */
    public VkBindHeapInfoEXT heapRange(VkDeviceAddressRangeEXT value) { nheapRange(address(), value); return this; }
    /** Passes the {@code heapRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkBindHeapInfoEXT heapRange(java.util.function.Consumer<VkDeviceAddressRangeEXT> consumer) { consumer.accept(heapRange()); return this; }
    /** Sets the specified value to the {@code reservedRangeOffset} field. */
    public VkBindHeapInfoEXT reservedRangeOffset(@NativeType("VkDeviceSize") long value) { nreservedRangeOffset(address(), value); return this; }
    /** Sets the specified value to the {@code reservedRangeSize} field. */
    public VkBindHeapInfoEXT reservedRangeSize(@NativeType("VkDeviceSize") long value) { nreservedRangeSize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindHeapInfoEXT set(
        int sType,
        long pNext,
        VkDeviceAddressRangeEXT heapRange,
        long reservedRangeOffset,
        long reservedRangeSize
    ) {
        sType(sType);
        pNext(pNext);
        heapRange(heapRange);
        reservedRangeOffset(reservedRangeOffset);
        reservedRangeSize(reservedRangeSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindHeapInfoEXT set(VkBindHeapInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindHeapInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindHeapInfoEXT malloc() {
        return new VkBindHeapInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBindHeapInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindHeapInfoEXT calloc() {
        return new VkBindHeapInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBindHeapInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkBindHeapInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindHeapInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkBindHeapInfoEXT} instance for the specified memory address. */
    public static VkBindHeapInfoEXT create(long address) {
        return new VkBindHeapInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBindHeapInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkBindHeapInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkBindHeapInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindHeapInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindHeapInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindHeapInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindHeapInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindHeapInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBindHeapInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindHeapInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBindHeapInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBindHeapInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindHeapInfoEXT malloc(MemoryStack stack) {
        return new VkBindHeapInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBindHeapInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindHeapInfoEXT calloc(MemoryStack stack) {
        return new VkBindHeapInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBindHeapInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindHeapInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindHeapInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindHeapInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBindHeapInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindHeapInfoEXT.PNEXT); }
    /** Unsafe version of {@link #heapRange}. */
    public static VkDeviceAddressRangeEXT nheapRange(long struct) { return VkDeviceAddressRangeEXT.create(struct + VkBindHeapInfoEXT.HEAPRANGE); }
    /** Unsafe version of {@link #reservedRangeOffset}. */
    public static long nreservedRangeOffset(long struct) { return memGetLong(struct + VkBindHeapInfoEXT.RESERVEDRANGEOFFSET); }
    /** Unsafe version of {@link #reservedRangeSize}. */
    public static long nreservedRangeSize(long struct) { return memGetLong(struct + VkBindHeapInfoEXT.RESERVEDRANGESIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBindHeapInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindHeapInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #heapRange(VkDeviceAddressRangeEXT) heapRange}. */
    public static void nheapRange(long struct, VkDeviceAddressRangeEXT value) { memCopy(value.address(), struct + VkBindHeapInfoEXT.HEAPRANGE, VkDeviceAddressRangeEXT.SIZEOF); }
    /** Unsafe version of {@link #reservedRangeOffset(long) reservedRangeOffset}. */
    public static void nreservedRangeOffset(long struct, long value) { memPutLong(struct + VkBindHeapInfoEXT.RESERVEDRANGEOFFSET, value); }
    /** Unsafe version of {@link #reservedRangeSize(long) reservedRangeSize}. */
    public static void nreservedRangeSize(long struct, long value) { memPutLong(struct + VkBindHeapInfoEXT.RESERVEDRANGESIZE, value); }

    // -----------------------------------

    /** An array of {@link VkBindHeapInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkBindHeapInfoEXT, Buffer> implements NativeResource {

        private static final VkBindHeapInfoEXT ELEMENT_FACTORY = VkBindHeapInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkBindHeapInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindHeapInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBindHeapInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindHeapInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindHeapInfoEXT.npNext(address()); }
        /** @return a {@link VkDeviceAddressRangeEXT} view of the {@code heapRange} field. */
        public VkDeviceAddressRangeEXT heapRange() { return VkBindHeapInfoEXT.nheapRange(address()); }
        /** @return the value of the {@code reservedRangeOffset} field. */
        @NativeType("VkDeviceSize")
        public long reservedRangeOffset() { return VkBindHeapInfoEXT.nreservedRangeOffset(address()); }
        /** @return the value of the {@code reservedRangeSize} field. */
        @NativeType("VkDeviceSize")
        public long reservedRangeSize() { return VkBindHeapInfoEXT.nreservedRangeSize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindHeapInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkBindHeapInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_BIND_HEAP_INFO_EXT STRUCTURE_TYPE_BIND_HEAP_INFO_EXT} value to the {@code sType} field. */
        public VkBindHeapInfoEXT.Buffer sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_BIND_HEAP_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindHeapInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkBindHeapInfoEXT.npNext(address(), value); return this; }
        /** Copies the specified {@link VkDeviceAddressRangeEXT} to the {@code heapRange} field. */
        public VkBindHeapInfoEXT.Buffer heapRange(VkDeviceAddressRangeEXT value) { VkBindHeapInfoEXT.nheapRange(address(), value); return this; }
        /** Passes the {@code heapRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkBindHeapInfoEXT.Buffer heapRange(java.util.function.Consumer<VkDeviceAddressRangeEXT> consumer) { consumer.accept(heapRange()); return this; }
        /** Sets the specified value to the {@code reservedRangeOffset} field. */
        public VkBindHeapInfoEXT.Buffer reservedRangeOffset(@NativeType("VkDeviceSize") long value) { VkBindHeapInfoEXT.nreservedRangeOffset(address(), value); return this; }
        /** Sets the specified value to the {@code reservedRangeSize} field. */
        public VkBindHeapInfoEXT.Buffer reservedRangeSize(@NativeType("VkDeviceSize") long value) { VkBindHeapInfoEXT.nreservedRangeSize(address(), value); return this; }

    }

}
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
 * struct VkDispatchIndirect2InfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkDeviceAddressRangeKHR VkDeviceAddressRangeKHR} addressRange;
 *     VkAddressCommandFlagsKHR addressFlags;
 * }</code></pre>
 */
public class VkDispatchIndirect2InfoKHR extends Struct<VkDispatchIndirect2InfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ADDRESSRANGE,
        ADDRESSFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkDeviceAddressRangeKHR.SIZEOF, VkDeviceAddressRangeKHR.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ADDRESSRANGE = layout.offsetof(2);
        ADDRESSFLAGS = layout.offsetof(3);
    }

    protected VkDispatchIndirect2InfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDispatchIndirect2InfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDispatchIndirect2InfoKHR(address, container);
    }

    /**
     * Creates a {@code VkDispatchIndirect2InfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDispatchIndirect2InfoKHR(ByteBuffer container) {
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

    /** Sets the specified value to the {@code sType} field. */
    public VkDispatchIndirect2InfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDeviceAddressCommands#VK_STRUCTURE_TYPE_DISPATCH_INDIRECT_2_INFO_KHR STRUCTURE_TYPE_DISPATCH_INDIRECT_2_INFO_KHR} value to the {@code sType} field. */
    public VkDispatchIndirect2InfoKHR sType$Default() { return sType(KHRDeviceAddressCommands.VK_STRUCTURE_TYPE_DISPATCH_INDIRECT_2_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDispatchIndirect2InfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkDeviceAddressRangeKHR} to the {@code addressRange} field. */
    public VkDispatchIndirect2InfoKHR addressRange(VkDeviceAddressRangeKHR value) { naddressRange(address(), value); return this; }
    /** Passes the {@code addressRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDispatchIndirect2InfoKHR addressRange(java.util.function.Consumer<VkDeviceAddressRangeKHR> consumer) { consumer.accept(addressRange()); return this; }
    /** Sets the specified value to the {@code addressFlags} field. */
    public VkDispatchIndirect2InfoKHR addressFlags(@NativeType("VkAddressCommandFlagsKHR") int value) { naddressFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDispatchIndirect2InfoKHR set(
        int sType,
        long pNext,
        VkDeviceAddressRangeKHR addressRange,
        int addressFlags
    ) {
        sType(sType);
        pNext(pNext);
        addressRange(addressRange);
        addressFlags(addressFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDispatchIndirect2InfoKHR set(VkDispatchIndirect2InfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDispatchIndirect2InfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDispatchIndirect2InfoKHR malloc() {
        return new VkDispatchIndirect2InfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDispatchIndirect2InfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDispatchIndirect2InfoKHR calloc() {
        return new VkDispatchIndirect2InfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDispatchIndirect2InfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDispatchIndirect2InfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDispatchIndirect2InfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDispatchIndirect2InfoKHR} instance for the specified memory address. */
    public static VkDispatchIndirect2InfoKHR create(long address) {
        return new VkDispatchIndirect2InfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDispatchIndirect2InfoKHR createSafe(long address) {
        return address == NULL ? null : new VkDispatchIndirect2InfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkDispatchIndirect2InfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDispatchIndirect2InfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDispatchIndirect2InfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDispatchIndirect2InfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDispatchIndirect2InfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDispatchIndirect2InfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDispatchIndirect2InfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDispatchIndirect2InfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDispatchIndirect2InfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDispatchIndirect2InfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDispatchIndirect2InfoKHR malloc(MemoryStack stack) {
        return new VkDispatchIndirect2InfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDispatchIndirect2InfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDispatchIndirect2InfoKHR calloc(MemoryStack stack) {
        return new VkDispatchIndirect2InfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDispatchIndirect2InfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDispatchIndirect2InfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDispatchIndirect2InfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDispatchIndirect2InfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDispatchIndirect2InfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDispatchIndirect2InfoKHR.PNEXT); }
    /** Unsafe version of {@link #addressRange}. */
    public static VkDeviceAddressRangeKHR naddressRange(long struct) { return VkDeviceAddressRangeKHR.create(struct + VkDispatchIndirect2InfoKHR.ADDRESSRANGE); }
    /** Unsafe version of {@link #addressFlags}. */
    public static int naddressFlags(long struct) { return memGetInt(struct + VkDispatchIndirect2InfoKHR.ADDRESSFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDispatchIndirect2InfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDispatchIndirect2InfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #addressRange(VkDeviceAddressRangeKHR) addressRange}. */
    public static void naddressRange(long struct, VkDeviceAddressRangeKHR value) { memCopy(value.address(), struct + VkDispatchIndirect2InfoKHR.ADDRESSRANGE, VkDeviceAddressRangeKHR.SIZEOF); }
    /** Unsafe version of {@link #addressFlags(int) addressFlags}. */
    public static void naddressFlags(long struct, int value) { memPutInt(struct + VkDispatchIndirect2InfoKHR.ADDRESSFLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkDispatchIndirect2InfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkDispatchIndirect2InfoKHR, Buffer> implements NativeResource {

        private static final VkDispatchIndirect2InfoKHR ELEMENT_FACTORY = VkDispatchIndirect2InfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDispatchIndirect2InfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDispatchIndirect2InfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDispatchIndirect2InfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDispatchIndirect2InfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDispatchIndirect2InfoKHR.npNext(address()); }
        /** @return a {@link VkDeviceAddressRangeKHR} view of the {@code addressRange} field. */
        public VkDeviceAddressRangeKHR addressRange() { return VkDispatchIndirect2InfoKHR.naddressRange(address()); }
        /** @return the value of the {@code addressFlags} field. */
        @NativeType("VkAddressCommandFlagsKHR")
        public int addressFlags() { return VkDispatchIndirect2InfoKHR.naddressFlags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDispatchIndirect2InfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDispatchIndirect2InfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRDeviceAddressCommands#VK_STRUCTURE_TYPE_DISPATCH_INDIRECT_2_INFO_KHR STRUCTURE_TYPE_DISPATCH_INDIRECT_2_INFO_KHR} value to the {@code sType} field. */
        public VkDispatchIndirect2InfoKHR.Buffer sType$Default() { return sType(KHRDeviceAddressCommands.VK_STRUCTURE_TYPE_DISPATCH_INDIRECT_2_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDispatchIndirect2InfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkDispatchIndirect2InfoKHR.npNext(address(), value); return this; }
        /** Copies the specified {@link VkDeviceAddressRangeKHR} to the {@code addressRange} field. */
        public VkDispatchIndirect2InfoKHR.Buffer addressRange(VkDeviceAddressRangeKHR value) { VkDispatchIndirect2InfoKHR.naddressRange(address(), value); return this; }
        /** Passes the {@code addressRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDispatchIndirect2InfoKHR.Buffer addressRange(java.util.function.Consumer<VkDeviceAddressRangeKHR> consumer) { consumer.accept(addressRange()); return this; }
        /** Sets the specified value to the {@code addressFlags} field. */
        public VkDispatchIndirect2InfoKHR.Buffer addressFlags(@NativeType("VkAddressCommandFlagsKHR") int value) { VkDispatchIndirect2InfoKHR.naddressFlags(address(), value); return this; }

    }

}
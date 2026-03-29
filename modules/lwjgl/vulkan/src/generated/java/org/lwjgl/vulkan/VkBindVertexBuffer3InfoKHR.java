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
 * struct VkBindVertexBuffer3InfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 setStride;
 *     {@link VkStridedDeviceAddressRangeKHR VkStridedDeviceAddressRangeKHR} addressRange;
 *     VkAddressCommandFlagsKHR addressFlags;
 * }</code></pre>
 */
public class VkBindVertexBuffer3InfoKHR extends Struct<VkBindVertexBuffer3InfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SETSTRIDE,
        ADDRESSRANGE,
        ADDRESSFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkStridedDeviceAddressRangeKHR.SIZEOF, VkStridedDeviceAddressRangeKHR.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SETSTRIDE = layout.offsetof(2);
        ADDRESSRANGE = layout.offsetof(3);
        ADDRESSFLAGS = layout.offsetof(4);
    }

    protected VkBindVertexBuffer3InfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBindVertexBuffer3InfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkBindVertexBuffer3InfoKHR(address, container);
    }

    /**
     * Creates a {@code VkBindVertexBuffer3InfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindVertexBuffer3InfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code setStride} field. */
    @NativeType("VkBool32")
    public boolean setStride() { return nsetStride(address()) != 0; }
    /** @return a {@link VkStridedDeviceAddressRangeKHR} view of the {@code addressRange} field. */
    public VkStridedDeviceAddressRangeKHR addressRange() { return naddressRange(address()); }
    /** @return the value of the {@code addressFlags} field. */
    @NativeType("VkAddressCommandFlagsKHR")
    public int addressFlags() { return naddressFlags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindVertexBuffer3InfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDeviceAddressCommands#VK_STRUCTURE_TYPE_BIND_VERTEX_BUFFER_3_INFO_KHR STRUCTURE_TYPE_BIND_VERTEX_BUFFER_3_INFO_KHR} value to the {@code sType} field. */
    public VkBindVertexBuffer3InfoKHR sType$Default() { return sType(KHRDeviceAddressCommands.VK_STRUCTURE_TYPE_BIND_VERTEX_BUFFER_3_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindVertexBuffer3InfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code setStride} field. */
    public VkBindVertexBuffer3InfoKHR setStride(@NativeType("VkBool32") boolean value) { nsetStride(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link VkStridedDeviceAddressRangeKHR} to the {@code addressRange} field. */
    public VkBindVertexBuffer3InfoKHR addressRange(VkStridedDeviceAddressRangeKHR value) { naddressRange(address(), value); return this; }
    /** Passes the {@code addressRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkBindVertexBuffer3InfoKHR addressRange(java.util.function.Consumer<VkStridedDeviceAddressRangeKHR> consumer) { consumer.accept(addressRange()); return this; }
    /** Sets the specified value to the {@code addressFlags} field. */
    public VkBindVertexBuffer3InfoKHR addressFlags(@NativeType("VkAddressCommandFlagsKHR") int value) { naddressFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindVertexBuffer3InfoKHR set(
        int sType,
        long pNext,
        boolean setStride,
        VkStridedDeviceAddressRangeKHR addressRange,
        int addressFlags
    ) {
        sType(sType);
        pNext(pNext);
        setStride(setStride);
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
    public VkBindVertexBuffer3InfoKHR set(VkBindVertexBuffer3InfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindVertexBuffer3InfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindVertexBuffer3InfoKHR malloc() {
        return new VkBindVertexBuffer3InfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBindVertexBuffer3InfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindVertexBuffer3InfoKHR calloc() {
        return new VkBindVertexBuffer3InfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBindVertexBuffer3InfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkBindVertexBuffer3InfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindVertexBuffer3InfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkBindVertexBuffer3InfoKHR} instance for the specified memory address. */
    public static VkBindVertexBuffer3InfoKHR create(long address) {
        return new VkBindVertexBuffer3InfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBindVertexBuffer3InfoKHR createSafe(long address) {
        return address == NULL ? null : new VkBindVertexBuffer3InfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkBindVertexBuffer3InfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindVertexBuffer3InfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindVertexBuffer3InfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindVertexBuffer3InfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindVertexBuffer3InfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindVertexBuffer3InfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBindVertexBuffer3InfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindVertexBuffer3InfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBindVertexBuffer3InfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBindVertexBuffer3InfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindVertexBuffer3InfoKHR malloc(MemoryStack stack) {
        return new VkBindVertexBuffer3InfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBindVertexBuffer3InfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindVertexBuffer3InfoKHR calloc(MemoryStack stack) {
        return new VkBindVertexBuffer3InfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBindVertexBuffer3InfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindVertexBuffer3InfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindVertexBuffer3InfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindVertexBuffer3InfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBindVertexBuffer3InfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindVertexBuffer3InfoKHR.PNEXT); }
    /** Unsafe version of {@link #setStride}. */
    public static int nsetStride(long struct) { return memGetInt(struct + VkBindVertexBuffer3InfoKHR.SETSTRIDE); }
    /** Unsafe version of {@link #addressRange}. */
    public static VkStridedDeviceAddressRangeKHR naddressRange(long struct) { return VkStridedDeviceAddressRangeKHR.create(struct + VkBindVertexBuffer3InfoKHR.ADDRESSRANGE); }
    /** Unsafe version of {@link #addressFlags}. */
    public static int naddressFlags(long struct) { return memGetInt(struct + VkBindVertexBuffer3InfoKHR.ADDRESSFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBindVertexBuffer3InfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindVertexBuffer3InfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #setStride(boolean) setStride}. */
    public static void nsetStride(long struct, int value) { memPutInt(struct + VkBindVertexBuffer3InfoKHR.SETSTRIDE, value); }
    /** Unsafe version of {@link #addressRange(VkStridedDeviceAddressRangeKHR) addressRange}. */
    public static void naddressRange(long struct, VkStridedDeviceAddressRangeKHR value) { memCopy(value.address(), struct + VkBindVertexBuffer3InfoKHR.ADDRESSRANGE, VkStridedDeviceAddressRangeKHR.SIZEOF); }
    /** Unsafe version of {@link #addressFlags(int) addressFlags}. */
    public static void naddressFlags(long struct, int value) { memPutInt(struct + VkBindVertexBuffer3InfoKHR.ADDRESSFLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkBindVertexBuffer3InfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkBindVertexBuffer3InfoKHR, Buffer> implements NativeResource {

        private static final VkBindVertexBuffer3InfoKHR ELEMENT_FACTORY = VkBindVertexBuffer3InfoKHR.create(-1L);

        /**
         * Creates a new {@code VkBindVertexBuffer3InfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindVertexBuffer3InfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBindVertexBuffer3InfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindVertexBuffer3InfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindVertexBuffer3InfoKHR.npNext(address()); }
        /** @return the value of the {@code setStride} field. */
        @NativeType("VkBool32")
        public boolean setStride() { return VkBindVertexBuffer3InfoKHR.nsetStride(address()) != 0; }
        /** @return a {@link VkStridedDeviceAddressRangeKHR} view of the {@code addressRange} field. */
        public VkStridedDeviceAddressRangeKHR addressRange() { return VkBindVertexBuffer3InfoKHR.naddressRange(address()); }
        /** @return the value of the {@code addressFlags} field. */
        @NativeType("VkAddressCommandFlagsKHR")
        public int addressFlags() { return VkBindVertexBuffer3InfoKHR.naddressFlags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindVertexBuffer3InfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBindVertexBuffer3InfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRDeviceAddressCommands#VK_STRUCTURE_TYPE_BIND_VERTEX_BUFFER_3_INFO_KHR STRUCTURE_TYPE_BIND_VERTEX_BUFFER_3_INFO_KHR} value to the {@code sType} field. */
        public VkBindVertexBuffer3InfoKHR.Buffer sType$Default() { return sType(KHRDeviceAddressCommands.VK_STRUCTURE_TYPE_BIND_VERTEX_BUFFER_3_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindVertexBuffer3InfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkBindVertexBuffer3InfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code setStride} field. */
        public VkBindVertexBuffer3InfoKHR.Buffer setStride(@NativeType("VkBool32") boolean value) { VkBindVertexBuffer3InfoKHR.nsetStride(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link VkStridedDeviceAddressRangeKHR} to the {@code addressRange} field. */
        public VkBindVertexBuffer3InfoKHR.Buffer addressRange(VkStridedDeviceAddressRangeKHR value) { VkBindVertexBuffer3InfoKHR.naddressRange(address(), value); return this; }
        /** Passes the {@code addressRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkBindVertexBuffer3InfoKHR.Buffer addressRange(java.util.function.Consumer<VkStridedDeviceAddressRangeKHR> consumer) { consumer.accept(addressRange()); return this; }
        /** Sets the specified value to the {@code addressFlags} field. */
        public VkBindVertexBuffer3InfoKHR.Buffer addressFlags(@NativeType("VkAddressCommandFlagsKHR") int value) { VkBindVertexBuffer3InfoKHR.naddressFlags(address(), value); return this; }

    }

}
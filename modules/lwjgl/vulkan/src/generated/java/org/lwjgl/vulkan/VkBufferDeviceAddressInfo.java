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
 * <pre>{@code
 * struct VkBufferDeviceAddressInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBuffer buffer;
 * }}</pre>
 */
public class VkBufferDeviceAddressInfo extends Struct<VkBufferDeviceAddressInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        BUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BUFFER = layout.offsetof(2);
    }

    protected VkBufferDeviceAddressInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBufferDeviceAddressInfo create(long address, @Nullable ByteBuffer container) {
        return new VkBufferDeviceAddressInfo(address, container);
    }

    /**
     * Creates a {@code VkBufferDeviceAddressInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferDeviceAddressInfo(ByteBuffer container) {
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
    /** @return the value of the {@code buffer} field. */
    @NativeType("VkBuffer")
    public long buffer() { return nbuffer(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBufferDeviceAddressInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO} value to the {@code sType} field. */
    public VkBufferDeviceAddressInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBufferDeviceAddressInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code buffer} field. */
    public VkBufferDeviceAddressInfo buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBufferDeviceAddressInfo set(
        int sType,
        long pNext,
        long buffer
    ) {
        sType(sType);
        pNext(pNext);
        buffer(buffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBufferDeviceAddressInfo set(VkBufferDeviceAddressInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferDeviceAddressInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferDeviceAddressInfo malloc() {
        return new VkBufferDeviceAddressInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBufferDeviceAddressInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferDeviceAddressInfo calloc() {
        return new VkBufferDeviceAddressInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBufferDeviceAddressInfo} instance allocated with {@link BufferUtils}. */
    public static VkBufferDeviceAddressInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferDeviceAddressInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkBufferDeviceAddressInfo} instance for the specified memory address. */
    public static VkBufferDeviceAddressInfo create(long address) {
        return new VkBufferDeviceAddressInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBufferDeviceAddressInfo createSafe(long address) {
        return address == NULL ? null : new VkBufferDeviceAddressInfo(address, null);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBufferDeviceAddressInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBufferDeviceAddressInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBufferDeviceAddressInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferDeviceAddressInfo malloc(MemoryStack stack) {
        return new VkBufferDeviceAddressInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBufferDeviceAddressInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferDeviceAddressInfo calloc(MemoryStack stack) {
        return new VkBufferDeviceAddressInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBufferDeviceAddressInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBufferDeviceAddressInfo.PNEXT); }
    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return memGetLong(struct + VkBufferDeviceAddressInfo.BUFFER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBufferDeviceAddressInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBufferDeviceAddressInfo.PNEXT, value); }
    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { memPutLong(struct + VkBufferDeviceAddressInfo.BUFFER, value); }

    // -----------------------------------

    /** An array of {@link VkBufferDeviceAddressInfo} structs. */
    public static class Buffer extends StructBuffer<VkBufferDeviceAddressInfo, Buffer> implements NativeResource {

        private static final VkBufferDeviceAddressInfo ELEMENT_FACTORY = VkBufferDeviceAddressInfo.create(-1L);

        /**
         * Creates a new {@code VkBufferDeviceAddressInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferDeviceAddressInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBufferDeviceAddressInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBufferDeviceAddressInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBufferDeviceAddressInfo.npNext(address()); }
        /** @return the value of the {@code buffer} field. */
        @NativeType("VkBuffer")
        public long buffer() { return VkBufferDeviceAddressInfo.nbuffer(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBufferDeviceAddressInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkBufferDeviceAddressInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO} value to the {@code sType} field. */
        public VkBufferDeviceAddressInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBufferDeviceAddressInfo.Buffer pNext(@NativeType("void const *") long value) { VkBufferDeviceAddressInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code buffer} field. */
        public VkBufferDeviceAddressInfo.Buffer buffer(@NativeType("VkBuffer") long value) { VkBufferDeviceAddressInfo.nbuffer(address(), value); return this; }

    }

}
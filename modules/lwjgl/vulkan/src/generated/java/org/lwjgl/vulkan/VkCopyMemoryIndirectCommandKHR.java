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
 * struct VkCopyMemoryIndirectCommandKHR {
 *     VkDeviceAddress srcAddress;
 *     VkDeviceAddress dstAddress;
 *     VkDeviceSize size;
 * }}</pre>
 */
public class VkCopyMemoryIndirectCommandKHR extends Struct<VkCopyMemoryIndirectCommandKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SRCADDRESS,
        DSTADDRESS,
        SIZE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SRCADDRESS = layout.offsetof(0);
        DSTADDRESS = layout.offsetof(1);
        SIZE = layout.offsetof(2);
    }

    protected VkCopyMemoryIndirectCommandKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyMemoryIndirectCommandKHR create(long address, @Nullable ByteBuffer container) {
        return new VkCopyMemoryIndirectCommandKHR(address, container);
    }

    /**
     * Creates a {@code VkCopyMemoryIndirectCommandKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyMemoryIndirectCommandKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code srcAddress} field. */
    @NativeType("VkDeviceAddress")
    public long srcAddress() { return nsrcAddress(address()); }
    /** @return the value of the {@code dstAddress} field. */
    @NativeType("VkDeviceAddress")
    public long dstAddress() { return ndstAddress(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }

    /** Sets the specified value to the {@code srcAddress} field. */
    public VkCopyMemoryIndirectCommandKHR srcAddress(@NativeType("VkDeviceAddress") long value) { nsrcAddress(address(), value); return this; }
    /** Sets the specified value to the {@code dstAddress} field. */
    public VkCopyMemoryIndirectCommandKHR dstAddress(@NativeType("VkDeviceAddress") long value) { ndstAddress(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public VkCopyMemoryIndirectCommandKHR size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyMemoryIndirectCommandKHR set(
        long srcAddress,
        long dstAddress,
        long size
    ) {
        srcAddress(srcAddress);
        dstAddress(dstAddress);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCopyMemoryIndirectCommandKHR set(VkCopyMemoryIndirectCommandKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyMemoryIndirectCommandKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryIndirectCommandKHR malloc() {
        return new VkCopyMemoryIndirectCommandKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryIndirectCommandKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryIndirectCommandKHR calloc() {
        return new VkCopyMemoryIndirectCommandKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryIndirectCommandKHR} instance allocated with {@link BufferUtils}. */
    public static VkCopyMemoryIndirectCommandKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMemoryIndirectCommandKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyMemoryIndirectCommandKHR} instance for the specified memory address. */
    public static VkCopyMemoryIndirectCommandKHR create(long address) {
        return new VkCopyMemoryIndirectCommandKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyMemoryIndirectCommandKHR createSafe(long address) {
        return address == NULL ? null : new VkCopyMemoryIndirectCommandKHR(address, null);
    }

    /**
     * Returns a new {@link VkCopyMemoryIndirectCommandKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryIndirectCommandKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryIndirectCommandKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryIndirectCommandKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryIndirectCommandKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryIndirectCommandKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyMemoryIndirectCommandKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryIndirectCommandKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyMemoryIndirectCommandKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyMemoryIndirectCommandKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryIndirectCommandKHR malloc(MemoryStack stack) {
        return new VkCopyMemoryIndirectCommandKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyMemoryIndirectCommandKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryIndirectCommandKHR calloc(MemoryStack stack) {
        return new VkCopyMemoryIndirectCommandKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyMemoryIndirectCommandKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryIndirectCommandKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryIndirectCommandKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryIndirectCommandKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #srcAddress}. */
    public static long nsrcAddress(long struct) { return memGetLong(struct + VkCopyMemoryIndirectCommandKHR.SRCADDRESS); }
    /** Unsafe version of {@link #dstAddress}. */
    public static long ndstAddress(long struct) { return memGetLong(struct + VkCopyMemoryIndirectCommandKHR.DSTADDRESS); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkCopyMemoryIndirectCommandKHR.SIZE); }

    /** Unsafe version of {@link #srcAddress(long) srcAddress}. */
    public static void nsrcAddress(long struct, long value) { memPutLong(struct + VkCopyMemoryIndirectCommandKHR.SRCADDRESS, value); }
    /** Unsafe version of {@link #dstAddress(long) dstAddress}. */
    public static void ndstAddress(long struct, long value) { memPutLong(struct + VkCopyMemoryIndirectCommandKHR.DSTADDRESS, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutLong(struct + VkCopyMemoryIndirectCommandKHR.SIZE, value); }

    // -----------------------------------

    /** An array of {@link VkCopyMemoryIndirectCommandKHR} structs. */
    public static class Buffer extends StructBuffer<VkCopyMemoryIndirectCommandKHR, Buffer> implements NativeResource {

        private static final VkCopyMemoryIndirectCommandKHR ELEMENT_FACTORY = VkCopyMemoryIndirectCommandKHR.create(-1L);

        /**
         * Creates a new {@code VkCopyMemoryIndirectCommandKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyMemoryIndirectCommandKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyMemoryIndirectCommandKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code srcAddress} field. */
        @NativeType("VkDeviceAddress")
        public long srcAddress() { return VkCopyMemoryIndirectCommandKHR.nsrcAddress(address()); }
        /** @return the value of the {@code dstAddress} field. */
        @NativeType("VkDeviceAddress")
        public long dstAddress() { return VkCopyMemoryIndirectCommandKHR.ndstAddress(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkCopyMemoryIndirectCommandKHR.nsize(address()); }

        /** Sets the specified value to the {@code srcAddress} field. */
        public VkCopyMemoryIndirectCommandKHR.Buffer srcAddress(@NativeType("VkDeviceAddress") long value) { VkCopyMemoryIndirectCommandKHR.nsrcAddress(address(), value); return this; }
        /** Sets the specified value to the {@code dstAddress} field. */
        public VkCopyMemoryIndirectCommandKHR.Buffer dstAddress(@NativeType("VkDeviceAddress") long value) { VkCopyMemoryIndirectCommandKHR.ndstAddress(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public VkCopyMemoryIndirectCommandKHR.Buffer size(@NativeType("VkDeviceSize") long value) { VkCopyMemoryIndirectCommandKHR.nsize(address(), value); return this; }

    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying indirect memory region copy operation.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code srcAddress} <b>must</b> be 4 byte aligned</li>
 * <li>The {@code dstAddress} <b>must</b> be 4 byte aligned</li>
 * <li>The {@code size} <b>must</b> be 4 byte aligned</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCopyMemoryIndirectCommandNV {
 *     VkDeviceAddress {@link #srcAddress};
 *     VkDeviceAddress {@link #dstAddress};
 *     VkDeviceSize {@link #size};
 * }</code></pre>
 */
public class VkCopyMemoryIndirectCommandNV extends Struct<VkCopyMemoryIndirectCommandNV> implements NativeResource {

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

    protected VkCopyMemoryIndirectCommandNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyMemoryIndirectCommandNV create(long address, @Nullable ByteBuffer container) {
        return new VkCopyMemoryIndirectCommandNV(address, container);
    }

    /**
     * Creates a {@code VkCopyMemoryIndirectCommandNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyMemoryIndirectCommandNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the starting address of the source host or device memory to copy from. */
    @NativeType("VkDeviceAddress")
    public long srcAddress() { return nsrcAddress(address()); }
    /** the starting address of the destination host or device memory to copy to. */
    @NativeType("VkDeviceAddress")
    public long dstAddress() { return ndstAddress(address()); }
    /** the size of the copy in bytes. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }

    /** Sets the specified value to the {@link #srcAddress} field. */
    public VkCopyMemoryIndirectCommandNV srcAddress(@NativeType("VkDeviceAddress") long value) { nsrcAddress(address(), value); return this; }
    /** Sets the specified value to the {@link #dstAddress} field. */
    public VkCopyMemoryIndirectCommandNV dstAddress(@NativeType("VkDeviceAddress") long value) { ndstAddress(address(), value); return this; }
    /** Sets the specified value to the {@link #size} field. */
    public VkCopyMemoryIndirectCommandNV size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyMemoryIndirectCommandNV set(
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
    public VkCopyMemoryIndirectCommandNV set(VkCopyMemoryIndirectCommandNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyMemoryIndirectCommandNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryIndirectCommandNV malloc() {
        return new VkCopyMemoryIndirectCommandNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryIndirectCommandNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryIndirectCommandNV calloc() {
        return new VkCopyMemoryIndirectCommandNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryIndirectCommandNV} instance allocated with {@link BufferUtils}. */
    public static VkCopyMemoryIndirectCommandNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMemoryIndirectCommandNV(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyMemoryIndirectCommandNV} instance for the specified memory address. */
    public static VkCopyMemoryIndirectCommandNV create(long address) {
        return new VkCopyMemoryIndirectCommandNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyMemoryIndirectCommandNV createSafe(long address) {
        return address == NULL ? null : new VkCopyMemoryIndirectCommandNV(address, null);
    }

    /**
     * Returns a new {@link VkCopyMemoryIndirectCommandNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryIndirectCommandNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryIndirectCommandNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryIndirectCommandNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryIndirectCommandNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryIndirectCommandNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyMemoryIndirectCommandNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryIndirectCommandNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyMemoryIndirectCommandNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyMemoryIndirectCommandNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryIndirectCommandNV malloc(MemoryStack stack) {
        return new VkCopyMemoryIndirectCommandNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyMemoryIndirectCommandNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryIndirectCommandNV calloc(MemoryStack stack) {
        return new VkCopyMemoryIndirectCommandNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyMemoryIndirectCommandNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryIndirectCommandNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryIndirectCommandNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryIndirectCommandNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #srcAddress}. */
    public static long nsrcAddress(long struct) { return UNSAFE.getLong(null, struct + VkCopyMemoryIndirectCommandNV.SRCADDRESS); }
    /** Unsafe version of {@link #dstAddress}. */
    public static long ndstAddress(long struct) { return UNSAFE.getLong(null, struct + VkCopyMemoryIndirectCommandNV.DSTADDRESS); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return UNSAFE.getLong(null, struct + VkCopyMemoryIndirectCommandNV.SIZE); }

    /** Unsafe version of {@link #srcAddress(long) srcAddress}. */
    public static void nsrcAddress(long struct, long value) { UNSAFE.putLong(null, struct + VkCopyMemoryIndirectCommandNV.SRCADDRESS, value); }
    /** Unsafe version of {@link #dstAddress(long) dstAddress}. */
    public static void ndstAddress(long struct, long value) { UNSAFE.putLong(null, struct + VkCopyMemoryIndirectCommandNV.DSTADDRESS, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { UNSAFE.putLong(null, struct + VkCopyMemoryIndirectCommandNV.SIZE, value); }

    // -----------------------------------

    /** An array of {@link VkCopyMemoryIndirectCommandNV} structs. */
    public static class Buffer extends StructBuffer<VkCopyMemoryIndirectCommandNV, Buffer> implements NativeResource {

        private static final VkCopyMemoryIndirectCommandNV ELEMENT_FACTORY = VkCopyMemoryIndirectCommandNV.create(-1L);

        /**
         * Creates a new {@code VkCopyMemoryIndirectCommandNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyMemoryIndirectCommandNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyMemoryIndirectCommandNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCopyMemoryIndirectCommandNV#srcAddress} field. */
        @NativeType("VkDeviceAddress")
        public long srcAddress() { return VkCopyMemoryIndirectCommandNV.nsrcAddress(address()); }
        /** @return the value of the {@link VkCopyMemoryIndirectCommandNV#dstAddress} field. */
        @NativeType("VkDeviceAddress")
        public long dstAddress() { return VkCopyMemoryIndirectCommandNV.ndstAddress(address()); }
        /** @return the value of the {@link VkCopyMemoryIndirectCommandNV#size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkCopyMemoryIndirectCommandNV.nsize(address()); }

        /** Sets the specified value to the {@link VkCopyMemoryIndirectCommandNV#srcAddress} field. */
        public VkCopyMemoryIndirectCommandNV.Buffer srcAddress(@NativeType("VkDeviceAddress") long value) { VkCopyMemoryIndirectCommandNV.nsrcAddress(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyMemoryIndirectCommandNV#dstAddress} field. */
        public VkCopyMemoryIndirectCommandNV.Buffer dstAddress(@NativeType("VkDeviceAddress") long value) { VkCopyMemoryIndirectCommandNV.ndstAddress(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyMemoryIndirectCommandNV#size} field. */
        public VkCopyMemoryIndirectCommandNV.Buffer size(@NativeType("VkDeviceSize") long value) { VkCopyMemoryIndirectCommandNV.nsize(address(), value); return this; }

    }

}
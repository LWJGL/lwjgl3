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
 * Structure specifying a buffer copy operation.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code size} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkCmdCopyBuffer CmdCopyBuffer}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBufferCopy {
 *     VkDeviceSize {@link #srcOffset};
 *     VkDeviceSize {@link #dstOffset};
 *     VkDeviceSize {@link #size};
 * }</code></pre>
 */
public class VkBufferCopy extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SRCOFFSET,
        DSTOFFSET,
        SIZE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SRCOFFSET = layout.offsetof(0);
        DSTOFFSET = layout.offsetof(1);
        SIZE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkBufferCopy} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferCopy(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the starting offset in bytes from the start of {@code srcBuffer}. */
    @NativeType("VkDeviceSize")
    public long srcOffset() { return nsrcOffset(address()); }
    /** the starting offset in bytes from the start of {@code dstBuffer}. */
    @NativeType("VkDeviceSize")
    public long dstOffset() { return ndstOffset(address()); }
    /** the number of bytes to copy. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }

    /** Sets the specified value to the {@link #srcOffset} field. */
    public VkBufferCopy srcOffset(@NativeType("VkDeviceSize") long value) { nsrcOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #dstOffset} field. */
    public VkBufferCopy dstOffset(@NativeType("VkDeviceSize") long value) { ndstOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #size} field. */
    public VkBufferCopy size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBufferCopy set(
        long srcOffset,
        long dstOffset,
        long size
    ) {
        srcOffset(srcOffset);
        dstOffset(dstOffset);
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
    public VkBufferCopy set(VkBufferCopy src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferCopy} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferCopy malloc() {
        return wrap(VkBufferCopy.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBufferCopy} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferCopy calloc() {
        return wrap(VkBufferCopy.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBufferCopy} instance allocated with {@link BufferUtils}. */
    public static VkBufferCopy create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBufferCopy.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBufferCopy} instance for the specified memory address. */
    public static VkBufferCopy create(long address) {
        return wrap(VkBufferCopy.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferCopy createSafe(long address) {
        return address == NULL ? null : wrap(VkBufferCopy.class, address);
    }

    /**
     * Returns a new {@link VkBufferCopy.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBufferCopy.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferCopy.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBufferCopy.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferCopy.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferCopy mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferCopy callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferCopy mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferCopy callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferCopy.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferCopy.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferCopy.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferCopy.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkBufferCopy} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferCopy malloc(MemoryStack stack) {
        return wrap(VkBufferCopy.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBufferCopy} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferCopy calloc(MemoryStack stack) {
        return wrap(VkBufferCopy.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBufferCopy.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferCopy.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferCopy.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #srcOffset}. */
    public static long nsrcOffset(long struct) { return UNSAFE.getLong(null, struct + VkBufferCopy.SRCOFFSET); }
    /** Unsafe version of {@link #dstOffset}. */
    public static long ndstOffset(long struct) { return UNSAFE.getLong(null, struct + VkBufferCopy.DSTOFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return UNSAFE.getLong(null, struct + VkBufferCopy.SIZE); }

    /** Unsafe version of {@link #srcOffset(long) srcOffset}. */
    public static void nsrcOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferCopy.SRCOFFSET, value); }
    /** Unsafe version of {@link #dstOffset(long) dstOffset}. */
    public static void ndstOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferCopy.DSTOFFSET, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferCopy.SIZE, value); }

    // -----------------------------------

    /** An array of {@link VkBufferCopy} structs. */
    public static class Buffer extends StructBuffer<VkBufferCopy, Buffer> implements NativeResource {

        private static final VkBufferCopy ELEMENT_FACTORY = VkBufferCopy.create(-1L);

        /**
         * Creates a new {@code VkBufferCopy.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferCopy#SIZEOF}, and its mark will be undefined.
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
        protected VkBufferCopy getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkBufferCopy#srcOffset} field. */
        @NativeType("VkDeviceSize")
        public long srcOffset() { return VkBufferCopy.nsrcOffset(address()); }
        /** @return the value of the {@link VkBufferCopy#dstOffset} field. */
        @NativeType("VkDeviceSize")
        public long dstOffset() { return VkBufferCopy.ndstOffset(address()); }
        /** @return the value of the {@link VkBufferCopy#size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkBufferCopy.nsize(address()); }

        /** Sets the specified value to the {@link VkBufferCopy#srcOffset} field. */
        public VkBufferCopy.Buffer srcOffset(@NativeType("VkDeviceSize") long value) { VkBufferCopy.nsrcOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferCopy#dstOffset} field. */
        public VkBufferCopy.Buffer dstOffset(@NativeType("VkDeviceSize") long value) { VkBufferCopy.ndstOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferCopy#size} field. */
        public VkBufferCopy.Buffer size(@NativeType("VkDeviceSize") long value) { VkBufferCopy.nsize(address(), value); return this; }

    }

}
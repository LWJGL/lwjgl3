/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux.liburing;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct io_uring_buf_status {
 *     __u32 buf_group;
 *     __u32 head;
 *     __u32 resv[8];
 * }}</pre>
 */
@NativeType("struct io_uring_buf_status")
public class IOURingBufStatus extends Struct<IOURingBufStatus> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BUF_GROUP,
        HEAD,
        RESV;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __array(4, 8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BUF_GROUP = layout.offsetof(0);
        HEAD = layout.offsetof(1);
        RESV = layout.offsetof(2);
    }

    protected IOURingBufStatus(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingBufStatus create(long address, @Nullable ByteBuffer container) {
        return new IOURingBufStatus(address, container);
    }

    /**
     * Creates a {@code IOURingBufStatus} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingBufStatus(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code buf_group} field. */
    @NativeType("__u32")
    public int buf_group() { return nbuf_group(address()); }
    /** @return the value of the {@code head} field. */
    @NativeType("__u32")
    public int head() { return nhead(address()); }

    /** Sets the specified value to the {@code buf_group} field. */
    public IOURingBufStatus buf_group(@NativeType("__u32") int value) { nbuf_group(address(), value); return this; }
    /** Sets the specified value to the {@code head} field. */
    public IOURingBufStatus head(@NativeType("__u32") int value) { nhead(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingBufStatus set(
        int buf_group,
        int head
    ) {
        buf_group(buf_group);
        head(head);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingBufStatus set(IOURingBufStatus src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingBufStatus} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingBufStatus malloc() {
        return new IOURingBufStatus(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingBufStatus} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingBufStatus calloc() {
        return new IOURingBufStatus(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingBufStatus} instance allocated with {@link BufferUtils}. */
    public static IOURingBufStatus create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingBufStatus(memAddress(container), container);
    }

    /** Returns a new {@code IOURingBufStatus} instance for the specified memory address. */
    public static IOURingBufStatus create(long address) {
        return new IOURingBufStatus(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingBufStatus createSafe(long address) {
        return address == NULL ? null : new IOURingBufStatus(address, null);
    }

    /**
     * Returns a new {@link IOURingBufStatus.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingBufStatus.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingBufStatus.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingBufStatus.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingBufStatus.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingBufStatus.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingBufStatus.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingBufStatus.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingBufStatus.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingBufStatus} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingBufStatus malloc(MemoryStack stack) {
        return new IOURingBufStatus(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingBufStatus} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingBufStatus calloc(MemoryStack stack) {
        return new IOURingBufStatus(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingBufStatus.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingBufStatus.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingBufStatus.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingBufStatus.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #buf_group}. */
    public static int nbuf_group(long struct) { return memGetInt(struct + IOURingBufStatus.BUF_GROUP); }
    /** Unsafe version of {@link #head}. */
    public static int nhead(long struct) { return memGetInt(struct + IOURingBufStatus.HEAD); }
    public static IntBuffer nresv(long struct) { return memIntBuffer(struct + IOURingBufStatus.RESV, 8); }
    public static int nresv(long struct, int index) {
        return memGetInt(struct + IOURingBufStatus.RESV + check(index, 8) * 4);
    }

    /** Unsafe version of {@link #buf_group(int) buf_group}. */
    public static void nbuf_group(long struct, int value) { memPutInt(struct + IOURingBufStatus.BUF_GROUP, value); }
    /** Unsafe version of {@link #head(int) head}. */
    public static void nhead(long struct, int value) { memPutInt(struct + IOURingBufStatus.HEAD, value); }
    public static void nresv(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 8); }
        memCopy(memAddress(value), struct + IOURingBufStatus.RESV, value.remaining() * 4);
    }
    public static void nresv(long struct, int index, int value) {
        memPutInt(struct + IOURingBufStatus.RESV + check(index, 8) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link IOURingBufStatus} structs. */
    public static class Buffer extends StructBuffer<IOURingBufStatus, Buffer> implements NativeResource {

        private static final IOURingBufStatus ELEMENT_FACTORY = IOURingBufStatus.create(-1L);

        /**
         * Creates a new {@code IOURingBufStatus.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingBufStatus#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingBufStatus getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code buf_group} field. */
        @NativeType("__u32")
        public int buf_group() { return IOURingBufStatus.nbuf_group(address()); }
        /** @return the value of the {@code head} field. */
        @NativeType("__u32")
        public int head() { return IOURingBufStatus.nhead(address()); }

        /** Sets the specified value to the {@code buf_group} field. */
        public IOURingBufStatus.Buffer buf_group(@NativeType("__u32") int value) { IOURingBufStatus.nbuf_group(address(), value); return this; }
        /** Sets the specified value to the {@code head} field. */
        public IOURingBufStatus.Buffer head(@NativeType("__u32") int value) { IOURingBufStatus.nhead(address(), value); return this; }

    }

}
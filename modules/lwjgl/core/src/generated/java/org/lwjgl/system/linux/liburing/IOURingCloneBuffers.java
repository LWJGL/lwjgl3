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
 * struct io_uring_clone_buffers {
 *     __u32 src_fd;
 *     __u32 flags;
 *     __u32 src_off;
 *     __u32 dst_off;
 *     __u32 nr;
 *     __u32 pad[3];
 * }}</pre>
 */
@NativeType("struct io_uring_clone_buffers")
public class IOURingCloneBuffers extends Struct<IOURingCloneBuffers> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SRC_FD,
        FLAGS,
        SRC_OFF,
        DST_OFF,
        NR,
        PAD;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(4, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SRC_FD = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        SRC_OFF = layout.offsetof(2);
        DST_OFF = layout.offsetof(3);
        NR = layout.offsetof(4);
        PAD = layout.offsetof(5);
    }

    protected IOURingCloneBuffers(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingCloneBuffers create(long address, @Nullable ByteBuffer container) {
        return new IOURingCloneBuffers(address, container);
    }

    /**
     * Creates a {@code IOURingCloneBuffers} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingCloneBuffers(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code src_fd} field. */
    @NativeType("__u32")
    public int src_fd() { return nsrc_fd(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("__u32")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code src_off} field. */
    @NativeType("__u32")
    public int src_off() { return nsrc_off(address()); }
    /** @return the value of the {@code dst_off} field. */
    @NativeType("__u32")
    public int dst_off() { return ndst_off(address()); }
    /** @return the value of the {@code nr} field. */
    @NativeType("__u32")
    public int nr() { return nnr(address()); }

    /** Sets the specified value to the {@code src_fd} field. */
    public IOURingCloneBuffers src_fd(@NativeType("__u32") int value) { nsrc_fd(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public IOURingCloneBuffers flags(@NativeType("__u32") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code src_off} field. */
    public IOURingCloneBuffers src_off(@NativeType("__u32") int value) { nsrc_off(address(), value); return this; }
    /** Sets the specified value to the {@code dst_off} field. */
    public IOURingCloneBuffers dst_off(@NativeType("__u32") int value) { ndst_off(address(), value); return this; }
    /** Sets the specified value to the {@code nr} field. */
    public IOURingCloneBuffers nr(@NativeType("__u32") int value) { nnr(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingCloneBuffers set(
        int src_fd,
        int flags,
        int src_off,
        int dst_off,
        int nr
    ) {
        src_fd(src_fd);
        flags(flags);
        src_off(src_off);
        dst_off(dst_off);
        nr(nr);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingCloneBuffers set(IOURingCloneBuffers src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingCloneBuffers} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingCloneBuffers malloc() {
        return new IOURingCloneBuffers(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingCloneBuffers} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingCloneBuffers calloc() {
        return new IOURingCloneBuffers(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingCloneBuffers} instance allocated with {@link BufferUtils}. */
    public static IOURingCloneBuffers create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingCloneBuffers(memAddress(container), container);
    }

    /** Returns a new {@code IOURingCloneBuffers} instance for the specified memory address. */
    public static IOURingCloneBuffers create(long address) {
        return new IOURingCloneBuffers(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingCloneBuffers createSafe(long address) {
        return address == NULL ? null : new IOURingCloneBuffers(address, null);
    }

    /**
     * Returns a new {@link IOURingCloneBuffers.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingCloneBuffers.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingCloneBuffers.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingCloneBuffers.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingCloneBuffers.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingCloneBuffers.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingCloneBuffers.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingCloneBuffers.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingCloneBuffers.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingCloneBuffers} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingCloneBuffers malloc(MemoryStack stack) {
        return new IOURingCloneBuffers(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingCloneBuffers} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingCloneBuffers calloc(MemoryStack stack) {
        return new IOURingCloneBuffers(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingCloneBuffers.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingCloneBuffers.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingCloneBuffers.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingCloneBuffers.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #src_fd}. */
    public static int nsrc_fd(long struct) { return memGetInt(struct + IOURingCloneBuffers.SRC_FD); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + IOURingCloneBuffers.FLAGS); }
    /** Unsafe version of {@link #src_off}. */
    public static int nsrc_off(long struct) { return memGetInt(struct + IOURingCloneBuffers.SRC_OFF); }
    /** Unsafe version of {@link #dst_off}. */
    public static int ndst_off(long struct) { return memGetInt(struct + IOURingCloneBuffers.DST_OFF); }
    /** Unsafe version of {@link #nr}. */
    public static int nnr(long struct) { return memGetInt(struct + IOURingCloneBuffers.NR); }
    public static IntBuffer npad(long struct) { return memIntBuffer(struct + IOURingCloneBuffers.PAD, 3); }
    public static int npad(long struct, int index) {
        return memGetInt(struct + IOURingCloneBuffers.PAD + check(index, 3) * 4);
    }

    /** Unsafe version of {@link #src_fd(int) src_fd}. */
    public static void nsrc_fd(long struct, int value) { memPutInt(struct + IOURingCloneBuffers.SRC_FD, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + IOURingCloneBuffers.FLAGS, value); }
    /** Unsafe version of {@link #src_off(int) src_off}. */
    public static void nsrc_off(long struct, int value) { memPutInt(struct + IOURingCloneBuffers.SRC_OFF, value); }
    /** Unsafe version of {@link #dst_off(int) dst_off}. */
    public static void ndst_off(long struct, int value) { memPutInt(struct + IOURingCloneBuffers.DST_OFF, value); }
    /** Unsafe version of {@link #nr(int) nr}. */
    public static void nnr(long struct, int value) { memPutInt(struct + IOURingCloneBuffers.NR, value); }
    public static void npad(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + IOURingCloneBuffers.PAD, value.remaining() * 4);
    }
    public static void npad(long struct, int index, int value) {
        memPutInt(struct + IOURingCloneBuffers.PAD + check(index, 3) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link IOURingCloneBuffers} structs. */
    public static class Buffer extends StructBuffer<IOURingCloneBuffers, Buffer> implements NativeResource {

        private static final IOURingCloneBuffers ELEMENT_FACTORY = IOURingCloneBuffers.create(-1L);

        /**
         * Creates a new {@code IOURingCloneBuffers.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingCloneBuffers#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingCloneBuffers getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code src_fd} field. */
        @NativeType("__u32")
        public int src_fd() { return IOURingCloneBuffers.nsrc_fd(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("__u32")
        public int flags() { return IOURingCloneBuffers.nflags(address()); }
        /** @return the value of the {@code src_off} field. */
        @NativeType("__u32")
        public int src_off() { return IOURingCloneBuffers.nsrc_off(address()); }
        /** @return the value of the {@code dst_off} field. */
        @NativeType("__u32")
        public int dst_off() { return IOURingCloneBuffers.ndst_off(address()); }
        /** @return the value of the {@code nr} field. */
        @NativeType("__u32")
        public int nr() { return IOURingCloneBuffers.nnr(address()); }

        /** Sets the specified value to the {@code src_fd} field. */
        public IOURingCloneBuffers.Buffer src_fd(@NativeType("__u32") int value) { IOURingCloneBuffers.nsrc_fd(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public IOURingCloneBuffers.Buffer flags(@NativeType("__u32") int value) { IOURingCloneBuffers.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code src_off} field. */
        public IOURingCloneBuffers.Buffer src_off(@NativeType("__u32") int value) { IOURingCloneBuffers.nsrc_off(address(), value); return this; }
        /** Sets the specified value to the {@code dst_off} field. */
        public IOURingCloneBuffers.Buffer dst_off(@NativeType("__u32") int value) { IOURingCloneBuffers.ndst_off(address(), value); return this; }
        /** Sets the specified value to the {@code nr} field. */
        public IOURingCloneBuffers.Buffer nr(@NativeType("__u32") int value) { IOURingCloneBuffers.nnr(address(), value); return this; }

    }

}
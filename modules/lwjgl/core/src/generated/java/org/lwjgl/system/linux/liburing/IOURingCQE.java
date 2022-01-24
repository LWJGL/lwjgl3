/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux.liburing;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * IO completion data structure (Completion Queue Entry).
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct io_uring_cqe {
 *     __u64 {@link #user_data};
 *     __s32 {@link #res};
 *     __u32 {@link #flags};
 * }</code></pre>
 */
@NativeType("struct io_uring_cqe")
public class IOURingCQE extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        USER_DATA,
        RES,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        USER_DATA = layout.offsetof(0);
        RES = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    /**
     * Creates a {@code IOURingCQE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingCQE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * is copied from the field of the same name in the submission queue entry.
     * 
     * <p>The primary use case is to store data that the application will need to access upon completion of this particular I/O.</p>
     */
    @NativeType("__u64")
    public long user_data() { return nuser_data(address()); }
    /**
     * is the operation-specific result, but {@code io_uring}-specific errors (e.g. {@code flags} or {@code opcode} invalid) are returned through this field.
     * 
     * <p>For read and write {@code opcodes}, the return values match {@code errno} values documented in the {@code preadv2(2)} and {@code pwritev2(2)} man
     * pages, with {@code res} holding the equivalent of {@code -errno} for error cases, or the transferred number of bytes in case the operation is
     * successful. Hence both error and success return can be found in that field in the CQE. For other request types, the return values are documented in the
     * matching man page for that type, or in the {@code opcodes} section for {@code io_uring}-specific {@code opcodes}.</p>
     */
    @NativeType("__s32")
    public int res() { return nres(address()); }
    /** is used for certain commands, like {@link LibIOURing#IORING_OP_POLL_ADD OP_POLL_ADD} or in conjunction with {@link LibIOURing#IOSQE_BUFFER_SELECT}, see those entries */
    @NativeType("__u32")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #user_data} field. */
    public IOURingCQE user_data(@NativeType("__u64") long value) { nuser_data(address(), value); return this; }
    /** Sets the specified value to the {@link #res} field. */
    public IOURingCQE res(@NativeType("__s32") int value) { nres(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public IOURingCQE flags(@NativeType("__u32") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingCQE set(
        long user_data,
        int res,
        int flags
    ) {
        user_data(user_data);
        res(res);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingCQE set(IOURingCQE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingCQE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingCQE malloc() {
        return wrap(IOURingCQE.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code IOURingCQE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingCQE calloc() {
        return wrap(IOURingCQE.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code IOURingCQE} instance allocated with {@link BufferUtils}. */
    public static IOURingCQE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(IOURingCQE.class, memAddress(container), container);
    }

    /** Returns a new {@code IOURingCQE} instance for the specified memory address. */
    public static IOURingCQE create(long address) {
        return wrap(IOURingCQE.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingCQE createSafe(long address) {
        return address == NULL ? null : wrap(IOURingCQE.class, address);
    }

    /**
     * Returns a new {@link IOURingCQE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingCQE.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingCQE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingCQE.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingCQE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingCQE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link IOURingCQE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingCQE.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingCQE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code IOURingCQE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingCQE malloc(MemoryStack stack) {
        return wrap(IOURingCQE.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code IOURingCQE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingCQE calloc(MemoryStack stack) {
        return wrap(IOURingCQE.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link IOURingCQE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingCQE.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingCQE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingCQE.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #user_data}. */
    public static long nuser_data(long struct) { return UNSAFE.getLong(null, struct + IOURingCQE.USER_DATA); }
    /** Unsafe version of {@link #res}. */
    public static int nres(long struct) { return UNSAFE.getInt(null, struct + IOURingCQE.RES); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + IOURingCQE.FLAGS); }

    /** Unsafe version of {@link #user_data(long) user_data}. */
    public static void nuser_data(long struct, long value) { UNSAFE.putLong(null, struct + IOURingCQE.USER_DATA, value); }
    /** Unsafe version of {@link #res(int) res}. */
    public static void nres(long struct, int value) { UNSAFE.putInt(null, struct + IOURingCQE.RES, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + IOURingCQE.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link IOURingCQE} structs. */
    public static class Buffer extends StructBuffer<IOURingCQE, Buffer> implements NativeResource {

        private static final IOURingCQE ELEMENT_FACTORY = IOURingCQE.create(-1L);

        /**
         * Creates a new {@code IOURingCQE.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingCQE#SIZEOF}, and its mark will be undefined.
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
        protected IOURingCQE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link IOURingCQE#user_data} field. */
        @NativeType("__u64")
        public long user_data() { return IOURingCQE.nuser_data(address()); }
        /** @return the value of the {@link IOURingCQE#res} field. */
        @NativeType("__s32")
        public int res() { return IOURingCQE.nres(address()); }
        /** @return the value of the {@link IOURingCQE#flags} field. */
        @NativeType("__u32")
        public int flags() { return IOURingCQE.nflags(address()); }

        /** Sets the specified value to the {@link IOURingCQE#user_data} field. */
        public IOURingCQE.Buffer user_data(@NativeType("__u64") long value) { IOURingCQE.nuser_data(address(), value); return this; }
        /** Sets the specified value to the {@link IOURingCQE#res} field. */
        public IOURingCQE.Buffer res(@NativeType("__s32") int value) { IOURingCQE.nres(address(), value); return this; }
        /** Sets the specified value to the {@link IOURingCQE#flags} field. */
        public IOURingCQE.Buffer flags(@NativeType("__u32") int value) { IOURingCQE.nflags(address(), value); return this; }

    }

}
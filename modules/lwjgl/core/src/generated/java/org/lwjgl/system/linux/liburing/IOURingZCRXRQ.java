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
 * struct io_uring_zcrx_rq {
 *     __u32 * khead;
 *     __u32 * ktail;
 *     __u32 rq_tail;
 *     unsigned ring_entries;
 *     {@link IOURingZCRXRQE struct io_uring_zcrx_rqe} * rqes;
 *     void * ring_ptr;
 * }}</pre>
 */
@NativeType("struct io_uring_zcrx_rq")
public class IOURingZCRXRQ extends Struct<IOURingZCRXRQ> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        KHEAD,
        KTAIL,
        RQ_TAIL,
        RING_ENTRIES,
        RQES,
        RING_PTR;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        KHEAD = layout.offsetof(0);
        KTAIL = layout.offsetof(1);
        RQ_TAIL = layout.offsetof(2);
        RING_ENTRIES = layout.offsetof(3);
        RQES = layout.offsetof(4);
        RING_PTR = layout.offsetof(5);
    }

    protected IOURingZCRXRQ(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingZCRXRQ create(long address, @Nullable ByteBuffer container) {
        return new IOURingZCRXRQ(address, container);
    }

    /**
     * Creates a {@code IOURingZCRXRQ} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingZCRXRQ(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link IntBuffer} view of the data pointed to by the {@code khead} field. */
    @NativeType("__u32 *")
    public IntBuffer khead(int capacity) { return nkhead(address(), capacity); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code ktail} field. */
    @NativeType("__u32 *")
    public IntBuffer ktail(int capacity) { return nktail(address(), capacity); }
    /** @return the value of the {@code rq_tail} field. */
    @NativeType("__u32")
    public int rq_tail() { return nrq_tail(address()); }
    /** @return the value of the {@code ring_entries} field. */
    @NativeType("unsigned")
    public int ring_entries() { return nring_entries(address()); }
    /** @return a {@link IOURingZCRXRQE} view of the struct pointed to by the {@code rqes} field. */
    @NativeType("struct io_uring_zcrx_rqe *")
    public IOURingZCRXRQE rqes() { return nrqes(address()); }
    /** @return the value of the {@code ring_ptr} field. */
    @NativeType("void *")
    public long ring_ptr() { return nring_ptr(address()); }

    /** Sets the address of the specified {@link IntBuffer} to the {@code khead} field. */
    public IOURingZCRXRQ khead(@NativeType("__u32 *") IntBuffer value) { nkhead(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code ktail} field. */
    public IOURingZCRXRQ ktail(@NativeType("__u32 *") IntBuffer value) { nktail(address(), value); return this; }
    /** Sets the specified value to the {@code rq_tail} field. */
    public IOURingZCRXRQ rq_tail(@NativeType("__u32") int value) { nrq_tail(address(), value); return this; }
    /** Sets the specified value to the {@code ring_entries} field. */
    public IOURingZCRXRQ ring_entries(@NativeType("unsigned") int value) { nring_entries(address(), value); return this; }
    /** Sets the address of the specified {@link IOURingZCRXRQE} to the {@code rqes} field. */
    public IOURingZCRXRQ rqes(@NativeType("struct io_uring_zcrx_rqe *") IOURingZCRXRQE value) { nrqes(address(), value); return this; }
    /** Sets the specified value to the {@code ring_ptr} field. */
    public IOURingZCRXRQ ring_ptr(@NativeType("void *") long value) { nring_ptr(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingZCRXRQ set(
        IntBuffer khead,
        IntBuffer ktail,
        int rq_tail,
        int ring_entries,
        IOURingZCRXRQE rqes,
        long ring_ptr
    ) {
        khead(khead);
        ktail(ktail);
        rq_tail(rq_tail);
        ring_entries(ring_entries);
        rqes(rqes);
        ring_ptr(ring_ptr);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingZCRXRQ set(IOURingZCRXRQ src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingZCRXRQ} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingZCRXRQ malloc() {
        return new IOURingZCRXRQ(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingZCRXRQ} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingZCRXRQ calloc() {
        return new IOURingZCRXRQ(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingZCRXRQ} instance allocated with {@link BufferUtils}. */
    public static IOURingZCRXRQ create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingZCRXRQ(memAddress(container), container);
    }

    /** Returns a new {@code IOURingZCRXRQ} instance for the specified memory address. */
    public static IOURingZCRXRQ create(long address) {
        return new IOURingZCRXRQ(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingZCRXRQ createSafe(long address) {
        return address == NULL ? null : new IOURingZCRXRQ(address, null);
    }

    /**
     * Returns a new {@link IOURingZCRXRQ.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXRQ.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXRQ.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXRQ.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXRQ.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXRQ.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingZCRXRQ.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXRQ.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingZCRXRQ.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingZCRXRQ} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingZCRXRQ malloc(MemoryStack stack) {
        return new IOURingZCRXRQ(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingZCRXRQ} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingZCRXRQ calloc(MemoryStack stack) {
        return new IOURingZCRXRQ(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingZCRXRQ.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXRQ.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingZCRXRQ.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingZCRXRQ.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #khead(int) khead}. */
    public static IntBuffer nkhead(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + IOURingZCRXRQ.KHEAD), capacity); }
    /** Unsafe version of {@link #ktail(int) ktail}. */
    public static IntBuffer nktail(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + IOURingZCRXRQ.KTAIL), capacity); }
    /** Unsafe version of {@link #rq_tail}. */
    public static int nrq_tail(long struct) { return memGetInt(struct + IOURingZCRXRQ.RQ_TAIL); }
    /** Unsafe version of {@link #ring_entries}. */
    public static int nring_entries(long struct) { return memGetInt(struct + IOURingZCRXRQ.RING_ENTRIES); }
    /** Unsafe version of {@link #rqes}. */
    public static IOURingZCRXRQE nrqes(long struct) { return IOURingZCRXRQE.create(memGetAddress(struct + IOURingZCRXRQ.RQES)); }
    /** Unsafe version of {@link #ring_ptr}. */
    public static long nring_ptr(long struct) { return memGetAddress(struct + IOURingZCRXRQ.RING_PTR); }

    /** Unsafe version of {@link #khead(IntBuffer) khead}. */
    public static void nkhead(long struct, IntBuffer value) { memPutAddress(struct + IOURingZCRXRQ.KHEAD, memAddress(value)); }
    /** Unsafe version of {@link #ktail(IntBuffer) ktail}. */
    public static void nktail(long struct, IntBuffer value) { memPutAddress(struct + IOURingZCRXRQ.KTAIL, memAddress(value)); }
    /** Unsafe version of {@link #rq_tail(int) rq_tail}. */
    public static void nrq_tail(long struct, int value) { memPutInt(struct + IOURingZCRXRQ.RQ_TAIL, value); }
    /** Unsafe version of {@link #ring_entries(int) ring_entries}. */
    public static void nring_entries(long struct, int value) { memPutInt(struct + IOURingZCRXRQ.RING_ENTRIES, value); }
    /** Unsafe version of {@link #rqes(IOURingZCRXRQE) rqes}. */
    public static void nrqes(long struct, IOURingZCRXRQE value) { memPutAddress(struct + IOURingZCRXRQ.RQES, value.address()); }
    /** Unsafe version of {@link #ring_ptr(long) ring_ptr}. */
    public static void nring_ptr(long struct, long value) { memPutAddress(struct + IOURingZCRXRQ.RING_PTR, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + IOURingZCRXRQ.KHEAD));
        check(memGetAddress(struct + IOURingZCRXRQ.KTAIL));
        check(memGetAddress(struct + IOURingZCRXRQ.RQES));
        check(memGetAddress(struct + IOURingZCRXRQ.RING_PTR));
    }

    // -----------------------------------

    /** An array of {@link IOURingZCRXRQ} structs. */
    public static class Buffer extends StructBuffer<IOURingZCRXRQ, Buffer> implements NativeResource {

        private static final IOURingZCRXRQ ELEMENT_FACTORY = IOURingZCRXRQ.create(-1L);

        /**
         * Creates a new {@code IOURingZCRXRQ.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingZCRXRQ#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingZCRXRQ getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link IntBuffer} view of the data pointed to by the {@code khead} field. */
        @NativeType("__u32 *")
        public IntBuffer khead(int capacity) { return IOURingZCRXRQ.nkhead(address(), capacity); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code ktail} field. */
        @NativeType("__u32 *")
        public IntBuffer ktail(int capacity) { return IOURingZCRXRQ.nktail(address(), capacity); }
        /** @return the value of the {@code rq_tail} field. */
        @NativeType("__u32")
        public int rq_tail() { return IOURingZCRXRQ.nrq_tail(address()); }
        /** @return the value of the {@code ring_entries} field. */
        @NativeType("unsigned")
        public int ring_entries() { return IOURingZCRXRQ.nring_entries(address()); }
        /** @return a {@link IOURingZCRXRQE} view of the struct pointed to by the {@code rqes} field. */
        @NativeType("struct io_uring_zcrx_rqe *")
        public IOURingZCRXRQE rqes() { return IOURingZCRXRQ.nrqes(address()); }
        /** @return the value of the {@code ring_ptr} field. */
        @NativeType("void *")
        public long ring_ptr() { return IOURingZCRXRQ.nring_ptr(address()); }

        /** Sets the address of the specified {@link IntBuffer} to the {@code khead} field. */
        public IOURingZCRXRQ.Buffer khead(@NativeType("__u32 *") IntBuffer value) { IOURingZCRXRQ.nkhead(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code ktail} field. */
        public IOURingZCRXRQ.Buffer ktail(@NativeType("__u32 *") IntBuffer value) { IOURingZCRXRQ.nktail(address(), value); return this; }
        /** Sets the specified value to the {@code rq_tail} field. */
        public IOURingZCRXRQ.Buffer rq_tail(@NativeType("__u32") int value) { IOURingZCRXRQ.nrq_tail(address(), value); return this; }
        /** Sets the specified value to the {@code ring_entries} field. */
        public IOURingZCRXRQ.Buffer ring_entries(@NativeType("unsigned") int value) { IOURingZCRXRQ.nring_entries(address(), value); return this; }
        /** Sets the address of the specified {@link IOURingZCRXRQE} to the {@code rqes} field. */
        public IOURingZCRXRQ.Buffer rqes(@NativeType("struct io_uring_zcrx_rqe *") IOURingZCRXRQE value) { IOURingZCRXRQ.nrqes(address(), value); return this; }
        /** Sets the specified value to the {@code ring_ptr} field. */
        public IOURingZCRXRQ.Buffer ring_ptr(@NativeType("void *") long value) { IOURingZCRXRQ.nring_ptr(address(), value); return this; }

    }

}
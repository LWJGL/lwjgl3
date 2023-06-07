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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct io_uring_sq {
 *     unsigned * khead;
 *     unsigned * ktail;
 *     unsigned * {@link #kring_mask};
 *     unsigned * {@link #kring_entries};
 *     unsigned * kflags;
 *     unsigned * kdropped;
 *     unsigned * array;
 *     {@link IOURingSQE struct io_uring_sqe} * sqes;
 *     unsigned sqe_head;
 *     unsigned sqe_tail;
 *     size_t ring_sz;
 *     void * ring_ptr;
 *     unsigned ring_mask;
 *     unsigned ring_entries;
 *     unsigned pad[2];
 * }</code></pre>
 */
@NativeType("struct io_uring_sq")
public class IOURingSQ extends Struct<IOURingSQ> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        KHEAD,
        KTAIL,
        KRING_MASK,
        KRING_ENTRIES,
        KFLAGS,
        KDROPPED,
        ARRAY,
        SQES,
        SQE_HEAD,
        SQE_TAIL,
        RING_SZ,
        RING_PTR,
        RING_MASK,
        RING_ENTRIES,
        PAD;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __array(4, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        KHEAD = layout.offsetof(0);
        KTAIL = layout.offsetof(1);
        KRING_MASK = layout.offsetof(2);
        KRING_ENTRIES = layout.offsetof(3);
        KFLAGS = layout.offsetof(4);
        KDROPPED = layout.offsetof(5);
        ARRAY = layout.offsetof(6);
        SQES = layout.offsetof(7);
        SQE_HEAD = layout.offsetof(8);
        SQE_TAIL = layout.offsetof(9);
        RING_SZ = layout.offsetof(10);
        RING_PTR = layout.offsetof(11);
        RING_MASK = layout.offsetof(12);
        RING_ENTRIES = layout.offsetof(13);
        PAD = layout.offsetof(14);
    }

    protected IOURingSQ(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingSQ create(long address, @Nullable ByteBuffer container) {
        return new IOURingSQ(address, container);
    }

    /**
     * Creates a {@code IOURingSQ} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingSQ(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * @return a {@link IntBuffer} view of the data pointed to by the {@code khead} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("unsigned *")
    public IntBuffer khead(int capacity) { return nkhead(address(), capacity); }
    /**
     * @return a {@link IntBuffer} view of the data pointed to by the {@code ktail} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("unsigned *")
    public IntBuffer ktail(int capacity) { return nktail(address(), capacity); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return Deprecated: use {@code ring_mask} instead of {@code *kring_mask}
     */
    @NativeType("unsigned *")
    public IntBuffer kring_mask(int capacity) { return nkring_mask(address(), capacity); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return Deprecated: use {@code ring_entries} instead of {@code *kring_entries}
     */
    @NativeType("unsigned *")
    public IntBuffer kring_entries(int capacity) { return nkring_entries(address(), capacity); }
    /**
     * @return a {@link IntBuffer} view of the data pointed to by the {@code kflags} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("unsigned *")
    public IntBuffer kflags(int capacity) { return nkflags(address(), capacity); }
    /**
     * @return a {@link IntBuffer} view of the data pointed to by the {@code kdropped} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("unsigned *")
    public IntBuffer kdropped(int capacity) { return nkdropped(address(), capacity); }
    /**
     * @return a {@link IntBuffer} view of the data pointed to by the {@code array} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("unsigned *")
    public IntBuffer array(int capacity) { return narray(address(), capacity); }
    /** @return a {@link IOURingSQE} view of the struct pointed to by the {@code sqes} field. */
    @NativeType("struct io_uring_sqe *")
    public IOURingSQE sqes() { return nsqes(address()); }
    /** @return the value of the {@code sqe_head} field. */
    @NativeType("unsigned")
    public int sqe_head() { return nsqe_head(address()); }
    /** @return the value of the {@code sqe_tail} field. */
    @NativeType("unsigned")
    public int sqe_tail() { return nsqe_tail(address()); }
    /** @return the value of the {@code ring_sz} field. */
    @NativeType("size_t")
    public long ring_sz() { return nring_sz(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code ring_ptr} field. */
    @NativeType("void *")
    public ByteBuffer ring_ptr() { return nring_ptr(address()); }
    /** @return the value of the {@code ring_mask} field. */
    @NativeType("unsigned")
    public int ring_mask() { return nring_mask(address()); }
    /** @return the value of the {@code ring_entries} field. */
    @NativeType("unsigned")
    public int ring_entries() { return nring_entries(address()); }

    /** Sets the address of the specified {@link IntBuffer} to the {@code khead} field. */
    public IOURingSQ khead(@NativeType("unsigned *") IntBuffer value) { nkhead(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code ktail} field. */
    public IOURingSQ ktail(@NativeType("unsigned *") IntBuffer value) { nktail(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #kring_mask} field. */
    public IOURingSQ kring_mask(@NativeType("unsigned *") IntBuffer value) { nkring_mask(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #kring_entries} field. */
    public IOURingSQ kring_entries(@NativeType("unsigned *") IntBuffer value) { nkring_entries(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code kflags} field. */
    public IOURingSQ kflags(@NativeType("unsigned *") IntBuffer value) { nkflags(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code kdropped} field. */
    public IOURingSQ kdropped(@NativeType("unsigned *") IntBuffer value) { nkdropped(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code array} field. */
    public IOURingSQ array(@NativeType("unsigned *") IntBuffer value) { narray(address(), value); return this; }
    /** Sets the address of the specified {@link IOURingSQE} to the {@code sqes} field. */
    public IOURingSQ sqes(@NativeType("struct io_uring_sqe *") IOURingSQE value) { nsqes(address(), value); return this; }
    /** Sets the specified value to the {@code sqe_head} field. */
    public IOURingSQ sqe_head(@NativeType("unsigned") int value) { nsqe_head(address(), value); return this; }
    /** Sets the specified value to the {@code sqe_tail} field. */
    public IOURingSQ sqe_tail(@NativeType("unsigned") int value) { nsqe_tail(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code ring_ptr} field. */
    public IOURingSQ ring_ptr(@NativeType("void *") ByteBuffer value) { nring_ptr(address(), value); return this; }
    /** Sets the specified value to the {@code ring_mask} field. */
    public IOURingSQ ring_mask(@NativeType("unsigned") int value) { nring_mask(address(), value); return this; }
    /** Sets the specified value to the {@code ring_entries} field. */
    public IOURingSQ ring_entries(@NativeType("unsigned") int value) { nring_entries(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingSQ set(
        IntBuffer khead,
        IntBuffer ktail,
        IntBuffer kring_mask,
        IntBuffer kring_entries,
        IntBuffer kflags,
        IntBuffer kdropped,
        IntBuffer array,
        IOURingSQE sqes,
        int sqe_head,
        int sqe_tail,
        ByteBuffer ring_ptr,
        int ring_mask,
        int ring_entries
    ) {
        khead(khead);
        ktail(ktail);
        kring_mask(kring_mask);
        kring_entries(kring_entries);
        kflags(kflags);
        kdropped(kdropped);
        array(array);
        sqes(sqes);
        sqe_head(sqe_head);
        sqe_tail(sqe_tail);
        ring_ptr(ring_ptr);
        ring_mask(ring_mask);
        ring_entries(ring_entries);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingSQ set(IOURingSQ src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingSQ} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingSQ malloc() {
        return new IOURingSQ(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingSQ} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingSQ calloc() {
        return new IOURingSQ(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingSQ} instance allocated with {@link BufferUtils}. */
    public static IOURingSQ create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingSQ(memAddress(container), container);
    }

    /** Returns a new {@code IOURingSQ} instance for the specified memory address. */
    public static IOURingSQ create(long address) {
        return new IOURingSQ(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingSQ createSafe(long address) {
        return address == NULL ? null : new IOURingSQ(address, null);
    }

    /**
     * Returns a new {@link IOURingSQ.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingSQ.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingSQ.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingSQ.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingSQ.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingSQ.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingSQ.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingSQ.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingSQ.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingSQ} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingSQ malloc(MemoryStack stack) {
        return new IOURingSQ(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingSQ} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingSQ calloc(MemoryStack stack) {
        return new IOURingSQ(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingSQ.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingSQ.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingSQ.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingSQ.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #khead(int) khead}. */
    public static IntBuffer nkhead(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + IOURingSQ.KHEAD), capacity); }
    /** Unsafe version of {@link #ktail(int) ktail}. */
    public static IntBuffer nktail(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + IOURingSQ.KTAIL), capacity); }
    /** Unsafe version of {@link #kring_mask(int) kring_mask}. */
    public static IntBuffer nkring_mask(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + IOURingSQ.KRING_MASK), capacity); }
    /** Unsafe version of {@link #kring_entries(int) kring_entries}. */
    public static IntBuffer nkring_entries(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + IOURingSQ.KRING_ENTRIES), capacity); }
    /** Unsafe version of {@link #kflags(int) kflags}. */
    public static IntBuffer nkflags(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + IOURingSQ.KFLAGS), capacity); }
    /** Unsafe version of {@link #kdropped(int) kdropped}. */
    public static IntBuffer nkdropped(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + IOURingSQ.KDROPPED), capacity); }
    /** Unsafe version of {@link #array(int) array}. */
    public static IntBuffer narray(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + IOURingSQ.ARRAY), capacity); }
    /** Unsafe version of {@link #sqes}. */
    public static IOURingSQE nsqes(long struct) { return IOURingSQE.create(memGetAddress(struct + IOURingSQ.SQES)); }
    /** Unsafe version of {@link #sqe_head}. */
    public static int nsqe_head(long struct) { return UNSAFE.getInt(null, struct + IOURingSQ.SQE_HEAD); }
    /** Unsafe version of {@link #sqe_tail}. */
    public static int nsqe_tail(long struct) { return UNSAFE.getInt(null, struct + IOURingSQ.SQE_TAIL); }
    /** Unsafe version of {@link #ring_sz}. */
    public static long nring_sz(long struct) { return memGetAddress(struct + IOURingSQ.RING_SZ); }
    /** Unsafe version of {@link #ring_ptr() ring_ptr}. */
    public static ByteBuffer nring_ptr(long struct) { return memByteBuffer(memGetAddress(struct + IOURingSQ.RING_PTR), (int)nring_sz(struct)); }
    /** Unsafe version of {@link #ring_mask}. */
    public static int nring_mask(long struct) { return UNSAFE.getInt(null, struct + IOURingSQ.RING_MASK); }
    /** Unsafe version of {@link #ring_entries}. */
    public static int nring_entries(long struct) { return UNSAFE.getInt(null, struct + IOURingSQ.RING_ENTRIES); }
    public static IntBuffer npad(long struct) { return memIntBuffer(struct + IOURingSQ.PAD, 2); }
    public static int npad(long struct, int index) {
        return UNSAFE.getInt(null, struct + IOURingSQ.PAD + check(index, 2) * 4);
    }

    /** Unsafe version of {@link #khead(IntBuffer) khead}. */
    public static void nkhead(long struct, IntBuffer value) { memPutAddress(struct + IOURingSQ.KHEAD, memAddress(value)); }
    /** Unsafe version of {@link #ktail(IntBuffer) ktail}. */
    public static void nktail(long struct, IntBuffer value) { memPutAddress(struct + IOURingSQ.KTAIL, memAddress(value)); }
    /** Unsafe version of {@link #kring_mask(IntBuffer) kring_mask}. */
    public static void nkring_mask(long struct, IntBuffer value) { memPutAddress(struct + IOURingSQ.KRING_MASK, memAddress(value)); }
    /** Unsafe version of {@link #kring_entries(IntBuffer) kring_entries}. */
    public static void nkring_entries(long struct, IntBuffer value) { memPutAddress(struct + IOURingSQ.KRING_ENTRIES, memAddress(value)); }
    /** Unsafe version of {@link #kflags(IntBuffer) kflags}. */
    public static void nkflags(long struct, IntBuffer value) { memPutAddress(struct + IOURingSQ.KFLAGS, memAddress(value)); }
    /** Unsafe version of {@link #kdropped(IntBuffer) kdropped}. */
    public static void nkdropped(long struct, IntBuffer value) { memPutAddress(struct + IOURingSQ.KDROPPED, memAddress(value)); }
    /** Unsafe version of {@link #array(IntBuffer) array}. */
    public static void narray(long struct, IntBuffer value) { memPutAddress(struct + IOURingSQ.ARRAY, memAddress(value)); }
    /** Unsafe version of {@link #sqes(IOURingSQE) sqes}. */
    public static void nsqes(long struct, IOURingSQE value) { memPutAddress(struct + IOURingSQ.SQES, value.address()); }
    /** Unsafe version of {@link #sqe_head(int) sqe_head}. */
    public static void nsqe_head(long struct, int value) { UNSAFE.putInt(null, struct + IOURingSQ.SQE_HEAD, value); }
    /** Unsafe version of {@link #sqe_tail(int) sqe_tail}. */
    public static void nsqe_tail(long struct, int value) { UNSAFE.putInt(null, struct + IOURingSQ.SQE_TAIL, value); }
    /** Sets the specified value to the {@code ring_sz} field of the specified {@code struct}. */
    public static void nring_sz(long struct, long value) { memPutAddress(struct + IOURingSQ.RING_SZ, value); }
    /** Unsafe version of {@link #ring_ptr(ByteBuffer) ring_ptr}. */
    public static void nring_ptr(long struct, ByteBuffer value) { memPutAddress(struct + IOURingSQ.RING_PTR, memAddress(value)); nring_sz(struct, value.remaining()); }
    /** Unsafe version of {@link #ring_mask(int) ring_mask}. */
    public static void nring_mask(long struct, int value) { UNSAFE.putInt(null, struct + IOURingSQ.RING_MASK, value); }
    /** Unsafe version of {@link #ring_entries(int) ring_entries}. */
    public static void nring_entries(long struct, int value) { UNSAFE.putInt(null, struct + IOURingSQ.RING_ENTRIES, value); }
    public static void npad(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + IOURingSQ.PAD, value.remaining() * 4);
    }
    public static void npad(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + IOURingSQ.PAD + check(index, 2) * 4, value);
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + IOURingSQ.KHEAD));
        check(memGetAddress(struct + IOURingSQ.KTAIL));
        check(memGetAddress(struct + IOURingSQ.KRING_MASK));
        check(memGetAddress(struct + IOURingSQ.KRING_ENTRIES));
        check(memGetAddress(struct + IOURingSQ.KFLAGS));
        check(memGetAddress(struct + IOURingSQ.KDROPPED));
        check(memGetAddress(struct + IOURingSQ.ARRAY));
        check(memGetAddress(struct + IOURingSQ.SQES));
        check(memGetAddress(struct + IOURingSQ.RING_PTR));
    }

    // -----------------------------------

    /** An array of {@link IOURingSQ} structs. */
    public static class Buffer extends StructBuffer<IOURingSQ, Buffer> implements NativeResource {

        private static final IOURingSQ ELEMENT_FACTORY = IOURingSQ.create(-1L);

        /**
         * Creates a new {@code IOURingSQ.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingSQ#SIZEOF}, and its mark will be undefined.</p>
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
        protected IOURingSQ getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@code khead} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("unsigned *")
        public IntBuffer khead(int capacity) { return IOURingSQ.nkhead(address(), capacity); }
        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@code ktail} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("unsigned *")
        public IntBuffer ktail(int capacity) { return IOURingSQ.nktail(address(), capacity); }
        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@link IOURingSQ#kring_mask} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("unsigned *")
        public IntBuffer kring_mask(int capacity) { return IOURingSQ.nkring_mask(address(), capacity); }
        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@link IOURingSQ#kring_entries} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("unsigned *")
        public IntBuffer kring_entries(int capacity) { return IOURingSQ.nkring_entries(address(), capacity); }
        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@code kflags} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("unsigned *")
        public IntBuffer kflags(int capacity) { return IOURingSQ.nkflags(address(), capacity); }
        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@code kdropped} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("unsigned *")
        public IntBuffer kdropped(int capacity) { return IOURingSQ.nkdropped(address(), capacity); }
        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@code array} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("unsigned *")
        public IntBuffer array(int capacity) { return IOURingSQ.narray(address(), capacity); }
        /** @return a {@link IOURingSQE} view of the struct pointed to by the {@code sqes} field. */
        @NativeType("struct io_uring_sqe *")
        public IOURingSQE sqes() { return IOURingSQ.nsqes(address()); }
        /** @return the value of the {@code sqe_head} field. */
        @NativeType("unsigned")
        public int sqe_head() { return IOURingSQ.nsqe_head(address()); }
        /** @return the value of the {@code sqe_tail} field. */
        @NativeType("unsigned")
        public int sqe_tail() { return IOURingSQ.nsqe_tail(address()); }
        /** @return the value of the {@code ring_sz} field. */
        @NativeType("size_t")
        public long ring_sz() { return IOURingSQ.nring_sz(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code ring_ptr} field. */
        @NativeType("void *")
        public ByteBuffer ring_ptr() { return IOURingSQ.nring_ptr(address()); }
        /** @return the value of the {@code ring_mask} field. */
        @NativeType("unsigned")
        public int ring_mask() { return IOURingSQ.nring_mask(address()); }
        /** @return the value of the {@code ring_entries} field. */
        @NativeType("unsigned")
        public int ring_entries() { return IOURingSQ.nring_entries(address()); }

        /** Sets the address of the specified {@link IntBuffer} to the {@code khead} field. */
        public IOURingSQ.Buffer khead(@NativeType("unsigned *") IntBuffer value) { IOURingSQ.nkhead(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code ktail} field. */
        public IOURingSQ.Buffer ktail(@NativeType("unsigned *") IntBuffer value) { IOURingSQ.nktail(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link IOURingSQ#kring_mask} field. */
        public IOURingSQ.Buffer kring_mask(@NativeType("unsigned *") IntBuffer value) { IOURingSQ.nkring_mask(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link IOURingSQ#kring_entries} field. */
        public IOURingSQ.Buffer kring_entries(@NativeType("unsigned *") IntBuffer value) { IOURingSQ.nkring_entries(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code kflags} field. */
        public IOURingSQ.Buffer kflags(@NativeType("unsigned *") IntBuffer value) { IOURingSQ.nkflags(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code kdropped} field. */
        public IOURingSQ.Buffer kdropped(@NativeType("unsigned *") IntBuffer value) { IOURingSQ.nkdropped(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code array} field. */
        public IOURingSQ.Buffer array(@NativeType("unsigned *") IntBuffer value) { IOURingSQ.narray(address(), value); return this; }
        /** Sets the address of the specified {@link IOURingSQE} to the {@code sqes} field. */
        public IOURingSQ.Buffer sqes(@NativeType("struct io_uring_sqe *") IOURingSQE value) { IOURingSQ.nsqes(address(), value); return this; }
        /** Sets the specified value to the {@code sqe_head} field. */
        public IOURingSQ.Buffer sqe_head(@NativeType("unsigned") int value) { IOURingSQ.nsqe_head(address(), value); return this; }
        /** Sets the specified value to the {@code sqe_tail} field. */
        public IOURingSQ.Buffer sqe_tail(@NativeType("unsigned") int value) { IOURingSQ.nsqe_tail(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code ring_ptr} field. */
        public IOURingSQ.Buffer ring_ptr(@NativeType("void *") ByteBuffer value) { IOURingSQ.nring_ptr(address(), value); return this; }
        /** Sets the specified value to the {@code ring_mask} field. */
        public IOURingSQ.Buffer ring_mask(@NativeType("unsigned") int value) { IOURingSQ.nring_mask(address(), value); return this; }
        /** Sets the specified value to the {@code ring_entries} field. */
        public IOURingSQ.Buffer ring_entries(@NativeType("unsigned") int value) { IOURingSQ.nring_entries(address(), value); return this; }

    }

}
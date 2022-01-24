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
 * struct io_uring_cq {
 *     unsigned * khead;
 *     unsigned * ktail;
 *     unsigned * kring_mask;
 *     unsigned * kring_entries;
 *     unsigned * kflags;
 *     unsigned * koverflow;
 *     {@link IOURingCQE struct io_uring_cqe} * cqes;
 *     size_t ring_sz;
 *     void * ring_ptr;
 *     unsigned int pad[4];
 * }</code></pre>
 */
@NativeType("struct io_uring_cq")
public class IOURingCQ extends Struct implements NativeResource {

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
        KOVERFLOW,
        CQES,
        RING_SZ,
        RING_PTR,
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
            __member(POINTER_SIZE),
            __array(4, 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        KHEAD = layout.offsetof(0);
        KTAIL = layout.offsetof(1);
        KRING_MASK = layout.offsetof(2);
        KRING_ENTRIES = layout.offsetof(3);
        KFLAGS = layout.offsetof(4);
        KOVERFLOW = layout.offsetof(5);
        CQES = layout.offsetof(6);
        RING_SZ = layout.offsetof(7);
        RING_PTR = layout.offsetof(8);
        PAD = layout.offsetof(9);
    }

    /**
     * Creates a {@code IOURingCQ} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingCQ(ByteBuffer container) {
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
     * @return a {@link IntBuffer} view of the data pointed to by the {@code kring_mask} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("unsigned *")
    public IntBuffer kring_mask(int capacity) { return nkring_mask(address(), capacity); }
    /**
     * @return a {@link IntBuffer} view of the data pointed to by the {@code kring_entries} field.
     *
     * @param capacity the number of elements in the returned buffer
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
     * @return a {@link IntBuffer} view of the data pointed to by the {@code koverflow} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("unsigned *")
    public IntBuffer koverflow(int capacity) { return nkoverflow(address(), capacity); }
    /** @return a {@link IOURingCQE} view of the struct pointed to by the {@code cqes} field. */
    @NativeType("struct io_uring_cqe *")
    public IOURingCQE cqes() { return ncqes(address()); }
    /** @return the value of the {@code ring_sz} field. */
    @NativeType("size_t")
    public long ring_sz() { return nring_sz(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code ring_ptr} field. */
    @NativeType("void *")
    public ByteBuffer ring_ptr() { return nring_ptr(address()); }

    /** Sets the address of the specified {@link IntBuffer} to the {@code khead} field. */
    public IOURingCQ khead(@NativeType("unsigned *") IntBuffer value) { nkhead(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code ktail} field. */
    public IOURingCQ ktail(@NativeType("unsigned *") IntBuffer value) { nktail(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code kring_mask} field. */
    public IOURingCQ kring_mask(@NativeType("unsigned *") IntBuffer value) { nkring_mask(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code kring_entries} field. */
    public IOURingCQ kring_entries(@NativeType("unsigned *") IntBuffer value) { nkring_entries(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code kflags} field. */
    public IOURingCQ kflags(@NativeType("unsigned *") IntBuffer value) { nkflags(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code koverflow} field. */
    public IOURingCQ koverflow(@NativeType("unsigned *") IntBuffer value) { nkoverflow(address(), value); return this; }
    /** Sets the address of the specified {@link IOURingCQE} to the {@code cqes} field. */
    public IOURingCQ cqes(@NativeType("struct io_uring_cqe *") IOURingCQE value) { ncqes(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code ring_ptr} field. */
    public IOURingCQ ring_ptr(@NativeType("void *") ByteBuffer value) { nring_ptr(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IOURingCQ set(
        IntBuffer khead,
        IntBuffer ktail,
        IntBuffer kring_mask,
        IntBuffer kring_entries,
        IntBuffer kflags,
        IntBuffer koverflow,
        IOURingCQE cqes,
        ByteBuffer ring_ptr
    ) {
        khead(khead);
        ktail(ktail);
        kring_mask(kring_mask);
        kring_entries(kring_entries);
        kflags(kflags);
        koverflow(koverflow);
        cqes(cqes);
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
    public IOURingCQ set(IOURingCQ src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingCQ} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingCQ malloc() {
        return wrap(IOURingCQ.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code IOURingCQ} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingCQ calloc() {
        return wrap(IOURingCQ.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code IOURingCQ} instance allocated with {@link BufferUtils}. */
    public static IOURingCQ create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(IOURingCQ.class, memAddress(container), container);
    }

    /** Returns a new {@code IOURingCQ} instance for the specified memory address. */
    public static IOURingCQ create(long address) {
        return wrap(IOURingCQ.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingCQ createSafe(long address) {
        return address == NULL ? null : wrap(IOURingCQ.class, address);
    }

    /**
     * Returns a new {@link IOURingCQ.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingCQ.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingCQ.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingCQ.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingCQ.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingCQ.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link IOURingCQ.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingCQ.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IOURingCQ.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code IOURingCQ} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingCQ malloc(MemoryStack stack) {
        return wrap(IOURingCQ.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code IOURingCQ} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingCQ calloc(MemoryStack stack) {
        return wrap(IOURingCQ.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link IOURingCQ.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingCQ.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingCQ.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingCQ.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #khead(int) khead}. */
    public static IntBuffer nkhead(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + IOURingCQ.KHEAD), capacity); }
    /** Unsafe version of {@link #ktail(int) ktail}. */
    public static IntBuffer nktail(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + IOURingCQ.KTAIL), capacity); }
    /** Unsafe version of {@link #kring_mask(int) kring_mask}. */
    public static IntBuffer nkring_mask(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + IOURingCQ.KRING_MASK), capacity); }
    /** Unsafe version of {@link #kring_entries(int) kring_entries}. */
    public static IntBuffer nkring_entries(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + IOURingCQ.KRING_ENTRIES), capacity); }
    /** Unsafe version of {@link #kflags(int) kflags}. */
    public static IntBuffer nkflags(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + IOURingCQ.KFLAGS), capacity); }
    /** Unsafe version of {@link #koverflow(int) koverflow}. */
    public static IntBuffer nkoverflow(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + IOURingCQ.KOVERFLOW), capacity); }
    /** Unsafe version of {@link #cqes}. */
    public static IOURingCQE ncqes(long struct) { return IOURingCQE.create(memGetAddress(struct + IOURingCQ.CQES)); }
    /** Unsafe version of {@link #ring_sz}. */
    public static long nring_sz(long struct) { return memGetAddress(struct + IOURingCQ.RING_SZ); }
    /** Unsafe version of {@link #ring_ptr() ring_ptr}. */
    public static ByteBuffer nring_ptr(long struct) { return memByteBuffer(memGetAddress(struct + IOURingCQ.RING_PTR), (int)nring_sz(struct)); }
    public static IntBuffer npad(long struct) { return memIntBuffer(struct + IOURingCQ.PAD, 4); }
    public static int npad(long struct, int index) {
        return UNSAFE.getInt(null, struct + IOURingCQ.PAD + check(index, 4) * 4);
    }

    /** Unsafe version of {@link #khead(IntBuffer) khead}. */
    public static void nkhead(long struct, IntBuffer value) { memPutAddress(struct + IOURingCQ.KHEAD, memAddress(value)); }
    /** Unsafe version of {@link #ktail(IntBuffer) ktail}. */
    public static void nktail(long struct, IntBuffer value) { memPutAddress(struct + IOURingCQ.KTAIL, memAddress(value)); }
    /** Unsafe version of {@link #kring_mask(IntBuffer) kring_mask}. */
    public static void nkring_mask(long struct, IntBuffer value) { memPutAddress(struct + IOURingCQ.KRING_MASK, memAddress(value)); }
    /** Unsafe version of {@link #kring_entries(IntBuffer) kring_entries}. */
    public static void nkring_entries(long struct, IntBuffer value) { memPutAddress(struct + IOURingCQ.KRING_ENTRIES, memAddress(value)); }
    /** Unsafe version of {@link #kflags(IntBuffer) kflags}. */
    public static void nkflags(long struct, IntBuffer value) { memPutAddress(struct + IOURingCQ.KFLAGS, memAddress(value)); }
    /** Unsafe version of {@link #koverflow(IntBuffer) koverflow}. */
    public static void nkoverflow(long struct, IntBuffer value) { memPutAddress(struct + IOURingCQ.KOVERFLOW, memAddress(value)); }
    /** Unsafe version of {@link #cqes(IOURingCQE) cqes}. */
    public static void ncqes(long struct, IOURingCQE value) { memPutAddress(struct + IOURingCQ.CQES, value.address()); }
    /** Sets the specified value to the {@code ring_sz} field of the specified {@code struct}. */
    public static void nring_sz(long struct, long value) { memPutAddress(struct + IOURingCQ.RING_SZ, value); }
    /** Unsafe version of {@link #ring_ptr(ByteBuffer) ring_ptr}. */
    public static void nring_ptr(long struct, ByteBuffer value) { memPutAddress(struct + IOURingCQ.RING_PTR, memAddress(value)); nring_sz(struct, value.remaining()); }
    public static void npad(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + IOURingCQ.PAD, value.remaining() * 4);
    }
    public static void npad(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + IOURingCQ.PAD + check(index, 4) * 4, value);
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + IOURingCQ.KHEAD));
        check(memGetAddress(struct + IOURingCQ.KTAIL));
        check(memGetAddress(struct + IOURingCQ.KRING_MASK));
        check(memGetAddress(struct + IOURingCQ.KRING_ENTRIES));
        check(memGetAddress(struct + IOURingCQ.KFLAGS));
        check(memGetAddress(struct + IOURingCQ.KOVERFLOW));
        check(memGetAddress(struct + IOURingCQ.CQES));
        check(memGetAddress(struct + IOURingCQ.RING_PTR));
    }

    // -----------------------------------

    /** An array of {@link IOURingCQ} structs. */
    public static class Buffer extends StructBuffer<IOURingCQ, Buffer> implements NativeResource {

        private static final IOURingCQ ELEMENT_FACTORY = IOURingCQ.create(-1L);

        /**
         * Creates a new {@code IOURingCQ.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingCQ#SIZEOF}, and its mark will be undefined.
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
        protected IOURingCQ getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@code khead} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("unsigned *")
        public IntBuffer khead(int capacity) { return IOURingCQ.nkhead(address(), capacity); }
        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@code ktail} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("unsigned *")
        public IntBuffer ktail(int capacity) { return IOURingCQ.nktail(address(), capacity); }
        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@code kring_mask} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("unsigned *")
        public IntBuffer kring_mask(int capacity) { return IOURingCQ.nkring_mask(address(), capacity); }
        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@code kring_entries} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("unsigned *")
        public IntBuffer kring_entries(int capacity) { return IOURingCQ.nkring_entries(address(), capacity); }
        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@code kflags} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("unsigned *")
        public IntBuffer kflags(int capacity) { return IOURingCQ.nkflags(address(), capacity); }
        /**
         * @return a {@link IntBuffer} view of the data pointed to by the {@code koverflow} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("unsigned *")
        public IntBuffer koverflow(int capacity) { return IOURingCQ.nkoverflow(address(), capacity); }
        /** @return a {@link IOURingCQE} view of the struct pointed to by the {@code cqes} field. */
        @NativeType("struct io_uring_cqe *")
        public IOURingCQE cqes() { return IOURingCQ.ncqes(address()); }
        /** @return the value of the {@code ring_sz} field. */
        @NativeType("size_t")
        public long ring_sz() { return IOURingCQ.nring_sz(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code ring_ptr} field. */
        @NativeType("void *")
        public ByteBuffer ring_ptr() { return IOURingCQ.nring_ptr(address()); }

        /** Sets the address of the specified {@link IntBuffer} to the {@code khead} field. */
        public IOURingCQ.Buffer khead(@NativeType("unsigned *") IntBuffer value) { IOURingCQ.nkhead(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code ktail} field. */
        public IOURingCQ.Buffer ktail(@NativeType("unsigned *") IntBuffer value) { IOURingCQ.nktail(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code kring_mask} field. */
        public IOURingCQ.Buffer kring_mask(@NativeType("unsigned *") IntBuffer value) { IOURingCQ.nkring_mask(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code kring_entries} field. */
        public IOURingCQ.Buffer kring_entries(@NativeType("unsigned *") IntBuffer value) { IOURingCQ.nkring_entries(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code kflags} field. */
        public IOURingCQ.Buffer kflags(@NativeType("unsigned *") IntBuffer value) { IOURingCQ.nkflags(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code koverflow} field. */
        public IOURingCQ.Buffer koverflow(@NativeType("unsigned *") IntBuffer value) { IOURingCQ.nkoverflow(address(), value); return this; }
        /** Sets the address of the specified {@link IOURingCQE} to the {@code cqes} field. */
        public IOURingCQ.Buffer cqes(@NativeType("struct io_uring_cqe *") IOURingCQE value) { IOURingCQ.ncqes(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code ring_ptr} field. */
        public IOURingCQ.Buffer ring_ptr(@NativeType("void *") ByteBuffer value) { IOURingCQ.nring_ptr(address(), value); return this; }

    }

}
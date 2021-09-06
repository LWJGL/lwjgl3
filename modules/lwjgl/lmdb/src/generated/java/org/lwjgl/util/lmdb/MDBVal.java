/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lmdb;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Generic structure used for passing keys and data in and out of the database.
 * 
 * <p>Values returned from the database are valid only until a subsequent update operation, or the end of the transaction. Do not modify or free them, they
 * commonly point into the database itself.</p>
 * 
 * <p>Key sizes must be between 1 and {@link LMDB#mdb_env_get_maxkeysize env_get_maxkeysize} inclusive. The same applies to data sizes in databases with the {@link LMDB#MDB_DUPSORT DUPSORT} flag.
 * Other data items can in theory be from 0 to {@code 0xffffffff} bytes long.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct MDB_val {
 *     size_t {@link #mv_size};
 *     void * {@link #mv_data};
 * }</code></pre>
 */
@NativeType("struct MDB_val")
public class MDBVal extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MV_SIZE,
        MV_DATA;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MV_SIZE = layout.offsetof(0);
        MV_DATA = layout.offsetof(1);
    }

    /**
     * Creates a {@code MDBVal} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MDBVal(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Size of the data item. */
    @NativeType("size_t")
    public long mv_size() { return nmv_size(address()); }
    /** Address of the data item. */
    @Nullable
    @NativeType("void *")
    public ByteBuffer mv_data() { return nmv_data(address()); }

    /** Sets the specified value to the {@link #mv_size} field. */
    public MDBVal mv_size(@NativeType("size_t") long value) { nmv_size(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #mv_data} field. */
    public MDBVal mv_data(@Nullable @NativeType("void *") ByteBuffer value) { nmv_data(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public MDBVal set(
        long mv_size,
        @Nullable ByteBuffer mv_data
    ) {
        mv_size(mv_size);
        mv_data(mv_data);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public MDBVal set(MDBVal src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code MDBVal} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MDBVal malloc() {
        return wrap(MDBVal.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code MDBVal} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MDBVal calloc() {
        return wrap(MDBVal.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code MDBVal} instance allocated with {@link BufferUtils}. */
    public static MDBVal create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(MDBVal.class, memAddress(container), container);
    }

    /** Returns a new {@code MDBVal} instance for the specified memory address. */
    public static MDBVal create(long address) {
        return wrap(MDBVal.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MDBVal createSafe(long address) {
        return address == NULL ? null : wrap(MDBVal.class, address);
    }

    /**
     * Returns a new {@link MDBVal.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MDBVal.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MDBVal.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MDBVal.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MDBVal.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MDBVal.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link MDBVal.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MDBVal.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MDBVal.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static MDBVal mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static MDBVal callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static MDBVal mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static MDBVal callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static MDBVal.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static MDBVal.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static MDBVal.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static MDBVal.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code MDBVal} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MDBVal malloc(MemoryStack stack) {
        return wrap(MDBVal.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code MDBVal} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MDBVal calloc(MemoryStack stack) {
        return wrap(MDBVal.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link MDBVal.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MDBVal.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MDBVal.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MDBVal.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mv_size}. */
    public static long nmv_size(long struct) { return memGetAddress(struct + MDBVal.MV_SIZE); }
    /** Unsafe version of {@link #mv_data() mv_data}. */
    @Nullable public static ByteBuffer nmv_data(long struct) { return memByteBufferSafe(memGetAddress(struct + MDBVal.MV_DATA), (int)nmv_size(struct)); }

    /** Sets the specified value to the {@code mv_size} field of the specified {@code struct}. */
    public static void nmv_size(long struct, long value) { memPutAddress(struct + MDBVal.MV_SIZE, value); }
    /** Unsafe version of {@link #mv_data(ByteBuffer) mv_data}. */
    public static void nmv_data(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + MDBVal.MV_DATA, memAddressSafe(value)); if (value != null) { nmv_size(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link MDBVal} structs. */
    public static class Buffer extends StructBuffer<MDBVal, Buffer> implements NativeResource {

        private static final MDBVal ELEMENT_FACTORY = MDBVal.create(-1L);

        /**
         * Creates a new {@code MDBVal.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MDBVal#SIZEOF}, and its mark will be undefined.
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
        protected MDBVal getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link MDBVal#mv_size} field. */
        @NativeType("size_t")
        public long mv_size() { return MDBVal.nmv_size(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link MDBVal#mv_data} field. */
        @Nullable
        @NativeType("void *")
        public ByteBuffer mv_data() { return MDBVal.nmv_data(address()); }

        /** Sets the specified value to the {@link MDBVal#mv_size} field. */
        public MDBVal.Buffer mv_size(@NativeType("size_t") long value) { MDBVal.nmv_size(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link MDBVal#mv_data} field. */
        public MDBVal.Buffer mv_data(@Nullable @NativeType("void *") ByteBuffer value) { MDBVal.nmv_data(address(), value); return this; }

    }

}
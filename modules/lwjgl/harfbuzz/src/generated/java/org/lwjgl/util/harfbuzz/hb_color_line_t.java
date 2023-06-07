/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

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
 * struct hb_color_line_t {
 *     void * data;
 *     {@link hb_color_line_get_color_stops_func_tI hb_color_line_get_color_stops_func_t} get_color_stops;
 *     void * get_color_stops_user_data;
 *     {@link hb_color_line_get_extend_func_tI hb_color_line_get_extend_func_t} get_extend;
 *     void * get_extend_user_data;
 *     void * reserved0;
 *     void * reserved1;
 *     void * reserved2;
 *     void * reserved3;
 *     void * reserved4;
 *     void * reserved5;
 *     void * reserved6;
 *     void * reserved7;
 *     void * reserved8;
 * }</code></pre>
 */
public class hb_color_line_t extends Struct<hb_color_line_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DATA,
        GET_COLOR_STOPS,
        GET_COLOR_STOPS_USER_DATA,
        GET_EXTEND,
        GET_EXTEND_USER_DATA,
        RESERVED0,
        RESERVED1,
        RESERVED2,
        RESERVED3,
        RESERVED4,
        RESERVED5,
        RESERVED6,
        RESERVED7,
        RESERVED8;

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
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DATA = layout.offsetof(0);
        GET_COLOR_STOPS = layout.offsetof(1);
        GET_COLOR_STOPS_USER_DATA = layout.offsetof(2);
        GET_EXTEND = layout.offsetof(3);
        GET_EXTEND_USER_DATA = layout.offsetof(4);
        RESERVED0 = layout.offsetof(5);
        RESERVED1 = layout.offsetof(6);
        RESERVED2 = layout.offsetof(7);
        RESERVED3 = layout.offsetof(8);
        RESERVED4 = layout.offsetof(9);
        RESERVED5 = layout.offsetof(10);
        RESERVED6 = layout.offsetof(11);
        RESERVED7 = layout.offsetof(12);
        RESERVED8 = layout.offsetof(13);
    }

    protected hb_color_line_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hb_color_line_t create(long address, @Nullable ByteBuffer container) {
        return new hb_color_line_t(address, container);
    }

    /**
     * Creates a {@code hb_color_line_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hb_color_line_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code data} field. */
    @NativeType("void *")
    public long data() { return ndata(address()); }
    /** @return the value of the {@code get_color_stops} field. */
    public hb_color_line_get_color_stops_func_t get_color_stops() { return nget_color_stops(address()); }
    /** @return the value of the {@code get_color_stops_user_data} field. */
    @NativeType("void *")
    public long get_color_stops_user_data() { return nget_color_stops_user_data(address()); }
    /** @return the value of the {@code get_extend} field. */
    public hb_color_line_get_extend_func_t get_extend() { return nget_extend(address()); }
    /** @return the value of the {@code get_extend_user_data} field. */
    @NativeType("void *")
    public long get_extend_user_data() { return nget_extend_user_data(address()); }

    /** Sets the specified value to the {@code data} field. */
    public hb_color_line_t data(@NativeType("void *") long value) { ndata(address(), value); return this; }
    /** Sets the specified value to the {@code get_color_stops} field. */
    public hb_color_line_t get_color_stops(@NativeType("hb_color_line_get_color_stops_func_t") hb_color_line_get_color_stops_func_tI value) { nget_color_stops(address(), value); return this; }
    /** Sets the specified value to the {@code get_color_stops_user_data} field. */
    public hb_color_line_t get_color_stops_user_data(@NativeType("void *") long value) { nget_color_stops_user_data(address(), value); return this; }
    /** Sets the specified value to the {@code get_extend} field. */
    public hb_color_line_t get_extend(@NativeType("hb_color_line_get_extend_func_t") hb_color_line_get_extend_func_tI value) { nget_extend(address(), value); return this; }
    /** Sets the specified value to the {@code get_extend_user_data} field. */
    public hb_color_line_t get_extend_user_data(@NativeType("void *") long value) { nget_extend_user_data(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public hb_color_line_t set(
        long data,
        hb_color_line_get_color_stops_func_tI get_color_stops,
        long get_color_stops_user_data,
        hb_color_line_get_extend_func_tI get_extend,
        long get_extend_user_data
    ) {
        data(data);
        get_color_stops(get_color_stops);
        get_color_stops_user_data(get_color_stops_user_data);
        get_extend(get_extend);
        get_extend_user_data(get_extend_user_data);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public hb_color_line_t set(hb_color_line_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code hb_color_line_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hb_color_line_t malloc() {
        return new hb_color_line_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hb_color_line_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hb_color_line_t calloc() {
        return new hb_color_line_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hb_color_line_t} instance allocated with {@link BufferUtils}. */
    public static hb_color_line_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hb_color_line_t(memAddress(container), container);
    }

    /** Returns a new {@code hb_color_line_t} instance for the specified memory address. */
    public static hb_color_line_t create(long address) {
        return new hb_color_line_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_color_line_t createSafe(long address) {
        return address == NULL ? null : new hb_color_line_t(address, null);
    }

    /**
     * Returns a new {@link hb_color_line_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_color_line_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hb_color_line_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_color_line_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_color_line_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hb_color_line_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hb_color_line_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hb_color_line_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_color_line_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hb_color_line_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_color_line_t malloc(MemoryStack stack) {
        return new hb_color_line_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hb_color_line_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_color_line_t calloc(MemoryStack stack) {
        return new hb_color_line_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hb_color_line_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_color_line_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_color_line_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_color_line_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #data}. */
    public static long ndata(long struct) { return memGetAddress(struct + hb_color_line_t.DATA); }
    /** Unsafe version of {@link #get_color_stops}. */
    public static hb_color_line_get_color_stops_func_t nget_color_stops(long struct) { return hb_color_line_get_color_stops_func_t.create(memGetAddress(struct + hb_color_line_t.GET_COLOR_STOPS)); }
    /** Unsafe version of {@link #get_color_stops_user_data}. */
    public static long nget_color_stops_user_data(long struct) { return memGetAddress(struct + hb_color_line_t.GET_COLOR_STOPS_USER_DATA); }
    /** Unsafe version of {@link #get_extend}. */
    public static hb_color_line_get_extend_func_t nget_extend(long struct) { return hb_color_line_get_extend_func_t.create(memGetAddress(struct + hb_color_line_t.GET_EXTEND)); }
    /** Unsafe version of {@link #get_extend_user_data}. */
    public static long nget_extend_user_data(long struct) { return memGetAddress(struct + hb_color_line_t.GET_EXTEND_USER_DATA); }
    public static long nreserved0(long struct) { return memGetAddress(struct + hb_color_line_t.RESERVED0); }
    public static long nreserved1(long struct) { return memGetAddress(struct + hb_color_line_t.RESERVED1); }
    public static long nreserved2(long struct) { return memGetAddress(struct + hb_color_line_t.RESERVED2); }
    public static long nreserved3(long struct) { return memGetAddress(struct + hb_color_line_t.RESERVED3); }
    public static long nreserved4(long struct) { return memGetAddress(struct + hb_color_line_t.RESERVED4); }
    public static long nreserved5(long struct) { return memGetAddress(struct + hb_color_line_t.RESERVED5); }
    public static long nreserved6(long struct) { return memGetAddress(struct + hb_color_line_t.RESERVED6); }
    public static long nreserved7(long struct) { return memGetAddress(struct + hb_color_line_t.RESERVED7); }
    public static long nreserved8(long struct) { return memGetAddress(struct + hb_color_line_t.RESERVED8); }

    /** Unsafe version of {@link #data(long) data}. */
    public static void ndata(long struct, long value) { memPutAddress(struct + hb_color_line_t.DATA, check(value)); }
    /** Unsafe version of {@link #get_color_stops(hb_color_line_get_color_stops_func_tI) get_color_stops}. */
    public static void nget_color_stops(long struct, hb_color_line_get_color_stops_func_tI value) { memPutAddress(struct + hb_color_line_t.GET_COLOR_STOPS, value.address()); }
    /** Unsafe version of {@link #get_color_stops_user_data(long) get_color_stops_user_data}. */
    public static void nget_color_stops_user_data(long struct, long value) { memPutAddress(struct + hb_color_line_t.GET_COLOR_STOPS_USER_DATA, value); }
    /** Unsafe version of {@link #get_extend(hb_color_line_get_extend_func_tI) get_extend}. */
    public static void nget_extend(long struct, hb_color_line_get_extend_func_tI value) { memPutAddress(struct + hb_color_line_t.GET_EXTEND, value.address()); }
    /** Unsafe version of {@link #get_extend_user_data(long) get_extend_user_data}. */
    public static void nget_extend_user_data(long struct, long value) { memPutAddress(struct + hb_color_line_t.GET_EXTEND_USER_DATA, value); }
    public static void nreserved0(long struct, long value) { memPutAddress(struct + hb_color_line_t.RESERVED0, value); }
    public static void nreserved1(long struct, long value) { memPutAddress(struct + hb_color_line_t.RESERVED1, value); }
    public static void nreserved2(long struct, long value) { memPutAddress(struct + hb_color_line_t.RESERVED2, value); }
    public static void nreserved3(long struct, long value) { memPutAddress(struct + hb_color_line_t.RESERVED3, value); }
    public static void nreserved4(long struct, long value) { memPutAddress(struct + hb_color_line_t.RESERVED4, value); }
    public static void nreserved5(long struct, long value) { memPutAddress(struct + hb_color_line_t.RESERVED5, value); }
    public static void nreserved6(long struct, long value) { memPutAddress(struct + hb_color_line_t.RESERVED6, value); }
    public static void nreserved7(long struct, long value) { memPutAddress(struct + hb_color_line_t.RESERVED7, value); }
    public static void nreserved8(long struct, long value) { memPutAddress(struct + hb_color_line_t.RESERVED8, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + hb_color_line_t.DATA));
        check(memGetAddress(struct + hb_color_line_t.GET_COLOR_STOPS));
        check(memGetAddress(struct + hb_color_line_t.GET_EXTEND));
    }

    // -----------------------------------

    /** An array of {@link hb_color_line_t} structs. */
    public static class Buffer extends StructBuffer<hb_color_line_t, Buffer> implements NativeResource {

        private static final hb_color_line_t ELEMENT_FACTORY = hb_color_line_t.create(-1L);

        /**
         * Creates a new {@code hb_color_line_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hb_color_line_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected hb_color_line_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code data} field. */
        @NativeType("void *")
        public long data() { return hb_color_line_t.ndata(address()); }
        /** @return the value of the {@code get_color_stops} field. */
        public hb_color_line_get_color_stops_func_t get_color_stops() { return hb_color_line_t.nget_color_stops(address()); }
        /** @return the value of the {@code get_color_stops_user_data} field. */
        @NativeType("void *")
        public long get_color_stops_user_data() { return hb_color_line_t.nget_color_stops_user_data(address()); }
        /** @return the value of the {@code get_extend} field. */
        public hb_color_line_get_extend_func_t get_extend() { return hb_color_line_t.nget_extend(address()); }
        /** @return the value of the {@code get_extend_user_data} field. */
        @NativeType("void *")
        public long get_extend_user_data() { return hb_color_line_t.nget_extend_user_data(address()); }

        /** Sets the specified value to the {@code data} field. */
        public hb_color_line_t.Buffer data(@NativeType("void *") long value) { hb_color_line_t.ndata(address(), value); return this; }
        /** Sets the specified value to the {@code get_color_stops} field. */
        public hb_color_line_t.Buffer get_color_stops(@NativeType("hb_color_line_get_color_stops_func_t") hb_color_line_get_color_stops_func_tI value) { hb_color_line_t.nget_color_stops(address(), value); return this; }
        /** Sets the specified value to the {@code get_color_stops_user_data} field. */
        public hb_color_line_t.Buffer get_color_stops_user_data(@NativeType("void *") long value) { hb_color_line_t.nget_color_stops_user_data(address(), value); return this; }
        /** Sets the specified value to the {@code get_extend} field. */
        public hb_color_line_t.Buffer get_extend(@NativeType("hb_color_line_get_extend_func_t") hb_color_line_get_extend_func_tI value) { hb_color_line_t.nget_extend(address(), value); return this; }
        /** Sets the specified value to the {@code get_extend_user_data} field. */
        public hb_color_line_t.Buffer get_extend_user_data(@NativeType("void *") long value) { hb_color_line_t.nget_extend_user_data(address(), value); return this; }

    }

}
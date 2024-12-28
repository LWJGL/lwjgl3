/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SDL_SensorEvent {
 *     SDL_EventType type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     SDL_SensorID which;
 *     float data[6];
 *     Uint64 sensor_timestamp;
 * }}</pre>
 */
public class SDL_SensorEvent extends Struct<SDL_SensorEvent> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        RESERVED,
        TIMESTAMP,
        WHICH,
        DATA,
        SENSOR_TIMESTAMP;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __array(4, 6),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WHICH = layout.offsetof(3);
        DATA = layout.offsetof(4);
        SENSOR_TIMESTAMP = layout.offsetof(5);
    }

    protected SDL_SensorEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_SensorEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_SensorEvent(address, container);
    }

    /**
     * Creates a {@code SDL_SensorEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_SensorEvent(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("SDL_EventType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code reserved} field. */
    @NativeType("Uint32")
    public int reserved() { return nreserved(address()); }
    /** @return the value of the {@code timestamp} field. */
    @NativeType("Uint64")
    public long timestamp() { return ntimestamp(address()); }
    /** @return the value of the {@code which} field. */
    @NativeType("SDL_SensorID")
    public int which() { return nwhich(address()); }
    /** @return a {@link FloatBuffer} view of the {@code data} field. */
    @NativeType("float[6]")
    public FloatBuffer data() { return ndata(address()); }
    /** @return the value at the specified index of the {@code data} field. */
    public float data(int index) { return ndata(address(), index); }
    /** @return the value of the {@code sensor_timestamp} field. */
    @NativeType("Uint64")
    public long sensor_timestamp() { return nsensor_timestamp(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_SensorEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_SensorEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_SensorEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code which} field. */
    public SDL_SensorEvent which(@NativeType("SDL_SensorID") int value) { nwhich(address(), value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code data} field. */
    public SDL_SensorEvent data(@NativeType("float[6]") FloatBuffer value) { ndata(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code data} field. */
    public SDL_SensorEvent data(int index, float value) { ndata(address(), index, value); return this; }
    /** Sets the specified value to the {@code sensor_timestamp} field. */
    public SDL_SensorEvent sensor_timestamp(@NativeType("Uint64") long value) { nsensor_timestamp(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_SensorEvent set(
        int type,
        int reserved,
        long timestamp,
        int which,
        FloatBuffer data,
        long sensor_timestamp
    ) {
        type(type);
        reserved(reserved);
        timestamp(timestamp);
        which(which);
        data(data);
        sensor_timestamp(sensor_timestamp);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_SensorEvent set(SDL_SensorEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_SensorEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_SensorEvent malloc() {
        return new SDL_SensorEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_SensorEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_SensorEvent calloc() {
        return new SDL_SensorEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_SensorEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_SensorEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_SensorEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_SensorEvent} instance for the specified memory address. */
    public static SDL_SensorEvent create(long address) {
        return new SDL_SensorEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_SensorEvent createSafe(long address) {
        return address == NULL ? null : new SDL_SensorEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_SensorEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_SensorEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_SensorEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_SensorEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_SensorEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_SensorEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_SensorEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_SensorEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_SensorEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_SensorEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_SensorEvent malloc(MemoryStack stack) {
        return new SDL_SensorEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_SensorEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_SensorEvent calloc(MemoryStack stack) {
        return new SDL_SensorEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_SensorEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_SensorEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_SensorEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_SensorEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_SensorEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_SensorEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_SensorEvent.TIMESTAMP); }
    /** Unsafe version of {@link #which}. */
    public static int nwhich(long struct) { return memGetInt(struct + SDL_SensorEvent.WHICH); }
    /** Unsafe version of {@link #data}. */
    public static FloatBuffer ndata(long struct) { return memFloatBuffer(struct + SDL_SensorEvent.DATA, 6); }
    /** Unsafe version of {@link #data(int) data}. */
    public static float ndata(long struct, int index) {
        return memGetFloat(struct + SDL_SensorEvent.DATA + check(index, 6) * 4);
    }
    /** Unsafe version of {@link #sensor_timestamp}. */
    public static long nsensor_timestamp(long struct) { return memGetLong(struct + SDL_SensorEvent.SENSOR_TIMESTAMP); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_SensorEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_SensorEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_SensorEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #which(int) which}. */
    public static void nwhich(long struct, int value) { memPutInt(struct + SDL_SensorEvent.WHICH, value); }
    /** Unsafe version of {@link #data(FloatBuffer) data}. */
    public static void ndata(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 6); }
        memCopy(memAddress(value), struct + SDL_SensorEvent.DATA, value.remaining() * 4);
    }
    /** Unsafe version of {@link #data(int, float) data}. */
    public static void ndata(long struct, int index, float value) {
        memPutFloat(struct + SDL_SensorEvent.DATA + check(index, 6) * 4, value);
    }
    /** Unsafe version of {@link #sensor_timestamp(long) sensor_timestamp}. */
    public static void nsensor_timestamp(long struct, long value) { memPutLong(struct + SDL_SensorEvent.SENSOR_TIMESTAMP, value); }

    // -----------------------------------

    /** An array of {@link SDL_SensorEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_SensorEvent, Buffer> implements NativeResource {

        private static final SDL_SensorEvent ELEMENT_FACTORY = SDL_SensorEvent.create(-1L);

        /**
         * Creates a new {@code SDL_SensorEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_SensorEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_SensorEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_SensorEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_SensorEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_SensorEvent.ntimestamp(address()); }
        /** @return the value of the {@code which} field. */
        @NativeType("SDL_SensorID")
        public int which() { return SDL_SensorEvent.nwhich(address()); }
        /** @return a {@link FloatBuffer} view of the {@code data} field. */
        @NativeType("float[6]")
        public FloatBuffer data() { return SDL_SensorEvent.ndata(address()); }
        /** @return the value at the specified index of the {@code data} field. */
        public float data(int index) { return SDL_SensorEvent.ndata(address(), index); }
        /** @return the value of the {@code sensor_timestamp} field. */
        @NativeType("Uint64")
        public long sensor_timestamp() { return SDL_SensorEvent.nsensor_timestamp(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_SensorEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_SensorEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_SensorEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_SensorEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_SensorEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_SensorEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code which} field. */
        public SDL_SensorEvent.Buffer which(@NativeType("SDL_SensorID") int value) { SDL_SensorEvent.nwhich(address(), value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code data} field. */
        public SDL_SensorEvent.Buffer data(@NativeType("float[6]") FloatBuffer value) { SDL_SensorEvent.ndata(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code data} field. */
        public SDL_SensorEvent.Buffer data(int index, float value) { SDL_SensorEvent.ndata(address(), index, value); return this; }
        /** Sets the specified value to the {@code sensor_timestamp} field. */
        public SDL_SensorEvent.Buffer sensor_timestamp(@NativeType("Uint64") long value) { SDL_SensorEvent.nsensor_timestamp(address(), value); return this; }

    }

}
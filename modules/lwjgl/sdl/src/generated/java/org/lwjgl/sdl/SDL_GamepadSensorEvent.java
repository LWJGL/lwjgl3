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
 * struct SDL_GamepadSensorEvent {
 *     SDL_EventType type;
 *     Uint32 reserved;
 *     Uint64 timestamp;
 *     SDL_JoystickID which;
 *     Sint32 sensor;
 *     float data[3];
 *     Uint64 sensor_timestamp;
 * }}</pre>
 */
public class SDL_GamepadSensorEvent extends Struct<SDL_GamepadSensorEvent> implements NativeResource {

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
        SENSOR,
        DATA,
        SENSOR_TIMESTAMP;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __array(4, 3),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
        TIMESTAMP = layout.offsetof(2);
        WHICH = layout.offsetof(3);
        SENSOR = layout.offsetof(4);
        DATA = layout.offsetof(5);
        SENSOR_TIMESTAMP = layout.offsetof(6);
    }

    protected SDL_GamepadSensorEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_GamepadSensorEvent create(long address, @Nullable ByteBuffer container) {
        return new SDL_GamepadSensorEvent(address, container);
    }

    /**
     * Creates a {@code SDL_GamepadSensorEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_GamepadSensorEvent(ByteBuffer container) {
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
    @NativeType("SDL_JoystickID")
    public int which() { return nwhich(address()); }
    /** @return the value of the {@code sensor} field. */
    @NativeType("Sint32")
    public int sensor() { return nsensor(address()); }
    /** @return a {@link FloatBuffer} view of the {@code data} field. */
    @NativeType("float[3]")
    public FloatBuffer data() { return ndata(address()); }
    /** @return the value at the specified index of the {@code data} field. */
    public float data(int index) { return ndata(address(), index); }
    /** @return the value of the {@code sensor_timestamp} field. */
    @NativeType("Uint64")
    public long sensor_timestamp() { return nsensor_timestamp(address()); }

    /** Sets the specified value to the {@code type} field. */
    public SDL_GamepadSensorEvent type(@NativeType("SDL_EventType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public SDL_GamepadSensorEvent reserved(@NativeType("Uint32") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code timestamp} field. */
    public SDL_GamepadSensorEvent timestamp(@NativeType("Uint64") long value) { ntimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code which} field. */
    public SDL_GamepadSensorEvent which(@NativeType("SDL_JoystickID") int value) { nwhich(address(), value); return this; }
    /** Sets the specified value to the {@code sensor} field. */
    public SDL_GamepadSensorEvent sensor(@NativeType("Sint32") int value) { nsensor(address(), value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code data} field. */
    public SDL_GamepadSensorEvent data(@NativeType("float[3]") FloatBuffer value) { ndata(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code data} field. */
    public SDL_GamepadSensorEvent data(int index, float value) { ndata(address(), index, value); return this; }
    /** Sets the specified value to the {@code sensor_timestamp} field. */
    public SDL_GamepadSensorEvent sensor_timestamp(@NativeType("Uint64") long value) { nsensor_timestamp(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_GamepadSensorEvent set(
        int type,
        int reserved,
        long timestamp,
        int which,
        int sensor,
        FloatBuffer data,
        long sensor_timestamp
    ) {
        type(type);
        reserved(reserved);
        timestamp(timestamp);
        which(which);
        sensor(sensor);
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
    public SDL_GamepadSensorEvent set(SDL_GamepadSensorEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_GamepadSensorEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_GamepadSensorEvent malloc() {
        return new SDL_GamepadSensorEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_GamepadSensorEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_GamepadSensorEvent calloc() {
        return new SDL_GamepadSensorEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_GamepadSensorEvent} instance allocated with {@link BufferUtils}. */
    public static SDL_GamepadSensorEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GamepadSensorEvent(memAddress(container), container);
    }

    /** Returns a new {@code SDL_GamepadSensorEvent} instance for the specified memory address. */
    public static SDL_GamepadSensorEvent create(long address) {
        return new SDL_GamepadSensorEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_GamepadSensorEvent createSafe(long address) {
        return address == NULL ? null : new SDL_GamepadSensorEvent(address, null);
    }

    /**
     * Returns a new {@link SDL_GamepadSensorEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadSensorEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_GamepadSensorEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadSensorEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GamepadSensorEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadSensorEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_GamepadSensorEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadSensorEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_GamepadSensorEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_GamepadSensorEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GamepadSensorEvent malloc(MemoryStack stack) {
        return new SDL_GamepadSensorEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_GamepadSensorEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_GamepadSensorEvent calloc(MemoryStack stack) {
        return new SDL_GamepadSensorEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_GamepadSensorEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadSensorEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_GamepadSensorEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_GamepadSensorEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + SDL_GamepadSensorEvent.TYPE); }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return memGetInt(struct + SDL_GamepadSensorEvent.RESERVED); }
    /** Unsafe version of {@link #timestamp}. */
    public static long ntimestamp(long struct) { return memGetLong(struct + SDL_GamepadSensorEvent.TIMESTAMP); }
    /** Unsafe version of {@link #which}. */
    public static int nwhich(long struct) { return memGetInt(struct + SDL_GamepadSensorEvent.WHICH); }
    /** Unsafe version of {@link #sensor}. */
    public static int nsensor(long struct) { return memGetInt(struct + SDL_GamepadSensorEvent.SENSOR); }
    /** Unsafe version of {@link #data}. */
    public static FloatBuffer ndata(long struct) { return memFloatBuffer(struct + SDL_GamepadSensorEvent.DATA, 3); }
    /** Unsafe version of {@link #data(int) data}. */
    public static float ndata(long struct, int index) {
        return memGetFloat(struct + SDL_GamepadSensorEvent.DATA + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #sensor_timestamp}. */
    public static long nsensor_timestamp(long struct) { return memGetLong(struct + SDL_GamepadSensorEvent.SENSOR_TIMESTAMP); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + SDL_GamepadSensorEvent.TYPE, value); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { memPutInt(struct + SDL_GamepadSensorEvent.RESERVED, value); }
    /** Unsafe version of {@link #timestamp(long) timestamp}. */
    public static void ntimestamp(long struct, long value) { memPutLong(struct + SDL_GamepadSensorEvent.TIMESTAMP, value); }
    /** Unsafe version of {@link #which(int) which}. */
    public static void nwhich(long struct, int value) { memPutInt(struct + SDL_GamepadSensorEvent.WHICH, value); }
    /** Unsafe version of {@link #sensor(int) sensor}. */
    public static void nsensor(long struct, int value) { memPutInt(struct + SDL_GamepadSensorEvent.SENSOR, value); }
    /** Unsafe version of {@link #data(FloatBuffer) data}. */
    public static void ndata(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + SDL_GamepadSensorEvent.DATA, value.remaining() * 4);
    }
    /** Unsafe version of {@link #data(int, float) data}. */
    public static void ndata(long struct, int index, float value) {
        memPutFloat(struct + SDL_GamepadSensorEvent.DATA + check(index, 3) * 4, value);
    }
    /** Unsafe version of {@link #sensor_timestamp(long) sensor_timestamp}. */
    public static void nsensor_timestamp(long struct, long value) { memPutLong(struct + SDL_GamepadSensorEvent.SENSOR_TIMESTAMP, value); }

    // -----------------------------------

    /** An array of {@link SDL_GamepadSensorEvent} structs. */
    public static class Buffer extends StructBuffer<SDL_GamepadSensorEvent, Buffer> implements NativeResource {

        private static final SDL_GamepadSensorEvent ELEMENT_FACTORY = SDL_GamepadSensorEvent.create(-1L);

        /**
         * Creates a new {@code SDL_GamepadSensorEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_GamepadSensorEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_GamepadSensorEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("SDL_EventType")
        public int type() { return SDL_GamepadSensorEvent.ntype(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("Uint32")
        public int reserved() { return SDL_GamepadSensorEvent.nreserved(address()); }
        /** @return the value of the {@code timestamp} field. */
        @NativeType("Uint64")
        public long timestamp() { return SDL_GamepadSensorEvent.ntimestamp(address()); }
        /** @return the value of the {@code which} field. */
        @NativeType("SDL_JoystickID")
        public int which() { return SDL_GamepadSensorEvent.nwhich(address()); }
        /** @return the value of the {@code sensor} field. */
        @NativeType("Sint32")
        public int sensor() { return SDL_GamepadSensorEvent.nsensor(address()); }
        /** @return a {@link FloatBuffer} view of the {@code data} field. */
        @NativeType("float[3]")
        public FloatBuffer data() { return SDL_GamepadSensorEvent.ndata(address()); }
        /** @return the value at the specified index of the {@code data} field. */
        public float data(int index) { return SDL_GamepadSensorEvent.ndata(address(), index); }
        /** @return the value of the {@code sensor_timestamp} field. */
        @NativeType("Uint64")
        public long sensor_timestamp() { return SDL_GamepadSensorEvent.nsensor_timestamp(address()); }

        /** Sets the specified value to the {@code type} field. */
        public SDL_GamepadSensorEvent.Buffer type(@NativeType("SDL_EventType") int value) { SDL_GamepadSensorEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public SDL_GamepadSensorEvent.Buffer reserved(@NativeType("Uint32") int value) { SDL_GamepadSensorEvent.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code timestamp} field. */
        public SDL_GamepadSensorEvent.Buffer timestamp(@NativeType("Uint64") long value) { SDL_GamepadSensorEvent.ntimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code which} field. */
        public SDL_GamepadSensorEvent.Buffer which(@NativeType("SDL_JoystickID") int value) { SDL_GamepadSensorEvent.nwhich(address(), value); return this; }
        /** Sets the specified value to the {@code sensor} field. */
        public SDL_GamepadSensorEvent.Buffer sensor(@NativeType("Sint32") int value) { SDL_GamepadSensorEvent.nsensor(address(), value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code data} field. */
        public SDL_GamepadSensorEvent.Buffer data(@NativeType("float[3]") FloatBuffer value) { SDL_GamepadSensorEvent.ndata(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code data} field. */
        public SDL_GamepadSensorEvent.Buffer data(int index, float value) { SDL_GamepadSensorEvent.ndata(address(), index, value); return this; }
        /** Sets the specified value to the {@code sensor_timestamp} field. */
        public SDL_GamepadSensorEvent.Buffer sensor_timestamp(@NativeType("Uint64") long value) { SDL_GamepadSensorEvent.nsensor_timestamp(address(), value); return this; }

    }

}
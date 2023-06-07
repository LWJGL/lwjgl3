/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

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
 * struct FMOD_OUTPUT_OBJECT3DINFO {
 *     float * buffer;
 *     unsigned int bufferlength;
 *     {@link FMOD_VECTOR FMOD_VECTOR} position;
 *     float gain;
 *     float spread;
 *     float priority;
 * }</code></pre>
 */
@NativeType("struct FMOD_OUTPUT_OBJECT3DINFO")
public class FMOD_OUTPUT_OBJECT3DINFO extends Struct<FMOD_OUTPUT_OBJECT3DINFO> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BUFFER,
        BUFFERLENGTH,
        POSITION,
        GAIN,
        SPREAD,
        PRIORITY;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(FMOD_VECTOR.SIZEOF, FMOD_VECTOR.ALIGNOF),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BUFFER = layout.offsetof(0);
        BUFFERLENGTH = layout.offsetof(1);
        POSITION = layout.offsetof(2);
        GAIN = layout.offsetof(3);
        SPREAD = layout.offsetof(4);
        PRIORITY = layout.offsetof(5);
    }

    protected FMOD_OUTPUT_OBJECT3DINFO(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_OUTPUT_OBJECT3DINFO create(long address, @Nullable ByteBuffer container) {
        return new FMOD_OUTPUT_OBJECT3DINFO(address, container);
    }

    /**
     * Creates a {@code FMOD_OUTPUT_OBJECT3DINFO} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_OUTPUT_OBJECT3DINFO(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code buffer} field. */
    @NativeType("float *")
    public FloatBuffer buffer() { return nbuffer(address()); }
    /** @return the value of the {@code bufferlength} field. */
    @NativeType("unsigned int")
    public int bufferlength() { return nbufferlength(address()); }
    /** @return a {@link FMOD_VECTOR} view of the {@code position} field. */
    public FMOD_VECTOR position$() { return nposition$(address()); }
    /** @return the value of the {@code gain} field. */
    public float gain() { return ngain(address()); }
    /** @return the value of the {@code spread} field. */
    public float spread() { return nspread(address()); }
    /** @return the value of the {@code priority} field. */
    public float priority() { return npriority(address()); }

    /** Sets the address of the specified {@link FloatBuffer} to the {@code buffer} field. */
    public FMOD_OUTPUT_OBJECT3DINFO buffer(@NativeType("float *") FloatBuffer value) { nbuffer(address(), value); return this; }
    /** Copies the specified {@link FMOD_VECTOR} to the {@code position} field. */
    public FMOD_OUTPUT_OBJECT3DINFO position$(FMOD_VECTOR value) { nposition$(address(), value); return this; }
    /** Passes the {@code position} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_OUTPUT_OBJECT3DINFO position$(java.util.function.Consumer<FMOD_VECTOR> consumer) { consumer.accept(position$()); return this; }
    /** Sets the specified value to the {@code gain} field. */
    public FMOD_OUTPUT_OBJECT3DINFO gain(float value) { ngain(address(), value); return this; }
    /** Sets the specified value to the {@code spread} field. */
    public FMOD_OUTPUT_OBJECT3DINFO spread(float value) { nspread(address(), value); return this; }
    /** Sets the specified value to the {@code priority} field. */
    public FMOD_OUTPUT_OBJECT3DINFO priority(float value) { npriority(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_OUTPUT_OBJECT3DINFO set(
        FloatBuffer buffer,
        FMOD_VECTOR position$,
        float gain,
        float spread,
        float priority
    ) {
        buffer(buffer);
        position$(position$);
        gain(gain);
        spread(spread);
        priority(priority);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_OUTPUT_OBJECT3DINFO set(FMOD_OUTPUT_OBJECT3DINFO src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_OUTPUT_OBJECT3DINFO} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_OUTPUT_OBJECT3DINFO malloc() {
        return new FMOD_OUTPUT_OBJECT3DINFO(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_OUTPUT_OBJECT3DINFO} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_OUTPUT_OBJECT3DINFO calloc() {
        return new FMOD_OUTPUT_OBJECT3DINFO(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_OUTPUT_OBJECT3DINFO} instance allocated with {@link BufferUtils}. */
    public static FMOD_OUTPUT_OBJECT3DINFO create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_OUTPUT_OBJECT3DINFO(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_OUTPUT_OBJECT3DINFO} instance for the specified memory address. */
    public static FMOD_OUTPUT_OBJECT3DINFO create(long address) {
        return new FMOD_OUTPUT_OBJECT3DINFO(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_OUTPUT_OBJECT3DINFO createSafe(long address) {
        return address == NULL ? null : new FMOD_OUTPUT_OBJECT3DINFO(address, null);
    }

    /**
     * Returns a new {@link FMOD_OUTPUT_OBJECT3DINFO.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_OUTPUT_OBJECT3DINFO.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_OUTPUT_OBJECT3DINFO.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_OUTPUT_OBJECT3DINFO.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_OUTPUT_OBJECT3DINFO.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_OUTPUT_OBJECT3DINFO.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_OUTPUT_OBJECT3DINFO.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_OUTPUT_OBJECT3DINFO.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_OUTPUT_OBJECT3DINFO.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_OUTPUT_OBJECT3DINFO} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_OUTPUT_OBJECT3DINFO malloc(MemoryStack stack) {
        return new FMOD_OUTPUT_OBJECT3DINFO(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_OUTPUT_OBJECT3DINFO} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_OUTPUT_OBJECT3DINFO calloc(MemoryStack stack) {
        return new FMOD_OUTPUT_OBJECT3DINFO(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_OUTPUT_OBJECT3DINFO.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_OUTPUT_OBJECT3DINFO.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_OUTPUT_OBJECT3DINFO.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_OUTPUT_OBJECT3DINFO.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #buffer() buffer}. */
    public static FloatBuffer nbuffer(long struct) { return memFloatBuffer(memGetAddress(struct + FMOD_OUTPUT_OBJECT3DINFO.BUFFER), nbufferlength(struct)); }
    /** Unsafe version of {@link #bufferlength}. */
    public static int nbufferlength(long struct) { return UNSAFE.getInt(null, struct + FMOD_OUTPUT_OBJECT3DINFO.BUFFERLENGTH); }
    /** Unsafe version of {@link #position$}. */
    public static FMOD_VECTOR nposition$(long struct) { return FMOD_VECTOR.create(struct + FMOD_OUTPUT_OBJECT3DINFO.POSITION); }
    /** Unsafe version of {@link #gain}. */
    public static float ngain(long struct) { return UNSAFE.getFloat(null, struct + FMOD_OUTPUT_OBJECT3DINFO.GAIN); }
    /** Unsafe version of {@link #spread}. */
    public static float nspread(long struct) { return UNSAFE.getFloat(null, struct + FMOD_OUTPUT_OBJECT3DINFO.SPREAD); }
    /** Unsafe version of {@link #priority}. */
    public static float npriority(long struct) { return UNSAFE.getFloat(null, struct + FMOD_OUTPUT_OBJECT3DINFO.PRIORITY); }

    /** Unsafe version of {@link #buffer(FloatBuffer) buffer}. */
    public static void nbuffer(long struct, FloatBuffer value) { memPutAddress(struct + FMOD_OUTPUT_OBJECT3DINFO.BUFFER, memAddress(value)); nbufferlength(struct, value.remaining()); }
    /** Sets the specified value to the {@code bufferlength} field of the specified {@code struct}. */
    public static void nbufferlength(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_OUTPUT_OBJECT3DINFO.BUFFERLENGTH, value); }
    /** Unsafe version of {@link #position$(FMOD_VECTOR) position$}. */
    public static void nposition$(long struct, FMOD_VECTOR value) { memCopy(value.address(), struct + FMOD_OUTPUT_OBJECT3DINFO.POSITION, FMOD_VECTOR.SIZEOF); }
    /** Unsafe version of {@link #gain(float) gain}. */
    public static void ngain(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_OUTPUT_OBJECT3DINFO.GAIN, value); }
    /** Unsafe version of {@link #spread(float) spread}. */
    public static void nspread(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_OUTPUT_OBJECT3DINFO.SPREAD, value); }
    /** Unsafe version of {@link #priority(float) priority}. */
    public static void npriority(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_OUTPUT_OBJECT3DINFO.PRIORITY, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_OUTPUT_OBJECT3DINFO.BUFFER));
    }

    // -----------------------------------

    /** An array of {@link FMOD_OUTPUT_OBJECT3DINFO} structs. */
    public static class Buffer extends StructBuffer<FMOD_OUTPUT_OBJECT3DINFO, Buffer> implements NativeResource {

        private static final FMOD_OUTPUT_OBJECT3DINFO ELEMENT_FACTORY = FMOD_OUTPUT_OBJECT3DINFO.create(-1L);

        /**
         * Creates a new {@code FMOD_OUTPUT_OBJECT3DINFO.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_OUTPUT_OBJECT3DINFO#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_OUTPUT_OBJECT3DINFO getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code buffer} field. */
        @NativeType("float *")
        public FloatBuffer buffer() { return FMOD_OUTPUT_OBJECT3DINFO.nbuffer(address()); }
        /** @return the value of the {@code bufferlength} field. */
        @NativeType("unsigned int")
        public int bufferlength() { return FMOD_OUTPUT_OBJECT3DINFO.nbufferlength(address()); }
        /** @return a {@link FMOD_VECTOR} view of the {@code position} field. */
        public FMOD_VECTOR position$() { return FMOD_OUTPUT_OBJECT3DINFO.nposition$(address()); }
        /** @return the value of the {@code gain} field. */
        public float gain() { return FMOD_OUTPUT_OBJECT3DINFO.ngain(address()); }
        /** @return the value of the {@code spread} field. */
        public float spread() { return FMOD_OUTPUT_OBJECT3DINFO.nspread(address()); }
        /** @return the value of the {@code priority} field. */
        public float priority() { return FMOD_OUTPUT_OBJECT3DINFO.npriority(address()); }

        /** Sets the address of the specified {@link FloatBuffer} to the {@code buffer} field. */
        public FMOD_OUTPUT_OBJECT3DINFO.Buffer buffer(@NativeType("float *") FloatBuffer value) { FMOD_OUTPUT_OBJECT3DINFO.nbuffer(address(), value); return this; }
        /** Copies the specified {@link FMOD_VECTOR} to the {@code position} field. */
        public FMOD_OUTPUT_OBJECT3DINFO.Buffer position$(FMOD_VECTOR value) { FMOD_OUTPUT_OBJECT3DINFO.nposition$(address(), value); return this; }
        /** Passes the {@code position} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_OUTPUT_OBJECT3DINFO.Buffer position$(java.util.function.Consumer<FMOD_VECTOR> consumer) { consumer.accept(position$()); return this; }
        /** Sets the specified value to the {@code gain} field. */
        public FMOD_OUTPUT_OBJECT3DINFO.Buffer gain(float value) { FMOD_OUTPUT_OBJECT3DINFO.ngain(address(), value); return this; }
        /** Sets the specified value to the {@code spread} field. */
        public FMOD_OUTPUT_OBJECT3DINFO.Buffer spread(float value) { FMOD_OUTPUT_OBJECT3DINFO.nspread(address(), value); return this; }
        /** Sets the specified value to the {@code priority} field. */
        public FMOD_OUTPUT_OBJECT3DINFO.Buffer priority(float value) { FMOD_OUTPUT_OBJECT3DINFO.npriority(address(), value); return this; }

    }

}
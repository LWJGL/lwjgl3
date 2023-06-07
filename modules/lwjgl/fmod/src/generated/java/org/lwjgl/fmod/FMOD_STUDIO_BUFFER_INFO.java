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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FMOD_STUDIO_BUFFER_INFO {
 *     int currentusage;
 *     int peakusage;
 *     int capacity;
 *     int stallcount;
 *     float stalltime;
 * }</code></pre>
 */
public class FMOD_STUDIO_BUFFER_INFO extends Struct<FMOD_STUDIO_BUFFER_INFO> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CURRENTUSAGE,
        PEAKUSAGE,
        CAPACITY,
        STALLCOUNT,
        STALLTIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CURRENTUSAGE = layout.offsetof(0);
        PEAKUSAGE = layout.offsetof(1);
        CAPACITY = layout.offsetof(2);
        STALLCOUNT = layout.offsetof(3);
        STALLTIME = layout.offsetof(4);
    }

    protected FMOD_STUDIO_BUFFER_INFO(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_STUDIO_BUFFER_INFO create(long address, @Nullable ByteBuffer container) {
        return new FMOD_STUDIO_BUFFER_INFO(address, container);
    }

    /**
     * Creates a {@code FMOD_STUDIO_BUFFER_INFO} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_STUDIO_BUFFER_INFO(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code currentusage} field. */
    public int currentusage() { return ncurrentusage(address()); }
    /** @return the value of the {@code peakusage} field. */
    public int peakusage() { return npeakusage(address()); }
    /** @return the value of the {@code capacity} field. */
    public int capacity$() { return ncapacity$(address()); }
    /** @return the value of the {@code stallcount} field. */
    public int stallcount() { return nstallcount(address()); }
    /** @return the value of the {@code stalltime} field. */
    public float stalltime() { return nstalltime(address()); }

    /** Sets the specified value to the {@code currentusage} field. */
    public FMOD_STUDIO_BUFFER_INFO currentusage(int value) { ncurrentusage(address(), value); return this; }
    /** Sets the specified value to the {@code peakusage} field. */
    public FMOD_STUDIO_BUFFER_INFO peakusage(int value) { npeakusage(address(), value); return this; }
    /** Sets the specified value to the {@code capacity} field. */
    public FMOD_STUDIO_BUFFER_INFO capacity$(int value) { ncapacity$(address(), value); return this; }
    /** Sets the specified value to the {@code stallcount} field. */
    public FMOD_STUDIO_BUFFER_INFO stallcount(int value) { nstallcount(address(), value); return this; }
    /** Sets the specified value to the {@code stalltime} field. */
    public FMOD_STUDIO_BUFFER_INFO stalltime(float value) { nstalltime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_STUDIO_BUFFER_INFO set(
        int currentusage,
        int peakusage,
        int capacity$,
        int stallcount,
        float stalltime
    ) {
        currentusage(currentusage);
        peakusage(peakusage);
        capacity$(capacity$);
        stallcount(stallcount);
        stalltime(stalltime);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_STUDIO_BUFFER_INFO set(FMOD_STUDIO_BUFFER_INFO src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_STUDIO_BUFFER_INFO} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_BUFFER_INFO malloc() {
        return new FMOD_STUDIO_BUFFER_INFO(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_BUFFER_INFO} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_BUFFER_INFO calloc() {
        return new FMOD_STUDIO_BUFFER_INFO(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_BUFFER_INFO} instance allocated with {@link BufferUtils}. */
    public static FMOD_STUDIO_BUFFER_INFO create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_STUDIO_BUFFER_INFO(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_STUDIO_BUFFER_INFO} instance for the specified memory address. */
    public static FMOD_STUDIO_BUFFER_INFO create(long address) {
        return new FMOD_STUDIO_BUFFER_INFO(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_STUDIO_BUFFER_INFO createSafe(long address) {
        return address == NULL ? null : new FMOD_STUDIO_BUFFER_INFO(address, null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_BUFFER_INFO.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_BUFFER_INFO.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_BUFFER_INFO.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_BUFFER_INFO.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_BUFFER_INFO.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_BUFFER_INFO.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_STUDIO_BUFFER_INFO.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_BUFFER_INFO.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_STUDIO_BUFFER_INFO.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_BUFFER_INFO} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_BUFFER_INFO malloc(MemoryStack stack) {
        return new FMOD_STUDIO_BUFFER_INFO(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_BUFFER_INFO} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_BUFFER_INFO calloc(MemoryStack stack) {
        return new FMOD_STUDIO_BUFFER_INFO(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_BUFFER_INFO.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_BUFFER_INFO.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_BUFFER_INFO.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_BUFFER_INFO.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #currentusage}. */
    public static int ncurrentusage(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_BUFFER_INFO.CURRENTUSAGE); }
    /** Unsafe version of {@link #peakusage}. */
    public static int npeakusage(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_BUFFER_INFO.PEAKUSAGE); }
    /** Unsafe version of {@link #capacity$}. */
    public static int ncapacity$(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_BUFFER_INFO.CAPACITY); }
    /** Unsafe version of {@link #stallcount}. */
    public static int nstallcount(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_BUFFER_INFO.STALLCOUNT); }
    /** Unsafe version of {@link #stalltime}. */
    public static float nstalltime(long struct) { return UNSAFE.getFloat(null, struct + FMOD_STUDIO_BUFFER_INFO.STALLTIME); }

    /** Unsafe version of {@link #currentusage(int) currentusage}. */
    public static void ncurrentusage(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_BUFFER_INFO.CURRENTUSAGE, value); }
    /** Unsafe version of {@link #peakusage(int) peakusage}. */
    public static void npeakusage(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_BUFFER_INFO.PEAKUSAGE, value); }
    /** Unsafe version of {@link #capacity$(int) capacity$}. */
    public static void ncapacity$(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_BUFFER_INFO.CAPACITY, value); }
    /** Unsafe version of {@link #stallcount(int) stallcount}. */
    public static void nstallcount(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_BUFFER_INFO.STALLCOUNT, value); }
    /** Unsafe version of {@link #stalltime(float) stalltime}. */
    public static void nstalltime(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_STUDIO_BUFFER_INFO.STALLTIME, value); }

    // -----------------------------------

    /** An array of {@link FMOD_STUDIO_BUFFER_INFO} structs. */
    public static class Buffer extends StructBuffer<FMOD_STUDIO_BUFFER_INFO, Buffer> implements NativeResource {

        private static final FMOD_STUDIO_BUFFER_INFO ELEMENT_FACTORY = FMOD_STUDIO_BUFFER_INFO.create(-1L);

        /**
         * Creates a new {@code FMOD_STUDIO_BUFFER_INFO.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_STUDIO_BUFFER_INFO#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_STUDIO_BUFFER_INFO getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code currentusage} field. */
        public int currentusage() { return FMOD_STUDIO_BUFFER_INFO.ncurrentusage(address()); }
        /** @return the value of the {@code peakusage} field. */
        public int peakusage() { return FMOD_STUDIO_BUFFER_INFO.npeakusage(address()); }
        /** @return the value of the {@code capacity} field. */
        public int capacity$() { return FMOD_STUDIO_BUFFER_INFO.ncapacity$(address()); }
        /** @return the value of the {@code stallcount} field. */
        public int stallcount() { return FMOD_STUDIO_BUFFER_INFO.nstallcount(address()); }
        /** @return the value of the {@code stalltime} field. */
        public float stalltime() { return FMOD_STUDIO_BUFFER_INFO.nstalltime(address()); }

        /** Sets the specified value to the {@code currentusage} field. */
        public FMOD_STUDIO_BUFFER_INFO.Buffer currentusage(int value) { FMOD_STUDIO_BUFFER_INFO.ncurrentusage(address(), value); return this; }
        /** Sets the specified value to the {@code peakusage} field. */
        public FMOD_STUDIO_BUFFER_INFO.Buffer peakusage(int value) { FMOD_STUDIO_BUFFER_INFO.npeakusage(address(), value); return this; }
        /** Sets the specified value to the {@code capacity} field. */
        public FMOD_STUDIO_BUFFER_INFO.Buffer capacity$(int value) { FMOD_STUDIO_BUFFER_INFO.ncapacity$(address(), value); return this; }
        /** Sets the specified value to the {@code stallcount} field. */
        public FMOD_STUDIO_BUFFER_INFO.Buffer stallcount(int value) { FMOD_STUDIO_BUFFER_INFO.nstallcount(address(), value); return this; }
        /** Sets the specified value to the {@code stalltime} field. */
        public FMOD_STUDIO_BUFFER_INFO.Buffer stalltime(float value) { FMOD_STUDIO_BUFFER_INFO.nstalltime(address(), value); return this; }

    }

}
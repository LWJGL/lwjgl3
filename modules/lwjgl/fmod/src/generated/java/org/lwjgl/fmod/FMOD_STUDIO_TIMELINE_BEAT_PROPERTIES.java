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
 * struct FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES {
 *     int bar;
 *     int beat;
 *     int position;
 *     float tempo;
 *     int timesignatureupper;
 *     int timesignaturelower;
 * }</code></pre>
 */
public class FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES extends Struct<FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BAR,
        BEAT,
        POSITION,
        TEMPO,
        TIMESIGNATUREUPPER,
        TIMESIGNATURELOWER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BAR = layout.offsetof(0);
        BEAT = layout.offsetof(1);
        POSITION = layout.offsetof(2);
        TEMPO = layout.offsetof(3);
        TIMESIGNATUREUPPER = layout.offsetof(4);
        TIMESIGNATURELOWER = layout.offsetof(5);
    }

    protected FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES create(long address, @Nullable ByteBuffer container) {
        return new FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES(address, container);
    }

    /**
     * Creates a {@code FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code bar} field. */
    public int bar() { return nbar(address()); }
    /** @return the value of the {@code beat} field. */
    public int beat() { return nbeat(address()); }
    /** @return the value of the {@code position} field. */
    public int position$() { return nposition$(address()); }
    /** @return the value of the {@code tempo} field. */
    public float tempo() { return ntempo(address()); }
    /** @return the value of the {@code timesignatureupper} field. */
    public int timesignatureupper() { return ntimesignatureupper(address()); }
    /** @return the value of the {@code timesignaturelower} field. */
    public int timesignaturelower() { return ntimesignaturelower(address()); }

    /** Sets the specified value to the {@code bar} field. */
    public FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES bar(int value) { nbar(address(), value); return this; }
    /** Sets the specified value to the {@code beat} field. */
    public FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES beat(int value) { nbeat(address(), value); return this; }
    /** Sets the specified value to the {@code position} field. */
    public FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES position$(int value) { nposition$(address(), value); return this; }
    /** Sets the specified value to the {@code tempo} field. */
    public FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES tempo(float value) { ntempo(address(), value); return this; }
    /** Sets the specified value to the {@code timesignatureupper} field. */
    public FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES timesignatureupper(int value) { ntimesignatureupper(address(), value); return this; }
    /** Sets the specified value to the {@code timesignaturelower} field. */
    public FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES timesignaturelower(int value) { ntimesignaturelower(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES set(
        int bar,
        int beat,
        int position$,
        float tempo,
        int timesignatureupper,
        int timesignaturelower
    ) {
        bar(bar);
        beat(beat);
        position$(position$);
        tempo(tempo);
        timesignatureupper(timesignatureupper);
        timesignaturelower(timesignaturelower);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES set(FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES malloc() {
        return new FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES calloc() {
        return new FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES} instance allocated with {@link BufferUtils}. */
    public static FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES} instance for the specified memory address. */
    public static FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES create(long address) {
        return new FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES createSafe(long address) {
        return address == NULL ? null : new FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES(address, null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES malloc(MemoryStack stack) {
        return new FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES calloc(MemoryStack stack) {
        return new FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bar}. */
    public static int nbar(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.BAR); }
    /** Unsafe version of {@link #beat}. */
    public static int nbeat(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.BEAT); }
    /** Unsafe version of {@link #position$}. */
    public static int nposition$(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.POSITION); }
    /** Unsafe version of {@link #tempo}. */
    public static float ntempo(long struct) { return UNSAFE.getFloat(null, struct + FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.TEMPO); }
    /** Unsafe version of {@link #timesignatureupper}. */
    public static int ntimesignatureupper(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.TIMESIGNATUREUPPER); }
    /** Unsafe version of {@link #timesignaturelower}. */
    public static int ntimesignaturelower(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.TIMESIGNATURELOWER); }

    /** Unsafe version of {@link #bar(int) bar}. */
    public static void nbar(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.BAR, value); }
    /** Unsafe version of {@link #beat(int) beat}. */
    public static void nbeat(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.BEAT, value); }
    /** Unsafe version of {@link #position$(int) position$}. */
    public static void nposition$(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.POSITION, value); }
    /** Unsafe version of {@link #tempo(float) tempo}. */
    public static void ntempo(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.TEMPO, value); }
    /** Unsafe version of {@link #timesignatureupper(int) timesignatureupper}. */
    public static void ntimesignatureupper(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.TIMESIGNATUREUPPER, value); }
    /** Unsafe version of {@link #timesignaturelower(int) timesignaturelower}. */
    public static void ntimesignaturelower(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.TIMESIGNATURELOWER, value); }

    // -----------------------------------

    /** An array of {@link FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES} structs. */
    public static class Buffer extends StructBuffer<FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES, Buffer> implements NativeResource {

        private static final FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES ELEMENT_FACTORY = FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.create(-1L);

        /**
         * Creates a new {@code FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code bar} field. */
        public int bar() { return FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.nbar(address()); }
        /** @return the value of the {@code beat} field. */
        public int beat() { return FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.nbeat(address()); }
        /** @return the value of the {@code position} field. */
        public int position$() { return FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.nposition$(address()); }
        /** @return the value of the {@code tempo} field. */
        public float tempo() { return FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.ntempo(address()); }
        /** @return the value of the {@code timesignatureupper} field. */
        public int timesignatureupper() { return FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.ntimesignatureupper(address()); }
        /** @return the value of the {@code timesignaturelower} field. */
        public int timesignaturelower() { return FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.ntimesignaturelower(address()); }

        /** Sets the specified value to the {@code bar} field. */
        public FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.Buffer bar(int value) { FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.nbar(address(), value); return this; }
        /** Sets the specified value to the {@code beat} field. */
        public FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.Buffer beat(int value) { FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.nbeat(address(), value); return this; }
        /** Sets the specified value to the {@code position} field. */
        public FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.Buffer position$(int value) { FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.nposition$(address(), value); return this; }
        /** Sets the specified value to the {@code tempo} field. */
        public FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.Buffer tempo(float value) { FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.ntempo(address(), value); return this; }
        /** Sets the specified value to the {@code timesignatureupper} field. */
        public FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.Buffer timesignatureupper(int value) { FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.ntimesignatureupper(address(), value); return this; }
        /** Sets the specified value to the {@code timesignaturelower} field. */
        public FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.Buffer timesignaturelower(int value) { FMOD_STUDIO_TIMELINE_BEAT_PROPERTIES.ntimesignaturelower(address(), value); return this; }

    }

}
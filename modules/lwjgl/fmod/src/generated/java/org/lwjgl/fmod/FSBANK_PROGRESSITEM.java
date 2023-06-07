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
 * struct FSBANK_PROGRESSITEM {
 *     int subSoundIndex;
 *     int threadIndex;
 *     FSBANK_STATE state;
 *     void const * stateData;
 * }</code></pre>
 */
public class FSBANK_PROGRESSITEM extends Struct<FSBANK_PROGRESSITEM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SUBSOUNDINDEX,
        THREADINDEX,
        STATE,
        STATEDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SUBSOUNDINDEX = layout.offsetof(0);
        THREADINDEX = layout.offsetof(1);
        STATE = layout.offsetof(2);
        STATEDATA = layout.offsetof(3);
    }

    protected FSBANK_PROGRESSITEM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FSBANK_PROGRESSITEM create(long address, @Nullable ByteBuffer container) {
        return new FSBANK_PROGRESSITEM(address, container);
    }

    /**
     * Creates a {@code FSBANK_PROGRESSITEM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FSBANK_PROGRESSITEM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code subSoundIndex} field. */
    public int subSoundIndex() { return nsubSoundIndex(address()); }
    /** @return the value of the {@code threadIndex} field. */
    public int threadIndex() { return nthreadIndex(address()); }
    /** @return the value of the {@code state} field. */
    @NativeType("FSBANK_STATE")
    public int state() { return nstate(address()); }
    /** @return the value of the {@code stateData} field. */
    @NativeType("void const *")
    public long stateData() { return nstateData(address()); }

    /** Sets the specified value to the {@code subSoundIndex} field. */
    public FSBANK_PROGRESSITEM subSoundIndex(int value) { nsubSoundIndex(address(), value); return this; }
    /** Sets the specified value to the {@code threadIndex} field. */
    public FSBANK_PROGRESSITEM threadIndex(int value) { nthreadIndex(address(), value); return this; }
    /** Sets the specified value to the {@code state} field. */
    public FSBANK_PROGRESSITEM state(@NativeType("FSBANK_STATE") int value) { nstate(address(), value); return this; }
    /** Sets the specified value to the {@code stateData} field. */
    public FSBANK_PROGRESSITEM stateData(@NativeType("void const *") long value) { nstateData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FSBANK_PROGRESSITEM set(
        int subSoundIndex,
        int threadIndex,
        int state,
        long stateData
    ) {
        subSoundIndex(subSoundIndex);
        threadIndex(threadIndex);
        state(state);
        stateData(stateData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FSBANK_PROGRESSITEM set(FSBANK_PROGRESSITEM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FSBANK_PROGRESSITEM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FSBANK_PROGRESSITEM malloc() {
        return new FSBANK_PROGRESSITEM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FSBANK_PROGRESSITEM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FSBANK_PROGRESSITEM calloc() {
        return new FSBANK_PROGRESSITEM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FSBANK_PROGRESSITEM} instance allocated with {@link BufferUtils}. */
    public static FSBANK_PROGRESSITEM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FSBANK_PROGRESSITEM(memAddress(container), container);
    }

    /** Returns a new {@code FSBANK_PROGRESSITEM} instance for the specified memory address. */
    public static FSBANK_PROGRESSITEM create(long address) {
        return new FSBANK_PROGRESSITEM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FSBANK_PROGRESSITEM createSafe(long address) {
        return address == NULL ? null : new FSBANK_PROGRESSITEM(address, null);
    }

    /**
     * Returns a new {@link FSBANK_PROGRESSITEM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FSBANK_PROGRESSITEM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FSBANK_PROGRESSITEM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FSBANK_PROGRESSITEM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FSBANK_PROGRESSITEM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FSBANK_PROGRESSITEM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FSBANK_PROGRESSITEM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FSBANK_PROGRESSITEM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FSBANK_PROGRESSITEM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FSBANK_PROGRESSITEM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FSBANK_PROGRESSITEM malloc(MemoryStack stack) {
        return new FSBANK_PROGRESSITEM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FSBANK_PROGRESSITEM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FSBANK_PROGRESSITEM calloc(MemoryStack stack) {
        return new FSBANK_PROGRESSITEM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FSBANK_PROGRESSITEM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FSBANK_PROGRESSITEM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FSBANK_PROGRESSITEM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FSBANK_PROGRESSITEM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #subSoundIndex}. */
    public static int nsubSoundIndex(long struct) { return UNSAFE.getInt(null, struct + FSBANK_PROGRESSITEM.SUBSOUNDINDEX); }
    /** Unsafe version of {@link #threadIndex}. */
    public static int nthreadIndex(long struct) { return UNSAFE.getInt(null, struct + FSBANK_PROGRESSITEM.THREADINDEX); }
    /** Unsafe version of {@link #state}. */
    public static int nstate(long struct) { return UNSAFE.getInt(null, struct + FSBANK_PROGRESSITEM.STATE); }
    /** Unsafe version of {@link #stateData}. */
    public static long nstateData(long struct) { return memGetAddress(struct + FSBANK_PROGRESSITEM.STATEDATA); }

    /** Unsafe version of {@link #subSoundIndex(int) subSoundIndex}. */
    public static void nsubSoundIndex(long struct, int value) { UNSAFE.putInt(null, struct + FSBANK_PROGRESSITEM.SUBSOUNDINDEX, value); }
    /** Unsafe version of {@link #threadIndex(int) threadIndex}. */
    public static void nthreadIndex(long struct, int value) { UNSAFE.putInt(null, struct + FSBANK_PROGRESSITEM.THREADINDEX, value); }
    /** Unsafe version of {@link #state(int) state}. */
    public static void nstate(long struct, int value) { UNSAFE.putInt(null, struct + FSBANK_PROGRESSITEM.STATE, value); }
    /** Unsafe version of {@link #stateData(long) stateData}. */
    public static void nstateData(long struct, long value) { memPutAddress(struct + FSBANK_PROGRESSITEM.STATEDATA, value); }

    // -----------------------------------

    /** An array of {@link FSBANK_PROGRESSITEM} structs. */
    public static class Buffer extends StructBuffer<FSBANK_PROGRESSITEM, Buffer> implements NativeResource {

        private static final FSBANK_PROGRESSITEM ELEMENT_FACTORY = FSBANK_PROGRESSITEM.create(-1L);

        /**
         * Creates a new {@code FSBANK_PROGRESSITEM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FSBANK_PROGRESSITEM#SIZEOF}, and its mark will be undefined.</p>
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
        protected FSBANK_PROGRESSITEM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code subSoundIndex} field. */
        public int subSoundIndex() { return FSBANK_PROGRESSITEM.nsubSoundIndex(address()); }
        /** @return the value of the {@code threadIndex} field. */
        public int threadIndex() { return FSBANK_PROGRESSITEM.nthreadIndex(address()); }
        /** @return the value of the {@code state} field. */
        @NativeType("FSBANK_STATE")
        public int state() { return FSBANK_PROGRESSITEM.nstate(address()); }
        /** @return the value of the {@code stateData} field. */
        @NativeType("void const *")
        public long stateData() { return FSBANK_PROGRESSITEM.nstateData(address()); }

        /** Sets the specified value to the {@code subSoundIndex} field. */
        public FSBANK_PROGRESSITEM.Buffer subSoundIndex(int value) { FSBANK_PROGRESSITEM.nsubSoundIndex(address(), value); return this; }
        /** Sets the specified value to the {@code threadIndex} field. */
        public FSBANK_PROGRESSITEM.Buffer threadIndex(int value) { FSBANK_PROGRESSITEM.nthreadIndex(address(), value); return this; }
        /** Sets the specified value to the {@code state} field. */
        public FSBANK_PROGRESSITEM.Buffer state(@NativeType("FSBANK_STATE") int value) { FSBANK_PROGRESSITEM.nstate(address(), value); return this; }
        /** Sets the specified value to the {@code stateData} field. */
        public FSBANK_PROGRESSITEM.Buffer stateData(@NativeType("void const *") long value) { FSBANK_PROGRESSITEM.nstateData(address(), value); return this; }

    }

}
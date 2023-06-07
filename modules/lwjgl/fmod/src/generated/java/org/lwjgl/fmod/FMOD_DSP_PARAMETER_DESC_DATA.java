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
 * struct FMOD_DSP_PARAMETER_DESC_DATA {
 *     int datatype;
 * }</code></pre>
 */
public class FMOD_DSP_PARAMETER_DESC_DATA extends Struct<FMOD_DSP_PARAMETER_DESC_DATA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DATATYPE;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DATATYPE = layout.offsetof(0);
    }

    protected FMOD_DSP_PARAMETER_DESC_DATA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_DSP_PARAMETER_DESC_DATA create(long address, @Nullable ByteBuffer container) {
        return new FMOD_DSP_PARAMETER_DESC_DATA(address, container);
    }

    /**
     * Creates a {@code FMOD_DSP_PARAMETER_DESC_DATA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_PARAMETER_DESC_DATA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code datatype} field. */
    public int datatype() { return ndatatype(address()); }

    /** Sets the specified value to the {@code datatype} field. */
    public FMOD_DSP_PARAMETER_DESC_DATA datatype(int value) { ndatatype(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_DSP_PARAMETER_DESC_DATA set(FMOD_DSP_PARAMETER_DESC_DATA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_PARAMETER_DESC_DATA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_DESC_DATA malloc() {
        return new FMOD_DSP_PARAMETER_DESC_DATA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_DESC_DATA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_PARAMETER_DESC_DATA calloc() {
        return new FMOD_DSP_PARAMETER_DESC_DATA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_DESC_DATA} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_PARAMETER_DESC_DATA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_DSP_PARAMETER_DESC_DATA(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_PARAMETER_DESC_DATA} instance for the specified memory address. */
    public static FMOD_DSP_PARAMETER_DESC_DATA create(long address) {
        return new FMOD_DSP_PARAMETER_DESC_DATA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_DESC_DATA createSafe(long address) {
        return address == NULL ? null : new FMOD_DSP_PARAMETER_DESC_DATA(address, null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC_DATA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_DATA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC_DATA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_DATA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC_DATA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_DATA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_DSP_PARAMETER_DESC_DATA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_DATA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_PARAMETER_DESC_DATA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_DESC_DATA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_DESC_DATA malloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_DESC_DATA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_DSP_PARAMETER_DESC_DATA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_PARAMETER_DESC_DATA calloc(MemoryStack stack) {
        return new FMOD_DSP_PARAMETER_DESC_DATA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC_DATA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_DATA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_PARAMETER_DESC_DATA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_PARAMETER_DESC_DATA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #datatype}. */
    public static int ndatatype(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_PARAMETER_DESC_DATA.DATATYPE); }

    /** Unsafe version of {@link #datatype(int) datatype}. */
    public static void ndatatype(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_PARAMETER_DESC_DATA.DATATYPE, value); }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_PARAMETER_DESC_DATA} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_PARAMETER_DESC_DATA, Buffer> implements NativeResource {

        private static final FMOD_DSP_PARAMETER_DESC_DATA ELEMENT_FACTORY = FMOD_DSP_PARAMETER_DESC_DATA.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_PARAMETER_DESC_DATA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_PARAMETER_DESC_DATA#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_DSP_PARAMETER_DESC_DATA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code datatype} field. */
        public int datatype() { return FMOD_DSP_PARAMETER_DESC_DATA.ndatatype(address()); }

        /** Sets the specified value to the {@code datatype} field. */
        public FMOD_DSP_PARAMETER_DESC_DATA.Buffer datatype(int value) { FMOD_DSP_PARAMETER_DESC_DATA.ndatatype(address(), value); return this; }

    }

}
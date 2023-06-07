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
 * struct FMOD_CODEC_STATE {
 *     void * plugindata;
 *     {@link FMOD_CODEC_WAVEFORMAT struct FMOD_CODEC_WAVEFORMAT} * waveformat;
 *     {@link FMOD_CODEC_STATE_FUNCTIONS FMOD_CODEC_STATE_FUNCTIONS} * functions;
 *     int numsubsounds;
 * }</code></pre>
 */
@NativeType("struct FMOD_CODEC_STATE")
public class FMOD_CODEC_STATE extends Struct<FMOD_CODEC_STATE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PLUGINDATA,
        WAVEFORMAT,
        FUNCTIONS,
        NUMSUBSOUNDS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PLUGINDATA = layout.offsetof(0);
        WAVEFORMAT = layout.offsetof(1);
        FUNCTIONS = layout.offsetof(2);
        NUMSUBSOUNDS = layout.offsetof(3);
    }

    protected FMOD_CODEC_STATE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_CODEC_STATE create(long address, @Nullable ByteBuffer container) {
        return new FMOD_CODEC_STATE(address, container);
    }

    /**
     * Creates a {@code FMOD_CODEC_STATE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_CODEC_STATE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code plugindata} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void *")
    public ByteBuffer plugindata(int capacity) { return nplugindata(address(), capacity); }
    /** @return a {@link FMOD_CODEC_WAVEFORMAT} view of the struct pointed to by the {@code waveformat} field. */
    @NativeType("struct FMOD_CODEC_WAVEFORMAT *")
    public FMOD_CODEC_WAVEFORMAT waveformat() { return nwaveformat(address()); }
    /** @return a {@link FMOD_CODEC_STATE_FUNCTIONS} view of the struct pointed to by the {@code functions} field. */
    @NativeType("FMOD_CODEC_STATE_FUNCTIONS *")
    public FMOD_CODEC_STATE_FUNCTIONS functions() { return nfunctions(address()); }
    /** @return the value of the {@code numsubsounds} field. */
    public int numsubsounds() { return nnumsubsounds(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@code plugindata} field. */
    public FMOD_CODEC_STATE plugindata(@NativeType("void *") ByteBuffer value) { nplugindata(address(), value); return this; }
    /** Sets the address of the specified {@link FMOD_CODEC_WAVEFORMAT} to the {@code waveformat} field. */
    public FMOD_CODEC_STATE waveformat(@NativeType("struct FMOD_CODEC_WAVEFORMAT *") FMOD_CODEC_WAVEFORMAT value) { nwaveformat(address(), value); return this; }
    /** Sets the address of the specified {@link FMOD_CODEC_STATE_FUNCTIONS} to the {@code functions} field. */
    public FMOD_CODEC_STATE functions(@NativeType("FMOD_CODEC_STATE_FUNCTIONS *") FMOD_CODEC_STATE_FUNCTIONS value) { nfunctions(address(), value); return this; }
    /** Sets the specified value to the {@code numsubsounds} field. */
    public FMOD_CODEC_STATE numsubsounds(int value) { nnumsubsounds(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_CODEC_STATE set(
        ByteBuffer plugindata,
        FMOD_CODEC_WAVEFORMAT waveformat,
        FMOD_CODEC_STATE_FUNCTIONS functions,
        int numsubsounds
    ) {
        plugindata(plugindata);
        waveformat(waveformat);
        functions(functions);
        numsubsounds(numsubsounds);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_CODEC_STATE set(FMOD_CODEC_STATE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_CODEC_STATE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_CODEC_STATE malloc() {
        return new FMOD_CODEC_STATE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_CODEC_STATE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_CODEC_STATE calloc() {
        return new FMOD_CODEC_STATE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_CODEC_STATE} instance allocated with {@link BufferUtils}. */
    public static FMOD_CODEC_STATE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_CODEC_STATE(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_CODEC_STATE} instance for the specified memory address. */
    public static FMOD_CODEC_STATE create(long address) {
        return new FMOD_CODEC_STATE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_CODEC_STATE createSafe(long address) {
        return address == NULL ? null : new FMOD_CODEC_STATE(address, null);
    }

    /**
     * Returns a new {@link FMOD_CODEC_STATE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_STATE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_CODEC_STATE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_STATE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_CODEC_STATE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_STATE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_CODEC_STATE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_STATE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_CODEC_STATE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_CODEC_STATE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_CODEC_STATE malloc(MemoryStack stack) {
        return new FMOD_CODEC_STATE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_CODEC_STATE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_CODEC_STATE calloc(MemoryStack stack) {
        return new FMOD_CODEC_STATE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_CODEC_STATE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_STATE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_CODEC_STATE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_CODEC_STATE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #plugindata(int) plugindata}. */
    public static ByteBuffer nplugindata(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + FMOD_CODEC_STATE.PLUGINDATA), capacity); }
    /** Unsafe version of {@link #waveformat}. */
    public static FMOD_CODEC_WAVEFORMAT nwaveformat(long struct) { return FMOD_CODEC_WAVEFORMAT.create(memGetAddress(struct + FMOD_CODEC_STATE.WAVEFORMAT)); }
    /** Unsafe version of {@link #functions}. */
    public static FMOD_CODEC_STATE_FUNCTIONS nfunctions(long struct) { return FMOD_CODEC_STATE_FUNCTIONS.create(memGetAddress(struct + FMOD_CODEC_STATE.FUNCTIONS)); }
    /** Unsafe version of {@link #numsubsounds}. */
    public static int nnumsubsounds(long struct) { return UNSAFE.getInt(null, struct + FMOD_CODEC_STATE.NUMSUBSOUNDS); }

    /** Unsafe version of {@link #plugindata(ByteBuffer) plugindata}. */
    public static void nplugindata(long struct, ByteBuffer value) { memPutAddress(struct + FMOD_CODEC_STATE.PLUGINDATA, memAddress(value)); }
    /** Unsafe version of {@link #waveformat(FMOD_CODEC_WAVEFORMAT) waveformat}. */
    public static void nwaveformat(long struct, FMOD_CODEC_WAVEFORMAT value) { memPutAddress(struct + FMOD_CODEC_STATE.WAVEFORMAT, value.address()); }
    /** Unsafe version of {@link #functions(FMOD_CODEC_STATE_FUNCTIONS) functions}. */
    public static void nfunctions(long struct, FMOD_CODEC_STATE_FUNCTIONS value) { memPutAddress(struct + FMOD_CODEC_STATE.FUNCTIONS, value.address()); }
    /** Unsafe version of {@link #numsubsounds(int) numsubsounds}. */
    public static void nnumsubsounds(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_CODEC_STATE.NUMSUBSOUNDS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_CODEC_STATE.PLUGINDATA));
        check(memGetAddress(struct + FMOD_CODEC_STATE.WAVEFORMAT));
        long functions = memGetAddress(struct + FMOD_CODEC_STATE.FUNCTIONS);
        check(functions);
        FMOD_CODEC_STATE_FUNCTIONS.validate(functions);
    }

    // -----------------------------------

    /** An array of {@link FMOD_CODEC_STATE} structs. */
    public static class Buffer extends StructBuffer<FMOD_CODEC_STATE, Buffer> implements NativeResource {

        private static final FMOD_CODEC_STATE ELEMENT_FACTORY = FMOD_CODEC_STATE.create(-1L);

        /**
         * Creates a new {@code FMOD_CODEC_STATE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_CODEC_STATE#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_CODEC_STATE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code plugindata} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void *")
        public ByteBuffer plugindata(int capacity) { return FMOD_CODEC_STATE.nplugindata(address(), capacity); }
        /** @return a {@link FMOD_CODEC_WAVEFORMAT} view of the struct pointed to by the {@code waveformat} field. */
        @NativeType("struct FMOD_CODEC_WAVEFORMAT *")
        public FMOD_CODEC_WAVEFORMAT waveformat() { return FMOD_CODEC_STATE.nwaveformat(address()); }
        /** @return a {@link FMOD_CODEC_STATE_FUNCTIONS} view of the struct pointed to by the {@code functions} field. */
        @NativeType("FMOD_CODEC_STATE_FUNCTIONS *")
        public FMOD_CODEC_STATE_FUNCTIONS functions() { return FMOD_CODEC_STATE.nfunctions(address()); }
        /** @return the value of the {@code numsubsounds} field. */
        public int numsubsounds() { return FMOD_CODEC_STATE.nnumsubsounds(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@code plugindata} field. */
        public FMOD_CODEC_STATE.Buffer plugindata(@NativeType("void *") ByteBuffer value) { FMOD_CODEC_STATE.nplugindata(address(), value); return this; }
        /** Sets the address of the specified {@link FMOD_CODEC_WAVEFORMAT} to the {@code waveformat} field. */
        public FMOD_CODEC_STATE.Buffer waveformat(@NativeType("struct FMOD_CODEC_WAVEFORMAT *") FMOD_CODEC_WAVEFORMAT value) { FMOD_CODEC_STATE.nwaveformat(address(), value); return this; }
        /** Sets the address of the specified {@link FMOD_CODEC_STATE_FUNCTIONS} to the {@code functions} field. */
        public FMOD_CODEC_STATE.Buffer functions(@NativeType("FMOD_CODEC_STATE_FUNCTIONS *") FMOD_CODEC_STATE_FUNCTIONS value) { FMOD_CODEC_STATE.nfunctions(address(), value); return this; }
        /** Sets the specified value to the {@code numsubsounds} field. */
        public FMOD_CODEC_STATE.Buffer numsubsounds(int value) { FMOD_CODEC_STATE.nnumsubsounds(address(), value); return this; }

    }

}
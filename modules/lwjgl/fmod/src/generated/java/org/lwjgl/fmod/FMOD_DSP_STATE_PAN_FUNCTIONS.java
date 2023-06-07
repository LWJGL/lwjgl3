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
 * struct FMOD_DSP_STATE_PAN_FUNCTIONS {
 *     {@link FMOD_DSP_PAN_SUMMONOMATRIX_FUNCI FMOD_DSP_PAN_SUMMONOMATRIX_FUNC} summonomatrix;
 *     {@link FMOD_DSP_PAN_SUMSTEREOMATRIX_FUNCI FMOD_DSP_PAN_SUMSTEREOMATRIX_FUNC} sumstereomatrix;
 *     {@link FMOD_DSP_PAN_SUMSURROUNDMATRIX_FUNCI FMOD_DSP_PAN_SUMSURROUNDMATRIX_FUNC} sumsurroundmatrix;
 *     {@link FMOD_DSP_PAN_SUMMONOTOSURROUNDMATRIX_FUNCI FMOD_DSP_PAN_SUMMONOTOSURROUNDMATRIX_FUNC} summonotosurroundmatrix;
 *     {@link FMOD_DSP_PAN_SUMSTEREOTOSURROUNDMATRIX_FUNCI FMOD_DSP_PAN_SUMSTEREOTOSURROUNDMATRIX_FUNC} sumstereotosurroundmatrix;
 *     {@link FMOD_DSP_PAN_GETROLLOFFGAIN_FUNCI FMOD_DSP_PAN_GETROLLOFFGAIN_FUNC} getrolloffgain;
 * }</code></pre>
 */
public class FMOD_DSP_STATE_PAN_FUNCTIONS extends Struct<FMOD_DSP_STATE_PAN_FUNCTIONS> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SUMMONOMATRIX,
        SUMSTEREOMATRIX,
        SUMSURROUNDMATRIX,
        SUMMONOTOSURROUNDMATRIX,
        SUMSTEREOTOSURROUNDMATRIX,
        GETROLLOFFGAIN;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SUMMONOMATRIX = layout.offsetof(0);
        SUMSTEREOMATRIX = layout.offsetof(1);
        SUMSURROUNDMATRIX = layout.offsetof(2);
        SUMMONOTOSURROUNDMATRIX = layout.offsetof(3);
        SUMSTEREOTOSURROUNDMATRIX = layout.offsetof(4);
        GETROLLOFFGAIN = layout.offsetof(5);
    }

    protected FMOD_DSP_STATE_PAN_FUNCTIONS(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_DSP_STATE_PAN_FUNCTIONS create(long address, @Nullable ByteBuffer container) {
        return new FMOD_DSP_STATE_PAN_FUNCTIONS(address, container);
    }

    /**
     * Creates a {@code FMOD_DSP_STATE_PAN_FUNCTIONS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_STATE_PAN_FUNCTIONS(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code summonomatrix} field. */
    public FMOD_DSP_PAN_SUMMONOMATRIX_FUNC summonomatrix() { return nsummonomatrix(address()); }
    /** @return the value of the {@code sumstereomatrix} field. */
    public FMOD_DSP_PAN_SUMSTEREOMATRIX_FUNC sumstereomatrix() { return nsumstereomatrix(address()); }
    /** @return the value of the {@code sumsurroundmatrix} field. */
    public FMOD_DSP_PAN_SUMSURROUNDMATRIX_FUNC sumsurroundmatrix() { return nsumsurroundmatrix(address()); }
    /** @return the value of the {@code summonotosurroundmatrix} field. */
    public FMOD_DSP_PAN_SUMMONOTOSURROUNDMATRIX_FUNC summonotosurroundmatrix() { return nsummonotosurroundmatrix(address()); }
    /** @return the value of the {@code sumstereotosurroundmatrix} field. */
    public FMOD_DSP_PAN_SUMSTEREOTOSURROUNDMATRIX_FUNC sumstereotosurroundmatrix() { return nsumstereotosurroundmatrix(address()); }
    /** @return the value of the {@code getrolloffgain} field. */
    public FMOD_DSP_PAN_GETROLLOFFGAIN_FUNC getrolloffgain() { return ngetrolloffgain(address()); }

    /** Sets the specified value to the {@code summonomatrix} field. */
    public FMOD_DSP_STATE_PAN_FUNCTIONS summonomatrix(@NativeType("FMOD_DSP_PAN_SUMMONOMATRIX_FUNC") FMOD_DSP_PAN_SUMMONOMATRIX_FUNCI value) { nsummonomatrix(address(), value); return this; }
    /** Sets the specified value to the {@code sumstereomatrix} field. */
    public FMOD_DSP_STATE_PAN_FUNCTIONS sumstereomatrix(@NativeType("FMOD_DSP_PAN_SUMSTEREOMATRIX_FUNC") FMOD_DSP_PAN_SUMSTEREOMATRIX_FUNCI value) { nsumstereomatrix(address(), value); return this; }
    /** Sets the specified value to the {@code sumsurroundmatrix} field. */
    public FMOD_DSP_STATE_PAN_FUNCTIONS sumsurroundmatrix(@NativeType("FMOD_DSP_PAN_SUMSURROUNDMATRIX_FUNC") FMOD_DSP_PAN_SUMSURROUNDMATRIX_FUNCI value) { nsumsurroundmatrix(address(), value); return this; }
    /** Sets the specified value to the {@code summonotosurroundmatrix} field. */
    public FMOD_DSP_STATE_PAN_FUNCTIONS summonotosurroundmatrix(@NativeType("FMOD_DSP_PAN_SUMMONOTOSURROUNDMATRIX_FUNC") FMOD_DSP_PAN_SUMMONOTOSURROUNDMATRIX_FUNCI value) { nsummonotosurroundmatrix(address(), value); return this; }
    /** Sets the specified value to the {@code sumstereotosurroundmatrix} field. */
    public FMOD_DSP_STATE_PAN_FUNCTIONS sumstereotosurroundmatrix(@NativeType("FMOD_DSP_PAN_SUMSTEREOTOSURROUNDMATRIX_FUNC") FMOD_DSP_PAN_SUMSTEREOTOSURROUNDMATRIX_FUNCI value) { nsumstereotosurroundmatrix(address(), value); return this; }
    /** Sets the specified value to the {@code getrolloffgain} field. */
    public FMOD_DSP_STATE_PAN_FUNCTIONS getrolloffgain(@NativeType("FMOD_DSP_PAN_GETROLLOFFGAIN_FUNC") FMOD_DSP_PAN_GETROLLOFFGAIN_FUNCI value) { ngetrolloffgain(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_DSP_STATE_PAN_FUNCTIONS set(
        FMOD_DSP_PAN_SUMMONOMATRIX_FUNCI summonomatrix,
        FMOD_DSP_PAN_SUMSTEREOMATRIX_FUNCI sumstereomatrix,
        FMOD_DSP_PAN_SUMSURROUNDMATRIX_FUNCI sumsurroundmatrix,
        FMOD_DSP_PAN_SUMMONOTOSURROUNDMATRIX_FUNCI summonotosurroundmatrix,
        FMOD_DSP_PAN_SUMSTEREOTOSURROUNDMATRIX_FUNCI sumstereotosurroundmatrix,
        FMOD_DSP_PAN_GETROLLOFFGAIN_FUNCI getrolloffgain
    ) {
        summonomatrix(summonomatrix);
        sumstereomatrix(sumstereomatrix);
        sumsurroundmatrix(sumsurroundmatrix);
        summonotosurroundmatrix(summonotosurroundmatrix);
        sumstereotosurroundmatrix(sumstereotosurroundmatrix);
        getrolloffgain(getrolloffgain);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_DSP_STATE_PAN_FUNCTIONS set(FMOD_DSP_STATE_PAN_FUNCTIONS src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_STATE_PAN_FUNCTIONS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_STATE_PAN_FUNCTIONS malloc() {
        return new FMOD_DSP_STATE_PAN_FUNCTIONS(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_STATE_PAN_FUNCTIONS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_STATE_PAN_FUNCTIONS calloc() {
        return new FMOD_DSP_STATE_PAN_FUNCTIONS(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_STATE_PAN_FUNCTIONS} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_STATE_PAN_FUNCTIONS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_DSP_STATE_PAN_FUNCTIONS(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_STATE_PAN_FUNCTIONS} instance for the specified memory address. */
    public static FMOD_DSP_STATE_PAN_FUNCTIONS create(long address) {
        return new FMOD_DSP_STATE_PAN_FUNCTIONS(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_STATE_PAN_FUNCTIONS createSafe(long address) {
        return address == NULL ? null : new FMOD_DSP_STATE_PAN_FUNCTIONS(address, null);
    }

    /**
     * Returns a new {@link FMOD_DSP_STATE_PAN_FUNCTIONS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE_PAN_FUNCTIONS.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_STATE_PAN_FUNCTIONS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE_PAN_FUNCTIONS.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_STATE_PAN_FUNCTIONS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE_PAN_FUNCTIONS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_DSP_STATE_PAN_FUNCTIONS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE_PAN_FUNCTIONS.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_STATE_PAN_FUNCTIONS.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_STATE_PAN_FUNCTIONS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_STATE_PAN_FUNCTIONS malloc(MemoryStack stack) {
        return new FMOD_DSP_STATE_PAN_FUNCTIONS(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_DSP_STATE_PAN_FUNCTIONS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_STATE_PAN_FUNCTIONS calloc(MemoryStack stack) {
        return new FMOD_DSP_STATE_PAN_FUNCTIONS(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_DSP_STATE_PAN_FUNCTIONS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE_PAN_FUNCTIONS.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_STATE_PAN_FUNCTIONS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE_PAN_FUNCTIONS.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #summonomatrix}. */
    public static FMOD_DSP_PAN_SUMMONOMATRIX_FUNC nsummonomatrix(long struct) { return FMOD_DSP_PAN_SUMMONOMATRIX_FUNC.create(memGetAddress(struct + FMOD_DSP_STATE_PAN_FUNCTIONS.SUMMONOMATRIX)); }
    /** Unsafe version of {@link #sumstereomatrix}. */
    public static FMOD_DSP_PAN_SUMSTEREOMATRIX_FUNC nsumstereomatrix(long struct) { return FMOD_DSP_PAN_SUMSTEREOMATRIX_FUNC.create(memGetAddress(struct + FMOD_DSP_STATE_PAN_FUNCTIONS.SUMSTEREOMATRIX)); }
    /** Unsafe version of {@link #sumsurroundmatrix}. */
    public static FMOD_DSP_PAN_SUMSURROUNDMATRIX_FUNC nsumsurroundmatrix(long struct) { return FMOD_DSP_PAN_SUMSURROUNDMATRIX_FUNC.create(memGetAddress(struct + FMOD_DSP_STATE_PAN_FUNCTIONS.SUMSURROUNDMATRIX)); }
    /** Unsafe version of {@link #summonotosurroundmatrix}. */
    public static FMOD_DSP_PAN_SUMMONOTOSURROUNDMATRIX_FUNC nsummonotosurroundmatrix(long struct) { return FMOD_DSP_PAN_SUMMONOTOSURROUNDMATRIX_FUNC.create(memGetAddress(struct + FMOD_DSP_STATE_PAN_FUNCTIONS.SUMMONOTOSURROUNDMATRIX)); }
    /** Unsafe version of {@link #sumstereotosurroundmatrix}. */
    public static FMOD_DSP_PAN_SUMSTEREOTOSURROUNDMATRIX_FUNC nsumstereotosurroundmatrix(long struct) { return FMOD_DSP_PAN_SUMSTEREOTOSURROUNDMATRIX_FUNC.create(memGetAddress(struct + FMOD_DSP_STATE_PAN_FUNCTIONS.SUMSTEREOTOSURROUNDMATRIX)); }
    /** Unsafe version of {@link #getrolloffgain}. */
    public static FMOD_DSP_PAN_GETROLLOFFGAIN_FUNC ngetrolloffgain(long struct) { return FMOD_DSP_PAN_GETROLLOFFGAIN_FUNC.create(memGetAddress(struct + FMOD_DSP_STATE_PAN_FUNCTIONS.GETROLLOFFGAIN)); }

    /** Unsafe version of {@link #summonomatrix(FMOD_DSP_PAN_SUMMONOMATRIX_FUNCI) summonomatrix}. */
    public static void nsummonomatrix(long struct, FMOD_DSP_PAN_SUMMONOMATRIX_FUNCI value) { memPutAddress(struct + FMOD_DSP_STATE_PAN_FUNCTIONS.SUMMONOMATRIX, value.address()); }
    /** Unsafe version of {@link #sumstereomatrix(FMOD_DSP_PAN_SUMSTEREOMATRIX_FUNCI) sumstereomatrix}. */
    public static void nsumstereomatrix(long struct, FMOD_DSP_PAN_SUMSTEREOMATRIX_FUNCI value) { memPutAddress(struct + FMOD_DSP_STATE_PAN_FUNCTIONS.SUMSTEREOMATRIX, value.address()); }
    /** Unsafe version of {@link #sumsurroundmatrix(FMOD_DSP_PAN_SUMSURROUNDMATRIX_FUNCI) sumsurroundmatrix}. */
    public static void nsumsurroundmatrix(long struct, FMOD_DSP_PAN_SUMSURROUNDMATRIX_FUNCI value) { memPutAddress(struct + FMOD_DSP_STATE_PAN_FUNCTIONS.SUMSURROUNDMATRIX, value.address()); }
    /** Unsafe version of {@link #summonotosurroundmatrix(FMOD_DSP_PAN_SUMMONOTOSURROUNDMATRIX_FUNCI) summonotosurroundmatrix}. */
    public static void nsummonotosurroundmatrix(long struct, FMOD_DSP_PAN_SUMMONOTOSURROUNDMATRIX_FUNCI value) { memPutAddress(struct + FMOD_DSP_STATE_PAN_FUNCTIONS.SUMMONOTOSURROUNDMATRIX, value.address()); }
    /** Unsafe version of {@link #sumstereotosurroundmatrix(FMOD_DSP_PAN_SUMSTEREOTOSURROUNDMATRIX_FUNCI) sumstereotosurroundmatrix}. */
    public static void nsumstereotosurroundmatrix(long struct, FMOD_DSP_PAN_SUMSTEREOTOSURROUNDMATRIX_FUNCI value) { memPutAddress(struct + FMOD_DSP_STATE_PAN_FUNCTIONS.SUMSTEREOTOSURROUNDMATRIX, value.address()); }
    /** Unsafe version of {@link #getrolloffgain(FMOD_DSP_PAN_GETROLLOFFGAIN_FUNCI) getrolloffgain}. */
    public static void ngetrolloffgain(long struct, FMOD_DSP_PAN_GETROLLOFFGAIN_FUNCI value) { memPutAddress(struct + FMOD_DSP_STATE_PAN_FUNCTIONS.GETROLLOFFGAIN, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_DSP_STATE_PAN_FUNCTIONS.SUMMONOMATRIX));
        check(memGetAddress(struct + FMOD_DSP_STATE_PAN_FUNCTIONS.SUMSTEREOMATRIX));
        check(memGetAddress(struct + FMOD_DSP_STATE_PAN_FUNCTIONS.SUMSURROUNDMATRIX));
        check(memGetAddress(struct + FMOD_DSP_STATE_PAN_FUNCTIONS.SUMMONOTOSURROUNDMATRIX));
        check(memGetAddress(struct + FMOD_DSP_STATE_PAN_FUNCTIONS.SUMSTEREOTOSURROUNDMATRIX));
        check(memGetAddress(struct + FMOD_DSP_STATE_PAN_FUNCTIONS.GETROLLOFFGAIN));
    }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_STATE_PAN_FUNCTIONS} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_STATE_PAN_FUNCTIONS, Buffer> implements NativeResource {

        private static final FMOD_DSP_STATE_PAN_FUNCTIONS ELEMENT_FACTORY = FMOD_DSP_STATE_PAN_FUNCTIONS.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_STATE_PAN_FUNCTIONS.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_STATE_PAN_FUNCTIONS#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_DSP_STATE_PAN_FUNCTIONS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code summonomatrix} field. */
        public FMOD_DSP_PAN_SUMMONOMATRIX_FUNC summonomatrix() { return FMOD_DSP_STATE_PAN_FUNCTIONS.nsummonomatrix(address()); }
        /** @return the value of the {@code sumstereomatrix} field. */
        public FMOD_DSP_PAN_SUMSTEREOMATRIX_FUNC sumstereomatrix() { return FMOD_DSP_STATE_PAN_FUNCTIONS.nsumstereomatrix(address()); }
        /** @return the value of the {@code sumsurroundmatrix} field. */
        public FMOD_DSP_PAN_SUMSURROUNDMATRIX_FUNC sumsurroundmatrix() { return FMOD_DSP_STATE_PAN_FUNCTIONS.nsumsurroundmatrix(address()); }
        /** @return the value of the {@code summonotosurroundmatrix} field. */
        public FMOD_DSP_PAN_SUMMONOTOSURROUNDMATRIX_FUNC summonotosurroundmatrix() { return FMOD_DSP_STATE_PAN_FUNCTIONS.nsummonotosurroundmatrix(address()); }
        /** @return the value of the {@code sumstereotosurroundmatrix} field. */
        public FMOD_DSP_PAN_SUMSTEREOTOSURROUNDMATRIX_FUNC sumstereotosurroundmatrix() { return FMOD_DSP_STATE_PAN_FUNCTIONS.nsumstereotosurroundmatrix(address()); }
        /** @return the value of the {@code getrolloffgain} field. */
        public FMOD_DSP_PAN_GETROLLOFFGAIN_FUNC getrolloffgain() { return FMOD_DSP_STATE_PAN_FUNCTIONS.ngetrolloffgain(address()); }

        /** Sets the specified value to the {@code summonomatrix} field. */
        public FMOD_DSP_STATE_PAN_FUNCTIONS.Buffer summonomatrix(@NativeType("FMOD_DSP_PAN_SUMMONOMATRIX_FUNC") FMOD_DSP_PAN_SUMMONOMATRIX_FUNCI value) { FMOD_DSP_STATE_PAN_FUNCTIONS.nsummonomatrix(address(), value); return this; }
        /** Sets the specified value to the {@code sumstereomatrix} field. */
        public FMOD_DSP_STATE_PAN_FUNCTIONS.Buffer sumstereomatrix(@NativeType("FMOD_DSP_PAN_SUMSTEREOMATRIX_FUNC") FMOD_DSP_PAN_SUMSTEREOMATRIX_FUNCI value) { FMOD_DSP_STATE_PAN_FUNCTIONS.nsumstereomatrix(address(), value); return this; }
        /** Sets the specified value to the {@code sumsurroundmatrix} field. */
        public FMOD_DSP_STATE_PAN_FUNCTIONS.Buffer sumsurroundmatrix(@NativeType("FMOD_DSP_PAN_SUMSURROUNDMATRIX_FUNC") FMOD_DSP_PAN_SUMSURROUNDMATRIX_FUNCI value) { FMOD_DSP_STATE_PAN_FUNCTIONS.nsumsurroundmatrix(address(), value); return this; }
        /** Sets the specified value to the {@code summonotosurroundmatrix} field. */
        public FMOD_DSP_STATE_PAN_FUNCTIONS.Buffer summonotosurroundmatrix(@NativeType("FMOD_DSP_PAN_SUMMONOTOSURROUNDMATRIX_FUNC") FMOD_DSP_PAN_SUMMONOTOSURROUNDMATRIX_FUNCI value) { FMOD_DSP_STATE_PAN_FUNCTIONS.nsummonotosurroundmatrix(address(), value); return this; }
        /** Sets the specified value to the {@code sumstereotosurroundmatrix} field. */
        public FMOD_DSP_STATE_PAN_FUNCTIONS.Buffer sumstereotosurroundmatrix(@NativeType("FMOD_DSP_PAN_SUMSTEREOTOSURROUNDMATRIX_FUNC") FMOD_DSP_PAN_SUMSTEREOTOSURROUNDMATRIX_FUNCI value) { FMOD_DSP_STATE_PAN_FUNCTIONS.nsumstereotosurroundmatrix(address(), value); return this; }
        /** Sets the specified value to the {@code getrolloffgain} field. */
        public FMOD_DSP_STATE_PAN_FUNCTIONS.Buffer getrolloffgain(@NativeType("FMOD_DSP_PAN_GETROLLOFFGAIN_FUNC") FMOD_DSP_PAN_GETROLLOFFGAIN_FUNCI value) { FMOD_DSP_STATE_PAN_FUNCTIONS.ngetrolloffgain(address(), value); return this; }

    }

}
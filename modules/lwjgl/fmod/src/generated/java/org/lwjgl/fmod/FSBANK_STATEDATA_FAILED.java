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
 * struct FSBANK_STATEDATA_FAILED {
 *     FSBANK_RESULT errorCode;
 *     char errorString[256];
 * }</code></pre>
 */
public class FSBANK_STATEDATA_FAILED extends Struct<FSBANK_STATEDATA_FAILED> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ERRORCODE,
        ERRORSTRING;

    static {
        Layout layout = __struct(
            __member(4),
            __array(1, 256)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ERRORCODE = layout.offsetof(0);
        ERRORSTRING = layout.offsetof(1);
    }

    protected FSBANK_STATEDATA_FAILED(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FSBANK_STATEDATA_FAILED create(long address, @Nullable ByteBuffer container) {
        return new FSBANK_STATEDATA_FAILED(address, container);
    }

    /**
     * Creates a {@code FSBANK_STATEDATA_FAILED} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FSBANK_STATEDATA_FAILED(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code errorCode} field. */
    @NativeType("FSBANK_RESULT")
    public int errorCode() { return nerrorCode(address()); }
    /** @return a {@link ByteBuffer} view of the {@code errorString} field. */
    @NativeType("char[256]")
    public ByteBuffer errorString() { return nerrorString(address()); }
    /** @return the null-terminated string stored in the {@code errorString} field. */
    @NativeType("char[256]")
    public String errorStringString() { return nerrorStringString(address()); }

    /** Sets the specified value to the {@code errorCode} field. */
    public FSBANK_STATEDATA_FAILED errorCode(@NativeType("FSBANK_RESULT") int value) { nerrorCode(address(), value); return this; }
    /** Copies the specified encoded string to the {@code errorString} field. */
    public FSBANK_STATEDATA_FAILED errorString(@NativeType("char[256]") ByteBuffer value) { nerrorString(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FSBANK_STATEDATA_FAILED set(
        int errorCode,
        ByteBuffer errorString
    ) {
        errorCode(errorCode);
        errorString(errorString);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FSBANK_STATEDATA_FAILED set(FSBANK_STATEDATA_FAILED src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FSBANK_STATEDATA_FAILED} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FSBANK_STATEDATA_FAILED malloc() {
        return new FSBANK_STATEDATA_FAILED(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FSBANK_STATEDATA_FAILED} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FSBANK_STATEDATA_FAILED calloc() {
        return new FSBANK_STATEDATA_FAILED(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FSBANK_STATEDATA_FAILED} instance allocated with {@link BufferUtils}. */
    public static FSBANK_STATEDATA_FAILED create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FSBANK_STATEDATA_FAILED(memAddress(container), container);
    }

    /** Returns a new {@code FSBANK_STATEDATA_FAILED} instance for the specified memory address. */
    public static FSBANK_STATEDATA_FAILED create(long address) {
        return new FSBANK_STATEDATA_FAILED(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FSBANK_STATEDATA_FAILED createSafe(long address) {
        return address == NULL ? null : new FSBANK_STATEDATA_FAILED(address, null);
    }

    /**
     * Returns a new {@link FSBANK_STATEDATA_FAILED.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FSBANK_STATEDATA_FAILED.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FSBANK_STATEDATA_FAILED.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FSBANK_STATEDATA_FAILED.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FSBANK_STATEDATA_FAILED.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FSBANK_STATEDATA_FAILED.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FSBANK_STATEDATA_FAILED.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FSBANK_STATEDATA_FAILED.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FSBANK_STATEDATA_FAILED.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FSBANK_STATEDATA_FAILED} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FSBANK_STATEDATA_FAILED malloc(MemoryStack stack) {
        return new FSBANK_STATEDATA_FAILED(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FSBANK_STATEDATA_FAILED} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FSBANK_STATEDATA_FAILED calloc(MemoryStack stack) {
        return new FSBANK_STATEDATA_FAILED(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FSBANK_STATEDATA_FAILED.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FSBANK_STATEDATA_FAILED.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FSBANK_STATEDATA_FAILED.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FSBANK_STATEDATA_FAILED.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #errorCode}. */
    public static int nerrorCode(long struct) { return UNSAFE.getInt(null, struct + FSBANK_STATEDATA_FAILED.ERRORCODE); }
    /** Unsafe version of {@link #errorString}. */
    public static ByteBuffer nerrorString(long struct) { return memByteBuffer(struct + FSBANK_STATEDATA_FAILED.ERRORSTRING, 256); }
    /** Unsafe version of {@link #errorStringString}. */
    public static String nerrorStringString(long struct) { return memASCII(struct + FSBANK_STATEDATA_FAILED.ERRORSTRING); }

    /** Unsafe version of {@link #errorCode(int) errorCode}. */
    public static void nerrorCode(long struct, int value) { UNSAFE.putInt(null, struct + FSBANK_STATEDATA_FAILED.ERRORCODE, value); }
    /** Unsafe version of {@link #errorString(ByteBuffer) errorString}. */
    public static void nerrorString(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, 256);
        }
        memCopy(memAddress(value), struct + FSBANK_STATEDATA_FAILED.ERRORSTRING, value.remaining());
    }

    // -----------------------------------

    /** An array of {@link FSBANK_STATEDATA_FAILED} structs. */
    public static class Buffer extends StructBuffer<FSBANK_STATEDATA_FAILED, Buffer> implements NativeResource {

        private static final FSBANK_STATEDATA_FAILED ELEMENT_FACTORY = FSBANK_STATEDATA_FAILED.create(-1L);

        /**
         * Creates a new {@code FSBANK_STATEDATA_FAILED.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FSBANK_STATEDATA_FAILED#SIZEOF}, and its mark will be undefined.</p>
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
        protected FSBANK_STATEDATA_FAILED getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code errorCode} field. */
        @NativeType("FSBANK_RESULT")
        public int errorCode() { return FSBANK_STATEDATA_FAILED.nerrorCode(address()); }
        /** @return a {@link ByteBuffer} view of the {@code errorString} field. */
        @NativeType("char[256]")
        public ByteBuffer errorString() { return FSBANK_STATEDATA_FAILED.nerrorString(address()); }
        /** @return the null-terminated string stored in the {@code errorString} field. */
        @NativeType("char[256]")
        public String errorStringString() { return FSBANK_STATEDATA_FAILED.nerrorStringString(address()); }

        /** Sets the specified value to the {@code errorCode} field. */
        public FSBANK_STATEDATA_FAILED.Buffer errorCode(@NativeType("FSBANK_RESULT") int value) { FSBANK_STATEDATA_FAILED.nerrorCode(address(), value); return this; }
        /** Copies the specified encoded string to the {@code errorString} field. */
        public FSBANK_STATEDATA_FAILED.Buffer errorString(@NativeType("char[256]") ByteBuffer value) { FSBANK_STATEDATA_FAILED.nerrorString(address(), value); return this; }

    }

}
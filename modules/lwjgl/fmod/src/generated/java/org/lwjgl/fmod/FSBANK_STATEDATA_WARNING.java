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
 * struct FSBANK_STATEDATA_WARNING {
 *     FSBANK_RESULT warnCode;
 *     char warningString[256];
 * }</code></pre>
 */
public class FSBANK_STATEDATA_WARNING extends Struct<FSBANK_STATEDATA_WARNING> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WARNCODE,
        WARNINGSTRING;

    static {
        Layout layout = __struct(
            __member(4),
            __array(1, 256)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WARNCODE = layout.offsetof(0);
        WARNINGSTRING = layout.offsetof(1);
    }

    protected FSBANK_STATEDATA_WARNING(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FSBANK_STATEDATA_WARNING create(long address, @Nullable ByteBuffer container) {
        return new FSBANK_STATEDATA_WARNING(address, container);
    }

    /**
     * Creates a {@code FSBANK_STATEDATA_WARNING} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FSBANK_STATEDATA_WARNING(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code warnCode} field. */
    @NativeType("FSBANK_RESULT")
    public int warnCode() { return nwarnCode(address()); }
    /** @return a {@link ByteBuffer} view of the {@code warningString} field. */
    @NativeType("char[256]")
    public ByteBuffer warningString() { return nwarningString(address()); }
    /** @return the null-terminated string stored in the {@code warningString} field. */
    @NativeType("char[256]")
    public String warningStringString() { return nwarningStringString(address()); }

    /** Sets the specified value to the {@code warnCode} field. */
    public FSBANK_STATEDATA_WARNING warnCode(@NativeType("FSBANK_RESULT") int value) { nwarnCode(address(), value); return this; }
    /** Copies the specified encoded string to the {@code warningString} field. */
    public FSBANK_STATEDATA_WARNING warningString(@NativeType("char[256]") ByteBuffer value) { nwarningString(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FSBANK_STATEDATA_WARNING set(
        int warnCode,
        ByteBuffer warningString
    ) {
        warnCode(warnCode);
        warningString(warningString);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FSBANK_STATEDATA_WARNING set(FSBANK_STATEDATA_WARNING src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FSBANK_STATEDATA_WARNING} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FSBANK_STATEDATA_WARNING malloc() {
        return new FSBANK_STATEDATA_WARNING(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FSBANK_STATEDATA_WARNING} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FSBANK_STATEDATA_WARNING calloc() {
        return new FSBANK_STATEDATA_WARNING(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FSBANK_STATEDATA_WARNING} instance allocated with {@link BufferUtils}. */
    public static FSBANK_STATEDATA_WARNING create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FSBANK_STATEDATA_WARNING(memAddress(container), container);
    }

    /** Returns a new {@code FSBANK_STATEDATA_WARNING} instance for the specified memory address. */
    public static FSBANK_STATEDATA_WARNING create(long address) {
        return new FSBANK_STATEDATA_WARNING(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FSBANK_STATEDATA_WARNING createSafe(long address) {
        return address == NULL ? null : new FSBANK_STATEDATA_WARNING(address, null);
    }

    /**
     * Returns a new {@link FSBANK_STATEDATA_WARNING.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FSBANK_STATEDATA_WARNING.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FSBANK_STATEDATA_WARNING.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FSBANK_STATEDATA_WARNING.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FSBANK_STATEDATA_WARNING.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FSBANK_STATEDATA_WARNING.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FSBANK_STATEDATA_WARNING.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FSBANK_STATEDATA_WARNING.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FSBANK_STATEDATA_WARNING.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FSBANK_STATEDATA_WARNING} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FSBANK_STATEDATA_WARNING malloc(MemoryStack stack) {
        return new FSBANK_STATEDATA_WARNING(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FSBANK_STATEDATA_WARNING} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FSBANK_STATEDATA_WARNING calloc(MemoryStack stack) {
        return new FSBANK_STATEDATA_WARNING(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FSBANK_STATEDATA_WARNING.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FSBANK_STATEDATA_WARNING.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FSBANK_STATEDATA_WARNING.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FSBANK_STATEDATA_WARNING.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #warnCode}. */
    public static int nwarnCode(long struct) { return UNSAFE.getInt(null, struct + FSBANK_STATEDATA_WARNING.WARNCODE); }
    /** Unsafe version of {@link #warningString}. */
    public static ByteBuffer nwarningString(long struct) { return memByteBuffer(struct + FSBANK_STATEDATA_WARNING.WARNINGSTRING, 256); }
    /** Unsafe version of {@link #warningStringString}. */
    public static String nwarningStringString(long struct) { return memASCII(struct + FSBANK_STATEDATA_WARNING.WARNINGSTRING); }

    /** Unsafe version of {@link #warnCode(int) warnCode}. */
    public static void nwarnCode(long struct, int value) { UNSAFE.putInt(null, struct + FSBANK_STATEDATA_WARNING.WARNCODE, value); }
    /** Unsafe version of {@link #warningString(ByteBuffer) warningString}. */
    public static void nwarningString(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, 256);
        }
        memCopy(memAddress(value), struct + FSBANK_STATEDATA_WARNING.WARNINGSTRING, value.remaining());
    }

    // -----------------------------------

    /** An array of {@link FSBANK_STATEDATA_WARNING} structs. */
    public static class Buffer extends StructBuffer<FSBANK_STATEDATA_WARNING, Buffer> implements NativeResource {

        private static final FSBANK_STATEDATA_WARNING ELEMENT_FACTORY = FSBANK_STATEDATA_WARNING.create(-1L);

        /**
         * Creates a new {@code FSBANK_STATEDATA_WARNING.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FSBANK_STATEDATA_WARNING#SIZEOF}, and its mark will be undefined.</p>
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
        protected FSBANK_STATEDATA_WARNING getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code warnCode} field. */
        @NativeType("FSBANK_RESULT")
        public int warnCode() { return FSBANK_STATEDATA_WARNING.nwarnCode(address()); }
        /** @return a {@link ByteBuffer} view of the {@code warningString} field. */
        @NativeType("char[256]")
        public ByteBuffer warningString() { return FSBANK_STATEDATA_WARNING.nwarningString(address()); }
        /** @return the null-terminated string stored in the {@code warningString} field. */
        @NativeType("char[256]")
        public String warningStringString() { return FSBANK_STATEDATA_WARNING.nwarningStringString(address()); }

        /** Sets the specified value to the {@code warnCode} field. */
        public FSBANK_STATEDATA_WARNING.Buffer warnCode(@NativeType("FSBANK_RESULT") int value) { FSBANK_STATEDATA_WARNING.nwarnCode(address(), value); return this; }
        /** Copies the specified encoded string to the {@code warningString} field. */
        public FSBANK_STATEDATA_WARNING.Buffer warningString(@NativeType("char[256]") ByteBuffer value) { FSBANK_STATEDATA_WARNING.nwarningString(address(), value); return this; }

    }

}
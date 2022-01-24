/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Callback functions for accessing the stream.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct OpusEncCallbacks {
 *     {@link OPEWriteFuncI ope_write_func} {@link #write};
 *     {@link OPECloseFuncI ope_close_func} {@link #close$ close};
 * }</code></pre>
 */
public class OpusEncCallbacks extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WRITE,
        CLOSE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WRITE = layout.offsetof(0);
        CLOSE = layout.offsetof(1);
    }

    /**
     * Creates a {@code OpusEncCallbacks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OpusEncCallbacks(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** callback for writing to the stream */
    @NativeType("ope_write_func")
    public OPEWriteFunc write() { return nwrite(address()); }
    /** callback for closing the stream */
    @NativeType("ope_close_func")
    public OPECloseFunc close$() { return nclose$(address()); }

    /** Sets the specified value to the {@link #write} field. */
    public OpusEncCallbacks write(@NativeType("ope_write_func") OPEWriteFuncI value) { nwrite(address(), value); return this; }
    /** Sets the specified value to the {@link #close$} field. */
    public OpusEncCallbacks close$(@NativeType("ope_close_func") OPECloseFuncI value) { nclose$(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OpusEncCallbacks set(
        OPEWriteFuncI write,
        OPECloseFuncI close$
    ) {
        write(write);
        close$(close$);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OpusEncCallbacks set(OpusEncCallbacks src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OpusEncCallbacks} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OpusEncCallbacks malloc() {
        return wrap(OpusEncCallbacks.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OpusEncCallbacks} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OpusEncCallbacks calloc() {
        return wrap(OpusEncCallbacks.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OpusEncCallbacks} instance allocated with {@link BufferUtils}. */
    public static OpusEncCallbacks create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OpusEncCallbacks.class, memAddress(container), container);
    }

    /** Returns a new {@code OpusEncCallbacks} instance for the specified memory address. */
    public static OpusEncCallbacks create(long address) {
        return wrap(OpusEncCallbacks.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OpusEncCallbacks createSafe(long address) {
        return address == NULL ? null : wrap(OpusEncCallbacks.class, address);
    }

    /**
     * Returns a new {@link OpusEncCallbacks.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OpusEncCallbacks.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OpusEncCallbacks.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OpusEncCallbacks.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OpusEncCallbacks.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OpusEncCallbacks.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OpusEncCallbacks.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OpusEncCallbacks.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OpusEncCallbacks.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code OpusEncCallbacks} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OpusEncCallbacks malloc(MemoryStack stack) {
        return wrap(OpusEncCallbacks.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OpusEncCallbacks} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OpusEncCallbacks calloc(MemoryStack stack) {
        return wrap(OpusEncCallbacks.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OpusEncCallbacks.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OpusEncCallbacks.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OpusEncCallbacks.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OpusEncCallbacks.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #write}. */
    public static OPEWriteFunc nwrite(long struct) { return OPEWriteFunc.create(memGetAddress(struct + OpusEncCallbacks.WRITE)); }
    /** Unsafe version of {@link #close$}. */
    public static OPECloseFunc nclose$(long struct) { return OPECloseFunc.create(memGetAddress(struct + OpusEncCallbacks.CLOSE)); }

    /** Unsafe version of {@link #write(OPEWriteFuncI) write}. */
    public static void nwrite(long struct, OPEWriteFuncI value) { memPutAddress(struct + OpusEncCallbacks.WRITE, value.address()); }
    /** Unsafe version of {@link #close$(OPECloseFuncI) close$}. */
    public static void nclose$(long struct, OPECloseFuncI value) { memPutAddress(struct + OpusEncCallbacks.CLOSE, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + OpusEncCallbacks.WRITE));
        check(memGetAddress(struct + OpusEncCallbacks.CLOSE));
    }

    // -----------------------------------

    /** An array of {@link OpusEncCallbacks} structs. */
    public static class Buffer extends StructBuffer<OpusEncCallbacks, Buffer> implements NativeResource {

        private static final OpusEncCallbacks ELEMENT_FACTORY = OpusEncCallbacks.create(-1L);

        /**
         * Creates a new {@code OpusEncCallbacks.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OpusEncCallbacks#SIZEOF}, and its mark will be undefined.
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
        protected OpusEncCallbacks getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link OpusEncCallbacks#write} field. */
        @NativeType("ope_write_func")
        public OPEWriteFunc write() { return OpusEncCallbacks.nwrite(address()); }
        /** @return the value of the {@link OpusEncCallbacks#close$} field. */
        @NativeType("ope_close_func")
        public OPECloseFunc close$() { return OpusEncCallbacks.nclose$(address()); }

        /** Sets the specified value to the {@link OpusEncCallbacks#write} field. */
        public OpusEncCallbacks.Buffer write(@NativeType("ope_write_func") OPEWriteFuncI value) { OpusEncCallbacks.nwrite(address(), value); return this; }
        /** Sets the specified value to the {@link OpusEncCallbacks#close$} field. */
        public OpusEncCallbacks.Buffer close$(@NativeType("ope_close_func") OPECloseFuncI value) { OpusEncCallbacks.nclose$(address(), value); return this; }

    }

}
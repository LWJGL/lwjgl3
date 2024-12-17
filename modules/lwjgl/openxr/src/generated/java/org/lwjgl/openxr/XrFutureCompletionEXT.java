/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrFutureCompletionEXT {
 *     XrStructureType type;
 *     void * next;
 *     XrResult futureResult;
 * }}</pre>
 */
public class XrFutureCompletionEXT extends Struct<XrFutureCompletionEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURERESULT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FUTURERESULT = layout.offsetof(2);
    }

    protected XrFutureCompletionEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFutureCompletionEXT create(long address, @Nullable ByteBuffer container) {
        return new XrFutureCompletionEXT(address, container);
    }

    /**
     * Creates a {@code XrFutureCompletionEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFutureCompletionEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code futureResult} field. */
    @NativeType("XrResult")
    public int futureResult() { return nfutureResult(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrFutureCompletionEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTFuture#XR_TYPE_FUTURE_COMPLETION_EXT TYPE_FUTURE_COMPLETION_EXT} value to the {@code type} field. */
    public XrFutureCompletionEXT type$Default() { return type(EXTFuture.XR_TYPE_FUTURE_COMPLETION_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrFutureCompletionEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code futureResult} field. */
    public XrFutureCompletionEXT futureResult(@NativeType("XrResult") int value) { nfutureResult(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFutureCompletionEXT set(
        int type,
        long next,
        int futureResult
    ) {
        type(type);
        next(next);
        futureResult(futureResult);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFutureCompletionEXT set(XrFutureCompletionEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFutureCompletionEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFutureCompletionEXT malloc() {
        return new XrFutureCompletionEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFutureCompletionEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFutureCompletionEXT calloc() {
        return new XrFutureCompletionEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFutureCompletionEXT} instance allocated with {@link BufferUtils}. */
    public static XrFutureCompletionEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFutureCompletionEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrFutureCompletionEXT} instance for the specified memory address. */
    public static XrFutureCompletionEXT create(long address) {
        return new XrFutureCompletionEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFutureCompletionEXT createSafe(long address) {
        return address == NULL ? null : new XrFutureCompletionEXT(address, null);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT} instance to {@code XrFutureCompletionEXT}. */
    public static XrFutureCompletionEXT create(XrFutureCompletionBaseHeaderEXT value) {
        return new XrFutureCompletionEXT(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrFutureCompletionEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFutureCompletionEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFutureCompletionEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFutureCompletionEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFutureCompletionEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFutureCompletionEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFutureCompletionEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFutureCompletionEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFutureCompletionEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT.Buffer} instance to {@code XrFutureCompletionEXT.Buffer}. */
    public static XrFutureCompletionEXT.Buffer create(XrFutureCompletionBaseHeaderEXT.Buffer value) {
        return new XrFutureCompletionEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrFutureCompletionEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFutureCompletionEXT malloc(MemoryStack stack) {
        return new XrFutureCompletionEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFutureCompletionEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFutureCompletionEXT calloc(MemoryStack stack) {
        return new XrFutureCompletionEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFutureCompletionEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFutureCompletionEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFutureCompletionEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFutureCompletionEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFutureCompletionEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFutureCompletionEXT.NEXT); }
    /** Unsafe version of {@link #futureResult}. */
    public static int nfutureResult(long struct) { return memGetInt(struct + XrFutureCompletionEXT.FUTURERESULT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFutureCompletionEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFutureCompletionEXT.NEXT, value); }
    /** Unsafe version of {@link #futureResult(int) futureResult}. */
    public static void nfutureResult(long struct, int value) { memPutInt(struct + XrFutureCompletionEXT.FUTURERESULT, value); }

    // -----------------------------------

    /** An array of {@link XrFutureCompletionEXT} structs. */
    public static class Buffer extends StructBuffer<XrFutureCompletionEXT, Buffer> implements NativeResource {

        private static final XrFutureCompletionEXT ELEMENT_FACTORY = XrFutureCompletionEXT.create(-1L);

        /**
         * Creates a new {@code XrFutureCompletionEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFutureCompletionEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrFutureCompletionEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFutureCompletionEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrFutureCompletionEXT.nnext(address()); }
        /** @return the value of the {@code futureResult} field. */
        @NativeType("XrResult")
        public int futureResult() { return XrFutureCompletionEXT.nfutureResult(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrFutureCompletionEXT.Buffer type(@NativeType("XrStructureType") int value) { XrFutureCompletionEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTFuture#XR_TYPE_FUTURE_COMPLETION_EXT TYPE_FUTURE_COMPLETION_EXT} value to the {@code type} field. */
        public XrFutureCompletionEXT.Buffer type$Default() { return type(EXTFuture.XR_TYPE_FUTURE_COMPLETION_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrFutureCompletionEXT.Buffer next(@NativeType("void *") long value) { XrFutureCompletionEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code futureResult} field. */
        public XrFutureCompletionEXT.Buffer futureResult(@NativeType("XrResult") int value) { XrFutureCompletionEXT.nfutureResult(address(), value); return this; }

    }

}
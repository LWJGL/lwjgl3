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
 * struct XrFutureCancelInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrFutureEXT future;
 * }}</pre>
 */
public class XrFutureCancelInfoEXT extends Struct<XrFutureCancelInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FUTURE = layout.offsetof(2);
    }

    protected XrFutureCancelInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFutureCancelInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrFutureCancelInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrFutureCancelInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFutureCancelInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code future} field. */
    @NativeType("XrFutureEXT")
    public long future() { return nfuture(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrFutureCancelInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTFuture#XR_TYPE_FUTURE_CANCEL_INFO_EXT TYPE_FUTURE_CANCEL_INFO_EXT} value to the {@code type} field. */
    public XrFutureCancelInfoEXT type$Default() { return type(EXTFuture.XR_TYPE_FUTURE_CANCEL_INFO_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrFutureCancelInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code future} field. */
    public XrFutureCancelInfoEXT future(@NativeType("XrFutureEXT") long value) { nfuture(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFutureCancelInfoEXT set(
        int type,
        long next,
        long future
    ) {
        type(type);
        next(next);
        future(future);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFutureCancelInfoEXT set(XrFutureCancelInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFutureCancelInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFutureCancelInfoEXT malloc() {
        return new XrFutureCancelInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFutureCancelInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFutureCancelInfoEXT calloc() {
        return new XrFutureCancelInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFutureCancelInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrFutureCancelInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFutureCancelInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrFutureCancelInfoEXT} instance for the specified memory address. */
    public static XrFutureCancelInfoEXT create(long address) {
        return new XrFutureCancelInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFutureCancelInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrFutureCancelInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrFutureCancelInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFutureCancelInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFutureCancelInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFutureCancelInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFutureCancelInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFutureCancelInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFutureCancelInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFutureCancelInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFutureCancelInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFutureCancelInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFutureCancelInfoEXT malloc(MemoryStack stack) {
        return new XrFutureCancelInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFutureCancelInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFutureCancelInfoEXT calloc(MemoryStack stack) {
        return new XrFutureCancelInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFutureCancelInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFutureCancelInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFutureCancelInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFutureCancelInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFutureCancelInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFutureCancelInfoEXT.NEXT); }
    /** Unsafe version of {@link #future}. */
    public static long nfuture(long struct) { return memGetLong(struct + XrFutureCancelInfoEXT.FUTURE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFutureCancelInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFutureCancelInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #future(long) future}. */
    public static void nfuture(long struct, long value) { memPutLong(struct + XrFutureCancelInfoEXT.FUTURE, value); }

    // -----------------------------------

    /** An array of {@link XrFutureCancelInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrFutureCancelInfoEXT, Buffer> implements NativeResource {

        private static final XrFutureCancelInfoEXT ELEMENT_FACTORY = XrFutureCancelInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrFutureCancelInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFutureCancelInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFutureCancelInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFutureCancelInfoEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrFutureCancelInfoEXT.nnext(address()); }
        /** @return the value of the {@code future} field. */
        @NativeType("XrFutureEXT")
        public long future() { return XrFutureCancelInfoEXT.nfuture(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrFutureCancelInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrFutureCancelInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTFuture#XR_TYPE_FUTURE_CANCEL_INFO_EXT TYPE_FUTURE_CANCEL_INFO_EXT} value to the {@code type} field. */
        public XrFutureCancelInfoEXT.Buffer type$Default() { return type(EXTFuture.XR_TYPE_FUTURE_CANCEL_INFO_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrFutureCancelInfoEXT.Buffer next(@NativeType("void const *") long value) { XrFutureCancelInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code future} field. */
        public XrFutureCancelInfoEXT.Buffer future(@NativeType("XrFutureEXT") long value) { XrFutureCancelInfoEXT.nfuture(address(), value); return this; }

    }

}
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
 * struct XrFuturePollResultProgressBD {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 isSupported;
 *     uint32_t progressPercentage;
 * }}</pre>
 */
public class XrFuturePollResultProgressBD extends Struct<XrFuturePollResultProgressBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ISSUPPORTED,
        PROGRESSPERCENTAGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ISSUPPORTED = layout.offsetof(2);
        PROGRESSPERCENTAGE = layout.offsetof(3);
    }

    protected XrFuturePollResultProgressBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFuturePollResultProgressBD create(long address, @Nullable ByteBuffer container) {
        return new XrFuturePollResultProgressBD(address, container);
    }

    /**
     * Creates a {@code XrFuturePollResultProgressBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFuturePollResultProgressBD(ByteBuffer container) {
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
    /** @return the value of the {@code isSupported} field. */
    @NativeType("XrBool32")
    public boolean isSupported() { return nisSupported(address()) != 0; }
    /** @return the value of the {@code progressPercentage} field. */
    @NativeType("uint32_t")
    public int progressPercentage() { return nprogressPercentage(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrFuturePollResultProgressBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDFutureProgress#XR_TYPE_FUTURE_POLL_RESULT_PROGRESS_BD TYPE_FUTURE_POLL_RESULT_PROGRESS_BD} value to the {@code type} field. */
    public XrFuturePollResultProgressBD type$Default() { return type(BDFutureProgress.XR_TYPE_FUTURE_POLL_RESULT_PROGRESS_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrFuturePollResultProgressBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFuturePollResultProgressBD set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFuturePollResultProgressBD set(XrFuturePollResultProgressBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFuturePollResultProgressBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFuturePollResultProgressBD malloc() {
        return new XrFuturePollResultProgressBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFuturePollResultProgressBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFuturePollResultProgressBD calloc() {
        return new XrFuturePollResultProgressBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFuturePollResultProgressBD} instance allocated with {@link BufferUtils}. */
    public static XrFuturePollResultProgressBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFuturePollResultProgressBD(memAddress(container), container);
    }

    /** Returns a new {@code XrFuturePollResultProgressBD} instance for the specified memory address. */
    public static XrFuturePollResultProgressBD create(long address) {
        return new XrFuturePollResultProgressBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFuturePollResultProgressBD createSafe(long address) {
        return address == NULL ? null : new XrFuturePollResultProgressBD(address, null);
    }

    /**
     * Returns a new {@link XrFuturePollResultProgressBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFuturePollResultProgressBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFuturePollResultProgressBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFuturePollResultProgressBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFuturePollResultProgressBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFuturePollResultProgressBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFuturePollResultProgressBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFuturePollResultProgressBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFuturePollResultProgressBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFuturePollResultProgressBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFuturePollResultProgressBD malloc(MemoryStack stack) {
        return new XrFuturePollResultProgressBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFuturePollResultProgressBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFuturePollResultProgressBD calloc(MemoryStack stack) {
        return new XrFuturePollResultProgressBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFuturePollResultProgressBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFuturePollResultProgressBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFuturePollResultProgressBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFuturePollResultProgressBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFuturePollResultProgressBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFuturePollResultProgressBD.NEXT); }
    /** Unsafe version of {@link #isSupported}. */
    public static int nisSupported(long struct) { return memGetInt(struct + XrFuturePollResultProgressBD.ISSUPPORTED); }
    /** Unsafe version of {@link #progressPercentage}. */
    public static int nprogressPercentage(long struct) { return memGetInt(struct + XrFuturePollResultProgressBD.PROGRESSPERCENTAGE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFuturePollResultProgressBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFuturePollResultProgressBD.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrFuturePollResultProgressBD} structs. */
    public static class Buffer extends StructBuffer<XrFuturePollResultProgressBD, Buffer> implements NativeResource {

        private static final XrFuturePollResultProgressBD ELEMENT_FACTORY = XrFuturePollResultProgressBD.create(-1L);

        /**
         * Creates a new {@code XrFuturePollResultProgressBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFuturePollResultProgressBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFuturePollResultProgressBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFuturePollResultProgressBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrFuturePollResultProgressBD.nnext(address()); }
        /** @return the value of the {@code isSupported} field. */
        @NativeType("XrBool32")
        public boolean isSupported() { return XrFuturePollResultProgressBD.nisSupported(address()) != 0; }
        /** @return the value of the {@code progressPercentage} field. */
        @NativeType("uint32_t")
        public int progressPercentage() { return XrFuturePollResultProgressBD.nprogressPercentage(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrFuturePollResultProgressBD.Buffer type(@NativeType("XrStructureType") int value) { XrFuturePollResultProgressBD.ntype(address(), value); return this; }
        /** Sets the {@link BDFutureProgress#XR_TYPE_FUTURE_POLL_RESULT_PROGRESS_BD TYPE_FUTURE_POLL_RESULT_PROGRESS_BD} value to the {@code type} field. */
        public XrFuturePollResultProgressBD.Buffer type$Default() { return type(BDFutureProgress.XR_TYPE_FUTURE_POLL_RESULT_PROGRESS_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrFuturePollResultProgressBD.Buffer next(@NativeType("void *") long value) { XrFuturePollResultProgressBD.nnext(address(), value); return this; }

    }

}
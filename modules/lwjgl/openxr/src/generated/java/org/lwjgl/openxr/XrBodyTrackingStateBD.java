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
 * struct XrBodyTrackingStateBD {
 *     XrStructureType type;
 *     void * next;
 *     XrBodyTrackingStatusBD status;
 *     XrBodyTrackingMessageBD message;
 * }}</pre>
 */
public class XrBodyTrackingStateBD extends Struct<XrBodyTrackingStateBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        STATUS,
        MESSAGE;

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
        STATUS = layout.offsetof(2);
        MESSAGE = layout.offsetof(3);
    }

    protected XrBodyTrackingStateBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodyTrackingStateBD create(long address, @Nullable ByteBuffer container) {
        return new XrBodyTrackingStateBD(address, container);
    }

    /**
     * Creates a {@code XrBodyTrackingStateBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodyTrackingStateBD(ByteBuffer container) {
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
    /** @return the value of the {@code status} field. */
    @NativeType("XrBodyTrackingStatusBD")
    public int status() { return nstatus(address()); }
    /** @return the value of the {@code message} field. */
    @NativeType("XrBodyTrackingMessageBD")
    public int message() { return nmessage(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrBodyTrackingStateBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDBodyTrackingAuxiliaryMetrics#XR_TYPE_BODY_TRACKING_STATE_BD TYPE_BODY_TRACKING_STATE_BD} value to the {@code type} field. */
    public XrBodyTrackingStateBD type$Default() { return type(BDBodyTrackingAuxiliaryMetrics.XR_TYPE_BODY_TRACKING_STATE_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrBodyTrackingStateBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code status} field. */
    public XrBodyTrackingStateBD status(@NativeType("XrBodyTrackingStatusBD") int value) { nstatus(address(), value); return this; }
    /** Sets the specified value to the {@code message} field. */
    public XrBodyTrackingStateBD message(@NativeType("XrBodyTrackingMessageBD") int value) { nmessage(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBodyTrackingStateBD set(
        int type,
        long next,
        int status,
        int message
    ) {
        type(type);
        next(next);
        status(status);
        message(message);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBodyTrackingStateBD set(XrBodyTrackingStateBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodyTrackingStateBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodyTrackingStateBD malloc() {
        return new XrBodyTrackingStateBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodyTrackingStateBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodyTrackingStateBD calloc() {
        return new XrBodyTrackingStateBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodyTrackingStateBD} instance allocated with {@link BufferUtils}. */
    public static XrBodyTrackingStateBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodyTrackingStateBD(memAddress(container), container);
    }

    /** Returns a new {@code XrBodyTrackingStateBD} instance for the specified memory address. */
    public static XrBodyTrackingStateBD create(long address) {
        return new XrBodyTrackingStateBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBodyTrackingStateBD createSafe(long address) {
        return address == NULL ? null : new XrBodyTrackingStateBD(address, null);
    }

    /**
     * Returns a new {@link XrBodyTrackingStateBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingStateBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackingStateBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingStateBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackingStateBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingStateBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodyTrackingStateBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingStateBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBodyTrackingStateBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodyTrackingStateBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyTrackingStateBD malloc(MemoryStack stack) {
        return new XrBodyTrackingStateBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodyTrackingStateBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyTrackingStateBD calloc(MemoryStack stack) {
        return new XrBodyTrackingStateBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodyTrackingStateBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingStateBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackingStateBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingStateBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrBodyTrackingStateBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBodyTrackingStateBD.NEXT); }
    /** Unsafe version of {@link #status}. */
    public static int nstatus(long struct) { return memGetInt(struct + XrBodyTrackingStateBD.STATUS); }
    /** Unsafe version of {@link #message}. */
    public static int nmessage(long struct) { return memGetInt(struct + XrBodyTrackingStateBD.MESSAGE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrBodyTrackingStateBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBodyTrackingStateBD.NEXT, value); }
    /** Unsafe version of {@link #status(int) status}. */
    public static void nstatus(long struct, int value) { memPutInt(struct + XrBodyTrackingStateBD.STATUS, value); }
    /** Unsafe version of {@link #message(int) message}. */
    public static void nmessage(long struct, int value) { memPutInt(struct + XrBodyTrackingStateBD.MESSAGE, value); }

    // -----------------------------------

    /** An array of {@link XrBodyTrackingStateBD} structs. */
    public static class Buffer extends StructBuffer<XrBodyTrackingStateBD, Buffer> implements NativeResource {

        private static final XrBodyTrackingStateBD ELEMENT_FACTORY = XrBodyTrackingStateBD.create(-1L);

        /**
         * Creates a new {@code XrBodyTrackingStateBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodyTrackingStateBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodyTrackingStateBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBodyTrackingStateBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrBodyTrackingStateBD.nnext(address()); }
        /** @return the value of the {@code status} field. */
        @NativeType("XrBodyTrackingStatusBD")
        public int status() { return XrBodyTrackingStateBD.nstatus(address()); }
        /** @return the value of the {@code message} field. */
        @NativeType("XrBodyTrackingMessageBD")
        public int message() { return XrBodyTrackingStateBD.nmessage(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrBodyTrackingStateBD.Buffer type(@NativeType("XrStructureType") int value) { XrBodyTrackingStateBD.ntype(address(), value); return this; }
        /** Sets the {@link BDBodyTrackingAuxiliaryMetrics#XR_TYPE_BODY_TRACKING_STATE_BD TYPE_BODY_TRACKING_STATE_BD} value to the {@code type} field. */
        public XrBodyTrackingStateBD.Buffer type$Default() { return type(BDBodyTrackingAuxiliaryMetrics.XR_TYPE_BODY_TRACKING_STATE_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrBodyTrackingStateBD.Buffer next(@NativeType("void *") long value) { XrBodyTrackingStateBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code status} field. */
        public XrBodyTrackingStateBD.Buffer status(@NativeType("XrBodyTrackingStatusBD") int value) { XrBodyTrackingStateBD.nstatus(address(), value); return this; }
        /** Sets the specified value to the {@code message} field. */
        public XrBodyTrackingStateBD.Buffer message(@NativeType("XrBodyTrackingMessageBD") int value) { XrBodyTrackingStateBD.nmessage(address(), value); return this; }

    }

}
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
 * struct XrBodyTrackingFidelityStatusMETA {
 *     XrStructureType type;
 *     void * next;
 *     XrBodyTrackingFidelityMETA fidelity;
 * }}</pre>
 */
public class XrBodyTrackingFidelityStatusMETA extends Struct<XrBodyTrackingFidelityStatusMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FIDELITY;

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
        FIDELITY = layout.offsetof(2);
    }

    protected XrBodyTrackingFidelityStatusMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodyTrackingFidelityStatusMETA create(long address, @Nullable ByteBuffer container) {
        return new XrBodyTrackingFidelityStatusMETA(address, container);
    }

    /**
     * Creates a {@code XrBodyTrackingFidelityStatusMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodyTrackingFidelityStatusMETA(ByteBuffer container) {
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
    /** @return the value of the {@code fidelity} field. */
    @NativeType("XrBodyTrackingFidelityMETA")
    public int fidelity() { return nfidelity(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrBodyTrackingFidelityStatusMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METABodyTrackingFidelity#XR_TYPE_BODY_TRACKING_FIDELITY_STATUS_META TYPE_BODY_TRACKING_FIDELITY_STATUS_META} value to the {@code type} field. */
    public XrBodyTrackingFidelityStatusMETA type$Default() { return type(METABodyTrackingFidelity.XR_TYPE_BODY_TRACKING_FIDELITY_STATUS_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrBodyTrackingFidelityStatusMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBodyTrackingFidelityStatusMETA set(
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
    public XrBodyTrackingFidelityStatusMETA set(XrBodyTrackingFidelityStatusMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodyTrackingFidelityStatusMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodyTrackingFidelityStatusMETA malloc() {
        return new XrBodyTrackingFidelityStatusMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodyTrackingFidelityStatusMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodyTrackingFidelityStatusMETA calloc() {
        return new XrBodyTrackingFidelityStatusMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodyTrackingFidelityStatusMETA} instance allocated with {@link BufferUtils}. */
    public static XrBodyTrackingFidelityStatusMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodyTrackingFidelityStatusMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrBodyTrackingFidelityStatusMETA} instance for the specified memory address. */
    public static XrBodyTrackingFidelityStatusMETA create(long address) {
        return new XrBodyTrackingFidelityStatusMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBodyTrackingFidelityStatusMETA createSafe(long address) {
        return address == NULL ? null : new XrBodyTrackingFidelityStatusMETA(address, null);
    }

    /**
     * Returns a new {@link XrBodyTrackingFidelityStatusMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingFidelityStatusMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackingFidelityStatusMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingFidelityStatusMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackingFidelityStatusMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingFidelityStatusMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodyTrackingFidelityStatusMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingFidelityStatusMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBodyTrackingFidelityStatusMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodyTrackingFidelityStatusMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyTrackingFidelityStatusMETA malloc(MemoryStack stack) {
        return new XrBodyTrackingFidelityStatusMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodyTrackingFidelityStatusMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyTrackingFidelityStatusMETA calloc(MemoryStack stack) {
        return new XrBodyTrackingFidelityStatusMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodyTrackingFidelityStatusMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingFidelityStatusMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackingFidelityStatusMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackingFidelityStatusMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrBodyTrackingFidelityStatusMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBodyTrackingFidelityStatusMETA.NEXT); }
    /** Unsafe version of {@link #fidelity}. */
    public static int nfidelity(long struct) { return memGetInt(struct + XrBodyTrackingFidelityStatusMETA.FIDELITY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrBodyTrackingFidelityStatusMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBodyTrackingFidelityStatusMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrBodyTrackingFidelityStatusMETA} structs. */
    public static class Buffer extends StructBuffer<XrBodyTrackingFidelityStatusMETA, Buffer> implements NativeResource {

        private static final XrBodyTrackingFidelityStatusMETA ELEMENT_FACTORY = XrBodyTrackingFidelityStatusMETA.create(-1L);

        /**
         * Creates a new {@code XrBodyTrackingFidelityStatusMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodyTrackingFidelityStatusMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodyTrackingFidelityStatusMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBodyTrackingFidelityStatusMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrBodyTrackingFidelityStatusMETA.nnext(address()); }
        /** @return the value of the {@code fidelity} field. */
        @NativeType("XrBodyTrackingFidelityMETA")
        public int fidelity() { return XrBodyTrackingFidelityStatusMETA.nfidelity(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrBodyTrackingFidelityStatusMETA.Buffer type(@NativeType("XrStructureType") int value) { XrBodyTrackingFidelityStatusMETA.ntype(address(), value); return this; }
        /** Sets the {@link METABodyTrackingFidelity#XR_TYPE_BODY_TRACKING_FIDELITY_STATUS_META TYPE_BODY_TRACKING_FIDELITY_STATUS_META} value to the {@code type} field. */
        public XrBodyTrackingFidelityStatusMETA.Buffer type$Default() { return type(METABodyTrackingFidelity.XR_TYPE_BODY_TRACKING_FIDELITY_STATUS_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrBodyTrackingFidelityStatusMETA.Buffer next(@NativeType("void *") long value) { XrBodyTrackingFidelityStatusMETA.nnext(address(), value); return this; }

    }

}
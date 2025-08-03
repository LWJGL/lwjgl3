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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrSpatialAnchorCreateCompletionBD {
 *     XrStructureType type;
 *     void * next;
 *     XrResult futureResult;
 *     {@link XrUuidEXT XrUuidEXT} uuid;
 *     XrAnchorBD anchor;
 * }}</pre>
 */
public class XrSpatialAnchorCreateCompletionBD extends Struct<XrSpatialAnchorCreateCompletionBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURERESULT,
        UUID,
        ANCHOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(XrUuidEXT.SIZEOF, XrUuidEXT.ALIGNOF),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FUTURERESULT = layout.offsetof(2);
        UUID = layout.offsetof(3);
        ANCHOR = layout.offsetof(4);
    }

    protected XrSpatialAnchorCreateCompletionBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorCreateCompletionBD create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorCreateCompletionBD(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorCreateCompletionBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorCreateCompletionBD(ByteBuffer container) {
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
    /** @return a {@link XrUuidEXT} view of the {@code uuid} field. */
    public XrUuidEXT uuid() { return nuuid(address()); }
    /** @return the value of the {@code anchor} field. */
    @NativeType("XrAnchorBD")
    public long anchor() { return nanchor(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialAnchorCreateCompletionBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialAnchor#XR_TYPE_SPATIAL_ANCHOR_CREATE_COMPLETION_BD TYPE_SPATIAL_ANCHOR_CREATE_COMPLETION_BD} value to the {@code type} field. */
    public XrSpatialAnchorCreateCompletionBD type$Default() { return type(BDSpatialAnchor.XR_TYPE_SPATIAL_ANCHOR_CREATE_COMPLETION_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialAnchorCreateCompletionBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code futureResult} field. */
    public XrSpatialAnchorCreateCompletionBD futureResult(@NativeType("XrResult") int value) { nfutureResult(address(), value); return this; }
    /** Copies the specified {@link XrUuidEXT} to the {@code uuid} field. */
    public XrSpatialAnchorCreateCompletionBD uuid(XrUuidEXT value) { nuuid(address(), value); return this; }
    /** Passes the {@code uuid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialAnchorCreateCompletionBD uuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(uuid()); return this; }
    /** Sets the specified value to the {@code anchor} field. */
    public XrSpatialAnchorCreateCompletionBD anchor(XrAnchorBD value) { nanchor(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorCreateCompletionBD set(
        int type,
        long next,
        int futureResult,
        XrUuidEXT uuid,
        XrAnchorBD anchor
    ) {
        type(type);
        next(next);
        futureResult(futureResult);
        uuid(uuid);
        anchor(anchor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialAnchorCreateCompletionBD set(XrSpatialAnchorCreateCompletionBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorCreateCompletionBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorCreateCompletionBD malloc() {
        return new XrSpatialAnchorCreateCompletionBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorCreateCompletionBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorCreateCompletionBD calloc() {
        return new XrSpatialAnchorCreateCompletionBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorCreateCompletionBD} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorCreateCompletionBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorCreateCompletionBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorCreateCompletionBD} instance for the specified memory address. */
    public static XrSpatialAnchorCreateCompletionBD create(long address) {
        return new XrSpatialAnchorCreateCompletionBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorCreateCompletionBD createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorCreateCompletionBD(address, null);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT} instance to {@code XrSpatialAnchorCreateCompletionBD}. */
    public static XrSpatialAnchorCreateCompletionBD create(XrFutureCompletionBaseHeaderEXT value) {
        return new XrSpatialAnchorCreateCompletionBD(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateCompletionBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateCompletionBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateCompletionBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateCompletionBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateCompletionBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateCompletionBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorCreateCompletionBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateCompletionBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorCreateCompletionBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT.Buffer} instance to {@code XrSpatialAnchorCreateCompletionBD.Buffer}. */
    public static XrSpatialAnchorCreateCompletionBD.Buffer create(XrFutureCompletionBaseHeaderEXT.Buffer value) {
        return new XrSpatialAnchorCreateCompletionBD.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpatialAnchorCreateCompletionBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorCreateCompletionBD malloc(MemoryStack stack) {
        return new XrSpatialAnchorCreateCompletionBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorCreateCompletionBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorCreateCompletionBD calloc(MemoryStack stack) {
        return new XrSpatialAnchorCreateCompletionBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateCompletionBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateCompletionBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorCreateCompletionBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorCreateCompletionBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialAnchorCreateCompletionBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorCreateCompletionBD.NEXT); }
    /** Unsafe version of {@link #futureResult}. */
    public static int nfutureResult(long struct) { return memGetInt(struct + XrSpatialAnchorCreateCompletionBD.FUTURERESULT); }
    /** Unsafe version of {@link #uuid}. */
    public static XrUuidEXT nuuid(long struct) { return XrUuidEXT.create(struct + XrSpatialAnchorCreateCompletionBD.UUID); }
    /** Unsafe version of {@link #anchor}. */
    public static long nanchor(long struct) { return memGetAddress(struct + XrSpatialAnchorCreateCompletionBD.ANCHOR); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialAnchorCreateCompletionBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorCreateCompletionBD.NEXT, value); }
    /** Unsafe version of {@link #futureResult(int) futureResult}. */
    public static void nfutureResult(long struct, int value) { memPutInt(struct + XrSpatialAnchorCreateCompletionBD.FUTURERESULT, value); }
    /** Unsafe version of {@link #uuid(XrUuidEXT) uuid}. */
    public static void nuuid(long struct, XrUuidEXT value) { memCopy(value.address(), struct + XrSpatialAnchorCreateCompletionBD.UUID, XrUuidEXT.SIZEOF); }
    /** Unsafe version of {@link #anchor(XrAnchorBD) anchor}. */
    public static void nanchor(long struct, XrAnchorBD value) { memPutAddress(struct + XrSpatialAnchorCreateCompletionBD.ANCHOR, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialAnchorCreateCompletionBD.ANCHOR));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorCreateCompletionBD} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorCreateCompletionBD, Buffer> implements NativeResource {

        private static final XrSpatialAnchorCreateCompletionBD ELEMENT_FACTORY = XrSpatialAnchorCreateCompletionBD.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorCreateCompletionBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorCreateCompletionBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorCreateCompletionBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorCreateCompletionBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialAnchorCreateCompletionBD.nnext(address()); }
        /** @return the value of the {@code futureResult} field. */
        @NativeType("XrResult")
        public int futureResult() { return XrSpatialAnchorCreateCompletionBD.nfutureResult(address()); }
        /** @return a {@link XrUuidEXT} view of the {@code uuid} field. */
        public XrUuidEXT uuid() { return XrSpatialAnchorCreateCompletionBD.nuuid(address()); }
        /** @return the value of the {@code anchor} field. */
        @NativeType("XrAnchorBD")
        public long anchor() { return XrSpatialAnchorCreateCompletionBD.nanchor(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialAnchorCreateCompletionBD.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorCreateCompletionBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialAnchor#XR_TYPE_SPATIAL_ANCHOR_CREATE_COMPLETION_BD TYPE_SPATIAL_ANCHOR_CREATE_COMPLETION_BD} value to the {@code type} field. */
        public XrSpatialAnchorCreateCompletionBD.Buffer type$Default() { return type(BDSpatialAnchor.XR_TYPE_SPATIAL_ANCHOR_CREATE_COMPLETION_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialAnchorCreateCompletionBD.Buffer next(@NativeType("void *") long value) { XrSpatialAnchorCreateCompletionBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code futureResult} field. */
        public XrSpatialAnchorCreateCompletionBD.Buffer futureResult(@NativeType("XrResult") int value) { XrSpatialAnchorCreateCompletionBD.nfutureResult(address(), value); return this; }
        /** Copies the specified {@link XrUuidEXT} to the {@code uuid} field. */
        public XrSpatialAnchorCreateCompletionBD.Buffer uuid(XrUuidEXT value) { XrSpatialAnchorCreateCompletionBD.nuuid(address(), value); return this; }
        /** Passes the {@code uuid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialAnchorCreateCompletionBD.Buffer uuid(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(uuid()); return this; }
        /** Sets the specified value to the {@code anchor} field. */
        public XrSpatialAnchorCreateCompletionBD.Buffer anchor(XrAnchorBD value) { XrSpatialAnchorCreateCompletionBD.nanchor(address(), value); return this; }

    }

}
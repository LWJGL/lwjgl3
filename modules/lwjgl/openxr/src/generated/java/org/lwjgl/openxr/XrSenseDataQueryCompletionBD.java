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
 * struct XrSenseDataQueryCompletionBD {
 *     XrStructureType type;
 *     void * next;
 *     XrResult futureResult;
 *     XrSenseDataSnapshotBD snapshot;
 * }}</pre>
 */
public class XrSenseDataQueryCompletionBD extends Struct<XrSenseDataQueryCompletionBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURERESULT,
        SNAPSHOT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FUTURERESULT = layout.offsetof(2);
        SNAPSHOT = layout.offsetof(3);
    }

    protected XrSenseDataQueryCompletionBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSenseDataQueryCompletionBD create(long address, @Nullable ByteBuffer container) {
        return new XrSenseDataQueryCompletionBD(address, container);
    }

    /**
     * Creates a {@code XrSenseDataQueryCompletionBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSenseDataQueryCompletionBD(ByteBuffer container) {
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
    /** @return the value of the {@code snapshot} field. */
    @NativeType("XrSenseDataSnapshotBD")
    public long snapshot() { return nsnapshot(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSenseDataQueryCompletionBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialSensing#XR_TYPE_SENSE_DATA_QUERY_COMPLETION_BD TYPE_SENSE_DATA_QUERY_COMPLETION_BD} value to the {@code type} field. */
    public XrSenseDataQueryCompletionBD type$Default() { return type(BDSpatialSensing.XR_TYPE_SENSE_DATA_QUERY_COMPLETION_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSenseDataQueryCompletionBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code futureResult} field. */
    public XrSenseDataQueryCompletionBD futureResult(@NativeType("XrResult") int value) { nfutureResult(address(), value); return this; }
    /** Sets the specified value to the {@code snapshot} field. */
    public XrSenseDataQueryCompletionBD snapshot(XrSenseDataSnapshotBD value) { nsnapshot(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSenseDataQueryCompletionBD set(
        int type,
        long next,
        int futureResult,
        XrSenseDataSnapshotBD snapshot
    ) {
        type(type);
        next(next);
        futureResult(futureResult);
        snapshot(snapshot);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSenseDataQueryCompletionBD set(XrSenseDataQueryCompletionBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSenseDataQueryCompletionBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSenseDataQueryCompletionBD malloc() {
        return new XrSenseDataQueryCompletionBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSenseDataQueryCompletionBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSenseDataQueryCompletionBD calloc() {
        return new XrSenseDataQueryCompletionBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSenseDataQueryCompletionBD} instance allocated with {@link BufferUtils}. */
    public static XrSenseDataQueryCompletionBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSenseDataQueryCompletionBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSenseDataQueryCompletionBD} instance for the specified memory address. */
    public static XrSenseDataQueryCompletionBD create(long address) {
        return new XrSenseDataQueryCompletionBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSenseDataQueryCompletionBD createSafe(long address) {
        return address == NULL ? null : new XrSenseDataQueryCompletionBD(address, null);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT} instance to {@code XrSenseDataQueryCompletionBD}. */
    public static XrSenseDataQueryCompletionBD create(XrFutureCompletionBaseHeaderEXT value) {
        return new XrSenseDataQueryCompletionBD(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSenseDataQueryCompletionBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataQueryCompletionBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataQueryCompletionBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataQueryCompletionBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataQueryCompletionBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataQueryCompletionBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSenseDataQueryCompletionBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSenseDataQueryCompletionBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSenseDataQueryCompletionBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT.Buffer} instance to {@code XrSenseDataQueryCompletionBD.Buffer}. */
    public static XrSenseDataQueryCompletionBD.Buffer create(XrFutureCompletionBaseHeaderEXT.Buffer value) {
        return new XrSenseDataQueryCompletionBD.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSenseDataQueryCompletionBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSenseDataQueryCompletionBD malloc(MemoryStack stack) {
        return new XrSenseDataQueryCompletionBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSenseDataQueryCompletionBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSenseDataQueryCompletionBD calloc(MemoryStack stack) {
        return new XrSenseDataQueryCompletionBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSenseDataQueryCompletionBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSenseDataQueryCompletionBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataQueryCompletionBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSenseDataQueryCompletionBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSenseDataQueryCompletionBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSenseDataQueryCompletionBD.NEXT); }
    /** Unsafe version of {@link #futureResult}. */
    public static int nfutureResult(long struct) { return memGetInt(struct + XrSenseDataQueryCompletionBD.FUTURERESULT); }
    /** Unsafe version of {@link #snapshot}. */
    public static long nsnapshot(long struct) { return memGetAddress(struct + XrSenseDataQueryCompletionBD.SNAPSHOT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSenseDataQueryCompletionBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSenseDataQueryCompletionBD.NEXT, value); }
    /** Unsafe version of {@link #futureResult(int) futureResult}. */
    public static void nfutureResult(long struct, int value) { memPutInt(struct + XrSenseDataQueryCompletionBD.FUTURERESULT, value); }
    /** Unsafe version of {@link #snapshot(XrSenseDataSnapshotBD) snapshot}. */
    public static void nsnapshot(long struct, XrSenseDataSnapshotBD value) { memPutAddress(struct + XrSenseDataQueryCompletionBD.SNAPSHOT, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSenseDataQueryCompletionBD.SNAPSHOT));
    }

    // -----------------------------------

    /** An array of {@link XrSenseDataQueryCompletionBD} structs. */
    public static class Buffer extends StructBuffer<XrSenseDataQueryCompletionBD, Buffer> implements NativeResource {

        private static final XrSenseDataQueryCompletionBD ELEMENT_FACTORY = XrSenseDataQueryCompletionBD.create(-1L);

        /**
         * Creates a new {@code XrSenseDataQueryCompletionBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSenseDataQueryCompletionBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSenseDataQueryCompletionBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSenseDataQueryCompletionBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSenseDataQueryCompletionBD.nnext(address()); }
        /** @return the value of the {@code futureResult} field. */
        @NativeType("XrResult")
        public int futureResult() { return XrSenseDataQueryCompletionBD.nfutureResult(address()); }
        /** @return the value of the {@code snapshot} field. */
        @NativeType("XrSenseDataSnapshotBD")
        public long snapshot() { return XrSenseDataQueryCompletionBD.nsnapshot(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSenseDataQueryCompletionBD.Buffer type(@NativeType("XrStructureType") int value) { XrSenseDataQueryCompletionBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialSensing#XR_TYPE_SENSE_DATA_QUERY_COMPLETION_BD TYPE_SENSE_DATA_QUERY_COMPLETION_BD} value to the {@code type} field. */
        public XrSenseDataQueryCompletionBD.Buffer type$Default() { return type(BDSpatialSensing.XR_TYPE_SENSE_DATA_QUERY_COMPLETION_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSenseDataQueryCompletionBD.Buffer next(@NativeType("void *") long value) { XrSenseDataQueryCompletionBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code futureResult} field. */
        public XrSenseDataQueryCompletionBD.Buffer futureResult(@NativeType("XrResult") int value) { XrSenseDataQueryCompletionBD.nfutureResult(address(), value); return this; }
        /** Sets the specified value to the {@code snapshot} field. */
        public XrSenseDataQueryCompletionBD.Buffer snapshot(XrSenseDataSnapshotBD value) { XrSenseDataQueryCompletionBD.nsnapshot(address(), value); return this; }

    }

}
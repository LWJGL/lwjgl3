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
 * struct XrSurfaceAnchorCreateCompletionANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrResult futureResult;
 *     XrSpatialEntityIdEXT anchorEntityId;
 * }}</pre>
 */
public class XrSurfaceAnchorCreateCompletionANDROID extends Struct<XrSurfaceAnchorCreateCompletionANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURERESULT,
        ANCHORENTITYID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FUTURERESULT = layout.offsetof(2);
        ANCHORENTITYID = layout.offsetof(3);
    }

    protected XrSurfaceAnchorCreateCompletionANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSurfaceAnchorCreateCompletionANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSurfaceAnchorCreateCompletionANDROID(address, container);
    }

    /**
     * Creates a {@code XrSurfaceAnchorCreateCompletionANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSurfaceAnchorCreateCompletionANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code anchorEntityId} field. */
    @NativeType("XrSpatialEntityIdEXT")
    public long anchorEntityId() { return nanchorEntityId(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSurfaceAnchorCreateCompletionANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDGeospatialAnchor#XR_TYPE_SURFACE_ANCHOR_CREATE_COMPLETION_ANDROID TYPE_SURFACE_ANCHOR_CREATE_COMPLETION_ANDROID} value to the {@code type} field. */
    public XrSurfaceAnchorCreateCompletionANDROID type$Default() { return type(ANDROIDGeospatialAnchor.XR_TYPE_SURFACE_ANCHOR_CREATE_COMPLETION_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSurfaceAnchorCreateCompletionANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code futureResult} field. */
    public XrSurfaceAnchorCreateCompletionANDROID futureResult(@NativeType("XrResult") int value) { nfutureResult(address(), value); return this; }
    /** Sets the specified value to the {@code anchorEntityId} field. */
    public XrSurfaceAnchorCreateCompletionANDROID anchorEntityId(@NativeType("XrSpatialEntityIdEXT") long value) { nanchorEntityId(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSurfaceAnchorCreateCompletionANDROID set(
        int type,
        long next,
        int futureResult,
        long anchorEntityId
    ) {
        type(type);
        next(next);
        futureResult(futureResult);
        anchorEntityId(anchorEntityId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSurfaceAnchorCreateCompletionANDROID set(XrSurfaceAnchorCreateCompletionANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSurfaceAnchorCreateCompletionANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSurfaceAnchorCreateCompletionANDROID malloc() {
        return new XrSurfaceAnchorCreateCompletionANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSurfaceAnchorCreateCompletionANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSurfaceAnchorCreateCompletionANDROID calloc() {
        return new XrSurfaceAnchorCreateCompletionANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSurfaceAnchorCreateCompletionANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSurfaceAnchorCreateCompletionANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSurfaceAnchorCreateCompletionANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSurfaceAnchorCreateCompletionANDROID} instance for the specified memory address. */
    public static XrSurfaceAnchorCreateCompletionANDROID create(long address) {
        return new XrSurfaceAnchorCreateCompletionANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSurfaceAnchorCreateCompletionANDROID createSafe(long address) {
        return address == NULL ? null : new XrSurfaceAnchorCreateCompletionANDROID(address, null);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT} instance to {@code XrSurfaceAnchorCreateCompletionANDROID}. */
    public static XrSurfaceAnchorCreateCompletionANDROID create(XrFutureCompletionBaseHeaderEXT value) {
        return new XrSurfaceAnchorCreateCompletionANDROID(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSurfaceAnchorCreateCompletionANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSurfaceAnchorCreateCompletionANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSurfaceAnchorCreateCompletionANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSurfaceAnchorCreateCompletionANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSurfaceAnchorCreateCompletionANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSurfaceAnchorCreateCompletionANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSurfaceAnchorCreateCompletionANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSurfaceAnchorCreateCompletionANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSurfaceAnchorCreateCompletionANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT.Buffer} instance to {@code XrSurfaceAnchorCreateCompletionANDROID.Buffer}. */
    public static XrSurfaceAnchorCreateCompletionANDROID.Buffer create(XrFutureCompletionBaseHeaderEXT.Buffer value) {
        return new XrSurfaceAnchorCreateCompletionANDROID.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSurfaceAnchorCreateCompletionANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSurfaceAnchorCreateCompletionANDROID malloc(MemoryStack stack) {
        return new XrSurfaceAnchorCreateCompletionANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSurfaceAnchorCreateCompletionANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSurfaceAnchorCreateCompletionANDROID calloc(MemoryStack stack) {
        return new XrSurfaceAnchorCreateCompletionANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSurfaceAnchorCreateCompletionANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSurfaceAnchorCreateCompletionANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSurfaceAnchorCreateCompletionANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSurfaceAnchorCreateCompletionANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSurfaceAnchorCreateCompletionANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSurfaceAnchorCreateCompletionANDROID.NEXT); }
    /** Unsafe version of {@link #futureResult}. */
    public static int nfutureResult(long struct) { return memGetInt(struct + XrSurfaceAnchorCreateCompletionANDROID.FUTURERESULT); }
    /** Unsafe version of {@link #anchorEntityId}. */
    public static long nanchorEntityId(long struct) { return memGetLong(struct + XrSurfaceAnchorCreateCompletionANDROID.ANCHORENTITYID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSurfaceAnchorCreateCompletionANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSurfaceAnchorCreateCompletionANDROID.NEXT, value); }
    /** Unsafe version of {@link #futureResult(int) futureResult}. */
    public static void nfutureResult(long struct, int value) { memPutInt(struct + XrSurfaceAnchorCreateCompletionANDROID.FUTURERESULT, value); }
    /** Unsafe version of {@link #anchorEntityId(long) anchorEntityId}. */
    public static void nanchorEntityId(long struct, long value) { memPutLong(struct + XrSurfaceAnchorCreateCompletionANDROID.ANCHORENTITYID, value); }

    // -----------------------------------

    /** An array of {@link XrSurfaceAnchorCreateCompletionANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSurfaceAnchorCreateCompletionANDROID, Buffer> implements NativeResource {

        private static final XrSurfaceAnchorCreateCompletionANDROID ELEMENT_FACTORY = XrSurfaceAnchorCreateCompletionANDROID.create(-1L);

        /**
         * Creates a new {@code XrSurfaceAnchorCreateCompletionANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSurfaceAnchorCreateCompletionANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSurfaceAnchorCreateCompletionANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSurfaceAnchorCreateCompletionANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSurfaceAnchorCreateCompletionANDROID.nnext(address()); }
        /** @return the value of the {@code futureResult} field. */
        @NativeType("XrResult")
        public int futureResult() { return XrSurfaceAnchorCreateCompletionANDROID.nfutureResult(address()); }
        /** @return the value of the {@code anchorEntityId} field. */
        @NativeType("XrSpatialEntityIdEXT")
        public long anchorEntityId() { return XrSurfaceAnchorCreateCompletionANDROID.nanchorEntityId(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSurfaceAnchorCreateCompletionANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSurfaceAnchorCreateCompletionANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDGeospatialAnchor#XR_TYPE_SURFACE_ANCHOR_CREATE_COMPLETION_ANDROID TYPE_SURFACE_ANCHOR_CREATE_COMPLETION_ANDROID} value to the {@code type} field. */
        public XrSurfaceAnchorCreateCompletionANDROID.Buffer type$Default() { return type(ANDROIDGeospatialAnchor.XR_TYPE_SURFACE_ANCHOR_CREATE_COMPLETION_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSurfaceAnchorCreateCompletionANDROID.Buffer next(@NativeType("void *") long value) { XrSurfaceAnchorCreateCompletionANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code futureResult} field. */
        public XrSurfaceAnchorCreateCompletionANDROID.Buffer futureResult(@NativeType("XrResult") int value) { XrSurfaceAnchorCreateCompletionANDROID.nfutureResult(address(), value); return this; }
        /** Sets the specified value to the {@code anchorEntityId} field. */
        public XrSurfaceAnchorCreateCompletionANDROID.Buffer anchorEntityId(@NativeType("XrSpatialEntityIdEXT") long value) { XrSurfaceAnchorCreateCompletionANDROID.nanchorEntityId(address(), value); return this; }

    }

}
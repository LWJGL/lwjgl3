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
 * struct XrSpatialAnchorsUpdateExpirationCompletionML {
 *     XrStructureType type;
 *     void * next;
 *     XrResult futureResult;
 * }}</pre>
 */
public class XrSpatialAnchorsUpdateExpirationCompletionML extends Struct<XrSpatialAnchorsUpdateExpirationCompletionML> implements NativeResource {

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

    protected XrSpatialAnchorsUpdateExpirationCompletionML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorsUpdateExpirationCompletionML create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorsUpdateExpirationCompletionML(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorsUpdateExpirationCompletionML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorsUpdateExpirationCompletionML(ByteBuffer container) {
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
    public XrSpatialAnchorsUpdateExpirationCompletionML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_ML TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_ML} value to the {@code type} field. */
    public XrSpatialAnchorsUpdateExpirationCompletionML type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialAnchorsUpdateExpirationCompletionML next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrSpatialAnchorsUpdateExpirationCompletionDetailsML} value to the {@code next} chain. */
    public XrSpatialAnchorsUpdateExpirationCompletionML next(XrSpatialAnchorsUpdateExpirationCompletionDetailsML value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code futureResult} field. */
    public XrSpatialAnchorsUpdateExpirationCompletionML futureResult(@NativeType("XrResult") int value) { nfutureResult(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorsUpdateExpirationCompletionML set(
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
    public XrSpatialAnchorsUpdateExpirationCompletionML set(XrSpatialAnchorsUpdateExpirationCompletionML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorsUpdateExpirationCompletionML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsUpdateExpirationCompletionML malloc() {
        return new XrSpatialAnchorsUpdateExpirationCompletionML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsUpdateExpirationCompletionML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsUpdateExpirationCompletionML calloc() {
        return new XrSpatialAnchorsUpdateExpirationCompletionML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsUpdateExpirationCompletionML} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorsUpdateExpirationCompletionML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorsUpdateExpirationCompletionML(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorsUpdateExpirationCompletionML} instance for the specified memory address. */
    public static XrSpatialAnchorsUpdateExpirationCompletionML create(long address) {
        return new XrSpatialAnchorsUpdateExpirationCompletionML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorsUpdateExpirationCompletionML createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorsUpdateExpirationCompletionML(address, null);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT} instance to {@code XrSpatialAnchorsUpdateExpirationCompletionML}. */
    public static XrSpatialAnchorsUpdateExpirationCompletionML create(XrFutureCompletionBaseHeaderEXT value) {
        return new XrSpatialAnchorsUpdateExpirationCompletionML(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpatialAnchorsUpdateExpirationCompletionML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsUpdateExpirationCompletionML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsUpdateExpirationCompletionML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorsUpdateExpirationCompletionML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorsUpdateExpirationCompletionML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT.Buffer} instance to {@code XrSpatialAnchorsUpdateExpirationCompletionML.Buffer}. */
    public static XrSpatialAnchorsUpdateExpirationCompletionML.Buffer create(XrFutureCompletionBaseHeaderEXT.Buffer value) {
        return new XrSpatialAnchorsUpdateExpirationCompletionML.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpatialAnchorsUpdateExpirationCompletionML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionML malloc(MemoryStack stack) {
        return new XrSpatialAnchorsUpdateExpirationCompletionML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorsUpdateExpirationCompletionML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionML calloc(MemoryStack stack) {
        return new XrSpatialAnchorsUpdateExpirationCompletionML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsUpdateExpirationCompletionML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsUpdateExpirationCompletionML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationCompletionML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialAnchorsUpdateExpirationCompletionML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorsUpdateExpirationCompletionML.NEXT); }
    /** Unsafe version of {@link #futureResult}. */
    public static int nfutureResult(long struct) { return memGetInt(struct + XrSpatialAnchorsUpdateExpirationCompletionML.FUTURERESULT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialAnchorsUpdateExpirationCompletionML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorsUpdateExpirationCompletionML.NEXT, value); }
    /** Unsafe version of {@link #futureResult(int) futureResult}. */
    public static void nfutureResult(long struct, int value) { memPutInt(struct + XrSpatialAnchorsUpdateExpirationCompletionML.FUTURERESULT, value); }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorsUpdateExpirationCompletionML} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorsUpdateExpirationCompletionML, Buffer> implements NativeResource {

        private static final XrSpatialAnchorsUpdateExpirationCompletionML ELEMENT_FACTORY = XrSpatialAnchorsUpdateExpirationCompletionML.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorsUpdateExpirationCompletionML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorsUpdateExpirationCompletionML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorsUpdateExpirationCompletionML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorsUpdateExpirationCompletionML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialAnchorsUpdateExpirationCompletionML.nnext(address()); }
        /** @return the value of the {@code futureResult} field. */
        @NativeType("XrResult")
        public int futureResult() { return XrSpatialAnchorsUpdateExpirationCompletionML.nfutureResult(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialAnchorsUpdateExpirationCompletionML.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorsUpdateExpirationCompletionML.ntype(address(), value); return this; }
        /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_ML TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_ML} value to the {@code type} field. */
        public XrSpatialAnchorsUpdateExpirationCompletionML.Buffer type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_COMPLETION_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialAnchorsUpdateExpirationCompletionML.Buffer next(@NativeType("void *") long value) { XrSpatialAnchorsUpdateExpirationCompletionML.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrSpatialAnchorsUpdateExpirationCompletionDetailsML} value to the {@code next} chain. */
        public XrSpatialAnchorsUpdateExpirationCompletionML.Buffer next(XrSpatialAnchorsUpdateExpirationCompletionDetailsML value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code futureResult} field. */
        public XrSpatialAnchorsUpdateExpirationCompletionML.Buffer futureResult(@NativeType("XrResult") int value) { XrSpatialAnchorsUpdateExpirationCompletionML.nfutureResult(address(), value); return this; }

    }

}
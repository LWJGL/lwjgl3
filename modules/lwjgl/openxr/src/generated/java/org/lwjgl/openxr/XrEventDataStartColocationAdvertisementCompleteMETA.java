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
 * struct XrEventDataStartColocationAdvertisementCompleteMETA {
 *     XrStructureType type;
 *     void const * next;
 *     XrAsyncRequestIdFB advertisementRequestId;
 *     XrResult result;
 *     {@link XrUuid XrUuid} advertisementUuid;
 * }}</pre>
 */
public class XrEventDataStartColocationAdvertisementCompleteMETA extends Struct<XrEventDataStartColocationAdvertisementCompleteMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ADVERTISEMENTREQUESTID,
        RESULT,
        ADVERTISEMENTUUID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(XrUuid.SIZEOF, XrUuid.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ADVERTISEMENTREQUESTID = layout.offsetof(2);
        RESULT = layout.offsetof(3);
        ADVERTISEMENTUUID = layout.offsetof(4);
    }

    protected XrEventDataStartColocationAdvertisementCompleteMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataStartColocationAdvertisementCompleteMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataStartColocationAdvertisementCompleteMETA(address, container);
    }

    /**
     * Creates a {@code XrEventDataStartColocationAdvertisementCompleteMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataStartColocationAdvertisementCompleteMETA(ByteBuffer container) {
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
    /** @return the value of the {@code advertisementRequestId} field. */
    @NativeType("XrAsyncRequestIdFB")
    public long advertisementRequestId() { return nadvertisementRequestId(address()); }
    /** @return the value of the {@code result} field. */
    @NativeType("XrResult")
    public int result() { return nresult(address()); }
    /** @return a {@link XrUuid} view of the {@code advertisementUuid} field. */
    public XrUuid advertisementUuid() { return nadvertisementUuid(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataStartColocationAdvertisementCompleteMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAColocationDiscovery#XR_TYPE_EVENT_DATA_START_COLOCATION_ADVERTISEMENT_COMPLETE_META TYPE_EVENT_DATA_START_COLOCATION_ADVERTISEMENT_COMPLETE_META} value to the {@code type} field. */
    public XrEventDataStartColocationAdvertisementCompleteMETA type$Default() { return type(METAColocationDiscovery.XR_TYPE_EVENT_DATA_START_COLOCATION_ADVERTISEMENT_COMPLETE_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataStartColocationAdvertisementCompleteMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataStartColocationAdvertisementCompleteMETA set(
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
    public XrEventDataStartColocationAdvertisementCompleteMETA set(XrEventDataStartColocationAdvertisementCompleteMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataStartColocationAdvertisementCompleteMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataStartColocationAdvertisementCompleteMETA malloc() {
        return new XrEventDataStartColocationAdvertisementCompleteMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataStartColocationAdvertisementCompleteMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataStartColocationAdvertisementCompleteMETA calloc() {
        return new XrEventDataStartColocationAdvertisementCompleteMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataStartColocationAdvertisementCompleteMETA} instance allocated with {@link BufferUtils}. */
    public static XrEventDataStartColocationAdvertisementCompleteMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataStartColocationAdvertisementCompleteMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataStartColocationAdvertisementCompleteMETA} instance for the specified memory address. */
    public static XrEventDataStartColocationAdvertisementCompleteMETA create(long address) {
        return new XrEventDataStartColocationAdvertisementCompleteMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataStartColocationAdvertisementCompleteMETA createSafe(long address) {
        return address == NULL ? null : new XrEventDataStartColocationAdvertisementCompleteMETA(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataStartColocationAdvertisementCompleteMETA}. */
    public static XrEventDataStartColocationAdvertisementCompleteMETA create(XrEventDataBaseHeader value) {
        return new XrEventDataStartColocationAdvertisementCompleteMETA(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataStartColocationAdvertisementCompleteMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataStartColocationAdvertisementCompleteMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataStartColocationAdvertisementCompleteMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataStartColocationAdvertisementCompleteMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataStartColocationAdvertisementCompleteMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataStartColocationAdvertisementCompleteMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataStartColocationAdvertisementCompleteMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataStartColocationAdvertisementCompleteMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataStartColocationAdvertisementCompleteMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataStartColocationAdvertisementCompleteMETA.Buffer}. */
    public static XrEventDataStartColocationAdvertisementCompleteMETA.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataStartColocationAdvertisementCompleteMETA.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataStartColocationAdvertisementCompleteMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataStartColocationAdvertisementCompleteMETA malloc(MemoryStack stack) {
        return new XrEventDataStartColocationAdvertisementCompleteMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataStartColocationAdvertisementCompleteMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataStartColocationAdvertisementCompleteMETA calloc(MemoryStack stack) {
        return new XrEventDataStartColocationAdvertisementCompleteMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataStartColocationAdvertisementCompleteMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataStartColocationAdvertisementCompleteMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataStartColocationAdvertisementCompleteMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataStartColocationAdvertisementCompleteMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataStartColocationAdvertisementCompleteMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataStartColocationAdvertisementCompleteMETA.NEXT); }
    /** Unsafe version of {@link #advertisementRequestId}. */
    public static long nadvertisementRequestId(long struct) { return memGetLong(struct + XrEventDataStartColocationAdvertisementCompleteMETA.ADVERTISEMENTREQUESTID); }
    /** Unsafe version of {@link #result}. */
    public static int nresult(long struct) { return memGetInt(struct + XrEventDataStartColocationAdvertisementCompleteMETA.RESULT); }
    /** Unsafe version of {@link #advertisementUuid}. */
    public static XrUuid nadvertisementUuid(long struct) { return XrUuid.create(struct + XrEventDataStartColocationAdvertisementCompleteMETA.ADVERTISEMENTUUID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataStartColocationAdvertisementCompleteMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataStartColocationAdvertisementCompleteMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataStartColocationAdvertisementCompleteMETA} structs. */
    public static class Buffer extends StructBuffer<XrEventDataStartColocationAdvertisementCompleteMETA, Buffer> implements NativeResource {

        private static final XrEventDataStartColocationAdvertisementCompleteMETA ELEMENT_FACTORY = XrEventDataStartColocationAdvertisementCompleteMETA.create(-1L);

        /**
         * Creates a new {@code XrEventDataStartColocationAdvertisementCompleteMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataStartColocationAdvertisementCompleteMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataStartColocationAdvertisementCompleteMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataStartColocationAdvertisementCompleteMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataStartColocationAdvertisementCompleteMETA.nnext(address()); }
        /** @return the value of the {@code advertisementRequestId} field. */
        @NativeType("XrAsyncRequestIdFB")
        public long advertisementRequestId() { return XrEventDataStartColocationAdvertisementCompleteMETA.nadvertisementRequestId(address()); }
        /** @return the value of the {@code result} field. */
        @NativeType("XrResult")
        public int result() { return XrEventDataStartColocationAdvertisementCompleteMETA.nresult(address()); }
        /** @return a {@link XrUuid} view of the {@code advertisementUuid} field. */
        public XrUuid advertisementUuid() { return XrEventDataStartColocationAdvertisementCompleteMETA.nadvertisementUuid(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataStartColocationAdvertisementCompleteMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataStartColocationAdvertisementCompleteMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAColocationDiscovery#XR_TYPE_EVENT_DATA_START_COLOCATION_ADVERTISEMENT_COMPLETE_META TYPE_EVENT_DATA_START_COLOCATION_ADVERTISEMENT_COMPLETE_META} value to the {@code type} field. */
        public XrEventDataStartColocationAdvertisementCompleteMETA.Buffer type$Default() { return type(METAColocationDiscovery.XR_TYPE_EVENT_DATA_START_COLOCATION_ADVERTISEMENT_COMPLETE_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataStartColocationAdvertisementCompleteMETA.Buffer next(@NativeType("void const *") long value) { XrEventDataStartColocationAdvertisementCompleteMETA.nnext(address(), value); return this; }

    }

}
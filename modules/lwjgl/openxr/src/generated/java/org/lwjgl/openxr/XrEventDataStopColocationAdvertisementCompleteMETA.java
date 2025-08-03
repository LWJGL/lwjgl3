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
 * struct XrEventDataStopColocationAdvertisementCompleteMETA {
 *     XrStructureType type;
 *     void const * next;
 *     XrAsyncRequestIdFB requestId;
 *     XrResult result;
 * }}</pre>
 */
public class XrEventDataStopColocationAdvertisementCompleteMETA extends Struct<XrEventDataStopColocationAdvertisementCompleteMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        REQUESTID,
        RESULT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        REQUESTID = layout.offsetof(2);
        RESULT = layout.offsetof(3);
    }

    protected XrEventDataStopColocationAdvertisementCompleteMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataStopColocationAdvertisementCompleteMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataStopColocationAdvertisementCompleteMETA(address, container);
    }

    /**
     * Creates a {@code XrEventDataStopColocationAdvertisementCompleteMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataStopColocationAdvertisementCompleteMETA(ByteBuffer container) {
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
    /** @return the value of the {@code requestId} field. */
    @NativeType("XrAsyncRequestIdFB")
    public long requestId() { return nrequestId(address()); }
    /** @return the value of the {@code result} field. */
    @NativeType("XrResult")
    public int result() { return nresult(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataStopColocationAdvertisementCompleteMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAColocationDiscovery#XR_TYPE_EVENT_DATA_STOP_COLOCATION_ADVERTISEMENT_COMPLETE_META TYPE_EVENT_DATA_STOP_COLOCATION_ADVERTISEMENT_COMPLETE_META} value to the {@code type} field. */
    public XrEventDataStopColocationAdvertisementCompleteMETA type$Default() { return type(METAColocationDiscovery.XR_TYPE_EVENT_DATA_STOP_COLOCATION_ADVERTISEMENT_COMPLETE_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataStopColocationAdvertisementCompleteMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataStopColocationAdvertisementCompleteMETA set(
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
    public XrEventDataStopColocationAdvertisementCompleteMETA set(XrEventDataStopColocationAdvertisementCompleteMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataStopColocationAdvertisementCompleteMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataStopColocationAdvertisementCompleteMETA malloc() {
        return new XrEventDataStopColocationAdvertisementCompleteMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataStopColocationAdvertisementCompleteMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataStopColocationAdvertisementCompleteMETA calloc() {
        return new XrEventDataStopColocationAdvertisementCompleteMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataStopColocationAdvertisementCompleteMETA} instance allocated with {@link BufferUtils}. */
    public static XrEventDataStopColocationAdvertisementCompleteMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataStopColocationAdvertisementCompleteMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataStopColocationAdvertisementCompleteMETA} instance for the specified memory address. */
    public static XrEventDataStopColocationAdvertisementCompleteMETA create(long address) {
        return new XrEventDataStopColocationAdvertisementCompleteMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataStopColocationAdvertisementCompleteMETA createSafe(long address) {
        return address == NULL ? null : new XrEventDataStopColocationAdvertisementCompleteMETA(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataStopColocationAdvertisementCompleteMETA}. */
    public static XrEventDataStopColocationAdvertisementCompleteMETA create(XrEventDataBaseHeader value) {
        return new XrEventDataStopColocationAdvertisementCompleteMETA(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataStopColocationAdvertisementCompleteMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataStopColocationAdvertisementCompleteMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataStopColocationAdvertisementCompleteMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataStopColocationAdvertisementCompleteMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataStopColocationAdvertisementCompleteMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataStopColocationAdvertisementCompleteMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataStopColocationAdvertisementCompleteMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataStopColocationAdvertisementCompleteMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataStopColocationAdvertisementCompleteMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataStopColocationAdvertisementCompleteMETA.Buffer}. */
    public static XrEventDataStopColocationAdvertisementCompleteMETA.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataStopColocationAdvertisementCompleteMETA.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataStopColocationAdvertisementCompleteMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataStopColocationAdvertisementCompleteMETA malloc(MemoryStack stack) {
        return new XrEventDataStopColocationAdvertisementCompleteMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataStopColocationAdvertisementCompleteMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataStopColocationAdvertisementCompleteMETA calloc(MemoryStack stack) {
        return new XrEventDataStopColocationAdvertisementCompleteMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataStopColocationAdvertisementCompleteMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataStopColocationAdvertisementCompleteMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataStopColocationAdvertisementCompleteMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataStopColocationAdvertisementCompleteMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataStopColocationAdvertisementCompleteMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataStopColocationAdvertisementCompleteMETA.NEXT); }
    /** Unsafe version of {@link #requestId}. */
    public static long nrequestId(long struct) { return memGetLong(struct + XrEventDataStopColocationAdvertisementCompleteMETA.REQUESTID); }
    /** Unsafe version of {@link #result}. */
    public static int nresult(long struct) { return memGetInt(struct + XrEventDataStopColocationAdvertisementCompleteMETA.RESULT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataStopColocationAdvertisementCompleteMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataStopColocationAdvertisementCompleteMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataStopColocationAdvertisementCompleteMETA} structs. */
    public static class Buffer extends StructBuffer<XrEventDataStopColocationAdvertisementCompleteMETA, Buffer> implements NativeResource {

        private static final XrEventDataStopColocationAdvertisementCompleteMETA ELEMENT_FACTORY = XrEventDataStopColocationAdvertisementCompleteMETA.create(-1L);

        /**
         * Creates a new {@code XrEventDataStopColocationAdvertisementCompleteMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataStopColocationAdvertisementCompleteMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataStopColocationAdvertisementCompleteMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataStopColocationAdvertisementCompleteMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataStopColocationAdvertisementCompleteMETA.nnext(address()); }
        /** @return the value of the {@code requestId} field. */
        @NativeType("XrAsyncRequestIdFB")
        public long requestId() { return XrEventDataStopColocationAdvertisementCompleteMETA.nrequestId(address()); }
        /** @return the value of the {@code result} field. */
        @NativeType("XrResult")
        public int result() { return XrEventDataStopColocationAdvertisementCompleteMETA.nresult(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataStopColocationAdvertisementCompleteMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataStopColocationAdvertisementCompleteMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAColocationDiscovery#XR_TYPE_EVENT_DATA_STOP_COLOCATION_ADVERTISEMENT_COMPLETE_META TYPE_EVENT_DATA_STOP_COLOCATION_ADVERTISEMENT_COMPLETE_META} value to the {@code type} field. */
        public XrEventDataStopColocationAdvertisementCompleteMETA.Buffer type$Default() { return type(METAColocationDiscovery.XR_TYPE_EVENT_DATA_STOP_COLOCATION_ADVERTISEMENT_COMPLETE_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataStopColocationAdvertisementCompleteMETA.Buffer next(@NativeType("void const *") long value) { XrEventDataStopColocationAdvertisementCompleteMETA.nnext(address(), value); return this; }

    }

}
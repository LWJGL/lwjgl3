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
 * struct XrEventDataStartColocationDiscoveryCompleteMETA {
 *     XrStructureType type;
 *     void const * next;
 *     XrAsyncRequestIdFB discoveryRequestId;
 *     XrResult result;
 * }}</pre>
 */
public class XrEventDataStartColocationDiscoveryCompleteMETA extends Struct<XrEventDataStartColocationDiscoveryCompleteMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        DISCOVERYREQUESTID,
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
        DISCOVERYREQUESTID = layout.offsetof(2);
        RESULT = layout.offsetof(3);
    }

    protected XrEventDataStartColocationDiscoveryCompleteMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataStartColocationDiscoveryCompleteMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataStartColocationDiscoveryCompleteMETA(address, container);
    }

    /**
     * Creates a {@code XrEventDataStartColocationDiscoveryCompleteMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataStartColocationDiscoveryCompleteMETA(ByteBuffer container) {
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
    /** @return the value of the {@code discoveryRequestId} field. */
    @NativeType("XrAsyncRequestIdFB")
    public long discoveryRequestId() { return ndiscoveryRequestId(address()); }
    /** @return the value of the {@code result} field. */
    @NativeType("XrResult")
    public int result() { return nresult(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataStartColocationDiscoveryCompleteMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAColocationDiscovery#XR_TYPE_EVENT_DATA_START_COLOCATION_DISCOVERY_COMPLETE_META TYPE_EVENT_DATA_START_COLOCATION_DISCOVERY_COMPLETE_META} value to the {@code type} field. */
    public XrEventDataStartColocationDiscoveryCompleteMETA type$Default() { return type(METAColocationDiscovery.XR_TYPE_EVENT_DATA_START_COLOCATION_DISCOVERY_COMPLETE_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataStartColocationDiscoveryCompleteMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataStartColocationDiscoveryCompleteMETA set(
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
    public XrEventDataStartColocationDiscoveryCompleteMETA set(XrEventDataStartColocationDiscoveryCompleteMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataStartColocationDiscoveryCompleteMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataStartColocationDiscoveryCompleteMETA malloc() {
        return new XrEventDataStartColocationDiscoveryCompleteMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataStartColocationDiscoveryCompleteMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataStartColocationDiscoveryCompleteMETA calloc() {
        return new XrEventDataStartColocationDiscoveryCompleteMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataStartColocationDiscoveryCompleteMETA} instance allocated with {@link BufferUtils}. */
    public static XrEventDataStartColocationDiscoveryCompleteMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataStartColocationDiscoveryCompleteMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataStartColocationDiscoveryCompleteMETA} instance for the specified memory address. */
    public static XrEventDataStartColocationDiscoveryCompleteMETA create(long address) {
        return new XrEventDataStartColocationDiscoveryCompleteMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataStartColocationDiscoveryCompleteMETA createSafe(long address) {
        return address == NULL ? null : new XrEventDataStartColocationDiscoveryCompleteMETA(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataStartColocationDiscoveryCompleteMETA}. */
    public static XrEventDataStartColocationDiscoveryCompleteMETA create(XrEventDataBaseHeader value) {
        return new XrEventDataStartColocationDiscoveryCompleteMETA(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataStartColocationDiscoveryCompleteMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataStartColocationDiscoveryCompleteMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataStartColocationDiscoveryCompleteMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataStartColocationDiscoveryCompleteMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataStartColocationDiscoveryCompleteMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataStartColocationDiscoveryCompleteMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataStartColocationDiscoveryCompleteMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataStartColocationDiscoveryCompleteMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataStartColocationDiscoveryCompleteMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataStartColocationDiscoveryCompleteMETA.Buffer}. */
    public static XrEventDataStartColocationDiscoveryCompleteMETA.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataStartColocationDiscoveryCompleteMETA.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataStartColocationDiscoveryCompleteMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataStartColocationDiscoveryCompleteMETA malloc(MemoryStack stack) {
        return new XrEventDataStartColocationDiscoveryCompleteMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataStartColocationDiscoveryCompleteMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataStartColocationDiscoveryCompleteMETA calloc(MemoryStack stack) {
        return new XrEventDataStartColocationDiscoveryCompleteMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataStartColocationDiscoveryCompleteMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataStartColocationDiscoveryCompleteMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataStartColocationDiscoveryCompleteMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataStartColocationDiscoveryCompleteMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataStartColocationDiscoveryCompleteMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataStartColocationDiscoveryCompleteMETA.NEXT); }
    /** Unsafe version of {@link #discoveryRequestId}. */
    public static long ndiscoveryRequestId(long struct) { return memGetLong(struct + XrEventDataStartColocationDiscoveryCompleteMETA.DISCOVERYREQUESTID); }
    /** Unsafe version of {@link #result}. */
    public static int nresult(long struct) { return memGetInt(struct + XrEventDataStartColocationDiscoveryCompleteMETA.RESULT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataStartColocationDiscoveryCompleteMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataStartColocationDiscoveryCompleteMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataStartColocationDiscoveryCompleteMETA} structs. */
    public static class Buffer extends StructBuffer<XrEventDataStartColocationDiscoveryCompleteMETA, Buffer> implements NativeResource {

        private static final XrEventDataStartColocationDiscoveryCompleteMETA ELEMENT_FACTORY = XrEventDataStartColocationDiscoveryCompleteMETA.create(-1L);

        /**
         * Creates a new {@code XrEventDataStartColocationDiscoveryCompleteMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataStartColocationDiscoveryCompleteMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataStartColocationDiscoveryCompleteMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataStartColocationDiscoveryCompleteMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataStartColocationDiscoveryCompleteMETA.nnext(address()); }
        /** @return the value of the {@code discoveryRequestId} field. */
        @NativeType("XrAsyncRequestIdFB")
        public long discoveryRequestId() { return XrEventDataStartColocationDiscoveryCompleteMETA.ndiscoveryRequestId(address()); }
        /** @return the value of the {@code result} field. */
        @NativeType("XrResult")
        public int result() { return XrEventDataStartColocationDiscoveryCompleteMETA.nresult(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataStartColocationDiscoveryCompleteMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataStartColocationDiscoveryCompleteMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAColocationDiscovery#XR_TYPE_EVENT_DATA_START_COLOCATION_DISCOVERY_COMPLETE_META TYPE_EVENT_DATA_START_COLOCATION_DISCOVERY_COMPLETE_META} value to the {@code type} field. */
        public XrEventDataStartColocationDiscoveryCompleteMETA.Buffer type$Default() { return type(METAColocationDiscovery.XR_TYPE_EVENT_DATA_START_COLOCATION_DISCOVERY_COMPLETE_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataStartColocationDiscoveryCompleteMETA.Buffer next(@NativeType("void const *") long value) { XrEventDataStartColocationDiscoveryCompleteMETA.nnext(address(), value); return this; }

    }

}
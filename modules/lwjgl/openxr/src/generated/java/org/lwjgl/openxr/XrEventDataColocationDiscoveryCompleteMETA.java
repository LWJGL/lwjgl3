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
 * struct XrEventDataColocationDiscoveryCompleteMETA {
 *     XrStructureType type;
 *     void const * next;
 *     XrAsyncRequestIdFB discoveryRequestId;
 *     XrResult result;
 * }}</pre>
 */
public class XrEventDataColocationDiscoveryCompleteMETA extends Struct<XrEventDataColocationDiscoveryCompleteMETA> implements NativeResource {

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

    protected XrEventDataColocationDiscoveryCompleteMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataColocationDiscoveryCompleteMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataColocationDiscoveryCompleteMETA(address, container);
    }

    /**
     * Creates a {@code XrEventDataColocationDiscoveryCompleteMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataColocationDiscoveryCompleteMETA(ByteBuffer container) {
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
    public XrEventDataColocationDiscoveryCompleteMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAColocationDiscovery#XR_TYPE_EVENT_DATA_COLOCATION_DISCOVERY_COMPLETE_META TYPE_EVENT_DATA_COLOCATION_DISCOVERY_COMPLETE_META} value to the {@code type} field. */
    public XrEventDataColocationDiscoveryCompleteMETA type$Default() { return type(METAColocationDiscovery.XR_TYPE_EVENT_DATA_COLOCATION_DISCOVERY_COMPLETE_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataColocationDiscoveryCompleteMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataColocationDiscoveryCompleteMETA set(
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
    public XrEventDataColocationDiscoveryCompleteMETA set(XrEventDataColocationDiscoveryCompleteMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataColocationDiscoveryCompleteMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataColocationDiscoveryCompleteMETA malloc() {
        return new XrEventDataColocationDiscoveryCompleteMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataColocationDiscoveryCompleteMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataColocationDiscoveryCompleteMETA calloc() {
        return new XrEventDataColocationDiscoveryCompleteMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataColocationDiscoveryCompleteMETA} instance allocated with {@link BufferUtils}. */
    public static XrEventDataColocationDiscoveryCompleteMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataColocationDiscoveryCompleteMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataColocationDiscoveryCompleteMETA} instance for the specified memory address. */
    public static XrEventDataColocationDiscoveryCompleteMETA create(long address) {
        return new XrEventDataColocationDiscoveryCompleteMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataColocationDiscoveryCompleteMETA createSafe(long address) {
        return address == NULL ? null : new XrEventDataColocationDiscoveryCompleteMETA(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataColocationDiscoveryCompleteMETA}. */
    public static XrEventDataColocationDiscoveryCompleteMETA create(XrEventDataBaseHeader value) {
        return new XrEventDataColocationDiscoveryCompleteMETA(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataColocationDiscoveryCompleteMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataColocationDiscoveryCompleteMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataColocationDiscoveryCompleteMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataColocationDiscoveryCompleteMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataColocationDiscoveryCompleteMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataColocationDiscoveryCompleteMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataColocationDiscoveryCompleteMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataColocationDiscoveryCompleteMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataColocationDiscoveryCompleteMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataColocationDiscoveryCompleteMETA.Buffer}. */
    public static XrEventDataColocationDiscoveryCompleteMETA.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataColocationDiscoveryCompleteMETA.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataColocationDiscoveryCompleteMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataColocationDiscoveryCompleteMETA malloc(MemoryStack stack) {
        return new XrEventDataColocationDiscoveryCompleteMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataColocationDiscoveryCompleteMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataColocationDiscoveryCompleteMETA calloc(MemoryStack stack) {
        return new XrEventDataColocationDiscoveryCompleteMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataColocationDiscoveryCompleteMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataColocationDiscoveryCompleteMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataColocationDiscoveryCompleteMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataColocationDiscoveryCompleteMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataColocationDiscoveryCompleteMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataColocationDiscoveryCompleteMETA.NEXT); }
    /** Unsafe version of {@link #discoveryRequestId}. */
    public static long ndiscoveryRequestId(long struct) { return memGetLong(struct + XrEventDataColocationDiscoveryCompleteMETA.DISCOVERYREQUESTID); }
    /** Unsafe version of {@link #result}. */
    public static int nresult(long struct) { return memGetInt(struct + XrEventDataColocationDiscoveryCompleteMETA.RESULT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataColocationDiscoveryCompleteMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataColocationDiscoveryCompleteMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataColocationDiscoveryCompleteMETA} structs. */
    public static class Buffer extends StructBuffer<XrEventDataColocationDiscoveryCompleteMETA, Buffer> implements NativeResource {

        private static final XrEventDataColocationDiscoveryCompleteMETA ELEMENT_FACTORY = XrEventDataColocationDiscoveryCompleteMETA.create(-1L);

        /**
         * Creates a new {@code XrEventDataColocationDiscoveryCompleteMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataColocationDiscoveryCompleteMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataColocationDiscoveryCompleteMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataColocationDiscoveryCompleteMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataColocationDiscoveryCompleteMETA.nnext(address()); }
        /** @return the value of the {@code discoveryRequestId} field. */
        @NativeType("XrAsyncRequestIdFB")
        public long discoveryRequestId() { return XrEventDataColocationDiscoveryCompleteMETA.ndiscoveryRequestId(address()); }
        /** @return the value of the {@code result} field. */
        @NativeType("XrResult")
        public int result() { return XrEventDataColocationDiscoveryCompleteMETA.nresult(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataColocationDiscoveryCompleteMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataColocationDiscoveryCompleteMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAColocationDiscovery#XR_TYPE_EVENT_DATA_COLOCATION_DISCOVERY_COMPLETE_META TYPE_EVENT_DATA_COLOCATION_DISCOVERY_COMPLETE_META} value to the {@code type} field. */
        public XrEventDataColocationDiscoveryCompleteMETA.Buffer type$Default() { return type(METAColocationDiscovery.XR_TYPE_EVENT_DATA_COLOCATION_DISCOVERY_COMPLETE_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataColocationDiscoveryCompleteMETA.Buffer next(@NativeType("void const *") long value) { XrEventDataColocationDiscoveryCompleteMETA.nnext(address(), value); return this; }

    }

}
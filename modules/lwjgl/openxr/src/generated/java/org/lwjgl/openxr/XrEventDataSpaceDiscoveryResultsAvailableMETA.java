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
 * struct XrEventDataSpaceDiscoveryResultsAvailableMETA {
 *     XrStructureType type;
 *     void const * next;
 *     XrAsyncRequestIdFB requestId;
 * }}</pre>
 */
public class XrEventDataSpaceDiscoveryResultsAvailableMETA extends Struct<XrEventDataSpaceDiscoveryResultsAvailableMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        REQUESTID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        REQUESTID = layout.offsetof(2);
    }

    protected XrEventDataSpaceDiscoveryResultsAvailableMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataSpaceDiscoveryResultsAvailableMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataSpaceDiscoveryResultsAvailableMETA(address, container);
    }

    /**
     * Creates a {@code XrEventDataSpaceDiscoveryResultsAvailableMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataSpaceDiscoveryResultsAvailableMETA(ByteBuffer container) {
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

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataSpaceDiscoveryResultsAvailableMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METASpatialEntityDiscovery#XR_TYPE_EVENT_DATA_SPACE_DISCOVERY_RESULTS_AVAILABLE_META TYPE_EVENT_DATA_SPACE_DISCOVERY_RESULTS_AVAILABLE_META} value to the {@code type} field. */
    public XrEventDataSpaceDiscoveryResultsAvailableMETA type$Default() { return type(METASpatialEntityDiscovery.XR_TYPE_EVENT_DATA_SPACE_DISCOVERY_RESULTS_AVAILABLE_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataSpaceDiscoveryResultsAvailableMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataSpaceDiscoveryResultsAvailableMETA set(
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
    public XrEventDataSpaceDiscoveryResultsAvailableMETA set(XrEventDataSpaceDiscoveryResultsAvailableMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataSpaceDiscoveryResultsAvailableMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataSpaceDiscoveryResultsAvailableMETA malloc() {
        return new XrEventDataSpaceDiscoveryResultsAvailableMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSpaceDiscoveryResultsAvailableMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataSpaceDiscoveryResultsAvailableMETA calloc() {
        return new XrEventDataSpaceDiscoveryResultsAvailableMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSpaceDiscoveryResultsAvailableMETA} instance allocated with {@link BufferUtils}. */
    public static XrEventDataSpaceDiscoveryResultsAvailableMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataSpaceDiscoveryResultsAvailableMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataSpaceDiscoveryResultsAvailableMETA} instance for the specified memory address. */
    public static XrEventDataSpaceDiscoveryResultsAvailableMETA create(long address) {
        return new XrEventDataSpaceDiscoveryResultsAvailableMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataSpaceDiscoveryResultsAvailableMETA createSafe(long address) {
        return address == NULL ? null : new XrEventDataSpaceDiscoveryResultsAvailableMETA(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataSpaceDiscoveryResultsAvailableMETA}. */
    public static XrEventDataSpaceDiscoveryResultsAvailableMETA create(XrEventDataBaseHeader value) {
        return new XrEventDataSpaceDiscoveryResultsAvailableMETA(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataSpaceDiscoveryResultsAvailableMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceDiscoveryResultsAvailableMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceDiscoveryResultsAvailableMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceDiscoveryResultsAvailableMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceDiscoveryResultsAvailableMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceDiscoveryResultsAvailableMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataSpaceDiscoveryResultsAvailableMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceDiscoveryResultsAvailableMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataSpaceDiscoveryResultsAvailableMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataSpaceDiscoveryResultsAvailableMETA.Buffer}. */
    public static XrEventDataSpaceDiscoveryResultsAvailableMETA.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataSpaceDiscoveryResultsAvailableMETA.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataSpaceDiscoveryResultsAvailableMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSpaceDiscoveryResultsAvailableMETA malloc(MemoryStack stack) {
        return new XrEventDataSpaceDiscoveryResultsAvailableMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataSpaceDiscoveryResultsAvailableMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSpaceDiscoveryResultsAvailableMETA calloc(MemoryStack stack) {
        return new XrEventDataSpaceDiscoveryResultsAvailableMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataSpaceDiscoveryResultsAvailableMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceDiscoveryResultsAvailableMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceDiscoveryResultsAvailableMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceDiscoveryResultsAvailableMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataSpaceDiscoveryResultsAvailableMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataSpaceDiscoveryResultsAvailableMETA.NEXT); }
    /** Unsafe version of {@link #requestId}. */
    public static long nrequestId(long struct) { return memGetLong(struct + XrEventDataSpaceDiscoveryResultsAvailableMETA.REQUESTID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataSpaceDiscoveryResultsAvailableMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataSpaceDiscoveryResultsAvailableMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataSpaceDiscoveryResultsAvailableMETA} structs. */
    public static class Buffer extends StructBuffer<XrEventDataSpaceDiscoveryResultsAvailableMETA, Buffer> implements NativeResource {

        private static final XrEventDataSpaceDiscoveryResultsAvailableMETA ELEMENT_FACTORY = XrEventDataSpaceDiscoveryResultsAvailableMETA.create(-1L);

        /**
         * Creates a new {@code XrEventDataSpaceDiscoveryResultsAvailableMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataSpaceDiscoveryResultsAvailableMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataSpaceDiscoveryResultsAvailableMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataSpaceDiscoveryResultsAvailableMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataSpaceDiscoveryResultsAvailableMETA.nnext(address()); }
        /** @return the value of the {@code requestId} field. */
        @NativeType("XrAsyncRequestIdFB")
        public long requestId() { return XrEventDataSpaceDiscoveryResultsAvailableMETA.nrequestId(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataSpaceDiscoveryResultsAvailableMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataSpaceDiscoveryResultsAvailableMETA.ntype(address(), value); return this; }
        /** Sets the {@link METASpatialEntityDiscovery#XR_TYPE_EVENT_DATA_SPACE_DISCOVERY_RESULTS_AVAILABLE_META TYPE_EVENT_DATA_SPACE_DISCOVERY_RESULTS_AVAILABLE_META} value to the {@code type} field. */
        public XrEventDataSpaceDiscoveryResultsAvailableMETA.Buffer type$Default() { return type(METASpatialEntityDiscovery.XR_TYPE_EVENT_DATA_SPACE_DISCOVERY_RESULTS_AVAILABLE_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataSpaceDiscoveryResultsAvailableMETA.Buffer next(@NativeType("void const *") long value) { XrEventDataSpaceDiscoveryResultsAvailableMETA.nnext(address(), value); return this; }

    }

}
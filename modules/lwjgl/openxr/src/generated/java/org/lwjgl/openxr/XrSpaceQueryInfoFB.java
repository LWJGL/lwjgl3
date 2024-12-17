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
 * struct XrSpaceQueryInfoFB {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpaceQueryActionFB queryAction;
 *     uint32_t maxResultCount;
 *     XrDuration timeout;
 *     {@link XrSpaceFilterInfoBaseHeaderFB XrSpaceFilterInfoBaseHeaderFB} const * filter;
 *     {@link XrSpaceFilterInfoBaseHeaderFB XrSpaceFilterInfoBaseHeaderFB} const * excludeFilter;
 * }}</pre>
 */
public class XrSpaceQueryInfoFB extends Struct<XrSpaceQueryInfoFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        QUERYACTION,
        MAXRESULTCOUNT,
        TIMEOUT,
        FILTER,
        EXCLUDEFILTER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        QUERYACTION = layout.offsetof(2);
        MAXRESULTCOUNT = layout.offsetof(3);
        TIMEOUT = layout.offsetof(4);
        FILTER = layout.offsetof(5);
        EXCLUDEFILTER = layout.offsetof(6);
    }

    protected XrSpaceQueryInfoFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpaceQueryInfoFB create(long address, @Nullable ByteBuffer container) {
        return new XrSpaceQueryInfoFB(address, container);
    }

    /**
     * Creates a {@code XrSpaceQueryInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpaceQueryInfoFB(ByteBuffer container) {
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
    /** @return the value of the {@code queryAction} field. */
    @NativeType("XrSpaceQueryActionFB")
    public int queryAction() { return nqueryAction(address()); }
    /** @return the value of the {@code maxResultCount} field. */
    @NativeType("uint32_t")
    public int maxResultCount() { return nmaxResultCount(address()); }
    /** @return the value of the {@code timeout} field. */
    @NativeType("XrDuration")
    public long timeout() { return ntimeout(address()); }
    /** @return a {@link XrSpaceFilterInfoBaseHeaderFB} view of the struct pointed to by the {@code filter} field. */
    @NativeType("XrSpaceFilterInfoBaseHeaderFB const *")
    public @Nullable XrSpaceFilterInfoBaseHeaderFB filter() { return nfilter(address()); }
    /** @return a {@link XrSpaceFilterInfoBaseHeaderFB} view of the struct pointed to by the {@code excludeFilter} field. */
    @NativeType("XrSpaceFilterInfoBaseHeaderFB const *")
    public @Nullable XrSpaceFilterInfoBaseHeaderFB excludeFilter() { return nexcludeFilter(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpaceQueryInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntityQuery#XR_TYPE_SPACE_QUERY_INFO_FB TYPE_SPACE_QUERY_INFO_FB} value to the {@code type} field. */
    public XrSpaceQueryInfoFB type$Default() { return type(FBSpatialEntityQuery.XR_TYPE_SPACE_QUERY_INFO_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpaceQueryInfoFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code queryAction} field. */
    public XrSpaceQueryInfoFB queryAction(@NativeType("XrSpaceQueryActionFB") int value) { nqueryAction(address(), value); return this; }
    /** Sets the specified value to the {@code maxResultCount} field. */
    public XrSpaceQueryInfoFB maxResultCount(@NativeType("uint32_t") int value) { nmaxResultCount(address(), value); return this; }
    /** Sets the specified value to the {@code timeout} field. */
    public XrSpaceQueryInfoFB timeout(@NativeType("XrDuration") long value) { ntimeout(address(), value); return this; }
    /** Sets the address of the specified {@link XrSpaceFilterInfoBaseHeaderFB} to the {@code filter} field. */
    public XrSpaceQueryInfoFB filter(@Nullable @NativeType("XrSpaceFilterInfoBaseHeaderFB const *") XrSpaceFilterInfoBaseHeaderFB value) { nfilter(address(), value); return this; }
    /** Sets the address of the specified {@link XrSpaceFilterInfoBaseHeaderFB} to the {@code excludeFilter} field. */
    public XrSpaceQueryInfoFB excludeFilter(@Nullable @NativeType("XrSpaceFilterInfoBaseHeaderFB const *") XrSpaceFilterInfoBaseHeaderFB value) { nexcludeFilter(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpaceQueryInfoFB set(
        int type,
        long next,
        int queryAction,
        int maxResultCount,
        long timeout,
        @Nullable XrSpaceFilterInfoBaseHeaderFB filter,
        @Nullable XrSpaceFilterInfoBaseHeaderFB excludeFilter
    ) {
        type(type);
        next(next);
        queryAction(queryAction);
        maxResultCount(maxResultCount);
        timeout(timeout);
        filter(filter);
        excludeFilter(excludeFilter);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpaceQueryInfoFB set(XrSpaceQueryInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpaceQueryInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpaceQueryInfoFB malloc() {
        return new XrSpaceQueryInfoFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceQueryInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpaceQueryInfoFB calloc() {
        return new XrSpaceQueryInfoFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpaceQueryInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrSpaceQueryInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpaceQueryInfoFB(memAddress(container), container);
    }

    /** Returns a new {@code XrSpaceQueryInfoFB} instance for the specified memory address. */
    public static XrSpaceQueryInfoFB create(long address) {
        return new XrSpaceQueryInfoFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpaceQueryInfoFB createSafe(long address) {
        return address == NULL ? null : new XrSpaceQueryInfoFB(address, null);
    }

    /** Downcasts the specified {@code XrSpaceQueryInfoBaseHeaderFB} instance to {@code XrSpaceQueryInfoFB}. */
    public static XrSpaceQueryInfoFB create(XrSpaceQueryInfoBaseHeaderFB value) {
        return new XrSpaceQueryInfoFB(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpaceQueryInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceQueryInfoFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpaceQueryInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceQueryInfoFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceQueryInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpaceQueryInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpaceQueryInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpaceQueryInfoFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpaceQueryInfoFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrSpaceQueryInfoBaseHeaderFB.Buffer} instance to {@code XrSpaceQueryInfoFB.Buffer}. */
    public static XrSpaceQueryInfoFB.Buffer create(XrSpaceQueryInfoBaseHeaderFB.Buffer value) {
        return new XrSpaceQueryInfoFB.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpaceQueryInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceQueryInfoFB malloc(MemoryStack stack) {
        return new XrSpaceQueryInfoFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpaceQueryInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpaceQueryInfoFB calloc(MemoryStack stack) {
        return new XrSpaceQueryInfoFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpaceQueryInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceQueryInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpaceQueryInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpaceQueryInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpaceQueryInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpaceQueryInfoFB.NEXT); }
    /** Unsafe version of {@link #queryAction}. */
    public static int nqueryAction(long struct) { return memGetInt(struct + XrSpaceQueryInfoFB.QUERYACTION); }
    /** Unsafe version of {@link #maxResultCount}. */
    public static int nmaxResultCount(long struct) { return memGetInt(struct + XrSpaceQueryInfoFB.MAXRESULTCOUNT); }
    /** Unsafe version of {@link #timeout}. */
    public static long ntimeout(long struct) { return memGetLong(struct + XrSpaceQueryInfoFB.TIMEOUT); }
    /** Unsafe version of {@link #filter}. */
    public static @Nullable XrSpaceFilterInfoBaseHeaderFB nfilter(long struct) { return XrSpaceFilterInfoBaseHeaderFB.createSafe(memGetAddress(struct + XrSpaceQueryInfoFB.FILTER)); }
    /** Unsafe version of {@link #excludeFilter}. */
    public static @Nullable XrSpaceFilterInfoBaseHeaderFB nexcludeFilter(long struct) { return XrSpaceFilterInfoBaseHeaderFB.createSafe(memGetAddress(struct + XrSpaceQueryInfoFB.EXCLUDEFILTER)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpaceQueryInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpaceQueryInfoFB.NEXT, value); }
    /** Unsafe version of {@link #queryAction(int) queryAction}. */
    public static void nqueryAction(long struct, int value) { memPutInt(struct + XrSpaceQueryInfoFB.QUERYACTION, value); }
    /** Unsafe version of {@link #maxResultCount(int) maxResultCount}. */
    public static void nmaxResultCount(long struct, int value) { memPutInt(struct + XrSpaceQueryInfoFB.MAXRESULTCOUNT, value); }
    /** Unsafe version of {@link #timeout(long) timeout}. */
    public static void ntimeout(long struct, long value) { memPutLong(struct + XrSpaceQueryInfoFB.TIMEOUT, value); }
    /** Unsafe version of {@link #filter(XrSpaceFilterInfoBaseHeaderFB) filter}. */
    public static void nfilter(long struct, @Nullable XrSpaceFilterInfoBaseHeaderFB value) { memPutAddress(struct + XrSpaceQueryInfoFB.FILTER, memAddressSafe(value)); }
    /** Unsafe version of {@link #excludeFilter(XrSpaceFilterInfoBaseHeaderFB) excludeFilter}. */
    public static void nexcludeFilter(long struct, @Nullable XrSpaceFilterInfoBaseHeaderFB value) { memPutAddress(struct + XrSpaceQueryInfoFB.EXCLUDEFILTER, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link XrSpaceQueryInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrSpaceQueryInfoFB, Buffer> implements NativeResource {

        private static final XrSpaceQueryInfoFB ELEMENT_FACTORY = XrSpaceQueryInfoFB.create(-1L);

        /**
         * Creates a new {@code XrSpaceQueryInfoFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpaceQueryInfoFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpaceQueryInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpaceQueryInfoFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpaceQueryInfoFB.nnext(address()); }
        /** @return the value of the {@code queryAction} field. */
        @NativeType("XrSpaceQueryActionFB")
        public int queryAction() { return XrSpaceQueryInfoFB.nqueryAction(address()); }
        /** @return the value of the {@code maxResultCount} field. */
        @NativeType("uint32_t")
        public int maxResultCount() { return XrSpaceQueryInfoFB.nmaxResultCount(address()); }
        /** @return the value of the {@code timeout} field. */
        @NativeType("XrDuration")
        public long timeout() { return XrSpaceQueryInfoFB.ntimeout(address()); }
        /** @return a {@link XrSpaceFilterInfoBaseHeaderFB} view of the struct pointed to by the {@code filter} field. */
        @NativeType("XrSpaceFilterInfoBaseHeaderFB const *")
        public @Nullable XrSpaceFilterInfoBaseHeaderFB filter() { return XrSpaceQueryInfoFB.nfilter(address()); }
        /** @return a {@link XrSpaceFilterInfoBaseHeaderFB} view of the struct pointed to by the {@code excludeFilter} field. */
        @NativeType("XrSpaceFilterInfoBaseHeaderFB const *")
        public @Nullable XrSpaceFilterInfoBaseHeaderFB excludeFilter() { return XrSpaceQueryInfoFB.nexcludeFilter(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpaceQueryInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrSpaceQueryInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntityQuery#XR_TYPE_SPACE_QUERY_INFO_FB TYPE_SPACE_QUERY_INFO_FB} value to the {@code type} field. */
        public XrSpaceQueryInfoFB.Buffer type$Default() { return type(FBSpatialEntityQuery.XR_TYPE_SPACE_QUERY_INFO_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpaceQueryInfoFB.Buffer next(@NativeType("void const *") long value) { XrSpaceQueryInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code queryAction} field. */
        public XrSpaceQueryInfoFB.Buffer queryAction(@NativeType("XrSpaceQueryActionFB") int value) { XrSpaceQueryInfoFB.nqueryAction(address(), value); return this; }
        /** Sets the specified value to the {@code maxResultCount} field. */
        public XrSpaceQueryInfoFB.Buffer maxResultCount(@NativeType("uint32_t") int value) { XrSpaceQueryInfoFB.nmaxResultCount(address(), value); return this; }
        /** Sets the specified value to the {@code timeout} field. */
        public XrSpaceQueryInfoFB.Buffer timeout(@NativeType("XrDuration") long value) { XrSpaceQueryInfoFB.ntimeout(address(), value); return this; }
        /** Sets the address of the specified {@link XrSpaceFilterInfoBaseHeaderFB} to the {@code filter} field. */
        public XrSpaceQueryInfoFB.Buffer filter(@Nullable @NativeType("XrSpaceFilterInfoBaseHeaderFB const *") XrSpaceFilterInfoBaseHeaderFB value) { XrSpaceQueryInfoFB.nfilter(address(), value); return this; }
        /** Sets the address of the specified {@link XrSpaceFilterInfoBaseHeaderFB} to the {@code excludeFilter} field. */
        public XrSpaceQueryInfoFB.Buffer excludeFilter(@Nullable @NativeType("XrSpaceFilterInfoBaseHeaderFB const *") XrSpaceFilterInfoBaseHeaderFB value) { XrSpaceQueryInfoFB.nexcludeFilter(address(), value); return this; }

    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Event indicating a query has produced results.
 * 
 * <h5>Description</h5>
 * 
 * <p>It indicates a query request has produced some number of results. If a query yields results this event <b>must</b> be delivered before the {@link XrEventDataSpaceQueryCompleteFB} event is delivered. Call {@link FBSpatialEntityQuery#xrRetrieveSpaceQueryResultsFB RetrieveSpaceQueryResultsFB} to retrieve those results.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBSpatialEntityQuery XR_FB_spatial_entity_query} extension <b>must</b> be enabled prior to using {@link XrEventDataSpaceQueryResultsAvailableFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBSpatialEntityQuery#XR_TYPE_EVENT_DATA_SPACE_QUERY_RESULTS_AVAILABLE_FB TYPE_EVENT_DATA_SPACE_QUERY_RESULTS_AVAILABLE_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataSpaceQueryResultsAvailableFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrAsyncRequestIdFB {@link #requestId};
 * }</code></pre>
 */
public class XrEventDataSpaceQueryResultsAvailableFB extends Struct<XrEventDataSpaceQueryResultsAvailableFB> implements NativeResource {

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

    protected XrEventDataSpaceQueryResultsAvailableFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataSpaceQueryResultsAvailableFB create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataSpaceQueryResultsAvailableFB(address, container);
    }

    /**
     * Creates a {@code XrEventDataSpaceQueryResultsAvailableFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataSpaceQueryResultsAvailableFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the ID of the asynchronous query request. */
    @NativeType("XrAsyncRequestIdFB")
    public long requestId() { return nrequestId(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataSpaceQueryResultsAvailableFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSpatialEntityQuery#XR_TYPE_EVENT_DATA_SPACE_QUERY_RESULTS_AVAILABLE_FB TYPE_EVENT_DATA_SPACE_QUERY_RESULTS_AVAILABLE_FB} value to the {@link #type} field. */
    public XrEventDataSpaceQueryResultsAvailableFB type$Default() { return type(FBSpatialEntityQuery.XR_TYPE_EVENT_DATA_SPACE_QUERY_RESULTS_AVAILABLE_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataSpaceQueryResultsAvailableFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataSpaceQueryResultsAvailableFB set(
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
    public XrEventDataSpaceQueryResultsAvailableFB set(XrEventDataSpaceQueryResultsAvailableFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataSpaceQueryResultsAvailableFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataSpaceQueryResultsAvailableFB malloc() {
        return new XrEventDataSpaceQueryResultsAvailableFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSpaceQueryResultsAvailableFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataSpaceQueryResultsAvailableFB calloc() {
        return new XrEventDataSpaceQueryResultsAvailableFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataSpaceQueryResultsAvailableFB} instance allocated with {@link BufferUtils}. */
    public static XrEventDataSpaceQueryResultsAvailableFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataSpaceQueryResultsAvailableFB(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataSpaceQueryResultsAvailableFB} instance for the specified memory address. */
    public static XrEventDataSpaceQueryResultsAvailableFB create(long address) {
        return new XrEventDataSpaceQueryResultsAvailableFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataSpaceQueryResultsAvailableFB createSafe(long address) {
        return address == NULL ? null : new XrEventDataSpaceQueryResultsAvailableFB(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataSpaceQueryResultsAvailableFB}. */
    public static XrEventDataSpaceQueryResultsAvailableFB create(XrEventDataBaseHeader value) {
        return new XrEventDataSpaceQueryResultsAvailableFB(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataSpaceQueryResultsAvailableFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceQueryResultsAvailableFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceQueryResultsAvailableFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceQueryResultsAvailableFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceQueryResultsAvailableFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceQueryResultsAvailableFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataSpaceQueryResultsAvailableFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceQueryResultsAvailableFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataSpaceQueryResultsAvailableFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataSpaceQueryResultsAvailableFB.Buffer}. */
    public static XrEventDataSpaceQueryResultsAvailableFB.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataSpaceQueryResultsAvailableFB.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataSpaceQueryResultsAvailableFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSpaceQueryResultsAvailableFB malloc(MemoryStack stack) {
        return new XrEventDataSpaceQueryResultsAvailableFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataSpaceQueryResultsAvailableFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataSpaceQueryResultsAvailableFB calloc(MemoryStack stack) {
        return new XrEventDataSpaceQueryResultsAvailableFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataSpaceQueryResultsAvailableFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceQueryResultsAvailableFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataSpaceQueryResultsAvailableFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataSpaceQueryResultsAvailableFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEventDataSpaceQueryResultsAvailableFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataSpaceQueryResultsAvailableFB.NEXT); }
    /** Unsafe version of {@link #requestId}. */
    public static long nrequestId(long struct) { return UNSAFE.getLong(null, struct + XrEventDataSpaceQueryResultsAvailableFB.REQUESTID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataSpaceQueryResultsAvailableFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataSpaceQueryResultsAvailableFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataSpaceQueryResultsAvailableFB} structs. */
    public static class Buffer extends StructBuffer<XrEventDataSpaceQueryResultsAvailableFB, Buffer> implements NativeResource {

        private static final XrEventDataSpaceQueryResultsAvailableFB ELEMENT_FACTORY = XrEventDataSpaceQueryResultsAvailableFB.create(-1L);

        /**
         * Creates a new {@code XrEventDataSpaceQueryResultsAvailableFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataSpaceQueryResultsAvailableFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataSpaceQueryResultsAvailableFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEventDataSpaceQueryResultsAvailableFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataSpaceQueryResultsAvailableFB.ntype(address()); }
        /** @return the value of the {@link XrEventDataSpaceQueryResultsAvailableFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataSpaceQueryResultsAvailableFB.nnext(address()); }
        /** @return the value of the {@link XrEventDataSpaceQueryResultsAvailableFB#requestId} field. */
        @NativeType("XrAsyncRequestIdFB")
        public long requestId() { return XrEventDataSpaceQueryResultsAvailableFB.nrequestId(address()); }

        /** Sets the specified value to the {@link XrEventDataSpaceQueryResultsAvailableFB#type} field. */
        public XrEventDataSpaceQueryResultsAvailableFB.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataSpaceQueryResultsAvailableFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSpatialEntityQuery#XR_TYPE_EVENT_DATA_SPACE_QUERY_RESULTS_AVAILABLE_FB TYPE_EVENT_DATA_SPACE_QUERY_RESULTS_AVAILABLE_FB} value to the {@link XrEventDataSpaceQueryResultsAvailableFB#type} field. */
        public XrEventDataSpaceQueryResultsAvailableFB.Buffer type$Default() { return type(FBSpatialEntityQuery.XR_TYPE_EVENT_DATA_SPACE_QUERY_RESULTS_AVAILABLE_FB); }
        /** Sets the specified value to the {@link XrEventDataSpaceQueryResultsAvailableFB#next} field. */
        public XrEventDataSpaceQueryResultsAvailableFB.Buffer next(@NativeType("void const *") long value) { XrEventDataSpaceQueryResultsAvailableFB.nnext(address(), value); return this; }

    }

}
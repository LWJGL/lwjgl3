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
 * Stop colocation advertisement complete event.
 * 
 * <h5>Description</h5>
 * 
 * <p>This event conveys the results of the asynchronous operation started by {@link METAColocationDiscovery#xrStopColocationAdvertisementMETA StopColocationAdvertisementMETA}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAColocationDiscovery XR_META_colocation_discovery} extension <b>must</b> be enabled prior to using {@link XrEventDataStopColocationAdvertisementCompleteMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAColocationDiscovery#XR_TYPE_EVENT_DATA_STOP_COLOCATION_ADVERTISEMENT_COMPLETE_META TYPE_EVENT_DATA_STOP_COLOCATION_ADVERTISEMENT_COMPLETE_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code result} <b>must</b> be a valid {@code XrResult} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrColocationAdvertisementStopInfoMETA}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataStopColocationAdvertisementCompleteMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrAsyncRequestIdFB {@link #requestId};
 *     XrResult {@link #result};
 * }</code></pre>
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

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** an {@code XrAsyncRequestIdFB} that identifies which request this event is in response to. The runtime <b>must</b> ensure this value matches a {@code requestId} returned during an {@link METAColocationDiscovery#xrStopColocationAdvertisementMETA StopColocationAdvertisementMETA} call. */
    @NativeType("XrAsyncRequestIdFB")
    public long requestId() { return nrequestId(address()); }
    /** an {@code XrResult} that specifies the request result. The valid {@code result} values are: {@link XR10#XR_SUCCESS SUCCESS}, {@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}, and {@link METAColocationDiscovery#XR_ERROR_COLOCATION_DISCOVERY_NETWORK_FAILED_META ERROR_COLOCATION_DISCOVERY_NETWORK_FAILED_META}. If the application does not already have an active colocation advertisement, the runtime <b>must</b> return {@link XR10#XR_SUCCESS SUCCESS}. */
    @NativeType("XrResult")
    public int result() { return nresult(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataStopColocationAdvertisementCompleteMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAColocationDiscovery#XR_TYPE_EVENT_DATA_STOP_COLOCATION_ADVERTISEMENT_COMPLETE_META TYPE_EVENT_DATA_STOP_COLOCATION_ADVERTISEMENT_COMPLETE_META} value to the {@link #type} field. */
    public XrEventDataStopColocationAdvertisementCompleteMETA type$Default() { return type(METAColocationDiscovery.XR_TYPE_EVENT_DATA_STOP_COLOCATION_ADVERTISEMENT_COMPLETE_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataStopColocationAdvertisementCompleteMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #requestId} field. */
    public XrEventDataStopColocationAdvertisementCompleteMETA requestId(@NativeType("XrAsyncRequestIdFB") long value) { nrequestId(address(), value); return this; }
    /** Sets the specified value to the {@link #result} field. */
    public XrEventDataStopColocationAdvertisementCompleteMETA result(@NativeType("XrResult") int value) { nresult(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataStopColocationAdvertisementCompleteMETA set(
        int type,
        long next,
        long requestId,
        int result
    ) {
        type(type);
        next(next);
        requestId(requestId);
        result(result);

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
    /** Unsafe version of {@link #requestId(long) requestId}. */
    public static void nrequestId(long struct, long value) { memPutLong(struct + XrEventDataStopColocationAdvertisementCompleteMETA.REQUESTID, value); }
    /** Unsafe version of {@link #result(int) result}. */
    public static void nresult(long struct, int value) { memPutInt(struct + XrEventDataStopColocationAdvertisementCompleteMETA.RESULT, value); }

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

        /** @return the value of the {@link XrEventDataStopColocationAdvertisementCompleteMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataStopColocationAdvertisementCompleteMETA.ntype(address()); }
        /** @return the value of the {@link XrEventDataStopColocationAdvertisementCompleteMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataStopColocationAdvertisementCompleteMETA.nnext(address()); }
        /** @return the value of the {@link XrEventDataStopColocationAdvertisementCompleteMETA#requestId} field. */
        @NativeType("XrAsyncRequestIdFB")
        public long requestId() { return XrEventDataStopColocationAdvertisementCompleteMETA.nrequestId(address()); }
        /** @return the value of the {@link XrEventDataStopColocationAdvertisementCompleteMETA#result} field. */
        @NativeType("XrResult")
        public int result() { return XrEventDataStopColocationAdvertisementCompleteMETA.nresult(address()); }

        /** Sets the specified value to the {@link XrEventDataStopColocationAdvertisementCompleteMETA#type} field. */
        public XrEventDataStopColocationAdvertisementCompleteMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataStopColocationAdvertisementCompleteMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAColocationDiscovery#XR_TYPE_EVENT_DATA_STOP_COLOCATION_ADVERTISEMENT_COMPLETE_META TYPE_EVENT_DATA_STOP_COLOCATION_ADVERTISEMENT_COMPLETE_META} value to the {@link XrEventDataStopColocationAdvertisementCompleteMETA#type} field. */
        public XrEventDataStopColocationAdvertisementCompleteMETA.Buffer type$Default() { return type(METAColocationDiscovery.XR_TYPE_EVENT_DATA_STOP_COLOCATION_ADVERTISEMENT_COMPLETE_META); }
        /** Sets the specified value to the {@link XrEventDataStopColocationAdvertisementCompleteMETA#next} field. */
        public XrEventDataStopColocationAdvertisementCompleteMETA.Buffer next(@NativeType("void const *") long value) { XrEventDataStopColocationAdvertisementCompleteMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataStopColocationAdvertisementCompleteMETA#requestId} field. */
        public XrEventDataStopColocationAdvertisementCompleteMETA.Buffer requestId(@NativeType("XrAsyncRequestIdFB") long value) { XrEventDataStopColocationAdvertisementCompleteMETA.nrequestId(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataStopColocationAdvertisementCompleteMETA#result} field. */
        public XrEventDataStopColocationAdvertisementCompleteMETA.Buffer result(@NativeType("XrResult") int value) { XrEventDataStopColocationAdvertisementCompleteMETA.nresult(address(), value); return this; }

    }

}
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
 * Start colocation visibility complete event.
 * 
 * <h5>Description</h5>
 * 
 * <p>This event conveys the results of the asynchronous operation started by {@link METAColocationDiscovery#xrStopColocationAdvertisementMETA StopColocationAdvertisementMETA}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAColocationDiscovery XR_META_colocation_discovery} extension <b>must</b> be enabled prior to using {@link XrEventDataStartColocationAdvertisementCompleteMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAColocationDiscovery#XR_TYPE_EVENT_DATA_START_COLOCATION_ADVERTISEMENT_COMPLETE_META TYPE_EVENT_DATA_START_COLOCATION_ADVERTISEMENT_COMPLETE_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code result} <b>must</b> be a valid {@code XrResult} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrColocationAdvertisementStartInfoMETA}, {@link XrUuid}, {@link METAColocationDiscovery#xrStartColocationAdvertisementMETA StartColocationAdvertisementMETA}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataStartColocationAdvertisementCompleteMETA {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrAsyncRequestIdFB {@link #advertisementRequestId};
 *     XrResult {@link #result};
 *     {@link XrUuid XrUuid} {@link #advertisementUuid};
 * }</code></pre>
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

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** an {@code XrAsyncRequestIdFB} that identifies which request this event is in response to. The runtime <b>must</b> ensure this value matches a {@code advertisementRequestId} returned during an {@link METAColocationDiscovery#xrStartColocationAdvertisementMETA StartColocationAdvertisementMETA} call. */
    @NativeType("XrAsyncRequestIdFB")
    public long advertisementRequestId() { return nadvertisementRequestId(address()); }
    /** an {@code XrResult} that specifies the request result. The valid {@code result} values are: {@link XR10#XR_SUCCESS SUCCESS}, {@link XR10#XR_ERROR_RUNTIME_FAILURE ERROR_RUNTIME_FAILURE}, {@link METAColocationDiscovery#XR_COLOCATION_DISCOVERY_ALREADY_ADVERTISING_META COLOCATION_DISCOVERY_ALREADY_ADVERTISING_META}, {@link METAColocationDiscovery#XR_ERROR_COLOCATION_DISCOVERY_NO_DISCOVERY_METHOD_META ERROR_COLOCATION_DISCOVERY_NO_DISCOVERY_METHOD_META}, and {@link METAColocationDiscovery#XR_ERROR_COLOCATION_DISCOVERY_NETWORK_FAILED_META ERROR_COLOCATION_DISCOVERY_NETWORK_FAILED_META}. If the application already has an active colocation advertisement, the runtime <b>must</b> return {@link METAColocationDiscovery#XR_COLOCATION_DISCOVERY_ALREADY_ADVERTISING_META COLOCATION_DISCOVERY_ALREADY_ADVERTISING_META} in this field. */
    @NativeType("XrResult")
    public int result() { return nresult(address()); }
    /** an {@link XrUuid} which is discoverable by other physically colocated devices running the same application. The runtime <b>must</b> return a unique {@link XrUuid} which has not been returned in a previous {@link XrEventDataStartColocationAdvertisementCompleteMETA} event, if {@code result} is {@link XR10#XR_SUCCESS SUCCESS}. */
    public XrUuid advertisementUuid() { return nadvertisementUuid(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataStartColocationAdvertisementCompleteMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAColocationDiscovery#XR_TYPE_EVENT_DATA_START_COLOCATION_ADVERTISEMENT_COMPLETE_META TYPE_EVENT_DATA_START_COLOCATION_ADVERTISEMENT_COMPLETE_META} value to the {@link #type} field. */
    public XrEventDataStartColocationAdvertisementCompleteMETA type$Default() { return type(METAColocationDiscovery.XR_TYPE_EVENT_DATA_START_COLOCATION_ADVERTISEMENT_COMPLETE_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataStartColocationAdvertisementCompleteMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #advertisementRequestId} field. */
    public XrEventDataStartColocationAdvertisementCompleteMETA advertisementRequestId(@NativeType("XrAsyncRequestIdFB") long value) { nadvertisementRequestId(address(), value); return this; }
    /** Sets the specified value to the {@link #result} field. */
    public XrEventDataStartColocationAdvertisementCompleteMETA result(@NativeType("XrResult") int value) { nresult(address(), value); return this; }
    /** Copies the specified {@link XrUuid} to the {@link #advertisementUuid} field. */
    public XrEventDataStartColocationAdvertisementCompleteMETA advertisementUuid(XrUuid value) { nadvertisementUuid(address(), value); return this; }
    /** Passes the {@link #advertisementUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrEventDataStartColocationAdvertisementCompleteMETA advertisementUuid(java.util.function.Consumer<XrUuid> consumer) { consumer.accept(advertisementUuid()); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataStartColocationAdvertisementCompleteMETA set(
        int type,
        long next,
        long advertisementRequestId,
        int result,
        XrUuid advertisementUuid
    ) {
        type(type);
        next(next);
        advertisementRequestId(advertisementRequestId);
        result(result);
        advertisementUuid(advertisementUuid);

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
    /** Unsafe version of {@link #advertisementRequestId(long) advertisementRequestId}. */
    public static void nadvertisementRequestId(long struct, long value) { memPutLong(struct + XrEventDataStartColocationAdvertisementCompleteMETA.ADVERTISEMENTREQUESTID, value); }
    /** Unsafe version of {@link #result(int) result}. */
    public static void nresult(long struct, int value) { memPutInt(struct + XrEventDataStartColocationAdvertisementCompleteMETA.RESULT, value); }
    /** Unsafe version of {@link #advertisementUuid(XrUuid) advertisementUuid}. */
    public static void nadvertisementUuid(long struct, XrUuid value) { memCopy(value.address(), struct + XrEventDataStartColocationAdvertisementCompleteMETA.ADVERTISEMENTUUID, XrUuid.SIZEOF); }

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

        /** @return the value of the {@link XrEventDataStartColocationAdvertisementCompleteMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataStartColocationAdvertisementCompleteMETA.ntype(address()); }
        /** @return the value of the {@link XrEventDataStartColocationAdvertisementCompleteMETA#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataStartColocationAdvertisementCompleteMETA.nnext(address()); }
        /** @return the value of the {@link XrEventDataStartColocationAdvertisementCompleteMETA#advertisementRequestId} field. */
        @NativeType("XrAsyncRequestIdFB")
        public long advertisementRequestId() { return XrEventDataStartColocationAdvertisementCompleteMETA.nadvertisementRequestId(address()); }
        /** @return the value of the {@link XrEventDataStartColocationAdvertisementCompleteMETA#result} field. */
        @NativeType("XrResult")
        public int result() { return XrEventDataStartColocationAdvertisementCompleteMETA.nresult(address()); }
        /** @return a {@link XrUuid} view of the {@link XrEventDataStartColocationAdvertisementCompleteMETA#advertisementUuid} field. */
        public XrUuid advertisementUuid() { return XrEventDataStartColocationAdvertisementCompleteMETA.nadvertisementUuid(address()); }

        /** Sets the specified value to the {@link XrEventDataStartColocationAdvertisementCompleteMETA#type} field. */
        public XrEventDataStartColocationAdvertisementCompleteMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataStartColocationAdvertisementCompleteMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAColocationDiscovery#XR_TYPE_EVENT_DATA_START_COLOCATION_ADVERTISEMENT_COMPLETE_META TYPE_EVENT_DATA_START_COLOCATION_ADVERTISEMENT_COMPLETE_META} value to the {@link XrEventDataStartColocationAdvertisementCompleteMETA#type} field. */
        public XrEventDataStartColocationAdvertisementCompleteMETA.Buffer type$Default() { return type(METAColocationDiscovery.XR_TYPE_EVENT_DATA_START_COLOCATION_ADVERTISEMENT_COMPLETE_META); }
        /** Sets the specified value to the {@link XrEventDataStartColocationAdvertisementCompleteMETA#next} field. */
        public XrEventDataStartColocationAdvertisementCompleteMETA.Buffer next(@NativeType("void const *") long value) { XrEventDataStartColocationAdvertisementCompleteMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataStartColocationAdvertisementCompleteMETA#advertisementRequestId} field. */
        public XrEventDataStartColocationAdvertisementCompleteMETA.Buffer advertisementRequestId(@NativeType("XrAsyncRequestIdFB") long value) { XrEventDataStartColocationAdvertisementCompleteMETA.nadvertisementRequestId(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataStartColocationAdvertisementCompleteMETA#result} field. */
        public XrEventDataStartColocationAdvertisementCompleteMETA.Buffer result(@NativeType("XrResult") int value) { XrEventDataStartColocationAdvertisementCompleteMETA.nresult(address(), value); return this; }
        /** Copies the specified {@link XrUuid} to the {@link XrEventDataStartColocationAdvertisementCompleteMETA#advertisementUuid} field. */
        public XrEventDataStartColocationAdvertisementCompleteMETA.Buffer advertisementUuid(XrUuid value) { XrEventDataStartColocationAdvertisementCompleteMETA.nadvertisementUuid(address(), value); return this; }
        /** Passes the {@link XrEventDataStartColocationAdvertisementCompleteMETA#advertisementUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrEventDataStartColocationAdvertisementCompleteMETA.Buffer advertisementUuid(java.util.function.Consumer<XrUuid> consumer) { consumer.accept(advertisementUuid()); return this; }

    }

}
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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.openxr.METAColocationDiscovery.*;

/**
 * <pre>{@code
 * struct XrEventDataColocationDiscoveryResultMETA {
 *     XrStructureType type;
 *     void const * next;
 *     XrAsyncRequestIdFB discoveryRequestId;
 *     {@link XrUuid XrUuid} advertisementUuid;
 *     uint32_t bufferSize;
 *     uint8_t buffer[XR_MAX_COLOCATION_DISCOVERY_BUFFER_SIZE_META];
 * }}</pre>
 */
public class XrEventDataColocationDiscoveryResultMETA extends Struct<XrEventDataColocationDiscoveryResultMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        DISCOVERYREQUESTID,
        ADVERTISEMENTUUID,
        BUFFERSIZE,
        BUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrUuid.SIZEOF, XrUuid.ALIGNOF),
            __member(4),
            __array(1, XR_MAX_COLOCATION_DISCOVERY_BUFFER_SIZE_META)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        DISCOVERYREQUESTID = layout.offsetof(2);
        ADVERTISEMENTUUID = layout.offsetof(3);
        BUFFERSIZE = layout.offsetof(4);
        BUFFER = layout.offsetof(5);
    }

    protected XrEventDataColocationDiscoveryResultMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataColocationDiscoveryResultMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataColocationDiscoveryResultMETA(address, container);
    }

    /**
     * Creates a {@code XrEventDataColocationDiscoveryResultMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataColocationDiscoveryResultMETA(ByteBuffer container) {
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
    /** @return a {@link XrUuid} view of the {@code advertisementUuid} field. */
    public XrUuid advertisementUuid() { return nadvertisementUuid(address()); }
    /** @return the value of the {@code bufferSize} field. */
    @NativeType("uint32_t")
    public int bufferSize() { return nbufferSize(address()); }
    /** @return a {@link ByteBuffer} view of the {@code buffer} field. */
    @NativeType("uint8_t[XR_MAX_COLOCATION_DISCOVERY_BUFFER_SIZE_META]")
    public ByteBuffer buffer() { return nbuffer(address()); }
    /** @return the value at the specified index of the {@code buffer} field. */
    @NativeType("uint8_t")
    public byte buffer(int index) { return nbuffer(address(), index); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataColocationDiscoveryResultMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAColocationDiscovery#XR_TYPE_EVENT_DATA_COLOCATION_DISCOVERY_RESULT_META TYPE_EVENT_DATA_COLOCATION_DISCOVERY_RESULT_META} value to the {@code type} field. */
    public XrEventDataColocationDiscoveryResultMETA type$Default() { return type(METAColocationDiscovery.XR_TYPE_EVENT_DATA_COLOCATION_DISCOVERY_RESULT_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataColocationDiscoveryResultMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code discoveryRequestId} field. */
    public XrEventDataColocationDiscoveryResultMETA discoveryRequestId(@NativeType("XrAsyncRequestIdFB") long value) { ndiscoveryRequestId(address(), value); return this; }
    /** Copies the specified {@link XrUuid} to the {@code advertisementUuid} field. */
    public XrEventDataColocationDiscoveryResultMETA advertisementUuid(XrUuid value) { nadvertisementUuid(address(), value); return this; }
    /** Passes the {@code advertisementUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrEventDataColocationDiscoveryResultMETA advertisementUuid(java.util.function.Consumer<XrUuid> consumer) { consumer.accept(advertisementUuid()); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code buffer} field. */
    public XrEventDataColocationDiscoveryResultMETA buffer(@NativeType("uint8_t[XR_MAX_COLOCATION_DISCOVERY_BUFFER_SIZE_META]") ByteBuffer value) { nbuffer(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code buffer} field. */
    public XrEventDataColocationDiscoveryResultMETA buffer(int index, @NativeType("uint8_t") byte value) { nbuffer(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataColocationDiscoveryResultMETA set(
        int type,
        long next,
        long discoveryRequestId,
        XrUuid advertisementUuid,
        ByteBuffer buffer
    ) {
        type(type);
        next(next);
        discoveryRequestId(discoveryRequestId);
        advertisementUuid(advertisementUuid);
        buffer(buffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataColocationDiscoveryResultMETA set(XrEventDataColocationDiscoveryResultMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataColocationDiscoveryResultMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataColocationDiscoveryResultMETA malloc() {
        return new XrEventDataColocationDiscoveryResultMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataColocationDiscoveryResultMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataColocationDiscoveryResultMETA calloc() {
        return new XrEventDataColocationDiscoveryResultMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataColocationDiscoveryResultMETA} instance allocated with {@link BufferUtils}. */
    public static XrEventDataColocationDiscoveryResultMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataColocationDiscoveryResultMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataColocationDiscoveryResultMETA} instance for the specified memory address. */
    public static XrEventDataColocationDiscoveryResultMETA create(long address) {
        return new XrEventDataColocationDiscoveryResultMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataColocationDiscoveryResultMETA createSafe(long address) {
        return address == NULL ? null : new XrEventDataColocationDiscoveryResultMETA(address, null);
    }

    /**
     * Returns a new {@link XrEventDataColocationDiscoveryResultMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataColocationDiscoveryResultMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataColocationDiscoveryResultMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataColocationDiscoveryResultMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataColocationDiscoveryResultMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataColocationDiscoveryResultMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataColocationDiscoveryResultMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataColocationDiscoveryResultMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataColocationDiscoveryResultMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrEventDataColocationDiscoveryResultMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataColocationDiscoveryResultMETA malloc(MemoryStack stack) {
        return new XrEventDataColocationDiscoveryResultMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataColocationDiscoveryResultMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataColocationDiscoveryResultMETA calloc(MemoryStack stack) {
        return new XrEventDataColocationDiscoveryResultMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataColocationDiscoveryResultMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataColocationDiscoveryResultMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataColocationDiscoveryResultMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataColocationDiscoveryResultMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataColocationDiscoveryResultMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataColocationDiscoveryResultMETA.NEXT); }
    /** Unsafe version of {@link #discoveryRequestId}. */
    public static long ndiscoveryRequestId(long struct) { return memGetLong(struct + XrEventDataColocationDiscoveryResultMETA.DISCOVERYREQUESTID); }
    /** Unsafe version of {@link #advertisementUuid}. */
    public static XrUuid nadvertisementUuid(long struct) { return XrUuid.create(struct + XrEventDataColocationDiscoveryResultMETA.ADVERTISEMENTUUID); }
    /** Unsafe version of {@link #bufferSize}. */
    public static int nbufferSize(long struct) { return memGetInt(struct + XrEventDataColocationDiscoveryResultMETA.BUFFERSIZE); }
    /** Unsafe version of {@link #buffer}. */
    public static ByteBuffer nbuffer(long struct) { return memByteBuffer(struct + XrEventDataColocationDiscoveryResultMETA.BUFFER, nbufferSize(struct)); }
    /** Unsafe version of {@link #buffer(int) buffer}. */
    public static byte nbuffer(long struct, int index) {
        return memGetByte(struct + XrEventDataColocationDiscoveryResultMETA.BUFFER + check(index, XR_MAX_COLOCATION_DISCOVERY_BUFFER_SIZE_META) * 1);
    }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataColocationDiscoveryResultMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataColocationDiscoveryResultMETA.NEXT, value); }
    /** Unsafe version of {@link #discoveryRequestId(long) discoveryRequestId}. */
    public static void ndiscoveryRequestId(long struct, long value) { memPutLong(struct + XrEventDataColocationDiscoveryResultMETA.DISCOVERYREQUESTID, value); }
    /** Unsafe version of {@link #advertisementUuid(XrUuid) advertisementUuid}. */
    public static void nadvertisementUuid(long struct, XrUuid value) { memCopy(value.address(), struct + XrEventDataColocationDiscoveryResultMETA.ADVERTISEMENTUUID, XrUuid.SIZEOF); }
    /** Sets the specified value to the {@code bufferSize} field of the specified {@code struct}. */
    public static void nbufferSize(long struct, int value) { memPutInt(struct + XrEventDataColocationDiscoveryResultMETA.BUFFERSIZE, value); }
    /** Unsafe version of {@link #buffer(ByteBuffer) buffer}. */
    public static void nbuffer(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, XR_MAX_COLOCATION_DISCOVERY_BUFFER_SIZE_META); }
        memCopy(memAddress(value), struct + XrEventDataColocationDiscoveryResultMETA.BUFFER, value.remaining() * 1);
        nbufferSize(struct, value.remaining());
    }
    /** Unsafe version of {@link #buffer(int, byte) buffer}. */
    public static void nbuffer(long struct, int index, byte value) {
        memPutByte(struct + XrEventDataColocationDiscoveryResultMETA.BUFFER + check(index, XR_MAX_COLOCATION_DISCOVERY_BUFFER_SIZE_META) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link XrEventDataColocationDiscoveryResultMETA} structs. */
    public static class Buffer extends StructBuffer<XrEventDataColocationDiscoveryResultMETA, Buffer> implements NativeResource {

        private static final XrEventDataColocationDiscoveryResultMETA ELEMENT_FACTORY = XrEventDataColocationDiscoveryResultMETA.create(-1L);

        /**
         * Creates a new {@code XrEventDataColocationDiscoveryResultMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataColocationDiscoveryResultMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataColocationDiscoveryResultMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataColocationDiscoveryResultMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataColocationDiscoveryResultMETA.nnext(address()); }
        /** @return the value of the {@code discoveryRequestId} field. */
        @NativeType("XrAsyncRequestIdFB")
        public long discoveryRequestId() { return XrEventDataColocationDiscoveryResultMETA.ndiscoveryRequestId(address()); }
        /** @return a {@link XrUuid} view of the {@code advertisementUuid} field. */
        public XrUuid advertisementUuid() { return XrEventDataColocationDiscoveryResultMETA.nadvertisementUuid(address()); }
        /** @return the value of the {@code bufferSize} field. */
        @NativeType("uint32_t")
        public int bufferSize() { return XrEventDataColocationDiscoveryResultMETA.nbufferSize(address()); }
        /** @return a {@link ByteBuffer} view of the {@code buffer} field. */
        @NativeType("uint8_t[XR_MAX_COLOCATION_DISCOVERY_BUFFER_SIZE_META]")
        public ByteBuffer buffer() { return XrEventDataColocationDiscoveryResultMETA.nbuffer(address()); }
        /** @return the value at the specified index of the {@code buffer} field. */
        @NativeType("uint8_t")
        public byte buffer(int index) { return XrEventDataColocationDiscoveryResultMETA.nbuffer(address(), index); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataColocationDiscoveryResultMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataColocationDiscoveryResultMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAColocationDiscovery#XR_TYPE_EVENT_DATA_COLOCATION_DISCOVERY_RESULT_META TYPE_EVENT_DATA_COLOCATION_DISCOVERY_RESULT_META} value to the {@code type} field. */
        public XrEventDataColocationDiscoveryResultMETA.Buffer type$Default() { return type(METAColocationDiscovery.XR_TYPE_EVENT_DATA_COLOCATION_DISCOVERY_RESULT_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataColocationDiscoveryResultMETA.Buffer next(@NativeType("void const *") long value) { XrEventDataColocationDiscoveryResultMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code discoveryRequestId} field. */
        public XrEventDataColocationDiscoveryResultMETA.Buffer discoveryRequestId(@NativeType("XrAsyncRequestIdFB") long value) { XrEventDataColocationDiscoveryResultMETA.ndiscoveryRequestId(address(), value); return this; }
        /** Copies the specified {@link XrUuid} to the {@code advertisementUuid} field. */
        public XrEventDataColocationDiscoveryResultMETA.Buffer advertisementUuid(XrUuid value) { XrEventDataColocationDiscoveryResultMETA.nadvertisementUuid(address(), value); return this; }
        /** Passes the {@code advertisementUuid} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrEventDataColocationDiscoveryResultMETA.Buffer advertisementUuid(java.util.function.Consumer<XrUuid> consumer) { consumer.accept(advertisementUuid()); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code buffer} field. */
        public XrEventDataColocationDiscoveryResultMETA.Buffer buffer(@NativeType("uint8_t[XR_MAX_COLOCATION_DISCOVERY_BUFFER_SIZE_META]") ByteBuffer value) { XrEventDataColocationDiscoveryResultMETA.nbuffer(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code buffer} field. */
        public XrEventDataColocationDiscoveryResultMETA.Buffer buffer(int index, @NativeType("uint8_t") byte value) { XrEventDataColocationDiscoveryResultMETA.nbuffer(address(), index, value); return this; }

    }

}
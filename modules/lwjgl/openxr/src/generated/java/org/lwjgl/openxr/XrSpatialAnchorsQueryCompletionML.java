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
 * struct XrSpatialAnchorsQueryCompletionML {
 *     XrStructureType type;
 *     void * next;
 *     XrResult futureResult;
 *     uint32_t uuidCapacityInput;
 *     uint32_t uuidCountOutput;
 *     {@link XrUuidEXT XrUuidEXT} * uuids;
 * }}</pre>
 */
public class XrSpatialAnchorsQueryCompletionML extends Struct<XrSpatialAnchorsQueryCompletionML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURERESULT,
        UUIDCAPACITYINPUT,
        UUIDCOUNTOUTPUT,
        UUIDS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FUTURERESULT = layout.offsetof(2);
        UUIDCAPACITYINPUT = layout.offsetof(3);
        UUIDCOUNTOUTPUT = layout.offsetof(4);
        UUIDS = layout.offsetof(5);
    }

    protected XrSpatialAnchorsQueryCompletionML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorsQueryCompletionML create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorsQueryCompletionML(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorsQueryCompletionML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorsQueryCompletionML(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code futureResult} field. */
    @NativeType("XrResult")
    public int futureResult() { return nfutureResult(address()); }
    /** @return the value of the {@code uuidCapacityInput} field. */
    @NativeType("uint32_t")
    public int uuidCapacityInput() { return nuuidCapacityInput(address()); }
    /** @return the value of the {@code uuidCountOutput} field. */
    @NativeType("uint32_t")
    public int uuidCountOutput() { return nuuidCountOutput(address()); }
    /** @return a {@link XrUuidEXT.Buffer} view of the struct array pointed to by the {@code uuids} field. */
    @NativeType("XrUuidEXT *")
    public XrUuidEXT.@Nullable Buffer uuids() { return nuuids(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialAnchorsQueryCompletionML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_QUERY_COMPLETION_ML TYPE_SPATIAL_ANCHORS_QUERY_COMPLETION_ML} value to the {@code type} field. */
    public XrSpatialAnchorsQueryCompletionML type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_QUERY_COMPLETION_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialAnchorsQueryCompletionML next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code futureResult} field. */
    public XrSpatialAnchorsQueryCompletionML futureResult(@NativeType("XrResult") int value) { nfutureResult(address(), value); return this; }
    /** Sets the specified value to the {@code uuidCapacityInput} field. */
    public XrSpatialAnchorsQueryCompletionML uuidCapacityInput(@NativeType("uint32_t") int value) { nuuidCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code uuidCountOutput} field. */
    public XrSpatialAnchorsQueryCompletionML uuidCountOutput(@NativeType("uint32_t") int value) { nuuidCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@code uuids} field. */
    public XrSpatialAnchorsQueryCompletionML uuids(@NativeType("XrUuidEXT *") XrUuidEXT.@Nullable Buffer value) { nuuids(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorsQueryCompletionML set(
        int type,
        long next,
        int futureResult,
        int uuidCapacityInput,
        int uuidCountOutput,
        XrUuidEXT.@Nullable Buffer uuids
    ) {
        type(type);
        next(next);
        futureResult(futureResult);
        uuidCapacityInput(uuidCapacityInput);
        uuidCountOutput(uuidCountOutput);
        uuids(uuids);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialAnchorsQueryCompletionML set(XrSpatialAnchorsQueryCompletionML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorsQueryCompletionML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsQueryCompletionML malloc() {
        return new XrSpatialAnchorsQueryCompletionML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsQueryCompletionML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsQueryCompletionML calloc() {
        return new XrSpatialAnchorsQueryCompletionML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsQueryCompletionML} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorsQueryCompletionML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorsQueryCompletionML(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorsQueryCompletionML} instance for the specified memory address. */
    public static XrSpatialAnchorsQueryCompletionML create(long address) {
        return new XrSpatialAnchorsQueryCompletionML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorsQueryCompletionML createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorsQueryCompletionML(address, null);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT} instance to {@code XrSpatialAnchorsQueryCompletionML}. */
    public static XrSpatialAnchorsQueryCompletionML create(XrFutureCompletionBaseHeaderEXT value) {
        return new XrSpatialAnchorsQueryCompletionML(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpatialAnchorsQueryCompletionML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryCompletionML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsQueryCompletionML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryCompletionML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsQueryCompletionML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryCompletionML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorsQueryCompletionML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryCompletionML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorsQueryCompletionML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT.Buffer} instance to {@code XrSpatialAnchorsQueryCompletionML.Buffer}. */
    public static XrSpatialAnchorsQueryCompletionML.Buffer create(XrFutureCompletionBaseHeaderEXT.Buffer value) {
        return new XrSpatialAnchorsQueryCompletionML.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpatialAnchorsQueryCompletionML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsQueryCompletionML malloc(MemoryStack stack) {
        return new XrSpatialAnchorsQueryCompletionML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorsQueryCompletionML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsQueryCompletionML calloc(MemoryStack stack) {
        return new XrSpatialAnchorsQueryCompletionML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsQueryCompletionML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryCompletionML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsQueryCompletionML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryCompletionML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialAnchorsQueryCompletionML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorsQueryCompletionML.NEXT); }
    /** Unsafe version of {@link #futureResult}. */
    public static int nfutureResult(long struct) { return memGetInt(struct + XrSpatialAnchorsQueryCompletionML.FUTURERESULT); }
    /** Unsafe version of {@link #uuidCapacityInput}. */
    public static int nuuidCapacityInput(long struct) { return memGetInt(struct + XrSpatialAnchorsQueryCompletionML.UUIDCAPACITYINPUT); }
    /** Unsafe version of {@link #uuidCountOutput}. */
    public static int nuuidCountOutput(long struct) { return memGetInt(struct + XrSpatialAnchorsQueryCompletionML.UUIDCOUNTOUTPUT); }
    /** Unsafe version of {@link #uuids}. */
    public static XrUuidEXT.@Nullable Buffer nuuids(long struct) { return XrUuidEXT.createSafe(memGetAddress(struct + XrSpatialAnchorsQueryCompletionML.UUIDS), nuuidCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialAnchorsQueryCompletionML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorsQueryCompletionML.NEXT, value); }
    /** Unsafe version of {@link #futureResult(int) futureResult}. */
    public static void nfutureResult(long struct, int value) { memPutInt(struct + XrSpatialAnchorsQueryCompletionML.FUTURERESULT, value); }
    /** Sets the specified value to the {@code uuidCapacityInput} field of the specified {@code struct}. */
    public static void nuuidCapacityInput(long struct, int value) { memPutInt(struct + XrSpatialAnchorsQueryCompletionML.UUIDCAPACITYINPUT, value); }
    /** Unsafe version of {@link #uuidCountOutput(int) uuidCountOutput}. */
    public static void nuuidCountOutput(long struct, int value) { memPutInt(struct + XrSpatialAnchorsQueryCompletionML.UUIDCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #uuids(XrUuidEXT.Buffer) uuids}. */
    public static void nuuids(long struct, XrUuidEXT.@Nullable Buffer value) { memPutAddress(struct + XrSpatialAnchorsQueryCompletionML.UUIDS, memAddressSafe(value)); if (value != null) { nuuidCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorsQueryCompletionML} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorsQueryCompletionML, Buffer> implements NativeResource {

        private static final XrSpatialAnchorsQueryCompletionML ELEMENT_FACTORY = XrSpatialAnchorsQueryCompletionML.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorsQueryCompletionML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorsQueryCompletionML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorsQueryCompletionML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorsQueryCompletionML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialAnchorsQueryCompletionML.nnext(address()); }
        /** @return the value of the {@code futureResult} field. */
        @NativeType("XrResult")
        public int futureResult() { return XrSpatialAnchorsQueryCompletionML.nfutureResult(address()); }
        /** @return the value of the {@code uuidCapacityInput} field. */
        @NativeType("uint32_t")
        public int uuidCapacityInput() { return XrSpatialAnchorsQueryCompletionML.nuuidCapacityInput(address()); }
        /** @return the value of the {@code uuidCountOutput} field. */
        @NativeType("uint32_t")
        public int uuidCountOutput() { return XrSpatialAnchorsQueryCompletionML.nuuidCountOutput(address()); }
        /** @return a {@link XrUuidEXT.Buffer} view of the struct array pointed to by the {@code uuids} field. */
        @NativeType("XrUuidEXT *")
        public XrUuidEXT.@Nullable Buffer uuids() { return XrSpatialAnchorsQueryCompletionML.nuuids(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialAnchorsQueryCompletionML.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorsQueryCompletionML.ntype(address(), value); return this; }
        /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_QUERY_COMPLETION_ML TYPE_SPATIAL_ANCHORS_QUERY_COMPLETION_ML} value to the {@code type} field. */
        public XrSpatialAnchorsQueryCompletionML.Buffer type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_QUERY_COMPLETION_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialAnchorsQueryCompletionML.Buffer next(@NativeType("void *") long value) { XrSpatialAnchorsQueryCompletionML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code futureResult} field. */
        public XrSpatialAnchorsQueryCompletionML.Buffer futureResult(@NativeType("XrResult") int value) { XrSpatialAnchorsQueryCompletionML.nfutureResult(address(), value); return this; }
        /** Sets the specified value to the {@code uuidCapacityInput} field. */
        public XrSpatialAnchorsQueryCompletionML.Buffer uuidCapacityInput(@NativeType("uint32_t") int value) { XrSpatialAnchorsQueryCompletionML.nuuidCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code uuidCountOutput} field. */
        public XrSpatialAnchorsQueryCompletionML.Buffer uuidCountOutput(@NativeType("uint32_t") int value) { XrSpatialAnchorsQueryCompletionML.nuuidCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@code uuids} field. */
        public XrSpatialAnchorsQueryCompletionML.Buffer uuids(@NativeType("XrUuidEXT *") XrUuidEXT.@Nullable Buffer value) { XrSpatialAnchorsQueryCompletionML.nuuids(address(), value); return this; }

    }

}
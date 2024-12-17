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

/**
 * <pre>{@code
 * struct XrSpatialAnchorsPublishCompletionML {
 *     XrStructureType type;
 *     void * next;
 *     XrResult futureResult;
 *     uint32_t uuidCount;
 *     {@link XrUuidEXT XrUuidEXT} * uuids;
 * }}</pre>
 */
public class XrSpatialAnchorsPublishCompletionML extends Struct<XrSpatialAnchorsPublishCompletionML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURERESULT,
        UUIDCOUNT,
        UUIDS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FUTURERESULT = layout.offsetof(2);
        UUIDCOUNT = layout.offsetof(3);
        UUIDS = layout.offsetof(4);
    }

    protected XrSpatialAnchorsPublishCompletionML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorsPublishCompletionML create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorsPublishCompletionML(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorsPublishCompletionML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorsPublishCompletionML(ByteBuffer container) {
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
    /** @return the value of the {@code uuidCount} field. */
    @NativeType("uint32_t")
    public int uuidCount() { return nuuidCount(address()); }
    /** @return a {@link XrUuidEXT.Buffer} view of the struct array pointed to by the {@code uuids} field. */
    @NativeType("XrUuidEXT *")
    public XrUuidEXT.Buffer uuids() { return nuuids(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialAnchorsPublishCompletionML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_ML TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_ML} value to the {@code type} field. */
    public XrSpatialAnchorsPublishCompletionML type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialAnchorsPublishCompletionML next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrSpatialAnchorsPublishCompletionDetailsML} value to the {@code next} chain. */
    public XrSpatialAnchorsPublishCompletionML next(XrSpatialAnchorsPublishCompletionDetailsML value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code futureResult} field. */
    public XrSpatialAnchorsPublishCompletionML futureResult(@NativeType("XrResult") int value) { nfutureResult(address(), value); return this; }
    /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@code uuids} field. */
    public XrSpatialAnchorsPublishCompletionML uuids(@NativeType("XrUuidEXT *") XrUuidEXT.Buffer value) { nuuids(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorsPublishCompletionML set(
        int type,
        long next,
        int futureResult,
        XrUuidEXT.Buffer uuids
    ) {
        type(type);
        next(next);
        futureResult(futureResult);
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
    public XrSpatialAnchorsPublishCompletionML set(XrSpatialAnchorsPublishCompletionML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorsPublishCompletionML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsPublishCompletionML malloc() {
        return new XrSpatialAnchorsPublishCompletionML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsPublishCompletionML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsPublishCompletionML calloc() {
        return new XrSpatialAnchorsPublishCompletionML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsPublishCompletionML} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorsPublishCompletionML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorsPublishCompletionML(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorsPublishCompletionML} instance for the specified memory address. */
    public static XrSpatialAnchorsPublishCompletionML create(long address) {
        return new XrSpatialAnchorsPublishCompletionML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorsPublishCompletionML createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorsPublishCompletionML(address, null);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT} instance to {@code XrSpatialAnchorsPublishCompletionML}. */
    public static XrSpatialAnchorsPublishCompletionML create(XrFutureCompletionBaseHeaderEXT value) {
        return new XrSpatialAnchorsPublishCompletionML(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpatialAnchorsPublishCompletionML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsPublishCompletionML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsPublishCompletionML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsPublishCompletionML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsPublishCompletionML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsPublishCompletionML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorsPublishCompletionML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsPublishCompletionML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorsPublishCompletionML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT.Buffer} instance to {@code XrSpatialAnchorsPublishCompletionML.Buffer}. */
    public static XrSpatialAnchorsPublishCompletionML.Buffer create(XrFutureCompletionBaseHeaderEXT.Buffer value) {
        return new XrSpatialAnchorsPublishCompletionML.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpatialAnchorsPublishCompletionML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsPublishCompletionML malloc(MemoryStack stack) {
        return new XrSpatialAnchorsPublishCompletionML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorsPublishCompletionML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsPublishCompletionML calloc(MemoryStack stack) {
        return new XrSpatialAnchorsPublishCompletionML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsPublishCompletionML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsPublishCompletionML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsPublishCompletionML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsPublishCompletionML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialAnchorsPublishCompletionML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorsPublishCompletionML.NEXT); }
    /** Unsafe version of {@link #futureResult}. */
    public static int nfutureResult(long struct) { return memGetInt(struct + XrSpatialAnchorsPublishCompletionML.FUTURERESULT); }
    /** Unsafe version of {@link #uuidCount}. */
    public static int nuuidCount(long struct) { return memGetInt(struct + XrSpatialAnchorsPublishCompletionML.UUIDCOUNT); }
    /** Unsafe version of {@link #uuids}. */
    public static XrUuidEXT.Buffer nuuids(long struct) { return XrUuidEXT.create(memGetAddress(struct + XrSpatialAnchorsPublishCompletionML.UUIDS), nuuidCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialAnchorsPublishCompletionML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorsPublishCompletionML.NEXT, value); }
    /** Unsafe version of {@link #futureResult(int) futureResult}. */
    public static void nfutureResult(long struct, int value) { memPutInt(struct + XrSpatialAnchorsPublishCompletionML.FUTURERESULT, value); }
    /** Sets the specified value to the {@code uuidCount} field of the specified {@code struct}. */
    public static void nuuidCount(long struct, int value) { memPutInt(struct + XrSpatialAnchorsPublishCompletionML.UUIDCOUNT, value); }
    /** Unsafe version of {@link #uuids(XrUuidEXT.Buffer) uuids}. */
    public static void nuuids(long struct, XrUuidEXT.Buffer value) { memPutAddress(struct + XrSpatialAnchorsPublishCompletionML.UUIDS, value.address()); nuuidCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialAnchorsPublishCompletionML.UUIDS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorsPublishCompletionML} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorsPublishCompletionML, Buffer> implements NativeResource {

        private static final XrSpatialAnchorsPublishCompletionML ELEMENT_FACTORY = XrSpatialAnchorsPublishCompletionML.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorsPublishCompletionML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorsPublishCompletionML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorsPublishCompletionML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorsPublishCompletionML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialAnchorsPublishCompletionML.nnext(address()); }
        /** @return the value of the {@code futureResult} field. */
        @NativeType("XrResult")
        public int futureResult() { return XrSpatialAnchorsPublishCompletionML.nfutureResult(address()); }
        /** @return the value of the {@code uuidCount} field. */
        @NativeType("uint32_t")
        public int uuidCount() { return XrSpatialAnchorsPublishCompletionML.nuuidCount(address()); }
        /** @return a {@link XrUuidEXT.Buffer} view of the struct array pointed to by the {@code uuids} field. */
        @NativeType("XrUuidEXT *")
        public XrUuidEXT.Buffer uuids() { return XrSpatialAnchorsPublishCompletionML.nuuids(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialAnchorsPublishCompletionML.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorsPublishCompletionML.ntype(address(), value); return this; }
        /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_ML TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_ML} value to the {@code type} field. */
        public XrSpatialAnchorsPublishCompletionML.Buffer type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_PUBLISH_COMPLETION_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialAnchorsPublishCompletionML.Buffer next(@NativeType("void *") long value) { XrSpatialAnchorsPublishCompletionML.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrSpatialAnchorsPublishCompletionDetailsML} value to the {@code next} chain. */
        public XrSpatialAnchorsPublishCompletionML.Buffer next(XrSpatialAnchorsPublishCompletionDetailsML value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code futureResult} field. */
        public XrSpatialAnchorsPublishCompletionML.Buffer futureResult(@NativeType("XrResult") int value) { XrSpatialAnchorsPublishCompletionML.nfutureResult(address(), value); return this; }
        /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@code uuids} field. */
        public XrSpatialAnchorsPublishCompletionML.Buffer uuids(@NativeType("XrUuidEXT *") XrUuidEXT.Buffer value) { XrSpatialAnchorsPublishCompletionML.nuuids(address(), value); return this; }

    }

}
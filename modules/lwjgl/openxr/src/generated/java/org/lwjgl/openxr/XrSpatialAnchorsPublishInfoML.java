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
 * struct XrSpatialAnchorsPublishInfoML {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t anchorCount;
 *     XrSpace const * anchors;
 *     uint64_t expiration;
 * }}</pre>
 */
public class XrSpatialAnchorsPublishInfoML extends Struct<XrSpatialAnchorsPublishInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ANCHORCOUNT,
        ANCHORS,
        EXPIRATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ANCHORCOUNT = layout.offsetof(2);
        ANCHORS = layout.offsetof(3);
        EXPIRATION = layout.offsetof(4);
    }

    protected XrSpatialAnchorsPublishInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorsPublishInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorsPublishInfoML(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorsPublishInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorsPublishInfoML(ByteBuffer container) {
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
    /** @return the value of the {@code anchorCount} field. */
    @NativeType("uint32_t")
    public int anchorCount() { return nanchorCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code anchors} field. */
    @NativeType("XrSpace const *")
    public PointerBuffer anchors() { return nanchors(address()); }
    /** @return the value of the {@code expiration} field. */
    @NativeType("uint64_t")
    public long expiration() { return nexpiration(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialAnchorsPublishInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_PUBLISH_INFO_ML TYPE_SPATIAL_ANCHORS_PUBLISH_INFO_ML} value to the {@code type} field. */
    public XrSpatialAnchorsPublishInfoML type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_PUBLISH_INFO_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialAnchorsPublishInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code anchors} field. */
    public XrSpatialAnchorsPublishInfoML anchors(@NativeType("XrSpace const *") PointerBuffer value) { nanchors(address(), value); return this; }
    /** Sets the specified value to the {@code expiration} field. */
    public XrSpatialAnchorsPublishInfoML expiration(@NativeType("uint64_t") long value) { nexpiration(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorsPublishInfoML set(
        int type,
        long next,
        PointerBuffer anchors,
        long expiration
    ) {
        type(type);
        next(next);
        anchors(anchors);
        expiration(expiration);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialAnchorsPublishInfoML set(XrSpatialAnchorsPublishInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorsPublishInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsPublishInfoML malloc() {
        return new XrSpatialAnchorsPublishInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsPublishInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsPublishInfoML calloc() {
        return new XrSpatialAnchorsPublishInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsPublishInfoML} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorsPublishInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorsPublishInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorsPublishInfoML} instance for the specified memory address. */
    public static XrSpatialAnchorsPublishInfoML create(long address) {
        return new XrSpatialAnchorsPublishInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorsPublishInfoML createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorsPublishInfoML(address, null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsPublishInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsPublishInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsPublishInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsPublishInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsPublishInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsPublishInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorsPublishInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsPublishInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorsPublishInfoML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialAnchorsPublishInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsPublishInfoML malloc(MemoryStack stack) {
        return new XrSpatialAnchorsPublishInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorsPublishInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsPublishInfoML calloc(MemoryStack stack) {
        return new XrSpatialAnchorsPublishInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsPublishInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsPublishInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsPublishInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsPublishInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialAnchorsPublishInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorsPublishInfoML.NEXT); }
    /** Unsafe version of {@link #anchorCount}. */
    public static int nanchorCount(long struct) { return memGetInt(struct + XrSpatialAnchorsPublishInfoML.ANCHORCOUNT); }
    /** Unsafe version of {@link #anchors() anchors}. */
    public static PointerBuffer nanchors(long struct) { return memPointerBuffer(memGetAddress(struct + XrSpatialAnchorsPublishInfoML.ANCHORS), nanchorCount(struct)); }
    /** Unsafe version of {@link #expiration}. */
    public static long nexpiration(long struct) { return memGetLong(struct + XrSpatialAnchorsPublishInfoML.EXPIRATION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialAnchorsPublishInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorsPublishInfoML.NEXT, value); }
    /** Sets the specified value to the {@code anchorCount} field of the specified {@code struct}. */
    public static void nanchorCount(long struct, int value) { memPutInt(struct + XrSpatialAnchorsPublishInfoML.ANCHORCOUNT, value); }
    /** Unsafe version of {@link #anchors(PointerBuffer) anchors}. */
    public static void nanchors(long struct, PointerBuffer value) { memPutAddress(struct + XrSpatialAnchorsPublishInfoML.ANCHORS, memAddress(value)); nanchorCount(struct, value.remaining()); }
    /** Unsafe version of {@link #expiration(long) expiration}. */
    public static void nexpiration(long struct, long value) { memPutLong(struct + XrSpatialAnchorsPublishInfoML.EXPIRATION, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialAnchorsPublishInfoML.ANCHORS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorsPublishInfoML} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorsPublishInfoML, Buffer> implements NativeResource {

        private static final XrSpatialAnchorsPublishInfoML ELEMENT_FACTORY = XrSpatialAnchorsPublishInfoML.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorsPublishInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorsPublishInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorsPublishInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorsPublishInfoML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialAnchorsPublishInfoML.nnext(address()); }
        /** @return the value of the {@code anchorCount} field. */
        @NativeType("uint32_t")
        public int anchorCount() { return XrSpatialAnchorsPublishInfoML.nanchorCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code anchors} field. */
        @NativeType("XrSpace const *")
        public PointerBuffer anchors() { return XrSpatialAnchorsPublishInfoML.nanchors(address()); }
        /** @return the value of the {@code expiration} field. */
        @NativeType("uint64_t")
        public long expiration() { return XrSpatialAnchorsPublishInfoML.nexpiration(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialAnchorsPublishInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorsPublishInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_PUBLISH_INFO_ML TYPE_SPATIAL_ANCHORS_PUBLISH_INFO_ML} value to the {@code type} field. */
        public XrSpatialAnchorsPublishInfoML.Buffer type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_PUBLISH_INFO_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialAnchorsPublishInfoML.Buffer next(@NativeType("void const *") long value) { XrSpatialAnchorsPublishInfoML.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code anchors} field. */
        public XrSpatialAnchorsPublishInfoML.Buffer anchors(@NativeType("XrSpace const *") PointerBuffer value) { XrSpatialAnchorsPublishInfoML.nanchors(address(), value); return this; }
        /** Sets the specified value to the {@code expiration} field. */
        public XrSpatialAnchorsPublishInfoML.Buffer expiration(@NativeType("uint64_t") long value) { XrSpatialAnchorsPublishInfoML.nexpiration(address(), value); return this; }

    }

}
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
 * struct XrSpatialAnchorsUpdateExpirationInfoML {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t uuidCount;
 *     {@link XrUuidEXT XrUuidEXT} const * uuids;
 *     uint64_t expiration;
 * }}</pre>
 */
public class XrSpatialAnchorsUpdateExpirationInfoML extends Struct<XrSpatialAnchorsUpdateExpirationInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        UUIDCOUNT,
        UUIDS,
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
        UUIDCOUNT = layout.offsetof(2);
        UUIDS = layout.offsetof(3);
        EXPIRATION = layout.offsetof(4);
    }

    protected XrSpatialAnchorsUpdateExpirationInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorsUpdateExpirationInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorsUpdateExpirationInfoML(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorsUpdateExpirationInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorsUpdateExpirationInfoML(ByteBuffer container) {
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
    /** @return the value of the {@code uuidCount} field. */
    @NativeType("uint32_t")
    public int uuidCount() { return nuuidCount(address()); }
    /** @return a {@link XrUuidEXT.Buffer} view of the struct array pointed to by the {@code uuids} field. */
    @NativeType("XrUuidEXT const *")
    public XrUuidEXT.Buffer uuids() { return nuuids(address()); }
    /** @return the value of the {@code expiration} field. */
    @NativeType("uint64_t")
    public long expiration() { return nexpiration(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialAnchorsUpdateExpirationInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_INFO_ML TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_INFO_ML} value to the {@code type} field. */
    public XrSpatialAnchorsUpdateExpirationInfoML type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_INFO_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialAnchorsUpdateExpirationInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@code uuids} field. */
    public XrSpatialAnchorsUpdateExpirationInfoML uuids(@NativeType("XrUuidEXT const *") XrUuidEXT.Buffer value) { nuuids(address(), value); return this; }
    /** Sets the specified value to the {@code expiration} field. */
    public XrSpatialAnchorsUpdateExpirationInfoML expiration(@NativeType("uint64_t") long value) { nexpiration(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorsUpdateExpirationInfoML set(
        int type,
        long next,
        XrUuidEXT.Buffer uuids,
        long expiration
    ) {
        type(type);
        next(next);
        uuids(uuids);
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
    public XrSpatialAnchorsUpdateExpirationInfoML set(XrSpatialAnchorsUpdateExpirationInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorsUpdateExpirationInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsUpdateExpirationInfoML malloc() {
        return new XrSpatialAnchorsUpdateExpirationInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsUpdateExpirationInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsUpdateExpirationInfoML calloc() {
        return new XrSpatialAnchorsUpdateExpirationInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsUpdateExpirationInfoML} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorsUpdateExpirationInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorsUpdateExpirationInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorsUpdateExpirationInfoML} instance for the specified memory address. */
    public static XrSpatialAnchorsUpdateExpirationInfoML create(long address) {
        return new XrSpatialAnchorsUpdateExpirationInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorsUpdateExpirationInfoML createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorsUpdateExpirationInfoML(address, null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsUpdateExpirationInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsUpdateExpirationInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsUpdateExpirationInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorsUpdateExpirationInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorsUpdateExpirationInfoML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialAnchorsUpdateExpirationInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsUpdateExpirationInfoML malloc(MemoryStack stack) {
        return new XrSpatialAnchorsUpdateExpirationInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorsUpdateExpirationInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsUpdateExpirationInfoML calloc(MemoryStack stack) {
        return new XrSpatialAnchorsUpdateExpirationInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsUpdateExpirationInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsUpdateExpirationInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsUpdateExpirationInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialAnchorsUpdateExpirationInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorsUpdateExpirationInfoML.NEXT); }
    /** Unsafe version of {@link #uuidCount}. */
    public static int nuuidCount(long struct) { return memGetInt(struct + XrSpatialAnchorsUpdateExpirationInfoML.UUIDCOUNT); }
    /** Unsafe version of {@link #uuids}. */
    public static XrUuidEXT.Buffer nuuids(long struct) { return XrUuidEXT.create(memGetAddress(struct + XrSpatialAnchorsUpdateExpirationInfoML.UUIDS), nuuidCount(struct)); }
    /** Unsafe version of {@link #expiration}. */
    public static long nexpiration(long struct) { return memGetLong(struct + XrSpatialAnchorsUpdateExpirationInfoML.EXPIRATION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialAnchorsUpdateExpirationInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorsUpdateExpirationInfoML.NEXT, value); }
    /** Sets the specified value to the {@code uuidCount} field of the specified {@code struct}. */
    public static void nuuidCount(long struct, int value) { memPutInt(struct + XrSpatialAnchorsUpdateExpirationInfoML.UUIDCOUNT, value); }
    /** Unsafe version of {@link #uuids(XrUuidEXT.Buffer) uuids}. */
    public static void nuuids(long struct, XrUuidEXT.Buffer value) { memPutAddress(struct + XrSpatialAnchorsUpdateExpirationInfoML.UUIDS, value.address()); nuuidCount(struct, value.remaining()); }
    /** Unsafe version of {@link #expiration(long) expiration}. */
    public static void nexpiration(long struct, long value) { memPutLong(struct + XrSpatialAnchorsUpdateExpirationInfoML.EXPIRATION, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialAnchorsUpdateExpirationInfoML.UUIDS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorsUpdateExpirationInfoML} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorsUpdateExpirationInfoML, Buffer> implements NativeResource {

        private static final XrSpatialAnchorsUpdateExpirationInfoML ELEMENT_FACTORY = XrSpatialAnchorsUpdateExpirationInfoML.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorsUpdateExpirationInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorsUpdateExpirationInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorsUpdateExpirationInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorsUpdateExpirationInfoML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialAnchorsUpdateExpirationInfoML.nnext(address()); }
        /** @return the value of the {@code uuidCount} field. */
        @NativeType("uint32_t")
        public int uuidCount() { return XrSpatialAnchorsUpdateExpirationInfoML.nuuidCount(address()); }
        /** @return a {@link XrUuidEXT.Buffer} view of the struct array pointed to by the {@code uuids} field. */
        @NativeType("XrUuidEXT const *")
        public XrUuidEXT.Buffer uuids() { return XrSpatialAnchorsUpdateExpirationInfoML.nuuids(address()); }
        /** @return the value of the {@code expiration} field. */
        @NativeType("uint64_t")
        public long expiration() { return XrSpatialAnchorsUpdateExpirationInfoML.nexpiration(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialAnchorsUpdateExpirationInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorsUpdateExpirationInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_INFO_ML TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_INFO_ML} value to the {@code type} field. */
        public XrSpatialAnchorsUpdateExpirationInfoML.Buffer type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_UPDATE_EXPIRATION_INFO_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialAnchorsUpdateExpirationInfoML.Buffer next(@NativeType("void const *") long value) { XrSpatialAnchorsUpdateExpirationInfoML.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@code uuids} field. */
        public XrSpatialAnchorsUpdateExpirationInfoML.Buffer uuids(@NativeType("XrUuidEXT const *") XrUuidEXT.Buffer value) { XrSpatialAnchorsUpdateExpirationInfoML.nuuids(address(), value); return this; }
        /** Sets the specified value to the {@code expiration} field. */
        public XrSpatialAnchorsUpdateExpirationInfoML.Buffer expiration(@NativeType("uint64_t") long value) { XrSpatialAnchorsUpdateExpirationInfoML.nexpiration(address(), value); return this; }

    }

}
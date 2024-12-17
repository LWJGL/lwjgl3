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
 * struct XrSpatialAnchorsCreateInfoFromUuidsML {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpatialAnchorsStorageML storage;
 *     uint32_t uuidCount;
 *     {@link XrUuidEXT XrUuidEXT} const * uuids;
 * }}</pre>
 */
public class XrSpatialAnchorsCreateInfoFromUuidsML extends Struct<XrSpatialAnchorsCreateInfoFromUuidsML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        STORAGE,
        UUIDCOUNT,
        UUIDS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        STORAGE = layout.offsetof(2);
        UUIDCOUNT = layout.offsetof(3);
        UUIDS = layout.offsetof(4);
    }

    protected XrSpatialAnchorsCreateInfoFromUuidsML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorsCreateInfoFromUuidsML create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorsCreateInfoFromUuidsML(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorsCreateInfoFromUuidsML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorsCreateInfoFromUuidsML(ByteBuffer container) {
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
    /** @return the value of the {@code storage} field. */
    @NativeType("XrSpatialAnchorsStorageML")
    public long storage() { return nstorage(address()); }
    /** @return the value of the {@code uuidCount} field. */
    @NativeType("uint32_t")
    public int uuidCount() { return nuuidCount(address()); }
    /** @return a {@link XrUuidEXT.Buffer} view of the struct array pointed to by the {@code uuids} field. */
    @NativeType("XrUuidEXT const *")
    public XrUuidEXT.Buffer uuids() { return nuuids(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialAnchorsCreateInfoFromUuidsML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_UUIDS_ML TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_UUIDS_ML} value to the {@code type} field. */
    public XrSpatialAnchorsCreateInfoFromUuidsML type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_UUIDS_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialAnchorsCreateInfoFromUuidsML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code storage} field. */
    public XrSpatialAnchorsCreateInfoFromUuidsML storage(XrSpatialAnchorsStorageML value) { nstorage(address(), value); return this; }
    /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@code uuids} field. */
    public XrSpatialAnchorsCreateInfoFromUuidsML uuids(@NativeType("XrUuidEXT const *") XrUuidEXT.Buffer value) { nuuids(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorsCreateInfoFromUuidsML set(
        int type,
        long next,
        XrSpatialAnchorsStorageML storage,
        XrUuidEXT.Buffer uuids
    ) {
        type(type);
        next(next);
        storage(storage);
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
    public XrSpatialAnchorsCreateInfoFromUuidsML set(XrSpatialAnchorsCreateInfoFromUuidsML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorsCreateInfoFromUuidsML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsCreateInfoFromUuidsML malloc() {
        return new XrSpatialAnchorsCreateInfoFromUuidsML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsCreateInfoFromUuidsML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsCreateInfoFromUuidsML calloc() {
        return new XrSpatialAnchorsCreateInfoFromUuidsML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsCreateInfoFromUuidsML} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorsCreateInfoFromUuidsML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorsCreateInfoFromUuidsML(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorsCreateInfoFromUuidsML} instance for the specified memory address. */
    public static XrSpatialAnchorsCreateInfoFromUuidsML create(long address) {
        return new XrSpatialAnchorsCreateInfoFromUuidsML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorsCreateInfoFromUuidsML createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorsCreateInfoFromUuidsML(address, null);
    }

    /** Downcasts the specified {@code XrSpatialAnchorsCreateInfoBaseHeaderML} instance to {@code XrSpatialAnchorsCreateInfoFromUuidsML}. */
    public static XrSpatialAnchorsCreateInfoFromUuidsML create(XrSpatialAnchorsCreateInfoBaseHeaderML value) {
        return new XrSpatialAnchorsCreateInfoFromUuidsML(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpatialAnchorsCreateInfoFromUuidsML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsCreateInfoFromUuidsML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsCreateInfoFromUuidsML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsCreateInfoFromUuidsML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsCreateInfoFromUuidsML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsCreateInfoFromUuidsML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorsCreateInfoFromUuidsML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsCreateInfoFromUuidsML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorsCreateInfoFromUuidsML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrSpatialAnchorsCreateInfoBaseHeaderML.Buffer} instance to {@code XrSpatialAnchorsCreateInfoFromUuidsML.Buffer}. */
    public static XrSpatialAnchorsCreateInfoFromUuidsML.Buffer create(XrSpatialAnchorsCreateInfoBaseHeaderML.Buffer value) {
        return new XrSpatialAnchorsCreateInfoFromUuidsML.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpatialAnchorsCreateInfoFromUuidsML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsCreateInfoFromUuidsML malloc(MemoryStack stack) {
        return new XrSpatialAnchorsCreateInfoFromUuidsML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorsCreateInfoFromUuidsML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsCreateInfoFromUuidsML calloc(MemoryStack stack) {
        return new XrSpatialAnchorsCreateInfoFromUuidsML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsCreateInfoFromUuidsML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsCreateInfoFromUuidsML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsCreateInfoFromUuidsML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsCreateInfoFromUuidsML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialAnchorsCreateInfoFromUuidsML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorsCreateInfoFromUuidsML.NEXT); }
    /** Unsafe version of {@link #storage}. */
    public static long nstorage(long struct) { return memGetAddress(struct + XrSpatialAnchorsCreateInfoFromUuidsML.STORAGE); }
    /** Unsafe version of {@link #uuidCount}. */
    public static int nuuidCount(long struct) { return memGetInt(struct + XrSpatialAnchorsCreateInfoFromUuidsML.UUIDCOUNT); }
    /** Unsafe version of {@link #uuids}. */
    public static XrUuidEXT.Buffer nuuids(long struct) { return XrUuidEXT.create(memGetAddress(struct + XrSpatialAnchorsCreateInfoFromUuidsML.UUIDS), nuuidCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialAnchorsCreateInfoFromUuidsML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorsCreateInfoFromUuidsML.NEXT, value); }
    /** Unsafe version of {@link #storage(XrSpatialAnchorsStorageML) storage}. */
    public static void nstorage(long struct, XrSpatialAnchorsStorageML value) { memPutAddress(struct + XrSpatialAnchorsCreateInfoFromUuidsML.STORAGE, value.address()); }
    /** Sets the specified value to the {@code uuidCount} field of the specified {@code struct}. */
    public static void nuuidCount(long struct, int value) { memPutInt(struct + XrSpatialAnchorsCreateInfoFromUuidsML.UUIDCOUNT, value); }
    /** Unsafe version of {@link #uuids(XrUuidEXT.Buffer) uuids}. */
    public static void nuuids(long struct, XrUuidEXT.Buffer value) { memPutAddress(struct + XrSpatialAnchorsCreateInfoFromUuidsML.UUIDS, value.address()); nuuidCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialAnchorsCreateInfoFromUuidsML.STORAGE));
        check(memGetAddress(struct + XrSpatialAnchorsCreateInfoFromUuidsML.UUIDS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorsCreateInfoFromUuidsML} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorsCreateInfoFromUuidsML, Buffer> implements NativeResource {

        private static final XrSpatialAnchorsCreateInfoFromUuidsML ELEMENT_FACTORY = XrSpatialAnchorsCreateInfoFromUuidsML.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorsCreateInfoFromUuidsML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorsCreateInfoFromUuidsML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorsCreateInfoFromUuidsML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorsCreateInfoFromUuidsML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialAnchorsCreateInfoFromUuidsML.nnext(address()); }
        /** @return the value of the {@code storage} field. */
        @NativeType("XrSpatialAnchorsStorageML")
        public long storage() { return XrSpatialAnchorsCreateInfoFromUuidsML.nstorage(address()); }
        /** @return the value of the {@code uuidCount} field. */
        @NativeType("uint32_t")
        public int uuidCount() { return XrSpatialAnchorsCreateInfoFromUuidsML.nuuidCount(address()); }
        /** @return a {@link XrUuidEXT.Buffer} view of the struct array pointed to by the {@code uuids} field. */
        @NativeType("XrUuidEXT const *")
        public XrUuidEXT.Buffer uuids() { return XrSpatialAnchorsCreateInfoFromUuidsML.nuuids(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialAnchorsCreateInfoFromUuidsML.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorsCreateInfoFromUuidsML.ntype(address(), value); return this; }
        /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_UUIDS_ML TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_UUIDS_ML} value to the {@code type} field. */
        public XrSpatialAnchorsCreateInfoFromUuidsML.Buffer type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_CREATE_INFO_FROM_UUIDS_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialAnchorsCreateInfoFromUuidsML.Buffer next(@NativeType("void const *") long value) { XrSpatialAnchorsCreateInfoFromUuidsML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code storage} field. */
        public XrSpatialAnchorsCreateInfoFromUuidsML.Buffer storage(XrSpatialAnchorsStorageML value) { XrSpatialAnchorsCreateInfoFromUuidsML.nstorage(address(), value); return this; }
        /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@code uuids} field. */
        public XrSpatialAnchorsCreateInfoFromUuidsML.Buffer uuids(@NativeType("XrUuidEXT const *") XrUuidEXT.Buffer value) { XrSpatialAnchorsCreateInfoFromUuidsML.nuuids(address(), value); return this; }

    }

}
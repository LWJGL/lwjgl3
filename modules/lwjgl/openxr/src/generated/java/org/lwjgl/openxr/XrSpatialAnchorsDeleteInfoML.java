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
 * struct XrSpatialAnchorsDeleteInfoML {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t uuidCount;
 *     {@link XrUuidEXT XrUuidEXT} const * uuids;
 * }}</pre>
 */
public class XrSpatialAnchorsDeleteInfoML extends Struct<XrSpatialAnchorsDeleteInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        UUIDCOUNT,
        UUIDS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        UUIDCOUNT = layout.offsetof(2);
        UUIDS = layout.offsetof(3);
    }

    protected XrSpatialAnchorsDeleteInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorsDeleteInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorsDeleteInfoML(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorsDeleteInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorsDeleteInfoML(ByteBuffer container) {
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

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialAnchorsDeleteInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_DELETE_INFO_ML TYPE_SPATIAL_ANCHORS_DELETE_INFO_ML} value to the {@code type} field. */
    public XrSpatialAnchorsDeleteInfoML type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_DELETE_INFO_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialAnchorsDeleteInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@code uuids} field. */
    public XrSpatialAnchorsDeleteInfoML uuids(@NativeType("XrUuidEXT const *") XrUuidEXT.Buffer value) { nuuids(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorsDeleteInfoML set(
        int type,
        long next,
        XrUuidEXT.Buffer uuids
    ) {
        type(type);
        next(next);
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
    public XrSpatialAnchorsDeleteInfoML set(XrSpatialAnchorsDeleteInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorsDeleteInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsDeleteInfoML malloc() {
        return new XrSpatialAnchorsDeleteInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsDeleteInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsDeleteInfoML calloc() {
        return new XrSpatialAnchorsDeleteInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsDeleteInfoML} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorsDeleteInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorsDeleteInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorsDeleteInfoML} instance for the specified memory address. */
    public static XrSpatialAnchorsDeleteInfoML create(long address) {
        return new XrSpatialAnchorsDeleteInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorsDeleteInfoML createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorsDeleteInfoML(address, null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsDeleteInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsDeleteInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsDeleteInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsDeleteInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsDeleteInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsDeleteInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorsDeleteInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsDeleteInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorsDeleteInfoML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialAnchorsDeleteInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsDeleteInfoML malloc(MemoryStack stack) {
        return new XrSpatialAnchorsDeleteInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorsDeleteInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsDeleteInfoML calloc(MemoryStack stack) {
        return new XrSpatialAnchorsDeleteInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsDeleteInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsDeleteInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsDeleteInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsDeleteInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialAnchorsDeleteInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorsDeleteInfoML.NEXT); }
    /** Unsafe version of {@link #uuidCount}. */
    public static int nuuidCount(long struct) { return memGetInt(struct + XrSpatialAnchorsDeleteInfoML.UUIDCOUNT); }
    /** Unsafe version of {@link #uuids}. */
    public static XrUuidEXT.Buffer nuuids(long struct) { return XrUuidEXT.create(memGetAddress(struct + XrSpatialAnchorsDeleteInfoML.UUIDS), nuuidCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialAnchorsDeleteInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorsDeleteInfoML.NEXT, value); }
    /** Sets the specified value to the {@code uuidCount} field of the specified {@code struct}. */
    public static void nuuidCount(long struct, int value) { memPutInt(struct + XrSpatialAnchorsDeleteInfoML.UUIDCOUNT, value); }
    /** Unsafe version of {@link #uuids(XrUuidEXT.Buffer) uuids}. */
    public static void nuuids(long struct, XrUuidEXT.Buffer value) { memPutAddress(struct + XrSpatialAnchorsDeleteInfoML.UUIDS, value.address()); nuuidCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialAnchorsDeleteInfoML.UUIDS));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorsDeleteInfoML} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorsDeleteInfoML, Buffer> implements NativeResource {

        private static final XrSpatialAnchorsDeleteInfoML ELEMENT_FACTORY = XrSpatialAnchorsDeleteInfoML.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorsDeleteInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorsDeleteInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorsDeleteInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorsDeleteInfoML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialAnchorsDeleteInfoML.nnext(address()); }
        /** @return the value of the {@code uuidCount} field. */
        @NativeType("uint32_t")
        public int uuidCount() { return XrSpatialAnchorsDeleteInfoML.nuuidCount(address()); }
        /** @return a {@link XrUuidEXT.Buffer} view of the struct array pointed to by the {@code uuids} field. */
        @NativeType("XrUuidEXT const *")
        public XrUuidEXT.Buffer uuids() { return XrSpatialAnchorsDeleteInfoML.nuuids(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialAnchorsDeleteInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorsDeleteInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_DELETE_INFO_ML TYPE_SPATIAL_ANCHORS_DELETE_INFO_ML} value to the {@code type} field. */
        public XrSpatialAnchorsDeleteInfoML.Buffer type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_DELETE_INFO_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialAnchorsDeleteInfoML.Buffer next(@NativeType("void const *") long value) { XrSpatialAnchorsDeleteInfoML.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@code uuids} field. */
        public XrSpatialAnchorsDeleteInfoML.Buffer uuids(@NativeType("XrUuidEXT const *") XrUuidEXT.Buffer value) { XrSpatialAnchorsDeleteInfoML.nuuids(address(), value); return this; }

    }

}
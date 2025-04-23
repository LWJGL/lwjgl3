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
 * struct XrSenseDataFilterUuidBD {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t uuidCount;
 *     {@link XrUuidEXT XrUuidEXT} const * uuids;
 * }}</pre>
 */
public class XrSenseDataFilterUuidBD extends Struct<XrSenseDataFilterUuidBD> implements NativeResource {

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

    protected XrSenseDataFilterUuidBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSenseDataFilterUuidBD create(long address, @Nullable ByteBuffer container) {
        return new XrSenseDataFilterUuidBD(address, container);
    }

    /**
     * Creates a {@code XrSenseDataFilterUuidBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSenseDataFilterUuidBD(ByteBuffer container) {
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
    public XrSenseDataFilterUuidBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialSensing#XR_TYPE_SENSE_DATA_FILTER_UUID_BD TYPE_SENSE_DATA_FILTER_UUID_BD} value to the {@code type} field. */
    public XrSenseDataFilterUuidBD type$Default() { return type(BDSpatialSensing.XR_TYPE_SENSE_DATA_FILTER_UUID_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSenseDataFilterUuidBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@code uuids} field. */
    public XrSenseDataFilterUuidBD uuids(@NativeType("XrUuidEXT const *") XrUuidEXT.Buffer value) { nuuids(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSenseDataFilterUuidBD set(
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
    public XrSenseDataFilterUuidBD set(XrSenseDataFilterUuidBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSenseDataFilterUuidBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSenseDataFilterUuidBD malloc() {
        return new XrSenseDataFilterUuidBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSenseDataFilterUuidBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSenseDataFilterUuidBD calloc() {
        return new XrSenseDataFilterUuidBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSenseDataFilterUuidBD} instance allocated with {@link BufferUtils}. */
    public static XrSenseDataFilterUuidBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSenseDataFilterUuidBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSenseDataFilterUuidBD} instance for the specified memory address. */
    public static XrSenseDataFilterUuidBD create(long address) {
        return new XrSenseDataFilterUuidBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSenseDataFilterUuidBD createSafe(long address) {
        return address == NULL ? null : new XrSenseDataFilterUuidBD(address, null);
    }

    /**
     * Returns a new {@link XrSenseDataFilterUuidBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterUuidBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataFilterUuidBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterUuidBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataFilterUuidBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterUuidBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSenseDataFilterUuidBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterUuidBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSenseDataFilterUuidBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSenseDataFilterUuidBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSenseDataFilterUuidBD malloc(MemoryStack stack) {
        return new XrSenseDataFilterUuidBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSenseDataFilterUuidBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSenseDataFilterUuidBD calloc(MemoryStack stack) {
        return new XrSenseDataFilterUuidBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSenseDataFilterUuidBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterUuidBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataFilterUuidBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSenseDataFilterUuidBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSenseDataFilterUuidBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSenseDataFilterUuidBD.NEXT); }
    /** Unsafe version of {@link #uuidCount}. */
    public static int nuuidCount(long struct) { return memGetInt(struct + XrSenseDataFilterUuidBD.UUIDCOUNT); }
    /** Unsafe version of {@link #uuids}. */
    public static XrUuidEXT.Buffer nuuids(long struct) { return XrUuidEXT.create(memGetAddress(struct + XrSenseDataFilterUuidBD.UUIDS), nuuidCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSenseDataFilterUuidBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSenseDataFilterUuidBD.NEXT, value); }
    /** Sets the specified value to the {@code uuidCount} field of the specified {@code struct}. */
    public static void nuuidCount(long struct, int value) { memPutInt(struct + XrSenseDataFilterUuidBD.UUIDCOUNT, value); }
    /** Unsafe version of {@link #uuids(XrUuidEXT.Buffer) uuids}. */
    public static void nuuids(long struct, XrUuidEXT.Buffer value) { memPutAddress(struct + XrSenseDataFilterUuidBD.UUIDS, value.address()); nuuidCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSenseDataFilterUuidBD.UUIDS));
    }

    // -----------------------------------

    /** An array of {@link XrSenseDataFilterUuidBD} structs. */
    public static class Buffer extends StructBuffer<XrSenseDataFilterUuidBD, Buffer> implements NativeResource {

        private static final XrSenseDataFilterUuidBD ELEMENT_FACTORY = XrSenseDataFilterUuidBD.create(-1L);

        /**
         * Creates a new {@code XrSenseDataFilterUuidBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSenseDataFilterUuidBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSenseDataFilterUuidBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSenseDataFilterUuidBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSenseDataFilterUuidBD.nnext(address()); }
        /** @return the value of the {@code uuidCount} field. */
        @NativeType("uint32_t")
        public int uuidCount() { return XrSenseDataFilterUuidBD.nuuidCount(address()); }
        /** @return a {@link XrUuidEXT.Buffer} view of the struct array pointed to by the {@code uuids} field. */
        @NativeType("XrUuidEXT const *")
        public XrUuidEXT.Buffer uuids() { return XrSenseDataFilterUuidBD.nuuids(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSenseDataFilterUuidBD.Buffer type(@NativeType("XrStructureType") int value) { XrSenseDataFilterUuidBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialSensing#XR_TYPE_SENSE_DATA_FILTER_UUID_BD TYPE_SENSE_DATA_FILTER_UUID_BD} value to the {@code type} field. */
        public XrSenseDataFilterUuidBD.Buffer type$Default() { return type(BDSpatialSensing.XR_TYPE_SENSE_DATA_FILTER_UUID_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSenseDataFilterUuidBD.Buffer next(@NativeType("void const *") long value) { XrSenseDataFilterUuidBD.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrUuidEXT.Buffer} to the {@code uuids} field. */
        public XrSenseDataFilterUuidBD.Buffer uuids(@NativeType("XrUuidEXT const *") XrUuidEXT.Buffer value) { XrSenseDataFilterUuidBD.nuuids(address(), value); return this; }

    }

}
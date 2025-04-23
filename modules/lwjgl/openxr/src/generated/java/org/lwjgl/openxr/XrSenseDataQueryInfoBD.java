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
 * struct XrSenseDataQueryInfoBD {
 *     XrStructureType type;
 *     void const * next;
 * }}</pre>
 */
public class XrSenseDataQueryInfoBD extends Struct<XrSenseDataQueryInfoBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    protected XrSenseDataQueryInfoBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSenseDataQueryInfoBD create(long address, @Nullable ByteBuffer container) {
        return new XrSenseDataQueryInfoBD(address, container);
    }

    /**
     * Creates a {@code XrSenseDataQueryInfoBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSenseDataQueryInfoBD(ByteBuffer container) {
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

    /** Sets the specified value to the {@code type} field. */
    public XrSenseDataQueryInfoBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialSensing#XR_TYPE_SENSE_DATA_QUERY_INFO_BD TYPE_SENSE_DATA_QUERY_INFO_BD} value to the {@code type} field. */
    public XrSenseDataQueryInfoBD type$Default() { return type(BDSpatialSensing.XR_TYPE_SENSE_DATA_QUERY_INFO_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSenseDataQueryInfoBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrSenseDataFilterSemanticBD} value to the {@code next} chain. */
    public XrSenseDataQueryInfoBD next(XrSenseDataFilterSemanticBD value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSenseDataFilterUuidBD} value to the {@code next} chain. */
    public XrSenseDataQueryInfoBD next(XrSenseDataFilterUuidBD value) { return this.next(value.next(this.next()).address()); }

    /** Initializes this struct with the specified values. */
    public XrSenseDataQueryInfoBD set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSenseDataQueryInfoBD set(XrSenseDataQueryInfoBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSenseDataQueryInfoBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSenseDataQueryInfoBD malloc() {
        return new XrSenseDataQueryInfoBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSenseDataQueryInfoBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSenseDataQueryInfoBD calloc() {
        return new XrSenseDataQueryInfoBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSenseDataQueryInfoBD} instance allocated with {@link BufferUtils}. */
    public static XrSenseDataQueryInfoBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSenseDataQueryInfoBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSenseDataQueryInfoBD} instance for the specified memory address. */
    public static XrSenseDataQueryInfoBD create(long address) {
        return new XrSenseDataQueryInfoBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSenseDataQueryInfoBD createSafe(long address) {
        return address == NULL ? null : new XrSenseDataQueryInfoBD(address, null);
    }

    /**
     * Returns a new {@link XrSenseDataQueryInfoBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataQueryInfoBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataQueryInfoBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataQueryInfoBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataQueryInfoBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSenseDataQueryInfoBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSenseDataQueryInfoBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSenseDataQueryInfoBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSenseDataQueryInfoBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSenseDataQueryInfoBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSenseDataQueryInfoBD malloc(MemoryStack stack) {
        return new XrSenseDataQueryInfoBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSenseDataQueryInfoBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSenseDataQueryInfoBD calloc(MemoryStack stack) {
        return new XrSenseDataQueryInfoBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSenseDataQueryInfoBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSenseDataQueryInfoBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSenseDataQueryInfoBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSenseDataQueryInfoBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSenseDataQueryInfoBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSenseDataQueryInfoBD.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSenseDataQueryInfoBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSenseDataQueryInfoBD.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSenseDataQueryInfoBD} structs. */
    public static class Buffer extends StructBuffer<XrSenseDataQueryInfoBD, Buffer> implements NativeResource {

        private static final XrSenseDataQueryInfoBD ELEMENT_FACTORY = XrSenseDataQueryInfoBD.create(-1L);

        /**
         * Creates a new {@code XrSenseDataQueryInfoBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSenseDataQueryInfoBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSenseDataQueryInfoBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSenseDataQueryInfoBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSenseDataQueryInfoBD.nnext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSenseDataQueryInfoBD.Buffer type(@NativeType("XrStructureType") int value) { XrSenseDataQueryInfoBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialSensing#XR_TYPE_SENSE_DATA_QUERY_INFO_BD TYPE_SENSE_DATA_QUERY_INFO_BD} value to the {@code type} field. */
        public XrSenseDataQueryInfoBD.Buffer type$Default() { return type(BDSpatialSensing.XR_TYPE_SENSE_DATA_QUERY_INFO_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSenseDataQueryInfoBD.Buffer next(@NativeType("void const *") long value) { XrSenseDataQueryInfoBD.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrSenseDataFilterSemanticBD} value to the {@code next} chain. */
        public XrSenseDataQueryInfoBD.Buffer next(XrSenseDataFilterSemanticBD value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSenseDataFilterUuidBD} value to the {@code next} chain. */
        public XrSenseDataQueryInfoBD.Buffer next(XrSenseDataFilterUuidBD value) { return this.next(value.next(this.next()).address()); }

    }

}
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
 * struct XrSpatialAnchorUnpersistInfoBD {
 *     XrStructureType type;
 *     void const * next;
 *     XrPersistenceLocationBD location;
 *     XrAnchorBD anchor;
 * }}</pre>
 */
public class XrSpatialAnchorUnpersistInfoBD extends Struct<XrSpatialAnchorUnpersistInfoBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LOCATION,
        ANCHOR;

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
        LOCATION = layout.offsetof(2);
        ANCHOR = layout.offsetof(3);
    }

    protected XrSpatialAnchorUnpersistInfoBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorUnpersistInfoBD create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorUnpersistInfoBD(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorUnpersistInfoBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorUnpersistInfoBD(ByteBuffer container) {
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
    /** @return the value of the {@code location} field. */
    @NativeType("XrPersistenceLocationBD")
    public int location() { return nlocation(address()); }
    /** @return the value of the {@code anchor} field. */
    @NativeType("XrAnchorBD")
    public long anchor() { return nanchor(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialAnchorUnpersistInfoBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialAnchor#XR_TYPE_SPATIAL_ANCHOR_UNPERSIST_INFO_BD TYPE_SPATIAL_ANCHOR_UNPERSIST_INFO_BD} value to the {@code type} field. */
    public XrSpatialAnchorUnpersistInfoBD type$Default() { return type(BDSpatialAnchor.XR_TYPE_SPATIAL_ANCHOR_UNPERSIST_INFO_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialAnchorUnpersistInfoBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code location} field. */
    public XrSpatialAnchorUnpersistInfoBD location(@NativeType("XrPersistenceLocationBD") int value) { nlocation(address(), value); return this; }
    /** Sets the specified value to the {@code anchor} field. */
    public XrSpatialAnchorUnpersistInfoBD anchor(XrAnchorBD value) { nanchor(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorUnpersistInfoBD set(
        int type,
        long next,
        int location,
        XrAnchorBD anchor
    ) {
        type(type);
        next(next);
        location(location);
        anchor(anchor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialAnchorUnpersistInfoBD set(XrSpatialAnchorUnpersistInfoBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorUnpersistInfoBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorUnpersistInfoBD malloc() {
        return new XrSpatialAnchorUnpersistInfoBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorUnpersistInfoBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorUnpersistInfoBD calloc() {
        return new XrSpatialAnchorUnpersistInfoBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorUnpersistInfoBD} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorUnpersistInfoBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorUnpersistInfoBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorUnpersistInfoBD} instance for the specified memory address. */
    public static XrSpatialAnchorUnpersistInfoBD create(long address) {
        return new XrSpatialAnchorUnpersistInfoBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorUnpersistInfoBD createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorUnpersistInfoBD(address, null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorUnpersistInfoBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorUnpersistInfoBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorUnpersistInfoBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorUnpersistInfoBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorUnpersistInfoBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorUnpersistInfoBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorUnpersistInfoBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorUnpersistInfoBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorUnpersistInfoBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialAnchorUnpersistInfoBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorUnpersistInfoBD malloc(MemoryStack stack) {
        return new XrSpatialAnchorUnpersistInfoBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorUnpersistInfoBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorUnpersistInfoBD calloc(MemoryStack stack) {
        return new XrSpatialAnchorUnpersistInfoBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorUnpersistInfoBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorUnpersistInfoBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorUnpersistInfoBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorUnpersistInfoBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialAnchorUnpersistInfoBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorUnpersistInfoBD.NEXT); }
    /** Unsafe version of {@link #location}. */
    public static int nlocation(long struct) { return memGetInt(struct + XrSpatialAnchorUnpersistInfoBD.LOCATION); }
    /** Unsafe version of {@link #anchor}. */
    public static long nanchor(long struct) { return memGetAddress(struct + XrSpatialAnchorUnpersistInfoBD.ANCHOR); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialAnchorUnpersistInfoBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorUnpersistInfoBD.NEXT, value); }
    /** Unsafe version of {@link #location(int) location}. */
    public static void nlocation(long struct, int value) { memPutInt(struct + XrSpatialAnchorUnpersistInfoBD.LOCATION, value); }
    /** Unsafe version of {@link #anchor(XrAnchorBD) anchor}. */
    public static void nanchor(long struct, XrAnchorBD value) { memPutAddress(struct + XrSpatialAnchorUnpersistInfoBD.ANCHOR, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialAnchorUnpersistInfoBD.ANCHOR));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorUnpersistInfoBD} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorUnpersistInfoBD, Buffer> implements NativeResource {

        private static final XrSpatialAnchorUnpersistInfoBD ELEMENT_FACTORY = XrSpatialAnchorUnpersistInfoBD.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorUnpersistInfoBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorUnpersistInfoBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorUnpersistInfoBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorUnpersistInfoBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialAnchorUnpersistInfoBD.nnext(address()); }
        /** @return the value of the {@code location} field. */
        @NativeType("XrPersistenceLocationBD")
        public int location() { return XrSpatialAnchorUnpersistInfoBD.nlocation(address()); }
        /** @return the value of the {@code anchor} field. */
        @NativeType("XrAnchorBD")
        public long anchor() { return XrSpatialAnchorUnpersistInfoBD.nanchor(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialAnchorUnpersistInfoBD.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorUnpersistInfoBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialAnchor#XR_TYPE_SPATIAL_ANCHOR_UNPERSIST_INFO_BD TYPE_SPATIAL_ANCHOR_UNPERSIST_INFO_BD} value to the {@code type} field. */
        public XrSpatialAnchorUnpersistInfoBD.Buffer type$Default() { return type(BDSpatialAnchor.XR_TYPE_SPATIAL_ANCHOR_UNPERSIST_INFO_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialAnchorUnpersistInfoBD.Buffer next(@NativeType("void const *") long value) { XrSpatialAnchorUnpersistInfoBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code location} field. */
        public XrSpatialAnchorUnpersistInfoBD.Buffer location(@NativeType("XrPersistenceLocationBD") int value) { XrSpatialAnchorUnpersistInfoBD.nlocation(address(), value); return this; }
        /** Sets the specified value to the {@code anchor} field. */
        public XrSpatialAnchorUnpersistInfoBD.Buffer anchor(XrAnchorBD value) { XrSpatialAnchorUnpersistInfoBD.nanchor(address(), value); return this; }

    }

}
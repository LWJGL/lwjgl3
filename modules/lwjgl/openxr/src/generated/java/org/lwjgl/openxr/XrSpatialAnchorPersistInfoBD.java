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
 * struct XrSpatialAnchorPersistInfoBD {
 *     XrStructureType type;
 *     void const * next;
 *     XrPersistenceLocationBD location;
 *     XrAnchorBD anchor;
 * }}</pre>
 */
public class XrSpatialAnchorPersistInfoBD extends Struct<XrSpatialAnchorPersistInfoBD> implements NativeResource {

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

    protected XrSpatialAnchorPersistInfoBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorPersistInfoBD create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorPersistInfoBD(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorPersistInfoBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorPersistInfoBD(ByteBuffer container) {
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
    public XrSpatialAnchorPersistInfoBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialAnchor#XR_TYPE_SPATIAL_ANCHOR_PERSIST_INFO_BD TYPE_SPATIAL_ANCHOR_PERSIST_INFO_BD} value to the {@code type} field. */
    public XrSpatialAnchorPersistInfoBD type$Default() { return type(BDSpatialAnchor.XR_TYPE_SPATIAL_ANCHOR_PERSIST_INFO_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialAnchorPersistInfoBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code location} field. */
    public XrSpatialAnchorPersistInfoBD location(@NativeType("XrPersistenceLocationBD") int value) { nlocation(address(), value); return this; }
    /** Sets the specified value to the {@code anchor} field. */
    public XrSpatialAnchorPersistInfoBD anchor(XrAnchorBD value) { nanchor(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorPersistInfoBD set(
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
    public XrSpatialAnchorPersistInfoBD set(XrSpatialAnchorPersistInfoBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorPersistInfoBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorPersistInfoBD malloc() {
        return new XrSpatialAnchorPersistInfoBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorPersistInfoBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorPersistInfoBD calloc() {
        return new XrSpatialAnchorPersistInfoBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorPersistInfoBD} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorPersistInfoBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorPersistInfoBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorPersistInfoBD} instance for the specified memory address. */
    public static XrSpatialAnchorPersistInfoBD create(long address) {
        return new XrSpatialAnchorPersistInfoBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorPersistInfoBD createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorPersistInfoBD(address, null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorPersistInfoBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorPersistInfoBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorPersistInfoBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorPersistInfoBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorPersistInfoBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorPersistInfoBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorPersistInfoBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorPersistInfoBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorPersistInfoBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialAnchorPersistInfoBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorPersistInfoBD malloc(MemoryStack stack) {
        return new XrSpatialAnchorPersistInfoBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorPersistInfoBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorPersistInfoBD calloc(MemoryStack stack) {
        return new XrSpatialAnchorPersistInfoBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorPersistInfoBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorPersistInfoBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorPersistInfoBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorPersistInfoBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialAnchorPersistInfoBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorPersistInfoBD.NEXT); }
    /** Unsafe version of {@link #location}. */
    public static int nlocation(long struct) { return memGetInt(struct + XrSpatialAnchorPersistInfoBD.LOCATION); }
    /** Unsafe version of {@link #anchor}. */
    public static long nanchor(long struct) { return memGetAddress(struct + XrSpatialAnchorPersistInfoBD.ANCHOR); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialAnchorPersistInfoBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorPersistInfoBD.NEXT, value); }
    /** Unsafe version of {@link #location(int) location}. */
    public static void nlocation(long struct, int value) { memPutInt(struct + XrSpatialAnchorPersistInfoBD.LOCATION, value); }
    /** Unsafe version of {@link #anchor(XrAnchorBD) anchor}. */
    public static void nanchor(long struct, XrAnchorBD value) { memPutAddress(struct + XrSpatialAnchorPersistInfoBD.ANCHOR, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialAnchorPersistInfoBD.ANCHOR));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorPersistInfoBD} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorPersistInfoBD, Buffer> implements NativeResource {

        private static final XrSpatialAnchorPersistInfoBD ELEMENT_FACTORY = XrSpatialAnchorPersistInfoBD.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorPersistInfoBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorPersistInfoBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorPersistInfoBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorPersistInfoBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialAnchorPersistInfoBD.nnext(address()); }
        /** @return the value of the {@code location} field. */
        @NativeType("XrPersistenceLocationBD")
        public int location() { return XrSpatialAnchorPersistInfoBD.nlocation(address()); }
        /** @return the value of the {@code anchor} field. */
        @NativeType("XrAnchorBD")
        public long anchor() { return XrSpatialAnchorPersistInfoBD.nanchor(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialAnchorPersistInfoBD.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorPersistInfoBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialAnchor#XR_TYPE_SPATIAL_ANCHOR_PERSIST_INFO_BD TYPE_SPATIAL_ANCHOR_PERSIST_INFO_BD} value to the {@code type} field. */
        public XrSpatialAnchorPersistInfoBD.Buffer type$Default() { return type(BDSpatialAnchor.XR_TYPE_SPATIAL_ANCHOR_PERSIST_INFO_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialAnchorPersistInfoBD.Buffer next(@NativeType("void const *") long value) { XrSpatialAnchorPersistInfoBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code location} field. */
        public XrSpatialAnchorPersistInfoBD.Buffer location(@NativeType("XrPersistenceLocationBD") int value) { XrSpatialAnchorPersistInfoBD.nlocation(address(), value); return this; }
        /** Sets the specified value to the {@code anchor} field. */
        public XrSpatialAnchorPersistInfoBD.Buffer anchor(XrAnchorBD value) { XrSpatialAnchorPersistInfoBD.nanchor(address(), value); return this; }

    }

}
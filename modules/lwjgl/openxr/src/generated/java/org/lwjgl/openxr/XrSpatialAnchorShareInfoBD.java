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
 * struct XrSpatialAnchorShareInfoBD {
 *     XrStructureType type;
 *     void const * next;
 *     XrAnchorBD anchor;
 * }}</pre>
 */
public class XrSpatialAnchorShareInfoBD extends Struct<XrSpatialAnchorShareInfoBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ANCHOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ANCHOR = layout.offsetof(2);
    }

    protected XrSpatialAnchorShareInfoBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorShareInfoBD create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorShareInfoBD(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorShareInfoBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorShareInfoBD(ByteBuffer container) {
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
    /** @return the value of the {@code anchor} field. */
    @NativeType("XrAnchorBD")
    public long anchor() { return nanchor(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialAnchorShareInfoBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialAnchorSharing#XR_TYPE_SPATIAL_ANCHOR_SHARE_INFO_BD TYPE_SPATIAL_ANCHOR_SHARE_INFO_BD} value to the {@code type} field. */
    public XrSpatialAnchorShareInfoBD type$Default() { return type(BDSpatialAnchorSharing.XR_TYPE_SPATIAL_ANCHOR_SHARE_INFO_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialAnchorShareInfoBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code anchor} field. */
    public XrSpatialAnchorShareInfoBD anchor(XrAnchorBD value) { nanchor(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorShareInfoBD set(
        int type,
        long next,
        XrAnchorBD anchor
    ) {
        type(type);
        next(next);
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
    public XrSpatialAnchorShareInfoBD set(XrSpatialAnchorShareInfoBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorShareInfoBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorShareInfoBD malloc() {
        return new XrSpatialAnchorShareInfoBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorShareInfoBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorShareInfoBD calloc() {
        return new XrSpatialAnchorShareInfoBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorShareInfoBD} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorShareInfoBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorShareInfoBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorShareInfoBD} instance for the specified memory address. */
    public static XrSpatialAnchorShareInfoBD create(long address) {
        return new XrSpatialAnchorShareInfoBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorShareInfoBD createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorShareInfoBD(address, null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorShareInfoBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorShareInfoBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorShareInfoBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorShareInfoBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorShareInfoBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorShareInfoBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorShareInfoBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorShareInfoBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorShareInfoBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialAnchorShareInfoBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorShareInfoBD malloc(MemoryStack stack) {
        return new XrSpatialAnchorShareInfoBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorShareInfoBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorShareInfoBD calloc(MemoryStack stack) {
        return new XrSpatialAnchorShareInfoBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorShareInfoBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorShareInfoBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorShareInfoBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorShareInfoBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialAnchorShareInfoBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorShareInfoBD.NEXT); }
    /** Unsafe version of {@link #anchor}. */
    public static long nanchor(long struct) { return memGetAddress(struct + XrSpatialAnchorShareInfoBD.ANCHOR); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialAnchorShareInfoBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorShareInfoBD.NEXT, value); }
    /** Unsafe version of {@link #anchor(XrAnchorBD) anchor}. */
    public static void nanchor(long struct, XrAnchorBD value) { memPutAddress(struct + XrSpatialAnchorShareInfoBD.ANCHOR, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialAnchorShareInfoBD.ANCHOR));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorShareInfoBD} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorShareInfoBD, Buffer> implements NativeResource {

        private static final XrSpatialAnchorShareInfoBD ELEMENT_FACTORY = XrSpatialAnchorShareInfoBD.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorShareInfoBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorShareInfoBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorShareInfoBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorShareInfoBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialAnchorShareInfoBD.nnext(address()); }
        /** @return the value of the {@code anchor} field. */
        @NativeType("XrAnchorBD")
        public long anchor() { return XrSpatialAnchorShareInfoBD.nanchor(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialAnchorShareInfoBD.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorShareInfoBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialAnchorSharing#XR_TYPE_SPATIAL_ANCHOR_SHARE_INFO_BD TYPE_SPATIAL_ANCHOR_SHARE_INFO_BD} value to the {@code type} field. */
        public XrSpatialAnchorShareInfoBD.Buffer type$Default() { return type(BDSpatialAnchorSharing.XR_TYPE_SPATIAL_ANCHOR_SHARE_INFO_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialAnchorShareInfoBD.Buffer next(@NativeType("void const *") long value) { XrSpatialAnchorShareInfoBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code anchor} field. */
        public XrSpatialAnchorShareInfoBD.Buffer anchor(XrAnchorBD value) { XrSpatialAnchorShareInfoBD.nanchor(address(), value); return this; }

    }

}
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
 * struct XrAnchorSharingInfoANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace anchor;
 * }}</pre>
 */
public class XrAnchorSharingInfoANDROID extends Struct<XrAnchorSharingInfoANDROID> implements NativeResource {

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

    protected XrAnchorSharingInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrAnchorSharingInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrAnchorSharingInfoANDROID(address, container);
    }

    /**
     * Creates a {@code XrAnchorSharingInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrAnchorSharingInfoANDROID(ByteBuffer container) {
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
    @NativeType("XrSpace")
    public long anchor() { return nanchor(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrAnchorSharingInfoANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDAnchorSharingExport#XR_TYPE_ANCHOR_SHARING_INFO_ANDROID TYPE_ANCHOR_SHARING_INFO_ANDROID} value to the {@code type} field. */
    public XrAnchorSharingInfoANDROID type$Default() { return type(ANDROIDAnchorSharingExport.XR_TYPE_ANCHOR_SHARING_INFO_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrAnchorSharingInfoANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code anchor} field. */
    public XrAnchorSharingInfoANDROID anchor(XrSpace value) { nanchor(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrAnchorSharingInfoANDROID set(
        int type,
        long next,
        XrSpace anchor
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
    public XrAnchorSharingInfoANDROID set(XrAnchorSharingInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrAnchorSharingInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrAnchorSharingInfoANDROID malloc() {
        return new XrAnchorSharingInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrAnchorSharingInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrAnchorSharingInfoANDROID calloc() {
        return new XrAnchorSharingInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrAnchorSharingInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static XrAnchorSharingInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrAnchorSharingInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrAnchorSharingInfoANDROID} instance for the specified memory address. */
    public static XrAnchorSharingInfoANDROID create(long address) {
        return new XrAnchorSharingInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrAnchorSharingInfoANDROID createSafe(long address) {
        return address == NULL ? null : new XrAnchorSharingInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link XrAnchorSharingInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrAnchorSharingInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrAnchorSharingInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrAnchorSharingInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrAnchorSharingInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrAnchorSharingInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrAnchorSharingInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrAnchorSharingInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrAnchorSharingInfoANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrAnchorSharingInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrAnchorSharingInfoANDROID malloc(MemoryStack stack) {
        return new XrAnchorSharingInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrAnchorSharingInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrAnchorSharingInfoANDROID calloc(MemoryStack stack) {
        return new XrAnchorSharingInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrAnchorSharingInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrAnchorSharingInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrAnchorSharingInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrAnchorSharingInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrAnchorSharingInfoANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrAnchorSharingInfoANDROID.NEXT); }
    /** Unsafe version of {@link #anchor}. */
    public static long nanchor(long struct) { return memGetAddress(struct + XrAnchorSharingInfoANDROID.ANCHOR); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrAnchorSharingInfoANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrAnchorSharingInfoANDROID.NEXT, value); }
    /** Unsafe version of {@link #anchor(XrSpace) anchor}. */
    public static void nanchor(long struct, XrSpace value) { memPutAddress(struct + XrAnchorSharingInfoANDROID.ANCHOR, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrAnchorSharingInfoANDROID.ANCHOR));
    }

    // -----------------------------------

    /** An array of {@link XrAnchorSharingInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<XrAnchorSharingInfoANDROID, Buffer> implements NativeResource {

        private static final XrAnchorSharingInfoANDROID ELEMENT_FACTORY = XrAnchorSharingInfoANDROID.create(-1L);

        /**
         * Creates a new {@code XrAnchorSharingInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrAnchorSharingInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrAnchorSharingInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrAnchorSharingInfoANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrAnchorSharingInfoANDROID.nnext(address()); }
        /** @return the value of the {@code anchor} field. */
        @NativeType("XrSpace")
        public long anchor() { return XrAnchorSharingInfoANDROID.nanchor(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrAnchorSharingInfoANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrAnchorSharingInfoANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDAnchorSharingExport#XR_TYPE_ANCHOR_SHARING_INFO_ANDROID TYPE_ANCHOR_SHARING_INFO_ANDROID} value to the {@code type} field. */
        public XrAnchorSharingInfoANDROID.Buffer type$Default() { return type(ANDROIDAnchorSharingExport.XR_TYPE_ANCHOR_SHARING_INFO_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrAnchorSharingInfoANDROID.Buffer next(@NativeType("void const *") long value) { XrAnchorSharingInfoANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code anchor} field. */
        public XrAnchorSharingInfoANDROID.Buffer anchor(XrSpace value) { XrAnchorSharingInfoANDROID.nanchor(address(), value); return this; }

    }

}
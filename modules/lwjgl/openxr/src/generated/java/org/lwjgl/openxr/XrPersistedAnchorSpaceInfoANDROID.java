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
 * struct XrPersistedAnchorSpaceInfoANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace anchor;
 * }}</pre>
 */
public class XrPersistedAnchorSpaceInfoANDROID extends Struct<XrPersistedAnchorSpaceInfoANDROID> implements NativeResource {

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

    protected XrPersistedAnchorSpaceInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPersistedAnchorSpaceInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrPersistedAnchorSpaceInfoANDROID(address, container);
    }

    /**
     * Creates a {@code XrPersistedAnchorSpaceInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPersistedAnchorSpaceInfoANDROID(ByteBuffer container) {
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
    public XrPersistedAnchorSpaceInfoANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDDeviceAnchorPersistence#XR_TYPE_PERSISTED_ANCHOR_SPACE_INFO_ANDROID TYPE_PERSISTED_ANCHOR_SPACE_INFO_ANDROID} value to the {@code type} field. */
    public XrPersistedAnchorSpaceInfoANDROID type$Default() { return type(ANDROIDDeviceAnchorPersistence.XR_TYPE_PERSISTED_ANCHOR_SPACE_INFO_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrPersistedAnchorSpaceInfoANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code anchor} field. */
    public XrPersistedAnchorSpaceInfoANDROID anchor(XrSpace value) { nanchor(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrPersistedAnchorSpaceInfoANDROID set(
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
    public XrPersistedAnchorSpaceInfoANDROID set(XrPersistedAnchorSpaceInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPersistedAnchorSpaceInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPersistedAnchorSpaceInfoANDROID malloc() {
        return new XrPersistedAnchorSpaceInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPersistedAnchorSpaceInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPersistedAnchorSpaceInfoANDROID calloc() {
        return new XrPersistedAnchorSpaceInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPersistedAnchorSpaceInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static XrPersistedAnchorSpaceInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPersistedAnchorSpaceInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrPersistedAnchorSpaceInfoANDROID} instance for the specified memory address. */
    public static XrPersistedAnchorSpaceInfoANDROID create(long address) {
        return new XrPersistedAnchorSpaceInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrPersistedAnchorSpaceInfoANDROID createSafe(long address) {
        return address == NULL ? null : new XrPersistedAnchorSpaceInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link XrPersistedAnchorSpaceInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPersistedAnchorSpaceInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPersistedAnchorSpaceInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPersistedAnchorSpaceInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPersistedAnchorSpaceInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPersistedAnchorSpaceInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPersistedAnchorSpaceInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPersistedAnchorSpaceInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrPersistedAnchorSpaceInfoANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPersistedAnchorSpaceInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPersistedAnchorSpaceInfoANDROID malloc(MemoryStack stack) {
        return new XrPersistedAnchorSpaceInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPersistedAnchorSpaceInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPersistedAnchorSpaceInfoANDROID calloc(MemoryStack stack) {
        return new XrPersistedAnchorSpaceInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPersistedAnchorSpaceInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPersistedAnchorSpaceInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPersistedAnchorSpaceInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPersistedAnchorSpaceInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrPersistedAnchorSpaceInfoANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPersistedAnchorSpaceInfoANDROID.NEXT); }
    /** Unsafe version of {@link #anchor}. */
    public static long nanchor(long struct) { return memGetAddress(struct + XrPersistedAnchorSpaceInfoANDROID.ANCHOR); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrPersistedAnchorSpaceInfoANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPersistedAnchorSpaceInfoANDROID.NEXT, value); }
    /** Unsafe version of {@link #anchor(XrSpace) anchor}. */
    public static void nanchor(long struct, XrSpace value) { memPutAddress(struct + XrPersistedAnchorSpaceInfoANDROID.ANCHOR, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrPersistedAnchorSpaceInfoANDROID.ANCHOR));
    }

    // -----------------------------------

    /** An array of {@link XrPersistedAnchorSpaceInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<XrPersistedAnchorSpaceInfoANDROID, Buffer> implements NativeResource {

        private static final XrPersistedAnchorSpaceInfoANDROID ELEMENT_FACTORY = XrPersistedAnchorSpaceInfoANDROID.create(-1L);

        /**
         * Creates a new {@code XrPersistedAnchorSpaceInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPersistedAnchorSpaceInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPersistedAnchorSpaceInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPersistedAnchorSpaceInfoANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrPersistedAnchorSpaceInfoANDROID.nnext(address()); }
        /** @return the value of the {@code anchor} field. */
        @NativeType("XrSpace")
        public long anchor() { return XrPersistedAnchorSpaceInfoANDROID.nanchor(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrPersistedAnchorSpaceInfoANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrPersistedAnchorSpaceInfoANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDDeviceAnchorPersistence#XR_TYPE_PERSISTED_ANCHOR_SPACE_INFO_ANDROID TYPE_PERSISTED_ANCHOR_SPACE_INFO_ANDROID} value to the {@code type} field. */
        public XrPersistedAnchorSpaceInfoANDROID.Buffer type$Default() { return type(ANDROIDDeviceAnchorPersistence.XR_TYPE_PERSISTED_ANCHOR_SPACE_INFO_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrPersistedAnchorSpaceInfoANDROID.Buffer next(@NativeType("void const *") long value) { XrPersistedAnchorSpaceInfoANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code anchor} field. */
        public XrPersistedAnchorSpaceInfoANDROID.Buffer anchor(XrSpace value) { XrPersistedAnchorSpaceInfoANDROID.nanchor(address(), value); return this; }

    }

}
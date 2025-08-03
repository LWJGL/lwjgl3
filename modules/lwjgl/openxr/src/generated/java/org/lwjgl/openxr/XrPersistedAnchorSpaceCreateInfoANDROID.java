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
 * struct XrPersistedAnchorSpaceCreateInfoANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     {@link XrUuidEXT XrUuidEXT} anchorId;
 * }}</pre>
 */
public class XrPersistedAnchorSpaceCreateInfoANDROID extends Struct<XrPersistedAnchorSpaceCreateInfoANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ANCHORID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrUuidEXT.SIZEOF, XrUuidEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ANCHORID = layout.offsetof(2);
    }

    protected XrPersistedAnchorSpaceCreateInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPersistedAnchorSpaceCreateInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrPersistedAnchorSpaceCreateInfoANDROID(address, container);
    }

    /**
     * Creates a {@code XrPersistedAnchorSpaceCreateInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPersistedAnchorSpaceCreateInfoANDROID(ByteBuffer container) {
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
    /** @return a {@link XrUuidEXT} view of the {@code anchorId} field. */
    public XrUuidEXT anchorId() { return nanchorId(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrPersistedAnchorSpaceCreateInfoANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDDeviceAnchorPersistence#XR_TYPE_PERSISTED_ANCHOR_SPACE_CREATE_INFO_ANDROID TYPE_PERSISTED_ANCHOR_SPACE_CREATE_INFO_ANDROID} value to the {@code type} field. */
    public XrPersistedAnchorSpaceCreateInfoANDROID type$Default() { return type(ANDROIDDeviceAnchorPersistence.XR_TYPE_PERSISTED_ANCHOR_SPACE_CREATE_INFO_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrPersistedAnchorSpaceCreateInfoANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrUuidEXT} to the {@code anchorId} field. */
    public XrPersistedAnchorSpaceCreateInfoANDROID anchorId(XrUuidEXT value) { nanchorId(address(), value); return this; }
    /** Passes the {@code anchorId} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrPersistedAnchorSpaceCreateInfoANDROID anchorId(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(anchorId()); return this; }

    /** Initializes this struct with the specified values. */
    public XrPersistedAnchorSpaceCreateInfoANDROID set(
        int type,
        long next,
        XrUuidEXT anchorId
    ) {
        type(type);
        next(next);
        anchorId(anchorId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPersistedAnchorSpaceCreateInfoANDROID set(XrPersistedAnchorSpaceCreateInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPersistedAnchorSpaceCreateInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPersistedAnchorSpaceCreateInfoANDROID malloc() {
        return new XrPersistedAnchorSpaceCreateInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPersistedAnchorSpaceCreateInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPersistedAnchorSpaceCreateInfoANDROID calloc() {
        return new XrPersistedAnchorSpaceCreateInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPersistedAnchorSpaceCreateInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static XrPersistedAnchorSpaceCreateInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPersistedAnchorSpaceCreateInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrPersistedAnchorSpaceCreateInfoANDROID} instance for the specified memory address. */
    public static XrPersistedAnchorSpaceCreateInfoANDROID create(long address) {
        return new XrPersistedAnchorSpaceCreateInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrPersistedAnchorSpaceCreateInfoANDROID createSafe(long address) {
        return address == NULL ? null : new XrPersistedAnchorSpaceCreateInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link XrPersistedAnchorSpaceCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPersistedAnchorSpaceCreateInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPersistedAnchorSpaceCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPersistedAnchorSpaceCreateInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPersistedAnchorSpaceCreateInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPersistedAnchorSpaceCreateInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPersistedAnchorSpaceCreateInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPersistedAnchorSpaceCreateInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrPersistedAnchorSpaceCreateInfoANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPersistedAnchorSpaceCreateInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPersistedAnchorSpaceCreateInfoANDROID malloc(MemoryStack stack) {
        return new XrPersistedAnchorSpaceCreateInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPersistedAnchorSpaceCreateInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPersistedAnchorSpaceCreateInfoANDROID calloc(MemoryStack stack) {
        return new XrPersistedAnchorSpaceCreateInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPersistedAnchorSpaceCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPersistedAnchorSpaceCreateInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPersistedAnchorSpaceCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPersistedAnchorSpaceCreateInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrPersistedAnchorSpaceCreateInfoANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPersistedAnchorSpaceCreateInfoANDROID.NEXT); }
    /** Unsafe version of {@link #anchorId}. */
    public static XrUuidEXT nanchorId(long struct) { return XrUuidEXT.create(struct + XrPersistedAnchorSpaceCreateInfoANDROID.ANCHORID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrPersistedAnchorSpaceCreateInfoANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPersistedAnchorSpaceCreateInfoANDROID.NEXT, value); }
    /** Unsafe version of {@link #anchorId(XrUuidEXT) anchorId}. */
    public static void nanchorId(long struct, XrUuidEXT value) { memCopy(value.address(), struct + XrPersistedAnchorSpaceCreateInfoANDROID.ANCHORID, XrUuidEXT.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrPersistedAnchorSpaceCreateInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<XrPersistedAnchorSpaceCreateInfoANDROID, Buffer> implements NativeResource {

        private static final XrPersistedAnchorSpaceCreateInfoANDROID ELEMENT_FACTORY = XrPersistedAnchorSpaceCreateInfoANDROID.create(-1L);

        /**
         * Creates a new {@code XrPersistedAnchorSpaceCreateInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPersistedAnchorSpaceCreateInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPersistedAnchorSpaceCreateInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPersistedAnchorSpaceCreateInfoANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrPersistedAnchorSpaceCreateInfoANDROID.nnext(address()); }
        /** @return a {@link XrUuidEXT} view of the {@code anchorId} field. */
        public XrUuidEXT anchorId() { return XrPersistedAnchorSpaceCreateInfoANDROID.nanchorId(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrPersistedAnchorSpaceCreateInfoANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrPersistedAnchorSpaceCreateInfoANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDDeviceAnchorPersistence#XR_TYPE_PERSISTED_ANCHOR_SPACE_CREATE_INFO_ANDROID TYPE_PERSISTED_ANCHOR_SPACE_CREATE_INFO_ANDROID} value to the {@code type} field. */
        public XrPersistedAnchorSpaceCreateInfoANDROID.Buffer type$Default() { return type(ANDROIDDeviceAnchorPersistence.XR_TYPE_PERSISTED_ANCHOR_SPACE_CREATE_INFO_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrPersistedAnchorSpaceCreateInfoANDROID.Buffer next(@NativeType("void const *") long value) { XrPersistedAnchorSpaceCreateInfoANDROID.nnext(address(), value); return this; }
        /** Copies the specified {@link XrUuidEXT} to the {@code anchorId} field. */
        public XrPersistedAnchorSpaceCreateInfoANDROID.Buffer anchorId(XrUuidEXT value) { XrPersistedAnchorSpaceCreateInfoANDROID.nanchorId(address(), value); return this; }
        /** Passes the {@code anchorId} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrPersistedAnchorSpaceCreateInfoANDROID.Buffer anchorId(java.util.function.Consumer<XrUuidEXT> consumer) { consumer.accept(anchorId()); return this; }

    }

}
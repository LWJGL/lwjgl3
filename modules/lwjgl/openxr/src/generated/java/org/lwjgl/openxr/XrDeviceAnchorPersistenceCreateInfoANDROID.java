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
 * struct XrDeviceAnchorPersistenceCreateInfoANDROID {
 *     XrStructureType type;
 *     void const * next;
 * }}</pre>
 */
public class XrDeviceAnchorPersistenceCreateInfoANDROID extends Struct<XrDeviceAnchorPersistenceCreateInfoANDROID> implements NativeResource {

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

    protected XrDeviceAnchorPersistenceCreateInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrDeviceAnchorPersistenceCreateInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrDeviceAnchorPersistenceCreateInfoANDROID(address, container);
    }

    /**
     * Creates a {@code XrDeviceAnchorPersistenceCreateInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrDeviceAnchorPersistenceCreateInfoANDROID(ByteBuffer container) {
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
    public XrDeviceAnchorPersistenceCreateInfoANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDDeviceAnchorPersistence#XR_TYPE_DEVICE_ANCHOR_PERSISTENCE_CREATE_INFO_ANDROID TYPE_DEVICE_ANCHOR_PERSISTENCE_CREATE_INFO_ANDROID} value to the {@code type} field. */
    public XrDeviceAnchorPersistenceCreateInfoANDROID type$Default() { return type(ANDROIDDeviceAnchorPersistence.XR_TYPE_DEVICE_ANCHOR_PERSISTENCE_CREATE_INFO_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrDeviceAnchorPersistenceCreateInfoANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrDeviceAnchorPersistenceCreateInfoANDROID set(
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
    public XrDeviceAnchorPersistenceCreateInfoANDROID set(XrDeviceAnchorPersistenceCreateInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrDeviceAnchorPersistenceCreateInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrDeviceAnchorPersistenceCreateInfoANDROID malloc() {
        return new XrDeviceAnchorPersistenceCreateInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrDeviceAnchorPersistenceCreateInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrDeviceAnchorPersistenceCreateInfoANDROID calloc() {
        return new XrDeviceAnchorPersistenceCreateInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrDeviceAnchorPersistenceCreateInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static XrDeviceAnchorPersistenceCreateInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrDeviceAnchorPersistenceCreateInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrDeviceAnchorPersistenceCreateInfoANDROID} instance for the specified memory address. */
    public static XrDeviceAnchorPersistenceCreateInfoANDROID create(long address) {
        return new XrDeviceAnchorPersistenceCreateInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrDeviceAnchorPersistenceCreateInfoANDROID createSafe(long address) {
        return address == NULL ? null : new XrDeviceAnchorPersistenceCreateInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link XrDeviceAnchorPersistenceCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDeviceAnchorPersistenceCreateInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrDeviceAnchorPersistenceCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDeviceAnchorPersistenceCreateInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDeviceAnchorPersistenceCreateInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrDeviceAnchorPersistenceCreateInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrDeviceAnchorPersistenceCreateInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrDeviceAnchorPersistenceCreateInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrDeviceAnchorPersistenceCreateInfoANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrDeviceAnchorPersistenceCreateInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDeviceAnchorPersistenceCreateInfoANDROID malloc(MemoryStack stack) {
        return new XrDeviceAnchorPersistenceCreateInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrDeviceAnchorPersistenceCreateInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDeviceAnchorPersistenceCreateInfoANDROID calloc(MemoryStack stack) {
        return new XrDeviceAnchorPersistenceCreateInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrDeviceAnchorPersistenceCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDeviceAnchorPersistenceCreateInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDeviceAnchorPersistenceCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDeviceAnchorPersistenceCreateInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrDeviceAnchorPersistenceCreateInfoANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrDeviceAnchorPersistenceCreateInfoANDROID.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrDeviceAnchorPersistenceCreateInfoANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrDeviceAnchorPersistenceCreateInfoANDROID.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrDeviceAnchorPersistenceCreateInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<XrDeviceAnchorPersistenceCreateInfoANDROID, Buffer> implements NativeResource {

        private static final XrDeviceAnchorPersistenceCreateInfoANDROID ELEMENT_FACTORY = XrDeviceAnchorPersistenceCreateInfoANDROID.create(-1L);

        /**
         * Creates a new {@code XrDeviceAnchorPersistenceCreateInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrDeviceAnchorPersistenceCreateInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrDeviceAnchorPersistenceCreateInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrDeviceAnchorPersistenceCreateInfoANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrDeviceAnchorPersistenceCreateInfoANDROID.nnext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrDeviceAnchorPersistenceCreateInfoANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrDeviceAnchorPersistenceCreateInfoANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDDeviceAnchorPersistence#XR_TYPE_DEVICE_ANCHOR_PERSISTENCE_CREATE_INFO_ANDROID TYPE_DEVICE_ANCHOR_PERSISTENCE_CREATE_INFO_ANDROID} value to the {@code type} field. */
        public XrDeviceAnchorPersistenceCreateInfoANDROID.Buffer type$Default() { return type(ANDROIDDeviceAnchorPersistence.XR_TYPE_DEVICE_ANCHOR_PERSISTENCE_CREATE_INFO_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrDeviceAnchorPersistenceCreateInfoANDROID.Buffer next(@NativeType("void const *") long value) { XrDeviceAnchorPersistenceCreateInfoANDROID.nnext(address(), value); return this; }

    }

}
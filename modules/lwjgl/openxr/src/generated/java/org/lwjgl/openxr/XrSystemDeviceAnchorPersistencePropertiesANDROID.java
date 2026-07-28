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
 * struct XrSystemDeviceAnchorPersistencePropertiesANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsAnchorPersistence;
 * }}</pre>
 */
public class XrSystemDeviceAnchorPersistencePropertiesANDROID extends Struct<XrSystemDeviceAnchorPersistencePropertiesANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSANCHORPERSISTENCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPORTSANCHORPERSISTENCE = layout.offsetof(2);
    }

    protected XrSystemDeviceAnchorPersistencePropertiesANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemDeviceAnchorPersistencePropertiesANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSystemDeviceAnchorPersistencePropertiesANDROID(address, container);
    }

    /**
     * Creates a {@code XrSystemDeviceAnchorPersistencePropertiesANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemDeviceAnchorPersistencePropertiesANDROID(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code supportsAnchorPersistence} field. */
    @NativeType("XrBool32")
    public boolean supportsAnchorPersistence() { return nsupportsAnchorPersistence(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemDeviceAnchorPersistencePropertiesANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDDeviceAnchorPersistence#XR_TYPE_SYSTEM_DEVICE_ANCHOR_PERSISTENCE_PROPERTIES_ANDROID TYPE_SYSTEM_DEVICE_ANCHOR_PERSISTENCE_PROPERTIES_ANDROID} value to the {@code type} field. */
    public XrSystemDeviceAnchorPersistencePropertiesANDROID type$Default() { return type(ANDROIDDeviceAnchorPersistence.XR_TYPE_SYSTEM_DEVICE_ANCHOR_PERSISTENCE_PROPERTIES_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemDeviceAnchorPersistencePropertiesANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemDeviceAnchorPersistencePropertiesANDROID set(
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
    public XrSystemDeviceAnchorPersistencePropertiesANDROID set(XrSystemDeviceAnchorPersistencePropertiesANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemDeviceAnchorPersistencePropertiesANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemDeviceAnchorPersistencePropertiesANDROID malloc() {
        return new XrSystemDeviceAnchorPersistencePropertiesANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemDeviceAnchorPersistencePropertiesANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemDeviceAnchorPersistencePropertiesANDROID calloc() {
        return new XrSystemDeviceAnchorPersistencePropertiesANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemDeviceAnchorPersistencePropertiesANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSystemDeviceAnchorPersistencePropertiesANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemDeviceAnchorPersistencePropertiesANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemDeviceAnchorPersistencePropertiesANDROID} instance for the specified memory address. */
    public static XrSystemDeviceAnchorPersistencePropertiesANDROID create(long address) {
        return new XrSystemDeviceAnchorPersistencePropertiesANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemDeviceAnchorPersistencePropertiesANDROID createSafe(long address) {
        return address == NULL ? null : new XrSystemDeviceAnchorPersistencePropertiesANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSystemDeviceAnchorPersistencePropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemDeviceAnchorPersistencePropertiesANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemDeviceAnchorPersistencePropertiesANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemDeviceAnchorPersistencePropertiesANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemDeviceAnchorPersistencePropertiesANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemDeviceAnchorPersistencePropertiesANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemDeviceAnchorPersistencePropertiesANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemDeviceAnchorPersistencePropertiesANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemDeviceAnchorPersistencePropertiesANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemDeviceAnchorPersistencePropertiesANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemDeviceAnchorPersistencePropertiesANDROID malloc(MemoryStack stack) {
        return new XrSystemDeviceAnchorPersistencePropertiesANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemDeviceAnchorPersistencePropertiesANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemDeviceAnchorPersistencePropertiesANDROID calloc(MemoryStack stack) {
        return new XrSystemDeviceAnchorPersistencePropertiesANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemDeviceAnchorPersistencePropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemDeviceAnchorPersistencePropertiesANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemDeviceAnchorPersistencePropertiesANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemDeviceAnchorPersistencePropertiesANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemDeviceAnchorPersistencePropertiesANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemDeviceAnchorPersistencePropertiesANDROID.NEXT); }
    /** Unsafe version of {@link #supportsAnchorPersistence}. */
    public static int nsupportsAnchorPersistence(long struct) { return memGetInt(struct + XrSystemDeviceAnchorPersistencePropertiesANDROID.SUPPORTSANCHORPERSISTENCE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemDeviceAnchorPersistencePropertiesANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemDeviceAnchorPersistencePropertiesANDROID.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemDeviceAnchorPersistencePropertiesANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSystemDeviceAnchorPersistencePropertiesANDROID, Buffer> implements NativeResource {

        private static final XrSystemDeviceAnchorPersistencePropertiesANDROID ELEMENT_FACTORY = XrSystemDeviceAnchorPersistencePropertiesANDROID.create(-1L);

        /**
         * Creates a new {@code XrSystemDeviceAnchorPersistencePropertiesANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemDeviceAnchorPersistencePropertiesANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemDeviceAnchorPersistencePropertiesANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemDeviceAnchorPersistencePropertiesANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemDeviceAnchorPersistencePropertiesANDROID.nnext(address()); }
        /** @return the value of the {@code supportsAnchorPersistence} field. */
        @NativeType("XrBool32")
        public boolean supportsAnchorPersistence() { return XrSystemDeviceAnchorPersistencePropertiesANDROID.nsupportsAnchorPersistence(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemDeviceAnchorPersistencePropertiesANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSystemDeviceAnchorPersistencePropertiesANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDDeviceAnchorPersistence#XR_TYPE_SYSTEM_DEVICE_ANCHOR_PERSISTENCE_PROPERTIES_ANDROID TYPE_SYSTEM_DEVICE_ANCHOR_PERSISTENCE_PROPERTIES_ANDROID} value to the {@code type} field. */
        public XrSystemDeviceAnchorPersistencePropertiesANDROID.Buffer type$Default() { return type(ANDROIDDeviceAnchorPersistence.XR_TYPE_SYSTEM_DEVICE_ANCHOR_PERSISTENCE_PROPERTIES_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemDeviceAnchorPersistencePropertiesANDROID.Buffer next(@NativeType("void *") long value) { XrSystemDeviceAnchorPersistencePropertiesANDROID.nnext(address(), value); return this; }

    }

}
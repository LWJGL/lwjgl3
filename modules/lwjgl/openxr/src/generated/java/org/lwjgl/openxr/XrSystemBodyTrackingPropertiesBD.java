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
 * struct XrSystemBodyTrackingPropertiesBD {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsBodyTracking;
 * }}</pre>
 */
public class XrSystemBodyTrackingPropertiesBD extends Struct<XrSystemBodyTrackingPropertiesBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSBODYTRACKING;

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
        SUPPORTSBODYTRACKING = layout.offsetof(2);
    }

    protected XrSystemBodyTrackingPropertiesBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemBodyTrackingPropertiesBD create(long address, @Nullable ByteBuffer container) {
        return new XrSystemBodyTrackingPropertiesBD(address, container);
    }

    /**
     * Creates a {@code XrSystemBodyTrackingPropertiesBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemBodyTrackingPropertiesBD(ByteBuffer container) {
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
    /** @return the value of the {@code supportsBodyTracking} field. */
    @NativeType("XrBool32")
    public boolean supportsBodyTracking() { return nsupportsBodyTracking(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemBodyTrackingPropertiesBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDBodyTracking#XR_TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_BD TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_BD} value to the {@code type} field. */
    public XrSystemBodyTrackingPropertiesBD type$Default() { return type(BDBodyTracking.XR_TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemBodyTrackingPropertiesBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemBodyTrackingPropertiesBD set(
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
    public XrSystemBodyTrackingPropertiesBD set(XrSystemBodyTrackingPropertiesBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemBodyTrackingPropertiesBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemBodyTrackingPropertiesBD malloc() {
        return new XrSystemBodyTrackingPropertiesBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemBodyTrackingPropertiesBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemBodyTrackingPropertiesBD calloc() {
        return new XrSystemBodyTrackingPropertiesBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemBodyTrackingPropertiesBD} instance allocated with {@link BufferUtils}. */
    public static XrSystemBodyTrackingPropertiesBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemBodyTrackingPropertiesBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemBodyTrackingPropertiesBD} instance for the specified memory address. */
    public static XrSystemBodyTrackingPropertiesBD create(long address) {
        return new XrSystemBodyTrackingPropertiesBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemBodyTrackingPropertiesBD createSafe(long address) {
        return address == NULL ? null : new XrSystemBodyTrackingPropertiesBD(address, null);
    }

    /**
     * Returns a new {@link XrSystemBodyTrackingPropertiesBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemBodyTrackingPropertiesBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemBodyTrackingPropertiesBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemBodyTrackingPropertiesBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemBodyTrackingPropertiesBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemBodyTrackingPropertiesBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemBodyTrackingPropertiesBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemBodyTrackingPropertiesBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemBodyTrackingPropertiesBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemBodyTrackingPropertiesBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemBodyTrackingPropertiesBD malloc(MemoryStack stack) {
        return new XrSystemBodyTrackingPropertiesBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemBodyTrackingPropertiesBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemBodyTrackingPropertiesBD calloc(MemoryStack stack) {
        return new XrSystemBodyTrackingPropertiesBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemBodyTrackingPropertiesBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemBodyTrackingPropertiesBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemBodyTrackingPropertiesBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemBodyTrackingPropertiesBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemBodyTrackingPropertiesBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemBodyTrackingPropertiesBD.NEXT); }
    /** Unsafe version of {@link #supportsBodyTracking}. */
    public static int nsupportsBodyTracking(long struct) { return memGetInt(struct + XrSystemBodyTrackingPropertiesBD.SUPPORTSBODYTRACKING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemBodyTrackingPropertiesBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemBodyTrackingPropertiesBD.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemBodyTrackingPropertiesBD} structs. */
    public static class Buffer extends StructBuffer<XrSystemBodyTrackingPropertiesBD, Buffer> implements NativeResource {

        private static final XrSystemBodyTrackingPropertiesBD ELEMENT_FACTORY = XrSystemBodyTrackingPropertiesBD.create(-1L);

        /**
         * Creates a new {@code XrSystemBodyTrackingPropertiesBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemBodyTrackingPropertiesBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemBodyTrackingPropertiesBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemBodyTrackingPropertiesBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemBodyTrackingPropertiesBD.nnext(address()); }
        /** @return the value of the {@code supportsBodyTracking} field. */
        @NativeType("XrBool32")
        public boolean supportsBodyTracking() { return XrSystemBodyTrackingPropertiesBD.nsupportsBodyTracking(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemBodyTrackingPropertiesBD.Buffer type(@NativeType("XrStructureType") int value) { XrSystemBodyTrackingPropertiesBD.ntype(address(), value); return this; }
        /** Sets the {@link BDBodyTracking#XR_TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_BD TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_BD} value to the {@code type} field. */
        public XrSystemBodyTrackingPropertiesBD.Buffer type$Default() { return type(BDBodyTracking.XR_TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemBodyTrackingPropertiesBD.Buffer next(@NativeType("void *") long value) { XrSystemBodyTrackingPropertiesBD.nnext(address(), value); return this; }

    }

}
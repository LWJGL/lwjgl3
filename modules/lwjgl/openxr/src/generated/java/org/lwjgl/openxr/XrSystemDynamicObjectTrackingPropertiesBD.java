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
 * struct XrSystemDynamicObjectTrackingPropertiesBD {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsDynamicObjectTracking;
 * }}</pre>
 */
public class XrSystemDynamicObjectTrackingPropertiesBD extends Struct<XrSystemDynamicObjectTrackingPropertiesBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSDYNAMICOBJECTTRACKING;

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
        SUPPORTSDYNAMICOBJECTTRACKING = layout.offsetof(2);
    }

    protected XrSystemDynamicObjectTrackingPropertiesBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemDynamicObjectTrackingPropertiesBD create(long address, @Nullable ByteBuffer container) {
        return new XrSystemDynamicObjectTrackingPropertiesBD(address, container);
    }

    /**
     * Creates a {@code XrSystemDynamicObjectTrackingPropertiesBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemDynamicObjectTrackingPropertiesBD(ByteBuffer container) {
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
    /** @return the value of the {@code supportsDynamicObjectTracking} field. */
    @NativeType("XrBool32")
    public boolean supportsDynamicObjectTracking() { return nsupportsDynamicObjectTracking(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemDynamicObjectTrackingPropertiesBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDDynamicObjectTracking#XR_TYPE_SYSTEM_DYNAMIC_OBJECT_TRACKING_PROPERTIES_BD TYPE_SYSTEM_DYNAMIC_OBJECT_TRACKING_PROPERTIES_BD} value to the {@code type} field. */
    public XrSystemDynamicObjectTrackingPropertiesBD type$Default() { return type(BDDynamicObjectTracking.XR_TYPE_SYSTEM_DYNAMIC_OBJECT_TRACKING_PROPERTIES_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemDynamicObjectTrackingPropertiesBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemDynamicObjectTrackingPropertiesBD set(
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
    public XrSystemDynamicObjectTrackingPropertiesBD set(XrSystemDynamicObjectTrackingPropertiesBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemDynamicObjectTrackingPropertiesBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemDynamicObjectTrackingPropertiesBD malloc() {
        return new XrSystemDynamicObjectTrackingPropertiesBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemDynamicObjectTrackingPropertiesBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemDynamicObjectTrackingPropertiesBD calloc() {
        return new XrSystemDynamicObjectTrackingPropertiesBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemDynamicObjectTrackingPropertiesBD} instance allocated with {@link BufferUtils}. */
    public static XrSystemDynamicObjectTrackingPropertiesBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemDynamicObjectTrackingPropertiesBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemDynamicObjectTrackingPropertiesBD} instance for the specified memory address. */
    public static XrSystemDynamicObjectTrackingPropertiesBD create(long address) {
        return new XrSystemDynamicObjectTrackingPropertiesBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemDynamicObjectTrackingPropertiesBD createSafe(long address) {
        return address == NULL ? null : new XrSystemDynamicObjectTrackingPropertiesBD(address, null);
    }

    /**
     * Returns a new {@link XrSystemDynamicObjectTrackingPropertiesBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemDynamicObjectTrackingPropertiesBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemDynamicObjectTrackingPropertiesBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemDynamicObjectTrackingPropertiesBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemDynamicObjectTrackingPropertiesBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemDynamicObjectTrackingPropertiesBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemDynamicObjectTrackingPropertiesBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemDynamicObjectTrackingPropertiesBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemDynamicObjectTrackingPropertiesBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemDynamicObjectTrackingPropertiesBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemDynamicObjectTrackingPropertiesBD malloc(MemoryStack stack) {
        return new XrSystemDynamicObjectTrackingPropertiesBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemDynamicObjectTrackingPropertiesBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemDynamicObjectTrackingPropertiesBD calloc(MemoryStack stack) {
        return new XrSystemDynamicObjectTrackingPropertiesBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemDynamicObjectTrackingPropertiesBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemDynamicObjectTrackingPropertiesBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemDynamicObjectTrackingPropertiesBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemDynamicObjectTrackingPropertiesBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemDynamicObjectTrackingPropertiesBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemDynamicObjectTrackingPropertiesBD.NEXT); }
    /** Unsafe version of {@link #supportsDynamicObjectTracking}. */
    public static int nsupportsDynamicObjectTracking(long struct) { return memGetInt(struct + XrSystemDynamicObjectTrackingPropertiesBD.SUPPORTSDYNAMICOBJECTTRACKING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemDynamicObjectTrackingPropertiesBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemDynamicObjectTrackingPropertiesBD.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemDynamicObjectTrackingPropertiesBD} structs. */
    public static class Buffer extends StructBuffer<XrSystemDynamicObjectTrackingPropertiesBD, Buffer> implements NativeResource {

        private static final XrSystemDynamicObjectTrackingPropertiesBD ELEMENT_FACTORY = XrSystemDynamicObjectTrackingPropertiesBD.create(-1L);

        /**
         * Creates a new {@code XrSystemDynamicObjectTrackingPropertiesBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemDynamicObjectTrackingPropertiesBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemDynamicObjectTrackingPropertiesBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemDynamicObjectTrackingPropertiesBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemDynamicObjectTrackingPropertiesBD.nnext(address()); }
        /** @return the value of the {@code supportsDynamicObjectTracking} field. */
        @NativeType("XrBool32")
        public boolean supportsDynamicObjectTracking() { return XrSystemDynamicObjectTrackingPropertiesBD.nsupportsDynamicObjectTracking(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemDynamicObjectTrackingPropertiesBD.Buffer type(@NativeType("XrStructureType") int value) { XrSystemDynamicObjectTrackingPropertiesBD.ntype(address(), value); return this; }
        /** Sets the {@link BDDynamicObjectTracking#XR_TYPE_SYSTEM_DYNAMIC_OBJECT_TRACKING_PROPERTIES_BD TYPE_SYSTEM_DYNAMIC_OBJECT_TRACKING_PROPERTIES_BD} value to the {@code type} field. */
        public XrSystemDynamicObjectTrackingPropertiesBD.Buffer type$Default() { return type(BDDynamicObjectTracking.XR_TYPE_SYSTEM_DYNAMIC_OBJECT_TRACKING_PROPERTIES_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemDynamicObjectTrackingPropertiesBD.Buffer next(@NativeType("void *") long value) { XrSystemDynamicObjectTrackingPropertiesBD.nnext(address(), value); return this; }

    }

}
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
 * struct XrSystemSpatialAnchorSharingPropertiesBD {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsSpatialAnchorSharing;
 * }}</pre>
 */
public class XrSystemSpatialAnchorSharingPropertiesBD extends Struct<XrSystemSpatialAnchorSharingPropertiesBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSSPATIALANCHORSHARING;

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
        SUPPORTSSPATIALANCHORSHARING = layout.offsetof(2);
    }

    protected XrSystemSpatialAnchorSharingPropertiesBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemSpatialAnchorSharingPropertiesBD create(long address, @Nullable ByteBuffer container) {
        return new XrSystemSpatialAnchorSharingPropertiesBD(address, container);
    }

    /**
     * Creates a {@code XrSystemSpatialAnchorSharingPropertiesBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemSpatialAnchorSharingPropertiesBD(ByteBuffer container) {
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
    /** @return the value of the {@code supportsSpatialAnchorSharing} field. */
    @NativeType("XrBool32")
    public boolean supportsSpatialAnchorSharing() { return nsupportsSpatialAnchorSharing(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemSpatialAnchorSharingPropertiesBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialAnchorSharing#XR_TYPE_SYSTEM_SPATIAL_ANCHOR_SHARING_PROPERTIES_BD TYPE_SYSTEM_SPATIAL_ANCHOR_SHARING_PROPERTIES_BD} value to the {@code type} field. */
    public XrSystemSpatialAnchorSharingPropertiesBD type$Default() { return type(BDSpatialAnchorSharing.XR_TYPE_SYSTEM_SPATIAL_ANCHOR_SHARING_PROPERTIES_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemSpatialAnchorSharingPropertiesBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemSpatialAnchorSharingPropertiesBD set(
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
    public XrSystemSpatialAnchorSharingPropertiesBD set(XrSystemSpatialAnchorSharingPropertiesBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemSpatialAnchorSharingPropertiesBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemSpatialAnchorSharingPropertiesBD malloc() {
        return new XrSystemSpatialAnchorSharingPropertiesBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemSpatialAnchorSharingPropertiesBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemSpatialAnchorSharingPropertiesBD calloc() {
        return new XrSystemSpatialAnchorSharingPropertiesBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemSpatialAnchorSharingPropertiesBD} instance allocated with {@link BufferUtils}. */
    public static XrSystemSpatialAnchorSharingPropertiesBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemSpatialAnchorSharingPropertiesBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemSpatialAnchorSharingPropertiesBD} instance for the specified memory address. */
    public static XrSystemSpatialAnchorSharingPropertiesBD create(long address) {
        return new XrSystemSpatialAnchorSharingPropertiesBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemSpatialAnchorSharingPropertiesBD createSafe(long address) {
        return address == NULL ? null : new XrSystemSpatialAnchorSharingPropertiesBD(address, null);
    }

    /**
     * Returns a new {@link XrSystemSpatialAnchorSharingPropertiesBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialAnchorSharingPropertiesBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemSpatialAnchorSharingPropertiesBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialAnchorSharingPropertiesBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemSpatialAnchorSharingPropertiesBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialAnchorSharingPropertiesBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemSpatialAnchorSharingPropertiesBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialAnchorSharingPropertiesBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemSpatialAnchorSharingPropertiesBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemSpatialAnchorSharingPropertiesBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemSpatialAnchorSharingPropertiesBD malloc(MemoryStack stack) {
        return new XrSystemSpatialAnchorSharingPropertiesBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemSpatialAnchorSharingPropertiesBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemSpatialAnchorSharingPropertiesBD calloc(MemoryStack stack) {
        return new XrSystemSpatialAnchorSharingPropertiesBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemSpatialAnchorSharingPropertiesBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialAnchorSharingPropertiesBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemSpatialAnchorSharingPropertiesBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemSpatialAnchorSharingPropertiesBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemSpatialAnchorSharingPropertiesBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemSpatialAnchorSharingPropertiesBD.NEXT); }
    /** Unsafe version of {@link #supportsSpatialAnchorSharing}. */
    public static int nsupportsSpatialAnchorSharing(long struct) { return memGetInt(struct + XrSystemSpatialAnchorSharingPropertiesBD.SUPPORTSSPATIALANCHORSHARING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemSpatialAnchorSharingPropertiesBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemSpatialAnchorSharingPropertiesBD.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemSpatialAnchorSharingPropertiesBD} structs. */
    public static class Buffer extends StructBuffer<XrSystemSpatialAnchorSharingPropertiesBD, Buffer> implements NativeResource {

        private static final XrSystemSpatialAnchorSharingPropertiesBD ELEMENT_FACTORY = XrSystemSpatialAnchorSharingPropertiesBD.create(-1L);

        /**
         * Creates a new {@code XrSystemSpatialAnchorSharingPropertiesBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemSpatialAnchorSharingPropertiesBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemSpatialAnchorSharingPropertiesBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemSpatialAnchorSharingPropertiesBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemSpatialAnchorSharingPropertiesBD.nnext(address()); }
        /** @return the value of the {@code supportsSpatialAnchorSharing} field. */
        @NativeType("XrBool32")
        public boolean supportsSpatialAnchorSharing() { return XrSystemSpatialAnchorSharingPropertiesBD.nsupportsSpatialAnchorSharing(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemSpatialAnchorSharingPropertiesBD.Buffer type(@NativeType("XrStructureType") int value) { XrSystemSpatialAnchorSharingPropertiesBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialAnchorSharing#XR_TYPE_SYSTEM_SPATIAL_ANCHOR_SHARING_PROPERTIES_BD TYPE_SYSTEM_SPATIAL_ANCHOR_SHARING_PROPERTIES_BD} value to the {@code type} field. */
        public XrSystemSpatialAnchorSharingPropertiesBD.Buffer type$Default() { return type(BDSpatialAnchorSharing.XR_TYPE_SYSTEM_SPATIAL_ANCHOR_SHARING_PROPERTIES_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemSpatialAnchorSharingPropertiesBD.Buffer next(@NativeType("void *") long value) { XrSystemSpatialAnchorSharingPropertiesBD.nnext(address(), value); return this; }

    }

}
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
 * struct XrSpatialAnchorParentANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpatialEntityIdEXT parentId;
 * }}</pre>
 */
public class XrSpatialAnchorParentANDROID extends Struct<XrSpatialAnchorParentANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PARENTID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        PARENTID = layout.offsetof(2);
    }

    protected XrSpatialAnchorParentANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorParentANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorParentANDROID(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorParentANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorParentANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code parentId} field. */
    @NativeType("XrSpatialEntityIdEXT")
    public long parentId() { return nparentId(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialAnchorParentANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDSpatialEntityBoundAnchor#XR_TYPE_SPATIAL_ANCHOR_PARENT_ANDROID TYPE_SPATIAL_ANCHOR_PARENT_ANDROID} value to the {@code type} field. */
    public XrSpatialAnchorParentANDROID type$Default() { return type(ANDROIDSpatialEntityBoundAnchor.XR_TYPE_SPATIAL_ANCHOR_PARENT_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialAnchorParentANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code parentId} field. */
    public XrSpatialAnchorParentANDROID parentId(@NativeType("XrSpatialEntityIdEXT") long value) { nparentId(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorParentANDROID set(
        int type,
        long next,
        long parentId
    ) {
        type(type);
        next(next);
        parentId(parentId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialAnchorParentANDROID set(XrSpatialAnchorParentANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorParentANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorParentANDROID malloc() {
        return new XrSpatialAnchorParentANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorParentANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorParentANDROID calloc() {
        return new XrSpatialAnchorParentANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorParentANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorParentANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorParentANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorParentANDROID} instance for the specified memory address. */
    public static XrSpatialAnchorParentANDROID create(long address) {
        return new XrSpatialAnchorParentANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorParentANDROID createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorParentANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorParentANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorParentANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorParentANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorParentANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorParentANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorParentANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorParentANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorParentANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorParentANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialAnchorParentANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorParentANDROID malloc(MemoryStack stack) {
        return new XrSpatialAnchorParentANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorParentANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorParentANDROID calloc(MemoryStack stack) {
        return new XrSpatialAnchorParentANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorParentANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorParentANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorParentANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorParentANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialAnchorParentANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorParentANDROID.NEXT); }
    /** Unsafe version of {@link #parentId}. */
    public static long nparentId(long struct) { return memGetLong(struct + XrSpatialAnchorParentANDROID.PARENTID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialAnchorParentANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorParentANDROID.NEXT, value); }
    /** Unsafe version of {@link #parentId(long) parentId}. */
    public static void nparentId(long struct, long value) { memPutLong(struct + XrSpatialAnchorParentANDROID.PARENTID, value); }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorParentANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorParentANDROID, Buffer> implements NativeResource {

        private static final XrSpatialAnchorParentANDROID ELEMENT_FACTORY = XrSpatialAnchorParentANDROID.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorParentANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorParentANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorParentANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorParentANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialAnchorParentANDROID.nnext(address()); }
        /** @return the value of the {@code parentId} field. */
        @NativeType("XrSpatialEntityIdEXT")
        public long parentId() { return XrSpatialAnchorParentANDROID.nparentId(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialAnchorParentANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorParentANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDSpatialEntityBoundAnchor#XR_TYPE_SPATIAL_ANCHOR_PARENT_ANDROID TYPE_SPATIAL_ANCHOR_PARENT_ANDROID} value to the {@code type} field. */
        public XrSpatialAnchorParentANDROID.Buffer type$Default() { return type(ANDROIDSpatialEntityBoundAnchor.XR_TYPE_SPATIAL_ANCHOR_PARENT_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialAnchorParentANDROID.Buffer next(@NativeType("void const *") long value) { XrSpatialAnchorParentANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code parentId} field. */
        public XrSpatialAnchorParentANDROID.Buffer parentId(@NativeType("XrSpatialEntityIdEXT") long value) { XrSpatialAnchorParentANDROID.nparentId(address(), value); return this; }

    }

}
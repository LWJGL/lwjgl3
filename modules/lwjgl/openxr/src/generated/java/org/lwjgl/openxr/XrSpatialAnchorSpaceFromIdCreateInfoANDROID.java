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
 * struct XrSpatialAnchorSpaceFromIdCreateInfoANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpatialEntityIdEXT anchorEntityId;
 * }}</pre>
 */
public class XrSpatialAnchorSpaceFromIdCreateInfoANDROID extends Struct<XrSpatialAnchorSpaceFromIdCreateInfoANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ANCHORENTITYID;

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
        ANCHORENTITYID = layout.offsetof(2);
    }

    protected XrSpatialAnchorSpaceFromIdCreateInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorSpaceFromIdCreateInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorSpaceFromIdCreateInfoANDROID(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorSpaceFromIdCreateInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorSpaceFromIdCreateInfoANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code anchorEntityId} field. */
    @NativeType("XrSpatialEntityIdEXT")
    public long anchorEntityId() { return nanchorEntityId(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialAnchorSpaceFromIdCreateInfoANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDSpatialAnchorSpace#XR_TYPE_SPATIAL_ANCHOR_SPACE_FROM_ID_CREATE_INFO_ANDROID TYPE_SPATIAL_ANCHOR_SPACE_FROM_ID_CREATE_INFO_ANDROID} value to the {@code type} field. */
    public XrSpatialAnchorSpaceFromIdCreateInfoANDROID type$Default() { return type(ANDROIDSpatialAnchorSpace.XR_TYPE_SPATIAL_ANCHOR_SPACE_FROM_ID_CREATE_INFO_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialAnchorSpaceFromIdCreateInfoANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code anchorEntityId} field. */
    public XrSpatialAnchorSpaceFromIdCreateInfoANDROID anchorEntityId(@NativeType("XrSpatialEntityIdEXT") long value) { nanchorEntityId(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorSpaceFromIdCreateInfoANDROID set(
        int type,
        long next,
        long anchorEntityId
    ) {
        type(type);
        next(next);
        anchorEntityId(anchorEntityId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialAnchorSpaceFromIdCreateInfoANDROID set(XrSpatialAnchorSpaceFromIdCreateInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorSpaceFromIdCreateInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorSpaceFromIdCreateInfoANDROID malloc() {
        return new XrSpatialAnchorSpaceFromIdCreateInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorSpaceFromIdCreateInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorSpaceFromIdCreateInfoANDROID calloc() {
        return new XrSpatialAnchorSpaceFromIdCreateInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorSpaceFromIdCreateInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorSpaceFromIdCreateInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorSpaceFromIdCreateInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorSpaceFromIdCreateInfoANDROID} instance for the specified memory address. */
    public static XrSpatialAnchorSpaceFromIdCreateInfoANDROID create(long address) {
        return new XrSpatialAnchorSpaceFromIdCreateInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorSpaceFromIdCreateInfoANDROID createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorSpaceFromIdCreateInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorSpaceFromIdCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorSpaceFromIdCreateInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorSpaceFromIdCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorSpaceFromIdCreateInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorSpaceFromIdCreateInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorSpaceFromIdCreateInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorSpaceFromIdCreateInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorSpaceFromIdCreateInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorSpaceFromIdCreateInfoANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialAnchorSpaceFromIdCreateInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorSpaceFromIdCreateInfoANDROID malloc(MemoryStack stack) {
        return new XrSpatialAnchorSpaceFromIdCreateInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorSpaceFromIdCreateInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorSpaceFromIdCreateInfoANDROID calloc(MemoryStack stack) {
        return new XrSpatialAnchorSpaceFromIdCreateInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorSpaceFromIdCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorSpaceFromIdCreateInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorSpaceFromIdCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorSpaceFromIdCreateInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialAnchorSpaceFromIdCreateInfoANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorSpaceFromIdCreateInfoANDROID.NEXT); }
    /** Unsafe version of {@link #anchorEntityId}. */
    public static long nanchorEntityId(long struct) { return memGetLong(struct + XrSpatialAnchorSpaceFromIdCreateInfoANDROID.ANCHORENTITYID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialAnchorSpaceFromIdCreateInfoANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorSpaceFromIdCreateInfoANDROID.NEXT, value); }
    /** Unsafe version of {@link #anchorEntityId(long) anchorEntityId}. */
    public static void nanchorEntityId(long struct, long value) { memPutLong(struct + XrSpatialAnchorSpaceFromIdCreateInfoANDROID.ANCHORENTITYID, value); }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorSpaceFromIdCreateInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorSpaceFromIdCreateInfoANDROID, Buffer> implements NativeResource {

        private static final XrSpatialAnchorSpaceFromIdCreateInfoANDROID ELEMENT_FACTORY = XrSpatialAnchorSpaceFromIdCreateInfoANDROID.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorSpaceFromIdCreateInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorSpaceFromIdCreateInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorSpaceFromIdCreateInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorSpaceFromIdCreateInfoANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialAnchorSpaceFromIdCreateInfoANDROID.nnext(address()); }
        /** @return the value of the {@code anchorEntityId} field. */
        @NativeType("XrSpatialEntityIdEXT")
        public long anchorEntityId() { return XrSpatialAnchorSpaceFromIdCreateInfoANDROID.nanchorEntityId(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialAnchorSpaceFromIdCreateInfoANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorSpaceFromIdCreateInfoANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDSpatialAnchorSpace#XR_TYPE_SPATIAL_ANCHOR_SPACE_FROM_ID_CREATE_INFO_ANDROID TYPE_SPATIAL_ANCHOR_SPACE_FROM_ID_CREATE_INFO_ANDROID} value to the {@code type} field. */
        public XrSpatialAnchorSpaceFromIdCreateInfoANDROID.Buffer type$Default() { return type(ANDROIDSpatialAnchorSpace.XR_TYPE_SPATIAL_ANCHOR_SPACE_FROM_ID_CREATE_INFO_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialAnchorSpaceFromIdCreateInfoANDROID.Buffer next(@NativeType("void const *") long value) { XrSpatialAnchorSpaceFromIdCreateInfoANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code anchorEntityId} field. */
        public XrSpatialAnchorSpaceFromIdCreateInfoANDROID.Buffer anchorEntityId(@NativeType("XrSpatialEntityIdEXT") long value) { XrSpatialAnchorSpaceFromIdCreateInfoANDROID.nanchorEntityId(address(), value); return this; }

    }

}
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
 * struct XrSpatialFilterTrackingStateEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpatialEntityTrackingStateEXT trackingState;
 * }}</pre>
 */
public class XrSpatialFilterTrackingStateEXT extends Struct<XrSpatialFilterTrackingStateEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TRACKINGSTATE;

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
        TRACKINGSTATE = layout.offsetof(2);
    }

    protected XrSpatialFilterTrackingStateEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialFilterTrackingStateEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialFilterTrackingStateEXT(address, container);
    }

    /**
     * Creates a {@code XrSpatialFilterTrackingStateEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialFilterTrackingStateEXT(ByteBuffer container) {
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
    /** @return the value of the {@code trackingState} field. */
    @NativeType("XrSpatialEntityTrackingStateEXT")
    public int trackingState() { return ntrackingState(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialFilterTrackingStateEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialEntity#XR_TYPE_SPATIAL_FILTER_TRACKING_STATE_EXT TYPE_SPATIAL_FILTER_TRACKING_STATE_EXT} value to the {@code type} field. */
    public XrSpatialFilterTrackingStateEXT type$Default() { return type(EXTSpatialEntity.XR_TYPE_SPATIAL_FILTER_TRACKING_STATE_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialFilterTrackingStateEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code trackingState} field. */
    public XrSpatialFilterTrackingStateEXT trackingState(@NativeType("XrSpatialEntityTrackingStateEXT") int value) { ntrackingState(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialFilterTrackingStateEXT set(
        int type,
        long next,
        int trackingState
    ) {
        type(type);
        next(next);
        trackingState(trackingState);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialFilterTrackingStateEXT set(XrSpatialFilterTrackingStateEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialFilterTrackingStateEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialFilterTrackingStateEXT malloc() {
        return new XrSpatialFilterTrackingStateEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialFilterTrackingStateEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialFilterTrackingStateEXT calloc() {
        return new XrSpatialFilterTrackingStateEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialFilterTrackingStateEXT} instance allocated with {@link BufferUtils}. */
    public static XrSpatialFilterTrackingStateEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialFilterTrackingStateEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialFilterTrackingStateEXT} instance for the specified memory address. */
    public static XrSpatialFilterTrackingStateEXT create(long address) {
        return new XrSpatialFilterTrackingStateEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialFilterTrackingStateEXT createSafe(long address) {
        return address == NULL ? null : new XrSpatialFilterTrackingStateEXT(address, null);
    }

    /**
     * Returns a new {@link XrSpatialFilterTrackingStateEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialFilterTrackingStateEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialFilterTrackingStateEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialFilterTrackingStateEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialFilterTrackingStateEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialFilterTrackingStateEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialFilterTrackingStateEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialFilterTrackingStateEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialFilterTrackingStateEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialFilterTrackingStateEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialFilterTrackingStateEXT malloc(MemoryStack stack) {
        return new XrSpatialFilterTrackingStateEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialFilterTrackingStateEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialFilterTrackingStateEXT calloc(MemoryStack stack) {
        return new XrSpatialFilterTrackingStateEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialFilterTrackingStateEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialFilterTrackingStateEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialFilterTrackingStateEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialFilterTrackingStateEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialFilterTrackingStateEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialFilterTrackingStateEXT.NEXT); }
    /** Unsafe version of {@link #trackingState}. */
    public static int ntrackingState(long struct) { return memGetInt(struct + XrSpatialFilterTrackingStateEXT.TRACKINGSTATE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialFilterTrackingStateEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialFilterTrackingStateEXT.NEXT, value); }
    /** Unsafe version of {@link #trackingState(int) trackingState}. */
    public static void ntrackingState(long struct, int value) { memPutInt(struct + XrSpatialFilterTrackingStateEXT.TRACKINGSTATE, value); }

    // -----------------------------------

    /** An array of {@link XrSpatialFilterTrackingStateEXT} structs. */
    public static class Buffer extends StructBuffer<XrSpatialFilterTrackingStateEXT, Buffer> implements NativeResource {

        private static final XrSpatialFilterTrackingStateEXT ELEMENT_FACTORY = XrSpatialFilterTrackingStateEXT.create(-1L);

        /**
         * Creates a new {@code XrSpatialFilterTrackingStateEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialFilterTrackingStateEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialFilterTrackingStateEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialFilterTrackingStateEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialFilterTrackingStateEXT.nnext(address()); }
        /** @return the value of the {@code trackingState} field. */
        @NativeType("XrSpatialEntityTrackingStateEXT")
        public int trackingState() { return XrSpatialFilterTrackingStateEXT.ntrackingState(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialFilterTrackingStateEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialFilterTrackingStateEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialEntity#XR_TYPE_SPATIAL_FILTER_TRACKING_STATE_EXT TYPE_SPATIAL_FILTER_TRACKING_STATE_EXT} value to the {@code type} field. */
        public XrSpatialFilterTrackingStateEXT.Buffer type$Default() { return type(EXTSpatialEntity.XR_TYPE_SPATIAL_FILTER_TRACKING_STATE_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialFilterTrackingStateEXT.Buffer next(@NativeType("void const *") long value) { XrSpatialFilterTrackingStateEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code trackingState} field. */
        public XrSpatialFilterTrackingStateEXT.Buffer trackingState(@NativeType("XrSpatialEntityTrackingStateEXT") int value) { XrSpatialFilterTrackingStateEXT.ntrackingState(address(), value); return this; }

    }

}
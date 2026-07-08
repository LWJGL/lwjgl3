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
 * struct XrEventDataGeospatialTrackerStateChangedANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrGeospatialTrackerANDROID geospatialTracker;
 *     XrGeospatialTrackerStateANDROID state;
 *     XrResult initializationResult;
 *     XrTime time;
 * }}</pre>
 */
public class XrEventDataGeospatialTrackerStateChangedANDROID extends Struct<XrEventDataGeospatialTrackerStateChangedANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        GEOSPATIALTRACKER,
        STATE,
        INITIALIZATIONRESULT,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        GEOSPATIALTRACKER = layout.offsetof(2);
        STATE = layout.offsetof(3);
        INITIALIZATIONRESULT = layout.offsetof(4);
        TIME = layout.offsetof(5);
    }

    protected XrEventDataGeospatialTrackerStateChangedANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataGeospatialTrackerStateChangedANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataGeospatialTrackerStateChangedANDROID(address, container);
    }

    /**
     * Creates a {@code XrEventDataGeospatialTrackerStateChangedANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataGeospatialTrackerStateChangedANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code geospatialTracker} field. */
    @NativeType("XrGeospatialTrackerANDROID")
    public long geospatialTracker() { return ngeospatialTracker(address()); }
    /** @return the value of the {@code state} field. */
    @NativeType("XrGeospatialTrackerStateANDROID")
    public int state() { return nstate(address()); }
    /** @return the value of the {@code initializationResult} field. */
    @NativeType("XrResult")
    public int initializationResult() { return ninitializationResult(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataGeospatialTrackerStateChangedANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDGeospatial#XR_TYPE_EVENT_DATA_GEOSPATIAL_TRACKER_STATE_CHANGED_ANDROID TYPE_EVENT_DATA_GEOSPATIAL_TRACKER_STATE_CHANGED_ANDROID} value to the {@code type} field. */
    public XrEventDataGeospatialTrackerStateChangedANDROID type$Default() { return type(ANDROIDGeospatial.XR_TYPE_EVENT_DATA_GEOSPATIAL_TRACKER_STATE_CHANGED_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataGeospatialTrackerStateChangedANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataGeospatialTrackerStateChangedANDROID set(
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
    public XrEventDataGeospatialTrackerStateChangedANDROID set(XrEventDataGeospatialTrackerStateChangedANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataGeospatialTrackerStateChangedANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataGeospatialTrackerStateChangedANDROID malloc() {
        return new XrEventDataGeospatialTrackerStateChangedANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataGeospatialTrackerStateChangedANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataGeospatialTrackerStateChangedANDROID calloc() {
        return new XrEventDataGeospatialTrackerStateChangedANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataGeospatialTrackerStateChangedANDROID} instance allocated with {@link BufferUtils}. */
    public static XrEventDataGeospatialTrackerStateChangedANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataGeospatialTrackerStateChangedANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataGeospatialTrackerStateChangedANDROID} instance for the specified memory address. */
    public static XrEventDataGeospatialTrackerStateChangedANDROID create(long address) {
        return new XrEventDataGeospatialTrackerStateChangedANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataGeospatialTrackerStateChangedANDROID createSafe(long address) {
        return address == NULL ? null : new XrEventDataGeospatialTrackerStateChangedANDROID(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataGeospatialTrackerStateChangedANDROID}. */
    public static XrEventDataGeospatialTrackerStateChangedANDROID create(XrEventDataBaseHeader value) {
        return new XrEventDataGeospatialTrackerStateChangedANDROID(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataGeospatialTrackerStateChangedANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataGeospatialTrackerStateChangedANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataGeospatialTrackerStateChangedANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataGeospatialTrackerStateChangedANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataGeospatialTrackerStateChangedANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataGeospatialTrackerStateChangedANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataGeospatialTrackerStateChangedANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataGeospatialTrackerStateChangedANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataGeospatialTrackerStateChangedANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataGeospatialTrackerStateChangedANDROID.Buffer}. */
    public static XrEventDataGeospatialTrackerStateChangedANDROID.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataGeospatialTrackerStateChangedANDROID.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataGeospatialTrackerStateChangedANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataGeospatialTrackerStateChangedANDROID malloc(MemoryStack stack) {
        return new XrEventDataGeospatialTrackerStateChangedANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataGeospatialTrackerStateChangedANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataGeospatialTrackerStateChangedANDROID calloc(MemoryStack stack) {
        return new XrEventDataGeospatialTrackerStateChangedANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataGeospatialTrackerStateChangedANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataGeospatialTrackerStateChangedANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataGeospatialTrackerStateChangedANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataGeospatialTrackerStateChangedANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataGeospatialTrackerStateChangedANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataGeospatialTrackerStateChangedANDROID.NEXT); }
    /** Unsafe version of {@link #geospatialTracker}. */
    public static long ngeospatialTracker(long struct) { return memGetAddress(struct + XrEventDataGeospatialTrackerStateChangedANDROID.GEOSPATIALTRACKER); }
    /** Unsafe version of {@link #state}. */
    public static int nstate(long struct) { return memGetInt(struct + XrEventDataGeospatialTrackerStateChangedANDROID.STATE); }
    /** Unsafe version of {@link #initializationResult}. */
    public static int ninitializationResult(long struct) { return memGetInt(struct + XrEventDataGeospatialTrackerStateChangedANDROID.INITIALIZATIONRESULT); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrEventDataGeospatialTrackerStateChangedANDROID.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataGeospatialTrackerStateChangedANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataGeospatialTrackerStateChangedANDROID.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataGeospatialTrackerStateChangedANDROID} structs. */
    public static class Buffer extends StructBuffer<XrEventDataGeospatialTrackerStateChangedANDROID, Buffer> implements NativeResource {

        private static final XrEventDataGeospatialTrackerStateChangedANDROID ELEMENT_FACTORY = XrEventDataGeospatialTrackerStateChangedANDROID.create(-1L);

        /**
         * Creates a new {@code XrEventDataGeospatialTrackerStateChangedANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataGeospatialTrackerStateChangedANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataGeospatialTrackerStateChangedANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataGeospatialTrackerStateChangedANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataGeospatialTrackerStateChangedANDROID.nnext(address()); }
        /** @return the value of the {@code geospatialTracker} field. */
        @NativeType("XrGeospatialTrackerANDROID")
        public long geospatialTracker() { return XrEventDataGeospatialTrackerStateChangedANDROID.ngeospatialTracker(address()); }
        /** @return the value of the {@code state} field. */
        @NativeType("XrGeospatialTrackerStateANDROID")
        public int state() { return XrEventDataGeospatialTrackerStateChangedANDROID.nstate(address()); }
        /** @return the value of the {@code initializationResult} field. */
        @NativeType("XrResult")
        public int initializationResult() { return XrEventDataGeospatialTrackerStateChangedANDROID.ninitializationResult(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrEventDataGeospatialTrackerStateChangedANDROID.ntime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataGeospatialTrackerStateChangedANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataGeospatialTrackerStateChangedANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDGeospatial#XR_TYPE_EVENT_DATA_GEOSPATIAL_TRACKER_STATE_CHANGED_ANDROID TYPE_EVENT_DATA_GEOSPATIAL_TRACKER_STATE_CHANGED_ANDROID} value to the {@code type} field. */
        public XrEventDataGeospatialTrackerStateChangedANDROID.Buffer type$Default() { return type(ANDROIDGeospatial.XR_TYPE_EVENT_DATA_GEOSPATIAL_TRACKER_STATE_CHANGED_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataGeospatialTrackerStateChangedANDROID.Buffer next(@NativeType("void const *") long value) { XrEventDataGeospatialTrackerStateChangedANDROID.nnext(address(), value); return this; }

    }

}
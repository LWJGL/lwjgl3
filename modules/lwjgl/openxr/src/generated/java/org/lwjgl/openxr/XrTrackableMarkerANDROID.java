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
 * struct XrTrackableMarkerANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrTrackingStateANDROID trackingState;
 *     XrTime lastUpdatedTime;
 *     XrTrackableMarkerDictionaryANDROID dictionary;
 *     int32_t markerId;
 *     {@link XrPosef XrPosef} centerPose;
 *     {@link XrExtent2Df XrExtent2Df} extents;
 * }}</pre>
 */
public class XrTrackableMarkerANDROID extends Struct<XrTrackableMarkerANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TRACKINGSTATE,
        LASTUPDATEDTIME,
        DICTIONARY,
        MARKERID,
        CENTERPOSE,
        EXTENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrExtent2Df.SIZEOF, XrExtent2Df.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        TRACKINGSTATE = layout.offsetof(2);
        LASTUPDATEDTIME = layout.offsetof(3);
        DICTIONARY = layout.offsetof(4);
        MARKERID = layout.offsetof(5);
        CENTERPOSE = layout.offsetof(6);
        EXTENTS = layout.offsetof(7);
    }

    protected XrTrackableMarkerANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrTrackableMarkerANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrTrackableMarkerANDROID(address, container);
    }

    /**
     * Creates a {@code XrTrackableMarkerANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrTrackableMarkerANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code trackingState} field. */
    @NativeType("XrTrackingStateANDROID")
    public int trackingState() { return ntrackingState(address()); }
    /** @return the value of the {@code lastUpdatedTime} field. */
    @NativeType("XrTime")
    public long lastUpdatedTime() { return nlastUpdatedTime(address()); }
    /** @return the value of the {@code dictionary} field. */
    @NativeType("XrTrackableMarkerDictionaryANDROID")
    public int dictionary() { return ndictionary(address()); }
    /** @return the value of the {@code markerId} field. */
    @NativeType("int32_t")
    public int markerId() { return nmarkerId(address()); }
    /** @return a {@link XrPosef} view of the {@code centerPose} field. */
    public XrPosef centerPose() { return ncenterPose(address()); }
    /** @return a {@link XrExtent2Df} view of the {@code extents} field. */
    public XrExtent2Df extents() { return nextents(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrTrackableMarkerANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDTrackablesMarker#XR_TYPE_TRACKABLE_MARKER_ANDROID TYPE_TRACKABLE_MARKER_ANDROID} value to the {@code type} field. */
    public XrTrackableMarkerANDROID type$Default() { return type(ANDROIDTrackablesMarker.XR_TYPE_TRACKABLE_MARKER_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrTrackableMarkerANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code trackingState} field. */
    public XrTrackableMarkerANDROID trackingState(@NativeType("XrTrackingStateANDROID") int value) { ntrackingState(address(), value); return this; }
    /** Sets the specified value to the {@code lastUpdatedTime} field. */
    public XrTrackableMarkerANDROID lastUpdatedTime(@NativeType("XrTime") long value) { nlastUpdatedTime(address(), value); return this; }
    /** Sets the specified value to the {@code dictionary} field. */
    public XrTrackableMarkerANDROID dictionary(@NativeType("XrTrackableMarkerDictionaryANDROID") int value) { ndictionary(address(), value); return this; }
    /** Sets the specified value to the {@code markerId} field. */
    public XrTrackableMarkerANDROID markerId(@NativeType("int32_t") int value) { nmarkerId(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code centerPose} field. */
    public XrTrackableMarkerANDROID centerPose(XrPosef value) { ncenterPose(address(), value); return this; }
    /** Passes the {@code centerPose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrTrackableMarkerANDROID centerPose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(centerPose()); return this; }
    /** Copies the specified {@link XrExtent2Df} to the {@code extents} field. */
    public XrTrackableMarkerANDROID extents(XrExtent2Df value) { nextents(address(), value); return this; }
    /** Passes the {@code extents} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrTrackableMarkerANDROID extents(java.util.function.Consumer<XrExtent2Df> consumer) { consumer.accept(extents()); return this; }

    /** Initializes this struct with the specified values. */
    public XrTrackableMarkerANDROID set(
        int type,
        long next,
        int trackingState,
        long lastUpdatedTime,
        int dictionary,
        int markerId,
        XrPosef centerPose,
        XrExtent2Df extents
    ) {
        type(type);
        next(next);
        trackingState(trackingState);
        lastUpdatedTime(lastUpdatedTime);
        dictionary(dictionary);
        markerId(markerId);
        centerPose(centerPose);
        extents(extents);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrTrackableMarkerANDROID set(XrTrackableMarkerANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrTrackableMarkerANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrTrackableMarkerANDROID malloc() {
        return new XrTrackableMarkerANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableMarkerANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrTrackableMarkerANDROID calloc() {
        return new XrTrackableMarkerANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableMarkerANDROID} instance allocated with {@link BufferUtils}. */
    public static XrTrackableMarkerANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrTrackableMarkerANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrTrackableMarkerANDROID} instance for the specified memory address. */
    public static XrTrackableMarkerANDROID create(long address) {
        return new XrTrackableMarkerANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrTrackableMarkerANDROID createSafe(long address) {
        return address == NULL ? null : new XrTrackableMarkerANDROID(address, null);
    }

    /**
     * Returns a new {@link XrTrackableMarkerANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrTrackableMarkerANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableMarkerANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrTrackableMarkerANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrTrackableMarkerANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrTrackableMarkerANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableMarkerANDROID malloc(MemoryStack stack) {
        return new XrTrackableMarkerANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrTrackableMarkerANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableMarkerANDROID calloc(MemoryStack stack) {
        return new XrTrackableMarkerANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrTrackableMarkerANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableMarkerANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableMarkerANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrTrackableMarkerANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrTrackableMarkerANDROID.NEXT); }
    /** Unsafe version of {@link #trackingState}. */
    public static int ntrackingState(long struct) { return memGetInt(struct + XrTrackableMarkerANDROID.TRACKINGSTATE); }
    /** Unsafe version of {@link #lastUpdatedTime}. */
    public static long nlastUpdatedTime(long struct) { return memGetLong(struct + XrTrackableMarkerANDROID.LASTUPDATEDTIME); }
    /** Unsafe version of {@link #dictionary}. */
    public static int ndictionary(long struct) { return memGetInt(struct + XrTrackableMarkerANDROID.DICTIONARY); }
    /** Unsafe version of {@link #markerId}. */
    public static int nmarkerId(long struct) { return memGetInt(struct + XrTrackableMarkerANDROID.MARKERID); }
    /** Unsafe version of {@link #centerPose}. */
    public static XrPosef ncenterPose(long struct) { return XrPosef.create(struct + XrTrackableMarkerANDROID.CENTERPOSE); }
    /** Unsafe version of {@link #extents}. */
    public static XrExtent2Df nextents(long struct) { return XrExtent2Df.create(struct + XrTrackableMarkerANDROID.EXTENTS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrTrackableMarkerANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrTrackableMarkerANDROID.NEXT, value); }
    /** Unsafe version of {@link #trackingState(int) trackingState}. */
    public static void ntrackingState(long struct, int value) { memPutInt(struct + XrTrackableMarkerANDROID.TRACKINGSTATE, value); }
    /** Unsafe version of {@link #lastUpdatedTime(long) lastUpdatedTime}. */
    public static void nlastUpdatedTime(long struct, long value) { memPutLong(struct + XrTrackableMarkerANDROID.LASTUPDATEDTIME, value); }
    /** Unsafe version of {@link #dictionary(int) dictionary}. */
    public static void ndictionary(long struct, int value) { memPutInt(struct + XrTrackableMarkerANDROID.DICTIONARY, value); }
    /** Unsafe version of {@link #markerId(int) markerId}. */
    public static void nmarkerId(long struct, int value) { memPutInt(struct + XrTrackableMarkerANDROID.MARKERID, value); }
    /** Unsafe version of {@link #centerPose(XrPosef) centerPose}. */
    public static void ncenterPose(long struct, XrPosef value) { memCopy(value.address(), struct + XrTrackableMarkerANDROID.CENTERPOSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #extents(XrExtent2Df) extents}. */
    public static void nextents(long struct, XrExtent2Df value) { memCopy(value.address(), struct + XrTrackableMarkerANDROID.EXTENTS, XrExtent2Df.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrTrackableMarkerANDROID} structs. */
    public static class Buffer extends StructBuffer<XrTrackableMarkerANDROID, Buffer> implements NativeResource {

        private static final XrTrackableMarkerANDROID ELEMENT_FACTORY = XrTrackableMarkerANDROID.create(-1L);

        /**
         * Creates a new {@code XrTrackableMarkerANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrTrackableMarkerANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrTrackableMarkerANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrTrackableMarkerANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrTrackableMarkerANDROID.nnext(address()); }
        /** @return the value of the {@code trackingState} field. */
        @NativeType("XrTrackingStateANDROID")
        public int trackingState() { return XrTrackableMarkerANDROID.ntrackingState(address()); }
        /** @return the value of the {@code lastUpdatedTime} field. */
        @NativeType("XrTime")
        public long lastUpdatedTime() { return XrTrackableMarkerANDROID.nlastUpdatedTime(address()); }
        /** @return the value of the {@code dictionary} field. */
        @NativeType("XrTrackableMarkerDictionaryANDROID")
        public int dictionary() { return XrTrackableMarkerANDROID.ndictionary(address()); }
        /** @return the value of the {@code markerId} field. */
        @NativeType("int32_t")
        public int markerId() { return XrTrackableMarkerANDROID.nmarkerId(address()); }
        /** @return a {@link XrPosef} view of the {@code centerPose} field. */
        public XrPosef centerPose() { return XrTrackableMarkerANDROID.ncenterPose(address()); }
        /** @return a {@link XrExtent2Df} view of the {@code extents} field. */
        public XrExtent2Df extents() { return XrTrackableMarkerANDROID.nextents(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrTrackableMarkerANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrTrackableMarkerANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDTrackablesMarker#XR_TYPE_TRACKABLE_MARKER_ANDROID TYPE_TRACKABLE_MARKER_ANDROID} value to the {@code type} field. */
        public XrTrackableMarkerANDROID.Buffer type$Default() { return type(ANDROIDTrackablesMarker.XR_TYPE_TRACKABLE_MARKER_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrTrackableMarkerANDROID.Buffer next(@NativeType("void *") long value) { XrTrackableMarkerANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code trackingState} field. */
        public XrTrackableMarkerANDROID.Buffer trackingState(@NativeType("XrTrackingStateANDROID") int value) { XrTrackableMarkerANDROID.ntrackingState(address(), value); return this; }
        /** Sets the specified value to the {@code lastUpdatedTime} field. */
        public XrTrackableMarkerANDROID.Buffer lastUpdatedTime(@NativeType("XrTime") long value) { XrTrackableMarkerANDROID.nlastUpdatedTime(address(), value); return this; }
        /** Sets the specified value to the {@code dictionary} field. */
        public XrTrackableMarkerANDROID.Buffer dictionary(@NativeType("XrTrackableMarkerDictionaryANDROID") int value) { XrTrackableMarkerANDROID.ndictionary(address(), value); return this; }
        /** Sets the specified value to the {@code markerId} field. */
        public XrTrackableMarkerANDROID.Buffer markerId(@NativeType("int32_t") int value) { XrTrackableMarkerANDROID.nmarkerId(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code centerPose} field. */
        public XrTrackableMarkerANDROID.Buffer centerPose(XrPosef value) { XrTrackableMarkerANDROID.ncenterPose(address(), value); return this; }
        /** Passes the {@code centerPose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrTrackableMarkerANDROID.Buffer centerPose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(centerPose()); return this; }
        /** Copies the specified {@link XrExtent2Df} to the {@code extents} field. */
        public XrTrackableMarkerANDROID.Buffer extents(XrExtent2Df value) { XrTrackableMarkerANDROID.nextents(address(), value); return this; }
        /** Passes the {@code extents} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrTrackableMarkerANDROID.Buffer extents(java.util.function.Consumer<XrExtent2Df> consumer) { consumer.accept(extents()); return this; }

    }

}
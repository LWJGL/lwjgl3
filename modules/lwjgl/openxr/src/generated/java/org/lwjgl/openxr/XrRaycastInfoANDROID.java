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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrRaycastInfoANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t maxResults;
 *     uint32_t trackerCount;
 *     XrTrackableTrackerANDROID const * trackers;
 *     {@link XrVector3f XrVector3f} origin;
 *     {@link XrVector3f XrVector3f} trajectory;
 *     XrSpace space;
 *     XrTime time;
 * }}</pre>
 */
public class XrRaycastInfoANDROID extends Struct<XrRaycastInfoANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MAXRESULTS,
        TRACKERCOUNT,
        TRACKERS,
        ORIGIN,
        TRAJECTORY,
        SPACE,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        MAXRESULTS = layout.offsetof(2);
        TRACKERCOUNT = layout.offsetof(3);
        TRACKERS = layout.offsetof(4);
        ORIGIN = layout.offsetof(5);
        TRAJECTORY = layout.offsetof(6);
        SPACE = layout.offsetof(7);
        TIME = layout.offsetof(8);
    }

    protected XrRaycastInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRaycastInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrRaycastInfoANDROID(address, container);
    }

    /**
     * Creates a {@code XrRaycastInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRaycastInfoANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code maxResults} field. */
    @NativeType("uint32_t")
    public int maxResults() { return nmaxResults(address()); }
    /** @return the value of the {@code trackerCount} field. */
    @NativeType("uint32_t")
    public int trackerCount() { return ntrackerCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code trackers} field. */
    @NativeType("XrTrackableTrackerANDROID const *")
    public PointerBuffer trackers() { return ntrackers(address()); }
    /** @return a {@link XrVector3f} view of the {@code origin} field. */
    public XrVector3f origin() { return norigin(address()); }
    /** @return a {@link XrVector3f} view of the {@code trajectory} field. */
    public XrVector3f trajectory() { return ntrajectory(address()); }
    /** @return the value of the {@code space} field. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrRaycastInfoANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDRaycast#XR_TYPE_RAYCAST_INFO_ANDROID TYPE_RAYCAST_INFO_ANDROID} value to the {@code type} field. */
    public XrRaycastInfoANDROID type$Default() { return type(ANDROIDRaycast.XR_TYPE_RAYCAST_INFO_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrRaycastInfoANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code maxResults} field. */
    public XrRaycastInfoANDROID maxResults(@NativeType("uint32_t") int value) { nmaxResults(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code trackers} field. */
    public XrRaycastInfoANDROID trackers(@NativeType("XrTrackableTrackerANDROID const *") PointerBuffer value) { ntrackers(address(), value); return this; }
    /** Copies the specified {@link XrVector3f} to the {@code origin} field. */
    public XrRaycastInfoANDROID origin(XrVector3f value) { norigin(address(), value); return this; }
    /** Passes the {@code origin} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrRaycastInfoANDROID origin(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(origin()); return this; }
    /** Copies the specified {@link XrVector3f} to the {@code trajectory} field. */
    public XrRaycastInfoANDROID trajectory(XrVector3f value) { ntrajectory(address(), value); return this; }
    /** Passes the {@code trajectory} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrRaycastInfoANDROID trajectory(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(trajectory()); return this; }
    /** Sets the specified value to the {@code space} field. */
    public XrRaycastInfoANDROID space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrRaycastInfoANDROID time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRaycastInfoANDROID set(
        int type,
        long next,
        int maxResults,
        PointerBuffer trackers,
        XrVector3f origin,
        XrVector3f trajectory,
        XrSpace space,
        long time
    ) {
        type(type);
        next(next);
        maxResults(maxResults);
        trackers(trackers);
        origin(origin);
        trajectory(trajectory);
        space(space);
        time(time);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRaycastInfoANDROID set(XrRaycastInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRaycastInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRaycastInfoANDROID malloc() {
        return new XrRaycastInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRaycastInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRaycastInfoANDROID calloc() {
        return new XrRaycastInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRaycastInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static XrRaycastInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRaycastInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrRaycastInfoANDROID} instance for the specified memory address. */
    public static XrRaycastInfoANDROID create(long address) {
        return new XrRaycastInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRaycastInfoANDROID createSafe(long address) {
        return address == NULL ? null : new XrRaycastInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link XrRaycastInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRaycastInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRaycastInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRaycastInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRaycastInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRaycastInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRaycastInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRaycastInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRaycastInfoANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRaycastInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRaycastInfoANDROID malloc(MemoryStack stack) {
        return new XrRaycastInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRaycastInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRaycastInfoANDROID calloc(MemoryStack stack) {
        return new XrRaycastInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRaycastInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRaycastInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRaycastInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRaycastInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrRaycastInfoANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRaycastInfoANDROID.NEXT); }
    /** Unsafe version of {@link #maxResults}. */
    public static int nmaxResults(long struct) { return memGetInt(struct + XrRaycastInfoANDROID.MAXRESULTS); }
    /** Unsafe version of {@link #trackerCount}. */
    public static int ntrackerCount(long struct) { return memGetInt(struct + XrRaycastInfoANDROID.TRACKERCOUNT); }
    /** Unsafe version of {@link #trackers() trackers}. */
    public static PointerBuffer ntrackers(long struct) { return memPointerBuffer(memGetAddress(struct + XrRaycastInfoANDROID.TRACKERS), ntrackerCount(struct)); }
    /** Unsafe version of {@link #origin}. */
    public static XrVector3f norigin(long struct) { return XrVector3f.create(struct + XrRaycastInfoANDROID.ORIGIN); }
    /** Unsafe version of {@link #trajectory}. */
    public static XrVector3f ntrajectory(long struct) { return XrVector3f.create(struct + XrRaycastInfoANDROID.TRAJECTORY); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrRaycastInfoANDROID.SPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrRaycastInfoANDROID.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrRaycastInfoANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRaycastInfoANDROID.NEXT, value); }
    /** Unsafe version of {@link #maxResults(int) maxResults}. */
    public static void nmaxResults(long struct, int value) { memPutInt(struct + XrRaycastInfoANDROID.MAXRESULTS, value); }
    /** Sets the specified value to the {@code trackerCount} field of the specified {@code struct}. */
    public static void ntrackerCount(long struct, int value) { memPutInt(struct + XrRaycastInfoANDROID.TRACKERCOUNT, value); }
    /** Unsafe version of {@link #trackers(PointerBuffer) trackers}. */
    public static void ntrackers(long struct, PointerBuffer value) { memPutAddress(struct + XrRaycastInfoANDROID.TRACKERS, memAddress(value)); ntrackerCount(struct, value.remaining()); }
    /** Unsafe version of {@link #origin(XrVector3f) origin}. */
    public static void norigin(long struct, XrVector3f value) { memCopy(value.address(), struct + XrRaycastInfoANDROID.ORIGIN, XrVector3f.SIZEOF); }
    /** Unsafe version of {@link #trajectory(XrVector3f) trajectory}. */
    public static void ntrajectory(long struct, XrVector3f value) { memCopy(value.address(), struct + XrRaycastInfoANDROID.TRAJECTORY, XrVector3f.SIZEOF); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrRaycastInfoANDROID.SPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrRaycastInfoANDROID.TIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrRaycastInfoANDROID.TRACKERS));
        check(memGetAddress(struct + XrRaycastInfoANDROID.SPACE));
    }

    // -----------------------------------

    /** An array of {@link XrRaycastInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<XrRaycastInfoANDROID, Buffer> implements NativeResource {

        private static final XrRaycastInfoANDROID ELEMENT_FACTORY = XrRaycastInfoANDROID.create(-1L);

        /**
         * Creates a new {@code XrRaycastInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRaycastInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRaycastInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRaycastInfoANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrRaycastInfoANDROID.nnext(address()); }
        /** @return the value of the {@code maxResults} field. */
        @NativeType("uint32_t")
        public int maxResults() { return XrRaycastInfoANDROID.nmaxResults(address()); }
        /** @return the value of the {@code trackerCount} field. */
        @NativeType("uint32_t")
        public int trackerCount() { return XrRaycastInfoANDROID.ntrackerCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code trackers} field. */
        @NativeType("XrTrackableTrackerANDROID const *")
        public PointerBuffer trackers() { return XrRaycastInfoANDROID.ntrackers(address()); }
        /** @return a {@link XrVector3f} view of the {@code origin} field. */
        public XrVector3f origin() { return XrRaycastInfoANDROID.norigin(address()); }
        /** @return a {@link XrVector3f} view of the {@code trajectory} field. */
        public XrVector3f trajectory() { return XrRaycastInfoANDROID.ntrajectory(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrRaycastInfoANDROID.nspace(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrRaycastInfoANDROID.ntime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrRaycastInfoANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrRaycastInfoANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDRaycast#XR_TYPE_RAYCAST_INFO_ANDROID TYPE_RAYCAST_INFO_ANDROID} value to the {@code type} field. */
        public XrRaycastInfoANDROID.Buffer type$Default() { return type(ANDROIDRaycast.XR_TYPE_RAYCAST_INFO_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrRaycastInfoANDROID.Buffer next(@NativeType("void const *") long value) { XrRaycastInfoANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code maxResults} field. */
        public XrRaycastInfoANDROID.Buffer maxResults(@NativeType("uint32_t") int value) { XrRaycastInfoANDROID.nmaxResults(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code trackers} field. */
        public XrRaycastInfoANDROID.Buffer trackers(@NativeType("XrTrackableTrackerANDROID const *") PointerBuffer value) { XrRaycastInfoANDROID.ntrackers(address(), value); return this; }
        /** Copies the specified {@link XrVector3f} to the {@code origin} field. */
        public XrRaycastInfoANDROID.Buffer origin(XrVector3f value) { XrRaycastInfoANDROID.norigin(address(), value); return this; }
        /** Passes the {@code origin} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrRaycastInfoANDROID.Buffer origin(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(origin()); return this; }
        /** Copies the specified {@link XrVector3f} to the {@code trajectory} field. */
        public XrRaycastInfoANDROID.Buffer trajectory(XrVector3f value) { XrRaycastInfoANDROID.ntrajectory(address(), value); return this; }
        /** Passes the {@code trajectory} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrRaycastInfoANDROID.Buffer trajectory(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(trajectory()); return this; }
        /** Sets the specified value to the {@code space} field. */
        public XrRaycastInfoANDROID.Buffer space(XrSpace value) { XrRaycastInfoANDROID.nspace(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrRaycastInfoANDROID.Buffer time(@NativeType("XrTime") long value) { XrRaycastInfoANDROID.ntime(address(), value); return this; }

    }

}
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
 * <pre><code>
 * struct XrTrackableImageANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrTrackingStateANDROID trackingState;
 *     XrTime lastUpdatedTime;
 *     XrTrackableImageDatabaseANDROID database;
 *     uint32_t databaseEntryIndex;
 *     {@link XrPosef XrPosef} centerPose;
 *     {@link XrExtent2Df XrExtent2Df} extents;
 * }</code></pre>
 */
public class XrTrackableImageANDROID extends Struct<XrTrackableImageANDROID> implements NativeResource {

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
        DATABASE,
        DATABASEENTRYINDEX,
        CENTERPOSE,
        EXTENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(POINTER_SIZE),
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
        DATABASE = layout.offsetof(4);
        DATABASEENTRYINDEX = layout.offsetof(5);
        CENTERPOSE = layout.offsetof(6);
        EXTENTS = layout.offsetof(7);
    }

    protected XrTrackableImageANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrTrackableImageANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrTrackableImageANDROID(address, container);
    }

    /**
     * Creates a {@code XrTrackableImageANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrTrackableImageANDROID(ByteBuffer container) {
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
    @NativeType("XrTrackingStateANDROID")
    public int trackingState() { return ntrackingState(address()); }
    /** @return the value of the {@code lastUpdatedTime} field. */
    @NativeType("XrTime")
    public long lastUpdatedTime() { return nlastUpdatedTime(address()); }
    /** @return the value of the {@code database} field. */
    @NativeType("XrTrackableImageDatabaseANDROID")
    public long database() { return ndatabase(address()); }
    /** @return the value of the {@code databaseEntryIndex} field. */
    @NativeType("uint32_t")
    public int databaseEntryIndex() { return ndatabaseEntryIndex(address()); }
    /** @return a {@link XrPosef} view of the {@code centerPose} field. */
    public XrPosef centerPose() { return ncenterPose(address()); }
    /** @return a {@link XrExtent2Df} view of the {@code extents} field. */
    public XrExtent2Df extents() { return nextents(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrTrackableImageANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDTrackablesImage#XR_TYPE_TRACKABLE_IMAGE_ANDROID TYPE_TRACKABLE_IMAGE_ANDROID} value to the {@code type} field. */
    public XrTrackableImageANDROID type$Default() { return type(ANDROIDTrackablesImage.XR_TYPE_TRACKABLE_IMAGE_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrTrackableImageANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code trackingState} field. */
    public XrTrackableImageANDROID trackingState(@NativeType("XrTrackingStateANDROID") int value) { ntrackingState(address(), value); return this; }
    /** Sets the specified value to the {@code lastUpdatedTime} field. */
    public XrTrackableImageANDROID lastUpdatedTime(@NativeType("XrTime") long value) { nlastUpdatedTime(address(), value); return this; }
    /** Sets the specified value to the {@code database} field. */
    public XrTrackableImageANDROID database(XrTrackableImageDatabaseANDROID value) { ndatabase(address(), value); return this; }
    /** Sets the specified value to the {@code databaseEntryIndex} field. */
    public XrTrackableImageANDROID databaseEntryIndex(@NativeType("uint32_t") int value) { ndatabaseEntryIndex(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code centerPose} field. */
    public XrTrackableImageANDROID centerPose(XrPosef value) { ncenterPose(address(), value); return this; }
    /** Passes the {@code centerPose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrTrackableImageANDROID centerPose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(centerPose()); return this; }
    /** Copies the specified {@link XrExtent2Df} to the {@code extents} field. */
    public XrTrackableImageANDROID extents(XrExtent2Df value) { nextents(address(), value); return this; }
    /** Passes the {@code extents} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrTrackableImageANDROID extents(java.util.function.Consumer<XrExtent2Df> consumer) { consumer.accept(extents()); return this; }

    /** Initializes this struct with the specified values. */
    public XrTrackableImageANDROID set(
        int type,
        long next,
        int trackingState,
        long lastUpdatedTime,
        XrTrackableImageDatabaseANDROID database,
        int databaseEntryIndex,
        XrPosef centerPose,
        XrExtent2Df extents
    ) {
        type(type);
        next(next);
        trackingState(trackingState);
        lastUpdatedTime(lastUpdatedTime);
        database(database);
        databaseEntryIndex(databaseEntryIndex);
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
    public XrTrackableImageANDROID set(XrTrackableImageANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrTrackableImageANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrTrackableImageANDROID malloc() {
        return new XrTrackableImageANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableImageANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrTrackableImageANDROID calloc() {
        return new XrTrackableImageANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableImageANDROID} instance allocated with {@link BufferUtils}. */
    public static XrTrackableImageANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrTrackableImageANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrTrackableImageANDROID} instance for the specified memory address. */
    public static XrTrackableImageANDROID create(long address) {
        return new XrTrackableImageANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrTrackableImageANDROID createSafe(long address) {
        return address == NULL ? null : new XrTrackableImageANDROID(address, null);
    }

    /**
     * Returns a new {@link XrTrackableImageANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrTrackableImageANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableImageANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrTrackableImageANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrTrackableImageANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrTrackableImageANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableImageANDROID malloc(MemoryStack stack) {
        return new XrTrackableImageANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrTrackableImageANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableImageANDROID calloc(MemoryStack stack) {
        return new XrTrackableImageANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrTrackableImageANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableImageANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableImageANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrTrackableImageANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrTrackableImageANDROID.NEXT); }
    /** Unsafe version of {@link #trackingState}. */
    public static int ntrackingState(long struct) { return memGetInt(struct + XrTrackableImageANDROID.TRACKINGSTATE); }
    /** Unsafe version of {@link #lastUpdatedTime}. */
    public static long nlastUpdatedTime(long struct) { return memGetLong(struct + XrTrackableImageANDROID.LASTUPDATEDTIME); }
    /** Unsafe version of {@link #database}. */
    public static long ndatabase(long struct) { return memGetAddress(struct + XrTrackableImageANDROID.DATABASE); }
    /** Unsafe version of {@link #databaseEntryIndex}. */
    public static int ndatabaseEntryIndex(long struct) { return memGetInt(struct + XrTrackableImageANDROID.DATABASEENTRYINDEX); }
    /** Unsafe version of {@link #centerPose}. */
    public static XrPosef ncenterPose(long struct) { return XrPosef.create(struct + XrTrackableImageANDROID.CENTERPOSE); }
    /** Unsafe version of {@link #extents}. */
    public static XrExtent2Df nextents(long struct) { return XrExtent2Df.create(struct + XrTrackableImageANDROID.EXTENTS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrTrackableImageANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrTrackableImageANDROID.NEXT, value); }
    /** Unsafe version of {@link #trackingState(int) trackingState}. */
    public static void ntrackingState(long struct, int value) { memPutInt(struct + XrTrackableImageANDROID.TRACKINGSTATE, value); }
    /** Unsafe version of {@link #lastUpdatedTime(long) lastUpdatedTime}. */
    public static void nlastUpdatedTime(long struct, long value) { memPutLong(struct + XrTrackableImageANDROID.LASTUPDATEDTIME, value); }
    /** Unsafe version of {@link #database(XrTrackableImageDatabaseANDROID) database}. */
    public static void ndatabase(long struct, XrTrackableImageDatabaseANDROID value) { memPutAddress(struct + XrTrackableImageANDROID.DATABASE, value.address()); }
    /** Unsafe version of {@link #databaseEntryIndex(int) databaseEntryIndex}. */
    public static void ndatabaseEntryIndex(long struct, int value) { memPutInt(struct + XrTrackableImageANDROID.DATABASEENTRYINDEX, value); }
    /** Unsafe version of {@link #centerPose(XrPosef) centerPose}. */
    public static void ncenterPose(long struct, XrPosef value) { memCopy(value.address(), struct + XrTrackableImageANDROID.CENTERPOSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #extents(XrExtent2Df) extents}. */
    public static void nextents(long struct, XrExtent2Df value) { memCopy(value.address(), struct + XrTrackableImageANDROID.EXTENTS, XrExtent2Df.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrTrackableImageANDROID.DATABASE));
    }

    // -----------------------------------

    /** An array of {@link XrTrackableImageANDROID} structs. */
    public static class Buffer extends StructBuffer<XrTrackableImageANDROID, Buffer> implements NativeResource {

        private static final XrTrackableImageANDROID ELEMENT_FACTORY = XrTrackableImageANDROID.create(-1L);

        /**
         * Creates a new {@code XrTrackableImageANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrTrackableImageANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrTrackableImageANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrTrackableImageANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrTrackableImageANDROID.nnext(address()); }
        /** @return the value of the {@code trackingState} field. */
        @NativeType("XrTrackingStateANDROID")
        public int trackingState() { return XrTrackableImageANDROID.ntrackingState(address()); }
        /** @return the value of the {@code lastUpdatedTime} field. */
        @NativeType("XrTime")
        public long lastUpdatedTime() { return XrTrackableImageANDROID.nlastUpdatedTime(address()); }
        /** @return the value of the {@code database} field. */
        @NativeType("XrTrackableImageDatabaseANDROID")
        public long database() { return XrTrackableImageANDROID.ndatabase(address()); }
        /** @return the value of the {@code databaseEntryIndex} field. */
        @NativeType("uint32_t")
        public int databaseEntryIndex() { return XrTrackableImageANDROID.ndatabaseEntryIndex(address()); }
        /** @return a {@link XrPosef} view of the {@code centerPose} field. */
        public XrPosef centerPose() { return XrTrackableImageANDROID.ncenterPose(address()); }
        /** @return a {@link XrExtent2Df} view of the {@code extents} field. */
        public XrExtent2Df extents() { return XrTrackableImageANDROID.nextents(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrTrackableImageANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrTrackableImageANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDTrackablesImage#XR_TYPE_TRACKABLE_IMAGE_ANDROID TYPE_TRACKABLE_IMAGE_ANDROID} value to the {@code type} field. */
        public XrTrackableImageANDROID.Buffer type$Default() { return type(ANDROIDTrackablesImage.XR_TYPE_TRACKABLE_IMAGE_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrTrackableImageANDROID.Buffer next(@NativeType("void const *") long value) { XrTrackableImageANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code trackingState} field. */
        public XrTrackableImageANDROID.Buffer trackingState(@NativeType("XrTrackingStateANDROID") int value) { XrTrackableImageANDROID.ntrackingState(address(), value); return this; }
        /** Sets the specified value to the {@code lastUpdatedTime} field. */
        public XrTrackableImageANDROID.Buffer lastUpdatedTime(@NativeType("XrTime") long value) { XrTrackableImageANDROID.nlastUpdatedTime(address(), value); return this; }
        /** Sets the specified value to the {@code database} field. */
        public XrTrackableImageANDROID.Buffer database(XrTrackableImageDatabaseANDROID value) { XrTrackableImageANDROID.ndatabase(address(), value); return this; }
        /** Sets the specified value to the {@code databaseEntryIndex} field. */
        public XrTrackableImageANDROID.Buffer databaseEntryIndex(@NativeType("uint32_t") int value) { XrTrackableImageANDROID.ndatabaseEntryIndex(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code centerPose} field. */
        public XrTrackableImageANDROID.Buffer centerPose(XrPosef value) { XrTrackableImageANDROID.ncenterPose(address(), value); return this; }
        /** Passes the {@code centerPose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrTrackableImageANDROID.Buffer centerPose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(centerPose()); return this; }
        /** Copies the specified {@link XrExtent2Df} to the {@code extents} field. */
        public XrTrackableImageANDROID.Buffer extents(XrExtent2Df value) { XrTrackableImageANDROID.nextents(address(), value); return this; }
        /** Passes the {@code extents} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrTrackableImageANDROID.Buffer extents(java.util.function.Consumer<XrExtent2Df> consumer) { consumer.accept(extents()); return this; }

    }

}
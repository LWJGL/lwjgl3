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
 * struct XrTrackableObjectANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrTrackingStateANDROID trackingState;
 *     {@link XrPosef XrPosef} centerPose;
 *     {@link XrExtent3DfEXT XrExtent3DfEXT} extents;
 *     XrObjectLabelANDROID objectLabel;
 *     XrTime lastUpdatedTime;
 * }}</pre>
 */
public class XrTrackableObjectANDROID extends Struct<XrTrackableObjectANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TRACKINGSTATE,
        CENTERPOSE,
        EXTENTS,
        OBJECTLABEL,
        LASTUPDATEDTIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(XrExtent3DfEXT.SIZEOF, XrExtent3DfEXT.ALIGNOF),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        TRACKINGSTATE = layout.offsetof(2);
        CENTERPOSE = layout.offsetof(3);
        EXTENTS = layout.offsetof(4);
        OBJECTLABEL = layout.offsetof(5);
        LASTUPDATEDTIME = layout.offsetof(6);
    }

    protected XrTrackableObjectANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrTrackableObjectANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrTrackableObjectANDROID(address, container);
    }

    /**
     * Creates a {@code XrTrackableObjectANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrTrackableObjectANDROID(ByteBuffer container) {
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
    /** @return a {@link XrPosef} view of the {@code centerPose} field. */
    public XrPosef centerPose() { return ncenterPose(address()); }
    /** @return a {@link XrExtent3DfEXT} view of the {@code extents} field. */
    public XrExtent3DfEXT extents() { return nextents(address()); }
    /** @return the value of the {@code objectLabel} field. */
    @NativeType("XrObjectLabelANDROID")
    public int objectLabel() { return nobjectLabel(address()); }
    /** @return the value of the {@code lastUpdatedTime} field. */
    @NativeType("XrTime")
    public long lastUpdatedTime() { return nlastUpdatedTime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrTrackableObjectANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDTrackablesObject#XR_TYPE_TRACKABLE_OBJECT_ANDROID TYPE_TRACKABLE_OBJECT_ANDROID} value to the {@code type} field. */
    public XrTrackableObjectANDROID type$Default() { return type(ANDROIDTrackablesObject.XR_TYPE_TRACKABLE_OBJECT_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrTrackableObjectANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code trackingState} field. */
    public XrTrackableObjectANDROID trackingState(@NativeType("XrTrackingStateANDROID") int value) { ntrackingState(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code centerPose} field. */
    public XrTrackableObjectANDROID centerPose(XrPosef value) { ncenterPose(address(), value); return this; }
    /** Passes the {@code centerPose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrTrackableObjectANDROID centerPose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(centerPose()); return this; }
    /** Copies the specified {@link XrExtent3DfEXT} to the {@code extents} field. */
    public XrTrackableObjectANDROID extents(XrExtent3DfEXT value) { nextents(address(), value); return this; }
    /** Passes the {@code extents} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrTrackableObjectANDROID extents(java.util.function.Consumer<XrExtent3DfEXT> consumer) { consumer.accept(extents()); return this; }
    /** Sets the specified value to the {@code objectLabel} field. */
    public XrTrackableObjectANDROID objectLabel(@NativeType("XrObjectLabelANDROID") int value) { nobjectLabel(address(), value); return this; }
    /** Sets the specified value to the {@code lastUpdatedTime} field. */
    public XrTrackableObjectANDROID lastUpdatedTime(@NativeType("XrTime") long value) { nlastUpdatedTime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrTrackableObjectANDROID set(
        int type,
        long next,
        int trackingState,
        XrPosef centerPose,
        XrExtent3DfEXT extents,
        int objectLabel,
        long lastUpdatedTime
    ) {
        type(type);
        next(next);
        trackingState(trackingState);
        centerPose(centerPose);
        extents(extents);
        objectLabel(objectLabel);
        lastUpdatedTime(lastUpdatedTime);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrTrackableObjectANDROID set(XrTrackableObjectANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrTrackableObjectANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrTrackableObjectANDROID malloc() {
        return new XrTrackableObjectANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableObjectANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrTrackableObjectANDROID calloc() {
        return new XrTrackableObjectANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrTrackableObjectANDROID} instance allocated with {@link BufferUtils}. */
    public static XrTrackableObjectANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrTrackableObjectANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrTrackableObjectANDROID} instance for the specified memory address. */
    public static XrTrackableObjectANDROID create(long address) {
        return new XrTrackableObjectANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrTrackableObjectANDROID createSafe(long address) {
        return address == NULL ? null : new XrTrackableObjectANDROID(address, null);
    }

    /**
     * Returns a new {@link XrTrackableObjectANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableObjectANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrTrackableObjectANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableObjectANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableObjectANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrTrackableObjectANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrTrackableObjectANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrTrackableObjectANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrTrackableObjectANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrTrackableObjectANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableObjectANDROID malloc(MemoryStack stack) {
        return new XrTrackableObjectANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrTrackableObjectANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrTrackableObjectANDROID calloc(MemoryStack stack) {
        return new XrTrackableObjectANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrTrackableObjectANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableObjectANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrTrackableObjectANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrTrackableObjectANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrTrackableObjectANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrTrackableObjectANDROID.NEXT); }
    /** Unsafe version of {@link #trackingState}. */
    public static int ntrackingState(long struct) { return memGetInt(struct + XrTrackableObjectANDROID.TRACKINGSTATE); }
    /** Unsafe version of {@link #centerPose}. */
    public static XrPosef ncenterPose(long struct) { return XrPosef.create(struct + XrTrackableObjectANDROID.CENTERPOSE); }
    /** Unsafe version of {@link #extents}. */
    public static XrExtent3DfEXT nextents(long struct) { return XrExtent3DfEXT.create(struct + XrTrackableObjectANDROID.EXTENTS); }
    /** Unsafe version of {@link #objectLabel}. */
    public static int nobjectLabel(long struct) { return memGetInt(struct + XrTrackableObjectANDROID.OBJECTLABEL); }
    /** Unsafe version of {@link #lastUpdatedTime}. */
    public static long nlastUpdatedTime(long struct) { return memGetLong(struct + XrTrackableObjectANDROID.LASTUPDATEDTIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrTrackableObjectANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrTrackableObjectANDROID.NEXT, value); }
    /** Unsafe version of {@link #trackingState(int) trackingState}. */
    public static void ntrackingState(long struct, int value) { memPutInt(struct + XrTrackableObjectANDROID.TRACKINGSTATE, value); }
    /** Unsafe version of {@link #centerPose(XrPosef) centerPose}. */
    public static void ncenterPose(long struct, XrPosef value) { memCopy(value.address(), struct + XrTrackableObjectANDROID.CENTERPOSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #extents(XrExtent3DfEXT) extents}. */
    public static void nextents(long struct, XrExtent3DfEXT value) { memCopy(value.address(), struct + XrTrackableObjectANDROID.EXTENTS, XrExtent3DfEXT.SIZEOF); }
    /** Unsafe version of {@link #objectLabel(int) objectLabel}. */
    public static void nobjectLabel(long struct, int value) { memPutInt(struct + XrTrackableObjectANDROID.OBJECTLABEL, value); }
    /** Unsafe version of {@link #lastUpdatedTime(long) lastUpdatedTime}. */
    public static void nlastUpdatedTime(long struct, long value) { memPutLong(struct + XrTrackableObjectANDROID.LASTUPDATEDTIME, value); }

    // -----------------------------------

    /** An array of {@link XrTrackableObjectANDROID} structs. */
    public static class Buffer extends StructBuffer<XrTrackableObjectANDROID, Buffer> implements NativeResource {

        private static final XrTrackableObjectANDROID ELEMENT_FACTORY = XrTrackableObjectANDROID.create(-1L);

        /**
         * Creates a new {@code XrTrackableObjectANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrTrackableObjectANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrTrackableObjectANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrTrackableObjectANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrTrackableObjectANDROID.nnext(address()); }
        /** @return the value of the {@code trackingState} field. */
        @NativeType("XrTrackingStateANDROID")
        public int trackingState() { return XrTrackableObjectANDROID.ntrackingState(address()); }
        /** @return a {@link XrPosef} view of the {@code centerPose} field. */
        public XrPosef centerPose() { return XrTrackableObjectANDROID.ncenterPose(address()); }
        /** @return a {@link XrExtent3DfEXT} view of the {@code extents} field. */
        public XrExtent3DfEXT extents() { return XrTrackableObjectANDROID.nextents(address()); }
        /** @return the value of the {@code objectLabel} field. */
        @NativeType("XrObjectLabelANDROID")
        public int objectLabel() { return XrTrackableObjectANDROID.nobjectLabel(address()); }
        /** @return the value of the {@code lastUpdatedTime} field. */
        @NativeType("XrTime")
        public long lastUpdatedTime() { return XrTrackableObjectANDROID.nlastUpdatedTime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrTrackableObjectANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrTrackableObjectANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDTrackablesObject#XR_TYPE_TRACKABLE_OBJECT_ANDROID TYPE_TRACKABLE_OBJECT_ANDROID} value to the {@code type} field. */
        public XrTrackableObjectANDROID.Buffer type$Default() { return type(ANDROIDTrackablesObject.XR_TYPE_TRACKABLE_OBJECT_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrTrackableObjectANDROID.Buffer next(@NativeType("void *") long value) { XrTrackableObjectANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code trackingState} field. */
        public XrTrackableObjectANDROID.Buffer trackingState(@NativeType("XrTrackingStateANDROID") int value) { XrTrackableObjectANDROID.ntrackingState(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code centerPose} field. */
        public XrTrackableObjectANDROID.Buffer centerPose(XrPosef value) { XrTrackableObjectANDROID.ncenterPose(address(), value); return this; }
        /** Passes the {@code centerPose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrTrackableObjectANDROID.Buffer centerPose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(centerPose()); return this; }
        /** Copies the specified {@link XrExtent3DfEXT} to the {@code extents} field. */
        public XrTrackableObjectANDROID.Buffer extents(XrExtent3DfEXT value) { XrTrackableObjectANDROID.nextents(address(), value); return this; }
        /** Passes the {@code extents} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrTrackableObjectANDROID.Buffer extents(java.util.function.Consumer<XrExtent3DfEXT> consumer) { consumer.accept(extents()); return this; }
        /** Sets the specified value to the {@code objectLabel} field. */
        public XrTrackableObjectANDROID.Buffer objectLabel(@NativeType("XrObjectLabelANDROID") int value) { XrTrackableObjectANDROID.nobjectLabel(address(), value); return this; }
        /** Sets the specified value to the {@code lastUpdatedTime} field. */
        public XrTrackableObjectANDROID.Buffer lastUpdatedTime(@NativeType("XrTime") long value) { XrTrackableObjectANDROID.nlastUpdatedTime(address(), value); return this; }

    }

}
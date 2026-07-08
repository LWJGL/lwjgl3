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
 * struct XrGeospatialAnchorCreateInfoANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrGeospatialTrackerANDROID geospatialTracker;
 *     {@link XrGeospatialPoseANDROID XrGeospatialPoseANDROID} geospatialPose;
 * }</code></pre>
 */
public class XrGeospatialAnchorCreateInfoANDROID extends Struct<XrGeospatialAnchorCreateInfoANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        GEOSPATIALTRACKER,
        GEOSPATIALPOSE;

    static {
        XrGeospatialPoseANDROID.createSafe(NULL);

        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(XrGeospatialPoseANDROID.SIZEOF, XrGeospatialPoseANDROID.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        GEOSPATIALTRACKER = layout.offsetof(2);
        GEOSPATIALPOSE = layout.offsetof(3);
    }

    protected XrGeospatialAnchorCreateInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrGeospatialAnchorCreateInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrGeospatialAnchorCreateInfoANDROID(address, container);
    }

    /**
     * Creates a {@code XrGeospatialAnchorCreateInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGeospatialAnchorCreateInfoANDROID(ByteBuffer container) {
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
    /** @return a {@link XrGeospatialPoseANDROID} view of the {@code geospatialPose} field. */
    public XrGeospatialPoseANDROID geospatialPose() { return ngeospatialPose(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrGeospatialAnchorCreateInfoANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDGeospatialAnchor#XR_TYPE_GEOSPATIAL_ANCHOR_CREATE_INFO_ANDROID TYPE_GEOSPATIAL_ANCHOR_CREATE_INFO_ANDROID} value to the {@code type} field. */
    public XrGeospatialAnchorCreateInfoANDROID type$Default() { return type(ANDROIDGeospatialAnchor.XR_TYPE_GEOSPATIAL_ANCHOR_CREATE_INFO_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrGeospatialAnchorCreateInfoANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code geospatialTracker} field. */
    public XrGeospatialAnchorCreateInfoANDROID geospatialTracker(XrGeospatialTrackerANDROID value) { ngeospatialTracker(address(), value); return this; }
    /** Copies the specified {@link XrGeospatialPoseANDROID} to the {@code geospatialPose} field. */
    public XrGeospatialAnchorCreateInfoANDROID geospatialPose(XrGeospatialPoseANDROID value) { ngeospatialPose(address(), value); return this; }
    /** Passes the {@code geospatialPose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrGeospatialAnchorCreateInfoANDROID geospatialPose(java.util.function.Consumer<XrGeospatialPoseANDROID> consumer) { consumer.accept(geospatialPose()); return this; }

    /** Initializes this struct with the specified values. */
    public XrGeospatialAnchorCreateInfoANDROID set(
        int type,
        long next,
        XrGeospatialTrackerANDROID geospatialTracker,
        XrGeospatialPoseANDROID geospatialPose
    ) {
        type(type);
        next(next);
        geospatialTracker(geospatialTracker);
        geospatialPose(geospatialPose);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrGeospatialAnchorCreateInfoANDROID set(XrGeospatialAnchorCreateInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGeospatialAnchorCreateInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGeospatialAnchorCreateInfoANDROID malloc() {
        return new XrGeospatialAnchorCreateInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrGeospatialAnchorCreateInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGeospatialAnchorCreateInfoANDROID calloc() {
        return new XrGeospatialAnchorCreateInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrGeospatialAnchorCreateInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static XrGeospatialAnchorCreateInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrGeospatialAnchorCreateInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrGeospatialAnchorCreateInfoANDROID} instance for the specified memory address. */
    public static XrGeospatialAnchorCreateInfoANDROID create(long address) {
        return new XrGeospatialAnchorCreateInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrGeospatialAnchorCreateInfoANDROID createSafe(long address) {
        return address == NULL ? null : new XrGeospatialAnchorCreateInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link XrGeospatialAnchorCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeospatialAnchorCreateInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGeospatialAnchorCreateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeospatialAnchorCreateInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGeospatialAnchorCreateInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeospatialAnchorCreateInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrGeospatialAnchorCreateInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGeospatialAnchorCreateInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrGeospatialAnchorCreateInfoANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrGeospatialAnchorCreateInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGeospatialAnchorCreateInfoANDROID malloc(MemoryStack stack) {
        return new XrGeospatialAnchorCreateInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrGeospatialAnchorCreateInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGeospatialAnchorCreateInfoANDROID calloc(MemoryStack stack) {
        return new XrGeospatialAnchorCreateInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrGeospatialAnchorCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGeospatialAnchorCreateInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGeospatialAnchorCreateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGeospatialAnchorCreateInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrGeospatialAnchorCreateInfoANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGeospatialAnchorCreateInfoANDROID.NEXT); }
    /** Unsafe version of {@link #geospatialTracker}. */
    public static long ngeospatialTracker(long struct) { return memGetAddress(struct + XrGeospatialAnchorCreateInfoANDROID.GEOSPATIALTRACKER); }
    /** Unsafe version of {@link #geospatialPose}. */
    public static XrGeospatialPoseANDROID ngeospatialPose(long struct) { return XrGeospatialPoseANDROID.create(struct + XrGeospatialAnchorCreateInfoANDROID.GEOSPATIALPOSE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrGeospatialAnchorCreateInfoANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGeospatialAnchorCreateInfoANDROID.NEXT, value); }
    /** Unsafe version of {@link #geospatialTracker(XrGeospatialTrackerANDROID) geospatialTracker}. */
    public static void ngeospatialTracker(long struct, XrGeospatialTrackerANDROID value) { memPutAddress(struct + XrGeospatialAnchorCreateInfoANDROID.GEOSPATIALTRACKER, value.address()); }
    /** Unsafe version of {@link #geospatialPose(XrGeospatialPoseANDROID) geospatialPose}. */
    public static void ngeospatialPose(long struct, XrGeospatialPoseANDROID value) { memCopy(value.address(), struct + XrGeospatialAnchorCreateInfoANDROID.GEOSPATIALPOSE, XrGeospatialPoseANDROID.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrGeospatialAnchorCreateInfoANDROID.GEOSPATIALTRACKER));
    }

    // -----------------------------------

    /** An array of {@link XrGeospatialAnchorCreateInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<XrGeospatialAnchorCreateInfoANDROID, Buffer> implements NativeResource {

        private static final XrGeospatialAnchorCreateInfoANDROID ELEMENT_FACTORY = XrGeospatialAnchorCreateInfoANDROID.create(-1L);

        /**
         * Creates a new {@code XrGeospatialAnchorCreateInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGeospatialAnchorCreateInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrGeospatialAnchorCreateInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGeospatialAnchorCreateInfoANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrGeospatialAnchorCreateInfoANDROID.nnext(address()); }
        /** @return the value of the {@code geospatialTracker} field. */
        @NativeType("XrGeospatialTrackerANDROID")
        public long geospatialTracker() { return XrGeospatialAnchorCreateInfoANDROID.ngeospatialTracker(address()); }
        /** @return a {@link XrGeospatialPoseANDROID} view of the {@code geospatialPose} field. */
        public XrGeospatialPoseANDROID geospatialPose() { return XrGeospatialAnchorCreateInfoANDROID.ngeospatialPose(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrGeospatialAnchorCreateInfoANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrGeospatialAnchorCreateInfoANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDGeospatialAnchor#XR_TYPE_GEOSPATIAL_ANCHOR_CREATE_INFO_ANDROID TYPE_GEOSPATIAL_ANCHOR_CREATE_INFO_ANDROID} value to the {@code type} field. */
        public XrGeospatialAnchorCreateInfoANDROID.Buffer type$Default() { return type(ANDROIDGeospatialAnchor.XR_TYPE_GEOSPATIAL_ANCHOR_CREATE_INFO_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrGeospatialAnchorCreateInfoANDROID.Buffer next(@NativeType("void const *") long value) { XrGeospatialAnchorCreateInfoANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code geospatialTracker} field. */
        public XrGeospatialAnchorCreateInfoANDROID.Buffer geospatialTracker(XrGeospatialTrackerANDROID value) { XrGeospatialAnchorCreateInfoANDROID.ngeospatialTracker(address(), value); return this; }
        /** Copies the specified {@link XrGeospatialPoseANDROID} to the {@code geospatialPose} field. */
        public XrGeospatialAnchorCreateInfoANDROID.Buffer geospatialPose(XrGeospatialPoseANDROID value) { XrGeospatialAnchorCreateInfoANDROID.ngeospatialPose(address(), value); return this; }
        /** Passes the {@code geospatialPose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrGeospatialAnchorCreateInfoANDROID.Buffer geospatialPose(java.util.function.Consumer<XrGeospatialPoseANDROID> consumer) { consumer.accept(geospatialPose()); return this; }

    }

}
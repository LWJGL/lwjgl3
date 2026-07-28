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
 * struct XrGeospatialPoseFromPoseLocateInfoANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace space;
 *     XrTime time;
 *     {@link XrPosef XrPosef} pose;
 * }</code></pre>
 */
public class XrGeospatialPoseFromPoseLocateInfoANDROID extends Struct<XrGeospatialPoseFromPoseLocateInfoANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SPACE,
        TIME,
        POSE;

    static {
        XrPosef.createSafe(NULL);

        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPACE = layout.offsetof(2);
        TIME = layout.offsetof(3);
        POSE = layout.offsetof(4);
    }

    protected XrGeospatialPoseFromPoseLocateInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrGeospatialPoseFromPoseLocateInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrGeospatialPoseFromPoseLocateInfoANDROID(address, container);
    }

    /**
     * Creates a {@code XrGeospatialPoseFromPoseLocateInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGeospatialPoseFromPoseLocateInfoANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code space} field. */
    @NativeType("XrSpace")
    public long space() { return nspace(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }
    /** @return a {@link XrPosef} view of the {@code pose} field. */
    public XrPosef pose() { return npose(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrGeospatialPoseFromPoseLocateInfoANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDGeospatial#XR_TYPE_GEOSPATIAL_POSE_FROM_POSE_LOCATE_INFO_ANDROID TYPE_GEOSPATIAL_POSE_FROM_POSE_LOCATE_INFO_ANDROID} value to the {@code type} field. */
    public XrGeospatialPoseFromPoseLocateInfoANDROID type$Default() { return type(ANDROIDGeospatial.XR_TYPE_GEOSPATIAL_POSE_FROM_POSE_LOCATE_INFO_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrGeospatialPoseFromPoseLocateInfoANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code space} field. */
    public XrGeospatialPoseFromPoseLocateInfoANDROID space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrGeospatialPoseFromPoseLocateInfoANDROID time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code pose} field. */
    public XrGeospatialPoseFromPoseLocateInfoANDROID pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrGeospatialPoseFromPoseLocateInfoANDROID pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }

    /** Initializes this struct with the specified values. */
    public XrGeospatialPoseFromPoseLocateInfoANDROID set(
        int type,
        long next,
        XrSpace space,
        long time,
        XrPosef pose
    ) {
        type(type);
        next(next);
        space(space);
        time(time);
        pose(pose);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrGeospatialPoseFromPoseLocateInfoANDROID set(XrGeospatialPoseFromPoseLocateInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGeospatialPoseFromPoseLocateInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGeospatialPoseFromPoseLocateInfoANDROID malloc() {
        return new XrGeospatialPoseFromPoseLocateInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrGeospatialPoseFromPoseLocateInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGeospatialPoseFromPoseLocateInfoANDROID calloc() {
        return new XrGeospatialPoseFromPoseLocateInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrGeospatialPoseFromPoseLocateInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static XrGeospatialPoseFromPoseLocateInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrGeospatialPoseFromPoseLocateInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrGeospatialPoseFromPoseLocateInfoANDROID} instance for the specified memory address. */
    public static XrGeospatialPoseFromPoseLocateInfoANDROID create(long address) {
        return new XrGeospatialPoseFromPoseLocateInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrGeospatialPoseFromPoseLocateInfoANDROID createSafe(long address) {
        return address == NULL ? null : new XrGeospatialPoseFromPoseLocateInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link XrGeospatialPoseFromPoseLocateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseFromPoseLocateInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGeospatialPoseFromPoseLocateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseFromPoseLocateInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGeospatialPoseFromPoseLocateInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseFromPoseLocateInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrGeospatialPoseFromPoseLocateInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseFromPoseLocateInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrGeospatialPoseFromPoseLocateInfoANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrGeospatialPoseFromPoseLocateInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGeospatialPoseFromPoseLocateInfoANDROID malloc(MemoryStack stack) {
        return new XrGeospatialPoseFromPoseLocateInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrGeospatialPoseFromPoseLocateInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGeospatialPoseFromPoseLocateInfoANDROID calloc(MemoryStack stack) {
        return new XrGeospatialPoseFromPoseLocateInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrGeospatialPoseFromPoseLocateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseFromPoseLocateInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGeospatialPoseFromPoseLocateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseFromPoseLocateInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrGeospatialPoseFromPoseLocateInfoANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGeospatialPoseFromPoseLocateInfoANDROID.NEXT); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrGeospatialPoseFromPoseLocateInfoANDROID.SPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrGeospatialPoseFromPoseLocateInfoANDROID.TIME); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrGeospatialPoseFromPoseLocateInfoANDROID.POSE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrGeospatialPoseFromPoseLocateInfoANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGeospatialPoseFromPoseLocateInfoANDROID.NEXT, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrGeospatialPoseFromPoseLocateInfoANDROID.SPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrGeospatialPoseFromPoseLocateInfoANDROID.TIME, value); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrGeospatialPoseFromPoseLocateInfoANDROID.POSE, XrPosef.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrGeospatialPoseFromPoseLocateInfoANDROID.SPACE));
    }

    // -----------------------------------

    /** An array of {@link XrGeospatialPoseFromPoseLocateInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<XrGeospatialPoseFromPoseLocateInfoANDROID, Buffer> implements NativeResource {

        private static final XrGeospatialPoseFromPoseLocateInfoANDROID ELEMENT_FACTORY = XrGeospatialPoseFromPoseLocateInfoANDROID.create(-1L);

        /**
         * Creates a new {@code XrGeospatialPoseFromPoseLocateInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGeospatialPoseFromPoseLocateInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrGeospatialPoseFromPoseLocateInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGeospatialPoseFromPoseLocateInfoANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrGeospatialPoseFromPoseLocateInfoANDROID.nnext(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrGeospatialPoseFromPoseLocateInfoANDROID.nspace(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrGeospatialPoseFromPoseLocateInfoANDROID.ntime(address()); }
        /** @return a {@link XrPosef} view of the {@code pose} field. */
        public XrPosef pose() { return XrGeospatialPoseFromPoseLocateInfoANDROID.npose(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrGeospatialPoseFromPoseLocateInfoANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrGeospatialPoseFromPoseLocateInfoANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDGeospatial#XR_TYPE_GEOSPATIAL_POSE_FROM_POSE_LOCATE_INFO_ANDROID TYPE_GEOSPATIAL_POSE_FROM_POSE_LOCATE_INFO_ANDROID} value to the {@code type} field. */
        public XrGeospatialPoseFromPoseLocateInfoANDROID.Buffer type$Default() { return type(ANDROIDGeospatial.XR_TYPE_GEOSPATIAL_POSE_FROM_POSE_LOCATE_INFO_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrGeospatialPoseFromPoseLocateInfoANDROID.Buffer next(@NativeType("void const *") long value) { XrGeospatialPoseFromPoseLocateInfoANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code space} field. */
        public XrGeospatialPoseFromPoseLocateInfoANDROID.Buffer space(XrSpace value) { XrGeospatialPoseFromPoseLocateInfoANDROID.nspace(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrGeospatialPoseFromPoseLocateInfoANDROID.Buffer time(@NativeType("XrTime") long value) { XrGeospatialPoseFromPoseLocateInfoANDROID.ntime(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code pose} field. */
        public XrGeospatialPoseFromPoseLocateInfoANDROID.Buffer pose(XrPosef value) { XrGeospatialPoseFromPoseLocateInfoANDROID.npose(address(), value); return this; }
        /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrGeospatialPoseFromPoseLocateInfoANDROID.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }

    }

}
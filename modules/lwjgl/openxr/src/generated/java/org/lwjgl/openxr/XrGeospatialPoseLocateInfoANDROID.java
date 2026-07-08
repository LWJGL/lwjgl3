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
 * struct XrGeospatialPoseLocateInfoANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace space;
 *     XrTime time;
 *     {@link XrGeospatialPoseANDROID XrGeospatialPoseANDROID} geospatialPose;
 * }</code></pre>
 */
public class XrGeospatialPoseLocateInfoANDROID extends Struct<XrGeospatialPoseLocateInfoANDROID> implements NativeResource {

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
        GEOSPATIALPOSE;

    static {
        XrGeospatialPoseANDROID.createSafe(NULL);

        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrGeospatialPoseANDROID.SIZEOF, XrGeospatialPoseANDROID.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPACE = layout.offsetof(2);
        TIME = layout.offsetof(3);
        GEOSPATIALPOSE = layout.offsetof(4);
    }

    protected XrGeospatialPoseLocateInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrGeospatialPoseLocateInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrGeospatialPoseLocateInfoANDROID(address, container);
    }

    /**
     * Creates a {@code XrGeospatialPoseLocateInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGeospatialPoseLocateInfoANDROID(ByteBuffer container) {
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
    /** @return a {@link XrGeospatialPoseANDROID} view of the {@code geospatialPose} field. */
    public XrGeospatialPoseANDROID geospatialPose() { return ngeospatialPose(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrGeospatialPoseLocateInfoANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDGeospatial#XR_TYPE_GEOSPATIAL_POSE_LOCATE_INFO_ANDROID TYPE_GEOSPATIAL_POSE_LOCATE_INFO_ANDROID} value to the {@code type} field. */
    public XrGeospatialPoseLocateInfoANDROID type$Default() { return type(ANDROIDGeospatial.XR_TYPE_GEOSPATIAL_POSE_LOCATE_INFO_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrGeospatialPoseLocateInfoANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code space} field. */
    public XrGeospatialPoseLocateInfoANDROID space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrGeospatialPoseLocateInfoANDROID time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Copies the specified {@link XrGeospatialPoseANDROID} to the {@code geospatialPose} field. */
    public XrGeospatialPoseLocateInfoANDROID geospatialPose(XrGeospatialPoseANDROID value) { ngeospatialPose(address(), value); return this; }
    /** Passes the {@code geospatialPose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrGeospatialPoseLocateInfoANDROID geospatialPose(java.util.function.Consumer<XrGeospatialPoseANDROID> consumer) { consumer.accept(geospatialPose()); return this; }

    /** Initializes this struct with the specified values. */
    public XrGeospatialPoseLocateInfoANDROID set(
        int type,
        long next,
        XrSpace space,
        long time,
        XrGeospatialPoseANDROID geospatialPose
    ) {
        type(type);
        next(next);
        space(space);
        time(time);
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
    public XrGeospatialPoseLocateInfoANDROID set(XrGeospatialPoseLocateInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGeospatialPoseLocateInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGeospatialPoseLocateInfoANDROID malloc() {
        return new XrGeospatialPoseLocateInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrGeospatialPoseLocateInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGeospatialPoseLocateInfoANDROID calloc() {
        return new XrGeospatialPoseLocateInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrGeospatialPoseLocateInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static XrGeospatialPoseLocateInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrGeospatialPoseLocateInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrGeospatialPoseLocateInfoANDROID} instance for the specified memory address. */
    public static XrGeospatialPoseLocateInfoANDROID create(long address) {
        return new XrGeospatialPoseLocateInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrGeospatialPoseLocateInfoANDROID createSafe(long address) {
        return address == NULL ? null : new XrGeospatialPoseLocateInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link XrGeospatialPoseLocateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseLocateInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGeospatialPoseLocateInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseLocateInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGeospatialPoseLocateInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseLocateInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrGeospatialPoseLocateInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseLocateInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrGeospatialPoseLocateInfoANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrGeospatialPoseLocateInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGeospatialPoseLocateInfoANDROID malloc(MemoryStack stack) {
        return new XrGeospatialPoseLocateInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrGeospatialPoseLocateInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGeospatialPoseLocateInfoANDROID calloc(MemoryStack stack) {
        return new XrGeospatialPoseLocateInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrGeospatialPoseLocateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseLocateInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGeospatialPoseLocateInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseLocateInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrGeospatialPoseLocateInfoANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGeospatialPoseLocateInfoANDROID.NEXT); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrGeospatialPoseLocateInfoANDROID.SPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrGeospatialPoseLocateInfoANDROID.TIME); }
    /** Unsafe version of {@link #geospatialPose}. */
    public static XrGeospatialPoseANDROID ngeospatialPose(long struct) { return XrGeospatialPoseANDROID.create(struct + XrGeospatialPoseLocateInfoANDROID.GEOSPATIALPOSE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrGeospatialPoseLocateInfoANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGeospatialPoseLocateInfoANDROID.NEXT, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrGeospatialPoseLocateInfoANDROID.SPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrGeospatialPoseLocateInfoANDROID.TIME, value); }
    /** Unsafe version of {@link #geospatialPose(XrGeospatialPoseANDROID) geospatialPose}. */
    public static void ngeospatialPose(long struct, XrGeospatialPoseANDROID value) { memCopy(value.address(), struct + XrGeospatialPoseLocateInfoANDROID.GEOSPATIALPOSE, XrGeospatialPoseANDROID.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrGeospatialPoseLocateInfoANDROID.SPACE));
    }

    // -----------------------------------

    /** An array of {@link XrGeospatialPoseLocateInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<XrGeospatialPoseLocateInfoANDROID, Buffer> implements NativeResource {

        private static final XrGeospatialPoseLocateInfoANDROID ELEMENT_FACTORY = XrGeospatialPoseLocateInfoANDROID.create(-1L);

        /**
         * Creates a new {@code XrGeospatialPoseLocateInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGeospatialPoseLocateInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrGeospatialPoseLocateInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGeospatialPoseLocateInfoANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrGeospatialPoseLocateInfoANDROID.nnext(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrGeospatialPoseLocateInfoANDROID.nspace(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrGeospatialPoseLocateInfoANDROID.ntime(address()); }
        /** @return a {@link XrGeospatialPoseANDROID} view of the {@code geospatialPose} field. */
        public XrGeospatialPoseANDROID geospatialPose() { return XrGeospatialPoseLocateInfoANDROID.ngeospatialPose(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrGeospatialPoseLocateInfoANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrGeospatialPoseLocateInfoANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDGeospatial#XR_TYPE_GEOSPATIAL_POSE_LOCATE_INFO_ANDROID TYPE_GEOSPATIAL_POSE_LOCATE_INFO_ANDROID} value to the {@code type} field. */
        public XrGeospatialPoseLocateInfoANDROID.Buffer type$Default() { return type(ANDROIDGeospatial.XR_TYPE_GEOSPATIAL_POSE_LOCATE_INFO_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrGeospatialPoseLocateInfoANDROID.Buffer next(@NativeType("void const *") long value) { XrGeospatialPoseLocateInfoANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code space} field. */
        public XrGeospatialPoseLocateInfoANDROID.Buffer space(XrSpace value) { XrGeospatialPoseLocateInfoANDROID.nspace(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrGeospatialPoseLocateInfoANDROID.Buffer time(@NativeType("XrTime") long value) { XrGeospatialPoseLocateInfoANDROID.ntime(address(), value); return this; }
        /** Copies the specified {@link XrGeospatialPoseANDROID} to the {@code geospatialPose} field. */
        public XrGeospatialPoseLocateInfoANDROID.Buffer geospatialPose(XrGeospatialPoseANDROID value) { XrGeospatialPoseLocateInfoANDROID.ngeospatialPose(address(), value); return this; }
        /** Passes the {@code geospatialPose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrGeospatialPoseLocateInfoANDROID.Buffer geospatialPose(java.util.function.Consumer<XrGeospatialPoseANDROID> consumer) { consumer.accept(geospatialPose()); return this; }

    }

}
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
 * <pre><code>
 * struct XrGeospatialPoseResultANDROID {
 *     XrStructureType type;
 *     void * next;
 *     XrGeospatialPoseFlagsANDROID poseFlags;
 *     {@link XrGeospatialPoseANDROID XrGeospatialPoseANDROID} geospatialPose;
 *     double horizontalAccuracy;
 *     double verticalAccuracy;
 *     double orientationYawAccuracy;
 * }</code></pre>
 */
public class XrGeospatialPoseResultANDROID extends Struct<XrGeospatialPoseResultANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        POSEFLAGS,
        GEOSPATIALPOSE,
        HORIZONTALACCURACY,
        VERTICALACCURACY,
        ORIENTATIONYAWACCURACY;

    static {
        XrGeospatialPoseANDROID.createSafe(NULL);

        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrGeospatialPoseANDROID.SIZEOF, XrGeospatialPoseANDROID.ALIGNOF),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        POSEFLAGS = layout.offsetof(2);
        GEOSPATIALPOSE = layout.offsetof(3);
        HORIZONTALACCURACY = layout.offsetof(4);
        VERTICALACCURACY = layout.offsetof(5);
        ORIENTATIONYAWACCURACY = layout.offsetof(6);
    }

    protected XrGeospatialPoseResultANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrGeospatialPoseResultANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrGeospatialPoseResultANDROID(address, container);
    }

    /**
     * Creates a {@code XrGeospatialPoseResultANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGeospatialPoseResultANDROID(ByteBuffer container) {
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
    /** @return the value of the {@code poseFlags} field. */
    @NativeType("XrGeospatialPoseFlagsANDROID")
    public long poseFlags() { return nposeFlags(address()); }
    /** @return a {@link XrGeospatialPoseANDROID} view of the {@code geospatialPose} field. */
    public XrGeospatialPoseANDROID geospatialPose() { return ngeospatialPose(address()); }
    /** @return the value of the {@code horizontalAccuracy} field. */
    public double horizontalAccuracy() { return nhorizontalAccuracy(address()); }
    /** @return the value of the {@code verticalAccuracy} field. */
    public double verticalAccuracy() { return nverticalAccuracy(address()); }
    /** @return the value of the {@code orientationYawAccuracy} field. */
    public double orientationYawAccuracy() { return norientationYawAccuracy(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrGeospatialPoseResultANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDGeospatial#XR_TYPE_GEOSPATIAL_POSE_RESULT_ANDROID TYPE_GEOSPATIAL_POSE_RESULT_ANDROID} value to the {@code type} field. */
    public XrGeospatialPoseResultANDROID type$Default() { return type(ANDROIDGeospatial.XR_TYPE_GEOSPATIAL_POSE_RESULT_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrGeospatialPoseResultANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrGeospatialPoseResultANDROID set(
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
    public XrGeospatialPoseResultANDROID set(XrGeospatialPoseResultANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGeospatialPoseResultANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGeospatialPoseResultANDROID malloc() {
        return new XrGeospatialPoseResultANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrGeospatialPoseResultANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGeospatialPoseResultANDROID calloc() {
        return new XrGeospatialPoseResultANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrGeospatialPoseResultANDROID} instance allocated with {@link BufferUtils}. */
    public static XrGeospatialPoseResultANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrGeospatialPoseResultANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrGeospatialPoseResultANDROID} instance for the specified memory address. */
    public static XrGeospatialPoseResultANDROID create(long address) {
        return new XrGeospatialPoseResultANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrGeospatialPoseResultANDROID createSafe(long address) {
        return address == NULL ? null : new XrGeospatialPoseResultANDROID(address, null);
    }

    /**
     * Returns a new {@link XrGeospatialPoseResultANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseResultANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGeospatialPoseResultANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseResultANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGeospatialPoseResultANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseResultANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrGeospatialPoseResultANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseResultANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrGeospatialPoseResultANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrGeospatialPoseResultANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGeospatialPoseResultANDROID malloc(MemoryStack stack) {
        return new XrGeospatialPoseResultANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrGeospatialPoseResultANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGeospatialPoseResultANDROID calloc(MemoryStack stack) {
        return new XrGeospatialPoseResultANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrGeospatialPoseResultANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseResultANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGeospatialPoseResultANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGeospatialPoseResultANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrGeospatialPoseResultANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGeospatialPoseResultANDROID.NEXT); }
    /** Unsafe version of {@link #poseFlags}. */
    public static long nposeFlags(long struct) { return memGetLong(struct + XrGeospatialPoseResultANDROID.POSEFLAGS); }
    /** Unsafe version of {@link #geospatialPose}. */
    public static XrGeospatialPoseANDROID ngeospatialPose(long struct) { return XrGeospatialPoseANDROID.create(struct + XrGeospatialPoseResultANDROID.GEOSPATIALPOSE); }
    /** Unsafe version of {@link #horizontalAccuracy}. */
    public static double nhorizontalAccuracy(long struct) { return memGetDouble(struct + XrGeospatialPoseResultANDROID.HORIZONTALACCURACY); }
    /** Unsafe version of {@link #verticalAccuracy}. */
    public static double nverticalAccuracy(long struct) { return memGetDouble(struct + XrGeospatialPoseResultANDROID.VERTICALACCURACY); }
    /** Unsafe version of {@link #orientationYawAccuracy}. */
    public static double norientationYawAccuracy(long struct) { return memGetDouble(struct + XrGeospatialPoseResultANDROID.ORIENTATIONYAWACCURACY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrGeospatialPoseResultANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGeospatialPoseResultANDROID.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrGeospatialPoseResultANDROID} structs. */
    public static class Buffer extends StructBuffer<XrGeospatialPoseResultANDROID, Buffer> implements NativeResource {

        private static final XrGeospatialPoseResultANDROID ELEMENT_FACTORY = XrGeospatialPoseResultANDROID.create(-1L);

        /**
         * Creates a new {@code XrGeospatialPoseResultANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGeospatialPoseResultANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrGeospatialPoseResultANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGeospatialPoseResultANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrGeospatialPoseResultANDROID.nnext(address()); }
        /** @return the value of the {@code poseFlags} field. */
        @NativeType("XrGeospatialPoseFlagsANDROID")
        public long poseFlags() { return XrGeospatialPoseResultANDROID.nposeFlags(address()); }
        /** @return a {@link XrGeospatialPoseANDROID} view of the {@code geospatialPose} field. */
        public XrGeospatialPoseANDROID geospatialPose() { return XrGeospatialPoseResultANDROID.ngeospatialPose(address()); }
        /** @return the value of the {@code horizontalAccuracy} field. */
        public double horizontalAccuracy() { return XrGeospatialPoseResultANDROID.nhorizontalAccuracy(address()); }
        /** @return the value of the {@code verticalAccuracy} field. */
        public double verticalAccuracy() { return XrGeospatialPoseResultANDROID.nverticalAccuracy(address()); }
        /** @return the value of the {@code orientationYawAccuracy} field. */
        public double orientationYawAccuracy() { return XrGeospatialPoseResultANDROID.norientationYawAccuracy(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrGeospatialPoseResultANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrGeospatialPoseResultANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDGeospatial#XR_TYPE_GEOSPATIAL_POSE_RESULT_ANDROID TYPE_GEOSPATIAL_POSE_RESULT_ANDROID} value to the {@code type} field. */
        public XrGeospatialPoseResultANDROID.Buffer type$Default() { return type(ANDROIDGeospatial.XR_TYPE_GEOSPATIAL_POSE_RESULT_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrGeospatialPoseResultANDROID.Buffer next(@NativeType("void *") long value) { XrGeospatialPoseResultANDROID.nnext(address(), value); return this; }

    }

}
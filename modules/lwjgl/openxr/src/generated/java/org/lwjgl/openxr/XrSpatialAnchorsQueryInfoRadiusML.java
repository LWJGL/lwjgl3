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
 * struct XrSpatialAnchorsQueryInfoRadiusML {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace baseSpace;
 *     {@link XrVector3f XrVector3f} center;
 *     XrTime time;
 *     float radius;
 * }}</pre>
 */
public class XrSpatialAnchorsQueryInfoRadiusML extends Struct<XrSpatialAnchorsQueryInfoRadiusML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BASESPACE,
        CENTER,
        TIME,
        RADIUS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BASESPACE = layout.offsetof(2);
        CENTER = layout.offsetof(3);
        TIME = layout.offsetof(4);
        RADIUS = layout.offsetof(5);
    }

    protected XrSpatialAnchorsQueryInfoRadiusML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialAnchorsQueryInfoRadiusML create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialAnchorsQueryInfoRadiusML(address, container);
    }

    /**
     * Creates a {@code XrSpatialAnchorsQueryInfoRadiusML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialAnchorsQueryInfoRadiusML(ByteBuffer container) {
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
    /** @return the value of the {@code baseSpace} field. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }
    /** @return a {@link XrVector3f} view of the {@code center} field. */
    public XrVector3f center() { return ncenter(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }
    /** @return the value of the {@code radius} field. */
    public float radius() { return nradius(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialAnchorsQueryInfoRadiusML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_QUERY_INFO_RADIUS_ML TYPE_SPATIAL_ANCHORS_QUERY_INFO_RADIUS_ML} value to the {@code type} field. */
    public XrSpatialAnchorsQueryInfoRadiusML type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_QUERY_INFO_RADIUS_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialAnchorsQueryInfoRadiusML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code baseSpace} field. */
    public XrSpatialAnchorsQueryInfoRadiusML baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Copies the specified {@link XrVector3f} to the {@code center} field. */
    public XrSpatialAnchorsQueryInfoRadiusML center(XrVector3f value) { ncenter(address(), value); return this; }
    /** Passes the {@code center} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialAnchorsQueryInfoRadiusML center(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(center()); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrSpatialAnchorsQueryInfoRadiusML time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Sets the specified value to the {@code radius} field. */
    public XrSpatialAnchorsQueryInfoRadiusML radius(float value) { nradius(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialAnchorsQueryInfoRadiusML set(
        int type,
        long next,
        XrSpace baseSpace,
        XrVector3f center,
        long time,
        float radius
    ) {
        type(type);
        next(next);
        baseSpace(baseSpace);
        center(center);
        time(time);
        radius(radius);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialAnchorsQueryInfoRadiusML set(XrSpatialAnchorsQueryInfoRadiusML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialAnchorsQueryInfoRadiusML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsQueryInfoRadiusML malloc() {
        return new XrSpatialAnchorsQueryInfoRadiusML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsQueryInfoRadiusML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialAnchorsQueryInfoRadiusML calloc() {
        return new XrSpatialAnchorsQueryInfoRadiusML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialAnchorsQueryInfoRadiusML} instance allocated with {@link BufferUtils}. */
    public static XrSpatialAnchorsQueryInfoRadiusML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialAnchorsQueryInfoRadiusML(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialAnchorsQueryInfoRadiusML} instance for the specified memory address. */
    public static XrSpatialAnchorsQueryInfoRadiusML create(long address) {
        return new XrSpatialAnchorsQueryInfoRadiusML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialAnchorsQueryInfoRadiusML createSafe(long address) {
        return address == NULL ? null : new XrSpatialAnchorsQueryInfoRadiusML(address, null);
    }

    /** Downcasts the specified {@code XrSpatialAnchorsQueryInfoBaseHeaderML} instance to {@code XrSpatialAnchorsQueryInfoRadiusML}. */
    public static XrSpatialAnchorsQueryInfoRadiusML create(XrSpatialAnchorsQueryInfoBaseHeaderML value) {
        return new XrSpatialAnchorsQueryInfoRadiusML(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSpatialAnchorsQueryInfoRadiusML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryInfoRadiusML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsQueryInfoRadiusML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryInfoRadiusML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsQueryInfoRadiusML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryInfoRadiusML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialAnchorsQueryInfoRadiusML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryInfoRadiusML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialAnchorsQueryInfoRadiusML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrSpatialAnchorsQueryInfoBaseHeaderML.Buffer} instance to {@code XrSpatialAnchorsQueryInfoRadiusML.Buffer}. */
    public static XrSpatialAnchorsQueryInfoRadiusML.Buffer create(XrSpatialAnchorsQueryInfoBaseHeaderML.Buffer value) {
        return new XrSpatialAnchorsQueryInfoRadiusML.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSpatialAnchorsQueryInfoRadiusML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsQueryInfoRadiusML malloc(MemoryStack stack) {
        return new XrSpatialAnchorsQueryInfoRadiusML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialAnchorsQueryInfoRadiusML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialAnchorsQueryInfoRadiusML calloc(MemoryStack stack) {
        return new XrSpatialAnchorsQueryInfoRadiusML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsQueryInfoRadiusML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryInfoRadiusML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialAnchorsQueryInfoRadiusML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialAnchorsQueryInfoRadiusML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialAnchorsQueryInfoRadiusML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialAnchorsQueryInfoRadiusML.NEXT); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrSpatialAnchorsQueryInfoRadiusML.BASESPACE); }
    /** Unsafe version of {@link #center}. */
    public static XrVector3f ncenter(long struct) { return XrVector3f.create(struct + XrSpatialAnchorsQueryInfoRadiusML.CENTER); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrSpatialAnchorsQueryInfoRadiusML.TIME); }
    /** Unsafe version of {@link #radius}. */
    public static float nradius(long struct) { return memGetFloat(struct + XrSpatialAnchorsQueryInfoRadiusML.RADIUS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialAnchorsQueryInfoRadiusML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialAnchorsQueryInfoRadiusML.NEXT, value); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrSpatialAnchorsQueryInfoRadiusML.BASESPACE, value.address()); }
    /** Unsafe version of {@link #center(XrVector3f) center}. */
    public static void ncenter(long struct, XrVector3f value) { memCopy(value.address(), struct + XrSpatialAnchorsQueryInfoRadiusML.CENTER, XrVector3f.SIZEOF); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrSpatialAnchorsQueryInfoRadiusML.TIME, value); }
    /** Unsafe version of {@link #radius(float) radius}. */
    public static void nradius(long struct, float value) { memPutFloat(struct + XrSpatialAnchorsQueryInfoRadiusML.RADIUS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialAnchorsQueryInfoRadiusML.BASESPACE));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialAnchorsQueryInfoRadiusML} structs. */
    public static class Buffer extends StructBuffer<XrSpatialAnchorsQueryInfoRadiusML, Buffer> implements NativeResource {

        private static final XrSpatialAnchorsQueryInfoRadiusML ELEMENT_FACTORY = XrSpatialAnchorsQueryInfoRadiusML.create(-1L);

        /**
         * Creates a new {@code XrSpatialAnchorsQueryInfoRadiusML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialAnchorsQueryInfoRadiusML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialAnchorsQueryInfoRadiusML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialAnchorsQueryInfoRadiusML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialAnchorsQueryInfoRadiusML.nnext(address()); }
        /** @return the value of the {@code baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrSpatialAnchorsQueryInfoRadiusML.nbaseSpace(address()); }
        /** @return a {@link XrVector3f} view of the {@code center} field. */
        public XrVector3f center() { return XrSpatialAnchorsQueryInfoRadiusML.ncenter(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrSpatialAnchorsQueryInfoRadiusML.ntime(address()); }
        /** @return the value of the {@code radius} field. */
        public float radius() { return XrSpatialAnchorsQueryInfoRadiusML.nradius(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialAnchorsQueryInfoRadiusML.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialAnchorsQueryInfoRadiusML.ntype(address(), value); return this; }
        /** Sets the {@link MLSpatialAnchorsStorage#XR_TYPE_SPATIAL_ANCHORS_QUERY_INFO_RADIUS_ML TYPE_SPATIAL_ANCHORS_QUERY_INFO_RADIUS_ML} value to the {@code type} field. */
        public XrSpatialAnchorsQueryInfoRadiusML.Buffer type$Default() { return type(MLSpatialAnchorsStorage.XR_TYPE_SPATIAL_ANCHORS_QUERY_INFO_RADIUS_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialAnchorsQueryInfoRadiusML.Buffer next(@NativeType("void const *") long value) { XrSpatialAnchorsQueryInfoRadiusML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code baseSpace} field. */
        public XrSpatialAnchorsQueryInfoRadiusML.Buffer baseSpace(XrSpace value) { XrSpatialAnchorsQueryInfoRadiusML.nbaseSpace(address(), value); return this; }
        /** Copies the specified {@link XrVector3f} to the {@code center} field. */
        public XrSpatialAnchorsQueryInfoRadiusML.Buffer center(XrVector3f value) { XrSpatialAnchorsQueryInfoRadiusML.ncenter(address(), value); return this; }
        /** Passes the {@code center} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialAnchorsQueryInfoRadiusML.Buffer center(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(center()); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrSpatialAnchorsQueryInfoRadiusML.Buffer time(@NativeType("XrTime") long value) { XrSpatialAnchorsQueryInfoRadiusML.ntime(address(), value); return this; }
        /** Sets the specified value to the {@code radius} field. */
        public XrSpatialAnchorsQueryInfoRadiusML.Buffer radius(float value) { XrSpatialAnchorsQueryInfoRadiusML.nradius(address(), value); return this; }

    }

}
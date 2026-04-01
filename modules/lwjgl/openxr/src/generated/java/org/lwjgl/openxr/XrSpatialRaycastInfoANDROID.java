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
 * struct XrSpatialRaycastInfoANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace space;
 *     XrTime time;
 *     {@link XrVector3f XrVector3f} origin;
 *     {@link XrVector3f XrVector3f} direction;
 *     float maxDistance;
 * }</code></pre>
 */
public class XrSpatialRaycastInfoANDROID extends Struct<XrSpatialRaycastInfoANDROID> implements NativeResource {

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
        ORIGIN,
        DIRECTION,
        MAXDISTANCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF),
            __member(XrVector3f.SIZEOF, XrVector3f.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPACE = layout.offsetof(2);
        TIME = layout.offsetof(3);
        ORIGIN = layout.offsetof(4);
        DIRECTION = layout.offsetof(5);
        MAXDISTANCE = layout.offsetof(6);
    }

    protected XrSpatialRaycastInfoANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialRaycastInfoANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialRaycastInfoANDROID(address, container);
    }

    /**
     * Creates a {@code XrSpatialRaycastInfoANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialRaycastInfoANDROID(ByteBuffer container) {
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
    /** @return a {@link XrVector3f} view of the {@code origin} field. */
    public XrVector3f origin() { return norigin(address()); }
    /** @return a {@link XrVector3f} view of the {@code direction} field. */
    public XrVector3f direction() { return ndirection(address()); }
    /** @return the value of the {@code maxDistance} field. */
    public float maxDistance() { return nmaxDistance(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialRaycastInfoANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDSpatialDiscoveryRaycast#XR_TYPE_SPATIAL_RAYCAST_INFO_ANDROID TYPE_SPATIAL_RAYCAST_INFO_ANDROID} value to the {@code type} field. */
    public XrSpatialRaycastInfoANDROID type$Default() { return type(ANDROIDSpatialDiscoveryRaycast.XR_TYPE_SPATIAL_RAYCAST_INFO_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialRaycastInfoANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code space} field. */
    public XrSpatialRaycastInfoANDROID space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrSpatialRaycastInfoANDROID time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Copies the specified {@link XrVector3f} to the {@code origin} field. */
    public XrSpatialRaycastInfoANDROID origin(XrVector3f value) { norigin(address(), value); return this; }
    /** Passes the {@code origin} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialRaycastInfoANDROID origin(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(origin()); return this; }
    /** Copies the specified {@link XrVector3f} to the {@code direction} field. */
    public XrSpatialRaycastInfoANDROID direction(XrVector3f value) { ndirection(address(), value); return this; }
    /** Passes the {@code direction} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialRaycastInfoANDROID direction(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(direction()); return this; }
    /** Sets the specified value to the {@code maxDistance} field. */
    public XrSpatialRaycastInfoANDROID maxDistance(float value) { nmaxDistance(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialRaycastInfoANDROID set(
        int type,
        long next,
        XrSpace space,
        long time,
        XrVector3f origin,
        XrVector3f direction,
        float maxDistance
    ) {
        type(type);
        next(next);
        space(space);
        time(time);
        origin(origin);
        direction(direction);
        maxDistance(maxDistance);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialRaycastInfoANDROID set(XrSpatialRaycastInfoANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialRaycastInfoANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialRaycastInfoANDROID malloc() {
        return new XrSpatialRaycastInfoANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialRaycastInfoANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialRaycastInfoANDROID calloc() {
        return new XrSpatialRaycastInfoANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialRaycastInfoANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSpatialRaycastInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialRaycastInfoANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialRaycastInfoANDROID} instance for the specified memory address. */
    public static XrSpatialRaycastInfoANDROID create(long address) {
        return new XrSpatialRaycastInfoANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialRaycastInfoANDROID createSafe(long address) {
        return address == NULL ? null : new XrSpatialRaycastInfoANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSpatialRaycastInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialRaycastInfoANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialRaycastInfoANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialRaycastInfoANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialRaycastInfoANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialRaycastInfoANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialRaycastInfoANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialRaycastInfoANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialRaycastInfoANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialRaycastInfoANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialRaycastInfoANDROID malloc(MemoryStack stack) {
        return new XrSpatialRaycastInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialRaycastInfoANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialRaycastInfoANDROID calloc(MemoryStack stack) {
        return new XrSpatialRaycastInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialRaycastInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialRaycastInfoANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialRaycastInfoANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialRaycastInfoANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialRaycastInfoANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialRaycastInfoANDROID.NEXT); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrSpatialRaycastInfoANDROID.SPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrSpatialRaycastInfoANDROID.TIME); }
    /** Unsafe version of {@link #origin}. */
    public static XrVector3f norigin(long struct) { return XrVector3f.create(struct + XrSpatialRaycastInfoANDROID.ORIGIN); }
    /** Unsafe version of {@link #direction}. */
    public static XrVector3f ndirection(long struct) { return XrVector3f.create(struct + XrSpatialRaycastInfoANDROID.DIRECTION); }
    /** Unsafe version of {@link #maxDistance}. */
    public static float nmaxDistance(long struct) { return memGetFloat(struct + XrSpatialRaycastInfoANDROID.MAXDISTANCE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialRaycastInfoANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialRaycastInfoANDROID.NEXT, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrSpatialRaycastInfoANDROID.SPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrSpatialRaycastInfoANDROID.TIME, value); }
    /** Unsafe version of {@link #origin(XrVector3f) origin}. */
    public static void norigin(long struct, XrVector3f value) { memCopy(value.address(), struct + XrSpatialRaycastInfoANDROID.ORIGIN, XrVector3f.SIZEOF); }
    /** Unsafe version of {@link #direction(XrVector3f) direction}. */
    public static void ndirection(long struct, XrVector3f value) { memCopy(value.address(), struct + XrSpatialRaycastInfoANDROID.DIRECTION, XrVector3f.SIZEOF); }
    /** Unsafe version of {@link #maxDistance(float) maxDistance}. */
    public static void nmaxDistance(long struct, float value) { memPutFloat(struct + XrSpatialRaycastInfoANDROID.MAXDISTANCE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialRaycastInfoANDROID.SPACE));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialRaycastInfoANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSpatialRaycastInfoANDROID, Buffer> implements NativeResource {

        private static final XrSpatialRaycastInfoANDROID ELEMENT_FACTORY = XrSpatialRaycastInfoANDROID.create(-1L);

        /**
         * Creates a new {@code XrSpatialRaycastInfoANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialRaycastInfoANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialRaycastInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialRaycastInfoANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialRaycastInfoANDROID.nnext(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrSpatialRaycastInfoANDROID.nspace(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrSpatialRaycastInfoANDROID.ntime(address()); }
        /** @return a {@link XrVector3f} view of the {@code origin} field. */
        public XrVector3f origin() { return XrSpatialRaycastInfoANDROID.norigin(address()); }
        /** @return a {@link XrVector3f} view of the {@code direction} field. */
        public XrVector3f direction() { return XrSpatialRaycastInfoANDROID.ndirection(address()); }
        /** @return the value of the {@code maxDistance} field. */
        public float maxDistance() { return XrSpatialRaycastInfoANDROID.nmaxDistance(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialRaycastInfoANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialRaycastInfoANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDSpatialDiscoveryRaycast#XR_TYPE_SPATIAL_RAYCAST_INFO_ANDROID TYPE_SPATIAL_RAYCAST_INFO_ANDROID} value to the {@code type} field. */
        public XrSpatialRaycastInfoANDROID.Buffer type$Default() { return type(ANDROIDSpatialDiscoveryRaycast.XR_TYPE_SPATIAL_RAYCAST_INFO_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialRaycastInfoANDROID.Buffer next(@NativeType("void const *") long value) { XrSpatialRaycastInfoANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code space} field. */
        public XrSpatialRaycastInfoANDROID.Buffer space(XrSpace value) { XrSpatialRaycastInfoANDROID.nspace(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrSpatialRaycastInfoANDROID.Buffer time(@NativeType("XrTime") long value) { XrSpatialRaycastInfoANDROID.ntime(address(), value); return this; }
        /** Copies the specified {@link XrVector3f} to the {@code origin} field. */
        public XrSpatialRaycastInfoANDROID.Buffer origin(XrVector3f value) { XrSpatialRaycastInfoANDROID.norigin(address(), value); return this; }
        /** Passes the {@code origin} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialRaycastInfoANDROID.Buffer origin(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(origin()); return this; }
        /** Copies the specified {@link XrVector3f} to the {@code direction} field. */
        public XrSpatialRaycastInfoANDROID.Buffer direction(XrVector3f value) { XrSpatialRaycastInfoANDROID.ndirection(address(), value); return this; }
        /** Passes the {@code direction} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialRaycastInfoANDROID.Buffer direction(java.util.function.Consumer<XrVector3f> consumer) { consumer.accept(direction()); return this; }
        /** Sets the specified value to the {@code maxDistance} field. */
        public XrSpatialRaycastInfoANDROID.Buffer maxDistance(float value) { XrSpatialRaycastInfoANDROID.nmaxDistance(address(), value); return this; }

    }

}
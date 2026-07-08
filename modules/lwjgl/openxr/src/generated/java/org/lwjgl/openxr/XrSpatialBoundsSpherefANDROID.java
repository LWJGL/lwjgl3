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
 * struct XrSpatialBoundsSpherefANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace space;
 *     XrTime time;
 *     {@link XrSpheref XrSpheref} sphere;
 * }</code></pre>
 */
public class XrSpatialBoundsSpherefANDROID extends Struct<XrSpatialBoundsSpherefANDROID> implements NativeResource {

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
        SPHERE;

    static {
        XrSpheref.createSafe(NULL);

        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrSpheref.SIZEOF, XrSpheref.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPACE = layout.offsetof(2);
        TIME = layout.offsetof(3);
        SPHERE = layout.offsetof(4);
    }

    protected XrSpatialBoundsSpherefANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialBoundsSpherefANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialBoundsSpherefANDROID(address, container);
    }

    /**
     * Creates a {@code XrSpatialBoundsSpherefANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialBoundsSpherefANDROID(ByteBuffer container) {
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
    /** @return a {@link XrSpheref} view of the {@code sphere} field. */
    public XrSpheref sphere() { return nsphere(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialBoundsSpherefANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDSpatialDiscoveryBounds#XR_TYPE_SPATIAL_BOUNDS_SPHEREF_ANDROID TYPE_SPATIAL_BOUNDS_SPHEREF_ANDROID} value to the {@code type} field. */
    public XrSpatialBoundsSpherefANDROID type$Default() { return type(ANDROIDSpatialDiscoveryBounds.XR_TYPE_SPATIAL_BOUNDS_SPHEREF_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialBoundsSpherefANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code space} field. */
    public XrSpatialBoundsSpherefANDROID space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrSpatialBoundsSpherefANDROID time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Copies the specified {@link XrSpheref} to the {@code sphere} field. */
    public XrSpatialBoundsSpherefANDROID sphere(XrSpheref value) { nsphere(address(), value); return this; }
    /** Passes the {@code sphere} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialBoundsSpherefANDROID sphere(java.util.function.Consumer<XrSpheref> consumer) { consumer.accept(sphere()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialBoundsSpherefANDROID set(
        int type,
        long next,
        XrSpace space,
        long time,
        XrSpheref sphere
    ) {
        type(type);
        next(next);
        space(space);
        time(time);
        sphere(sphere);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialBoundsSpherefANDROID set(XrSpatialBoundsSpherefANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialBoundsSpherefANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialBoundsSpherefANDROID malloc() {
        return new XrSpatialBoundsSpherefANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialBoundsSpherefANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialBoundsSpherefANDROID calloc() {
        return new XrSpatialBoundsSpherefANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialBoundsSpherefANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSpatialBoundsSpherefANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialBoundsSpherefANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialBoundsSpherefANDROID} instance for the specified memory address. */
    public static XrSpatialBoundsSpherefANDROID create(long address) {
        return new XrSpatialBoundsSpherefANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialBoundsSpherefANDROID createSafe(long address) {
        return address == NULL ? null : new XrSpatialBoundsSpherefANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSpatialBoundsSpherefANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialBoundsSpherefANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialBoundsSpherefANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialBoundsSpherefANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialBoundsSpherefANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialBoundsSpherefANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialBoundsSpherefANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialBoundsSpherefANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialBoundsSpherefANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialBoundsSpherefANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialBoundsSpherefANDROID malloc(MemoryStack stack) {
        return new XrSpatialBoundsSpherefANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialBoundsSpherefANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialBoundsSpherefANDROID calloc(MemoryStack stack) {
        return new XrSpatialBoundsSpherefANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialBoundsSpherefANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialBoundsSpherefANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialBoundsSpherefANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialBoundsSpherefANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialBoundsSpherefANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialBoundsSpherefANDROID.NEXT); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrSpatialBoundsSpherefANDROID.SPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrSpatialBoundsSpherefANDROID.TIME); }
    /** Unsafe version of {@link #sphere}. */
    public static XrSpheref nsphere(long struct) { return XrSpheref.create(struct + XrSpatialBoundsSpherefANDROID.SPHERE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialBoundsSpherefANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialBoundsSpherefANDROID.NEXT, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrSpatialBoundsSpherefANDROID.SPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrSpatialBoundsSpherefANDROID.TIME, value); }
    /** Unsafe version of {@link #sphere(XrSpheref) sphere}. */
    public static void nsphere(long struct, XrSpheref value) { memCopy(value.address(), struct + XrSpatialBoundsSpherefANDROID.SPHERE, XrSpheref.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialBoundsSpherefANDROID.SPACE));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialBoundsSpherefANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSpatialBoundsSpherefANDROID, Buffer> implements NativeResource {

        private static final XrSpatialBoundsSpherefANDROID ELEMENT_FACTORY = XrSpatialBoundsSpherefANDROID.create(-1L);

        /**
         * Creates a new {@code XrSpatialBoundsSpherefANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialBoundsSpherefANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialBoundsSpherefANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialBoundsSpherefANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialBoundsSpherefANDROID.nnext(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrSpatialBoundsSpherefANDROID.nspace(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrSpatialBoundsSpherefANDROID.ntime(address()); }
        /** @return a {@link XrSpheref} view of the {@code sphere} field. */
        public XrSpheref sphere() { return XrSpatialBoundsSpherefANDROID.nsphere(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialBoundsSpherefANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialBoundsSpherefANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDSpatialDiscoveryBounds#XR_TYPE_SPATIAL_BOUNDS_SPHEREF_ANDROID TYPE_SPATIAL_BOUNDS_SPHEREF_ANDROID} value to the {@code type} field. */
        public XrSpatialBoundsSpherefANDROID.Buffer type$Default() { return type(ANDROIDSpatialDiscoveryBounds.XR_TYPE_SPATIAL_BOUNDS_SPHEREF_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialBoundsSpherefANDROID.Buffer next(@NativeType("void const *") long value) { XrSpatialBoundsSpherefANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code space} field. */
        public XrSpatialBoundsSpherefANDROID.Buffer space(XrSpace value) { XrSpatialBoundsSpherefANDROID.nspace(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrSpatialBoundsSpherefANDROID.Buffer time(@NativeType("XrTime") long value) { XrSpatialBoundsSpherefANDROID.ntime(address(), value); return this; }
        /** Copies the specified {@link XrSpheref} to the {@code sphere} field. */
        public XrSpatialBoundsSpherefANDROID.Buffer sphere(XrSpheref value) { XrSpatialBoundsSpherefANDROID.nsphere(address(), value); return this; }
        /** Passes the {@code sphere} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialBoundsSpherefANDROID.Buffer sphere(java.util.function.Consumer<XrSpheref> consumer) { consumer.accept(sphere()); return this; }

    }

}
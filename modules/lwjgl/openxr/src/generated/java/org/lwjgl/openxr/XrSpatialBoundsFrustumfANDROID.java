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
 * struct XrSpatialBoundsFrustumfANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     XrSpace space;
 *     XrTime time;
 *     {@link XrFrustumf XrFrustumf} frustum;
 * }</code></pre>
 */
public class XrSpatialBoundsFrustumfANDROID extends Struct<XrSpatialBoundsFrustumfANDROID> implements NativeResource {

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
        FRUSTUM;

    static {
        XrFrustumf.createSafe(NULL);

        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrFrustumf.SIZEOF, XrFrustumf.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SPACE = layout.offsetof(2);
        TIME = layout.offsetof(3);
        FRUSTUM = layout.offsetof(4);
    }

    protected XrSpatialBoundsFrustumfANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialBoundsFrustumfANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialBoundsFrustumfANDROID(address, container);
    }

    /**
     * Creates a {@code XrSpatialBoundsFrustumfANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialBoundsFrustumfANDROID(ByteBuffer container) {
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
    /** @return a {@link XrFrustumf} view of the {@code frustum} field. */
    public XrFrustumf frustum() { return nfrustum(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialBoundsFrustumfANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDSpatialDiscoveryBounds#XR_TYPE_SPATIAL_BOUNDS_FRUSTUMF_ANDROID TYPE_SPATIAL_BOUNDS_FRUSTUMF_ANDROID} value to the {@code type} field. */
    public XrSpatialBoundsFrustumfANDROID type$Default() { return type(ANDROIDSpatialDiscoveryBounds.XR_TYPE_SPATIAL_BOUNDS_FRUSTUMF_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialBoundsFrustumfANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code space} field. */
    public XrSpatialBoundsFrustumfANDROID space(XrSpace value) { nspace(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrSpatialBoundsFrustumfANDROID time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }
    /** Copies the specified {@link XrFrustumf} to the {@code frustum} field. */
    public XrSpatialBoundsFrustumfANDROID frustum(XrFrustumf value) { nfrustum(address(), value); return this; }
    /** Passes the {@code frustum} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSpatialBoundsFrustumfANDROID frustum(java.util.function.Consumer<XrFrustumf> consumer) { consumer.accept(frustum()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialBoundsFrustumfANDROID set(
        int type,
        long next,
        XrSpace space,
        long time,
        XrFrustumf frustum
    ) {
        type(type);
        next(next);
        space(space);
        time(time);
        frustum(frustum);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialBoundsFrustumfANDROID set(XrSpatialBoundsFrustumfANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialBoundsFrustumfANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialBoundsFrustumfANDROID malloc() {
        return new XrSpatialBoundsFrustumfANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialBoundsFrustumfANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialBoundsFrustumfANDROID calloc() {
        return new XrSpatialBoundsFrustumfANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialBoundsFrustumfANDROID} instance allocated with {@link BufferUtils}. */
    public static XrSpatialBoundsFrustumfANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialBoundsFrustumfANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialBoundsFrustumfANDROID} instance for the specified memory address. */
    public static XrSpatialBoundsFrustumfANDROID create(long address) {
        return new XrSpatialBoundsFrustumfANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialBoundsFrustumfANDROID createSafe(long address) {
        return address == NULL ? null : new XrSpatialBoundsFrustumfANDROID(address, null);
    }

    /**
     * Returns a new {@link XrSpatialBoundsFrustumfANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialBoundsFrustumfANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialBoundsFrustumfANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialBoundsFrustumfANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialBoundsFrustumfANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialBoundsFrustumfANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialBoundsFrustumfANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialBoundsFrustumfANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialBoundsFrustumfANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialBoundsFrustumfANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialBoundsFrustumfANDROID malloc(MemoryStack stack) {
        return new XrSpatialBoundsFrustumfANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialBoundsFrustumfANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialBoundsFrustumfANDROID calloc(MemoryStack stack) {
        return new XrSpatialBoundsFrustumfANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialBoundsFrustumfANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialBoundsFrustumfANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialBoundsFrustumfANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialBoundsFrustumfANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialBoundsFrustumfANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialBoundsFrustumfANDROID.NEXT); }
    /** Unsafe version of {@link #space}. */
    public static long nspace(long struct) { return memGetAddress(struct + XrSpatialBoundsFrustumfANDROID.SPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrSpatialBoundsFrustumfANDROID.TIME); }
    /** Unsafe version of {@link #frustum}. */
    public static XrFrustumf nfrustum(long struct) { return XrFrustumf.create(struct + XrSpatialBoundsFrustumfANDROID.FRUSTUM); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialBoundsFrustumfANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialBoundsFrustumfANDROID.NEXT, value); }
    /** Unsafe version of {@link #space(XrSpace) space}. */
    public static void nspace(long struct, XrSpace value) { memPutAddress(struct + XrSpatialBoundsFrustumfANDROID.SPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrSpatialBoundsFrustumfANDROID.TIME, value); }
    /** Unsafe version of {@link #frustum(XrFrustumf) frustum}. */
    public static void nfrustum(long struct, XrFrustumf value) { memCopy(value.address(), struct + XrSpatialBoundsFrustumfANDROID.FRUSTUM, XrFrustumf.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSpatialBoundsFrustumfANDROID.SPACE));
    }

    // -----------------------------------

    /** An array of {@link XrSpatialBoundsFrustumfANDROID} structs. */
    public static class Buffer extends StructBuffer<XrSpatialBoundsFrustumfANDROID, Buffer> implements NativeResource {

        private static final XrSpatialBoundsFrustumfANDROID ELEMENT_FACTORY = XrSpatialBoundsFrustumfANDROID.create(-1L);

        /**
         * Creates a new {@code XrSpatialBoundsFrustumfANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialBoundsFrustumfANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialBoundsFrustumfANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialBoundsFrustumfANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSpatialBoundsFrustumfANDROID.nnext(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("XrSpace")
        public long space() { return XrSpatialBoundsFrustumfANDROID.nspace(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrSpatialBoundsFrustumfANDROID.ntime(address()); }
        /** @return a {@link XrFrustumf} view of the {@code frustum} field. */
        public XrFrustumf frustum() { return XrSpatialBoundsFrustumfANDROID.nfrustum(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialBoundsFrustumfANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialBoundsFrustumfANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDSpatialDiscoveryBounds#XR_TYPE_SPATIAL_BOUNDS_FRUSTUMF_ANDROID TYPE_SPATIAL_BOUNDS_FRUSTUMF_ANDROID} value to the {@code type} field. */
        public XrSpatialBoundsFrustumfANDROID.Buffer type$Default() { return type(ANDROIDSpatialDiscoveryBounds.XR_TYPE_SPATIAL_BOUNDS_FRUSTUMF_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialBoundsFrustumfANDROID.Buffer next(@NativeType("void const *") long value) { XrSpatialBoundsFrustumfANDROID.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code space} field. */
        public XrSpatialBoundsFrustumfANDROID.Buffer space(XrSpace value) { XrSpatialBoundsFrustumfANDROID.nspace(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrSpatialBoundsFrustumfANDROID.Buffer time(@NativeType("XrTime") long value) { XrSpatialBoundsFrustumfANDROID.ntime(address(), value); return this; }
        /** Copies the specified {@link XrFrustumf} to the {@code frustum} field. */
        public XrSpatialBoundsFrustumfANDROID.Buffer frustum(XrFrustumf value) { XrSpatialBoundsFrustumfANDROID.nfrustum(address(), value); return this; }
        /** Passes the {@code frustum} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSpatialBoundsFrustumfANDROID.Buffer frustum(java.util.function.Consumer<XrFrustumf> consumer) { consumer.accept(frustum()); return this; }

    }

}
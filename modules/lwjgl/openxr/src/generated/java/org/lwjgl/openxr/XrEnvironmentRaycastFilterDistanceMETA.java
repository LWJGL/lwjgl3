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
 * struct XrEnvironmentRaycastFilterDistanceMETA {
 *     XrStructureType type;
 *     void const * next;
 *     float maxDistance;
 * }}</pre>
 */
public class XrEnvironmentRaycastFilterDistanceMETA extends Struct<XrEnvironmentRaycastFilterDistanceMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MAXDISTANCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        MAXDISTANCE = layout.offsetof(2);
    }

    protected XrEnvironmentRaycastFilterDistanceMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEnvironmentRaycastFilterDistanceMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEnvironmentRaycastFilterDistanceMETA(address, container);
    }

    /**
     * Creates a {@code XrEnvironmentRaycastFilterDistanceMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEnvironmentRaycastFilterDistanceMETA(ByteBuffer container) {
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
    /** @return the value of the {@code maxDistance} field. */
    public float maxDistance() { return nmaxDistance(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEnvironmentRaycastFilterDistanceMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAEnvironmentRaycast#XR_TYPE_ENVIRONMENT_RAYCAST_FILTER_DISTANCE_META TYPE_ENVIRONMENT_RAYCAST_FILTER_DISTANCE_META} value to the {@code type} field. */
    public XrEnvironmentRaycastFilterDistanceMETA type$Default() { return type(METAEnvironmentRaycast.XR_TYPE_ENVIRONMENT_RAYCAST_FILTER_DISTANCE_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrEnvironmentRaycastFilterDistanceMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code maxDistance} field. */
    public XrEnvironmentRaycastFilterDistanceMETA maxDistance(float value) { nmaxDistance(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEnvironmentRaycastFilterDistanceMETA set(
        int type,
        long next,
        float maxDistance
    ) {
        type(type);
        next(next);
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
    public XrEnvironmentRaycastFilterDistanceMETA set(XrEnvironmentRaycastFilterDistanceMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEnvironmentRaycastFilterDistanceMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEnvironmentRaycastFilterDistanceMETA malloc() {
        return new XrEnvironmentRaycastFilterDistanceMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEnvironmentRaycastFilterDistanceMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEnvironmentRaycastFilterDistanceMETA calloc() {
        return new XrEnvironmentRaycastFilterDistanceMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEnvironmentRaycastFilterDistanceMETA} instance allocated with {@link BufferUtils}. */
    public static XrEnvironmentRaycastFilterDistanceMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEnvironmentRaycastFilterDistanceMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEnvironmentRaycastFilterDistanceMETA} instance for the specified memory address. */
    public static XrEnvironmentRaycastFilterDistanceMETA create(long address) {
        return new XrEnvironmentRaycastFilterDistanceMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEnvironmentRaycastFilterDistanceMETA createSafe(long address) {
        return address == NULL ? null : new XrEnvironmentRaycastFilterDistanceMETA(address, null);
    }

    /** Downcasts the specified {@code XrEnvironmentRaycastFilterBaseHeaderMETA} instance to {@code XrEnvironmentRaycastFilterDistanceMETA}. */
    public static XrEnvironmentRaycastFilterDistanceMETA create(XrEnvironmentRaycastFilterBaseHeaderMETA value) {
        return new XrEnvironmentRaycastFilterDistanceMETA(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEnvironmentRaycastFilterDistanceMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycastFilterDistanceMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycastFilterDistanceMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycastFilterDistanceMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycastFilterDistanceMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycastFilterDistanceMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEnvironmentRaycastFilterDistanceMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycastFilterDistanceMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEnvironmentRaycastFilterDistanceMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEnvironmentRaycastFilterBaseHeaderMETA.Buffer} instance to {@code XrEnvironmentRaycastFilterDistanceMETA.Buffer}. */
    public static XrEnvironmentRaycastFilterDistanceMETA.Buffer create(XrEnvironmentRaycastFilterBaseHeaderMETA.Buffer value) {
        return new XrEnvironmentRaycastFilterDistanceMETA.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEnvironmentRaycastFilterDistanceMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEnvironmentRaycastFilterDistanceMETA malloc(MemoryStack stack) {
        return new XrEnvironmentRaycastFilterDistanceMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEnvironmentRaycastFilterDistanceMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEnvironmentRaycastFilterDistanceMETA calloc(MemoryStack stack) {
        return new XrEnvironmentRaycastFilterDistanceMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycastFilterDistanceMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycastFilterDistanceMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycastFilterDistanceMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycastFilterDistanceMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEnvironmentRaycastFilterDistanceMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEnvironmentRaycastFilterDistanceMETA.NEXT); }
    /** Unsafe version of {@link #maxDistance}. */
    public static float nmaxDistance(long struct) { return memGetFloat(struct + XrEnvironmentRaycastFilterDistanceMETA.MAXDISTANCE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEnvironmentRaycastFilterDistanceMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEnvironmentRaycastFilterDistanceMETA.NEXT, value); }
    /** Unsafe version of {@link #maxDistance(float) maxDistance}. */
    public static void nmaxDistance(long struct, float value) { memPutFloat(struct + XrEnvironmentRaycastFilterDistanceMETA.MAXDISTANCE, value); }

    // -----------------------------------

    /** An array of {@link XrEnvironmentRaycastFilterDistanceMETA} structs. */
    public static class Buffer extends StructBuffer<XrEnvironmentRaycastFilterDistanceMETA, Buffer> implements NativeResource {

        private static final XrEnvironmentRaycastFilterDistanceMETA ELEMENT_FACTORY = XrEnvironmentRaycastFilterDistanceMETA.create(-1L);

        /**
         * Creates a new {@code XrEnvironmentRaycastFilterDistanceMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEnvironmentRaycastFilterDistanceMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEnvironmentRaycastFilterDistanceMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEnvironmentRaycastFilterDistanceMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEnvironmentRaycastFilterDistanceMETA.nnext(address()); }
        /** @return the value of the {@code maxDistance} field. */
        public float maxDistance() { return XrEnvironmentRaycastFilterDistanceMETA.nmaxDistance(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEnvironmentRaycastFilterDistanceMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEnvironmentRaycastFilterDistanceMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAEnvironmentRaycast#XR_TYPE_ENVIRONMENT_RAYCAST_FILTER_DISTANCE_META TYPE_ENVIRONMENT_RAYCAST_FILTER_DISTANCE_META} value to the {@code type} field. */
        public XrEnvironmentRaycastFilterDistanceMETA.Buffer type$Default() { return type(METAEnvironmentRaycast.XR_TYPE_ENVIRONMENT_RAYCAST_FILTER_DISTANCE_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrEnvironmentRaycastFilterDistanceMETA.Buffer next(@NativeType("void const *") long value) { XrEnvironmentRaycastFilterDistanceMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code maxDistance} field. */
        public XrEnvironmentRaycastFilterDistanceMETA.Buffer maxDistance(float value) { XrEnvironmentRaycastFilterDistanceMETA.nmaxDistance(address(), value); return this; }

    }

}
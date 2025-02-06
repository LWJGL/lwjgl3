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
 * struct XrBodyTrackerCreateInfoBD {
 *     XrStructureType type;
 *     void const * next;
 *     XrBodyJointSetBD jointSet;
 * }}</pre>
 */
public class XrBodyTrackerCreateInfoBD extends Struct<XrBodyTrackerCreateInfoBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        JOINTSET;

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
        JOINTSET = layout.offsetof(2);
    }

    protected XrBodyTrackerCreateInfoBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodyTrackerCreateInfoBD create(long address, @Nullable ByteBuffer container) {
        return new XrBodyTrackerCreateInfoBD(address, container);
    }

    /**
     * Creates a {@code XrBodyTrackerCreateInfoBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodyTrackerCreateInfoBD(ByteBuffer container) {
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
    /** @return the value of the {@code jointSet} field. */
    @NativeType("XrBodyJointSetBD")
    public int jointSet() { return njointSet(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrBodyTrackerCreateInfoBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDBodyTracking#XR_TYPE_BODY_TRACKER_CREATE_INFO_BD TYPE_BODY_TRACKER_CREATE_INFO_BD} value to the {@code type} field. */
    public XrBodyTrackerCreateInfoBD type$Default() { return type(BDBodyTracking.XR_TYPE_BODY_TRACKER_CREATE_INFO_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrBodyTrackerCreateInfoBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code jointSet} field. */
    public XrBodyTrackerCreateInfoBD jointSet(@NativeType("XrBodyJointSetBD") int value) { njointSet(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBodyTrackerCreateInfoBD set(
        int type,
        long next,
        int jointSet
    ) {
        type(type);
        next(next);
        jointSet(jointSet);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBodyTrackerCreateInfoBD set(XrBodyTrackerCreateInfoBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodyTrackerCreateInfoBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodyTrackerCreateInfoBD malloc() {
        return new XrBodyTrackerCreateInfoBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodyTrackerCreateInfoBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodyTrackerCreateInfoBD calloc() {
        return new XrBodyTrackerCreateInfoBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodyTrackerCreateInfoBD} instance allocated with {@link BufferUtils}. */
    public static XrBodyTrackerCreateInfoBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodyTrackerCreateInfoBD(memAddress(container), container);
    }

    /** Returns a new {@code XrBodyTrackerCreateInfoBD} instance for the specified memory address. */
    public static XrBodyTrackerCreateInfoBD create(long address) {
        return new XrBodyTrackerCreateInfoBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBodyTrackerCreateInfoBD createSafe(long address) {
        return address == NULL ? null : new XrBodyTrackerCreateInfoBD(address, null);
    }

    /**
     * Returns a new {@link XrBodyTrackerCreateInfoBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackerCreateInfoBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackerCreateInfoBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodyTrackerCreateInfoBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBodyTrackerCreateInfoBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodyTrackerCreateInfoBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyTrackerCreateInfoBD malloc(MemoryStack stack) {
        return new XrBodyTrackerCreateInfoBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodyTrackerCreateInfoBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyTrackerCreateInfoBD calloc(MemoryStack stack) {
        return new XrBodyTrackerCreateInfoBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodyTrackerCreateInfoBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackerCreateInfoBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrBodyTrackerCreateInfoBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBodyTrackerCreateInfoBD.NEXT); }
    /** Unsafe version of {@link #jointSet}. */
    public static int njointSet(long struct) { return memGetInt(struct + XrBodyTrackerCreateInfoBD.JOINTSET); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrBodyTrackerCreateInfoBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBodyTrackerCreateInfoBD.NEXT, value); }
    /** Unsafe version of {@link #jointSet(int) jointSet}. */
    public static void njointSet(long struct, int value) { memPutInt(struct + XrBodyTrackerCreateInfoBD.JOINTSET, value); }

    // -----------------------------------

    /** An array of {@link XrBodyTrackerCreateInfoBD} structs. */
    public static class Buffer extends StructBuffer<XrBodyTrackerCreateInfoBD, Buffer> implements NativeResource {

        private static final XrBodyTrackerCreateInfoBD ELEMENT_FACTORY = XrBodyTrackerCreateInfoBD.create(-1L);

        /**
         * Creates a new {@code XrBodyTrackerCreateInfoBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodyTrackerCreateInfoBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodyTrackerCreateInfoBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBodyTrackerCreateInfoBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrBodyTrackerCreateInfoBD.nnext(address()); }
        /** @return the value of the {@code jointSet} field. */
        @NativeType("XrBodyJointSetBD")
        public int jointSet() { return XrBodyTrackerCreateInfoBD.njointSet(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrBodyTrackerCreateInfoBD.Buffer type(@NativeType("XrStructureType") int value) { XrBodyTrackerCreateInfoBD.ntype(address(), value); return this; }
        /** Sets the {@link BDBodyTracking#XR_TYPE_BODY_TRACKER_CREATE_INFO_BD TYPE_BODY_TRACKER_CREATE_INFO_BD} value to the {@code type} field. */
        public XrBodyTrackerCreateInfoBD.Buffer type$Default() { return type(BDBodyTracking.XR_TYPE_BODY_TRACKER_CREATE_INFO_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrBodyTrackerCreateInfoBD.Buffer next(@NativeType("void const *") long value) { XrBodyTrackerCreateInfoBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code jointSet} field. */
        public XrBodyTrackerCreateInfoBD.Buffer jointSet(@NativeType("XrBodyJointSetBD") int value) { XrBodyTrackerCreateInfoBD.njointSet(address(), value); return this; }

    }

}
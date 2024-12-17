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
 * struct XrBodyTrackerCreateInfoHTC {
 *     XrStructureType type;
 *     void const * next;
 *     XrBodyJointSetHTC bodyJointSet;
 * }}</pre>
 */
public class XrBodyTrackerCreateInfoHTC extends Struct<XrBodyTrackerCreateInfoHTC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BODYJOINTSET;

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
        BODYJOINTSET = layout.offsetof(2);
    }

    protected XrBodyTrackerCreateInfoHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBodyTrackerCreateInfoHTC create(long address, @Nullable ByteBuffer container) {
        return new XrBodyTrackerCreateInfoHTC(address, container);
    }

    /**
     * Creates a {@code XrBodyTrackerCreateInfoHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBodyTrackerCreateInfoHTC(ByteBuffer container) {
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
    /** @return the value of the {@code bodyJointSet} field. */
    @NativeType("XrBodyJointSetHTC")
    public int bodyJointSet() { return nbodyJointSet(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrBodyTrackerCreateInfoHTC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCBodyTracking#XR_TYPE_BODY_TRACKER_CREATE_INFO_HTC TYPE_BODY_TRACKER_CREATE_INFO_HTC} value to the {@code type} field. */
    public XrBodyTrackerCreateInfoHTC type$Default() { return type(HTCBodyTracking.XR_TYPE_BODY_TRACKER_CREATE_INFO_HTC); }
    /** Sets the specified value to the {@code next} field. */
    public XrBodyTrackerCreateInfoHTC next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code bodyJointSet} field. */
    public XrBodyTrackerCreateInfoHTC bodyJointSet(@NativeType("XrBodyJointSetHTC") int value) { nbodyJointSet(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBodyTrackerCreateInfoHTC set(
        int type,
        long next,
        int bodyJointSet
    ) {
        type(type);
        next(next);
        bodyJointSet(bodyJointSet);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrBodyTrackerCreateInfoHTC set(XrBodyTrackerCreateInfoHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBodyTrackerCreateInfoHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBodyTrackerCreateInfoHTC malloc() {
        return new XrBodyTrackerCreateInfoHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBodyTrackerCreateInfoHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBodyTrackerCreateInfoHTC calloc() {
        return new XrBodyTrackerCreateInfoHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBodyTrackerCreateInfoHTC} instance allocated with {@link BufferUtils}. */
    public static XrBodyTrackerCreateInfoHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBodyTrackerCreateInfoHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrBodyTrackerCreateInfoHTC} instance for the specified memory address. */
    public static XrBodyTrackerCreateInfoHTC create(long address) {
        return new XrBodyTrackerCreateInfoHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBodyTrackerCreateInfoHTC createSafe(long address) {
        return address == NULL ? null : new XrBodyTrackerCreateInfoHTC(address, null);
    }

    /**
     * Returns a new {@link XrBodyTrackerCreateInfoHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackerCreateInfoHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackerCreateInfoHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBodyTrackerCreateInfoHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBodyTrackerCreateInfoHTC.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrBodyTrackerCreateInfoHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyTrackerCreateInfoHTC malloc(MemoryStack stack) {
        return new XrBodyTrackerCreateInfoHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBodyTrackerCreateInfoHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBodyTrackerCreateInfoHTC calloc(MemoryStack stack) {
        return new XrBodyTrackerCreateInfoHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBodyTrackerCreateInfoHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBodyTrackerCreateInfoHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBodyTrackerCreateInfoHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrBodyTrackerCreateInfoHTC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBodyTrackerCreateInfoHTC.NEXT); }
    /** Unsafe version of {@link #bodyJointSet}. */
    public static int nbodyJointSet(long struct) { return memGetInt(struct + XrBodyTrackerCreateInfoHTC.BODYJOINTSET); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrBodyTrackerCreateInfoHTC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBodyTrackerCreateInfoHTC.NEXT, value); }
    /** Unsafe version of {@link #bodyJointSet(int) bodyJointSet}. */
    public static void nbodyJointSet(long struct, int value) { memPutInt(struct + XrBodyTrackerCreateInfoHTC.BODYJOINTSET, value); }

    // -----------------------------------

    /** An array of {@link XrBodyTrackerCreateInfoHTC} structs. */
    public static class Buffer extends StructBuffer<XrBodyTrackerCreateInfoHTC, Buffer> implements NativeResource {

        private static final XrBodyTrackerCreateInfoHTC ELEMENT_FACTORY = XrBodyTrackerCreateInfoHTC.create(-1L);

        /**
         * Creates a new {@code XrBodyTrackerCreateInfoHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBodyTrackerCreateInfoHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBodyTrackerCreateInfoHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBodyTrackerCreateInfoHTC.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrBodyTrackerCreateInfoHTC.nnext(address()); }
        /** @return the value of the {@code bodyJointSet} field. */
        @NativeType("XrBodyJointSetHTC")
        public int bodyJointSet() { return XrBodyTrackerCreateInfoHTC.nbodyJointSet(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrBodyTrackerCreateInfoHTC.Buffer type(@NativeType("XrStructureType") int value) { XrBodyTrackerCreateInfoHTC.ntype(address(), value); return this; }
        /** Sets the {@link HTCBodyTracking#XR_TYPE_BODY_TRACKER_CREATE_INFO_HTC TYPE_BODY_TRACKER_CREATE_INFO_HTC} value to the {@code type} field. */
        public XrBodyTrackerCreateInfoHTC.Buffer type$Default() { return type(HTCBodyTracking.XR_TYPE_BODY_TRACKER_CREATE_INFO_HTC); }
        /** Sets the specified value to the {@code next} field. */
        public XrBodyTrackerCreateInfoHTC.Buffer next(@NativeType("void const *") long value) { XrBodyTrackerCreateInfoHTC.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code bodyJointSet} field. */
        public XrBodyTrackerCreateInfoHTC.Buffer bodyJointSet(@NativeType("XrBodyJointSetHTC") int value) { XrBodyTrackerCreateInfoHTC.nbodyJointSet(address(), value); return this; }

    }

}
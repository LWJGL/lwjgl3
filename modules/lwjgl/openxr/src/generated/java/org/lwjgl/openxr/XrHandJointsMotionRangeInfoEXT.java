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
 * struct XrHandJointsMotionRangeInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrHandJointsMotionRangeEXT handJointsMotionRange;
 * }}</pre>
 */
public class XrHandJointsMotionRangeInfoEXT extends Struct<XrHandJointsMotionRangeInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        HANDJOINTSMOTIONRANGE;

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
        HANDJOINTSMOTIONRANGE = layout.offsetof(2);
    }

    protected XrHandJointsMotionRangeInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrHandJointsMotionRangeInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrHandJointsMotionRangeInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrHandJointsMotionRangeInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandJointsMotionRangeInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code handJointsMotionRange} field. */
    @NativeType("XrHandJointsMotionRangeEXT")
    public int handJointsMotionRange() { return nhandJointsMotionRange(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrHandJointsMotionRangeInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTHandJointsMotionRange#XR_TYPE_HAND_JOINTS_MOTION_RANGE_INFO_EXT TYPE_HAND_JOINTS_MOTION_RANGE_INFO_EXT} value to the {@code type} field. */
    public XrHandJointsMotionRangeInfoEXT type$Default() { return type(EXTHandJointsMotionRange.XR_TYPE_HAND_JOINTS_MOTION_RANGE_INFO_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrHandJointsMotionRangeInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code handJointsMotionRange} field. */
    public XrHandJointsMotionRangeInfoEXT handJointsMotionRange(@NativeType("XrHandJointsMotionRangeEXT") int value) { nhandJointsMotionRange(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandJointsMotionRangeInfoEXT set(
        int type,
        long next,
        int handJointsMotionRange
    ) {
        type(type);
        next(next);
        handJointsMotionRange(handJointsMotionRange);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHandJointsMotionRangeInfoEXT set(XrHandJointsMotionRangeInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandJointsMotionRangeInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandJointsMotionRangeInfoEXT malloc() {
        return new XrHandJointsMotionRangeInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrHandJointsMotionRangeInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandJointsMotionRangeInfoEXT calloc() {
        return new XrHandJointsMotionRangeInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrHandJointsMotionRangeInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrHandJointsMotionRangeInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrHandJointsMotionRangeInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrHandJointsMotionRangeInfoEXT} instance for the specified memory address. */
    public static XrHandJointsMotionRangeInfoEXT create(long address) {
        return new XrHandJointsMotionRangeInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrHandJointsMotionRangeInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrHandJointsMotionRangeInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrHandJointsMotionRangeInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointsMotionRangeInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandJointsMotionRangeInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointsMotionRangeInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandJointsMotionRangeInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandJointsMotionRangeInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrHandJointsMotionRangeInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandJointsMotionRangeInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrHandJointsMotionRangeInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrHandJointsMotionRangeInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandJointsMotionRangeInfoEXT malloc(MemoryStack stack) {
        return new XrHandJointsMotionRangeInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrHandJointsMotionRangeInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandJointsMotionRangeInfoEXT calloc(MemoryStack stack) {
        return new XrHandJointsMotionRangeInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrHandJointsMotionRangeInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandJointsMotionRangeInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandJointsMotionRangeInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandJointsMotionRangeInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrHandJointsMotionRangeInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandJointsMotionRangeInfoEXT.NEXT); }
    /** Unsafe version of {@link #handJointsMotionRange}. */
    public static int nhandJointsMotionRange(long struct) { return memGetInt(struct + XrHandJointsMotionRangeInfoEXT.HANDJOINTSMOTIONRANGE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrHandJointsMotionRangeInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHandJointsMotionRangeInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #handJointsMotionRange(int) handJointsMotionRange}. */
    public static void nhandJointsMotionRange(long struct, int value) { memPutInt(struct + XrHandJointsMotionRangeInfoEXT.HANDJOINTSMOTIONRANGE, value); }

    // -----------------------------------

    /** An array of {@link XrHandJointsMotionRangeInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrHandJointsMotionRangeInfoEXT, Buffer> implements NativeResource {

        private static final XrHandJointsMotionRangeInfoEXT ELEMENT_FACTORY = XrHandJointsMotionRangeInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrHandJointsMotionRangeInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandJointsMotionRangeInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrHandJointsMotionRangeInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandJointsMotionRangeInfoEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrHandJointsMotionRangeInfoEXT.nnext(address()); }
        /** @return the value of the {@code handJointsMotionRange} field. */
        @NativeType("XrHandJointsMotionRangeEXT")
        public int handJointsMotionRange() { return XrHandJointsMotionRangeInfoEXT.nhandJointsMotionRange(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrHandJointsMotionRangeInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrHandJointsMotionRangeInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTHandJointsMotionRange#XR_TYPE_HAND_JOINTS_MOTION_RANGE_INFO_EXT TYPE_HAND_JOINTS_MOTION_RANGE_INFO_EXT} value to the {@code type} field. */
        public XrHandJointsMotionRangeInfoEXT.Buffer type$Default() { return type(EXTHandJointsMotionRange.XR_TYPE_HAND_JOINTS_MOTION_RANGE_INFO_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrHandJointsMotionRangeInfoEXT.Buffer next(@NativeType("void const *") long value) { XrHandJointsMotionRangeInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code handJointsMotionRange} field. */
        public XrHandJointsMotionRangeInfoEXT.Buffer handJointsMotionRange(@NativeType("XrHandJointsMotionRangeEXT") int value) { XrHandJointsMotionRangeInfoEXT.nhandJointsMotionRange(address(), value); return this; }

    }

}
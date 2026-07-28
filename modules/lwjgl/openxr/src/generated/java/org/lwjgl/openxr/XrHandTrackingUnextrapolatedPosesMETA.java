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
 * struct XrHandTrackingUnextrapolatedPosesMETA {
 *     XrStructureType type;
 *     void * next;
 *     XrTime captureTime;
 * }}</pre>
 */
public class XrHandTrackingUnextrapolatedPosesMETA extends Struct<XrHandTrackingUnextrapolatedPosesMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CAPTURETIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        CAPTURETIME = layout.offsetof(2);
    }

    protected XrHandTrackingUnextrapolatedPosesMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrHandTrackingUnextrapolatedPosesMETA create(long address, @Nullable ByteBuffer container) {
        return new XrHandTrackingUnextrapolatedPosesMETA(address, container);
    }

    /**
     * Creates a {@code XrHandTrackingUnextrapolatedPosesMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandTrackingUnextrapolatedPosesMETA(ByteBuffer container) {
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
    /** @return the value of the {@code captureTime} field. */
    @NativeType("XrTime")
    public long captureTime() { return ncaptureTime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrHandTrackingUnextrapolatedPosesMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAHandTrackingUnextrapolatedPoses#XR_TYPE_HAND_TRACKING_UNEXTRAPOLATED_POSES_META TYPE_HAND_TRACKING_UNEXTRAPOLATED_POSES_META} value to the {@code type} field. */
    public XrHandTrackingUnextrapolatedPosesMETA type$Default() { return type(METAHandTrackingUnextrapolatedPoses.XR_TYPE_HAND_TRACKING_UNEXTRAPOLATED_POSES_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrHandTrackingUnextrapolatedPosesMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandTrackingUnextrapolatedPosesMETA set(
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
    public XrHandTrackingUnextrapolatedPosesMETA set(XrHandTrackingUnextrapolatedPosesMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandTrackingUnextrapolatedPosesMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandTrackingUnextrapolatedPosesMETA malloc() {
        return new XrHandTrackingUnextrapolatedPosesMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrHandTrackingUnextrapolatedPosesMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandTrackingUnextrapolatedPosesMETA calloc() {
        return new XrHandTrackingUnextrapolatedPosesMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrHandTrackingUnextrapolatedPosesMETA} instance allocated with {@link BufferUtils}. */
    public static XrHandTrackingUnextrapolatedPosesMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrHandTrackingUnextrapolatedPosesMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrHandTrackingUnextrapolatedPosesMETA} instance for the specified memory address. */
    public static XrHandTrackingUnextrapolatedPosesMETA create(long address) {
        return new XrHandTrackingUnextrapolatedPosesMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrHandTrackingUnextrapolatedPosesMETA createSafe(long address) {
        return address == NULL ? null : new XrHandTrackingUnextrapolatedPosesMETA(address, null);
    }

    /**
     * Returns a new {@link XrHandTrackingUnextrapolatedPosesMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingUnextrapolatedPosesMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandTrackingUnextrapolatedPosesMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingUnextrapolatedPosesMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandTrackingUnextrapolatedPosesMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingUnextrapolatedPosesMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrHandTrackingUnextrapolatedPosesMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingUnextrapolatedPosesMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrHandTrackingUnextrapolatedPosesMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrHandTrackingUnextrapolatedPosesMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandTrackingUnextrapolatedPosesMETA malloc(MemoryStack stack) {
        return new XrHandTrackingUnextrapolatedPosesMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrHandTrackingUnextrapolatedPosesMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandTrackingUnextrapolatedPosesMETA calloc(MemoryStack stack) {
        return new XrHandTrackingUnextrapolatedPosesMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrHandTrackingUnextrapolatedPosesMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingUnextrapolatedPosesMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandTrackingUnextrapolatedPosesMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandTrackingUnextrapolatedPosesMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrHandTrackingUnextrapolatedPosesMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandTrackingUnextrapolatedPosesMETA.NEXT); }
    /** Unsafe version of {@link #captureTime}. */
    public static long ncaptureTime(long struct) { return memGetLong(struct + XrHandTrackingUnextrapolatedPosesMETA.CAPTURETIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrHandTrackingUnextrapolatedPosesMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHandTrackingUnextrapolatedPosesMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrHandTrackingUnextrapolatedPosesMETA} structs. */
    public static class Buffer extends StructBuffer<XrHandTrackingUnextrapolatedPosesMETA, Buffer> implements NativeResource {

        private static final XrHandTrackingUnextrapolatedPosesMETA ELEMENT_FACTORY = XrHandTrackingUnextrapolatedPosesMETA.create(-1L);

        /**
         * Creates a new {@code XrHandTrackingUnextrapolatedPosesMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandTrackingUnextrapolatedPosesMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrHandTrackingUnextrapolatedPosesMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandTrackingUnextrapolatedPosesMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrHandTrackingUnextrapolatedPosesMETA.nnext(address()); }
        /** @return the value of the {@code captureTime} field. */
        @NativeType("XrTime")
        public long captureTime() { return XrHandTrackingUnextrapolatedPosesMETA.ncaptureTime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrHandTrackingUnextrapolatedPosesMETA.Buffer type(@NativeType("XrStructureType") int value) { XrHandTrackingUnextrapolatedPosesMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAHandTrackingUnextrapolatedPoses#XR_TYPE_HAND_TRACKING_UNEXTRAPOLATED_POSES_META TYPE_HAND_TRACKING_UNEXTRAPOLATED_POSES_META} value to the {@code type} field. */
        public XrHandTrackingUnextrapolatedPosesMETA.Buffer type$Default() { return type(METAHandTrackingUnextrapolatedPoses.XR_TYPE_HAND_TRACKING_UNEXTRAPOLATED_POSES_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrHandTrackingUnextrapolatedPosesMETA.Buffer next(@NativeType("void *") long value) { XrHandTrackingUnextrapolatedPosesMETA.nnext(address(), value); return this; }

    }

}
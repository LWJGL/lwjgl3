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
 * struct XrSimultaneousHandsAndControllersTrackingResumeInfoMETA {
 *     XrStructureType type;
 *     void const * next;
 * }}</pre>
 */
public class XrSimultaneousHandsAndControllersTrackingResumeInfoMETA extends Struct<XrSimultaneousHandsAndControllersTrackingResumeInfoMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    protected XrSimultaneousHandsAndControllersTrackingResumeInfoMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSimultaneousHandsAndControllersTrackingResumeInfoMETA create(long address, @Nullable ByteBuffer container) {
        return new XrSimultaneousHandsAndControllersTrackingResumeInfoMETA(address, container);
    }

    /**
     * Creates a {@code XrSimultaneousHandsAndControllersTrackingResumeInfoMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSimultaneousHandsAndControllersTrackingResumeInfoMETA(ByteBuffer container) {
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

    /** Sets the specified value to the {@code type} field. */
    public XrSimultaneousHandsAndControllersTrackingResumeInfoMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METASimultaneousHandsAndControllers#XR_TYPE_SIMULTANEOUS_HANDS_AND_CONTROLLERS_TRACKING_RESUME_INFO_META TYPE_SIMULTANEOUS_HANDS_AND_CONTROLLERS_TRACKING_RESUME_INFO_META} value to the {@code type} field. */
    public XrSimultaneousHandsAndControllersTrackingResumeInfoMETA type$Default() { return type(METASimultaneousHandsAndControllers.XR_TYPE_SIMULTANEOUS_HANDS_AND_CONTROLLERS_TRACKING_RESUME_INFO_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrSimultaneousHandsAndControllersTrackingResumeInfoMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSimultaneousHandsAndControllersTrackingResumeInfoMETA set(
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
    public XrSimultaneousHandsAndControllersTrackingResumeInfoMETA set(XrSimultaneousHandsAndControllersTrackingResumeInfoMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSimultaneousHandsAndControllersTrackingResumeInfoMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSimultaneousHandsAndControllersTrackingResumeInfoMETA malloc() {
        return new XrSimultaneousHandsAndControllersTrackingResumeInfoMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSimultaneousHandsAndControllersTrackingResumeInfoMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSimultaneousHandsAndControllersTrackingResumeInfoMETA calloc() {
        return new XrSimultaneousHandsAndControllersTrackingResumeInfoMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSimultaneousHandsAndControllersTrackingResumeInfoMETA} instance allocated with {@link BufferUtils}. */
    public static XrSimultaneousHandsAndControllersTrackingResumeInfoMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSimultaneousHandsAndControllersTrackingResumeInfoMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrSimultaneousHandsAndControllersTrackingResumeInfoMETA} instance for the specified memory address. */
    public static XrSimultaneousHandsAndControllersTrackingResumeInfoMETA create(long address) {
        return new XrSimultaneousHandsAndControllersTrackingResumeInfoMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSimultaneousHandsAndControllersTrackingResumeInfoMETA createSafe(long address) {
        return address == NULL ? null : new XrSimultaneousHandsAndControllersTrackingResumeInfoMETA(address, null);
    }

    /**
     * Returns a new {@link XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSimultaneousHandsAndControllersTrackingResumeInfoMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSimultaneousHandsAndControllersTrackingResumeInfoMETA malloc(MemoryStack stack) {
        return new XrSimultaneousHandsAndControllersTrackingResumeInfoMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSimultaneousHandsAndControllersTrackingResumeInfoMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSimultaneousHandsAndControllersTrackingResumeInfoMETA calloc(MemoryStack stack) {
        return new XrSimultaneousHandsAndControllersTrackingResumeInfoMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSimultaneousHandsAndControllersTrackingResumeInfoMETA} structs. */
    public static class Buffer extends StructBuffer<XrSimultaneousHandsAndControllersTrackingResumeInfoMETA, Buffer> implements NativeResource {

        private static final XrSimultaneousHandsAndControllersTrackingResumeInfoMETA ELEMENT_FACTORY = XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.create(-1L);

        /**
         * Creates a new {@code XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSimultaneousHandsAndControllersTrackingResumeInfoMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSimultaneousHandsAndControllersTrackingResumeInfoMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.nnext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.Buffer type(@NativeType("XrStructureType") int value) { XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.ntype(address(), value); return this; }
        /** Sets the {@link METASimultaneousHandsAndControllers#XR_TYPE_SIMULTANEOUS_HANDS_AND_CONTROLLERS_TRACKING_RESUME_INFO_META TYPE_SIMULTANEOUS_HANDS_AND_CONTROLLERS_TRACKING_RESUME_INFO_META} value to the {@code type} field. */
        public XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.Buffer type$Default() { return type(METASimultaneousHandsAndControllers.XR_TYPE_SIMULTANEOUS_HANDS_AND_CONTROLLERS_TRACKING_RESUME_INFO_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.Buffer next(@NativeType("void const *") long value) { XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.nnext(address(), value); return this; }

    }

}
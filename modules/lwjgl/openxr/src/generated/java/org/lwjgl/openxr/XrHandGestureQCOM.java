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
 * struct XrHandGestureQCOM {
 *     XrHandGestureTypeQCOM gesture;
 *     float gestureRatio;
 *     float flipRatio;
 * }}</pre>
 */
public class XrHandGestureQCOM extends Struct<XrHandGestureQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        GESTURE,
        GESTURERATIO,
        FLIPRATIO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        GESTURE = layout.offsetof(0);
        GESTURERATIO = layout.offsetof(1);
        FLIPRATIO = layout.offsetof(2);
    }

    protected XrHandGestureQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrHandGestureQCOM create(long address, @Nullable ByteBuffer container) {
        return new XrHandGestureQCOM(address, container);
    }

    /**
     * Creates a {@code XrHandGestureQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandGestureQCOM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code gesture} field. */
    @NativeType("XrHandGestureTypeQCOM")
    public int gesture() { return ngesture(address()); }
    /** @return the value of the {@code gestureRatio} field. */
    public float gestureRatio() { return ngestureRatio(address()); }
    /** @return the value of the {@code flipRatio} field. */
    public float flipRatio() { return nflipRatio(address()); }

    /** Sets the specified value to the {@code gesture} field. */
    public XrHandGestureQCOM gesture(@NativeType("XrHandGestureTypeQCOM") int value) { ngesture(address(), value); return this; }
    /** Sets the specified value to the {@code gestureRatio} field. */
    public XrHandGestureQCOM gestureRatio(float value) { ngestureRatio(address(), value); return this; }
    /** Sets the specified value to the {@code flipRatio} field. */
    public XrHandGestureQCOM flipRatio(float value) { nflipRatio(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandGestureQCOM set(
        int gesture,
        float gestureRatio,
        float flipRatio
    ) {
        gesture(gesture);
        gestureRatio(gestureRatio);
        flipRatio(flipRatio);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHandGestureQCOM set(XrHandGestureQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandGestureQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandGestureQCOM malloc() {
        return new XrHandGestureQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrHandGestureQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandGestureQCOM calloc() {
        return new XrHandGestureQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrHandGestureQCOM} instance allocated with {@link BufferUtils}. */
    public static XrHandGestureQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrHandGestureQCOM(memAddress(container), container);
    }

    /** Returns a new {@code XrHandGestureQCOM} instance for the specified memory address. */
    public static XrHandGestureQCOM create(long address) {
        return new XrHandGestureQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrHandGestureQCOM createSafe(long address) {
        return address == NULL ? null : new XrHandGestureQCOM(address, null);
    }

    /**
     * Returns a new {@link XrHandGestureQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandGestureQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHandGestureQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandGestureQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandGestureQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHandGestureQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrHandGestureQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHandGestureQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrHandGestureQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrHandGestureQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandGestureQCOM malloc(MemoryStack stack) {
        return new XrHandGestureQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrHandGestureQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandGestureQCOM calloc(MemoryStack stack) {
        return new XrHandGestureQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrHandGestureQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandGestureQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHandGestureQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHandGestureQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #gesture}. */
    public static int ngesture(long struct) { return memGetInt(struct + XrHandGestureQCOM.GESTURE); }
    /** Unsafe version of {@link #gestureRatio}. */
    public static float ngestureRatio(long struct) { return memGetFloat(struct + XrHandGestureQCOM.GESTURERATIO); }
    /** Unsafe version of {@link #flipRatio}. */
    public static float nflipRatio(long struct) { return memGetFloat(struct + XrHandGestureQCOM.FLIPRATIO); }

    /** Unsafe version of {@link #gesture(int) gesture}. */
    public static void ngesture(long struct, int value) { memPutInt(struct + XrHandGestureQCOM.GESTURE, value); }
    /** Unsafe version of {@link #gestureRatio(float) gestureRatio}. */
    public static void ngestureRatio(long struct, float value) { memPutFloat(struct + XrHandGestureQCOM.GESTURERATIO, value); }
    /** Unsafe version of {@link #flipRatio(float) flipRatio}. */
    public static void nflipRatio(long struct, float value) { memPutFloat(struct + XrHandGestureQCOM.FLIPRATIO, value); }

    // -----------------------------------

    /** An array of {@link XrHandGestureQCOM} structs. */
    public static class Buffer extends StructBuffer<XrHandGestureQCOM, Buffer> implements NativeResource {

        private static final XrHandGestureQCOM ELEMENT_FACTORY = XrHandGestureQCOM.create(-1L);

        /**
         * Creates a new {@code XrHandGestureQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandGestureQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrHandGestureQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code gesture} field. */
        @NativeType("XrHandGestureTypeQCOM")
        public int gesture() { return XrHandGestureQCOM.ngesture(address()); }
        /** @return the value of the {@code gestureRatio} field. */
        public float gestureRatio() { return XrHandGestureQCOM.ngestureRatio(address()); }
        /** @return the value of the {@code flipRatio} field. */
        public float flipRatio() { return XrHandGestureQCOM.nflipRatio(address()); }

        /** Sets the specified value to the {@code gesture} field. */
        public XrHandGestureQCOM.Buffer gesture(@NativeType("XrHandGestureTypeQCOM") int value) { XrHandGestureQCOM.ngesture(address(), value); return this; }
        /** Sets the specified value to the {@code gestureRatio} field. */
        public XrHandGestureQCOM.Buffer gestureRatio(float value) { XrHandGestureQCOM.ngestureRatio(address(), value); return this; }
        /** Sets the specified value to the {@code flipRatio} field. */
        public XrHandGestureQCOM.Buffer flipRatio(float value) { XrHandGestureQCOM.nflipRatio(address(), value); return this; }

    }

}
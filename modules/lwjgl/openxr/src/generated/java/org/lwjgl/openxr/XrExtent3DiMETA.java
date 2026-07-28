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
 * struct XrExtent3DiMETA {
 *     int32_t width;
 *     int32_t height;
 *     int32_t depth;
 * }}</pre>
 */
public class XrExtent3DiMETA extends Struct<XrExtent3DiMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WIDTH,
        HEIGHT,
        DEPTH;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        DEPTH = layout.offsetof(2);
    }

    protected XrExtent3DiMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrExtent3DiMETA create(long address, @Nullable ByteBuffer container) {
        return new XrExtent3DiMETA(address, container);
    }

    /**
     * Creates a {@code XrExtent3DiMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrExtent3DiMETA(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code width} field. */
    @NativeType("int32_t")
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("int32_t")
    public int height() { return nheight(address()); }
    /** @return the value of the {@code depth} field. */
    @NativeType("int32_t")
    public int depth() { return ndepth(address()); }

    /** Sets the specified value to the {@code width} field. */
    public XrExtent3DiMETA width(@NativeType("int32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public XrExtent3DiMETA height(@NativeType("int32_t") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code depth} field. */
    public XrExtent3DiMETA depth(@NativeType("int32_t") int value) { ndepth(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrExtent3DiMETA set(
        int width,
        int height,
        int depth
    ) {
        width(width);
        height(height);
        depth(depth);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrExtent3DiMETA set(XrExtent3DiMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrExtent3DiMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrExtent3DiMETA malloc() {
        return new XrExtent3DiMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrExtent3DiMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrExtent3DiMETA calloc() {
        return new XrExtent3DiMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrExtent3DiMETA} instance allocated with {@link BufferUtils}. */
    public static XrExtent3DiMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrExtent3DiMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrExtent3DiMETA} instance for the specified memory address. */
    public static XrExtent3DiMETA create(long address) {
        return new XrExtent3DiMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrExtent3DiMETA createSafe(long address) {
        return address == NULL ? null : new XrExtent3DiMETA(address, null);
    }

    /**
     * Returns a new {@link XrExtent3DiMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtent3DiMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrExtent3DiMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtent3DiMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExtent3DiMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtent3DiMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrExtent3DiMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrExtent3DiMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrExtent3DiMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrExtent3DiMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExtent3DiMETA malloc(MemoryStack stack) {
        return new XrExtent3DiMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrExtent3DiMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExtent3DiMETA calloc(MemoryStack stack) {
        return new XrExtent3DiMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrExtent3DiMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExtent3DiMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExtent3DiMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExtent3DiMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + XrExtent3DiMETA.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + XrExtent3DiMETA.HEIGHT); }
    /** Unsafe version of {@link #depth}. */
    public static int ndepth(long struct) { return memGetInt(struct + XrExtent3DiMETA.DEPTH); }

    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + XrExtent3DiMETA.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + XrExtent3DiMETA.HEIGHT, value); }
    /** Unsafe version of {@link #depth(int) depth}. */
    public static void ndepth(long struct, int value) { memPutInt(struct + XrExtent3DiMETA.DEPTH, value); }

    // -----------------------------------

    /** An array of {@link XrExtent3DiMETA} structs. */
    public static class Buffer extends StructBuffer<XrExtent3DiMETA, Buffer> implements NativeResource {

        private static final XrExtent3DiMETA ELEMENT_FACTORY = XrExtent3DiMETA.create(-1L);

        /**
         * Creates a new {@code XrExtent3DiMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrExtent3DiMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrExtent3DiMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code width} field. */
        @NativeType("int32_t")
        public int width() { return XrExtent3DiMETA.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("int32_t")
        public int height() { return XrExtent3DiMETA.nheight(address()); }
        /** @return the value of the {@code depth} field. */
        @NativeType("int32_t")
        public int depth() { return XrExtent3DiMETA.ndepth(address()); }

        /** Sets the specified value to the {@code width} field. */
        public XrExtent3DiMETA.Buffer width(@NativeType("int32_t") int value) { XrExtent3DiMETA.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public XrExtent3DiMETA.Buffer height(@NativeType("int32_t") int value) { XrExtent3DiMETA.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code depth} field. */
        public XrExtent3DiMETA.Buffer depth(@NativeType("int32_t") int value) { XrExtent3DiMETA.ndepth(address(), value); return this; }

    }

}
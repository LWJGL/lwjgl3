/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct NSVGgradientStop {
 *     unsigned int color;
 *     float offset;
 * }</code></pre>
 */
@NativeType("struct NSVGgradientStop")
public class NSVGGradientStop extends Struct<NSVGGradientStop> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COLOR,
        OFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COLOR = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
    }

    protected NSVGGradientStop(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NSVGGradientStop create(long address, @Nullable ByteBuffer container) {
        return new NSVGGradientStop(address, container);
    }

    /**
     * Creates a {@code NSVGGradientStop} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NSVGGradientStop(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code color} field. */
    @NativeType("unsigned int")
    public int color() { return ncolor(address()); }
    /** @return the value of the {@code offset} field. */
    public float offset() { return noffset(address()); }

    // -----------------------------------

    /** Returns a new {@code NSVGGradientStop} instance for the specified memory address. */
    public static NSVGGradientStop create(long address) {
        return new NSVGGradientStop(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NSVGGradientStop createSafe(long address) {
        return address == NULL ? null : new NSVGGradientStop(address, null);
    }

    /**
     * Create a {@link NSVGGradientStop.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NSVGGradientStop.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NSVGGradientStop.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #color}. */
    public static int ncolor(long struct) { return memGetInt(struct + NSVGGradientStop.COLOR); }
    /** Unsafe version of {@link #offset}. */
    public static float noffset(long struct) { return memGetFloat(struct + NSVGGradientStop.OFFSET); }

    // -----------------------------------

    /** An array of {@link NSVGGradientStop} structs. */
    public static class Buffer extends StructBuffer<NSVGGradientStop, Buffer> {

        private static final NSVGGradientStop ELEMENT_FACTORY = NSVGGradientStop.create(-1L);

        /**
         * Creates a new {@code NSVGGradientStop.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NSVGGradientStop#SIZEOF}, and its mark will be undefined.</p>
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
        protected NSVGGradientStop getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code color} field. */
        @NativeType("unsigned int")
        public int color() { return NSVGGradientStop.ncolor(address()); }
        /** @return the value of the {@code offset} field. */
        public float offset() { return NSVGGradientStop.noffset(address()); }

    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code width} &ndash; Width of the image.</li>
 * <li>{@code height} &ndash; Height of the image.</li>
 * <li>{@code shapes} &ndash; lLinked list of shapes in the image</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct NSVGimage {
 *     float width;
 *     float height;
 *     {@link NSVGShape NSVGshape} * shapes;
 * }</pre></code>
 */
@NativeType("struct NSVGimage")
public class NSVGImage extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WIDTH,
        HEIGHT,
        SHAPES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        SHAPES = layout.offsetof(2);
    }

    NSVGImage(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link NSVGImage} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NSVGImage(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code width} field. */
    public float width() { return nwidth(address()); }
    /** Returns the value of the {@code height} field. */
    public float height() { return nheight(address()); }
    /** Returns a {@link NSVGShape} view of the struct pointed to by the {@code shapes} field. */
    @NativeType("NSVGshape *")
    public NSVGShape shapes() { return nshapes(address()); }

    // -----------------------------------

    /** Returns a new {@link NSVGImage} instance for the specified memory address. */
    public static NSVGImage create(long address) {
        return new NSVGImage(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NSVGImage createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link NSVGImage.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NSVGImage.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NSVGImage.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #width}. */
    public static float nwidth(long struct) { return memGetFloat(struct + NSVGImage.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static float nheight(long struct) { return memGetFloat(struct + NSVGImage.HEIGHT); }
    /** Unsafe version of {@link #shapes}. */
    public static NSVGShape nshapes(long struct) { return NSVGShape.create(memGetAddress(struct + NSVGImage.SHAPES)); }

    // -----------------------------------

    /** An array of {@link NSVGImage} structs. */
    public static class Buffer extends StructBuffer<NSVGImage, Buffer> {

        /**
         * Creates a new {@link NSVGImage.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NSVGImage#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected NSVGImage newInstance(long address) {
            return new NSVGImage(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code width} field. */
        public float width() { return NSVGImage.nwidth(address()); }
        /** Returns the value of the {@code height} field. */
        public float height() { return NSVGImage.nheight(address()); }
        /** Returns a {@link NSVGShape} view of the struct pointed to by the {@code shapes} field. */
        @NativeType("NSVGshape *")
        public NSVGShape shapes() { return NSVGImage.nshapes(address()); }

    }

}
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
 * <pre><code>
 * struct NSVGimage {
 *     float width;
 *     float height;
 *     {@link NSVGShape NSVGshape} * shapes;
 * }</code></pre>
 */
@NativeType("struct NSVGimage")
public class NSVGImage extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
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

    /**
     * Creates a {@code NSVGImage} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NSVGImage(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
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

    /** Returns a new {@code NSVGImage} instance for the specified memory address. */
    public static NSVGImage create(long address) {
        return wrap(NSVGImage.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NSVGImage createSafe(long address) {
        return address == NULL ? null : wrap(NSVGImage.class, address);
    }

    /**
     * Create a {@link NSVGImage.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NSVGImage.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NSVGImage.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #width}. */
    public static float nwidth(long struct) { return UNSAFE.getFloat(null, struct + NSVGImage.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static float nheight(long struct) { return UNSAFE.getFloat(null, struct + NSVGImage.HEIGHT); }
    /** Unsafe version of {@link #shapes}. */
    public static NSVGShape nshapes(long struct) { return NSVGShape.create(memGetAddress(struct + NSVGImage.SHAPES)); }

    // -----------------------------------

    /** An array of {@link NSVGImage} structs. */
    public static class Buffer extends StructBuffer<NSVGImage, Buffer> {

        private static final NSVGImage ELEMENT_FACTORY = NSVGImage.create(-1L);

        /**
         * Creates a new {@code NSVGImage.Buffer} instance backed by the specified container.
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
        protected NSVGImage getElementFactory() {
            return ELEMENT_FACTORY;
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
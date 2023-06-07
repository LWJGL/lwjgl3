/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Image data.
 * 
 * <p>This describes a single 2D image. See the documentation for each related function to see what the expected pixel format is.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct GLFWimage {
 *     int {@link #width};
 *     int {@link #height};
 *     unsigned char * {@link #pixels};
 * }</code></pre>
 *
 * @since version 2.1
 */
@NativeType("struct GLFWimage")
public class GLFWImage extends Struct<GLFWImage> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WIDTH,
        HEIGHT,
        PIXELS;

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
        PIXELS = layout.offsetof(2);
    }

    protected GLFWImage(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected GLFWImage create(long address, @Nullable ByteBuffer container) {
        return new GLFWImage(address, container);
    }

    /**
     * Creates a {@code GLFWImage} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public GLFWImage(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the width, in pixels, of this image */
    public int width() { return nwidth(address()); }
    /** the height, in pixels, of this image */
    public int height() { return nheight(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return the pixel data of this image, arranged left-to-right, top-to-bottom
     */
    @NativeType("unsigned char *")
    public ByteBuffer pixels(int capacity) { return npixels(address(), capacity); }

    /** Sets the specified value to the {@link #width} field. */
    public GLFWImage width(int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@link #height} field. */
    public GLFWImage height(int value) { nheight(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #pixels} field. */
    public GLFWImage pixels(@NativeType("unsigned char *") ByteBuffer value) { npixels(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public GLFWImage set(
        int width,
        int height,
        ByteBuffer pixels
    ) {
        width(width);
        height(height);
        pixels(pixels);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public GLFWImage set(GLFWImage src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code GLFWImage} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static GLFWImage malloc() {
        return new GLFWImage(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code GLFWImage} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static GLFWImage calloc() {
        return new GLFWImage(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code GLFWImage} instance allocated with {@link BufferUtils}. */
    public static GLFWImage create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GLFWImage(memAddress(container), container);
    }

    /** Returns a new {@code GLFWImage} instance for the specified memory address. */
    public static GLFWImage create(long address) {
        return new GLFWImage(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static GLFWImage createSafe(long address) {
        return address == NULL ? null : new GLFWImage(address, null);
    }

    /**
     * Returns a new {@link GLFWImage.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLFWImage.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link GLFWImage.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLFWImage.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLFWImage.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static GLFWImage.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link GLFWImage.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static GLFWImage.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static GLFWImage.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static GLFWImage mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static GLFWImage callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static GLFWImage mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static GLFWImage callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static GLFWImage.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static GLFWImage.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static GLFWImage.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static GLFWImage.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code GLFWImage} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static GLFWImage malloc(MemoryStack stack) {
        return new GLFWImage(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code GLFWImage} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static GLFWImage calloc(MemoryStack stack) {
        return new GLFWImage(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link GLFWImage.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLFWImage.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLFWImage.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLFWImage.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + GLFWImage.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + GLFWImage.HEIGHT); }
    /** Unsafe version of {@link #pixels(int) pixels}. */
    public static ByteBuffer npixels(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + GLFWImage.PIXELS), capacity); }

    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { UNSAFE.putInt(null, struct + GLFWImage.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { UNSAFE.putInt(null, struct + GLFWImage.HEIGHT, value); }
    /** Unsafe version of {@link #pixels(ByteBuffer) pixels}. */
    public static void npixels(long struct, ByteBuffer value) { memPutAddress(struct + GLFWImage.PIXELS, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + GLFWImage.PIXELS));
    }

    // -----------------------------------

    /** An array of {@link GLFWImage} structs. */
    public static class Buffer extends StructBuffer<GLFWImage, Buffer> implements NativeResource {

        private static final GLFWImage ELEMENT_FACTORY = GLFWImage.create(-1L);

        /**
         * Creates a new {@code GLFWImage.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link GLFWImage#SIZEOF}, and its mark will be undefined.</p>
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
        protected GLFWImage getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link GLFWImage#width} field. */
        public int width() { return GLFWImage.nwidth(address()); }
        /** @return the value of the {@link GLFWImage#height} field. */
        public int height() { return GLFWImage.nheight(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@link GLFWImage#pixels} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("unsigned char *")
        public ByteBuffer pixels(int capacity) { return GLFWImage.npixels(address(), capacity); }

        /** Sets the specified value to the {@link GLFWImage#width} field. */
        public GLFWImage.Buffer width(int value) { GLFWImage.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@link GLFWImage#height} field. */
        public GLFWImage.Buffer height(int value) { GLFWImage.nheight(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link GLFWImage#pixels} field. */
        public GLFWImage.Buffer pixels(@NativeType("unsigned char *") ByteBuffer value) { GLFWImage.npixels(address(), value); return this; }

    }

}
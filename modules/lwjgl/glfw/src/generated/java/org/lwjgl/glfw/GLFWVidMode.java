/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct GLFWvidmode {
 *     int width;
 *     int height;
 *     int redBits;
 *     int greenBits;
 *     int blueBits;
 *     int refreshRate;
 * }}</pre>
 */
@NativeType("struct GLFWvidmode")
public class GLFWVidMode extends Struct<GLFWVidMode> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WIDTH,
        HEIGHT,
        REDBITS,
        GREENBITS,
        BLUEBITS,
        REFRESHRATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        REDBITS = layout.offsetof(2);
        GREENBITS = layout.offsetof(3);
        BLUEBITS = layout.offsetof(4);
        REFRESHRATE = layout.offsetof(5);
    }

    protected GLFWVidMode(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected GLFWVidMode create(long address, @Nullable ByteBuffer container) {
        return new GLFWVidMode(address, container);
    }

    /**
     * Creates a {@code GLFWVidMode} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public GLFWVidMode(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code width} field. */
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    public int height() { return nheight(address()); }
    /** @return the value of the {@code redBits} field. */
    public int redBits() { return nredBits(address()); }
    /** @return the value of the {@code greenBits} field. */
    public int greenBits() { return ngreenBits(address()); }
    /** @return the value of the {@code blueBits} field. */
    public int blueBits() { return nblueBits(address()); }
    /** @return the value of the {@code refreshRate} field. */
    public int refreshRate() { return nrefreshRate(address()); }

    // -----------------------------------

    /** Returns a new {@code GLFWVidMode} instance for the specified memory address. */
    public static GLFWVidMode create(long address) {
        return new GLFWVidMode(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable GLFWVidMode createSafe(long address) {
        return address == NULL ? null : new GLFWVidMode(address, null);
    }

    /**
     * Create a {@link GLFWVidMode.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static GLFWVidMode.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static GLFWVidMode.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + GLFWVidMode.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + GLFWVidMode.HEIGHT); }
    /** Unsafe version of {@link #redBits}. */
    public static int nredBits(long struct) { return memGetInt(struct + GLFWVidMode.REDBITS); }
    /** Unsafe version of {@link #greenBits}. */
    public static int ngreenBits(long struct) { return memGetInt(struct + GLFWVidMode.GREENBITS); }
    /** Unsafe version of {@link #blueBits}. */
    public static int nblueBits(long struct) { return memGetInt(struct + GLFWVidMode.BLUEBITS); }
    /** Unsafe version of {@link #refreshRate}. */
    public static int nrefreshRate(long struct) { return memGetInt(struct + GLFWVidMode.REFRESHRATE); }

    // -----------------------------------

    /** An array of {@link GLFWVidMode} structs. */
    public static class Buffer extends StructBuffer<GLFWVidMode, Buffer> {

        private static final GLFWVidMode ELEMENT_FACTORY = GLFWVidMode.create(-1L);

        /**
         * Creates a new {@code GLFWVidMode.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link GLFWVidMode#SIZEOF}, and its mark will be undefined.</p>
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
        protected GLFWVidMode getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code width} field. */
        public int width() { return GLFWVidMode.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        public int height() { return GLFWVidMode.nheight(address()); }
        /** @return the value of the {@code redBits} field. */
        public int redBits() { return GLFWVidMode.nredBits(address()); }
        /** @return the value of the {@code greenBits} field. */
        public int greenBits() { return GLFWVidMode.ngreenBits(address()); }
        /** @return the value of the {@code blueBits} field. */
        public int blueBits() { return GLFWVidMode.nblueBits(address()); }
        /** @return the value of the {@code refreshRate} field. */
        public int refreshRate() { return GLFWVidMode.nrefreshRate(address()); }

    }

}
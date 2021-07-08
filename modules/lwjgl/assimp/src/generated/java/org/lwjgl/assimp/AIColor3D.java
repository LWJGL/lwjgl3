/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Represents a color in Red-Green-Blue space.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiColor3D {
 *     float {@link #r};
 *     float {@link #g};
 *     float {@link #b};
 * }</code></pre>
 */
@NativeType("struct aiColor3D")
public class AIColor3D extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        R,
        G,
        B;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        R = layout.offsetof(0);
        G = layout.offsetof(1);
        B = layout.offsetof(2);
    }

    /**
     * Creates a {@code AIColor3D} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIColor3D(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** The red color value */
    public float r() { return nr(address()); }
    /** The green color value */
    public float g() { return ng(address()); }
    /** The blue color value */
    public float b() { return nb(address()); }

    // -----------------------------------

    /** Returns a new {@code AIColor3D} instance for the specified memory address. */
    public static AIColor3D create(long address) {
        return wrap(AIColor3D.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIColor3D createSafe(long address) {
        return address == NULL ? null : wrap(AIColor3D.class, address);
    }

    /**
     * Create a {@link AIColor3D.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIColor3D.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIColor3D.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #r}. */
    public static float nr(long struct) { return UNSAFE.getFloat(null, struct + AIColor3D.R); }
    /** Unsafe version of {@link #g}. */
    public static float ng(long struct) { return UNSAFE.getFloat(null, struct + AIColor3D.G); }
    /** Unsafe version of {@link #b}. */
    public static float nb(long struct) { return UNSAFE.getFloat(null, struct + AIColor3D.B); }

    // -----------------------------------

    /** An array of {@link AIColor3D} structs. */
    public static class Buffer extends StructBuffer<AIColor3D, Buffer> {

        private static final AIColor3D ELEMENT_FACTORY = AIColor3D.create(-1L);

        /**
         * Creates a new {@code AIColor3D.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIColor3D#SIZEOF}, and its mark will be undefined.
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
        protected AIColor3D getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link AIColor3D#r} field. */
        public float r() { return AIColor3D.nr(address()); }
        /** @return the value of the {@link AIColor3D#g} field. */
        public float g() { return AIColor3D.ng(address()); }
        /** @return the value of the {@link AIColor3D#b} field. */
        public float b() { return AIColor3D.nb(address()); }

    }

}
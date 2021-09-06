/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Represents a color in Red-Green-Blue space including an alpha component. Color values range from 0 to 1.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiColor4D {
 *     float {@link #r};
 *     float {@link #g};
 *     float {@link #b};
 *     float {@link #a};
 * }</code></pre>
 */
@NativeType("struct aiColor4D")
public class AIColor4D extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        R,
        G,
        B,
        A;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        R = layout.offsetof(0);
        G = layout.offsetof(1);
        B = layout.offsetof(2);
        A = layout.offsetof(3);
    }

    /**
     * Creates a {@code AIColor4D} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIColor4D(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** The red color component */
    public float r() { return nr(address()); }
    /** The green color component */
    public float g() { return ng(address()); }
    /** The blue color component */
    public float b() { return nb(address()); }
    /** The alpha color component */
    public float a() { return na(address()); }

    /** Sets the specified value to the {@link #r} field. */
    public AIColor4D r(float value) { nr(address(), value); return this; }
    /** Sets the specified value to the {@link #g} field. */
    public AIColor4D g(float value) { ng(address(), value); return this; }
    /** Sets the specified value to the {@link #b} field. */
    public AIColor4D b(float value) { nb(address(), value); return this; }
    /** Sets the specified value to the {@link #a} field. */
    public AIColor4D a(float value) { na(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIColor4D set(
        float r,
        float g,
        float b,
        float a
    ) {
        r(r);
        g(g);
        b(b);
        a(a);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIColor4D set(AIColor4D src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIColor4D} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIColor4D malloc() {
        return wrap(AIColor4D.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code AIColor4D} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIColor4D calloc() {
        return wrap(AIColor4D.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code AIColor4D} instance allocated with {@link BufferUtils}. */
    public static AIColor4D create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(AIColor4D.class, memAddress(container), container);
    }

    /** Returns a new {@code AIColor4D} instance for the specified memory address. */
    public static AIColor4D create(long address) {
        return wrap(AIColor4D.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIColor4D createSafe(long address) {
        return address == NULL ? null : wrap(AIColor4D.class, address);
    }

    /**
     * Returns a new {@link AIColor4D.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIColor4D.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIColor4D.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIColor4D.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIColor4D.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIColor4D.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link AIColor4D.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIColor4D.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIColor4D.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIColor4D mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIColor4D callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIColor4D mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIColor4D callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIColor4D.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIColor4D.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIColor4D.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIColor4D.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIColor4D} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIColor4D malloc(MemoryStack stack) {
        return wrap(AIColor4D.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code AIColor4D} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIColor4D calloc(MemoryStack stack) {
        return wrap(AIColor4D.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIColor4D.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIColor4D.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIColor4D.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIColor4D.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #r}. */
    public static float nr(long struct) { return UNSAFE.getFloat(null, struct + AIColor4D.R); }
    /** Unsafe version of {@link #g}. */
    public static float ng(long struct) { return UNSAFE.getFloat(null, struct + AIColor4D.G); }
    /** Unsafe version of {@link #b}. */
    public static float nb(long struct) { return UNSAFE.getFloat(null, struct + AIColor4D.B); }
    /** Unsafe version of {@link #a}. */
    public static float na(long struct) { return UNSAFE.getFloat(null, struct + AIColor4D.A); }

    /** Unsafe version of {@link #r(float) r}. */
    public static void nr(long struct, float value) { UNSAFE.putFloat(null, struct + AIColor4D.R, value); }
    /** Unsafe version of {@link #g(float) g}. */
    public static void ng(long struct, float value) { UNSAFE.putFloat(null, struct + AIColor4D.G, value); }
    /** Unsafe version of {@link #b(float) b}. */
    public static void nb(long struct, float value) { UNSAFE.putFloat(null, struct + AIColor4D.B, value); }
    /** Unsafe version of {@link #a(float) a}. */
    public static void na(long struct, float value) { UNSAFE.putFloat(null, struct + AIColor4D.A, value); }

    // -----------------------------------

    /** An array of {@link AIColor4D} structs. */
    public static class Buffer extends StructBuffer<AIColor4D, Buffer> implements NativeResource {

        private static final AIColor4D ELEMENT_FACTORY = AIColor4D.create(-1L);

        /**
         * Creates a new {@code AIColor4D.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIColor4D#SIZEOF}, and its mark will be undefined.
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
        protected AIColor4D getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link AIColor4D#r} field. */
        public float r() { return AIColor4D.nr(address()); }
        /** @return the value of the {@link AIColor4D#g} field. */
        public float g() { return AIColor4D.ng(address()); }
        /** @return the value of the {@link AIColor4D#b} field. */
        public float b() { return AIColor4D.nb(address()); }
        /** @return the value of the {@link AIColor4D#a} field. */
        public float a() { return AIColor4D.na(address()); }

        /** Sets the specified value to the {@link AIColor4D#r} field. */
        public AIColor4D.Buffer r(float value) { AIColor4D.nr(address(), value); return this; }
        /** Sets the specified value to the {@link AIColor4D#g} field. */
        public AIColor4D.Buffer g(float value) { AIColor4D.ng(address(), value); return this; }
        /** Sets the specified value to the {@link AIColor4D#b} field. */
        public AIColor4D.Buffer b(float value) { AIColor4D.nb(address(), value); return this; }
        /** Sets the specified value to the {@link AIColor4D#a} field. */
        public AIColor4D.Buffer a(float value) { AIColor4D.na(address(), value); return this; }

    }

}
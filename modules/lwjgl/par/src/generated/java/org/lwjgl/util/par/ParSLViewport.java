/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.par;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Viewport for streamline seed placement.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct parsl_viewport {
 *     float left;
 *     float top;
 *     float right;
 *     float bottom;
 * }</code></pre>
 */
@NativeType("struct parsl_viewport")
public class ParSLViewport extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LEFT,
        TOP,
        RIGHT,
        BOTTOM;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LEFT = layout.offsetof(0);
        TOP = layout.offsetof(1);
        RIGHT = layout.offsetof(2);
        BOTTOM = layout.offsetof(3);
    }

    /**
     * Creates a {@code ParSLViewport} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ParSLViewport(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code left} field. */
    public float left() { return nleft(address()); }
    /** @return the value of the {@code top} field. */
    public float top() { return ntop(address()); }
    /** @return the value of the {@code right} field. */
    public float right() { return nright(address()); }
    /** @return the value of the {@code bottom} field. */
    public float bottom() { return nbottom(address()); }

    /** Sets the specified value to the {@code left} field. */
    public ParSLViewport left(float value) { nleft(address(), value); return this; }
    /** Sets the specified value to the {@code top} field. */
    public ParSLViewport top(float value) { ntop(address(), value); return this; }
    /** Sets the specified value to the {@code right} field. */
    public ParSLViewport right(float value) { nright(address(), value); return this; }
    /** Sets the specified value to the {@code bottom} field. */
    public ParSLViewport bottom(float value) { nbottom(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ParSLViewport set(
        float left,
        float top,
        float right,
        float bottom
    ) {
        left(left);
        top(top);
        right(right);
        bottom(bottom);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ParSLViewport set(ParSLViewport src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ParSLViewport} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ParSLViewport malloc() {
        return wrap(ParSLViewport.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ParSLViewport} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ParSLViewport calloc() {
        return wrap(ParSLViewport.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ParSLViewport} instance allocated with {@link BufferUtils}. */
    public static ParSLViewport create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ParSLViewport.class, memAddress(container), container);
    }

    /** Returns a new {@code ParSLViewport} instance for the specified memory address. */
    public static ParSLViewport create(long address) {
        return wrap(ParSLViewport.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ParSLViewport createSafe(long address) {
        return address == NULL ? null : wrap(ParSLViewport.class, address);
    }

    /**
     * Returns a new {@link ParSLViewport.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ParSLViewport.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ParSLViewport.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ParSLViewport.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ParSLViewport.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ParSLViewport.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ParSLViewport.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ParSLViewport.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ParSLViewport.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ParSLViewport mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ParSLViewport callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ParSLViewport mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ParSLViewport callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ParSLViewport.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ParSLViewport.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ParSLViewport.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ParSLViewport.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code ParSLViewport} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ParSLViewport malloc(MemoryStack stack) {
        return wrap(ParSLViewport.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ParSLViewport} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ParSLViewport calloc(MemoryStack stack) {
        return wrap(ParSLViewport.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ParSLViewport.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ParSLViewport.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ParSLViewport.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ParSLViewport.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #left}. */
    public static float nleft(long struct) { return UNSAFE.getFloat(null, struct + ParSLViewport.LEFT); }
    /** Unsafe version of {@link #top}. */
    public static float ntop(long struct) { return UNSAFE.getFloat(null, struct + ParSLViewport.TOP); }
    /** Unsafe version of {@link #right}. */
    public static float nright(long struct) { return UNSAFE.getFloat(null, struct + ParSLViewport.RIGHT); }
    /** Unsafe version of {@link #bottom}. */
    public static float nbottom(long struct) { return UNSAFE.getFloat(null, struct + ParSLViewport.BOTTOM); }

    /** Unsafe version of {@link #left(float) left}. */
    public static void nleft(long struct, float value) { UNSAFE.putFloat(null, struct + ParSLViewport.LEFT, value); }
    /** Unsafe version of {@link #top(float) top}. */
    public static void ntop(long struct, float value) { UNSAFE.putFloat(null, struct + ParSLViewport.TOP, value); }
    /** Unsafe version of {@link #right(float) right}. */
    public static void nright(long struct, float value) { UNSAFE.putFloat(null, struct + ParSLViewport.RIGHT, value); }
    /** Unsafe version of {@link #bottom(float) bottom}. */
    public static void nbottom(long struct, float value) { UNSAFE.putFloat(null, struct + ParSLViewport.BOTTOM, value); }

    // -----------------------------------

    /** An array of {@link ParSLViewport} structs. */
    public static class Buffer extends StructBuffer<ParSLViewport, Buffer> implements NativeResource {

        private static final ParSLViewport ELEMENT_FACTORY = ParSLViewport.create(-1L);

        /**
         * Creates a new {@code ParSLViewport.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ParSLViewport#SIZEOF}, and its mark will be undefined.
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
        protected ParSLViewport getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code left} field. */
        public float left() { return ParSLViewport.nleft(address()); }
        /** @return the value of the {@code top} field. */
        public float top() { return ParSLViewport.ntop(address()); }
        /** @return the value of the {@code right} field. */
        public float right() { return ParSLViewport.nright(address()); }
        /** @return the value of the {@code bottom} field. */
        public float bottom() { return ParSLViewport.nbottom(address()); }

        /** Sets the specified value to the {@code left} field. */
        public ParSLViewport.Buffer left(float value) { ParSLViewport.nleft(address(), value); return this; }
        /** Sets the specified value to the {@code top} field. */
        public ParSLViewport.Buffer top(float value) { ParSLViewport.ntop(address(), value); return this; }
        /** Sets the specified value to the {@code right} field. */
        public ParSLViewport.Buffer right(float value) { ParSLViewport.nright(address(), value); return this; }
        /** Sets the specified value to the {@code bottom} field. */
        public ParSLViewport.Buffer bottom(float value) { ParSLViewport.nbottom(address(), value); return this; }

    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct btVector3 {
 *     btScalar m_floats[4];
 * }</code></pre>
 */
@NativeType("struct btVector3")
public class ΒΤVector3 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_FLOATS;

    static {
        Layout layout = __struct(
            __array(4, 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_FLOATS = layout.offsetof(0);
    }

    /**
     * Creates a {@code ΒΤVector3} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ΒΤVector3(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link FloatBuffer} view of the {@code m_floats} field. */
    @NativeType("btScalar[4]")
    public FloatBuffer m_floats() { return nm_floats(address()); }
    /** Returns the value at the specified index of the {@code m_floats} field. */
    @NativeType("btScalar")
    public float m_floats(int index) { return nm_floats(address(), index); }

    /** Copies the specified {@link FloatBuffer} to the {@code m_floats} field. */
    public ΒΤVector3 m_floats(@NativeType("btScalar[4]") FloatBuffer value) { nm_floats(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_floats} field. */
    public ΒΤVector3 m_floats(int index, @NativeType("btScalar") float value) { nm_floats(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ΒΤVector3 set(ΒΤVector3 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ΒΤVector3} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ΒΤVector3 malloc() {
        return wrap(ΒΤVector3.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ΒΤVector3} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ΒΤVector3 calloc() {
        return wrap(ΒΤVector3.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ΒΤVector3} instance allocated with {@link BufferUtils}. */
    public static ΒΤVector3 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ΒΤVector3.class, memAddress(container), container);
    }

    /** Returns a new {@code ΒΤVector3} instance for the specified memory address. */
    public static ΒΤVector3 create(long address) {
        return wrap(ΒΤVector3.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ΒΤVector3 createSafe(long address) {
        return address == NULL ? null : wrap(ΒΤVector3.class, address);
    }

    /**
     * Returns a new {@link ΒΤVector3.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ΒΤVector3.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ΒΤVector3.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ΒΤVector3.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ΒΤVector3.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ΒΤVector3.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ΒΤVector3.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ΒΤVector3.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ΒΤVector3.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code ΒΤVector3} instance allocated on the thread-local {@link MemoryStack}. */
    public static ΒΤVector3 mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code ΒΤVector3} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static ΒΤVector3 callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code ΒΤVector3} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ΒΤVector3 mallocStack(MemoryStack stack) {
        return wrap(ΒΤVector3.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ΒΤVector3} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ΒΤVector3 callocStack(MemoryStack stack) {
        return wrap(ΒΤVector3.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ΒΤVector3.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static ΒΤVector3.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ΒΤVector3.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static ΒΤVector3.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ΒΤVector3.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ΒΤVector3.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ΒΤVector3.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ΒΤVector3.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_floats}. */
    public static FloatBuffer nm_floats(long struct) { return memFloatBuffer(struct + ΒΤVector3.M_FLOATS, 4); }
    /** Unsafe version of {@link #m_floats(int) m_floats}. */
    public static float nm_floats(long struct, int index) {
        return UNSAFE.getFloat(null, struct + ΒΤVector3.M_FLOATS + check(index, 4) * 4);
    }

    /** Unsafe version of {@link #m_floats(FloatBuffer) m_floats}. */
    public static void nm_floats(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + ΒΤVector3.M_FLOATS, value.remaining() * 4);
    }
    /** Unsafe version of {@link #m_floats(int, float) m_floats}. */
    public static void nm_floats(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + ΒΤVector3.M_FLOATS + check(index, 4) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link ΒΤVector3} structs. */
    public static class Buffer extends StructBuffer<ΒΤVector3, Buffer> implements NativeResource {

        private static final ΒΤVector3 ELEMENT_FACTORY = ΒΤVector3.create(-1L);

        /**
         * Creates a new {@code ΒΤVector3.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ΒΤVector3#SIZEOF}, and its mark will be undefined.
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
        protected ΒΤVector3 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link FloatBuffer} view of the {@code m_floats} field. */
        @NativeType("btScalar[4]")
        public FloatBuffer m_floats() { return ΒΤVector3.nm_floats(address()); }
        /** Returns the value at the specified index of the {@code m_floats} field. */
        @NativeType("btScalar")
        public float m_floats(int index) { return ΒΤVector3.nm_floats(address(), index); }

        /** Copies the specified {@link FloatBuffer} to the {@code m_floats} field. */
        public ΒΤVector3.Buffer m_floats(@NativeType("btScalar[4]") FloatBuffer value) { ΒΤVector3.nm_floats(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_floats} field. */
        public ΒΤVector3.Buffer m_floats(int index, @NativeType("btScalar") float value) { ΒΤVector3.nm_floats(address(), index, value); return this; }

    }

}
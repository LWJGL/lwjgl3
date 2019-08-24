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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct btTransform {
 *     {@link BTMatrix3x3 btMatrix3x3} m_basis;
 *     {@link ΒΤVector3 btVector3} m_origin;
 * }</code></pre>
 */
@NativeType("struct btTransform")
public class BTTransform extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_BASIS,
        M_ORIGIN;

    static {
        Layout layout = __struct(
            __member(BTMatrix3x3.SIZEOF, BTMatrix3x3.ALIGNOF),
            __member(ΒΤVector3.SIZEOF, ΒΤVector3.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_BASIS = layout.offsetof(0);
        M_ORIGIN = layout.offsetof(1);
    }

    /**
     * Creates a {@code BTTransform} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BTTransform(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link BTMatrix3x3} view of the {@code m_basis} field. */
    @NativeType("btMatrix3x3")
    public BTMatrix3x3 m_basis() { return nm_basis(address()); }
    /** Returns a {@link ΒΤVector3} view of the {@code m_origin} field. */
    @NativeType("btVector3")
    public ΒΤVector3 m_origin() { return nm_origin(address()); }

    /** Copies the specified {@link BTMatrix3x3} to the {@code m_basis} field. */
    public BTTransform m_basis(@NativeType("btMatrix3x3") BTMatrix3x3 value) { nm_basis(address(), value); return this; }
    /** Passes the {@code m_basis} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BTTransform m_basis(java.util.function.Consumer<BTMatrix3x3> consumer) { consumer.accept(m_basis()); return this; }
    /** Copies the specified {@link ΒΤVector3} to the {@code m_origin} field. */
    public BTTransform m_origin(@NativeType("btVector3") ΒΤVector3 value) { nm_origin(address(), value); return this; }
    /** Passes the {@code m_origin} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BTTransform m_origin(java.util.function.Consumer<ΒΤVector3> consumer) { consumer.accept(m_origin()); return this; }

    /** Initializes this struct with the specified values. */
    public BTTransform set(
        BTMatrix3x3 m_basis,
        ΒΤVector3 m_origin
    ) {
        m_basis(m_basis);
        m_origin(m_origin);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BTTransform set(BTTransform src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BTTransform} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BTTransform malloc() {
        return wrap(BTTransform.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code BTTransform} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BTTransform calloc() {
        return wrap(BTTransform.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code BTTransform} instance allocated with {@link BufferUtils}. */
    public static BTTransform create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(BTTransform.class, memAddress(container), container);
    }

    /** Returns a new {@code BTTransform} instance for the specified memory address. */
    public static BTTransform create(long address) {
        return wrap(BTTransform.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BTTransform createSafe(long address) {
        return address == NULL ? null : wrap(BTTransform.class, address);
    }

    /**
     * Returns a new {@link BTTransform.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BTTransform.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link BTTransform.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BTTransform.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BTTransform.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static BTTransform.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link BTTransform.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BTTransform.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BTTransform.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code BTTransform} instance allocated on the thread-local {@link MemoryStack}. */
    public static BTTransform mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code BTTransform} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static BTTransform callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code BTTransform} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BTTransform mallocStack(MemoryStack stack) {
        return wrap(BTTransform.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code BTTransform} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BTTransform callocStack(MemoryStack stack) {
        return wrap(BTTransform.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link BTTransform.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static BTTransform.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BTTransform.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static BTTransform.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BTTransform.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BTTransform.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BTTransform.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BTTransform.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_basis}. */
    public static BTMatrix3x3 nm_basis(long struct) { return BTMatrix3x3.create(struct + BTTransform.M_BASIS); }
    /** Unsafe version of {@link #m_origin}. */
    public static ΒΤVector3 nm_origin(long struct) { return ΒΤVector3.create(struct + BTTransform.M_ORIGIN); }

    /** Unsafe version of {@link #m_basis(BTMatrix3x3) m_basis}. */
    public static void nm_basis(long struct, BTMatrix3x3 value) { memCopy(value.address(), struct + BTTransform.M_BASIS, BTMatrix3x3.SIZEOF); }
    /** Unsafe version of {@link #m_origin(ΒΤVector3) m_origin}. */
    public static void nm_origin(long struct, ΒΤVector3 value) { memCopy(value.address(), struct + BTTransform.M_ORIGIN, ΒΤVector3.SIZEOF); }

    // -----------------------------------

    /** An array of {@link BTTransform} structs. */
    public static class Buffer extends StructBuffer<BTTransform, Buffer> implements NativeResource {

        private static final BTTransform ELEMENT_FACTORY = BTTransform.create(-1L);

        /**
         * Creates a new {@code BTTransform.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BTTransform#SIZEOF}, and its mark will be undefined.
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
        protected BTTransform getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link BTMatrix3x3} view of the {@code m_basis} field. */
        @NativeType("btMatrix3x3")
        public BTMatrix3x3 m_basis() { return BTTransform.nm_basis(address()); }
        /** Returns a {@link ΒΤVector3} view of the {@code m_origin} field. */
        @NativeType("btVector3")
        public ΒΤVector3 m_origin() { return BTTransform.nm_origin(address()); }

        /** Copies the specified {@link BTMatrix3x3} to the {@code m_basis} field. */
        public BTTransform.Buffer m_basis(@NativeType("btMatrix3x3") BTMatrix3x3 value) { BTTransform.nm_basis(address(), value); return this; }
        /** Passes the {@code m_basis} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BTTransform.Buffer m_basis(java.util.function.Consumer<BTMatrix3x3> consumer) { consumer.accept(m_basis()); return this; }
        /** Copies the specified {@link ΒΤVector3} to the {@code m_origin} field. */
        public BTTransform.Buffer m_origin(@NativeType("btVector3") ΒΤVector3 value) { BTTransform.nm_origin(address(), value); return this; }
        /** Passes the {@code m_origin} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BTTransform.Buffer m_origin(java.util.function.Consumer<ΒΤVector3> consumer) { consumer.accept(m_origin()); return this; }

    }

}
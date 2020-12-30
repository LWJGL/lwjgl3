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
 * struct btMatrix3x3 {
 *     {@link BTVector3 btVector3} m_el[3];
 * }</code></pre>
 */
@NativeType("struct btMatrix3x3")
public class BTMatrix3x3 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_EL;

    static {
        Layout layout = __struct(
            __array(BTVector3.SIZEOF, BTVector3.ALIGNOF, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_EL = layout.offsetof(0);
    }

    /**
     * Creates a {@code BTMatrix3x3} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BTMatrix3x3(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link BTVector3}.Buffer view of the {@code m_el} field. */
    @NativeType("btVector3[3]")
    public BTVector3.Buffer m_el() { return nm_el(address()); }
    /** Returns a {@link BTVector3} view of the struct at the specified index of the {@code m_el} field. */
    @NativeType("btVector3")
    public BTVector3 m_el(int index) { return nm_el(address(), index); }

    /** Copies the specified {@link BTVector3.Buffer} to the {@code m_el} field. */
    public BTMatrix3x3 m_el(@NativeType("btVector3[3]") BTVector3.Buffer value) { nm_el(address(), value); return this; }
    /** Copies the specified {@link BTVector3} at the specified index of the {@code m_el} field. */
    public BTMatrix3x3 m_el(int index, @NativeType("btVector3") BTVector3 value) { nm_el(address(), index, value); return this; }
    /** Passes the {@code m_el} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BTMatrix3x3 m_el(java.util.function.Consumer<BTVector3.Buffer> consumer) { consumer.accept(m_el()); return this; }
    /** Passes the element at {@code index} of the {@code m_el} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BTMatrix3x3 m_el(int index, java.util.function.Consumer<BTVector3> consumer) { consumer.accept(m_el(index)); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BTMatrix3x3 set(BTMatrix3x3 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BTMatrix3x3} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BTMatrix3x3 malloc() {
        return wrap(BTMatrix3x3.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code BTMatrix3x3} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BTMatrix3x3 calloc() {
        return wrap(BTMatrix3x3.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code BTMatrix3x3} instance allocated with {@link BufferUtils}. */
    public static BTMatrix3x3 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(BTMatrix3x3.class, memAddress(container), container);
    }

    /** Returns a new {@code BTMatrix3x3} instance for the specified memory address. */
    public static BTMatrix3x3 create(long address) {
        return wrap(BTMatrix3x3.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BTMatrix3x3 createSafe(long address) {
        return address == NULL ? null : wrap(BTMatrix3x3.class, address);
    }

    /**
     * Returns a new {@link BTMatrix3x3.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BTMatrix3x3.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link BTMatrix3x3.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BTMatrix3x3.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BTMatrix3x3.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static BTMatrix3x3.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link BTMatrix3x3.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BTMatrix3x3.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BTMatrix3x3.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code BTMatrix3x3} instance allocated on the thread-local {@link MemoryStack}. */
    public static BTMatrix3x3 mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code BTMatrix3x3} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static BTMatrix3x3 callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code BTMatrix3x3} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BTMatrix3x3 mallocStack(MemoryStack stack) {
        return wrap(BTMatrix3x3.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code BTMatrix3x3} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BTMatrix3x3 callocStack(MemoryStack stack) {
        return wrap(BTMatrix3x3.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link BTMatrix3x3.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static BTMatrix3x3.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BTMatrix3x3.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static BTMatrix3x3.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BTMatrix3x3.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BTMatrix3x3.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BTMatrix3x3.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BTMatrix3x3.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_el}. */
    public static BTVector3.Buffer nm_el(long struct) { return BTVector3.create(struct + BTMatrix3x3.M_EL, 3); }
    /** Unsafe version of {@link #m_el(int) m_el}. */
    public static BTVector3 nm_el(long struct, int index) {
        return BTVector3.create(struct + BTMatrix3x3.M_EL + check(index, 3) * BTVector3.SIZEOF);
    }

    /** Unsafe version of {@link #m_el(BTVector3.Buffer) m_el}. */
    public static void nm_el(long struct, BTVector3.Buffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(value.address(), struct + BTMatrix3x3.M_EL, value.remaining() * BTVector3.SIZEOF);
    }
    /** Unsafe version of {@link #m_el(int, BTVector3) m_el}. */
    public static void nm_el(long struct, int index, BTVector3 value) {
        memCopy(value.address(), struct + BTMatrix3x3.M_EL + check(index, 3) * BTVector3.SIZEOF, BTVector3.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link BTMatrix3x3} structs. */
    public static class Buffer extends StructBuffer<BTMatrix3x3, Buffer> implements NativeResource {

        private static final BTMatrix3x3 ELEMENT_FACTORY = BTMatrix3x3.create(-1L);

        /**
         * Creates a new {@code BTMatrix3x3.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BTMatrix3x3#SIZEOF}, and its mark will be undefined.
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
        protected BTMatrix3x3 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link BTVector3}.Buffer view of the {@code m_el} field. */
        @NativeType("btVector3[3]")
        public BTVector3.Buffer m_el() { return BTMatrix3x3.nm_el(address()); }
        /** Returns a {@link BTVector3} view of the struct at the specified index of the {@code m_el} field. */
        @NativeType("btVector3")
        public BTVector3 m_el(int index) { return BTMatrix3x3.nm_el(address(), index); }

        /** Copies the specified {@link BTVector3.Buffer} to the {@code m_el} field. */
        public BTMatrix3x3.Buffer m_el(@NativeType("btVector3[3]") BTVector3.Buffer value) { BTMatrix3x3.nm_el(address(), value); return this; }
        /** Copies the specified {@link BTVector3} at the specified index of the {@code m_el} field. */
        public BTMatrix3x3.Buffer m_el(int index, @NativeType("btVector3") BTVector3 value) { BTMatrix3x3.nm_el(address(), index, value); return this; }
        /** Passes the {@code m_el} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BTMatrix3x3.Buffer m_el(java.util.function.Consumer<BTVector3.Buffer> consumer) { consumer.accept(m_el()); return this; }
        /** Passes the element at {@code index} of the {@code m_el} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BTMatrix3x3.Buffer m_el(int index, java.util.function.Consumer<BTVector3> consumer) { consumer.accept(m_el(index)); return this; }

    }

}
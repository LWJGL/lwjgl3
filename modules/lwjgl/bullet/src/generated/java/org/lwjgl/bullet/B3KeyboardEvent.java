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
 * struct b3KeyboardEvent {
 *     int m_keyCode;
 *     int m_keyState;
 * }</code></pre>
 */
@NativeType("struct b3KeyboardEvent")
public class B3KeyboardEvent extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_KEYCODE,
        M_KEYSTATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_KEYCODE = layout.offsetof(0);
        M_KEYSTATE = layout.offsetof(1);
    }

    /**
     * Creates a {@code B3KeyboardEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3KeyboardEvent(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_keyCode} field. */
    public int m_keyCode() { return nm_keyCode(address()); }
    /** Returns the value of the {@code m_keyState} field. */
    public int m_keyState() { return nm_keyState(address()); }

    /** Sets the specified value to the {@code m_keyCode} field. */
    public B3KeyboardEvent m_keyCode(int value) { nm_keyCode(address(), value); return this; }
    /** Sets the specified value to the {@code m_keyState} field. */
    public B3KeyboardEvent m_keyState(int value) { nm_keyState(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public B3KeyboardEvent set(
        int m_keyCode,
        int m_keyState
    ) {
        m_keyCode(m_keyCode);
        m_keyState(m_keyState);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3KeyboardEvent set(B3KeyboardEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3KeyboardEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3KeyboardEvent malloc() {
        return wrap(B3KeyboardEvent.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3KeyboardEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3KeyboardEvent calloc() {
        return wrap(B3KeyboardEvent.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3KeyboardEvent} instance allocated with {@link BufferUtils}. */
    public static B3KeyboardEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3KeyboardEvent.class, memAddress(container), container);
    }

    /** Returns a new {@code B3KeyboardEvent} instance for the specified memory address. */
    public static B3KeyboardEvent create(long address) {
        return wrap(B3KeyboardEvent.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3KeyboardEvent createSafe(long address) {
        return address == NULL ? null : wrap(B3KeyboardEvent.class, address);
    }

    /**
     * Returns a new {@link B3KeyboardEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3KeyboardEvent.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3KeyboardEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3KeyboardEvent.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3KeyboardEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3KeyboardEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3KeyboardEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3KeyboardEvent.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3KeyboardEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3KeyboardEvent} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3KeyboardEvent mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3KeyboardEvent} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3KeyboardEvent callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3KeyboardEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3KeyboardEvent mallocStack(MemoryStack stack) {
        return wrap(B3KeyboardEvent.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3KeyboardEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3KeyboardEvent callocStack(MemoryStack stack) {
        return wrap(B3KeyboardEvent.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3KeyboardEvent.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3KeyboardEvent.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3KeyboardEvent.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3KeyboardEvent.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3KeyboardEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3KeyboardEvent.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3KeyboardEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3KeyboardEvent.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_keyCode}. */
    public static int nm_keyCode(long struct) { return UNSAFE.getInt(null, struct + B3KeyboardEvent.M_KEYCODE); }
    /** Unsafe version of {@link #m_keyState}. */
    public static int nm_keyState(long struct) { return UNSAFE.getInt(null, struct + B3KeyboardEvent.M_KEYSTATE); }

    /** Unsafe version of {@link #m_keyCode(int) m_keyCode}. */
    public static void nm_keyCode(long struct, int value) { UNSAFE.putInt(null, struct + B3KeyboardEvent.M_KEYCODE, value); }
    /** Unsafe version of {@link #m_keyState(int) m_keyState}. */
    public static void nm_keyState(long struct, int value) { UNSAFE.putInt(null, struct + B3KeyboardEvent.M_KEYSTATE, value); }

    // -----------------------------------

    /** An array of {@link B3KeyboardEvent} structs. */
    public static class Buffer extends StructBuffer<B3KeyboardEvent, Buffer> implements NativeResource {

        private static final B3KeyboardEvent ELEMENT_FACTORY = B3KeyboardEvent.create(-1L);

        /**
         * Creates a new {@code B3KeyboardEvent.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3KeyboardEvent#SIZEOF}, and its mark will be undefined.
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
        protected B3KeyboardEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_keyCode} field. */
        public int m_keyCode() { return B3KeyboardEvent.nm_keyCode(address()); }
        /** Returns the value of the {@code m_keyState} field. */
        public int m_keyState() { return B3KeyboardEvent.nm_keyState(address()); }

        /** Sets the specified value to the {@code m_keyCode} field. */
        public B3KeyboardEvent.Buffer m_keyCode(int value) { B3KeyboardEvent.nm_keyCode(address(), value); return this; }
        /** Sets the specified value to the {@code m_keyState} field. */
        public B3KeyboardEvent.Buffer m_keyState(int value) { B3KeyboardEvent.nm_keyState(address(), value); return this; }

    }

}
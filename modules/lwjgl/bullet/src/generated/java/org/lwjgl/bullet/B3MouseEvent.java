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
 * struct b3MouseEvent {
 *     int m_eventType;
 *     float m_mousePosX;
 *     float m_mousePosY;
 *     int m_buttonIndex;
 *     int m_buttonState;
 * }</code></pre>
 */
@NativeType("struct b3MouseEvent")
public class B3MouseEvent extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_EVENTTYPE,
        M_MOUSEPOSX,
        M_MOUSEPOSY,
        M_BUTTONINDEX,
        M_BUTTONSTATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_EVENTTYPE = layout.offsetof(0);
        M_MOUSEPOSX = layout.offsetof(1);
        M_MOUSEPOSY = layout.offsetof(2);
        M_BUTTONINDEX = layout.offsetof(3);
        M_BUTTONSTATE = layout.offsetof(4);
    }

    /**
     * Creates a {@code B3MouseEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3MouseEvent(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_eventType} field. */
    public int m_eventType() { return nm_eventType(address()); }
    /** Returns the value of the {@code m_mousePosX} field. */
    public float m_mousePosX() { return nm_mousePosX(address()); }
    /** Returns the value of the {@code m_mousePosY} field. */
    public float m_mousePosY() { return nm_mousePosY(address()); }
    /** Returns the value of the {@code m_buttonIndex} field. */
    public int m_buttonIndex() { return nm_buttonIndex(address()); }
    /** Returns the value of the {@code m_buttonState} field. */
    public int m_buttonState() { return nm_buttonState(address()); }

    /** Sets the specified value to the {@code m_eventType} field. */
    public B3MouseEvent m_eventType(int value) { nm_eventType(address(), value); return this; }
    /** Sets the specified value to the {@code m_mousePosX} field. */
    public B3MouseEvent m_mousePosX(float value) { nm_mousePosX(address(), value); return this; }
    /** Sets the specified value to the {@code m_mousePosY} field. */
    public B3MouseEvent m_mousePosY(float value) { nm_mousePosY(address(), value); return this; }
    /** Sets the specified value to the {@code m_buttonIndex} field. */
    public B3MouseEvent m_buttonIndex(int value) { nm_buttonIndex(address(), value); return this; }
    /** Sets the specified value to the {@code m_buttonState} field. */
    public B3MouseEvent m_buttonState(int value) { nm_buttonState(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public B3MouseEvent set(
        int m_eventType,
        float m_mousePosX,
        float m_mousePosY,
        int m_buttonIndex,
        int m_buttonState
    ) {
        m_eventType(m_eventType);
        m_mousePosX(m_mousePosX);
        m_mousePosY(m_mousePosY);
        m_buttonIndex(m_buttonIndex);
        m_buttonState(m_buttonState);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3MouseEvent set(B3MouseEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3MouseEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3MouseEvent malloc() {
        return wrap(B3MouseEvent.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3MouseEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3MouseEvent calloc() {
        return wrap(B3MouseEvent.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3MouseEvent} instance allocated with {@link BufferUtils}. */
    public static B3MouseEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3MouseEvent.class, memAddress(container), container);
    }

    /** Returns a new {@code B3MouseEvent} instance for the specified memory address. */
    public static B3MouseEvent create(long address) {
        return wrap(B3MouseEvent.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3MouseEvent createSafe(long address) {
        return address == NULL ? null : wrap(B3MouseEvent.class, address);
    }

    /**
     * Returns a new {@link B3MouseEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3MouseEvent.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3MouseEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3MouseEvent.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3MouseEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3MouseEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3MouseEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3MouseEvent.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3MouseEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3MouseEvent} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3MouseEvent mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3MouseEvent} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3MouseEvent callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3MouseEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3MouseEvent mallocStack(MemoryStack stack) {
        return wrap(B3MouseEvent.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3MouseEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3MouseEvent callocStack(MemoryStack stack) {
        return wrap(B3MouseEvent.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3MouseEvent.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3MouseEvent.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3MouseEvent.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3MouseEvent.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3MouseEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3MouseEvent.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3MouseEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3MouseEvent.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_eventType}. */
    public static int nm_eventType(long struct) { return UNSAFE.getInt(null, struct + B3MouseEvent.M_EVENTTYPE); }
    /** Unsafe version of {@link #m_mousePosX}. */
    public static float nm_mousePosX(long struct) { return UNSAFE.getFloat(null, struct + B3MouseEvent.M_MOUSEPOSX); }
    /** Unsafe version of {@link #m_mousePosY}. */
    public static float nm_mousePosY(long struct) { return UNSAFE.getFloat(null, struct + B3MouseEvent.M_MOUSEPOSY); }
    /** Unsafe version of {@link #m_buttonIndex}. */
    public static int nm_buttonIndex(long struct) { return UNSAFE.getInt(null, struct + B3MouseEvent.M_BUTTONINDEX); }
    /** Unsafe version of {@link #m_buttonState}. */
    public static int nm_buttonState(long struct) { return UNSAFE.getInt(null, struct + B3MouseEvent.M_BUTTONSTATE); }

    /** Unsafe version of {@link #m_eventType(int) m_eventType}. */
    public static void nm_eventType(long struct, int value) { UNSAFE.putInt(null, struct + B3MouseEvent.M_EVENTTYPE, value); }
    /** Unsafe version of {@link #m_mousePosX(float) m_mousePosX}. */
    public static void nm_mousePosX(long struct, float value) { UNSAFE.putFloat(null, struct + B3MouseEvent.M_MOUSEPOSX, value); }
    /** Unsafe version of {@link #m_mousePosY(float) m_mousePosY}. */
    public static void nm_mousePosY(long struct, float value) { UNSAFE.putFloat(null, struct + B3MouseEvent.M_MOUSEPOSY, value); }
    /** Unsafe version of {@link #m_buttonIndex(int) m_buttonIndex}. */
    public static void nm_buttonIndex(long struct, int value) { UNSAFE.putInt(null, struct + B3MouseEvent.M_BUTTONINDEX, value); }
    /** Unsafe version of {@link #m_buttonState(int) m_buttonState}. */
    public static void nm_buttonState(long struct, int value) { UNSAFE.putInt(null, struct + B3MouseEvent.M_BUTTONSTATE, value); }

    // -----------------------------------

    /** An array of {@link B3MouseEvent} structs. */
    public static class Buffer extends StructBuffer<B3MouseEvent, Buffer> implements NativeResource {

        private static final B3MouseEvent ELEMENT_FACTORY = B3MouseEvent.create(-1L);

        /**
         * Creates a new {@code B3MouseEvent.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3MouseEvent#SIZEOF}, and its mark will be undefined.
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
        protected B3MouseEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_eventType} field. */
        public int m_eventType() { return B3MouseEvent.nm_eventType(address()); }
        /** Returns the value of the {@code m_mousePosX} field. */
        public float m_mousePosX() { return B3MouseEvent.nm_mousePosX(address()); }
        /** Returns the value of the {@code m_mousePosY} field. */
        public float m_mousePosY() { return B3MouseEvent.nm_mousePosY(address()); }
        /** Returns the value of the {@code m_buttonIndex} field. */
        public int m_buttonIndex() { return B3MouseEvent.nm_buttonIndex(address()); }
        /** Returns the value of the {@code m_buttonState} field. */
        public int m_buttonState() { return B3MouseEvent.nm_buttonState(address()); }

        /** Sets the specified value to the {@code m_eventType} field. */
        public B3MouseEvent.Buffer m_eventType(int value) { B3MouseEvent.nm_eventType(address(), value); return this; }
        /** Sets the specified value to the {@code m_mousePosX} field. */
        public B3MouseEvent.Buffer m_mousePosX(float value) { B3MouseEvent.nm_mousePosX(address(), value); return this; }
        /** Sets the specified value to the {@code m_mousePosY} field. */
        public B3MouseEvent.Buffer m_mousePosY(float value) { B3MouseEvent.nm_mousePosY(address(), value); return this; }
        /** Sets the specified value to the {@code m_buttonIndex} field. */
        public B3MouseEvent.Buffer m_buttonIndex(int value) { B3MouseEvent.nm_buttonIndex(address(), value); return this; }
        /** Sets the specified value to the {@code m_buttonState} field. */
        public B3MouseEvent.Buffer m_buttonState(int value) { B3MouseEvent.nm_buttonState(address(), value); return this; }

    }

}
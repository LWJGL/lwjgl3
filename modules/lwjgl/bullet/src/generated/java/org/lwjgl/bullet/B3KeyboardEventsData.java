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
 * struct b3KeyboardEventsData {
 *     int m_numKeyboardEvents;
 *     {@link B3KeyboardEvent struct b3KeyboardEvent} * m_keyboardEvents;
 * }</code></pre>
 */
@NativeType("struct b3KeyboardEventsData")
public class B3KeyboardEventsData extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_NUMKEYBOARDEVENTS,
        M_KEYBOARDEVENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_NUMKEYBOARDEVENTS = layout.offsetof(0);
        M_KEYBOARDEVENTS = layout.offsetof(1);
    }

    /**
     * Creates a {@code B3KeyboardEventsData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3KeyboardEventsData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_numKeyboardEvents} field. */
    public int m_numKeyboardEvents() { return nm_numKeyboardEvents(address()); }
    /** Returns a {@link B3KeyboardEvent.Buffer} view of the struct array pointed to by the {@code m_keyboardEvents} field. */
    @NativeType("struct b3KeyboardEvent *")
    public B3KeyboardEvent.Buffer m_keyboardEvents() { return nm_keyboardEvents(address()); }

    /** Sets the address of the specified {@link B3KeyboardEvent.Buffer} to the {@code m_keyboardEvents} field. */
    public B3KeyboardEventsData m_keyboardEvents(@NativeType("struct b3KeyboardEvent *") B3KeyboardEvent.Buffer value) { nm_keyboardEvents(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3KeyboardEventsData set(B3KeyboardEventsData src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3KeyboardEventsData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3KeyboardEventsData malloc() {
        return wrap(B3KeyboardEventsData.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3KeyboardEventsData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3KeyboardEventsData calloc() {
        return wrap(B3KeyboardEventsData.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3KeyboardEventsData} instance allocated with {@link BufferUtils}. */
    public static B3KeyboardEventsData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3KeyboardEventsData.class, memAddress(container), container);
    }

    /** Returns a new {@code B3KeyboardEventsData} instance for the specified memory address. */
    public static B3KeyboardEventsData create(long address) {
        return wrap(B3KeyboardEventsData.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3KeyboardEventsData createSafe(long address) {
        return address == NULL ? null : wrap(B3KeyboardEventsData.class, address);
    }

    /**
     * Returns a new {@link B3KeyboardEventsData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3KeyboardEventsData.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3KeyboardEventsData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3KeyboardEventsData.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3KeyboardEventsData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3KeyboardEventsData.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3KeyboardEventsData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3KeyboardEventsData.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3KeyboardEventsData.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3KeyboardEventsData} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3KeyboardEventsData mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3KeyboardEventsData} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3KeyboardEventsData callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3KeyboardEventsData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3KeyboardEventsData mallocStack(MemoryStack stack) {
        return wrap(B3KeyboardEventsData.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3KeyboardEventsData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3KeyboardEventsData callocStack(MemoryStack stack) {
        return wrap(B3KeyboardEventsData.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3KeyboardEventsData.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3KeyboardEventsData.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3KeyboardEventsData.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3KeyboardEventsData.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3KeyboardEventsData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3KeyboardEventsData.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3KeyboardEventsData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3KeyboardEventsData.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_numKeyboardEvents}. */
    public static int nm_numKeyboardEvents(long struct) { return UNSAFE.getInt(null, struct + B3KeyboardEventsData.M_NUMKEYBOARDEVENTS); }
    /** Unsafe version of {@link #m_keyboardEvents}. */
    public static B3KeyboardEvent.Buffer nm_keyboardEvents(long struct) { return B3KeyboardEvent.create(memGetAddress(struct + B3KeyboardEventsData.M_KEYBOARDEVENTS), nm_numKeyboardEvents(struct)); }

    /** Sets the specified value to the {@code m_numKeyboardEvents} field of the specified {@code struct}. */
    public static void nm_numKeyboardEvents(long struct, int value) { UNSAFE.putInt(null, struct + B3KeyboardEventsData.M_NUMKEYBOARDEVENTS, value); }
    /** Unsafe version of {@link #m_keyboardEvents(B3KeyboardEvent.Buffer) m_keyboardEvents}. */
    public static void nm_keyboardEvents(long struct, B3KeyboardEvent.Buffer value) { memPutAddress(struct + B3KeyboardEventsData.M_KEYBOARDEVENTS, value.address()); nm_numKeyboardEvents(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + B3KeyboardEventsData.M_KEYBOARDEVENTS));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link B3KeyboardEventsData} structs. */
    public static class Buffer extends StructBuffer<B3KeyboardEventsData, Buffer> implements NativeResource {

        private static final B3KeyboardEventsData ELEMENT_FACTORY = B3KeyboardEventsData.create(-1L);

        /**
         * Creates a new {@code B3KeyboardEventsData.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3KeyboardEventsData#SIZEOF}, and its mark will be undefined.
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
        protected B3KeyboardEventsData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_numKeyboardEvents} field. */
        public int m_numKeyboardEvents() { return B3KeyboardEventsData.nm_numKeyboardEvents(address()); }
        /** Returns a {@link B3KeyboardEvent.Buffer} view of the struct array pointed to by the {@code m_keyboardEvents} field. */
        @NativeType("struct b3KeyboardEvent *")
        public B3KeyboardEvent.Buffer m_keyboardEvents() { return B3KeyboardEventsData.nm_keyboardEvents(address()); }

        /** Sets the address of the specified {@link B3KeyboardEvent.Buffer} to the {@code m_keyboardEvents} field. */
        public B3KeyboardEventsData.Buffer m_keyboardEvents(@NativeType("struct b3KeyboardEvent *") B3KeyboardEvent.Buffer value) { B3KeyboardEventsData.nm_keyboardEvents(address(), value); return this; }

    }

}
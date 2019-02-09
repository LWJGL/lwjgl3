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
 * struct b3MouseEventsData {
 *     int m_numMouseEvents;
 *     {@link B3MouseEvent struct b3MouseEvent} * m_mouseEvents;
 * }</code></pre>
 */
@NativeType("struct b3MouseEventsData")
public class B3MouseEventsData extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_NUMMOUSEEVENTS,
        M_MOUSEEVENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_NUMMOUSEEVENTS = layout.offsetof(0);
        M_MOUSEEVENTS = layout.offsetof(1);
    }

    /**
     * Creates a {@code B3MouseEventsData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3MouseEventsData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_numMouseEvents} field. */
    public int m_numMouseEvents() { return nm_numMouseEvents(address()); }
    /** Returns a {@link B3MouseEvent.Buffer} view of the struct array pointed to by the {@code m_mouseEvents} field. */
    @NativeType("struct b3MouseEvent *")
    public B3MouseEvent.Buffer m_mouseEvents() { return nm_mouseEvents(address()); }

    /** Sets the address of the specified {@link B3MouseEvent.Buffer} to the {@code m_mouseEvents} field. */
    public B3MouseEventsData m_mouseEvents(@NativeType("struct b3MouseEvent *") B3MouseEvent.Buffer value) { nm_mouseEvents(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3MouseEventsData set(B3MouseEventsData src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3MouseEventsData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3MouseEventsData malloc() {
        return wrap(B3MouseEventsData.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3MouseEventsData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3MouseEventsData calloc() {
        return wrap(B3MouseEventsData.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3MouseEventsData} instance allocated with {@link BufferUtils}. */
    public static B3MouseEventsData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3MouseEventsData.class, memAddress(container), container);
    }

    /** Returns a new {@code B3MouseEventsData} instance for the specified memory address. */
    public static B3MouseEventsData create(long address) {
        return wrap(B3MouseEventsData.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3MouseEventsData createSafe(long address) {
        return address == NULL ? null : wrap(B3MouseEventsData.class, address);
    }

    /**
     * Returns a new {@link B3MouseEventsData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3MouseEventsData.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3MouseEventsData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3MouseEventsData.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3MouseEventsData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3MouseEventsData.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3MouseEventsData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3MouseEventsData.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3MouseEventsData.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3MouseEventsData} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3MouseEventsData mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3MouseEventsData} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3MouseEventsData callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3MouseEventsData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3MouseEventsData mallocStack(MemoryStack stack) {
        return wrap(B3MouseEventsData.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3MouseEventsData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3MouseEventsData callocStack(MemoryStack stack) {
        return wrap(B3MouseEventsData.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3MouseEventsData.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3MouseEventsData.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3MouseEventsData.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3MouseEventsData.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3MouseEventsData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3MouseEventsData.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3MouseEventsData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3MouseEventsData.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_numMouseEvents}. */
    public static int nm_numMouseEvents(long struct) { return UNSAFE.getInt(null, struct + B3MouseEventsData.M_NUMMOUSEEVENTS); }
    /** Unsafe version of {@link #m_mouseEvents}. */
    public static B3MouseEvent.Buffer nm_mouseEvents(long struct) { return B3MouseEvent.create(memGetAddress(struct + B3MouseEventsData.M_MOUSEEVENTS), nm_numMouseEvents(struct)); }

    /** Sets the specified value to the {@code m_numMouseEvents} field of the specified {@code struct}. */
    public static void nm_numMouseEvents(long struct, int value) { UNSAFE.putInt(null, struct + B3MouseEventsData.M_NUMMOUSEEVENTS, value); }
    /** Unsafe version of {@link #m_mouseEvents(B3MouseEvent.Buffer) m_mouseEvents}. */
    public static void nm_mouseEvents(long struct, B3MouseEvent.Buffer value) { memPutAddress(struct + B3MouseEventsData.M_MOUSEEVENTS, value.address()); nm_numMouseEvents(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + B3MouseEventsData.M_MOUSEEVENTS));
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

    /** An array of {@link B3MouseEventsData} structs. */
    public static class Buffer extends StructBuffer<B3MouseEventsData, Buffer> implements NativeResource {

        private static final B3MouseEventsData ELEMENT_FACTORY = B3MouseEventsData.create(-1L);

        /**
         * Creates a new {@code B3MouseEventsData.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3MouseEventsData#SIZEOF}, and its mark will be undefined.
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
        protected B3MouseEventsData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_numMouseEvents} field. */
        public int m_numMouseEvents() { return B3MouseEventsData.nm_numMouseEvents(address()); }
        /** Returns a {@link B3MouseEvent.Buffer} view of the struct array pointed to by the {@code m_mouseEvents} field. */
        @NativeType("struct b3MouseEvent *")
        public B3MouseEvent.Buffer m_mouseEvents() { return B3MouseEventsData.nm_mouseEvents(address()); }

        /** Sets the address of the specified {@link B3MouseEvent.Buffer} to the {@code m_mouseEvents} field. */
        public B3MouseEventsData.Buffer m_mouseEvents(@NativeType("struct b3MouseEvent *") B3MouseEvent.Buffer value) { B3MouseEventsData.nm_mouseEvents(address(), value); return this; }

    }

}
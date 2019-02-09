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
 * struct b3OverlappingObject {
 *     int m_objectUniqueId;
 *     int m_linkIndex;
 * }</code></pre>
 */
@NativeType("struct b3OverlappingObject")
public class B3OverlappingObject extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_OBJECTUNIQUEID,
        M_LINKINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_OBJECTUNIQUEID = layout.offsetof(0);
        M_LINKINDEX = layout.offsetof(1);
    }

    /**
     * Creates a {@code B3OverlappingObject} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3OverlappingObject(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_objectUniqueId} field. */
    public int m_objectUniqueId() { return nm_objectUniqueId(address()); }
    /** Returns the value of the {@code m_linkIndex} field. */
    public int m_linkIndex() { return nm_linkIndex(address()); }

    /** Sets the specified value to the {@code m_objectUniqueId} field. */
    public B3OverlappingObject m_objectUniqueId(int value) { nm_objectUniqueId(address(), value); return this; }
    /** Sets the specified value to the {@code m_linkIndex} field. */
    public B3OverlappingObject m_linkIndex(int value) { nm_linkIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public B3OverlappingObject set(
        int m_objectUniqueId,
        int m_linkIndex
    ) {
        m_objectUniqueId(m_objectUniqueId);
        m_linkIndex(m_linkIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3OverlappingObject set(B3OverlappingObject src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3OverlappingObject} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3OverlappingObject malloc() {
        return wrap(B3OverlappingObject.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3OverlappingObject} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3OverlappingObject calloc() {
        return wrap(B3OverlappingObject.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3OverlappingObject} instance allocated with {@link BufferUtils}. */
    public static B3OverlappingObject create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3OverlappingObject.class, memAddress(container), container);
    }

    /** Returns a new {@code B3OverlappingObject} instance for the specified memory address. */
    public static B3OverlappingObject create(long address) {
        return wrap(B3OverlappingObject.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3OverlappingObject createSafe(long address) {
        return address == NULL ? null : wrap(B3OverlappingObject.class, address);
    }

    /**
     * Returns a new {@link B3OverlappingObject.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3OverlappingObject.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3OverlappingObject.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3OverlappingObject.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3OverlappingObject.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3OverlappingObject.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3OverlappingObject.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3OverlappingObject.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3OverlappingObject.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3OverlappingObject} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3OverlappingObject mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3OverlappingObject} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3OverlappingObject callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3OverlappingObject} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3OverlappingObject mallocStack(MemoryStack stack) {
        return wrap(B3OverlappingObject.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3OverlappingObject} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3OverlappingObject callocStack(MemoryStack stack) {
        return wrap(B3OverlappingObject.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3OverlappingObject.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3OverlappingObject.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3OverlappingObject.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3OverlappingObject.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3OverlappingObject.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3OverlappingObject.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3OverlappingObject.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3OverlappingObject.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_objectUniqueId}. */
    public static int nm_objectUniqueId(long struct) { return UNSAFE.getInt(null, struct + B3OverlappingObject.M_OBJECTUNIQUEID); }
    /** Unsafe version of {@link #m_linkIndex}. */
    public static int nm_linkIndex(long struct) { return UNSAFE.getInt(null, struct + B3OverlappingObject.M_LINKINDEX); }

    /** Unsafe version of {@link #m_objectUniqueId(int) m_objectUniqueId}. */
    public static void nm_objectUniqueId(long struct, int value) { UNSAFE.putInt(null, struct + B3OverlappingObject.M_OBJECTUNIQUEID, value); }
    /** Unsafe version of {@link #m_linkIndex(int) m_linkIndex}. */
    public static void nm_linkIndex(long struct, int value) { UNSAFE.putInt(null, struct + B3OverlappingObject.M_LINKINDEX, value); }

    // -----------------------------------

    /** An array of {@link B3OverlappingObject} structs. */
    public static class Buffer extends StructBuffer<B3OverlappingObject, Buffer> implements NativeResource {

        private static final B3OverlappingObject ELEMENT_FACTORY = B3OverlappingObject.create(-1L);

        /**
         * Creates a new {@code B3OverlappingObject.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3OverlappingObject#SIZEOF}, and its mark will be undefined.
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
        protected B3OverlappingObject getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_objectUniqueId} field. */
        public int m_objectUniqueId() { return B3OverlappingObject.nm_objectUniqueId(address()); }
        /** Returns the value of the {@code m_linkIndex} field. */
        public int m_linkIndex() { return B3OverlappingObject.nm_linkIndex(address()); }

        /** Sets the specified value to the {@code m_objectUniqueId} field. */
        public B3OverlappingObject.Buffer m_objectUniqueId(int value) { B3OverlappingObject.nm_objectUniqueId(address(), value); return this; }
        /** Sets the specified value to the {@code m_linkIndex} field. */
        public B3OverlappingObject.Buffer m_linkIndex(int value) { B3OverlappingObject.nm_linkIndex(address(), value); return this; }

    }

}
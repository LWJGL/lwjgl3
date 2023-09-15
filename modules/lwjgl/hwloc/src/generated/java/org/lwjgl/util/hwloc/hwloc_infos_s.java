/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.hwloc;

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
 * struct hwloc_infos_s {
 *     {@link hwloc_info_s struct hwloc_info_s} * array;
 *     unsigned count;
 *     unsigned allocated;
 * }</code></pre>
 */
@NativeType("struct hwloc_infos_s")
public class hwloc_infos_s extends Struct<hwloc_infos_s> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ARRAY,
        COUNT,
        ALLOCATED;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ARRAY = layout.offsetof(0);
        COUNT = layout.offsetof(1);
        ALLOCATED = layout.offsetof(2);
    }

    protected hwloc_infos_s(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hwloc_infos_s create(long address, @Nullable ByteBuffer container) {
        return new hwloc_infos_s(address, container);
    }

    /**
     * Creates a {@code hwloc_infos_s} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hwloc_infos_s(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link hwloc_info_s.Buffer} view of the struct array pointed to by the {@code array} field. */
    @Nullable
    @NativeType("struct hwloc_info_s *")
    public hwloc_info_s.Buffer array() { return narray(address()); }
    /** @return the value of the {@code count} field. */
    @NativeType("unsigned")
    public int count() { return ncount(address()); }

    // -----------------------------------

    /** Returns a new {@code hwloc_infos_s} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hwloc_infos_s malloc() {
        return new hwloc_infos_s(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hwloc_infos_s} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hwloc_infos_s calloc() {
        return new hwloc_infos_s(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hwloc_infos_s} instance allocated with {@link BufferUtils}. */
    public static hwloc_infos_s create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hwloc_infos_s(memAddress(container), container);
    }

    /** Returns a new {@code hwloc_infos_s} instance for the specified memory address. */
    public static hwloc_infos_s create(long address) {
        return new hwloc_infos_s(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_infos_s createSafe(long address) {
        return address == NULL ? null : new hwloc_infos_s(address, null);
    }

    /**
     * Returns a new {@link hwloc_infos_s.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hwloc_infos_s.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hwloc_infos_s.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hwloc_infos_s.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hwloc_infos_s.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hwloc_infos_s.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hwloc_infos_s.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hwloc_infos_s.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_infos_s.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hwloc_infos_s} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hwloc_infos_s malloc(MemoryStack stack) {
        return new hwloc_infos_s(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hwloc_infos_s} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hwloc_infos_s calloc(MemoryStack stack) {
        return new hwloc_infos_s(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hwloc_infos_s.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hwloc_infos_s.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hwloc_infos_s.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hwloc_infos_s.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #array}. */
    @Nullable public static hwloc_info_s.Buffer narray(long struct) { return hwloc_info_s.createSafe(memGetAddress(struct + hwloc_infos_s.ARRAY), ncount(struct)); }
    /** Unsafe version of {@link #count}. */
    public static int ncount(long struct) { return UNSAFE.getInt(null, struct + hwloc_infos_s.COUNT); }
    public static int nallocated(long struct) { return UNSAFE.getInt(null, struct + hwloc_infos_s.ALLOCATED); }

    // -----------------------------------

    /** An array of {@link hwloc_infos_s} structs. */
    public static class Buffer extends StructBuffer<hwloc_infos_s, Buffer> implements NativeResource {

        private static final hwloc_infos_s ELEMENT_FACTORY = hwloc_infos_s.create(-1L);

        /**
         * Creates a new {@code hwloc_infos_s.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hwloc_infos_s#SIZEOF}, and its mark will be undefined.</p>
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
        protected hwloc_infos_s getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link hwloc_info_s.Buffer} view of the struct array pointed to by the {@code array} field. */
        @Nullable
        @NativeType("struct hwloc_info_s *")
        public hwloc_info_s.Buffer array() { return hwloc_infos_s.narray(address()); }
        /** @return the value of the {@code count} field. */
        @NativeType("unsigned")
        public int count() { return hwloc_infos_s.ncount(address()); }

    }

}
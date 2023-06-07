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
 * struct hwloc_location {
 *     enum hwloc_location_type_e type;
 *     {@link hwloc_location_u hwloc_location_u} location;
 * }</code></pre>
 */
@NativeType("struct hwloc_location")
public class hwloc_location extends Struct<hwloc_location> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        LOCATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(hwloc_location_u.SIZEOF, hwloc_location_u.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        LOCATION = layout.offsetof(1);
    }

    protected hwloc_location(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hwloc_location create(long address, @Nullable ByteBuffer container) {
        return new hwloc_location(address, container);
    }

    /**
     * Creates a {@code hwloc_location} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hwloc_location(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("enum hwloc_location_type_e")
    public int type() { return ntype(address()); }
    /** @return a {@link hwloc_location_u} view of the {@code location} field. */
    public hwloc_location_u location() { return nlocation(address()); }

    // -----------------------------------

    /** Returns a new {@code hwloc_location} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hwloc_location malloc() {
        return new hwloc_location(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hwloc_location} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hwloc_location calloc() {
        return new hwloc_location(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hwloc_location} instance allocated with {@link BufferUtils}. */
    public static hwloc_location create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hwloc_location(memAddress(container), container);
    }

    /** Returns a new {@code hwloc_location} instance for the specified memory address. */
    public static hwloc_location create(long address) {
        return new hwloc_location(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_location createSafe(long address) {
        return address == NULL ? null : new hwloc_location(address, null);
    }

    /**
     * Returns a new {@link hwloc_location.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hwloc_location.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hwloc_location.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hwloc_location.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hwloc_location.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hwloc_location.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hwloc_location.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hwloc_location.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_location.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hwloc_location} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hwloc_location malloc(MemoryStack stack) {
        return new hwloc_location(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hwloc_location} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hwloc_location calloc(MemoryStack stack) {
        return new hwloc_location(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hwloc_location.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hwloc_location.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hwloc_location.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hwloc_location.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + hwloc_location.TYPE); }
    /** Unsafe version of {@link #location}. */
    public static hwloc_location_u nlocation(long struct) { return hwloc_location_u.create(struct + hwloc_location.LOCATION); }

    // -----------------------------------

    /** An array of {@link hwloc_location} structs. */
    public static class Buffer extends StructBuffer<hwloc_location, Buffer> implements NativeResource {

        private static final hwloc_location ELEMENT_FACTORY = hwloc_location.create(-1L);

        /**
         * Creates a new {@code hwloc_location.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hwloc_location#SIZEOF}, and its mark will be undefined.</p>
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
        protected hwloc_location getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("enum hwloc_location_type_e")
        public int type() { return hwloc_location.ntype(address()); }
        /** @return a {@link hwloc_location_u} view of the {@code location} field. */
        public hwloc_location_u location() { return hwloc_location.nlocation(address()); }

    }

}
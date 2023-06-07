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
 * struct hwloc_distances_s {
 *     unsigned int nbobjs;
 *     hwloc_obj_t * objs;
 *     unsigned long kind;
 *     hwloc_uint64_t * values;
 * }</code></pre>
 */
@NativeType("struct hwloc_distances_s")
public class hwloc_distances_s extends Struct<hwloc_distances_s> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NBOBJS,
        OBJS,
        KIND,
        VALUES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NBOBJS = layout.offsetof(0);
        OBJS = layout.offsetof(1);
        KIND = layout.offsetof(2);
        VALUES = layout.offsetof(3);
    }

    protected hwloc_distances_s(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hwloc_distances_s create(long address, @Nullable ByteBuffer container) {
        return new hwloc_distances_s(address, container);
    }

    /**
     * Creates a {@code hwloc_distances_s} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hwloc_distances_s(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code nbobjs} field. */
    @NativeType("unsigned int")
    public int nbobjs() { return nnbobjs(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code objs} field. */
    @NativeType("hwloc_obj_t *")
    public PointerBuffer objs() { return nobjs(address()); }
    /** @return the value of the {@code kind} field. */
    @NativeType("unsigned long")
    public long kind() { return nkind(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code values} field. */
    @NativeType("hwloc_uint64_t *")
    public LongBuffer values() { return nvalues(address()); }

    // -----------------------------------

    /** Returns a new {@code hwloc_distances_s} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hwloc_distances_s malloc() {
        return new hwloc_distances_s(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hwloc_distances_s} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hwloc_distances_s calloc() {
        return new hwloc_distances_s(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hwloc_distances_s} instance allocated with {@link BufferUtils}. */
    public static hwloc_distances_s create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hwloc_distances_s(memAddress(container), container);
    }

    /** Returns a new {@code hwloc_distances_s} instance for the specified memory address. */
    public static hwloc_distances_s create(long address) {
        return new hwloc_distances_s(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_distances_s createSafe(long address) {
        return address == NULL ? null : new hwloc_distances_s(address, null);
    }

    /**
     * Returns a new {@link hwloc_distances_s.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hwloc_distances_s.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hwloc_distances_s.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hwloc_distances_s.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hwloc_distances_s.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hwloc_distances_s.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hwloc_distances_s.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hwloc_distances_s.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hwloc_distances_s.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hwloc_distances_s} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hwloc_distances_s malloc(MemoryStack stack) {
        return new hwloc_distances_s(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hwloc_distances_s} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hwloc_distances_s calloc(MemoryStack stack) {
        return new hwloc_distances_s(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hwloc_distances_s.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hwloc_distances_s.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hwloc_distances_s.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hwloc_distances_s.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #nbobjs}. */
    public static int nnbobjs(long struct) { return UNSAFE.getInt(null, struct + hwloc_distances_s.NBOBJS); }
    /** Unsafe version of {@link #objs() objs}. */
    public static PointerBuffer nobjs(long struct) { return memPointerBuffer(memGetAddress(struct + hwloc_distances_s.OBJS), nnbobjs(struct)); }
    /** Unsafe version of {@link #kind}. */
    public static long nkind(long struct) { return memGetCLong(struct + hwloc_distances_s.KIND); }
    /** Unsafe version of {@link #values() values}. */
    public static LongBuffer nvalues(long struct) { return memLongBuffer(memGetAddress(struct + hwloc_distances_s.VALUES), nnbobjs(struct) * nnbobjs(struct)); }

    // -----------------------------------

    /** An array of {@link hwloc_distances_s} structs. */
    public static class Buffer extends StructBuffer<hwloc_distances_s, Buffer> implements NativeResource {

        private static final hwloc_distances_s ELEMENT_FACTORY = hwloc_distances_s.create(-1L);

        /**
         * Creates a new {@code hwloc_distances_s.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hwloc_distances_s#SIZEOF}, and its mark will be undefined.</p>
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
        protected hwloc_distances_s getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code nbobjs} field. */
        @NativeType("unsigned int")
        public int nbobjs() { return hwloc_distances_s.nnbobjs(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code objs} field. */
        @NativeType("hwloc_obj_t *")
        public PointerBuffer objs() { return hwloc_distances_s.nobjs(address()); }
        /** @return the value of the {@code kind} field. */
        @NativeType("unsigned long")
        public long kind() { return hwloc_distances_s.nkind(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code values} field. */
        @NativeType("hwloc_uint64_t *")
        public LongBuffer values() { return hwloc_distances_s.nvalues(address()); }

    }

}
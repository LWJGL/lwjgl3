/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.par;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Client-owned list of line strips that will be tessellated.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct parsl_spine_list {
 *     uint32_t num_vertices;
 *     uint16_t num_spines;
 *     {@link ParSLPosition parsl_position} * vertices;
 *     uint16_t * spine_lengths;
 *     bool closed;
 * }</code></pre>
 */
@NativeType("struct parsl_spine_list")
public class ParSLSpineList extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NUM_VERTICES,
        NUM_SPINES,
        VERTICES,
        SPINE_LENGTHS,
        CLOSED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(2),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NUM_VERTICES = layout.offsetof(0);
        NUM_SPINES = layout.offsetof(1);
        VERTICES = layout.offsetof(2);
        SPINE_LENGTHS = layout.offsetof(3);
        CLOSED = layout.offsetof(4);
    }

    /**
     * Creates a {@code ParSLSpineList} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ParSLSpineList(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code num_vertices} field. */
    @NativeType("uint32_t")
    public int num_vertices() { return nnum_vertices(address()); }
    /** @return the value of the {@code num_spines} field. */
    @NativeType("uint16_t")
    public short num_spines() { return nnum_spines(address()); }
    /** @return a {@link ParSLPosition.Buffer} view of the struct array pointed to by the {@code vertices} field. */
    @NativeType("parsl_position *")
    public ParSLPosition.Buffer vertices() { return nvertices(address()); }
    /** @return a {@link ShortBuffer} view of the data pointed to by the {@code spine_lengths} field. */
    @NativeType("uint16_t *")
    public ShortBuffer spine_lengths() { return nspine_lengths(address()); }
    /** @return the value of the {@code closed} field. */
    @NativeType("bool")
    public boolean closed() { return nclosed(address()); }

    /** Sets the address of the specified {@link ParSLPosition.Buffer} to the {@code vertices} field. */
    public ParSLSpineList vertices(@NativeType("parsl_position *") ParSLPosition.Buffer value) { nvertices(address(), value); return this; }
    /** Sets the address of the specified {@link ShortBuffer} to the {@code spine_lengths} field. */
    public ParSLSpineList spine_lengths(@NativeType("uint16_t *") ShortBuffer value) { nspine_lengths(address(), value); return this; }
    /** Sets the specified value to the {@code closed} field. */
    public ParSLSpineList closed(@NativeType("bool") boolean value) { nclosed(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ParSLSpineList set(
        ParSLPosition.Buffer vertices,
        ShortBuffer spine_lengths,
        boolean closed
    ) {
        vertices(vertices);
        spine_lengths(spine_lengths);
        closed(closed);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ParSLSpineList set(ParSLSpineList src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ParSLSpineList} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ParSLSpineList malloc() {
        return wrap(ParSLSpineList.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ParSLSpineList} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ParSLSpineList calloc() {
        return wrap(ParSLSpineList.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ParSLSpineList} instance allocated with {@link BufferUtils}. */
    public static ParSLSpineList create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ParSLSpineList.class, memAddress(container), container);
    }

    /** Returns a new {@code ParSLSpineList} instance for the specified memory address. */
    public static ParSLSpineList create(long address) {
        return wrap(ParSLSpineList.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ParSLSpineList createSafe(long address) {
        return address == NULL ? null : wrap(ParSLSpineList.class, address);
    }

    /**
     * Returns a new {@link ParSLSpineList.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ParSLSpineList.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ParSLSpineList.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ParSLSpineList.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ParSLSpineList.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ParSLSpineList.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ParSLSpineList.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ParSLSpineList.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ParSLSpineList.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ParSLSpineList mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ParSLSpineList callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static ParSLSpineList mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static ParSLSpineList callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ParSLSpineList.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ParSLSpineList.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static ParSLSpineList.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static ParSLSpineList.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code ParSLSpineList} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ParSLSpineList malloc(MemoryStack stack) {
        return wrap(ParSLSpineList.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ParSLSpineList} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ParSLSpineList calloc(MemoryStack stack) {
        return wrap(ParSLSpineList.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ParSLSpineList.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ParSLSpineList.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ParSLSpineList.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ParSLSpineList.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #num_vertices}. */
    public static int nnum_vertices(long struct) { return UNSAFE.getInt(null, struct + ParSLSpineList.NUM_VERTICES); }
    /** Unsafe version of {@link #num_spines}. */
    public static short nnum_spines(long struct) { return UNSAFE.getShort(null, struct + ParSLSpineList.NUM_SPINES); }
    /** Unsafe version of {@link #vertices}. */
    public static ParSLPosition.Buffer nvertices(long struct) { return ParSLPosition.create(memGetAddress(struct + ParSLSpineList.VERTICES), nnum_vertices(struct)); }
    /** Unsafe version of {@link #spine_lengths() spine_lengths}. */
    public static ShortBuffer nspine_lengths(long struct) { return memShortBuffer(memGetAddress(struct + ParSLSpineList.SPINE_LENGTHS), Short.toUnsignedInt(nnum_spines(struct))); }
    /** Unsafe version of {@link #closed}. */
    public static boolean nclosed(long struct) { return UNSAFE.getByte(null, struct + ParSLSpineList.CLOSED) != 0; }

    /** Sets the specified value to the {@code num_vertices} field of the specified {@code struct}. */
    public static void nnum_vertices(long struct, int value) { UNSAFE.putInt(null, struct + ParSLSpineList.NUM_VERTICES, value); }
    /** Sets the specified value to the {@code num_spines} field of the specified {@code struct}. */
    public static void nnum_spines(long struct, short value) { UNSAFE.putShort(null, struct + ParSLSpineList.NUM_SPINES, value); }
    /** Unsafe version of {@link #vertices(ParSLPosition.Buffer) vertices}. */
    public static void nvertices(long struct, ParSLPosition.Buffer value) { memPutAddress(struct + ParSLSpineList.VERTICES, value.address()); nnum_vertices(struct, value.remaining()); }
    /** Unsafe version of {@link #spine_lengths(ShortBuffer) spine_lengths}. */
    public static void nspine_lengths(long struct, ShortBuffer value) { memPutAddress(struct + ParSLSpineList.SPINE_LENGTHS, memAddress(value)); nnum_spines(struct, (short)value.remaining()); }
    /** Unsafe version of {@link #closed(boolean) closed}. */
    public static void nclosed(long struct, boolean value) { UNSAFE.putByte(null, struct + ParSLSpineList.CLOSED, value ? (byte)1 : (byte)0); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ParSLSpineList.VERTICES));
        check(memGetAddress(struct + ParSLSpineList.SPINE_LENGTHS));
    }

    // -----------------------------------

    /** An array of {@link ParSLSpineList} structs. */
    public static class Buffer extends StructBuffer<ParSLSpineList, Buffer> implements NativeResource {

        private static final ParSLSpineList ELEMENT_FACTORY = ParSLSpineList.create(-1L);

        /**
         * Creates a new {@code ParSLSpineList.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ParSLSpineList#SIZEOF}, and its mark will be undefined.
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
        protected ParSLSpineList getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code num_vertices} field. */
        @NativeType("uint32_t")
        public int num_vertices() { return ParSLSpineList.nnum_vertices(address()); }
        /** @return the value of the {@code num_spines} field. */
        @NativeType("uint16_t")
        public short num_spines() { return ParSLSpineList.nnum_spines(address()); }
        /** @return a {@link ParSLPosition.Buffer} view of the struct array pointed to by the {@code vertices} field. */
        @NativeType("parsl_position *")
        public ParSLPosition.Buffer vertices() { return ParSLSpineList.nvertices(address()); }
        /** @return a {@link ShortBuffer} view of the data pointed to by the {@code spine_lengths} field. */
        @NativeType("uint16_t *")
        public ShortBuffer spine_lengths() { return ParSLSpineList.nspine_lengths(address()); }
        /** @return the value of the {@code closed} field. */
        @NativeType("bool")
        public boolean closed() { return ParSLSpineList.nclosed(address()); }

        /** Sets the address of the specified {@link ParSLPosition.Buffer} to the {@code vertices} field. */
        public ParSLSpineList.Buffer vertices(@NativeType("parsl_position *") ParSLPosition.Buffer value) { ParSLSpineList.nvertices(address(), value); return this; }
        /** Sets the address of the specified {@link ShortBuffer} to the {@code spine_lengths} field. */
        public ParSLSpineList.Buffer spine_lengths(@NativeType("uint16_t *") ShortBuffer value) { ParSLSpineList.nspine_lengths(address(), value); return this; }
        /** Sets the specified value to the {@code closed} field. */
        public ParSLSpineList.Buffer closed(@NativeType("bool") boolean value) { ParSLSpineList.nclosed(address(), value); return this; }

    }

}
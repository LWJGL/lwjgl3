/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Specifies a memory location.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUmemLocation {
 *     CUmemLocationType {@link #type};
 *     int {@link #id};
 * }</code></pre>
 */
public class CUmemLocation extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        ID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        ID = layout.offsetof(1);
    }

    /**
     * Creates a {@code CUmemLocation} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUmemLocation(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** specifies the location type, which modifies the meaning of id */
    @NativeType("CUmemLocationType")
    public int type() { return ntype(address()); }
    /** identifier for a given this location's {@code CUmemLocationType} */
    public int id() { return nid(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public CUmemLocation type(@NativeType("CUmemLocationType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #id} field. */
    public CUmemLocation id(int value) { nid(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUmemLocation set(
        int type,
        int id
    ) {
        type(type);
        id(id);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUmemLocation set(CUmemLocation src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUmemLocation} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUmemLocation malloc() {
        return wrap(CUmemLocation.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUmemLocation} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUmemLocation calloc() {
        return wrap(CUmemLocation.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUmemLocation} instance allocated with {@link BufferUtils}. */
    public static CUmemLocation create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUmemLocation.class, memAddress(container), container);
    }

    /** Returns a new {@code CUmemLocation} instance for the specified memory address. */
    public static CUmemLocation create(long address) {
        return wrap(CUmemLocation.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUmemLocation createSafe(long address) {
        return address == NULL ? null : wrap(CUmemLocation.class, address);
    }

    /**
     * Returns a new {@link CUmemLocation.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUmemLocation.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUmemLocation.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUmemLocation.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUmemLocation.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUmemLocation.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUmemLocation.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUmemLocation.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUmemLocation.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code CUmemLocation} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUmemLocation malloc(MemoryStack stack) {
        return wrap(CUmemLocation.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUmemLocation} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUmemLocation calloc(MemoryStack stack) {
        return wrap(CUmemLocation.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUmemLocation.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUmemLocation.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUmemLocation.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUmemLocation.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + CUmemLocation.TYPE); }
    /** Unsafe version of {@link #id}. */
    public static int nid(long struct) { return UNSAFE.getInt(null, struct + CUmemLocation.ID); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + CUmemLocation.TYPE, value); }
    /** Unsafe version of {@link #id(int) id}. */
    public static void nid(long struct, int value) { UNSAFE.putInt(null, struct + CUmemLocation.ID, value); }

    // -----------------------------------

    /** An array of {@link CUmemLocation} structs. */
    public static class Buffer extends StructBuffer<CUmemLocation, Buffer> implements NativeResource {

        private static final CUmemLocation ELEMENT_FACTORY = CUmemLocation.create(-1L);

        /**
         * Creates a new {@code CUmemLocation.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUmemLocation#SIZEOF}, and its mark will be undefined.
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
        protected CUmemLocation getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link CUmemLocation#type} field. */
        @NativeType("CUmemLocationType")
        public int type() { return CUmemLocation.ntype(address()); }
        /** @return the value of the {@link CUmemLocation#id} field. */
        public int id() { return CUmemLocation.nid(address()); }

        /** Sets the specified value to the {@link CUmemLocation#type} field. */
        public CUmemLocation.Buffer type(@NativeType("CUmemLocationType") int value) { CUmemLocation.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link CUmemLocation#id} field. */
        public CUmemLocation.Buffer id(int value) { CUmemLocation.nid(address(), value); return this; }

    }

}
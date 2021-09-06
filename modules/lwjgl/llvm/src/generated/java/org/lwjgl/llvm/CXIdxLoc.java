/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Source location passed to index callbacks.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CXIdxLoc {
 *     void * ptr_data[2];
 *     unsigned int_data;
 * }</code></pre>
 */
public class CXIdxLoc extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PTR_DATA,
        INT_DATA;

    static {
        Layout layout = __struct(
            __array(POINTER_SIZE, 2),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PTR_DATA = layout.offsetof(0);
        INT_DATA = layout.offsetof(1);
    }

    /**
     * Creates a {@code CXIdxLoc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXIdxLoc(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link PointerBuffer} view of the {@code ptr_data} field. */
    @NativeType("void *[2]")
    public PointerBuffer ptr_data() { return nptr_data(address()); }
    /** @return the value at the specified index of the {@code ptr_data} field. */
    @NativeType("void *")
    public long ptr_data(int index) { return nptr_data(address(), index); }
    /** @return the value of the {@code int_data} field. */
    @NativeType("unsigned")
    public int int_data() { return nint_data(address()); }

    // -----------------------------------

    /** Returns a new {@code CXIdxLoc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CXIdxLoc malloc() {
        return wrap(CXIdxLoc.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CXIdxLoc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CXIdxLoc calloc() {
        return wrap(CXIdxLoc.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CXIdxLoc} instance allocated with {@link BufferUtils}. */
    public static CXIdxLoc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CXIdxLoc.class, memAddress(container), container);
    }

    /** Returns a new {@code CXIdxLoc} instance for the specified memory address. */
    public static CXIdxLoc create(long address) {
        return wrap(CXIdxLoc.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxLoc createSafe(long address) {
        return address == NULL ? null : wrap(CXIdxLoc.class, address);
    }

    /**
     * Returns a new {@link CXIdxLoc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXIdxLoc.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CXIdxLoc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXIdxLoc.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXIdxLoc.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CXIdxLoc.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CXIdxLoc.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXIdxLoc.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXIdxLoc.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXIdxLoc mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXIdxLoc callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXIdxLoc mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXIdxLoc callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXIdxLoc.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXIdxLoc.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXIdxLoc.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXIdxLoc.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CXIdxLoc} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CXIdxLoc malloc(MemoryStack stack) {
        return wrap(CXIdxLoc.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CXIdxLoc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CXIdxLoc calloc(MemoryStack stack) {
        return wrap(CXIdxLoc.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CXIdxLoc.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXIdxLoc.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXIdxLoc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXIdxLoc.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ptr_data}. */
    public static PointerBuffer nptr_data(long struct) { return memPointerBuffer(struct + CXIdxLoc.PTR_DATA, 2); }
    /** Unsafe version of {@link #ptr_data(int) ptr_data}. */
    public static long nptr_data(long struct, int index) {
        return memGetAddress(struct + CXIdxLoc.PTR_DATA + check(index, 2) * POINTER_SIZE);
    }
    /** Unsafe version of {@link #int_data}. */
    public static int nint_data(long struct) { return UNSAFE.getInt(null, struct + CXIdxLoc.INT_DATA); }

    // -----------------------------------

    /** An array of {@link CXIdxLoc} structs. */
    public static class Buffer extends StructBuffer<CXIdxLoc, Buffer> implements NativeResource {

        private static final CXIdxLoc ELEMENT_FACTORY = CXIdxLoc.create(-1L);

        /**
         * Creates a new {@code CXIdxLoc.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXIdxLoc#SIZEOF}, and its mark will be undefined.
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
        protected CXIdxLoc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link PointerBuffer} view of the {@code ptr_data} field. */
        @NativeType("void *[2]")
        public PointerBuffer ptr_data() { return CXIdxLoc.nptr_data(address()); }
        /** @return the value at the specified index of the {@code ptr_data} field. */
        @NativeType("void *")
        public long ptr_data(int index) { return CXIdxLoc.nptr_data(address(), index); }
        /** @return the value of the {@code int_data} field. */
        @NativeType("unsigned")
        public int int_data() { return CXIdxLoc.nint_data(address()); }

    }

}
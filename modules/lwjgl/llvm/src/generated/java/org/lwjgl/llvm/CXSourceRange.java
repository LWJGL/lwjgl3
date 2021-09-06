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
 * Identifies a half-open character range in the source code.
 * 
 * <p>Use {@link ClangIndex#clang_getRangeStart getRangeStart} and {@link ClangIndex#clang_getRangeEnd getRangeEnd} to retrieve the starting and end locations from a source range, respectively.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CXSourceRange {
 *     void const * ptr_data[2];
 *     unsigned begin_int_data;
 *     unsigned end_int_data;
 * }</code></pre>
 */
public class CXSourceRange extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PTR_DATA,
        BEGIN_INT_DATA,
        END_INT_DATA;

    static {
        Layout layout = __struct(
            __array(POINTER_SIZE, 2),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PTR_DATA = layout.offsetof(0);
        BEGIN_INT_DATA = layout.offsetof(1);
        END_INT_DATA = layout.offsetof(2);
    }

    /**
     * Creates a {@code CXSourceRange} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXSourceRange(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link PointerBuffer} view of the {@code ptr_data} field. */
    @NativeType("void const *[2]")
    public PointerBuffer ptr_data() { return nptr_data(address()); }
    /** @return the value at the specified index of the {@code ptr_data} field. */
    @NativeType("void const *")
    public long ptr_data(int index) { return nptr_data(address(), index); }
    /** @return the value of the {@code begin_int_data} field. */
    @NativeType("unsigned")
    public int begin_int_data() { return nbegin_int_data(address()); }
    /** @return the value of the {@code end_int_data} field. */
    @NativeType("unsigned")
    public int end_int_data() { return nend_int_data(address()); }

    // -----------------------------------

    /** Returns a new {@code CXSourceRange} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CXSourceRange malloc() {
        return wrap(CXSourceRange.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CXSourceRange} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CXSourceRange calloc() {
        return wrap(CXSourceRange.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CXSourceRange} instance allocated with {@link BufferUtils}. */
    public static CXSourceRange create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CXSourceRange.class, memAddress(container), container);
    }

    /** Returns a new {@code CXSourceRange} instance for the specified memory address. */
    public static CXSourceRange create(long address) {
        return wrap(CXSourceRange.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXSourceRange createSafe(long address) {
        return address == NULL ? null : wrap(CXSourceRange.class, address);
    }

    /**
     * Returns a new {@link CXSourceRange.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXSourceRange.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CXSourceRange.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXSourceRange.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXSourceRange.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CXSourceRange.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CXSourceRange.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXSourceRange.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXSourceRange.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXSourceRange mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXSourceRange callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXSourceRange mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXSourceRange callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXSourceRange.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXSourceRange.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXSourceRange.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXSourceRange.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CXSourceRange} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CXSourceRange malloc(MemoryStack stack) {
        return wrap(CXSourceRange.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CXSourceRange} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CXSourceRange calloc(MemoryStack stack) {
        return wrap(CXSourceRange.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CXSourceRange.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXSourceRange.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXSourceRange.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXSourceRange.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ptr_data}. */
    public static PointerBuffer nptr_data(long struct) { return memPointerBuffer(struct + CXSourceRange.PTR_DATA, 2); }
    /** Unsafe version of {@link #ptr_data(int) ptr_data}. */
    public static long nptr_data(long struct, int index) {
        return memGetAddress(struct + CXSourceRange.PTR_DATA + check(index, 2) * POINTER_SIZE);
    }
    /** Unsafe version of {@link #begin_int_data}. */
    public static int nbegin_int_data(long struct) { return UNSAFE.getInt(null, struct + CXSourceRange.BEGIN_INT_DATA); }
    /** Unsafe version of {@link #end_int_data}. */
    public static int nend_int_data(long struct) { return UNSAFE.getInt(null, struct + CXSourceRange.END_INT_DATA); }

    // -----------------------------------

    /** An array of {@link CXSourceRange} structs. */
    public static class Buffer extends StructBuffer<CXSourceRange, Buffer> implements NativeResource {

        private static final CXSourceRange ELEMENT_FACTORY = CXSourceRange.create(-1L);

        /**
         * Creates a new {@code CXSourceRange.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXSourceRange#SIZEOF}, and its mark will be undefined.
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
        protected CXSourceRange getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link PointerBuffer} view of the {@code ptr_data} field. */
        @NativeType("void const *[2]")
        public PointerBuffer ptr_data() { return CXSourceRange.nptr_data(address()); }
        /** @return the value at the specified index of the {@code ptr_data} field. */
        @NativeType("void const *")
        public long ptr_data(int index) { return CXSourceRange.nptr_data(address(), index); }
        /** @return the value of the {@code begin_int_data} field. */
        @NativeType("unsigned")
        public int begin_int_data() { return CXSourceRange.nbegin_int_data(address()); }
        /** @return the value of the {@code end_int_data} field. */
        @NativeType("unsigned")
        public int end_int_data() { return CXSourceRange.nend_int_data(address()); }

    }

}
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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Contains the results of code-completion.
 * 
 * <p>This data structure contains the results of code completion, as produced by {@link ClangIndex#clang_codeCompleteAt codeCompleteAt}. Its contents must be freed by
 * {@link ClangIndex#clang_disposeCodeCompleteResults disposeCodeCompleteResults}.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CXCodeCompleteResults {
 *     {@link CXCompletionResult CXCompletionResult} * {@link #Results};
 *     unsigned {@link #NumResults};
 * }</code></pre>
 */
public class CXCodeCompleteResults extends Struct<CXCodeCompleteResults> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RESULTS,
        NUMRESULTS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RESULTS = layout.offsetof(0);
        NUMRESULTS = layout.offsetof(1);
    }

    protected CXCodeCompleteResults(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CXCodeCompleteResults create(long address, @Nullable ByteBuffer container) {
        return new CXCodeCompleteResults(address, container);
    }

    /**
     * Creates a {@code CXCodeCompleteResults} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXCodeCompleteResults(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the code-completion results */
    @NativeType("CXCompletionResult *")
    public CXCompletionResult.Buffer Results() { return nResults(address()); }
    /** the number of code-completion results stored in the {@code Results} array */
    @NativeType("unsigned")
    public int NumResults() { return nNumResults(address()); }

    // -----------------------------------

    /** Returns a new {@code CXCodeCompleteResults} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CXCodeCompleteResults malloc() {
        return new CXCodeCompleteResults(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CXCodeCompleteResults} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CXCodeCompleteResults calloc() {
        return new CXCodeCompleteResults(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CXCodeCompleteResults} instance allocated with {@link BufferUtils}. */
    public static CXCodeCompleteResults create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CXCodeCompleteResults(memAddress(container), container);
    }

    /** Returns a new {@code CXCodeCompleteResults} instance for the specified memory address. */
    public static CXCodeCompleteResults create(long address) {
        return new CXCodeCompleteResults(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXCodeCompleteResults createSafe(long address) {
        return address == NULL ? null : new CXCodeCompleteResults(address, null);
    }

    /**
     * Returns a new {@link CXCodeCompleteResults.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXCodeCompleteResults.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CXCodeCompleteResults.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXCodeCompleteResults.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXCodeCompleteResults.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CXCodeCompleteResults.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CXCodeCompleteResults.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXCodeCompleteResults.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXCodeCompleteResults.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXCodeCompleteResults mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXCodeCompleteResults callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXCodeCompleteResults mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXCodeCompleteResults callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXCodeCompleteResults.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXCodeCompleteResults.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXCodeCompleteResults.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXCodeCompleteResults.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CXCodeCompleteResults} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CXCodeCompleteResults malloc(MemoryStack stack) {
        return new CXCodeCompleteResults(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CXCodeCompleteResults} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CXCodeCompleteResults calloc(MemoryStack stack) {
        return new CXCodeCompleteResults(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CXCodeCompleteResults.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXCodeCompleteResults.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXCodeCompleteResults.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXCodeCompleteResults.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Results}. */
    public static CXCompletionResult.Buffer nResults(long struct) { return CXCompletionResult.create(memGetAddress(struct + CXCodeCompleteResults.RESULTS), nNumResults(struct)); }
    /** Unsafe version of {@link #NumResults}. */
    public static int nNumResults(long struct) { return UNSAFE.getInt(null, struct + CXCodeCompleteResults.NUMRESULTS); }

    // -----------------------------------

    /** An array of {@link CXCodeCompleteResults} structs. */
    public static class Buffer extends StructBuffer<CXCodeCompleteResults, Buffer> implements NativeResource {

        private static final CXCodeCompleteResults ELEMENT_FACTORY = CXCodeCompleteResults.create(-1L);

        /**
         * Creates a new {@code CXCodeCompleteResults.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXCodeCompleteResults#SIZEOF}, and its mark will be undefined.</p>
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
        protected CXCodeCompleteResults getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link CXCompletionResult.Buffer} view of the struct array pointed to by the {@link CXCodeCompleteResults#Results} field. */
        @NativeType("CXCompletionResult *")
        public CXCompletionResult.Buffer Results() { return CXCodeCompleteResults.nResults(address()); }
        /** @return the value of the {@link CXCodeCompleteResults#NumResults} field. */
        @NativeType("unsigned")
        public int NumResults() { return CXCodeCompleteResults.nNumResults(address()); }

    }

}
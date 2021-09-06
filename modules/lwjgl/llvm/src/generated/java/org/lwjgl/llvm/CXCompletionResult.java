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
 * A single result of code completion.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CXCompletionResult {
 *     enum CXCursorKind {@link #CursorKind};
 *     CXCompletionString {@link #CompletionString};
 * }</code></pre>
 */
public class CXCompletionResult extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CURSORKIND,
        COMPLETIONSTRING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CURSORKIND = layout.offsetof(0);
        COMPLETIONSTRING = layout.offsetof(1);
    }

    /**
     * Creates a {@code CXCompletionResult} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXCompletionResult(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * the kind of entity that this completion refers to.
     * 
     * <p>The cursor kind will be a macro, keyword, or a declaration (one of the {@code *Decl} cursor kinds), describing the entity that the completion is
     * referring to.</p>
     */
    @NativeType("enum CXCursorKind")
    public int CursorKind() { return nCursorKind(address()); }
    /** the code-completion string that describes how to insert this code-completion result into the editing buffer */
    @NativeType("CXCompletionString")
    public long CompletionString() { return nCompletionString(address()); }

    // -----------------------------------

    /** Returns a new {@code CXCompletionResult} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CXCompletionResult malloc() {
        return wrap(CXCompletionResult.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CXCompletionResult} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CXCompletionResult calloc() {
        return wrap(CXCompletionResult.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CXCompletionResult} instance allocated with {@link BufferUtils}. */
    public static CXCompletionResult create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CXCompletionResult.class, memAddress(container), container);
    }

    /** Returns a new {@code CXCompletionResult} instance for the specified memory address. */
    public static CXCompletionResult create(long address) {
        return wrap(CXCompletionResult.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXCompletionResult createSafe(long address) {
        return address == NULL ? null : wrap(CXCompletionResult.class, address);
    }

    /**
     * Returns a new {@link CXCompletionResult.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXCompletionResult.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CXCompletionResult.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXCompletionResult.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXCompletionResult.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CXCompletionResult.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CXCompletionResult.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXCompletionResult.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXCompletionResult.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXCompletionResult mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXCompletionResult callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXCompletionResult mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXCompletionResult callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXCompletionResult.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXCompletionResult.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXCompletionResult.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXCompletionResult.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CXCompletionResult} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CXCompletionResult malloc(MemoryStack stack) {
        return wrap(CXCompletionResult.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CXCompletionResult} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CXCompletionResult calloc(MemoryStack stack) {
        return wrap(CXCompletionResult.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CXCompletionResult.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXCompletionResult.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXCompletionResult.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXCompletionResult.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #CursorKind}. */
    public static int nCursorKind(long struct) { return UNSAFE.getInt(null, struct + CXCompletionResult.CURSORKIND); }
    /** Unsafe version of {@link #CompletionString}. */
    public static long nCompletionString(long struct) { return memGetAddress(struct + CXCompletionResult.COMPLETIONSTRING); }

    // -----------------------------------

    /** An array of {@link CXCompletionResult} structs. */
    public static class Buffer extends StructBuffer<CXCompletionResult, Buffer> implements NativeResource {

        private static final CXCompletionResult ELEMENT_FACTORY = CXCompletionResult.create(-1L);

        /**
         * Creates a new {@code CXCompletionResult.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXCompletionResult#SIZEOF}, and its mark will be undefined.
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
        protected CXCompletionResult getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link CXCompletionResult#CursorKind} field. */
        @NativeType("enum CXCursorKind")
        public int CursorKind() { return CXCompletionResult.nCursorKind(address()); }
        /** @return the value of the {@link CXCompletionResult#CompletionString} field. */
        @NativeType("CXCompletionString")
        public long CompletionString() { return CXCompletionResult.nCompletionString(address()); }

    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CXCursorAndRangeVisitor {
 *     void * context;
 *     enum CXVisitorResult (*{@link CXCursorAndRangeVisitI visit}) (void *context, CXCursor cursor, CXSourceRange range);
 * }</code></pre>
 */
public class CXCursorAndRangeVisitor extends Struct<CXCursorAndRangeVisitor> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CONTEXT,
        VISIT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CONTEXT = layout.offsetof(0);
        VISIT = layout.offsetof(1);
    }

    protected CXCursorAndRangeVisitor(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CXCursorAndRangeVisitor create(long address, @Nullable ByteBuffer container) {
        return new CXCursorAndRangeVisitor(address, container);
    }

    /**
     * Creates a {@code CXCursorAndRangeVisitor} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXCursorAndRangeVisitor(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code context} field. */
    @NativeType("void *")
    public long context() { return ncontext(address()); }
    /** @return the value of the {@code visit} field. */
    @NativeType("enum CXVisitorResult (*) (void *, CXCursor, CXSourceRange)")
    public CXCursorAndRangeVisit visit() { return nvisit(address()); }

    /** Sets the specified value to the {@code context} field. */
    public CXCursorAndRangeVisitor context(@NativeType("void *") long value) { ncontext(address(), value); return this; }
    /** Sets the specified value to the {@code visit} field. */
    public CXCursorAndRangeVisitor visit(@NativeType("enum CXVisitorResult (*) (void *, CXCursor, CXSourceRange)") CXCursorAndRangeVisitI value) { nvisit(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CXCursorAndRangeVisitor set(
        long context,
        CXCursorAndRangeVisitI visit
    ) {
        context(context);
        visit(visit);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CXCursorAndRangeVisitor set(CXCursorAndRangeVisitor src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CXCursorAndRangeVisitor} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CXCursorAndRangeVisitor malloc() {
        return new CXCursorAndRangeVisitor(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CXCursorAndRangeVisitor} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CXCursorAndRangeVisitor calloc() {
        return new CXCursorAndRangeVisitor(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CXCursorAndRangeVisitor} instance allocated with {@link BufferUtils}. */
    public static CXCursorAndRangeVisitor create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CXCursorAndRangeVisitor(memAddress(container), container);
    }

    /** Returns a new {@code CXCursorAndRangeVisitor} instance for the specified memory address. */
    public static CXCursorAndRangeVisitor create(long address) {
        return new CXCursorAndRangeVisitor(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CXCursorAndRangeVisitor createSafe(long address) {
        return address == NULL ? null : new CXCursorAndRangeVisitor(address, null);
    }

    /**
     * Returns a new {@link CXCursorAndRangeVisitor.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXCursorAndRangeVisitor.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CXCursorAndRangeVisitor.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXCursorAndRangeVisitor.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXCursorAndRangeVisitor.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CXCursorAndRangeVisitor.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CXCursorAndRangeVisitor.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXCursorAndRangeVisitor.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CXCursorAndRangeVisitor.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXCursorAndRangeVisitor mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXCursorAndRangeVisitor callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXCursorAndRangeVisitor mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXCursorAndRangeVisitor callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXCursorAndRangeVisitor.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXCursorAndRangeVisitor.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXCursorAndRangeVisitor.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXCursorAndRangeVisitor.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CXCursorAndRangeVisitor} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CXCursorAndRangeVisitor malloc(MemoryStack stack) {
        return new CXCursorAndRangeVisitor(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CXCursorAndRangeVisitor} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CXCursorAndRangeVisitor calloc(MemoryStack stack) {
        return new CXCursorAndRangeVisitor(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CXCursorAndRangeVisitor.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXCursorAndRangeVisitor.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXCursorAndRangeVisitor.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXCursorAndRangeVisitor.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #context}. */
    public static long ncontext(long struct) { return memGetAddress(struct + CXCursorAndRangeVisitor.CONTEXT); }
    /** Unsafe version of {@link #visit}. */
    public static CXCursorAndRangeVisit nvisit(long struct) { return CXCursorAndRangeVisit.create(memGetAddress(struct + CXCursorAndRangeVisitor.VISIT)); }

    /** Unsafe version of {@link #context(long) context}. */
    public static void ncontext(long struct, long value) { memPutAddress(struct + CXCursorAndRangeVisitor.CONTEXT, check(value)); }
    /** Unsafe version of {@link #visit(CXCursorAndRangeVisitI) visit}. */
    public static void nvisit(long struct, CXCursorAndRangeVisitI value) { memPutAddress(struct + CXCursorAndRangeVisitor.VISIT, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + CXCursorAndRangeVisitor.CONTEXT));
        check(memGetAddress(struct + CXCursorAndRangeVisitor.VISIT));
    }

    // -----------------------------------

    /** An array of {@link CXCursorAndRangeVisitor} structs. */
    public static class Buffer extends StructBuffer<CXCursorAndRangeVisitor, Buffer> implements NativeResource {

        private static final CXCursorAndRangeVisitor ELEMENT_FACTORY = CXCursorAndRangeVisitor.create(-1L);

        /**
         * Creates a new {@code CXCursorAndRangeVisitor.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXCursorAndRangeVisitor#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected CXCursorAndRangeVisitor getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code context} field. */
        @NativeType("void *")
        public long context() { return CXCursorAndRangeVisitor.ncontext(address()); }
        /** @return the value of the {@code visit} field. */
        @NativeType("enum CXVisitorResult (*) (void *, CXCursor, CXSourceRange)")
        public CXCursorAndRangeVisit visit() { return CXCursorAndRangeVisitor.nvisit(address()); }

        /** Sets the specified value to the {@code context} field. */
        public CXCursorAndRangeVisitor.Buffer context(@NativeType("void *") long value) { CXCursorAndRangeVisitor.ncontext(address(), value); return this; }
        /** Sets the specified value to the {@code visit} field. */
        public CXCursorAndRangeVisitor.Buffer visit(@NativeType("enum CXVisitorResult (*) (void *, CXCursor, CXSourceRange)") CXCursorAndRangeVisitI value) { CXCursorAndRangeVisitor.nvisit(address(), value); return this; }

    }

}
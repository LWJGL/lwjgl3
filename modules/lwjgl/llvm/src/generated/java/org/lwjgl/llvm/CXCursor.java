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
 * A cursor representing some element in the abstract syntax tree for a translation unit.
 * 
 * <p>The cursor abstraction unifies the different kinds of entities in a program --declaration, statements, expressions, references to declarations, etc.--
 * under a single "cursor" abstraction with a common set of operations. Common operation for a cursor include: getting the physical location in a source
 * file where the cursor points, getting the name associated with a cursor, and retrieving cursors for any child nodes of a particular cursor.</p>
 * 
 * <p>Cursors can be produced in two specific ways. {@link ClangIndex#clang_getTranslationUnitCursor getTranslationUnitCursor} produces a cursor for a translation unit, from which one can use
 * {@link ClangIndex#clang_visitChildren visitChildren} to explore the rest of the translation unit. {@link ClangIndex#clang_getCursor getCursor} maps from a physical source location to the entity that resides at that
 * location, allowing one to map from the source code into the AST.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CXCursor {
 *     enum CXCursorKind kind;
 *     int xdata;
 *     void const * data[3];
 * }</code></pre>
 */
public class CXCursor extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        KIND,
        XDATA,
        DATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __array(POINTER_SIZE, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        KIND = layout.offsetof(0);
        XDATA = layout.offsetof(1);
        DATA = layout.offsetof(2);
    }

    /**
     * Creates a {@code CXCursor} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXCursor(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code kind} field. */
    @NativeType("enum CXCursorKind")
    public int kind() { return nkind(address()); }
    /** @return the value of the {@code xdata} field. */
    public int xdata() { return nxdata(address()); }
    /** @return a {@link PointerBuffer} view of the {@code data} field. */
    @NativeType("void const *[3]")
    public PointerBuffer data() { return ndata(address()); }
    /** @return the value at the specified index of the {@code data} field. */
    @NativeType("void const *")
    public long data(int index) { return ndata(address(), index); }

    // -----------------------------------

    /** Returns a new {@code CXCursor} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CXCursor malloc() {
        return wrap(CXCursor.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CXCursor} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CXCursor calloc() {
        return wrap(CXCursor.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CXCursor} instance allocated with {@link BufferUtils}. */
    public static CXCursor create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CXCursor.class, memAddress(container), container);
    }

    /** Returns a new {@code CXCursor} instance for the specified memory address. */
    public static CXCursor create(long address) {
        return wrap(CXCursor.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXCursor createSafe(long address) {
        return address == NULL ? null : wrap(CXCursor.class, address);
    }

    /**
     * Returns a new {@link CXCursor.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXCursor.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CXCursor.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXCursor.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXCursor.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CXCursor.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CXCursor.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXCursor.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXCursor.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXCursor mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXCursor callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXCursor mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXCursor callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXCursor.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXCursor.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXCursor.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXCursor.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CXCursor} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CXCursor malloc(MemoryStack stack) {
        return wrap(CXCursor.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CXCursor} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CXCursor calloc(MemoryStack stack) {
        return wrap(CXCursor.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CXCursor.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXCursor.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXCursor.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXCursor.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #kind}. */
    public static int nkind(long struct) { return UNSAFE.getInt(null, struct + CXCursor.KIND); }
    /** Unsafe version of {@link #xdata}. */
    public static int nxdata(long struct) { return UNSAFE.getInt(null, struct + CXCursor.XDATA); }
    /** Unsafe version of {@link #data}. */
    public static PointerBuffer ndata(long struct) { return memPointerBuffer(struct + CXCursor.DATA, 3); }
    /** Unsafe version of {@link #data(int) data}. */
    public static long ndata(long struct, int index) {
        return memGetAddress(struct + CXCursor.DATA + check(index, 3) * POINTER_SIZE);
    }

    // -----------------------------------

    /** An array of {@link CXCursor} structs. */
    public static class Buffer extends StructBuffer<CXCursor, Buffer> implements NativeResource {

        private static final CXCursor ELEMENT_FACTORY = CXCursor.create(-1L);

        /**
         * Creates a new {@code CXCursor.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXCursor#SIZEOF}, and its mark will be undefined.
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
        protected CXCursor getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code kind} field. */
        @NativeType("enum CXCursorKind")
        public int kind() { return CXCursor.nkind(address()); }
        /** @return the value of the {@code xdata} field. */
        public int xdata() { return CXCursor.nxdata(address()); }
        /** @return a {@link PointerBuffer} view of the {@code data} field. */
        @NativeType("void const *[3]")
        public PointerBuffer data() { return CXCursor.ndata(address()); }
        /** @return the value at the specified index of the {@code data} field. */
        @NativeType("void const *")
        public long data(int index) { return CXCursor.ndata(address(), index); }

    }

}
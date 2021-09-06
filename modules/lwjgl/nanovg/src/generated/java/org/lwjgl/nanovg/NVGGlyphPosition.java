/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A glyph position.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct NVGglyphPosition {
 *     char * {@link #str};
 *     float {@link #x};
 *     float {@link #minx};
 *     float {@link #maxx};
 * }</code></pre>
 */
@NativeType("struct NVGglyphPosition")
public class NVGGlyphPosition extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STR,
        X,
        MINX,
        MAXX;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STR = layout.offsetof(0);
        X = layout.offsetof(1);
        MINX = layout.offsetof(2);
        MAXX = layout.offsetof(3);
    }

    /**
     * Creates a {@code NVGGlyphPosition} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NVGGlyphPosition(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** position of the glyph in the input string */
    @NativeType("char *")
    public long str() { return nstr(address()); }
    /** the x-coordinate of the logical glyph position */
    public float x() { return nx(address()); }
    /** the left bound of the glyph shape */
    public float minx() { return nminx(address()); }
    /** the right bound of the glyph shape */
    public float maxx() { return nmaxx(address()); }

    // -----------------------------------

    /** Returns a new {@code NVGGlyphPosition} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NVGGlyphPosition malloc() {
        return wrap(NVGGlyphPosition.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NVGGlyphPosition} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NVGGlyphPosition calloc() {
        return wrap(NVGGlyphPosition.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NVGGlyphPosition} instance allocated with {@link BufferUtils}. */
    public static NVGGlyphPosition create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NVGGlyphPosition.class, memAddress(container), container);
    }

    /** Returns a new {@code NVGGlyphPosition} instance for the specified memory address. */
    public static NVGGlyphPosition create(long address) {
        return wrap(NVGGlyphPosition.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NVGGlyphPosition createSafe(long address) {
        return address == NULL ? null : wrap(NVGGlyphPosition.class, address);
    }

    /**
     * Returns a new {@link NVGGlyphPosition.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NVGGlyphPosition.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NVGGlyphPosition.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NVGGlyphPosition.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NVGGlyphPosition.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NVGGlyphPosition.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NVGGlyphPosition.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NVGGlyphPosition.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NVGGlyphPosition.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NVGGlyphPosition mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NVGGlyphPosition callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NVGGlyphPosition mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NVGGlyphPosition callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NVGGlyphPosition.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NVGGlyphPosition.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NVGGlyphPosition.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NVGGlyphPosition.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code NVGGlyphPosition} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NVGGlyphPosition malloc(MemoryStack stack) {
        return wrap(NVGGlyphPosition.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NVGGlyphPosition} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NVGGlyphPosition calloc(MemoryStack stack) {
        return wrap(NVGGlyphPosition.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NVGGlyphPosition.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NVGGlyphPosition.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NVGGlyphPosition.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NVGGlyphPosition.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #str}. */
    public static long nstr(long struct) { return memGetAddress(struct + NVGGlyphPosition.STR); }
    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return UNSAFE.getFloat(null, struct + NVGGlyphPosition.X); }
    /** Unsafe version of {@link #minx}. */
    public static float nminx(long struct) { return UNSAFE.getFloat(null, struct + NVGGlyphPosition.MINX); }
    /** Unsafe version of {@link #maxx}. */
    public static float nmaxx(long struct) { return UNSAFE.getFloat(null, struct + NVGGlyphPosition.MAXX); }

    // -----------------------------------

    /** An array of {@link NVGGlyphPosition} structs. */
    public static class Buffer extends StructBuffer<NVGGlyphPosition, Buffer> implements NativeResource {

        private static final NVGGlyphPosition ELEMENT_FACTORY = NVGGlyphPosition.create(-1L);

        /**
         * Creates a new {@code NVGGlyphPosition.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NVGGlyphPosition#SIZEOF}, and its mark will be undefined.
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
        protected NVGGlyphPosition getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link NVGGlyphPosition#str} field. */
        @NativeType("char *")
        public long str() { return NVGGlyphPosition.nstr(address()); }
        /** @return the value of the {@link NVGGlyphPosition#x} field. */
        public float x() { return NVGGlyphPosition.nx(address()); }
        /** @return the value of the {@link NVGGlyphPosition#minx} field. */
        public float minx() { return NVGGlyphPosition.nminx(address()); }
        /** @return the value of the {@link NVGGlyphPosition#maxx} field. */
        public float maxx() { return NVGGlyphPosition.nmaxx(address()); }

    }

}
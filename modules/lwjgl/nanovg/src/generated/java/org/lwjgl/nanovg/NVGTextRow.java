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
 * A text row.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code start} &ndash; pointer to the input text where the row starts</li>
 * <li>{@code end} &ndash; pointer to the input text where the row ends (one past the last character</li>
 * <li>{@code next} &ndash; pointer to the beginning of the next row</li>
 * <li>{@code width} &ndash; logical width of the row</li>
 * <li>{@code minx} &ndash; actual left bound of the row. Logical width and bounds can differ because of kerning and some parts over extending.</li>
 * <li>{@code maxx} &ndash; actual right bound of the row. Logical width and bounds can differ because of kerning and some parts over extending.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct NVGtextRow {
 *     char * start;
 *     char * end;
 *     char * next;
 *     float width;
 *     float minx;
 *     float maxx;
 * }</code></pre>
 */
@NativeType("struct NVGtextRow")
public class NVGTextRow extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        START,
        END,
        NEXT,
        WIDTH,
        MINX,
        MAXX;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        START = layout.offsetof(0);
        END = layout.offsetof(1);
        NEXT = layout.offsetof(2);
        WIDTH = layout.offsetof(3);
        MINX = layout.offsetof(4);
        MAXX = layout.offsetof(5);
    }

    /**
     * Creates a {@code NVGTextRow} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NVGTextRow(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code start} field. */
    @NativeType("char *")
    public long start() { return nstart(address()); }
    /** Returns the value of the {@code end} field. */
    @NativeType("char *")
    public long end() { return nend(address()); }
    /** Returns the value of the {@code next} field. */
    @NativeType("char *")
    public long next() { return nnext(address()); }
    /** Returns the value of the {@code width} field. */
    public float width() { return nwidth(address()); }
    /** Returns the value of the {@code minx} field. */
    public float minx() { return nminx(address()); }
    /** Returns the value of the {@code maxx} field. */
    public float maxx() { return nmaxx(address()); }

    // -----------------------------------

    /** Returns a new {@code NVGTextRow} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NVGTextRow malloc() {
        return wrap(NVGTextRow.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NVGTextRow} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NVGTextRow calloc() {
        return wrap(NVGTextRow.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NVGTextRow} instance allocated with {@link BufferUtils}. */
    public static NVGTextRow create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NVGTextRow.class, memAddress(container), container);
    }

    /** Returns a new {@code NVGTextRow} instance for the specified memory address. */
    public static NVGTextRow create(long address) {
        return wrap(NVGTextRow.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NVGTextRow createSafe(long address) {
        return address == NULL ? null : wrap(NVGTextRow.class, address);
    }

    /**
     * Returns a new {@link NVGTextRow.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NVGTextRow.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NVGTextRow.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NVGTextRow.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NVGTextRow.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NVGTextRow.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NVGTextRow.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NVGTextRow.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NVGTextRow.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code NVGTextRow} instance allocated on the thread-local {@link MemoryStack}. */
    public static NVGTextRow mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code NVGTextRow} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NVGTextRow callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code NVGTextRow} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NVGTextRow mallocStack(MemoryStack stack) {
        return wrap(NVGTextRow.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NVGTextRow} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NVGTextRow callocStack(MemoryStack stack) {
        return wrap(NVGTextRow.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NVGTextRow.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NVGTextRow.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NVGTextRow.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NVGTextRow.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NVGTextRow.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NVGTextRow.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NVGTextRow.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NVGTextRow.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #start}. */
    public static long nstart(long struct) { return memGetAddress(struct + NVGTextRow.START); }
    /** Unsafe version of {@link #end}. */
    public static long nend(long struct) { return memGetAddress(struct + NVGTextRow.END); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + NVGTextRow.NEXT); }
    /** Unsafe version of {@link #width}. */
    public static float nwidth(long struct) { return UNSAFE.getFloat(null, struct + NVGTextRow.WIDTH); }
    /** Unsafe version of {@link #minx}. */
    public static float nminx(long struct) { return UNSAFE.getFloat(null, struct + NVGTextRow.MINX); }
    /** Unsafe version of {@link #maxx}. */
    public static float nmaxx(long struct) { return UNSAFE.getFloat(null, struct + NVGTextRow.MAXX); }

    // -----------------------------------

    /** An array of {@link NVGTextRow} structs. */
    public static class Buffer extends StructBuffer<NVGTextRow, Buffer> implements NativeResource {

        private static final NVGTextRow ELEMENT_FACTORY = NVGTextRow.create(-1L);

        /**
         * Creates a new {@code NVGTextRow.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NVGTextRow#SIZEOF}, and its mark will be undefined.
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
        protected NVGTextRow getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code start} field. */
        @NativeType("char *")
        public long start() { return NVGTextRow.nstart(address()); }
        /** Returns the value of the {@code end} field. */
        @NativeType("char *")
        public long end() { return NVGTextRow.nend(address()); }
        /** Returns the value of the {@code next} field. */
        @NativeType("char *")
        public long next() { return NVGTextRow.nnext(address()); }
        /** Returns the value of the {@code width} field. */
        public float width() { return NVGTextRow.nwidth(address()); }
        /** Returns the value of the {@code minx} field. */
        public float minx() { return NVGTextRow.nminx(address()); }
        /** Returns the value of the {@code maxx} field. */
        public float maxx() { return NVGTextRow.nmaxx(address()); }

    }

}
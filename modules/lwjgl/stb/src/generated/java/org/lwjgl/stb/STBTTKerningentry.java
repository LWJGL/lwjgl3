/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct stbtt_kerningentry {
 *     int glyph1;
 *     int glyph2;
 *     int advance;
 * }</code></pre>
 */
@NativeType("struct stbtt_kerningentry")
public class STBTTKerningentry extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        GLYPH1,
        GLYPH2,
        ADVANCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        GLYPH1 = layout.offsetof(0);
        GLYPH2 = layout.offsetof(1);
        ADVANCE = layout.offsetof(2);
    }

    /**
     * Creates a {@code STBTTKerningentry} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public STBTTKerningentry(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code glyph1} field. */
    public int glyph1() { return nglyph1(address()); }
    /** @return the value of the {@code glyph2} field. */
    public int glyph2() { return nglyph2(address()); }
    /** @return the value of the {@code advance} field. */
    public int advance() { return nadvance(address()); }

    // -----------------------------------

    /** Returns a new {@code STBTTKerningentry} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static STBTTKerningentry malloc() {
        return wrap(STBTTKerningentry.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code STBTTKerningentry} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static STBTTKerningentry calloc() {
        return wrap(STBTTKerningentry.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code STBTTKerningentry} instance allocated with {@link BufferUtils}. */
    public static STBTTKerningentry create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(STBTTKerningentry.class, memAddress(container), container);
    }

    /** Returns a new {@code STBTTKerningentry} instance for the specified memory address. */
    public static STBTTKerningentry create(long address) {
        return wrap(STBTTKerningentry.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBTTKerningentry createSafe(long address) {
        return address == NULL ? null : wrap(STBTTKerningentry.class, address);
    }

    /**
     * Returns a new {@link STBTTKerningentry.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBTTKerningentry.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link STBTTKerningentry.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static STBTTKerningentry.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBTTKerningentry.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static STBTTKerningentry.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link STBTTKerningentry.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static STBTTKerningentry.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBTTKerningentry.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code STBTTKerningentry} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static STBTTKerningentry malloc(MemoryStack stack) {
        return wrap(STBTTKerningentry.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code STBTTKerningentry} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static STBTTKerningentry calloc(MemoryStack stack) {
        return wrap(STBTTKerningentry.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link STBTTKerningentry.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBTTKerningentry.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link STBTTKerningentry.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static STBTTKerningentry.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #glyph1}. */
    public static int nglyph1(long struct) { return UNSAFE.getInt(null, struct + STBTTKerningentry.GLYPH1); }
    /** Unsafe version of {@link #glyph2}. */
    public static int nglyph2(long struct) { return UNSAFE.getInt(null, struct + STBTTKerningentry.GLYPH2); }
    /** Unsafe version of {@link #advance}. */
    public static int nadvance(long struct) { return UNSAFE.getInt(null, struct + STBTTKerningentry.ADVANCE); }

    // -----------------------------------

    /** An array of {@link STBTTKerningentry} structs. */
    public static class Buffer extends StructBuffer<STBTTKerningentry, Buffer> implements NativeResource {

        private static final STBTTKerningentry ELEMENT_FACTORY = STBTTKerningentry.create(-1L);

        /**
         * Creates a new {@code STBTTKerningentry.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link STBTTKerningentry#SIZEOF}, and its mark will be undefined.
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
        protected STBTTKerningentry getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code glyph1} field. */
        public int glyph1() { return STBTTKerningentry.nglyph1(address()); }
        /** @return the value of the {@code glyph2} field. */
        public int glyph2() { return STBTTKerningentry.nglyph2(address()); }
        /** @return the value of the {@code advance} field. */
        public int advance() { return STBTTKerningentry.nadvance(address()); }

    }

}
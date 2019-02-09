/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

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
 * struct b3DebugLines {
 *     int m_numDebugLines;
 *     float const * m_linesFrom;
 *     float const * m_linesTo;
 *     float const * m_linesColor;
 * }</code></pre>
 */
@NativeType("struct b3DebugLines")
public class B3DebugLines extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_NUMDEBUGLINES,
        M_LINESFROM,
        M_LINESTO,
        M_LINESCOLOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_NUMDEBUGLINES = layout.offsetof(0);
        M_LINESFROM = layout.offsetof(1);
        M_LINESTO = layout.offsetof(2);
        M_LINESCOLOR = layout.offsetof(3);
    }

    /**
     * Creates a {@code B3DebugLines} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3DebugLines(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_numDebugLines} field. */
    public int m_numDebugLines() { return nm_numDebugLines(address()); }
    /** Returns a {@link FloatBuffer} view of the data pointed to by the {@code m_linesFrom} field. */
    @NativeType("float const *")
    public FloatBuffer m_linesFrom() { return nm_linesFrom(address()); }
    /** Returns a {@link FloatBuffer} view of the data pointed to by the {@code m_linesTo} field. */
    @NativeType("float const *")
    public FloatBuffer m_linesTo() { return nm_linesTo(address()); }
    /** Returns a {@link FloatBuffer} view of the data pointed to by the {@code m_linesColor} field. */
    @NativeType("float const *")
    public FloatBuffer m_linesColor() { return nm_linesColor(address()); }

    /** Sets the specified value to the {@code m_numDebugLines} field. */
    public B3DebugLines m_numDebugLines(int value) { nm_numDebugLines(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code m_linesFrom} field. */
    public B3DebugLines m_linesFrom(@NativeType("float const *") FloatBuffer value) { nm_linesFrom(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code m_linesTo} field. */
    public B3DebugLines m_linesTo(@NativeType("float const *") FloatBuffer value) { nm_linesTo(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code m_linesColor} field. */
    public B3DebugLines m_linesColor(@NativeType("float const *") FloatBuffer value) { nm_linesColor(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public B3DebugLines set(
        int m_numDebugLines,
        FloatBuffer m_linesFrom,
        FloatBuffer m_linesTo,
        FloatBuffer m_linesColor
    ) {
        m_numDebugLines(m_numDebugLines);
        m_linesFrom(m_linesFrom);
        m_linesTo(m_linesTo);
        m_linesColor(m_linesColor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3DebugLines set(B3DebugLines src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3DebugLines} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3DebugLines malloc() {
        return wrap(B3DebugLines.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3DebugLines} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3DebugLines calloc() {
        return wrap(B3DebugLines.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3DebugLines} instance allocated with {@link BufferUtils}. */
    public static B3DebugLines create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3DebugLines.class, memAddress(container), container);
    }

    /** Returns a new {@code B3DebugLines} instance for the specified memory address. */
    public static B3DebugLines create(long address) {
        return wrap(B3DebugLines.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3DebugLines createSafe(long address) {
        return address == NULL ? null : wrap(B3DebugLines.class, address);
    }

    /**
     * Returns a new {@link B3DebugLines.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3DebugLines.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3DebugLines.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3DebugLines.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3DebugLines.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3DebugLines.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3DebugLines.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3DebugLines.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3DebugLines.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3DebugLines} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3DebugLines mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3DebugLines} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3DebugLines callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3DebugLines} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3DebugLines mallocStack(MemoryStack stack) {
        return wrap(B3DebugLines.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3DebugLines} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3DebugLines callocStack(MemoryStack stack) {
        return wrap(B3DebugLines.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3DebugLines.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3DebugLines.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3DebugLines.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3DebugLines.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3DebugLines.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3DebugLines.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3DebugLines.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3DebugLines.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_numDebugLines}. */
    public static int nm_numDebugLines(long struct) { return UNSAFE.getInt(null, struct + B3DebugLines.M_NUMDEBUGLINES); }
    /** Unsafe version of {@link #m_linesFrom() m_linesFrom}. */
    public static FloatBuffer nm_linesFrom(long struct) { return memFloatBuffer(memGetAddress(struct + B3DebugLines.M_LINESFROM), (nm_numDebugLines(struct) / 3)); }
    /** Unsafe version of {@link #m_linesTo() m_linesTo}. */
    public static FloatBuffer nm_linesTo(long struct) { return memFloatBuffer(memGetAddress(struct + B3DebugLines.M_LINESTO), (nm_numDebugLines(struct) / 3)); }
    /** Unsafe version of {@link #m_linesColor() m_linesColor}. */
    public static FloatBuffer nm_linesColor(long struct) { return memFloatBuffer(memGetAddress(struct + B3DebugLines.M_LINESCOLOR), (nm_numDebugLines(struct) / 3)); }

    /** Sets the specified value to the {@code m_numDebugLines} field of the specified {@code struct}. */
    public static void nm_numDebugLines(long struct, int value) { UNSAFE.putInt(null, struct + B3DebugLines.M_NUMDEBUGLINES, value); }
    /** Unsafe version of {@link #m_linesFrom(FloatBuffer) m_linesFrom}. */
    public static void nm_linesFrom(long struct, FloatBuffer value) { memPutAddress(struct + B3DebugLines.M_LINESFROM, memAddress(value)); }
    /** Unsafe version of {@link #m_linesTo(FloatBuffer) m_linesTo}. */
    public static void nm_linesTo(long struct, FloatBuffer value) { memPutAddress(struct + B3DebugLines.M_LINESTO, memAddress(value)); }
    /** Unsafe version of {@link #m_linesColor(FloatBuffer) m_linesColor}. */
    public static void nm_linesColor(long struct, FloatBuffer value) { memPutAddress(struct + B3DebugLines.M_LINESCOLOR, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + B3DebugLines.M_LINESFROM));
        check(memGetAddress(struct + B3DebugLines.M_LINESTO));
        check(memGetAddress(struct + B3DebugLines.M_LINESCOLOR));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link B3DebugLines} structs. */
    public static class Buffer extends StructBuffer<B3DebugLines, Buffer> implements NativeResource {

        private static final B3DebugLines ELEMENT_FACTORY = B3DebugLines.create(-1L);

        /**
         * Creates a new {@code B3DebugLines.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3DebugLines#SIZEOF}, and its mark will be undefined.
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
        protected B3DebugLines getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_numDebugLines} field. */
        public int m_numDebugLines() { return B3DebugLines.nm_numDebugLines(address()); }
        /** Returns a {@link FloatBuffer} view of the data pointed to by the {@code m_linesFrom} field. */
        @NativeType("float const *")
        public FloatBuffer m_linesFrom() { return B3DebugLines.nm_linesFrom(address()); }
        /** Returns a {@link FloatBuffer} view of the data pointed to by the {@code m_linesTo} field. */
        @NativeType("float const *")
        public FloatBuffer m_linesTo() { return B3DebugLines.nm_linesTo(address()); }
        /** Returns a {@link FloatBuffer} view of the data pointed to by the {@code m_linesColor} field. */
        @NativeType("float const *")
        public FloatBuffer m_linesColor() { return B3DebugLines.nm_linesColor(address()); }

        /** Sets the specified value to the {@code m_numDebugLines} field. */
        public B3DebugLines.Buffer m_numDebugLines(int value) { B3DebugLines.nm_numDebugLines(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code m_linesFrom} field. */
        public B3DebugLines.Buffer m_linesFrom(@NativeType("float const *") FloatBuffer value) { B3DebugLines.nm_linesFrom(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code m_linesTo} field. */
        public B3DebugLines.Buffer m_linesTo(@NativeType("float const *") FloatBuffer value) { B3DebugLines.nm_linesTo(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code m_linesColor} field. */
        public B3DebugLines.Buffer m_linesColor(@NativeType("float const *") FloatBuffer value) { B3DebugLines.nm_linesColor(address(), value); return this; }

    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * The structure that holds various text properties of an {@code hb_buffer_t}.
 * 
 * <p>Can be set and retrieved using {@link HarfBuzz#hb_buffer_set_segment_properties buffer_set_segment_properties} and {@link HarfBuzz#hb_buffer_get_segment_properties buffer_get_segment_properties}, respectively.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct hb_segment_properties_t {
 *     hb_direction_t {@link #direction};
 *     hb_script_t {@link #script};
 *     hb_language_t {@link #language};
 *     void * reserved1;
 *     void * reserved2;
 * }</code></pre>
 */
public class hb_segment_properties_t extends Struct<hb_segment_properties_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DIRECTION,
        SCRIPT,
        LANGUAGE,
        RESERVED1,
        RESERVED2;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DIRECTION = layout.offsetof(0);
        SCRIPT = layout.offsetof(1);
        LANGUAGE = layout.offsetof(2);
        RESERVED1 = layout.offsetof(3);
        RESERVED2 = layout.offsetof(4);
    }

    protected hb_segment_properties_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hb_segment_properties_t create(long address, @Nullable ByteBuffer container) {
        return new hb_segment_properties_t(address, container);
    }

    /**
     * Creates a {@code hb_segment_properties_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hb_segment_properties_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code hb_direction_t} of the buffer, see {@link HarfBuzz#hb_buffer_set_direction buffer_set_direction}. */
    @NativeType("hb_direction_t")
    public int direction() { return ndirection(address()); }
    /** the {@code hb_script_t} of the buffer, see {@link HarfBuzz#hb_buffer_set_script buffer_set_script}. */
    @NativeType("hb_script_t")
    public int script() { return nscript(address()); }
    /** the {@code hb_language_t} of the buffer, see {@link HarfBuzz#hb_buffer_set_language buffer_set_language}. */
    @NativeType("hb_language_t")
    public long language() { return nlanguage(address()); }

    /** Sets the specified value to the {@link #direction} field. */
    public hb_segment_properties_t direction(@NativeType("hb_direction_t") int value) { ndirection(address(), value); return this; }
    /** Sets the specified value to the {@link #script} field. */
    public hb_segment_properties_t script(@NativeType("hb_script_t") int value) { nscript(address(), value); return this; }
    /** Sets the specified value to the {@link #language} field. */
    public hb_segment_properties_t language(@NativeType("hb_language_t") long value) { nlanguage(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public hb_segment_properties_t set(
        int direction,
        int script,
        long language
    ) {
        direction(direction);
        script(script);
        language(language);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public hb_segment_properties_t set(hb_segment_properties_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code hb_segment_properties_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hb_segment_properties_t malloc() {
        return new hb_segment_properties_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hb_segment_properties_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hb_segment_properties_t calloc() {
        return new hb_segment_properties_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hb_segment_properties_t} instance allocated with {@link BufferUtils}. */
    public static hb_segment_properties_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hb_segment_properties_t(memAddress(container), container);
    }

    /** Returns a new {@code hb_segment_properties_t} instance for the specified memory address. */
    public static hb_segment_properties_t create(long address) {
        return new hb_segment_properties_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_segment_properties_t createSafe(long address) {
        return address == NULL ? null : new hb_segment_properties_t(address, null);
    }

    /**
     * Returns a new {@link hb_segment_properties_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_segment_properties_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hb_segment_properties_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_segment_properties_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_segment_properties_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hb_segment_properties_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hb_segment_properties_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hb_segment_properties_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_segment_properties_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hb_segment_properties_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_segment_properties_t malloc(MemoryStack stack) {
        return new hb_segment_properties_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hb_segment_properties_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_segment_properties_t calloc(MemoryStack stack) {
        return new hb_segment_properties_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hb_segment_properties_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_segment_properties_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_segment_properties_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_segment_properties_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #direction}. */
    public static int ndirection(long struct) { return UNSAFE.getInt(null, struct + hb_segment_properties_t.DIRECTION); }
    /** Unsafe version of {@link #script}. */
    public static int nscript(long struct) { return UNSAFE.getInt(null, struct + hb_segment_properties_t.SCRIPT); }
    /** Unsafe version of {@link #language}. */
    public static long nlanguage(long struct) { return memGetAddress(struct + hb_segment_properties_t.LANGUAGE); }
    public static long nreserved1(long struct) { return memGetAddress(struct + hb_segment_properties_t.RESERVED1); }
    public static long nreserved2(long struct) { return memGetAddress(struct + hb_segment_properties_t.RESERVED2); }

    /** Unsafe version of {@link #direction(int) direction}. */
    public static void ndirection(long struct, int value) { UNSAFE.putInt(null, struct + hb_segment_properties_t.DIRECTION, value); }
    /** Unsafe version of {@link #script(int) script}. */
    public static void nscript(long struct, int value) { UNSAFE.putInt(null, struct + hb_segment_properties_t.SCRIPT, value); }
    /** Unsafe version of {@link #language(long) language}. */
    public static void nlanguage(long struct, long value) { memPutAddress(struct + hb_segment_properties_t.LANGUAGE, value); }
    public static void nreserved1(long struct, long value) { memPutAddress(struct + hb_segment_properties_t.RESERVED1, value); }
    public static void nreserved2(long struct, long value) { memPutAddress(struct + hb_segment_properties_t.RESERVED2, value); }

    // -----------------------------------

    /** An array of {@link hb_segment_properties_t} structs. */
    public static class Buffer extends StructBuffer<hb_segment_properties_t, Buffer> implements NativeResource {

        private static final hb_segment_properties_t ELEMENT_FACTORY = hb_segment_properties_t.create(-1L);

        /**
         * Creates a new {@code hb_segment_properties_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hb_segment_properties_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected hb_segment_properties_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link hb_segment_properties_t#direction} field. */
        @NativeType("hb_direction_t")
        public int direction() { return hb_segment_properties_t.ndirection(address()); }
        /** @return the value of the {@link hb_segment_properties_t#script} field. */
        @NativeType("hb_script_t")
        public int script() { return hb_segment_properties_t.nscript(address()); }
        /** @return the value of the {@link hb_segment_properties_t#language} field. */
        @NativeType("hb_language_t")
        public long language() { return hb_segment_properties_t.nlanguage(address()); }

        /** Sets the specified value to the {@link hb_segment_properties_t#direction} field. */
        public hb_segment_properties_t.Buffer direction(@NativeType("hb_direction_t") int value) { hb_segment_properties_t.ndirection(address(), value); return this; }
        /** Sets the specified value to the {@link hb_segment_properties_t#script} field. */
        public hb_segment_properties_t.Buffer script(@NativeType("hb_script_t") int value) { hb_segment_properties_t.nscript(address(), value); return this; }
        /** Sets the specified value to the {@link hb_segment_properties_t#language} field. */
        public hb_segment_properties_t.Buffer language(@NativeType("hb_language_t") long value) { hb_segment_properties_t.nlanguage(address(), value); return this; }

    }

}
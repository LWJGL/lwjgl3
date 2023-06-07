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
 * The structure that holds information about the glyphs and their relation to input text.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct hb_glyph_info_t {
 *     hb_codepoint_t {@link #codepoint};
 *     hb_mask_t {@link #mask};
 *     uint32_t {@link #cluster};
 *     {@link hb_var_int_t hb_var_int_t} var1;
 *     {@link hb_var_int_t hb_var_int_t} var2;
 * }</code></pre>
 */
public class hb_glyph_info_t extends Struct<hb_glyph_info_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CODEPOINT,
        MASK,
        CLUSTER,
        VAR1,
        VAR2;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(hb_var_int_t.SIZEOF, hb_var_int_t.ALIGNOF),
            __member(hb_var_int_t.SIZEOF, hb_var_int_t.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CODEPOINT = layout.offsetof(0);
        MASK = layout.offsetof(1);
        CLUSTER = layout.offsetof(2);
        VAR1 = layout.offsetof(3);
        VAR2 = layout.offsetof(4);
    }

    protected hb_glyph_info_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hb_glyph_info_t create(long address, @Nullable ByteBuffer container) {
        return new hb_glyph_info_t(address, container);
    }

    /**
     * Creates a {@code hb_glyph_info_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hb_glyph_info_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** either a Unicode code point (before shaping) or a glyph index (after shaping). */
    @NativeType("hb_codepoint_t")
    public int codepoint() { return ncodepoint(address()); }
    /** private */
    @NativeType("hb_mask_t")
    public int mask() { return nmask(address()); }
    /**
     * the index of the character in the original text that corresponds to this {@code hb_glyph_info_t}, or whatever the client passes to {@link HarfBuzz#hb_buffer_add buffer_add}.
     * 
     * <p>More than one {@code hb_glyph_info_t} can have the same {@code cluster} value, if they resulted from the same character (e.g. one to many glyph
     * substitution), and when more than one character gets merged in the same glyph (e.g. many to one glyph substitution) the {@code hb_glyph_info_t} will
     * have the smallest cluster value of them. By default some characters are merged into the same cluster (e.g. combining marks have the same cluster as
     * their bases) even if they are separate glyphs, {@link HarfBuzz#hb_buffer_set_cluster_level buffer_set_cluster_level} allow selecting more fine-grained cluster handling.</p>
     */
    @NativeType("uint32_t")
    public int cluster() { return ncluster(address()); }

    /** Sets the specified value to the {@link #codepoint} field. */
    public hb_glyph_info_t codepoint(@NativeType("hb_codepoint_t") int value) { ncodepoint(address(), value); return this; }
    /** Sets the specified value to the {@link #mask} field. */
    public hb_glyph_info_t mask(@NativeType("hb_mask_t") int value) { nmask(address(), value); return this; }
    /** Sets the specified value to the {@link #cluster} field. */
    public hb_glyph_info_t cluster(@NativeType("uint32_t") int value) { ncluster(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public hb_glyph_info_t set(
        int codepoint,
        int mask,
        int cluster
    ) {
        codepoint(codepoint);
        mask(mask);
        cluster(cluster);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public hb_glyph_info_t set(hb_glyph_info_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code hb_glyph_info_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hb_glyph_info_t malloc() {
        return new hb_glyph_info_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hb_glyph_info_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hb_glyph_info_t calloc() {
        return new hb_glyph_info_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hb_glyph_info_t} instance allocated with {@link BufferUtils}. */
    public static hb_glyph_info_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hb_glyph_info_t(memAddress(container), container);
    }

    /** Returns a new {@code hb_glyph_info_t} instance for the specified memory address. */
    public static hb_glyph_info_t create(long address) {
        return new hb_glyph_info_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_glyph_info_t createSafe(long address) {
        return address == NULL ? null : new hb_glyph_info_t(address, null);
    }

    /**
     * Returns a new {@link hb_glyph_info_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_glyph_info_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hb_glyph_info_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_glyph_info_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_glyph_info_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hb_glyph_info_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hb_glyph_info_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hb_glyph_info_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_glyph_info_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hb_glyph_info_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_glyph_info_t malloc(MemoryStack stack) {
        return new hb_glyph_info_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hb_glyph_info_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_glyph_info_t calloc(MemoryStack stack) {
        return new hb_glyph_info_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hb_glyph_info_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_glyph_info_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_glyph_info_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_glyph_info_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #codepoint}. */
    public static int ncodepoint(long struct) { return UNSAFE.getInt(null, struct + hb_glyph_info_t.CODEPOINT); }
    /** Unsafe version of {@link #mask}. */
    public static int nmask(long struct) { return UNSAFE.getInt(null, struct + hb_glyph_info_t.MASK); }
    /** Unsafe version of {@link #cluster}. */
    public static int ncluster(long struct) { return UNSAFE.getInt(null, struct + hb_glyph_info_t.CLUSTER); }
    public static hb_var_int_t nvar1(long struct) { return hb_var_int_t.create(struct + hb_glyph_info_t.VAR1); }
    public static hb_var_int_t nvar2(long struct) { return hb_var_int_t.create(struct + hb_glyph_info_t.VAR2); }

    /** Unsafe version of {@link #codepoint(int) codepoint}. */
    public static void ncodepoint(long struct, int value) { UNSAFE.putInt(null, struct + hb_glyph_info_t.CODEPOINT, value); }
    /** Unsafe version of {@link #mask(int) mask}. */
    public static void nmask(long struct, int value) { UNSAFE.putInt(null, struct + hb_glyph_info_t.MASK, value); }
    /** Unsafe version of {@link #cluster(int) cluster}. */
    public static void ncluster(long struct, int value) { UNSAFE.putInt(null, struct + hb_glyph_info_t.CLUSTER, value); }
    public static void nvar1(long struct, hb_var_int_t value) { memCopy(value.address(), struct + hb_glyph_info_t.VAR1, hb_var_int_t.SIZEOF); }
    public static void nvar2(long struct, hb_var_int_t value) { memCopy(value.address(), struct + hb_glyph_info_t.VAR2, hb_var_int_t.SIZEOF); }

    // -----------------------------------

    /** An array of {@link hb_glyph_info_t} structs. */
    public static class Buffer extends StructBuffer<hb_glyph_info_t, Buffer> implements NativeResource {

        private static final hb_glyph_info_t ELEMENT_FACTORY = hb_glyph_info_t.create(-1L);

        /**
         * Creates a new {@code hb_glyph_info_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hb_glyph_info_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected hb_glyph_info_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link hb_glyph_info_t#codepoint} field. */
        @NativeType("hb_codepoint_t")
        public int codepoint() { return hb_glyph_info_t.ncodepoint(address()); }
        /** @return the value of the {@link hb_glyph_info_t#mask} field. */
        @NativeType("hb_mask_t")
        public int mask() { return hb_glyph_info_t.nmask(address()); }
        /** @return the value of the {@link hb_glyph_info_t#cluster} field. */
        @NativeType("uint32_t")
        public int cluster() { return hb_glyph_info_t.ncluster(address()); }

        /** Sets the specified value to the {@link hb_glyph_info_t#codepoint} field. */
        public hb_glyph_info_t.Buffer codepoint(@NativeType("hb_codepoint_t") int value) { hb_glyph_info_t.ncodepoint(address(), value); return this; }
        /** Sets the specified value to the {@link hb_glyph_info_t#mask} field. */
        public hb_glyph_info_t.Buffer mask(@NativeType("hb_mask_t") int value) { hb_glyph_info_t.nmask(address(), value); return this; }
        /** Sets the specified value to the {@link hb_glyph_info_t#cluster} field. */
        public hb_glyph_info_t.Buffer cluster(@NativeType("uint32_t") int value) { hb_glyph_info_t.ncluster(address(), value); return this; }

    }

}
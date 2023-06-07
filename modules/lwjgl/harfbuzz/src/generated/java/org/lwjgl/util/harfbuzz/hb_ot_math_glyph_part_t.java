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
 * Data type to hold information for a "part" component of a math-variant glyph.
 * 
 * <p>Large variants for stretchable math glyphs (such as parentheses) can be constructed on the fly from parts.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct hb_ot_math_glyph_part_t {
 *     hb_codepoint_t {@link #glyph};
 *     hb_position_t {@link #start_connector_length};
 *     hb_position_t {@link #end_connector_length};
 *     hb_position_t {@link #full_advance};
 *     hb_ot_math_glyph_part_flags_t {@link #flags};
 * }</code></pre>
 */
public class hb_ot_math_glyph_part_t extends Struct<hb_ot_math_glyph_part_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        GLYPH,
        START_CONNECTOR_LENGTH,
        END_CONNECTOR_LENGTH,
        FULL_ADVANCE,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        GLYPH = layout.offsetof(0);
        START_CONNECTOR_LENGTH = layout.offsetof(1);
        END_CONNECTOR_LENGTH = layout.offsetof(2);
        FULL_ADVANCE = layout.offsetof(3);
        FLAGS = layout.offsetof(4);
    }

    protected hb_ot_math_glyph_part_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hb_ot_math_glyph_part_t create(long address, @Nullable ByteBuffer container) {
        return new hb_ot_math_glyph_part_t(address, container);
    }

    /**
     * Creates a {@code hb_ot_math_glyph_part_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hb_ot_math_glyph_part_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the glyph index of the variant part */
    @NativeType("hb_codepoint_t")
    public int glyph() { return nglyph(address()); }
    /** the length of the connector on the starting side of the variant part */
    @NativeType("hb_position_t")
    public int start_connector_length() { return nstart_connector_length(address()); }
    /** the length of the connector on the ending side of the variant part */
    @NativeType("hb_position_t")
    public int end_connector_length() { return nend_connector_length(address()); }
    /** the total advance of the part */
    @NativeType("hb_position_t")
    public int full_advance() { return nfull_advance(address()); }
    /** flags for the part */
    @NativeType("hb_ot_math_glyph_part_flags_t")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #glyph} field. */
    public hb_ot_math_glyph_part_t glyph(@NativeType("hb_codepoint_t") int value) { nglyph(address(), value); return this; }
    /** Sets the specified value to the {@link #start_connector_length} field. */
    public hb_ot_math_glyph_part_t start_connector_length(@NativeType("hb_position_t") int value) { nstart_connector_length(address(), value); return this; }
    /** Sets the specified value to the {@link #end_connector_length} field. */
    public hb_ot_math_glyph_part_t end_connector_length(@NativeType("hb_position_t") int value) { nend_connector_length(address(), value); return this; }
    /** Sets the specified value to the {@link #full_advance} field. */
    public hb_ot_math_glyph_part_t full_advance(@NativeType("hb_position_t") int value) { nfull_advance(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public hb_ot_math_glyph_part_t flags(@NativeType("hb_ot_math_glyph_part_flags_t") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public hb_ot_math_glyph_part_t set(
        int glyph,
        int start_connector_length,
        int end_connector_length,
        int full_advance,
        int flags
    ) {
        glyph(glyph);
        start_connector_length(start_connector_length);
        end_connector_length(end_connector_length);
        full_advance(full_advance);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public hb_ot_math_glyph_part_t set(hb_ot_math_glyph_part_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code hb_ot_math_glyph_part_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hb_ot_math_glyph_part_t malloc() {
        return new hb_ot_math_glyph_part_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hb_ot_math_glyph_part_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hb_ot_math_glyph_part_t calloc() {
        return new hb_ot_math_glyph_part_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hb_ot_math_glyph_part_t} instance allocated with {@link BufferUtils}. */
    public static hb_ot_math_glyph_part_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hb_ot_math_glyph_part_t(memAddress(container), container);
    }

    /** Returns a new {@code hb_ot_math_glyph_part_t} instance for the specified memory address. */
    public static hb_ot_math_glyph_part_t create(long address) {
        return new hb_ot_math_glyph_part_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_ot_math_glyph_part_t createSafe(long address) {
        return address == NULL ? null : new hb_ot_math_glyph_part_t(address, null);
    }

    /**
     * Returns a new {@link hb_ot_math_glyph_part_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_ot_math_glyph_part_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hb_ot_math_glyph_part_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_ot_math_glyph_part_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_ot_math_glyph_part_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hb_ot_math_glyph_part_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hb_ot_math_glyph_part_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hb_ot_math_glyph_part_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_ot_math_glyph_part_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hb_ot_math_glyph_part_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_ot_math_glyph_part_t malloc(MemoryStack stack) {
        return new hb_ot_math_glyph_part_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hb_ot_math_glyph_part_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_ot_math_glyph_part_t calloc(MemoryStack stack) {
        return new hb_ot_math_glyph_part_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hb_ot_math_glyph_part_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_ot_math_glyph_part_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_ot_math_glyph_part_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_ot_math_glyph_part_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #glyph}. */
    public static int nglyph(long struct) { return UNSAFE.getInt(null, struct + hb_ot_math_glyph_part_t.GLYPH); }
    /** Unsafe version of {@link #start_connector_length}. */
    public static int nstart_connector_length(long struct) { return UNSAFE.getInt(null, struct + hb_ot_math_glyph_part_t.START_CONNECTOR_LENGTH); }
    /** Unsafe version of {@link #end_connector_length}. */
    public static int nend_connector_length(long struct) { return UNSAFE.getInt(null, struct + hb_ot_math_glyph_part_t.END_CONNECTOR_LENGTH); }
    /** Unsafe version of {@link #full_advance}. */
    public static int nfull_advance(long struct) { return UNSAFE.getInt(null, struct + hb_ot_math_glyph_part_t.FULL_ADVANCE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + hb_ot_math_glyph_part_t.FLAGS); }

    /** Unsafe version of {@link #glyph(int) glyph}. */
    public static void nglyph(long struct, int value) { UNSAFE.putInt(null, struct + hb_ot_math_glyph_part_t.GLYPH, value); }
    /** Unsafe version of {@link #start_connector_length(int) start_connector_length}. */
    public static void nstart_connector_length(long struct, int value) { UNSAFE.putInt(null, struct + hb_ot_math_glyph_part_t.START_CONNECTOR_LENGTH, value); }
    /** Unsafe version of {@link #end_connector_length(int) end_connector_length}. */
    public static void nend_connector_length(long struct, int value) { UNSAFE.putInt(null, struct + hb_ot_math_glyph_part_t.END_CONNECTOR_LENGTH, value); }
    /** Unsafe version of {@link #full_advance(int) full_advance}. */
    public static void nfull_advance(long struct, int value) { UNSAFE.putInt(null, struct + hb_ot_math_glyph_part_t.FULL_ADVANCE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + hb_ot_math_glyph_part_t.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link hb_ot_math_glyph_part_t} structs. */
    public static class Buffer extends StructBuffer<hb_ot_math_glyph_part_t, Buffer> implements NativeResource {

        private static final hb_ot_math_glyph_part_t ELEMENT_FACTORY = hb_ot_math_glyph_part_t.create(-1L);

        /**
         * Creates a new {@code hb_ot_math_glyph_part_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hb_ot_math_glyph_part_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected hb_ot_math_glyph_part_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link hb_ot_math_glyph_part_t#glyph} field. */
        @NativeType("hb_codepoint_t")
        public int glyph() { return hb_ot_math_glyph_part_t.nglyph(address()); }
        /** @return the value of the {@link hb_ot_math_glyph_part_t#start_connector_length} field. */
        @NativeType("hb_position_t")
        public int start_connector_length() { return hb_ot_math_glyph_part_t.nstart_connector_length(address()); }
        /** @return the value of the {@link hb_ot_math_glyph_part_t#end_connector_length} field. */
        @NativeType("hb_position_t")
        public int end_connector_length() { return hb_ot_math_glyph_part_t.nend_connector_length(address()); }
        /** @return the value of the {@link hb_ot_math_glyph_part_t#full_advance} field. */
        @NativeType("hb_position_t")
        public int full_advance() { return hb_ot_math_glyph_part_t.nfull_advance(address()); }
        /** @return the value of the {@link hb_ot_math_glyph_part_t#flags} field. */
        @NativeType("hb_ot_math_glyph_part_flags_t")
        public int flags() { return hb_ot_math_glyph_part_t.nflags(address()); }

        /** Sets the specified value to the {@link hb_ot_math_glyph_part_t#glyph} field. */
        public hb_ot_math_glyph_part_t.Buffer glyph(@NativeType("hb_codepoint_t") int value) { hb_ot_math_glyph_part_t.nglyph(address(), value); return this; }
        /** Sets the specified value to the {@link hb_ot_math_glyph_part_t#start_connector_length} field. */
        public hb_ot_math_glyph_part_t.Buffer start_connector_length(@NativeType("hb_position_t") int value) { hb_ot_math_glyph_part_t.nstart_connector_length(address(), value); return this; }
        /** Sets the specified value to the {@link hb_ot_math_glyph_part_t#end_connector_length} field. */
        public hb_ot_math_glyph_part_t.Buffer end_connector_length(@NativeType("hb_position_t") int value) { hb_ot_math_glyph_part_t.nend_connector_length(address(), value); return this; }
        /** Sets the specified value to the {@link hb_ot_math_glyph_part_t#full_advance} field. */
        public hb_ot_math_glyph_part_t.Buffer full_advance(@NativeType("hb_position_t") int value) { hb_ot_math_glyph_part_t.nfull_advance(address(), value); return this; }
        /** Sets the specified value to the {@link hb_ot_math_glyph_part_t#flags} field. */
        public hb_ot_math_glyph_part_t.Buffer flags(@NativeType("hb_ot_math_glyph_part_flags_t") int value) { hb_ot_math_glyph_part_t.nflags(address(), value); return this; }

    }

}
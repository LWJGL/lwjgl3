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
 * Data type for holding variation-axis values.
 * 
 * <p>The minimum, default, and maximum values are in un-normalized, user scales.</p>
 * 
 * <p>Note: at present, the only flag defined for flags is {@link OpenType#HB_OT_VAR_AXIS_FLAG_HIDDEN VAR_AXIS_FLAG_HIDDEN}.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct hb_ot_var_axis_info_t {
 *     unsigned int {@link #axis_index};
 *     hb_tag_t {@link #tag};
 *     hb_ot_name_id_t {@link #name_id};
 *     hb_ot_var_axis_flags_t {@link #flags};
 *     float {@link #min_value};
 *     float {@link #default_value};
 *     float {@link #max_value};
 *     unsigned int reserved;
 * }</code></pre>
 */
public class hb_ot_var_axis_info_t extends Struct<hb_ot_var_axis_info_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        AXIS_INDEX,
        TAG,
        NAME_ID,
        FLAGS,
        MIN_VALUE,
        DEFAULT_VALUE,
        MAX_VALUE,
        RESERVED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        AXIS_INDEX = layout.offsetof(0);
        TAG = layout.offsetof(1);
        NAME_ID = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        MIN_VALUE = layout.offsetof(4);
        DEFAULT_VALUE = layout.offsetof(5);
        MAX_VALUE = layout.offsetof(6);
        RESERVED = layout.offsetof(7);
    }

    protected hb_ot_var_axis_info_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hb_ot_var_axis_info_t create(long address, @Nullable ByteBuffer container) {
        return new hb_ot_var_axis_info_t(address, container);
    }

    /**
     * Creates a {@code hb_ot_var_axis_info_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hb_ot_var_axis_info_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** index of the axis in the variation-axis array */
    @NativeType("unsigned int")
    public int axis_index() { return naxis_index(address()); }
    /** the {@code hb_tag_t} tag identifying the design variation of the axis */
    @NativeType("hb_tag_t")
    public int tag() { return ntag(address()); }
    /** the {@code name} table Name ID that provides display names for the axis */
    @NativeType("hb_ot_name_id_t")
    public int name_id() { return nname_id(address()); }
    /** the {@code hb_ot_var_axis_flags_t} flags for the axis */
    @NativeType("hb_ot_var_axis_flags_t")
    public int flags() { return nflags(address()); }
    /** the minimum value on the variation axis that the font covers */
    public float min_value() { return nmin_value(address()); }
    /** the position on the variation axis corresponding to the font's defaults */
    public float default_value() { return ndefault_value(address()); }
    /** the maximum value on the variation axis that the font covers */
    public float max_value() { return nmax_value(address()); }

    /** Sets the specified value to the {@link #axis_index} field. */
    public hb_ot_var_axis_info_t axis_index(@NativeType("unsigned int") int value) { naxis_index(address(), value); return this; }
    /** Sets the specified value to the {@link #tag} field. */
    public hb_ot_var_axis_info_t tag(@NativeType("hb_tag_t") int value) { ntag(address(), value); return this; }
    /** Sets the specified value to the {@link #name_id} field. */
    public hb_ot_var_axis_info_t name_id(@NativeType("hb_ot_name_id_t") int value) { nname_id(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public hb_ot_var_axis_info_t flags(@NativeType("hb_ot_var_axis_flags_t") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #min_value} field. */
    public hb_ot_var_axis_info_t min_value(float value) { nmin_value(address(), value); return this; }
    /** Sets the specified value to the {@link #default_value} field. */
    public hb_ot_var_axis_info_t default_value(float value) { ndefault_value(address(), value); return this; }
    /** Sets the specified value to the {@link #max_value} field. */
    public hb_ot_var_axis_info_t max_value(float value) { nmax_value(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public hb_ot_var_axis_info_t set(
        int axis_index,
        int tag,
        int name_id,
        int flags,
        float min_value,
        float default_value,
        float max_value
    ) {
        axis_index(axis_index);
        tag(tag);
        name_id(name_id);
        flags(flags);
        min_value(min_value);
        default_value(default_value);
        max_value(max_value);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public hb_ot_var_axis_info_t set(hb_ot_var_axis_info_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code hb_ot_var_axis_info_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hb_ot_var_axis_info_t malloc() {
        return new hb_ot_var_axis_info_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hb_ot_var_axis_info_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hb_ot_var_axis_info_t calloc() {
        return new hb_ot_var_axis_info_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hb_ot_var_axis_info_t} instance allocated with {@link BufferUtils}. */
    public static hb_ot_var_axis_info_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hb_ot_var_axis_info_t(memAddress(container), container);
    }

    /** Returns a new {@code hb_ot_var_axis_info_t} instance for the specified memory address. */
    public static hb_ot_var_axis_info_t create(long address) {
        return new hb_ot_var_axis_info_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_ot_var_axis_info_t createSafe(long address) {
        return address == NULL ? null : new hb_ot_var_axis_info_t(address, null);
    }

    /**
     * Returns a new {@link hb_ot_var_axis_info_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_ot_var_axis_info_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hb_ot_var_axis_info_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_ot_var_axis_info_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_ot_var_axis_info_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hb_ot_var_axis_info_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hb_ot_var_axis_info_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hb_ot_var_axis_info_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_ot_var_axis_info_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hb_ot_var_axis_info_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_ot_var_axis_info_t malloc(MemoryStack stack) {
        return new hb_ot_var_axis_info_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hb_ot_var_axis_info_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_ot_var_axis_info_t calloc(MemoryStack stack) {
        return new hb_ot_var_axis_info_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hb_ot_var_axis_info_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_ot_var_axis_info_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_ot_var_axis_info_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_ot_var_axis_info_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #axis_index}. */
    public static int naxis_index(long struct) { return UNSAFE.getInt(null, struct + hb_ot_var_axis_info_t.AXIS_INDEX); }
    /** Unsafe version of {@link #tag}. */
    public static int ntag(long struct) { return UNSAFE.getInt(null, struct + hb_ot_var_axis_info_t.TAG); }
    /** Unsafe version of {@link #name_id}. */
    public static int nname_id(long struct) { return UNSAFE.getInt(null, struct + hb_ot_var_axis_info_t.NAME_ID); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + hb_ot_var_axis_info_t.FLAGS); }
    /** Unsafe version of {@link #min_value}. */
    public static float nmin_value(long struct) { return UNSAFE.getFloat(null, struct + hb_ot_var_axis_info_t.MIN_VALUE); }
    /** Unsafe version of {@link #default_value}. */
    public static float ndefault_value(long struct) { return UNSAFE.getFloat(null, struct + hb_ot_var_axis_info_t.DEFAULT_VALUE); }
    /** Unsafe version of {@link #max_value}. */
    public static float nmax_value(long struct) { return UNSAFE.getFloat(null, struct + hb_ot_var_axis_info_t.MAX_VALUE); }
    public static int nreserved(long struct) { return UNSAFE.getInt(null, struct + hb_ot_var_axis_info_t.RESERVED); }

    /** Unsafe version of {@link #axis_index(int) axis_index}. */
    public static void naxis_index(long struct, int value) { UNSAFE.putInt(null, struct + hb_ot_var_axis_info_t.AXIS_INDEX, value); }
    /** Unsafe version of {@link #tag(int) tag}. */
    public static void ntag(long struct, int value) { UNSAFE.putInt(null, struct + hb_ot_var_axis_info_t.TAG, value); }
    /** Unsafe version of {@link #name_id(int) name_id}. */
    public static void nname_id(long struct, int value) { UNSAFE.putInt(null, struct + hb_ot_var_axis_info_t.NAME_ID, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + hb_ot_var_axis_info_t.FLAGS, value); }
    /** Unsafe version of {@link #min_value(float) min_value}. */
    public static void nmin_value(long struct, float value) { UNSAFE.putFloat(null, struct + hb_ot_var_axis_info_t.MIN_VALUE, value); }
    /** Unsafe version of {@link #default_value(float) default_value}. */
    public static void ndefault_value(long struct, float value) { UNSAFE.putFloat(null, struct + hb_ot_var_axis_info_t.DEFAULT_VALUE, value); }
    /** Unsafe version of {@link #max_value(float) max_value}. */
    public static void nmax_value(long struct, float value) { UNSAFE.putFloat(null, struct + hb_ot_var_axis_info_t.MAX_VALUE, value); }
    public static void nreserved(long struct, int value) { UNSAFE.putInt(null, struct + hb_ot_var_axis_info_t.RESERVED, value); }

    // -----------------------------------

    /** An array of {@link hb_ot_var_axis_info_t} structs. */
    public static class Buffer extends StructBuffer<hb_ot_var_axis_info_t, Buffer> implements NativeResource {

        private static final hb_ot_var_axis_info_t ELEMENT_FACTORY = hb_ot_var_axis_info_t.create(-1L);

        /**
         * Creates a new {@code hb_ot_var_axis_info_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hb_ot_var_axis_info_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected hb_ot_var_axis_info_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link hb_ot_var_axis_info_t#axis_index} field. */
        @NativeType("unsigned int")
        public int axis_index() { return hb_ot_var_axis_info_t.naxis_index(address()); }
        /** @return the value of the {@link hb_ot_var_axis_info_t#tag} field. */
        @NativeType("hb_tag_t")
        public int tag() { return hb_ot_var_axis_info_t.ntag(address()); }
        /** @return the value of the {@link hb_ot_var_axis_info_t#name_id} field. */
        @NativeType("hb_ot_name_id_t")
        public int name_id() { return hb_ot_var_axis_info_t.nname_id(address()); }
        /** @return the value of the {@link hb_ot_var_axis_info_t#flags} field. */
        @NativeType("hb_ot_var_axis_flags_t")
        public int flags() { return hb_ot_var_axis_info_t.nflags(address()); }
        /** @return the value of the {@link hb_ot_var_axis_info_t#min_value} field. */
        public float min_value() { return hb_ot_var_axis_info_t.nmin_value(address()); }
        /** @return the value of the {@link hb_ot_var_axis_info_t#default_value} field. */
        public float default_value() { return hb_ot_var_axis_info_t.ndefault_value(address()); }
        /** @return the value of the {@link hb_ot_var_axis_info_t#max_value} field. */
        public float max_value() { return hb_ot_var_axis_info_t.nmax_value(address()); }

        /** Sets the specified value to the {@link hb_ot_var_axis_info_t#axis_index} field. */
        public hb_ot_var_axis_info_t.Buffer axis_index(@NativeType("unsigned int") int value) { hb_ot_var_axis_info_t.naxis_index(address(), value); return this; }
        /** Sets the specified value to the {@link hb_ot_var_axis_info_t#tag} field. */
        public hb_ot_var_axis_info_t.Buffer tag(@NativeType("hb_tag_t") int value) { hb_ot_var_axis_info_t.ntag(address(), value); return this; }
        /** Sets the specified value to the {@link hb_ot_var_axis_info_t#name_id} field. */
        public hb_ot_var_axis_info_t.Buffer name_id(@NativeType("hb_ot_name_id_t") int value) { hb_ot_var_axis_info_t.nname_id(address(), value); return this; }
        /** Sets the specified value to the {@link hb_ot_var_axis_info_t#flags} field. */
        public hb_ot_var_axis_info_t.Buffer flags(@NativeType("hb_ot_var_axis_flags_t") int value) { hb_ot_var_axis_info_t.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link hb_ot_var_axis_info_t#min_value} field. */
        public hb_ot_var_axis_info_t.Buffer min_value(float value) { hb_ot_var_axis_info_t.nmin_value(address(), value); return this; }
        /** Sets the specified value to the {@link hb_ot_var_axis_info_t#default_value} field. */
        public hb_ot_var_axis_info_t.Buffer default_value(float value) { hb_ot_var_axis_info_t.ndefault_value(address(), value); return this; }
        /** Sets the specified value to the {@link hb_ot_var_axis_info_t#max_value} field. */
        public hb_ot_var_axis_info_t.Buffer max_value(float value) { hb_ot_var_axis_info_t.nmax_value(address(), value); return this; }

    }

}
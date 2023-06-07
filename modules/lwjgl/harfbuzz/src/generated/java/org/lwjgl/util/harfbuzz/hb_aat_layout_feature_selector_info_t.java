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
 * Structure representing a setting for an {@code hb_aat_layout_feature_type_t}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct hb_aat_layout_feature_selector_info_t {
 *     hb_ot_name_id_t {@link #name_id};
 *     hb_aat_layout_feature_selector_t {@link #enable};
 *     hb_aat_layout_feature_selector_t {@link #disable};
 *     unsigned int reserved;
 * }</code></pre>
 */
public class hb_aat_layout_feature_selector_info_t extends Struct<hb_aat_layout_feature_selector_info_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME_ID,
        ENABLE,
        DISABLE,
        RESERVED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME_ID = layout.offsetof(0);
        ENABLE = layout.offsetof(1);
        DISABLE = layout.offsetof(2);
        RESERVED = layout.offsetof(3);
    }

    protected hb_aat_layout_feature_selector_info_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hb_aat_layout_feature_selector_info_t create(long address, @Nullable ByteBuffer container) {
        return new hb_aat_layout_feature_selector_info_t(address, container);
    }

    /**
     * Creates a {@code hb_aat_layout_feature_selector_info_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hb_aat_layout_feature_selector_info_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the selector's name identifier */
    @NativeType("hb_ot_name_id_t")
    public int name_id() { return nname_id(address()); }
    /** the value to turn the selector on disable */
    @NativeType("hb_aat_layout_feature_selector_t")
    public int enable() { return nenable(address()); }
    /** the value to turn the selector off */
    @NativeType("hb_aat_layout_feature_selector_t")
    public int disable() { return ndisable(address()); }

    /** Sets the specified value to the {@link #name_id} field. */
    public hb_aat_layout_feature_selector_info_t name_id(@NativeType("hb_ot_name_id_t") int value) { nname_id(address(), value); return this; }
    /** Sets the specified value to the {@link #enable} field. */
    public hb_aat_layout_feature_selector_info_t enable(@NativeType("hb_aat_layout_feature_selector_t") int value) { nenable(address(), value); return this; }
    /** Sets the specified value to the {@link #disable} field. */
    public hb_aat_layout_feature_selector_info_t disable(@NativeType("hb_aat_layout_feature_selector_t") int value) { ndisable(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public hb_aat_layout_feature_selector_info_t set(
        int name_id,
        int enable,
        int disable
    ) {
        name_id(name_id);
        enable(enable);
        disable(disable);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public hb_aat_layout_feature_selector_info_t set(hb_aat_layout_feature_selector_info_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code hb_aat_layout_feature_selector_info_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hb_aat_layout_feature_selector_info_t malloc() {
        return new hb_aat_layout_feature_selector_info_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hb_aat_layout_feature_selector_info_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hb_aat_layout_feature_selector_info_t calloc() {
        return new hb_aat_layout_feature_selector_info_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hb_aat_layout_feature_selector_info_t} instance allocated with {@link BufferUtils}. */
    public static hb_aat_layout_feature_selector_info_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hb_aat_layout_feature_selector_info_t(memAddress(container), container);
    }

    /** Returns a new {@code hb_aat_layout_feature_selector_info_t} instance for the specified memory address. */
    public static hb_aat_layout_feature_selector_info_t create(long address) {
        return new hb_aat_layout_feature_selector_info_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_aat_layout_feature_selector_info_t createSafe(long address) {
        return address == NULL ? null : new hb_aat_layout_feature_selector_info_t(address, null);
    }

    /**
     * Returns a new {@link hb_aat_layout_feature_selector_info_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_aat_layout_feature_selector_info_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hb_aat_layout_feature_selector_info_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_aat_layout_feature_selector_info_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_aat_layout_feature_selector_info_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hb_aat_layout_feature_selector_info_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hb_aat_layout_feature_selector_info_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hb_aat_layout_feature_selector_info_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_aat_layout_feature_selector_info_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hb_aat_layout_feature_selector_info_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_aat_layout_feature_selector_info_t malloc(MemoryStack stack) {
        return new hb_aat_layout_feature_selector_info_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hb_aat_layout_feature_selector_info_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_aat_layout_feature_selector_info_t calloc(MemoryStack stack) {
        return new hb_aat_layout_feature_selector_info_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hb_aat_layout_feature_selector_info_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_aat_layout_feature_selector_info_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_aat_layout_feature_selector_info_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_aat_layout_feature_selector_info_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name_id}. */
    public static int nname_id(long struct) { return UNSAFE.getInt(null, struct + hb_aat_layout_feature_selector_info_t.NAME_ID); }
    /** Unsafe version of {@link #enable}. */
    public static int nenable(long struct) { return UNSAFE.getInt(null, struct + hb_aat_layout_feature_selector_info_t.ENABLE); }
    /** Unsafe version of {@link #disable}. */
    public static int ndisable(long struct) { return UNSAFE.getInt(null, struct + hb_aat_layout_feature_selector_info_t.DISABLE); }
    public static int nreserved(long struct) { return UNSAFE.getInt(null, struct + hb_aat_layout_feature_selector_info_t.RESERVED); }

    /** Unsafe version of {@link #name_id(int) name_id}. */
    public static void nname_id(long struct, int value) { UNSAFE.putInt(null, struct + hb_aat_layout_feature_selector_info_t.NAME_ID, value); }
    /** Unsafe version of {@link #enable(int) enable}. */
    public static void nenable(long struct, int value) { UNSAFE.putInt(null, struct + hb_aat_layout_feature_selector_info_t.ENABLE, value); }
    /** Unsafe version of {@link #disable(int) disable}. */
    public static void ndisable(long struct, int value) { UNSAFE.putInt(null, struct + hb_aat_layout_feature_selector_info_t.DISABLE, value); }
    public static void nreserved(long struct, int value) { UNSAFE.putInt(null, struct + hb_aat_layout_feature_selector_info_t.RESERVED, value); }

    // -----------------------------------

    /** An array of {@link hb_aat_layout_feature_selector_info_t} structs. */
    public static class Buffer extends StructBuffer<hb_aat_layout_feature_selector_info_t, Buffer> implements NativeResource {

        private static final hb_aat_layout_feature_selector_info_t ELEMENT_FACTORY = hb_aat_layout_feature_selector_info_t.create(-1L);

        /**
         * Creates a new {@code hb_aat_layout_feature_selector_info_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hb_aat_layout_feature_selector_info_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected hb_aat_layout_feature_selector_info_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link hb_aat_layout_feature_selector_info_t#name_id} field. */
        @NativeType("hb_ot_name_id_t")
        public int name_id() { return hb_aat_layout_feature_selector_info_t.nname_id(address()); }
        /** @return the value of the {@link hb_aat_layout_feature_selector_info_t#enable} field. */
        @NativeType("hb_aat_layout_feature_selector_t")
        public int enable() { return hb_aat_layout_feature_selector_info_t.nenable(address()); }
        /** @return the value of the {@link hb_aat_layout_feature_selector_info_t#disable} field. */
        @NativeType("hb_aat_layout_feature_selector_t")
        public int disable() { return hb_aat_layout_feature_selector_info_t.ndisable(address()); }

        /** Sets the specified value to the {@link hb_aat_layout_feature_selector_info_t#name_id} field. */
        public hb_aat_layout_feature_selector_info_t.Buffer name_id(@NativeType("hb_ot_name_id_t") int value) { hb_aat_layout_feature_selector_info_t.nname_id(address(), value); return this; }
        /** Sets the specified value to the {@link hb_aat_layout_feature_selector_info_t#enable} field. */
        public hb_aat_layout_feature_selector_info_t.Buffer enable(@NativeType("hb_aat_layout_feature_selector_t") int value) { hb_aat_layout_feature_selector_info_t.nenable(address(), value); return this; }
        /** Sets the specified value to the {@link hb_aat_layout_feature_selector_info_t#disable} field. */
        public hb_aat_layout_feature_selector_info_t.Buffer disable(@NativeType("hb_aat_layout_feature_selector_t") int value) { hb_aat_layout_feature_selector_info_t.ndisable(address(), value); return this; }

    }

}
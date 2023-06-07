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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure representing a name ID in a particular language.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct hb_ot_name_entry_t {
 *     hb_ot_name_id_t name_id;
 *     {@link hb_var_int_t hb_var_int_t} var;
 *     hb_language_t language;
 * }</code></pre>
 */
public class hb_ot_name_entry_t extends Struct<hb_ot_name_entry_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME_ID,
        VAR,
        LANGUAGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(hb_var_int_t.SIZEOF, hb_var_int_t.ALIGNOF),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME_ID = layout.offsetof(0);
        VAR = layout.offsetof(1);
        LANGUAGE = layout.offsetof(2);
    }

    protected hb_ot_name_entry_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected hb_ot_name_entry_t create(long address, @Nullable ByteBuffer container) {
        return new hb_ot_name_entry_t(address, container);
    }

    /**
     * Creates a {@code hb_ot_name_entry_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public hb_ot_name_entry_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code name_id} field. */
    @NativeType("hb_ot_name_id_t")
    public int name_id() { return nname_id(address()); }
    /** @return the value of the {@code language} field. */
    @NativeType("hb_language_t")
    public long language() { return nlanguage(address()); }

    /** Sets the specified value to the {@code name_id} field. */
    public hb_ot_name_entry_t name_id(@NativeType("hb_ot_name_id_t") int value) { nname_id(address(), value); return this; }
    /** Sets the specified value to the {@code language} field. */
    public hb_ot_name_entry_t language(@NativeType("hb_language_t") long value) { nlanguage(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public hb_ot_name_entry_t set(
        int name_id,
        long language
    ) {
        name_id(name_id);
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
    public hb_ot_name_entry_t set(hb_ot_name_entry_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code hb_ot_name_entry_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static hb_ot_name_entry_t malloc() {
        return new hb_ot_name_entry_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code hb_ot_name_entry_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static hb_ot_name_entry_t calloc() {
        return new hb_ot_name_entry_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code hb_ot_name_entry_t} instance allocated with {@link BufferUtils}. */
    public static hb_ot_name_entry_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new hb_ot_name_entry_t(memAddress(container), container);
    }

    /** Returns a new {@code hb_ot_name_entry_t} instance for the specified memory address. */
    public static hb_ot_name_entry_t create(long address) {
        return new hb_ot_name_entry_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_ot_name_entry_t createSafe(long address) {
        return address == NULL ? null : new hb_ot_name_entry_t(address, null);
    }

    /**
     * Returns a new {@link hb_ot_name_entry_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_ot_name_entry_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link hb_ot_name_entry_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static hb_ot_name_entry_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_ot_name_entry_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static hb_ot_name_entry_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link hb_ot_name_entry_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static hb_ot_name_entry_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static hb_ot_name_entry_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code hb_ot_name_entry_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_ot_name_entry_t malloc(MemoryStack stack) {
        return new hb_ot_name_entry_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code hb_ot_name_entry_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static hb_ot_name_entry_t calloc(MemoryStack stack) {
        return new hb_ot_name_entry_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link hb_ot_name_entry_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_ot_name_entry_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link hb_ot_name_entry_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static hb_ot_name_entry_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name_id}. */
    public static int nname_id(long struct) { return UNSAFE.getInt(null, struct + hb_ot_name_entry_t.NAME_ID); }
    public static hb_var_int_t nvar(long struct) { return hb_var_int_t.create(struct + hb_ot_name_entry_t.VAR); }
    /** Unsafe version of {@link #language}. */
    public static long nlanguage(long struct) { return memGetAddress(struct + hb_ot_name_entry_t.LANGUAGE); }

    /** Unsafe version of {@link #name_id(int) name_id}. */
    public static void nname_id(long struct, int value) { UNSAFE.putInt(null, struct + hb_ot_name_entry_t.NAME_ID, value); }
    public static void nvar(long struct, hb_var_int_t value) { memCopy(value.address(), struct + hb_ot_name_entry_t.VAR, hb_var_int_t.SIZEOF); }
    /** Unsafe version of {@link #language(long) language}. */
    public static void nlanguage(long struct, long value) { memPutAddress(struct + hb_ot_name_entry_t.LANGUAGE, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + hb_ot_name_entry_t.LANGUAGE));
    }

    // -----------------------------------

    /** An array of {@link hb_ot_name_entry_t} structs. */
    public static class Buffer extends StructBuffer<hb_ot_name_entry_t, Buffer> implements NativeResource {

        private static final hb_ot_name_entry_t ELEMENT_FACTORY = hb_ot_name_entry_t.create(-1L);

        /**
         * Creates a new {@code hb_ot_name_entry_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link hb_ot_name_entry_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected hb_ot_name_entry_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code name_id} field. */
        @NativeType("hb_ot_name_id_t")
        public int name_id() { return hb_ot_name_entry_t.nname_id(address()); }
        /** @return the value of the {@code language} field. */
        @NativeType("hb_language_t")
        public long language() { return hb_ot_name_entry_t.nlanguage(address()); }

        /** Sets the specified value to the {@code name_id} field. */
        public hb_ot_name_entry_t.Buffer name_id(@NativeType("hb_ot_name_id_t") int value) { hb_ot_name_entry_t.nname_id(address(), value); return this; }
        /** Sets the specified value to the {@code language} field. */
        public hb_ot_name_entry_t.Buffer language(@NativeType("hb_language_t") long value) { hb_ot_name_entry_t.nlanguage(address(), value); return this; }

    }

}
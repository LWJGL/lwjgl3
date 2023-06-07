/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.nfd;

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
 * struct nfdfilteritem_t {
 *     nfdchar_t const * name;
 *     nfdchar_t const * spec;
 * }</code></pre>
 */
@NativeType("struct nfdfilteritem_t")
public class NFDFilterItem extends Struct<NFDFilterItem> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        SPEC;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        SPEC = layout.offsetof(1);
    }

    protected NFDFilterItem(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NFDFilterItem create(long address, @Nullable ByteBuffer container) {
        return new NFDFilterItem(address, container);
    }

    /**
     * Creates a {@code NFDFilterItem} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NFDFilterItem(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @NativeType("nfdchar_t const *")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string pointed to by the {@code name} field. */
    @NativeType("nfdchar_t const *")
    public String nameString() { return nnameString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code spec} field. */
    @NativeType("nfdchar_t const *")
    public ByteBuffer spec() { return nspec(address()); }
    /** @return the null-terminated string pointed to by the {@code spec} field. */
    @NativeType("nfdchar_t const *")
    public String specString() { return nspecString(address()); }

    /** Sets the address of the specified encoded string to the {@code name} field. */
    public NFDFilterItem name(@NativeType("nfdchar_t const *") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code spec} field. */
    public NFDFilterItem spec(@NativeType("nfdchar_t const *") ByteBuffer value) { nspec(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NFDFilterItem set(
        ByteBuffer name,
        ByteBuffer spec
    ) {
        name(name);
        spec(spec);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NFDFilterItem set(NFDFilterItem src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NFDFilterItem} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NFDFilterItem malloc() {
        return new NFDFilterItem(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NFDFilterItem} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NFDFilterItem calloc() {
        return new NFDFilterItem(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NFDFilterItem} instance allocated with {@link BufferUtils}. */
    public static NFDFilterItem create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NFDFilterItem(memAddress(container), container);
    }

    /** Returns a new {@code NFDFilterItem} instance for the specified memory address. */
    public static NFDFilterItem create(long address) {
        return new NFDFilterItem(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NFDFilterItem createSafe(long address) {
        return address == NULL ? null : new NFDFilterItem(address, null);
    }

    /**
     * Returns a new {@link NFDFilterItem.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NFDFilterItem.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NFDFilterItem.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NFDFilterItem.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NFDFilterItem.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NFDFilterItem.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NFDFilterItem.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NFDFilterItem.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NFDFilterItem.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code NFDFilterItem} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NFDFilterItem malloc(MemoryStack stack) {
        return new NFDFilterItem(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NFDFilterItem} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NFDFilterItem calloc(MemoryStack stack) {
        return new NFDFilterItem(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NFDFilterItem.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NFDFilterItem.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NFDFilterItem.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NFDFilterItem.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + NFDFilterItem.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(memGetAddress(struct + NFDFilterItem.NAME)); }
    /** Unsafe version of {@link #spec}. */
    public static ByteBuffer nspec(long struct) { return memByteBufferNT1(memGetAddress(struct + NFDFilterItem.SPEC)); }
    /** Unsafe version of {@link #specString}. */
    public static String nspecString(long struct) { return memUTF8(memGetAddress(struct + NFDFilterItem.SPEC)); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + NFDFilterItem.NAME, memAddress(value));
    }
    /** Unsafe version of {@link #spec(ByteBuffer) spec}. */
    public static void nspec(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + NFDFilterItem.SPEC, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + NFDFilterItem.NAME));
        check(memGetAddress(struct + NFDFilterItem.SPEC));
    }

    // -----------------------------------

    /** An array of {@link NFDFilterItem} structs. */
    public static class Buffer extends StructBuffer<NFDFilterItem, Buffer> implements NativeResource {

        private static final NFDFilterItem ELEMENT_FACTORY = NFDFilterItem.create(-1L);

        /**
         * Creates a new {@code NFDFilterItem.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NFDFilterItem#SIZEOF}, and its mark will be undefined.</p>
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
        protected NFDFilterItem getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("nfdchar_t const *")
        public ByteBuffer name() { return NFDFilterItem.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("nfdchar_t const *")
        public String nameString() { return NFDFilterItem.nnameString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code spec} field. */
        @NativeType("nfdchar_t const *")
        public ByteBuffer spec() { return NFDFilterItem.nspec(address()); }
        /** @return the null-terminated string pointed to by the {@code spec} field. */
        @NativeType("nfdchar_t const *")
        public String specString() { return NFDFilterItem.nspecString(address()); }

        /** Sets the address of the specified encoded string to the {@code name} field. */
        public NFDFilterItem.Buffer name(@NativeType("nfdchar_t const *") ByteBuffer value) { NFDFilterItem.nname(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code spec} field. */
        public NFDFilterItem.Buffer spec(@NativeType("nfdchar_t const *") ByteBuffer value) { NFDFilterItem.nspec(address(), value); return this; }

    }

}
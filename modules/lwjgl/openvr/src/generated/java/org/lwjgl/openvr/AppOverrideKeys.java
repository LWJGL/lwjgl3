/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

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
 * struct AppOverrideKeys_t {
 *     char * pchKey;
 *     char * pchValue;
 * }</code></pre>
 */
@NativeType("struct AppOverrideKeys_t")
public class AppOverrideKeys extends Struct<AppOverrideKeys> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PCHKEY,
        PCHVALUE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PCHKEY = layout.offsetof(0);
        PCHVALUE = layout.offsetof(1);
    }

    protected AppOverrideKeys(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected AppOverrideKeys create(long address, @Nullable ByteBuffer container) {
        return new AppOverrideKeys(address, container);
    }

    /**
     * Creates a {@code AppOverrideKeys} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AppOverrideKeys(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pchKey} field. */
    @NativeType("char *")
    public ByteBuffer pchKey() { return npchKey(address()); }
    /** @return the null-terminated string pointed to by the {@code pchKey} field. */
    @NativeType("char *")
    public String pchKeyString() { return npchKeyString(address()); }
    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code pchValue} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("char *")
    public ByteBuffer pchValue(int capacity) { return npchValue(address(), capacity); }

    /** Sets the address of the specified encoded string to the {@code pchKey} field. */
    public AppOverrideKeys pchKey(@NativeType("char *") ByteBuffer value) { npchKey(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pchValue} field. */
    public AppOverrideKeys pchValue(@NativeType("char *") ByteBuffer value) { npchValue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AppOverrideKeys set(
        ByteBuffer pchKey,
        ByteBuffer pchValue
    ) {
        pchKey(pchKey);
        pchValue(pchValue);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AppOverrideKeys set(AppOverrideKeys src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AppOverrideKeys} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AppOverrideKeys malloc() {
        return new AppOverrideKeys(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code AppOverrideKeys} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AppOverrideKeys calloc() {
        return new AppOverrideKeys(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code AppOverrideKeys} instance allocated with {@link BufferUtils}. */
    public static AppOverrideKeys create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new AppOverrideKeys(memAddress(container), container);
    }

    /** Returns a new {@code AppOverrideKeys} instance for the specified memory address. */
    public static AppOverrideKeys create(long address) {
        return new AppOverrideKeys(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable AppOverrideKeys createSafe(long address) {
        return address == NULL ? null : new AppOverrideKeys(address, null);
    }

    /**
     * Returns a new {@link AppOverrideKeys.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AppOverrideKeys.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AppOverrideKeys.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AppOverrideKeys.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AppOverrideKeys.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AppOverrideKeys.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link AppOverrideKeys.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AppOverrideKeys.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static AppOverrideKeys.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AppOverrideKeys mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AppOverrideKeys callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AppOverrideKeys mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AppOverrideKeys callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AppOverrideKeys.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AppOverrideKeys.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AppOverrideKeys.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AppOverrideKeys.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AppOverrideKeys} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AppOverrideKeys malloc(MemoryStack stack) {
        return new AppOverrideKeys(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code AppOverrideKeys} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AppOverrideKeys calloc(MemoryStack stack) {
        return new AppOverrideKeys(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link AppOverrideKeys.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AppOverrideKeys.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AppOverrideKeys.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AppOverrideKeys.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pchKey}. */
    public static ByteBuffer npchKey(long struct) { return memByteBufferNT1(memGetAddress(struct + AppOverrideKeys.PCHKEY)); }
    /** Unsafe version of {@link #pchKeyString}. */
    public static String npchKeyString(long struct) { return memASCII(memGetAddress(struct + AppOverrideKeys.PCHKEY)); }
    /** Unsafe version of {@link #pchValue(int) pchValue}. */
    public static ByteBuffer npchValue(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + AppOverrideKeys.PCHVALUE), capacity); }

    /** Unsafe version of {@link #pchKey(ByteBuffer) pchKey}. */
    public static void npchKey(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + AppOverrideKeys.PCHKEY, memAddress(value));
    }
    /** Unsafe version of {@link #pchValue(ByteBuffer) pchValue}. */
    public static void npchValue(long struct, ByteBuffer value) { memPutAddress(struct + AppOverrideKeys.PCHVALUE, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + AppOverrideKeys.PCHKEY));
        check(memGetAddress(struct + AppOverrideKeys.PCHVALUE));
    }

    // -----------------------------------

    /** An array of {@link AppOverrideKeys} structs. */
    public static class Buffer extends StructBuffer<AppOverrideKeys, Buffer> implements NativeResource {

        private static final AppOverrideKeys ELEMENT_FACTORY = AppOverrideKeys.create(-1L);

        /**
         * Creates a new {@code AppOverrideKeys.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AppOverrideKeys#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected AppOverrideKeys getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pchKey} field. */
        @NativeType("char *")
        public ByteBuffer pchKey() { return AppOverrideKeys.npchKey(address()); }
        /** @return the null-terminated string pointed to by the {@code pchKey} field. */
        @NativeType("char *")
        public String pchKeyString() { return AppOverrideKeys.npchKeyString(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code pchValue} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("char *")
        public ByteBuffer pchValue(int capacity) { return AppOverrideKeys.npchValue(address(), capacity); }

        /** Sets the address of the specified encoded string to the {@code pchKey} field. */
        public AppOverrideKeys.Buffer pchKey(@NativeType("char *") ByteBuffer value) { AppOverrideKeys.npchKey(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pchValue} field. */
        public AppOverrideKeys.Buffer pchValue(@NativeType("char *") ByteBuffer value) { AppOverrideKeys.npchValue(address(), value); return this; }

    }

}
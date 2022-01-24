/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spvc;

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
 * struct spvc_entry_point {
 *     SpvExecutionModel execution_model;
 *     char const * name;
 * }</code></pre>
 */
@NativeType("struct spvc_entry_point")
public class SpvcEntryPoint extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EXECUTION_MODEL,
        NAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EXECUTION_MODEL = layout.offsetof(0);
        NAME = layout.offsetof(1);
    }

    /**
     * Creates a {@code SpvcEntryPoint} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpvcEntryPoint(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code execution_model} field. */
    @NativeType("SpvExecutionModel")
    public int execution_model() { return nexecution_model(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char const *")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string pointed to by the {@code name} field. */
    @NativeType("char const *")
    public String nameString() { return nnameString(address()); }

    /** Sets the specified value to the {@code execution_model} field. */
    public SpvcEntryPoint execution_model(@NativeType("SpvExecutionModel") int value) { nexecution_model(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code name} field. */
    public SpvcEntryPoint name(@NativeType("char const *") ByteBuffer value) { nname(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpvcEntryPoint set(
        int execution_model,
        ByteBuffer name
    ) {
        execution_model(execution_model);
        name(name);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SpvcEntryPoint set(SpvcEntryPoint src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpvcEntryPoint} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpvcEntryPoint malloc() {
        return wrap(SpvcEntryPoint.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code SpvcEntryPoint} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpvcEntryPoint calloc() {
        return wrap(SpvcEntryPoint.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code SpvcEntryPoint} instance allocated with {@link BufferUtils}. */
    public static SpvcEntryPoint create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(SpvcEntryPoint.class, memAddress(container), container);
    }

    /** Returns a new {@code SpvcEntryPoint} instance for the specified memory address. */
    public static SpvcEntryPoint create(long address) {
        return wrap(SpvcEntryPoint.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcEntryPoint createSafe(long address) {
        return address == NULL ? null : wrap(SpvcEntryPoint.class, address);
    }

    /**
     * Returns a new {@link SpvcEntryPoint.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcEntryPoint.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpvcEntryPoint.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcEntryPoint.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcEntryPoint.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcEntryPoint.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link SpvcEntryPoint.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpvcEntryPoint.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcEntryPoint.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code SpvcEntryPoint} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcEntryPoint malloc(MemoryStack stack) {
        return wrap(SpvcEntryPoint.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code SpvcEntryPoint} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcEntryPoint calloc(MemoryStack stack) {
        return wrap(SpvcEntryPoint.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SpvcEntryPoint.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcEntryPoint.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcEntryPoint.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcEntryPoint.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #execution_model}. */
    public static int nexecution_model(long struct) { return UNSAFE.getInt(null, struct + SpvcEntryPoint.EXECUTION_MODEL); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + SpvcEntryPoint.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(memGetAddress(struct + SpvcEntryPoint.NAME)); }

    /** Unsafe version of {@link #execution_model(int) execution_model}. */
    public static void nexecution_model(long struct, int value) { UNSAFE.putInt(null, struct + SpvcEntryPoint.EXECUTION_MODEL, value); }
    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + SpvcEntryPoint.NAME, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SpvcEntryPoint.NAME));
    }

    // -----------------------------------

    /** An array of {@link SpvcEntryPoint} structs. */
    public static class Buffer extends StructBuffer<SpvcEntryPoint, Buffer> implements NativeResource {

        private static final SpvcEntryPoint ELEMENT_FACTORY = SpvcEntryPoint.create(-1L);

        /**
         * Creates a new {@code SpvcEntryPoint.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpvcEntryPoint#SIZEOF}, and its mark will be undefined.
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
        protected SpvcEntryPoint getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code execution_model} field. */
        @NativeType("SpvExecutionModel")
        public int execution_model() { return SpvcEntryPoint.nexecution_model(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public ByteBuffer name() { return SpvcEntryPoint.nname(address()); }
        /** @return the null-terminated string pointed to by the {@code name} field. */
        @NativeType("char const *")
        public String nameString() { return SpvcEntryPoint.nnameString(address()); }

        /** Sets the specified value to the {@code execution_model} field. */
        public SpvcEntryPoint.Buffer execution_model(@NativeType("SpvExecutionModel") int value) { SpvcEntryPoint.nexecution_model(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code name} field. */
        public SpvcEntryPoint.Buffer name(@NativeType("char const *") ByteBuffer value) { SpvcEntryPoint.nname(address(), value); return this; }

    }

}
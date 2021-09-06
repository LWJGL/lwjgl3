/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Represents an UTF-8 string, zero byte terminated.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiString {
 *     ai_uint32 {@link #length};
 *     char {@link #data}[Assimp.MAXLEN];
 * }</code></pre>
 */
@NativeType("struct aiString")
public class AIString extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LENGTH,
        DATA;

    static {
        Layout layout = __struct(
            __member(4),
            __array(1, Assimp.MAXLEN)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LENGTH = layout.offsetof(0);
        DATA = layout.offsetof(1);
    }

    /**
     * Creates a {@code AIString} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIString(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Binary length of the string excluding the terminal 0. */
    @NativeType("ai_uint32")
    public int length() { return nlength(address()); }
    /** String buffer. */
    @NativeType("char[Assimp.MAXLEN]")
    public ByteBuffer data() { return ndata(address()); }
    /** String buffer. */
    @NativeType("char[Assimp.MAXLEN]")
    public String dataString() { return ndataString(address()); }

    /** Copies the specified encoded string to the {@link #data} field. */
    public AIString data(@NativeType("char[Assimp.MAXLEN]") ByteBuffer value) { ndata(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIString set(AIString src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIString} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIString malloc() {
        return wrap(AIString.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code AIString} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIString calloc() {
        return wrap(AIString.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code AIString} instance allocated with {@link BufferUtils}. */
    public static AIString create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(AIString.class, memAddress(container), container);
    }

    /** Returns a new {@code AIString} instance for the specified memory address. */
    public static AIString create(long address) {
        return wrap(AIString.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIString createSafe(long address) {
        return address == NULL ? null : wrap(AIString.class, address);
    }

    /**
     * Returns a new {@link AIString.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIString.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIString.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIString.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIString.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIString.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link AIString.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIString.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIString.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIString mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIString callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIString mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIString callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIString.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIString.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIString.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIString.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIString} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIString malloc(MemoryStack stack) {
        return wrap(AIString.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code AIString} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIString calloc(MemoryStack stack) {
        return wrap(AIString.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link AIString.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIString.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIString.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIString.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #length}. */
    public static int nlength(long struct) { return UNSAFE.getInt(null, struct + AIString.LENGTH); }
    /** Unsafe version of {@link #data}. */
    public static ByteBuffer ndata(long struct) { return memByteBuffer(struct + AIString.DATA, nlength(struct)); }
    /** Unsafe version of {@link #dataString}. */
    public static String ndataString(long struct) { return memUTF8(ndata(struct)); }

    /** Sets the specified value to the {@code length} field of the specified {@code struct}. */
    public static void nlength(long struct, int value) { UNSAFE.putInt(null, struct + AIString.LENGTH, value); }
    /** Unsafe version of {@link #data(ByteBuffer) data}. */
    public static void ndata(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, Assimp.MAXLEN);
        }
        memCopy(memAddress(value), struct + AIString.DATA, value.remaining());
        nlength(struct, value.remaining() - 1);
    }

    // -----------------------------------

    /** An array of {@link AIString} structs. */
    public static class Buffer extends StructBuffer<AIString, Buffer> implements NativeResource {

        private static final AIString ELEMENT_FACTORY = AIString.create(-1L);

        /**
         * Creates a new {@code AIString.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIString#SIZEOF}, and its mark will be undefined.
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
        protected AIString getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link AIString#length} field. */
        @NativeType("ai_uint32")
        public int length() { return AIString.nlength(address()); }
        /** @return a {@link ByteBuffer} view of the {@link AIString#data} field. */
        @NativeType("char[Assimp.MAXLEN]")
        public ByteBuffer data() { return AIString.ndata(address()); }
        /** @return the null-terminated string stored in the {@link AIString#data} field. */
        @NativeType("char[Assimp.MAXLEN]")
        public String dataString() { return AIString.ndataString(address()); }

        /** Copies the specified encoded string to the {@link AIString#data} field. */
        public AIString.Buffer data(@NativeType("char[Assimp.MAXLEN]") ByteBuffer value) { AIString.ndata(address(), value); return this; }

    }

}
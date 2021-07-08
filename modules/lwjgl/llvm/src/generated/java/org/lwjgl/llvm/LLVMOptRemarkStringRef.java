/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * String containing a buffer and a length. The buffer is not guaranteed to be zero-terminated.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct LLVMOptRemarkStringRef {
 *     char const * Str;
 *     uint32_t Len;
 * }</code></pre>
 */
public class LLVMOptRemarkStringRef extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STR,
        LEN;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STR = layout.offsetof(0);
        LEN = layout.offsetof(1);
    }

    /**
     * Creates a {@code LLVMOptRemarkStringRef} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LLVMOptRemarkStringRef(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code Str} field. */
    @NativeType("char const *")
    public ByteBuffer Str() { return nStr(address()); }
    /** @return the null-terminated string pointed to by the {@code Str} field. */
    @NativeType("char const *")
    public String StrString() { return nStrString(address()); }
    /** @return the value of the {@code Len} field. */
    @NativeType("uint32_t")
    public int Len() { return nLen(address()); }

    // -----------------------------------

    /** Returns a new {@code LLVMOptRemarkStringRef} instance for the specified memory address. */
    public static LLVMOptRemarkStringRef create(long address) {
        return wrap(LLVMOptRemarkStringRef.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOptRemarkStringRef createSafe(long address) {
        return address == NULL ? null : wrap(LLVMOptRemarkStringRef.class, address);
    }

    /**
     * Create a {@link LLVMOptRemarkStringRef.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LLVMOptRemarkStringRef.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LLVMOptRemarkStringRef.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Str}. */
    public static ByteBuffer nStr(long struct) { return memByteBufferNT1(memGetAddress(struct + LLVMOptRemarkStringRef.STR)); }
    /** Unsafe version of {@link #StrString}. */
    public static String nStrString(long struct) { return memUTF8(memGetAddress(struct + LLVMOptRemarkStringRef.STR)); }
    /** Unsafe version of {@link #Len}. */
    public static int nLen(long struct) { return UNSAFE.getInt(null, struct + LLVMOptRemarkStringRef.LEN); }

    // -----------------------------------

    /** An array of {@link LLVMOptRemarkStringRef} structs. */
    public static class Buffer extends StructBuffer<LLVMOptRemarkStringRef, Buffer> {

        private static final LLVMOptRemarkStringRef ELEMENT_FACTORY = LLVMOptRemarkStringRef.create(-1L);

        /**
         * Creates a new {@code LLVMOptRemarkStringRef.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LLVMOptRemarkStringRef#SIZEOF}, and its mark will be undefined.
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
        protected LLVMOptRemarkStringRef getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code Str} field. */
        @NativeType("char const *")
        public ByteBuffer Str() { return LLVMOptRemarkStringRef.nStr(address()); }
        /** @return the null-terminated string pointed to by the {@code Str} field. */
        @NativeType("char const *")
        public String StrString() { return LLVMOptRemarkStringRef.nStrString(address()); }
        /** @return the value of the {@code Len} field. */
        @NativeType("uint32_t")
        public int Len() { return LLVMOptRemarkStringRef.nLen(address()); }

    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Describes a single preprocessing token.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CXToken {
 *     unsigned int_data[4];
 *     void * ptr_data;
 * }</code></pre>
 */
public class CXToken extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        INT_DATA,
        PTR_DATA;

    static {
        Layout layout = __struct(
            __array(4, 4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        INT_DATA = layout.offsetof(0);
        PTR_DATA = layout.offsetof(1);
    }

    /**
     * Creates a {@code CXToken} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXToken(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link IntBuffer} view of the {@code int_data} field. */
    @NativeType("unsigned[4]")
    public IntBuffer int_data() { return nint_data(address()); }
    /** @return the value at the specified index of the {@code int_data} field. */
    @NativeType("unsigned")
    public int int_data(int index) { return nint_data(address(), index); }
    /** @return the value of the {@code ptr_data} field. */
    @NativeType("void *")
    public long ptr_data() { return nptr_data(address()); }

    // -----------------------------------

    /** Returns a new {@code CXToken} instance for the specified memory address. */
    public static CXToken create(long address) {
        return wrap(CXToken.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXToken createSafe(long address) {
        return address == NULL ? null : wrap(CXToken.class, address);
    }

    /**
     * Create a {@link CXToken.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXToken.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXToken.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #int_data}. */
    public static IntBuffer nint_data(long struct) { return memIntBuffer(struct + CXToken.INT_DATA, 4); }
    /** Unsafe version of {@link #int_data(int) int_data}. */
    public static int nint_data(long struct, int index) {
        return UNSAFE.getInt(null, struct + CXToken.INT_DATA + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #ptr_data}. */
    public static long nptr_data(long struct) { return memGetAddress(struct + CXToken.PTR_DATA); }

    // -----------------------------------

    /** An array of {@link CXToken} structs. */
    public static class Buffer extends StructBuffer<CXToken, Buffer> {

        private static final CXToken ELEMENT_FACTORY = CXToken.create(-1L);

        /**
         * Creates a new {@code CXToken.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXToken#SIZEOF}, and its mark will be undefined.
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
        protected CXToken getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link IntBuffer} view of the {@code int_data} field. */
        @NativeType("unsigned[4]")
        public IntBuffer int_data() { return CXToken.nint_data(address()); }
        /** @return the value at the specified index of the {@code int_data} field. */
        @NativeType("unsigned")
        public int int_data(int index) { return CXToken.nint_data(address(), index); }
        /** @return the value of the {@code ptr_data} field. */
        @NativeType("void *")
        public long ptr_data() { return CXToken.nptr_data(address()); }

    }

}
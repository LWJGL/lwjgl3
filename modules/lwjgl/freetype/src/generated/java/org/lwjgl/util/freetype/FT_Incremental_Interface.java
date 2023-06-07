/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A structure to be used with {@link FreeType#FT_Open_Face Open_Face} to indicate that the user wants to support incremental glyph loading.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Incremental_InterfaceRec {
 *     {@link FT_Incremental_Funcs FT_Incremental_FuncsRec} const * funcs;
 *     FT_Incremental object;
 * }</code></pre>
 */
@NativeType("struct FT_Incremental_InterfaceRec")
public class FT_Incremental_Interface extends Struct<FT_Incremental_Interface> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FUNCS,
        OBJECT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FUNCS = layout.offsetof(0);
        OBJECT = layout.offsetof(1);
    }

    protected FT_Incremental_Interface(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Incremental_Interface create(long address, @Nullable ByteBuffer container) {
        return new FT_Incremental_Interface(address, container);
    }

    /**
     * Creates a {@code FT_Incremental_Interface} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Incremental_Interface(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FT_Incremental_Funcs} view of the struct pointed to by the {@code funcs} field. */
    @NativeType("FT_Incremental_FuncsRec const *")
    public FT_Incremental_Funcs funcs() { return nfuncs(address()); }
    /** @return the value of the {@code object} field. */
    @NativeType("FT_Incremental")
    public long object() { return nobject(address()); }

    /** Sets the address of the specified {@link FT_Incremental_Funcs} to the {@code funcs} field. */
    public FT_Incremental_Interface funcs(@NativeType("FT_Incremental_FuncsRec const *") FT_Incremental_Funcs value) { nfuncs(address(), value); return this; }
    /** Sets the specified value to the {@code object} field. */
    public FT_Incremental_Interface object(@NativeType("FT_Incremental") long value) { nobject(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FT_Incremental_Interface set(
        FT_Incremental_Funcs funcs,
        long object
    ) {
        funcs(funcs);
        object(object);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FT_Incremental_Interface set(FT_Incremental_Interface src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FT_Incremental_Interface} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_Incremental_Interface malloc() {
        return new FT_Incremental_Interface(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_Incremental_Interface} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_Incremental_Interface calloc() {
        return new FT_Incremental_Interface(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_Incremental_Interface} instance allocated with {@link BufferUtils}. */
    public static FT_Incremental_Interface create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Incremental_Interface(memAddress(container), container);
    }

    /** Returns a new {@code FT_Incremental_Interface} instance for the specified memory address. */
    public static FT_Incremental_Interface create(long address) {
        return new FT_Incremental_Interface(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Incremental_Interface createSafe(long address) {
        return address == NULL ? null : new FT_Incremental_Interface(address, null);
    }

    /**
     * Returns a new {@link FT_Incremental_Interface.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Incremental_Interface.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_Incremental_Interface.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Incremental_Interface.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Incremental_Interface.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Incremental_Interface.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_Incremental_Interface.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Incremental_Interface.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Incremental_Interface.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_Incremental_Interface} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Incremental_Interface malloc(MemoryStack stack) {
        return new FT_Incremental_Interface(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_Incremental_Interface} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Incremental_Interface calloc(MemoryStack stack) {
        return new FT_Incremental_Interface(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_Incremental_Interface.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Incremental_Interface.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Incremental_Interface.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Incremental_Interface.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #funcs}. */
    public static FT_Incremental_Funcs nfuncs(long struct) { return FT_Incremental_Funcs.create(memGetAddress(struct + FT_Incremental_Interface.FUNCS)); }
    /** Unsafe version of {@link #object}. */
    public static long nobject(long struct) { return memGetAddress(struct + FT_Incremental_Interface.OBJECT); }

    /** Unsafe version of {@link #funcs(FT_Incremental_Funcs) funcs}. */
    public static void nfuncs(long struct, FT_Incremental_Funcs value) { memPutAddress(struct + FT_Incremental_Interface.FUNCS, value.address()); }
    /** Unsafe version of {@link #object(long) object}. */
    public static void nobject(long struct, long value) { memPutAddress(struct + FT_Incremental_Interface.OBJECT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long funcs = memGetAddress(struct + FT_Incremental_Interface.FUNCS);
        check(funcs);
        FT_Incremental_Funcs.validate(funcs);
    }

    // -----------------------------------

    /** An array of {@link FT_Incremental_Interface} structs. */
    public static class Buffer extends StructBuffer<FT_Incremental_Interface, Buffer> implements NativeResource {

        private static final FT_Incremental_Interface ELEMENT_FACTORY = FT_Incremental_Interface.create(-1L);

        /**
         * Creates a new {@code FT_Incremental_Interface.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Incremental_Interface#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Incremental_Interface getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_Incremental_Funcs} view of the struct pointed to by the {@code funcs} field. */
        @NativeType("FT_Incremental_FuncsRec const *")
        public FT_Incremental_Funcs funcs() { return FT_Incremental_Interface.nfuncs(address()); }
        /** @return the value of the {@code object} field. */
        @NativeType("FT_Incremental")
        public long object() { return FT_Incremental_Interface.nobject(address()); }

        /** Sets the address of the specified {@link FT_Incremental_Funcs} to the {@code funcs} field. */
        public FT_Incremental_Interface.Buffer funcs(@NativeType("FT_Incremental_FuncsRec const *") FT_Incremental_Funcs value) { FT_Incremental_Interface.nfuncs(address(), value); return this; }
        /** Sets the specified value to the {@code object} field. */
        public FT_Incremental_Interface.Buffer object(@NativeType("FT_Incremental") long value) { FT_Incremental_Interface.nobject(address(), value); return this; }

    }

}
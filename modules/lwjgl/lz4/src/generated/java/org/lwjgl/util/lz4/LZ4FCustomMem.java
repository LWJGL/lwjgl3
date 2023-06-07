/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

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
 * struct LZ4F_CustomMem {
 *     {@link LZ4FAllocFunctionI LZ4F_AllocFunction} customAlloc;
 *     {@link LZ4FCallocFunctionI LZ4F_CallocFunction} {@link #customCalloc};
 *     {@link LZ4FFreeFunctionI LZ4F_FreeFunction} customFree;
 *     void * opaqueState;
 * }</code></pre>
 */
@NativeType("struct LZ4F_CustomMem")
public class LZ4FCustomMem extends Struct<LZ4FCustomMem> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CUSTOMALLOC,
        CUSTOMCALLOC,
        CUSTOMFREE,
        OPAQUESTATE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CUSTOMALLOC = layout.offsetof(0);
        CUSTOMCALLOC = layout.offsetof(1);
        CUSTOMFREE = layout.offsetof(2);
        OPAQUESTATE = layout.offsetof(3);
    }

    protected LZ4FCustomMem(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected LZ4FCustomMem create(long address, @Nullable ByteBuffer container) {
        return new LZ4FCustomMem(address, container);
    }

    /**
     * Creates a {@code LZ4FCustomMem} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LZ4FCustomMem(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code customAlloc} field. */
    @NativeType("LZ4F_AllocFunction")
    public LZ4FAllocFunction customAlloc() { return ncustomAlloc(address()); }
    /** optional; when not defined, uses {@code customAlloc} + {@code memset} */
    @Nullable
    @NativeType("LZ4F_CallocFunction")
    public LZ4FCallocFunction customCalloc() { return ncustomCalloc(address()); }
    /** @return the value of the {@code customFree} field. */
    @NativeType("LZ4F_FreeFunction")
    public LZ4FFreeFunction customFree() { return ncustomFree(address()); }
    /** @return the value of the {@code opaqueState} field. */
    @NativeType("void *")
    public long opaqueState() { return nopaqueState(address()); }

    /** Sets the specified value to the {@code customAlloc} field. */
    public LZ4FCustomMem customAlloc(@NativeType("LZ4F_AllocFunction") LZ4FAllocFunctionI value) { ncustomAlloc(address(), value); return this; }
    /** Sets the specified value to the {@link #customCalloc} field. */
    public LZ4FCustomMem customCalloc(@Nullable @NativeType("LZ4F_CallocFunction") LZ4FCallocFunctionI value) { ncustomCalloc(address(), value); return this; }
    /** Sets the specified value to the {@code customFree} field. */
    public LZ4FCustomMem customFree(@NativeType("LZ4F_FreeFunction") LZ4FFreeFunctionI value) { ncustomFree(address(), value); return this; }
    /** Sets the specified value to the {@code opaqueState} field. */
    public LZ4FCustomMem opaqueState(@NativeType("void *") long value) { nopaqueState(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public LZ4FCustomMem set(
        LZ4FAllocFunctionI customAlloc,
        LZ4FCallocFunctionI customCalloc,
        LZ4FFreeFunctionI customFree,
        long opaqueState
    ) {
        customAlloc(customAlloc);
        customCalloc(customCalloc);
        customFree(customFree);
        opaqueState(opaqueState);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LZ4FCustomMem set(LZ4FCustomMem src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LZ4FCustomMem} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LZ4FCustomMem malloc() {
        return new LZ4FCustomMem(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code LZ4FCustomMem} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LZ4FCustomMem calloc() {
        return new LZ4FCustomMem(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code LZ4FCustomMem} instance allocated with {@link BufferUtils}. */
    public static LZ4FCustomMem create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new LZ4FCustomMem(memAddress(container), container);
    }

    /** Returns a new {@code LZ4FCustomMem} instance for the specified memory address. */
    public static LZ4FCustomMem create(long address) {
        return new LZ4FCustomMem(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LZ4FCustomMem createSafe(long address) {
        return address == NULL ? null : new LZ4FCustomMem(address, null);
    }

    /**
     * Returns a new {@link LZ4FCustomMem.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FCustomMem.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LZ4FCustomMem.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FCustomMem.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LZ4FCustomMem.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FCustomMem.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link LZ4FCustomMem.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LZ4FCustomMem.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LZ4FCustomMem.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code LZ4FCustomMem} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LZ4FCustomMem malloc(MemoryStack stack) {
        return new LZ4FCustomMem(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code LZ4FCustomMem} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LZ4FCustomMem calloc(MemoryStack stack) {
        return new LZ4FCustomMem(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link LZ4FCustomMem.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LZ4FCustomMem.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LZ4FCustomMem.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LZ4FCustomMem.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #customAlloc}. */
    public static LZ4FAllocFunction ncustomAlloc(long struct) { return LZ4FAllocFunction.create(memGetAddress(struct + LZ4FCustomMem.CUSTOMALLOC)); }
    /** Unsafe version of {@link #customCalloc}. */
    @Nullable public static LZ4FCallocFunction ncustomCalloc(long struct) { return LZ4FCallocFunction.createSafe(memGetAddress(struct + LZ4FCustomMem.CUSTOMCALLOC)); }
    /** Unsafe version of {@link #customFree}. */
    public static LZ4FFreeFunction ncustomFree(long struct) { return LZ4FFreeFunction.create(memGetAddress(struct + LZ4FCustomMem.CUSTOMFREE)); }
    /** Unsafe version of {@link #opaqueState}. */
    public static long nopaqueState(long struct) { return memGetAddress(struct + LZ4FCustomMem.OPAQUESTATE); }

    /** Unsafe version of {@link #customAlloc(LZ4FAllocFunctionI) customAlloc}. */
    public static void ncustomAlloc(long struct, LZ4FAllocFunctionI value) { memPutAddress(struct + LZ4FCustomMem.CUSTOMALLOC, value.address()); }
    /** Unsafe version of {@link #customCalloc(LZ4FCallocFunctionI) customCalloc}. */
    public static void ncustomCalloc(long struct, @Nullable LZ4FCallocFunctionI value) { memPutAddress(struct + LZ4FCustomMem.CUSTOMCALLOC, memAddressSafe(value)); }
    /** Unsafe version of {@link #customFree(LZ4FFreeFunctionI) customFree}. */
    public static void ncustomFree(long struct, LZ4FFreeFunctionI value) { memPutAddress(struct + LZ4FCustomMem.CUSTOMFREE, value.address()); }
    /** Unsafe version of {@link #opaqueState(long) opaqueState}. */
    public static void nopaqueState(long struct, long value) { memPutAddress(struct + LZ4FCustomMem.OPAQUESTATE, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + LZ4FCustomMem.CUSTOMALLOC));
        check(memGetAddress(struct + LZ4FCustomMem.CUSTOMFREE));
        check(memGetAddress(struct + LZ4FCustomMem.OPAQUESTATE));
    }

    // -----------------------------------

    /** An array of {@link LZ4FCustomMem} structs. */
    public static class Buffer extends StructBuffer<LZ4FCustomMem, Buffer> implements NativeResource {

        private static final LZ4FCustomMem ELEMENT_FACTORY = LZ4FCustomMem.create(-1L);

        /**
         * Creates a new {@code LZ4FCustomMem.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LZ4FCustomMem#SIZEOF}, and its mark will be undefined.</p>
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
        protected LZ4FCustomMem getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code customAlloc} field. */
        @NativeType("LZ4F_AllocFunction")
        public LZ4FAllocFunction customAlloc() { return LZ4FCustomMem.ncustomAlloc(address()); }
        /** @return the value of the {@link LZ4FCustomMem#customCalloc} field. */
        @Nullable
        @NativeType("LZ4F_CallocFunction")
        public LZ4FCallocFunction customCalloc() { return LZ4FCustomMem.ncustomCalloc(address()); }
        /** @return the value of the {@code customFree} field. */
        @NativeType("LZ4F_FreeFunction")
        public LZ4FFreeFunction customFree() { return LZ4FCustomMem.ncustomFree(address()); }
        /** @return the value of the {@code opaqueState} field. */
        @NativeType("void *")
        public long opaqueState() { return LZ4FCustomMem.nopaqueState(address()); }

        /** Sets the specified value to the {@code customAlloc} field. */
        public LZ4FCustomMem.Buffer customAlloc(@NativeType("LZ4F_AllocFunction") LZ4FAllocFunctionI value) { LZ4FCustomMem.ncustomAlloc(address(), value); return this; }
        /** Sets the specified value to the {@link LZ4FCustomMem#customCalloc} field. */
        public LZ4FCustomMem.Buffer customCalloc(@Nullable @NativeType("LZ4F_CallocFunction") LZ4FCallocFunctionI value) { LZ4FCustomMem.ncustomCalloc(address(), value); return this; }
        /** Sets the specified value to the {@code customFree} field. */
        public LZ4FCustomMem.Buffer customFree(@NativeType("LZ4F_FreeFunction") LZ4FFreeFunctionI value) { LZ4FCustomMem.ncustomFree(address(), value); return this; }
        /** Sets the specified value to the {@code opaqueState} field. */
        public LZ4FCustomMem.Buffer opaqueState(@NativeType("void *") long value) { LZ4FCustomMem.nopaqueState(address(), value); return this; }

    }

}
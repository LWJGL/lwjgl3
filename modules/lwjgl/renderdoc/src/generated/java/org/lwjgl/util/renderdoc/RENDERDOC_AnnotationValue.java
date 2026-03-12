/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.renderdoc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * union RENDERDOC_AnnotationValue {
 *     bool boolean;
 *     int32_t int32;
 *     int64_t int64;
 *     uint32_t uint32;
 *     uint64_t uint64;
 *     float float32;
 *     double float64;
 *     {@link RENDERDOC_AnnotationVectorValue RENDERDOC_AnnotationVectorValue} vector;
 *     char const * string;
 *     void * apiObject;
 * }</code></pre>
 */
public class RENDERDOC_AnnotationValue extends Struct<RENDERDOC_AnnotationValue> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BOOLEAN,
        INT32,
        INT64,
        UINT32,
        UINT64,
        FLOAT32,
        FLOAT64,
        VECTOR,
        STRING,
        APIOBJECT;

    static {
        Layout layout = __union(
            __member(1),
            __member(4),
            __member(8),
            __member(4),
            __member(8),
            __member(4),
            __member(8),
            __member(RENDERDOC_AnnotationVectorValue.SIZEOF, RENDERDOC_AnnotationVectorValue.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BOOLEAN = layout.offsetof(0);
        INT32 = layout.offsetof(1);
        INT64 = layout.offsetof(2);
        UINT32 = layout.offsetof(3);
        UINT64 = layout.offsetof(4);
        FLOAT32 = layout.offsetof(5);
        FLOAT64 = layout.offsetof(6);
        VECTOR = layout.offsetof(7);
        STRING = layout.offsetof(8);
        APIOBJECT = layout.offsetof(9);
    }

    protected RENDERDOC_AnnotationValue(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected RENDERDOC_AnnotationValue create(long address, @Nullable ByteBuffer container) {
        return new RENDERDOC_AnnotationValue(address, container);
    }

    /**
     * Creates a {@code RENDERDOC_AnnotationValue} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RENDERDOC_AnnotationValue(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code boolean} field. */
    @NativeType("bool")
    public boolean boolean$() { return nboolean$(address()); }
    /** @return the value of the {@code int32} field. */
    @NativeType("int32_t")
    public int int32() { return nint32(address()); }
    /** @return the value of the {@code int64} field. */
    @NativeType("int64_t")
    public long int64() { return nint64(address()); }
    /** @return the value of the {@code uint32} field. */
    @NativeType("uint32_t")
    public int uint32() { return nuint32(address()); }
    /** @return the value of the {@code uint64} field. */
    @NativeType("uint64_t")
    public long uint64() { return nuint64(address()); }
    /** @return the value of the {@code float32} field. */
    public float float32() { return nfloat32(address()); }
    /** @return the value of the {@code float64} field. */
    public double float64() { return nfloat64(address()); }
    /** @return a {@link RENDERDOC_AnnotationVectorValue} view of the {@code vector} field. */
    public RENDERDOC_AnnotationVectorValue vector() { return nvector(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code string} field. */
    @NativeType("char const *")
    public ByteBuffer string() { return nstring(address()); }
    /** @return the null-terminated string pointed to by the {@code string} field. */
    @NativeType("char const *")
    public String stringString() { return nstringString(address()); }
    /** @return the value of the {@code apiObject} field. */
    @NativeType("void *")
    public long apiObject() { return napiObject(address()); }

    /** Sets the specified value to the {@code boolean} field. */
    public RENDERDOC_AnnotationValue boolean$(@NativeType("bool") boolean value) { nboolean$(address(), value); return this; }
    /** Sets the specified value to the {@code int32} field. */
    public RENDERDOC_AnnotationValue int32(@NativeType("int32_t") int value) { nint32(address(), value); return this; }
    /** Sets the specified value to the {@code int64} field. */
    public RENDERDOC_AnnotationValue int64(@NativeType("int64_t") long value) { nint64(address(), value); return this; }
    /** Sets the specified value to the {@code uint32} field. */
    public RENDERDOC_AnnotationValue uint32(@NativeType("uint32_t") int value) { nuint32(address(), value); return this; }
    /** Sets the specified value to the {@code uint64} field. */
    public RENDERDOC_AnnotationValue uint64(@NativeType("uint64_t") long value) { nuint64(address(), value); return this; }
    /** Sets the specified value to the {@code float32} field. */
    public RENDERDOC_AnnotationValue float32(float value) { nfloat32(address(), value); return this; }
    /** Sets the specified value to the {@code float64} field. */
    public RENDERDOC_AnnotationValue float64(double value) { nfloat64(address(), value); return this; }
    /** Copies the specified {@link RENDERDOC_AnnotationVectorValue} to the {@code vector} field. */
    public RENDERDOC_AnnotationValue vector(RENDERDOC_AnnotationVectorValue value) { nvector(address(), value); return this; }
    /** Passes the {@code vector} field to the specified {@link java.util.function.Consumer Consumer}. */
    public RENDERDOC_AnnotationValue vector(java.util.function.Consumer<RENDERDOC_AnnotationVectorValue> consumer) { consumer.accept(vector()); return this; }
    /** Sets the address of the specified encoded string to the {@code string} field. */
    public RENDERDOC_AnnotationValue string(@NativeType("char const *") ByteBuffer value) { nstring(address(), value); return this; }
    /** Sets the specified value to the {@code apiObject} field. */
    public RENDERDOC_AnnotationValue apiObject(@NativeType("void *") long value) { napiObject(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public RENDERDOC_AnnotationValue set(RENDERDOC_AnnotationValue src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code RENDERDOC_AnnotationValue} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RENDERDOC_AnnotationValue malloc() {
        return new RENDERDOC_AnnotationValue(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code RENDERDOC_AnnotationValue} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RENDERDOC_AnnotationValue calloc() {
        return new RENDERDOC_AnnotationValue(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code RENDERDOC_AnnotationValue} instance allocated with {@link BufferUtils}. */
    public static RENDERDOC_AnnotationValue create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new RENDERDOC_AnnotationValue(memAddress(container), container);
    }

    /** Returns a new {@code RENDERDOC_AnnotationValue} instance for the specified memory address. */
    public static RENDERDOC_AnnotationValue create(long address) {
        return new RENDERDOC_AnnotationValue(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable RENDERDOC_AnnotationValue createSafe(long address) {
        return address == NULL ? null : new RENDERDOC_AnnotationValue(address, null);
    }

    /**
     * Returns a new {@link RENDERDOC_AnnotationValue.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RENDERDOC_AnnotationValue.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link RENDERDOC_AnnotationValue.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RENDERDOC_AnnotationValue.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RENDERDOC_AnnotationValue.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static RENDERDOC_AnnotationValue.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link RENDERDOC_AnnotationValue.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static RENDERDOC_AnnotationValue.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static RENDERDOC_AnnotationValue.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code RENDERDOC_AnnotationValue} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RENDERDOC_AnnotationValue malloc(MemoryStack stack) {
        return new RENDERDOC_AnnotationValue(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code RENDERDOC_AnnotationValue} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RENDERDOC_AnnotationValue calloc(MemoryStack stack) {
        return new RENDERDOC_AnnotationValue(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link RENDERDOC_AnnotationValue.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RENDERDOC_AnnotationValue.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RENDERDOC_AnnotationValue.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RENDERDOC_AnnotationValue.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #boolean$}. */
    public static boolean nboolean$(long struct) { return memGetByte(struct + RENDERDOC_AnnotationValue.BOOLEAN) != 0; }
    /** Unsafe version of {@link #int32}. */
    public static int nint32(long struct) { return memGetInt(struct + RENDERDOC_AnnotationValue.INT32); }
    /** Unsafe version of {@link #int64}. */
    public static long nint64(long struct) { return memGetLong(struct + RENDERDOC_AnnotationValue.INT64); }
    /** Unsafe version of {@link #uint32}. */
    public static int nuint32(long struct) { return memGetInt(struct + RENDERDOC_AnnotationValue.UINT32); }
    /** Unsafe version of {@link #uint64}. */
    public static long nuint64(long struct) { return memGetLong(struct + RENDERDOC_AnnotationValue.UINT64); }
    /** Unsafe version of {@link #float32}. */
    public static float nfloat32(long struct) { return memGetFloat(struct + RENDERDOC_AnnotationValue.FLOAT32); }
    /** Unsafe version of {@link #float64}. */
    public static double nfloat64(long struct) { return memGetDouble(struct + RENDERDOC_AnnotationValue.FLOAT64); }
    /** Unsafe version of {@link #vector}. */
    public static RENDERDOC_AnnotationVectorValue nvector(long struct) { return RENDERDOC_AnnotationVectorValue.create(struct + RENDERDOC_AnnotationValue.VECTOR); }
    /** Unsafe version of {@link #string}. */
    public static ByteBuffer nstring(long struct) { return memByteBufferNT1(memGetAddress(struct + RENDERDOC_AnnotationValue.STRING)); }
    /** Unsafe version of {@link #stringString}. */
    public static String nstringString(long struct) { return memUTF8(memGetAddress(struct + RENDERDOC_AnnotationValue.STRING)); }
    /** Unsafe version of {@link #apiObject}. */
    public static long napiObject(long struct) { return memGetAddress(struct + RENDERDOC_AnnotationValue.APIOBJECT); }

    /** Unsafe version of {@link #boolean$(boolean) boolean$}. */
    public static void nboolean$(long struct, boolean value) { memPutByte(struct + RENDERDOC_AnnotationValue.BOOLEAN, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #int32(int) int32}. */
    public static void nint32(long struct, int value) { memPutInt(struct + RENDERDOC_AnnotationValue.INT32, value); }
    /** Unsafe version of {@link #int64(long) int64}. */
    public static void nint64(long struct, long value) { memPutLong(struct + RENDERDOC_AnnotationValue.INT64, value); }
    /** Unsafe version of {@link #uint32(int) uint32}. */
    public static void nuint32(long struct, int value) { memPutInt(struct + RENDERDOC_AnnotationValue.UINT32, value); }
    /** Unsafe version of {@link #uint64(long) uint64}. */
    public static void nuint64(long struct, long value) { memPutLong(struct + RENDERDOC_AnnotationValue.UINT64, value); }
    /** Unsafe version of {@link #float32(float) float32}. */
    public static void nfloat32(long struct, float value) { memPutFloat(struct + RENDERDOC_AnnotationValue.FLOAT32, value); }
    /** Unsafe version of {@link #float64(double) float64}. */
    public static void nfloat64(long struct, double value) { memPutDouble(struct + RENDERDOC_AnnotationValue.FLOAT64, value); }
    /** Unsafe version of {@link #vector(RENDERDOC_AnnotationVectorValue) vector}. */
    public static void nvector(long struct, RENDERDOC_AnnotationVectorValue value) { memCopy(value.address(), struct + RENDERDOC_AnnotationValue.VECTOR, RENDERDOC_AnnotationVectorValue.SIZEOF); }
    /** Unsafe version of {@link #string(ByteBuffer) string}. */
    public static void nstring(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + RENDERDOC_AnnotationValue.STRING, memAddress(value));
    }
    /** Unsafe version of {@link #apiObject(long) apiObject}. */
    public static void napiObject(long struct, long value) { memPutAddress(struct + RENDERDOC_AnnotationValue.APIOBJECT, check(value)); }

    // -----------------------------------

    /** An array of {@link RENDERDOC_AnnotationValue} structs. */
    public static class Buffer extends StructBuffer<RENDERDOC_AnnotationValue, Buffer> implements NativeResource {

        private static final RENDERDOC_AnnotationValue ELEMENT_FACTORY = RENDERDOC_AnnotationValue.create(-1L);

        /**
         * Creates a new {@code RENDERDOC_AnnotationValue.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RENDERDOC_AnnotationValue#SIZEOF}, and its mark will be undefined.</p>
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
        protected RENDERDOC_AnnotationValue getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code boolean} field. */
        @NativeType("bool")
        public boolean boolean$() { return RENDERDOC_AnnotationValue.nboolean$(address()); }
        /** @return the value of the {@code int32} field. */
        @NativeType("int32_t")
        public int int32() { return RENDERDOC_AnnotationValue.nint32(address()); }
        /** @return the value of the {@code int64} field. */
        @NativeType("int64_t")
        public long int64() { return RENDERDOC_AnnotationValue.nint64(address()); }
        /** @return the value of the {@code uint32} field. */
        @NativeType("uint32_t")
        public int uint32() { return RENDERDOC_AnnotationValue.nuint32(address()); }
        /** @return the value of the {@code uint64} field. */
        @NativeType("uint64_t")
        public long uint64() { return RENDERDOC_AnnotationValue.nuint64(address()); }
        /** @return the value of the {@code float32} field. */
        public float float32() { return RENDERDOC_AnnotationValue.nfloat32(address()); }
        /** @return the value of the {@code float64} field. */
        public double float64() { return RENDERDOC_AnnotationValue.nfloat64(address()); }
        /** @return a {@link RENDERDOC_AnnotationVectorValue} view of the {@code vector} field. */
        public RENDERDOC_AnnotationVectorValue vector() { return RENDERDOC_AnnotationValue.nvector(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code string} field. */
        @NativeType("char const *")
        public ByteBuffer string() { return RENDERDOC_AnnotationValue.nstring(address()); }
        /** @return the null-terminated string pointed to by the {@code string} field. */
        @NativeType("char const *")
        public String stringString() { return RENDERDOC_AnnotationValue.nstringString(address()); }
        /** @return the value of the {@code apiObject} field. */
        @NativeType("void *")
        public long apiObject() { return RENDERDOC_AnnotationValue.napiObject(address()); }

        /** Sets the specified value to the {@code boolean} field. */
        public RENDERDOC_AnnotationValue.Buffer boolean$(@NativeType("bool") boolean value) { RENDERDOC_AnnotationValue.nboolean$(address(), value); return this; }
        /** Sets the specified value to the {@code int32} field. */
        public RENDERDOC_AnnotationValue.Buffer int32(@NativeType("int32_t") int value) { RENDERDOC_AnnotationValue.nint32(address(), value); return this; }
        /** Sets the specified value to the {@code int64} field. */
        public RENDERDOC_AnnotationValue.Buffer int64(@NativeType("int64_t") long value) { RENDERDOC_AnnotationValue.nint64(address(), value); return this; }
        /** Sets the specified value to the {@code uint32} field. */
        public RENDERDOC_AnnotationValue.Buffer uint32(@NativeType("uint32_t") int value) { RENDERDOC_AnnotationValue.nuint32(address(), value); return this; }
        /** Sets the specified value to the {@code uint64} field. */
        public RENDERDOC_AnnotationValue.Buffer uint64(@NativeType("uint64_t") long value) { RENDERDOC_AnnotationValue.nuint64(address(), value); return this; }
        /** Sets the specified value to the {@code float32} field. */
        public RENDERDOC_AnnotationValue.Buffer float32(float value) { RENDERDOC_AnnotationValue.nfloat32(address(), value); return this; }
        /** Sets the specified value to the {@code float64} field. */
        public RENDERDOC_AnnotationValue.Buffer float64(double value) { RENDERDOC_AnnotationValue.nfloat64(address(), value); return this; }
        /** Copies the specified {@link RENDERDOC_AnnotationVectorValue} to the {@code vector} field. */
        public RENDERDOC_AnnotationValue.Buffer vector(RENDERDOC_AnnotationVectorValue value) { RENDERDOC_AnnotationValue.nvector(address(), value); return this; }
        /** Passes the {@code vector} field to the specified {@link java.util.function.Consumer Consumer}. */
        public RENDERDOC_AnnotationValue.Buffer vector(java.util.function.Consumer<RENDERDOC_AnnotationVectorValue> consumer) { consumer.accept(vector()); return this; }
        /** Sets the address of the specified encoded string to the {@code string} field. */
        public RENDERDOC_AnnotationValue.Buffer string(@NativeType("char const *") ByteBuffer value) { RENDERDOC_AnnotationValue.nstring(address(), value); return this; }
        /** Sets the specified value to the {@code apiObject} field. */
        public RENDERDOC_AnnotationValue.Buffer apiObject(@NativeType("void *") long value) { RENDERDOC_AnnotationValue.napiObject(address(), value); return this; }

    }

}
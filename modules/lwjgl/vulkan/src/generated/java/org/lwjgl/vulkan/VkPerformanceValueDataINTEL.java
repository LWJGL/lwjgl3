/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Values returned for the parameters.
 * 
 * <h5>Description</h5>
 * 
 * <p>The correct member of the union is determined by the associated {@code VkPerformanceValueTypeINTEL} value.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPerformanceValueINTEL}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union VkPerformanceValueDataINTEL {
 *     uint32_t {@link #value32};
 *     uint64_t {@link #value64};
 *     float {@link #valueFloat};
 *     VkBool32 {@link #valueBool};
 *     char const * {@link #valueString};
 * }</code></pre>
 */
public class VkPerformanceValueDataINTEL extends Struct<VkPerformanceValueDataINTEL> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VALUE32,
        VALUE64,
        VALUEFLOAT,
        VALUEBOOL,
        VALUESTRING;

    static {
        Layout layout = __union(
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VALUE32 = layout.offsetof(0);
        VALUE64 = layout.offsetof(1);
        VALUEFLOAT = layout.offsetof(2);
        VALUEBOOL = layout.offsetof(3);
        VALUESTRING = layout.offsetof(4);
    }

    protected VkPerformanceValueDataINTEL(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPerformanceValueDataINTEL create(long address, @Nullable ByteBuffer container) {
        return new VkPerformanceValueDataINTEL(address, container);
    }

    /**
     * Creates a {@code VkPerformanceValueDataINTEL} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPerformanceValueDataINTEL(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** represents 32-bit integer data. */
    @NativeType("uint32_t")
    public int value32() { return nvalue32(address()); }
    /** represents 64-bit integer data. */
    @NativeType("uint64_t")
    public long value64() { return nvalue64(address()); }
    /** represents floating-point data. */
    public float valueFloat() { return nvalueFloat(address()); }
    /** represents {@code VkBool32} data. */
    @NativeType("VkBool32")
    public boolean valueBool() { return nvalueBool(address()) != 0; }
    /** represents a pointer to a null-terminated UTF-8 string. */
    @NativeType("char const *")
    public ByteBuffer valueString() { return nvalueString(address()); }
    /** represents a pointer to a null-terminated UTF-8 string. */
    @NativeType("char const *")
    public String valueStringString() { return nvalueStringString(address()); }

    /** Sets the specified value to the {@link #value32} field. */
    public VkPerformanceValueDataINTEL value32(@NativeType("uint32_t") int value) { nvalue32(address(), value); return this; }
    /** Sets the specified value to the {@link #value64} field. */
    public VkPerformanceValueDataINTEL value64(@NativeType("uint64_t") long value) { nvalue64(address(), value); return this; }
    /** Sets the specified value to the {@link #valueFloat} field. */
    public VkPerformanceValueDataINTEL valueFloat(float value) { nvalueFloat(address(), value); return this; }
    /** Sets the specified value to the {@link #valueBool} field. */
    public VkPerformanceValueDataINTEL valueBool(@NativeType("VkBool32") boolean value) { nvalueBool(address(), value ? 1 : 0); return this; }
    /** Sets the address of the specified encoded string to the {@link #valueString} field. */
    public VkPerformanceValueDataINTEL valueString(@NativeType("char const *") ByteBuffer value) { nvalueString(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPerformanceValueDataINTEL set(VkPerformanceValueDataINTEL src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPerformanceValueDataINTEL} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPerformanceValueDataINTEL malloc() {
        return new VkPerformanceValueDataINTEL(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPerformanceValueDataINTEL} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPerformanceValueDataINTEL calloc() {
        return new VkPerformanceValueDataINTEL(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPerformanceValueDataINTEL} instance allocated with {@link BufferUtils}. */
    public static VkPerformanceValueDataINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPerformanceValueDataINTEL(memAddress(container), container);
    }

    /** Returns a new {@code VkPerformanceValueDataINTEL} instance for the specified memory address. */
    public static VkPerformanceValueDataINTEL create(long address) {
        return new VkPerformanceValueDataINTEL(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPerformanceValueDataINTEL createSafe(long address) {
        return address == NULL ? null : new VkPerformanceValueDataINTEL(address, null);
    }

    /**
     * Returns a new {@link VkPerformanceValueDataINTEL.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceValueDataINTEL.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceValueDataINTEL.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceValueDataINTEL.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceValueDataINTEL.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceValueDataINTEL.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPerformanceValueDataINTEL.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPerformanceValueDataINTEL.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPerformanceValueDataINTEL.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueDataINTEL mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueDataINTEL callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueDataINTEL mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueDataINTEL callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueDataINTEL.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueDataINTEL.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueDataINTEL.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueDataINTEL.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPerformanceValueDataINTEL} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceValueDataINTEL malloc(MemoryStack stack) {
        return new VkPerformanceValueDataINTEL(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPerformanceValueDataINTEL} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceValueDataINTEL calloc(MemoryStack stack) {
        return new VkPerformanceValueDataINTEL(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPerformanceValueDataINTEL.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceValueDataINTEL.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceValueDataINTEL.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceValueDataINTEL.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #value32}. */
    public static int nvalue32(long struct) { return UNSAFE.getInt(null, struct + VkPerformanceValueDataINTEL.VALUE32); }
    /** Unsafe version of {@link #value64}. */
    public static long nvalue64(long struct) { return UNSAFE.getLong(null, struct + VkPerformanceValueDataINTEL.VALUE64); }
    /** Unsafe version of {@link #valueFloat}. */
    public static float nvalueFloat(long struct) { return UNSAFE.getFloat(null, struct + VkPerformanceValueDataINTEL.VALUEFLOAT); }
    /** Unsafe version of {@link #valueBool}. */
    public static int nvalueBool(long struct) { return UNSAFE.getInt(null, struct + VkPerformanceValueDataINTEL.VALUEBOOL); }
    /** Unsafe version of {@link #valueString}. */
    public static ByteBuffer nvalueString(long struct) { return memByteBufferNT1(memGetAddress(struct + VkPerformanceValueDataINTEL.VALUESTRING)); }
    /** Unsafe version of {@link #valueStringString}. */
    public static String nvalueStringString(long struct) { return memUTF8(memGetAddress(struct + VkPerformanceValueDataINTEL.VALUESTRING)); }

    /** Unsafe version of {@link #value32(int) value32}. */
    public static void nvalue32(long struct, int value) { UNSAFE.putInt(null, struct + VkPerformanceValueDataINTEL.VALUE32, value); }
    /** Unsafe version of {@link #value64(long) value64}. */
    public static void nvalue64(long struct, long value) { UNSAFE.putLong(null, struct + VkPerformanceValueDataINTEL.VALUE64, value); }
    /** Unsafe version of {@link #valueFloat(float) valueFloat}. */
    public static void nvalueFloat(long struct, float value) { UNSAFE.putFloat(null, struct + VkPerformanceValueDataINTEL.VALUEFLOAT, value); }
    /** Unsafe version of {@link #valueBool(boolean) valueBool}. */
    public static void nvalueBool(long struct, int value) { UNSAFE.putInt(null, struct + VkPerformanceValueDataINTEL.VALUEBOOL, value); }
    /** Unsafe version of {@link #valueString(ByteBuffer) valueString}. */
    public static void nvalueString(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + VkPerformanceValueDataINTEL.VALUESTRING, memAddress(value));
    }

    // -----------------------------------

    /** An array of {@link VkPerformanceValueDataINTEL} structs. */
    public static class Buffer extends StructBuffer<VkPerformanceValueDataINTEL, Buffer> implements NativeResource {

        private static final VkPerformanceValueDataINTEL ELEMENT_FACTORY = VkPerformanceValueDataINTEL.create(-1L);

        /**
         * Creates a new {@code VkPerformanceValueDataINTEL.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPerformanceValueDataINTEL#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPerformanceValueDataINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPerformanceValueDataINTEL#value32} field. */
        @NativeType("uint32_t")
        public int value32() { return VkPerformanceValueDataINTEL.nvalue32(address()); }
        /** @return the value of the {@link VkPerformanceValueDataINTEL#value64} field. */
        @NativeType("uint64_t")
        public long value64() { return VkPerformanceValueDataINTEL.nvalue64(address()); }
        /** @return the value of the {@link VkPerformanceValueDataINTEL#valueFloat} field. */
        public float valueFloat() { return VkPerformanceValueDataINTEL.nvalueFloat(address()); }
        /** @return the value of the {@link VkPerformanceValueDataINTEL#valueBool} field. */
        @NativeType("VkBool32")
        public boolean valueBool() { return VkPerformanceValueDataINTEL.nvalueBool(address()) != 0; }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link VkPerformanceValueDataINTEL#valueString} field. */
        @NativeType("char const *")
        public ByteBuffer valueString() { return VkPerformanceValueDataINTEL.nvalueString(address()); }
        /** @return the null-terminated string pointed to by the {@link VkPerformanceValueDataINTEL#valueString} field. */
        @NativeType("char const *")
        public String valueStringString() { return VkPerformanceValueDataINTEL.nvalueStringString(address()); }

        /** Sets the specified value to the {@link VkPerformanceValueDataINTEL#value32} field. */
        public VkPerformanceValueDataINTEL.Buffer value32(@NativeType("uint32_t") int value) { VkPerformanceValueDataINTEL.nvalue32(address(), value); return this; }
        /** Sets the specified value to the {@link VkPerformanceValueDataINTEL#value64} field. */
        public VkPerformanceValueDataINTEL.Buffer value64(@NativeType("uint64_t") long value) { VkPerformanceValueDataINTEL.nvalue64(address(), value); return this; }
        /** Sets the specified value to the {@link VkPerformanceValueDataINTEL#valueFloat} field. */
        public VkPerformanceValueDataINTEL.Buffer valueFloat(float value) { VkPerformanceValueDataINTEL.nvalueFloat(address(), value); return this; }
        /** Sets the specified value to the {@link VkPerformanceValueDataINTEL#valueBool} field. */
        public VkPerformanceValueDataINTEL.Buffer valueBool(@NativeType("VkBool32") boolean value) { VkPerformanceValueDataINTEL.nvalueBool(address(), value ? 1 : 0); return this; }
        /** Sets the address of the specified encoded string to the {@link VkPerformanceValueDataINTEL#valueString} field. */
        public VkPerformanceValueDataINTEL.Buffer valueString(@NativeType("char const *") ByteBuffer value) { VkPerformanceValueDataINTEL.nvalueString(address(), value); return this; }

    }

}
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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Container for value and types of parameters that can be queried.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be a valid {@code VkPerformanceValueTypeINTEL} value</li>
 * <li>If {@code type} is {@link INTELPerformanceQuery#VK_PERFORMANCE_VALUE_TYPE_STRING_INTEL PERFORMANCE_VALUE_TYPE_STRING_INTEL}, the {@code valueString} member of {@code data} <b>must</b> be a null-terminated UTF-8 string</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPerformanceValueDataINTEL}, {@link INTELPerformanceQuery#vkGetPerformanceParameterINTEL GetPerformanceParameterINTEL}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPerformanceValueINTEL {
 *     VkPerformanceValueTypeINTEL {@link #type};
 *     {@link VkPerformanceValueDataINTEL VkPerformanceValueDataINTEL} {@link #data};
 * }</code></pre>
 */
public class VkPerformanceValueINTEL extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        DATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(VkPerformanceValueDataINTEL.SIZEOF, VkPerformanceValueDataINTEL.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        DATA = layout.offsetof(1);
    }

    /**
     * Creates a {@code VkPerformanceValueINTEL} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPerformanceValueINTEL(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkPerformanceValueTypeINTEL} value specifying the type of the returned data. */
    @NativeType("VkPerformanceValueTypeINTEL")
    public int type() { return ntype(address()); }
    /** a {@link VkPerformanceValueDataINTEL} union specifying the value of the returned data. */
    public VkPerformanceValueDataINTEL data() { return ndata(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public VkPerformanceValueINTEL type(@NativeType("VkPerformanceValueTypeINTEL") int value) { ntype(address(), value); return this; }
    /** Copies the specified {@link VkPerformanceValueDataINTEL} to the {@link #data} field. */
    public VkPerformanceValueINTEL data(VkPerformanceValueDataINTEL value) { ndata(address(), value); return this; }
    /** Passes the {@link #data} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkPerformanceValueINTEL data(java.util.function.Consumer<VkPerformanceValueDataINTEL> consumer) { consumer.accept(data()); return this; }

    /** Initializes this struct with the specified values. */
    public VkPerformanceValueINTEL set(
        int type,
        VkPerformanceValueDataINTEL data
    ) {
        type(type);
        data(data);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPerformanceValueINTEL set(VkPerformanceValueINTEL src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPerformanceValueINTEL} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPerformanceValueINTEL malloc() {
        return wrap(VkPerformanceValueINTEL.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPerformanceValueINTEL} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPerformanceValueINTEL calloc() {
        return wrap(VkPerformanceValueINTEL.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPerformanceValueINTEL} instance allocated with {@link BufferUtils}. */
    public static VkPerformanceValueINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPerformanceValueINTEL.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPerformanceValueINTEL} instance for the specified memory address. */
    public static VkPerformanceValueINTEL create(long address) {
        return wrap(VkPerformanceValueINTEL.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPerformanceValueINTEL createSafe(long address) {
        return address == NULL ? null : wrap(VkPerformanceValueINTEL.class, address);
    }

    /**
     * Returns a new {@link VkPerformanceValueINTEL.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceValueINTEL.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceValueINTEL.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceValueINTEL.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceValueINTEL.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceValueINTEL.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPerformanceValueINTEL.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPerformanceValueINTEL.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPerformanceValueINTEL.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueINTEL mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueINTEL callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueINTEL mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueINTEL callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueINTEL.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueINTEL.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueINTEL.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueINTEL.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPerformanceValueINTEL} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceValueINTEL malloc(MemoryStack stack) {
        return wrap(VkPerformanceValueINTEL.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPerformanceValueINTEL} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceValueINTEL calloc(MemoryStack stack) {
        return wrap(VkPerformanceValueINTEL.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPerformanceValueINTEL.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceValueINTEL.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceValueINTEL.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceValueINTEL.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + VkPerformanceValueINTEL.TYPE); }
    /** Unsafe version of {@link #data}. */
    public static VkPerformanceValueDataINTEL ndata(long struct) { return VkPerformanceValueDataINTEL.create(struct + VkPerformanceValueINTEL.DATA); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + VkPerformanceValueINTEL.TYPE, value); }
    /** Unsafe version of {@link #data(VkPerformanceValueDataINTEL) data}. */
    public static void ndata(long struct, VkPerformanceValueDataINTEL value) { memCopy(value.address(), struct + VkPerformanceValueINTEL.DATA, VkPerformanceValueDataINTEL.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkPerformanceValueINTEL} structs. */
    public static class Buffer extends StructBuffer<VkPerformanceValueINTEL, Buffer> implements NativeResource {

        private static final VkPerformanceValueINTEL ELEMENT_FACTORY = VkPerformanceValueINTEL.create(-1L);

        /**
         * Creates a new {@code VkPerformanceValueINTEL.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPerformanceValueINTEL#SIZEOF}, and its mark will be undefined.
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
        protected VkPerformanceValueINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPerformanceValueINTEL#type} field. */
        @NativeType("VkPerformanceValueTypeINTEL")
        public int type() { return VkPerformanceValueINTEL.ntype(address()); }
        /** @return a {@link VkPerformanceValueDataINTEL} view of the {@link VkPerformanceValueINTEL#data} field. */
        public VkPerformanceValueDataINTEL data() { return VkPerformanceValueINTEL.ndata(address()); }

        /** Sets the specified value to the {@link VkPerformanceValueINTEL#type} field. */
        public VkPerformanceValueINTEL.Buffer type(@NativeType("VkPerformanceValueTypeINTEL") int value) { VkPerformanceValueINTEL.ntype(address(), value); return this; }
        /** Copies the specified {@link VkPerformanceValueDataINTEL} to the {@link VkPerformanceValueINTEL#data} field. */
        public VkPerformanceValueINTEL.Buffer data(VkPerformanceValueDataINTEL value) { VkPerformanceValueINTEL.ndata(address(), value); return this; }
        /** Passes the {@link VkPerformanceValueINTEL#data} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkPerformanceValueINTEL.Buffer data(java.util.function.Consumer<VkPerformanceValueDataINTEL> consumer) { consumer.accept(data()); return this; }

    }

}
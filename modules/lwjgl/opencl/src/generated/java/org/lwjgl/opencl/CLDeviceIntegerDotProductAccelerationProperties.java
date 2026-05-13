/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct cl_device_integer_dot_product_acceleration_properties {
 *     cl_bool signed_accelerated;
 *     cl_bool unsigned_accelerated;
 *     cl_bool mixed_signedness_accelerated;
 *     cl_bool accumulating_saturating_signed_accelerated;
 *     cl_bool accumulating_saturating_unsigned_accelerated;
 *     cl_bool accumulating_saturating_mixed_signedness_accelerated;
 * }}</pre>
 */
@NativeType("struct cl_device_integer_dot_product_acceleration_properties")
public class CLDeviceIntegerDotProductAccelerationProperties extends Struct<CLDeviceIntegerDotProductAccelerationProperties> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SIGNED_ACCELERATED,
        UNSIGNED_ACCELERATED,
        MIXED_SIGNEDNESS_ACCELERATED,
        ACCUMULATING_SATURATING_SIGNED_ACCELERATED,
        ACCUMULATING_SATURATING_UNSIGNED_ACCELERATED,
        ACCUMULATING_SATURATING_MIXED_SIGNEDNESS_ACCELERATED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIGNED_ACCELERATED = layout.offsetof(0);
        UNSIGNED_ACCELERATED = layout.offsetof(1);
        MIXED_SIGNEDNESS_ACCELERATED = layout.offsetof(2);
        ACCUMULATING_SATURATING_SIGNED_ACCELERATED = layout.offsetof(3);
        ACCUMULATING_SATURATING_UNSIGNED_ACCELERATED = layout.offsetof(4);
        ACCUMULATING_SATURATING_MIXED_SIGNEDNESS_ACCELERATED = layout.offsetof(5);
    }

    protected CLDeviceIntegerDotProductAccelerationProperties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CLDeviceIntegerDotProductAccelerationProperties create(long address, @Nullable ByteBuffer container) {
        return new CLDeviceIntegerDotProductAccelerationProperties(address, container);
    }

    /**
     * Creates a {@code CLDeviceIntegerDotProductAccelerationProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CLDeviceIntegerDotProductAccelerationProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code signed_accelerated} field. */
    @NativeType("cl_bool")
    public boolean signed_accelerated() { return nsigned_accelerated(address()) != 0; }
    /** @return the value of the {@code unsigned_accelerated} field. */
    @NativeType("cl_bool")
    public boolean unsigned_accelerated() { return nunsigned_accelerated(address()) != 0; }
    /** @return the value of the {@code mixed_signedness_accelerated} field. */
    @NativeType("cl_bool")
    public boolean mixed_signedness_accelerated() { return nmixed_signedness_accelerated(address()) != 0; }
    /** @return the value of the {@code accumulating_saturating_signed_accelerated} field. */
    @NativeType("cl_bool")
    public boolean accumulating_saturating_signed_accelerated() { return naccumulating_saturating_signed_accelerated(address()) != 0; }
    /** @return the value of the {@code accumulating_saturating_unsigned_accelerated} field. */
    @NativeType("cl_bool")
    public boolean accumulating_saturating_unsigned_accelerated() { return naccumulating_saturating_unsigned_accelerated(address()) != 0; }
    /** @return the value of the {@code accumulating_saturating_mixed_signedness_accelerated} field. */
    @NativeType("cl_bool")
    public boolean accumulating_saturating_mixed_signedness_accelerated() { return naccumulating_saturating_mixed_signedness_accelerated(address()) != 0; }

    /** Sets the specified value to the {@code signed_accelerated} field. */
    public CLDeviceIntegerDotProductAccelerationProperties signed_accelerated(@NativeType("cl_bool") boolean value) { nsigned_accelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code unsigned_accelerated} field. */
    public CLDeviceIntegerDotProductAccelerationProperties unsigned_accelerated(@NativeType("cl_bool") boolean value) { nunsigned_accelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code mixed_signedness_accelerated} field. */
    public CLDeviceIntegerDotProductAccelerationProperties mixed_signedness_accelerated(@NativeType("cl_bool") boolean value) { nmixed_signedness_accelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code accumulating_saturating_signed_accelerated} field. */
    public CLDeviceIntegerDotProductAccelerationProperties accumulating_saturating_signed_accelerated(@NativeType("cl_bool") boolean value) { naccumulating_saturating_signed_accelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code accumulating_saturating_unsigned_accelerated} field. */
    public CLDeviceIntegerDotProductAccelerationProperties accumulating_saturating_unsigned_accelerated(@NativeType("cl_bool") boolean value) { naccumulating_saturating_unsigned_accelerated(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code accumulating_saturating_mixed_signedness_accelerated} field. */
    public CLDeviceIntegerDotProductAccelerationProperties accumulating_saturating_mixed_signedness_accelerated(@NativeType("cl_bool") boolean value) { naccumulating_saturating_mixed_signedness_accelerated(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public CLDeviceIntegerDotProductAccelerationProperties set(
        boolean signed_accelerated,
        boolean unsigned_accelerated,
        boolean mixed_signedness_accelerated,
        boolean accumulating_saturating_signed_accelerated,
        boolean accumulating_saturating_unsigned_accelerated,
        boolean accumulating_saturating_mixed_signedness_accelerated
    ) {
        signed_accelerated(signed_accelerated);
        unsigned_accelerated(unsigned_accelerated);
        mixed_signedness_accelerated(mixed_signedness_accelerated);
        accumulating_saturating_signed_accelerated(accumulating_saturating_signed_accelerated);
        accumulating_saturating_unsigned_accelerated(accumulating_saturating_unsigned_accelerated);
        accumulating_saturating_mixed_signedness_accelerated(accumulating_saturating_mixed_signedness_accelerated);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CLDeviceIntegerDotProductAccelerationProperties set(CLDeviceIntegerDotProductAccelerationProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CLDeviceIntegerDotProductAccelerationProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CLDeviceIntegerDotProductAccelerationProperties malloc() {
        return new CLDeviceIntegerDotProductAccelerationProperties(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CLDeviceIntegerDotProductAccelerationProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CLDeviceIntegerDotProductAccelerationProperties calloc() {
        return new CLDeviceIntegerDotProductAccelerationProperties(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CLDeviceIntegerDotProductAccelerationProperties} instance allocated with {@link BufferUtils}. */
    public static CLDeviceIntegerDotProductAccelerationProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CLDeviceIntegerDotProductAccelerationProperties(memAddress(container), container);
    }

    /** Returns a new {@code CLDeviceIntegerDotProductAccelerationProperties} instance for the specified memory address. */
    public static CLDeviceIntegerDotProductAccelerationProperties create(long address) {
        return new CLDeviceIntegerDotProductAccelerationProperties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CLDeviceIntegerDotProductAccelerationProperties createSafe(long address) {
        return address == NULL ? null : new CLDeviceIntegerDotProductAccelerationProperties(address, null);
    }

    /**
     * Returns a new {@link CLDeviceIntegerDotProductAccelerationProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLDeviceIntegerDotProductAccelerationProperties.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CLDeviceIntegerDotProductAccelerationProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLDeviceIntegerDotProductAccelerationProperties.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLDeviceIntegerDotProductAccelerationProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CLDeviceIntegerDotProductAccelerationProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CLDeviceIntegerDotProductAccelerationProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CLDeviceIntegerDotProductAccelerationProperties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CLDeviceIntegerDotProductAccelerationProperties.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CLDeviceIntegerDotProductAccelerationProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CLDeviceIntegerDotProductAccelerationProperties malloc(MemoryStack stack) {
        return new CLDeviceIntegerDotProductAccelerationProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CLDeviceIntegerDotProductAccelerationProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CLDeviceIntegerDotProductAccelerationProperties calloc(MemoryStack stack) {
        return new CLDeviceIntegerDotProductAccelerationProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CLDeviceIntegerDotProductAccelerationProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLDeviceIntegerDotProductAccelerationProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLDeviceIntegerDotProductAccelerationProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLDeviceIntegerDotProductAccelerationProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #signed_accelerated}. */
    public static int nsigned_accelerated(long struct) { return memGetInt(struct + CLDeviceIntegerDotProductAccelerationProperties.SIGNED_ACCELERATED); }
    /** Unsafe version of {@link #unsigned_accelerated}. */
    public static int nunsigned_accelerated(long struct) { return memGetInt(struct + CLDeviceIntegerDotProductAccelerationProperties.UNSIGNED_ACCELERATED); }
    /** Unsafe version of {@link #mixed_signedness_accelerated}. */
    public static int nmixed_signedness_accelerated(long struct) { return memGetInt(struct + CLDeviceIntegerDotProductAccelerationProperties.MIXED_SIGNEDNESS_ACCELERATED); }
    /** Unsafe version of {@link #accumulating_saturating_signed_accelerated}. */
    public static int naccumulating_saturating_signed_accelerated(long struct) { return memGetInt(struct + CLDeviceIntegerDotProductAccelerationProperties.ACCUMULATING_SATURATING_SIGNED_ACCELERATED); }
    /** Unsafe version of {@link #accumulating_saturating_unsigned_accelerated}. */
    public static int naccumulating_saturating_unsigned_accelerated(long struct) { return memGetInt(struct + CLDeviceIntegerDotProductAccelerationProperties.ACCUMULATING_SATURATING_UNSIGNED_ACCELERATED); }
    /** Unsafe version of {@link #accumulating_saturating_mixed_signedness_accelerated}. */
    public static int naccumulating_saturating_mixed_signedness_accelerated(long struct) { return memGetInt(struct + CLDeviceIntegerDotProductAccelerationProperties.ACCUMULATING_SATURATING_MIXED_SIGNEDNESS_ACCELERATED); }

    /** Unsafe version of {@link #signed_accelerated(boolean) signed_accelerated}. */
    public static void nsigned_accelerated(long struct, int value) { memPutInt(struct + CLDeviceIntegerDotProductAccelerationProperties.SIGNED_ACCELERATED, value); }
    /** Unsafe version of {@link #unsigned_accelerated(boolean) unsigned_accelerated}. */
    public static void nunsigned_accelerated(long struct, int value) { memPutInt(struct + CLDeviceIntegerDotProductAccelerationProperties.UNSIGNED_ACCELERATED, value); }
    /** Unsafe version of {@link #mixed_signedness_accelerated(boolean) mixed_signedness_accelerated}. */
    public static void nmixed_signedness_accelerated(long struct, int value) { memPutInt(struct + CLDeviceIntegerDotProductAccelerationProperties.MIXED_SIGNEDNESS_ACCELERATED, value); }
    /** Unsafe version of {@link #accumulating_saturating_signed_accelerated(boolean) accumulating_saturating_signed_accelerated}. */
    public static void naccumulating_saturating_signed_accelerated(long struct, int value) { memPutInt(struct + CLDeviceIntegerDotProductAccelerationProperties.ACCUMULATING_SATURATING_SIGNED_ACCELERATED, value); }
    /** Unsafe version of {@link #accumulating_saturating_unsigned_accelerated(boolean) accumulating_saturating_unsigned_accelerated}. */
    public static void naccumulating_saturating_unsigned_accelerated(long struct, int value) { memPutInt(struct + CLDeviceIntegerDotProductAccelerationProperties.ACCUMULATING_SATURATING_UNSIGNED_ACCELERATED, value); }
    /** Unsafe version of {@link #accumulating_saturating_mixed_signedness_accelerated(boolean) accumulating_saturating_mixed_signedness_accelerated}. */
    public static void naccumulating_saturating_mixed_signedness_accelerated(long struct, int value) { memPutInt(struct + CLDeviceIntegerDotProductAccelerationProperties.ACCUMULATING_SATURATING_MIXED_SIGNEDNESS_ACCELERATED, value); }

    // -----------------------------------

    /** An array of {@link CLDeviceIntegerDotProductAccelerationProperties} structs. */
    public static class Buffer extends StructBuffer<CLDeviceIntegerDotProductAccelerationProperties, Buffer> implements NativeResource {

        private static final CLDeviceIntegerDotProductAccelerationProperties ELEMENT_FACTORY = CLDeviceIntegerDotProductAccelerationProperties.create(-1L);

        /**
         * Creates a new {@code CLDeviceIntegerDotProductAccelerationProperties.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CLDeviceIntegerDotProductAccelerationProperties#SIZEOF}, and its mark will be undefined.</p>
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
        protected CLDeviceIntegerDotProductAccelerationProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code signed_accelerated} field. */
        @NativeType("cl_bool")
        public boolean signed_accelerated() { return CLDeviceIntegerDotProductAccelerationProperties.nsigned_accelerated(address()) != 0; }
        /** @return the value of the {@code unsigned_accelerated} field. */
        @NativeType("cl_bool")
        public boolean unsigned_accelerated() { return CLDeviceIntegerDotProductAccelerationProperties.nunsigned_accelerated(address()) != 0; }
        /** @return the value of the {@code mixed_signedness_accelerated} field. */
        @NativeType("cl_bool")
        public boolean mixed_signedness_accelerated() { return CLDeviceIntegerDotProductAccelerationProperties.nmixed_signedness_accelerated(address()) != 0; }
        /** @return the value of the {@code accumulating_saturating_signed_accelerated} field. */
        @NativeType("cl_bool")
        public boolean accumulating_saturating_signed_accelerated() { return CLDeviceIntegerDotProductAccelerationProperties.naccumulating_saturating_signed_accelerated(address()) != 0; }
        /** @return the value of the {@code accumulating_saturating_unsigned_accelerated} field. */
        @NativeType("cl_bool")
        public boolean accumulating_saturating_unsigned_accelerated() { return CLDeviceIntegerDotProductAccelerationProperties.naccumulating_saturating_unsigned_accelerated(address()) != 0; }
        /** @return the value of the {@code accumulating_saturating_mixed_signedness_accelerated} field. */
        @NativeType("cl_bool")
        public boolean accumulating_saturating_mixed_signedness_accelerated() { return CLDeviceIntegerDotProductAccelerationProperties.naccumulating_saturating_mixed_signedness_accelerated(address()) != 0; }

        /** Sets the specified value to the {@code signed_accelerated} field. */
        public CLDeviceIntegerDotProductAccelerationProperties.Buffer signed_accelerated(@NativeType("cl_bool") boolean value) { CLDeviceIntegerDotProductAccelerationProperties.nsigned_accelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code unsigned_accelerated} field. */
        public CLDeviceIntegerDotProductAccelerationProperties.Buffer unsigned_accelerated(@NativeType("cl_bool") boolean value) { CLDeviceIntegerDotProductAccelerationProperties.nunsigned_accelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code mixed_signedness_accelerated} field. */
        public CLDeviceIntegerDotProductAccelerationProperties.Buffer mixed_signedness_accelerated(@NativeType("cl_bool") boolean value) { CLDeviceIntegerDotProductAccelerationProperties.nmixed_signedness_accelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code accumulating_saturating_signed_accelerated} field. */
        public CLDeviceIntegerDotProductAccelerationProperties.Buffer accumulating_saturating_signed_accelerated(@NativeType("cl_bool") boolean value) { CLDeviceIntegerDotProductAccelerationProperties.naccumulating_saturating_signed_accelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code accumulating_saturating_unsigned_accelerated} field. */
        public CLDeviceIntegerDotProductAccelerationProperties.Buffer accumulating_saturating_unsigned_accelerated(@NativeType("cl_bool") boolean value) { CLDeviceIntegerDotProductAccelerationProperties.naccumulating_saturating_unsigned_accelerated(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code accumulating_saturating_mixed_signedness_accelerated} field. */
        public CLDeviceIntegerDotProductAccelerationProperties.Buffer accumulating_saturating_mixed_signedness_accelerated(@NativeType("cl_bool") boolean value) { CLDeviceIntegerDotProductAccelerationProperties.naccumulating_saturating_mixed_signedness_accelerated(address(), value ? 1 : 0); return this; }

    }

}
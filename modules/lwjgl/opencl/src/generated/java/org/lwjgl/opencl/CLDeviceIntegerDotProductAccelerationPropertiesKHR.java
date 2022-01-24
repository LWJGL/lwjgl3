/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes the exact dot product operations that are accelerated on the device.
 * 
 * <p>A dot product operation is deemed accelerated if its implementation provides a performance advantage over application-provided code composed from
 * elementary instructions and/or other dot product instructions, either because the implementation uses optimized machine code sequences whose
 * generation from application-provided code cannot be guaranteed or because it uses hardware features that cannot otherwise be targeted from
 * application-provided code.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct cl_device_integer_dot_product_acceleration_properties_khr {
 *     cl_bool {@link #signed_accelerated};
 *     cl_bool {@link #unsigned_accelerated};
 *     cl_bool {@link #mixed_signedness_accelerated};
 *     cl_bool {@link #accumulating_saturating_signed_accelerated};
 *     cl_bool {@link #accumulating_saturating_unsigned_accelerated};
 *     cl_bool {@link #accumulating_saturating_mixed_signedness_accelerated};
 * }</code></pre>
 */
@NativeType("struct cl_device_integer_dot_product_acceleration_properties_khr")
public class CLDeviceIntegerDotProductAccelerationPropertiesKHR extends Struct implements NativeResource {

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

    /**
     * Creates a {@code CLDeviceIntegerDotProductAccelerationPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CLDeviceIntegerDotProductAccelerationPropertiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** is {@link CL10#CL_TRUE TRUE} when signed dot product operations are accelerated, {@link CL10#CL_FALSE FALSE} otherwise */
    @NativeType("cl_bool")
    public boolean signed_accelerated() { return nsigned_accelerated(address()) != 0; }
    /** is {@link CL10#CL_TRUE TRUE} when unsigned dot product operations are accelerated, {@link CL10#CL_FALSE FALSE} otherwise */
    @NativeType("cl_bool")
    public boolean unsigned_accelerated() { return nunsigned_accelerated(address()) != 0; }
    /** is {@link CL10#CL_TRUE TRUE} when mixed signedness dot product operations are accelerated, {@link CL10#CL_FALSE FALSE} otherwise */
    @NativeType("cl_bool")
    public boolean mixed_signedness_accelerated() { return nmixed_signedness_accelerated(address()) != 0; }
    /** is {@link CL10#CL_TRUE TRUE} when accumulating saturating signed dot product operations are accelerated, {@link CL10#CL_FALSE FALSE} otherwise */
    @NativeType("cl_bool")
    public boolean accumulating_saturating_signed_accelerated() { return naccumulating_saturating_signed_accelerated(address()) != 0; }
    /** is {@link CL10#CL_TRUE TRUE} when accumulating saturating unsigned dot product operations are accelerated, {@link CL10#CL_FALSE FALSE} otherwise */
    @NativeType("cl_bool")
    public boolean accumulating_saturating_unsigned_accelerated() { return naccumulating_saturating_unsigned_accelerated(address()) != 0; }
    /** is {@link CL10#CL_TRUE TRUE} when accumulating saturating mixed signedness dot product operations are accelerated, {@link CL10#CL_FALSE FALSE} otherwise */
    @NativeType("cl_bool")
    public boolean accumulating_saturating_mixed_signedness_accelerated() { return naccumulating_saturating_mixed_signedness_accelerated(address()) != 0; }

    // -----------------------------------

    /** Returns a new {@code CLDeviceIntegerDotProductAccelerationPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CLDeviceIntegerDotProductAccelerationPropertiesKHR malloc() {
        return wrap(CLDeviceIntegerDotProductAccelerationPropertiesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CLDeviceIntegerDotProductAccelerationPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CLDeviceIntegerDotProductAccelerationPropertiesKHR calloc() {
        return wrap(CLDeviceIntegerDotProductAccelerationPropertiesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CLDeviceIntegerDotProductAccelerationPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static CLDeviceIntegerDotProductAccelerationPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CLDeviceIntegerDotProductAccelerationPropertiesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code CLDeviceIntegerDotProductAccelerationPropertiesKHR} instance for the specified memory address. */
    public static CLDeviceIntegerDotProductAccelerationPropertiesKHR create(long address) {
        return wrap(CLDeviceIntegerDotProductAccelerationPropertiesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLDeviceIntegerDotProductAccelerationPropertiesKHR createSafe(long address) {
        return address == NULL ? null : wrap(CLDeviceIntegerDotProductAccelerationPropertiesKHR.class, address);
    }

    /**
     * Returns a new {@link CLDeviceIntegerDotProductAccelerationPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLDeviceIntegerDotProductAccelerationPropertiesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CLDeviceIntegerDotProductAccelerationPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLDeviceIntegerDotProductAccelerationPropertiesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLDeviceIntegerDotProductAccelerationPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CLDeviceIntegerDotProductAccelerationPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CLDeviceIntegerDotProductAccelerationPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CLDeviceIntegerDotProductAccelerationPropertiesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLDeviceIntegerDotProductAccelerationPropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code CLDeviceIntegerDotProductAccelerationPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CLDeviceIntegerDotProductAccelerationPropertiesKHR malloc(MemoryStack stack) {
        return wrap(CLDeviceIntegerDotProductAccelerationPropertiesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CLDeviceIntegerDotProductAccelerationPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CLDeviceIntegerDotProductAccelerationPropertiesKHR calloc(MemoryStack stack) {
        return wrap(CLDeviceIntegerDotProductAccelerationPropertiesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CLDeviceIntegerDotProductAccelerationPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLDeviceIntegerDotProductAccelerationPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLDeviceIntegerDotProductAccelerationPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLDeviceIntegerDotProductAccelerationPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #signed_accelerated}. */
    public static int nsigned_accelerated(long struct) { return UNSAFE.getInt(null, struct + CLDeviceIntegerDotProductAccelerationPropertiesKHR.SIGNED_ACCELERATED); }
    /** Unsafe version of {@link #unsigned_accelerated}. */
    public static int nunsigned_accelerated(long struct) { return UNSAFE.getInt(null, struct + CLDeviceIntegerDotProductAccelerationPropertiesKHR.UNSIGNED_ACCELERATED); }
    /** Unsafe version of {@link #mixed_signedness_accelerated}. */
    public static int nmixed_signedness_accelerated(long struct) { return UNSAFE.getInt(null, struct + CLDeviceIntegerDotProductAccelerationPropertiesKHR.MIXED_SIGNEDNESS_ACCELERATED); }
    /** Unsafe version of {@link #accumulating_saturating_signed_accelerated}. */
    public static int naccumulating_saturating_signed_accelerated(long struct) { return UNSAFE.getInt(null, struct + CLDeviceIntegerDotProductAccelerationPropertiesKHR.ACCUMULATING_SATURATING_SIGNED_ACCELERATED); }
    /** Unsafe version of {@link #accumulating_saturating_unsigned_accelerated}. */
    public static int naccumulating_saturating_unsigned_accelerated(long struct) { return UNSAFE.getInt(null, struct + CLDeviceIntegerDotProductAccelerationPropertiesKHR.ACCUMULATING_SATURATING_UNSIGNED_ACCELERATED); }
    /** Unsafe version of {@link #accumulating_saturating_mixed_signedness_accelerated}. */
    public static int naccumulating_saturating_mixed_signedness_accelerated(long struct) { return UNSAFE.getInt(null, struct + CLDeviceIntegerDotProductAccelerationPropertiesKHR.ACCUMULATING_SATURATING_MIXED_SIGNEDNESS_ACCELERATED); }

    // -----------------------------------

    /** An array of {@link CLDeviceIntegerDotProductAccelerationPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<CLDeviceIntegerDotProductAccelerationPropertiesKHR, Buffer> implements NativeResource {

        private static final CLDeviceIntegerDotProductAccelerationPropertiesKHR ELEMENT_FACTORY = CLDeviceIntegerDotProductAccelerationPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code CLDeviceIntegerDotProductAccelerationPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CLDeviceIntegerDotProductAccelerationPropertiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected CLDeviceIntegerDotProductAccelerationPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link CLDeviceIntegerDotProductAccelerationPropertiesKHR#signed_accelerated} field. */
        @NativeType("cl_bool")
        public boolean signed_accelerated() { return CLDeviceIntegerDotProductAccelerationPropertiesKHR.nsigned_accelerated(address()) != 0; }
        /** @return the value of the {@link CLDeviceIntegerDotProductAccelerationPropertiesKHR#unsigned_accelerated} field. */
        @NativeType("cl_bool")
        public boolean unsigned_accelerated() { return CLDeviceIntegerDotProductAccelerationPropertiesKHR.nunsigned_accelerated(address()) != 0; }
        /** @return the value of the {@link CLDeviceIntegerDotProductAccelerationPropertiesKHR#mixed_signedness_accelerated} field. */
        @NativeType("cl_bool")
        public boolean mixed_signedness_accelerated() { return CLDeviceIntegerDotProductAccelerationPropertiesKHR.nmixed_signedness_accelerated(address()) != 0; }
        /** @return the value of the {@link CLDeviceIntegerDotProductAccelerationPropertiesKHR#accumulating_saturating_signed_accelerated} field. */
        @NativeType("cl_bool")
        public boolean accumulating_saturating_signed_accelerated() { return CLDeviceIntegerDotProductAccelerationPropertiesKHR.naccumulating_saturating_signed_accelerated(address()) != 0; }
        /** @return the value of the {@link CLDeviceIntegerDotProductAccelerationPropertiesKHR#accumulating_saturating_unsigned_accelerated} field. */
        @NativeType("cl_bool")
        public boolean accumulating_saturating_unsigned_accelerated() { return CLDeviceIntegerDotProductAccelerationPropertiesKHR.naccumulating_saturating_unsigned_accelerated(address()) != 0; }
        /** @return the value of the {@link CLDeviceIntegerDotProductAccelerationPropertiesKHR#accumulating_saturating_mixed_signedness_accelerated} field. */
        @NativeType("cl_bool")
        public boolean accumulating_saturating_mixed_signedness_accelerated() { return CLDeviceIntegerDotProductAccelerationPropertiesKHR.naccumulating_saturating_mixed_signedness_accelerated(address()) != 0; }

    }

}
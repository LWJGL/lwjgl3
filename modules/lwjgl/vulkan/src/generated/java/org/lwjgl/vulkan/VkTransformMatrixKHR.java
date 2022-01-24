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
 * Structure specifying a 3x4 affine transformation matrix.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The first three columns of {@code matrix} <b>must</b> define an invertible 3x3 matrix</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAccelerationStructureInstanceKHR}, {@link VkAccelerationStructureMatrixMotionInstanceNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkTransformMatrixKHR {
 *     float {@link #matrix}[3][4];
 * }</code></pre>
 */
public class VkTransformMatrixKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MATRIX;

    static {
        Layout layout = __struct(
            __array(4, 3 * 4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MATRIX = layout.offsetof(0);
    }

    /**
     * Creates a {@code VkTransformMatrixKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTransformMatrixKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a 3x4 row-major affine transformation matrix. */
    @NativeType("float[3][4]")
    public FloatBuffer matrix() { return nmatrix(address()); }
    /** a 3x4 row-major affine transformation matrix. */
    public float matrix(int index) { return nmatrix(address(), index); }

    /** Copies the specified {@link FloatBuffer} to the {@link #matrix} field. */
    public VkTransformMatrixKHR matrix(@NativeType("float[3][4]") FloatBuffer value) { nmatrix(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #matrix} field. */
    public VkTransformMatrixKHR matrix(int index, float value) { nmatrix(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkTransformMatrixKHR set(VkTransformMatrixKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTransformMatrixKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTransformMatrixKHR malloc() {
        return wrap(VkTransformMatrixKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkTransformMatrixKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTransformMatrixKHR calloc() {
        return wrap(VkTransformMatrixKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkTransformMatrixKHR} instance allocated with {@link BufferUtils}. */
    public static VkTransformMatrixKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkTransformMatrixKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkTransformMatrixKHR} instance for the specified memory address. */
    public static VkTransformMatrixKHR create(long address) {
        return wrap(VkTransformMatrixKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkTransformMatrixKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkTransformMatrixKHR.class, address);
    }

    /**
     * Returns a new {@link VkTransformMatrixKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTransformMatrixKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTransformMatrixKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTransformMatrixKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTransformMatrixKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTransformMatrixKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkTransformMatrixKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTransformMatrixKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkTransformMatrixKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkTransformMatrixKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTransformMatrixKHR malloc(MemoryStack stack) {
        return wrap(VkTransformMatrixKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkTransformMatrixKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTransformMatrixKHR calloc(MemoryStack stack) {
        return wrap(VkTransformMatrixKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkTransformMatrixKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTransformMatrixKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTransformMatrixKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTransformMatrixKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #matrix}. */
    public static FloatBuffer nmatrix(long struct) { return memFloatBuffer(struct + VkTransformMatrixKHR.MATRIX, 3 * 4); }
    /** Unsafe version of {@link #matrix(int) matrix}. */
    public static float nmatrix(long struct, int index) {
        return UNSAFE.getFloat(null, struct + VkTransformMatrixKHR.MATRIX + check(index, 3 * 4) * 4);
    }

    /** Unsafe version of {@link #matrix(FloatBuffer) matrix}. */
    public static void nmatrix(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 3 * 4); }
        memCopy(memAddress(value), struct + VkTransformMatrixKHR.MATRIX, value.remaining() * 4);
    }
    /** Unsafe version of {@link #matrix(int, float) matrix}. */
    public static void nmatrix(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + VkTransformMatrixKHR.MATRIX + check(index, 3 * 4) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link VkTransformMatrixKHR} structs. */
    public static class Buffer extends StructBuffer<VkTransformMatrixKHR, Buffer> implements NativeResource {

        private static final VkTransformMatrixKHR ELEMENT_FACTORY = VkTransformMatrixKHR.create(-1L);

        /**
         * Creates a new {@code VkTransformMatrixKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTransformMatrixKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkTransformMatrixKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FloatBuffer} view of the {@link VkTransformMatrixKHR#matrix} field. */
        @NativeType("float[3][4]")
        public FloatBuffer matrix() { return VkTransformMatrixKHR.nmatrix(address()); }
        /** @return the value at the specified index of the {@link VkTransformMatrixKHR#matrix} field. */
        public float matrix(int index) { return VkTransformMatrixKHR.nmatrix(address(), index); }

        /** Copies the specified {@link FloatBuffer} to the {@link VkTransformMatrixKHR#matrix} field. */
        public VkTransformMatrixKHR.Buffer matrix(@NativeType("float[3][4]") FloatBuffer value) { VkTransformMatrixKHR.nmatrix(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link VkTransformMatrixKHR#matrix} field. */
        public VkTransformMatrixKHR.Buffer matrix(int index, float value) { VkTransformMatrixKHR.nmatrix(address(), index, value); return this; }

    }

}
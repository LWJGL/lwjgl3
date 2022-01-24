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
 * See {@link VkAccelerationStructureInstanceKHR}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAccelerationStructureInstanceNV {
 *     {@link VkTransformMatrixKHR VkTransformMatrixKHR} transform;
 *     uint32_t instanceCustomIndex : 24;
 *     uint32_t mask : 8;
 *     uint32_t instanceShaderBindingTableRecordOffset : 24;
 *     VkGeometryInstanceFlagsKHR flags : 8;
 *     uint64_t accelerationStructureReference;
 * }</code></pre>
 */
public class VkAccelerationStructureInstanceNV extends VkAccelerationStructureInstanceKHR {

    /**
     * Creates a {@code VkAccelerationStructureInstanceNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureInstanceNV(ByteBuffer container) {
        super(container);
    }

    /** Copies the specified {@link VkTransformMatrixKHR} to the {@code transform} field. */
    @Override
    public VkAccelerationStructureInstanceNV transform(VkTransformMatrixKHR value) { ntransform(address(), value); return this; }
    /** Passes the {@code transform} field to the specified {@link java.util.function.Consumer Consumer}. */
    @Override
    public VkAccelerationStructureInstanceNV transform(java.util.function.Consumer<VkTransformMatrixKHR> consumer) { consumer.accept(transform()); return this; }
    /** Sets the specified value to the {@code instanceCustomIndex} field. */
    @Override
    public VkAccelerationStructureInstanceNV instanceCustomIndex(@NativeType("uint32_t") int value) { ninstanceCustomIndex(address(), value); return this; }
    /** Sets the specified value to the {@code mask} field. */
    @Override
    public VkAccelerationStructureInstanceNV mask(@NativeType("uint32_t") int value) { nmask(address(), value); return this; }
    /** Sets the specified value to the {@code instanceShaderBindingTableRecordOffset} field. */
    @Override
    public VkAccelerationStructureInstanceNV instanceShaderBindingTableRecordOffset(@NativeType("uint32_t") int value) { ninstanceShaderBindingTableRecordOffset(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    @Override
    public VkAccelerationStructureInstanceNV flags(@NativeType("VkGeometryInstanceFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code accelerationStructureReference} field. */
    @Override
    public VkAccelerationStructureInstanceNV accelerationStructureReference(@NativeType("uint64_t") long value) { naccelerationStructureReference(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkAccelerationStructureInstanceNV set(
        VkTransformMatrixKHR transform,
        int instanceCustomIndex,
        int mask,
        int instanceShaderBindingTableRecordOffset,
        int flags,
        long accelerationStructureReference
    ) {
        transform(transform);
        instanceCustomIndex(instanceCustomIndex);
        mask(mask);
        instanceShaderBindingTableRecordOffset(instanceShaderBindingTableRecordOffset);
        flags(flags);
        accelerationStructureReference(accelerationStructureReference);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureInstanceNV set(VkAccelerationStructureInstanceNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureInstanceNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureInstanceNV malloc() {
        return wrap(VkAccelerationStructureInstanceNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureInstanceNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureInstanceNV calloc() {
        return wrap(VkAccelerationStructureInstanceNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureInstanceNV} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureInstanceNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAccelerationStructureInstanceNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureInstanceNV} instance for the specified memory address. */
    public static VkAccelerationStructureInstanceNV create(long address) {
        return wrap(VkAccelerationStructureInstanceNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureInstanceNV createSafe(long address) {
        return address == NULL ? null : wrap(VkAccelerationStructureInstanceNV.class, address);
    }

    /**
     * Returns a new {@link VkAccelerationStructureInstanceNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureInstanceNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureInstanceNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureInstanceNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureInstanceNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureInstanceNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAccelerationStructureInstanceNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureInstanceNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureInstanceNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureInstanceNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureInstanceNV malloc(MemoryStack stack) {
        return wrap(VkAccelerationStructureInstanceNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAccelerationStructureInstanceNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureInstanceNV calloc(MemoryStack stack) {
        return wrap(VkAccelerationStructureInstanceNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAccelerationStructureInstanceNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureInstanceNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureInstanceNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureInstanceNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureInstanceNV} structs. */
    public static class Buffer extends VkAccelerationStructureInstanceKHR.Buffer {

        private static final VkAccelerationStructureInstanceNV ELEMENT_FACTORY = VkAccelerationStructureInstanceNV.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureInstanceNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureInstanceNV#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
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
        protected VkAccelerationStructureInstanceNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Copies the specified {@link VkTransformMatrixKHR} to the {@code transform} field. */
        @Override
        public VkAccelerationStructureInstanceNV.Buffer transform(VkTransformMatrixKHR value) { VkAccelerationStructureInstanceNV.ntransform(address(), value); return this; }
        /** Passes the {@code transform} field to the specified {@link java.util.function.Consumer Consumer}. */
        @Override
        public VkAccelerationStructureInstanceNV.Buffer transform(java.util.function.Consumer<VkTransformMatrixKHR> consumer) { consumer.accept(transform()); return this; }
        /** Sets the specified value to the {@code instanceCustomIndex} field. */
        @Override
        public VkAccelerationStructureInstanceNV.Buffer instanceCustomIndex(@NativeType("uint32_t") int value) { VkAccelerationStructureInstanceNV.ninstanceCustomIndex(address(), value); return this; }
        /** Sets the specified value to the {@code mask} field. */
        @Override
        public VkAccelerationStructureInstanceNV.Buffer mask(@NativeType("uint32_t") int value) { VkAccelerationStructureInstanceNV.nmask(address(), value); return this; }
        /** Sets the specified value to the {@code instanceShaderBindingTableRecordOffset} field. */
        @Override
        public VkAccelerationStructureInstanceNV.Buffer instanceShaderBindingTableRecordOffset(@NativeType("uint32_t") int value) { VkAccelerationStructureInstanceNV.ninstanceShaderBindingTableRecordOffset(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        @Override
        public VkAccelerationStructureInstanceNV.Buffer flags(@NativeType("VkGeometryInstanceFlagsKHR") int value) { VkAccelerationStructureInstanceNV.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code accelerationStructureReference} field. */
        @Override
        public VkAccelerationStructureInstanceNV.Buffer accelerationStructureReference(@NativeType("uint64_t") long value) { VkAccelerationStructureInstanceNV.naccelerationStructureReference(address(), value); return this; }

    }

}
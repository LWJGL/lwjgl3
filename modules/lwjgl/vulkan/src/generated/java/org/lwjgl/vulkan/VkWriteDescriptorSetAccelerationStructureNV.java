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
 * Structure specifying acceleration structure descriptor info.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code accelerationStructureCount} <b>must</b> be equal to {@code descriptorCount} in the extended structure</li>
 * <li>Each acceleration structure in {@code pAccelerationStructures} must have been created with {@link NVRayTracing#VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NV ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NV}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVRayTracing#VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV}</li>
 * <li>{@code pAccelerationStructures} <b>must</b> be a valid pointer to an array of {@code accelerationStructureCount} valid {@code VkAccelerationStructureNV} handles</li>
 * <li>{@code accelerationStructureCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code accelerationStructureCount} &ndash; the number of elements in {@code pAccelerationStructures}.</li>
 * <li>{@code pAccelerationStructures} &ndash; are the acceleration structures to update.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkWriteDescriptorSetAccelerationStructureNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t accelerationStructureCount;
 *     VkAccelerationStructureNV const * pAccelerationStructures;
 * }</code></pre>
 */
public class VkWriteDescriptorSetAccelerationStructureNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ACCELERATIONSTRUCTURECOUNT,
        PACCELERATIONSTRUCTURES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACCELERATIONSTRUCTURECOUNT = layout.offsetof(2);
        PACCELERATIONSTRUCTURES = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkWriteDescriptorSetAccelerationStructureNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkWriteDescriptorSetAccelerationStructureNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code accelerationStructureCount} field. */
    @NativeType("uint32_t")
    public int accelerationStructureCount() { return naccelerationStructureCount(address()); }
    /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pAccelerationStructures} field. */
    @NativeType("VkAccelerationStructureNV const *")
    public LongBuffer pAccelerationStructures() { return npAccelerationStructures(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkWriteDescriptorSetAccelerationStructureNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkWriteDescriptorSetAccelerationStructureNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pAccelerationStructures} field. */
    public VkWriteDescriptorSetAccelerationStructureNV pAccelerationStructures(@NativeType("VkAccelerationStructureNV const *") LongBuffer value) { npAccelerationStructures(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkWriteDescriptorSetAccelerationStructureNV set(
        int sType,
        long pNext,
        LongBuffer pAccelerationStructures
    ) {
        sType(sType);
        pNext(pNext);
        pAccelerationStructures(pAccelerationStructures);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkWriteDescriptorSetAccelerationStructureNV set(VkWriteDescriptorSetAccelerationStructureNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkWriteDescriptorSetAccelerationStructureNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkWriteDescriptorSetAccelerationStructureNV malloc() {
        return wrap(VkWriteDescriptorSetAccelerationStructureNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkWriteDescriptorSetAccelerationStructureNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkWriteDescriptorSetAccelerationStructureNV calloc() {
        return wrap(VkWriteDescriptorSetAccelerationStructureNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkWriteDescriptorSetAccelerationStructureNV} instance allocated with {@link BufferUtils}. */
    public static VkWriteDescriptorSetAccelerationStructureNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkWriteDescriptorSetAccelerationStructureNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkWriteDescriptorSetAccelerationStructureNV} instance for the specified memory address. */
    public static VkWriteDescriptorSetAccelerationStructureNV create(long address) {
        return wrap(VkWriteDescriptorSetAccelerationStructureNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkWriteDescriptorSetAccelerationStructureNV createSafe(long address) {
        return address == NULL ? null : wrap(VkWriteDescriptorSetAccelerationStructureNV.class, address);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetAccelerationStructureNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetAccelerationStructureNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetAccelerationStructureNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetAccelerationStructureNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetAccelerationStructureNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetAccelerationStructureNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkWriteDescriptorSetAccelerationStructureNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetAccelerationStructureNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkWriteDescriptorSetAccelerationStructureNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkWriteDescriptorSetAccelerationStructureNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkWriteDescriptorSetAccelerationStructureNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkWriteDescriptorSetAccelerationStructureNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkWriteDescriptorSetAccelerationStructureNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkWriteDescriptorSetAccelerationStructureNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWriteDescriptorSetAccelerationStructureNV mallocStack(MemoryStack stack) {
        return wrap(VkWriteDescriptorSetAccelerationStructureNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkWriteDescriptorSetAccelerationStructureNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkWriteDescriptorSetAccelerationStructureNV callocStack(MemoryStack stack) {
        return wrap(VkWriteDescriptorSetAccelerationStructureNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetAccelerationStructureNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetAccelerationStructureNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetAccelerationStructureNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetAccelerationStructureNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetAccelerationStructureNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetAccelerationStructureNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkWriteDescriptorSetAccelerationStructureNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkWriteDescriptorSetAccelerationStructureNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkWriteDescriptorSetAccelerationStructureNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkWriteDescriptorSetAccelerationStructureNV.PNEXT); }
    /** Unsafe version of {@link #accelerationStructureCount}. */
    public static int naccelerationStructureCount(long struct) { return UNSAFE.getInt(null, struct + VkWriteDescriptorSetAccelerationStructureNV.ACCELERATIONSTRUCTURECOUNT); }
    /** Unsafe version of {@link #pAccelerationStructures() pAccelerationStructures}. */
    public static LongBuffer npAccelerationStructures(long struct) { return memLongBuffer(memGetAddress(struct + VkWriteDescriptorSetAccelerationStructureNV.PACCELERATIONSTRUCTURES), naccelerationStructureCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkWriteDescriptorSetAccelerationStructureNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkWriteDescriptorSetAccelerationStructureNV.PNEXT, value); }
    /** Sets the specified value to the {@code accelerationStructureCount} field of the specified {@code struct}. */
    public static void naccelerationStructureCount(long struct, int value) { UNSAFE.putInt(null, struct + VkWriteDescriptorSetAccelerationStructureNV.ACCELERATIONSTRUCTURECOUNT, value); }
    /** Unsafe version of {@link #pAccelerationStructures(LongBuffer) pAccelerationStructures}. */
    public static void npAccelerationStructures(long struct, LongBuffer value) { memPutAddress(struct + VkWriteDescriptorSetAccelerationStructureNV.PACCELERATIONSTRUCTURES, memAddress(value)); naccelerationStructureCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkWriteDescriptorSetAccelerationStructureNV.PACCELERATIONSTRUCTURES));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkWriteDescriptorSetAccelerationStructureNV} structs. */
    public static class Buffer extends StructBuffer<VkWriteDescriptorSetAccelerationStructureNV, Buffer> implements NativeResource {

        private static final VkWriteDescriptorSetAccelerationStructureNV ELEMENT_FACTORY = VkWriteDescriptorSetAccelerationStructureNV.create(-1L);

        /**
         * Creates a new {@code VkWriteDescriptorSetAccelerationStructureNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkWriteDescriptorSetAccelerationStructureNV#SIZEOF}, and its mark will be undefined.
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
        protected VkWriteDescriptorSetAccelerationStructureNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkWriteDescriptorSetAccelerationStructureNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkWriteDescriptorSetAccelerationStructureNV.npNext(address()); }
        /** Returns the value of the {@code accelerationStructureCount} field. */
        @NativeType("uint32_t")
        public int accelerationStructureCount() { return VkWriteDescriptorSetAccelerationStructureNV.naccelerationStructureCount(address()); }
        /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pAccelerationStructures} field. */
        @NativeType("VkAccelerationStructureNV const *")
        public LongBuffer pAccelerationStructures() { return VkWriteDescriptorSetAccelerationStructureNV.npAccelerationStructures(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkWriteDescriptorSetAccelerationStructureNV.Buffer sType(@NativeType("VkStructureType") int value) { VkWriteDescriptorSetAccelerationStructureNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkWriteDescriptorSetAccelerationStructureNV.Buffer pNext(@NativeType("void const *") long value) { VkWriteDescriptorSetAccelerationStructureNV.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pAccelerationStructures} field. */
        public VkWriteDescriptorSetAccelerationStructureNV.Buffer pAccelerationStructures(@NativeType("VkAccelerationStructureNV const *") LongBuffer value) { VkWriteDescriptorSetAccelerationStructureNV.npAccelerationStructures(address(), value); return this; }

    }

}
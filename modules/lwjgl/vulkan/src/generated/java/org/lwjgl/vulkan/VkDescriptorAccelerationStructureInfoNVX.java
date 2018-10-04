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
 * Structure specifying acceleration to query for memory requirements.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code accelerationStructureCount} <b>must</b> be equal to descriptorCount in the extended structure.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVXRaytracing#VK_STRUCTURE_TYPE_DESCRIPTOR_ACCELERATION_STRUCTURE_INFO_NVX STRUCTURE_TYPE_DESCRIPTOR_ACCELERATION_STRUCTURE_INFO_NVX}</li>
 * <li>{@code pAccelerationStructures} <b>must</b> be a valid pointer to an array of {@code accelerationStructureCount} valid {@code VkAccelerationStructureNVX} handles</li>
 * <li>{@code accelerationStructureCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code accelerationStructureCount} &ndash; the number of elements in pAccelerationStructures</li>
 * <li>{@code pAccelerationStructures} &ndash; are the acceleration structures to update</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDescriptorAccelerationStructureInfoNVX {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t accelerationStructureCount;
 *     VkAccelerationStructureNVX const * pAccelerationStructures;
 * }</code></pre>
 */
public class VkDescriptorAccelerationStructureInfoNVX extends Struct implements NativeResource {

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
     * Creates a {@link VkDescriptorAccelerationStructureInfoNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorAccelerationStructureInfoNVX(ByteBuffer container) {
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
    @NativeType("VkAccelerationStructureNVX const *")
    public LongBuffer pAccelerationStructures() { return npAccelerationStructures(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDescriptorAccelerationStructureInfoNVX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDescriptorAccelerationStructureInfoNVX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pAccelerationStructures} field. */
    public VkDescriptorAccelerationStructureInfoNVX pAccelerationStructures(@NativeType("VkAccelerationStructureNVX const *") LongBuffer value) { npAccelerationStructures(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorAccelerationStructureInfoNVX set(
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
    public VkDescriptorAccelerationStructureInfoNVX set(VkDescriptorAccelerationStructureInfoNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkDescriptorAccelerationStructureInfoNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorAccelerationStructureInfoNVX malloc() {
        return wrap(VkDescriptorAccelerationStructureInfoNVX.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkDescriptorAccelerationStructureInfoNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorAccelerationStructureInfoNVX calloc() {
        return wrap(VkDescriptorAccelerationStructureInfoNVX.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkDescriptorAccelerationStructureInfoNVX} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorAccelerationStructureInfoNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDescriptorAccelerationStructureInfoNVX.class, memAddress(container), container);
    }

    /** Returns a new {@link VkDescriptorAccelerationStructureInfoNVX} instance for the specified memory address. */
    public static VkDescriptorAccelerationStructureInfoNVX create(long address) {
        return wrap(VkDescriptorAccelerationStructureInfoNVX.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorAccelerationStructureInfoNVX createSafe(long address) {
        return address == NULL ? null : wrap(VkDescriptorAccelerationStructureInfoNVX.class, address);
    }

    /**
     * Returns a new {@link VkDescriptorAccelerationStructureInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorAccelerationStructureInfoNVX.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorAccelerationStructureInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorAccelerationStructureInfoNVX.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorAccelerationStructureInfoNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorAccelerationStructureInfoNVX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDescriptorAccelerationStructureInfoNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorAccelerationStructureInfoNVX.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorAccelerationStructureInfoNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkDescriptorAccelerationStructureInfoNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDescriptorAccelerationStructureInfoNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkDescriptorAccelerationStructureInfoNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDescriptorAccelerationStructureInfoNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorAccelerationStructureInfoNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorAccelerationStructureInfoNVX mallocStack(MemoryStack stack) {
        return wrap(VkDescriptorAccelerationStructureInfoNVX.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorAccelerationStructureInfoNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorAccelerationStructureInfoNVX callocStack(MemoryStack stack) {
        return wrap(VkDescriptorAccelerationStructureInfoNVX.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorAccelerationStructureInfoNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorAccelerationStructureInfoNVX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorAccelerationStructureInfoNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorAccelerationStructureInfoNVX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorAccelerationStructureInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorAccelerationStructureInfoNVX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorAccelerationStructureInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorAccelerationStructureInfoNVX.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorAccelerationStructureInfoNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorAccelerationStructureInfoNVX.PNEXT); }
    /** Unsafe version of {@link #accelerationStructureCount}. */
    public static int naccelerationStructureCount(long struct) { return UNSAFE.getInt(null, struct + VkDescriptorAccelerationStructureInfoNVX.ACCELERATIONSTRUCTURECOUNT); }
    /** Unsafe version of {@link #pAccelerationStructures() pAccelerationStructures}. */
    public static LongBuffer npAccelerationStructures(long struct) { return memLongBuffer(memGetAddress(struct + VkDescriptorAccelerationStructureInfoNVX.PACCELERATIONSTRUCTURES), naccelerationStructureCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorAccelerationStructureInfoNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorAccelerationStructureInfoNVX.PNEXT, value); }
    /** Sets the specified value to the {@code accelerationStructureCount} field of the specified {@code struct}. */
    public static void naccelerationStructureCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDescriptorAccelerationStructureInfoNVX.ACCELERATIONSTRUCTURECOUNT, value); }
    /** Unsafe version of {@link #pAccelerationStructures(LongBuffer) pAccelerationStructures}. */
    public static void npAccelerationStructures(long struct, LongBuffer value) { memPutAddress(struct + VkDescriptorAccelerationStructureInfoNVX.PACCELERATIONSTRUCTURES, memAddress(value)); naccelerationStructureCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDescriptorAccelerationStructureInfoNVX.PACCELERATIONSTRUCTURES));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkDescriptorAccelerationStructureInfoNVX} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorAccelerationStructureInfoNVX, Buffer> implements NativeResource {

        private static final VkDescriptorAccelerationStructureInfoNVX ELEMENT_FACTORY = VkDescriptorAccelerationStructureInfoNVX.create(-1L);

        /**
         * Creates a new {@link VkDescriptorAccelerationStructureInfoNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorAccelerationStructureInfoNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorAccelerationStructureInfoNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorAccelerationStructureInfoNVX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDescriptorAccelerationStructureInfoNVX.npNext(address()); }
        /** Returns the value of the {@code accelerationStructureCount} field. */
        @NativeType("uint32_t")
        public int accelerationStructureCount() { return VkDescriptorAccelerationStructureInfoNVX.naccelerationStructureCount(address()); }
        /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pAccelerationStructures} field. */
        @NativeType("VkAccelerationStructureNVX const *")
        public LongBuffer pAccelerationStructures() { return VkDescriptorAccelerationStructureInfoNVX.npAccelerationStructures(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDescriptorAccelerationStructureInfoNVX.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorAccelerationStructureInfoNVX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDescriptorAccelerationStructureInfoNVX.Buffer pNext(@NativeType("void const *") long value) { VkDescriptorAccelerationStructureInfoNVX.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pAccelerationStructures} field. */
        public VkDescriptorAccelerationStructureInfoNVX.Buffer pAccelerationStructures(@NativeType("VkAccelerationStructureNVX const *") LongBuffer value) { VkDescriptorAccelerationStructureInfoNVX.npAccelerationStructures(address(), value); return this; }

    }

}
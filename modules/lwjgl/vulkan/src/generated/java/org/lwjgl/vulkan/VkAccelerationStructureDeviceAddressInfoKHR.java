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
 * Structure specifying the acceleration structure to query an address for.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code accelerationStructure} <b>must</b> be a valid {@code VkAccelerationStructureKHR} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRAccelerationStructure#vkGetAccelerationStructureDeviceAddressKHR GetAccelerationStructureDeviceAddressKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAccelerationStructureDeviceAddressInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkAccelerationStructureKHR {@link #accelerationStructure};
 * }</code></pre>
 */
public class VkAccelerationStructureDeviceAddressInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ACCELERATIONSTRUCTURE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACCELERATIONSTRUCTURE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkAccelerationStructureDeviceAddressInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureDeviceAddressInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** specifies the acceleration structure whose address is being queried. */
    @NativeType("VkAccelerationStructureKHR")
    public long accelerationStructure() { return naccelerationStructure(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkAccelerationStructureDeviceAddressInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkAccelerationStructureDeviceAddressInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #accelerationStructure} field. */
    public VkAccelerationStructureDeviceAddressInfoKHR accelerationStructure(@NativeType("VkAccelerationStructureKHR") long value) { naccelerationStructure(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureDeviceAddressInfoKHR set(
        int sType,
        long pNext,
        long accelerationStructure
    ) {
        sType(sType);
        pNext(pNext);
        accelerationStructure(accelerationStructure);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureDeviceAddressInfoKHR set(VkAccelerationStructureDeviceAddressInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureDeviceAddressInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureDeviceAddressInfoKHR malloc() {
        return wrap(VkAccelerationStructureDeviceAddressInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureDeviceAddressInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureDeviceAddressInfoKHR calloc() {
        return wrap(VkAccelerationStructureDeviceAddressInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAccelerationStructureDeviceAddressInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureDeviceAddressInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAccelerationStructureDeviceAddressInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureDeviceAddressInfoKHR} instance for the specified memory address. */
    public static VkAccelerationStructureDeviceAddressInfoKHR create(long address) {
        return wrap(VkAccelerationStructureDeviceAddressInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureDeviceAddressInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkAccelerationStructureDeviceAddressInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkAccelerationStructureDeviceAddressInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureDeviceAddressInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureDeviceAddressInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureDeviceAddressInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureDeviceAddressInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureDeviceAddressInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAccelerationStructureDeviceAddressInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureDeviceAddressInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAccelerationStructureDeviceAddressInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureDeviceAddressInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkAccelerationStructureDeviceAddressInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkAccelerationStructureDeviceAddressInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkAccelerationStructureDeviceAddressInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkAccelerationStructureDeviceAddressInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureDeviceAddressInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkAccelerationStructureDeviceAddressInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAccelerationStructureDeviceAddressInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureDeviceAddressInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkAccelerationStructureDeviceAddressInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAccelerationStructureDeviceAddressInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureDeviceAddressInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAccelerationStructureDeviceAddressInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureDeviceAddressInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAccelerationStructureDeviceAddressInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureDeviceAddressInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureDeviceAddressInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureDeviceAddressInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAccelerationStructureDeviceAddressInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureDeviceAddressInfoKHR.PNEXT); }
    /** Unsafe version of {@link #accelerationStructure}. */
    public static long naccelerationStructure(long struct) { return UNSAFE.getLong(null, struct + VkAccelerationStructureDeviceAddressInfoKHR.ACCELERATIONSTRUCTURE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAccelerationStructureDeviceAddressInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureDeviceAddressInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #accelerationStructure(long) accelerationStructure}. */
    public static void naccelerationStructure(long struct, long value) { UNSAFE.putLong(null, struct + VkAccelerationStructureDeviceAddressInfoKHR.ACCELERATIONSTRUCTURE, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureDeviceAddressInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureDeviceAddressInfoKHR, Buffer> implements NativeResource {

        private static final VkAccelerationStructureDeviceAddressInfoKHR ELEMENT_FACTORY = VkAccelerationStructureDeviceAddressInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureDeviceAddressInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureDeviceAddressInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkAccelerationStructureDeviceAddressInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAccelerationStructureDeviceAddressInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureDeviceAddressInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkAccelerationStructureDeviceAddressInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureDeviceAddressInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkAccelerationStructureDeviceAddressInfoKHR#accelerationStructure} field. */
        @NativeType("VkAccelerationStructureKHR")
        public long accelerationStructure() { return VkAccelerationStructureDeviceAddressInfoKHR.naccelerationStructure(address()); }

        /** Sets the specified value to the {@link VkAccelerationStructureDeviceAddressInfoKHR#sType} field. */
        public VkAccelerationStructureDeviceAddressInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureDeviceAddressInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureDeviceAddressInfoKHR#pNext} field. */
        public VkAccelerationStructureDeviceAddressInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureDeviceAddressInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkAccelerationStructureDeviceAddressInfoKHR#accelerationStructure} field. */
        public VkAccelerationStructureDeviceAddressInfoKHR.Buffer accelerationStructure(@NativeType("VkAccelerationStructureKHR") long value) { VkAccelerationStructureDeviceAddressInfoKHR.naccelerationStructure(address(), value); return this; }

    }

}
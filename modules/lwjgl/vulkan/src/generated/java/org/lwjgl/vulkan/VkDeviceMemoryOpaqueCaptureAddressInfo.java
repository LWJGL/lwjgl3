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
 * Structure specifying the memory object to query an address for.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code memory} <b>must</b> have been allocated with {@link VK12#VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK12#vkGetDeviceMemoryOpaqueCaptureAddress GetDeviceMemoryOpaqueCaptureAddress}, {@link KHRBufferDeviceAddress#vkGetDeviceMemoryOpaqueCaptureAddressKHR GetDeviceMemoryOpaqueCaptureAddressKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceMemoryOpaqueCaptureAddressInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDeviceMemory {@link #memory};
 * }</code></pre>
 */
public class VkDeviceMemoryOpaqueCaptureAddressInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORY;

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
        MEMORY = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkDeviceMemoryOpaqueCaptureAddressInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceMemoryOpaqueCaptureAddressInfo(ByteBuffer container) {
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
    /** specifies the memory whose address is being queried. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDeviceMemoryOpaqueCaptureAddressInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO} value to the {@link #sType} field. */
    public VkDeviceMemoryOpaqueCaptureAddressInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDeviceMemoryOpaqueCaptureAddressInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #memory} field. */
    public VkDeviceMemoryOpaqueCaptureAddressInfo memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceMemoryOpaqueCaptureAddressInfo set(
        int sType,
        long pNext,
        long memory
    ) {
        sType(sType);
        pNext(pNext);
        memory(memory);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceMemoryOpaqueCaptureAddressInfo set(VkDeviceMemoryOpaqueCaptureAddressInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceMemoryOpaqueCaptureAddressInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceMemoryOpaqueCaptureAddressInfo malloc() {
        return wrap(VkDeviceMemoryOpaqueCaptureAddressInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceMemoryOpaqueCaptureAddressInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceMemoryOpaqueCaptureAddressInfo calloc() {
        return wrap(VkDeviceMemoryOpaqueCaptureAddressInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceMemoryOpaqueCaptureAddressInfo} instance allocated with {@link BufferUtils}. */
    public static VkDeviceMemoryOpaqueCaptureAddressInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceMemoryOpaqueCaptureAddressInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceMemoryOpaqueCaptureAddressInfo} instance for the specified memory address. */
    public static VkDeviceMemoryOpaqueCaptureAddressInfo create(long address) {
        return wrap(VkDeviceMemoryOpaqueCaptureAddressInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceMemoryOpaqueCaptureAddressInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceMemoryOpaqueCaptureAddressInfo.class, address);
    }

    /**
     * Returns a new {@link VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceMemoryOpaqueCaptureAddressInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfo malloc(MemoryStack stack) {
        return wrap(VkDeviceMemoryOpaqueCaptureAddressInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceMemoryOpaqueCaptureAddressInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfo calloc(MemoryStack stack) {
        return wrap(VkDeviceMemoryOpaqueCaptureAddressInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceMemoryOpaqueCaptureAddressInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceMemoryOpaqueCaptureAddressInfo.PNEXT); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return UNSAFE.getLong(null, struct + VkDeviceMemoryOpaqueCaptureAddressInfo.MEMORY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceMemoryOpaqueCaptureAddressInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceMemoryOpaqueCaptureAddressInfo.PNEXT, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { UNSAFE.putLong(null, struct + VkDeviceMemoryOpaqueCaptureAddressInfo.MEMORY, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceMemoryOpaqueCaptureAddressInfo} structs. */
    public static class Buffer extends StructBuffer<VkDeviceMemoryOpaqueCaptureAddressInfo, Buffer> implements NativeResource {

        private static final VkDeviceMemoryOpaqueCaptureAddressInfo ELEMENT_FACTORY = VkDeviceMemoryOpaqueCaptureAddressInfo.create(-1L);

        /**
         * Creates a new {@code VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceMemoryOpaqueCaptureAddressInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceMemoryOpaqueCaptureAddressInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDeviceMemoryOpaqueCaptureAddressInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceMemoryOpaqueCaptureAddressInfo.nsType(address()); }
        /** @return the value of the {@link VkDeviceMemoryOpaqueCaptureAddressInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceMemoryOpaqueCaptureAddressInfo.npNext(address()); }
        /** @return the value of the {@link VkDeviceMemoryOpaqueCaptureAddressInfo#memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkDeviceMemoryOpaqueCaptureAddressInfo.nmemory(address()); }

        /** Sets the specified value to the {@link VkDeviceMemoryOpaqueCaptureAddressInfo#sType} field. */
        public VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceMemoryOpaqueCaptureAddressInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO} value to the {@link VkDeviceMemoryOpaqueCaptureAddressInfo#sType} field. */
        public VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO); }
        /** Sets the specified value to the {@link VkDeviceMemoryOpaqueCaptureAddressInfo#pNext} field. */
        public VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer pNext(@NativeType("void const *") long value) { VkDeviceMemoryOpaqueCaptureAddressInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceMemoryOpaqueCaptureAddressInfo#memory} field. */
        public VkDeviceMemoryOpaqueCaptureAddressInfo.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkDeviceMemoryOpaqueCaptureAddressInfo.nmemory(address(), value); return this; }

    }

}
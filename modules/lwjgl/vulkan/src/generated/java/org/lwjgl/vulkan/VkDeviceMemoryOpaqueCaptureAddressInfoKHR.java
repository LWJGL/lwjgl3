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
 * <li>{@code memory} <b>must</b> have been allocated with {@link KHRBufferDeviceAddress#VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT_KHR MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT_KHR}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRBufferDeviceAddress#VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO_KHR STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRBufferDeviceAddress#vkGetDeviceMemoryOpaqueCaptureAddressKHR GetDeviceMemoryOpaqueCaptureAddressKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code memory} &ndash; specifies the memory whose address is being queried.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceMemoryOpaqueCaptureAddressInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDeviceMemory memory;
 * }</code></pre>
 */
public class VkDeviceMemoryOpaqueCaptureAddressInfoKHR extends Struct implements NativeResource {

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
     * Creates a {@code VkDeviceMemoryOpaqueCaptureAddressInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceMemoryOpaqueCaptureAddressInfoKHR(ByteBuffer container) {
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
    /** Returns the value of the {@code memory} field. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceMemoryOpaqueCaptureAddressInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceMemoryOpaqueCaptureAddressInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    public VkDeviceMemoryOpaqueCaptureAddressInfoKHR memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceMemoryOpaqueCaptureAddressInfoKHR set(
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
    public VkDeviceMemoryOpaqueCaptureAddressInfoKHR set(VkDeviceMemoryOpaqueCaptureAddressInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceMemoryOpaqueCaptureAddressInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR malloc() {
        return wrap(VkDeviceMemoryOpaqueCaptureAddressInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceMemoryOpaqueCaptureAddressInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR calloc() {
        return wrap(VkDeviceMemoryOpaqueCaptureAddressInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceMemoryOpaqueCaptureAddressInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceMemoryOpaqueCaptureAddressInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceMemoryOpaqueCaptureAddressInfoKHR} instance for the specified memory address. */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR create(long address) {
        return wrap(VkDeviceMemoryOpaqueCaptureAddressInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceMemoryOpaqueCaptureAddressInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceMemoryOpaqueCaptureAddressInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkDeviceMemoryOpaqueCaptureAddressInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkDeviceMemoryOpaqueCaptureAddressInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkDeviceMemoryOpaqueCaptureAddressInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceMemoryOpaqueCaptureAddressInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkDeviceMemoryOpaqueCaptureAddressInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceMemoryOpaqueCaptureAddressInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceMemoryOpaqueCaptureAddressInfoKHR.PNEXT); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return UNSAFE.getLong(null, struct + VkDeviceMemoryOpaqueCaptureAddressInfoKHR.MEMORY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceMemoryOpaqueCaptureAddressInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceMemoryOpaqueCaptureAddressInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { UNSAFE.putLong(null, struct + VkDeviceMemoryOpaqueCaptureAddressInfoKHR.MEMORY, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceMemoryOpaqueCaptureAddressInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkDeviceMemoryOpaqueCaptureAddressInfoKHR, Buffer> implements NativeResource {

        private static final VkDeviceMemoryOpaqueCaptureAddressInfoKHR ELEMENT_FACTORY = VkDeviceMemoryOpaqueCaptureAddressInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceMemoryOpaqueCaptureAddressInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceMemoryOpaqueCaptureAddressInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceMemoryOpaqueCaptureAddressInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceMemoryOpaqueCaptureAddressInfoKHR.npNext(address()); }
        /** Returns the value of the {@code memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkDeviceMemoryOpaqueCaptureAddressInfoKHR.nmemory(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceMemoryOpaqueCaptureAddressInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkDeviceMemoryOpaqueCaptureAddressInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        public VkDeviceMemoryOpaqueCaptureAddressInfoKHR.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkDeviceMemoryOpaqueCaptureAddressInfoKHR.nmemory(address(), value); return this; }

    }

}
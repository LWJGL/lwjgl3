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
 * Request a specific address for a buffer.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code opaqueCaptureAddress} is zero, no specific address is requested.</p>
 * 
 * <p>If {@code opaqueCaptureAddress} is not zero, then it <b>should</b> be an address retrieved from {@link KHRBufferDeviceAddress#vkGetBufferOpaqueCaptureAddressKHR GetBufferOpaqueCaptureAddressKHR} for an identically created buffer on the same implementation.</p>
 * 
 * <p>If this structure is not present, it is as if {@code opaqueCaptureAddress} is zero.</p>
 * 
 * <p>Apps <b>should</b> avoid creating buffers with app-provided addresses and implementation-provided addresses in the same process, to reduce the likelihood of {@link KHRBufferDeviceAddress#VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR} errors.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The expected usage for this is that a trace capture/replay tool will add the {@link KHRBufferDeviceAddress#VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR} flag to all buffers that use {@link KHRBufferDeviceAddress#VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_KHR BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_KHR}, and during capture will save the queried opaque device addresses in the trace. During replay, the buffers will be created specifying the original address so any address values stored in the trace data will remain valid.</p>
 * 
 * <p>Implementations are expected to separate such buffers in the GPU address space so normal allocations will avoid using these addresses. Apps/tools should avoid mixing app-provided and implementation-provided addresses for buffers created with {@link KHRBufferDeviceAddress#VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR}, to avoid address space allocation conflicts.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRBufferDeviceAddress#VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO_KHR STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO_KHR}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code opaqueCaptureAddress} &ndash; the opaque capture address requested for the buffer.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBufferOpaqueCaptureAddressCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint64_t opaqueCaptureAddress;
 * }</code></pre>
 */
public class VkBufferOpaqueCaptureAddressCreateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        OPAQUECAPTUREADDRESS;

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
        OPAQUECAPTUREADDRESS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkBufferOpaqueCaptureAddressCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferOpaqueCaptureAddressCreateInfoKHR(ByteBuffer container) {
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
    /** Returns the value of the {@code opaqueCaptureAddress} field. */
    @NativeType("uint64_t")
    public long opaqueCaptureAddress() { return nopaqueCaptureAddress(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBufferOpaqueCaptureAddressCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBufferOpaqueCaptureAddressCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code opaqueCaptureAddress} field. */
    public VkBufferOpaqueCaptureAddressCreateInfoKHR opaqueCaptureAddress(@NativeType("uint64_t") long value) { nopaqueCaptureAddress(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBufferOpaqueCaptureAddressCreateInfoKHR set(
        int sType,
        long pNext,
        long opaqueCaptureAddress
    ) {
        sType(sType);
        pNext(pNext);
        opaqueCaptureAddress(opaqueCaptureAddress);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBufferOpaqueCaptureAddressCreateInfoKHR set(VkBufferOpaqueCaptureAddressCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferOpaqueCaptureAddressCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR malloc() {
        return wrap(VkBufferOpaqueCaptureAddressCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBufferOpaqueCaptureAddressCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR calloc() {
        return wrap(VkBufferOpaqueCaptureAddressCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBufferOpaqueCaptureAddressCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBufferOpaqueCaptureAddressCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBufferOpaqueCaptureAddressCreateInfoKHR} instance for the specified memory address. */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR create(long address) {
        return wrap(VkBufferOpaqueCaptureAddressCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkBufferOpaqueCaptureAddressCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferOpaqueCaptureAddressCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkBufferOpaqueCaptureAddressCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkBufferOpaqueCaptureAddressCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkBufferOpaqueCaptureAddressCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBufferOpaqueCaptureAddressCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkBufferOpaqueCaptureAddressCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBufferOpaqueCaptureAddressCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBufferOpaqueCaptureAddressCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #opaqueCaptureAddress}. */
    public static long nopaqueCaptureAddress(long struct) { return UNSAFE.getLong(null, struct + VkBufferOpaqueCaptureAddressCreateInfoKHR.OPAQUECAPTUREADDRESS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBufferOpaqueCaptureAddressCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBufferOpaqueCaptureAddressCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #opaqueCaptureAddress(long) opaqueCaptureAddress}. */
    public static void nopaqueCaptureAddress(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferOpaqueCaptureAddressCreateInfoKHR.OPAQUECAPTUREADDRESS, value); }

    // -----------------------------------

    /** An array of {@link VkBufferOpaqueCaptureAddressCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkBufferOpaqueCaptureAddressCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkBufferOpaqueCaptureAddressCreateInfoKHR ELEMENT_FACTORY = VkBufferOpaqueCaptureAddressCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferOpaqueCaptureAddressCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkBufferOpaqueCaptureAddressCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBufferOpaqueCaptureAddressCreateInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBufferOpaqueCaptureAddressCreateInfoKHR.npNext(address()); }
        /** Returns the value of the {@code opaqueCaptureAddress} field. */
        @NativeType("uint64_t")
        public long opaqueCaptureAddress() { return VkBufferOpaqueCaptureAddressCreateInfoKHR.nopaqueCaptureAddress(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBufferOpaqueCaptureAddressCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkBufferOpaqueCaptureAddressCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code opaqueCaptureAddress} field. */
        public VkBufferOpaqueCaptureAddressCreateInfoKHR.Buffer opaqueCaptureAddress(@NativeType("uint64_t") long value) { VkBufferOpaqueCaptureAddressCreateInfoKHR.nopaqueCaptureAddress(address(), value); return this; }

    }

}
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
 * <p>If {@code opaqueCaptureAddress} is not zero, then it <b>should</b> be an address retrieved from {@link VK12#vkGetBufferOpaqueCaptureAddress GetBufferOpaqueCaptureAddress} for an identically created buffer on the same implementation.</p>
 * 
 * <p>If this structure is not present, it is as if {@code opaqueCaptureAddress} is zero.</p>
 * 
 * <p>Apps <b>should</b> avoid creating buffers with app-provided addresses and implementation-provided addresses in the same process, to reduce the likelihood of {@link VK12#VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS} errors.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The expected usage for this is that a trace capture/replay tool will add the {@link VK12#VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT} flag to all buffers that use {@link VK12#VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT}, and during capture will save the queried opaque device addresses in the trace. During replay, the buffers will be created specifying the original address so any address values stored in the trace data will remain valid.</p>
 * 
 * <p>Implementations are expected to separate such buffers in the GPU address space so normal allocations will avoid using these addresses. Apps/tools should avoid mixing app-provided and implementation-provided addresses for buffers created with {@link VK12#VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT}, to avoid address space allocation conflicts.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBufferOpaqueCaptureAddressCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint64_t {@link #opaqueCaptureAddress};
 * }</code></pre>
 */
public class VkBufferOpaqueCaptureAddressCreateInfo extends Struct implements NativeResource {

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
     * Creates a {@code VkBufferOpaqueCaptureAddressCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferOpaqueCaptureAddressCreateInfo(ByteBuffer container) {
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
    /** the opaque capture address requested for the buffer. */
    @NativeType("uint64_t")
    public long opaqueCaptureAddress() { return nopaqueCaptureAddress(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkBufferOpaqueCaptureAddressCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO} value to the {@link #sType} field. */
    public VkBufferOpaqueCaptureAddressCreateInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkBufferOpaqueCaptureAddressCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #opaqueCaptureAddress} field. */
    public VkBufferOpaqueCaptureAddressCreateInfo opaqueCaptureAddress(@NativeType("uint64_t") long value) { nopaqueCaptureAddress(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBufferOpaqueCaptureAddressCreateInfo set(
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
    public VkBufferOpaqueCaptureAddressCreateInfo set(VkBufferOpaqueCaptureAddressCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferOpaqueCaptureAddressCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferOpaqueCaptureAddressCreateInfo malloc() {
        return wrap(VkBufferOpaqueCaptureAddressCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBufferOpaqueCaptureAddressCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferOpaqueCaptureAddressCreateInfo calloc() {
        return wrap(VkBufferOpaqueCaptureAddressCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBufferOpaqueCaptureAddressCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkBufferOpaqueCaptureAddressCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBufferOpaqueCaptureAddressCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBufferOpaqueCaptureAddressCreateInfo} instance for the specified memory address. */
    public static VkBufferOpaqueCaptureAddressCreateInfo create(long address) {
        return wrap(VkBufferOpaqueCaptureAddressCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferOpaqueCaptureAddressCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkBufferOpaqueCaptureAddressCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkBufferOpaqueCaptureAddressCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferOpaqueCaptureAddressCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBufferOpaqueCaptureAddressCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferOpaqueCaptureAddressCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferOpaqueCaptureAddressCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferOpaqueCaptureAddressCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBufferOpaqueCaptureAddressCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferOpaqueCaptureAddressCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferOpaqueCaptureAddressCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkBufferOpaqueCaptureAddressCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferOpaqueCaptureAddressCreateInfo malloc(MemoryStack stack) {
        return wrap(VkBufferOpaqueCaptureAddressCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBufferOpaqueCaptureAddressCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferOpaqueCaptureAddressCreateInfo calloc(MemoryStack stack) {
        return wrap(VkBufferOpaqueCaptureAddressCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBufferOpaqueCaptureAddressCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferOpaqueCaptureAddressCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferOpaqueCaptureAddressCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferOpaqueCaptureAddressCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBufferOpaqueCaptureAddressCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBufferOpaqueCaptureAddressCreateInfo.PNEXT); }
    /** Unsafe version of {@link #opaqueCaptureAddress}. */
    public static long nopaqueCaptureAddress(long struct) { return UNSAFE.getLong(null, struct + VkBufferOpaqueCaptureAddressCreateInfo.OPAQUECAPTUREADDRESS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBufferOpaqueCaptureAddressCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBufferOpaqueCaptureAddressCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #opaqueCaptureAddress(long) opaqueCaptureAddress}. */
    public static void nopaqueCaptureAddress(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferOpaqueCaptureAddressCreateInfo.OPAQUECAPTUREADDRESS, value); }

    // -----------------------------------

    /** An array of {@link VkBufferOpaqueCaptureAddressCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkBufferOpaqueCaptureAddressCreateInfo, Buffer> implements NativeResource {

        private static final VkBufferOpaqueCaptureAddressCreateInfo ELEMENT_FACTORY = VkBufferOpaqueCaptureAddressCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkBufferOpaqueCaptureAddressCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferOpaqueCaptureAddressCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkBufferOpaqueCaptureAddressCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkBufferOpaqueCaptureAddressCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBufferOpaqueCaptureAddressCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkBufferOpaqueCaptureAddressCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBufferOpaqueCaptureAddressCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkBufferOpaqueCaptureAddressCreateInfo#opaqueCaptureAddress} field. */
        @NativeType("uint64_t")
        public long opaqueCaptureAddress() { return VkBufferOpaqueCaptureAddressCreateInfo.nopaqueCaptureAddress(address()); }

        /** Sets the specified value to the {@link VkBufferOpaqueCaptureAddressCreateInfo#sType} field. */
        public VkBufferOpaqueCaptureAddressCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkBufferOpaqueCaptureAddressCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO} value to the {@link VkBufferOpaqueCaptureAddressCreateInfo#sType} field. */
        public VkBufferOpaqueCaptureAddressCreateInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO); }
        /** Sets the specified value to the {@link VkBufferOpaqueCaptureAddressCreateInfo#pNext} field. */
        public VkBufferOpaqueCaptureAddressCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkBufferOpaqueCaptureAddressCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferOpaqueCaptureAddressCreateInfo#opaqueCaptureAddress} field. */
        public VkBufferOpaqueCaptureAddressCreateInfo.Buffer opaqueCaptureAddress(@NativeType("uint64_t") long value) { VkBufferOpaqueCaptureAddressCreateInfo.nopaqueCaptureAddress(address(), value); return this; }

    }

}
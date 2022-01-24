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
 * Structure specifying the buffer to query an address for.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code buffer} is non-sparse and was not created with the {@link VK12#VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT} flag, then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>{@code buffer} <b>must</b> have been created with {@link VK12#VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK12#vkGetBufferDeviceAddress GetBufferDeviceAddress}, {@link EXTBufferDeviceAddress#vkGetBufferDeviceAddressEXT GetBufferDeviceAddressEXT}, {@link KHRBufferDeviceAddress#vkGetBufferDeviceAddressKHR GetBufferDeviceAddressKHR}, {@link VK12#vkGetBufferOpaqueCaptureAddress GetBufferOpaqueCaptureAddress}, {@link KHRBufferDeviceAddress#vkGetBufferOpaqueCaptureAddressKHR GetBufferOpaqueCaptureAddressKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBufferDeviceAddressInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBuffer {@link #buffer};
 * }</code></pre>
 */
public class VkBufferDeviceAddressInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        BUFFER;

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
        BUFFER = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkBufferDeviceAddressInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferDeviceAddressInfo(ByteBuffer container) {
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
    /** specifies the buffer whose address is being queried. */
    @NativeType("VkBuffer")
    public long buffer() { return nbuffer(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkBufferDeviceAddressInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO} value to the {@link #sType} field. */
    public VkBufferDeviceAddressInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkBufferDeviceAddressInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #buffer} field. */
    public VkBufferDeviceAddressInfo buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBufferDeviceAddressInfo set(
        int sType,
        long pNext,
        long buffer
    ) {
        sType(sType);
        pNext(pNext);
        buffer(buffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBufferDeviceAddressInfo set(VkBufferDeviceAddressInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferDeviceAddressInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferDeviceAddressInfo malloc() {
        return wrap(VkBufferDeviceAddressInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBufferDeviceAddressInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferDeviceAddressInfo calloc() {
        return wrap(VkBufferDeviceAddressInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBufferDeviceAddressInfo} instance allocated with {@link BufferUtils}. */
    public static VkBufferDeviceAddressInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBufferDeviceAddressInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBufferDeviceAddressInfo} instance for the specified memory address. */
    public static VkBufferDeviceAddressInfo create(long address) {
        return wrap(VkBufferDeviceAddressInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferDeviceAddressInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkBufferDeviceAddressInfo.class, address);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBufferDeviceAddressInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferDeviceAddressInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkBufferDeviceAddressInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferDeviceAddressInfo malloc(MemoryStack stack) {
        return wrap(VkBufferDeviceAddressInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBufferDeviceAddressInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferDeviceAddressInfo calloc(MemoryStack stack) {
        return wrap(VkBufferDeviceAddressInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferDeviceAddressInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferDeviceAddressInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBufferDeviceAddressInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBufferDeviceAddressInfo.PNEXT); }
    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return UNSAFE.getLong(null, struct + VkBufferDeviceAddressInfo.BUFFER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBufferDeviceAddressInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBufferDeviceAddressInfo.PNEXT, value); }
    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferDeviceAddressInfo.BUFFER, value); }

    // -----------------------------------

    /** An array of {@link VkBufferDeviceAddressInfo} structs. */
    public static class Buffer extends StructBuffer<VkBufferDeviceAddressInfo, Buffer> implements NativeResource {

        private static final VkBufferDeviceAddressInfo ELEMENT_FACTORY = VkBufferDeviceAddressInfo.create(-1L);

        /**
         * Creates a new {@code VkBufferDeviceAddressInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferDeviceAddressInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkBufferDeviceAddressInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkBufferDeviceAddressInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBufferDeviceAddressInfo.nsType(address()); }
        /** @return the value of the {@link VkBufferDeviceAddressInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBufferDeviceAddressInfo.npNext(address()); }
        /** @return the value of the {@link VkBufferDeviceAddressInfo#buffer} field. */
        @NativeType("VkBuffer")
        public long buffer() { return VkBufferDeviceAddressInfo.nbuffer(address()); }

        /** Sets the specified value to the {@link VkBufferDeviceAddressInfo#sType} field. */
        public VkBufferDeviceAddressInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkBufferDeviceAddressInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO} value to the {@link VkBufferDeviceAddressInfo#sType} field. */
        public VkBufferDeviceAddressInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO); }
        /** Sets the specified value to the {@link VkBufferDeviceAddressInfo#pNext} field. */
        public VkBufferDeviceAddressInfo.Buffer pNext(@NativeType("void const *") long value) { VkBufferDeviceAddressInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferDeviceAddressInfo#buffer} field. */
        public VkBufferDeviceAddressInfo.Buffer buffer(@NativeType("VkBuffer") long value) { VkBufferDeviceAddressInfo.nbuffer(address(), value); return this; }

    }

}
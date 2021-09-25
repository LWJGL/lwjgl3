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
 * Set the initial device mask for a command buffer.
 * 
 * <h5>Description</h5>
 * 
 * <p>The initial device mask also acts as an upper bound on the set of devices that <b>can</b> ever be in the device mask in the command buffer.</p>
 * 
 * <p>If this structure is not present, the initial value of a command buffer’s device mask is set to include all physical devices in the logical device when the command buffer begins recording.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code deviceMask} <b>must</b> be a valid device mask value</li>
 * <li>{@code deviceMask} <b>must</b> not be zero</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceGroupCommandBufferBeginInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #deviceMask};
 * }</code></pre>
 */
public class VkDeviceGroupCommandBufferBeginInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICEMASK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEMASK = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkDeviceGroupCommandBufferBeginInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceGroupCommandBufferBeginInfo(ByteBuffer container) {
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
    /** the initial value of the command buffer’s device mask. */
    @NativeType("uint32_t")
    public int deviceMask() { return ndeviceMask(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDeviceGroupCommandBufferBeginInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO} value to the {@link #sType} field. */
    public VkDeviceGroupCommandBufferBeginInfo sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDeviceGroupCommandBufferBeginInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #deviceMask} field. */
    public VkDeviceGroupCommandBufferBeginInfo deviceMask(@NativeType("uint32_t") int value) { ndeviceMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceGroupCommandBufferBeginInfo set(
        int sType,
        long pNext,
        int deviceMask
    ) {
        sType(sType);
        pNext(pNext);
        deviceMask(deviceMask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceGroupCommandBufferBeginInfo set(VkDeviceGroupCommandBufferBeginInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceGroupCommandBufferBeginInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupCommandBufferBeginInfo malloc() {
        return wrap(VkDeviceGroupCommandBufferBeginInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceGroupCommandBufferBeginInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupCommandBufferBeginInfo calloc() {
        return wrap(VkDeviceGroupCommandBufferBeginInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceGroupCommandBufferBeginInfo} instance allocated with {@link BufferUtils}. */
    public static VkDeviceGroupCommandBufferBeginInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceGroupCommandBufferBeginInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceGroupCommandBufferBeginInfo} instance for the specified memory address. */
    public static VkDeviceGroupCommandBufferBeginInfo create(long address) {
        return wrap(VkDeviceGroupCommandBufferBeginInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGroupCommandBufferBeginInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceGroupCommandBufferBeginInfo.class, address);
    }

    /**
     * Returns a new {@link VkDeviceGroupCommandBufferBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupCommandBufferBeginInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupCommandBufferBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupCommandBufferBeginInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupCommandBufferBeginInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupCommandBufferBeginInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceGroupCommandBufferBeginInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupCommandBufferBeginInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGroupCommandBufferBeginInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupCommandBufferBeginInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupCommandBufferBeginInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupCommandBufferBeginInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupCommandBufferBeginInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupCommandBufferBeginInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupCommandBufferBeginInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupCommandBufferBeginInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupCommandBufferBeginInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDeviceGroupCommandBufferBeginInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupCommandBufferBeginInfo malloc(MemoryStack stack) {
        return wrap(VkDeviceGroupCommandBufferBeginInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceGroupCommandBufferBeginInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupCommandBufferBeginInfo calloc(MemoryStack stack) {
        return wrap(VkDeviceGroupCommandBufferBeginInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGroupCommandBufferBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupCommandBufferBeginInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupCommandBufferBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupCommandBufferBeginInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceGroupCommandBufferBeginInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceGroupCommandBufferBeginInfo.PNEXT); }
    /** Unsafe version of {@link #deviceMask}. */
    public static int ndeviceMask(long struct) { return UNSAFE.getInt(null, struct + VkDeviceGroupCommandBufferBeginInfo.DEVICEMASK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceGroupCommandBufferBeginInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceGroupCommandBufferBeginInfo.PNEXT, value); }
    /** Unsafe version of {@link #deviceMask(int) deviceMask}. */
    public static void ndeviceMask(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceGroupCommandBufferBeginInfo.DEVICEMASK, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceGroupCommandBufferBeginInfo} structs. */
    public static class Buffer extends StructBuffer<VkDeviceGroupCommandBufferBeginInfo, Buffer> implements NativeResource {

        private static final VkDeviceGroupCommandBufferBeginInfo ELEMENT_FACTORY = VkDeviceGroupCommandBufferBeginInfo.create(-1L);

        /**
         * Creates a new {@code VkDeviceGroupCommandBufferBeginInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceGroupCommandBufferBeginInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceGroupCommandBufferBeginInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDeviceGroupCommandBufferBeginInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceGroupCommandBufferBeginInfo.nsType(address()); }
        /** @return the value of the {@link VkDeviceGroupCommandBufferBeginInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceGroupCommandBufferBeginInfo.npNext(address()); }
        /** @return the value of the {@link VkDeviceGroupCommandBufferBeginInfo#deviceMask} field. */
        @NativeType("uint32_t")
        public int deviceMask() { return VkDeviceGroupCommandBufferBeginInfo.ndeviceMask(address()); }

        /** Sets the specified value to the {@link VkDeviceGroupCommandBufferBeginInfo#sType} field. */
        public VkDeviceGroupCommandBufferBeginInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceGroupCommandBufferBeginInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO} value to the {@link VkDeviceGroupCommandBufferBeginInfo#sType} field. */
        public VkDeviceGroupCommandBufferBeginInfo.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO); }
        /** Sets the specified value to the {@link VkDeviceGroupCommandBufferBeginInfo#pNext} field. */
        public VkDeviceGroupCommandBufferBeginInfo.Buffer pNext(@NativeType("void const *") long value) { VkDeviceGroupCommandBufferBeginInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceGroupCommandBufferBeginInfo#deviceMask} field. */
        public VkDeviceGroupCommandBufferBeginInfo.Buffer deviceMask(@NativeType("uint32_t") int value) { VkDeviceGroupCommandBufferBeginInfo.ndeviceMask(address(), value); return this; }

    }

}
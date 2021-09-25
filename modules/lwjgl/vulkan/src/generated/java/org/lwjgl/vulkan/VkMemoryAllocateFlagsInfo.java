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
 * Structure controlling how many instances of memory will be allocated.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@link VK11#VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT MEMORY_ALLOCATE_DEVICE_MASK_BIT} is not set, the number of instances allocated depends on whether {@link VK11#VK_MEMORY_HEAP_MULTI_INSTANCE_BIT MEMORY_HEAP_MULTI_INSTANCE_BIT} is set in the memory heap. If {@link VK11#VK_MEMORY_HEAP_MULTI_INSTANCE_BIT MEMORY_HEAP_MULTI_INSTANCE_BIT} is set, then memory is allocated for every physical device in the logical device (as if {@code deviceMask} has bits set for all device indices). If {@link VK11#VK_MEMORY_HEAP_MULTI_INSTANCE_BIT MEMORY_HEAP_MULTI_INSTANCE_BIT} is not set, then a single instance of memory is allocated (as if {@code deviceMask} is set to one).</p>
 * 
 * <p>On some implementations, allocations from a multi-instance heap <b>may</b> consume memory on all physical devices even if the {@code deviceMask} excludes some devices. If {@link VkPhysicalDeviceGroupProperties}{@code ::subsetAllocation} is {@link VK10#VK_TRUE TRUE}, then memory is only consumed for the devices in the device mask.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>In practice, most allocations on a multi-instance heap will be allocated across all physical devices. Unicast allocation support is an optional optimization for a minority of allocations.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@link VK11#VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT MEMORY_ALLOCATE_DEVICE_MASK_BIT} is set, {@code deviceMask} <b>must</b> be a valid device mask</li>
 * <li>If {@link VK11#VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT MEMORY_ALLOCATE_DEVICE_MASK_BIT} is set, {@code deviceMask} <b>must</b> not be zero</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkMemoryAllocateFlagBits} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMemoryAllocateFlagsInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkMemoryAllocateFlags {@link #flags};
 *     uint32_t {@link #deviceMask};
 * }</code></pre>
 */
public class VkMemoryAllocateFlagsInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        DEVICEMASK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DEVICEMASK = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkMemoryAllocateFlagsInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryAllocateFlagsInfo(ByteBuffer container) {
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
    /** a bitmask of {@code VkMemoryAllocateFlagBits} controlling the allocation. */
    @NativeType("VkMemoryAllocateFlags")
    public int flags() { return nflags(address()); }
    /** a mask of physical devices in the logical device, indicating that memory <b>must</b> be allocated on each device in the mask, if {@link VK11#VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT MEMORY_ALLOCATE_DEVICE_MASK_BIT} is set in {@code flags}. */
    @NativeType("uint32_t")
    public int deviceMask() { return ndeviceMask(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMemoryAllocateFlagsInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO} value to the {@link #sType} field. */
    public VkMemoryAllocateFlagsInfo sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMemoryAllocateFlagsInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkMemoryAllocateFlagsInfo flags(@NativeType("VkMemoryAllocateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #deviceMask} field. */
    public VkMemoryAllocateFlagsInfo deviceMask(@NativeType("uint32_t") int value) { ndeviceMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryAllocateFlagsInfo set(
        int sType,
        long pNext,
        int flags,
        int deviceMask
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
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
    public VkMemoryAllocateFlagsInfo set(VkMemoryAllocateFlagsInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryAllocateFlagsInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryAllocateFlagsInfo malloc() {
        return wrap(VkMemoryAllocateFlagsInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkMemoryAllocateFlagsInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryAllocateFlagsInfo calloc() {
        return wrap(VkMemoryAllocateFlagsInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkMemoryAllocateFlagsInfo} instance allocated with {@link BufferUtils}. */
    public static VkMemoryAllocateFlagsInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkMemoryAllocateFlagsInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryAllocateFlagsInfo} instance for the specified memory address. */
    public static VkMemoryAllocateFlagsInfo create(long address) {
        return wrap(VkMemoryAllocateFlagsInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryAllocateFlagsInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkMemoryAllocateFlagsInfo.class, address);
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateFlagsInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateFlagsInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateFlagsInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkMemoryAllocateFlagsInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateFlagsInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryAllocateFlagsInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateFlagsInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateFlagsInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateFlagsInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateFlagsInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateFlagsInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateFlagsInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateFlagsInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryAllocateFlagsInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkMemoryAllocateFlagsInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryAllocateFlagsInfo malloc(MemoryStack stack) {
        return wrap(VkMemoryAllocateFlagsInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkMemoryAllocateFlagsInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryAllocateFlagsInfo calloc(MemoryStack stack) {
        return wrap(VkMemoryAllocateFlagsInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateFlagsInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryAllocateFlagsInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryAllocateFlagsInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMemoryAllocateFlagsInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryAllocateFlagsInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkMemoryAllocateFlagsInfo.FLAGS); }
    /** Unsafe version of {@link #deviceMask}. */
    public static int ndeviceMask(long struct) { return UNSAFE.getInt(null, struct + VkMemoryAllocateFlagsInfo.DEVICEMASK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryAllocateFlagsInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryAllocateFlagsInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryAllocateFlagsInfo.FLAGS, value); }
    /** Unsafe version of {@link #deviceMask(int) deviceMask}. */
    public static void ndeviceMask(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryAllocateFlagsInfo.DEVICEMASK, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryAllocateFlagsInfo} structs. */
    public static class Buffer extends StructBuffer<VkMemoryAllocateFlagsInfo, Buffer> implements NativeResource {

        private static final VkMemoryAllocateFlagsInfo ELEMENT_FACTORY = VkMemoryAllocateFlagsInfo.create(-1L);

        /**
         * Creates a new {@code VkMemoryAllocateFlagsInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryAllocateFlagsInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkMemoryAllocateFlagsInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMemoryAllocateFlagsInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryAllocateFlagsInfo.nsType(address()); }
        /** @return the value of the {@link VkMemoryAllocateFlagsInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryAllocateFlagsInfo.npNext(address()); }
        /** @return the value of the {@link VkMemoryAllocateFlagsInfo#flags} field. */
        @NativeType("VkMemoryAllocateFlags")
        public int flags() { return VkMemoryAllocateFlagsInfo.nflags(address()); }
        /** @return the value of the {@link VkMemoryAllocateFlagsInfo#deviceMask} field. */
        @NativeType("uint32_t")
        public int deviceMask() { return VkMemoryAllocateFlagsInfo.ndeviceMask(address()); }

        /** Sets the specified value to the {@link VkMemoryAllocateFlagsInfo#sType} field. */
        public VkMemoryAllocateFlagsInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryAllocateFlagsInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO} value to the {@link VkMemoryAllocateFlagsInfo#sType} field. */
        public VkMemoryAllocateFlagsInfo.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO); }
        /** Sets the specified value to the {@link VkMemoryAllocateFlagsInfo#pNext} field. */
        public VkMemoryAllocateFlagsInfo.Buffer pNext(@NativeType("void const *") long value) { VkMemoryAllocateFlagsInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryAllocateFlagsInfo#flags} field. */
        public VkMemoryAllocateFlagsInfo.Buffer flags(@NativeType("VkMemoryAllocateFlags") int value) { VkMemoryAllocateFlagsInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryAllocateFlagsInfo#deviceMask} field. */
        public VkMemoryAllocateFlagsInfo.Buffer deviceMask(@NativeType("uint32_t") int value) { VkMemoryAllocateFlagsInfo.ndeviceMask(address(), value); return this; }

    }

}
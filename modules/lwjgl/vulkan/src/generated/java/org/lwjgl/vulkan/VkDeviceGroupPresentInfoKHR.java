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
 * Mode and mask controlling which physical devices' images are presented.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code mode} is {@link KHRSwapchain#VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR}, then each element of {@code pDeviceMasks} selects which instance of the swapchain image is presented. Each element of {@code pDeviceMasks} <b>must</b> have exactly one bit set, and the corresponding physical device <b>must</b> have a presentation engine as reported by {@link VkDeviceGroupPresentCapabilitiesKHR}.</p>
 * 
 * <p>If {@code mode} is {@link KHRSwapchain#VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR}, then each element of {@code pDeviceMasks} selects which instance of the swapchain image is presented. Each element of {@code pDeviceMasks} <b>must</b> have exactly one bit set, and some physical device in the logical device <b>must</b> include that bit in its {@link VkDeviceGroupPresentCapabilitiesKHR}{@code ::presentMask}.</p>
 * 
 * <p>If {@code mode} is {@link KHRSwapchain#VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR}, then each element of {@code pDeviceMasks} selects which instances of the swapchain image are component-wise summed and the sum of those images is presented. If the sum in any component is outside the representable range, the value of that component is undefined. Each element of {@code pDeviceMasks} <b>must</b> have a value for which all set bits are set in one of the elements of {@link VkDeviceGroupPresentCapabilitiesKHR}{@code ::presentMask}.</p>
 * 
 * <p>If {@code mode} is {@link KHRSwapchain#VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR}, then each element of {@code pDeviceMasks} selects which instance(s) of the swapchain images are presented. For each bit set in each element of {@code pDeviceMasks}, the corresponding physical device <b>must</b> have a presentation engine as reported by {@link VkDeviceGroupPresentCapabilitiesKHR}.</p>
 * 
 * <p>If {@link VkDeviceGroupPresentInfoKHR} is not provided or {@code swapchainCount} is zero then the masks are considered to be 1. If {@link VkDeviceGroupPresentInfoKHR} is not provided, {@code mode} is considered to be {@link KHRSwapchain#VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code swapchainCount} <b>must</b> equal 0 or {@link VkPresentInfoKHR}{@code ::swapchainCount}</li>
 * <li>If {@code mode} is {@link KHRSwapchain#VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR}, then each element of {@code pDeviceMasks} <b>must</b> have exactly one bit set, and the corresponding element of {@link VkDeviceGroupPresentCapabilitiesKHR}{@code ::presentMask} <b>must</b> be non-zero</li>
 * <li>If {@code mode} is {@link KHRSwapchain#VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR}, then each element of {@code pDeviceMasks} <b>must</b> have exactly one bit set, and some physical device in the logical device <b>must</b> include that bit in its {@link VkDeviceGroupPresentCapabilitiesKHR}{@code ::presentMask}</li>
 * <li>If {@code mode} is {@link KHRSwapchain#VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR}, then each element of {@code pDeviceMasks} <b>must</b> have a value for which all set bits are set in one of the elements of {@link VkDeviceGroupPresentCapabilitiesKHR}{@code ::presentMask}</li>
 * <li>If {@code mode} is {@link KHRSwapchain#VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR}, then for each bit set in each element of {@code pDeviceMasks}, the corresponding element of {@link VkDeviceGroupPresentCapabilitiesKHR}{@code ::presentMask} <b>must</b> be non-zero</li>
 * <li>The value of each element of {@code pDeviceMasks} <b>must</b> be equal to the device mask passed in {@link VkAcquireNextImageInfoKHR}{@code ::deviceMask} when the image index was last acquired</li>
 * <li>{@code mode} <b>must</b> have exactly one bit set, and that bit <b>must</b> have been included in {@link VkDeviceGroupSwapchainCreateInfoKHR}{@code ::modes}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSwapchain#VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR}</li>
 * <li>If {@code swapchainCount} is not 0, {@code pDeviceMasks} <b>must</b> be a valid pointer to an array of {@code swapchainCount} {@code uint32_t} values</li>
 * <li>{@code mode} <b>must</b> be a valid {@code VkDeviceGroupPresentModeFlagBitsKHR} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceGroupPresentInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #swapchainCount};
 *     uint32_t const * {@link #pDeviceMasks};
 *     VkDeviceGroupPresentModeFlagBitsKHR {@link #mode};
 * }</code></pre>
 */
public class VkDeviceGroupPresentInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SWAPCHAINCOUNT,
        PDEVICEMASKS,
        MODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAINCOUNT = layout.offsetof(2);
        PDEVICEMASKS = layout.offsetof(3);
        MODE = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkDeviceGroupPresentInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceGroupPresentInfoKHR(ByteBuffer container) {
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
    /** zero or the number of elements in {@code pDeviceMasks}. */
    @NativeType("uint32_t")
    public int swapchainCount() { return nswapchainCount(address()); }
    /** a pointer to an array of device masks, one for each element of {@link VkPresentInfoKHR}::pSwapchains. */
    @Nullable
    @NativeType("uint32_t const *")
    public IntBuffer pDeviceMasks() { return npDeviceMasks(address()); }
    /** a {@code VkDeviceGroupPresentModeFlagBitsKHR} value specifying the device group present mode that will be used for this present. */
    @NativeType("VkDeviceGroupPresentModeFlagBitsKHR")
    public int mode() { return nmode(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDeviceGroupPresentInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRSwapchain#VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR} value to the {@link #sType} field. */
    public VkDeviceGroupPresentInfoKHR sType$Default() { return sType(KHRSwapchain.VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDeviceGroupPresentInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pDeviceMasks} field. */
    public VkDeviceGroupPresentInfoKHR pDeviceMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npDeviceMasks(address(), value); return this; }
    /** Sets the specified value to the {@link #mode} field. */
    public VkDeviceGroupPresentInfoKHR mode(@NativeType("VkDeviceGroupPresentModeFlagBitsKHR") int value) { nmode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceGroupPresentInfoKHR set(
        int sType,
        long pNext,
        @Nullable IntBuffer pDeviceMasks,
        int mode
    ) {
        sType(sType);
        pNext(pNext);
        pDeviceMasks(pDeviceMasks);
        mode(mode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceGroupPresentInfoKHR set(VkDeviceGroupPresentInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceGroupPresentInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupPresentInfoKHR malloc() {
        return wrap(VkDeviceGroupPresentInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceGroupPresentInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupPresentInfoKHR calloc() {
        return wrap(VkDeviceGroupPresentInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceGroupPresentInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceGroupPresentInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceGroupPresentInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceGroupPresentInfoKHR} instance for the specified memory address. */
    public static VkDeviceGroupPresentInfoKHR create(long address) {
        return wrap(VkDeviceGroupPresentInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGroupPresentInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceGroupPresentInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceGroupPresentInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGroupPresentInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupPresentInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupPresentInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupPresentInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupPresentInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupPresentInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupPresentInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupPresentInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupPresentInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDeviceGroupPresentInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupPresentInfoKHR malloc(MemoryStack stack) {
        return wrap(VkDeviceGroupPresentInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceGroupPresentInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupPresentInfoKHR calloc(MemoryStack stack) {
        return wrap(VkDeviceGroupPresentInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceGroupPresentInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceGroupPresentInfoKHR.PNEXT); }
    /** Unsafe version of {@link #swapchainCount}. */
    public static int nswapchainCount(long struct) { return UNSAFE.getInt(null, struct + VkDeviceGroupPresentInfoKHR.SWAPCHAINCOUNT); }
    /** Unsafe version of {@link #pDeviceMasks() pDeviceMasks}. */
    @Nullable public static IntBuffer npDeviceMasks(long struct) { return memIntBufferSafe(memGetAddress(struct + VkDeviceGroupPresentInfoKHR.PDEVICEMASKS), nswapchainCount(struct)); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return UNSAFE.getInt(null, struct + VkDeviceGroupPresentInfoKHR.MODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceGroupPresentInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceGroupPresentInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code swapchainCount} field of the specified {@code struct}. */
    public static void nswapchainCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceGroupPresentInfoKHR.SWAPCHAINCOUNT, value); }
    /** Unsafe version of {@link #pDeviceMasks(IntBuffer) pDeviceMasks}. */
    public static void npDeviceMasks(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkDeviceGroupPresentInfoKHR.PDEVICEMASKS, memAddressSafe(value)); nswapchainCount(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceGroupPresentInfoKHR.MODE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nswapchainCount(struct) != 0) {
            check(memGetAddress(struct + VkDeviceGroupPresentInfoKHR.PDEVICEMASKS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkDeviceGroupPresentInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkDeviceGroupPresentInfoKHR, Buffer> implements NativeResource {

        private static final VkDeviceGroupPresentInfoKHR ELEMENT_FACTORY = VkDeviceGroupPresentInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceGroupPresentInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceGroupPresentInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceGroupPresentInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDeviceGroupPresentInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceGroupPresentInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkDeviceGroupPresentInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceGroupPresentInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkDeviceGroupPresentInfoKHR#swapchainCount} field. */
        @NativeType("uint32_t")
        public int swapchainCount() { return VkDeviceGroupPresentInfoKHR.nswapchainCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkDeviceGroupPresentInfoKHR#pDeviceMasks} field. */
        @Nullable
        @NativeType("uint32_t const *")
        public IntBuffer pDeviceMasks() { return VkDeviceGroupPresentInfoKHR.npDeviceMasks(address()); }
        /** @return the value of the {@link VkDeviceGroupPresentInfoKHR#mode} field. */
        @NativeType("VkDeviceGroupPresentModeFlagBitsKHR")
        public int mode() { return VkDeviceGroupPresentInfoKHR.nmode(address()); }

        /** Sets the specified value to the {@link VkDeviceGroupPresentInfoKHR#sType} field. */
        public VkDeviceGroupPresentInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceGroupPresentInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRSwapchain#VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR} value to the {@link VkDeviceGroupPresentInfoKHR#sType} field. */
        public VkDeviceGroupPresentInfoKHR.Buffer sType$Default() { return sType(KHRSwapchain.VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR); }
        /** Sets the specified value to the {@link VkDeviceGroupPresentInfoKHR#pNext} field. */
        public VkDeviceGroupPresentInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkDeviceGroupPresentInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkDeviceGroupPresentInfoKHR#pDeviceMasks} field. */
        public VkDeviceGroupPresentInfoKHR.Buffer pDeviceMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkDeviceGroupPresentInfoKHR.npDeviceMasks(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceGroupPresentInfoKHR#mode} field. */
        public VkDeviceGroupPresentInfoKHR.Buffer mode(@NativeType("VkDeviceGroupPresentModeFlagBitsKHR") int value) { VkDeviceGroupPresentInfoKHR.nmode(address(), value); return this; }

    }

}
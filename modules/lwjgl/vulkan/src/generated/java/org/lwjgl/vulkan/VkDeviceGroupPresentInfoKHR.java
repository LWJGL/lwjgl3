/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkDeviceGroupPresentInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t swapchainCount;
 *     uint32_t const * pDeviceMasks;
 *     VkDeviceGroupPresentModeFlagBitsKHR mode;
 * }}</pre>
 */
public class VkDeviceGroupPresentInfoKHR extends Struct<VkDeviceGroupPresentInfoKHR> implements NativeResource {

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

    protected VkDeviceGroupPresentInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceGroupPresentInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceGroupPresentInfoKHR(address, container);
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code swapchainCount} field. */
    @NativeType("uint32_t")
    public int swapchainCount() { return nswapchainCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pDeviceMasks} field. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pDeviceMasks() { return npDeviceMasks(address()); }
    /** @return the value of the {@code mode} field. */
    @NativeType("VkDeviceGroupPresentModeFlagBitsKHR")
    public int mode() { return nmode(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceGroupPresentInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRSwapchain#VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR} value to the {@code sType} field. */
    public VkDeviceGroupPresentInfoKHR sType$Default() { return sType(KHRSwapchain.VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceGroupPresentInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceMasks} field. */
    public VkDeviceGroupPresentInfoKHR pDeviceMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npDeviceMasks(address(), value); return this; }
    /** Sets the specified value to the {@code mode} field. */
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
        return new VkDeviceGroupPresentInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceGroupPresentInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupPresentInfoKHR calloc() {
        return new VkDeviceGroupPresentInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceGroupPresentInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceGroupPresentInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceGroupPresentInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceGroupPresentInfoKHR} instance for the specified memory address. */
    public static VkDeviceGroupPresentInfoKHR create(long address) {
        return new VkDeviceGroupPresentInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceGroupPresentInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkDeviceGroupPresentInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceGroupPresentInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceGroupPresentInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
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
        return new VkDeviceGroupPresentInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceGroupPresentInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupPresentInfoKHR calloc(MemoryStack stack) {
        return new VkDeviceGroupPresentInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupPresentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupPresentInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceGroupPresentInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceGroupPresentInfoKHR.PNEXT); }
    /** Unsafe version of {@link #swapchainCount}. */
    public static int nswapchainCount(long struct) { return memGetInt(struct + VkDeviceGroupPresentInfoKHR.SWAPCHAINCOUNT); }
    /** Unsafe version of {@link #pDeviceMasks() pDeviceMasks}. */
    public static @Nullable IntBuffer npDeviceMasks(long struct) { return memIntBufferSafe(memGetAddress(struct + VkDeviceGroupPresentInfoKHR.PDEVICEMASKS), nswapchainCount(struct)); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return memGetInt(struct + VkDeviceGroupPresentInfoKHR.MODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceGroupPresentInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceGroupPresentInfoKHR.PNEXT, value); }
    /** Sets the specified value to the {@code swapchainCount} field of the specified {@code struct}. */
    public static void nswapchainCount(long struct, int value) { memPutInt(struct + VkDeviceGroupPresentInfoKHR.SWAPCHAINCOUNT, value); }
    /** Unsafe version of {@link #pDeviceMasks(IntBuffer) pDeviceMasks}. */
    public static void npDeviceMasks(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkDeviceGroupPresentInfoKHR.PDEVICEMASKS, memAddressSafe(value)); nswapchainCount(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { memPutInt(struct + VkDeviceGroupPresentInfoKHR.MODE, value); }

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
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceGroupPresentInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkDeviceGroupPresentInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceGroupPresentInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceGroupPresentInfoKHR.npNext(address()); }
        /** @return the value of the {@code swapchainCount} field. */
        @NativeType("uint32_t")
        public int swapchainCount() { return VkDeviceGroupPresentInfoKHR.nswapchainCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pDeviceMasks} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pDeviceMasks() { return VkDeviceGroupPresentInfoKHR.npDeviceMasks(address()); }
        /** @return the value of the {@code mode} field. */
        @NativeType("VkDeviceGroupPresentModeFlagBitsKHR")
        public int mode() { return VkDeviceGroupPresentInfoKHR.nmode(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceGroupPresentInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceGroupPresentInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRSwapchain#VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR} value to the {@code sType} field. */
        public VkDeviceGroupPresentInfoKHR.Buffer sType$Default() { return sType(KHRSwapchain.VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceGroupPresentInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkDeviceGroupPresentInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceMasks} field. */
        public VkDeviceGroupPresentInfoKHR.Buffer pDeviceMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkDeviceGroupPresentInfoKHR.npDeviceMasks(address(), value); return this; }
        /** Sets the specified value to the {@code mode} field. */
        public VkDeviceGroupPresentInfoKHR.Buffer mode(@NativeType("VkDeviceGroupPresentModeFlagBitsKHR") int value) { VkDeviceGroupPresentInfoKHR.nmode(address(), value); return this; }

    }

}
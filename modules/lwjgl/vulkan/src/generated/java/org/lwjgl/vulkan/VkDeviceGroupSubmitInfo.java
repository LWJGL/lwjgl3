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
 * struct VkDeviceGroupSubmitInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t waitSemaphoreCount;
 *     uint32_t const * pWaitSemaphoreDeviceIndices;
 *     uint32_t commandBufferCount;
 *     uint32_t const * pCommandBufferDeviceMasks;
 *     uint32_t signalSemaphoreCount;
 *     uint32_t const * pSignalSemaphoreDeviceIndices;
 * }}</pre>
 */
public class VkDeviceGroupSubmitInfo extends Struct<VkDeviceGroupSubmitInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        WAITSEMAPHORECOUNT,
        PWAITSEMAPHOREDEVICEINDICES,
        COMMANDBUFFERCOUNT,
        PCOMMANDBUFFERDEVICEMASKS,
        SIGNALSEMAPHORECOUNT,
        PSIGNALSEMAPHOREDEVICEINDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WAITSEMAPHORECOUNT = layout.offsetof(2);
        PWAITSEMAPHOREDEVICEINDICES = layout.offsetof(3);
        COMMANDBUFFERCOUNT = layout.offsetof(4);
        PCOMMANDBUFFERDEVICEMASKS = layout.offsetof(5);
        SIGNALSEMAPHORECOUNT = layout.offsetof(6);
        PSIGNALSEMAPHOREDEVICEINDICES = layout.offsetof(7);
    }

    protected VkDeviceGroupSubmitInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceGroupSubmitInfo create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceGroupSubmitInfo(address, container);
    }

    /**
     * Creates a {@code VkDeviceGroupSubmitInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceGroupSubmitInfo(ByteBuffer container) {
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
    /** @return the value of the {@code waitSemaphoreCount} field. */
    @NativeType("uint32_t")
    public int waitSemaphoreCount() { return nwaitSemaphoreCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pWaitSemaphoreDeviceIndices} field. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pWaitSemaphoreDeviceIndices() { return npWaitSemaphoreDeviceIndices(address()); }
    /** @return the value of the {@code commandBufferCount} field. */
    @NativeType("uint32_t")
    public int commandBufferCount() { return ncommandBufferCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pCommandBufferDeviceMasks} field. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pCommandBufferDeviceMasks() { return npCommandBufferDeviceMasks(address()); }
    /** @return the value of the {@code signalSemaphoreCount} field. */
    @NativeType("uint32_t")
    public int signalSemaphoreCount() { return nsignalSemaphoreCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pSignalSemaphoreDeviceIndices} field. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pSignalSemaphoreDeviceIndices() { return npSignalSemaphoreDeviceIndices(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceGroupSubmitInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO} value to the {@code sType} field. */
    public VkDeviceGroupSubmitInfo sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceGroupSubmitInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pWaitSemaphoreDeviceIndices} field. */
    public VkDeviceGroupSubmitInfo pWaitSemaphoreDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npWaitSemaphoreDeviceIndices(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pCommandBufferDeviceMasks} field. */
    public VkDeviceGroupSubmitInfo pCommandBufferDeviceMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npCommandBufferDeviceMasks(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pSignalSemaphoreDeviceIndices} field. */
    public VkDeviceGroupSubmitInfo pSignalSemaphoreDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npSignalSemaphoreDeviceIndices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceGroupSubmitInfo set(
        int sType,
        long pNext,
        @Nullable IntBuffer pWaitSemaphoreDeviceIndices,
        @Nullable IntBuffer pCommandBufferDeviceMasks,
        @Nullable IntBuffer pSignalSemaphoreDeviceIndices
    ) {
        sType(sType);
        pNext(pNext);
        pWaitSemaphoreDeviceIndices(pWaitSemaphoreDeviceIndices);
        pCommandBufferDeviceMasks(pCommandBufferDeviceMasks);
        pSignalSemaphoreDeviceIndices(pSignalSemaphoreDeviceIndices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceGroupSubmitInfo set(VkDeviceGroupSubmitInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceGroupSubmitInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupSubmitInfo malloc() {
        return new VkDeviceGroupSubmitInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceGroupSubmitInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupSubmitInfo calloc() {
        return new VkDeviceGroupSubmitInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceGroupSubmitInfo} instance allocated with {@link BufferUtils}. */
    public static VkDeviceGroupSubmitInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceGroupSubmitInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceGroupSubmitInfo} instance for the specified memory address. */
    public static VkDeviceGroupSubmitInfo create(long address) {
        return new VkDeviceGroupSubmitInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceGroupSubmitInfo createSafe(long address) {
        return address == NULL ? null : new VkDeviceGroupSubmitInfo(address, null);
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSubmitInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSubmitInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSubmitInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceGroupSubmitInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSubmitInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceGroupSubmitInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSubmitInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSubmitInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSubmitInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSubmitInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSubmitInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSubmitInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSubmitInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSubmitInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDeviceGroupSubmitInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupSubmitInfo malloc(MemoryStack stack) {
        return new VkDeviceGroupSubmitInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceGroupSubmitInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupSubmitInfo calloc(MemoryStack stack) {
        return new VkDeviceGroupSubmitInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSubmitInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSubmitInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceGroupSubmitInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceGroupSubmitInfo.PNEXT); }
    /** Unsafe version of {@link #waitSemaphoreCount}. */
    public static int nwaitSemaphoreCount(long struct) { return memGetInt(struct + VkDeviceGroupSubmitInfo.WAITSEMAPHORECOUNT); }
    /** Unsafe version of {@link #pWaitSemaphoreDeviceIndices() pWaitSemaphoreDeviceIndices}. */
    public static @Nullable IntBuffer npWaitSemaphoreDeviceIndices(long struct) { return memIntBufferSafe(memGetAddress(struct + VkDeviceGroupSubmitInfo.PWAITSEMAPHOREDEVICEINDICES), nwaitSemaphoreCount(struct)); }
    /** Unsafe version of {@link #commandBufferCount}. */
    public static int ncommandBufferCount(long struct) { return memGetInt(struct + VkDeviceGroupSubmitInfo.COMMANDBUFFERCOUNT); }
    /** Unsafe version of {@link #pCommandBufferDeviceMasks() pCommandBufferDeviceMasks}. */
    public static @Nullable IntBuffer npCommandBufferDeviceMasks(long struct) { return memIntBufferSafe(memGetAddress(struct + VkDeviceGroupSubmitInfo.PCOMMANDBUFFERDEVICEMASKS), ncommandBufferCount(struct)); }
    /** Unsafe version of {@link #signalSemaphoreCount}. */
    public static int nsignalSemaphoreCount(long struct) { return memGetInt(struct + VkDeviceGroupSubmitInfo.SIGNALSEMAPHORECOUNT); }
    /** Unsafe version of {@link #pSignalSemaphoreDeviceIndices() pSignalSemaphoreDeviceIndices}. */
    public static @Nullable IntBuffer npSignalSemaphoreDeviceIndices(long struct) { return memIntBufferSafe(memGetAddress(struct + VkDeviceGroupSubmitInfo.PSIGNALSEMAPHOREDEVICEINDICES), nsignalSemaphoreCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceGroupSubmitInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceGroupSubmitInfo.PNEXT, value); }
    /** Sets the specified value to the {@code waitSemaphoreCount} field of the specified {@code struct}. */
    public static void nwaitSemaphoreCount(long struct, int value) { memPutInt(struct + VkDeviceGroupSubmitInfo.WAITSEMAPHORECOUNT, value); }
    /** Unsafe version of {@link #pWaitSemaphoreDeviceIndices(IntBuffer) pWaitSemaphoreDeviceIndices}. */
    public static void npWaitSemaphoreDeviceIndices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkDeviceGroupSubmitInfo.PWAITSEMAPHOREDEVICEINDICES, memAddressSafe(value)); nwaitSemaphoreCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code commandBufferCount} field of the specified {@code struct}. */
    public static void ncommandBufferCount(long struct, int value) { memPutInt(struct + VkDeviceGroupSubmitInfo.COMMANDBUFFERCOUNT, value); }
    /** Unsafe version of {@link #pCommandBufferDeviceMasks(IntBuffer) pCommandBufferDeviceMasks}. */
    public static void npCommandBufferDeviceMasks(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkDeviceGroupSubmitInfo.PCOMMANDBUFFERDEVICEMASKS, memAddressSafe(value)); ncommandBufferCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code signalSemaphoreCount} field of the specified {@code struct}. */
    public static void nsignalSemaphoreCount(long struct, int value) { memPutInt(struct + VkDeviceGroupSubmitInfo.SIGNALSEMAPHORECOUNT, value); }
    /** Unsafe version of {@link #pSignalSemaphoreDeviceIndices(IntBuffer) pSignalSemaphoreDeviceIndices}. */
    public static void npSignalSemaphoreDeviceIndices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkDeviceGroupSubmitInfo.PSIGNALSEMAPHOREDEVICEINDICES, memAddressSafe(value)); nsignalSemaphoreCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nwaitSemaphoreCount(struct) != 0) {
            check(memGetAddress(struct + VkDeviceGroupSubmitInfo.PWAITSEMAPHOREDEVICEINDICES));
        }
        if (ncommandBufferCount(struct) != 0) {
            check(memGetAddress(struct + VkDeviceGroupSubmitInfo.PCOMMANDBUFFERDEVICEMASKS));
        }
        if (nsignalSemaphoreCount(struct) != 0) {
            check(memGetAddress(struct + VkDeviceGroupSubmitInfo.PSIGNALSEMAPHOREDEVICEINDICES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkDeviceGroupSubmitInfo} structs. */
    public static class Buffer extends StructBuffer<VkDeviceGroupSubmitInfo, Buffer> implements NativeResource {

        private static final VkDeviceGroupSubmitInfo ELEMENT_FACTORY = VkDeviceGroupSubmitInfo.create(-1L);

        /**
         * Creates a new {@code VkDeviceGroupSubmitInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceGroupSubmitInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceGroupSubmitInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceGroupSubmitInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceGroupSubmitInfo.npNext(address()); }
        /** @return the value of the {@code waitSemaphoreCount} field. */
        @NativeType("uint32_t")
        public int waitSemaphoreCount() { return VkDeviceGroupSubmitInfo.nwaitSemaphoreCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pWaitSemaphoreDeviceIndices} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pWaitSemaphoreDeviceIndices() { return VkDeviceGroupSubmitInfo.npWaitSemaphoreDeviceIndices(address()); }
        /** @return the value of the {@code commandBufferCount} field. */
        @NativeType("uint32_t")
        public int commandBufferCount() { return VkDeviceGroupSubmitInfo.ncommandBufferCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pCommandBufferDeviceMasks} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pCommandBufferDeviceMasks() { return VkDeviceGroupSubmitInfo.npCommandBufferDeviceMasks(address()); }
        /** @return the value of the {@code signalSemaphoreCount} field. */
        @NativeType("uint32_t")
        public int signalSemaphoreCount() { return VkDeviceGroupSubmitInfo.nsignalSemaphoreCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pSignalSemaphoreDeviceIndices} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pSignalSemaphoreDeviceIndices() { return VkDeviceGroupSubmitInfo.npSignalSemaphoreDeviceIndices(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceGroupSubmitInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceGroupSubmitInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO} value to the {@code sType} field. */
        public VkDeviceGroupSubmitInfo.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceGroupSubmitInfo.Buffer pNext(@NativeType("void const *") long value) { VkDeviceGroupSubmitInfo.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pWaitSemaphoreDeviceIndices} field. */
        public VkDeviceGroupSubmitInfo.Buffer pWaitSemaphoreDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkDeviceGroupSubmitInfo.npWaitSemaphoreDeviceIndices(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pCommandBufferDeviceMasks} field. */
        public VkDeviceGroupSubmitInfo.Buffer pCommandBufferDeviceMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkDeviceGroupSubmitInfo.npCommandBufferDeviceMasks(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pSignalSemaphoreDeviceIndices} field. */
        public VkDeviceGroupSubmitInfo.Buffer pSignalSemaphoreDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkDeviceGroupSubmitInfo.npSignalSemaphoreDeviceIndices(address(), value); return this; }

    }

}
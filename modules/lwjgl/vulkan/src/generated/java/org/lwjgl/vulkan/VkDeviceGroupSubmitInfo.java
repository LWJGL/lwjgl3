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
 * Structure indicating which physical devices execute semaphore operations and command buffers.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this structure is not present, semaphore operations and command buffers execute on device index zero.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code waitSemaphoreCount} <b>must</b> equal {@link VkSubmitInfo}{@code ::waitSemaphoreCount}</li>
 * <li>{@code commandBufferCount} <b>must</b> equal {@link VkSubmitInfo}{@code ::commandBufferCount}</li>
 * <li>{@code signalSemaphoreCount} <b>must</b> equal {@link VkSubmitInfo}{@code ::signalSemaphoreCount}</li>
 * <li>All elements of {@code pWaitSemaphoreDeviceIndices} and {@code pSignalSemaphoreDeviceIndices} <b>must</b> be valid device indices</li>
 * <li>All elements of {@code pCommandBufferDeviceMasks} <b>must</b> be valid device masks</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO}</li>
 * <li>If {@code waitSemaphoreCount} is not 0, {@code pWaitSemaphoreDeviceIndices} <b>must</b> be a valid pointer to an array of {@code waitSemaphoreCount} {@code uint32_t} values</li>
 * <li>If {@code commandBufferCount} is not 0, {@code pCommandBufferDeviceMasks} <b>must</b> be a valid pointer to an array of {@code commandBufferCount} {@code uint32_t} values</li>
 * <li>If {@code signalSemaphoreCount} is not 0, {@code pSignalSemaphoreDeviceIndices} <b>must</b> be a valid pointer to an array of {@code signalSemaphoreCount} {@code uint32_t} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceGroupSubmitInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #waitSemaphoreCount};
 *     uint32_t const * {@link #pWaitSemaphoreDeviceIndices};
 *     uint32_t {@link #commandBufferCount};
 *     uint32_t const * {@link #pCommandBufferDeviceMasks};
 *     uint32_t {@link #signalSemaphoreCount};
 *     uint32_t const * {@link #pSignalSemaphoreDeviceIndices};
 * }</code></pre>
 */
public class VkDeviceGroupSubmitInfo extends Struct implements NativeResource {

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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the number of elements in the {@code pWaitSemaphoreDeviceIndices} array. */
    @NativeType("uint32_t")
    public int waitSemaphoreCount() { return nwaitSemaphoreCount(address()); }
    /** a pointer to an array of {@code waitSemaphoreCount} device indices indicating which physical device executes the semaphore wait operation in the corresponding element of {@link VkSubmitInfo}{@code ::pWaitSemaphores}. */
    @Nullable
    @NativeType("uint32_t const *")
    public IntBuffer pWaitSemaphoreDeviceIndices() { return npWaitSemaphoreDeviceIndices(address()); }
    /** the number of elements in the {@code pCommandBufferDeviceMasks} array. */
    @NativeType("uint32_t")
    public int commandBufferCount() { return ncommandBufferCount(address()); }
    /** a pointer to an array of {@code commandBufferCount} device masks indicating which physical devices execute the command buffer in the corresponding element of {@link VkSubmitInfo}{@code ::pCommandBuffers}. A physical device executes the command buffer if the corresponding bit is set in the mask. */
    @Nullable
    @NativeType("uint32_t const *")
    public IntBuffer pCommandBufferDeviceMasks() { return npCommandBufferDeviceMasks(address()); }
    /** the number of elements in the {@code pSignalSemaphoreDeviceIndices} array. */
    @NativeType("uint32_t")
    public int signalSemaphoreCount() { return nsignalSemaphoreCount(address()); }
    /** a pointer to an array of {@code signalSemaphoreCount} device indices indicating which physical device executes the semaphore signal operation in the corresponding element of {@link VkSubmitInfo}{@code ::pSignalSemaphores}. */
    @Nullable
    @NativeType("uint32_t const *")
    public IntBuffer pSignalSemaphoreDeviceIndices() { return npSignalSemaphoreDeviceIndices(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDeviceGroupSubmitInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO} value to the {@link #sType} field. */
    public VkDeviceGroupSubmitInfo sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDeviceGroupSubmitInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pWaitSemaphoreDeviceIndices} field. */
    public VkDeviceGroupSubmitInfo pWaitSemaphoreDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npWaitSemaphoreDeviceIndices(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pCommandBufferDeviceMasks} field. */
    public VkDeviceGroupSubmitInfo pCommandBufferDeviceMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npCommandBufferDeviceMasks(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pSignalSemaphoreDeviceIndices} field. */
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
        return wrap(VkDeviceGroupSubmitInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceGroupSubmitInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupSubmitInfo calloc() {
        return wrap(VkDeviceGroupSubmitInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceGroupSubmitInfo} instance allocated with {@link BufferUtils}. */
    public static VkDeviceGroupSubmitInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceGroupSubmitInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceGroupSubmitInfo} instance for the specified memory address. */
    public static VkDeviceGroupSubmitInfo create(long address) {
        return wrap(VkDeviceGroupSubmitInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGroupSubmitInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceGroupSubmitInfo.class, address);
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSubmitInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSubmitInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSubmitInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceGroupSubmitInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSubmitInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGroupSubmitInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
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
        return wrap(VkDeviceGroupSubmitInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceGroupSubmitInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupSubmitInfo calloc(MemoryStack stack) {
        return wrap(VkDeviceGroupSubmitInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSubmitInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupSubmitInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSubmitInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceGroupSubmitInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceGroupSubmitInfo.PNEXT); }
    /** Unsafe version of {@link #waitSemaphoreCount}. */
    public static int nwaitSemaphoreCount(long struct) { return UNSAFE.getInt(null, struct + VkDeviceGroupSubmitInfo.WAITSEMAPHORECOUNT); }
    /** Unsafe version of {@link #pWaitSemaphoreDeviceIndices() pWaitSemaphoreDeviceIndices}. */
    @Nullable public static IntBuffer npWaitSemaphoreDeviceIndices(long struct) { return memIntBufferSafe(memGetAddress(struct + VkDeviceGroupSubmitInfo.PWAITSEMAPHOREDEVICEINDICES), nwaitSemaphoreCount(struct)); }
    /** Unsafe version of {@link #commandBufferCount}. */
    public static int ncommandBufferCount(long struct) { return UNSAFE.getInt(null, struct + VkDeviceGroupSubmitInfo.COMMANDBUFFERCOUNT); }
    /** Unsafe version of {@link #pCommandBufferDeviceMasks() pCommandBufferDeviceMasks}. */
    @Nullable public static IntBuffer npCommandBufferDeviceMasks(long struct) { return memIntBufferSafe(memGetAddress(struct + VkDeviceGroupSubmitInfo.PCOMMANDBUFFERDEVICEMASKS), ncommandBufferCount(struct)); }
    /** Unsafe version of {@link #signalSemaphoreCount}. */
    public static int nsignalSemaphoreCount(long struct) { return UNSAFE.getInt(null, struct + VkDeviceGroupSubmitInfo.SIGNALSEMAPHORECOUNT); }
    /** Unsafe version of {@link #pSignalSemaphoreDeviceIndices() pSignalSemaphoreDeviceIndices}. */
    @Nullable public static IntBuffer npSignalSemaphoreDeviceIndices(long struct) { return memIntBufferSafe(memGetAddress(struct + VkDeviceGroupSubmitInfo.PSIGNALSEMAPHOREDEVICEINDICES), nsignalSemaphoreCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceGroupSubmitInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceGroupSubmitInfo.PNEXT, value); }
    /** Sets the specified value to the {@code waitSemaphoreCount} field of the specified {@code struct}. */
    public static void nwaitSemaphoreCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceGroupSubmitInfo.WAITSEMAPHORECOUNT, value); }
    /** Unsafe version of {@link #pWaitSemaphoreDeviceIndices(IntBuffer) pWaitSemaphoreDeviceIndices}. */
    public static void npWaitSemaphoreDeviceIndices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkDeviceGroupSubmitInfo.PWAITSEMAPHOREDEVICEINDICES, memAddressSafe(value)); nwaitSemaphoreCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code commandBufferCount} field of the specified {@code struct}. */
    public static void ncommandBufferCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceGroupSubmitInfo.COMMANDBUFFERCOUNT, value); }
    /** Unsafe version of {@link #pCommandBufferDeviceMasks(IntBuffer) pCommandBufferDeviceMasks}. */
    public static void npCommandBufferDeviceMasks(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkDeviceGroupSubmitInfo.PCOMMANDBUFFERDEVICEMASKS, memAddressSafe(value)); ncommandBufferCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code signalSemaphoreCount} field of the specified {@code struct}. */
    public static void nsignalSemaphoreCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceGroupSubmitInfo.SIGNALSEMAPHORECOUNT, value); }
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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceGroupSubmitInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceGroupSubmitInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDeviceGroupSubmitInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceGroupSubmitInfo.nsType(address()); }
        /** @return the value of the {@link VkDeviceGroupSubmitInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceGroupSubmitInfo.npNext(address()); }
        /** @return the value of the {@link VkDeviceGroupSubmitInfo#waitSemaphoreCount} field. */
        @NativeType("uint32_t")
        public int waitSemaphoreCount() { return VkDeviceGroupSubmitInfo.nwaitSemaphoreCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkDeviceGroupSubmitInfo#pWaitSemaphoreDeviceIndices} field. */
        @Nullable
        @NativeType("uint32_t const *")
        public IntBuffer pWaitSemaphoreDeviceIndices() { return VkDeviceGroupSubmitInfo.npWaitSemaphoreDeviceIndices(address()); }
        /** @return the value of the {@link VkDeviceGroupSubmitInfo#commandBufferCount} field. */
        @NativeType("uint32_t")
        public int commandBufferCount() { return VkDeviceGroupSubmitInfo.ncommandBufferCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkDeviceGroupSubmitInfo#pCommandBufferDeviceMasks} field. */
        @Nullable
        @NativeType("uint32_t const *")
        public IntBuffer pCommandBufferDeviceMasks() { return VkDeviceGroupSubmitInfo.npCommandBufferDeviceMasks(address()); }
        /** @return the value of the {@link VkDeviceGroupSubmitInfo#signalSemaphoreCount} field. */
        @NativeType("uint32_t")
        public int signalSemaphoreCount() { return VkDeviceGroupSubmitInfo.nsignalSemaphoreCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkDeviceGroupSubmitInfo#pSignalSemaphoreDeviceIndices} field. */
        @Nullable
        @NativeType("uint32_t const *")
        public IntBuffer pSignalSemaphoreDeviceIndices() { return VkDeviceGroupSubmitInfo.npSignalSemaphoreDeviceIndices(address()); }

        /** Sets the specified value to the {@link VkDeviceGroupSubmitInfo#sType} field. */
        public VkDeviceGroupSubmitInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceGroupSubmitInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO} value to the {@link VkDeviceGroupSubmitInfo#sType} field. */
        public VkDeviceGroupSubmitInfo.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO); }
        /** Sets the specified value to the {@link VkDeviceGroupSubmitInfo#pNext} field. */
        public VkDeviceGroupSubmitInfo.Buffer pNext(@NativeType("void const *") long value) { VkDeviceGroupSubmitInfo.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkDeviceGroupSubmitInfo#pWaitSemaphoreDeviceIndices} field. */
        public VkDeviceGroupSubmitInfo.Buffer pWaitSemaphoreDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkDeviceGroupSubmitInfo.npWaitSemaphoreDeviceIndices(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkDeviceGroupSubmitInfo#pCommandBufferDeviceMasks} field. */
        public VkDeviceGroupSubmitInfo.Buffer pCommandBufferDeviceMasks(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkDeviceGroupSubmitInfo.npCommandBufferDeviceMasks(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkDeviceGroupSubmitInfo#pSignalSemaphoreDeviceIndices} field. */
        public VkDeviceGroupSubmitInfo.Buffer pSignalSemaphoreDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkDeviceGroupSubmitInfo.npSignalSemaphoreDeviceIndices(address(), value); return this; }

    }

}
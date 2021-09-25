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
 * Structure specifying parameters of a newly created swapchain object.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this structure is not present, {@code modes} is considered to be {@link KHRSwapchain#VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSwapchain#VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR}</li>
 * <li>{@code modes} <b>must</b> be a valid combination of {@code VkDeviceGroupPresentModeFlagBitsKHR} values</li>
 * <li>{@code modes} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceGroupSwapchainCreateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDeviceGroupPresentModeFlagsKHR {@link #modes};
 * }</code></pre>
 */
public class VkDeviceGroupSwapchainCreateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MODES;

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
        MODES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkDeviceGroupSwapchainCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceGroupSwapchainCreateInfoKHR(ByteBuffer container) {
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
    /** a bitfield of modes that the swapchain <b>can</b> be used with. */
    @NativeType("VkDeviceGroupPresentModeFlagsKHR")
    public int modes() { return nmodes(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDeviceGroupSwapchainCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRSwapchain#VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR} value to the {@link #sType} field. */
    public VkDeviceGroupSwapchainCreateInfoKHR sType$Default() { return sType(KHRSwapchain.VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDeviceGroupSwapchainCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #modes} field. */
    public VkDeviceGroupSwapchainCreateInfoKHR modes(@NativeType("VkDeviceGroupPresentModeFlagsKHR") int value) { nmodes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceGroupSwapchainCreateInfoKHR set(
        int sType,
        long pNext,
        int modes
    ) {
        sType(sType);
        pNext(pNext);
        modes(modes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceGroupSwapchainCreateInfoKHR set(VkDeviceGroupSwapchainCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceGroupSwapchainCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupSwapchainCreateInfoKHR malloc() {
        return wrap(VkDeviceGroupSwapchainCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceGroupSwapchainCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceGroupSwapchainCreateInfoKHR calloc() {
        return wrap(VkDeviceGroupSwapchainCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceGroupSwapchainCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceGroupSwapchainCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceGroupSwapchainCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceGroupSwapchainCreateInfoKHR} instance for the specified memory address. */
    public static VkDeviceGroupSwapchainCreateInfoKHR create(long address) {
        return wrap(VkDeviceGroupSwapchainCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGroupSwapchainCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceGroupSwapchainCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkDeviceGroupSwapchainCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSwapchainCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupSwapchainCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSwapchainCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupSwapchainCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSwapchainCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceGroupSwapchainCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSwapchainCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceGroupSwapchainCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSwapchainCreateInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSwapchainCreateInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSwapchainCreateInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSwapchainCreateInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSwapchainCreateInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSwapchainCreateInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSwapchainCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDeviceGroupSwapchainCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDeviceGroupSwapchainCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupSwapchainCreateInfoKHR malloc(MemoryStack stack) {
        return wrap(VkDeviceGroupSwapchainCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceGroupSwapchainCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceGroupSwapchainCreateInfoKHR calloc(MemoryStack stack) {
        return wrap(VkDeviceGroupSwapchainCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceGroupSwapchainCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSwapchainCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceGroupSwapchainCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceGroupSwapchainCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceGroupSwapchainCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceGroupSwapchainCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #modes}. */
    public static int nmodes(long struct) { return UNSAFE.getInt(null, struct + VkDeviceGroupSwapchainCreateInfoKHR.MODES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceGroupSwapchainCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceGroupSwapchainCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #modes(int) modes}. */
    public static void nmodes(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceGroupSwapchainCreateInfoKHR.MODES, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceGroupSwapchainCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkDeviceGroupSwapchainCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkDeviceGroupSwapchainCreateInfoKHR ELEMENT_FACTORY = VkDeviceGroupSwapchainCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceGroupSwapchainCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceGroupSwapchainCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceGroupSwapchainCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDeviceGroupSwapchainCreateInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceGroupSwapchainCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkDeviceGroupSwapchainCreateInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceGroupSwapchainCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkDeviceGroupSwapchainCreateInfoKHR#modes} field. */
        @NativeType("VkDeviceGroupPresentModeFlagsKHR")
        public int modes() { return VkDeviceGroupSwapchainCreateInfoKHR.nmodes(address()); }

        /** Sets the specified value to the {@link VkDeviceGroupSwapchainCreateInfoKHR#sType} field. */
        public VkDeviceGroupSwapchainCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceGroupSwapchainCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRSwapchain#VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR} value to the {@link VkDeviceGroupSwapchainCreateInfoKHR#sType} field. */
        public VkDeviceGroupSwapchainCreateInfoKHR.Buffer sType$Default() { return sType(KHRSwapchain.VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@link VkDeviceGroupSwapchainCreateInfoKHR#pNext} field. */
        public VkDeviceGroupSwapchainCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkDeviceGroupSwapchainCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceGroupSwapchainCreateInfoKHR#modes} field. */
        public VkDeviceGroupSwapchainCreateInfoKHR.Buffer modes(@NativeType("VkDeviceGroupPresentModeFlagsKHR") int value) { VkDeviceGroupSwapchainCreateInfoKHR.nmodes(address(), value); return this; }

    }

}
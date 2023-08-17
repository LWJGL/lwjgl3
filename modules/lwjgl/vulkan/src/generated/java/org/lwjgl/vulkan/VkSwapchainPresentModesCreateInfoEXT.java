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
 * All presentation modes usable by the swapchain.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>Each entry in pPresentModes <b>must</b> be one of the {@code VkPresentModeKHR} values returned by {@code vkGetPhysicalDeviceSurfacePresentModesKHR} for the surface</li>
 * <li>The entries in pPresentModes <b>must</b> be a subset of the present modes returned in {@link VkSurfacePresentModeCompatibilityEXT}{@code ::pPresentModes}, given {@link VkSwapchainCreateInfoKHR}{@code ::presentMode} in {@link VkSurfacePresentModeEXT}</li>
 * <li>{@link VkSwapchainCreateInfoKHR}{@code ::presentMode} <b>must</b> be included in {@code pPresentModes}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSwapchainMaintenance1#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_EXT}</li>
 * <li>{@code pPresentModes} <b>must</b> be a valid pointer to an array of {@code presentModeCount} valid {@code VkPresentModeKHR} values</li>
 * <li>{@code presentModeCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSwapchainPresentModesCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #presentModeCount};
 *     VkPresentModeKHR const * {@link #pPresentModes};
 * }</code></pre>
 */
public class VkSwapchainPresentModesCreateInfoEXT extends Struct<VkSwapchainPresentModesCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTMODECOUNT,
        PPRESENTMODES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTMODECOUNT = layout.offsetof(2);
        PPRESENTMODES = layout.offsetof(3);
    }

    protected VkSwapchainPresentModesCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSwapchainPresentModesCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSwapchainPresentModesCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkSwapchainPresentModesCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSwapchainPresentModesCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the number of presentation modes provided. */
    @NativeType("uint32_t")
    public int presentModeCount() { return npresentModeCount(address()); }
    /** a list of presentation modes with {@code presentModeCount} entries */
    @NativeType("VkPresentModeKHR const *")
    public IntBuffer pPresentModes() { return npPresentModes(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSwapchainPresentModesCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTSwapchainMaintenance1#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkSwapchainPresentModesCreateInfoEXT sType$Default() { return sType(EXTSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSwapchainPresentModesCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pPresentModes} field. */
    public VkSwapchainPresentModesCreateInfoEXT pPresentModes(@NativeType("VkPresentModeKHR const *") IntBuffer value) { npPresentModes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSwapchainPresentModesCreateInfoEXT set(
        int sType,
        long pNext,
        IntBuffer pPresentModes
    ) {
        sType(sType);
        pNext(pNext);
        pPresentModes(pPresentModes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSwapchainPresentModesCreateInfoEXT set(VkSwapchainPresentModesCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSwapchainPresentModesCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSwapchainPresentModesCreateInfoEXT malloc() {
        return new VkSwapchainPresentModesCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainPresentModesCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSwapchainPresentModesCreateInfoEXT calloc() {
        return new VkSwapchainPresentModesCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainPresentModesCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkSwapchainPresentModesCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainPresentModesCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSwapchainPresentModesCreateInfoEXT} instance for the specified memory address. */
    public static VkSwapchainPresentModesCreateInfoEXT create(long address) {
        return new VkSwapchainPresentModesCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSwapchainPresentModesCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkSwapchainPresentModesCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkSwapchainPresentModesCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentModesCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentModesCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentModesCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentModesCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentModesCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSwapchainPresentModesCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentModesCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSwapchainPresentModesCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSwapchainPresentModesCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainPresentModesCreateInfoEXT malloc(MemoryStack stack) {
        return new VkSwapchainPresentModesCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSwapchainPresentModesCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainPresentModesCreateInfoEXT calloc(MemoryStack stack) {
        return new VkSwapchainPresentModesCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSwapchainPresentModesCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentModesCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentModesCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentModesCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainPresentModesCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSwapchainPresentModesCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #presentModeCount}. */
    public static int npresentModeCount(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainPresentModesCreateInfoEXT.PRESENTMODECOUNT); }
    /** Unsafe version of {@link #pPresentModes() pPresentModes}. */
    public static IntBuffer npPresentModes(long struct) { return memIntBuffer(memGetAddress(struct + VkSwapchainPresentModesCreateInfoEXT.PPRESENTMODES), npresentModeCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainPresentModesCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSwapchainPresentModesCreateInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code presentModeCount} field of the specified {@code struct}. */
    public static void npresentModeCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainPresentModesCreateInfoEXT.PRESENTMODECOUNT, value); }
    /** Unsafe version of {@link #pPresentModes(IntBuffer) pPresentModes}. */
    public static void npPresentModes(long struct, IntBuffer value) { memPutAddress(struct + VkSwapchainPresentModesCreateInfoEXT.PPRESENTMODES, memAddress(value)); npresentModeCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkSwapchainPresentModesCreateInfoEXT.PPRESENTMODES));
    }

    // -----------------------------------

    /** An array of {@link VkSwapchainPresentModesCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkSwapchainPresentModesCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkSwapchainPresentModesCreateInfoEXT ELEMENT_FACTORY = VkSwapchainPresentModesCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkSwapchainPresentModesCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSwapchainPresentModesCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSwapchainPresentModesCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSwapchainPresentModesCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSwapchainPresentModesCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkSwapchainPresentModesCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSwapchainPresentModesCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkSwapchainPresentModesCreateInfoEXT#presentModeCount} field. */
        @NativeType("uint32_t")
        public int presentModeCount() { return VkSwapchainPresentModesCreateInfoEXT.npresentModeCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkSwapchainPresentModesCreateInfoEXT#pPresentModes} field. */
        @NativeType("VkPresentModeKHR const *")
        public IntBuffer pPresentModes() { return VkSwapchainPresentModesCreateInfoEXT.npPresentModes(address()); }

        /** Sets the specified value to the {@link VkSwapchainPresentModesCreateInfoEXT#sType} field. */
        public VkSwapchainPresentModesCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSwapchainPresentModesCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTSwapchainMaintenance1#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_EXT} value to the {@link VkSwapchainPresentModesCreateInfoEXT#sType} field. */
        public VkSwapchainPresentModesCreateInfoEXT.Buffer sType$Default() { return sType(EXTSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkSwapchainPresentModesCreateInfoEXT#pNext} field. */
        public VkSwapchainPresentModesCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkSwapchainPresentModesCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkSwapchainPresentModesCreateInfoEXT#pPresentModes} field. */
        public VkSwapchainPresentModesCreateInfoEXT.Buffer pPresentModes(@NativeType("VkPresentModeKHR const *") IntBuffer value) { VkSwapchainPresentModesCreateInfoEXT.npPresentModes(address(), value); return this; }

    }

}
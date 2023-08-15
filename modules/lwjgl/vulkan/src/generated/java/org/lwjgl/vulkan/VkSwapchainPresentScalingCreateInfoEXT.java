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
 * Scaling behavior when presenting to the surface.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code scalingBehavior} is 0, the result of presenting a swapchain image with dimensions that do not match the surface dimensions is implementation and platform-dependent. If {@code presentGravityX} or {@code presentGravityY} are 0, the presentation gravity <b>must</b> match that defined by the native platform surface on platforms which define surface gravity.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code presentGravityX} is 0, {@code presentGravityY} <b>must</b> be 0</li>
 * <li>If {@code presentGravityX} is not 0, {@code presentGravityY} <b>must</b> not be 0</li>
 * <li>{@code scalingBehavior} <b>must</b> not have more than one bit set</li>
 * <li>{@code presentGravityX} <b>must</b> not have more than one bit set</li>
 * <li>{@code presentGravityY} <b>must</b> not have more than one bit set</li>
 * <li>{@code scalingBehavior} <b>must</b> be a valid scaling method for the surface as returned in {@link VkSurfacePresentScalingCapabilitiesEXT}{@code ::supportedPresentScaling}, given {@link VkSwapchainCreateInfoKHR}{@code ::presentMode} in {@link VkSurfacePresentModeEXT}</li>
 * <li>If the swapchain is created with {@link VkSwapchainPresentModesCreateInfoEXT}, {@code scalingBehavior} <b>must</b> be a valid scaling method for the surface as returned in {@link VkSurfacePresentScalingCapabilitiesEXT}{@code ::supportedPresentScaling}, given each present mode in {@link VkSwapchainPresentModesCreateInfoEXT}{@code ::pPresentModes} in {@link VkSurfacePresentModeEXT}</li>
 * <li>{@code presentGravityX} <b>must</b> be a valid x-axis present gravity for the surface as returned in {@link VkSurfacePresentScalingCapabilitiesEXT}{@code ::supportedPresentGravityX}, given {@link VkSwapchainCreateInfoKHR}{@code ::presentMode} in {@link VkSurfacePresentModeEXT}</li>
 * <li>If the swapchain is created with {@link VkSwapchainPresentModesCreateInfoEXT}, {@code presentGravityX} <b>must</b> be a valid x-axis present gravity for the surface as returned in {@link VkSurfacePresentScalingCapabilitiesEXT}{@code ::supportedPresentGravityX}, given each present mode in {@link VkSwapchainPresentModesCreateInfoEXT}{@code ::pPresentModes} in {@link VkSurfacePresentModeEXT}</li>
 * <li>{@code presentGravityY} <b>must</b> be a valid y-axis present gravity for the surface as returned in {@link VkSurfacePresentScalingCapabilitiesEXT}{@code ::supportedPresentGravityY}, given {@link VkSwapchainCreateInfoKHR}{@code ::presentMode} in {@link VkSurfacePresentModeEXT}</li>
 * <li>If the swapchain is created with {@link VkSwapchainPresentModesCreateInfoEXT}, {@code presentGravityY} <b>must</b> be a valid y-axis present gravity for the surface as returned in {@link VkSurfacePresentScalingCapabilitiesEXT}{@code ::supportedPresentGravityY}, given each present mode in {@link VkSwapchainPresentModesCreateInfoEXT}{@code ::pPresentModes} in {@link VkSurfacePresentModeEXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSwapchainMaintenance1#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT}</li>
 * <li>{@code scalingBehavior} <b>must</b> be a valid combination of {@code VkPresentScalingFlagBitsEXT} values</li>
 * <li>{@code presentGravityX} <b>must</b> be a valid combination of {@code VkPresentGravityFlagBitsEXT} values</li>
 * <li>{@code presentGravityY} <b>must</b> be a valid combination of {@code VkPresentGravityFlagBitsEXT} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSwapchainPresentScalingCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPresentScalingFlagsEXT {@link #scalingBehavior};
 *     VkPresentGravityFlagsEXT {@link #presentGravityX};
 *     VkPresentGravityFlagsEXT {@link #presentGravityY};
 * }</code></pre>
 */
public class VkSwapchainPresentScalingCreateInfoEXT extends Struct<VkSwapchainPresentScalingCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SCALINGBEHAVIOR,
        PRESENTGRAVITYX,
        PRESENTGRAVITYY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SCALINGBEHAVIOR = layout.offsetof(2);
        PRESENTGRAVITYX = layout.offsetof(3);
        PRESENTGRAVITYY = layout.offsetof(4);
    }

    protected VkSwapchainPresentScalingCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSwapchainPresentScalingCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSwapchainPresentScalingCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkSwapchainPresentScalingCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSwapchainPresentScalingCreateInfoEXT(ByteBuffer container) {
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
    /** 0 or the scaling method to use when the dimensions of the surface and swapchain images differ. */
    @NativeType("VkPresentScalingFlagsEXT")
    public int scalingBehavior() { return nscalingBehavior(address()); }
    /** 0 or the x-axis direction in which swapchain image pixels gravitate relative to the surface when {@code scalingBehavior} does not result in a one-to-one pixel mapping between the scaled swapchain image and the surface. */
    @NativeType("VkPresentGravityFlagsEXT")
    public int presentGravityX() { return npresentGravityX(address()); }
    /** 0 or the y-axis direction in which swapchain image pixels gravitate relative to the surface when {@code scalingBehavior} does not result in a one-to-one pixel mapping between the scaled swapchain image and the surface. */
    @NativeType("VkPresentGravityFlagsEXT")
    public int presentGravityY() { return npresentGravityY(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSwapchainPresentScalingCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTSwapchainMaintenance1#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkSwapchainPresentScalingCreateInfoEXT sType$Default() { return sType(EXTSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSwapchainPresentScalingCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #scalingBehavior} field. */
    public VkSwapchainPresentScalingCreateInfoEXT scalingBehavior(@NativeType("VkPresentScalingFlagsEXT") int value) { nscalingBehavior(address(), value); return this; }
    /** Sets the specified value to the {@link #presentGravityX} field. */
    public VkSwapchainPresentScalingCreateInfoEXT presentGravityX(@NativeType("VkPresentGravityFlagsEXT") int value) { npresentGravityX(address(), value); return this; }
    /** Sets the specified value to the {@link #presentGravityY} field. */
    public VkSwapchainPresentScalingCreateInfoEXT presentGravityY(@NativeType("VkPresentGravityFlagsEXT") int value) { npresentGravityY(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSwapchainPresentScalingCreateInfoEXT set(
        int sType,
        long pNext,
        int scalingBehavior,
        int presentGravityX,
        int presentGravityY
    ) {
        sType(sType);
        pNext(pNext);
        scalingBehavior(scalingBehavior);
        presentGravityX(presentGravityX);
        presentGravityY(presentGravityY);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSwapchainPresentScalingCreateInfoEXT set(VkSwapchainPresentScalingCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSwapchainPresentScalingCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSwapchainPresentScalingCreateInfoEXT malloc() {
        return new VkSwapchainPresentScalingCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainPresentScalingCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSwapchainPresentScalingCreateInfoEXT calloc() {
        return new VkSwapchainPresentScalingCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainPresentScalingCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkSwapchainPresentScalingCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainPresentScalingCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSwapchainPresentScalingCreateInfoEXT} instance for the specified memory address. */
    public static VkSwapchainPresentScalingCreateInfoEXT create(long address) {
        return new VkSwapchainPresentScalingCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSwapchainPresentScalingCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkSwapchainPresentScalingCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkSwapchainPresentScalingCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentScalingCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentScalingCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentScalingCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentScalingCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentScalingCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSwapchainPresentScalingCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentScalingCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSwapchainPresentScalingCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSwapchainPresentScalingCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainPresentScalingCreateInfoEXT malloc(MemoryStack stack) {
        return new VkSwapchainPresentScalingCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSwapchainPresentScalingCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainPresentScalingCreateInfoEXT calloc(MemoryStack stack) {
        return new VkSwapchainPresentScalingCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSwapchainPresentScalingCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentScalingCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentScalingCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentScalingCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainPresentScalingCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSwapchainPresentScalingCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #scalingBehavior}. */
    public static int nscalingBehavior(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainPresentScalingCreateInfoEXT.SCALINGBEHAVIOR); }
    /** Unsafe version of {@link #presentGravityX}. */
    public static int npresentGravityX(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainPresentScalingCreateInfoEXT.PRESENTGRAVITYX); }
    /** Unsafe version of {@link #presentGravityY}. */
    public static int npresentGravityY(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainPresentScalingCreateInfoEXT.PRESENTGRAVITYY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainPresentScalingCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSwapchainPresentScalingCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #scalingBehavior(int) scalingBehavior}. */
    public static void nscalingBehavior(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainPresentScalingCreateInfoEXT.SCALINGBEHAVIOR, value); }
    /** Unsafe version of {@link #presentGravityX(int) presentGravityX}. */
    public static void npresentGravityX(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainPresentScalingCreateInfoEXT.PRESENTGRAVITYX, value); }
    /** Unsafe version of {@link #presentGravityY(int) presentGravityY}. */
    public static void npresentGravityY(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainPresentScalingCreateInfoEXT.PRESENTGRAVITYY, value); }

    // -----------------------------------

    /** An array of {@link VkSwapchainPresentScalingCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkSwapchainPresentScalingCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkSwapchainPresentScalingCreateInfoEXT ELEMENT_FACTORY = VkSwapchainPresentScalingCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkSwapchainPresentScalingCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSwapchainPresentScalingCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSwapchainPresentScalingCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSwapchainPresentScalingCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSwapchainPresentScalingCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkSwapchainPresentScalingCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSwapchainPresentScalingCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkSwapchainPresentScalingCreateInfoEXT#scalingBehavior} field. */
        @NativeType("VkPresentScalingFlagsEXT")
        public int scalingBehavior() { return VkSwapchainPresentScalingCreateInfoEXT.nscalingBehavior(address()); }
        /** @return the value of the {@link VkSwapchainPresentScalingCreateInfoEXT#presentGravityX} field. */
        @NativeType("VkPresentGravityFlagsEXT")
        public int presentGravityX() { return VkSwapchainPresentScalingCreateInfoEXT.npresentGravityX(address()); }
        /** @return the value of the {@link VkSwapchainPresentScalingCreateInfoEXT#presentGravityY} field. */
        @NativeType("VkPresentGravityFlagsEXT")
        public int presentGravityY() { return VkSwapchainPresentScalingCreateInfoEXT.npresentGravityY(address()); }

        /** Sets the specified value to the {@link VkSwapchainPresentScalingCreateInfoEXT#sType} field. */
        public VkSwapchainPresentScalingCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSwapchainPresentScalingCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTSwapchainMaintenance1#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT} value to the {@link VkSwapchainPresentScalingCreateInfoEXT#sType} field. */
        public VkSwapchainPresentScalingCreateInfoEXT.Buffer sType$Default() { return sType(EXTSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkSwapchainPresentScalingCreateInfoEXT#pNext} field. */
        public VkSwapchainPresentScalingCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkSwapchainPresentScalingCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkSwapchainPresentScalingCreateInfoEXT#scalingBehavior} field. */
        public VkSwapchainPresentScalingCreateInfoEXT.Buffer scalingBehavior(@NativeType("VkPresentScalingFlagsEXT") int value) { VkSwapchainPresentScalingCreateInfoEXT.nscalingBehavior(address(), value); return this; }
        /** Sets the specified value to the {@link VkSwapchainPresentScalingCreateInfoEXT#presentGravityX} field. */
        public VkSwapchainPresentScalingCreateInfoEXT.Buffer presentGravityX(@NativeType("VkPresentGravityFlagsEXT") int value) { VkSwapchainPresentScalingCreateInfoEXT.npresentGravityX(address(), value); return this; }
        /** Sets the specified value to the {@link VkSwapchainPresentScalingCreateInfoEXT#presentGravityY} field. */
        public VkSwapchainPresentScalingCreateInfoEXT.Buffer presentGravityY(@NativeType("VkPresentGravityFlagsEXT") int value) { VkSwapchainPresentScalingCreateInfoEXT.npresentGravityY(address(), value); return this; }

    }

}
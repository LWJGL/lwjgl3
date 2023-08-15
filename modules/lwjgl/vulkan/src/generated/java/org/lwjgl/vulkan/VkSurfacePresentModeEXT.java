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
 * Structure describing present mode of a surface.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkSurfacePresentModeEXT} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceSurfaceInfo2KHR}, the values returned in {@link VkSurfaceCapabilitiesKHR}{@code ::minImageCount}, {@link VkSurfaceCapabilitiesKHR}{@code ::maxImageCount}, {@link VkSurfacePresentScalingCapabilitiesEXT}{@code ::minScaledImageExtent}, and {@link VkSurfacePresentScalingCapabilitiesEXT}{@code ::maxScaledImageExtent} are valid only for the specified {@code presentMode}. If {@code presentMode} is {@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR} or {@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR}, the per-present mode image counts <b>must</b> both be one. The per-present mode image counts <b>may</b> be less-than or greater-than the image counts returned when {@link VkSurfacePresentModeEXT} is not provided.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>If {@link VkSwapchainPresentModesCreateInfoEXT} is provided to swapchain creation, the requirements for forward progress may be less strict. For example, a FIFO swapchain might only require 2 images to guarantee forward progress, but a MAILBOX one might require 4. Without the per-present image counts, such an implementation would have to return 4 in {@link VkSurfaceCapabilitiesKHR}{@code ::minImageCount}, which pessimizes FIFO. Conversely, an implementation may return a low number for minImageCount, but internally bump the image count when application queries {@link KHRSwapchain#vkGetSwapchainImagesKHR GetSwapchainImagesKHR}, which can surprise applications, and is not discoverable until swapchain creation. Using {@link VkSurfacePresentModeEXT} and {@link VkSwapchainPresentModesCreateInfoEXT} together effectively removes this problem.</p>
 * 
 * <p>{@link VkSwapchainPresentModesCreateInfoEXT} is required for the specification to be backwards compatible with applications that do not know about, or make use of this feature.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code presentMode} <b>must</b> be a value reported by {@link KHRSurface#vkGetPhysicalDeviceSurfacePresentModesKHR GetPhysicalDeviceSurfacePresentModesKHR} for the specified surface.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSurfaceMaintenance1#VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_EXT STRUCTURE_TYPE_SURFACE_PRESENT_MODE_EXT}</li>
 * <li>{@code presentMode} <b>must</b> be a valid {@code VkPresentModeKHR} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSurfacePresentModeEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkPresentModeKHR {@link #presentMode};
 * }</code></pre>
 */
public class VkSurfacePresentModeEXT extends Struct<VkSurfacePresentModeEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTMODE;

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
        PRESENTMODE = layout.offsetof(2);
    }

    protected VkSurfacePresentModeEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSurfacePresentModeEXT create(long address, @Nullable ByteBuffer container) {
        return new VkSurfacePresentModeEXT(address, container);
    }

    /**
     * Creates a {@code VkSurfacePresentModeEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSurfacePresentModeEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the presentation mode the swapchain will use. */
    @NativeType("VkPresentModeKHR")
    public int presentMode() { return npresentMode(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSurfacePresentModeEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTSurfaceMaintenance1#VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_EXT STRUCTURE_TYPE_SURFACE_PRESENT_MODE_EXT} value to the {@link #sType} field. */
    public VkSurfacePresentModeEXT sType$Default() { return sType(EXTSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSurfacePresentModeEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #presentMode} field. */
    public VkSurfacePresentModeEXT presentMode(@NativeType("VkPresentModeKHR") int value) { npresentMode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSurfacePresentModeEXT set(
        int sType,
        long pNext,
        int presentMode
    ) {
        sType(sType);
        pNext(pNext);
        presentMode(presentMode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSurfacePresentModeEXT set(VkSurfacePresentModeEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSurfacePresentModeEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSurfacePresentModeEXT malloc() {
        return new VkSurfacePresentModeEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSurfacePresentModeEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSurfacePresentModeEXT calloc() {
        return new VkSurfacePresentModeEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSurfacePresentModeEXT} instance allocated with {@link BufferUtils}. */
    public static VkSurfacePresentModeEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfacePresentModeEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkSurfacePresentModeEXT} instance for the specified memory address. */
    public static VkSurfacePresentModeEXT create(long address) {
        return new VkSurfacePresentModeEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSurfacePresentModeEXT createSafe(long address) {
        return address == NULL ? null : new VkSurfacePresentModeEXT(address, null);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSurfacePresentModeEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSurfacePresentModeEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSurfacePresentModeEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfacePresentModeEXT malloc(MemoryStack stack) {
        return new VkSurfacePresentModeEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSurfacePresentModeEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfacePresentModeEXT calloc(MemoryStack stack) {
        return new VkSurfacePresentModeEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfacePresentModeEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfacePresentModeEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSurfacePresentModeEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSurfacePresentModeEXT.PNEXT); }
    /** Unsafe version of {@link #presentMode}. */
    public static int npresentMode(long struct) { return UNSAFE.getInt(null, struct + VkSurfacePresentModeEXT.PRESENTMODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSurfacePresentModeEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSurfacePresentModeEXT.PNEXT, value); }
    /** Unsafe version of {@link #presentMode(int) presentMode}. */
    public static void npresentMode(long struct, int value) { UNSAFE.putInt(null, struct + VkSurfacePresentModeEXT.PRESENTMODE, value); }

    // -----------------------------------

    /** An array of {@link VkSurfacePresentModeEXT} structs. */
    public static class Buffer extends StructBuffer<VkSurfacePresentModeEXT, Buffer> implements NativeResource {

        private static final VkSurfacePresentModeEXT ELEMENT_FACTORY = VkSurfacePresentModeEXT.create(-1L);

        /**
         * Creates a new {@code VkSurfacePresentModeEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSurfacePresentModeEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSurfacePresentModeEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSurfacePresentModeEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSurfacePresentModeEXT.nsType(address()); }
        /** @return the value of the {@link VkSurfacePresentModeEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSurfacePresentModeEXT.npNext(address()); }
        /** @return the value of the {@link VkSurfacePresentModeEXT#presentMode} field. */
        @NativeType("VkPresentModeKHR")
        public int presentMode() { return VkSurfacePresentModeEXT.npresentMode(address()); }

        /** Sets the specified value to the {@link VkSurfacePresentModeEXT#sType} field. */
        public VkSurfacePresentModeEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSurfacePresentModeEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTSurfaceMaintenance1#VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_EXT STRUCTURE_TYPE_SURFACE_PRESENT_MODE_EXT} value to the {@link VkSurfacePresentModeEXT#sType} field. */
        public VkSurfacePresentModeEXT.Buffer sType$Default() { return sType(EXTSurfaceMaintenance1.VK_STRUCTURE_TYPE_SURFACE_PRESENT_MODE_EXT); }
        /** Sets the specified value to the {@link VkSurfacePresentModeEXT#pNext} field. */
        public VkSurfacePresentModeEXT.Buffer pNext(@NativeType("void *") long value) { VkSurfacePresentModeEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkSurfacePresentModeEXT#presentMode} field. */
        public VkSurfacePresentModeEXT.Buffer presentMode(@NativeType("VkPresentModeKHR") int value) { VkSurfacePresentModeEXT.npresentMode(address(), value); return this; }

    }

}
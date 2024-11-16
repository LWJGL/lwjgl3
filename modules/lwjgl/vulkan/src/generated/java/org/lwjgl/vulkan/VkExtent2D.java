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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a two-dimensional extent.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDisplayModeParametersKHR}, {@link VkDisplayPlaneCapabilitiesKHR}, {@link VkDisplayPropertiesKHR}, {@link VkDisplaySurfaceCreateInfoKHR}, {@link VkFragmentShadingRateAttachmentInfoKHR}, {@link VkImageViewSampleWeightCreateInfoQCOM}, {@link VkMultisamplePropertiesEXT}, {@link VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM}, {@link VkPhysicalDeviceFragmentDensityMapPropertiesEXT}, {@link VkPhysicalDeviceFragmentShadingRateKHR}, {@link VkPhysicalDeviceFragmentShadingRatePropertiesKHR}, {@link VkPhysicalDeviceImageProcessing2PropertiesQCOM}, {@link VkPhysicalDeviceImageProcessingPropertiesQCOM}, {@link VkPhysicalDeviceRenderPassStripedPropertiesARM}, {@link VkPhysicalDeviceSampleLocationsPropertiesEXT}, {@link VkPhysicalDeviceShadingRateImagePropertiesNV}, {@link VkPipelineFragmentShadingRateStateCreateInfoKHR}, {@link VkRect2D}, {@link VkRectLayerKHR}, {@link VkRenderingFragmentShadingRateAttachmentInfoKHR}, {@link VkSampleLocationsInfoEXT}, {@link VkSamplerBlockMatchWindowCreateInfoQCOM}, {@link VkSurfaceCapabilities2EXT}, {@link VkSurfaceCapabilitiesKHR}, {@link VkSurfacePresentScalingCapabilitiesEXT}, {@link VkSwapchainCreateInfoKHR}, {@link VkTilePropertiesQCOM}, {@link VkVideoCapabilitiesKHR}, {@link VkVideoEncodeCapabilitiesKHR}, {@link VkVideoEncodeH265CapabilitiesKHR}, {@link VkVideoPictureResourceInfoKHR}, {@link VkVideoSessionCreateInfoKHR}, {@link KHRFragmentShadingRate#vkCmdSetFragmentShadingRateKHR CmdSetFragmentShadingRateKHR}, {@link HUAWEISubpassShading#vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI GetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI}, {@link VK10#vkGetRenderAreaGranularity GetRenderAreaGranularity}, {@link KHRMaintenance5#vkGetRenderingAreaGranularityKHR GetRenderingAreaGranularityKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExtent2D {
 *     uint32_t {@link #width};
 *     uint32_t {@link #height};
 * }</code></pre>
 */
public class VkExtent2D extends Struct<VkExtent2D> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WIDTH,
        HEIGHT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
    }

    protected VkExtent2D(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExtent2D create(long address, @Nullable ByteBuffer container) {
        return new VkExtent2D(address, container);
    }

    /**
     * Creates a {@code VkExtent2D} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExtent2D(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the width of the extent. */
    @NativeType("uint32_t")
    public int width() { return nwidth(address()); }
    /** the height of the extent. */
    @NativeType("uint32_t")
    public int height() { return nheight(address()); }

    /** Sets the specified value to the {@link #width} field. */
    public VkExtent2D width(@NativeType("uint32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@link #height} field. */
    public VkExtent2D height(@NativeType("uint32_t") int value) { nheight(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExtent2D set(
        int width,
        int height
    ) {
        width(width);
        height(height);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExtent2D set(VkExtent2D src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExtent2D} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExtent2D malloc() {
        return new VkExtent2D(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExtent2D} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExtent2D calloc() {
        return new VkExtent2D(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExtent2D} instance allocated with {@link BufferUtils}. */
    public static VkExtent2D create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExtent2D(memAddress(container), container);
    }

    /** Returns a new {@code VkExtent2D} instance for the specified memory address. */
    public static VkExtent2D create(long address) {
        return new VkExtent2D(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkExtent2D createSafe(long address) {
        return address == NULL ? null : new VkExtent2D(address, null);
    }

    /**
     * Returns a new {@link VkExtent2D.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExtent2D.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExtent2D.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExtent2D.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExtent2D.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExtent2D.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExtent2D.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExtent2D.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkExtent2D.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExtent2D mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExtent2D callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExtent2D mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExtent2D callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExtent2D.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExtent2D.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExtent2D.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExtent2D.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkExtent2D} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExtent2D malloc(MemoryStack stack) {
        return new VkExtent2D(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExtent2D} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExtent2D calloc(MemoryStack stack) {
        return new VkExtent2D(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExtent2D.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExtent2D.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExtent2D.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExtent2D.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + VkExtent2D.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + VkExtent2D.HEIGHT); }

    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + VkExtent2D.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + VkExtent2D.HEIGHT, value); }

    // -----------------------------------

    /** An array of {@link VkExtent2D} structs. */
    public static class Buffer extends StructBuffer<VkExtent2D, Buffer> implements NativeResource {

        private static final VkExtent2D ELEMENT_FACTORY = VkExtent2D.create(-1L);

        /**
         * Creates a new {@code VkExtent2D.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExtent2D#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExtent2D getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkExtent2D#width} field. */
        @NativeType("uint32_t")
        public int width() { return VkExtent2D.nwidth(address()); }
        /** @return the value of the {@link VkExtent2D#height} field. */
        @NativeType("uint32_t")
        public int height() { return VkExtent2D.nheight(address()); }

        /** Sets the specified value to the {@link VkExtent2D#width} field. */
        public VkExtent2D.Buffer width(@NativeType("uint32_t") int value) { VkExtent2D.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@link VkExtent2D#height} field. */
        public VkExtent2D.Buffer height(@NativeType("uint32_t") int value) { VkExtent2D.nheight(address(), value); return this; }

    }

}
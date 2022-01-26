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
 * Structure specifying an image subresource range.
 * 
 * <h5>Description</h5>
 * 
 * <p>The number of mipmap levels and array layers <b>must</b> be a subset of the image subresources in the image. If an application wants to use all mip levels or layers in an image after the {@code baseMipLevel} or {@code baseArrayLayer}, it <b>can</b> set {@code levelCount} and {@code layerCount} to the special values {@link VK10#VK_REMAINING_MIP_LEVELS REMAINING_MIP_LEVELS} and {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS} without knowing the exact number of mip levels or layers.</p>
 * 
 * <p>For cube and cube array image views, the layers of the image view starting at {@code baseArrayLayer} correspond to faces in the order +X, -X, +Y, -Y, +Z, -Z. For cube arrays, each set of six sequential layers is a single cube, so the number of cube maps in a cube map array view is <em>{@code layerCount} / 6</em>, and image array layer <code>(baseArrayLayer + i)</code> is face index <code>(i mod 6)</code> of cube <em>i / 6</em>. If the number of layers in the view, whether set explicitly in {@code layerCount} or implied by {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, is not a multiple of 6, the last cube map in the array <b>must</b> not be accessed.</p>
 * 
 * <p>{@code aspectMask} <b>must</b> be only {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}, {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} or {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT} if {@code format} is a color, depth-only or stencil-only format, respectively, except if {@code format} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>. If using a depth/stencil format with both depth and stencil components, {@code aspectMask} <b>must</b> include at least one of {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} and {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}, and <b>can</b> include both.</p>
 * 
 * <p>When the {@link VkImageSubresourceRange} structure is used to select a subset of the slices of a 3D image’s mip level in order to create a 2D or 2D array image view of a 3D image created with {@link VK11#VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT}, {@code baseArrayLayer} and {@code layerCount} specify the first slice index and the number of slices to include in the created image view. Such an image view <b>can</b> be used as a framebuffer attachment that refers only to the specified range of slices of the selected mip level. However, any layout transitions performed on such an attachment view during a render pass instance still apply to the entire subresource referenced which includes all the slices of the selected mip level.</p>
 * 
 * <p>When using an image view of a depth/stencil image to populate a descriptor set (e.g. for sampling in the shader, or for use as an input attachment), the {@code aspectMask} <b>must</b> only include one bit, which selects whether the image view is used for depth reads (i.e. using a floating-point sampler or input attachment in the shader) or stencil reads (i.e. using an unsigned integer sampler or input attachment in the shader). When an image view of a depth/stencil image is used as a depth/stencil framebuffer attachment, the {@code aspectMask} is ignored and both depth and stencil image subresources are used.</p>
 * 
 * <p>When creating a {@code VkImageView}, if <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#samplers-YCbCr-conversion">sampler Y′C<sub>B</sub>C<sub>R</sub> conversion</a> is enabled in the sampler, the {@code aspectMask} of a {@code subresourceRange} used by the {@code VkImageView} <b>must</b> be {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}.</p>
 * 
 * <p>When creating a {@code VkImageView}, if sampler Y′C<sub>B</sub>C<sub>R</sub> conversion is not enabled in the sampler and the image {@code format} is <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar</a>, the image <b>must</b> have been created with {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT}, and the {@code aspectMask} of the {@code VkImageView}’s {@code subresourceRange} <b>must</b> be {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT}, {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT} or {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code levelCount} is not {@link VK10#VK_REMAINING_MIP_LEVELS REMAINING_MIP_LEVELS}, it <b>must</b> be greater than 0</li>
 * <li>If {@code layerCount} is not {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, it <b>must</b> be greater than 0</li>
 * <li>If {@code aspectMask} includes {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}, then it <b>must</b> not include any of {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT}, {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT}, or {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT}</li>
 * <li>{@code aspectMask} <b>must</b> not include <code>VK_IMAGE_ASPECT_MEMORY_PLANE<em>_i_</em>BIT_EXT</code> for any index <em>i</em></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code aspectMask} <b>must</b> be a valid combination of {@code VkImageAspectFlagBits} values</li>
 * <li>{@code aspectMask} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkImageMemoryBarrier}, {@link VkImageMemoryBarrier2}, {@link VkImageViewCreateInfo}, {@link VK10#vkCmdClearColorImage CmdClearColorImage}, {@link VK10#vkCmdClearDepthStencilImage CmdClearDepthStencilImage}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageSubresourceRange {
 *     VkImageAspectFlags {@link #aspectMask};
 *     uint32_t {@link #baseMipLevel};
 *     uint32_t {@link #levelCount};
 *     uint32_t {@link #baseArrayLayer};
 *     uint32_t {@link #layerCount};
 * }</code></pre>
 */
public class VkImageSubresourceRange extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ASPECTMASK,
        BASEMIPLEVEL,
        LEVELCOUNT,
        BASEARRAYLAYER,
        LAYERCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ASPECTMASK = layout.offsetof(0);
        BASEMIPLEVEL = layout.offsetof(1);
        LEVELCOUNT = layout.offsetof(2);
        BASEARRAYLAYER = layout.offsetof(3);
        LAYERCOUNT = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkImageSubresourceRange} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageSubresourceRange(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a bitmask of {@code VkImageAspectFlagBits} specifying which aspect(s) of the image are included in the view. */
    @NativeType("VkImageAspectFlags")
    public int aspectMask() { return naspectMask(address()); }
    /** the first mipmap level accessible to the view. */
    @NativeType("uint32_t")
    public int baseMipLevel() { return nbaseMipLevel(address()); }
    /** the number of mipmap levels (starting from {@code baseMipLevel}) accessible to the view. */
    @NativeType("uint32_t")
    public int levelCount() { return nlevelCount(address()); }
    /** the first array layer accessible to the view. */
    @NativeType("uint32_t")
    public int baseArrayLayer() { return nbaseArrayLayer(address()); }
    /** the number of array layers (starting from {@code baseArrayLayer}) accessible to the view. */
    @NativeType("uint32_t")
    public int layerCount() { return nlayerCount(address()); }

    /** Sets the specified value to the {@link #aspectMask} field. */
    public VkImageSubresourceRange aspectMask(@NativeType("VkImageAspectFlags") int value) { naspectMask(address(), value); return this; }
    /** Sets the specified value to the {@link #baseMipLevel} field. */
    public VkImageSubresourceRange baseMipLevel(@NativeType("uint32_t") int value) { nbaseMipLevel(address(), value); return this; }
    /** Sets the specified value to the {@link #levelCount} field. */
    public VkImageSubresourceRange levelCount(@NativeType("uint32_t") int value) { nlevelCount(address(), value); return this; }
    /** Sets the specified value to the {@link #baseArrayLayer} field. */
    public VkImageSubresourceRange baseArrayLayer(@NativeType("uint32_t") int value) { nbaseArrayLayer(address(), value); return this; }
    /** Sets the specified value to the {@link #layerCount} field. */
    public VkImageSubresourceRange layerCount(@NativeType("uint32_t") int value) { nlayerCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageSubresourceRange set(
        int aspectMask,
        int baseMipLevel,
        int levelCount,
        int baseArrayLayer,
        int layerCount
    ) {
        aspectMask(aspectMask);
        baseMipLevel(baseMipLevel);
        levelCount(levelCount);
        baseArrayLayer(baseArrayLayer);
        layerCount(layerCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageSubresourceRange set(VkImageSubresourceRange src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageSubresourceRange} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageSubresourceRange malloc() {
        return wrap(VkImageSubresourceRange.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageSubresourceRange} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageSubresourceRange calloc() {
        return wrap(VkImageSubresourceRange.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageSubresourceRange} instance allocated with {@link BufferUtils}. */
    public static VkImageSubresourceRange create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageSubresourceRange.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageSubresourceRange} instance for the specified memory address. */
    public static VkImageSubresourceRange create(long address) {
        return wrap(VkImageSubresourceRange.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageSubresourceRange createSafe(long address) {
        return address == NULL ? null : wrap(VkImageSubresourceRange.class, address);
    }

    /**
     * Returns a new {@link VkImageSubresourceRange.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresourceRange.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresourceRange.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresourceRange.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresourceRange.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageSubresourceRange.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageSubresourceRange.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageSubresourceRange.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageSubresourceRange.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageSubresourceRange mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageSubresourceRange callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageSubresourceRange mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageSubresourceRange callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageSubresourceRange.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageSubresourceRange.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageSubresourceRange.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageSubresourceRange.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImageSubresourceRange} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageSubresourceRange malloc(MemoryStack stack) {
        return wrap(VkImageSubresourceRange.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageSubresourceRange} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageSubresourceRange calloc(MemoryStack stack) {
        return wrap(VkImageSubresourceRange.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageSubresourceRange.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageSubresourceRange.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageSubresourceRange.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageSubresourceRange.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #aspectMask}. */
    public static int naspectMask(long struct) { return UNSAFE.getInt(null, struct + VkImageSubresourceRange.ASPECTMASK); }
    /** Unsafe version of {@link #baseMipLevel}. */
    public static int nbaseMipLevel(long struct) { return UNSAFE.getInt(null, struct + VkImageSubresourceRange.BASEMIPLEVEL); }
    /** Unsafe version of {@link #levelCount}. */
    public static int nlevelCount(long struct) { return UNSAFE.getInt(null, struct + VkImageSubresourceRange.LEVELCOUNT); }
    /** Unsafe version of {@link #baseArrayLayer}. */
    public static int nbaseArrayLayer(long struct) { return UNSAFE.getInt(null, struct + VkImageSubresourceRange.BASEARRAYLAYER); }
    /** Unsafe version of {@link #layerCount}. */
    public static int nlayerCount(long struct) { return UNSAFE.getInt(null, struct + VkImageSubresourceRange.LAYERCOUNT); }

    /** Unsafe version of {@link #aspectMask(int) aspectMask}. */
    public static void naspectMask(long struct, int value) { UNSAFE.putInt(null, struct + VkImageSubresourceRange.ASPECTMASK, value); }
    /** Unsafe version of {@link #baseMipLevel(int) baseMipLevel}. */
    public static void nbaseMipLevel(long struct, int value) { UNSAFE.putInt(null, struct + VkImageSubresourceRange.BASEMIPLEVEL, value); }
    /** Unsafe version of {@link #levelCount(int) levelCount}. */
    public static void nlevelCount(long struct, int value) { UNSAFE.putInt(null, struct + VkImageSubresourceRange.LEVELCOUNT, value); }
    /** Unsafe version of {@link #baseArrayLayer(int) baseArrayLayer}. */
    public static void nbaseArrayLayer(long struct, int value) { UNSAFE.putInt(null, struct + VkImageSubresourceRange.BASEARRAYLAYER, value); }
    /** Unsafe version of {@link #layerCount(int) layerCount}. */
    public static void nlayerCount(long struct, int value) { UNSAFE.putInt(null, struct + VkImageSubresourceRange.LAYERCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkImageSubresourceRange} structs. */
    public static class Buffer extends StructBuffer<VkImageSubresourceRange, Buffer> implements NativeResource {

        private static final VkImageSubresourceRange ELEMENT_FACTORY = VkImageSubresourceRange.create(-1L);

        /**
         * Creates a new {@code VkImageSubresourceRange.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageSubresourceRange#SIZEOF}, and its mark will be undefined.
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
        protected VkImageSubresourceRange getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageSubresourceRange#aspectMask} field. */
        @NativeType("VkImageAspectFlags")
        public int aspectMask() { return VkImageSubresourceRange.naspectMask(address()); }
        /** @return the value of the {@link VkImageSubresourceRange#baseMipLevel} field. */
        @NativeType("uint32_t")
        public int baseMipLevel() { return VkImageSubresourceRange.nbaseMipLevel(address()); }
        /** @return the value of the {@link VkImageSubresourceRange#levelCount} field. */
        @NativeType("uint32_t")
        public int levelCount() { return VkImageSubresourceRange.nlevelCount(address()); }
        /** @return the value of the {@link VkImageSubresourceRange#baseArrayLayer} field. */
        @NativeType("uint32_t")
        public int baseArrayLayer() { return VkImageSubresourceRange.nbaseArrayLayer(address()); }
        /** @return the value of the {@link VkImageSubresourceRange#layerCount} field. */
        @NativeType("uint32_t")
        public int layerCount() { return VkImageSubresourceRange.nlayerCount(address()); }

        /** Sets the specified value to the {@link VkImageSubresourceRange#aspectMask} field. */
        public VkImageSubresourceRange.Buffer aspectMask(@NativeType("VkImageAspectFlags") int value) { VkImageSubresourceRange.naspectMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageSubresourceRange#baseMipLevel} field. */
        public VkImageSubresourceRange.Buffer baseMipLevel(@NativeType("uint32_t") int value) { VkImageSubresourceRange.nbaseMipLevel(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageSubresourceRange#levelCount} field. */
        public VkImageSubresourceRange.Buffer levelCount(@NativeType("uint32_t") int value) { VkImageSubresourceRange.nlevelCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageSubresourceRange#baseArrayLayer} field. */
        public VkImageSubresourceRange.Buffer baseArrayLayer(@NativeType("uint32_t") int value) { VkImageSubresourceRange.nbaseArrayLayer(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageSubresourceRange#layerCount} field. */
        public VkImageSubresourceRange.Buffer layerCount(@NativeType("uint32_t") int value) { VkImageSubresourceRange.nlayerCount(address(), value); return this; }

    }

}
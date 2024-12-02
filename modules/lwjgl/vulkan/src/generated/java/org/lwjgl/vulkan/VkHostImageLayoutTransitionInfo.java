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
 * Structure specifying the parameters of a host-side image layout transition.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code vkTransitionImageLayout} does not check whether the device memory associated with an image is currently in use before performing the layout transition. The application <b>must</b> guarantee that any previously submitted command that reads from or writes to this subresource has completed before the host performs the layout transition. The memory of {@code image} is accessed by the host as if <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#memory-coherent">coherent</a>.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Image layout transitions performed on the host do not require queue family ownership transfers as the physical layout of the image will not vary between queue families for the layouts supported by this function.</p>
 * </div>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>If the device has written to the image memory, it is not automatically made available to the host. Before this command can be called, a memory barrier for this image <b>must</b> have been issued on the device with the second <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#synchronization-dependencies-scopes">synchronization scope</a> including {@link VK10#VK_PIPELINE_STAGE_HOST_BIT PIPELINE_STAGE_HOST_BIT} and {@link VK10#VK_ACCESS_HOST_READ_BIT ACCESS_HOST_READ_BIT}.</p>
 * 
 * <p>Because queue submissions <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#synchronization-submission-host-writes">automatically make host memory visible to the device</a>, there would not be a need for a memory barrier before using the results of this layout transition on the device.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code image} <b>must</b> have been created with {@link VK14#VK_IMAGE_USAGE_HOST_TRANSFER_BIT IMAGE_USAGE_HOST_TRANSFER_BIT}</li>
 * </ul>
 * 
 * <ul>
 * <li>{@code subresourceRange.baseMipLevel} <b>must</b> be less than the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code subresourceRange.levelCount} is not {@link VK10#VK_REMAINING_MIP_LEVELS REMAINING_MIP_LEVELS}, <code>subresourceRange.baseMipLevel + subresourceRange.levelCount</code> <b>must</b> be less than or equal to the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>{@code subresourceRange.baseArrayLayer} <b>must</b> be less than the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code subresourceRange.layerCount} is not {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, <code>subresourceRange.baseArrayLayer + subresourceRange.layerCount</code> <b>must</b> be less than or equal to the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code image} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>If {@code image} has a color format that is single-plane, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> be {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</li>
 * <li>If {@code image} has a color format and is not <em>disjoint</em>, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> be {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</li>
 * <li>If {@code image} has a multi-planar format and the image is <em>disjoint</em>, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> include at least one <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-planes-image-aspect">multi-planar aspect mask</a> bit or {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</li>
 * <li>If {@code image} has a depth/stencil format with both depth and stencil and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-separateDepthStencilLayouts">{@code separateDepthStencilLayouts}</a> feature is not enabled, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> include both {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} and {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
 * <li>If {@code image} has a depth/stencil format with both depth and stencil and the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-separateDepthStencilLayouts">{@code separateDepthStencilLayouts}</a> feature is enabled, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> include either or both {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} and {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
 * <li>If the {@code aspectMask} member of {@code subresourceRange} includes {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT}, {@code oldLayout} and {@code newLayout} <b>must</b> not be one of {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If the {@code aspectMask} member of {@code subresourceRange} includes {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}, {@code oldLayout} and {@code newLayout} <b>must</b> not be one of {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}</li>
 * <li>{@code subresourceRange.aspectMask} <b>must</b> be valid for the {@code format} the {@code image} was created with</li>
 * <li>{@code oldLayout} <b>must</b> be either {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} or the current layout of the image subresources as specified in {@code subresourceRange}</li>
 * <li>If {@code oldLayout} is not {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} or {@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}, it <b>must</b> be one of the layouts in {@link VkPhysicalDeviceHostImageCopyProperties}{@code ::pCopySrcLayouts}</li>
 * <li>{@code newLayout} <b>must</b> be one of the layouts in {@link VkPhysicalDeviceHostImageCopyProperties}{@code ::pCopyDstLayouts}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK14#VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code oldLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code newLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code subresourceRange} <b>must</b> be a valid {@link VkImageSubresourceRange} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkImageSubresourceRange}, {@link VK14#vkTransitionImageLayout TransitionImageLayout}, {@link EXTHostImageCopy#vkTransitionImageLayoutEXT TransitionImageLayoutEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkHostImageLayoutTransitionInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImage {@link #image};
 *     VkImageLayout {@link #oldLayout};
 *     VkImageLayout {@link #newLayout};
 *     {@link VkImageSubresourceRange VkImageSubresourceRange} {@link #subresourceRange};
 * }</code></pre>
 */
public class VkHostImageLayoutTransitionInfo extends Struct<VkHostImageLayoutTransitionInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGE,
        OLDLAYOUT,
        NEWLAYOUT,
        SUBRESOURCERANGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(VkImageSubresourceRange.SIZEOF, VkImageSubresourceRange.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
        OLDLAYOUT = layout.offsetof(3);
        NEWLAYOUT = layout.offsetof(4);
        SUBRESOURCERANGE = layout.offsetof(5);
    }

    protected VkHostImageLayoutTransitionInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkHostImageLayoutTransitionInfo create(long address, @Nullable ByteBuffer container) {
        return new VkHostImageLayoutTransitionInfo(address, container);
    }

    /**
     * Creates a {@code VkHostImageLayoutTransitionInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkHostImageLayoutTransitionInfo(ByteBuffer container) {
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
    /** a handle to the image affected by this layout transition. */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }
    /** the old layout in an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>. */
    @NativeType("VkImageLayout")
    public int oldLayout() { return noldLayout(address()); }
    /** the new layout in an <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>. */
    @NativeType("VkImageLayout")
    public int newLayout() { return nnewLayout(address()); }
    /** describes the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#resources-image-views">image subresource range</a> within {@code image} that is affected by this layout transition. */
    public VkImageSubresourceRange subresourceRange() { return nsubresourceRange(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkHostImageLayoutTransitionInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO} value to the {@link #sType} field. */
    public VkHostImageLayoutTransitionInfo sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkHostImageLayoutTransitionInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #image} field. */
    public VkHostImageLayoutTransitionInfo image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Sets the specified value to the {@link #oldLayout} field. */
    public VkHostImageLayoutTransitionInfo oldLayout(@NativeType("VkImageLayout") int value) { noldLayout(address(), value); return this; }
    /** Sets the specified value to the {@link #newLayout} field. */
    public VkHostImageLayoutTransitionInfo newLayout(@NativeType("VkImageLayout") int value) { nnewLayout(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceRange} to the {@link #subresourceRange} field. */
    public VkHostImageLayoutTransitionInfo subresourceRange(VkImageSubresourceRange value) { nsubresourceRange(address(), value); return this; }
    /** Passes the {@link #subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkHostImageLayoutTransitionInfo subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    /** Initializes this struct with the specified values. */
    public VkHostImageLayoutTransitionInfo set(
        int sType,
        long pNext,
        long image,
        int oldLayout,
        int newLayout,
        VkImageSubresourceRange subresourceRange
    ) {
        sType(sType);
        pNext(pNext);
        image(image);
        oldLayout(oldLayout);
        newLayout(newLayout);
        subresourceRange(subresourceRange);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkHostImageLayoutTransitionInfo set(VkHostImageLayoutTransitionInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkHostImageLayoutTransitionInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkHostImageLayoutTransitionInfo malloc() {
        return new VkHostImageLayoutTransitionInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkHostImageLayoutTransitionInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkHostImageLayoutTransitionInfo calloc() {
        return new VkHostImageLayoutTransitionInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkHostImageLayoutTransitionInfo} instance allocated with {@link BufferUtils}. */
    public static VkHostImageLayoutTransitionInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkHostImageLayoutTransitionInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkHostImageLayoutTransitionInfo} instance for the specified memory address. */
    public static VkHostImageLayoutTransitionInfo create(long address) {
        return new VkHostImageLayoutTransitionInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkHostImageLayoutTransitionInfo createSafe(long address) {
        return address == NULL ? null : new VkHostImageLayoutTransitionInfo(address, null);
    }

    /**
     * Returns a new {@link VkHostImageLayoutTransitionInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkHostImageLayoutTransitionInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkHostImageLayoutTransitionInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkHostImageLayoutTransitionInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkHostImageLayoutTransitionInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkHostImageLayoutTransitionInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkHostImageLayoutTransitionInfo malloc(MemoryStack stack) {
        return new VkHostImageLayoutTransitionInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkHostImageLayoutTransitionInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkHostImageLayoutTransitionInfo calloc(MemoryStack stack) {
        return new VkHostImageLayoutTransitionInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkHostImageLayoutTransitionInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkHostImageLayoutTransitionInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkHostImageLayoutTransitionInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkHostImageLayoutTransitionInfo.PNEXT); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return memGetLong(struct + VkHostImageLayoutTransitionInfo.IMAGE); }
    /** Unsafe version of {@link #oldLayout}. */
    public static int noldLayout(long struct) { return memGetInt(struct + VkHostImageLayoutTransitionInfo.OLDLAYOUT); }
    /** Unsafe version of {@link #newLayout}. */
    public static int nnewLayout(long struct) { return memGetInt(struct + VkHostImageLayoutTransitionInfo.NEWLAYOUT); }
    /** Unsafe version of {@link #subresourceRange}. */
    public static VkImageSubresourceRange nsubresourceRange(long struct) { return VkImageSubresourceRange.create(struct + VkHostImageLayoutTransitionInfo.SUBRESOURCERANGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkHostImageLayoutTransitionInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkHostImageLayoutTransitionInfo.PNEXT, value); }
    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { memPutLong(struct + VkHostImageLayoutTransitionInfo.IMAGE, value); }
    /** Unsafe version of {@link #oldLayout(int) oldLayout}. */
    public static void noldLayout(long struct, int value) { memPutInt(struct + VkHostImageLayoutTransitionInfo.OLDLAYOUT, value); }
    /** Unsafe version of {@link #newLayout(int) newLayout}. */
    public static void nnewLayout(long struct, int value) { memPutInt(struct + VkHostImageLayoutTransitionInfo.NEWLAYOUT, value); }
    /** Unsafe version of {@link #subresourceRange(VkImageSubresourceRange) subresourceRange}. */
    public static void nsubresourceRange(long struct, VkImageSubresourceRange value) { memCopy(value.address(), struct + VkHostImageLayoutTransitionInfo.SUBRESOURCERANGE, VkImageSubresourceRange.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkHostImageLayoutTransitionInfo} structs. */
    public static class Buffer extends StructBuffer<VkHostImageLayoutTransitionInfo, Buffer> implements NativeResource {

        private static final VkHostImageLayoutTransitionInfo ELEMENT_FACTORY = VkHostImageLayoutTransitionInfo.create(-1L);

        /**
         * Creates a new {@code VkHostImageLayoutTransitionInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkHostImageLayoutTransitionInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkHostImageLayoutTransitionInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkHostImageLayoutTransitionInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkHostImageLayoutTransitionInfo.nsType(address()); }
        /** @return the value of the {@link VkHostImageLayoutTransitionInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkHostImageLayoutTransitionInfo.npNext(address()); }
        /** @return the value of the {@link VkHostImageLayoutTransitionInfo#image} field. */
        @NativeType("VkImage")
        public long image() { return VkHostImageLayoutTransitionInfo.nimage(address()); }
        /** @return the value of the {@link VkHostImageLayoutTransitionInfo#oldLayout} field. */
        @NativeType("VkImageLayout")
        public int oldLayout() { return VkHostImageLayoutTransitionInfo.noldLayout(address()); }
        /** @return the value of the {@link VkHostImageLayoutTransitionInfo#newLayout} field. */
        @NativeType("VkImageLayout")
        public int newLayout() { return VkHostImageLayoutTransitionInfo.nnewLayout(address()); }
        /** @return a {@link VkImageSubresourceRange} view of the {@link VkHostImageLayoutTransitionInfo#subresourceRange} field. */
        public VkImageSubresourceRange subresourceRange() { return VkHostImageLayoutTransitionInfo.nsubresourceRange(address()); }

        /** Sets the specified value to the {@link VkHostImageLayoutTransitionInfo#sType} field. */
        public VkHostImageLayoutTransitionInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkHostImageLayoutTransitionInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO} value to the {@link VkHostImageLayoutTransitionInfo#sType} field. */
        public VkHostImageLayoutTransitionInfo.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO); }
        /** Sets the specified value to the {@link VkHostImageLayoutTransitionInfo#pNext} field. */
        public VkHostImageLayoutTransitionInfo.Buffer pNext(@NativeType("void const *") long value) { VkHostImageLayoutTransitionInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkHostImageLayoutTransitionInfo#image} field. */
        public VkHostImageLayoutTransitionInfo.Buffer image(@NativeType("VkImage") long value) { VkHostImageLayoutTransitionInfo.nimage(address(), value); return this; }
        /** Sets the specified value to the {@link VkHostImageLayoutTransitionInfo#oldLayout} field. */
        public VkHostImageLayoutTransitionInfo.Buffer oldLayout(@NativeType("VkImageLayout") int value) { VkHostImageLayoutTransitionInfo.noldLayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkHostImageLayoutTransitionInfo#newLayout} field. */
        public VkHostImageLayoutTransitionInfo.Buffer newLayout(@NativeType("VkImageLayout") int value) { VkHostImageLayoutTransitionInfo.nnewLayout(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceRange} to the {@link VkHostImageLayoutTransitionInfo#subresourceRange} field. */
        public VkHostImageLayoutTransitionInfo.Buffer subresourceRange(VkImageSubresourceRange value) { VkHostImageLayoutTransitionInfo.nsubresourceRange(address(), value); return this; }
        /** Passes the {@link VkHostImageLayoutTransitionInfo#subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkHostImageLayoutTransitionInfo.Buffer subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    }

}
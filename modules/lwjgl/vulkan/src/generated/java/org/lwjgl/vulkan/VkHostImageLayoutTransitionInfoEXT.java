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
 * Structure specifying the parameters of a host-side image layout transition.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code vkTransitionImageLayoutEXT} does not check whether the device memory associated with an image is currently in use before performing the layout transition. The application <b>must</b> guarantee that any previously submitted command that reads from or writes to this subresource has completed before the host performs the layout transition.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Image layout transitions performed on the host do not require queue family ownership transfers as the physical layout of the image will not vary between queue families for the layouts supported by this function.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code image} <b>must</b> have been created with {@link EXTHostImageCopy#VK_IMAGE_USAGE_HOST_TRANSFER_BIT_EXT IMAGE_USAGE_HOST_TRANSFER_BIT_EXT}</li>
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
 * <li>If {@code image} has a multi-planar format and the image is <em>disjoint</em>, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> include at least one <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-planes-image-aspect">multi-planar aspect mask</a> bit or {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</li>
 * <li>If {@code image} has a depth/stencil format with both depth and stencil and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-separateDepthStencilLayouts">{@code separateDepthStencilLayouts}</a> feature is enabled, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> include either or both {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} and {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
 * <li>If {@code image} has a depth/stencil format with both depth and stencil and the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-separateDepthStencilLayouts">{@code separateDepthStencilLayouts}</a> feature is not enabled, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> include both {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} and {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
 * <li>If the {@code aspectMask} member of {@code subresourceRange} includes {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT}, {@code oldLayout} and {@code newLayout} <b>must</b> not be one of {@link VK12#VK_IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_STENCIL_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_STENCIL_READ_ONLY_OPTIMAL}</li>
 * <li>If the {@code aspectMask} member of {@code subresourceRange} includes {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}, {@code oldLayout} and {@code newLayout} <b>must</b> not be one of {@link VK12#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_OPTIMAL} or {@link VK12#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_OPTIMAL}</li>
 * <li>{@code oldLayout} <b>must</b> be either {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} or the current layout of the image subresources as specified in {@code subresourceRange}</li>
 * <li>If {@code oldLayout} is not {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} or {@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}, it <b>must</b> be one of the layouts in {@link VkPhysicalDeviceHostImageCopyPropertiesEXT}{@code ::pCopySrcLayouts}</li>
 * <li>{@code newLayout} <b>must</b> be one of the layouts in {@link VkPhysicalDeviceHostImageCopyPropertiesEXT}{@code ::pCopyDstLayouts}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTHostImageCopy#VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO_EXT STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code oldLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code newLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code subresourceRange} <b>must</b> be a valid {@link VkImageSubresourceRange} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkImageSubresourceRange}, {@link EXTHostImageCopy#vkTransitionImageLayoutEXT TransitionImageLayoutEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkHostImageLayoutTransitionInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImage {@link #image};
 *     VkImageLayout {@link #oldLayout};
 *     VkImageLayout {@link #newLayout};
 *     {@link VkImageSubresourceRange VkImageSubresourceRange} {@link #subresourceRange};
 * }</code></pre>
 */
public class VkHostImageLayoutTransitionInfoEXT extends Struct<VkHostImageLayoutTransitionInfoEXT> implements NativeResource {

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

    protected VkHostImageLayoutTransitionInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkHostImageLayoutTransitionInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkHostImageLayoutTransitionInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkHostImageLayoutTransitionInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkHostImageLayoutTransitionInfoEXT(ByteBuffer container) {
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
    /** the old layout in an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>. */
    @NativeType("VkImageLayout")
    public int oldLayout() { return noldLayout(address()); }
    /** the new layout in an <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>. */
    @NativeType("VkImageLayout")
    public int newLayout() { return nnewLayout(address()); }
    /** describes the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-views">image subresource range</a> within {@code image} that is affected by this layout transition. */
    public VkImageSubresourceRange subresourceRange() { return nsubresourceRange(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkHostImageLayoutTransitionInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTHostImageCopy#VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO_EXT STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO_EXT} value to the {@link #sType} field. */
    public VkHostImageLayoutTransitionInfoEXT sType$Default() { return sType(EXTHostImageCopy.VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkHostImageLayoutTransitionInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #image} field. */
    public VkHostImageLayoutTransitionInfoEXT image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Sets the specified value to the {@link #oldLayout} field. */
    public VkHostImageLayoutTransitionInfoEXT oldLayout(@NativeType("VkImageLayout") int value) { noldLayout(address(), value); return this; }
    /** Sets the specified value to the {@link #newLayout} field. */
    public VkHostImageLayoutTransitionInfoEXT newLayout(@NativeType("VkImageLayout") int value) { nnewLayout(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceRange} to the {@link #subresourceRange} field. */
    public VkHostImageLayoutTransitionInfoEXT subresourceRange(VkImageSubresourceRange value) { nsubresourceRange(address(), value); return this; }
    /** Passes the {@link #subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkHostImageLayoutTransitionInfoEXT subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    /** Initializes this struct with the specified values. */
    public VkHostImageLayoutTransitionInfoEXT set(
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
    public VkHostImageLayoutTransitionInfoEXT set(VkHostImageLayoutTransitionInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkHostImageLayoutTransitionInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkHostImageLayoutTransitionInfoEXT malloc() {
        return new VkHostImageLayoutTransitionInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkHostImageLayoutTransitionInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkHostImageLayoutTransitionInfoEXT calloc() {
        return new VkHostImageLayoutTransitionInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkHostImageLayoutTransitionInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkHostImageLayoutTransitionInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkHostImageLayoutTransitionInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkHostImageLayoutTransitionInfoEXT} instance for the specified memory address. */
    public static VkHostImageLayoutTransitionInfoEXT create(long address) {
        return new VkHostImageLayoutTransitionInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkHostImageLayoutTransitionInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkHostImageLayoutTransitionInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkHostImageLayoutTransitionInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkHostImageLayoutTransitionInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkHostImageLayoutTransitionInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkHostImageLayoutTransitionInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkHostImageLayoutTransitionInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkHostImageLayoutTransitionInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkHostImageLayoutTransitionInfoEXT malloc(MemoryStack stack) {
        return new VkHostImageLayoutTransitionInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkHostImageLayoutTransitionInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkHostImageLayoutTransitionInfoEXT calloc(MemoryStack stack) {
        return new VkHostImageLayoutTransitionInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkHostImageLayoutTransitionInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkHostImageLayoutTransitionInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkHostImageLayoutTransitionInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkHostImageLayoutTransitionInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkHostImageLayoutTransitionInfoEXT.PNEXT); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return UNSAFE.getLong(null, struct + VkHostImageLayoutTransitionInfoEXT.IMAGE); }
    /** Unsafe version of {@link #oldLayout}. */
    public static int noldLayout(long struct) { return UNSAFE.getInt(null, struct + VkHostImageLayoutTransitionInfoEXT.OLDLAYOUT); }
    /** Unsafe version of {@link #newLayout}. */
    public static int nnewLayout(long struct) { return UNSAFE.getInt(null, struct + VkHostImageLayoutTransitionInfoEXT.NEWLAYOUT); }
    /** Unsafe version of {@link #subresourceRange}. */
    public static VkImageSubresourceRange nsubresourceRange(long struct) { return VkImageSubresourceRange.create(struct + VkHostImageLayoutTransitionInfoEXT.SUBRESOURCERANGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkHostImageLayoutTransitionInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkHostImageLayoutTransitionInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { UNSAFE.putLong(null, struct + VkHostImageLayoutTransitionInfoEXT.IMAGE, value); }
    /** Unsafe version of {@link #oldLayout(int) oldLayout}. */
    public static void noldLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkHostImageLayoutTransitionInfoEXT.OLDLAYOUT, value); }
    /** Unsafe version of {@link #newLayout(int) newLayout}. */
    public static void nnewLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkHostImageLayoutTransitionInfoEXT.NEWLAYOUT, value); }
    /** Unsafe version of {@link #subresourceRange(VkImageSubresourceRange) subresourceRange}. */
    public static void nsubresourceRange(long struct, VkImageSubresourceRange value) { memCopy(value.address(), struct + VkHostImageLayoutTransitionInfoEXT.SUBRESOURCERANGE, VkImageSubresourceRange.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkHostImageLayoutTransitionInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkHostImageLayoutTransitionInfoEXT, Buffer> implements NativeResource {

        private static final VkHostImageLayoutTransitionInfoEXT ELEMENT_FACTORY = VkHostImageLayoutTransitionInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkHostImageLayoutTransitionInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkHostImageLayoutTransitionInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkHostImageLayoutTransitionInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkHostImageLayoutTransitionInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkHostImageLayoutTransitionInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkHostImageLayoutTransitionInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkHostImageLayoutTransitionInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkHostImageLayoutTransitionInfoEXT#image} field. */
        @NativeType("VkImage")
        public long image() { return VkHostImageLayoutTransitionInfoEXT.nimage(address()); }
        /** @return the value of the {@link VkHostImageLayoutTransitionInfoEXT#oldLayout} field. */
        @NativeType("VkImageLayout")
        public int oldLayout() { return VkHostImageLayoutTransitionInfoEXT.noldLayout(address()); }
        /** @return the value of the {@link VkHostImageLayoutTransitionInfoEXT#newLayout} field. */
        @NativeType("VkImageLayout")
        public int newLayout() { return VkHostImageLayoutTransitionInfoEXT.nnewLayout(address()); }
        /** @return a {@link VkImageSubresourceRange} view of the {@link VkHostImageLayoutTransitionInfoEXT#subresourceRange} field. */
        public VkImageSubresourceRange subresourceRange() { return VkHostImageLayoutTransitionInfoEXT.nsubresourceRange(address()); }

        /** Sets the specified value to the {@link VkHostImageLayoutTransitionInfoEXT#sType} field. */
        public VkHostImageLayoutTransitionInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkHostImageLayoutTransitionInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTHostImageCopy#VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO_EXT STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO_EXT} value to the {@link VkHostImageLayoutTransitionInfoEXT#sType} field. */
        public VkHostImageLayoutTransitionInfoEXT.Buffer sType$Default() { return sType(EXTHostImageCopy.VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO_EXT); }
        /** Sets the specified value to the {@link VkHostImageLayoutTransitionInfoEXT#pNext} field. */
        public VkHostImageLayoutTransitionInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkHostImageLayoutTransitionInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkHostImageLayoutTransitionInfoEXT#image} field. */
        public VkHostImageLayoutTransitionInfoEXT.Buffer image(@NativeType("VkImage") long value) { VkHostImageLayoutTransitionInfoEXT.nimage(address(), value); return this; }
        /** Sets the specified value to the {@link VkHostImageLayoutTransitionInfoEXT#oldLayout} field. */
        public VkHostImageLayoutTransitionInfoEXT.Buffer oldLayout(@NativeType("VkImageLayout") int value) { VkHostImageLayoutTransitionInfoEXT.noldLayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkHostImageLayoutTransitionInfoEXT#newLayout} field. */
        public VkHostImageLayoutTransitionInfoEXT.Buffer newLayout(@NativeType("VkImageLayout") int value) { VkHostImageLayoutTransitionInfoEXT.nnewLayout(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceRange} to the {@link VkHostImageLayoutTransitionInfoEXT#subresourceRange} field. */
        public VkHostImageLayoutTransitionInfoEXT.Buffer subresourceRange(VkImageSubresourceRange value) { VkHostImageLayoutTransitionInfoEXT.nsubresourceRange(address(), value); return this; }
        /** Passes the {@link VkHostImageLayoutTransitionInfoEXT#subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkHostImageLayoutTransitionInfoEXT.Buffer subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    }

}
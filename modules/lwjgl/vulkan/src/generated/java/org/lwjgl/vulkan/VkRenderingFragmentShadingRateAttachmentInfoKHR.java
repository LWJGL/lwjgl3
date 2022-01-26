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
 * Structure specifying fragment shading rate attachment information.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure can be included in the {@code pNext} chain of {@link VkRenderingInfo} to define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-attachment">fragment shading rate attachment</a>. If {@code imageView} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, or if this structure is not specified, the implementation behaves as if a valid shading rate attachment was specified with all texels specifying a single pixel per fragment.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code layout} <b>must</b> be {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL} or {@link KHRFragmentShadingRate#VK_IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR}</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> have been created with {@link KHRFragmentShadingRate#VK_IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR}</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code shadingRateAttachmentTexelSize.width} <b>must</b> be a power of two value</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code shadingRateAttachmentTexelSize.width} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxFragmentShadingRateAttachmentTexelSize">{@code maxFragmentShadingRateAttachmentTexelSize.width}</a></li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code shadingRateAttachmentTexelSize.width} <b>must</b> be greater than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-minFragmentShadingRateAttachmentTexelSize">{@code minFragmentShadingRateAttachmentTexelSize.width}</a></li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code shadingRateAttachmentTexelSize.height} <b>must</b> be a power of two value</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code shadingRateAttachmentTexelSize.height} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxFragmentShadingRateAttachmentTexelSize">{@code maxFragmentShadingRateAttachmentTexelSize.height}</a></li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code shadingRateAttachmentTexelSize.height} <b>must</b> be greater than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-minFragmentShadingRateAttachmentTexelSize">{@code minFragmentShadingRateAttachmentTexelSize.height}</a></li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the quotient of {@code shadingRateAttachmentTexelSize.width} and {@code shadingRateAttachmentTexelSize.height} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxFragmentShadingRateAttachmentTexelSizeAspectRatio">{@code maxFragmentShadingRateAttachmentTexelSizeAspectRatio}</a></li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the quotient of {@code shadingRateAttachmentTexelSize.height} and {@code shadingRateAttachmentTexelSize.width} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxFragmentShadingRateAttachmentTexelSizeAspectRatio">{@code maxFragmentShadingRateAttachmentTexelSizeAspectRatio}</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRDynamicRendering#VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR STRUCTURE_TYPE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR}</li>
 * <li>If {@code imageView} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code imageView} <b>must</b> be a valid {@code VkImageView} handle</li>
 * <li>{@code imageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderingFragmentShadingRateAttachmentInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImageView {@link #imageView};
 *     VkImageLayout {@link #imageLayout};
 *     {@link VkExtent2D VkExtent2D} {@link #shadingRateAttachmentTexelSize};
 * }</code></pre>
 */
public class VkRenderingFragmentShadingRateAttachmentInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGEVIEW,
        IMAGELAYOUT,
        SHADINGRATEATTACHMENTTEXELSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGEVIEW = layout.offsetof(2);
        IMAGELAYOUT = layout.offsetof(3);
        SHADINGRATEATTACHMENTTEXELSIZE = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkRenderingFragmentShadingRateAttachmentInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderingFragmentShadingRateAttachmentInfoKHR(ByteBuffer container) {
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
    /** the image view that will be used as a fragment shading rate attachment. */
    @NativeType("VkImageView")
    public long imageView() { return nimageView(address()); }
    /** the layout that {@code imageView} will be in during rendering. */
    @NativeType("VkImageLayout")
    public int imageLayout() { return nimageLayout(address()); }
    /** specifies the number of pixels corresponding to each texel in {@code imageView}. */
    public VkExtent2D shadingRateAttachmentTexelSize() { return nshadingRateAttachmentTexelSize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkRenderingFragmentShadingRateAttachmentInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDynamicRendering#VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR STRUCTURE_TYPE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR} value to the {@link #sType} field. */
    public VkRenderingFragmentShadingRateAttachmentInfoKHR sType$Default() { return sType(KHRDynamicRendering.VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkRenderingFragmentShadingRateAttachmentInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #imageView} field. */
    public VkRenderingFragmentShadingRateAttachmentInfoKHR imageView(@NativeType("VkImageView") long value) { nimageView(address(), value); return this; }
    /** Sets the specified value to the {@link #imageLayout} field. */
    public VkRenderingFragmentShadingRateAttachmentInfoKHR imageLayout(@NativeType("VkImageLayout") int value) { nimageLayout(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@link #shadingRateAttachmentTexelSize} field. */
    public VkRenderingFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize(VkExtent2D value) { nshadingRateAttachmentTexelSize(address(), value); return this; }
    /** Passes the {@link #shadingRateAttachmentTexelSize} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkRenderingFragmentShadingRateAttachmentInfoKHR shadingRateAttachmentTexelSize(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(shadingRateAttachmentTexelSize()); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderingFragmentShadingRateAttachmentInfoKHR set(
        int sType,
        long pNext,
        long imageView,
        int imageLayout,
        VkExtent2D shadingRateAttachmentTexelSize
    ) {
        sType(sType);
        pNext(pNext);
        imageView(imageView);
        imageLayout(imageLayout);
        shadingRateAttachmentTexelSize(shadingRateAttachmentTexelSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderingFragmentShadingRateAttachmentInfoKHR set(VkRenderingFragmentShadingRateAttachmentInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderingFragmentShadingRateAttachmentInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR malloc() {
        return wrap(VkRenderingFragmentShadingRateAttachmentInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkRenderingFragmentShadingRateAttachmentInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR calloc() {
        return wrap(VkRenderingFragmentShadingRateAttachmentInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkRenderingFragmentShadingRateAttachmentInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkRenderingFragmentShadingRateAttachmentInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkRenderingFragmentShadingRateAttachmentInfoKHR} instance for the specified memory address. */
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR create(long address) {
        return wrap(VkRenderingFragmentShadingRateAttachmentInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkRenderingFragmentShadingRateAttachmentInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkRenderingFragmentShadingRateAttachmentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderingFragmentShadingRateAttachmentInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingFragmentShadingRateAttachmentInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkRenderingFragmentShadingRateAttachmentInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkRenderingFragmentShadingRateAttachmentInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR malloc(MemoryStack stack) {
        return wrap(VkRenderingFragmentShadingRateAttachmentInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkRenderingFragmentShadingRateAttachmentInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR calloc(MemoryStack stack) {
        return wrap(VkRenderingFragmentShadingRateAttachmentInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderingFragmentShadingRateAttachmentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingFragmentShadingRateAttachmentInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkRenderingFragmentShadingRateAttachmentInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderingFragmentShadingRateAttachmentInfoKHR.PNEXT); }
    /** Unsafe version of {@link #imageView}. */
    public static long nimageView(long struct) { return UNSAFE.getLong(null, struct + VkRenderingFragmentShadingRateAttachmentInfoKHR.IMAGEVIEW); }
    /** Unsafe version of {@link #imageLayout}. */
    public static int nimageLayout(long struct) { return UNSAFE.getInt(null, struct + VkRenderingFragmentShadingRateAttachmentInfoKHR.IMAGELAYOUT); }
    /** Unsafe version of {@link #shadingRateAttachmentTexelSize}. */
    public static VkExtent2D nshadingRateAttachmentTexelSize(long struct) { return VkExtent2D.create(struct + VkRenderingFragmentShadingRateAttachmentInfoKHR.SHADINGRATEATTACHMENTTEXELSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderingFragmentShadingRateAttachmentInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderingFragmentShadingRateAttachmentInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #imageView(long) imageView}. */
    public static void nimageView(long struct, long value) { UNSAFE.putLong(null, struct + VkRenderingFragmentShadingRateAttachmentInfoKHR.IMAGEVIEW, value); }
    /** Unsafe version of {@link #imageLayout(int) imageLayout}. */
    public static void nimageLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderingFragmentShadingRateAttachmentInfoKHR.IMAGELAYOUT, value); }
    /** Unsafe version of {@link #shadingRateAttachmentTexelSize(VkExtent2D) shadingRateAttachmentTexelSize}. */
    public static void nshadingRateAttachmentTexelSize(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkRenderingFragmentShadingRateAttachmentInfoKHR.SHADINGRATEATTACHMENTTEXELSIZE, VkExtent2D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkRenderingFragmentShadingRateAttachmentInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkRenderingFragmentShadingRateAttachmentInfoKHR, Buffer> implements NativeResource {

        private static final VkRenderingFragmentShadingRateAttachmentInfoKHR ELEMENT_FACTORY = VkRenderingFragmentShadingRateAttachmentInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkRenderingFragmentShadingRateAttachmentInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderingFragmentShadingRateAttachmentInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkRenderingFragmentShadingRateAttachmentInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkRenderingFragmentShadingRateAttachmentInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderingFragmentShadingRateAttachmentInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkRenderingFragmentShadingRateAttachmentInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderingFragmentShadingRateAttachmentInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkRenderingFragmentShadingRateAttachmentInfoKHR#imageView} field. */
        @NativeType("VkImageView")
        public long imageView() { return VkRenderingFragmentShadingRateAttachmentInfoKHR.nimageView(address()); }
        /** @return the value of the {@link VkRenderingFragmentShadingRateAttachmentInfoKHR#imageLayout} field. */
        @NativeType("VkImageLayout")
        public int imageLayout() { return VkRenderingFragmentShadingRateAttachmentInfoKHR.nimageLayout(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkRenderingFragmentShadingRateAttachmentInfoKHR#shadingRateAttachmentTexelSize} field. */
        public VkExtent2D shadingRateAttachmentTexelSize() { return VkRenderingFragmentShadingRateAttachmentInfoKHR.nshadingRateAttachmentTexelSize(address()); }

        /** Sets the specified value to the {@link VkRenderingFragmentShadingRateAttachmentInfoKHR#sType} field. */
        public VkRenderingFragmentShadingRateAttachmentInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderingFragmentShadingRateAttachmentInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRDynamicRendering#VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR STRUCTURE_TYPE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR} value to the {@link VkRenderingFragmentShadingRateAttachmentInfoKHR#sType} field. */
        public VkRenderingFragmentShadingRateAttachmentInfoKHR.Buffer sType$Default() { return sType(KHRDynamicRendering.VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR); }
        /** Sets the specified value to the {@link VkRenderingFragmentShadingRateAttachmentInfoKHR#pNext} field. */
        public VkRenderingFragmentShadingRateAttachmentInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkRenderingFragmentShadingRateAttachmentInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkRenderingFragmentShadingRateAttachmentInfoKHR#imageView} field. */
        public VkRenderingFragmentShadingRateAttachmentInfoKHR.Buffer imageView(@NativeType("VkImageView") long value) { VkRenderingFragmentShadingRateAttachmentInfoKHR.nimageView(address(), value); return this; }
        /** Sets the specified value to the {@link VkRenderingFragmentShadingRateAttachmentInfoKHR#imageLayout} field. */
        public VkRenderingFragmentShadingRateAttachmentInfoKHR.Buffer imageLayout(@NativeType("VkImageLayout") int value) { VkRenderingFragmentShadingRateAttachmentInfoKHR.nimageLayout(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@link VkRenderingFragmentShadingRateAttachmentInfoKHR#shadingRateAttachmentTexelSize} field. */
        public VkRenderingFragmentShadingRateAttachmentInfoKHR.Buffer shadingRateAttachmentTexelSize(VkExtent2D value) { VkRenderingFragmentShadingRateAttachmentInfoKHR.nshadingRateAttachmentTexelSize(address(), value); return this; }
        /** Passes the {@link VkRenderingFragmentShadingRateAttachmentInfoKHR#shadingRateAttachmentTexelSize} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkRenderingFragmentShadingRateAttachmentInfoKHR.Buffer shadingRateAttachmentTexelSize(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(shadingRateAttachmentTexelSize()); return this; }

    }

}
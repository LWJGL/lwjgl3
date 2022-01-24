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
 * Specify separate usage flags for the stencil aspect of a depth-stencil image.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@code pNext} chain of {@link VkImageCreateInfo} includes a {@link VkImageStencilUsageCreateInfo} structure, then that structure includes the usage flags specific to the stencil aspect of the image for an image with a depth-stencil format.</p>
 * 
 * <p>This structure specifies image usages which only apply to the stencil aspect of a depth/stencil format image. When this structure is included in the {@code pNext} chain of {@link VkImageCreateInfo}, the stencil aspect of the image <b>must</b> only be used as specified by {@code stencilUsage}. When this structure is not included in the {@code pNext} chain of {@link VkImageCreateInfo}, the stencil aspect of an image <b>must</b> only be used as specified by {@link VkImageCreateInfo}{@code ::usage}. Use of other aspects of an image are unaffected by this structure.</p>
 * 
 * <p>This structure <b>can</b> also be included in the {@code pNext} chain of {@link VkPhysicalDeviceImageFormatInfo2} to query additional capabilities specific to image creation parameter combinations including a separate set of usage flags for the stencil aspect of the image using {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2}. When this structure is not included in the {@code pNext} chain of {@link VkPhysicalDeviceImageFormatInfo2} then the implicit value of {@code stencilUsage} matches that of {@link VkPhysicalDeviceImageFormatInfo2}{@code ::usage}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code stencilUsage} includes {@link VK10#VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}, it <b>must</b> not include bits other than {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} or {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO}</li>
 * <li>{@code stencilUsage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
 * <li>{@code stencilUsage} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageStencilUsageCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImageUsageFlags {@link #stencilUsage};
 * }</code></pre>
 */
public class VkImageStencilUsageCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STENCILUSAGE;

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
        STENCILUSAGE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkImageStencilUsageCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageStencilUsageCreateInfo(ByteBuffer container) {
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
    /** a bitmask of {@code VkImageUsageFlagBits} describing the intended usage of the stencil aspect of the image. */
    @NativeType("VkImageUsageFlags")
    public int stencilUsage() { return nstencilUsage(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageStencilUsageCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO} value to the {@link #sType} field. */
    public VkImageStencilUsageCreateInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageStencilUsageCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #stencilUsage} field. */
    public VkImageStencilUsageCreateInfo stencilUsage(@NativeType("VkImageUsageFlags") int value) { nstencilUsage(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageStencilUsageCreateInfo set(
        int sType,
        long pNext,
        int stencilUsage
    ) {
        sType(sType);
        pNext(pNext);
        stencilUsage(stencilUsage);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageStencilUsageCreateInfo set(VkImageStencilUsageCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageStencilUsageCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageStencilUsageCreateInfo malloc() {
        return wrap(VkImageStencilUsageCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageStencilUsageCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageStencilUsageCreateInfo calloc() {
        return wrap(VkImageStencilUsageCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageStencilUsageCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkImageStencilUsageCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageStencilUsageCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageStencilUsageCreateInfo} instance for the specified memory address. */
    public static VkImageStencilUsageCreateInfo create(long address) {
        return wrap(VkImageStencilUsageCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageStencilUsageCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkImageStencilUsageCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageStencilUsageCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageStencilUsageCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkImageStencilUsageCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageStencilUsageCreateInfo malloc(MemoryStack stack) {
        return wrap(VkImageStencilUsageCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageStencilUsageCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageStencilUsageCreateInfo calloc(MemoryStack stack) {
        return wrap(VkImageStencilUsageCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageStencilUsageCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageStencilUsageCreateInfo.PNEXT); }
    /** Unsafe version of {@link #stencilUsage}. */
    public static int nstencilUsage(long struct) { return UNSAFE.getInt(null, struct + VkImageStencilUsageCreateInfo.STENCILUSAGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageStencilUsageCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageStencilUsageCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #stencilUsage(int) stencilUsage}. */
    public static void nstencilUsage(long struct, int value) { UNSAFE.putInt(null, struct + VkImageStencilUsageCreateInfo.STENCILUSAGE, value); }

    // -----------------------------------

    /** An array of {@link VkImageStencilUsageCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkImageStencilUsageCreateInfo, Buffer> implements NativeResource {

        private static final VkImageStencilUsageCreateInfo ELEMENT_FACTORY = VkImageStencilUsageCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkImageStencilUsageCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageStencilUsageCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkImageStencilUsageCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageStencilUsageCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageStencilUsageCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkImageStencilUsageCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageStencilUsageCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkImageStencilUsageCreateInfo#stencilUsage} field. */
        @NativeType("VkImageUsageFlags")
        public int stencilUsage() { return VkImageStencilUsageCreateInfo.nstencilUsage(address()); }

        /** Sets the specified value to the {@link VkImageStencilUsageCreateInfo#sType} field. */
        public VkImageStencilUsageCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkImageStencilUsageCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO} value to the {@link VkImageStencilUsageCreateInfo#sType} field. */
        public VkImageStencilUsageCreateInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO); }
        /** Sets the specified value to the {@link VkImageStencilUsageCreateInfo#pNext} field. */
        public VkImageStencilUsageCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkImageStencilUsageCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageStencilUsageCreateInfo#stencilUsage} field. */
        public VkImageStencilUsageCreateInfo.Buffer stencilUsage(@NativeType("VkImageUsageFlags") int value) { VkImageStencilUsageCreateInfo.nstencilUsage(address(), value); return this; }

    }

}
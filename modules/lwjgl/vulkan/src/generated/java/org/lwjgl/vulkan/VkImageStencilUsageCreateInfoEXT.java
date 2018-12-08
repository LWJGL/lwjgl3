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
 * <p>When this structure is not present in the {@code pNext} chain of {@link VkImageCreateInfo} then the implicit value of {@code stencilUsage} matches that of {@link VkImageCreateInfo}{@code ::usage}.</p>
 * 
 * <p>When this structure is present {@link VkImageCreateInfo}{@code ::usage} specifies the intended usage of the depth aspect of the image and {@link VkImageStencilUsageCreateInfoEXT}::stencilUsage specifies the intended usage of the stencil aspect of the image. However, for the purposes of determining image specific valid usage conditions, the image itself is considered to be created with a particular {@code VkImageUsageFlagBits} value if either {@link VkImageCreateInfo}{@code ::usage} or {@link VkImageStencilUsageCreateInfoEXT}::stencil usage includes that bit value.</p>
 * 
 * <p>This structure <b>can</b> also be included in the {@code pNext} chain of {@link VkPhysicalDeviceImageFormatInfo2} to query additional capabilities specific to image creation parameter combinations including a separate set of usage flags for the stencil aspect of the image using {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2}. When this structure is not present in the {@code pNext} chain of {@link VkPhysicalDeviceImageFormatInfo2} then the implicit value of {@code stencilUsage} matches that of {@link VkPhysicalDeviceImageFormatInfo2}{@code ::usage}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code stencilUsage} includes {@link VK10#VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT}, then bits other than {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT}, and {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT} <b>must</b> not be set</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSeparateStencilUsage#VK_STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO_EXT STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO_EXT}</li>
 * <li>{@code stencilUsage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
 * <li>{@code stencilUsage} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code stencilUsage} &ndash; a bitmask of {@code VkImageUsageFlagBits} describing the intended usage of the stencil aspect of the image.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageStencilUsageCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImageUsageFlags stencilUsage;
 * }</code></pre>
 */
public class VkImageStencilUsageCreateInfoEXT extends Struct implements NativeResource {

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
     * Creates a {@link VkImageStencilUsageCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageStencilUsageCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code stencilUsage} field. */
    @NativeType("VkImageUsageFlags")
    public int stencilUsage() { return nstencilUsage(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageStencilUsageCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageStencilUsageCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code stencilUsage} field. */
    public VkImageStencilUsageCreateInfoEXT stencilUsage(@NativeType("VkImageUsageFlags") int value) { nstencilUsage(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageStencilUsageCreateInfoEXT set(
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
    public VkImageStencilUsageCreateInfoEXT set(VkImageStencilUsageCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkImageStencilUsageCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageStencilUsageCreateInfoEXT malloc() {
        return wrap(VkImageStencilUsageCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkImageStencilUsageCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageStencilUsageCreateInfoEXT calloc() {
        return wrap(VkImageStencilUsageCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkImageStencilUsageCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkImageStencilUsageCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageStencilUsageCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@link VkImageStencilUsageCreateInfoEXT} instance for the specified memory address. */
    public static VkImageStencilUsageCreateInfoEXT create(long address) {
        return wrap(VkImageStencilUsageCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageStencilUsageCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkImageStencilUsageCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageStencilUsageCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageStencilUsageCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkImageStencilUsageCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImageStencilUsageCreateInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkImageStencilUsageCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImageStencilUsageCreateInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageStencilUsageCreateInfoEXT mallocStack(MemoryStack stack) {
        return wrap(VkImageStencilUsageCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageStencilUsageCreateInfoEXT callocStack(MemoryStack stack) {
        return wrap(VkImageStencilUsageCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageStencilUsageCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageStencilUsageCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageStencilUsageCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageStencilUsageCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #stencilUsage}. */
    public static int nstencilUsage(long struct) { return UNSAFE.getInt(null, struct + VkImageStencilUsageCreateInfoEXT.STENCILUSAGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageStencilUsageCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageStencilUsageCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #stencilUsage(int) stencilUsage}. */
    public static void nstencilUsage(long struct, int value) { UNSAFE.putInt(null, struct + VkImageStencilUsageCreateInfoEXT.STENCILUSAGE, value); }

    // -----------------------------------

    /** An array of {@link VkImageStencilUsageCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkImageStencilUsageCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkImageStencilUsageCreateInfoEXT ELEMENT_FACTORY = VkImageStencilUsageCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@link VkImageStencilUsageCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageStencilUsageCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkImageStencilUsageCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageStencilUsageCreateInfoEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageStencilUsageCreateInfoEXT.npNext(address()); }
        /** Returns the value of the {@code stencilUsage} field. */
        @NativeType("VkImageUsageFlags")
        public int stencilUsage() { return VkImageStencilUsageCreateInfoEXT.nstencilUsage(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageStencilUsageCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImageStencilUsageCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageStencilUsageCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkImageStencilUsageCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code stencilUsage} field. */
        public VkImageStencilUsageCreateInfoEXT.Buffer stencilUsage(@NativeType("VkImageUsageFlags") int value) { VkImageStencilUsageCreateInfoEXT.nstencilUsage(address(), value); return this; }

    }

}
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
 * Image creation information for querying subresource layout.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code aspectMask} member of {@code pSubresource} <b>must</b> only have a single bit set</li>
 * <li>The {@code mipLevel} member of {@code pSubresource} <b>must</b> be less than the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>The {@code arrayLayer} member of {@code pSubresource} <b>must</b> be less than the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code format} of the {@code image} is a color format, {@code tiling} of the {@code image} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} or {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, and does not have a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a>, the {@code aspectMask} member of {@code pSubresource} <b>must</b> be {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</li>
 * <li>If {@code format} of the {@code image} has a depth component, the {@code aspectMask} member of {@code pSubresource} <b>must</b> contain {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT}</li>
 * <li>If {@code format} of the {@code image} has a stencil component, the {@code aspectMask} member of {@code pSubresource} <b>must</b> contain {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
 * <li>If {@code format} of the {@code image} does not contain a stencil or depth component, the {@code aspectMask} member of {@code pSubresource} <b>must</b> not contain {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} or {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
 * <li>If the {@code tiling} of the {@code image} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} and has a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a>, then the {@code aspectMask} member of {@code pSubresource} <b>must</b> be a single valid <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-planes-image-aspect">multi-planar aspect mask</a> bit</li>
 * <li>If {@code image} was created with the {@link ANDROIDExternalMemoryAndroidHardwareBuffer#VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID} external memory handle type, then {@code image} <b>must</b> be bound to memory</li>
 * <li>If the {@code tiling} of the {@code image} is {@link EXTImageDrmFormatModifier#VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT}, then the {@code aspectMask} member of {@code pSubresource} <b>must</b> be <code>VK_IMAGE_ASPECT_MEMORY_PLANE<em>_i_</em>BIT_EXT</code> and the index <em>i</em> <b>must</b> be less than the {@link VkDrmFormatModifierPropertiesEXT}{@code ::drmFormatModifierPlaneCount} associated with the image’s {@code format} and {@link VkImageDrmFormatModifierPropertiesEXT}{@code ::drmFormatModifier}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRMaintenance5#VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO_KHR STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkImageCreateInfo} structure</li>
 * <li>{@code pSubresource} <b>must</b> be a valid pointer to a valid {@link VkImageSubresource2KHR} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkImageCreateInfo}, {@link VkImageSubresource2KHR}, {@link KHRMaintenance5#vkGetDeviceImageSubresourceLayoutKHR GetDeviceImageSubresourceLayoutKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceImageSubresourceInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link VkImageCreateInfo VkImageCreateInfo} const * {@link #pCreateInfo};
 *     {@link VkImageSubresource2KHR VkImageSubresource2KHR} const * {@link #pSubresource};
 * }</code></pre>
 */
public class VkDeviceImageSubresourceInfoKHR extends Struct<VkDeviceImageSubresourceInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PCREATEINFO,
        PSUBRESOURCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PCREATEINFO = layout.offsetof(2);
        PSUBRESOURCE = layout.offsetof(3);
    }

    protected VkDeviceImageSubresourceInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceImageSubresourceInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceImageSubresourceInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkDeviceImageSubresourceInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceImageSubresourceInfoKHR(ByteBuffer container) {
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
    /** a pointer to a {@link VkImageCreateInfo} structure containing parameters affecting creation of the image to query. */
    @NativeType("VkImageCreateInfo const *")
    public VkImageCreateInfo pCreateInfo() { return npCreateInfo(address()); }
    /** pSubresource is a pointer to a {@link VkImageSubresource2KHR} structure selecting a specific image subresource for the query. */
    @NativeType("VkImageSubresource2KHR const *")
    public VkImageSubresource2KHR pSubresource() { return npSubresource(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDeviceImageSubresourceInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance5#VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO_KHR STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO_KHR} value to the {@link #sType} field. */
    public VkDeviceImageSubresourceInfoKHR sType$Default() { return sType(KHRMaintenance5.VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDeviceImageSubresourceInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageCreateInfo} to the {@link #pCreateInfo} field. */
    public VkDeviceImageSubresourceInfoKHR pCreateInfo(@NativeType("VkImageCreateInfo const *") VkImageCreateInfo value) { npCreateInfo(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageSubresource2KHR} to the {@link #pSubresource} field. */
    public VkDeviceImageSubresourceInfoKHR pSubresource(@NativeType("VkImageSubresource2KHR const *") VkImageSubresource2KHR value) { npSubresource(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceImageSubresourceInfoKHR set(
        int sType,
        long pNext,
        VkImageCreateInfo pCreateInfo,
        VkImageSubresource2KHR pSubresource
    ) {
        sType(sType);
        pNext(pNext);
        pCreateInfo(pCreateInfo);
        pSubresource(pSubresource);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceImageSubresourceInfoKHR set(VkDeviceImageSubresourceInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceImageSubresourceInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceImageSubresourceInfoKHR malloc() {
        return new VkDeviceImageSubresourceInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceImageSubresourceInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceImageSubresourceInfoKHR calloc() {
        return new VkDeviceImageSubresourceInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceImageSubresourceInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceImageSubresourceInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceImageSubresourceInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceImageSubresourceInfoKHR} instance for the specified memory address. */
    public static VkDeviceImageSubresourceInfoKHR create(long address) {
        return new VkDeviceImageSubresourceInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceImageSubresourceInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkDeviceImageSubresourceInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkDeviceImageSubresourceInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageSubresourceInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceImageSubresourceInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageSubresourceInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceImageSubresourceInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageSubresourceInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceImageSubresourceInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageSubresourceInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceImageSubresourceInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceImageSubresourceInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceImageSubresourceInfoKHR malloc(MemoryStack stack) {
        return new VkDeviceImageSubresourceInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceImageSubresourceInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceImageSubresourceInfoKHR calloc(MemoryStack stack) {
        return new VkDeviceImageSubresourceInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceImageSubresourceInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageSubresourceInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceImageSubresourceInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageSubresourceInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceImageSubresourceInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceImageSubresourceInfoKHR.PNEXT); }
    /** Unsafe version of {@link #pCreateInfo}. */
    public static VkImageCreateInfo npCreateInfo(long struct) { return VkImageCreateInfo.create(memGetAddress(struct + VkDeviceImageSubresourceInfoKHR.PCREATEINFO)); }
    /** Unsafe version of {@link #pSubresource}. */
    public static VkImageSubresource2KHR npSubresource(long struct) { return VkImageSubresource2KHR.create(memGetAddress(struct + VkDeviceImageSubresourceInfoKHR.PSUBRESOURCE)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceImageSubresourceInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceImageSubresourceInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #pCreateInfo(VkImageCreateInfo) pCreateInfo}. */
    public static void npCreateInfo(long struct, VkImageCreateInfo value) { memPutAddress(struct + VkDeviceImageSubresourceInfoKHR.PCREATEINFO, value.address()); }
    /** Unsafe version of {@link #pSubresource(VkImageSubresource2KHR) pSubresource}. */
    public static void npSubresource(long struct, VkImageSubresource2KHR value) { memPutAddress(struct + VkDeviceImageSubresourceInfoKHR.PSUBRESOURCE, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDeviceImageSubresourceInfoKHR.PCREATEINFO));
        check(memGetAddress(struct + VkDeviceImageSubresourceInfoKHR.PSUBRESOURCE));
    }

    // -----------------------------------

    /** An array of {@link VkDeviceImageSubresourceInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkDeviceImageSubresourceInfoKHR, Buffer> implements NativeResource {

        private static final VkDeviceImageSubresourceInfoKHR ELEMENT_FACTORY = VkDeviceImageSubresourceInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceImageSubresourceInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceImageSubresourceInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceImageSubresourceInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDeviceImageSubresourceInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceImageSubresourceInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkDeviceImageSubresourceInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceImageSubresourceInfoKHR.npNext(address()); }
        /** @return a {@link VkImageCreateInfo} view of the struct pointed to by the {@link VkDeviceImageSubresourceInfoKHR#pCreateInfo} field. */
        @NativeType("VkImageCreateInfo const *")
        public VkImageCreateInfo pCreateInfo() { return VkDeviceImageSubresourceInfoKHR.npCreateInfo(address()); }
        /** @return a {@link VkImageSubresource2KHR} view of the struct pointed to by the {@link VkDeviceImageSubresourceInfoKHR#pSubresource} field. */
        @NativeType("VkImageSubresource2KHR const *")
        public VkImageSubresource2KHR pSubresource() { return VkDeviceImageSubresourceInfoKHR.npSubresource(address()); }

        /** Sets the specified value to the {@link VkDeviceImageSubresourceInfoKHR#sType} field. */
        public VkDeviceImageSubresourceInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceImageSubresourceInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance5#VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO_KHR STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO_KHR} value to the {@link VkDeviceImageSubresourceInfoKHR#sType} field. */
        public VkDeviceImageSubresourceInfoKHR.Buffer sType$Default() { return sType(KHRMaintenance5.VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO_KHR); }
        /** Sets the specified value to the {@link VkDeviceImageSubresourceInfoKHR#pNext} field. */
        public VkDeviceImageSubresourceInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkDeviceImageSubresourceInfoKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageCreateInfo} to the {@link VkDeviceImageSubresourceInfoKHR#pCreateInfo} field. */
        public VkDeviceImageSubresourceInfoKHR.Buffer pCreateInfo(@NativeType("VkImageCreateInfo const *") VkImageCreateInfo value) { VkDeviceImageSubresourceInfoKHR.npCreateInfo(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageSubresource2KHR} to the {@link VkDeviceImageSubresourceInfoKHR#pSubresource} field. */
        public VkDeviceImageSubresourceInfoKHR.Buffer pSubresource(@NativeType("VkImageSubresource2KHR const *") VkImageSubresource2KHR value) { VkDeviceImageSubresourceInfoKHR.npSubresource(address(), value); return this; }

    }

}
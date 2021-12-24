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
 * (None).
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code pCreateInfo}{@code ::pNext} chain <b>must</b> not contain a {@link VkImageSwapchainCreateInfoKHR} structure</li>
 * <li>If {@code pCreateInfo}{@code ::flags} has {@link VK11#VK_IMAGE_CREATE_DISJOINT_BIT IMAGE_CREATE_DISJOINT_BIT} set then {@code planeAspect} <b>must</b> not be {@link KHRMaintenance4#VK_IMAGE_ASPECT_NONE_KHR IMAGE_ASPECT_NONE_KHR}</li>
 * <li>If {@code pCreateInfo}{@code ::flags} has {@link EXTImageDrmFormatModifier#VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT} set then {@code planeAspect} <b>must</b> not be {@link KHRMaintenance4#VK_IMAGE_ASPECT_NONE_KHR IMAGE_ASPECT_NONE_KHR}</li>
 * <li>If {@code pCreateInfo}{@code ::flags} has {@link VK11#VK_IMAGE_CREATE_DISJOINT_BIT IMAGE_CREATE_DISJOINT_BIT} set and if the {@code pCreateInfo}{@code ::tiling} is {@link VK10#VK_IMAGE_TILING_LINEAR IMAGE_TILING_LINEAR} or {@link VK10#VK_IMAGE_TILING_OPTIMAL IMAGE_TILING_OPTIMAL}, then {@code planeAspect} <b>must</b> be a single valid <em>format plane</em> for the image (that is, for a two-plane image {@code planeAspect} <b>must</b> be {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT} or {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT}, and for a three-plane image {@code planeAspect} <b>must</b> be {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT}, {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT} or {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT})</li>
 * <li>If {@code pCreateInfo}{@code ::flags} has {@link EXTImageDrmFormatModifier#VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT} set and the {@code pCreateInfo}{@code ::tiling} is {@link EXTImageDrmFormatModifier#VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT}, then {@code planeAspect} <b>must</b> be a single valid <em>memory plane</em> for the image (that is, {@code aspectMask} <b>must</b> specify a plane index that is less than the {@link VkDrmFormatModifierPropertiesEXT}{@code ::drmFormatModifierPlaneCount} associated with the image’s {@code format} and {@link VkImageDrmFormatModifierPropertiesEXT}{@code ::drmFormatModifier})</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRMaintenance4#VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS_KHR STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkImageCreateInfo} structure</li>
 * <li>{@code planeAspect} <b>must</b> be a valid {@code VkImageAspectFlagBits} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkImageCreateInfo}, {@link KHRMaintenance4#vkGetDeviceImageMemoryRequirementsKHR GetDeviceImageMemoryRequirementsKHR}, {@link KHRMaintenance4#vkGetDeviceImageSparseMemoryRequirementsKHR GetDeviceImageSparseMemoryRequirementsKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceImageMemoryRequirementsKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link VkImageCreateInfo VkImageCreateInfo} const * {@link #pCreateInfo};
 *     VkImageAspectFlagBits {@link #planeAspect};
 * }</code></pre>
 */
public class VkDeviceImageMemoryRequirementsKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PCREATEINFO,
        PLANEASPECT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PCREATEINFO = layout.offsetof(2);
        PLANEASPECT = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkDeviceImageMemoryRequirementsKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceImageMemoryRequirementsKHR(ByteBuffer container) {
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
    /** a pointer to a {@link VkImageCreateInfo} structure containing parameters affecting creation of the image to query. */
    @NativeType("VkImageCreateInfo const *")
    public VkImageCreateInfo pCreateInfo() { return npCreateInfo(address()); }
    /** a {@code VkImageAspectFlagBits} value specifying the aspect corresponding to the image plane to query. This parameter is ignored unless {@code pCreateInfo}{@code ::flags} has {@link VK11#VK_IMAGE_CREATE_DISJOINT_BIT IMAGE_CREATE_DISJOINT_BIT} or {@link EXTImageDrmFormatModifier#VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT} set. */
    @NativeType("VkImageAspectFlagBits")
    public int planeAspect() { return nplaneAspect(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDeviceImageMemoryRequirementsKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance4#VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS_KHR STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS_KHR} value to the {@link #sType} field. */
    public VkDeviceImageMemoryRequirementsKHR sType$Default() { return sType(KHRMaintenance4.VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDeviceImageMemoryRequirementsKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageCreateInfo} to the {@link #pCreateInfo} field. */
    public VkDeviceImageMemoryRequirementsKHR pCreateInfo(@NativeType("VkImageCreateInfo const *") VkImageCreateInfo value) { npCreateInfo(address(), value); return this; }
    /** Sets the specified value to the {@link #planeAspect} field. */
    public VkDeviceImageMemoryRequirementsKHR planeAspect(@NativeType("VkImageAspectFlagBits") int value) { nplaneAspect(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceImageMemoryRequirementsKHR set(
        int sType,
        long pNext,
        VkImageCreateInfo pCreateInfo,
        int planeAspect
    ) {
        sType(sType);
        pNext(pNext);
        pCreateInfo(pCreateInfo);
        planeAspect(planeAspect);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceImageMemoryRequirementsKHR set(VkDeviceImageMemoryRequirementsKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceImageMemoryRequirementsKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceImageMemoryRequirementsKHR malloc() {
        return wrap(VkDeviceImageMemoryRequirementsKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceImageMemoryRequirementsKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceImageMemoryRequirementsKHR calloc() {
        return wrap(VkDeviceImageMemoryRequirementsKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceImageMemoryRequirementsKHR} instance allocated with {@link BufferUtils}. */
    public static VkDeviceImageMemoryRequirementsKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceImageMemoryRequirementsKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceImageMemoryRequirementsKHR} instance for the specified memory address. */
    public static VkDeviceImageMemoryRequirementsKHR create(long address) {
        return wrap(VkDeviceImageMemoryRequirementsKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceImageMemoryRequirementsKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceImageMemoryRequirementsKHR.class, address);
    }

    /**
     * Returns a new {@link VkDeviceImageMemoryRequirementsKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageMemoryRequirementsKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceImageMemoryRequirementsKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageMemoryRequirementsKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceImageMemoryRequirementsKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageMemoryRequirementsKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceImageMemoryRequirementsKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageMemoryRequirementsKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceImageMemoryRequirementsKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code VkDeviceImageMemoryRequirementsKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceImageMemoryRequirementsKHR malloc(MemoryStack stack) {
        return wrap(VkDeviceImageMemoryRequirementsKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceImageMemoryRequirementsKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceImageMemoryRequirementsKHR calloc(MemoryStack stack) {
        return wrap(VkDeviceImageMemoryRequirementsKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceImageMemoryRequirementsKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageMemoryRequirementsKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceImageMemoryRequirementsKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceImageMemoryRequirementsKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceImageMemoryRequirementsKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceImageMemoryRequirementsKHR.PNEXT); }
    /** Unsafe version of {@link #pCreateInfo}. */
    public static VkImageCreateInfo npCreateInfo(long struct) { return VkImageCreateInfo.create(memGetAddress(struct + VkDeviceImageMemoryRequirementsKHR.PCREATEINFO)); }
    /** Unsafe version of {@link #planeAspect}. */
    public static int nplaneAspect(long struct) { return UNSAFE.getInt(null, struct + VkDeviceImageMemoryRequirementsKHR.PLANEASPECT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceImageMemoryRequirementsKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceImageMemoryRequirementsKHR.PNEXT, value); }
    /** Unsafe version of {@link #pCreateInfo(VkImageCreateInfo) pCreateInfo}. */
    public static void npCreateInfo(long struct, VkImageCreateInfo value) { memPutAddress(struct + VkDeviceImageMemoryRequirementsKHR.PCREATEINFO, value.address()); }
    /** Unsafe version of {@link #planeAspect(int) planeAspect}. */
    public static void nplaneAspect(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceImageMemoryRequirementsKHR.PLANEASPECT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDeviceImageMemoryRequirementsKHR.PCREATEINFO));
    }

    // -----------------------------------

    /** An array of {@link VkDeviceImageMemoryRequirementsKHR} structs. */
    public static class Buffer extends StructBuffer<VkDeviceImageMemoryRequirementsKHR, Buffer> implements NativeResource {

        private static final VkDeviceImageMemoryRequirementsKHR ELEMENT_FACTORY = VkDeviceImageMemoryRequirementsKHR.create(-1L);

        /**
         * Creates a new {@code VkDeviceImageMemoryRequirementsKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceImageMemoryRequirementsKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceImageMemoryRequirementsKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDeviceImageMemoryRequirementsKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceImageMemoryRequirementsKHR.nsType(address()); }
        /** @return the value of the {@link VkDeviceImageMemoryRequirementsKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceImageMemoryRequirementsKHR.npNext(address()); }
        /** @return a {@link VkImageCreateInfo} view of the struct pointed to by the {@link VkDeviceImageMemoryRequirementsKHR#pCreateInfo} field. */
        @NativeType("VkImageCreateInfo const *")
        public VkImageCreateInfo pCreateInfo() { return VkDeviceImageMemoryRequirementsKHR.npCreateInfo(address()); }
        /** @return the value of the {@link VkDeviceImageMemoryRequirementsKHR#planeAspect} field. */
        @NativeType("VkImageAspectFlagBits")
        public int planeAspect() { return VkDeviceImageMemoryRequirementsKHR.nplaneAspect(address()); }

        /** Sets the specified value to the {@link VkDeviceImageMemoryRequirementsKHR#sType} field. */
        public VkDeviceImageMemoryRequirementsKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceImageMemoryRequirementsKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance4#VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS_KHR STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS_KHR} value to the {@link VkDeviceImageMemoryRequirementsKHR#sType} field. */
        public VkDeviceImageMemoryRequirementsKHR.Buffer sType$Default() { return sType(KHRMaintenance4.VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS_KHR); }
        /** Sets the specified value to the {@link VkDeviceImageMemoryRequirementsKHR#pNext} field. */
        public VkDeviceImageMemoryRequirementsKHR.Buffer pNext(@NativeType("void const *") long value) { VkDeviceImageMemoryRequirementsKHR.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageCreateInfo} to the {@link VkDeviceImageMemoryRequirementsKHR#pCreateInfo} field. */
        public VkDeviceImageMemoryRequirementsKHR.Buffer pCreateInfo(@NativeType("VkImageCreateInfo const *") VkImageCreateInfo value) { VkDeviceImageMemoryRequirementsKHR.npCreateInfo(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceImageMemoryRequirementsKHR#planeAspect} field. */
        public VkDeviceImageMemoryRequirementsKHR.Buffer planeAspect(@NativeType("VkImageAspectFlagBits") int value) { VkDeviceImageMemoryRequirementsKHR.nplaneAspect(address(), value); return this; }

    }

}
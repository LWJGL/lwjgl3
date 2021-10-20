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
 * Structure specifying image creation parameters.
 * 
 * <h5>Description</h5>
 * 
 * <p>The members of {@link VkPhysicalDeviceImageFormatInfo2} correspond to the arguments to {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties}, with {@code sType} and {@code pNext} added for extensibility.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code tiling} <b>must</b> be {@link EXTImageDrmFormatModifier#VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT} if and only if the {@code pNext} chain includes {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT}</li>
 * <li>If {@code tiling} is {@link EXTImageDrmFormatModifier#VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT} and {@code flags} contains {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT}, then the {@code pNext} chain <b>must</b> include a {@link VkImageFormatListCreateInfo} structure with non-zero {@code viewFormatCount}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkImageFormatListCreateInfo}, {@link VkImageStencilUsageCreateInfo}, {@link VkPhysicalDeviceExternalImageFormatInfo}, {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT}, or {@link VkPhysicalDeviceImageViewImageFormatInfoEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code type} <b>must</b> be a valid {@code VkImageType} value</li>
 * <li>{@code tiling} <b>must</b> be a valid {@code VkImageTiling} value</li>
 * <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
 * <li>{@code usage} <b>must</b> not be 0</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkImageCreateFlagBits} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2}, {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceImageFormatProperties2KHR GetPhysicalDeviceImageFormatProperties2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceImageFormatInfo2 {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkFormat {@link #format};
 *     VkImageType {@link #type};
 *     VkImageTiling {@link #tiling};
 *     VkImageUsageFlags {@link #usage};
 *     VkImageCreateFlags {@link #flags};
 * }</code></pre>
 */
public class VkPhysicalDeviceImageFormatInfo2 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FORMAT,
        TYPE,
        TILING,
        USAGE,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
        TYPE = layout.offsetof(3);
        TILING = layout.offsetof(4);
        USAGE = layout.offsetof(5);
        FLAGS = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkPhysicalDeviceImageFormatInfo2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImageFormatInfo2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. The {@code pNext} chain of {@link VkPhysicalDeviceImageFormatInfo2} is used to provide additional image parameters to {@code vkGetPhysicalDeviceImageFormatProperties2}. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkFormat} value indicating the image format, corresponding to {@link VkImageCreateInfo}{@code ::format}. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** a {@code VkImageType} value indicating the image type, corresponding to {@link VkImageCreateInfo}{@code ::imageType}. */
    @NativeType("VkImageType")
    public int type() { return ntype(address()); }
    /** a {@code VkImageTiling} value indicating the image tiling, corresponding to {@link VkImageCreateInfo}{@code ::tiling}. */
    @NativeType("VkImageTiling")
    public int tiling() { return ntiling(address()); }
    /** a bitmask of {@code VkImageUsageFlagBits} indicating the intended usage of the image, corresponding to {@link VkImageCreateInfo}{@code ::usage}. */
    @NativeType("VkImageUsageFlags")
    public int usage() { return nusage(address()); }
    /** a bitmask of {@code VkImageCreateFlagBits} indicating additional parameters of the image, corresponding to {@link VkImageCreateInfo}{@code ::flags}. */
    @NativeType("VkImageCreateFlags")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceImageFormatInfo2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2} value to the {@link #sType} field. */
    public VkPhysicalDeviceImageFormatInfo2 sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceImageFormatInfo2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkImageFormatListCreateInfo} value to the {@code pNext} chain. */
    public VkPhysicalDeviceImageFormatInfo2 pNext(VkImageFormatListCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageFormatListCreateInfoKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceImageFormatInfo2 pNext(VkImageFormatListCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageStencilUsageCreateInfo} value to the {@code pNext} chain. */
    public VkPhysicalDeviceImageFormatInfo2 pNext(VkImageStencilUsageCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageStencilUsageCreateInfoEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceImageFormatInfo2 pNext(VkImageStencilUsageCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExternalImageFormatInfo} value to the {@code pNext} chain. */
    public VkPhysicalDeviceImageFormatInfo2 pNext(VkPhysicalDeviceExternalImageFormatInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceExternalImageFormatInfoKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceImageFormatInfo2 pNext(VkPhysicalDeviceExternalImageFormatInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceImageFormatInfo2 pNext(VkPhysicalDeviceImageDrmFormatModifierInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPhysicalDeviceImageViewImageFormatInfoEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceImageFormatInfo2 pNext(VkPhysicalDeviceImageViewImageFormatInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #format} field. */
    public VkPhysicalDeviceImageFormatInfo2 format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@link #type} field. */
    public VkPhysicalDeviceImageFormatInfo2 type(@NativeType("VkImageType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #tiling} field. */
    public VkPhysicalDeviceImageFormatInfo2 tiling(@NativeType("VkImageTiling") int value) { ntiling(address(), value); return this; }
    /** Sets the specified value to the {@link #usage} field. */
    public VkPhysicalDeviceImageFormatInfo2 usage(@NativeType("VkImageUsageFlags") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkPhysicalDeviceImageFormatInfo2 flags(@NativeType("VkImageCreateFlags") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceImageFormatInfo2 set(
        int sType,
        long pNext,
        int format,
        int type,
        int tiling,
        int usage,
        int flags
    ) {
        sType(sType);
        pNext(pNext);
        format(format);
        type(type);
        tiling(tiling);
        usage(usage);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceImageFormatInfo2 set(VkPhysicalDeviceImageFormatInfo2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImageFormatInfo2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageFormatInfo2 malloc() {
        return wrap(VkPhysicalDeviceImageFormatInfo2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceImageFormatInfo2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageFormatInfo2 calloc() {
        return wrap(VkPhysicalDeviceImageFormatInfo2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceImageFormatInfo2} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImageFormatInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceImageFormatInfo2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceImageFormatInfo2} instance for the specified memory address. */
    public static VkPhysicalDeviceImageFormatInfo2 create(long address) {
        return wrap(VkPhysicalDeviceImageFormatInfo2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImageFormatInfo2 createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceImageFormatInfo2.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceImageFormatInfo2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImageFormatInfo2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageFormatInfo2.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceImageFormatInfo2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageFormatInfo2 malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceImageFormatInfo2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageFormatInfo2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageFormatInfo2 calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceImageFormatInfo2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageFormatInfo2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageFormatInfo2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImageFormatInfo2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImageFormatInfo2.PNEXT); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImageFormatInfo2.FORMAT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImageFormatInfo2.TYPE); }
    /** Unsafe version of {@link #tiling}. */
    public static int ntiling(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImageFormatInfo2.TILING); }
    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImageFormatInfo2.USAGE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImageFormatInfo2.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImageFormatInfo2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImageFormatInfo2.PNEXT, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImageFormatInfo2.FORMAT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImageFormatInfo2.TYPE, value); }
    /** Unsafe version of {@link #tiling(int) tiling}. */
    public static void ntiling(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImageFormatInfo2.TILING, value); }
    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImageFormatInfo2.USAGE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImageFormatInfo2.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImageFormatInfo2} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageFormatInfo2, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceImageFormatInfo2 ELEMENT_FACTORY = VkPhysicalDeviceImageFormatInfo2.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceImageFormatInfo2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImageFormatInfo2#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceImageFormatInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceImageFormatInfo2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceImageFormatInfo2.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceImageFormatInfo2#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPhysicalDeviceImageFormatInfo2.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceImageFormatInfo2#format} field. */
        @NativeType("VkFormat")
        public int format() { return VkPhysicalDeviceImageFormatInfo2.nformat(address()); }
        /** @return the value of the {@link VkPhysicalDeviceImageFormatInfo2#type} field. */
        @NativeType("VkImageType")
        public int type() { return VkPhysicalDeviceImageFormatInfo2.ntype(address()); }
        /** @return the value of the {@link VkPhysicalDeviceImageFormatInfo2#tiling} field. */
        @NativeType("VkImageTiling")
        public int tiling() { return VkPhysicalDeviceImageFormatInfo2.ntiling(address()); }
        /** @return the value of the {@link VkPhysicalDeviceImageFormatInfo2#usage} field. */
        @NativeType("VkImageUsageFlags")
        public int usage() { return VkPhysicalDeviceImageFormatInfo2.nusage(address()); }
        /** @return the value of the {@link VkPhysicalDeviceImageFormatInfo2#flags} field. */
        @NativeType("VkImageCreateFlags")
        public int flags() { return VkPhysicalDeviceImageFormatInfo2.nflags(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceImageFormatInfo2#sType} field. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImageFormatInfo2.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2} value to the {@link VkPhysicalDeviceImageFormatInfo2#sType} field. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2); }
        /** Sets the specified value to the {@link VkPhysicalDeviceImageFormatInfo2#pNext} field. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer pNext(@NativeType("void const *") long value) { VkPhysicalDeviceImageFormatInfo2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkImageFormatListCreateInfo} value to the {@code pNext} chain. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer pNext(VkImageFormatListCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageFormatListCreateInfoKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer pNext(VkImageFormatListCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageStencilUsageCreateInfo} value to the {@code pNext} chain. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer pNext(VkImageStencilUsageCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageStencilUsageCreateInfoEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer pNext(VkImageStencilUsageCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExternalImageFormatInfo} value to the {@code pNext} chain. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer pNext(VkPhysicalDeviceExternalImageFormatInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceExternalImageFormatInfoKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer pNext(VkPhysicalDeviceExternalImageFormatInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer pNext(VkPhysicalDeviceImageDrmFormatModifierInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPhysicalDeviceImageViewImageFormatInfoEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer pNext(VkPhysicalDeviceImageViewImageFormatInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkPhysicalDeviceImageFormatInfo2#format} field. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer format(@NativeType("VkFormat") int value) { VkPhysicalDeviceImageFormatInfo2.nformat(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceImageFormatInfo2#type} field. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer type(@NativeType("VkImageType") int value) { VkPhysicalDeviceImageFormatInfo2.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceImageFormatInfo2#tiling} field. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer tiling(@NativeType("VkImageTiling") int value) { VkPhysicalDeviceImageFormatInfo2.ntiling(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceImageFormatInfo2#usage} field. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer usage(@NativeType("VkImageUsageFlags") int value) { VkPhysicalDeviceImageFormatInfo2.nusage(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceImageFormatInfo2#flags} field. */
        public VkPhysicalDeviceImageFormatInfo2.Buffer flags(@NativeType("VkImageCreateFlags") int value) { VkPhysicalDeviceImageFormatInfo2.nflags(address(), value); return this; }

    }

}
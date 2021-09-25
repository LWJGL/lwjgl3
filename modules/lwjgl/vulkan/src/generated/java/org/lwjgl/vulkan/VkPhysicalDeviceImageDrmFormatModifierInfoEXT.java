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
 * Structure specifying a DRM format modifier as image creation parameter.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@code drmFormatModifier} is incompatible with the parameters specified in {@link VkPhysicalDeviceImageFormatInfo2} and its {@code pNext} chain, then {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2} returns {@link VK10#VK_ERROR_FORMAT_NOT_SUPPORTED ERROR_FORMAT_NOT_SUPPORTED}. The implementation <b>must</b> support the query of any {@code drmFormatModifier}, including unknown and invalid modifier values.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code sharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, then {@code pQueueFamilyIndices} <b>must</b> be a valid pointer to an array of {@code queueFamilyIndexCount} {@code uint32_t} values</li>
 * <li>If {@code sharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, then {@code queueFamilyIndexCount} <b>must</b> be greater than 1</li>
 * <li>If {@code sharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, each element of {@code pQueueFamilyIndices} <b>must</b> be unique and <b>must</b> be less than the {@code pQueueFamilyPropertyCount} returned by {@link VK11#vkGetPhysicalDeviceQueueFamilyProperties2 GetPhysicalDeviceQueueFamilyProperties2} for the {@code physicalDevice} that was used to create {@code device}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT}</li>
 * <li>{@code sharingMode} <b>must</b> be a valid {@code VkSharingMode} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceImageDrmFormatModifierInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint64_t {@link #drmFormatModifier};
 *     VkSharingMode {@link #sharingMode};
 *     uint32_t {@link #queueFamilyIndexCount};
 *     uint32_t const * {@link #pQueueFamilyIndices};
 * }</code></pre>
 */
public class VkPhysicalDeviceImageDrmFormatModifierInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DRMFORMATMODIFIER,
        SHARINGMODE,
        QUEUEFAMILYINDEXCOUNT,
        PQUEUEFAMILYINDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DRMFORMATMODIFIER = layout.offsetof(2);
        SHARINGMODE = layout.offsetof(3);
        QUEUEFAMILYINDEXCOUNT = layout.offsetof(4);
        PQUEUEFAMILYINDICES = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkPhysicalDeviceImageDrmFormatModifierInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT(ByteBuffer container) {
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
    /** the image’s <em>Linux DRM format modifier</em>, corresponding to {@link VkImageDrmFormatModifierExplicitCreateInfoEXT}{@code ::modifier} or to {@link VkImageDrmFormatModifierListCreateInfoEXT}{@code ::pModifiers}. */
    @NativeType("uint64_t")
    public long drmFormatModifier() { return ndrmFormatModifier(address()); }
    /** specifies how the image will be accessed by multiple queue families. */
    @NativeType("VkSharingMode")
    public int sharingMode() { return nsharingMode(address()); }
    /** the number of entries in the {@code pQueueFamilyIndices} array. */
    @NativeType("uint32_t")
    public int queueFamilyIndexCount() { return nqueueFamilyIndexCount(address()); }
    /** a pointer to an array of queue families that will access the image. It is ignored if {@code sharingMode} is not {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}. */
    @Nullable
    @NativeType("uint32_t const *")
    public IntBuffer pQueueFamilyIndices() { return npQueueFamilyIndices(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT sType$Default() { return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #drmFormatModifier} field. */
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT drmFormatModifier(@NativeType("uint64_t") long value) { ndrmFormatModifier(address(), value); return this; }
    /** Sets the specified value to the {@link #sharingMode} field. */
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT sharingMode(@NativeType("VkSharingMode") int value) { nsharingMode(address(), value); return this; }
    /** Sets the specified value to the {@link #queueFamilyIndexCount} field. */
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT queueFamilyIndexCount(@NativeType("uint32_t") int value) { nqueueFamilyIndexCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pQueueFamilyIndices} field. */
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT pQueueFamilyIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npQueueFamilyIndices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT set(
        int sType,
        long pNext,
        long drmFormatModifier,
        int sharingMode,
        int queueFamilyIndexCount,
        @Nullable IntBuffer pQueueFamilyIndices
    ) {
        sType(sType);
        pNext(pNext);
        drmFormatModifier(drmFormatModifier);
        sharingMode(sharingMode);
        queueFamilyIndexCount(queueFamilyIndexCount);
        pQueueFamilyIndices(pQueueFamilyIndices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT set(VkPhysicalDeviceImageDrmFormatModifierInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImageDrmFormatModifierInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT malloc() {
        return wrap(VkPhysicalDeviceImageDrmFormatModifierInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceImageDrmFormatModifierInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT calloc() {
        return wrap(VkPhysicalDeviceImageDrmFormatModifierInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceImageDrmFormatModifierInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceImageDrmFormatModifierInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceImageDrmFormatModifierInfoEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT create(long address) {
        return wrap(VkPhysicalDeviceImageDrmFormatModifierInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceImageDrmFormatModifierInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceImageDrmFormatModifierInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceImageDrmFormatModifierInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageDrmFormatModifierInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceImageDrmFormatModifierInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.PNEXT); }
    /** Unsafe version of {@link #drmFormatModifier}. */
    public static long ndrmFormatModifier(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.DRMFORMATMODIFIER); }
    /** Unsafe version of {@link #sharingMode}. */
    public static int nsharingMode(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.SHARINGMODE); }
    /** Unsafe version of {@link #queueFamilyIndexCount}. */
    public static int nqueueFamilyIndexCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.QUEUEFAMILYINDEXCOUNT); }
    /** Unsafe version of {@link #pQueueFamilyIndices() pQueueFamilyIndices}. */
    @Nullable public static IntBuffer npQueueFamilyIndices(long struct) { return memIntBufferSafe(memGetAddress(struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.PQUEUEFAMILYINDICES), nqueueFamilyIndexCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #drmFormatModifier(long) drmFormatModifier}. */
    public static void ndrmFormatModifier(long struct, long value) { UNSAFE.putLong(null, struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.DRMFORMATMODIFIER, value); }
    /** Unsafe version of {@link #sharingMode(int) sharingMode}. */
    public static void nsharingMode(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.SHARINGMODE, value); }
    /** Sets the specified value to the {@code queueFamilyIndexCount} field of the specified {@code struct}. */
    public static void nqueueFamilyIndexCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.QUEUEFAMILYINDEXCOUNT, value); }
    /** Unsafe version of {@link #pQueueFamilyIndices(IntBuffer) pQueueFamilyIndices}. */
    public static void npQueueFamilyIndices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkPhysicalDeviceImageDrmFormatModifierInfoEXT.PQUEUEFAMILYINDICES, memAddressSafe(value)); if (value != null) { nqueueFamilyIndexCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageDrmFormatModifierInfoEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceImageDrmFormatModifierInfoEXT ELEMENT_FACTORY = VkPhysicalDeviceImageDrmFormatModifierInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceImageDrmFormatModifierInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT#drmFormatModifier} field. */
        @NativeType("uint64_t")
        public long drmFormatModifier() { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.ndrmFormatModifier(address()); }
        /** @return the value of the {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT#sharingMode} field. */
        @NativeType("VkSharingMode")
        public int sharingMode() { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.nsharingMode(address()); }
        /** @return the value of the {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT#queueFamilyIndexCount} field. */
        @NativeType("uint32_t")
        public int queueFamilyIndexCount() { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.nqueueFamilyIndexCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT#pQueueFamilyIndices} field. */
        @Nullable
        @NativeType("uint32_t const *")
        public IntBuffer pQueueFamilyIndices() { return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.npQueueFamilyIndices(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT#sType} field. */
        public VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT} value to the {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT#sType} field. */
        public VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer sType$Default() { return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT#pNext} field. */
        public VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT#drmFormatModifier} field. */
        public VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer drmFormatModifier(@NativeType("uint64_t") long value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.ndrmFormatModifier(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT#sharingMode} field. */
        public VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer sharingMode(@NativeType("VkSharingMode") int value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.nsharingMode(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT#queueFamilyIndexCount} field. */
        public VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer queueFamilyIndexCount(@NativeType("uint32_t") int value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.nqueueFamilyIndexCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT#pQueueFamilyIndices} field. */
        public VkPhysicalDeviceImageDrmFormatModifierInfoEXT.Buffer pQueueFamilyIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkPhysicalDeviceImageDrmFormatModifierInfoEXT.npQueueFamilyIndices(address(), value); return this; }

    }

}
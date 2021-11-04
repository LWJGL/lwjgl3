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
 * Specify that an image be created with the provided DRM format modifier and explicit memory layout.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@code i}<sup>th</sup> member of {@code pPlaneLayouts} describes the layout of the image’s {@code i}<sup>th</sup> <em>memory plane</em> (that is, <code>VK_IMAGE_ASPECT_MEMORY_PLANE<em>_i_</em>BIT_EXT</code>). In each element of {@code pPlaneLayouts}, the implementation <b>must</b> ignore {@code size}. The implementation calculates the size of each plane, which the application <b>can</b> query with {@link VK10#vkGetImageSubresourceLayout GetImageSubresourceLayout}.</p>
 * 
 * <p>When creating an image with {@link VkImageDrmFormatModifierExplicitCreateInfoEXT}, it is the application’s responsibility to satisfy all valid usage requirements. However, the implementation <b>must</b> validate that the provided {@code pPlaneLayouts}, when combined with the provided {@code drmFormatModifier} and other creation parameters in {@link VkImageCreateInfo} and its {@code pNext} chain, produce a valid image. (This validation is necessarily implementation-dependent and outside the scope of Vulkan, and therefore not described by valid usage requirements). If this validation fails, then {@link VK10#vkCreateImage CreateImage} returns {@link EXTImageDrmFormatModifier#VK_ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code drmFormatModifier} <b>must</b> be compatible with the parameters in {@link VkImageCreateInfo} and its {@code pNext} chain, as determined by querying {@link VkPhysicalDeviceImageFormatInfo2} extended with {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT}</li>
 * <li>{@code drmFormatModifierPlaneCount} <b>must</b> be equal to the {@link VkDrmFormatModifierPropertiesEXT}{@code ::drmFormatModifierPlaneCount} associated with {@link VkImageCreateInfo}{@code ::format} and {@code drmFormatModifier}, as found by querying {@link VkDrmFormatModifierPropertiesListEXT}</li>
 * <li>For each element of {@code pPlaneLayouts}, {@code size} <b>must</b> be 0</li>
 * <li>For each element of {@code pPlaneLayouts}, {@code arrayPitch} <b>must</b> be 0 if {@link VkImageCreateInfo}{@code ::arrayLayers} is 1</li>
 * <li>For each element of {@code pPlaneLayouts}, {@code depthPitch} <b>must</b> be 0 if {@link VkImageCreateInfo}{@code ::extent.depth} is 1</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT}</li>
 * <li>If {@code drmFormatModifierPlaneCount} is not 0, {@code pPlaneLayouts} <b>must</b> be a valid pointer to an array of {@code drmFormatModifierPlaneCount} {@link VkSubresourceLayout} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkSubresourceLayout}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageDrmFormatModifierExplicitCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint64_t {@link #drmFormatModifier};
 *     uint32_t {@link #drmFormatModifierPlaneCount};
 *     {@link VkSubresourceLayout VkSubresourceLayout} const * {@link #pPlaneLayouts};
 * }</code></pre>
 */
public class VkImageDrmFormatModifierExplicitCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DRMFORMATMODIFIER,
        DRMFORMATMODIFIERPLANECOUNT,
        PPLANELAYOUTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DRMFORMATMODIFIER = layout.offsetof(2);
        DRMFORMATMODIFIERPLANECOUNT = layout.offsetof(3);
        PPLANELAYOUTS = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkImageDrmFormatModifierExplicitCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageDrmFormatModifierExplicitCreateInfoEXT(ByteBuffer container) {
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
    /** the <em>Linux DRM format modifier</em> with which the image will be created. */
    @NativeType("uint64_t")
    public long drmFormatModifier() { return ndrmFormatModifier(address()); }
    /** the number of <em>memory planes</em> in the image (as reported by {@link VkDrmFormatModifierPropertiesEXT}) as well as the length of the {@code pPlaneLayouts} array. */
    @NativeType("uint32_t")
    public int drmFormatModifierPlaneCount() { return ndrmFormatModifierPlaneCount(address()); }
    /** a pointer to an array of {@link VkSubresourceLayout} structures describing the image’s <em>memory planes</em>. */
    @Nullable
    @NativeType("VkSubresourceLayout const *")
    public VkSubresourceLayout.Buffer pPlaneLayouts() { return npPlaneLayouts(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageDrmFormatModifierExplicitCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkImageDrmFormatModifierExplicitCreateInfoEXT sType$Default() { return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageDrmFormatModifierExplicitCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #drmFormatModifier} field. */
    public VkImageDrmFormatModifierExplicitCreateInfoEXT drmFormatModifier(@NativeType("uint64_t") long value) { ndrmFormatModifier(address(), value); return this; }
    /** Sets the address of the specified {@link VkSubresourceLayout.Buffer} to the {@link #pPlaneLayouts} field. */
    public VkImageDrmFormatModifierExplicitCreateInfoEXT pPlaneLayouts(@Nullable @NativeType("VkSubresourceLayout const *") VkSubresourceLayout.Buffer value) { npPlaneLayouts(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageDrmFormatModifierExplicitCreateInfoEXT set(
        int sType,
        long pNext,
        long drmFormatModifier,
        @Nullable VkSubresourceLayout.Buffer pPlaneLayouts
    ) {
        sType(sType);
        pNext(pNext);
        drmFormatModifier(drmFormatModifier);
        pPlaneLayouts(pPlaneLayouts);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageDrmFormatModifierExplicitCreateInfoEXT set(VkImageDrmFormatModifierExplicitCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageDrmFormatModifierExplicitCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT malloc() {
        return wrap(VkImageDrmFormatModifierExplicitCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageDrmFormatModifierExplicitCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT calloc() {
        return wrap(VkImageDrmFormatModifierExplicitCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageDrmFormatModifierExplicitCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageDrmFormatModifierExplicitCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageDrmFormatModifierExplicitCreateInfoEXT} instance for the specified memory address. */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT create(long address) {
        return wrap(VkImageDrmFormatModifierExplicitCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkImageDrmFormatModifierExplicitCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierExplicitCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierExplicitCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierExplicitCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierExplicitCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImageDrmFormatModifierExplicitCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkImageDrmFormatModifierExplicitCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageDrmFormatModifierExplicitCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkImageDrmFormatModifierExplicitCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageDrmFormatModifierExplicitCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageDrmFormatModifierExplicitCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #drmFormatModifier}. */
    public static long ndrmFormatModifier(long struct) { return UNSAFE.getLong(null, struct + VkImageDrmFormatModifierExplicitCreateInfoEXT.DRMFORMATMODIFIER); }
    /** Unsafe version of {@link #drmFormatModifierPlaneCount}. */
    public static int ndrmFormatModifierPlaneCount(long struct) { return UNSAFE.getInt(null, struct + VkImageDrmFormatModifierExplicitCreateInfoEXT.DRMFORMATMODIFIERPLANECOUNT); }
    /** Unsafe version of {@link #pPlaneLayouts}. */
    @Nullable public static VkSubresourceLayout.Buffer npPlaneLayouts(long struct) { return VkSubresourceLayout.createSafe(memGetAddress(struct + VkImageDrmFormatModifierExplicitCreateInfoEXT.PPLANELAYOUTS), ndrmFormatModifierPlaneCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageDrmFormatModifierExplicitCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageDrmFormatModifierExplicitCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #drmFormatModifier(long) drmFormatModifier}. */
    public static void ndrmFormatModifier(long struct, long value) { UNSAFE.putLong(null, struct + VkImageDrmFormatModifierExplicitCreateInfoEXT.DRMFORMATMODIFIER, value); }
    /** Sets the specified value to the {@code drmFormatModifierPlaneCount} field of the specified {@code struct}. */
    public static void ndrmFormatModifierPlaneCount(long struct, int value) { UNSAFE.putInt(null, struct + VkImageDrmFormatModifierExplicitCreateInfoEXT.DRMFORMATMODIFIERPLANECOUNT, value); }
    /** Unsafe version of {@link #pPlaneLayouts(VkSubresourceLayout.Buffer) pPlaneLayouts}. */
    public static void npPlaneLayouts(long struct, @Nullable VkSubresourceLayout.Buffer value) { memPutAddress(struct + VkImageDrmFormatModifierExplicitCreateInfoEXT.PPLANELAYOUTS, memAddressSafe(value)); ndrmFormatModifierPlaneCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ndrmFormatModifierPlaneCount(struct) != 0) {
            check(memGetAddress(struct + VkImageDrmFormatModifierExplicitCreateInfoEXT.PPLANELAYOUTS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkImageDrmFormatModifierExplicitCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkImageDrmFormatModifierExplicitCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkImageDrmFormatModifierExplicitCreateInfoEXT ELEMENT_FACTORY = VkImageDrmFormatModifierExplicitCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageDrmFormatModifierExplicitCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkImageDrmFormatModifierExplicitCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageDrmFormatModifierExplicitCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageDrmFormatModifierExplicitCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkImageDrmFormatModifierExplicitCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageDrmFormatModifierExplicitCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkImageDrmFormatModifierExplicitCreateInfoEXT#drmFormatModifier} field. */
        @NativeType("uint64_t")
        public long drmFormatModifier() { return VkImageDrmFormatModifierExplicitCreateInfoEXT.ndrmFormatModifier(address()); }
        /** @return the value of the {@link VkImageDrmFormatModifierExplicitCreateInfoEXT#drmFormatModifierPlaneCount} field. */
        @NativeType("uint32_t")
        public int drmFormatModifierPlaneCount() { return VkImageDrmFormatModifierExplicitCreateInfoEXT.ndrmFormatModifierPlaneCount(address()); }
        /** @return a {@link VkSubresourceLayout.Buffer} view of the struct array pointed to by the {@link VkImageDrmFormatModifierExplicitCreateInfoEXT#pPlaneLayouts} field. */
        @Nullable
        @NativeType("VkSubresourceLayout const *")
        public VkSubresourceLayout.Buffer pPlaneLayouts() { return VkImageDrmFormatModifierExplicitCreateInfoEXT.npPlaneLayouts(address()); }

        /** Sets the specified value to the {@link VkImageDrmFormatModifierExplicitCreateInfoEXT#sType} field. */
        public VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT} value to the {@link VkImageDrmFormatModifierExplicitCreateInfoEXT#sType} field. */
        public VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer sType$Default() { return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkImageDrmFormatModifierExplicitCreateInfoEXT#pNext} field. */
        public VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkImageDrmFormatModifierExplicitCreateInfoEXT#drmFormatModifier} field. */
        public VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer drmFormatModifier(@NativeType("uint64_t") long value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.ndrmFormatModifier(address(), value); return this; }
        /** Sets the address of the specified {@link VkSubresourceLayout.Buffer} to the {@link VkImageDrmFormatModifierExplicitCreateInfoEXT#pPlaneLayouts} field. */
        public VkImageDrmFormatModifierExplicitCreateInfoEXT.Buffer pPlaneLayouts(@Nullable @NativeType("VkSubresourceLayout const *") VkSubresourceLayout.Buffer value) { VkImageDrmFormatModifierExplicitCreateInfoEXT.npPlaneLayouts(address(), value); return this; }

    }

}
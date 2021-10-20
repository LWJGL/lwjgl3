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
 * Structure specifying an image format properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the combination of parameters to {@code vkGetPhysicalDeviceImageFormatProperties2} is not supported by the implementation for use in {@link VK10#vkCreateImage CreateImage}, then all members of {@code imageFormatProperties} will be filled with zero.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Filling {@code imageFormatProperties} with zero for unsupported formats is an exception to the usual rule that output structures have undefined contents on error. This exception was unintentional, but is preserved for backwards compatibility. This exeption only applies to {@code imageFormatProperties}, not {@code sType}, {@code pNext}, or any structures chained from {@code pNext}.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2 STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkExternalImageFormatProperties}, {@link VkFilterCubicImageViewImageFormatPropertiesEXT}, {@link VkSamplerYcbcrConversionImageFormatProperties}, or {@link VkTextureLODGatherFormatPropertiesAMD}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkImageFormatProperties}, {@link VK11#vkGetPhysicalDeviceImageFormatProperties2 GetPhysicalDeviceImageFormatProperties2}, {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceImageFormatProperties2KHR GetPhysicalDeviceImageFormatProperties2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageFormatProperties2 {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     {@link VkImageFormatProperties VkImageFormatProperties} {@link #imageFormatProperties};
 * }</code></pre>
 */
public class VkImageFormatProperties2 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGEFORMATPROPERTIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkImageFormatProperties.SIZEOF, VkImageFormatProperties.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGEFORMATPROPERTIES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkImageFormatProperties2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageFormatProperties2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. The {@code pNext} chain of {@link VkImageFormatProperties2} is used to allow the specification of additional capabilities to be returned from {@code vkGetPhysicalDeviceImageFormatProperties2}. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a {@link VkImageFormatProperties} structure in which capabilities are returned. */
    public VkImageFormatProperties imageFormatProperties() { return nimageFormatProperties(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageFormatProperties2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2 STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2} value to the {@link #sType} field. */
    public VkImageFormatProperties2 sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageFormatProperties2 pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkExternalImageFormatProperties} value to the {@code pNext} chain. */
    public VkImageFormatProperties2 pNext(VkExternalImageFormatProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExternalImageFormatPropertiesKHR} value to the {@code pNext} chain. */
    public VkImageFormatProperties2 pNext(VkExternalImageFormatPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkFilterCubicImageViewImageFormatPropertiesEXT} value to the {@code pNext} chain. */
    public VkImageFormatProperties2 pNext(VkFilterCubicImageViewImageFormatPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSamplerYcbcrConversionImageFormatProperties} value to the {@code pNext} chain. */
    public VkImageFormatProperties2 pNext(VkSamplerYcbcrConversionImageFormatProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSamplerYcbcrConversionImageFormatPropertiesKHR} value to the {@code pNext} chain. */
    public VkImageFormatProperties2 pNext(VkSamplerYcbcrConversionImageFormatPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkTextureLODGatherFormatPropertiesAMD} value to the {@code pNext} chain. */
    public VkImageFormatProperties2 pNext(VkTextureLODGatherFormatPropertiesAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }

    /** Initializes this struct with the specified values. */
    public VkImageFormatProperties2 set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageFormatProperties2 set(VkImageFormatProperties2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageFormatProperties2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageFormatProperties2 malloc() {
        return wrap(VkImageFormatProperties2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageFormatProperties2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageFormatProperties2 calloc() {
        return wrap(VkImageFormatProperties2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageFormatProperties2} instance allocated with {@link BufferUtils}. */
    public static VkImageFormatProperties2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageFormatProperties2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageFormatProperties2} instance for the specified memory address. */
    public static VkImageFormatProperties2 create(long address) {
        return wrap(VkImageFormatProperties2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageFormatProperties2 createSafe(long address) {
        return address == NULL ? null : wrap(VkImageFormatProperties2.class, address);
    }

    /**
     * Returns a new {@link VkImageFormatProperties2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageFormatProperties2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageFormatProperties2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageFormatProperties2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageFormatProperties2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageFormatProperties2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageFormatProperties2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageFormatProperties2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageFormatProperties2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageFormatProperties2 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageFormatProperties2 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageFormatProperties2 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageFormatProperties2 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageFormatProperties2.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageFormatProperties2.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageFormatProperties2.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageFormatProperties2.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImageFormatProperties2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageFormatProperties2 malloc(MemoryStack stack) {
        return wrap(VkImageFormatProperties2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageFormatProperties2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageFormatProperties2 calloc(MemoryStack stack) {
        return wrap(VkImageFormatProperties2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageFormatProperties2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageFormatProperties2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageFormatProperties2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageFormatProperties2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageFormatProperties2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageFormatProperties2.PNEXT); }
    /** Unsafe version of {@link #imageFormatProperties}. */
    public static VkImageFormatProperties nimageFormatProperties(long struct) { return VkImageFormatProperties.create(struct + VkImageFormatProperties2.IMAGEFORMATPROPERTIES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageFormatProperties2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageFormatProperties2.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkImageFormatProperties2} structs. */
    public static class Buffer extends StructBuffer<VkImageFormatProperties2, Buffer> implements NativeResource {

        private static final VkImageFormatProperties2 ELEMENT_FACTORY = VkImageFormatProperties2.create(-1L);

        /**
         * Creates a new {@code VkImageFormatProperties2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageFormatProperties2#SIZEOF}, and its mark will be undefined.
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
        protected VkImageFormatProperties2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageFormatProperties2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageFormatProperties2.nsType(address()); }
        /** @return the value of the {@link VkImageFormatProperties2#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkImageFormatProperties2.npNext(address()); }
        /** @return a {@link VkImageFormatProperties} view of the {@link VkImageFormatProperties2#imageFormatProperties} field. */
        public VkImageFormatProperties imageFormatProperties() { return VkImageFormatProperties2.nimageFormatProperties(address()); }

        /** Sets the specified value to the {@link VkImageFormatProperties2#sType} field. */
        public VkImageFormatProperties2.Buffer sType(@NativeType("VkStructureType") int value) { VkImageFormatProperties2.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2 STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2} value to the {@link VkImageFormatProperties2#sType} field. */
        public VkImageFormatProperties2.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2); }
        /** Sets the specified value to the {@link VkImageFormatProperties2#pNext} field. */
        public VkImageFormatProperties2.Buffer pNext(@NativeType("void *") long value) { VkImageFormatProperties2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkExternalImageFormatProperties} value to the {@code pNext} chain. */
        public VkImageFormatProperties2.Buffer pNext(VkExternalImageFormatProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExternalImageFormatPropertiesKHR} value to the {@code pNext} chain. */
        public VkImageFormatProperties2.Buffer pNext(VkExternalImageFormatPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkFilterCubicImageViewImageFormatPropertiesEXT} value to the {@code pNext} chain. */
        public VkImageFormatProperties2.Buffer pNext(VkFilterCubicImageViewImageFormatPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSamplerYcbcrConversionImageFormatProperties} value to the {@code pNext} chain. */
        public VkImageFormatProperties2.Buffer pNext(VkSamplerYcbcrConversionImageFormatProperties value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSamplerYcbcrConversionImageFormatPropertiesKHR} value to the {@code pNext} chain. */
        public VkImageFormatProperties2.Buffer pNext(VkSamplerYcbcrConversionImageFormatPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkTextureLODGatherFormatPropertiesAMD} value to the {@code pNext} chain. */
        public VkImageFormatProperties2.Buffer pNext(VkTextureLODGatherFormatPropertiesAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }

    }

}
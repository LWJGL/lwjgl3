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
 * Specify that an image must be created with a DRM format modifier from the provided list.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>Each <em>modifier</em> in {@code pDrmFormatModifiers} <b>must</b> be compatible with the parameters in {@link VkImageCreateInfo} and its {@code pNext} chain, as determined by querying {@link VkPhysicalDeviceImageFormatInfo2} extended with {@link VkPhysicalDeviceImageDrmFormatModifierInfoEXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT}</li>
 * <li>{@code pDrmFormatModifiers} <b>must</b> be a valid pointer to an array of {@code drmFormatModifierCount} {@code uint64_t} values</li>
 * <li>{@code drmFormatModifierCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageDrmFormatModifierListCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #drmFormatModifierCount};
 *     uint64_t const * {@link #pDrmFormatModifiers};
 * }</code></pre>
 */
public class VkImageDrmFormatModifierListCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DRMFORMATMODIFIERCOUNT,
        PDRMFORMATMODIFIERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DRMFORMATMODIFIERCOUNT = layout.offsetof(2);
        PDRMFORMATMODIFIERS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkImageDrmFormatModifierListCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageDrmFormatModifierListCreateInfoEXT(ByteBuffer container) {
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
    /** the length of the {@code pDrmFormatModifiers} array. */
    @NativeType("uint32_t")
    public int drmFormatModifierCount() { return ndrmFormatModifierCount(address()); }
    /** a pointer to an array of <em>Linux DRM format modifiers</em>. */
    @NativeType("uint64_t const *")
    public LongBuffer pDrmFormatModifiers() { return npDrmFormatModifiers(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageDrmFormatModifierListCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkImageDrmFormatModifierListCreateInfoEXT sType$Default() { return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageDrmFormatModifierListCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pDrmFormatModifiers} field. */
    public VkImageDrmFormatModifierListCreateInfoEXT pDrmFormatModifiers(@NativeType("uint64_t const *") LongBuffer value) { npDrmFormatModifiers(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageDrmFormatModifierListCreateInfoEXT set(
        int sType,
        long pNext,
        LongBuffer pDrmFormatModifiers
    ) {
        sType(sType);
        pNext(pNext);
        pDrmFormatModifiers(pDrmFormatModifiers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageDrmFormatModifierListCreateInfoEXT set(VkImageDrmFormatModifierListCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageDrmFormatModifierListCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageDrmFormatModifierListCreateInfoEXT malloc() {
        return wrap(VkImageDrmFormatModifierListCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageDrmFormatModifierListCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageDrmFormatModifierListCreateInfoEXT calloc() {
        return wrap(VkImageDrmFormatModifierListCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageDrmFormatModifierListCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkImageDrmFormatModifierListCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageDrmFormatModifierListCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageDrmFormatModifierListCreateInfoEXT} instance for the specified memory address. */
    public static VkImageDrmFormatModifierListCreateInfoEXT create(long address) {
        return wrap(VkImageDrmFormatModifierListCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageDrmFormatModifierListCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkImageDrmFormatModifierListCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkImageDrmFormatModifierListCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierListCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageDrmFormatModifierListCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierListCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageDrmFormatModifierListCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierListCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageDrmFormatModifierListCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierListCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageDrmFormatModifierListCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierListCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierListCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierListCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierListCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierListCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierListCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierListCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierListCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImageDrmFormatModifierListCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageDrmFormatModifierListCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkImageDrmFormatModifierListCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageDrmFormatModifierListCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageDrmFormatModifierListCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkImageDrmFormatModifierListCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageDrmFormatModifierListCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierListCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageDrmFormatModifierListCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierListCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageDrmFormatModifierListCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageDrmFormatModifierListCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #drmFormatModifierCount}. */
    public static int ndrmFormatModifierCount(long struct) { return UNSAFE.getInt(null, struct + VkImageDrmFormatModifierListCreateInfoEXT.DRMFORMATMODIFIERCOUNT); }
    /** Unsafe version of {@link #pDrmFormatModifiers() pDrmFormatModifiers}. */
    public static LongBuffer npDrmFormatModifiers(long struct) { return memLongBuffer(memGetAddress(struct + VkImageDrmFormatModifierListCreateInfoEXT.PDRMFORMATMODIFIERS), ndrmFormatModifierCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageDrmFormatModifierListCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageDrmFormatModifierListCreateInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code drmFormatModifierCount} field of the specified {@code struct}. */
    public static void ndrmFormatModifierCount(long struct, int value) { UNSAFE.putInt(null, struct + VkImageDrmFormatModifierListCreateInfoEXT.DRMFORMATMODIFIERCOUNT, value); }
    /** Unsafe version of {@link #pDrmFormatModifiers(LongBuffer) pDrmFormatModifiers}. */
    public static void npDrmFormatModifiers(long struct, LongBuffer value) { memPutAddress(struct + VkImageDrmFormatModifierListCreateInfoEXT.PDRMFORMATMODIFIERS, memAddress(value)); ndrmFormatModifierCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkImageDrmFormatModifierListCreateInfoEXT.PDRMFORMATMODIFIERS));
    }

    // -----------------------------------

    /** An array of {@link VkImageDrmFormatModifierListCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkImageDrmFormatModifierListCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkImageDrmFormatModifierListCreateInfoEXT ELEMENT_FACTORY = VkImageDrmFormatModifierListCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkImageDrmFormatModifierListCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageDrmFormatModifierListCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkImageDrmFormatModifierListCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageDrmFormatModifierListCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageDrmFormatModifierListCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkImageDrmFormatModifierListCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageDrmFormatModifierListCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkImageDrmFormatModifierListCreateInfoEXT#drmFormatModifierCount} field. */
        @NativeType("uint32_t")
        public int drmFormatModifierCount() { return VkImageDrmFormatModifierListCreateInfoEXT.ndrmFormatModifierCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkImageDrmFormatModifierListCreateInfoEXT#pDrmFormatModifiers} field. */
        @NativeType("uint64_t const *")
        public LongBuffer pDrmFormatModifiers() { return VkImageDrmFormatModifierListCreateInfoEXT.npDrmFormatModifiers(address()); }

        /** Sets the specified value to the {@link VkImageDrmFormatModifierListCreateInfoEXT#sType} field. */
        public VkImageDrmFormatModifierListCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImageDrmFormatModifierListCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT} value to the {@link VkImageDrmFormatModifierListCreateInfoEXT#sType} field. */
        public VkImageDrmFormatModifierListCreateInfoEXT.Buffer sType$Default() { return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkImageDrmFormatModifierListCreateInfoEXT#pNext} field. */
        public VkImageDrmFormatModifierListCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkImageDrmFormatModifierListCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkImageDrmFormatModifierListCreateInfoEXT#pDrmFormatModifiers} field. */
        public VkImageDrmFormatModifierListCreateInfoEXT.Buffer pDrmFormatModifiers(@NativeType("uint64_t const *") LongBuffer value) { VkImageDrmFormatModifierListCreateInfoEXT.npDrmFormatModifiers(address(), value); return this; }

    }

}
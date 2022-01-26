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
 * Properties of an image’s Linux DRM format modifier.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@code image} was created with {@link VkImageDrmFormatModifierListCreateInfoEXT}, then the returned {@code drmFormatModifier} <b>must</b> belong to the list of modifiers provided at time of image creation in {@link VkImageDrmFormatModifierListCreateInfoEXT}{@code ::pDrmFormatModifiers}. If the {@code image} was created with {@link VkImageDrmFormatModifierExplicitCreateInfoEXT}, then the returned {@code drmFormatModifier} <b>must</b> be the modifier provided at time of image creation in {@link VkImageDrmFormatModifierExplicitCreateInfoEXT}{@code ::drmFormatModifier}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTImageDrmFormatModifier#vkGetImageDrmFormatModifierPropertiesEXT GetImageDrmFormatModifierPropertiesEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageDrmFormatModifierPropertiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint64_t {@link #drmFormatModifier};
 * }</code></pre>
 */
public class VkImageDrmFormatModifierPropertiesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DRMFORMATMODIFIER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DRMFORMATMODIFIER = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkImageDrmFormatModifierPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageDrmFormatModifierPropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** returns the image’s <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#glossary-drm-format-modifier">Linux DRM format modifier</a>. */
    @NativeType("uint64_t")
    public long drmFormatModifier() { return ndrmFormatModifier(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageDrmFormatModifierPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT} value to the {@link #sType} field. */
    public VkImageDrmFormatModifierPropertiesEXT sType$Default() { return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageDrmFormatModifierPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageDrmFormatModifierPropertiesEXT set(
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
    public VkImageDrmFormatModifierPropertiesEXT set(VkImageDrmFormatModifierPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageDrmFormatModifierPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageDrmFormatModifierPropertiesEXT malloc() {
        return wrap(VkImageDrmFormatModifierPropertiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageDrmFormatModifierPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageDrmFormatModifierPropertiesEXT calloc() {
        return wrap(VkImageDrmFormatModifierPropertiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageDrmFormatModifierPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkImageDrmFormatModifierPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageDrmFormatModifierPropertiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageDrmFormatModifierPropertiesEXT} instance for the specified memory address. */
    public static VkImageDrmFormatModifierPropertiesEXT create(long address) {
        return wrap(VkImageDrmFormatModifierPropertiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageDrmFormatModifierPropertiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkImageDrmFormatModifierPropertiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkImageDrmFormatModifierPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierPropertiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageDrmFormatModifierPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierPropertiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageDrmFormatModifierPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageDrmFormatModifierPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierPropertiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageDrmFormatModifierPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierPropertiesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierPropertiesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierPropertiesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierPropertiesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierPropertiesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierPropertiesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkImageDrmFormatModifierPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkImageDrmFormatModifierPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageDrmFormatModifierPropertiesEXT malloc(MemoryStack stack) {
        return wrap(VkImageDrmFormatModifierPropertiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageDrmFormatModifierPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageDrmFormatModifierPropertiesEXT calloc(MemoryStack stack) {
        return wrap(VkImageDrmFormatModifierPropertiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageDrmFormatModifierPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageDrmFormatModifierPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageDrmFormatModifierPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageDrmFormatModifierPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageDrmFormatModifierPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #drmFormatModifier}. */
    public static long ndrmFormatModifier(long struct) { return UNSAFE.getLong(null, struct + VkImageDrmFormatModifierPropertiesEXT.DRMFORMATMODIFIER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageDrmFormatModifierPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageDrmFormatModifierPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkImageDrmFormatModifierPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkImageDrmFormatModifierPropertiesEXT, Buffer> implements NativeResource {

        private static final VkImageDrmFormatModifierPropertiesEXT ELEMENT_FACTORY = VkImageDrmFormatModifierPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkImageDrmFormatModifierPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageDrmFormatModifierPropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkImageDrmFormatModifierPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageDrmFormatModifierPropertiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageDrmFormatModifierPropertiesEXT.nsType(address()); }
        /** @return the value of the {@link VkImageDrmFormatModifierPropertiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkImageDrmFormatModifierPropertiesEXT.npNext(address()); }
        /** @return the value of the {@link VkImageDrmFormatModifierPropertiesEXT#drmFormatModifier} field. */
        @NativeType("uint64_t")
        public long drmFormatModifier() { return VkImageDrmFormatModifierPropertiesEXT.ndrmFormatModifier(address()); }

        /** Sets the specified value to the {@link VkImageDrmFormatModifierPropertiesEXT#sType} field. */
        public VkImageDrmFormatModifierPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImageDrmFormatModifierPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT} value to the {@link VkImageDrmFormatModifierPropertiesEXT#sType} field. */
        public VkImageDrmFormatModifierPropertiesEXT.Buffer sType$Default() { return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link VkImageDrmFormatModifierPropertiesEXT#pNext} field. */
        public VkImageDrmFormatModifierPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkImageDrmFormatModifierPropertiesEXT.npNext(address(), value); return this; }

    }

}
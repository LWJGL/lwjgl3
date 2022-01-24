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
 * Structure specifying the list of DRM format modifiers supported for a format.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code pDrmFormatModifierProperties} is {@code NULL}, the number of modifiers compatible with the queried {@code format} is returned in {@code drmFormatModifierCount}. Otherwise, the application <b>must</b> set {@code drmFormatModifierCount} to the length of the array {@code pDrmFormatModifierProperties}; the function will write at most {@code drmFormatModifierCount} elements to the array, and will return in {@code drmFormatModifierCount} the number of elements written.</p>
 * 
 * <p>Among the elements in array {@code pDrmFormatModifierProperties}, each returned {@code drmFormatModifier} <b>must</b> be unique.</p>
 * 
 * <p>Among the elements in array {@code pDrmFormatModifierProperties}, the bits reported in {@code drmFormatModifierTilingFeatures} <b>must</b> include the bits reported in the corresponding element of {@link VkDrmFormatModifierPropertiesListEXT}{@code ::pDrmFormatModifierProperties}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_2_EXT STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_2_EXT}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDrmFormatModifierProperties2EXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDrmFormatModifierPropertiesList2EXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #drmFormatModifierCount};
 *     {@link VkDrmFormatModifierProperties2EXT VkDrmFormatModifierProperties2EXT} * {@link #pDrmFormatModifierProperties};
 * }</code></pre>
 */
public class VkDrmFormatModifierPropertiesList2EXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DRMFORMATMODIFIERCOUNT,
        PDRMFORMATMODIFIERPROPERTIES;

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
        PDRMFORMATMODIFIERPROPERTIES = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkDrmFormatModifierPropertiesList2EXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDrmFormatModifierPropertiesList2EXT(ByteBuffer container) {
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
    /** an inout parameter related to the number of modifiers compatible with the {@code format}, as described below. */
    @NativeType("uint32_t")
    public int drmFormatModifierCount() { return ndrmFormatModifierCount(address()); }
    /** either {@code NULL} or a pointer to an array of {@link VkDrmFormatModifierProperties2EXT} structures. */
    @Nullable
    @NativeType("VkDrmFormatModifierProperties2EXT *")
    public VkDrmFormatModifierProperties2EXT.Buffer pDrmFormatModifierProperties() { return npDrmFormatModifierProperties(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDrmFormatModifierPropertiesList2EXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_2_EXT STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_2_EXT} value to the {@link #sType} field. */
    public VkDrmFormatModifierPropertiesList2EXT sType$Default() { return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_2_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDrmFormatModifierPropertiesList2EXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDrmFormatModifierPropertiesList2EXT set(
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
    public VkDrmFormatModifierPropertiesList2EXT set(VkDrmFormatModifierPropertiesList2EXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDrmFormatModifierPropertiesList2EXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDrmFormatModifierPropertiesList2EXT malloc() {
        return wrap(VkDrmFormatModifierPropertiesList2EXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDrmFormatModifierPropertiesList2EXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDrmFormatModifierPropertiesList2EXT calloc() {
        return wrap(VkDrmFormatModifierPropertiesList2EXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDrmFormatModifierPropertiesList2EXT} instance allocated with {@link BufferUtils}. */
    public static VkDrmFormatModifierPropertiesList2EXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDrmFormatModifierPropertiesList2EXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDrmFormatModifierPropertiesList2EXT} instance for the specified memory address. */
    public static VkDrmFormatModifierPropertiesList2EXT create(long address) {
        return wrap(VkDrmFormatModifierPropertiesList2EXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDrmFormatModifierPropertiesList2EXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDrmFormatModifierPropertiesList2EXT.class, address);
    }

    /**
     * Returns a new {@link VkDrmFormatModifierPropertiesList2EXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrmFormatModifierPropertiesList2EXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDrmFormatModifierPropertiesList2EXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrmFormatModifierPropertiesList2EXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrmFormatModifierPropertiesList2EXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrmFormatModifierPropertiesList2EXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDrmFormatModifierPropertiesList2EXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDrmFormatModifierPropertiesList2EXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDrmFormatModifierPropertiesList2EXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkDrmFormatModifierPropertiesList2EXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrmFormatModifierPropertiesList2EXT malloc(MemoryStack stack) {
        return wrap(VkDrmFormatModifierPropertiesList2EXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDrmFormatModifierPropertiesList2EXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrmFormatModifierPropertiesList2EXT calloc(MemoryStack stack) {
        return wrap(VkDrmFormatModifierPropertiesList2EXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDrmFormatModifierPropertiesList2EXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrmFormatModifierPropertiesList2EXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrmFormatModifierPropertiesList2EXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrmFormatModifierPropertiesList2EXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDrmFormatModifierPropertiesList2EXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDrmFormatModifierPropertiesList2EXT.PNEXT); }
    /** Unsafe version of {@link #drmFormatModifierCount}. */
    public static int ndrmFormatModifierCount(long struct) { return UNSAFE.getInt(null, struct + VkDrmFormatModifierPropertiesList2EXT.DRMFORMATMODIFIERCOUNT); }
    /** Unsafe version of {@link #pDrmFormatModifierProperties}. */
    @Nullable public static VkDrmFormatModifierProperties2EXT.Buffer npDrmFormatModifierProperties(long struct) { return VkDrmFormatModifierProperties2EXT.createSafe(memGetAddress(struct + VkDrmFormatModifierPropertiesList2EXT.PDRMFORMATMODIFIERPROPERTIES), ndrmFormatModifierCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDrmFormatModifierPropertiesList2EXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDrmFormatModifierPropertiesList2EXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkDrmFormatModifierPropertiesList2EXT} structs. */
    public static class Buffer extends StructBuffer<VkDrmFormatModifierPropertiesList2EXT, Buffer> implements NativeResource {

        private static final VkDrmFormatModifierPropertiesList2EXT ELEMENT_FACTORY = VkDrmFormatModifierPropertiesList2EXT.create(-1L);

        /**
         * Creates a new {@code VkDrmFormatModifierPropertiesList2EXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDrmFormatModifierPropertiesList2EXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDrmFormatModifierPropertiesList2EXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDrmFormatModifierPropertiesList2EXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDrmFormatModifierPropertiesList2EXT.nsType(address()); }
        /** @return the value of the {@link VkDrmFormatModifierPropertiesList2EXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDrmFormatModifierPropertiesList2EXT.npNext(address()); }
        /** @return the value of the {@link VkDrmFormatModifierPropertiesList2EXT#drmFormatModifierCount} field. */
        @NativeType("uint32_t")
        public int drmFormatModifierCount() { return VkDrmFormatModifierPropertiesList2EXT.ndrmFormatModifierCount(address()); }
        /** @return a {@link VkDrmFormatModifierProperties2EXT.Buffer} view of the struct array pointed to by the {@link VkDrmFormatModifierPropertiesList2EXT#pDrmFormatModifierProperties} field. */
        @Nullable
        @NativeType("VkDrmFormatModifierProperties2EXT *")
        public VkDrmFormatModifierProperties2EXT.Buffer pDrmFormatModifierProperties() { return VkDrmFormatModifierPropertiesList2EXT.npDrmFormatModifierProperties(address()); }

        /** Sets the specified value to the {@link VkDrmFormatModifierPropertiesList2EXT#sType} field. */
        public VkDrmFormatModifierPropertiesList2EXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDrmFormatModifierPropertiesList2EXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_2_EXT STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_2_EXT} value to the {@link VkDrmFormatModifierPropertiesList2EXT#sType} field. */
        public VkDrmFormatModifierPropertiesList2EXT.Buffer sType$Default() { return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_2_EXT); }
        /** Sets the specified value to the {@link VkDrmFormatModifierPropertiesList2EXT#pNext} field. */
        public VkDrmFormatModifierPropertiesList2EXT.Buffer pNext(@NativeType("void *") long value) { VkDrmFormatModifierPropertiesList2EXT.npNext(address(), value); return this; }

    }

}
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
 * <p>If {@code pDrmFormatModifierProperties} is {@code NULL}, then the function returns in {@code drmFormatModifierCount} the number of modifiers compatible with the queried {@code format}. Otherwise, the application <b>must</b> set {@code drmFormatModifierCount} to the length of the array {@code pDrmFormatModifierProperties}; the function will write at most {@code drmFormatModifierCount} elements to the array, and will return in {@code drmFormatModifierCount} the number of elements written.</p>
 * 
 * <p>Among the elements in array {@code pDrmFormatModifierProperties}, each returned {@code drmFormatModifier} <b>must</b> be unique.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDrmFormatModifierPropertiesEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDrmFormatModifierPropertiesListEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #drmFormatModifierCount};
 *     {@link VkDrmFormatModifierPropertiesEXT VkDrmFormatModifierPropertiesEXT} * {@link #pDrmFormatModifierProperties};
 * }</code></pre>
 */
public class VkDrmFormatModifierPropertiesListEXT extends Struct implements NativeResource {

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
     * Creates a {@code VkDrmFormatModifierPropertiesListEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDrmFormatModifierPropertiesListEXT(ByteBuffer container) {
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
    /** either {@code NULL} or a pointer to an array of {@link VkDrmFormatModifierPropertiesEXT} structures. */
    @Nullable
    @NativeType("VkDrmFormatModifierPropertiesEXT *")
    public VkDrmFormatModifierPropertiesEXT.Buffer pDrmFormatModifierProperties() { return npDrmFormatModifierProperties(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDrmFormatModifierPropertiesListEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT} value to the {@link #sType} field. */
    public VkDrmFormatModifierPropertiesListEXT sType$Default() { return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDrmFormatModifierPropertiesListEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDrmFormatModifierPropertiesListEXT set(
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
    public VkDrmFormatModifierPropertiesListEXT set(VkDrmFormatModifierPropertiesListEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDrmFormatModifierPropertiesListEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDrmFormatModifierPropertiesListEXT malloc() {
        return wrap(VkDrmFormatModifierPropertiesListEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDrmFormatModifierPropertiesListEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDrmFormatModifierPropertiesListEXT calloc() {
        return wrap(VkDrmFormatModifierPropertiesListEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDrmFormatModifierPropertiesListEXT} instance allocated with {@link BufferUtils}. */
    public static VkDrmFormatModifierPropertiesListEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDrmFormatModifierPropertiesListEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDrmFormatModifierPropertiesListEXT} instance for the specified memory address. */
    public static VkDrmFormatModifierPropertiesListEXT create(long address) {
        return wrap(VkDrmFormatModifierPropertiesListEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDrmFormatModifierPropertiesListEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDrmFormatModifierPropertiesListEXT.class, address);
    }

    /**
     * Returns a new {@link VkDrmFormatModifierPropertiesListEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrmFormatModifierPropertiesListEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDrmFormatModifierPropertiesListEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrmFormatModifierPropertiesListEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrmFormatModifierPropertiesListEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrmFormatModifierPropertiesListEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDrmFormatModifierPropertiesListEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDrmFormatModifierPropertiesListEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDrmFormatModifierPropertiesListEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDrmFormatModifierPropertiesListEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDrmFormatModifierPropertiesListEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDrmFormatModifierPropertiesListEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDrmFormatModifierPropertiesListEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDrmFormatModifierPropertiesListEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDrmFormatModifierPropertiesListEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDrmFormatModifierPropertiesListEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDrmFormatModifierPropertiesListEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDrmFormatModifierPropertiesListEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrmFormatModifierPropertiesListEXT malloc(MemoryStack stack) {
        return wrap(VkDrmFormatModifierPropertiesListEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDrmFormatModifierPropertiesListEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrmFormatModifierPropertiesListEXT calloc(MemoryStack stack) {
        return wrap(VkDrmFormatModifierPropertiesListEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDrmFormatModifierPropertiesListEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrmFormatModifierPropertiesListEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrmFormatModifierPropertiesListEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrmFormatModifierPropertiesListEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDrmFormatModifierPropertiesListEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDrmFormatModifierPropertiesListEXT.PNEXT); }
    /** Unsafe version of {@link #drmFormatModifierCount}. */
    public static int ndrmFormatModifierCount(long struct) { return UNSAFE.getInt(null, struct + VkDrmFormatModifierPropertiesListEXT.DRMFORMATMODIFIERCOUNT); }
    /** Unsafe version of {@link #pDrmFormatModifierProperties}. */
    @Nullable public static VkDrmFormatModifierPropertiesEXT.Buffer npDrmFormatModifierProperties(long struct) { return VkDrmFormatModifierPropertiesEXT.createSafe(memGetAddress(struct + VkDrmFormatModifierPropertiesListEXT.PDRMFORMATMODIFIERPROPERTIES), ndrmFormatModifierCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDrmFormatModifierPropertiesListEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDrmFormatModifierPropertiesListEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkDrmFormatModifierPropertiesListEXT} structs. */
    public static class Buffer extends StructBuffer<VkDrmFormatModifierPropertiesListEXT, Buffer> implements NativeResource {

        private static final VkDrmFormatModifierPropertiesListEXT ELEMENT_FACTORY = VkDrmFormatModifierPropertiesListEXT.create(-1L);

        /**
         * Creates a new {@code VkDrmFormatModifierPropertiesListEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDrmFormatModifierPropertiesListEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDrmFormatModifierPropertiesListEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDrmFormatModifierPropertiesListEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDrmFormatModifierPropertiesListEXT.nsType(address()); }
        /** @return the value of the {@link VkDrmFormatModifierPropertiesListEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDrmFormatModifierPropertiesListEXT.npNext(address()); }
        /** @return the value of the {@link VkDrmFormatModifierPropertiesListEXT#drmFormatModifierCount} field. */
        @NativeType("uint32_t")
        public int drmFormatModifierCount() { return VkDrmFormatModifierPropertiesListEXT.ndrmFormatModifierCount(address()); }
        /** @return a {@link VkDrmFormatModifierPropertiesEXT.Buffer} view of the struct array pointed to by the {@link VkDrmFormatModifierPropertiesListEXT#pDrmFormatModifierProperties} field. */
        @Nullable
        @NativeType("VkDrmFormatModifierPropertiesEXT *")
        public VkDrmFormatModifierPropertiesEXT.Buffer pDrmFormatModifierProperties() { return VkDrmFormatModifierPropertiesListEXT.npDrmFormatModifierProperties(address()); }

        /** Sets the specified value to the {@link VkDrmFormatModifierPropertiesListEXT#sType} field. */
        public VkDrmFormatModifierPropertiesListEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDrmFormatModifierPropertiesListEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT} value to the {@link VkDrmFormatModifierPropertiesListEXT#sType} field. */
        public VkDrmFormatModifierPropertiesListEXT.Buffer sType$Default() { return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT); }
        /** Sets the specified value to the {@link VkDrmFormatModifierPropertiesListEXT#pNext} field. */
        public VkDrmFormatModifierPropertiesListEXT.Buffer pNext(@NativeType("void *") long value) { VkDrmFormatModifierPropertiesListEXT.npNext(address(), value); return this; }

    }

}
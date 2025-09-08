/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct VkDrmFormatModifierPropertiesListEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t drmFormatModifierCount;
 *     {@link VkDrmFormatModifierPropertiesEXT VkDrmFormatModifierPropertiesEXT} * pDrmFormatModifierProperties;
 * }</code></pre>
 */
public class VkDrmFormatModifierPropertiesListEXT extends Struct<VkDrmFormatModifierPropertiesListEXT> implements NativeResource {

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

    protected VkDrmFormatModifierPropertiesListEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDrmFormatModifierPropertiesListEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDrmFormatModifierPropertiesListEXT(address, container);
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code drmFormatModifierCount} field. */
    @NativeType("uint32_t")
    public int drmFormatModifierCount() { return ndrmFormatModifierCount(address()); }
    /** @return a {@link VkDrmFormatModifierPropertiesEXT.Buffer} view of the struct array pointed to by the {@code pDrmFormatModifierProperties} field. */
    @NativeType("VkDrmFormatModifierPropertiesEXT *")
    public VkDrmFormatModifierPropertiesEXT.@Nullable Buffer pDrmFormatModifierProperties() { return npDrmFormatModifierProperties(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDrmFormatModifierPropertiesListEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT} value to the {@code sType} field. */
    public VkDrmFormatModifierPropertiesListEXT sType$Default() { return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
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
        return new VkDrmFormatModifierPropertiesListEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDrmFormatModifierPropertiesListEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDrmFormatModifierPropertiesListEXT calloc() {
        return new VkDrmFormatModifierPropertiesListEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDrmFormatModifierPropertiesListEXT} instance allocated with {@link BufferUtils}. */
    public static VkDrmFormatModifierPropertiesListEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDrmFormatModifierPropertiesListEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDrmFormatModifierPropertiesListEXT} instance for the specified memory address. */
    public static VkDrmFormatModifierPropertiesListEXT create(long address) {
        return new VkDrmFormatModifierPropertiesListEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDrmFormatModifierPropertiesListEXT createSafe(long address) {
        return address == NULL ? null : new VkDrmFormatModifierPropertiesListEXT(address, null);
    }

    /**
     * Returns a new {@link VkDrmFormatModifierPropertiesListEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrmFormatModifierPropertiesListEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDrmFormatModifierPropertiesListEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrmFormatModifierPropertiesListEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrmFormatModifierPropertiesListEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrmFormatModifierPropertiesListEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDrmFormatModifierPropertiesListEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDrmFormatModifierPropertiesListEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDrmFormatModifierPropertiesListEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
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
        return new VkDrmFormatModifierPropertiesListEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDrmFormatModifierPropertiesListEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrmFormatModifierPropertiesListEXT calloc(MemoryStack stack) {
        return new VkDrmFormatModifierPropertiesListEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDrmFormatModifierPropertiesListEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrmFormatModifierPropertiesListEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrmFormatModifierPropertiesListEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrmFormatModifierPropertiesListEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDrmFormatModifierPropertiesListEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDrmFormatModifierPropertiesListEXT.PNEXT); }
    /** Unsafe version of {@link #drmFormatModifierCount}. */
    public static int ndrmFormatModifierCount(long struct) { return memGetInt(struct + VkDrmFormatModifierPropertiesListEXT.DRMFORMATMODIFIERCOUNT); }
    /** Unsafe version of {@link #pDrmFormatModifierProperties}. */
    public static VkDrmFormatModifierPropertiesEXT.@Nullable Buffer npDrmFormatModifierProperties(long struct) { return VkDrmFormatModifierPropertiesEXT.createSafe(memGetAddress(struct + VkDrmFormatModifierPropertiesListEXT.PDRMFORMATMODIFIERPROPERTIES), ndrmFormatModifierCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDrmFormatModifierPropertiesListEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDrmFormatModifierPropertiesListEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkDrmFormatModifierPropertiesListEXT} structs. */
    public static class Buffer extends StructBuffer<VkDrmFormatModifierPropertiesListEXT, Buffer> implements NativeResource {

        private static final VkDrmFormatModifierPropertiesListEXT ELEMENT_FACTORY = VkDrmFormatModifierPropertiesListEXT.create(-1L);

        /**
         * Creates a new {@code VkDrmFormatModifierPropertiesListEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDrmFormatModifierPropertiesListEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkDrmFormatModifierPropertiesListEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDrmFormatModifierPropertiesListEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDrmFormatModifierPropertiesListEXT.npNext(address()); }
        /** @return the value of the {@code drmFormatModifierCount} field. */
        @NativeType("uint32_t")
        public int drmFormatModifierCount() { return VkDrmFormatModifierPropertiesListEXT.ndrmFormatModifierCount(address()); }
        /** @return a {@link VkDrmFormatModifierPropertiesEXT.Buffer} view of the struct array pointed to by the {@code pDrmFormatModifierProperties} field. */
        @NativeType("VkDrmFormatModifierPropertiesEXT *")
        public VkDrmFormatModifierPropertiesEXT.@Nullable Buffer pDrmFormatModifierProperties() { return VkDrmFormatModifierPropertiesListEXT.npDrmFormatModifierProperties(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDrmFormatModifierPropertiesListEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDrmFormatModifierPropertiesListEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTImageDrmFormatModifier#VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT} value to the {@code sType} field. */
        public VkDrmFormatModifierPropertiesListEXT.Buffer sType$Default() { return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDrmFormatModifierPropertiesListEXT.Buffer pNext(@NativeType("void *") long value) { VkDrmFormatModifierPropertiesListEXT.npNext(address(), value); return this; }

    }

}
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
 * <pre>{@code
 * struct VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t advancedBlendMaxColorAttachments;
 *     VkBool32 advancedBlendIndependentBlend;
 *     VkBool32 advancedBlendNonPremultipliedSrcColor;
 *     VkBool32 advancedBlendNonPremultipliedDstColor;
 *     VkBool32 advancedBlendCorrelatedOverlap;
 *     VkBool32 advancedBlendAllOperations;
 * }}</pre>
 */
public class VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT extends Struct<VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ADVANCEDBLENDMAXCOLORATTACHMENTS,
        ADVANCEDBLENDINDEPENDENTBLEND,
        ADVANCEDBLENDNONPREMULTIPLIEDSRCCOLOR,
        ADVANCEDBLENDNONPREMULTIPLIEDDSTCOLOR,
        ADVANCEDBLENDCORRELATEDOVERLAP,
        ADVANCEDBLENDALLOPERATIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
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
        ADVANCEDBLENDMAXCOLORATTACHMENTS = layout.offsetof(2);
        ADVANCEDBLENDINDEPENDENTBLEND = layout.offsetof(3);
        ADVANCEDBLENDNONPREMULTIPLIEDSRCCOLOR = layout.offsetof(4);
        ADVANCEDBLENDNONPREMULTIPLIEDDSTCOLOR = layout.offsetof(5);
        ADVANCEDBLENDCORRELATEDOVERLAP = layout.offsetof(6);
        ADVANCEDBLENDALLOPERATIONS = layout.offsetof(7);
    }

    protected VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code advancedBlendMaxColorAttachments} field. */
    @NativeType("uint32_t")
    public int advancedBlendMaxColorAttachments() { return nadvancedBlendMaxColorAttachments(address()); }
    /** @return the value of the {@code advancedBlendIndependentBlend} field. */
    @NativeType("VkBool32")
    public boolean advancedBlendIndependentBlend() { return nadvancedBlendIndependentBlend(address()) != 0; }
    /** @return the value of the {@code advancedBlendNonPremultipliedSrcColor} field. */
    @NativeType("VkBool32")
    public boolean advancedBlendNonPremultipliedSrcColor() { return nadvancedBlendNonPremultipliedSrcColor(address()) != 0; }
    /** @return the value of the {@code advancedBlendNonPremultipliedDstColor} field. */
    @NativeType("VkBool32")
    public boolean advancedBlendNonPremultipliedDstColor() { return nadvancedBlendNonPremultipliedDstColor(address()) != 0; }
    /** @return the value of the {@code advancedBlendCorrelatedOverlap} field. */
    @NativeType("VkBool32")
    public boolean advancedBlendCorrelatedOverlap() { return nadvancedBlendCorrelatedOverlap(address()) != 0; }
    /** @return the value of the {@code advancedBlendAllOperations} field. */
    @NativeType("VkBool32")
    public boolean advancedBlendAllOperations() { return nadvancedBlendAllOperations(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTBlendOperationAdvanced#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT sType$Default() { return sType(EXTBlendOperationAdvanced.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT set(
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
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT set(VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT malloc() {
        return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT calloc() {
        return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT create(long address) {
        return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #advancedBlendMaxColorAttachments}. */
    public static int nadvancedBlendMaxColorAttachments(long struct) { return memGetInt(struct + VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.ADVANCEDBLENDMAXCOLORATTACHMENTS); }
    /** Unsafe version of {@link #advancedBlendIndependentBlend}. */
    public static int nadvancedBlendIndependentBlend(long struct) { return memGetInt(struct + VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.ADVANCEDBLENDINDEPENDENTBLEND); }
    /** Unsafe version of {@link #advancedBlendNonPremultipliedSrcColor}. */
    public static int nadvancedBlendNonPremultipliedSrcColor(long struct) { return memGetInt(struct + VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.ADVANCEDBLENDNONPREMULTIPLIEDSRCCOLOR); }
    /** Unsafe version of {@link #advancedBlendNonPremultipliedDstColor}. */
    public static int nadvancedBlendNonPremultipliedDstColor(long struct) { return memGetInt(struct + VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.ADVANCEDBLENDNONPREMULTIPLIEDDSTCOLOR); }
    /** Unsafe version of {@link #advancedBlendCorrelatedOverlap}. */
    public static int nadvancedBlendCorrelatedOverlap(long struct) { return memGetInt(struct + VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.ADVANCEDBLENDCORRELATEDOVERLAP); }
    /** Unsafe version of {@link #advancedBlendAllOperations}. */
    public static int nadvancedBlendAllOperations(long struct) { return memGetInt(struct + VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.ADVANCEDBLENDALLOPERATIONS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.npNext(address()); }
        /** @return the value of the {@code advancedBlendMaxColorAttachments} field. */
        @NativeType("uint32_t")
        public int advancedBlendMaxColorAttachments() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nadvancedBlendMaxColorAttachments(address()); }
        /** @return the value of the {@code advancedBlendIndependentBlend} field. */
        @NativeType("VkBool32")
        public boolean advancedBlendIndependentBlend() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nadvancedBlendIndependentBlend(address()) != 0; }
        /** @return the value of the {@code advancedBlendNonPremultipliedSrcColor} field. */
        @NativeType("VkBool32")
        public boolean advancedBlendNonPremultipliedSrcColor() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nadvancedBlendNonPremultipliedSrcColor(address()) != 0; }
        /** @return the value of the {@code advancedBlendNonPremultipliedDstColor} field. */
        @NativeType("VkBool32")
        public boolean advancedBlendNonPremultipliedDstColor() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nadvancedBlendNonPremultipliedDstColor(address()) != 0; }
        /** @return the value of the {@code advancedBlendCorrelatedOverlap} field. */
        @NativeType("VkBool32")
        public boolean advancedBlendCorrelatedOverlap() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nadvancedBlendCorrelatedOverlap(address()) != 0; }
        /** @return the value of the {@code advancedBlendAllOperations} field. */
        @NativeType("VkBool32")
        public boolean advancedBlendAllOperations() { return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nadvancedBlendAllOperations(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTBlendOperationAdvanced#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer sType$Default() { return sType(EXTBlendOperationAdvanced.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.npNext(address(), value); return this; }

    }

}
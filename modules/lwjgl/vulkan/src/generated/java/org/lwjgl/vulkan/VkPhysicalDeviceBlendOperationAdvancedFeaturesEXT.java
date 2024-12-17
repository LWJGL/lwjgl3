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
 * struct VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 advancedBlendCoherentOperations;
 * }}</pre>
 */
public class VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT extends Struct<VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ADVANCEDBLENDCOHERENTOPERATIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ADVANCEDBLENDCOHERENTOPERATIONS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code advancedBlendCoherentOperations} field. */
    @NativeType("VkBool32")
    public boolean advancedBlendCoherentOperations() { return nadvancedBlendCoherentOperations(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTBlendOperationAdvanced#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT sType$Default() { return sType(EXTBlendOperationAdvanced.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code advancedBlendCoherentOperations} field. */
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT advancedBlendCoherentOperations(@NativeType("VkBool32") boolean value) { nadvancedBlendCoherentOperations(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT set(
        int sType,
        long pNext,
        boolean advancedBlendCoherentOperations
    ) {
        sType(sType);
        pNext(pNext);
        advancedBlendCoherentOperations(advancedBlendCoherentOperations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT set(VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT malloc() {
        return new VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT calloc() {
        return new VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT create(long address) {
        return new VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #advancedBlendCoherentOperations}. */
    public static int nadvancedBlendCoherentOperations(long struct) { return memGetInt(struct + VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.ADVANCEDBLENDCOHERENTOPERATIONS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #advancedBlendCoherentOperations(boolean) advancedBlendCoherentOperations}. */
    public static void nadvancedBlendCoherentOperations(long struct, int value) { memPutInt(struct + VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.ADVANCEDBLENDCOHERENTOPERATIONS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code advancedBlendCoherentOperations} field. */
        @NativeType("VkBool32")
        public boolean advancedBlendCoherentOperations() { return VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.nadvancedBlendCoherentOperations(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTBlendOperationAdvanced#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer sType$Default() { return sType(EXTBlendOperationAdvanced.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code advancedBlendCoherentOperations} field. */
        public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.Buffer advancedBlendCoherentOperations(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.nadvancedBlendCoherentOperations(address(), value ? 1 : 0); return this; }

    }

}
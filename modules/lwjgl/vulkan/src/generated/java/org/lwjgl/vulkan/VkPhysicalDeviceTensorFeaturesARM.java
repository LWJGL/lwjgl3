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
 * struct VkPhysicalDeviceTensorFeaturesARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 tensorNonPacked;
 *     VkBool32 shaderTensorAccess;
 *     VkBool32 shaderStorageTensorArrayDynamicIndexing;
 *     VkBool32 shaderStorageTensorArrayNonUniformIndexing;
 *     VkBool32 descriptorBindingStorageTensorUpdateAfterBind;
 *     VkBool32 tensors;
 * }}</pre>
 */
public class VkPhysicalDeviceTensorFeaturesARM extends Struct<VkPhysicalDeviceTensorFeaturesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TENSORNONPACKED,
        SHADERTENSORACCESS,
        SHADERSTORAGETENSORARRAYDYNAMICINDEXING,
        SHADERSTORAGETENSORARRAYNONUNIFORMINDEXING,
        DESCRIPTORBINDINGSTORAGETENSORUPDATEAFTERBIND,
        TENSORS;

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
        TENSORNONPACKED = layout.offsetof(2);
        SHADERTENSORACCESS = layout.offsetof(3);
        SHADERSTORAGETENSORARRAYDYNAMICINDEXING = layout.offsetof(4);
        SHADERSTORAGETENSORARRAYNONUNIFORMINDEXING = layout.offsetof(5);
        DESCRIPTORBINDINGSTORAGETENSORUPDATEAFTERBIND = layout.offsetof(6);
        TENSORS = layout.offsetof(7);
    }

    protected VkPhysicalDeviceTensorFeaturesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceTensorFeaturesARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceTensorFeaturesARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceTensorFeaturesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceTensorFeaturesARM(ByteBuffer container) {
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
    /** @return the value of the {@code tensorNonPacked} field. */
    @NativeType("VkBool32")
    public boolean tensorNonPacked() { return ntensorNonPacked(address()) != 0; }
    /** @return the value of the {@code shaderTensorAccess} field. */
    @NativeType("VkBool32")
    public boolean shaderTensorAccess() { return nshaderTensorAccess(address()) != 0; }
    /** @return the value of the {@code shaderStorageTensorArrayDynamicIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageTensorArrayDynamicIndexing() { return nshaderStorageTensorArrayDynamicIndexing(address()) != 0; }
    /** @return the value of the {@code shaderStorageTensorArrayNonUniformIndexing} field. */
    @NativeType("VkBool32")
    public boolean shaderStorageTensorArrayNonUniformIndexing() { return nshaderStorageTensorArrayNonUniformIndexing(address()) != 0; }
    /** @return the value of the {@code descriptorBindingStorageTensorUpdateAfterBind} field. */
    @NativeType("VkBool32")
    public boolean descriptorBindingStorageTensorUpdateAfterBind() { return ndescriptorBindingStorageTensorUpdateAfterBind(address()) != 0; }
    /** @return the value of the {@code tensors} field. */
    @NativeType("VkBool32")
    public boolean tensors() { return ntensors(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceTensorFeaturesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_FEATURES_ARM} value to the {@code sType} field. */
    public VkPhysicalDeviceTensorFeaturesARM sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_FEATURES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceTensorFeaturesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code tensorNonPacked} field. */
    public VkPhysicalDeviceTensorFeaturesARM tensorNonPacked(@NativeType("VkBool32") boolean value) { ntensorNonPacked(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderTensorAccess} field. */
    public VkPhysicalDeviceTensorFeaturesARM shaderTensorAccess(@NativeType("VkBool32") boolean value) { nshaderTensorAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageTensorArrayDynamicIndexing} field. */
    public VkPhysicalDeviceTensorFeaturesARM shaderStorageTensorArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageTensorArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderStorageTensorArrayNonUniformIndexing} field. */
    public VkPhysicalDeviceTensorFeaturesARM shaderStorageTensorArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { nshaderStorageTensorArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingStorageTensorUpdateAfterBind} field. */
    public VkPhysicalDeviceTensorFeaturesARM descriptorBindingStorageTensorUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingStorageTensorUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code tensors} field. */
    public VkPhysicalDeviceTensorFeaturesARM tensors(@NativeType("VkBool32") boolean value) { ntensors(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceTensorFeaturesARM set(
        int sType,
        long pNext,
        boolean tensorNonPacked,
        boolean shaderTensorAccess,
        boolean shaderStorageTensorArrayDynamicIndexing,
        boolean shaderStorageTensorArrayNonUniformIndexing,
        boolean descriptorBindingStorageTensorUpdateAfterBind,
        boolean tensors
    ) {
        sType(sType);
        pNext(pNext);
        tensorNonPacked(tensorNonPacked);
        shaderTensorAccess(shaderTensorAccess);
        shaderStorageTensorArrayDynamicIndexing(shaderStorageTensorArrayDynamicIndexing);
        shaderStorageTensorArrayNonUniformIndexing(shaderStorageTensorArrayNonUniformIndexing);
        descriptorBindingStorageTensorUpdateAfterBind(descriptorBindingStorageTensorUpdateAfterBind);
        tensors(tensors);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceTensorFeaturesARM set(VkPhysicalDeviceTensorFeaturesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceTensorFeaturesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTensorFeaturesARM malloc() {
        return new VkPhysicalDeviceTensorFeaturesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceTensorFeaturesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTensorFeaturesARM calloc() {
        return new VkPhysicalDeviceTensorFeaturesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceTensorFeaturesARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceTensorFeaturesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTensorFeaturesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceTensorFeaturesARM} instance for the specified memory address. */
    public static VkPhysicalDeviceTensorFeaturesARM create(long address) {
        return new VkPhysicalDeviceTensorFeaturesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceTensorFeaturesARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceTensorFeaturesARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTensorFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTensorFeaturesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTensorFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTensorFeaturesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTensorFeaturesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTensorFeaturesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceTensorFeaturesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTensorFeaturesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceTensorFeaturesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTensorFeaturesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTensorFeaturesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTensorFeaturesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTensorFeaturesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTensorFeaturesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTensorFeaturesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTensorFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTensorFeaturesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTensorFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTensorFeaturesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceTensorFeaturesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceTensorFeaturesARM.PNEXT); }
    /** Unsafe version of {@link #tensorNonPacked}. */
    public static int ntensorNonPacked(long struct) { return memGetInt(struct + VkPhysicalDeviceTensorFeaturesARM.TENSORNONPACKED); }
    /** Unsafe version of {@link #shaderTensorAccess}. */
    public static int nshaderTensorAccess(long struct) { return memGetInt(struct + VkPhysicalDeviceTensorFeaturesARM.SHADERTENSORACCESS); }
    /** Unsafe version of {@link #shaderStorageTensorArrayDynamicIndexing}. */
    public static int nshaderStorageTensorArrayDynamicIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceTensorFeaturesARM.SHADERSTORAGETENSORARRAYDYNAMICINDEXING); }
    /** Unsafe version of {@link #shaderStorageTensorArrayNonUniformIndexing}. */
    public static int nshaderStorageTensorArrayNonUniformIndexing(long struct) { return memGetInt(struct + VkPhysicalDeviceTensorFeaturesARM.SHADERSTORAGETENSORARRAYNONUNIFORMINDEXING); }
    /** Unsafe version of {@link #descriptorBindingStorageTensorUpdateAfterBind}. */
    public static int ndescriptorBindingStorageTensorUpdateAfterBind(long struct) { return memGetInt(struct + VkPhysicalDeviceTensorFeaturesARM.DESCRIPTORBINDINGSTORAGETENSORUPDATEAFTERBIND); }
    /** Unsafe version of {@link #tensors}. */
    public static int ntensors(long struct) { return memGetInt(struct + VkPhysicalDeviceTensorFeaturesARM.TENSORS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTensorFeaturesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceTensorFeaturesARM.PNEXT, value); }
    /** Unsafe version of {@link #tensorNonPacked(boolean) tensorNonPacked}. */
    public static void ntensorNonPacked(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTensorFeaturesARM.TENSORNONPACKED, value); }
    /** Unsafe version of {@link #shaderTensorAccess(boolean) shaderTensorAccess}. */
    public static void nshaderTensorAccess(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTensorFeaturesARM.SHADERTENSORACCESS, value); }
    /** Unsafe version of {@link #shaderStorageTensorArrayDynamicIndexing(boolean) shaderStorageTensorArrayDynamicIndexing}. */
    public static void nshaderStorageTensorArrayDynamicIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTensorFeaturesARM.SHADERSTORAGETENSORARRAYDYNAMICINDEXING, value); }
    /** Unsafe version of {@link #shaderStorageTensorArrayNonUniformIndexing(boolean) shaderStorageTensorArrayNonUniformIndexing}. */
    public static void nshaderStorageTensorArrayNonUniformIndexing(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTensorFeaturesARM.SHADERSTORAGETENSORARRAYNONUNIFORMINDEXING, value); }
    /** Unsafe version of {@link #descriptorBindingStorageTensorUpdateAfterBind(boolean) descriptorBindingStorageTensorUpdateAfterBind}. */
    public static void ndescriptorBindingStorageTensorUpdateAfterBind(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTensorFeaturesARM.DESCRIPTORBINDINGSTORAGETENSORUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #tensors(boolean) tensors}. */
    public static void ntensors(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTensorFeaturesARM.TENSORS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceTensorFeaturesARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTensorFeaturesARM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceTensorFeaturesARM ELEMENT_FACTORY = VkPhysicalDeviceTensorFeaturesARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceTensorFeaturesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceTensorFeaturesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceTensorFeaturesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceTensorFeaturesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceTensorFeaturesARM.npNext(address()); }
        /** @return the value of the {@code tensorNonPacked} field. */
        @NativeType("VkBool32")
        public boolean tensorNonPacked() { return VkPhysicalDeviceTensorFeaturesARM.ntensorNonPacked(address()) != 0; }
        /** @return the value of the {@code shaderTensorAccess} field. */
        @NativeType("VkBool32")
        public boolean shaderTensorAccess() { return VkPhysicalDeviceTensorFeaturesARM.nshaderTensorAccess(address()) != 0; }
        /** @return the value of the {@code shaderStorageTensorArrayDynamicIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageTensorArrayDynamicIndexing() { return VkPhysicalDeviceTensorFeaturesARM.nshaderStorageTensorArrayDynamicIndexing(address()) != 0; }
        /** @return the value of the {@code shaderStorageTensorArrayNonUniformIndexing} field. */
        @NativeType("VkBool32")
        public boolean shaderStorageTensorArrayNonUniformIndexing() { return VkPhysicalDeviceTensorFeaturesARM.nshaderStorageTensorArrayNonUniformIndexing(address()) != 0; }
        /** @return the value of the {@code descriptorBindingStorageTensorUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingStorageTensorUpdateAfterBind() { return VkPhysicalDeviceTensorFeaturesARM.ndescriptorBindingStorageTensorUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@code tensors} field. */
        @NativeType("VkBool32")
        public boolean tensors() { return VkPhysicalDeviceTensorFeaturesARM.ntensors(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceTensorFeaturesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceTensorFeaturesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_FEATURES_ARM} value to the {@code sType} field. */
        public VkPhysicalDeviceTensorFeaturesARM.Buffer sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_FEATURES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceTensorFeaturesARM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceTensorFeaturesARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code tensorNonPacked} field. */
        public VkPhysicalDeviceTensorFeaturesARM.Buffer tensorNonPacked(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTensorFeaturesARM.ntensorNonPacked(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderTensorAccess} field. */
        public VkPhysicalDeviceTensorFeaturesARM.Buffer shaderTensorAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTensorFeaturesARM.nshaderTensorAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageTensorArrayDynamicIndexing} field. */
        public VkPhysicalDeviceTensorFeaturesARM.Buffer shaderStorageTensorArrayDynamicIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTensorFeaturesARM.nshaderStorageTensorArrayDynamicIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderStorageTensorArrayNonUniformIndexing} field. */
        public VkPhysicalDeviceTensorFeaturesARM.Buffer shaderStorageTensorArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTensorFeaturesARM.nshaderStorageTensorArrayNonUniformIndexing(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingStorageTensorUpdateAfterBind} field. */
        public VkPhysicalDeviceTensorFeaturesARM.Buffer descriptorBindingStorageTensorUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTensorFeaturesARM.ndescriptorBindingStorageTensorUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code tensors} field. */
        public VkPhysicalDeviceTensorFeaturesARM.Buffer tensors(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTensorFeaturesARM.ntensors(address(), value ? 1 : 0); return this; }

    }

}
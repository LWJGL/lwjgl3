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
 * Stub description of VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VALVEDescriptorSetHostMapping#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 descriptorSetHostMapping;
 * }</code></pre>
 */
public class VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE extends Struct<VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DESCRIPTORSETHOSTMAPPING;

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
        DESCRIPTORSETHOSTMAPPING = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(ByteBuffer container) {
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
    /** @return the value of the {@code descriptorSetHostMapping} field. */
    @NativeType("VkBool32")
    public boolean descriptorSetHostMapping() { return ndescriptorSetHostMapping(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VALVEDescriptorSetHostMapping#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE} value to the {@code sType} field. */
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE sType$Default() { return sType(VALVEDescriptorSetHostMapping.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code descriptorSetHostMapping} field. */
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE descriptorSetHostMapping(@NativeType("VkBool32") boolean value) { ndescriptorSetHostMapping(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE set(
        int sType,
        long pNext,
        boolean descriptorSetHostMapping
    ) {
        sType(sType);
        pNext(pNext);
        descriptorSetHostMapping(descriptorSetHostMapping);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE set(VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE malloc() {
        return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE calloc() {
        return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE} instance for the specified memory address. */
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE create(long address) {
        return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.PNEXT); }
    /** Unsafe version of {@link #descriptorSetHostMapping}. */
    public static int ndescriptorSetHostMapping(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.DESCRIPTORSETHOSTMAPPING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.PNEXT, value); }
    /** Unsafe version of {@link #descriptorSetHostMapping(boolean) descriptorSetHostMapping}. */
    public static void ndescriptorSetHostMapping(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.DESCRIPTORSETHOSTMAPPING, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE ELEMENT_FACTORY = VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.npNext(address()); }
        /** @return the value of the {@code descriptorSetHostMapping} field. */
        @NativeType("VkBool32")
        public boolean descriptorSetHostMapping() { return VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.ndescriptorSetHostMapping(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.nsType(address(), value); return this; }
        /** Sets the {@link VALVEDescriptorSetHostMapping#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE} value to the {@code sType} field. */
        public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.Buffer sType$Default() { return sType(VALVEDescriptorSetHostMapping.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code descriptorSetHostMapping} field. */
        public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.Buffer descriptorSetHostMapping(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.ndescriptorSetHostMapping(address(), value ? 1 : 0); return this; }

    }

}
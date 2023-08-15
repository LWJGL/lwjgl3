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
 * Structure describing what pipeline properties are supported.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDevicePipelinePropertiesFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDevicePipelinePropertiesFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTPipelineProperties#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevicePipelinePropertiesFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #pipelinePropertiesIdentifier};
 * }</code></pre>
 */
public class VkPhysicalDevicePipelinePropertiesFeaturesEXT extends Struct<VkPhysicalDevicePipelinePropertiesFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINEPROPERTIESIDENTIFIER;

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
        PIPELINEPROPERTIESIDENTIFIER = layout.offsetof(2);
    }

    protected VkPhysicalDevicePipelinePropertiesFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePipelinePropertiesFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePipelinePropertiesFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePipelinePropertiesFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates that the implementation supports querying a unique pipeline identifier. */
    @NativeType("VkBool32")
    public boolean pipelinePropertiesIdentifier() { return npipelinePropertiesIdentifier(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPipelineProperties#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT sType$Default() { return sType(EXTPipelineProperties.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #pipelinePropertiesIdentifier} field. */
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT pipelinePropertiesIdentifier(@NativeType("VkBool32") boolean value) { npipelinePropertiesIdentifier(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT set(
        int sType,
        long pNext,
        boolean pipelinePropertiesIdentifier
    ) {
        sType(sType);
        pNext(pNext);
        pipelinePropertiesIdentifier(pipelinePropertiesIdentifier);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT set(VkPhysicalDevicePipelinePropertiesFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePipelinePropertiesFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT malloc() {
        return new VkPhysicalDevicePipelinePropertiesFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelinePropertiesFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT calloc() {
        return new VkPhysicalDevicePipelinePropertiesFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelinePropertiesFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelinePropertiesFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePipelinePropertiesFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT create(long address) {
        return new VkPhysicalDevicePipelinePropertiesFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePipelinePropertiesFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelinePropertiesFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelinePropertiesFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelinePropertiesFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePipelinePropertiesFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelinePropertiesFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelinePropertiesFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelinePropertiesFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelinePropertiesFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelinePropertiesFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelinePropertiesFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePipelinePropertiesFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePipelinePropertiesFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #pipelinePropertiesIdentifier}. */
    public static int npipelinePropertiesIdentifier(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePipelinePropertiesFeaturesEXT.PIPELINEPROPERTIESIDENTIFIER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePipelinePropertiesFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePipelinePropertiesFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #pipelinePropertiesIdentifier(boolean) pipelinePropertiesIdentifier}. */
    public static void npipelinePropertiesIdentifier(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePipelinePropertiesFeaturesEXT.PIPELINEPROPERTIESIDENTIFIER, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePipelinePropertiesFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePipelinePropertiesFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePipelinePropertiesFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevicePipelinePropertiesFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePipelinePropertiesFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePipelinePropertiesFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePipelinePropertiesFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDevicePipelinePropertiesFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePipelinePropertiesFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDevicePipelinePropertiesFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePipelinePropertiesFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDevicePipelinePropertiesFeaturesEXT#pipelinePropertiesIdentifier} field. */
        @NativeType("VkBool32")
        public boolean pipelinePropertiesIdentifier() { return VkPhysicalDevicePipelinePropertiesFeaturesEXT.npipelinePropertiesIdentifier(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDevicePipelinePropertiesFeaturesEXT#sType} field. */
        public VkPhysicalDevicePipelinePropertiesFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePipelinePropertiesFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPipelineProperties#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT} value to the {@link VkPhysicalDevicePipelinePropertiesFeaturesEXT#sType} field. */
        public VkPhysicalDevicePipelinePropertiesFeaturesEXT.Buffer sType$Default() { return sType(EXTPipelineProperties.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDevicePipelinePropertiesFeaturesEXT#pNext} field. */
        public VkPhysicalDevicePipelinePropertiesFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePipelinePropertiesFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevicePipelinePropertiesFeaturesEXT#pipelinePropertiesIdentifier} field. */
        public VkPhysicalDevicePipelinePropertiesFeaturesEXT.Buffer pipelinePropertiesIdentifier(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePipelinePropertiesFeaturesEXT.npipelinePropertiesIdentifier(address(), value ? 1 : 0); return this; }

    }

}
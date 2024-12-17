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
 * struct VkPhysicalDevicePipelinePropertiesFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 pipelinePropertiesIdentifier;
 * }}</pre>
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code pipelinePropertiesIdentifier} field. */
    @NativeType("VkBool32")
    public boolean pipelinePropertiesIdentifier() { return npipelinePropertiesIdentifier(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPipelineProperties#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT sType$Default() { return sType(EXTPipelineProperties.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePipelinePropertiesFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code pipelinePropertiesIdentifier} field. */
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
    public static @Nullable VkPhysicalDevicePipelinePropertiesFeaturesEXT createSafe(long address) {
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
    public static VkPhysicalDevicePipelinePropertiesFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
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
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePipelinePropertiesFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePipelinePropertiesFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #pipelinePropertiesIdentifier}. */
    public static int npipelinePropertiesIdentifier(long struct) { return memGetInt(struct + VkPhysicalDevicePipelinePropertiesFeaturesEXT.PIPELINEPROPERTIESIDENTIFIER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePipelinePropertiesFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePipelinePropertiesFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #pipelinePropertiesIdentifier(boolean) pipelinePropertiesIdentifier}. */
    public static void npipelinePropertiesIdentifier(long struct, int value) { memPutInt(struct + VkPhysicalDevicePipelinePropertiesFeaturesEXT.PIPELINEPROPERTIESIDENTIFIER, value); }

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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPhysicalDevicePipelinePropertiesFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePipelinePropertiesFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePipelinePropertiesFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code pipelinePropertiesIdentifier} field. */
        @NativeType("VkBool32")
        public boolean pipelinePropertiesIdentifier() { return VkPhysicalDevicePipelinePropertiesFeaturesEXT.npipelinePropertiesIdentifier(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePipelinePropertiesFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePipelinePropertiesFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPipelineProperties#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDevicePipelinePropertiesFeaturesEXT.Buffer sType$Default() { return sType(EXTPipelineProperties.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePipelinePropertiesFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePipelinePropertiesFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code pipelinePropertiesIdentifier} field. */
        public VkPhysicalDevicePipelinePropertiesFeaturesEXT.Buffer pipelinePropertiesIdentifier(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePipelinePropertiesFeaturesEXT.npipelinePropertiesIdentifier(address(), value ? 1 : 0); return this; }

    }

}
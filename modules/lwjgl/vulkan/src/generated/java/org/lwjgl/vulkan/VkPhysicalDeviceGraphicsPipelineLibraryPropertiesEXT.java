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
 * struct VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 graphicsPipelineLibraryFastLinking;
 *     VkBool32 graphicsPipelineLibraryIndependentInterpolationDecoration;
 * }}</pre>
 */
public class VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT extends Struct<VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        GRAPHICSPIPELINELIBRARYFASTLINKING,
        GRAPHICSPIPELINELIBRARYINDEPENDENTINTERPOLATIONDECORATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        GRAPHICSPIPELINELIBRARYFASTLINKING = layout.offsetof(2);
        GRAPHICSPIPELINELIBRARYINDEPENDENTINTERPOLATIONDECORATION = layout.offsetof(3);
    }

    protected VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code graphicsPipelineLibraryFastLinking} field. */
    @NativeType("VkBool32")
    public boolean graphicsPipelineLibraryFastLinking() { return ngraphicsPipelineLibraryFastLinking(address()) != 0; }
    /** @return the value of the {@code graphicsPipelineLibraryIndependentInterpolationDecoration} field. */
    @NativeType("VkBool32")
    public boolean graphicsPipelineLibraryIndependentInterpolationDecoration() { return ngraphicsPipelineLibraryIndependentInterpolationDecoration(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTGraphicsPipelineLibrary#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT sType$Default() { return sType(EXTGraphicsPipelineLibrary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT set(
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
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT set(VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT malloc() {
        return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT calloc() {
        return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT create(long address) {
        return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #graphicsPipelineLibraryFastLinking}. */
    public static int ngraphicsPipelineLibraryFastLinking(long struct) { return memGetInt(struct + VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.GRAPHICSPIPELINELIBRARYFASTLINKING); }
    /** Unsafe version of {@link #graphicsPipelineLibraryIndependentInterpolationDecoration}. */
    public static int ngraphicsPipelineLibraryIndependentInterpolationDecoration(long struct) { return memGetInt(struct + VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.GRAPHICSPIPELINELIBRARYINDEPENDENTINTERPOLATIONDECORATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.npNext(address()); }
        /** @return the value of the {@code graphicsPipelineLibraryFastLinking} field. */
        @NativeType("VkBool32")
        public boolean graphicsPipelineLibraryFastLinking() { return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.ngraphicsPipelineLibraryFastLinking(address()) != 0; }
        /** @return the value of the {@code graphicsPipelineLibraryIndependentInterpolationDecoration} field. */
        @NativeType("VkBool32")
        public boolean graphicsPipelineLibraryIndependentInterpolationDecoration() { return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.ngraphicsPipelineLibraryIndependentInterpolationDecoration(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTGraphicsPipelineLibrary#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.Buffer sType$Default() { return sType(EXTGraphicsPipelineLibrary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.npNext(address(), value); return this; }

    }

}
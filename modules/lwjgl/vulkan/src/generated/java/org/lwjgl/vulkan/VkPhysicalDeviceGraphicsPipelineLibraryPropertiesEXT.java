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
 * Structure describing additional properties of graphics pipeline libraries.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTGraphicsPipelineLibrary#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 {@link #graphicsPipelineLibraryFastLinking};
 *     VkBool32 {@link #graphicsPipelineLibraryIndependentInterpolationDecoration};
 * }</code></pre>
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
    /** indicates whether fast linking of graphics pipelines is supported. If it is {@link VK10#VK_TRUE TRUE}, creating a graphics pipeline entirely from pipeline libraries without {@link EXTGraphicsPipelineLibrary#VK_PIPELINE_CREATE_LINK_TIME_OPTIMIZATION_BIT_EXT PIPELINE_CREATE_LINK_TIME_OPTIMIZATION_BIT_EXT} is comparable in cost to recording a command in a command buffer. */
    @NativeType("VkBool32")
    public boolean graphicsPipelineLibraryFastLinking() { return ngraphicsPipelineLibraryFastLinking(address()) != 0; }
    /** indicates whether {@code NoPerspective} and {@code Flat} interpolation decorations in the last vertex processing stage and the fragment shader are required to match when using graphics pipeline libraries. If it is {@link VK10#VK_TRUE TRUE}, the interpolation decorations do not need to match. If it is {@link VK10#VK_FALSE FALSE}, these decorations <b>must</b> either be present in both stages or neither stage in order for a given interface variable to match. */
    @NativeType("VkBool32")
    public boolean graphicsPipelineLibraryIndependentInterpolationDecoration() { return ngraphicsPipelineLibraryIndependentInterpolationDecoration(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTGraphicsPipelineLibrary#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT sType$Default() { return sType(EXTGraphicsPipelineLibrary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #graphicsPipelineLibraryFastLinking} field. */
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT graphicsPipelineLibraryFastLinking(@NativeType("VkBool32") boolean value) { ngraphicsPipelineLibraryFastLinking(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #graphicsPipelineLibraryIndependentInterpolationDecoration} field. */
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT graphicsPipelineLibraryIndependentInterpolationDecoration(@NativeType("VkBool32") boolean value) { ngraphicsPipelineLibraryIndependentInterpolationDecoration(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT set(
        int sType,
        long pNext,
        boolean graphicsPipelineLibraryFastLinking,
        boolean graphicsPipelineLibraryIndependentInterpolationDecoration
    ) {
        sType(sType);
        pNext(pNext);
        graphicsPipelineLibraryFastLinking(graphicsPipelineLibraryFastLinking);
        graphicsPipelineLibraryIndependentInterpolationDecoration(graphicsPipelineLibraryIndependentInterpolationDecoration);

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
    @Nullable
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT createSafe(long address) {
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
    @Nullable
    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.Buffer createSafe(long address, int capacity) {
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
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #graphicsPipelineLibraryFastLinking}. */
    public static int ngraphicsPipelineLibraryFastLinking(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.GRAPHICSPIPELINELIBRARYFASTLINKING); }
    /** Unsafe version of {@link #graphicsPipelineLibraryIndependentInterpolationDecoration}. */
    public static int ngraphicsPipelineLibraryIndependentInterpolationDecoration(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.GRAPHICSPIPELINELIBRARYINDEPENDENTINTERPOLATIONDECORATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.PNEXT, value); }
    /** Unsafe version of {@link #graphicsPipelineLibraryFastLinking(boolean) graphicsPipelineLibraryFastLinking}. */
    public static void ngraphicsPipelineLibraryFastLinking(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.GRAPHICSPIPELINELIBRARYFASTLINKING, value); }
    /** Unsafe version of {@link #graphicsPipelineLibraryIndependentInterpolationDecoration(boolean) graphicsPipelineLibraryIndependentInterpolationDecoration}. */
    public static void ngraphicsPipelineLibraryIndependentInterpolationDecoration(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.GRAPHICSPIPELINELIBRARYINDEPENDENTINTERPOLATIONDECORATION, value); }

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
        protected VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT#graphicsPipelineLibraryFastLinking} field. */
        @NativeType("VkBool32")
        public boolean graphicsPipelineLibraryFastLinking() { return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.ngraphicsPipelineLibraryFastLinking(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT#graphicsPipelineLibraryIndependentInterpolationDecoration} field. */
        @NativeType("VkBool32")
        public boolean graphicsPipelineLibraryIndependentInterpolationDecoration() { return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.ngraphicsPipelineLibraryIndependentInterpolationDecoration(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTGraphicsPipelineLibrary#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.Buffer sType$Default() { return sType(EXTGraphicsPipelineLibrary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT#graphicsPipelineLibraryFastLinking} field. */
        public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.Buffer graphicsPipelineLibraryFastLinking(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.ngraphicsPipelineLibraryFastLinking(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT#graphicsPipelineLibraryIndependentInterpolationDecoration} field. */
        public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.Buffer graphicsPipelineLibraryIndependentInterpolationDecoration(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.ngraphicsPipelineLibraryIndependentInterpolationDecoration(address(), value ? 1 : 0); return this; }

    }

}
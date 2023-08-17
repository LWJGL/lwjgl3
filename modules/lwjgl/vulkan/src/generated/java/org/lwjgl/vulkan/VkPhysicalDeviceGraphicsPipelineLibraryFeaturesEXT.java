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
 * Structure describing support for graphics pipeline libraries.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTGraphicsPipelineLibrary#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #graphicsPipelineLibrary};
 * }</code></pre>
 */
public class VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT extends Struct<VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        GRAPHICSPIPELINELIBRARY;

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
        GRAPHICSPIPELINELIBRARY = layout.offsetof(2);
    }

    protected VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(ByteBuffer container) {
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
    /** indicates that the implementation supports <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-library">graphics pipeline libraries</a>. */
    @NativeType("VkBool32")
    public boolean graphicsPipelineLibrary() { return ngraphicsPipelineLibrary(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTGraphicsPipelineLibrary#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT sType$Default() { return sType(EXTGraphicsPipelineLibrary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #graphicsPipelineLibrary} field. */
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT graphicsPipelineLibrary(@NativeType("VkBool32") boolean value) { ngraphicsPipelineLibrary(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT set(
        int sType,
        long pNext,
        boolean graphicsPipelineLibrary
    ) {
        sType(sType);
        pNext(pNext);
        graphicsPipelineLibrary(graphicsPipelineLibrary);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT set(VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT malloc() {
        return new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT calloc() {
        return new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT create(long address) {
        return new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #graphicsPipelineLibrary}. */
    public static int ngraphicsPipelineLibrary(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.GRAPHICSPIPELINELIBRARY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #graphicsPipelineLibrary(boolean) graphicsPipelineLibrary}. */
    public static void ngraphicsPipelineLibrary(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.GRAPHICSPIPELINELIBRARY, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT#graphicsPipelineLibrary} field. */
        @NativeType("VkBool32")
        public boolean graphicsPipelineLibrary() { return VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.ngraphicsPipelineLibrary(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT#sType} field. */
        public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTGraphicsPipelineLibrary#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_FEATURES_EXT} value to the {@link VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT#sType} field. */
        public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.Buffer sType$Default() { return sType(EXTGraphicsPipelineLibrary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT#graphicsPipelineLibrary} field. */
        public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.Buffer graphicsPipelineLibrary(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT.ngraphicsPipelineLibrary(address(), value ? 1 : 0); return this; }

    }

}
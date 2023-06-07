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
 * Structure describing whether querying shader group handles from a pipeline library is supported by the implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTPipelineLibraryGroupHandles#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_LIBRARY_GROUP_HANDLES_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_LIBRARY_GROUP_HANDLES_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 {@link #pipelineLibraryGroupHandles};
 * }</code></pre>
 */
public class VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT extends Struct<VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINELIBRARYGROUPHANDLES;

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
        PIPELINELIBRARYGROUPHANDLES = layout.offsetof(2);
    }

    protected VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT(ByteBuffer container) {
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
    /** indicates whether the implementation supports querying group handles directly from a ray tracing pipeline library, and guarantees bitwise identical group handles for such libraries when linked into other pipelines. */
    @NativeType("VkBool32")
    public boolean pipelineLibraryGroupHandles() { return npipelineLibraryGroupHandles(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPipelineLibraryGroupHandles#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_LIBRARY_GROUP_HANDLES_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_LIBRARY_GROUP_HANDLES_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT sType$Default() { return sType(EXTPipelineLibraryGroupHandles.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_LIBRARY_GROUP_HANDLES_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #pipelineLibraryGroupHandles} field. */
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT pipelineLibraryGroupHandles(@NativeType("VkBool32") boolean value) { npipelineLibraryGroupHandles(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT set(
        int sType,
        long pNext,
        boolean pipelineLibraryGroupHandles
    ) {
        sType(sType);
        pNext(pNext);
        pipelineLibraryGroupHandles(pipelineLibraryGroupHandles);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT set(VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT malloc() {
        return new VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT calloc() {
        return new VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT create(long address) {
        return new VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #pipelineLibraryGroupHandles}. */
    public static int npipelineLibraryGroupHandles(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.PIPELINELIBRARYGROUPHANDLES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #pipelineLibraryGroupHandles(boolean) pipelineLibraryGroupHandles}. */
    public static void npipelineLibraryGroupHandles(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.PIPELINELIBRARYGROUPHANDLES, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT#pipelineLibraryGroupHandles} field. */
        @NativeType("VkBool32")
        public boolean pipelineLibraryGroupHandles() { return VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.npipelineLibraryGroupHandles(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPipelineLibraryGroupHandles#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_LIBRARY_GROUP_HANDLES_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_LIBRARY_GROUP_HANDLES_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.Buffer sType$Default() { return sType(EXTPipelineLibraryGroupHandles.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_LIBRARY_GROUP_HANDLES_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT#pipelineLibraryGroupHandles} field. */
        public VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.Buffer pipelineLibraryGroupHandles(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT.npipelineLibraryGroupHandles(address(), value ? 1 : 0); return this; }

    }

}
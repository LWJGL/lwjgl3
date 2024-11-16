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
 * Structure describing whether pipeline cache control can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDevicePipelineCreationCacheControlFeatures} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDevicePipelineCreationCacheControlFeatures} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevicePipelineCreationCacheControlFeatures {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #pipelineCreationCacheControl};
 * }</code></pre>
 */
public class VkPhysicalDevicePipelineCreationCacheControlFeatures extends Struct<VkPhysicalDevicePipelineCreationCacheControlFeatures> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINECREATIONCACHECONTROL;

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
        PIPELINECREATIONCACHECONTROL = layout.offsetof(2);
    }

    protected VkPhysicalDevicePipelineCreationCacheControlFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePipelineCreationCacheControlFeatures create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePipelineCreationCacheControlFeatures(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePipelineCreationCacheControlFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePipelineCreationCacheControlFeatures(ByteBuffer container) {
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
    /**
     * indicates that the implementation supports:
     * 
     * <ul>
     * <li>The following <b>can</b> be used in stext:Vk*PipelineCreateInfo{@code ::flags}:
     * 
     * <ul>
     * <li>{@link VK13#VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT}</li>
     * <li>{@link VK13#VK_PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT}</li>
     * </ul>
     * </li>
     * <li>The following <b>can</b> be used in {@link VkPipelineCacheCreateInfo}{@code ::flags}:
     * 
     * <ul>
     * <li>{@link VK13#VK_PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT}</li>
     * </ul>
     * </li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean pipelineCreationCacheControl() { return npipelineCreationCacheControl(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDevicePipelineCreationCacheControlFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDevicePipelineCreationCacheControlFeatures sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDevicePipelineCreationCacheControlFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #pipelineCreationCacheControl} field. */
    public VkPhysicalDevicePipelineCreationCacheControlFeatures pipelineCreationCacheControl(@NativeType("VkBool32") boolean value) { npipelineCreationCacheControl(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePipelineCreationCacheControlFeatures set(
        int sType,
        long pNext,
        boolean pipelineCreationCacheControl
    ) {
        sType(sType);
        pNext(pNext);
        pipelineCreationCacheControl(pipelineCreationCacheControl);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePipelineCreationCacheControlFeatures set(VkPhysicalDevicePipelineCreationCacheControlFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePipelineCreationCacheControlFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineCreationCacheControlFeatures malloc() {
        return new VkPhysicalDevicePipelineCreationCacheControlFeatures(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineCreationCacheControlFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineCreationCacheControlFeatures calloc() {
        return new VkPhysicalDevicePipelineCreationCacheControlFeatures(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineCreationCacheControlFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePipelineCreationCacheControlFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineCreationCacheControlFeatures(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineCreationCacheControlFeatures} instance for the specified memory address. */
    public static VkPhysicalDevicePipelineCreationCacheControlFeatures create(long address) {
        return new VkPhysicalDevicePipelineCreationCacheControlFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePipelineCreationCacheControlFeatures createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePipelineCreationCacheControlFeatures(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePipelineCreationCacheControlFeatures.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineCreationCacheControlFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineCreationCacheControlFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineCreationCacheControlFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineCreationCacheControlFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineCreationCacheControlFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePipelineCreationCacheControlFeatures.PNEXT); }
    /** Unsafe version of {@link #pipelineCreationCacheControl}. */
    public static int npipelineCreationCacheControl(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineCreationCacheControlFeatures.PIPELINECREATIONCACHECONTROL); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePipelineCreationCacheControlFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePipelineCreationCacheControlFeatures.PNEXT, value); }
    /** Unsafe version of {@link #pipelineCreationCacheControl(boolean) pipelineCreationCacheControl}. */
    public static void npipelineCreationCacheControl(long struct, int value) { memPutInt(struct + VkPhysicalDevicePipelineCreationCacheControlFeatures.PIPELINECREATIONCACHECONTROL, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePipelineCreationCacheControlFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePipelineCreationCacheControlFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePipelineCreationCacheControlFeatures ELEMENT_FACTORY = VkPhysicalDevicePipelineCreationCacheControlFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePipelineCreationCacheControlFeatures#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePipelineCreationCacheControlFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDevicePipelineCreationCacheControlFeatures#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePipelineCreationCacheControlFeatures.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDevicePipelineCreationCacheControlFeatures#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePipelineCreationCacheControlFeatures.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDevicePipelineCreationCacheControlFeatures#pipelineCreationCacheControl} field. */
        @NativeType("VkBool32")
        public boolean pipelineCreationCacheControl() { return VkPhysicalDevicePipelineCreationCacheControlFeatures.npipelineCreationCacheControl(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDevicePipelineCreationCacheControlFeatures#sType} field. */
        public VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePipelineCreationCacheControlFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES} value to the {@link VkPhysicalDevicePipelineCreationCacheControlFeatures#sType} field. */
        public VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDevicePipelineCreationCacheControlFeatures#pNext} field. */
        public VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePipelineCreationCacheControlFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevicePipelineCreationCacheControlFeatures#pipelineCreationCacheControl} field. */
        public VkPhysicalDevicePipelineCreationCacheControlFeatures.Buffer pipelineCreationCacheControl(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePipelineCreationCacheControlFeatures.npipelineCreationCacheControl(address(), value ? 1 : 0); return this; }

    }

}
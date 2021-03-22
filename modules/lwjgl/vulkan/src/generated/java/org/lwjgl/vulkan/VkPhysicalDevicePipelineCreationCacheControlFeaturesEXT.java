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
 * Structure describing whether pipeline cache control can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2}, it is filled with values indicating whether the feature is supported. {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to enable features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTPipelineCreationCacheControl#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 {@link #pipelineCreationCacheControl};
 * }</code></pre>
 */
public class VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT extends Struct implements NativeResource {

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

    /**
     * Creates a {@code VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT(ByteBuffer container) {
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
    /**
     * indicates that the implementation supports:
     * 
     * <ul>
     * <li>The following <b>can</b> be used in stext:Vk*PipelineCreateInfo{@code ::flags}:
     * 
     * <ul>
     * <li>{@link EXTPipelineCreationCacheControl#VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_EXT PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_EXT}</li>
     * <li>{@link EXTPipelineCreationCacheControl#VK_PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT_EXT PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT_EXT}</li>
     * </ul>
     * </li>
     * <li>The following <b>can</b> be used in {@link VkPipelineCacheCreateInfo}{@code ::flags}:
     * 
     * <ul>
     * <li>{@link EXTPipelineCreationCacheControl#VK_PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT_EXT PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT_EXT}</li>
     * </ul>
     * </li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean pipelineCreationCacheControl() { return npipelineCreationCacheControl(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #pipelineCreationCacheControl} field. */
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT pipelineCreationCacheControl(@NativeType("VkBool32") boolean value) { npipelineCreationCacheControl(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT set(
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
    public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT set(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT malloc() {
        return wrap(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT calloc() {
        return wrap(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT create(long address) {
        return wrap(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #pipelineCreationCacheControl}. */
    public static int npipelineCreationCacheControl(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.PIPELINECREATIONCACHECONTROL); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #pipelineCreationCacheControl(boolean) pipelineCreationCacheControl}. */
    public static void npipelineCreationCacheControl(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.PIPELINECREATIONCACHECONTROL, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT#pipelineCreationCacheControl} field. */
        @NativeType("VkBool32")
        public boolean pipelineCreationCacheControl() { return VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.npipelineCreationCacheControl(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT#pipelineCreationCacheControl} field. */
        public VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.Buffer pipelineCreationCacheControl(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT.npipelineCreationCacheControl(address(), value ? 1 : 0); return this; }

    }

}
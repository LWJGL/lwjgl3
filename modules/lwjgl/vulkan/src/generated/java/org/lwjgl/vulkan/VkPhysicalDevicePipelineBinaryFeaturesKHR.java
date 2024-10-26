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
 * Structure describing support for pipeline binaries.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDevicePipelineBinaryFeaturesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDevicePipelineBinaryFeaturesKHR} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRPipelineBinary#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevicePipelineBinaryFeaturesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #pipelineBinaries};
 * }</code></pre>
 */
public class VkPhysicalDevicePipelineBinaryFeaturesKHR extends Struct<VkPhysicalDevicePipelineBinaryFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINEBINARIES;

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
        PIPELINEBINARIES = layout.offsetof(2);
    }

    protected VkPhysicalDevicePipelineBinaryFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePipelineBinaryFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePipelineBinaryFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePipelineBinaryFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePipelineBinaryFeaturesKHR(ByteBuffer container) {
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
    /** indicates that the implementation supports <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-binaries">Pipeline Binaries</a>. */
    @NativeType("VkBool32")
    public boolean pipelineBinaries() { return npipelineBinaries(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDevicePipelineBinaryFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPipelineBinary#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_FEATURES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDevicePipelineBinaryFeaturesKHR sType$Default() { return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_FEATURES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDevicePipelineBinaryFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #pipelineBinaries} field. */
    public VkPhysicalDevicePipelineBinaryFeaturesKHR pipelineBinaries(@NativeType("VkBool32") boolean value) { npipelineBinaries(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePipelineBinaryFeaturesKHR set(
        int sType,
        long pNext,
        boolean pipelineBinaries
    ) {
        sType(sType);
        pNext(pNext);
        pipelineBinaries(pipelineBinaries);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePipelineBinaryFeaturesKHR set(VkPhysicalDevicePipelineBinaryFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePipelineBinaryFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineBinaryFeaturesKHR malloc() {
        return new VkPhysicalDevicePipelineBinaryFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineBinaryFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineBinaryFeaturesKHR calloc() {
        return new VkPhysicalDevicePipelineBinaryFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineBinaryFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePipelineBinaryFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineBinaryFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineBinaryFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDevicePipelineBinaryFeaturesKHR create(long address) {
        return new VkPhysicalDevicePipelineBinaryFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePipelineBinaryFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePipelineBinaryFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineBinaryFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineBinaryFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineBinaryFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineBinaryFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineBinaryFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineBinaryFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePipelineBinaryFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineBinaryFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePipelineBinaryFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineBinaryFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineBinaryFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineBinaryFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineBinaryFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineBinaryFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineBinaryFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineBinaryFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineBinaryFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineBinaryFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineBinaryFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePipelineBinaryFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePipelineBinaryFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #pipelineBinaries}. */
    public static int npipelineBinaries(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePipelineBinaryFeaturesKHR.PIPELINEBINARIES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePipelineBinaryFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePipelineBinaryFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #pipelineBinaries(boolean) pipelineBinaries}. */
    public static void npipelineBinaries(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePipelineBinaryFeaturesKHR.PIPELINEBINARIES, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePipelineBinaryFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePipelineBinaryFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePipelineBinaryFeaturesKHR ELEMENT_FACTORY = VkPhysicalDevicePipelineBinaryFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePipelineBinaryFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePipelineBinaryFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePipelineBinaryFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDevicePipelineBinaryFeaturesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePipelineBinaryFeaturesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDevicePipelineBinaryFeaturesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePipelineBinaryFeaturesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDevicePipelineBinaryFeaturesKHR#pipelineBinaries} field. */
        @NativeType("VkBool32")
        public boolean pipelineBinaries() { return VkPhysicalDevicePipelineBinaryFeaturesKHR.npipelineBinaries(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDevicePipelineBinaryFeaturesKHR#sType} field. */
        public VkPhysicalDevicePipelineBinaryFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePipelineBinaryFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPipelineBinary#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_FEATURES_KHR} value to the {@link VkPhysicalDevicePipelineBinaryFeaturesKHR#sType} field. */
        public VkPhysicalDevicePipelineBinaryFeaturesKHR.Buffer sType$Default() { return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_FEATURES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDevicePipelineBinaryFeaturesKHR#pNext} field. */
        public VkPhysicalDevicePipelineBinaryFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePipelineBinaryFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevicePipelineBinaryFeaturesKHR#pipelineBinaries} field. */
        public VkPhysicalDevicePipelineBinaryFeaturesKHR.Buffer pipelineBinaries(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePipelineBinaryFeaturesKHR.npipelineBinaries(address(), value ? 1 : 0); return this; }

    }

}
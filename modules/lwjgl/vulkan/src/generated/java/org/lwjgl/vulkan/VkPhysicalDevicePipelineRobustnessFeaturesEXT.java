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
 * Structure describing whether an implementation supports robustness requests on a per-pipeline stage granularity.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Enabling <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineRobustness">{@code pipelineRobustness}</a> may, on some platforms, incur a minor performance cost when <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess">{@code robustBufferAccess}</a> is disabled, even for pipelines which do not make use of any robustness features. If robustness is not needed, <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineRobustness">{@code pipelineRobustness}</a> should not be enabled by an application.</p>
 * </div>
 * 
 * <p>If the {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTPipelineRobustness#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevicePipelineRobustnessFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #pipelineRobustness};
 * }</code></pre>
 */
public class VkPhysicalDevicePipelineRobustnessFeaturesEXT extends Struct<VkPhysicalDevicePipelineRobustnessFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINEROBUSTNESS;

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
        PIPELINEROBUSTNESS = layout.offsetof(2);
    }

    protected VkPhysicalDevicePipelineRobustnessFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePipelineRobustnessFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePipelineRobustnessFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePipelineRobustnessFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePipelineRobustnessFeaturesEXT(ByteBuffer container) {
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
    /** indicates that robustness <b>can</b> be requested on a per-pipeline-stage granularity. */
    @NativeType("VkBool32")
    public boolean pipelineRobustness() { return npipelineRobustness(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDevicePipelineRobustnessFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPipelineRobustness#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDevicePipelineRobustnessFeaturesEXT sType$Default() { return sType(EXTPipelineRobustness.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDevicePipelineRobustnessFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #pipelineRobustness} field. */
    public VkPhysicalDevicePipelineRobustnessFeaturesEXT pipelineRobustness(@NativeType("VkBool32") boolean value) { npipelineRobustness(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePipelineRobustnessFeaturesEXT set(
        int sType,
        long pNext,
        boolean pipelineRobustness
    ) {
        sType(sType);
        pNext(pNext);
        pipelineRobustness(pipelineRobustness);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePipelineRobustnessFeaturesEXT set(VkPhysicalDevicePipelineRobustnessFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePipelineRobustnessFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT malloc() {
        return new VkPhysicalDevicePipelineRobustnessFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineRobustnessFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT calloc() {
        return new VkPhysicalDevicePipelineRobustnessFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineRobustnessFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineRobustnessFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineRobustnessFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT create(long address) {
        return new VkPhysicalDevicePipelineRobustnessFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePipelineRobustnessFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineRobustnessFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineRobustnessFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineRobustnessFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineRobustnessFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePipelineRobustnessFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePipelineRobustnessFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #pipelineRobustness}. */
    public static int npipelineRobustness(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePipelineRobustnessFeaturesEXT.PIPELINEROBUSTNESS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePipelineRobustnessFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePipelineRobustnessFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #pipelineRobustness(boolean) pipelineRobustness}. */
    public static void npipelineRobustness(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePipelineRobustnessFeaturesEXT.PIPELINEROBUSTNESS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePipelineRobustnessFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePipelineRobustnessFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevicePipelineRobustnessFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePipelineRobustnessFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePipelineRobustnessFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePipelineRobustnessFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT#pipelineRobustness} field. */
        @NativeType("VkBool32")
        public boolean pipelineRobustness() { return VkPhysicalDevicePipelineRobustnessFeaturesEXT.npipelineRobustness(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT#sType} field. */
        public VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePipelineRobustnessFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPipelineRobustness#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES_EXT} value to the {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT#sType} field. */
        public VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer sType$Default() { return sType(EXTPipelineRobustness.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT#pNext} field. */
        public VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePipelineRobustnessFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDevicePipelineRobustnessFeaturesEXT#pipelineRobustness} field. */
        public VkPhysicalDevicePipelineRobustnessFeaturesEXT.Buffer pipelineRobustness(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePipelineRobustnessFeaturesEXT.npipelineRobustness(address(), value ? 1 : 0); return this; }

    }

}
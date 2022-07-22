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
 * Structure controlling the robustness of a newly created pipeline shader stage.
 * 
 * <h5>Description</h5>
 * 
 * <p>The scope of the effect of {@link VkPipelineRobustnessCreateInfoEXT} depends on which structure’s {@code pNext} chain it is included in.</p>
 * 
 * <ul>
 * <li>{@link VkGraphicsPipelineCreateInfo}, {@link VkComputePipelineCreateInfo}, {@link VkRayTracingPipelineCreateInfoKHR} The robustness behavior described by {@link VkPipelineRobustnessCreateInfoEXT} applies to all accesses through this pipeline</li>
 * <li>{@link VkPipelineShaderStageCreateInfo} The robustness behavior described by {@link VkPipelineRobustnessCreateInfoEXT} applies to all accesses emanating from the shader code of this shader stage</li>
 * </ul>
 * 
 * <p>If {@link VkPipelineRobustnessCreateInfoEXT} is specified for both a pipeline and a pipeline stage, the {@link VkPipelineRobustnessCreateInfoEXT} specified for the pipeline stage will take precedence.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineRobustness">{@code pipelineRobustness}</a> feature is not enabled, {@code storageBuffers} <b>must</b> be {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineRobustness">{@code pipelineRobustness}</a> feature is not enabled, {@code uniformBuffers} <b>must</b> be {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineRobustness">{@code pipelineRobustness}</a> feature is not enabled, {@code vertexInputs} <b>must</b> be {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineRobustness">{@code pipelineRobustness}</a> feature is not enabled, {@code images} <b>must</b> be {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DEVICE_DEFAULT_EXT PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DEVICE_DEFAULT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustImageAccess">{@code robustImageAccess}</a> feature is not supported, {@code images} <b>must</b> not be {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_EXT PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess2">{@code robustBufferAccess2}</a> feature is not supported, {@code storageBuffers} <b>must</b> not be {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess2">{@code robustBufferAccess2}</a> feature is not supported, {@code uniformBuffers} <b>must</b> not be {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustBufferAccess2">{@code robustBufferAccess2}</a> feature is not supported, {@code vertexInputs} <b>must</b> not be {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-robustImageAccess2">{@code robustImageAccess2}</a> feature is not supported, {@code images} <b>must</b> not be {@link EXTPipelineRobustness#VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_2_EXT PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_2_EXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTPipelineRobustness#VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO_EXT}</li>
 * <li>{@code storageBuffers} <b>must</b> be a valid {@code VkPipelineRobustnessBufferBehaviorEXT} value</li>
 * <li>{@code uniformBuffers} <b>must</b> be a valid {@code VkPipelineRobustnessBufferBehaviorEXT} value</li>
 * <li>{@code vertexInputs} <b>must</b> be a valid {@code VkPipelineRobustnessBufferBehaviorEXT} value</li>
 * <li>{@code images} <b>must</b> be a valid {@code VkPipelineRobustnessImageBehaviorEXT} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineRobustnessCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineRobustnessBufferBehaviorEXT storageBuffers;
 *     VkPipelineRobustnessBufferBehaviorEXT uniformBuffers;
 *     VkPipelineRobustnessBufferBehaviorEXT vertexInputs;
 *     VkPipelineRobustnessImageBehaviorEXT images;
 * }</code></pre>
 */
public class VkPipelineRobustnessCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STORAGEBUFFERS,
        UNIFORMBUFFERS,
        VERTEXINPUTS,
        IMAGES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STORAGEBUFFERS = layout.offsetof(2);
        UNIFORMBUFFERS = layout.offsetof(3);
        VERTEXINPUTS = layout.offsetof(4);
        IMAGES = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkPipelineRobustnessCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineRobustnessCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code storageBuffers} field. */
    @NativeType("VkPipelineRobustnessBufferBehaviorEXT")
    public int storageBuffers() { return nstorageBuffers(address()); }
    /** @return the value of the {@code uniformBuffers} field. */
    @NativeType("VkPipelineRobustnessBufferBehaviorEXT")
    public int uniformBuffers() { return nuniformBuffers(address()); }
    /** @return the value of the {@code vertexInputs} field. */
    @NativeType("VkPipelineRobustnessBufferBehaviorEXT")
    public int vertexInputs() { return nvertexInputs(address()); }
    /** @return the value of the {@code images} field. */
    @NativeType("VkPipelineRobustnessImageBehaviorEXT")
    public int images() { return nimages(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineRobustnessCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPipelineRobustness#VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO_EXT} value to the {@code sType} field. */
    public VkPipelineRobustnessCreateInfoEXT sType$Default() { return sType(EXTPipelineRobustness.VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineRobustnessCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code storageBuffers} field. */
    public VkPipelineRobustnessCreateInfoEXT storageBuffers(@NativeType("VkPipelineRobustnessBufferBehaviorEXT") int value) { nstorageBuffers(address(), value); return this; }
    /** Sets the specified value to the {@code uniformBuffers} field. */
    public VkPipelineRobustnessCreateInfoEXT uniformBuffers(@NativeType("VkPipelineRobustnessBufferBehaviorEXT") int value) { nuniformBuffers(address(), value); return this; }
    /** Sets the specified value to the {@code vertexInputs} field. */
    public VkPipelineRobustnessCreateInfoEXT vertexInputs(@NativeType("VkPipelineRobustnessBufferBehaviorEXT") int value) { nvertexInputs(address(), value); return this; }
    /** Sets the specified value to the {@code images} field. */
    public VkPipelineRobustnessCreateInfoEXT images(@NativeType("VkPipelineRobustnessImageBehaviorEXT") int value) { nimages(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineRobustnessCreateInfoEXT set(
        int sType,
        long pNext,
        int storageBuffers,
        int uniformBuffers,
        int vertexInputs,
        int images
    ) {
        sType(sType);
        pNext(pNext);
        storageBuffers(storageBuffers);
        uniformBuffers(uniformBuffers);
        vertexInputs(vertexInputs);
        images(images);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineRobustnessCreateInfoEXT set(VkPipelineRobustnessCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineRobustnessCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineRobustnessCreateInfoEXT malloc() {
        return wrap(VkPipelineRobustnessCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineRobustnessCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineRobustnessCreateInfoEXT calloc() {
        return wrap(VkPipelineRobustnessCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineRobustnessCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineRobustnessCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineRobustnessCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineRobustnessCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineRobustnessCreateInfoEXT create(long address) {
        return wrap(VkPipelineRobustnessCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRobustnessCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineRobustnessCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkPipelineRobustnessCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRobustnessCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRobustnessCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRobustnessCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRobustnessCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRobustnessCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineRobustnessCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineRobustnessCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRobustnessCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineRobustnessCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRobustnessCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkPipelineRobustnessCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineRobustnessCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRobustnessCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkPipelineRobustnessCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineRobustnessCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRobustnessCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRobustnessCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRobustnessCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRobustnessCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineRobustnessCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #storageBuffers}. */
    public static int nstorageBuffers(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRobustnessCreateInfoEXT.STORAGEBUFFERS); }
    /** Unsafe version of {@link #uniformBuffers}. */
    public static int nuniformBuffers(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRobustnessCreateInfoEXT.UNIFORMBUFFERS); }
    /** Unsafe version of {@link #vertexInputs}. */
    public static int nvertexInputs(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRobustnessCreateInfoEXT.VERTEXINPUTS); }
    /** Unsafe version of {@link #images}. */
    public static int nimages(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRobustnessCreateInfoEXT.IMAGES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRobustnessCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineRobustnessCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #storageBuffers(int) storageBuffers}. */
    public static void nstorageBuffers(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRobustnessCreateInfoEXT.STORAGEBUFFERS, value); }
    /** Unsafe version of {@link #uniformBuffers(int) uniformBuffers}. */
    public static void nuniformBuffers(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRobustnessCreateInfoEXT.UNIFORMBUFFERS, value); }
    /** Unsafe version of {@link #vertexInputs(int) vertexInputs}. */
    public static void nvertexInputs(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRobustnessCreateInfoEXT.VERTEXINPUTS, value); }
    /** Unsafe version of {@link #images(int) images}. */
    public static void nimages(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRobustnessCreateInfoEXT.IMAGES, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineRobustnessCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineRobustnessCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkPipelineRobustnessCreateInfoEXT ELEMENT_FACTORY = VkPipelineRobustnessCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineRobustnessCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineRobustnessCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineRobustnessCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineRobustnessCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineRobustnessCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@code storageBuffers} field. */
        @NativeType("VkPipelineRobustnessBufferBehaviorEXT")
        public int storageBuffers() { return VkPipelineRobustnessCreateInfoEXT.nstorageBuffers(address()); }
        /** @return the value of the {@code uniformBuffers} field. */
        @NativeType("VkPipelineRobustnessBufferBehaviorEXT")
        public int uniformBuffers() { return VkPipelineRobustnessCreateInfoEXT.nuniformBuffers(address()); }
        /** @return the value of the {@code vertexInputs} field. */
        @NativeType("VkPipelineRobustnessBufferBehaviorEXT")
        public int vertexInputs() { return VkPipelineRobustnessCreateInfoEXT.nvertexInputs(address()); }
        /** @return the value of the {@code images} field. */
        @NativeType("VkPipelineRobustnessImageBehaviorEXT")
        public int images() { return VkPipelineRobustnessCreateInfoEXT.nimages(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineRobustnessCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineRobustnessCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPipelineRobustness#VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO_EXT} value to the {@code sType} field. */
        public VkPipelineRobustnessCreateInfoEXT.Buffer sType$Default() { return sType(EXTPipelineRobustness.VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineRobustnessCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineRobustnessCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code storageBuffers} field. */
        public VkPipelineRobustnessCreateInfoEXT.Buffer storageBuffers(@NativeType("VkPipelineRobustnessBufferBehaviorEXT") int value) { VkPipelineRobustnessCreateInfoEXT.nstorageBuffers(address(), value); return this; }
        /** Sets the specified value to the {@code uniformBuffers} field. */
        public VkPipelineRobustnessCreateInfoEXT.Buffer uniformBuffers(@NativeType("VkPipelineRobustnessBufferBehaviorEXT") int value) { VkPipelineRobustnessCreateInfoEXT.nuniformBuffers(address(), value); return this; }
        /** Sets the specified value to the {@code vertexInputs} field. */
        public VkPipelineRobustnessCreateInfoEXT.Buffer vertexInputs(@NativeType("VkPipelineRobustnessBufferBehaviorEXT") int value) { VkPipelineRobustnessCreateInfoEXT.nvertexInputs(address(), value); return this; }
        /** Sets the specified value to the {@code images} field. */
        public VkPipelineRobustnessCreateInfoEXT.Buffer images(@NativeType("VkPipelineRobustnessImageBehaviorEXT") int value) { VkPipelineRobustnessCreateInfoEXT.nimages(address(), value); return this; }

    }

}
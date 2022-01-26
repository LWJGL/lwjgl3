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
 * Structure specifying a semaphore signal or wait operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>Whether this structure defines a semaphore wait or signal operation is defined by how it is used.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-geometryShader">geometry shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link VK13#VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-tessellationShader">tessellation shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link VK13#VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT} or {@link VK13#VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-conditionalRendering">conditional rendering</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-fragmentDensityMap">fragment density map</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-transformFeedback">transform feedback</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-meshShader">mesh shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV PIPELINE_STAGE_2_MESH_SHADER_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-taskShader">task shaders</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV PIPELINE_STAGE_2_TASK_SHADER_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-shadingRateImage">shading rate image</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-subpassShading">subpass shading</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link HUAWEISubpassShading#VK_PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI PIPELINE_STAGE_2_SUBPASS_SHADING_BIT_HUAWEI}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-invocationMask">invocation mask image</a> feature is not enabled, {@code stageMask} <b>must</b> not contain {@link HUAWEIInvocationMask#VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI}</li>
 * <li>If the {@code device} that {@code semaphore} was created on is not a device group, {@code deviceIndex} <b>must</b> be 0</li>
 * <li>If the {@code device} that {@code semaphore} was created on is a device group, {@code deviceIndex} <b>must</b> be a valid device index</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
 * <li>{@code stageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkSubmitInfo2}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSemaphoreSubmitInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSemaphore {@link #semaphore};
 *     uint64_t {@link #value};
 *     VkPipelineStageFlags2 {@link #stageMask};
 *     uint32_t {@link #deviceIndex};
 * }</code></pre>
 */
public class VkSemaphoreSubmitInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SEMAPHORE,
        VALUE,
        STAGEMASK,
        DEVICEINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SEMAPHORE = layout.offsetof(2);
        VALUE = layout.offsetof(3);
        STAGEMASK = layout.offsetof(4);
        DEVICEINDEX = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkSemaphoreSubmitInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSemaphoreSubmitInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkSemaphore} affected by this operation. */
    @NativeType("VkSemaphore")
    public long semaphore() { return nsemaphore(address()); }
    /** either the value used to signal {@code semaphore} or the value waited on by {@code semaphore}, if {@code semaphore} is a timeline semaphore. Otherwise it is ignored. */
    @NativeType("uint64_t")
    public long value() { return nvalue(address()); }
    /** a {@code VkPipelineStageFlags2} mask of pipeline stages which limit the first synchronization scope of a semaphore signal operation, or second synchronization scope of a semaphore wait operation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-semaphores-waiting">semaphore wait operation</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-semaphores-signaling">semaphore signal operation</a> sections of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization">the synchronization chapter</a>. */
    @NativeType("VkPipelineStageFlags2")
    public long stageMask() { return nstageMask(address()); }
    /** the index of the device within a device group that executes the semaphore wait or signal operation. */
    @NativeType("uint32_t")
    public int deviceIndex() { return ndeviceIndex(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSemaphoreSubmitInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO} value to the {@link #sType} field. */
    public VkSemaphoreSubmitInfo sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSemaphoreSubmitInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #semaphore} field. */
    public VkSemaphoreSubmitInfo semaphore(@NativeType("VkSemaphore") long value) { nsemaphore(address(), value); return this; }
    /** Sets the specified value to the {@link #value} field. */
    public VkSemaphoreSubmitInfo value(@NativeType("uint64_t") long value) { nvalue(address(), value); return this; }
    /** Sets the specified value to the {@link #stageMask} field. */
    public VkSemaphoreSubmitInfo stageMask(@NativeType("VkPipelineStageFlags2") long value) { nstageMask(address(), value); return this; }
    /** Sets the specified value to the {@link #deviceIndex} field. */
    public VkSemaphoreSubmitInfo deviceIndex(@NativeType("uint32_t") int value) { ndeviceIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSemaphoreSubmitInfo set(
        int sType,
        long pNext,
        long semaphore,
        long value,
        long stageMask,
        int deviceIndex
    ) {
        sType(sType);
        pNext(pNext);
        semaphore(semaphore);
        value(value);
        stageMask(stageMask);
        deviceIndex(deviceIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSemaphoreSubmitInfo set(VkSemaphoreSubmitInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSemaphoreSubmitInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSemaphoreSubmitInfo malloc() {
        return wrap(VkSemaphoreSubmitInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSemaphoreSubmitInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSemaphoreSubmitInfo calloc() {
        return wrap(VkSemaphoreSubmitInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSemaphoreSubmitInfo} instance allocated with {@link BufferUtils}. */
    public static VkSemaphoreSubmitInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSemaphoreSubmitInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSemaphoreSubmitInfo} instance for the specified memory address. */
    public static VkSemaphoreSubmitInfo create(long address) {
        return wrap(VkSemaphoreSubmitInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSemaphoreSubmitInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkSemaphoreSubmitInfo.class, address);
    }

    /**
     * Returns a new {@link VkSemaphoreSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreSubmitInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSemaphoreSubmitInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSemaphoreSubmitInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkSemaphoreSubmitInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreSubmitInfo malloc(MemoryStack stack) {
        return wrap(VkSemaphoreSubmitInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSemaphoreSubmitInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreSubmitInfo calloc(MemoryStack stack) {
        return wrap(VkSemaphoreSubmitInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSemaphoreSubmitInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreSubmitInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSemaphoreSubmitInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSemaphoreSubmitInfo.PNEXT); }
    /** Unsafe version of {@link #semaphore}. */
    public static long nsemaphore(long struct) { return UNSAFE.getLong(null, struct + VkSemaphoreSubmitInfo.SEMAPHORE); }
    /** Unsafe version of {@link #value}. */
    public static long nvalue(long struct) { return UNSAFE.getLong(null, struct + VkSemaphoreSubmitInfo.VALUE); }
    /** Unsafe version of {@link #stageMask}. */
    public static long nstageMask(long struct) { return UNSAFE.getLong(null, struct + VkSemaphoreSubmitInfo.STAGEMASK); }
    /** Unsafe version of {@link #deviceIndex}. */
    public static int ndeviceIndex(long struct) { return UNSAFE.getInt(null, struct + VkSemaphoreSubmitInfo.DEVICEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSemaphoreSubmitInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSemaphoreSubmitInfo.PNEXT, value); }
    /** Unsafe version of {@link #semaphore(long) semaphore}. */
    public static void nsemaphore(long struct, long value) { UNSAFE.putLong(null, struct + VkSemaphoreSubmitInfo.SEMAPHORE, value); }
    /** Unsafe version of {@link #value(long) value}. */
    public static void nvalue(long struct, long value) { UNSAFE.putLong(null, struct + VkSemaphoreSubmitInfo.VALUE, value); }
    /** Unsafe version of {@link #stageMask(long) stageMask}. */
    public static void nstageMask(long struct, long value) { UNSAFE.putLong(null, struct + VkSemaphoreSubmitInfo.STAGEMASK, value); }
    /** Unsafe version of {@link #deviceIndex(int) deviceIndex}. */
    public static void ndeviceIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkSemaphoreSubmitInfo.DEVICEINDEX, value); }

    // -----------------------------------

    /** An array of {@link VkSemaphoreSubmitInfo} structs. */
    public static class Buffer extends StructBuffer<VkSemaphoreSubmitInfo, Buffer> implements NativeResource {

        private static final VkSemaphoreSubmitInfo ELEMENT_FACTORY = VkSemaphoreSubmitInfo.create(-1L);

        /**
         * Creates a new {@code VkSemaphoreSubmitInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSemaphoreSubmitInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkSemaphoreSubmitInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSemaphoreSubmitInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSemaphoreSubmitInfo.nsType(address()); }
        /** @return the value of the {@link VkSemaphoreSubmitInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSemaphoreSubmitInfo.npNext(address()); }
        /** @return the value of the {@link VkSemaphoreSubmitInfo#semaphore} field. */
        @NativeType("VkSemaphore")
        public long semaphore() { return VkSemaphoreSubmitInfo.nsemaphore(address()); }
        /** @return the value of the {@link VkSemaphoreSubmitInfo#value} field. */
        @NativeType("uint64_t")
        public long value() { return VkSemaphoreSubmitInfo.nvalue(address()); }
        /** @return the value of the {@link VkSemaphoreSubmitInfo#stageMask} field. */
        @NativeType("VkPipelineStageFlags2")
        public long stageMask() { return VkSemaphoreSubmitInfo.nstageMask(address()); }
        /** @return the value of the {@link VkSemaphoreSubmitInfo#deviceIndex} field. */
        @NativeType("uint32_t")
        public int deviceIndex() { return VkSemaphoreSubmitInfo.ndeviceIndex(address()); }

        /** Sets the specified value to the {@link VkSemaphoreSubmitInfo#sType} field. */
        public VkSemaphoreSubmitInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkSemaphoreSubmitInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO} value to the {@link VkSemaphoreSubmitInfo#sType} field. */
        public VkSemaphoreSubmitInfo.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO); }
        /** Sets the specified value to the {@link VkSemaphoreSubmitInfo#pNext} field. */
        public VkSemaphoreSubmitInfo.Buffer pNext(@NativeType("void const *") long value) { VkSemaphoreSubmitInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkSemaphoreSubmitInfo#semaphore} field. */
        public VkSemaphoreSubmitInfo.Buffer semaphore(@NativeType("VkSemaphore") long value) { VkSemaphoreSubmitInfo.nsemaphore(address(), value); return this; }
        /** Sets the specified value to the {@link VkSemaphoreSubmitInfo#value} field. */
        public VkSemaphoreSubmitInfo.Buffer value(@NativeType("uint64_t") long value) { VkSemaphoreSubmitInfo.nvalue(address(), value); return this; }
        /** Sets the specified value to the {@link VkSemaphoreSubmitInfo#stageMask} field. */
        public VkSemaphoreSubmitInfo.Buffer stageMask(@NativeType("VkPipelineStageFlags2") long value) { VkSemaphoreSubmitInfo.nstageMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkSemaphoreSubmitInfo#deviceIndex} field. */
        public VkSemaphoreSubmitInfo.Buffer deviceIndex(@NativeType("uint32_t") int value) { VkSemaphoreSubmitInfo.ndeviceIndex(address(), value); return this; }

    }

}
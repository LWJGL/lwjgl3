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
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-geometryShader">geometry shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-tessellationShader">tessellation shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR} or {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-conditionalRendering">conditional rendering</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-fragmentDensityMap">fragment density map</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-transformFeedback">transform feedback</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-meshShader">mesh shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV PIPELINE_STAGE_2_MESH_SHADER_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-taskShader">task shaders</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV PIPELINE_STAGE_2_TASK_SHADER_BIT_NV}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-shadingRateImage">shading rate image</a> feature is not enabled, pname:{stageMaskName} <b>must</b> not contain {@link KHRSynchronization2#VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV}</li>
 * <li>If the {@code device} that {@code semaphore} was created on is not a device group, {@code deviceIndex} <b>must</b> be 0</li>
 * <li>If the {@code device} that {@code semaphore} was created on is a device group, {@code deviceIndex} <b>must</b> be a valid device index</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSynchronization2#VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO_KHR STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
 * <li>{@code stageMask} <b>must</b> be a valid combination of {@code VkPipelineStageFlagBits2KHR} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkSubmitInfo2KHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to a structure extending this structure.</li>
 * <li>{@code semaphore} &ndash; a {@code VkSemaphore} affected by this operation.</li>
 * <li>{@code value} &ndash; either the value used to signal {@code semaphore} or the value waited on by {@code semaphore}, if {@code semaphore} is a timeline semaphore. Otherwise it is ignored.</li>
 * <li>{@code stageMask} &ndash; a {@code VkPipelineStageFlags2KHR} mask of pipeline stages at which the semaphore either waits or is signaled.</li>
 * <li>{@code deviceIndex} &ndash; the index of the device within a device group that executes the semaphore wait or signal operation.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSemaphoreSubmitInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSemaphore semaphore;
 *     uint64_t value;
 *     VkPipelineStageFlags2KHR stageMask;
 *     uint32_t deviceIndex;
 * }</code></pre>
 */
public class VkSemaphoreSubmitInfoKHR extends Struct implements NativeResource {

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
            __member(4),
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
     * Creates a {@code VkSemaphoreSubmitInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSemaphoreSubmitInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code semaphore} field. */
    @NativeType("VkSemaphore")
    public long semaphore() { return nsemaphore(address()); }
    /** Returns the value of the {@code value} field. */
    @NativeType("uint64_t")
    public long value() { return nvalue(address()); }
    /** Returns the value of the {@code stageMask} field. */
    @NativeType("VkPipelineStageFlags2KHR")
    public int stageMask() { return nstageMask(address()); }
    /** Returns the value of the {@code deviceIndex} field. */
    @NativeType("uint32_t")
    public int deviceIndex() { return ndeviceIndex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSemaphoreSubmitInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSemaphoreSubmitInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code semaphore} field. */
    public VkSemaphoreSubmitInfoKHR semaphore(@NativeType("VkSemaphore") long value) { nsemaphore(address(), value); return this; }
    /** Sets the specified value to the {@code value} field. */
    public VkSemaphoreSubmitInfoKHR value(@NativeType("uint64_t") long value) { nvalue(address(), value); return this; }
    /** Sets the specified value to the {@code stageMask} field. */
    public VkSemaphoreSubmitInfoKHR stageMask(@NativeType("VkPipelineStageFlags2KHR") int value) { nstageMask(address(), value); return this; }
    /** Sets the specified value to the {@code deviceIndex} field. */
    public VkSemaphoreSubmitInfoKHR deviceIndex(@NativeType("uint32_t") int value) { ndeviceIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSemaphoreSubmitInfoKHR set(
        int sType,
        long pNext,
        long semaphore,
        long value,
        int stageMask,
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
    public VkSemaphoreSubmitInfoKHR set(VkSemaphoreSubmitInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSemaphoreSubmitInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSemaphoreSubmitInfoKHR malloc() {
        return wrap(VkSemaphoreSubmitInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSemaphoreSubmitInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSemaphoreSubmitInfoKHR calloc() {
        return wrap(VkSemaphoreSubmitInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSemaphoreSubmitInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkSemaphoreSubmitInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSemaphoreSubmitInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSemaphoreSubmitInfoKHR} instance for the specified memory address. */
    public static VkSemaphoreSubmitInfoKHR create(long address) {
        return wrap(VkSemaphoreSubmitInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSemaphoreSubmitInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkSemaphoreSubmitInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkSemaphoreSubmitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreSubmitInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreSubmitInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSemaphoreSubmitInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSemaphoreSubmitInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkSemaphoreSubmitInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSemaphoreSubmitInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkSemaphoreSubmitInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSemaphoreSubmitInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkSemaphoreSubmitInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreSubmitInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkSemaphoreSubmitInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSemaphoreSubmitInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreSubmitInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkSemaphoreSubmitInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSemaphoreSubmitInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSemaphoreSubmitInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSemaphoreSubmitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreSubmitInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSubmitInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSemaphoreSubmitInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSemaphoreSubmitInfoKHR.PNEXT); }
    /** Unsafe version of {@link #semaphore}. */
    public static long nsemaphore(long struct) { return UNSAFE.getLong(null, struct + VkSemaphoreSubmitInfoKHR.SEMAPHORE); }
    /** Unsafe version of {@link #value}. */
    public static long nvalue(long struct) { return UNSAFE.getLong(null, struct + VkSemaphoreSubmitInfoKHR.VALUE); }
    /** Unsafe version of {@link #stageMask}. */
    public static int nstageMask(long struct) { return UNSAFE.getInt(null, struct + VkSemaphoreSubmitInfoKHR.STAGEMASK); }
    /** Unsafe version of {@link #deviceIndex}. */
    public static int ndeviceIndex(long struct) { return UNSAFE.getInt(null, struct + VkSemaphoreSubmitInfoKHR.DEVICEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSemaphoreSubmitInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSemaphoreSubmitInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #semaphore(long) semaphore}. */
    public static void nsemaphore(long struct, long value) { UNSAFE.putLong(null, struct + VkSemaphoreSubmitInfoKHR.SEMAPHORE, value); }
    /** Unsafe version of {@link #value(long) value}. */
    public static void nvalue(long struct, long value) { UNSAFE.putLong(null, struct + VkSemaphoreSubmitInfoKHR.VALUE, value); }
    /** Unsafe version of {@link #stageMask(int) stageMask}. */
    public static void nstageMask(long struct, int value) { UNSAFE.putInt(null, struct + VkSemaphoreSubmitInfoKHR.STAGEMASK, value); }
    /** Unsafe version of {@link #deviceIndex(int) deviceIndex}. */
    public static void ndeviceIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkSemaphoreSubmitInfoKHR.DEVICEINDEX, value); }

    // -----------------------------------

    /** An array of {@link VkSemaphoreSubmitInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkSemaphoreSubmitInfoKHR, Buffer> implements NativeResource {

        private static final VkSemaphoreSubmitInfoKHR ELEMENT_FACTORY = VkSemaphoreSubmitInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkSemaphoreSubmitInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSemaphoreSubmitInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSemaphoreSubmitInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSemaphoreSubmitInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSemaphoreSubmitInfoKHR.npNext(address()); }
        /** Returns the value of the {@code semaphore} field. */
        @NativeType("VkSemaphore")
        public long semaphore() { return VkSemaphoreSubmitInfoKHR.nsemaphore(address()); }
        /** Returns the value of the {@code value} field. */
        @NativeType("uint64_t")
        public long value() { return VkSemaphoreSubmitInfoKHR.nvalue(address()); }
        /** Returns the value of the {@code stageMask} field. */
        @NativeType("VkPipelineStageFlags2KHR")
        public int stageMask() { return VkSemaphoreSubmitInfoKHR.nstageMask(address()); }
        /** Returns the value of the {@code deviceIndex} field. */
        @NativeType("uint32_t")
        public int deviceIndex() { return VkSemaphoreSubmitInfoKHR.ndeviceIndex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSemaphoreSubmitInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSemaphoreSubmitInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSemaphoreSubmitInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkSemaphoreSubmitInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code semaphore} field. */
        public VkSemaphoreSubmitInfoKHR.Buffer semaphore(@NativeType("VkSemaphore") long value) { VkSemaphoreSubmitInfoKHR.nsemaphore(address(), value); return this; }
        /** Sets the specified value to the {@code value} field. */
        public VkSemaphoreSubmitInfoKHR.Buffer value(@NativeType("uint64_t") long value) { VkSemaphoreSubmitInfoKHR.nvalue(address(), value); return this; }
        /** Sets the specified value to the {@code stageMask} field. */
        public VkSemaphoreSubmitInfoKHR.Buffer stageMask(@NativeType("VkPipelineStageFlags2KHR") int value) { VkSemaphoreSubmitInfoKHR.nstageMask(address(), value); return this; }
        /** Sets the specified value to the {@code deviceIndex} field. */
        public VkSemaphoreSubmitInfoKHR.Buffer deviceIndex(@NativeType("uint32_t") int value) { VkSemaphoreSubmitInfoKHR.ndeviceIndex(address(), value); return this; }

    }

}
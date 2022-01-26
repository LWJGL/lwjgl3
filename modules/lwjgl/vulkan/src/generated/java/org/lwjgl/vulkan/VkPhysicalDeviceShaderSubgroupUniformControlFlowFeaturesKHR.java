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
 * Structure describing support for shader subgroup uniform control flow by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDevicePrivateDataFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDevicePrivateDataFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRShaderSubgroupUniformControlFlow#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_UNIFORM_CONTROL_FLOW_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_UNIFORM_CONTROL_FLOW_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 {@link #shaderSubgroupUniformControlFlow};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERSUBGROUPUNIFORMCONTROLFLOW;

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
        SHADERSUBGROUPUNIFORMCONTROLFLOW = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR(ByteBuffer container) {
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
    /** specifies whether the implementation supports the shader execution mode {@code SubgroupUniformControlFlowKHR} */
    @NativeType("VkBool32")
    public boolean shaderSubgroupUniformControlFlow() { return nshaderSubgroupUniformControlFlow(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRShaderSubgroupUniformControlFlow#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_UNIFORM_CONTROL_FLOW_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_UNIFORM_CONTROL_FLOW_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR sType$Default() { return sType(KHRShaderSubgroupUniformControlFlow.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_UNIFORM_CONTROL_FLOW_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderSubgroupUniformControlFlow} field. */
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR shaderSubgroupUniformControlFlow(@NativeType("VkBool32") boolean value) { nshaderSubgroupUniformControlFlow(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR set(
        int sType,
        long pNext,
        boolean shaderSubgroupUniformControlFlow
    ) {
        sType(sType);
        pNext(pNext);
        shaderSubgroupUniformControlFlow(shaderSubgroupUniformControlFlow);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR set(VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR malloc() {
        return wrap(VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR calloc() {
        return wrap(VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR create(long address) {
        return wrap(VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #shaderSubgroupUniformControlFlow}. */
    public static int nshaderSubgroupUniformControlFlow(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.SHADERSUBGROUPUNIFORMCONTROLFLOW); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #shaderSubgroupUniformControlFlow(boolean) shaderSubgroupUniformControlFlow}. */
    public static void nshaderSubgroupUniformControlFlow(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.SHADERSUBGROUPUNIFORMCONTROLFLOW, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR#shaderSubgroupUniformControlFlow} field. */
        @NativeType("VkBool32")
        public boolean shaderSubgroupUniformControlFlow() { return VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.nshaderSubgroupUniformControlFlow(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRShaderSubgroupUniformControlFlow#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_UNIFORM_CONTROL_FLOW_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_UNIFORM_CONTROL_FLOW_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.Buffer sType$Default() { return sType(KHRShaderSubgroupUniformControlFlow.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_UNIFORM_CONTROL_FLOW_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR#shaderSubgroupUniformControlFlow} field. */
        public VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.Buffer shaderSubgroupUniformControlFlow(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR.nshaderSubgroupUniformControlFlow(address(), value ? 1 : 0); return this; }

    }

}
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
 * Structure describing whether subgroup rotation is enabled.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRShaderSubgroupRotate#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #shaderSubgroupRotate};
 *     VkBool32 {@link #shaderSubgroupRotateClustered};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR extends Struct<VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERSUBGROUPROTATE,
        SHADERSUBGROUPROTATECLUSTERED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERSUBGROUPROTATE = layout.offsetof(2);
        SHADERSUBGROUPROTATECLUSTERED = layout.offsetof(3);
    }

    protected VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(ByteBuffer container) {
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
    /** specifies whether shader modules <b>can</b> declare the {@code GroupNonUniformRotateKHR} capability. */
    @NativeType("VkBool32")
    public boolean shaderSubgroupRotate() { return nshaderSubgroupRotate(address()) != 0; }
    /** specifies whether shader modules <b>can</b> use the {@code ClusterSize} operand to {@code OpGroupNonUniformRotateKHR}. */
    @NativeType("VkBool32")
    public boolean shaderSubgroupRotateClustered() { return nshaderSubgroupRotateClustered(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRShaderSubgroupRotate#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR sType$Default() { return sType(KHRShaderSubgroupRotate.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderSubgroupRotate} field. */
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR shaderSubgroupRotate(@NativeType("VkBool32") boolean value) { nshaderSubgroupRotate(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderSubgroupRotateClustered} field. */
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR shaderSubgroupRotateClustered(@NativeType("VkBool32") boolean value) { nshaderSubgroupRotateClustered(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR set(
        int sType,
        long pNext,
        boolean shaderSubgroupRotate,
        boolean shaderSubgroupRotateClustered
    ) {
        sType(sType);
        pNext(pNext);
        shaderSubgroupRotate(shaderSubgroupRotate);
        shaderSubgroupRotateClustered(shaderSubgroupRotateClustered);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR set(VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR malloc() {
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR calloc() {
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #shaderSubgroupRotate}. */
    public static int nshaderSubgroupRotate(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.SHADERSUBGROUPROTATE); }
    /** Unsafe version of {@link #shaderSubgroupRotateClustered}. */
    public static int nshaderSubgroupRotateClustered(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.SHADERSUBGROUPROTATECLUSTERED); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #shaderSubgroupRotate(boolean) shaderSubgroupRotate}. */
    public static void nshaderSubgroupRotate(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.SHADERSUBGROUPROTATE, value); }
    /** Unsafe version of {@link #shaderSubgroupRotateClustered(boolean) shaderSubgroupRotateClustered}. */
    public static void nshaderSubgroupRotateClustered(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.SHADERSUBGROUPROTATECLUSTERED, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR#shaderSubgroupRotate} field. */
        @NativeType("VkBool32")
        public boolean shaderSubgroupRotate() { return VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.nshaderSubgroupRotate(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR#shaderSubgroupRotateClustered} field. */
        @NativeType("VkBool32")
        public boolean shaderSubgroupRotateClustered() { return VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.nshaderSubgroupRotateClustered(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR#sType} field. */
        public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRShaderSubgroupRotate#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES_KHR} value to the {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR#sType} field. */
        public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer sType$Default() { return sType(KHRShaderSubgroupRotate.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR#pNext} field. */
        public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR#shaderSubgroupRotate} field. */
        public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer shaderSubgroupRotate(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.nshaderSubgroupRotate(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR#shaderSubgroupRotateClustered} field. */
        public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.Buffer shaderSubgroupRotateClustered(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.nshaderSubgroupRotateClustered(address(), value ? 1 : 0); return this; }

    }

}
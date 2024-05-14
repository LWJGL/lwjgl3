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
 * Structure describing support for shader maximal reconvergence by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDevicePrivateDataFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDevicePrivateDataFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRShaderMaximalReconvergence#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MAXIMAL_RECONVERGENCE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MAXIMAL_RECONVERGENCE_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #shaderMaximalReconvergence};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR extends Struct<VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERMAXIMALRECONVERGENCE;

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
        SHADERMAXIMALRECONVERGENCE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(ByteBuffer container) {
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
    /** specifies whether the implementation supports the shader execution mode {@code MaximallyReconvergesKHR} */
    @NativeType("VkBool32")
    public boolean shaderMaximalReconvergence() { return nshaderMaximalReconvergence(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRShaderMaximalReconvergence#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MAXIMAL_RECONVERGENCE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MAXIMAL_RECONVERGENCE_FEATURES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR sType$Default() { return sType(KHRShaderMaximalReconvergence.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MAXIMAL_RECONVERGENCE_FEATURES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderMaximalReconvergence} field. */
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR shaderMaximalReconvergence(@NativeType("VkBool32") boolean value) { nshaderMaximalReconvergence(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR set(
        int sType,
        long pNext,
        boolean shaderMaximalReconvergence
    ) {
        sType(sType);
        pNext(pNext);
        shaderMaximalReconvergence(shaderMaximalReconvergence);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR set(VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR malloc() {
        return new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR calloc() {
        return new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #shaderMaximalReconvergence}. */
    public static int nshaderMaximalReconvergence(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.SHADERMAXIMALRECONVERGENCE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #shaderMaximalReconvergence(boolean) shaderMaximalReconvergence}. */
    public static void nshaderMaximalReconvergence(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.SHADERMAXIMALRECONVERGENCE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR#shaderMaximalReconvergence} field. */
        @NativeType("VkBool32")
        public boolean shaderMaximalReconvergence() { return VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.nshaderMaximalReconvergence(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR#sType} field. */
        public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRShaderMaximalReconvergence#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MAXIMAL_RECONVERGENCE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MAXIMAL_RECONVERGENCE_FEATURES_KHR} value to the {@link VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR#sType} field. */
        public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.Buffer sType$Default() { return sType(KHRShaderMaximalReconvergence.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MAXIMAL_RECONVERGENCE_FEATURES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR#pNext} field. */
        public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR#shaderMaximalReconvergence} field. */
        public VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.Buffer shaderMaximalReconvergence(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderMaximalReconvergenceFeaturesKHR.nshaderMaximalReconvergence(address(), value ? 1 : 0); return this; }

    }

}
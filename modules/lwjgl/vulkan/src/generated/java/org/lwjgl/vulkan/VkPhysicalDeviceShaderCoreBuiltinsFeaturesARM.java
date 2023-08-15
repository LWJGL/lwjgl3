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
 * Structure describing the shader core builtins features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link ARMShaderCoreBuiltins#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_FEATURES_ARM}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #shaderCoreBuiltins};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM extends Struct<VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERCOREBUILTINS;

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
        SHADERCOREBUILTINS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(ByteBuffer container) {
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
    /** indicates whether the implementation supports the SPIR-V {@code CoreBuiltinsARM} capability. */
    @NativeType("VkBool32")
    public boolean shaderCoreBuiltins() { return nshaderCoreBuiltins(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMShaderCoreBuiltins#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_FEATURES_ARM} value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM sType$Default() { return sType(ARMShaderCoreBuiltins.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_FEATURES_ARM); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderCoreBuiltins} field. */
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM shaderCoreBuiltins(@NativeType("VkBool32") boolean value) { nshaderCoreBuiltins(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM set(
        int sType,
        long pNext,
        boolean shaderCoreBuiltins
    ) {
        sType(sType);
        pNext(pNext);
        shaderCoreBuiltins(shaderCoreBuiltins);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM set(VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM malloc() {
        return new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM calloc() {
        return new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM create(long address) {
        return new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.PNEXT); }
    /** Unsafe version of {@link #shaderCoreBuiltins}. */
    public static int nshaderCoreBuiltins(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.SHADERCOREBUILTINS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.PNEXT, value); }
    /** Unsafe version of {@link #shaderCoreBuiltins(boolean) shaderCoreBuiltins}. */
    public static void nshaderCoreBuiltins(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.SHADERCOREBUILTINS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM ELEMENT_FACTORY = VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM#shaderCoreBuiltins} field. */
        @NativeType("VkBool32")
        public boolean shaderCoreBuiltins() { return VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.nshaderCoreBuiltins(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM#sType} field. */
        public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMShaderCoreBuiltins#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_FEATURES_ARM} value to the {@link VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM#sType} field. */
        public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.Buffer sType$Default() { return sType(ARMShaderCoreBuiltins.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_FEATURES_ARM); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM#pNext} field. */
        public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM#shaderCoreBuiltins} field. */
        public VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.Buffer shaderCoreBuiltins(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM.nshaderCoreBuiltins(address(), value ? 1 : 0); return this; }

    }

}
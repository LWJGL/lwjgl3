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
 * Structure describing the extended types subgroups support feature for an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #shaderSubgroupExtendedTypes};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERSUBGROUPEXTENDEDTYPES;

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
        SHADERSUBGROUPEXTENDEDTYPES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a boolean specifying whether subgroup operations can use 8-bit integer, 16-bit integer, 64-bit integer, 16-bit floating-point, and vectors of these types in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-group-operations">group operations</a> with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-scope-subgroup">subgroup scope</a>, if the implementation supports the types. */
    @NativeType("VkBool32")
    public boolean shaderSubgroupExtendedTypes() { return nshaderSubgroupExtendedTypes(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderSubgroupExtendedTypes} field. */
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures shaderSubgroupExtendedTypes(@NativeType("VkBool32") boolean value) { nshaderSubgroupExtendedTypes(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures set(
        int sType,
        long pNext,
        boolean shaderSubgroupExtendedTypes
    ) {
        sType(sType);
        pNext(pNext);
        shaderSubgroupExtendedTypes(shaderSubgroupExtendedTypes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures set(VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures malloc() {
        return wrap(VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures calloc() {
        return wrap(VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures create(long address) {
        return wrap(VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.PNEXT); }
    /** Unsafe version of {@link #shaderSubgroupExtendedTypes}. */
    public static int nshaderSubgroupExtendedTypes(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.SHADERSUBGROUPEXTENDEDTYPES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.PNEXT, value); }
    /** Unsafe version of {@link #shaderSubgroupExtendedTypes(boolean) shaderSubgroupExtendedTypes}. */
    public static void nshaderSubgroupExtendedTypes(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.SHADERSUBGROUPEXTENDEDTYPES, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures ELEMENT_FACTORY = VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures#shaderSubgroupExtendedTypes} field. */
        @NativeType("VkBool32")
        public boolean shaderSubgroupExtendedTypes() { return VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.nshaderSubgroupExtendedTypes(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures#sType} field. */
        public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES} value to the {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures#sType} field. */
        public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures#pNext} field. */
        public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures#shaderSubgroupExtendedTypes} field. */
        public VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.Buffer shaderSubgroupExtendedTypes(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures.nshaderSubgroupExtendedTypes(address(), value ? 1 : 0); return this; }

    }

}
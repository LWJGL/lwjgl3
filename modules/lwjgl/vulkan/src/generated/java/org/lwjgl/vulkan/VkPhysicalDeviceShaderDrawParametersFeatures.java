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
 * Structure describing shader draw parameter features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderDrawParametersFeatures} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceShaderDrawParametersFeatures} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderDrawParametersFeatures {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #shaderDrawParameters};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderDrawParametersFeatures extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERDRAWPARAMETERS;

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
        SHADERDRAWPARAMETERS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderDrawParametersFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderDrawParametersFeatures(ByteBuffer container) {
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
    /** specifies whether the implementation supports the SPIR-V {@code DrawParameters} capability. When this feature is not enabled, shader modules <b>must</b> not declare the {@code SPV_KHR_shader_draw_parameters} extension or the {@code DrawParameters} capability. */
    @NativeType("VkBool32")
    public boolean shaderDrawParameters() { return nshaderDrawParameters(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderDrawParametersFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderDrawParametersFeatures sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderDrawParametersFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderDrawParameters} field. */
    public VkPhysicalDeviceShaderDrawParametersFeatures shaderDrawParameters(@NativeType("VkBool32") boolean value) { nshaderDrawParameters(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderDrawParametersFeatures set(
        int sType,
        long pNext,
        boolean shaderDrawParameters
    ) {
        sType(sType);
        pNext(pNext);
        shaderDrawParameters(shaderDrawParameters);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderDrawParametersFeatures set(VkPhysicalDeviceShaderDrawParametersFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderDrawParametersFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderDrawParametersFeatures malloc() {
        return wrap(VkPhysicalDeviceShaderDrawParametersFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderDrawParametersFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderDrawParametersFeatures calloc() {
        return wrap(VkPhysicalDeviceShaderDrawParametersFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderDrawParametersFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderDrawParametersFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceShaderDrawParametersFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderDrawParametersFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderDrawParametersFeatures create(long address) {
        return wrap(VkPhysicalDeviceShaderDrawParametersFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderDrawParametersFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceShaderDrawParametersFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderDrawParametersFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDrawParametersFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderDrawParametersFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDrawParametersFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderDrawParametersFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDrawParametersFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderDrawParametersFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDrawParametersFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderDrawParametersFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderDrawParametersFeatures mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderDrawParametersFeatures callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderDrawParametersFeatures mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderDrawParametersFeatures callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderDrawParametersFeatures.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderDrawParametersFeatures.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderDrawParametersFeatures.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderDrawParametersFeatures.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderDrawParametersFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderDrawParametersFeatures malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderDrawParametersFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderDrawParametersFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderDrawParametersFeatures calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderDrawParametersFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderDrawParametersFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDrawParametersFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderDrawParametersFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderDrawParametersFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderDrawParametersFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderDrawParametersFeatures.PNEXT); }
    /** Unsafe version of {@link #shaderDrawParameters}. */
    public static int nshaderDrawParameters(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderDrawParametersFeatures.SHADERDRAWPARAMETERS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderDrawParametersFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderDrawParametersFeatures.PNEXT, value); }
    /** Unsafe version of {@link #shaderDrawParameters(boolean) shaderDrawParameters}. */
    public static void nshaderDrawParameters(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderDrawParametersFeatures.SHADERDRAWPARAMETERS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderDrawParametersFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderDrawParametersFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderDrawParametersFeatures ELEMENT_FACTORY = VkPhysicalDeviceShaderDrawParametersFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderDrawParametersFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderDrawParametersFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceShaderDrawParametersFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderDrawParametersFeatures#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderDrawParametersFeatures.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderDrawParametersFeatures#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderDrawParametersFeatures.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderDrawParametersFeatures#shaderDrawParameters} field. */
        @NativeType("VkBool32")
        public boolean shaderDrawParameters() { return VkPhysicalDeviceShaderDrawParametersFeatures.nshaderDrawParameters(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderDrawParametersFeatures#sType} field. */
        public VkPhysicalDeviceShaderDrawParametersFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderDrawParametersFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES} value to the {@link VkPhysicalDeviceShaderDrawParametersFeatures#sType} field. */
        public VkPhysicalDeviceShaderDrawParametersFeatures.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_DRAW_PARAMETERS_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderDrawParametersFeatures#pNext} field. */
        public VkPhysicalDeviceShaderDrawParametersFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderDrawParametersFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderDrawParametersFeatures#shaderDrawParameters} field. */
        public VkPhysicalDeviceShaderDrawParametersFeatures.Buffer shaderDrawParameters(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderDrawParametersFeatures.nshaderDrawParameters(address(), value ? 1 : 0); return this; }

    }

}
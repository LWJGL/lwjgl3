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
 * Structure describing shader SM Builtins properties supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderSMBuiltinsPropertiesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVShaderSmBuiltins#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderSMBuiltinsPropertiesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #shaderSMCount};
 *     uint32_t {@link #shaderWarpsPerSM};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderSMBuiltinsPropertiesNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERSMCOUNT,
        SHADERWARPSPERSM;

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
        SHADERSMCOUNT = layout.offsetof(2);
        SHADERWARPSPERSM = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderSMBuiltinsPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(ByteBuffer container) {
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
    /** the number of SMs on the device. */
    @NativeType("uint32_t")
    public int shaderSMCount() { return nshaderSMCount(address()); }
    /** the maximum number of simultaneously executing warps on an SM. */
    @NativeType("uint32_t")
    public int shaderWarpsPerSM() { return nshaderWarpsPerSM(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVShaderSmBuiltins#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV sType$Default() { return sType(NVShaderSmBuiltins.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV set(VkPhysicalDeviceShaderSMBuiltinsPropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderSMBuiltinsPropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV malloc() {
        return wrap(VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSMBuiltinsPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV calloc() {
        return wrap(VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSMBuiltinsPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderSMBuiltinsPropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV create(long address) {
        return wrap(VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderSMBuiltinsPropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderSMBuiltinsPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #shaderSMCount}. */
    public static int nshaderSMCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.SHADERSMCOUNT); }
    /** Unsafe version of {@link #shaderWarpsPerSM}. */
    public static int nshaderWarpsPerSM(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.SHADERWARPSPERSM); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderSMBuiltinsPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderSMBuiltinsPropertiesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderSMBuiltinsPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderSMBuiltinsPropertiesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceShaderSMBuiltinsPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderSMBuiltinsPropertiesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderSMBuiltinsPropertiesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderSMBuiltinsPropertiesNV#shaderSMCount} field. */
        @NativeType("uint32_t")
        public int shaderSMCount() { return VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.nshaderSMCount(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderSMBuiltinsPropertiesNV#shaderWarpsPerSM} field. */
        @NativeType("uint32_t")
        public int shaderWarpsPerSM() { return VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.nshaderWarpsPerSM(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderSMBuiltinsPropertiesNV#sType} field. */
        public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVShaderSmBuiltins#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES_NV} value to the {@link VkPhysicalDeviceShaderSMBuiltinsPropertiesNV#sType} field. */
        public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.Buffer sType$Default() { return sType(NVShaderSmBuiltins.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderSMBuiltinsPropertiesNV#pNext} field. */
        public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.npNext(address(), value); return this; }

    }

}
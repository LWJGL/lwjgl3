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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying the parameters to create a CUDA Function.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVCudaKernelLaunch#VK_STRUCTURE_TYPE_CUDA_FUNCTION_CREATE_INFO_NV STRUCTURE_TYPE_CUDA_FUNCTION_CREATE_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code module} <b>must</b> be a valid {@code VkCudaModuleNV} handle</li>
 * <li>{@code pName} <b>must</b> be a null-terminated UTF-8 string</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVCudaKernelLaunch#vkCreateCudaFunctionNV CreateCudaFunctionNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCudaFunctionCreateInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkCudaModuleNV {@link #module};
 *     char const * {@link #pName};
 * }</code></pre>
 */
public class VkCudaFunctionCreateInfoNV extends Struct<VkCudaFunctionCreateInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MODULE,
        PNAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MODULE = layout.offsetof(2);
        PNAME = layout.offsetof(3);
    }

    protected VkCudaFunctionCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCudaFunctionCreateInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkCudaFunctionCreateInfoNV(address, container);
    }

    /**
     * Creates a {@code VkCudaFunctionCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCudaFunctionCreateInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the CUDA {@code VkCudaModuleNV} module in which the function resides. */
    @NativeType("VkCudaModuleNV")
    public long module() { return nmodule(address()); }
    /** a null-terminated UTF-8 string containing the name of the shader entry point for this stage. */
    @NativeType("char const *")
    public ByteBuffer pName() { return npName(address()); }
    /** a null-terminated UTF-8 string containing the name of the shader entry point for this stage. */
    @NativeType("char const *")
    public String pNameString() { return npNameString(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCudaFunctionCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVCudaKernelLaunch#VK_STRUCTURE_TYPE_CUDA_FUNCTION_CREATE_INFO_NV STRUCTURE_TYPE_CUDA_FUNCTION_CREATE_INFO_NV} value to the {@link #sType} field. */
    public VkCudaFunctionCreateInfoNV sType$Default() { return sType(NVCudaKernelLaunch.VK_STRUCTURE_TYPE_CUDA_FUNCTION_CREATE_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCudaFunctionCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #module} field. */
    public VkCudaFunctionCreateInfoNV module(@NativeType("VkCudaModuleNV") long value) { nmodule(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #pName} field. */
    public VkCudaFunctionCreateInfoNV pName(@NativeType("char const *") ByteBuffer value) { npName(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCudaFunctionCreateInfoNV set(
        int sType,
        long pNext,
        long module,
        ByteBuffer pName
    ) {
        sType(sType);
        pNext(pNext);
        module(module);
        pName(pName);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCudaFunctionCreateInfoNV set(VkCudaFunctionCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCudaFunctionCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCudaFunctionCreateInfoNV malloc() {
        return new VkCudaFunctionCreateInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCudaFunctionCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCudaFunctionCreateInfoNV calloc() {
        return new VkCudaFunctionCreateInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCudaFunctionCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkCudaFunctionCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCudaFunctionCreateInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkCudaFunctionCreateInfoNV} instance for the specified memory address. */
    public static VkCudaFunctionCreateInfoNV create(long address) {
        return new VkCudaFunctionCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCudaFunctionCreateInfoNV createSafe(long address) {
        return address == NULL ? null : new VkCudaFunctionCreateInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkCudaFunctionCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCudaFunctionCreateInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCudaFunctionCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCudaFunctionCreateInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCudaFunctionCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCudaFunctionCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCudaFunctionCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCudaFunctionCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCudaFunctionCreateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCudaFunctionCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCudaFunctionCreateInfoNV malloc(MemoryStack stack) {
        return new VkCudaFunctionCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCudaFunctionCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCudaFunctionCreateInfoNV calloc(MemoryStack stack) {
        return new VkCudaFunctionCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCudaFunctionCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCudaFunctionCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCudaFunctionCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCudaFunctionCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCudaFunctionCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCudaFunctionCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #module}. */
    public static long nmodule(long struct) { return UNSAFE.getLong(null, struct + VkCudaFunctionCreateInfoNV.MODULE); }
    /** Unsafe version of {@link #pName}. */
    public static ByteBuffer npName(long struct) { return memByteBufferNT1(memGetAddress(struct + VkCudaFunctionCreateInfoNV.PNAME)); }
    /** Unsafe version of {@link #pNameString}. */
    public static String npNameString(long struct) { return memUTF8(memGetAddress(struct + VkCudaFunctionCreateInfoNV.PNAME)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCudaFunctionCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCudaFunctionCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #module(long) module}. */
    public static void nmodule(long struct, long value) { UNSAFE.putLong(null, struct + VkCudaFunctionCreateInfoNV.MODULE, value); }
    /** Unsafe version of {@link #pName(ByteBuffer) pName}. */
    public static void npName(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + VkCudaFunctionCreateInfoNV.PNAME, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkCudaFunctionCreateInfoNV.PNAME));
    }

    // -----------------------------------

    /** An array of {@link VkCudaFunctionCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkCudaFunctionCreateInfoNV, Buffer> implements NativeResource {

        private static final VkCudaFunctionCreateInfoNV ELEMENT_FACTORY = VkCudaFunctionCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkCudaFunctionCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCudaFunctionCreateInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCudaFunctionCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCudaFunctionCreateInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCudaFunctionCreateInfoNV.nsType(address()); }
        /** @return the value of the {@link VkCudaFunctionCreateInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCudaFunctionCreateInfoNV.npNext(address()); }
        /** @return the value of the {@link VkCudaFunctionCreateInfoNV#module} field. */
        @NativeType("VkCudaModuleNV")
        public long module() { return VkCudaFunctionCreateInfoNV.nmodule(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link VkCudaFunctionCreateInfoNV#pName} field. */
        @NativeType("char const *")
        public ByteBuffer pName() { return VkCudaFunctionCreateInfoNV.npName(address()); }
        /** @return the null-terminated string pointed to by the {@link VkCudaFunctionCreateInfoNV#pName} field. */
        @NativeType("char const *")
        public String pNameString() { return VkCudaFunctionCreateInfoNV.npNameString(address()); }

        /** Sets the specified value to the {@link VkCudaFunctionCreateInfoNV#sType} field. */
        public VkCudaFunctionCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkCudaFunctionCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVCudaKernelLaunch#VK_STRUCTURE_TYPE_CUDA_FUNCTION_CREATE_INFO_NV STRUCTURE_TYPE_CUDA_FUNCTION_CREATE_INFO_NV} value to the {@link VkCudaFunctionCreateInfoNV#sType} field. */
        public VkCudaFunctionCreateInfoNV.Buffer sType$Default() { return sType(NVCudaKernelLaunch.VK_STRUCTURE_TYPE_CUDA_FUNCTION_CREATE_INFO_NV); }
        /** Sets the specified value to the {@link VkCudaFunctionCreateInfoNV#pNext} field. */
        public VkCudaFunctionCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkCudaFunctionCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCudaFunctionCreateInfoNV#module} field. */
        public VkCudaFunctionCreateInfoNV.Buffer module(@NativeType("VkCudaModuleNV") long value) { VkCudaFunctionCreateInfoNV.nmodule(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link VkCudaFunctionCreateInfoNV#pName} field. */
        public VkCudaFunctionCreateInfoNV.Buffer pName(@NativeType("char const *") ByteBuffer value) { VkCudaFunctionCreateInfoNV.npName(address(), value); return this; }

    }

}
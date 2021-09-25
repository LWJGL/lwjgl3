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
 * Structure used to pass compilation control flags to a pipeline.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link AMDPipelineCompilerControl#VK_STRUCTURE_TYPE_PIPELINE_COMPILER_CONTROL_CREATE_INFO_AMD STRUCTURE_TYPE_PIPELINE_COMPILER_CONTROL_CREATE_INFO_AMD}</li>
 * <li>{@code compilerControlFlags} <b>must</b> be 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineCompilerControlCreateInfoAMD {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineCompilerControlFlagsAMD {@link #compilerControlFlags};
 * }</code></pre>
 */
public class VkPipelineCompilerControlCreateInfoAMD extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COMPILERCONTROLFLAGS;

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
        COMPILERCONTROLFLAGS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPipelineCompilerControlCreateInfoAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineCompilerControlCreateInfoAMD(ByteBuffer container) {
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
    /** a bitmask of {@code VkPipelineCompilerControlFlagBitsAMD} affecting how the pipeline will be compiled. */
    @NativeType("VkPipelineCompilerControlFlagsAMD")
    public int compilerControlFlags() { return ncompilerControlFlags(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineCompilerControlCreateInfoAMD sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDPipelineCompilerControl#VK_STRUCTURE_TYPE_PIPELINE_COMPILER_CONTROL_CREATE_INFO_AMD STRUCTURE_TYPE_PIPELINE_COMPILER_CONTROL_CREATE_INFO_AMD} value to the {@link #sType} field. */
    public VkPipelineCompilerControlCreateInfoAMD sType$Default() { return sType(AMDPipelineCompilerControl.VK_STRUCTURE_TYPE_PIPELINE_COMPILER_CONTROL_CREATE_INFO_AMD); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineCompilerControlCreateInfoAMD pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #compilerControlFlags} field. */
    public VkPipelineCompilerControlCreateInfoAMD compilerControlFlags(@NativeType("VkPipelineCompilerControlFlagsAMD") int value) { ncompilerControlFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineCompilerControlCreateInfoAMD set(
        int sType,
        long pNext,
        int compilerControlFlags
    ) {
        sType(sType);
        pNext(pNext);
        compilerControlFlags(compilerControlFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineCompilerControlCreateInfoAMD set(VkPipelineCompilerControlCreateInfoAMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineCompilerControlCreateInfoAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineCompilerControlCreateInfoAMD malloc() {
        return wrap(VkPipelineCompilerControlCreateInfoAMD.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineCompilerControlCreateInfoAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineCompilerControlCreateInfoAMD calloc() {
        return wrap(VkPipelineCompilerControlCreateInfoAMD.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineCompilerControlCreateInfoAMD} instance allocated with {@link BufferUtils}. */
    public static VkPipelineCompilerControlCreateInfoAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineCompilerControlCreateInfoAMD.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineCompilerControlCreateInfoAMD} instance for the specified memory address. */
    public static VkPipelineCompilerControlCreateInfoAMD create(long address) {
        return wrap(VkPipelineCompilerControlCreateInfoAMD.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineCompilerControlCreateInfoAMD createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineCompilerControlCreateInfoAMD.class, address);
    }

    /**
     * Returns a new {@link VkPipelineCompilerControlCreateInfoAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCompilerControlCreateInfoAMD.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCompilerControlCreateInfoAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCompilerControlCreateInfoAMD.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCompilerControlCreateInfoAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCompilerControlCreateInfoAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineCompilerControlCreateInfoAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineCompilerControlCreateInfoAMD.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineCompilerControlCreateInfoAMD.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineCompilerControlCreateInfoAMD mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineCompilerControlCreateInfoAMD callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineCompilerControlCreateInfoAMD mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineCompilerControlCreateInfoAMD callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineCompilerControlCreateInfoAMD.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineCompilerControlCreateInfoAMD.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineCompilerControlCreateInfoAMD.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineCompilerControlCreateInfoAMD.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineCompilerControlCreateInfoAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCompilerControlCreateInfoAMD malloc(MemoryStack stack) {
        return wrap(VkPipelineCompilerControlCreateInfoAMD.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineCompilerControlCreateInfoAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCompilerControlCreateInfoAMD calloc(MemoryStack stack) {
        return wrap(VkPipelineCompilerControlCreateInfoAMD.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineCompilerControlCreateInfoAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCompilerControlCreateInfoAMD.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCompilerControlCreateInfoAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCompilerControlCreateInfoAMD.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCompilerControlCreateInfoAMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineCompilerControlCreateInfoAMD.PNEXT); }
    /** Unsafe version of {@link #compilerControlFlags}. */
    public static int ncompilerControlFlags(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCompilerControlCreateInfoAMD.COMPILERCONTROLFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCompilerControlCreateInfoAMD.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineCompilerControlCreateInfoAMD.PNEXT, value); }
    /** Unsafe version of {@link #compilerControlFlags(int) compilerControlFlags}. */
    public static void ncompilerControlFlags(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCompilerControlCreateInfoAMD.COMPILERCONTROLFLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineCompilerControlCreateInfoAMD} structs. */
    public static class Buffer extends StructBuffer<VkPipelineCompilerControlCreateInfoAMD, Buffer> implements NativeResource {

        private static final VkPipelineCompilerControlCreateInfoAMD ELEMENT_FACTORY = VkPipelineCompilerControlCreateInfoAMD.create(-1L);

        /**
         * Creates a new {@code VkPipelineCompilerControlCreateInfoAMD.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineCompilerControlCreateInfoAMD#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineCompilerControlCreateInfoAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineCompilerControlCreateInfoAMD#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineCompilerControlCreateInfoAMD.nsType(address()); }
        /** @return the value of the {@link VkPipelineCompilerControlCreateInfoAMD#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineCompilerControlCreateInfoAMD.npNext(address()); }
        /** @return the value of the {@link VkPipelineCompilerControlCreateInfoAMD#compilerControlFlags} field. */
        @NativeType("VkPipelineCompilerControlFlagsAMD")
        public int compilerControlFlags() { return VkPipelineCompilerControlCreateInfoAMD.ncompilerControlFlags(address()); }

        /** Sets the specified value to the {@link VkPipelineCompilerControlCreateInfoAMD#sType} field. */
        public VkPipelineCompilerControlCreateInfoAMD.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineCompilerControlCreateInfoAMD.nsType(address(), value); return this; }
        /** Sets the {@link AMDPipelineCompilerControl#VK_STRUCTURE_TYPE_PIPELINE_COMPILER_CONTROL_CREATE_INFO_AMD STRUCTURE_TYPE_PIPELINE_COMPILER_CONTROL_CREATE_INFO_AMD} value to the {@link VkPipelineCompilerControlCreateInfoAMD#sType} field. */
        public VkPipelineCompilerControlCreateInfoAMD.Buffer sType$Default() { return sType(AMDPipelineCompilerControl.VK_STRUCTURE_TYPE_PIPELINE_COMPILER_CONTROL_CREATE_INFO_AMD); }
        /** Sets the specified value to the {@link VkPipelineCompilerControlCreateInfoAMD#pNext} field. */
        public VkPipelineCompilerControlCreateInfoAMD.Buffer pNext(@NativeType("void const *") long value) { VkPipelineCompilerControlCreateInfoAMD.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineCompilerControlCreateInfoAMD#compilerControlFlags} field. */
        public VkPipelineCompilerControlCreateInfoAMD.Buffer compilerControlFlags(@NativeType("VkPipelineCompilerControlFlagsAMD") int value) { VkPipelineCompilerControlCreateInfoAMD.ncompilerControlFlags(address(), value); return this; }

    }

}
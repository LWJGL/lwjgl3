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
 * Structure specifying vertex attributes assignment during instanced rendering.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVertexAttributeDivisor#VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_EXT}</li>
 * <li>{@code pVertexBindingDivisors} <b>must</b> be a valid pointer to an array of {@code vertexBindingDivisorCount} {@link VkVertexInputBindingDivisorDescriptionEXT} structures</li>
 * <li>{@code vertexBindingDivisorCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkVertexInputBindingDivisorDescriptionEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineVertexInputDivisorStateCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #vertexBindingDivisorCount};
 *     {@link VkVertexInputBindingDivisorDescriptionEXT VkVertexInputBindingDivisorDescriptionEXT} const * {@link #pVertexBindingDivisors};
 * }</code></pre>
 */
public class VkPipelineVertexInputDivisorStateCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VERTEXBINDINGDIVISORCOUNT,
        PVERTEXBINDINGDIVISORS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VERTEXBINDINGDIVISORCOUNT = layout.offsetof(2);
        PVERTEXBINDINGDIVISORS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPipelineVertexInputDivisorStateCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineVertexInputDivisorStateCreateInfoEXT(ByteBuffer container) {
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
    /** the number of elements in the {@code pVertexBindingDivisors} array. */
    @NativeType("uint32_t")
    public int vertexBindingDivisorCount() { return nvertexBindingDivisorCount(address()); }
    /** a pointer to an array of {@link VkVertexInputBindingDivisorDescriptionEXT} structures specifying the divisor value for each binding. */
    @NativeType("VkVertexInputBindingDivisorDescriptionEXT const *")
    public VkVertexInputBindingDivisorDescriptionEXT.Buffer pVertexBindingDivisors() { return npVertexBindingDivisors(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineVertexInputDivisorStateCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVertexAttributeDivisor#VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkPipelineVertexInputDivisorStateCreateInfoEXT sType$Default() { return sType(EXTVertexAttributeDivisor.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineVertexInputDivisorStateCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkVertexInputBindingDivisorDescriptionEXT.Buffer} to the {@link #pVertexBindingDivisors} field. */
    public VkPipelineVertexInputDivisorStateCreateInfoEXT pVertexBindingDivisors(@NativeType("VkVertexInputBindingDivisorDescriptionEXT const *") VkVertexInputBindingDivisorDescriptionEXT.Buffer value) { npVertexBindingDivisors(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineVertexInputDivisorStateCreateInfoEXT set(
        int sType,
        long pNext,
        VkVertexInputBindingDivisorDescriptionEXT.Buffer pVertexBindingDivisors
    ) {
        sType(sType);
        pNext(pNext);
        pVertexBindingDivisors(pVertexBindingDivisors);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineVertexInputDivisorStateCreateInfoEXT set(VkPipelineVertexInputDivisorStateCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT malloc() {
        return wrap(VkPipelineVertexInputDivisorStateCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT calloc() {
        return wrap(VkPipelineVertexInputDivisorStateCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineVertexInputDivisorStateCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT create(long address) {
        return wrap(VkPipelineVertexInputDivisorStateCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineVertexInputDivisorStateCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineVertexInputDivisorStateCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineVertexInputDivisorStateCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineVertexInputDivisorStateCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineVertexInputDivisorStateCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkPipelineVertexInputDivisorStateCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineVertexInputDivisorStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkPipelineVertexInputDivisorStateCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineVertexInputDivisorStateCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineVertexInputDivisorStateCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #vertexBindingDivisorCount}. */
    public static int nvertexBindingDivisorCount(long struct) { return UNSAFE.getInt(null, struct + VkPipelineVertexInputDivisorStateCreateInfoEXT.VERTEXBINDINGDIVISORCOUNT); }
    /** Unsafe version of {@link #pVertexBindingDivisors}. */
    public static VkVertexInputBindingDivisorDescriptionEXT.Buffer npVertexBindingDivisors(long struct) { return VkVertexInputBindingDivisorDescriptionEXT.create(memGetAddress(struct + VkPipelineVertexInputDivisorStateCreateInfoEXT.PVERTEXBINDINGDIVISORS), nvertexBindingDivisorCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineVertexInputDivisorStateCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineVertexInputDivisorStateCreateInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code vertexBindingDivisorCount} field of the specified {@code struct}. */
    public static void nvertexBindingDivisorCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineVertexInputDivisorStateCreateInfoEXT.VERTEXBINDINGDIVISORCOUNT, value); }
    /** Unsafe version of {@link #pVertexBindingDivisors(VkVertexInputBindingDivisorDescriptionEXT.Buffer) pVertexBindingDivisors}. */
    public static void npVertexBindingDivisors(long struct, VkVertexInputBindingDivisorDescriptionEXT.Buffer value) { memPutAddress(struct + VkPipelineVertexInputDivisorStateCreateInfoEXT.PVERTEXBINDINGDIVISORS, value.address()); nvertexBindingDivisorCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkPipelineVertexInputDivisorStateCreateInfoEXT.PVERTEXBINDINGDIVISORS));
    }

    // -----------------------------------

    /** An array of {@link VkPipelineVertexInputDivisorStateCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineVertexInputDivisorStateCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkPipelineVertexInputDivisorStateCreateInfoEXT ELEMENT_FACTORY = VkPipelineVertexInputDivisorStateCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineVertexInputDivisorStateCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineVertexInputDivisorStateCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineVertexInputDivisorStateCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineVertexInputDivisorStateCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkPipelineVertexInputDivisorStateCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineVertexInputDivisorStateCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkPipelineVertexInputDivisorStateCreateInfoEXT#vertexBindingDivisorCount} field. */
        @NativeType("uint32_t")
        public int vertexBindingDivisorCount() { return VkPipelineVertexInputDivisorStateCreateInfoEXT.nvertexBindingDivisorCount(address()); }
        /** @return a {@link VkVertexInputBindingDivisorDescriptionEXT.Buffer} view of the struct array pointed to by the {@link VkPipelineVertexInputDivisorStateCreateInfoEXT#pVertexBindingDivisors} field. */
        @NativeType("VkVertexInputBindingDivisorDescriptionEXT const *")
        public VkVertexInputBindingDivisorDescriptionEXT.Buffer pVertexBindingDivisors() { return VkPipelineVertexInputDivisorStateCreateInfoEXT.npVertexBindingDivisors(address()); }

        /** Sets the specified value to the {@link VkPipelineVertexInputDivisorStateCreateInfoEXT#sType} field. */
        public VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineVertexInputDivisorStateCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVertexAttributeDivisor#VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_EXT} value to the {@link VkPipelineVertexInputDivisorStateCreateInfoEXT#sType} field. */
        public VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer sType$Default() { return sType(EXTVertexAttributeDivisor.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkPipelineVertexInputDivisorStateCreateInfoEXT#pNext} field. */
        public VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineVertexInputDivisorStateCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkVertexInputBindingDivisorDescriptionEXT.Buffer} to the {@link VkPipelineVertexInputDivisorStateCreateInfoEXT#pVertexBindingDivisors} field. */
        public VkPipelineVertexInputDivisorStateCreateInfoEXT.Buffer pVertexBindingDivisors(@NativeType("VkVertexInputBindingDivisorDescriptionEXT const *") VkVertexInputBindingDivisorDescriptionEXT.Buffer value) { VkPipelineVertexInputDivisorStateCreateInfoEXT.npVertexBindingDivisors(address(), value); return this; }

    }

}
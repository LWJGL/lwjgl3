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
 * Structure specifying an identifier for a shader module.
 * 
 * <h5>Description</h5>
 * 
 * <p>Any identifier <b>can</b> be used. If the pipeline being created with identifier requires compilation to complete the pipeline creation call, pipeline compilation <b>must</b> fail as defined by {@link VK13#VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT}.</p>
 * 
 * <p>{@code pIdentifier} and {@code identifierSize} <b>can</b> be obtained from an {@link VkShaderModuleIdentifierEXT} queried earlier.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If this structure is included in a {@code pNext} chain and {@code identifierSize} is not equal to 0, the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderModuleIdentifier">{@code shaderModuleIdentifier}</a> feature <b>must</b> be enabled</li>
 * <li>If this struct is included in a {@code pNext} chain of {@link VkPipelineShaderStageCreateInfo} and {@code identifierSize} is not equal to 0, the pipeline <b>must</b> be created with the {@link VK13#VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT} flag set</li>
 * <li>{@code identifierSize} <b>must</b> be less-or-equal to {@link EXTShaderModuleIdentifier#VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTShaderModuleIdentifier#VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT}</li>
 * <li>If {@code identifierSize} is not 0, {@code pIdentifier} <b>must</b> be a valid pointer to an array of {@code identifierSize} {@code uint8_t} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineShaderStageModuleIdentifierCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #identifierSize};
 *     uint8_t const * {@link #pIdentifier};
 * }</code></pre>
 */
public class VkPipelineShaderStageModuleIdentifierCreateInfoEXT extends Struct<VkPipelineShaderStageModuleIdentifierCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IDENTIFIERSIZE,
        PIDENTIFIER;

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
        IDENTIFIERSIZE = layout.offsetof(2);
        PIDENTIFIER = layout.offsetof(3);
    }

    protected VkPipelineShaderStageModuleIdentifierCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineShaderStageModuleIdentifierCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkPipelineShaderStageModuleIdentifierCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT(ByteBuffer container) {
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
    /** the size, in bytes, of the buffer pointed to by {@code pIdentifier}. */
    @NativeType("uint32_t")
    public int identifierSize() { return nidentifierSize(address()); }
    /** a pointer to a buffer of opaque data specifying an identifier. */
    @Nullable
    @NativeType("uint8_t const *")
    public ByteBuffer pIdentifier() { return npIdentifier(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTShaderModuleIdentifier#VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT sType$Default() { return sType(EXTShaderModuleIdentifier.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #pIdentifier} field. */
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT pIdentifier(@Nullable @NativeType("uint8_t const *") ByteBuffer value) { npIdentifier(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT set(
        int sType,
        long pNext,
        @Nullable ByteBuffer pIdentifier
    ) {
        sType(sType);
        pNext(pNext);
        pIdentifier(pIdentifier);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT set(VkPipelineShaderStageModuleIdentifierCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineShaderStageModuleIdentifierCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT malloc() {
        return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineShaderStageModuleIdentifierCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT calloc() {
        return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineShaderStageModuleIdentifierCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineShaderStageModuleIdentifierCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT create(long address) {
        return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageModuleIdentifierCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageModuleIdentifierCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageModuleIdentifierCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineShaderStageModuleIdentifierCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineShaderStageModuleIdentifierCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineShaderStageModuleIdentifierCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageModuleIdentifierCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageModuleIdentifierCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineShaderStageModuleIdentifierCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineShaderStageModuleIdentifierCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #identifierSize}. */
    public static int nidentifierSize(long struct) { return UNSAFE.getInt(null, struct + VkPipelineShaderStageModuleIdentifierCreateInfoEXT.IDENTIFIERSIZE); }
    /** Unsafe version of {@link #pIdentifier() pIdentifier}. */
    @Nullable public static ByteBuffer npIdentifier(long struct) { return memByteBufferSafe(memGetAddress(struct + VkPipelineShaderStageModuleIdentifierCreateInfoEXT.PIDENTIFIER), nidentifierSize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineShaderStageModuleIdentifierCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineShaderStageModuleIdentifierCreateInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code identifierSize} field of the specified {@code struct}. */
    public static void nidentifierSize(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineShaderStageModuleIdentifierCreateInfoEXT.IDENTIFIERSIZE, value); }
    /** Unsafe version of {@link #pIdentifier(ByteBuffer) pIdentifier}. */
    public static void npIdentifier(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + VkPipelineShaderStageModuleIdentifierCreateInfoEXT.PIDENTIFIER, memAddressSafe(value)); nidentifierSize(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nidentifierSize(struct) != 0) {
            check(memGetAddress(struct + VkPipelineShaderStageModuleIdentifierCreateInfoEXT.PIDENTIFIER));
        }
    }

    // -----------------------------------

    /** An array of {@link VkPipelineShaderStageModuleIdentifierCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineShaderStageModuleIdentifierCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkPipelineShaderStageModuleIdentifierCreateInfoEXT ELEMENT_FACTORY = VkPipelineShaderStageModuleIdentifierCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineShaderStageModuleIdentifierCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineShaderStageModuleIdentifierCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineShaderStageModuleIdentifierCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineShaderStageModuleIdentifierCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineShaderStageModuleIdentifierCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkPipelineShaderStageModuleIdentifierCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineShaderStageModuleIdentifierCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkPipelineShaderStageModuleIdentifierCreateInfoEXT#identifierSize} field. */
        @NativeType("uint32_t")
        public int identifierSize() { return VkPipelineShaderStageModuleIdentifierCreateInfoEXT.nidentifierSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link VkPipelineShaderStageModuleIdentifierCreateInfoEXT#pIdentifier} field. */
        @Nullable
        @NativeType("uint8_t const *")
        public ByteBuffer pIdentifier() { return VkPipelineShaderStageModuleIdentifierCreateInfoEXT.npIdentifier(address()); }

        /** Sets the specified value to the {@link VkPipelineShaderStageModuleIdentifierCreateInfoEXT#sType} field. */
        public VkPipelineShaderStageModuleIdentifierCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineShaderStageModuleIdentifierCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTShaderModuleIdentifier#VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT} value to the {@link VkPipelineShaderStageModuleIdentifierCreateInfoEXT#sType} field. */
        public VkPipelineShaderStageModuleIdentifierCreateInfoEXT.Buffer sType$Default() { return sType(EXTShaderModuleIdentifier.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkPipelineShaderStageModuleIdentifierCreateInfoEXT#pNext} field. */
        public VkPipelineShaderStageModuleIdentifierCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineShaderStageModuleIdentifierCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link VkPipelineShaderStageModuleIdentifierCreateInfoEXT#pIdentifier} field. */
        public VkPipelineShaderStageModuleIdentifierCreateInfoEXT.Buffer pIdentifier(@Nullable @NativeType("uint8_t const *") ByteBuffer value) { VkPipelineShaderStageModuleIdentifierCreateInfoEXT.npIdentifier(address(), value); return this; }

    }

}